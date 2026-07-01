package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0007R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountsResponseDto;", "Landroid/os/Parcelable;", "bIllAccountsDto", "", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountDto;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;)V", "getBIllAccountsDto", "()Ljava/util/List;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillAccountsResponseDto implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BillAccountsResponseDto> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("body")
    private final List<BillAccountDto> bIllAccountsDto;

    @SerializedName("header")
    private final Header header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BillAccountsResponseDto> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BillAccountsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            BillAccountDto billAccountDtoCreateFromParcel;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Header headerCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                headerCreateFromParcel.hashCode();
                throw null;
            }
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 5;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    if (parcel.readInt() == 0) {
                        int i8 = component3 + 95;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        billAccountDtoCreateFromParcel = null;
                    } else {
                        billAccountDtoCreateFromParcel = BillAccountDto.CREATOR.createFromParcel(parcel);
                    }
                    arrayList.add(billAccountDtoCreateFromParcel);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() == 0) {
                int i10 = component3 + 121;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
            } else {
                headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            }
            return new BillAccountsResponseDto(arrayList2, headerCreateFromParcel);
        }

        @Override
        public BillAccountsResponseDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 31;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BillAccountsResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 27;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            BillAccountsResponseDto[] billAccountsResponseDtoArr = new BillAccountsResponseDto[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 81;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return billAccountsResponseDtoArr;
        }

        @Override
        public BillAccountsResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 1;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public BillAccountsResponseDto(List<BillAccountDto> list, Header header) {
        this.bIllAccountsDto = list;
        this.header = header;
    }

    public final List<BillAccountDto> getBIllAccountsDto() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bIllAccountsDto;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Header header = this.header;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    static {
        int i = component3 + 95;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BillAccountsResponseDto copy$default(BillAccountsResponseDto billAccountsResponseDto, List list, Header header, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = billAccountsResponseDto.bIllAccountsDto;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 57;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                header = billAccountsResponseDto.header;
                int i4 = 41 / 0;
            } else {
                header = billAccountsResponseDto.header;
            }
        }
        BillAccountsResponseDto billAccountsResponseDtoCopy = billAccountsResponseDto.copy(list, header);
        int i5 = component1 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return billAccountsResponseDtoCopy;
    }

    public final List<BillAccountDto> component1() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bIllAccountsDto;
        }
        throw null;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Header header = this.header;
        int i4 = i2 + 77;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return header;
        }
        throw null;
    }

    public final BillAccountsResponseDto copy(List<BillAccountDto> bIllAccountsDto, Header header) {
        int i = 2 % 2;
        BillAccountsResponseDto billAccountsResponseDto = new BillAccountsResponseDto(bIllAccountsDto, header);
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return billAccountsResponseDto;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof BillAccountsResponseDto) {
            BillAccountsResponseDto billAccountsResponseDto = (BillAccountsResponseDto) other;
            if (Intrinsics.areEqual(this.bIllAccountsDto, billAccountsResponseDto.bIllAccountsDto)) {
                return Intrinsics.areEqual(this.header, billAccountsResponseDto.header);
            }
            int i5 = copydefault + 93;
            component1 = i5 % 128;
            return i5 % 2 == 0;
        }
        int i6 = i3 + 107;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        List<BillAccountDto> list;
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int iHashCode2 = 0;
        if (i2 % 2 != 0 ? (list = this.bIllAccountsDto) != null : (list = this.bIllAccountsDto) != null) {
            iHashCode = list.hashCode();
        } else {
            int i4 = i3 + 123;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        Header header = this.header;
        if (header != null) {
            iHashCode2 = header.hashCode();
            int i6 = copydefault + 63;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillAccountsResponseDto(bIllAccountsDto=" + this.bIllAccountsDto + ", header=" + this.header + ")";
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            throw null;
        }
        List<BillAccountDto> list = this.bIllAccountsDto;
        if (list == null) {
            int i4 = copydefault + 41;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (BillAccountDto billAccountDto : list) {
                if (billAccountDto == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    billAccountDto.writeToParcel(dest, flags);
                }
            }
        }
        Header header = this.header;
        if (header == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            header.writeToParcel(dest, flags);
        }
    }
}
