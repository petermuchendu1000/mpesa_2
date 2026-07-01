package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J©\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÇ\u0001J\b\u00109\u001a\u00020\u0005H\u0007J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H×\u0003J\t\u0010>\u001a\u00020\u0005H×\u0001J\t\u0010?\u001a\u00020\u0003H×\u0001J\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u0006E"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/CustomerInfoBody;", "Landroid/os/Parcelable;", "birthday", "", "blazeTariff", "", "blazer", "blazerId", "firstName", HintConstants.AUTOFILL_HINT_GENDER, CheckIdentityActivity.ID_NUMBER, CheckIdentityActivity.ID_TYPE, "lastName", "middleName", "nationality", "title", "customerStatus", "customerType", "registrationDate", "tariff", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBirthday", "()Ljava/lang/String;", "getBlazeTariff", "()I", "getBlazer", "getBlazerId", "getFirstName", "getGender", "getIdNumber", "getIdType", "getLastName", "getMiddleName", "getNationality", "getTitle", "getCustomerStatus", "getCustomerType", "getRegistrationDate", "getTariff", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomerInfoBody implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CustomerInfoBody> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("Birthday")
    private final String birthday;

    @SerializedName("BlazeTariff")
    private final int blazeTariff;

    @SerializedName("Blazer")
    private final int blazer;

    @SerializedName("BlazerId")
    private final int blazerId;

    @SerializedName("customerStatus")
    private final String customerStatus;

    @SerializedName("customerType")
    private final String customerType;

    @SerializedName("FirstName")
    private final String firstName;

    @SerializedName("Gender")
    private final String gender;

    @SerializedName("IDNumber")
    private final String idNumber;

    @SerializedName("IDType")
    private final String idType;

    @SerializedName("LastName")
    private final String lastName;

    @SerializedName("MiddleName")
    private final String middleName;

    @SerializedName("Nationality")
    private final String nationality;

    @SerializedName("registrationDate")
    private final String registrationDate;

    @SerializedName("tariff")
    private final int tariff;

    @SerializedName("Title")
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomerInfoBody> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CustomerInfoBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CustomerInfoBody customerInfoBody = new CustomerInfoBody(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            int i2 = component2 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return customerInfoBody;
        }

        @Override
        public CustomerInfoBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 17;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            CustomerInfoBody customerInfoBodyCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 43;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return customerInfoBodyCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CustomerInfoBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 39;
            component2 = i3 % 128;
            CustomerInfoBody[] customerInfoBodyArr = new CustomerInfoBody[i];
            if (i3 % 2 != 0) {
                return customerInfoBodyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public CustomerInfoBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 101;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            CustomerInfoBody[] customerInfoBodyArrNewArray = newArray(i);
            int i5 = component2 + 109;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return customerInfoBodyArrNewArray;
        }
    }

    public CustomerInfoBody(String str, int i, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.birthday = str;
        this.blazeTariff = i;
        this.blazer = i2;
        this.blazerId = i3;
        this.firstName = str2;
        this.gender = str3;
        this.idNumber = str4;
        this.idType = str5;
        this.lastName = str6;
        this.middleName = str7;
        this.nationality = str8;
        this.title = str9;
        this.customerStatus = str10;
        this.customerType = str11;
        this.registrationDate = str12;
        this.tariff = i4;
    }

    public final String getBirthday() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.birthday;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getBlazeTariff() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.blazeTariff;
        if (i3 != 0) {
            int i5 = 77 / 0;
        }
        return i4;
    }

    public final int getBlazer() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.blazer;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getBlazerId() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.blazerId;
        if (i3 != 0) {
            int i5 = 33 / 0;
        }
        return i4;
    }

    public final String getFirstName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.firstName;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGender() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.idNumber;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIdType() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.idType;
            int i4 = 82 / 0;
        } else {
            str = this.idType;
        }
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLastName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lastName;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMiddleName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.middleName;
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final String getNationality() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nationality;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerStatus() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customerStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCustomerType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.customerType;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRegistrationDate() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.registrationDate;
        int i4 = i2 + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getTariff() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.tariff;
        int i6 = i2 + 59;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    static {
        int i = copydefault + 121;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    public static CustomerInfoBody copy$default(CustomerInfoBody customerInfoBody, String str, int i, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i4, int i5, Object obj) {
        String str13;
        int i6;
        String str14;
        String str15;
        String str16;
        String str17;
        int i7;
        int i8 = 2 % 2;
        if ((i5 & 1) != 0) {
            int i9 = component2 + 31;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                String str18 = customerInfoBody.birthday;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str13 = customerInfoBody.birthday;
        } else {
            str13 = str;
        }
        if ((i5 & 2) != 0) {
            int i10 = component2 + 5;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            i6 = customerInfoBody.blazeTariff;
        } else {
            i6 = i;
        }
        int i12 = (i5 & 4) != 0 ? customerInfoBody.blazer : i2;
        int i13 = (i5 & 8) != 0 ? customerInfoBody.blazerId : i3;
        String str19 = (i5 & 16) != 0 ? customerInfoBody.firstName : str2;
        String str20 = (i5 & 32) != 0 ? customerInfoBody.gender : str3;
        String str21 = (i5 & 64) != 0 ? customerInfoBody.idNumber : str4;
        if ((i5 & 128) != 0) {
            int i14 = ShareDataUIState + 37;
            int i15 = i14 % 128;
            component2 = i15;
            int i16 = i14 % 2;
            str14 = customerInfoBody.idType;
            int i17 = i15 + 15;
            ShareDataUIState = i17 % 128;
            int i18 = i17 % 2;
        } else {
            str14 = str5;
        }
        String str22 = (i5 & 256) != 0 ? customerInfoBody.lastName : str6;
        String str23 = (i5 & 512) != 0 ? customerInfoBody.middleName : str7;
        String str24 = (i5 & 1024) != 0 ? customerInfoBody.nationality : str8;
        String str25 = (i5 & 2048) != 0 ? customerInfoBody.title : str9;
        String str26 = (i5 & 4096) != 0 ? customerInfoBody.customerStatus : str10;
        if ((i5 & 8192) != 0) {
            int i19 = ShareDataUIState + 53;
            str15 = str26;
            component2 = i19 % 128;
            int i20 = i19 % 2;
            str16 = customerInfoBody.customerType;
        } else {
            str15 = str26;
            str16 = str11;
        }
        String str27 = (i5 & 16384) != 0 ? customerInfoBody.registrationDate : str12;
        if ((i5 & 32768) != 0) {
            int i21 = ShareDataUIState + 41;
            str17 = str27;
            component2 = i21 % 128;
            int i22 = i21 % 2;
            i7 = customerInfoBody.tariff;
        } else {
            str17 = str27;
            i7 = i4;
        }
        return customerInfoBody.copy(str13, i6, i12, i13, str19, str20, str21, str14, str22, str23, str24, str25, str15, str16, str17, i7);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.birthday;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.middleName;
        int i4 = i3 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nationality;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.customerStatus;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerType;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.registrationDate;
        int i4 = i3 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component16() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.tariff;
        int i6 = i3 + 101;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.blazeTariff;
        int i6 = i3 + 109;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.blazer;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.blazerId;
        int i6 = i2 + 49;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return i5;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.firstName;
            int i4 = 87 / 0;
        } else {
            str = this.firstName;
        }
        int i5 = i2 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.gender;
        int i5 = i3 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idNumber;
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.idType;
        int i4 = i3 + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.lastName;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return str;
    }

    public final CustomerInfoBody copy(String birthday, int blazeTariff, int blazer, int blazerId, String firstName, String gender, String idNumber, String idType, String lastName, String middleName, String nationality, String title, String customerStatus, String customerType, String registrationDate, int tariff) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(birthday, "");
        Intrinsics.checkNotNullParameter(firstName, "");
        Intrinsics.checkNotNullParameter(gender, "");
        Intrinsics.checkNotNullParameter(idNumber, "");
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(lastName, "");
        Intrinsics.checkNotNullParameter(middleName, "");
        Intrinsics.checkNotNullParameter(nationality, "");
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(customerStatus, "");
        Intrinsics.checkNotNullParameter(customerType, "");
        Intrinsics.checkNotNullParameter(registrationDate, "");
        CustomerInfoBody customerInfoBody = new CustomerInfoBody(birthday, blazeTariff, blazer, blazerId, firstName, gender, idNumber, idType, lastName, middleName, nationality, title, customerStatus, customerType, registrationDate, tariff);
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return customerInfoBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 51;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof CustomerInfoBody)) {
            return false;
        }
        CustomerInfoBody customerInfoBody = (CustomerInfoBody) other;
        if (!Intrinsics.areEqual(this.birthday, customerInfoBody.birthday) || this.blazeTariff != customerInfoBody.blazeTariff || this.blazer != customerInfoBody.blazer || this.blazerId != customerInfoBody.blazerId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.firstName, customerInfoBody.firstName)) {
            int i3 = component2 + 71;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.gender, customerInfoBody.gender)) {
            int i5 = ShareDataUIState + 17;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.idNumber, customerInfoBody.idNumber)) {
            int i7 = ShareDataUIState + 15;
            component2 = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.idType, customerInfoBody.idType) || !Intrinsics.areEqual(this.lastName, customerInfoBody.lastName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.middleName, customerInfoBody.middleName)) {
            int i8 = ShareDataUIState + 79;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.nationality, customerInfoBody.nationality)) {
            int i10 = component2 + 1;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, customerInfoBody.title) || !Intrinsics.areEqual(this.customerStatus, customerInfoBody.customerStatus) || !Intrinsics.areEqual(this.customerType, customerInfoBody.customerType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.registrationDate, customerInfoBody.registrationDate)) {
            int i12 = component2 + 11;
            ShareDataUIState = i12 % 128;
            return i12 % 2 != 0;
        }
        if (this.tariff == customerInfoBody.tariff) {
            return true;
        }
        int i13 = ShareDataUIState + 123;
        component2 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((this.birthday.hashCode() * 31) + Integer.hashCode(this.blazeTariff)) * 31) + Integer.hashCode(this.blazer)) * 31) + Integer.hashCode(this.blazerId)) * 31) + this.firstName.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.idType.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.middleName.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.title.hashCode()) * 31) + this.customerStatus.hashCode()) * 31) + this.customerType.hashCode()) * 31) + this.registrationDate.hashCode()) * 31) + Integer.hashCode(this.tariff);
        int i4 = component2 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomerInfoBody(birthday=" + this.birthday + ", blazeTariff=" + this.blazeTariff + ", blazer=" + this.blazer + ", blazerId=" + this.blazerId + ", firstName=" + this.firstName + ", gender=" + this.gender + ", idNumber=" + this.idNumber + ", idType=" + this.idType + ", lastName=" + this.lastName + ", middleName=" + this.middleName + ", nationality=" + this.nationality + ", title=" + this.title + ", customerStatus=" + this.customerStatus + ", customerType=" + this.customerType + ", registrationDate=" + this.registrationDate + ", tariff=" + this.tariff + ")";
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.birthday);
        dest.writeInt(this.blazeTariff);
        dest.writeInt(this.blazer);
        dest.writeInt(this.blazerId);
        dest.writeString(this.firstName);
        dest.writeString(this.gender);
        dest.writeString(this.idNumber);
        dest.writeString(this.idType);
        dest.writeString(this.lastName);
        dest.writeString(this.middleName);
        dest.writeString(this.nationality);
        dest.writeString(this.title);
        dest.writeString(this.customerStatus);
        dest.writeString(this.customerType);
        dest.writeString(this.registrationDate);
        dest.writeInt(this.tariff);
        int i4 = ShareDataUIState + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
