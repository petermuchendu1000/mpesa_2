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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0013\b\u0002\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\tH×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/CreditRatingResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "body", "", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/MigrationData;", "Lkotlinx/parcelize/RawValue;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;Ljava/util/List;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/Header;", "getBody", "()Ljava/util/List;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreditRatingResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreditRatingResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("body")
    private final List<MigrationData> body;

    @SerializedName("header")
    private final Header header;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String messageId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreditRatingResponse> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CreditRatingResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = ShareDataUIState + 77;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(MigrationData.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = ShareDataUIState + 13;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
            return new CreditRatingResponse(headerCreateFromParcel, arrayList, parcel.readString());
        }

        @Override
        public CreditRatingResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            CreditRatingResponse creditRatingResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 41;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return creditRatingResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CreditRatingResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 53;
            copydefault = i4 % 128;
            CreditRatingResponse[] creditRatingResponseArr = new CreditRatingResponse[i];
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            int i6 = i3 + 91;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 0;
            }
            return creditRatingResponseArr;
        }

        @Override
        public CreditRatingResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 107;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            CreditRatingResponse[] creditRatingResponseArrNewArray = newArray(i);
            int i5 = copydefault + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return creditRatingResponseArrNewArray;
        }
    }

    public CreditRatingResponse(Header header, List<MigrationData> list, String str) {
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.header = header;
        this.body = list;
        this.messageId = str;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Header header = this.header;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return header;
    }

    public final List<MigrationData> getBody() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<MigrationData> list = this.body;
        int i4 = i3 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.messageId;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 87;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CreditRatingResponse copy$default(CreditRatingResponse creditRatingResponse, Header header, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 21;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            header = creditRatingResponse.header;
        }
        if ((i & 2) != 0) {
            list = creditRatingResponse.body;
        }
        if ((i & 4) != 0) {
            str = creditRatingResponse.messageId;
            int i5 = i3 + 49;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return creditRatingResponse.copy(header, list, str);
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Header header = this.header;
        int i5 = i3 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return header;
    }

    public final List<MigrationData> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<MigrationData> list = this.body;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final CreditRatingResponse copy(Header header, List<MigrationData> body, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        CreditRatingResponse creditRatingResponse = new CreditRatingResponse(header, body, messageId);
        int i2 = ShareDataUIState + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return creditRatingResponse;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 13;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof CreditRatingResponse)) {
            return false;
        }
        CreditRatingResponse creditRatingResponse = (CreditRatingResponse) other;
        if (!Intrinsics.areEqual(this.header, creditRatingResponse.header)) {
            return false;
        }
        if (Intrinsics.areEqual(this.body, creditRatingResponse.body)) {
            return Intrinsics.areEqual(this.messageId, creditRatingResponse.messageId);
        }
        int i6 = component2 + 91;
        ShareDataUIState = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.header.hashCode() * 31) + this.body.hashCode()) * 31) + this.messageId.hashCode();
        int i4 = ShareDataUIState + 117;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditRatingResponse(header=" + this.header + ", body=" + this.body + ", messageId=" + this.messageId + ")";
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            this.header.writeToParcel(dest, flags);
            List<MigrationData> list = this.body;
            dest.writeInt(list.size());
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.header.writeToParcel(dest, flags);
        List<MigrationData> list2 = this.body;
        dest.writeInt(list2.size());
        Iterator<MigrationData> it = list2.iterator();
        int i4 = component2 + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 4;
        }
        while (it.hasNext()) {
            int i6 = component2 + 21;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.messageId);
    }
}
