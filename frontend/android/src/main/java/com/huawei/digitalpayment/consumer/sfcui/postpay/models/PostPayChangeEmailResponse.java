package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/PostPayChangeEmailResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostPayChangeEmailResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PostPayChangeEmailResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("header")
    private final Header header;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PostPayChangeEmailResponse> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PostPayChangeEmailResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PostPayChangeEmailResponse postPayChangeEmailResponse = new PostPayChangeEmailResponse(Header.CREATOR.createFromParcel(parcel), parcel.readString());
            int i2 = component2 + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return postPayChangeEmailResponse;
        }

        @Override
        public PostPayChangeEmailResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            PostPayChangeEmailResponse postPayChangeEmailResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 101;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return postPayChangeEmailResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PostPayChangeEmailResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 111;
            int i4 = i3 % 128;
            copydefault = i4;
            PostPayChangeEmailResponse[] postPayChangeEmailResponseArr = new PostPayChangeEmailResponse[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 55;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return postPayChangeEmailResponseArr;
        }

        @Override
        public PostPayChangeEmailResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 109;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public PostPayChangeEmailResponse(Header header, String str) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.header = header;
        this.messageId = str;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Header header = this.header;
        int i4 = i3 + 97;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return header;
        }
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.messageId;
        int i4 = i2 + 67;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 35;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static PostPayChangeEmailResponse copy$default(PostPayChangeEmailResponse postPayChangeEmailResponse, Header header, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 115;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            header = postPayChangeEmailResponse.header;
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 91;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str = postPayChangeEmailResponse.messageId;
        }
        return postPayChangeEmailResponse.copy(header, str);
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Header header = this.header;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.messageId;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final PostPayChangeEmailResponse copy(Header header, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        PostPayChangeEmailResponse postPayChangeEmailResponse = new PostPayChangeEmailResponse(header, messageId);
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return postPayChangeEmailResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
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
        if (!(other instanceof PostPayChangeEmailResponse)) {
            int i2 = component1 + 77;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        PostPayChangeEmailResponse postPayChangeEmailResponse = (PostPayChangeEmailResponse) other;
        if (!Intrinsics.areEqual(this.header, postPayChangeEmailResponse.header)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.messageId, postPayChangeEmailResponse.messageId)) {
            int i3 = component3 + 59;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = component3 + 121;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.header.hashCode() * 31) + this.messageId.hashCode();
        int i4 = component1 + 109;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostPayChangeEmailResponse(header=" + this.header + ", messageId=" + this.messageId + ")";
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        dest.writeString(this.messageId);
        int i4 = component3 + 113;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
