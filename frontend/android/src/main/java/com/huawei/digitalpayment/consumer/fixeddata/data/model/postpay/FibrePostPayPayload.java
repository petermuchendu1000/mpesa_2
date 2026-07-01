package com.huawei.digitalpayment.consumer.fixeddata.data.model.postpay;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015Jn\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0007J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020\"H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u000b\u0010\u0015¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/postpay/FibrePostPayPayload;", "Landroid/os/Parcelable;", "accountId", "", "msisdn", "mainOfferingId", "mainOfferingCode", "accKey", "amount", "isAutorenew", "", "isNewCustomer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAccountId", "()Ljava/lang/String;", "getMsisdn", "getMainOfferingId", "getMainOfferingCode", "getAccKey", "getAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/postpay/FibrePostPayPayload;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePostPayPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePostPayPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String accKey;
    private final String accountId;
    private final String amount;
    private final Boolean isAutorenew;
    private final Boolean isNewCustomer;
    private final String mainOfferingCode;
    private final String mainOfferingId;
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePostPayPayload> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePostPayPayload createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() == 0) {
                int i2 = component1 + 79;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i3 = ShareDataUIState + 27;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                }
                boolValueOf2 = Boolean.valueOf(z);
            }
            FibrePostPayPayload fibrePostPayPayload = new FibrePostPayPayload(string, string2, string3, string4, string5, string6, boolValueOf, boolValueOf2);
            int i5 = component1 + 87;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return fibrePostPayPayload;
            }
            throw null;
        }

        @Override
        public FibrePostPayPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FibrePostPayPayload fibrePostPayPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 69;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return fibrePostPayPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePostPayPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 69;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            FibrePostPayPayload[] fibrePostPayPayloadArr = new FibrePostPayPayload[i];
            int i6 = i4 + 107;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return fibrePostPayPayloadArr;
        }

        @Override
        public FibrePostPayPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 13;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public FibrePostPayPayload(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
        this.accountId = str;
        this.msisdn = str2;
        this.mainOfferingId = str3;
        this.mainOfferingCode = str4;
        this.accKey = str5;
        this.amount = str6;
        this.isAutorenew = bool;
        this.isNewCustomer = bool2;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountId;
        int i4 = i2 + 91;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final String getMainOfferingId() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.mainOfferingId;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMainOfferingCode() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mainOfferingCode;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final String getAccKey() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accKey;
        int i5 = i2 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final Boolean isAutorenew() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.isAutorenew;
            int i4 = 93 / 0;
        } else {
            bool = this.isAutorenew;
        }
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final Boolean isNewCustomer() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isNewCustomer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 77;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static FibrePostPayPayload copy$default(FibrePostPayPayload fibrePostPayPayload, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        Boolean bool3;
        Boolean bool4;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 35;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str7 = fibrePostPayPayload.accountId;
            int i5 = i3 + 89;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str7 = str;
        }
        String str10 = (i & 2) != 0 ? fibrePostPayPayload.msisdn : str2;
        if ((i & 4) != 0) {
            int i7 = component1 + 121;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str8 = fibrePostPayPayload.mainOfferingId;
        } else {
            str8 = str3;
        }
        String str11 = (i & 8) != 0 ? fibrePostPayPayload.mainOfferingCode : str4;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i9 = component1 + 1;
            copydefault = i9 % 128;
            if (i9 % 2 == 0) {
                String str12 = fibrePostPayPayload.accKey;
                throw null;
            }
            str9 = fibrePostPayPayload.accKey;
        } else {
            str9 = str5;
        }
        String str13 = (i & 32) != 0 ? fibrePostPayPayload.amount : str6;
        if ((i & 64) != 0) {
            int i10 = copydefault + 27;
            component1 = i10 % 128;
            if (i10 % 2 != 0) {
                bool3 = fibrePostPayPayload.isAutorenew;
                int i11 = 50 / 0;
            } else {
                bool3 = fibrePostPayPayload.isAutorenew;
            }
        } else {
            bool3 = bool;
        }
        if ((i & 128) != 0) {
            int i12 = component1 + 5;
            copydefault = i12 % 128;
            if (i12 % 2 == 0) {
                Boolean bool5 = fibrePostPayPayload.isNewCustomer;
                obj2.hashCode();
                throw null;
            }
            bool4 = fibrePostPayPayload.isNewCustomer;
        } else {
            bool4 = bool2;
        }
        return fibrePostPayPayload.copy(str7, str10, str8, str11, str9, str13, bool3, bool4);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.accountId;
            int i4 = 73 / 0;
        } else {
            str = this.accountId;
        }
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.mainOfferingId;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.mainOfferingCode;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accKey;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.isAutorenew;
        int i5 = i2 + 9;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component8() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isNewCustomer;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final FibrePostPayPayload copy(String accountId, String msisdn, String mainOfferingId, String mainOfferingCode, String accKey, String amount, Boolean isAutorenew, Boolean isNewCustomer) {
        int i = 2 % 2;
        FibrePostPayPayload fibrePostPayPayload = new FibrePostPayPayload(accountId, msisdn, mainOfferingId, mainOfferingCode, accKey, amount, isAutorenew, isNewCustomer);
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibrePostPayPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FibrePostPayPayload)) {
            return false;
        }
        FibrePostPayPayload fibrePostPayPayload = (FibrePostPayPayload) other;
        if (!Intrinsics.areEqual(this.accountId, fibrePostPayPayload.accountId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, fibrePostPayPayload.msisdn)) {
            int i4 = component1 + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.mainOfferingId, fibrePostPayPayload.mainOfferingId)) {
            int i6 = component1 + 19;
            copydefault = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.mainOfferingCode, fibrePostPayPayload.mainOfferingCode) || (!Intrinsics.areEqual(this.accKey, fibrePostPayPayload.accKey))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, fibrePostPayPayload.amount)) {
            int i7 = component1 + 1;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.isAutorenew, fibrePostPayPayload.isAutorenew)) {
            int i9 = copydefault + 73;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.isNewCustomer, fibrePostPayPayload.isNewCustomer)) {
            return true;
        }
        int i11 = component1 + 75;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0 ? (str = this.accountId) != null : (str = this.accountId) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i3 + 55;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        String str2 = this.msisdn;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mainOfferingId;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i6 = component1 + 55;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        String str4 = this.mainOfferingCode;
        if (str4 == null) {
            int i8 = copydefault + 109;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
            int i10 = component1 + 19;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 5;
            }
        }
        String str5 = this.accKey;
        if (str5 == null) {
            int i12 = copydefault + 23;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        String str6 = this.amount;
        if (str6 == null) {
            int i14 = component1 + 93;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str6.hashCode();
        }
        Boolean bool = this.isAutorenew;
        if (bool == null) {
            int i16 = component1 + 55;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = bool.hashCode();
        }
        Boolean bool2 = this.isNewCustomer;
        return (((((((((((((iHashCode * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePostPayPayload(accountId=" + this.accountId + ", msisdn=" + this.msisdn + ", mainOfferingId=" + this.mainOfferingId + ", mainOfferingCode=" + this.mainOfferingCode + ", accKey=" + this.accKey + ", amount=" + this.amount + ", isAutorenew=" + this.isAutorenew + ", isNewCustomer=" + this.isNewCustomer + ")";
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        dest.writeString(this.msisdn);
        dest.writeString(this.mainOfferingId);
        dest.writeString(this.mainOfferingCode);
        dest.writeString(this.accKey);
        dest.writeString(this.amount);
        Boolean bool = this.isAutorenew;
        if (bool == null) {
            int i4 = component1 + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
            int i6 = copydefault + 43;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isNewCustomer;
        if (bool2 != null) {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            int i8 = copydefault + 1;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            dest.writeInt(0);
        }
    }
}
