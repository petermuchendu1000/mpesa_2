package com.safaricom.android.design.templates.amountinput.state;

import androidx.compose.runtime.Composer;
import com.safaricom.android.design.templates.amountinput.AmountInputViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberAmountInputProcessor", "Lcom/safaricom/android/design/templates/amountinput/state/AmountInputProcessor;", "viewModel", "Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;", "maxLength", "", "maxDecimalPlaces", "(Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;IILandroidx/compose/runtime/Composer;II)Lcom/safaricom/android/design/templates/amountinput/state/AmountInputProcessor;", "ConsumerSfcAmountInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberAmountInputProcessorKt {
    public static final AmountInputProcessor rememberAmountInputProcessor(AmountInputViewModel amountInputViewModel, int i, int i2, Composer composer, int i3, int i4) {
        Intrinsics.checkNotNullParameter(amountInputViewModel, "");
        composer.startReplaceGroup(-1007702733);
        if ((i4 & 2) != 0) {
            i = 10;
        }
        if ((i4 & 4) != 0) {
            i2 = 2;
        }
        composer.startReplaceGroup(917036674);
        boolean zChanged = composer.changed(amountInputViewModel);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new AmountInputProcessor(amountInputViewModel, i, i2);
            composer.updateRememberedValue(objRememberedValue);
        }
        AmountInputProcessor amountInputProcessor = (AmountInputProcessor) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return amountInputProcessor;
    }
}
