package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/JoinPostpayCheckCreditRatingPayload;", "Landroid/os/Parcelable;", "msisdn", "", "validationType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getValidationType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JoinPostpayCheckCreditRatingPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<JoinPostpayCheckCreditRatingPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("validationType")
    private final String validationType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JoinPostpayCheckCreditRatingPayload> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final JoinPostpayCheckCreditRatingPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            JoinPostpayCheckCreditRatingPayload joinPostpayCheckCreditRatingPayload = new JoinPostpayCheckCreditRatingPayload(parcel.readString(), parcel.readString());
            int i2 = component2 + 59;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return joinPostpayCheckCreditRatingPayload;
        }

        @Override
        public JoinPostpayCheckCreditRatingPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            JoinPostpayCheckCreditRatingPayload joinPostpayCheckCreditRatingPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 17;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return joinPostpayCheckCreditRatingPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final JoinPostpayCheckCreditRatingPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 81;
            copydefault = i3 % 128;
            JoinPostpayCheckCreditRatingPayload[] joinPostpayCheckCreditRatingPayloadArr = new JoinPostpayCheckCreditRatingPayload[i];
            if (i3 % 2 == 0) {
                return joinPostpayCheckCreditRatingPayloadArr;
            }
            throw null;
        }

        @Override
        public JoinPostpayCheckCreditRatingPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 55;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            JoinPostpayCheckCreditRatingPayload[] joinPostpayCheckCreditRatingPayloadArrNewArray = newArray(i);
            int i5 = copydefault + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return joinPostpayCheckCreditRatingPayloadArrNewArray;
        }
    }

    public JoinPostpayCheckCreditRatingPayload(String str, String str2) {
        this.msisdn = str;
        this.validationType = str2;
    }

    public final String getMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.msisdn;
            int i4 = 47 / 0;
        } else {
            str = this.msisdn;
        }
        int i5 = i2 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValidationType() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.validationType;
            int i4 = 40 / 0;
        } else {
            str = this.validationType;
        }
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 3;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    public static JoinPostpayCheckCreditRatingPayload copy$default(JoinPostpayCheckCreditRatingPayload joinPostpayCheckCreditRatingPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str = joinPostpayCheckCreditRatingPayload.msisdn;
            if (i6 != 0) {
                int i7 = 3 / 0;
            }
        }
        if ((i & 2) != 0) {
            str2 = joinPostpayCheckCreditRatingPayload.validationType;
        }
        return joinPostpayCheckCreditRatingPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 31;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.validationType;
        int i5 = i3 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JoinPostpayCheckCreditRatingPayload copy(String msisdn, String validationType) {
        int i = 2 % 2;
        JoinPostpayCheckCreditRatingPayload joinPostpayCheckCreditRatingPayload = new JoinPostpayCheckCreditRatingPayload(msisdn, validationType);
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return joinPostpayCheckCreditRatingPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof JoinPostpayCheckCreditRatingPayload)) {
            int i4 = ShareDataUIState + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        JoinPostpayCheckCreditRatingPayload joinPostpayCheckCreditRatingPayload = (JoinPostpayCheckCreditRatingPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, joinPostpayCheckCreditRatingPayload.msisdn)) {
            int i6 = ShareDataUIState + 29;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.validationType, joinPostpayCheckCreditRatingPayload.validationType)) {
            return true;
        }
        int i8 = ShareDataUIState + 21;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            str = this.msisdn;
            iHashCode = 1;
            if (str != null) {
                i3 = 1;
                int iHashCode2 = str.hashCode();
                int i4 = copydefault + 123;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = i3;
                i3 = iHashCode2;
            }
        } else {
            str = this.msisdn;
            if (str == null) {
                iHashCode = 0;
            } else {
                int iHashCode22 = str.hashCode();
                int i42 = copydefault + 123;
                ShareDataUIState = i42 % 128;
                int i52 = i42 % 2;
                iHashCode = i3;
                i3 = iHashCode22;
            }
        }
        String str2 = this.validationType;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        int i6 = (i3 * 31) + iHashCode;
        int i7 = ShareDataUIState + 55;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JoinPostpayCheckCreditRatingPayload(msisdn=" + this.msisdn + ", validationType=" + this.validationType + ")";
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.validationType);
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
