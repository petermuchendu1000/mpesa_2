package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavouritesUpdateRequest;", "Landroid/os/Parcelable;", "subMenuIds", "", "msisdn", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubMenuIds", "()Ljava/lang/String;", "getMsisdn", "getCategory", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouritesUpdateRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FavouritesUpdateRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("subMenuIds")
    private final String subMenuIds;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavouritesUpdateRequest> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavouritesUpdateRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FavouritesUpdateRequest favouritesUpdateRequest = new FavouritesUpdateRequest(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 43;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return favouritesUpdateRequest;
            }
            throw null;
        }

        @Override
        public FavouritesUpdateRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FavouritesUpdateRequest favouritesUpdateRequestCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 11;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return favouritesUpdateRequestCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavouritesUpdateRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 97;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            FavouritesUpdateRequest[] favouritesUpdateRequestArr = new FavouritesUpdateRequest[i];
            int i6 = i4 + 111;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return favouritesUpdateRequestArr;
            }
            throw null;
        }

        @Override
        public FavouritesUpdateRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 125;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FavouritesUpdateRequest[] favouritesUpdateRequestArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 37 / 0;
            }
            return favouritesUpdateRequestArrNewArray;
        }
    }

    public FavouritesUpdateRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.subMenuIds = str;
        this.msisdn = str2;
        this.category = str3;
    }

    public final String getSubMenuIds() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.subMenuIds;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.msisdn;
            int i4 = 11 / 0;
        } else {
            str = this.msisdn;
        }
        int i5 = i2 + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 85;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static FavouritesUpdateRequest copy$default(FavouritesUpdateRequest favouritesUpdateRequest, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 77;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = favouritesUpdateRequest.subMenuIds;
        }
        if ((i & 2) != 0) {
            str2 = favouritesUpdateRequest.msisdn;
        }
        if ((i & 4) != 0) {
            str3 = favouritesUpdateRequest.category;
            int i5 = i4 + 51;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return favouritesUpdateRequest.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subMenuIds;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return str;
    }

    public final FavouritesUpdateRequest copy(String subMenuIds, String msisdn, String category) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(subMenuIds, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(category, "");
        FavouritesUpdateRequest favouritesUpdateRequest = new FavouritesUpdateRequest(subMenuIds, msisdn, category);
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return favouritesUpdateRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavouritesUpdateRequest)) {
            return false;
        }
        FavouritesUpdateRequest favouritesUpdateRequest = (FavouritesUpdateRequest) other;
        if (!Intrinsics.areEqual(this.subMenuIds, favouritesUpdateRequest.subMenuIds)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, favouritesUpdateRequest.msisdn)) {
            int i2 = component2 + 121;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.category, favouritesUpdateRequest.category)) {
            return false;
        }
        int i4 = component2 + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.subMenuIds.hashCode();
        return i3 != 0 ? (((iHashCode + 92) >> this.msisdn.hashCode()) + 21) % this.category.hashCode() : (((iHashCode * 31) + this.msisdn.hashCode()) * 31) + this.category.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavouritesUpdateRequest(subMenuIds=" + this.subMenuIds + ", msisdn=" + this.msisdn + ", category=" + this.category + ")";
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.subMenuIds);
        dest.writeString(this.msisdn);
        dest.writeString(this.category);
        int i4 = component3 + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
    }
}
