package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4GGetPlansPayload;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "technology", "productType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getTechnology", "getProductType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4GGetPlansPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home4GGetPlansPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("productType")
    private final String productType;

    @SerializedName("technology")
    private final String technology;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4GGetPlansPayload> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4GGetPlansPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home4GGetPlansPayload home4GGetPlansPayload = new Home4GGetPlansPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 121;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return home4GGetPlansPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Home4GGetPlansPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Home4GGetPlansPayload home4GGetPlansPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 9;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return home4GGetPlansPayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4GGetPlansPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 25;
            component2 = i4 % 128;
            Home4GGetPlansPayload[] home4GGetPlansPayloadArr = new Home4GGetPlansPayload[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 89;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return home4GGetPlansPayloadArr;
        }

        @Override
        public Home4GGetPlansPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            Home4GGetPlansPayload[] home4GGetPlansPayloadArrNewArray = newArray(i);
            int i4 = component2 + 89;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return home4GGetPlansPayloadArrNewArray;
            }
            throw null;
        }
    }

    public Home4GGetPlansPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.beneficiaryMsisdn = str;
        this.technology = str2;
        this.productType = str3;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.beneficiaryMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTechnology() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.technology;
            int i4 = 99 / 0;
        } else {
            str = this.technology;
        }
        int i5 = i3 + 33;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productType;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 47;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Home4GGetPlansPayload copy$default(Home4GGetPlansPayload home4GGetPlansPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 31;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = home4GGetPlansPayload.beneficiaryMsisdn;
                int i4 = 18 / 0;
            } else {
                str = home4GGetPlansPayload.beneficiaryMsisdn;
            }
        }
        if ((i & 2) != 0) {
            str2 = home4GGetPlansPayload.technology;
        }
        if ((i & 4) != 0) {
            int i5 = component2;
            int i6 = i5 + 107;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            String str4 = home4GGetPlansPayload.productType;
            int i8 = i5 + 97;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str3 = str4;
        }
        Home4GGetPlansPayload home4GGetPlansPayloadCopy = home4GGetPlansPayload.copy(str, str2, str3);
        int i10 = component2 + 87;
        ShareDataUIState = i10 % 128;
        if (i10 % 2 == 0) {
            return home4GGetPlansPayloadCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i3 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.technology;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Home4GGetPlansPayload copy(String beneficiaryMsisdn, String technology, String productType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(technology, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Home4GGetPlansPayload home4GGetPlansPayload = new Home4GGetPlansPayload(beneficiaryMsisdn, technology, productType);
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return home4GGetPlansPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Home4GGetPlansPayload)) {
            return false;
        }
        Home4GGetPlansPayload home4GGetPlansPayload = (Home4GGetPlansPayload) other;
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, home4GGetPlansPayload.beneficiaryMsisdn)) {
            int i4 = ShareDataUIState + 35;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.technology, home4GGetPlansPayload.technology)) {
            int i6 = ShareDataUIState + 71;
            component2 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.productType, home4GGetPlansPayload.productType)) {
            int i7 = ShareDataUIState + 59;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = ShareDataUIState + 63;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.beneficiaryMsisdn.hashCode() * 31) + this.technology.hashCode()) * 31) + this.productType.hashCode();
        int i4 = component2 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4GGetPlansPayload(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", technology=" + this.technology + ", productType=" + this.productType + ")";
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.beneficiaryMsisdn;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.technology);
            dest.writeString(this.productType);
        } else {
            dest.writeString(str);
            dest.writeString(this.technology);
            dest.writeString(this.productType);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
