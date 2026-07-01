package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceBody;", "Landroid/os/Parcelable;", "data", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImtServiceBody> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName(ImtConstants.KEY_DATA)
    private final List<ImtServiceData> data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceBody> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component3 + 105;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component3 + 45;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(ImtServiceData.CREATOR.createFromParcel(parcel));
                    i5 += 18;
                } else {
                    arrayList.add(ImtServiceData.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new ImtServiceBody(arrayList);
        }

        @Override
        public ImtServiceBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            ImtServiceBody imtServiceBodyCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return imtServiceBodyCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 65;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            ImtServiceBody[] imtServiceBodyArr = new ImtServiceBody[i];
            int i6 = i4 + 53;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return imtServiceBodyArr;
        }

        @Override
        public ImtServiceBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceBody[] imtServiceBodyArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 41 / 0;
            }
            int i6 = component3 + 93;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return imtServiceBodyArrNewArray;
            }
            throw null;
        }
    }

    public ImtServiceBody(List<ImtServiceData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    public final List<ImtServiceData> getData() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.data;
        }
        throw null;
    }

    static {
        int i = component3 + 125;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ImtServiceBody copy$default(ImtServiceBody imtServiceBody, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 51;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 97;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                List<ImtServiceData> list2 = imtServiceBody.data;
                throw null;
            }
            list = imtServiceBody.data;
        }
        return imtServiceBody.copy(list);
    }

    public final List<ImtServiceData> component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<ImtServiceData> list = this.data;
        int i5 = i2 + 73;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return list;
    }

    public final ImtServiceBody copy(List<ImtServiceData> data) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        ImtServiceBody imtServiceBody = new ImtServiceBody(data);
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return imtServiceBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImtServiceBody)) {
            int i2 = component1 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.data, ((ImtServiceBody) other).data)) {
            return true;
        }
        int i4 = copydefault + 79;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode();
        int i4 = copydefault + 79;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceBody(data=" + this.data + ')';
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<ImtServiceData> list = this.data;
        dest.writeInt(list.size());
        Iterator<ImtServiceData> it = list.iterator();
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }
}
