package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.sharedui.compose.databinding.ActivityComposeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.CoroutineContext;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "binding", "Lcom/safaricom/sharedui/compose/databinding/ActivityComposeBinding;", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release", "uiState", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class CostCalculatorActivity extends Hilt_CostCalculatorActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static long component3;
    private static short[] component4;
    private static int copy;
    private static int copydefault;
    private static byte[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private ActivityComposeBinding binding;

    private final Lazy viewModel;
    private static final byte[] $$c = {120, -46, -95, -23};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {89, 120, -98, -110, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50};
    private static final int $$h = 83;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 10;
    private static int getSponsorBeneficiariesState = 0;
    private static int ArtificialStackFrames = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.$$c
            int r7 = r7 + 102
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.$$i(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = 28 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.$$a
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-8)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.$$g
            int r8 = r8 * 6
            int r8 = r8 + 10
            int r9 = r9 * 16
            int r9 = 99 - r9
            int r7 = r7 * 3
            int r7 = 36 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-17)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.e(short, byte, int, java.lang.Object[]):void");
    }

    public static final CostCalculatorViewModel access$getViewModel(CostCalculatorActivity costCalculatorActivity) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 125;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModel viewModel = costCalculatorActivity.getViewModel();
        int i4 = getSponsorBeneficiariesState + 75;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return viewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CostCalculatorActivity() {
        final CostCalculatorActivity costCalculatorActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CostCalculatorViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i = 2 % 2;
                int i2 = component3 + 29;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    viewModelStore = costCalculatorActivity.getViewModelStore();
                    int i3 = 47 / 0;
                } else {
                    viewModelStore = costCalculatorActivity.getViewModelStore();
                }
                int i4 = copydefault + 75;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 121;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 43;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 123;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 69;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = costCalculatorActivity.getDefaultViewModelProviderFactory();
                if (i3 != 0) {
                    int i4 = 62 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 93;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 39;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (i6 != 0) {
                        throw null;
                    }
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return costCalculatorActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 9;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final CostCalculatorViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 15;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        CostCalculatorViewModel costCalculatorViewModel = (CostCalculatorViewModel) this.viewModel.getValue();
        int i3 = getSponsorBeneficiariesState + 5;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return costCalculatorViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component2;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component2;
            final CostCalculatorActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 71;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component2(CostCalculatorActivity costCalculatorActivity, long j) {
                int i = 2 % 2;
                int i2 = component2 + 107;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(costCalculatorActivity, "");
                costCalculatorActivity.getWindow().setStatusBarColor(ColorKt.m6108toArgb8_81llA(j));
                costCalculatorActivity.getWindow().setNavigationBarColor(ColorKt.m6108toArgb8_81llA(j));
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 103;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component2(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 83;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0 ? (i & 11) == 2 : (i & 111) == 4) {
                    int i5 = i3 + 25;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(composer);
                final long background = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground();
                composer.startReplaceGroup(402147070);
                if (!((View) objConsume).isInEditMode()) {
                    final CostCalculatorActivity costCalculatorActivity = this.copydefault;
                    EffectsKt.SideEffect(new Function0() {
                        private static int ShareDataUIState = 0;
                        private static int component1 = 1;

                        @Override
                        public final Object invoke() {
                            int i7 = 2 % 2;
                            int i8 = ShareDataUIState + 103;
                            component1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                CostCalculatorActivity.component2.AnonymousClass4.ShareDataUIState(costCalculatorActivity, background);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            Unit unitShareDataUIState = CostCalculatorActivity.component2.AnonymousClass4.ShareDataUIState(costCalculatorActivity, background);
                            int i9 = ShareDataUIState + 103;
                            component1 = i9 % 128;
                            int i10 = i9 % 2;
                            return unitShareDataUIState;
                        }
                    }, composer, 0);
                    int i7 = ShareDataUIState + 49;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                }
                composer.endReplaceGroup();
                CostCalculatorUiState costCalculatorUiStateComponent2 = component2((State<CostCalculatorUiState>) FlowExtKt.collectAsStateWithLifecycle(CostCalculatorActivity.access$getViewModel(this.copydefault).getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(CostCalculatorActivity.access$getViewModel(this.copydefault));
                final CostCalculatorActivity costCalculatorActivity2 = this.copydefault;
                CostCalculatorScreenKt.CostCalculatorScreen(costCalculatorUiStateComponent2, anonymousClass5, new Function0() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = copydefault + 53;
                        component1 = i10 % 128;
                        if (i10 % 2 != 0) {
                            CostCalculatorActivity.component2.AnonymousClass4.component2(costCalculatorActivity2);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Unit unitComponent2 = CostCalculatorActivity.component2.AnonymousClass4.component2(costCalculatorActivity2);
                        int i11 = component1 + 107;
                        copydefault = i11 % 128;
                        int i12 = i11 % 2;
                        return unitComponent2;
                    }
                }, composer, 0);
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass5 extends FunctionReferenceImpl implements Function1<CostCalculatorEvent, Unit> {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                public final void component3(CostCalculatorEvent costCalculatorEvent) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 59;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
                        ((CostCalculatorViewModel) this.receiver).onEvent(costCalculatorEvent);
                    } else {
                        Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
                        ((CostCalculatorViewModel) this.receiver).onEvent(costCalculatorEvent);
                        throw null;
                    }
                }

                @Override
                public Unit invoke(CostCalculatorEvent costCalculatorEvent) {
                    int i = 2 % 2;
                    int i2 = copydefault + 55;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    component3(costCalculatorEvent);
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 77;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass5(Object obj) {
                    super(1, obj, CostCalculatorViewModel.class, "onEvent", "onEvent(Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;)V", 0);
                }
            }

            private static final Unit copydefault(CostCalculatorActivity costCalculatorActivity) {
                int i = 2 % 2;
                int i2 = component2 + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(costCalculatorActivity, "");
                costCalculatorActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 31;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final CostCalculatorUiState component2(State<CostCalculatorUiState> state) {
                int i = 2 % 2;
                int i2 = component2 + 57;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CostCalculatorUiState value = state.getValue();
                int i4 = component2 + 101;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            public static Unit component2(CostCalculatorActivity costCalculatorActivity) {
                int i = 2 % 2;
                int i2 = component2 + 19;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return copydefault(costCalculatorActivity);
                }
                copydefault(costCalculatorActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState(CostCalculatorActivity costCalculatorActivity, long j) {
                int i = 2 % 2;
                int i2 = component2 + 89;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(costCalculatorActivity, j);
                int i4 = component2 + 97;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 58 / 0;
                }
                return unitComponent2;
            }

            AnonymousClass4(CostCalculatorActivity costCalculatorActivity) {
                this.copydefault = costCalculatorActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 91;
            ShareDataUIState = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component3(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            component3(composer2, num2.intValue());
            Unit unit2 = Unit.INSTANCE;
            int i3 = component2 + 85;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            return unit2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            if (r11.getSkipping() == false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        
            r12 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.ShareDataUIState + 65;
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.component2 = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            r11.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r11.getSkipping() == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.runtime.Composer r11, int r12) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                r12 = r12 & 11
                if (r12 != r0) goto L31
                int r12 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.component2
                int r12 = r12 + 111
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.ShareDataUIState = r1
                int r12 = r12 % r0
                if (r12 != 0) goto L1d
                boolean r12 = r11.getSkipping()
                r1 = 26
                int r1 = r1 / 0
                if (r12 != 0) goto L2d
                goto L23
            L1d:
                boolean r12 = r11.getSkipping()
                if (r12 != 0) goto L2d
            L23:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.ShareDataUIState
                int r12 = r12 + 65
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.component2 = r1
                int r12 = r12 % r0
                goto L31
            L2d:
                r11.skipToGroupEnd()
                goto L53
            L31:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2$4 r12 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2$4
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.this
                r12.<init>(r6)
                r6 = 54
                r7 = -858939931(0xffffffffcccd9de5, float:-1.0780241E8)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.component2.component3(androidx.compose.runtime.Composer, int):void");
        }

        component2() {
        }
    }

    private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 53;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            c2 = '0';
            if (notifyVar.copydefault >= cArr.length) {
                break;
            }
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 3267, (Process.myPid() >> 22) + 33, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 60268), -834797019, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 686, 33 - ExpandableListView.getPackedPositionChild(0L), (char) (Color.blue(0) + 60373), -1969106284, false, $$i(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 3);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 33 - TextUtils.lastIndexOf("", c2, 0, 0), (char) (MotionEvent.axisFromString("") + 60374), -1969106284, false, $$i(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i6 = $11 + 41;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                c2 = '0';
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component1[i - i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - TextUtils.indexOf("", "", 0, 0), 34 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1159210934, false, $$i(b2, (byte) (b2 | 19), b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(component2), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 3608, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7170), 1951385784, false, $$i(b3, (byte) (b3 | Ascii.SI), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {cancelnotification, cancelnotification};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                            if (objCopydefault3 == null) {
                                byte b4 = (byte) 0;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27761), -1529629956, false, $$i(b4, (byte) (b4 | 20), b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i6 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, (char) ExpandableListView.getPackedPositionGroup(0L), 1159210934, false, $$i(b5, (byte) (b5 | 19), b5), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(component2), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (KeyEvent.getMaxKeyCode() >> 16), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7171), 1951385784, false, $$i(b6, (byte) (b6 | Ascii.SI), b6), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 4013, TextUtils.indexOf((CharSequence) "", '0', 0) + 25, (char) (27762 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1529629956, false, $$i(b7, (byte) (b7 | 20), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i7 = $10 + 91;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr8 = {cancelnotification, cancelnotification};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault7 == null) {
                    byte b8 = (byte) 0;
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getOffsetBefore("", 0), 24 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (27761 - View.getDefaultSize(0, 0)), -1529629956, false, $$i(b8, (byte) (b8 | 20), b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault7).invoke(null, objArr8);
                int i8 = 85 / 0;
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr9 = {cancelnotification, cancelnotification};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault8 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(4012 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, (char) (Color.blue(0) + 27761), -1529629956, false, $$i(b9, (byte) (b9 | 20), b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 998, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, (char) (TextUtils.getTrimmedLength("") + 61685), 1874745193, false, $$i(b3, (byte) (b3 | Ascii.VT), b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = getAsAtTimestamp;
                if (bArr != null) {
                    int i6 = $10 + 117;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 2984, 48 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (54462 - View.MeasureSpec.getMode(0)), -1178636483, false, $$i(b4, (byte) (b4 | Ascii.SO), b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getAsAtTimestamp;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1000 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 31, (char) (61684 - TextUtils.lastIndexOf("", '0')), 1874745193, false, $$i(b5, (byte) (b5 | Ascii.VT), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10;
                int i10 = i9 + 83;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                int i12 = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ 7083766810336261929L));
                if (z) {
                    int i13 = i9 + 39;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i12 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(copy), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((-16775519) - Color.rgb(0, 0, 0), 36 - ExpandableListView.getPackedPositionChild(0L), (char) TextUtils.indexOf("", ""), -1454191902, false, $$i(b6, (byte) (b6 | 10), b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = getAsAtTimestamp;
                if (bArr4 != null) {
                    int i15 = $11 + 3;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        int i18 = $10 + 73;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            byte[] bArr6 = getAsAtTimestamp;
                            getsmalliconid.copydefault = getsmalliconid.copydefault / 0;
                            c2 = (char) (getsmalliconid.component3 << (((byte) (((byte) (((long) bArr6[r8]) * 7083766810336261929L)) >> s)) ^ b2));
                        } else {
                            byte[] bArr7 = getAsAtTimestamp;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            c2 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        getsmalliconid.component1 = c2;
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2, still in use, count: 4, list:
          (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) from 0x18eb: MOVE (r38v2 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) = (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2)
          (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) from 0x187b: MOVE (r38v4 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) = (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2)
          (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) from 0x1860: MOVE (r38v6 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) = (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2)
          (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) from 0x16a9: MOVE (r38v8 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2) = (r1v190 com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity$component2)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override
    public void onCreate(android.os.Bundle r47) {
        /*
            Method dump skipped, instruction units count: 9384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.onCreate(android.os.Bundle):void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1661104266
        	at java.base/java.util.ArrayList.<init>(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override
    public void onStart() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.ArtificialStackFrames
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = kotlin.registerForActivityResult.copydefault
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.Context r4 = r4.getApplicationContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131952718(0x7f13044e, float:1.9541887E38)
            java.lang.String r4 = r4.getString(r5)
            r5 = 6
            r6 = 7
            java.lang.String r4 = r4.substring(r5, r6)
            int r4 = r4.length()
            r5 = 1790204058(0x6ab4589a, float:1.0901253E26)
            int r4 = r4 + r5
            r5 = -10838065(0xffffffffff5a9fcf, float:-2.9060148E38)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = 235537414(0xe0a0406, float:1.701175E-30)
            r6 = r6 | r7
            int r6 = r6 * 449
            r8 = -1340033670(0xffffffffb020b57a, float:-5.8465555E-10)
            int r6 = r6 + r8
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r4 = r4 | r7
            int r4 = r4 * 449
            int r6 = r6 + r4
            if (r1 == r6) goto L83
            r1 = -1661104266(0xffffffff9cfd8f76, float:-1.6779219E-21)
            int[] r1 = new int[r1]
            r4 = -1661104267(0xffffffff9cfd8f75, float:-1.6779218E-21)
            r5 = 1
            r1[r4] = r5
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.getSponsorBeneficiariesState
            int r1 = r1 + 73
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.ArtificialStackFrames = r4
            int r1 = r1 % r0
        L83:
            java.lang.reflect.Member[] r1 = kotlin.removeOnNewIntentListener.component2
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r9)
            r4 = 1948011092(0x741c4a54, float:4.9530387E31)
            r5 = r2 | r4
            int r5 = ~r5
            int r5 = r5 * 420
            r6 = 18426620(0x1192afc, float:2.8132502E-38)
            int r5 = r5 + r6
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = ~r2
            r4 = 604522564(0x24084844, float:2.955151E-17)
            r2 = r2 | r4
            int r2 = r2 * 420
            int r5 = r5 + r2
            if (r1 == r5) goto Lbc
            int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.getSponsorBeneficiariesState
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.ArtificialStackFrames = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Lb8
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            throw r3
        Lb8:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            throw r3
        Lbc:
            super.onStart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01a8  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 97;
        getSponsorBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                a((char) ExpandableListView.getPackedPositionGroup(0L), 18 - (ViewConfiguration.getEdgeSlop() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 25, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).length() - 1), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 14, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i3 = ArtificialStackFrames + 7;
                getSponsorBeneficiariesState = i3 % 128;
                if (i3 % 2 == 0) {
                    baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
                } else {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
            }
            if (baseContext != null) {
                int i4 = getSponsorBeneficiariesState + 11;
                ArtificialStackFrames = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.keyCodeFromString(""), 42 - Color.green(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 56 - TextUtils.indexOf("", ""), (char) (TextUtils.lastIndexOf("", '0') + 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            super.onPause();
            return;
        }
        getBaseContext();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0e5a A[Catch: all -> 0x06d5, TryCatch #11 {all -> 0x06d5, blocks: (B:194:0x0e54, B:196:0x0e5a, B:197:0x0e84, B:403:0x1aa8, B:405:0x1aae, B:406:0x1adb, B:516:0x2062, B:518:0x2068, B:519:0x2091, B:735:0x3452, B:737:0x3458, B:738:0x3480, B:772:0x377b, B:774:0x3781, B:775:0x37a3, B:752:0x35ce, B:754:0x35f1, B:755:0x363f, B:701:0x311c, B:703:0x3122, B:704:0x3152, B:593:0x2a0e, B:595:0x2a14, B:596:0x2a3c, B:598:0x2a76, B:599:0x2abf, B:564:0x268c, B:566:0x26a1, B:567:0x26cd, B:569:0x2701, B:570:0x2779, B:797:0x387e, B:799:0x3884, B:800:0x38ad, B:802:0x38e7, B:803:0x392f, B:532:0x2266, B:534:0x227b, B:535:0x22ab, B:322:0x15f7, B:324:0x15fd, B:325:0x162c, B:73:0x0885, B:75:0x088b, B:76:0x08b8, B:19:0x02f5, B:21:0x02fb, B:22:0x0321, B:24:0x0643, B:26:0x0675, B:27:0x06cf), top: B:837:0x02f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0f50 A[Catch: all -> 0x1529, PHI: r2 r9
  0x0f50: PHI (r2v572 java.lang.Object) = (r2v560 java.lang.Object), (r2v571 java.lang.Object) binds: [B:202:0x0f07, B:203:0x0f09] A[DONT_GENERATE, DONT_INLINE]
  0x0f50: PHI (r9v194 ??) = (r9v338 ??), (r9v339 ??) binds: [B:202:0x0f07, B:203:0x0f09] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x1529, blocks: (B:201:0x0f03, B:207:0x0f50, B:211:0x0fbc, B:230:0x1048), top: B:819:0x0f03 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0f77  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0fd2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x102e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x13e2 A[Catch: all -> 0x1509, TryCatch #48 {all -> 0x1509, blocks: (B:262:0x13d3, B:263:0x13d7, B:266:0x13e2, B:269:0x13fe, B:232:0x1056, B:249:0x12af, B:252:0x12ff, B:257:0x1373, B:261:0x13cb), top: B:904:0x1056 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x15fd A[Catch: all -> 0x06d5, TryCatch #11 {all -> 0x06d5, blocks: (B:194:0x0e54, B:196:0x0e5a, B:197:0x0e84, B:403:0x1aa8, B:405:0x1aae, B:406:0x1adb, B:516:0x2062, B:518:0x2068, B:519:0x2091, B:735:0x3452, B:737:0x3458, B:738:0x3480, B:772:0x377b, B:774:0x3781, B:775:0x37a3, B:752:0x35ce, B:754:0x35f1, B:755:0x363f, B:701:0x311c, B:703:0x3122, B:704:0x3152, B:593:0x2a0e, B:595:0x2a14, B:596:0x2a3c, B:598:0x2a76, B:599:0x2abf, B:564:0x268c, B:566:0x26a1, B:567:0x26cd, B:569:0x2701, B:570:0x2779, B:797:0x387e, B:799:0x3884, B:800:0x38ad, B:802:0x38e7, B:803:0x392f, B:532:0x2266, B:534:0x227b, B:535:0x22ab, B:322:0x15f7, B:324:0x15fd, B:325:0x162c, B:73:0x0885, B:75:0x088b, B:76:0x08b8, B:19:0x02f5, B:21:0x02fb, B:22:0x0321, B:24:0x0643, B:26:0x0675, B:27:0x06cf), top: B:837:0x02f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x16b5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x170a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x1765 A[Catch: all -> 0x1a1a, TRY_ENTER, TRY_LEAVE, TryCatch #57 {all -> 0x1a1a, blocks: (B:329:0x16af, B:336:0x16fd, B:346:0x1765), top: B:921:0x16af }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x191d  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1aae A[Catch: all -> 0x06d5, TryCatch #11 {all -> 0x06d5, blocks: (B:194:0x0e54, B:196:0x0e5a, B:197:0x0e84, B:403:0x1aa8, B:405:0x1aae, B:406:0x1adb, B:516:0x2062, B:518:0x2068, B:519:0x2091, B:735:0x3452, B:737:0x3458, B:738:0x3480, B:772:0x377b, B:774:0x3781, B:775:0x37a3, B:752:0x35ce, B:754:0x35f1, B:755:0x363f, B:701:0x311c, B:703:0x3122, B:704:0x3152, B:593:0x2a0e, B:595:0x2a14, B:596:0x2a3c, B:598:0x2a76, B:599:0x2abf, B:564:0x268c, B:566:0x26a1, B:567:0x26cd, B:569:0x2701, B:570:0x2779, B:797:0x387e, B:799:0x3884, B:800:0x38ad, B:802:0x38e7, B:803:0x392f, B:532:0x2266, B:534:0x227b, B:535:0x22ab, B:322:0x15f7, B:324:0x15fd, B:325:0x162c, B:73:0x0885, B:75:0x088b, B:76:0x08b8, B:19:0x02f5, B:21:0x02fb, B:22:0x0321, B:24:0x0643, B:26:0x0675, B:27:0x06cf), top: B:837:0x02f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1bbb  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1c19 A[Catch: all -> 0x1f8e, TRY_ENTER, TRY_LEAVE, TryCatch #52 {all -> 0x1f8e, blocks: (B:410:0x1b5a, B:416:0x1bae, B:425:0x1c19), top: B:912:0x1b5a }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x1e4b A[Catch: all -> 0x1f8b, TryCatch #49 {all -> 0x1f8b, blocks: (B:457:0x1e41, B:458:0x1e45, B:460:0x1e4b, B:463:0x1e66, B:427:0x1c27, B:445:0x1d2d, B:448:0x1d74, B:452:0x1dde, B:456:0x1e3b), top: B:906:0x1c27 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x2068 A[Catch: all -> 0x06d5, TryCatch #11 {all -> 0x06d5, blocks: (B:194:0x0e54, B:196:0x0e5a, B:197:0x0e84, B:403:0x1aa8, B:405:0x1aae, B:406:0x1adb, B:516:0x2062, B:518:0x2068, B:519:0x2091, B:735:0x3452, B:737:0x3458, B:738:0x3480, B:772:0x377b, B:774:0x3781, B:775:0x37a3, B:752:0x35ce, B:754:0x35f1, B:755:0x363f, B:701:0x311c, B:703:0x3122, B:704:0x3152, B:593:0x2a0e, B:595:0x2a14, B:596:0x2a3c, B:598:0x2a76, B:599:0x2abf, B:564:0x268c, B:566:0x26a1, B:567:0x26cd, B:569:0x2701, B:570:0x2779, B:797:0x387e, B:799:0x3884, B:800:0x38ad, B:802:0x38e7, B:803:0x392f, B:532:0x2266, B:534:0x227b, B:535:0x22ab, B:322:0x15f7, B:324:0x15fd, B:325:0x162c, B:73:0x0885, B:75:0x088b, B:76:0x08b8, B:19:0x02f5, B:21:0x02fb, B:22:0x0321, B:24:0x0643, B:26:0x0675, B:27:0x06cf), top: B:837:0x02f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x2120  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x2170  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x2247  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x23e0  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x2f68  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x2f9e A[Catch: all -> 0x3051, TryCatch #10 {all -> 0x3051, blocks: (B:667:0x2f98, B:669:0x2f9e, B:670:0x2fcb), top: B:835:0x2f98, outer: #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:709:0x31d9  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x322a  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x327b  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x3430  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x3516  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x355d  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x35b0  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x375d  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x3844  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02ca A[PHI: r10
  0x02ca: PHI (r10v226 ??) = (r10v6 ??), (r10v227 ??) binds: [B:17:0x02f0, B:5:0x02c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:817:0x1b60 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0f09 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:957:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v186 */
    /* JADX WARN: Type inference failed for: r10v189 */
    /* JADX WARN: Type inference failed for: r10v190 */
    /* JADX WARN: Type inference failed for: r10v191 */
    /* JADX WARN: Type inference failed for: r10v192 */
    /* JADX WARN: Type inference failed for: r10v203 */
    /* JADX WARN: Type inference failed for: r10v206, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v207 */
    /* JADX WARN: Type inference failed for: r10v208 */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v212 */
    /* JADX WARN: Type inference failed for: r10v213 */
    /* JADX WARN: Type inference failed for: r10v221 */
    /* JADX WARN: Type inference failed for: r10v226 */
    /* JADX WARN: Type inference failed for: r10v227 */
    /* JADX WARN: Type inference failed for: r10v228 */
    /* JADX WARN: Type inference failed for: r10v229 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v230 */
    /* JADX WARN: Type inference failed for: r10v231 */
    /* JADX WARN: Type inference failed for: r10v232 */
    /* JADX WARN: Type inference failed for: r10v233 */
    /* JADX WARN: Type inference failed for: r10v234 */
    /* JADX WARN: Type inference failed for: r10v235 */
    /* JADX WARN: Type inference failed for: r10v236 */
    /* JADX WARN: Type inference failed for: r10v237 */
    /* JADX WARN: Type inference failed for: r10v238 */
    /* JADX WARN: Type inference failed for: r10v239 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v240 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v109, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v454, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v457 */
    /* JADX WARN: Type inference failed for: r2v458 */
    /* JADX WARN: Type inference failed for: r2v459 */
    /* JADX WARN: Type inference failed for: r2v460 */
    /* JADX WARN: Type inference failed for: r2v474 */
    /* JADX WARN: Type inference failed for: r2v478 */
    /* JADX WARN: Type inference failed for: r2v483 */
    /* JADX WARN: Type inference failed for: r2v499, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v500 */
    /* JADX WARN: Type inference failed for: r2v501 */
    /* JADX WARN: Type inference failed for: r2v503 */
    /* JADX WARN: Type inference failed for: r2v513 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v622 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v722 */
    /* JADX WARN: Type inference failed for: r2v723 */
    /* JADX WARN: Type inference failed for: r2v724 */
    /* JADX WARN: Type inference failed for: r2v725 */
    /* JADX WARN: Type inference failed for: r33v106 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v140 */
    /* JADX WARN: Type inference failed for: r33v141 */
    /* JADX WARN: Type inference failed for: r33v144 */
    /* JADX WARN: Type inference failed for: r33v145 */
    /* JADX WARN: Type inference failed for: r33v146 */
    /* JADX WARN: Type inference failed for: r33v147 */
    /* JADX WARN: Type inference failed for: r33v148 */
    /* JADX WARN: Type inference failed for: r33v149 */
    /* JADX WARN: Type inference failed for: r33v150 */
    /* JADX WARN: Type inference failed for: r33v66 */
    /* JADX WARN: Type inference failed for: r33v67 */
    /* JADX WARN: Type inference failed for: r33v68 */
    /* JADX WARN: Type inference failed for: r33v69 */
    /* JADX WARN: Type inference failed for: r33v70 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v82 */
    /* JADX WARN: Type inference failed for: r33v83 */
    /* JADX WARN: Type inference failed for: r33v84 */
    /* JADX WARN: Type inference failed for: r33v85 */
    /* JADX WARN: Type inference failed for: r33v86 */
    /* JADX WARN: Type inference failed for: r3v624, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v627 */
    /* JADX WARN: Type inference failed for: r3v628 */
    /* JADX WARN: Type inference failed for: r3v629 */
    /* JADX WARN: Type inference failed for: r3v630 */
    /* JADX WARN: Type inference failed for: r3v643 */
    /* JADX WARN: Type inference failed for: r3v645 */
    /* JADX WARN: Type inference failed for: r3v653 */
    /* JADX WARN: Type inference failed for: r3v654 */
    /* JADX WARN: Type inference failed for: r4v501, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v502 */
    /* JADX WARN: Type inference failed for: r4v503 */
    /* JADX WARN: Type inference failed for: r4v504 */
    /* JADX WARN: Type inference failed for: r4v505 */
    /* JADX WARN: Type inference failed for: r4v522 */
    /* JADX WARN: Type inference failed for: r4v523 */
    /* JADX WARN: Type inference failed for: r4v589 */
    /* JADX WARN: Type inference failed for: r4v590 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v118 */
    /* JADX WARN: Type inference failed for: r9v119 */
    /* JADX WARN: Type inference failed for: r9v120 */
    /* JADX WARN: Type inference failed for: r9v141 */
    /* JADX WARN: Type inference failed for: r9v142 */
    /* JADX WARN: Type inference failed for: r9v143 */
    /* JADX WARN: Type inference failed for: r9v144 */
    /* JADX WARN: Type inference failed for: r9v147 */
    /* JADX WARN: Type inference failed for: r9v148 */
    /* JADX WARN: Type inference failed for: r9v153 */
    /* JADX WARN: Type inference failed for: r9v154 */
    /* JADX WARN: Type inference failed for: r9v155 */
    /* JADX WARN: Type inference failed for: r9v156 */
    /* JADX WARN: Type inference failed for: r9v159 */
    /* JADX WARN: Type inference failed for: r9v164 */
    /* JADX WARN: Type inference failed for: r9v165 */
    /* JADX WARN: Type inference failed for: r9v172 */
    /* JADX WARN: Type inference failed for: r9v181 */
    /* JADX WARN: Type inference failed for: r9v194 */
    /* JADX WARN: Type inference failed for: r9v195 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v228 */
    /* JADX WARN: Type inference failed for: r9v229 */
    /* JADX WARN: Type inference failed for: r9v230 */
    /* JADX WARN: Type inference failed for: r9v231 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v239 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v245, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v248 */
    /* JADX WARN: Type inference failed for: r9v254 */
    /* JADX WARN: Type inference failed for: r9v261 */
    /* JADX WARN: Type inference failed for: r9v262 */
    /* JADX WARN: Type inference failed for: r9v263 */
    /* JADX WARN: Type inference failed for: r9v264 */
    /* JADX WARN: Type inference failed for: r9v265 */
    /* JADX WARN: Type inference failed for: r9v281 */
    /* JADX WARN: Type inference failed for: r9v295 */
    /* JADX WARN: Type inference failed for: r9v296 */
    /* JADX WARN: Type inference failed for: r9v297 */
    /* JADX WARN: Type inference failed for: r9v298 */
    /* JADX WARN: Type inference failed for: r9v299 */
    /* JADX WARN: Type inference failed for: r9v300 */
    /* JADX WARN: Type inference failed for: r9v301 */
    /* JADX WARN: Type inference failed for: r9v304 */
    /* JADX WARN: Type inference failed for: r9v305 */
    /* JADX WARN: Type inference failed for: r9v306 */
    /* JADX WARN: Type inference failed for: r9v308 */
    /* JADX WARN: Type inference failed for: r9v311 */
    /* JADX WARN: Type inference failed for: r9v325 */
    /* JADX WARN: Type inference failed for: r9v326 */
    /* JADX WARN: Type inference failed for: r9v327 */
    /* JADX WARN: Type inference failed for: r9v328 */
    /* JADX WARN: Type inference failed for: r9v329 */
    /* JADX WARN: Type inference failed for: r9v330 */
    /* JADX WARN: Type inference failed for: r9v331 */
    /* JADX WARN: Type inference failed for: r9v332 */
    /* JADX WARN: Type inference failed for: r9v333 */
    /* JADX WARN: Type inference failed for: r9v334 */
    /* JADX WARN: Type inference failed for: r9v335 */
    /* JADX WARN: Type inference failed for: r9v336 */
    /* JADX WARN: Type inference failed for: r9v337 */
    /* JADX WARN: Type inference failed for: r9v338 */
    /* JADX WARN: Type inference failed for: r9v339 */
    /* JADX WARN: Type inference failed for: r9v340 */
    /* JADX WARN: Type inference failed for: r9v341 */
    /* JADX WARN: Type inference failed for: r9v342 */
    /* JADX WARN: Type inference failed for: r9v343 */
    /* JADX WARN: Type inference failed for: r9v344 */
    /* JADX WARN: Type inference failed for: r9v345 */
    /* JADX WARN: Type inference failed for: r9v346 */
    /* JADX WARN: Type inference failed for: r9v347 */
    /* JADX WARN: Type inference failed for: r9v348 */
    /* JADX WARN: Type inference failed for: r9v349 */
    /* JADX WARN: Type inference failed for: r9v350 */
    /* JADX WARN: Type inference failed for: r9v351 */
    /* JADX WARN: Type inference failed for: r9v352 */
    /* JADX WARN: Type inference failed for: r9v353 */
    /* JADX WARN: Type inference failed for: r9v354 */
    /* JADX WARN: Type inference failed for: r9v355 */
    /* JADX WARN: Type inference failed for: r9v356 */
    /* JADX WARN: Type inference failed for: r9v357 */
    /* JADX WARN: Type inference failed for: r9v358 */
    /* JADX WARN: Type inference failed for: r9v359 */
    /* JADX WARN: Type inference failed for: r9v360 */
    /* JADX WARN: Type inference failed for: r9v361 */
    /* JADX WARN: Type inference failed for: r9v362 */
    /* JADX WARN: Type inference failed for: r9v363 */
    /* JADX WARN: Type inference failed for: r9v364 */
    /* JADX WARN: Type inference failed for: r9v367 */
    /* JADX WARN: Type inference failed for: r9v368 */
    /* JADX WARN: Type inference failed for: r9v369 */
    /* JADX WARN: Type inference failed for: r9v370 */
    /* JADX WARN: Type inference failed for: r9v371 */
    /* JADX WARN: Type inference failed for: r9v372 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86 */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getRequestBeneficiariesState = 1;
        component2();
        component3();
        int i = equals + 25;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 91;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        component3 = 5410473733558317624L;
        int i5 = i3 + 99;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component2() {
        component1 = new char[]{3095, 25619, 56324, 13349, 44085, 1064, 31824, 54293, 19521, 42086, 7222, 29791, 60544, 17558, 48271, 5302, 36021, 58558, 3095, 25619, 56324, 13349, 44085, 1064, 31824, 54293, 19535, 42085, 7272, 29729, 60595, 17562, 48280, 5306, 36016, 58532, 23748, 46302, 11518, 34041, 64758, 21742, 52511, 9473, 3093, 25608, 56338, 13349, 44095, 1071, 31808, 54394, 19550, 42085, 7284, 29798, 60561, 17560, 48280, 5306, 36009, 58531, 3140, 25625, 56403, 13414, 44138, 1141, 31831, 54360, 19484, 42099, 7209, 29755, 60619, 17615, 48271, 5296, 36085, 58621, 23688, 46277, 11418, 34039, 64692, 21688, 52550, 9478, 40204, 62828, 28020, 50545, 15626, 38209, 3366, 25893, 56675, 13717, 44447, 1413, 32229, 54712, 19885, 42381, 7553, 30110, 60916, 17836, 48569, 5698, 36354, 58975, 24113, 46629, 11901, 34313, 65090, 22035, 52776, 9782, 40497, 63175, 28369, 50896, 16106, 38650, 3142, 25627, 56408, 13363, 44139, 1143, 31750, 54286, 19480, 42102, 7291, 29801, 60613, 17609, 48345, 5297, 36003, 58542, 23685, 46226, 11416, 33958, 64700, 21693, 52554, 9473, 40286, 62828, 27942, 50554, 15631, 38213, 3366, 25899, 56675, 13767, 44491, 1413, 32236, 54718, 19961, 42371, 7553, 30104, 60834, 17824, 48574, 5648, 36439, 58970, 24115, 46718, 11899, 34305, 65044, 22089, 52863, 9824, 40496, 63181, 28372, 50909, 16105, 38560, 3102, 25609, 56340, 13351, 44073, 1147, 31771, 54292, 19480, 42016, 7200, 29752, 60609, 17567, 48344, 5350, 36087, 58619, 23682, 46229, 11422, 33958, 64743, 21737, 52560, 9489, 40192, 62765, 27943, 50472, 15688, 38208, 3447, 25966, 56692, 13785, 44445, 1428, 32181, 54697, 19882, 42438, 7625, 30170, 60915, 17899, 48617, 5725, 36357, 58882, 24125, 46696, 11819, 34369, 65101, 22020, 52855, 9835, 40559, 63130, 28305, 50845, 16115, 38581, 3716, 26258, 57029, 14049, 44799, 1775, 32512, 55048, 6904, 29350, 51947, 8843, 47748, 4760, 27324, 49895, 23273, 45775, 2754, 25309, 64040, 21054, 43570, 524, 39449, 61969, 19063, 41516, 14964, 37451, 59916, 16972, 56226, 13290, 35766, 58320, 31632, 54167, 11247, 33791, 7069, 29635, 52189, 9005, 51621, 41381, 6575, 61839, 27085, 49556, 47596, 4588, 35312, 24962, 55794, 45519, 10552, 33076, 31024, 53511, 3095, 25619, 56324, 13349, 44085, 1064, 31824, 54293, 19521, 42086, 7222, 29788, 60555, 17546, 48280, 5302, 36011, 58510, 23772, 46280, 11465, 34042, 3091, 25617, 56321, 13351, 44073, 1060, 31824, 54377, 19531, 42100, 7284, 29819, 60571, 17556, 48265, 3150, 25676, 56406, 13415, 44142, 1138, 31747, 54275, 19480, 42023, 7212, 3138, 25679, 56409, 13411, 44131, 1143, 31747, 54281, 19479, 42019, 7208, 3151, 25674, 56325, 13366, 44137, 1056, 31746, 54366, 19533, 42020, 7200, 29752, 60612, 17564, 48264, 5303, 36083, 58622, 23688, 46226, 11420, 33953, 64688, 21738, 52551, 9556, 40202, 62831, 28019, 50476, 15630, 38161, 3375, 25902, 56632, 13774, 44493, 1493, 32236, 54763, 19965, 42372, 7646, 30107, 60838, 17836, 48568, 5648, 36433, 58892, 24117, 46719, 11901, 34384, 65095, 22042, 52856, 9827, 40506, 63178, 28372, 50827, 16056, 38645, 540, 27153, 53770, 14907, 41528, 2594, 29273, 55897, 16964, 43638, 4727, 3150, 25672, 56408, 13422, 44131, 1138, 31744, 54286, 19479, 42023};
        component2 = 5178124884573578365L;
        copydefault = 1154759618;
        ShareDataUIState = -238323844;
        copy = 257422880;
        getAsAtTimestamp = new byte[]{-118, -31, -87, -103, -23, 36, -78, 38, PSSSigner.TRAILER_IMPLICIT, 39, 57, -52, 57, -19, -66, -80, -80, -10, 39, 38, -77, PSSSigner.TRAILER_IMPLICIT, 38, -23, -55, -23, -65, -10, -106, -78, -59, -105, -77, -65, -10, -105, -64, -27, Base64.padSymbol, -77, -78, -62, -30, -54, -75, -105, -80, -61, -20, 59, -37, -106, -71, -112, -112, -90, -63, -107, 44, -69, -107, -14, -7, -113, -59, -53, -107, -58, -55, -63, -101, 70, 84, 71, -17, -24, -77, 71, PSSSigner.TRAILER_IMPLICIT, -77, -23, 84, -73, -22, -69, -75, 84, -75, 86, -104, -21, 83, -24, -104, -69, 69, -23, -24, 66, -19, -77, -67, 65, -102, 85, -73, -24, -69, 71, 66, -24, -74, 71, 68, -67, -74, 87, -23, -76, 85, -24, -24, -75, -21, 87, -73, -70, -80, -23, -23, 85, -102, -67, -75, 9, 8, -80, TarHeader.LF_FIFO, -65, -67, TarHeader.LF_CONTIG, 9, PSSSigner.TRAILER_IMPLICIT, 10, -85, 101, -87, 111, -85, 99, -87, 101, -84, 41, 41, 41, 41, 41, 41, 41};
    }
}
