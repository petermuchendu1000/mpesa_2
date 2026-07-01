package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baseui.R;
import com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardLoginBinding;
import kotlin.removeMenuProvider;

public class LoginSafeInputKeyboard extends RoundConstraintLayout implements View.OnClickListener {
    private static int ShareDataUIState = 1;
    private static int component2;
    private LayoutSafeInputKeyboardLoginBinding binding;
    private OnInputListener onInputListener;

    public interface OnInputListener {
        default void onBiometric(String str) {
            int i = 2 % 2;
        }

        void onDelete();

        void onForget();

        void onInput(char c2);
    }

    public LoginSafeInputKeyboard(Context context) {
        super(context);
        init();
    }

    public LoginSafeInputKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LoginSafeInputKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setOnInputListener(OnInputListener onInputListener) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.onInputListener = onInputListener;
        int i5 = i2 + 7;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void init() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSafeInputKeyboardLoginBinding layoutSafeInputKeyboardLoginBindingInflate = LayoutSafeInputKeyboardLoginBinding.inflate(LayoutInflater.from(getContext()), this, true);
        this.binding = layoutSafeInputKeyboardLoginBindingInflate;
        setBackground(layoutSafeInputKeyboardLoginBindingInflate.tvInput0);
        setBackground(this.binding.tvInput1);
        setBackground(this.binding.tvInput2);
        setBackground(this.binding.tvInput3);
        setBackground(this.binding.tvInput4);
        setBackground(this.binding.tvInput5);
        setBackground(this.binding.tvInput6);
        setBackground(this.binding.tvInput7);
        setBackground(this.binding.tvInput8);
        setBackground(this.binding.tvInput9);
        ConstraintLayout root = this.binding.getRoot();
        int childCount = root.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            root.getChildAt(i4).setOnClickListener(this);
            i4++;
            int i5 = component2 + 101;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private void setBackground(View view) {
        int i = 2 % 2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorUtils.getColor(R.color.colorSecondLevelBorder));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(ColorUtils.getColor(R.color.colorGround));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(ColorUtils.getColor(R.color.colorGround));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable3);
        view.setBackground(stateListDrawable);
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void showBiometric() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (!BiometricHelper2.getInstance().isOpenFaceIdLogin()) {
            if (!BiometricHelper2.getInstance().isOpenFingerprintLogin()) {
                this.binding.biometricLayout.setVisibility(4);
                return;
            }
            this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_fingerprint);
            this.binding.biometricLayout.setVisibility(0);
            setBiometricClick(false);
            int i4 = component2 + 73;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = component2 + 111;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_face_id);
        this.binding.biometricLayout.setVisibility(0);
        setBiometricClick(true);
    }

    private void setBiometricClick(final boolean z) {
        int i = 2 % 2;
        FastClickUtils.setOnClickListener(this.binding.biometricLayout, new View.OnClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 91;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                LoginSafeInputKeyboard.m10185$r8$lambda$DCkJGGhphVxbogJapkPjF0GfAM(this.f$0, z, view);
                int i5 = component1 + 69;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    private void lambda$setBiometricClick$0(boolean z, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        showBiometric(z);
        int i4 = ShareDataUIState + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void showBiometricVerify() {
        int i = 2 % 2;
        if (!BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            if (BiometricHelper2.getInstance().isOpenFingerprintPay()) {
                int i2 = ShareDataUIState + 53;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    showBiometric(true);
                    return;
                } else {
                    showBiometric(false);
                    return;
                }
            }
            return;
        }
        int i3 = component2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        showBiometric(true);
    }

    public class AnonymousClass2 implements ApiCallback<String> {
        private static int component1 = 0;
        private static int component2 = 1;

        AnonymousClass2() {
        }

        @Override
        public void onSuccess(String str) {
            int i = 2 % 2;
            int i2 = component2 + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(str);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
        }

        public void ShareDataUIState(String str) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            super.onSuccess(str);
            if (LoginSafeInputKeyboard.m10186$$Nest$fgetonInputListener(LoginSafeInputKeyboard.this) != null) {
                int i4 = component2 + 123;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                OnInputListener onInputListenerM10186$$Nest$fgetonInputListener = LoginSafeInputKeyboard.m10186$$Nest$fgetonInputListener(LoginSafeInputKeyboard.this);
                if (i5 == 0) {
                    onInputListenerM10186$$Nest$fgetonInputListener.onBiometric(str);
                } else {
                    onInputListenerM10186$$Nest$fgetonInputListener.onBiometric(str);
                    throw null;
                }
            }
        }

        @Override
        public void onError(BaseException baseException) {
            int i = 2 % 2;
            int i2 = component1 + 53;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                super.onError(baseException);
                if (baseException.getCode() != 125) {
                    return;
                }
            } else {
                super.onError(baseException);
                if (baseException.getCode() != 7) {
                    return;
                }
            }
            int i3 = component1 + 69;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            CommonToast.showText(R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
            int i5 = component1 + 7;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public static void component1() {
            removeMenuProvider.ShareDataUIState[0] = Class.forName("com.blankj.utilcode.util.Utils$Task").getDeclaredField("component1");
        }
    }

    public void showBiometric(boolean z) {
        int i = 2 % 2;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        Object obj = null;
        if (z) {
            int i2 = ShareDataUIState + 89;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                BiometricHelper2.getInstance().loginWithFaceId(anonymousClass2);
                obj.hashCode();
                throw null;
            }
            BiometricHelper2.getInstance().loginWithFaceId(anonymousClass2);
        } else {
            BiometricHelper2.getInstance().loginWithFingerprint(anonymousClass2);
        }
        int i3 = component2 + 81;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022 A[Catch: all -> 0x0070, PHI: r6
  0x0022: PHI (r6v11 com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener) = 
  (r6v10 com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener)
  (r6v15 com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener)
 binds: [B:13:0x0020, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0006, B:8:0x0016, B:29:0x006c, B:14:0x0022, B:12:0x001e, B:16:0x002f, B:18:0x003d, B:22:0x004c, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:28:0x0065), top: B:34:0x0006 }] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            com.dynatrace.android.callback.Callback.onClick_enter(r6)
            boolean r1 = r6 instanceof android.widget.LinearLayout     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r1 == 0) goto L2f
            int r6 = com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.component2
            int r6 = r6 + 109
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.ShareDataUIState = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L1e
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener r6 = r5.onInputListener     // Catch: java.lang.Throwable -> L70
            r1 = 17
            int r1 = r1 / r2
            if (r6 == 0) goto L6c
            goto L22
        L1e:
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener r6 = r5.onInputListener     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L6c
        L22:
            r6.onDelete()     // Catch: java.lang.Throwable -> L70
            int r6 = com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.component2
            int r6 = r6 + 49
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.ShareDataUIState = r1
            int r6 = r6 % r0
            goto L6c
        L2f:
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> L70
            java.lang.CharSequence r6 = r6.getText()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "forget"
            boolean r1 = android.text.TextUtils.equals(r1, r6)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L58
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener r6 = r5.onInputListener     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L6c
            int r1 = com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.component2
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L50
            r6.onForget()     // Catch: java.lang.Throwable -> L70
            goto L6c
        L50:
            r6.onForget()     // Catch: java.lang.Throwable -> L70
            r6 = 0
            r6.hashCode()     // Catch: java.lang.Throwable -> L70
            throw r6     // Catch: java.lang.Throwable -> L70
        L58:
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard$OnInputListener r1 = r5.onInputListener     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6c
            int r3 = com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.ShareDataUIState
            int r3 = r3 + 65
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.component2 = r4
            int r3 = r3 % r0
            char r6 = r6.charAt(r2)     // Catch: java.lang.Throwable -> L70
            r1.onInput(r6)     // Catch: java.lang.Throwable -> L70
        L6c:
            com.dynatrace.android.callback.Callback.onClick_exit()     // Catch: java.lang.Throwable -> L70
            return
        L70:
            r6 = move-exception
            com.dynatrace.android.callback.Callback.onClick_exit()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.widget.LoginSafeInputKeyboard.onClick(android.view.View):void");
    }

    public static void m10185$r8$lambda$DCkJGGhphVxbogJapkPjF0GfAM(LoginSafeInputKeyboard loginSafeInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m10187instrumented$0$setBiometricClick$ZV(loginSafeInputKeyboard, z, view);
        int i4 = component2 + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static OnInputListener m10186$$Nest$fgetonInputListener(LoginSafeInputKeyboard loginSafeInputKeyboard) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        OnInputListener onInputListener = loginSafeInputKeyboard.onInputListener;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = i3 + 81;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return onInputListener;
    }

    private static void m10187instrumented$0$setBiometricClick$ZV(LoginSafeInputKeyboard loginSafeInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            loginSafeInputKeyboard.lambda$setBiometricClick$0(z, view);
            Callback.onClick_exit();
            int i4 = component2 + 117;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
