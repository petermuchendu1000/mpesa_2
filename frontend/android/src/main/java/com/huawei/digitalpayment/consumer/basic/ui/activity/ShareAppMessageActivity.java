package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.databinding.ViewDataBinding;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.contract.ContactsUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.AppShareViewModel;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.getActiveNotifications;
import org.apache.commons.lang3.CharUtils;

public class ShareAppMessageActivity extends Hilt_ShareAppMessageActivity<ActivityShareAppMessageBinding, AppShareViewModel> implements View.OnClickListener {
    private static final byte[] $$d = {69, -50, 81, 75};
    private static final int $$e = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int component1 = 1;
    private static char[] component3 = {2020, 1971, 1985, 2031, 2034, 1969, 1048, 2004, 1977, 1049, 2018, 2019, 2032, 2024, 1970, 1966, 1976, 2017, 2028, 2022, 2037, 2035, 1968, 1972, 1975, 1973, 2000, 1050, 2030, 2025, 1974, 2021, 2041, 2038, 2036, 1051};
    private static char ShareDataUIState = 12828;
    private static int[] copydefault = {1170077446, -681702347, 1675385276, 349713227, -691682964, 1429125748, 198469782, 1946736692, 717083407, -1564906007, -1052734045, 1224333575, -603602650, -293947776, -930598523, -1551141146, 899068297, -350050887};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.$$d
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = 119 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.$$f(short, short, byte):java.lang.String");
    }

    static ViewDataBinding access$000(ShareAppMessageActivity shareAppMessageActivity) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = shareAppMessageActivity.binding;
        int i4 = component1 + 57;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ViewDataBinding access$100(ShareAppMessageActivity shareAppMessageActivity) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = shareAppMessageActivity.binding;
        int i4 = component1 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    static ViewDataBinding access$200(ShareAppMessageActivity shareAppMessageActivity) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = shareAppMessageActivity.binding;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = component1 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return binding;
    }

    static ViewDataBinding access$300(ShareAppMessageActivity shareAppMessageActivity) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = shareAppMessageActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainerInitToolbar = super.initToolbar(R.layout.sfc_toolbar_layout);
        if (toolbarContainerInitToolbar.tvTitle != null) {
            toolbarContainerInitToolbar.tvTitle.setText(getString(R.string.my_app_share_title1));
            int i4 = component1 + 103;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
        }
        if (toolbarContainerInitToolbar.ivStart != null) {
            toolbarContainerInitToolbar.ivStart.setImageResource(R.drawable.ic_sfc_back);
            toolbarContainerInitToolbar.ivStart.setOnClickListener(new View.OnClickListener() {
                private static int component1 = 1;
                private static int component2;

                /* JADX WARN: Finally extract failed */
                @Override
                public void onClick(View view) {
                    int i6 = 2 % 2;
                    int i7 = component1 + 29;
                    component2 = i7 % 128;
                    try {
                        if (i7 % 2 != 0) {
                            Callback.onClick_enter(view);
                            ShareAppMessageActivity.this.finish();
                            Callback.onClick_exit();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Callback.onClick_enter(view);
                        ShareAppMessageActivity.this.finish();
                        Callback.onClick_exit();
                        int i8 = component1 + 111;
                        component2 = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Throwable th) {
                        Callback.onClick_exit();
                        throw th;
                    }
                }
            });
        }
        if (toolbarContainerInitToolbar.rootToolbar != null) {
            int i6 = component2 + 93;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            toolbarContainerInitToolbar.rootToolbar.setBackgroundColor(getColor(R.color.color_home_background));
            if (i7 == 0) {
                int i8 = 1 / 0;
            }
        }
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        int i4 = 684241640;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 37, (char) ((Process.getThreadPriority(0) + 20) >> 6), -309236339, false, $$f(b2, (byte) (b2 | 13), b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 39;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int i9 = $10 + 111;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 37;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr6[i10]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) i5;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - Color.green(i5), 36 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.resolveSizeAndState(i5, i5, i5), -309236339, false, $$f(b3, (byte) (b3 | 13), b3), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i10++;
                i5 = 0;
            }
            i2 = i5;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i13 = $11 + 117;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i15];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (KeyEvent.getMaxKeyCode() >> i16), 16 - View.resolveSizeAndState(0, 0, 0), (char) (49872 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 462826032, false, $$f(b4, (byte) (b4 | Ascii.SI), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i15++;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
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
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - View.getDefaultSize(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 24, (char) (27637 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), -1616366948, false, $$f(b5, (byte) (b5 | Ascii.FF), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private void lambda$onCreate$0(View view) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        selectContacts();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component1 + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0186  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.hideLoading(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r4.error() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        com.huawei.common.util.ToastUtils.showLong(r4.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = new android.os.Bundle(2);
        r4.putString(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.PAGE_TITLE, getString(com.huawei.digitalpayment.consumer.basic.R.string.basic_successful));
        r4.putString(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.PAGE_BUTTON, getString(com.huawei.digitalpayment.consumer.basic.R.string.basic_ok));
        com.huawei.arouter.RouteUtils.routeWithExecute(com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants.SIMPLE_RESULT, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component2 + 53;
        com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component1 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.showLoading(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$onCreate$1(com.huawei.payment.mvvm.Resource r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component1
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r4.loading()
            r2 = 31
            int r2 = r2 / 0
            if (r1 == 0) goto L23
            goto L1f
        L19:
            boolean r1 = r4.loading()
            if (r1 == 0) goto L23
        L1f:
            com.huawei.common.widget.dialog.DialogManager.showLoading(r3)
            return
        L23:
            com.huawei.common.widget.dialog.DialogManager.hideLoading(r3)
            boolean r1 = r4.error()
            if (r1 == 0) goto L34
            java.lang.String r4 = r4.getMessage()
            com.huawei.common.util.ToastUtils.showLong(r4)
            goto L54
        L34:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r0)
            int r1 = com.huawei.digitalpayment.consumer.basic.R.string.basic_successful
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = "pageTitle"
            r4.putString(r2, r1)
            int r1 = com.huawei.digitalpayment.consumer.basic.R.string.basic_ok
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = "page_button"
            r4.putString(r2, r1)
            java.lang.String r1 = "/base/simpleResult"
            com.huawei.arouter.RouteUtils.routeWithExecute(r1, r4)
        L54:
            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component2
            int r4 = r4 + 53
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component1 = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.lambda$onCreate$1(com.huawei.payment.mvvm.Resource):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r4)) != true) goto L14;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component1
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L72
            com.dynatrace.android.callback.Callback.onClick_enter(r4)
            int r4 = r4.getId()     // Catch: java.lang.Throwable -> L70
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.lb_confirm     // Catch: java.lang.Throwable -> L70
            if (r4 != r1) goto L6c
            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component2
            int r4 = r4 + 95
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.component1 = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L3d
            Binding extends androidx.databinding.ViewDataBinding r4 = r3.binding     // Catch: java.lang.Throwable -> L70
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding r4 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding) r4     // Catch: java.lang.Throwable -> L70
            com.huawei.common.widget.input.CommonInputView r4 = r4.inputPhone     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r4.getText()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L70
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L70
            r1 = 66
            int r1 = r1 / 0
            if (r0 == 0) goto L60
            goto L53
        L3d:
            Binding extends androidx.databinding.ViewDataBinding r4 = r3.binding     // Catch: java.lang.Throwable -> L70
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding r4 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding) r4     // Catch: java.lang.Throwable -> L70
            com.huawei.common.widget.input.CommonInputView r4 = r4.inputPhone     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r4.getText()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L70
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L70
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L60
        L53:
            int r4 = com.huawei.digitalpayment.consumer.basic.R.string.my_app_message_share_tips5     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L70
            com.huawei.common.util.ToastUtils.showLong(r4)     // Catch: java.lang.Throwable -> L70
            com.dynatrace.android.callback.Callback.onClick_exit()     // Catch: java.lang.Throwable -> L70
            return
        L60:
            VM extends androidx.lifecycle.ViewModel r0 = r3.viewModel     // Catch: java.lang.Throwable -> L70
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.AppShareViewModel r0 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.AppShareViewModel) r0     // Catch: java.lang.Throwable -> L70
            com.huawei.digitalpayment.consumer.basicUi.request.SendMessageParams r1 = new com.huawei.digitalpayment.consumer.basicUi.request.SendMessageParams     // Catch: java.lang.Throwable -> L70
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L70
            r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L70
        L6c:
            com.dynatrace.android.callback.Callback.onClick_exit()     // Catch: java.lang.Throwable -> L70
            return
        L70:
            r4 = move-exception
            goto L7c
        L72:
            com.dynatrace.android.callback.Callback.onClick_enter(r4)
            r4.getId()     // Catch: java.lang.Throwable -> L70
            int r4 = com.huawei.digitalpayment.consumer.basic.R.id.lb_confirm     // Catch: java.lang.Throwable -> L70
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L70
        L7c:
            com.dynatrace.android.callback.Callback.onClick_exit()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.onClick(android.view.View):void");
    }

    private void selectContacts() {
        int i = 2 % 2;
        ContactsUtils.selectContacts(this, new ApiCallback<String>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 73;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(str);
                int i5 = component2 + 53;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void copydefault(java.lang.String r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.AnonymousClass1.copydefault
                    int r1 = r1 + 3
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.AnonymousClass1.component2 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L19
                    boolean r1 = android.text.TextUtils.isEmpty(r4)
                    r2 = 50
                    int r2 = r2 / 0
                    if (r1 != 0) goto L57
                    goto L1f
                L19:
                    boolean r1 = android.text.TextUtils.isEmpty(r4)
                    if (r1 != 0) goto L57
                L1f:
                    java.lang.String r4 = com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils.filterUnNumber(r4)
                    com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.this
                    androidx.databinding.ViewDataBinding r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.access$100(r1)
                    com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding r1 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding) r1
                    com.huawei.common.widget.input.CommonInputView r1 = r1.inputPhone
                    android.widget.EditText r1 = r1.getEditText()
                    r1.setText(r4)
                    com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.this
                    androidx.databinding.ViewDataBinding r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.access$300(r4)
                    com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding r4 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding) r4
                    com.huawei.common.widget.input.CommonInputView r4 = r4.inputPhone
                    android.widget.EditText r4 = r4.getEditText()
                    com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.this
                    androidx.databinding.ViewDataBinding r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.access$200(r1)
                    com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding r1 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityShareAppMessageBinding) r1
                    com.huawei.common.widget.input.CommonInputView r1 = r1.inputPhone
                    java.lang.String r1 = r1.getText()
                    int r1 = r1.length()
                    r4.setSelection(r1)
                L57:
                    int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.AnonymousClass1.copydefault
                    int r4 = r4 + 99
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.AnonymousClass1.component2 = r1
                    int r4 = r4 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.AnonymousClass1.copydefault(java.lang.String):void");
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 97;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ToastUtils.showShort(baseException.getResponseDesc());
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = copydefault + 123;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component1 + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_share_app_message;
        int i5 = component1 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new char[]{16, 29, 1, 5, 5, 27, 3, '\f', '\f', CharUtils.CR, CharUtils.CR, 16, 5, '\b', '#', 28, '#', 27, '#', '!', CharUtils.CR, 19, 1, '\"', '\f', 5}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 40), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(18 - KeyEvent.getDeadChar(0, 0), new char[]{'\b', 23, 13894, 13894, '\"', 25, ' ', 4, 13896, 13896, 23, 24, 17, 23, '#', 28, 4, 27}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 93), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component1 + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0'), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 6562, TextUtils.indexOf("", "") + 56, (char) (ViewConfiguration.getTouchSlop() >> 8), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i4 = component1 + 17;
                component2 = i4 % 128;
                int i5 = i4 % 2;
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

    private static void d(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component3;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7421, 15 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf("", "") + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c3 = 6;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7422, ((Process.getThreadPriority(0) + 20) >> 6) + 15, (char) (64291 - Color.argb(0, 0, 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i6 = $10 + 71;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 99;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                int i9 = $11 + 23;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                    c2 = c3;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[c3] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int scrollBarSize = 7117 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[c3] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iIndexOf, offsetBefore, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[5] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            int mode = 2944 - View.MeasureSpec.getMode(0);
                            int i11 = 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27637);
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$f = $$f(b3, b4, b4);
                            c2 = 6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(mode, i11, maxKeyCode, 794909189, false, str$$f, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i12];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[i13];
                            cArr4[cancelall.component2 + 1] = cArr3[i14];
                        } else {
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr3[i15];
                            cArr4[cancelall.component2 + 1] = cArr3[i16];
                        }
                    }
                }
                cancelall.component2 += 2;
                int i17 = $10 + 61;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                obj2 = obj;
                c3 = c2;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            int i20 = $11 + 89;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13220);
                i19 += 24;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ShareAppMessageActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$T2IzU8R8qF47rGQH1bUyMN49wjQ(ShareAppMessageActivity shareAppMessageActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        shareAppMessageActivity.lambda$onCreate$1(resource);
        int i4 = component1 + 87;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10290$r8$lambda$uCjt5qjlRiTXY6giESMdJXIW3k(ShareAppMessageActivity shareAppMessageActivity, View view) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m10291instrumented$0$onCreate$LandroidosBundleV(shareAppMessageActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    private static void m10291instrumented$0$onCreate$LandroidosBundleV(ShareAppMessageActivity shareAppMessageActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            shareAppMessageActivity.lambda$onCreate$0(view);
            Callback.onClick_exit();
            int i4 = component2 + 97;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
    }
}
