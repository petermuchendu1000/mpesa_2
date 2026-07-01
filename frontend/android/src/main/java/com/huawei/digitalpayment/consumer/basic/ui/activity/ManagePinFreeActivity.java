package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.util.ActivityUtils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel.ManagePinFreeViewModel;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.getActiveNotifications;

public class ManagePinFreeActivity extends Hilt_ManagePinFreeActivity<ActivityBasePinBinding, ManagePinFreeViewModel> {
    private String pinFreeAmount;
    private boolean pinFreeStatus;
    private static final byte[] $$d = {115, -125, 45, -41};
    private static final int $$e = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int equals = 1;
    private static int[] copydefault = {-135466222, 1043627541, 1383534306, -353025370, -586286983, -1409723358, -1257861192, 1269450142, 1408893357, -1599312934, 1570891231, -1010380678, -1439201105, -763263369, 1606100447, -1160455890, -1752628288, 7344433};
    private static char[] component3 = {30228, 30216, 30252, 30232, 30237, 30242, 30220, 30227, 30236, 30231, 30221, 30400, 30225, 30229, 30240, 30230, 30408, 30416, 30239, 30415, 30414, 30417, 30418, 30243, 30412, 30413, 30409, 30419, 30423, 30420};
    private static int component1 = 321287809;
    private static boolean ShareDataUIState = true;
    private static boolean component2 = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(byte r6, int r7, short r8) {
        /*
            int r6 = r6 + 68
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.ManagePinFreeActivity.$$d
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ManagePinFreeActivity.$$f(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ManagePinFreeActivity.onCreate(android.os.Bundle):void");
    }

    private static void d(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        int i3 = 38;
        char c2 = '0';
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) i6;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, i6) + 4392, Color.blue(i6) + 37, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -309236339, false, $$f(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 38;
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
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 99;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i8]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        iArr2 = iArr6;
                        byte b4 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4390, 37 - Color.green(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -309236339, false, $$f((byte) 38, b4, b4), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i8++;
                    iArr6 = iArr2;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr7;
        }
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c3] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i11 = $10 + 11;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = 0; i13 < 16; i13++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i13];
                try {
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.getGidForName("") + 17, (char) (AndroidCharacter.getMirror('0') + 49823), 462826032, false, $$f((byte) 36, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i14 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i14;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i15 = getactivenotifications.ShareDataUIState;
            int i16 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 2944, 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (27637 - (ViewConfiguration.getTapTimeout() >> 16)), -1616366948, false, $$f((byte) 39, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i17 = $10 + 113;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        int i2 = equals + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        DialogUtils.showLoading(this);
        ((ManagePinFreeViewModel) this.viewModel).managePinFreePayment(String.valueOf(this.pinFreeStatus), this.pinFreeAmount, EncryptUtils.encryptWithPinKey(str));
        int i4 = copy + 87;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component1(bool);
                if (i4 == 0) {
                    int i5 = 53 / 0;
                }
            }

            public void component1(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ActivityUtils.finishToActivity((Activity) ManagePinFreeActivity.this, false, true);
                int i5 = ShareDataUIState + 13;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = copy + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void addObserver() {
        int i = 2 % 2;
        ((ManagePinFreeViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 115;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ManagePinFreeActivity.$r8$lambda$Zz8fz_ZuM63nT8P5iEGUzKfTLow(this.f$0, (Resource) obj);
                int i5 = component2 + 3;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = copy + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component3;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 65;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 3760, (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 23, (char) Drawable.resolveOpacity(0, 0), -1670574543, false, $$f(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3761 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 24, (char) (ViewConfiguration.getLongPressTimeout() >> 16), -1670574543, false, $$f(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i2 = 2;
                f = 0.0f;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component1)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7139, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i6 = 689978476;
        if (component2) {
            int i7 = $11 + 97;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i6);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 5;
                    byte b7 = (byte) (b6 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 2748, Color.rgb(0, 0, 0) + 16777235, (char) (7644 - Color.green(0)), -327556343, false, $$f(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i6 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!ShareDataUIState) {
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
        int i9 = $10 + 5;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr6 = {cancelVar, cancelVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault5 == null) {
                byte b8 = (byte) 5;
                byte b9 = (byte) (b8 - 5);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2749, View.getDefaultSize(0, 0) + 19, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7644), -327556343, false, $$f(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    private void lambda$addObserver$0(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 59;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            DialogUtils.hideLoading(this);
            resource.error();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DialogUtils.hideLoading(this);
        if (resource.error()) {
            ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            int i3 = equals + 87;
            copy = i3 % 128;
            int i4 = i3 % 2;
        }
        if (resource.success()) {
            Intent intent = new Intent();
            intent.putExtra(KeysConstants.KEY_PIN_FREE_STATUS, this.pinFreeStatus);
            setResult(-1, intent);
            finish();
        }
        int i5 = copy + 47;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(R.string.payment_pinfree_title2), getString(R.string.payment_pinfree_tips5, new Object[]{Integer.valueOf(AppConfigManager.getAppConfig().getPinLimit())}), getString(R.string.payment_pinfree_button3), getString(R.string.payment_pinfree_button4));
        int i2 = equals + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ManagePinFreeActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = copy + 5;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).length() + 25, new int[]{1375347590, 265686231, 1586354997, -2102286629, -425766619, 807074802, -1014759708, -1915370207, -248220654, -739521202, -609157027, 162610636, -1546934782, -85853203}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 126, new byte[]{-118, -112, -124, -117, -113, -122, -124, -114, -115, -115, -116, -117, -118, -119, -120, -120, -121, -122}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = equals + 89;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = equals + 105;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = copy + 77;
            equals = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6618, View.getDefaultSize(0, 0) + 42, (char) Color.argb(0, 0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6562, 16777272 + Color.rgb(0, 0, 0), (char) Color.green(0), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ManagePinFreeActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$Zz8fz_ZuM63nT8P5iEGUzKfTLow(ManagePinFreeActivity managePinFreeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        managePinFreeActivity.lambda$addObserver$0(resource);
        int i4 = equals + 111;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 37;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 13;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
