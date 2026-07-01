package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.StringUtils;
import com.huawei.common.R;
import com.huawei.common.widget.MPTextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020&H\u0002J\u000e\u0010+\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/huawei/common/widget/input/InputLimitWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "getAttrs", "()Landroid/util/AttributeSet;", "getDefStyleAttr", "()I", "getDefStyleRes", "inputLimit", "inputLimitTextSize", "inputLimitTextColor", "inputLimitPaddingStart", "inputLimitPaddingEnd", "inputLimitPaddingTop", "inputLimitPaddingBottom", "inputLimitMarginStart", "inputLimitMarginEnd", "inputLimitMarginTop", "inputLimitMarginBottom", "limitView", "Landroid/widget/TextView;", "inputView", "Landroid/widget/EditText;", "initAttrs", "", "initViews", "attachEditText", "editText", "updateLimitText", "setInputLimit", "getLimitView", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputLimitWrapper {
    private int ArtificialStackFrames;
    private final int ShareDataUIState;
    private final Context component1;
    private final AttributeSet component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private EditText coroutineBoundary;
    private final View coroutineCreation;
    private int equals;
    private TextView getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private int toString;

    public InputLimitWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.component1 = context;
        this.coroutineCreation = view;
        this.component2 = attributeSet;
        this.ShareDataUIState = i;
        this.copydefault = i2;
        this.component3 = -1;
        this.hashCode = SizeUtils.sp2px(16.0f);
        View viewFindViewById = view.findViewById(R.id.inputLimit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.inputView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.coroutineBoundary = (EditText) viewFindViewById2;
        component1();
        copydefault();
    }

    public final Context getComponent1() {
        return this.component1;
    }

    public final View getCoroutineCreation() {
        return this.coroutineCreation;
    }

    public final AttributeSet getComponent2() {
        return this.component2;
    }

    public final int getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final int getCopydefault() {
        return this.copydefault;
    }

    private final void component1() {
        TypedArray typedArrayObtainStyledAttributes = this.component1.obtainStyledAttributes(this.component2, R.styleable.InputLimit, this.ShareDataUIState, this.copydefault);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.toString = this.component1.getColor(R.color.colorSecondaryText);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.InputLimit_input_limit) {
                this.component3 = typedArrayObtainStyledAttributes.getInt(index, this.component3);
            } else if (index == R.styleable.InputLimit_input_limit_text_size) {
                this.hashCode = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.hashCode);
            } else if (index == R.styleable.InputLimit_input_limit_text_color) {
                this.toString = AttrUtils.INSTANCE.getColor(this.component1, typedArrayObtainStyledAttributes, index, this.toString);
            } else if (index == R.styleable.InputLimit_input_limit_paddingStart) {
                this.ArtificialStackFrames = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ArtificialStackFrames);
            } else if (index == R.styleable.InputLimit_input_limit_paddingTop) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.InputLimit_input_limit_paddingEnd) {
                this.getShareableDataState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getShareableDataState);
            } else if (index == R.styleable.InputLimit_input_limit_paddingBottom) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.InputLimit_input_limit_marginStart) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.InputLimit_input_limit_marginTop) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.InputLimit_input_limit_marginEnd) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.InputLimit_input_limit_marginBottom) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getRequestBeneficiariesState);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void copydefault() {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.setTextColor(this.toString);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.setTextSize(0, this.hashCode);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.setPadding(this.ArtificialStackFrames, this.getSponsorBeneficiariesState, this.getShareableDataState, this.equals);
        ViewGroup.LayoutParams layoutParams = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.component4);
        marginLayoutParams.topMargin = this.copy;
        marginLayoutParams.setMarginEnd(this.getAsAtTimestamp);
        marginLayoutParams.bottomMargin = this.getRequestBeneficiariesState;
        setInputLimit(this.component3);
        component3(this.coroutineBoundary);
    }

    private final void component3(EditText editText) {
        editText.addTextChangedListener(new MPTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                this.ShareDataUIState.component3();
            }
        });
    }

    public final void component3() {
        if (this.component3 > 0) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(0);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setText(StringUtils.getString(R.string.multi_input_limit, Integer.valueOf(this.coroutineBoundary.getText().length()), Integer.valueOf(this.component3)));
            return;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(8);
    }

    public final void setInputLimit(int inputLimit) {
        if (inputLimit > 0) {
            this.component3 = inputLimit;
            InputUtils.INSTANCE.appendInputFilters(this.coroutineBoundary, new InputFilter.LengthFilter(inputLimit));
        } else {
            this.component3 = -1;
            InputUtils.INSTANCE.removeInputFilters(this.coroutineBoundary, new InputFilter.LengthFilter(inputLimit));
        }
        component3();
    }

    public final TextView getGetARTIFICIAL_FRAME_PACKAGE_NAME() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }
}
