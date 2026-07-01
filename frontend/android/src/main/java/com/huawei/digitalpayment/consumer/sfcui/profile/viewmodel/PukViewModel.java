package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukPayload;
import com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/PukViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "pukData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/PukResp;", "getPukData", "queryPuk", "", "partA", "", "partB", GriverCacheDao.COLUMN_CACHE_ID, "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PukViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final MutableLiveData<Resource<HaProxyResponse<PukResp>>> component2 = new MutableLiveData<>();

    public static final MutableLiveData access$getPukData$p(PukViewModel pukViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<HaProxyResponse<PukResp>>> mutableLiveData = pukViewModel.component2;
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<HaProxyResponse<PukResp>>> getPukData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<HaProxyResponse<PukResp>>> mutableLiveData = this.component2;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void queryPuk(String partA, String partB, String id) {
        PukPayload pukPayload;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partA, "");
        Intrinsics.checkNotNullParameter(partB, "");
        Intrinsics.checkNotNullParameter(id, "");
        this.component2.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<PukResp>> haProxyRequest = new HaProxyRequest<HaProxyResponse<PukResp>>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 13;
                int i4 = i3 % 128;
                component2 = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 117;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 68 / 0;
                }
                return GsmEndpoints.GSM_GET_PUK;
            }
        };
        if (Intrinsics.areEqual(partA, partB)) {
            PukPayload pukPayload2 = new PukPayload(partA, partB, id);
            int i2 = component3 + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            pukPayload = pukPayload2;
        } else {
            pukPayload = new PukPayload(partA, partB, id);
        }
        haProxyRequest.addParams(pukPayload);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<PukResp>>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(HaProxyResponse<PukResp> haProxyResponse) {
                int i4 = 2 % 2;
                int i5 = component3 + 97;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(haProxyResponse);
                int i7 = component3 + 81;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(HaProxyResponse<PukResp> value) {
                int i4 = 2 % 2;
                int i5 = component2 + 101;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                PukViewModel.access$getPukData$p(PukViewModel.this).setValue(Resource.success(value));
                int i7 = component2 + 109;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i4 = 2 % 2;
                int i5 = component3 + 67;
                component2 = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    PukViewModel.access$getPukData$p(PukViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    PukViewModel.access$getPukData$p(PukViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
    }

    static {
        int i = 1 + 69;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
