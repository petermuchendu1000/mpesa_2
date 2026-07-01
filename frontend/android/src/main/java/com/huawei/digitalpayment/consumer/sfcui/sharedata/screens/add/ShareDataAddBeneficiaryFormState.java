package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add;

import com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u0000J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jg\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010*\u001a\u00020+H×\u0001J\t\u0010,\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001c¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/add/ShareDataAddBeneficiaryFormState;", "", "ownMsisdn", "", "beneficiaryMsisdn", "beneficiaryMsisdnError", "beneficiaryMsisdnFormatted", "amountAllocated", "amountAllocatedError", "selectedShareableDataType", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;", "selectedPinType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "isValid", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;Z)V", "getOwnMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "getBeneficiaryMsisdnError", "getBeneficiaryMsisdnFormatted", "getAmountAllocated", "getAmountAllocatedError", "getSelectedShareableDataType", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;", "getSelectedPinType", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "()Z", "validate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareDataAddBeneficiaryFormState {
    public static final int $stable = 0;
    private static int ArtificialStackFrames = 0;
    public static int copydefault = 866060534;
    private static int getShareableDataState = 1;
    private static int hashCode = 1;
    private static int toString;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final PinValidationType component4;
    private final ShareableDataType copy;
    private final String equals;
    private final boolean getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public ShareDataAddBeneficiaryFormState(String str, String str2, String str3, String str4, String str5, String str6, ShareableDataType shareableDataType, PinValidationType pinValidationType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(shareableDataType, "");
        Intrinsics.checkNotNullParameter(pinValidationType, "");
        this.getRequestBeneficiariesState = str;
        this.component1 = str2;
        this.ShareDataUIState = str3;
        this.equals = str4;
        this.component2 = str5;
        this.component3 = str6;
        this.copy = shareableDataType;
        this.component4 = pinValidationType;
        this.getAsAtTimestamp = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareDataAddBeneficiaryFormState(String str, String str2, String str3, String str4, String str5, String str6, ShareableDataType shareableDataType, PinValidationType pinValidationType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        ShareableDataType shareableDataType2;
        String str9 = "";
        String str10 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = hashCode + 51;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 58 / 0;
            }
            int i4 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        String str11 = null;
        if ((i & 4) != 0) {
            int i5 = hashCode + 95;
            toString = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        String str12 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            int i8 = 2 % 2;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i9 = hashCode + 39;
            toString = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str11 = str6;
        }
        if ((i & 64) != 0) {
            shareableDataType2 = ShareableDataType.Undefined;
            int i11 = hashCode + 19;
            toString = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } else {
            shareableDataType2 = shareableDataType;
        }
        this(str10, str7, str8, str12, str9, str11, shareableDataType2, (i & 128) != 0 ? PinValidationType.MPESA_PIN : pinValidationType, (i & 256) == 0 ? z : false);
    }

    public final String getOwnMsisdn() {
        int i = 2 % 2;
        int i2 = toString + 41;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 63;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = hashCode + 105;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 91;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdnError() {
        int i = 2 % 2;
        int i2 = toString + 125;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String getBeneficiaryMsisdnFormatted() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 111;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 69;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return str;
    }

    public final String getAmountAllocated() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 113;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 125;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountAllocatedError() {
        int i = 2 % 2;
        int i2 = hashCode + 29;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 85;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ShareableDataType getSelectedShareableDataType() {
        int i = 2 % 2;
        int i2 = hashCode + 91;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        ShareableDataType shareableDataType = this.copy;
        int i5 = i3 + 91;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return shareableDataType;
    }

    public final PinValidationType getSelectedPinType() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 101;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        PinValidationType pinValidationType = this.component4;
        int i5 = i2 + 101;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return pinValidationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = hashCode + 59;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i3 + 103;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState validate() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r13.component1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 9
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.toString
            int r1 = r1 + 95
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.hashCode = r4
            int r1 = r1 % r0
            java.lang.String r1 = "Phone number is required"
            goto L33
        L1c:
            java.lang.String r1 = r13.component1
            int r1 = r1.length()
            if (r1 < r2) goto L31
            java.lang.String r1 = r13.component1
            int r1 = r1.length()
            r4 = 13
            if (r1 <= r4) goto L2f
            goto L31
        L2f:
            r4 = r3
            goto L34
        L31:
            java.lang.String r1 = "Please enter a valid phone number"
        L33:
            r4 = r1
        L34:
            java.lang.String r1 = r13.component2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L42
            java.lang.String r1 = "Data amount is required"
        L40:
            r6 = r1
            goto L5b
        L42:
            java.lang.String r1 = r13.component2
            java.lang.Double r1 = kotlin.text.StringsKt.toDoubleOrNull(r1)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "Please enter a valid number"
            goto L40
        L4d:
            double r5 = r1.doubleValue()
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L5a
            java.lang.String r1 = "Amount must be greater than 0"
            goto L40
        L5a:
            r6 = r3
        L5b:
            java.lang.String r1 = r13.component1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r3 = 0
            if (r1 <= 0) goto L9a
            java.lang.String r1 = r13.component2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L9a
            if (r4 != 0) goto L9a
            if (r6 != 0) goto L9a
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.toString
            int r1 = r1 + 25
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.hashCode = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L89
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType r1 = r13.copy
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType r5 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType.Undefined
            r7 = 63
            int r7 = r7 / r3
            if (r1 == r5) goto L9a
            goto L8f
        L89:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType r1 = r13.copy
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType r5 = com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareableDataType.Undefined
            if (r1 == r5) goto L9a
        L8f:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.hashCode
            int r1 = r1 + r2
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.toString = r2
            int r1 = r1 % r0
            r0 = 1
            r9 = r0
            goto L9b
        L9a:
            r9 = r3
        L9b:
            r1 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 219(0xdb, float:3.07E-43)
            r12 = 0
            r0 = r13
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState r0 = copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState.validate():com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.add.ShareDataAddBeneficiaryFormState");
    }

    static {
        int i = 1 + 27;
        ArtificialStackFrames = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ShareDataAddBeneficiaryFormState() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }

    public static ShareDataAddBeneficiaryFormState copy$default(ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormState, String str, String str2, String str3, String str4, String str5, String str6, ShareableDataType shareableDataType, PinValidationType pinValidationType, boolean z, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        ShareableDataType shareableDataType2;
        int i2 = 2 % 2;
        int i3 = hashCode + 3;
        int i4 = i3 % 128;
        toString = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 79;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            str7 = shareDataAddBeneficiaryFormState.getRequestBeneficiariesState;
            int i7 = i4 + 27;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str7 = str;
        }
        String str11 = (i & 2) != 0 ? shareDataAddBeneficiaryFormState.component1 : str2;
        if ((i & 4) != 0) {
            str8 = shareDataAddBeneficiaryFormState.ShareDataUIState;
            int i9 = i4 + 31;
            hashCode = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            str9 = shareDataAddBeneficiaryFormState.equals;
            int i11 = i4 + 37;
            hashCode = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str9 = str4;
        }
        if ((i & 16) != 0) {
            int i13 = i4 + 79;
            hashCode = i13 % 128;
            int i14 = i13 % 2;
            str10 = shareDataAddBeneficiaryFormState.component2;
        } else {
            str10 = str5;
        }
        String str12 = (i & 32) != 0 ? shareDataAddBeneficiaryFormState.component3 : str6;
        if ((i & 64) != 0) {
            int i15 = hashCode + 29;
            toString = i15 % 128;
            int i16 = i15 % 2;
            shareableDataType2 = shareDataAddBeneficiaryFormState.copy;
        } else {
            shareableDataType2 = shareableDataType;
        }
        ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormStateCopy = shareDataAddBeneficiaryFormState.copy(str7, str11, str8, str9, str10, str12, shareableDataType2, (i & 128) != 0 ? shareDataAddBeneficiaryFormState.component4 : pinValidationType, (i & 256) != 0 ? shareDataAddBeneficiaryFormState.getAsAtTimestamp : z);
        int i17 = toString + 119;
        hashCode = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 31 / 0;
        }
        return shareDataAddBeneficiaryFormStateCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = hashCode + 3;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i3 + 69;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 53;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 117;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = hashCode + 119;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.equals;
        int i5 = i3 + 51;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 55;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 13 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 57;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = toString + 3;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final ShareableDataType component7() {
        int i = 2 % 2;
        int i2 = hashCode + 31;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        ShareableDataType shareableDataType = this.copy;
        int i5 = i3 + 105;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return shareableDataType;
    }

    public final PinValidationType component8() {
        int i = 2 % 2;
        int i2 = hashCode + 7;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        PinValidationType pinValidationType = this.component4;
        int i5 = i3 + 47;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return pinValidationType;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ShareDataAddBeneficiaryFormState copy(String ownMsisdn, String beneficiaryMsisdn, String beneficiaryMsisdnError, String beneficiaryMsisdnFormatted, String amountAllocated, String amountAllocatedError, ShareableDataType selectedShareableDataType, PinValidationType selectedPinType, boolean isValid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ownMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdnFormatted, "");
        Intrinsics.checkNotNullParameter(amountAllocated, "");
        Intrinsics.checkNotNullParameter(selectedShareableDataType, "");
        Intrinsics.checkNotNullParameter(selectedPinType, "");
        ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormState = new ShareDataAddBeneficiaryFormState(ownMsisdn, beneficiaryMsisdn, beneficiaryMsisdnError, beneficiaryMsisdnFormatted, amountAllocated, amountAllocatedError, selectedShareableDataType, selectedPinType, isValid);
        int i2 = toString + 39;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return shareDataAddBeneficiaryFormState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareDataAddBeneficiaryFormState)) {
            return false;
        }
        ShareDataAddBeneficiaryFormState shareDataAddBeneficiaryFormState = (ShareDataAddBeneficiaryFormState) other;
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, shareDataAddBeneficiaryFormState.getRequestBeneficiariesState)) {
            int i2 = toString + 45;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, shareDataAddBeneficiaryFormState.component1)) {
            int i4 = toString + 87;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, shareDataAddBeneficiaryFormState.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, shareDataAddBeneficiaryFormState.equals)) {
            int i6 = hashCode + 25;
            toString = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, shareDataAddBeneficiaryFormState.component2)) {
            int i8 = toString + 71;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, shareDataAddBeneficiaryFormState.component3)) {
            return false;
        }
        if (this.copy != shareDataAddBeneficiaryFormState.copy) {
            int i10 = toString + 23;
            hashCode = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.component4 == shareDataAddBeneficiaryFormState.component4) {
            return this.getAsAtTimestamp == shareDataAddBeneficiaryFormState.getAsAtTimestamp;
        }
        int i12 = hashCode + 119;
        toString = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode3 = this.component1.hashCode();
        String str = this.ShareDataUIState;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = toString + 109;
            hashCode = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = hashCode + 121;
            toString = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode5 = this.equals.hashCode();
        int iHashCode6 = this.component2.hashCode();
        String str2 = this.component3;
        if (str2 == null) {
            int i5 = toString + 61;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iHashCode4 = str2.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode4) * 31) + this.copy.hashCode()) * 31) + this.component4.hashCode()) * 31) + Boolean.hashCode(this.getAsAtTimestamp);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShareDataAddBeneficiaryFormState(ownMsisdn=" + this.getRequestBeneficiariesState + ", beneficiaryMsisdn=" + this.component1 + ", beneficiaryMsisdnError=" + this.ShareDataUIState + ", beneficiaryMsisdnFormatted=" + this.equals + ", amountAllocated=" + this.component2 + ", amountAllocatedError=" + this.component3 + ", selectedShareableDataType=" + this.copy + ", selectedPinType=" + this.component4 + ", isValid=" + this.getAsAtTimestamp + ")";
        int i2 = toString + 115;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
