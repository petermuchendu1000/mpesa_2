package com.huawei.mobileapp.resourcelib;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CloseUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.file.FileDownloadUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class ResourceDownloader {
    private static final String ShareDataUIState = "ResourceDownloader";
    private static final byte[] $$c = {101, 74, 115, 66};
    private static final int $$f = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarHeader.LF_SYMLINK, -82, -81, 124, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 227;
    private static final byte[] $$a = {73, 121, -48, -56, 2, -10, 10};
    private static final int $$b = 64;
    private static int component2 = 0;
    private static int component3 = 1;
    private static char[] copydefault = {33517, 33462, 33460, 33457, 33459, 33414, 33506, 33422, 33460, 33467, 33463, 33462, 33466, 33460, 33423, 33429, 33461, 33464, 33465, 33426, 33432, 33460, 33460, 33466, 33433, 33364, 33371, 33375, 33375, 33375, 33440, 33373, 33448, 33446, 33370, 33440, 33446, 33329, 33323, 33323, 33295, 33289, 33328, 33327, 33324, 33292, 33286, 33323, 33329, 33325, 33326, 33330, 33323, 33285, 33305, 33336, 33325, 33328, 33327, 33327, 33327, 33323, 33519, 33461, 33457, 33456, 33458, 33464, 33457, 33471, 33516, 33465, 33459, 33468, 33412, 33459, 33451, 33452, 33455, 33470, 33465, 33451, 33461, 33459, 33292, 33299, 33293, 33303, 33377, 33296, 33296, 33298, 33296, 33293, 33293, 33294, 33302, 33299, 33285, 33295};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = com.huawei.mobileapp.resourcelib.ResourceDownloader.$$c
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r8 = 115 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceDownloader.$$g(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r0 = 4 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.huawei.mobileapp.resourcelib.ResourceDownloader.$$a
            int r5 = r5 * 3
            int r5 = 111 - r5
            byte[] r0 = new byte[r0]
            int r7 = 3 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceDownloader.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 9
            int r7 = r7 + 4
            byte[] r0 = com.huawei.mobileapp.resourcelib.ResourceDownloader.$$d
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r5 = 100 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r7]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            int r5 = r5 + (-27)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceDownloader.b(short, int, int, java.lang.Object[]):void");
    }

    public static void unzip(File file, File file2) throws IOException {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FileDownloadUtils.unzip(file, file2);
        int i4 = component2 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public FileDownloadUtils.Result innerDownload(String str, String str2, boolean z, FileDownloadUtils.DownloadProgress downloadProgress) throws Throwable {
        Closeable closeable;
        int i = 2 % 2;
        copydefault(downloadProgress, 2);
        Closeable closeable2 = null;
        try {
            InputStream inputStreamComponent1 = component1(str);
            try {
                File fileCopydefault = copydefault(str2, str);
                FileOutputStream fileOutputStream = new FileOutputStream(fileCopydefault);
                try {
                    byte[] bArr = new byte[1024];
                    long j = 0;
                    while (true) {
                        int i2 = inputStreamComponent1.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        int i3 = component3 + 33;
                        component2 = i3 % 128;
                        if (i3 % 2 != 0) {
                            fileOutputStream.write(bArr, 0, i2);
                            j += (long) i2;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                            j += (long) i2;
                        }
                        copydefault(downloadProgress, j);
                    }
                    copydefault(downloadProgress, 3);
                    L.e(ShareDataUIState, "download-finish");
                    if (z) {
                        unzip(fileCopydefault, new File(str2));
                        int i4 = component2 + 83;
                        component3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 4 % 4;
                        }
                    }
                    component1(downloadProgress);
                    FileDownloadUtils.Result result = new FileDownloadUtils.Result(true, "下载" + fileCopydefault.getName() + "成功");
                    CloseUtils.closeIO(inputStreamComponent1, fileOutputStream);
                    return result;
                } catch (Exception e) {
                    e = e;
                    closeable2 = fileOutputStream;
                    closeable = closeable2;
                    closeable2 = inputStreamComponent1;
                    try {
                        L.e(ShareDataUIState, e.toString());
                        component3(downloadProgress);
                        FileDownloadUtils.Result result2 = new FileDownloadUtils.Result(false, "下载失败：" + e.getMessage());
                        CloseUtils.closeIO(closeable2, closeable);
                        return result2;
                    } catch (Throwable th) {
                        th = th;
                        CloseUtils.closeIO(closeable2, closeable);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = fileOutputStream;
                    closeable = closeable2;
                    closeable2 = inputStreamComponent1;
                    CloseUtils.closeIO(closeable2, closeable);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            closeable = null;
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x023b, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0242, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0244, code lost:
    
        r0 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1342;
        r26 = 34 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        r1 = (char) (6425 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
        r2 = (byte) (com.huawei.mobileapp.resourcelib.ResourceDownloader.$$e & 5);
        r4 = (byte) (r2 + 2);
        r12 = new java.lang.Object[1];
        b(r2, r4, (byte) (r4 - 3), r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r26, r1, 1443979249, false, (java.lang.String) r12[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0288, code lost:
    
        ((java.lang.reflect.Field) r1).set(null, r14);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0295, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0297, code lost:
    
        r0 = 1342 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
        r26 = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 33;
        r1 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6425);
        r2 = (byte) (com.huawei.mobileapp.resourcelib.ResourceDownloader.$$e & 5);
        r4 = (byte) (r2 + 2);
        r12 = new java.lang.Object[1];
        b(r2, r4, (byte) (r4 - 3), r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r26, r1, 1443979249, false, (java.lang.String) r12[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e2, code lost:
    
        r2 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r1).get(null)};
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02f7, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02f9, code lost:
    
        r1 = 1342 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
        r26 = 34 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
        r0 = (char) (6425 - android.graphics.Color.alpha(0));
        r11 = new java.lang.Object[1];
        b(r9, r10, (byte) (r10 + 1), r11);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r26, r0, -181198845, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x033f, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0647, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0648, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x064c, code lost:
    
        if (r1 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x064e, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x064f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x063a  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.InputStream component1(java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceDownloader.component1(java.lang.String):java.io.InputStream");
    }

    private File copydefault(String str, String str2) throws IOException {
        int i = 2 % 2;
        String strSubstring = str2.substring(str2.lastIndexOf("/") + 1);
        new File(str).mkdirs();
        File file = new File(str, strSubstring);
        if (file.exists()) {
            int i2 = component3 + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            file.delete();
            int i4 = component2 + 95;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        file.createNewFile();
        return file;
    }

    static void ShareDataUIState(FileDownloadUtils.DownloadProgress downloadProgress, long j) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        downloadProgress.onProgress(j);
        int i4 = component3 + 1;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void copydefault(final FileDownloadUtils.DownloadProgress downloadProgress, final long j) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (downloadProgress != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public final void run() {
                    ResourceDownloader.ShareDataUIState(downloadProgress, j);
                }
            });
        }
        int i4 = component3 + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2(FileDownloadUtils.DownloadProgress downloadProgress, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        downloadProgress.onStatusChange(i);
        int i5 = component3 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void copydefault(final FileDownloadUtils.DownloadProgress downloadProgress, final int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 67;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (downloadProgress != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public final void run() {
                    ResourceDownloader.component2(downloadProgress, i);
                }
            });
        }
        int i4 = component2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void component1(final com.huawei.common.util.file.FileDownloadUtils.DownloadProgress r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.mobileapp.resourcelib.ResourceDownloader.component2
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.mobileapp.resourcelib.ResourceDownloader.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 87
            int r1 = r1 / 0
            if (r4 == 0) goto L2b
            goto L17
        L15:
            if (r4 == 0) goto L2b
        L17:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            java.util.Objects.requireNonNull(r4)
            com.huawei.mobileapp.resourcelib.ResourceDownloader$$ExternalSyntheticLambda0 r2 = new com.huawei.mobileapp.resourcelib.ResourceDownloader$$ExternalSyntheticLambda0
            r2.<init>()
            r1.post(r2)
        L2b:
            int r4 = com.huawei.mobileapp.resourcelib.ResourceDownloader.component2
            int r4 = r4 + 119
            int r1 = r4 % 128
            com.huawei.mobileapp.resourcelib.ResourceDownloader.component3 = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceDownloader.component1(com.huawei.common.util.file.FileDownloadUtils$DownloadProgress):void");
    }

    private void component3(final FileDownloadUtils.DownloadProgress downloadProgress) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (downloadProgress != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            Objects.requireNonNull(downloadProgress);
            handler.post(new Runnable() {
                @Override
                public final void run() {
                    downloadProgress.onFail();
                }
            });
        }
        int i4 = component2 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0201 -> B:54:0x01f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(boolean r23, int[] r24, byte[] r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceDownloader.c(boolean, int[], byte[], java.lang.Object[]):void");
    }

    private void ShareDataUIState(String str, String str2, FileDownloadUtils.DownloadProgress downloadProgress) throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        innerDownload(str, str2, true, downloadProgress);
        int i4 = component2 + 113;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void downloadWithProgress(final String str, final String str2, final FileDownloadUtils.DownloadProgress downloadProgress) {
        int i = 2 % 2;
        new Thread(new Runnable() {
            @Override
            public final void run() throws Throwable {
                ResourceDownloader.$r8$lambda$bkOY82SqxTSbwPXGiG4Jnh3q86k(this.f$0, str, str2, downloadProgress);
            }
        }).start();
        int i2 = component3 + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$bkOY82SqxTSbwPXGiG4Jnh3q86k(ResourceDownloader resourceDownloader, String str, String str2, FileDownloadUtils.DownloadProgress downloadProgress) throws Throwable {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        resourceDownloader.ShareDataUIState(str, str2, downloadProgress);
        int i4 = component2 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
