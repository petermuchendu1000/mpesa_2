package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDetailsState;
import com.huawei.digitalpayment.home.data.local.LocalBalance;
import com.huawei.digitalpayment.home.util.BalanceHelper;
import com.safaricom.consumer.commons.amountvalidation.AmountDetailsState;
import com.safaricom.consumer.commons.amountvalidation.AmountExtensionKt;
import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.fee.FeeTable;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/amount/CostEstimatorAmountDetailsFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "costEstimatorViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorViewModel;", "getCostEstimatorViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorViewModel;", "costEstimatorViewModel$delegate", "Lkotlin/Lazy;", "amountViewModel", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "getAmountViewModel", "()Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "amountViewModel$delegate", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "getConfigurations", "()Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "setConfigurations", "(Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "handleBackAction", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initAmountValidation", "getAmountParams", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "observeMpesaBalance", "ConsumerSfcUiMpesaGlobal_release", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "selectionDetailsState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class CostEstimatorAmountDetailsFragment extends Hilt_CostEstimatorAmountDetailsFragment {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private final Lazy ShareDataUIState;

    @Inject
    public ConfigurationRepository configurations;
    private final Lazy copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int component1;
        private final Function1 copydefault;

        copydefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r3
  0x0033: PHI (r3v1 boolean) = (r3v0 boolean), (r3v2 boolean) binds: [B:9:0x0019, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment.copydefault.component1
                int r1 = r1 + 41
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment.copydefault.ShareDataUIState = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L16
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                if (r1 == r2) goto L14
                goto L34
            L14:
                r3 = r2
                goto L1b
            L16:
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r3 = 0
                if (r1 == 0) goto L33
            L1b:
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                r1 = r1 ^ r2
                if (r1 == 0) goto L21
                goto L33
            L21:
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                goto L34
            L33:
                r2 = r3
            L34:
                int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment.copydefault.ShareDataUIState
                int r5 = r5 + 59
                int r1 = r5 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment.copydefault.component1 = r1
                int r5 = r5 % r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment.copydefault.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.copydefault;
            if (i3 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = ShareDataUIState + 105;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            int i4 = ShareDataUIState + 19;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final ConsumerAmountViewModel access$getAmountViewModel(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelCopydefault = costEstimatorAmountDetailsFragment.copydefault();
        int i4 = component2 + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return consumerAmountViewModelCopydefault;
    }

    public static final CostEstimatorViewModel access$getCostEstimatorViewModel(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CostEstimatorViewModel costEstimatorViewModelComponent1 = costEstimatorAmountDetailsFragment.component1();
        int i4 = component2 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return costEstimatorViewModelComponent1;
    }

    public CostEstimatorAmountDetailsFragment() {
        final CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment = this;
        final Function0 function0 = null;
        this.ShareDataUIState = FragmentViewModelLazyKt.createViewModelLazy(costEstimatorAmountDetailsFragment, Reflection.getOrCreateKotlinClass(CostEstimatorViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 61;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    invoke();
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = ShareDataUIState + 33;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 33;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                FragmentActivity fragmentActivityRequireActivity = costEstimatorAmountDetailsFragment.requireActivity();
                if (i3 == 0) {
                    return fragmentActivityRequireActivity.getViewModelStore();
                }
                int i4 = 83 / 0;
                return fragmentActivityRequireActivity.getViewModelStore();
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 43;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
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
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$special$$inlined$activityViewModels$default$2.component1
                    int r1 = r1 + 59
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$special$$inlined$activityViewModels$default$2.component2 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 48
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
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$special$$inlined$activityViewModels$default$2.component2
                    int r2 = r2 + 97
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$special$$inlined$activityViewModels$default$2.component1 = r3
                    int r2 = r2 % r0
                L36:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 29;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 67;
                component1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    costEstimatorAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = costEstimatorAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i3 = ShareDataUIState + 3;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return defaultViewModelProviderFactory;
                }
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        });
        final Function0 function02 = new Function0() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 5;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtras$r8$lambda$r6utC2P9Bc8wHbwXNPQd_fmv7hY = CostEstimatorAmountDetailsFragment.$r8$lambda$r6utC2P9Bc8wHbwXNPQd_fmv7hY(this.f$0);
                int i4 = ShareDataUIState + 7;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return creationExtras$r8$lambda$r6utC2P9Bc8wHbwXNPQd_fmv7hY;
            }
        };
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(costEstimatorAmountDetailsFragment, Reflection.getOrCreateKotlinClass(ConsumerAmountViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                ViewModelStore viewModelStoreInvoke;
                int i = 2 % 2;
                int i2 = component3 + 85;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    viewModelStoreInvoke = invoke();
                    int i3 = 85 / 0;
                } else {
                    viewModelStoreInvoke = invoke();
                }
                int i4 = copydefault + 81;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 113;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = costEstimatorAmountDetailsFragment.requireActivity().getViewModelStore();
                int i4 = copydefault + 103;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStore;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 3;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component2 + 83;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 59;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                Function0 function03 = function02;
                if (function03 != null) {
                    int i4 = i2 + 63;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    CreationExtras creationExtras = (CreationExtras) function03.invoke();
                    if (i5 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return costEstimatorAmountDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 105;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 95;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    defaultViewModelProviderFactory = costEstimatorAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                    int i3 = 97 / 0;
                } else {
                    defaultViewModelProviderFactory = costEstimatorAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                }
                int i4 = ShareDataUIState + 17;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    private final CostEstimatorViewModel component1() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CostEstimatorViewModel costEstimatorViewModel = (CostEstimatorViewModel) this.ShareDataUIState.getValue();
        if (i3 != 0) {
            return costEstimatorViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ConsumerAmountViewModel copydefault() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.copydefault.getValue();
        if (i3 != 0) {
            return (ConsumerAmountViewModel) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final CreationExtras component2(final CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(costEstimatorAmountDetailsFragment, "");
        CreationExtras defaultViewModelCreationExtras = costEstimatorAmountDetailsFragment.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        CreationExtras creationExtrasWithCreationCallback = HiltViewModelExtensions.withCreationCallback(defaultViewModelCreationExtras, new Function1() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ViewModel viewModelM10986$r8$lambda$wU9Q6dAiFvSFnQl_NpA2VDVzd8 = CostEstimatorAmountDetailsFragment.m10986$r8$lambda$wU9Q6dAiFvSFnQl_NpA2VDVzd8(this.f$0, (ConsumerAmountViewModel.Factory) obj);
                int i5 = component2 + 91;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 0;
                }
                return viewModelM10986$r8$lambda$wU9Q6dAiFvSFnQl_NpA2VDVzd8;
            }
        });
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return creationExtrasWithCreationCallback;
    }

    private static final ViewModel component3(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(costEstimatorAmountDetailsFragment, "");
        Intrinsics.checkNotNullParameter(factory, "");
        ConsumerAmountViewModel consumerAmountViewModelCreate = factory.create(costEstimatorAmountDetailsFragment.component3());
        int i4 = component2 + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return consumerAmountViewModelCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ConfigurationRepository getConfigurations() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ConfigurationRepository configurationRepository = this.configurations;
        if (configurationRepository == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return configurationRepository;
    }

    public final void setConfigurations(ConfigurationRepository configurationRepository) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(configurationRepository, "");
            this.configurations = configurationRepository;
        } else {
            Intrinsics.checkNotNullParameter(configurationRepository, "");
            this.configurations = configurationRepository;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component1().previousScreen();
        int i4 = component3 + 113;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int copydefault = 1;

        public static final SelectionDetailsState ShareDataUIState(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState selectionDetailsStateComponent2 = component2(state);
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            int i5 = copydefault + 35;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return selectionDetailsStateComponent2;
        }

        public static final AmountDetailsState component1(State state) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            AmountDetailsState amountDetailsStateComponent3 = component3(state);
            if (i3 == 0) {
                int i4 = 38 / 0;
            }
            return amountDetailsStateComponent3;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final CostEstimatorAmountDetailsFragment component1;
            final State<SelectionDetailsState> component2;
            final State<AmountDetailsState> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 85;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    int i4 = 77 / 0;
                }
                return unit;
            }

            public final void component3(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = ShareDataUIState + 57;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        int i5 = copydefault + 17;
                        ShareDataUIState = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 4 % 5;
                            return;
                        }
                        return;
                    }
                }
                AmountDetailsState amountDetailsStateComponent1 = component3.component1(this.component3);
                SelectionDetailsState selectionDetailsStateShareDataUIState = component3.ShareDataUIState(this.component2);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(this.component1));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(this.component1));
                final CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment = this.component1;
                CostEstimatorAmountDetailsScreenKt.CostEstimatorAmountDetailsScreen(amountDetailsStateComponent1, selectionDetailsStateShareDataUIState, null, new Function1() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = copydefault + 79;
                        component3 = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitComponent3 = CostEstimatorAmountDetailsFragment.component3.AnonymousClass5.component3(costEstimatorAmountDetailsFragment, (String) obj);
                        int i10 = copydefault + 97;
                        component3 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 69 / 0;
                        }
                        return unitComponent3;
                    }
                }, anonymousClass4, anonymousClass1, composer, 72, 4);
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component1 = 1;
                private static int copydefault;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component1 + 47;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ((CostEstimatorViewModel) this.receiver).previousScreen();
                    int i4 = component1 + 35;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component1 + 43;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 59;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass4(Object obj) {
                    super(0, obj, CostEstimatorViewModel.class, "previousScreen", "previousScreen()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component1 = 0;
                private static int component3 = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component3 + 93;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ((CostEstimatorViewModel) this.receiver).onAmountDetailsContinue();
                    if (i3 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component3 + 41;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 77 / 0;
                    }
                    return unit;
                }

                AnonymousClass1(Object obj) {
                    super(0, obj, CostEstimatorViewModel.class, "onAmountDetailsContinue", "onAmountDetailsContinue()V", 0);
                }
            }

            private static final Unit component2(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = copydefault + 99;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(costEstimatorAmountDetailsFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(costEstimatorAmountDetailsFragment).updateAmount(str);
                CostEstimatorAmountDetailsFragment.access$getAmountViewModel(costEstimatorAmountDetailsFragment).validateInput(str);
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 27;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 121;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(costEstimatorAmountDetailsFragment, str);
                int i4 = copydefault + 41;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                return unitComponent2;
            }

            AnonymousClass5(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, State<AmountDetailsState> state, State<SelectionDetailsState> state2) {
                this.component1 = costEstimatorAmountDetailsFragment;
                this.component3 = state;
                this.component2 = state2;
            }
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 27;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 11) == 2) {
                if (!composer.getSkipping()) {
                    int i5 = copydefault + 87;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1242986518, true, new AnonymousClass5(CostEstimatorAmountDetailsFragment.this, FlowExtKt.collectAsStateWithLifecycle(CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(CostEstimatorAmountDetailsFragment.this).getAmountDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7), FlowExtKt.collectAsStateWithLifecycle(CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(CostEstimatorAmountDetailsFragment.this).getSelectionDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
        }

        private static final AmountDetailsState component3(State<AmountDetailsState> state) {
            int i = 2 % 2;
            int i2 = component1 + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            AmountDetailsState value = state.getValue();
            if (i3 == 0) {
                int i4 = 32 / 0;
            }
            int i5 = copydefault + 45;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return value;
        }

        private static final SelectionDetailsState component2(State<SelectionDetailsState> state) {
            int i = 2 % 2;
            int i2 = component1 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState value = state.getValue();
            if (i3 != 0) {
                return value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        component3() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        component2();
        ShareDataUIState();
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(798775751, true, new component3()));
        int i2 = component2 + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    private static final Unit component2(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(costEstimatorAmountDetailsFragment, "");
        CostEstimatorViewModel costEstimatorViewModelComponent1 = costEstimatorAmountDetailsFragment.component1();
        Intrinsics.checkNotNull(bool);
        costEstimatorViewModelComponent1.updateAmountValidityStatus(bool.booleanValue());
        Unit unit = Unit.INSTANCE;
        int i4 = component2 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void component2() {
        int i = 2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelCopydefault = copydefault();
        consumerAmountViewModelCopydefault.getValidInput().observe(getViewLifecycleOwner(), new copydefault(new Function1() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 51;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$_8hCY1ENwnYh6iPejCXG_VeiPQo = CostEstimatorAmountDetailsFragment.$r8$lambda$_8hCY1ENwnYh6iPejCXG_VeiPQo(this.f$0, (Boolean) obj);
                int i5 = component1 + 67;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$_8hCY1ENwnYh6iPejCXG_VeiPQo;
                }
                throw null;
            }
        }));
        consumerAmountViewModelCopydefault.getErrorState().observe(getViewLifecycleOwner(), new copydefault(new Function1() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 35;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$qzWU2U5GYXNbDx7gaNoty84QI48 = CostEstimatorAmountDetailsFragment.$r8$lambda$qzWU2U5GYXNbDx7gaNoty84QI48(this.f$0, (AmountViewModel.AmountError) obj);
                if (i4 == 0) {
                    int i5 = 68 / 0;
                }
                return unit$r8$lambda$qzWU2U5GYXNbDx7gaNoty84QI48;
            }
        }));
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit copydefault(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(costEstimatorAmountDetailsFragment, "");
        if (amountError != null) {
            int i4 = component3 + 29;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                costEstimatorAmountDetailsFragment.component1().handleAmountError(amountError, costEstimatorAmountDetailsFragment.component1().getTransactionType());
                throw null;
            }
            costEstimatorAmountDetailsFragment.component1().handleAmountError(amountError, costEstimatorAmountDetailsFragment.component1().getTransactionType());
        }
        Unit unit = Unit.INSTANCE;
        int i5 = component2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final AmountViewModel.AmountViewModelParams component3() {
        int i = 2 % 2;
        AmountViewModel.AmountViewModelParams amountViewModelParams = new AmountViewModel.AmountViewModelParams(false, false, ConfigurationRepository.getMaxAmountForTransaction$default(getConfigurations(), component1().getTransactionType(), null, 2, null), ConfigurationRepository.getMinAmountForTransaction$default(getConfigurations(), component1().getTransactionType(), null, 2, null), new component2(component1()), null, FeeTable.INSTANCE.emptyFeeTable(), null, false, false, false, false, 3584, null);
        int i2 = component2 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return amountViewModelParams;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class component2 extends FunctionReferenceImpl implements Function0<Double> {
        private static int component1 = 1;
        private static int copydefault;

        public final Double ShareDataUIState() {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = Double.valueOf(((CostEstimatorViewModel) this.receiver).calculateAmount());
            int i4 = component1 + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return dValueOf;
        }

        @Override
        public Double invoke() {
            int i = 2 % 2;
            int i2 = copydefault + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Double dShareDataUIState = ShareDataUIState();
            int i4 = component1 + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return dShareDataUIState;
        }

        component2(Object obj) {
            super(0, obj, CostEstimatorViewModel.class, "calculateAmount", "calculateAmount()D", 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$observeMpesaBalance$1", f = "CostEstimatorAmountDetailsFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.amount.CostEstimatorAmountDetailsFragment$observeMpesaBalance$1$1", f = "CostEstimatorAmountDetailsFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component2;
            final CostEstimatorAmountDetailsFragment component1;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 103;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.copydefault;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<LocalBalance> balance2 = BalanceHelper.INSTANCE.getBalance2();
                    final CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment = this.component1;
                    this.copydefault = 1;
                    if (balance2.collect(new FlowCollector() {
                        private static int component2 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = component2 + 101;
                            copydefault = i6 % 128;
                            LocalBalance localBalance = (LocalBalance) obj2;
                            if (i6 % 2 != 0) {
                                return ShareDataUIState(localBalance, continuation);
                            }
                            ShareDataUIState(localBalance, continuation);
                            throw null;
                        }

                        public final Object ShareDataUIState(LocalBalance localBalance, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            int i6 = component2 + 27;
                            copydefault = i6 % 128;
                            if (i6 % 2 == 0) {
                                double doubleOrZero = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                                CostEstimatorAmountDetailsFragment.access$getAmountViewModel(costEstimatorAmountDetailsFragment).setCurrentBalance(doubleOrZero);
                                CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(costEstimatorAmountDetailsFragment).updateMpesaBalance(doubleOrZero);
                                int i7 = 0 / 0;
                                return Unit.INSTANCE;
                            }
                            double doubleOrZero2 = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                            CostEstimatorAmountDetailsFragment.access$getAmountViewModel(costEstimatorAmountDetailsFragment).setCurrentBalance(doubleOrZero2);
                            CostEstimatorAmountDetailsFragment.access$getCostEstimatorViewModel(costEstimatorAmountDetailsFragment).updateMpesaBalance(doubleOrZero2);
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = ShareDataUIState + 25;
                        component2 = i5 % 128;
                        if (i5 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component1 = costEstimatorAmountDetailsFragment;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component1, continuation);
                int i2 = ShareDataUIState + 85;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 27 / 0;
                }
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 113;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    component1(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objComponent1 = component1(coroutineScope2, continuation2);
                int i3 = component2 + 27;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 39;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 33;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 55;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 57;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CostEstimatorAmountDetailsFragment.this, Lifecycle.State.STARTED, new AnonymousClass1(CostEstimatorAmountDetailsFragment.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = ShareDataUIState + 75;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = CostEstimatorAmountDetailsFragment.this.new ShareDataUIState(continuation);
            int i2 = ShareDataUIState + 27;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return shareDataUIState;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objShareDataUIState;
            int i = 2 % 2;
            int i2 = component2 + 89;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
                int i3 = 16 / 0;
            } else {
                objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            }
            int i4 = component2 + 97;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 13;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                shareDataUIState.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(unit);
            int i4 = component2 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = component3 + 97;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$_8hCY1ENwnYh6iPejCXG_VeiPQo(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            component2(costEstimatorAmountDetailsFragment, bool);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitComponent2 = component2(costEstimatorAmountDetailsFragment, bool);
        int i3 = component3 + 67;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return unitComponent2;
    }

    public static Unit $r8$lambda$qzWU2U5GYXNbDx7gaNoty84QI48(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(costEstimatorAmountDetailsFragment, amountError);
        int i4 = component3 + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    public static CreationExtras $r8$lambda$r6utC2P9Bc8wHbwXNPQd_fmv7hY(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return component2(costEstimatorAmountDetailsFragment);
        }
        component2(costEstimatorAmountDetailsFragment);
        throw null;
    }

    public static ViewModel m10986$r8$lambda$wU9Q6dAiFvSFnQl_NpA2VDVzd8(CostEstimatorAmountDetailsFragment costEstimatorAmountDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewModel viewModelComponent3 = component3(costEstimatorAmountDetailsFragment, factory);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = component3 + 19;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return viewModelComponent3;
        }
        throw null;
    }

    static {
        int i = 1 + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
