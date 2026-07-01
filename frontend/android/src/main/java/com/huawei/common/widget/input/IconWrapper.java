package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.util.AppInfoUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u0004\u0018\u00010&J\b\u0010,\u001a\u0004\u0018\u00010&J\u0006\u0010-\u001a\u00020\tJ\u0006\u0010.\u001a\u00020\tJ\u0016\u0010/\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tJ\u0016\u00100\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/huawei/common/widget/input/IconWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "getContext", "()Landroid/content/Context;", "inputStartIcon", "inputStartIconWidth", "inputStartIconHeight", "inputStartIconPaddingStart", "inputStartIconPaddingEnd", "inputStartIconPaddingTop", "inputStartIconPaddingBottom", "inputStartIconMarginStart", "inputStartIconMarginEnd", "inputStartIconMarginTop", "inputStartIconMarginBottom", "inputEndIcon", "inputEndIconWidth", "inputEndIconHeight", "inputEndIconPaddingStart", "inputEndIconPaddingEnd", "inputEndIconPaddingTop", "inputEndIconPaddingBottom", "inputEndIconMarginStart", "inputEndIconMarginEnd", "inputEndIconMarginTop", "inputEndIconMarginBottom", "startIconView", "Landroid/widget/ImageView;", "endIconView", "initAttrs", "", "initViews", "getStartIcon", "getEndIcon", "getStartIconWidth", "getEndIconWidth", "setStartIconSize", "setEndIconSize", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IconWrapper {
    private int ArtificialStackFrames;
    private int CoroutineDebuggingKt;
    private int ShareDataUIState;

    private int f2635a;
    private int accessartificialFrame;

    private ImageView f2636b;

    private int f2637c;
    private final Context component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private ImageView copydefault;
    private int coroutineBoundary;
    private int coroutineCreation;

    private int f2638d;
    private int equals;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private int invoke;
    private int toString;

    public IconWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.component1 = context;
        this.f2637c = SizeUtils.dp2px(24.0f);
        this.getShareableDataState = SizeUtils.dp2px(24.0f);
        this.coroutineBoundary = SizeUtils.dp2px(12.0f);
        this.hashCode = SizeUtils.dp2px(24.0f);
        this.component3 = SizeUtils.dp2px(24.0f);
        this.equals = SizeUtils.dp2px(12.0f);
        this.f2636b = (ImageView) view.findViewById(R.id.startIconView);
        ImageView imageView = (ImageView) view.findViewById(R.id.endIconView);
        this.copydefault = imageView;
        if (this.f2636b == null && imageView == null) {
            return;
        }
        ShareDataUIState(context, attributeSet, i, i2);
        component3();
    }

    public final Context getComponent1() {
        return this.component1;
    }

    private final void ShareDataUIState(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        int dimensionPixelOffset3;
        int dimensionPixelOffset4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InputIcon, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputIcon_input_end_icon)) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.InputIcon_input_end_icon, this.component2);
        } else {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.InputIcon_input_icon, this.component2);
        }
        this.component2 = resourceId;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputIcon_input_end_icon_paddingStart)) {
            dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_end_icon_paddingStart, this.getSponsorBeneficiariesState);
        } else {
            dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_icon_paddingHorizontal, this.getSponsorBeneficiariesState);
        }
        this.getSponsorBeneficiariesState = dimensionPixelOffset;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputIcon_input_end_icon_paddingEnd)) {
            dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_end_icon_paddingEnd, this.component4);
        } else {
            dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_icon_paddingHorizontal, this.component4);
        }
        this.component4 = dimensionPixelOffset2;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputIcon_input_end_icon_paddingTop)) {
            dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_end_icon_paddingTop, this.toString);
        } else {
            dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_icon_paddingVertical, this.toString);
        }
        this.toString = dimensionPixelOffset3;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputIcon_input_end_icon_paddingBottom)) {
            dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_end_icon_paddingBottom, this.getRequestBeneficiariesState);
        } else {
            dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputIcon_input_icon_paddingVertical, this.getRequestBeneficiariesState);
        }
        this.getRequestBeneficiariesState = dimensionPixelOffset4;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == R.styleable.InputIcon_input_start_icon) {
                this.ArtificialStackFrames = typedArrayObtainStyledAttributes.getResourceId(index, this.ArtificialStackFrames);
            } else if (index == R.styleable.InputIcon_input_start_icon_width) {
                this.f2637c = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.f2637c);
            } else if (index == R.styleable.InputIcon_input_start_icon_height) {
                this.getShareableDataState = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.getShareableDataState);
            } else if (index == R.styleable.InputIcon_input_start_icon_paddingStart) {
                this.invoke = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.invoke);
            } else if (index == R.styleable.InputIcon_input_start_icon_paddingTop) {
                this.f2638d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2638d);
            } else if (index == R.styleable.InputIcon_input_start_icon_paddingEnd) {
                this.f2635a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2635a);
            } else if (index == R.styleable.InputIcon_input_start_icon_paddingBottom) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.InputIcon_input_start_icon_marginStart) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            } else if (index == R.styleable.InputIcon_input_start_icon_marginTop) {
                this.accessartificialFrame = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.accessartificialFrame);
            } else if (index == R.styleable.InputIcon_input_start_icon_marginEnd) {
                this.coroutineBoundary = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.coroutineBoundary);
            } else if (index == R.styleable.InputIcon_input_start_icon_marginBottom) {
                this.CoroutineDebuggingKt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.CoroutineDebuggingKt);
            } else if (index == R.styleable.InputIcon_input_end_icon_width) {
                this.hashCode = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.hashCode);
            } else if (index == R.styleable.InputIcon_input_end_icon_height) {
                this.component3 = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.component3);
            } else if (index == R.styleable.InputIcon_input_end_icon_marginStart) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.InputIcon_input_end_icon_marginTop) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.InputIcon_input_end_icon_marginEnd) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.InputIcon_input_end_icon_marginBottom) {
                this.ShareDataUIState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ShareDataUIState);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void component3() {
        ImageView imageView = this.f2636b;
        if (imageView != null) {
            if (imageView != null) {
                imageView.setImageResource(this.ArtificialStackFrames);
            }
            ImageView imageView2 = this.f2636b;
            if (imageView2 != null) {
                imageView2.setPadding(this.invoke, this.f2638d, this.f2635a, this.coroutineCreation);
            }
            ImageView imageView3 = this.f2636b;
            ViewGroup.LayoutParams layoutParams = imageView3 != null ? imageView3.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = this.f2637c;
            marginLayoutParams.height = this.getShareableDataState;
            marginLayoutParams.setMarginStart(AppInfoUtils.isLayoutRTL(this.component1) ? this.coroutineBoundary : this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            marginLayoutParams.topMargin = this.accessartificialFrame;
            marginLayoutParams.setMarginEnd(AppInfoUtils.isLayoutRTL(this.component1) ? this.getARTIFICIAL_FRAME_PACKAGE_NAME : this.coroutineBoundary);
            marginLayoutParams.bottomMargin = this.CoroutineDebuggingKt;
            ImageView imageView4 = this.f2636b;
            if (imageView4 != null) {
                imageView4.setLayoutParams(marginLayoutParams);
            }
        }
        ImageView imageView5 = this.copydefault;
        if (imageView5 != null) {
            if (imageView5 != null) {
                imageView5.setImageResource(this.component2);
            }
            ImageView imageView6 = this.copydefault;
            if (imageView6 != null) {
                imageView6.setPadding(this.getSponsorBeneficiariesState, this.toString, this.component4, this.getRequestBeneficiariesState);
            }
            ImageView imageView7 = this.copydefault;
            ViewGroup.LayoutParams layoutParams2 = imageView7 != null ? imageView7.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams2, "");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.width = this.hashCode;
            marginLayoutParams2.height = this.component3;
            marginLayoutParams2.setMarginStart(AppInfoUtils.isLayoutRTL(this.component1) ? this.getAsAtTimestamp : this.equals);
            marginLayoutParams2.topMargin = this.copy;
            marginLayoutParams2.setMarginEnd(AppInfoUtils.isLayoutRTL(this.component1) ? this.equals : this.getAsAtTimestamp);
            marginLayoutParams2.bottomMargin = this.ShareDataUIState;
            ImageView imageView8 = this.copydefault;
            if (imageView8 != null) {
                imageView8.setLayoutParams(marginLayoutParams2);
            }
        }
    }

    public final ImageView getF2636b() {
        return this.f2636b;
    }

    public final ImageView getCopydefault() {
        return this.copydefault;
    }

    public final int getStartIconWidth() {
        ImageView imageView = this.f2636b;
        if (imageView == null) {
            return 0;
        }
        if (imageView == null || imageView.getVisibility() != 8) {
            return this.f2637c;
        }
        return 0;
    }

    public final int getEndIconWidth() {
        ImageView imageView = this.copydefault;
        if (imageView == null) {
            return 0;
        }
        if (imageView == null || imageView.getVisibility() != 8) {
            return this.hashCode;
        }
        return 0;
    }

    public final void setStartIconSize(int inputStartIconWidth, int inputStartIconHeight) {
        this.f2637c = inputStartIconWidth;
        this.getShareableDataState = inputStartIconHeight;
        ImageView imageView = this.f2636b;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = inputStartIconWidth;
        marginLayoutParams.height = inputStartIconHeight;
        ImageView imageView2 = this.f2636b;
        if (imageView2 != null) {
            imageView2.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setEndIconSize(int inputEndIconWidth, int inputEndIconHeight) {
        this.hashCode = inputEndIconWidth;
        this.component3 = inputEndIconHeight;
        ImageView imageView = this.copydefault;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = inputEndIconWidth;
        marginLayoutParams.height = inputEndIconHeight;
        ImageView imageView2 = this.copydefault;
        if (imageView2 != null) {
            imageView2.setLayoutParams(marginLayoutParams);
        }
    }
}
