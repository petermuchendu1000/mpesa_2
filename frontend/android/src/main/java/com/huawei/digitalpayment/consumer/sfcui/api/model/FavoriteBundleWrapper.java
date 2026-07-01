package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "Landroid/os/Parcelable;", "menuInfoCategory", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/MenuInfoCategory;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/MenuInfoCategory;)V", "getMenuInfoCategory", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/MenuInfoCategory;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteBundleWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FavoriteBundleWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("menuInfoCategory")
    private final MenuInfoCategory menuInfoCategory;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteBundleWrapper> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavoriteBundleWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FavoriteBundleWrapper favoriteBundleWrapper = new FavoriteBundleWrapper(MenuInfoCategory.CREATOR.createFromParcel(parcel));
            int i2 = component3 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return favoriteBundleWrapper;
        }

        @Override
        public FavoriteBundleWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FavoriteBundleWrapper favoriteBundleWrapperCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 87;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return favoriteBundleWrapperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavoriteBundleWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 17;
            component2 = i3 % 128;
            FavoriteBundleWrapper[] favoriteBundleWrapperArr = new FavoriteBundleWrapper[i];
            if (i3 % 2 == 0) {
                return favoriteBundleWrapperArr;
            }
            throw null;
        }

        @Override
        public FavoriteBundleWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 107;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FavoriteBundleWrapper[] favoriteBundleWrapperArrNewArray = newArray(i);
            int i4 = component2 + 35;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return favoriteBundleWrapperArrNewArray;
        }
    }

    public FavoriteBundleWrapper(MenuInfoCategory menuInfoCategory) {
        Intrinsics.checkNotNullParameter(menuInfoCategory, "");
        this.menuInfoCategory = menuInfoCategory;
    }

    public final MenuInfoCategory getMenuInfoCategory() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MenuInfoCategory menuInfoCategory = this.menuInfoCategory;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return menuInfoCategory;
    }

    static {
        int i = component2 + 113;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavoriteBundleWrapper copy$default(FavoriteBundleWrapper favoriteBundleWrapper, MenuInfoCategory menuInfoCategory, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 35;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            menuInfoCategory = favoriteBundleWrapper.menuInfoCategory;
        }
        FavoriteBundleWrapper favoriteBundleWrapperCopy = favoriteBundleWrapper.copy(menuInfoCategory);
        int i8 = copydefault + 29;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return favoriteBundleWrapperCopy;
    }

    public final MenuInfoCategory component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MenuInfoCategory menuInfoCategory = this.menuInfoCategory;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return menuInfoCategory;
    }

    public final FavoriteBundleWrapper copy(MenuInfoCategory menuInfoCategory) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuInfoCategory, "");
        FavoriteBundleWrapper favoriteBundleWrapper = new FavoriteBundleWrapper(menuInfoCategory);
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return favoriteBundleWrapper;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 97;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof FavoriteBundleWrapper)) {
            return false;
        }
        if (Intrinsics.areEqual(this.menuInfoCategory, ((FavoriteBundleWrapper) other).menuInfoCategory)) {
            return true;
        }
        int i3 = copydefault + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.menuInfoCategory.hashCode();
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteBundleWrapper(menuInfoCategory=" + this.menuInfoCategory + ")";
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.menuInfoCategory.writeToParcel(dest, flags);
        int i4 = ShareDataUIState + 115;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
