package com.safaricom.designsystem.theme.token.elevations;

import androidx.compose.ui.unit.Dp;
import com.adjust.sdk.Constants;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/safaricom/designsystem/theme/token/elevations/Elevations;", "", "none", "Landroidx/compose/ui/unit/Dp;", "xSmall", Constants.SMALL, "medium", Constants.LARGE, "xLarge", LottieConstants.PARAM_MAX_VALUE, "<init>", "(FFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNone-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getXSmall-D9Ej5fM", "getSmall-D9Ej5fM", "getMedium-D9Ej5fM", "getLarge-D9Ej5fM", "getXLarge-D9Ej5fM", "getMax-D9Ej5fM", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Elevations {
    public static final int $stable = 0;
    private final float ShareDataUIState;
    private final float component1;
    private final float component2;
    private final float component3;
    private final float component4;
    private final float copydefault;
    private final float getRequestBeneficiariesState;

    private Elevations(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.ShareDataUIState = f;
        this.component4 = f2;
        this.copydefault = f3;
        this.component1 = f4;
        this.component3 = f5;
        this.getRequestBeneficiariesState = f6;
        this.component2 = f7;
    }

    public final float getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final float getComponent4() {
        return this.component4;
    }

    public final float getCopydefault() {
        return this.copydefault;
    }

    public final float getComponent1() {
        return this.component1;
    }

    public final float getComponent3() {
        return this.component3;
    }

    public final float getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final float getComponent2() {
        return this.component2;
    }

    public Elevations(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8795constructorimpl(0) : f, (i & 2) != 0 ? Dp.m8795constructorimpl(0) : f2, (i & 4) != 0 ? Dp.m8795constructorimpl(0) : f3, (i & 8) != 0 ? Dp.m8795constructorimpl(0) : f4, (i & 16) != 0 ? Dp.m8795constructorimpl(0) : f5, (i & 32) != 0 ? Dp.m8795constructorimpl(0) : f6, (i & 64) != 0 ? Dp.m8795constructorimpl(0) : f7, null);
    }

    public Elevations(float f, float f2, float f3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7);
    }
}
