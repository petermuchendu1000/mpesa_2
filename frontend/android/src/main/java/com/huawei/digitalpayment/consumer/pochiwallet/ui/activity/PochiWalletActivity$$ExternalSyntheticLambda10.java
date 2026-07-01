package com.huawei.digitalpayment.consumer.pochiwallet.ui.activity;

import android.view.View;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import kotlin.BackEventCompat;
import kotlin.getSwipeEdge;

public final class PochiWalletActivity$$ExternalSyntheticLambda10 implements View.OnClickListener {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final PochiWalletActivity f$0;
    public final SfcPaymentBaseActivity.ToolbarContainer f$1;

    public PochiWalletActivity$$ExternalSyntheticLambda10(PochiWalletActivity pochiWalletActivity, SfcPaymentBaseActivity.ToolbarContainer toolbarContainer) {
        this.f$0 = pochiWalletActivity;
        this.f$1 = toolbarContainer;
    }

    public static void ShareDataUIState() {
        getSwipeEdge.component1[0] = BackEventCompat.ShareDataUIState[0];
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PochiWalletActivity pochiWalletActivity = this.f$0;
        if (i3 == 0) {
            PochiWalletActivity.m10818$r8$lambda$YqcIr2OKeUKBOLl2OEOpeABbJ4(pochiWalletActivity, this.f$1, view);
            return;
        }
        PochiWalletActivity.m10818$r8$lambda$YqcIr2OKeUKBOLl2OEOpeABbJ4(pochiWalletActivity, this.f$1, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
