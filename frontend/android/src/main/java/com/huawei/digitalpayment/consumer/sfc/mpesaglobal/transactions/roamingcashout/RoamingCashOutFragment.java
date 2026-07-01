package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryHeader;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMaximumAmountRule;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMinimumAmountRule;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.validation.RoamingCashOutMultipleOf100Rule;
import com.safaricom.android.design.templates.amountinput.AmountInputViewModel;
import com.safaricom.android.design.templates.amountinput.provider.AmountInputDataProvider;
import com.safaricom.android.design.templates.amountinput.provider.FeeCalculator;
import com.safaricom.android.design.templates.amountinput.state.AmountInputProcessor;
import com.safaricom.android.design.templates.amountinput.state.AmountInputState;
import com.safaricom.android.design.templates.amountinput.state.RememberAmountInputStateKt;
import com.safaricom.android.design.templates.amountinput.validation.AmountValidationRule;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputUiState;
import com.safaricom.android.design.templates.commons.alphanumericinput.AlphanumericInputViewModel;
import com.safaricom.android.design.templates.numberinput.NumberInputProcessor;
import com.safaricom.android.design.templates.numberinput.NumberInputState;
import com.safaricom.android.design.templates.numberinput.NumberInputType;
import com.safaricom.android.design.templates.numberinput.RememberNumberInputProcessorKt;
import com.safaricom.android.design.templates.numberinput.RememberNumberInputStateKt;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.createNewMenuItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "amountDataProvider", "Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;", "getAmountDataProvider", "()Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;", "setAmountDataProvider", "(Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;)V", "feeCalculator", "Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "getFeeCalculator", "()Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "setFeeCalculator", "(Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;)V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "agentNumberViewModel", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "getAgentNumberViewModel", "()Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "agentNumberViewModel$delegate", "amountInputViewModel", "Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;", "getAmountInputViewModel", "()Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;", "amountInputViewModel$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onContinueClick", "handleBackAction", "ConsumerSfcUiMpesaGlobal_release", "countryHeaderData", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryHeader;", "agentNumberUiState", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RoamingCashOutFragment extends Hilt_RoamingCashOutFragment {
    public static final int $stable = 8;
    private static int component3 = 0;
    private static int component4 = 97 % 128;
    private static int copydefault = 1;
    private static int equals;
    private final Lazy ShareDataUIState;

    @Inject
    public AmountInputDataProvider amountDataProvider;
    private final Lazy component1;
    private final Lazy component2;

    @Inject
    public FeeCalculator feeCalculator;

    public static final AlphanumericInputViewModel access$getAgentNumberViewModel(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AlphanumericInputViewModel alphanumericInputViewModelComponent2 = roamingCashOutFragment.component2();
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return alphanumericInputViewModelComponent2;
    }

    public static final AmountInputViewModel access$getAmountInputViewModel(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            roamingCashOutFragment.copydefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AmountInputViewModel amountInputViewModelCopydefault = roamingCashOutFragment.copydefault();
        int i3 = component3 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return amountInputViewModelCopydefault;
    }

    public static final RoamingCashOutViewModel access$getViewModel(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashOutViewModel roamingCashOutViewModelShareDataUIState = roamingCashOutFragment.ShareDataUIState();
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return roamingCashOutViewModelShareDataUIState;
    }

    public static final void access$onContinueClick(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        roamingCashOutFragment.component3();
        int i4 = copydefault + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public RoamingCashOutFragment() {
        final RoamingCashOutFragment roamingCashOutFragment = this;
        final Function0 function0 = null;
        this.ShareDataUIState = FragmentViewModelLazyKt.createViewModelLazy(roamingCashOutFragment, Reflection.getOrCreateKotlinClass(RoamingCashOutViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 103;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component3 + 15;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 33;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                FragmentActivity fragmentActivityRequireActivity = roamingCashOutFragment.requireActivity();
                if (i3 == 0) {
                    return fragmentActivityRequireActivity.getViewModelStore();
                }
                fragmentActivityRequireActivity.getViewModelStore();
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
                int i2 = component2 + 117;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 77;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    int i4 = i2 + 117;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return roamingCashOutFragment.requireActivity().getDefaultViewModelCreationExtras();
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
                int i2 = copydefault + 47;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 37;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = copydefault + 71;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    defaultViewModelProviderFactory = roamingCashOutFragment.requireActivity().getDefaultViewModelProviderFactory();
                    int i3 = 33 / 0;
                } else {
                    defaultViewModelProviderFactory = roamingCashOutFragment.requireActivity().getDefaultViewModelProviderFactory();
                }
                int i4 = copydefault + 67;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
        final Function0<Fragment> function02 = new Function0<Fragment>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Fragment invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return roamingCashOutFragment;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Fragment invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 93;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Fragment fragmentInvoke = invoke();
                int i3 = ShareDataUIState + 83;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return fragmentInvoke;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStoreOwner invoke() {
                int i = 2 % 2;
                int i2 = component1 + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvoke = function02.invoke();
                if (i3 == 0) {
                    return (ViewModelStoreOwner) objInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ViewModelStoreOwner invoke() {
                int i = 2 % 2;
                int i2 = component1 + 77;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStoreOwner viewModelStoreOwnerInvoke = invoke();
                int i4 = copydefault + 121;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreOwnerInvoke;
            }

            {
                super(0);
            }
        });
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(roamingCashOutFragment, Reflection.getOrCreateKotlinClass(AlphanumericInputViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 87;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 13;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy).getViewModelStore();
                int i4 = component3 + 103;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                }
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component3 + 45;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 50 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = component3 + 87;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM9192viewModels$lambda1 = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy);
                if (!(!(viewModelStoreOwnerM9192viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory))) {
                    hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM9192viewModels$lambda1;
                } else {
                    int i4 = ShareDataUIState + 95;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    hasDefaultViewModelProviderFactory = null;
                }
                if (hasDefaultViewModelProviderFactory != null) {
                    return hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras();
                }
                CreationExtras.Empty empty = CreationExtras.Empty.INSTANCE;
                int i6 = component3 + 93;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return empty;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 75;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 57;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return factoryInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 111;
                ShareDataUIState = i2 % 128;
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = null;
                if (i2 % 2 == 0) {
                    ViewModelStoreOwner viewModelStoreOwnerM9192viewModels$lambda1 = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy);
                    if (viewModelStoreOwnerM9192viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory) {
                        hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM9192viewModels$lambda1;
                    } else {
                        int i3 = component3 + 125;
                        ShareDataUIState = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    if (hasDefaultViewModelProviderFactory != null) {
                        int i5 = component3 + 105;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        ViewModelProvider.Factory defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory();
                        if (defaultViewModelProviderFactory != null) {
                            return defaultViewModelProviderFactory;
                        }
                    }
                    return roamingCashOutFragment.getDefaultViewModelProviderFactory();
                }
                boolean z = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy) instanceof HasDefaultViewModelProviderFactory;
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.component1 = LazyKt.lazy(new Function0() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 107;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                RoamingCashOutFragment roamingCashOutFragment2 = this.f$0;
                if (i3 != 0) {
                    return RoamingCashOutFragment.$r8$lambda$0qYwtLngcw32C6Z6D8upEDwikvI(roamingCashOutFragment2);
                }
                RoamingCashOutFragment.$r8$lambda$0qYwtLngcw32C6Z6D8upEDwikvI(roamingCashOutFragment2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public final AmountInputDataProvider getAmountDataProvider() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AmountInputDataProvider amountInputDataProvider = this.amountDataProvider;
        if (amountInputDataProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return amountInputDataProvider;
    }

    public final void setAmountDataProvider(AmountInputDataProvider amountInputDataProvider) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(amountInputDataProvider, "");
            this.amountDataProvider = amountInputDataProvider;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(amountInputDataProvider, "");
        this.amountDataProvider = amountInputDataProvider;
        int i3 = copydefault + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final FeeCalculator getFeeCalculator() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        FeeCalculator feeCalculator = this.feeCalculator;
        if (feeCalculator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return feeCalculator;
    }

    public final void setFeeCalculator(FeeCalculator feeCalculator) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(feeCalculator, "");
        this.feeCalculator = feeCalculator;
        int i4 = component3 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final RoamingCashOutViewModel ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashOutViewModel roamingCashOutViewModel = (RoamingCashOutViewModel) this.ShareDataUIState.getValue();
        int i4 = component3 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return roamingCashOutViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AlphanumericInputViewModel component2() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        AlphanumericInputViewModel alphanumericInputViewModel = (AlphanumericInputViewModel) this.component2.getValue();
        int i4 = copydefault + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return alphanumericInputViewModel;
    }

    private final AmountInputViewModel copydefault() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        AmountInputViewModel amountInputViewModel = (AmountInputViewModel) this.component1.getValue();
        if (i3 == 0) {
            return amountInputViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AmountInputViewModel copydefault(RoamingCashOutFragment roamingCashOutFragment) {
        double dDoubleValue;
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
        AmountValidationRule[] amountValidationRuleArr = new AmountValidationRule[3];
        Double maxAmount = roamingCashOutFragment.ShareDataUIState().getAmountConfig().getMaxAmount();
        double dDoubleValue2 = 0.0d;
        if (maxAmount != null) {
            int i4 = component3 + 71;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                dDoubleValue = maxAmount.doubleValue();
                int i5 = 1 / 0;
            } else {
                dDoubleValue = maxAmount.doubleValue();
            }
        } else {
            dDoubleValue = 0.0d;
        }
        amountValidationRuleArr[0] = new RoamingCashOutMaximumAmountRule(dDoubleValue);
        Double minAmount = roamingCashOutFragment.ShareDataUIState().getAmountConfig().getMinAmount();
        if (minAmount != null) {
            int i6 = copydefault + 113;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                minAmount.doubleValue();
                throw null;
            }
            dDoubleValue2 = minAmount.doubleValue();
        }
        amountValidationRuleArr[1] = new RoamingCashOutMinimumAmountRule(dDoubleValue2);
        amountValidationRuleArr[2] = new RoamingCashOutMultipleOf100Rule();
        return new AmountInputViewModel(roamingCashOutFragment.ShareDataUIState().getAmountConfig(), roamingCashOutFragment.getFeeCalculator(), roamingCashOutFragment.getAmountDataProvider(), CollectionsKt.listOf((Object[]) amountValidationRuleArr));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class component3 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int copydefault = 1;

        public static void component2() {
        }

        public static final CountryHeader copydefault(State state) {
            int i = 2 % 2;
            int i2 = component1 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            CountryHeader countryHeaderComponent1 = component1(state);
            int i4 = component1 + 45;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return countryHeaderComponent1;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = copydefault + 107;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component4 = 1;
            private static int copy;
            final NumberInputProcessor ShareDataUIState;
            final AmountInputProcessor component1;
            final AmountInputState component2;
            final NumberInputState component3;
            final State<CountryHeader> copydefault;
            final RoamingCashOutFragment getAsAtTimestamp;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component4 + 121;
                copy = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copy + 29;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 70 / 0;
                }
                return unit;
            }

            public final void component3(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = component4 + 59;
                    copy = i3 % 128;
                    int i4 = i3 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                CountryHeader countryHeaderCopydefault = component3.copydefault(this.copydefault);
                NumberInputState numberInputState = this.component3;
                AmountInputState amountInputState = this.component2;
                final NumberInputProcessor numberInputProcessor = this.ShareDataUIState;
                final RoamingCashOutFragment roamingCashOutFragment = this.getAsAtTimestamp;
                Function1 function1 = new Function1() {
                    private static int ShareDataUIState = 0;
                    private static int component2 = 1;

                    @Override
                    public final Object invoke(Object obj) throws IOException {
                        int i5 = 2 % 2;
                        int i6 = component2 + 99;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitCopydefault = RoamingCashOutFragment.component3.AnonymousClass4.copydefault(numberInputProcessor, roamingCashOutFragment, (String) obj);
                        int i8 = component2 + 19;
                        ShareDataUIState = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 75 / 0;
                        }
                        return unitCopydefault;
                    }
                };
                final AmountInputProcessor amountInputProcessor = this.component1;
                final RoamingCashOutFragment roamingCashOutFragment2 = this.getAsAtTimestamp;
                Function1 function12 = new Function1() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = copydefault + 105;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        AmountInputProcessor amountInputProcessor2 = amountInputProcessor;
                        if (i7 != 0) {
                            return RoamingCashOutFragment.component3.AnonymousClass4.ShareDataUIState(amountInputProcessor2, roamingCashOutFragment2, (String) obj);
                        }
                        RoamingCashOutFragment.component3.AnonymousClass4.ShareDataUIState(amountInputProcessor2, roamingCashOutFragment2, (String) obj);
                        throw null;
                    }
                };
                final RoamingCashOutFragment roamingCashOutFragment3 = this.getAsAtTimestamp;
                Function0 function0 = new Function0() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = copydefault + 11;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitComponent1 = RoamingCashOutFragment.component3.AnonymousClass4.component1(roamingCashOutFragment3);
                        int i8 = copydefault + 89;
                        component3 = i8 % 128;
                        if (i8 % 2 != 0) {
                            return unitComponent1;
                        }
                        throw null;
                    }
                };
                final RoamingCashOutFragment roamingCashOutFragment4 = this.getAsAtTimestamp;
                RoamingCashOutScreenKt.RoamingCashOutScreen(countryHeaderCopydefault, numberInputState, amountInputState, function1, function12, function0, new Function0() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = copydefault + 123;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitCopydefault = RoamingCashOutFragment.component3.AnonymousClass4.copydefault(roamingCashOutFragment4);
                        if (i7 != 0) {
                            int i8 = 45 / 0;
                        }
                        return unitCopydefault;
                    }
                }, null, composer, 0, 128);
                int i5 = copy + 71;
                component4 = i5 % 128;
                int i6 = i5 % 2;
            }

            private static final Unit component2(AmountInputProcessor amountInputProcessor, RoamingCashOutFragment roamingCashOutFragment, String str) {
                int i = 2 % 2;
                int i2 = component4 + 119;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(amountInputProcessor, "");
                    Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    amountInputProcessor.onInputChanged(str);
                    RoamingCashOutFragment.access$getViewModel(roamingCashOutFragment).onAmountChanged(str);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(amountInputProcessor, "");
                Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                amountInputProcessor.onInputChanged(str);
                RoamingCashOutFragment.access$getViewModel(roamingCashOutFragment).onAmountChanged(str);
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final Unit component2(NumberInputProcessor numberInputProcessor, RoamingCashOutFragment roamingCashOutFragment, String str) throws IOException {
                int i = 2 % 2;
                int i2 = component4 + 119;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(numberInputProcessor, "");
                    Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    numberInputProcessor.onInputChanged(str);
                    RoamingCashOutFragment.access$getViewModel(roamingCashOutFragment).onNumberChanged(str);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(numberInputProcessor, "");
                Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                numberInputProcessor.onInputChanged(str);
                RoamingCashOutFragment.access$getViewModel(roamingCashOutFragment).onNumberChanged(str);
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final Unit component3(RoamingCashOutFragment roamingCashOutFragment) {
                int i = 2 % 2;
                int i2 = component4 + 115;
                copy = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                    roamingCashOutFragment.handleBackAction();
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                roamingCashOutFragment.handleBackAction();
                Unit unit2 = Unit.INSTANCE;
                int i3 = component4 + 61;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 8 / 0;
                }
                return unit2;
            }

            private static final Unit ShareDataUIState(RoamingCashOutFragment roamingCashOutFragment) {
                int i = 2 % 2;
                int i2 = component4 + 67;
                copy = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                    RoamingCashOutFragment.access$onContinueClick(roamingCashOutFragment);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(roamingCashOutFragment, "");
                RoamingCashOutFragment.access$onContinueClick(roamingCashOutFragment);
                Unit unit2 = Unit.INSTANCE;
                int i3 = component4 + 23;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 65 / 0;
                }
                return unit2;
            }

            public static Unit copydefault(NumberInputProcessor numberInputProcessor, RoamingCashOutFragment roamingCashOutFragment, String str) throws IOException {
                int i = 2 % 2;
                int i2 = component4 + 95;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(numberInputProcessor, roamingCashOutFragment, str);
                int i4 = copy + 61;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent2;
            }

            public static Unit ShareDataUIState(AmountInputProcessor amountInputProcessor, RoamingCashOutFragment roamingCashOutFragment, String str) {
                int i = 2 % 2;
                int i2 = copy + 69;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(amountInputProcessor, roamingCashOutFragment, str);
                int i4 = copy + 119;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent2;
            }

            public static Unit copydefault(RoamingCashOutFragment roamingCashOutFragment) {
                int i = 2 % 2;
                int i2 = component4 + 37;
                copy = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    ShareDataUIState(roamingCashOutFragment);
                    obj.hashCode();
                    throw null;
                }
                Unit unitShareDataUIState = ShareDataUIState(roamingCashOutFragment);
                int i3 = component4 + 65;
                copy = i3 % 128;
                if (i3 % 2 == 0) {
                    return unitShareDataUIState;
                }
                throw null;
            }

            public static Unit component1(RoamingCashOutFragment roamingCashOutFragment) {
                int i = 2 % 2;
                int i2 = component4 + 89;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(roamingCashOutFragment);
                int i4 = component4 + 87;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent3;
                }
                throw null;
            }

            AnonymousClass4(NumberInputState numberInputState, AmountInputState amountInputState, State<CountryHeader> state, NumberInputProcessor numberInputProcessor, RoamingCashOutFragment roamingCashOutFragment, AmountInputProcessor amountInputProcessor) {
                this.component3 = numberInputState;
                this.component2 = amountInputState;
                this.copydefault = state;
                this.ShareDataUIState = numberInputProcessor;
                this.getAsAtTimestamp = roamingCashOutFragment;
                this.component1 = amountInputProcessor;
            }
        }

        public final void component1(Composer composer, int i) {
            int i2 = 2 % 2;
            Object obj = null;
            if ((i & 11) == 2) {
                int i3 = copydefault + 1;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        int i4 = copydefault + 77;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                } else {
                    composer.getSkipping();
                    obj.hashCode();
                    throw null;
                }
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(RoamingCashOutFragment.access$getViewModel(RoamingCashOutFragment.this).getCountryHeaderData(), null, composer, 8, 1);
            AmountInputState amountInputStateRememberAmountInputState = RememberAmountInputStateKt.rememberAmountInputState(RoamingCashOutFragment.access$getAmountInputViewModel(RoamingCashOutFragment.this), RoamingCashOutFragment.access$getViewModel(RoamingCashOutFragment.this).getAmountConfig().getCurrency(), StringResources_androidKt.stringResource(R.string.roamingCashOut_amountHint, composer, 0), null, composer, AmountInputViewModel.$stable, 8);
            composer.startReplaceGroup(-1142004053);
            RoamingCashOutFragment roamingCashOutFragment = RoamingCashOutFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AmountInputProcessor(RoamingCashOutFragment.access$getAmountInputViewModel(roamingCashOutFragment), 10, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(RoamingCashOutFragment.access$getAgentNumberViewModel(RoamingCashOutFragment.this).getUiState(), null, composer, 8, 1);
            NumberInputProcessor numberInputProcessorRememberNumberInputProcessor = RememberNumberInputProcessorKt.rememberNumberInputProcessor(RoamingCashOutFragment.access$getAgentNumberViewModel(RoamingCashOutFragment.this), composer, AlphanumericInputViewModel.$stable);
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-834132316, true, new AnonymousClass4(RememberNumberInputStateKt.rememberNumberInputState(component3(stateCollectAsState2), StringResources_androidKt.stringResource(R.string.roamingCashOut_agentNumberHint, composer, 0), NumberInputType.AGENT_NUMBER, null, false, false, false, null, null, composer, createNewMenuItem.copydefault, TypedValues.PositionType.TYPE_PERCENT_HEIGHT), amountInputStateRememberAmountInputState, stateCollectAsState, numberInputProcessorRememberNumberInputProcessor, RoamingCashOutFragment.this, (AmountInputProcessor) objRememberedValue), composer, 54), composer, 1572864, 63);
        }

        private static final CountryHeader component1(State<CountryHeader> state) {
            int i = 2 % 2;
            int i2 = component1 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            CountryHeader value = state.getValue();
            if (i3 != 0) {
                return value;
            }
            throw null;
        }

        private static final AlphanumericInputUiState component3(State<AlphanumericInputUiState> state) {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            AlphanumericInputUiState value = state.getValue();
            if (i3 != 0) {
                throw null;
            }
            int i4 = copydefault + 11;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component3() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(-1064269017, true, new component3()));
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            ShareDataUIState().onContinueClick();
            int i3 = 98 / 0;
        } else {
            ShareDataUIState().onContinueClick();
        }
        int i4 = component3 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState().onBackClick();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    public static AmountInputViewModel $r8$lambda$0qYwtLngcw32C6Z6D8upEDwikvI(RoamingCashOutFragment roamingCashOutFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        AmountInputViewModel amountInputViewModelCopydefault = copydefault(roamingCashOutFragment);
        int i4 = component3 + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return amountInputViewModelCopydefault;
    }

    static {
        if (97 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
