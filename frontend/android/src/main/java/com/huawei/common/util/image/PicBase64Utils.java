package com.huawei.common.util.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class PicBase64Utils {
    public static final String BASE64_HEADER_JPG = "data:image/jpg;base64,";
    public static final String BASE64_HEADER_PNG = "data:image/png;base64,";
    public static final String FILE_PROVIDER = ".common.fileProvider";
    private static final int component2 = 1000;
    private static final String component3 = "PicBase64Utils";

    public static String encodeString(Context context, Uri uri) {
        return encodeString(context, uri, 1000);
    }

    public static String encodeString(Context context, Uri uri, int i) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                int iShareDataUIState = ShareDataUIState(context, uri);
                L.d(component3, "encodeString: degree: " + iShareDataUIState);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                if (iShareDataUIState != 0) {
                    bitmapDecodeStream = rotateBitmapByDegree(bitmapDecodeStream, iShareDataUIState);
                }
                String strCompressImageToBase64 = compressImageToBase64(bitmapDecodeStream, i);
                CloseUtils.closeIO(inputStreamOpenInputStream);
                return strCompressImageToBase64;
            } catch (FileNotFoundException e) {
                L.d(component3, "encodeString: " + e.getMessage());
                CloseUtils.closeIO(inputStreamOpenInputStream);
                return "";
            }
        } catch (Throwable th) {
            CloseUtils.closeIO(inputStreamOpenInputStream);
            throw th;
        }
    }

    public static String compressImageToBase64(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int i2 = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                while (i2 > 0) {
                    L.d(component3, "compressImageToBase64 baos size: " + (byteArrayOutputStream.toByteArray().length / 1024));
                    String strComponent3 = component3(byteArrayOutputStream, i);
                    if (strComponent3 == null) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                        i2 = i2 > 10 ? i2 - 10 : i2 - 1;
                    } else {
                        CloseUtils.closeIO(byteArrayOutputStream);
                        return strComponent3;
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                L.d(component3, "compressImageToBase64 last baos size: " + (byteArray.length / 1024));
                String str = "data:image/jpg;base64," + Base64.encodeToString(byteArray, 2);
                L.d(component3, "compressImageToBase64 last base64 size: " + (str.getBytes(StandardCharsets.US_ASCII).length / 1024));
                CloseUtils.closeIO(byteArrayOutputStream);
                return str;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    private static String component3(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (byteArrayOutputStream.toByteArray().length / 1024 > i) {
            return null;
        }
        String str = "data:image/jpg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        int length = str.getBytes(StandardCharsets.US_ASCII).length / 1024;
        L.d(component3, "getBase64NoMoreThanSize base64 size: " + length);
        if (length <= i) {
            return str;
        }
        return null;
    }

    public static String encodeImage(Bitmap bitmap) {
        return encodeImage(bitmap, Bitmap.CompressFormat.JPEG);
    }

    public static String encodeImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(compressFormat, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                L.d(component3, "encodeImage baos size: " + (byteArray.length / 1024));
                String str = "data:image/jpg;base64," + Base64.encodeToString(byteArray, 2);
                L.d(component3, "encodeImage base64 size: " + (str.getBytes(StandardCharsets.US_ASCII).length / 1024));
                CloseUtils.closeIO(byteArrayOutputStream);
                return str;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static Bitmap decodeToBitmap(String str) {
        String strReplace = "";
        if (str.startsWith("data:image/jpg;base64,")) {
            strReplace = str.replace("data:image/jpg;base64,", "");
        } else if (str.startsWith("data:image/png;base64,")) {
            strReplace = str.replace("data:image/png;base64,", "");
        }
        try {
            byte[] bArrDecode = Base64.decode(strReplace, 2);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            L.d(component3, "decodeToBitmap: " + e.getMessage());
            return null;
        }
    }

    public static Bitmap compressImage(Bitmap bitmap) {
        return compressImage(bitmap, 1000);
    }

    public static Bitmap compressImage(Bitmap bitmap, int i) throws Throwable {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                int i2 = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                while (byteArrayOutputStream2.toByteArray().length / 1024 > i) {
                    byteArrayOutputStream2.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream2);
                    i2 -= 10;
                }
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream2.toByteArray());
                try {
                    L.d(component3, "compressImage last baos size: " + (byteArrayOutputStream2.toByteArray().length / 1024));
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(byteArrayInputStream, null, null);
                    CloseUtils.closeIO(byteArrayOutputStream2, byteArrayInputStream);
                    return bitmapDecodeStream;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    CloseUtils.closeIO(byteArrayOutputStream, byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
        }
    }

    public static void compressAndSaveImage(Bitmap bitmap, String str, int i) {
        try {
            File parentFile = new File(str).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (i <= 0) {
                i = 1000;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        int i2 = 100;
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        while (byteArrayOutputStream.toByteArray().length / 1024 > i) {
                            L.d(component3, "compressAndSaveImage: " + (("data:image/jpg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)).getBytes(StandardCharsets.UTF_8).length / 1024));
                            byteArrayOutputStream.reset();
                            i2 += -10;
                            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                        }
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.close();
                        fileOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                L.e(component3, "compressAndGenImage: " + e.getMessage());
            }
        } catch (Exception e2) {
            L.e(component3, "compressAndSaveImage: " + e2.getMessage());
        }
    }

    public static Uri fileToUri(File file) {
        if (file == null) {
            return null;
        }
        return FileProvider.getUriForFile(Utils.getApp(), Utils.getApp().getPackageName() + FILE_PROVIDER, file);
    }

    public static Bitmap rotateBitmapByDegree(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError e) {
            L.w(component3, "rotateBitmapByDegree err", e);
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap;
        }
        if (bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private static int ShareDataUIState(Context context, Uri uri) {
        try {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                    int i = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180;
                    CloseUtils.closeIO(inputStreamOpenInputStream);
                    return i;
                }
                CloseUtils.closeIO(inputStreamOpenInputStream);
                return 0;
            } catch (IOException e) {
                L.d(component3, "getBitmapDegree err: " + e.getMessage());
                CloseUtils.closeIO(null);
                return 0;
            }
        } catch (Throwable th) {
            CloseUtils.closeIO(null);
            throw th;
        }
        CloseUtils.closeIO(null);
        throw th;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
