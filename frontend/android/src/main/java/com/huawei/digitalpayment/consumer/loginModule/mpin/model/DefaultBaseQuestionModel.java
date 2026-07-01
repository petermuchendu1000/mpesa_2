package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.BaseQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionRespKt;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyBaseQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.IBaseQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultBaseQuestionModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IBaseQuestionModel;", "<init>", "()V", "getQuestions", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "verifyQuestion", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyBaseQuestionParams;", "Lcom/huawei/http/BaseResp;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultBaseQuestionModel implements IBaseQuestionModel {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public void resetPin(ReSetPinParams reSetPinParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        IBaseQuestionModel.DefaultImpls.resetPin(this, reSetPinParams, apiCallback);
        int i4 = component1 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public DefaultBaseQuestionModel() {
    }

    @Override
    public void getQuestions(BaseRequestParams params, ApiCallback<List<LocalQuestionItem>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<List<? extends LocalQuestionItem>> paymentRequest = new PaymentRequest<List<? extends LocalQuestionItem>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 67;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                List<LocalQuestionItem> listConvert = convert(jsonObject);
                int i5 = component3 + 89;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return listConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                int i4 = i3 % 128;
                component3 = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 103;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return "getBaseQuestion";
            }

            @Override
            public List<LocalQuestionItem> convert(JsonObject origin) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                GetBaseQuestionResp getBaseQuestionResp = (GetBaseQuestionResp) SecureGsonUtils.fromJson(origin.toString(), new TypeToken<GetBaseQuestionResp>() {
                }.getType());
                if (getBaseQuestionResp == null) {
                    int i3 = component3 + 17;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return CollectionsKt.emptyList();
                }
                List<BaseQuestionItem> baseQuestions = getBaseQuestionResp.getBaseQuestions();
                if (baseQuestions != null) {
                    List<BaseQuestionItem> list = baseQuestions;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(GetBaseQuestionRespKt.toLocal((BaseQuestionItem) it.next(), null));
                    }
                    return CollectionsKt.sortedWith(arrayList, new Comparator() {
                        private static int component1 = 1;
                        private static int component2;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override
                        public final int compare(T t, T t2) {
                            int i5 = 2 % 2;
                            int i6 = component2 + 7;
                            component1 = i6 % 128;
                            LocalQuestionItem localQuestionItem = (LocalQuestionItem) t;
                            if (i6 % 2 != 0) {
                                return ComparisonsKt.compareValues(localQuestionItem.getOrder(), ((LocalQuestionItem) t2).getOrder());
                            }
                            ComparisonsKt.compareValues(localQuestionItem.getOrder(), ((LocalQuestionItem) t2).getOrder());
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                }
                List<LocalQuestionItem> listEmptyList = CollectionsKt.emptyList();
                int i5 = component3 + 43;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
                return listEmptyList;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifyQuestion(VerifyBaseQuestionParams params, ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 13;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 51;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "verifyBaseQuestion";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
    }
}
