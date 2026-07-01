package com.huawei.digitalpayment.consumer.fixeddata.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePackageDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\t\u00106\u001a\u00020\u0015HÆ\u0003J\u009b\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÇ\u0001J\b\u00108\u001a\u00020\u0013H\u0007J\u0013\u00109\u001a\u00020\u00152\b\u0010:\u001a\u0004\u0018\u00010;H×\u0003J\t\u0010<\u001a\u00020\u0013H×\u0001J\t\u0010=\u001a\u00020\u0007H×\u0001J\u0018\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0013H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010)¨\u0006C"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentConfirmationArgs;", "Landroid/os/Parcelable;", "operation", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "method", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "title", "", "accountId", "productId", "productCode", "productType", "planName", "amountToCharge", "cashBack", "selectedAddons", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePackageDetail;", "existingAddonsCount", "", "isFamilyShare", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IZ)V", "getOperation", "()Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentOperation;", "getMethod", "()Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/PaymentMethod;", "getTitle", "()Ljava/lang/String;", "getAccountId", "getProductId", "getProductCode", "getProductType", "getPlanName", "getAmountToCharge", "getCashBack", "getSelectedAddons", "()Ljava/util/List;", "getExistingAddonsCount", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentConfirmationArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentConfirmationArgs> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String accountId;
    private final String amountToCharge;
    private final String cashBack;
    private final int existingAddonsCount;
    private final boolean isFamilyShare;
    private final PaymentMethod method;
    private final PaymentOperation operation;
    private final String planName;
    private final String productCode;
    private final String productId;
    private final String productType;
    private final List<FibrePackageDetail> selectedAddons;
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentConfirmationArgs> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PaymentConfirmationArgs createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PaymentOperation paymentOperation = (PaymentOperation) parcel.readParcelable(PaymentConfirmationArgs.class.getClassLoader());
            PaymentMethod paymentMethod = (PaymentMethod) parcel.readParcelable(PaymentConfirmationArgs.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = ShareDataUIState + 41;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(FibrePackageDetail.CREATOR.createFromParcel(parcel));
                i3++;
                i2 = i2;
            }
            ArrayList arrayList2 = arrayList;
            int i6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i7 = ShareDataUIState + 53;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            return new PaymentConfirmationArgs(paymentOperation, paymentMethod, string, string2, string3, string4, string5, string6, string7, string8, arrayList2, i6, z);
        }

        @Override
        public PaymentConfirmationArgs createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 103;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PaymentConfirmationArgs paymentConfirmationArgsCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 5;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return paymentConfirmationArgsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PaymentConfirmationArgs[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 11;
            copydefault = i3 % 128;
            PaymentConfirmationArgs[] paymentConfirmationArgsArr = new PaymentConfirmationArgs[i];
            if (i3 % 2 == 0) {
                int i4 = 70 / 0;
            }
            return paymentConfirmationArgsArr;
        }

        @Override
        public PaymentConfirmationArgs[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 69;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            PaymentConfirmationArgs[] paymentConfirmationArgsArrNewArray = newArray(i);
            int i4 = copydefault + 31;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return paymentConfirmationArgsArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public PaymentConfirmationArgs(PaymentOperation paymentOperation, PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<FibrePackageDetail> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(paymentOperation, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.operation = paymentOperation;
        this.method = paymentMethod;
        this.title = str;
        this.accountId = str2;
        this.productId = str3;
        this.productCode = str4;
        this.productType = str5;
        this.planName = str6;
        this.amountToCharge = str7;
        this.cashBack = str8;
        this.selectedAddons = list;
        this.existingAddonsCount = i;
        this.isFamilyShare = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentConfirmationArgs(PaymentOperation paymentOperation, PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        if ((i2 & 64) != 0) {
            int i3 = component3 + 27;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 26 / 0;
            }
            int i5 = 2 % 2;
            str9 = "MONTHLY";
        } else {
            str9 = str5;
        }
        if ((i2 & 512) != 0) {
            int i6 = component3 + 27;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str10 = null;
        } else {
            str10 = str8;
        }
        this(paymentOperation, paymentMethod, str, str2, str3, str4, str9, str6, str7, str10, (i2 & 1024) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? false : z);
    }

    public final PaymentOperation getOperation() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        PaymentOperation paymentOperation = this.operation;
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return paymentOperation;
    }

    public final PaymentMethod getMethod() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        PaymentMethod paymentMethod = this.method;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return paymentMethod;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 37;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productCode;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPlanName() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.planName;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmountToCharge() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amountToCharge;
        }
        throw null;
    }

    public final String getCashBack() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cashBack;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<FibrePackageDetail> getSelectedAddons() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<FibrePackageDetail> list = this.selectedAddons;
        int i4 = i2 + 59;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final int getExistingAddonsCount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.existingAddonsCount;
        int i6 = i2 + 103;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean isFamilyShare() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isFamilyShare;
        int i4 = i2 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    static {
        int i = ShareDataUIState + 107;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PaymentConfirmationArgs copy$default(PaymentConfirmationArgs paymentConfirmationArgs, PaymentOperation paymentOperation, PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, boolean z, int i2, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        int i3;
        int i4 = 2 % 2;
        PaymentOperation paymentOperation2 = (i2 & 1) != 0 ? paymentConfirmationArgs.operation : paymentOperation;
        PaymentMethod paymentMethod2 = (i2 & 2) != 0 ? paymentConfirmationArgs.method : paymentMethod;
        String str13 = (i2 & 4) != 0 ? paymentConfirmationArgs.title : str;
        String str14 = (i2 & 8) != 0 ? paymentConfirmationArgs.accountId : str2;
        String str15 = (i2 & 16) != 0 ? paymentConfirmationArgs.productId : str3;
        if ((i2 & 32) != 0) {
            str9 = paymentConfirmationArgs.productCode;
            int i5 = component2 + 77;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str9 = str4;
        }
        String str16 = (i2 & 64) != 0 ? paymentConfirmationArgs.productType : str5;
        if ((i2 & 128) != 0) {
            int i7 = component3 + 35;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                String str17 = paymentConfirmationArgs.planName;
                throw null;
            }
            str10 = paymentConfirmationArgs.planName;
        } else {
            str10 = str6;
        }
        if ((i2 & 256) != 0) {
            int i8 = component2 + 83;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str11 = paymentConfirmationArgs.amountToCharge;
        } else {
            str11 = str7;
        }
        if ((i2 & 512) != 0) {
            int i10 = component3 + 87;
            component2 = i10 % 128;
            if (i10 % 2 != 0) {
                str12 = paymentConfirmationArgs.cashBack;
                int i11 = 86 / 0;
            } else {
                str12 = paymentConfirmationArgs.cashBack;
            }
        } else {
            str12 = str8;
        }
        List list2 = (i2 & 1024) != 0 ? paymentConfirmationArgs.selectedAddons : list;
        if ((i2 & 2048) != 0) {
            int i12 = component3 + 57;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            i3 = paymentConfirmationArgs.existingAddonsCount;
            if (i13 != 0) {
                int i14 = 71 / 0;
            }
        } else {
            i3 = i;
        }
        return paymentConfirmationArgs.copy(paymentOperation2, paymentMethod2, str13, str14, str15, str9, str16, str10, str11, str12, list2, i3, (i2 & 4096) != 0 ? paymentConfirmationArgs.isFamilyShare : z);
    }

    public final PaymentOperation component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        PaymentOperation paymentOperation = this.operation;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return paymentOperation;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.cashBack;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<FibrePackageDetail> component11() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<FibrePackageDetail> list = this.selectedAddons;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final int component12() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.existingAddonsCount;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return i4;
    }

    public final boolean component13() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isFamilyShare;
        int i5 = i3 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PaymentMethod component2() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        PaymentMethod paymentMethod = this.method;
        int i5 = i3 + 49;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return paymentMethod;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productCode;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productType;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.planName;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.amountToCharge;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PaymentConfirmationArgs copy(PaymentOperation operation, PaymentMethod method, String title, String accountId, String productId, String productCode, String productType, String planName, String amountToCharge, String cashBack, List<FibrePackageDetail> selectedAddons, int existingAddonsCount, boolean isFamilyShare) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(operation, "");
        Intrinsics.checkNotNullParameter(method, "");
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(amountToCharge, "");
        Intrinsics.checkNotNullParameter(selectedAddons, "");
        PaymentConfirmationArgs paymentConfirmationArgs = new PaymentConfirmationArgs(operation, method, title, accountId, productId, productCode, productType, planName, amountToCharge, cashBack, selectedAddons, existingAddonsCount, isFamilyShare);
        int i2 = component2 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return paymentConfirmationArgs;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r6 = r1 + 91;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 = r6 % 128;
        r6 = r6 % 2;
        r1 = r1 + 39;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r6 = 93 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.operation, r6.operation) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.method, r6.method) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.title, r6.title) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 + 105;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.accountId, r6.accountId)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 + 93;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.productId, r6.productId) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.productCode, r6.productCode) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component2 + 79;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.productType, r6.productType) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 + 81;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.planName, r6.planName) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.amountToCharge, r6.amountToCharge) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.cashBack, r6.cashBack) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component2 + 35;
        com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.selectedAddons, r6.selectedAddons) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        if (r5.existingAddonsCount == r6.existingAddonsCount) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if (r5.isFamilyShare == r6.isFamilyShare) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentConfirmationArgs.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.operation.hashCode();
        int iHashCode2 = this.method.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.accountId;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.productId;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.productCode;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        int iHashCode8 = this.productType.hashCode();
        String str4 = this.planName;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        int iHashCode10 = this.amountToCharge.hashCode();
        String str5 = this.cashBack;
        if (str5 == null) {
            i = component3 + 45;
        } else {
            iHashCode4 = str5.hashCode();
            i = component3 + 29;
        }
        component2 = i % 128;
        int i3 = i % 2;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + this.selectedAddons.hashCode()) * 31) + Integer.hashCode(this.existingAddonsCount)) * 31) + Boolean.hashCode(this.isFamilyShare);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaymentConfirmationArgs(operation=" + this.operation + ", method=" + this.method + ", title=" + this.title + ", accountId=" + this.accountId + ", productId=" + this.productId + ", productCode=" + this.productCode + ", productType=" + this.productType + ", planName=" + this.planName + ", amountToCharge=" + this.amountToCharge + ", cashBack=" + this.cashBack + ", selectedAddons=" + this.selectedAddons + ", existingAddonsCount=" + this.existingAddonsCount + ", isFamilyShare=" + this.isFamilyShare + ")";
        int i2 = component2 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(this.operation, flags);
        dest.writeParcelable(this.method, flags);
        dest.writeString(this.title);
        dest.writeString(this.accountId);
        dest.writeString(this.productId);
        dest.writeString(this.productCode);
        dest.writeString(this.productType);
        dest.writeString(this.planName);
        dest.writeString(this.amountToCharge);
        dest.writeString(this.cashBack);
        List<FibrePackageDetail> list = this.selectedAddons;
        dest.writeInt(list.size());
        Iterator<FibrePackageDetail> it = list.iterator();
        int i4 = component2 + 49;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.existingAddonsCount);
        dest.writeInt(this.isFamilyShare ? 1 : 0);
    }
}
