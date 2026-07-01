package com.huawei.digitalpayment.consumer.sfcui.bonga.transfer;

import android.os.Process;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import com.safaricom.designsystem.components.radio.IRadioButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJr\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÇ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010*\u001a\u00020+H×\u0001J\t\u0010,\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001a¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/TransferBongaState;", "", "recipientMsisdn", "", "errorMessage", "pinTypeOptions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/ValidatePinType;", "selectedPinType", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", PESActivity.EXTRA_BONGA_POINTS, "bongaPointsValid", "", "bongaPointsError", "recipientMsisdnValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/safaricom/designsystem/components/radio/IRadioButton;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getRecipientMsisdn", "()Ljava/lang/String;", "getErrorMessage", "getPinTypeOptions", "()Ljava/util/List;", "getSelectedPinType", "()Lcom/safaricom/designsystem/components/radio/IRadioButton;", "getBongaPoints", "getBongaPointsValid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBongaPointsError", "getRecipientMsisdnValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/safaricom/designsystem/components/radio/IRadioButton;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/TransferBongaState;", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransferBongaState {
    public static final int $stable = 8;
    public static int ShareDataUIState = 0;
    public static int component1 = 0;
    private static int getShareableDataState = 51 % 128;
    private static int getSponsorBeneficiariesState = 0;
    private static int hashCode = 1;
    private static int toString;
    private final String component2;
    private final String component3;
    private final String component4;
    private final IRadioButton copy;
    private final Boolean copydefault;
    private final Boolean equals;
    private final List<ValidatePinType> getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public TransferBongaState(String str, String str2, List<ValidatePinType> list, IRadioButton iRadioButton, String str3, Boolean bool, String str4, Boolean bool2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component4 = str;
        this.getRequestBeneficiariesState = str2;
        this.getAsAtTimestamp = list;
        this.copy = iRadioButton;
        this.component3 = str3;
        this.copydefault = bool;
        this.component2 = str4;
        this.equals = bool2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransferBongaState(String str, String str2, List list, IRadioButton iRadioButton, String str3, Boolean bool, String str4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        List listListOf;
        Boolean bool3;
        String str7;
        if ((i & 1) != 0) {
            int i2 = hashCode + 77;
            getSponsorBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                bool.hashCode();
                throw null;
            }
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            int i3 = hashCode + 85;
            getSponsorBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 2;
            } else {
                int i5 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            listListOf = CollectionsKt.listOf((Object[]) new ValidatePinType[]{new ValidatePinType("M-PESA PIN", "M-PESA PIN", true), new ValidatePinType("Service PIN", "Service PIN", true)});
            int i6 = getSponsorBeneficiariesState + 21;
            hashCode = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            listListOf = list;
        }
        IRadioButton iRadioButton2 = (i & 8) != 0 ? (IRadioButton) CollectionsKt.firstOrNull(listListOf) : iRadioButton;
        String str8 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            int i8 = getSponsorBeneficiariesState + 49;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i & 64) != 0) {
            int i10 = hashCode + 17;
            getSponsorBeneficiariesState = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        this(str5, str6, listListOf, iRadioButton2, str8, bool3, str7, (i & 128) == 0 ? bool2 : null);
    }

    public final String getRecipientMsisdn() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 119;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 41;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = hashCode + 125;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 105;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<ValidatePinType> getPinTypeOptions() {
        int i = 2 % 2;
        int i2 = hashCode + 125;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        List<ValidatePinType> list = this.getAsAtTimestamp;
        int i5 = i3 + 69;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final IRadioButton getSelectedPinType() {
        int i = 2 % 2;
        int i2 = hashCode + 27;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        IRadioButton iRadioButton = this.copy;
        int i5 = i3 + 83;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return iRadioButton;
    }

    public final String getBongaPoints() {
        int i = 2 % 2;
        int i2 = hashCode + 67;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 121;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final Boolean getBongaPointsValid() {
        int i = 2 % 2;
        int i2 = hashCode + 33;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getBongaPointsError() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 5;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 21;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Boolean getRecipientMsisdnValid() {
        int i = 2 % 2;
        int i2 = hashCode + 63;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.equals;
        int i4 = i3 + 45;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    static {
        if (51 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TransferBongaState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TransferBongaState copy$default(TransferBongaState transferBongaState, String str, String str2, List list, IRadioButton iRadioButton, String str3, Boolean bool, String str4, Boolean bool2, int i, Object obj) {
        String str5;
        List list2;
        IRadioButton iRadioButton2;
        String str6;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str5 = transferBongaState.component4;
            int i3 = getSponsorBeneficiariesState + 85;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str5 = str;
        }
        String str7 = (i & 2) != 0 ? transferBongaState.getRequestBeneficiariesState : str2;
        if ((i & 4) != 0) {
            int i5 = getSponsorBeneficiariesState + 91;
            hashCode = i5 % 128;
            if (i5 % 2 == 0) {
                list2 = transferBongaState.getAsAtTimestamp;
                int i6 = 97 / 0;
            } else {
                list2 = transferBongaState.getAsAtTimestamp;
            }
        } else {
            list2 = list;
        }
        if ((i & 8) != 0) {
            int i7 = getSponsorBeneficiariesState + 7;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
            iRadioButton2 = transferBongaState.copy;
        } else {
            iRadioButton2 = iRadioButton;
        }
        if ((i & 16) != 0) {
            int i9 = getSponsorBeneficiariesState + 55;
            hashCode = i9 % 128;
            int i10 = i9 % 2;
            str6 = transferBongaState.component3;
        } else {
            str6 = str3;
        }
        return transferBongaState.copy(str5, str7, list2, iRadioButton2, str6, (i & 32) != 0 ? transferBongaState.copydefault : bool, (i & 64) != 0 ? transferBongaState.component2 : str4, (i & 128) != 0 ? transferBongaState.equals : bool2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 21;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 95;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = hashCode + 121;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 121;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<ValidatePinType> component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 115;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        throw null;
    }

    public final IRadioButton component4() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 117;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        IRadioButton iRadioButton = this.copy;
        int i5 = i2 + 51;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return iRadioButton;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 75;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 35;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    public final Boolean component6() {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.copydefault;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return bool;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 39;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 107;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean component8() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 43;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.equals;
        int i4 = i2 + 79;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final TransferBongaState copy(String recipientMsisdn, String errorMessage, List<ValidatePinType> pinTypeOptions, IRadioButton selectedPinType, String bongaPoints, Boolean bongaPointsValid, String bongaPointsError, Boolean recipientMsisdnValid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pinTypeOptions, "");
        TransferBongaState transferBongaState = new TransferBongaState(recipientMsisdn, errorMessage, pinTypeOptions, selectedPinType, bongaPoints, bongaPointsValid, bongaPointsError, recipientMsisdnValid);
        int i2 = getSponsorBeneficiariesState + 55;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return transferBongaState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferBongaState)) {
            return false;
        }
        TransferBongaState transferBongaState = (TransferBongaState) other;
        if (!Intrinsics.areEqual(this.component4, transferBongaState.component4)) {
            int i2 = getSponsorBeneficiariesState + 123;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, transferBongaState.getRequestBeneficiariesState)) {
            int i4 = getSponsorBeneficiariesState + 61;
            hashCode = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, transferBongaState.getAsAtTimestamp)) {
            int i5 = hashCode + 25;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copy, transferBongaState.copy)) {
            if (!Intrinsics.areEqual(this.component3, transferBongaState.component3)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, transferBongaState.copydefault)) {
                return Intrinsics.areEqual(this.component2, transferBongaState.component2) && Intrinsics.areEqual(this.equals, transferBongaState.equals);
            }
            int i7 = getSponsorBeneficiariesState + 117;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = getSponsorBeneficiariesState;
        int i10 = i9 + 49;
        hashCode = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 35;
        hashCode = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.component4;
        if (str == null) {
            int i2 = getSponsorBeneficiariesState + 113;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = hashCode + 7;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.getRequestBeneficiariesState;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.getAsAtTimestamp.hashCode();
        IRadioButton iRadioButton = this.copy;
        if (iRadioButton == null) {
            int i6 = getSponsorBeneficiariesState + 59;
            hashCode = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = iRadioButton.hashCode();
        }
        String str3 = this.component3;
        if (str3 == null) {
            int i7 = hashCode + 49;
            getSponsorBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        Boolean bool = this.copydefault;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str4 = this.component2;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Boolean bool2 = this.equals;
        return (((((((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferBongaState(recipientMsisdn=" + this.component4 + ", errorMessage=" + this.getRequestBeneficiariesState + ", pinTypeOptions=" + this.getAsAtTimestamp + ", selectedPinType=" + this.copy + ", bongaPoints=" + this.component3 + ", bongaPointsValid=" + this.copydefault + ", bongaPointsError=" + this.component2 + ", recipientMsisdnValid=" + this.equals + ")";
        int i2 = getSponsorBeneficiariesState + 67;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static int ShareDataUIState() {
        int i = ShareDataUIState;
        int i2 = i % 8291592;
        ShareDataUIState = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int iMyPid = Process.myPid();
        component1 = iMyPid;
        return iMyPid;
    }
}
