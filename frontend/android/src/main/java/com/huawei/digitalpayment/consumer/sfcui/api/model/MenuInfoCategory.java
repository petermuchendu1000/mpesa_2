package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/MenuInfoCategory;", "Landroid/os/Parcelable;", "favoriteBundles", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "<init>", "(Ljava/util/List;)V", "getFavoriteBundles", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuInfoCategory implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MenuInfoCategory> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(FavouriteBundlesService.BUNDLES_PARAM)
    private final List<FavoriteBundle> favoriteBundles;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MenuInfoCategory> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MenuInfoCategory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = copydefault + 41;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(FavoriteBundle.CREATOR.createFromParcel(parcel));
            }
            MenuInfoCategory menuInfoCategory = new MenuInfoCategory(arrayList);
            int i6 = component2 + 117;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return menuInfoCategory;
        }

        @Override
        public MenuInfoCategory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 45;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            MenuInfoCategory menuInfoCategoryCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 47;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return menuInfoCategoryCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MenuInfoCategory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 73;
            int i4 = i3 % 128;
            copydefault = i4;
            MenuInfoCategory[] menuInfoCategoryArr = new MenuInfoCategory[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 3;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return menuInfoCategoryArr;
        }

        @Override
        public MenuInfoCategory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 123;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            MenuInfoCategory[] menuInfoCategoryArrNewArray = newArray(i);
            int i5 = component2 + 73;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return menuInfoCategoryArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public MenuInfoCategory(List<FavoriteBundle> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.favoriteBundles = list;
    }

    public final List<FavoriteBundle> getFavoriteBundles() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<FavoriteBundle> list = this.favoriteBundles;
        int i4 = i2 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return list;
    }

    static {
        int i = ShareDataUIState + 69;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MenuInfoCategory copy$default(MenuInfoCategory menuInfoCategory, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            int i6 = i3 + 111;
            int i7 = i6 % 128;
            copydefault = i7;
            int i8 = i6 % 2;
            List<FavoriteBundle> list2 = menuInfoCategory.favoriteBundles;
            int i9 = i7 + 85;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 4;
            }
            list = list2;
        }
        return menuInfoCategory.copy(list);
    }

    public final List<FavoriteBundle> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.favoriteBundles;
        }
        throw null;
    }

    public final MenuInfoCategory copy(List<FavoriteBundle> favoriteBundles) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(favoriteBundles, "");
        MenuInfoCategory menuInfoCategory = new MenuInfoCategory(favoriteBundles);
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return menuInfoCategory;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 61;
            copydefault = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof MenuInfoCategory)) {
            return false;
        }
        if (Intrinsics.areEqual(this.favoriteBundles, ((MenuInfoCategory) other).favoriteBundles)) {
            return true;
        }
        int i6 = component3 + 25;
        copydefault = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.favoriteBundles.hashCode();
        int i4 = component3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MenuInfoCategory(favoriteBundles=" + this.favoriteBundles + ")";
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<FavoriteBundle> list = this.favoriteBundles;
        dest.writeInt(list.size());
        Iterator<FavoriteBundle> it = list.iterator();
        while (it.hasNext()) {
            int i4 = component3 + 95;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
    }
}
