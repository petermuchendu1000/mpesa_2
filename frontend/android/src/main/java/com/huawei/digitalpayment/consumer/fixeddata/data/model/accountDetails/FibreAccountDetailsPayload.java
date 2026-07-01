package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetailsPayload;", "Landroid/os/Parcelable;", "accountId", "", "<init>", "(Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreAccountDetailsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibreAccountDetailsPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("accountId")
    private final String accountId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreAccountDetailsPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountDetailsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibreAccountDetailsPayload fibreAccountDetailsPayload = new FibreAccountDetailsPayload(parcel.readString());
            int i2 = ShareDataUIState + 7;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return fibreAccountDetailsPayload;
        }

        @Override
        public FibreAccountDetailsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FibreAccountDetailsPayload fibreAccountDetailsPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 23;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return fibreAccountDetailsPayloadCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountDetailsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 5;
            component1 = i4 % 128;
            FibreAccountDetailsPayload[] fibreAccountDetailsPayloadArr = new FibreAccountDetailsPayload[i];
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
            int i6 = i3 + 59;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
            return fibreAccountDetailsPayloadArr;
        }

        @Override
        public FibreAccountDetailsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FibreAccountDetailsPayload[] fibreAccountDetailsPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 24 / 0;
            }
            return fibreAccountDetailsPayloadArrNewArray;
        }
    }

    public FibreAccountDetailsPayload(String str) {
        this.accountId = str;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountId;
        }
        throw null;
    }

    static {
        int i = component3 + 95;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FibreAccountDetailsPayload copy$default(FibreAccountDetailsPayload fibreAccountDetailsPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = fibreAccountDetailsPayload.accountId;
            int i5 = i3 + 41;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 3;
            }
        }
        return fibreAccountDetailsPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.accountId;
        int i4 = i3 + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FibreAccountDetailsPayload copy(String accountId) {
        int i = 2 % 2;
        FibreAccountDetailsPayload fibreAccountDetailsPayload = new FibreAccountDetailsPayload(accountId);
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return fibreAccountDetailsPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6 = r6 + 113;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.ShareDataUIState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.accountId, ((com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload) r6).accountId) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.ShareDataUIState + 51;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.component1 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 53;
        r6 = r2 % 128;
        com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.component1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) != 0) goto L11;
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
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.component1
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.ShareDataUIState = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 23
            int r1 = r1 / r4
            if (r5 != r6) goto L2a
            goto L18
        L16:
            if (r5 != r6) goto L2a
        L18:
            int r2 = r2 + 53
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.component1 = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L22
            r3 = r4
        L22:
            int r6 = r6 + 113
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.ShareDataUIState = r1
            int r6 = r6 % r0
            return r3
        L2a:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload
            if (r1 != 0) goto L2f
            return r4
        L2f:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload r6 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload) r6
            java.lang.String r1 = r5.accountId
            java.lang.String r6 = r6.accountId
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L45
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.ShareDataUIState
            int r6 = r6 + 51
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.component1 = r1
            int r6 = r6 % r0
            return r4
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreAccountDetailsPayload(accountId=" + this.accountId + ")";
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.accountId);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.accountId);
        int i4 = ShareDataUIState + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }
}
