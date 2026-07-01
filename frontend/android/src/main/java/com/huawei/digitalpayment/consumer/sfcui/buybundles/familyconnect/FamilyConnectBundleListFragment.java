package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.core.common.monitor.UrlContentDecoderMonitorHelper;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BundleWithLimit;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.FamilyConnectBundlesScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.PackageList;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.helper.UIState;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0018H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectBundleListFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "bundleViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getBundleViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "bundleViewModel$delegate", "handleBackAction", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showBundlesScreen", "bundlesWithLimit", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/BundleWithLimit;", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "observeViewModels", "mapPlansToBundlesWithLimit", "plans", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "loadBundles", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectBundleListFragment extends Hilt_FamilyConnectBundleListFragment {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int equals = 1;
    private final Lazy component2;
    private final Lazy copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int component2;
        private final Function1 component1;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 93;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                if (!(obj instanceof Observer)) {
                    return false;
                }
            } else if (!(obj instanceof Observer)) {
                return false;
            }
            int i4 = i2 + 83;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = obj instanceof FunctionAdapter;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i5 = ShareDataUIState + 73;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 47;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                Function1 function1 = this.component1;
                throw null;
            }
            Function1 function12 = this.component1;
            int i4 = i2 + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return function12;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = ShareDataUIState + 101;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 81;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final BuyBundleViewModel access$getBundleViewModel(FamilyConnectBundleListFragment familyConnectBundleListFragment) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModelComponent1 = familyConnectBundleListFragment.component1();
        int i4 = component1 + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return buyBundleViewModelComponent1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final FamilyConnectViewModel access$getFamilyConnectViewModel(FamilyConnectBundleListFragment familyConnectBundleListFragment) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            familyConnectBundleListFragment.ShareDataUIState();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FamilyConnectViewModel familyConnectViewModelShareDataUIState = familyConnectBundleListFragment.ShareDataUIState();
        int i3 = component3 + 69;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
        return familyConnectViewModelShareDataUIState;
    }

    public FamilyConnectBundleListFragment() {
        final FamilyConnectBundleListFragment familyConnectBundleListFragment = this;
        final Function0 function0 = null;
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(familyConnectBundleListFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 79;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 115;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectBundleListFragment.requireActivity().getViewModelStore();
                int i4 = component3 + 111;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStore;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 57;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component2 + 95;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v11 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$special$$inlined$activityViewModels$default$2.component2
                    int r1 = r1 + 1
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$special$$inlined$activityViewModels$default$2.component3 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 77
                    int r2 = r2 / 0
                    if (r1 == 0) goto L23
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L36
                L23:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$special$$inlined$activityViewModels$default$2.component3
                    int r2 = r2 + 67
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$special$$inlined$activityViewModels$default$2.component2 = r3
                    int r2 = r2 % r0
                L36:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 91;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = ShareDataUIState + 35;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 27;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = familyConnectBundleListFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = copydefault + 23;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(familyConnectBundleListFragment, Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 87;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 83;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 9;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectBundleListFragment.requireActivity().getViewModelStore();
                int i4 = copydefault + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 95;
                component2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = component2 + 57;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 63;
                int i3 = i2 % 128;
                copydefault = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 109;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (i6 == 0) {
                        throw null;
                    }
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return familyConnectBundleListFragment.requireActivity().getDefaultViewModelCreationExtras();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 115;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 115;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return factoryInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = component2 + 63;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    defaultViewModelProviderFactory = familyConnectBundleListFragment.requireActivity().getDefaultViewModelProviderFactory();
                    int i3 = 33 / 0;
                } else {
                    defaultViewModelProviderFactory = familyConnectBundleListFragment.requireActivity().getDefaultViewModelProviderFactory();
                }
                int i4 = copydefault + 85;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                throw null;
            }

            {
                super(0);
            }
        });
    }

    private final FamilyConnectViewModel ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.component2.getValue();
        int i4 = component3 + 101;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return familyConnectViewModel;
    }

    private final BuyBundleViewModel component1() {
        BuyBundleViewModel buyBundleViewModel;
        int i = 2 % 2;
        int i2 = component3 + 51;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            buyBundleViewModel = (BuyBundleViewModel) this.copydefault.getValue();
            int i3 = 92 / 0;
        } else {
            buyBundleViewModel = (BuyBundleViewModel) this.copydefault.getValue();
        }
        int i4 = component1 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return buyBundleViewModel;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState().previousScreen();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            component2();
            copydefault();
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            component2();
            copydefault();
        }
        int i4 = component1 + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2(FamilyConnectBundleListFragment familyConnectBundleListFragment, List list, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 73;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if ((i & 4) != 0) {
            int i8 = component1 + 51;
            component3 = i8 % 128;
            z2 = i8 % 2 != 0;
        }
        familyConnectBundleListFragment.component1(list, z, z2);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component3 = 0;
        private static int component4 = 1;
        final FamilyConnectBundleListFragment ShareDataUIState;
        final boolean component1;
        final List<BundleWithLimit> component2;
        final boolean copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int component3 = 0;
            private static int equals = 1;
            final boolean ShareDataUIState;
            final List<BundleWithLimit> component1;
            final FamilyConnectBundleListFragment component2;
            final boolean copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component3 + 75;
                equals = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    ShareDataUIState(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                    int i3 = 92 / 0;
                } else {
                    ShareDataUIState(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                }
                int i4 = component3 + 23;
                equals = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void ShareDataUIState(Composer composer, int i) {
                UIState.Success success;
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i3 = equals + 11;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
                List<BundleWithLimit> list = this.component1;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BundleWithLimit) it.next()).getBundle());
                }
                ArrayList arrayList2 = arrayList;
                if (this.ShareDataUIState) {
                    success = UIState.Loading.INSTANCE;
                } else if (this.copydefault) {
                    success = new UIState.Error(UrlContentDecoderMonitorHelper.ErrorType.ServerError);
                    int i5 = equals + 17;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    success = new UIState.Success(arrayList2);
                }
                UIState uIState = success;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component2);
                Modifier.Companion companion = Modifier.INSTANCE;
                final FamilyConnectBundleListFragment familyConnectBundleListFragment = this.component2;
                final List<BundleWithLimit> list2 = this.component1;
                final FamilyConnectBundleListFragment familyConnectBundleListFragment2 = this.component2;
                FamilyConnectBundlesScreenKt.FamilyConnectBundlesScreen(uIState, new Function0() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = component1 + 91;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        FamilyConnectBundleListFragment familyConnectBundleListFragment3 = familyConnectBundleListFragment;
                        if (i9 == 0) {
                            return FamilyConnectBundleListFragment.copydefault.AnonymousClass3.copydefault(familyConnectBundleListFragment3);
                        }
                        FamilyConnectBundleListFragment.copydefault.AnonymousClass3.copydefault(familyConnectBundleListFragment3);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }, anonymousClass1, new Function1() {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = component3 + 65;
                        ShareDataUIState = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitComponent2 = FamilyConnectBundleListFragment.copydefault.AnonymousClass3.component2(list2, familyConnectBundleListFragment2, (com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle) obj);
                        int i10 = component3 + 19;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        return unitComponent2;
                    }
                }, companion, composer, 24576, 0);
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component1 = 0;
                private static int component3 = 1;

                public final void component2() {
                    int i = 2 % 2;
                    int i2 = component3 + 11;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ((FamilyConnectBundleListFragment) this.receiver).handleBackAction();
                    int i4 = component1 + 61;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component3 + 31;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    component2();
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass1(Object obj) {
                    super(0, obj, FamilyConnectBundleListFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            private static final Unit component1(FamilyConnectBundleListFragment familyConnectBundleListFragment) {
                int i = 2 % 2;
                int i2 = component3 + 101;
                equals = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(familyConnectBundleListFragment, "");
                    FamilyConnectBundleListFragment.access$getBundleViewModel(familyConnectBundleListFragment).getExpiryBundlesCatalog();
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(familyConnectBundleListFragment, "");
                FamilyConnectBundleListFragment.access$getBundleViewModel(familyConnectBundleListFragment).getExpiryBundlesCatalog();
                Unit unit2 = Unit.INSTANCE;
                int i3 = component3 + 53;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit component1(List list, FamilyConnectBundleListFragment familyConnectBundleListFragment, com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle bundle) {
                Object next;
                String limit;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(familyConnectBundleListFragment, "");
                Intrinsics.checkNotNullParameter(bundle, "");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i2 = component3 + 53;
                    equals = i2 % 128;
                    int i3 = i2 % 2;
                    next = it.next();
                    if (Intrinsics.areEqual(((BundleWithLimit) next).getBundle().getId(), bundle.getId())) {
                        break;
                    }
                }
                BundleWithLimit bundleWithLimit = (BundleWithLimit) next;
                if (bundleWithLimit == null || (limit = bundleWithLimit.getLimit()) == null) {
                    limit = "0";
                }
                FamilyConnectBundleListFragment.access$getFamilyConnectViewModel(familyConnectBundleListFragment).showConfirmation(bundle, limit);
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 75;
                equals = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit copydefault(FamilyConnectBundleListFragment familyConnectBundleListFragment) {
                int i = 2 % 2;
                int i2 = equals + 55;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    component1(familyConnectBundleListFragment);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent1 = component1(familyConnectBundleListFragment);
                int i3 = component3 + 71;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent1;
            }

            public static Unit component2(List list, FamilyConnectBundleListFragment familyConnectBundleListFragment, com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle bundle) {
                int i = 2 % 2;
                int i2 = component3 + 111;
                equals = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component1(list, familyConnectBundleListFragment, bundle);
                    throw null;
                }
                Unit unitComponent1 = component1(list, familyConnectBundleListFragment, bundle);
                int i3 = component3 + 5;
                equals = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitComponent1;
                }
                obj.hashCode();
                throw null;
            }

            AnonymousClass3(List<BundleWithLimit> list, boolean z, boolean z2, FamilyConnectBundleListFragment familyConnectBundleListFragment) {
                this.component1 = list;
                this.ShareDataUIState = z;
                this.copydefault = z2;
                this.component2 = familyConnectBundleListFragment;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            Unit unit;
            int i = 2 % 2;
            int i2 = component4 + 13;
            component3 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 != 0) {
                component1(composer2, num2.intValue());
                unit = Unit.INSTANCE;
                int i3 = 82 / 0;
            } else {
                component1(composer2, num2.intValue());
                unit = Unit.INSTANCE;
            }
            int i4 = component4 + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component1(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment.copydefault.component4
                int r1 = r1 + 95
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment.copydefault.component3 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L14
                r13 = r13 & 121(0x79, float:1.7E-43)
                r1 = 5
                if (r13 != r1) goto L31
                goto L18
            L14:
                r13 = r13 & 11
                if (r13 != r0) goto L31
            L18:
                int r2 = r2 + 79
                int r13 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment.copydefault.component4 = r13
                int r2 = r2 % r0
                if (r2 == 0) goto L2c
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L28
                goto L31
            L28:
                r12.skipToGroupEnd()
                goto L59
            L2c:
                r12.getSkipping()
                r12 = 0
                throw r12
            L31:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$copydefault$3 r13 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment$copydefault$3
                java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BundleWithLimit> r7 = r11.component2
                boolean r8 = r11.copydefault
                boolean r9 = r11.component1
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment r10 = r11.ShareDataUIState
                r13.<init>(r7, r8, r9, r10)
                r7 = 54
                r8 = -1537750234(0xffffffffa457cb26, float:-4.6792767E-17)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L59:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment.copydefault.component3
                int r12 = r12 + 121
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment.copydefault.component4 = r13
                int r12 = r12 % r0
                if (r12 != 0) goto L68
                r12 = 26
                int r12 = r12 / 0
            L68:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectBundleListFragment.copydefault.component1(androidx.compose.runtime.Composer, int):void");
        }

        copydefault(List<BundleWithLimit> list, boolean z, boolean z2, FamilyConnectBundleListFragment familyConnectBundleListFragment) {
            this.component2 = list;
            this.copydefault = z;
            this.component1 = z2;
            this.ShareDataUIState = familyConnectBundleListFragment;
        }
    }

    private final void component1(List<BundleWithLimit> list, boolean z, boolean z2) {
        int i = 2 % 2;
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(1627337961, true, new copydefault(list, z, z2, this)));
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    private static final Unit component1(FamilyConnectBundleListFragment familyConnectBundleListFragment, List list) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(familyConnectBundleListFragment, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(familyConnectBundleListFragment, "");
        if (list != null) {
            int i3 = component1 + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            component2(familyConnectBundleListFragment, familyConnectBundleListFragment.component1(list), false, false, 6, null);
            int i5 = component3 + 101;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void component2() {
        int i = 2 % 2;
        component1().getFilteredBundleData().observe(getViewLifecycleOwner(), new ShareDataUIState(new Function1() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM11288$r8$lambda$_zAvnU3i8hSema3JOKj8l08_R0 = FamilyConnectBundleListFragment.m11288$r8$lambda$_zAvnU3i8hSema3JOKj8l08_R0(this.f$0, (List) obj);
                if (i4 != 0) {
                    int i5 = 42 / 0;
                }
                return unitM11288$r8$lambda$_zAvnU3i8hSema3JOKj8l08_R0;
            }
        }));
        component1().getOtherBundlesData().observe(getViewLifecycleOwner(), new ShareDataUIState(new Function1() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$mkaMhBUx_VtsQXATKodbHQ_svog = FamilyConnectBundleListFragment.$r8$lambda$mkaMhBUx_VtsQXATKodbHQ_svog(this.f$0, (Resource) obj);
                int i5 = component2 + 19;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$mkaMhBUx_VtsQXATKodbHQ_svog;
            }
        }));
        int i2 = component1 + 101;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit component2(FamilyConnectBundleListFragment familyConnectBundleListFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(familyConnectBundleListFragment, "");
        if (resource.success()) {
            familyConnectBundleListFragment.component1().filterFamilyConnectBundles();
        } else if (resource.error()) {
            int i4 = component1 + 109;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            component2(familyConnectBundleListFragment, CollectionsKt.emptyList(), false, true, 2, null);
        } else if (resource.loading()) {
            int i6 = component3 + 119;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            component2(familyConnectBundleListFragment, CollectionsKt.emptyList(), true, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            component1().getExpiryBundlesCatalog();
            throw null;
        }
        component1().getExpiryBundlesCatalog();
        int i3 = component3 + 111;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    private final List<BundleWithLimit> component1(List<Plans> list) {
        ArrayList arrayListEmptyList;
        List<PackageList> packageList;
        ArrayList arrayListEmptyList2;
        String str;
        float fIntValue;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            Plans plans = (Plans) it.next();
            if (plans == null || (packageList = plans.getPackageList()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = packageList.iterator();
                while (it2.hasNext()) {
                    int i2 = component3 + 39;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((PackageList) it2.next()).getChildBundles();
                        throw null;
                    }
                    List<SubBundles> childBundles = ((PackageList) it2.next()).getChildBundles();
                    if (childBundles != null) {
                        List<SubBundles> list2 = childBundles;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (SubBundles subBundles : list2) {
                            String productId = subBundles.getProductId();
                            String str2 = productId == null ? "" : productId;
                            String productName = subBundles.getProductName();
                            if (productName == null) {
                                int i3 = component3 + 45;
                                component1 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i4 = 3 % 5;
                                }
                                str = "";
                            } else {
                                str = productName;
                            }
                            Integer productAmount = subBundles.getProductAmount();
                            if (productAmount != null) {
                                int i5 = component3 + 107;
                                component1 = i5 % 128;
                                if (i5 % 2 == 0) {
                                    fIntValue = productAmount.intValue();
                                    int i6 = 36 / 0;
                                } else {
                                    fIntValue = productAmount.intValue();
                                }
                            } else {
                                fIntValue = 0.0f;
                            }
                            float f = fIntValue;
                            int i7 = R.drawable.icon_family_connect;
                            String limit = subBundles.getLimit();
                            String str3 = "0";
                            if (limit == null) {
                                int i8 = component3 + 95;
                                component1 = i8 % 128;
                                int i9 = i8 % 2;
                                limit = "0";
                            }
                            String str4 = "Share with up to " + limit + " beneficiaries";
                            String productUnits = subBundles.getProductUnits();
                            if (productUnits == null) {
                                productUnits = "KES";
                            }
                            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle bundle = new com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle(i7, str2, str, str4, f, CounterUnits.valueOf(productUnits), null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, null, null, null, null, null, null, 523456, null);
                            String limit2 = subBundles.getLimit();
                            if (limit2 != null) {
                                str3 = limit2;
                            }
                            arrayList3.add(new BundleWithLimit(bundle, str3));
                        }
                        arrayListEmptyList2 = arrayList3;
                        int i10 = component1 + 93;
                        component3 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 3 / 5;
                        }
                    } else {
                        arrayListEmptyList2 = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList2, arrayListEmptyList2);
                }
                arrayListEmptyList = arrayList2;
            }
            CollectionsKt.addAll(arrayList, arrayListEmptyList);
        }
        return arrayList;
    }

    public static Unit m11288$r8$lambda$_zAvnU3i8hSema3JOKj8l08_R0(FamilyConnectBundleListFragment familyConnectBundleListFragment, List list) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            component1(familyConnectBundleListFragment, list);
            throw null;
        }
        Unit unitComponent1 = component1(familyConnectBundleListFragment, list);
        int i3 = component3 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return unitComponent1;
    }

    public static Unit $r8$lambda$mkaMhBUx_VtsQXATKodbHQ_svog(FamilyConnectBundleListFragment familyConnectBundleListFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            component2(familyConnectBundleListFragment, resource);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitComponent2 = component2(familyConnectBundleListFragment, resource);
        int i3 = component1 + 87;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
        }
        return unitComponent2;
    }

    static {
        int i = 1 + 11;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
