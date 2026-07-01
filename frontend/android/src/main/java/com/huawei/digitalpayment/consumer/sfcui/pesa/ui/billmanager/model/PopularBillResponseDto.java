package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/PopularBillResponseDto;", "Landroid/os/Parcelable;", "popularBillsDto", "", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/PopularBillDto;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;)V", "getPopularBillsDto", "()Ljava/util/List;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopularBillResponseDto implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PopularBillResponseDto> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("header")
    private final Header header;

    @SerializedName("body")
    private final List<PopularBillDto> popularBillsDto;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PopularBillResponseDto> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PopularBillResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Header headerCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                int i7 = 0;
                while (i7 != i6) {
                    int i8 = copydefault + 71;
                    component1 = i8 % 128;
                    if (i8 % 2 != 0) {
                        arrayList.add(PopularBillDto.CREATOR.createFromParcel(parcel));
                        i7 += 21;
                    } else {
                        arrayList.add(PopularBillDto.CREATOR.createFromParcel(parcel));
                        i7++;
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() == 0) {
                int i9 = copydefault + 57;
                component1 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            } else {
                headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            }
            return new PopularBillResponseDto(arrayList2, headerCreateFromParcel);
        }

        @Override
        public PopularBillResponseDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            PopularBillResponseDto popularBillResponseDtoCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 99;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return popularBillResponseDtoCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PopularBillResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 123;
            component1 = i3 % 128;
            PopularBillResponseDto[] popularBillResponseDtoArr = new PopularBillResponseDto[i];
            if (i3 % 2 == 0) {
                return popularBillResponseDtoArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public PopularBillResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 43;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            PopularBillResponseDto[] popularBillResponseDtoArrNewArray = newArray(i);
            int i5 = copydefault + 53;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return popularBillResponseDtoArrNewArray;
        }
    }

    public PopularBillResponseDto(List<PopularBillDto> list, Header header) {
        this.popularBillsDto = list;
        this.header = header;
    }

    public final List<PopularBillDto> getPopularBillsDto() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<PopularBillDto> list = this.popularBillsDto;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        throw null;
    }

    static {
        int i = copydefault + 37;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PopularBillResponseDto copy$default(PopularBillResponseDto popularBillResponseDto, List list, Header header, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = popularBillResponseDto.popularBillsDto;
        }
        if ((i & 2) != 0) {
            int i3 = component2;
            int i4 = i3 + 49;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            Header header2 = popularBillResponseDto.header;
            int i6 = i3 + 107;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            header = header2;
        }
        return popularBillResponseDto.copy(list, header);
    }

    public final List<PopularBillDto> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<PopularBillDto> list = this.popularBillsDto;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return list;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.header;
        }
        throw null;
    }

    public final PopularBillResponseDto copy(List<PopularBillDto> popularBillsDto, Header header) {
        int i = 2 % 2;
        PopularBillResponseDto popularBillResponseDto = new PopularBillResponseDto(popularBillsDto, header);
        int i2 = component2 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return popularBillResponseDto;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopularBillResponseDto)) {
            int i2 = component2 + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PopularBillResponseDto popularBillResponseDto = (PopularBillResponseDto) other;
        if (!Intrinsics.areEqual(this.popularBillsDto, popularBillResponseDto.popularBillsDto) || !Intrinsics.areEqual(this.header, popularBillResponseDto.header)) {
            return false;
        }
        int i4 = component3 + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<PopularBillDto> list = this.popularBillsDto;
        int iHashCode2 = 0;
        if (list == null) {
            int i5 = i3 + 41;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Header header = this.header;
        if (header != null) {
            iHashCode2 = header.hashCode();
            int i7 = component3 + 11;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PopularBillResponseDto(popularBillsDto=" + this.popularBillsDto + ", header=" + this.header + ")";
        int i2 = component2 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            throw null;
        }
        List<PopularBillDto> list = this.popularBillsDto;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<PopularBillDto> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
                int i4 = component2 + 115;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Header header = this.header;
        if (header != null) {
            dest.writeInt(1);
            header.writeToParcel(dest, flags);
            return;
        }
        dest.writeInt(0);
        int i6 = component2 + 71;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 2;
        }
    }
}
