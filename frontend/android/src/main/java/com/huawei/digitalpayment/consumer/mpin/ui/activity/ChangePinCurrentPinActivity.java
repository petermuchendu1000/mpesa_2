package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/ChangePinCurrentPinActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentTranslucentActivity;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangePinCurrentPinActivity extends PaymentTranslucentActivity<ViewModel> {
    public static final int $stable = 0;
    private static int ShareDataUIState;
    private static long component1;
    private static char[] component2;
    private static long copydefault;
    private static final byte[] $$c = {118, 33, 67, 92};
    private static final int $$f = 223;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Ascii.ETB, -38, -83, 70, -14, -15, -2, -7, -15, -20, SignedBytes.MAX_POWER_OF_TWO, -63, -22, -13, -7, -16, -9, 1, -15, -1, -24, 59, -63, -15, -3, -23, -10, -1, -17, -17, 59, -44, -44, -7, 1, -27, 8, -12, -23, Ascii.NAK, -26, -22, -11, 1, TarHeader.LF_CONTIG, -42, -43, -11, -5, -30, -1, -18, 33, -46, -13, -6, -17, -22, -8, -13, -9, -9, -1, -19, -16, 56, -22, -8, -13, -9, -9, -1, -19, -16, TarHeader.LF_CONTIG};
    private static final int $$e = 161;
    private static final byte[] $$a = {Ascii.ETB, -38, -83, 70, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 26;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 4
            int r7 = 122 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.$$a
            int r1 = r5 + 4
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r5
            r6 = r7
            goto L2b
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            int r6 = r6 + 1
            r3 = r0[r6]
        L2b:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.d(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.$$d
            int r5 = r5 + 4
            int r7 = r7 * 44
            int r1 = 54 - r7
            int r6 = r6 * 8
            int r6 = r6 + 99
            byte[] r1 = new byte[r1]
            int r7 = 53 - r7
            r2 = -1
            if (r0 != 0) goto L16
            r6 = r5
            r3 = r7
            goto L2d
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            int r6 = r6 + 1
            if (r2 != r7) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2b:
            r3 = r0[r6]
        L2d:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.e(short, int, int, java.lang.Object[]):void");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 115;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 34 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51268), -1883291598, false, $$i(b2, (byte) (b2 & 19), (byte) 0), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 29;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 35;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i) {
            int i6 = $10 + 45;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i2 + i8])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 1758, 34 - View.MeasureSpec.getMode(0), (char) View.combineMeasuredStates(0, 0), 1159210934, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 & 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 3608, View.resolveSize(0, 0) + 29, (char) (Color.argb(0, 0, 0, 0) + 7171), 1951385784, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4012 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (char) (MotionEvent.axisFromString("") + 27762), -1529629956, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
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
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4012, 24 - (KeyEvent.getMaxKeyCode() >> 16), (char) (27761 - TextUtils.indexOf("", "", 0, 0)), -1529629956, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0196  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 47;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            c(ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{22020, 22117, 45942, 33278, 49831, 42767, 62519, 40435, 27895, 32745, 62375, 2195, 49493, 19352, 15915, 17211, 13453, 5171, 2631, 38884, 30738, 57553, 22271, 43932, 44968, 44360, 40209, 65080, 37877, 31212}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(View.resolveSizeAndState(0, 0, 0) + 18, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 82, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 8712), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = getRequestBeneficiariesState + 19;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = getRequestBeneficiariesState + 31;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Drawable.resolveOpacity(0, 0), 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) TextUtils.getOffsetBefore("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6562, 56 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 1), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r41) {
        /*
            Method dump skipped, instruction units count: 14318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinCurrentPinActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        ShareDataUIState = 1;
        component1();
        int i = component3 + 41;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 49;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component2 = new char[]{3095, 7795, 10436, 15173, 17845, 20488, 25232, 36021, 40769, 43462, 46198, 50879, 53504, 58230, 3535, 6230, 10933, 13598, 3099, 7780, 10485, 15198, 17854, 11902, 15363, 2745, 6446, 26580, 29284, 16619, 44721, 48437, 35758, 38495, 58605, 62330, 49427, 12211, 14897, 2242, 5992, 3140, 7801, 10387, 15110, 17898, 20565, 25239, 36088, 40732, 43475, 46185, 50907, 53579, 58159, 3535, 6224, 10997, 13661, 18376, 20965, 31770, 36567, 39284, 43992, 46662, 49254, 53964, 64780, 4084, 6737, 9418, 14049, 16678, 21381, 32291, 34997, 39711, 42341, 47013, 49752, 60589, 65389, 2497, 7102, 9844, 12428, 17273, 28130, 30722, 35391, 38129, 42821, 45565, 56425, 61058, 63667, 2856, 5526, 8305, 13031, 23889, 28464, 31146, 33818, 23516, 18876, 32534, 27798, 4660, 1997, 13653, 56117, 51337, 65115, 58315, 37206, 34497, 46253, 23049, 20382, 22780, 19098, 31782, 28602, 4429, 1259, 13923, 55297, 52101, 64823, 57544, 37476, 34258, 46997, 22827, 19637, 4362, 870, 13788, 9805, 22700, 19737, 32648, 37356, 33362, 46284, 43311, 3138, 7727, 10393, 15107, 17891, 20567, 25283, 36009, 40727, 43395, 46184, 43344, 47926, 36230, 40464, 57597, 62796, 51166, 10672, 14857, 3225};
        copydefault = -6185372047555682787L;
        component1 = 8369250054372597367L;
    }
}
