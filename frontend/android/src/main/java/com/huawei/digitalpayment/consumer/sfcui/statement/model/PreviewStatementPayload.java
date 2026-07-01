package com.huawei.digitalpayment.consumer.sfcui.statement.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/model/PreviewStatementPayload;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.END_DATE, "", FirebaseAnalytics.Param.START_DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEnd_date$annotations", "()V", "getEnd_date", "()Ljava/lang/String;", "getStart_date$annotations", "getStart_date", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewStatementPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PreviewStatementPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String end_date;
    private final String start_date;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PreviewStatementPayload> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PreviewStatementPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PreviewStatementPayload previewStatementPayload = new PreviewStatementPayload(parcel.readString(), parcel.readString());
            int i2 = component2 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return previewStatementPayload;
        }

        @Override
        public PreviewStatementPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            PreviewStatementPayload previewStatementPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return previewStatementPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PreviewStatementPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            PreviewStatementPayload[] previewStatementPayloadArr = new PreviewStatementPayload[i];
            int i6 = i3 + 37;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return previewStatementPayloadArr;
        }

        @Override
        public PreviewStatementPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            PreviewStatementPayload[] previewStatementPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 47 / 0;
            }
            return previewStatementPayloadArrNewArray;
        }
    }

    public PreviewStatementPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.end_date = str;
        this.start_date = str2;
    }

    public final String getEnd_date() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.end_date;
        int i5 = i2 + 83;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final String getStart_date() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.start_date;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 111;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static PreviewStatementPayload copy$default(PreviewStatementPayload previewStatementPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 17;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = previewStatementPayload.end_date;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 91;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = previewStatementPayload.start_date;
            if (i6 != 0) {
                int i7 = 72 / 0;
            }
        }
        return previewStatementPayload.copy(str, str2);
    }

    @SerialName(FirebaseAnalytics.Param.END_DATE)
    public static void getEnd_date$annotations() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName(FirebaseAnalytics.Param.START_DATE)
    public static void getStart_date$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.end_date;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.start_date;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PreviewStatementPayload copy(String end_date, String start_date) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(end_date, "");
        Intrinsics.checkNotNullParameter(start_date, "");
        PreviewStatementPayload previewStatementPayload = new PreviewStatementPayload(end_date, start_date);
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return previewStatementPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PreviewStatementPayload)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.end_date, ((PreviewStatementPayload) other).end_date)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.start_date, r6.start_date))) {
            return true;
        }
        int i4 = component3 + 125;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.end_date.hashCode();
        return i3 == 0 ? (iHashCode % 86) << this.start_date.hashCode() : (iHashCode * 31) + this.start_date.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreviewStatementPayload(end_date=" + this.end_date + ", start_date=" + this.start_date + ")";
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.end_date);
            dest.writeString(this.start_date);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.end_date);
        dest.writeString(this.start_date);
        int i4 = component3 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }
}
