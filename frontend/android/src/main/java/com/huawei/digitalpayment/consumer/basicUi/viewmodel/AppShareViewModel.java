package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.IAppShareModel;
import javax.inject.Inject;

public class AppShareViewModel extends BaseAppShareViewModel<IAppShareModel> {
    @Inject
    public AppShareViewModel(IAppShareModel iAppShareModel) {
        super(iAppShareModel);
    }
}
