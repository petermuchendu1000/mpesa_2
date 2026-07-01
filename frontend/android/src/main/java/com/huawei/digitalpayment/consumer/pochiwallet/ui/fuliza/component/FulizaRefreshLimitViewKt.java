package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.component.FulizaRefreshLimitViewKt;
import com.safaricom.designsystem.components.card.BasicCardKt;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onActivityResult;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"FulizaRefreshLimitView", "", "fulizaLimit", "", "isLimitVisible", "", "refreshEnabled", "daysUntilRefresh", "", "showNewLimit", "onDismissNewLimit", "Lkotlin/Function0;", "onRefreshClick", "(Ljava/lang/String;ZZJZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NewLimitCard", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RefreshLayout", "onClick", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewFulizaRefreshLimit", "(Landroidx/compose/runtime/Composer;I)V", "ConsumerSfcPochiWallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FulizaRefreshLimitViewKt {
    private static int ShareDataUIState = 1;
    private static int component3;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[PHI: r0
  0x0052: PHI (r0v5 androidx.compose.runtime.Composer) = (r0v1 androidx.compose.runtime.Composer), (r0v6 androidx.compose.runtime.Composer) binds: [B:8:0x0045, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[PHI: r0
  0x0047: PHI (r0v2 androidx.compose.runtime.Composer) = (r0v1 androidx.compose.runtime.Composer), (r0v6 androidx.compose.runtime.Composer) binds: [B:8:0x0045, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FulizaRefreshLimitView(final java.lang.String r29, final boolean r30, final boolean r31, final long r32, final boolean r34, final kotlin.jvm.functions.Function0<kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.component.FulizaRefreshLimitViewKt.FulizaRefreshLimitView(java.lang.String, boolean, boolean, long, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        final String component1;
        final Function0<Unit> component3;
        final boolean copydefault;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            Unit unit;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component2(composer2, num2.intValue());
                unit = Unit.INSTANCE;
                int i3 = 83 / 0;
            } else {
                component2(composer2, num2.intValue());
                unit = Unit.INSTANCE;
            }
            int i4 = component2 + 97;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x03b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component2(androidx.compose.runtime.Composer r30, int r31) {
            /*
                Method dump skipped, instruction units count: 1071
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.component.FulizaRefreshLimitViewKt.copydefault.component2(androidx.compose.runtime.Composer, int):void");
        }

        copydefault(Function0<Unit> function0, String str, boolean z) {
            this.component3 = function0;
            this.component1 = str;
            this.copydefault = z;
        }
    }

    private static final void component3(final String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(61699160);
        if ((i & 14) == 0) {
            int i6 = component3 + 75;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                composerStartRestartGroup.changed(str);
                throw null;
            }
            if (composerStartRestartGroup.changed(str)) {
                int i7 = ShareDataUIState + 31;
                component3 = i7 % 128;
                i4 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                int i8 = component3 + 11;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            BasicCardKt.m12473BasicCardXGYh9CY(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, false, false, 0L, null, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1254523278, true, new copydefault(function0, str, z), composerStartRestartGroup, 54), composerStartRestartGroup, 805306374, TypedValues.PositionType.TYPE_POSITION_TYPE);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = ShareDataUIState + 25;
                    component3 = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unit$r8$lambda$DSZTJCYIUukZZn6sEfJyWwDUCdQ = FulizaRefreshLimitViewKt.$r8$lambda$DSZTJCYIUukZZn6sEfJyWwDUCdQ(str, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    int i13 = ShareDataUIState + 39;
                    component3 = i13 % 128;
                    int i14 = i13 % 2;
                    return unit$r8$lambda$DSZTJCYIUukZZn6sEfJyWwDUCdQ;
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ShareDataUIState implements Function3<ColumnScope, Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;
        final boolean ShareDataUIState;
        final Function0<Unit> component2;

        @Override
        public Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            component3 = i2 % 128;
            ColumnScope columnScope2 = columnScope;
            Composer composer2 = composer;
            if (i2 % 2 != 0) {
                component3(columnScope2, composer2, num.intValue());
                return Unit.INSTANCE;
            }
            component3(columnScope2, composer2, num.intValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass3 implements Function3<Modifier, Composer, Integer, Modifier> {
            private static int component1 = 0;
            private static int copydefault = 1;
            final Function0<Unit> component3;

            @Override
            public Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 103;
                component1 = i2 % 128;
                Modifier modifier2 = modifier;
                Composer composer2 = composer;
                if (i2 % 2 != 0) {
                    component3(modifier2, composer2, num.intValue());
                    throw null;
                }
                Modifier modifierComponent3 = component3(modifier2, composer2, num.intValue());
                int i3 = copydefault + 37;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 19 / 0;
                }
                return modifierComponent3;
            }

            private static final Unit component1(Function0 function0) {
                int i = 2 % 2;
                int i2 = component1 + 23;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(function0, "");
                function0.invoke();
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 121;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            public final Modifier component3(Modifier modifier, Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 47;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(modifier, "");
                composer.startReplaceGroup(963760827);
                composer.startReplaceGroup(209724955);
                boolean zChanged = composer.changed(this.component3);
                final Function0<Unit> function0 = this.component3;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() {
                        private static int component2 = 0;
                        private static int copydefault = 1;

                        @Override
                        public final Object invoke() {
                            int i5 = 2 % 2;
                            int i6 = component2 + 85;
                            copydefault = i6 % 128;
                            int i7 = i6 % 2;
                            Unit unitComponent3 = FulizaRefreshLimitViewKt.ShareDataUIState.AnonymousClass3.component3(function0);
                            int i8 = copydefault + 7;
                            component2 = i8 % 128;
                            int i9 = i8 % 2;
                            return unitComponent3;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM625clickableoSLSa3U$default = ClickableKt.m625clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue, 15, null);
                composer.endReplaceGroup();
                int i5 = component1 + 67;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return modifierM625clickableoSLSa3U$default;
                }
                throw null;
            }

            public static Unit component3(Function0 function0) {
                int i = 2 % 2;
                int i2 = component1 + 19;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(function0);
                int i4 = component1 + 3;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return unitComponent1;
            }

            AnonymousClass3(Function0<Unit> function0) {
                this.component3 = function0;
            }

            public static void component2() {
                onActivityResult.component1[0] = Class.forName("com.huawei.digitalpayment.consumer.sfcui.gsmBalances.SfcGsmBalancesActivity$copydefault$1").getDeclaredField("component3");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.foundation.layout.ColumnScope r23, androidx.compose.runtime.Composer r24, int r25) {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.component.FulizaRefreshLimitViewKt.ShareDataUIState.component3(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
        }

        ShareDataUIState(boolean z, Function0<Unit> function0) {
            this.ShareDataUIState = z;
            this.component2 = function0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void component3(final boolean r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.component.FulizaRefreshLimitViewKt.component3(boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final void PreviewFulizaRefreshLimit(Composer composer, final int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 31;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1272327781);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableSingletons$FulizaRefreshLimitViewKt.INSTANCE.m10845getLambda1$ConsumerSfcPochiWallet_release(), composerStartRestartGroup, 1572864, 63);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            int i5 = component3 + 75;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    Unit unitM10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk;
                    int i7 = 2 % 2;
                    int i8 = copydefault + 29;
                    ShareDataUIState = i8 % 128;
                    if (i8 % 2 == 0) {
                        unitM10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk = FulizaRefreshLimitViewKt.m10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk(i, (Composer) obj, ((Integer) obj2).intValue());
                        int i9 = 86 / 0;
                    } else {
                        unitM10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk = FulizaRefreshLimitViewKt.m10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                    int i10 = ShareDataUIState + 53;
                    copydefault = i10 % 128;
                    int i11 = i10 % 2;
                    return unitM10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk;
                }
            });
        }
    }

    public static Unit $r8$lambda$DSZTJCYIUukZZn6sEfJyWwDUCdQ(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        Unit unitComponent3 = component3(str, z, function0, i, composer, i2);
        int i6 = ShareDataUIState + 67;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return unitComponent3;
        }
        throw null;
    }

    public static Unit m10846$r8$lambda$e43Bkej64niLbXUzLSmrWsJbFk(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = component3 + 65;
        ShareDataUIState = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            component3(i, composer, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitComponent3 = component3(i, composer, i2);
        int i5 = ShareDataUIState + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return unitComponent3;
        }
        obj.hashCode();
        throw null;
    }

    public static Unit m10847$r8$lambda$u0Jrc9syZYqXcXjgZiaXyaXzPk(boolean z, Function0 function0, int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitCopydefault = copydefault(z, function0, i, composer, i2);
        int i6 = ShareDataUIState + 65;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 59 / 0;
        }
        return unitCopydefault;
    }

    public static Unit $r8$lambda$uHRl7lU7mrtufJ5B4KBHKqR15Q4(String str, boolean z, boolean z2, long j, boolean z3, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitShareDataUIState = ShareDataUIState(str, z, z2, j, z3, function0, function02, i, composer, i2);
        int i6 = ShareDataUIState + 39;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return unitShareDataUIState;
    }

    private static final Unit ShareDataUIState(String str, boolean z, boolean z2, long j, boolean z3, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        FulizaRefreshLimitView(str, z, z2, j, z3, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = ShareDataUIState + 27;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit component3(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        component3(str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = ShareDataUIState + 57;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit component3(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        PreviewFulizaRefreshLimit(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit copydefault(boolean z, Function0 function0, int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        component3(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = component3 + 23;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
