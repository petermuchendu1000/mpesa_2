package com.huawei.digitalpayment.common.theme.viewmodel;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.common.theme.model.ThemeModel;
import com.huawei.digitalpayment.common.theme.viewmodel.base.BaseThemeViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/ThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/model/ThemeModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/ThemeModel;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemeViewModel extends BaseThemeViewModel<ThemeModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ThemeViewModel(ThemeModel themeModel) {
        super(themeModel);
        Intrinsics.checkNotNullParameter(themeModel, "");
    }
}
