package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import com.huawei.customer.digitalpayment.checkout.service.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorContext;", "", "transactionType", "Lcom/huawei/customer/digitalpayment/checkout/service/TransactionType;", "transactionAmount", "", "stage", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/TransactionStage;", "additionalData", "", "<init>", "(Lcom/huawei/customer/digitalpayment/checkout/service/TransactionType;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/TransactionStage;Ljava/util/Map;)V", "getTransactionType", "()Lcom/huawei/customer/digitalpayment/checkout/service/TransactionType;", "getTransactionAmount", "()Ljava/lang/String;", "getStage", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/TransactionStage;", "getAdditionalData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorContext {
    public static final int $stable = 8;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 25 % 128;
    private final TransactionStage ShareDataUIState;
    private final String component1;
    private final Map<String, Object> component2;
    private final TransactionType component3;

    public ErrorContext(TransactionType transactionType, String str, TransactionStage transactionStage, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionStage, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = transactionType;
        this.component1 = str;
        this.ShareDataUIState = transactionStage;
        this.component2 = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorContext(TransactionType transactionType, String str, TransactionStage transactionStage, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = copy + 89;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                map = MapsKt.emptyMap();
                int i3 = getAsAtTimestamp + 81;
                copy = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                MapsKt.emptyMap();
                throw null;
            }
        }
        this(transactionType, str, transactionStage, map);
    }

    public final TransactionType getTransactionType() {
        int i = 2 % 2;
        int i2 = copy + 11;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionAmount() {
        int i = 2 % 2;
        int i2 = copy + 57;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final TransactionStage getStage() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 125;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        TransactionStage transactionStage = this.ShareDataUIState;
        int i5 = i3 + 121;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return transactionStage;
    }

    public final Map<String, Object> getAdditionalData() {
        int i = 2 % 2;
        int i2 = copy + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.component2;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return map;
    }

    static {
        if (25 % 2 == 0) {
            int i = 51 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ErrorContext copy$default(ErrorContext errorContext, TransactionType transactionType, String str, TransactionStage transactionStage, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 91;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            transactionType = errorContext.component3;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 87;
            int i6 = i5 % 128;
            copy = i6;
            int i7 = i5 % 2;
            String str2 = errorContext.component1;
            int i8 = i6 + 57;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            str = str2;
        }
        if ((i & 4) != 0) {
            transactionStage = errorContext.ShareDataUIState;
        }
        if ((i & 8) != 0) {
            int i10 = copy + 17;
            getAsAtTimestamp = i10 % 128;
            if (i10 % 2 != 0) {
                map = errorContext.component2;
                int i11 = 28 / 0;
            } else {
                map = errorContext.component2;
            }
        }
        return errorContext.copy(transactionType, str, transactionStage, map);
    }

    public final TransactionType component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 11;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        TransactionType transactionType = this.component3;
        int i5 = i2 + 67;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return transactionType;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final TransactionStage component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        TransactionStage transactionStage = this.ShareDataUIState;
        int i5 = i3 + 83;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return transactionStage;
    }

    public final Map<String, Object> component4() {
        int i = 2 % 2;
        int i2 = copy + 33;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.component2;
        int i5 = i3 + 105;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final ErrorContext copy(TransactionType transactionType, String transactionAmount, TransactionStage stage, Map<String, ? extends Object> additionalData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(transactionAmount, "");
        Intrinsics.checkNotNullParameter(stage, "");
        Intrinsics.checkNotNullParameter(additionalData, "");
        ErrorContext errorContext = new ErrorContext(transactionType, transactionAmount, stage, additionalData);
        int i2 = getAsAtTimestamp + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return errorContext;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp + 83;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ErrorContext)) {
            int i4 = copy + 67;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ErrorContext errorContext = (ErrorContext) other;
        if (this.component3 != errorContext.component3) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, errorContext.component1)) {
            int i6 = copy + 11;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.ShareDataUIState != errorContext.ShareDataUIState) {
            int i8 = getAsAtTimestamp + 123;
            copy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, errorContext.component2)) {
            return false;
        }
        int i10 = getAsAtTimestamp + 57;
        copy = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component3.hashCode() * 31) + this.component1.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component2.hashCode();
        int i4 = copy + 117;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ErrorContext(transactionType=" + this.component3 + ", transactionAmount=" + this.component1 + ", stage=" + this.ShareDataUIState + ", additionalData=" + this.component2 + ')';
        int i2 = getAsAtTimestamp + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
