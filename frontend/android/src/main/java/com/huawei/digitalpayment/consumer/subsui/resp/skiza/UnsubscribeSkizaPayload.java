package com.huawei.digitalpayment.consumer.subsui.resp.skiza;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.addOnPictureInPictureModeChangedListener;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/UnsubscribeSkizaPayload;", "Landroid/os/Parcelable;", "msisdn", "", "tone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getTone", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsubscribeSkizaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UnsubscribeSkizaPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("tone")
    private final String tone;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnsubscribeSkizaPayload> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribeSkizaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UnsubscribeSkizaPayload unsubscribeSkizaPayload = new UnsubscribeSkizaPayload(parcel.readString(), parcel.readString());
            int i2 = component2 + 55;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return unsubscribeSkizaPayload;
            }
            throw null;
        }

        @Override
        public UnsubscribeSkizaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribeSkizaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 55;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            Object obj = null;
            UnsubscribeSkizaPayload[] unsubscribeSkizaPayloadArr = new UnsubscribeSkizaPayload[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 65;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return unsubscribeSkizaPayloadArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public UnsubscribeSkizaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            UnsubscribeSkizaPayload[] unsubscribeSkizaPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 41 / 0;
            }
            return unsubscribeSkizaPayloadArrNewArray;
        }

        public static void component2() {
            addOnPictureInPictureModeChangedListener.component3[0] = Class.forName("com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$copydefault$2").getDeclaredField("copydefault");
        }
    }

    public UnsubscribeSkizaPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.msisdn = str;
        this.tone = str2;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 125;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getTone() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tone;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 25;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static UnsubscribeSkizaPayload copy$default(UnsubscribeSkizaPayload unsubscribeSkizaPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault;
            int i4 = i3 + 69;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                String str3 = unsubscribeSkizaPayload.msisdn;
                throw null;
            }
            String str4 = unsubscribeSkizaPayload.msisdn;
            int i5 = i3 + 111;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str = str4;
        }
        if ((i & 2) != 0) {
            str2 = unsubscribeSkizaPayload.tone;
        }
        return unsubscribeSkizaPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tone;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final UnsubscribeSkizaPayload copy(String msisdn, String tone) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(tone, "");
        UnsubscribeSkizaPayload unsubscribeSkizaPayload = new UnsubscribeSkizaPayload(msisdn, tone);
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return unsubscribeSkizaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof UnsubscribeSkizaPayload)) {
            int i4 = copydefault + 97;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        UnsubscribeSkizaPayload unsubscribeSkizaPayload = (UnsubscribeSkizaPayload) other;
        if (!(!Intrinsics.areEqual(this.msisdn, unsubscribeSkizaPayload.msisdn))) {
            return Intrinsics.areEqual(this.tone, unsubscribeSkizaPayload.tone);
        }
        int i5 = copydefault + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.msisdn.hashCode() * 31) + this.tone.hashCode();
        int i4 = copydefault + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnsubscribeSkizaPayload(msisdn=" + this.msisdn + ", tone=" + this.tone + ")";
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.tone);
        int i4 = component1 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
