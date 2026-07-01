package com.huawei.digitalpayment.consumer.manageandviewdata.ui.limits;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import kotlin.EdgeToEdgeApi23;
import kotlin.EdgeToEdgeApi29;

public final class SfcUsageLimitsActivity$$ExternalSyntheticLambda0 implements TabLayoutMediator.TabConfigurationStrategy {
    private static int component2 = 1;
    private static int component3;
    public final SfcUsageLimitsActivity f$0;

    public SfcUsageLimitsActivity$$ExternalSyntheticLambda0(SfcUsageLimitsActivity sfcUsageLimitsActivity) {
        this.f$0 = sfcUsageLimitsActivity;
    }

    public static void ShareDataUIState() {
        EdgeToEdgeApi23.copydefault[0] = EdgeToEdgeApi29.copydefault[0];
    }

    @Override
    public final void onConfigureTab(TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 57;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            SfcUsageLimitsActivity.m10707$r8$lambda$ymyYDDBWIkC1B0U2ebXD7L5n4(this.f$0, tab, i);
            int i4 = 85 / 0;
        } else {
            SfcUsageLimitsActivity.m10707$r8$lambda$ymyYDDBWIkC1B0U2ebXD7L5n4(this.f$0, tab, i);
        }
        int i5 = component3 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
