package com.huawei.common.widget.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/common/widget/tab/CommonTabItemView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleView", "Landroid/widget/TextView;", "iconView", "Landroid/widget/ImageView;", "indicator", "Lcom/huawei/common/widget/round/RoundImageView;", "getTitleView", "getIconView", "getIndicator", "initView", "", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonTabItemView extends RoundConstraintLayout {
    private ImageView iconView;
    private RoundImageView indicator;
    private TextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTabItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        initView(context);
    }

    public final TextView getTitleView() {
        TextView textView = this.titleView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final ImageView getIconView() {
        ImageView imageView = this.iconView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final RoundImageView getIndicator() {
        RoundImageView roundImageView = this.indicator;
        if (roundImageView != null) {
            return roundImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.common_tab_item_view, (ViewGroup) this, true);
        this.titleView = (TextView) findViewById(R.id.common_tab_tv_title);
        this.iconView = (ImageView) findViewById(R.id.common_tab_iv_icon);
        this.indicator = (RoundImageView) findViewById(R.id.common_tab_indicator_view);
    }
}
