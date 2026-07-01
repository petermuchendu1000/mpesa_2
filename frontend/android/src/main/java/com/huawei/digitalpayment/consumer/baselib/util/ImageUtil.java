package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import coil.util.Utils;
import com.alibaba.griver.image.framework.utils.Format;
import com.huawei.common.util.L;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ImageUtil {
    private static final String ShareDataUIState = "Pictures";
    private static int component2 = 0;
    private static int component3 = 1;

    private ImageUtil() {
    }

    private static boolean component3() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = TextUtils.equals("mounted", Environment.getExternalStorageState());
        int i4 = component2 + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    public static boolean saveImageToGallery(Context context, Bitmap bitmap) throws Throwable {
        int i = 2 % 2;
        if (!component3()) {
            return false;
        }
        String str = System.currentTimeMillis() + "";
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = component3 + 109;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component3(context, bitmap, str);
        }
        boolean zShareDataUIState = ShareDataUIState(context, bitmap, str);
        int i4 = component3 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zShareDataUIState;
    }

    private static boolean component3(Context context, Bitmap bitmap, String str) {
        int i = 2 % 2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("description", str);
        contentValues.put("mime_type", Utils.MIME_TYPE_JPEG);
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "Pictures/");
        }
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                if (outputStreamOpenOutputStream == null) {
                    return true;
                }
                int i2 = component2 + 11;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                outputStreamOpenOutputStream.close();
                return true;
            } finally {
            }
        } catch (Exception e) {
            L.e(e.getMessage());
            return false;
        }
    }

    private static boolean ShareDataUIState(Context context, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        int i = 2 % 2;
        String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + ShareDataUIState;
        File file = new File(str2);
        if (!file.exists()) {
            int i2 = component3 + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            file.mkdirs();
            int i4 = component2 + 27;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        File file2 = new File(str2, str + Format.SUFFIX_JPG);
        FileOutputStream fileOutputStream2 = null;
        if (file2.exists()) {
            int i6 = component2 + 125;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                file2.delete();
                throw null;
            }
            file2.delete();
        }
        boolean z = false;
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    try {
                        boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        try {
                            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
                            fileOutputStream.flush();
                            try {
                                fileOutputStream.close();
                                return zCompress;
                            } catch (IOException e) {
                                e = e;
                                L.e(e.getMessage());
                                return zCompress;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            z = zCompress;
                            fileOutputStream2 = fileOutputStream;
                            L.e(e.getMessage());
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    zCompress = z;
                                    L.e(e.getMessage());
                                    return zCompress;
                                }
                            }
                            return z;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                L.e(e4.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
