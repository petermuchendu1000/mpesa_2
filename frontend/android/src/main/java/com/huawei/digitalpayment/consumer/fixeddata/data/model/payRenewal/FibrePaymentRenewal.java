package com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u001cH×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewal;", "Landroid/os/Parcelable;", "requestRefId", "", "resultCode", "resultDesc", "conversationId", "channelSessionId", "transactionResult", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/TransactionResult;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/TransactionResult;)V", "getRequestRefId", "()Ljava/lang/String;", "getResultCode", "getResultDesc", "getConversationId", "getChannelSessionId", "getTransactionResult", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/TransactionResult;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePaymentRenewal implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePaymentRenewal> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("channelSessionId")
    private final String channelSessionId;

    @SerializedName("conversationId")
    private final String conversationId;

    @SerializedName("requestRefId")
    private final String requestRefId;

    @SerializedName("resultCode")
    private final String resultCode;

    @SerializedName("resultDesc")
    private final String resultDesc;

    @SerializedName("transactionResult")
    private final TransactionResult transactionResult;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePaymentRenewal> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePaymentRenewal createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibrePaymentRenewal fibrePaymentRenewal = new FibrePaymentRenewal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TransactionResult.CREATOR.createFromParcel(parcel));
            int i2 = component2 + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return fibrePaymentRenewal;
        }

        @Override
        public FibrePaymentRenewal createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 41;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            FibrePaymentRenewal fibrePaymentRenewalCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return fibrePaymentRenewalCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePaymentRenewal[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 51;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            FibrePaymentRenewal[] fibrePaymentRenewalArr = new FibrePaymentRenewal[i];
            int i6 = i4 + 53;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return fibrePaymentRenewalArr;
            }
            throw null;
        }

        @Override
        public FibrePaymentRenewal[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 13;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            FibrePaymentRenewal[] fibrePaymentRenewalArrNewArray = newArray(i);
            int i5 = component2 + 19;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return fibrePaymentRenewalArrNewArray;
            }
            throw null;
        }
    }

    public FibrePaymentRenewal(String str, String str2, String str3, String str4, String str5, TransactionResult transactionResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(transactionResult, "");
        this.requestRefId = str;
        this.resultCode = str2;
        this.resultDesc = str3;
        this.conversationId = str4;
        this.channelSessionId = str5;
        this.transactionResult = transactionResult;
    }

    public final String getRequestRefId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestRefId;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String getResultCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resultCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResultDesc() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resultDesc;
        }
        throw null;
    }

    public final String getConversationId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.conversationId;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.channelSessionId;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final TransactionResult getTransactionResult() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionResult;
        }
        throw null;
    }

    static {
        int i = component2 + 19;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FibrePaymentRenewal copy$default(FibrePaymentRenewal fibrePaymentRenewal, String str, String str2, String str3, String str4, String str5, TransactionResult transactionResult, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = fibrePaymentRenewal.requestRefId;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = fibrePaymentRenewal.resultCode;
            int i3 = copydefault + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i5 = copydefault + 77;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str3 = fibrePaymentRenewal.resultDesc;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 13;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str4 = fibrePaymentRenewal.conversationId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            int i9 = copydefault;
            int i10 = i9 + 101;
            ShareDataUIState = i10 % 128;
            if (i10 % 2 == 0) {
                String str10 = fibrePaymentRenewal.channelSessionId;
                throw null;
            }
            str5 = fibrePaymentRenewal.channelSessionId;
            int i11 = i9 + 37;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            transactionResult = fibrePaymentRenewal.transactionResult;
        }
        return fibrePaymentRenewal.copy(str6, str7, str8, str9, str11, transactionResult);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.requestRefId;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resultCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resultDesc;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.conversationId;
        int i5 = i3 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionId;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TransactionResult component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        TransactionResult transactionResult = this.transactionResult;
        int i5 = i2 + 81;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return transactionResult;
        }
        throw null;
    }

    public final FibrePaymentRenewal copy(String requestRefId, String resultCode, String resultDesc, String conversationId, String channelSessionId, TransactionResult transactionResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestRefId, "");
        Intrinsics.checkNotNullParameter(resultCode, "");
        Intrinsics.checkNotNullParameter(resultDesc, "");
        Intrinsics.checkNotNullParameter(conversationId, "");
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        Intrinsics.checkNotNullParameter(transactionResult, "");
        FibrePaymentRenewal fibrePaymentRenewal = new FibrePaymentRenewal(requestRefId, resultCode, resultDesc, conversationId, channelSessionId, transactionResult);
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return fibrePaymentRenewal;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 109;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (other instanceof FibrePaymentRenewal) {
            FibrePaymentRenewal fibrePaymentRenewal = (FibrePaymentRenewal) other;
            if (!Intrinsics.areEqual(this.requestRefId, fibrePaymentRenewal.requestRefId)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.resultCode, fibrePaymentRenewal.resultCode))) {
                return Intrinsics.areEqual(this.resultDesc, fibrePaymentRenewal.resultDesc) && !(Intrinsics.areEqual(this.conversationId, fibrePaymentRenewal.conversationId) ^ true) && Intrinsics.areEqual(this.channelSessionId, fibrePaymentRenewal.channelSessionId) && Intrinsics.areEqual(this.transactionResult, fibrePaymentRenewal.transactionResult);
            }
            int i3 = ShareDataUIState + 69;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.requestRefId.hashCode() * 31) + this.resultCode.hashCode()) * 31) + this.resultDesc.hashCode()) * 31) + this.conversationId.hashCode()) * 31) + this.channelSessionId.hashCode()) * 31) + this.transactionResult.hashCode();
        int i4 = copydefault + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePaymentRenewal(requestRefId=" + this.requestRefId + ", resultCode=" + this.resultCode + ", resultDesc=" + this.resultDesc + ", conversationId=" + this.conversationId + ", channelSessionId=" + this.channelSessionId + ", transactionResult=" + this.transactionResult + ")";
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.requestRefId);
        dest.writeString(this.resultCode);
        dest.writeString(this.resultDesc);
        dest.writeString(this.conversationId);
        dest.writeString(this.channelSessionId);
        this.transactionResult.writeToParcel(dest, flags);
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
