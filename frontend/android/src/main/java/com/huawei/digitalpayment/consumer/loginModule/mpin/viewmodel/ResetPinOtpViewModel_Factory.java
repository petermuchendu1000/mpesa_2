package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

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
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.loginModule.register.data.ResetOtpModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.notify;

public final class ResetPinOtpViewModel_Factory implements Factory<ResetPinOtpViewModel> {
    private final Provider<ResetOtpModel> copydefault;
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;
    private static int copy = 1;
    private static long component2 = 6306877108297902219L;
    private static char[] ShareDataUIState = {3095, 37565, 12632, 55275, 30349, 5414, 48076, 23259, 63805, 40916, 15978, 56597, 25519, 633, 41220, 18419, 58981, 34028, 11138, 51773, 26871, 3975, 44588, 16507, 57052, 32034, 39843, 15081, 22854, 63401, 5886, 46419, 54196, 29219, 37226, 12238, 19996, 60797, 3026, 43582, 38532, 2083, 43997, 19804, 60438, 36793, 8534, 49153, 25516, 1355, 42207, 18325, 63794, 39143, 10953, 46190, 6032, 61713, 20571, 13300, 40219, 31820, 57313, 47366, 6293, 64471, 17780, 9376, 24754, 65048, 24061, 47950, 6696, 31107, 55145, 13950, 38296, 62321, 21199, 45488, 3850, 28380, 52641, 11094, 35571, 59467, 18279, 42684, 1110, 25401, 49814, 8289, 49100, 7851, 31832, 56282, 15033, 38925, 11181, 46462, 5770, 61482, 20824, 3089, 37558, 12616, 55248, 30348, 5436, 48092, 23188, 63792, 40920, 15969, 3089, 37558, 12626, 55292, 30352, 5422, 48092, 23184, 63773, 40926, 15990, 56597, 25507, 625, 41241, 18366, 58951, 34039, 11145};
    private static long component3 = -1690027415497698605L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, int r7) {
        /*
            int r5 = r5 * 2
            int r0 = 1 - r5
            int r7 = r7 + 102
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_Factory.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_Factory.$$c(short, short, int):java.lang.String");
    }

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copy + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public ResetPinOtpViewModel_Factory(Provider<ResetOtpModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public ResetPinOtpViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance(this.copydefault.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ResetPinOtpViewModel resetPinOtpViewModelNewInstance = newInstance(this.copydefault.get());
        int i3 = copy + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return resetPinOtpViewModelNewInstance;
    }

    public static ResetPinOtpViewModel_Factory create(javax.inject.Provider<ResetOtpModel> provider) {
        int i = 2 % 2;
        ResetPinOtpViewModel_Factory resetPinOtpViewModel_Factory = new ResetPinOtpViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return resetPinOtpViewModel_Factory;
    }

    public static ResetPinOtpViewModel_Factory create(Provider<ResetOtpModel> provider) {
        int i = 2 % 2;
        ResetPinOtpViewModel_Factory resetPinOtpViewModel_Factory = new ResetPinOtpViewModel_Factory(provider);
        int i2 = component1 + 75;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        return resetPinOtpViewModel_Factory;
    }

    public static ResetPinOtpViewModel newInstance(ResetOtpModel resetOtpModel) {
        int i = 2 % 2;
        ResetPinOtpViewModel resetPinOtpViewModel = new ResetPinOtpViewModel(resetOtpModel);
        int i2 = component1 + 73;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return resetPinOtpViewModel;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 19;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 3266, ExpandableListView.getPackedPositionType(0L) + 33, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60268), -834797019, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 686, 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 60373), -1969106284, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getTouchSlop() >> 8), 33 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (60373 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -1969106284, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i10 = $11 + 15;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i - i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1159210934, false, $$c(b2, b3, (byte) (b3 | 19)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(component3), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3608, (Process.myPid() >> 22) + 29, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7170), 1951385784, false, $$c(b4, b5, (byte) (b5 | Ascii.SI)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4013, Color.green(0) + 24, (char) (TextUtils.indexOf("", "", 0) + 27761), -1529629956, false, $$c(b6, b7, (byte) (b7 | 20)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(ShareDataUIState[i + i6])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1759 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1159210934, false, $$c(b8, b9, (byte) (b9 | 19)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 3608, View.resolveSizeAndState(0, 0, 0) + 29, (char) (View.resolveSize(0, 0) + 7171), 1951385784, false, $$c(b10, b11, (byte) (b11 | Ascii.SI)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(4012 - ((byte) KeyEvent.getModifierMetaStateMask()), View.MeasureSpec.getSize(0) + 24, (char) (View.resolveSizeAndState(0, 0, 0) + 27761), -1529629956, false, $$c(b12, b13, (byte) (b13 | 20)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr8 = {cancelnotification, cancelnotification};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault7 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 4013, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, (char) (KeyEvent.normalizeMetaState(0) + 27761), -1529629956, false, $$c(b14, b15, (byte) (b15 | 20)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault7).invoke(null, objArr8);
                int i7 = $10 + 1;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v29, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] component3(android.content.Context r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 3837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinOtpViewModel_Factory.component3(android.content.Context, int, int):java.lang.Object[]");
    }
}
