package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;", "Landroid/os/Parcelable;", "serviceId", "", "totalUsage", "description", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceId", "()Ljava/lang/String;", "getTotalUsage", "getDescription", "getCategory", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountUsage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AccountUsage> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("amount")
    private final String amount;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("description")
    private final String description;

    @SerializedName("serviceId")
    private final String serviceId;

    @SerializedName("totalUsage")
    private final String totalUsage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountUsage> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountUsage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AccountUsage accountUsage = new AccountUsage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 103;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return accountUsage;
            }
            throw null;
        }

        @Override
        public AccountUsage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountUsage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 117;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            AccountUsage[] accountUsageArr = new AccountUsage[i];
            int i6 = i3 + 119;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return accountUsageArr;
        }

        @Override
        public AccountUsage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 23;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            AccountUsage[] accountUsageArrNewArray = newArray(i);
            int i5 = copydefault + 3;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return accountUsageArrNewArray;
        }
    }

    public AccountUsage(String str, String str2, String str3, String str4, String str5) {
        this.serviceId = str;
        this.totalUsage = str2;
        this.description = str3;
        this.category = str4;
        this.amount = str5;
    }

    public final String getServiceId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceId;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTotalUsage() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalUsage;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i3 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.category;
        int i4 = i3 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.amount;
            int i4 = 19 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 85;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static AccountUsage copy$default(AccountUsage accountUsage, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 77;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = accountUsage.serviceId;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = accountUsage.totalUsage;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 111;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str8 = accountUsage.description;
                throw null;
            }
            str3 = accountUsage.description;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = accountUsage.category;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = accountUsage.amount;
            int i6 = copydefault + 7;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return accountUsage.copy(str6, str7, str9, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.serviceId;
        int i4 = i2 + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.totalUsage;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final AccountUsage copy(String serviceId, String totalUsage, String description, String category, String amount) {
        int i = 2 % 2;
        AccountUsage accountUsage = new AccountUsage(serviceId, totalUsage, description, category, amount);
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return accountUsage;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AccountUsage)) {
            int i4 = copydefault + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AccountUsage accountUsage = (AccountUsage) other;
        if (!Intrinsics.areEqual(this.serviceId, accountUsage.serviceId) || !Intrinsics.areEqual(this.totalUsage, accountUsage.totalUsage) || !Intrinsics.areEqual(this.description, accountUsage.description)) {
            return false;
        }
        if (Intrinsics.areEqual(this.category, accountUsage.category)) {
            return Intrinsics.areEqual(this.amount, accountUsage.amount);
        }
        int i6 = copydefault + 1;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.serviceId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.totalUsage;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.description;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.category;
        if (str4 == null) {
            int i2 = copydefault + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.amount;
        int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + (str5 != null ? str5.hashCode() : 0);
        int i4 = ShareDataUIState + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountUsage(serviceId=" + this.serviceId + ", totalUsage=" + this.totalUsage + ", description=" + this.description + ", category=" + this.category + ", amount=" + this.amount + ")";
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.serviceId;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.totalUsage);
            dest.writeString(this.description);
            dest.writeString(this.category);
            dest.writeString(this.amount);
            return;
        }
        dest.writeString(str);
        dest.writeString(this.totalUsage);
        dest.writeString(this.description);
        dest.writeString(this.category);
        dest.writeString(this.amount);
        throw null;
    }
}
