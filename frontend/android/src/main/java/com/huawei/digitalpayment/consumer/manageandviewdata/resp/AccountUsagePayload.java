package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsagePayload;", "Landroid/os/Parcelable;", "msisdn", "", "startDate", "endDate", "usageType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getStartDate", "getEndDate", "getUsageType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountUsagePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AccountUsagePayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("endDate")
    private final String endDate;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("startDate")
    private final String startDate;

    @SerializedName("usageType")
    private final String usageType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountUsagePayload> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountUsagePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AccountUsagePayload accountUsagePayload = new AccountUsagePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 37;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return accountUsagePayload;
            }
            throw null;
        }

        @Override
        public AccountUsagePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AccountUsagePayload accountUsagePayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 123;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 71 / 0;
            }
            return accountUsagePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountUsagePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 117;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            AccountUsagePayload[] accountUsagePayloadArr = new AccountUsagePayload[i];
            int i6 = i3 + 1;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return accountUsagePayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public AccountUsagePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 59;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            AccountUsagePayload[] accountUsagePayloadArrNewArray = newArray(i);
            int i5 = copydefault + 113;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return accountUsagePayloadArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public AccountUsagePayload(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.msisdn = str;
        this.startDate = str2;
        this.endDate = str3;
        this.usageType = str4;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStartDate() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.startDate;
        int i4 = i3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getEndDate() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endDate;
        int i5 = i2 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getUsageType() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.usageType;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 121;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static AccountUsagePayload copy$default(AccountUsagePayload accountUsagePayload, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 81;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = accountUsagePayload.msisdn;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 37;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str2 = accountUsagePayload.startDate;
        }
        if ((i & 4) != 0) {
            int i8 = i4 + 43;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str3 = accountUsagePayload.endDate;
        }
        if ((i & 8) != 0) {
            int i10 = component1 + 87;
            component2 = i10 % 128;
            if (i10 % 2 != 0) {
                String str5 = accountUsagePayload.usageType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = accountUsagePayload.usageType;
        }
        return accountUsagePayload.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.startDate;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.endDate;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.usageType;
            int i4 = 86 / 0;
        } else {
            str = this.usageType;
        }
        int i5 = i2 + 49;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final AccountUsagePayload copy(String msisdn, String startDate, String endDate, String usageType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(startDate, "");
        Intrinsics.checkNotNullParameter(endDate, "");
        Intrinsics.checkNotNullParameter(usageType, "");
        AccountUsagePayload accountUsagePayload = new AccountUsagePayload(msisdn, startDate, endDate, usageType);
        int i2 = component2 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return accountUsagePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountUsagePayload)) {
            return false;
        }
        AccountUsagePayload accountUsagePayload = (AccountUsagePayload) other;
        if (!Intrinsics.areEqual(this.msisdn, accountUsagePayload.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.startDate, accountUsagePayload.startDate)) {
            int i3 = component2 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.endDate, accountUsagePayload.endDate)) {
            int i5 = component2 + 39;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.usageType, accountUsagePayload.usageType)) {
            return false;
        }
        int i7 = component1 + 27;
        component2 = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.msisdn.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.usageType.hashCode();
        int i4 = component1 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountUsagePayload(msisdn=" + this.msisdn + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", usageType=" + this.usageType + ")";
        int i2 = component2 + 103;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeString(this.usageType);
        if (i3 == 0) {
            throw null;
        }
    }
}
