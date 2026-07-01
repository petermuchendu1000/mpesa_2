package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ImageData;", "Landroid/os/Parcelable;", "hashMatches", "", "icon", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getHashMatches", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/resp/ImageData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageData implements Parcelable {
    public static final Parcelable.Creator<ImageData> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;

    @SerializedName("hashMatches")
    private final Boolean hashMatches;

    @SerializedName("icon")
    private final String icon;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageData> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImageData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = component3 + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i4 = component2 + 115;
                component3 = i4 % 128;
                boolValueOf = null;
                if (i4 % 2 == 0) {
                    boolValueOf.hashCode();
                    throw null;
                }
            } else {
                if (parcel.readInt() != 0) {
                    int i5 = component3 + 113;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
                int i7 = component3 + 113;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
            ImageData imageData = new ImageData(boolValueOf, parcel.readString());
            int i9 = component3 + 59;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return imageData;
        }

        @Override
        public ImageData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ImageData imageDataCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return imageDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImageData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 23;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ImageData[] imageDataArr = new ImageData[i];
            int i6 = i3 + 87;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return imageDataArr;
        }

        @Override
        public ImageData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 31;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ImageData[] imageDataArrNewArray = newArray(i);
            int i5 = component2 + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return imageDataArrNewArray;
        }
    }

    public ImageData(Boolean bool, String str) {
        this.hashMatches = bool;
        this.icon = str;
    }

    public final Boolean getHashMatches() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            bool = this.hashMatches;
            int i4 = 46 / 0;
        } else {
            bool = this.hashMatches;
        }
        int i5 = i3 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.icon;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 67;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ImageData copy$default(ImageData imageData, Boolean bool, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 103;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            bool = imageData.hashMatches;
        }
        if ((i & 2) != 0) {
            str = imageData.icon;
        }
        ImageData imageDataCopy = imageData.copy(bool, str);
        int i5 = component1 + 29;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return imageDataCopy;
    }

    public final Boolean component1() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.hashMatches;
            int i4 = 29 / 0;
        } else {
            bool = this.hashMatches;
        }
        int i5 = i2 + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.icon;
        int i4 = i2 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final ImageData copy(Boolean hashMatches, String icon) {
        int i = 2 % 2;
        ImageData imageData = new ImageData(hashMatches, icon);
        int i2 = component2 + 73;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return imageData;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ImageData)) {
            int i4 = component2 + 53;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ImageData imageData = (ImageData) other;
        if (!Intrinsics.areEqual(this.hashMatches, imageData.hashMatches)) {
            return false;
        }
        if (Intrinsics.areEqual(this.icon, imageData.icon)) {
            return true;
        }
        int i6 = component2 + 5;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.resp.ImageData.component1
            int r2 = r1 + 7
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.ImageData.component2 = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L18
            java.lang.Boolean r2 = r6.hashMatches
            if (r2 != 0) goto L16
            r2 = r4
            goto L1d
        L16:
            r3 = r4
            goto L28
        L18:
            java.lang.Boolean r2 = r6.hashMatches
            if (r2 != 0) goto L28
            r2 = r3
        L1d:
            int r1 = r1 + 45
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.ImageData.component2 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            r3 = r4
            goto L2e
        L28:
            int r1 = r2.hashCode()
            r2 = r3
            r3 = r1
        L2e:
            java.lang.String r1 = r6.icon
            if (r1 != 0) goto L33
            goto L40
        L33:
            int r2 = r1.hashCode()
            int r1 = com.huawei.digitalpayment.consumer.base.resp.ImageData.component1
            int r1 = r1 + 105
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.ImageData.component2 = r4
            int r1 = r1 % r0
        L40:
            int r3 = r3 * 31
            int r3 = r3 + r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ImageData.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImageData(hashMatches=" + this.hashMatches + ", icon=" + this.icon + ")";
        int i2 = component2 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iBooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        Boolean bool = this.hashMatches;
        if (bool == null) {
            int i2 = component1;
            int i3 = i2 + 43;
            component2 = i3 % 128;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 105;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iBooleanValue = z;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        int i6 = component1 + 23;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 5;
        }
        dest.writeString(this.icon);
    }
}
