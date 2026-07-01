package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultSecurityQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifySecurityQuestionViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseVerifySecurityQuestionViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultSecurityQuestionModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultSecurityQuestionModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultSecurityQuestionModel;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifySecurityQuestionViewModel extends BaseVerifySecurityQuestionViewModel<DefaultSecurityQuestionModel> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final DefaultSecurityQuestionModel ShareDataUIState;

    @Override
    public ISecurityQuestionModel getModel() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSecurityQuestionModel model = getModel();
        int i4 = component2 + 87;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return model;
        }
        throw null;
    }

    @Override
    protected DefaultSecurityQuestionModel getModel() {
        DefaultSecurityQuestionModel defaultSecurityQuestionModel;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            defaultSecurityQuestionModel = this.ShareDataUIState;
            int i4 = 69 / 0;
        } else {
            defaultSecurityQuestionModel = this.ShareDataUIState;
        }
        int i5 = i2 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return defaultSecurityQuestionModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VerifySecurityQuestionViewModel(DefaultSecurityQuestionModel defaultSecurityQuestionModel) {
        super(defaultSecurityQuestionModel);
        Intrinsics.checkNotNullParameter(defaultSecurityQuestionModel, "");
        this.ShareDataUIState = defaultSecurityQuestionModel;
    }
}
