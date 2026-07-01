package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0018H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaMatrixResponse;", "Landroid/os/Parcelable;", "resourceName", "", "resourceType", PESActivity.EXTRA_BONGA_POINTS, "resourceUnit", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResourceName", "()Ljava/lang/String;", "getResourceType", "getBongaPoints", "getResourceUnit", "getDisplayName", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaMatrixResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaMatrixResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName(PESActivity.EXTRA_BONGA_POINTS)
    private final String bongaPoints;

    @SerializedName("displayName")
    private final String displayName;

    @SerializedName("resourceName")
    private final String resourceName;

    @SerializedName("resourceType")
    private final String resourceType;

    @SerializedName("resourceUnit")
    private final String resourceUnit;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaMatrixResponse> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaMatrixResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaMatrixResponse bongaMatrixResponse = new BongaMatrixResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return bongaMatrixResponse;
        }

        @Override
        public BongaMatrixResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            BongaMatrixResponse bongaMatrixResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 9;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return bongaMatrixResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaMatrixResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 1;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            BongaMatrixResponse[] bongaMatrixResponseArr = new BongaMatrixResponse[i];
            int i6 = i3 + 125;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return bongaMatrixResponseArr;
        }

        @Override
        public BongaMatrixResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 9;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BongaMatrixResponse[] bongaMatrixResponseArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 59;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return bongaMatrixResponseArrNewArray;
        }
    }

    public BongaMatrixResponse(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.resourceName = str;
        this.resourceType = str2;
        this.bongaPoints = str3;
        this.resourceUnit = str4;
        this.displayName = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaMatrixResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        if ((i & 1) != 0) {
            int i2 = component2 + 41;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = component3 + 61;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        String str8 = (i & 8) == 0 ? str4 : "";
        if ((i & 16) != 0) {
            int i8 = component3;
            int i9 = i8 + 35;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 92 / 0;
            }
            int i11 = i8 + 91;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str5 = null;
        }
        this(str, str6, str7, str8, str5);
    }

    public final String getResourceName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.resourceName;
        int i4 = i2 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.resourceType;
        int i4 = i2 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBongaPoints() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.bongaPoints;
        int i5 = i3 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResourceUnit() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resourceUnit;
        }
        throw null;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.displayName;
        int i4 = i3 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resourceName;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 85;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BongaMatrixResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static BongaMatrixResponse copy$default(BongaMatrixResponse bongaMatrixResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 3;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 109;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = bongaMatrixResponse.resourceName;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i8 = i4 + 53;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str2 = bongaMatrixResponse.resourceType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bongaMatrixResponse.bongaPoints;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i10 = i4 + 9;
            component2 = i10 % 128;
            if (i10 % 2 != 0) {
                String str9 = bongaMatrixResponse.resourceUnit;
                throw null;
            }
            str4 = bongaMatrixResponse.resourceUnit;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i11 = component2 + 91;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str5 = bongaMatrixResponse.displayName;
            if (i12 == 0) {
                int i13 = 29 / 0;
            }
        }
        return bongaMatrixResponse.copy(str6, str7, str8, str10, str5);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.resourceName;
            int i4 = 76 / 0;
        } else {
            str = this.resourceName;
        }
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resourceType;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.bongaPoints;
        int i4 = i2 + 27;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.resourceUnit;
            int i4 = 77 / 0;
        } else {
            str = this.resourceUnit;
        }
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.displayName;
        }
        throw null;
    }

    public final BongaMatrixResponse copy(String resourceName, String resourceType, String bongaPoints, String resourceUnit, String displayName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resourceName, "");
        Intrinsics.checkNotNullParameter(resourceType, "");
        Intrinsics.checkNotNullParameter(bongaPoints, "");
        Intrinsics.checkNotNullParameter(resourceUnit, "");
        BongaMatrixResponse bongaMatrixResponse = new BongaMatrixResponse(resourceName, resourceType, bongaPoints, resourceUnit, displayName);
        int i2 = component3 + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bongaMatrixResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 75;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BongaMatrixResponse)) {
            int i4 = component2 + 71;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BongaMatrixResponse bongaMatrixResponse = (BongaMatrixResponse) other;
        if (!Intrinsics.areEqual(this.resourceName, bongaMatrixResponse.resourceName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.resourceType, bongaMatrixResponse.resourceType)) {
            int i6 = component2 + 9;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bongaPoints, bongaMatrixResponse.bongaPoints)) {
            return false;
        }
        if (Intrinsics.areEqual(this.resourceUnit, bongaMatrixResponse.resourceUnit)) {
            if (Intrinsics.areEqual(this.displayName, bongaMatrixResponse.displayName)) {
                return true;
            }
            int i8 = component3 + 113;
            component2 = i8 % 128;
            return i8 % 2 != 0;
        }
        int i9 = component2 + 119;
        component3 = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.resourceName.hashCode();
        int iHashCode2 = this.resourceType.hashCode();
        int iHashCode3 = this.bongaPoints.hashCode();
        int iHashCode4 = this.resourceUnit.hashCode();
        String str = this.displayName;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode5 = str.hashCode();
            int i5 = component3 + 31;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
            i = iHashCode5;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.resourceName);
        dest.writeString(this.resourceType);
        dest.writeString(this.bongaPoints);
        dest.writeString(this.resourceUnit);
        dest.writeString(this.displayName);
        int i4 = component2 + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
