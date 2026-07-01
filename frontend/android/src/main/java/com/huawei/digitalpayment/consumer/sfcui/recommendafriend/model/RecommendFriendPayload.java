package com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0004H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/RecommendFriendPayload;", "", "recommendeeMsisdn", "", "", "recommenderMsisdn", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRecommendeeMsisdn", "()Ljava/util/List;", "getRecommenderMsisdn", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendFriendPayload {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int getRequestBeneficiariesState = 1;

    @SerializedName("recommendeeMsisdn")
    private final List<String> ShareDataUIState;

    @SerializedName("recommenderMsisdn")
    private final String copydefault;

    public RecommendFriendPayload(List<String> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.ShareDataUIState = list;
        this.copydefault = str;
    }

    public final List<String> getRecommendeeMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.ShareDataUIState;
        int i5 = i2 + 97;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getRecommenderMsisdn() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 69;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RecommendFriendPayload copy$default(RecommendFriendPayload recommendFriendPayload, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 27;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            list = recommendFriendPayload.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str = recommendFriendPayload.copydefault;
            int i5 = i4 + 101;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return recommendFriendPayload.copy(list, str);
    }

    public final List<String> component1() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 73;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final RecommendFriendPayload copy(List<String> recommendeeMsisdn, String recommenderMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recommendeeMsisdn, "");
        Intrinsics.checkNotNullParameter(recommenderMsisdn, "");
        RecommendFriendPayload recommendFriendPayload = new RecommendFriendPayload(recommendeeMsisdn, recommenderMsisdn);
        int i2 = getRequestBeneficiariesState + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return recommendFriendPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r1 = r1 + 119;
        com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.getRequestBeneficiariesState + 37;
        com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.getRequestBeneficiariesState + 49;
        com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 33;
        com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.getRequestBeneficiariesState
            int r2 = r1 + 45
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 66
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 33
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload
            if (r2 != 0) goto L2c
            int r1 = r1 + 119
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r6
            int r1 = r1 % r0
            return r4
        L2c:
            com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload r6 = (com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload) r6
            java.util.List<java.lang.String> r1 = r5.ShareDataUIState
            java.util.List<java.lang.String> r2 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L42
            int r6 = com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.getRequestBeneficiariesState
            int r6 = r6 + 37
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r1
            int r6 = r6 % r0
            return r4
        L42:
            java.lang.String r1 = r5.copydefault
            java.lang.String r6 = r6.copydefault
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 == 0) goto L4d
            return r3
        L4d:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.getRequestBeneficiariesState
            int r6 = r6 + 49
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.component2 = r1
            int r6 = r6 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model.RecommendFriendPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.ShareDataUIState.hashCode() >> 17) >>> this.copydefault.hashCode() : (this.ShareDataUIState.hashCode() * 31) + this.copydefault.hashCode();
        int i3 = component2 + 123;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecommendFriendPayload(recommendeeMsisdn=" + this.ShareDataUIState + ", recommenderMsisdn=" + this.copydefault + ")";
        int i2 = component2 + 71;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
