package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0007H\u0007J\u0013\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102H×\u0003J\t\u00103\u001a\u00020\u0007H×\u0001J\t\u00104\u001a\u00020\u0003H×\u0001J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0007H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0017¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountDto;", "Landroid/os/Parcelable;", "accountName", "", "accountNo", "amount", "billId", "", "dueDate", GriverParams.ShareParams.IMAGE_URL, "msisdn", "paybillNo", "reminderDate", "reminderEnabled", "", "reminderFrequency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNo", "getAmount", "getBillId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDueDate", "getImageUrl", "getMsisdn", "getPaybillNo", "getReminderDate", "getReminderEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReminderFrequency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountDto;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillAccountDto implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BillAccountDto> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("accountName")
    private final String accountName;

    @SerializedName("accountNo")
    private final String accountNo;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("billId")
    private final Integer billId;

    @SerializedName("dueDate")
    private final String dueDate;

    @SerializedName(GriverParams.ShareParams.IMAGE_URL)
    private final String imageUrl;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("paybillNo")
    private final Integer paybillNo;

    @SerializedName("reminderDate")
    private final String reminderDate;

    @SerializedName("reminderEnabled")
    private final Boolean reminderEnabled;

    @SerializedName("reminderFrequency")
    private final Integer reminderFrequency;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BillAccountDto> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BillAccountDto createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Object obj = null;
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = copydefault + 115;
                int i3 = i2 % 128;
                component3 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 41;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i7 = copydefault + 13;
                    int i8 = i7 % 128;
                    component3 = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 39;
                    copydefault = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i12 = component3 + 43;
                copydefault = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new BillAccountDto(string, string2, string3, numValueOf3, string4, string5, string6, numValueOf, string7, boolValueOf, numValueOf2);
        }

        @Override
        public BillAccountDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            BillAccountDto billAccountDtoCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 43;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return billAccountDtoCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BillAccountDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 71;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            BillAccountDto[] billAccountDtoArr = new BillAccountDto[i];
            int i6 = i3 + 109;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return billAccountDtoArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BillAccountDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public BillAccountDto(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, String str7, Boolean bool, Integer num3) {
        this.accountName = str;
        this.accountNo = str2;
        this.amount = str3;
        this.billId = num;
        this.dueDate = str4;
        this.imageUrl = str5;
        this.msisdn = str6;
        this.paybillNo = num2;
        this.reminderDate = str7;
        this.reminderEnabled = bool;
        this.reminderFrequency = num3;
    }

    public final String getAccountName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 31;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountName;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAccountNo() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.accountNo;
        int i5 = i3 + 51;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getBillId() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.billId;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return num;
    }

    public final String getDueDate() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dueDate;
        }
        throw null;
    }

    public final String getImageUrl() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.imageUrl;
            int i4 = 58 / 0;
        } else {
            str = this.imageUrl;
        }
        int i5 = i3 + 41;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getPaybillNo() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.paybillNo;
        int i4 = i3 + 79;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getReminderDate() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.reminderDate;
        int i5 = i3 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getReminderEnabled() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.reminderEnabled;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final Integer getReminderFrequency() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.reminderFrequency;
        }
        throw null;
    }

    static {
        int i = component1 + 115;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static BillAccountDto copy$default(BillAccountDto billAccountDto, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, String str7, Boolean bool, Integer num3, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        Boolean bool2;
        Integer num4;
        int i2 = 2 % 2;
        int i3 = component3 + 101;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 101;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str8 = billAccountDto.accountName;
        } else {
            str8 = str;
        }
        String str11 = (i & 2) != 0 ? billAccountDto.accountNo : str2;
        String str12 = (i & 4) != 0 ? billAccountDto.amount : str3;
        Integer num5 = (i & 8) != 0 ? billAccountDto.billId : num;
        if ((i & 16) != 0) {
            int i8 = i4 + 61;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str9 = billAccountDto.dueDate;
            int i10 = i4 + 15;
            component3 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str9 = str4;
        }
        String str13 = (i & 32) != 0 ? billAccountDto.imageUrl : str5;
        String str14 = (i & 64) != 0 ? billAccountDto.msisdn : str6;
        Integer num6 = (i & 128) != 0 ? billAccountDto.paybillNo : num2;
        if ((i & 256) != 0) {
            int i12 = i4 + 9;
            component3 = i12 % 128;
            if (i12 % 2 == 0) {
                String str15 = billAccountDto.reminderDate;
                throw null;
            }
            str10 = billAccountDto.reminderDate;
        } else {
            str10 = str7;
        }
        if ((i & 512) != 0) {
            bool2 = billAccountDto.reminderEnabled;
            int i13 = component3 + 41;
            component2 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            bool2 = bool;
        }
        if ((i & 1024) != 0) {
            int i15 = component2 + 71;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            num4 = billAccountDto.reminderFrequency;
        } else {
            num4 = num3;
        }
        return billAccountDto.copy(str8, str11, str12, num5, str9, str13, str14, num6, str10, bool2, num4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accountName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component10() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.reminderEnabled;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final Integer component11() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.reminderFrequency;
        int i5 = i3 + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNo;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.billId;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.dueDate;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imageUrl;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paybillNo;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.reminderDate;
        int i4 = i2 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BillAccountDto copy(String accountName, String accountNo, String amount, Integer billId, String dueDate, String imageUrl, String msisdn, Integer paybillNo, String reminderDate, Boolean reminderEnabled, Integer reminderFrequency) {
        int i = 2 % 2;
        BillAccountDto billAccountDto = new BillAccountDto(accountName, accountNo, amount, billId, dueDate, imageUrl, msisdn, paybillNo, reminderDate, reminderEnabled, reminderFrequency);
        int i2 = component2 + 83;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return billAccountDto;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillAccountDto)) {
            int i2 = component2 + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        BillAccountDto billAccountDto = (BillAccountDto) other;
        if (!Intrinsics.areEqual(this.accountName, billAccountDto.accountName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountNo, billAccountDto.accountNo)) {
            int i4 = component3 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.amount, billAccountDto.amount) && !(!Intrinsics.areEqual(this.billId, billAccountDto.billId))) {
            if (!Intrinsics.areEqual(this.dueDate, billAccountDto.dueDate)) {
                int i6 = component3 + 41;
                component2 = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.imageUrl, billAccountDto.imageUrl)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.msisdn, billAccountDto.msisdn)) {
                int i7 = component2;
                int i8 = i7 + 117;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 111;
                component3 = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.paybillNo, billAccountDto.paybillNo) || !Intrinsics.areEqual(this.reminderDate, billAccountDto.reminderDate) || !Intrinsics.areEqual(this.reminderEnabled, billAccountDto.reminderEnabled)) {
                return false;
            }
            if (Intrinsics.areEqual(this.reminderFrequency, billAccountDto.reminderFrequency)) {
                return true;
            }
            int i12 = component3 + 103;
            component2 = i12 % 128;
            return i12 % 2 != 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        String str = this.accountName;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.accountNo;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        if (str3 == null) {
            int i2 = component3 + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        Integer num = this.billId;
        if (num == null) {
            int i4 = component3 + 125;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str4 = this.dueDate;
        if (str4 == null) {
            int i6 = component3 + 39;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.imageUrl;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.msisdn;
        if (str6 == null) {
            int i8 = component2 + 43;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str6.hashCode();
        }
        Integer num2 = this.paybillNo;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        String str7 = this.reminderDate;
        if (str7 == null) {
            int i10 = component3 + 53;
            int i11 = i10 % 128;
            component2 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 81;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str7.hashCode();
        }
        Boolean bool = this.reminderEnabled;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.reminderFrequency;
        return (((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode5) * 31) + iHashCode10) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillAccountDto(accountName=" + this.accountName + ", accountNo=" + this.accountNo + ", amount=" + this.amount + ", billId=" + this.billId + ", dueDate=" + this.dueDate + ", imageUrl=" + this.imageUrl + ", msisdn=" + this.msisdn + ", paybillNo=" + this.paybillNo + ", reminderDate=" + this.reminderDate + ", reminderEnabled=" + this.reminderEnabled + ", reminderFrequency=" + this.reminderFrequency + ")";
        int i2 = component3 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountName);
        dest.writeString(this.accountNo);
        dest.writeString(this.amount);
        Integer num = this.billId;
        if (num == null) {
            dest.writeInt(0);
            int i2 = component3 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.dueDate);
        dest.writeString(this.imageUrl);
        dest.writeString(this.msisdn);
        Integer num2 = this.paybillNo;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.reminderDate);
        Boolean bool = this.reminderEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.reminderFrequency;
        if (num3 != null) {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
            return;
        }
        int i4 = component2 + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        dest.writeInt(0);
        int i6 = component3 + 81;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }
}
