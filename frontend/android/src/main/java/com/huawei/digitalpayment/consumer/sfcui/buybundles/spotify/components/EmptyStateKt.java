package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.safaricom.designsystem.components.text.UrbanistTextKt;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import kotlin.ActivityResultRegistryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"EmptyState", "", "title", "", "description", "icon", "Landroidx/compose/ui/graphics/painter/Painter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EmptyStateKt {
    private static int component1 = 1;
    private static int copydefault;

    private static final void ShareDataUIState(Composer composer, final int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2056793877);
        if (i == 0) {
            int i5 = component1 + 33;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            if (composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                int i7 = component1 + 57;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m11380getLambda1$ConsumerSfcUI_release(), composerStartRestartGroup, 1572864, 63);
            }
        } else {
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m11380getLambda1$ConsumerSfcUI_release(), composerStartRestartGroup, 1572864, 63);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                private static int component2 = 1;
                private static int copydefault;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    Unit unitM11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU;
                    int i9 = 2 % 2;
                    int i10 = component2 + 45;
                    copydefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        unitM11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU = EmptyStateKt.m11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU(i, (Composer) obj, ((Integer) obj2).intValue());
                        int i11 = 73 / 0;
                    } else {
                        unitM11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU = EmptyStateKt.m11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                    int i12 = component2 + 69;
                    copydefault = i12 % 128;
                    int i13 = i12 % 2;
                    return unitM11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void EmptyState(final String str, final String str2, final Painter painter, Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Modifier.Companion companion;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(painter, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-417084881);
        if ((i2 & 8) != 0) {
            int i4 = component1 + 37;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                companion = Modifier.INSTANCE;
                int i5 = 39 / 0;
            } else {
                companion = Modifier.INSTANCE;
            }
            modifier2 = companion;
        } else {
            modifier2 = modifier;
        }
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Object obj = null;
        Modifier modifierM1159padding3ABfNKs = PaddingKt.m1159padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m8795constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1159padding3ABfNKs);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            int i6 = copydefault + 111;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                ComposablesKt.invalidApplier();
                obj.hashCode();
                throw null;
            }
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            int i7 = copydefault + 107;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            composerStartRestartGroup.createNode(constructor);
            int i9 = copydefault + 5;
            component1 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM5338constructorimpl = Updater.m5338constructorimpl(composerStartRestartGroup);
        Updater.m5345setimpl(composerM5338constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5345setimpl(composerM5338constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM5338constructorimpl.getInserting() || !Intrinsics.areEqual(composerM5338constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
            composerM5338constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
            composerM5338constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
        }
        Updater.m5345setimpl(composerM5338constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        IconKt.m2373Iconww6aTOc(painter, (String) null, SizeKt.m1211size3ABfNKs(Modifier.INSTANCE, Dp.m8795constructorimpl(66)), Color.INSTANCE.m6090getUnspecified0d7_KjU(), composerStartRestartGroup, 3512, 0);
        float f = 8;
        final Modifier modifier3 = modifier2;
        UrbanistTextKt.m12708UrbanistTextog4tD3s(str, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnBackground(), PaddingKt.m1163paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8795constructorimpl(f), 0.0f, 0.0f, 13, null), new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m8679getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null), TextUnitKt.getSp(14), FontWeight.INSTANCE.getSemiBold(), 0, 0, composerStartRestartGroup, (i & 14) | 221568, BERTags.PRIVATE);
        UrbanistTextKt.m12708UrbanistTextog4tD3s(str2, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnBackground(), PaddingKt.m1163paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8795constructorimpl(f), 0.0f, 0.0f, 13, null), new TextStyle(0L, 0L, (FontWeight) (0 == true ? 1 : 0), (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) null, (FontFamily) null, (String) (0 == true ? 1 : 0), 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) (0 == true ? 1 : 0), 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m8679getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) (0 == true ? 1 : 0), 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null), TextUnitKt.getSp(14), null, 5, 0, composerStartRestartGroup, ((i >> 3) & 14) | 1597824, 160);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                private static int component2 = 0;
                private static int component3 = 1;

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = component2 + 53;
                    component3 = i12 % 128;
                    if (i12 % 2 != 0) {
                        return EmptyStateKt.$r8$lambda$vwoUTGmYvCHFNEObObJXqRwTFeg(str, str2, painter, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                    EmptyStateKt.$r8$lambda$vwoUTGmYvCHFNEObObJXqRwTFeg(str, str2, painter, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            });
        }
    }

    public static Unit m11381$r8$lambda$R5PcTU6gfIMlTDOzbQzUpfsrmU(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitComponent2 = component2(i, composer, i2);
        if (i5 != 0) {
            int i6 = 77 / 0;
        }
        return unitComponent2;
    }

    public static Unit $r8$lambda$vwoUTGmYvCHFNEObObJXqRwTFeg(String str, String str2, Painter painter, Modifier modifier, int i, int i2, Composer composer, int i3) {
        int i4 = 2 % 2;
        int i5 = component1 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitComponent3 = component3(str, str2, painter, modifier, i, i2, composer, i3);
        int i7 = component1 + 87;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return unitComponent3;
        }
        throw null;
    }

    private static final Unit component3(String str, String str2, Painter painter, Modifier modifier, int i, int i2, Composer composer, int i3) {
        int i4 = 2 % 2;
        int i5 = component1 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(painter, "");
        EmptyState(str, str2, painter, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = component1 + 89;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit component2(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 89;
        copydefault = i4 % 128;
        ShareDataUIState(composer, i4 % 2 != 0 ? RecomposeScopeImplKt.updateChangedFlags(i) : RecomposeScopeImplKt.updateChangedFlags(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = component1 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return unit;
    }

    public static void component2() {
        ActivityResultRegistryKt.copydefault[0] = Class.forName("com.google.android.gms.internal.mlkit_vision_barcode.zzub").getDeclaredField("copydefault");
    }
}
