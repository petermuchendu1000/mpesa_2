package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.IChangeMsisdnModel;
import javax.inject.Inject;

public class ChangeMsisdnViewModel extends BaseChangeMsisdnViewModel<IChangeMsisdnModel> {
    @Inject
    public ChangeMsisdnViewModel(IChangeMsisdnModel iChangeMsisdnModel) {
        super(iChangeMsisdnModel);
    }
}
