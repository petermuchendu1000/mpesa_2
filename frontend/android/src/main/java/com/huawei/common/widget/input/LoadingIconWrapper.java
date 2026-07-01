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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\tR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/huawei/common/widget/input/LoadingIconWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "loadingIcon", "loadingIconWidth", "loadingIconHeight", "loadingIconPaddingStart", "loadingIconPaddingEnd", "loadingIconPaddingTop", "loadingIconPaddingBottom", "loadingIconMarginStart", "loadingIconMarginEnd", "loadingIconMarginTop", "loadingIconMarginBottom", "loadingIconView", "Landroid/widget/ImageView;", "initAttrs", "", "initViews", "getLoadingIcon", "getWidth", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoadingIconWrapper {
    private ImageView ArtificialStackFrames;
    private int ShareDataUIState;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private int copydefault;
    private int equals;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int hashCode;

    public LoadingIconWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = R.mipmap.base_ic_loading;
        this.hashCode = SizeUtils.dp2px(24.0f);
        this.component3 = SizeUtils.dp2px(24.0f);
        this.component1 = SizeUtils.dp2px(4.0f);
        View viewFindViewById = view.findViewById(R.id.loadingIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.ArtificialStackFrames = (ImageView) viewFindViewById;
        copydefault(context, attributeSet, i, i2);
        component2();
    }

    private final void copydefault(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        int dimensionOrInt;
        int dimensionOrInt2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoadingIcon, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LoadingIcon_loading_icon)) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.LoadingIcon_loading_icon, this.copydefault);
        } else {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.LoadingIcon_icon_drawable, this.copydefault);
        }
        this.copydefault = resourceId;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LoadingIcon_loading_icon_width)) {
            dimensionOrInt = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, R.styleable.LoadingIcon_loading_icon_width, this.hashCode);
        } else {
            dimensionOrInt = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, R.styleable.LoadingIcon_icon_with, this.hashCode);
        }
        this.hashCode = dimensionOrInt;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LoadingIcon_loading_icon_height)) {
            dimensionOrInt2 = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, R.styleable.LoadingIcon_loading_icon_height, this.component3);
        } else {
            dimensionOrInt2 = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, R.styleable.LoadingIcon_icon_height, this.component3);
        }
        this.component3 = dimensionOrInt2;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == R.styleable.LoadingIcon_loading_icon_paddingStart) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.LoadingIcon_loading_icon_paddingTop) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.LoadingIcon_loading_icon_paddingEnd) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.LoadingIcon_loading_icon_paddingBottom) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.LoadingIcon_loading_icon_marginStart) {
                this.ShareDataUIState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ShareDataUIState);
            } else if (index == R.styleable.LoadingIcon_loading_icon_marginTop) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.LoadingIcon_loading_icon_marginEnd) {
                this.component1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component1);
            } else if (index == R.styleable.LoadingIcon_loading_icon_marginBottom) {
                this.component2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component2);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void component2() {
        this.ArtificialStackFrames.setImageResource(this.copydefault);
        this.ArtificialStackFrames.setPadding(this.getAsAtTimestamp, this.copy, this.component4, this.getRequestBeneficiariesState);
        ViewGroup.LayoutParams layoutParams = this.ArtificialStackFrames.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = this.hashCode;
        marginLayoutParams.height = this.component3;
        marginLayoutParams.setMarginStart(this.ShareDataUIState);
        marginLayoutParams.topMargin = this.equals;
        marginLayoutParams.setMarginEnd(this.component1);
        marginLayoutParams.bottomMargin = this.component2;
        this.ArtificialStackFrames.setLayoutParams(marginLayoutParams);
    }

    public final ImageView getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }

    public final int getHashCode() {
        return this.hashCode;
    }
}
