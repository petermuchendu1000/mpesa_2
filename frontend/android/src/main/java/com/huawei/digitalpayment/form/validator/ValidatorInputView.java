package com.huawei.digitalpayment.form.validator;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.form.validator.response.ValidatorCheckResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/form/validator/ValidatorInputView;", "Lcom/huawei/common/widget/input/CommonInputView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "init", "", "setValidatorKey", "checkValidator", "Lcom/huawei/digitalpayment/form/validator/response/ValidatorCheckResult;", "showError", "", "FormValidator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatorInputView extends CommonInputView {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private LocalValidatorItem validator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidatorInputView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidatorInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidatorInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidatorInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        init(context, attributeSet, i, i2);
    }

    private final void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.ValidatorInputView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ValidatorInputView_validatorKey);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ValidatorInputView_categoryName);
        if (string2 == null) {
            int i4 = ShareDataUIState + 101;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            string2 = "COMMON";
        }
        setValidatorKey(ValidatorManager.INSTANCE.getValidatorItem(string, string2));
        typedArrayObtainStyledAttributes.recycle();
        getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void afterTextChanged(Editable s) {
                int i6 = 2 % 2;
                int i7 = copydefault + 81;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                super.afterTextChanged(s);
                ValidatorInputView.this.showError(null);
                int i9 = copydefault + 13;
                component1 = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        int i6 = ShareDataUIState + 21;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void setValidatorKey(final LocalValidatorItem validator) {
        int i = 2 % 2;
        this.validator = validator;
        post(new Runnable() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = copydefault + 91;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    ValidatorInputView.m12221$r8$lambda$uXfDdg3BfYzl78XMSN_90Pb_Q(validator, this);
                    obj.hashCode();
                    throw null;
                }
                ValidatorInputView.m12221$r8$lambda$uXfDdg3BfYzl78XMSN_90Pb_Q(validator, this);
                int i4 = copydefault + 35;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void setValidatorKey$lambda$1(LocalValidatorItem localValidatorItem, ValidatorInputView validatorInputView) {
        int i = 2 % 2;
        if (localValidatorItem != null) {
            int i2 = component3 + 57;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            if (localValidatorItem.getInputHint().length() > 0) {
                validatorInputView.getEditText().setHint(localValidatorItem.getInputHint());
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            InputFilter[] filters = validatorInputView.getEditText().getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "");
            CollectionsKt.addAll(arrayList2, filters);
            arrayList.add(new InputFilter.LengthFilter(localValidatorItem.getMaxLength()));
            validatorInputView.getEditText().setFilters((InputFilter[]) arrayList2.toArray(new InputFilter[0]));
            int i4 = component3 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final ValidatorCheckResult checkValidator() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ValidatorCheckResult validatorCheckResultCheckValidator = checkValidator(false);
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return validatorCheckResultCheckValidator;
    }

    public static ValidatorCheckResult checkValidator$default(ValidatorInputView validatorInputView, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 57;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 87;
            ShareDataUIState = i5 % 128;
            z = i5 % 2 == 0;
        }
        return validatorInputView.checkValidator(z);
    }

    public final ValidatorCheckResult checkValidator(boolean showError) {
        int i = 2 % 2;
        ValidatorCheckResult validatorCheckResultCheckValidator = ValidatorManager.INSTANCE.checkValidator(this.validator, getText());
        if (validatorCheckResultCheckValidator.isValid()) {
            showError(null);
        } else if (showError) {
            showError(validatorCheckResultCheckValidator.getErrorMessage());
            int i2 = component3 + 87;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component3 + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return validatorCheckResultCheckValidator;
        }
        throw null;
    }

    public static void m12221$r8$lambda$uXfDdg3BfYzl78XMSN_90Pb_Q(LocalValidatorItem localValidatorItem, ValidatorInputView validatorInputView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        setValidatorKey$lambda$1(localValidatorItem, validatorInputView);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component3 + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
