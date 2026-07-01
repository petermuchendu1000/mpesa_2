package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.cancelNotification;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", BridgeDSL.INVOKE, "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final ComponentActivity $this_viewModels;
    private static final byte[] $$c = {Ascii.VT, -55, -20, -91};
    private static final int $$f = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, -59, -116, 119, -6, 5, -3};
    private static final int $$e = 209;
    private static final byte[] $$a = {TarHeader.LF_CHR, -39, 98, -44, Ascii.VT, -19, Ascii.ETB, TarHeader.LF_DIR, -60, 13, -11, 9, 59, -36, -18, -8, Ascii.SI, 6, -1, -1, 9, 1, Ascii.NAK, -15, 0};
    private static final int $$b = 59;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char[] component2 = {31941, 1821, 35603, 3984, 37826, 5660, 39501, 7843, 41726, 9512, 43360, 36718, 62648, 30968, 64560, 24672, 58800, 35208, 62032, 32350, 64197, 26268, 58188, 28416, 60396, 22449, 53347, 23654, 55520, 17575, 49301, 19785, 51479, 13771, 45452, 14932, 42512, 8940, 44726, 11110, 14776, 16992, 52846, 19189, 54956, 21372, 57136, 23516, 59265, 24659, 60502, 26830, 62607, 28856, 64888, 31012, 34295, 497, 35453, 5684, 37568, 7830, 39746, 10008, 41937, 12163, 43965, 13439, 45091, 15593, 3161, 30678, 64392, 32602, 58189, 26310, 60038, 28284, 53802, 21940, 55720, 23917, 49441, 17683, 51357, 19609, 45123, 13313, 49113, 9102, 42869, 11070, 44794, 4777, 38507, 6757, 40454, 466, 3143, 29764, 3986, 33759, 1795, 39775, 7835, 3089, 30679, 64414, 32586, 58119, 26333, 60062, 28272, 53804, 3103, 30679, 64400, 32602, 58126, 26310, 24196, 9538, 43269, 11735, 45465, 13379, 47109, 15586, 32947, 1905, 35700, 4076, 37792, 6024, 39516, 7703, 3078, 30657, 64403, 32602, 58128, 26318, 60038, 28286, 3076, 30678, 64401, 32598, 58135, 26305, 60060, 12600, 19174, 50862, 17011, 56882, 23539, 55205, 31859, 1974, 3077, 30663, 64413, 32587, 58134, 26352, 60063, 28284, 53802, 22003, 55707, 23917, 49445, 17684, 51419, 19612, 45121, 13318, 49090, 9117, 3077, 30662, 62555, 36741, 979, 34568, 6996, 40595, 4847, 38463, 10851, 44452, 8643, 42288, 14716, 48457, 12423, 3075, 30685, 64395, 32592, 58124, 26315, 60087, 28262, 53799, 22006, 55718, 23918, 49446, 17668, 998, 30844, 62513, 28905, 60606, 26943, 58660, 25039, 56717, 23106, 54868, 21197, 52865, 19113, 51067, 17207, 49130, 3161, 30679, 64409, 32591, 3161, 30656, 64389, 32586, 58134, 26314, 60037, 28218, 53805, 22009, 55725, 23919, 3161, 30661, 64409, 32599, 58118, 26304, 60058, 28218, 53820, 22002, 55722, 3076, 30684, 64466, 32603, 58135, 26310, 60036, 28273, 53872, 22003, 55723, 23922, 49470, 3103, 30685, 64405, 32589, 58188, 26332, 60062, 28278, 53872, 21992, 55729, 23902, 49454, 17686, 51413, 19600, 45129, 13325, 3076, 30662, 64402, 32599, 58123, 26305, 60047, 48602, 50698, 19026, 52886, 21207, 55040, 23360, 57319, 25585, 58430, 26731, 60659, 28900, 62660, 30979, 64853, 421, 34270, 3603, 37462, 5803, 39664, 7991, 3161, 30679, 64413, 32589, 58115, 26240, 60036, 28282, 53821, 22010, 55720, 23854, 3161, 30679, 64413, 32589, 58115, 26240, 60036, 28282, 53821, 22010, 55720, 23854, 49458, 17685, 51417, 19603, 45065, 16032, 17721, 51559, 19881, 53749, 21625, 3161, 30656, 64389, 32586, 58134, 26314, 60037, 28218, 53820, 22002, 55722, 23854, 49452, 17686, 51417, 19601, 45141, 13314, 49098, 9100, 42813, 3161, 30656, 64389, 32586, 58134, 26314, 60037, 28218, 53798, 22009, 55725, 23919, 49509, 9589, 24283, 53897, 22104, 51815, 20444, 3161, 30656, 64389, 32586, 58189, 26313, 60059, 28218, 53805, 22014, 55720, 23912, 49444, 17666, 51400, 19666, 45142, 13324, 49088, 9088, 42865, 11046, 31675, '5', 35963, 2221, 38063, 4407, 40307, 6544, 42453, 8714, 44621};
    private static long component3 = -647700392095090765L;
    private static char[] ShareDataUIState = {30274, 30650, 30649, 30273, 30275, 30652, 30646, 30653, 30647, 30331, 30272, 30279, 30640, 30276, 30282, 30654, 30636, 30648, 30651, 30641, 30328, 30278, 30645, 30326, 30642, 30644, 30639, 30323, 30330, 30637};
    private static int component1 = 321287717;
    private static boolean copydefault = true;
    private static boolean component4 = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, int r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.$$c
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = 122 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r5 = r5 + 1
            r3 = r0[r5]
        L26:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.$$g(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 100 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.$$d
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 6
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.$$a
            int r8 = r8 + 4
            int r1 = r7 + 3
            int r6 = r6 + 106
            byte[] r1 = new byte[r1]
            int r7 = r7 + 2
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L2a:
            int r6 = -r6
            int r8 = r8 + r6
            int r8 = r8 + 2
            int r6 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.d(short, byte, short, java.lang.Object[]):void");
    }

    @Override
    public ViewModelProvider.Factory invoke() {
        int i = 2 % 2;
        int i2 = copy + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory factoryInvoke = invoke();
        int i4 = getRequestBeneficiariesState + 3;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return factoryInvoke;
        }
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public final ViewModelProvider.Factory invoke() {
        int i = 2 % 2;
        int i2 = copy + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        int i4 = getRequestBeneficiariesState + 51;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultViewModelProviderFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i4 = $10 + 47;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - (KeyEvent.getMaxKeyCode() >> 16), 34 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-16777216) - Color.rgb(0, 0, 0)), 1159210934, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 & 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - ExpandableListView.getPackedPositionType(0L), 29 - TextUtils.indexOf("", ""), (char) (7171 - TextUtils.getCapsMode("", 0, 0)), 1951385784, false, $$g(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4012, 24 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (27760 - ExpandableListView.getPackedPositionChild(0L)), -1529629956, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i8 = 60 / 0;
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4012, 25 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (27761 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -1529629956, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void c(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        int i4 = -1;
        int i5 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 125;
                $10 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[0] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0, 0) + 24, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -1670574543, false, $$g(b2, (byte) (b2 & TarHeader.LF_FIFO), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 2;
                    i4 = -1;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7140, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i9 = 1;
        int i10 = 689978476;
        if (!(!component4)) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i11 = $11 + i9;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - i9) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i10);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) (-1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2747 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 19, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7644), -327556343, false, $$g(b3, (byte) (b3 & TarHeader.LF_LINK), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i9 = 1;
                i10 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!copydefault) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            try {
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) (-1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 2748, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, (char) (7644 - ((Process.getThreadPriority(0) + 20) >> 6)), -327556343, false, $$g(b4, (byte) (b4 & TarHeader.LF_LINK), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0c7b A[PHI: r6
  0x0c7b: PHI (r6v220 java.lang.String) = (r6v219 java.lang.String), (r6v221 java.lang.String) binds: [B:108:0x0c79, B:100:0x0b6b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0c8a A[PHI: r6 r34 r43
  0x0c8a: PHI (r6v120 java.lang.String) = 
  (r6v0 java.lang.String)
  (r6v122 java.lang.String)
  (r6v147 java.lang.String)
  (r6v219 java.lang.String)
  (r6v221 java.lang.String)
 binds: [B:111:0x0c86, B:73:0x07a5, B:84:0x093c, B:108:0x0c79, B:100:0x0b6b] A[DONT_GENERATE, DONT_INLINE]
  0x0c8a: PHI (r34v2 long) = (r34v0 long), (r34v4 long), (r34v4 long), (r34v4 long), (r34v4 long) binds: [B:111:0x0c86, B:73:0x07a5, B:84:0x093c, B:108:0x0c79, B:100:0x0b6b] A[DONT_GENERATE, DONT_INLINE]
  0x0c8a: PHI (r43v29 int) = (r43v0 int), (r43v31 int), (r43v31 int), (r43v35 int), (r43v35 int) binds: [B:111:0x0c86, B:73:0x07a5, B:84:0x093c, B:108:0x0c79, B:100:0x0b6b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1762  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x189a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x189f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x2219 A[Catch: all -> 0x233f, TryCatch #20 {all -> 0x233f, blocks: (B:249:0x220c, B:251:0x2219, B:252:0x225d), top: B:625:0x220c, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x2266 A[Catch: Exception -> 0x2353, TRY_ENTER, TryCatch #7 {Exception -> 0x2353, blocks: (B:235:0x20ea, B:242:0x2172, B:244:0x21d3, B:247:0x21dc, B:248:0x21e3, B:254:0x2266, B:257:0x2295, B:264:0x2329, B:266:0x232f, B:268:0x2336, B:270:0x233d, B:271:0x233e, B:273:0x2340, B:275:0x2347, B:276:0x2348, B:278:0x234a, B:280:0x2351, B:281:0x2352, B:236:0x210a, B:238:0x2117, B:239:0x215c, B:258:0x22cb, B:260:0x22d8, B:261:0x231b, B:249:0x220c, B:251:0x2219, B:252:0x225d), top: B:612:0x20ea, inners: #3, #12, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x2353  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x236b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x2a69 A[PHI: r9
  0x2a69: PHI (r9v327 long) = (r9v315 long), (r9v315 long), (r9v316 long), (r9v316 long) binds: [B:320:0x2a67, B:323:0x2ac9, B:645:0x2a69, B:646:0x2a69] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:602:0x2c55 A[EXC_TOP_SPLITTER, PHI: r7
  0x2c55: PHI (r7v479 java.io.BufferedInputStream) = (r7v478 java.io.BufferedInputStream), (r7v868 java.io.BufferedInputStream) binds: [B:401:0x2c67, B:376:0x2c20] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x093c A[PHI: r38
  0x093c: PHI (r38v11 java.lang.String) = (r38v10 java.lang.String), (r38v12 java.lang.String) binds: [B:91:0x0a3c, B:82:0x0938] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0a3e A[PHI: r38 r43
  0x0a3e: PHI (r38v14 java.lang.String) = 
  (r38v10 java.lang.String)
  (r38v12 java.lang.String)
  (r38v13 java.lang.String)
  (r38v9 java.lang.String)
  (r38v9 java.lang.String)
  (r38v15 java.lang.String)
 binds: [B:91:0x0a3c, B:82:0x0938, B:71:0x079f, B:58:0x0670, B:50:0x058d, B:40:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0a3e: PHI (r43v35 int) = (r43v31 int), (r43v31 int), (r43v31 int), (r43v32 int), (r43v33 int), (r43v38 int) binds: [B:91:0x0a3c, B:82:0x0938, B:71:0x079f, B:58:0x0670, B:50:0x058d, B:40:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0a44  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component3$16dd2b22(int r64, int r65, java.lang.Object r66, int r67, boolean r68, boolean r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 17343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.component3$16dd2b22(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
    }
}
