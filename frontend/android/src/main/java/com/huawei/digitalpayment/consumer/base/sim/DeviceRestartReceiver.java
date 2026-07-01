package com.huawei.digitalpayment.consumer.base.sim;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "deviceRestartManager", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartManager;", "getDeviceRestartManager", "()Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartManager;", "setDeviceRestartManager", "(Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartManager;)V", "onReceive", "", "context", "Landroid/content/Context;", IpcMessageConstants.EXTRA_INTENT, "Landroid/content/Intent;", "checkIfAppWasForceStopped", "", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class DeviceRestartReceiver extends Hilt_DeviceRestartReceiver {
    public static final String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";

    public static final Companion INSTANCE;
    private static int ShareDataUIState;
    private static long component2;

    @Inject
    public DeviceRestartManager deviceRestartManager;
    private static final byte[] $$c = {46, -35, 45, 111};
    private static final int $$f = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarHeader.LF_CHR, -39, 98, -44, 17, 3, -58, 63, Ascii.DC2, -15, Ascii.ESC, -13, 9, -54, 58, 17, 3, 5, 7, 4, -59, 78, -9, 0, 8, 3, 20, -65, 59, 10, -3, Ascii.DLE, 8, -3, -52, 42, Ascii.ETB, 20, -46, TarHeader.LF_LINK, 7, Ascii.VT, -2, Ascii.VT, -31, 36, 6, -71, 5, 38, 56, 1, -10, Ascii.DC2, 1, -8, Ascii.DLE, -20, 43, -6, Ascii.VT, -7, 2, 20, -6, -1, -18, Ascii.SUB, 17, -6, 7, 2, -43, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -61, 17, 3, -58, 56, Ascii.DLE, 2, -2, 4, 6, 4, -46, 62, Ascii.DLE, -4, Ascii.DC2, -12, Ascii.DC2, -63, SignedBytes.MAX_POWER_OF_TWO, 9, -7, Ascii.VT, 3, -50, 71, -3, Ascii.FF, 10, 0, -60, 78, -9, 0, 8, 3, 20, -65, 39, Ascii.GS, Ascii.FF, 10, 0, -40, TarHeader.LF_DIR, 2, 13, 1, -9, -10, Ascii.CAN, 1, Ascii.ETB, -78, 20, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -62};
    private static final int $$h = 83;
    private static final byte[] $$a = {7, 75, -84, -52, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2};
    private static final int $$b = 181;
    private static int component3 = 0;
    private static int component1 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r7, short r8, int r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 3
            int r7 = 105 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            r6 = r9
            r9 = r7
            r7 = r6
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.$$i(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.$$a
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2f
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r8
            int r7 = r7 + (-17)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.b(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.$$g
            int r5 = r5 * 3
            int r5 = r5 + 99
            int r7 = r7 + 4
            int r6 = r6 * 15
            int r1 = 70 - r6
            byte[] r1 = new byte[r1]
            int r6 = 69 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2a:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.c(short, int, short, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartReceiver$Companion;", "", "<init>", "()V", "ACTION_BOOT_COMPLETED", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final DeviceRestartManager getDeviceRestartManager() {
        int i = 2 % 2;
        DeviceRestartManager deviceRestartManager = this.deviceRestartManager;
        if (deviceRestartManager != null) {
            int i2 = component3 + 51;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return deviceRestartManager;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = component1 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void setDeviceRestartManager(DeviceRestartManager deviceRestartManager) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceRestartManager, "");
        this.deviceRestartManager = deviceRestartManager;
        int i4 = component1 + 33;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 111;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int iKeyCodeFromString = 3266 - KeyEvent.keyCodeFromString("");
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34;
                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 60268);
                    byte b2 = (byte) ($$f & 1);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iIndexOf, c2, -834797019, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 687, 34 - Color.green(0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60373), -1969106284, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 686, 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 60373), -1969106284, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x1152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05eb  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r37, android.content.Intent r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[PHI: r6
  0x0064: PHI (r6v4 java.util.List) = (r6v3 java.util.List), (r6v10 java.util.List) binds: [B:15:0x0062, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean checkIfAppWasForceStopped(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.component3
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.component1 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 125(0x7d, float:1.75E-43)
            if (r1 < r3) goto L7c
            goto L23
        L1a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r1 < r3) goto L7c
        L23:
            int r1 = com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.component1
            int r1 = r1 + 21
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.component3 = r3
            int r1 = r1 % r0
            r3 = 1
            java.lang.String r4 = "activity"
            if (r1 == 0) goto L4b
            java.lang.Object r6 = r6.getSystemService(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r2)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7c
            goto L64
        L4b:
            java.lang.Object r6 = r6.getSystemService(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r2)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7c
        L64:
            java.lang.Object r6 = kotlin.collections.CollectionsKt.firstOrNull(r6)
            android.app.ApplicationStartInfo r6 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m(r6)
            if (r6 == 0) goto L7c
            int r1 = com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.component1
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.component3 = r2
            int r1 = r1 % r0
            boolean r6 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m(r6)
            goto L7d
        L7c:
            r6 = 0
        L7d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.DeviceRestartReceiver.checkIfAppWasForceStopped(android.content.Context):boolean");
    }

    static {
        ShareDataUIState = 0;
        copydefault();
        INSTANCE = new Companion(null);
        int i = copydefault + 7;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = -8982606703671067379L;
    }
}
