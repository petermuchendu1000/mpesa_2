package com.huawei.digitalpayment.consumer.sfcui.bonga.donatebonga;

import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaDonationOrganization;
import com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.ValidatePinType;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÇ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010&\u001a\u00020'H×\u0001J\t\u0010(\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/donatebonga/DonateBongaState;", "", "bongaAmount", "", "selectedOrganization", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDonationOrganization;", "pinTypeOptions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/ValidatePinType;", "selectedPinType", "amountHasError", "", PESActivity.EXTRA_BONGA_BALANCE_KSH, "bongaBalancePoints", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDonationOrganization;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/ValidatePinType;ZLjava/lang/String;Ljava/lang/String;)V", "getBongaAmount", "()Ljava/lang/String;", "getSelectedOrganization", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDonationOrganization;", "getPinTypeOptions", "()Ljava/util/List;", "getSelectedPinType", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/ValidatePinType;", "getAmountHasError", "()Z", "getBongaBalanceKsh", "getBongaBalancePoints", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DonateBongaState {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 35 % 128;
    private static int getShareableDataState = 1;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final List<ValidatePinType> component3;
    private final ValidatePinType copy;
    private final String copydefault;
    private final BongaDonationOrganization getRequestBeneficiariesState;

    public DonateBongaState(String str, BongaDonationOrganization bongaDonationOrganization, List<ValidatePinType> list, ValidatePinType validatePinType, boolean z, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = str;
        this.getRequestBeneficiariesState = bongaDonationOrganization;
        this.component3 = list;
        this.copy = validatePinType;
        this.component1 = z;
        this.copydefault = str2;
        this.component2 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DonateBongaState(String str, BongaDonationOrganization bongaDonationOrganization, List list, ValidatePinType validatePinType, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        BongaDonationOrganization bongaDonationOrganization2;
        String str5;
        String str6 = "";
        if ((i & 1) != 0) {
            int i2 = component4 + 39;
            int i3 = i2 % 128;
            getShareableDataState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str4 = "";
        } else {
            str4 = str;
        }
        ValidatePinType validatePinType2 = null;
        if ((i & 2) != 0) {
            int i7 = 2 % 2;
            bongaDonationOrganization2 = null;
        } else {
            bongaDonationOrganization2 = bongaDonationOrganization;
        }
        boolean z2 = true;
        List listListOf = (i & 4) != 0 ? CollectionsKt.listOf((Object[]) new ValidatePinType[]{new ValidatePinType("M-PESA PIN", "M-PESA PIN", true), new ValidatePinType("Service PIN", "Service PIN", true)}) : list;
        if ((i & 8) != 0) {
            int i8 = component4 + 63;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            validatePinType2 = validatePinType;
        }
        if ((i & 16) != 0) {
            int i10 = component4 + 7;
            getShareableDataState = i10 % 128;
            if (i10 % 2 != 0) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            int i11 = getShareableDataState + 21;
            component4 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 39 / 0;
            }
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 64) != 0) {
            int i13 = getShareableDataState;
            int i14 = i13 + 85;
            component4 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 81;
            component4 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        } else {
            str6 = str3;
        }
        this(str4, bongaDonationOrganization2, listListOf, validatePinType2, z2, str5, str6);
    }

    public final String getBongaAmount() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 13;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BongaDonationOrganization getSelectedOrganization() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 95;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        BongaDonationOrganization bongaDonationOrganization = this.getRequestBeneficiariesState;
        int i5 = i2 + 39;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return bongaDonationOrganization;
        }
        throw null;
    }

    public final List<ValidatePinType> getPinTypeOptions() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 95;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<ValidatePinType> list = this.component3;
        int i4 = i2 + 121;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final ValidatePinType getSelectedPinType() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        ValidatePinType validatePinType = this.copy;
        int i5 = i3 + 11;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return validatePinType;
    }

    public final boolean getAmountHasError() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 113;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String getBongaBalanceKsh() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 29;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 45;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBongaBalancePoints() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 85;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 59;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 35 % 2;
    }

    public DonateBongaState() {
        this(null, null, null, null, false, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DonateBongaState copy$default(DonateBongaState donateBongaState, String str, BongaDonationOrganization bongaDonationOrganization, List list, ValidatePinType validatePinType, boolean z, String str2, String str3, int i, Object obj) {
        boolean z2;
        String str4;
        String str5;
        int i2 = 2 % 2;
        int i3 = component4 + 21;
        int i4 = i3 % 128;
        getShareableDataState = i4;
        String str6 = (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : donateBongaState.ShareDataUIState;
        BongaDonationOrganization bongaDonationOrganization2 = (i & 2) != 0 ? donateBongaState.getRequestBeneficiariesState : bongaDonationOrganization;
        List list2 = (i & 4) != 0 ? donateBongaState.component3 : list;
        ValidatePinType validatePinType2 = (i & 8) != 0 ? donateBongaState.copy : validatePinType;
        if ((i & 16) != 0) {
            int i5 = i4 + 99;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                z2 = donateBongaState.component1;
                int i6 = 47 / 0;
            } else {
                z2 = donateBongaState.component1;
            }
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            int i7 = i4 + 45;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            str4 = donateBongaState.copydefault;
        } else {
            str4 = str2;
        }
        if ((i & 64) != 0) {
            str5 = donateBongaState.component2;
            int i9 = component4 + 15;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str5 = str3;
        }
        return donateBongaState.copy(str6, bongaDonationOrganization2, list2, validatePinType2, z2, str4, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 57;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 69;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BongaDonationOrganization component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 47;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        BongaDonationOrganization bongaDonationOrganization = this.getRequestBeneficiariesState;
        int i4 = i3 + 81;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return bongaDonationOrganization;
    }

    public final List<ValidatePinType> component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 125;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        List<ValidatePinType> list = this.component3;
        int i5 = i2 + 11;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final ValidatePinType component4() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 9;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        ValidatePinType validatePinType = this.copy;
        int i5 = i3 + 79;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return validatePinType;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 51;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component1;
        int i5 = i2 + 21;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 93;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 103;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component4 + 75;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 37;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DonateBongaState copy(String bongaAmount, BongaDonationOrganization selectedOrganization, List<ValidatePinType> pinTypeOptions, ValidatePinType selectedPinType, boolean amountHasError, String bongaBalanceKsh, String bongaBalancePoints) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bongaAmount, "");
        Intrinsics.checkNotNullParameter(pinTypeOptions, "");
        Intrinsics.checkNotNullParameter(bongaBalanceKsh, "");
        Intrinsics.checkNotNullParameter(bongaBalancePoints, "");
        DonateBongaState donateBongaState = new DonateBongaState(bongaAmount, selectedOrganization, pinTypeOptions, selectedPinType, amountHasError, bongaBalanceKsh, bongaBalancePoints);
        int i2 = getShareableDataState + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return donateBongaState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonateBongaState)) {
            return false;
        }
        DonateBongaState donateBongaState = (DonateBongaState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, donateBongaState.ShareDataUIState) || !Intrinsics.areEqual(this.getRequestBeneficiariesState, donateBongaState.getRequestBeneficiariesState) || !Intrinsics.areEqual(this.component3, donateBongaState.component3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, donateBongaState.copy)) {
            int i2 = component4 + 41;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.component1 != donateBongaState.component1) {
            int i4 = component4 + 63;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, donateBongaState.copydefault)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, donateBongaState.component2)) {
            return true;
        }
        int i6 = getShareableDataState + 33;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.ShareDataUIState.hashCode();
        BongaDonationOrganization bongaDonationOrganization = this.getRequestBeneficiariesState;
        if (bongaDonationOrganization == null) {
            int i2 = component4 + 69;
            getShareableDataState = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = bongaDonationOrganization.hashCode();
        }
        int iHashCode3 = this.component3.hashCode();
        ValidatePinType validatePinType = this.copy;
        int iHashCode4 = (((((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + (validatePinType != null ? validatePinType.hashCode() : 0)) * 31) + Boolean.hashCode(this.component1)) * 31) + this.copydefault.hashCode()) * 31) + this.component2.hashCode();
        int i3 = component4 + 57;
        getShareableDataState = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DonateBongaState(bongaAmount=" + this.ShareDataUIState + ", selectedOrganization=" + this.getRequestBeneficiariesState + ", pinTypeOptions=" + this.component3 + ", selectedPinType=" + this.copy + ", amountHasError=" + this.component1 + ", bongaBalanceKsh=" + this.copydefault + ", bongaBalancePoints=" + this.component2 + ")";
        int i2 = getShareableDataState + 123;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
