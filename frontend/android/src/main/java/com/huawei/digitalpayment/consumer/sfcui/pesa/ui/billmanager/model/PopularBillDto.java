package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0006H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/PopularBillDto;", "Landroid/os/Parcelable;", "billerName", "", GriverParams.ShareParams.IMAGE_URL, KeysConstants.SHORT_CODE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBillerName", "()Ljava/lang/String;", "getImageUrl", "getShortCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/PopularBillDto;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopularBillDto implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PopularBillDto> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("billerName")
    private final String billerName;

    @SerializedName(GriverParams.ShareParams.IMAGE_URL)
    private final String imageUrl;

    @SerializedName(KeysConstants.SHORT_CODE)
    private final Integer shortCode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PopularBillDto> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PopularBillDto createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = copydefault + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = component2 + 109;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PopularBillDto(string, string2, numValueOf);
        }

        @Override
        public PopularBillDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 75;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PopularBillDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 81;
            int i4 = i3 % 128;
            component2 = i4;
            Object obj = null;
            PopularBillDto[] popularBillDtoArr = new PopularBillDto[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 75;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return popularBillDtoArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public PopularBillDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 79;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            PopularBillDto[] popularBillDtoArrNewArray = newArray(i);
            int i5 = copydefault + 23;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return popularBillDtoArrNewArray;
        }
    }

    public PopularBillDto(String str, String str2, Integer num) {
        this.billerName = str;
        this.imageUrl = str2;
        this.shortCode = num;
    }

    public final String getBillerName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billerName;
        int i5 = i2 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getImageUrl() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.imageUrl;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final Integer getShortCode() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.shortCode;
        int i4 = i3 + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 81;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static PopularBillDto copy$default(PopularBillDto popularBillDto, String str, String str2, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 83;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = popularBillDto.billerName;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 107;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                str2 = popularBillDto.imageUrl;
                int i6 = 97 / 0;
            } else {
                str2 = popularBillDto.imageUrl;
            }
        }
        if ((i & 4) != 0) {
            num = popularBillDto.shortCode;
            int i7 = component2 + 45;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        return popularBillDto.copy(str, str2, num);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.billerName;
        int i5 = i3 + 51;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.shortCode;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return num;
    }

    public final PopularBillDto copy(String billerName, String imageUrl, Integer shortCode) {
        int i = 2 % 2;
        PopularBillDto popularBillDto = new PopularBillDto(billerName, imageUrl, shortCode);
        int i2 = component3 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return popularBillDto;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PopularBillDto)) {
            return false;
        }
        PopularBillDto popularBillDto = (PopularBillDto) other;
        if (!Intrinsics.areEqual(this.billerName, popularBillDto.billerName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, popularBillDto.imageUrl)) {
            int i4 = component2 + 57;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.shortCode, popularBillDto.shortCode))) {
            return true;
        }
        int i6 = component3 + 67;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        component2 = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 == 0 ? (str = this.billerName) != null : (str = this.billerName) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 13;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        String str2 = this.imageUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.shortCode;
        if (num != null) {
            iHashCode2 = num.hashCode();
            int i6 = component2 + 29;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PopularBillDto(billerName=" + this.billerName + ", imageUrl=" + this.imageUrl + ", shortCode=" + this.shortCode + ")";
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[PHI: r0
  0x003e: PHI (r0v11 java.lang.Integer) = (r0v6 java.lang.Integer), (r0v16 java.lang.Integer) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.component2
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.component3 = r1
            int r0 = r0 % r5
            r1 = 0
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            if (r0 != 0) goto L26
            java.lang.String r0 = r3.billerName
            r4.writeString(r0)
            java.lang.String r0 = r3.imageUrl
            r4.writeString(r0)
            java.lang.Integer r0 = r3.shortCode
            r2 = 12
            int r2 = r2 / r1
            if (r0 != 0) goto L3e
            goto L34
        L26:
            java.lang.String r0 = r3.billerName
            r4.writeString(r0)
            java.lang.String r0 = r3.imageUrl
            r4.writeString(r0)
            java.lang.Integer r0 = r3.shortCode
            if (r0 != 0) goto L3e
        L34:
            int r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.component3
            int r0 = r0 + 59
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.component2 = r2
        L3c:
            int r0 = r0 % r5
            goto L4f
        L3e:
            r1 = 1
            r4.writeInt(r1)
            int r1 = r0.intValue()
            int r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.component2
            int r0 = r0 + 61
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.component3 = r2
            goto L3c
        L4f:
            r4.writeInt(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto.writeToParcel(android.os.Parcel, int):void");
    }
}
