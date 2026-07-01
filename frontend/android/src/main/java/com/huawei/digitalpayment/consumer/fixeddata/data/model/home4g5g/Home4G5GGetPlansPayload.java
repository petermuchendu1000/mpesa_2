package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetPlansPayload;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "technology", "productType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getTechnology", "getProductType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4G5GGetPlansPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home4G5GGetPlansPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("productType")
    private final String productType;

    @SerializedName("technology")
    private final String technology;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4G5GGetPlansPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetPlansPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home4G5GGetPlansPayload home4G5GGetPlansPayload = new Home4G5GGetPlansPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return home4G5GGetPlansPayload;
        }

        @Override
        public Home4G5GGetPlansPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 25;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Home4G5GGetPlansPayload home4G5GGetPlansPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 65;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return home4G5GGetPlansPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetPlansPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 115;
            int i4 = i3 % 128;
            component1 = i4;
            Home4G5GGetPlansPayload[] home4G5GGetPlansPayloadArr = new Home4G5GGetPlansPayload[i];
            if (i3 % 2 != 0) {
                int i5 = 14 / 0;
            }
            int i6 = i4 + 39;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return home4G5GGetPlansPayloadArr;
            }
            throw null;
        }

        @Override
        public Home4G5GGetPlansPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 97;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            Home4G5GGetPlansPayload[] home4G5GGetPlansPayloadArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 43;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return home4G5GGetPlansPayloadArrNewArray;
            }
            throw null;
        }
    }

    public Home4G5GGetPlansPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.beneficiaryMsisdn = str;
        this.technology = str2;
        this.productType = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Home4G5GGetPlansPayload(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copydefault;
            int i3 = i2 + 105;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            } else {
                int i7 = 2 % 2;
            }
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 99;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final String getTechnology() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.technology;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productType;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    static {
        int i = ShareDataUIState + 23;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    public static Home4G5GGetPlansPayload copy$default(Home4G5GGetPlansPayload home4G5GGetPlansPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 83;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                String str4 = home4G5GGetPlansPayload.beneficiaryMsisdn;
                throw null;
            }
            str = home4G5GGetPlansPayload.beneficiaryMsisdn;
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 25;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str2 = home4G5GGetPlansPayload.technology;
        }
        if ((i & 4) != 0) {
            str3 = home4G5GGetPlansPayload.productType;
        }
        return home4G5GGetPlansPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 1;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.technology;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productType;
        int i5 = i3 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Home4G5GGetPlansPayload copy(String beneficiaryMsisdn, String technology, String productType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(technology, "");
        Home4G5GGetPlansPayload home4G5GGetPlansPayload = new Home4G5GGetPlansPayload(beneficiaryMsisdn, technology, productType);
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return home4G5GGetPlansPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Home4G5GGetPlansPayload)) {
            int i4 = component3 + 41;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Home4G5GGetPlansPayload home4G5GGetPlansPayload = (Home4G5GGetPlansPayload) other;
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, home4G5GGetPlansPayload.beneficiaryMsisdn)) {
            int i6 = component3 + 109;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.technology, home4G5GGetPlansPayload.technology)) {
            return Intrinsics.areEqual(this.productType, home4G5GGetPlansPayload.productType);
        }
        int i7 = component3 + 5;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r1 r3 r4
  0x0034: PHI (r1v11 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload.component3
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L23
            java.lang.String r1 = r6.beneficiaryMsisdn
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.technology
            int r3 = r3.hashCode()
            java.lang.String r4 = r6.productType
            r5 = 87
            int r5 = r5 / r2
            if (r4 != 0) goto L34
            goto L41
        L23:
            java.lang.String r1 = r6.beneficiaryMsisdn
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.technology
            int r3 = r3.hashCode()
            java.lang.String r4 = r6.productType
            if (r4 != 0) goto L34
            goto L41
        L34:
            int r2 = r4.hashCode()
            int r4 = com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload.component3
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload.copydefault = r5
            int r4 = r4 % r0
        L41:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetPlansPayload.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4G5GGetPlansPayload(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", technology=" + this.technology + ", productType=" + this.productType + ")";
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.beneficiaryMsisdn);
            dest.writeString(this.technology);
            dest.writeString(this.productType);
            throw null;
        }
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.technology);
        dest.writeString(this.productType);
        int i4 = component3 + 3;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
