package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0013\b\u0002\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\tH×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/PostpayBundlesResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "body", "", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EmeraldPlanDetailsResponse;", "Lkotlinx/parcelize/RawValue;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;Ljava/util/List;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "getBody", "()Ljava/util/List;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayBundlesResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PostpayBundlesResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("body")
    private final List<EmeraldPlanDetailsResponse> body;

    @SerializedName("header")
    private final Header header;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PostpayBundlesResponse> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PostpayBundlesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component1 + 1;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component1 + 21;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(EmeraldPlanDetailsResponse.CREATOR.createFromParcel(parcel));
                    i5 += 33;
                } else {
                    arrayList.add(EmeraldPlanDetailsResponse.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new PostpayBundlesResponse(headerCreateFromParcel, arrayList, parcel.readString());
        }

        @Override
        public PostpayBundlesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 79;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PostpayBundlesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 27;
            int i4 = i3 % 128;
            component1 = i4;
            PostpayBundlesResponse[] postpayBundlesResponseArr = new PostpayBundlesResponse[i];
            if (i3 % 2 != 0) {
                int i5 = 56 / 0;
            }
            int i6 = i4 + 91;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return postpayBundlesResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public PostpayBundlesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 91;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public PostpayBundlesResponse(Header header, List<EmeraldPlanDetailsResponse> list, String str) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.header = header;
        this.body = list;
        this.messageId = str;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.header;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<EmeraldPlanDetailsResponse> getBody() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<EmeraldPlanDetailsResponse> list = this.body;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.messageId;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 3;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PostpayBundlesResponse copy$default(PostpayBundlesResponse postpayBundlesResponse, Header header, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 15;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            header = postpayBundlesResponse.header;
        }
        if ((i & 2) != 0) {
            list = postpayBundlesResponse.body;
        }
        if ((i & 4) != 0) {
            int i8 = component3 + 17;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str = postpayBundlesResponse.messageId;
        }
        PostpayBundlesResponse postpayBundlesResponseCopy = postpayBundlesResponse.copy(header, list, str);
        int i10 = component3 + 1;
        component2 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 55 / 0;
        }
        return postpayBundlesResponseCopy;
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<EmeraldPlanDetailsResponse> component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<EmeraldPlanDetailsResponse> list = this.body;
        int i4 = i2 + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.messageId;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final PostpayBundlesResponse copy(Header header, List<EmeraldPlanDetailsResponse> body, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        PostpayBundlesResponse postpayBundlesResponse = new PostpayBundlesResponse(header, body, messageId);
        int i2 = component3 + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return postpayBundlesResponse;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostpayBundlesResponse)) {
            int i4 = i2 + 41;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        PostpayBundlesResponse postpayBundlesResponse = (PostpayBundlesResponse) other;
        if (!Intrinsics.areEqual(this.header, postpayBundlesResponse.header)) {
            int i5 = component3 + 43;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.body, postpayBundlesResponse.body)) {
            int i7 = component2 + 61;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.messageId, postpayBundlesResponse.messageId)) {
            return true;
        }
        int i9 = component3 + 71;
        component2 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 28 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.header.hashCode() * 31) + this.body.hashCode()) * 31) + this.messageId.hashCode();
        int i4 = component2 + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostpayBundlesResponse(header=" + this.header + ", body=" + this.body + ", messageId=" + this.messageId + ")";
        int i2 = component3 + 103;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        List<EmeraldPlanDetailsResponse> list = this.body;
        dest.writeInt(list.size());
        Iterator<EmeraldPlanDetailsResponse> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = component2 + 17;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i3 = 65 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.messageId);
        int i4 = component2 + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
