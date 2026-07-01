package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013²\u0006\"\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0016 \u0017*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00150\u0015X\u008a\u0084\u0002²\u0006\u0018\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0019X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/RoamingBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "buyBundleViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getBuyBundleViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "buyBundleViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Companion", "ConsumerSfcUI_release", "bundlesList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "kotlin.jvm.PlatformType", "bundlesResource", "Lcom/huawei/payment/mvvm/Resource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RoamingBundlesActivity extends Hilt_RoamingBundlesActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_RETURN_TO_ROAMING_BUNDLES = "extra_return_to_roaming_bundles";
    private static boolean ShareDataUIState;
    private static long component1;
    private static boolean component2;
    private static char[] component3;
    private static byte[] component4;
    private static short[] copy;
    private static int copydefault;
    private static int equals;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;

    private final Lazy buyBundleViewModel;
    private static final byte[] $$l = {106, -23, Ascii.FF, -128};
    private static final int $$m = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarHeader.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarHeader.LF_NORMAL, -69, 6, -25, 9, -19, 3, 2, -17, 56, -65, -11, -12, 9, -19, -2, 7, -17, 56, -40, -23, -23, 9, -8, -13, 5, -7, -16, 1, Ascii.FF, -35, 9, -23, -7, 8, Ascii.SYN, -43, -12, 45, -55, -6, Ascii.VT, -30, 79, -19, -18, -4, -9, -5, -5, 3, -15, -12, Base64.padSymbol, -18, -4, -9, -5, -5, 3, -15, -12, 59, -2, 56, -60, -20, -3, 0, -1, -21, -2, -5, -10, -3, 0, -1, -21, 63, -63, -8, -3, TarHeader.LF_SYMLINK, -31, -40, -3, Ascii.FS, -52, Ascii.VT, -28, Ascii.DLE, -7, -16, 1, Ascii.SYN, -43, -1, -17, -27, 1, -23, 7, Ascii.ESC, -35, -25, 13, 6, 6, -16, -39, 13, -25, 9, -18, -4, 57, -76, Ascii.FF, -25, 0, -5, -7, -4, -8, 59, -78, 7, -2, -24, 1, 9, -12, -4, -19, 8, -17, -11, -5, 4, -11, 4, -11, 0, -4, -25, -1, -9, 62, -42, 40, -78, 5, -30, 4, -12, -5, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14};
    private static final int $$k = 202;
    private static final byte[] $$d = {Ascii.SI, 58, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 201;
    private static int getShareableDataState = 0;
    private static int toString = 0;
    private static int hashCode = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int component3 = 1;
        private final Function1 ShareDataUIState;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        public final boolean equals(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 81;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
                if (obj instanceof Observer) {
                }
                return z;
            }
            if (!(obj instanceof Observer)) {
                return false;
            }
            z = false;
            int i4 = i2 + 41;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if (obj instanceof FunctionAdapter) {
                int i6 = i2 + 79;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                if (i7 == 0) {
                    int i8 = 94 / 0;
                }
                return zAreEqual;
            }
            return z;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 105;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i2 + 115;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = component1 + 99;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(int r6, short r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.$$l
            int r8 = 116 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.$$n(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 4
            int r6 = r6 + 3
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.$$d
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.g(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 112 - r8
            int r0 = 63 - r6
            int r7 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.$$j
            byte[] r0 = new byte[r0]
            int r6 = 62 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.h(short, short, int, java.lang.Object[]):void");
    }

    public static final BuyBundleViewModel access$getBuyBundleViewModel(RoamingBundlesActivity roamingBundlesActivity) {
        int i = 2 % 2;
        int i2 = hashCode + 35;
        toString = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = roamingBundlesActivity.getBuyBundleViewModel();
        int i4 = hashCode + 5;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return buyBundleViewModel;
    }

    public static final void access$onBundleSelected(RoamingBundlesActivity roamingBundlesActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = hashCode + 89;
        toString = i2 % 128;
        int i3 = i2 % 2;
        roamingBundlesActivity.onBundleSelected(withExpiryResp);
        int i4 = toString + 15;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public RoamingBundlesActivity() {
        final RoamingBundlesActivity roamingBundlesActivity = this;
        final Function0 function0 = null;
        this.buyBundleViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 105;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = roamingBundlesActivity.getViewModelStore();
                int i4 = component3 + 63;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 27 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 87;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component3 + 125;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 51;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 75;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 20 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = roamingBundlesActivity.getDefaultViewModelProviderFactory();
                int i4 = component3 + 47;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 65;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 29;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return roamingBundlesActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 75;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 51;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
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
        int i2 = toString + 95;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = (BuyBundleViewModel) this.buyBundleViewModel.getValue();
        int i4 = toString + 109;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return buyBundleViewModel;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/RoamingBundlesActivity$Companion;", "", "<init>", "()V", "EXTRA_RETURN_TO_ROAMING_BUNDLES", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component2;

        public static final Resource component3(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 3;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                copydefault(state);
                throw null;
            }
            Resource<List<Plans>> resourceCopydefault = copydefault(state);
            int i3 = component2 + 27;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return resourceCopydefault;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 51;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 11;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 1;
            private static int component3;
            final State<Resource<List<Plans>>> ShareDataUIState;
            final List<WithExpiryResp> component2;
            final RoamingBundlesActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 13;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = component3 + 49;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r12, int r13) {
                /*
                    r11 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r13 = r13 & 11
                    if (r13 != r0) goto L1c
                    int r13 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component1
                    int r13 = r13 + 95
                    int r1 = r13 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component3 = r1
                    int r13 = r13 % r0
                    boolean r13 = r12.getSkipping()
                    if (r13 != 0) goto L17
                    goto L1c
                L17:
                    r12.skipToGroupEnd()
                    goto Lac
                L1c:
                    java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp> r1 = r11.component2
                    androidx.compose.runtime.State<com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans>>> r13 = r11.ShareDataUIState
                    com.huawei.payment.mvvm.Resource r13 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.component3(r13)
                    r2 = 0
                    r3 = 1
                    if (r13 == 0) goto L39
                    boolean r13 = r13.loading()
                    if (r13 != r3) goto L39
                    int r13 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component3
                    int r13 = r13 + 47
                    int r4 = r13 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component1 = r4
                    int r13 = r13 % r0
                    r13 = r3
                    goto L3a
                L39:
                    r13 = r2
                L3a:
                    androidx.compose.runtime.State<com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans>>> r4 = r11.ShareDataUIState
                    com.huawei.payment.mvvm.Resource r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.component3(r4)
                    if (r4 == 0) goto L5c
                    int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component1
                    int r5 = r5 + 89
                    int r6 = r5 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component3 = r6
                    int r5 = r5 % r0
                    if (r5 == 0) goto L54
                    boolean r4 = r4.loading()
                    if (r4 != 0) goto L5c
                    goto L5a
                L54:
                    boolean r4 = r4.loading()
                    if (r4 != r3) goto L5c
                L5a:
                    r4 = r3
                    goto L5d
                L5c:
                    r4 = r2
                L5d:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity r6 = r11.copydefault
                    r5.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1 r6 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity r7 = r11.copydefault
                    r6.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda2 r7 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity r8 = r11.copydefault
                    r7.<init>()
                    androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.INSTANCE
                    androidx.compose.ui.Modifier r8 = (androidx.compose.ui.Modifier) r8
                    r9 = 0
                    r10 = 0
                    androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r8, r9, r3, r10)
                    androidx.compose.foundation.layout.WindowInsets$Companion r8 = androidx.compose.foundation.layout.WindowInsets.INSTANCE
                    r9 = 8
                    androidx.compose.foundation.layout.WindowInsets r8 = androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(r8, r12, r9)
                    androidx.compose.foundation.layout.WindowInsetsSides$Companion r9 = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE
                    int r9 = r9.m1267getTopJoeWqyM()
                    androidx.compose.foundation.layout.WindowInsets r8 = androidx.compose.foundation.layout.WindowInsetsKt.m1239onlybOOhFvg(r8, r9)
                    androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(r8, r12, r2)
                    androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.PaddingKt.padding(r3, r2)
                    r9 = 8
                    r10 = 0
                    r2 = r13
                    r3 = r4
                    r4 = r5
                    r5 = r6
                    r6 = r7
                    r7 = r8
                    r8 = r12
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.roamingbundles.RoamingBundlesScreenKt.RoamingBundlesScreen(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component1
                    int r12 = r12 + 49
                    int r13 = r12 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.component3 = r13
                    int r12 = r12 % r0
                Lac:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.component1.AnonymousClass4.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component2(RoamingBundlesActivity roamingBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = component1 + 49;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(roamingBundlesActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                RoamingBundlesActivity.access$onBundleSelected(roamingBundlesActivity, withExpiryResp);
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 9;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 88 / 0;
                }
                return unit;
            }

            private static final Unit component2(RoamingBundlesActivity roamingBundlesActivity) {
                int i = 2 % 2;
                int i2 = component1 + 75;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(roamingBundlesActivity, "");
                    RoamingBundlesActivity.access$getBuyBundleViewModel(roamingBundlesActivity).getExpiryBundlesCatalog();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(roamingBundlesActivity, "");
                RoamingBundlesActivity.access$getBuyBundleViewModel(roamingBundlesActivity).getExpiryBundlesCatalog();
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit ShareDataUIState(RoamingBundlesActivity roamingBundlesActivity) {
                int i = 2 % 2;
                int i2 = component1 + 73;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(roamingBundlesActivity, "");
                roamingBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 47;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit component3(RoamingBundlesActivity roamingBundlesActivity) {
                int i = 2 % 2;
                int i2 = component3 + 53;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(roamingBundlesActivity);
                int i4 = component1 + 33;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 40 / 0;
                }
                return unitComponent2;
            }

            public static Unit copydefault(RoamingBundlesActivity roamingBundlesActivity) {
                int i = 2 % 2;
                int i2 = component3 + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(roamingBundlesActivity);
                if (i3 == 0) {
                    int i4 = 91 / 0;
                }
                return unitShareDataUIState;
            }

            public static Unit component3(RoamingBundlesActivity roamingBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = component3 + 15;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return component2(roamingBundlesActivity, withExpiryResp);
                }
                component2(roamingBundlesActivity, withExpiryResp);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass4(List<WithExpiryResp> list, State<Resource<List<Plans>>> state, RoamingBundlesActivity roamingBundlesActivity) {
                this.component2 = list;
                this.ShareDataUIState = state;
                this.copydefault = roamingBundlesActivity;
            }
        }

        public final void ShareDataUIState(Composer composer, int i) {
            String str;
            String packageName;
            int i2 = 2 % 2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(RoamingBundlesActivity.access$getBuyBundleViewModel(RoamingBundlesActivity.this).getFilteredBundleData(), CollectionsKt.emptyList(), composer, 56);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(RoamingBundlesActivity.access$getBuyBundleViewModel(RoamingBundlesActivity.this).getOtherBundlesData(), composer, 8);
            List<Plans> listShareDataUIState = ShareDataUIState(stateObserveAsState);
            if (listShareDataUIState == null) {
                int i3 = ShareDataUIState + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                listShareDataUIState = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listShareDataUIState.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Plans plans = (Plans) it.next();
                List<PackageList> packageList = plans != null ? plans.getPackageList() : null;
                if (packageList == null) {
                    packageList = CollectionsKt.emptyList();
                    int i5 = component2 + 45;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = packageList.iterator();
                while (it2.hasNext()) {
                    List<SubBundles> childBundles = ((PackageList) it2.next()).getChildBundles();
                    if (childBundles == null) {
                        int i7 = component2 + 123;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        childBundles = CollectionsKt.emptyList();
                        int i9 = component2 + 85;
                        ShareDataUIState = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    CollectionsKt.addAll(arrayList2, childBundles);
                }
                ArrayList<SubBundles> arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                for (SubBundles subBundles : arrayList3) {
                    if (plans == null || (packageName = plans.getPackageName()) == null) {
                        packageName = "";
                    }
                    String productName = subBundles.getProductName();
                    if (productName == null) {
                        productName = "";
                    }
                    arrayList4.add(new Triple(packageName, subBundles, ConstantsKt.extractValidity(productName)));
                }
                CollectionsKt.addAll(arrayList, arrayList4);
            }
            ArrayList arrayList5 = arrayList;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            int i11 = 0;
            for (Object obj : arrayList5) {
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Triple triple = (Triple) obj;
                String str2 = (String) triple.component1();
                SubBundles subBundles2 = (SubBundles) triple.component2();
                String str3 = (String) triple.component3();
                int i12 = Intrinsics.areEqual(str2, "Roaming Bundles") ? R.drawable.ic_buy_bundle : !(Intrinsics.areEqual(str2, "Vodafone/Vodacom Roaming Bundles") ^ true) ? R.drawable.ic_vodacom : R.drawable.ic_gsm_roaming_bundle;
                String productName2 = subBundles2.getProductName();
                if (productName2 == null) {
                    int i13 = component2 + 123;
                    ShareDataUIState = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    str = "";
                } else {
                    str = productName2;
                }
                String strValueOf = String.valueOf(subBundles2.getProductAmount());
                String productId = subBundles2.getProductId();
                arrayList6.add(new WithExpiryResp(str, strValueOf, null, false, false, productId == null ? "" : productId, str3, null, null, Keys.BUNDLE_TYPE_ROAMING, null, str2, null, null, i12, null, 46492, null));
                i11++;
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1283043305, true, new AnonymousClass4(arrayList6, stateObserveAsState2, RoamingBundlesActivity.this), composer, 54), composer, 1572864, 63);
        }

        private static final List<Plans> ShareDataUIState(State<? extends List<Plans>> state) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            List<Plans> value = state.getValue();
            if (i3 != 0) {
                return value;
            }
            throw null;
        }

        private static final Resource<List<Plans>> copydefault(State<Resource<List<Plans>>> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> value = state.getValue();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = component2 + 103;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component1() {
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7031 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionGroup(0L) + 34, (char) (63441 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 1390, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51268), -1883291598, false, $$n(b2, b3, (byte) (b3 & 13)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 25;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void i(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component3;
        char c2 = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", c2) + 3761, Color.alpha(i3) + 24, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -1670574543, false, $$n(b2, b3, (byte) (b3 & TarHeader.LF_NORMAL)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    c2 = '0';
                    i3 = 0;
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
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0') + 14, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i5 = $10 + 101;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 2700, 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (7644 - (ViewConfiguration.getLongPressTimeout() >> 16)), -327556343, false, $$n(b4, b5, (byte) (b5 & 43)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component2) {
            int i7 = $11 + 111;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                try {
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7644), -327556343, false, $$n(b6, b7, (byte) (b7 & 43)), new Class[]{Object.class, Object.class});
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
            String str = new String(cArr5);
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
            return;
        }
        int i11 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i11;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i12 = $10 + 31;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i11 = cancelVar.component3 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(int r23, byte r24, int r25, short r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.e(int, byte, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x18ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x018c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObservers() {
        int i = 2 % 2;
        getBuyBundleViewModel().getOtherBundlesData().observe(this, new component3(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$x8aHdBmqGk4KAgV4PDYWg9KJhmI = RoamingBundlesActivity.$r8$lambda$x8aHdBmqGk4KAgV4PDYWg9KJhmI(this.f$0, (Resource) obj);
                int i5 = component1 + 43;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit$r8$lambda$x8aHdBmqGk4KAgV4PDYWg9KJhmI;
                }
                throw null;
            }
        }));
        int i2 = hashCode + 71;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit initObservers$lambda$0(com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity r5, com.huawei.payment.mvvm.Resource r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.hashCode
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.toString = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r1 == 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            boolean r6 = r6.success()
            r1 = 52
            int r1 = r1 / r2
            if (r6 == 0) goto L45
            goto L2a
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            boolean r6 = r6.success()
            r6 = r6 ^ r3
            if (r6 == 0) goto L2a
            goto L45
        L2a:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.toString
            int r6 = r6 + 93
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.hashCode = r1
            int r6 = r6 % r0
            r0 = 0
            if (r6 != 0) goto L3e
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel r5 = r5.getBuyBundleViewModel()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel.filterRoamingBundles$default(r5, r0, r2, r0)
            goto L45
        L3e:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel r5 = r5.getBuyBundleViewModel()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel.filterRoamingBundles$default(r5, r0, r3, r0)
        L45:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.initObservers$lambda$0(com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void onBundleSelected(WithExpiryResp bundle) {
        int i = 2 % 2;
        Bundle bundle2 = new Bundle(3);
        bundle2.putSerializable("withExpiryResp", bundle);
        bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_ROAMING);
        bundle2.putString(Keys.KEY_RETURN_DESTINATION, "/sfcModule/roamingBundles");
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
        int i2 = hashCode + 105;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00aa  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1054:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09a1 A[Catch: all -> 0x09a3, TryCatch #0 {all -> 0x09a3, blocks: (B:116:0x0965, B:118:0x096b, B:119:0x096c, B:121:0x096e, B:123:0x0975, B:124:0x0976, B:132:0x0989, B:134:0x098f, B:135:0x0990, B:141:0x099b, B:143:0x09a1, B:144:0x09a2, B:112:0x08e5, B:107:0x08ab, B:109:0x08b1, B:110:0x08dd), top: B:890:0x05ad, inners: #41, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x09a2 A[Catch: all -> 0x09a3, TRY_LEAVE, TryCatch #0 {all -> 0x09a3, blocks: (B:116:0x0965, B:118:0x096b, B:119:0x096c, B:121:0x096e, B:123:0x0975, B:124:0x0976, B:132:0x0989, B:134:0x098f, B:135:0x0990, B:141:0x099b, B:143:0x09a1, B:144:0x09a2, B:112:0x08e5, B:107:0x08ab, B:109:0x08b1, B:110:0x08dd), top: B:890:0x05ad, inners: #41, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0ad9 A[Catch: all -> 0x0540, TryCatch #14 {all -> 0x0540, blocks: (B:155:0x0ad3, B:157:0x0ad9, B:158:0x0b06, B:278:0x1073, B:280:0x1079, B:281:0x10a2, B:442:0x17f3, B:444:0x17f9, B:445:0x1824, B:580:0x1ef0, B:582:0x1ef6, B:583:0x1f1e, B:758:0x2df5, B:760:0x2dfb, B:761:0x2e2c, B:792:0x3144, B:794:0x314a, B:795:0x3176, B:829:0x3491, B:831:0x3497, B:832:0x34be, B:809:0x32d1, B:811:0x32f4, B:812:0x3349, B:852:0x3592, B:854:0x3598, B:855:0x35c1, B:857:0x35fb, B:858:0x3641, B:630:0x251d, B:632:0x2532, B:633:0x2566, B:635:0x259a, B:636:0x2614, B:870:0x36ff, B:872:0x3705, B:873:0x3736, B:875:0x3770, B:876:0x37b2, B:596:0x20d7, B:598:0x20ec, B:599:0x211d, B:486:0x1a1f, B:488:0x1a25, B:489:0x1a4d, B:19:0x01db, B:21:0x01e1, B:22:0x0205, B:24:0x04ad, B:26:0x04df, B:27:0x053a), top: B:916:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0be3 A[Catch: all -> 0x1009, PHI: r1 r37 r38
  0x0be3: PHI (r1v567 java.lang.Object) = (r1v561 java.lang.Object), (r1v566 java.lang.Object) binds: [B:163:0x0b8b, B:164:0x0b8d] A[DONT_GENERATE, DONT_INLINE]
  0x0be3: PHI (r37v50 ??) = (r37v94 ??), (r37v95 ??) binds: [B:163:0x0b8b, B:164:0x0b8d] A[DONT_GENERATE, DONT_INLINE]
  0x0be3: PHI (r38v69 int) = (r38v100 int), (r38v101 int) binds: [B:163:0x0b8b, B:164:0x0b8d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1009, blocks: (B:162:0x0b87, B:168:0x0be3, B:177:0x0c48, B:195:0x0d67, B:199:0x0db0), top: B:1006:0x0b87 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0c48 A[Catch: all -> 0x1009, TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1009, blocks: (B:162:0x0b87, B:168:0x0be3, B:177:0x0c48, B:195:0x0d67, B:199:0x0db0), top: B:1006:0x0b87 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x1079 A[Catch: all -> 0x0540, TryCatch #14 {all -> 0x0540, blocks: (B:155:0x0ad3, B:157:0x0ad9, B:158:0x0b06, B:278:0x1073, B:280:0x1079, B:281:0x10a2, B:442:0x17f3, B:444:0x17f9, B:445:0x1824, B:580:0x1ef0, B:582:0x1ef6, B:583:0x1f1e, B:758:0x2df5, B:760:0x2dfb, B:761:0x2e2c, B:792:0x3144, B:794:0x314a, B:795:0x3176, B:829:0x3491, B:831:0x3497, B:832:0x34be, B:809:0x32d1, B:811:0x32f4, B:812:0x3349, B:852:0x3592, B:854:0x3598, B:855:0x35c1, B:857:0x35fb, B:858:0x3641, B:630:0x251d, B:632:0x2532, B:633:0x2566, B:635:0x259a, B:636:0x2614, B:870:0x36ff, B:872:0x3705, B:873:0x3736, B:875:0x3770, B:876:0x37b2, B:596:0x20d7, B:598:0x20ec, B:599:0x211d, B:486:0x1a1f, B:488:0x1a25, B:489:0x1a4d, B:19:0x01db, B:21:0x01e1, B:22:0x0205, B:24:0x04ad, B:26:0x04df, B:27:0x053a), top: B:916:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1182 A[Catch: all -> 0x175d, PHI: r1 r29
  0x1182: PHI (r1v505 java.lang.Object) = (r1v498 java.lang.Object), (r1v503 java.lang.Object) binds: [B:286:0x1127, B:287:0x1129] A[DONT_GENERATE, DONT_INLINE]
  0x1182: PHI (r29v19 ??) = (r29v92 ??), (r29v93 ??) binds: [B:286:0x1127, B:287:0x1129] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #38 {all -> 0x175d, blocks: (B:285:0x1123, B:292:0x1182, B:296:0x11f1), top: B:959:0x1123 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x11a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1205  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x12ce  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x15d7 A[Catch: all -> 0x1717, TryCatch #71 {all -> 0x1717, blocks: (B:373:0x15cd, B:374:0x15d1, B:376:0x15d7, B:379:0x15f3, B:368:0x156a, B:372:0x15c7), top: B:1021:0x156a }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x17f9 A[Catch: all -> 0x0540, TryCatch #14 {all -> 0x0540, blocks: (B:155:0x0ad3, B:157:0x0ad9, B:158:0x0b06, B:278:0x1073, B:280:0x1079, B:281:0x10a2, B:442:0x17f3, B:444:0x17f9, B:445:0x1824, B:580:0x1ef0, B:582:0x1ef6, B:583:0x1f1e, B:758:0x2df5, B:760:0x2dfb, B:761:0x2e2c, B:792:0x3144, B:794:0x314a, B:795:0x3176, B:829:0x3491, B:831:0x3497, B:832:0x34be, B:809:0x32d1, B:811:0x32f4, B:812:0x3349, B:852:0x3592, B:854:0x3598, B:855:0x35c1, B:857:0x35fb, B:858:0x3641, B:630:0x251d, B:632:0x2532, B:633:0x2566, B:635:0x259a, B:636:0x2614, B:870:0x36ff, B:872:0x3705, B:873:0x3736, B:875:0x3770, B:876:0x37b2, B:596:0x20d7, B:598:0x20ec, B:599:0x211d, B:486:0x1a1f, B:488:0x1a25, B:489:0x1a4d, B:19:0x01db, B:21:0x01e1, B:22:0x0205, B:24:0x04ad, B:26:0x04df, B:27:0x053a), top: B:916:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x18d0  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x18e7 A[Catch: all -> 0x19b5, TryCatch #6 {all -> 0x19b5, blocks: (B:461:0x18d2, B:463:0x18e7, B:464:0x191c), top: B:901:0x18d2, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x192f A[Catch: all -> 0x19ab, TryCatch #2 {all -> 0x19ab, blocks: (B:465:0x1922, B:467:0x192f, B:468:0x19a3), top: B:893:0x1922, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1ad6  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x1b33  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1b8e A[Catch: all -> 0x1e5e, TRY_ENTER, TRY_LEAVE, TryCatch #39 {all -> 0x1e5e, blocks: (B:493:0x1ad0, B:500:0x1b26, B:510:0x1b8e), top: B:961:0x1ad0 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x1d64  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x1ef6 A[Catch: all -> 0x0540, TryCatch #14 {all -> 0x0540, blocks: (B:155:0x0ad3, B:157:0x0ad9, B:158:0x0b06, B:278:0x1073, B:280:0x1079, B:281:0x10a2, B:442:0x17f3, B:444:0x17f9, B:445:0x1824, B:580:0x1ef0, B:582:0x1ef6, B:583:0x1f1e, B:758:0x2df5, B:760:0x2dfb, B:761:0x2e2c, B:792:0x3144, B:794:0x314a, B:795:0x3176, B:829:0x3491, B:831:0x3497, B:832:0x34be, B:809:0x32d1, B:811:0x32f4, B:812:0x3349, B:852:0x3592, B:854:0x3598, B:855:0x35c1, B:857:0x35fb, B:858:0x3641, B:630:0x251d, B:632:0x2532, B:633:0x2566, B:635:0x259a, B:636:0x2614, B:870:0x36ff, B:872:0x3705, B:873:0x3736, B:875:0x3770, B:876:0x37b2, B:596:0x20d7, B:598:0x20ec, B:599:0x211d, B:486:0x1a1f, B:488:0x1a25, B:489:0x1a4d, B:19:0x01db, B:21:0x01e1, B:22:0x0205, B:24:0x04ad, B:26:0x04df, B:27:0x053a), top: B:916:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x1fa6  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x1ff4  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x20b7  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x225e  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x2dfb A[Catch: all -> 0x0540, TryCatch #14 {all -> 0x0540, blocks: (B:155:0x0ad3, B:157:0x0ad9, B:158:0x0b06, B:278:0x1073, B:280:0x1079, B:281:0x10a2, B:442:0x17f3, B:444:0x17f9, B:445:0x1824, B:580:0x1ef0, B:582:0x1ef6, B:583:0x1f1e, B:758:0x2df5, B:760:0x2dfb, B:761:0x2e2c, B:792:0x3144, B:794:0x314a, B:795:0x3176, B:829:0x3491, B:831:0x3497, B:832:0x34be, B:809:0x32d1, B:811:0x32f4, B:812:0x3349, B:852:0x3592, B:854:0x3598, B:855:0x35c1, B:857:0x35fb, B:858:0x3641, B:630:0x251d, B:632:0x2532, B:633:0x2566, B:635:0x259a, B:636:0x2614, B:870:0x36ff, B:872:0x3705, B:873:0x3736, B:875:0x3770, B:876:0x37b2, B:596:0x20d7, B:598:0x20ec, B:599:0x211d, B:486:0x1a1f, B:488:0x1a25, B:489:0x1a4d, B:19:0x01db, B:21:0x01e1, B:22:0x0205, B:24:0x04ad, B:26:0x04df, B:27:0x053a), top: B:916:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x2ec5  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x2f15  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x2f68  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x3125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x3204  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x325c  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x32b3  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x3473  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x36c8  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x18b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:946:0x0b8d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:983:0x1129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v234 */
    /* JADX WARN: Type inference failed for: r10v235 */
    /* JADX WARN: Type inference failed for: r10v240, types: [long] */
    /* JADX WARN: Type inference failed for: r10v241 */
    /* JADX WARN: Type inference failed for: r10v242 */
    /* JADX WARN: Type inference failed for: r10v243 */
    /* JADX WARN: Type inference failed for: r10v246 */
    /* JADX WARN: Type inference failed for: r10v248 */
    /* JADX WARN: Type inference failed for: r10v253, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v258 */
    /* JADX WARN: Type inference failed for: r10v259 */
    /* JADX WARN: Type inference failed for: r10v260 */
    /* JADX WARN: Type inference failed for: r10v261 */
    /* JADX WARN: Type inference failed for: r10v262 */
    /* JADX WARN: Type inference failed for: r10v263 */
    /* JADX WARN: Type inference failed for: r10v316, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v336 */
    /* JADX WARN: Type inference failed for: r10v337 */
    /* JADX WARN: Type inference failed for: r10v338 */
    /* JADX WARN: Type inference failed for: r10v339 */
    /* JADX WARN: Type inference failed for: r10v340 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v153, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v209 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v49, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v55, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v124 */
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
    /* JADX WARN: Type inference failed for: r15v146 */
    /* JADX WARN: Type inference failed for: r15v147 */
    /* JADX WARN: Type inference failed for: r15v148 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v150 */
    /* JADX WARN: Type inference failed for: r15v151 */
    /* JADX WARN: Type inference failed for: r15v152 */
    /* JADX WARN: Type inference failed for: r15v153 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v159 */
    /* JADX WARN: Type inference failed for: r15v160 */
    /* JADX WARN: Type inference failed for: r15v161 */
    /* JADX WARN: Type inference failed for: r15v162 */
    /* JADX WARN: Type inference failed for: r15v163 */
    /* JADX WARN: Type inference failed for: r15v164 */
    /* JADX WARN: Type inference failed for: r15v165 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v497 */
    /* JADX WARN: Type inference failed for: r1v499 */
    /* JADX WARN: Type inference failed for: r1v504 */
    /* JADX WARN: Type inference failed for: r1v514, types: [int] */
    /* JADX WARN: Type inference failed for: r1v515 */
    /* JADX WARN: Type inference failed for: r1v516 */
    /* JADX WARN: Type inference failed for: r1v517 */
    /* JADX WARN: Type inference failed for: r1v518 */
    /* JADX WARN: Type inference failed for: r1v519 */
    /* JADX WARN: Type inference failed for: r1v520 */
    /* JADX WARN: Type inference failed for: r1v521 */
    /* JADX WARN: Type inference failed for: r1v522 */
    /* JADX WARN: Type inference failed for: r1v532 */
    /* JADX WARN: Type inference failed for: r1v688 */
    /* JADX WARN: Type inference failed for: r1v689 */
    /* JADX WARN: Type inference failed for: r1v690 */
    /* JADX WARN: Type inference failed for: r1v691 */
    /* JADX WARN: Type inference failed for: r1v692 */
    /* JADX WARN: Type inference failed for: r1v693 */
    /* JADX WARN: Type inference failed for: r1v694 */
    /* JADX WARN: Type inference failed for: r1v695 */
    /* JADX WARN: Type inference failed for: r1v696 */
    /* JADX WARN: Type inference failed for: r1v697 */
    /* JADX WARN: Type inference failed for: r1v698 */
    /* JADX WARN: Type inference failed for: r1v699 */
    /* JADX WARN: Type inference failed for: r1v700 */
    /* JADX WARN: Type inference failed for: r1v701 */
    /* JADX WARN: Type inference failed for: r1v702 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v45 */
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r22v48 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v51 */
    /* JADX WARN: Type inference failed for: r22v52 */
    /* JADX WARN: Type inference failed for: r22v53 */
    /* JADX WARN: Type inference failed for: r22v54 */
    /* JADX WARN: Type inference failed for: r22v55 */
    /* JADX WARN: Type inference failed for: r22v56 */
    /* JADX WARN: Type inference failed for: r22v57 */
    /* JADX WARN: Type inference failed for: r22v58 */
    /* JADX WARN: Type inference failed for: r22v59 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v60 */
    /* JADX WARN: Type inference failed for: r22v61 */
    /* JADX WARN: Type inference failed for: r22v62 */
    /* JADX WARN: Type inference failed for: r22v63 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v71 */
    /* JADX WARN: Type inference failed for: r22v72 */
    /* JADX WARN: Type inference failed for: r22v73 */
    /* JADX WARN: Type inference failed for: r22v76 */
    /* JADX WARN: Type inference failed for: r22v77 */
    /* JADX WARN: Type inference failed for: r22v78 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v82 */
    /* JADX WARN: Type inference failed for: r22v83 */
    /* JADX WARN: Type inference failed for: r22v84 */
    /* JADX WARN: Type inference failed for: r22v85 */
    /* JADX WARN: Type inference failed for: r22v86 */
    /* JADX WARN: Type inference failed for: r22v87 */
    /* JADX WARN: Type inference failed for: r22v88 */
    /* JADX WARN: Type inference failed for: r22v89 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r22v90 */
    /* JADX WARN: Type inference failed for: r22v91 */
    /* JADX WARN: Type inference failed for: r22v92 */
    /* JADX WARN: Type inference failed for: r22v93 */
    /* JADX WARN: Type inference failed for: r22v94 */
    /* JADX WARN: Type inference failed for: r22v95 */
    /* JADX WARN: Type inference failed for: r22v96 */
    /* JADX WARN: Type inference failed for: r22v97 */
    /* JADX WARN: Type inference failed for: r29v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v100 */
    /* JADX WARN: Type inference failed for: r29v101 */
    /* JADX WARN: Type inference failed for: r29v102 */
    /* JADX WARN: Type inference failed for: r29v103 */
    /* JADX WARN: Type inference failed for: r29v104 */
    /* JADX WARN: Type inference failed for: r29v105 */
    /* JADX WARN: Type inference failed for: r29v106 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v26 */
    /* JADX WARN: Type inference failed for: r29v30 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v34 */
    /* JADX WARN: Type inference failed for: r29v35 */
    /* JADX WARN: Type inference failed for: r29v36 */
    /* JADX WARN: Type inference failed for: r29v37 */
    /* JADX WARN: Type inference failed for: r29v38 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v46 */
    /* JADX WARN: Type inference failed for: r29v47 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r29v51 */
    /* JADX WARN: Type inference failed for: r29v54 */
    /* JADX WARN: Type inference failed for: r29v56 */
    /* JADX WARN: Type inference failed for: r29v57 */
    /* JADX WARN: Type inference failed for: r29v58 */
    /* JADX WARN: Type inference failed for: r29v59 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v67 */
    /* JADX WARN: Type inference failed for: r29v68 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v72 */
    /* JADX WARN: Type inference failed for: r29v73 */
    /* JADX WARN: Type inference failed for: r29v74 */
    /* JADX WARN: Type inference failed for: r29v75 */
    /* JADX WARN: Type inference failed for: r29v76 */
    /* JADX WARN: Type inference failed for: r29v77 */
    /* JADX WARN: Type inference failed for: r29v79 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v82 */
    /* JADX WARN: Type inference failed for: r29v83 */
    /* JADX WARN: Type inference failed for: r29v84 */
    /* JADX WARN: Type inference failed for: r29v85 */
    /* JADX WARN: Type inference failed for: r29v86 */
    /* JADX WARN: Type inference failed for: r29v87 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r29v90 */
    /* JADX WARN: Type inference failed for: r29v91 */
    /* JADX WARN: Type inference failed for: r29v92 */
    /* JADX WARN: Type inference failed for: r29v93 */
    /* JADX WARN: Type inference failed for: r29v94 */
    /* JADX WARN: Type inference failed for: r29v95 */
    /* JADX WARN: Type inference failed for: r29v96 */
    /* JADX WARN: Type inference failed for: r29v97 */
    /* JADX WARN: Type inference failed for: r29v98 */
    /* JADX WARN: Type inference failed for: r29v99 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v507, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v511 */
    /* JADX WARN: Type inference failed for: r2v555 */
    /* JADX WARN: Type inference failed for: r2v556 */
    /* JADX WARN: Type inference failed for: r2v565, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v580 */
    /* JADX WARN: Type inference failed for: r2v676, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v766, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v767 */
    /* JADX WARN: Type inference failed for: r2v768 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v100 */
    /* JADX WARN: Type inference failed for: r37v101 */
    /* JADX WARN: Type inference failed for: r37v102 */
    /* JADX WARN: Type inference failed for: r37v103 */
    /* JADX WARN: Type inference failed for: r37v104 */
    /* JADX WARN: Type inference failed for: r37v105 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v47 */
    /* JADX WARN: Type inference failed for: r37v48 */
    /* JADX WARN: Type inference failed for: r37v50 */
    /* JADX WARN: Type inference failed for: r37v51 */
    /* JADX WARN: Type inference failed for: r37v58 */
    /* JADX WARN: Type inference failed for: r37v59 */
    /* JADX WARN: Type inference failed for: r37v60 */
    /* JADX WARN: Type inference failed for: r37v61 */
    /* JADX WARN: Type inference failed for: r37v62 */
    /* JADX WARN: Type inference failed for: r37v64 */
    /* JADX WARN: Type inference failed for: r37v65 */
    /* JADX WARN: Type inference failed for: r37v66 */
    /* JADX WARN: Type inference failed for: r37v67 */
    /* JADX WARN: Type inference failed for: r37v68 */
    /* JADX WARN: Type inference failed for: r37v69 */
    /* JADX WARN: Type inference failed for: r37v71 */
    /* JADX WARN: Type inference failed for: r37v72 */
    /* JADX WARN: Type inference failed for: r37v74 */
    /* JADX WARN: Type inference failed for: r37v81 */
    /* JADX WARN: Type inference failed for: r37v82 */
    /* JADX WARN: Type inference failed for: r37v84 */
    /* JADX WARN: Type inference failed for: r37v88 */
    /* JADX WARN: Type inference failed for: r37v89 */
    /* JADX WARN: Type inference failed for: r37v90 */
    /* JADX WARN: Type inference failed for: r37v91 */
    /* JADX WARN: Type inference failed for: r37v92 */
    /* JADX WARN: Type inference failed for: r37v93 */
    /* JADX WARN: Type inference failed for: r37v94 */
    /* JADX WARN: Type inference failed for: r37v95 */
    /* JADX WARN: Type inference failed for: r37v96 */
    /* JADX WARN: Type inference failed for: r37v97 */
    /* JADX WARN: Type inference failed for: r37v98 */
    /* JADX WARN: Type inference failed for: r37v99 */
    /* JADX WARN: Type inference failed for: r38v109 */
    /* JADX WARN: Type inference failed for: r38v110 */
    /* JADX WARN: Type inference failed for: r38v111 */
    /* JADX WARN: Type inference failed for: r38v112 */
    /* JADX WARN: Type inference failed for: r38v113 */
    /* JADX WARN: Type inference failed for: r38v114 */
    /* JADX WARN: Type inference failed for: r38v115 */
    /* JADX WARN: Type inference failed for: r38v116 */
    /* JADX WARN: Type inference failed for: r38v117 */
    /* JADX WARN: Type inference failed for: r38v118 */
    /* JADX WARN: Type inference failed for: r38v119 */
    /* JADX WARN: Type inference failed for: r38v120 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v45 */
    /* JADX WARN: Type inference failed for: r38v46 */
    /* JADX WARN: Type inference failed for: r38v47 */
    /* JADX WARN: Type inference failed for: r38v48 */
    /* JADX WARN: Type inference failed for: r38v49 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v53 */
    /* JADX WARN: Type inference failed for: r38v54 */
    /* JADX WARN: Type inference failed for: r38v55 */
    /* JADX WARN: Type inference failed for: r38v56 */
    /* JADX WARN: Type inference failed for: r38v57 */
    /* JADX WARN: Type inference failed for: r38v59 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v60 */
    /* JADX WARN: Type inference failed for: r38v61 */
    /* JADX WARN: Type inference failed for: r38v62 */
    /* JADX WARN: Type inference failed for: r38v63 */
    /* JADX WARN: Type inference failed for: r38v64 */
    /* JADX WARN: Type inference failed for: r38v65 */
    /* JADX WARN: Type inference failed for: r38v66 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r3v502, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v425 */
    /* JADX WARN: Type inference failed for: r4v426 */
    /* JADX WARN: Type inference failed for: r4v427 */
    /* JADX WARN: Type inference failed for: r4v428 */
    /* JADX WARN: Type inference failed for: r4v441 */
    /* JADX WARN: Type inference failed for: r4v442 */
    /* JADX WARN: Type inference failed for: r6v118 */
    /* JADX WARN: Type inference failed for: r6v322 */
    /* JADX WARN: Type inference failed for: r6v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v179, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v183 */
    /* JADX WARN: Type inference failed for: r7v188, types: [long] */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v191 */
    /* JADX WARN: Type inference failed for: r7v193, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v194 */
    /* JADX WARN: Type inference failed for: r7v195 */
    /* JADX WARN: Type inference failed for: r7v196 */
    /* JADX WARN: Type inference failed for: r7v197 */
    /* JADX WARN: Type inference failed for: r7v198 */
    /* JADX WARN: Type inference failed for: r7v199 */
    /* JADX WARN: Type inference failed for: r7v200 */
    /* JADX WARN: Type inference failed for: r7v201 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v350 */
    /* JADX WARN: Type inference failed for: r7v351 */
    /* JADX WARN: Type inference failed for: r7v352 */
    /* JADX WARN: Type inference failed for: r7v353 */
    /* JADX WARN: Type inference failed for: r7v354 */
    /* JADX WARN: Type inference failed for: r7v355 */
    /* JADX WARN: Type inference failed for: r7v356 */
    /* JADX WARN: Type inference failed for: r7v357 */
    /* JADX WARN: Type inference failed for: r7v358 */
    /* JADX WARN: Type inference failed for: r7v359 */
    /* JADX WARN: Type inference failed for: r7v360 */
    /* JADX WARN: Type inference failed for: r7v99, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v204 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v210, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v211 */
    /* JADX WARN: Type inference failed for: r8v216 */
    /* JADX WARN: Type inference failed for: r8v217 */
    /* JADX WARN: Type inference failed for: r8v220 */
    /* JADX WARN: Type inference failed for: r8v223 */
    /* JADX WARN: Type inference failed for: r8v224 */
    /* JADX WARN: Type inference failed for: r8v225 */
    /* JADX WARN: Type inference failed for: r8v286 */
    /* JADX WARN: Type inference failed for: r8v287 */
    /* JADX WARN: Type inference failed for: r8v289 */
    /* JADX WARN: Type inference failed for: r8v303 */
    /* JADX WARN: Type inference failed for: r8v305 */
    /* JADX WARN: Type inference failed for: r8v306 */
    /* JADX WARN: Type inference failed for: r8v318 */
    /* JADX WARN: Type inference failed for: r8v319 */
    /* JADX WARN: Type inference failed for: r8v320 */
    /* JADX WARN: Type inference failed for: r8v321 */
    /* JADX WARN: Type inference failed for: r8v322 */
    /* JADX WARN: Type inference failed for: r8v325, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v328 */
    /* JADX WARN: Type inference failed for: r8v329 */
    /* JADX WARN: Type inference failed for: r8v330 */
    /* JADX WARN: Type inference failed for: r8v331 */
    /* JADX WARN: Type inference failed for: r8v332 */
    /* JADX WARN: Type inference failed for: r8v333 */
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
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v112 */
    /* JADX WARN: Type inference failed for: r9v113 */
    /* JADX WARN: Type inference failed for: r9v118 */
    /* JADX WARN: Type inference failed for: r9v119 */
    /* JADX WARN: Type inference failed for: r9v120 */
    /* JADX WARN: Type inference failed for: r9v121 */
    /* JADX WARN: Type inference failed for: r9v122 */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v124 */
    /* JADX WARN: Type inference failed for: r9v125 */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v127 */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v130 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v132 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v136 */
    /* JADX WARN: Type inference failed for: r9v137 */
    /* JADX WARN: Type inference failed for: r9v138 */
    /* JADX WARN: Type inference failed for: r9v139 */
    /* JADX WARN: Type inference failed for: r9v140 */
    /* JADX WARN: Type inference failed for: r9v141 */
    /* JADX WARN: Type inference failed for: r9v142 */
    /* JADX WARN: Type inference failed for: r9v143 */
    /* JADX WARN: Type inference failed for: r9v144 */
    /* JADX WARN: Type inference failed for: r9v145 */
    /* JADX WARN: Type inference failed for: r9v146 */
    /* JADX WARN: Type inference failed for: r9v147 */
    /* JADX WARN: Type inference failed for: r9v148 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v92 */
    /* JADX WARN: Type inference failed for: r9v94, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v99, types: [java.lang.Class[]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.RoamingBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$x8aHdBmqGk4KAgV4PDYWg9KJhmI(RoamingBundlesActivity roamingBundlesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = toString + 75;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return initObservers$lambda$0(roamingBundlesActivity, resource);
        }
        initObservers$lambda$0(roamingBundlesActivity, resource);
        throw null;
    }

    static {
        getSponsorBeneficiariesState = 1;
        ShareDataUIState();
        component1();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = getShareableDataState + 125;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = toString + 119;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 == 0) {
            component3 = new char[]{30256, 30244, 30250, 30437, 30255, 30242, 30262, 30236, 30258, 30254, 30259, 30252, 30243, 30251, 30247, 30238, 30245, 30240, 30241, 30253, 30410, 30407, 30269, 30451, 30438};
            copydefault = 321287831;
            component2 = false;
        } else {
            component3 = new char[]{30256, 30244, 30250, 30437, 30255, 30242, 30262, 30236, 30258, 30254, 30259, 30252, 30243, 30251, 30247, 30238, 30245, 30240, 30241, 30253, 30410, 30407, 30269, 30451, 30438};
            copydefault = 321287831;
            component2 = true;
        }
        ShareDataUIState = true;
        int i4 = i3 + 45;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        component1 = 283776405703256590L;
        getRequestBeneficiariesState = -1436777263;
        getAsAtTimestamp = -238323850;
        equals = -1026708451;
        component4 = new byte[]{-8, 7, -44, 42, -42, 44, -43, -41, -4, -41, 3, 46, 40, 40, -26, -43, -42, 41, 44, -42, 7, -25, 7, 45, -26, 6, 42, -5, 5, 41, 45, -26, 5, -8, Ascii.ESC, -45, 41, 42, -6, Ascii.SUB, -30, 43, 5, 40, -7, Ascii.FS, -47, -15, -56, 42, -44, 47, -46, -42, 47, -44, -41, -5, 7, 40, -4, 40, 6, -25, Ascii.SUB, -43, 41, -26, Ascii.FS, -47, 40, -4, 41, Ascii.ESC, -28, -42, 42, -42, 2, 33, -25, 5, -41, 43, 42, -26, 40, 2, 44, 42, -29, Ascii.US, -25, 3, 33, -44, -7, 41, 4, -44, 44, 42, -30, Ascii.GS, -26, 41, 6, 45, -42, -41, -26, Ascii.ESC, -114, 44, -45, 42, 42, -36, -98, 33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -123, -45, -44, 46, -46, 40, -44, 44, -46, 46, -41, -126, -44, 46, -46, 40, -44, 44, -46, 46, -41};
    }
}
