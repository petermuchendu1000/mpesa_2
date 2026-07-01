package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.blankj.utilcode.constant.PermissionConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u0019H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaMatrixUnit;", "Landroid/os/Parcelable;", "resourceName", "", "resourceType", PESActivity.EXTRA_BONGA_POINTS, "resourceUnit", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResourceName", "()Ljava/lang/String;", "getResourceType", "getBongaPoints", "getResourceUnit", "getDisplayName", "toString", "resourceMapper", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaMatrixUnit implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaMatrixUnit> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
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
    public static final class Creator implements Parcelable.Creator<BongaMatrixUnit> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaMatrixUnit createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaMatrixUnit bongaMatrixUnit = new BongaMatrixUnit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 103;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 30 / 0;
            }
            return bongaMatrixUnit;
        }

        @Override
        public BongaMatrixUnit createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BongaMatrixUnit bongaMatrixUnitCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return bongaMatrixUnitCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaMatrixUnit[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 73;
            copydefault = i3 % 128;
            BongaMatrixUnit[] bongaMatrixUnitArr = new BongaMatrixUnit[i];
            if (i3 % 2 == 0) {
                int i4 = 39 / 0;
            }
            return bongaMatrixUnitArr;
        }

        @Override
        public BongaMatrixUnit[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 51;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            BongaMatrixUnit[] bongaMatrixUnitArrNewArray = newArray(i);
            int i4 = copydefault + 83;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 89 / 0;
            }
            return bongaMatrixUnitArrNewArray;
        }
    }

    public BongaMatrixUnit(String str, String str2, String str3, String str4, String str5) {
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
    public BongaMatrixUnit(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8 = "";
        String str9 = null;
        if ((i & 1) != 0) {
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                str9.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 53;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                str9.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 65;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 39;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i9 = ShareDataUIState + 55;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            int i10 = 2 % 2;
        } else {
            str9 = str5;
        }
        this(str, str6, str7, str8, str9);
    }

    public final String getResourceName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resourceName;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBongaPoints() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.bongaPoints;
        int i4 = i2 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getResourceUnit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.resourceUnit;
        int i4 = i3 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.displayName;
        int i4 = i3 + 1;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.displayName;
        if (str != null) {
            int i2 = component2 + 91;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        if (this.resourceUnit.length() == 0) {
            int i4 = ShareDataUIState + 27;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return this.resourceName;
        }
        String str2 = this.resourceUnit + " " + resourceMapper(this.resourceName) + " for " + this.bongaPoints + " bonga points";
        int i6 = ShareDataUIState + 45;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
        return str2;
    }

    private final String resourceMapper(String resourceName) {
        String str;
        int i = 2 % 2;
        String lowerCase = resourceName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "airtime", false, 2, (Object) null)) {
            str = "KSH";
        } else {
            String lowerCase2 = resourceName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "internet", false, 2, (Object) null)) {
                int i2 = component2 + 85;
                ShareDataUIState = i2 % 128;
                str = "MB";
                if (i2 % 2 == 0) {
                    int i3 = 17 / 0;
                }
            } else {
                String lowerCase3 = resourceName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "minutes", false, 2, (Object) null)) {
                    int i4 = ShareDataUIState + 49;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 37 / 0;
                    }
                    str = "KSH";
                } else {
                    String lowerCase4 = resourceName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                    if (StringsKt.contains$default((CharSequence) lowerCase4, (CharSequence) "mms", false, 2, (Object) null)) {
                        str = "MMS";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(resourceName.toLowerCase(Locale.ROOT), "");
                        if (!StringsKt.contains$default((CharSequence) r7, (CharSequence) Keys.BUNDLE_TYPE_SMS, false, 2, (Object) null)) {
                            str = FirebaseAnalytics.Param.ITEMS;
                        } else {
                            int i6 = ShareDataUIState + 111;
                            component2 = i6 % 128;
                            int i7 = i6 % 2;
                            str = PermissionConstants.SMS;
                        }
                    }
                }
            }
        }
        int i8 = ShareDataUIState + 75;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    static {
        int i = component1 + 19;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BongaMatrixUnit() {
        this(null, null, null, null, null, 31, null);
    }

    public static BongaMatrixUnit copy$default(BongaMatrixUnit bongaMatrixUnit, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 1;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = bongaMatrixUnit.resourceName;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = bongaMatrixUnit.resourceType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bongaMatrixUnit.bongaPoints;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 125;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str4 = bongaMatrixUnit.resourceUnit;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bongaMatrixUnit.displayName;
            int i7 = ShareDataUIState + 107;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 3;
            }
        }
        return bongaMatrixUnit.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.resourceName;
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resourceType;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.bongaPoints;
        int i4 = i3 + 31;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resourceUnit;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.displayName;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final BongaMatrixUnit copy(String resourceName, String resourceType, String bongaPoints, String resourceUnit, String displayName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resourceName, "");
        Intrinsics.checkNotNullParameter(resourceType, "");
        Intrinsics.checkNotNullParameter(bongaPoints, "");
        Intrinsics.checkNotNullParameter(resourceUnit, "");
        BongaMatrixUnit bongaMatrixUnit = new BongaMatrixUnit(resourceName, resourceType, bongaPoints, resourceUnit, displayName);
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return bongaMatrixUnit;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaMatrixUnit)) {
            return false;
        }
        BongaMatrixUnit bongaMatrixUnit = (BongaMatrixUnit) other;
        if (!Intrinsics.areEqual(this.resourceName, bongaMatrixUnit.resourceName)) {
            int i2 = component2 + 33;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.resourceType, bongaMatrixUnit.resourceType)) {
            int i4 = ShareDataUIState + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bongaPoints, bongaMatrixUnit.bongaPoints)) {
            int i6 = component2 + 71;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.resourceUnit, bongaMatrixUnit.resourceUnit))) {
            return Intrinsics.areEqual(this.displayName, bongaMatrixUnit.displayName);
        }
        int i8 = ShareDataUIState + 125;
        component2 = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.resourceName.hashCode();
            this.resourceType.hashCode();
            this.bongaPoints.hashCode();
            this.resourceUnit.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.resourceName.hashCode();
        int iHashCode3 = this.resourceType.hashCode();
        int iHashCode4 = this.bongaPoints.hashCode();
        int iHashCode5 = this.resourceUnit.hashCode();
        String str = this.displayName;
        if (str == null) {
            int i3 = component2 + 73;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.resourceName);
        dest.writeString(this.resourceType);
        dest.writeString(this.bongaPoints);
        dest.writeString(this.resourceUnit);
        dest.writeString(this.displayName);
        int i4 = ShareDataUIState + 67;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
