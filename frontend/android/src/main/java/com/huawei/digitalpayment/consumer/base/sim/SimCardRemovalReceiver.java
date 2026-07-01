package com.huawei.digitalpayment.consumer.base.sim;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "deviceInfoRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository;", "getDeviceInfoRepository", "()Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository;", "setDeviceInfoRepository", "(Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository;)V", "simCardRemovalManager", "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "getSimCardRemovalManager", "()Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "setSimCardRemovalManager", "(Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;)V", "onReceive", "", "context", "Landroid/content/Context;", IpcMessageConstants.EXTRA_INTENT, "Landroid/content/Intent;", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SimCardRemovalReceiver extends Hilt_SimCardRemovalReceiver {
    public static final String ACTION_SIM_STATE_CHANGED = "android.intent.action.SIM_STATE_CHANGED";

    public static final Companion INSTANCE;
    private static int ShareDataUIState;
    private static int component2;
    private static long component3;
    private static char copydefault;

    @Inject
    public DeviceInfoRepository deviceInfoRepository;

    @Inject
    public SimCardRemovalManager simCardRemovalManager;
    private static final byte[] $$l = {Ascii.GS, -26, 91, 68};
    private static final int $$m = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {120, -62, 63, 57, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -50, -10, 4, 8, 2, 0, 2, TarHeader.LF_BLK, -56, -10, 10, -12, Ascii.DC2, -12, 69, -51, 2, -17, Ascii.SI, 56, -70, 13, 60, -72, Ascii.SI, 6, -2, 3, -14, 71, -24, -42, 10, -12, Ascii.DC2, -12, TarHeader.LF_NORMAL, -36, 4, 3, -7, 42, -44, -8, -11, 0, -8, Ascii.SYN, 0, 0, 6, -19, 10, -7, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -51, -18, 9, -2, -3, Ascii.DLE, 3, -4, 59, -56, -4, 4, 6, 0, 56, -58, -4, -5, Ascii.DLE, -1, -10, Ascii.DC2, -18, Ascii.FF, -5, 2, 65, -52, -11, 3, -2, 2, -3, Ascii.SI, 56, -33, -33, Ascii.SO, -6, -2, Ascii.SI, -2, Ascii.SUB, -40, -11, 3, -2, 2, 2, 10, -8, -5, 66};
    private static final int $$k = 120;
    private static final byte[] $$d = {59, -24, -77, -23, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2};
    private static final int $$e = 3;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(int r6, short r7, short r8) {
        /*
            int r8 = r8 + 98
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.$$l
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L1f:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.$$n(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.$$d
            int r9 = r9 + 10
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-17)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.f(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 107 - r6
            int r8 = r8 * 3
            int r8 = 99 - r8
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.g(byte, int, short, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalReceiver$Companion;", "", "<init>", "()V", "ACTION_SIM_STATE_CHANGED", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0 = 39 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r2 = r2 + 75;
        com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.getAsAtTimestamp = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository getDeviceInfoRepository() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.getAsAtTimestamp
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L16
            com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r1 = r4.deviceInfoRepository
            r3 = 3
            int r3 = r3 / 0
            if (r1 == 0) goto L28
            goto L1a
        L16:
            com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository r1 = r4.deviceInfoRepository
            if (r1 == 0) goto L28
        L1a:
            int r2 = r2 + 75
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.getAsAtTimestamp = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            r0 = 39
            int r0 = r0 / 0
        L27:
            return r1
        L28:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.getDeviceInfoRepository():com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository");
    }

    public final void setDeviceInfoRepository(DeviceInfoRepository deviceInfoRepository) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "");
        this.deviceInfoRepository = deviceInfoRepository;
        int i4 = getAsAtTimestamp + 117;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final SimCardRemovalManager getSimCardRemovalManager() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SimCardRemovalManager simCardRemovalManager = this.simCardRemovalManager;
        if (simCardRemovalManager != null) {
            return simCardRemovalManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = getRequestBeneficiariesState + 51;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void setSimCardRemovalManager(SimCardRemovalManager simCardRemovalManager) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simCardRemovalManager, "");
            this.simCardRemovalManager = simCardRemovalManager;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(simCardRemovalManager, "");
        this.simCardRemovalManager = simCardRemovalManager;
        int i3 = getAsAtTimestamp + 51;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    private static void e(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        char c3;
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i4 = $11 + 11;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 % 3;
        }
        while (iNotificationSideChannel.copydefault < length3) {
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 4037, Color.alpha(0) + 31, (char) (View.combineMeasuredStates(0, 0) + 19181), 1912513118, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 7567, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, (char) TextUtils.getTrimmedLength(""), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int iArgb = Color.argb(0, 0, 0, 0) + 2459;
                            int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0);
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            String str$$n = $$n(b4, b5, b5);
                            c3 = 3;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, iLastIndexOf, edgeSlop, 931716605, false, str$$n, new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        } else {
                            c3 = 3;
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 7567, 11 - KeyEvent.getDeadChar(0, 0), (char) TextUtils.getTrimmedLength(""), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 93;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x1262  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x1264  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x084d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r42, android.content.Intent r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    static {
        ShareDataUIState = 0;
        component3();
        INSTANCE = new Companion(null);
        int i = component1 + 75;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component3 = -8170442190849098122L;
        component2 = 1386857713;
        copydefault = (char) 50417;
    }
}
