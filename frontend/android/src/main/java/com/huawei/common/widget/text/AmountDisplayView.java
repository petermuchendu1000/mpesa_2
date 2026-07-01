package com.huawei.common.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.config.AmountConfig;
import com.huawei.common.util.L;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.iap.ac.android.acs.operation.common.ContainerUIProvider;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\u0010\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013J\u0016\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#J\u0010\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0018J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\nJ\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0018J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nJ\u0010\u00100\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00101\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nJ\u000e\u00102\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-J\u0010\u00103\u001a\u00020\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u00104\u001a\u00020\u000fJ\u0006\u00105\u001a\u00020\u000fJ\b\u00106\u001a\u00020\u001eH\u0002J\b\u00107\u001a\u00020\u001eH\u0002J\u0010\u00108\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J*\u00109\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/huawei/common/widget/text/AmountDisplayView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "amountView", "Landroid/widget/TextView;", "unitView", "frontUnitView", "unitType", "", "amount", "", "pointLength", "showSeparator", "", "numberFormat", "Ljava/text/DecimalFormat;", "unit", "showBrackets", "setAmount", "", "text", "setDecimalFormat", "format", "symbols", "Ljava/text/DecimalFormatSymbols;", "setShowSeparator", ContainerUIProvider.KEY_SHOW, "setPointLength", "length", "setShowBrackets", "setSpacing", "spacing", "setUnitTextSize", "size", "", "setUnitTextColor", "color", "setUnit", "setAmountTextColor", "setAmountTextSize", "setUnitType", "getAmountView", "getUnitView", "displayAmount", "displayUnit", "initView", "initAttrs", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountDisplayView extends RoundConstraintLayout {
    private double amount;
    private TextView amountView;
    private TextView frontUnitView;
    private DecimalFormat numberFormat;
    private int pointLength;
    private boolean showBrackets;
    private boolean showSeparator;
    private String unit;
    private String unitType;
    private TextView unitView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountDisplayView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountDisplayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountDisplayView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountDisplayView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.pointLength = AmountConfig.INSTANCE.getPointLength();
        this.unit = AmountConfig.INSTANCE.getUnit();
        initView(context);
        initAttrs(context, attributeSet, i, i2);
        displayAmount();
        displayUnit();
    }

    public final void setAmount(String text) {
        TextView textView = this.amountView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setText(text);
    }

    public final void setDecimalFormat(String format, DecimalFormatSymbols symbols) {
        Intrinsics.checkNotNullParameter(format, "");
        Intrinsics.checkNotNullParameter(symbols, "");
        this.numberFormat = new DecimalFormat(format, symbols);
        displayAmount();
    }

    public final void setDecimalFormat(DecimalFormat format) {
        this.numberFormat = format;
        displayAmount();
    }

    public final void setShowSeparator(boolean show) {
        this.showSeparator = show;
        displayAmount();
    }

    public final void setPointLength(int length) {
        this.pointLength = length;
        displayAmount();
    }

    public final void setShowBrackets(boolean show) {
        this.showBrackets = show;
        displayUnit();
    }

    public final void setSpacing(int spacing) {
        TextView textView = this.unitView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(spacing);
        TextView textView3 = this.unitView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setLayoutParams(layoutParams2);
        TextView textView4 = this.frontUnitView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView4 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginEnd(spacing);
        TextView textView5 = this.frontUnitView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView2 = textView5;
        }
        textView2.setLayoutParams(layoutParams4);
    }

    public final void setUnitTextSize(float size) {
        TextView textView = this.unitView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextSize(size);
        TextView textView3 = this.frontUnitView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView2 = textView3;
        }
        textView2.setTextSize(size);
    }

    public final void setUnitTextColor(int color) {
        TextView textView = this.unitView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextColor(color);
        TextView textView3 = this.frontUnitView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(color);
    }

    public final void setUnit(String unit) {
        this.unit = unit;
        displayUnit();
    }

    public final void setAmount(double amount) {
        this.amount = amount;
        displayAmount();
    }

    public final void setAmountTextColor(int color) {
        TextView textView = this.amountView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextColor(color);
    }

    public final void setAmountTextSize(float size) {
        TextView textView = this.amountView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextSize(size);
    }

    public final void setUnitType(String unitType) {
        this.unitType = unitType;
        displayUnit();
    }

    public final TextView getAmountView() {
        TextView textView = this.amountView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TextView getUnitView() {
        if (!TextUtils.isEmpty(this.unitType) && StringsKt.equals$default(this.unitType, TextFieldImplKt.PrefixId, false, 2, null)) {
            TextView textView = this.frontUnitView;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        TextView textView2 = this.unitView;
        if (textView2 != null) {
            return textView2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final void displayAmount() {
        try {
            DecimalFormat decimalFormat = this.numberFormat;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat();
                decimalFormat.setMinimumFractionDigits(this.pointLength);
                decimalFormat.setMaximumFractionDigits(this.pointLength);
                decimalFormat.setGroupingUsed(this.showSeparator);
            }
            TextView textView = this.amountView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setText(decimalFormat != null ? decimalFormat.format(this.amount) : null);
        } catch (Exception e) {
            L.w("AmountDisplayView", "displayAmount error: " + e.getMessage());
        }
    }

    private final void displayUnit() {
        String str;
        String str2;
        int i = 8;
        TextView textView = null;
        if (!TextUtils.isEmpty(this.unitType) && StringsKt.equals$default(this.unitType, TextFieldImplKt.PrefixId, false, 2, null)) {
            TextView textView2 = this.frontUnitView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView2 = null;
            }
            if (this.showBrackets) {
                str2 = "(" + this.unit + ")";
            } else {
                str2 = this.unit;
            }
            textView2.setText(str2);
            TextView textView3 = this.frontUnitView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView3 = null;
            }
            String str3 = this.unit;
            textView3.setVisibility((str3 == null || str3.length() == 0) ? 8 : 0);
            TextView textView4 = this.unitView;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                textView = textView4;
            }
            textView.setVisibility(8);
        } else {
            TextView textView5 = this.frontUnitView;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView5 = null;
            }
            textView5.setVisibility(8);
            TextView textView6 = this.unitView;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView6 = null;
            }
            if (this.showBrackets) {
                str = "(" + this.unit + ")";
            } else {
                str = this.unit;
            }
            textView6.setText(str);
            TextView textView7 = this.unitView;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                textView = textView7;
            }
            String str4 = this.unit;
            if (str4 != null && str4.length() != 0) {
                i = 0;
            }
            textView.setVisibility(i);
        }
        if (TextUtils.isEmpty(this.unitType)) {
            return;
        }
        setLayoutDirection(0);
    }

    private final void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_amount_display_view, (ViewGroup) this, true);
        this.amountView = (TextView) findViewById(R.id.amountDisplayView_tv_amount);
        this.unitView = (TextView) findViewById(R.id.amountDisplayView_tv_unit);
        this.frontUnitView = (TextView) findViewById(R.id.amountDisplayView_tv_unit_prefix);
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AmountDisplayView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AmountDisplayView_amount_text_size, SizeUtils.sp2px(38.0f));
        TextView textView = this.amountView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setTextSize(0, dimensionPixelOffset);
        int color = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.AmountDisplayView_amount_text_color, context.getColor(R.color.colorMainText));
        TextView textView3 = this.amountView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setTextColor(color);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AmountDisplayView_unit_text_size, SizeUtils.sp2px(16.0f));
        TextView textView4 = this.unitView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView4 = null;
        }
        float f = dimensionPixelOffset2;
        textView4.setTextSize(0, f);
        TextView textView5 = this.frontUnitView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView5 = null;
        }
        textView5.setTextSize(0, f);
        int color2 = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.AmountDisplayView_unit_text_color, context.getColor(R.color.colorGeneralText));
        TextView textView6 = this.unitView;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView6 = null;
        }
        textView6.setTextColor(color2);
        TextView textView7 = this.frontUnitView;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView2 = textView7;
        }
        textView2.setTextColor(color2);
        this.unitType = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes, R.styleable.AmountDisplayView_amount_unit_type);
        setSpacing(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.AmountDisplayView_amount_unit_space, SizeUtils.dp2px(8.0f)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
