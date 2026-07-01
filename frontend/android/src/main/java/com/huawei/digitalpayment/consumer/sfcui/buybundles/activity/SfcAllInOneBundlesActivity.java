package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivityKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.PackageList;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.utils.BundleTypes;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.EdgeToEdge;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.m1;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\"\u0010\u0015\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0017 \u0018*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00160\u0016X\u008a\u0084\u0002²\u0006\u0018\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u001aX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/SfcAllInOneBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "buyBundleViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getBuyBundleViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "buyBundleViewModel$delegate", "Lkotlin/Lazy;", "returnDestination", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "ConsumerSfcUI_release", "bundlesList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "kotlin.jvm.PlatformType", "bundlesResource", "Lcom/huawei/payment/mvvm/Resource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcAllInOneBundlesActivity extends Hilt_SfcAllInOneBundlesActivity {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static char[] component3;
    private static char component4;
    private static int copy;
    private static long copydefault;

    private final Lazy buyBundleViewModel;
    private String returnDestination;
    private static final byte[] $$l = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$m = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM, -26, 2, -22, 8, Ascii.FS, -34, -24, Ascii.SO, 7, 7, -15, -38, Ascii.SO, -24, 10, -17, -6, -14, Ascii.DLE, -6, -6, 0, -25, 4, -13, -17, -3, -8, -4, -4, 4, -14, -11, 60, -17, -3, 58, -63, -18, Ascii.SI, -27, 13, -9, TarHeader.LF_FIFO, -59, -10, -3, -7, -16, Ascii.SO, -16, -9, 10, -29, 7, 3, -14, -11, 65, -58, -17, -4, -10, -7, 3, 3, -18, 63, -74, 8, -2, -23, 7, TarHeader.LF_FIFO, -57, -24, -9, Ascii.DC2, -24, 2, 5, -13, 2, -19, SignedBytes.MAX_POWER_OF_TWO, -56, -7, -22, 6, -18, 8, -16, -10, 70, -42, -24, -2, Ascii.SUB, -34, -24, Ascii.SO, 13, -36, -3, -18, TarHeader.LF_SYMLINK, -56, 2, 5, -13, 2, -19, 45, -39, -22, 6, -18, 8, -16, -10, 41, -46, 75, PSSSigner.TRAILER_IMPLICIT, -17, -6, -14, Ascii.DLE, -6, -6, 0, -25, 4, -13, -9, -10, 3, -2, -10, -15, 69, -58, -17, -8, -2, -11, -4, 6, -10, 4, -19, SignedBytes.MAX_POWER_OF_TWO, -59, -6, -2, -24, 9, TarHeader.LF_BLK, -64, -10, -11, 10, -18, -1, 8, -16, 57, -27, -38, -2, -24, 9, Ascii.US, -49, -8, -2, -11, -4, 6, -10, 4, Ascii.ETB, -42, 3, -14, 33, -41, -8, -1, 67, -52, -26, 2, -22, 8, Ascii.FS, -34, -24, Ascii.SO, 7, 7, -15, -38, Ascii.SO, -24, 10, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol};
    private static final int $$k = 104;
    private static final byte[] $$d = {69, -50, 81, 75, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 225;
    private static int getAsAtTimestamp = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;

    private static String $$n(int i, int i2, int i3) {
        int i4 = 3 - (i3 * 3);
        int i5 = i2 + 98;
        byte[] bArr = $$l;
        int i6 = i * 4;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + i5;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            i5 += bArr[i4];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.$$d
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.g(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.$$j
            int r5 = r5 * 8
            int r5 = r5 + 83
            int r1 = 101 - r6
            byte[] r1 = new byte[r1]
            int r6 = 100 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r5 = r6
            r4 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.i(short, byte, int, java.lang.Object[]):void");
    }

    public static final BuyBundleViewModel access$getBuyBundleViewModel(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity) {
        int i = 2 % 2;
        int i2 = equals + 3;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = sfcAllInOneBundlesActivity.getBuyBundleViewModel();
        int i4 = getRequestBeneficiariesState + 31;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return buyBundleViewModel;
    }

    public static final void access$onBundleSelected(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = equals + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sfcAllInOneBundlesActivity.onBundleSelected(withExpiryResp);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcAllInOneBundlesActivity() {
        final SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity = this;
        final Function0 function0 = null;
        this.buyBundleViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i = 2 % 2;
                int i2 = component3 + 41;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    viewModelStore = sfcAllInOneBundlesActivity.getViewModelStore();
                    int i3 = 13 / 0;
                } else {
                    viewModelStore = sfcAllInOneBundlesActivity.getViewModelStore();
                }
                int i4 = component3 + 83;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 69;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 5;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 105;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 23 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 41;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = sfcAllInOneBundlesActivity;
                if (i3 == 0) {
                    return componentActivity.getDefaultViewModelProviderFactory();
                }
                componentActivity.getDefaultViewModelProviderFactory();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState
                    int r1 = r1 + 61
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.copydefault = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L40
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L21
                    int r2 = r2 + 25
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r3
                    int r2 = r2 % r0
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L30
                L21:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.copydefault
                    int r2 = r2 + 111
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r3
                    int r2 = r2 % r0
                L30:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.copydefault
                    int r2 = r2 + 69
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L3f
                    r0 = 59
                    int r0 = r0 / 0
                L3f:
                    return r1
                L40:
                    r0 = 0
                    r0.hashCode()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                CreationExtras creationExtrasInvoke;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 103;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    creationExtrasInvoke = invoke();
                    int i3 = 44 / 0;
                } else {
                    creationExtrasInvoke = invoke();
                }
                int i4 = copydefault + 5;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final BuyBundleViewModel getBuyBundleViewModel() {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = (BuyBundleViewModel) this.buyBundleViewModel.getValue();
        int i4 = getRequestBeneficiariesState + 89;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return buyBundleViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        public static final Resource component1(State state) {
            int i = 2 % 2;
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> resourceComponent3 = component3(state);
            int i4 = ShareDataUIState + 45;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return resourceComponent3;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 97;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component1;
            final State<Resource<List<Plans>>> component2;
            final List<WithExpiryResp> component3;
            final SfcAllInOneBundlesActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component1 + 31;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 109;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component1(androidx.compose.runtime.Composer r11, int r12) {
                /*
                    r10 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r12 = r12 & 11
                    if (r12 != r0) goto L1c
                    boolean r12 = r11.getSkipping()
                    if (r12 != 0) goto L17
                    int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.ShareDataUIState
                    int r12 = r12 + 15
                    int r1 = r12 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.component1 = r1
                    int r12 = r12 % r0
                    goto L1c
                L17:
                    r11.skipToGroupEnd()
                    goto L95
                L1c:
                    java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp> r1 = r10.component3
                    androidx.compose.runtime.State<com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans>>> r12 = r10.component2
                    com.huawei.payment.mvvm.Resource r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.component1(r12)
                    r2 = 0
                    r3 = 1
                    if (r12 == 0) goto L42
                    int r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.ShareDataUIState
                    int r4 = r4 + 47
                    int r5 = r4 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.component1 = r5
                    int r4 = r4 % r0
                    if (r4 == 0) goto L3a
                    boolean r12 = r12.loading()
                    if (r12 != 0) goto L42
                    goto L40
                L3a:
                    boolean r12 = r12.loading()
                    if (r12 != r3) goto L42
                L40:
                    r12 = r3
                    goto L43
                L42:
                    r12 = r2
                L43:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0 r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity r5 = r10.copydefault
                    r4.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity r6 = r10.copydefault
                    r5.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda2 r6 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity r7 = r10.copydefault
                    r6.<init>()
                    androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.INSTANCE
                    androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
                    r8 = 0
                    r9 = 0
                    androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r7, r8, r3, r9)
                    androidx.compose.foundation.layout.WindowInsets$Companion r7 = androidx.compose.foundation.layout.WindowInsets.INSTANCE
                    r8 = 8
                    androidx.compose.foundation.layout.WindowInsets r7 = androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(r7, r11, r8)
                    androidx.compose.foundation.layout.WindowInsetsSides$Companion r8 = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE
                    int r8 = r8.m1267getTopJoeWqyM()
                    androidx.compose.foundation.layout.WindowInsets r7 = androidx.compose.foundation.layout.WindowInsetsKt.m1239onlybOOhFvg(r7, r8)
                    androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(r7, r11, r2)
                    androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.PaddingKt.padding(r3, r2)
                    r8 = 8
                    r9 = 0
                    r2 = r12
                    r3 = r4
                    r4 = r5
                    r5 = r6
                    r6 = r7
                    r7 = r11
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivityKt.AllInOneBundlesScreen(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    int r11 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.component1
                    int r11 = r11 + 93
                    int r12 = r11 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.ShareDataUIState = r12
                    int r11 = r11 % r0
                    if (r11 != 0) goto L95
                    r11 = 3
                    int r11 = r11 % r11
                L95:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.copydefault.AnonymousClass4.component1(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit ShareDataUIState(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = component1 + 109;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcAllInOneBundlesActivity, "");
                    Intrinsics.checkNotNullParameter(withExpiryResp, "");
                    SfcAllInOneBundlesActivity.access$onBundleSelected(sfcAllInOneBundlesActivity, withExpiryResp);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcAllInOneBundlesActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                SfcAllInOneBundlesActivity.access$onBundleSelected(sfcAllInOneBundlesActivity, withExpiryResp);
                Unit unit2 = Unit.INSTANCE;
                int i3 = ShareDataUIState + 13;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit copydefault(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity) {
                int i = 2 % 2;
                int i2 = component1 + 63;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcAllInOneBundlesActivity, "");
                SfcAllInOneBundlesActivity.access$getBuyBundleViewModel(sfcAllInOneBundlesActivity).getExpiryBundlesCatalog();
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 107;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component3(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity) {
                int i = 2 % 2;
                int i2 = component1 + 83;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcAllInOneBundlesActivity, "");
                sfcAllInOneBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 117;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            public static Unit copydefault(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return ShareDataUIState(sfcAllInOneBundlesActivity, withExpiryResp);
                }
                ShareDataUIState(sfcAllInOneBundlesActivity, withExpiryResp);
                throw null;
            }

            public static Unit component1(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity) {
                int i = 2 % 2;
                int i2 = component1 + 11;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return copydefault(sfcAllInOneBundlesActivity);
                }
                copydefault(sfcAllInOneBundlesActivity);
                throw null;
            }

            public static Unit ShareDataUIState(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(sfcAllInOneBundlesActivity);
                int i4 = ShareDataUIState + 37;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            AnonymousClass4(List<WithExpiryResp> list, State<Resource<List<Plans>>> state, SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity) {
                this.component3 = list;
                this.component2 = state;
                this.copydefault = sfcAllInOneBundlesActivity;
            }
        }

        public final void ShareDataUIState(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 23;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 11) == 2) {
                int i6 = i4 + 55;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(SfcAllInOneBundlesActivity.access$getBuyBundleViewModel(SfcAllInOneBundlesActivity.this).getFilteredBundleData(), CollectionsKt.emptyList(), composer, 56);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(SfcAllInOneBundlesActivity.access$getBuyBundleViewModel(SfcAllInOneBundlesActivity.this).getOtherBundlesData(), composer, 8);
            List<Plans> listShareDataUIState = ShareDataUIState(stateObserveAsState);
            if (listShareDataUIState == null) {
                listShareDataUIState = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listShareDataUIState.iterator();
            while (true) {
                List<PackageList> listEmptyList = null;
                if (!it.hasNext()) {
                    break;
                }
                Plans plans = (Plans) it.next();
                if (plans != null) {
                    int i8 = ShareDataUIState + 109;
                    component2 = i8 % 128;
                    if (i8 % 2 == 0) {
                        listEmptyList = plans.getPackageList();
                        int i9 = 80 / 0;
                    } else {
                        listEmptyList = plans.getPackageList();
                    }
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList, listEmptyList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List<SubBundles> childBundles = ((PackageList) it2.next()).getChildBundles();
                if (childBundles == null) {
                    childBundles = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList2, childBundles);
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                int i10 = ShareDataUIState + 103;
                component2 = i10 % 128;
                if (i10 % 2 == 0) {
                    ((SubBundles) it3.next()).getProductName();
                    throw null;
                }
                SubBundles subBundles = (SubBundles) it3.next();
                String productName = subBundles.getProductName();
                String str = productName == null ? "" : productName;
                String strValueOf = String.valueOf(subBundles.getProductAmount());
                String productId = subBundles.getProductId();
                arrayList4.add(new WithExpiryResp(str, strValueOf, null, false, false, productId == null ? "" : productId, "30 days", null, null, Keys.BUNDLE_TYPE_ALL_IN_ONE, null, null, null, null, R.drawable.ic_gsm_all_in_one, null, 48540, null));
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1347777865, true, new AnonymousClass4(CollectionsKt.toMutableList((Collection) arrayList4), stateObserveAsState2, SfcAllInOneBundlesActivity.this), composer, 54), composer, 1572864, 63);
        }

        private static final List<Plans> ShareDataUIState(State<? extends List<Plans>> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            List<Plans> value = state.getValue();
            int i4 = component2 + 121;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return value;
        }

        private static final Resource<List<Plans>> component3(State<Resource<List<Plans>>> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> value = state.getValue();
            int i4 = ShareDataUIState + 83;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        copydefault() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r27, int r28, char r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.h(int, int, char, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        char c3 = 2;
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4036, View.resolveSize(0, 0) + 31, (char) (19181 - ExpandableListView.getPackedPositionType(0L)), 1912513118, false, $$n(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 11, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i3 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[c3] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i3);
                        objArr4[0] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, (char) TextUtils.getCapsMode("", 0, 0), 931716605, false, $$n(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - ExpandableListView.getPackedPositionChild(0L), View.getDefaultSize(0, 0) + 11, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component4) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i4 = $10 + 19;
                            $11 = i4 % 128;
                            int i5 = i4 % 2;
                            c3 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 109;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void f(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 657, 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') + 65070), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i8 = $11 + 51;
            $10 = i8 % 128;
            char[] cArr5 = i8 % 2 != 0 ? new char[i4] : new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 4502;
                        int defaultSize = 36 - View.getDefaultSize(0, 0);
                        char c4 = (char) (27897 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b3 = (byte) 0;
                        String str$$n = $$n(b3, (byte) (b3 | Ascii.FF), b3);
                        Class[] clsArr = new Class[2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[b2] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, defaultSize, c4, -1464227204, false, str$$n, clsArr);
                    }
                    cArr5[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    char c5 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c5);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3579;
                        int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        byte b4 = (byte) 0;
                        String str$$n2 = $$n(b4, (byte) (b4 | 17), b4);
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Integer.TYPE;
                        clsArr2[b2] = Integer.TYPE;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i11, absoluteGravity, offsetAfter, 1180380354, false, str$$n2, clsArr2);
                    }
                    cArr5[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - TextUtils.indexOf("", "", 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 35, (char) Color.blue(0), 80302927, false, $$n(b5, (byte) (b5 | Ascii.DLE), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i12 = $11 + 69;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i14, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $11 + 83;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr = new char[i4];
                i = 1;
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                i = 1;
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - i];
                iTrustedWebActivityService_Parcel.copydefault += i;
                i = 1;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i16 = $11 + 45;
            $10 = i16 % 128;
            char c6 = 2;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[c6]);
                iTrustedWebActivityService_Parcel.copydefault++;
                int i18 = $10 + 79;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                c6 = 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01e0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObservers() {
        int i = 2 % 2;
        final String type = BundleTypes.ALL_IN_ONE_BUNDLES.getType();
        getBuyBundleViewModel().getOtherBundlesData().observe(this, new SfcAllInOneBundlesActivityKt.component3(new Function1() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 77;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity = this.f$0;
                if (i4 != 0) {
                    return SfcAllInOneBundlesActivity.m11193$r8$lambda$eQyGML6k5UOi6vFI9L5WiY_hc(sfcAllInOneBundlesActivity, type, (Resource) obj);
                }
                Unit unitM11193$r8$lambda$eQyGML6k5UOi6vFI9L5WiY_hc = SfcAllInOneBundlesActivity.m11193$r8$lambda$eQyGML6k5UOi6vFI9L5WiY_hc(sfcAllInOneBundlesActivity, type, (Resource) obj);
                int i5 = 22 / 0;
                return unitM11193$r8$lambda$eQyGML6k5UOi6vFI9L5WiY_hc;
            }
        }));
        int i2 = getRequestBeneficiariesState + 71;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit initObservers$lambda$0(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity, String str, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sfcAllInOneBundlesActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            resource.success();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sfcAllInOneBundlesActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (resource.success()) {
            sfcAllInOneBundlesActivity.getBuyBundleViewModel().filterBundleByPackageName(str);
            int i3 = equals + 9;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onBundleSelected(WithExpiryResp bundle) {
        int i = 2 % 2;
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("withExpiryResp", bundle);
        String str = this.returnDestination;
        if (str == null) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 35;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 11;
            equals = i4 % 128;
            int i5 = i4 % 2;
            str = RoutePathConstant.SFC_ALL_IN_ONE_BUNDLE;
        }
        bundle2.putString(Keys.KEY_RETURN_DESTINATION, str);
        RouteUtils.routeWithExecute(RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.onStart():void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 19;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) m1.copydefault[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i4 != 1186738012 + (((-36112954) | elapsedCpuTime) * (-381)) + (((~((~elapsedCpuTime) | 1145574660)) | (-1176969022)) * 381) + 874133205) {
            throw new RuntimeException(String.valueOf(-2110802827));
        }
        int i5 = ((Field) EdgeToEdge.ShareDataUIState[0]).getInt(null);
        int ringerMode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getRingerMode();
        if (i5 != ((935946287 + (((~((-550916617) | ringerMode)) | 4461056) * 1504)) + ((~(ringerMode | (-546455561))) * (-1504))) - 1601640176) {
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i6 = equals + 111;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            e(new char[]{57354, 46946, 12967, 44734, 20619, 43297, 57354, 6941, 5489, 14625, 22682, 63172, 4518, 26524, 64654, 42230, 9653, 56507, 22899, 58218, 20954, 7802, 18552, 63986, 21340, 48314}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 97, new char[]{6178, 57335, 23451, 33646}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 40685), new char[]{4852, 29349, 20665, 46239}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new char[]{41397, 43454, 46394, 28317, 17137, 52473, 63553, 54323, 33396, 16633, 61663, 47394, 55455, 52477, 28161, 12610, 13794, 58924}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) - 112, new char[]{6178, 57335, 23451, 33646}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 59237), new char[]{58566, 55186, 33534, 49639}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i8 = equals + 23;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i9 = getRequestBeneficiariesState + 29;
            equals = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 6619, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 6562, KeyEvent.normalizeMetaState(0) + 56, (char) View.combineMeasuredStates(0, 0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i11 = equals + 115;
                getRequestBeneficiariesState = i11 % 128;
                int i12 = i11 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r49) {
        /*
            Method dump skipped, instruction units count: 14395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcAllInOneBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m11193$r8$lambda$eQyGML6k5UOi6vFI9L5WiY_hc(SfcAllInOneBundlesActivity sfcAllInOneBundlesActivity, String str, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObservers$lambda$0 = initObservers$lambda$0(sfcAllInOneBundlesActivity, str, resource);
        int i4 = getRequestBeneficiariesState + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return unitInitObservers$lambda$0;
    }

    static {
        copy = 1;
        component2();
        ShareDataUIState();
        int i = getAsAtTimestamp + 73;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals + 23;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            component3 = new char[]{3093, 37188, 13985, 54351, 31082, 7890, 48185, 16778, 59131, 33882, 10746, 52973, 27715, 61864, 38665, 13425, 55751, 32567, 7308, 41456, 18251, 58554, 35309, 12099, 52410, 21069, 63335, 38102, 14900, 57228, 31973, 600, 42931, 17657, 59906, 36786, 11524, 45668, 22477, 62772, 39632, 16355, 56667, 25242, 2046, 42335, 19105, 59420, 36136, 4843, 45107, 21890, 64230, 38983, 15753, 49908, 24696, 1450, 43777, 18542, 60919, 29488, 4244, 46576, 23386, 63695, 40425, 9049, 49319, 26116, 2925, 43209, 20027, 54192, 28924, 5672, 48004, 22760, 65093, 33685, 8458, 50810, 27602, 2421, 44758, 13310, 53542, 30337, 7143, 47437, 24225, 64541, 33086, 9946, 50216, 27024, 3829, 44094, 12696, 55012, 29814, 6590, 48904, 23672, 57818, 34679, 9413, 51597, 28539, 9259, 47482, 7839, 64625, 20820, 14060, 37895, 27060, 52933, 44132, 452, 59091, 17533, 55702, 48951, 7247, 61945, 22281, 13490, 35278, 28533, 52356, 41427, 1917, 58500, 31347, 57177, 48360, 4618, 63410, 21723, 10854, 36749, 27847, 49724, 42893, 1337, 39508, 32745, 56599, 45733, 6094, 62821, 19129, 12242, 36216, 25241, 49269, 42362, 15063};
            ShareDataUIState = 1873036833568887083L;
        } else {
            component3 = new char[]{3093, 37188, 13985, 54351, 31082, 7890, 48185, 16778, 59131, 33882, 10746, 52973, 27715, 61864, 38665, 13425, 55751, 32567, 7308, 41456, 18251, 58554, 35309, 12099, 52410, 21069, 63335, 38102, 14900, 57228, 31973, 600, 42931, 17657, 59906, 36786, 11524, 45668, 22477, 62772, 39632, 16355, 56667, 25242, 2046, 42335, 19105, 59420, 36136, 4843, 45107, 21890, 64230, 38983, 15753, 49908, 24696, 1450, 43777, 18542, 60919, 29488, 4244, 46576, 23386, 63695, 40425, 9049, 49319, 26116, 2925, 43209, 20027, 54192, 28924, 5672, 48004, 22760, 65093, 33685, 8458, 50810, 27602, 2421, 44758, 13310, 53542, 30337, 7143, 47437, 24225, 64541, 33086, 9946, 50216, 27024, 3829, 44094, 12696, 55012, 29814, 6590, 48904, 23672, 57818, 34679, 9413, 51597, 28539, 9259, 47482, 7839, 64625, 20820, 14060, 37895, 27060, 52933, 44132, 452, 59091, 17533, 55702, 48951, 7247, 61945, 22281, 13490, 35278, 28533, 52356, 41427, 1917, 58500, 31347, 57177, 48360, 4618, 63410, 21723, 10854, 36749, 27847, 49724, 42893, 1337, 39508, 32745, 56599, 45733, 6094, 62821, 19129, 12242, 36216, 25241, 49269, 42362, 15063};
            ShareDataUIState = 1873036833568887083L;
            throw null;
        }
    }

    static void component2() {
        component2 = new char[]{33296, 33309, 33291, 33291, 33305, 33307, 33295, 33292, 33390, 33360, 33291, 33295, 33360, 33306, 33301, 33295, 33292, 33306, 33517, 33465, 33408, 33464, 33452, 33478, 33428, 33428, 33517, 33519, 33517, 33428, 33468, 33429, 33427, 33428, 33517, 33513, 33512, 33427, 33468, 33428, 33518, 33515, 33426, 33430, 33428, 33428, 33518, 33514, 33426, 33468, 33428, 33515, 33512, 33512, 33427, 33430, 33515, 33426, 33469, 33468, 33467, 33429, 33429, 33468, 33426, 33511, 33514, 33428, 33426, 33514, 33516, 33429, 33428, 33430, 33470, 33427, 33512, 33424, 33424, 33512, 33515, 33513, 33511, 33514, 33513, 33512, 33512, 33780, 33778, 33729, 33779, 33732, 33776, 33790, 33335, 33777, 33778, 33732, 33730, 33777, 33732, 33728, 33779, 33789, 33777, 33335, 33731, 33730, 33326, 33329, 33331, 33331, 33327, 33332, 33328, 33329, 33791, 33330, 33326, 33325, 33328, 33327, 33334, 33334, 33323, 33778, 33781, 33777, 33777, 33789, 33778, 33777, 33783, 33728, 33775, 33728, 33334, 33331, 33775, 33334, 33777, 33778, 33728, 33790, 33783, 33788, 33334, 33788, 33781, 33732, 33334, 33784, 33782, 33730, 33335, 33728, 33779, 33732, 33776, 33531, 33419, 33461, 33458, 33418, 33414, 33462, 33467, 33464, 33465, 33467, 33462, 33454, 33457, 33457, 33449, 33517, 33463, 33465, 33463, 33454, 33459, 33467, 33412, 33412, 33468, 33465, 33455, 33457, 33460, 33462, 33416, 33395, 33393, 33393, 33393, 33389, 33389, 33390, 33390, 33392, 33393, 33476, 33511, 33423, 33463, 33463, 33422, 33509, 33508, 33511, 33425, 33463, 33422, 33424, 33425, 33425, 33464, 33421, 33507, 33508, 33422, 33464, 33423, 33510, 33512, 33423, 33461, 33424, 33425, 33465, 33423, 33508, 33421, 33464, 33423, 33422, 33424, 33511, 33511, 33511, 33422, 33424, 33513, 33514, 33511, 33509, 33510, 33507, 33507, 33510, 33509, 33510, 33513, 33424, 33424, 33515, 33426, 33426, 33510, 33422, 33425, 33513, 33512, 33510, 33509, 33522, 33410, 33410, 33409, 33471, 33410, 33409, 33470, 33470, 33408, 33410, 33478, 33514, 33512, 33515, 33516, 33513, 33510, 33511, 33513, 33513, 33432, 33361, 33359, 33358, 33358, 33357, 33358, 33360, 33359, 33357, 33361, 33475, 33512, 33513, 33515, 33514, 33512, 33514, 33516, 33514, 33513};
        copydefault = 5253256424315608275L;
        component1 = 1386857713;
        component4 = (char) 50417;
    }
}
