package com.huawei.digitalpayment.consumer.qrcode.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.qrcode.bean.GetQrCodeResp;
import com.huawei.digitalpayment.consumer.qrcode.bean.ScanQrResultResp;
import com.huawei.digitalpayment.consumer.qrcode.request.GetQrCodeListRequest;
import com.huawei.digitalpayment.consumer.qrcode.request.GetQrCodeRequest;
import com.huawei.http.BaseRequestParams;
import java.util.List;

public interface ReceiveCodeModel extends BaseModel {
    void getQrCode(GetQrCodeRequest getQrCodeRequest, ApiCallback<GetQrCodeResp> apiCallback);

    void getQrCodeList(GetQrCodeListRequest getQrCodeListRequest, ApiCallback<GetQrCodeResp> apiCallback);

    void queryScanQrCollect(BaseRequestParams baseRequestParams, ApiCallback<List<ScanQrResultResp>> apiCallback);
}
