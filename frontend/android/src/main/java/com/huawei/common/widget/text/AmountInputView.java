package com.huawei.common.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.huawei.common.R;
import com.huawei.common.config.AmountConfig;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.input.InputUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/common/widget/text/AmountInputView;", "Lcom/huawei/common/widget/input/CommonInputView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "amountFilter", "Lcom/huawei/common/widget/text/AmountFilter;", "maxValue", "", "initAttrs", "", "setAmountLimit", "pointLength", "inputLength", "amountInputLimit", "", "setText", "text", "", "getAmount", "Companion", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AmountInputView extends CommonInputView {
    private static final String TAG = "AmountInputView";
    private AmountFilter amountFilter;
    private double maxValue;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.maxValue = AmountConfig.INSTANCE.getInputMaxValue();
        initAttrs(context, attributeSet, i, i2);
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        double inputMaxValue;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AmountInputView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.AmountInputView_point_length, AmountConfig.INSTANCE.getPointLength());
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.AmountInputView_input_length, AmountConfig.INSTANCE.getInputMaxLength());
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.AmountInputView_input_regular);
        if (string == null) {
            string = AmountConfig.INSTANCE.getLimit();
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.AmountInputView_input_max_value)) {
            inputMaxValue = typedArrayObtainStyledAttributes.getFloat(R.styleable.AmountInputView_input_max_value, Float.MAX_VALUE);
        } else {
            inputMaxValue = AmountConfig.INSTANCE.getInputMaxValue(i2);
        }
        this.maxValue = inputMaxValue;
        setAmountLimit(i, i2, string);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setAmountLimit(int pointLength, int inputLength, String amountInputLimit) {
        Intrinsics.checkNotNullParameter(amountInputLimit, "");
        setAmountLimit(pointLength, inputLength, amountInputLimit, this.maxValue);
    }

    public final void setAmountLimit(int pointLength, int inputLength, String amountInputLimit, double maxValue) {
        Intrinsics.checkNotNullParameter(amountInputLimit, "");
        AmountFilter amountFilter = new AmountFilter(maxValue, pointLength);
        this.amountFilter = amountFilter;
        amountFilter.attach(getEditText());
        InputUtils.INSTANCE.setInputFilters(getEditText(), new ValidFilter(amountInputLimit), new MaxFilter(maxValue), new LengthFilter(inputLength, pointLength), this.amountFilter);
    }

    public final void setText(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "");
        AmountFilter amountFilter = this.amountFilter;
        if (amountFilter != null) {
            amountFilter.setFilter(false);
        }
        getEditText().setText(text.toString());
    }

    public final String getAmount() {
        String text = getText();
        if (!StringsKt.endsWith$default((CharSequence) text, AmountConfig.INSTANCE.getPoint(), false, 2, (Object) null)) {
            return text;
        }
        String strSubstring = text.substring(0, text.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }
}
