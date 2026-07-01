package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "Landroid/os/Parcelable;", "packageName", "", "packageList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PackageList;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPackageName", "()Ljava/lang/String;", "getPackageList", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Plans implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Plans> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("packageList")
    private final List<PackageList> packageList;

    @SerializedName("packageName")
    private final String packageName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Plans> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Plans createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = copydefault + 35;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 != i2; i5++) {
                    int i6 = copydefault + 79;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList2.add(PackageList.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Plans(string, arrayList);
        }

        @Override
        public Plans createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Plans plansCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return plansCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Plans[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 125;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            Plans[] plansArr = new Plans[i];
            int i6 = i3 + 77;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return plansArr;
        }

        @Override
        public Plans[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 17;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            Plans[] plansArrNewArray = newArray(i);
            int i4 = copydefault + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return plansArrNewArray;
        }
    }

    public Plans(String str, List<PackageList> list) {
        this.packageName = str;
        this.packageList = list;
    }

    public final String getPackageName() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.packageName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<PackageList> getPackageList() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<PackageList> list = this.packageList;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return list;
    }

    static {
        int i = component3 + 85;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Plans copy$default(Plans plans, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component1 + 119;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = plans.packageName;
                obj2.hashCode();
                throw null;
            }
            str = plans.packageName;
        }
        if ((i & 2) != 0) {
            int i4 = component1 + 67;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                List<PackageList> list2 = plans.packageList;
                throw null;
            }
            list = plans.packageList;
        }
        return plans.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.packageName;
        int i4 = i2 + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<PackageList> component2() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<PackageList> list = this.packageList;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return list;
    }

    public final Plans copy(String packageName, List<PackageList> packageList) {
        int i = 2 % 2;
        Plans plans = new Plans(packageName, packageList);
        int i2 = component1 + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return plans;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 119;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof Plans)) {
            return false;
        }
        Plans plans = (Plans) other;
        if (!Intrinsics.areEqual(this.packageName, plans.packageName)) {
            int i3 = component2 + 19;
            component1 = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.packageList, plans.packageList)) {
            return true;
        }
        int i4 = component1 + 1;
        component2 = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.component2
            int r2 = r1 + 19
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.component1 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L17
            java.lang.String r2 = r6.packageName
            r4 = 1
            if (r2 != 0) goto L15
            goto L1c
        L15:
            r3 = r4
            goto L2f
        L17:
            java.lang.String r2 = r6.packageName
            if (r2 != 0) goto L2f
            r4 = r3
        L1c:
            int r2 = r1 + 115
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.component1 = r5
            int r2 = r2 % r0
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L35
            r1 = 3
            int r1 = r1 / r0
            goto L35
        L2f:
            int r1 = r2.hashCode()
            r4 = r3
            r3 = r1
        L35:
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.PackageList> r1 = r6.packageList
            if (r1 != 0) goto L43
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.component2
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.component1 = r2
            int r1 = r1 % r0
            goto L47
        L43:
            int r4 = r1.hashCode()
        L47:
            int r3 = r3 * 31
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Plans(packageName=" + this.packageName + ", packageList=" + this.packageList + ")";
        int i2 = component2 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.packageName);
        List<PackageList> list = this.packageList;
        if (list == null) {
            int i4 = component2 + 61;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<PackageList> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        int i5 = component2 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
