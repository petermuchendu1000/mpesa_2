package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostBody;", "Landroid/os/Parcelable;", "merchantCode", "", "merchantName", "transactionCost", "vicinityRcode", "vicinityRmsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantCode", "()Ljava/lang/String;", "getMerchantName", "getTransactionCost", "getVicinityRcode", "getVicinityRmsg", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorLipaCostBody implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostCalculatorLipaCostBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("merchantCode")
    private final String merchantCode;

    @SerializedName("merchantName")
    private final String merchantName;

    @SerializedName("transactionCost")
    private final String transactionCost;

    @SerializedName("vicinityRcode")
    private final String vicinityRcode;

    @SerializedName("vicinityRmsg")
    private final String vicinityRmsg;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CostCalculatorLipaCostBody> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorLipaCostBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CostCalculatorLipaCostBody costCalculatorLipaCostBody = new CostCalculatorLipaCostBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 65;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return costCalculatorLipaCostBody;
        }

        @Override
        public CostCalculatorLipaCostBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 83;
            ShareDataUIState = i2 % 128;
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
        public final CostCalculatorLipaCostBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 63;
            ShareDataUIState = i3 % 128;
            CostCalculatorLipaCostBody[] costCalculatorLipaCostBodyArr = new CostCalculatorLipaCostBody[i];
            if (i3 % 2 == 0) {
                return costCalculatorLipaCostBodyArr;
            }
            throw null;
        }

        @Override
        public CostCalculatorLipaCostBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 41;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            CostCalculatorLipaCostBody[] costCalculatorLipaCostBodyArrNewArray = newArray(i);
            int i5 = component1 + 89;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return costCalculatorLipaCostBodyArrNewArray;
        }
    }

    public CostCalculatorLipaCostBody(String str, String str2, String str3, String str4, String str5) {
        this.merchantCode = str;
        this.merchantName = str2;
        this.transactionCost = str3;
        this.vicinityRcode = str4;
        this.vicinityRmsg = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CostCalculatorLipaCostBody(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        String str9 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = component1 + 9;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = component1 + 13;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 4;
            } else {
                int i6 = 2 % 2;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 91;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        this(str9, str6, str7, str8, (i & 16) != 0 ? null : str5);
    }

    public final String getMerchantCode() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.merchantCode;
            int i4 = 48 / 0;
        } else {
            str = this.merchantCode;
        }
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMerchantName() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.merchantName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionCost() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.transactionCost;
        int i4 = i2 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getVicinityRcode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.vicinityRcode;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getVicinityRmsg() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.vicinityRmsg;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 101;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public CostCalculatorLipaCostBody() {
        this(null, null, null, null, null, 31, null);
    }

    public static CostCalculatorLipaCostBody copy$default(CostCalculatorLipaCostBody costCalculatorLipaCostBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = costCalculatorLipaCostBody.merchantCode;
        }
        String str6 = str;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 51;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                String str7 = costCalculatorLipaCostBody.merchantName;
                obj2.hashCode();
                throw null;
            }
            str2 = costCalculatorLipaCostBody.merchantName;
            int i5 = i3 + 33;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i7 = ShareDataUIState + 27;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                String str9 = costCalculatorLipaCostBody.transactionCost;
                throw null;
            }
            str3 = costCalculatorLipaCostBody.transactionCost;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            str4 = costCalculatorLipaCostBody.vicinityRcode;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i8 = ShareDataUIState + 71;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                String str12 = costCalculatorLipaCostBody.vicinityRmsg;
                throw null;
            }
            str5 = costCalculatorLipaCostBody.vicinityRmsg;
        }
        return costCalculatorLipaCostBody.copy(str6, str8, str10, str11, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.merchantCode;
        int i4 = i3 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.merchantName;
        int i4 = i3 + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.transactionCost;
            int i4 = 84 / 0;
        } else {
            str = this.transactionCost;
        }
        int i5 = i2 + 109;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.vicinityRcode;
        int i5 = i3 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.vicinityRmsg;
        }
        throw null;
    }

    public final CostCalculatorLipaCostBody copy(String merchantCode, String merchantName, String transactionCost, String vicinityRcode, String vicinityRmsg) {
        int i = 2 % 2;
        CostCalculatorLipaCostBody costCalculatorLipaCostBody = new CostCalculatorLipaCostBody(merchantCode, merchantName, transactionCost, vicinityRcode, vicinityRmsg);
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return costCalculatorLipaCostBody;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostCalculatorLipaCostBody)) {
            return false;
        }
        CostCalculatorLipaCostBody costCalculatorLipaCostBody = (CostCalculatorLipaCostBody) other;
        if (!Intrinsics.areEqual(this.merchantCode, costCalculatorLipaCostBody.merchantCode)) {
            int i3 = component1 + 97;
            ShareDataUIState = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.merchantName, costCalculatorLipaCostBody.merchantName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transactionCost, costCalculatorLipaCostBody.transactionCost)) {
            int i4 = ShareDataUIState + 9;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.vicinityRcode, costCalculatorLipaCostBody.vicinityRcode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.vicinityRmsg, costCalculatorLipaCostBody.vicinityRmsg)) {
            int i6 = component1 + 79;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = component1 + 69;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 40 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.merchantCode;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.merchantName;
        if (str2 == null) {
            int i4 = ShareDataUIState;
            int i5 = i4 + 101;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 25;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.transactionCost;
        if (str3 == null) {
            int i9 = component1 + 71;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.vicinityRcode;
        if (str4 == null) {
            int i11 = ShareDataUIState + 115;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.vicinityRmsg;
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorLipaCostBody(merchantCode=" + this.merchantCode + ", merchantName=" + this.merchantName + ", transactionCost=" + this.transactionCost + ", vicinityRcode=" + this.vicinityRcode + ", vicinityRmsg=" + this.vicinityRmsg + ")";
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.merchantCode);
        dest.writeString(this.merchantName);
        dest.writeString(this.transactionCost);
        dest.writeString(this.vicinityRcode);
        dest.writeString(this.vicinityRmsg);
        int i4 = component1 + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
