package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.griver.api.constants.GriverEvents;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.util.AppInfoUtils;
import com.huawei.common.util.L;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 L2\u00020\u0001:\u0001LB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ*\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J0\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0014J*\u0010-\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u000101J\u000e\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\"J\u0006\u00104\u001a\u000201J\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020&2\b\u00108\u001a\u0004\u0018\u000101J\b\u00109\u001a\u0004\u0018\u00010:J\b\u0010;\u001a\u0004\u0018\u00010:J\b\u0010<\u001a\u0004\u0018\u00010=J\b\u0010>\u001a\u0004\u0018\u00010=J\b\u0010?\u001a\u0004\u0018\u00010=J\u0006\u0010@\u001a\u00020\u0016J\u000e\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020\"J\u0010\u0010C\u001a\u00020&2\b\u0010D\u001a\u0004\u0018\u00010EJ\u0012\u0010F\u001a\u00020&2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0012J\u0006\u0010I\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020&2\u0006\u0010!\u001a\u00020\"J\b\u0010J\u001a\u00020&H\u0002J\b\u0010K\u001a\u0004\u0018\u00010$R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/huawei/common/widget/input/CommonInputView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "layoutId", "inputParentWrapper", "Lcom/huawei/common/widget/input/InputParentWrapper;", "labelWrapper", "Lcom/huawei/common/widget/input/LabelWrapper;", "errorWrapper", "Lcom/huawei/common/widget/input/ErrorWrapper;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "llButton", "Landroid/view/ViewGroup;", "getLlButton", "()Landroid/view/ViewGroup;", "setLlButton", "(Landroid/view/ViewGroup;)V", "showButton", "", "commonButton", "Lcom/huawei/common/widget/LoadingButton;", "init", "", "onLayout", "changed", "left", "top", "right", ThemeConstants.INDICA_POSITION_BOTTOM, "initAttrs", "getDefaultLayout", GriverEvents.EVENT_SET_TITLE, "title", "", "setInputRequired", "inputRequired", "getText", "getEditText", "Landroid/widget/EditText;", "showError", "errorMessage", "getStartIcon", "Landroid/widget/ImageView;", "getEndIcon", "getStartUnit", "Landroid/widget/TextView;", "getEndUnit", "getErrorView", "getInputParentView", "setInputEnable", "inputEnable", "setOnInputViewParentClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "getInputParentWrapper", "getLabelWrapper", "getErrorWrapper", "initButton", "getButton", "Companion", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CommonInputView extends RoundConstraintLayout {
    private static final String TAG = "CommonInputView";
    private AttributeSet attrs;
    private LoadingButton commonButton;
    private int defStyleAttr;
    private int defStyleRes;
    private ErrorWrapper errorWrapper;
    private InputParentWrapper inputParentWrapper;
    private LabelWrapper labelWrapper;
    private int layoutId;
    private ViewGroup llButton;
    private boolean showButton;
    protected View view;

    protected final View getView() {
        View view = this.view;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    protected final void setView(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.view = view;
    }

    protected final ViewGroup getLlButton() {
        return this.llButton;
    }

    protected final void setLlButton(ViewGroup viewGroup) {
        this.llButton = viewGroup;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonInputView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.layoutId = R.layout.basic_input_edit_text;
        this.attrs = attributeSet;
        this.defStyleAttr = i;
        this.defStyleRes = i2;
        init(context, attributeSet, i, i2);
        L.d(TAG, "2222222222222222222222222: ");
    }

    private final void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        try {
            initAttrs(context, attrs, defStyleAttr, defStyleRes);
            setView(LayoutInflater.from(context).inflate(this.layoutId, (ViewGroup) this, true));
            this.inputParentWrapper = new InputParentWrapper(context, getView(), attrs, defStyleAttr, defStyleRes, this);
            this.labelWrapper = new LabelWrapper(context, getView(), attrs, defStyleAttr, defStyleRes);
            this.errorWrapper = new ErrorWrapper(context, getView(), attrs, defStyleAttr, defStyleRes);
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.llButton);
            this.llButton = viewGroup;
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (AppInfoUtils.isLayoutRTL(getContext())) {
                    marginLayoutParams.setMarginEnd(SizeUtils.dp2px(12.0f));
                } else {
                    marginLayoutParams.setMarginStart(SizeUtils.dp2px(12.0f));
                }
            }
            showButton(this.showButton);
        } catch (Exception e) {
            L.d("TAG", "init: " + e.getMessage());
        }
    }

    @Override
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        try {
            InputParentWrapper inputParentWrapper = this.inputParentWrapper;
            if (inputParentWrapper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                inputParentWrapper = null;
            }
            inputParentWrapper.update(changed, left, top, right, bottom);
        } catch (Exception e) {
            L.e(TAG, "onLayout: " + e.getMessage());
        }
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.BasicInput, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.layoutId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BasicInput_input_layout, getDefaultLayout());
        this.showButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BasicInput_showButton, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getDefaultLayout() {
        return R.layout.basic_input_edit_text;
    }

    public final void setTitle(String title) {
        LabelWrapper labelWrapper = this.labelWrapper;
        if (labelWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            labelWrapper = null;
        }
        labelWrapper.setTitle(title);
    }

    public final void setInputRequired(boolean inputRequired) {
        LabelWrapper labelWrapper = this.labelWrapper;
        if (labelWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            labelWrapper = null;
        }
        labelWrapper.setInputRequired(inputRequired);
    }

    public final String getText() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getText();
    }

    public final EditText getEditText() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getEditText();
    }

    public final void showError(String errorMessage) {
        ErrorWrapper errorWrapper = this.errorWrapper;
        InputParentWrapper inputParentWrapper = null;
        if (errorWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            errorWrapper = null;
        }
        errorWrapper.setInputError(errorMessage);
        InputParentWrapper inputParentWrapper2 = this.inputParentWrapper;
        if (inputParentWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            inputParentWrapper = inputParentWrapper2;
        }
        String str = errorMessage;
        inputParentWrapper.setShowError(!(str == null || StringsKt.isBlank(str)));
    }

    public final ImageView getStartIcon() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getStartIcon();
    }

    public final ImageView getEndIcon() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getEndIcon();
    }

    public final TextView getStartUnit() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getStartUnit();
    }

    public final TextView getEndUnit() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getEndUnit();
    }

    public final TextView getErrorView() {
        ErrorWrapper errorWrapper = this.errorWrapper;
        if (errorWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            errorWrapper = null;
        }
        return errorWrapper.getComponent2();
    }

    public final View getInputParentView() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        return inputParentWrapper.getInputParentView();
    }

    public final void setInputEnable(boolean inputEnable) {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        inputParentWrapper.setInputEnable(inputEnable);
    }

    public final void setOnInputViewParentClickListener(View.OnClickListener onClickListener) {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputParentWrapper = null;
        }
        inputParentWrapper.setOnInputViewParentClickListener(onClickListener);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnInputViewParentClickListener(onClickListener);
    }

    public final InputParentWrapper getInputParentWrapper() {
        InputParentWrapper inputParentWrapper = this.inputParentWrapper;
        if (inputParentWrapper != null) {
            return inputParentWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final LabelWrapper getLabelWrapper() {
        LabelWrapper labelWrapper = this.labelWrapper;
        if (labelWrapper != null) {
            return labelWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final ErrorWrapper getErrorWrapper() {
        ErrorWrapper errorWrapper = this.errorWrapper;
        if (errorWrapper != null) {
            return errorWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void showButton(boolean showButton) {
        ViewGroup viewGroup = this.llButton;
        if (viewGroup == null) {
            return;
        }
        if (showButton) {
            initButton();
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    private final void initButton() {
        if (this.commonButton == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LoadingButton loadingButton = new LoadingButton(context, this.attrs, this.defStyleAttr, this.defStyleRes);
            this.commonButton = loadingButton;
            loadingButton.setPadding(SizeUtils.dp2px(8.0f), loadingButton.getPaddingTop(), SizeUtils.dp2px(8.0f), loadingButton.getPaddingBottom());
            ViewGroup viewGroup = this.llButton;
            if (viewGroup != null) {
                viewGroup.addView(loadingButton, -2, -2);
            }
        }
    }

    public final LoadingButton getCommonButton() {
        return this.commonButton;
    }
}
