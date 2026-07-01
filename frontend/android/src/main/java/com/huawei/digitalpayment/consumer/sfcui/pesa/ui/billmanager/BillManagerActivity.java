package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u001c\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerActivity;", "Lcom/safaricom/sharedui/compose/activity/BackHandlerActivity;", "<init>", "()V", "billManagerViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerViewModel;", "getBillManagerViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerViewModel;", "billManagerViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setWindowInsets", "observeScreenChange", "screenTransition", "Landroidx/lifecycle/LiveData;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "handleBackPress", "changeScreen", "screenInformation", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class BillManagerActivity extends Hilt_BillManagerActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static long component1;
    private static long component2;
    private static int copy;

    private final Lazy billManagerViewModel;
    private static final byte[] $$c = {79, Ascii.ETB, 89, Ascii.VT};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {121, -58, 81, 67, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, TarHeader.LF_FIFO, 3, 3, -72, TarHeader.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -18, Ascii.DC2, -10, Ascii.SO, -16, -36, Ascii.SUB, Ascii.DLE, -22, -15, -15, 7, Ascii.RS, -22, Ascii.DLE, -18, 9, -5, 0, -4, -4, -12, 6, 3, PSSSigner.TRAILER_IMPLICIT, 9, -5, -66, TarHeader.LF_NORMAL, 5, 6, -19, 9, -15, -55, 59, 0, 2, -3, -14, -7, -58, TarHeader.LF_NORMAL, 10, -8, 1, -15, Ascii.DLE, -14, 3, -4, -67, TarHeader.LF_SYMLINK, 9, -4, 3, -18, 6, 3, -73, Ascii.DC2, 41, -5, 0, -4, 3, -10, -13, -19, Ascii.ESC, -12, 1, -32, Ascii.SO, Ascii.DLE, -15, -40, 41, -4, 3, -18, 6, 3, 9, -5, 0, -4, -4, -12, 6, 3, -69, 9, -5, -66, TarHeader.LF_NORMAL, 8, -6, -10, -4, -2, -4, -54, TarHeader.LF_FIFO, 8, -12, 10, -20, 10, -71, TarHeader.LF_LINK, -4, Ascii.SI, -17, -58, 68, -15, -62, 70, -17, -8, 0, -5, Ascii.FF, -73, Ascii.SYN, 40, -12, 10, -20, 10, -50, 34, -6, -5, 5, -44, 42, 6, 9, -2, 6, -24, -2, -2, -8, 17, -12, 5, 9, -5, -66, TarHeader.LF_NORMAL, 8, -6, -10, -4, -2, -4, -54, TarHeader.LF_NORMAL, Ascii.SO, -12, 10, -20, 10, -71, TarHeader.LF_NORMAL, Ascii.FF, -3, -69, Ascii.DLE, 44, -3, -37, Ascii.RS, -14, -2, PSSSigner.TRAILER_IMPLICIT, Ascii.VT, -17, 10};
    private static final int $$k = 91;
    private static final byte[] $$a = {Ascii.EM, 43, 92, -56, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 127;
    private static int ShareDataUIState = 0;
    private static int copydefault = 0;
    private static int component3 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component1 = 1;
        private static int component2;

        static {
            int[] iArr = new int[ScreenDirection.values().length];
            try {
                iArr[ScreenDirection.FORWARD.ordinal()] = 1;
                int i = component2 + 87;
                component1 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenDirection.NONE.ordinal()] = 2;
                int i3 = component1 + 11;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenDirection.BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final Function1 copydefault;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 45;
            ShareDataUIState = i3 % 128;
            boolean zAreEqual = false;
            if (i3 % 2 == 0 ? (obj instanceof Observer) : (obj instanceof Observer)) {
                if (obj instanceof FunctionAdapter) {
                    int i4 = i2 + 7;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i6 = component2 + 69;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return zAreEqual;
            }
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.copydefault;
            if (i3 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            int i4 = 62 / 0;
            return functionDelegate.hashCode();
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, byte r7, short r8) {
        /*
            int r7 = 105 - r7
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.$$c
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.$$i(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 28 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.$$a
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-8)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.$$j
            int r6 = 59 - r6
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2c
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + 3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.d(int, int, short, java.lang.Object[]):void");
    }

    public static final void access$changeScreen(BillManagerActivity billManagerActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        billManagerActivity.changeScreen(screenInformation);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 73;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public BillManagerActivity() {
        final BillManagerActivity billManagerActivity = this;
        final Function0 function0 = null;
        this.billManagerViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BillManagerViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = billManagerActivity.getViewModelStore();
                int i4 = copydefault + 77;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 19;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 16 / 0;
                }
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
                int i2 = component2 + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 89;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return factoryInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                component2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    billManagerActivity.getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = billManagerActivity.getDefaultViewModelProviderFactory();
                int i3 = component2 + 67;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
  0x001b: PHI (r2v3 kotlin.jvm.functions.Function0) = (r2v2 kotlin.jvm.functions.Function0), (r2v7 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity$special$$inlined$viewModels$default$3.component2
                    int r2 = r1 + 47
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity$special$$inlined$viewModels$default$3.component3 = r3
                    int r2 = r2 % r0
                    if (r2 == 0) goto L17
                    kotlin.jvm.functions.Function0 r2 = r1
                    r3 = 66
                    int r3 = r3 / 0
                    if (r2 == 0) goto L2a
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r2 = r1
                    if (r2 == 0) goto L2a
                L1b:
                    int r1 = r1 + 13
                    int r3 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity$special$$inlined$viewModels$default$3.component3 = r3
                    int r1 = r1 % r0
                    java.lang.Object r1 = r2.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L39
                L2a:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity$special$$inlined$viewModels$default$3.component3
                    int r2 = r2 + 125
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity$special$$inlined$viewModels$default$3.component2 = r3
                    int r2 = r2 % r0
                L39:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 61;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 99 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final BillManagerViewModel getBillManagerViewModel() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BillManagerViewModel billManagerViewModel = (BillManagerViewModel) this.billManagerViewModel.getValue();
        if (i3 == 0) {
            return billManagerViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class copydefault extends FunctionReferenceImpl implements Function1<ScreenInformation<BillManagerScreen>, Unit> {
        private static int component2 = 1;
        private static int component3;

        public final void ShareDataUIState(ScreenInformation<BillManagerScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(screenInformation, "");
                BillManagerActivity.access$changeScreen((BillManagerActivity) this.receiver, screenInformation);
            } else {
                Intrinsics.checkNotNullParameter(screenInformation, "");
                BillManagerActivity.access$changeScreen((BillManagerActivity) this.receiver, screenInformation);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public Unit invoke(ScreenInformation<BillManagerScreen> screenInformation) {
            int i = 2 % 2;
            int i2 = component2 + 89;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(screenInformation);
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 99;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return unit;
        }

        copydefault(Object obj) {
            super(1, obj, BillManagerActivity.class, "changeScreen", "changeScreen(Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;)V", 0);
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33, (char) (63440 - View.resolveSize(0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 1390, 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (51270 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1883291598, false, $$i(b2, b3, (byte) (b3 - 2)), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 43;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        char c2 = 2;
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            char c3 = cArr[notifyVar.copydefault];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c2] = notifyVar;
                objArr2[1] = notifyVar;
                objArr2[0] = Integer.valueOf(c3);
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 3);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3266, 33 - (Process.myTid() >> 22), (char) (60268 - Color.blue(0)), -834797019, false, $$i(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0, 0) + 34, (char) (ExpandableListView.getPackedPositionChild(0L) + 60374), -1969106284, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                c2 = 2;
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
        int i4 = $10 + 63;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.resolveSize(0, 0), 34 - KeyEvent.normalizeMetaState(0), (char) (60373 - TextUtils.indexOf("", "")), -1969106284, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $11 + 77;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 55 / 0;
            objArr[0] = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public final void start(Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new Intent(context, (Class<?>) BillManagerActivity.class));
            int i2 = component3 + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x1b63  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x018d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.onCreate(android.os.Bundle):void");
    }

    private final void setWindowInsets() {
        int i = 2 % 2;
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.content), new OnApplyWindowInsetsListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 63;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                WindowInsetsCompat windowInsetsCompatM11557$r8$lambda$GsLNV7OAGfl8ykKD7saxSGKTZU = BillManagerActivity.m11557$r8$lambda$GsLNV7OAGfl8ykKD7saxSGKTZU(view, windowInsetsCompat);
                if (i4 != 0) {
                    int i5 = 72 / 0;
                }
                return windowInsetsCompatM11557$r8$lambda$GsLNV7OAGfl8ykKD7saxSGKTZU;
            }
        });
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
    }

    private static final WindowInsetsCompat setWindowInsets$lambda$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        int i4 = component3 + 77;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    private final void observeScreenChange(LiveData<ScreenInformation<BillManagerScreen>> screenTransition) {
        int i = 2 % 2;
        screenTransition.observe(this, new component1(new copydefault(this)));
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void handleBackPress() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            getBillManagerViewModel().previousScreen();
            int i3 = 37 / 0;
        } else {
            getBillManagerViewModel().previousScreen();
        }
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void changeScreen(com.safaricom.sharedui.compose.navigation.ScreenInformation<com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen> r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.changeScreen(com.safaricom.sharedui.compose.navigation.ScreenInformation):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c7, code lost:
    
        if (r1 == (((((~((-716464166) | r4)) | 672161824) * (-283)) + 1014310028) + ((~(r4 | (-44302342))) * 283))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c9, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.copydefault + 113;
        com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.component3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d2, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d4, code lost:
    
        r1 = android.widget.Toast.makeText((android.content.Context) null, 991695591 / ((991695591 / (991695591 % 0)) >> 3), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        r1.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e8, code lost:
    
        r1 = android.widget.Toast.makeText((android.content.Context) null, 991695591 / 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f1, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.onConfigurationChanged.component3[0]).getInt(null);
        r4 = (int) java.lang.Runtime.getRuntime().freeMemory();
        r5 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0125, code lost:
    
        if (r1 != (((85985067 + (((~(r5 | 1068968815)) | 554697280) * 220)) + (((~(r5 | 590818123)) | 1032847972) * (-440))) + ((r4 | 1068968815) * 220))) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0127, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.onRetainCustomNonConfigurationInstance.ShareDataUIState[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r4 = ~r2;
        r6 = ~((-934468720) | r4);
        r7 = ~((-294562622) | r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x015c, code lost:
    
        if (r1 != ((((-1089352616) + ((r6 | r7) * 1150)) + (((~(294562621 | r4)) | r7) * (-575))) + (((~(r2 | (-934468720))) | (~(r4 | 934468719))) * 575))) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x015e, code lost:
    
        super.onStart();
        r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.copydefault + 53;
        com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x016b, code lost:
    
        r0 = (java.lang.Integer) null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x017b, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(1431671723));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0188, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(-219302213));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r1 == (((2051822584 + (((~(1558727995 | r5)) | (-2130566656)) * 98)) + ((((~(r5 | (-710776015))) | 1558727995) | (~(710776014 | r4))) * (-49))) + (((~(r4 | 1558727995)) | 1419790641) * 49))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a0, code lost:
    
        if (r1 == ((((-1347096986) + ((r5 | (~((-1074546870) | r6))) * (-406))) + ((~(1603271935 | r6)) * (-406))) + (((~(r4 | (-528725067))) | (~((-1376677048) | r6))) * com.huawei.digitalpayment.consumer.base.http.HaProxyConstants.VOUCHER_TOP_UP_SUCESS))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a2, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.getLastCustomNonConfigurationInstance.component2[0]).getInt(null);
        r4 = java.lang.System.identityHashCode(r9);
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x011d, code lost:
    
        if (r1 != (((2000736 + (((~((-958587458) | r8)) | (~((~r8) | (-1187512597)))) * (-318))) + (((~(958916163 | r8)) | (-2146428760)) * (-318))) + (((~(r8 | (-958916164))) | 1187841302) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x011f, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.onMenuItemSelected.component2[0]).getInt(null);
        r8 = ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).codePointAt(0) - 1256942263;
        r10 = ~((-1361086755) | r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x016e, code lost:
    
        if (r1 != ((((-1745082205) + ((235152525 | r10) * (-476))) + (r10 * 952)) + ((~((~r8) | (-1361086755))) * 476))) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0170, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.onCreatePanelMenu.ShareDataUIState[0]).getInt(null);
        r8 = new java.util.Random().nextInt(1014979760);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01a2, code lost:
    
        if (r1 != (((((~((-186146943) | r9)) | (~(r8 | 1042884398))) * 959) - 1793468229) + (((~(r8 | (-186146943))) | (~((~r8) | 1042884398))) * 959))) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01a4, code lost:
    
        r1 = getBaseContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01a8, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01aa, code lost:
    
        r10 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 102, new char[]{52043, 52010, 44434, 53562, 37166, 46891, 26822, 49419, 14396, 48781, 32238, 56943, 11546, 46012, 20194, 60295, 4674, 34647, 17294, 63704, 1885, 39029, 21686, 62944, 29799, 60780, 10328, 33412, 31162, 65032}, r10);
        r1 = java.lang.Class.forName((java.lang.String) r10[0]);
        r4 = new java.lang.Object[1];
        b(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) + 48455, new char[]{57889, 24400, 39166, 55813, 6075, 20783, 37468, 53202, 2314, 19117, 33832, 49478, 757, 31768, 47508, 64290, 13405, 29179}, r4);
        r1 = (android.content.Context) r1.getMethod((java.lang.String) r4[0], new java.lang.Class[0]).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0223, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0228, code lost:
    
        if ((!(r1 instanceof android.content.ContextWrapper)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0232, code lost:
    
        if (((android.content.ContextWrapper) r1).getBaseContext() == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0234, code lost:
    
        r1 = r1.getApplicationContext();
        r2 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.copydefault + 69;
        com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.component3 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0242, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0243, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0245, code lost:
    
        r2 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.copydefault + 27;
        com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.component3 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0251, code lost:
    
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0255, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0257, code lost:
    
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 42 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.graphics.Color.alpha(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0278, code lost:
    
        r0 = ((java.lang.reflect.Method) r0).invoke(null, null);
        r1 = new java.lang.Object[]{r1};
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(320115330);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0289, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028b, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6562, 56 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 1), -699576857, false, "component2", new java.lang.Class[]{android.content.Context.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02b3, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02ba, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02be, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02c0, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02c1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02c2, code lost:
    
        super.onResume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02d2, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(-717261777));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02d3, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.component3 + 91;
        com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.copydefault = r1 % 128;
        r1 = r1 % 2;
        r0 = (java.lang.Integer) null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02e0, code lost:
    
        r0 = (java.lang.Integer) null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02e4, code lost:
    
        r0 = (java.lang.Integer) null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006d, code lost:
    
        if (r1 == ((r11 + ((r10 | (~(2138562005 | r8))) * 50)) + (((~(r8 | 1047975124)) | ((~(1895927105 | r8)) | (-2138562006))) * 50))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00c4, code lost:
    
        if (r1 == ((((-495153096) + (((~((-114004569) | r9)) | (~(961956549 | r8))) * com.alibaba.griver.image.framework.utils.FileUtils.JPEG_MARKER_EOI)) + (((~(r8 | (-114004569))) | 109678616) * com.alibaba.griver.image.framework.utils.FileUtils.JPEG_MARKER_EOI)) + (((~(961956549 | r9)) | 114004568) * com.alibaba.griver.image.framework.utils.FileUtils.JPEG_MARKER_EOI))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c6, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.onBackPressed.component1[0]).getInt(null);
        r9 = (java.lang.Object[]) null;
        r8 = ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 288458406;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(26) - 121, new char[]{52043, 52010, 44434, 53562, 37166, 46891, 26822, 49419, 14396, 48781, 32238, 56943, 11546, 46012, 20194, 60295, 4674, 34647, 17294, 63704, 1885, 39029, 21686, 62944, 29799, 60780, 10328, 33412, 31162, 65032}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(48487 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{57889, 24400, 39166, 55813, 6075, 20783, 37468, 53202, 2314, 19117, 33832, 49478, 757, 31768, 47508, 64290, 13405, 29179}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component3 + 61;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i3 = copydefault + 125;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 42 - Color.red(0), (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6562, 55 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -960739708, false, "component3", new Class[]{Context.class});
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
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r40) {
        /*
            Method dump skipped, instruction units count: 14452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerActivity.attachBaseContext(android.content.Context):void");
    }

    public static WindowInsetsCompat m11557$r8$lambda$GsLNV7OAGfl8ykKD7saxSGKTZU(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsets$lambda$0 = setWindowInsets$lambda$0(view, windowInsetsCompat);
        int i4 = copydefault + 27;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return windowInsets$lambda$0;
    }

    static {
        copy = 1;
        ShareDataUIState();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = ShareDataUIState + 89;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    static void ShareDataUIState() {
        component2 = 4049871531370696791L;
        component1 = 2054895189191713384L;
    }
}
