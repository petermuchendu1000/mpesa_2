package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesBody;", "Landroid/os/Parcelable;", "data", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValueItem;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankComboValuesBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankComboValuesBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName(ImtConstants.KEY_DATA)
    private final List<BankComboValueItem> data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankComboValuesBody> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValuesBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                int i2 = component1 + 69;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    int i6 = component1 + 77;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList2.add(parcel.readInt() == 0 ? null : BankComboValueItem.CREATOR.createFromParcel(parcel));
                    i5++;
                    int i8 = component1 + 89;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                }
                arrayList = arrayList2;
            }
            return new BankComboValuesBody(arrayList);
        }

        @Override
        public BankComboValuesBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            BankComboValuesBody bankComboValuesBodyCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 57;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return bankComboValuesBodyCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValuesBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            BankComboValuesBody[] bankComboValuesBodyArr = new BankComboValuesBody[i];
            int i6 = i3 + 109;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return bankComboValuesBodyArr;
            }
            throw null;
        }

        @Override
        public BankComboValuesBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 115;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public BankComboValuesBody(List<BankComboValueItem> list) {
        this.data = list;
    }

    public final List<BankComboValueItem> getData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<BankComboValueItem> list = this.data;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 77;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BankComboValuesBody copy$default(BankComboValuesBody bankComboValuesBody, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 41;
        component2 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 51;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                List<BankComboValueItem> list2 = bankComboValuesBody.data;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = bankComboValuesBody.data;
        }
        return bankComboValuesBody.copy(list);
    }

    public final List<BankComboValueItem> component1() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<BankComboValueItem> list = this.data;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BankComboValuesBody copy(List<BankComboValueItem> data) {
        int i = 2 % 2;
        BankComboValuesBody bankComboValuesBody = new BankComboValuesBody(data);
        int i2 = component2 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return bankComboValuesBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BankComboValuesBody)) {
            return false;
        }
        if (Intrinsics.areEqual(this.data, ((BankComboValuesBody) other).data)) {
            return true;
        }
        int i4 = ShareDataUIState + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        List<BankComboValueItem> list = this.data;
        if (list != null) {
            return list.hashCode();
        }
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankComboValuesBody(data=" + this.data + ')';
        int i2 = ShareDataUIState + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r6.writeInt(1);
        r6.writeInt(r1.size());
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r1.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.component2 + 111;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.ShareDataUIState = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r2 = r1.next();
        r4 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r2 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r6.writeInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r6.writeInt(1);
        r2.writeToParcel(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r6.writeInt(0);
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.ShareDataUIState + 93;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.ShareDataUIState
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.component2 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            if (r1 == 0) goto L1c
            java.util.List<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem> r1 = r5.data
            r2 = 20
            int r2 = r2 / r3
            if (r1 != 0) goto L2d
            goto L20
        L1c:
            java.util.List<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem> r1 = r5.data
            if (r1 != 0) goto L2d
        L20:
            r6.writeInt(r3)
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.ShareDataUIState
            int r6 = r6 + 93
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.component2 = r7
            int r6 = r6 % r0
            goto L6d
        L2d:
            r0 = 1
            r6.writeInt(r0)
            int r2 = r1.size()
            r6.writeInt(r2)
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.component2
            int r2 = r2 + 111
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.ShareDataUIState = r4
            int r2 = r2 % 2
            if (r2 != 0) goto L5a
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem r2 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem) r2
            r4 = 44
            int r4 = r4 / r3
            if (r2 != 0) goto L66
            goto L62
        L5a:
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem r2 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem) r2
            if (r2 != 0) goto L66
        L62:
            r6.writeInt(r3)
            goto L3c
        L66:
            r6.writeInt(r0)
            r2.writeToParcel(r6, r7)
            goto L3c
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesBody.writeToParcel(android.os.Parcel, int):void");
    }
}
