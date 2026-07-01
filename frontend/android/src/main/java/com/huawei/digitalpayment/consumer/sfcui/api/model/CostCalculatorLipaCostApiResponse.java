package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostApiResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostBody;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorLipaCostApiResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostCalculatorLipaCostApiResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("body")
    private final CostCalculatorLipaCostBody body;

    @SerializedName("header")
    private final CostCalculatorHeader header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CostCalculatorLipaCostApiResponse> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorLipaCostApiResponse createFromParcel(Parcel parcel) {
            CostCalculatorHeader costCalculatorHeaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CostCalculatorLipaCostBody costCalculatorLipaCostBodyCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = copydefault + 87;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 48 / 0;
                }
                costCalculatorHeaderCreateFromParcel = null;
            } else {
                costCalculatorHeaderCreateFromParcel = CostCalculatorHeader.CREATOR.createFromParcel(parcel);
            }
            CostCalculatorHeader costCalculatorHeader = costCalculatorHeaderCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                costCalculatorLipaCostBodyCreateFromParcel = CostCalculatorLipaCostBody.CREATOR.createFromParcel(parcel);
            }
            return new CostCalculatorLipaCostApiResponse(costCalculatorHeader, costCalculatorLipaCostBodyCreateFromParcel);
        }

        @Override
        public CostCalculatorLipaCostApiResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorLipaCostApiResponse costCalculatorLipaCostApiResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 77;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return costCalculatorLipaCostApiResponseCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorLipaCostApiResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 15;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            CostCalculatorLipaCostApiResponse[] costCalculatorLipaCostApiResponseArr = new CostCalculatorLipaCostApiResponse[i];
            int i6 = i3 + 71;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return costCalculatorLipaCostApiResponseArr;
            }
            throw null;
        }

        @Override
        public CostCalculatorLipaCostApiResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 21;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            CostCalculatorLipaCostApiResponse[] costCalculatorLipaCostApiResponseArrNewArray = newArray(i);
            int i5 = copydefault + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return costCalculatorLipaCostApiResponseArrNewArray;
        }
    }

    public CostCalculatorLipaCostApiResponse(CostCalculatorHeader costCalculatorHeader, CostCalculatorLipaCostBody costCalculatorLipaCostBody) {
        this.header = costCalculatorHeader;
        this.body = costCalculatorLipaCostBody;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CostCalculatorLipaCostApiResponse(CostCalculatorHeader costCalculatorHeader, CostCalculatorLipaCostBody costCalculatorLipaCostBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 91;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            costCalculatorHeader = null;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 97;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 92 / 0;
            }
            int i5 = 2 % 2;
            costCalculatorLipaCostBody = null;
        }
        this(costCalculatorHeader, costCalculatorLipaCostBody);
    }

    public final CostCalculatorHeader getHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        CostCalculatorHeader costCalculatorHeader = this.header;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorHeader;
    }

    public final CostCalculatorLipaCostBody getBody() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        CostCalculatorLipaCostBody costCalculatorLipaCostBody = this.body;
        int i4 = i2 + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return costCalculatorLipaCostBody;
        }
        throw null;
    }

    static {
        int i = component1 + 5;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CostCalculatorLipaCostApiResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static CostCalculatorLipaCostApiResponse copy$default(CostCalculatorLipaCostApiResponse costCalculatorLipaCostApiResponse, CostCalculatorHeader costCalculatorHeader, CostCalculatorLipaCostBody costCalculatorLipaCostBody, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 117;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            costCalculatorHeader = costCalculatorLipaCostApiResponse.header;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            costCalculatorLipaCostBody = costCalculatorLipaCostApiResponse.body;
        }
        return costCalculatorLipaCostApiResponse.copy(costCalculatorHeader, costCalculatorLipaCostBody);
    }

    public final CostCalculatorHeader component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        CostCalculatorHeader costCalculatorHeader = this.header;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return costCalculatorHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CostCalculatorLipaCostBody component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        CostCalculatorLipaCostBody costCalculatorLipaCostBody = this.body;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorLipaCostBody;
    }

    public final CostCalculatorLipaCostApiResponse copy(CostCalculatorHeader header, CostCalculatorLipaCostBody body) {
        int i = 2 % 2;
        CostCalculatorLipaCostApiResponse costCalculatorLipaCostApiResponse = new CostCalculatorLipaCostApiResponse(header, body);
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorLipaCostApiResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostCalculatorLipaCostApiResponse)) {
            int i2 = ShareDataUIState + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CostCalculatorLipaCostApiResponse costCalculatorLipaCostApiResponse = (CostCalculatorLipaCostApiResponse) other;
        if (!Intrinsics.areEqual(this.header, costCalculatorLipaCostApiResponse.header) || !Intrinsics.areEqual(this.body, costCalculatorLipaCostApiResponse.body)) {
            return false;
        }
        int i4 = ShareDataUIState + 71;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        CostCalculatorHeader costCalculatorHeader;
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            costCalculatorHeader = this.header;
            iHashCode = 1;
            if (costCalculatorHeader != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = costCalculatorHeader.hashCode();
            }
        } else {
            costCalculatorHeader = this.header;
            if (costCalculatorHeader == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = costCalculatorHeader.hashCode();
            }
        }
        CostCalculatorLipaCostBody costCalculatorLipaCostBody = this.body;
        if (costCalculatorLipaCostBody != null) {
            iHashCode = costCalculatorLipaCostBody.hashCode();
        }
        int i3 = (iHashCode2 * 31) + iHashCode;
        int i4 = component3 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorLipaCostApiResponse(header=" + this.header + ", body=" + this.body + ")";
        int i2 = component3 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        CostCalculatorHeader costCalculatorHeader = this.header;
        if (costCalculatorHeader == null) {
            int i4 = component3 + 93;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            costCalculatorHeader.writeToParcel(dest, flags);
        }
        CostCalculatorLipaCostBody costCalculatorLipaCostBody = this.body;
        if (costCalculatorLipaCostBody == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            costCalculatorLipaCostBody.writeToParcel(dest, flags);
        }
        int i6 = component3 + 85;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }
}
