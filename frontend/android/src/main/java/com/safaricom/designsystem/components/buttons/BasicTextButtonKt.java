package com.safaricom.designsystem.components.buttons;

import android.os.SystemClock;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import com.safaricom.designsystem.components.buttons.style.ButtonStyle;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"BasicTextButton", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", CdpConstants.CONTENT_TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "style", "Lcom/safaricom/designsystem/components/buttons/style/ButtonStyle;", "enabled", "", "BasicTextButton-fWhpE4E", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLcom/safaricom/designsystem/components/buttons/style/ButtonStyle;ZLandroidx/compose/runtime/Composer;II)V", "BasicTextButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BasicTextButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12413BasicTextButtonfWhpE4E(final java.lang.String r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.ui.Modifier r24, long r25, com.safaricom.designsystem.components.buttons.style.ButtonStyle r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.buttons.BasicTextButtonKt.m12413BasicTextButtonfWhpE4E(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, com.safaricom.designsystem.components.buttons.style.ButtonStyle, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class copydefault implements Function3<RowScope, Composer, Integer, Unit> {
        public static int component1;
        public static int component3;
        final String ShareDataUIState;
        final ButtonStyle component2;
        final long copydefault;

        @Override
        public Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            component2(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void component2(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                ButtonTextKt.m12415ButtonTextsW7UJKQ(this.ShareDataUIState, this.copydefault, this.component2.getTextStyle(), null, composer, 0, 8);
            } else {
                composer.skipToGroupEnd();
            }
        }

        copydefault(String str, long j, ButtonStyle buttonStyle) {
            this.ShareDataUIState = str;
            this.copydefault = j;
            this.component2 = buttonStyle;
        }

        public static int component1() {
            int i = component1;
            int i2 = i % 6122694;
            component1 = i + 1;
            if (i2 != 0) {
                return component3;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            component3 = iUptimeMillis;
            return iUptimeMillis;
        }
    }

    private static final void ShareDataUIState(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(468116506);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableSingletons$BasicTextButtonKt.INSTANCE.m12417getLambda2$DesignSystem_release(), composerStartRestartGroup, 1572864, 63);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTextButtonKt.ShareDataUIState(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit ShareDataUIState(int i, Composer composer, int i2) {
        ShareDataUIState(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(String str, Function0 function0, Modifier modifier, long j, ButtonStyle buttonStyle, boolean z, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        m12413BasicTextButtonfWhpE4E(str, function0, modifier, j, buttonStyle, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }
}
