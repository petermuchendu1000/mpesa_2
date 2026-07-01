package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010!\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u0013\u0010#\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "root", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "getRoot", "()Lcom/huawei/common/widget/round/RoundConstraintLayout;", "background", "Lcom/huawei/common/widget/round/RoundImageView;", "getBackground", "()Lcom/huawei/common/widget/round/RoundImageView;", "ivIcon", "Landroid/widget/ImageView;", "getIvIcon", "()Landroid/widget/ImageView;", "tvTitle", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "viewSpace", "getViewSpace", "()Landroid/view/View;", "viewMarginStartTop", "getViewMarginStartTop", "viewMarginEndBottom", "getViewMarginEndBottom", "viewPaddingStartTop", "getViewPaddingStartTop", "viewPaddingEndBottom", "getViewPaddingEndBottom", "ivHot", "getIvHot", "tvHot", "getTvHot", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int getShareableDataState = 1;
    private static int hashCode = 0;
    private static int toString = 121 % 128;
    private final RoundConstraintLayout ShareDataUIState;
    private final ImageView component1;
    private final RoundImageView component2;
    private final ImageView component3;
    private final TextView component4;
    private final View copy;
    private final TextView copydefault;
    private final View equals;
    private final View getAsAtTimestamp;
    private final View getRequestBeneficiariesState;
    private final View getSponsorBeneficiariesState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        View viewFindViewById = view.findViewById(R.id.root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.ShareDataUIState = (RoundConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.component2 = (RoundImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.component1 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.component4 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.viewSpace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.getSponsorBeneficiariesState = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.viewMarginStartTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.getAsAtTimestamp = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.viewMarginEndBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        this.copy = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.viewPaddingStartTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
        this.getRequestBeneficiariesState = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.viewPaddingEndBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
        this.equals = viewFindViewById9;
        this.component3 = (ImageView) view.findViewById(R.id.ivHot);
        this.copydefault = (TextView) view.findViewById(R.id.tvHot);
    }

    public final RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 51;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        int i5 = i2 + 109;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return roundConstraintLayout;
        }
        throw null;
    }

    public final RoundImageView getBackground() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 111;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        RoundImageView roundImageView = this.component2;
        int i4 = i3 + 77;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return roundImageView;
    }

    public final ImageView getIvIcon() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 43;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = this.component1;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return imageView;
    }

    public final TextView getTvTitle() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 87;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.component4;
        int i5 = i2 + 121;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return textView;
        }
        throw null;
    }

    public final View getViewSpace() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 105;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        View view = this.getSponsorBeneficiariesState;
        int i4 = i3 + 33;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public final View getViewMarginStartTop() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 117;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        View view = this.getAsAtTimestamp;
        int i5 = i3 + 59;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }

    public final View getViewMarginEndBottom() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 85;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        View view = this.copy;
        int i4 = i2 + 57;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return view;
        }
        throw null;
    }

    public final View getViewPaddingStartTop() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 85;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        View view = this.getRequestBeneficiariesState;
        int i5 = i3 + 121;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final View getViewPaddingEndBottom() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 97;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        View view = this.equals;
        int i5 = i3 + 9;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return view;
    }

    public final ImageView getIvHot() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 91;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = this.component3;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return imageView;
    }

    public final TextView getTvHot() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 91;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        TextView textView = this.copydefault;
        int i4 = i2 + 85;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return textView;
        }
        throw null;
    }

    static {
        if (121 % 2 == 0) {
            throw null;
        }
    }
}
