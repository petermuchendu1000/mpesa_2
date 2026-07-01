package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/diybundles/SfcEasyTalkBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/diybundles/DiyBundlesViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/diybundles/DiyBundlesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "returnDestination", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "Companion", "ConsumerSfcUI_release", "uiState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/diybundles/EasyTalkBundlesUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcEasyTalkBundlesActivity extends Hilt_SfcEasyTalkBundlesActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static final String KEY_IS_MONTHLY = "IsMonthly";
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static char component4;
    private static char[] copy;
    private static char copydefault;
    private static char getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;
    private String returnDestination;

    private final Lazy viewModel;
    private static final byte[] $$l = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$m = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {13, 38, -109, 117, 17, 3, -58, 63, Ascii.DC2, -15, Ascii.ESC, -13, 9, -54, 59, 10, 3, 7, Ascii.DLE, -14, Ascii.DLE, 9, -10, Ascii.GS, -7, -3, Ascii.SO, Ascii.VT, -65, 58, 17, 4, 10, 7, -3, -3, Ascii.DC2, -63, 74, -8, 2, Ascii.ETB, -7, -54, 57, Ascii.CAN, 9, -18, Ascii.CAN, -2, -5, 13, -2, 19, -64, 57, Ascii.SI, 2, Ascii.DC2, -12, 2, Ascii.CAN, -2, -5, 13, -2, 19, -64, Ascii.EM, Ascii.SI, 34, Ascii.DC2, -12, -30, 56, -2, -5, 13, -2, 19, -27, Ascii.NAK, 20, -8, 5, Ascii.SO, -30, 46, -75, 68, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, -10, 68, 17, 6, Ascii.SO, -16, 6, 6, 0, Ascii.EM, -4, 13, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, 17, 6, Ascii.SO, -16, 6, 6, 0, Ascii.EM, -4, 13, 1, -57, 59, 19, 2, -1, 0, 20, 1, 4, 9, 2, -1, 0, 20, -64, 62, 7, 2, -51, Ascii.RS, 39, 2, -29, TarHeader.LF_CHR, -12, Ascii.ESC, -17, 6, Ascii.SI, -2, -23, 42, 0, Ascii.DLE, Ascii.SUB, -2, Ascii.SYN, -8, -28, 34, Ascii.CAN, -14, -7, -7, Ascii.SI, 38, -14, Ascii.CAN, -10, 17, 3, -58, 74, -13, 10, 0, Ascii.SYN, -4, -1, 17, 3, -58, 74, -6, -2, Ascii.SYN, -8, 4, Ascii.SYN, -7, -54, 58, 17, 3, 8, 4, 9, -9, -50, 58, 17, 4, -3, 8, Ascii.SO, 0, -7, Ascii.CAN, -6, Ascii.VT, 4, -59, Ascii.SUB, TarHeader.LF_LINK, 4, -3, 8, Ascii.SO, 0, -31, 42, -3, Ascii.SO, -33, TarHeader.LF_NORMAL, -10, 13, PSSSigner.TRAILER_IMPLICIT, 34, 39, Ascii.SYN, -6, Ascii.VT, 4, -38, 42, 6, Ascii.FF, -71, 36, TarHeader.LF_BLK, -8, 1, Ascii.CAN, 0, 8};
    private static final int $$k = 17;
    private static final byte[] $$d = {66, -42, -1, 80, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 226;
    private static int hashCode = 0;
    private static int toString = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(int r6, int r7, short r8) {
        /*
            int r8 = r8 + 110
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.$$n(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 103 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.$$d
            int r8 = 99 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.g(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.$$j
            int r8 = 112 - r8
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r8 = r8 + r9
            int r8 = r8 + (-5)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.h(short, short, int, java.lang.Object[]):void");
    }

    public static final DiyBundlesViewModel access$getViewModel(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity) {
        int i = 2 % 2;
        int i2 = hashCode + 13;
        toString = i2 % 128;
        int i3 = i2 % 2;
        DiyBundlesViewModel viewModel = sfcEasyTalkBundlesActivity.getViewModel();
        int i4 = hashCode + 105;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return viewModel;
    }

    public static final void access$onBundleSelected(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity, DIYBundle dIYBundle) {
        int i = 2 % 2;
        int i2 = toString + 29;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        sfcEasyTalkBundlesActivity.onBundleSelected(dIYBundle);
        int i4 = hashCode + 125;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public SfcEasyTalkBundlesActivity() {
        final SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(DiyBundlesViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 17;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    sfcEasyTalkBundlesActivity.getViewModelStore();
                    throw null;
                }
                ViewModelStore viewModelStore = sfcEasyTalkBundlesActivity.getViewModelStore();
                int i3 = component3 + 21;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 43;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
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
                int i2 = copydefault + 115;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 117;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 117;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcEasyTalkBundlesActivity.getDefaultViewModelProviderFactory();
                int i4 = component2 + 99;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = component3 + 71;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = sfcEasyTalkBundlesActivity.getDefaultViewModelCreationExtras();
                int i4 = component3 + 19;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 5;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component1 + 117;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/diybundles/SfcEasyTalkBundlesActivity$Companion;", "", "<init>", "()V", "KEY_IS_MONTHLY", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final DiyBundlesViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = hashCode + 49;
        toString = i2 % 128;
        int i3 = i2 % 2;
        DiyBundlesViewModel diyBundlesViewModel = (DiyBundlesViewModel) this.viewModel.getValue();
        int i4 = hashCode + 9;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return diyBundlesViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        public static final EasyTalkBundlesUiState component2(State state) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            EasyTalkBundlesUiState easyTalkBundlesUiStateCopydefault = copydefault(state);
            int i4 = ShareDataUIState + 99;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return easyTalkBundlesUiStateCopydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 113;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$1", f = "SfcEasyTalkBundlesActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int copydefault;
            final SfcEasyTalkBundlesActivity ShareDataUIState;
            int component1;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 61;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component1 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SfcEasyTalkBundlesActivity.access$getViewModel(this.ShareDataUIState).getDiyBundleCatalog();
                Unit unit = Unit.INSTANCE;
                int i3 = copydefault + 103;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.ShareDataUIState = sfcEasyTalkBundlesActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.ShareDataUIState, continuation);
                int i2 = component2 + 59;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                component2 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return component3(coroutineScope2, continuation2);
                }
                component3(coroutineScope2, continuation2);
                throw null;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 95;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    anonymousClass4.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4.invokeSuspend(unit);
                int i4 = copydefault + 95;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$2$1", f = "SfcEasyTalkBundlesActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final State<EasyTalkBundlesUiState> component1;
            int component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 115;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String errorMessage = component2.component2(this.component1).getErrorMessage();
                if (errorMessage != null) {
                    int i4 = component2 + 51;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        ToastUtils.showLong(errorMessage, new Object[0]);
                    } else {
                        ToastUtils.showLong(errorMessage, new Object[0]);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            component1(State<EasyTalkBundlesUiState> state, Continuation<? super component1> continuation) {
                super(2, continuation);
                this.component1 = state;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                component1 component1Var = new component1(this.component1, continuation);
                int i2 = copydefault + 101;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return component1Var;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 77;
                component2 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    return component2(coroutineScope2, continuation2);
                }
                Object objComponent2 = component2(coroutineScope2, continuation2);
                int i3 = 0 / 0;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 55;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component1 component1Var = (component1) create(coroutineScope, continuation);
                if (i3 == 0) {
                    component1Var.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = component1Var.invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 93;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final SfcEasyTalkBundlesActivity component2;
            final State<EasyTalkBundlesUiState> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
            
                r12.skipToGroupEnd();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
            
                if (r13 == false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r13 == false) goto L12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component3(androidx.compose.runtime.Composer r12, int r13) {
                /*
                    r11 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.AnonymousClass2.copydefault
                    int r1 = r1 + 59
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.AnonymousClass2.ShareDataUIState = r2
                    int r1 = r1 % r0
                    r13 = r13 & 11
                    r1 = 0
                    if (r13 != r0) goto L2b
                    int r2 = r2 + 53
                    int r13 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.AnonymousClass2.copydefault = r13
                    int r2 = r2 % r0
                    boolean r13 = r12.getSkipping()
                    if (r2 != 0) goto L24
                    r2 = 75
                    int r2 = r2 / r1
                    if (r13 != 0) goto L27
                    goto L2b
                L24:
                    if (r13 != 0) goto L27
                    goto L2b
                L27:
                    r12.skipToGroupEnd()
                    goto L82
                L2b:
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiState> r13 = r11.component3
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiState r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.component2(r13)
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda0 r3 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r13 = r11.component2
                    r3.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda1 r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r13 = r11.component2
                    r4.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda2 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r13 = r11.component2
                    r5.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda3 r6 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$onCreate$1$3$$ExternalSyntheticLambda3
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r13 = r11.component2
                    r6.<init>()
                    androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.INSTANCE
                    androidx.compose.ui.Modifier r13 = (androidx.compose.ui.Modifier) r13
                    r7 = 1
                    r8 = 0
                    r9 = 0
                    androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r13, r9, r7, r8)
                    androidx.compose.foundation.layout.WindowInsets$Companion r7 = androidx.compose.foundation.layout.WindowInsets.INSTANCE
                    r8 = 8
                    androidx.compose.foundation.layout.WindowInsets r7 = androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(r7, r12, r8)
                    androidx.compose.foundation.layout.WindowInsetsSides$Companion r8 = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE
                    int r8 = r8.m1267getTopJoeWqyM()
                    androidx.compose.foundation.layout.WindowInsets r7 = androidx.compose.foundation.layout.WindowInsetsKt.m1239onlybOOhFvg(r7, r8)
                    androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(r7, r12, r1)
                    androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.PaddingKt.padding(r13, r1)
                    r9 = 8
                    r10 = 0
                    r8 = r12
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivityKt.access$EasyTalkBundlesScreen(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.AnonymousClass2.copydefault
                    int r12 = r12 + 99
                    int r13 = r12 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.AnonymousClass2.ShareDataUIState = r13
                    int r12 = r12 % r0
                L82:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.AnonymousClass2.component3(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component1(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = copydefault + 125;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                    SfcEasyTalkBundlesActivity.access$getViewModel(sfcEasyTalkBundlesActivity).getDiyBundleCatalog();
                    unit = Unit.INSTANCE;
                    int i3 = 94 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                    SfcEasyTalkBundlesActivity.access$getViewModel(sfcEasyTalkBundlesActivity).getDiyBundleCatalog();
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 37;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit component3(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 97;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                    sfcEasyTalkBundlesActivity.finish();
                    unit = Unit.INSTANCE;
                    int i3 = 30 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                    sfcEasyTalkBundlesActivity.finish();
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 117;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component1(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity, DIYBundle dIYBundle) {
                int i = 2 % 2;
                int i2 = copydefault + 43;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                Intrinsics.checkNotNullParameter(dIYBundle, "");
                SfcEasyTalkBundlesActivity.access$onBundleSelected(sfcEasyTalkBundlesActivity, dIYBundle);
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 37;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit copydefault(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 85;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    SfcEasyTalkBundlesActivity.access$getViewModel(sfcEasyTalkBundlesActivity).onEasyTalkCategorySelected(str);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcEasyTalkBundlesActivity, "");
                Intrinsics.checkNotNullParameter(str, "");
                SfcEasyTalkBundlesActivity.access$getViewModel(sfcEasyTalkBundlesActivity).onEasyTalkCategorySelected(str);
                int i3 = 99 / 0;
                return Unit.INSTANCE;
            }

            public static Unit copydefault(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity, DIYBundle dIYBundle) {
                int i = 2 % 2;
                int i2 = copydefault + 41;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return component1(sfcEasyTalkBundlesActivity, dIYBundle);
                }
                component1(sfcEasyTalkBundlesActivity, dIYBundle);
                throw null;
            }

            public static Unit component2(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(sfcEasyTalkBundlesActivity, str);
                int i4 = ShareDataUIState + 87;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitCopydefault;
            }

            public static Unit component2(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 95;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    component1(sfcEasyTalkBundlesActivity);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent1 = component1(sfcEasyTalkBundlesActivity);
                int i3 = ShareDataUIState + 121;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent1;
            }

            public static Unit copydefault(SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return component3(sfcEasyTalkBundlesActivity);
                }
                component3(sfcEasyTalkBundlesActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass2(State<EasyTalkBundlesUiState> state, SfcEasyTalkBundlesActivity sfcEasyTalkBundlesActivity) {
                this.component3 = state;
                this.component2 = sfcEasyTalkBundlesActivity;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void ShareDataUIState(androidx.compose.runtime.Composer r15, int r16) {
            /*
                r14 = this;
                r0 = r14
                r8 = r15
                r11 = 2
                int r1 = r11 % r11
                r1 = r16 & 11
                if (r1 != r11) goto L15
                boolean r1 = r15.getSkipping()
                if (r1 != 0) goto L10
                goto L15
            L10:
                r15.skipToGroupEnd()
                goto Lac
            L15:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.access$getViewModel(r1)
                kotlinx.coroutines.flow.StateFlow r1 = r1.getEasyTalkUiState()
                r2 = 8
                r3 = 0
                r4 = 1
                androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.collectAsState(r1, r3, r15, r2, r4)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$component2$4 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$component2$4
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.this
                r5.<init>(r6, r3)
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                r6 = 70
                androidx.compose.runtime.EffectsKt.LaunchedEffect(r2, r5, r15, r6)
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiState r2 = copydefault(r1)
                java.lang.String r2 = r2.getErrorMessage()
                r5 = -918540330(0xffffffffc9402fd6, float:-787197.4)
                r15.startReplaceGroup(r5)
                boolean r5 = r15.changed(r1)
                java.lang.Object r6 = r15.rememberedValue()
                if (r5 != 0) goto L60
                int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.component2
                int r5 = r5 + 99
                int r7 = r5 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.ShareDataUIState = r7
                int r5 = r5 % r11
                androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.INSTANCE
                java.lang.Object r5 = r5.getEmpty()
                if (r6 != r5) goto L6b
            L60:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$component2$component1 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$component2$component1
                r5.<init>(r1, r3)
                r6 = r5
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r15.updateRememberedValue(r6)
            L6b:
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r15.endReplaceGroup()
                r3 = 64
                androidx.compose.runtime.EffectsKt.LaunchedEffect(r2, r6, r15, r3)
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$component2$2 r10 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity$component2$2
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.this
                r10.<init>(r1, r12)
                r1 = 54
                r12 = -399764366(0xffffffffe82c1472, float:-3.2504967E24)
                androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r12, r4, r10, r15, r1)
                r10 = r1
                kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
                r12 = 1572864(0x180000, float:2.204052E-39)
                r13 = 63
                r1 = r2
                r2 = r3
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r9
                r7 = r10
                r8 = r15
                r9 = r12
                r10 = r13
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.component2
                int r1 = r1 + 21
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.ShareDataUIState = r2
                int r1 = r1 % r11
                if (r1 == 0) goto Lac
                r1 = 3
                int r1 = r1 % r11
            Lac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.component2.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
        }

        private static final EasyTalkBundlesUiState copydefault(State<EasyTalkBundlesUiState> state) {
            int i = 2 % 2;
            int i2 = component2 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            EasyTalkBundlesUiState value = state.getValue();
            if (i3 == 0) {
                return value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        component2() {
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 59;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) getAsAtTimestamp) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component4)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 32 - Color.green(0), (char) (23252 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 592652048, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getRequestBeneficiariesState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(845 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 23252), 592652048, false, $$n(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $10 + 69;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 4 / 3;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 464, (-16777167) - Color.rgb(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 11;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                int i8 = i7;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i11 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 844;
                        int i12 = 33 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        char c4 = (char) ((ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 23252);
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        String str$$n = $$n(b2, b3, (byte) (b3 + 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i11, i12, c4, 592652048, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(892 - AndroidCharacter.getMirror('0'), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23250), 592652048, false, $$n(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i8 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 465, 48 - ImageFormat.getBitsPerPixel(0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i13 = $11 + 111;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void f(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = copy;
        double d2 = 0.0d;
        if (cArr2 != null) {
            int i8 = $10;
            int i9 = i8 + 47;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            int i10 = i8 + 33;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i;
            while (i12 < length) {
                int i13 = $11 + 79;
                $10 = i13 % 128;
                if (i13 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1)) + 657, '>' - AndroidCharacter.getMirror('0'), (char) (View.resolveSize(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i12 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i12])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (Color.green(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i12++;
                }
                i2 = 2;
                d2 = 0.0d;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4501, 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (Color.blue(0) + 27897), -1464227204, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(3579 - TextUtils.lastIndexOf("", '0', 0, 0), 28 - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1180380354, false, $$n(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1860 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 80302927, false, $$n(b6, b6, (byte) $$l.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i17 = $11 + 13;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x2305  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x2306  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x054b  */
    /* JADX WARN: Type inference failed for: r1v417, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void onBundleSelected(DIYBundle bundle) {
        int i = 2 % 2;
        String productName = bundle.getProductName();
        int productAmount = bundle.getProductAmount();
        String productUnits = bundle.getProductUnits();
        String str = bundle.getValidity() + " " + bundle.getValidityType();
        String productId = bundle.getProductId();
        int i2 = R.drawable.ic_gsm_easy_talk;
        String string = getString(R.string.easy_talk_bundles_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        WithExpiryResp withExpiryResp = new WithExpiryResp(productName, String.valueOf(productAmount), productUnits, false, false, productId, str, null, "DIY", Keys.BUNDLE_TYPE_DIY, null, string, null, null, i2, null, 46232, null);
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("withExpiryResp", withExpiryResp);
        bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_DIY);
        bundle2.putString(Keys.KEY_RETURN_DESTINATION, RoutePathConstant.SFC_EASY_TALK_BUNDLES);
        bundle2.putString("bundleMins", bundle.getBundleMins());
        bundle2.putString("bundleSms", bundle.getBundleSms());
        bundle2.putString("bundleData", bundle.getBundleData());
        bundle2.putString("productOfferId", bundle.getProductOfferId());
        bundle2.putString("payBill", bundle.getPayBill());
        bundle2.putParcelable("diyBundleResp", bundle);
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
        int i3 = hashCode + 57;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() + 25, new char[]{54334, 24695, 7816, 62273, 24533, 58919, 53386, 31061, 36145, 6857, 60674, 48718, 10477, 51029, 60257, 19496, 36948, 21839, 11273, 33992, 44891, 6380, 43088, 8398, 43526, 56087}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) - 94, new char[]{40168, 46593, 41349, 9221, 60383, 15840, 52893, 443, 11483, 16161, 49988, 18514, 5643, 37847, 60257, 19496, 28300, 60814}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = toString + 101;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = toString + 123;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 6618, 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6562, 56 - View.getDefaultSize(0, 0), (char) (MotionEvent.axisFromString("") + 1), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = hashCode + 1;
                toString = i6 % 128;
                int i7 = i6 % 2;
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
    /* JADX WARN: Removed duplicated region for block: B:10:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0940 A[Catch: all -> 0x031e, TryCatch #57 {all -> 0x031e, blocks: (B:164:0x093a, B:166:0x0940, B:167:0x0968, B:311:0x10c1, B:313:0x10c7, B:314:0x10f2, B:423:0x161b, B:425:0x1621, B:426:0x1652, B:759:0x30d0, B:761:0x30d6, B:762:0x3106, B:803:0x347b, B:805:0x3481, B:806:0x34a4, B:783:0x32b3, B:785:0x32d6, B:786:0x332d, B:719:0x2d27, B:721:0x2d2d, B:722:0x2d59, B:602:0x2654, B:604:0x265a, B:605:0x2681, B:607:0x26bb, B:608:0x2701, B:573:0x2319, B:575:0x232e, B:576:0x235e, B:578:0x2392, B:579:0x2416, B:551:0x1f90, B:553:0x1f96, B:554:0x1fc1, B:556:0x1ffb, B:557:0x2048, B:525:0x1cff, B:527:0x1d14, B:528:0x1d46, B:509:0x1b0f, B:511:0x1b15, B:512:0x1b3e, B:208:0x0b4d, B:210:0x0b53, B:211:0x0b7b, B:20:0x0140, B:22:0x0146, B:23:0x016c, B:25:0x028e, B:27:0x02c0, B:28:0x0318), top: B:937:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a1b A[Catch: all -> 0x0ae1, TryCatch #25 {all -> 0x0ae1, blocks: (B:183:0x0a06, B:185:0x0a1b, B:186:0x0a4b), top: B:875:0x0a06, outer: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a5e A[Catch: all -> 0x0ad7, TryCatch #22 {all -> 0x0ad7, blocks: (B:187:0x0a51, B:189:0x0a5e, B:190:0x0acf), top: B:869:0x0a51, outer: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0cba A[Catch: all -> 0x103b, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x103b, blocks: (B:215:0x0bfe, B:222:0x0c51, B:231:0x0cba), top: B:860:0x0bfe }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0ee4 A[Catch: all -> 0x1039, TryCatch #16 {all -> 0x1039, blocks: (B:256:0x0eda, B:257:0x0ede, B:259:0x0ee4, B:262:0x0efe, B:265:0x0f0b, B:268:0x0f18, B:280:0x1006, B:282:0x100c, B:283:0x100d, B:285:0x100f, B:287:0x1016, B:288:0x1017, B:233:0x0cc8, B:245:0x0db9, B:247:0x0dbf, B:248:0x0e03, B:250:0x0e2d, B:252:0x0e7a, B:254:0x0e90, B:255:0x0ed2, B:292:0x1027, B:294:0x102d, B:295:0x102e, B:297:0x1030, B:299:0x1037, B:300:0x1038, B:240:0x0d2c, B:242:0x0d41, B:243:0x0dad, B:235:0x0cdc, B:237:0x0cf1, B:238:0x0d25, B:276:0x0f8a, B:271:0x0f47, B:273:0x0f4d, B:274:0x0f78), top: B:859:0x0cc8, inners: #5, #11, #36, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x10c7 A[Catch: all -> 0x031e, TryCatch #57 {all -> 0x031e, blocks: (B:164:0x093a, B:166:0x0940, B:167:0x0968, B:311:0x10c1, B:313:0x10c7, B:314:0x10f2, B:423:0x161b, B:425:0x1621, B:426:0x1652, B:759:0x30d0, B:761:0x30d6, B:762:0x3106, B:803:0x347b, B:805:0x3481, B:806:0x34a4, B:783:0x32b3, B:785:0x32d6, B:786:0x332d, B:719:0x2d27, B:721:0x2d2d, B:722:0x2d59, B:602:0x2654, B:604:0x265a, B:605:0x2681, B:607:0x26bb, B:608:0x2701, B:573:0x2319, B:575:0x232e, B:576:0x235e, B:578:0x2392, B:579:0x2416, B:551:0x1f90, B:553:0x1f96, B:554:0x1fc1, B:556:0x1ffb, B:557:0x2048, B:525:0x1cff, B:527:0x1d14, B:528:0x1d46, B:509:0x1b0f, B:511:0x1b15, B:512:0x1b3e, B:208:0x0b4d, B:210:0x0b53, B:211:0x0b7b, B:20:0x0140, B:22:0x0146, B:23:0x016c, B:25:0x028e, B:27:0x02c0, B:28:0x0318), top: B:937:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x11d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x122c A[Catch: all -> 0x15b7, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x15b7, blocks: (B:318:0x1177, B:324:0x11c6, B:363:0x144e, B:364:0x1452, B:374:0x1496, B:371:0x147c, B:333:0x122c, B:351:0x133f, B:355:0x1387, B:358:0x13f2, B:362:0x1448), top: B:856:0x1177 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1458  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1492  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1496 A[Catch: all -> 0x15b7, PHI: r2 r4 r5
  0x1496: PHI (r2v553 java.lang.Object[]) = (r2v552 java.lang.Object[]), (r2v575 java.lang.Object[]) binds: [B:372:0x1490, B:369:0x1479] A[DONT_GENERATE, DONT_INLINE]
  0x1496: PHI (r4v488 int) = (r4v487 int), (r4v512 int) binds: [B:372:0x1490, B:369:0x1479] A[DONT_GENERATE, DONT_INLINE]
  0x1496: PHI (r5v458 int) = (r5v457 int), (r5v468 int) binds: [B:372:0x1490, B:369:0x1479] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #14 {all -> 0x15b7, blocks: (B:318:0x1177, B:324:0x11c6, B:363:0x144e, B:364:0x1452, B:374:0x1496, B:371:0x147c, B:333:0x122c, B:351:0x133f, B:355:0x1387, B:358:0x13f2, B:362:0x1448), top: B:856:0x1177 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1621 A[Catch: all -> 0x031e, TryCatch #57 {all -> 0x031e, blocks: (B:164:0x093a, B:166:0x0940, B:167:0x0968, B:311:0x10c1, B:313:0x10c7, B:314:0x10f2, B:423:0x161b, B:425:0x1621, B:426:0x1652, B:759:0x30d0, B:761:0x30d6, B:762:0x3106, B:803:0x347b, B:805:0x3481, B:806:0x34a4, B:783:0x32b3, B:785:0x32d6, B:786:0x332d, B:719:0x2d27, B:721:0x2d2d, B:722:0x2d59, B:602:0x2654, B:604:0x265a, B:605:0x2681, B:607:0x26bb, B:608:0x2701, B:573:0x2319, B:575:0x232e, B:576:0x235e, B:578:0x2392, B:579:0x2416, B:551:0x1f90, B:553:0x1f96, B:554:0x1fc1, B:556:0x1ffb, B:557:0x2048, B:525:0x1cff, B:527:0x1d14, B:528:0x1d46, B:509:0x1b0f, B:511:0x1b15, B:512:0x1b3e, B:208:0x0b4d, B:210:0x0b53, B:211:0x0b7b, B:20:0x0140, B:22:0x0146, B:23:0x016c, B:25:0x028e, B:27:0x02c0, B:28:0x0318), top: B:937:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x1736  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x17f9 A[Catch: all -> 0x1aa6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x1aa6, blocks: (B:430:0x16d8, B:436:0x1729, B:452:0x17f9), top: B:841:0x16d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x19ad  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x1b15 A[Catch: all -> 0x031e, TryCatch #57 {all -> 0x031e, blocks: (B:164:0x093a, B:166:0x0940, B:167:0x0968, B:311:0x10c1, B:313:0x10c7, B:314:0x10f2, B:423:0x161b, B:425:0x1621, B:426:0x1652, B:759:0x30d0, B:761:0x30d6, B:762:0x3106, B:803:0x347b, B:805:0x3481, B:806:0x34a4, B:783:0x32b3, B:785:0x32d6, B:786:0x332d, B:719:0x2d27, B:721:0x2d2d, B:722:0x2d59, B:602:0x2654, B:604:0x265a, B:605:0x2681, B:607:0x26bb, B:608:0x2701, B:573:0x2319, B:575:0x232e, B:576:0x235e, B:578:0x2392, B:579:0x2416, B:551:0x1f90, B:553:0x1f96, B:554:0x1fc1, B:556:0x1ffb, B:557:0x2048, B:525:0x1cff, B:527:0x1d14, B:528:0x1d46, B:509:0x1b0f, B:511:0x1b15, B:512:0x1b3e, B:208:0x0b4d, B:210:0x0b53, B:211:0x0b7b, B:20:0x0140, B:22:0x0146, B:23:0x016c, B:25:0x028e, B:27:0x02c0, B:28:0x0318), top: B:937:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1bc5  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x1c17  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x1cdf  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x1e87  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1f51  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x215d  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x21cb  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x2225  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x22fb  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x254c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x2615  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x2865 A[Catch: all -> 0x2838, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x2838, blocks: (B:613:0x27f6, B:619:0x2865, B:624:0x28c5, B:626:0x28cb, B:627:0x290f, B:630:0x2920, B:632:0x2924, B:636:0x2930), top: B:858:0x27f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x28c2  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x291c  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x2b70 A[Catch: all -> 0x2ca2, TryCatch #0 {all -> 0x2ca2, blocks: (B:662:0x2b66, B:663:0x2b6a, B:665:0x2b70, B:668:0x2b88, B:671:0x2b95, B:675:0x2ba4, B:676:0x2bac, B:688:0x2c90, B:690:0x2c96, B:691:0x2c97, B:693:0x2c99, B:695:0x2ca0, B:696:0x2ca1, B:640:0x2944, B:652:0x2a4d, B:654:0x2a53, B:655:0x2a98, B:657:0x2ac2, B:658:0x2b09, B:660:0x2b1f, B:661:0x2b60, B:700:0x2ca5, B:702:0x2cac, B:703:0x2cad, B:705:0x2caf, B:707:0x2cb6, B:708:0x2cb7, B:647:0x29a5, B:649:0x29c4, B:650:0x2a41, B:642:0x2958, B:644:0x296d, B:645:0x299e, B:684:0x2c15, B:679:0x2bdb, B:681:0x2be1, B:682:0x2c0d), top: B:832:0x2944, inners: #3, #10, #45, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:721:0x2d2d A[Catch: all -> 0x031e, TryCatch #57 {all -> 0x031e, blocks: (B:164:0x093a, B:166:0x0940, B:167:0x0968, B:311:0x10c1, B:313:0x10c7, B:314:0x10f2, B:423:0x161b, B:425:0x1621, B:426:0x1652, B:759:0x30d0, B:761:0x30d6, B:762:0x3106, B:803:0x347b, B:805:0x3481, B:806:0x34a4, B:783:0x32b3, B:785:0x32d6, B:786:0x332d, B:719:0x2d27, B:721:0x2d2d, B:722:0x2d59, B:602:0x2654, B:604:0x265a, B:605:0x2681, B:607:0x26bb, B:608:0x2701, B:573:0x2319, B:575:0x232e, B:576:0x235e, B:578:0x2392, B:579:0x2416, B:551:0x1f90, B:553:0x1f96, B:554:0x1fc1, B:556:0x1ffb, B:557:0x2048, B:525:0x1cff, B:527:0x1d14, B:528:0x1d46, B:509:0x1b0f, B:511:0x1b15, B:512:0x1b3e, B:208:0x0b4d, B:210:0x0b53, B:211:0x0b7b, B:20:0x0140, B:22:0x0146, B:23:0x016c, B:25:0x028e, B:27:0x02c0, B:28:0x0318), top: B:937:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x2de3  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x2e33  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x2ef6  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x30ad  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x3191  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x31e6  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x3295  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x345d  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x16de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:858:0x27f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:864:0x117d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:893:0x09eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:965:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v262, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v75 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v667 */
    /* JADX WARN: Type inference failed for: r1v680, types: [int] */
    /* JADX WARN: Type inference failed for: r1v681 */
    /* JADX WARN: Type inference failed for: r1v682 */
    /* JADX WARN: Type inference failed for: r1v683 */
    /* JADX WARN: Type inference failed for: r1v684 */
    /* JADX WARN: Type inference failed for: r1v685 */
    /* JADX WARN: Type inference failed for: r1v692 */
    /* JADX WARN: Type inference failed for: r1v700 */
    /* JADX WARN: Type inference failed for: r1v701 */
    /* JADX WARN: Type inference failed for: r1v705 */
    /* JADX WARN: Type inference failed for: r1v706 */
    /* JADX WARN: Type inference failed for: r1v707 */
    /* JADX WARN: Type inference failed for: r1v708 */
    /* JADX WARN: Type inference failed for: r1v709 */
    /* JADX WARN: Type inference failed for: r1v710 */
    /* JADX WARN: Type inference failed for: r1v711 */
    /* JADX WARN: Type inference failed for: r1v712 */
    /* JADX WARN: Type inference failed for: r1v713 */
    /* JADX WARN: Type inference failed for: r1v714 */
    /* JADX WARN: Type inference failed for: r27v101 */
    /* JADX WARN: Type inference failed for: r27v102 */
    /* JADX WARN: Type inference failed for: r27v103 */
    /* JADX WARN: Type inference failed for: r27v104 */
    /* JADX WARN: Type inference failed for: r27v105 */
    /* JADX WARN: Type inference failed for: r27v111 */
    /* JADX WARN: Type inference failed for: r27v112 */
    /* JADX WARN: Type inference failed for: r27v117 */
    /* JADX WARN: Type inference failed for: r27v119 */
    /* JADX WARN: Type inference failed for: r27v120 */
    /* JADX WARN: Type inference failed for: r27v122 */
    /* JADX WARN: Type inference failed for: r27v123 */
    /* JADX WARN: Type inference failed for: r27v134 */
    /* JADX WARN: Type inference failed for: r27v135 */
    /* JADX WARN: Type inference failed for: r27v136 */
    /* JADX WARN: Type inference failed for: r27v137 */
    /* JADX WARN: Type inference failed for: r27v138 */
    /* JADX WARN: Type inference failed for: r27v139 */
    /* JADX WARN: Type inference failed for: r27v140 */
    /* JADX WARN: Type inference failed for: r27v144 */
    /* JADX WARN: Type inference failed for: r27v153 */
    /* JADX WARN: Type inference failed for: r27v154 */
    /* JADX WARN: Type inference failed for: r27v157 */
    /* JADX WARN: Type inference failed for: r27v158 */
    /* JADX WARN: Type inference failed for: r27v159 */
    /* JADX WARN: Type inference failed for: r27v160 */
    /* JADX WARN: Type inference failed for: r27v161 */
    /* JADX WARN: Type inference failed for: r27v162 */
    /* JADX WARN: Type inference failed for: r27v163 */
    /* JADX WARN: Type inference failed for: r27v164 */
    /* JADX WARN: Type inference failed for: r27v165 */
    /* JADX WARN: Type inference failed for: r27v166 */
    /* JADX WARN: Type inference failed for: r27v167 */
    /* JADX WARN: Type inference failed for: r27v168 */
    /* JADX WARN: Type inference failed for: r27v169 */
    /* JADX WARN: Type inference failed for: r27v170 */
    /* JADX WARN: Type inference failed for: r27v171 */
    /* JADX WARN: Type inference failed for: r27v172 */
    /* JADX WARN: Type inference failed for: r27v173 */
    /* JADX WARN: Type inference failed for: r27v174 */
    /* JADX WARN: Type inference failed for: r27v175 */
    /* JADX WARN: Type inference failed for: r27v176 */
    /* JADX WARN: Type inference failed for: r27v177 */
    /* JADX WARN: Type inference failed for: r27v178 */
    /* JADX WARN: Type inference failed for: r27v181 */
    /* JADX WARN: Type inference failed for: r27v182 */
    /* JADX WARN: Type inference failed for: r27v183 */
    /* JADX WARN: Type inference failed for: r27v23 */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v54 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v74 */
    /* JADX WARN: Type inference failed for: r27v76 */
    /* JADX WARN: Type inference failed for: r27v77 */
    /* JADX WARN: Type inference failed for: r27v78 */
    /* JADX WARN: Type inference failed for: r27v79 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v80 */
    /* JADX WARN: Type inference failed for: r27v82 */
    /* JADX WARN: Type inference failed for: r27v83 */
    /* JADX WARN: Type inference failed for: r27v88 */
    /* JADX WARN: Type inference failed for: r27v89 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r27v90 */
    /* JADX WARN: Type inference failed for: r27v93 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v664, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v668 */
    /* JADX WARN: Type inference failed for: r2v701 */
    /* JADX WARN: Type inference failed for: r3v648 */
    /* JADX WARN: Type inference failed for: r3v649 */
    /* JADX WARN: Type inference failed for: r3v658, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v672 */
    /* JADX WARN: Type inference failed for: r3v698 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.SfcEasyTalkBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getSponsorBeneficiariesState = 1;
        component3();
        copydefault();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = equals + 17;
        getSponsorBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = hashCode + 11;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = toString + 123;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        ShareDataUIState = (char) 6240;
        component1 = (char) 21605;
        copydefault = (char) 22457;
        component2 = (char) 18586;
        int i5 = i3 + 45;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component3 = (char) 58065;
        getRequestBeneficiariesState = (char) 54403;
        getAsAtTimestamp = (char) 53634;
        component4 = (char) 10156;
        copy = new char[]{33513, 33452, 33464, 33408, 33465, 33535, 33411, 33471, 33408, 33412, 33435, 33434, 33435, 33433, 33410, 33451, 33450, 33408, 33435, 33436, 33411, 33451, 33450, 33410, 33433, 33435, 33434, 33431, 33431, 33433, 33410, 33409, 33434, 33411, 33411, 33435, 33410, 33411, 33435, 33410, 33413, 33438, 33412, 33408, 33408, 33408, 33432, 33431, 33430, 33435, 33434, 33433, 33412, 33412, 33434, 33409, 33408, 33433, 33438, 33438, 33413, 33453, 33451, 33408, 33433, 33434, 33433, 33434, 33410, 33477, 33514, 33515, 33519, 33521, 33515, 33515, 33519, 33521, 33518, 33427, 33429, 33516, 33514, 33428, 33430, 33429, 33429, 33516, 33514, 33429, 33428, 33512, 33513, 33513, 33425, 33427, 33427, 33426, 33518, 33432, 33430, 33517, 33429, 33432, 33518, 33332, 33337, 33284, 33337, 33343, 33288, 33289, 33284, 33288, 33289, 33342, 33386, 33285, 33338, 33292, 33381, 33454, 33284, 33292, 33301, 33301, 33293, 33290, 33280, 33282, 33285, 33287, 33291, 33288, 33290, 33288, 33477, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33515, 33515, 33476, 33512, 33514, 33515, 33513, 33512, 33513, 33513, 33514, 33516};
    }
}
