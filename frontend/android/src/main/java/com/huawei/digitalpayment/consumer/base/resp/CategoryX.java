package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0013\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\tJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/CategoryX;", "Landroid/os/Parcelable;", "default", "", "externalCategoryIds", "", "", GriverCacheDao.COLUMN_CACHE_ID, "order", "", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExternalCategoryIds", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/base/resp/CategoryX;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CategoryX implements Parcelable {
    public static final Parcelable.Creator<CategoryX> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("default")
    private final Boolean default;

    @SerializedName("externalCategoryIds")
    private final List<String> externalCategoryIds;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @SerializedName("order")
    private final Integer order;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryX> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CategoryX createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = copydefault + 49;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                numValueOf.hashCode();
                throw null;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i4 = component1 + 71;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i6 = component1 + 1;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new CategoryX(boolValueOf, arrayListCreateStringArrayList, string, numValueOf);
        }

        @Override
        public CategoryX createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            CategoryX categoryXCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 74 / 0;
            }
            return categoryXCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CategoryX[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 125;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            CategoryX[] categoryXArr = new CategoryX[i];
            int i6 = i4 + 19;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return categoryXArr;
        }

        @Override
        public CategoryX[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 67;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            CategoryX[] categoryXArrNewArray = newArray(i);
            int i4 = component1 + 31;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return categoryXArrNewArray;
            }
            throw null;
        }
    }

    public CategoryX(Boolean bool, List<String> list, String str, Integer num) {
        this.default = bool;
        this.externalCategoryIds = list;
        this.id = str;
        this.order = num;
    }

    public final Boolean getDefault() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.default;
            int i4 = 98 / 0;
        } else {
            bool = this.default;
        }
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return bool;
    }

    public final List<String> getExternalCategoryIds() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.externalCategoryIds;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOrder() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.order;
            int i4 = 30 / 0;
        } else {
            num = this.order;
        }
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 47;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CategoryX copy$default(CategoryX categoryX, Boolean bool, List list, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 41;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            bool = categoryX.default;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 15;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            list = categoryX.externalCategoryIds;
        }
        if ((i & 4) != 0) {
            int i8 = ShareDataUIState;
            int i9 = i8 + 79;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            String str2 = categoryX.id;
            int i11 = i8 + 29;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            str = str2;
        }
        if ((i & 8) != 0) {
            num = categoryX.order;
        }
        return categoryX.copy(bool, list, str, num);
    }

    public final Boolean component1() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            bool = this.default;
            int i4 = 3 / 0;
        } else {
            bool = this.default;
        }
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<String> list = this.externalCategoryIds;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.order;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CategoryX copy(Boolean bool, List<String> externalCategoryIds, String id, Integer order) {
        int i = 2 % 2;
        CategoryX categoryX = new CategoryX(bool, externalCategoryIds, id, order);
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return categoryX;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryX)) {
            int i2 = ShareDataUIState + 5;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        CategoryX categoryX = (CategoryX) other;
        if (!Intrinsics.areEqual(this.default, categoryX.default)) {
            int i3 = ShareDataUIState + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.externalCategoryIds, categoryX.externalCategoryIds)) {
            int i5 = ShareDataUIState + 85;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, categoryX.id)) {
            return false;
        }
        if (Intrinsics.areEqual(this.order, categoryX.order)) {
            return true;
        }
        int i7 = ShareDataUIState + 51;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Boolean bool = this.default;
        if (bool == null) {
            int i2 = component1 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        List<String> list = this.externalCategoryIds;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.id;
        if (str == null) {
            int i4 = component1 + 91;
            ShareDataUIState = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        Integer num = this.order;
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CategoryX(default=" + this.default + ", externalCategoryIds=" + this.externalCategoryIds + ", id=" + this.id + ", order=" + this.order + ")";
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        Boolean bool = this.default;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
            int i2 = component1 + 111;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 4;
            }
        }
        dest.writeStringList(this.externalCategoryIds);
        dest.writeString(this.id);
        Integer num = this.order;
        if (num != null) {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        } else {
            int i4 = ShareDataUIState + 89;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        }
    }
}
