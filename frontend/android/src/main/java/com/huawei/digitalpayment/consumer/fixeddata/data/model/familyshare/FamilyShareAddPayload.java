package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddPayload;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "beneficiaryMsisdn", "resources", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "getResources", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareAddPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FamilyShareAddPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("resources")
    private final List<FamilyShareAddResource> resources;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyShareAddPayload> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareAddPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = ShareDataUIState + 75;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(FamilyShareAddResource.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = ShareDataUIState + 93;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
            return new FamilyShareAddPayload(string, string2, arrayList);
        }

        @Override
        public FamilyShareAddPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareAddPayload familyShareAddPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
            int i5 = component2 + 91;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return familyShareAddPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareAddPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 71;
            component2 = i3 % 128;
            FamilyShareAddPayload[] familyShareAddPayloadArr = new FamilyShareAddPayload[i];
            if (i3 % 2 != 0) {
                int i4 = 1 / 0;
            }
            return familyShareAddPayloadArr;
        }

        @Override
        public FamilyShareAddPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 7;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            FamilyShareAddPayload[] familyShareAddPayloadArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 17;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return familyShareAddPayloadArrNewArray;
            }
            throw null;
        }
    }

    public FamilyShareAddPayload(String str, String str2, List<FamilyShareAddResource> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.sponsorMsisdn = str;
        this.beneficiaryMsisdn = str2;
        this.resources = list;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<FamilyShareAddResource> getResources() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<FamilyShareAddResource> list = this.resources;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 81;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FamilyShareAddPayload copy$default(FamilyShareAddPayload familyShareAddPayload, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 45;
            int i4 = i3 % 128;
            component2 = i4;
            if (i3 % 2 != 0) {
                str = familyShareAddPayload.sponsorMsisdn;
                int i5 = 49 / 0;
            } else {
                str = familyShareAddPayload.sponsorMsisdn;
            }
            int i6 = i4 + 29;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 5;
            }
        }
        if ((i & 2) != 0) {
            str2 = familyShareAddPayload.beneficiaryMsisdn;
        }
        if ((i & 4) != 0) {
            list = familyShareAddPayload.resources;
        }
        return familyShareAddPayload.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<FamilyShareAddResource> component3() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<FamilyShareAddResource> list = this.resources;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return list;
    }

    public final FamilyShareAddPayload copy(String sponsorMsisdn, String beneficiaryMsisdn, List<FamilyShareAddResource> resources) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(resources, "");
        FamilyShareAddPayload familyShareAddPayload = new FamilyShareAddPayload(sponsorMsisdn, beneficiaryMsisdn, resources);
        int i2 = component3 + 39;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return familyShareAddPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 41;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof FamilyShareAddPayload)) {
            return false;
        }
        FamilyShareAddPayload familyShareAddPayload = (FamilyShareAddPayload) other;
        if (!Intrinsics.areEqual(this.sponsorMsisdn, familyShareAddPayload.sponsorMsisdn)) {
            int i7 = component2 + 21;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, familyShareAddPayload.beneficiaryMsisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.resources, familyShareAddPayload.resources)) {
            return true;
        }
        int i9 = component2 + 115;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.sponsorMsisdn.hashCode() * 31) + this.beneficiaryMsisdn.hashCode()) * 31) + this.resources.hashCode();
        int i4 = component3 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareAddPayload(sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", resources=" + this.resources + ")";
        int i2 = component2 + 115;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator<FamilyShareAddResource> it;
        int i = 2 % 2;
        int i2 = component3 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.sponsorMsisdn);
            dest.writeString(this.beneficiaryMsisdn);
            List<FamilyShareAddResource> list = this.resources;
            dest.writeInt(list.size());
            it = list.iterator();
            int i4 = 85 / 0;
        } else {
            dest.writeString(this.sponsorMsisdn);
            dest.writeString(this.beneficiaryMsisdn);
            List<FamilyShareAddResource> list2 = this.resources;
            dest.writeInt(list2.size());
            it = list2.iterator();
        }
        while (!(!it.hasNext())) {
            it.next().writeToParcel(dest, flags);
            int i5 = component2 + 121;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
