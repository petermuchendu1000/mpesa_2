package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001dH×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;", "Landroid/os/Parcelable;", "accountId", "", "oldBalanceAmt", "newBalanceAmt", "delOfferingRentList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/DelOfferingRent;", "crentChargeCode", "bhchargeAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getOldBalanceAmt", "getNewBalanceAmt", "getDelOfferingRentList", "()Ljava/util/List;", "getCrentChargeCode", "getBhchargeAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreFeeQuotation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreFeeQuotation> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("bhchargeAmount")
    private final String bhchargeAmount;

    @SerializedName("crentChargeCode")
    private final String crentChargeCode;

    @SerializedName("delOfferingRentList")
    private final List<DelOfferingRent> delOfferingRentList;

    @SerializedName("newBalanceAmt")
    private final String newBalanceAmt;

    @SerializedName("oldBalanceAmt")
    private final String oldBalanceAmt;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreFeeQuotation> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreFeeQuotation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component2 + 5;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = component2 + 117;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 != i4; i7++) {
                    int i8 = component2 + 103;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList2.add(DelOfferingRent.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FibreFeeQuotation(string, string2, string3, arrayList, parcel.readString(), parcel.readString());
        }

        @Override
        public FibreFeeQuotation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreFeeQuotation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 17;
            component1 = i4 % 128;
            FibreFeeQuotation[] fibreFeeQuotationArr = new FibreFeeQuotation[i];
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            int i6 = i3 + 45;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 8 / 0;
            }
            return fibreFeeQuotationArr;
        }

        @Override
        public FibreFeeQuotation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FibreFeeQuotation[] fibreFeeQuotationArrNewArray = newArray(i);
            int i5 = component2 + 87;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return fibreFeeQuotationArrNewArray;
            }
            throw null;
        }
    }

    public FibreFeeQuotation(String str, String str2, String str3, List<DelOfferingRent> list, String str4, String str5) {
        this.accountId = str;
        this.oldBalanceAmt = str2;
        this.newBalanceAmt = str3;
        this.delOfferingRentList = list;
        this.crentChargeCode = str4;
        this.bhchargeAmount = str5;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final String getOldBalanceAmt() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.oldBalanceAmt;
        int i5 = i2 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNewBalanceAmt() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.newBalanceAmt;
        int i4 = i2 + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<DelOfferingRent> getDelOfferingRentList() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<DelOfferingRent> list = this.delOfferingRentList;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return list;
    }

    public final String getCrentChargeCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.crentChargeCode;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final String getBhchargeAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bhchargeAmount;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 31;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreFeeQuotation copy$default(FibreFeeQuotation fibreFeeQuotation, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        String str6;
        List list2;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 17;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        String str7 = (i & 1) != 0 ? fibreFeeQuotation.accountId : str;
        String str8 = (i & 2) != 0 ? fibreFeeQuotation.oldBalanceAmt : str2;
        if ((i & 4) != 0) {
            int i6 = i3 + 23;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                String str9 = fibreFeeQuotation.newBalanceAmt;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str6 = fibreFeeQuotation.newBalanceAmt;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i7 = copydefault + 1;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                list2 = fibreFeeQuotation.delOfferingRentList;
                int i8 = 88 / 0;
            } else {
                list2 = fibreFeeQuotation.delOfferingRentList;
            }
        } else {
            list2 = list;
        }
        FibreFeeQuotation fibreFeeQuotationCopy = fibreFeeQuotation.copy(str7, str8, str6, list2, (i & 16) != 0 ? fibreFeeQuotation.crentChargeCode : str4, (i & 32) != 0 ? fibreFeeQuotation.bhchargeAmount : str5);
        int i9 = copydefault + 87;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return fibreFeeQuotationCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.oldBalanceAmt;
            int i4 = 6 / 0;
        } else {
            str = this.oldBalanceAmt;
        }
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.newBalanceAmt;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<DelOfferingRent> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<DelOfferingRent> list = this.delOfferingRentList;
        int i4 = i3 + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return list;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.crentChargeCode;
            int i4 = 86 / 0;
        } else {
            str = this.crentChargeCode;
        }
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bhchargeAmount;
        }
        throw null;
    }

    public final FibreFeeQuotation copy(String accountId, String oldBalanceAmt, String newBalanceAmt, List<DelOfferingRent> delOfferingRentList, String crentChargeCode, String bhchargeAmount) {
        int i = 2 % 2;
        FibreFeeQuotation fibreFeeQuotation = new FibreFeeQuotation(accountId, oldBalanceAmt, newBalanceAmt, delOfferingRentList, crentChargeCode, bhchargeAmount);
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return fibreFeeQuotation;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        copydefault = i2 % 128;
        return 1 ^ (i2 % 2 != 0 ? 0 : 1);
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 67;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof FibreFeeQuotation)) {
            int i7 = i2 + 39;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        FibreFeeQuotation fibreFeeQuotation = (FibreFeeQuotation) other;
        if (!Intrinsics.areEqual(this.accountId, fibreFeeQuotation.accountId)) {
            int i9 = copydefault + 1;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.oldBalanceAmt, fibreFeeQuotation.oldBalanceAmt)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.newBalanceAmt, fibreFeeQuotation.newBalanceAmt)) {
            int i11 = copydefault + 51;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.delOfferingRentList, fibreFeeQuotation.delOfferingRentList) || !Intrinsics.areEqual(this.crentChargeCode, fibreFeeQuotation.crentChargeCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bhchargeAmount, fibreFeeQuotation.bhchargeAmount)) {
            return true;
        }
        int i13 = ShareDataUIState + 7;
        copydefault = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.accountId;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.oldBalanceAmt;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.newBalanceAmt;
        if (str3 == null) {
            int i2 = copydefault + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        List<DelOfferingRent> list = this.delOfferingRentList;
        if (list == null) {
            int i4 = ShareDataUIState + 109;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        String str4 = this.crentChargeCode;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.bhchargeAmount;
        if (str5 != null) {
            iHashCode3 = str5.hashCode();
            int i6 = copydefault + 71;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreFeeQuotation(accountId=" + this.accountId + ", oldBalanceAmt=" + this.oldBalanceAmt + ", newBalanceAmt=" + this.newBalanceAmt + ", delOfferingRentList=" + this.delOfferingRentList + ", crentChargeCode=" + this.crentChargeCode + ", bhchargeAmount=" + this.bhchargeAmount + ")";
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        dest.writeString(this.oldBalanceAmt);
        dest.writeString(this.newBalanceAmt);
        List<DelOfferingRent> list = this.delOfferingRentList;
        if (list == null) {
            int i2 = copydefault + 43;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<DelOfferingRent> it = list.iterator();
            while (it.hasNext()) {
                int i4 = copydefault + 97;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.crentChargeCode);
        dest.writeString(this.bhchargeAmount);
    }
}
