package com.huawei.digitalpayment.consumer.sfcui.components.bundles;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010)\u001a\u00020\fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÇ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00101\u001a\u00020\nH×\u0001J\t\u00102\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleFormState;", "", "selectedRecipientType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "recipientTypes", "", "ownMsisdn", "", "recipientMsisdn", "recipientMsisdnError", "", "selectedPaymentType", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "paymentTypes", "isValid", "", "selectedPinType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/safaricom/designsystem/components/payment/PaymentOption;Ljava/util/List;ZLcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;)V", "getSelectedRecipientType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "getRecipientTypes", "()Ljava/util/List;", "getOwnMsisdn", "()Ljava/lang/String;", "getRecipientMsisdn", "getRecipientMsisdnError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedPaymentType", "()Lcom/safaricom/designsystem/components/payment/PaymentOption;", "getPaymentTypes", "()Z", "getSelectedPinType", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/safaricom/designsystem/components/payment/PaymentOption;Ljava/util/List;ZLcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;)Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleFormState;", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseBundleFormState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int equals = 0;
    private static int getSponsorBeneficiariesState = 1;
    private static int toString = 1;
    private final Integer ShareDataUIState;
    private final String component1;
    private final List<PaymentOption> component2;
    private final boolean component3;
    private final PaymentOption component4;
    private final PinValidationType copy;
    private final String copydefault;
    private final IRecipientType getAsAtTimestamp;
    private final List<IRecipientType> getRequestBeneficiariesState;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseBundleFormState(IRecipientType iRecipientType, List<? extends IRecipientType> list, String str, String str2, Integer num, PaymentOption paymentOption, List<? extends PaymentOption> list2, boolean z, PinValidationType pinValidationType) {
        Intrinsics.checkNotNullParameter(iRecipientType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(pinValidationType, "");
        this.getAsAtTimestamp = iRecipientType;
        this.getRequestBeneficiariesState = list;
        this.component1 = str;
        this.copydefault = str2;
        this.ShareDataUIState = num;
        this.component4 = paymentOption;
        this.component2 = list2;
        this.component3 = z;
        this.copy = pinValidationType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseBundleFormState(IRecipientType iRecipientType, List list, String str, String str2, Integer num, PaymentOption paymentOption, List list2, boolean z, PinValidationType pinValidationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        RecipientType recipientType;
        PinValidationType pinValidationType2;
        if ((i & 1) != 0) {
            recipientType = RecipientType.SELF;
            int i2 = 2 % 2;
        } else {
            recipientType = iRecipientType;
        }
        boolean z2 = false;
        List listListOf = (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new RecipientType[]{RecipientType.SELF, RecipientType.OTHER}) : list;
        String str3 = (i & 4) != 0 ? "" : str;
        Integer num2 = null;
        String str4 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            int i3 = toString + 117;
            ArtificialStackFrames = i3 % 128;
            if (i3 % 2 != 0) {
                num2.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
        } else {
            num2 = num;
        }
        PaymentOption.UNDEFINED undefined = (i & 32) != 0 ? PaymentOption.UNDEFINED.INSTANCE : paymentOption;
        List listEmptyList = (i & 64) != 0 ? CollectionsKt.emptyList() : list2;
        if ((i & 128) != 0) {
            int i5 = ArtificialStackFrames + 73;
            toString = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            z2 = z;
        }
        if ((i & 256) != 0) {
            pinValidationType2 = PinValidationType.MPESA_PIN;
            int i8 = 2 % 2;
        } else {
            pinValidationType2 = pinValidationType;
        }
        this(recipientType, listListOf, str3, str4, num2, undefined, listEmptyList, z2, pinValidationType2);
    }

    public final IRecipientType getSelectedRecipientType() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 53;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        IRecipientType iRecipientType = this.getAsAtTimestamp;
        int i5 = i3 + 91;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return iRecipientType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<IRecipientType> getRecipientTypes() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 83;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        List<IRecipientType> list = this.getRequestBeneficiariesState;
        int i5 = i2 + 3;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOwnMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 71;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component1;
            int i4 = 30 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 59;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String getRecipientMsisdn() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 67;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 71;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getRecipientMsisdnError() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 97;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PaymentOption getSelectedPaymentType() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 7;
        toString = i3 % 128;
        int i4 = i3 % 2;
        PaymentOption paymentOption = this.component4;
        int i5 = i2 + 37;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return paymentOption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<PaymentOption> getPaymentTypes() {
        int i = 2 % 2;
        int i2 = toString + 69;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 79;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 89;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PinValidationType getSelectedPinType() {
        int i = 2 % 2;
        int i2 = toString + 79;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        PinValidationType pinValidationType = this.copy;
        int i5 = i3 + 55;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return pinValidationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 21;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public PurchaseBundleFormState() {
        this(null, null, null, null, null, null, null, false, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PurchaseBundleFormState copy$default(PurchaseBundleFormState purchaseBundleFormState, IRecipientType iRecipientType, List list, String str, String str2, Integer num, PaymentOption paymentOption, List list2, boolean z, PinValidationType pinValidationType, int i, Object obj) {
        List list3;
        String str3;
        String str4;
        Integer num2;
        int i2 = 2 % 2;
        IRecipientType iRecipientType2 = (i & 1) != 0 ? purchaseBundleFormState.getAsAtTimestamp : iRecipientType;
        if ((i & 2) != 0) {
            int i3 = toString + 49;
            ArtificialStackFrames = i3 % 128;
            if (i3 % 2 != 0) {
                List<IRecipientType> list4 = purchaseBundleFormState.getRequestBeneficiariesState;
                throw null;
            }
            list3 = purchaseBundleFormState.getRequestBeneficiariesState;
        } else {
            list3 = list;
        }
        if ((i & 4) != 0) {
            int i4 = toString + 25;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            str3 = purchaseBundleFormState.component1;
        } else {
            str3 = str;
        }
        if ((i & 8) != 0) {
            int i6 = ArtificialStackFrames + 23;
            toString = i6 % 128;
            int i7 = i6 % 2;
            str4 = purchaseBundleFormState.copydefault;
        } else {
            str4 = str2;
        }
        if ((i & 16) != 0) {
            int i8 = ArtificialStackFrames + 43;
            toString = i8 % 128;
            int i9 = i8 % 2;
            num2 = purchaseBundleFormState.ShareDataUIState;
            if (i9 == 0) {
                int i10 = 47 / 0;
            }
        } else {
            num2 = num;
        }
        return purchaseBundleFormState.copy(iRecipientType2, list3, str3, str4, num2, (i & 32) != 0 ? purchaseBundleFormState.component4 : paymentOption, (i & 64) != 0 ? purchaseBundleFormState.component2 : list2, (i & 128) != 0 ? purchaseBundleFormState.component3 : z, (i & 256) != 0 ? purchaseBundleFormState.copy : pinValidationType);
    }

    public final IRecipientType component1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        IRecipientType iRecipientType = this.getAsAtTimestamp;
        int i5 = i3 + 119;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return iRecipientType;
    }

    public final List<IRecipientType> component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 69;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<IRecipientType> list = this.getRequestBeneficiariesState;
        int i4 = i3 + 105;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 59;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 63;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = toString + 53;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 115;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return num;
    }

    public final PaymentOption component6() {
        int i = 2 % 2;
        int i2 = toString + 87;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        PaymentOption paymentOption = this.component4;
        int i5 = i3 + 5;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return paymentOption;
        }
        throw null;
    }

    public final List<PaymentOption> component7() {
        int i = 2 % 2;
        int i2 = toString + 99;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<PaymentOption> list = this.component2;
        int i4 = i3 + 57;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return list;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 77;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 19;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PinValidationType component9() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 77;
        toString = i3 % 128;
        int i4 = i3 % 2;
        PinValidationType pinValidationType = this.copy;
        int i5 = i2 + 13;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return pinValidationType;
        }
        throw null;
    }

    public final PurchaseBundleFormState copy(IRecipientType selectedRecipientType, List<? extends IRecipientType> recipientTypes, String ownMsisdn, String recipientMsisdn, Integer recipientMsisdnError, PaymentOption selectedPaymentType, List<? extends PaymentOption> paymentTypes, boolean isValid, PinValidationType selectedPinType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedRecipientType, "");
        Intrinsics.checkNotNullParameter(recipientTypes, "");
        Intrinsics.checkNotNullParameter(ownMsisdn, "");
        Intrinsics.checkNotNullParameter(selectedPaymentType, "");
        Intrinsics.checkNotNullParameter(paymentTypes, "");
        Intrinsics.checkNotNullParameter(selectedPinType, "");
        PurchaseBundleFormState purchaseBundleFormState = new PurchaseBundleFormState(selectedRecipientType, recipientTypes, ownMsisdn, recipientMsisdn, recipientMsisdnError, selectedPaymentType, paymentTypes, isValid, selectedPinType);
        int i2 = ArtificialStackFrames + 69;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return purchaseBundleFormState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = toString + 25;
            ArtificialStackFrames = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PurchaseBundleFormState)) {
            return false;
        }
        PurchaseBundleFormState purchaseBundleFormState = (PurchaseBundleFormState) other;
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, purchaseBundleFormState.getAsAtTimestamp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, purchaseBundleFormState.getRequestBeneficiariesState)) {
            int i4 = ArtificialStackFrames + 9;
            toString = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component1, purchaseBundleFormState.component1)) {
            int i5 = toString + 81;
            ArtificialStackFrames = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.copydefault, purchaseBundleFormState.copydefault) || !Intrinsics.areEqual(this.ShareDataUIState, purchaseBundleFormState.ShareDataUIState) || !Intrinsics.areEqual(this.component4, purchaseBundleFormState.component4) || !Intrinsics.areEqual(this.component2, purchaseBundleFormState.component2)) {
            return false;
        }
        if (this.component3 != purchaseBundleFormState.component3) {
            int i6 = ArtificialStackFrames + 101;
            toString = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.copy == purchaseBundleFormState.copy) {
            return true;
        }
        int i8 = toString + 59;
        ArtificialStackFrames = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.getAsAtTimestamp.hashCode();
        int iHashCode3 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode4 = this.component1.hashCode();
        String str = this.copydefault;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = toString + 31;
            int i3 = i2 % 128;
            ArtificialStackFrames = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 51;
            toString = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.ShareDataUIState;
        if (num == null) {
            int i7 = toString + 67;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode5 = num.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + this.component4.hashCode()) * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.component3)) * 31) + this.copy.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseBundleFormState(selectedRecipientType=" + this.getAsAtTimestamp + ", recipientTypes=" + this.getRequestBeneficiariesState + ", ownMsisdn=" + this.component1 + ", recipientMsisdn=" + this.copydefault + ", recipientMsisdnError=" + this.ShareDataUIState + ", selectedPaymentType=" + this.component4 + ", paymentTypes=" + this.component2 + ", isValid=" + this.component3 + ", selectedPinType=" + this.copy + ")";
        int i2 = toString + 7;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
