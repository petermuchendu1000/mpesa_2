package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u0010\u0010'\u001a\u00020%2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u0004\u0018\u00010#J\u000e\u0010*\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/huawei/common/widget/input/ErrorWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "getAttrs", "()Landroid/util/AttributeSet;", "getDefStyleAttr", "()I", "getDefStyleRes", "inputError", "", "inputErrorTextSize", "inputErrorTextColor", "inputErrorPaddingStart", "inputErrorPaddingEnd", "inputErrorPaddingTop", "inputErrorPaddingBottom", "inputErrorMarginStart", "inputErrorMarginEnd", "inputErrorMarginTop", "inputErrorMarginBottom", "errorView", "Landroid/widget/TextView;", "initAttrs", "", "initViews", "setInputError", "updateInputError", "getErrorView", "setInputErrorTextColor", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorWrapper {
    private int ArtificialStackFrames;
    private final Context ShareDataUIState;
    private final AttributeSet component1;
    private TextView component2;
    private final int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final View coroutineBoundary;
    private int coroutineCreation;
    private int equals;
    private int getAsAtTimestamp;
    private String getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private int toString;

    public ErrorWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.ShareDataUIState = context;
        this.coroutineBoundary = view;
        this.component1 = attributeSet;
        this.copydefault = i;
        this.component3 = i2;
        this.coroutineCreation = SizeUtils.sp2px(14.0f);
        this.component4 = SizeUtils.dp2px(8.0f);
        this.component2 = (TextView) view.findViewById(R.id.errorView);
        component2();
        copydefault();
    }

    public final Context getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final View getCoroutineBoundary() {
        return this.coroutineBoundary;
    }

    public final AttributeSet getComponent1() {
        return this.component1;
    }

    public final int getCopydefault() {
        return this.copydefault;
    }

    public final int getComponent3() {
        return this.component3;
    }

    private final void component2() {
        TypedArray typedArrayObtainStyledAttributes = this.ShareDataUIState.obtainStyledAttributes(this.component1, R.styleable.InputError, this.copydefault, this.component3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.hashCode = this.ShareDataUIState.getColor(R.color.colorUrgent);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.InputError_input_error) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.InputError_input_error_text_size) {
                this.coroutineCreation = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.coroutineCreation);
            } else if (index == R.styleable.InputError_input_error_text_color) {
                this.hashCode = AttrUtils.INSTANCE.getColor(this.ShareDataUIState, typedArrayObtainStyledAttributes, index, this.hashCode);
            } else if (index == R.styleable.InputError_input_error_paddingStart) {
                this.getShareableDataState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getShareableDataState);
            } else if (index == R.styleable.InputError_input_error_paddingTop) {
                this.toString = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.toString);
            } else if (index == R.styleable.InputError_input_error_paddingEnd) {
                this.ArtificialStackFrames = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ArtificialStackFrames);
            } else if (index == R.styleable.InputError_input_error_paddingBottom) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.InputError_input_error_marginStart) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.InputError_input_error_marginTop) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.InputError_input_error_marginEnd) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.InputError_input_error_marginBottom) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            }
        }
        String attrValue = AttrUtils.INSTANCE.getAttrValue(this.ShareDataUIState, this.component1, "input_error");
        if (attrValue == null) {
            attrValue = this.getRequestBeneficiariesState;
        }
        this.getRequestBeneficiariesState = attrValue;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void copydefault() {
        TextView textView = this.component2;
        if (textView != null) {
            if (textView != null) {
                textView.setPadding(this.getShareableDataState, this.toString, this.ArtificialStackFrames, this.getSponsorBeneficiariesState);
            }
            TextView textView2 = this.component2;
            ViewGroup.LayoutParams layoutParams = textView2 != null ? textView2.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(this.getAsAtTimestamp);
            marginLayoutParams.topMargin = this.component4;
            marginLayoutParams.setMarginEnd(this.copy);
            marginLayoutParams.bottomMargin = this.equals;
            TextView textView3 = this.component2;
            if (textView3 != null) {
                textView3.setLayoutParams(marginLayoutParams);
            }
            TextView textView4 = this.component2;
            if (textView4 != null) {
                textView4.setTextColor(this.hashCode);
            }
            TextView textView5 = this.component2;
            if (textView5 != null) {
                textView5.setTextSize(0, this.coroutineCreation);
            }
            component1();
        }
    }

    public final void setInputError(String inputError) {
        this.getRequestBeneficiariesState = inputError;
        component1();
    }

    private final void component1() {
        if (TextUtils.isEmpty(this.getRequestBeneficiariesState)) {
            TextView textView = this.component2;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.component2;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.component2;
        if (textView3 != null) {
            textView3.setText(this.getRequestBeneficiariesState);
        }
    }

    public final TextView getComponent2() {
        return this.component2;
    }

    public final void setInputErrorTextColor(int inputErrorTextColor) {
        this.hashCode = inputErrorTextColor;
        TextView textView = this.component2;
        if (textView != null) {
            textView.setTextColor(inputErrorTextColor);
        }
        TextView textView2 = this.component2;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
