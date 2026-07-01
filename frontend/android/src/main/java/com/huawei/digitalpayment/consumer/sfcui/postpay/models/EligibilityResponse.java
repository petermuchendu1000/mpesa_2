package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0015H×\u0001J\t\u0010\u001b\u001a\u00020\u0007H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EligibilityResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EligibilityBody;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EligibilityBody;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EligibilityBody;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EligibilityResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EligibilityResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("body")
    private final EligibilityBody body;

    @SerializedName("header")
    private final Header header;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EligibilityResponse> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EligibilityResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EligibilityResponse eligibilityResponse = new EligibilityResponse(Header.CREATOR.createFromParcel(parcel), EligibilityBody.CREATOR.createFromParcel(parcel), parcel.readString());
            int i2 = component3 + 7;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return eligibilityResponse;
            }
            throw null;
        }

        @Override
        public EligibilityResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            EligibilityResponse eligibilityResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 97;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return eligibilityResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EligibilityResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 19;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            EligibilityResponse[] eligibilityResponseArr = new EligibilityResponse[i];
            int i6 = i4 + 19;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return eligibilityResponseArr;
        }

        @Override
        public EligibilityResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 105;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public EligibilityResponse(Header header, EligibilityBody eligibilityBody, String str) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(eligibilityBody, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.header = header;
        this.body = eligibilityBody;
        this.messageId = str;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        throw null;
    }

    public final EligibilityBody getBody() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EligibilityBody eligibilityBody = this.body;
        int i4 = i2 + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return eligibilityBody;
        }
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 13;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static EligibilityResponse copy$default(EligibilityResponse eligibilityResponse, Header header, EligibilityBody eligibilityBody, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 95;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            header = eligibilityResponse.header;
        }
        if ((i & 2) != 0) {
            eligibilityBody = eligibilityResponse.body;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 67;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                String str2 = eligibilityResponse.messageId;
                throw null;
            }
            str = eligibilityResponse.messageId;
        }
        EligibilityResponse eligibilityResponseCopy = eligibilityResponse.copy(header, eligibilityBody, str);
        int i6 = component1 + 99;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return eligibilityResponseCopy;
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.header;
        }
        throw null;
    }

    public final EligibilityBody component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EligibilityBody eligibilityBody = this.body;
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return eligibilityBody;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.messageId;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return str;
    }

    public final EligibilityResponse copy(Header header, EligibilityBody body, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        EligibilityResponse eligibilityResponse = new EligibilityResponse(header, body, messageId);
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return eligibilityResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibilityResponse)) {
            int i2 = ShareDataUIState + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        EligibilityResponse eligibilityResponse = (EligibilityResponse) other;
        if (!Intrinsics.areEqual(this.header, eligibilityResponse.header)) {
            int i4 = component1 + 45;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.body, eligibilityResponse.body)) {
            return false;
        }
        if (Intrinsics.areEqual(this.messageId, eligibilityResponse.messageId)) {
            return true;
        }
        int i5 = ShareDataUIState + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.header.hashCode() >> 103) % this.body.hashCode()) * 38) << this.messageId.hashCode() : (((this.header.hashCode() * 31) + this.body.hashCode()) * 31) + this.messageId.hashCode();
        int i3 = component1 + 83;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EligibilityResponse(header=" + this.header + ", body=" + this.body + ", messageId=" + this.messageId + ")";
        int i2 = ShareDataUIState + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        this.body.writeToParcel(dest, flags);
        dest.writeString(this.messageId);
        int i4 = component1 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
