package com.safaricom.android.design.templates.numberinput;

import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputViewModel;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/safaricom/android/design/templates/numberinput/NumberInputProcessor;", "", "viewModel", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "<init>", "(Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;)V", "onInputChanged", "", "rawInput", "", "ConsumerSfcNumberInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberInputProcessor {
    public static final int $stable = 0;
    private final AlphanumericInputViewModel component1;

    public NumberInputProcessor(AlphanumericInputViewModel alphanumericInputViewModel) {
        Intrinsics.checkNotNullParameter(alphanumericInputViewModel, "");
        this.component1 = alphanumericInputViewModel;
    }

    public final void onInputChanged(String rawInput) throws IOException {
        String str = "";
        if (rawInput != null) {
            String str2 = rawInput;
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str2.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (string != null) {
                str = string;
            }
        }
        this.component1.onInputChanged(str);
    }
}
