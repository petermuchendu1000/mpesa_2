package com.huawei.digitalpayment.history.ui.adapter;

import android.util.SparseBooleanArray;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.history.R;
import com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean;
import java.util.ArrayList;
import java.util.List;

public class TransactionTypeAdapter extends BaseQuickAdapter<TradeTypeConfigBean, BaseViewHolder> {
    private static int component2 = 0;
    private static int copydefault = 1;
    private List<TradeTypeConfigBean> component1;
    private SparseBooleanArray component3;

    @Override
    public void convert(BaseViewHolder baseViewHolder, TradeTypeConfigBean tradeTypeConfigBean) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, tradeTypeConfigBean);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    public TransactionTypeAdapter(List<TradeTypeConfigBean> list) {
        super(R.layout.item_transaction_type, list);
        this.component3 = new SparseBooleanArray();
        if (list == null) {
            list = new ArrayList<>();
            int i = component2 + 41;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.component1 = list;
        int i3 = component2 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean> getSelectedItem() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2
            int r2 = r2 + 93
            int r3 = r2 % 128
            com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault = r3
            int r2 = r2 % r0
            r2 = 0
            r3 = r2
        L13:
            java.util.List<com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean> r4 = r6.component1
            int r4 = r4.size()
            if (r3 >= r4) goto L44
            int r4 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2
            int r4 = r4 + 117
            int r5 = r4 % 128
            com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L30
            boolean r4 = r6.isItemChecked(r3)
            r5 = 17
            int r5 = r5 / r2
            if (r4 == 0) goto L41
            goto L36
        L30:
            boolean r4 = r6.isItemChecked(r3)
            if (r4 == 0) goto L41
        L36:
            java.util.List<com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean> r4 = r6.component1
            java.lang.Object r4 = r4.get(r3)
            com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean r4 = (com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean) r4
            r1.add(r4)
        L41:
            int r3 = r3 + 1
            goto L13
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.getSelectedItem():java.util.List");
    }

    public void setItemChecked(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.component3.put(i, z);
        notifyDataSetChanged();
        int i5 = copydefault + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setItemChecked(List<TradeTypeConfigBean> list) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            int i5 = 7 / 0;
            if (list == null) {
                return;
            }
        } else if (list == null) {
            return;
        }
        int i6 = i2 + 93;
        while (true) {
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            if (i4 >= this.component1.size()) {
                notifyDataSetChanged();
                return;
            }
            if (list.contains(this.component1.get(i4))) {
                setItemChecked(i4, true);
            }
            i4++;
            i6 = component2 + 67;
        }
    }

    public boolean isItemChecked(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3.get(i);
        int i5 = component2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        r7 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2 + 103;
        com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault = r7 % 128;
        r7 = r7 % 2;
        r6.getView(com.huawei.digitalpayment.consumer.history.R.id.tag).setSelected(true);
        r1.setChecked(true);
        r6 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault + 35;
        com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (isItemChecked(getItemPosition(r7)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (isItemChecked(getItemPosition(r7)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r6.getView(com.huawei.digitalpayment.consumer.history.R.id.tag).setSelected(false);
        r1.setChecked(false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void convert2(com.chad.library.adapter.base.viewholder.BaseViewHolder r6, com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.transactionTypeName
            java.lang.String r4 = r7.getServiceName()
            r6.setText(r1, r4)
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.ivCheck
            android.view.View r1 = r6.getView(r1)
            com.huawei.common.widget.CommonCheckBox r1 = (com.huawei.common.widget.CommonCheckBox) r1
            int r7 = r5.getItemPosition(r7)
            boolean r7 = r5.isItemChecked(r7)
            r4 = 21
            int r4 = r4 / r2
            if (r7 == r3) goto L57
            goto L4a
        L2f:
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.transactionTypeName
            java.lang.String r4 = r7.getServiceName()
            r6.setText(r1, r4)
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.ivCheck
            android.view.View r1 = r6.getView(r1)
            com.huawei.common.widget.CommonCheckBox r1 = (com.huawei.common.widget.CommonCheckBox) r1
            int r7 = r5.getItemPosition(r7)
            boolean r7 = r5.isItemChecked(r7)
            if (r7 == r3) goto L57
        L4a:
            int r7 = com.huawei.digitalpayment.consumer.history.R.id.tag
            android.view.View r6 = r6.getView(r7)
            r6.setSelected(r2)
            r1.setChecked(r2)
            goto L75
        L57:
            int r7 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2
            int r7 = r7 + 103
            int r2 = r7 % 128
            com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault = r2
            int r7 = r7 % r0
            int r7 = com.huawei.digitalpayment.consumer.history.R.id.tag
            android.view.View r6 = r6.getView(r7)
            r6.setSelected(r3)
            r1.setChecked(r3)
            int r6 = com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.copydefault
            int r6 = r6 + 35
            int r7 = r6 % 128
            com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.component2 = r7
            int r6 = r6 % r0
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.adapter.TransactionTypeAdapter.convert2(com.chad.library.adapter.base.viewholder.BaseViewHolder, com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean):void");
    }
}
