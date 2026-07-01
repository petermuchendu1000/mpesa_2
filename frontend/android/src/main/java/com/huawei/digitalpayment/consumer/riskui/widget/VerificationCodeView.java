package com.huawei.digitalpayment.consumer.riskui.widget;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.databinding.DataBindingUtil;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.Utils;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils;
import com.huawei.digitalpayment.consumer.riskui.R;
import com.huawei.digitalpayment.consumer.riskui.databinding.RiskVerificationCodeViewBinding;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0019H\u0014R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/riskui/widget/VerificationCodeView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcom/huawei/digitalpayment/consumer/riskui/databinding/RiskVerificationCodeViewBinding;", "getBinding", "()Lcom/huawei/digitalpayment/consumer/riskui/databinding/RiskVerificationCodeViewBinding;", "setBinding", "(Lcom/huawei/digitalpayment/consumer/riskui/databinding/RiskVerificationCodeViewBinding;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "downTimer", "Landroid/os/CountDownTimer;", "initView", "", "startTimer", "setListener", "getEditText", "Landroid/widget/EditText;", "onDetachedFromWindow", "Companion", "ConsumerRiskUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerificationCodeView extends RoundConstraintLayout {

    public static final Companion INSTANCE = new Companion(null);
    private static final int SMS_CODE_LENGTH = 6;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    public RiskVerificationCodeViewBinding binding;
    private final CountDownTimer downTimer;
    private View.OnClickListener listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerificationCodeView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerificationCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerificationCodeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.downTimer = new CountDownTimer() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            {
                super(60000L, 1000L);
            }

            @Override
            public void onTick(long millisUntilFinished) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 65;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                LoadingButton loadingButton = this.component1.getBinding().btnSend;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ENGLISH, "%ds", Arrays.copyOf(new Object[]{Long.valueOf(millisUntilFinished / ((long) 1000))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                loadingButton.setText(str);
                this.component1.getBinding().btnSend.setEnabled(false);
                int i6 = component3 + 45;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onFinish() {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 79;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                this.component1.getBinding().btnSend.setText(Utils.getApp().getString(R.string.risk_further_get_code));
                this.component1.getBinding().btnSend.setEnabled(true);
                int i6 = component3 + 105;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
        };
        initView();
    }

    public final RiskVerificationCodeViewBinding getBinding() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        RiskVerificationCodeViewBinding riskVerificationCodeViewBinding = this.binding;
        if (riskVerificationCodeViewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return riskVerificationCodeViewBinding;
    }

    public final void setBinding(RiskVerificationCodeViewBinding riskVerificationCodeViewBinding) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(riskVerificationCodeViewBinding, "");
            this.binding = riskVerificationCodeViewBinding;
        } else {
            Intrinsics.checkNotNullParameter(riskVerificationCodeViewBinding, "");
            this.binding = riskVerificationCodeViewBinding;
            int i3 = 5 / 0;
        }
    }

    private static final void initView$lambda$0(VerificationCodeView verificationCodeView, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(verificationCodeView, "");
        View.OnClickListener onClickListener = verificationCodeView.listener;
        if (onClickListener != null) {
            int i2 = component2 + 61;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            onClickListener.onClick(view);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = component2 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initView() {
        int i = 2 % 2;
        setBinding((RiskVerificationCodeViewBinding) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.risk_verification_code_view, this, true));
        getBinding().tvInput.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(6)});
        getBinding().btnSend.setPadding(SizeUtils.dp2px(2.0f), 0, SizeUtils.dp2px(2.0f), 0);
        getBinding().btnSend.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 59;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                VerificationCodeView.m10948$r8$lambda$4oZG41zIH1owkPQh093Ys2pbRg(this.f$0, view);
                int i5 = copydefault + 69;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        if (!(!AppConfigUtils.isLayoutRTL())) {
            int i2 = component2 + 7;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                getBinding().tvInput.setGravity(8388627);
                getBinding().tvInput.setTextDirection(2);
            } else {
                getBinding().tvInput.setGravity(8388627);
                getBinding().tvInput.setTextDirection(3);
            }
        }
    }

    public final void startTimer() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.downTimer.start();
        int i4 = component2 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setListener(View.OnClickListener listener) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.listener = listener;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final EditText getEditText() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(getBinding().tvInput, "");
            throw null;
        }
        EditText editText = getBinding().tvInput;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        return editText;
    }

    @Override
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        this.downTimer.cancel();
        int i4 = component2 + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10948$r8$lambda$4oZG41zIH1owkPQh093Ys2pbRg(VerificationCodeView verificationCodeView, View view) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10949instrumented$0$initView$V(verificationCodeView, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/riskui/widget/VerificationCodeView$Companion;", "", "<init>", "()V", "SMS_CODE_LENGTH", "", "ConsumerRiskUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = copydefault + 21;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    private static void m10949instrumented$0$initView$V(VerificationCodeView verificationCodeView, View view) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$0(verificationCodeView, view);
            Callback.onClick_exit();
            int i4 = component3 + 63;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
