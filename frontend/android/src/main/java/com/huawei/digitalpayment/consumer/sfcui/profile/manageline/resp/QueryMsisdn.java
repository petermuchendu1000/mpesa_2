package com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/QueryMsisdn;", "Landroid/os/Parcelable;", "kycStatus", "", "registeredMsisdns", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/RegisteredMsisdn;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getKycStatus", "()Ljava/lang/String;", "getRegisteredMsisdns", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryMsisdn implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QueryMsisdn> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("kycStatus")
    private final String kycStatus;

    @SerializedName("registeredMsisdns")
    private final List<RegisteredMsisdn> registeredMsisdns;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QueryMsisdn> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QueryMsisdn createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component2 + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 != i2; i5++) {
                arrayList.add(RegisteredMsisdn.CREATOR.createFromParcel(parcel));
            }
            QueryMsisdn queryMsisdn = new QueryMsisdn(string, arrayList);
            int i6 = component2 + 23;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return queryMsisdn;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public QueryMsisdn createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QueryMsisdn[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 13;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            QueryMsisdn[] queryMsisdnArr = new QueryMsisdn[i];
            int i6 = i4 + 71;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return queryMsisdnArr;
        }

        @Override
        public QueryMsisdn[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            QueryMsisdn[] queryMsisdnArrNewArray = newArray(i);
            int i5 = component2 + 97;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return queryMsisdnArrNewArray;
            }
            throw null;
        }
    }

    public QueryMsisdn(String str, List<RegisteredMsisdn> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.kycStatus = str;
        this.registeredMsisdns = list;
    }

    public final String getKycStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kycStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<RegisteredMsisdn> getRegisteredMsisdns() {
        List<RegisteredMsisdn> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            list = this.registeredMsisdns;
            int i4 = 4 / 0;
        } else {
            list = this.registeredMsisdns;
        }
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = copydefault + 39;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QueryMsisdn copy$default(QueryMsisdn queryMsisdn, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 91;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str2 = queryMsisdn.kycStatus;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = queryMsisdn.kycStatus;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 65;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                list = queryMsisdn.registeredMsisdns;
                int i5 = 4 / 0;
            } else {
                list = queryMsisdn.registeredMsisdns;
            }
        }
        return queryMsisdn.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kycStatus;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final List<RegisteredMsisdn> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<RegisteredMsisdn> list = this.registeredMsisdns;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final QueryMsisdn copy(String kycStatus, List<RegisteredMsisdn> registeredMsisdns) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(kycStatus, "");
        Intrinsics.checkNotNullParameter(registeredMsisdns, "");
        QueryMsisdn queryMsisdn = new QueryMsisdn(kycStatus, registeredMsisdns);
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return queryMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof QueryMsisdn) {
            QueryMsisdn queryMsisdn = (QueryMsisdn) other;
            return Intrinsics.areEqual(this.kycStatus, queryMsisdn.kycStatus) && Intrinsics.areEqual(this.registeredMsisdns, queryMsisdn.registeredMsisdns);
        }
        int i5 = i3 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.kycStatus.hashCode() * 31) + this.registeredMsisdns.hashCode();
        int i4 = component3 + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryMsisdn(kycStatus=" + this.kycStatus + ", registeredMsisdns=" + this.registeredMsisdns + ")";
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.kycStatus);
            List<RegisteredMsisdn> list = this.registeredMsisdns;
            dest.writeInt(list.size());
            list.iterator();
            throw null;
        }
        dest.writeString(this.kycStatus);
        List<RegisteredMsisdn> list2 = this.registeredMsisdns;
        dest.writeInt(list2.size());
        Iterator<RegisteredMsisdn> it = list2.iterator();
        while (it.hasNext()) {
            int i4 = component3 + 79;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
