package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.http.appserver.interceptor.AppServerPostParamsInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001a\u001a\u00020\bH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\bH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceRequestHeader;", "Landroid/os/Parcelable;", "requestRefID", "", "timestamp", "", "operationName", "operationVersion", "", "sourceSystem", "<init>", "(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V", "getRequestRefID", "()Ljava/lang/String;", "getTimestamp", "()J", "getOperationName", "getOperationVersion", "()I", "getSourceSystem", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceRequestHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ImtServiceRequestHeader> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("OperationName")
    private final String operationName;

    @SerializedName("OperationVersion")
    private final int operationVersion;

    @SerializedName("RequestRefID")
    private final String requestRefID;

    @SerializedName("SourceSystem")
    private final String sourceSystem;

    @SerializedName(AppServerPostParamsInterceptor.TIME_STAMP)
    private final long timestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceRequestHeader> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceRequestHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ImtServiceRequestHeader imtServiceRequestHeader = new ImtServiceRequestHeader(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString());
            int i2 = component1 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return imtServiceRequestHeader;
        }

        @Override
        public ImtServiceRequestHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ImtServiceRequestHeader imtServiceRequestHeaderCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 77;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return imtServiceRequestHeaderCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceRequestHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 79;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            ImtServiceRequestHeader[] imtServiceRequestHeaderArr = new ImtServiceRequestHeader[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 27;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return imtServiceRequestHeaderArr;
        }

        @Override
        public ImtServiceRequestHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceRequestHeader[] imtServiceRequestHeaderArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 29;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return imtServiceRequestHeaderArrNewArray;
        }
    }

    public ImtServiceRequestHeader(String str, long j, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestRefID = str;
        this.timestamp = j;
        this.operationName = str2;
        this.operationVersion = i;
        this.sourceSystem = str3;
    }

    public final String getRequestRefID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.requestRefID;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long getTimestamp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        long j = this.timestamp;
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
        int i6 = i3 + 125;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final String getOperationName() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.operationName;
        int i4 = i3 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getOperationVersion() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.operationVersion;
        int i6 = i2 + 7;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getSourceSystem() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.sourceSystem;
        int i4 = i2 + 125;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component3 + 57;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static ImtServiceRequestHeader copy$default(ImtServiceRequestHeader imtServiceRequestHeader, String str, long j, String str2, int i, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = copydefault + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str = imtServiceRequestHeader.requestRefID;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            j = imtServiceRequestHeader.timestamp;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            int i6 = copydefault + 101;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str2 = imtServiceRequestHeader.operationName;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = imtServiceRequestHeader.operationVersion;
        }
        int i8 = i;
        if ((i2 & 16) != 0) {
            str3 = imtServiceRequestHeader.sourceSystem;
        }
        ImtServiceRequestHeader imtServiceRequestHeaderCopy = imtServiceRequestHeader.copy(str4, j2, str5, i8, str3);
        int i9 = ShareDataUIState + 43;
        copydefault = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 80 / 0;
        }
        return imtServiceRequestHeaderCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestRefID;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component2() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.timestamp;
        }
        int i3 = 85 / 0;
        return this.timestamp;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.operationName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.operationVersion;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return i4;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.sourceSystem;
        int i4 = i2 + 101;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ImtServiceRequestHeader copy(String requestRefID, long timestamp, String operationName, int operationVersion, String sourceSystem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestRefID, "");
        Intrinsics.checkNotNullParameter(operationName, "");
        Intrinsics.checkNotNullParameter(sourceSystem, "");
        ImtServiceRequestHeader imtServiceRequestHeader = new ImtServiceRequestHeader(requestRefID, timestamp, operationName, operationVersion, sourceSystem);
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return imtServiceRequestHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImtServiceRequestHeader)) {
            int i2 = ShareDataUIState + 11;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ImtServiceRequestHeader imtServiceRequestHeader = (ImtServiceRequestHeader) other;
        if (!Intrinsics.areEqual(this.requestRefID, imtServiceRequestHeader.requestRefID)) {
            int i4 = copydefault + 105;
            ShareDataUIState = i4 % 128;
            return i4 % 2 == 0;
        }
        if (this.timestamp != imtServiceRequestHeader.timestamp) {
            int i5 = copydefault + 21;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
            }
            return false;
        }
        if (!(!Intrinsics.areEqual(this.operationName, imtServiceRequestHeader.operationName))) {
            return this.operationVersion == imtServiceRequestHeader.operationVersion && Intrinsics.areEqual(this.sourceSystem, imtServiceRequestHeader.sourceSystem);
        }
        int i7 = copydefault + 117;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.requestRefID.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.operationName.hashCode()) * 31) + Integer.hashCode(this.operationVersion)) * 31) + this.sourceSystem.hashCode();
        int i4 = ShareDataUIState + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceRequestHeader(requestRefID=" + this.requestRefID + ", timestamp=" + this.timestamp + ", operationName=" + this.operationName + ", operationVersion=" + this.operationVersion + ", sourceSystem=" + this.sourceSystem + ')';
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.requestRefID);
            dest.writeLong(this.timestamp);
            dest.writeString(this.operationName);
            dest.writeInt(this.operationVersion);
            dest.writeString(this.sourceSystem);
            int i4 = 84 / 0;
        } else {
            dest.writeString(this.requestRefID);
            dest.writeLong(this.timestamp);
            dest.writeString(this.operationName);
            dest.writeInt(this.operationVersion);
            dest.writeString(this.sourceSystem);
        }
        int i5 = ShareDataUIState + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
    }
}
