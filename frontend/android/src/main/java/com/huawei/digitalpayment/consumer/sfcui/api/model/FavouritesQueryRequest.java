package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavouritesQueryRequest;", "Landroid/os/Parcelable;", "msisdn", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getCategory", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouritesQueryRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FavouritesQueryRequest> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavouritesQueryRequest> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavouritesQueryRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FavouritesQueryRequest favouritesQueryRequest = new FavouritesQueryRequest(parcel.readString(), parcel.readString());
            int i2 = component3 + 81;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return favouritesQueryRequest;
        }

        @Override
        public FavouritesQueryRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FavouritesQueryRequest favouritesQueryRequestCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 69;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return favouritesQueryRequestCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavouritesQueryRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 69;
            component3 = i3 % 128;
            FavouritesQueryRequest[] favouritesQueryRequestArr = new FavouritesQueryRequest[i];
            if (i3 % 2 == 0) {
                return favouritesQueryRequestArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FavouritesQueryRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            FavouritesQueryRequest[] favouritesQueryRequestArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 54 / 0;
            }
            return favouritesQueryRequestArrNewArray;
        }
    }

    public FavouritesQueryRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.msisdn = str;
        this.category = str2;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.category;
        int i4 = i2 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component2 + 119;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    public static FavouritesQueryRequest copy$default(FavouritesQueryRequest favouritesQueryRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 107;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = favouritesQueryRequest.msisdn;
            int i8 = i3 + 27;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 2) != 0) {
            int i10 = component1 + 81;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                String str3 = favouritesQueryRequest.category;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = favouritesQueryRequest.category;
        }
        return favouritesQueryRequest.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FavouritesQueryRequest copy(String msisdn, String category) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(category, "");
        FavouritesQueryRequest favouritesQueryRequest = new FavouritesQueryRequest(msisdn, category);
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return favouritesQueryRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        copydefault = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 5;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FavouritesQueryRequest)) {
            int i4 = component1 + 121;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        FavouritesQueryRequest favouritesQueryRequest = (FavouritesQueryRequest) other;
        if (Intrinsics.areEqual(this.msisdn, favouritesQueryRequest.msisdn)) {
            return Intrinsics.areEqual(this.category, favouritesQueryRequest.category);
        }
        int i6 = component1 + 35;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.msisdn.hashCode() * 31) + this.category.hashCode();
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavouritesQueryRequest(msisdn=" + this.msisdn + ", category=" + this.category + ")";
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.category);
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
