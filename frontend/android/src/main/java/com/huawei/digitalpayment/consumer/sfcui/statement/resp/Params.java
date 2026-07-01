package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Params;", "Landroid/os/Parcelable;", "fullName", "", "statementGenerationDate", "statementPeriodEndDate", "statementPeriodStartDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFullName", "()Ljava/lang/String;", "getStatementGenerationDate", "getStatementPeriodEndDate", "getStatementPeriodStartDate", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Params implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Params> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("fullName")
    private final String fullName;

    @SerializedName("statementGenerationDate")
    private final String statementGenerationDate;

    @SerializedName("statementPeriodEndDate")
    private final String statementPeriodEndDate;

    @SerializedName("statementPeriodStartDate")
    private final String statementPeriodStartDate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Params> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Params createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Params params = new Params(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return params;
        }

        @Override
        public Params createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 61;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            Params paramsCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 37;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return paramsCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Params[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 105;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            Params[] paramsArr = new Params[i];
            int i6 = i3 + 53;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return paramsArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Params[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 73;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Params[] paramsArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 94 / 0;
            }
            return paramsArrNewArray;
        }
    }

    public Params(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.fullName = str;
        this.statementGenerationDate = str2;
        this.statementPeriodEndDate = str3;
        this.statementPeriodStartDate = str4;
    }

    public final String getFullName() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.fullName;
            int i4 = 53 / 0;
        } else {
            str = this.fullName;
        }
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStatementGenerationDate() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statementGenerationDate;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStatementPeriodEndDate() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.statementPeriodEndDate;
        int i4 = i2 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getStatementPeriodStartDate() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.statementPeriodStartDate;
        int i5 = i3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 95;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static Params copy$default(Params params, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 113;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = params.fullName;
            int i5 = i4 + 47;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = params.statementGenerationDate;
            int i7 = component1 + 75;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 4) != 0) {
            str3 = params.statementPeriodEndDate;
        }
        if ((i & 8) != 0) {
            int i9 = copydefault + 101;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                str4 = params.statementPeriodStartDate;
                int i10 = 29 / 0;
            } else {
                str4 = params.statementPeriodStartDate;
            }
        }
        Params paramsCopy = params.copy(str, str2, str3, str4);
        int i11 = component1 + 17;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return paramsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.fullName;
        int i4 = i3 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statementGenerationDate;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statementPeriodEndDate;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statementPeriodStartDate;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Params copy(String fullName, String statementGenerationDate, String statementPeriodEndDate, String statementPeriodStartDate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fullName, "");
        Intrinsics.checkNotNullParameter(statementGenerationDate, "");
        Intrinsics.checkNotNullParameter(statementPeriodEndDate, "");
        Intrinsics.checkNotNullParameter(statementPeriodStartDate, "");
        Params params = new Params(fullName, statementGenerationDate, statementPeriodEndDate, statementPeriodStartDate);
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return params;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Params)) {
            return false;
        }
        Params params = (Params) other;
        if (!Intrinsics.areEqual(this.fullName, params.fullName)) {
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.statementGenerationDate, params.statementGenerationDate)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.statementPeriodEndDate, params.statementPeriodEndDate))) {
            return Intrinsics.areEqual(this.statementPeriodStartDate, params.statementPeriodStartDate);
        }
        int i4 = copydefault + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.fullName.hashCode() * 31) + this.statementGenerationDate.hashCode()) * 31) + this.statementPeriodEndDate.hashCode()) * 31) + this.statementPeriodStartDate.hashCode();
        int i4 = copydefault + 3;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Params(fullName=" + this.fullName + ", statementGenerationDate=" + this.statementGenerationDate + ", statementPeriodEndDate=" + this.statementPeriodEndDate + ", statementPeriodStartDate=" + this.statementPeriodStartDate + ")";
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.fullName);
            dest.writeString(this.statementGenerationDate);
            dest.writeString(this.statementPeriodEndDate);
            dest.writeString(this.statementPeriodStartDate);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.fullName);
        dest.writeString(this.statementGenerationDate);
        dest.writeString(this.statementPeriodEndDate);
        dest.writeString(this.statementPeriodStartDate);
        int i4 = copydefault + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
