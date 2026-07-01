package com.huawei.digitalpayment.consumer.risk.vm;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.risk.model.DefaultRiskModel;
import com.huawei.digitalpayment.consumer.risk.model.IRiskModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/vm/RiskViewModel;", "Lcom/huawei/digitalpayment/consumer/risk/vm/BaseRiskViewModel;", "Lcom/huawei/digitalpayment/consumer/risk/model/DefaultRiskModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/risk/model/DefaultRiskModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/risk/model/DefaultRiskModel;", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RiskViewModel extends BaseRiskViewModel<DefaultRiskModel> {
    private static int component1 = 1;
    private static int component3;
    private final DefaultRiskModel copydefault;

    @Override
    public IRiskModel getModel() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultRiskModel model = getModel();
        int i4 = component3 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return model;
    }

    @Override
    protected DefaultRiskModel getModel() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        DefaultRiskModel defaultRiskModel = this.copydefault;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return defaultRiskModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RiskViewModel(DefaultRiskModel defaultRiskModel) {
        super(defaultRiskModel);
        Intrinsics.checkNotNullParameter(defaultRiskModel, "");
        this.copydefault = defaultRiskModel;
    }
}
