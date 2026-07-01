package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.country;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001dH×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileCountry;", "Landroid/os/Parcelable;", "name", "", "iso2", "iso3", "carriers", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/country/SendToMobileCarrier;", "dialing_code", "currency_code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIso2", "getIso3", "getCarriers", "()Ljava/util/List;", "getDialing_code", "getCurrency_code", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileCountry implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SendToMobileCountry> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private final List<SendToMobileCarrier> carriers;
    private final String currency_code;
    private final String dialing_code;
    private final String iso2;
    private final String iso3;
    private final String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileCountry> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountry createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = copydefault + 95;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            }
            for (int i5 = 0; i5 != i2; i5++) {
                int i6 = copydefault + 103;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(SendToMobileCarrier.CREATOR.createFromParcel(parcel));
            }
            return new SendToMobileCountry(string, string2, string3, arrayList, parcel.readString(), parcel.readString());
        }

        @Override
        public SendToMobileCountry createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SendToMobileCountry sendToMobileCountryCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 49;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return sendToMobileCountryCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountry[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 71;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            SendToMobileCountry[] sendToMobileCountryArr = new SendToMobileCountry[i];
            int i6 = i3 + 117;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return sendToMobileCountryArr;
        }

        @Override
        public SendToMobileCountry[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 95;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SendToMobileCountry[] sendToMobileCountryArrNewArray = newArray(i);
            int i4 = copydefault + 29;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return sendToMobileCountryArrNewArray;
        }
    }

    public SendToMobileCountry(String str, String str2, String str3, List<SendToMobileCarrier> list, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.iso2 = str2;
        this.iso3 = str3;
        this.carriers = list;
        this.dialing_code = str4;
        this.currency_code = str5;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    public final String getIso2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iso2;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIso3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.iso3;
        int i4 = i2 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<SendToMobileCarrier> getCarriers() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<SendToMobileCarrier> list = this.carriers;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String getDialing_code() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dialing_code;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    public final String getCurrency_code() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.currency_code;
            int i4 = 57 / 0;
        } else {
            str = this.currency_code;
        }
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component1 + 125;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SendToMobileCountry copy$default(SendToMobileCountry sendToMobileCountry, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 7;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 13;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = sendToMobileCountry.name;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = sendToMobileCountry.iso2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i8 = ShareDataUIState + 23;
            component2 = i8 % 128;
            if (i8 % 2 != 0) {
                String str8 = sendToMobileCountry.iso3;
                throw null;
            }
            str3 = sendToMobileCountry.iso3;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            list = sendToMobileCountry.carriers;
            int i9 = component2 + 5;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            int i11 = component2 + 73;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            str4 = sendToMobileCountry.dialing_code;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = sendToMobileCountry.currency_code;
        }
        return sendToMobileCountry.copy(str6, str7, str9, list2, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.iso2;
        int i4 = i2 + 59;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.iso3;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<SendToMobileCarrier> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.carriers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dialing_code;
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.currency_code;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SendToMobileCountry copy(String name, String iso2, String iso3, List<SendToMobileCarrier> carriers, String dialing_code, String currency_code) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(iso2, "");
        Intrinsics.checkNotNullParameter(iso3, "");
        Intrinsics.checkNotNullParameter(carriers, "");
        Intrinsics.checkNotNullParameter(dialing_code, "");
        Intrinsics.checkNotNullParameter(currency_code, "");
        SendToMobileCountry sendToMobileCountry = new SendToMobileCountry(name, iso2, iso3, carriers, dialing_code, currency_code);
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return sendToMobileCountry;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 119;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 71;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SendToMobileCountry)) {
            return false;
        }
        SendToMobileCountry sendToMobileCountry = (SendToMobileCountry) other;
        if (!Intrinsics.areEqual(this.name, sendToMobileCountry.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iso2, sendToMobileCountry.iso2)) {
            int i7 = ShareDataUIState + 37;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iso3, sendToMobileCountry.iso3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.carriers, sendToMobileCountry.carriers)) {
            int i9 = ShareDataUIState + 39;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.dialing_code, sendToMobileCountry.dialing_code)) {
            return Intrinsics.areEqual(this.currency_code, sendToMobileCountry.currency_code);
        }
        int i11 = ShareDataUIState + 81;
        component2 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.name.hashCode() * 31) + this.iso2.hashCode()) * 31) + this.iso3.hashCode()) * 31) + this.carriers.hashCode()) * 31) + this.dialing_code.hashCode()) * 31) + this.currency_code.hashCode();
        int i4 = ShareDataUIState + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileCountry(name=" + this.name + ", iso2=" + this.iso2 + ", iso3=" + this.iso3 + ", carriers=" + this.carriers + ", dialing_code=" + this.dialing_code + ", currency_code=" + this.currency_code + ')';
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        dest.writeString(this.iso2);
        dest.writeString(this.iso3);
        List<SendToMobileCarrier> list = this.carriers;
        dest.writeInt(list.size());
        Iterator<SendToMobileCarrier> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        dest.writeString(this.dialing_code);
        dest.writeString(this.currency_code);
        int i4 = ShareDataUIState + 71;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
