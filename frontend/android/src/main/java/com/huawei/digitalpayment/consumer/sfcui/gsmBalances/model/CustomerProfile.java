package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0082\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÇ\u0001¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020-H\u0007J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u000100H×\u0003J\t\u00101\u001a\u00020-H×\u0001J\t\u00102\u001a\u00020\u0003H×\u0001J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u000e\u0010\u001e¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CustomerProfile;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "accountType", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountType;", "profileType", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/ProfileType;", "languageId", "pictureUrl", "accountName", "accountStatus", "tariff", "isSupported", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountType;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/ProfileType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getAccountType", "()Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountType;", "getProfileType", "()Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/ProfileType;", "getLanguageId", "getPictureUrl", "getAccountName", "getAccountStatus", "getTariff", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountType;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/ProfileType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CustomerProfile;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomerProfile implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CustomerProfile> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("accountName")
    private final String accountName;

    @SerializedName("accountStatus")
    private final String accountStatus;

    @SerializedName("accountType")
    private final AccountType accountType;

    @SerializedName("firstName")
    private final String firstName;

    @SerializedName("isSupported")
    private final Boolean isSupported;

    @SerializedName("languageId")
    private final String languageId;

    @SerializedName("lastName")
    private final String lastName;

    @SerializedName("pictureUrl")
    private final String pictureUrl;

    @SerializedName("profileType")
    private final ProfileType profileType;

    @SerializedName("tariff")
    private final String tariff;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomerProfile> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CustomerProfile createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            AccountType accountTypeValueOf = AccountType.valueOf(parcel.readString());
            ProfileType profileTypeValueOf = ProfileType.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = copydefault + 15;
                int i3 = i2 % 128;
                component2 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 23;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CustomerProfile(string, string2, accountTypeValueOf, profileTypeValueOf, string3, string4, string5, string6, string7, boolValueOf);
        }

        @Override
        public CustomerProfile createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CustomerProfile customerProfileCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 39;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return customerProfileCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CustomerProfile[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 61;
            component2 = i3 % 128;
            CustomerProfile[] customerProfileArr = new CustomerProfile[i];
            if (i3 % 2 == 0) {
                return customerProfileArr;
            }
            throw null;
        }

        @Override
        public CustomerProfile[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 35;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CustomerProfile(String str, String str2, AccountType accountType, ProfileType profileType, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(profileType, "");
        this.firstName = str;
        this.lastName = str2;
        this.accountType = accountType;
        this.profileType = profileType;
        this.languageId = str3;
        this.pictureUrl = str4;
        this.accountName = str5;
        this.accountStatus = str6;
        this.tariff = str7;
        this.isSupported = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomerProfile(String str, String str2, AccountType accountType, ProfileType profileType, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AccountType accountType2;
        String str8;
        String str9;
        String str10;
        Boolean bool2;
        String str11 = (i & 1) != 0 ? null : str;
        String str12 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = copydefault + 15;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                accountType2 = AccountType.UNDEFINED;
                int i3 = 39 / 0;
            } else {
                accountType2 = AccountType.UNDEFINED;
            }
        } else {
            accountType2 = accountType;
        }
        ProfileType profileType2 = (i & 8) != 0 ? ProfileType.UNDEFINED : profileType;
        if ((i & 16) != 0) {
            int i4 = component2 + 113;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 32) != 0) {
            int i6 = component2 + 63;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str4;
        }
        String str13 = (i & 64) != 0 ? null : str5;
        if ((i & 128) != 0) {
            int i8 = 2 % 2;
            str10 = null;
        } else {
            str10 = str6;
        }
        String str14 = (i & 256) == 0 ? str7 : null;
        if ((i & 512) != 0) {
            int i9 = copydefault + 17;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            bool2 = false;
            int i11 = 2 % 2;
        } else {
            bool2 = bool;
        }
        this(str11, str12, accountType2, profileType2, str8, str9, str13, str10, str14, bool2);
    }

    public final String getFirstName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.firstName;
        int i5 = i2 + 75;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getLastName() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.lastName;
            int i4 = 15 / 0;
        } else {
            str = this.lastName;
        }
        int i5 = i2 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AccountType getAccountType() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AccountType accountType = this.accountType;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return accountType;
    }

    public final ProfileType getProfileType() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.profileType;
        }
        throw null;
    }

    public final String getLanguageId() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.languageId;
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPictureUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.pictureUrl;
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAccountName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountName;
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountStatus;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String getTariff() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.tariff;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Boolean isSupported() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isSupported;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    static {
        int i = component3 + 99;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public CustomerProfile() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static CustomerProfile copy$default(CustomerProfile customerProfile, String str, String str2, AccountType accountType, ProfileType profileType, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        String str8;
        ProfileType profileType2;
        String str9;
        String str10;
        Boolean bool2;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? customerProfile.firstName : str;
        if ((i & 2) != 0) {
            int i3 = component2 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str8 = customerProfile.lastName;
        } else {
            str8 = str2;
        }
        AccountType accountType2 = (i & 4) != 0 ? customerProfile.accountType : accountType;
        if ((i & 8) != 0) {
            int i5 = component2 + 95;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                profileType2 = customerProfile.profileType;
                int i6 = 4 / 0;
            } else {
                profileType2 = customerProfile.profileType;
            }
        } else {
            profileType2 = profileType;
        }
        String str12 = (i & 16) != 0 ? customerProfile.languageId : str3;
        if ((i & 32) != 0) {
            str9 = customerProfile.pictureUrl;
            int i7 = copydefault + 35;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str9 = str4;
        }
        if ((i & 64) != 0) {
            str10 = customerProfile.accountName;
            int i9 = component2 + 19;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str10 = str5;
        }
        String str13 = (i & 128) != 0 ? customerProfile.accountStatus : str6;
        String str14 = (i & 256) != 0 ? customerProfile.tariff : str7;
        if ((i & 512) != 0) {
            int i11 = component2 + 103;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            bool2 = customerProfile.isSupported;
        } else {
            bool2 = bool;
        }
        return customerProfile.copy(str11, str8, accountType2, profileType2, str12, str9, str10, str13, str14, bool2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.firstName;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean component10() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSupported;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.lastName;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final AccountType component3() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        AccountType accountType = this.accountType;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return accountType;
    }

    public final ProfileType component4() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.profileType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.languageId;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.pictureUrl;
        int i5 = i3 + 75;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.accountName;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.accountStatus;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.tariff;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return str;
    }

    public final CustomerProfile copy(String firstName, String lastName, AccountType accountType, ProfileType profileType, String languageId, String pictureUrl, String accountName, String accountStatus, String tariff, Boolean isSupported) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(profileType, "");
        CustomerProfile customerProfile = new CustomerProfile(firstName, lastName, accountType, profileType, languageId, pictureUrl, accountName, accountStatus, tariff, isSupported);
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return customerProfile;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof CustomerProfile)) {
            return false;
        }
        CustomerProfile customerProfile = (CustomerProfile) other;
        if (!Intrinsics.areEqual(this.firstName, customerProfile.firstName)) {
            int i4 = copydefault + 71;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.lastName, customerProfile.lastName) || this.accountType != customerProfile.accountType) {
            return false;
        }
        if (this.profileType != customerProfile.profileType) {
            int i6 = component2 + 91;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 8 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.languageId, customerProfile.languageId) || !Intrinsics.areEqual(this.pictureUrl, customerProfile.pictureUrl) || !Intrinsics.areEqual(this.accountName, customerProfile.accountName) || !Intrinsics.areEqual(this.accountStatus, customerProfile.accountStatus)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tariff, customerProfile.tariff)) {
            return Intrinsics.areEqual(this.isSupported, customerProfile.isSupported);
        }
        int i8 = component2 + 39;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v25 java.lang.String) = (r1v4 java.lang.String), (r1v27 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.component2
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r1 = r13.firstName
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r13.firstName
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r13.lastName
            if (r4 != 0) goto L26
            r4 = r2
            goto L2a
        L26:
            int r4 = r4.hashCode()
        L2a:
            com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.AccountType r5 = r13.accountType
            int r5 = r5.hashCode()
            com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.ProfileType r6 = r13.profileType
            int r6 = r6.hashCode()
            java.lang.String r7 = r13.languageId
            if (r7 != 0) goto L45
            int r7 = com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.component2
            int r7 = r7 + 25
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.copydefault = r8
            int r7 = r7 % r0
            r7 = r2
            goto L49
        L45:
            int r7 = r7.hashCode()
        L49:
            java.lang.String r8 = r13.pictureUrl
            if (r8 != 0) goto L4f
            r8 = r2
            goto L53
        L4f:
            int r8 = r8.hashCode()
        L53:
            java.lang.String r9 = r13.accountName
            if (r9 != 0) goto L59
            r9 = r2
            goto L5d
        L59:
            int r9 = r9.hashCode()
        L5d:
            java.lang.String r10 = r13.accountStatus
            if (r10 != 0) goto L63
            r10 = r2
            goto L67
        L63:
            int r10 = r10.hashCode()
        L67:
            java.lang.String r11 = r13.tariff
            if (r11 != 0) goto L6c
            goto L70
        L6c:
            int r2 = r11.hashCode()
        L70:
            java.lang.Boolean r11 = r13.isSupported
            if (r11 != 0) goto L7e
            int r11 = com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.component2
            int r11 = r11 + 83
            int r12 = r11 % 128
            com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.copydefault = r12
            int r11 = r11 % r0
            goto L82
        L7e:
            int r3 = r11.hashCode()
        L82:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r7
            int r1 = r1 * 31
            int r1 = r1 + r8
            int r1 = r1 * 31
            int r1 = r1 + r9
            int r1 = r1 * 31
            int r1 = r1 + r10
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomerProfile(firstName=" + this.firstName + ", lastName=" + this.lastName + ", accountType=" + this.accountType + ", profileType=" + this.profileType + ", languageId=" + this.languageId + ", pictureUrl=" + this.pictureUrl + ", accountName=" + this.accountName + ", accountStatus=" + this.accountStatus + ", tariff=" + this.tariff + ", isSupported=" + this.isSupported + ")";
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        ?? BooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.accountType.name());
        dest.writeString(this.profileType.name());
        dest.writeString(this.languageId);
        dest.writeString(this.pictureUrl);
        dest.writeString(this.accountName);
        dest.writeString(this.accountStatus);
        dest.writeString(this.tariff);
        Boolean bool = this.isSupported;
        if (bool == null) {
            int i2 = copydefault + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        int i4 = component2 + 63;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
