package com.huawei.digitalpayment.consumer.base.update;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/update/AppUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "appDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "getAppDatabase", "()Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "setAppDatabase", "(Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;)V", "onReceive", "", "context", "Landroid/content/Context;", IpcMessageConstants.EXTRA_INTENT, "Landroid/content/Intent;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class AppUpdateReceiver extends Hilt_AppUpdateReceiver {

    @Inject
    public AppDatabase appDatabase;
    private static final byte[] $$c = {115, -125, 45, -41};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {125, 44, 8, -98, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarHeader.LF_FIFO, -57, -4, -10, Ascii.FF, 2, 0, -19, 13, TarHeader.LF_FIFO, -52, -9, 58, -26, -31, -10, 8, -14, Ascii.DLE, -20, 10, -14, Ascii.DLE, Ascii.ETB, -35, 10, -2, -8, 71, -1, -34, -52, 3, Ascii.SO, -14, 3, Ascii.FF, -12, Ascii.CAN, -39, 10, -7, Ascii.VT, 2, -16, 10, 5, Ascii.SYN, -22, -13, 10, -3, 2, TarHeader.LF_NORMAL, -13, -2, -10, 20, -2, -2, 4, -21, 8, -9, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarHeader.LF_FIFO, -54, -16, -8, 8, -5, 4, SignedBytes.MAX_POWER_OF_TWO, -71, 10, -6, 2, 60, -70, 10, 6, -4, -2, 0, TarHeader.LF_DIR, -67, -3, 2, -6, 4, Ascii.FF, -20, Ascii.SO, TarHeader.LF_CONTIG, -20, -46, -12, 40, -35, 2, -6, 4, -13, 1, -4, 0, 0, 8, -10, -7, 66};
    private static final int $$h = 51;
    private static final byte[] $$a = {114, 69, -115, -114, -29, -18, -26, 4, -18, -18, -12, -37, -8, -25, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 87;
    private static int copydefault = 0;
    private static int component4 = 1;
    private static char component1 = 4093;
    private static char component2 = 42616;
    private static char ShareDataUIState = 7676;
    private static char component3 = 46274;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 111
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r5]
        L28:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.$$a
            int r8 = 47 - r8
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r1 = 16 - r6
            byte[] r1 = new byte[r1]
            int r6 = 15 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-17)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.b(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.$$g
            int r6 = r6 * 4
            int r6 = r6 + 99
            int r5 = 122 - r5
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = -1
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            r4 = r1[r5]
        L29:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.c(int, int, byte, java.lang.Object[]):void");
    }

    public final AppDatabase getAppDatabase() {
        int i = 2 % 2;
        AppDatabase appDatabase = this.appDatabase;
        if (appDatabase != null) {
            int i2 = copydefault + 83;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            return appDatabase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = component4 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setAppDatabase(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appDatabase, "");
        this.appDatabase = appDatabase;
        int i4 = copydefault + 63;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i3 = $10 + 41;
            $11 = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 == 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 111;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i4) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 844, View.MeasureSpec.getMode(0) + 32, (char) (TextUtils.indexOf((CharSequence) "", '0') + 23252), 592652048, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 844, 32 - (Process.myTid() >> 22), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23250), 592652048, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i8 = $10 + 97;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 465, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x1271, code lost:
    
        if ((r0 instanceof android.content.ContextWrapper) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x1276, code lost:
    
        if ((r0 instanceof android.content.ContextWrapper) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x127f, code lost:
    
        if (((android.content.ContextWrapper) r0).getBaseContext() == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x1282, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x1284, code lost:
    
        r0 = r38.getApplicationContext();
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x181b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x181c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x182e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x182f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r38, android.content.Intent r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.update.AppUpdateReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    private static final void onReceive$lambda$0(AppUpdateReceiver appUpdateReceiver) {
        int i = 2 % 2;
        int i2 = component4 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appUpdateReceiver, "");
        L.d("AppUpdateReceiver", "Clear data in background thread");
        appUpdateReceiver.getAppDatabase().mpesaFavoriteDao().clearFavorites();
        int i4 = copydefault + 39;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10202$r8$lambda$sNeXNJSMb7RyIEy5SBv25FZySA(AppUpdateReceiver appUpdateReceiver) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        onReceive$lambda$0(appUpdateReceiver);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component4 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
