package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualDataResponse;", "Landroid/os/Parcelable;", "applicationResponse", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualDataUsage;", "total", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getApplicationResponse", "()Ljava/util/List;", "getTotal", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualDataResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IndividualDataResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("usage")
    private final List<IndividualDataUsage> applicationResponse;

    @SerializedName("total")
    private final String total;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualDataResponse> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualDataResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i2 = copydefault + 113;
                component1 = i2 % 128;
                arrayList = null;
                if (i2 % 2 == 0) {
                    arrayList.hashCode();
                    throw null;
                }
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    int i5 = copydefault + 61;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList2.add(IndividualDataUsage.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new IndividualDataResponse(arrayList, parcel.readString());
        }

        @Override
        public IndividualDataResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            IndividualDataResponse individualDataResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 38 / 0;
            }
            int i5 = component1 + 39;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return individualDataResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualDataResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 43;
            copydefault = i3 % 128;
            IndividualDataResponse[] individualDataResponseArr = new IndividualDataResponse[i];
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            return individualDataResponseArr;
        }

        @Override
        public IndividualDataResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 31;
            component1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            IndividualDataResponse[] individualDataResponseArrNewArray = newArray(i);
            int i4 = copydefault + 93;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return individualDataResponseArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public IndividualDataResponse(List<IndividualDataUsage> list, String str) {
        this.applicationResponse = list;
        this.total = str;
    }

    public final List<IndividualDataUsage> getApplicationResponse() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.applicationResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTotal() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.total;
        int i4 = i3 + 63;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 121;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IndividualDataResponse copy$default(IndividualDataResponse individualDataResponse, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 61;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            List<IndividualDataUsage> list2 = individualDataResponse.applicationResponse;
            int i9 = i7 + 57;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            list = list2;
        }
        if ((i & 2) != 0) {
            str = individualDataResponse.total;
        }
        return individualDataResponse.copy(list, str);
    }

    public final List<IndividualDataUsage> component1() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<IndividualDataUsage> list = this.applicationResponse;
        int i5 = i3 + 59;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.total;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return str;
    }

    public final IndividualDataResponse copy(List<IndividualDataUsage> applicationResponse, String total) {
        int i = 2 % 2;
        IndividualDataResponse individualDataResponse = new IndividualDataResponse(applicationResponse, total);
        int i2 = component1 + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return individualDataResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualDataResponse)) {
            int i2 = component3 + 67;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 44 / 0;
            }
            return false;
        }
        IndividualDataResponse individualDataResponse = (IndividualDataResponse) other;
        if (!Intrinsics.areEqual(this.applicationResponse, individualDataResponse.applicationResponse)) {
            int i4 = component3 + 89;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.total, individualDataResponse.total)) {
            return true;
        }
        int i6 = component1 + 75;
        component3 = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<IndividualDataUsage> list = this.applicationResponse;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.total;
        int iHashCode2 = (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        int i4 = component3 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualDataResponse(applicationResponse=" + this.applicationResponse + ", total=" + this.total + ")";
        int i2 = component3 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<IndividualDataUsage> list = this.applicationResponse;
        if (list == null) {
            dest.writeInt(0);
            int i2 = component1 + 105;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<IndividualDataUsage> it = list.iterator();
            while (it.hasNext()) {
                int i4 = component3 + 5;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    it.next().writeToParcel(dest, flags);
                    throw null;
                }
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.total);
    }
}
