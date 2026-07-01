package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultChangePinOtpModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.IChangePinOtpModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/ChangePinOtpViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseChangePinOtpViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultChangePinOtpModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultChangePinOtpModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultChangePinOtpModel;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangePinOtpViewModel extends BaseChangePinOtpViewModel<DefaultChangePinOtpModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final DefaultChangePinOtpModel component2;

    @Override
    public IChangePinOtpModel getModel() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            getModel();
            throw null;
        }
        DefaultChangePinOtpModel model = getModel();
        int i3 = component1 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return model;
    }

    @Override
    protected DefaultChangePinOtpModel getModel() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        DefaultChangePinOtpModel defaultChangePinOtpModel = this.component2;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return defaultChangePinOtpModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ChangePinOtpViewModel(DefaultChangePinOtpModel defaultChangePinOtpModel) {
        super(defaultChangePinOtpModel);
        Intrinsics.checkNotNullParameter(defaultChangePinOtpModel, "");
        this.component2 = defaultChangePinOtpModel;
    }
}
