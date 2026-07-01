package com.huawei.digitalpayment.consumer.home.ui.adapter;

import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.ColorUtils;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.DataBindingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\nH\u0014¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/TopFunctionAdapter;", "Lcom/huawei/payment/mvvm/DataBindingAdapter;", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/ItemTopFunctionBinding;", "<init>", "()V", "onBindViewHolder", "", "binding", "position", "", "item", "getLayoutId", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TopFunctionAdapter extends DataBindingAdapter<LocalHomeFunction, ItemTopFunctionBinding> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 49 % 128;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public void onBindViewHolder(ViewDataBinding viewDataBinding, int i, LocalHomeFunction localHomeFunction) {
        int i2 = 2 % 2;
        int i3 = component1 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((ItemTopFunctionBinding) viewDataBinding, i, localHomeFunction);
        int i5 = component3 + 7;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
    }

    public void onBindViewHolder(ItemTopFunctionBinding binding, int position, LocalHomeFunction item) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(binding, "");
        Intrinsics.checkNotNullParameter(item, "");
        binding.tvFunctionName.setText(item.getFuncName());
        binding.tvFunctionName.setTextColor(ColorUtils.getColor(R.color.colorGround));
        binding.ivFunctionIcon.setBackgroundColor(com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.3f, ColorUtils.getColor(R.color.colorPrimaryClick)));
        GlideUtils.setFunctionIcon(binding.ivFunctionIcon, item.getFunIcon(), R.mipmap.icon_default_function);
        int i4 = component3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 111;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.item_top_function;
            int i4 = 86 / 0;
        } else {
            i = R.layout.item_top_function;
        }
        int i5 = component1 + 75;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i;
        }
        throw null;
    }

    static {
        int i = 49 % 2;
    }
}
