package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0005H\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "Landroid/os/Parcelable;", "imageExtension", "", "pages", "", "<init>", "(Ljava/lang/String;I)V", "getImageExtension", "()Ljava/lang/String;", "getPages", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OptimizedAttributes implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OptimizedAttributes> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("imageExtension")
    private final String imageExtension;

    @SerializedName("pages")
    private final int pages;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OptimizedAttributes> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OptimizedAttributes createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OptimizedAttributes optimizedAttributes = new OptimizedAttributes(parcel.readString(), parcel.readInt());
            int i2 = component3 + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return optimizedAttributes;
        }

        @Override
        public OptimizedAttributes createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            OptimizedAttributes optimizedAttributesCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 5;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return optimizedAttributesCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OptimizedAttributes[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            OptimizedAttributes[] optimizedAttributesArr = new OptimizedAttributes[i];
            int i6 = i4 + 63;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 12 / 0;
            }
            return optimizedAttributesArr;
        }

        @Override
        public OptimizedAttributes[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 31;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            OptimizedAttributes[] optimizedAttributesArrNewArray = newArray(i);
            int i5 = component3 + 85;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return optimizedAttributesArrNewArray;
        }
    }

    public OptimizedAttributes(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageExtension = str;
        this.pages = i;
    }

    public final String getImageExtension() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imageExtension;
        }
        throw null;
    }

    public final int getPages() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pages;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 25;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static OptimizedAttributes copy$default(OptimizedAttributes optimizedAttributes, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState;
        int i5 = i4 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 15;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str = optimizedAttributes.imageExtension;
        }
        if ((i2 & 2) != 0) {
            i = optimizedAttributes.pages;
            int i9 = i4 + 47;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return optimizedAttributes.copy(str, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imageExtension;
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.pages;
        int i6 = i2 + 45;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final OptimizedAttributes copy(String imageExtension, int pages) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(imageExtension, "");
        OptimizedAttributes optimizedAttributes = new OptimizedAttributes(imageExtension, pages);
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return optimizedAttributes;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimizedAttributes)) {
            return false;
        }
        OptimizedAttributes optimizedAttributes = (OptimizedAttributes) other;
        if (!Intrinsics.areEqual(this.imageExtension, optimizedAttributes.imageExtension)) {
            int i4 = ShareDataUIState + 111;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.pages == optimizedAttributes.pages) {
            return true;
        }
        int i6 = ShareDataUIState + 1;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.imageExtension.hashCode() << 9) >>> Integer.hashCode(this.pages) : (this.imageExtension.hashCode() * 31) + Integer.hashCode(this.pages);
        int i3 = ShareDataUIState + 29;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OptimizedAttributes(imageExtension=" + this.imageExtension + ", pages=" + this.pages + ")";
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.imageExtension);
        dest.writeInt(this.pages);
        int i4 = copydefault + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
