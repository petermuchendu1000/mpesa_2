package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PackageList;", "Landroid/os/Parcelable;", "childHeading", "", "childBundles", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SubBundles;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getChildHeading", "()Ljava/lang/String;", "getChildBundles", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PackageList implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PackageList> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("childBundles")
    private final List<SubBundles> childBundles;

    @SerializedName("childHeading")
    private final String childHeading;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PackageList> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PackageList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = component1 + 49;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int i7 = ShareDataUIState + 97;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                for (int i9 = 0; i9 != i6; i9++) {
                    arrayList2.add(SubBundles.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            PackageList packageList = new PackageList(string, arrayList);
            int i10 = ShareDataUIState + 1;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return packageList;
        }

        @Override
        public PackageList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            PackageList packageListCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 69;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return packageListCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PackageList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 81;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            PackageList[] packageListArr = new PackageList[i];
            int i6 = i3 + 125;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return packageListArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public PackageList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 5;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PackageList[] packageListArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 91;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return packageListArrNewArray;
        }
    }

    public PackageList(String str, List<SubBundles> list) {
        this.childHeading = str;
        this.childBundles = list;
    }

    public final String getChildHeading() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.childHeading;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<SubBundles> getChildBundles() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.childBundles;
        }
        throw null;
    }

    static {
        int i = copydefault + 121;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PackageList copy$default(PackageList packageList, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 51;
        component3 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 119;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                String str2 = packageList.childHeading;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = packageList.childHeading;
        }
        if ((i & 2) != 0) {
            int i6 = component3 + 95;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            list = packageList.childBundles;
        }
        return packageList.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.childHeading;
        }
        throw null;
    }

    public final List<SubBundles> component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<SubBundles> list = this.childBundles;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final PackageList copy(String childHeading, List<SubBundles> childBundles) {
        int i = 2 % 2;
        PackageList packageList = new PackageList(childHeading, childBundles);
        int i2 = component1 + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return packageList;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageList)) {
            int i4 = i2 + 117;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        PackageList packageList = (PackageList) other;
        if (!Intrinsics.areEqual(this.childHeading, packageList.childHeading)) {
            return false;
        }
        if (Intrinsics.areEqual(this.childBundles, packageList.childBundles)) {
            return true;
        }
        int i6 = component3 + 117;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.childHeading;
        if (str == null) {
            int i5 = i2 + 37;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<SubBundles> list = this.childBundles;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PackageList(childHeading=" + this.childHeading + ", childBundles=" + this.childBundles + ")";
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.childHeading);
        List<SubBundles> list = this.childBundles;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<SubBundles> it = list.iterator();
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = component3 + 97;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                throw null;
            }
            it.next().writeToParcel(dest, flags);
            int i5 = component3 + 27;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 5;
            }
        }
    }
}
