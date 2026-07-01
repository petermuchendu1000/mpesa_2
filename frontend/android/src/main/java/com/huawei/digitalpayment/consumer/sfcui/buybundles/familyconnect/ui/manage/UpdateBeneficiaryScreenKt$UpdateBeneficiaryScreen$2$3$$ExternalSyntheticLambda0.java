package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.manage;

import androidx.compose.runtime.MutableState;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.manage.UpdateBeneficiaryScreenKt;
import com.safaricom.designsystem.components.radio.IRadioButton;
import kotlin.ActivityComposeUtilsKt;
import kotlin.Unit;
import kotlin.getLauncher;
import kotlin.jvm.functions.Function1;

public final class UpdateBeneficiaryScreenKt$UpdateBeneficiaryScreen$2$3$$ExternalSyntheticLambda0 implements Function1 {
    private static int component2 = 1;
    private static int copydefault;
    public final MutableState f$0;

    public UpdateBeneficiaryScreenKt$UpdateBeneficiaryScreen$2$3$$ExternalSyntheticLambda0(MutableState mutableState) {
        this.f$0 = mutableState;
    }

    public static void ShareDataUIState() {
        getLauncher.component3[0] = ActivityComposeUtilsKt.component1[0];
    }

    @Override
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = UpdateBeneficiaryScreenKt.component1.AnonymousClass1.ShareDataUIState(this.f$0, (IRadioButton) obj);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return unitShareDataUIState;
    }
}
