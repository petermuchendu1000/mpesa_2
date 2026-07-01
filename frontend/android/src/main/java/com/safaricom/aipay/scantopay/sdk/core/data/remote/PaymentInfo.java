package com.safaricom.aipay.scantopay.sdk.core.data.remote;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.safaricom.aipay.scantopay.sdk.core.data.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/PaymentInfo;", "", "transactionType", "Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;", "identifier", "", "recipientName", "amount", "accountNumber", KeysConstants.KEY_STORE_NUMBER, "<init>", "(Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTransactionType", "()Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;", "getIdentifier", "()Ljava/lang/String;", "getRecipientName", "getAmount", "getAccountNumber", "getStoreNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentInfo {
    private final String accountNumber;
    private final String amount;
    private final String identifier;
    private final String recipientName;
    private final String storeNumber;
    private final TransactionType transactionType;

    public PaymentInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getRecipientName() {
        return this.recipientName;
    }

    public final String getStoreNumber() {
        return this.storeNumber;
    }

    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    public PaymentInfo(TransactionType transactionType, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.transactionType = transactionType;
        this.identifier = str;
        this.recipientName = str2;
        this.amount = str3;
        this.accountNumber = str4;
        this.storeNumber = str5;
    }

    public PaymentInfo(TransactionType transactionType, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransactionType.UNKNOWN : transactionType, (i & 2) != 0 ? "na" : str, (i & 4) != 0 ? "na" : str2, (i & 8) != 0 ? "na" : str3, (i & 16) != 0 ? "na" : str4, (i & 32) == 0 ? str5 : "na");
    }

    public static PaymentInfo copy$default(PaymentInfo paymentInfo, TransactionType transactionType, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionType = paymentInfo.transactionType;
        }
        if ((i & 2) != 0) {
            str = paymentInfo.identifier;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = paymentInfo.recipientName;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = paymentInfo.amount;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = paymentInfo.accountNumber;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = paymentInfo.storeNumber;
        }
        return paymentInfo.copy(transactionType, str6, str7, str8, str9, str5);
    }

    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getRecipientName() {
        return this.recipientName;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getStoreNumber() {
        return this.storeNumber;
    }

    public final PaymentInfo copy(TransactionType transactionType, String identifier, String recipientName, String amount, String accountNumber, String storeNumber) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(identifier, "");
        Intrinsics.checkNotNullParameter(recipientName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(accountNumber, "");
        Intrinsics.checkNotNullParameter(storeNumber, "");
        return new PaymentInfo(transactionType, identifier, recipientName, amount, accountNumber, storeNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) other;
        return this.transactionType == paymentInfo.transactionType && Intrinsics.areEqual(this.identifier, paymentInfo.identifier) && Intrinsics.areEqual(this.recipientName, paymentInfo.recipientName) && Intrinsics.areEqual(this.amount, paymentInfo.amount) && Intrinsics.areEqual(this.accountNumber, paymentInfo.accountNumber) && Intrinsics.areEqual(this.storeNumber, paymentInfo.storeNumber);
    }

    public int hashCode() {
        int iHashCode = this.transactionType.hashCode();
        int iHashCode2 = this.identifier.hashCode();
        int iHashCode3 = this.recipientName.hashCode();
        int iHashCode4 = this.amount.hashCode();
        return this.storeNumber.hashCode() + ((this.accountNumber.hashCode() + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PaymentInfo(transactionType=" + this.transactionType + ", identifier=" + this.identifier + ", recipientName=" + this.recipientName + ", amount=" + this.amount + ", accountNumber=" + this.accountNumber + ", storeNumber=" + this.storeNumber + ")";
    }
}
