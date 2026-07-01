package com.huawei.common.widget.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.R;
import com.huawei.common.config.AmountConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u000fH\u0002¨\u0006\u001a"}, d2 = {"Lcom/huawei/common/widget/text/AmountInputView2;", "Lcom/huawei/common/widget/text/AmountInputView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "setLabelTextColor", "", "color", "setLabelTextSize", "size", "", "setSymbol", "symbol", "", "setTextColor", "setTextSize", "initView", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountInputView2 extends AmountInputView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView2(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountInputView2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        initView();
    }

    public final void setLabelTextColor(int color) {
        TextView textView = (TextView) getLabelWrapper().getF2647c().findViewById(R.id.titleView);
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setLabelTextSize(float size) {
        TextView textView = (TextView) getLabelWrapper().getF2647c().findViewById(R.id.titleView);
        if (textView != null) {
            textView.setTextSize(size);
        }
    }

    public final void setSymbol(String symbol) {
        TextView startUnit = getStartUnit();
        if (startUnit != null) {
            startUnit.setText(symbol);
        }
    }

    public final void setTextColor(int color) {
        getEditText().setTextColor(color);
        TextView startUnit = getStartUnit();
        if (startUnit != null) {
            startUnit.setTextColor(color);
        }
    }

    public final void setTextSize(float size) {
        getEditText().setTextSize(size);
        TextView startUnit = getStartUnit();
        if (startUnit != null) {
            startUnit.setTextSize(size);
        }
    }

    private final void initView() {
        getInputParentWrapper().getInputTextWrapper().setInputHeight(SizeUtils.dp2px(54.0f));
        getInputParentWrapper().setInputUnFocusStrokeColor(0);
        getInputParentWrapper().setInputFocusStrokeColor(0);
        getInputParentWrapper().setPadding(0, SizeUtils.dp2px(8.0f), 0, SizeUtils.dp2px(4.0f));
        setTextSize(30.0f);
        setTextColor(Utils.getApp().getColor(R.color.colorMainText));
        setSymbol(AmountConfig.INSTANCE.getSymbol());
        setLabelTextSize(12.0f);
        setLabelTextColor(Utils.getApp().getColor(R.color.colorGeneralText));
    }
}
