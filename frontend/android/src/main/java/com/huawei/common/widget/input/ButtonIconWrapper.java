package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010&\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/huawei/common/widget/input/ButtonIconWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "inputStartIcon", "inputStartIconWidth", "inputStartIconHeight", "inputStartIconPaddingStart", "inputStartIconPaddingEnd", "inputStartIconPaddingTop", "inputStartIconPaddingBottom", "inputStartIconMarginStart", "inputStartIconMarginEnd", "inputStartIconMarginTop", "inputStartIconMarginBottom", "inputEndIcon", "inputEndIconWidth", "inputEndIconHeight", "inputEndIconPaddingStart", "inputEndIconPaddingEnd", "inputEndIconPaddingTop", "inputEndIconPaddingBottom", "inputEndIconMarginStart", "inputEndIconMarginEnd", "inputEndIconMarginTop", "inputEndIconMarginBottom", "startIconView", "Landroid/widget/ImageView;", "endIconView", "initAttrs", "", "initViews", "getStartIcon", "getEndIcon", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonIconWrapper {
    private int ArtificialStackFrames;
    private int CoroutineDebuggingKt;
    private ImageView ShareDataUIState;

    private ImageView f2631a;
    private int accessartificialFrame;

    private int f2632b;

    private int f2633c;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private int copydefault;
    private int coroutineBoundary;
    private int coroutineCreation;

    private int f2634d;
    private int equals;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private int toString;

    public ButtonIconWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f2632b = SizeUtils.dp2px(24.0f);
        this.toString = SizeUtils.dp2px(24.0f);
        this.coroutineBoundary = SizeUtils.dp2px(4.0f);
        this.ArtificialStackFrames = SizeUtils.dp2px(24.0f);
        this.component2 = SizeUtils.dp2px(24.0f);
        this.copy = SizeUtils.dp2px(4.0f);
        View viewFindViewById = view.findViewById(R.id.startButtonIconView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.f2631a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.endButtonIconView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.ShareDataUIState = (ImageView) viewFindViewById2;
        component2(context, attributeSet, i, i2);
        component2();
    }

    private final void component2(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonIcon, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.component3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ButtonIcon_button_end_icon, this.component3);
        this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ButtonIcon_button_end_icon_paddingStart, this.getRequestBeneficiariesState);
        this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ButtonIcon_button_end_icon_paddingEnd, this.getAsAtTimestamp);
        this.getShareableDataState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ButtonIcon_button_end_icon_paddingTop, this.getShareableDataState);
        this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ButtonIcon_button_end_icon_paddingBottom, this.equals);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == R.styleable.ButtonIcon_button_start_icon) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getResourceId(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_width) {
                this.f2632b = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.f2632b);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_height) {
                this.toString = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.toString);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_paddingStart) {
                this.f2633c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2633c);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_paddingTop) {
                this.f2634d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2634d);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_paddingEnd) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_paddingBottom) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_marginStart) {
                this.CoroutineDebuggingKt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.CoroutineDebuggingKt);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_marginTop) {
                this.accessartificialFrame = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.accessartificialFrame);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_marginEnd) {
                this.coroutineBoundary = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.coroutineBoundary);
            } else if (index == R.styleable.ButtonIcon_button_start_icon_marginBottom) {
                this.hashCode = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.hashCode);
            } else if (index == R.styleable.ButtonIcon_button_end_icon_width) {
                this.ArtificialStackFrames = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.ArtificialStackFrames);
            } else if (index == R.styleable.ButtonIcon_button_end_icon_height) {
                this.component2 = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.component2);
            } else if (index == R.styleable.ButtonIcon_button_end_icon_marginStart) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.ButtonIcon_button_end_icon_marginTop) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.ButtonIcon_button_end_icon_marginEnd) {
                this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copydefault);
            } else if (index == R.styleable.ButtonIcon_button_end_icon_marginBottom) {
                this.component1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component1);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void component2() {
        this.f2631a.setImageResource(this.getSponsorBeneficiariesState);
        this.f2631a.setPadding(this.f2633c, this.f2634d, this.getARTIFICIAL_FRAME_PACKAGE_NAME, this.coroutineCreation);
        ViewGroup.LayoutParams layoutParams = this.f2631a.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = this.f2632b;
        marginLayoutParams.height = this.toString;
        marginLayoutParams.setMarginStart(this.CoroutineDebuggingKt);
        marginLayoutParams.topMargin = this.accessartificialFrame;
        marginLayoutParams.setMarginEnd(this.coroutineBoundary);
        marginLayoutParams.bottomMargin = this.hashCode;
        this.f2631a.setLayoutParams(marginLayoutParams);
        this.ShareDataUIState.setImageResource(this.component3);
        this.ShareDataUIState.setPadding(this.getRequestBeneficiariesState, this.getShareableDataState, this.getAsAtTimestamp, this.equals);
        ViewGroup.LayoutParams layoutParams2 = this.ShareDataUIState.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.width = this.ArtificialStackFrames;
        marginLayoutParams2.height = this.component2;
        marginLayoutParams2.setMarginStart(this.copy);
        marginLayoutParams2.topMargin = this.component4;
        marginLayoutParams2.setMarginEnd(this.copydefault);
        marginLayoutParams2.bottomMargin = this.component1;
        this.ShareDataUIState.setLayoutParams(marginLayoutParams2);
    }

    public final ImageView getF2631a() {
        return this.f2631a;
    }

    public final ImageView getShareDataUIState() {
        return this.ShareDataUIState;
    }
}
