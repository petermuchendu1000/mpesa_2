package com.safaricom.aipay.scantopay.sdk.ui.components;

import a.l;
import a.m;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.ViewCompat;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a7\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001aJ\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\r2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aO\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\rH\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010#\u001a\u00020\u0002H\u0003¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010%\u001a\u00020\u0002H\u0003¢\u0006\u0004\b%\u0010$\u001a\u000f\u0010&\u001a\u00020\u0002H\u0003¢\u0006\u0004\b&\u0010$\"\u0014\u0010'\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006.²\u0006\u0018\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010+\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u00020\u001c8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "La/m;", "", "onPress", "onRelease", "CaptureKeyHandler", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "isCaptureEnabled", "Lkotlin/Function0;", "onImageCapture", "", "captureButtonSize", "CaptureButtonWrapper", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;FLandroidx/compose/runtime/Composer;II)V", "CaptureButton", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "color", "borderWidth", "Landroidx/compose/runtime/Composable;", "contents", "CaptureButtonRing-T042LqI", "(Landroidx/compose/ui/Modifier;FJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CaptureButtonRing", "isPressed", "Landroidx/compose/ui/unit/Dp;", "offsetX", "imageCaptureModeColor", "idleImageCaptureScale", "CaptureButtonNucleus-gXMAzVA", "(Landroidx/compose/ui/Modifier;ZZFFJFLandroidx/compose/runtime/Composer;II)V", "CaptureButtonNucleus", "IdleImageCaptureButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "PressedImageCaptureButtonPreview", "PressedImageCaptureButtonDisabledPreview", "DEFAULT_CAPTURE_BUTTON_SIZE", LogConstants.RESULT_FALSE, "currentOnPress", "currentOnRelease", "isCaptureButtonPressed", "centerShapeSize", "animatedColor", "scan-to-pay-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CaptureButtonComponentsKt {
    private static final float ShareDataUIState = 80.0f;

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12288CaptureButtonRingT042LqI(androidx.compose.ui.Modifier r16, final float r17, final long r18, float r20, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.ui.components.CaptureButtonComponentsKt.m12288CaptureButtonRingT042LqI(androidx.compose.ui.Modifier, float, long, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CaptureButtonWrapper(androidx.compose.ui.Modifier r17, final boolean r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, float r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.ui.components.CaptureButtonComponentsKt.CaptureButtonWrapper(androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, float, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void ShareDataUIState(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-126999425);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            m12288CaptureButtonRingT042LqI(null, ShareDataUIState, Color.INSTANCE.m6091getWhite0d7_KjU(), 0.0f, ComposableSingletons$CaptureButtonComponentsKt.INSTANCE.m12293getLambda1$scan_to_pay_sdk_release(), composerStartRestartGroup, 25008, 9);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    return CaptureButtonComponentsKt.ShareDataUIState(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean ShareDataUIState(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final DisposableEffectResult component1(View view, final State state, final State state2, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(state2, "");
        Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat = new ViewCompat.OnUnhandledKeyEventListenerCompat() {
            @Override
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return CaptureButtonComponentsKt.copydefault(objectRef, state, state2, view2, keyEvent);
            }
        };
        ViewCompat.addOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
        return new l(view, onUnhandledKeyEventListenerCompat);
    }

    public static final Unit component1(MutableState mutableState, State state, Function0 function0) {
        Intrinsics.checkNotNullParameter(mutableState, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function0, "");
        component2((MutableState<m>) mutableState, (State<Boolean>) state, (Function0<Unit>) function0, m.f847a);
        return Unit.INSTANCE;
    }

    private static final Function1<m, Unit> component1(State<? extends Function1<? super m, Unit>> state) {
        return (Function1) state.getValue();
    }

    public static final void component1(MutableState<m> mutableState, m mVar) {
        if (mutableState.getValue() == null) {
            mutableState.setValue(mVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void component1(androidx.compose.ui.Modifier r30, final boolean r31, final boolean r32, final float r33, float r34, long r35, float r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.ui.components.CaptureButtonComponentsKt.component1(androidx.compose.ui.Modifier, boolean, boolean, float, float, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float component2(State<Dp> state) {
        return state.getValue().m8809unboximpl();
    }

    private static final m component2(int i) {
        if (i == 24) {
            return m.f848b;
        }
        if (i != 25) {
            return null;
        }
        return m.f849c;
    }

    public static final Unit component2(MutableState mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "");
        component1(mutableState, m.f847a);
        return Unit.INSTANCE;
    }

    public static final void component2(MutableState<m> mutableState, State<Boolean> state, Function0<Unit> function0, m mVar) {
        if (mutableState.getValue() == mVar) {
            if (state.getValue().booleanValue()) {
                function0.invoke();
            }
            mutableState.setValue(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void component2(androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, final boolean r27, float r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.ui.components.CaptureButtonComponentsKt.component2(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, float, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void component2(final Function1<? super m, Unit> function1, final Function1<? super m, Unit> function12, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(572200477);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i2 & 14);
            final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function12, composerStartRestartGroup, (i2 >> 3) & 14);
            EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1() {
                @Override
                public final Object invoke(Object obj) {
                    return CaptureButtonComponentsKt.component1(view, stateRememberUpdatedState, stateRememberUpdatedState2, (DisposableEffectScope) obj);
                }
            }, composerStartRestartGroup, 8);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    return CaptureButtonComponentsKt.ShareDataUIState(function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Function1<m, Unit> component3(State<? extends Function1<? super m, Unit>> state) {
        return (Function1) state.getValue();
    }

    private static final void component3(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(190395661);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            m12288CaptureButtonRingT042LqI(null, ShareDataUIState, Color.INSTANCE.m6091getWhite0d7_KjU(), 0.0f, ComposableSingletons$CaptureButtonComponentsKt.INSTANCE.m12294getLambda2$scan_to_pay_sdk_release(), composerStartRestartGroup, 25008, 9);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    return CaptureButtonComponentsKt.copydefault(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long copydefault(State<Color> state) {
        return state.getValue().m6064unboximpl();
    }

    private static final void copydefault(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(98859761);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            m12288CaptureButtonRingT042LqI(null, ShareDataUIState, Color.INSTANCE.m6091getWhite0d7_KjU(), 0.0f, ComposableSingletons$CaptureButtonComponentsKt.INSTANCE.m12295getLambda3$scan_to_pay_sdk_release(), composerStartRestartGroup, 25008, 9);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    return CaptureButtonComponentsKt.component1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Integer] */
    public static final boolean copydefault(Ref.ObjectRef objectRef, State state, State state2, View view, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(objectRef, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(state2, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(keyEvent, "");
        m mVarComponent2 = component2(keyEvent.getKeyCode());
        if (mVarComponent2 == null) {
            return false;
        }
        if (keyEvent.getAction() == 0 && objectRef.element == 0) {
            objectRef.element = Integer.valueOf(keyEvent.getKeyCode());
            component3(state).invoke(mVarComponent2);
        }
        if (keyEvent.getAction() == 1) {
            Integer num = (Integer) objectRef.element;
            int keyCode = keyEvent.getKeyCode();
            if (num != null && num.intValue() == keyCode) {
                objectRef.element = null;
                component1(state2).invoke(mVarComponent2);
            }
        }
        return true;
    }

    public static final void component3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit copydefault(Modifier modifier, Function0 function0, Function0 function02, boolean z, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        component2(modifier, function0, function02, z, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Modifier modifier, boolean z, boolean z2, float f, float f2, long j, float f3, int i, int i2, Composer composer, int i3) {
        component1(modifier, z, z2, f, f2, j, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit component2(Modifier modifier, float f, long j, float f2, Function2 function2, int i, int i2, Composer composer, int i3) {
        m12288CaptureButtonRingT042LqI(modifier, f, j, f2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ShareDataUIState(Modifier modifier, boolean z, Function0 function0, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(function0, "");
        CaptureButtonWrapper(modifier, z, function0, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ShareDataUIState(Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        component2((Function1<? super m, Unit>) function1, (Function1<? super m, Unit>) function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit ShareDataUIState(int i, Composer composer, int i2) {
        ShareDataUIState(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit component1(int i, Composer composer, int i2) {
        copydefault(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i, Composer composer, int i2) {
        component3(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }
}
