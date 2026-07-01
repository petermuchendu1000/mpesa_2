package com.huawei.digitalpayment.customer.dynamics.base;

import android.R;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.GsonUtils;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.input.InputUtils;
import com.huawei.digitalpayment.consumer.baselib.util.PaymentResourcesUtils;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.form.validator.ValidatorManager;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.form.validator.response.ValidatorCheckResult;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0015J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\n\u0010%\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010&\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010 H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0013H\u0016J\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\"J\u0010\u00100\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\"J\u0010\u00101\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/base/BaseDynamicsView;", "Lcom/huawei/digitalpayment/customer/dynamics/base/DynamicsViewInterface;", "layoutId", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dynamicsElement", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "<init>", "(ILandroidx/fragment/app/FragmentActivity;Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getDynamicsElement", "()Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "rootView", "Lcom/huawei/common/widget/input/CommonInputView;", "getRootView", "()Lcom/huawei/common/widget/input/CommonInputView;", "realRootView", "Landroid/view/View;", "getRealRootView", "()Landroid/view/View;", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "getValidator", "()Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "setValidator", "(Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;)V", "initViews", "", "init", "getCommitKey", "", "getCommitValue", "", "getActualInput", "getInputView", "getErrorMessage", "showError", "errorMessage", "isLegal", "", "getRooView", "addTextWatcher", "textWatcher", "Landroid/text/TextWatcher;", "isNull", "input", "getValue", "setValidatorItem", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseDynamicsView implements DynamicsViewInterface {
    private static int copy = 0;
    private static int equals = 1;
    private LocalValidatorItem ShareDataUIState;
    private final FragmentActivity component1;
    private final CommonInputView component2;
    private final DynamicsElement component3;
    private final View copydefault;

    public BaseDynamicsView(int i, FragmentActivity fragmentActivity, DynamicsElement dynamicsElement) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(dynamicsElement, "");
        this.component1 = fragmentActivity;
        this.component3 = dynamicsElement;
        View viewInflate = LayoutInflater.from(fragmentActivity).inflate(i, (ViewGroup) fragmentActivity.findViewById(R.id.content), false);
        this.copydefault = viewInflate;
        this.component2 = (CommonInputView) viewInflate.findViewById(com.huawei.digitalpayment.customer.dynamics.R.id.commonInputView);
        component3();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseDynamicsView(int i, FragmentActivity fragmentActivity, DynamicsElement dynamicsElement, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = copy + 115;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                i = com.huawei.digitalpayment.customer.dynamics.R.layout.default_dynamics_element_layout;
                int i4 = 91 / 0;
            } else {
                i = com.huawei.digitalpayment.customer.dynamics.R.layout.default_dynamics_element_layout;
            }
            int i5 = 2 % 2;
        }
        this(i, fragmentActivity, dynamicsElement);
    }

    public final FragmentActivity getActivity() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 51;
        equals = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity fragmentActivity = this.component1;
        int i5 = i2 + 5;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return fragmentActivity;
    }

    public final DynamicsElement getDynamicsElement() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 75;
        equals = i3 % 128;
        int i4 = i3 % 2;
        DynamicsElement dynamicsElement = this.component3;
        int i5 = i2 + 35;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return dynamicsElement;
    }

    public final CommonInputView getRootView() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 89;
        equals = i3 % 128;
        int i4 = i3 % 2;
        CommonInputView commonInputView = this.component2;
        int i5 = i2 + 107;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return commonInputView;
    }

    protected final View getRealRootView() {
        int i = 2 % 2;
        int i2 = copy + 75;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        View view = this.copydefault;
        int i5 = i3 + 33;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return view;
    }

    protected final LocalValidatorItem getValidator() {
        int i = 2 % 2;
        int i2 = copy + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        LocalValidatorItem localValidatorItem = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return localValidatorItem;
    }

    protected final void setValidator(LocalValidatorItem localValidatorItem) {
        int i = 2 % 2;
        int i2 = copy + 23;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = localValidatorItem;
        int i5 = i3 + 125;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component3() {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView.component3():void");
    }

    @Override
    public String getCommitKey() {
        int i = 2 % 2;
        int i2 = equals + 3;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String key = this.component3.getKey();
        if (key != null) {
            return key;
        }
        int i4 = copy;
        int i5 = i4 + 77;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 57;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    @Override
    public Object getCommitValue() {
        int i = 2 % 2;
        int i2 = equals + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceTrim = StringsKt.trim(this.component2.getText());
        if (i3 == 0) {
            return charSequenceTrim.toString();
        }
        charSequenceTrim.toString();
        throw null;
    }

    public String getActualInput() {
        int i = 2 % 2;
        int i2 = copy + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String string = StringsKt.trim(this.component2.getEditText().getText().toString()).toString();
        int i4 = equals + 77;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public CommonInputView getInputView() {
        int i = 2 % 2;
        int i2 = equals + 83;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    @Override
    public String getErrorMessage() {
        int i = 2 % 2;
        LocalValidatorItem localValidatorItem = this.ShareDataUIState;
        if (localValidatorItem != null) {
            if (getActualInput().length() < localValidatorItem.getMinLength()) {
                return localValidatorItem.getInputTips();
            }
            ValidatorCheckResult validatorCheckResultCheckValidator = ValidatorManager.INSTANCE.checkValidator(localValidatorItem, String.valueOf(getCommitValue()));
            if (!validatorCheckResultCheckValidator.isValid()) {
                int i2 = copy + 49;
                equals = i2 % 128;
                if (i2 % 2 != 0) {
                    return validatorCheckResultCheckValidator.getErrorMessage();
                }
                String errorMessage = validatorCheckResultCheckValidator.getErrorMessage();
                int i3 = 68 / 0;
                return errorMessage;
            }
        }
        if (this.component3.getRequired()) {
            int i4 = copy + 119;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                isNull(getActualInput());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (isNull(getActualInput())) {
                return PaymentResourcesUtils.getString(this.component3.getTips());
            }
        }
        return PaymentResourcesUtils.getString(this.component3.getErrorMessage());
    }

    @Override
    public void showError(String errorMessage) {
        int i = 2 % 2;
        int i2 = equals + 119;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.component2.showError(errorMessage);
        int i4 = copy + 43;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    @Override
    public boolean isLegal() {
        int i = 2 % 2;
        int i2 = equals + 95;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        LocalValidatorItem localValidatorItem = this.ShareDataUIState;
        if (localValidatorItem != null) {
            int i5 = i3 + 103;
            equals = i5 % 128;
            int i6 = i5 % 2;
            if (getActualInput().length() >= localValidatorItem.getMinLength()) {
                return ValidatorManager.INSTANCE.checkValidator(localValidatorItem, String.valueOf(getCommitValue())).isValid();
            }
            int i7 = equals + 91;
            copy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!this.component3.getRequired() && isNull(getActualInput())) {
            int i9 = equals + 57;
            copy = i9 % 128;
            return i9 % 2 == 0;
        }
        if (this.component3.getRequired()) {
            int i10 = copy + 93;
            equals = i10 % 128;
            int i11 = i10 % 2;
            if (isNull(getActualInput())) {
                int i12 = copy + 67;
                equals = i12 % 128;
                if (i12 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        String regularExpr = this.component3.getRegularExpr();
        if (regularExpr != null) {
            try {
                if (!Pattern.matches(regularExpr, getValue(getCommitValue()))) {
                    int i13 = copy + 91;
                    equals = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 53 / 0;
                    }
                    return false;
                }
            } catch (PatternSyntaxException unused) {
            }
        }
        return true;
    }

    @Override
    public View getRooView() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 65;
        equals = i3 % 128;
        int i4 = i3 % 2;
        View view = this.copydefault;
        int i5 = i2 + 95;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public final void addTextWatcher(TextWatcher textWatcher) {
        int i = 2 % 2;
        int i2 = equals + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textWatcher, "");
        this.component2.getEditText().addTextChangedListener(textWatcher);
        int i4 = equals + 113;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean isNull(Object input) {
        int i = 2 % 2;
        int i2 = copy + 111;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        if (input == null) {
            return true;
        }
        if (!(input instanceof String)) {
            int i5 = i3 + 69;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        boolean z = StringsKt.trim((String) input).toString().length() == 0;
        int i7 = copy + 111;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue(Object input) {
        int i = 2 % 2;
        if (input == null) {
            int i2 = copy + 41;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 36 / 0;
            }
            return "";
        }
        if (!(input instanceof String)) {
            String json = GsonUtils.toJson(input);
            Intrinsics.checkNotNullExpressionValue(json, "");
            return json;
        }
        int i4 = equals + 85;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return StringsKt.trim((String) input).toString();
        }
        StringsKt.trim((String) input).toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setValidatorItem(LocalValidatorItem validator) {
        int i = 2 % 2;
        int i2 = copy + 77;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.ShareDataUIState = validator;
            if (validator != null) {
                EditText editText = this.component2.getEditText();
                if (validator.getInputHint().length() > 0) {
                    int i3 = equals + 9;
                    copy = i3 % 128;
                    if (i3 % 2 == 0) {
                        editText.setHint(validator.getInputHint());
                    } else {
                        editText.setHint(validator.getInputHint());
                        throw null;
                    }
                }
                InputUtils.INSTANCE.appendInputFilters(editText, new InputFilter.LengthFilter(validator.getMaxLength()));
                return;
            }
            return;
        }
        this.ShareDataUIState = validator;
        obj.hashCode();
        throw null;
    }

    @Deprecated(message = "这里有个坑，在这里初始化的变量会被覆盖掉")
    protected void initViews() {
        int i = 2 % 2;
        int i2 = equals + 25;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
