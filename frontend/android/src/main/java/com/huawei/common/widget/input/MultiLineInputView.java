package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/common/widget/input/MultiLineInputView;", "Lcom/huawei/common/widget/input/CommonInputView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "inputLimitWrapper", "Lcom/huawei/common/widget/input/InputLimitWrapper;", "getInputLimitWrapper", "getDefaultLayout", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MultiLineInputView extends CommonInputView {
    private InputLimitWrapper inputLimitWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiLineInputView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiLineInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiLineInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLineInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.inputLimitWrapper = new InputLimitWrapper(context, getView(), attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MultiLineInput, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        InputParentWrapper inputParentWrapper = getInputParentWrapper();
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_android_gravity)) {
            inputParentWrapper.getEditText().setGravity(GravityCompat.START);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_minHeight)) {
            inputParentWrapper.getInputTextWrapper().setInputMinHeight(SizeUtils.dp2px(76.0f));
        }
        View inputParentView = inputParentWrapper.getInputParentView();
        inputParentWrapper.setPadding(typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_paddingStart) ? inputParentView.getPaddingStart() : SizeUtils.dp2px(16.0f), typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_paddingTop) ? inputParentView.getPaddingTop() : SizeUtils.dp2px(8.0f), typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_paddingEnd) ? inputParentView.getPaddingEnd() : SizeUtils.dp2px(16.0f), typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_paddingBottom) ? inputParentView.getPaddingBottom() : SizeUtils.dp2px(8.0f));
        EditText coroutineCreation = inputParentWrapper.getInputTextWrapper().getCoroutineCreation();
        coroutineCreation.setPadding(coroutineCreation.getPaddingStart(), typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_text_paddingTop) ? coroutineCreation.getPaddingTop() : SizeUtils.dp2px(0.0f), coroutineCreation.getPaddingEnd(), typedArrayObtainStyledAttributes.hasValue(R.styleable.MultiLineInput_input_text_paddingBottom) ? coroutineCreation.getPaddingBottom() : SizeUtils.dp2px(0.0f));
        inputParentWrapper.getInputTextWrapper().setInputType(131073);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final InputLimitWrapper getInputLimitWrapper() {
        return this.inputLimitWrapper;
    }

    @Override
    public int getDefaultLayout() {
        return R.layout.multi_line_input_view;
    }
}
