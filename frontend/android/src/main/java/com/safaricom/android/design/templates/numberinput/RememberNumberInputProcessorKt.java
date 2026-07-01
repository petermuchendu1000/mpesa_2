package com.safaricom.android.design.templates.numberinput;

import androidx.compose.runtime.Composer;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberNumberInputProcessor", "Lcom/safaricom/android/design/templates/numberinput/NumberInputProcessor;", "viewModel", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;Landroidx/compose/runtime/Composer;I)Lcom/safaricom/android/design/templates/numberinput/NumberInputProcessor;", "ConsumerSfcNumberInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberNumberInputProcessorKt {
    public static final NumberInputProcessor rememberNumberInputProcessor(AlphanumericInputViewModel alphanumericInputViewModel, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(alphanumericInputViewModel, "");
        composer.startReplaceGroup(-1758823033);
        composer.startReplaceGroup(-1956350095);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(alphanumericInputViewModel)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new NumberInputProcessor(alphanumericInputViewModel);
            composer.updateRememberedValue(objRememberedValue);
        }
        NumberInputProcessor numberInputProcessor = (NumberInputProcessor) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return numberInputProcessor;
    }
}
