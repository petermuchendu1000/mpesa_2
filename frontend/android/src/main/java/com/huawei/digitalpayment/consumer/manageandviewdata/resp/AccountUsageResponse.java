package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010 \u001a\u00020!H\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020!H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsageResponse;", "Landroid/os/Parcelable;", "total", "", "airtimeUsage", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;", "dataUsage", "percentages", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/Percentage;", "cbsTotal", "preciseAccuracy", "messageSlug", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotal", "()Ljava/lang/String;", "getAirtimeUsage", "()Ljava/util/List;", "getDataUsage", "getPercentages", "getCbsTotal", "getPreciseAccuracy", "getMessageSlug", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountUsageResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountUsageResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("airtimeUsage")
    private final List<AccountUsage> airtimeUsage;

    @SerializedName("cbsTotal")
    private final String cbsTotal;

    @SerializedName("dataUsage")
    private final List<AccountUsage> dataUsage;

    @SerializedName("messageSlug")
    private final String messageSlug;

    @SerializedName("percentage")
    private final List<Percentage> percentages;

    @SerializedName("preciseAccuracy")
    private final String preciseAccuracy;

    @SerializedName("total")
    private final String total;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountUsageResponse> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountUsageResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                int i2 = component2 + 35;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(AccountUsage.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList4 = arrayList;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = component2 + 109;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList2.add(AccountUsage.CREATOR.createFromParcel(parcel));
                        i6 += 109;
                    } else {
                        arrayList2.add(AccountUsage.CREATOR.createFromParcel(parcel));
                        i6++;
                    }
                }
            }
            ArrayList arrayList5 = arrayList2;
            if (parcel.readInt() != 0) {
                int i8 = parcel.readInt();
                arrayList3 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList3.add(Percentage.CREATOR.createFromParcel(parcel));
                }
            }
            return new AccountUsageResponse(string, arrayList4, arrayList5, arrayList3, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public AccountUsageResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            AccountUsageResponse accountUsageResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            int i5 = ShareDataUIState + 37;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return accountUsageResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AccountUsageResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 19;
            ShareDataUIState = i3 % 128;
            AccountUsageResponse[] accountUsageResponseArr = new AccountUsageResponse[i];
            if (i3 % 2 != 0) {
                return accountUsageResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public AccountUsageResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 1;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public AccountUsageResponse(String str, List<AccountUsage> list, List<AccountUsage> list2, List<Percentage> list3, String str2, String str3, String str4) {
        this.total = str;
        this.airtimeUsage = list;
        this.dataUsage = list2;
        this.percentages = list3;
        this.cbsTotal = str2;
        this.preciseAccuracy = str3;
        this.messageSlug = str4;
    }

    public final String getTotal() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.total;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<AccountUsage> getAirtimeUsage() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.airtimeUsage;
        }
        throw null;
    }

    public final List<AccountUsage> getDataUsage() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dataUsage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Percentage> getPercentages() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<Percentage> list = this.percentages;
        int i4 = i2 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String getCbsTotal() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 41;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.cbsTotal;
            int i4 = 20 / 0;
        } else {
            str = this.cbsTotal;
        }
        int i5 = i3 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPreciseAccuracy() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.preciseAccuracy;
            int i4 = 23 / 0;
        } else {
            str = this.preciseAccuracy;
        }
        int i5 = i2 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMessageSlug() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.messageSlug;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 75;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AccountUsageResponse copy$default(AccountUsageResponse accountUsageResponse, String str, List list, List list2, List list3, String str2, String str3, String str4, int i, Object obj) {
        List list4;
        String str5;
        int i2 = 2 % 2;
        String str6 = (i & 1) != 0 ? accountUsageResponse.total : str;
        List list5 = (i & 2) != 0 ? accountUsageResponse.airtimeUsage : list;
        if ((i & 4) != 0) {
            int i3 = component2;
            int i4 = i3 + 27;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            list4 = accountUsageResponse.dataUsage;
            int i6 = i3 + 69;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            list4 = list2;
        }
        List list6 = (i & 8) != 0 ? accountUsageResponse.percentages : list3;
        String str7 = (i & 16) != 0 ? accountUsageResponse.cbsTotal : str2;
        String str8 = (i & 32) != 0 ? accountUsageResponse.preciseAccuracy : str3;
        if ((i & 64) != 0) {
            int i8 = component3 + 5;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str5 = accountUsageResponse.messageSlug;
            if (i9 != 0) {
                int i10 = 0 / 0;
            }
        } else {
            str5 = str4;
        }
        return accountUsageResponse.copy(str6, list5, list4, list6, str7, str8, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.total;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final List<AccountUsage> component2() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<AccountUsage> list = this.airtimeUsage;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<AccountUsage> component3() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dataUsage;
        }
        throw null;
    }

    public final List<Percentage> component4() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.percentages;
        }
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.cbsTotal;
            int i4 = 40 / 0;
        } else {
            str = this.cbsTotal;
        }
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.preciseAccuracy;
        int i4 = i3 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.messageSlug;
        int i4 = i2 + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final AccountUsageResponse copy(String total, List<AccountUsage> airtimeUsage, List<AccountUsage> dataUsage, List<Percentage> percentages, String cbsTotal, String preciseAccuracy, String messageSlug) {
        int i = 2 % 2;
        AccountUsageResponse accountUsageResponse = new AccountUsageResponse(total, airtimeUsage, dataUsage, percentages, cbsTotal, preciseAccuracy, messageSlug);
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return accountUsageResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountUsageResponse)) {
            int i4 = i3 + 89;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AccountUsageResponse accountUsageResponse = (AccountUsageResponse) other;
        if (!Intrinsics.areEqual(this.total, accountUsageResponse.total)) {
            int i6 = component3 + 29;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.airtimeUsage, accountUsageResponse.airtimeUsage) || !Intrinsics.areEqual(this.dataUsage, accountUsageResponse.dataUsage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.percentages, accountUsageResponse.percentages)) {
            int i8 = component2 + 91;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.cbsTotal, accountUsageResponse.cbsTotal)) {
            return Intrinsics.areEqual(this.preciseAccuracy, accountUsageResponse.preciseAccuracy) && Intrinsics.areEqual(this.messageSlug, accountUsageResponse.messageSlug);
        }
        int i10 = component3 + 33;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.total;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        List<AccountUsage> list = this.airtimeUsage;
        if (list == null) {
            int i2 = component3 + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List<AccountUsage> list2 = this.dataUsage;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List<Percentage> list3 = this.percentages;
        if (list3 == null) {
            int i4 = component3 + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list3.hashCode();
        }
        String str2 = this.cbsTotal;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.preciseAccuracy;
        if (str3 == null) {
            int i6 = component2 + 43;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.messageSlug;
        return (((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountUsageResponse(total=" + this.total + ", airtimeUsage=" + this.airtimeUsage + ", dataUsage=" + this.dataUsage + ", percentages=" + this.percentages + ", cbsTotal=" + this.cbsTotal + ", preciseAccuracy=" + this.preciseAccuracy + ", messageSlug=" + this.messageSlug + ")";
        int i2 = component2 + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1
  0x002f: PHI (r1v14 java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage>) = 
  (r1v5 java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage>)
  (r1v17 java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage>)
 binds: [B:8:0x0029, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r7, int r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsageResponse.component3
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsageResponse.component2 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            if (r1 == 0) goto L22
            java.lang.String r1 = r6.total
            r7.writeString(r1)
            java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage> r1 = r6.airtimeUsage
            r2 = 73
            int r2 = r2 / r4
            if (r1 != 0) goto L2f
            goto L2b
        L22:
            java.lang.String r1 = r6.total
            r7.writeString(r1)
            java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage> r1 = r6.airtimeUsage
            if (r1 != 0) goto L2f
        L2b:
            r7.writeInt(r4)
            goto L56
        L2f:
            r7.writeInt(r3)
            int r2 = r1.size()
            r7.writeInt(r2)
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage r2 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage) r2
            r2.writeToParcel(r7, r8)
            int r2 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsageResponse.component2
            int r2 = r2 + 19
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsageResponse.component3 = r5
            int r2 = r2 % r0
            goto L3d
        L56:
            java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage> r0 = r6.dataUsage
            if (r0 != 0) goto L5e
            r7.writeInt(r4)
            goto L7c
        L5e:
            r7.writeInt(r3)
            int r1 = r0.size()
            r7.writeInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L6c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage r1 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage) r1
            r1.writeToParcel(r7, r8)
            goto L6c
        L7c:
            java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.Percentage> r0 = r6.percentages
            if (r0 != 0) goto L84
            r7.writeInt(r4)
            goto La2
        L84:
            r7.writeInt(r3)
            int r1 = r0.size()
            r7.writeInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r0.next()
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.Percentage r1 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.Percentage) r1
            r1.writeToParcel(r7, r8)
            goto L92
        La2:
            java.lang.String r8 = r6.cbsTotal
            r7.writeString(r8)
            java.lang.String r8 = r6.preciseAccuracy
            r7.writeString(r8)
            java.lang.String r8 = r6.messageSlug
            r7.writeString(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsageResponse.writeToParcel(android.os.Parcel, int):void");
    }
}
