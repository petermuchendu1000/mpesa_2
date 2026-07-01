package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.fragment;

import com.huawei.digitalpayment.consumer.sfcui.pesa.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0015HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003JÍ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÇ\u0001J\u0013\u0010C\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010E\u001a\u00020FH×\u0001J\t\u0010G\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010'R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b¨\u0006H"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/fragment/PayBillTopSectionState;", "", "payBillNumber", "", "payBillLabel", "payBillPlaceholder", "accountNumber", "accountLabel", "accountPlaceholder", "accountSupportingText", "amount", "amountLabel", "amountPlaceholder", "amountSuffix", "userMessage", "isUserMessageError", "", "amountHelper", "amountError", "showPaymentMethods", "selectedPaymentMethod", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;", "mpesaBalance", "bongaBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;Ljava/lang/String;Ljava/lang/String;)V", "getPayBillNumber", "()Ljava/lang/String;", "getPayBillLabel", "getPayBillPlaceholder", "getAccountNumber", "getAccountLabel", "getAccountPlaceholder", "getAccountSupportingText", "getAmount", "getAmountLabel", "getAmountPlaceholder", "getAmountSuffix", "getUserMessage", "()Z", "getAmountHelper", "getAmountError", "getShowPaymentMethods", "getSelectedPaymentMethod", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;", "getMpesaBalance", "getBongaBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayBillTopSectionState {
    public static final int $stable = 0;

    private static int f2743c = 0;

    private static int f2744d = 1;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
    private static int invoke = 1;
    private final String ArtificialStackFrames;
    private final String CoroutineDebuggingKt;
    private final String ShareDataUIState;
    private final PaymentMethod accessartificialFrame;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final String copy;
    private final String copydefault;
    private final String coroutineBoundary;
    private final boolean coroutineCreation;
    private final String equals;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final boolean getSponsorBeneficiariesState;
    private final String hashCode;
    private final String toString;

    public PayBillTopSectionState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, boolean z2, PaymentMethod paymentMethod, String str15, String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.hashCode = str;
        this.getShareableDataState = str2;
        this.coroutineBoundary = str3;
        this.component1 = str4;
        this.ShareDataUIState = str5;
        this.copydefault = str6;
        this.component2 = str7;
        this.component3 = str8;
        this.getAsAtTimestamp = str9;
        this.equals = str10;
        this.getRequestBeneficiariesState = str11;
        this.CoroutineDebuggingKt = str12;
        this.getSponsorBeneficiariesState = z;
        this.component4 = str13;
        this.copy = str14;
        this.coroutineCreation = z2;
        this.accessartificialFrame = paymentMethod;
        this.ArtificialStackFrames = str15;
        this.toString = str16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PayBillTopSectionState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, boolean z2, PaymentMethod paymentMethod, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        boolean z3;
        if ((i & 1) != 0) {
            int i2 = f2743c + 55;
            f2744d = i2 % 128;
            int i3 = i2 % 2;
            str17 = "";
        } else {
            str17 = str;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i4 = f2743c + 107;
            f2744d = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str18 = "";
        } else {
            str18 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = f2743c + 95;
            f2744d = i5 % 128;
            int i6 = i5 % 2;
            str19 = "";
        } else {
            str19 = str3;
        }
        String str24 = (i & 8) != 0 ? "" : str4;
        String str25 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i7 = f2743c + 107;
            f2744d = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str20 = "";
        } else {
            str20 = str6;
        }
        String str26 = (i & 64) != 0 ? null : str7;
        String str27 = (i & 128) != 0 ? "" : str8;
        String str28 = (i & 256) != 0 ? "" : str9;
        if ((i & 512) != 0) {
            int i10 = f2744d + 17;
            f2743c = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str21 = "";
        } else {
            str21 = str10;
        }
        if ((i & 1024) != 0) {
            int i13 = f2744d;
            int i14 = i13 + 15;
            f2743c = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 19;
            f2743c = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
            str22 = "Ksh";
        } else {
            str22 = str11;
        }
        String str29 = (i & 2048) != 0 ? null : str12;
        if ((i & 4096) != 0) {
            int i19 = f2744d + 67;
            str23 = "";
            f2743c = i19 % 128;
            z3 = i19 % 2 != 0;
        } else {
            str23 = "";
            z3 = z;
        }
        this(str17, str18, str19, str24, str25, str20, str26, str27, str28, str21, str22, str29, z3, (i & 8192) != 0 ? str23 : str13, (i & 16384) != 0 ? null : str14, (i & 32768) == 0 ? z2 : false, (i & 65536) != 0 ? PaymentMethod.MPESA : paymentMethod, (i & 131072) != 0 ? "0" : str15, (i & 262144) == 0 ? str16 : "0");
    }

    public final String getPayBillNumber() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 53;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hashCode;
        int i5 = i2 + 85;
        f2743c = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPayBillLabel() {
        int i = 2 % 2;
        int i2 = f2743c + 87;
        int i3 = i2 % 128;
        f2744d = i3;
        int i4 = i2 % 2;
        String str = this.getShareableDataState;
        int i5 = i3 + 37;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPayBillPlaceholder() {
        int i = 2 % 2;
        int i2 = f2743c + 29;
        f2744d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.coroutineBoundary;
        }
        throw null;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 121;
        f2743c = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 39;
        f2743c = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAccountLabel() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 3;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 107;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountPlaceholder() {
        String str;
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 11;
        f2744d = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.copydefault;
            int i4 = 29 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 61;
        f2744d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccountSupportingText() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 65;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 27;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 47;
        f2743c = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component3;
            int i4 = 44 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 3;
        f2743c = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmountLabel() {
        String str;
        int i = 2 % 2;
        int i2 = f2744d + 75;
        int i3 = i2 % 128;
        f2743c = i3;
        if (i2 % 2 != 0) {
            str = this.getAsAtTimestamp;
            int i4 = 65 / 0;
        } else {
            str = this.getAsAtTimestamp;
        }
        int i5 = i3 + 5;
        f2744d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountPlaceholder() {
        int i = 2 % 2;
        int i2 = f2743c + 11;
        int i3 = i2 % 128;
        f2744d = i3;
        int i4 = i2 % 2;
        String str = this.equals;
        int i5 = i3 + 11;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountSuffix() {
        int i = 2 % 2;
        int i2 = f2743c + 121;
        int i3 = i2 % 128;
        f2744d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i3 + 57;
        f2743c = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUserMessage() {
        int i = 2 % 2;
        int i2 = f2743c + 115;
        f2744d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.CoroutineDebuggingKt;
        }
        throw null;
    }

    public final boolean isUserMessageError() {
        int i = 2 % 2;
        int i2 = f2743c + 111;
        int i3 = i2 % 128;
        f2744d = i3;
        int i4 = i2 % 2;
        boolean z = this.getSponsorBeneficiariesState;
        int i5 = i3 + 41;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getAmountHelper() {
        String str;
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 115;
        f2743c = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component4;
            int i4 = 34 / 0;
        } else {
            str = this.component4;
        }
        int i5 = i2 + 103;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountError() {
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 83;
        f2744d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 19;
        f2744d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getShowPaymentMethods() {
        int i = 2 % 2;
        int i2 = f2743c + 7;
        int i3 = i2 % 128;
        f2744d = i3;
        int i4 = i2 % 2;
        boolean z = this.coroutineCreation;
        int i5 = i3 + 7;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PaymentMethod getSelectedPaymentMethod() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 111;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        PaymentMethod paymentMethod = this.accessartificialFrame;
        int i5 = i2 + 25;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return paymentMethod;
    }

    public final String getMpesaBalance() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 111;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ArtificialStackFrames;
        int i5 = i2 + 117;
        f2743c = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getBongaBalance() {
        int i = 2 % 2;
        int i2 = f2743c + 99;
        f2744d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.toString;
        }
        throw null;
    }

    static {
        int i = 1 + 17;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public PayBillTopSectionState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, 524287, null);
    }

    public static PayBillTopSectionState copy$default(PayBillTopSectionState payBillTopSectionState, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, boolean z2, PaymentMethod paymentMethod, String str15, String str16, int i, Object obj) {
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z3;
        String str21;
        boolean z4;
        PaymentMethod paymentMethod2;
        String str22;
        int i2 = 2 % 2;
        int i3 = f2744d + 95;
        int i4 = i3 % 128;
        f2743c = i4;
        int i5 = i3 % 2;
        String str23 = (i & 1) != 0 ? payBillTopSectionState.hashCode : str;
        if ((i & 2) != 0) {
            int i6 = i4 + 75;
            f2744d = i6 % 128;
            int i7 = i6 % 2;
            str17 = payBillTopSectionState.getShareableDataState;
        } else {
            str17 = str2;
        }
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i8 = i4 + 77;
            f2744d = i8 % 128;
            if (i8 % 2 == 0) {
                String str24 = payBillTopSectionState.coroutineBoundary;
                obj2.hashCode();
                throw null;
            }
            str18 = payBillTopSectionState.coroutineBoundary;
        } else {
            str18 = str3;
        }
        String str25 = (i & 8) != 0 ? payBillTopSectionState.component1 : str4;
        if ((i & 16) != 0) {
            int i9 = f2744d + 61;
            int i10 = i9 % 128;
            f2743c = i10;
            if (i9 % 2 != 0) {
                String str26 = payBillTopSectionState.ShareDataUIState;
                obj2.hashCode();
                throw null;
            }
            str19 = payBillTopSectionState.ShareDataUIState;
            int i11 = i10 + 91;
            f2744d = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str19 = str5;
        }
        String str27 = (i & 32) != 0 ? payBillTopSectionState.copydefault : str6;
        if ((i & 64) != 0) {
            int i13 = f2743c + 91;
            f2744d = i13 % 128;
            int i14 = i13 % 2;
            str20 = payBillTopSectionState.component2;
        } else {
            str20 = str7;
        }
        String str28 = (i & 128) != 0 ? payBillTopSectionState.component3 : str8;
        String str29 = (i & 256) != 0 ? payBillTopSectionState.getAsAtTimestamp : str9;
        String str30 = (i & 512) != 0 ? payBillTopSectionState.equals : str10;
        String str31 = (i & 1024) != 0 ? payBillTopSectionState.getRequestBeneficiariesState : str11;
        String str32 = (i & 2048) != 0 ? payBillTopSectionState.CoroutineDebuggingKt : str12;
        if ((i & 4096) != 0) {
            boolean z5 = payBillTopSectionState.getSponsorBeneficiariesState;
            int i15 = f2743c + 101;
            z3 = z5;
            f2744d = i15 % 128;
            int i16 = i15 % 2;
        } else {
            z3 = z;
        }
        String str33 = (i & 8192) != 0 ? payBillTopSectionState.component4 : str13;
        String str34 = (i & 16384) != 0 ? payBillTopSectionState.copy : str14;
        boolean z6 = (i & 32768) != 0 ? payBillTopSectionState.coroutineCreation : z2;
        if ((i & 65536) != 0) {
            z4 = z6;
            int i17 = f2744d + 83;
            str21 = str33;
            f2743c = i17 % 128;
            int i18 = i17 % 2;
            paymentMethod2 = payBillTopSectionState.accessartificialFrame;
        } else {
            str21 = str33;
            z4 = z6;
            paymentMethod2 = paymentMethod;
        }
        String str35 = (131072 & i) != 0 ? payBillTopSectionState.ArtificialStackFrames : str15;
        if ((i & 262144) != 0) {
            String str36 = payBillTopSectionState.toString;
            int i19 = f2743c + 81;
            str22 = str36;
            f2744d = i19 % 128;
            int i20 = i19 % 2;
        } else {
            str22 = str16;
        }
        return payBillTopSectionState.copy(str23, str17, str18, str25, str19, str27, str20, str28, str29, str30, str31, str32, z3, str21, str34, z4, paymentMethod2, str35, str22);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 7;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hashCode;
        int i5 = i2 + 71;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = f2743c + 85;
        f2744d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = f2744d + 117;
        f2743c = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getRequestBeneficiariesState;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 85;
        f2744d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.CoroutineDebuggingKt;
        int i4 = i2 + 9;
        f2744d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean component13() {
        int i = 2 % 2;
        int i2 = f2743c + 11;
        int i3 = i2 % 128;
        f2744d = i3;
        int i4 = i2 % 2;
        boolean z = this.getSponsorBeneficiariesState;
        int i5 = i3 + 51;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = f2743c + 13;
        f2744d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component4;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 67;
        f2744d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i2 + 29;
        f2744d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean component16() {
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 101;
        f2744d = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.coroutineCreation;
        int i5 = i2 + 101;
        f2744d = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PaymentMethod component17() {
        int i = 2 % 2;
        int i2 = f2744d + 51;
        int i3 = i2 % 128;
        f2743c = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PaymentMethod paymentMethod = this.accessartificialFrame;
        int i4 = i3 + 1;
        f2744d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return paymentMethod;
    }

    public final String component18() {
        String str;
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 95;
        f2744d = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.ArtificialStackFrames;
            int i4 = 17 / 0;
        } else {
            str = this.ArtificialStackFrames;
        }
        int i5 = i2 + 81;
        f2744d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 111;
        f2744d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.toString;
        int i5 = i2 + 35;
        f2744d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 71;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 111;
        f2743c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f2743c + 123;
        int i3 = i2 % 128;
        f2744d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.coroutineBoundary;
        int i4 = i3 + 71;
        f2743c = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = f2744d;
        int i3 = i2 + 47;
        f2743c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 111;
        f2743c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = f2744d + 125;
        int i3 = i2 % 128;
        f2743c = i3;
        if (i2 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 51 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 73;
        f2744d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = f2743c;
        int i3 = i2 + 23;
        f2744d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 13;
        f2744d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = f2744d + 95;
        f2743c = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = f2743c + 41;
        f2744d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f2744d + 47;
        int i3 = i2 % 128;
        f2743c = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.getAsAtTimestamp;
        int i4 = i3 + 111;
        f2744d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final PayBillTopSectionState copy(String payBillNumber, String payBillLabel, String payBillPlaceholder, String accountNumber, String accountLabel, String accountPlaceholder, String accountSupportingText, String amount, String amountLabel, String amountPlaceholder, String amountSuffix, String userMessage, boolean isUserMessageError, String amountHelper, String amountError, boolean showPaymentMethods, PaymentMethod selectedPaymentMethod, String mpesaBalance, String bongaBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payBillNumber, "");
        Intrinsics.checkNotNullParameter(payBillLabel, "");
        Intrinsics.checkNotNullParameter(payBillPlaceholder, "");
        Intrinsics.checkNotNullParameter(accountNumber, "");
        Intrinsics.checkNotNullParameter(accountLabel, "");
        Intrinsics.checkNotNullParameter(accountPlaceholder, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(amountLabel, "");
        Intrinsics.checkNotNullParameter(amountPlaceholder, "");
        Intrinsics.checkNotNullParameter(amountSuffix, "");
        Intrinsics.checkNotNullParameter(amountHelper, "");
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "");
        Intrinsics.checkNotNullParameter(mpesaBalance, "");
        Intrinsics.checkNotNullParameter(bongaBalance, "");
        PayBillTopSectionState payBillTopSectionState = new PayBillTopSectionState(payBillNumber, payBillLabel, payBillPlaceholder, accountNumber, accountLabel, accountPlaceholder, accountSupportingText, amount, amountLabel, amountPlaceholder, amountSuffix, userMessage, isUserMessageError, amountHelper, amountError, showPaymentMethods, selectedPaymentMethod, mpesaBalance, bongaBalance);
        int i2 = f2743c + 109;
        f2744d = i2 % 128;
        int i3 = i2 % 2;
        return payBillTopSectionState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayBillTopSectionState)) {
            return false;
        }
        PayBillTopSectionState payBillTopSectionState = (PayBillTopSectionState) other;
        if (!Intrinsics.areEqual(this.hashCode, payBillTopSectionState.hashCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getShareableDataState, payBillTopSectionState.getShareableDataState)) {
            int i2 = f2743c + 87;
            f2744d = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.coroutineBoundary, payBillTopSectionState.coroutineBoundary)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, payBillTopSectionState.component1)) {
            int i4 = f2743c + 63;
            f2744d = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, payBillTopSectionState.ShareDataUIState)) {
            int i5 = f2744d + 111;
            f2743c = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.copydefault, payBillTopSectionState.copydefault) || !Intrinsics.areEqual(this.component2, payBillTopSectionState.component2) || !Intrinsics.areEqual(this.component3, payBillTopSectionState.component3) || !Intrinsics.areEqual(this.getAsAtTimestamp, payBillTopSectionState.getAsAtTimestamp) || !Intrinsics.areEqual(this.equals, payBillTopSectionState.equals)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, payBillTopSectionState.getRequestBeneficiariesState)) {
            int i6 = f2743c + 41;
            f2744d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.CoroutineDebuggingKt, payBillTopSectionState.CoroutineDebuggingKt)) {
            return false;
        }
        if (this.getSponsorBeneficiariesState != payBillTopSectionState.getSponsorBeneficiariesState) {
            int i8 = f2744d + 59;
            f2743c = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, payBillTopSectionState.component4) || !Intrinsics.areEqual(this.copy, payBillTopSectionState.copy)) {
            return false;
        }
        if (this.coroutineCreation != payBillTopSectionState.coroutineCreation) {
            int i10 = f2743c + 23;
            f2744d = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.accessartificialFrame == payBillTopSectionState.accessartificialFrame) {
            return Intrinsics.areEqual(this.ArtificialStackFrames, payBillTopSectionState.ArtificialStackFrames) && Intrinsics.areEqual(this.toString, payBillTopSectionState.toString);
        }
        int i12 = f2744d + 101;
        f2743c = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 75 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int i2 = 2 % 2;
        int iHashCode3 = this.hashCode.hashCode();
        int iHashCode4 = this.getShareableDataState.hashCode();
        int iHashCode5 = this.coroutineBoundary.hashCode();
        int iHashCode6 = this.component1.hashCode();
        int iHashCode7 = this.ShareDataUIState.hashCode();
        int iHashCode8 = this.copydefault.hashCode();
        String str = this.component2;
        if (str == null) {
            int i3 = f2744d + 89;
            f2743c = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode9 = this.component3.hashCode();
        int iHashCode10 = this.getAsAtTimestamp.hashCode();
        int iHashCode11 = this.equals.hashCode();
        int iHashCode12 = this.getRequestBeneficiariesState.hashCode();
        String str2 = this.CoroutineDebuggingKt;
        if (str2 == null) {
            int i5 = f2743c + 7;
            f2744d = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iHashCode13 = Boolean.hashCode(this.getSponsorBeneficiariesState);
        int iHashCode14 = this.component4.hashCode();
        String str3 = this.copy;
        if (str3 == null) {
            i = 0;
        } else {
            int iHashCode15 = str3.hashCode();
            int i7 = f2744d + 49;
            f2743c = i7 % 128;
            int i8 = i7 % 2;
            i = iHashCode15;
        }
        return (((((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + Boolean.hashCode(this.coroutineCreation)) * 31) + this.accessartificialFrame.hashCode()) * 31) + this.ArtificialStackFrames.hashCode()) * 31) + this.toString.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PayBillTopSectionState(payBillNumber=" + this.hashCode + ", payBillLabel=" + this.getShareableDataState + ", payBillPlaceholder=" + this.coroutineBoundary + ", accountNumber=" + this.component1 + ", accountLabel=" + this.ShareDataUIState + ", accountPlaceholder=" + this.copydefault + ", accountSupportingText=" + this.component2 + ", amount=" + this.component3 + ", amountLabel=" + this.getAsAtTimestamp + ", amountPlaceholder=" + this.equals + ", amountSuffix=" + this.getRequestBeneficiariesState + ", userMessage=" + this.CoroutineDebuggingKt + ", isUserMessageError=" + this.getSponsorBeneficiariesState + ", amountHelper=" + this.component4 + ", amountError=" + this.copy + ", showPaymentMethods=" + this.coroutineCreation + ", selectedPaymentMethod=" + this.accessartificialFrame + ", mpesaBalance=" + this.ArtificialStackFrames + ", bongaBalance=" + this.toString + ")";
        int i2 = f2744d + 75;
        f2743c = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
