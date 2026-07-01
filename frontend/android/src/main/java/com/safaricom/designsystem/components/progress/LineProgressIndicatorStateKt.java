package com.safaricom.designsystem.components.progress;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberLineProgressState", "Lcom/safaricom/designsystem/components/progress/LineProgressIndicatorState;", "initialProgress", "", "(FLandroidx/compose/runtime/Composer;II)Lcom/safaricom/designsystem/components/progress/LineProgressIndicatorState;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LineProgressIndicatorStateKt {
    public static final LineProgressIndicatorState rememberLineProgressState(float f, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1856354215);
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        composer.startReplaceGroup(-29484437);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LineProgressIndicatorState(f);
            composer.updateRememberedValue(objRememberedValue);
        }
        LineProgressIndicatorState lineProgressIndicatorState = (LineProgressIndicatorState) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return lineProgressIndicatorState;
    }
}
