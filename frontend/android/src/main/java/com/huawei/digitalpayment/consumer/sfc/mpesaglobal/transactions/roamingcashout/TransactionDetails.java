package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.safaricom.consumer.commons.statements.DisPlayItems;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionDetails;", "", DisPlayItems.TRANSACTION_ID, "", "type", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "amount", "Ljava/math/BigDecimal;", "fee", "currency", "recipient", "recipientName", "status", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;", "timestamp", "", "reference", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;JLjava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "getAmount", "()Ljava/math/BigDecimal;", "getFee", "getCurrency", "getRecipient", "getRecipientName", "getStatus", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionStatus;", "getTimestamp", "()J", "getReference", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionDetails {
    public static final int $stable = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 1;
    private static int hashCode;
    private static int toString;
    private final String ShareDataUIState;
    private final String component1;
    private final BigDecimal component2;
    private final String component3;
    private final String component4;
    private final TransactionType copy;
    private final BigDecimal copydefault;
    private final TransactionStatus equals;
    private final String getAsAtTimestamp;
    private final long getRequestBeneficiariesState;

    public TransactionDetails(String str, TransactionType transactionType, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, TransactionStatus transactionStatus, long j, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(transactionStatus, "");
        this.getAsAtTimestamp = str;
        this.copy = transactionType;
        this.copydefault = bigDecimal;
        this.component2 = bigDecimal2;
        this.component3 = str2;
        this.ShareDataUIState = str3;
        this.component1 = str4;
        this.equals = transactionStatus;
        this.getRequestBeneficiariesState = j;
        this.component4 = str5;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = hashCode + 35;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionType getType() {
        int i = 2 % 2;
        int i2 = hashCode + 53;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        TransactionType transactionType = this.copy;
        int i5 = i3 + 11;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return transactionType;
    }

    public final BigDecimal getAmount() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 9;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        BigDecimal bigDecimal = this.copydefault;
        int i5 = i2 + 81;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final BigDecimal getFee() {
        int i = 2 % 2;
        int i2 = hashCode + 33;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.component2;
        int i5 = i3 + 19;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return bigDecimal;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 125;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 71;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getRecipient() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 89;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 23;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRecipientName() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode + 91;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            str = this.component1;
            int i4 = 96 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 121;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final TransactionStatus getStatus() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 111;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        TransactionStatus transactionStatus = this.equals;
        int i5 = i2 + 113;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return transactionStatus;
        }
        throw null;
    }

    public final long getTimestamp() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 121;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.getRequestBeneficiariesState;
        int i4 = i3 + 35;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final String getReference() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 39;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 95;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 99;
        toString = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransactionDetails copy$default(TransactionDetails transactionDetails, String str, TransactionType transactionType, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, TransactionStatus transactionStatus, long j, String str5, int i, Object obj) {
        String str6;
        String str7;
        String str8;
        TransactionStatus transactionStatus2;
        int i2 = 2 % 2;
        String str9 = (i & 1) != 0 ? transactionDetails.getAsAtTimestamp : str;
        TransactionType transactionType2 = (i & 2) != 0 ? transactionDetails.copy : transactionType;
        BigDecimal bigDecimal3 = (i & 4) != 0 ? transactionDetails.copydefault : bigDecimal;
        BigDecimal bigDecimal4 = (i & 8) != 0 ? transactionDetails.component2 : bigDecimal2;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i3 = hashCode + 43;
            getShareableDataState = i3 % 128;
            if (i3 % 2 == 0) {
                String str10 = transactionDetails.component3;
                obj2.hashCode();
                throw null;
            }
            str6 = transactionDetails.component3;
        } else {
            str6 = str2;
        }
        if ((i & 32) != 0) {
            int i4 = hashCode + 25;
            getShareableDataState = i4 % 128;
            if (i4 % 2 == 0) {
                String str11 = transactionDetails.ShareDataUIState;
                throw null;
            }
            str7 = transactionDetails.ShareDataUIState;
        } else {
            str7 = str3;
        }
        if ((i & 64) != 0) {
            int i5 = hashCode + 91;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            str8 = transactionDetails.component1;
        } else {
            str8 = str4;
        }
        if ((i & 128) != 0) {
            int i7 = getShareableDataState + 67;
            hashCode = i7 % 128;
            if (i7 % 2 != 0) {
                TransactionStatus transactionStatus3 = transactionDetails.equals;
                obj2.hashCode();
                throw null;
            }
            transactionStatus2 = transactionDetails.equals;
        } else {
            transactionStatus2 = transactionStatus;
        }
        return transactionDetails.copy(str9, transactionType2, bigDecimal3, bigDecimal4, str6, str7, str8, transactionStatus2, (i & 256) != 0 ? transactionDetails.getRequestBeneficiariesState : j, (i & 512) != 0 ? transactionDetails.component4 : str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 69;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 37;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 83;
        hashCode = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component4;
        int i4 = i2 + 13;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final TransactionType component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 73;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        TransactionType transactionType = this.copy;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return transactionType;
    }

    public final BigDecimal component3() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 19;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.copydefault;
        int i5 = i3 + 77;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final BigDecimal component4() {
        int i = 2 % 2;
        int i2 = hashCode + 117;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.component2;
        int i5 = i3 + 91;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 51;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 31;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 15;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 73;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 5;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 5;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionStatus component8() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 1;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        TransactionStatus transactionStatus = this.equals;
        int i4 = i2 + 101;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return transactionStatus;
    }

    public final long component9() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 73;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        long j = this.getRequestBeneficiariesState;
        int i5 = i2 + 3;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final TransactionDetails copy(String transactionId, TransactionType type, BigDecimal amount, BigDecimal fee, String currency, String recipient, String recipientName, TransactionStatus status, long timestamp, String reference) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionId, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(fee, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(recipient, "");
        Intrinsics.checkNotNullParameter(status, "");
        TransactionDetails transactionDetails = new TransactionDetails(transactionId, type, amount, fee, currency, recipient, recipientName, status, timestamp, reference);
        int i2 = hashCode + 117;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return transactionDetails;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getShareableDataState + 119;
            hashCode = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof TransactionDetails)) {
            return false;
        }
        TransactionDetails transactionDetails = (TransactionDetails) other;
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, transactionDetails.getAsAtTimestamp) || this.copy != transactionDetails.copy || !Intrinsics.areEqual(this.copydefault, transactionDetails.copydefault) || !Intrinsics.areEqual(this.component2, transactionDetails.component2) || !Intrinsics.areEqual(this.component3, transactionDetails.component3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, transactionDetails.ShareDataUIState)) {
            int i3 = hashCode + 117;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, transactionDetails.component1)) {
            int i5 = getShareableDataState + 25;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.equals == transactionDetails.equals) {
            return this.getRequestBeneficiariesState == transactionDetails.getRequestBeneficiariesState && Intrinsics.areEqual(this.component4, transactionDetails.component4);
        }
        int i7 = getShareableDataState + 73;
        hashCode = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = this.getAsAtTimestamp.hashCode();
        int iHashCode2 = this.copy.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.component2.hashCode();
        int iHashCode5 = this.component3.hashCode();
        int iHashCode6 = this.ShareDataUIState.hashCode();
        String str = this.component1;
        int iHashCode7 = 0;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.equals.hashCode();
        int iHashCode10 = Long.hashCode(this.getRequestBeneficiariesState);
        String str2 = this.component4;
        if (str2 == null) {
            int i2 = getShareableDataState + 79;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iHashCode7 = str2.hashCode();
        }
        int i4 = (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode7;
        int i5 = hashCode + 97;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionDetails(transactionId=" + this.getAsAtTimestamp + ", type=" + this.copy + ", amount=" + this.copydefault + ", fee=" + this.component2 + ", currency=" + this.component3 + ", recipient=" + this.ShareDataUIState + ", recipientName=" + this.component1 + ", status=" + this.equals + ", timestamp=" + this.getRequestBeneficiariesState + ", reference=" + this.component4 + ')';
        int i2 = getShareableDataState + 57;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
