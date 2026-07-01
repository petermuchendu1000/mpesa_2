package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/ExpiryBundlesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "_otherBundlesData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OtherBundlesCatalogResponse;", "otherBundlesData", "Landroidx/lifecycle/LiveData;", "getOtherBundlesData", "()Landroidx/lifecycle/LiveData;", "getExpiryBundlesCatalog", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpiryBundlesViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 13 % 128;
    private static int component3 = 1;
    private static int copydefault;
    private final MutableLiveData<Resource<OtherBundlesCatalogResponse>> component1 = new MutableLiveData<>();

    public static final MutableLiveData access$get_otherBundlesData$p(ExpiryBundlesViewModel expiryBundlesViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<OtherBundlesCatalogResponse>> mutableLiveData = expiryBundlesViewModel.component1;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<Resource<OtherBundlesCatalogResponse>> getOtherBundlesData() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<OtherBundlesCatalogResponse>> mutableLiveData = this.component1;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final void getExpiryBundlesCatalog() {
        int i = 2 % 2;
        HaProxyRequest<OtherBundlesCatalogResponse> haProxyRequest = new HaProxyRequest<OtherBundlesCatalogResponse>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 35;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return GsmEndpoints.GSM_OLD_BUNDLES_CATALOG;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.GET);
        sendRequest(haProxyRequest, new ApiCallback<OtherBundlesCatalogResponse>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(OtherBundlesCatalogResponse otherBundlesCatalogResponse) {
                int i2 = 2 % 2;
                int i3 = component3 + 7;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(otherBundlesCatalogResponse);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(OtherBundlesCatalogResponse value) {
                int i2 = 2 % 2;
                int i3 = component3 + 7;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    super.onSuccess(value);
                    ExpiryBundlesViewModel.access$get_otherBundlesData$p(ExpiryBundlesViewModel.this).setValue(Resource.success(value));
                    int i4 = component3 + 89;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                super.onSuccess(value);
                ExpiryBundlesViewModel.access$get_otherBundlesData$p(ExpiryBundlesViewModel.this).setValue(Resource.success(value));
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    ExpiryBundlesViewModel.access$get_otherBundlesData$p(ExpiryBundlesViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ExpiryBundlesViewModel.access$get_otherBundlesData$p(ExpiryBundlesViewModel.this).setValue(Resource.error(e, null));
                int i4 = ShareDataUIState + 43;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = 13 % 2;
    }
}
