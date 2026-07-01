package com.huawei.digitalpayment.consumer.scheduleui.ui.adapter;

import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.util.PaymentResourcesUtils;
import com.huawei.digitalpayment.consumer.schedule.model.local.SchedulePaymentType;
import com.huawei.digitalpayment.consumer.scheduleui.R;
import com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleItemAutomaticPaymentHeaderBinding;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.DataBindingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\nH\u0014¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scheduleui/ui/adapter/AutomaticPaymentHeaderAdapter;", "Lcom/huawei/payment/mvvm/DataBindingAdapter;", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "Lcom/huawei/digitalpayment/consumer/scheduleui/databinding/ScheduleItemAutomaticPaymentHeaderBinding;", "<init>", "()V", "onBindViewHolder", "", "binding", "position", "", "item", "getLayoutId", "ConsumerSchedulePaymentUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutomaticPaymentHeaderAdapter extends DataBindingAdapter<SchedulePaymentType, ScheduleItemAutomaticPaymentHeaderBinding> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public void onBindViewHolder(ViewDataBinding viewDataBinding, int i, SchedulePaymentType schedulePaymentType) {
        int i2 = 2 % 2;
        int i3 = component2 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((ScheduleItemAutomaticPaymentHeaderBinding) viewDataBinding, i, schedulePaymentType);
        int i5 = ShareDataUIState + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onBindViewHolder(ScheduleItemAutomaticPaymentHeaderBinding binding, int position, SchedulePaymentType item) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(binding, "");
        Intrinsics.checkNotNullParameter(item, "");
        binding.tvTitle.setText(PaymentResourcesUtils.getString(item.getTransactionName()));
        GlideUtils.setFunctionIcon(binding.ivIcon, item.getTransactionIcon());
        int i4 = ShareDataUIState + 47;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.schedule_item_automatic_payment_header;
        int i5 = ShareDataUIState + 37;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
