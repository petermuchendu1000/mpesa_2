package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyBaseQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IBaseQuestionModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "getQuestions", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "verifyQuestion", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyBaseQuestionParams;", "Lcom/huawei/http/BaseResp;", "resetPin", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ReSetPinParams;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IBaseQuestionModel extends BaseModel {
    void getQuestions(BaseRequestParams params, ApiCallback<List<LocalQuestionItem>> callback);

    void resetPin(ReSetPinParams params, ApiCallback<BaseResp> callback);

    void verifyQuestion(VerifyBaseQuestionParams params, ApiCallback<BaseResp> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component2 = 0;
        private static int copydefault = 1;

        public static void resetPin(IBaseQuestionModel iBaseQuestionModel, ReSetPinParams reSetPinParams, ApiCallback<BaseResp> apiCallback) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(reSetPinParams, "");
            Intrinsics.checkNotNullParameter(apiCallback, "");
            iBaseQuestionModel.sendRequest(new ResetPinRepository(reSetPinParams), apiCallback);
            int i2 = copydefault + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }
    }
}
