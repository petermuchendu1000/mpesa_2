package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000f\b\u0002\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000f\b\u0002\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H×\u0003J\t\u0010\u0015\u001a\u00020\u0011H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/ChangePlanResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "body", "", "Lkotlinx/parcelize/RawValue;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;Ljava/lang/Object;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "getBody", "()Ljava/lang/Object;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangePlanResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChangePlanResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("body")
    private final Object body;

    @SerializedName("header")
    private final Header header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangePlanResponse> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangePlanResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ChangePlanResponse changePlanResponse = new ChangePlanResponse(Header.CREATOR.createFromParcel(parcel), parcel.readValue(ChangePlanResponse.class.getClassLoader()));
            int i2 = ShareDataUIState + 37;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 0;
            }
            return changePlanResponse;
        }

        @Override
        public ChangePlanResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ChangePlanResponse changePlanResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 13;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return changePlanResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangePlanResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 53;
            int i4 = i3 % 128;
            component1 = i4;
            ChangePlanResponse[] changePlanResponseArr = new ChangePlanResponse[i];
            if (i3 % 2 != 0) {
                int i5 = 62 / 0;
            }
            int i6 = i4 + 91;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return changePlanResponseArr;
        }

        @Override
        public ChangePlanResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            ChangePlanResponse[] changePlanResponseArrNewArray = newArray(i);
            int i5 = component1 + 41;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return changePlanResponseArrNewArray;
        }
    }

    public ChangePlanResponse(Header header, Object obj) {
        Intrinsics.checkNotNullParameter(header, "");
        this.header = header;
        this.body = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChangePlanResponse(Header header, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = component1 + 35;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 5;
            } else {
                int i7 = 2 % 2;
            }
            obj = null;
        }
        this(header, obj);
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Header header = this.header;
        int i5 = i3 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return header;
    }

    public final Object getBody() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = this.body;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    static {
        int i = copydefault + 109;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 22 / 0;
        }
    }

    public static ChangePlanResponse copy$default(ChangePlanResponse changePlanResponse, Header header, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            header = changePlanResponse.header;
            int i3 = component2 + 109;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 61;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                obj = changePlanResponse.body;
                int i6 = 66 / 0;
            } else {
                obj = changePlanResponse.body;
            }
        }
        return changePlanResponse.copy(header, obj);
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Header header = this.header;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return header;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.body;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return obj;
    }

    public final ChangePlanResponse copy(Header header, Object body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        ChangePlanResponse changePlanResponse = new ChangePlanResponse(header, body);
        int i2 = component1 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return changePlanResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePlanResponse)) {
            int i2 = component1 + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ChangePlanResponse changePlanResponse = (ChangePlanResponse) other;
        if (Intrinsics.areEqual(this.header, changePlanResponse.header)) {
            return Intrinsics.areEqual(this.body, changePlanResponse.body);
        }
        int i4 = component2 + 11;
        int i5 = i4 % 128;
        component1 = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 15;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.header.hashCode();
        Object obj = this.body;
        if (obj == null) {
            int i3 = component1 + 59;
            component2 = i3 % 128;
            i = i3 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode2 = obj.hashCode();
            int i4 = component1 + 115;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangePlanResponse(header=" + this.header + ", body=" + this.body + ")";
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.header.writeToParcel(dest, flags);
            dest.writeValue(this.body);
            throw null;
        }
        this.header.writeToParcel(dest, flags);
        dest.writeValue(this.body);
        int i4 = component1 + 9;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
