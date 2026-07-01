package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u0019H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GPaymentPayload;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "amount", "account", "productId", "operationAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getAmount", "setAmount", "(Ljava/lang/String;)V", "getAccount", "getProductId", "getOperationAction", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4G5GPaymentPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Home4G5GPaymentPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("account")
    private final String account;

    @SerializedName("amount")
    private String amount;

    @SerializedName("operationAction")
    private final String operationAction;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4G5GPaymentPayload> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GPaymentPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home4G5GPaymentPayload home4G5GPaymentPayload = new Home4G5GPaymentPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 113;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return home4G5GPaymentPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Home4G5GPaymentPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GPaymentPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 19;
            int i4 = i3 % 128;
            copydefault = i4;
            Home4G5GPaymentPayload[] home4G5GPaymentPayloadArr = new Home4G5GPaymentPayload[i];
            if (i3 % 2 == 0) {
                int i5 = 95 / 0;
            }
            int i6 = i4 + 21;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return home4G5GPaymentPayloadArr;
        }

        @Override
        public Home4G5GPaymentPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 29;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            Home4G5GPaymentPayload[] home4G5GPaymentPayloadArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 109;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return home4G5GPaymentPayloadArrNewArray;
        }
    }

    public Home4G5GPaymentPayload(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.sponsorMsisdn = str;
        this.amount = str2;
        this.account = str3;
        this.productId = str4;
        this.operationAction = str5;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 25;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
            int i3 = 74 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }
        int i4 = component2 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getAccount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.account;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final String getProductId() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.productId;
            int i4 = 2 / 0;
        } else {
            str = this.productId;
        }
        int i5 = i3 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOperationAction() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.operationAction;
        int i4 = i3 + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 57;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static Home4G5GPaymentPayload copy$default(Home4G5GPaymentPayload home4G5GPaymentPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 121;
        component2 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = home4G5GPaymentPayload.sponsorMsisdn;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i5 = i3 + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str2 = home4G5GPaymentPayload.amount;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i7 = i3 + 35;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                String str8 = home4G5GPaymentPayload.account;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = home4G5GPaymentPayload.account;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = home4G5GPaymentPayload.productId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i8 = component2 + 19;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str5 = home4G5GPaymentPayload.operationAction;
            if (i9 != 0) {
                int i10 = 79 / 0;
            }
        }
        Home4G5GPaymentPayload home4G5GPaymentPayloadCopy = home4G5GPaymentPayload.copy(str6, str7, str9, str10, str5);
        int i11 = component2 + 123;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
        return home4G5GPaymentPayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.account;
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productId;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.operationAction;
        int i5 = i3 + 73;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Home4G5GPaymentPayload copy(String sponsorMsisdn, String amount, String account, String productId, String operationAction) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(account, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(operationAction, "");
        Home4G5GPaymentPayload home4G5GPaymentPayload = new Home4G5GPaymentPayload(sponsorMsisdn, amount, account, productId, operationAction);
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return home4G5GPaymentPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 53;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof Home4G5GPaymentPayload)) {
            int i3 = component2 + 115;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Home4G5GPaymentPayload home4G5GPaymentPayload = (Home4G5GPaymentPayload) other;
        if (!Intrinsics.areEqual(this.sponsorMsisdn, home4G5GPaymentPayload.sponsorMsisdn) || !Intrinsics.areEqual(this.amount, home4G5GPaymentPayload.amount) || !Intrinsics.areEqual(this.account, home4G5GPaymentPayload.account)) {
            return false;
        }
        if (Intrinsics.areEqual(this.productId, home4G5GPaymentPayload.productId)) {
            return Intrinsics.areEqual(this.operationAction, home4G5GPaymentPayload.operationAction);
        }
        int i5 = ShareDataUIState + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.sponsorMsisdn.hashCode() * 31) + this.amount.hashCode()) * 31) + this.account.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.operationAction.hashCode();
        int i4 = component2 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4G5GPaymentPayload(sponsorMsisdn=" + this.sponsorMsisdn + ", amount=" + this.amount + ", account=" + this.account + ", productId=" + this.productId + ", operationAction=" + this.operationAction + ")";
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.amount);
        dest.writeString(this.account);
        dest.writeString(this.productId);
        dest.writeString(this.operationAction);
        int i4 = ShareDataUIState + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
