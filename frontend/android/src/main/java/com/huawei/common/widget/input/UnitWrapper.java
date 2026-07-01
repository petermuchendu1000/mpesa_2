package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.util.AppInfoUtils;
import com.huawei.common.widget.MPTextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010'H\u0002J\b\u0010-\u001a\u00020*H\u0002J\b\u0010.\u001a\u0004\u0018\u00010'J\b\u0010/\u001a\u0004\u0018\u00010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/huawei/common/widget/input/UnitWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "getContext", "()Landroid/content/Context;", "inputStartUnitText", "", "inputStartUnitTextSize", "inputStartUnitTextColor", "inputStartUnitPaddingStart", "inputStartUnitPaddingEnd", "inputStartUnitPaddingTop", "inputStartUnitPaddingBottom", "inputStartUnitMarginStart", "inputStartUnitMarginEnd", "inputStartUnitMarginTop", "inputStartUnitMarginBottom", "inputEndUnitText", "inputEndUnitTextSize", "inputEndUnitTextColor", "inputEndUnitPaddingStart", "inputEndUnitPaddingEnd", "inputEndUnitPaddingTop", "inputEndUnitPaddingBottom", "inputEndUnitMarginStart", "inputEndUnitMarginEnd", "inputEndUnitMarginTop", "inputEndUnitMarginBottom", "startUnitView", "Landroid/widget/TextView;", "endUnitView", "initAttrs", "", "setGoneIfEmpty", "editText", "initViews", "getStartUnit", "getEndUnit", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnitWrapper {
    private int ArtificialStackFrames;
    private int CoroutineDebuggingKt;
    private int ShareDataUIState;

    private TextView f2648a;
    private int accessartificialFrame;

    private int f2649b;

    private int f2650c;
    private final Context component1;
    private int component2;
    private TextView component3;
    private int component4;
    private int copy;
    private int copydefault;
    private int coroutineBoundary;
    private int coroutineCreation;

    private int f2651d;
    private int equals;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private String hashCode;
    private String invoke;
    private int toString;

    public UnitWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.component1 = context;
        this.f2651d = SizeUtils.sp2px(16.0f);
        this.getSponsorBeneficiariesState = SizeUtils.dp2px(12.0f);
        this.ArtificialStackFrames = SizeUtils.sp2px(16.0f);
        this.ShareDataUIState = SizeUtils.dp2px(12.0f);
        this.f2648a = (TextView) view.findViewById(R.id.startUnitView);
        TextView textView = (TextView) view.findViewById(R.id.endUnitView);
        this.component3 = textView;
        if (this.f2648a == null && textView == null) {
            return;
        }
        ShareDataUIState(context, attributeSet, i, i2);
        ShareDataUIState();
    }

    public final Context getComponent1() {
        return this.component1;
    }

    private final void ShareDataUIState(Context context, AttributeSet attributeSet, int i, int i2) {
        String string;
        int dimensionOrInt;
        int color;
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        int dimensionPixelOffset3;
        int dimensionPixelOffset4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InputUnit, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.f2650c = context.getColor(R.color.colorMainText);
        this.getShareableDataState = context.getColor(R.color.colorMainText);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_text)) {
            string = typedArrayObtainStyledAttributes.getString(R.styleable.InputUnit_input_start_unit_text);
        } else {
            string = typedArrayObtainStyledAttributes.getString(R.styleable.InputUnit_input_area_code);
        }
        this.invoke = string;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_text_size)) {
            dimensionOrInt = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, R.styleable.InputUnit_input_start_unit_text_size, this.f2651d);
        } else {
            dimensionOrInt = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, R.styleable.InputUnit_input_area_code_text_size, this.f2651d);
        }
        this.f2651d = dimensionOrInt;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_text_color)) {
            color = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.InputUnit_input_start_unit_text_color, this.f2650c);
        } else {
            color = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.InputUnit_input_area_code_text_color, this.f2650c);
        }
        this.f2650c = color;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_paddingStart)) {
            dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_start_unit_paddingStart, this.accessartificialFrame);
        } else {
            dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_area_code_paddingStart, this.accessartificialFrame);
        }
        this.accessartificialFrame = dimensionPixelOffset;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_paddingTop)) {
            dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_start_unit_paddingTop, this.f2649b);
        } else {
            dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_area_code_paddingTop, this.f2649b);
        }
        this.f2649b = dimensionPixelOffset2;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_paddingEnd)) {
            dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_start_unit_paddingEnd, this.coroutineBoundary);
        } else {
            dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_area_code_paddingEnd, this.coroutineBoundary);
        }
        this.coroutineBoundary = dimensionPixelOffset3;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.InputUnit_input_start_unit_paddingBottom)) {
            dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_start_unit_paddingBottom, this.coroutineCreation);
        } else {
            dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.InputUnit_input_area_code_paddingBottom, this.coroutineCreation);
        }
        this.coroutineCreation = dimensionPixelOffset4;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == R.styleable.InputUnit_input_start_unit_marginStart) {
                this.CoroutineDebuggingKt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.CoroutineDebuggingKt);
            } else if (index == R.styleable.InputUnit_input_start_unit_marginTop) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            } else if (index == R.styleable.InputUnit_input_start_unit_marginEnd) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.InputUnit_input_start_unit_marginBottom) {
                this.toString = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.toString);
            } else if (index == R.styleable.InputUnit_input_end_unit_text) {
                this.hashCode = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.InputUnit_input_end_unit_text_size) {
                this.ArtificialStackFrames = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.ArtificialStackFrames);
            } else if (index == R.styleable.InputUnit_input_end_unit_text_color) {
                this.getShareableDataState = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.getShareableDataState);
            } else if (index == R.styleable.InputUnit_input_end_unit_paddingStart) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.InputUnit_input_end_unit_paddingTop) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.InputUnit_input_end_unit_paddingEnd) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.InputUnit_input_end_unit_paddingBottom) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.InputUnit_input_end_unit_marginStart) {
                this.ShareDataUIState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ShareDataUIState);
            } else if (index == R.styleable.InputUnit_input_end_unit_marginTop) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.InputUnit_input_end_unit_marginEnd) {
                this.component2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component2);
            } else if (index == R.styleable.InputUnit_input_end_unit_marginBottom) {
                this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copydefault);
            }
        }
        String attrValue = AttrUtils.INSTANCE.getAttrValue(context, attributeSet, "input_start_unit_text");
        if (attrValue == null) {
            attrValue = this.invoke;
        }
        this.invoke = attrValue;
        String attrValue2 = AttrUtils.INSTANCE.getAttrValue(context, attributeSet, "input_end_unit_text");
        if (attrValue2 == null) {
            attrValue2 = this.hashCode;
        }
        this.hashCode = attrValue2;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void component1(final TextView textView) {
        if (textView != null) {
            textView.addTextChangedListener(new MPTextWatcher() {
                @Override
                public void afterTextChanged(Editable s) {
                    Editable editable = s;
                    textView.setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                }
            });
        }
    }

    private final void ShareDataUIState() {
        TextView textView = this.f2648a;
        if (textView != null) {
            component1(textView);
            TextView textView2 = this.f2648a;
            if (textView2 != null) {
                textView2.setText(this.invoke);
            }
            TextView textView3 = this.f2648a;
            if (textView3 != null) {
                textView3.setTextColor(this.f2650c);
            }
            TextView textView4 = this.f2648a;
            if (textView4 != null) {
                textView4.setTextSize(0, this.f2651d);
            }
            TextView textView5 = this.f2648a;
            if (textView5 != null) {
                textView5.setPadding(this.accessartificialFrame, this.f2649b, this.coroutineBoundary, this.coroutineCreation);
            }
            TextView textView6 = this.f2648a;
            ViewGroup.LayoutParams layoutParams = textView6 != null ? textView6.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(this.CoroutineDebuggingKt);
            marginLayoutParams.setMarginStart(AppInfoUtils.isLayoutRTL(this.component1) ? this.getSponsorBeneficiariesState : this.CoroutineDebuggingKt);
            marginLayoutParams.topMargin = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            marginLayoutParams.setMarginEnd(AppInfoUtils.isLayoutRTL(this.component1) ? this.CoroutineDebuggingKt : this.getSponsorBeneficiariesState);
            marginLayoutParams.bottomMargin = this.toString;
            TextView textView7 = this.f2648a;
            if (textView7 != null) {
                textView7.setLayoutParams(marginLayoutParams);
            }
        }
        TextView textView8 = this.component3;
        if (textView8 != null) {
            component1(textView8);
            TextView textView9 = this.component3;
            if (textView9 != null) {
                textView9.setText(this.hashCode);
            }
            TextView textView10 = this.component3;
            if (textView10 != null) {
                textView10.setTextColor(this.getShareableDataState);
            }
            TextView textView11 = this.component3;
            if (textView11 != null) {
                textView11.setTextSize(0, this.ArtificialStackFrames);
            }
            TextView textView12 = this.component3;
            if (textView12 != null) {
                textView12.setPadding(this.component4, this.equals, this.getRequestBeneficiariesState, this.getAsAtTimestamp);
            }
            TextView textView13 = this.component3;
            ViewGroup.LayoutParams layoutParams2 = textView13 != null ? textView13.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams2, "");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(this.ShareDataUIState);
            marginLayoutParams2.setMarginStart(AppInfoUtils.isLayoutRTL(this.component1) ? this.component2 : this.ShareDataUIState);
            marginLayoutParams2.topMargin = this.copy;
            marginLayoutParams2.setMarginEnd(AppInfoUtils.isLayoutRTL(this.component1) ? this.ShareDataUIState : this.component2);
            marginLayoutParams2.bottomMargin = this.copydefault;
            TextView textView14 = this.component3;
            if (textView14 != null) {
                textView14.setLayoutParams(marginLayoutParams2);
            }
        }
    }

    public final TextView getF2648a() {
        return this.f2648a;
    }

    public final TextView getComponent3() {
        return this.component3;
    }
}
