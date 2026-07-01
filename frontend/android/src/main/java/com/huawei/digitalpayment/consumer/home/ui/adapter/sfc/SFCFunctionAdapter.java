package com.huawei.digitalpayment.consumer.home.ui.adapter.sfc;

import android.text.TextUtils;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBinding;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.DataBindingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\nH\u0014¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/sfc/SFCFunctionAdapter;", "Lcom/huawei/payment/mvvm/DataBindingAdapter;", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/ItemTopFunctionBinding;", "<init>", "()V", "onBindViewHolder", "", "binding", "position", "", "item", "getLayoutId", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCFunctionAdapter extends DataBindingAdapter<SFCLocalHomeFunction, ItemTopFunctionBinding> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public void onBindViewHolder(ViewDataBinding viewDataBinding, int i, SFCLocalHomeFunction sFCLocalHomeFunction) {
        int i2 = 2 % 2;
        int i3 = copydefault + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((ItemTopFunctionBinding) viewDataBinding, i, sFCLocalHomeFunction);
        int i5 = copydefault + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onBindViewHolder(ItemTopFunctionBinding binding, int position, SFCLocalHomeFunction item) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(binding, "");
            Intrinsics.checkNotNullParameter(item, "");
            binding.tvFunctionName.setText(item.getFunctionName());
            TextUtils.isEmpty(item.getFunIcon());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(binding, "");
        Intrinsics.checkNotNullParameter(item, "");
        binding.tvFunctionName.setText(item.getFunctionName());
        if (TextUtils.isEmpty(item.getFunIcon())) {
            binding.ivFunctionIcon.setImageResource(item.getImageRes());
            int i3 = copydefault + 1;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = component2 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            GlideUtils.setFunctionIcon(binding.ivFunctionIcon, item.getFunIcon());
        } else {
            GlideUtils.setFunctionIcon(binding.ivFunctionIcon, item.getFunIcon());
            int i6 = 51 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.item_top_function;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 15;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }
}
