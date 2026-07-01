package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baseui.R;
import com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding;

public class SafeOtpInputKeyboard extends ConstraintLayout implements View.OnClickListener {
    private static int component1 = 1;
    private static int copydefault;
    private LayoutSafeInputKeyboardOtpBinding binding;
    private OnInputListener onInputListener;

    public interface OnInputListener {
        default void onBiometric(String str) {
            int i = 2 % 2;
        }

        void onDelete();

        void onForget();

        void onInput(char c2);
    }

    public SafeOtpInputKeyboard(Context context) {
        super(context);
        init();
    }

    public SafeOtpInputKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SafeOtpInputKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setOnInputListener(OnInputListener onInputListener) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onInputListener = onInputListener;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 71;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void init() {
        int i = 2 % 2;
        LayoutSafeInputKeyboardOtpBinding layoutSafeInputKeyboardOtpBindingInflate = LayoutSafeInputKeyboardOtpBinding.inflate(LayoutInflater.from(getContext()), this, true);
        this.binding = layoutSafeInputKeyboardOtpBindingInflate;
        setBackground(layoutSafeInputKeyboardOtpBindingInflate.tvInput0);
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
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < childCount) {
            int i5 = copydefault + 117;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                root.getChildAt(i4).setOnClickListener(this);
                i4 += 13;
            } else {
                root.getChildAt(i4).setOnClickListener(this);
                i4++;
            }
        }
    }

    public void showBiometric() {
        int i = 2 % 2;
        if (BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            int i2 = component1 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_face_id);
            this.binding.biometricLayout.setVisibility(0);
            setBiometricClick(true);
        } else if (BiometricHelper2.getInstance().isOpenFingerprintPay()) {
            int i4 = copydefault + 105;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_fingerprint);
            this.binding.biometricLayout.setVisibility(0);
            setBiometricClick(false);
        } else {
            this.binding.biometricLayout.setVisibility(4);
        }
        int i6 = copydefault + 115;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
    }

    private void lambda$setBiometricClick$0(boolean z, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        showBiometric(z);
        int i4 = copydefault + 79;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setBiometricClick(final boolean z) {
        int i = 2 % 2;
        FastClickUtils.setOnClickListener(this.binding.biometricLayout, new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 23;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SafeOtpInputKeyboard.m10194$r8$lambda$FJgeuXtmprK3fInbBGO0pURVkU(this.f$0, z, view);
                int i5 = ShareDataUIState + 29;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void showBiometricVerify() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            showBiometric(true);
            int i4 = component1 + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (BiometricHelper2.getInstance().isOpenFingerprintPay()) {
            int i6 = component1 + 25;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            showBiometric(false);
        }
    }

    public void showBiometric(boolean z) {
        int i = 2 % 2;
        ApiCallback<String> apiCallback = new ApiCallback<String>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component1 + 113;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(str);
                if (i4 != 0) {
                    int i5 = 0 / 0;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void ShareDataUIState(java.lang.String r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.AnonymousClass2.component1
                    int r1 = r1 + 97
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.AnonymousClass2.component2 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L1e
                    super.onSuccess(r4)
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.this
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard$OnInputListener r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.m10195$$Nest$fgetonInputListener(r1)
                    r2 = 25
                    int r2 = r2 / 0
                    if (r1 == 0) goto L32
                    goto L29
                L1e:
                    super.onSuccess(r4)
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.this
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard$OnInputListener r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.m10195$$Nest$fgetonInputListener(r1)
                    if (r1 == 0) goto L32
                L29:
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.this
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard$OnInputListener r1 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.m10195$$Nest$fgetonInputListener(r1)
                    r1.onBiometric(r4)
                L32:
                    int r4 = com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.AnonymousClass2.component2
                    int r4 = r4 + 27
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.AnonymousClass2.component1 = r1
                    int r4 = r4 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard.AnonymousClass2.ShareDataUIState(java.lang.String):void");
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                if (baseException.getCode() == 7) {
                    int i5 = component1 + 101;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    CommonToast.showText(R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                    int i7 = component2 + 1;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        };
        if (z) {
            int i2 = component1 + 75;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                BiometricHelper2.getInstance().payWithFaceId(apiCallback);
                return;
            } else {
                BiometricHelper2.getInstance().payWithFaceId(apiCallback);
                int i3 = 62 / 0;
                return;
            }
        }
        BiometricHelper2.getInstance().payWithFingerprint(apiCallback);
    }

    @Override
    public void onClick(View view) {
        int i = 2 % 2;
        Callback.onClick_enter(view);
        try {
            if (view instanceof LinearLayout) {
                OnInputListener onInputListener = this.onInputListener;
                if (onInputListener != null) {
                    int i2 = component1 + 63;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    onInputListener.onDelete();
                }
            } else {
                CharSequence text = ((TextView) view).getText();
                if (TextUtils.equals("forget", text)) {
                    OnInputListener onInputListener2 = this.onInputListener;
                    if (onInputListener2 != null) {
                        int i4 = component1 + 55;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        onInputListener2.onForget();
                    }
                } else {
                    OnInputListener onInputListener3 = this.onInputListener;
                    if (onInputListener3 != null) {
                        onInputListener3.onInput(text.charAt(0));
                    }
                }
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    public static void m10194$r8$lambda$FJgeuXtmprK3fInbBGO0pURVkU(SafeOtpInputKeyboard safeOtpInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10196instrumented$0$setBiometricClick$ZV(safeOtpInputKeyboard, z, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static OnInputListener m10195$$Nest$fgetonInputListener(SafeOtpInputKeyboard safeOtpInputKeyboard) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        OnInputListener onInputListener = safeOtpInputKeyboard.onInputListener;
        if (i3 != 0) {
            return onInputListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m10196instrumented$0$setBiometricClick$ZV(SafeOtpInputKeyboard safeOtpInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            safeOtpInputKeyboard.lambda$setBiometricClick$0(z, view);
            Callback.onClick_exit();
            int i4 = component1 + 63;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private void setBackground(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
