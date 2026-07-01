package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleValidationItem;", "Landroid/os/Parcelable;", LottieConstants.PARAM_MAX_VALUE, "", LottieConstants.PARAM_MIN_VALUE, "name", "", "validity", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getMax", "()I", "getMin", "getName", "()Ljava/lang/String;", "getValidity", "toString", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleValidationItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MakeUrBundleValidationItem> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName(LottieConstants.PARAM_MAX_VALUE)
    private final int max;

    @SerializedName(LottieConstants.PARAM_MIN_VALUE)
    private final int min;

    @SerializedName("name")
    private final String name;

    @SerializedName("validity")
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MakeUrBundleValidationItem> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MakeUrBundleValidationItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MakeUrBundleValidationItem makeUrBundleValidationItem = new MakeUrBundleValidationItem(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = component2 + 19;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return makeUrBundleValidationItem;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public MakeUrBundleValidationItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 33;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MakeUrBundleValidationItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 9;
            copydefault = i4 % 128;
            MakeUrBundleValidationItem[] makeUrBundleValidationItemArr = new MakeUrBundleValidationItem[i];
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            int i6 = i3 + 19;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return makeUrBundleValidationItemArr;
            }
            throw null;
        }

        @Override
        public MakeUrBundleValidationItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 111;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            MakeUrBundleValidationItem[] makeUrBundleValidationItemArrNewArray = newArray(i);
            int i5 = copydefault + 87;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return makeUrBundleValidationItemArrNewArray;
            }
            throw null;
        }
    }

    public MakeUrBundleValidationItem(int i, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.max = i;
        this.min = i2;
        this.name = str;
        this.validity = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MakeUrBundleValidationItem(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = component3 + 17;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        if ((i3 & 2) != 0) {
            int i6 = component3 + 27;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            int i8 = component2;
            int i9 = i8 + 5;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 59 / 0;
            }
            int i11 = i8 + 57;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str = "";
        }
        if ((i3 & 8) != 0) {
            int i14 = component3 + 115;
            component2 = i14 % 128;
            if (i14 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i15 = 2 % 2;
            str2 = "";
        }
        this(i, i2, str, str2);
    }

    public final int getMax() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.max;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getMin() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.min;
            int i5 = 49 / 0;
        } else {
            i = this.min;
        }
        int i6 = i3 + 19;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        int i3 = 2 / 0;
        return this.name;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 53;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public MakeUrBundleValidationItem() {
        this(0, 0, null, null, 15, null);
    }

    public static MakeUrBundleValidationItem copy$default(MakeUrBundleValidationItem makeUrBundleValidationItem, int i, int i2, String str, String str2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            i = makeUrBundleValidationItem.max;
            int i5 = component2 + 113;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 3;
            }
        }
        if ((i3 & 2) != 0) {
            int i7 = component3 + 31;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            i2 = makeUrBundleValidationItem.min;
        }
        if ((i3 & 4) != 0) {
            str = makeUrBundleValidationItem.name;
        }
        if ((i3 & 8) != 0) {
            str2 = makeUrBundleValidationItem.validity;
        }
        return makeUrBundleValidationItem.copy(i, i2, str, str2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.max;
        int i6 = i3 + 107;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.min;
        int i6 = i2 + 15;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 45;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MakeUrBundleValidationItem copy(int max, int min, String name, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(validity, "");
        MakeUrBundleValidationItem makeUrBundleValidationItem = new MakeUrBundleValidationItem(max, min, name, validity);
        int i2 = component3 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return makeUrBundleValidationItem;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        int i4 = i3 % 128;
        component3 = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i5 = i2 + 83;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof MakeUrBundleValidationItem)) {
            int i7 = i2 + 41;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 88 / 0;
            }
            return false;
        }
        MakeUrBundleValidationItem makeUrBundleValidationItem = (MakeUrBundleValidationItem) other;
        if (this.max != makeUrBundleValidationItem.max) {
            int i9 = i4 + 33;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i4 + 13;
            component2 = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (this.min != makeUrBundleValidationItem.min) {
            int i12 = i2 + 11;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, makeUrBundleValidationItem.name)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.validity, makeUrBundleValidationItem.validity))) {
            return true;
        }
        int i14 = component2 + 27;
        component3 = i14 % 128;
        return i14 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.max) * 31) + Integer.hashCode(this.min)) * 31) + this.name.hashCode()) * 31) + this.validity.hashCode();
        int i4 = component2 + 47;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeInt(this.max);
            dest.writeInt(this.min);
            dest.writeString(this.name);
            dest.writeString(this.validity);
            int i4 = 57 / 0;
        } else {
            dest.writeInt(this.max);
            dest.writeInt(this.min);
            dest.writeString(this.name);
            dest.writeString(this.validity);
        }
        int i5 = component2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
    }
}
