package com.huawei.digitalpayment.consumer.sfcui.bonga.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.bonga.OnboardingPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/OnboardingPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/OnboardingPagerAdapter$OnboardingViewHolder;", "pages", "", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/OnboardingPage;", "<init>", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "OnboardingViewHolder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnboardingPagerAdapter extends RecyclerView.Adapter<OnboardingViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 19 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final List<OnboardingPage> component1;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((OnboardingViewHolder) viewHolder, i);
        int i5 = copydefault + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        OnboardingViewHolder onboardingViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        int i5 = component2 + 65;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return onboardingViewHolderOnCreateViewHolder;
    }

    public OnboardingPagerAdapter(List<OnboardingPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component1 = list;
    }

    @Override
    public OnboardingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_onboarding_page, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        OnboardingViewHolder onboardingViewHolder = new OnboardingViewHolder(viewInflate);
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return onboardingViewHolder;
    }

    public void onBindViewHolder(OnboardingViewHolder holder, int position) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(holder, "");
            holder.bind(this.component1.get(position));
            throw null;
        }
        Intrinsics.checkNotNullParameter(holder, "");
        holder.bind(this.component1.get(position));
        int i3 = copydefault + 25;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component1.size();
        int i4 = component2 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/OnboardingPagerAdapter$OnboardingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "ivImage", "Landroid/widget/ImageView;", "tvTitle", "Landroid/widget/TextView;", "tvDescription", "tvTermsLink", "bind", "", "page", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/OnboardingPage;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnboardingViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private static int component2 = 0;
        private static int copy = 1;
        private static int equals = 1;
        private static int getRequestBeneficiariesState;
        private final TextView ShareDataUIState;
        private final TextView component1;
        private final TextView component3;
        private final ImageView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnboardingViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            View viewFindViewById = view.findViewById(R.id.iv_onboarding_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_onboarding_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.component1 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tv_onboarding_description);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.ShareDataUIState = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tv_terms_link);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.component3 = (TextView) viewFindViewById4;
        }

        public final void bind(OnboardingPage page) {
            int i;
            int i2 = 2 % 2;
            int i3 = equals + 115;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(page, "");
            this.copydefault.setImageResource(page.getImageRes());
            this.component1.setText(page.getTitle());
            this.ShareDataUIState.setText(page.getDescription());
            TextView textView = this.component3;
            if (page.isTermsPage()) {
                int i5 = getRequestBeneficiariesState + 79;
                equals = i5 % 128;
                int i6 = i5 % 2;
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }

        static {
            int i = 1 + 61;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 4 / 0;
            }
        }
    }

    static {
        int i = 19 % 2;
    }
}
