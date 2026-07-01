package com.huawei.digitalpayment.consumer.home.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/BalancesResponse;", "Landroid/os/Parcelable;", "balances", "", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/Balances;", "<init>", "(Ljava/util/List;)V", "getBalances", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BalancesResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("balances")
    private final List<Balances> balances;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BalancesResponse> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = component1 + 103;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(Balances.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = component1 + 5;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
            return new BalancesResponse(arrayList);
        }

        @Override
        public BalancesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 87;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            BalancesResponse balancesResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 21;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return balancesResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 51;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            BalancesResponse[] balancesResponseArr = new BalancesResponse[i];
            int i6 = i3 + 85;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return balancesResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BalancesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 51;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public BalancesResponse(List<Balances> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.balances = list;
    }

    public final List<Balances> getBalances() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<Balances> list = this.balances;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    static {
        int i = component2 + 35;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BalancesResponse copy$default(BalancesResponse balancesResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 101;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 105;
            int i7 = i6 % 128;
            component1 = i7;
            int i8 = i6 % 2;
            List<Balances> list2 = balancesResponse.balances;
            int i9 = i7 + 43;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 2;
            }
            list = list2;
        }
        return balancesResponse.copy(list);
    }

    public final List<Balances> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<Balances> list = this.balances;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BalancesResponse copy(List<Balances> balances) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balances, "");
        BalancesResponse balancesResponse = new BalancesResponse(balances);
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return balancesResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 53;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BalancesResponse)) {
            int i7 = component1 + 101;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.balances, ((BalancesResponse) other).balances)) {
            return true;
        }
        int i9 = ShareDataUIState + 47;
        component1 = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.balances.hashCode();
        int i4 = ShareDataUIState + 39;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalancesResponse(balances=" + this.balances + ")";
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<Balances> list = this.balances;
        dest.writeInt(list.size());
        Iterator<Balances> it = list.iterator();
        while (it.hasNext()) {
            int i2 = ShareDataUIState + 83;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i3 = 37 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
        int i4 = component1 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
