package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.griver.api.constants.GriverEvents;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.util.AppInfoUtils;
import com.huawei.common.util.drawable.DrawableUtils;
import kotlin.Metadata;
import kotlin.createFullyDrawnExecutor;
import kotlin.getOnBackPressedDispatcherannotations;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\u000e\u00100\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\tJ\u0010\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u00010\u0017J\u000e\u00103\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u00104\u001a\u00020.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00065"}, d2 = {"Lcom/huawei/common/widget/input/LabelWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "getAttrs", "()Landroid/util/AttributeSet;", "getDefStyleAttr", "()I", "getDefStyleRes", "inputTitle", "", "inputRequired", "", "inputStarRes", "inputStarsColor", "inputTitleTextSize", "inputTitleTextColor", "inputTitleDrawablePadding", "inputTitlePaddingStart", "inputTitlePaddingEnd", "inputTitlePaddingTop", "inputTitlePaddingBottom", "inputTitleMarginStart", "inputTitleMarginEnd", "inputTitleMarginTop", "inputTitleMarginBottom", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "initAttrs", "", "initViews", "setInputTitleTextColor", GriverEvents.EVENT_SET_TITLE, "title", "setInputRequired", "updateTitle", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LabelWrapper {
    private int ArtificialStackFrames;
    private int CoroutineDebuggingKt;
    private boolean ShareDataUIState;
    private TextView accessartificialFrame;

    private final View f2647c;
    private final int component1;
    private final Context component2;
    private final int component3;
    private String component4;
    private int copy;
    private final AttributeSet copydefault;
    private int coroutineBoundary;
    private int coroutineCreation;
    private int equals;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private int toString;

    public LabelWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.component2 = context;
        this.f2647c = view;
        this.copydefault = attributeSet;
        this.component1 = i;
        this.component3 = i2;
        this.copy = R.mipmap.icon_star;
        this.coroutineBoundary = SizeUtils.sp2px(16.0f);
        this.getAsAtTimestamp = SizeUtils.sp2px(4.0f);
        this.equals = SizeUtils.dp2px(4.0f);
        TextView textView = (TextView) view.findViewById(R.id.titleView);
        this.accessartificialFrame = textView;
        if (textView != null) {
            component2();
            copydefault();
        }
    }

    public final Context getComponent2() {
        return this.component2;
    }

    public final View getF2647c() {
        return this.f2647c;
    }

    public final AttributeSet getCopydefault() {
        return this.copydefault;
    }

    public final int getComponent1() {
        return this.component1;
    }

    public final int getComponent3() {
        return this.component3;
    }

    protected final TextView getAccessartificialFrame() {
        return this.accessartificialFrame;
    }

    protected final void setTitleView(TextView textView) {
        this.accessartificialFrame = textView;
    }

    private final void component2() {
        TypedArray typedArrayObtainStyledAttributes = this.component2.obtainStyledAttributes(this.copydefault, R.styleable.InputLabel, this.component1, this.component3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.getRequestBeneficiariesState = this.component2.getColor(R.color.colorUrgentDefault);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = this.component2.getColor(R.color.colorGeneralText);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.InputLabel_input_start_color) {
                this.getRequestBeneficiariesState = AttrUtils.INSTANCE.getColor(this.component2, typedArrayObtainStyledAttributes, index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.InputLabel_input_start) {
                this.copy = typedArrayObtainStyledAttributes.getResourceId(index, this.copy);
            } else if (index == R.styleable.InputLabel_input_required) {
                this.ShareDataUIState = typedArrayObtainStyledAttributes.getBoolean(index, this.ShareDataUIState);
            } else if (index == R.styleable.InputLabel_input_title) {
                this.component4 = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.InputLabel_input_title_text_size) {
                this.coroutineBoundary = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.coroutineBoundary);
            } else if (index == R.styleable.InputLabel_input_title_text_color) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = AttrUtils.INSTANCE.getColor(this.component2, typedArrayObtainStyledAttributes, index, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            } else if (index == R.styleable.InputLabel_input_title_drawablePadding) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            } else if (index == R.styleable.InputLabel_input_title_paddingStart) {
                this.coroutineCreation = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.coroutineCreation);
            } else if (index == R.styleable.InputLabel_input_title_paddingTop) {
                this.CoroutineDebuggingKt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.CoroutineDebuggingKt);
            } else if (index == R.styleable.InputLabel_input_title_paddingEnd) {
                this.getShareableDataState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getShareableDataState);
            } else if (index == R.styleable.InputLabel_input_title_paddingBottom) {
                this.hashCode = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.hashCode);
            } else if (index == R.styleable.InputLabel_input_title_marginStart) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.InputLabel_input_title_marginTop) {
                this.ArtificialStackFrames = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ArtificialStackFrames);
            } else if (index == R.styleable.InputLabel_input_title_marginEnd) {
                this.toString = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.toString);
            } else if (index == R.styleable.InputLabel_input_title_marginBottom) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            }
        }
        String attrValue = AttrUtils.INSTANCE.getAttrValue(this.component2, this.copydefault, "input_title");
        if (attrValue == null) {
            attrValue = this.component4;
        }
        this.component4 = attrValue;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void copydefault() {
        TextView textView = this.accessartificialFrame;
        if (textView != null) {
            if (textView != null) {
                textView.setText(this.component4);
            }
            TextView textView2 = this.accessartificialFrame;
            if (textView2 != null) {
                textView2.setTextColor(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            }
            TextView textView3 = this.accessartificialFrame;
            if (textView3 != null) {
                textView3.setTextSize(0, this.coroutineBoundary);
            }
            TextView textView4 = this.accessartificialFrame;
            if (textView4 != null) {
                textView4.setPadding(this.coroutineCreation, this.CoroutineDebuggingKt, this.getShareableDataState, this.hashCode);
            }
            TextView textView5 = this.accessartificialFrame;
            if (textView5 != null) {
                textView5.setCompoundDrawablePadding(this.getAsAtTimestamp);
            }
            TextView textView6 = this.accessartificialFrame;
            ViewGroup.LayoutParams layoutParams = textView6 != null ? textView6.getLayoutParams() : null;
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(this.getSponsorBeneficiariesState);
            marginLayoutParams.topMargin = this.ArtificialStackFrames;
            marginLayoutParams.setMarginEnd(this.toString);
            marginLayoutParams.bottomMargin = this.equals;
            updateTitle();
        }
    }

    public final void setInputTitleTextColor(int inputTitleTextColor) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = inputTitleTextColor;
        TextView textView = this.accessartificialFrame;
        if (textView != null) {
            textView.setTextColor(inputTitleTextColor);
        }
    }

    public final void setTitle(String title) {
        this.component4 = title;
        updateTitle();
    }

    public final void setInputRequired(boolean inputRequired) {
        this.ShareDataUIState = inputRequired;
        updateTitle();
    }

    public final void updateTitle() {
        Drawable drawableWithColor;
        if (TextUtils.isEmpty(this.component4)) {
            TextView textView = this.accessartificialFrame;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.accessartificialFrame;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.accessartificialFrame;
        if (textView3 != null) {
            textView3.setText(this.component4);
        }
        if (!this.ShareDataUIState) {
            TextView textView4 = this.accessartificialFrame;
            if (textView4 != null) {
                textView4.setCompoundDrawables(null, null, null, null);
                return;
            }
            return;
        }
        try {
            drawableWithColor = DrawableUtils.getDrawableWithColor(this.component2, this.copy, this.getRequestBeneficiariesState);
        } catch (Exception unused) {
            drawableWithColor = null;
        }
        if (drawableWithColor != null) {
            drawableWithColor.setBounds(0, 0, this.component2.getResources().getDimensionPixelOffset(R.dimen.dp_6), this.component2.getResources().getDimensionPixelOffset(R.dimen.dp_6));
            if (AppInfoUtils.isLayoutRTL(this.component2)) {
                TextView textView5 = this.accessartificialFrame;
                if (textView5 != null) {
                    textView5.setCompoundDrawables(null, null, drawableWithColor, null);
                    return;
                }
                return;
            }
            TextView textView6 = this.accessartificialFrame;
            if (textView6 != null) {
                textView6.setCompoundDrawables(drawableWithColor, null, null, null);
            }
        }
    }

    public static void ShareDataUIState() {
        getOnBackPressedDispatcherannotations.ShareDataUIState[0] = createFullyDrawnExecutor.component2[0];
    }
}
