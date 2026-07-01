package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001d\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\nH\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/NewResetPinWarningActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentTranslucentActivity;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "buildVerifyType", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyType;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NewResetPinWarningActivity extends PaymentTranslucentActivity<ViewModel> {
    public static final int $stable = 0;
    private static byte[] ShareDataUIState;
    private static short[] component1;
    private static int component2;
    private static int component3;
    private static int copydefault;
    private static int[] equals;
    private static int getAsAtTimestamp;
    private static final byte[] $$c = {77, -67, -125, 9};
    private static final int $$f = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {69, 81, 99, -123, 17, 3, -58, 74, -13, 10, 0, Ascii.SYN, -4, -1, 17, 3, -58, 59, 6, 19, -5, 3, Ascii.FF, 10, Ascii.VT, -1, 6, -10, 13, -58, 58, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, 4, -64, 58, 10, 6, Ascii.FF, -61, Ascii.EM, 36, Ascii.ETB, -9, -26, 40, 8, 13, -10, Ascii.DC2, -42, 42, 6, Ascii.FF, -32, 46, -75, 5, 38, 56, 1, -10, Ascii.DC2, 1, -8, Ascii.DLE, -20, 43, -6, Ascii.VT, -7, 2, 20, -6, -1, -18, Ascii.SUB, 17, -6, 7, 2, -44, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -61, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, 9, 10, -3, 2, 10, Ascii.SI, -69, 58, 17, 8, 2, Ascii.VT, 4, -6, 10, -4, 19, -64, 58, 10, -2, Ascii.DC2, 5, -4, Ascii.FF, Ascii.FF, -64, 39, 39, 2, -6, Ascii.SYN, -13, 7, Ascii.DC2, -26, Ascii.NAK, 17, 6, -6, -60, 37, 38, 6, 0, Ascii.EM, -4, 13, -38, 41, 8, 1, Ascii.FF};
    private static final int $$e = 142;
    private static final byte[] $$a = {80, -19, -87, -22, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 120;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.$$i(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 28 - r5
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.$$a
            int r7 = 100 - r7
            byte[] r0 = new byte[r0]
            int r5 = 27 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r7]
        L26:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.d(int, short, byte, java.lang.Object[]):void");
    }

    private static void e(short s, byte b2, short s2, Object[] objArr) {
        int i = 107 - (s * 8);
        byte[] bArr = $$d;
        int i2 = (b2 * 3) + 4;
        byte[] bArr2 = new byte[85 - s2];
        int i3 = 84 - s2;
        int i4 = -1;
        if (bArr == null) {
            i = (i + i3) - 5;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i2]) - 5;
                i2++;
            }
        }
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = equals;
        char c2 = '0';
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        int i8 = 4392 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iIndexOf = 36 - TextUtils.indexOf("", c2, i6);
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        byte b2 = (byte) ($$f & 11);
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i8, iIndexOf, packedPositionChild, -309236339, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    c2 = '0';
                    i4 = 684241640;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = equals;
        if (iArr5 != null) {
            int i9 = $10 + 77;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 43;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr5[i11]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 4391;
                        int scrollDefaultDelay = 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                        byte b4 = (byte) ($$f & 11);
                        byte b5 = (byte) (b4 - 2);
                        i2 = length3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, scrollDefaultDelay, cLastIndexOf, -309236339, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                    } else {
                        i2 = length3;
                    }
                    iArr6[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i11 >>>= 1;
                } else {
                    i2 = length3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            int iBlue = 4391 - Color.blue(0);
                            int maxKeyCode = 37 - (KeyEvent.getMaxKeyCode() >> 16);
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte b6 = (byte) ($$f & 11);
                            byte b7 = (byte) (b6 - 2);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, maxKeyCode, keyRepeatTimeout, -309236339, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                        i11++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                length3 = i2;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c3] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i13];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Color.green(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, (char) (Color.alpha(0) + 49871), 462826032, false, $$i(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 3;
                byte b11 = (byte) (b10 - 3);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 2944, AndroidCharacter.getMirror('0') - 24, (char) (View.resolveSize(0, 0) + 27637), -1616366948, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r28, byte r29, int r30, int r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.b(short, byte, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0246  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.onCreate(android.os.Bundle):void");
    }

    private final ArrayList<VerifyType> buildVerifyType() {
        int i = 2 % 2;
        ArrayList<VerifyType> arrayList = new ArrayList<>();
        if (getIntent().getBooleanExtra(KeysConstants.KEY_SUPPORT_IDENTITY, false)) {
            arrayList.add(new VerifyType(null, null, getString(R.string.login_mpin_verify_id), RoutePathConstants.RESET_PIN_VERIFY, null));
        }
        if (getIntent().getBooleanExtra(KeysConstants.KEY_SUPPORT_QA, false)) {
            arrayList.add(new VerifyType(null, null, getString(R.string.login_mpin_answer_secret_question), RoutePathConstants.RESET_PIN_QA, null));
            int i2 = copy + 19;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (getIntent().getBooleanExtra(KeysConstants.KEY_SUPPORT_BASE_QA, false)) {
            arrayList.add(new VerifyType(null, null, getString(R.string.login_mpin_answer_other_question), RoutePathConstants.RESET_PIN_BASE_QA, null));
            int i4 = component4 + 69;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        return arrayList;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b((short) (69 - Color.green(0)), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() - 2059496609, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 57, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) + 202781370, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((short) (KeyEvent.normalizeMetaState(0) - 73), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).length() - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2059496611, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 56, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 202781375, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = copy + 121;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0), 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.blue(0), Color.alpha(0) + 56, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -699576857, false, "component2", new Class[]{Context.class});
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

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 31;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 68), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), (-2059496608) + TextUtils.indexOf("", "", 0), (-55) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 202781402 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 105), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 32), (ViewConfiguration.getTapTimeout() >> 16) - 2059496582, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 85, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 202781375, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 7;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6618, 43 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.keyCodeFromString(""), (Process.myTid() >> 22) + 56, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1029:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0b32 A[Catch: all -> 0x0c7d, TryCatch #47 {all -> 0x0c7d, blocks: (B:114:0x0b28, B:115:0x0b2c, B:117:0x0b32, B:120:0x0b4f, B:110:0x0ac0, B:113:0x0b20), top: B:958:0x0ac0 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d5d A[Catch: all -> 0x065e, TryCatch #29 {all -> 0x065e, blocks: (B:184:0x0d57, B:186:0x0d5d, B:187:0x0d89, B:390:0x1801, B:392:0x1807, B:393:0x1831, B:570:0x213d, B:572:0x2143, B:573:0x2172, B:804:0x36c6, B:806:0x36cc, B:807:0x36f0, B:841:0x3a11, B:843:0x3a17, B:844:0x3a39, B:821:0x3843, B:823:0x3866, B:824:0x38c0, B:770:0x337e, B:772:0x3384, B:773:0x33b0, B:669:0x2cee, B:671:0x2cf4, B:672:0x2d1b, B:674:0x2d55, B:675:0x2da0, B:642:0x2a4a, B:644:0x2a5f, B:645:0x2a91, B:624:0x274c, B:626:0x2752, B:627:0x277c, B:629:0x27b6, B:630:0x2802, B:591:0x23af, B:593:0x23c4, B:594:0x23f4, B:596:0x2428, B:597:0x24a6, B:435:0x1a99, B:437:0x1a9f, B:438:0x1acd, B:271:0x122b, B:273:0x1231, B:274:0x1259, B:17:0x02f6, B:19:0x02fc, B:20:0x032a, B:22:0x05cb, B:24:0x05fd, B:25:0x0658, B:398:0x18bb, B:400:0x18bf, B:421:0x19ab, B:423:0x19b1, B:424:0x19b2, B:426:0x19b4, B:428:0x19bb, B:429:0x19bc, B:404:0x18cb, B:414:0x191d, B:416:0x192a, B:417:0x19a1, B:410:0x18d6, B:412:0x18eb, B:413:0x1917, B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c), top: B:924:0x02f6, inners: #25, #71 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0eda A[Catch: all -> 0x11a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x11a0, blocks: (B:191:0x0e12, B:197:0x0e63, B:207:0x0eda), top: B:872:0x0e12 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x10a2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1231 A[Catch: all -> 0x065e, TryCatch #29 {all -> 0x065e, blocks: (B:184:0x0d57, B:186:0x0d5d, B:187:0x0d89, B:390:0x1801, B:392:0x1807, B:393:0x1831, B:570:0x213d, B:572:0x2143, B:573:0x2172, B:804:0x36c6, B:806:0x36cc, B:807:0x36f0, B:841:0x3a11, B:843:0x3a17, B:844:0x3a39, B:821:0x3843, B:823:0x3866, B:824:0x38c0, B:770:0x337e, B:772:0x3384, B:773:0x33b0, B:669:0x2cee, B:671:0x2cf4, B:672:0x2d1b, B:674:0x2d55, B:675:0x2da0, B:642:0x2a4a, B:644:0x2a5f, B:645:0x2a91, B:624:0x274c, B:626:0x2752, B:627:0x277c, B:629:0x27b6, B:630:0x2802, B:591:0x23af, B:593:0x23c4, B:594:0x23f4, B:596:0x2428, B:597:0x24a6, B:435:0x1a99, B:437:0x1a9f, B:438:0x1acd, B:271:0x122b, B:273:0x1231, B:274:0x1259, B:17:0x02f6, B:19:0x02fc, B:20:0x032a, B:22:0x05cb, B:24:0x05fd, B:25:0x0658, B:398:0x18bb, B:400:0x18bf, B:421:0x19ab, B:423:0x19b1, B:424:0x19b2, B:426:0x19b4, B:428:0x19bb, B:429:0x19bc, B:404:0x18cb, B:414:0x191d, B:416:0x192a, B:417:0x19a1, B:410:0x18d6, B:412:0x18eb, B:413:0x1917, B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c), top: B:924:0x02f6, inners: #25, #71 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x12e2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x133d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x138e A[Catch: all -> 0x171b, TRY_ENTER, TRY_LEAVE, TryCatch #69 {all -> 0x171b, blocks: (B:278:0x12dc, B:285:0x1330, B:332:0x15ba, B:333:0x15be, B:335:0x15c4, B:338:0x15e1, B:294:0x138e, B:312:0x1492, B:316:0x14d8, B:328:0x1556, B:331:0x15b2), top: B:1001:0x12dc }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0662 A[PHI: r14
  0x0662: PHI (r14v143 char) = (r14v43 char), (r14v149 char) binds: [B:15:0x02f1, B:5:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x15c4 A[Catch: all -> 0x171b, TryCatch #69 {all -> 0x171b, blocks: (B:278:0x12dc, B:285:0x1330, B:332:0x15ba, B:333:0x15be, B:335:0x15c4, B:338:0x15e1, B:294:0x138e, B:312:0x1492, B:316:0x14d8, B:328:0x1556, B:331:0x15b2), top: B:1001:0x12dc }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1807 A[Catch: all -> 0x065e, TryCatch #29 {all -> 0x065e, blocks: (B:184:0x0d57, B:186:0x0d5d, B:187:0x0d89, B:390:0x1801, B:392:0x1807, B:393:0x1831, B:570:0x213d, B:572:0x2143, B:573:0x2172, B:804:0x36c6, B:806:0x36cc, B:807:0x36f0, B:841:0x3a11, B:843:0x3a17, B:844:0x3a39, B:821:0x3843, B:823:0x3866, B:824:0x38c0, B:770:0x337e, B:772:0x3384, B:773:0x33b0, B:669:0x2cee, B:671:0x2cf4, B:672:0x2d1b, B:674:0x2d55, B:675:0x2da0, B:642:0x2a4a, B:644:0x2a5f, B:645:0x2a91, B:624:0x274c, B:626:0x2752, B:627:0x277c, B:629:0x27b6, B:630:0x2802, B:591:0x23af, B:593:0x23c4, B:594:0x23f4, B:596:0x2428, B:597:0x24a6, B:435:0x1a99, B:437:0x1a9f, B:438:0x1acd, B:271:0x122b, B:273:0x1231, B:274:0x1259, B:17:0x02f6, B:19:0x02fc, B:20:0x032a, B:22:0x05cb, B:24:0x05fd, B:25:0x0658, B:398:0x18bb, B:400:0x18bf, B:421:0x19ab, B:423:0x19b1, B:424:0x19b2, B:426:0x19b4, B:428:0x19bb, B:429:0x19bc, B:404:0x18cb, B:414:0x191d, B:416:0x192a, B:417:0x19a1, B:410:0x18d6, B:412:0x18eb, B:413:0x1917, B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c), top: B:924:0x02f6, inners: #25, #71 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x18d4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x18eb A[Catch: all -> 0x19b3, TryCatch #10 {all -> 0x19b3, blocks: (B:410:0x18d6, B:412:0x18eb, B:413:0x1917), top: B:888:0x18d6, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x192a A[Catch: all -> 0x19a9, TryCatch #5 {all -> 0x19a9, blocks: (B:414:0x191d, B:416:0x192a, B:417:0x19a1), top: B:879:0x191d, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1b60  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1baf A[Catch: all -> 0x2036, PHI: r2 r9
  0x1baf: PHI (r2v524 java.lang.Object) = (r2v523 java.lang.Object), (r2v604 java.lang.Object) binds: [B:443:0x1b5e, B:445:0x1b61] A[DONT_GENERATE, DONT_INLINE]
  0x1baf: PHI (r9v60 ??) = (r9v249 ??), (r9v250 ??) binds: [B:443:0x1b5e, B:445:0x1b61] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x2036, blocks: (B:442:0x1b5a, B:450:0x1baf, B:465:0x1c79), top: B:893:0x1b5a }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1bbc  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1c79 A[Catch: all -> 0x2036, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x2036, blocks: (B:442:0x1b5a, B:450:0x1baf, B:465:0x1c79), top: B:893:0x1b5a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1edd A[Catch: all -> 0x2008, TryCatch #55 {all -> 0x2008, blocks: (B:507:0x1ed3, B:508:0x1ed7, B:510:0x1edd, B:513:0x1ef7, B:503:0x1e6d, B:506:0x1ecb), top: B:974:0x1e6d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x2143 A[Catch: all -> 0x065e, TryCatch #29 {all -> 0x065e, blocks: (B:184:0x0d57, B:186:0x0d5d, B:187:0x0d89, B:390:0x1801, B:392:0x1807, B:393:0x1831, B:570:0x213d, B:572:0x2143, B:573:0x2172, B:804:0x36c6, B:806:0x36cc, B:807:0x36f0, B:841:0x3a11, B:843:0x3a17, B:844:0x3a39, B:821:0x3843, B:823:0x3866, B:824:0x38c0, B:770:0x337e, B:772:0x3384, B:773:0x33b0, B:669:0x2cee, B:671:0x2cf4, B:672:0x2d1b, B:674:0x2d55, B:675:0x2da0, B:642:0x2a4a, B:644:0x2a5f, B:645:0x2a91, B:624:0x274c, B:626:0x2752, B:627:0x277c, B:629:0x27b6, B:630:0x2802, B:591:0x23af, B:593:0x23c4, B:594:0x23f4, B:596:0x2428, B:597:0x24a6, B:435:0x1a99, B:437:0x1a9f, B:438:0x1acd, B:271:0x122b, B:273:0x1231, B:274:0x1259, B:17:0x02f6, B:19:0x02fc, B:20:0x032a, B:22:0x05cb, B:24:0x05fd, B:25:0x0658, B:398:0x18bb, B:400:0x18bf, B:421:0x19ab, B:423:0x19b1, B:424:0x19b2, B:426:0x19b4, B:428:0x19bb, B:429:0x19bc, B:404:0x18cb, B:414:0x191d, B:416:0x192a, B:417:0x19a1, B:410:0x18d6, B:412:0x18eb, B:413:0x1917, B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c), top: B:924:0x02f6, inners: #25, #71 }] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x21fe  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x226b  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x22b3  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x22cb  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x238f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x25ef  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x26f2  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x28ff  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x294e  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x2a28  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x2bc8  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x2cb2  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x2e7c A[Catch: all -> 0x331d, TryCatch #71 {all -> 0x331d, blocks: (B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c, B:741:0x3274, B:736:0x3232, B:738:0x3238, B:739:0x3262, B:707:0x3016, B:709:0x3035, B:710:0x30ae, B:702:0x2fc7, B:704:0x2fdc, B:705:0x300f), top: B:1005:0x2e76, outer: #29, inners: #41, #50, #56, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x2ee6 A[Catch: all -> 0x331d, TryCatch #71 {all -> 0x331d, blocks: (B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c, B:741:0x3274, B:736:0x3232, B:738:0x3238, B:739:0x3262, B:707:0x3016, B:709:0x3035, B:710:0x30ae, B:702:0x2fc7, B:704:0x2fdc, B:705:0x300f), top: B:1005:0x2e76, outer: #29, inners: #41, #50, #56, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:686:0x2f39 A[Catch: all -> 0x331d, TryCatch #71 {all -> 0x331d, blocks: (B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c, B:741:0x3274, B:736:0x3232, B:738:0x3238, B:739:0x3262, B:707:0x3016, B:709:0x3035, B:710:0x30ae, B:702:0x2fc7, B:704:0x2fdc, B:705:0x300f), top: B:1005:0x2e76, outer: #29, inners: #41, #50, #56, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x2f8d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x02d9 A[PHI: r14
  0x02d9: PHI (r14v43 char) = (r14v42 char), (r14v144 char) binds: [B:3:0x02d2, B:5:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:725:0x31de A[Catch: all -> 0x331d, TryCatch #71 {all -> 0x331d, blocks: (B:678:0x2e76, B:680:0x2e7c, B:681:0x2ebf, B:683:0x2ee6, B:684:0x2f25, B:686:0x2f39, B:688:0x2f42, B:689:0x2f82, B:722:0x31d4, B:723:0x31d8, B:725:0x31de, B:728:0x31f6, B:731:0x3203, B:733:0x3206, B:745:0x32f7, B:747:0x32fd, B:748:0x32fe, B:750:0x3300, B:752:0x3307, B:753:0x3308, B:692:0x2f91, B:694:0x2f95, B:698:0x2fa1, B:700:0x2fa7, B:712:0x30ba, B:714:0x30c0, B:715:0x3103, B:717:0x312d, B:718:0x3171, B:720:0x3187, B:721:0x31ce, B:755:0x330a, B:757:0x3311, B:758:0x3312, B:760:0x3314, B:762:0x331b, B:763:0x331c, B:741:0x3274, B:736:0x3232, B:738:0x3238, B:739:0x3262, B:707:0x3016, B:709:0x3035, B:710:0x30ae, B:702:0x2fc7, B:704:0x2fdc, B:705:0x300f), top: B:1005:0x2e76, outer: #29, inners: #41, #50, #56, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:778:0x3448  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x349b  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x34f4  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x36a8  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x3782  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x37d3  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x3825  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x39f1  */
    /* JADX WARN: Removed duplicated region for block: B:891:0x06ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:917:0x18bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:922:0x0e18 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v159, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v171 */
    /* JADX WARN: Type inference failed for: r10v218 */
    /* JADX WARN: Type inference failed for: r10v278 */
    /* JADX WARN: Type inference failed for: r10v284 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r12v239, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v137, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v143, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v176 */
    /* JADX WARN: Type inference failed for: r13v183 */
    /* JADX WARN: Type inference failed for: r13v184 */
    /* JADX WARN: Type inference failed for: r13v185 */
    /* JADX WARN: Type inference failed for: r13v186 */
    /* JADX WARN: Type inference failed for: r13v187 */
    /* JADX WARN: Type inference failed for: r13v188 */
    /* JADX WARN: Type inference failed for: r13v189 */
    /* JADX WARN: Type inference failed for: r13v190 */
    /* JADX WARN: Type inference failed for: r13v191 */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v101, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v107 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v122 */
    /* JADX WARN: Type inference failed for: r14v123 */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v125 */
    /* JADX WARN: Type inference failed for: r14v126 */
    /* JADX WARN: Type inference failed for: r14v131, types: [byte, short] */
    /* JADX WARN: Type inference failed for: r14v132 */
    /* JADX WARN: Type inference failed for: r14v133, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v138 */
    /* JADX WARN: Type inference failed for: r14v139 */
    /* JADX WARN: Type inference failed for: r14v141 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v146 */
    /* JADX WARN: Type inference failed for: r14v147 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v150 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v153 */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v155 */
    /* JADX WARN: Type inference failed for: r14v156 */
    /* JADX WARN: Type inference failed for: r14v157 */
    /* JADX WARN: Type inference failed for: r14v158 */
    /* JADX WARN: Type inference failed for: r14v159 */
    /* JADX WARN: Type inference failed for: r14v160 */
    /* JADX WARN: Type inference failed for: r14v161 */
    /* JADX WARN: Type inference failed for: r14v162 */
    /* JADX WARN: Type inference failed for: r14v163 */
    /* JADX WARN: Type inference failed for: r14v164 */
    /* JADX WARN: Type inference failed for: r14v165 */
    /* JADX WARN: Type inference failed for: r14v166 */
    /* JADX WARN: Type inference failed for: r14v167 */
    /* JADX WARN: Type inference failed for: r14v168 */
    /* JADX WARN: Type inference failed for: r14v169 */
    /* JADX WARN: Type inference failed for: r14v170 */
    /* JADX WARN: Type inference failed for: r14v171 */
    /* JADX WARN: Type inference failed for: r14v172 */
    /* JADX WARN: Type inference failed for: r14v173 */
    /* JADX WARN: Type inference failed for: r14v174 */
    /* JADX WARN: Type inference failed for: r14v175 */
    /* JADX WARN: Type inference failed for: r14v176 */
    /* JADX WARN: Type inference failed for: r14v177 */
    /* JADX WARN: Type inference failed for: r14v178 */
    /* JADX WARN: Type inference failed for: r14v179 */
    /* JADX WARN: Type inference failed for: r14v180 */
    /* JADX WARN: Type inference failed for: r14v181 */
    /* JADX WARN: Type inference failed for: r14v182 */
    /* JADX WARN: Type inference failed for: r14v183 */
    /* JADX WARN: Type inference failed for: r14v186 */
    /* JADX WARN: Type inference failed for: r14v187 */
    /* JADX WARN: Type inference failed for: r14v188 */
    /* JADX WARN: Type inference failed for: r14v189 */
    /* JADX WARN: Type inference failed for: r14v190 */
    /* JADX WARN: Type inference failed for: r14v191 */
    /* JADX WARN: Type inference failed for: r14v192 */
    /* JADX WARN: Type inference failed for: r14v193 */
    /* JADX WARN: Type inference failed for: r14v194 */
    /* JADX WARN: Type inference failed for: r14v195 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r1v309, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v503 */
    /* JADX WARN: Type inference failed for: r1v511 */
    /* JADX WARN: Type inference failed for: r1v512 */
    /* JADX WARN: Type inference failed for: r1v568, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v597 */
    /* JADX WARN: Type inference failed for: r1v602, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v616 */
    /* JADX WARN: Type inference failed for: r1v617 */
    /* JADX WARN: Type inference failed for: r1v618 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v100 */
    /* JADX WARN: Type inference failed for: r30v101 */
    /* JADX WARN: Type inference failed for: r30v102 */
    /* JADX WARN: Type inference failed for: r30v103 */
    /* JADX WARN: Type inference failed for: r30v104 */
    /* JADX WARN: Type inference failed for: r30v105 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v24 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v36 */
    /* JADX WARN: Type inference failed for: r30v37 */
    /* JADX WARN: Type inference failed for: r30v38 */
    /* JADX WARN: Type inference failed for: r30v39 */
    /* JADX WARN: Type inference failed for: r30v40 */
    /* JADX WARN: Type inference failed for: r30v41 */
    /* JADX WARN: Type inference failed for: r30v45 */
    /* JADX WARN: Type inference failed for: r30v46 */
    /* JADX WARN: Type inference failed for: r30v47 */
    /* JADX WARN: Type inference failed for: r30v48 */
    /* JADX WARN: Type inference failed for: r30v49 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v50 */
    /* JADX WARN: Type inference failed for: r30v51 */
    /* JADX WARN: Type inference failed for: r30v52 */
    /* JADX WARN: Type inference failed for: r30v53 */
    /* JADX WARN: Type inference failed for: r30v54 */
    /* JADX WARN: Type inference failed for: r30v55 */
    /* JADX WARN: Type inference failed for: r30v56 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v77 */
    /* JADX WARN: Type inference failed for: r30v78 */
    /* JADX WARN: Type inference failed for: r30v79 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v80 */
    /* JADX WARN: Type inference failed for: r30v81 */
    /* JADX WARN: Type inference failed for: r30v82 */
    /* JADX WARN: Type inference failed for: r30v83 */
    /* JADX WARN: Type inference failed for: r30v84 */
    /* JADX WARN: Type inference failed for: r30v85 */
    /* JADX WARN: Type inference failed for: r30v86 */
    /* JADX WARN: Type inference failed for: r30v87 */
    /* JADX WARN: Type inference failed for: r30v88 */
    /* JADX WARN: Type inference failed for: r30v89 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r30v90 */
    /* JADX WARN: Type inference failed for: r30v91 */
    /* JADX WARN: Type inference failed for: r30v92 */
    /* JADX WARN: Type inference failed for: r30v93 */
    /* JADX WARN: Type inference failed for: r30v94 */
    /* JADX WARN: Type inference failed for: r30v95 */
    /* JADX WARN: Type inference failed for: r30v96 */
    /* JADX WARN: Type inference failed for: r30v97 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v25 */
    /* JADX WARN: Type inference failed for: r31v26 */
    /* JADX WARN: Type inference failed for: r31v27 */
    /* JADX WARN: Type inference failed for: r31v28 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v31 */
    /* JADX WARN: Type inference failed for: r31v32 */
    /* JADX WARN: Type inference failed for: r31v33 */
    /* JADX WARN: Type inference failed for: r31v34 */
    /* JADX WARN: Type inference failed for: r31v35 */
    /* JADX WARN: Type inference failed for: r31v36 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v38 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v41 */
    /* JADX WARN: Type inference failed for: r31v42 */
    /* JADX WARN: Type inference failed for: r31v43 */
    /* JADX WARN: Type inference failed for: r31v44 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v46 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v51 */
    /* JADX WARN: Type inference failed for: r31v52 */
    /* JADX WARN: Type inference failed for: r31v53 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r31v57 */
    /* JADX WARN: Type inference failed for: r31v58 */
    /* JADX WARN: Type inference failed for: r31v59 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r31v62 */
    /* JADX WARN: Type inference failed for: r31v63 */
    /* JADX WARN: Type inference failed for: r31v64 */
    /* JADX WARN: Type inference failed for: r31v65 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v67 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v69 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v70 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v74 */
    /* JADX WARN: Type inference failed for: r31v75 */
    /* JADX WARN: Type inference failed for: r31v76 */
    /* JADX WARN: Type inference failed for: r31v77 */
    /* JADX WARN: Type inference failed for: r31v78 */
    /* JADX WARN: Type inference failed for: r31v79 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v80 */
    /* JADX WARN: Type inference failed for: r31v81 */
    /* JADX WARN: Type inference failed for: r31v82 */
    /* JADX WARN: Type inference failed for: r31v83 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v602 */
    /* JADX WARN: Type inference failed for: r3v603 */
    /* JADX WARN: Type inference failed for: r3v604 */
    /* JADX WARN: Type inference failed for: r3v605 */
    /* JADX WARN: Type inference failed for: r3v620 */
    /* JADX WARN: Type inference failed for: r3v621 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v312 */
    /* JADX WARN: Type inference failed for: r4v323 */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v329 */
    /* JADX WARN: Type inference failed for: r4v330 */
    /* JADX WARN: Type inference failed for: r4v331 */
    /* JADX WARN: Type inference failed for: r5v577 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v364 */
    /* JADX WARN: Type inference failed for: r7v433 */
    /* JADX WARN: Type inference failed for: r7v434 */
    /* JADX WARN: Type inference failed for: r7v435 */
    /* JADX WARN: Type inference failed for: r7v436 */
    /* JADX WARN: Type inference failed for: r7v452 */
    /* JADX WARN: Type inference failed for: r7v453 */
    /* JADX WARN: Type inference failed for: r8v217 */
    /* JADX WARN: Type inference failed for: r8v218 */
    /* JADX WARN: Type inference failed for: r8v219 */
    /* JADX WARN: Type inference failed for: r8v220 */
    /* JADX WARN: Type inference failed for: r8v221 */
    /* JADX WARN: Type inference failed for: r8v226 */
    /* JADX WARN: Type inference failed for: r8v227 */
    /* JADX WARN: Type inference failed for: r8v298 */
    /* JADX WARN: Type inference failed for: r8v312 */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v113, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v124 */
    /* JADX WARN: Type inference failed for: r9v126, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v132, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v136 */
    /* JADX WARN: Type inference failed for: r9v137 */
    /* JADX WARN: Type inference failed for: r9v138 */
    /* JADX WARN: Type inference failed for: r9v161, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v238 */
    /* JADX WARN: Type inference failed for: r9v239 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v243 */
    /* JADX WARN: Type inference failed for: r9v244 */
    /* JADX WARN: Type inference failed for: r9v245 */
    /* JADX WARN: Type inference failed for: r9v246 */
    /* JADX WARN: Type inference failed for: r9v247 */
    /* JADX WARN: Type inference failed for: r9v248 */
    /* JADX WARN: Type inference failed for: r9v249 */
    /* JADX WARN: Type inference failed for: r9v250 */
    /* JADX WARN: Type inference failed for: r9v251 */
    /* JADX WARN: Type inference failed for: r9v252 */
    /* JADX WARN: Type inference failed for: r9v253 */
    /* JADX WARN: Type inference failed for: r9v254 */
    /* JADX WARN: Type inference failed for: r9v255 */
    /* JADX WARN: Type inference failed for: r9v256 */
    /* JADX WARN: Type inference failed for: r9v257 */
    /* JADX WARN: Type inference failed for: r9v258 */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v86 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.NewResetPinWarningActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getAsAtTimestamp = 0;
        component1();
        int i = getRequestBeneficiariesState + 75;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 39;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        copydefault = -1962271845;
        component2 = -238323938;
        component3 = 35830446;
        ShareDataUIState = new byte[]{-14, -105, -27, -23, -101, -110, -55, -55, 80, -21, -42, -95, -112, -111, -110, -27, -99, -30, -54, -105, -98, -121, -20, -26, -65, -23, -17, -121, -31, -103, -27, -12, -25, 80, -110, -29, -57, -84, -97, -100, -111, -32, -104, -31, -14, 97, 102, Ascii.ETB, 117, 110, 106, 111, 108, 96, 81, 63, 102, 123, Ascii.NAK, 96, 111, 114, -48, 115, 0, 6, 2, Ascii.CAN, 1, 3, 40, 3, 127, Ascii.SUB, 4, 4, -46, 1, 2, 5, Ascii.CAN, 2, 115, -45, 115, Ascii.EM, -46, 114, 6, -41, 113, 5, Ascii.EM, -46, 113, -44, 119, Ascii.SI, 5, 6, -42, 118, -34, 7, 113, 4, -43, 72, 13, 45, 32, 124, 1, Ascii.FF, 2, 8, -45, 2, Ascii.SI, 112, Ascii.SO, Ascii.SI, TarHeader.LF_FIFO, -44, 122, 4, -36, 113, 9, Ascii.EM, 9, Ascii.FF, 3, Ascii.SI, -48, 125, -46, 115, 1, -35, 125, 4, -40, 115, Ascii.SO, -33, 113, 13, -48, 126, Ascii.FF, Ascii.FF, 1, 5, 13, Ascii.SO, -48, Ascii.FF, 3, 125, 5, 9, -47, 3, Ascii.SO, 125, 1, 3, 10, 5, -35, 122, -48, 116, 56, -106, -17, -32, -122, -8, -33, -108, 85, 46, 82, -24, -25, -105, -112, -20, -45, -81, -112, -26, -37, -85, -105, -27, -36, -96, -102, -8, -123, -19, -105, -26, -101, -8, -123, -25, -48, 83, -24, -5, -105, -122, -6, -107, -102, -29, -99, 47, -91, -106, -59, -22, -21, -23, -107, -20, -107, -24, -89, -38, -107, -106, -22, -106, -18, -23, -100, -82, -22, -107, -23, -27, -16, -57, -2, -50, -55, 37, 34, -124, -10, -38, -14, 13, -102, -8, -46, -12, -15, -88, -92, 87, -72, -67, -84, -75, 94, -95, 82, -91, -79, 87, -71, 32, -41, Ascii.EM, -42, -34, -43, -6, -42, 1, -6, -44, Ascii.EM, -26, -45, 2, -8, Ascii.EM, -8, 7, -27, -46, Ascii.SUB, -43, -27, 2, 40, -44, -43, 43, -48, -6, 0, 44, -29, Ascii.CAN, -26, -43, 2, -42, 43, -43, -25, -42, 41, 0, -25, 6, -44, -7, Ascii.CAN, -43, -43, -8, -46, 6, -26, 3, -3, -44, -44, Ascii.CAN, -29, 0, -8, -3, -102, -97, -23, -99, -109, -97, -105, -99, -23, -98, -3, -78, PSSSigner.TRAILER_IMPLICIT, -66, -77, -76, -79, -76, -70, -73, -69, -6, TarHeader.LF_DIR, Ascii.SO, 13, 13, TarHeader.LF_BLK, 10, 13, Ascii.SI, 9};
        equals = new int[]{1690364128, 609300138, -1232110453, 1037772054, -1989526806, -821790448, 2019860022, 283158073, 193003627, -2048375580, 1640035529, 616051336, 1974361178, -1827304392, -1001718188, -2118779741, 1624394536, -14248465};
    }
}
