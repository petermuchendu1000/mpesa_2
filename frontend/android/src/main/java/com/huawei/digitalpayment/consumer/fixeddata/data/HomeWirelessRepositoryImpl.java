package com.huawei.digitalpayment.consumer.fixeddata.data;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.fixeddata.constant.Endpoints;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GAutoRenewOptOutPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetAccountDetailPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetAccountDetailResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GPaymentPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home5GGetPlansResponse;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.HomeWirelessRepository;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0016J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0016J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/HomeWirelessRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/HomeWirelessRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "getHome4G5GAccountDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountDetailResponse;", "payload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountDetailPayload;", "getHome4G5GPlans", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home5GGetPlansResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetPlansPayload;", "home4G5GMpesaPayment", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GPaymentPayload;", "home4G5GPostPayPayment", "home4G5GEnoughBalPayment", "home4G5GAutoRenewOptOut", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GAutoRenewOptOutPayload;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeWirelessRepositoryImpl implements HomeWirelessRepository, BaseModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 3 % 128;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @Inject
    public HomeWirelessRepositoryImpl() {
    }

    @Override
    public Flow<Resource<HaProxyResponse<Home4G5GGetAccountDetailResponse>>> getHome4G5GAccountDetails(Home4G5GGetAccountDetailPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Home4G5GGetAccountDetailResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Home4G5GGetAccountDetailResponse>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 11;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 115;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return Endpoints.HOME_4G_5G_ACCOUNT_DETAILS;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Home4G5GGetAccountDetailResponse>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Home4G5GGetAccountDetailResponse>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<List<Home5GGetPlansResponse>>>> getHome4G5GPlans(Home4G5GGetPlansPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<List<? extends Home5GGetPlansResponse>>> haProxyRequest = new HaProxyRequest<HaProxyResponse<List<? extends Home5GGetPlansResponse>>>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 89;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return Endpoints.HOME_4G_5G_PLANS;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<List<? extends Home5GGetPlansResponse>>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<List<Home5GGetPlansResponse>>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> home4G5GMpesaPayment(Home4G5GPaymentPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 9;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return Endpoints.HOME_4G_5G_MPESA_PAYMENT;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> home4G5GPostPayPayment(Home4G5GPaymentPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 35;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 65;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.HOME_4G_5G_POSTPAY_PAYMENT;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> home4G5GEnoughBalPayment(Home4G5GPaymentPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return Endpoints.HOME_4G_5G_ENOUGH_BAL_PAYMENT;
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> home4G5GAutoRenewOptOut(Home4G5GAutoRenewOptOutPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 61;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 93;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return Endpoints.HOME_4G_5G_AUTORENEW_OPTOUT;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return flowSendRequestFlow;
    }

    static {
        if (3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
