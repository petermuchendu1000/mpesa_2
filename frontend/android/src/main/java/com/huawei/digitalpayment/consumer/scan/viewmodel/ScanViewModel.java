package com.huawei.digitalpayment.consumer.scan.viewmodel;

import com.huawei.digitalpayment.consumer.scan.model.ScanModel;
import javax.inject.Inject;

public class ScanViewModel extends BaseScanViewModel<ScanModel> {
    @Inject
    public ScanViewModel(ScanModel scanModel) {
        super(scanModel);
    }
}
