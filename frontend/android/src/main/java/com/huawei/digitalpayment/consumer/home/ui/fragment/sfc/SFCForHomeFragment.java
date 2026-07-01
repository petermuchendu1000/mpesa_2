package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.SizeUtils;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.digitalpayment.consumer.base.util.SFCUserConfigManager;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment;
import com.huawei.digitalpayment.consumer.home.ui.homebalancesection.BalanceSectionKt;
import com.huawei.digitalpayment.consumer.home.ui.homebalancesection.GsmBalancesUiState;
import com.huawei.digitalpayment.consumer.home.ui.homebalancesection.MpesaBalanceUiState;
import com.huawei.digitalpayment.consumer.home.ui.viewmodel.AirtimeBalanceViewModel;
import com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.home.data.HomeConfigManager;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeConfig;
import com.huawei.digitalpayment.home.util.BalanceHelper;
import com.huawei.digitalpayment.home.viewmodel.HomeViewModel;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.convert.BaseDataConvertAdapter;
import com.huawei.http.convert.DataConvertManager;
import com.safaricom.designsystem.components.bubble.ArrowAlignment;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialRectProvider;
import com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.getNightModeactivity_release;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.light;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\u0016\u0010&\u001a\u00020\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/SFCForHomeFragment;", "Lcom/huawei/common/fragment/BaseFragment;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/FragmentSfcForHomeBinding;", "viewModel", "Lcom/huawei/digitalpayment/home/viewmodel/HomeViewModel;", "airtimeBalanceViewModel", "Lcom/huawei/digitalpayment/consumer/home/ui/viewmodel/AirtimeBalanceViewModel;", "welcomeTutorialViewModel", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialViewModel;", "getWelcomeTutorialViewModel", "()Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialViewModel;", "welcomeTutorialViewModel$delegate", "Lkotlin/Lazy;", "balancesViewModel", "Lcom/huawei/digitalpayment/consumer/home/ui/viewmodel/BalancesViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initObserver", "updateDynamicMenu", "homeFunction", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "initView", "setupBalanceSection", "onViewCreated", "view", "onResume", "setupWelcomeTutorial", "miniappViews", "Companion", "ConsumerHomeUi_release", "mpesaBalanceState", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/MpesaBalanceUiState;", "gsmBalanceState", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/GsmBalancesUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCForHomeFragment extends BaseFragment {
    public static final int $stable;
    private static int ArtificialStackFrames = 0;

    public static final Companion INSTANCE;
    public static final String MENU_TYPE_DO_MORE_WITH_MPESA = "doMoreWithMpesa";
    public static final String MENU_TYPE_ENTERTAINMENT = "entertainment";
    public static final String MENU_TYPE_EXPLORE_DISCOVER = "exploreDiscover";
    public static final String MENU_TYPE_EXPLORE_DISCOVER_DEALSE = "exploreDiscoverDeals";
    public static final String MENU_TYPE_FREQUENTS = "frequents";
    public static final String MENU_TYPE_MINIAPPS = "miniApps";
    public static final String MENU_TYPE_MYFINANCES = "myFinances";
    public static final String MENU_TYPE_SERVICE = "services";
    private static byte[] component4;
    private static short[] copy;
    private static int equals;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private FragmentSfcForHomeBinding ShareDataUIState;
    private AirtimeBalanceViewModel component1;
    private final Lazy component2;
    private HomeViewModel component3;
    private BalancesViewModel copydefault;
    private static final byte[] $$c = {46, -95, Ascii.VT, -87};
    private static final int $$f = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {75, -35, 114, TarHeader.LF_CHR, -23, -9, TarHeader.LF_BLK, PSSSigner.TRAILER_IMPLICIT, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -74, 1, -30, 4, -24, -2, -3, -22, TarHeader.LF_CHR, -70, -16, -17, 4, -24, -7, 2, -22, TarHeader.LF_CHR, -45, -28, -28, 4, -13, -18, 0, -12, -21, -4, 7, -40, 4, -28, -12, 3, 17, -48, -17, 40, -60, -11, 6, -35, 74, -24, -23, -9, -14, -10, -10, -2, -20, -17, 56, -23, -9, -14, -10, -10, -2, -20, -17, TarHeader.LF_FIFO};
    private static final int $$e = 136;
    private static final byte[] $$a = {70, 83, 77, 1, -26, -15, -23, -26, -12, -17, -13, -13, -5, -23, -20, TarHeader.LF_SYMLINK, -12, -29, 20, -33, -26, -18, 2, -28, -15, 36, -49, -23, -5, -15, -17, -8, -20, -6, -31, -5, -10, -28, Ascii.DC2, -47, 5, -33, 1};
    private static final int $$b = 186;
    private static int hashCode = 0;
    private static int toString = 0;
    private static int getSponsorBeneficiariesState = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int component3;
        private final Function1 copydefault;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[PHI: r2
  0x0019: PHI (r2v2 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.component2.ShareDataUIState
                int r1 = r1 + 51
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.component2.component3 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L14
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                r2 = 1
                if (r1 == 0) goto L2e
                goto L19
            L14:
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L2e
            L19:
                boolean r1 = r4 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L2e
                r1 = r3
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r4 = (kotlin.jvm.internal.FunctionAdapter) r4
                kotlin.Function r4 = r4.getFunctionDelegate()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            L2e:
                int r4 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.component2.ShareDataUIState
                int r4 = r4 + 77
                int r1 = r4 % 128
                com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.component2.component3 = r1
                int r4 = r4 % r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                Function1 function1 = this.copydefault;
                throw null;
            }
            Function1 function12 = this.copydefault;
            int i4 = i3 + 111;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return function12;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            int i4 = component3 + 21;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, int r6, short r7) {
        /*
            int r7 = r7 + 112
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.$$g(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.$$a
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 6
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 103 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
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
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-14)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.$$d
            int r6 = r6 * 3
            int r6 = 99 - r6
            int r7 = 74 - r7
            int r8 = r8 * 53
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.c(byte, int, byte, java.lang.Object[]):void");
    }

    public SFCForHomeFragment() {
        final SFCForHomeFragment sFCForHomeFragment = this;
        final Function0 function0 = null;
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(sFCForHomeFragment, Reflection.getOrCreateKotlinClass(WelcomeTutorialViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 9;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component1 + 1;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 58 / 0;
                }
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 29;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    sFCForHomeFragment.requireActivity().getViewModelStore();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = sFCForHomeFragment.requireActivity().getViewModelStore();
                int i3 = copydefault + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 85;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 39;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 113;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = sFCForHomeFragment.requireActivity().getDefaultViewModelCreationExtras();
                int i4 = ShareDataUIState + 119;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 113;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = ShareDataUIState + 75;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 93;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sFCForHomeFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component3 + 19;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 21 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    public static final BalancesViewModel access$getBalancesViewModel$p(SFCForHomeFragment sFCForHomeFragment) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 85;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        BalancesViewModel balancesViewModel = sFCForHomeFragment.copydefault;
        int i5 = i2 + 119;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return balancesViewModel;
        }
        throw null;
    }

    private final WelcomeTutorialViewModel ShareDataUIState() {
        int i = 2 % 2;
        int i2 = toString + 121;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        WelcomeTutorialViewModel welcomeTutorialViewModel = (WelcomeTutorialViewModel) this.component2.getValue();
        if (i3 != 0) {
            return welcomeTutorialViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = toString + 85;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
            if (objCopydefault == null) {
                int i3 = 2406 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                byte b2 = $$a[3];
                byte b3 = (byte) (b2 - 1);
                byte b4 = b2;
                Object[] objArr2 = new Object[1];
                a(b3, b4, (byte) (b4 - 1), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3, iKeyCodeFromString, cRgb, -2047739879, false, (String) objArr2[0], null);
            }
            ((Field) objCopydefault).getLong(null);
            throw null;
        }
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault2 == null) {
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2405;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b5 = $$a[3];
            byte b6 = (byte) (b5 - 1);
            byte b7 = b5;
            Object[] objArr3 = new Object[1];
            a(b6, b7, (byte) (b7 - 1), objArr3);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, iIndexOf, c2, -2047739879, false, (String) objArr3[0], null);
        }
        if (((Field) objCopydefault2).getLong(null) != -1) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault3 == null) {
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 2405;
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                byte b8 = $$a[3];
                byte b9 = b8;
                Object[] objArr4 = new Object[1];
                a(b8, b9, b9, objArr4);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString2, jumpTapTimeout2, c3, 24929979, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault3).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            b((short) View.MeasureSpec.getMode(0), (byte) ((-41) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1276835622 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) - 25, (ViewConfiguration.getPressedStateDuration() >> 16) + 1001050793, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((-122) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1276835637 - (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString("") - 24, 1001050792 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, -893646376};
                byte[] bArr = $$d;
                byte b10 = bArr[46];
                Object[] objArr8 = new Object[1];
                c(b10, (byte) (b10 | 71), bArr[23], objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b11 = bArr[46];
                Object[] objArr9 = new Object[1];
                c(b11, (byte) (-bArr[5]), b11, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2405;
                    int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    byte b12 = $$a[3];
                    byte b13 = b12;
                    Object[] objArr10 = new Object[1];
                    a(b12, b13, b13, objArr10);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i4, edgeSlop, cIndexOf, 24929979, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((short) (ImageFormat.getBitsPerPixel(0) + 1), (byte) (73 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 1276835652, (-20) - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "", 0) + 1001050784, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (85 - Color.red(0)), 1276835672 - MotionEvent.axisFromString(""), (-25) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1001050788 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault5 == null) {
                        int gidForName = 2404 - Process.getGidForName("");
                        int iIndexOf2 = 25 - TextUtils.indexOf((CharSequence) "", '0');
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b14 = (byte) ($$a[40] - 1);
                        byte b15 = (byte) (b14 - 4);
                        Object[] objArr13 = new Object[1];
                        a(b14, b15, (byte) (b15 + 4), objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iIndexOf2, longPressTimeout, -1843538389, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault6 == null) {
                        int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2405;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 27;
                        char c4 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        byte b16 = $$a[3];
                        byte b17 = (byte) (b16 - 1);
                        byte b18 = b16;
                        Object[] objArr14 = new Object[1];
                        a(b17, b18, (byte) (b18 - 1), objArr14);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i5, iLastIndexOf, c4, -2047739879, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6666 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) TextUtils.getOffsetAfter("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                try {
                    Object[] objArr15 = {-577759272, Long.valueOf(j4), new ArrayList(), null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0, 0), 56 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b19 = $$d[46];
                    byte b20 = b19;
                    Object[] objArr16 = new Object[1];
                    c(b19, b20, b20, objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
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
        } else {
            int i8 = toString + 69;
            getSponsorBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
        }
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.component3 = (HomeViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(HomeViewModel.class);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        this.component1 = (AirtimeBalanceViewModel) new ViewModelProvider(fragmentActivityRequireActivity2).get(AirtimeBalanceViewModel.class);
        FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
        this.copydefault = (BalancesViewModel) new ViewModelProvider(fragmentActivityRequireActivity3).get(BalancesViewModel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.getSponsorBeneficiariesState
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.toString = r1
            int r0 = r0 % r7
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L2e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            android.view.LayoutInflater r5 = r4.getLayoutInflater(r5)
            int r0 = com.huawei.digitalpayment.consumer.homeui.R.layout.fragment_sfc_for_home
            r3 = 1
            androidx.databinding.ViewDataBinding r5 = androidx.databinding.DataBindingUtil.inflate(r5, r0, r6, r3)
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding r5 = (com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding) r5
            r4.ShareDataUIState = r5
            r4.component3()
            r4.component2()
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding r5 = r4.ShareDataUIState
            if (r5 != 0) goto L5e
            goto L4a
        L2e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            android.view.LayoutInflater r5 = r4.getLayoutInflater(r5)
            int r0 = com.huawei.digitalpayment.consumer.homeui.R.layout.fragment_sfc_for_home
            r3 = 0
            androidx.databinding.ViewDataBinding r5 = androidx.databinding.DataBindingUtil.inflate(r5, r0, r6, r3)
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding r5 = (com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding) r5
            r4.ShareDataUIState = r5
            r4.component3()
            r4.component2()
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcForHomeBinding r5 = r4.ShareDataUIState
            if (r5 != 0) goto L5e
        L4a:
            int r5 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.toString
            int r5 = r5 + 53
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.getSponsorBeneficiariesState = r6
            int r5 = r5 % r7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            if (r5 == 0) goto L5a
            r5 = r1
            goto L5e
        L5a:
            r1.hashCode()
            throw r1
        L5e:
            android.view.View r5 = r5.getRoot()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            int r6 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.toString
            int r6 = r6 + 115
            int r0 = r6 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.getSponsorBeneficiariesState = r0
            int r6 = r6 % r7
            if (r6 == 0) goto L71
            return r5
        L71:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List ShareDataUIState(com.huawei.digitalpayment.home.data.source.locaL.LocalHomeConfig r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.toString
            int r2 = r1 + 105
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.getSponsorBeneficiariesState = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 72
            int r2 = r2 / 0
            if (r4 == 0) goto L23
            goto L17
        L15:
            if (r4 == 0) goto L23
        L17:
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            java.util.List r4 = r4.getHomeFunction()
            goto L2b
        L23:
            int r3 = r3 + 111
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.toString = r4
            int r3 = r3 % r0
            r4 = 0
        L2b:
            int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.getSponsorBeneficiariesState
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.toString = r2
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.ShareDataUIState(com.huawei.digitalpayment.home.data.source.locaL.LocalHomeConfig):java.util.List");
    }

    private final void component2() {
        int i = 2 % 2;
        Transformations.map(HomeConfigManager.INSTANCE.getlocalHomeConfig(), new Function1() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 95;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                List list$r8$lambda$IftEkWeXy3S4_ZWKoZQ0JZph1jw = SFCForHomeFragment.$r8$lambda$IftEkWeXy3S4_ZWKoZQ0JZph1jw((LocalHomeConfig) obj);
                int i5 = component2 + 23;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return list$r8$lambda$IftEkWeXy3S4_ZWKoZQ0JZph1jw;
            }
        }).observe(getViewLifecycleOwner(), new component2(new Function1() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                Unit unitM10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY;
                int i2 = 2 % 2;
                int i3 = component2 + 71;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    unitM10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY = SFCForHomeFragment.m10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY(this.f$0, (List) obj);
                    int i4 = 59 / 0;
                } else {
                    unitM10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY = SFCForHomeFragment.m10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY(this.f$0, (List) obj);
                }
                int i5 = component1 + 5;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitM10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = toString + 125;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit component3(SFCForHomeFragment sFCForHomeFragment, List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sFCForHomeFragment, "");
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            int i2 = getSponsorBeneficiariesState + 15;
            toString = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
        }
        arrayList.addAll(list);
        Iterator<LocalFunctionGroup> it = arrayList.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            int i5 = toString + 123;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            if (Intrinsics.areEqual(it.next().getMenuType(), MENU_TYPE_MYFINANCES)) {
                break;
            }
            i4++;
            int i7 = getSponsorBeneficiariesState + 105;
            toString = i7 % 128;
            int i8 = i7 % 2;
        }
        if (i4 >= 0) {
            arrayList.add(i4 + 1, new LocalFunctionGroup("quick_actions", "entertainment", "Entertainment", null, null, null, 56, null));
        }
        sFCForHomeFragment.component1(arrayList);
        return Unit.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class component3 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 1;
            private static int component3;
            final SFCForHomeFragment component1;

            public static Object component2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~i2;
                int i8 = ~i5;
                int i9 = ~(i7 | i8);
                int i10 = ~((~i4) | i2);
                int i11 = i9 | i10 | (~(i2 | i5));
                int i12 = (~(i5 | i4)) | (~(i7 | i4));
                int i13 = i8 | i10;
                int i14 = i4 + i2 + i6 + (793188503 * i) + (2090109681 * i3);
                int i15 = i14 * i14;
                int i16 = (837707615 * i4) + 1286602752 + ((-1676358574) * i2) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i6) + (1186463744 * i) + (1166540800 * i3) + ((-1956446208) * i15);
                int i17 = ((i4 * 1389925299) - 652765764) + (i2 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i6 * 1389926445) + (i * (-1551828341)) + (i3 * (-2047638435)) + (i15 * 1214709760);
                if (i16 + (i17 * i17 * 445972480) != 1) {
                    return component2(objArr);
                }
                SFCForHomeFragment sFCForHomeFragment = (SFCForHomeFragment) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i18 = 2 % 2;
                int i19 = component2 + 81;
                component3 = i19 % 128;
                int i20 = i19 % 2;
                Unit unitComponent3 = component3(sFCForHomeFragment, zBooleanValue);
                int i21 = component3 + 83;
                component2 = i21 % 128;
                int i22 = i21 % 2;
                return unitComponent3;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 45;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 121;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            public final void component2(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                component3 = i3 % 128;
                if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 73) == 3) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    int i4 = component3 + 81;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 5;
                    }
                }
                BalancesViewModel balancesViewModelAccess$getBalancesViewModel$p = SFCForHomeFragment.access$getBalancesViewModel$p(this.component1);
                BalancesViewModel balancesViewModel = null;
                if (balancesViewModelAccess$getBalancesViewModel$p == null) {
                    int i6 = component3 + 91;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    balancesViewModelAccess$getBalancesViewModel$p = null;
                }
                State stateCollectAsState = SnapshotStateKt.collectAsState(balancesViewModelAccess$getBalancesViewModel$p.getMpesaBalanceUiState(), null, composer, 8, 1);
                BalancesViewModel balancesViewModelAccess$getBalancesViewModel$p2 = SFCForHomeFragment.access$getBalancesViewModel$p(this.component1);
                if (balancesViewModelAccess$getBalancesViewModel$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    balancesViewModelAccess$getBalancesViewModel$p2 = null;
                }
                State stateCollectAsState2 = SnapshotStateKt.collectAsState(balancesViewModelAccess$getBalancesViewModel$p2.getGsmBalancesUiState(), null, composer, 8, 1);
                MpesaBalanceUiState mpesaBalanceUiStateComponent1 = component1(stateCollectAsState);
                GsmBalancesUiState gsmBalancesUiStateComponent3 = component3(stateCollectAsState2);
                BalancesViewModel balancesViewModelAccess$getBalancesViewModel$p3 = SFCForHomeFragment.access$getBalancesViewModel$p(this.component1);
                if (balancesViewModelAccess$getBalancesViewModel$p3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = component3 + 47;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    balancesViewModel = balancesViewModelAccess$getBalancesViewModel$p3;
                }
                boolean zIsGsmLogin = balancesViewModel.isGsmLogin();
                final SFCForHomeFragment sFCForHomeFragment = this.component1;
                BalanceSectionKt.BalanceSection(mpesaBalanceUiStateComponent1, gsmBalancesUiStateComponent3, zIsGsmLogin, new Function1() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i10 = 2 % 2;
                        int i11 = component3 + 13;
                        copydefault = i11 % 128;
                        int i12 = i11 % 2;
                        SFCForHomeFragment sFCForHomeFragment2 = sFCForHomeFragment;
                        Boolean bool = (Boolean) obj;
                        if (i12 == 0) {
                            return (Unit) SFCForHomeFragment.component3.AnonymousClass3.component2(new Object[]{sFCForHomeFragment2, Boolean.valueOf(bool.booleanValue())}, DiskLruCache.AnonymousClass1.component3(), 1666474624, DiskLruCache.AnonymousClass1.component3(), -1666474623, DiskLruCache.AnonymousClass1.component3(), DiskLruCache.AnonymousClass1.component3());
                        }
                        throw null;
                    }
                }, new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = ShareDataUIState + 67;
                        copydefault = i11 % 128;
                        if (i11 % 2 != 0) {
                            SFCForHomeFragment.component3.AnonymousClass3.ShareDataUIState();
                            throw null;
                        }
                        Unit unitShareDataUIState = SFCForHomeFragment.component3.AnonymousClass3.ShareDataUIState();
                        int i12 = ShareDataUIState + 37;
                        copydefault = i12 % 128;
                        if (i12 % 2 == 0) {
                            return unitShareDataUIState;
                        }
                        throw null;
                    }
                }, new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = component3 + 51;
                        ShareDataUIState = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitComponent2 = SFCForHomeFragment.component3.AnonymousClass3.component2();
                        int i13 = component3 + 93;
                        ShareDataUIState = i13 % 128;
                        int i14 = i13 % 2;
                        return unitComponent2;
                    }
                }, new Function0() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = component2 + 29;
                        copydefault = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitComponent1 = SFCForHomeFragment.component3.AnonymousClass3.component1();
                        int i13 = copydefault + 53;
                        component2 = i13 % 128;
                        int i14 = i13 % 2;
                        return unitComponent1;
                    }
                }, composer, 1794112, 0);
            }

            private static final Unit component3(SFCForHomeFragment sFCForHomeFragment, boolean z) {
                int i = 2 % 2;
                int i2 = component2 + 117;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sFCForHomeFragment, "");
                BalancesViewModel balancesViewModelAccess$getBalancesViewModel$p = SFCForHomeFragment.access$getBalancesViewModel$p(sFCForHomeFragment);
                if (balancesViewModelAccess$getBalancesViewModel$p == null) {
                    int i4 = component3 + 103;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    balancesViewModelAccess$getBalancesViewModel$p = null;
                }
                balancesViewModelAccess$getBalancesViewModel$p.toggleBalanceVisibility(z);
                return Unit.INSTANCE;
            }

            private static final Unit component3() {
                int i = 2 % 2;
                int i2 = component2 + 59;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit copydefault() {
                int i = 2 % 2;
                int i2 = component3 + 17;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    RouteUtils.routeWithExecute(RoutePathConstant.SFC_MPESA_STATEMENT);
                    return Unit.INSTANCE;
                }
                RouteUtils.routeWithExecute(RoutePathConstant.SFC_MPESA_STATEMENT);
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static Object component2(Object[] objArr) {
                int i = 2 % 2;
                int i2 = component3 + 65;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                RouteUtils.routeWithExecute(RoutePathConstant.SFC_BALANCES);
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 119;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final MpesaBalanceUiState component1(State<MpesaBalanceUiState> state) {
                int i = 2 % 2;
                int i2 = component2 + 101;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                MpesaBalanceUiState value = state.getValue();
                if (i3 != 0) {
                    int i4 = 52 / 0;
                }
                return value;
            }

            private static final GsmBalancesUiState component3(State<GsmBalancesUiState> state) {
                int i = 2 % 2;
                int i2 = component2 + 47;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                GsmBalancesUiState value = state.getValue();
                int i4 = component3 + 115;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return value;
                }
                throw null;
            }

            public static Unit component2() {
                int i = 2 % 2;
                int i2 = component3 + 61;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    copydefault();
                    throw null;
                }
                Unit unitCopydefault = copydefault();
                int i3 = component2 + 71;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return unitCopydefault;
                }
                throw null;
            }

            public static Unit ShareDataUIState(SFCForHomeFragment sFCForHomeFragment, boolean z) {
                return (Unit) component2(new Object[]{sFCForHomeFragment, Boolean.valueOf(z)}, DiskLruCache.AnonymousClass1.component3(), 1666474624, DiskLruCache.AnonymousClass1.component3(), -1666474623, DiskLruCache.AnonymousClass1.component3(), DiskLruCache.AnonymousClass1.component3());
            }

            public static Unit ShareDataUIState() {
                int i = 2 % 2;
                int i2 = component3 + 105;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3();
                int i4 = component3 + 109;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit component1() {
                int i = 2 % 2;
                int i2 = component2 + 101;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) component2(new Object[0], DiskLruCache.AnonymousClass1.component3(), 2127558001, DiskLruCache.AnonymousClass1.component3(), -2127558001, DiskLruCache.AnonymousClass1.component3(), DiskLruCache.AnonymousClass1.component3());
                int i4 = component3 + 13;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 56 / 0;
                }
                return unit;
            }

            AnonymousClass3(SFCForHomeFragment sFCForHomeFragment) {
                this.component1 = sFCForHomeFragment;
            }

            private static final Unit copy() {
                return (Unit) component2(new Object[0], DiskLruCache.AnonymousClass1.component3(), 2127558001, DiskLruCache.AnonymousClass1.component3(), -2127558001, DiskLruCache.AnonymousClass1.component3(), DiskLruCache.AnonymousClass1.component3());
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i3 = component2 + 83;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                int i5 = ShareDataUIState + 65;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-270043616, true, new AnonymousClass3(SFCForHomeFragment.this), composer, 54), composer, 1572864, 63);
        }

        component3() {
        }

        public static void copydefault() {
            getNightModeactivity_release.ShareDataUIState[0] = light.ShareDataUIState[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.b(short, byte, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component1(java.util.List<com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup> r8) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment.component1(java.util.List):void");
    }

    private final void component3() {
        int i = 2 % 2;
        DataConvertManager.addConvertAdapter(new BaseDataConvertAdapter() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String redirectPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 27;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                String strRedirectPath = BaseDataConvertAdapter.DefaultImpls.redirectPath(this);
                int i5 = component2 + 97;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return strRedirectPath;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public String path() {
                int i2 = 2 % 2;
                int i3 = component1 + 15;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "queryBalance";
                }
                int i4 = 36 / 0;
                return "queryBalance";
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r1
  0x0041: PHI (r1v7 com.huawei.digitalpayment.home.data.source.remote.RemoteBalance) = 
  (r1v6 com.huawei.digitalpayment.home.data.source.remote.RemoteBalance)
  (r1v12 com.huawei.digitalpayment.home.data.source.remote.RemoteBalance)
 binds: [B:8:0x003f, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object transfer(com.google.gson.JsonObject r13) {
                /*
                    r12 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment$initView$1.component2
                    int r1 = r1 + 69
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment$initView$1.component1 = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    java.lang.String r3 = "unit"
                    if (r1 == 0) goto L2c
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
                    java.lang.String r1 = r13.toString()
                    java.lang.Class<com.huawei.digitalpayment.home.data.source.remote.RemoteBalance> r2 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.class
                    java.lang.Object r1 = com.huawei.common.util.SecureGsonUtils.fromJson(r1, r2)
                    com.huawei.digitalpayment.home.data.source.remote.RemoteBalance r1 = (com.huawei.digitalpayment.home.data.source.remote.RemoteBalance) r1
                    com.google.gson.JsonElement r2 = r13.get(r3)
                    r4 = 70
                    int r4 = r4 / 0
                    if (r2 == 0) goto L61
                    goto L41
                L2c:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
                    java.lang.String r1 = r13.toString()
                    java.lang.Class<com.huawei.digitalpayment.home.data.source.remote.RemoteBalance> r2 = com.huawei.digitalpayment.home.data.source.remote.RemoteBalance.class
                    java.lang.Object r1 = com.huawei.common.util.SecureGsonUtils.fromJson(r1, r2)
                    com.huawei.digitalpayment.home.data.source.remote.RemoteBalance r1 = (com.huawei.digitalpayment.home.data.source.remote.RemoteBalance) r1
                    com.google.gson.JsonElement r2 = r13.get(r3)
                    if (r2 == 0) goto L61
                L41:
                    com.google.gson.JsonElement r13 = r13.get(r3)
                    java.lang.String r13 = r13.getAsString()
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.util.Map r2 = (java.util.Map) r2
                    r2.put(r3, r13)
                    if (r1 == 0) goto L61
                    int r13 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment$initView$1.component1
                    int r13 = r13 + 37
                    int r3 = r13 % 128
                    com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment$initView$1.component2 = r3
                    int r13 = r13 % r0
                    r1.setExtension(r2)
                L61:
                    if (r1 == 0) goto L7e
                    java.lang.String r13 = r1.getAmount()
                    java.lang.String r0 = r1.getUnitType()
                    java.lang.String r2 = r1.getAmountDisplay()
                    java.lang.String r3 = r1.getCurrency()
                    com.huawei.digitalpayment.home.data.local.LocalBalance r4 = new com.huawei.digitalpayment.home.data.local.LocalBalance
                    r4.<init>(r13, r0, r2, r3)
                    com.huawei.http.BaseResp r1 = (com.huawei.http.BaseResp) r1
                    r4.copyExtension(r1)
                    return r4
                L7e:
                    com.huawei.digitalpayment.home.data.local.LocalBalance r13 = new com.huawei.digitalpayment.home.data.local.LocalBalance
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 15
                    r11 = 0
                    r5 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCForHomeFragment$initView$1.transfer(com.google.gson.JsonObject):java.lang.Object");
            }
        });
        BalanceHelper.INSTANCE.setNeedRefresh(true);
        copydefault();
        int i2 = toString + 51;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/SFCForHomeFragment$Companion;", "", "<init>", "()V", "MENU_TYPE_SERVICE", "", "MENU_TYPE_FREQUENTS", "MENU_TYPE_EXPLORE_DISCOVER_DEALSE", "MENU_TYPE_EXPLORE_DISCOVER", "MENU_TYPE_MYFINANCES", "MENU_TYPE_ENTERTAINMENT", "MENU_TYPE_DO_MORE_WITH_MPESA", "MENU_TYPE_MINIAPPS", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void copydefault() {
        int i = 2 % 2;
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding = this.ShareDataUIState;
        if (fragmentSfcForHomeBinding == null) {
            int i2 = getSponsorBeneficiariesState + 3;
            toString = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcForHomeBinding = null;
        }
        fragmentSfcForHomeBinding.composeBalanceSection.setContent(ComposableLambdaKt.composableLambdaInstance(-94019549, true, new component3()));
        int i4 = getSponsorBeneficiariesState + 23;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = toString + 87;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            int i3 = 83 / 0;
            if (!SFCUserConfigManager.INSTANCE.isCustomerChild()) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            if (!SFCUserConfigManager.INSTANCE.isCustomerChild()) {
                return;
            }
        }
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding = this.ShareDataUIState;
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding2 = null;
        if (fragmentSfcForHomeBinding == null) {
            int i4 = getSponsorBeneficiariesState + 87;
            toString = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcForHomeBinding = null;
        }
        fragmentSfcForHomeBinding.rlRoot.setBackgroundColor(requireActivity().getColor(R.color.transparent));
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding3 = this.ShareDataUIState;
        if (fragmentSfcForHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = getSponsorBeneficiariesState + 69;
            toString = i6 % 128;
            int i7 = i6 % 2;
        } else {
            fragmentSfcForHomeBinding2 = fragmentSfcForHomeBinding3;
        }
        ViewGroup.LayoutParams layoutParams = fragmentSfcForHomeBinding2.homeFunction.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ((ConstraintLayout.LayoutParams) layoutParams).topMargin = SizeUtils.dp2px(16.0f);
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = toString + 13;
        getSponsorBeneficiariesState = i2 % 128;
        AirtimeBalanceViewModel airtimeBalanceViewModel = null;
        if (i2 % 2 == 0) {
            super.onResume();
            TextUtils.isEmpty(TokenHelper.INSTANCE.getLoginToken());
            airtimeBalanceViewModel.hashCode();
            throw null;
        }
        super.onResume();
        if (TextUtils.isEmpty(TokenHelper.INSTANCE.getLoginToken())) {
            return;
        }
        BalanceHelper.INSTANCE.setNeedRefresh(true);
        BalancesViewModel balancesViewModel = this.copydefault;
        if (balancesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            balancesViewModel = null;
        }
        if (!balancesViewModel.isGsmLogin()) {
            HomeViewModel homeViewModel = this.component3;
            if (homeViewModel == null) {
                int i3 = getSponsorBeneficiariesState + 59;
                toString = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    airtimeBalanceViewModel.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                homeViewModel = null;
            }
            homeViewModel.refreshBalance(new BaseRequestParams());
        }
        BalancesViewModel balancesViewModel2 = this.copydefault;
        if (balancesViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            balancesViewModel2 = null;
        }
        balancesViewModel2.getBalances();
        BalancesViewModel balancesViewModel3 = this.copydefault;
        if (balancesViewModel3 == null) {
            int i4 = getSponsorBeneficiariesState + 97;
            toString = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            balancesViewModel3 = null;
        }
        balancesViewModel3.observeBalanceUpdates();
        AirtimeBalanceViewModel airtimeBalanceViewModel2 = this.component1;
        if (airtimeBalanceViewModel2 == null) {
            int i6 = toString + 33;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                int i8 = 96 / 0;
            }
        } else {
            airtimeBalanceViewModel = airtimeBalanceViewModel2;
        }
        airtimeBalanceViewModel.queryFulizaCustomerInfo();
    }

    private final void ShareDataUIState(List<? extends View> list) {
        int i = 2 % 2;
        WelcomeTutorialViewModel welcomeTutorialViewModelShareDataUIState = ShareDataUIState();
        welcomeTutorialViewModelShareDataUIState.registerHighlightData(3, R.string.one_app_walkthrough_title_balances, R.string.one_app_walkthrough_content_balances, ArrowAlignment.TopLeft);
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding = this.ShareDataUIState;
        Object obj = null;
        if (fragmentSfcForHomeBinding == null) {
            int i2 = toString + 21;
            getSponsorBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 18 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            fragmentSfcForHomeBinding = null;
        }
        welcomeTutorialViewModelShareDataUIState.registerHighlight(3, new WelcomeTutorialRectProvider.XmlRectProvider(CollectionsKt.listOf(fragmentSfcForHomeBinding.composeBalanceSection)));
        welcomeTutorialViewModelShareDataUIState.registerHighlightData(6, R.string.one_app_walkthrough_title_mini_apps, R.string.one_app_walkthrough_content_mini_apps, ArrowAlignment.BottomCenter);
        welcomeTutorialViewModelShareDataUIState.registerHighlight(6, new WelcomeTutorialRectProvider.XmlRectProvider(list));
        int i4 = getSponsorBeneficiariesState + 85;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static List $r8$lambda$IftEkWeXy3S4_ZWKoZQ0JZph1jw(LocalHomeConfig localHomeConfig) {
        int i = 2 % 2;
        int i2 = toString + 109;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState(localHomeConfig);
        }
        ShareDataUIState(localHomeConfig);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit m10520$r8$lambda$LzZANwClPtiudNZHJKTQXc65QY(SFCForHomeFragment sFCForHomeFragment, List list) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 25;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(sFCForHomeFragment, list);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitComponent3;
    }

    static {
        ArtificialStackFrames = 1;
        component1();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = hashCode + 23;
        ArtificialStackFrames = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    static void component1() {
        getRequestBeneficiariesState = 1110343667;
        equals = -238323968;
        getAsAtTimestamp = 899570408;
        component4 = new byte[]{-7, 0, -16, Ascii.VT, -41, -44, TarHeader.LF_FIFO, 8, -4, 4, -49, 60, Ascii.SUB, -28, 6, -81, 91, -126, 117, 91, PSSSigner.TRAILER_IMPLICIT, -73, 97, -85, -91, 91, -88, -89, -81, 85, 104, -108, 99, 73, -74, 104, -111, 97, -102, 70, 69, -37, 100, 33, -86, -101, -102, -99, 110, -106, 109, -124, 120, -119, 116, 119, -128, 111, -110, -125, -114, 127, 115, -119, 123, 41, 41, 41, 41};
    }
}
