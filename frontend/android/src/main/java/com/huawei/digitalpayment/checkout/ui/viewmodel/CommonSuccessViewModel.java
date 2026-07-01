package com.huawei.digitalpayment.checkout.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.cube.BaseCubeRequest;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/checkout/ui/viewmodel/CommonSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "createData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/http/BaseResp;", "reverseData", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/CubeBaseResp;", "getCreateData", "getReverseData", "addFavourite", "", "serviceType", "", "favoriteCategory", "favoriteContent", "reverseTransaction", DisPlayItems.TRANSACTION_ID, "categoryDisplay", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonSuccessViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 115 % 128;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private final MutableLiveData<Resource<BaseResp>> component2 = new MutableLiveData<>();
    private final MutableLiveData<Resource<CubeBaseResp>> ShareDataUIState = new MutableLiveData<>();

    public static final MutableLiveData access$getCreateData$p(CommonSuccessViewModel commonSuccessViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = commonSuccessViewModel.component2;
        if (i3 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public static final MutableLiveData access$getReverseData$p(CommonSuccessViewModel commonSuccessViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<CubeBaseResp>> mutableLiveData = commonSuccessViewModel.ShareDataUIState;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BaseResp>> getCreateData() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component2;
        int i5 = i2 + 15;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<CubeBaseResp>> getReverseData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<CubeBaseResp>> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void addFavourite(String serviceType, String favoriteCategory, String favoriteContent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        Intrinsics.checkNotNullParameter(favoriteCategory, "");
        Intrinsics.checkNotNullParameter(favoriteContent, "");
        this.component2.setValue(Resource.loading(null));
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 27;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "createFavorite";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams("serviceType", serviceType);
        paymentRequest.addParams("favoriteCategory", favoriteCategory);
        paymentRequest.addParams("favoriteContent", favoriteContent);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 27;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                int i5 = component2 + 125;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                int i3 = component3 + 21;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                CommonSuccessViewModel.access$getCreateData$p(CommonSuccessViewModel.this).setValue(Resource.success(value));
                int i5 = component2 + 53;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 69;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                Object obj = null;
                CommonSuccessViewModel.access$getCreateData$p(CommonSuccessViewModel.this).setValue(Resource.error(e, null));
                int i5 = component3 + 17;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component1 + 23;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void reverseTransaction(String transactionId, String categoryDisplay) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionId, "");
        Intrinsics.checkNotNullParameter(categoryDisplay, "");
        this.ShareDataUIState.setValue(Resource.loading(null));
        BaseCubeRequest<CubeBaseResp> baseCubeRequest = new BaseCubeRequest<CubeBaseResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 3;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 121;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "/service/CubeServerAsset__Foundation/1.0.0/money/reverse";
            }
        };
        baseCubeRequest.addParams("mpesaId", transactionId);
        baseCubeRequest.addParams("smsMessage", categoryDisplay);
        baseCubeRequest.sendRequest((ApiCallback) new ApiCallback<CubeBaseResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(CubeBaseResp cubeBaseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(cubeBaseResp);
                int i5 = copydefault + 91;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(CubeBaseResp value) {
                int i2 = 2 % 2;
                int i3 = component1 + 9;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                CommonSuccessViewModel.access$getReverseData$p(CommonSuccessViewModel.this).setValue(Resource.success(value));
                int i5 = copydefault + 103;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 119;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    CommonSuccessViewModel.access$getReverseData$p(CommonSuccessViewModel.this).setValue(Resource.error(e, null));
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                CommonSuccessViewModel.access$getReverseData$p(CommonSuccessViewModel.this).setValue(Resource.error(e, null));
                int i4 = copydefault + 79;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component1 + 69;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
    }

    static {
        if (115 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
