package com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/Recommendee;", "Landroid/os/Parcelable;", "activatedDate", "", "createdDate", "msisdn", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivatedDate", "()Ljava/lang/String;", "getCreatedDate", "getMsisdn", "getStatus", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recommendee implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Recommendee> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("activatedDate")
    private final String activatedDate;

    @SerializedName("createdDate")
    private final String createdDate;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Recommendee> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Recommendee createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Recommendee recommendee = new Recommendee(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return recommendee;
        }

        @Override
        public Recommendee createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Recommendee recommendeeCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 81;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return recommendeeCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Recommendee[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 93;
            int i4 = i3 % 128;
            component2 = i4;
            Recommendee[] recommendeeArr = new Recommendee[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 45;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return recommendeeArr;
        }

        @Override
        public Recommendee[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public Recommendee(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.activatedDate = str;
        this.createdDate = str2;
        this.msisdn = str3;
        this.status = str4;
    }

    public final String getActivatedDate() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.activatedDate;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCreatedDate() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createdDate;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.msisdn;
            int i4 = 9 / 0;
        } else {
            str = this.msisdn;
        }
        int i5 = i3 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 89;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Recommendee copy$default(Recommendee recommendee, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = recommendee.activatedDate;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 49;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                str2 = recommendee.createdDate;
                int i4 = 18 / 0;
            } else {
                str2 = recommendee.createdDate;
            }
        }
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 15;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                String str5 = recommendee.msisdn;
                obj2.hashCode();
                throw null;
            }
            str3 = recommendee.msisdn;
        }
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 103;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                String str6 = recommendee.status;
                obj2.hashCode();
                throw null;
            }
            str4 = recommendee.status;
        }
        Recommendee recommendeeCopy = recommendee.copy(str, str2, str3, str4);
        int i7 = component3 + 93;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 90 / 0;
        }
        return recommendeeCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.activatedDate;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createdDate;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Recommendee copy(String activatedDate, String createdDate, String msisdn, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activatedDate, "");
        Intrinsics.checkNotNullParameter(createdDate, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(status, "");
        Recommendee recommendee = new Recommendee(activatedDate, createdDate, msisdn, status);
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return recommendee;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof Recommendee)) {
            return false;
        }
        Recommendee recommendee = (Recommendee) other;
        if (!Intrinsics.areEqual(this.activatedDate, recommendee.activatedDate)) {
            int i6 = component3 + 59;
            ShareDataUIState = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.createdDate, recommendee.createdDate)) {
            return !(Intrinsics.areEqual(this.msisdn, recommendee.msisdn) ^ true) && Intrinsics.areEqual(this.status, recommendee.status);
        }
        int i7 = ShareDataUIState + 103;
        component3 = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.activatedDate.hashCode() * 31) + this.createdDate.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.status.hashCode();
        int i4 = component3 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Recommendee(activatedDate=" + this.activatedDate + ", createdDate=" + this.createdDate + ", msisdn=" + this.msisdn + ", status=" + this.status + ")";
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.activatedDate);
            dest.writeString(this.createdDate);
            dest.writeString(this.msisdn);
            dest.writeString(this.status);
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.activatedDate);
        dest.writeString(this.createdDate);
        dest.writeString(this.msisdn);
        dest.writeString(this.status);
        int i4 = ShareDataUIState + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
