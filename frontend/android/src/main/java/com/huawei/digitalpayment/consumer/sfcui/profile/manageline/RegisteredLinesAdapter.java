package com.huawei.digitalpayment.consumer.sfcui.profile.manageline;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.RegisteredMsisdn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/RegisteredLinesAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/RegisteredMsisdn;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "convert", "", "holder", "item", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegisteredLinesAdapter extends BaseQuickAdapter<RegisteredMsisdn, BaseViewHolder> {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    public RegisteredLinesAdapter() {
        super(R.layout.item_registered_msisdn, null, 2, null);
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, RegisteredMsisdn registeredMsisdn) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, registeredMsisdn);
        int i4 = component1 + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void convert2(BaseViewHolder holder, RegisteredMsisdn item) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.tv_msisdn, item.getMasked());
        int i4 = component3 + 1;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }

    static {
        int i = 1 + 79;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
