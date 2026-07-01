package com.safaricom.android.design.templates.textinput;

import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputViewModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/safaricom/android/design/templates/textinput/TextInputProcessor;", "", "viewModel", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "showAllCaps", "", "<init>", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;Z)V", "onInputChanged", "", "rawInput", "", "ConsumerSfcTextInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextInputProcessor {
    public static final int $stable = 0;
    private final boolean ShareDataUIState;
    private final AlphanumericInputViewModel component2;

    public TextInputProcessor(AlphanumericInputViewModel alphanumericInputViewModel, boolean z) {
        Intrinsics.checkNotNullParameter(alphanumericInputViewModel, "");
        this.component2 = alphanumericInputViewModel;
        this.ShareDataUIState = z;
    }

    public final void onInputChanged(String rawInput) {
        if (this.ShareDataUIState) {
            if (rawInput != null) {
                rawInput = rawInput.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(rawInput, "");
            } else {
                rawInput = null;
            }
        }
        this.component2.onInputChanged(rawInput);
    }
}
