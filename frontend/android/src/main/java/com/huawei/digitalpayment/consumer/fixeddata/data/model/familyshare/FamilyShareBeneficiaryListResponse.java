package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\b\u0010\u001b\u001a\u00020\u0005H\u0007J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020\u0005H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiaryListResponse;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "beneficiaryLimit", "", "beneficiaryCount", "resourcePool", "beneficiaries", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiary;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryLimit", "()I", "getBeneficiaryCount", "getResourcePool", "getBeneficiaries", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareBeneficiaryListResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FamilyShareBeneficiaryListResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("beneficiaries")
    private final List<FamilyShareBeneficiary> beneficiaries;

    @SerializedName("beneficiaryCount")
    private final int beneficiaryCount;

    @SerializedName("beneficiaryLimit")
    private final int beneficiaryLimit;

    @SerializedName("resourcePool")
    private final String resourcePool;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyShareBeneficiaryListResponse> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareBeneficiaryListResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 != i4) {
                int i6 = ShareDataUIState + 85;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(FamilyShareBeneficiary.CREATOR.createFromParcel(parcel));
                i5++;
                int i8 = copydefault + 31;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            }
            return new FamilyShareBeneficiaryListResponse(string, i2, i3, string2, arrayList);
        }

        @Override
        public FamilyShareBeneficiaryListResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 79;
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
        public final FamilyShareBeneficiaryListResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 57;
            int i4 = i3 % 128;
            copydefault = i4;
            FamilyShareBeneficiaryListResponse[] familyShareBeneficiaryListResponseArr = new FamilyShareBeneficiaryListResponse[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return familyShareBeneficiaryListResponseArr;
        }

        @Override
        public FamilyShareBeneficiaryListResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 61;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FamilyShareBeneficiaryListResponse[] familyShareBeneficiaryListResponseArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 47 / 0;
            }
            int i6 = ShareDataUIState + 115;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return familyShareBeneficiaryListResponseArrNewArray;
        }
    }

    public FamilyShareBeneficiaryListResponse(String str, int i, int i2, String str2, List<FamilyShareBeneficiary> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.sponsorMsisdn = str;
        this.beneficiaryLimit = i;
        this.beneficiaryCount = i2;
        this.resourcePool = str2;
        this.beneficiaries = list;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getBeneficiaryLimit() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.beneficiaryLimit;
        if (i3 == 0) {
            int i5 = 75 / 0;
        }
        return i4;
    }

    public final int getBeneficiaryCount() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.beneficiaryCount;
        if (i3 != 0) {
            int i5 = 24 / 0;
        }
        return i4;
    }

    public final String getResourcePool() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resourcePool;
        int i5 = i2 + 109;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<FamilyShareBeneficiary> getBeneficiaries() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<FamilyShareBeneficiary> list = this.beneficiaries;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return list;
    }

    static {
        int i = ShareDataUIState + 9;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FamilyShareBeneficiaryListResponse copy$default(FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse, String str, int i, int i2, String str2, List list, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = component1 + 3;
        int i6 = i5 % 128;
        copydefault = i6;
        int i7 = i5 % 2;
        if ((i3 & 1) != 0) {
            str = familyShareBeneficiaryListResponse.sponsorMsisdn;
        }
        String str3 = str;
        if ((i3 & 2) != 0) {
            int i8 = i6 + 63;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            i = familyShareBeneficiaryListResponse.beneficiaryLimit;
            if (i9 != 0) {
                int i10 = 82 / 0;
            }
        }
        int i11 = i;
        Object obj2 = null;
        if ((i3 & 4) != 0) {
            int i12 = component1 + 47;
            copydefault = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = familyShareBeneficiaryListResponse.beneficiaryCount;
                obj2.hashCode();
                throw null;
            }
            i2 = familyShareBeneficiaryListResponse.beneficiaryCount;
        }
        int i14 = i2;
        if ((i3 & 8) != 0) {
            int i15 = copydefault + 105;
            component1 = i15 % 128;
            if (i15 % 2 != 0) {
                String str4 = familyShareBeneficiaryListResponse.resourcePool;
                obj2.hashCode();
                throw null;
            }
            str2 = familyShareBeneficiaryListResponse.resourcePool;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            int i16 = component1 + 123;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            list = familyShareBeneficiaryListResponse.beneficiaries;
        }
        return familyShareBeneficiaryListResponse.copy(str3, i11, i14, str5, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.beneficiaryLimit;
        int i6 = i2 + 29;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.beneficiaryCount;
        if (i3 != 0) {
            int i5 = 59 / 0;
        }
        return i4;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.resourcePool;
        int i4 = i2 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<FamilyShareBeneficiary> component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<FamilyShareBeneficiary> list = this.beneficiaries;
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final FamilyShareBeneficiaryListResponse copy(String sponsorMsisdn, int beneficiaryLimit, int beneficiaryCount, String resourcePool, List<FamilyShareBeneficiary> beneficiaries) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaries, "");
        FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse = new FamilyShareBeneficiaryListResponse(sponsorMsisdn, beneficiaryLimit, beneficiaryCount, resourcePool, beneficiaries);
        int i2 = component1 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return familyShareBeneficiaryListResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyShareBeneficiaryListResponse)) {
            int i5 = i3 + 113;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        FamilyShareBeneficiaryListResponse familyShareBeneficiaryListResponse = (FamilyShareBeneficiaryListResponse) other;
        if (!Intrinsics.areEqual(this.sponsorMsisdn, familyShareBeneficiaryListResponse.sponsorMsisdn)) {
            int i7 = component1 + 35;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.beneficiaryLimit != familyShareBeneficiaryListResponse.beneficiaryLimit) {
            return false;
        }
        if (this.beneficiaryCount != familyShareBeneficiaryListResponse.beneficiaryCount) {
            int i9 = component1 + 15;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.resourcePool, familyShareBeneficiaryListResponse.resourcePool)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.beneficiaries, familyShareBeneficiaryListResponse.beneficiaries))) {
            return true;
        }
        int i11 = copydefault + 7;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.sponsorMsisdn.hashCode();
        int iHashCode2 = Integer.hashCode(this.beneficiaryLimit);
        int iHashCode3 = Integer.hashCode(this.beneficiaryCount);
        String str = this.resourcePool;
        int iHashCode4 = (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.beneficiaries.hashCode();
        int i4 = component1 + 77;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareBeneficiaryListResponse(sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryLimit=" + this.beneficiaryLimit + ", beneficiaryCount=" + this.beneficiaryCount + ", resourcePool=" + this.resourcePool + ", beneficiaries=" + this.beneficiaries + ")";
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.sponsorMsisdn);
        dest.writeInt(this.beneficiaryLimit);
        dest.writeInt(this.beneficiaryCount);
        dest.writeString(this.resourcePool);
        List<FamilyShareBeneficiary> list = this.beneficiaries;
        dest.writeInt(list.size());
        Iterator<FamilyShareBeneficiary> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i4 = component1 + 3;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
