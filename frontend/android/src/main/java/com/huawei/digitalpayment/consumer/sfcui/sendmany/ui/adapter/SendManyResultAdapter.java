package com.huawei.digitalpayment.consumer.sfcui.sendmany.ui.adapter;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.common.widget.RotateImageView;
import com.huawei.digitalpayment.checkout.resp.OrderDetailsBean;
import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/ui/adapter/SendManyResultAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/checkout/resp/OrderDetailsBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "convert", "", "holder", "item", "onBindViewHolder", "position", "", "setStatus", "status", "", "imStatus", "Lcom/huawei/common/widget/RotateImageView;", "imStatusStop", "Landroid/widget/ImageView;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendManyResultAdapter extends BaseQuickAdapter<OrderDetailsBean, BaseViewHolder> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, OrderDetailsBean orderDetailsBean) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, orderDetailsBean);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((BaseViewHolder) viewHolder, i);
        int i5 = component2 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
    }

    public SendManyResultAdapter() {
        super(R.layout.item_send_many_result, null, 2, null);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(holder, "");
        super.onBindViewHolder(holder, position);
        OrderDetailsBean item = getItem(position);
        holder.setText(R.id.name, item.getNameDisplay());
        holder.setText(R.id.amount, item.getAmountDisplay());
        holder.setText(R.id.tvId, item.getTransId());
        String orderStatus = item.getOrderStatus();
        if (orderStatus == null) {
            int i4 = component2 + 43;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = orderStatus;
        }
        component3(str, (RotateImageView) holder.getView(R.id.imStatus), (ImageView) holder.getView(R.id.imStatusStop));
    }

    private final void component3(String str, RotateImageView rotateImageView, ImageView imageView) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            if (!Intrinsics.areEqual("Success", str)) {
                imageView.setVisibility(8);
                rotateImageView.setVisibility(0);
                return;
            }
            int i3 = component2 + 63;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                rotateImageView.endAnim();
                imageView.setVisibility(0);
                rotateImageView.setVisibility(97);
                return;
            } else {
                rotateImageView.endAnim();
                imageView.setVisibility(0);
                rotateImageView.setVisibility(8);
                return;
            }
        }
        Intrinsics.areEqual("Success", str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 49;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    protected void convert2(BaseViewHolder holder, OrderDetailsBean item) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        int i4 = copydefault + 17;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
