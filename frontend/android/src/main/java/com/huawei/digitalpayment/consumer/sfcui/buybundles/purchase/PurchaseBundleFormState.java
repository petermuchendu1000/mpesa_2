package com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010%\u001a\u00020\fHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÇ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010,\u001a\u00020\nH×\u0001J\t\u0010-\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001f¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleFormState;", "", "selectedRecipientType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "recipientTypes", "", "ownMsisdn", "", "recipientMsisdn", "recipientMsisdnError", "", "selectedPaymentType", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "paymentTypes", "isValid", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/safaricom/designsystem/components/payment/PaymentOption;Ljava/util/List;Z)V", "getSelectedRecipientType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "getRecipientTypes", "()Ljava/util/List;", "getOwnMsisdn", "()Ljava/lang/String;", "getRecipientMsisdn", "getRecipientMsisdnError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedPaymentType", "()Lcom/safaricom/designsystem/components/payment/PaymentOption;", "getPaymentTypes", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/safaricom/designsystem/components/payment/PaymentOption;Ljava/util/List;Z)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleFormState;", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseBundleFormState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int component4 = 11 % 128;
    private static int getRequestBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private final Integer ShareDataUIState;
    private final String component1;
    private final List<PaymentOption> component2;
    private final boolean component3;
    private final PaymentOption copy;
    private final String copydefault;
    private final IRecipientType equals;
    private final List<IRecipientType> getAsAtTimestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseBundleFormState(IRecipientType iRecipientType, List<? extends IRecipientType> list, String str, String str2, Integer num, PaymentOption paymentOption, List<? extends PaymentOption> list2, boolean z) {
        Intrinsics.checkNotNullParameter(iRecipientType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.equals = iRecipientType;
        this.getAsAtTimestamp = list;
        this.copydefault = str;
        this.component1 = str2;
        this.ShareDataUIState = num;
        this.copy = paymentOption;
        this.component2 = list2;
        this.component3 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseBundleFormState(IRecipientType iRecipientType, List list, String str, String str2, Integer num, PaymentOption paymentOption, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        RecipientType recipientType;
        List listEmptyList;
        String str3;
        String str4;
        List listEmptyList2;
        boolean z2;
        if ((i & 1) != 0) {
            recipientType = RecipientType.SELF;
            int i2 = ArtificialStackFrames + 99;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            recipientType = iRecipientType;
        }
        if ((i & 2) != 0) {
            int i5 = ArtificialStackFrames + 7;
            getShareableDataState = i5 % 128;
            if (i5 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        if ((i & 4) != 0) {
            int i6 = ArtificialStackFrames + 83;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 8) != 0) {
            int i9 = getShareableDataState + 7;
            ArtificialStackFrames = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str4 = null;
        } else {
            str4 = str2;
        }
        Integer num2 = (i & 16) == 0 ? num : null;
        PaymentOption.UNDEFINED undefined = (i & 32) != 0 ? PaymentOption.UNDEFINED.INSTANCE : paymentOption;
        if ((i & 64) != 0) {
            listEmptyList2 = CollectionsKt.emptyList();
            int i12 = 2 % 2;
        } else {
            listEmptyList2 = list2;
        }
        if ((i & 128) != 0) {
            int i13 = getShareableDataState + 51;
            ArtificialStackFrames = i13 % 128;
            int i14 = i13 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(recipientType, listEmptyList, str3, str4, num2, undefined, listEmptyList2, z2);
    }

    public final IRecipientType getSelectedRecipientType() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 41;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        IRecipientType iRecipientType = this.equals;
        int i5 = i3 + 71;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return iRecipientType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<IRecipientType> getRecipientTypes() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 125;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<IRecipientType> list = this.getAsAtTimestamp;
        int i4 = i3 + 29;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final String getOwnMsisdn() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 5;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    public final String getRecipientMsisdn() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 81;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 37;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getRecipientMsisdnError() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 7;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return num;
    }

    public final PaymentOption getSelectedPaymentType() {
        PaymentOption paymentOption;
        int i = 2 % 2;
        int i2 = getShareableDataState + 59;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            paymentOption = this.copy;
            int i4 = 89 / 0;
        } else {
            paymentOption = this.copy;
        }
        int i5 = i3 + 89;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return paymentOption;
    }

    public final List<PaymentOption> getPaymentTypes() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 107;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 71;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.component3;
        int i4 = i3 + 7;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        int i = 11 % 2;
    }

    public PurchaseBundleFormState() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PurchaseBundleFormState copy$default(PurchaseBundleFormState purchaseBundleFormState, IRecipientType iRecipientType, List list, String str, String str2, Integer num, PaymentOption paymentOption, List list2, boolean z, int i, Object obj) {
        List list3;
        PaymentOption paymentOption2;
        List list4;
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 85;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        IRecipientType iRecipientType2 = (i & 1) != 0 ? purchaseBundleFormState.equals : iRecipientType;
        if ((i & 2) != 0) {
            int i6 = i3 + 37;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            list3 = purchaseBundleFormState.getAsAtTimestamp;
        } else {
            list3 = list;
        }
        String str3 = (i & 4) != 0 ? purchaseBundleFormState.copydefault : str;
        String str4 = (i & 8) != 0 ? purchaseBundleFormState.component1 : str2;
        Integer num2 = (i & 16) != 0 ? purchaseBundleFormState.ShareDataUIState : num;
        if ((i & 32) != 0) {
            paymentOption2 = purchaseBundleFormState.copy;
            int i8 = i3 + 69;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
        } else {
            paymentOption2 = paymentOption;
        }
        if ((i & 64) != 0) {
            list4 = purchaseBundleFormState.component2;
            int i10 = ArtificialStackFrames + 95;
            getShareableDataState = i10 % 128;
            int i11 = i10 % 2;
        } else {
            list4 = list2;
        }
        return purchaseBundleFormState.copy(iRecipientType2, list3, str3, str4, num2, paymentOption2, list4, (i & 128) != 0 ? purchaseBundleFormState.component3 : z);
    }

    public final IRecipientType component1() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 61;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        IRecipientType iRecipientType = this.equals;
        int i5 = i2 + 101;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return iRecipientType;
        }
        throw null;
    }

    public final List<IRecipientType> component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 13;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        List<IRecipientType> list = this.getAsAtTimestamp;
        int i5 = i3 + 47;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 55;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 11;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 97;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 83;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 27;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.ShareDataUIState;
        int i5 = i2 + 101;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final PaymentOption component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 5;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        PaymentOption paymentOption = this.copy;
        int i5 = i3 + 101;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return paymentOption;
    }

    public final List<PaymentOption> component7() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 99;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        List<PaymentOption> list = this.component2;
        int i5 = i3 + 11;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 31;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component3;
        int i4 = i3 + 17;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return z;
    }

    public final PurchaseBundleFormState copy(IRecipientType selectedRecipientType, List<? extends IRecipientType> recipientTypes, String ownMsisdn, String recipientMsisdn, Integer recipientMsisdnError, PaymentOption selectedPaymentType, List<? extends PaymentOption> paymentTypes, boolean isValid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedRecipientType, "");
        Intrinsics.checkNotNullParameter(recipientTypes, "");
        Intrinsics.checkNotNullParameter(ownMsisdn, "");
        Intrinsics.checkNotNullParameter(selectedPaymentType, "");
        Intrinsics.checkNotNullParameter(paymentTypes, "");
        PurchaseBundleFormState purchaseBundleFormState = new PurchaseBundleFormState(selectedRecipientType, recipientTypes, ownMsisdn, recipientMsisdn, recipientMsisdnError, selectedPaymentType, paymentTypes, isValid);
        int i2 = getShareableDataState + 31;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return purchaseBundleFormState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ArtificialStackFrames + 31;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PurchaseBundleFormState)) {
            return false;
        }
        PurchaseBundleFormState purchaseBundleFormState = (PurchaseBundleFormState) other;
        if (!Intrinsics.areEqual(this.equals, purchaseBundleFormState.equals)) {
            int i4 = getShareableDataState + 97;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, purchaseBundleFormState.getAsAtTimestamp)) {
            int i6 = ArtificialStackFrames + 125;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, purchaseBundleFormState.copydefault)) {
            int i8 = ArtificialStackFrames + 81;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, purchaseBundleFormState.component1)) {
            int i10 = getShareableDataState + 67;
            ArtificialStackFrames = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, purchaseBundleFormState.ShareDataUIState)) {
            int i12 = ArtificialStackFrames + 47;
            getShareableDataState = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, purchaseBundleFormState.copy) || !Intrinsics.areEqual(this.component2, purchaseBundleFormState.component2)) {
            return false;
        }
        if (this.component3 == purchaseBundleFormState.component3) {
            return true;
        }
        int i14 = ArtificialStackFrames + 57;
        getShareableDataState = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r1 r3 r4 r5
  0x003e: PHI (r1v22 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r1 r3 r4
  0x003c: PHI (r1v6 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState.ArtificialStackFrames
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState.getShareableDataState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L26
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType r1 = r8.equals
            int r1 = r1.hashCode()
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType> r3 = r8.getAsAtTimestamp
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.copydefault
            int r4 = r4.hashCode()
            java.lang.String r5 = r8.component1
            if (r5 != 0) goto L3e
            goto L3c
        L26:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType r1 = r8.equals
            int r1 = r1.hashCode()
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType> r3 = r8.getAsAtTimestamp
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.copydefault
            int r4 = r4.hashCode()
            java.lang.String r5 = r8.component1
            if (r5 != 0) goto L3e
        L3c:
            r5 = r2
            goto L42
        L3e:
            int r5 = r5.hashCode()
        L42:
            java.lang.Integer r6 = r8.ShareDataUIState
            if (r6 != 0) goto L47
            goto L54
        L47:
            int r2 = r6.hashCode()
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState.ArtificialStackFrames
            int r6 = r6 + 49
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState.getShareableDataState = r7
            int r6 = r6 % r0
        L54:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            com.safaricom.designsystem.components.payment.PaymentOption r0 = r8.copy
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.safaricom.designsystem.components.payment.PaymentOption> r0 = r8.component2
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r8.component3
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseBundleFormState(selectedRecipientType=" + this.equals + ", recipientTypes=" + this.getAsAtTimestamp + ", ownMsisdn=" + this.copydefault + ", recipientMsisdn=" + this.component1 + ", recipientMsisdnError=" + this.ShareDataUIState + ", selectedPaymentType=" + this.copy + ", paymentTypes=" + this.component2 + ", isValid=" + this.component3 + ")";
        int i2 = getShareableDataState + 123;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
