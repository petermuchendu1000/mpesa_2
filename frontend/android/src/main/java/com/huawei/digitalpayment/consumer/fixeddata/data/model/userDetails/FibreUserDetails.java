package com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÇ\u0001J\b\u0010%\u001a\u00020&H\u0007J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H×\u0003J\t\u0010+\u001a\u00020&H×\u0001J\t\u0010,\u001a\u00020\u0003H×\u0001J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "middleName", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "docType", "docId", "dob", "accountList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/AccountList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getMiddleName", "getUsername", "getEmailAddress", "getDocType", "getDocId", "getDob", "getAccountList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreUserDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreUserDetails> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountList")
    private final List<AccountList> accountList;

    @SerializedName("dob")
    private final String dob;

    @SerializedName("docId")
    private final String docId;

    @SerializedName("docType")
    private final String docType;

    @SerializedName(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS)
    private final String emailAddress;

    @SerializedName("firstName")
    private final String firstName;

    @SerializedName("lastName")
    private final String lastName;

    @SerializedName("middleName")
    private final String middleName;

    @SerializedName(HintConstants.AUTOFILL_HINT_USERNAME)
    private final String username;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreUserDetails> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreUserDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(AccountList.CREATOR.createFromParcel(parcel));
                i3++;
                int i4 = ShareDataUIState + 21;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            FibreUserDetails fibreUserDetails = new FibreUserDetails(string, string2, string3, string4, string5, string6, string7, string8, arrayList);
            int i6 = ShareDataUIState + 73;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return fibreUserDetails;
        }

        @Override
        public FibreUserDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FibreUserDetails fibreUserDetailsCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 105;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return fibreUserDetailsCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreUserDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 113;
            component2 = i3 % 128;
            FibreUserDetails[] fibreUserDetailsArr = new FibreUserDetails[i];
            if (i3 % 2 == 0) {
                return fibreUserDetailsArr;
            }
            throw null;
        }

        @Override
        public FibreUserDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            FibreUserDetails[] fibreUserDetailsArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 95;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return fibreUserDetailsArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public FibreUserDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<AccountList> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.firstName = str;
        this.lastName = str2;
        this.middleName = str3;
        this.username = str4;
        this.emailAddress = str5;
        this.docType = str6;
        this.docId = str7;
        this.dob = str8;
        this.accountList = list;
    }

    public final String getFirstName() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.firstName;
            int i4 = 9 / 0;
        } else {
            str = this.firstName;
        }
        int i5 = i3 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLastName() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.lastName;
        int i4 = i3 + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMiddleName() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.middleName;
            int i4 = 85 / 0;
        } else {
            str = this.middleName;
        }
        int i5 = i3 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUsername() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.username;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmailAddress() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.emailAddress;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDocType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docType;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDocId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docId;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDob() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dob;
        int i4 = i2 + 59;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<AccountList> getAccountList() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 109;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreUserDetails copy$default(FibreUserDetails fibreUserDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
        String str9;
        String str10;
        List list2;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 59;
        component1 = i4 % 128;
        String str11 = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : fibreUserDetails.firstName;
        String str12 = (i & 2) != 0 ? fibreUserDetails.lastName : str2;
        String str13 = (i & 4) != 0 ? fibreUserDetails.middleName : str3;
        String str14 = (i & 8) != 0 ? fibreUserDetails.username : str4;
        String str15 = (i & 16) != 0 ? fibreUserDetails.emailAddress : str5;
        if ((i & 32) != 0) {
            int i5 = i3 + 31;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str9 = fibreUserDetails.docType;
        } else {
            str9 = str6;
        }
        String str16 = (i & 64) != 0 ? fibreUserDetails.docId : str7;
        if ((i & 128) != 0) {
            int i7 = i3 + 43;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                str10 = fibreUserDetails.dob;
                int i8 = 73 / 0;
            } else {
                str10 = fibreUserDetails.dob;
            }
        } else {
            str10 = str8;
        }
        if ((i & 256) != 0) {
            list2 = fibreUserDetails.accountList;
            int i9 = component1 + 89;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 3;
            }
        } else {
            list2 = list;
        }
        return fibreUserDetails.copy(str11, str12, str13, str14, str15, str9, str16, str10, list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.firstName;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.lastName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.middleName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.username;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.emailAddress;
            int i4 = 88 / 0;
        } else {
            str = this.emailAddress;
        }
        int i5 = i2 + 15;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.docType;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.docId;
        int i5 = i3 + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.dob;
            int i4 = 43 / 0;
        } else {
            str = this.dob;
        }
        int i5 = i2 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final List<AccountList> component9() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FibreUserDetails copy(String firstName, String lastName, String middleName, String username, String emailAddress, String docType, String docId, String dob, List<AccountList> accountList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(firstName, "");
        Intrinsics.checkNotNullParameter(lastName, "");
        Intrinsics.checkNotNullParameter(middleName, "");
        Intrinsics.checkNotNullParameter(emailAddress, "");
        Intrinsics.checkNotNullParameter(docType, "");
        Intrinsics.checkNotNullParameter(docId, "");
        Intrinsics.checkNotNullParameter(accountList, "");
        FibreUserDetails fibreUserDetails = new FibreUserDetails(firstName, lastName, middleName, username, emailAddress, docType, docId, dob, accountList);
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return fibreUserDetails;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibreUserDetails)) {
            int i2 = component2 + 103;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FibreUserDetails fibreUserDetails = (FibreUserDetails) other;
        if (!Intrinsics.areEqual(this.firstName, fibreUserDetails.firstName)) {
            int i4 = component1 + 5;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.lastName, fibreUserDetails.lastName)) {
            int i5 = component2 + 5;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.middleName, fibreUserDetails.middleName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.username, fibreUserDetails.username)) {
            int i7 = component2 + 69;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.emailAddress, fibreUserDetails.emailAddress)) {
            int i9 = component1 + 7;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.docType, fibreUserDetails.docType)) {
            return Intrinsics.areEqual(this.docId, fibreUserDetails.docId) && Intrinsics.areEqual(this.dob, fibreUserDetails.dob) && Intrinsics.areEqual(this.accountList, fibreUserDetails.accountList);
        }
        int i11 = component1 + 49;
        component2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.firstName.hashCode();
        int iHashCode3 = this.lastName.hashCode();
        int iHashCode4 = this.middleName.hashCode();
        String str = this.username;
        if (str == null) {
            int i4 = component2 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode5 = this.emailAddress.hashCode();
        int iHashCode6 = this.docType.hashCode();
        int iHashCode7 = this.docId.hashCode();
        String str2 = this.dob;
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.accountList.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreUserDetails(firstName=" + this.firstName + ", lastName=" + this.lastName + ", middleName=" + this.middleName + ", username=" + this.username + ", emailAddress=" + this.emailAddress + ", docType=" + this.docType + ", docId=" + this.docId + ", dob=" + this.dob + ", accountList=" + this.accountList + ")";
        int i2 = component1 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.middleName);
        dest.writeString(this.username);
        dest.writeString(this.emailAddress);
        dest.writeString(this.docType);
        dest.writeString(this.docId);
        dest.writeString(this.dob);
        List<AccountList> list = this.accountList;
        dest.writeInt(list.size());
        Iterator<AccountList> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i4 = component2 + 53;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
