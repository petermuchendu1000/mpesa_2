package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.PesaPaymentMethodBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/adapter/BongaPaymentMethodAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PesaPaymentMethodBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "layoutResId", "", "<init>", "(I)V", "selectedPosition", "convert", "", "holder", "item", "selectPosition", "position", "getSelectedPosition", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaPaymentMethodAdapter extends BaseQuickAdapter<PesaPaymentMethodBean, BaseViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 59 % 128;
    private static int component3 = 0;
    private static int copydefault = 1;
    private int component2;

    public BongaPaymentMethodAdapter(int i) {
        super(i, null, 2, null);
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, PesaPaymentMethodBean pesaPaymentMethodBean) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, pesaPaymentMethodBean);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
    }

    protected void convert2(BaseViewHolder holder, PesaPaymentMethodBean item) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setImageResource(R.id.ivIcon, item.getIconUri());
        ImageView imageView = (ImageView) holder.getView(R.id.ivIcon);
        holder.setText(R.id.tvTitle, item.getTitle());
        holder.setText(R.id.tvContent, item.getContent());
        boolean z = getData().indexOf(item) == this.component2;
        if (z) {
            holder.itemView.setBackgroundResource(R.drawable.bg_pesa_payment_method_selected);
            imageView.setColorFilter(getContext().getColor(R.color.color_primary));
        } else {
            holder.itemView.setBackgroundResource(R.drawable.bg_pesa_payment_method_unselected);
            imageView.setColorFilter(getContext().getColor(R.color.color_outline));
            int i4 = ShareDataUIState + 97;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        holder.setVisible(R.id.ivSelected, z);
        int i6 = copydefault + 17;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void selectPosition(int position) {
        int i = 2 % 2;
        if (position != this.component2) {
            int i2 = copydefault + 93;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            if (position >= 0) {
                int i5 = i3 + 103;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 0;
                    if (position >= getData().size()) {
                        return;
                    }
                } else if (position >= getData().size()) {
                    return;
                }
                int i7 = this.component2;
                this.component2 = position;
                getData().get(i7).setSelected(false);
                getData().get(position).setSelected(true);
                notifyItemChanged(i7);
                notifyItemChanged(position);
            }
        }
    }

    public final int getSelectedPosition() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component2;
        if (i3 == 0) {
            int i5 = 73 / 0;
        }
        return i4;
    }

    static {
        int i = 59 % 2;
    }
}
