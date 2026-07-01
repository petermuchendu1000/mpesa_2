package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryListType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "WESTERN_UNION", "ROAMING_CASHOUT", "SEND_TO_MOBILE", "SEND_TO_BANK", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryListType implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final CountryListType[] $VALUES;
    public static final Parcelable.Creator<CountryListType> CREATOR;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;
    public static final CountryListType DEFAULT = new CountryListType("DEFAULT", 0);
    public static final CountryListType WESTERN_UNION = new CountryListType("WESTERN_UNION", 1);
    public static final CountryListType ROAMING_CASHOUT = new CountryListType("ROAMING_CASHOUT", 2);
    public static final CountryListType SEND_TO_MOBILE = new CountryListType("SEND_TO_MOBILE", 3);
    public static final CountryListType SEND_TO_BANK = new CountryListType("SEND_TO_BANK", 4);

    private CountryListType(String str, int i) {
    }

    static {
        CountryListType[] countryListTypeArr$values = $values();
        $VALUES = countryListTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(countryListTypeArr$values);
        CREATOR = new Parcelable.Creator<CountryListType>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountryListType createFromParcel(Parcel parcel) {
                CountryListType countryListTypeValueOf;
                int i = 2 % 2;
                int i2 = component2 + 51;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (i3 == 0) {
                    countryListTypeValueOf = CountryListType.valueOf(string);
                    int i4 = 80 / 0;
                } else {
                    countryListTypeValueOf = CountryListType.valueOf(string);
                }
                int i5 = ShareDataUIState + 49;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return countryListTypeValueOf;
            }

            @Override
            public CountryListType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 123;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountryListType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                component2 = i3 % 128;
                CountryListType[] countryListTypeArr = new CountryListType[i];
                if (i3 % 2 != 0) {
                    int i4 = 30 / 0;
                }
                return countryListTypeArr;
            }

            @Override
            public CountryListType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 85;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return newArray(i);
                }
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i = component2 + 65;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static CountryListType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CountryListType countryListType = (CountryListType) Enum.valueOf(CountryListType.class, str);
        int i4 = ShareDataUIState + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return countryListType;
        }
        throw null;
    }

    public static CountryListType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CountryListType[] countryListTypeArr = (CountryListType[]) $VALUES.clone();
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return countryListTypeArr;
    }

    private static final CountryListType[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        CountryListType[] countryListTypeArr = {DEFAULT, WESTERN_UNION, ROAMING_CASHOUT, SEND_TO_MOBILE, SEND_TO_BANK};
        int i5 = i2 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return countryListTypeArr;
    }

    public static EnumEntries<CountryListType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
