package com.huawei.digitalpayment.consumer.scan.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.scan.model.request.ScanQrRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyCashOutRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.ScanQrResp;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;

public interface ScanModel extends BaseModel {
    void analysisResult(ScanQrRequest scanQrRequest, ApiCallback<ScanQrResp> apiCallback);

    void verifyBuyGoodsTransfer(VerifyBuyGoodsRequest verifyBuyGoodsRequest, ApiCallback<VerifyNumberResp> apiCallback);

    void verifyCashOut(VerifyCashOutRequest verifyCashOutRequest, ApiCallback<VerifyNumberResp> apiCallback);

    void verifyP2pTransfer(VerifyTransferRequest verifyTransferRequest, ApiCallback<VerifyNumberResp> apiCallback);
}
