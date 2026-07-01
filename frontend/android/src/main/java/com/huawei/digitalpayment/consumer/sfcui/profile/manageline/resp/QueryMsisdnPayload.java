package com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/QueryMsisdnPayload;", "Landroid/os/Parcelable;", "documentId", "", "documentType", "msisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentId", "()Ljava/lang/String;", "getDocumentType", "getMsisdn", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryMsisdnPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<QueryMsisdnPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("documentId")
    private final String documentId;

    @SerializedName("documentType")
    private final String documentType;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QueryMsisdnPayload> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QueryMsisdnPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            QueryMsisdnPayload queryMsisdnPayload = new QueryMsisdnPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 83;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return queryMsisdnPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public QueryMsisdnPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 11;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            QueryMsisdnPayload queryMsisdnPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 39;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return queryMsisdnPayloadCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QueryMsisdnPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 27;
            int i4 = i3 % 128;
            copydefault = i4;
            Object obj = null;
            QueryMsisdnPayload[] queryMsisdnPayloadArr = new QueryMsisdnPayload[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 109;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return queryMsisdnPayloadArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public QueryMsisdnPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            QueryMsisdnPayload[] queryMsisdnPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 21 / 0;
            }
            return queryMsisdnPayloadArrNewArray;
        }
    }

    public QueryMsisdnPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.documentId = str;
        this.documentType = str2;
        this.msisdn = str3;
    }

    public final String getDocumentId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.documentId;
        int i5 = i2 + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDocumentType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.documentType;
        int i4 = i3 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        throw null;
    }

    static {
        int i = component1 + 95;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static QueryMsisdnPayload copy$default(QueryMsisdnPayload queryMsisdnPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = queryMsisdnPayload.documentId;
            int i3 = component3 + 49;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 107;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str2 = queryMsisdnPayload.documentType;
        }
        if ((i & 4) != 0) {
            str3 = queryMsisdnPayload.msisdn;
            int i7 = ShareDataUIState + 55;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        return queryMsisdnPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.documentId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.documentType;
        int i4 = i3 + 101;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final QueryMsisdnPayload copy(String documentId, String documentType, String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(documentId, "");
        Intrinsics.checkNotNullParameter(documentType, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        QueryMsisdnPayload queryMsisdnPayload = new QueryMsisdnPayload(documentId, documentType, msisdn);
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return queryMsisdnPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryMsisdnPayload)) {
            return false;
        }
        QueryMsisdnPayload queryMsisdnPayload = (QueryMsisdnPayload) other;
        if (!Intrinsics.areEqual(this.documentId, queryMsisdnPayload.documentId)) {
            int i2 = component3 + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.documentType, queryMsisdnPayload.documentType)) {
            int i4 = component3 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, queryMsisdnPayload.msisdn)) {
            int i6 = component3 + 15;
            ShareDataUIState = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = ShareDataUIState + 83;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.documentId.hashCode();
        return i3 != 0 ? (((iHashCode << 110) % this.documentType.hashCode()) % 49) * this.msisdn.hashCode() : (((iHashCode * 31) + this.documentType.hashCode()) * 31) + this.msisdn.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryMsisdnPayload(documentId=" + this.documentId + ", documentType=" + this.documentType + ", msisdn=" + this.msisdn + ")";
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.documentId);
            dest.writeString(this.documentType);
            dest.writeString(this.msisdn);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.documentId);
        dest.writeString(this.documentType);
        dest.writeString(this.msisdn);
        int i4 = ShareDataUIState + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
