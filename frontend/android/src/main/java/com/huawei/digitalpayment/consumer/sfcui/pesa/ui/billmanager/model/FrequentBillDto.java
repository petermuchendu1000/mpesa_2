package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0005H\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0005H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/FrequentBillDto;", "Landroid/os/Parcelable;", "accountNo", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "debitPartyName", "debitPartyNo", "frequency", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAccountNo", "()Ljava/lang/String;", "getCategory", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDebitPartyName", "getDebitPartyNo", "getFrequency", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/FrequentBillDto;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentBillDto implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FrequentBillDto> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("accountNo")
    private final String accountNo;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final Integer category;

    @SerializedName("debitPartyName")
    private final String debitPartyName;

    @SerializedName("debitPartyNo")
    private final String debitPartyNo;

    @SerializedName("frequency")
    private final Integer frequency;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FrequentBillDto> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r1
  0x0030: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
  0x002d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto createFromParcel(android.os.Parcel r11) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto.Creator.component3
                int r1 = r1 + 51
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto.Creator.component2 = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
                if (r1 != 0) goto L23
                java.lang.String r1 = r11.readString()
                int r3 = r11.readInt()
                r4 = 35
                int r4 = r4 / 0
                if (r3 != 0) goto L30
                goto L2d
            L23:
                java.lang.String r1 = r11.readString()
                int r3 = r11.readInt()
                if (r3 != 0) goto L30
            L2d:
                r5 = r1
                r6 = r2
                goto L3a
            L30:
                int r3 = r11.readInt()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = r1
                r6 = r3
            L3a:
                java.lang.String r7 = r11.readString()
                java.lang.String r8 = r11.readString()
                int r1 = r11.readInt()
                if (r1 != 0) goto L52
                int r11 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto.Creator.component3
                int r11 = r11 + 77
                int r1 = r11 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto.Creator.component2 = r1
                int r11 = r11 % r0
                goto L5a
            L52:
                int r11 = r11.readInt()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            L5a:
                r9 = r2
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto r11 = new com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillDto");
        }

        @Override
        public FrequentBillDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FrequentBillDto frequentBillDtoCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 89;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return frequentBillDtoCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FrequentBillDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 33;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            FrequentBillDto[] frequentBillDtoArr = new FrequentBillDto[i];
            int i6 = i4 + 59;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return frequentBillDtoArr;
        }

        @Override
        public FrequentBillDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 11;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            FrequentBillDto[] frequentBillDtoArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 74 / 0;
            }
            int i6 = component3 + 57;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return frequentBillDtoArrNewArray;
        }
    }

    public FrequentBillDto(String str, Integer num, String str2, String str3, Integer num2) {
        this.accountNo = str;
        this.category = num;
        this.debitPartyName = str2;
        this.debitPartyNo = str3;
        this.frequency = num2;
    }

    public final String getAccountNo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNo;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getCategory() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            num = this.category;
            int i4 = 35 / 0;
        } else {
            num = this.category;
        }
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDebitPartyName() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.debitPartyName;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    public final String getDebitPartyNo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.debitPartyNo;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getFrequency() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.frequency;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    static {
        int i = ShareDataUIState + 47;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FrequentBillDto copy$default(FrequentBillDto frequentBillDto, String str, Integer num, String str2, String str3, Integer num2, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = copydefault + 91;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = frequentBillDto.accountNo;
                throw null;
            }
            str = frequentBillDto.accountNo;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i4 = component3 + 105;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            num = frequentBillDto.category;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = frequentBillDto.debitPartyName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            int i6 = component3 + 21;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str3 = frequentBillDto.debitPartyNo;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            int i8 = copydefault + 37;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                Integer num4 = frequentBillDto.frequency;
                obj2.hashCode();
                throw null;
            }
            num2 = frequentBillDto.frequency;
        }
        return frequentBillDto.copy(str5, num3, str6, str7, num2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.accountNo;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.category;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.debitPartyName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.debitPartyNo;
        int i5 = i2 + 5;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.frequency;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FrequentBillDto copy(String accountNo, Integer category, String debitPartyName, String debitPartyNo, Integer frequency) {
        int i = 2 % 2;
        FrequentBillDto frequentBillDto = new FrequentBillDto(accountNo, category, debitPartyName, debitPartyNo, frequency);
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return frequentBillDto;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequentBillDto)) {
            int i4 = i2 + 113;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
            return false;
        }
        FrequentBillDto frequentBillDto = (FrequentBillDto) other;
        if (!Intrinsics.areEqual(this.accountNo, frequentBillDto.accountNo)) {
            int i6 = copydefault + 77;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.category, frequentBillDto.category) || (!Intrinsics.areEqual(this.debitPartyName, frequentBillDto.debitPartyName))) {
            return false;
        }
        if (Intrinsics.areEqual(this.debitPartyNo, frequentBillDto.debitPartyNo)) {
            return Intrinsics.areEqual(this.frequency, frequentBillDto.frequency);
        }
        int i8 = copydefault;
        int i9 = i8 + 77;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 45;
        component3 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.accountNo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.category;
        if (num == null) {
            int i2 = copydefault + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i4 = copydefault + 79;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.debitPartyName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.debitPartyNo;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.frequency;
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentBillDto(accountNo=" + this.accountNo + ", category=" + this.category + ", debitPartyName=" + this.debitPartyName + ", debitPartyNo=" + this.debitPartyNo + ", frequency=" + this.frequency + ")";
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountNo);
        Integer num = this.category;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.debitPartyName);
        dest.writeString(this.debitPartyNo);
        Integer num2 = this.frequency;
        if (num2 == null) {
            int i4 = copydefault + 81;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(num2.intValue());
        int i6 = component3 + 29;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }
}
