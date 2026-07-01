package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/AiPayResponse;", "", "accountNumber", "", "agentNumber", "amount", "businessName", "paybillNumber", "paymentType", "pochiLaBiashara", "receiverMSISDN", KeysConstants.KEY_STORE_NUMBER, "tillNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getAgentNumber", "getAmount", "getBusinessName", "getPaybillNumber", "getPaymentType", "getPochiLaBiashara", "getReceiverMSISDN", "getStoreNumber", "getTillNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AiPayResponse {
    private static int component1 = 1;
    private static int component3;
    private final String accountNumber;
    private final String agentNumber;
    private final String amount;
    private final String businessName;
    private final String paybillNumber;
    private final String paymentType;
    private final String pochiLaBiashara;
    private final String receiverMSISDN;
    private final String storeNumber;
    private final String tillNumber;

    public AiPayResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.accountNumber = str;
        this.agentNumber = str2;
        this.amount = str3;
        this.businessName = str4;
        this.paybillNumber = str5;
        this.paymentType = str6;
        this.pochiLaBiashara = str7;
        this.receiverMSISDN = str8;
        this.storeNumber = str9;
        this.tillNumber = str10;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAgentNumber() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.agentNumber;
        int i5 = i3 + 35;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBusinessName() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.businessName;
        int i5 = i3 + 49;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final String getPaybillNumber() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paybillNumber;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPaymentType() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paymentType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPochiLaBiashara() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.pochiLaBiashara;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String getReceiverMSISDN() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.receiverMSISDN;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final String getStoreNumber() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.storeNumber;
        int i4 = i2 + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getTillNumber() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tillNumber;
        int i5 = i2 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static AiPayResponse copy$default(AiPayResponse aiPayResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11;
        String str12;
        String str13;
        int i2 = 2 % 2;
        String str14 = (i & 1) != 0 ? aiPayResponse.accountNumber : str;
        if ((i & 2) != 0) {
            int i3 = component3 + 11;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str11 = aiPayResponse.agentNumber;
        } else {
            str11 = str2;
        }
        String str15 = (i & 4) != 0 ? aiPayResponse.amount : str3;
        String str16 = (i & 8) != 0 ? aiPayResponse.businessName : str4;
        if ((i & 16) != 0) {
            int i5 = component3 + 27;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                String str17 = aiPayResponse.paybillNumber;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str12 = aiPayResponse.paybillNumber;
        } else {
            str12 = str5;
        }
        String str18 = (i & 32) != 0 ? aiPayResponse.paymentType : str6;
        String str19 = (i & 64) != 0 ? aiPayResponse.pochiLaBiashara : str7;
        String str20 = (i & 128) != 0 ? aiPayResponse.receiverMSISDN : str8;
        if ((i & 256) != 0) {
            str13 = aiPayResponse.storeNumber;
            int i6 = component1 + 73;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str13 = str9;
        }
        return aiPayResponse.copy(str14, str11, str15, str16, str12, str18, str19, str20, str13, (i & 512) != 0 ? aiPayResponse.tillNumber : str10);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tillNumber;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.agentNumber;
            int i4 = 16 / 0;
        } else {
            str = this.agentNumber;
        }
        int i5 = i3 + 3;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.businessName;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.paybillNumber;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.paymentType;
        int i5 = i3 + 95;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pochiLaBiashara;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.receiverMSISDN;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.storeNumber;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AiPayResponse copy(String accountNumber, String agentNumber, String amount, String businessName, String paybillNumber, String paymentType, String pochiLaBiashara, String receiverMSISDN, String storeNumber, String tillNumber) {
        int i = 2 % 2;
        AiPayResponse aiPayResponse = new AiPayResponse(accountNumber, agentNumber, amount, businessName, paybillNumber, paymentType, pochiLaBiashara, receiverMSISDN, storeNumber, tillNumber);
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return aiPayResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AiPayResponse)) {
            return false;
        }
        AiPayResponse aiPayResponse = (AiPayResponse) other;
        if (!Intrinsics.areEqual(this.accountNumber, aiPayResponse.accountNumber)) {
            int i4 = component1 + 53;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.agentNumber, aiPayResponse.agentNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, aiPayResponse.amount)) {
            int i6 = component3 + 121;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.businessName, aiPayResponse.businessName)) {
            int i7 = component1 + 53;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paybillNumber, aiPayResponse.paybillNumber) || !Intrinsics.areEqual(this.paymentType, aiPayResponse.paymentType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.pochiLaBiashara, aiPayResponse.pochiLaBiashara)) {
            int i9 = component1 + 11;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.receiverMSISDN, aiPayResponse.receiverMSISDN)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.storeNumber, aiPayResponse.storeNumber)) {
            int i11 = component3 + 69;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.tillNumber, aiPayResponse.tillNumber)) {
            return true;
        }
        int i13 = component1 + 69;
        component3 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.accountNumber;
        if (str == null) {
            int i5 = i3 + 75;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.agentNumber;
        if (str2 == null) {
            int i7 = component1 + 87;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.amount;
        if (str3 == null) {
            int i9 = component3 + 39;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.businessName;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.paybillNumber;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.paymentType;
        if (str6 == null) {
            int i11 = component3 + 95;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str6.hashCode();
            int i13 = component3 + 41;
            component1 = i13 % 128;
            int i14 = i13 % 2;
        }
        String str7 = this.pochiLaBiashara;
        if (str7 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = str7.hashCode();
            int i15 = component1 + 89;
            component3 = i15 % 128;
            int i16 = i15 % 2;
        }
        String str8 = this.receiverMSISDN;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.storeNumber;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tillNumber;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AiPayResponse(accountNumber=" + this.accountNumber + ", agentNumber=" + this.agentNumber + ", amount=" + this.amount + ", businessName=" + this.businessName + ", paybillNumber=" + this.paybillNumber + ", paymentType=" + this.paymentType + ", pochiLaBiashara=" + this.pochiLaBiashara + ", receiverMSISDN=" + this.receiverMSISDN + ", storeNumber=" + this.storeNumber + ", tillNumber=" + this.tillNumber + ")";
        int i2 = component1 + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return str;
    }
}
