package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/ChangePlanDetailsResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/ChangePlanDetailsBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/ChangePlanDetailsBody;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/ChangePlanDetailsBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangePlanDetailsResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChangePlanDetailsResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;

    @SerializedName("body")
    private final ChangePlanDetailsBody body;

    @SerializedName("header")
    private final Header header;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangePlanDetailsResponse> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangePlanDetailsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ChangePlanDetailsResponse changePlanDetailsResponse = new ChangePlanDetailsResponse(Header.CREATOR.createFromParcel(parcel), ChangePlanDetailsBody.CREATOR.createFromParcel(parcel));
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return changePlanDetailsResponse;
        }

        @Override
        public ChangePlanDetailsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            ChangePlanDetailsResponse changePlanDetailsResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 119;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return changePlanDetailsResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangePlanDetailsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ChangePlanDetailsResponse[] changePlanDetailsResponseArr = new ChangePlanDetailsResponse[i];
            int i6 = i3 + 69;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return changePlanDetailsResponseArr;
        }

        @Override
        public ChangePlanDetailsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 69;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            ChangePlanDetailsResponse[] changePlanDetailsResponseArrNewArray = newArray(i);
            int i5 = component2 + 71;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return changePlanDetailsResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ChangePlanDetailsResponse(Header header, ChangePlanDetailsBody changePlanDetailsBody) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(changePlanDetailsBody, "");
        this.header = header;
        this.body = changePlanDetailsBody;
    }

    public final Header getHeader() {
        Header header;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            header = this.header;
            int i4 = 51 / 0;
        } else {
            header = this.header;
        }
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ChangePlanDetailsBody getBody() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ChangePlanDetailsBody changePlanDetailsBody = this.body;
        int i5 = i2 + 37;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return changePlanDetailsBody;
    }

    static {
        int i = copydefault + 89;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static ChangePlanDetailsResponse copy$default(ChangePlanDetailsResponse changePlanDetailsResponse, Header header, ChangePlanDetailsBody changePlanDetailsBody, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 91;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            header = changePlanDetailsResponse.header;
        }
        if ((i & 2) != 0) {
            int i5 = component2;
            int i6 = i5 + 3;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                ChangePlanDetailsBody changePlanDetailsBody2 = changePlanDetailsResponse.body;
                throw null;
            }
            ChangePlanDetailsBody changePlanDetailsBody3 = changePlanDetailsResponse.body;
            int i7 = i5 + 45;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            changePlanDetailsBody = changePlanDetailsBody3;
        }
        return changePlanDetailsResponse.copy(header, changePlanDetailsBody);
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Header header = this.header;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return header;
    }

    public final ChangePlanDetailsBody component2() {
        ChangePlanDetailsBody changePlanDetailsBody;
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            changePlanDetailsBody = this.body;
            int i4 = 38 / 0;
        } else {
            changePlanDetailsBody = this.body;
        }
        int i5 = i3 + 23;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return changePlanDetailsBody;
        }
        throw null;
    }

    public final ChangePlanDetailsResponse copy(Header header, ChangePlanDetailsBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        ChangePlanDetailsResponse changePlanDetailsResponse = new ChangePlanDetailsResponse(header, body);
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return changePlanDetailsResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ChangePlanDetailsResponse)) {
            int i4 = component2 + 67;
            ShareDataUIState = i4 % 128;
            return i4 % 2 != 0;
        }
        ChangePlanDetailsResponse changePlanDetailsResponse = (ChangePlanDetailsResponse) other;
        if (Intrinsics.areEqual(this.header, changePlanDetailsResponse.header)) {
            return Intrinsics.areEqual(this.body, changePlanDetailsResponse.body);
        }
        int i5 = component2 + 23;
        ShareDataUIState = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.header.hashCode() * 31) + this.body.hashCode();
        int i4 = component2 + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangePlanDetailsResponse(header=" + this.header + ", body=" + this.body + ")";
        int i2 = ShareDataUIState + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        this.body.writeToParcel(dest, flags);
        int i4 = ShareDataUIState + 41;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
    }
}
