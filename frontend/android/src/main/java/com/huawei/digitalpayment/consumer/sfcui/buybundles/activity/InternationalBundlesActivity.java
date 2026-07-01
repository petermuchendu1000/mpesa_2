package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.internationalbundles.InternationalBundlesScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.ConstantsKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.PackageList;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelNotification;
import kotlin.collections.CollectionsKt;
import kotlin.fullyDrawnReported;
import kotlin.isFullyDrawnReported;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013²\u0006\"\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0016 \u0017*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00150\u0015X\u008a\u0084\u0002²\u0006\u0018\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0019X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/InternationalBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "buyBundleViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getBuyBundleViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "buyBundleViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Companion", "ConsumerSfcUI_release", "bundlesList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "kotlin.jvm.PlatformType", "bundlesResource", "Lcom/huawei/payment/mvvm/Resource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class InternationalBundlesActivity extends Hilt_InternationalBundlesActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_RETURN_TO_INTERNATIONAL_BUNDLES = "extra_return_to_international_bundles";
    private static long ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static int component3;
    private static char[] copydefault;
    private static boolean equals;
    private static boolean getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;

    private final Lazy buyBundleViewModel;
    private static final byte[] $$l = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$m = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81, 17, 3, -58, 57, Ascii.CAN, -3, 8, 9, -10, 3, 10, -53, 62, 10, 2, 0, 6, -50, 67, 8, -9, 8, -49, 73, -8, 19, 1, Ascii.VT, 2, -10, 7, -50, 62, 7, 2, -51, Ascii.RS, 39, 2, -29, TarHeader.LF_CHR, -12, Ascii.ESC, -17, 6, Ascii.SI, -2, -27, 46, -6, 17, -6, 6, Ascii.DC2, 17, 6, Ascii.SO, -16, 6, 6, 0, Ascii.EM, -4, 13, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -62, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, 17, 3, -58, 63, Ascii.DC2, -15, Ascii.ESC, -13, 9, -54, 59, 10, 3, 7, Ascii.DLE, -14, Ascii.DLE, 9, -10, Ascii.GS, -7, -3, Ascii.SO, Ascii.VT, -65, 58, 17, 4, 10, 7, -3, -3, Ascii.DC2, -63, 74, -8, 2, Ascii.ETB, -7, -54, 57, Ascii.CAN, 9, -18, Ascii.CAN, -2, -5, 13, -2, 19, -64, 56, 7, Ascii.SYN, -6, Ascii.DC2, -8, Ascii.DLE, 10, -70, 42, Ascii.CAN, 2, -26, 34, Ascii.CAN, -14, -13, 36, 3, Ascii.DC2, -50, 56, -2, -5, 13, -2, 19, -45, 39, Ascii.SYN, -6, Ascii.DC2, -8, Ascii.DLE, 10, -41, 46, -75, 68, 17, 6, Ascii.SO, -16, 6, 6, 0, Ascii.EM, -4, 13, 17, 3, -58, 56, Ascii.DLE, 2, -2, 4, 6, 4, -46, 62, Ascii.DLE, -4, Ascii.DC2, -12, Ascii.DC2, -63, 67, 8, 10, 5, -6, 1, -50, 35, 40, 10, 5, -6, 1, -28, TarHeader.LF_CHR, -12, Ascii.ESC, -17, 6, Ascii.SI, -2, -60, Ascii.DC2, 6, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -61};
    private static final int $$k = 75;
    private static final byte[] $$d = {115, 102, 60, 8, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 1;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 0;
    private static int copy = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int copydefault = 1;
        private final Function1 component3;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 121;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (obj instanceof Observer) {
                int i5 = i2 + 43;
                int i6 = i5 % 128;
                component1 = i6;
                int i7 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i8 = i6 + 101;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    Function<?> functionDelegate = getFunctionDelegate();
                    Function<?> functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
                    if (i9 != 0) {
                        return Intrinsics.areEqual(functionDelegate, functionDelegate2);
                    }
                    Intrinsics.areEqual(functionDelegate, functionDelegate2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 77;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component3;
            int i5 = i2 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 9;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 55;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = copydefault + 39;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.$$l
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 + 68
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.$$n(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 28 - r6
            int r5 = 99 - r5
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = -1
            if (r1 != 0) goto L14
            r7 = r5
            r3 = r6
            goto L2b
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2b:
            int r5 = r5 + r3
            int r5 = r5 + (-8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.g(byte, int, byte, java.lang.Object[]):void");
    }

    private static void h(int i, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$j;
        int i2 = (s * 4) + 99;
        int i3 = i + 4;
        byte[] bArr2 = new byte[b2 + 10];
        int i4 = b2 + 9;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (i2 + i3) - 5;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i5 = i6;
            i2 = (i2 + bArr[i7]) - 5;
            i3 = i7;
        }
    }

    public static final BuyBundleViewModel access$getBuyBundleViewModel(InternationalBundlesActivity internationalBundlesActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        copy = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = internationalBundlesActivity.getBuyBundleViewModel();
        int i4 = copy + 33;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return buyBundleViewModel;
    }

    public static final void access$onBundleSelected(InternationalBundlesActivity internationalBundlesActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = copy + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        internationalBundlesActivity.onBundleSelected(withExpiryResp);
        int i4 = copy + 93;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public InternationalBundlesActivity() {
        final InternationalBundlesActivity internationalBundlesActivity = this;
        final Function0 function0 = null;
        this.buyBundleViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new InternationalBundlesActivity$special$$inlined$viewModels$default$2(internationalBundlesActivity), new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 45;
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
                int i2 = copydefault + 105;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = internationalBundlesActivity.getDefaultViewModelProviderFactory();
                int i4 = copydefault + 61;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
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
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 111;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 11;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = internationalBundlesActivity.getDefaultViewModelCreationExtras();
                int i6 = component1 + 27;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 79;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component3 + 29;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtrasInvoke;
                }
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

    private final BuyBundleViewModel getBuyBundleViewModel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        BuyBundleViewModel buyBundleViewModel = (BuyBundleViewModel) this.buyBundleViewModel.getValue();
        int i3 = getAsAtTimestamp + 13;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return buyBundleViewModel;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/InternationalBundlesActivity$Companion;", "", "<init>", "()V", "EXTRA_RETURN_TO_INTERNATIONAL_BUNDLES", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        public static final Resource copydefault(State state) {
            int i = 2 % 2;
            int i2 = component3 + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component1(state);
            }
            component1(state);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
            int i5 = ShareDataUIState + 117;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final State<Resource<List<Plans>>> ShareDataUIState;
            final InternationalBundlesActivity component1;
            final List<WithExpiryResp> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 49;
                copydefault = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 != 0) {
                    copydefault(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
                copydefault(composer2, num2.intValue());
                int i3 = 38 / 0;
                return Unit.INSTANCE;
            }

            public final void copydefault(Composer composer, int i) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = component2 + 37;
                copydefault = i3 % 128;
                if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 60) == 4) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i4 = copydefault + 29;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
                List<WithExpiryResp> list = this.component3;
                Resource resourceCopydefault = component3.copydefault(this.ShareDataUIState);
                boolean z2 = resourceCopydefault != null && resourceCopydefault.loading();
                Resource resourceCopydefault2 = component3.copydefault(this.ShareDataUIState);
                if (resourceCopydefault2 == null || !resourceCopydefault2.loading()) {
                    int i6 = component2 + 11;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else {
                    z = true;
                }
                final InternationalBundlesActivity internationalBundlesActivity = this.component1;
                Function1 function1 = new Function1() {
                    private static int ShareDataUIState = 0;
                    private static int component2 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = ShareDataUIState + 17;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitComponent1 = InternationalBundlesActivity.component3.AnonymousClass5.component1(internationalBundlesActivity, (WithExpiryResp) obj);
                        int i11 = component2 + 15;
                        ShareDataUIState = i11 % 128;
                        int i12 = i11 % 2;
                        return unitComponent1;
                    }
                };
                final InternationalBundlesActivity internationalBundlesActivity2 = this.component1;
                Function0 function0 = new Function0() {
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = ShareDataUIState + 117;
                        copydefault = i9 % 128;
                        if (i9 % 2 == 0) {
                            InternationalBundlesActivity.component3.AnonymousClass5.ShareDataUIState(internationalBundlesActivity2);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Unit unitShareDataUIState = InternationalBundlesActivity.component3.AnonymousClass5.ShareDataUIState(internationalBundlesActivity2);
                        int i10 = copydefault + 85;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        return unitShareDataUIState;
                    }
                };
                final InternationalBundlesActivity internationalBundlesActivity3 = this.component1;
                InternationalBundlesScreenKt.InternationalBundlesScreen(list, z2, z, function1, function0, new Function0() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        Unit unitComponent1;
                        int i8 = 2 % 2;
                        int i9 = copydefault + 41;
                        component2 = i9 % 128;
                        if (i9 % 2 != 0) {
                            unitComponent1 = InternationalBundlesActivity.component3.AnonymousClass5.component1(internationalBundlesActivity3);
                            int i10 = 77 / 0;
                        } else {
                            unitComponent1 = InternationalBundlesActivity.component3.AnonymousClass5.component1(internationalBundlesActivity3);
                        }
                        int i11 = copydefault + 125;
                        component2 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 54 / 0;
                        }
                        return unitComponent1;
                    }
                }, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m1239onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 8), WindowInsetsSides.INSTANCE.m1267getTopJoeWqyM()), composer, 0)), composer, 8, 0);
            }

            private static final Unit component3(InternationalBundlesActivity internationalBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = component2 + 87;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(internationalBundlesActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                InternationalBundlesActivity.access$onBundleSelected(internationalBundlesActivity, withExpiryResp);
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 47;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component3(InternationalBundlesActivity internationalBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 9;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(internationalBundlesActivity, "");
                    InternationalBundlesActivity.access$getBuyBundleViewModel(internationalBundlesActivity).getExpiryBundlesCatalog();
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(internationalBundlesActivity, "");
                InternationalBundlesActivity.access$getBuyBundleViewModel(internationalBundlesActivity).getExpiryBundlesCatalog();
                Unit unit2 = Unit.INSTANCE;
                int i3 = copydefault + 121;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit component2(InternationalBundlesActivity internationalBundlesActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component2 + 79;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(internationalBundlesActivity, "");
                    internationalBundlesActivity.finish();
                    unit = Unit.INSTANCE;
                    int i3 = 89 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(internationalBundlesActivity, "");
                    internationalBundlesActivity.finish();
                    unit = Unit.INSTANCE;
                }
                int i4 = copydefault + 61;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit ShareDataUIState(InternationalBundlesActivity internationalBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 59;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(internationalBundlesActivity);
                int i4 = component2 + 55;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 0;
                }
                return unitComponent3;
            }

            public static Unit component1(InternationalBundlesActivity internationalBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 53;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(internationalBundlesActivity);
                int i4 = component2 + 43;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 44 / 0;
                }
                return unitComponent2;
            }

            public static Unit component1(InternationalBundlesActivity internationalBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = component2 + 13;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(internationalBundlesActivity, withExpiryResp);
                if (i3 == 0) {
                    int i4 = 46 / 0;
                }
                int i5 = copydefault + 95;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return unitComponent3;
            }

            AnonymousClass5(List<WithExpiryResp> list, State<Resource<List<Plans>>> state, InternationalBundlesActivity internationalBundlesActivity) {
                this.component3 = list;
                this.ShareDataUIState = state;
                this.component1 = internationalBundlesActivity;
            }
        }

        public final void ShareDataUIState(Composer composer, int i) {
            List<PackageList> listEmptyList;
            String str;
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 21;
            component3 = i3 % 128;
            if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 43) == 3) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i4 = component3 + 125;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(InternationalBundlesActivity.access$getBuyBundleViewModel(InternationalBundlesActivity.this).getFilteredBundleData(), CollectionsKt.emptyList(), composer, 56);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(InternationalBundlesActivity.access$getBuyBundleViewModel(InternationalBundlesActivity.this).getOtherBundlesData(), composer, 8);
            List<Plans> listComponent2 = component2(stateObserveAsState);
            if (listComponent2 == null) {
                listComponent2 = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listComponent2.iterator();
            while (!(!it.hasNext())) {
                int i6 = component3 + 113;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                Plans plans = (Plans) it.next();
                Object obj = null;
                if (plans != null) {
                    listEmptyList = plans.getPackageList();
                } else {
                    int i8 = ShareDataUIState + 37;
                    component3 = i8 % 128;
                    int i9 = i8 % 2;
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    int i10 = ShareDataUIState + 81;
                    component3 = i10 % 128;
                    if (i10 % 2 == 0) {
                        CollectionsKt.emptyList();
                        throw null;
                    }
                    listEmptyList = CollectionsKt.emptyList();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    List<SubBundles> childBundles = ((PackageList) it2.next()).getChildBundles();
                    if (childBundles == null) {
                        int i11 = component3 + 103;
                        ShareDataUIState = i11 % 128;
                        if (i11 % 2 != 0) {
                            CollectionsKt.emptyList();
                            throw null;
                        }
                        childBundles = CollectionsKt.emptyList();
                        int i12 = component3 + 73;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    CollectionsKt.addAll(arrayList2, childBundles);
                }
                ArrayList<SubBundles> arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                for (SubBundles subBundles : arrayList3) {
                    String productName = subBundles.getProductName();
                    if (productName == null) {
                        productName = "";
                    }
                    String strExtractValidity = ConstantsKt.extractValidity(productName);
                    String productName2 = subBundles.getProductName();
                    String str2 = productName2 == null ? "" : productName2;
                    String strValueOf = String.valueOf(subBundles.getProductAmount());
                    String productId = subBundles.getProductId();
                    if (productId == null) {
                        int i14 = ShareDataUIState + 59;
                        component3 = i14 % 128;
                        if (i14 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str = "";
                    } else {
                        str = productId;
                    }
                    arrayList4.add(new WithExpiryResp(str2, strValueOf, null, false, false, str, strExtractValidity, null, null, Keys.BUNDLE_TYPE_INTERNATIONAL, null, null, null, null, R.drawable.icon_bundle_international, null, 48540, null));
                    int i15 = component3 + 17;
                    ShareDataUIState = i15 % 128;
                    int i16 = i15 % 2;
                }
                CollectionsKt.addAll(arrayList, arrayList4);
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-54740599, true, new AnonymousClass5(arrayList, stateObserveAsState2, InternationalBundlesActivity.this), composer, 54), composer, 1572864, 63);
        }

        private static final List<Plans> component2(State<? extends List<Plans>> state) {
            int i = 2 % 2;
            int i2 = component3 + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            List<Plans> value = state.getValue();
            int i4 = component3 + 125;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final Resource<List<Plans>> component1(State<Resource<List<Plans>>> state) {
            int i = 2 % 2;
            int i2 = component3 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> value = state.getValue();
            int i4 = component3 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component3() {
        }
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 5;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 7033, (ViewConfiguration.getWindowTouchSlop() >> 8) + 34, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 18 - (Process.myTid() >> 22), (char) (51269 - Color.red(0)), -1883291598, false, $$n(b2, $$l[0], b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
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
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void f(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $10 + 29;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component1[i / i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34, (char) (ViewConfiguration.getTapTimeout() >> 16), 1159210934, false, $$n(b2, (byte) (b2 | TarHeader.LF_DIR), b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (7171 - View.resolveSize(0, 0)), 1951385784, false, $$n(b3, (byte) (b3 | TarHeader.LF_LINK), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27761), -1529629956, false, $$n(b4, (byte) (b4 | TarHeader.LF_FIFO), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1758, 34 - Color.alpha(0), (char) TextUtils.indexOf("", "", 0, 0), 1159210934, false, $$n(b5, (byte) (b5 | TarHeader.LF_DIR), b5), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3608, 28 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (AndroidCharacter.getMirror('0') + 7123), 1951385784, false, $$n(b6, (byte) (b6 | TarHeader.LF_LINK), b6), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 4013, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, (char) (TextUtils.indexOf("", "", 0) + 27761), -1529629956, false, $$n(b7, (byte) (b7 | TarHeader.LF_FIFO), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        int i7 = $10 + 17;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (cancelnotification.copydefault < i2) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr8 = {cancelnotification, cancelnotification};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault7 == null) {
                    byte b8 = (byte) 0;
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4013, TextUtils.getOffsetAfter("", 0) + 24, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27761), -1529629956, false, $$n(b8, (byte) (b8 | TarHeader.LF_FIFO), b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault7).invoke(null, objArr8);
                int i10 = 80 / 0;
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr9 = {cancelnotification, cancelnotification};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault8 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 4013, View.MeasureSpec.getMode(0) + 24, (char) (Color.green(0) + 27761), -1529629956, false, $$n(b9, (byte) (b9 | TarHeader.LF_FIFO), b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void e(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 63;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1670574543, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - ExpandableListView.getPackedPositionGroup(0L), 13 - TextUtils.getOffsetAfter("", 0), (char) ExpandableListView.getPackedPositionType(0L), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (equals) {
            int i8 = $10 + 3;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2748, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7643), -327556343, false, $$n(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i7 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!getRequestBeneficiariesState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i10 = $10 + 59;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            String str = new String(cArr5);
            int i12 = $11 + 7;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i14 = $11 + 77;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 2748, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, (char) (7643 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -327556343, false, $$n(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x22c3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x22c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01f8  */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v213, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v324 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObservers() {
        int i = 2 % 2;
        getBuyBundleViewModel().getOtherBundlesData().observe(this, new component2(new Function1() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 47;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    InternationalBundlesActivity.m11189$r8$lambda$w621WwPbWCATjoaZx7HbHUxck(this.f$0, (Resource) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitM11189$r8$lambda$w621WwPbWCATjoaZx7HbHUxck = InternationalBundlesActivity.m11189$r8$lambda$w621WwPbWCATjoaZx7HbHUxck(this.f$0, (Resource) obj);
                int i4 = component3 + 77;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitM11189$r8$lambda$w621WwPbWCATjoaZx7HbHUxck;
            }
        }));
        int i2 = copy + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObservers$lambda$0(InternationalBundlesActivity internationalBundlesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(internationalBundlesActivity, "");
        if (resource.success()) {
            int i4 = copy + 121;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                internationalBundlesActivity.getBuyBundleViewModel().filterInternationalBundles();
                throw null;
            }
            internationalBundlesActivity.getBuyBundleViewModel().filterInternationalBundles();
            int i5 = copy + 51;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onBundleSelected(WithExpiryResp bundle) {
        int i = 2 % 2;
        Bundle bundle2 = new Bundle(3);
        bundle2.putSerializable("withExpiryResp", bundle);
        bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_INTERNATIONAL);
        bundle2.putString(Keys.KEY_RETURN_DESTINATION, RoutePathConstant.SFC_INTERNATIONAL_BUNDLES);
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
        int i2 = getAsAtTimestamp + 109;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = copy + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) isFullyDrawnReported.component3[0]).getInt(null);
        int mode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
        int i5 = ~mode;
        if (i4 == (-1297376000) + (((~(2079412773 | i5)) | 978906742) * 226) + (((~(i5 | 2079981175)) | (~((-978906743) | mode)) | 978338340) * (-113)) + ((~(mode | 2079412773)) * 113)) {
            super.onStart();
            int i6 = getAsAtTimestamp + 103;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw new RuntimeException(String.valueOf(230440435));
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = ((Field) fullyDrawnReported.component1[0]).getInt(null);
        int mode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
        int i3 = ~mode;
        if (i2 != 1855184160 + ((~(1466472143 | i3)) * 979) + ((mode | 365966112) * (-979)) + (((~(mode | 1466472143)) | (~(i3 | 365966112))) * 979)) {
            int i4 = copy + 19;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[1958353863];
            iArr[1958353862] = 1;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i6 = copy + 15;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            f((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).codePointAt(0) - 14, 26 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 22, new byte[]{-118, -112, -124, -117, -113, -122, -124, -114, -115, -115, -116, -117, -118, -119, -120, -120, -121, -122}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i8 = copy + 67;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 3;
            }
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i10 = getAsAtTimestamp + 13;
                copy = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 % 2;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 42, (char) TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 56, (char) (ViewConfiguration.getLongPressTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 14251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.InternationalBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m11189$r8$lambda$w621WwPbWCATjoaZx7HbHUxck(InternationalBundlesActivity internationalBundlesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            initObservers$lambda$0(internationalBundlesActivity, resource);
            obj.hashCode();
            throw null;
        }
        Unit unitInitObservers$lambda$0 = initObservers$lambda$0(internationalBundlesActivity, resource);
        int i3 = copy + 3;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return unitInitObservers$lambda$0;
        }
        throw null;
    }

    static {
        getSponsorBeneficiariesState = 1;
        ShareDataUIState();
        component2();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = component4 + 47;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = copy + 83;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        component2 = 2693368159252235313L;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component1 = new char[]{36072, 1710, 39039, 4640, 42434, 16269, 45403, 19288, 57006, 20587, 60029, 32250, 63383, 35155, 788, 38571, 10346, 41507, 3095, 34385, 6272, 37599, 9533, 49010, 12708, 52135, 24159, 53399, 27356, 64891, 30555, 2464, 33788, 5720, 43152, 8902, 46368, 20324, 49558, 23523, 60994, 24732, 64207, 36147, 3140, 34395, 6359, 37532, 9570, 48943, 12707, 52202, 24076, 53377, 27293, 64865, 30499, 2549, 33771, 5714, 43221, 8863, 46444, 20351, 49650, 23533, 60928, 24778, 64150, 36148, 1912, 39414, 5052, 42507, 14542, 45763, 17766, 57127, 20903, 60399, 32343, 61599, 35473, 7434, 38781, 10751, 41909, 13828, 51356, 17046, 54621, 28448, 57762, 31677, 3669, 32927, 6805, 44371, 10102, 47585, 13240, 50692, 22725, 53917, 25945, 65322, 29166, 3000, 3142, 34393, 6364, 37577, 9571, 48941, 12786, 52156, 24072, 53380, 27343, 64819, 30509, 2547, 33725, 5715, 43139, 8908, 46433, 20264, 49648, 23484, 60936, 24783, 64154, 36147, 1834, 39414, 5102, 42496, 14539, 45767, 17766, 57129, 20903, 60349, 32259, 61599, 35480, 7436, 38697, 10737, 41909, 13826, 51402, 17050, 54618, 28530, 57847, 31672, 3671, 32964, 6803, 44379, 10016, 47547, 13295, 50770, 22724, 53911, 25948, 65319, 29165, 3042, 65114, 29711, 60116, 24729, 55141, 19813, 50091, 14818, 44108, 8854, 39120, 3878, 34157, 64481, 29176, 58432, 23187, 53469, 18210, 48491, 13234, 43512, 7191, 37599, 2244, 32615, 62768, 27635, 57771, 21526, 51912, 16518, 46963, 11560, 41972, 6631, 35857, 714, 30853, 61279, 25918, 56304, 20921, 50180, 15071, 45205, 10057, 40315, 5089, 35236, 64541, 29334, 59527, 24415, 54589, 19378, 49571, 13341, 43743, 8324, 38749, 3363, 33715, 63923, 27712, 58004, 22661, 53087, 17715, 48113, 12720, 42110, 3151, 34321, 6357, 37529, 9596, 48936, 3100, 34398, 6290, 37580, 9596, 49015, 12705, 52199, 24153, 53449, 27391, 64812, 30569, 2487, 33773, 5724, 44169, 9933, 47127, 12885, 34224, 8164, 37154, 27494, 65248, 28688, 51785, 23979, 55247, 43322, 9082, 46786, 3091, 34387, 6277, 37597, 9505, 49022, 12708, 52187, 24155, 53382, 27328, 64801, 30579, 2478, 33773, 37983, 7696, 32973, 2690, 48499, 10043, 43502, 21416, 50711, 18631, 62080};
        ShareDataUIState = 7015700515599975999L;
        copydefault = new char[]{30239, 30227, 30263, 30243, 30244, 30245, 30231, 30234, 30247, 30238, 30228, 30411, 30232, 30236, 30251, 30233, 30419, 30427, 30246, 30422, 30417, 30424, 30421, 30250, 30423, 30420, 30416, 30426, 30431, 30430, 30229, 30261, 30405, 30237};
        component3 = 321287816;
        getRequestBeneficiariesState = true;
        equals = true;
    }
}
