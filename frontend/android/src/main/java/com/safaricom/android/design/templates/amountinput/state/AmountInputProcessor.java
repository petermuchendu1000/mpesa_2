package com.safaricom.android.design.templates.amountinput.state;

import com.safaricom.android.design.templates.amountinput.AmountInputExtensionsKt;
import com.safaricom.android.design.templates.amountinput.AmountInputViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/state/AmountInputProcessor;", "", "viewModel", "Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;", "maxLength", "", "maxDecimalPlaces", "<init>", "(Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;II)V", "onInputChanged", "", "rawInput", "", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountInputProcessor {
    public static final int $stable = 8;
    private final int ShareDataUIState;
    private final int component2;
    private final AmountInputViewModel component3;

    public AmountInputProcessor(AmountInputViewModel amountInputViewModel, int i, int i2) {
        Intrinsics.checkNotNullParameter(amountInputViewModel, "");
        this.component3 = amountInputViewModel;
        this.component2 = i;
        this.ShareDataUIState = i2;
    }

    public AmountInputProcessor(AmountInputViewModel amountInputViewModel, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(amountInputViewModel, (i3 & 2) != 0 ? 10 : i, (i3 & 4) != 0 ? 2 : i2);
    }

    public final void onInputChanged(String rawInput) {
        Intrinsics.checkNotNullParameter(rawInput, "");
        String cleanAmountInput = AmountInputExtensionsKt.toCleanAmountInput(rawInput);
        if (AmountInputExtensionsKt.isValidAmountFormat(cleanAmountInput, this.component2, this.ShareDataUIState)) {
            this.component3.updateAmount(cleanAmountInput);
        }
    }
}
