package com.huawei.digitalpayment.consumer.baselib.widget.code;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding;

public class SafeInputKeyboard extends RoundConstraintLayout implements View.OnClickListener {
    private static int component3 = 1;
    private static int copydefault;
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
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.onInputListener = onInputListener;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
    }

    private void init() {
        int i = 2 % 2;
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
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < childCount) {
            int i5 = copydefault + 109;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                root.getChildAt(i4).setOnClickListener(this);
                i4 += 13;
            } else {
                root.getChildAt(i4).setOnClickListener(this);
                i4++;
            }
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
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void showBiometric() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_face_id);
            this.binding.biometricLayout.setVisibility(0);
            setBiometricClick(true);
        } else {
            if (BiometricHelper2.getInstance().isOpenFingerprintPay()) {
                int i4 = component3 + 53;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_fingerprint);
                    this.binding.biometricLayout.setVisibility(0);
                    setBiometricClick(true);
                    return;
                } else {
                    this.binding.ivBiometric.setImageResource(R.mipmap.base_icon_fingerprint);
                    this.binding.biometricLayout.setVisibility(0);
                    setBiometricClick(false);
                    return;
                }
            }
            this.binding.biometricLayout.setVisibility(4);
        }
    }

    private void setBiometricClick(final boolean z) {
        int i = 2 % 2;
        FastClickUtils.setOnClickListener(this.binding.biometricLayout, new View.OnClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 79;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    SafeInputKeyboard.$r8$lambda$cPHVZTeyhhHJU48dK3yvf99ziYM(this.f$0, z, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                SafeInputKeyboard.$r8$lambda$cPHVZTeyhhHJU48dK3yvf99ziYM(this.f$0, z, view);
                int i4 = component2 + 21;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$setBiometricClick$0(boolean z, View view) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        showBiometric(z);
        int i4 = component3 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public void showBiometricVerify() {
        int i = 2 % 2;
        if (BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            showBiometric(true);
        } else if (!(!BiometricHelper2.getInstance().isOpenFingerprintPay())) {
            showBiometric(false);
            int i2 = copydefault + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = copydefault + 73;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void showBiometric(boolean z) {
        int i = 2 % 2;
        ApiCallback<String> apiCallback = new ApiCallback<String>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 119;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component1(str);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component1(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 95;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(str);
                if (SafeInputKeyboard.m10245$$Nest$fgetonInputListener(SafeInputKeyboard.this) != null) {
                    int i5 = component3 + 49;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    SafeInputKeyboard.m10245$$Nest$fgetonInputListener(SafeInputKeyboard.this).onBiometric(str);
                }
                int i7 = component2 + 117;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 1 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                super.onError(baseException);
                if (baseException.getCode() == 7) {
                    CommonToast.showText(R.string.biometric_the_operation_is_too_frequent_please_try_again_later);
                    int i3 = component2 + 31;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = component3 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        };
        if (z) {
            int i2 = component3 + 67;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BiometricHelper2.getInstance().payWithFaceId(apiCallback);
        } else {
            BiometricHelper2.getInstance().payWithFingerprint(apiCallback);
        }
        int i4 = copydefault + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onClick(View view) {
        int i = 2 % 2;
        Callback.onClick_enter(view);
        try {
            if (view instanceof LinearLayout) {
                OnInputListener onInputListener = this.onInputListener;
                if (onInputListener != null) {
                    int i2 = component3 + 83;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        onInputListener.onDelete();
                        int i3 = 57 / 0;
                    } else {
                        onInputListener.onDelete();
                    }
                }
            } else {
                CharSequence text = ((TextView) view).getText();
                if (TextUtils.equals("forget", text)) {
                    OnInputListener onInputListener2 = this.onInputListener;
                    if (onInputListener2 != null) {
                        int i4 = copydefault + 13;
                        component3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            onInputListener2.onForget();
                            throw null;
                        }
                        onInputListener2.onForget();
                    }
                } else {
                    OnInputListener onInputListener3 = this.onInputListener;
                    if (onInputListener3 != null) {
                        int i5 = component3 + 103;
                        copydefault = i5 % 128;
                        onInputListener3.onInput(i5 % 2 != 0 ? text.charAt(0) : text.charAt(0));
                    }
                }
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    public static void $r8$lambda$cPHVZTeyhhHJU48dK3yvf99ziYM(SafeInputKeyboard safeInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10246instrumented$0$setBiometricClick$ZV(safeInputKeyboard, z, view);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
    }

    static OnInputListener m10245$$Nest$fgetonInputListener(SafeInputKeyboard safeInputKeyboard) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        OnInputListener onInputListener = safeInputKeyboard.onInputListener;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return onInputListener;
    }

    private static void m10246instrumented$0$setBiometricClick$ZV(SafeInputKeyboard safeInputKeyboard, boolean z, View view) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                safeInputKeyboard.lambda$setBiometricClick$0(z, view);
                Callback.onClick_exit();
            } else {
                safeInputKeyboard.lambda$setBiometricClick$0(z, view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
