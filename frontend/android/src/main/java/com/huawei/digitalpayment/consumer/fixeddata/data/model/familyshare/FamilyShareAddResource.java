package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonAdapter(FamilyShareAddResourceSerializer.class)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0006H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddResource;", "Landroid/os/Parcelable;", "resourceType", "", "sharingMode", "shareLimitMB", "", "shareLimitMinutes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getResourceType", "()Ljava/lang/String;", "getSharingMode", "getShareLimitMB", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShareLimitMinutes", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareAddResource;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareAddResource implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyShareAddResource> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("resourceType")
    private final String resourceType;

    @SerializedName("shareLimitMB")
    private final Integer shareLimitMB;

    @SerializedName("shareLimitMinutes")
    private final Integer shareLimitMinutes;

    @SerializedName("sharingMode")
    private final String sharingMode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyShareAddResource> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareAddResource createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = component3 + 65;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 3;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 94 / 0;
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                int i6 = component3;
                int i7 = i6 + 1;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                int i8 = i6 + 7;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new FamilyShareAddResource(string, string2, numValueOf, numValueOf2);
        }

        @Override
        public FamilyShareAddResource createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareAddResource familyShareAddResourceCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 93;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return familyShareAddResourceCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareAddResource[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 79;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            FamilyShareAddResource[] familyShareAddResourceArr = new FamilyShareAddResource[i];
            int i6 = i4 + 25;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 75 / 0;
            }
            return familyShareAddResourceArr;
        }

        @Override
        public FamilyShareAddResource[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 125;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FamilyShareAddResource[] familyShareAddResourceArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 70 / 0;
            }
            return familyShareAddResourceArrNewArray;
        }
    }

    public FamilyShareAddResource(String str, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.resourceType = str;
        this.sharingMode = str2;
        this.shareLimitMB = num;
        this.shareLimitMinutes = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FamilyShareAddResource(String str, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copydefault + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            num = null;
        }
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 91;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 4;
            } else {
                int i7 = 2 % 2;
            }
            num2 = null;
        }
        this(str, str2, num, num2);
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSharingMode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.sharingMode;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getShareLimitMB() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.shareLimitMB;
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getShareLimitMinutes() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.shareLimitMinutes;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return num;
    }

    static {
        int i = component3 + 31;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyShareAddResource copy$default(FamilyShareAddResource familyShareAddResource, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = copydefault + 87;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = familyShareAddResource.resourceType;
                obj2.hashCode();
                throw null;
            }
            str = familyShareAddResource.resourceType;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 109;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                String str4 = familyShareAddResource.sharingMode;
                throw null;
            }
            str2 = familyShareAddResource.sharingMode;
        }
        if ((i & 4) != 0) {
            num = familyShareAddResource.shareLimitMB;
        }
        if ((i & 8) != 0) {
            num2 = familyShareAddResource.shareLimitMinutes;
        }
        return familyShareAddResource.copy(str, str2, num, num2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sharingMode;
        }
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.shareLimitMB;
        int i5 = i2 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.shareLimitMinutes;
        int i4 = i2 + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final FamilyShareAddResource copy(String resourceType, String sharingMode, Integer shareLimitMB, Integer shareLimitMinutes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resourceType, "");
        Intrinsics.checkNotNullParameter(sharingMode, "");
        FamilyShareAddResource familyShareAddResource = new FamilyShareAddResource(resourceType, sharingMode, shareLimitMB, shareLimitMinutes);
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return familyShareAddResource;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyShareAddResource)) {
            int i2 = ShareDataUIState + 71;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        FamilyShareAddResource familyShareAddResource = (FamilyShareAddResource) other;
        if (!Intrinsics.areEqual(this.resourceType, familyShareAddResource.resourceType) || !Intrinsics.areEqual(this.sharingMode, familyShareAddResource.sharingMode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.shareLimitMB, familyShareAddResource.shareLimitMB)) {
            int i3 = ShareDataUIState + 23;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.shareLimitMinutes, familyShareAddResource.shareLimitMinutes)) {
            return true;
        }
        int i5 = copydefault;
        int i6 = i5 + 31;
        ShareDataUIState = i6 % 128;
        boolean z = i6 % 2 != 0;
        int i7 = i5 + 87;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.resourceType.hashCode();
        int iHashCode3 = this.sharingMode.hashCode();
        Integer num = this.shareLimitMB;
        if (num == null) {
            iHashCode = 1;
            int i2 = ShareDataUIState + 1;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = 0;
            }
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.shareLimitMinutes;
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (num2 != null ? num2.hashCode() : 0);
        int i3 = copydefault + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareAddResource(resourceType=" + this.resourceType + ", sharingMode=" + this.sharingMode + ", shareLimitMB=" + this.shareLimitMB + ", shareLimitMinutes=" + this.shareLimitMinutes + ")";
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.resourceType);
        dest.writeString(this.sharingMode);
        Integer num = this.shareLimitMB;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.shareLimitMinutes;
        if (num2 != null) {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
            return;
        }
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        dest.writeInt(0);
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
