package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.consumer.sfcui.ui.model.ISendMoneyModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.model.SendMoneyModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/SendMoneyConfirmViewModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/BaseSendMoneyConfirmViewModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/ISendMoneyModel;", DeviceInfoFieldGroup.FIELD_MODEL, "Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/SendMoneyModel;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/SendMoneyModel;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendMoneyConfirmViewModel extends BaseSendMoneyConfirmViewModel<ISendMoneyModel> {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SendMoneyConfirmViewModel(SendMoneyModel sendMoneyModel) {
        super(sendMoneyModel);
        Intrinsics.checkNotNullParameter(sendMoneyModel, "");
    }

    static {
        int i = 1 + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
