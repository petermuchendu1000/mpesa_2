package com.huawei.digitalpayment.history.ui.adapter;

import android.text.TextUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.history.R;
import com.huawei.digitalpayment.history.model.entity.SettlementInfo;
import java.util.List;

public class SettlementAdapter extends BaseQuickAdapter<SettlementInfo, BaseViewHolder> {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public void convert(BaseViewHolder baseViewHolder, SettlementInfo settlementInfo) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, settlementInfo);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SettlementAdapter(List<SettlementInfo> list) {
        super(R.layout.item_history_settlement, list);
    }

    protected void convert2(BaseViewHolder baseViewHolder, SettlementInfo settlementInfo) {
        int i = 2 % 2;
        baseViewHolder.setText(R.id.tv_settlement_amount, settlementInfo.getSettlementAmount());
        baseViewHolder.setText(R.id.tv_name, settlementInfo.getSettlementName());
        baseViewHolder.setText(R.id.tv_escow_time, TimeUtils.formatTimeTodayHms(settlementInfo.getEscrowFinishTime()));
        baseViewHolder.setText(R.id.tv_settlment_time, TimeUtils.formatTimeTodayHms(settlementInfo.getSettlementTime()));
        baseViewHolder.setText(R.id.tv_settlement_status, settlementInfo.getSettlementStatus());
        if (!(!TextUtils.isEmpty(settlementInfo.getSettlementAmount()))) {
            baseViewHolder.setGone(R.id.ll_settlement_amount, true);
        }
        if (TextUtils.isEmpty(settlementInfo.getEscrowFinishTime())) {
            int i2 = component1 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            baseViewHolder.setGone(R.id.ll_escow_time, true);
        }
        if (TextUtils.isEmpty(settlementInfo.getSettlementTime())) {
            int i4 = copydefault + 111;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                baseViewHolder.setGone(R.id.ll_settlement_time, false);
            } else {
                baseViewHolder.setGone(R.id.ll_settlement_time, true);
            }
            int i5 = component1 + 93;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        if (TextUtils.isEmpty(settlementInfo.getSettlementStatus())) {
            baseViewHolder.setGone(R.id.ll_status, true);
        }
        baseViewHolder.setGone(R.id.view_empty, baseViewHolder.getLayoutPosition() == 0);
    }
}
