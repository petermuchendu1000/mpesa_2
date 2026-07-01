package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorApiResponse;", "Landroid/os/Parcelable;", "body", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;)V", "getBody", "()Ljava/util/List;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorHeader;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorApiResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CostCalculatorApiResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("body")
    private final List<CostCalculatorChargeBand> body;

    @SerializedName("header")
    private final CostCalculatorHeader header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CostCalculatorApiResponse> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorApiResponse createFromParcel(Parcel parcel) {
            CostCalculatorHeader costCalculatorHeaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(CostCalculatorChargeBand.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() == 0) {
                int i4 = component1 + 117;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                costCalculatorHeaderCreateFromParcel = null;
            } else {
                costCalculatorHeaderCreateFromParcel = CostCalculatorHeader.CREATOR.createFromParcel(parcel);
            }
            CostCalculatorApiResponse costCalculatorApiResponse = new CostCalculatorApiResponse(arrayList2, costCalculatorHeaderCreateFromParcel);
            int i6 = component2 + 91;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return costCalculatorApiResponse;
        }

        @Override
        public CostCalculatorApiResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorApiResponse costCalculatorApiResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            return costCalculatorApiResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorApiResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 107;
            component1 = i3 % 128;
            CostCalculatorApiResponse[] costCalculatorApiResponseArr = new CostCalculatorApiResponse[i];
            if (i3 % 2 == 0) {
                return costCalculatorApiResponseArr;
            }
            throw null;
        }

        @Override
        public CostCalculatorApiResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 3;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CostCalculatorApiResponse(List<CostCalculatorChargeBand> list, CostCalculatorHeader costCalculatorHeader) {
        Intrinsics.checkNotNullParameter(list, "");
        this.body = list;
        this.header = costCalculatorHeader;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CostCalculatorApiResponse(List list, CostCalculatorHeader costCalculatorHeader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = ShareDataUIState + 17;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(list, costCalculatorHeader);
    }

    public final List<CostCalculatorChargeBand> getBody() {
        List<CostCalculatorChargeBand> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            list = this.body;
            int i4 = 67 / 0;
        } else {
            list = this.body;
        }
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final CostCalculatorHeader getHeader() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        CostCalculatorHeader costCalculatorHeader = this.header;
        int i4 = i2 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return costCalculatorHeader;
        }
        throw null;
    }

    static {
        int i = component2 + 3;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CostCalculatorApiResponse copy$default(CostCalculatorApiResponse costCalculatorApiResponse, List list, CostCalculatorHeader costCalculatorHeader, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 11;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                list = costCalculatorApiResponse.body;
                int i4 = 89 / 0;
            } else {
                list = costCalculatorApiResponse.body;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 17;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            costCalculatorHeader = costCalculatorApiResponse.header;
        }
        return costCalculatorApiResponse.copy(list, costCalculatorHeader);
    }

    public final List<CostCalculatorChargeBand> component1() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<CostCalculatorChargeBand> list = this.body;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return list;
    }

    public final CostCalculatorHeader component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        CostCalculatorHeader costCalculatorHeader = this.header;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorHeader;
    }

    public final CostCalculatorApiResponse copy(List<CostCalculatorChargeBand> body, CostCalculatorHeader header) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(body, "");
        CostCalculatorApiResponse costCalculatorApiResponse = new CostCalculatorApiResponse(body, header);
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorApiResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostCalculatorApiResponse)) {
            int i2 = ShareDataUIState + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CostCalculatorApiResponse costCalculatorApiResponse = (CostCalculatorApiResponse) other;
        if (!Intrinsics.areEqual(this.body, costCalculatorApiResponse.body)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.header, costCalculatorApiResponse.header)) {
            int i4 = ShareDataUIState + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = ShareDataUIState + 21;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.body.hashCode();
        CostCalculatorHeader costCalculatorHeader = this.header;
        if (costCalculatorHeader == null) {
            int i4 = component1 + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = costCalculatorHeader.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorApiResponse(body=" + this.body + ", header=" + this.header + ")";
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<CostCalculatorChargeBand> list = this.body;
        dest.writeInt(list.size());
        Iterator<CostCalculatorChargeBand> it = list.iterator();
        while (it.hasNext()) {
            int i2 = component1 + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            it.next().writeToParcel(dest, flags);
            int i4 = ShareDataUIState + 15;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        CostCalculatorHeader costCalculatorHeader = this.header;
        if (costCalculatorHeader == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            costCalculatorHeader.writeToParcel(dest, flags);
        }
    }
}
