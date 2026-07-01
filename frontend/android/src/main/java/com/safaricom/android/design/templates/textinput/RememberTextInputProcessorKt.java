package com.safaricom.android.design.templates.textinput;

import androidx.compose.runtime.Composer;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberTextInputModifier", "Lcom/safaricom/android/design/templates/textinput/TextInputProcessor;", "viewModel", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "showAllCaps", "", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;ZLandroidx/compose/runtime/Composer;II)Lcom/safaricom/android/design/templates/textinput/TextInputProcessor;", "ConsumerSfcTextInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberTextInputProcessorKt {
    public static final TextInputProcessor rememberTextInputModifier(AlphanumericInputViewModel alphanumericInputViewModel, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(alphanumericInputViewModel, "");
        composer.startReplaceGroup(-289644484);
        if ((i2 & 2) != 0) {
            z = false;
        }
        composer.startReplaceGroup(510207088);
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(alphanumericInputViewModel)) || (i & 6) == 4;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if ((z2 | z3) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TextInputProcessor(alphanumericInputViewModel, z);
            composer.updateRememberedValue(objRememberedValue);
        }
        TextInputProcessor textInputProcessor = (TextInputProcessor) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return textInputProcessor;
    }
}
