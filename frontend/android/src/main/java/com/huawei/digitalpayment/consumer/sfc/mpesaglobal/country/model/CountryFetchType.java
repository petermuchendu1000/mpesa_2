package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "COUNTRIES", "US_STATES", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryFetchType implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final CountryFetchType[] $VALUES;
    public static final Parcelable.Creator<CountryFetchType> CREATOR;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    public static final CountryFetchType COUNTRIES = new CountryFetchType("COUNTRIES", 0);
    public static final CountryFetchType US_STATES = new CountryFetchType("US_STATES", 1);

    private CountryFetchType(String str, int i) {
    }

    static {
        CountryFetchType[] countryFetchTypeArr$values = $values();
        $VALUES = countryFetchTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(countryFetchTypeArr$values);
        CREATOR = new Parcelable.Creator<CountryFetchType>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountryFetchType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (i3 != 0) {
                    return CountryFetchType.valueOf(string);
                }
                CountryFetchType.valueOf(string);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public CountryFetchType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 23;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                CountryFetchType countryFetchTypeCreateFromParcel = createFromParcel(parcel);
                int i3 = copydefault + 125;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return countryFetchTypeCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountryFetchType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component2 = i3 % 128;
                CountryFetchType[] countryFetchTypeArr = new CountryFetchType[i];
                if (i3 % 2 != 0) {
                    int i4 = 43 / 0;
                }
                return countryFetchTypeArr;
            }

            @Override
            public CountryFetchType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    newArray(i);
                    throw null;
                }
                CountryFetchType[] countryFetchTypeArrNewArray = newArray(i);
                int i4 = copydefault + 43;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return countryFetchTypeArrNewArray;
            }
        };
        int i = component2 + 3;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static CountryFetchType valueOf(String str) {
        CountryFetchType countryFetchType;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            countryFetchType = (CountryFetchType) Enum.valueOf(CountryFetchType.class, str);
            int i3 = 49 / 0;
        } else {
            countryFetchType = (CountryFetchType) Enum.valueOf(CountryFetchType.class, str);
        }
        int i4 = ShareDataUIState + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return countryFetchType;
    }

    public static CountryFetchType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CountryFetchType[] countryFetchTypeArr = (CountryFetchType[]) $VALUES.clone();
        int i4 = component1 + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return countryFetchTypeArr;
    }

    private static final CountryFetchType[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        CountryFetchType[] countryFetchTypeArr = {COUNTRIES, US_STATES};
        int i5 = i3 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return countryFetchTypeArr;
    }

    public static EnumEntries<CountryFetchType> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        EnumEntries<CountryFetchType> enumEntries = $ENTRIES;
        int i5 = i3 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
        int i4 = component1 + 35;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }
}
