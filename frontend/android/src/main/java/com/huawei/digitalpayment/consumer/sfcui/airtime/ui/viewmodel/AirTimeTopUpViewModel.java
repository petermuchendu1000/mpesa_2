package com.huawei.digitalpayment.consumer.sfcui.airtime.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.RVEvents;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.airtime.ui.resp.VoucherTopUpPayload;
import com.huawei.digitalpayment.consumer.sfcui.airtime.ui.resp.VoucherTopUpResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleExpiryResp;
import com.huawei.payment.mvvm.Resource;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0006J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/airtime/ui/viewmodel/AirTimeTopUpViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "rechargeData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/BuyBundleExpiryResp;", "scratchCardData", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/sfcui/airtime/ui/resp/VoucherTopUpResponse;", "getScratchCardData", "getRechargeData", "rechargeScratchCard", "", "voucherNumber", "", "rechargedMsisdn", "queryRechargePriceList", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirTimeTopUpViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int getRequestBeneficiariesState = 1;
    private final MutableLiveData<Resource<BuyBundleExpiryResp>> component2 = new MutableLiveData<>();
    private final MutableLiveData<Resource<HaProxyResponse<VoucherTopUpResponse>>> copydefault = new MutableLiveData<>();

    public static final MutableLiveData access$getRechargeData$p(AirTimeTopUpViewModel airTimeTopUpViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BuyBundleExpiryResp>> mutableLiveData = airTimeTopUpViewModel.component2;
        int i5 = i3 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getScratchCardData$p(AirTimeTopUpViewModel airTimeTopUpViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<HaProxyResponse<VoucherTopUpResponse>>> mutableLiveData = airTimeTopUpViewModel.copydefault;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<HaProxyResponse<VoucherTopUpResponse>>> getScratchCardData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final MutableLiveData<Resource<BuyBundleExpiryResp>> getRechargeData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BuyBundleExpiryResp>> mutableLiveData = this.component2;
        int i5 = i2 + 65;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void rechargeScratchCard(String voucherNumber, String rechargedMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(voucherNumber, "");
        Intrinsics.checkNotNullParameter(rechargedMsisdn, "");
        this.copydefault.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<VoucherTopUpResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<VoucherTopUpResponse>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 97;
                int i4 = i3 % 128;
                component1 = i4;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 43;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return GsmEndpoints.GSM_VOUCHER_TOP_UP;
                }
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.addParams(new VoucherTopUpPayload(rechargedMsisdn, voucherNumber));
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<VoucherTopUpResponse>>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(HaProxyResponse<VoucherTopUpResponse> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(HaProxyResponse<VoucherTopUpResponse> value) {
                int i2 = 2 % 2;
                int i3 = component1 + 13;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                AirTimeTopUpViewModel.access$getScratchCardData$p(AirTimeTopUpViewModel.this).setValue(Resource.success(value));
                int i5 = component1 + 81;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 117;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    AirTimeTopUpViewModel.access$getScratchCardData$p(AirTimeTopUpViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    AirTimeTopUpViewModel.access$getScratchCardData$p(AirTimeTopUpViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 14 / 0;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/airtime/ui/viewmodel/AirTimeTopUpViewModel$queryRechargePriceList$1", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/BuyBundleExpiryResp;", "onSuccess", "", "value", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements ApiCallback<BuyBundleExpiryResp> {
        public static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2;
        public static int component3;

        AnonymousClass1() {
        }

        @Override
        public void onSuccess(BuyBundleExpiryResp buyBundleExpiryResp) {
            int i = 2 % 2;
            int i2 = component1 + 71;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            onSuccess2(buyBundleExpiryResp);
            if (i3 != 0) {
                throw null;
            }
            int i4 = component2 + 3;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void onSuccess2(BuyBundleExpiryResp value) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                AirTimeTopUpViewModel.access$getRechargeData$p(AirTimeTopUpViewModel.this).setValue(Resource.success(value));
                int i3 = 53 / 0;
            } else {
                AirTimeTopUpViewModel.access$getRechargeData$p(AirTimeTopUpViewModel.this).setValue(Resource.success(value));
            }
            int i4 = component1 + 73;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override
        public void onError(BaseException e) {
            int i = 2 % 2;
            int i2 = component2 + 5;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(e, "");
                AirTimeTopUpViewModel.access$getRechargeData$p(AirTimeTopUpViewModel.this).setValue(Resource.error(e, null));
            } else {
                Intrinsics.checkNotNullParameter(e, "");
                AirTimeTopUpViewModel.access$getRechargeData$p(AirTimeTopUpViewModel.this).setValue(Resource.error(e, null));
                throw null;
            }
        }

        public static int ShareDataUIState() {
            int i = ShareDataUIState;
            int i2 = i % 9184301;
            ShareDataUIState = i + 1;
            if (i2 != 0) {
                return component3;
            }
            int iNextInt = new Random().nextInt();
            component3 = iNextInt;
            return iNextInt;
        }
    }

    public final void queryRechargePriceList() {
        int i = 2 % 2;
        this.component2.setValue(Resource.loading(null));
        sendRequest(new PaymentRequest<BuyBundleExpiryResp>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 87;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "rechargePriceList";
                }
                int i4 = 27 / 0;
                return "rechargePriceList";
            }
        }, new AnonymousClass1());
        int i2 = component3 + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 1 + 23;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
