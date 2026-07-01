package com.huawei.digitalpayment.home.data;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.http.BaseResp;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/home/data/ServiceManagerModel;", "Lcom/huawei/digitalpayment/home/data/IServiceManagerModel;", "<init>", "()V", "updateMyService", "", "myServiceFunctions", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ServiceManagerModel implements IServiceManagerModel {
    private static int component3 = 1;
    private static int copydefault;

    @Inject
    public ServiceManagerModel() {
    }

    @Override
    public void updateMyService(final List<LocalHomeFunction> myServiceFunctions, final ApiCallback<Boolean> callback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(myServiceFunctions, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 99;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 31;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "updateMyService";
                }
                throw null;
            }
        };
        JsonArray jsonArray = new JsonArray();
        int size = myServiceFunctions.size();
        int i2 = 0;
        while (i2 < size) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("funcId", myServiceFunctions.get(i2).getFuncId());
            jsonObject.addProperty("order", String.valueOf(i2));
            jsonObject.addProperty("editEnable", Boolean.valueOf(myServiceFunctions.get(i2).getEditEnable()));
            jsonArray.add(jsonObject);
            i2++;
            int i3 = copydefault + 107;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        paymentRequest.addParams("configs", jsonArray);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i5 = 2 % 2;
                int i6 = component1 + 63;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                onSuccess2(baseResp);
                if (i7 != 0) {
                    throw null;
                }
                int i8 = ShareDataUIState + 75;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            }

            public void onSuccess2(BaseResp value) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 37;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                HomeConfigManager.INSTANCE.updateHomeServices(myServiceFunctions);
                callback.onSuccess(true);
                int i8 = ShareDataUIState + 121;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i5 = 2 % 2;
                int i6 = component1 + 9;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    callback.onError(e);
                    int i7 = 15 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    callback.onError(e);
                }
                int i8 = component1 + 39;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i5 = component3 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }
}
