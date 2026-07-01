package com.huawei.digitalpayment.checkout.ui.adapter;

import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.ColorUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.common.widget.round.BaseRoundView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.checkout.model.entity.BnplBean;
import com.huawei.digitalpayment.checkoutUi.R;
import java.util.ArrayList;

public class BnplAdapter extends BaseQuickAdapter<BnplBean, BaseViewHolder> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private BnplBean component2;

    @Override
    public void convert(BaseViewHolder baseViewHolder, BnplBean bnplBean) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, bnplBean);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = component3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public BnplBean getSelectBnpl() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BnplBean bnplBean = this.component2;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bnplBean;
    }

    public void setSelectBnpl(BnplBean bnplBean) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.component2 = bnplBean;
            notifyDataSetChanged();
            int i3 = copydefault + 81;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.component2 = bnplBean;
        notifyDataSetChanged();
        throw null;
    }

    public BnplAdapter(BnplBean bnplBean) {
        super(R.layout.item_bnpl, new ArrayList());
        this.component2 = bnplBean;
    }

    protected void convert2(BaseViewHolder baseViewHolder, BnplBean bnplBean) {
        boolean zEquals;
        int i = 2 % 2;
        View view = baseViewHolder.getView(R.id.tv_title);
        View view2 = baseViewHolder.getView(R.id.tv_fee);
        View view3 = baseViewHolder.getView(R.id.tv_products);
        BnplBean bnplBean2 = this.component2;
        if (bnplBean2 == null) {
            zEquals = baseViewHolder.getLayoutPosition() == 0;
        } else {
            zEquals = bnplBean2.getProductId().equals(bnplBean.getProductId());
        }
        if (TextUtils.isEmpty(bnplBean.getPrincipalDispaly())) {
            view.setVisibility(8);
            view3.setVisibility(0);
        } else {
            view.setVisibility(0);
            view3.setVisibility(8);
        }
        if (!TextUtils.isEmpty(bnplBean.getFeeDispaly())) {
            view2.setVisibility(0);
        } else {
            int i2 = copydefault + 89;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                view2.setVisibility(40);
            } else {
                view2.setVisibility(8);
            }
        }
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) baseViewHolder.getView(R.id.ll_content);
        BaseRoundView baseFilletView = roundLinearLayout.getBaseFilletView();
        if (zEquals) {
            int i3 = component3 + 11;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                baseFilletView.setStrokeColor(ColorUtils.getColor(R.color.colorPrimary));
                roundLinearLayout.setBackgroundColor(com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.3f, ColorUtils.getColor(R.color.colorPrimary)));
                int i4 = 61 / 0;
            } else {
                baseFilletView.setStrokeColor(ColorUtils.getColor(R.color.colorPrimary));
                roundLinearLayout.setBackgroundColor(com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.3f, ColorUtils.getColor(R.color.colorPrimary)));
            }
        } else {
            int iWithAlpha = com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.04f, ColorUtils.getColor(R.color.colorPrimary));
            baseFilletView.setStrokeColor(iWithAlpha);
            roundLinearLayout.setBackgroundColor(iWithAlpha);
        }
        baseViewHolder.setText(R.id.tv_title, bnplBean.getPrincipalDispaly());
        baseViewHolder.setText(R.id.tv_fee, bnplBean.getFeeDispaly());
        baseViewHolder.setText(R.id.tv_products, bnplBean.getProductName());
    }
}
