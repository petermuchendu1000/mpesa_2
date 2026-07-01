package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityPaymentSettingBinding;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.getActiveNotifications;
import org.apache.commons.lang3.CharUtils;

public class PaymentSettingActivity extends Hilt_PaymentSettingActivity<ActivityPaymentSettingBinding, ViewModel> {
    private static final byte[] $$d = {102, Ascii.GS, -34, 39};
    private static final int $$e = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;
    private static int component1 = 1;
    private static int[] ShareDataUIState = {476809913, 1477868048, 1297019277, 855501072, -1238464047, -688652811, -705598907, -1613026398, 434520366, -1858557077, -2079438386, 1169037698, -1401016175, -1767516600, 67979571, -1445736987, 2057209290, 1923592422};
    private static char[] component2 = {2025, 2005, 1969, 2019, 1973, 1970, 2017, 1975, 1971, 2041, 2022, 1968, 1976, 2028, 1977, 1974, 2016, 2031, 1972, 2018, 2020, 2029, 2021, 2030, 2023};
    private static char component3 = 12831;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PaymentSettingActivity.$$d
            int r7 = r7 + 104
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r3 = r1[r5]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaymentSettingActivity.$$f(int, int, byte):java.lang.String");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_payment_setting;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    private static void lambda$onCreate$0(View view) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute(RoutePathConstants.PIN_FREE_SETTING);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component1 + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void d(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ShareDataUIState;
        char c2 = '0';
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 101;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(iArr2[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - Color.red(i7), 36 - TextUtils.indexOf("", c2), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), -309236339, false, $$f(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 2;
                    c2 = '0';
                    i5 = 684241640;
                    i7 = 0;
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
        int[] iArr5 = ShareDataUIState;
        long j = 0;
        if (iArr5 != null) {
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 61;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    try {
                        Object[] objArr3 = new Object[i6];
                        objArr3[0] = Integer.valueOf(iArr5[i13]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            i2 = length3;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.indexOf((CharSequence) "", '0'), 37 - ExpandableListView.getPackedPositionGroup(j), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -309236339, false, $$f(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                        } else {
                            i2 = length3;
                        }
                        iArr6[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i13 <<= 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    i2 = length3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, (char) View.MeasureSpec.getMode(0), -309236339, false, $$f(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                        i13++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                length3 = i2;
                j = 0;
                i6 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i15 = $10 + 71;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i17 = 0;
            while (i17 < 16) {
                int i18 = $10 + 65;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    getactivenotifications.ShareDataUIState ^= iArr4[i17];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2969, 16 - TextUtils.indexOf("", ""), (char) (View.resolveSize(0, 0) + 49871), 462826032, false, $$f(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i17 += 95;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr4[i17];
                    Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Gravity.getAbsoluteGravity(0, 0), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (49871 - TextUtils.getCapsMode("", 0, 0)), 462826032, false, $$f(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i17++;
                }
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2943 - MotionEvent.axisFromString(""), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (27637 - ExpandableListView.getPackedPositionType(0L)), -1616366948, false, $$f(b12, b13, (byte) (b13 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00c4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaymentSettingActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.basic_payment_setting));
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = copydefault + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 6, new int[]{-1304537403, -921597073, 1926409891, 351027239, -1109266409, 713986971, -1780261579, 1702054336, 1185744457, -1225049421, -1758589829, -958941333, 952334529, 658591016}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new int[]{845574128, 842371810, -553347797, -1674814913, -1677262890, -286580202, 713152303, 2044952679, 157968280, 2100394651}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = component1 + 25;
            copydefault = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6617, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Drawable.resolveOpacity(0, 0), View.resolveSizeAndState(0, 0, 0) + 56, (char) View.resolveSize(0, 0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myTid() >> 22), 42 - Gravity.getAbsoluteGravity(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 56, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                int i5 = component1 + 7;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
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

    private static void e(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        char c3 = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 123;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7421 - TextUtils.indexOf("", c3, 0), (Process.myPid() >> 22) + 15, (char) (64291 - (ViewConfiguration.getPressedStateDuration() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    c3 = '0';
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
        try {
            Object[] objArr3 = {Integer.valueOf(component3)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            char c4 = '\b';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 15 - Color.blue(0), (char) (64291 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
                int i7 = $11 + 109;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                int i9 = $10 + 81;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i11 = $11 + 75;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        c2 = c4;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[c4] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 7117;
                            int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0', 0, 0);
                            char fadingEdgeLength = (char) (44463 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[c4] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, iLastIndexOf, fadingEdgeLength, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i13 = $10 + 87;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = cancelall;
                            objArr5[9] = Integer.valueOf(cCharValue);
                            objArr5[c4] = cancelall;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = cancelall;
                            objArr5[4] = cancelall;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[2] = Integer.valueOf(cCharValue);
                            objArr5[1] = cancelall;
                            objArr5[0] = cancelall;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                int scrollBarFadeDuration = 2944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24;
                                char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27637);
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                String str$$f = $$f(b3, b4, (byte) (b4 | Ascii.SI));
                                c2 = '\b';
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, scrollDefaultDelay, scrollDefaultDelay2, 794909189, false, str$$f, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = c4;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                            int i16 = $11 + 33;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                int i17 = 4 / 2;
                            }
                        } else {
                            c2 = c4;
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i18 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i18];
                                cArr4[cancelall.component2 + 1] = cArr2[i19];
                            } else {
                                int i20 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i21 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i20];
                                cArr4[cancelall.component2 + 1] = cArr2[i21];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    c4 = c2;
                }
            }
            for (int i22 = 0; i22 < i; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) - 82, new int[]{-1304537403, -921597073, 1926409891, 351027239, -1109266409, 713986971, -1780261579, 1702054336, 1185744457, -1225049421, -1758589829, -958941333, 952334529, 658591016}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 96, new int[]{845574128, 842371810, -553347797, -1674814913, -1677262890, -286580202, 713152303, 2044952679, 157968280, 2100394651}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            int i4 = component1 + 115;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0), 42 - Color.blue(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 56, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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

    @Override
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext = context;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 93, new int[]{-1304537403, -921597073, 1926409891, 351027239, 1925570452, -66244432, 1995889281, 1070642672, 376337747, 2048359033}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, new char[]{24, 6, 2, 1, 13824}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1), objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            if (applicationContext != null) {
                int i2 = component1 + 47;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6617, 42 - ExpandableListView.getPackedPositionGroup(0L), (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, new char[]{'\t', 11, 0, '\f', 17, 5, 2, 23, CharUtils.CR, 1, 19, '\n', CharUtils.CR, '\t', 20, 17, 17, 4, 13835, 13835, 7, '\t', 17, 20, 17, CharUtils.CR, CharUtils.CR, 15, 16, '\t', 13912, 13912, 21, 7, '\f', 1, '\t', '\n', 1, '\b', 16, 19, 14, 1, 17, '\b', 19, 15}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() + 91), objArr3);
                    String str = (String) objArr3[0];
                    Object[] objArr4 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 63, new char[]{'\n', 0, 7, 3, CharUtils.CR, 16, 13938, 13938, '\n', 15, 3, 17, '\n', 19, 13938, 13938, 6, CharUtils.CR, 14, 17, '\f', 11, CharUtils.CR, 6, CharUtils.CR, 2, 23, 5, 17, '\n', 16, 15, '\f', CharUtils.CR, 4, 18, 23, 21, 3, 4, 2, CharUtils.CR, '\f', 4, 14, 0, 0, 3, 0, '\n', '\t', 16, '\f', 17, 11, CharUtils.CR, 18, 5, '\n', CharUtils.CR, '\t', CharUtils.CR, 19, '\n'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 120), objArr4);
                    String str2 = (String) objArr4[0];
                    Object[] objArr5 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8162, new char[]{'\f', 11, '\n', 22, 0, 17, '\t', 0, 18, 0, 0, CharUtils.CR, 6, '\f', '\t', 24, 23, 2, 13795, 13795, 6, '\b', '\n', 17, 15, 23, 18, 5, 23, 5, 5, CharUtils.CR, '\n', 16, 1, CharUtils.CR, 0, 22, 17, 2, 5, 17, '\f', '\t', '\f', '\n', '\b', 0, 7, '\f', 4, CharUtils.CR, 1, '\f', 14, 16, 7, 21, '\n', 7, 16, 19, 0, 4}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 51), objArr5);
                    String str3 = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    d((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, new int[]{412491407, 667566721, -336945163, 2035669262, -710565020, 1970052646, -850785772, 495704842, 1327889086, -1960124872, -417867227, -188119777, -407076523, 6973411, -1573181287, -416612326, -52705123, -1881869023, 1238597354, 344978490, 243707296, 1532647771, -596032128, 1025296002, 1110647208, -516546662, 173661622, 1401054797, -213256548, -628862424, 1066388178, -411534297, -1651009600, -414433336, 497587511, 586861221}, objArr6);
                    String str4 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 23, new int[]{1574314210, -716074094, -1473802321, -176018178}, objArr7);
                    String str5 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    d(35 - TextUtils.lastIndexOf("", '0'), new int[]{-1184148937, -265160833, -1366535119, -541862651, -1714682763, 1086650583, 1625426366, -130114939, 208961915, 685586186, 1464482162, 1619392643, -71850129, -929194185, -1755125754, -1623094566, -962552994, -219940519}, objArr8);
                    Object[] objArr9 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr8[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6562, TextUtils.getCapsMode("", 0, 0) + 56, (char) View.MeasureSpec.getSize(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr9);
                    int i4 = copydefault + 57;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    public static void $r8$lambda$WG4OIJNPnVUV_aiwScixE7rF1D8(View view) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10278instrumented$0$onCreate$LandroidosBundleV(view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m10278instrumented$0$onCreate$LandroidosBundleV(View view) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                lambda$onCreate$0(view);
                Callback.onClick_exit();
                int i4 = 83 / 0;
            } else {
                lambda$onCreate$0(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component1 + 61;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }
}
