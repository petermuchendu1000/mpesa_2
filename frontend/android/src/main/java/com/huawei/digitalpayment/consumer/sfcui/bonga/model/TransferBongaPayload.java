package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/TransferBongaPayload;", "Landroid/os/Parcelable;", "partyA", "", "partyB", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartyA", "()Ljava/lang/String;", "getPartyB", "getAmount", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransferBongaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransferBongaPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("partyA")
    private final String partyA;

    @SerializedName("partyB")
    private final String partyB;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferBongaPayload> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TransferBongaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TransferBongaPayload transferBongaPayload = new TransferBongaPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return transferBongaPayload;
        }

        @Override
        public TransferBongaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            TransferBongaPayload transferBongaPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 1;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return transferBongaPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TransferBongaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 13;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            TransferBongaPayload[] transferBongaPayloadArr = new TransferBongaPayload[i];
            int i6 = i4 + 3;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return transferBongaPayloadArr;
            }
            throw null;
        }

        @Override
        public TransferBongaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 37;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            TransferBongaPayload[] transferBongaPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 57;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return transferBongaPayloadArrNewArray;
        }
    }

    public TransferBongaPayload(String str, String str2, String str3) {
        this.partyA = str;
        this.partyB = str2;
        this.amount = str3;
    }

    public final String getPartyA() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.partyA;
        int i4 = i3 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPartyB() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyB;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 103;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransferBongaPayload copy$default(TransferBongaPayload transferBongaPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 113;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = transferBongaPayload.partyA;
        }
        if ((i & 2) != 0) {
            str2 = transferBongaPayload.partyB;
        }
        if ((i & 4) != 0) {
            int i6 = i4 + 97;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str3 = transferBongaPayload.amount;
        }
        return transferBongaPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.partyA;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.partyB;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final TransferBongaPayload copy(String partyA, String partyB, String amount) {
        int i = 2 % 2;
        TransferBongaPayload transferBongaPayload = new TransferBongaPayload(partyA, partyB, amount);
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return transferBongaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 7;
        com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.partyA, r6.partyA) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.component3;
        r1 = r6 + 91;
        com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 69;
        com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r6 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.partyB, r6.partyB) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.component3 + 37;
        com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.amount, r6.amount) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.component3
            int r2 = r1 + 19
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 50
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload
            r2 = r2 ^ r3
            if (r2 == 0) goto L26
            int r1 = r1 + 7
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r6
            int r1 = r1 % r0
            return r4
        L26:
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload r6 = (com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload) r6
            java.lang.String r1 = r5.partyA
            java.lang.String r2 = r6.partyA
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L48
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.component3
            int r1 = r6 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r2
            int r1 = r1 % r0
            int r6 = r6 + 69
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L47
            r6 = 40
            int r6 = r6 / r4
        L47:
            return r4
        L48:
            java.lang.String r1 = r5.partyB
            java.lang.String r2 = r6.partyB
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L5c
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.component3
            int r6 = r6 + 37
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.ShareDataUIState = r1
            int r6 = r6 % r0
            return r4
        L5c:
            java.lang.String r0 = r5.amount
            java.lang.String r6 = r6.amount
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L67
            return r4
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.TransferBongaPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyA;
        if (str == null) {
            int i5 = i2 + 73;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = ShareDataUIState + 99;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str2 = this.partyB;
        if (str2 == null) {
            int i9 = ShareDataUIState + 109;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.amount;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferBongaPayload(partyA=" + this.partyA + ", partyB=" + this.partyB + ", amount=" + this.amount + ")";
        int i2 = component3 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.partyA);
            dest.writeString(this.partyB);
            dest.writeString(this.amount);
            throw null;
        }
        dest.writeString(this.partyA);
        dest.writeString(this.partyB);
        dest.writeString(this.amount);
        int i4 = component3 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
