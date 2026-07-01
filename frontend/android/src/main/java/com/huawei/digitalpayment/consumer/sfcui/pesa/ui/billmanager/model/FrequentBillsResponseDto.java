package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/FrequentBillsResponseDto;", "Landroid/os/Parcelable;", "frequentBillsDto", "", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/FrequentBillDto;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;)V", "getFrequentBillsDto", "()Ljava/util/List;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentBillsResponseDto implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FrequentBillsResponseDto> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("body")
    private final List<FrequentBillDto> frequentBillsDto;

    @SerializedName("header")
    private final Header header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FrequentBillsResponseDto> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FrequentBillsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component3 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Header headerCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    int i6 = component3 + 111;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(FrequentBillDto.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() == 0) {
                int i8 = component3 + 21;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            }
            return new FrequentBillsResponseDto(arrayList2, headerCreateFromParcel);
        }

        @Override
        public FrequentBillsResponseDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FrequentBillsResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 53;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            FrequentBillsResponseDto[] frequentBillsResponseDtoArr = new FrequentBillsResponseDto[i];
            int i6 = i3 + 3;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return frequentBillsResponseDtoArr;
        }

        @Override
        public FrequentBillsResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 67;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FrequentBillsResponseDto[] frequentBillsResponseDtoArrNewArray = newArray(i);
            int i5 = component3 + 73;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
            return frequentBillsResponseDtoArrNewArray;
        }
    }

    public FrequentBillsResponseDto(List<FrequentBillDto> list, Header header) {
        this.frequentBillsDto = list;
        this.header = header;
    }

    public final List<FrequentBillDto> getFrequentBillsDto() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<FrequentBillDto> list = this.frequentBillsDto;
        int i4 = i3 + 25;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return list;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.header;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    static {
        int i = ShareDataUIState + 31;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FrequentBillsResponseDto copy$default(FrequentBillsResponseDto frequentBillsResponseDto, List list, Header header, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 75;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            list = frequentBillsResponseDto.frequentBillsDto;
        }
        if ((i & 2) != 0) {
            header = frequentBillsResponseDto.header;
        }
        FrequentBillsResponseDto frequentBillsResponseDtoCopy = frequentBillsResponseDto.copy(list, header);
        int i5 = component3 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return frequentBillsResponseDtoCopy;
    }

    public final List<FrequentBillDto> component1() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<FrequentBillDto> list = this.frequentBillsDto;
        int i5 = i3 + 1;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FrequentBillsResponseDto copy(List<FrequentBillDto> frequentBillsDto, Header header) {
        int i = 2 % 2;
        FrequentBillsResponseDto frequentBillsResponseDto = new FrequentBillsResponseDto(frequentBillsDto, header);
        int i2 = component1 + 57;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return frequentBillsResponseDto;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof FrequentBillsResponseDto) {
            FrequentBillsResponseDto frequentBillsResponseDto = (FrequentBillsResponseDto) other;
            return Intrinsics.areEqual(this.frequentBillsDto, frequentBillsResponseDto.frequentBillsDto) && Intrinsics.areEqual(this.header, frequentBillsResponseDto.header);
        }
        int i5 = i3 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<FrequentBillDto> list = this.frequentBillsDto;
        if (list == null) {
            int i5 = i2 + 91;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Header header = this.header;
        return (iHashCode * 31) + (header != null ? header.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentBillsResponseDto(frequentBillsDto=" + this.frequentBillsDto + ", header=" + this.header + ")";
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            throw null;
        }
        List<FrequentBillDto> list = this.frequentBillsDto;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<FrequentBillDto> it = list.iterator();
            while (it.hasNext()) {
                int i4 = component1 + 123;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                it.next().writeToParcel(dest, flags);
            }
        }
        Header header = this.header;
        if (header != null) {
            dest.writeInt(1);
            header.writeToParcel(dest, flags);
        } else {
            int i6 = component3 + 37;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            dest.writeInt(0);
        }
    }
}
