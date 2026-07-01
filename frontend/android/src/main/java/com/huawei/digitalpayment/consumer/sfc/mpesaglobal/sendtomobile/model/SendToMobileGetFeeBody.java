package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001f\u001a\u00020 H\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020 H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/model/SendToMobileGetFeeBody;", "Landroid/os/Parcelable;", "amount", "", "destinationAmount", "destinationCurrency", "exchangeRate", "rate", "transactionCost", "country", "carrier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getDestinationAmount", "getDestinationCurrency", "getExchangeRate", "getRate", "getTransactionCost", "getCountry", "getCarrier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileGetFeeBody implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SendToMobileGetFeeBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("carrier")
    private final String carrier;

    @SerializedName("country")
    private final String country;

    @SerializedName("destination_amount")
    private final String destinationAmount;

    @SerializedName("destination_currency")
    private final String destinationCurrency;

    @SerializedName("exchange_rate")
    private final String exchangeRate;

    @SerializedName("rate")
    private final String rate;

    @SerializedName(ImtConstants.KEY_TRANSACTION_COST_ROAMING)
    private final String transactionCost;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileGetFeeBody> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileGetFeeBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendToMobileGetFeeBody sendToMobileGetFeeBody = new SendToMobileGetFeeBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return sendToMobileGetFeeBody;
        }

        @Override
        public SendToMobileGetFeeBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 11;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileGetFeeBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 81;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            SendToMobileGetFeeBody[] sendToMobileGetFeeBodyArr = new SendToMobileGetFeeBody[i];
            int i6 = i3 + 27;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return sendToMobileGetFeeBodyArr;
            }
            throw null;
        }

        @Override
        public SendToMobileGetFeeBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 7;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public SendToMobileGetFeeBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.amount = str;
        this.destinationAmount = str2;
        this.destinationCurrency = str3;
        this.exchangeRate = str4;
        this.rate = str5;
        this.transactionCost = str6;
        this.country = str7;
        this.carrier = str8;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 53;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public final String getDestinationAmount() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.destinationAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDestinationCurrency() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.destinationCurrency;
        int i4 = i3 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getExchangeRate() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.exchangeRate;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final String getRate() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rate;
        }
        throw null;
    }

    public final String getTransactionCost() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.transactionCost;
        int i4 = i3 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getCountry() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.country;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return str;
    }

    public final String getCarrier() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.carrier;
        int i4 = i3 + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 29;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }

    public static SendToMobileGetFeeBody copy$default(SendToMobileGetFeeBody sendToMobileGetFeeBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        int i3 = component1 + 23;
        int i4 = i3 % 128;
        component3 = i4;
        Object obj2 = null;
        if (i3 % 2 == 0 || (i & 1) == 0) {
            str9 = str;
        } else {
            int i5 = i4 + 47;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                String str12 = sendToMobileGetFeeBody.amount;
                throw null;
            }
            str9 = sendToMobileGetFeeBody.amount;
        }
        String str13 = (i & 2) != 0 ? sendToMobileGetFeeBody.destinationAmount : str2;
        String str14 = (i & 4) != 0 ? sendToMobileGetFeeBody.destinationCurrency : str3;
        String str15 = (i & 8) != 0 ? sendToMobileGetFeeBody.exchangeRate : str4;
        if ((i & 16) != 0) {
            int i6 = component1 + 17;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str10 = sendToMobileGetFeeBody.rate;
        } else {
            str10 = str5;
        }
        String str16 = (i & 32) != 0 ? sendToMobileGetFeeBody.transactionCost : str6;
        if ((i & 64) != 0) {
            int i8 = component1 + 93;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                String str17 = sendToMobileGetFeeBody.country;
                obj2.hashCode();
                throw null;
            }
            str11 = sendToMobileGetFeeBody.country;
        } else {
            str11 = str7;
        }
        SendToMobileGetFeeBody sendToMobileGetFeeBodyCopy = sendToMobileGetFeeBody.copy(str9, str13, str14, str15, str10, str16, str11, (i & 128) != 0 ? sendToMobileGetFeeBody.carrier : str8);
        int i9 = component3 + 1;
        component1 = i9 % 128;
        if (i9 % 2 == 0) {
            return sendToMobileGetFeeBodyCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.destinationAmount;
        int i4 = i3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.destinationCurrency;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.exchangeRate;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.rate;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.transactionCost;
            int i4 = 21 / 0;
        } else {
            str = this.transactionCost;
        }
        int i5 = i3 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.country;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.carrier;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SendToMobileGetFeeBody copy(String amount, String destinationAmount, String destinationCurrency, String exchangeRate, String rate, String transactionCost, String country, String carrier) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(destinationAmount, "");
        Intrinsics.checkNotNullParameter(destinationCurrency, "");
        Intrinsics.checkNotNullParameter(exchangeRate, "");
        Intrinsics.checkNotNullParameter(rate, "");
        Intrinsics.checkNotNullParameter(transactionCost, "");
        Intrinsics.checkNotNullParameter(country, "");
        Intrinsics.checkNotNullParameter(carrier, "");
        SendToMobileGetFeeBody sendToMobileGetFeeBody = new SendToMobileGetFeeBody(amount, destinationAmount, destinationCurrency, exchangeRate, rate, transactionCost, country, carrier);
        int i2 = component1 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return sendToMobileGetFeeBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendToMobileGetFeeBody)) {
            return false;
        }
        SendToMobileGetFeeBody sendToMobileGetFeeBody = (SendToMobileGetFeeBody) other;
        if ((!Intrinsics.areEqual(this.amount, sendToMobileGetFeeBody.amount)) || !Intrinsics.areEqual(this.destinationAmount, sendToMobileGetFeeBody.destinationAmount) || !Intrinsics.areEqual(this.destinationCurrency, sendToMobileGetFeeBody.destinationCurrency)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.exchangeRate, sendToMobileGetFeeBody.exchangeRate)) {
            int i4 = component3 + 121;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rate, sendToMobileGetFeeBody.rate)) {
            int i6 = component3 + 123;
            component1 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.transactionCost, sendToMobileGetFeeBody.transactionCost) || !Intrinsics.areEqual(this.country, sendToMobileGetFeeBody.country)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.carrier, sendToMobileGetFeeBody.carrier))) {
            return true;
        }
        int i7 = component3 + 71;
        component1 = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.amount.hashCode() * 31) + this.destinationAmount.hashCode()) * 31) + this.destinationCurrency.hashCode()) * 31) + this.exchangeRate.hashCode()) * 31) + this.rate.hashCode()) * 31) + this.transactionCost.hashCode()) * 31) + this.country.hashCode()) * 31) + this.carrier.hashCode();
        int i4 = component3 + 41;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileGetFeeBody(amount=" + this.amount + ", destinationAmount=" + this.destinationAmount + ", destinationCurrency=" + this.destinationCurrency + ", exchangeRate=" + this.exchangeRate + ", rate=" + this.rate + ", transactionCost=" + this.transactionCost + ", country=" + this.country + ", carrier=" + this.carrier + ')';
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeString(this.destinationAmount);
        dest.writeString(this.destinationCurrency);
        dest.writeString(this.exchangeRate);
        dest.writeString(this.rate);
        dest.writeString(this.transactionCost);
        dest.writeString(this.country);
        dest.writeString(this.carrier);
        int i4 = component1 + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
