package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.fragment;

import com.huawei.digitalpayment.consumer.sfcui.pesa.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J£\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÇ\u0001J\u0013\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00109\u001a\u00020:H×\u0001J\t\u0010;\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006<"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/fragment/BuyGoodsTopSectionState;", "", "tillNumber", "", "tillNumberLabel", "tillNumberPlaceholder", "amount", "amountLabel", "amountPlaceholder", "amountSuffix", "userMessage", "isUserMessageError", "", "amountHelper", "amountError", "showPaymentMethods", "selectedPaymentMethod", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;", "mpesaBalance", "bongaBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;Ljava/lang/String;Ljava/lang/String;)V", "getTillNumber", "()Ljava/lang/String;", "getTillNumberLabel", "getTillNumberPlaceholder", "getAmount", "getAmountLabel", "getAmountPlaceholder", "getAmountSuffix", "getUserMessage", "()Z", "getAmountHelper", "getAmountError", "getShowPaymentMethods", "getSelectedPaymentMethod", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;", "getMpesaBalance", "getBongaBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyGoodsTopSectionState {
    public static final int $stable = 0;
    private static int CoroutineDebuggingKt = 0;
    private static int accessartificialFrame = 0;
    private static int coroutineBoundary = 61 % 128;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 1;
    private final boolean ArtificialStackFrames;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final PaymentMethod component4;
    private final String copy;
    private final String copydefault;
    private final String equals;
    private final boolean getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final String getSponsorBeneficiariesState;
    private final String hashCode;
    private final String toString;

    public BuyGoodsTopSectionState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, PaymentMethod paymentMethod, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.hashCode = str;
        this.getShareableDataState = str2;
        this.toString = str3;
        this.ShareDataUIState = str4;
        this.component2 = str5;
        this.copydefault = str6;
        this.copy = str7;
        this.getSponsorBeneficiariesState = str8;
        this.getAsAtTimestamp = z;
        this.component1 = str9;
        this.component3 = str10;
        this.ArtificialStackFrames = z2;
        this.component4 = paymentMethod;
        this.equals = str11;
        this.getRequestBeneficiariesState = str12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BuyGoodsTopSectionState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, PaymentMethod paymentMethod, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z3;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        String str18;
        String str19 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str13 = "";
        } else {
            str13 = str2;
        }
        if ((i & 4) != 0) {
            int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 9;
            int i4 = i3 % 128;
            accessartificialFrame = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 109;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str14 = "";
        } else {
            str14 = str3;
        }
        String str20 = (i & 8) != 0 ? "" : str4;
        String str21 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i9 = getARTIFICIAL_FRAME_PACKAGE_NAME + 99;
            accessartificialFrame = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            str15 = "";
        } else {
            str15 = str6;
        }
        if ((i & 64) != 0) {
            int i10 = getARTIFICIAL_FRAME_PACKAGE_NAME + 57;
            accessartificialFrame = i10 % 128;
            int i11 = i10 % 2;
            str16 = "Ksh";
        } else {
            str16 = str7;
        }
        if ((i & 128) != 0) {
            int i12 = accessartificialFrame + 39;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            str17 = null;
        } else {
            str17 = str8;
        }
        if ((i & 256) != 0) {
            int i15 = accessartificialFrame + 49;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i15 % 128;
            int i16 = i15 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        String str22 = (i & 512) == 0 ? str9 : "";
        String str23 = (i & 1024) != 0 ? null : str10;
        boolean z4 = (i & 2048) == 0 ? z2 : false;
        if ((i & 4096) != 0) {
            paymentMethod2 = PaymentMethod.MPESA;
            int i17 = 2 % 2;
        } else {
            paymentMethod2 = paymentMethod;
        }
        if ((i & 8192) != 0) {
            int i18 = accessartificialFrame + 41;
            paymentMethod3 = paymentMethod2;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
            str18 = "0";
        } else {
            paymentMethod3 = paymentMethod2;
            str18 = str11;
        }
        this(str19, str13, str14, str20, str21, str15, str16, str17, z3, str22, str23, z4, paymentMethod3, str18, (i & 16384) == 0 ? str12 : "0");
    }

    public final String getTillNumber() {
        String str;
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 121;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.hashCode;
            int i4 = 69 / 0;
        } else {
            str = this.hashCode;
        }
        int i5 = i2 + 27;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTillNumberLabel() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 41;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 33;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTillNumberPlaceholder() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 23;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.toString;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 99;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final String getAmountLabel() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 25;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 41 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 75;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountPlaceholder() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 17;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 27;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountSuffix() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i3 + 9;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUserMessage() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 23;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getSponsorBeneficiariesState;
        int i4 = i2 + 103;
        accessartificialFrame = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean isUserMessageError() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 59;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.getAsAtTimestamp;
        int i4 = i2 + 75;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String getAmountHelper() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 115;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 17;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountError() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 105;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    public final boolean getShowPaymentMethods() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 107;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ArtificialStackFrames;
        int i5 = i2 + 43;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return z;
    }

    public final PaymentMethod getSelectedPaymentMethod() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 99;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMpesaBalance() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 61;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.equals;
        int i4 = i2 + 119;
        accessartificialFrame = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return str;
    }

    public final String getBongaBalance() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 75;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getRequestBeneficiariesState;
        }
        throw null;
    }

    static {
        if (61 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BuyGoodsTopSectionState() {
        this(null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, 32767, null);
    }

    public static BuyGoodsTopSectionState copy$default(BuyGoodsTopSectionState buyGoodsTopSectionState, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, PaymentMethod paymentMethod, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 23;
        int i4 = i3 % 128;
        accessartificialFrame = i4;
        String str17 = (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : buyGoodsTopSectionState.hashCode;
        String str18 = (i & 2) != 0 ? buyGoodsTopSectionState.getShareableDataState : str2;
        if ((i & 4) != 0) {
            str13 = buyGoodsTopSectionState.toString;
            int i5 = i4 + 83;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str13 = str3;
        }
        String str19 = (i & 8) != 0 ? buyGoodsTopSectionState.ShareDataUIState : str4;
        String str20 = (i & 16) != 0 ? buyGoodsTopSectionState.component2 : str5;
        if ((i & 32) != 0) {
            int i7 = i4 + 25;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i7 % 128;
            int i8 = i7 % 2;
            str14 = buyGoodsTopSectionState.copydefault;
        } else {
            str14 = str6;
        }
        if ((i & 64) != 0) {
            int i9 = getARTIFICIAL_FRAME_PACKAGE_NAME + 95;
            accessartificialFrame = i9 % 128;
            if (i9 % 2 != 0) {
                str15 = buyGoodsTopSectionState.copy;
                int i10 = 38 / 0;
            } else {
                str15 = buyGoodsTopSectionState.copy;
            }
        } else {
            str15 = str7;
        }
        String str21 = (i & 128) != 0 ? buyGoodsTopSectionState.getSponsorBeneficiariesState : str8;
        boolean z4 = (i & 256) != 0 ? buyGoodsTopSectionState.getAsAtTimestamp : z;
        String str22 = (i & 512) != 0 ? buyGoodsTopSectionState.component1 : str9;
        if ((i & 1024) != 0) {
            str16 = buyGoodsTopSectionState.component3;
            int i11 = getARTIFICIAL_FRAME_PACKAGE_NAME + 73;
            accessartificialFrame = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str16 = str10;
        }
        if ((i & 2048) != 0) {
            int i13 = getARTIFICIAL_FRAME_PACKAGE_NAME + 119;
            accessartificialFrame = i13 % 128;
            if (i13 % 2 != 0) {
                boolean z5 = buyGoodsTopSectionState.ArtificialStackFrames;
                throw null;
            }
            z3 = buyGoodsTopSectionState.ArtificialStackFrames;
        } else {
            z3 = z2;
        }
        return buyGoodsTopSectionState.copy(str17, str18, str13, str19, str20, str14, str15, str21, z4, str22, str16, z3, (i & 4096) != 0 ? buyGoodsTopSectionState.component4 : paymentMethod, (i & 8192) != 0 ? buyGoodsTopSectionState.equals : str11, (i & 16384) != 0 ? buyGoodsTopSectionState.getRequestBeneficiariesState : str12);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 13;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 39;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 79;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final boolean component12() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 1;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        boolean z = this.ArtificialStackFrames;
        int i5 = i3 + 33;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PaymentMethod component13() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 69;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        PaymentMethod paymentMethod = this.component4;
        int i5 = i3 + 81;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return paymentMethod;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 59;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.equals;
        int i5 = i3 + 17;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component15() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 123;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.getRequestBeneficiariesState;
            int i4 = 97 / 0;
        } else {
            str = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 115;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 37;
        accessartificialFrame = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 71;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 47;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.toString;
        int i5 = i2 + 101;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 99;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 19;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 1;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 9;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 115;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 59;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i3 + 81;
        accessartificialFrame = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 39;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.getSponsorBeneficiariesState;
        int i4 = i3 + 19;
        accessartificialFrame = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 59;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i3 + 49;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return z;
    }

    public final BuyGoodsTopSectionState copy(String tillNumber, String tillNumberLabel, String tillNumberPlaceholder, String amount, String amountLabel, String amountPlaceholder, String amountSuffix, String userMessage, boolean isUserMessageError, String amountHelper, String amountError, boolean showPaymentMethods, PaymentMethod selectedPaymentMethod, String mpesaBalance, String bongaBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tillNumber, "");
        Intrinsics.checkNotNullParameter(tillNumberLabel, "");
        Intrinsics.checkNotNullParameter(tillNumberPlaceholder, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(amountLabel, "");
        Intrinsics.checkNotNullParameter(amountPlaceholder, "");
        Intrinsics.checkNotNullParameter(amountSuffix, "");
        Intrinsics.checkNotNullParameter(amountHelper, "");
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "");
        Intrinsics.checkNotNullParameter(mpesaBalance, "");
        Intrinsics.checkNotNullParameter(bongaBalance, "");
        BuyGoodsTopSectionState buyGoodsTopSectionState = new BuyGoodsTopSectionState(tillNumber, tillNumberLabel, tillNumberPlaceholder, amount, amountLabel, amountPlaceholder, amountSuffix, userMessage, isUserMessageError, amountHelper, amountError, showPaymentMethods, selectedPaymentMethod, mpesaBalance, bongaBalance);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 39;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        return buyGoodsTopSectionState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
            accessartificialFrame = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BuyGoodsTopSectionState)) {
            return false;
        }
        BuyGoodsTopSectionState buyGoodsTopSectionState = (BuyGoodsTopSectionState) other;
        if (!Intrinsics.areEqual(this.hashCode, buyGoodsTopSectionState.hashCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getShareableDataState, buyGoodsTopSectionState.getShareableDataState)) {
            int i4 = accessartificialFrame + 25;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.toString, buyGoodsTopSectionState.toString) || !Intrinsics.areEqual(this.ShareDataUIState, buyGoodsTopSectionState.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, buyGoodsTopSectionState.component2)) {
            int i5 = getARTIFICIAL_FRAME_PACKAGE_NAME + 1;
            accessartificialFrame = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, buyGoodsTopSectionState.copydefault) || !Intrinsics.areEqual(this.copy, buyGoodsTopSectionState.copy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getSponsorBeneficiariesState, buyGoodsTopSectionState.getSponsorBeneficiariesState)) {
            int i7 = getARTIFICIAL_FRAME_PACKAGE_NAME + 107;
            accessartificialFrame = i7 % 128;
            return i7 % 2 != 0;
        }
        if (this.getAsAtTimestamp != buyGoodsTopSectionState.getAsAtTimestamp || !Intrinsics.areEqual(this.component1, buyGoodsTopSectionState.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, buyGoodsTopSectionState.component3)) {
            int i8 = getARTIFICIAL_FRAME_PACKAGE_NAME + 19;
            accessartificialFrame = i8 % 128;
            return i8 % 2 != 0;
        }
        if (this.ArtificialStackFrames != buyGoodsTopSectionState.ArtificialStackFrames) {
            int i9 = accessartificialFrame + 123;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.component4 != buyGoodsTopSectionState.component4) {
            int i11 = accessartificialFrame + 7;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.equals, buyGoodsTopSectionState.equals)) {
            return Intrinsics.areEqual(this.getRequestBeneficiariesState, buyGoodsTopSectionState.getRequestBeneficiariesState);
        }
        int i13 = accessartificialFrame + 111;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 21 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 21;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.hashCode.hashCode();
        int iHashCode3 = this.getShareableDataState.hashCode();
        int iHashCode4 = this.toString.hashCode();
        int iHashCode5 = this.ShareDataUIState.hashCode();
        int iHashCode6 = this.component2.hashCode();
        int iHashCode7 = this.copydefault.hashCode();
        int iHashCode8 = this.copy.hashCode();
        String str = this.getSponsorBeneficiariesState;
        if (str == null) {
            int i4 = accessartificialFrame + 77;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode9 = Boolean.hashCode(this.getAsAtTimestamp);
        int iHashCode10 = this.component1.hashCode();
        String str2 = this.component3;
        return (((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.ArtificialStackFrames)) * 31) + this.component4.hashCode()) * 31) + this.equals.hashCode()) * 31) + this.getRequestBeneficiariesState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuyGoodsTopSectionState(tillNumber=" + this.hashCode + ", tillNumberLabel=" + this.getShareableDataState + ", tillNumberPlaceholder=" + this.toString + ", amount=" + this.ShareDataUIState + ", amountLabel=" + this.component2 + ", amountPlaceholder=" + this.copydefault + ", amountSuffix=" + this.copy + ", userMessage=" + this.getSponsorBeneficiariesState + ", isUserMessageError=" + this.getAsAtTimestamp + ", amountHelper=" + this.component1 + ", amountError=" + this.component3 + ", showPaymentMethods=" + this.ArtificialStackFrames + ", selectedPaymentMethod=" + this.component4 + ", mpesaBalance=" + this.equals + ", bongaBalance=" + this.getRequestBeneficiariesState + ")";
        int i2 = accessartificialFrame + 95;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
