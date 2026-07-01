package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesEvent;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesUiState;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.sharedui.compose.databinding.ActivityComposeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ImmLeaksCleaner;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/FavouriteBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "binding", "Lcom/safaricom/sharedui/compose/databinding/ActivityComposeBinding;", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release", "uiState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FavouriteBundlesActivity extends Hilt_FavouriteBundlesActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static int component1;
    private static boolean component2;
    private static boolean component3;
    private static int[] copydefault;
    private static long equals;
    private static int getAsAtTimestamp;
    private ActivityComposeBinding binding;

    private final Lazy viewModel;
    private static final byte[] $$c = {4, -80, 45, 109};
    private static final int $$f = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {109, 5, -57, 108, Ascii.FF, -2, -63, 57, 8, 0, -8, 5, -7, -55, 56, 3, 9, -13, -3, -1, Ascii.DC2, -14, -55, TarHeader.LF_CHR, 8, -59, Ascii.EM, Ascii.RS, 9, -9, 13, -17, 19, -11, 13, -17, -24, 34, -11, 1, 7, -72, 0, 33, TarHeader.LF_CHR, -4, -15, 13, -4, -13, Ascii.VT, -25, 38, -11, 6, -12, -3, Ascii.SI, -11, -6, -23, Ascii.NAK, Ascii.FF, -11, 2, -3, -49, Ascii.FF, 1, 9, -21, 1, 1, -5, 20, -9, 8, Ascii.FF, -2, -63, 57, 2, Ascii.VT, -12, 13, -19, -52, TarHeader.LF_BLK, -1, 17, 2, -15, 6, 8, -16, -53, 66, -12, 2, Ascii.DLE, -13, -4, Ascii.DC2, -18, 13, PSSSigner.TRAILER_IMPLICIT, 71, -1, -11, 3, -62, 34, 17, 6, -2, -18, Ascii.SYN, 17, -21, -34, Ascii.RS, Ascii.VT, -9, Ascii.DC2, -9, -11, 19, -5, 3, Ascii.FF, -2, 3, -1, -1, -9, 9, 6, -66, Ascii.FF, -2, 3, -1, -1, -9, 9, 6, -65, Ascii.FF, -2, -63, TarHeader.LF_CHR, Ascii.VT, -3, -7, -1, 1, -1, -51, 57, Ascii.VT, -9, 13, -17, 13, PSSSigner.TRAILER_IMPLICIT, 62, 3, 5, 0, -11, -4, -55, Ascii.RS, 35, 5, 0, -11, -4, -33, 46, -17, Ascii.SYN, -22, 1, 10, -7, -65, 13, 1};
    private static final int $$h = 88;
    private static final byte[] $$a = {Ascii.SI, -112, -70, -94, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 71;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.$$c
            int r8 = r8 + 68
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r4 = -r4
            int r8 = r8 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.$$i(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 28 - r9
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.$$a
            int r7 = 100 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 64 - r7
            int r6 = r6 * 2
            int r6 = r6 + 99
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.$$g
            int r5 = 147 - r5
            byte[] r0 = new byte[r0]
            int r7 = 63 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r5]
        L27:
            int r6 = r6 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.d(short, short, byte, java.lang.Object[]):void");
    }

    public static final FavouriteBundlesViewModel access$getViewModel(FavouriteBundlesActivity favouriteBundlesActivity) {
        int i = 2 % 2;
        int i2 = component4 + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesViewModel viewModel = favouriteBundlesActivity.getViewModel();
        int i4 = copy + 117;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return viewModel;
    }

    public FavouriteBundlesActivity() {
        final FavouriteBundlesActivity favouriteBundlesActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FavouriteBundlesViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = favouriteBundlesActivity.getViewModelStore();
                int i4 = ShareDataUIState + 3;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 41 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = ShareDataUIState + 23;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 51;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 9 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = copydefault + 99;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    defaultViewModelProviderFactory = favouriteBundlesActivity.getDefaultViewModelProviderFactory();
                    int i3 = 84 / 0;
                } else {
                    defaultViewModelProviderFactory = favouriteBundlesActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = component2 + 39;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
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
                Function0 function02 = function0;
                if (function02 != null) {
                    int i2 = component2 + 41;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = favouriteBundlesActivity.getDefaultViewModelCreationExtras();
                int i3 = component2 + 117;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 27;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final FavouriteBundlesViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copy + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.viewModel.getValue();
        if (i3 == 0) {
            return (FavouriteBundlesViewModel) value;
        }
        int i4 = 94 / 0;
        return (FavouriteBundlesViewModel) value;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            final FavouriteBundlesActivity component1;
            private static final byte[] $$c = {Ascii.SI, -12, 105, 108};
            private static final int $$f = BERTags.FLAGS;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {79, 9, 94, -7, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
            private static final int $$e = 186;
            private static final byte[] $$a = {112, 44, -46, -27, 2, 5, 32, -32, -1, 20, -8, 20, 3, -6, 1, 10, 2};
            private static final int $$b = 191;
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            private static long component3 = 327321058908839297L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(short r6, short r7, short r8) {
                /*
                    int r6 = r6 + 4
                    int r7 = r7 * 2
                    int r0 = 1 - r7
                    byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.$$c
                    int r8 = r8 * 3
                    int r8 = 105 - r8
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    r3 = -1
                    if (r1 != 0) goto L17
                    r4 = r3
                    r3 = r6
                    goto L2f
                L17:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1a:
                    int r3 = r3 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r7) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L29:
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2f:
                    int r6 = r6 + r8
                    r8 = r3
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.$$g(short, short, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 4
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.$$a
                    int r7 = r7 * 2
                    int r7 = r7 + 97
                    int r6 = r6 * 4
                    int r1 = 14 - r6
                    byte[] r1 = new byte[r1]
                    int r6 = 13 - r6
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L32
                L16:
                    r3 = r2
                L17:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L32:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + 5
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.a(short, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(int r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.$$d
                    int r5 = r5 * 3
                    int r1 = 10 - r5
                    int r6 = r6 * 9
                    int r6 = 13 - r6
                    int r7 = 100 - r7
                    byte[] r1 = new byte[r1]
                    int r5 = 9 - r5
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r4 = r2
                    r7 = r5
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L27:
                    r3 = r0[r6]
                L29:
                    int r6 = r6 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-27)
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.b(int, int, short, java.lang.Object[]):void");
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 99;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 93;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 14 / 0;
                }
                return unit;
            }

            private static final Unit component1(FavouriteBundlesActivity favouriteBundlesActivity, long j) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 101;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(favouriteBundlesActivity, "");
                favouriteBundlesActivity.getWindow().setStatusBarColor(ColorKt.m6108toArgb8_81llA(j));
                favouriteBundlesActivity.getWindow().setNavigationBarColor(ColorKt.m6108toArgb8_81llA(j));
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 117;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 29 / 0;
                }
                return unit;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            
                if (r8.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r8.skipToGroupEnd();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
            
                if (r8.getSkipping() == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component1(androidx.compose.runtime.Composer r8, int r9) {
                /*
                    r7 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r9 = r9 & 11
                    r1 = 0
                    if (r9 != r0) goto L28
                    int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.component2
                    int r9 = r9 + 69
                    int r2 = r9 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.ShareDataUIState = r2
                    int r9 = r9 % r0
                    if (r9 == 0) goto L1d
                    boolean r9 = r8.getSkipping()
                    r2 = 61
                    int r2 = r2 / r1
                    if (r9 != 0) goto L24
                    goto L28
                L1d:
                    boolean r9 = r8.getSkipping()
                    if (r9 != 0) goto L24
                    goto L28
                L24:
                    r8.skipToGroupEnd()
                    goto L9f
                L28:
                    androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
                    androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
                    r2 = 2023513938(0x789c5f52, float:2.5372864E34)
                    java.lang.String r3 = "CC(<get-current>):CompositionLocal.kt#9igjgp"
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r2, r3)
                    java.lang.Object r9 = r8.consume(r9)
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
                    android.view.View r9 = (android.view.View) r9
                    androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
                    int r3 = androidx.compose.material3.MaterialTheme.$stable
                    androidx.compose.material3.ColorScheme r2 = r2.getColorScheme(r8, r3)
                    long r2 = r2.getBackground()
                    r4 = -1683153856(0xffffffff9bad1c40, float:-2.8638705E-22)
                    r8.startReplaceGroup(r4)
                    boolean r9 = r9.isInEditMode()
                    if (r9 != 0) goto L6a
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0 r9 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity r4 = r7.component1
                    r9.<init>()
                    androidx.compose.runtime.EffectsKt.SideEffect(r9, r8, r1)
                    int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.component2
                    int r9 = r9 + 81
                    int r1 = r9 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.ShareDataUIState = r1
                    int r9 = r9 % r0
                L6a:
                    r8.endReplaceGroup()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity r9 = r7.component1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.access$getViewModel(r9)
                    kotlinx.coroutines.flow.StateFlow r0 = r9.getUiState()
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r5 = 8
                    r6 = 7
                    r4 = r8
                    androidx.compose.runtime.State r9 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r0, r1, r2, r3, r4, r5, r6)
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesUiState r9 = component1(r9)
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity$component1$4$5 r0 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity$component1$4$5
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity r1 = r7.component1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.access$getViewModel(r1)
                    r0.<init>(r1)
                    kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1 r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity r2 = r7.component1
                    r1.<init>()
                    r2 = 8
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.favouritebundles.ManageFavouriteBundlesScreenKt.ManageFavouriteBundlesScreen(r9, r0, r1, r8, r2)
                L9f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.component1(androidx.compose.runtime.Composer, int):void");
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass5 extends FunctionReferenceImpl implements Function1<FavouriteBundlesEvent, Unit> {
                private static int component1 = 1;
                private static int component2;

                public final void copydefault(FavouriteBundlesEvent favouriteBundlesEvent) {
                    int i = 2 % 2;
                    int i2 = component1 + 93;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(favouriteBundlesEvent, "");
                    ((FavouriteBundlesViewModel) this.receiver).onEvent(favouriteBundlesEvent);
                    int i4 = component1 + 81;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke(FavouriteBundlesEvent favouriteBundlesEvent) {
                    int i = 2 % 2;
                    int i2 = component2 + 21;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault(favouriteBundlesEvent);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        int i4 = 94 / 0;
                    }
                    return unit;
                }

                AnonymousClass5(Object obj) {
                    super(1, obj, FavouriteBundlesViewModel.class, "onEvent", "onEvent(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;)V", 0);
                }
            }

            private static final Unit copydefault(FavouriteBundlesActivity favouriteBundlesActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(favouriteBundlesActivity, "");
                favouriteBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 55;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final FavouriteBundlesUiState component1(State<FavouriteBundlesUiState> state) {
                int i = 2 % 2;
                int i2 = component2 + 99;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                FavouriteBundlesUiState value = state.getValue();
                int i4 = ShareDataUIState + 55;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01cd  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void c(int r23, char[] r24, java.lang.Object[] r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 479
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.c(int, char[], java.lang.Object[]):void");
            }

            public static Unit copydefault(FavouriteBundlesActivity favouriteBundlesActivity, long j) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(favouriteBundlesActivity, j);
                if (i3 == 0) {
                    int i4 = 25 / 0;
                }
                return unitComponent1;
            }

            public static Unit component3(FavouriteBundlesActivity favouriteBundlesActivity) {
                int i = 2 % 2;
                int i2 = component2 + 67;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(favouriteBundlesActivity);
                int i4 = component2 + 75;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass4(FavouriteBundlesActivity favouriteBundlesActivity) {
                this.component1 = favouriteBundlesActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:119:0x0719 A[PHI: r7
  0x0719: PHI (r7v87 int) = (r7v5 int), (r7v6 int), (r7v5 int) binds: [B:14:0x00cf, B:160:0x0719, B:8:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:138:0x08b4 A[PHI: r13
  0x08b4: PHI (r13v69 int) = (r13v68 int), (r13v74 int) binds: [B:137:0x08b2, B:134:0x08ae] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:139:0x08b7 A[PHI: r13
  0x08b7: PHI (r13v73 int) = (r13v68 int), (r13v74 int) binds: [B:137:0x08b2, B:134:0x08ae] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:148:0x08df  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x06f9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x042c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0437  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0476  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x05dc A[PHI: r4
  0x05dc: PHI (r4v57 int) = (r4v56 int), (r4v74 int) binds: [B:94:0x05da, B:91:0x05ce] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static int copydefault(java.util.List r33) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2562
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.component1.AnonymousClass4.copydefault(java.util.List):int");
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 77 / 0;
            }
            int i5 = ShareDataUIState + 125;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 103;
            component2 = i3 % 128;
            if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 105) == 5) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i4 = ShareDataUIState + 97;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1275472280, true, new AnonymousClass4(FavouriteBundlesActivity.this), composer, 54), composer, 1572864, 63);
        }

        component1() {
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 13;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getTapTimeout() >> 16), 33 - Color.blue(0), (char) (60267 - ImageFormat.getBitsPerPixel(0)), -834797019, false, $$i(b2, b3, (byte) (b3 | 34)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (equals ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 34, (char) (60373 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -1969106284, false, $$i(b4, b5, (byte) (b5 | 37)), new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 21;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 34, (char) (60374 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1969106284, false, $$i(b6, b7, (byte) (b7 | 37)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i8 = $10 + 37;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 5;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        int i3 = 684241640;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.indexOf("", "", i5), (ViewConfiguration.getScrollBarSize() >> 8) + 37, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i5, i5) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == j ? 0 : -1))), -309236339, false, $$i(b2, b3, (byte) (b3 | 38)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 684241640;
                    j = 0;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 19;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i9]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 4391, Color.red(0) + 37, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), -309236339, false, $$i(b4, b5, (byte) (b5 | 38)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i9] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i9++;
                iArr6 = iArr2;
                i4 = 1;
            }
            iArr6 = iArr7;
        }
        char c2 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i12 = $11 + 45;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            for (int i14 = 0; i14 < 16; i14++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i14];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 2969, 16 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49870), 462826032, false, $$i(b6, b7, (byte) (b7 | 36)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (27637 - Color.blue(0)), -1616366948, false, $$i(b8, b9, (byte) (b9 | 39)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 7;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 3760, 24 - View.resolveSizeAndState(0, 0, 0), (char) (ExpandableListView.getPackedPositionChild(j) + 1), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - View.resolveSize(0, 0), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getTouchSlop() >> 8), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        float f = 0.0f;
        if (component2) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 19 - Color.red(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7644), -327556343, false, $$i(b4, b5, (byte) (b5 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i7 = 689978476;
                f = 0.0f;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component3) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i10 = $10 + 7;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $11 + 63;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i14 = $11 + 29;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 % 1) << cancelVar.component3] * i] / iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7644), -327556343, false, $$i(b6, b7, (byte) (b7 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2749 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (7645 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), -327556343, false, $$i(b8, b9, (byte) (b9 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x2066  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x2067  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = copy + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) ImmLeaksCleaner.component2[0]).getInt(null);
        int mode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
        int i5 = ~mode;
        if (i4 != 1326394230 + (((-1084096785) | mode) * (-676)) + (((~(727825955 | i5)) | 1084096784) * 676) + (((~(mode | 1811922739)) | (~(i5 | (-1809712916))) | 725616131) * 676)) {
            int i6 = component4 + 7;
            copy = i6 % 128;
            int i7 = i6 % 2;
            throw null;
        }
        super.onStart();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0105  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 25;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = copy + 73;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 79, new int[]{224175093, 1987893543, -1911970382, -1379952398, -949277880, -1489261765, 1366187687, -786093312, -1645431321, -405937273, 537801404, 2062438759, 1219867325, -228796863}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 83, new int[]{948105902, 825234264, -1988765344, 527186337, -1075749478, 1337730393, -959831925, 1748416645, 493094691, -1718309490}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = copy + 47;
            component4 = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6617, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myTid() >> 22), 56 - Color.argb(0, 0, 0, 0), (char) (Process.myPid() >> 22), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6618, 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror('0')), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 56, (char) Color.argb(0, 0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1007:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x073f A[Catch: all -> 0x0327, TryCatch #5 {all -> 0x0327, blocks: (B:226:0x0caf, B:228:0x0cb5, B:229:0x0cdc, B:357:0x1334, B:359:0x133a, B:360:0x1367, B:483:0x18bd, B:485:0x18c3, B:486:0x18eb, B:747:0x2be3, B:749:0x2be9, B:750:0x2c11, B:781:0x2f23, B:783:0x2f29, B:784:0x2f55, B:818:0x3263, B:820:0x3269, B:821:0x328b, B:798:0x30a5, B:800:0x30c8, B:801:0x3119, B:841:0x336b, B:843:0x3371, B:844:0x3395, B:846:0x33cf, B:847:0x340d, B:598:0x23ec, B:600:0x2401, B:601:0x2431, B:580:0x20ae, B:582:0x20b4, B:583:0x20de, B:585:0x2118, B:586:0x2161, B:550:0x1d61, B:552:0x1d76, B:553:0x1da7, B:555:0x1ddb, B:556:0x1e59, B:530:0x1aec, B:532:0x1af2, B:533:0x1b22, B:116:0x0739, B:118:0x073f, B:119:0x076a, B:23:0x016e, B:25:0x0174, B:26:0x019b, B:28:0x0298, B:30:0x02ca, B:31:0x0321, B:493:0x197c, B:495:0x1982, B:515:0x1a74, B:517:0x1a7a, B:518:0x1a7b, B:520:0x1a7d, B:522:0x1a84, B:523:0x1a85, B:499:0x198e, B:500:0x1993, B:501:0x1996), top: B:872:0x016e, inners: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0cb5 A[Catch: all -> 0x0327, TryCatch #5 {all -> 0x0327, blocks: (B:226:0x0caf, B:228:0x0cb5, B:229:0x0cdc, B:357:0x1334, B:359:0x133a, B:360:0x1367, B:483:0x18bd, B:485:0x18c3, B:486:0x18eb, B:747:0x2be3, B:749:0x2be9, B:750:0x2c11, B:781:0x2f23, B:783:0x2f29, B:784:0x2f55, B:818:0x3263, B:820:0x3269, B:821:0x328b, B:798:0x30a5, B:800:0x30c8, B:801:0x3119, B:841:0x336b, B:843:0x3371, B:844:0x3395, B:846:0x33cf, B:847:0x340d, B:598:0x23ec, B:600:0x2401, B:601:0x2431, B:580:0x20ae, B:582:0x20b4, B:583:0x20de, B:585:0x2118, B:586:0x2161, B:550:0x1d61, B:552:0x1d76, B:553:0x1da7, B:555:0x1ddb, B:556:0x1e59, B:530:0x1aec, B:532:0x1af2, B:533:0x1b22, B:116:0x0739, B:118:0x073f, B:119:0x076a, B:23:0x016e, B:25:0x0174, B:26:0x019b, B:28:0x0298, B:30:0x02ca, B:31:0x0321, B:493:0x197c, B:495:0x1982, B:515:0x1a74, B:517:0x1a7a, B:518:0x1a7b, B:520:0x1a7d, B:522:0x1a84, B:523:0x1a85, B:499:0x198e, B:500:0x1993, B:501:0x1996), top: B:872:0x016e, inners: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0e36  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0e9b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1177 A[Catch: all -> 0x12ac, TryCatch #11 {all -> 0x12ac, blocks: (B:297:0x116d, B:298:0x1171, B:300:0x1177, B:303:0x1193, B:266:0x0ec5, B:283:0x1040, B:287:0x108c, B:293:0x1103, B:296:0x1165), top: B:882:0x0ec5 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x133a A[Catch: all -> 0x0327, TryCatch #5 {all -> 0x0327, blocks: (B:226:0x0caf, B:228:0x0cb5, B:229:0x0cdc, B:357:0x1334, B:359:0x133a, B:360:0x1367, B:483:0x18bd, B:485:0x18c3, B:486:0x18eb, B:747:0x2be3, B:749:0x2be9, B:750:0x2c11, B:781:0x2f23, B:783:0x2f29, B:784:0x2f55, B:818:0x3263, B:820:0x3269, B:821:0x328b, B:798:0x30a5, B:800:0x30c8, B:801:0x3119, B:841:0x336b, B:843:0x3371, B:844:0x3395, B:846:0x33cf, B:847:0x340d, B:598:0x23ec, B:600:0x2401, B:601:0x2431, B:580:0x20ae, B:582:0x20b4, B:583:0x20de, B:585:0x2118, B:586:0x2161, B:550:0x1d61, B:552:0x1d76, B:553:0x1da7, B:555:0x1ddb, B:556:0x1e59, B:530:0x1aec, B:532:0x1af2, B:533:0x1b22, B:116:0x0739, B:118:0x073f, B:119:0x076a, B:23:0x016e, B:25:0x0174, B:26:0x019b, B:28:0x0298, B:30:0x02ca, B:31:0x0321, B:493:0x197c, B:495:0x1982, B:515:0x1a74, B:517:0x1a7a, B:518:0x1a7b, B:520:0x1a7d, B:522:0x1a84, B:523:0x1a85, B:499:0x198e, B:500:0x1993, B:501:0x1996), top: B:872:0x016e, inners: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1449  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x14a3 A[Catch: all -> 0x183a, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x183a, blocks: (B:364:0x13ec, B:371:0x143c, B:380:0x14a3), top: B:902:0x13ec }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x16e4 A[Catch: all -> 0x1816, TryCatch #58 {all -> 0x1816, blocks: (B:421:0x16da, B:422:0x16de, B:424:0x16e4, B:427:0x16ff, B:410:0x160c, B:416:0x1674, B:420:0x16d2), top: B:970:0x160c }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x18c3 A[Catch: all -> 0x0327, TryCatch #5 {all -> 0x0327, blocks: (B:226:0x0caf, B:228:0x0cb5, B:229:0x0cdc, B:357:0x1334, B:359:0x133a, B:360:0x1367, B:483:0x18bd, B:485:0x18c3, B:486:0x18eb, B:747:0x2be3, B:749:0x2be9, B:750:0x2c11, B:781:0x2f23, B:783:0x2f29, B:784:0x2f55, B:818:0x3263, B:820:0x3269, B:821:0x328b, B:798:0x30a5, B:800:0x30c8, B:801:0x3119, B:841:0x336b, B:843:0x3371, B:844:0x3395, B:846:0x33cf, B:847:0x340d, B:598:0x23ec, B:600:0x2401, B:601:0x2431, B:580:0x20ae, B:582:0x20b4, B:583:0x20de, B:585:0x2118, B:586:0x2161, B:550:0x1d61, B:552:0x1d76, B:553:0x1da7, B:555:0x1ddb, B:556:0x1e59, B:530:0x1aec, B:532:0x1af2, B:533:0x1b22, B:116:0x0739, B:118:0x073f, B:119:0x076a, B:23:0x016e, B:25:0x0174, B:26:0x019b, B:28:0x0298, B:30:0x02ca, B:31:0x0321, B:493:0x197c, B:495:0x1982, B:515:0x1a74, B:517:0x1a7a, B:518:0x1a7b, B:520:0x1a7d, B:522:0x1a84, B:523:0x1a85, B:499:0x198e, B:500:0x1993, B:501:0x1996), top: B:872:0x016e, inners: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1970  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x1997  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x19ae A[Catch: all -> 0x1a7c, TryCatch #38 {all -> 0x1a7c, blocks: (B:504:0x1999, B:506:0x19ae, B:507:0x19e0), top: B:933:0x1999, outer: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x19f3 A[Catch: all -> 0x1a72, TryCatch #33 {all -> 0x1a72, blocks: (B:508:0x19e6, B:510:0x19f3, B:511:0x1a6a), top: B:923:0x19e6, outer: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1ba9  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1c12  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1c6b  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x1d41  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x1f9e  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x206d  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x229a  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x22eb  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x23cc  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x2576  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x2be9 A[Catch: all -> 0x0327, TryCatch #5 {all -> 0x0327, blocks: (B:226:0x0caf, B:228:0x0cb5, B:229:0x0cdc, B:357:0x1334, B:359:0x133a, B:360:0x1367, B:483:0x18bd, B:485:0x18c3, B:486:0x18eb, B:747:0x2be3, B:749:0x2be9, B:750:0x2c11, B:781:0x2f23, B:783:0x2f29, B:784:0x2f55, B:818:0x3263, B:820:0x3269, B:821:0x328b, B:798:0x30a5, B:800:0x30c8, B:801:0x3119, B:841:0x336b, B:843:0x3371, B:844:0x3395, B:846:0x33cf, B:847:0x340d, B:598:0x23ec, B:600:0x2401, B:601:0x2431, B:580:0x20ae, B:582:0x20b4, B:583:0x20de, B:585:0x2118, B:586:0x2161, B:550:0x1d61, B:552:0x1d76, B:553:0x1da7, B:555:0x1ddb, B:556:0x1e59, B:530:0x1aec, B:532:0x1af2, B:533:0x1b22, B:116:0x0739, B:118:0x073f, B:119:0x076a, B:23:0x016e, B:25:0x0174, B:26:0x019b, B:28:0x0298, B:30:0x02ca, B:31:0x0321, B:493:0x197c, B:495:0x1982, B:515:0x1a74, B:517:0x1a7a, B:518:0x1a7b, B:520:0x1a7d, B:522:0x1a84, B:523:0x1a85, B:499:0x198e, B:500:0x1993, B:501:0x1996), top: B:872:0x016e, inners: #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x2c99  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x2cef  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x2d48  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x2f02  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x2fe0  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x3033  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x3087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x013c A[PHI: r15
  0x013c: PHI (r15v109 int) = (r15v7 int), (r15v112 int) binds: [B:21:0x0169, B:5:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:817:0x3243  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x3333  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x13f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0140 A[PHI: r15
  0x0140: PHI (r15v7 int) = (r15v6 int), (r15v146 int) binds: [B:3:0x012c, B:5:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v388, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v120 */
    /* JADX WARN: Type inference failed for: r11v123 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v129 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v220 */
    /* JADX WARN: Type inference failed for: r11v228 */
    /* JADX WARN: Type inference failed for: r11v229 */
    /* JADX WARN: Type inference failed for: r11v230 */
    /* JADX WARN: Type inference failed for: r11v231 */
    /* JADX WARN: Type inference failed for: r11v232 */
    /* JADX WARN: Type inference failed for: r11v233 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v119, types: [long] */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v128 */
    /* JADX WARN: Type inference failed for: r15v129 */
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v143 */
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v100 */
    /* JADX WARN: Type inference failed for: r23v101 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v111 */
    /* JADX WARN: Type inference failed for: r23v114 */
    /* JADX WARN: Type inference failed for: r23v115 */
    /* JADX WARN: Type inference failed for: r23v116 */
    /* JADX WARN: Type inference failed for: r23v118 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v156 */
    /* JADX WARN: Type inference failed for: r23v157 */
    /* JADX WARN: Type inference failed for: r23v158 */
    /* JADX WARN: Type inference failed for: r23v159 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v160 */
    /* JADX WARN: Type inference failed for: r23v161 */
    /* JADX WARN: Type inference failed for: r23v162 */
    /* JADX WARN: Type inference failed for: r23v163 */
    /* JADX WARN: Type inference failed for: r23v164 */
    /* JADX WARN: Type inference failed for: r23v165 */
    /* JADX WARN: Type inference failed for: r23v166 */
    /* JADX WARN: Type inference failed for: r23v167 */
    /* JADX WARN: Type inference failed for: r23v168 */
    /* JADX WARN: Type inference failed for: r23v169 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v170 */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v57 */
    /* JADX WARN: Type inference failed for: r23v58 */
    /* JADX WARN: Type inference failed for: r23v59 */
    /* JADX WARN: Type inference failed for: r23v60 */
    /* JADX WARN: Type inference failed for: r23v67 */
    /* JADX WARN: Type inference failed for: r23v71 */
    /* JADX WARN: Type inference failed for: r23v72 */
    /* JADX WARN: Type inference failed for: r23v73 */
    /* JADX WARN: Type inference failed for: r23v76 */
    /* JADX WARN: Type inference failed for: r23v77 */
    /* JADX WARN: Type inference failed for: r23v78 */
    /* JADX WARN: Type inference failed for: r23v79 */
    /* JADX WARN: Type inference failed for: r23v80 */
    /* JADX WARN: Type inference failed for: r23v81 */
    /* JADX WARN: Type inference failed for: r23v92 */
    /* JADX WARN: Type inference failed for: r23v93 */
    /* JADX WARN: Type inference failed for: r23v94 */
    /* JADX WARN: Type inference failed for: r23v95 */
    /* JADX WARN: Type inference failed for: r23v96 */
    /* JADX WARN: Type inference failed for: r23v97 */
    /* JADX WARN: Type inference failed for: r23v98 */
    /* JADX WARN: Type inference failed for: r23v99 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v34 */
    /* JADX WARN: Type inference failed for: r2v712, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r43v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v6 */
    /* JADX WARN: Type inference failed for: r6v443 */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v109, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v112 */
    /* JADX WARN: Type inference failed for: r8v114 */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v116 */
    /* JADX WARN: Type inference failed for: r8v118 */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v136 */
    /* JADX WARN: Type inference failed for: r8v137 */
    /* JADX WARN: Type inference failed for: r8v139 */
    /* JADX WARN: Type inference failed for: r8v140, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v143 */
    /* JADX WARN: Type inference failed for: r8v147 */
    /* JADX WARN: Type inference failed for: r8v148 */
    /* JADX WARN: Type inference failed for: r8v149 */
    /* JADX WARN: Type inference failed for: r8v150 */
    /* JADX WARN: Type inference failed for: r8v168 */
    /* JADX WARN: Type inference failed for: r8v196 */
    /* JADX WARN: Type inference failed for: r8v207 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v211, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v222 */
    /* JADX WARN: Type inference failed for: r8v223 */
    /* JADX WARN: Type inference failed for: r8v334 */
    /* JADX WARN: Type inference failed for: r8v335 */
    /* JADX WARN: Type inference failed for: r8v336 */
    /* JADX WARN: Type inference failed for: r8v337 */
    /* JADX WARN: Type inference failed for: r8v338 */
    /* JADX WARN: Type inference failed for: r8v339 */
    /* JADX WARN: Type inference failed for: r8v340 */
    /* JADX WARN: Type inference failed for: r8v341 */
    /* JADX WARN: Type inference failed for: r8v342 */
    /* JADX WARN: Type inference failed for: r8v343 */
    /* JADX WARN: Type inference failed for: r8v344 */
    /* JADX WARN: Type inference failed for: r8v345 */
    /* JADX WARN: Type inference failed for: r8v346 */
    /* JADX WARN: Type inference failed for: r8v347 */
    /* JADX WARN: Type inference failed for: r8v348 */
    /* JADX WARN: Type inference failed for: r8v349 */
    /* JADX WARN: Type inference failed for: r8v350 */
    /* JADX WARN: Type inference failed for: r8v351 */
    /* JADX WARN: Type inference failed for: r8v352 */
    /* JADX WARN: Type inference failed for: r8v353 */
    /* JADX WARN: Type inference failed for: r8v354 */
    /* JADX WARN: Type inference failed for: r8v355 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98 */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v93 */
    /* JADX WARN: Type inference failed for: r9v94 */
    /* JADX WARN: Type inference failed for: r9v95 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /* JADX WARN: Type inference failed for: r9v97 */
    /* JADX WARN: Type inference failed for: r9v98 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.FavouriteBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getAsAtTimestamp = 0;
        component3();
        component1();
        int i = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = copy + 95;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        ShareDataUIState = new char[]{30227, 30215, 30213, 30404, 30222, 30333, 30225, 30335, 30221, 30217, 30226, 30223, 30210, 30218, 30214, 30329, 30212, 30211, 30208, 30245, 30332, 30243, 30246, 30236, 30231, 30254, 30418, 30256};
        component1 = 321287926;
        component3 = true;
        component2 = true;
        int i5 = i3 + 59;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        copydefault = new int[]{118462369, -810290986, 1378108792, -1441179506, 7404675, -667631675, 727510341, 1017233901, 1850568983, -1908580418, -2042404338, -1210949918, -1543146747, 1334904935, 1935376881, 1333222738, -1139075388, 458559147};
        equals = -399065799615347775L;
    }
}
