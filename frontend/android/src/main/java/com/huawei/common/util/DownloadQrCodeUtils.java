package com.huawei.common.util;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import com.alibaba.griver.image.framework.utils.Format;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DownloadQrCodeUtils {
    private static final String component3 = "Pictures/" + Utils.getApp().getPackageName();

    public static void layoutView(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static boolean saveImageToGallery(Activity activity, Bitmap bitmap) {
        return saveImageToGallery(activity, System.currentTimeMillis() + Format.SUFFIX_JPG, bitmap);
    }

    public static boolean saveImageToGallery(Activity activity, String str, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 29) {
            return component1(activity, bitmap, str);
        }
        return copydefault(activity, bitmap, str);
    }

    public static Bitmap generateImageFromView(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static boolean component1(Context context, Bitmap bitmap, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("description", str);
        contentValues.put("mime_type", coil.util.Utils.MIME_TYPE_JPEG);
        contentValues.put("relative_path", component3 + "/");
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return true;
        }
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                if (outputStreamOpenOutputStream == null) {
                    return true;
                }
                outputStreamOpenOutputStream.close();
                return true;
            } finally {
            }
        } catch (IOException e) {
            L.d("=====", e.getMessage());
            return false;
        }
    }

    private static boolean copydefault(Context context, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean zCompress;
        String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + component3;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, str + Format.SUFFIX_JPG);
        if (file2.exists()) {
            file2.delete();
        }
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    try {
                        zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e) {
                                L.e(e.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                try {
                    context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
                    fileOutputStream.flush();
                    try {
                        fileOutputStream.close();
                        return zCompress;
                    } catch (IOException e3) {
                        e = e3;
                        L.e(e.getMessage());
                        return zCompress;
                    }
                } catch (IOException e4) {
                    e = e4;
                    z = zCompress;
                    fileOutputStream2 = fileOutputStream;
                    L.e(e.getMessage());
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e5) {
                            e = e5;
                            zCompress = z;
                            L.e(e.getMessage());
                            return zCompress;
                        }
                    }
                    return z;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }
}
