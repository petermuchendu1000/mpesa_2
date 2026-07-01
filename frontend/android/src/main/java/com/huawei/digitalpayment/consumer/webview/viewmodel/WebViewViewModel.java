package com.huawei.digitalpayment.consumer.webview.viewmodel;

import com.huawei.digitalpayment.consumer.webview.model.IWebViewModel;
import javax.inject.Inject;

public class WebViewViewModel extends BaseWebViewViewModel<IWebViewModel> {
    @Inject
    public WebViewViewModel(IWebViewModel iWebViewModel) {
        super(iWebViewModel);
    }
}
