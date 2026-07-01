package com.huawei.digitalpayment.consumer.loginModule.register.model;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QuerySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionListResp;
import com.huawei.digitalpayment.consumer.loginModule.register.data.SecurityQuestionListRespKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/DefaultSecurityVerificationModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/ISecurityVerificationModel;", "<init>", "()V", "queryList", "", "params", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/QuerySecurityQuestionParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultSecurityVerificationModel implements ISecurityVerificationModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultSecurityVerificationModel() {
    }

    @Override
    public void queryList(QuerySecurityQuestionParams params, ApiCallback<List<LocalQuestionItem>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<List<? extends LocalQuestionItem>> paymentRequest = new PaymentRequest<List<? extends LocalQuestionItem>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 69;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                List<LocalQuestionItem> listConvert = convert(jsonObject);
                int i5 = copydefault + 65;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 29 / 0;
                }
                return listConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 101;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 29;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "querySysSecurityQuestionList";
            }

            @Override
            public List<LocalQuestionItem> convert(JsonObject origin) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                SecurityQuestionListResp securityQuestionListResp = (SecurityQuestionListResp) SecureGsonUtils.fromJson(origin.toString(), new TypeToken<SecurityQuestionListResp>() {
                }.getType());
                if (securityQuestionListResp == null) {
                    int i3 = copydefault + 121;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
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
                    int i5 = component3 + 91;
                    copydefault = i5 % 128;
                    String pattern = null;
                    if (i5 % 2 != 0) {
                        securityQuestionListResp.getAnswerFieldValidateConfig();
                        throw null;
                    }
                    SecurityQuestionItem securityQuestionItem = (SecurityQuestionItem) it.next();
                    AnswerValidate answerFieldValidateConfig = securityQuestionListResp.getAnswerFieldValidateConfig();
                    if (answerFieldValidateConfig != null) {
                        pattern = answerFieldValidateConfig.getPattern();
                    }
                    arrayList.add(SecurityQuestionListRespKt.toLocal(securityQuestionItem, pattern));
                }
                return arrayList;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }
}
