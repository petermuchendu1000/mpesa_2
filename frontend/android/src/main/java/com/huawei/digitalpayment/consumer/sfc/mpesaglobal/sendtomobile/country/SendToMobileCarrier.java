package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileCarrier;", "Landroid/os/Parcelable;", "name", "", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileCarrier implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SendToMobileCarrier> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String id;
    private final String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileCarrier> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCarrier createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileCarrier sendToMobileCarrier = new SendToMobileCarrier(parcel.readString(), parcel.readString());
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return sendToMobileCarrier;
        }

        @Override
        public SendToMobileCarrier createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 51;
            ShareDataUIState = i2 % 128;
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
        public final SendToMobileCarrier[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 15;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            SendToMobileCarrier[] sendToMobileCarrierArr = new SendToMobileCarrier[i];
            int i6 = i4 + 19;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return sendToMobileCarrierArr;
        }

        @Override
        public SendToMobileCarrier[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 77;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            SendToMobileCarrier[] sendToMobileCarrierArrNewArray = newArray(i);
            int i5 = component2 + 59;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 49 / 0;
            }
            return sendToMobileCarrierArrNewArray;
        }
    }

    public SendToMobileCarrier(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.id = str2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 19;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static SendToMobileCarrier copy$default(SendToMobileCarrier sendToMobileCarrier, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 87;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str = sendToMobileCarrier.name;
            int i7 = i4 + 61;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 2) != 0) {
            str2 = sendToMobileCarrier.id;
        }
        return sendToMobileCarrier.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final SendToMobileCarrier copy(String name, String id) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(id, "");
        SendToMobileCarrier sendToMobileCarrier = new SendToMobileCarrier(name, id);
        int i2 = component3 + 55;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return sendToMobileCarrier;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 57;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof SendToMobileCarrier)) {
            return false;
        }
        SendToMobileCarrier sendToMobileCarrier = (SendToMobileCarrier) other;
        if (!Intrinsics.areEqual(this.name, sendToMobileCarrier.name)) {
            int i3 = component2 + 111;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, sendToMobileCarrier.id)) {
            return false;
        }
        int i5 = component2 + 61;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.name.hashCode() * 31) + this.id.hashCode();
        int i4 = component2 + 105;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileCarrier(name=" + this.name + ", id=" + this.id + ')';
        int i2 = component2 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        dest.writeString(this.id);
        int i4 = component3 + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
