package com.huawei.digitalpayment.consumer.sfcui.reportfraud.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudFaqItem;", "Landroid/os/Parcelable;", "faq", "", "orderNumber", ConnectionLog.CONN_LOG_STATE_RESPONSE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFaq", "()Ljava/lang/String;", "getOrderNumber", "getResponse", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudFaqItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FraudFaqItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("faq")
    private final String faq;

    @SerializedName("orderNumber")
    private final String orderNumber;

    @SerializedName(ConnectionLog.CONN_LOG_STATE_RESPONSE)
    private final String response;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudFaqItem> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FraudFaqItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FraudFaqItem fraudFaqItem = new FraudFaqItem(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 47;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 76 / 0;
            }
            return fraudFaqItem;
        }

        @Override
        public FraudFaqItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FraudFaqItem fraudFaqItemCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 99;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return fraudFaqItemCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FraudFaqItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 43;
            component3 = i4 % 128;
            FraudFaqItem[] fraudFaqItemArr = new FraudFaqItem[i];
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            int i6 = i3 + 47;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return fraudFaqItemArr;
        }

        @Override
        public FraudFaqItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 39;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FraudFaqItem[] fraudFaqItemArrNewArray = newArray(i);
            int i5 = component2 + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fraudFaqItemArrNewArray;
        }
    }

    public FraudFaqItem(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.faq = str;
        this.orderNumber = str2;
        this.response = str3;
    }

    public final String getFaq() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.faq;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOrderNumber() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.orderNumber;
            int i4 = 84 / 0;
        } else {
            str = this.orderNumber;
        }
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getResponse() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.response;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 39;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FraudFaqItem copy$default(FraudFaqItem fraudFaqItem, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 71;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 29;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = fraudFaqItem.faq;
            if (i7 == 0) {
                int i8 = 36 / 0;
            }
        }
        if ((i & 2) != 0) {
            str2 = fraudFaqItem.orderNumber;
        }
        if ((i & 4) != 0) {
            int i9 = copydefault + 35;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str3 = fraudFaqItem.response;
        }
        return fraudFaqItem.copy(str, str2, str3);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.faq;
            int i4 = 43 / 0;
        } else {
            str = this.faq;
        }
        int i5 = i2 + 87;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.orderNumber;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.response;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final FraudFaqItem copy(String faq, String orderNumber, String response) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(faq, "");
        Intrinsics.checkNotNullParameter(orderNumber, "");
        Intrinsics.checkNotNullParameter(response, "");
        FraudFaqItem fraudFaqItem = new FraudFaqItem(faq, orderNumber, response);
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return fraudFaqItem;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FraudFaqItem)) {
            return false;
        }
        FraudFaqItem fraudFaqItem = (FraudFaqItem) other;
        if (!Intrinsics.areEqual(this.faq, fraudFaqItem.faq)) {
            int i4 = copydefault + 37;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.orderNumber, fraudFaqItem.orderNumber)) {
            return Intrinsics.areEqual(this.response, fraudFaqItem.response);
        }
        int i5 = component2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.faq.hashCode() * 31) + this.orderNumber.hashCode()) * 31) + this.response.hashCode();
        int i4 = copydefault + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FraudFaqItem(faq=" + this.faq + ", orderNumber=" + this.orderNumber + ", response=" + this.response + ")";
        int i2 = component2 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.faq);
        dest.writeString(this.orderNumber);
        dest.writeString(this.response);
        int i4 = copydefault + 25;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
