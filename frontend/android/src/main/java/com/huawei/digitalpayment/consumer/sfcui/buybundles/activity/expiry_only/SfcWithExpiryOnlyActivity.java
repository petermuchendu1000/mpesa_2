package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivityKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012²\u0006\u0018\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/expiry_only/SfcWithExpiryOnlyActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "ConsumerSfcUI_release", "otherBundlesResource", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcWithExpiryOnlyActivity extends Hilt_SfcWithExpiryOnlyActivity {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static int component3;
    private static int copy;
    private static int copydefault;
    private static byte[] equals;
    private static short[] getRequestBeneficiariesState;

    private final Lazy viewModel;
    private static final byte[] $$l = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$m = Primes.SMALL_FACTOR_LIMIT;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {68, -127, 122, -15, -20, -6, TarHeader.LF_CONTIG, -65, -16, -8, 0, -13, -1, 47, -59, -21, 2, -22, -5, -2, -3, 46, -71, 4, -27, 7, -21, 1, 0, -19, TarHeader.LF_FIFO, -67, -13, -14, 7, -21, -4, 5, -19, TarHeader.LF_FIFO, -42, -25, -25, 7, -10, -15, 3, -9, -18, -1, 10, -37, 7, -25, -9, 6, 20, -45, -14, 43, -57, -8, 9, -32, 77, -21, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, TarHeader.LF_CONTIG, PSSSigner.TRAILER_IMPLICIT, -13, -14, -5, -4, 1, -28, Ascii.DLE, -23, -8, -11, Base64.padSymbol, -60, -7, -25, 7, -20, 3, -9, -22, 8, -6, -21, -8, 1, -21, 60, -45, -30, -25, 13, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -14, 57, -76, 5, -4, -10, -25, 3, -21, 9, -27, 66, -67, -13, -14, 7, -21, -4, 5, -19, TarHeader.LF_FIFO, -73, -9, 3, -21, 9, -27, -3, -11, -9, Base64.padSymbol, -64, -14, -11, -16, Ascii.SO, -9, -18, -1, 47, -32, -46, -11, -16, Ascii.SO, -9, -18, -1, 9, -21, -18, -2, 6, -25, -9, -11, -1, 57, -71, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58};
    private static final int $$k = 68;
    private static final byte[] $$d = {90, 10, -103, 87, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 35;
    private static int hashCode = 1;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r5, int r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.$$l
            int r5 = r5 * 2
            int r5 = 3 - r5
            int r7 = 116 - r7
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.$$n(byte, int, short):java.lang.String");
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
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.$$d
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r9 = r9 + 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-8)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.g(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 70 - r7
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r6 = 201 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.$$j
            byte[] r0 = new byte[r0]
            int r7 = 69 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.h(int, byte, byte, java.lang.Object[]):void");
    }

    public static final BuyBundleViewModel access$getViewModel(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity) {
        int i = 2 % 2;
        int i2 = component4 + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel viewModel = sfcWithExpiryOnlyActivity.getViewModel();
        int i4 = getAsAtTimestamp + 37;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return viewModel;
    }

    public static final void access$onBundleSelected(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcWithExpiryOnlyActivity.onBundleSelected(withExpiryResp);
        int i4 = component4 + 85;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public SfcWithExpiryOnlyActivity() {
        final SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 23;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcWithExpiryOnlyActivity.getViewModelStore();
                int i4 = component2 + 105;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 97;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 109;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 30 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 85;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcWithExpiryOnlyActivity.getDefaultViewModelProviderFactory();
                int i4 = component1 + 121;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = sfcWithExpiryOnlyActivity.getDefaultViewModelCreationExtras();
                    int i2 = copydefault + 27;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                }
                int i4 = copydefault + 39;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 48 / 0;
                }
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 91;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = copydefault + 55;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 7 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final BuyBundleViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = (BuyBundleViewModel) this.viewModel.getValue();
        int i4 = component4 + 15;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return buyBundleViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component3 = 1;
        private static int copydefault;

        public static final Resource ShareDataUIState(State state) {
            int i = 2 % 2;
            int i2 = component3 + 33;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return component1(state);
            }
            component1(state);
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            copydefault = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 != 0) {
                component3(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            component3(composer2, num2.intValue());
            Unit unit2 = Unit.INSTANCE;
            int i3 = component3 + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int component3 = 0;
            private static int getRequestBeneficiariesState = 1;
            final SfcWithExpiryOnlyActivity ShareDataUIState;
            final List<String> component1;
            final List<WithExpiryResp> component2;
            final State<Resource<List<Plans>>> copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 61;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 33;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component3(Composer composer, int i) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = component3 + 27;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    List<WithExpiryResp> list = this.component2;
                    List<String> list2 = this.component1;
                    Resource resourceShareDataUIState = copydefault.ShareDataUIState(this.copydefault);
                    if (resourceShareDataUIState == null || !resourceShareDataUIState.loading()) {
                        z = false;
                    } else {
                        int i5 = component3 + 31;
                        getRequestBeneficiariesState = i5 % 128;
                        int i6 = i5 % 2;
                        z = true;
                    }
                    final SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity = this.ShareDataUIState;
                    Function1 function1 = new Function1() {
                        private static int component1 = 1;
                        private static int component2;

                        @Override
                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = component1 + 73;
                            component2 = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitComponent2 = SfcWithExpiryOnlyActivity.copydefault.AnonymousClass3.component2(sfcWithExpiryOnlyActivity, (WithExpiryResp) obj);
                            int i10 = component1 + 21;
                            component2 = i10 % 128;
                            int i11 = i10 % 2;
                            return unitComponent2;
                        }
                    };
                    final SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity2 = this.ShareDataUIState;
                    Function0 function0 = new Function0() {
                        private static int component1 = 1;
                        private static int component2;

                        @Override
                        public final Object invoke() {
                            int i7 = 2 % 2;
                            int i8 = component2 + 81;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity3 = sfcWithExpiryOnlyActivity2;
                            if (i9 != 0) {
                                return SfcWithExpiryOnlyActivity.copydefault.AnonymousClass3.component3(sfcWithExpiryOnlyActivity3);
                            }
                            SfcWithExpiryOnlyActivity.copydefault.AnonymousClass3.component3(sfcWithExpiryOnlyActivity3);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    final SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity3 = this.ShareDataUIState;
                    SfcWithExpiryOnlyActivityKt.WithExpiryScreen(list, list2, z, function1, function0, new Function0() {
                        private static int component2 = 1;
                        private static int copydefault;

                        @Override
                        public final Object invoke() {
                            Unit unitCopydefault;
                            int i7 = 2 % 2;
                            int i8 = component2 + 85;
                            copydefault = i8 % 128;
                            if (i8 % 2 != 0) {
                                unitCopydefault = SfcWithExpiryOnlyActivity.copydefault.AnonymousClass3.copydefault(sfcWithExpiryOnlyActivity3);
                                int i9 = 72 / 0;
                            } else {
                                unitCopydefault = SfcWithExpiryOnlyActivity.copydefault.AnonymousClass3.copydefault(sfcWithExpiryOnlyActivity3);
                            }
                            int i10 = component2 + 117;
                            copydefault = i10 % 128;
                            if (i10 % 2 == 0) {
                                return unitCopydefault;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m1239onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 8), WindowInsetsSides.INSTANCE.m1267getTopJoeWqyM()), composer, 0)), composer, 72, 0);
                } else {
                    composer.skipToGroupEnd();
                }
                int i7 = getRequestBeneficiariesState + 109;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 80 / 0;
                }
            }

            private static final Unit component1(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 101;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcWithExpiryOnlyActivity, "");
                    Intrinsics.checkNotNullParameter(withExpiryResp, "");
                    SfcWithExpiryOnlyActivity.access$onBundleSelected(sfcWithExpiryOnlyActivity, withExpiryResp);
                    Unit unit = Unit.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcWithExpiryOnlyActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                SfcWithExpiryOnlyActivity.access$onBundleSelected(sfcWithExpiryOnlyActivity, withExpiryResp);
                Unit unit2 = Unit.INSTANCE;
                int i3 = component3 + 51;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }

            private static final Unit ShareDataUIState(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 71;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcWithExpiryOnlyActivity, "");
                    SfcWithExpiryOnlyActivity.access$getViewModel(sfcWithExpiryOnlyActivity).getExpiryBundlesCatalog();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcWithExpiryOnlyActivity, "");
                SfcWithExpiryOnlyActivity.access$getViewModel(sfcWithExpiryOnlyActivity).getExpiryBundlesCatalog();
                int i3 = 55 / 0;
                return Unit.INSTANCE;
            }

            private static final Unit component1(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 49;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcWithExpiryOnlyActivity, "");
                    sfcWithExpiryOnlyActivity.finish();
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcWithExpiryOnlyActivity, "");
                sfcWithExpiryOnlyActivity.finish();
                Unit unit2 = Unit.INSTANCE;
                int i3 = component3 + 109;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 51 / 0;
                }
                return unit2;
            }

            public static Unit copydefault(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 101;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(sfcWithExpiryOnlyActivity);
                int i4 = component3 + 83;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent1;
            }

            public static Unit component2(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 5;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return component1(sfcWithExpiryOnlyActivity, withExpiryResp);
                }
                component1(sfcWithExpiryOnlyActivity, withExpiryResp);
                throw null;
            }

            public static Unit component3(SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 19;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(sfcWithExpiryOnlyActivity);
                int i4 = getRequestBeneficiariesState + 125;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unitShareDataUIState;
            }

            AnonymousClass3(List<WithExpiryResp> list, List<String> list2, State<Resource<List<Plans>>> state, SfcWithExpiryOnlyActivity sfcWithExpiryOnlyActivity) {
                this.component2 = list;
                this.component1 = list2;
                this.copydefault = state;
                this.ShareDataUIState = sfcWithExpiryOnlyActivity;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0221 A[LOOP:6: B:93:0x021b->B:95:0x0221, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.runtime.Composer r40, int r41) {
            /*
                Method dump skipped, instruction units count: 958
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.copydefault.component3(androidx.compose.runtime.Composer, int):void");
        }

        private static final Resource<List<Plans>> component1(State<Resource<List<Plans>>> state) {
            int i = 2 % 2;
            int i2 = component3 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> value = state.getValue();
            if (i3 == 0) {
                return value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        copydefault() {
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 29;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - TextUtils.indexOf("", "", 0, 0), 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1389, ImageFormat.getBitsPerPixel(0) + 19, (char) (View.getDefaultSize(0, 0) + 51269), -1883291598, false, $$n(b2, b3, (byte) (b3 | 13)), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 99;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 79 / 0;
            objArr[0] = str;
        }
    }

    private static void i(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component2;
        char c2 = '0';
        if (cArr2 != null) {
            int i7 = $11 + 95;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 37;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 656, TextUtils.lastIndexOf("", c2, 0, 0) + 15, (char) (65119 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getPressedStateDuration() >> 16), 14 - View.resolveSize(0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                c2 = '0';
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = $10 + 125;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - Color.alpha(0), 37 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (27897 - View.getDefaultSize(0, 0)), -1464227204, false, $$n(b2, b3, (byte) (b3 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 3581, 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getTapTimeout() >> 16), 1180380354, false, $$n(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1907 - AndroidCharacter.getMirror('0'), 34 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), 80302927, false, $$n(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i15 = $10 + 19;
            $11 = i15 % 128;
            int i16 = 2;
            int i17 = i15 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i18 = $10 + 17;
                $11 = i18 % 128;
                if (i18 % i16 == 0) {
                    int i19 = iTrustedWebActivityService_Parcel.copydefault;
                    int i20 = i4 % iTrustedWebActivityService_Parcel.copydefault;
                    cArr6[i19] = cArr3[0];
                    i = iTrustedWebActivityService_Parcel.copydefault % 1;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
                i16 = 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void e(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 999, 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 61685), 1874745193, false, $$n(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 59;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 4;
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = equals;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetAfter("", 0) + 48, (char) (54461 - MotionEvent.axisFromString("")), -1178636483, false, $$n(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = equals;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(998 - TextUtils.lastIndexOf("", '0'), 31 - Color.alpha(0), (char) (61685 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1874745193, false, $$n(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i9 = ((i + iIntValue) - 2) + ((int) (((long) component3) ^ j));
                if (z) {
                    int i10 = $10 + 125;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i9 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, (char) View.MeasureSpec.getMode(0), -1454191902, false, $$n(b9, b9, (byte) $$l.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = equals;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 105;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x11cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x12ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x12ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x13db  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1663  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x251f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02fd  */
    /* JADX WARN: Type inference failed for: r3v140, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObservers() {
        int i = 2 % 2;
        getViewModel().getOtherBundlesData().observe(this, new SfcWithExpiryOnlyActivityKt.component2(new Function1() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM11225$r8$lambda$RUntzHvzZStKA1FhW5NlPLqd80 = SfcWithExpiryOnlyActivity.m11225$r8$lambda$RUntzHvzZStKA1FhW5NlPLqd80((Resource) obj);
                int i5 = component1 + 41;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return unitM11225$r8$lambda$RUntzHvzZStKA1FhW5NlPLqd80;
            }
        }));
        int i2 = getAsAtTimestamp + 9;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit initObservers$lambda$0(Resource resource) {
        int i = 2 % 2;
        if (resource.error()) {
            int i2 = getAsAtTimestamp + 83;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                ToastUtils.showLong(resource.getException().getMessage(), new Object[1]);
            } else {
                ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = getAsAtTimestamp + 67;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[PHI: r1
  0x005d: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1 r3
  0x002a: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onBundleSelected(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp r21) {
        /*
            r20 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.component4
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = -1707840351(0xffffffff9a346ca1, float:-3.7310877E-23)
            if (r1 == 0) goto L20
            java.lang.String r1 = r21.getValidity()
            int r3 = r1.hashCode()
            r4 = 34
            int r4 = r4 / 0
            if (r3 == r2) goto L5d
            goto L2a
        L20:
            java.lang.String r1 = r21.getValidity()
            int r3 = r1.hashCode()
            if (r3 == r2) goto L5d
        L2a:
            r2 = -1393678355(0xffffffffacee27ed, float:-6.7687995E-12)
            if (r3 == r2) goto L51
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.getAsAtTimestamp
            int r2 = r2 + 33
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.component4 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L4c
            r0 = 65793529(0x3ebedf9, float:1.38666945E-36)
            if (r3 == r0) goto L40
            goto L65
        L40:
            java.lang.String r0 = "Daily"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            goto L65
        L49:
            java.lang.String r0 = "1 Day"
            goto L6c
        L4c:
            r0 = 0
            r0.hashCode()
            throw r0
        L51:
            java.lang.String r0 = "Monthly"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            goto L65
        L5a:
            java.lang.String r0 = "30 Days"
            goto L6c
        L5d:
            java.lang.String r0 = "Weekly"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6a
        L65:
            java.lang.String r0 = r21.getValidity()
            goto L6c
        L6a:
            java.lang.String r0 = "7 Days"
        L6c:
            r8 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 65471(0xffbf, float:9.1744E-41)
            r19 = 0
            r1 = r21
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            java.lang.String r2 = "withExpiryResp"
            java.io.Serializable r0 = (java.io.Serializable) r0
            r1.putSerializable(r2, r0)
            java.lang.String r0 = "bundle type"
            java.lang.String r2 = "withExpiry"
            r1.putString(r0, r2)
            r0 = r20
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r2 = "/sfcModule/bundlePurchase"
            com.huawei.arouter.RouteUtils.routeWithExecute(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.onBundleSelected(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0145  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getAsAtTimestamp + 89;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 354317970, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 12055572, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 153), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 22, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(1 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{5198, 5165, 59227, 33313, 20754, 36943, 27793, 51631, 14147, 50372, 41123, 29861, 44854, 41558, 50487, 5633, 36001, 40899, 60331, 51589, 25137, 32080}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = component4 + 29;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = component4 + 97;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6561, (ViewConfiguration.getEdgeSlop() >> 16) + 56, (char) ExpandableListView.getPackedPositionGroup(0L), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1010:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0d31 A[Catch: all -> 0x07b9, TryCatch #10 {all -> 0x07b9, blocks: (B:151:0x0d2b, B:153:0x0d31, B:154:0x0d5b, B:318:0x157e, B:320:0x1584, B:322:0x15b4, B:523:0x20c1, B:525:0x20c7, B:527:0x20f2, B:742:0x321b, B:744:0x3221, B:745:0x324a, B:776:0x3554, B:778:0x355a, B:779:0x3582, B:813:0x389d, B:815:0x38a3, B:816:0x38c5, B:793:0x36e8, B:795:0x370b, B:796:0x375d, B:836:0x399d, B:838:0x39a3, B:839:0x39c3, B:841:0x39fd, B:842:0x3a3f, B:594:0x292c, B:596:0x2941, B:597:0x296d, B:599:0x29a1, B:600:0x2a1d, B:570:0x25af, B:572:0x25b5, B:573:0x25e1, B:575:0x261b, B:577:0x266b, B:540:0x22b9, B:542:0x22ce, B:543:0x2300, B:387:0x1a18, B:389:0x1a1e, B:390:0x1a49, B:196:0x0ff8, B:198:0x0ffe, B:199:0x1029, B:17:0x0338, B:19:0x033e, B:20:0x0369, B:22:0x0726, B:24:0x0758, B:25:0x07b3), top: B:874:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0dfa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0e11 A[Catch: all -> 0x0ed8, TryCatch #23 {all -> 0x0ed8, blocks: (B:171:0x0dfc, B:173:0x0e11, B:174:0x0e3f), top: B:898:0x0dfc, outer: #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e52 A[Catch: all -> 0x0ece, TryCatch #19 {all -> 0x0ece, blocks: (B:175:0x0e45, B:177:0x0e52, B:178:0x0ec6), top: B:890:0x0e45, outer: #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x10bb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x110b A[Catch: all -> 0x1513, PHI: r2 r10
  0x110b: PHI (r2v326 java.lang.Object) = (r2v325 java.lang.Object), (r2v387 java.lang.Object) binds: [B:204:0x10b9, B:206:0x10bc] A[DONT_GENERATE, DONT_INLINE]
  0x110b: PHI (r10v224 ??) = (r10v337 ??), (r10v250 ??) binds: [B:204:0x10b9, B:206:0x10bc] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1513, blocks: (B:203:0x10b5, B:210:0x110b, B:219:0x1171, B:237:0x1290, B:241:0x12d7), top: B:974:0x10b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1118  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1171 A[Catch: all -> 0x1513, TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1513, blocks: (B:203:0x10b5, B:210:0x110b, B:219:0x1171, B:237:0x1290, B:241:0x12d7), top: B:974:0x10b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x13c4 A[Catch: all -> 0x14eb, TryCatch #33 {all -> 0x14eb, blocks: (B:257:0x13ba, B:258:0x13be, B:260:0x13c4, B:263:0x13de, B:253:0x1357, B:256:0x13b2), top: B:918:0x1357 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x07bd A[PHI: r15
  0x07bd: PHI (r15v168 ??) = (r15v22 ??), (r15v171 ?? I:??[int, float, short, byte, char]) binds: [B:15:0x0333, B:5:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x1584 A[Catch: all -> 0x07b9, TryCatch #10 {all -> 0x07b9, blocks: (B:151:0x0d2b, B:153:0x0d31, B:154:0x0d5b, B:318:0x157e, B:320:0x1584, B:322:0x15b4, B:523:0x20c1, B:525:0x20c7, B:527:0x20f2, B:742:0x321b, B:744:0x3221, B:745:0x324a, B:776:0x3554, B:778:0x355a, B:779:0x3582, B:813:0x389d, B:815:0x38a3, B:816:0x38c5, B:793:0x36e8, B:795:0x370b, B:796:0x375d, B:836:0x399d, B:838:0x39a3, B:839:0x39c3, B:841:0x39fd, B:842:0x3a3f, B:594:0x292c, B:596:0x2941, B:597:0x296d, B:599:0x29a1, B:600:0x2a1d, B:570:0x25af, B:572:0x25b5, B:573:0x25e1, B:575:0x261b, B:577:0x266b, B:540:0x22b9, B:542:0x22ce, B:543:0x2300, B:387:0x1a18, B:389:0x1a1e, B:390:0x1a49, B:196:0x0ff8, B:198:0x0ffe, B:199:0x1029, B:17:0x0338, B:19:0x033e, B:20:0x0369, B:22:0x0726, B:24:0x0758, B:25:0x07b3), top: B:874:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x15b3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x1642 A[Catch: all -> 0x19b1, TryCatch #9 {all -> 0x19b1, blocks: (B:326:0x163c, B:328:0x1642, B:329:0x1693, B:331:0x16a0, B:333:0x16a9, B:334:0x16e9, B:353:0x18a1, B:361:0x190e, B:367:0x1995, B:369:0x199b, B:370:0x199c, B:372:0x199e, B:374:0x19a5, B:375:0x19a6, B:336:0x16f5, B:343:0x1780, B:345:0x1786, B:346:0x17cf, B:348:0x17f9, B:349:0x183e, B:351:0x1854, B:352:0x1899, B:377:0x19a8, B:379:0x19af, B:380:0x19b0, B:338:0x1715, B:340:0x1727, B:341:0x1774, B:363:0x1914, B:357:0x18d5, B:359:0x18db, B:360:0x1907), top: B:873:0x163c, outer: #7, inners: #4, #62, #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x16a0 A[Catch: all -> 0x19b1, TryCatch #9 {all -> 0x19b1, blocks: (B:326:0x163c, B:328:0x1642, B:329:0x1693, B:331:0x16a0, B:333:0x16a9, B:334:0x16e9, B:353:0x18a1, B:361:0x190e, B:367:0x1995, B:369:0x199b, B:370:0x199c, B:372:0x199e, B:374:0x19a5, B:375:0x19a6, B:336:0x16f5, B:343:0x1780, B:345:0x1786, B:346:0x17cf, B:348:0x17f9, B:349:0x183e, B:351:0x1854, B:352:0x1899, B:377:0x19a8, B:379:0x19af, B:380:0x19b0, B:338:0x1715, B:340:0x1727, B:341:0x1774, B:363:0x1914, B:357:0x18d5, B:359:0x18db, B:360:0x1907), top: B:873:0x163c, outer: #7, inners: #4, #62, #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x16f5 A[Catch: all -> 0x19b1, TRY_LEAVE, TryCatch #9 {all -> 0x19b1, blocks: (B:326:0x163c, B:328:0x1642, B:329:0x1693, B:331:0x16a0, B:333:0x16a9, B:334:0x16e9, B:353:0x18a1, B:361:0x190e, B:367:0x1995, B:369:0x199b, B:370:0x199c, B:372:0x199e, B:374:0x19a5, B:375:0x19a6, B:336:0x16f5, B:343:0x1780, B:345:0x1786, B:346:0x17cf, B:348:0x17f9, B:349:0x183e, B:351:0x1854, B:352:0x1899, B:377:0x19a8, B:379:0x19af, B:380:0x19b0, B:338:0x1715, B:340:0x1727, B:341:0x1774, B:363:0x1914, B:357:0x18d5, B:359:0x18db, B:360:0x1907), top: B:873:0x163c, outer: #7, inners: #4, #62, #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x18b3  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x1ad8  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x1b2b A[Catch: all -> 0x2055, PHI: r1 r4 r35
  0x1b2b: PHI (r1v546 java.lang.Object) = (r1v545 java.lang.Object), (r1v587 java.lang.Object) binds: [B:395:0x1ad6, B:397:0x1ad9] A[DONT_GENERATE, DONT_INLINE]
  0x1b2b: PHI (r4v213 ??) = (r4v325 ??), (r4v326 ??) binds: [B:395:0x1ad6, B:397:0x1ad9] A[DONT_GENERATE, DONT_INLINE]
  0x1b2b: PHI (r35v48 ??) = (r35v153 ??), (r35v154 ??) binds: [B:395:0x1ad6, B:397:0x1ad9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x2055, blocks: (B:394:0x1ad2, B:401:0x1b2b, B:405:0x1b97, B:425:0x1c24), top: B:894:0x1ad2 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x1b52  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x1baa  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1c08  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x1ed9 A[Catch: all -> 0x202a, TryCatch #5 {all -> 0x202a, blocks: (B:459:0x1ecd, B:460:0x1ed1, B:462:0x1ed9, B:465:0x1ef6, B:427:0x1c6a, B:444:0x1da5, B:448:0x1df0, B:454:0x1e66, B:458:0x1ec5), top: B:866:0x1c6a }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x20c7 A[Catch: all -> 0x07b9, TryCatch #10 {all -> 0x07b9, blocks: (B:151:0x0d2b, B:153:0x0d31, B:154:0x0d5b, B:318:0x157e, B:320:0x1584, B:322:0x15b4, B:523:0x20c1, B:525:0x20c7, B:527:0x20f2, B:742:0x321b, B:744:0x3221, B:745:0x324a, B:776:0x3554, B:778:0x355a, B:779:0x3582, B:813:0x389d, B:815:0x38a3, B:816:0x38c5, B:793:0x36e8, B:795:0x370b, B:796:0x375d, B:836:0x399d, B:838:0x39a3, B:839:0x39c3, B:841:0x39fd, B:842:0x3a3f, B:594:0x292c, B:596:0x2941, B:597:0x296d, B:599:0x29a1, B:600:0x2a1d, B:570:0x25af, B:572:0x25b5, B:573:0x25e1, B:575:0x261b, B:577:0x266b, B:540:0x22b9, B:542:0x22ce, B:543:0x2300, B:387:0x1a18, B:389:0x1a1e, B:390:0x1a49, B:196:0x0ff8, B:198:0x0ffe, B:199:0x1029, B:17:0x0338, B:19:0x033e, B:20:0x0369, B:22:0x0726, B:24:0x0758, B:25:0x07b3), top: B:874:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x20f1  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x217d  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x21d2  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x2299  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x2448  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x255a  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x2768  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x27d1  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x281d  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2833  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x290e  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x2b5f  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x2d0a  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2d21  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x2d79  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x2fe4 A[Catch: all -> 0x3141, TryCatch #13 {all -> 0x3141, blocks: (B:634:0x2d0c, B:684:0x2fda, B:685:0x2fde, B:687:0x2fe4, B:690:0x2ffe, B:654:0x2d93, B:672:0x2eb6, B:675:0x2f04, B:679:0x2f74, B:683:0x2fd4), top: B:878:0x2d0c }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0311 A[PHI: r15
  0x0311: PHI (r15v22 ??) = (r15v216 ??), (r15v170 ??) binds: [B:3:0x0300, B:5:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:744:0x3221 A[Catch: all -> 0x07b9, TryCatch #10 {all -> 0x07b9, blocks: (B:151:0x0d2b, B:153:0x0d31, B:154:0x0d5b, B:318:0x157e, B:320:0x1584, B:322:0x15b4, B:523:0x20c1, B:525:0x20c7, B:527:0x20f2, B:742:0x321b, B:744:0x3221, B:745:0x324a, B:776:0x3554, B:778:0x355a, B:779:0x3582, B:813:0x389d, B:815:0x38a3, B:816:0x38c5, B:793:0x36e8, B:795:0x370b, B:796:0x375d, B:836:0x399d, B:838:0x39a3, B:839:0x39c3, B:841:0x39fd, B:842:0x3a3f, B:594:0x292c, B:596:0x2941, B:597:0x296d, B:599:0x29a1, B:600:0x2a1d, B:570:0x25af, B:572:0x25b5, B:573:0x25e1, B:575:0x261b, B:577:0x266b, B:540:0x22b9, B:542:0x22ce, B:543:0x2300, B:387:0x1a18, B:389:0x1a1e, B:390:0x1a49, B:196:0x0ff8, B:198:0x0ffe, B:199:0x1029, B:17:0x0338, B:19:0x033e, B:20:0x0369, B:22:0x0726, B:24:0x0758, B:25:0x07b3), top: B:874:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:750:0x32d6  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x3325  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x337c  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x3535  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x3614  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x366a  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x36ca  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x387f  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x3965  */
    /* JADX WARN: Removed duplicated region for block: B:936:0x0de1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:952:0x2cbe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v131 */
    /* JADX WARN: Type inference failed for: r10v132 */
    /* JADX WARN: Type inference failed for: r10v133, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v150 */
    /* JADX WARN: Type inference failed for: r10v152 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v154 */
    /* JADX WARN: Type inference failed for: r10v155 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v158 */
    /* JADX WARN: Type inference failed for: r10v159 */
    /* JADX WARN: Type inference failed for: r10v169 */
    /* JADX WARN: Type inference failed for: r10v170 */
    /* JADX WARN: Type inference failed for: r10v174 */
    /* JADX WARN: Type inference failed for: r10v175 */
    /* JADX WARN: Type inference failed for: r10v214 */
    /* JADX WARN: Type inference failed for: r10v215 */
    /* JADX WARN: Type inference failed for: r10v216 */
    /* JADX WARN: Type inference failed for: r10v222 */
    /* JADX WARN: Type inference failed for: r10v223 */
    /* JADX WARN: Type inference failed for: r10v224 */
    /* JADX WARN: Type inference failed for: r10v225 */
    /* JADX WARN: Type inference failed for: r10v226 */
    /* JADX WARN: Type inference failed for: r10v227 */
    /* JADX WARN: Type inference failed for: r10v229 */
    /* JADX WARN: Type inference failed for: r10v231 */
    /* JADX WARN: Type inference failed for: r10v236, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v241 */
    /* JADX WARN: Type inference failed for: r10v242 */
    /* JADX WARN: Type inference failed for: r10v243 */
    /* JADX WARN: Type inference failed for: r10v244 */
    /* JADX WARN: Type inference failed for: r10v245 */
    /* JADX WARN: Type inference failed for: r10v247 */
    /* JADX WARN: Type inference failed for: r10v250 */
    /* JADX WARN: Type inference failed for: r10v251 */
    /* JADX WARN: Type inference failed for: r10v252 */
    /* JADX WARN: Type inference failed for: r10v297 */
    /* JADX WARN: Type inference failed for: r10v301, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v305 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v321 */
    /* JADX WARN: Type inference failed for: r10v322 */
    /* JADX WARN: Type inference failed for: r10v323 */
    /* JADX WARN: Type inference failed for: r10v324 */
    /* JADX WARN: Type inference failed for: r10v325 */
    /* JADX WARN: Type inference failed for: r10v326 */
    /* JADX WARN: Type inference failed for: r10v327 */
    /* JADX WARN: Type inference failed for: r10v328 */
    /* JADX WARN: Type inference failed for: r10v329 */
    /* JADX WARN: Type inference failed for: r10v330 */
    /* JADX WARN: Type inference failed for: r10v331 */
    /* JADX WARN: Type inference failed for: r10v332 */
    /* JADX WARN: Type inference failed for: r10v333 */
    /* JADX WARN: Type inference failed for: r10v334 */
    /* JADX WARN: Type inference failed for: r10v335 */
    /* JADX WARN: Type inference failed for: r10v336 */
    /* JADX WARN: Type inference failed for: r10v337 */
    /* JADX WARN: Type inference failed for: r10v338 */
    /* JADX WARN: Type inference failed for: r10v342 */
    /* JADX WARN: Type inference failed for: r10v343 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v420 */
    /* JADX WARN: Type inference failed for: r12v152, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v157 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v162 */
    /* JADX WARN: Type inference failed for: r12v170 */
    /* JADX WARN: Type inference failed for: r12v171 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v100 */
    /* JADX WARN: Type inference failed for: r13v101 */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v106 */
    /* JADX WARN: Type inference failed for: r13v107 */
    /* JADX WARN: Type inference failed for: r13v108 */
    /* JADX WARN: Type inference failed for: r13v109 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v118 */
    /* JADX WARN: Type inference failed for: r13v119 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v126 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r13v79 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v148 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v159 */
    /* JADX WARN: Type inference failed for: r15v160 */
    /* JADX WARN: Type inference failed for: r15v161 */
    /* JADX WARN: Type inference failed for: r15v162 */
    /* JADX WARN: Type inference failed for: r15v163 */
    /* JADX WARN: Type inference failed for: r15v165 */
    /* JADX WARN: Type inference failed for: r15v166 */
    /* JADX WARN: Type inference failed for: r15v168 */
    /* JADX WARN: Type inference failed for: r15v170 */
    /* JADX WARN: Type inference failed for: r15v171 */
    /* JADX WARN: Type inference failed for: r15v172 */
    /* JADX WARN: Type inference failed for: r15v173 */
    /* JADX WARN: Type inference failed for: r15v174 */
    /* JADX WARN: Type inference failed for: r15v175 */
    /* JADX WARN: Type inference failed for: r15v176 */
    /* JADX WARN: Type inference failed for: r15v177 */
    /* JADX WARN: Type inference failed for: r15v178 */
    /* JADX WARN: Type inference failed for: r15v179 */
    /* JADX WARN: Type inference failed for: r15v180 */
    /* JADX WARN: Type inference failed for: r15v181 */
    /* JADX WARN: Type inference failed for: r15v182 */
    /* JADX WARN: Type inference failed for: r15v183 */
    /* JADX WARN: Type inference failed for: r15v184 */
    /* JADX WARN: Type inference failed for: r15v185 */
    /* JADX WARN: Type inference failed for: r15v186 */
    /* JADX WARN: Type inference failed for: r15v187 */
    /* JADX WARN: Type inference failed for: r15v188 */
    /* JADX WARN: Type inference failed for: r15v189 */
    /* JADX WARN: Type inference failed for: r15v190 */
    /* JADX WARN: Type inference failed for: r15v191 */
    /* JADX WARN: Type inference failed for: r15v192 */
    /* JADX WARN: Type inference failed for: r15v193 */
    /* JADX WARN: Type inference failed for: r15v194 */
    /* JADX WARN: Type inference failed for: r15v195 */
    /* JADX WARN: Type inference failed for: r15v196 */
    /* JADX WARN: Type inference failed for: r15v197 */
    /* JADX WARN: Type inference failed for: r15v198 */
    /* JADX WARN: Type inference failed for: r15v199 */
    /* JADX WARN: Type inference failed for: r15v200 */
    /* JADX WARN: Type inference failed for: r15v201 */
    /* JADX WARN: Type inference failed for: r15v202 */
    /* JADX WARN: Type inference failed for: r15v203 */
    /* JADX WARN: Type inference failed for: r15v204 */
    /* JADX WARN: Type inference failed for: r15v205 */
    /* JADX WARN: Type inference failed for: r15v206 */
    /* JADX WARN: Type inference failed for: r15v207 */
    /* JADX WARN: Type inference failed for: r15v208 */
    /* JADX WARN: Type inference failed for: r15v209 */
    /* JADX WARN: Type inference failed for: r15v210 */
    /* JADX WARN: Type inference failed for: r15v211 */
    /* JADX WARN: Type inference failed for: r15v212 */
    /* JADX WARN: Type inference failed for: r15v213 */
    /* JADX WARN: Type inference failed for: r15v214 */
    /* JADX WARN: Type inference failed for: r15v215 */
    /* JADX WARN: Type inference failed for: r15v216 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v91, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v112, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v157 */
    /* JADX WARN: Type inference failed for: r2v461, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v462 */
    /* JADX WARN: Type inference failed for: r2v463 */
    /* JADX WARN: Type inference failed for: r35v100 */
    /* JADX WARN: Type inference failed for: r35v103 */
    /* JADX WARN: Type inference failed for: r35v105 */
    /* JADX WARN: Type inference failed for: r35v106 */
    /* JADX WARN: Type inference failed for: r35v107 */
    /* JADX WARN: Type inference failed for: r35v108 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v118 */
    /* JADX WARN: Type inference failed for: r35v119 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v120 */
    /* JADX WARN: Type inference failed for: r35v123 */
    /* JADX WARN: Type inference failed for: r35v124 */
    /* JADX WARN: Type inference failed for: r35v125 */
    /* JADX WARN: Type inference failed for: r35v127 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v133 */
    /* JADX WARN: Type inference failed for: r35v134 */
    /* JADX WARN: Type inference failed for: r35v137 */
    /* JADX WARN: Type inference failed for: r35v138 */
    /* JADX WARN: Type inference failed for: r35v139 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v140 */
    /* JADX WARN: Type inference failed for: r35v141 */
    /* JADX WARN: Type inference failed for: r35v142 */
    /* JADX WARN: Type inference failed for: r35v143 */
    /* JADX WARN: Type inference failed for: r35v144 */
    /* JADX WARN: Type inference failed for: r35v145 */
    /* JADX WARN: Type inference failed for: r35v146 */
    /* JADX WARN: Type inference failed for: r35v147 */
    /* JADX WARN: Type inference failed for: r35v148 */
    /* JADX WARN: Type inference failed for: r35v149 */
    /* JADX WARN: Type inference failed for: r35v150 */
    /* JADX WARN: Type inference failed for: r35v151 */
    /* JADX WARN: Type inference failed for: r35v152 */
    /* JADX WARN: Type inference failed for: r35v153 */
    /* JADX WARN: Type inference failed for: r35v154 */
    /* JADX WARN: Type inference failed for: r35v155 */
    /* JADX WARN: Type inference failed for: r35v156 */
    /* JADX WARN: Type inference failed for: r35v157 */
    /* JADX WARN: Type inference failed for: r35v158 */
    /* JADX WARN: Type inference failed for: r35v159 */
    /* JADX WARN: Type inference failed for: r35v160 */
    /* JADX WARN: Type inference failed for: r35v161 */
    /* JADX WARN: Type inference failed for: r35v162 */
    /* JADX WARN: Type inference failed for: r35v163 */
    /* JADX WARN: Type inference failed for: r35v164 */
    /* JADX WARN: Type inference failed for: r35v165 */
    /* JADX WARN: Type inference failed for: r35v166 */
    /* JADX WARN: Type inference failed for: r35v167 */
    /* JADX WARN: Type inference failed for: r35v168 */
    /* JADX WARN: Type inference failed for: r35v169 */
    /* JADX WARN: Type inference failed for: r35v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v170 */
    /* JADX WARN: Type inference failed for: r35v171 */
    /* JADX WARN: Type inference failed for: r35v172 */
    /* JADX WARN: Type inference failed for: r35v173 */
    /* JADX WARN: Type inference failed for: r35v174 */
    /* JADX WARN: Type inference failed for: r35v175 */
    /* JADX WARN: Type inference failed for: r35v176 */
    /* JADX WARN: Type inference failed for: r35v177 */
    /* JADX WARN: Type inference failed for: r35v178 */
    /* JADX WARN: Type inference failed for: r35v179 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v47 */
    /* JADX WARN: Type inference failed for: r35v48 */
    /* JADX WARN: Type inference failed for: r35v49 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v50 */
    /* JADX WARN: Type inference failed for: r35v51 */
    /* JADX WARN: Type inference failed for: r35v52 */
    /* JADX WARN: Type inference failed for: r35v53 */
    /* JADX WARN: Type inference failed for: r35v55 */
    /* JADX WARN: Type inference failed for: r35v56 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v61 */
    /* JADX WARN: Type inference failed for: r35v62 */
    /* JADX WARN: Type inference failed for: r35v63 */
    /* JADX WARN: Type inference failed for: r35v64 */
    /* JADX WARN: Type inference failed for: r35v67 */
    /* JADX WARN: Type inference failed for: r35v68 */
    /* JADX WARN: Type inference failed for: r35v69 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v72 */
    /* JADX WARN: Type inference failed for: r35v74 */
    /* JADX WARN: Type inference failed for: r35v75 */
    /* JADX WARN: Type inference failed for: r35v76 */
    /* JADX WARN: Type inference failed for: r35v77 */
    /* JADX WARN: Type inference failed for: r35v78 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v83 */
    /* JADX WARN: Type inference failed for: r35v85, types: [long] */
    /* JADX WARN: Type inference failed for: r35v86 */
    /* JADX WARN: Type inference failed for: r35v88 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r35v95 */
    /* JADX WARN: Type inference failed for: r35v96 */
    /* JADX WARN: Type inference failed for: r35v99 */
    /* JADX WARN: Type inference failed for: r36v15 */
    /* JADX WARN: Type inference failed for: r36v16 */
    /* JADX WARN: Type inference failed for: r36v40 */
    /* JADX WARN: Type inference failed for: r3v406 */
    /* JADX WARN: Type inference failed for: r3v407, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v408, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v440 */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v712 */
    /* JADX WARN: Type inference failed for: r3v713 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r43v10 */
    /* JADX WARN: Type inference failed for: r43v11 */
    /* JADX WARN: Type inference failed for: r43v12 */
    /* JADX WARN: Type inference failed for: r43v13 */
    /* JADX WARN: Type inference failed for: r43v14 */
    /* JADX WARN: Type inference failed for: r43v15 */
    /* JADX WARN: Type inference failed for: r43v16 */
    /* JADX WARN: Type inference failed for: r43v17 */
    /* JADX WARN: Type inference failed for: r43v39 */
    /* JADX WARN: Type inference failed for: r43v40 */
    /* JADX WARN: Type inference failed for: r43v41 */
    /* JADX WARN: Type inference failed for: r43v42 */
    /* JADX WARN: Type inference failed for: r43v43 */
    /* JADX WARN: Type inference failed for: r43v6 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /* JADX WARN: Type inference failed for: r43v8 */
    /* JADX WARN: Type inference failed for: r43v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v212 */
    /* JADX WARN: Type inference failed for: r4v213 */
    /* JADX WARN: Type inference failed for: r4v214 */
    /* JADX WARN: Type inference failed for: r4v215 */
    /* JADX WARN: Type inference failed for: r4v224, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v225 */
    /* JADX WARN: Type inference failed for: r4v226 */
    /* JADX WARN: Type inference failed for: r4v227 */
    /* JADX WARN: Type inference failed for: r4v228 */
    /* JADX WARN: Type inference failed for: r4v229 */
    /* JADX WARN: Type inference failed for: r4v234 */
    /* JADX WARN: Type inference failed for: r4v264 */
    /* JADX WARN: Type inference failed for: r4v301 */
    /* JADX WARN: Type inference failed for: r4v302 */
    /* JADX WARN: Type inference failed for: r4v303 */
    /* JADX WARN: Type inference failed for: r4v304 */
    /* JADX WARN: Type inference failed for: r4v318 */
    /* JADX WARN: Type inference failed for: r4v319 */
    /* JADX WARN: Type inference failed for: r4v320 */
    /* JADX WARN: Type inference failed for: r4v321 */
    /* JADX WARN: Type inference failed for: r4v322 */
    /* JADX WARN: Type inference failed for: r4v323 */
    /* JADX WARN: Type inference failed for: r4v324 */
    /* JADX WARN: Type inference failed for: r4v325 */
    /* JADX WARN: Type inference failed for: r4v326 */
    /* JADX WARN: Type inference failed for: r4v327 */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v329 */
    /* JADX WARN: Type inference failed for: r4v330 */
    /* JADX WARN: Type inference failed for: r4v331 */
    /* JADX WARN: Type inference failed for: r6v239, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v391 */
    /* JADX WARN: Type inference failed for: r6v392 */
    /* JADX WARN: Type inference failed for: r6v393 */
    /* JADX WARN: Type inference failed for: r6v413 */
    /* JADX WARN: Type inference failed for: r6v414 */
    /* JADX WARN: Type inference failed for: r6v415, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v416, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v438 */
    /* JADX WARN: Type inference failed for: r6v526 */
    /* JADX WARN: Type inference failed for: r6v527 */
    /* JADX WARN: Type inference failed for: r6v528 */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r9v196 */
    /* JADX WARN: Type inference failed for: r9v219 */
    /* JADX WARN: Type inference failed for: r9v220 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v227 */
    /* JADX WARN: Type inference failed for: r9v254 */
    /* JADX WARN: Type inference failed for: r9v255 */
    /* JADX WARN: Type inference failed for: r9v256 */
    /* JADX WARN: Type inference failed for: r9v257 */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v78, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.expiry_only.SfcWithExpiryOnlyActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m11225$r8$lambda$RUntzHvzZStKA1FhW5NlPLqd80(Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObservers$lambda$0 = initObservers$lambda$0(resource);
        int i4 = getAsAtTimestamp + 121;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitInitObservers$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        copy = 0;
        component2();
        component1();
        int i = hashCode + 47;
        copy = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        component2 = new char[]{33512, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457, 33462, 33430, 33431, 33469, 33468, 33464, 33464, 33417, 33416, 33465, 33457, 33459, 33465, 33457, 33454, 33452, 33465, 33408, 33465, 33464, 33455, 33460, 33459, 33449, 33409, 33515, 33531, 33427, 33408, 33411, 33462, 33466, 33460, 33461, 33412, 33471, 33457, 33459, 33457, 33461, 33464, 33456, 33458, 33464, 33461, 33457, 33414, 33415, 33464, 33465, 33409, 33413, 33465, 33461, 33464, 33467, 33418, 33511, 33425, 33464, 33465, 33457, 33461, 33465, 33461, 33464, 33467, 33466, 33431, 33430, 33465, 33467, 33464, 33464, 33464, 33426, 33420, 33458, 33463, 33453, 33452, 33454, 33456, 33424, 33428, 33456, 33459, 33467, 33459, 33423, 33423, 33460, 33462, 33454, 33451};
        int i5 = i3 + 79;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component2() {
        ShareDataUIState = 9156361292697852912L;
        component3 = 455802492;
        component1 = -238323926;
        copydefault = 243497829;
        equals = new byte[]{89, -96, 120, -88, Ascii.DLE, Ascii.ESC, 0, 105, 99, 56, Ascii.DC2, 104, 0, 106, 2, 110, 113, 96, -35, Ascii.US, 108, SignedBytes.MAX_POWER_OF_TWO, 41, Ascii.CAN, Ascii.EM, Ascii.SUB, 109, 5, 106, -121, 84, -86, 86, -84, 85, 87, 124, 87, -125, -82, -88, -88, 102, 85, 86, -87, -84, 86, -121, 103, -121, -83, 102, -122, -86, 123, -123, -87, -83, 102, -123, 120, -101, 83, -87, -86, 122, -102, 98, -85, -123, -88, 121, -100, 81, 113, 124, 102, 113, 100, 120, 113, 102, 121, 13, -87, 122, Ascii.SO, 122, -88, 9, -84, 103, 123, 8, -82, 99, 122, Ascii.SO, 123, -83, TarHeader.LF_FIFO, 120, 124, 120, 84, 115, 9, 87, 121, 125, 124, 8, 122, 84, 126, 124, TarHeader.LF_DIR, -95, 9, 85, 115, 102, Ascii.VT, 123, 86, 102, 126, 124, TarHeader.LF_BLK, -81, 8, 123, -88, 127, 120, 121, 8, -83, -19, -66, -67, -77, -71, SignedBytes.MAX_POWER_OF_TWO, -77, PSSSigner.TRAILER_IMPLICIT, -31, -65, PSSSigner.TRAILER_IMPLICIT, -89, 69, -21, -75, 77, -18, -90, -74, -90, -67, -80, PSSSigner.TRAILER_IMPLICIT, 65, -22, 67, -32, -66, 74, -22, -75, 73, -32, -65, 76, -18, -70, 65, -17, -67, -67, -66, -78, -70, -65, 65, -67, -80, -22, -78, -90, 78, -80, -65, -22, -66, -80, -69, -78, 74, -21, 65, -27, -126, -101, -100, -78, -108, -53, -128, 65, -38, 78, -124, -109, -125, -116, -104, -49, 91, -116, -110, -9, 71, -125, -111, -56, 92, -74, -108, -79, -103, -125, -110, -73, -108, -79, -109, -52, 79, -124, -105, -125, -78, -106, -127, -74, -97, -119, -37, 81, -126, -15, -122, -121, -123, -127, -104, -127, -124, 83, -10, -127, -126, -122, -126, -102, -123, -120, 90, -122, -127, -123, -111, -75, -113, 95, -25, -119, -127, -74, 95, -3, 91, -5, -123, 71, -4, -74, 95, -2, -77, -115, -118, -115, -125, -119, -78, -126, -118, -113, -77, 94, -5, -117, -120, 81, -6, 89, 2, 62, Ascii.SI, 101, -48, 2, Base64.padSymbol, 13, TarHeader.LF_BLK, 96, 97, -9, Ascii.SO, 77, -60, TarHeader.LF_CONTIG, TarHeader.LF_BLK, 9, Ascii.CAN, TarHeader.LF_NORMAL, Ascii.EM, 108, 120, 107, 124, 113, 96, 73, Ascii.DC2, 101, Ascii.SYN, 121, 117, 107, 125, -88, 92, -123, 114, 92, -69, -80, 102, -84, -94, 92, -81, -96, -88, 82, 41, 42, 36, 40, 46, 42, 34, 40, 36, 45, -40, -62, -60, -39, -38, -57, -38, -64, -35, -63, 13, 7, Ascii.VT, 1, 13, 5, Ascii.VT, 7, Ascii.FF, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    }
}
