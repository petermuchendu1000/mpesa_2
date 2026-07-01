package com.huawei.digitalpayment.common.theme.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.common.theme.model.BalanceThemeModel;
import com.huawei.digitalpayment.common.theme.model.IThemeBalanceModel;
import com.huawei.digitalpayment.common.theme.viewmodel.base.BaseBalanceThemeViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/BalanceThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseBalanceThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/model/IThemeBalanceModel;", DeviceInfoFieldGroup.FIELD_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/BalanceThemeModel;", "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/BalanceThemeModel;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BalanceThemeViewModel extends BaseBalanceThemeViewModel<IThemeBalanceModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BalanceThemeViewModel(BalanceThemeModel balanceThemeModel) {
        super(balanceThemeModel);
        Intrinsics.checkNotNullParameter(balanceThemeModel, "");
    }
}
