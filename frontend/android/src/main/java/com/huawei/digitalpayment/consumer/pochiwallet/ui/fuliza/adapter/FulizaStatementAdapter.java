package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp.TransactionEntryResp;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/adapter/FulizaStatementAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryResp;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "dataList", "", "<init>", "(Ljava/util/List;)V", "convert", "", "holder", "item", "getFuncIcon", "", "transactionType", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaStatementAdapter extends BaseQuickAdapter<TransactionEntryResp, BaseViewHolder> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulizaStatementAdapter(List<TransactionEntryResp> list) {
        super(R.layout.item_fuliza_statement, list);
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, TransactionEntryResp transactionEntryResp) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, transactionEntryResp);
        int i4 = ShareDataUIState + 59;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void convert2(com.chad.library.adapter.base.viewholder.BaseViewHolder r6, com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp.TransactionEntryResp r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.iv_image
            android.view.View r1 = r6.getView(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = r7.getTransactionType()
            java.lang.String r2 = r5.copydefault(r2)
            com.huawei.image.util.GlideUtils.setFunctionIcon(r1, r2)
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_business_type
            java.lang.String r2 = r7.getTransactionType()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.setText(r1, r2)
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_amount
            java.lang.String r2 = r7.getPrincipal()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "KSH. "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.setText(r1, r2)
            java.lang.String r1 = r7.getAccessFee()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r1 != 0) goto L98
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.ShareDataUIState
            int r1 = r1 + 31
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.component3 = r3
            int r1 = r1 % r0
            java.lang.String r3 = "0"
            if (r1 == 0) goto L8f
            java.lang.String r1 = r7.getAccessFee()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L98
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_fee
            r3 = 0
            r6.setGone(r1, r3)
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_fee
            java.lang.String r7 = r7.getAccessFee()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Fee: Ksh. "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.setText(r1, r7)
            int r6 = com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.component3
            int r6 = r6 + 43
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.ShareDataUIState = r7
            int r6 = r6 % r0
            goto L9d
        L8f:
            java.lang.String r6 = r7.getAccessFee()
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            r6 = 0
            throw r6
        L98:
            int r7 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_fee
            r6.setGone(r7, r2)
        L9d:
            int r6 = com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.ShareDataUIState
            int r6 = r6 + r2
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.component3 = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.convert2(com.chad.library.adapter.base.viewholder.BaseViewHolder, com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp.TransactionEntryResp):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String copydefault(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.ShareDataUIState
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.component3 = r2
            int r1 = r1 % r0
            int r1 = r4.hashCode()
            switch(r1) {
                case -1374221261: goto L41;
                case -283648772: goto L35;
                case 982264360: goto L20;
                case 1513713816: goto L14;
                default: goto L13;
            }
        L13:
            goto L56
        L14:
            java.lang.String r0 = "ApplyInterest"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1d
            goto L56
        L1d:
            java.lang.String r4 = "icon_fuliza_interest"
            goto L58
        L20:
            java.lang.String r1 = "Send Money"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L29
            goto L56
        L29:
            java.lang.String r4 = "icon_fuliza_sendmoney"
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.component3
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.ShareDataUIState = r2
            int r1 = r1 % r0
            goto L58
        L35:
            java.lang.String r0 = "Buy Goods"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3e
            goto L56
        L3e:
            java.lang.String r4 = "icon_fuliza_lnm"
            goto L58
        L41:
            java.lang.String r1 = "RePayment"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L53
            int r4 = com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.component3
            int r4 = r4 + 117
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.ShareDataUIState = r1
            int r4 = r4 % r0
            goto L56
        L53:
            java.lang.String r4 = "icon_fuliza_repayment"
            goto L58
        L56:
            java.lang.String r4 = "icon_fuliza_unknown"
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.adapter.FulizaStatementAdapter.copydefault(java.lang.String):java.lang.String");
    }

    static {
        int i = 1 + 19;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
