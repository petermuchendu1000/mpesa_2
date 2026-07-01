package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.adapter;

import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.base.util.ExtensionMethodsKt;
import com.huawei.digitalpayment.consumer.manageandviewdata.databinding.ItemAirtimeUsageBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/adapter/AirtimeUsageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/databinding/ItemAirtimeUsageBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/databinding/ItemAirtimeUsageBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/databinding/ItemAirtimeUsageBinding;", "bind", "", "accountUsage", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;", "percentage", "", "color", "", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirtimeUsageViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int component1 = 83 % 128;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final ItemAirtimeUsageBinding ShareDataUIState;

    public final ItemAirtimeUsageBinding getBinding() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemAirtimeUsageBinding itemAirtimeUsageBinding = this.ShareDataUIState;
        int i4 = i3 + 95;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemAirtimeUsageBinding;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirtimeUsageViewHolder(ItemAirtimeUsageBinding itemAirtimeUsageBinding) {
        super(itemAirtimeUsageBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemAirtimeUsageBinding, "");
        this.ShareDataUIState = itemAirtimeUsageBinding;
    }

    public static void bind$default(AirtimeUsageViewHolder airtimeUsageViewHolder, AccountUsage accountUsage, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component2;
        int i5 = i4 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
            int i6 = i4 + 37;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = "0 %";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        airtimeUsageViewHolder.bind(accountUsage, str, i);
    }

    public final void bind(AccountUsage accountUsage, String percentage, int color) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountUsage, "");
        Intrinsics.checkNotNullParameter(percentage, "");
        TextView textView = this.ShareDataUIState.tvAppName;
        String serviceId = accountUsage.getServiceId();
        if (serviceId != null) {
            int i2 = component2 + 107;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
        } else {
            serviceId = accountUsage.getCategory();
        }
        textView.setText(serviceId);
        TextView textView2 = this.ShareDataUIState.tvUsage;
        String totalUsage = accountUsage.getTotalUsage();
        if (totalUsage != null) {
            str = totalUsage;
        } else {
            String amount = accountUsage.getAmount();
            str = (amount != null ? ExtensionMethodsKt.thousandthFormatter(amount) : null) + " KSH";
        }
        textView2.setText(str);
        this.ShareDataUIState.tvPercentage.setText(percentage);
        if (color != 0) {
            int i4 = component2 + 55;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            this.ShareDataUIState.imAppIcon.setBackgroundColor(ContextCompat.getColor(this.ShareDataUIState.imAppIcon.getContext(), color));
        }
        this.ShareDataUIState.executePendingBindings();
    }

    static {
        int i = 83 % 2;
    }
}
