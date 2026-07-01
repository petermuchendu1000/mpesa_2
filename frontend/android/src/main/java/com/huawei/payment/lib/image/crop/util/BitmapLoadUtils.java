package com.huawei.payment.lib.image.crop.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import com.blankj.utilcode.util.CloseUtils;
import com.huawei.common.util.L;
import com.huawei.payment.lib.image.crop.callback.BitmapLoadCallback;
import com.huawei.payment.lib.image.crop.task.BitmapLoadTask;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public class BitmapLoadUtils {
    private static final String copydefault = "content";

    public static int exifToDegrees(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    public static void decodeBitmapInBackground(Context context, Uri uri, Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        new BitmapLoadTask(context, uri, uri2, i, i2, bitmapLoadCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static Bitmap transformBitmap(Bitmap bitmap, Matrix matrix) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(bitmapCreateBitmap) ? bitmapCreateBitmap : bitmap;
        } catch (OutOfMemoryError e) {
            L.e(e.getMessage());
            return bitmap;
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    public static int calculateMaxBitmapSize(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        int maxTextureSize = EglUtils.getMaxTextureSize();
        return maxTextureSize > 0 ? Math.min(iSqrt, maxTextureSize) : iSqrt;
    }

    public static int getExifOrientation(Context context, Uri uri) {
        int orientation = 0;
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (IOException e) {
                Log.d("BitmapLoadUtils", e.getMessage());
            }
            if (inputStreamOpenInputStream == null) {
                return 0;
            }
            orientation = new ImageHeaderParser(inputStreamOpenInputStream).getOrientation();
            return orientation;
        } finally {
            close(inputStreamOpenInputStream);
        }
    }

    public static void copyFile(Context context, Uri uri, Uri uri2) throws Throwable {
        Throwable th;
        FileChannel fileChannel;
        InputStream inputStreamOpenInputStream;
        OutputStream outputStream;
        if (uri.equals(uri2)) {
            return;
        }
        FileChannel channel = null;
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                try {
                    if ((inputStreamOpenInputStream instanceof FileInputStream) && (outputStreamOpenOutputStream instanceof FileOutputStream)) {
                        FileChannel channel2 = ((FileInputStream) inputStreamOpenInputStream).getChannel();
                        try {
                            channel = ((FileOutputStream) outputStreamOpenOutputStream).getChannel();
                            channel2.transferTo(0L, channel2.size(), channel);
                            CloseUtils.closeIO(channel2, channel, inputStreamOpenInputStream, outputStreamOpenOutputStream);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = outputStreamOpenOutputStream;
                            fileChannel = channel;
                            channel = channel2;
                            CloseUtils.closeIO(channel, fileChannel, inputStreamOpenInputStream, outputStream);
                            throw th;
                        }
                    }
                    throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStreamOpenOutputStream;
                    fileChannel = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
                outputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileChannel = null;
            inputStreamOpenInputStream = null;
            outputStream = null;
        }
    }

    public static boolean hasContentScheme(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
