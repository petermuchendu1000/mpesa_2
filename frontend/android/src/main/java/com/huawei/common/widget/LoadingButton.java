package com.huawei.common.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.util.L;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.input.ButtonIconWrapper;
import com.huawei.common.widget.input.ButtonTextWrapper;
import com.huawei.common.widget.input.LoadingIconWrapper;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\u001e\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u0016\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010&\u001a\u00020%J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0016J\u0006\u0010*\u001a\u00020\u000fJ\u0006\u0010+\u001a\u00020\u0011J\u0006\u0010,\u001a\u00020\u0013J\u0010\u0010-\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010/J\u0006\u00100\u001a\u00020%J0\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\nH\u0014J\u000e\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\nJ\u0006\u00109\u001a\u00020%J\u0006\u0010:\u001a\u00020\nR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/huawei/common/widget/LoadingButton;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "buttonTextWrapper", "Lcom/huawei/common/widget/input/ButtonTextWrapper;", "iconWrapper", "Lcom/huawei/common/widget/input/ButtonIconWrapper;", "loadingIconWrapper", "Lcom/huawei/common/widget/input/LoadingIconWrapper;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "objectAnimator", "Landroid/animation/ObjectAnimator;", "textEnableColor", "textDisableColor", "enableBackgroundColor", "clickBackgroundColor", "disableBackgroundColor", "disableColorAlpha", "", "remainWidth", "setBackgroundColor", "", "updateBackground", "setEnabled", "enabled", "", "getButtonTextWrapper", "getIconWrapper", "getLoadingIconWrapper", "setText", "text", "", "startLoading", "onLayout", "changed", "left", "top", "right", ThemeConstants.INDICA_POSITION_BOTTOM, "update", "w", "finishLoading", "getExceptWidth", "Companion", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class LoadingButton extends RoundConstraintLayout {
    private static final int ANIMATOR_DURATION = 3000;
    private static final String TAG = "CommonButton";
    private ButtonTextWrapper buttonTextWrapper;
    private int clickBackgroundColor;
    private int disableBackgroundColor;
    private float disableColorAlpha;
    private int enableBackgroundColor;
    private ButtonIconWrapper iconWrapper;
    private LoadingIconWrapper loadingIconWrapper;
    private ObjectAnimator objectAnimator;
    private int remainWidth;
    private int textDisableColor;
    private int textEnableColor;
    public TextView textView;

    public final TextView getTextView() {
        TextView textView = this.textView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setTextView(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.textView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingButton(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.disableColorAlpha = 0.3f;
        this.remainWidth = -1;
        try {
            LayoutInflater.from(context).inflate(R.layout.common_loading_button, (ViewGroup) this, true);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.round_corner);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            if (typedArrayObtainStyledAttributes.getIndexCount() == 0) {
                getBaseFilletView().setRoundCorner(SizeUtils.dp2px(8.0f));
            }
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.AndroidPadding);
            if (typedArrayObtainStyledAttributes2.getIndexCount() == 0) {
                setPadding(SizeUtils.dp2px(16.0f), getPaddingTop(), SizeUtils.dp2px(16.0f), getPaddingBottom());
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.buttonTextWrapper = new ButtonTextWrapper(context, this, attributeSet, i, i2);
            this.iconWrapper = new ButtonIconWrapper(context, this, attributeSet, i, i2);
            this.loadingIconWrapper = new LoadingIconWrapper(context, this, attributeSet, i, i2);
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, R.styleable.CommonButtonParent);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes3, "");
            this.textEnableColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes3, R.styleable.CommonButtonParent_lb_text_color, context.getColor(R.color.colorBackground));
            this.textDisableColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes3, R.styleable.CommonButtonParent_lb_text_color_disable, context.getColor(R.color.colorBackground));
            boolean z = typedArrayObtainStyledAttributes3.getBoolean(R.styleable.CommonButtonParent_lb_enable, true);
            this.enableBackgroundColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes3, R.styleable.CommonButtonParent_lb_background_enable_color, context.getColor(R.color.colorPrimary));
            this.disableColorAlpha = typedArrayObtainStyledAttributes3.getFloat(R.styleable.CommonButtonParent_lb_disable_color_alpha, 0.3f);
            this.disableBackgroundColor = ColorUtils.INSTANCE.withAlpha(this.disableColorAlpha, this.enableBackgroundColor);
            try {
                if (typedArrayObtainStyledAttributes3.hasValue(R.styleable.CommonButtonParent_lb_background_disable_color)) {
                    this.disableBackgroundColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes3, R.styleable.CommonButtonParent_lb_background_disable_color, this.disableBackgroundColor);
                }
            } catch (Exception e) {
                L.e(TAG, e.getMessage());
            }
            this.clickBackgroundColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes3, R.styleable.CommonButtonParent_lb_background_click_color, context.getColor(R.color.colorPrimaryClick));
            typedArrayObtainStyledAttributes3.recycle();
            updateBackground();
            setEnabled(z);
            ButtonTextWrapper buttonTextWrapper = this.buttonTextWrapper;
            if (buttonTextWrapper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                buttonTextWrapper = null;
            }
            setTextView(buttonTextWrapper.getArtificialStackFrames());
        } catch (Exception e2) {
            L.e(TAG, e2.getMessage());
        }
    }

    public final void setBackgroundColor(int enableBackgroundColor, int disableBackgroundColor, int clickBackgroundColor) {
        this.enableBackgroundColor = enableBackgroundColor;
        this.clickBackgroundColor = clickBackgroundColor;
        this.disableBackgroundColor = disableBackgroundColor;
        updateBackground();
    }

    public final void setBackgroundColor(int enableBackgroundColor, int clickBackgroundColor) {
        setBackgroundColor(enableBackgroundColor, ColorUtils.INSTANCE.withAlpha(this.disableColorAlpha, enableBackgroundColor), clickBackgroundColor);
    }

    public final void updateBackground() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.clickBackgroundColor);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(this.enableBackgroundColor);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(this.disableBackgroundColor);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable3);
        setBackground(stateListDrawable);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ButtonTextWrapper buttonTextWrapper = this.buttonTextWrapper;
        ButtonTextWrapper buttonTextWrapper2 = null;
        if (buttonTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            buttonTextWrapper = null;
        }
        buttonTextWrapper.getArtificialStackFrames().setEnabled(enabled);
        if (enabled) {
            ButtonTextWrapper buttonTextWrapper3 = this.buttonTextWrapper;
            if (buttonTextWrapper3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                buttonTextWrapper2 = buttonTextWrapper3;
            }
            buttonTextWrapper2.getArtificialStackFrames().setTextColor(this.textEnableColor);
            return;
        }
        ButtonTextWrapper buttonTextWrapper4 = this.buttonTextWrapper;
        if (buttonTextWrapper4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            buttonTextWrapper2 = buttonTextWrapper4;
        }
        buttonTextWrapper2.getArtificialStackFrames().setTextColor(this.textDisableColor);
    }

    public final ButtonTextWrapper getButtonTextWrapper() {
        ButtonTextWrapper buttonTextWrapper = this.buttonTextWrapper;
        if (buttonTextWrapper != null) {
            return buttonTextWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final ButtonIconWrapper getIconWrapper() {
        ButtonIconWrapper buttonIconWrapper = this.iconWrapper;
        if (buttonIconWrapper != null) {
            return buttonIconWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final LoadingIconWrapper getLoadingIconWrapper() {
        LoadingIconWrapper loadingIconWrapper = this.loadingIconWrapper;
        if (loadingIconWrapper != null) {
            return loadingIconWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setText(String text) {
        ButtonTextWrapper buttonTextWrapper = this.buttonTextWrapper;
        if (buttonTextWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            buttonTextWrapper = null;
        }
        buttonTextWrapper.getArtificialStackFrames().setText(text);
    }

    public final void startLoading() {
        setClickable(false);
        LoadingIconWrapper loadingIconWrapper = this.loadingIconWrapper;
        LoadingIconWrapper loadingIconWrapper2 = null;
        if (loadingIconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            loadingIconWrapper = null;
        }
        loadingIconWrapper.getArtificialStackFrames().setVisibility(0);
        LoadingIconWrapper loadingIconWrapper3 = this.loadingIconWrapper;
        if (loadingIconWrapper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            loadingIconWrapper2 = loadingIconWrapper3;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(loadingIconWrapper2.getArtificialStackFrames(), Key.ROTATION, 0.0f, 360.0f);
        this.objectAnimator = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(3000L);
        }
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator2 = this.objectAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.objectAnimator;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator4 = this.objectAnimator;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
        update(getWidth());
    }

    @Override
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        update(right - left);
    }

    public final void update(int w) {
        L.d(TAG, "update: w = " + w);
        if (getLayoutParams().width == -2) {
            Object parent = getParent();
            Intrinsics.checkNotNull(parent, "");
            View view = (View) parent;
            int width = view.getWidth();
            int paddingStart = view.getPaddingStart();
            int paddingEnd = view.getPaddingEnd();
            LoadingButton loadingButton = this;
            ViewGroup.LayoutParams layoutParams = loadingButton.getLayoutParams();
            int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams2 = loadingButton.getLayoutParams();
            w = width - (((paddingStart + paddingEnd) + marginStart) + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0));
        }
        int paddingStart2 = w - (getPaddingStart() + getPaddingEnd());
        ButtonIconWrapper buttonIconWrapper = this.iconWrapper;
        ButtonTextWrapper buttonTextWrapper = null;
        if (buttonIconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            buttonIconWrapper = null;
        }
        ImageView endIcon = buttonIconWrapper.getShareDataUIState();
        if (endIcon.getVisibility() != 8) {
            int width2 = endIcon.getWidth();
            ImageView imageView = endIcon;
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            int marginStart2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            paddingStart2 -= (width2 + marginStart2) + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0);
        }
        ButtonIconWrapper buttonIconWrapper2 = this.iconWrapper;
        if (buttonIconWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            buttonIconWrapper2 = null;
        }
        ImageView startIcon = buttonIconWrapper2.getF2631a();
        if (startIcon.getVisibility() != 8) {
            int width3 = startIcon.getWidth();
            ImageView imageView2 = startIcon;
            ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
            int marginStart3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams6 = imageView2.getLayoutParams();
            paddingStart2 -= (width3 + marginStart3) + (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd() : 0);
        }
        LoadingIconWrapper loadingIconWrapper = this.loadingIconWrapper;
        if (loadingIconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            loadingIconWrapper = null;
        }
        ImageView loadingIcon = loadingIconWrapper.getArtificialStackFrames();
        if (loadingIcon.getVisibility() != 8) {
            int width4 = loadingIcon.getWidth();
            ImageView imageView3 = loadingIcon;
            ViewGroup.LayoutParams layoutParams7 = imageView3.getLayoutParams();
            int marginStart4 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams8 = imageView3.getLayoutParams();
            paddingStart2 -= (width4 + marginStart4) + (layoutParams8 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams8).getMarginEnd() : 0);
        }
        ButtonTextWrapper buttonTextWrapper2 = this.buttonTextWrapper;
        if (buttonTextWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            buttonTextWrapper = buttonTextWrapper2;
        }
        TextView buttonTextView = buttonTextWrapper.getArtificialStackFrames();
        TextView textView = buttonTextView;
        ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
        int marginStart5 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams9).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
        int marginEnd = paddingStart2 - (marginStart5 + (layoutParams10 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams10).getMarginEnd() : 0));
        if (marginEnd < 0) {
            marginEnd = 1;
        }
        if (this.remainWidth != marginEnd) {
            ViewGroup.LayoutParams layoutParams11 = buttonTextView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams11, "");
            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
            layoutParams12.matchConstraintMaxWidth = marginEnd;
            buttonTextView.setLayoutParams(layoutParams12);
            L.d(TAG, "update remainWidth: " + marginEnd);
            this.remainWidth = marginEnd;
        }
    }

    public final void finishLoading() {
        setClickable(true);
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null && objectAnimator != null) {
            objectAnimator.end();
        }
        LoadingIconWrapper loadingIconWrapper = this.loadingIconWrapper;
        if (loadingIconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            loadingIconWrapper = null;
        }
        loadingIconWrapper.getArtificialStackFrames().setVisibility(8);
        update(getWidth());
    }

    public final int getExceptWidth() {
        LoadingButton loadingButton = this;
        ViewGroup.LayoutParams layoutParams = loadingButton.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = loadingButton.getLayoutParams();
        int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) + getPaddingStart() + getPaddingEnd();
        ButtonIconWrapper buttonIconWrapper = this.iconWrapper;
        ButtonTextWrapper buttonTextWrapper = null;
        if (buttonIconWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            buttonIconWrapper = null;
        }
        ImageView startIcon = buttonIconWrapper.getF2631a();
        if (startIcon.getVisibility() != 8) {
            ImageView imageView = startIcon;
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            int marginStart2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            marginEnd += marginStart2 + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0) + startIcon.getWidth();
        }
        ButtonIconWrapper buttonIconWrapper2 = this.iconWrapper;
        if (buttonIconWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            buttonIconWrapper2 = null;
        }
        ImageView endIcon = buttonIconWrapper2.getShareDataUIState();
        if (endIcon.getVisibility() != 8) {
            ImageView imageView2 = endIcon;
            ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
            int marginStart3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams6 = imageView2.getLayoutParams();
            marginEnd += marginStart3 + (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd() : 0) + endIcon.getWidth();
        }
        ButtonTextWrapper buttonTextWrapper2 = this.buttonTextWrapper;
        if (buttonTextWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            buttonTextWrapper = buttonTextWrapper2;
        }
        TextView buttonTextView = buttonTextWrapper.getArtificialStackFrames();
        if (buttonTextView.getVisibility() != 8) {
            TextView textView = buttonTextView;
            ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
            int marginStart4 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams8 = textView.getLayoutParams();
            marginEnd += marginStart4 + (layoutParams8 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams8).getMarginEnd() : 0) + ((int) buttonTextView.getPaint().measureText(buttonTextView.getText().toString()));
        }
        return RangesKt.coerceAtLeast(marginEnd, SizeUtils.dp2px(72.0f));
    }
}
