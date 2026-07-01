package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.state;

import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model.ProductPackage;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J|\u0010+\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010/\u001a\u00020\u0003H×\u0001J\t\u00100\u001a\u00020\u000bH×\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001c¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/state/PurchaseNewspaperFormState;", "", "formError", "", "selectedPaymentType", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "paymentTypes", "", "isValid", "", "selectedPackageType", "", "subscriptionOptions", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/ProductPackage;", "selectedOptionId", "airtimeBalance", "mpesaBalance", "<init>", "(Ljava/lang/Integer;Lcom/safaricom/designsystem/components/payment/PaymentOption;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getFormError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedPaymentType", "()Lcom/safaricom/designsystem/components/payment/PaymentOption;", "getPaymentTypes", "()Ljava/util/List;", "()Z", "getSelectedPackageType", "()Ljava/lang/String;", "getSubscriptionOptions", "getSelectedOptionId", "()I", "getAirtimeBalance", "getMpesaBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Lcom/safaricom/designsystem/components/payment/PaymentOption;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/state/PurchaseNewspaperFormState;", "equals", "other", "hashCode", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseNewspaperFormState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int equals = 0;
    private static int hashCode = 71 % 128;
    private static int toString;
    private final String ShareDataUIState;
    private final List<PaymentOption> component1;
    private final Integer component2;
    private final boolean component3;
    private final List<ProductPackage> component4;
    private final PaymentOption copy;
    private final String copydefault;
    private final String getAsAtTimestamp;
    private final int getRequestBeneficiariesState;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseNewspaperFormState(Integer num, PaymentOption paymentOption, List<? extends PaymentOption> list, boolean z, String str, List<ProductPackage> list2, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.component2 = num;
        this.copy = paymentOption;
        this.component1 = list;
        this.component3 = z;
        this.getAsAtTimestamp = str;
        this.component4 = list2;
        this.getRequestBeneficiariesState = i;
        this.ShareDataUIState = str2;
        this.copydefault = str3;
    }

    public final Integer getFormError() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 27;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PaymentOption getSelectedPaymentType() {
        int i = 2 % 2;
        int i2 = toString + 65;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        PaymentOption paymentOption = this.copy;
        int i5 = i3 + 25;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return paymentOption;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseNewspaperFormState(Integer num, PaymentOption paymentOption, List list, boolean z, String str, List list2, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        PaymentOption.MPESA mpesa;
        List listEmptyList;
        String str4;
        String str5;
        if ((i2 & 1) != 0) {
            int i3 = toString + 15;
            ArtificialStackFrames = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 2) != 0) {
            int i6 = ArtificialStackFrames + 79;
            toString = i6 % 128;
            int i7 = i6 % 2;
            mpesa = PaymentOption.MPESA.INSTANCE;
        } else {
            mpesa = paymentOption;
        }
        if ((i2 & 4) != 0) {
            int i8 = toString + 63;
            ArtificialStackFrames = i8 % 128;
            if (i8 % 2 == 0) {
                CollectionsKt.emptyList();
                str.hashCode();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            int i9 = 2 % 2;
            str4 = null;
        } else {
            str4 = str;
        }
        List listEmptyList2 = (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2;
        int i10 = (i2 & 64) != 0 ? -1 : i;
        if ((i2 & 128) != 0) {
            int i11 = 2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        this(num2, mpesa, listEmptyList, z2, str4, listEmptyList2, i10, str5, (i2 & 256) == 0 ? str3 : null);
    }

    public final List<PaymentOption> getPaymentTypes() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 39;
        toString = i3 % 128;
        int i4 = i3 % 2;
        List<PaymentOption> list = this.component1;
        int i5 = i2 + 103;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 99;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSelectedPackageType() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 125;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.getAsAtTimestamp;
        int i4 = i3 + 89;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<ProductPackage> getSubscriptionOptions() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 89;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        List<ProductPackage> list = this.component4;
        int i5 = i3 + 35;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final int getSelectedOptionId() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 31;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getRequestBeneficiariesState;
        int i6 = i2 + 51;
        ArtificialStackFrames = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getAirtimeBalance() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 101;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMpesaBalance() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 75;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 57;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    static {
        int i = 71 % 2;
    }

    public PurchaseNewspaperFormState() {
        this(null, null, null, false, null, null, 0, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PurchaseNewspaperFormState copy$default(PurchaseNewspaperFormState purchaseNewspaperFormState, Integer num, PaymentOption paymentOption, List list, boolean z, String str, List list2, int i, String str2, String str3, int i2, Object obj) {
        PaymentOption paymentOption2;
        List list3;
        String str4;
        int i3 = 2 % 2;
        Integer num2 = (i2 & 1) != 0 ? purchaseNewspaperFormState.component2 : num;
        if ((i2 & 2) != 0) {
            paymentOption2 = purchaseNewspaperFormState.copy;
            int i4 = toString + 41;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
        } else {
            paymentOption2 = paymentOption;
        }
        if ((i2 & 4) != 0) {
            int i6 = toString + 33;
            ArtificialStackFrames = i6 % 128;
            if (i6 % 2 == 0) {
                List<PaymentOption> list4 = purchaseNewspaperFormState.component1;
                throw null;
            }
            list3 = purchaseNewspaperFormState.component1;
        } else {
            list3 = list;
        }
        boolean z2 = (i2 & 8) != 0 ? purchaseNewspaperFormState.component3 : z;
        String str5 = (i2 & 16) != 0 ? purchaseNewspaperFormState.getAsAtTimestamp : str;
        List list5 = (i2 & 32) != 0 ? purchaseNewspaperFormState.component4 : list2;
        int i7 = (i2 & 64) != 0 ? purchaseNewspaperFormState.getRequestBeneficiariesState : i;
        String str6 = (i2 & 128) != 0 ? purchaseNewspaperFormState.ShareDataUIState : str2;
        if ((i2 & 256) != 0) {
            int i8 = ArtificialStackFrames + 93;
            toString = i8 % 128;
            if (i8 % 2 != 0) {
                str4 = purchaseNewspaperFormState.copydefault;
                int i9 = 6 / 0;
            } else {
                str4 = purchaseNewspaperFormState.copydefault;
            }
        } else {
            str4 = str3;
        }
        return purchaseNewspaperFormState.copy(num2, paymentOption2, list3, z2, str5, list5, i7, str6, str4);
    }

    public final Integer component1() {
        Integer num;
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 43;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.component2;
            int i4 = 15 / 0;
        } else {
            num = this.component2;
        }
        int i5 = i2 + 13;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return num;
    }

    public final PaymentOption component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 29;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<PaymentOption> component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 29;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<PaymentOption> list = this.component1;
        int i4 = i2 + 9;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return list;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 63;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 85;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 61;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 17;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final List<ProductPackage> component6() {
        int i = 2 % 2;
        int i2 = toString + 73;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        List<ProductPackage> list = this.component4;
        int i5 = i3 + 113;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 99;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        int i5 = this.getRequestBeneficiariesState;
        int i6 = i3 + 57;
        ArtificialStackFrames = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 97;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 83;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 93;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 49;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final PurchaseNewspaperFormState copy(Integer formError, PaymentOption selectedPaymentType, List<? extends PaymentOption> paymentTypes, boolean isValid, String selectedPackageType, List<ProductPackage> subscriptionOptions, int selectedOptionId, String airtimeBalance, String mpesaBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedPaymentType, "");
        Intrinsics.checkNotNullParameter(paymentTypes, "");
        Intrinsics.checkNotNullParameter(subscriptionOptions, "");
        PurchaseNewspaperFormState purchaseNewspaperFormState = new PurchaseNewspaperFormState(formError, selectedPaymentType, paymentTypes, isValid, selectedPackageType, subscriptionOptions, selectedOptionId, airtimeBalance, mpesaBalance);
        int i2 = toString + 73;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return purchaseNewspaperFormState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ArtificialStackFrames + 51;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PurchaseNewspaperFormState)) {
            return false;
        }
        PurchaseNewspaperFormState purchaseNewspaperFormState = (PurchaseNewspaperFormState) other;
        if (!Intrinsics.areEqual(this.component2, purchaseNewspaperFormState.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, purchaseNewspaperFormState.copy)) {
            int i4 = ArtificialStackFrames + 87;
            toString = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component1, purchaseNewspaperFormState.component1)) {
            int i5 = toString + 31;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.component3 != purchaseNewspaperFormState.component3) {
            return false;
        }
        if (Intrinsics.areEqual(this.getAsAtTimestamp, purchaseNewspaperFormState.getAsAtTimestamp)) {
            if ((!Intrinsics.areEqual(this.component4, purchaseNewspaperFormState.component4)) || this.getRequestBeneficiariesState != purchaseNewspaperFormState.getRequestBeneficiariesState) {
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, purchaseNewspaperFormState.ShareDataUIState)) {
                return Intrinsics.areEqual(this.copydefault, purchaseNewspaperFormState.copydefault);
            }
            int i7 = toString + 105;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = ArtificialStackFrames;
        int i10 = i9 + 71;
        toString = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 55;
        toString = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        Integer num;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 77;
        toString = i2 % 128;
        int iHashCode3 = (i2 % 2 == 0 ? (num = this.component2) != null : (num = this.component2) != null) ? num.hashCode() : 0;
        int iHashCode4 = this.copy.hashCode();
        int iHashCode5 = this.component1.hashCode();
        int iHashCode6 = Boolean.hashCode(this.component3);
        String str = this.getAsAtTimestamp;
        if (str == null) {
            int i3 = toString + 31;
            ArtificialStackFrames = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode7 = this.component4.hashCode();
        int iHashCode8 = Integer.hashCode(this.getRequestBeneficiariesState);
        String str2 = this.ShareDataUIState;
        if (str2 == null) {
            int i5 = toString + 73;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.copydefault;
        return (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseNewspaperFormState(formError=" + this.component2 + ", selectedPaymentType=" + this.copy + ", paymentTypes=" + this.component1 + ", isValid=" + this.component3 + ", selectedPackageType=" + this.getAsAtTimestamp + ", subscriptionOptions=" + this.component4 + ", selectedOptionId=" + this.getRequestBeneficiariesState + ", airtimeBalance=" + this.ShareDataUIState + ", mpesaBalance=" + this.copydefault + ")";
        int i2 = ArtificialStackFrames + 103;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
