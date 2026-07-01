package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.DefaultBaseQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.IBaseQuestionModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifyBaseQuestionViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseVerifyBaseQuestionViewModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultBaseQuestionModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultBaseQuestionModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultBaseQuestionModel;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyBaseQuestionViewModel extends BaseVerifyBaseQuestionViewModel<DefaultBaseQuestionModel> {
    private static int component3 = 1;
    private static int copydefault;
    private final DefaultBaseQuestionModel component1;

    @Override
    public IBaseQuestionModel getModel() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getModel();
            obj.hashCode();
            throw null;
        }
        DefaultBaseQuestionModel model = getModel();
        int i3 = copydefault + 23;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return model;
        }
        throw null;
    }

    @Override
    protected DefaultBaseQuestionModel getModel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        DefaultBaseQuestionModel defaultBaseQuestionModel = this.component1;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return defaultBaseQuestionModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VerifyBaseQuestionViewModel(DefaultBaseQuestionModel defaultBaseQuestionModel) {
        super(defaultBaseQuestionModel);
        Intrinsics.checkNotNullParameter(defaultBaseQuestionModel, "");
        this.component1 = defaultBaseQuestionModel;
    }
}
