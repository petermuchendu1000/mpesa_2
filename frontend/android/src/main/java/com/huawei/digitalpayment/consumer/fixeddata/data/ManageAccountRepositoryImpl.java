package com.huawei.digitalpayment.consumer.fixeddata.data;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.fixeddata.constant.Endpoints;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.ChangeWifiNamePayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.ChangeWifiPasswordPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.FetchProfilesPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.RestartRouterPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.WifiProfileResponse;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.ManageAccountRepository;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/ManageAccountRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/ManageAccountRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "fetchWifiProfile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/WifiProfileResponse;", "payload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/FetchProfilesPayload;", "restartRouter", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/RestartRouterPayload;", "changeWifiName", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/ChangeWifiNamePayload;", "changeWifiPassword", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/ChangeWifiPasswordPayload;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManageAccountRepositoryImpl implements ManageAccountRepository, BaseModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 93 % 128;
    private static int component3;
    private static int copydefault;

    @Inject
    public ManageAccountRepositoryImpl() {
    }

    @Override
    public Flow<Resource<HaProxyResponse<WifiProfileResponse>>> fetchWifiProfile(FetchProfilesPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<WifiProfileResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<WifiProfileResponse>>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 23;
                copydefault = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 95;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return Endpoints.MANAGE_ACCOUNT_FETCH_PROFILES;
                }
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<WifiProfileResponse>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<WifiProfileResponse>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> restartRouter(RestartRouterPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 113;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 65;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.MANAGE_ACCOUNT_RESET_LINK;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> changeWifiName(ChangeWifiNamePayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 125;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return Endpoints.MANAGE_ACCOUNT_CHANGE_WIFI_NAME;
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
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> changeWifiPassword(ChangeWifiPasswordPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 17;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.MANAGE_ACCOUNT_CHANGE_WIFI_PASSWORD;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    static {
        int i = 93 % 2;
    }
}
