package com.safaricom.consumer.commons.resource;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006+"}, d2 = {"Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "Landroid/os/Parcelable;", "g2ErrorDescription", "", "availableBalance", "Lcom/safaricom/consumer/commons/resource/AvailableBalance;", "accountBlockedUntil", "maxLimit", "minLimit", "dailyLimit", "errorCode", "<init>", "(Ljava/lang/String;Lcom/safaricom/consumer/commons/resource/AvailableBalance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getG2ErrorDescription", "()Ljava/lang/String;", "getAvailableBalance", "()Lcom/safaricom/consumer/commons/resource/AvailableBalance;", "getAccountBlockedUntil", "getMaxLimit", "getMinLimit", "getDailyLimit", "getErrorCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdditionalFields implements Parcelable {
    public static final Parcelable.Creator<AdditionalFields> CREATOR = new Creator();

    @SerializedName("accountBlockedUntil")
    private final String accountBlockedUntil;

    @SerializedName("availableBalance")
    private final AvailableBalance availableBalance;

    @SerializedName("dailyLimit")
    private final String dailyLimit;

    @SerializedName("errorCode")
    private final String errorCode;

    @SerializedName("g2ErrorDescription")
    private final String g2ErrorDescription;

    @SerializedName("maxLimit")
    private final String maxLimit;

    @SerializedName("minLimit")
    private final String minLimit;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalFields> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AdditionalFields createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdditionalFields(parcel.readString(), parcel.readInt() == 0 ? null : AvailableBalance.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AdditionalFields[] newArray(int i) {
            return new AdditionalFields[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public AdditionalFields(String str, AvailableBalance availableBalance, String str2, String str3, String str4, String str5, String str6) {
        this.g2ErrorDescription = str;
        this.availableBalance = availableBalance;
        this.accountBlockedUntil = str2;
        this.maxLimit = str3;
        this.minLimit = str4;
        this.dailyLimit = str5;
        this.errorCode = str6;
    }

    public final String getG2ErrorDescription() {
        return this.g2ErrorDescription;
    }

    public final AvailableBalance getAvailableBalance() {
        return this.availableBalance;
    }

    public final String getAccountBlockedUntil() {
        return this.accountBlockedUntil;
    }

    public final String getMaxLimit() {
        return this.maxLimit;
    }

    public final String getMinLimit() {
        return this.minLimit;
    }

    public final String getDailyLimit() {
        return this.dailyLimit;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public static AdditionalFields copy$default(AdditionalFields additionalFields, String str, AvailableBalance availableBalance, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalFields.g2ErrorDescription;
        }
        if ((i & 2) != 0) {
            availableBalance = additionalFields.availableBalance;
        }
        AvailableBalance availableBalance2 = availableBalance;
        if ((i & 4) != 0) {
            str2 = additionalFields.accountBlockedUntil;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = additionalFields.maxLimit;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = additionalFields.minLimit;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = additionalFields.dailyLimit;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = additionalFields.errorCode;
        }
        return additionalFields.copy(str, availableBalance2, str7, str8, str9, str10, str6);
    }

    public final String getG2ErrorDescription() {
        return this.g2ErrorDescription;
    }

    public final AvailableBalance getAvailableBalance() {
        return this.availableBalance;
    }

    public final String getAccountBlockedUntil() {
        return this.accountBlockedUntil;
    }

    public final String getMaxLimit() {
        return this.maxLimit;
    }

    public final String getMinLimit() {
        return this.minLimit;
    }

    public final String getDailyLimit() {
        return this.dailyLimit;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final AdditionalFields copy(String g2ErrorDescription, AvailableBalance availableBalance, String accountBlockedUntil, String maxLimit, String minLimit, String dailyLimit, String errorCode) {
        return new AdditionalFields(g2ErrorDescription, availableBalance, accountBlockedUntil, maxLimit, minLimit, dailyLimit, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalFields)) {
            return false;
        }
        AdditionalFields additionalFields = (AdditionalFields) other;
        return Intrinsics.areEqual(this.g2ErrorDescription, additionalFields.g2ErrorDescription) && Intrinsics.areEqual(this.availableBalance, additionalFields.availableBalance) && Intrinsics.areEqual(this.accountBlockedUntil, additionalFields.accountBlockedUntil) && Intrinsics.areEqual(this.maxLimit, additionalFields.maxLimit) && Intrinsics.areEqual(this.minLimit, additionalFields.minLimit) && Intrinsics.areEqual(this.dailyLimit, additionalFields.dailyLimit) && Intrinsics.areEqual(this.errorCode, additionalFields.errorCode);
    }

    public int hashCode() {
        String str = this.g2ErrorDescription;
        int iHashCode = str == null ? 0 : str.hashCode();
        AvailableBalance availableBalance = this.availableBalance;
        int iHashCode2 = availableBalance == null ? 0 : availableBalance.hashCode();
        String str2 = this.accountBlockedUntil;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxLimit;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minLimit;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dailyLimit;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.errorCode;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AdditionalFields(g2ErrorDescription=" + this.g2ErrorDescription + ", availableBalance=" + this.availableBalance + ", accountBlockedUntil=" + this.accountBlockedUntil + ", maxLimit=" + this.maxLimit + ", minLimit=" + this.minLimit + ", dailyLimit=" + this.dailyLimit + ", errorCode=" + this.errorCode + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.g2ErrorDescription);
        AvailableBalance availableBalance = this.availableBalance;
        if (availableBalance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            availableBalance.writeToParcel(dest, flags);
        }
        dest.writeString(this.accountBlockedUntil);
        dest.writeString(this.maxLimit);
        dest.writeString(this.minLimit);
        dest.writeString(this.dailyLimit);
        dest.writeString(this.errorCode);
    }
}
