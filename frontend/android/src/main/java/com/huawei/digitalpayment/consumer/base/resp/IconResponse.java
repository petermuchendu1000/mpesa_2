package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/IconResponse;", "Landroid/os/Parcelable;", "datum", "Lcom/huawei/digitalpayment/consumer/base/resp/ImageData;", "requestId", "", "status", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/ImageData;Ljava/lang/String;Ljava/lang/String;)V", "getDatum", "()Lcom/huawei/digitalpayment/consumer/base/resp/ImageData;", "getRequestId", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IconResponse implements Parcelable {
    public static final Parcelable.Creator<IconResponse> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("data")
    private final ImageData datum;

    @SerializedName("requestId")
    private final String requestId;

    @SerializedName("status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconResponse> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IconResponse createFromParcel(Parcel parcel) {
            ImageData imageDataCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i2 = component3 + 75;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                imageDataCreateFromParcel = null;
            } else {
                imageDataCreateFromParcel = ImageData.CREATOR.createFromParcel(parcel);
            }
            IconResponse iconResponse = new IconResponse(imageDataCreateFromParcel, parcel.readString(), parcel.readString());
            int i4 = ShareDataUIState + 89;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iconResponse;
        }

        @Override
        public IconResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            IconResponse iconResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
            int i5 = component3 + 63;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return iconResponseCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IconResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 19;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            IconResponse[] iconResponseArr = new IconResponse[i];
            int i6 = i4 + 109;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return iconResponseArr;
        }

        @Override
        public IconResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 105;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            IconResponse[] iconResponseArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 37;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return iconResponseArrNewArray;
            }
            throw null;
        }
    }

    public IconResponse(ImageData imageData, String str, String str2) {
        this.datum = imageData;
        this.requestId = str;
        this.status = str2;
    }

    public final ImageData getDatum() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ImageData imageData = this.datum;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return imageData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestId;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    public final String getStatus() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.status;
            int i4 = 26 / 0;
        } else {
            str = this.status;
        }
        int i5 = i3 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 73;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 50 / 0;
        }
    }

    public static IconResponse copy$default(IconResponse iconResponse, ImageData imageData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            imageData = iconResponse.datum;
        }
        if ((i & 2) != 0) {
            str = iconResponse.requestId;
            int i3 = component3 + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 99;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = iconResponse.status;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = iconResponse.status;
        }
        return iconResponse.copy(imageData, str, str2);
    }

    public final ImageData component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ImageData imageData = this.datum;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return imageData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.status;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final IconResponse copy(ImageData datum, String requestId, String status) {
        int i = 2 % 2;
        IconResponse iconResponse = new IconResponse(datum, requestId, status);
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return iconResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconResponse)) {
            int i4 = i3 + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        IconResponse iconResponse = (IconResponse) other;
        if (!Intrinsics.areEqual(this.datum, iconResponse.datum)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, iconResponse.requestId)) {
            int i6 = component3 + 115;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.status, iconResponse.status)) {
            return true;
        }
        int i8 = component3 + 49;
        component1 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 14 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        ImageData imageData = this.datum;
        if (imageData == null) {
            int i2 = component1 + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = imageData.hashCode();
        }
        String str = this.requestId;
        if (str == null) {
            int i4 = component1 + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
            int i6 = component1 + 15;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str2 = this.status;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IconResponse(datum=" + this.datum + ", requestId=" + this.requestId + ", status=" + this.status + ")";
        int i2 = component1 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        ImageData imageData = this.datum;
        if (imageData == null) {
            int i2 = component1 + 73;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
            int i4 = component3 + 35;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            dest.writeInt(1);
            imageData.writeToParcel(dest, flags);
        }
        dest.writeString(this.requestId);
        dest.writeString(this.status);
    }
}
