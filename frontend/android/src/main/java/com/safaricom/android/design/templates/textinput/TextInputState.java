package com.safaricom.android.design.templates.textinput;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003Jw\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u00108\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018¨\u0006<"}, d2 = {"Lcom/safaricom/android/design/templates/textinput/TextInputState;", "", "uiState", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "hintText", "", "helperText", "isEditable", "", GriverMonitorConstants.KEY_IS_LOADING, "showCustomMessage", "customMessage", "maxChars", "", "showCharCounter", "showAllCaps", "inputType", "<init>", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;IZZI)V", "getUiState", "()Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "getHintText", "()Ljava/lang/String;", "getHelperText", "()Z", "getShowCustomMessage", "getCustomMessage", "getMaxChars", "()I", "getShowCharCounter", "getShowAllCaps", "getInputType", "inputText", "getInputText", "isValid", "isNonEmpty", "hasError", "getHasError", "errorMessage", "getErrorMessage", "showError", "getShowError", "canSubmit", "getCanSubmit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcTextInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextInputState {
    public static final int $stable = 0;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final int component3;
    private final boolean component4;
    private final boolean copy;
    private final boolean copydefault;
    private final boolean equals;
    private final int getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;
    private final AlphanumericInputUiState hashCode;

    public TextInputState(AlphanumericInputUiState alphanumericInputUiState, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i, boolean z4, boolean z5, int i2) {
        Intrinsics.checkNotNullParameter(alphanumericInputUiState, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hashCode = alphanumericInputUiState;
        this.component1 = str;
        this.ShareDataUIState = str2;
        this.copydefault = z;
        this.copy = z2;
        this.getRequestBeneficiariesState = z3;
        this.component2 = str3;
        this.getAsAtTimestamp = i;
        this.equals = z4;
        this.component4 = z5;
        this.component3 = i2;
    }

    public TextInputState(AlphanumericInputUiState alphanumericInputUiState, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i, boolean z4, boolean z5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new AlphanumericInputUiState(null, false, false, false, null, 31, null) : alphanumericInputUiState, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) == 0 ? str3 : "", (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? false : z4, (i3 & 512) == 0 ? z5 : false, (i3 & 1024) != 0 ? 145 : i2);
    }

    public final AlphanumericInputUiState getUiState() {
        return this.hashCode;
    }

    public final String getHintText() {
        return this.component1;
    }

    public final String getHelperText() {
        return this.ShareDataUIState;
    }

    public final boolean isEditable() {
        return this.copydefault;
    }

    public final boolean isLoading() {
        return this.copy;
    }

    public final boolean getShowCustomMessage() {
        return this.getRequestBeneficiariesState;
    }

    public final String getCustomMessage() {
        return this.component2;
    }

    public final int getMaxChars() {
        return this.getAsAtTimestamp;
    }

    public final boolean getShowCharCounter() {
        return this.equals;
    }

    public final boolean getShowAllCaps() {
        return this.component4;
    }

    public final int getInputType() {
        return this.component3;
    }

    public final String getInputText() {
        return this.hashCode.getText();
    }

    public final boolean isValid() {
        return this.hashCode.isValid();
    }

    public final boolean isNonEmpty() {
        return this.hashCode.isNonEmpty();
    }

    public final boolean getHasError() {
        return this.hashCode.getHasError();
    }

    public final String getErrorMessage() {
        String errorMessage = this.hashCode.getErrorMessage();
        return errorMessage == null ? "" : errorMessage;
    }

    public final boolean getShowError() {
        return getHasError() && !this.copy;
    }

    public final boolean getCanSubmit() {
        return isValid() && !this.copy;
    }

    public TextInputState() {
        this(null, null, null, false, false, false, null, 0, false, false, 0, 2047, null);
    }

    public final AlphanumericInputUiState getHashCode() {
        return this.hashCode;
    }

    public final boolean getComponent4() {
        return this.component4;
    }

    public final int getComponent3() {
        return this.component3;
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final boolean getCopydefault() {
        return this.copydefault;
    }

    public final boolean getCopy() {
        return this.copy;
    }

    public final boolean getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final int getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final boolean getEquals() {
        return this.equals;
    }

    public final TextInputState copy(AlphanumericInputUiState uiState, String hintText, String helperText, boolean isEditable, boolean isLoading, boolean showCustomMessage, String customMessage, int maxChars, boolean showCharCounter, boolean showAllCaps, int inputType) {
        Intrinsics.checkNotNullParameter(uiState, "");
        Intrinsics.checkNotNullParameter(hintText, "");
        Intrinsics.checkNotNullParameter(helperText, "");
        Intrinsics.checkNotNullParameter(customMessage, "");
        return new TextInputState(uiState, hintText, helperText, isEditable, isLoading, showCustomMessage, customMessage, maxChars, showCharCounter, showAllCaps, inputType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputState)) {
            return false;
        }
        TextInputState textInputState = (TextInputState) other;
        return Intrinsics.areEqual(this.hashCode, textInputState.hashCode) && Intrinsics.areEqual(this.component1, textInputState.component1) && Intrinsics.areEqual(this.ShareDataUIState, textInputState.ShareDataUIState) && this.copydefault == textInputState.copydefault && this.copy == textInputState.copy && this.getRequestBeneficiariesState == textInputState.getRequestBeneficiariesState && Intrinsics.areEqual(this.component2, textInputState.component2) && this.getAsAtTimestamp == textInputState.getAsAtTimestamp && this.equals == textInputState.equals && this.component4 == textInputState.component4 && this.component3 == textInputState.component3;
    }

    public int hashCode() {
        return (((((((((((((((((((this.hashCode.hashCode() * 31) + this.component1.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.copy)) * 31) + Boolean.hashCode(this.getRequestBeneficiariesState)) * 31) + this.component2.hashCode()) * 31) + Integer.hashCode(this.getAsAtTimestamp)) * 31) + Boolean.hashCode(this.equals)) * 31) + Boolean.hashCode(this.component4)) * 31) + Integer.hashCode(this.component3);
    }

    public String toString() {
        return "TextInputState(uiState=" + this.hashCode + ", hintText=" + this.component1 + ", helperText=" + this.ShareDataUIState + ", isEditable=" + this.copydefault + ", isLoading=" + this.copy + ", showCustomMessage=" + this.getRequestBeneficiariesState + ", customMessage=" + this.component2 + ", maxChars=" + this.getAsAtTimestamp + ", showCharCounter=" + this.equals + ", showAllCaps=" + this.component4 + ", inputType=" + this.component3 + ')';
    }
}
