package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.loginModule.register.model.DefaultSecurityVerificationModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.ISecurityVerificationModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/viewmodel/SecurityVerificationViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/viewmodel/BaseSecurityVerificationViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/DefaultSecurityVerificationModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/register/model/DefaultSecurityVerificationModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/model/DefaultSecurityVerificationModel;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecurityVerificationViewModel extends BaseSecurityVerificationViewModel<DefaultSecurityVerificationModel> {
    private static int component2 = 1;
    private static int copydefault;
    private final DefaultSecurityVerificationModel component1;

    @Override
    public ISecurityVerificationModel getModel() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            getModel();
            throw null;
        }
        DefaultSecurityVerificationModel model = getModel();
        int i3 = component2 + 119;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return model;
        }
        throw null;
    }

    @Override
    protected DefaultSecurityVerificationModel getModel() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        DefaultSecurityVerificationModel defaultSecurityVerificationModel = this.component1;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return defaultSecurityVerificationModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SecurityVerificationViewModel(DefaultSecurityVerificationModel defaultSecurityVerificationModel) {
        super(defaultSecurityVerificationModel);
        Intrinsics.checkNotNullParameter(defaultSecurityVerificationModel, "");
        this.component1 = defaultSecurityVerificationModel;
    }
}
