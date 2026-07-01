package com.huawei.digitalpayment.common.theme.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.common.theme.model.ITipsThemeModel;
import com.huawei.digitalpayment.common.theme.model.TipsThemeModel;
import com.huawei.digitalpayment.common.theme.viewmodel.base.BaseTipsThemeViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/TipsThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseTipsThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/model/ITipsThemeModel;", DeviceInfoFieldGroup.FIELD_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/TipsThemeModel;", "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/TipsThemeModel;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TipsThemeViewModel extends BaseTipsThemeViewModel<ITipsThemeModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TipsThemeViewModel(TipsThemeModel tipsThemeModel) {
        super(tipsThemeModel);
        Intrinsics.checkNotNullParameter(tipsThemeModel, "");
    }
}
