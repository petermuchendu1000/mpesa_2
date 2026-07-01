package com.huawei.digitalpayment.consumer.sfcui.statement.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010 \u001a\u00020!H\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020!H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u0007R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/model/GetStatementsPayload;", "Landroid/os/Parcelable;", "duration", "", FirebaseAnalytics.Param.END_DATE, "forward_email", "msisdn", FirebaseAnalytics.Param.START_DATE, "user_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDuration$annotations", "()V", LottieConstants.METHOD_GET_DURATION, "()Ljava/lang/String;", "getEnd_date$annotations", "getEnd_date", "getForward_email$annotations", "getForward_email", "getMsisdn$annotations", "getMsisdn", "getStart_date$annotations", "getStart_date", "getUser_type$annotations", "getUser_type", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetStatementsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GetStatementsPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String duration;
    private final String end_date;
    private final String forward_email;
    private final String msisdn;
    private final String start_date;
    private final String user_type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetStatementsPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GetStatementsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            GetStatementsPayload getStatementsPayload = new GetStatementsPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 39;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return getStatementsPayload;
            }
            throw null;
        }

        @Override
        public GetStatementsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            GetStatementsPayload getStatementsPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 119;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return getStatementsPayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GetStatementsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 101;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            GetStatementsPayload[] getStatementsPayloadArr = new GetStatementsPayload[i];
            int i6 = i4 + 33;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return getStatementsPayloadArr;
            }
            throw null;
        }

        @Override
        public GetStatementsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            GetStatementsPayload[] getStatementsPayloadArrNewArray = newArray(i);
            int i5 = component1 + 81;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return getStatementsPayloadArrNewArray;
        }
    }

    public GetStatementsPayload(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.duration = str;
        this.end_date = str2;
        this.forward_email = str3;
        this.msisdn = str4;
        this.start_date = str5;
        this.user_type = str6;
    }

    public final String getDuration() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.duration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEnd_date() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.end_date;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getForward_email() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.forward_email;
        int i4 = i3 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStart_date() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.start_date;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getUser_type() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.user_type;
        int i5 = i2 + 39;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 113;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static GetStatementsPayload copy$default(GetStatementsPayload getStatementsPayload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = copydefault + 115;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        String str9 = (i3 % 2 == 0 && (i & 1) != 0) ? getStatementsPayload.duration : str;
        String str10 = (i & 2) != 0 ? getStatementsPayload.end_date : str2;
        String str11 = (i & 4) != 0 ? getStatementsPayload.forward_email : str3;
        if ((i & 8) != 0) {
            int i5 = i4 + 49;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str7 = getStatementsPayload.msisdn;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            str8 = getStatementsPayload.start_date;
            int i7 = copydefault + 13;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str8 = str5;
        }
        GetStatementsPayload getStatementsPayloadCopy = getStatementsPayload.copy(str9, str10, str11, str7, str8, (i & 32) != 0 ? getStatementsPayload.user_type : str6);
        int i9 = copydefault + 87;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return getStatementsPayloadCopy;
    }

    @SerialName("duration")
    public static void getDuration$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName(FirebaseAnalytics.Param.END_DATE)
    public static void getEnd_date$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @SerialName("forward_email")
    public static void getForward_email$annotations() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("msisdn")
    public static void getMsisdn$annotations() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName(FirebaseAnalytics.Param.START_DATE)
    public static void getStart_date$annotations() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @SerialName("user_type")
    public static void getUser_type$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.duration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.end_date;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.forward_email;
        int i4 = i3 + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.start_date;
        int i4 = i3 + 81;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.user_type;
        int i4 = i3 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final GetStatementsPayload copy(String duration, String end_date, String forward_email, String msisdn, String start_date, String user_type) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(end_date, "");
        Intrinsics.checkNotNullParameter(forward_email, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(start_date, "");
        Intrinsics.checkNotNullParameter(user_type, "");
        GetStatementsPayload getStatementsPayload = new GetStatementsPayload(duration, end_date, forward_email, msisdn, start_date, user_type);
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return getStatementsPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetStatementsPayload)) {
            return false;
        }
        GetStatementsPayload getStatementsPayload = (GetStatementsPayload) other;
        if (!Intrinsics.areEqual(this.duration, getStatementsPayload.duration)) {
            int i2 = ShareDataUIState + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.end_date, getStatementsPayload.end_date)) {
            int i4 = ShareDataUIState + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.forward_email, getStatementsPayload.forward_email)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, getStatementsPayload.msisdn)) {
            int i6 = copydefault + 29;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.start_date, getStatementsPayload.start_date)) {
            return false;
        }
        if (Intrinsics.areEqual(this.user_type, getStatementsPayload.user_type)) {
            return true;
        }
        int i8 = ShareDataUIState + 49;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.duration.hashCode() * 31) + this.end_date.hashCode()) * 31) + this.forward_email.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.start_date.hashCode()) * 31) + this.user_type.hashCode();
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetStatementsPayload(duration=" + this.duration + ", end_date=" + this.end_date + ", forward_email=" + this.forward_email + ", msisdn=" + this.msisdn + ", start_date=" + this.start_date + ", user_type=" + this.user_type + ")";
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.duration);
        dest.writeString(this.end_date);
        dest.writeString(this.forward_email);
        dest.writeString(this.msisdn);
        dest.writeString(this.start_date);
        dest.writeString(this.user_type);
        int i4 = copydefault + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
