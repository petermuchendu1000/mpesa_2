package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/NoExpiryBundleResponse;", "Landroid/os/Parcelable;", "productCatalog", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "<init>", "(Ljava/util/List;)V", "getProductCatalog", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoExpiryBundleResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NoExpiryBundleResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("productsCatalog")
    private final List<DataCallProductResponse> productCatalog;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NoExpiryBundleResponse> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final NoExpiryBundleResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = 0;
            if (parcel.readInt() == 0) {
                int i3 = ShareDataUIState + 29;
                component1 = i3 % 128;
                arrayList = null;
                if (i3 % 2 != 0) {
                    int i4 = 30 / 0;
                }
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                while (i2 != i5) {
                    int i6 = ShareDataUIState + 65;
                    component1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        arrayList2.add(DataCallProductResponse.CREATOR.createFromParcel(parcel));
                        i2 += 55;
                    } else {
                        arrayList2.add(DataCallProductResponse.CREATOR.createFromParcel(parcel));
                        i2++;
                    }
                }
                arrayList = arrayList2;
            }
            return new NoExpiryBundleResponse(arrayList);
        }

        @Override
        public NoExpiryBundleResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            NoExpiryBundleResponse noExpiryBundleResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 79;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return noExpiryBundleResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final NoExpiryBundleResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 111;
            ShareDataUIState = i3 % 128;
            NoExpiryBundleResponse[] noExpiryBundleResponseArr = new NoExpiryBundleResponse[i];
            if (i3 % 2 != 0) {
                return noExpiryBundleResponseArr;
            }
            throw null;
        }

        @Override
        public NoExpiryBundleResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 25;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            NoExpiryBundleResponse[] noExpiryBundleResponseArrNewArray = newArray(i);
            int i5 = component1 + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return noExpiryBundleResponseArrNewArray;
        }
    }

    public NoExpiryBundleResponse(List<DataCallProductResponse> list) {
        this.productCatalog = list;
    }

    public final List<DataCallProductResponse> getProductCatalog() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<DataCallProductResponse> list = this.productCatalog;
        int i4 = i3 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        int i = component3 + 33;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NoExpiryBundleResponse copy$default(NoExpiryBundleResponse noExpiryBundleResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 7;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            list = noExpiryBundleResponse.productCatalog;
            int i5 = i4 + 59;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return noExpiryBundleResponse.copy(list);
    }

    public final List<DataCallProductResponse> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productCatalog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NoExpiryBundleResponse copy(List<DataCallProductResponse> productCatalog) {
        int i = 2 % 2;
        NoExpiryBundleResponse noExpiryBundleResponse = new NoExpiryBundleResponse(productCatalog);
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return noExpiryBundleResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoExpiryBundleResponse)) {
            int i2 = ShareDataUIState + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productCatalog, ((NoExpiryBundleResponse) other).productCatalog)) {
            int i4 = copydefault + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = copydefault + 91;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<DataCallProductResponse> list = this.productCatalog;
        if (list != null) {
            return list.hashCode();
        }
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NoExpiryBundleResponse(productCatalog=" + this.productCatalog + ")";
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<DataCallProductResponse> list = this.productCatalog;
        if (list == null) {
            int i2 = ShareDataUIState + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<DataCallProductResponse> it = list.iterator();
        while (it.hasNext()) {
            int i4 = ShareDataUIState + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
