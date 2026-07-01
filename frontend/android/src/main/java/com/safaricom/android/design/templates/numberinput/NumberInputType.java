package com.safaricom.android.design.templates.numberinput;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0012"}, d2 = {"Lcom/safaricom/android/design/templates/numberinput/NumberInputType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "GENERIC", "AGENT_NUMBER", "STORE_NUMBER", "TILL_NUMBER", "MSISDN_NUMBER", "VOUCHER_NUMBER", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcNumberInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberInputType implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final NumberInputType[] $VALUES;
    public static final Parcelable.Creator<NumberInputType> CREATOR;
    public static final NumberInputType GENERIC = new NumberInputType("GENERIC", 0);
    public static final NumberInputType AGENT_NUMBER = new NumberInputType("AGENT_NUMBER", 1);
    public static final NumberInputType STORE_NUMBER = new NumberInputType("STORE_NUMBER", 2);
    public static final NumberInputType TILL_NUMBER = new NumberInputType("TILL_NUMBER", 3);
    public static final NumberInputType MSISDN_NUMBER = new NumberInputType("MSISDN_NUMBER", 4);
    public static final NumberInputType VOUCHER_NUMBER = new NumberInputType("VOUCHER_NUMBER", 5);

    @Override
    public final int describeContents() {
        return 0;
    }

    private NumberInputType(String str, int i) {
    }

    static {
        NumberInputType[] numberInputTypeArr$values = $values();
        $VALUES = numberInputTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(numberInputTypeArr$values);
        CREATOR = new Parcelable.Creator<NumberInputType>() {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NumberInputType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return NumberInputType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NumberInputType[] newArray(int i) {
                return new NumberInputType[i];
            }
        };
    }

    public static NumberInputType valueOf(String str) {
        return (NumberInputType) Enum.valueOf(NumberInputType.class, str);
    }

    public static NumberInputType[] values() {
        return (NumberInputType[]) $VALUES.clone();
    }

    private static final NumberInputType[] $values() {
        return new NumberInputType[]{GENERIC, AGENT_NUMBER, STORE_NUMBER, TILL_NUMBER, MSISDN_NUMBER, VOUCHER_NUMBER};
    }

    public static EnumEntries<NumberInputType> getEntries() {
        return $ENTRIES;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
    }
}
