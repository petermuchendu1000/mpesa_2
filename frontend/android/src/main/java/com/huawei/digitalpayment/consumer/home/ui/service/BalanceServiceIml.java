package com.huawei.digitalpayment.consumer.home.ui.service;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.IBalanceService;
import com.huawei.digitalpayment.home.data.source.remote.RemoteBalance;
import com.huawei.digitalpayment.home.util.BalanceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/service/BalanceServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IBalanceService;", "<init>", "()V", "getBalance", "Landroidx/lifecycle/LiveData;", "", "reFreshBalance", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceServiceIml implements IBalanceService {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 53 % 128;

    @Override
    public LiveData<String> getBalance() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            BalanceHelper.INSTANCE.getBalanceMutableLiveData();
            throw null;
        }
        MutableLiveData<String> balanceMutableLiveData = BalanceHelper.INSTANCE.getBalanceMutableLiveData();
        int i3 = component3 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return balanceMutableLiveData;
    }

    @Override
    public void reFreshBalance() {
        int i = 2 % 2;
        new PaymentRequest<String>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 65;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                String strConvert = convert(jsonObject);
                int i5 = copydefault + 35;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return strConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 77;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return "queryBalance";
                }
                int i4 = 67 / 0;
                return "queryBalance";
            }

            @Override
            public String convert(JsonObject origin) {
                int i2 = 2 % 2;
                int i3 = copydefault + 1;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(origin, "");
                    Object objFromJson = GsonUtils.fromJson(origin.toString(), (Class<Object>) RemoteBalance.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                    return ((RemoteBalance) objFromJson).getAmountDisplay();
                }
                Intrinsics.checkNotNullParameter(origin, "");
                Object objFromJson2 = GsonUtils.fromJson(origin.toString(), (Class<Object>) RemoteBalance.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson2, "");
                int i4 = 89 / 0;
                return ((RemoteBalance) objFromJson2).getAmountDisplay();
            }
        }.sendRequest(new ApiCallback<String>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 21;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(str);
                if (i4 == 0) {
                    int i5 = 56 / 0;
                }
                int i6 = ShareDataUIState + 65;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(String value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 59;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                BalanceHelper.INSTANCE.saveBalance(value);
                int i5 = ShareDataUIState + 67;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 27;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    int i4 = 74 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                }
                int i5 = ShareDataUIState + 83;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 8 / 0;
                }
            }
        });
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        if (53 % 2 == 0) {
            int i = 47 / 0;
        }
    }
}
