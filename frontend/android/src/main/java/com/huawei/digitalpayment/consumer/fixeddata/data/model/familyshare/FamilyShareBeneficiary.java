package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareBeneficiary;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "resources", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareResource;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getResources", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareBeneficiary implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FamilyShareBeneficiary> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("resources")
    private final List<FamilyShareResource> resources;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyShareBeneficiary> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareBeneficiary createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = component2 + 67;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(FamilyShareResource.CREATOR.createFromParcel(parcel));
                    i3 += 21;
                } else {
                    arrayList.add(FamilyShareResource.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            return new FamilyShareBeneficiary(string, arrayList);
        }

        @Override
        public FamilyShareBeneficiary createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareBeneficiary familyShareBeneficiaryCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return familyShareBeneficiaryCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareBeneficiary[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 41;
            component2 = i3 % 128;
            FamilyShareBeneficiary[] familyShareBeneficiaryArr = new FamilyShareBeneficiary[i];
            if (i3 % 2 == 0) {
                int i4 = 23 / 0;
            }
            return familyShareBeneficiaryArr;
        }

        @Override
        public FamilyShareBeneficiary[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 27;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            FamilyShareBeneficiary[] familyShareBeneficiaryArrNewArray = newArray(i);
            int i4 = component2 + 47;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return familyShareBeneficiaryArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public FamilyShareBeneficiary(String str, List<FamilyShareResource> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.beneficiaryMsisdn = str;
        this.resources = list;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.beneficiaryMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FamilyShareResource> getResources() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<FamilyShareResource> list = this.resources;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 49;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FamilyShareBeneficiary copy$default(FamilyShareBeneficiary familyShareBeneficiary, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 123;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = familyShareBeneficiary.beneficiaryMsisdn;
        }
        if ((i & 2) != 0) {
            list = familyShareBeneficiary.resources;
            int i5 = i4 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return familyShareBeneficiary.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final List<FamilyShareResource> component2() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<FamilyShareResource> list = this.resources;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final FamilyShareBeneficiary copy(String beneficiaryMsisdn, List<FamilyShareResource> resources) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(resources, "");
        FamilyShareBeneficiary familyShareBeneficiary = new FamilyShareBeneficiary(beneficiaryMsisdn, resources);
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return familyShareBeneficiary;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = (i2 % 2 != 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.beneficiaryMsisdn, r6.beneficiaryMsisdn) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.component2 + 37;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.resources, r6.resources) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r2 = r2 + 63;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.copydefault = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.copydefault
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.component2 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 39
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary
            if (r1 == 0) goto L3f
            com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary r6 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary) r6
            java.lang.String r1 = r5.beneficiaryMsisdn
            java.lang.String r2 = r6.beneficiaryMsisdn
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L33
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.component2
            int r6 = r6 + 37
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.copydefault = r1
            int r6 = r6 % r0
            return r4
        L33:
            java.util.List<com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareResource> r0 = r5.resources
            java.util.List<com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareResource> r6 = r6.resources
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            int r2 = r2 + 63
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.copydefault = r6
            int r2 = r2 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare.FamilyShareBeneficiary.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.beneficiaryMsisdn.hashCode();
        return i3 == 0 ? (iHashCode + 3) << this.resources.hashCode() : (iHashCode * 31) + this.resources.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareBeneficiary(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", resources=" + this.resources + ")";
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.beneficiaryMsisdn);
        List<FamilyShareResource> list = this.resources;
        dest.writeInt(list.size());
        Iterator<FamilyShareResource> it = list.iterator();
        while (it.hasNext()) {
            int i4 = copydefault + 43;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i5 = 26 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
    }
}
