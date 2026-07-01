package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FreshFridayBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.utils.UtilObjects;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0016²\u0006\u0018\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\u001e\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00190\u001c\u0018\u00010\u0018X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/ofa_moto/SfcOfferBundlesActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FreshFridayBundleViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FreshFridayBundleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "offerBundleViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/OfferBundleViewModel;", "getOfferBundleViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/OfferBundleViewModel;", "offerBundleViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "ConsumerSfcUI_release", "ofaMotoResource", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", "freshFridayResource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridayResp;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcOfferBundlesActivity extends Hilt_SfcOfferBundlesActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static int component3;
    private static short[] component4;
    private static int copydefault;
    private static int getAsAtTimestamp;

    private final Lazy offerBundleViewModel;

    private final Lazy viewModel;
    private static final byte[] $$l = {46, -35, 45, 111};
    private static final int $$m = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {84, -122, 19, 43, -16, -2, 59, -55, -15, -1, 3, -3, -5, -3, 47, -55, -21, 5, -17, 13, -17, SignedBytes.MAX_POWER_OF_TWO, -65, 2, -17, 0, 5, -11, 58, -63, -11, 9, TarHeader.LF_LINK, -31, -43, 9, Ascii.DC2, -28, -18, -4, Ascii.SO, -10, -2, Ascii.RS, -48, -3, -9, -5, Ascii.SI, -17, -10, -3, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -80, -2, Ascii.VT, -9, 3, TarHeader.LF_DIR, -70, 8, -6, 46, -1, -10, 5, -58, -5, -2, -16, 7, -5, -17, SignedBytes.MAX_POWER_OF_TWO, -24, -35, -21, Ascii.VT, -16, 7, -5, 20, -28, -19, Ascii.SI, -7, -1, -23, Ascii.SI, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -73, Ascii.SO, -9, 1, -21, 5, 2, -16, -2, 59, -58, -5, -18, 6, -2, -11, -9, -10, 2, -5, Ascii.VT, -12, 59, -57, -16, -2, -7, -3, -3, 5, -13, -10, -3, 65, -56, -23, -3, -4, 1, -3, -9, 65, -26, -33, -17, 3, -2, -17, 44, -55, -3, -4, 1, -3, Ascii.US, -45, 76, -4, -37, -55, 0, Ascii.VT, -17, 0, 9, -15, Ascii.NAK, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 45, -16, -2, -7, -3, -3, 5, -13, -10, 62, -16, -2, 59, -62, -17, Ascii.DLE, -26, Ascii.SO, -8, TarHeader.LF_CONTIG, -58, -9, -2, -6, -15, Ascii.SI, -15, -8, Ascii.VT, -28, 8, 4, -13, -10, 66, -57, -16, -3, -9, -6, 4, 4, -17, SignedBytes.MAX_POWER_OF_TWO, -77, Ascii.SO, -1, -24, 9, 0, -22, 69, -63, -9, -10, Ascii.VT, -17, 13, -6, -21, 7, -10, -3, 60, -60, -19, 3, 7, -21, 7, -10, -3, 60, -41, -37, Ascii.SI, -21, -6, 32, -21, -28, 81, -21};
    private static final int $$k = 113;
    private static final byte[] $$d = {107, -21, -54, -113, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 2;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r5, short r6, int r7) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.$$l
            int r7 = 116 - r7
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r0[r5]
        L25:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.$$n(byte, short, int):java.lang.String");
    }

    private static void g(byte b2, byte b3, short s, Object[] objArr) {
        int i = (b2 * 2) + 83;
        byte[] bArr = $$d;
        int i2 = 99 - b3;
        byte[] bArr2 = new byte[s + 4];
        int i3 = s + 3;
        int i4 = -1;
        if (bArr == null) {
            i = (i3 + i2) - 8;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2 + 1;
            i = (i + bArr[i6]) - 8;
            i2 = i6;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.$$j
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r9 = r9 + 4
            int r8 = 86 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-4)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.h(int, byte, short, java.lang.Object[]):void");
    }

    public static final OfferBundleViewModel access$getOfferBundleViewModel(SfcOfferBundlesActivity sfcOfferBundlesActivity) {
        int i = 2 % 2;
        int i2 = copy + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleViewModel offerBundleViewModel = sfcOfferBundlesActivity.getOfferBundleViewModel();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return offerBundleViewModel;
    }

    public static final FreshFridayBundleViewModel access$getViewModel(SfcOfferBundlesActivity sfcOfferBundlesActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
        FreshFridayBundleViewModel viewModel = sfcOfferBundlesActivity.getViewModel();
        int i4 = copy + 89;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return viewModel;
    }

    public static final void access$onBundleSelected(SfcOfferBundlesActivity sfcOfferBundlesActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        sfcOfferBundlesActivity.onBundleSelected(withExpiryResp);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 87;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public SfcOfferBundlesActivity() {
        final SfcOfferBundlesActivity sfcOfferBundlesActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FreshFridayBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcOfferBundlesActivity.getViewModelStore();
                int i4 = component2 + 33;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 57;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 99;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 77 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 37;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component3 + 57;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = component3 + 19;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    defaultViewModelProviderFactory = sfcOfferBundlesActivity.getDefaultViewModelProviderFactory();
                    int i3 = 46 / 0;
                } else {
                    defaultViewModelProviderFactory = sfcOfferBundlesActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = ShareDataUIState + 45;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 24 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$3.component3
                    int r2 = r1 + 105
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r3
                    int r2 = r2 % r0
                    r3 = 0
                    if (r2 == 0) goto L45
                    kotlin.jvm.functions.Function0 r2 = r1
                    if (r2 == 0) goto L2f
                    int r1 = r1 + 79
                    int r4 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r4
                    int r1 = r1 % r0
                    if (r1 == 0) goto L25
                    java.lang.Object r1 = r2.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L35
                    goto L2f
                L25:
                    java.lang.Object r0 = r2.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r3.hashCode()
                    throw r3
                L2f:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L35:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$3.component3
                    int r2 = r2 + 17
                    int r4 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$3.ShareDataUIState = r4
                    int r2 = r2 % r0
                    if (r2 == 0) goto L41
                    return r1
                L41:
                    r3.hashCode()
                    throw r3
                L45:
                    r3.hashCode()
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                CreationExtras creationExtrasInvoke;
                int i = 2 % 2;
                int i2 = component3 + 31;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    creationExtrasInvoke = invoke();
                    int i3 = 46 / 0;
                } else {
                    creationExtrasInvoke = invoke();
                }
                int i4 = component3 + 73;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.offerBundleViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(OfferBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 51;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    sfcOfferBundlesActivity.getViewModelStore();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = sfcOfferBundlesActivity.getViewModelStore();
                int i3 = component3 + 105;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 61;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = ShareDataUIState + 7;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 81;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 28 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 49;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    defaultViewModelProviderFactory = sfcOfferBundlesActivity.getDefaultViewModelProviderFactory();
                    int i3 = 25 / 0;
                } else {
                    defaultViewModelProviderFactory = sfcOfferBundlesActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = component3 + 111;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

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
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$6.component2
                    int r2 = r2 + 19
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$6.ShareDataUIState = r3
                    int r2 = r2 % r0
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L1e
                L18:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L1e:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$6.ShareDataUIState
                    int r2 = r2 + 3
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$6.component2 = r3
                    int r2 = r2 % r0
                    if (r2 == 0) goto L2a
                    return r1
                L2a:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity$special$$inlined$viewModels$default$6.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 65;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component2 + 31;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final FreshFridayBundleViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copy + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        FreshFridayBundleViewModel freshFridayBundleViewModel = (FreshFridayBundleViewModel) this.viewModel.getValue();
        int i4 = copy + 3;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return freshFridayBundleViewModel;
    }

    private final OfferBundleViewModel getOfferBundleViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleViewModel offerBundleViewModel = (OfferBundleViewModel) this.offerBundleViewModel.getValue();
        int i4 = getRequestBeneficiariesState + 39;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return offerBundleViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int component3 = 1;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 9;
            component3 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component2(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            component2(composer2, num2.intValue());
            Unit unit2 = Unit.INSTANCE;
            int i3 = component3 + 97;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
            }
            return unit2;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component4 = 1;
            private static int copydefault;
            final SfcOfferBundlesActivity ShareDataUIState;
            final boolean component1;
            final List<WithExpiryResp> component2;
            final List<String> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component4 + 17;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component4 + 123;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            public final void component1(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component4 + 9;
                copydefault = i3 % 128;
                if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 89) == 2) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                List<WithExpiryResp> list = this.component2;
                List<String> list2 = this.component3;
                boolean z = this.component1;
                final SfcOfferBundlesActivity sfcOfferBundlesActivity = this.ShareDataUIState;
                Function1 function1 = new Function1() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final Object invoke(Object obj) {
                        Unit unitComponent2;
                        int i4 = 2 % 2;
                        int i5 = component3 + 39;
                        ShareDataUIState = i5 % 128;
                        if (i5 % 2 == 0) {
                            unitComponent2 = SfcOfferBundlesActivity.copydefault.AnonymousClass1.component2(sfcOfferBundlesActivity, (WithExpiryResp) obj);
                            int i6 = 63 / 0;
                        } else {
                            unitComponent2 = SfcOfferBundlesActivity.copydefault.AnonymousClass1.component2(sfcOfferBundlesActivity, (WithExpiryResp) obj);
                        }
                        int i7 = component3 + 105;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        return unitComponent2;
                    }
                };
                final SfcOfferBundlesActivity sfcOfferBundlesActivity2 = this.ShareDataUIState;
                Function0 function0 = new Function0() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = copydefault + 83;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitComponent3 = SfcOfferBundlesActivity.copydefault.AnonymousClass1.component3(sfcOfferBundlesActivity2);
                        int i7 = copydefault + 59;
                        component2 = i7 % 128;
                        if (i7 % 2 != 0) {
                            return unitComponent3;
                        }
                        throw null;
                    }
                };
                final SfcOfferBundlesActivity sfcOfferBundlesActivity3 = this.ShareDataUIState;
                SfcOfferBundlesActivityKt.OfferBundlesScreen(list, list2, z, function1, function0, new Function0() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = component3 + 39;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitComponent1 = SfcOfferBundlesActivity.copydefault.AnonymousClass1.component1(sfcOfferBundlesActivity3);
                        int i7 = component3 + 55;
                        component2 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 57 / 0;
                        }
                        return unitComponent1;
                    }
                }, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m1239onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 8), WindowInsetsSides.INSTANCE.m1267getTopJoeWqyM()), composer, 0)), composer, 72, 0);
                int i4 = copydefault + 17;
                component4 = i4 % 128;
                int i5 = i4 % 2;
            }

            private static final Unit component1(SfcOfferBundlesActivity sfcOfferBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = copydefault + 13;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcOfferBundlesActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                SfcOfferBundlesActivity.access$onBundleSelected(sfcOfferBundlesActivity, withExpiryResp);
                Unit unit = Unit.INSTANCE;
                int i4 = component4 + 57;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copydefault(SfcOfferBundlesActivity sfcOfferBundlesActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component4 + 83;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcOfferBundlesActivity, "");
                    SfcOfferBundlesActivity.access$getOfferBundleViewModel(sfcOfferBundlesActivity).getOfferBundles();
                    unit = Unit.INSTANCE;
                    int i3 = 39 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(sfcOfferBundlesActivity, "");
                    SfcOfferBundlesActivity.access$getOfferBundleViewModel(sfcOfferBundlesActivity).getOfferBundles();
                    unit = Unit.INSTANCE;
                }
                int i4 = component4 + 111;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component2(SfcOfferBundlesActivity sfcOfferBundlesActivity) {
                int i = 2 % 2;
                int i2 = component4 + 49;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcOfferBundlesActivity, "");
                sfcOfferBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component4 + 125;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit component2(SfcOfferBundlesActivity sfcOfferBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = copydefault + 37;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(sfcOfferBundlesActivity, withExpiryResp);
                int i4 = component4 + 47;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent1;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(SfcOfferBundlesActivity sfcOfferBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 59;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(sfcOfferBundlesActivity);
                if (i3 == 0) {
                    int i4 = 43 / 0;
                }
                return unitCopydefault;
            }

            public static Unit component1(SfcOfferBundlesActivity sfcOfferBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 31;
                component4 = i2 % 128;
                if (i2 % 2 != 0) {
                    return component2(sfcOfferBundlesActivity);
                }
                component2(sfcOfferBundlesActivity);
                throw null;
            }

            AnonymousClass1(List<WithExpiryResp> list, List<String> list2, boolean z, SfcOfferBundlesActivity sfcOfferBundlesActivity) {
                this.component2 = list;
                this.component3 = list2;
                this.component1 = z;
                this.ShareDataUIState = sfcOfferBundlesActivity;
            }
        }

        public final void component2(Composer composer, int i) {
            List<FreshFridayResp> listEmptyList;
            HaProxyResponse<List<FreshFridayResp>> data;
            HaProxyResponse.Header header;
            Integer responseCode;
            HaProxyResponse<List<FreshFridayResp>> data2;
            Resource<HaProxyResponse<List<FreshFridayResp>>> resourceComponent2;
            int i2 = 2;
            int i3 = 2 % 2;
            int i4 = component3 + 25;
            component2 = i4 % 128;
            if (i4 % 2 == 0 ? (i & 11) == 2 : (i & 94) == 2) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(SfcOfferBundlesActivity.access$getOfferBundleViewModel(SfcOfferBundlesActivity.this).getOfaMotoBundles(), composer, 8);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(SfcOfferBundlesActivity.access$getViewModel(SfcOfferBundlesActivity.this).getFreshFridayRespBundlesData(), composer, 8);
            Object objComponent1 = component1(stateObserveAsState);
            composer.startReplaceGroup(-544898212);
            boolean zChanged = composer.changed(objComponent1);
            ArrayList arrayListRememberedValue = composer.rememberedValue();
            if (zChanged || arrayListRememberedValue == Composer.INSTANCE.getEmpty()) {
                Resource<List<OfferBundle>> resourceComponent1 = component1(stateObserveAsState);
                List<OfferBundle> data3 = resourceComponent1 != null ? resourceComponent1.getData() : null;
                if (data3 == null) {
                    int i5 = component3 + 121;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    data3 = CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : data3) {
                    OfferBundle offerBundle = (OfferBundle) obj;
                    if (offerBundle.getOfferType() == 25 || offerBundle.getOfferType() == 20) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<OfferBundle> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (OfferBundle offerBundle2 : arrayList2) {
                    WithExpiryResp withExpiryResp = new WithExpiryResp(offerBundle2.getAppOfferName(), String.valueOf(offerBundle2.getOfferPrice()), null, false, false, String.valueOf(offerBundle2.getOfferId()), "OFA Moto", null, "bundle", Keys.BUNDLE_TYPE_OFA_MOTO, null, "OFA Moto", null, null, R.drawable.ic_ofa_moto_bundle, null, 46236, null);
                    withExpiryResp.setTag(offerBundle2);
                    arrayList3.add(withExpiryResp);
                }
                arrayListRememberedValue = arrayList3;
                composer.updateRememberedValue(arrayListRememberedValue);
            }
            Object obj2 = (List) arrayListRememberedValue;
            composer.endReplaceGroup();
            Object objComponent2 = component2(stateObserveAsState2);
            composer.startReplaceGroup(-544866694);
            boolean zChanged2 = composer.changed(objComponent2);
            ArrayList arrayListRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || arrayListRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Resource<HaProxyResponse<List<FreshFridayResp>>> resourceComponent22 = component2(stateObserveAsState2);
                if (resourceComponent22 == null || (data2 = resourceComponent22.getData()) == null || (listEmptyList = data2.getBody()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Resource<HaProxyResponse<List<FreshFridayResp>>> resourceComponent23 = component2(stateObserveAsState2);
                if (resourceComponent23 != null && (data = resourceComponent23.getData()) != null && (header = data.getHeader()) != null && (responseCode = header.getResponseCode()) != null && responseCode.intValue() == 200 && !listEmptyList.isEmpty()) {
                    List<FreshFridayResp> list = listEmptyList;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (FreshFridayResp freshFridayResp : list) {
                        Date parsedDate = UtilObjects.INSTANCE.getParsedDate(freshFridayResp.getEndPeriod());
                        if (parsedDate != null) {
                            int i7 = component2 + 3;
                            component3 = i7 % 128;
                            if (i7 % i2 != 0) {
                                freshFridayResp.setExpirationDate(parsedDate);
                            } else {
                                freshFridayResp.setExpirationDate(parsedDate);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }
                        arrayList4.add(new WithExpiryResp(freshFridayResp.getProductName(), freshFridayResp.getAmount(), null, false, false, freshFridayResp.getProductId(), "Valid for 3 hours", null, "bundle", Keys.BUNDLE_TYPE_FRESH_FRIDAY, null, Keys.BUNDLE_TYPE_FRESH_FRIDAY, null, null, R.drawable.ic_fresh_friday_bundle, freshFridayResp, 13468, null));
                        i2 = 2;
                    }
                    arrayListRememberedValue2 = arrayList4;
                } else {
                    arrayListRememberedValue2 = CollectionsKt.emptyList();
                }
                composer.updateRememberedValue(arrayListRememberedValue2);
            }
            Object obj4 = (List) arrayListRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-544824730);
            boolean zChanged3 = composer.changed(obj2);
            boolean zChanged4 = composer.changed(obj4);
            Object objRememberedValue = composer.rememberedValue();
            if ((zChanged3 | zChanged4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CollectionsKt.plus((Collection) obj2, (Iterable) obj4);
                composer.updateRememberedValue(objRememberedValue);
            }
            List list2 = (List) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-544820104);
            boolean zChanged5 = composer.changed(list2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = CollectionsKt.plus((Collection) CollectionsKt.listOf("All"), (Iterable) CollectionsKt.plus((Collection) CollectionsKt.listOf("OFA Moto"), (Iterable) (!((Collection) obj4).isEmpty() ? CollectionsKt.listOf(Keys.BUNDLE_TYPE_FRESH_FRIDAY) : CollectionsKt.emptyList())));
                composer.updateRememberedValue(objRememberedValue2);
            }
            List list3 = (List) objRememberedValue2;
            composer.endReplaceGroup();
            Resource<List<OfferBundle>> resourceComponent12 = component1(stateObserveAsState);
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1556503911, true, new AnonymousClass1(list2, list3, (resourceComponent12 != null && resourceComponent12.loading()) || ((resourceComponent2 = component2(stateObserveAsState2)) != null && resourceComponent2.loading()), SfcOfferBundlesActivity.this), composer, 54), composer, 1572864, 63);
        }

        private static final Resource<List<OfferBundle>> component1(State<Resource<List<OfferBundle>>> state) {
            int i = 2 % 2;
            int i2 = component3 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<OfferBundle>> value = state.getValue();
            int i4 = component2 + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final Resource<HaProxyResponse<List<FreshFridayResp>>> component2(State<Resource<HaProxyResponse<List<FreshFridayResp>>>> state) {
            int i = 2 % 2;
            int i2 = component3 + 57;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Resource<HaProxyResponse<List<FreshFridayResp>>> value = state.getValue();
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            int i5 = component2 + 113;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return value;
        }

        copydefault() {
        }
    }

    private static void e(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $10 + 41;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 3784, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37, (char) (26860 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 2015799920, false, $$n(b2, b3, (byte) (b3 | TarHeader.LF_CHR)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - View.resolveSizeAndState(0, 0, 0), 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) KeyEvent.normalizeMetaState(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $11 + 65;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                int i10 = $11 + 45;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 << iTrustedWebActivityServiceStub.ShareDataUIState) / 0];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 7406, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    j = 0;
                } else {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    try {
                        Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault4 == null) {
                            j = 0;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 7407, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                        } else {
                            j = 0;
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i11 = $10 + 15;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 999, 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (61685 - TextUtils.indexOf("", "")), 1874745193, false, $$n(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i7 = $10 + 125;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 5;
                }
                z = false;
            }
            if (z) {
                byte[] bArr = component1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = $10 + 95;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 39;
                        $11 = i12 % 128;
                        int i13 = i12 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 2984, 48 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (54462 - (ViewConfiguration.getWindowTouchSlop() >> 8)), -1178636483, false, $$n(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component1;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1000 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((Process.myPid() >> 22) + 61685), 1874745193, false, $$n(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i14 = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ j));
                if (z) {
                    int i15 = $11 + 29;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i14 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component3), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - View.resolveSizeAndState(0, 0, 0), 36 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1454191902, false, $$n(b9, b9, (byte) $$l.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        int i18 = $11 + 45;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i20 = $11 + 41;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    if (z2) {
                        byte[] bArr6 = component1;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x2671  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x2672  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02d0  */
    /* JADX WARN: Type inference failed for: r1v516, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void onBundleSelected(WithExpiryResp bundle) {
        OfferBundle offerBundle;
        int i = 2 % 2;
        int i2 = copy + 87;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String bundleType = bundle.getBundleType();
        if (!Intrinsics.areEqual(bundleType, Keys.BUNDLE_TYPE_OFA_MOTO)) {
            if (!Intrinsics.areEqual(bundleType, Keys.BUNDLE_TYPE_FRESH_FRIDAY)) {
                ToastUtils.showShort("Unknown bundle type", new Object[0]);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("withExpiryResp", bundle);
            bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_FRESH_FRIDAY);
            bundle2.putString(Keys.KEY_RETURN_DESTINATION, RoutePathConstant.SFC_OFFER_BUNDLES);
            RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
            return;
        }
        Object tag = bundle.getTag();
        if (!(!(tag instanceof OfferBundle))) {
            offerBundle = (OfferBundle) tag;
        } else {
            int i4 = copy + 63;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            offerBundle = null;
        }
        if (offerBundle == null) {
            ToastUtils.showShort("Bundle data not found", new Object[0]);
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("withExpiryResp", bundle);
        bundle3.putSerializable("offerBundle", offerBundle);
        bundle3.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_OFA_MOTO);
        bundle3.putString(Keys.KEY_RETURN_DESTINATION, RoutePathConstant.SFC_OFFER_BUNDLES);
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle3);
        int i6 = copy + 83;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(new char[]{1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1, 6, '\f', 15}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 26, true, 26 - (ViewConfiguration.getPressedStateDuration() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) + 64, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).codePointAt(0) + 1274642774, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 97), Process.getGidForName("") + 1388080138, (short) ((-8) - Color.red(0)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(28) - 139, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = getRequestBeneficiariesState + 45;
            copy = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6617, TextUtils.indexOf((CharSequence) "", '0') + 43, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 56 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6618, 42 - ExpandableListView.getPackedPositionGroup(0L), (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6561, 56 - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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
        int i4 = copy + 77;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:912|49|(1:51)|52|76|(11:956|77|(2:920|79)|84|85|950|(5:87|88|(1:90)|91|92)(26:93|94|951|95|96|936|97|(3:99|874|100)|104|105|929|106|(2:904|108)|112|113|114|(2:867|116)|120|121|922|122|(5:860|124|125|916|126)(1:130)|918|131|(1:133)|134)|135|(4:138|(2:140|972)(11:141|(3:143|(4:146|147|148|144)|973)|151|898|152|(1:154)|155|156|892|157|971)|158|136)|970|170)|205|(2:882|206)|(15:208|948|209|214|(5:941|216|217|940|218)(1:223)|869|224|225|945|(2:227|(5:229|230|(1:232)|233|234)(3:235|(1:237)|238))(12:(2:240|(1:246)(1:245))(1:250)|(24:252|253|854|254|844|255|(2:886|257)|261|262|960|263|(2:934|265)|269|270|271|(2:908|273)|277|278|953|279|(3:281|943|282)(1:284)|285|(2:287|288)|289)(2:343|344)|350|351|856|352|355|356|(1:358)|359|360|361)|290|(4:293|(2:295|990)(11:296|(3:298|(3:301|302|299)|991)|305|938|306|(1:308)|309|310|932|311|989)|312|291)|988|326|344)(12:214|(0)(0)|869|224|225|945|(0)(0)|290|(1:291)|988|326|344)|362|(9:931|363|(1:365)|366|(3:368|(1:370)|371)(22:372|373|914|374|(1:376)|377|378|900|379|(1:381)|382|383|384|(1:386)|387|388|896|389|(2:968|391)(1:393)|394|(1:396)|397)|398|(4:401|(2:403|(2:410|976)(11:411|(3:413|(3:416|417|414)|977)|418|888|419|(1:421)|422|423|876|424|975))(2:408|(0)(0))|425|399)|974|437)|463|864|464|(1:466)|467|(3:469|(1:471)|472)(17:474|475|852|476|(1:478)|479|480|481|(1:483)|484|485|848|486|(2:862|488)(1:492)|493|(2:495|496)|497)|473|498|(1:500)(9:501|966|502|(1:504)|505|506|507|962|508)|541|(1:543)|544|(1:546)(1:547)|548|(3:550|(1:552)|553)(16:555|556|(1:558)|559|(1:561)|562|563|(1:565)|566|910|567|568|(1:570)|571|(1:573)|574)|554|575|(1:577)(9:578|(3:580|(2:583|581)|987)|584|585|(1:587)|588|(1:590)|591|592)|593|(1:595)|596|(3:598|(1:600)|601)(14:602|603|(1:605)|606|607|(1:609)|610|902|611|612|(1:614)(1:615)|616|(1:618)|619)|620|(25:622|878|623|(2:872|625)|629|(4:631|632|871|633)(1:634)|635|(3:637|(1:639)|640)(17:641|(2:643|(1:649)(1:648))|(19:651|652|858|653|(1:655)|656|657|846|658|(1:660)|661|662|663|(1:665)|666|(1:668)|669|(1:671)|672)|734|(1:736)|737|(3:739|(1:741)|742)(13:744|924|745|746|(1:748)|749|880|750|751|(1:753)|754|(1:756)|757)|743|758|(6:761|762|(1:764)|765|766|767)|768|(1:770)|771|(3:773|(1:775)|776)(14:778|779|(1:781)|782|783|(1:785)|786|865|787|788|(1:790)|791|(1:793)|794)|777|795|(1:992)(7:798|799|(1:801)|802|803|804|805))|673|(4:676|(3:980|678|983)(12:979|679|(5:681|(1:683)(1:684)|985|(3:687|688|685)|984)|689|964|690|(1:692)|693|694|958|695|982)|981|674)|978|734|(0)|737|(0)(0)|743|758|(0)|768|(0)|771|(0)(0)|777|795|(0)(0))(10:815|(3:817|(2:820|818)|986)|821|822|(1:824)|825|(1:827)|828|829|830)) */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x2235, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0f8b A[Catch: all -> 0x0769, TryCatch #42 {all -> 0x0769, blocks: (B:199:0x0f85, B:201:0x0f8b, B:202:0x0fba, B:356:0x1862, B:358:0x1868, B:359:0x188e, B:762:0x3757, B:764:0x375d, B:765:0x3785, B:799:0x3aaa, B:801:0x3ab0, B:802:0x3ad7, B:779:0x38dc, B:781:0x38ff, B:782:0x395c, B:728:0x340e, B:730:0x3414, B:731:0x3440, B:822:0x3bb2, B:824:0x3bb8, B:825:0x3be4, B:827:0x3c1e, B:828:0x3c65, B:603:0x2bf8, B:605:0x2c0d, B:606:0x2c3d, B:585:0x28d8, B:587:0x28de, B:588:0x2905, B:590:0x293f, B:591:0x2984, B:556:0x2559, B:558:0x256e, B:559:0x259e, B:561:0x25d2, B:562:0x264d, B:535:0x22f6, B:537:0x22fc, B:538:0x2320, B:457:0x1dfc, B:459:0x1e02, B:460:0x1e2a, B:70:0x095b, B:72:0x0961, B:73:0x098c, B:19:0x02f2, B:21:0x02f8, B:22:0x0326, B:24:0x06d4, B:26:0x0706, B:27:0x0763, B:33:0x0779, B:35:0x077d, B:56:0x0861, B:58:0x0867, B:59:0x0868, B:61:0x086a, B:63:0x0871, B:64:0x0872, B:39:0x0789), top: B:926:0x02f2, inners: #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1091 A[Catch: all -> 0x1741, PHI: r1
  0x1091: PHI (r1v633 java.lang.Object) = (r1v632 java.lang.Object), (r1v706 java.lang.Object) binds: [B:207:0x1041, B:209:0x1044] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x1741, blocks: (B:206:0x103d, B:214:0x1091), top: B:882:0x103d }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1107  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x111c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x11e5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x15cc A[Catch: all -> 0x170c, TryCatch #58 {all -> 0x170c, blocks: (B:290:0x15c2, B:291:0x15c6, B:293:0x15cc, B:296:0x15ea, B:279:0x14f3, B:285:0x155d, B:289:0x15ba), top: B:953:0x14f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x1868 A[Catch: all -> 0x0769, TryCatch #42 {all -> 0x0769, blocks: (B:199:0x0f85, B:201:0x0f8b, B:202:0x0fba, B:356:0x1862, B:358:0x1868, B:359:0x188e, B:762:0x3757, B:764:0x375d, B:765:0x3785, B:799:0x3aaa, B:801:0x3ab0, B:802:0x3ad7, B:779:0x38dc, B:781:0x38ff, B:782:0x395c, B:728:0x340e, B:730:0x3414, B:731:0x3440, B:822:0x3bb2, B:824:0x3bb8, B:825:0x3be4, B:827:0x3c1e, B:828:0x3c65, B:603:0x2bf8, B:605:0x2c0d, B:606:0x2c3d, B:585:0x28d8, B:587:0x28de, B:588:0x2905, B:590:0x293f, B:591:0x2984, B:556:0x2559, B:558:0x256e, B:559:0x259e, B:561:0x25d2, B:562:0x264d, B:535:0x22f6, B:537:0x22fc, B:538:0x2320, B:457:0x1dfc, B:459:0x1e02, B:460:0x1e2a, B:70:0x095b, B:72:0x0961, B:73:0x098c, B:19:0x02f2, B:21:0x02f8, B:22:0x0326, B:24:0x06d4, B:26:0x0706, B:27:0x0763, B:33:0x0779, B:35:0x077d, B:56:0x0861, B:58:0x0867, B:59:0x0868, B:61:0x086a, B:63:0x0871, B:64:0x0872, B:39:0x0789), top: B:926:0x02f2, inners: #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x1921 A[Catch: all -> 0x1d6b, TryCatch #45 {all -> 0x1d6b, blocks: (B:363:0x191b, B:365:0x1921, B:366:0x1964, B:368:0x1971, B:370:0x197a, B:371:0x19bf, B:428:0x1d3d, B:430:0x1d43, B:431:0x1d44, B:433:0x1d46, B:435:0x1d4d, B:436:0x1d4e, B:372:0x19cc, B:384:0x1ac4, B:386:0x1aca, B:387:0x1b14, B:441:0x1d58, B:443:0x1d5f, B:444:0x1d60, B:446:0x1d62, B:448:0x1d69, B:449:0x1d6a, B:424:0x1cc1, B:419:0x1c7c, B:421:0x1c82, B:422:0x1caf, B:379:0x1a39, B:381:0x1a4e, B:382:0x1ab8, B:374:0x19ec, B:376:0x1a01, B:377:0x1a32), top: B:931:0x191b, inners: #17, #23, #29, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x1971 A[Catch: all -> 0x1d6b, TryCatch #45 {all -> 0x1d6b, blocks: (B:363:0x191b, B:365:0x1921, B:366:0x1964, B:368:0x1971, B:370:0x197a, B:371:0x19bf, B:428:0x1d3d, B:430:0x1d43, B:431:0x1d44, B:433:0x1d46, B:435:0x1d4d, B:436:0x1d4e, B:372:0x19cc, B:384:0x1ac4, B:386:0x1aca, B:387:0x1b14, B:441:0x1d58, B:443:0x1d5f, B:444:0x1d60, B:446:0x1d62, B:448:0x1d69, B:449:0x1d6a, B:424:0x1cc1, B:419:0x1c7c, B:421:0x1c82, B:422:0x1caf, B:379:0x1a39, B:381:0x1a4e, B:382:0x1ab8, B:374:0x19ec, B:376:0x1a01, B:377:0x1a32), top: B:931:0x191b, inners: #17, #23, #29, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x19cc A[Catch: all -> 0x1d6b, TRY_LEAVE, TryCatch #45 {all -> 0x1d6b, blocks: (B:363:0x191b, B:365:0x1921, B:366:0x1964, B:368:0x1971, B:370:0x197a, B:371:0x19bf, B:428:0x1d3d, B:430:0x1d43, B:431:0x1d44, B:433:0x1d46, B:435:0x1d4d, B:436:0x1d4e, B:372:0x19cc, B:384:0x1ac4, B:386:0x1aca, B:387:0x1b14, B:441:0x1d58, B:443:0x1d5f, B:444:0x1d60, B:446:0x1d62, B:448:0x1d69, B:449:0x1d6a, B:424:0x1cc1, B:419:0x1c7c, B:421:0x1c82, B:422:0x1caf, B:379:0x1a39, B:381:0x1a4e, B:382:0x1ab8, B:374:0x19ec, B:376:0x1a01, B:377:0x1a32), top: B:931:0x191b, inners: #17, #23, #29, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x1bf9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1c3a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1c3e A[Catch: all -> 0x1d53, PHI: r2 r5 r7
  0x1c3e: PHI (r2v550 java.lang.Object[]) = (r2v549 java.lang.Object[]), (r2v576 java.lang.Object[]) binds: [B:409:0x1c38, B:404:0x1c1a] A[DONT_GENERATE, DONT_INLINE]
  0x1c3e: PHI (r5v323 int) = (r5v322 int), (r5v339 int) binds: [B:409:0x1c38, B:404:0x1c1a] A[DONT_GENERATE, DONT_INLINE]
  0x1c3e: PHI (r7v445 int) = (r7v444 int), (r7v460 int) binds: [B:409:0x1c38, B:404:0x1c1a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #27 {all -> 0x1d53, blocks: (B:398:0x1bef, B:399:0x1bf3, B:411:0x1c3e, B:408:0x1c23, B:389:0x1b23, B:394:0x1b8a, B:397:0x1be7), top: B:896:0x1b23 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x1e02 A[Catch: all -> 0x0769, TryCatch #42 {all -> 0x0769, blocks: (B:199:0x0f85, B:201:0x0f8b, B:202:0x0fba, B:356:0x1862, B:358:0x1868, B:359:0x188e, B:762:0x3757, B:764:0x375d, B:765:0x3785, B:799:0x3aaa, B:801:0x3ab0, B:802:0x3ad7, B:779:0x38dc, B:781:0x38ff, B:782:0x395c, B:728:0x340e, B:730:0x3414, B:731:0x3440, B:822:0x3bb2, B:824:0x3bb8, B:825:0x3be4, B:827:0x3c1e, B:828:0x3c65, B:603:0x2bf8, B:605:0x2c0d, B:606:0x2c3d, B:585:0x28d8, B:587:0x28de, B:588:0x2905, B:590:0x293f, B:591:0x2984, B:556:0x2559, B:558:0x256e, B:559:0x259e, B:561:0x25d2, B:562:0x264d, B:535:0x22f6, B:537:0x22fc, B:538:0x2320, B:457:0x1dfc, B:459:0x1e02, B:460:0x1e2a, B:70:0x095b, B:72:0x0961, B:73:0x098c, B:19:0x02f2, B:21:0x02f8, B:22:0x0326, B:24:0x06d4, B:26:0x0706, B:27:0x0763, B:33:0x0779, B:35:0x077d, B:56:0x0861, B:58:0x0867, B:59:0x0868, B:61:0x086a, B:63:0x0871, B:64:0x0872, B:39:0x0789), top: B:926:0x02f2, inners: #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x1eb7 A[Catch: all -> 0x2235, TryCatch #10 {all -> 0x2235, blocks: (B:464:0x1eb1, B:466:0x1eb7, B:467:0x1eff, B:469:0x1f0c, B:471:0x1f15, B:472:0x1f59, B:506:0x2195, B:512:0x2215, B:514:0x221b, B:515:0x221c, B:517:0x221e, B:519:0x2225, B:520:0x2226, B:474:0x1f67, B:481:0x1ff1, B:483:0x1ff7, B:484:0x203a, B:524:0x222c, B:526:0x2233, B:527:0x2234, B:476:0x1f87, B:478:0x1f99, B:479:0x1fe5, B:508:0x219b, B:502:0x215c, B:504:0x2162, B:505:0x218e), top: B:864:0x1eb1, inners: #4, #63, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1f0c A[Catch: all -> 0x2235, TryCatch #10 {all -> 0x2235, blocks: (B:464:0x1eb1, B:466:0x1eb7, B:467:0x1eff, B:469:0x1f0c, B:471:0x1f15, B:472:0x1f59, B:506:0x2195, B:512:0x2215, B:514:0x221b, B:515:0x221c, B:517:0x221e, B:519:0x2225, B:520:0x2226, B:474:0x1f67, B:481:0x1ff1, B:483:0x1ff7, B:484:0x203a, B:524:0x222c, B:526:0x2233, B:527:0x2234, B:476:0x1f87, B:478:0x1f99, B:479:0x1fe5, B:508:0x219b, B:502:0x215c, B:504:0x2162, B:505:0x218e), top: B:864:0x1eb1, inners: #4, #63, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1f67 A[Catch: all -> 0x2235, TRY_LEAVE, TryCatch #10 {all -> 0x2235, blocks: (B:464:0x1eb1, B:466:0x1eb7, B:467:0x1eff, B:469:0x1f0c, B:471:0x1f15, B:472:0x1f59, B:506:0x2195, B:512:0x2215, B:514:0x221b, B:515:0x221c, B:517:0x221e, B:519:0x2225, B:520:0x2226, B:474:0x1f67, B:481:0x1ff1, B:483:0x1ff7, B:484:0x203a, B:524:0x222c, B:526:0x2233, B:527:0x2234, B:476:0x1f87, B:478:0x1f99, B:479:0x1fe5, B:508:0x219b, B:502:0x215c, B:504:0x2162, B:505:0x218e), top: B:864:0x1eb1, inners: #4, #63, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x2135  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x2139  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x22fc A[Catch: all -> 0x0769, TryCatch #42 {all -> 0x0769, blocks: (B:199:0x0f85, B:201:0x0f8b, B:202:0x0fba, B:356:0x1862, B:358:0x1868, B:359:0x188e, B:762:0x3757, B:764:0x375d, B:765:0x3785, B:799:0x3aaa, B:801:0x3ab0, B:802:0x3ad7, B:779:0x38dc, B:781:0x38ff, B:782:0x395c, B:728:0x340e, B:730:0x3414, B:731:0x3440, B:822:0x3bb2, B:824:0x3bb8, B:825:0x3be4, B:827:0x3c1e, B:828:0x3c65, B:603:0x2bf8, B:605:0x2c0d, B:606:0x2c3d, B:585:0x28d8, B:587:0x28de, B:588:0x2905, B:590:0x293f, B:591:0x2984, B:556:0x2559, B:558:0x256e, B:559:0x259e, B:561:0x25d2, B:562:0x264d, B:535:0x22f6, B:537:0x22fc, B:538:0x2320, B:457:0x1dfc, B:459:0x1e02, B:460:0x1e2a, B:70:0x095b, B:72:0x0961, B:73:0x098c, B:19:0x02f2, B:21:0x02f8, B:22:0x0326, B:24:0x06d4, B:26:0x0706, B:27:0x0763, B:33:0x0779, B:35:0x077d, B:56:0x0861, B:58:0x0867, B:59:0x0868, B:61:0x086a, B:63:0x0871, B:64:0x0872, B:39:0x0789), top: B:926:0x02f2, inners: #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x23a9  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x2415  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x245e  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x2474  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x253b  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x2790  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x2895  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x2aa0  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x2af2  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x2bd6  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x2d84  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x3414 A[Catch: all -> 0x0769, TryCatch #42 {all -> 0x0769, blocks: (B:199:0x0f85, B:201:0x0f8b, B:202:0x0fba, B:356:0x1862, B:358:0x1868, B:359:0x188e, B:762:0x3757, B:764:0x375d, B:765:0x3785, B:799:0x3aaa, B:801:0x3ab0, B:802:0x3ad7, B:779:0x38dc, B:781:0x38ff, B:782:0x395c, B:728:0x340e, B:730:0x3414, B:731:0x3440, B:822:0x3bb2, B:824:0x3bb8, B:825:0x3be4, B:827:0x3c1e, B:828:0x3c65, B:603:0x2bf8, B:605:0x2c0d, B:606:0x2c3d, B:585:0x28d8, B:587:0x28de, B:588:0x2905, B:590:0x293f, B:591:0x2984, B:556:0x2559, B:558:0x256e, B:559:0x259e, B:561:0x25d2, B:562:0x264d, B:535:0x22f6, B:537:0x22fc, B:538:0x2320, B:457:0x1dfc, B:459:0x1e02, B:460:0x1e2a, B:70:0x095b, B:72:0x0961, B:73:0x098c, B:19:0x02f2, B:21:0x02f8, B:22:0x0326, B:24:0x06d4, B:26:0x0706, B:27:0x0763, B:33:0x0779, B:35:0x077d, B:56:0x0861, B:58:0x0867, B:59:0x0868, B:61:0x086a, B:63:0x0871, B:64:0x0872, B:39:0x0789), top: B:926:0x02f2, inners: #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x34cf  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x3521  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x357a  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x3738  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x381f  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x386f  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x38be  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x3a8a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x3b70  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x10b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:992:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v125 */
    /* JADX WARN: Type inference failed for: r10v126 */
    /* JADX WARN: Type inference failed for: r11v259, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v260 */
    /* JADX WARN: Type inference failed for: r11v261 */
    /* JADX WARN: Type inference failed for: r11v262 */
    /* JADX WARN: Type inference failed for: r11v263 */
    /* JADX WARN: Type inference failed for: r11v266 */
    /* JADX WARN: Type inference failed for: r11v267 */
    /* JADX WARN: Type inference failed for: r11v342 */
    /* JADX WARN: Type inference failed for: r11v343 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v127 */
    /* JADX WARN: Type inference failed for: r12v128 */
    /* JADX WARN: Type inference failed for: r12v129 */
    /* JADX WARN: Type inference failed for: r12v130 */
    /* JADX WARN: Type inference failed for: r12v133 */
    /* JADX WARN: Type inference failed for: r12v134 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v126 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v145, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v170 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /* JADX WARN: Type inference failed for: r13v172 */
    /* JADX WARN: Type inference failed for: r13v173 */
    /* JADX WARN: Type inference failed for: r13v174 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v176 */
    /* JADX WARN: Type inference failed for: r13v177 */
    /* JADX WARN: Type inference failed for: r13v178 */
    /* JADX WARN: Type inference failed for: r13v179 */
    /* JADX WARN: Type inference failed for: r13v180 */
    /* JADX WARN: Type inference failed for: r13v181 */
    /* JADX WARN: Type inference failed for: r13v182 */
    /* JADX WARN: Type inference failed for: r13v183 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v23 */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v26 */
    /* JADX WARN: Type inference failed for: r27v27 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v30 */
    /* JADX WARN: Type inference failed for: r27v31 */
    /* JADX WARN: Type inference failed for: r27v32 */
    /* JADX WARN: Type inference failed for: r27v4, types: [int] */
    /* JADX WARN: Type inference failed for: r27v43 */
    /* JADX WARN: Type inference failed for: r27v45 */
    /* JADX WARN: Type inference failed for: r27v46 */
    /* JADX WARN: Type inference failed for: r27v47 */
    /* JADX WARN: Type inference failed for: r27v48 */
    /* JADX WARN: Type inference failed for: r27v49 */
    /* JADX WARN: Type inference failed for: r27v50 */
    /* JADX WARN: Type inference failed for: r27v51 */
    /* JADX WARN: Type inference failed for: r27v52 */
    /* JADX WARN: Type inference failed for: r27v53 */
    /* JADX WARN: Type inference failed for: r27v54 */
    /* JADX WARN: Type inference failed for: r27v59 */
    /* JADX WARN: Type inference failed for: r27v60 */
    /* JADX WARN: Type inference failed for: r27v61 */
    /* JADX WARN: Type inference failed for: r27v62 */
    /* JADX WARN: Type inference failed for: r27v63 */
    /* JADX WARN: Type inference failed for: r27v64 */
    /* JADX WARN: Type inference failed for: r27v65 */
    /* JADX WARN: Type inference failed for: r27v66 */
    /* JADX WARN: Type inference failed for: r27v67 */
    /* JADX WARN: Type inference failed for: r27v68 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v70 */
    /* JADX WARN: Type inference failed for: r27v71 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v80 */
    /* JADX WARN: Type inference failed for: r27v81 */
    /* JADX WARN: Type inference failed for: r27v82 */
    /* JADX WARN: Type inference failed for: r27v83 */
    /* JADX WARN: Type inference failed for: r27v84 */
    /* JADX WARN: Type inference failed for: r27v85 */
    /* JADX WARN: Type inference failed for: r27v86 */
    /* JADX WARN: Type inference failed for: r27v87 */
    /* JADX WARN: Type inference failed for: r27v88 */
    /* JADX WARN: Type inference failed for: r27v89 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r27v90 */
    /* JADX WARN: Type inference failed for: r27v91 */
    /* JADX WARN: Type inference failed for: r27v92 */
    /* JADX WARN: Type inference failed for: r27v93 */
    /* JADX WARN: Type inference failed for: r27v94 */
    /* JADX WARN: Type inference failed for: r27v95 */
    /* JADX WARN: Type inference failed for: r27v96 */
    /* JADX WARN: Type inference failed for: r27v97 */
    /* JADX WARN: Type inference failed for: r27v98 */
    /* JADX WARN: Type inference failed for: r27v99 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v25 */
    /* JADX WARN: Type inference failed for: r31v26 */
    /* JADX WARN: Type inference failed for: r31v27 */
    /* JADX WARN: Type inference failed for: r31v28 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v31 */
    /* JADX WARN: Type inference failed for: r31v32 */
    /* JADX WARN: Type inference failed for: r31v33 */
    /* JADX WARN: Type inference failed for: r31v34 */
    /* JADX WARN: Type inference failed for: r31v35 */
    /* JADX WARN: Type inference failed for: r31v36 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v38 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v41 */
    /* JADX WARN: Type inference failed for: r31v42 */
    /* JADX WARN: Type inference failed for: r31v44 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v46 */
    /* JADX WARN: Type inference failed for: r31v47 */
    /* JADX WARN: Type inference failed for: r31v48 */
    /* JADX WARN: Type inference failed for: r31v49 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v50 */
    /* JADX WARN: Type inference failed for: r31v51 */
    /* JADX WARN: Type inference failed for: r31v52 */
    /* JADX WARN: Type inference failed for: r31v53 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r31v57 */
    /* JADX WARN: Type inference failed for: r31v58 */
    /* JADX WARN: Type inference failed for: r31v59 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r3v598 */
    /* JADX WARN: Type inference failed for: r3v599 */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v600 */
    /* JADX WARN: Type inference failed for: r3v613 */
    /* JADX WARN: Type inference failed for: r3v615, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v629 */
    /* JADX WARN: Type inference failed for: r3v644 */
    /* JADX WARN: Type inference failed for: r3v645 */
    /* JADX WARN: Type inference failed for: r4v308 */
    /* JADX WARN: Type inference failed for: r4v312 */
    /* JADX WARN: Type inference failed for: r4v317 */
    /* JADX WARN: Type inference failed for: r4v320 */
    /* JADX WARN: Type inference failed for: r4v321 */
    /* JADX WARN: Type inference failed for: r4v322 */
    /* JADX WARN: Type inference failed for: r4v325, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v326 */
    /* JADX WARN: Type inference failed for: r4v327 */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v329 */
    /* JADX WARN: Type inference failed for: r4v330 */
    /* JADX WARN: Type inference failed for: r4v343 */
    /* JADX WARN: Type inference failed for: r4v344 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v414 */
    /* JADX WARN: Type inference failed for: r4v415 */
    /* JADX WARN: Type inference failed for: r4v416 */
    /* JADX WARN: Type inference failed for: r4v417 */
    /* JADX WARN: Type inference failed for: r4v418 */
    /* JADX WARN: Type inference failed for: r4v419 */
    /* JADX WARN: Type inference failed for: r4v420 */
    /* JADX WARN: Type inference failed for: r4v421 */
    /* JADX WARN: Type inference failed for: r4v422 */
    /* JADX WARN: Type inference failed for: r4v423 */
    /* JADX WARN: Type inference failed for: r4v424 */
    /* JADX WARN: Type inference failed for: r4v425 */
    /* JADX WARN: Type inference failed for: r5v133, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v134, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v195 */
    /* JADX WARN: Type inference failed for: r5v415 */
    /* JADX WARN: Type inference failed for: r6v116, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v117, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v312, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v324, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v390 */
    /* JADX WARN: Type inference failed for: r6v517 */
    /* JADX WARN: Type inference failed for: r6v518 */
    /* JADX WARN: Type inference failed for: r6v519 */
    /* JADX WARN: Type inference failed for: r6v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v160, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v261, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v270 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v274 */
    /* JADX WARN: Type inference failed for: r8v285, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v295 */
    /* JADX WARN: Type inference failed for: r8v296 */
    /* JADX WARN: Type inference failed for: r8v297 */
    /* JADX WARN: Type inference failed for: r8v298 */
    /* JADX WARN: Type inference failed for: r8v299 */
    /* JADX WARN: Type inference failed for: r8v306 */
    /* JADX WARN: Type inference failed for: r8v483 */
    /* JADX WARN: Type inference failed for: r8v484 */
    /* JADX WARN: Type inference failed for: r8v485 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.ofa_moto.SfcOfferBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getAsAtTimestamp = 0;
        component1();
        int i = equals + 67;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
    }

    static void component1() {
        ShareDataUIState = -890926373;
        copydefault = 1171065254;
        component2 = -238323956;
        component3 = 1552474995;
        component1 = new byte[]{-55, 36, Ascii.SI, -57, TarHeader.LF_CONTIG, -60, 46, 39, -44, TarHeader.LF_SYMLINK, 47, 43, 44, 45, 33, Ascii.RS, -4, 39, 56, -46, 33, 44, TarHeader.LF_CHR, 34, 43, -8, -2, -6, -16, -7, -5, -128, -5, -41, -14, -4, -4, -118, -7, -6, -3, -16, -6, 43, -117, 43, -15, -118, 42, -2, -113, 41, -3, -15, -118, 41, -116, 47, -25, -3, -2, -114, 46, -74, -1, 41, -4, -115, 32, -27, -123, 10, 62, TarHeader.LF_CONTIG, 8, 46, 0, 103, 60, -3, 118, -6, TarHeader.LF_NORMAL, Ascii.SI, 63, 56, TarHeader.LF_BLK, 123, -9, 56, Ascii.SO, 99, -13, 63, 13, 100, -56, 34, 0, 45, TarHeader.LF_DIR, 63, Ascii.SO, 35, 0, 45, Ascii.SI, 120, -5, TarHeader.LF_NORMAL, 3, 63, 46, 2, Base64.padSymbol, 34, Ascii.VT, 37, 119, -51, 62, 109, TarHeader.LF_SYMLINK, TarHeader.LF_CHR, TarHeader.LF_LINK, Base64.padSymbol, TarHeader.LF_BLK, Base64.padSymbol, TarHeader.LF_NORMAL, -49, 98, Base64.padSymbol, 62, TarHeader.LF_SYMLINK, 62, TarHeader.LF_FIFO, TarHeader.LF_LINK, 36, -10, TarHeader.LF_SYMLINK, Base64.padSymbol, TarHeader.LF_LINK, 13, -56, -64, -9, -50, -50, -16, -42, 3, Ascii.GS, 45, 117, 7, Ascii.US, 4, 45, 75, 41, 73, 19, -43, 74, 4, 45, 76, 1, Ascii.ESC, Ascii.CAN, Ascii.ESC, 17, 7, 0, Ascii.DLE, Ascii.CAN, Ascii.GS, 1, 44, 73, Ascii.EM, 6, 47, 72, -41, -61, -122, -110, -123, -106, -21, -102, -29, -116, -97, -128, -109, -17, -123, -105, -52, -10, -61, -50, -50, -55, -49, -50, -64, -54, TarHeader.LF_SYMLINK, -18, -34, 8, -33, -47, -24, -36, 3, -22, -34, TarHeader.LF_FIFO, -35, -31, -48, TarHeader.LF_FIFO, -32, 13, -35, -33, -36, -22, 3, -38, -47, -60, -48, -37, -38, -33, -45, -58, -43, -36, -21, 0, -33, -22, Ascii.SI, -60, -28, Ascii.VT, -48, -58, -33, -37, -45, -38, -17, -36, -35, 13, -35, -35, -43, -22, -38, 13, -29, 10, -18, -40, 10, -38, -49, 60, 63, 39, TarHeader.LF_LINK, 38, 56, 62, 60, 59, Base64.padSymbol, -49, -79, -78, -116, -80, -74, -78, -118, -80, -116, -75};
    }
}
