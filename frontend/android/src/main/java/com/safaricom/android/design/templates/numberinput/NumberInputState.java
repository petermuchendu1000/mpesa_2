package com.safaricom.android.design.templates.numberinput;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003JY\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0017¨\u00064"}, d2 = {"Lcom/safaricom/android/design/templates/numberinput/NumberInputState;", "", "uiState", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "numberInputType", "Lcom/safaricom/android/design/templates/numberinput/NumberInputType;", "hintText", "", "helperText", "isEditable", "", GriverMonitorConstants.KEY_IS_LOADING, "showCustomMessage", "customMessage", "<init>", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;Lcom/safaricom/android/design/templates/numberinput/NumberInputType;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "getUiState", "()Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "getNumberInputType", "()Lcom/safaricom/android/design/templates/numberinput/NumberInputType;", "getHintText", "()Ljava/lang/String;", "getHelperText", "()Z", "getShowCustomMessage", "getCustomMessage", "inputText", "getInputText", "isValid", "isNonEmpty", "hasError", "getHasError", "errorMessage", "getErrorMessage", "showError", "getShowError", "canSubmit", "getCanSubmit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcNumberInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberInputState {
    public static final int $stable = 0;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;
    private final NumberInputType component4;
    private final boolean copydefault;
    private final boolean getAsAtTimestamp;
    private final AlphanumericInputUiState getRequestBeneficiariesState;

    public NumberInputState(AlphanumericInputUiState alphanumericInputUiState, NumberInputType numberInputType, String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        Intrinsics.checkNotNullParameter(alphanumericInputUiState, "");
        Intrinsics.checkNotNullParameter(numberInputType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRequestBeneficiariesState = alphanumericInputUiState;
        this.component4 = numberInputType;
        this.component3 = str;
        this.ShareDataUIState = str2;
        this.copydefault = z;
        this.component1 = z2;
        this.getAsAtTimestamp = z3;
        this.component2 = str3;
    }

    public NumberInputState(AlphanumericInputUiState alphanumericInputUiState, NumberInputType numberInputType, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AlphanumericInputUiState(null, false, false, false, null, 31, null) : alphanumericInputUiState, (i & 2) != 0 ? NumberInputType.GENERIC : numberInputType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? z3 : false, (i & 128) == 0 ? str3 : "");
    }

    public final AlphanumericInputUiState getUiState() {
        return this.getRequestBeneficiariesState;
    }

    public final NumberInputType getNumberInputType() {
        return this.component4;
    }

    public final String getHintText() {
        return this.component3;
    }

    public final String getHelperText() {
        return this.ShareDataUIState;
    }

    public final boolean isEditable() {
        return this.copydefault;
    }

    public final boolean isLoading() {
        return this.component1;
    }

    public final boolean getShowCustomMessage() {
        return this.getAsAtTimestamp;
    }

    public final String getCustomMessage() {
        return this.component2;
    }

    public final String getInputText() {
        return this.getRequestBeneficiariesState.getText();
    }

    public final boolean isValid() {
        return this.getRequestBeneficiariesState.isValid();
    }

    public final boolean isNonEmpty() {
        return this.getRequestBeneficiariesState.isNonEmpty();
    }

    public final boolean getHasError() {
        return this.getRequestBeneficiariesState.getHasError();
    }

    public final String getErrorMessage() {
        String errorMessage = this.getRequestBeneficiariesState.getErrorMessage();
        return errorMessage == null ? "" : errorMessage;
    }

    public final boolean getShowError() {
        return getHasError() && !this.component1;
    }

    public final boolean getCanSubmit() {
        return isValid() && !this.component1;
    }

    public NumberInputState() {
        this(null, null, null, null, false, false, false, null, 255, null);
    }

    public final AlphanumericInputUiState getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final NumberInputType getComponent4() {
        return this.component4;
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final boolean getCopydefault() {
        return this.copydefault;
    }

    public final boolean getComponent1() {
        return this.component1;
    }

    public final boolean getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final NumberInputState copy(AlphanumericInputUiState uiState, NumberInputType numberInputType, String hintText, String helperText, boolean isEditable, boolean isLoading, boolean showCustomMessage, String customMessage) {
        Intrinsics.checkNotNullParameter(uiState, "");
        Intrinsics.checkNotNullParameter(numberInputType, "");
        Intrinsics.checkNotNullParameter(hintText, "");
        Intrinsics.checkNotNullParameter(helperText, "");
        Intrinsics.checkNotNullParameter(customMessage, "");
        return new NumberInputState(uiState, numberInputType, hintText, helperText, isEditable, isLoading, showCustomMessage, customMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberInputState)) {
            return false;
        }
        NumberInputState numberInputState = (NumberInputState) other;
        return Intrinsics.areEqual(this.getRequestBeneficiariesState, numberInputState.getRequestBeneficiariesState) && this.component4 == numberInputState.component4 && Intrinsics.areEqual(this.component3, numberInputState.component3) && Intrinsics.areEqual(this.ShareDataUIState, numberInputState.ShareDataUIState) && this.copydefault == numberInputState.copydefault && this.component1 == numberInputState.component1 && this.getAsAtTimestamp == numberInputState.getAsAtTimestamp && Intrinsics.areEqual(this.component2, numberInputState.component2);
    }

    public int hashCode() {
        return (((((((((((((this.getRequestBeneficiariesState.hashCode() * 31) + this.component4.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.component1)) * 31) + Boolean.hashCode(this.getAsAtTimestamp)) * 31) + this.component2.hashCode();
    }

    public String toString() {
        return "NumberInputState(uiState=" + this.getRequestBeneficiariesState + ", numberInputType=" + this.component4 + ", hintText=" + this.component3 + ", helperText=" + this.ShareDataUIState + ", isEditable=" + this.copydefault + ", isLoading=" + this.component1 + ", showCustomMessage=" + this.getAsAtTimestamp + ", customMessage=" + this.component2 + ')';
    }
}
