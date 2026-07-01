package com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.DoMoreBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/adapter/RequestMoneyMoreAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/DoMoreBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "layoutResId", "", "<init>", "(I)V", "convert", "", "holder", "item", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestMoneyMoreAdapter extends BaseQuickAdapter<DoMoreBean, BaseViewHolder> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 123 % 128;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    public RequestMoneyMoreAdapter(int i) {
        super(i, null, 2, null);
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, DoMoreBean doMoreBean) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, doMoreBean);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
    }

    protected void convert2(BaseViewHolder holder, DoMoreBean item) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(holder, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(holder, "");
        if (item != null) {
            holder.setImageResource(R.id.ivIcon, item.getIconUri());
            holder.setText(R.id.tvName, item.getName());
        } else {
            int i3 = copydefault + 35;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static {
        if (123 % 2 == 0) {
            throw null;
        }
    }
}
