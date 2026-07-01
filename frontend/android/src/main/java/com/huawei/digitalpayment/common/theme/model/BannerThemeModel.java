package com.huawei.digitalpayment.common.theme.model;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.common.theme.data.BannerResp;
import com.huawei.digitalpayment.common.theme.request.params.QueryBannerParams;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/BannerThemeModel;", "Lcom/huawei/digitalpayment/common/theme/model/IBannerThemeModel;", "<init>", "()V", "refreshBanner", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/QueryBannerParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/common/theme/data/BannerResp;", "getKey", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BannerThemeModel implements IBannerThemeModel {
    private static int component1 = 1;
    private static int copydefault;

    @Inject
    public BannerThemeModel() {
    }

    @Override
    public void refreshBanner(QueryBannerParams params, ApiCallback<List<BannerResp>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<List<? extends BannerResp>>(params, this) {
            private static int component3 = 1;
            private static int copydefault;
            final BannerThemeModel ShareDataUIState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("queryBanners", params);
                this.ShareDataUIState = this;
            }

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 103;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return convert(jsonObject);
                }
                convert(jsonObject);
                throw null;
            }

            @Override
            public List<BannerResp> convert(JsonObject origin) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                List<BannerResp> listEmptyList = (List) SecureGsonUtils.fromJson(origin.get(this.ShareDataUIState.getKey()).toString(), new TypeToken<List<? extends BannerResp>>() {
                }.getType());
                if (listEmptyList == null) {
                    int i3 = copydefault + 97;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    listEmptyList = Collections.emptyList();
                    Intrinsics.checkNotNullExpressionValue(listEmptyList, "");
                }
                int i5 = copydefault + 125;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return listEmptyList;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, callback);
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getKey() {
        int i = 2 % 2;
        if (!AppInfoUtils.isConsumer()) {
            int i2 = component1 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return "bannersAndTips";
        }
        int i4 = component1 + 89;
        int i5 = i4 % 128;
        copydefault = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 119;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return "configs";
    }
}
