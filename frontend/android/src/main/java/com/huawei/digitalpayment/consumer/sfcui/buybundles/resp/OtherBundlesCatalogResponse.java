package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OtherBundlesCatalogResponse;", "Landroid/os/Parcelable;", "plans", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "<init>", "(Ljava/util/List;)V", "getPlans", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtherBundlesCatalogResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OtherBundlesCatalogResponse> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("plans")
    private final List<Plans> plans;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OtherBundlesCatalogResponse> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OtherBundlesCatalogResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i2 = component2 + 81;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    int i6 = component1 + 125;
                    component2 = i6 % 128;
                    if (i6 % 2 != 0) {
                        arrayList2.add(Plans.CREATOR.createFromParcel(parcel));
                        i5 += 40;
                    } else {
                        arrayList2.add(Plans.CREATOR.createFromParcel(parcel));
                        i5++;
                    }
                }
                arrayList = arrayList2;
            }
            return new OtherBundlesCatalogResponse(arrayList);
        }

        @Override
        public OtherBundlesCatalogResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            OtherBundlesCatalogResponse otherBundlesCatalogResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 51;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return otherBundlesCatalogResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OtherBundlesCatalogResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 125;
            component2 = i3 % 128;
            OtherBundlesCatalogResponse[] otherBundlesCatalogResponseArr = new OtherBundlesCatalogResponse[i];
            if (i3 % 2 == 0) {
                return otherBundlesCatalogResponseArr;
            }
            throw null;
        }

        @Override
        public OtherBundlesCatalogResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 125;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            OtherBundlesCatalogResponse[] otherBundlesCatalogResponseArrNewArray = newArray(i);
            int i5 = component1 + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return otherBundlesCatalogResponseArrNewArray;
        }
    }

    public OtherBundlesCatalogResponse(List<Plans> list) {
        this.plans = list;
    }

    public final List<Plans> getPlans() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<Plans> list = this.plans;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    static {
        int i = component2 + 51;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OtherBundlesCatalogResponse copy$default(OtherBundlesCatalogResponse otherBundlesCatalogResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 11;
        component1 = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 != 0 ? i4 != 0 : i4 != 0) {
            list = otherBundlesCatalogResponse.plans;
        }
        OtherBundlesCatalogResponse otherBundlesCatalogResponseCopy = otherBundlesCatalogResponse.copy(list);
        int i5 = component1 + 75;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return otherBundlesCatalogResponseCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final List<Plans> component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<Plans> list = this.plans;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final OtherBundlesCatalogResponse copy(List<Plans> plans) {
        int i = 2 % 2;
        OtherBundlesCatalogResponse otherBundlesCatalogResponse = new OtherBundlesCatalogResponse(plans);
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return otherBundlesCatalogResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        copydefault = i2 % 128;
        return 1 ^ (i2 % 2 != 0 ? 0 : 1);
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 103;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof OtherBundlesCatalogResponse)) {
            int i4 = component1 + 3;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.plans, ((OtherBundlesCatalogResponse) other).plans)) {
            return false;
        }
        int i5 = copydefault + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<Plans> list = this.plans;
        if (list == null) {
            int i5 = i3 + 65;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i7 = component1 + 13;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtherBundlesCatalogResponse(plans=" + this.plans + ")";
        int i2 = component1 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r5.writeInt(1);
        r5.writeInt(r1.size());
        r1 = r1.iterator();
        r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.component1 + 51;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.copydefault = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r1.hasNext() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.copydefault + 23;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.component1 = r2 % 128;
        r2 = r2 % 2;
        r1.next().writeToParcel(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5.writeInt(0);
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.component1
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r1 == 0) goto L1b
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans> r1 = r4.plans
            r3 = 3
            int r3 = r3 / r2
            if (r1 != 0) goto L23
            goto L1f
        L1b:
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans> r1 = r4.plans
            if (r1 != 0) goto L23
        L1f:
            r5.writeInt(r2)
            goto L54
        L23:
            r2 = 1
            r5.writeInt(r2)
            int r2 = r1.size()
            r5.writeInt(r2)
            java.util.Iterator r1 = r1.iterator()
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.component1
            int r2 = r2 + 51
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.copydefault = r3
            int r2 = r2 % r0
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.copydefault
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.component1 = r3
            int r2 = r2 % r0
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans r2 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans) r2
            r2.writeToParcel(r5, r6)
            goto L3b
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse.writeToParcel(android.os.Parcel, int):void");
    }
}
