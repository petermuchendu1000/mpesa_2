package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.util.L;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.round.BaseRoundView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 [2\u00020\u0001:\u0001[B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ*\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J2\u00103\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J&\u00104\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tJ.\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tJ\u001a\u0010A\u001a\u0002022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010B\u001a\u00020\tH\u0002J\b\u0010C\u001a\u000202H\u0016J\u000e\u0010D\u001a\u0002022\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010E\u001a\u0002022\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010F\u001a\u0002022\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010G\u001a\u0002022\u0006\u0010!\u001a\u00020\"J\u001a\u0010H\u001a\u0002022\b\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\"H\u0016J\u0006\u0010K\u001a\u000200J\u0006\u0010L\u001a\u00020MJ\b\u0010N\u001a\u0004\u0018\u00010OJ\b\u0010P\u001a\u0004\u0018\u00010OJ\b\u0010Q\u001a\u0004\u0018\u00010(J\b\u0010R\u001a\u0004\u0018\u00010(J\u000e\u0010S\u001a\u0002022\u0006\u0010T\u001a\u00020\"J\u0010\u0010U\u001a\u0002022\b\u0010V\u001a\u0004\u0018\u00010WJ\u0006\u0010X\u001a\u00020\u0005J\u0006\u0010Y\u001a\u00020*J\u0006\u0010Z\u001a\u00020,R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/huawei/common/widget/input/InputParentWrapper;", "Landroid/view/View$OnFocusChangeListener;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "commonInputView", "Lcom/huawei/common/widget/input/CommonInputView;", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;IILcom/huawei/common/widget/input/CommonInputView;)V", "getCommonInputView", "()Lcom/huawei/common/widget/input/CommonInputView;", "inputCorner", "inputBackgroundColor", "inputErrorStrokeColor", "inputFocusStrokeColor", "inputUnFocusStrokeColor", "inputErrorStrokeWidth", "inputFocusStrokeWidth", "inputUnFocusStrokeWidth", "inputPaddingStart", "inputPaddingEnd", "inputPaddingTop", "inputPaddingBottom", "inputMarginStart", "inputMarginEnd", "inputMarginTop", "inputMarginBottom", "showError", "", "inputViewParent", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "llButton", "Landroid/view/ViewGroup;", "errorView", "Landroid/widget/TextView;", "inputTextWrapper", "Lcom/huawei/common/widget/input/InputTextWrapper;", "iconWrapper", "Lcom/huawei/common/widget/input/IconWrapper;", "unitWrapper", "Lcom/huawei/common/widget/input/UnitWrapper;", "inputText", "", "initAttrs", "", "initViews", "setPadding", "totalWidth", "startIconWidth", "endIconWidth", "startUnitWidth", "endUnitWidth", "buttonWidth", "update", "changed", "left", "top", "right", ThemeConstants.INDICA_POSITION_BOTTOM, "setMaxWidth", "maxWidth", "updateStrokeColor", "setInputFocusStrokeColor", "setInputUnFocusStrokeColor", "setInputErrorStrokeColor", "setShowError", "onFocusChange", "v", "hasFocus", "getText", "getEditText", "Landroid/widget/EditText;", "getStartIcon", "Landroid/widget/ImageView;", "getEndIcon", "getStartUnit", "getEndUnit", "setInputEnable", "inputEnable", "setOnInputViewParentClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "getInputParentView", "getInputTextWrapper", "getIconWrapper", "Companion", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InputParentWrapper implements View.OnFocusChangeListener {
    private static final String component1 = "InputParentWrapper";
    private int ArtificialStackFrames;
    private int CoroutineDebuggingKt;
    private int ShareDataUIState;

    private int f2639a;
    private int accessartificialFrame;

    private int f2640b;

    private String f2641c;
    private final CommonInputView component2;
    private int component3;
    private int component4;
    private int copy;
    private int copydefault;
    private int coroutineBoundary;
    private int coroutineCreation;

    private int f2642d;
    private int e;
    private TextView equals;
    private boolean f;
    private int g;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private IconWrapper getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private ViewGroup h;
    private int hExternalSyntheticLambda0;
    private int hashCode;
    private InputTextWrapper invoke;
    private RoundConstraintLayout invokeSuspend;
    private UnitWrapper k;
    private int toString;

    public InputParentWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2, CommonInputView commonInputView) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(commonInputView, "");
        this.component2 = commonInputView;
        this.component4 = SizeUtils.dp2px(8.0f);
        this.getSponsorBeneficiariesState = SizeUtils.dp2px(1.0f);
        this.hashCode = SizeUtils.dp2px(1.0f);
        this.f2639a = SizeUtils.dp2px(1.0f);
        this.coroutineCreation = SizeUtils.dp2px(12.0f);
        this.coroutineBoundary = SizeUtils.dp2px(12.0f);
        View viewFindViewById = view.findViewById(R.id.cl_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.invokeSuspend = (RoundConstraintLayout) viewFindViewById;
        this.h = (ViewGroup) view.findViewById(R.id.llButton);
        this.equals = (TextView) view.findViewById(R.id.errorView);
        ShareDataUIState(context, attributeSet, i, i2);
        component1(context, view, attributeSet, i, i2);
    }

    public final CommonInputView getComponent2() {
        return this.component2;
    }

    private final void ShareDataUIState(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InputParent, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copy = context.getColor(R.color.colorUrgent);
        this.toString = context.getColor(R.color.colorPrimary);
        this.f2640b = context.getColor(R.color.colorFirstLevelBorder);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == R.styleable.InputParent_input_corner) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.InputParent_input_background_color) {
                this.getRequestBeneficiariesState = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.InputParent_input_error_stroke_color) {
                this.copy = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.copy);
            } else if (index == R.styleable.InputParent_input_focus_stroke_color) {
                this.toString = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.toString);
            } else if (index == R.styleable.InputParent_input_un_focus_stroke_color) {
                this.f2640b = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.f2640b);
            } else if (index == R.styleable.InputParent_input_error_stroke_width) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.InputParent_input_focus_stroke_width) {
                this.hashCode = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.hashCode);
            } else if (index == R.styleable.InputParent_input_un_focus_stroke_width) {
                this.f2639a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2639a);
            } else if (index == R.styleable.InputParent_input_paddingStart) {
                this.coroutineCreation = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.coroutineCreation);
            } else if (index == R.styleable.InputParent_input_paddingTop) {
                this.f2642d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2642d);
            } else if (index == R.styleable.InputParent_input_paddingEnd) {
                this.coroutineBoundary = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.coroutineBoundary);
            } else if (index == R.styleable.InputParent_input_paddingBottom) {
                this.accessartificialFrame = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.accessartificialFrame);
            } else if (index == R.styleable.InputParent_input_marginStart) {
                this.CoroutineDebuggingKt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.CoroutineDebuggingKt);
            } else if (index == R.styleable.InputParent_input_marginTop) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            } else if (index == R.styleable.InputParent_input_marginEnd) {
                this.getShareableDataState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getShareableDataState);
            } else if (index == R.styleable.InputParent_input_marginBottom) {
                this.ArtificialStackFrames = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ArtificialStackFrames);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void component1(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.invokeSuspend.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.CoroutineDebuggingKt);
        marginLayoutParams.topMargin = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        marginLayoutParams.setMarginEnd(this.getShareableDataState);
        marginLayoutParams.bottomMargin = this.ArtificialStackFrames;
        this.invokeSuspend.getBaseFilletView().setRoundCorner(this.component4);
        this.invokeSuspend.setBackgroundColor(this.getRequestBeneficiariesState);
        setPadding(this.coroutineCreation, this.f2642d, this.coroutineBoundary, this.accessartificialFrame);
        InputTextWrapper inputTextWrapper = new InputTextWrapper(context, view, attributeSet, i, i2);
        this.invoke = inputTextWrapper;
        inputTextWrapper.getCoroutineCreation().setOnFocusChangeListener(this);
        InputTextWrapper inputTextWrapper2 = this.invoke;
        if (inputTextWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputTextWrapper2 = null;
        }
        inputTextWrapper2.getCoroutineCreation().addTextChangedListener(new MPTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                Editable editable;
                if ((this.component1.f2641c == null && ((editable = s) == null || StringsKt.isBlank(editable))) || Intrinsics.areEqual(this.component1.f2641c, String.valueOf(s))) {
                    return;
                }
                this.component1.setShowError(false);
                this.component1.f2641c = String.valueOf(s);
            }
        });
        this.getAsAtTimestamp = new IconWrapper(context, view, attributeSet, i, i2);
        this.k = new UnitWrapper(context, view, attributeSet, i, i2);
        updateStrokeColor();
    }

    public final void setPadding(int inputPaddingStart, int inputPaddingTop, int inputPaddingEnd, int inputPaddingBottom) {
        this.invokeSuspend.setPadding(inputPaddingStart, inputPaddingTop, inputPaddingEnd, inputPaddingBottom);
    }

    public final void update(boolean changed, int left, int top, int right, int bottom) {
        int iCoerceAtMost;
        int iDp2px;
        int iMeasureText;
        int iMeasureText2;
        int iDp2px2;
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        int i2 = right - left;
        int marginEnd = this.coroutineCreation + this.coroutineBoundary;
        ViewGroup viewGroup = this.h;
        if (viewGroup == null || viewGroup.getVisibility() == 8) {
            iCoerceAtMost = 0;
            iDp2px = 0;
        } else {
            ViewGroup viewGroup2 = viewGroup;
            ViewGroup.LayoutParams layoutParams7 = viewGroup2.getLayoutParams();
            int marginStart = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams8 = viewGroup2.getLayoutParams();
            marginEnd += marginStart + (layoutParams8 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams8).getMarginEnd() : 0);
            int paddingStart = viewGroup.getPaddingStart();
            int paddingEnd = viewGroup.getPaddingEnd();
            LoadingButton commonButton = this.component2.getCommonButton();
            iCoerceAtMost = paddingStart + paddingEnd + (commonButton != null ? commonButton.getExceptWidth() : 0);
            iDp2px = SizeUtils.dp2px(72.0f);
        }
        IconWrapper iconWrapper = this.getAsAtTimestamp;
        UnitWrapper unitWrapper = null;
        if (iconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iconWrapper = null;
        }
        int startIconWidth = iconWrapper.getStartIconWidth();
        IconWrapper iconWrapper2 = this.getAsAtTimestamp;
        if (iconWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iconWrapper2 = null;
        }
        ImageView startIcon = iconWrapper2.getF2636b();
        if (startIcon != null && startIcon.getVisibility() != 8) {
            ImageView imageView = startIcon;
            ViewGroup.LayoutParams layoutParams9 = imageView.getLayoutParams();
            int marginStart2 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams9).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams10 = imageView.getLayoutParams();
            marginEnd += marginStart2 + (layoutParams10 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams10).getMarginEnd() : 0);
        }
        IconWrapper iconWrapper3 = this.getAsAtTimestamp;
        if (iconWrapper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iconWrapper3 = null;
        }
        int endIconWidth = iconWrapper3.getEndIconWidth();
        IconWrapper iconWrapper4 = this.getAsAtTimestamp;
        if (iconWrapper4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iconWrapper4 = null;
        }
        ImageView endIcon = iconWrapper4.getCopydefault();
        if (endIcon != null && endIcon.getVisibility() != 8) {
            ImageView imageView2 = endIcon;
            ViewGroup.LayoutParams layoutParams11 = imageView2.getLayoutParams();
            int marginStart3 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams11).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams12 = imageView2.getLayoutParams();
            marginEnd += marginStart3 + (layoutParams12 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams12).getMarginEnd() : 0);
        }
        UnitWrapper unitWrapper2 = this.k;
        if (unitWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            unitWrapper2 = null;
        }
        TextView startUnit = unitWrapper2.getF2648a();
        if (startUnit == null || startUnit.getVisibility() == 8) {
            iMeasureText = 0;
        } else {
            iMeasureText = (int) startUnit.getPaint().measureText(startUnit.getText().toString());
            TextView textView = startUnit;
            ViewGroup.LayoutParams layoutParams13 = textView.getLayoutParams();
            int marginStart4 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams13).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams14 = textView.getLayoutParams();
            marginEnd += marginStart4 + (layoutParams14 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams14).getMarginEnd() : 0);
        }
        UnitWrapper unitWrapper3 = this.k;
        if (unitWrapper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            unitWrapper3 = null;
        }
        TextView endUnit = unitWrapper3.getComponent3();
        if (endUnit == null || endUnit.getVisibility() == 8) {
            iMeasureText2 = 0;
        } else {
            iMeasureText2 = (int) endUnit.getPaint().measureText(endUnit.getText().toString());
            TextView textView2 = endUnit;
            ViewGroup.LayoutParams layoutParams15 = textView2.getLayoutParams();
            int marginStart5 = layoutParams15 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams15).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams16 = textView2.getLayoutParams();
            marginEnd += marginStart5 + (layoutParams16 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams16).getMarginEnd() : 0);
        }
        if (this.hExternalSyntheticLambda0 == i2 && this.e == startIconWidth && this.component3 == endIconWidth && this.g == iMeasureText && this.copydefault == iMeasureText2 && this.ShareDataUIState == iCoerceAtMost) {
            return;
        }
        this.hExternalSyntheticLambda0 = i2;
        this.e = startIconWidth;
        this.component3 = endIconWidth;
        this.g = iMeasureText;
        this.copydefault = iMeasureText2;
        this.ShareDataUIState = iCoerceAtMost;
        L.d(component1, "update: \ntotalWidth " + i2 + "\nstartIconWidth " + startIconWidth + "\nendIconWidth " + endIconWidth + "\nstartUnitWidth " + iMeasureText + "\nbuttonWidth " + iCoerceAtMost + "\nendUnitWidth " + iMeasureText2);
        if (i2 < marginEnd) {
            L.e(component1, "update: width too lower");
            return;
        }
        int i3 = i2 - marginEnd;
        int iDp2px3 = i3 - SizeUtils.dp2px(12.0f);
        int i4 = iDp2px3 - (iDp2px3 / 2);
        if (startIconWidth == 0) {
            startIconWidth = 0;
        } else if (1 > startIconWidth || startIconWidth >= i4) {
            if (i4 > 0) {
                IconWrapper iconWrapper5 = this.getAsAtTimestamp;
                if (iconWrapper5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    iconWrapper5 = null;
                }
                ImageView startIcon2 = iconWrapper5.getF2636b();
                if (startIcon2 != null && (layoutParams5 = startIcon2.getLayoutParams()) != null) {
                    layoutParams5.width = i4;
                }
                startIconWidth = i4;
            } else {
                IconWrapper iconWrapper6 = this.getAsAtTimestamp;
                if (iconWrapper6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    iconWrapper6 = null;
                }
                ImageView startIcon3 = iconWrapper6.getF2636b();
                if (startIcon3 != null && (layoutParams4 = startIcon3.getLayoutParams()) != null) {
                    layoutParams4.width = 1;
                }
                startIconWidth = 1;
            }
            i4 = 0;
        } else {
            i4 -= startIconWidth;
            IconWrapper iconWrapper7 = this.getAsAtTimestamp;
            if (iconWrapper7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                iconWrapper7 = null;
            }
            ImageView startIcon4 = iconWrapper7.getF2636b();
            if (startIcon4 != null && (layoutParams6 = startIcon4.getLayoutParams()) != null) {
                layoutParams6.width = startIconWidth;
            }
        }
        if (endIconWidth != 0) {
            if (1 > endIconWidth || endIconWidth >= i4) {
                if (i4 > 0) {
                    IconWrapper iconWrapper8 = this.getAsAtTimestamp;
                    if (iconWrapper8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        iconWrapper8 = null;
                    }
                    ImageView endIcon2 = iconWrapper8.getCopydefault();
                    if (endIcon2 != null && (layoutParams2 = endIcon2.getLayoutParams()) != null) {
                        layoutParams2.width = i4;
                    }
                    startIconWidth += i4;
                } else {
                    IconWrapper iconWrapper9 = this.getAsAtTimestamp;
                    if (iconWrapper9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        iconWrapper9 = null;
                    }
                    ImageView endIcon3 = iconWrapper9.getCopydefault();
                    if (endIcon3 != null && (layoutParams = endIcon3.getLayoutParams()) != null) {
                        layoutParams.width = 1;
                    }
                    startIconWidth++;
                }
                i4 = 0;
            } else {
                i4 -= endIconWidth;
                startIconWidth += endIconWidth;
                IconWrapper iconWrapper10 = this.getAsAtTimestamp;
                if (iconWrapper10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    iconWrapper10 = null;
                }
                ImageView endIcon4 = iconWrapper10.getCopydefault();
                if (endIcon4 != null && (layoutParams3 = endIcon4.getLayoutParams()) != null) {
                    layoutParams3.width = endIconWidth;
                }
            }
        }
        if (viewGroup != null && viewGroup.getVisibility() != 8) {
            if (iCoerceAtMost > iDp2px) {
                iCoerceAtMost = (iDp2px + iMeasureText) + iMeasureText2 > i4 ? iDp2px : RangesKt.coerceAtMost(iCoerceAtMost, (i4 - iMeasureText) - iMeasureText2);
            }
            LoadingButton commonButton2 = this.component2.getCommonButton();
            ViewGroup.LayoutParams layoutParams17 = commonButton2 != null ? commonButton2.getLayoutParams() : null;
            if (iCoerceAtMost < i4) {
                if (layoutParams17 != null) {
                    layoutParams17.width = iCoerceAtMost;
                }
                i4 -= iCoerceAtMost;
                startIconWidth += iCoerceAtMost;
            } else {
                if (layoutParams17 != null) {
                    layoutParams17.width = i4;
                }
                startIconWidth += i4;
                i4 = 0;
            }
            LoadingButton commonButton3 = this.component2.getCommonButton();
            if (commonButton3 != null) {
                commonButton3.setLayoutParams(layoutParams17);
            }
        }
        int i5 = iMeasureText + iMeasureText2;
        if (i5 < i4) {
            UnitWrapper unitWrapper4 = this.k;
            if (unitWrapper4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                unitWrapper4 = null;
            }
            component3(unitWrapper4.getF2648a(), iMeasureText);
            UnitWrapper unitWrapper5 = this.k;
            if (unitWrapper5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                unitWrapper = unitWrapper5;
            }
            component3(unitWrapper.getComponent3(), iMeasureText2);
        } else {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i4 / 2, SizeUtils.dp2px(12.0f));
            if (iMeasureText > iCoerceAtLeast && iMeasureText2 > iCoerceAtLeast) {
                UnitWrapper unitWrapper6 = this.k;
                if (unitWrapper6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    unitWrapper6 = null;
                }
                component3(unitWrapper6.getF2648a(), iCoerceAtLeast);
                UnitWrapper unitWrapper7 = this.k;
                if (unitWrapper7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    unitWrapper = unitWrapper7;
                }
                component3(unitWrapper.getComponent3(), iCoerceAtLeast);
                i5 = iCoerceAtLeast + iCoerceAtLeast;
            } else {
                if (iMeasureText > iCoerceAtLeast) {
                    UnitWrapper unitWrapper8 = this.k;
                    if (unitWrapper8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        unitWrapper8 = null;
                    }
                    component3(unitWrapper8.getComponent3(), iMeasureText2);
                    int i6 = i4 - iMeasureText2;
                    if (i6 > SizeUtils.dp2px(12.0f)) {
                        UnitWrapper unitWrapper9 = this.k;
                        if (unitWrapper9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            unitWrapper = unitWrapper9;
                        }
                        component3(unitWrapper.getF2648a(), i6);
                        i = startIconWidth + i4;
                    } else {
                        UnitWrapper unitWrapper10 = this.k;
                        if (unitWrapper10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            unitWrapper = unitWrapper10;
                        }
                        component3(unitWrapper.getF2648a(), SizeUtils.dp2px(12.0f));
                        iDp2px2 = SizeUtils.dp2px(12.0f);
                        i4 += iDp2px2;
                        i = startIconWidth + i4;
                    }
                } else {
                    UnitWrapper unitWrapper11 = this.k;
                    if (unitWrapper11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        unitWrapper11 = null;
                    }
                    component3(unitWrapper11.getF2648a(), iMeasureText);
                    int i7 = i4 - iMeasureText;
                    if (i7 > SizeUtils.dp2px(12.0f)) {
                        UnitWrapper unitWrapper12 = this.k;
                        if (unitWrapper12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            unitWrapper = unitWrapper12;
                        }
                        component3(unitWrapper.getComponent3(), i7);
                        i = startIconWidth + i4;
                    } else {
                        UnitWrapper unitWrapper13 = this.k;
                        if (unitWrapper13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            unitWrapper = unitWrapper13;
                        }
                        component3(unitWrapper.getComponent3(), SizeUtils.dp2px(12.0f));
                        iDp2px2 = SizeUtils.dp2px(12.0f);
                        i4 += iDp2px2;
                        i = startIconWidth + i4;
                    }
                }
                component3(getEditText(), i3 - i);
            }
        }
        i = startIconWidth + i5;
        component3(getEditText(), i3 - i);
    }

    private final void component3(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintMaxWidth = i;
        view.setLayoutParams(layoutParams2);
    }

    public void updateStrokeColor() {
        BaseRoundView baseFilletView = this.invokeSuspend.getBaseFilletView();
        Intrinsics.checkNotNullExpressionValue(baseFilletView, "");
        if (this.f) {
            baseFilletView.setStrokeColor(this.copy);
            baseFilletView.setStrokeWidth(this.getSponsorBeneficiariesState);
            TextView textView = this.equals;
            if (textView != null) {
                textView.setTextColor(this.copy);
                return;
            }
            return;
        }
        InputTextWrapper inputTextWrapper = this.invoke;
        if (inputTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputTextWrapper = null;
        }
        if (inputTextWrapper.getCoroutineCreation().hasFocus()) {
            baseFilletView.setStrokeColor(this.toString);
            baseFilletView.setStrokeWidth(this.hashCode);
            TextView textView2 = this.equals;
            if (textView2 != null) {
                textView2.setTextColor(this.toString);
                return;
            }
            return;
        }
        baseFilletView.setStrokeColor(this.f2640b);
        baseFilletView.setStrokeWidth(this.f2639a);
        TextView textView3 = this.equals;
        if (textView3 != null) {
            textView3.setTextColor(this.f2640b);
        }
    }

    public final void setInputFocusStrokeColor(int inputFocusStrokeColor) {
        this.toString = inputFocusStrokeColor;
        updateStrokeColor();
    }

    public final void setInputUnFocusStrokeColor(int inputUnFocusStrokeColor) {
        this.f2640b = inputUnFocusStrokeColor;
        updateStrokeColor();
    }

    public final void setInputErrorStrokeColor(int inputErrorStrokeColor) {
        this.copy = inputErrorStrokeColor;
        updateStrokeColor();
    }

    public final void setShowError(boolean showError) {
        this.f = showError;
        updateStrokeColor();
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        updateStrokeColor();
    }

    public final String getText() {
        InputTextWrapper inputTextWrapper = this.invoke;
        if (inputTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputTextWrapper = null;
        }
        return inputTextWrapper.getCoroutineCreation().getText().toString();
    }

    public final EditText getEditText() {
        InputTextWrapper inputTextWrapper = this.invoke;
        if (inputTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputTextWrapper = null;
        }
        return inputTextWrapper.getCoroutineCreation();
    }

    public final ImageView getStartIcon() {
        IconWrapper iconWrapper = this.getAsAtTimestamp;
        if (iconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iconWrapper = null;
        }
        return iconWrapper.getF2636b();
    }

    public final ImageView getEndIcon() {
        IconWrapper iconWrapper = this.getAsAtTimestamp;
        if (iconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iconWrapper = null;
        }
        return iconWrapper.getCopydefault();
    }

    public final TextView getStartUnit() {
        UnitWrapper unitWrapper = this.k;
        if (unitWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            unitWrapper = null;
        }
        return unitWrapper.getF2648a();
    }

    public final TextView getEndUnit() {
        UnitWrapper unitWrapper = this.k;
        if (unitWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            unitWrapper = null;
        }
        return unitWrapper.getComponent3();
    }

    public final void setInputEnable(boolean inputEnable) {
        InputTextWrapper inputTextWrapper = this.invoke;
        if (inputTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputTextWrapper = null;
        }
        inputTextWrapper.setInputEnable(inputEnable);
    }

    public final void setOnInputViewParentClickListener(View.OnClickListener onClickListener) {
        InputTextWrapper inputTextWrapper = this.invoke;
        if (inputTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            inputTextWrapper = null;
        }
        inputTextWrapper.setOnInputViewParentClickListener(onClickListener);
    }

    public final View getInputParentView() {
        return this.invokeSuspend;
    }

    public final InputTextWrapper getInputTextWrapper() {
        InputTextWrapper inputTextWrapper = this.invoke;
        if (inputTextWrapper != null) {
            return inputTextWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final IconWrapper getIconWrapper() {
        IconWrapper iconWrapper = this.getAsAtTimestamp;
        if (iconWrapper != null) {
            return iconWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
