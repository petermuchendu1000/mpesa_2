package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\f\u0010\r\u001a\u00020\b*\u00020\u0001H\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"amountAllocated", "", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BeneficiaryResponse;", "getAmountAllocated", "(Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BeneficiaryResponse;)Ljava/lang/String;", "beneficiaryMsisdn", "getBeneficiaryMsisdn", "dataAmount", "", "getDataAmount", "(Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BeneficiaryResponse;)D", "dataAllocated", "getDataAllocated", "safeToDouble", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BeneficiaryResponseKt {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    public static final double access$safeToDouble(String str) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        double dComponent3 = component3(str);
        int i4 = component3 + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dComponent3;
    }

    public static final String getAmountAllocated(BeneficiaryResponse beneficiaryResponse) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
            return beneficiaryResponse.getLimitValue();
        }
        Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
        beneficiaryResponse.getLimitValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String getBeneficiaryMsisdn(BeneficiaryResponse beneficiaryResponse) {
        String msisdn;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
            msisdn = beneficiaryResponse.getMsisdn();
            int i3 = 68 / 0;
        } else {
            Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
            msisdn = beneficiaryResponse.getMsisdn();
        }
        int i4 = ShareDataUIState + 123;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return msisdn;
        }
        throw null;
    }

    public static final double getDataAmount(BeneficiaryResponse beneficiaryResponse) {
        double dComponent3;
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
            dComponent3 = component3(beneficiaryResponse.getLimitValue());
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
            dComponent3 = component3(beneficiaryResponse.getLimitValue());
        }
        int i4 = component3 + 97;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return dComponent3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final double getDataAllocated(BeneficiaryResponse beneficiaryResponse) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
            component3(beneficiaryResponse.getLimitValue());
            throw null;
        }
        Intrinsics.checkNotNullParameter(beneficiaryResponse, "");
        double dComponent3 = component3(beneficiaryResponse.getLimitValue());
        int i3 = component3 + 105;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return dComponent3;
        }
        obj.hashCode();
        throw null;
    }

    private static final double component3(String str) {
        double d2;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            d2 = Double.parseDouble(str);
        } catch (Exception unused) {
            d2 = 0.0d;
        }
        int i4 = ShareDataUIState + 103;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return d2;
    }
}
