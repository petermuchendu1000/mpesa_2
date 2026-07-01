package com.safaricom.sharedui.compose.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010-\u001a\u00020.J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020.j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u00064"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", NetworkUtils.NETWORK_TYPE_NONE, "EDIT_AMOUNT", "EDIT_NUMBER", "EDIT_TEXT", "CHOOSE_RECIPIENT", "EDIT_RECIPIENT", "EDIT_FIRST_NAME", "EDIT_MIDDLE_NAME", "EDIT_LAST_NAME", "EDIT_OPERATOR_ID", "EDIT_CONTACT_NUMBER", "EDIT_DATE_BIRTH", "EDIT_YEAR_BIRTH", "EDIT_ID_NUMBER", "EDIT_NATIONALITY", "EDIT_GENDER", "CHOOSE_GIF", "REMOVE_GIF", "EDIT_BANK_INFO", "EDIT_STORE_NUMBER", "EDIT_DESCRIPTION", "CHOOSE_FAST_WITHDRAWAL", "EDIT_IMSI", "EDIT_ICCID", "EDIT_CUSTOMER_ID", "CHOOSE_ACCOUNT", "EDIT_SENDER", "EDIT_RECEIVER", "EDIT_ROLE", "EDIT_LANGUAGE", "EDIT_LICENSE_PLATE", "EDIT_FUEL_TYPE", "EDIT_FUEL_CAPACITY", "EDIT_VEHICLE_KILOMETERS", "EDIT_PACKAGE", "EDIT_BUNDLE", "EDIT_PAYMENT_METHOD", "EDIT_OCCUPATION", "EDIT_SOURCE_OF_FUNDS", "EDIT_PURPOSE_OF_THE_ACCOUNT", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmInfoAction implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final ConfirmInfoAction[] $VALUES;
    public static final Parcelable.Creator<ConfirmInfoAction> CREATOR;
    public static final ConfirmInfoAction NONE = new ConfirmInfoAction(NetworkUtils.NETWORK_TYPE_NONE, 0);
    public static final ConfirmInfoAction EDIT_AMOUNT = new ConfirmInfoAction("EDIT_AMOUNT", 1);
    public static final ConfirmInfoAction EDIT_NUMBER = new ConfirmInfoAction("EDIT_NUMBER", 2);
    public static final ConfirmInfoAction EDIT_TEXT = new ConfirmInfoAction("EDIT_TEXT", 3);
    public static final ConfirmInfoAction CHOOSE_RECIPIENT = new ConfirmInfoAction("CHOOSE_RECIPIENT", 4);
    public static final ConfirmInfoAction EDIT_RECIPIENT = new ConfirmInfoAction("EDIT_RECIPIENT", 5);
    public static final ConfirmInfoAction EDIT_FIRST_NAME = new ConfirmInfoAction("EDIT_FIRST_NAME", 6);
    public static final ConfirmInfoAction EDIT_MIDDLE_NAME = new ConfirmInfoAction("EDIT_MIDDLE_NAME", 7);
    public static final ConfirmInfoAction EDIT_LAST_NAME = new ConfirmInfoAction("EDIT_LAST_NAME", 8);
    public static final ConfirmInfoAction EDIT_OPERATOR_ID = new ConfirmInfoAction("EDIT_OPERATOR_ID", 9);
    public static final ConfirmInfoAction EDIT_CONTACT_NUMBER = new ConfirmInfoAction("EDIT_CONTACT_NUMBER", 10);
    public static final ConfirmInfoAction EDIT_DATE_BIRTH = new ConfirmInfoAction("EDIT_DATE_BIRTH", 11);
    public static final ConfirmInfoAction EDIT_YEAR_BIRTH = new ConfirmInfoAction("EDIT_YEAR_BIRTH", 12);
    public static final ConfirmInfoAction EDIT_ID_NUMBER = new ConfirmInfoAction("EDIT_ID_NUMBER", 13);
    public static final ConfirmInfoAction EDIT_NATIONALITY = new ConfirmInfoAction("EDIT_NATIONALITY", 14);
    public static final ConfirmInfoAction EDIT_GENDER = new ConfirmInfoAction("EDIT_GENDER", 15);
    public static final ConfirmInfoAction CHOOSE_GIF = new ConfirmInfoAction("CHOOSE_GIF", 16);
    public static final ConfirmInfoAction REMOVE_GIF = new ConfirmInfoAction("REMOVE_GIF", 17);
    public static final ConfirmInfoAction EDIT_BANK_INFO = new ConfirmInfoAction("EDIT_BANK_INFO", 18);
    public static final ConfirmInfoAction EDIT_STORE_NUMBER = new ConfirmInfoAction("EDIT_STORE_NUMBER", 19);
    public static final ConfirmInfoAction EDIT_DESCRIPTION = new ConfirmInfoAction("EDIT_DESCRIPTION", 20);
    public static final ConfirmInfoAction CHOOSE_FAST_WITHDRAWAL = new ConfirmInfoAction("CHOOSE_FAST_WITHDRAWAL", 21);
    public static final ConfirmInfoAction EDIT_IMSI = new ConfirmInfoAction("EDIT_IMSI", 22);
    public static final ConfirmInfoAction EDIT_ICCID = new ConfirmInfoAction("EDIT_ICCID", 23);
    public static final ConfirmInfoAction EDIT_CUSTOMER_ID = new ConfirmInfoAction("EDIT_CUSTOMER_ID", 24);
    public static final ConfirmInfoAction CHOOSE_ACCOUNT = new ConfirmInfoAction("CHOOSE_ACCOUNT", 25);
    public static final ConfirmInfoAction EDIT_SENDER = new ConfirmInfoAction("EDIT_SENDER", 26);
    public static final ConfirmInfoAction EDIT_RECEIVER = new ConfirmInfoAction("EDIT_RECEIVER", 27);
    public static final ConfirmInfoAction EDIT_ROLE = new ConfirmInfoAction("EDIT_ROLE", 28);
    public static final ConfirmInfoAction EDIT_LANGUAGE = new ConfirmInfoAction("EDIT_LANGUAGE", 29);
    public static final ConfirmInfoAction EDIT_LICENSE_PLATE = new ConfirmInfoAction("EDIT_LICENSE_PLATE", 30);
    public static final ConfirmInfoAction EDIT_FUEL_TYPE = new ConfirmInfoAction("EDIT_FUEL_TYPE", 31);
    public static final ConfirmInfoAction EDIT_FUEL_CAPACITY = new ConfirmInfoAction("EDIT_FUEL_CAPACITY", 32);
    public static final ConfirmInfoAction EDIT_VEHICLE_KILOMETERS = new ConfirmInfoAction("EDIT_VEHICLE_KILOMETERS", 33);
    public static final ConfirmInfoAction EDIT_PACKAGE = new ConfirmInfoAction("EDIT_PACKAGE", 34);
    public static final ConfirmInfoAction EDIT_BUNDLE = new ConfirmInfoAction("EDIT_BUNDLE", 35);
    public static final ConfirmInfoAction EDIT_PAYMENT_METHOD = new ConfirmInfoAction("EDIT_PAYMENT_METHOD", 36);
    public static final ConfirmInfoAction EDIT_OCCUPATION = new ConfirmInfoAction("EDIT_OCCUPATION", 37);
    public static final ConfirmInfoAction EDIT_SOURCE_OF_FUNDS = new ConfirmInfoAction("EDIT_SOURCE_OF_FUNDS", 38);
    public static final ConfirmInfoAction EDIT_PURPOSE_OF_THE_ACCOUNT = new ConfirmInfoAction("EDIT_PURPOSE_OF_THE_ACCOUNT", 39);

    @Override
    public final int describeContents() {
        return 0;
    }

    private ConfirmInfoAction(String str, int i) {
    }

    static {
        ConfirmInfoAction[] confirmInfoActionArr$values = $values();
        $VALUES = confirmInfoActionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(confirmInfoActionArr$values);
        CREATOR = new Parcelable.Creator<ConfirmInfoAction>() {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ConfirmInfoAction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ConfirmInfoAction.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ConfirmInfoAction[] newArray(int i) {
                return new ConfirmInfoAction[i];
            }
        };
    }

    public static ConfirmInfoAction valueOf(String str) {
        return (ConfirmInfoAction) Enum.valueOf(ConfirmInfoAction.class, str);
    }

    public static ConfirmInfoAction[] values() {
        return (ConfirmInfoAction[]) $VALUES.clone();
    }

    private static final ConfirmInfoAction[] $values() {
        return new ConfirmInfoAction[]{NONE, EDIT_AMOUNT, EDIT_NUMBER, EDIT_TEXT, CHOOSE_RECIPIENT, EDIT_RECIPIENT, EDIT_FIRST_NAME, EDIT_MIDDLE_NAME, EDIT_LAST_NAME, EDIT_OPERATOR_ID, EDIT_CONTACT_NUMBER, EDIT_DATE_BIRTH, EDIT_YEAR_BIRTH, EDIT_ID_NUMBER, EDIT_NATIONALITY, EDIT_GENDER, CHOOSE_GIF, REMOVE_GIF, EDIT_BANK_INFO, EDIT_STORE_NUMBER, EDIT_DESCRIPTION, CHOOSE_FAST_WITHDRAWAL, EDIT_IMSI, EDIT_ICCID, EDIT_CUSTOMER_ID, CHOOSE_ACCOUNT, EDIT_SENDER, EDIT_RECEIVER, EDIT_ROLE, EDIT_LANGUAGE, EDIT_LICENSE_PLATE, EDIT_FUEL_TYPE, EDIT_FUEL_CAPACITY, EDIT_VEHICLE_KILOMETERS, EDIT_PACKAGE, EDIT_BUNDLE, EDIT_PAYMENT_METHOD, EDIT_OCCUPATION, EDIT_SOURCE_OF_FUNDS, EDIT_PURPOSE_OF_THE_ACCOUNT};
    }

    public static EnumEntries<ConfirmInfoAction> getEntries() {
        return $ENTRIES;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
    }
}
