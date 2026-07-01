package com.safaricom.designsystem.theme.token.avatar;

import androidx.compose.ui.unit.Dp;
import com.adjust.sdk.Constants;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/theme/token/avatar/Avatars;", "", "normal", "Landroidx/compose/ui/unit/Dp;", Constants.SMALL, "medium", Constants.LARGE, "xLarge", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNormal-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getSmall-D9Ej5fM", "getMedium-D9Ej5fM", "getLarge-D9Ej5fM", "getXLarge-D9Ej5fM", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Avatars {
    public static final int $stable = 0;
    private final float ShareDataUIState;
    private final float component1;
    private final float component2;
    private final float component3;
    private final float copydefault;

    private Avatars(float f, float f2, float f3, float f4, float f5) {
        this.component1 = f;
        this.copydefault = f2;
        this.ShareDataUIState = f3;
        this.component2 = f4;
        this.component3 = f5;
    }

    public final float getComponent1() {
        return this.component1;
    }

    public final float getCopydefault() {
        return this.copydefault;
    }

    public final float getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final float getComponent2() {
        return this.component2;
    }

    public final float getComponent3() {
        return this.component3;
    }

    public Avatars(float f, float f2, float f3, float f4, float f5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8795constructorimpl(0) : f, (i & 2) != 0 ? Dp.m8795constructorimpl(0) : f2, (i & 4) != 0 ? Dp.m8795constructorimpl(0) : f3, (i & 8) != 0 ? Dp.m8795constructorimpl(0) : f4, (i & 16) != 0 ? Dp.m8795constructorimpl(0) : f5, null);
    }

    public Avatars(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }
}
