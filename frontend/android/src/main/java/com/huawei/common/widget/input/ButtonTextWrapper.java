package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u0006\u0010'\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/huawei/common/widget/input/ButtonTextWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "getAttrs", "()Landroid/util/AttributeSet;", "getDefStyleAttr", "()I", "getDefStyleRes", "buttonText", "", "buttonTextTextSize", "buttonTextTextColor", "buttonTextPaddingStart", "buttonTextPaddingEnd", "buttonTextPaddingTop", "buttonTextPaddingBottom", "buttonTextMarginStart", "buttonTextMarginEnd", "buttonTextMarginTop", "buttonTextMarginBottom", "buttonTextView", "Landroid/widget/TextView;", "initAttrs", "", "initViews", "getButtonTextView", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonTextWrapper {
    private TextView ArtificialStackFrames;
    private final int CoroutineDebuggingKt;
    private final AttributeSet ShareDataUIState;
    private final View accessartificialFrame;
    private int component1;
    private int component2;
    private String component3;
    private int component4;
    private int copy;
    private int copydefault;
    private int equals;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private final int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private final Context toString;

    public ButtonTextWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.toString = context;
        this.accessartificialFrame = view;
        this.ShareDataUIState = attributeSet;
        this.getShareableDataState = i;
        this.CoroutineDebuggingKt = i2;
        this.getSponsorBeneficiariesState = SizeUtils.sp2px(16.0f);
        View viewFindViewById = view.findViewById(R.id.buttonTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.ArtificialStackFrames = (TextView) viewFindViewById;
        component2();
        component3();
    }

    public final Context getToString() {
        return this.toString;
    }

    public final View getAccessartificialFrame() {
        return this.accessartificialFrame;
    }

    public final AttributeSet getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final int getGetShareableDataState() {
        return this.getShareableDataState;
    }

    public final int getCoroutineDebuggingKt() {
        return this.CoroutineDebuggingKt;
    }

    private final void component2() {
        TypedArray typedArrayObtainStyledAttributes = this.toString.obtainStyledAttributes(this.ShareDataUIState, R.styleable.ButtonText, this.getShareableDataState, this.CoroutineDebuggingKt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        this.hashCode = this.toString.getColor(R.color.colorBackground);
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.ButtonText_lb_text) {
                this.component3 = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.ButtonText_lb_text_size) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.ButtonText_lb_text_color) {
                AttrUtils attrUtils = AttrUtils.INSTANCE;
                Context context = this.toString;
                this.hashCode = attrUtils.getColor(context, typedArrayObtainStyledAttributes, index, context.getColor(R.color.colorBackground));
            } else if (index == R.styleable.ButtonText_lb_text_paddingStart) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.ButtonText_lb_text_paddingTop) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.ButtonText_lb_text_paddingEnd) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.ButtonText_lb_text_paddingBottom) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.ButtonText_lb_text_marginStart) {
                this.component2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component2);
            } else if (index == R.styleable.ButtonText_lb_text_marginTop) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.ButtonText_lb_text_marginEnd) {
                this.component1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component1);
            } else if (index == R.styleable.ButtonText_lb_text_marginBottom) {
                this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copydefault);
            }
        }
        String attrValue = AttrUtils.INSTANCE.getAttrValue(this.toString, this.ShareDataUIState, "lb_text");
        if (attrValue == null) {
            attrValue = this.component3;
        }
        this.component3 = attrValue;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void component3() {
        this.ArtificialStackFrames.setText(this.component3);
        this.ArtificialStackFrames.setTextColor(this.hashCode);
        this.ArtificialStackFrames.setTextSize(0, this.getSponsorBeneficiariesState);
        this.ArtificialStackFrames.setPadding(this.getAsAtTimestamp, this.equals, this.component4, this.getRequestBeneficiariesState);
        ViewGroup.LayoutParams layoutParams = this.ArtificialStackFrames.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.component2);
        marginLayoutParams.topMargin = this.copy;
        marginLayoutParams.setMarginEnd(this.component1);
        marginLayoutParams.bottomMargin = this.copydefault;
    }

    public final TextView getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }
}
