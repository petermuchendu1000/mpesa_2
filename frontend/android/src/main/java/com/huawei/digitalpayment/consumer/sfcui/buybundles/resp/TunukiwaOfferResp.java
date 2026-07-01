package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaOfferResp;", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaBundleResp;", "Ljava/util/ArrayList;", "Landroid/os/Parcelable;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaOfferResp extends ArrayList<TunukiwaBundleResp> implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TunukiwaOfferResp> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TunukiwaOfferResp> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaOfferResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            TunukiwaOfferResp tunukiwaOfferResp = new TunukiwaOfferResp();
            int i2 = component2 + 63;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 15 / 0;
            }
            return tunukiwaOfferResp;
        }

        @Override
        public TunukiwaOfferResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 41;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            TunukiwaOfferResp tunukiwaOfferRespCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 113;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return tunukiwaOfferRespCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaOfferResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 81;
            component1 = i3 % 128;
            TunukiwaOfferResp[] tunukiwaOfferRespArr = new TunukiwaOfferResp[i];
            if (i3 % 2 != 0) {
                return tunukiwaOfferRespArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public TunukiwaOfferResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 53;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            TunukiwaOfferResp[] tunukiwaOfferRespArrNewArray = newArray(i);
            int i4 = component1 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return tunukiwaOfferRespArrNewArray;
        }
    }

    public boolean contains(TunukiwaBundleResp tunukiwaBundleResp) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super.contains((Object) tunukiwaBundleResp);
        }
        super.contains((Object) tunukiwaBundleResp);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (obj instanceof TunukiwaBundleResp) {
            return contains((TunukiwaBundleResp) obj);
        }
        int i5 = i2 + 71;
        int i6 = i5 % 128;
        component3 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 83;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int getSize() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int size = super.size();
        int i4 = copydefault + 51;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return size;
    }

    public int indexOf(TunukiwaBundleResp tunukiwaBundleResp) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.indexOf((Object) tunukiwaBundleResp);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIndexOf = super.indexOf((Object) tunukiwaBundleResp);
        int i3 = copydefault + 57;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return iIndexOf;
    }

    @Override
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof TunukiwaBundleResp;
            throw null;
        }
        if (!(obj instanceof TunukiwaBundleResp)) {
            return -1;
        }
        int iIndexOf = indexOf((TunukiwaBundleResp) obj);
        int i3 = copydefault + 93;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return iIndexOf;
        }
        throw null;
    }

    public int lastIndexOf(TunukiwaBundleResp tunukiwaBundleResp) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iLastIndexOf = super.lastIndexOf((Object) tunukiwaBundleResp);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = copydefault + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return iLastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof TunukiwaBundleResp)) {
            int i2 = copydefault + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        int iLastIndexOf = lastIndexOf((TunukiwaBundleResp) obj);
        int i4 = component3 + 39;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iLastIndexOf;
    }

    @Override
    public final TunukiwaBundleResp remove(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 67;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return removeAt(i);
        }
        removeAt(i);
        throw null;
    }

    public boolean remove(TunukiwaBundleResp tunukiwaBundleResp) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = super.remove((Object) tunukiwaBundleResp);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return zRemove;
    }

    @Override
    public final boolean remove(Object obj) {
        int i = 2 % 2;
        if (!(!(obj instanceof TunukiwaBundleResp))) {
            return remove((TunukiwaBundleResp) obj);
        }
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public TunukiwaBundleResp removeAt(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        TunukiwaBundleResp tunukiwaBundleResp = (TunukiwaBundleResp) super.remove(i);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = copydefault + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return tunukiwaBundleResp;
    }

    @Override
    public final int size() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int size = getSize();
        int i4 = copydefault + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    static {
        int i = component2 + 115;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(1);
        int i4 = copydefault + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }
}
