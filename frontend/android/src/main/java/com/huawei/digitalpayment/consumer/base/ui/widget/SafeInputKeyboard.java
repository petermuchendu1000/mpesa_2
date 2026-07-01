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
import com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardBinding;

public class SafeInputKeyboard extends ConstraintLayout implements View.OnClickListener {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private LayoutSafeInputKeyboardBinding binding;
    private OnInputListener onInputListener;

    public interface OnInputListener {
        default void onBiometric(String str) {
            int i = 2 % 2;
        }

        void onDelete();

        void onForget();

        void onInput(char c2);
    }

    public SafeInputKeyboard(Context context) {
        super(context);
        init();
    }

    public SafeInputKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SafeInputKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setOnInputListener(OnInputListener onInputListener) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.onInputListener = onInputListener;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
    }

    private void init() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutSafeInputKeyboardBinding layoutSafeInputKeyboardBindingInflate = LayoutSafeInputKeyboardBinding.inflate(LayoutInflater.from(getContext()), this, true);
        this.binding = layoutSafeInputKeyboardBindingInflate;
        setBackground(layoutSafeInputKeyboardBindingInflate.tvInput0);
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
        for (int i4 = 0; i4 < childCount; i4++) {
            root.getChildAt(i4).setOnClickListener(this);
        }
        int i5 = ShareDataUIState + 57;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void showBiometric() {
        int i = 2 % 2;
        if (BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            int i2 = copydefault + 9;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_face_id);
                this.binding.biometricLayout.setVisibility(0);
                setBiometricClick(false);
            } else {
                this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_face_id);
                this.binding.biometricLayout.setVisibility(0);
                setBiometricClick(true);
            }
        } else if (!BiometricHelper2.getInstance().isOpenFingerprintPay()) {
            this.binding.biometricLayout.setVisibility(4);
        } else {
            this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_fingerprint);
            this.binding.biometricLayout.setVisibility(0);
            setBiometricClick(false);
        }
        int i3 = ShareDataUIState + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
    }

    private void lambda$setBiometricClick$0(boolean z, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        showBiometric(z);
        int i4 = copydefault + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    private void setBiometricClick(final boolean z) {
        int i = 2 % 2;
        FastClickUtils.setOnClickListener(this.binding.biometricLayout, new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 81;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SafeInputKeyboard.$r8$lambda$dhTEVyc9XCj09XZlQ8dwBHlCCm4(this.f$0, z, view);
                int i5 = copydefault + 113;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
    }

    public void showBiometricVerify() {
        int i = 2 % 2;
        if (!BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            if (BiometricHelper2.getInstance().isOpenFingerprintPay()) {
                int i2 = copydefault + 47;
                ShareDataUIState = i2 % 128;
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
        int i3 = ShareDataUIState + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        showBiometric(true);
    }

    public void showBiometric(boolean z) {
        int i = 2 % 2;
        ApiCallback<String> apiCallback = new ApiCallback<String>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(str);
                if (i4 != 0) {
                    int i5 = 88 / 0;
                }
                int i6 = component3 + 57;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component1(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    super.onSuccess(str);
                    if (SafeInputKeyboard.m10192$$Nest$fgetonInputListener(SafeInputKeyboard.this) != null) {
                        int i4 = component3 + 79;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        OnInputListener onInputListenerM10192$$Nest$fgetonInputListener = SafeInputKeyboard.m10192$$Nest$fgetonInputListener(SafeInputKeyboard.this);
                        if (i5 == 0) {
                            onInputListenerM10192$$Nest$fgetonInputListener.onBiometric(str);
                            return;
                        } else {
                            onInputListenerM10192$$Nest$fgetonInputListener.onBiometric(str);
                            throw null;
                        }
                    }
                    return;
                }
                super.onSuccess(str);
                SafeInputKeyboard.m10192$$Nest$fgetonInputListener(SafeInputKeyboard.this);
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                if (baseException.getCode() == 7) {
                    CommonToast.showText(R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                    int i5 = component1 + 23;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        };
        if (z) {
            int i2 = ShareDataUIState + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BiometricHelper2.getInstance().payWithFaceId(apiCallback);
            int i4 = ShareDataUIState + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            BiometricHelper2.getInstance().payWithFingerprint(apiCallback);
        }
        int i6 = ShareDataUIState + 5;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (view instanceof LinearLayout) {
                OnInputListener onInputListener = this.onInputListener;
                if (onInputListener != null) {
                    onInputListener.onDelete();
                }
            } else {
                CharSequence text = ((TextView) view).getText();
                if (TextUtils.equals("forget", text)) {
                    int i4 = copydefault + 73;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    OnInputListener onInputListener2 = this.onInputListener;
                    if (onInputListener2 != null) {
                        onInputListener2.onForget();
                        int i6 = ShareDataUIState + 89;
                        copydefault = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 4 / 2;
                        }
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

    public static void $r8$lambda$dhTEVyc9XCj09XZlQ8dwBHlCCm4(SafeInputKeyboard safeInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10193instrumented$0$setBiometricClick$ZV(safeInputKeyboard, z, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 49;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    static OnInputListener m10192$$Nest$fgetonInputListener(SafeInputKeyboard safeInputKeyboard) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        OnInputListener onInputListener = safeInputKeyboard.onInputListener;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return onInputListener;
    }

    private static void m10193instrumented$0$setBiometricClick$ZV(SafeInputKeyboard safeInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                safeInputKeyboard.lambda$setBiometricClick$0(z, view);
            } else {
                safeInputKeyboard.lambda$setBiometricClick$0(z, view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    private void setBackground(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
