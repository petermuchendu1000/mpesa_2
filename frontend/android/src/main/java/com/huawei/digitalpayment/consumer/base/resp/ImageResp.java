package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ImageResp;", "Landroid/os/Parcelable;", "globalStatus", "", "iconResponse", "Lcom/huawei/digitalpayment/consumer/base/resp/IconResponse;", "requestId", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/resp/IconResponse;Ljava/lang/String;)V", "getGlobalStatus", "()Ljava/lang/String;", "getIconResponse", "()Lcom/huawei/digitalpayment/consumer/base/resp/IconResponse;", "getRequestId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageResp implements Parcelable {
    public static final Parcelable.Creator<ImageResp> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("globalStatus")
    private final String globalStatus;

    @SerializedName("iconResponse")
    private final IconResponse iconResponse;

    @SerializedName("requestId")
    private final String requestId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageResp> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImageResp createFromParcel(Parcel parcel) {
            IconResponse iconResponse;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = ShareDataUIState + 77;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                iconResponse = null;
            } else {
                IconResponse iconResponseCreateFromParcel = IconResponse.CREATOR.createFromParcel(parcel);
                int i4 = ShareDataUIState + 71;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                iconResponse = iconResponseCreateFromParcel;
            }
            return new ImageResp(string, iconResponse, parcel.readString());
        }

        @Override
        public ImageResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ImageResp imageRespCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 3;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return imageRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImageResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 7;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ImageResp[] imageRespArr = new ImageResp[i];
            int i6 = i3 + 119;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return imageRespArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ImageResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 123;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            ImageResp[] imageRespArrNewArray = newArray(i);
            int i4 = copydefault + 79;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return imageRespArrNewArray;
            }
            throw null;
        }
    }

    public ImageResp(String str, IconResponse iconResponse, String str2) {
        this.globalStatus = str;
        this.iconResponse = iconResponse;
        this.requestId = str2;
    }

    public final String getGlobalStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.globalStatus;
        int i5 = i3 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IconResponse getIconResponse() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        IconResponse iconResponse = this.iconResponse;
        int i4 = i3 + 25;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iconResponse;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestId;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 17;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static ImageResp copy$default(ImageResp imageResp, String str, IconResponse iconResponse, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 73;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            String str3 = imageResp.globalStatus;
            int i6 = i3 + 31;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = str3;
        }
        if ((i & 2) != 0) {
            int i8 = component3 + 117;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            iconResponse = imageResp.iconResponse;
        }
        if ((i & 4) != 0) {
            int i10 = ShareDataUIState + 67;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            str2 = imageResp.requestId;
        }
        return imageResp.copy(str, iconResponse, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.globalStatus;
        int i5 = i2 + 25;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final IconResponse component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IconResponse iconResponse = this.iconResponse;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return iconResponse;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.requestId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImageResp copy(String globalStatus, IconResponse iconResponse, String requestId) {
        int i = 2 % 2;
        ImageResp imageResp = new ImageResp(globalStatus, iconResponse, requestId);
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return imageResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 43;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof ImageResp)) {
            int i3 = component3 + 27;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        ImageResp imageResp = (ImageResp) other;
        if (!Intrinsics.areEqual(this.globalStatus, imageResp.globalStatus) || !Intrinsics.areEqual(this.iconResponse, imageResp.iconResponse)) {
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, imageResp.requestId)) {
            return true;
        }
        int i5 = component3 + 75;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.globalStatus;
        if (str == null) {
            int i5 = i2 + 23;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = component3 + 85;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        IconResponse iconResponse = this.iconResponse;
        int iHashCode2 = iconResponse == null ? 0 : iconResponse.hashCode();
        String str2 = this.requestId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImageResp(globalStatus=" + this.globalStatus + ", iconResponse=" + this.iconResponse + ", requestId=" + this.requestId + ")";
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.globalStatus);
        IconResponse iconResponse = this.iconResponse;
        if (iconResponse == null) {
            int i2 = ShareDataUIState + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconResponse.writeToParcel(dest, flags);
        }
        dest.writeString(this.requestId);
        int i4 = ShareDataUIState + 91;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }
}
