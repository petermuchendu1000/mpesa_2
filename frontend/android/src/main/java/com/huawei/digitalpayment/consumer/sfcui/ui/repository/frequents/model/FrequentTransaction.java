package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.safaricom.consumer.commons.transaction.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "displayName", "number", "secondaryNumber", "photo", "transactionType", "Lcom/safaricom/consumer/commons/transaction/TransactionType;", "transactionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/transaction/TransactionType;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getNumber", "getSecondaryNumber", "getPhoto", "getTransactionType", "()Lcom/safaricom/consumer/commons/transaction/TransactionType;", "getTransactionTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentTransaction {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 0;
    private static int hashCode = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;
    private final TransactionType getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public FrequentTransaction(String str, String str2, String str3, String str4, String str5, TransactionType transactionType, String str6) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.ShareDataUIState = str;
        this.copydefault = str2;
        this.component2 = str3;
        this.component1 = str4;
        this.component3 = str5;
        this.getAsAtTimestamp = transactionType;
        this.getRequestBeneficiariesState = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrequentTransaction(String str, String str2, String str3, String str4, String str5, TransactionType transactionType, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        if ((i & 1) != 0) {
            int i2 = component4 + 15;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = null;
        } else {
            str7 = str;
        }
        if ((i & 8) != 0) {
            int i5 = component4 + 71;
            hashCode = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = hashCode + 75;
            int i8 = i7 % 128;
            component4 = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 1;
            hashCode = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str9 = null;
        } else {
            str9 = str5;
        }
        this(str7, str2, str3, str8, str9, transactionType, str6);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = hashCode + 41;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 97;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = hashCode + 27;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 41;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String getNumber() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 119;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSecondaryNumber() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode + 57;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            str = this.component1;
            int i4 = 67 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 67;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPhoto() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 87;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final TransactionType getTransactionType() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 109;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        TransactionType transactionType = this.getAsAtTimestamp;
        int i5 = i2 + 23;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return transactionType;
        }
        throw null;
    }

    public final String getTransactionTitle() {
        int i = 2 % 2;
        int i2 = component4 + 125;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 9;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 83;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    public static FrequentTransaction copy$default(FrequentTransaction frequentTransaction, String str, String str2, String str3, String str4, String str5, TransactionType transactionType, String str6, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        TransactionType transactionType2;
        String str10;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = hashCode + 23;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            str7 = frequentTransaction.ShareDataUIState;
        } else {
            str7 = str;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = hashCode + 109;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                String str11 = frequentTransaction.copydefault;
                throw null;
            }
            str8 = frequentTransaction.copydefault;
        } else {
            str8 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = component4 + 99;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            str9 = frequentTransaction.component2;
        } else {
            str9 = str3;
        }
        String str12 = (i & 8) != 0 ? frequentTransaction.component1 : str4;
        String str13 = (i & 16) != 0 ? frequentTransaction.component3 : str5;
        if ((i & 32) != 0) {
            int i8 = component4 + 117;
            hashCode = i8 % 128;
            if (i8 % 2 == 0) {
                TransactionType transactionType3 = frequentTransaction.getAsAtTimestamp;
                obj2.hashCode();
                throw null;
            }
            transactionType2 = frequentTransaction.getAsAtTimestamp;
        } else {
            transactionType2 = transactionType;
        }
        if ((i & 64) != 0) {
            int i9 = hashCode + 123;
            component4 = i9 % 128;
            if (i9 % 2 != 0) {
                String str14 = frequentTransaction.getRequestBeneficiariesState;
                obj2.hashCode();
                throw null;
            }
            str10 = frequentTransaction.getRequestBeneficiariesState;
        } else {
            str10 = str6;
        }
        return frequentTransaction.copy(str7, str8, str9, str12, str13, transactionType2, str10);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 87;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 9;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 11;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 23;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = hashCode + 109;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 3;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 47;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 55;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final TransactionType component6() {
        int i = 2 % 2;
        int i2 = component4 + 33;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 55;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.getRequestBeneficiariesState;
            int i4 = 56 / 0;
        } else {
            str = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 21;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FrequentTransaction copy(String id, String displayName, String number, String secondaryNumber, String photo, TransactionType transactionType, String transactionTitle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(transactionTitle, "");
        FrequentTransaction frequentTransaction = new FrequentTransaction(id, displayName, number, secondaryNumber, photo, transactionType, transactionTitle);
        int i2 = component4 + 47;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentTransaction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequentTransaction)) {
            return false;
        }
        FrequentTransaction frequentTransaction = (FrequentTransaction) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, frequentTransaction.ShareDataUIState) || (!Intrinsics.areEqual(this.copydefault, frequentTransaction.copydefault))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, frequentTransaction.component2)) {
            int i4 = component4 + 111;
            hashCode = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component1, frequentTransaction.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, frequentTransaction.component3)) {
            int i5 = component4 + 89;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.getAsAtTimestamp == frequentTransaction.getAsAtTimestamp) {
            return Intrinsics.areEqual(this.getRequestBeneficiariesState, frequentTransaction.getRequestBeneficiariesState);
        }
        int i7 = hashCode + 59;
        component4 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.ShareDataUIState;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = component4 + 51;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.copydefault;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = hashCode + 109;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 4;
            }
        }
        int iHashCode5 = this.component2.hashCode();
        String str3 = this.component1;
        if (str3 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i6 = component4 + 69;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
        }
        String str4 = this.component3;
        if (str4 == null) {
            int i8 = hashCode + 97;
            component4 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            iHashCode4 = str4.hashCode();
        }
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + this.getAsAtTimestamp.hashCode()) * 31) + this.getRequestBeneficiariesState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentTransaction(id=" + this.ShareDataUIState + ", displayName=" + this.copydefault + ", number=" + this.component2 + ", secondaryNumber=" + this.component1 + ", photo=" + this.component3 + ", transactionType=" + this.getAsAtTimestamp + ", transactionTitle=" + this.getRequestBeneficiariesState + ")";
        int i2 = hashCode + 115;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
