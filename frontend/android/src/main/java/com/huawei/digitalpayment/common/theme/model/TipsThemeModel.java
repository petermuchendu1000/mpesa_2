package com.huawei.digitalpayment.common.theme.model;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.common.theme.data.TipsResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils;
import com.huawei.http.BaseRequestParams;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/TipsThemeModel;", "Lcom/huawei/digitalpayment/common/theme/model/ITipsThemeModel;", "<init>", "()V", "getTips", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/common/theme/data/TipsResp;", "getKey", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TipsThemeModel implements ITipsThemeModel {
    private static int component1 = 1;
    private static int component3;

    @Inject
    public TipsThemeModel() {
    }

    @Override
    public void getTips(BaseRequestParams params, ApiCallback<List<TipsResp>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<List<? extends TipsResp>>(params) {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 33;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return convert(jsonObject);
                }
                convert(jsonObject);
                throw null;
            }

            @Override
            public List<TipsResp> convert(JsonObject origin) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                List<TipsResp> list = (List) SecureGsonUtils.fromJson(origin.get(this.getKey()).toString(), new TypeToken<List<? extends TipsResp>>() {
                }.getType());
                if (list != null) {
                    return list;
                }
                int i3 = copydefault + 3;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(Collections.emptyList(), "");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                List<TipsResp> listEmptyList = Collections.emptyList();
                Intrinsics.checkNotNullExpressionValue(listEmptyList, "");
                int i4 = component3 + 119;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return listEmptyList;
            }
        }, callback);
        int i2 = component3 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public String getKey() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            AppInfoUtils.isConsumer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!AppInfoUtils.isConsumer()) {
            return "bannersAndTips";
        }
        int i3 = component3 + 101;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return "configs";
    }
}
