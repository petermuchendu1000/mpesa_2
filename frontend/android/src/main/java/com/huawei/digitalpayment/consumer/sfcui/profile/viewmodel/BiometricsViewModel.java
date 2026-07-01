package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.sfcui.profile.model.IBiometricsSettingModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsViewModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BaseBiometricsViewModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BiometricsViewModel extends BaseBiometricsViewModel<IBiometricsSettingModel> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BiometricsViewModel(IBiometricsSettingModel iBiometricsSettingModel) {
        super(iBiometricsSettingModel);
        Intrinsics.checkNotNullParameter(iBiometricsSettingModel, "");
    }

    static {
        int i = 1 + 47;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
