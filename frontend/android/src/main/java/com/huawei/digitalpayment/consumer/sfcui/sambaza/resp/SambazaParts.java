package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.ComponentActivityReportFullyDrawnExecutorImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaParts;", "Landroid/os/Parcelable;", "paymentMethod", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethod", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaParts implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SambazaParts> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SambazaParts> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaParts createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SambazaParts sambazaParts = new SambazaParts(parcel.readString());
            int i2 = ShareDataUIState + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return sambazaParts;
        }

        @Override
        public SambazaParts createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SambazaParts sambazaPartsCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 73;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return sambazaPartsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaParts[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 13;
            component3 = i4 % 128;
            Object obj = null;
            SambazaParts[] sambazaPartsArr = new SambazaParts[i];
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 7;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return sambazaPartsArr;
            }
            throw null;
        }

        @Override
        public SambazaParts[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 31;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            SambazaParts[] sambazaPartsArrNewArray = newArray(i);
            int i5 = component3 + 83;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return sambazaPartsArrNewArray;
        }

        public static void component2() {
            ComponentActivityReportFullyDrawnExecutorImpl.ShareDataUIState[0] = Class.forName("com.alibaba.griver.device.adapter.GriverOpenSettingListAdapter$OpenSettingViewHolder$1").getDeclaredField("component2");
        }
    }

    public SambazaParts(String str) {
        this.paymentMethod = str;
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentMethod;
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 45;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static SambazaParts copy$default(SambazaParts sambazaParts, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 15;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = sambazaParts.paymentMethod;
        }
        SambazaParts sambazaPartsCopy = sambazaParts.copy(str);
        int i5 = component3 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return sambazaPartsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.paymentMethod;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SambazaParts copy(String paymentMethod) {
        int i = 2 % 2;
        SambazaParts sambazaParts = new SambazaParts(paymentMethod);
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return sambazaParts;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 107;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof SambazaParts)) {
            int i3 = component3 + 91;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentMethod, ((SambazaParts) other).paymentMethod)) {
            return false;
        }
        int i5 = component3 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
  0x001c: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts.component3
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            java.lang.String r1 = r4.paymentMethod
            r3 = 41
            int r3 = r3 / r2
            if (r1 != 0) goto L1c
            goto L2e
        L17:
            java.lang.String r1 = r4.paymentMethod
            if (r1 != 0) goto L1c
            goto L2e
        L1c:
            int r2 = r1.hashCode()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts.component3
            int r1 = r1 + 7
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            r0 = 3
            int r0 = r0 % 4
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaParts(paymentMethod=" + this.paymentMethod + ")";
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.paymentMethod);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.paymentMethod);
        int i4 = component3 + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
