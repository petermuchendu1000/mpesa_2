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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYProductCatalogResponse;", "Landroid/os/Parcelable;", "diyPackages", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYPackage;", "packageName", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDiyPackages", "()Ljava/util/List;", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DIYProductCatalogResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DIYProductCatalogResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("packageList")
    private final List<DIYPackage> diyPackages;

    @SerializedName("packageName")
    private final String packageName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DIYProductCatalogResponse> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYProductCatalogResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = component2 + 21;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(DIYPackage.CREATOR.createFromParcel(parcel));
                    i3 += 29;
                } else {
                    arrayList.add(DIYPackage.CREATOR.createFromParcel(parcel));
                    i3++;
                }
                int i5 = component2 + 95;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
            return new DIYProductCatalogResponse(arrayList, parcel.readString());
        }

        @Override
        public DIYProductCatalogResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            DIYProductCatalogResponse dIYProductCatalogResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            int i5 = copydefault + 71;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
            }
            return dIYProductCatalogResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYProductCatalogResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 77;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            DIYProductCatalogResponse[] dIYProductCatalogResponseArr = new DIYProductCatalogResponse[i];
            int i6 = i4 + 81;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 27 / 0;
            }
            return dIYProductCatalogResponseArr;
        }

        @Override
        public DIYProductCatalogResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 109;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            DIYProductCatalogResponse[] dIYProductCatalogResponseArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 91 / 0;
            }
            int i6 = component2 + 47;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 6 / 0;
            }
            return dIYProductCatalogResponseArrNewArray;
        }
    }

    public DIYProductCatalogResponse(List<DIYPackage> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.diyPackages = list;
        this.packageName = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DIYProductCatalogResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 11;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            str = "";
            int i4 = component3 + 27;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this(list, str);
    }

    public final List<DIYPackage> getDiyPackages() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.diyPackages;
        }
        throw null;
    }

    public final String getPackageName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.packageName;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 105;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DIYProductCatalogResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DIYProductCatalogResponse copy$default(DIYProductCatalogResponse dIYProductCatalogResponse, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            list = dIYProductCatalogResponse.diyPackages;
            int i6 = i3 + 93;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 17;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str = dIYProductCatalogResponse.packageName;
            if (i9 == 0) {
                int i10 = 13 / 0;
            }
        }
        return dIYProductCatalogResponse.copy(list, str);
    }

    public final List<DIYPackage> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<DIYPackage> list = this.diyPackages;
        int i4 = i2 + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.packageName;
        int i4 = i2 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final DIYProductCatalogResponse copy(List<DIYPackage> diyPackages, String packageName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(diyPackages, "");
        Intrinsics.checkNotNullParameter(packageName, "");
        DIYProductCatalogResponse dIYProductCatalogResponse = new DIYProductCatalogResponse(diyPackages, packageName);
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return dIYProductCatalogResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DIYProductCatalogResponse)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.diyPackages, ((DIYProductCatalogResponse) other).diyPackages)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.packageName, r6.packageName)) {
            int i4 = component3 + 87;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component3 + 79;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.diyPackages.hashCode() >> 103) * this.packageName.hashCode() : (this.diyPackages.hashCode() * 31) + this.packageName.hashCode();
        int i3 = ShareDataUIState + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DIYProductCatalogResponse(diyPackages=" + this.diyPackages + ", packageName=" + this.packageName + ")";
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            List<DIYPackage> list = this.diyPackages;
            dest.writeInt(list.size());
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<DIYPackage> list2 = this.diyPackages;
        dest.writeInt(list2.size());
        Iterator<DIYPackage> it = list2.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i4 = ShareDataUIState + 31;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 4;
            }
        }
        dest.writeString(this.packageName);
    }
}
