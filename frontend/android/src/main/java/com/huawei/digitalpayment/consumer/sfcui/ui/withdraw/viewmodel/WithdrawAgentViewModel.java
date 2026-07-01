package com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.constants.PayTradeTypeEnum;
import com.huawei.digitalpayment.consumer.base.util.AppFabricRequest;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.GeoFenceBean;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyCashOutResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/withdraw/viewmodel/WithdrawAgentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "verifyData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/VerifyCashOutResp;", "geoFenceData", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/GeoFenceBean;", "getVerifyData", "getGeoFenceData", "verifyCashOut", "", "agentNumber", "", "requesterShortCode", "queryGeoFence", KeysConstants.SHORT_CODE, "receiverTillNo", com.huawei.digitalpayment.consumer.base.constants.KeysConstants.KEY_STORE_NUMBER, "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithdrawAgentViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private final MutableLiveData<Resource<VerifyCashOutResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<GeoFenceBean>> component3 = new MutableLiveData<>();

    public static final MutableLiveData access$getGeoFenceData$p(WithdrawAgentViewModel withdrawAgentViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<GeoFenceBean>> mutableLiveData = withdrawAgentViewModel.component3;
        int i5 = i3 + 67;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getVerifyData$p(WithdrawAgentViewModel withdrawAgentViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<VerifyCashOutResp>> mutableLiveData = withdrawAgentViewModel.component1;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<VerifyCashOutResp>> getVerifyData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyCashOutResp>> mutableLiveData = this.component1;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<GeoFenceBean>> getGeoFenceData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<GeoFenceBean>> mutableLiveData = this.component3;
        int i5 = i2 + 91;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final void verifyCashOut(String agentNumber, String requesterShortCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(agentNumber, "");
        Intrinsics.checkNotNullParameter(requesterShortCode, "");
        this.component1.setValue(Resource.loading(null));
        PaymentRequest<VerifyCashOutResp> paymentRequest = new PaymentRequest<VerifyCashOutResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 109;
                int i4 = i3 % 128;
                component2 = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 65;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 43 / 0;
                }
                return "verifyCashOut";
            }
        };
        paymentRequest.addParams("receiverTillNo", agentNumber);
        paymentRequest.addParams("requesterShortCode", requesterShortCode);
        paymentRequest.addParams("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType());
        sendRequest(paymentRequest, new ApiCallback<VerifyCashOutResp>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(VerifyCashOutResp verifyCashOutResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 21;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(verifyCashOutResp);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(VerifyCashOutResp value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 47;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                WithdrawAgentViewModel.access$getVerifyData$p(WithdrawAgentViewModel.this).setValue(Resource.success(value));
                if (i4 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 115;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                WithdrawAgentViewModel.access$getVerifyData$p(WithdrawAgentViewModel.this).setValue(Resource.error(e, null));
                int i5 = copydefault + 57;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void queryGeoFence(String shortCode, String receiverTillNo, String storeNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shortCode, "");
        Intrinsics.checkNotNullParameter(receiverTillNo, "");
        Intrinsics.checkNotNullParameter(storeNumber, "");
        this.component3.setValue(Resource.loading(null));
        AppFabricRequest<GeoFenceBean> appFabricRequest = new AppFabricRequest<GeoFenceBean>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 121;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 9;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "/MiniappToPayment/v1/vasGeo/queryGeoFence";
            }
        };
        appFabricRequest.addParams("method", "post");
        appFabricRequest.addParams("appType", RegisterKycParamsKt.REGISTER_CODE);
        appFabricRequest.addParams("receiverTillNo", receiverTillNo);
        appFabricRequest.addParams(KeysConstants.SHORT_CODE, shortCode);
        appFabricRequest.addParams(com.huawei.digitalpayment.consumer.base.constants.KeysConstants.KEY_STORE_NUMBER, storeNumber);
        appFabricRequest.addParams("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType());
        sendRequest(appFabricRequest, new ApiCallback<GeoFenceBean>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(GeoFenceBean geoFenceBean) {
                int i2 = 2 % 2;
                int i3 = copydefault + 7;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(geoFenceBean);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = copydefault + 51;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.digitalpayment.consumer.sfcui.ui.resp.GeoFenceBean r5) {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.AnonymousClass1.copydefault
                    int r1 = r1 + 85
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.AnonymousClass1.component1 = r2
                    int r1 = r1 % r0
                    r3 = 0
                    if (r1 == 0) goto L16
                    r1 = 94
                    int r1 = r1 / 0
                    if (r5 == 0) goto L2a
                    goto L18
                L16:
                    if (r5 == 0) goto L2a
                L18:
                    int r2 = r2 + 1
                    int r1 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.AnonymousClass1.copydefault = r1
                    int r2 = r2 % r0
                    if (r2 == 0) goto L26
                    java.lang.String r0 = r5.getResultCode()
                    goto L2b
                L26:
                    r5.getResultCode()
                    throw r3
                L2a:
                    r0 = r3
                L2b:
                    java.lang.String r1 = "0"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L41
                    com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel r0 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.access$getGeoFenceData$p(r0)
                    com.huawei.payment.mvvm.Resource r5 = com.huawei.payment.mvvm.Resource.success(r5)
                    r0.setValue(r5)
                    goto L63
                L41:
                    com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel r0 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.access$getGeoFenceData$p(r0)
                    if (r5 == 0) goto L4e
                    java.lang.String r1 = r5.getResultCode()
                    goto L4f
                L4e:
                    r1 = r3
                L4f:
                    if (r5 == 0) goto L56
                    java.lang.String r5 = r5.getResultDesc()
                    goto L57
                L56:
                    r5 = r3
                L57:
                    com.huawei.common.exception.BaseException r2 = new com.huawei.common.exception.BaseException
                    r2.<init>(r1, r5)
                    com.huawei.payment.mvvm.Resource r5 = com.huawei.payment.mvvm.Resource.error(r2, r3)
                    r0.setValue(r5)
                L63:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.viewmodel.WithdrawAgentViewModel.AnonymousClass1.onSuccess2(com.huawei.digitalpayment.consumer.sfcui.ui.resp.GeoFenceBean):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 53;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    WithdrawAgentViewModel.access$getGeoFenceData$p(WithdrawAgentViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    WithdrawAgentViewModel.access$getGeoFenceData$p(WithdrawAgentViewModel.this).setValue(Resource.error(e, null));
                    throw null;
                }
            }
        });
        int i2 = getAsAtTimestamp + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 1 + 77;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
