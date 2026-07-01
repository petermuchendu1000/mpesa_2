package com.huawei.digitalpayment.consumer.fixeddata.domain.repository;

import com.huawei.digitalpayment.consumer.base.resp.BalancesResponse;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
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
import com.huawei.payment.mvvm.Resource;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u000bH&J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u000eH&J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0011H&J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0014H&J>\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00050\u00040\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H&J\"\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00040\u00032\u0006\u0010\u001e\u001a\u00020\u000eH&J\"\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u00040\u00032\u0006\u0010!\u001a\u00020\"H&J\"\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00040\u00032\u0006\u0010%\u001a\u00020&H&J\"\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010(\u001a\u00020)H&J\"\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010+\u001a\u00020,H&J\"\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020.H&J\"\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u00100\u001a\u000201H&J\"\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u00040\u00032\u0006\u00104\u001a\u00020\u0019H&J\"\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u000206H&J\"\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u000208H&J\"\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00040\u00032\u0006\u0010;\u001a\u00020\u0019H&¨\u0006<"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;", "", "getUserDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;", "payload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetailsPayload;", "getAccountDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetailsPayload;", "getAccountBalances", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalancesPayload;", "preValidateRenewal", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewal;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewalPayload;", "payRenewal", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewal;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewalPayload;", "getProducts", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct;", "estateId", "", "hierarchy", "lastMile", "getFeeQuotation", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;", "fibrePayload", "preValidate", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidation;", "fibrePreValidationPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidationPayload;", LogConstants.Mpm.EndNodeType.PAY, "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePayment;", "fibrePaymentPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePaymentPayload;", "changePlan", "fibreChangePlanPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreChangePlanPayload;", "addProduct", "fibreAddProductPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreAddProductPayload;", "deleteProduct", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreDeleteProductPayload;", "postPay", "fibrePostPayPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/postpay/FibrePostPayPayload;", "getFamilyShareBeneficiaries", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;", "sponsorMsisdn", "addFamilyShareBeneficiary", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddPayload;", "deleteFamilyShareBeneficiary", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareDeletePayload;", "getFamilyShareBalances", "Lcom/huawei/digitalpayment/consumer/base/resp/BalancesResponse;", "msisdn", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FixedDataRepository {
    Flow<Resource<HaProxyResponse<Object>>> addFamilyShareBeneficiary(FamilyShareAddPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> addProduct(FibreAddProductPayload fibreAddProductPayload);

    Flow<Resource<HaProxyResponse<Object>>> changePlan(FibreChangePlanPayload fibreChangePlanPayload);

    Flow<Resource<HaProxyResponse<Object>>> deleteFamilyShareBeneficiary(FamilyShareDeletePayload payload);

    Flow<Resource<HaProxyResponse<Object>>> deleteProduct(FibreDeleteProductPayload payload);

    Flow<Resource<HaProxyResponse<FibreAccountBalances>>> getAccountBalances(FibreAccountBalancesPayload payload);

    Flow<Resource<HaProxyResponse<FibreAccountDetails>>> getAccountDetails(FibreAccountDetailsPayload payload);

    Flow<Resource<HaProxyResponse<BalancesResponse>>> getFamilyShareBalances(String msisdn);

    Flow<Resource<HaProxyResponse<FamilyShareBeneficiaryListResponse>>> getFamilyShareBeneficiaries(String sponsorMsisdn);

    Flow<Resource<HaProxyResponse<FibreFeeQuotation>>> getFeeQuotation(FibreAccountBalancesPayload fibrePayload);

    Flow<Resource<HaProxyResponse<List<FibreProduct>>>> getProducts(String estateId, String hierarchy, String lastMile);

    Flow<Resource<HaProxyResponse<FibreUserDetails>>> getUserDetails(FibreUserDetailsPayload payload);

    Flow<Resource<HaProxyResponse<FibrePayment>>> pay(FibrePaymentPayload fibrePaymentPayload);

    Flow<Resource<HaProxyResponse<FibrePaymentRenewal>>> payRenewal(FibrePaymentRenewalPayload payload);

    Flow<Resource<HaProxyResponse<Object>>> postPay(FibrePostPayPayload fibrePostPayPayload);

    Flow<Resource<HaProxyResponse<FibrePreValidation>>> preValidate(FibrePreValidationPayload fibrePreValidationPayload);

    Flow<Resource<HaProxyResponse<FibrePreValidationRenewal>>> preValidateRenewal(FibrePreValidationRenewalPayload payload);
}
