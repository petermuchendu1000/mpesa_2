package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003Je\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÇ\u0001J\b\u0010 \u001a\u00020!H\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020!H×\u0001J\t\u0010'\u001a\u00020\u0004H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/UserScopeResp;", "Lcom/huawei/http/BaseResp;", "Landroid/os/Parcelable;", "dateOfBirth", "", "firstName", "idDetails", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/IdDetail;", "lastName", AppLogInterceptor.MESSAGE_ID, "middleName", "walletIdentityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "getFirstName", "getIdDetails", "()Ljava/util/List;", "getLastName", "getMessageId", "getMiddleName", "getWalletIdentityId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserScopeResp extends BaseResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserScopeResp> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("dateOfBirth")
    private final String dateOfBirth;

    @SerializedName("firstName")
    private final String firstName;

    @SerializedName("idDetails")
    private final List<IdDetail> idDetails;

    @SerializedName("lastName")
    private final String lastName;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @SerializedName("middleName")
    private final String middleName;

    @SerializedName("walletIdentityId")
    private final String walletIdentityId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserScopeResp> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserScopeResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ArrayList arrayList = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : IdDetail.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            UserScopeResp userScopeResp = new UserScopeResp(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i6 = ShareDataUIState + 55;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 17 / 0;
            }
            return userScopeResp;
        }

        @Override
        public UserScopeResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 97;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            UserScopeResp userScopeRespCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            return userScopeRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserScopeResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            UserScopeResp[] userScopeRespArr = new UserScopeResp[i];
            int i6 = i3 + 61;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 9 / 0;
            }
            return userScopeRespArr;
        }

        @Override
        public UserScopeResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 27;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            UserScopeResp[] userScopeRespArrNewArray = newArray(i);
            int i5 = copydefault + 17;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return userScopeRespArrNewArray;
        }
    }

    public final String getDateOfBirth() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dateOfBirth;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final String getFirstName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.firstName;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<IdDetail> getIdDetails() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<IdDetail> list = this.idDetails;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return list;
    }

    public final String getLastName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.lastName;
        int i4 = i3 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMiddleName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.middleName;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getWalletIdentityId() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.walletIdentityId;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public UserScopeResp(String str, String str2, List<IdDetail> list, String str3, String str4, String str5, String str6) {
        this.dateOfBirth = str;
        this.firstName = str2;
        this.idDetails = list;
        this.lastName = str3;
        this.messageId = str4;
        this.middleName = str5;
        this.walletIdentityId = str6;
    }

    static {
        int i = copydefault + 45;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserScopeResp copy$default(UserScopeResp userScopeResp, String str, String str2, List list, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 113;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str7 = userScopeResp.dateOfBirth;
        } else {
            str7 = str;
        }
        String str9 = (i & 2) != 0 ? userScopeResp.firstName : str2;
        List list2 = (i & 4) != 0 ? userScopeResp.idDetails : list;
        String str10 = (i & 8) != 0 ? userScopeResp.lastName : str3;
        if ((i & 16) != 0) {
            int i5 = component2 + 37;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str8 = userScopeResp.messageId;
        } else {
            str8 = str4;
        }
        return userScopeResp.copy(str7, str9, list2, str10, str8, (i & 32) != 0 ? userScopeResp.middleName : str5, (i & 64) != 0 ? userScopeResp.walletIdentityId : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dateOfBirth;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.firstName;
        int i4 = i2 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<IdDetail> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<IdDetail> list = this.idDetails;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lastName;
        int i5 = i2 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.middleName;
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.walletIdentityId;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final UserScopeResp copy(String dateOfBirth, String firstName, List<IdDetail> idDetails, String lastName, String messageId, String middleName, String walletIdentityId) {
        int i = 2 % 2;
        UserScopeResp userScopeResp = new UserScopeResp(dateOfBirth, firstName, idDetails, lastName, messageId, middleName, walletIdentityId);
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return userScopeResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
            }
            return true;
        }
        if (!(other instanceof UserScopeResp)) {
            int i4 = ShareDataUIState + 39;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UserScopeResp userScopeResp = (UserScopeResp) other;
        if (!Intrinsics.areEqual(this.dateOfBirth, userScopeResp.dateOfBirth)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.firstName, userScopeResp.firstName)) {
            int i6 = ShareDataUIState + 17;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 53 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.idDetails, userScopeResp.idDetails) || !Intrinsics.areEqual(this.lastName, userScopeResp.lastName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.messageId, userScopeResp.messageId)) {
            int i8 = ShareDataUIState + 111;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.middleName, userScopeResp.middleName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.walletIdentityId, userScopeResp.walletIdentityId)) {
            return true;
        }
        int i9 = component2 + 85;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 13 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.dateOfBirth;
        if (str == null) {
            int i2 = component2 + 83;
            ShareDataUIState = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.firstName;
        if (str2 == null) {
            int i3 = component2 + 75;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        List<IdDetail> list = this.idDetails;
        if (list == null) {
            int i5 = ShareDataUIState + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = list.hashCode();
            int i7 = ShareDataUIState + 77;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str3 = this.lastName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.messageId;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.middleName;
        if (str5 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
            int i9 = ShareDataUIState + 93;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        }
        String str6 = this.walletIdentityId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode4) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserScopeResp(dateOfBirth=" + this.dateOfBirth + ", firstName=" + this.firstName + ", idDetails=" + this.idDetails + ", lastName=" + this.lastName + ", messageId=" + this.messageId + ", middleName=" + this.middleName + ", walletIdentityId=" + this.walletIdentityId + ")";
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.dateOfBirth);
        dest.writeString(this.firstName);
        List<IdDetail> list = this.idDetails;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (IdDetail idDetail : list) {
                int i4 = component2 + 31;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                if (idDetail == null) {
                    int i6 = ShareDataUIState + 121;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    idDetail.writeToParcel(dest, flags);
                }
            }
        }
        dest.writeString(this.lastName);
        dest.writeString(this.messageId);
        dest.writeString(this.middleName);
        dest.writeString(this.walletIdentityId);
    }
}
