package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetSecurityQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ModifySecurityResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.ModifySecurityParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QuerySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionListResp;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionListRespKt;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016J$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00102\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultSecurityQuestionModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/ISecurityQuestionModel;", "<init>", "()V", "getQuestions", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "verifyQuestion", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionParams;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionResp;", "queryList", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/QuerySecurityQuestionParams;", "changeSecurityQuestions", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/ModifySecurityParams;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/ModifySecurityResp;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultSecurityQuestionModel implements ISecurityQuestionModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public void resetPin(ReSetPinParams reSetPinParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ISecurityQuestionModel.DefaultImpls.resetPin(this, reSetPinParams, apiCallback);
        if (i3 == 0) {
            throw null;
        }
        int i4 = copydefault + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public DefaultSecurityQuestionModel() {
    }

    @Override
    public void getQuestions(BaseRequestParams params, ApiCallback<List<LocalQuestionItem>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<List<? extends LocalQuestionItem>> paymentRequest = new PaymentRequest<List<? extends LocalQuestionItem>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 117;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                List<LocalQuestionItem> listConvert = convert(jsonObject);
                int i5 = copydefault + 59;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 87 / 0;
                }
                return listConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 121;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 99;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return "getSecurityQuestion";
                }
                throw null;
            }

            @Override
            public List<LocalQuestionItem> convert(JsonObject origin) {
                String pattern;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                GetSecurityQuestionResp getSecurityQuestionResp = (GetSecurityQuestionResp) SecureGsonUtils.fromJson(origin.toString(), new TypeToken<GetSecurityQuestionResp>() {
                }.getType());
                if (getSecurityQuestionResp == null) {
                    return CollectionsKt.emptyList();
                }
                List<SecurityQuestionItem> questions = getSecurityQuestionResp.getQuestions();
                if (questions == null) {
                    return CollectionsKt.emptyList();
                }
                List<SecurityQuestionItem> list = questions;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i3 = ShareDataUIState + 125;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                for (SecurityQuestionItem securityQuestionItem : list) {
                    AnswerValidate answerFieldValidateConfig = getSecurityQuestionResp.getAnswerFieldValidateConfig();
                    if (answerFieldValidateConfig != null) {
                        int i5 = ShareDataUIState + 35;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        pattern = answerFieldValidateConfig.getPattern();
                    } else {
                        int i7 = copydefault + 43;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        pattern = null;
                    }
                    arrayList.add(SecurityQuestionListRespKt.toLocal(securityQuestionItem, pattern));
                }
                return arrayList;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifyQuestion(VerifySecurityQuestionParams params, ApiCallback<VerifySecurityQuestionResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<VerifySecurityQuestionResp> paymentRequest = new PaymentRequest<VerifySecurityQuestionResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 5;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "verifySecurityQuestion";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryList(QuerySecurityQuestionParams params, ApiCallback<List<LocalQuestionItem>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<List<? extends LocalQuestionItem>> paymentRequest = new PaymentRequest<List<? extends LocalQuestionItem>>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 13;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return convert(jsonObject);
                }
                convert(jsonObject);
                throw null;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 3;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 76 / 0;
                }
                return "querySysSecurityQuestionList";
            }

            @Override
            public List<LocalQuestionItem> convert(JsonObject origin) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                SecurityQuestionListResp securityQuestionListResp = (SecurityQuestionListResp) SecureGsonUtils.fromJson(origin.toString(), new TypeToken<SecurityQuestionListResp>() {
                }.getType());
                if (securityQuestionListResp == null) {
                    return CollectionsKt.emptyList();
                }
                List<SecurityQuestionItem> questionItemList = securityQuestionListResp.getQuestionItemList();
                if (questionItemList == null) {
                    return CollectionsKt.emptyList();
                }
                List<SecurityQuestionItem> list = questionItemList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i3 = component3 + 21;
                    ShareDataUIState = i3 % 128;
                    String pattern = null;
                    if (i3 % 2 == 0) {
                        securityQuestionListResp.getAnswerFieldValidateConfig();
                        throw null;
                    }
                    SecurityQuestionItem securityQuestionItem = (SecurityQuestionItem) it.next();
                    AnswerValidate answerFieldValidateConfig = securityQuestionListResp.getAnswerFieldValidateConfig();
                    if (answerFieldValidateConfig != null) {
                        int i4 = ShareDataUIState + 91;
                        component3 = i4 % 128;
                        if (i4 % 2 != 0) {
                            pattern = answerFieldValidateConfig.getPattern();
                            int i5 = 61 / 0;
                        } else {
                            pattern = answerFieldValidateConfig.getPattern();
                        }
                    }
                    arrayList.add(SecurityQuestionListRespKt.toLocal(securityQuestionItem, pattern));
                    int i6 = component3 + 63;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 4 / 5;
                    }
                }
                return arrayList;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void changeSecurityQuestions(ModifySecurityParams params, ApiCallback<ModifySecurityResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<ModifySecurityResp> paymentRequest = new PaymentRequest<ModifySecurityResp>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 35;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 61;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "changeSecurityQuestions";
            }
        };
        paymentRequest.addParams("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
