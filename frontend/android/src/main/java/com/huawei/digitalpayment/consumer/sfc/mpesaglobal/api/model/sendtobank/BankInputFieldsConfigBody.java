package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigBody;", "Landroid/os/Parcelable;", "data", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankInputFieldsConfigBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankInputFieldsConfigBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(ImtConstants.KEY_DATA)
    private final List<BankInputFieldsConfigData> data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankInputFieldsConfigBody> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigBody createFromParcel(Parcel parcel) {
            BankInputFieldsConfigData bankInputFieldsConfigDataCreateFromParcel;
            int i = 2 % 2;
            int i2 = component3 + 103;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 125;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.hashCode();
                    throw null;
                }
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    int i7 = copydefault + 81;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    if (parcel.readInt() == 0) {
                        int i9 = component3 + 29;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                        bankInputFieldsConfigDataCreateFromParcel = null;
                    } else {
                        bankInputFieldsConfigDataCreateFromParcel = BankInputFieldsConfigData.CREATOR.createFromParcel(parcel);
                    }
                    arrayList2.add(bankInputFieldsConfigDataCreateFromParcel);
                }
                arrayList = arrayList2;
            }
            return new BankInputFieldsConfigBody(arrayList);
        }

        @Override
        public BankInputFieldsConfigBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldsConfigBody bankInputFieldsConfigBodyCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 17;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bankInputFieldsConfigBodyCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 53;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            BankInputFieldsConfigBody[] bankInputFieldsConfigBodyArr = new BankInputFieldsConfigBody[i];
            int i6 = i3 + 61;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return bankInputFieldsConfigBodyArr;
        }

        @Override
        public BankInputFieldsConfigBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 105;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            BankInputFieldsConfigBody[] bankInputFieldsConfigBodyArrNewArray = newArray(i);
            int i5 = copydefault + 43;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return bankInputFieldsConfigBodyArrNewArray;
            }
            throw null;
        }
    }

    public BankInputFieldsConfigBody(List<BankInputFieldsConfigData> list) {
        this.data = list;
    }

    public final List<BankInputFieldsConfigData> getData() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<BankInputFieldsConfigData> list = this.data;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 11;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BankInputFieldsConfigBody copy$default(BankInputFieldsConfigBody bankInputFieldsConfigBody, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 43;
        copydefault = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            int i6 = i3 + 123;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            list = bankInputFieldsConfigBody.data;
            int i8 = i3 + 69;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        return bankInputFieldsConfigBody.copy(list);
    }

    public final List<BankInputFieldsConfigData> component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<BankInputFieldsConfigData> list = this.data;
        int i4 = i2 + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final BankInputFieldsConfigBody copy(List<BankInputFieldsConfigData> data) {
        int i = 2 % 2;
        BankInputFieldsConfigBody bankInputFieldsConfigBody = new BankInputFieldsConfigBody(data);
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return bankInputFieldsConfigBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankInputFieldsConfigBody)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.data, ((BankInputFieldsConfigBody) other).data)) {
            int i3 = component3 + 5;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = copydefault + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<BankInputFieldsConfigData> list = this.data;
        if (list == null) {
            return 0;
        }
        int iHashCode = list.hashCode();
        int i3 = copydefault + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankInputFieldsConfigBody(data=" + this.data + ')';
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<BankInputFieldsConfigData> list = this.data;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<BankInputFieldsConfigData> it = list.iterator();
        while (it.hasNext()) {
            int i2 = copydefault + 119;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                it.next();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BankInputFieldsConfigData next = it.next();
            if (next == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                next.writeToParcel(dest, flags);
                int i3 = component3 + 109;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }
}
