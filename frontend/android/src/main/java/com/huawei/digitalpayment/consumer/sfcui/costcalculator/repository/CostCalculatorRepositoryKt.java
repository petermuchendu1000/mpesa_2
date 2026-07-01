package com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository;

import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorHeader;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorLipaCostApiResponse;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorLipaCostBody;
import com.safaricom.consumer.commons.resource.ErrorType;
import com.safaricom.consumer.commons.resource.Resource;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"toLipaTransactionCost", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/LipaTransactionCost;", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostApiResponse;", "fallbackShortCode", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorRepositoryKt {
    private static int ShareDataUIState = 1;
    private static int component3;

    public static final Resource access$toLipaTransactionCost(Resource resource, String str) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            component2(resource, str);
            throw null;
        }
        Resource<LipaTransactionCost> resourceComponent2 = component2(resource, str);
        int i3 = component3 + 83;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return resourceComponent2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Resource<LipaTransactionCost> component2(Resource<CostCalculatorLipaCostApiResponse> resource, String str) {
        CostCalculatorLipaCostBody body;
        String str2;
        String customerMessage;
        int responseCode;
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (!resource.isSuccess()) {
            Resource.Companion companion = Resource.INSTANCE;
            ErrorType.Network.Generic errorType = resource.getErrorType();
            if (errorType == null) {
                errorType = new ErrorType.Network.Generic(null, null, null, null, false, 31, null);
            }
            return companion.error(errorType);
        }
        CostCalculatorLipaCostApiResponse data = resource.getData();
        String responseMessage = null;
        CostCalculatorHeader header = data != null ? data.getHeader() : null;
        if (data != null) {
            int i4 = component3 + 17;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                data.getBody();
                responseMessage.hashCode();
                throw null;
            }
            body = data.getBody();
        } else {
            body = null;
        }
        if (header != null) {
            int i5 = ShareDataUIState + 19;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                responseCode = header.getResponseCode();
                int i6 = 41 / 0;
            } else {
                responseCode = header.getResponseCode();
            }
            if (responseCode == 200) {
                int i7 = ShareDataUIState + 33;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (body != null) {
                    Resource.Companion companion2 = Resource.INSTANCE;
                    String merchantCode = body.getMerchantCode();
                    if (merchantCode != null) {
                        if (StringsKt.isBlank(merchantCode)) {
                            merchantCode = null;
                        } else {
                            int i8 = ShareDataUIState + 67;
                            component3 = i8 % 128;
                            if (i8 % 2 != 0) {
                                throw null;
                            }
                        }
                        if (merchantCode != null) {
                            str = merchantCode;
                        }
                    }
                    String merchantName = body.getMerchantName();
                    if (merchantName == null) {
                        int i9 = ShareDataUIState + 125;
                        component3 = i9 % 128;
                        if (i9 % 2 != 0) {
                            responseMessage.hashCode();
                            throw null;
                        }
                        merchantName = "";
                    }
                    String string = StringsKt.trim(merchantName).toString();
                    String transactionCost = body.getTransactionCost();
                    Resource<LipaTransactionCost> resourceSuccess = companion2.success(new LipaTransactionCost(str, string, StringsKt.trim(transactionCost != null ? transactionCost : "").toString()));
                    int i10 = component3 + 105;
                    ShareDataUIState = i10 % 128;
                    int i11 = i10 % 2;
                    return resourceSuccess;
                }
            }
        }
        Resource.Companion companion3 = Resource.INSTANCE;
        Integer numValueOf = header != null ? Integer.valueOf(header.getResponseCode()) : null;
        if (header == null || (customerMessage = header.getCustomerMessage()) == null) {
            if (header != null) {
                int i12 = ShareDataUIState + 13;
                component3 = i12 % 128;
                if (i12 % 2 != 0) {
                    header.getResponseMessage();
                    throw null;
                }
                responseMessage = header.getResponseMessage();
            }
            str2 = responseMessage;
        } else {
            str2 = customerMessage;
        }
        return companion3.error(new ErrorType.Network.Generic(numValueOf, null, str2, null, false, 26, null));
    }
}
