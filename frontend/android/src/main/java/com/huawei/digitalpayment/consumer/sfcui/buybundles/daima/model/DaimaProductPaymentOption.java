package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import com.safaricom.designsystem.R;
import com.safaricom.designsystem.components.payment.IPaymentOption;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0006H\u0002J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\b\u0010\u001d\u001a\u00020\u0004H\u0007J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u0004H×\u0001J\t\u0010\"\u001a\u00020\u0006H×\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "Landroid/os/Parcelable;", "Lcom/safaricom/designsystem/components/payment/IPaymentOption;", "paymentOptionID", "", "code", "", "description", "active", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getPaymentOptionID", "()I", "getCode", "()Ljava/lang/String;", "getDescription", "getActive", "()Z", "getPlainCode", "displayNameStringResource", "getDisplayNameStringResource", "iconResource", "getIconResource", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaProductPaymentOption implements Parcelable, IPaymentOption {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DaimaProductPaymentOption> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("code")
    private final String code;

    @SerializedName("description")
    private final String description;

    @SerializedName("paymentOptionID")
    private final int paymentOptionID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DaimaProductPaymentOption> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductPaymentOption createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component3 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i4 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i5 = copydefault + 29;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            return new DaimaProductPaymentOption(i4, string, string2, z);
        }

        @Override
        public DaimaProductPaymentOption createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DaimaProductPaymentOption daimaProductPaymentOptionCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 35;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return daimaProductPaymentOptionCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductPaymentOption[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 61;
            copydefault = i3 % 128;
            DaimaProductPaymentOption[] daimaProductPaymentOptionArr = new DaimaProductPaymentOption[i];
            if (i3 % 2 != 0) {
                return daimaProductPaymentOptionArr;
            }
            throw null;
        }

        @Override
        public DaimaProductPaymentOption[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 77;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            DaimaProductPaymentOption[] daimaProductPaymentOptionArrNewArray = newArray(i);
            int i5 = component3 + 103;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return daimaProductPaymentOptionArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public DaimaProductPaymentOption(int i, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.paymentOptionID = i;
        this.code = str;
        this.description = str2;
        this.active = z;
    }

    public final int getPaymentOptionID() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.paymentOptionID;
        int i6 = i3 + 53;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return i5;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.code;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.description;
        }
        throw null;
    }

    public final boolean getActive() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.active;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private final String getPlainCode() {
        int i = 2 % 2;
        String lowerCase = new Regex("[_-]").replace(this.code, "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int i2 = ShareDataUIState + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return lowerCase;
    }

    @Override
    public int getDisplayNameStringResource() {
        int i = 2 % 2;
        String plainCode = getPlainCode();
        int iHashCode = plainCode.hashCode();
        if (iHashCode != -991553769) {
            int i2 = component2;
            int i3 = i2 + 113;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (iHashCode != 93920859) {
                int i5 = i2 + 75;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                if (iHashCode != 104101104) {
                    int i7 = i2 + 69;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                } else if (plainCode.equals(BuyAirtimeTypes.MPESA)) {
                    int i9 = component2 + 65;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                    return R.string.one_app_payment_method_mpesa;
                }
            } else if (plainCode.equals(BuyAirtimeTypes.BONGA)) {
                return R.string.one_app_payment_method_bonga_display_text;
            }
        } else if (plainCode.equals("airtime")) {
            return R.string.one_app_payment_method_airtime;
        }
        return R.string.app_name;
    }

    @Override
    public int getIconResource() {
        int i = 2 % 2;
        String plainCode = getPlainCode();
        int iHashCode = plainCode.hashCode();
        if (iHashCode != -991553769) {
            if (iHashCode != 93920859) {
                if (iHashCode != 104101104) {
                    int i2 = ShareDataUIState + 91;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                } else if (!(!plainCode.equals(BuyAirtimeTypes.MPESA))) {
                    return R.drawable.ic_one_app_payment_method_mpesa_selected;
                }
            } else if (plainCode.equals(BuyAirtimeTypes.BONGA)) {
                int i4 = R.drawable.ic_one_app_payment_method_bonga_selected;
                int i5 = component2 + 35;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }
        } else if (plainCode.equals("airtime")) {
            return R.drawable.ic_gsm_payment_airtime;
        }
        return R.drawable.icon_bundle_with_expiry;
    }

    static {
        int i = component3 + 43;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    public static DaimaProductPaymentOption copy$default(DaimaProductPaymentOption daimaProductPaymentOption, int i, String str, String str2, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 61;
        int i5 = i4 % 128;
        component2 = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = daimaProductPaymentOption.paymentOptionID;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 29;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = daimaProductPaymentOption.code;
        }
        if ((i2 & 4) != 0) {
            str2 = daimaProductPaymentOption.description;
        }
        if ((i2 & 8) != 0) {
            z = daimaProductPaymentOption.active;
        }
        return daimaProductPaymentOption.copy(i, str, str2, z);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.paymentOptionID;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.code;
            int i4 = 52 / 0;
        } else {
            str = this.code;
        }
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.active;
        }
        throw null;
    }

    public final DaimaProductPaymentOption copy(int paymentOptionID, String code, String description, boolean active) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        Intrinsics.checkNotNullParameter(description, "");
        DaimaProductPaymentOption daimaProductPaymentOption = new DaimaProductPaymentOption(paymentOptionID, code, description, active);
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return daimaProductPaymentOption;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DaimaProductPaymentOption)) {
            int i5 = i3 + 23;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        DaimaProductPaymentOption daimaProductPaymentOption = (DaimaProductPaymentOption) other;
        if (this.paymentOptionID != daimaProductPaymentOption.paymentOptionID) {
            int i7 = i3 + 93;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.code, daimaProductPaymentOption.code)) {
            int i9 = ShareDataUIState + 23;
            component2 = i9 % 128;
            return i9 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.description, daimaProductPaymentOption.description)) {
            return this.active == daimaProductPaymentOption.active;
        }
        int i10 = component2 + 87;
        ShareDataUIState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((Integer.hashCode(this.paymentOptionID) >>> 100) >> this.code.hashCode()) * 79) - this.description.hashCode()) >>> 90) << Boolean.hashCode(this.active) : (((((Integer.hashCode(this.paymentOptionID) * 31) + this.code.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.active);
        int i3 = component2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaProductPaymentOption(paymentOptionID=" + this.paymentOptionID + ", code=" + this.code + ", description=" + this.description + ", active=" + this.active + ")";
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeInt(this.paymentOptionID);
            dest.writeString(this.code);
            dest.writeString(this.description);
            dest.writeInt(this.active ? 1 : 0);
            int i4 = 42 / 0;
        } else {
            dest.writeInt(this.paymentOptionID);
            dest.writeString(this.code);
            dest.writeString(this.description);
            dest.writeInt(this.active ? 1 : 0);
        }
        int i5 = ShareDataUIState + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
