package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;
import com.huawei.digitalpayment.consumer.manageandviewdata.databinding.ItemIndividualUsageBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/adapter/IndividualAirtimeUsageAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualAirtimeUsage;", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/adapter/IndividualAirtimeUsageAdapter$ViewHolder;", "<init>", "()V", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "convert", "", "holder", "item", "ViewHolder", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualAirtimeUsageAdapter extends BaseQuickAdapter<IndividualAirtimeUsage, ViewHolder> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 5 % 128;

    @Override
    public void convert(BaseViewHolder baseViewHolder, IndividualAirtimeUsage individualAirtimeUsage) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        IndividualAirtimeUsage individualAirtimeUsage2 = individualAirtimeUsage;
        if (i2 % 2 == 0) {
            convert(viewHolder, individualAirtimeUsage2);
        } else {
            convert(viewHolder, individualAirtimeUsage2);
            int i3 = 0 / 0;
        }
    }

    @Override
    public BaseViewHolder onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 13;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ViewHolder viewHolderOnCreateDefViewHolder = onCreateDefViewHolder(viewGroup, i);
        int i5 = component3 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return viewHolderOnCreateDefViewHolder;
    }

    public IndividualAirtimeUsageAdapter() {
        super(R.layout.item_individual_usage, null, 2, null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/adapter/IndividualAirtimeUsageAdapter$ViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/databinding/ItemIndividualUsageBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/databinding/ItemIndividualUsageBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/databinding/ItemIndividualUsageBinding;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder extends BaseViewHolder {
        public static final int $stable = 8;
        private static int component1 = 45 % 128;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;
        private final ItemIndividualUsageBinding ShareDataUIState;

        /* JADX WARN: Illegal instructions before constructor call */
        public ViewHolder(ItemIndividualUsageBinding itemIndividualUsageBinding) {
            Intrinsics.checkNotNullParameter(itemIndividualUsageBinding, "");
            View root = itemIndividualUsageBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.ShareDataUIState = itemIndividualUsageBinding;
        }

        @Override
        public final ItemIndividualUsageBinding getBinding() {
            int i = 2 % 2;
            int i2 = component3 + 119;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ShareDataUIState;
            }
            throw null;
        }

        static {
            if (45 % 2 == 0) {
                int i = 57 / 0;
            }
        }
    }

    @Override
    protected ViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemIndividualUsageBinding itemIndividualUsageBindingInflate = ItemIndividualUsageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemIndividualUsageBindingInflate, "");
        ViewHolder viewHolder = new ViewHolder(itemIndividualUsageBindingInflate);
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return viewHolder;
        }
        throw null;
    }

    protected void convert(ViewHolder holder, IndividualAirtimeUsage item) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.getBinding().tvAppName.setText(item.getCalledMsisdn());
        holder.getBinding().tvUsage.setText(item.getDatetime());
        holder.getBinding().tvPercentage.setText(item.getAmount());
        holder.getBinding().executePendingBindings();
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
