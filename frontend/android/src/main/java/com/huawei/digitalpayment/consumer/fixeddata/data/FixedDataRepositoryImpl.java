package com.huawei.digitalpayment.consumer.fixeddata.data;

import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.BalancesResponse;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.fixeddata.constant.Endpoints;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalances;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalancesPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreAddProductPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreChangePlanPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreDeleteProductPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreFeeQuotation;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePayment;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidationPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareAddPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiaryListResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareDeletePayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal.FibrePaymentRenewal;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal.FibrePaymentRenewalPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.postpay.FibrePostPayPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewalPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.FibreUserDetails;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.FibreUserDetailsPayload;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0017H\u0016J>\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\b0\u00070\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016J\"\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b0\u00070\u00062\u0006\u0010!\u001a\u00020\u0011H\u0016J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\b0\u00070\u00062\u0006\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u00070\u00062\u0006\u0010(\u001a\u00020)H\u0016J\"\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u0010,\u001a\u00020-H\u0016J\"\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u0010/\u001a\u000200H\u0016J\"\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u0010\n\u001a\u000202H\u0016J\"\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u00104\u001a\u000205H\u0016J\"\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\b0\u00070\u00062\u0006\u00108\u001a\u00020\u001cH\u0016J\"\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020:H\u0016J\"\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020<H\u0016J\"\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\b0\u00070\u00062\u0006\u0010?\u001a\u00020\u001cH\u0016¨\u0006@"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/FixedDataRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "getUserDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;", "payload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetailsPayload;", "getAccountDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetailsPayload;", "getAccountBalances", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalancesPayload;", "preValidateRenewal", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewal;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewalPayload;", "payRenewal", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewal;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewalPayload;", "getProducts", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct;", "estateId", "", "hierarchy", "lastMile", "getFeeQuotation", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;", "fibrePayload", "preValidate", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidation;", "fibrePreValidationPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidationPayload;", LogConstants.Mpm.EndNodeType.PAY, "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePayment;", "fibrePaymentPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePaymentPayload;", "changePlan", "", "fibreChangePlanPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreChangePlanPayload;", "addProduct", "fibreAddProductPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreAddProductPayload;", "deleteProduct", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreDeleteProductPayload;", "postPay", "fibrePostPayPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/postpay/FibrePostPayPayload;", "getFamilyShareBeneficiaries", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;", "sponsorMsisdn", "addFamilyShareBeneficiary", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddPayload;", "deleteFamilyShareBeneficiary", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareDeletePayload;", "getFamilyShareBalances", "Lcom/huawei/digitalpayment/consumer/base/resp/BalancesResponse;", "msisdn", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataRepositoryImpl implements FixedDataRepository, BaseModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 9 % 128;
    private static int copydefault = 1;

    @Inject
    public FixedDataRepositoryImpl() {
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibreUserDetails>>> getUserDetails(FibreUserDetailsPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<FibreUserDetails>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibreUserDetails>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 41;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 85;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                }
                return Endpoints.HOME_USER_DETAILS;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibreUserDetails>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("msisdn", payload.getMsisdn());
        Flow<Resource<HaProxyResponse<FibreUserDetails>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibreAccountDetails>>> getAccountDetails(FibreAccountDetailsPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<FibreAccountDetails>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibreAccountDetails>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 17;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return Endpoints.HOME_ACCOUNT_DETAILS;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibreAccountDetails>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("accountId", payload.getAccountId());
        Flow<Resource<HaProxyResponse<FibreAccountDetails>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibreAccountBalances>>> getAccountBalances(FibreAccountBalancesPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<FibreAccountBalances>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibreAccountBalances>>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return Endpoints.HOME_ACCOUNT_BALANCES;
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibreAccountBalances>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<FibreAccountBalances>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibrePreValidationRenewal>>> preValidateRenewal(FibrePreValidationRenewalPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<FibrePreValidationRenewal>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibrePreValidationRenewal>>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 41;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.HOME_PREVALIDATION_RENEWAL;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibrePreValidationRenewal>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<FibrePreValidationRenewal>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibrePaymentRenewal>>> payRenewal(FibrePaymentRenewalPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<FibrePaymentRenewal>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibrePaymentRenewal>>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 67;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return Endpoints.HOME_PAYMENT_RENEWAL;
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibrePaymentRenewal>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<FibrePaymentRenewal>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return flowSendRequestFlow;
        }
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<List<FibreProduct>>>> getProducts(String estateId, String hierarchy, String lastMile) {
        int i = 2 % 2;
        HaProxyRequest<HaProxyResponse<List<? extends FibreProduct>>> haProxyRequest = new HaProxyRequest<HaProxyResponse<List<? extends FibreProduct>>>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 99;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 119;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 78 / 0;
                }
                return Endpoints.HOME_PRODUCTS;
            }
        };
        haProxyRequest.method(BaseRequest.Method.GET);
        HaProxyRequest<HaProxyResponse<List<? extends FibreProduct>>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("estateId", estateId);
        haProxyRequest.addParams("hierarchy", hierarchy);
        haProxyRequest.addParams("lastMile", lastMile);
        Flow<Resource<HaProxyResponse<List<FibreProduct>>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibreFeeQuotation>>> getFeeQuotation(FibreAccountBalancesPayload fibrePayload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fibrePayload, "");
        HaProxyRequest<HaProxyResponse<FibreFeeQuotation>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibreFeeQuotation>>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 75;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return Endpoints.HOME_FEE_QUOTATION;
                }
                int i4 = 10 / 0;
                return Endpoints.HOME_FEE_QUOTATION;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibreFeeQuotation>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(fibrePayload);
        Flow<Resource<HaProxyResponse<FibreFeeQuotation>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibrePreValidation>>> preValidate(FibrePreValidationPayload fibrePreValidationPayload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fibrePreValidationPayload, "");
        HaProxyRequest<HaProxyResponse<FibrePreValidation>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibrePreValidation>>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 41;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 101;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return Endpoints.HOME_PREVALIDATION;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibrePreValidation>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(fibrePreValidationPayload);
        Flow<Resource<HaProxyResponse<FibrePreValidation>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FibrePayment>>> pay(FibrePaymentPayload fibrePaymentPayload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fibrePaymentPayload, "");
        HaProxyRequest<HaProxyResponse<FibrePayment>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FibrePayment>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 5;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 79;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.HOME_PAYMENT;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<FibrePayment>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(fibrePaymentPayload);
        Flow<Resource<HaProxyResponse<FibrePayment>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> changePlan(FibreChangePlanPayload fibreChangePlanPayload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fibreChangePlanPayload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return Endpoints.HOME_CHANGE_PLAN;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(fibreChangePlanPayload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> addProduct(FibreAddProductPayload fibreAddProductPayload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fibreAddProductPayload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 63;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 5;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.HOME_ADD_PRODUCT;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(fibreAddProductPayload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> deleteProduct(FibreDeleteProductPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 35;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 67;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return Endpoints.HOME_DELETE_PRODUCT;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> postPay(FibrePostPayPayload fibrePostPayPayload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fibrePostPayPayload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 73;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 81;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return Endpoints.HOME_POSTPAY;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(fibrePostPayPayload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return flowSendRequestFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Flow<Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>>> getFamilyShareBeneficiaries(String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        HaProxyRequest<HaProxyResponse<FamilyShareBeneficiaryListResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<FamilyShareBeneficiaryListResponse>>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 51;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 67;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 28 / 0;
                }
                return Endpoints.HOME_FAMILY_SHARE_LIST_BENEFICIARIES;
            }
        };
        haProxyRequest.method(BaseRequest.Method.GET);
        HaProxyRequest<HaProxyResponse<FamilyShareBeneficiaryListResponse>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        Flow<Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> addFamilyShareBeneficiary(FamilyShareAddPayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 65;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 79 / 0;
                }
                int i6 = i3 + 73;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return Endpoints.HOME_FAMILY_SHARE_ADD_BENEFICIARY;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<Object>>> deleteFamilyShareBeneficiary(FamilyShareDeletePayload payload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 97;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 119;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return Endpoints.HOME_FAMILY_SHARE_DELETE_BENEFICIARY;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(payload);
        Flow<Resource<HaProxyResponse<Object>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return flowSendRequestFlow;
    }

    @Override
    public Flow<Resource<HaProxyResponse<BalancesResponse>>> getFamilyShareBalances(String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        HaProxyRequest<HaProxyResponse<BalancesResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<BalancesResponse>>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 99;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 15;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return GsmEndpoints.GSM_BALANCES;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<HaProxyResponse<BalancesResponse>> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("serviceIdentifier", msisdn);
        haProxyRequest.addParams("serviceIdentifierType", "MSISDN");
        Flow<Resource<HaProxyResponse<BalancesResponse>>> flowSendRequestFlow = SendRequestFlowKt.sendRequestFlow(haProxyRequest2);
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return flowSendRequestFlow;
    }

    static {
        int i = 9 % 2;
    }
}
