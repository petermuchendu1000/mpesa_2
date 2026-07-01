package com.huawei.digitalpayment.consumer.webview.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.webview.model.resp.AaRecordResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.ScanQrResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.VerifyNumberResp;
import com.huawei.http.BaseResp;
import java.util.Map;

public interface IWebViewModel extends BaseModel {
    void aaPaidVerify(Map<String, Object> map, ApiCallback<BaseResp> apiCallback);

    void analysisResult(String str, String str2, ApiCallback<ScanQrResp> apiCallback);

    void createAaPaidRecord(Map<String, Object> map, ApiCallback<AaRecordResp> apiCallback);

    void getH5AccessToken(String str, ApiCallback<GetH5AccessTokenResp> apiCallback);

    void verifyP2pTransfer(String str, ApiCallback<VerifyNumberResp> apiCallback);
}
