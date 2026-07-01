package com.huawei.digitalpayment.consumer.scan.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils;
import java.io.File;

public class PhotoUtils {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    public static Context context = Utils.getApp();
    private static int copydefault = 1;

    static {
        int i = component2 + 115;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PhotoUtils() {
    }

    public static File getImageDir() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Context context2 = context;
        if (i3 != 0) {
            return context2.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        }
        int i4 = 70 / 0;
        return context2.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    public static String getParentDirPath() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        File imageDir = getImageDir();
        if (i3 == 0) {
            return imageDir.getAbsolutePath();
        }
        imageDir.getAbsolutePath();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void openPic(Activity activity, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            int i3 = copydefault + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            activity.startActivityForResult(intent, i);
            int i5 = copydefault + 13;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static void openQRPic(Activity activity, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        activity.startActivityForResult(intent, i);
        int i3 = component1 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void takePicture(Activity activity, Uri uri, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent();
        intent.addFlags(1);
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            int i3 = copydefault + 49;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            intent.putExtra(TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, uri);
            activity.startActivityForResult(intent, i);
        }
        int i5 = component1 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void openQRPic(Fragment fragment, int i) {
        int i2 = 2 % 2;
        fragment.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), i);
        int i3 = component1 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static Bitmap getBitmapFromUri(Uri uri, Context context2) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                return MediaStore.Images.Media.getBitmap(context2.getContentResolver(), uri);
            }
            MediaStore.Images.Media.getBitmap(context2.getContentResolver(), uri);
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[PHI: r9
  0x00b3: PHI (r9v4 java.lang.String[]) = (r9v3 java.lang.String[]), (r9v10 java.lang.String[]) binds: [B:22:0x00b1, B:19:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[PHI: r1 r9
  0x00b6: PHI (r1v15 java.lang.String) = (r1v13 java.lang.String), (r1v20 java.lang.String) binds: [B:22:0x00b1, B:19:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r9v8 java.lang.String[]) = (r9v3 java.lang.String[]), (r9v10 java.lang.String[]) binds: [B:22:0x00b1, B:19:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getPath(android.content.Context r8, android.net.Uri r9) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.getPath(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[PHI: r12
  0x003a: PHI (r12v3 android.database.Cursor) = (r12v2 android.database.Cursor), (r12v7 android.database.Cursor) binds: [B:12:0x0038, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String ShareDataUIState(android.content.Context r12, android.net.Uri r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.component1
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            java.lang.String r4 = "_data"
            r5 = 1
            if (r1 != 0) goto L28
            java.lang.String[] r8 = new java.lang.String[r5]
            r8[r5] = r4
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L26
            r11 = 0
            r7 = r13
            r9 = r14
            r10 = r15
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L26
            if (r12 == 0) goto L63
            goto L3a
        L26:
            r12 = move-exception
            goto L7b
        L28:
            java.lang.String[] r7 = new java.lang.String[r5]
            r7[r2] = r4
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L26
            r10 = 0
            r6 = r13
            r8 = r14
            r9 = r15
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L26
            if (r12 == 0) goto L63
        L3a:
            int r13 = com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.copydefault
            int r13 = r13 + 101
            int r14 = r13 % 128
            com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.component1 = r14
            int r13 = r13 % r0
            boolean r13 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L60
            if (r13 == 0) goto L63
            int r13 = r12.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = r12.getString(r13)     // Catch: java.lang.Throwable -> L60
            if (r12 == 0) goto L5f
            int r14 = com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.copydefault
            int r14 = r14 + 53
            int r15 = r14 % 128
            com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.component1 = r15
            int r14 = r14 % r0
            r12.close()
        L5f:
            return r13
        L60:
            r13 = move-exception
            r3 = r12
            goto L7c
        L63:
            if (r12 == 0) goto L7a
            int r13 = com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.copydefault
            int r13 = r13 + 19
            int r14 = r13 % 128
            com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.component1 = r14
            int r13 = r13 % r0
            if (r13 == 0) goto L77
            r12.close()
            r12 = 85
            int r12 = r12 / r2
            goto L7a
        L77:
            r12.close()
        L7a:
            return r3
        L7b:
            r13 = r12
        L7c:
            if (r3 == 0) goto L81
            r3.close()
        L81:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.utils.PhotoUtils.ShareDataUIState(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    private static boolean component3(Uri uri) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = "com.android.externalstorage.documents".equals(uri.getAuthority());
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = component1 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean ShareDataUIState(Uri uri) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String authority = uri.getAuthority();
        if (i3 != 0) {
            return "com.android.providers.downloads.documents".equals(authority);
        }
        "com.android.providers.downloads.documents".equals(authority);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean component2(Uri uri) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = "com.android.providers.media.documents".equals(uri.getAuthority());
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return zEquals;
    }

    static int component3(BitmapFactory.Options options, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            ImageUtils.calculateInSampleSize(options, i, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iCalculateInSampleSize = ImageUtils.calculateInSampleSize(options, i, i2);
        int i5 = copydefault + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return iCalculateInSampleSize;
    }

    public static Bitmap compressImage(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Bitmap bitmapCompressImage = PicBase64Utils.compressImage(bitmap);
        int i4 = component1 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return bitmapCompressImage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Bitmap decodeImage(String str, int i, int i2) {
        int i3 = 2 % 2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int iComponent3 = component3(options, i, i2);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = iComponent3;
        options2.inPurgeable = true;
        options2.inInputShareable = true;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options2);
        int i4 = copydefault + 13;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return bitmapDecodeFile;
    }
}
