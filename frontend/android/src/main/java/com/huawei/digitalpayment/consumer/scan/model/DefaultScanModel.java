package com.huawei.digitalpayment.consumer.scan.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.scan.model.request.ScanQrRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyCashOutRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.ScanQrResp;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.scan.repository.AnalysisResultRepository;
import com.huawei.digitalpayment.consumer.scan.repository.VerifyCashOutRepository;
import com.huawei.digitalpayment.consumer.scan.repository.VerifyCustomerBuyGoodsRepository;
import com.huawei.digitalpayment.consumer.scan.repository.VerifyP2PTransferRepository;
import javax.inject.Inject;

public class DefaultScanModel implements ScanModel {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultScanModel() {
    }

    @Override
    public void analysisResult(ScanQrRequest scanQrRequest, ApiCallback<ScanQrResp> apiCallback) {
        int i = 2 % 2;
        AnalysisResultRepository analysisResultRepository = new AnalysisResultRepository();
        analysisResultRepository.addParams(scanQrRequest);
        sendRequest(analysisResultRepository, apiCallback);
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifyCashOut(VerifyCashOutRequest verifyCashOutRequest, ApiCallback<VerifyNumberResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new VerifyCashOutRepository(verifyCashOutRequest), apiCallback);
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifyP2pTransfer(VerifyTransferRequest verifyTransferRequest, ApiCallback<VerifyNumberResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new VerifyP2PTransferRepository(verifyTransferRequest), apiCallback);
        int i2 = component2 + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void verifyBuyGoodsTransfer(VerifyBuyGoodsRequest verifyBuyGoodsRequest, ApiCallback<VerifyNumberResp> apiCallback) {
        int i = 2 % 2;
        sendRequest(new VerifyCustomerBuyGoodsRepository(verifyBuyGoodsRequest), apiCallback);
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
