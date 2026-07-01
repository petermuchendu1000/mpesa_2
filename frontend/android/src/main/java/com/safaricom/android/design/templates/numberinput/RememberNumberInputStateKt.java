package com.safaricom.android.design.templates.numberinput;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputUiState;
import com.safaricom.android.design.templates.commons.model.InputErrorData;
import kotlin.Metadata;
import kotlin.createNewMenuItem;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"rememberNumberInputState", "Lcom/safaricom/android/design/templates/numberinput/NumberInputState;", "alphanumericInputUiState", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "hintText", "", "numberInputType", "Lcom/safaricom/android/design/templates/numberinput/NumberInputType;", "helperText", GriverMonitorConstants.KEY_IS_LOADING, "", "isEditable", "showCustomMessage", "customMessage", "errorOverride", "Lcom/safaricom/android/design/templates/commons/model/InputErrorData;", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;Ljava/lang/String;Lcom/safaricom/android/design/templates/numberinput/NumberInputType;Ljava/lang/String;ZZZLjava/lang/String;Lcom/safaricom/android/design/templates/commons/model/InputErrorData;Landroidx/compose/runtime/Composer;II)Lcom/safaricom/android/design/templates/numberinput/NumberInputState;", "ConsumerSfcNumberInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberNumberInputStateKt {
    public static final NumberInputState rememberNumberInputState(AlphanumericInputUiState alphanumericInputUiState, String str, NumberInputType numberInputType, String str2, boolean z, boolean z2, boolean z3, String str3, InputErrorData inputErrorData, Composer composer, int i, int i2) {
        String errorMessage;
        Intrinsics.checkNotNullParameter(alphanumericInputUiState, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(numberInputType, "");
        composer.startReplaceGroup(-1283170383);
        String str4 = (i2 & 8) != 0 ? "" : str2;
        boolean z4 = (i2 & 16) != 0 ? false : z;
        boolean z5 = (i2 & 32) != 0 ? true : z2;
        boolean z6 = (i2 & 64) != 0 ? false : z3;
        String str5 = (i2 & 128) != 0 ? "" : str3;
        InputErrorData inputErrorData2 = (i2 & 256) != 0 ? null : inputErrorData;
        boolean errorState = inputErrorData2 != null ? inputErrorData2.getErrorState() : alphanumericInputUiState.getHasError();
        String str6 = ((inputErrorData2 == null || (errorMessage = inputErrorData2.getErrorMessage()) == null) && (errorMessage = alphanumericInputUiState.getErrorMessage()) == null) ? "" : errorMessage;
        String text = alphanumericInputUiState.getText();
        boolean zIsValid = alphanumericInputUiState.isValid();
        boolean zIsNonEmpty = alphanumericInputUiState.isNonEmpty();
        boolean hasError = alphanumericInputUiState.getHasError();
        String errorMessage2 = alphanumericInputUiState.getErrorMessage();
        String str7 = str6;
        composer.startReplaceGroup(-1434707671);
        boolean zChanged = composer.changed(text);
        boolean zChanged2 = composer.changed(zIsValid);
        boolean zChanged3 = composer.changed(zIsNonEmpty);
        boolean zChanged4 = composer.changed(hasError);
        boolean zChanged5 = composer.changed(errorMessage2);
        boolean z7 = (((57344 & i) ^ 24576) > 16384 && composer.changed(z4)) || (i & 24576) == 16384;
        boolean z8 = z4;
        boolean z9 = (((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(z5)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        boolean z10 = z5;
        boolean z11 = (((3670016 & i) ^ 1572864) > 1048576 && composer.changed(z6)) || (i & 1572864) == 1048576;
        boolean z12 = z6;
        boolean z13 = (((29360128 & i) ^ 12582912) > 8388608 && composer.changed(str5)) || (i & 12582912) == 8388608;
        String str8 = str5;
        boolean z14 = (((i & 112) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32;
        boolean z15 = (((i & 7168) ^ 3072) > 2048 && composer.changed(str4)) || (i & 3072) == 2048;
        String str9 = str4;
        boolean z16 = (((i & 896) ^ createNewMenuItem.copydefault) > 256 && composer.changed(numberInputType)) || (i & createNewMenuItem.copydefault) == 256;
        boolean z17 = (((234881024 & i) ^ 100663296) > 67108864 && composer.changed(inputErrorData2)) || (i & 100663296) == 67108864;
        Object objRememberedValue = composer.rememberedValue();
        if ((z17 | zChanged5 | zChanged | zChanged2 | zChanged3 | zChanged4 | z7 | z9 | z11 | z13 | z14 | z15 | z16) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            NumberInputState numberInputState = new NumberInputState(AlphanumericInputUiState.copy$default(alphanumericInputUiState, null, false, false, errorState, str7, 7, null), numberInputType, str, str9, z10, z8, z12, str8);
            composer.updateRememberedValue(numberInputState);
            objRememberedValue = numberInputState;
        }
        NumberInputState numberInputState2 = (NumberInputState) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return numberInputState2;
    }
}
