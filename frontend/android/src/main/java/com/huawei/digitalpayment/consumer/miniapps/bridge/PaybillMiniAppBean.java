package com.huawei.digitalpayment.consumer.miniapps.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\t\u0010 \u001a\u00020\u0005H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/bridge/PaybillMiniAppBean;", "Landroid/os/Parcelable;", "amount", "", "billReference", "", "businessID", "currency", ImtConstants.KEY_REASON, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBillReference", "()Ljava/lang/String;", "getBusinessID", "getCurrency", "getReason", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/miniapps/bridge/PaybillMiniAppBean;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaybillMiniAppBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PaybillMiniAppBean> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("amount")
    private final Integer amount;

    @SerializedName("billReference")
    private final String billReference;

    @SerializedName("businessID")
    private final String businessID;

    @SerializedName("currency")
    private final String currency;

    @SerializedName(ImtConstants.KEY_REASON)
    private final String reason;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaybillMiniAppBean> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PaybillMiniAppBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 35;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PaybillMiniAppBean(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public PaybillMiniAppBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            PaybillMiniAppBean paybillMiniAppBeanCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 103;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return paybillMiniAppBeanCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PaybillMiniAppBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 117;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            PaybillMiniAppBean[] paybillMiniAppBeanArr = new PaybillMiniAppBean[i];
            int i6 = i4 + 91;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return paybillMiniAppBeanArr;
        }

        @Override
        public PaybillMiniAppBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            PaybillMiniAppBean[] paybillMiniAppBeanArrNewArray = newArray(i);
            int i5 = component2 + 33;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return paybillMiniAppBeanArrNewArray;
        }
    }

    public PaybillMiniAppBean(Integer num, String str, String str2, String str3, String str4) {
        this.amount = num;
        this.billReference = str;
        this.businessID = str2;
        this.currency = str3;
        this.reason = str4;
    }

    public final Integer getAmount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.amount;
        int i4 = i2 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String getBillReference() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billReference;
        int i5 = i2 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBusinessID() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.businessID;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReason() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.reason;
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 95;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static PaybillMiniAppBean copy$default(PaybillMiniAppBean paybillMiniAppBean, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            num = paybillMiniAppBean.amount;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            str = paybillMiniAppBean.billReference;
            int i5 = component2 + 53;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = paybillMiniAppBean.businessID;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            int i7 = copydefault + 61;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str3 = paybillMiniAppBean.currency;
            if (i8 == 0) {
                int i9 = 76 / 0;
            }
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            int i10 = component2 + 39;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                String str8 = paybillMiniAppBean.reason;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = paybillMiniAppBean.reason;
        }
        return paybillMiniAppBean.copy(num2, str5, str6, str7, str4);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.amount;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billReference;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.businessID;
        }
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.currency;
            int i4 = 36 / 0;
        } else {
            str = this.currency;
        }
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reason;
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PaybillMiniAppBean copy(Integer amount, String billReference, String businessID, String currency, String reason) {
        int i = 2 % 2;
        PaybillMiniAppBean paybillMiniAppBean = new PaybillMiniAppBean(amount, billReference, businessID, currency, reason);
        int i2 = component2 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return paybillMiniAppBean;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaybillMiniAppBean)) {
            int i2 = copydefault + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PaybillMiniAppBean paybillMiniAppBean = (PaybillMiniAppBean) other;
        if (!Intrinsics.areEqual(this.amount, paybillMiniAppBean.amount)) {
            int i4 = component2;
            int i5 = i4 + 67;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 101;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.billReference, paybillMiniAppBean.billReference)) || !Intrinsics.areEqual(this.businessID, paybillMiniAppBean.businessID) || !Intrinsics.areEqual(this.currency, paybillMiniAppBean.currency)) {
            return false;
        }
        if (Intrinsics.areEqual(this.reason, paybillMiniAppBean.reason)) {
            return true;
        }
        int i9 = copydefault + 101;
        component2 = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.amount;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str = this.billReference;
        if (str == null) {
            int i4 = component2 + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = copydefault + 81;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str2 = this.businessID;
        if (str2 == null) {
            int i8 = copydefault + 49;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.currency;
        if (str3 == null) {
            int i10 = component2 + 31;
            int i11 = i10 % 128;
            copydefault = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 75;
            component2 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 5 % 3;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i15 = component2 + 75;
            copydefault = i15 % 128;
            int i16 = i15 % 2;
        }
        String str4 = this.reason;
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaybillMiniAppBean(amount=" + this.amount + ", billReference=" + this.billReference + ", businessID=" + this.businessID + ", currency=" + this.currency + ", reason=" + this.reason + ")";
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        Integer num = this.amount;
        if (num == null) {
            int i3 = component2 + 83;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            dest.writeInt(1);
            int iIntValue = num.intValue();
            int i5 = component2 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            i = iIntValue;
        }
        dest.writeInt(i);
        dest.writeString(this.billReference);
        dest.writeString(this.businessID);
        dest.writeString(this.currency);
        dest.writeString(this.reason);
    }
}
