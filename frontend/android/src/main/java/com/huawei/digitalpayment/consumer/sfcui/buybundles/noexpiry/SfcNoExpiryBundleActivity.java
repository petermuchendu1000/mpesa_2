package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.google.mlkit.common.MlKitException;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProductResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014²\u0006\u0018\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/SfcNoExpiryBundleActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Companion", "ConsumerSfcUI_release", "bundlesResource", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "uiState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryBundlesUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcNoExpiryBundleActivity extends Hilt_SfcNoExpiryBundleActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_RETURN_TO_NO_EXPIRY_BUNDLES = "extra_return_to_no_expiry_bundles";
    private static char[] ShareDataUIState;
    private static int[] component3;
    private static int component4;
    private static long copydefault;

    private final Lazy viewModel;
    private static final byte[] $$l = {102, -86, -98, TarHeader.LF_DIR};
    private static final int $$m = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {79, -25, -14, 102, -14, 0, -5, -1, -1, 7, -11, -8, 65, -14, 0, -5, -1, -1, 7, -11, -8, 63, -14, 0, Base64.padSymbol, -62, -7, -8, 1, 2, 7, -22, Ascii.SYN, -17, -2, -5, 67, -54, -1, -19, 13, -14, 9, -3, -16, Ascii.SO, 0, -15, -2, 7, -15, 66, -39, -24, -19, 19, -14, 0, Base64.padSymbol, -71, Ascii.DLE, -7, 3, -19, 7, 4, -14, 0, Base64.padSymbol, -53, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -56, -3, -16, 8, 0, -9, 62, -72, 13, -10, -5, 2, 9, -21, 13, -16, 67, -56, -16, 1, -3, 10, -13, -10, 7, 3, -7, -4, -7, -1, 68, -24, -48, 1, -3, 10, -13, -10, 7, 35, -39, -4, -7, -1, Ascii.US, -20, 0, -19, 9, -8, -1, 33, -43, 78, -49, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13, 63, -19, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, TarHeader.LF_DIR, -78, 0, 13, -7, 5, TarHeader.LF_CONTIG, PSSSigner.TRAILER_IMPLICIT, 10, -4, TarHeader.LF_NORMAL, 1, -8, 7, -56, -3, 0, -14, 9, -3, -15, 66, -22, -33, -19, 13, -14, 9, -3, Ascii.SYN, -26, -17, 17, -5, 1, -21, 17, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13};
    private static final int $$k = 101;
    private static final byte[] $$d = {68, -127, 122, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 52;
    private static int equals = 0;
    private static int component1 = 0;
    private static int component2 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        private final Function1 component3;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (obj instanceof Observer) {
                int i2 = copydefault + 19;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                if (i2 % 2 == 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    int i4 = i3 + 95;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component3;
            int i5 = i3 + 85;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = ShareDataUIState + 29;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 42 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r6, short r7, byte r8) {
        /*
            int r6 = 115 - r6
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.$$l
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L1e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L1e:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.$$n(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.$$d
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r8 = r8 + 4
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-8)
            r9 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.h(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.$$j
            int r7 = r7 + 4
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.j(byte, int, byte, java.lang.Object[]):void");
    }

    public static final NoExpiryViewModel access$getViewModel(SfcNoExpiryBundleActivity sfcNoExpiryBundleActivity) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NoExpiryViewModel viewModel = sfcNoExpiryBundleActivity.getViewModel();
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = component1 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return viewModel;
    }

    public static final void access$onBundleSelected(SfcNoExpiryBundleActivity sfcNoExpiryBundleActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        sfcNoExpiryBundleActivity.onBundleSelected(withExpiryResp);
        if (i3 != 0) {
            throw null;
        }
        int i4 = component2 + 85;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public SfcNoExpiryBundleActivity() {
        final SfcNoExpiryBundleActivity sfcNoExpiryBundleActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(NoExpiryViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 97;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcNoExpiryBundleActivity.getViewModelStore();
                int i4 = copydefault + 115;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 62 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 27;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 43;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 11;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 41;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = component1 + 119;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    defaultViewModelProviderFactory = sfcNoExpiryBundleActivity.getDefaultViewModelProviderFactory();
                    int i3 = 53 / 0;
                } else {
                    defaultViewModelProviderFactory = sfcNoExpiryBundleActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = component1 + 99;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 38 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault;
                int i3 = i2 + 49;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 53;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sfcNoExpiryBundleActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 87;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final NoExpiryViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NoExpiryViewModel noExpiryViewModel = (NoExpiryViewModel) this.viewModel.getValue();
        int i4 = component1 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return noExpiryViewModel;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/SfcNoExpiryBundleActivity$Companion;", "", "<init>", "()V", "EXTRA_RETURN_TO_NO_EXPIRY_BUNDLES", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        public static final NoExpiryBundlesUiState component2(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            ShareDataUIState = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                component1(state);
                obj.hashCode();
                throw null;
            }
            NoExpiryBundlesUiState noExpiryBundlesUiStateComponent1 = component1(state);
            int i3 = ShareDataUIState + 95;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return noExpiryBundlesUiStateComponent1;
            }
            obj.hashCode();
            throw null;
        }

        public static final Resource copydefault(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<DataCallProductResponse>> resourceShareDataUIState = ShareDataUIState(state);
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            int i5 = copydefault + 65;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return resourceShareDataUIState;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void copydefault(androidx.compose.runtime.Composer r13, int r14) {
            /*
                r12 = this;
                r0 = 2
                int r1 = r0 % r0
                r14 = r14 & 11
                if (r14 != r0) goto L22
                int r14 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.component2.ShareDataUIState
                int r14 = r14 + 45
                int r1 = r14 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.component2.copydefault = r1
                int r14 = r14 % r0
                if (r14 != 0) goto L1d
                boolean r14 = r13.getSkipping()
                if (r14 != 0) goto L19
                goto L22
            L19:
                r13.skipToGroupEnd()
                goto L66
            L1d:
                r13.getSkipping()
                r13 = 0
                throw r13
            L22:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity r14 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel r14 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.access$getViewModel(r14)
                androidx.lifecycle.LiveData r14 = r14.getNoExpiryBundlesData()
                r1 = 8
                androidx.compose.runtime.State r14 = androidx.compose.runtime.livedata.LiveDataAdapterKt.observeAsState(r14, r13, r1)
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.access$getViewModel(r1)
                kotlinx.coroutines.flow.StateFlow r2 = r1.getUiState()
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 8
                r8 = 7
                r6 = r13
                androidx.compose.runtime.State r1 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r2, r3, r4, r5, r6, r7, r8)
                r2 = 0
                r6 = 0
                r7 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity$component2$4 r8 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity$component2$4
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.this
                r8.<init>()
                r14 = 54
                r1 = -1488825132(0xffffffffa74254d4, float:-2.6968894E-15)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r1, r9, r8, r13, r14)
                r8 = r14
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                r10 = 1572864(0x180000, float:2.204052E-39)
                r11 = 63
                r9 = r13
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L66:
                int r13 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.component2.copydefault
                int r13 = r13 + 61
                int r14 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.component2.ShareDataUIState = r14
                int r13 = r13 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.component2.copydefault(androidx.compose.runtime.Composer, int):void");
        }

        private static final Resource<List<DataCallProductResponse>> ShareDataUIState(State<Resource<List<DataCallProductResponse>>> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<DataCallProductResponse>> value = state.getValue();
            int i4 = ShareDataUIState + 21;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final NoExpiryBundlesUiState component1(State<NoExpiryBundlesUiState> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            NoExpiryBundlesUiState value = state.getValue();
            int i4 = copydefault + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component2() {
        }
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $10 + 89;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - TextUtils.lastIndexOf("", '0', 0, 0), 32 - Process.getGidForName(""), (char) (ExpandableListView.getPackedPositionChild(0L) + 60269), -834797019, false, $$n((byte) ($$m & 63), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16777903, (Process.myTid() >> 22) + 34, (char) (60372 - ExpandableListView.getPackedPositionChild(0L)), -1969106284, false, $$n((byte) 10, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b4 = (byte) (-1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 687, 34 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (60373 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), -1969106284, false, $$n((byte) 10, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        int i3 = 684241640;
        int i4 = -1;
        float f = 0.0f;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, (char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), -309236339, false, $$n((byte) ($$m & 59), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 684241640;
                    i4 = -1;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 115;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int i10 = $10 + 33;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 75;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr6[i12]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    iArr2 = iArr6;
                    byte b3 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4392 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.red(i6) + 37, (char) (TextUtils.indexOf((CharSequence) "", '0') + i5), -309236339, false, $$n((byte) ($$m & 59), b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i12] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i12++;
                iArr6 = iArr2;
                i5 = 1;
                i6 = 0;
            }
            iArr6 = iArr7;
        }
        int i15 = i6;
        System.arraycopy(iArr6, i15, iArr5, i15, length2);
        getactivenotifications.component1 = i15;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i15] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i16];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2967 - ImageFormat.getBitsPerPixel(0), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (49871 - KeyEvent.keyCodeFromString("")), 462826032, false, $$n((byte) 11, b4, (byte) (b4 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i16++;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
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
                byte b5 = (byte) (-1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - TextUtils.indexOf("", ""), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (27638 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -1616366948, false, $$n((byte) ($$m & 58), b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i15 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void i(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = ShareDataUIState;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
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
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i8 = $11 + 3;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int iAxisFromString = 4501 - MotionEvent.axisFromString("");
                            int i11 = 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            char cIndexOf = (char) (27896 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            byte b3 = (byte) (-1);
                            String str$$n = $$n((byte) ($$m & 23), b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[2];
                            clsArr[0] = Integer.TYPE;
                            clsArr[b2] = Integer.TYPE;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, i11, cIndexOf, -1464227204, false, str$$n, clsArr);
                        }
                        cArr5[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 3580, 28 - (Process.myTid() >> 22), (char) Color.blue(0), 1180380354, false, $$n(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int i13 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1858;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 35;
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b6 = (byte) ($$m & 3);
                    byte b7 = (byte) (-b6);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i13, iIndexOf, doubleTapTimeout, 80302927, false, $$n(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            int i14 = $10 + 61;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i16, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $10 + 77;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
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
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i18 = $10 + 53;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x1264  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x13a3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x185d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0161  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.onCreate(android.os.Bundle):void");
    }

    private final void initData() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        getViewModel().getNeoBundles();
        int i4 = component2 + 99;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void initObservers() {
        int i = 2 % 2;
        getViewModel().getNoExpiryBundlesData().observe(this, new component3(new Function1() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                copydefault = i3 % 128;
                Resource resource = (Resource) obj;
                if (i3 % 2 != 0) {
                    SfcNoExpiryBundleActivity.$r8$lambda$Ew1nOFHDllZw7a5fwGQvF08aY3w(resource);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit$r8$lambda$Ew1nOFHDllZw7a5fwGQvF08aY3w = SfcNoExpiryBundleActivity.$r8$lambda$Ew1nOFHDllZw7a5fwGQvF08aY3w(resource);
                int i4 = component3 + 121;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 81 / 0;
                }
                return unit$r8$lambda$Ew1nOFHDllZw7a5fwGQvF08aY3w;
            }
        }));
        int i2 = component2 + 61;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit initObservers$lambda$0(Resource resource) {
        int i = 2 % 2;
        if (resource.error()) {
            int i2 = component2 + 41;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = component2 + 75;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onBundleSelected(WithExpiryResp bundle) {
        int i = 2 % 2;
        Bundle bundle2 = new Bundle(1);
        bundle2.putSerializable("withExpiryResp", bundle);
        bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_NO_EXPIRY);
        bundle2.putString(Keys.KEY_RETURN_DESTINATION, RoutePathConstant.SFC_NO_EXPIRY_BUNDLES);
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = component1 + 57;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g(View.MeasureSpec.makeMeasureSpec(0, 0) + 30169, new char[]{20046, 15256, 42489, 12246, 39204, 891, 36189, 30446, 57478, 27390, 54309, 24146, 51266, 45641, 16261, 43505, 5065, 40239, 1817, 61773, 31375, 58506, 28411, 55349, 16918, 52346}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) + 39823, new char[]{20044, 62955, 14655, 32078, 41102, 58420, 10365, 28601, 37847, 55142, 6825, 24285, 33280, 51635, 3573, 45337, 62800, 14464}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i6 = component2 + 17;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 4;
            }
        }
        if (baseContext != null) {
            int i8 = component2 + 49;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i9 = component2 + 81;
            component1 = i9 % 128;
            try {
                if (i9 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6617, (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) Gravity.getAbsoluteGravity(0, 0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), 42 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 57, (char) View.resolveSize(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = component2 + 59;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            g(30168 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{20046, 15256, 42489, 12246, 39204, 891, 36189, 30446, 57478, 27390, 54309, 24146, 51266, 45641, 16261, 43505, 5065, 40239, 1817, 61773, 31375, 58506, 28411, 55349, 16918, 52346}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(TextUtils.indexOf("", "", 0, 0) + 48049, new char[]{20044, 62955, 14655, 32078, 41102, 58420, 10365, 28601, 37847, 55142, 6825, 24285, 33280, 51635, 3573, 45337, 62800, 14464}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getSize(0) + 42, (char) TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 6562, 56 - Color.alpha(0), (char) (Color.rgb(0, 0, 0) + 16777216), -960739708, false, "component3", new Class[]{Context.class});
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
    /* JADX WARN: Removed duplicated region for block: B:143:0x086c A[Catch: all -> 0x0369, TryCatch #39 {all -> 0x0369, blocks: (B:141:0x0866, B:143:0x086c, B:144:0x089c, B:259:0x0df4, B:261:0x0dfa, B:262:0x0e27, B:740:0x30c9, B:742:0x30cf, B:743:0x30fb, B:784:0x3486, B:786:0x348c, B:787:0x34b6, B:764:0x32b0, B:766:0x32d3, B:767:0x332b, B:706:0x2d86, B:708:0x2d8c, B:709:0x2db9, B:593:0x266b, B:595:0x2671, B:596:0x269f, B:598:0x26d9, B:599:0x271f, B:567:0x23ca, B:569:0x23df, B:570:0x240f, B:548:0x20d8, B:550:0x20de, B:551:0x2104, B:553:0x213e, B:554:0x2185, B:519:0x1da3, B:521:0x1db8, B:522:0x1dea, B:524:0x1e1e, B:525:0x1e98, B:499:0x1b43, B:501:0x1b49, B:502:0x1b71, B:431:0x16ad, B:433:0x16b3, B:434:0x16de, B:304:0x1039, B:306:0x103f, B:307:0x1069, B:19:0x0151, B:21:0x0157, B:22:0x017d, B:24:0x02d8, B:26:0x030a, B:27:0x0363), top: B:881:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0969 A[Catch: all -> 0x0d64, PHI: r1 r7
  0x0969: PHI (r1v618 java.lang.Object) = (r1v606 java.lang.Object), (r1v616 java.lang.Object) binds: [B:149:0x0923, B:150:0x0925] A[DONT_GENERATE, DONT_INLINE]
  0x0969: PHI (r7v100 ??) = (r7v167 ??), (r7v168 ??) binds: [B:149:0x0923, B:150:0x0925] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #38 {all -> 0x0d64, blocks: (B:148:0x091f, B:155:0x0969, B:164:0x09ca, B:182:0x0ade, B:186:0x0b27), top: B:879:0x091f }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09ca A[Catch: all -> 0x0d64, TRY_ENTER, TRY_LEAVE, TryCatch #38 {all -> 0x0d64, blocks: (B:148:0x091f, B:155:0x0969, B:164:0x09ca, B:182:0x0ade, B:186:0x0b27), top: B:879:0x091f }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0c13 A[Catch: all -> 0x0d44, TryCatch #22 {all -> 0x0d44, blocks: (B:198:0x0c09, B:199:0x0c0d, B:201:0x0c13, B:204:0x0c2e, B:188:0x0b36, B:194:0x0b9f, B:197:0x0c01), top: B:852:0x0b36 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0dfa A[Catch: all -> 0x0369, TryCatch #39 {all -> 0x0369, blocks: (B:141:0x0866, B:143:0x086c, B:144:0x089c, B:259:0x0df4, B:261:0x0dfa, B:262:0x0e27, B:740:0x30c9, B:742:0x30cf, B:743:0x30fb, B:784:0x3486, B:786:0x348c, B:787:0x34b6, B:764:0x32b0, B:766:0x32d3, B:767:0x332b, B:706:0x2d86, B:708:0x2d8c, B:709:0x2db9, B:593:0x266b, B:595:0x2671, B:596:0x269f, B:598:0x26d9, B:599:0x271f, B:567:0x23ca, B:569:0x23df, B:570:0x240f, B:548:0x20d8, B:550:0x20de, B:551:0x2104, B:553:0x213e, B:554:0x2185, B:519:0x1da3, B:521:0x1db8, B:522:0x1dea, B:524:0x1e1e, B:525:0x1e98, B:499:0x1b43, B:501:0x1b49, B:502:0x1b71, B:431:0x16ad, B:433:0x16b3, B:434:0x16de, B:304:0x1039, B:306:0x103f, B:307:0x1069, B:19:0x0151, B:21:0x0157, B:22:0x017d, B:24:0x02d8, B:26:0x030a, B:27:0x0363), top: B:881:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0ec8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0edf A[Catch: all -> 0x0fa4, TryCatch #2 {all -> 0x0fa4, blocks: (B:279:0x0eca, B:281:0x0edf, B:282:0x0f12), top: B:816:0x0eca, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0f25 A[Catch: all -> 0x0f9a, TryCatch #53 {all -> 0x0f9a, blocks: (B:283:0x0f18, B:285:0x0f25, B:286:0x0f92), top: B:909:0x0f18, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x10fc A[Catch: all -> 0x1647, TryCatch #27 {all -> 0x1647, blocks: (B:312:0x10f6, B:314:0x10fc, B:315:0x1145, B:376:0x14f6, B:377:0x14fa, B:380:0x1504, B:383:0x151e, B:386:0x152a, B:388:0x152d, B:400:0x1615, B:402:0x161b, B:403:0x161c, B:405:0x161e, B:407:0x1625, B:408:0x1626, B:369:0x142c, B:371:0x1449, B:372:0x1492, B:374:0x14a8, B:375:0x14f0, B:411:0x162b, B:413:0x1631, B:414:0x1632, B:417:0x1637, B:419:0x163d, B:420:0x163e, B:396:0x1595, B:391:0x155a, B:393:0x1560, B:394:0x158d), top: B:862:0x10f6, inners: #50, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x11bb  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x11d3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1230  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x1504 A[Catch: all -> 0x1647, TryCatch #27 {all -> 0x1647, blocks: (B:312:0x10f6, B:314:0x10fc, B:315:0x1145, B:376:0x14f6, B:377:0x14fa, B:380:0x1504, B:383:0x151e, B:386:0x152a, B:388:0x152d, B:400:0x1615, B:402:0x161b, B:403:0x161c, B:405:0x161e, B:407:0x1625, B:408:0x1626, B:369:0x142c, B:371:0x1449, B:372:0x1492, B:374:0x14a8, B:375:0x14f0, B:411:0x162b, B:413:0x1631, B:414:0x1632, B:417:0x1637, B:419:0x163d, B:420:0x163e, B:396:0x1595, B:391:0x155a, B:393:0x1560, B:394:0x158d), top: B:862:0x10f6, inners: #50, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x16b3 A[Catch: all -> 0x0369, TryCatch #39 {all -> 0x0369, blocks: (B:141:0x0866, B:143:0x086c, B:144:0x089c, B:259:0x0df4, B:261:0x0dfa, B:262:0x0e27, B:740:0x30c9, B:742:0x30cf, B:743:0x30fb, B:784:0x3486, B:786:0x348c, B:787:0x34b6, B:764:0x32b0, B:766:0x32d3, B:767:0x332b, B:706:0x2d86, B:708:0x2d8c, B:709:0x2db9, B:593:0x266b, B:595:0x2671, B:596:0x269f, B:598:0x26d9, B:599:0x271f, B:567:0x23ca, B:569:0x23df, B:570:0x240f, B:548:0x20d8, B:550:0x20de, B:551:0x2104, B:553:0x213e, B:554:0x2185, B:519:0x1da3, B:521:0x1db8, B:522:0x1dea, B:524:0x1e1e, B:525:0x1e98, B:499:0x1b43, B:501:0x1b49, B:502:0x1b71, B:431:0x16ad, B:433:0x16b3, B:434:0x16de, B:304:0x1039, B:306:0x103f, B:307:0x1069, B:19:0x0151, B:21:0x0157, B:22:0x017d, B:24:0x02d8, B:26:0x030a, B:27:0x0363), top: B:881:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1768 A[Catch: all -> 0x1ab6, TryCatch #13 {all -> 0x1ab6, blocks: (B:438:0x1762, B:440:0x1768, B:441:0x17aa, B:443:0x17b7, B:445:0x17c0, B:446:0x1804, B:465:0x19b3, B:473:0x1a16, B:479:0x1a9a, B:481:0x1aa0, B:482:0x1aa1, B:484:0x1aa3, B:486:0x1aaa, B:487:0x1aab, B:448:0x1810, B:455:0x189a, B:457:0x18a0, B:458:0x18e0, B:460:0x190a, B:461:0x194f, B:463:0x1965, B:464:0x19ab, B:489:0x1aad, B:491:0x1ab4, B:492:0x1ab5, B:469:0x19e3, B:471:0x19e9, B:472:0x1a0f, B:450:0x1830, B:452:0x1842, B:453:0x188e, B:475:0x1a1c), top: B:837:0x1762, outer: #33, inners: #1, #7, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x17b7 A[Catch: all -> 0x1ab6, TryCatch #13 {all -> 0x1ab6, blocks: (B:438:0x1762, B:440:0x1768, B:441:0x17aa, B:443:0x17b7, B:445:0x17c0, B:446:0x1804, B:465:0x19b3, B:473:0x1a16, B:479:0x1a9a, B:481:0x1aa0, B:482:0x1aa1, B:484:0x1aa3, B:486:0x1aaa, B:487:0x1aab, B:448:0x1810, B:455:0x189a, B:457:0x18a0, B:458:0x18e0, B:460:0x190a, B:461:0x194f, B:463:0x1965, B:464:0x19ab, B:489:0x1aad, B:491:0x1ab4, B:492:0x1ab5, B:469:0x19e3, B:471:0x19e9, B:472:0x1a0f, B:450:0x1830, B:452:0x1842, B:453:0x188e, B:475:0x1a1c), top: B:837:0x1762, outer: #33, inners: #1, #7, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1810 A[Catch: all -> 0x1ab6, TRY_LEAVE, TryCatch #13 {all -> 0x1ab6, blocks: (B:438:0x1762, B:440:0x1768, B:441:0x17aa, B:443:0x17b7, B:445:0x17c0, B:446:0x1804, B:465:0x19b3, B:473:0x1a16, B:479:0x1a9a, B:481:0x1aa0, B:482:0x1aa1, B:484:0x1aa3, B:486:0x1aaa, B:487:0x1aab, B:448:0x1810, B:455:0x189a, B:457:0x18a0, B:458:0x18e0, B:460:0x190a, B:461:0x194f, B:463:0x1965, B:464:0x19ab, B:489:0x1aad, B:491:0x1ab4, B:492:0x1ab5, B:469:0x19e3, B:471:0x19e9, B:472:0x1a0f, B:450:0x1830, B:452:0x1842, B:453:0x188e, B:475:0x1a1c), top: B:837:0x1762, outer: #33, inners: #1, #7, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x19c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0437 A[Catch: all -> 0x07e3, TRY_ENTER, TRY_LEAVE, TryCatch #37 {all -> 0x07e3, blocks: (B:32:0x0377, B:38:0x03c8, B:47:0x0437, B:65:0x054b, B:68:0x0592), top: B:877:0x0377 }] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x1bfb  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1c66  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x1cc5  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1d85  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1fd0  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x2099  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x2275  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x22c7  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x23aa  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x2555  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x262e  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x280a A[Catch: all -> 0x2d21, TryCatch #0 {all -> 0x2d21, blocks: (B:602:0x2804, B:604:0x280a, B:605:0x2850, B:607:0x2877, B:608:0x28c2, B:614:0x28e7, B:616:0x28ed, B:617:0x2930, B:618:0x293c, B:619:0x293d, B:621:0x2946, B:622:0x298c, B:657:0x2bdc, B:658:0x2be0, B:660:0x2be6, B:663:0x2bfe, B:666:0x2c0b, B:669:0x2c18, B:681:0x2cfb, B:683:0x2d01, B:684:0x2d02, B:686:0x2d04, B:688:0x2d0b, B:689:0x2d0c, B:627:0x29a5, B:629:0x29a9, B:633:0x29b5, B:635:0x29bb, B:647:0x2ac3, B:649:0x2ac9, B:650:0x2b0a, B:652:0x2b34, B:653:0x2b7d, B:655:0x2b93, B:656:0x2bd6, B:691:0x2d0e, B:693:0x2d15, B:694:0x2d16, B:696:0x2d18, B:698:0x2d1f, B:699:0x2d20, B:677:0x2c7c, B:672:0x2c44, B:674:0x2c4a, B:675:0x2c74, B:642:0x2a29, B:644:0x2a48, B:645:0x2ab7, B:637:0x29db, B:639:0x29f0, B:640:0x2a22), top: B:813:0x2804, outer: #33, inners: #41, #43, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x2877 A[Catch: all -> 0x2d21, TryCatch #0 {all -> 0x2d21, blocks: (B:602:0x2804, B:604:0x280a, B:605:0x2850, B:607:0x2877, B:608:0x28c2, B:614:0x28e7, B:616:0x28ed, B:617:0x2930, B:618:0x293c, B:619:0x293d, B:621:0x2946, B:622:0x298c, B:657:0x2bdc, B:658:0x2be0, B:660:0x2be6, B:663:0x2bfe, B:666:0x2c0b, B:669:0x2c18, B:681:0x2cfb, B:683:0x2d01, B:684:0x2d02, B:686:0x2d04, B:688:0x2d0b, B:689:0x2d0c, B:627:0x29a5, B:629:0x29a9, B:633:0x29b5, B:635:0x29bb, B:647:0x2ac3, B:649:0x2ac9, B:650:0x2b0a, B:652:0x2b34, B:653:0x2b7d, B:655:0x2b93, B:656:0x2bd6, B:691:0x2d0e, B:693:0x2d15, B:694:0x2d16, B:696:0x2d18, B:698:0x2d1f, B:699:0x2d20, B:677:0x2c7c, B:672:0x2c44, B:674:0x2c4a, B:675:0x2c74, B:642:0x2a29, B:644:0x2a48, B:645:0x2ab7, B:637:0x29db, B:639:0x29f0, B:640:0x2a22), top: B:813:0x2804, outer: #33, inners: #41, #43, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x28d8  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2997  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x2be6 A[Catch: all -> 0x2d21, TryCatch #0 {all -> 0x2d21, blocks: (B:602:0x2804, B:604:0x280a, B:605:0x2850, B:607:0x2877, B:608:0x28c2, B:614:0x28e7, B:616:0x28ed, B:617:0x2930, B:618:0x293c, B:619:0x293d, B:621:0x2946, B:622:0x298c, B:657:0x2bdc, B:658:0x2be0, B:660:0x2be6, B:663:0x2bfe, B:666:0x2c0b, B:669:0x2c18, B:681:0x2cfb, B:683:0x2d01, B:684:0x2d02, B:686:0x2d04, B:688:0x2d0b, B:689:0x2d0c, B:627:0x29a5, B:629:0x29a9, B:633:0x29b5, B:635:0x29bb, B:647:0x2ac3, B:649:0x2ac9, B:650:0x2b0a, B:652:0x2b34, B:653:0x2b7d, B:655:0x2b93, B:656:0x2bd6, B:691:0x2d0e, B:693:0x2d15, B:694:0x2d16, B:696:0x2d18, B:698:0x2d1f, B:699:0x2d20, B:677:0x2c7c, B:672:0x2c44, B:674:0x2c4a, B:675:0x2c74, B:642:0x2a29, B:644:0x2a48, B:645:0x2ab7, B:637:0x29db, B:639:0x29f0, B:640:0x2a22), top: B:813:0x2804, outer: #33, inners: #41, #43, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x2e48  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x2e9c  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x2ef9  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x30ab  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x3187  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x31da  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x3292  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x3466  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0130 A[PHI: r15
  0x0130: PHI (r15v51 ??) = (r15v6 ??), (r15v52 ??) binds: [B:17:0x014c, B:5:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0673 A[Catch: all -> 0x07c2, TryCatch #19 {all -> 0x07c2, blocks: (B:79:0x0669, B:80:0x066d, B:82:0x0673, B:85:0x068e, B:70:0x05a1, B:75:0x0605, B:78:0x0661), top: B:847:0x05a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:851:0x0eaf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:874:0x0925 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0134 A[PHI: r15
  0x0134: PHI (r15v6 ??) = (r15v57 ??), (r15v58 ??) binds: [B:3:0x011f, B:5:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:943:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v122 */
    /* JADX WARN: Type inference failed for: r10v123 */
    /* JADX WARN: Type inference failed for: r10v124 */
    /* JADX WARN: Type inference failed for: r10v125 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52, types: [int] */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v39 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v40 */
    /* JADX WARN: Type inference failed for: r26v41 */
    /* JADX WARN: Type inference failed for: r26v44 */
    /* JADX WARN: Type inference failed for: r26v45 */
    /* JADX WARN: Type inference failed for: r26v46 */
    /* JADX WARN: Type inference failed for: r26v49 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v50 */
    /* JADX WARN: Type inference failed for: r26v51 */
    /* JADX WARN: Type inference failed for: r26v52 */
    /* JADX WARN: Type inference failed for: r26v53 */
    /* JADX WARN: Type inference failed for: r26v54 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v25 */
    /* JADX WARN: Type inference failed for: r27v26 */
    /* JADX WARN: Type inference failed for: r27v46 */
    /* JADX WARN: Type inference failed for: r2v750, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v621 */
    /* JADX WARN: Type inference failed for: r3v622 */
    /* JADX WARN: Type inference failed for: r3v623 */
    /* JADX WARN: Type inference failed for: r3v636 */
    /* JADX WARN: Type inference failed for: r3v637 */
    /* JADX WARN: Type inference failed for: r6v488 */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v102 */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v113, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v133 */
    /* JADX WARN: Type inference failed for: r7v135, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v147, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v163 */
    /* JADX WARN: Type inference failed for: r7v164 */
    /* JADX WARN: Type inference failed for: r7v165 */
    /* JADX WARN: Type inference failed for: r7v166 */
    /* JADX WARN: Type inference failed for: r7v167 */
    /* JADX WARN: Type inference failed for: r7v168 */
    /* JADX WARN: Type inference failed for: r7v169 */
    /* JADX WARN: Type inference failed for: r7v170 */
    /* JADX WARN: Type inference failed for: r7v171 */
    /* JADX WARN: Type inference failed for: r7v172 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v174 */
    /* JADX WARN: Type inference failed for: r7v175 */
    /* JADX WARN: Type inference failed for: r7v176 */
    /* JADX WARN: Type inference failed for: r7v177 */
    /* JADX WARN: Type inference failed for: r7v178 */
    /* JADX WARN: Type inference failed for: r7v179 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX WARN: Type inference failed for: r9v274, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v278 */
    /* JADX WARN: Type inference failed for: r9v279 */
    /* JADX WARN: Type inference failed for: r9v280 */
    /* JADX WARN: Type inference failed for: r9v281 */
    /* JADX WARN: Type inference failed for: r9v284 */
    /* JADX WARN: Type inference failed for: r9v285 */
    /* JADX WARN: Type inference failed for: r9v291 */
    /* JADX WARN: Type inference failed for: r9v292 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.SfcNoExpiryBundleActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$Ew1nOFHDllZw7a5fwGQvF08aY3w(Resource resource) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            initObservers$lambda$0(resource);
            throw null;
        }
        Unit unitInitObservers$lambda$0 = initObservers$lambda$0(resource);
        int i3 = component1 + 121;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return unitInitObservers$lambda$0;
    }

    static {
        component4 = 1;
        ShareDataUIState();
        component1();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = equals + 77;
        component4 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component1 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            ShareDataUIState = new char[]{33519, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33458, 33457, 33457, 33425, 33422, 33457, 33465, 33462, 33462, 33430, 33439, 33508, 33428, 33462, 33459, 33458, 33462, 33457, 33426, 33428, 33457};
            throw null;
        }
        ShareDataUIState = new char[]{33519, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33458, 33457, 33457, 33425, 33422, 33457, 33465, 33462, 33462, 33430, 33439, 33508, 33428, 33462, 33459, 33458, 33462, 33457, 33426, 33428, 33457};
        int i4 = i2 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        copydefault = -1857460206070346235L;
        component3 = new int[]{-1816486062, 70079986, 800260403, 1543089102, 569230788, -1829726035, -1465643417, -597669022, 1978505200, -2127320827, 1798937283, -1076097697, -1884450738, 1598733800, 1178807992, -31290316, 1727807391, 1440227570};
    }
}
