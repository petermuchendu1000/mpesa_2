package com.huawei.digitalpayment.pwa.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.pwa.model.response.GetH5AccessTokenResp;
import com.huawei.digitalpayment.pwa.model.response.ScanQrResp;
import com.huawei.digitalpayment.pwa.model.resquest.AnalysisResultRequest;
import com.huawei.digitalpayment.pwa.model.resquest.H5AccessTokenRequest;

public interface IPwaModel extends BaseModel {
    void analysisResult(AnalysisResultRequest analysisResultRequest, ApiCallback<ScanQrResp> apiCallback);

    void getH5AccessToken(H5AccessTokenRequest h5AccessTokenRequest, ApiCallback<GetH5AccessTokenResp> apiCallback);
}
