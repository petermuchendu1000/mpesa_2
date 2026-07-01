package com.huawei.common.widget.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.griver.api.constants.GriverEvents;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.R;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001?B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J*\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\nJ\u0010\u0010'\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nJ\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nJ\u0010\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u000102J\u000e\u00100\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nJ\u001c\u00103\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u000107J\u000e\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020\u000fJ\u0006\u0010<\u001a\u00020\u0011J\u0006\u0010=\u001a\u00020\u0011J\u0006\u0010>\u001a\u00020\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006@"}, d2 = {"Lcom/huawei/common/widget/item/CommonItemView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconView", "Lcom/huawei/common/widget/round/RoundImageView;", "titleView", "Landroid/widget/TextView;", "subTitleView", "extraLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "arrowIconView", "Landroid/widget/ImageView;", "iconWidth", "Ljava/lang/Integer;", "iconHeight", "iconRound", "initView", "", "initAttrs", GriverEvents.EVENT_SET_TITLE, "text", "", "resId", "setTitleTextSize", "size", "", "setTitleTextColor", "color", "setSubTitle", "setSubTitleTextSize", "setSubTitleTextColor", "setIconStyle", "style", "Lcom/huawei/common/widget/item/CommonItemView$IconStyle;", "setIconSize", "width", "height", "setIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "setExtraView", "extraView", "Landroid/view/View;", "layoutParams", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "setArrowHidden", "hidden", "", "getIconView", "getTitleView", "getSubTitleView", "getExtraLayout", "IconStyle", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonItemView extends RoundConstraintLayout {
    private ImageView arrowIconView;
    private ConstraintLayout extraLayout;
    private Integer iconHeight;
    private Integer iconRound;
    private RoundImageView iconView;
    private Integer iconWidth;
    private TextView subTitleView;
    private TextView titleView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconStyle.values().length];
            try {
                iArr[IconStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconStyle.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/common/widget/item/CommonItemView$IconStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ICON", "SQUARE", "CIRCLE", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconStyle {
        private static final EnumEntries $ENTRIES;
        private static final IconStyle[] $VALUES;
        public static final IconStyle ICON = new IconStyle("ICON", 0);
        public static final IconStyle SQUARE = new IconStyle("SQUARE", 1);
        public static final IconStyle CIRCLE = new IconStyle("CIRCLE", 2);

        private IconStyle(String str, int i) {
        }

        static {
            IconStyle[] iconStyleArr$values = $values();
            $VALUES = iconStyleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(iconStyleArr$values);
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }

        private static final IconStyle[] $values() {
            return new IconStyle[]{ICON, SQUARE, CIRCLE};
        }

        public static EnumEntries<IconStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonItemView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        initView(context);
        initAttrs(context, attributeSet, i, i2);
    }

    private final void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_common_item, (ViewGroup) this, true);
        this.iconView = (RoundImageView) findViewById(R.id.common_item_iv_icon);
        this.titleView = (TextView) findViewById(R.id.common_item_tv_title);
        this.subTitleView = (TextView) findViewById(R.id.common_item_tv_subTitle);
        this.extraLayout = (ConstraintLayout) findViewById(R.id.common_item_layout_extra);
        this.arrowIconView = (ImageView) findViewById(R.id.common_item_iv_arrow);
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        IconStyle iconStyle;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CommonItemView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setTitle(AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes, R.styleable.CommonItemView_title));
        setTitleTextColor(AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.CommonItemView_titleColor, context.getColor(R.color.colorMainText)));
        setArrowHidden(!typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonItemView_show_arrow, false));
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CommonItemView_iconWidth)) {
            this.iconWidth = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CommonItemView_iconWidth, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CommonItemView_iconHeight)) {
            this.iconHeight = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CommonItemView_iconHeight, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CommonItemView_iconRound)) {
            this.iconRound = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CommonItemView_iconRound, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CommonItemView_icon, 0);
        if (resourceId != 0) {
            setIcon(resourceId);
        }
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonItemView_icon_style, IconStyle.ICON.ordinal());
        if (i == 1) {
            iconStyle = IconStyle.SQUARE;
        } else if (i == 2) {
            iconStyle = IconStyle.CIRCLE;
        } else {
            iconStyle = IconStyle.ICON;
        }
        setIconStyle(iconStyle);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CommonItemView_extra_layout, 0);
        if (resourceId2 != 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ConstraintLayout constraintLayout = this.extraLayout;
            ConstraintLayout constraintLayout2 = null;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                constraintLayout = null;
            }
            layoutInflaterFrom.inflate(resourceId2, (ViewGroup) constraintLayout, true);
            ConstraintLayout constraintLayout3 = this.extraLayout;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                constraintLayout2 = constraintLayout3;
            }
            constraintLayout2.setVisibility(0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setTitle(String text) {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setText(text);
    }

    public final void setTitle(int resId) {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setText(resId);
    }

    public final void setTitleTextSize(float size) {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextSize(size);
    }

    public final void setTitleTextColor(int color) {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextColor(color);
    }

    public final void setSubTitle(String text) {
        TextView textView = this.subTitleView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        String str = text;
        textView.setText(str);
        TextView textView3 = this.subTitleView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    public final void setSubTitle(int resId) {
        setSubTitle(Utils.getApp().getString(resId));
    }

    public final void setSubTitleTextSize(float size) {
        TextView textView = this.subTitleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextSize(size);
    }

    public final void setSubTitleTextColor(int color) {
        TextView textView = this.subTitleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextColor(color);
    }

    public final void setIconStyle(IconStyle style) {
        int iDp2px;
        int iDp2px2;
        Intrinsics.checkNotNullParameter(style, "");
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        boolean z = true;
        boolean z2 = false;
        if (i == 1) {
            iDp2px = ConvertUtils.dp2px(48.0f);
            iDp2px2 = ConvertUtils.dp2px(4.0f);
            z = false;
        } else if (i == 2) {
            iDp2px = ConvertUtils.dp2px(40.0f);
            iDp2px2 = 0;
        } else {
            iDp2px = ConvertUtils.dp2px(24.0f);
            z = false;
            iDp2px2 = 0;
        }
        Integer num = this.iconWidth;
        int iIntValue = num != null ? num.intValue() : iDp2px;
        Integer num2 = this.iconHeight;
        if (num2 != null) {
            iDp2px = num2.intValue();
        }
        Integer num3 = this.iconRound;
        if (num3 != null) {
            iDp2px2 = num3.intValue();
        } else {
            z2 = z;
        }
        setIconSize(iIntValue, iDp2px);
        RoundImageView roundImageView = this.iconView;
        RoundImageView roundImageView2 = null;
        if (roundImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roundImageView = null;
        }
        roundImageView.getBaseFilletView().setRoundAsCircle(z2);
        if (z2) {
            return;
        }
        RoundImageView roundImageView3 = this.iconView;
        if (roundImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            roundImageView2 = roundImageView3;
        }
        roundImageView2.getBaseFilletView().setRoundCorner(iDp2px2);
    }

    public final void setIconSize(int width, int height) {
        RoundImageView roundImageView = this.iconView;
        RoundImageView roundImageView2 = null;
        if (roundImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roundImageView = null;
        }
        ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        RoundImageView roundImageView3 = this.iconView;
        if (roundImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roundImageView3 = null;
        }
        roundImageView3.setLayoutParams(layoutParams);
        RoundImageView roundImageView4 = this.iconView;
        if (roundImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            roundImageView2 = roundImageView4;
        }
        roundImageView2.getBaseFilletView().onSizeChanged(width, height);
    }

    public final void setIcon(Drawable drawable) {
        RoundImageView roundImageView = this.iconView;
        RoundImageView roundImageView2 = null;
        if (roundImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roundImageView = null;
        }
        roundImageView.setImageDrawable(drawable);
        RoundImageView roundImageView3 = this.iconView;
        if (roundImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            roundImageView2 = roundImageView3;
        }
        roundImageView2.setVisibility(drawable == null ? 8 : 0);
    }

    public final void setIcon(int resId) {
        setIcon(AppCompatResources.getDrawable(Utils.getApp(), resId));
    }

    public static void setExtraView$default(CommonItemView commonItemView, View view, ConstraintLayout.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 2) != 0) {
            layoutParams = null;
        }
        commonItemView.setExtraView(view, layoutParams);
    }

    public final void setExtraView(View extraView, ConstraintLayout.LayoutParams layoutParams) {
        ConstraintLayout constraintLayout = this.extraLayout;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            constraintLayout = null;
        }
        constraintLayout.removeAllViews();
        if (extraView != null) {
            if (layoutParams == null) {
                layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.topToTop = 0;
                layoutParams.bottomToBottom = 0;
            }
            ConstraintLayout constraintLayout3 = this.extraLayout;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                constraintLayout3 = null;
            }
            constraintLayout3.addView(extraView, layoutParams);
        }
        ConstraintLayout constraintLayout4 = this.extraLayout;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            constraintLayout2 = constraintLayout4;
        }
        constraintLayout2.setVisibility(extraView == null ? 8 : 0);
    }

    public final void setArrowHidden(boolean hidden) {
        ImageView imageView = this.arrowIconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(hidden ? 8 : 0);
    }

    public final RoundImageView getIconView() {
        RoundImageView roundImageView = this.iconView;
        if (roundImageView != null) {
            return roundImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TextView getTitleView() {
        TextView textView = this.titleView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TextView getSubTitleView() {
        TextView textView = this.subTitleView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final ConstraintLayout getExtraLayout() {
        ConstraintLayout constraintLayout = this.extraLayout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
