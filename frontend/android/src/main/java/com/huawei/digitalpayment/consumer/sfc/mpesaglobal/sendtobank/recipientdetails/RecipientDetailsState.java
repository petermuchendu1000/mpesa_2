package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.recipientdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\b\u0010$\u001a\u00020%H\u0007J\u0013\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(H×\u0003J\t\u0010)\u001a\u00020%H×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/recipientdetails/RecipientDetailsState;", "Landroid/os/Parcelable;", "selectedCountry", "", "selectedCountryIso", "selectedStateIso", "selectedCountryFlag", "firstName", "middleName", "lastName", ImtConstants.KEY_ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSelectedCountry", "()Ljava/lang/String;", "getSelectedCountryIso", "getSelectedStateIso", "getSelectedCountryFlag", "getFirstName", "getMiddleName", "getLastName", "getAddress", "isButtonEnabled", "", "()Z", "fullName", "getFullName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecipientDetailsState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RecipientDetailsState> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private final String address;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String selectedCountry;
    private final String selectedCountryFlag;
    private final String selectedCountryIso;
    private final String selectedStateIso;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecipientDetailsState> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RecipientDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RecipientDetailsState recipientDetailsState = new RecipientDetailsState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return recipientDetailsState;
        }

        @Override
        public RecipientDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            RecipientDetailsState recipientDetailsStateCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 57;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return recipientDetailsStateCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RecipientDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            RecipientDetailsState[] recipientDetailsStateArr = new RecipientDetailsState[i];
            int i6 = i4 + 85;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return recipientDetailsStateArr;
            }
            throw null;
        }

        @Override
        public RecipientDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 65;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            RecipientDetailsState[] recipientDetailsStateArrNewArray = newArray(i);
            int i5 = component2 + 91;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return recipientDetailsStateArrNewArray;
        }
    }

    public RecipientDetailsState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.selectedCountry = str;
        this.selectedCountryIso = str2;
        this.selectedStateIso = str3;
        this.selectedCountryFlag = str4;
        this.firstName = str5;
        this.middleName = str6;
        this.lastName = str7;
        this.address = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecipientDetailsState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        String str11;
        String str12 = "";
        if ((i & 1) != 0) {
            int i2 = copydefault + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            str9 = "";
        } else {
            str9 = str;
        }
        String str13 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
            str10 = null;
        } else {
            str10 = str3;
        }
        String str14 = (i & 8) != 0 ? "" : str4;
        String str15 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i5 = ShareDataUIState + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str11 = "";
        } else {
            str11 = str6;
        }
        String str16 = (i & 64) != 0 ? "" : str7;
        if ((i & 128) != 0) {
            int i8 = copydefault + 95;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str12 = str8;
        }
        this(str9, str13, str10, str14, str15, str11, str16, str12);
    }

    public final String getSelectedCountry() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountry;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSelectedCountryIso() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.selectedCountryIso;
        int i4 = i2 + 5;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSelectedStateIso() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.selectedStateIso;
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String getSelectedCountryFlag() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedCountryFlag;
        }
        throw null;
    }

    public final String getFirstName() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.firstName;
            int i4 = 89 / 0;
        } else {
            str = this.firstName;
        }
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMiddleName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.middleName;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLastName() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.lastName;
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAddress() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.address;
            int i4 = 19 / 0;
        } else {
            str = this.address;
        }
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isButtonEnabled() {
        int i = 2 % 2;
        if (this.firstName.length() > 0) {
            int i2 = ShareDataUIState + 39;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                this.lastName.length();
                throw null;
            }
            if (this.lastName.length() > 0 && this.address.length() > 0) {
                int i3 = ShareDataUIState + 13;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 35;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    public final String getFullName() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this.middleName.length() <= 0) {
            str = "";
        } else {
            str = " " + this.middleName;
            int i4 = copydefault + 91;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.firstName + str + ' ' + this.lastName;
    }

    static {
        int i = component1 + 97;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public RecipientDetailsState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static RecipientDetailsState copy$default(RecipientDetailsState recipientDetailsState, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        String str11 = (i & 1) != 0 ? recipientDetailsState.selectedCountry : str;
        if ((i & 2) != 0) {
            int i6 = i3 + 109;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                str9 = recipientDetailsState.selectedCountryIso;
                int i7 = 35 / 0;
            } else {
                str9 = recipientDetailsState.selectedCountryIso;
            }
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i8 = i3 + 113;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            str10 = recipientDetailsState.selectedStateIso;
        } else {
            str10 = str3;
        }
        return recipientDetailsState.copy(str11, str9, str10, (i & 8) != 0 ? recipientDetailsState.selectedCountryFlag : str4, (i & 16) != 0 ? recipientDetailsState.firstName : str5, (i & 32) != 0 ? recipientDetailsState.middleName : str6, (i & 64) != 0 ? recipientDetailsState.lastName : str7, (i & 128) != 0 ? recipientDetailsState.address : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedCountry;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryIso;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectedStateIso;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.selectedCountryFlag;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.firstName;
        int i5 = i3 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.middleName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.lastName;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RecipientDetailsState copy(String selectedCountry, String selectedCountryIso, String selectedStateIso, String selectedCountryFlag, String firstName, String middleName, String lastName, String address) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedCountry, "");
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryFlag, "");
        Intrinsics.checkNotNullParameter(firstName, "");
        Intrinsics.checkNotNullParameter(middleName, "");
        Intrinsics.checkNotNullParameter(lastName, "");
        Intrinsics.checkNotNullParameter(address, "");
        RecipientDetailsState recipientDetailsState = new RecipientDetailsState(selectedCountry, selectedCountryIso, selectedStateIso, selectedCountryFlag, firstName, middleName, lastName, address);
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return recipientDetailsState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        copydefault = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 79;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (other instanceof RecipientDetailsState) {
            RecipientDetailsState recipientDetailsState = (RecipientDetailsState) other;
            if (!Intrinsics.areEqual(this.selectedCountry, recipientDetailsState.selectedCountry)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.selectedCountryIso, recipientDetailsState.selectedCountryIso)) {
                int i7 = copydefault + 103;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.selectedStateIso, recipientDetailsState.selectedStateIso)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.selectedCountryFlag, recipientDetailsState.selectedCountryFlag))) {
                if (!Intrinsics.areEqual(this.firstName, recipientDetailsState.firstName)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.middleName, recipientDetailsState.middleName)) {
                    return Intrinsics.areEqual(this.lastName, recipientDetailsState.lastName) && Intrinsics.areEqual(this.address, recipientDetailsState.address);
                }
                int i9 = ShareDataUIState + 23;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = ShareDataUIState + 111;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.selectedCountry.hashCode();
        int iHashCode3 = this.selectedCountryIso.hashCode();
        String str = this.selectedStateIso;
        if (str == null) {
            int i2 = ShareDataUIState + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.selectedCountryFlag.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.middleName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.address.hashCode();
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecipientDetailsState(selectedCountry=" + this.selectedCountry + ", selectedCountryIso=" + this.selectedCountryIso + ", selectedStateIso=" + this.selectedStateIso + ", selectedCountryFlag=" + this.selectedCountryFlag + ", firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", address=" + this.address + ')';
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.selectedCountry);
        dest.writeString(this.selectedCountryIso);
        dest.writeString(this.selectedStateIso);
        dest.writeString(this.selectedCountryFlag);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.address);
        int i4 = copydefault + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
