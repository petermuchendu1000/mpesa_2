package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYPackage;", "Landroid/os/Parcelable;", "diyBundles", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "diyCategoryName", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDiyBundles", "()Ljava/util/List;", "getDiyCategoryName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DIYPackage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DIYPackage> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("childBundles")
    private final List<DIYBundle> diyBundles;

    @SerializedName("childHeading")
    private final String diyCategoryName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DIYPackage> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYPackage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = ShareDataUIState + 13;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(DIYBundle.CREATOR.createFromParcel(parcel));
                    i3 += 92;
                } else {
                    arrayList.add(DIYBundle.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            DIYPackage dIYPackage = new DIYPackage(arrayList, parcel.readString());
            int i5 = component1 + 75;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return dIYPackage;
        }

        @Override
        public DIYPackage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DIYPackage dIYPackageCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 49;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return dIYPackageCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYPackage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            DIYPackage[] dIYPackageArr = new DIYPackage[i];
            int i6 = i3 + 37;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return dIYPackageArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public DIYPackage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            DIYPackage[] dIYPackageArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 71;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return dIYPackageArrNewArray;
        }
    }

    public DIYPackage(List<DIYBundle> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.diyBundles = list;
        this.diyCategoryName = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DIYPackage(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = copydefault + 59;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i7 = 2 % 2;
            str = "";
        }
        this(list, str);
    }

    public final List<DIYBundle> getDiyBundles() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<DIYBundle> list = this.diyBundles;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String getDiyCategoryName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.diyCategoryName;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 61;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DIYPackage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DIYPackage copy$default(DIYPackage dIYPackage, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 23;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            list = dIYPackage.diyBundles;
        }
        if ((i & 2) != 0) {
            str = dIYPackage.diyCategoryName;
        }
        return dIYPackage.copy(list, str);
    }

    public final List<DIYBundle> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<DIYBundle> list = this.diyBundles;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.diyCategoryName;
        int i4 = i2 + 111;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    public final DIYPackage copy(List<DIYBundle> diyBundles, String diyCategoryName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(diyBundles, "");
        Intrinsics.checkNotNullParameter(diyCategoryName, "");
        DIYPackage dIYPackage = new DIYPackage(diyBundles, diyCategoryName);
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return dIYPackage;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DIYPackage)) {
            int i2 = component1 + 59;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        DIYPackage dIYPackage = (DIYPackage) other;
        if (Intrinsics.areEqual(this.diyBundles, dIYPackage.diyBundles)) {
            return Intrinsics.areEqual(this.diyCategoryName, dIYPackage.diyCategoryName);
        }
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.diyBundles.hashCode();
        return i3 == 0 ? (iHashCode >>> 83) / this.diyCategoryName.hashCode() : (iHashCode * 31) + this.diyCategoryName.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DIYPackage(diyBundles=" + this.diyBundles + ", diyCategoryName=" + this.diyCategoryName + ")";
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator<DIYBundle> it;
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            List<DIYBundle> list = this.diyBundles;
            dest.writeInt(list.size());
            it = list.iterator();
            int i4 = 88 / 0;
        } else {
            List<DIYBundle> list2 = this.diyBundles;
            dest.writeInt(list2.size());
            it = list2.iterator();
        }
        while (!(!it.hasNext())) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.diyCategoryName);
        int i5 = copydefault + 11;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
