package com.huawei.digitalpayment.pwa.viewmodel;

import com.huawei.digitalpayment.pwa.model.IPwaModel;
import javax.inject.Inject;

public class PwaViewModel extends BasePwaViewModel<IPwaModel> {
    @Inject
    public PwaViewModel(IPwaModel iPwaModel) {
        super(iPwaModel);
    }
}
