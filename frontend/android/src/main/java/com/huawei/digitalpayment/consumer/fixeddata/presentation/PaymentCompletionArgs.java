package com.huawei.digitalpayment.consumer.fixeddata.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\b\u0010$\u001a\u00020%H\u0007J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(H×\u0003J\t\u0010)\u001a\u00020%H×\u0001J\t\u0010*\u001a\u00020\u0007H×\u0001J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentCompletionArgs;", "Landroid/os/Parcelable;", "operation", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "method", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "planName", "", "amountCharged", Keys.KEY_IS_SUCCESS, "", DisPlayItems.TRANSACTION_ID, "message", "timestamp", "<init>", "(Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOperation", "()Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "getMethod", "()Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "getPlanName", "()Ljava/lang/String;", "getAmountCharged", "()Z", "getTransactionId", "getMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentCompletionArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PaymentCompletionArgs> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String amountCharged;
    private final boolean isSuccess;
    private final String message;
    private final PaymentMethod method;
    private final PaymentOperation operation;
    private final String planName;
    private final String timestamp;
    private final String transactionId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentCompletionArgs> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PaymentCompletionArgs createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 5;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PaymentOperation paymentOperation = (PaymentOperation) parcel.readParcelable(PaymentCompletionArgs.class.getClassLoader());
            PaymentMethod paymentMethod = (PaymentMethod) parcel.readParcelable(PaymentCompletionArgs.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = component3;
                int i5 = i4 + 25;
                component1 = i5 % 128;
                z = i5 % 2 != 0;
                int i6 = i4 + 3;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
            return new PaymentCompletionArgs(paymentOperation, paymentMethod, string, string2, z, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public PaymentCompletionArgs createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PaymentCompletionArgs[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            PaymentCompletionArgs[] paymentCompletionArgsArr = new PaymentCompletionArgs[i];
            int i6 = i3 + 15;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return paymentCompletionArgsArr;
            }
            throw null;
        }

        @Override
        public PaymentCompletionArgs[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            PaymentCompletionArgs[] paymentCompletionArgsArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 68 / 0;
            }
            int i6 = component1 + 67;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return paymentCompletionArgsArrNewArray;
            }
            throw null;
        }
    }

    public PaymentCompletionArgs(PaymentOperation paymentOperation, PaymentMethod paymentMethod, String str, String str2, boolean z, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(paymentOperation, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.operation = paymentOperation;
        this.method = paymentMethod;
        this.planName = str;
        this.amountCharged = str2;
        this.isSuccess = z;
        this.transactionId = str3;
        this.message = str4;
        this.timestamp = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentCompletionArgs(PaymentOperation paymentOperation, PaymentMethod paymentMethod, String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PaymentMethod paymentMethod2;
        String str6;
        String str7;
        String str8;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            paymentMethod2 = null;
        } else {
            paymentMethod2 = paymentMethod;
        }
        if ((i & 32) != 0) {
            int i3 = copydefault + 85;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 64) != 0) {
            int i4 = 2 % 2;
            str7 = "";
        } else {
            str7 = str4;
        }
        if ((i & 128) != 0) {
            int i5 = component2 + 89;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str8 = null;
        } else {
            str8 = str5;
        }
        this(paymentOperation, paymentMethod2, str, str2, z, str6, str7, str8);
    }

    public final PaymentOperation getOperation() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        PaymentOperation paymentOperation = this.operation;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return paymentOperation;
    }

    public final PaymentMethod getMethod() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        PaymentMethod paymentMethod = this.method;
        int i4 = i2 + 125;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return paymentMethod;
    }

    public final String getPlanName() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.planName;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountCharged() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountCharged;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isSuccess() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isSuccess;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return z;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.transactionId;
        int i4 = i3 + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.message;
        }
        int i3 = 2 / 0;
        return this.message;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.timestamp;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 105;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static PaymentCompletionArgs copy$default(PaymentCompletionArgs paymentCompletionArgs, PaymentOperation paymentOperation, PaymentMethod paymentMethod, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        PaymentOperation paymentOperation2;
        PaymentMethod paymentMethod2;
        String str6;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 25;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            paymentOperation2 = paymentCompletionArgs.operation;
        } else {
            paymentOperation2 = paymentOperation;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 79;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            paymentMethod2 = paymentCompletionArgs.method;
        } else {
            paymentMethod2 = paymentMethod;
        }
        if ((i & 4) != 0) {
            str6 = paymentCompletionArgs.planName;
            int i7 = copydefault + 27;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str6 = str;
        }
        return paymentCompletionArgs.copy(paymentOperation2, paymentMethod2, str6, (i & 8) != 0 ? paymentCompletionArgs.amountCharged : str2, (i & 16) != 0 ? paymentCompletionArgs.isSuccess : z, (i & 32) != 0 ? paymentCompletionArgs.transactionId : str3, (i & 64) != 0 ? paymentCompletionArgs.message : str4, (i & 128) != 0 ? paymentCompletionArgs.timestamp : str5);
    }

    public final PaymentOperation component1() {
        PaymentOperation paymentOperation;
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            paymentOperation = this.operation;
            int i4 = 76 / 0;
        } else {
            paymentOperation = this.operation;
        }
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return paymentOperation;
        }
        throw null;
    }

    public final PaymentMethod component2() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        PaymentMethod paymentMethod = this.method;
        int i4 = i3 + 95;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return paymentMethod;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.planName;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.amountCharged;
        int i4 = i3 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isSuccess;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return z;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.transactionId;
        int i4 = i2 + 117;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.message;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.timestamp;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PaymentCompletionArgs copy(PaymentOperation operation, PaymentMethod method, String planName, String amountCharged, boolean isSuccess, String transactionId, String message, String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(operation, "");
        Intrinsics.checkNotNullParameter(amountCharged, "");
        Intrinsics.checkNotNullParameter(message, "");
        PaymentCompletionArgs paymentCompletionArgs = new PaymentCompletionArgs(operation, method, planName, amountCharged, isSuccess, transactionId, message, timestamp);
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return paymentCompletionArgs;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCompletionArgs)) {
            return false;
        }
        PaymentCompletionArgs paymentCompletionArgs = (PaymentCompletionArgs) other;
        if (!Intrinsics.areEqual(this.operation, paymentCompletionArgs.operation)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.method, paymentCompletionArgs.method)) {
            int i2 = copydefault + 115;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.planName, paymentCompletionArgs.planName)) {
            int i3 = copydefault + 123;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 59;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountCharged, paymentCompletionArgs.amountCharged) || this.isSuccess != paymentCompletionArgs.isSuccess || !Intrinsics.areEqual(this.transactionId, paymentCompletionArgs.transactionId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, paymentCompletionArgs.message)) {
            int i8 = component2 + 59;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.timestamp, paymentCompletionArgs.timestamp)) {
            return true;
        }
        int i10 = component2 + 17;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.operation.hashCode();
        PaymentMethod paymentMethod = this.method;
        int iHashCode4 = 0;
        if (paymentMethod == null) {
            int i4 = copydefault + 79;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = paymentMethod.hashCode();
        }
        String str = this.planName;
        if (str == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
            int i6 = copydefault + 33;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        int iHashCode5 = this.amountCharged.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isSuccess);
        String str2 = this.transactionId;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.message.hashCode();
        String str3 = this.timestamp;
        if (str3 == null) {
            int i8 = copydefault + 91;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            iHashCode4 = str3.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaymentCompletionArgs(operation=" + this.operation + ", method=" + this.method + ", planName=" + this.planName + ", amountCharged=" + this.amountCharged + ", isSuccess=" + this.isSuccess + ", transactionId=" + this.transactionId + ", message=" + this.message + ", timestamp=" + this.timestamp + ")";
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(this.operation, flags);
        dest.writeParcelable(this.method, flags);
        dest.writeString(this.planName);
        dest.writeString(this.amountCharged);
        dest.writeInt(this.isSuccess ? 1 : 0);
        dest.writeString(this.transactionId);
        dest.writeString(this.message);
        dest.writeString(this.timestamp);
        int i4 = component2 + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
