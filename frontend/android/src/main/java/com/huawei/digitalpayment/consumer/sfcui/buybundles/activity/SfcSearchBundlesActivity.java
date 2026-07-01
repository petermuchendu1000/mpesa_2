package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaOfferResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.ISortFilterType;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesUIState;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesViewModel;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.screens.SearchBundlesScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesScreenKt;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.sharedui.compose.databinding.ActivityComposeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/SfcSearchBundlesActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "binding", "Lcom/safaricom/sharedui/compose/databinding/ActivityComposeBinding;", "searchBundlesViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesViewModel;", "getSearchBundlesViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesViewModel;", "searchBundlesViewModel$delegate", "Lkotlin/Lazy;", "buyBundleViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getBuyBundleViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "buyBundleViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "fetchData", "initObservers", "onSelectBundle", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "getValidityString", "", "productName", "packageName", "ConsumerSfcUI_release", "searchBundlesUIState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesUIState;", GriverMonitorConstants.KEY_IS_LOADING, ""}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcSearchBundlesActivity extends Hilt_SfcSearchBundlesActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static boolean component1;
    private static boolean component2;
    private static char[] component3;
    private static char component4;
    private static char[] copydefault;
    private static long equals;
    private static int hashCode;
    private ActivityComposeBinding binding;

    private final Lazy buyBundleViewModel;

    private final Lazy searchBundlesViewModel;
    private static final byte[] $$l = {Ascii.VT, -55, -20, -91};
    private static final int $$m = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {20, 103, 109, TarHeader.LF_BLK, Ascii.DC2, 4, -57, 63, Ascii.SO, 6, -2, Ascii.VT, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, Ascii.EM, -9, 19, -3, -2, 17, -56, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 40, Ascii.ETB, Ascii.ETB, -9, 8, 13, -5, 7, Ascii.DLE, -1, -12, 35, -9, Ascii.ETB, 7, -8, -22, 43, Ascii.FF, -45, TarHeader.LF_CONTIG, 6, -11, Ascii.RS, -79, 19, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -61, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.FF, -59, 74, -7, 2, 8, Ascii.ETB, -5, 19, -11, Ascii.EM, PSSSigner.TRAILER_IMPLICIT, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 71, 7, -5, 19, -11, Ascii.EM, 1, 9, 7, -63, 71, -7, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -49, 39, Ascii.EM, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -8, Ascii.CAN, Ascii.VT, -4, 17, Ascii.SO, -47, TarHeader.LF_CHR, Ascii.FF, -1, -4, 3, Ascii.ETB, 13, -79, 69, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 79, -12, 3, Ascii.SUB, -7, 2, Ascii.CAN, -67, 65, Ascii.VT, Ascii.FF, -9, 19, -11, 8, Ascii.ETB, -5, Ascii.FF, 5, -58, 62, Ascii.NAK, -1, -5, Ascii.ETB, -5, Ascii.FF, 5, -58, 43, 39, -13, Ascii.ETB, 8, -30, Ascii.ETB, Ascii.RS, -79, Ascii.ETB};
    private static final int $$k = 25;
    private static final byte[] $$d = {1, -53, Ascii.US, 101, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 147;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int component3 = 1;
        private final Function1 ShareDataUIState;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (obj instanceof Observer) {
                int i2 = component3;
                int i3 = i2 + 27;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i5 = i2 + 97;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    Function<?> functionDelegate = getFunctionDelegate();
                    if (i6 == 0) {
                        return Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
                    throw null;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3 + 105;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i3 + 33;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 107;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = component2 + 33;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 89;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = component3 + 63;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r6, int r7, byte r8) {
        /*
            int r6 = 119 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.$$l
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.$$n(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r9 = 28 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.$$d
            int r7 = 100 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
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
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-8)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.h(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.$$j
            int r1 = r7 + 10
            int r6 = r6 * 6
            int r6 = 105 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r8 = r8 + r4
            int r8 = r8 + (-6)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.i(int, byte, int, java.lang.Object[]):void");
    }

    public static final SearchBundlesViewModel access$getSearchBundlesViewModel(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SearchBundlesViewModel searchBundlesViewModel = sfcSearchBundlesActivity.getSearchBundlesViewModel();
        int i4 = getAsAtTimestamp + 55;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return searchBundlesViewModel;
    }

    public static final void access$onSelectBundle(SfcSearchBundlesActivity sfcSearchBundlesActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sfcSearchBundlesActivity.onSelectBundle(bundle);
        if (i3 != 0) {
            throw null;
        }
    }

    public SfcSearchBundlesActivity() {
        final SfcSearchBundlesActivity sfcSearchBundlesActivity = this;
        final Function0 function0 = null;
        this.searchBundlesViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SearchBundlesViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 67;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcSearchBundlesActivity.getViewModelStore();
                if (i3 != 0) {
                    int i4 = 25 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 119;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component2 + 41;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 73;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component3 + 69;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 123;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = sfcSearchBundlesActivity;
                if (i3 != 0) {
                    return componentActivity.getDefaultViewModelProviderFactory();
                }
                componentActivity.getDefaultViewModelProviderFactory();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = component2 + 59;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = sfcSearchBundlesActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = component3 + 21;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return defaultViewModelCreationExtras;
                }
                throw null;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 21;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
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
        this.buyBundleViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 63;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcSearchBundlesActivity.getViewModelStore();
                int i4 = component1 + 83;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 87;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component2 + 67;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 29;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 76 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 17;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    sfcSearchBundlesActivity.getDefaultViewModelProviderFactory();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcSearchBundlesActivity.getDefaultViewModelProviderFactory();
                int i3 = copydefault + 11;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
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
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L18
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$special$$inlined$viewModels$default$6.copydefault
                    int r2 = r2 + 95
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$special$$inlined$viewModels$default$6.ShareDataUIState = r3
                    int r2 = r2 % r0
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L1e
                L18:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L1e:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$special$$inlined$viewModels$default$6.ShareDataUIState
                    int r2 = r2 + 65
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$special$$inlined$viewModels$default$6.copydefault = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$special$$inlined$viewModels$default$6.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 121;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = ShareDataUIState + 123;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 92 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final SearchBundlesViewModel getSearchBundlesViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        SearchBundlesViewModel searchBundlesViewModel = (SearchBundlesViewModel) this.searchBundlesViewModel.getValue();
        if (i3 != 0) {
            return searchBundlesViewModel;
        }
        throw null;
    }

    private final BuyBundleViewModel getBuyBundleViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = (BuyBundleViewModel) this.buyBundleViewModel.getValue();
        int i4 = getAsAtTimestamp + 97;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return buyBundleViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int copydefault = 1;

        public static final SearchBundlesUIState ShareDataUIState(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return component1(state);
            }
            component1(state);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final boolean component2(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            boolean zComponent3 = component3(state);
            int i4 = component2 + 65;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return zComponent3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            component2 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                ShareDataUIState(composer2, num2.intValue());
                return Unit.INSTANCE;
            }
            ShareDataUIState(composer2, num2.intValue());
            int i3 = 64 / 0;
            return Unit.INSTANCE;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 1;
            private static int copydefault;
            final SfcSearchBundlesActivity ShareDataUIState;
            final State<SearchBundlesUIState> component1;
            final State<Boolean> component3;

            public static Object component1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = ~i;
                int i8 = ~i4;
                int i9 = (~(i7 | i8 | i6)) | (~(i | i4 | i6));
                int i10 = ~i6;
                int i11 = (~(i8 | i)) | (~(i8 | i10));
                int i12 = (~(i6 | i4)) | (~(i7 | i10));
                int i13 = i + i4 + i3 + ((-564018846) * i5) + (483938512 * i2);
                int i14 = i13 * i13;
                int i15 = (1473915126 * i) + 752877568 + ((-1516524009) * i4) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i3) + (1390411776 * i5) + (452984832 * i2) + ((-1135738880) * i14);
                int i16 = ((i * 1456092922) - 824780772) + (i4 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i3 * 1456093799) + (i5 * 578355822) + (i2 * 1098359728) + (i14 * 1868693504);
                int i17 = i15 + (i16 * i16 * 2110914560);
                return i17 != 1 ? i17 != 2 ? ShareDataUIState(objArr) : component3(objArr) : copydefault(objArr);
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 95;
                copydefault = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 != 0) {
                    component1(-827678633, ViewAllFavoritesScreenKt.copydefault.component2(), new Object[]{this, composer2, Integer.valueOf(num2.intValue())}, ViewAllFavoritesScreenKt.copydefault.component2(), 827678634, ViewAllFavoritesScreenKt.copydefault.component2(), ViewAllFavoritesScreenKt.copydefault.component2());
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                component1(-827678633, ViewAllFavoritesScreenKt.copydefault.component2(), new Object[]{this, composer2, Integer.valueOf(num2.intValue())}, ViewAllFavoritesScreenKt.copydefault.component2(), 827678634, ViewAllFavoritesScreenKt.copydefault.component2(), ViewAllFavoritesScreenKt.copydefault.component2());
                Unit unit2 = Unit.INSTANCE;
                int i3 = component2 + 83;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static Object copydefault(Object[] objArr) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                Composer composer = (Composer) objArr[1];
                int i = 2 % 2;
                if ((((Number) objArr[2]).intValue() & 11) == 2) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        int i2 = copydefault + 81;
                        component2 = i2 % 128;
                        if (i2 % 2 != 0) {
                            return null;
                        }
                        int i3 = 5 / 2;
                        return null;
                    }
                    int i4 = component2 + 33;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                }
                C02634 c02634 = new C02634(anonymousClass4.ShareDataUIState);
                SearchBundlesUIState searchBundlesUIStateShareDataUIState = component2.ShareDataUIState(anonymousClass4.component1);
                boolean zComponent2 = component2.component2(anonymousClass4.component3);
                final SfcSearchBundlesActivity sfcSearchBundlesActivity = anonymousClass4.ShareDataUIState;
                Function1 function1 = new Function1() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = component1 + 81;
                        ShareDataUIState = i7 % 128;
                        if (i7 % 2 != 0) {
                            Object[] objArr2 = {sfcSearchBundlesActivity, (ISortFilterType) obj};
                            int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                            throw null;
                        }
                        Object[] objArr3 = {sfcSearchBundlesActivity, (ISortFilterType) obj};
                        int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                        Unit unit = (Unit) SfcSearchBundlesActivity.component2.AnonymousClass4.component1(-231362561, ViewAllFavoritesScreenKt.copydefault.component2(), objArr3, ViewAllFavoritesScreenKt.copydefault.component2(), 231362563, ViewAllFavoritesScreenKt.copydefault.component2(), iComponent22);
                        int i8 = ShareDataUIState + 91;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }
                };
                final SfcSearchBundlesActivity sfcSearchBundlesActivity2 = anonymousClass4.ShareDataUIState;
                Function1 function12 = new Function1() {
                    private static int component1 = 0;
                    private static int component2 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = component1 + 17;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitComponent2 = SfcSearchBundlesActivity.component2.AnonymousClass4.component2(sfcSearchBundlesActivity2, (ISortFilterType) obj);
                        int i9 = component1 + 43;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitComponent2;
                    }
                };
                final SfcSearchBundlesActivity sfcSearchBundlesActivity3 = anonymousClass4.ShareDataUIState;
                Function1 function13 = new Function1() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = ShareDataUIState + 103;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                        SfcSearchBundlesActivity sfcSearchBundlesActivity4 = sfcSearchBundlesActivity3;
                        String str = (String) obj;
                        if (i8 == 0) {
                            return SfcSearchBundlesActivity.component2.AnonymousClass4.ShareDataUIState(sfcSearchBundlesActivity4, str);
                        }
                        SfcSearchBundlesActivity.component2.AnonymousClass4.ShareDataUIState(sfcSearchBundlesActivity4, str);
                        throw null;
                    }
                };
                C02634 c026342 = c02634;
                final SfcSearchBundlesActivity sfcSearchBundlesActivity4 = anonymousClass4.ShareDataUIState;
                Function0 function0 = new Function0() {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = ShareDataUIState + 35;
                        component3 = i7 % 128;
                        if (i7 % 2 == 0) {
                            SfcSearchBundlesActivity.component2.AnonymousClass4.ShareDataUIState(sfcSearchBundlesActivity4);
                            throw null;
                        }
                        Unit unitShareDataUIState = SfcSearchBundlesActivity.component2.AnonymousClass4.ShareDataUIState(sfcSearchBundlesActivity4);
                        int i8 = ShareDataUIState + 89;
                        component3 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 37 / 0;
                        }
                        return unitShareDataUIState;
                    }
                };
                final SfcSearchBundlesActivity sfcSearchBundlesActivity5 = anonymousClass4.ShareDataUIState;
                Function0 function02 = new Function0() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component3 + 31;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitComponent1 = SfcSearchBundlesActivity.component2.AnonymousClass4.component1(sfcSearchBundlesActivity5);
                        int i9 = component1 + 125;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitComponent1;
                    }
                };
                final SfcSearchBundlesActivity sfcSearchBundlesActivity6 = anonymousClass4.ShareDataUIState;
                Function0 function03 = new Function0() {
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = copydefault + 67;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        SfcSearchBundlesActivity sfcSearchBundlesActivity7 = sfcSearchBundlesActivity6;
                        if (i8 == 0) {
                            return SfcSearchBundlesActivity.component2.AnonymousClass4.component2(sfcSearchBundlesActivity7);
                        }
                        SfcSearchBundlesActivity.component2.AnonymousClass4.component2(sfcSearchBundlesActivity7);
                        throw null;
                    }
                };
                final SfcSearchBundlesActivity sfcSearchBundlesActivity7 = anonymousClass4.ShareDataUIState;
                Function0 function04 = new Function0() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component3 + 3;
                        component2 = i7 % 128;
                        Object obj = null;
                        if (i7 % 2 != 0) {
                            SfcSearchBundlesActivity.component2.AnonymousClass4.component3(sfcSearchBundlesActivity7);
                            obj.hashCode();
                            throw null;
                        }
                        Unit unitComponent3 = SfcSearchBundlesActivity.component2.AnonymousClass4.component3(sfcSearchBundlesActivity7);
                        int i8 = component3 + 7;
                        component2 = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unitComponent3;
                        }
                        obj.hashCode();
                        throw null;
                    }
                };
                final SfcSearchBundlesActivity sfcSearchBundlesActivity8 = anonymousClass4.ShareDataUIState;
                SearchBundlesScreenKt.SearchBundlesScreen(zComponent2, function1, function12, function13, c026342, function0, function02, function03, function04, new Function0() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component3 + 121;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitCopydefault = SfcSearchBundlesActivity.component2.AnonymousClass4.copydefault(sfcSearchBundlesActivity8);
                        int i9 = component1 + 91;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitCopydefault;
                    }
                }, searchBundlesUIStateShareDataUIState, composer, 0, 8);
                return null;
            }

            private static final Unit ShareDataUIState(SfcSearchBundlesActivity sfcSearchBundlesActivity, ISortFilterType iSortFilterType) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                Intrinsics.checkNotNullParameter(iSortFilterType, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(new SearchBundlesEvent.OnSortTypeSelected(iSortFilterType));
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 95;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 29 / 0;
                }
                return unit;
            }

            private static final Unit component1(SfcSearchBundlesActivity sfcSearchBundlesActivity, ISortFilterType iSortFilterType) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                Intrinsics.checkNotNullParameter(iSortFilterType, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(new SearchBundlesEvent.OnSortTypeUnSelected(iSortFilterType));
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 87;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static Object ShareDataUIState(Object[] objArr) {
                SfcSearchBundlesActivity sfcSearchBundlesActivity = (SfcSearchBundlesActivity) objArr[0];
                String str = (String) objArr[1];
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                Intrinsics.checkNotNullParameter(str, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(new SearchBundlesEvent.OnSearchInput(str));
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 1;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit equals(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = component2 + 15;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(SearchBundlesEvent.OnDialogDismissed.INSTANCE);
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 35;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                }
                return unit;
            }

            private static final Unit getRequestBeneficiariesState(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = component2 + 101;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(SearchBundlesEvent.OnClearAll.INSTANCE);
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 89;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component4(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                    SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(SearchBundlesEvent.OnApply.INSTANCE);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(SearchBundlesEvent.OnApply.INSTANCE);
                Unit unit2 = Unit.INSTANCE;
                int i3 = copydefault + 75;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit copy(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 81;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                SfcSearchBundlesActivity.access$getSearchBundlesViewModel(sfcSearchBundlesActivity).onEvent(SearchBundlesEvent.OnShowDialog.INSTANCE);
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 27;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class C02634 extends FunctionReferenceImpl implements Function1<Bundle, Unit> {
                private static int component3 = 1;
                private static int copydefault;

                public final void component1(Bundle bundle) {
                    int i = 2 % 2;
                    int i2 = component3 + 119;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(bundle, "");
                        SfcSearchBundlesActivity.access$onSelectBundle((SfcSearchBundlesActivity) this.receiver, bundle);
                    } else {
                        Intrinsics.checkNotNullParameter(bundle, "");
                        SfcSearchBundlesActivity.access$onSelectBundle((SfcSearchBundlesActivity) this.receiver, bundle);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                @Override
                public Unit invoke(Bundle bundle) {
                    int i = 2 % 2;
                    int i2 = copydefault + 19;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    component1(bundle);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        throw null;
                    }
                    int i4 = copydefault + 57;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 7 / 0;
                    }
                    return unit;
                }

                C02634(Object obj) {
                    super(1, obj, SfcSearchBundlesActivity.class, "onSelectBundle", "onSelectBundle(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;)V", 0);
                }
            }

            private static final Unit getAsAtTimestamp(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 69;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                    sfcSearchBundlesActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
                sfcSearchBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = component2 + 65;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopy = copy(sfcSearchBundlesActivity);
                int i4 = copydefault + 65;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 25 / 0;
                }
                return unitCopy;
            }

            public static Unit component2(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent4 = component4(sfcSearchBundlesActivity);
                if (i3 == 0) {
                    int i4 = 85 / 0;
                }
                return unitComponent4;
            }

            public static Unit component1(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit requestBeneficiariesState = getRequestBeneficiariesState(sfcSearchBundlesActivity);
                int i4 = component2 + 31;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return requestBeneficiariesState;
                }
                throw null;
            }

            public static Unit copydefault(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = component2 + 111;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    getAsAtTimestamp(sfcSearchBundlesActivity);
                    throw null;
                }
                Unit asAtTimestamp = getAsAtTimestamp(sfcSearchBundlesActivity);
                int i3 = component2 + 101;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return asAtTimestamp;
            }

            public static Unit ShareDataUIState(SfcSearchBundlesActivity sfcSearchBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 109;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return equals(sfcSearchBundlesActivity);
                }
                equals(sfcSearchBundlesActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(SfcSearchBundlesActivity sfcSearchBundlesActivity, ISortFilterType iSortFilterType) {
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent23 = ViewAllFavoritesScreenKt.copydefault.component2();
                return (Unit) component1(-231362561, ViewAllFavoritesScreenKt.copydefault.component2(), new Object[]{sfcSearchBundlesActivity, iSortFilterType}, iComponent22, 231362563, iComponent23, iComponent2);
            }

            public static Unit component2(SfcSearchBundlesActivity sfcSearchBundlesActivity, ISortFilterType iSortFilterType) {
                int i = 2 % 2;
                int i2 = copydefault + 55;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(sfcSearchBundlesActivity, iSortFilterType);
                int i4 = copydefault + 117;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 77 / 0;
                }
                return unitComponent1;
            }

            public static Unit ShareDataUIState(SfcSearchBundlesActivity sfcSearchBundlesActivity, String str) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent23 = ViewAllFavoritesScreenKt.copydefault.component2();
                Unit unit = (Unit) component1(1156879957, ViewAllFavoritesScreenKt.copydefault.component2(), new Object[]{sfcSearchBundlesActivity, str}, iComponent22, -1156879957, iComponent23, iComponent2);
                int i4 = copydefault + 47;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            AnonymousClass4(SfcSearchBundlesActivity sfcSearchBundlesActivity, State<SearchBundlesUIState> state, State<Boolean> state2) {
                this.ShareDataUIState = sfcSearchBundlesActivity;
                this.component1 = state;
                this.component3 = state2;
            }

            private static final Unit component2(SfcSearchBundlesActivity sfcSearchBundlesActivity, String str) {
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent23 = ViewAllFavoritesScreenKt.copydefault.component2();
                return (Unit) component1(1156879957, ViewAllFavoritesScreenKt.copydefault.component2(), new Object[]{sfcSearchBundlesActivity, str}, iComponent22, -1156879957, iComponent23, iComponent2);
            }

            public final void component2(Composer composer, int i) {
                Object[] objArr = {this, composer, Integer.valueOf(i)};
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                component1(-827678633, ViewAllFavoritesScreenKt.copydefault.component2(), objArr, ViewAllFavoritesScreenKt.copydefault.component2(), 827678634, ViewAllFavoritesScreenKt.copydefault.component2(), iComponent2);
            }

            private static Object component3(Object[] objArr) {
                SfcSearchBundlesActivity sfcSearchBundlesActivity = (SfcSearchBundlesActivity) objArr[0];
                ISortFilterType iSortFilterType = (ISortFilterType) objArr[1];
                int i = 2 % 2;
                int i2 = copydefault + 99;
                component2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    ShareDataUIState(sfcSearchBundlesActivity, iSortFilterType);
                    obj.hashCode();
                    throw null;
                }
                Unit unitShareDataUIState = ShareDataUIState(sfcSearchBundlesActivity, iSortFilterType);
                int i3 = copydefault + 73;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitShareDataUIState;
                }
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void ShareDataUIState(androidx.compose.runtime.Composer r14, int r15) {
            /*
                r13 = this;
                r0 = 2
                int r1 = r0 % r0
                r15 = r15 & 11
                r1 = 0
                if (r15 != r0) goto L22
                int r15 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.copydefault
                int r15 = r15 + 123
                int r2 = r15 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.component2 = r2
                int r15 = r15 % r0
                if (r15 != 0) goto L1e
                boolean r15 = r14.getSkipping()
                if (r15 != 0) goto L1a
                goto L22
            L1a:
                r14.skipToGroupEnd()
                goto L75
            L1e:
                r14.getSkipping()
                throw r1
            L22:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity r15 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesViewModel r15 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.access$getSearchBundlesViewModel(r15)
                kotlinx.coroutines.flow.MutableStateFlow r15 = r15.getSearchBundlesState()
                r2 = r15
                kotlinx.coroutines.flow.StateFlow r2 = (kotlinx.coroutines.flow.StateFlow) r2
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 8
                r8 = 7
                r6 = r14
                androidx.compose.runtime.State r15 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r2, r3, r4, r5, r6, r7, r8)
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesViewModel r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.access$getSearchBundlesViewModel(r2)
                kotlinx.coroutines.flow.StateFlow r3 = r2.isLoading()
                r6 = 0
                r8 = 8
                r9 = 7
                r7 = r14
                androidx.compose.runtime.State r2 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r3, r4, r5, r6, r7, r8, r9)
                r3 = 0
                r7 = 0
                r8 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$component2$4 r9 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity$component2$4
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity r10 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.this
                r9.<init>(r10, r15, r2)
                r15 = 54
                r2 = -743697272(0xffffffffd3ac1488, float:-1.4781577E12)
                r10 = 1
                androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r2, r10, r9, r14, r15)
                r9 = r15
                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                r11 = 1572864(0x180000, float:2.204052E-39)
                r12 = 63
                r10 = r14
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                int r14 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.component2
                int r14 = r14 + 51
                int r15 = r14 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.copydefault = r15
                int r14 = r14 % r0
            L75:
                int r14 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.copydefault
                int r14 = r14 + 99
                int r15 = r14 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.component2 = r15
                int r14 = r14 % r0
                if (r14 != 0) goto L81
                return
            L81:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.component2.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
        }

        private static final SearchBundlesUIState component1(State<SearchBundlesUIState> state) {
            int i = 2 % 2;
            int i2 = component2 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SearchBundlesUIState value = state.getValue();
            if (i3 == 0) {
                throw null;
            }
            int i4 = component2 + 89;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final boolean component3(State<Boolean> state) {
            int i = 2 % 2;
            int i2 = copydefault + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = state.getValue().booleanValue();
            int i4 = component2 + 89;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return zBooleanValue;
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
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3267 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 60267), -834797019, false, $$n((byte) ($$m & 119), b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() % (equals & 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$n((byte) 14, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16780482, Color.rgb(0, 0, 0) + 16777249, (char) (60267 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -834797019, false, $$n((byte) ($$m & 119), b4, b4), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (equals ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 686, Color.red(0) + 34, (char) (60373 - (ViewConfiguration.getEdgeSlop() >> 16)), -1969106284, false, $$n((byte) 14, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i8 = $11 + 21;
        $10 = i8 % 128;
        while (true) {
            int i9 = i8 % 2;
            if (notifyVar.copydefault >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i10 = $10 + 13;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(686 - ((byte) KeyEvent.getModifierMetaStateMask()), Drawable.resolveOpacity(0, 0) + 34, (char) (TextUtils.getCapsMode("", 0, 0) + 60373), -1969106284, false, $$n((byte) 14, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i8 = $10 + 93;
            $11 = i8 % 128;
        }
    }

    private static void j(byte[] bArr, int i, int[] iArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        long j = 0;
        int i5 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 17;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(cArr3[i6]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i5;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3761 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), 23 - TextUtils.lastIndexOf("", '0', i5, i5), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1670574543, false, $$n((byte) 51, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i6 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3759, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (char) (ViewConfiguration.getEdgeSlop() >> 16), -1670574543, false, $$n((byte) 51, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                j = 0;
                i5 = 0;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7141, (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, (char) Color.alpha(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i8 = 46;
        int i9 = 689978476;
        if (component1) {
            int i10 = $10 + 11;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                i2 = 0;
            } else {
                i2 = 0;
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
            }
            cancelVar.component3 = i2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2747 - ExpandableListView.getPackedPositionChild(0L), 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (7644 - (ViewConfiguration.getTapTimeout() >> 16)), -327556343, false, $$n((byte) 46, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (component2) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9);
                if (objCopydefault5 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.lastIndexOf("", '0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, (char) (7643 - MotionEvent.axisFromString("")), -327556343, false, $$n((byte) i8, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                i8 = 46;
                i9 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i11;
            if (cancelVar.component3 >= cancelVar.component1) {
                String str = new String(cArr6);
                int i12 = $11 + 111;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                objArr[0] = str;
                return;
            }
            int i14 = $10 + 73;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[cancelVar.component1 / cancelVar.component3] % i] * iIntValue);
                i11 = cancelVar.component3;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i11 = cancelVar.component3 + 1;
            }
        }
    }

    private static void f(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        long j = 0;
        int i6 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                if (i8 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16784638, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> i6) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 7422, ExpandableListView.getPackedPositionType(0L) + 15, (char) (ExpandableListView.getPackedPositionChild(0L) + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i4 = 2;
                i6 = 8;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component4)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - TextUtils.getOffsetBefore("", 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 64290), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $10;
            int i10 = i9 + 25;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            i3 = i - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
            int i12 = i9 + 25;
            $11 = i12 % 128;
            i2 = 2;
            int i13 = i12 % 2;
        } else {
            i2 = 2;
            i3 = i;
        }
        if (i3 > 1) {
            int i14 = $11 + 91;
            $10 = i14 % 128;
            int i15 = i14 % i2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i3) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7117 - View.combineMeasuredStates(0, 0), 15 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) (44463 - KeyEvent.getDeadChar(0, 0)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2944, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, (char) (27638 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 794909189, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i16];
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[i17];
                        cArr4[cancelall.component2 + 1] = cArr2[i18];
                    } else {
                        int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr2[i19];
                        cArr4[cancelall.component2 + 1] = cArr2[i20];
                    }
                }
                cancelall.component2 += 2;
                j = 0;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x2302  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x2303  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01cd  */
    /* JADX WARN: Type inference failed for: r3v330, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void fetchData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        getSearchBundlesViewModel().toggleLoading(true);
        BuyBundleViewModel buyBundleViewModel = getBuyBundleViewModel();
        buyBundleViewModel.queryTunukiwaList();
        buyBundleViewModel.getExpiryBundlesCatalog();
        int i4 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit initObservers$lambda$1(SfcSearchBundlesActivity sfcSearchBundlesActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
        if (resource.error()) {
            int i2 = getAsAtTimestamp + 109;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            sfcSearchBundlesActivity.getSearchBundlesViewModel().toggleLoading(false);
            ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
        }
        if (resource.success()) {
            int i4 = getRequestBeneficiariesState + 93;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            sfcSearchBundlesActivity.getSearchBundlesViewModel().toggleLoading(false);
            TunukiwaOfferResp tunukiwaOfferResp = (TunukiwaOfferResp) ((HaProxyResponse) resource.getData()).getBody();
            sfcSearchBundlesActivity.getSearchBundlesViewModel().updateSpecialOffers(tunukiwaOfferResp != null ? tunukiwaOfferResp : CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }

    private final void initObservers() {
        int i = 2 % 2;
        SfcSearchBundlesActivity sfcSearchBundlesActivity = this;
        getBuyBundleViewModel().getTunukiwaData().observe(sfcSearchBundlesActivity, new component3(new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$DTEbdKRL4XQzfitjlqT2t4G26eU = SfcSearchBundlesActivity.$r8$lambda$DTEbdKRL4XQzfitjlqT2t4G26eU(this.f$0, (Resource) obj);
                int i5 = component1 + 85;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit$r8$lambda$DTEbdKRL4XQzfitjlqT2t4G26eU;
                }
                throw null;
            }
        }));
        getBuyBundleViewModel().getOtherBundlesData().observe(sfcSearchBundlesActivity, new component3(new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 113;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SfcSearchBundlesActivity sfcSearchBundlesActivity2 = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 == 0) {
                    return SfcSearchBundlesActivity.$r8$lambda$Jq9WdjGGHWltA5dPStkQ5FA55Fg(sfcSearchBundlesActivity2, resource);
                }
                Unit unit$r8$lambda$Jq9WdjGGHWltA5dPStkQ5FA55Fg = SfcSearchBundlesActivity.$r8$lambda$Jq9WdjGGHWltA5dPStkQ5FA55Fg(sfcSearchBundlesActivity2, resource);
                int i5 = 60 / 0;
                return unit$r8$lambda$Jq9WdjGGHWltA5dPStkQ5FA55Fg;
            }
        }));
        int i2 = getRequestBeneficiariesState + 21;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObservers$lambda$3(SfcSearchBundlesActivity sfcSearchBundlesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcSearchBundlesActivity, "");
        if (resource.error()) {
            int i4 = getAsAtTimestamp + 113;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
            int i6 = getRequestBeneficiariesState + 45;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
        }
        if (resource.success()) {
            int i8 = getAsAtTimestamp + 115;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            List<Plans> list = (List) resource.getData();
            if (list != null) {
                sfcSearchBundlesActivity.getSearchBundlesViewModel().updateWithExpiryBundles(list);
            }
        }
        return Unit.INSTANCE;
    }

    private final void onSelectBundle(Bundle bundle) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String validityString = getValidityString(bundle.getName(), bundle.getPackageName());
        String name = bundle.getName();
        float fFloatValue = bundle.getAmount().floatValue();
        String id = bundle.getId();
        String productTypeStr = bundle.getProductTypeStr();
        if (productTypeStr == null) {
            int i4 = getRequestBeneficiariesState + 29;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = productTypeStr;
        }
        String bundleTypeStr = bundle.getBundleTypeStr();
        if (bundleTypeStr == null) {
            int i6 = getRequestBeneficiariesState + 71;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            str2 = "";
        } else {
            str2 = bundleTypeStr;
        }
        WithExpiryResp withExpiryResp = new WithExpiryResp(name, String.valueOf(fFloatValue), null, false, false, id, validityString, null, str, str2, null, null, null, bundle.getName(), 0, null, 56476, null);
        android.os.Bundle bundle2 = new android.os.Bundle(1);
        bundle2.putSerializable("withExpiryResp", withExpiryResp);
        RouteUtils.routeWithExecute(RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
    }

    private final String getValidityString(String productName, String packageName) {
        int i = 2 % 2;
        String lowerCase = (productName + " " + packageName).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String str = lowerCase;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "monthly", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "30 day", false, 2, (Object) null)) {
            int i2 = getAsAtTimestamp + 51;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0 ? !StringsKt.contains$default((CharSequence) str, (CharSequence) str, false, 2, (Object) null) : !StringsKt.contains$default((CharSequence) str, (CharSequence) str, false, 5, (Object) null)) {
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "weekly", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "7 day", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "7day", false, 2, (Object) null)) {
                    int i3 = getAsAtTimestamp + 25;
                    getRequestBeneficiariesState = i3 % 128;
                    int i4 = i3 % 2;
                    return Keys.WITH_EXPIRY_CATEGORY_WEEKLY;
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "midnight", false, 2, (Object) null)) {
                    return "Midnight";
                }
                if ((!StringsKt.contains$default((CharSequence) str, (CharSequence) "daily", false, 2, (Object) null)) && (!StringsKt.contains$default((CharSequence) str, (CharSequence) "24 hour", false, 2, (Object) null))) {
                    int i5 = getAsAtTimestamp + 59;
                    getRequestBeneficiariesState = i5 % 128;
                    if (i5 % 2 == 0 ? !StringsKt.contains$default((CharSequence) str, (CharSequence) "one-off", false, 2, (Object) null) : !StringsKt.contains$default((CharSequence) str, (CharSequence) "one-off", false, 5, (Object) null)) {
                        return (StringsKt.contains$default((CharSequence) str, (CharSequence) "hourly", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "hrs", false, 2, (Object) null)) ? "Hourly" : "Other";
                    }
                }
                return Keys.WITH_EXPIRY_CATEGORY_DAILY;
            }
        }
        return Keys.WITH_EXPIRY_CATEGORY_MONTHLY;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 14388, new char[]{22748, 24692, 10647, 61754, 47694, 17303, 2867, 54274, 40420, 42258, 28235, 14270, 65320, 47269, 16875, 2333, 53947, 39875, 41847, 27809, 13797, 64870, 34453, 20441, 6004, 53398}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(Color.alpha(0) + 18, new char[]{'\'', '$', 13866, 13866, 16, 31, 25, 3, 13868, 13868, 18, 30, '$', 17, 25, 31, AbstractJsonLexerKt.COMMA, 29}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 65), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getRequestBeneficiariesState + 3;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = getAsAtTimestamp + 43;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6618, 42 - TextUtils.getOffsetAfter("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 56, (char) Color.green(0), -960739708, false, "component3", new Class[]{Context.class});
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
    /* JADX WARN: Removed duplicated region for block: B:128:0x08b8 A[Catch: all -> 0x0459, TryCatch #21 {all -> 0x0459, blocks: (B:304:0x11a7, B:306:0x11ad, B:307:0x11db, B:705:0x3290, B:707:0x3296, B:708:0x32bf, B:742:0x35da, B:744:0x35e0, B:745:0x3605, B:722:0x3417, B:724:0x343a, B:725:0x348f, B:671:0x2f50, B:673:0x2f56, B:674:0x2f7f, B:570:0x2863, B:572:0x2869, B:573:0x2898, B:575:0x28d2, B:576:0x2919, B:541:0x24c3, B:543:0x24d8, B:544:0x2507, B:546:0x253b, B:547:0x25bc, B:519:0x2145, B:521:0x214b, B:522:0x2177, B:524:0x21b1, B:525:0x21fd, B:493:0x1eae, B:495:0x1ec3, B:496:0x1efa, B:477:0x1c90, B:479:0x1c96, B:480:0x1cc4, B:391:0x1738, B:393:0x173e, B:394:0x176b, B:172:0x0b06, B:174:0x0b0c, B:175:0x0b36, B:126:0x08b2, B:128:0x08b8, B:129:0x08e2, B:23:0x024f, B:25:0x0255, B:26:0x0285, B:28:0x03c7, B:30:0x03f8, B:31:0x0453), top: B:808:0x024f }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x09a8 A[Catch: all -> 0x0a73, TryCatch #30 {all -> 0x0a73, blocks: (B:147:0x0993, B:149:0x09a8, B:150:0x09db), top: B:826:0x0993, outer: #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09ee A[Catch: all -> 0x0a69, TryCatch #26 {all -> 0x0a69, blocks: (B:151:0x09e1, B:153:0x09ee, B:154:0x0a61), top: B:818:0x09e1, outer: #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c1a A[Catch: all -> 0x1142, PHI: r2
  0x0c1a: PHI (r2v652 java.lang.Object) = (r2v651 java.lang.Object), (r2v717 java.lang.Object) binds: [B:180:0x0bc8, B:182:0x0bcb] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x1142, blocks: (B:179:0x0bc4, B:186:0x0c1a), top: B:796:0x0bc4 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ff8 A[Catch: all -> 0x1120, TryCatch #0 {all -> 0x1120, blocks: (B:247:0x0fee, B:248:0x0ff2, B:250:0x0ff8, B:253:0x1012, B:256:0x101e, B:258:0x1021, B:270:0x110e, B:272:0x1114, B:273:0x1115, B:275:0x1117, B:277:0x111e, B:278:0x111f, B:239:0x0f1e, B:241:0x0f3b, B:243:0x0f87, B:245:0x0f9e, B:246:0x0fe6, B:283:0x1126, B:285:0x112c, B:286:0x112d, B:289:0x1132, B:291:0x1138, B:292:0x1139, B:266:0x108b, B:261:0x104f, B:263:0x1055, B:264:0x1083), top: B:771:0x0cab, inners: #42, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x11ad A[Catch: all -> 0x0459, TryCatch #21 {all -> 0x0459, blocks: (B:304:0x11a7, B:306:0x11ad, B:307:0x11db, B:705:0x3290, B:707:0x3296, B:708:0x32bf, B:742:0x35da, B:744:0x35e0, B:745:0x3605, B:722:0x3417, B:724:0x343a, B:725:0x348f, B:671:0x2f50, B:673:0x2f56, B:674:0x2f7f, B:570:0x2863, B:572:0x2869, B:573:0x2898, B:575:0x28d2, B:576:0x2919, B:541:0x24c3, B:543:0x24d8, B:544:0x2507, B:546:0x253b, B:547:0x25bc, B:519:0x2145, B:521:0x214b, B:522:0x2177, B:524:0x21b1, B:525:0x21fd, B:493:0x1eae, B:495:0x1ec3, B:496:0x1efa, B:477:0x1c90, B:479:0x1c96, B:480:0x1cc4, B:391:0x1738, B:393:0x173e, B:394:0x176b, B:172:0x0b06, B:174:0x0b0c, B:175:0x0b36, B:126:0x08b2, B:128:0x08b8, B:129:0x08e2, B:23:0x024f, B:25:0x0255, B:26:0x0285, B:28:0x03c7, B:30:0x03f8, B:31:0x0453), top: B:808:0x024f }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1263 A[Catch: all -> 0x1683, TryCatch #39 {all -> 0x1683, blocks: (B:311:0x125d, B:313:0x1263, B:314:0x12ac, B:316:0x12b9, B:318:0x12c2, B:319:0x1303, B:342:0x152c, B:343:0x1530, B:346:0x1540, B:349:0x1558, B:352:0x156e, B:354:0x1571, B:366:0x165d, B:368:0x1663, B:369:0x1664, B:371:0x1666, B:373:0x166d, B:374:0x166e, B:320:0x130e, B:332:0x1409, B:334:0x140f, B:335:0x1451, B:337:0x147b, B:338:0x14c6, B:340:0x14dc, B:341:0x1526, B:376:0x1670, B:378:0x1677, B:379:0x1678, B:381:0x167a, B:383:0x1681, B:384:0x1682, B:362:0x15e0, B:357:0x159d, B:359:0x15a3, B:360:0x15ce, B:327:0x1379, B:329:0x138e, B:330:0x13fd, B:322:0x132e, B:324:0x1343, B:325:0x1372), top: B:844:0x125d, outer: #10, inners: #22, #24, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x12b9 A[Catch: all -> 0x1683, TryCatch #39 {all -> 0x1683, blocks: (B:311:0x125d, B:313:0x1263, B:314:0x12ac, B:316:0x12b9, B:318:0x12c2, B:319:0x1303, B:342:0x152c, B:343:0x1530, B:346:0x1540, B:349:0x1558, B:352:0x156e, B:354:0x1571, B:366:0x165d, B:368:0x1663, B:369:0x1664, B:371:0x1666, B:373:0x166d, B:374:0x166e, B:320:0x130e, B:332:0x1409, B:334:0x140f, B:335:0x1451, B:337:0x147b, B:338:0x14c6, B:340:0x14dc, B:341:0x1526, B:376:0x1670, B:378:0x1677, B:379:0x1678, B:381:0x167a, B:383:0x1681, B:384:0x1682, B:362:0x15e0, B:357:0x159d, B:359:0x15a3, B:360:0x15ce, B:327:0x1379, B:329:0x138e, B:330:0x13fd, B:322:0x132e, B:324:0x1343, B:325:0x1372), top: B:844:0x125d, outer: #10, inners: #22, #24, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x130e A[Catch: all -> 0x1683, TRY_LEAVE, TryCatch #39 {all -> 0x1683, blocks: (B:311:0x125d, B:313:0x1263, B:314:0x12ac, B:316:0x12b9, B:318:0x12c2, B:319:0x1303, B:342:0x152c, B:343:0x1530, B:346:0x1540, B:349:0x1558, B:352:0x156e, B:354:0x1571, B:366:0x165d, B:368:0x1663, B:369:0x1664, B:371:0x1666, B:373:0x166d, B:374:0x166e, B:320:0x130e, B:332:0x1409, B:334:0x140f, B:335:0x1451, B:337:0x147b, B:338:0x14c6, B:340:0x14dc, B:341:0x1526, B:376:0x1670, B:378:0x1677, B:379:0x1678, B:381:0x167a, B:383:0x1681, B:384:0x1682, B:362:0x15e0, B:357:0x159d, B:359:0x15a3, B:360:0x15ce, B:327:0x1379, B:329:0x138e, B:330:0x13fd, B:322:0x132e, B:324:0x1343, B:325:0x1372), top: B:844:0x125d, outer: #10, inners: #22, #24, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1536  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x17fc A[Catch: all -> 0x1c0e, TryCatch #46 {all -> 0x1c0e, blocks: (B:398:0x17f6, B:400:0x17fc, B:401:0x183f, B:403:0x184c, B:405:0x1855, B:406:0x189e, B:429:0x1ad7, B:430:0x1adb, B:432:0x1ae1, B:435:0x1af8, B:438:0x1b05, B:440:0x1b08, B:452:0x1be8, B:454:0x1bee, B:455:0x1bef, B:457:0x1bf1, B:459:0x1bf8, B:460:0x1bf9, B:407:0x18a9, B:419:0x19b7, B:421:0x19bd, B:422:0x1a03, B:424:0x1a2d, B:425:0x1a72, B:427:0x1a88, B:428:0x1ad1, B:462:0x1bfb, B:464:0x1c02, B:465:0x1c03, B:467:0x1c05, B:469:0x1c0c, B:470:0x1c0d, B:448:0x1b6b, B:443:0x1b34, B:445:0x1b3a, B:446:0x1b63, B:414:0x1918, B:416:0x1934, B:417:0x19ab, B:409:0x18c9, B:411:0x18de, B:412:0x1911), top: B:855:0x17f6, outer: #10, inners: #25, #29, #35, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x184c A[Catch: all -> 0x1c0e, TryCatch #46 {all -> 0x1c0e, blocks: (B:398:0x17f6, B:400:0x17fc, B:401:0x183f, B:403:0x184c, B:405:0x1855, B:406:0x189e, B:429:0x1ad7, B:430:0x1adb, B:432:0x1ae1, B:435:0x1af8, B:438:0x1b05, B:440:0x1b08, B:452:0x1be8, B:454:0x1bee, B:455:0x1bef, B:457:0x1bf1, B:459:0x1bf8, B:460:0x1bf9, B:407:0x18a9, B:419:0x19b7, B:421:0x19bd, B:422:0x1a03, B:424:0x1a2d, B:425:0x1a72, B:427:0x1a88, B:428:0x1ad1, B:462:0x1bfb, B:464:0x1c02, B:465:0x1c03, B:467:0x1c05, B:469:0x1c0c, B:470:0x1c0d, B:448:0x1b6b, B:443:0x1b34, B:445:0x1b3a, B:446:0x1b63, B:414:0x1918, B:416:0x1934, B:417:0x19ab, B:409:0x18c9, B:411:0x18de, B:412:0x1911), top: B:855:0x17f6, outer: #10, inners: #25, #29, #35, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x18a9 A[Catch: all -> 0x1c0e, TRY_LEAVE, TryCatch #46 {all -> 0x1c0e, blocks: (B:398:0x17f6, B:400:0x17fc, B:401:0x183f, B:403:0x184c, B:405:0x1855, B:406:0x189e, B:429:0x1ad7, B:430:0x1adb, B:432:0x1ae1, B:435:0x1af8, B:438:0x1b05, B:440:0x1b08, B:452:0x1be8, B:454:0x1bee, B:455:0x1bef, B:457:0x1bf1, B:459:0x1bf8, B:460:0x1bf9, B:407:0x18a9, B:419:0x19b7, B:421:0x19bd, B:422:0x1a03, B:424:0x1a2d, B:425:0x1a72, B:427:0x1a88, B:428:0x1ad1, B:462:0x1bfb, B:464:0x1c02, B:465:0x1c03, B:467:0x1c05, B:469:0x1c0c, B:470:0x1c0d, B:448:0x1b6b, B:443:0x1b34, B:445:0x1b3a, B:446:0x1b63, B:414:0x1918, B:416:0x1934, B:417:0x19ab, B:409:0x18c9, B:411:0x18de, B:412:0x1911), top: B:855:0x17f6, outer: #10, inners: #25, #29, #35, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1ae1 A[Catch: all -> 0x1c0e, TryCatch #46 {all -> 0x1c0e, blocks: (B:398:0x17f6, B:400:0x17fc, B:401:0x183f, B:403:0x184c, B:405:0x1855, B:406:0x189e, B:429:0x1ad7, B:430:0x1adb, B:432:0x1ae1, B:435:0x1af8, B:438:0x1b05, B:440:0x1b08, B:452:0x1be8, B:454:0x1bee, B:455:0x1bef, B:457:0x1bf1, B:459:0x1bf8, B:460:0x1bf9, B:407:0x18a9, B:419:0x19b7, B:421:0x19bd, B:422:0x1a03, B:424:0x1a2d, B:425:0x1a72, B:427:0x1a88, B:428:0x1ad1, B:462:0x1bfb, B:464:0x1c02, B:465:0x1c03, B:467:0x1c05, B:469:0x1c0c, B:470:0x1c0d, B:448:0x1b6b, B:443:0x1b34, B:445:0x1b3a, B:446:0x1b63, B:414:0x1918, B:416:0x1934, B:417:0x19ab, B:409:0x18c9, B:411:0x18de, B:412:0x1911), top: B:855:0x17f6, outer: #10, inners: #25, #29, #35, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1d53  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1da8  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x1e8e  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x203d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x2104  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x2310  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x2371  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x23d0  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x24a5  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x2709  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x2824  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x2a0c A[Catch: all -> 0x2eab, TryCatch #6 {all -> 0x2eab, blocks: (B:579:0x2a06, B:581:0x2a0c, B:582:0x2a51, B:584:0x2a78, B:585:0x2ac7, B:587:0x2add, B:589:0x2ae6, B:590:0x2b2a, B:623:0x2d6e, B:624:0x2d72, B:626:0x2d78, B:629:0x2d90, B:632:0x2d9d, B:634:0x2da0, B:646:0x2e85, B:648:0x2e8b, B:649:0x2e8c, B:651:0x2e8e, B:653:0x2e95, B:654:0x2e96, B:593:0x2b39, B:595:0x2b3d, B:599:0x2b49, B:601:0x2b4f, B:613:0x2c59, B:615:0x2c5f, B:616:0x2ca1, B:618:0x2ccb, B:619:0x2d10, B:621:0x2d26, B:622:0x2d68, B:656:0x2e98, B:658:0x2e9f, B:659:0x2ea0, B:661:0x2ea2, B:663:0x2ea9, B:664:0x2eaa, B:603:0x2b6f, B:605:0x2b84, B:606:0x2bb7, B:642:0x2e04, B:637:0x2dcc, B:639:0x2dd2, B:640:0x2dfc, B:608:0x2bbe, B:610:0x2bdd, B:611:0x2c4d), top: B:782:0x2a06, outer: #10, inners: #2, #38, #43, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:584:0x2a78 A[Catch: all -> 0x2eab, TryCatch #6 {all -> 0x2eab, blocks: (B:579:0x2a06, B:581:0x2a0c, B:582:0x2a51, B:584:0x2a78, B:585:0x2ac7, B:587:0x2add, B:589:0x2ae6, B:590:0x2b2a, B:623:0x2d6e, B:624:0x2d72, B:626:0x2d78, B:629:0x2d90, B:632:0x2d9d, B:634:0x2da0, B:646:0x2e85, B:648:0x2e8b, B:649:0x2e8c, B:651:0x2e8e, B:653:0x2e95, B:654:0x2e96, B:593:0x2b39, B:595:0x2b3d, B:599:0x2b49, B:601:0x2b4f, B:613:0x2c59, B:615:0x2c5f, B:616:0x2ca1, B:618:0x2ccb, B:619:0x2d10, B:621:0x2d26, B:622:0x2d68, B:656:0x2e98, B:658:0x2e9f, B:659:0x2ea0, B:661:0x2ea2, B:663:0x2ea9, B:664:0x2eaa, B:603:0x2b6f, B:605:0x2b84, B:606:0x2bb7, B:642:0x2e04, B:637:0x2dcc, B:639:0x2dd2, B:640:0x2dfc, B:608:0x2bbe, B:610:0x2bdd, B:611:0x2c4d), top: B:782:0x2a06, outer: #10, inners: #2, #38, #43, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x2add A[Catch: all -> 0x2eab, TryCatch #6 {all -> 0x2eab, blocks: (B:579:0x2a06, B:581:0x2a0c, B:582:0x2a51, B:584:0x2a78, B:585:0x2ac7, B:587:0x2add, B:589:0x2ae6, B:590:0x2b2a, B:623:0x2d6e, B:624:0x2d72, B:626:0x2d78, B:629:0x2d90, B:632:0x2d9d, B:634:0x2da0, B:646:0x2e85, B:648:0x2e8b, B:649:0x2e8c, B:651:0x2e8e, B:653:0x2e95, B:654:0x2e96, B:593:0x2b39, B:595:0x2b3d, B:599:0x2b49, B:601:0x2b4f, B:613:0x2c59, B:615:0x2c5f, B:616:0x2ca1, B:618:0x2ccb, B:619:0x2d10, B:621:0x2d26, B:622:0x2d68, B:656:0x2e98, B:658:0x2e9f, B:659:0x2ea0, B:661:0x2ea2, B:663:0x2ea9, B:664:0x2eaa, B:603:0x2b6f, B:605:0x2b84, B:606:0x2bb7, B:642:0x2e04, B:637:0x2dcc, B:639:0x2dd2, B:640:0x2dfc, B:608:0x2bbe, B:610:0x2bdd, B:611:0x2c4d), top: B:782:0x2a06, outer: #10, inners: #2, #38, #43, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x057f A[Catch: all -> 0x0848, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x0848, blocks: (B:36:0x0467, B:42:0x04b8, B:58:0x057f), top: B:802:0x0467 }] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x2b35  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x2d78 A[Catch: all -> 0x2eab, TryCatch #6 {all -> 0x2eab, blocks: (B:579:0x2a06, B:581:0x2a0c, B:582:0x2a51, B:584:0x2a78, B:585:0x2ac7, B:587:0x2add, B:589:0x2ae6, B:590:0x2b2a, B:623:0x2d6e, B:624:0x2d72, B:626:0x2d78, B:629:0x2d90, B:632:0x2d9d, B:634:0x2da0, B:646:0x2e85, B:648:0x2e8b, B:649:0x2e8c, B:651:0x2e8e, B:653:0x2e95, B:654:0x2e96, B:593:0x2b39, B:595:0x2b3d, B:599:0x2b49, B:601:0x2b4f, B:613:0x2c59, B:615:0x2c5f, B:616:0x2ca1, B:618:0x2ccb, B:619:0x2d10, B:621:0x2d26, B:622:0x2d68, B:656:0x2e98, B:658:0x2e9f, B:659:0x2ea0, B:661:0x2ea2, B:663:0x2ea9, B:664:0x2eaa, B:603:0x2b6f, B:605:0x2b84, B:606:0x2bb7, B:642:0x2e04, B:637:0x2dcc, B:639:0x2dd2, B:640:0x2dfc, B:608:0x2bbe, B:610:0x2bdd, B:611:0x2c4d), top: B:782:0x2a06, outer: #10, inners: #2, #38, #43, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x300b  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x305a  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x30bb  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x3272  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x334d  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x33a5  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x33f9  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x35bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x0c41 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:893:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v193 */
    /* JADX WARN: Type inference failed for: r11v200, types: [long] */
    /* JADX WARN: Type inference failed for: r11v201 */
    /* JADX WARN: Type inference failed for: r11v202 */
    /* JADX WARN: Type inference failed for: r11v207 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v217 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v222 */
    /* JADX WARN: Type inference failed for: r11v223 */
    /* JADX WARN: Type inference failed for: r11v224 */
    /* JADX WARN: Type inference failed for: r11v225 */
    /* JADX WARN: Type inference failed for: r11v226 */
    /* JADX WARN: Type inference failed for: r11v227 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v22 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v30 */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v208 */
    /* JADX WARN: Type inference failed for: r9v211, types: [long] */
    /* JADX WARN: Type inference failed for: r9v212 */
    /* JADX WARN: Type inference failed for: r9v213 */
    /* JADX WARN: Type inference failed for: r9v222 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v234 */
    /* JADX WARN: Type inference failed for: r9v235, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v245 */
    /* JADX WARN: Type inference failed for: r9v288 */
    /* JADX WARN: Type inference failed for: r9v289 */
    /* JADX WARN: Type inference failed for: r9v290 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSearchBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$DTEbdKRL4XQzfitjlqT2t4G26eU(SfcSearchBundlesActivity sfcSearchBundlesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObservers$lambda$1 = initObservers$lambda$1(sfcSearchBundlesActivity, resource);
        int i4 = getRequestBeneficiariesState + 71;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return unitInitObservers$lambda$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$Jq9WdjGGHWltA5dPStkQ5FA55Fg(SfcSearchBundlesActivity sfcSearchBundlesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObservers$lambda$3 = initObservers$lambda$3(sfcSearchBundlesActivity, resource);
        int i4 = getAsAtTimestamp + 35;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return unitInitObservers$lambda$3;
        }
        throw null;
    }

    static {
        hashCode = 1;
        copydefault();
        component3();
        int i = copy + 89;
        hashCode = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            component3 = new char[]{30333, 30321, 30327, 30262, 30328, 30319, 30211, 30313, 30335, 30331, 30332, 30329, 30316, 30324, 30320, 30315, 30326, 30317, 30322, 30334, 30231, 30224, 30222, 30268, 30259};
        } else {
            component3 = new char[]{30333, 30321, 30327, 30262, 30328, 30319, 30211, 30313, 30335, 30331, 30332, 30329, 30316, 30324, 30320, 30315, 30326, 30317, 30322, 30334, 30231, 30224, 30222, 30268, 30259};
        }
        ShareDataUIState = 321287904;
        component2 = true;
        component1 = true;
        int i4 = i3 + 9;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        copydefault = new char[]{2000, 2003, 2006, 1974, 1985, 2038, 2041, 1965, 2007, 2022, 2004, 2035, 1973, 1977, 1969, 2017, 2028, 2021, 2033, 1976, 2027, 1970, 2032, 1992, 2036, 2034, 2002, 1971, 2023, 1975, 2030, 2020, 2025, 2001, 1995, 2037, 1972, 1978, 2019, 2018, 1994, 1966, 2024, 2031, 1968, 1967, 1987, 2029, 2005};
        component4 = (char) 12829;
        equals = 1377618776127101079L;
    }
}
