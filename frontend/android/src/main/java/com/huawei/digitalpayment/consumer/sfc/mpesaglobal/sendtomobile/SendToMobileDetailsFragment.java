package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

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
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDetailsState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.recipientdetails.RecipientDetailsState;
import com.huawei.digitalpayment.home.data.local.LocalBalance;
import com.huawei.digitalpayment.home.util.BalanceHelper;
import com.safaricom.consumer.commons.amountvalidation.AmountDetailsState;
import com.safaricom.consumer.commons.amountvalidation.AmountExtensionKt;
import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.fee.FeeTable;
import com.safaricom.consumer.commons.transaction.TransactionType;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileDetailsFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "sendToMobileViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileViewModel;", "getSendToMobileViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileViewModel;", "sendToMobileViewModel$delegate", "Lkotlin/Lazy;", "amountViewModel", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "getAmountViewModel", "()Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "amountViewModel$delegate", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "getConfigurations", "()Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "setConfigurations", "(Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "handleBackAction", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getAmountParams", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "observeMpesaBalance", "initAmountValidation", "ConsumerSfcUiMpesaGlobal_release", "recipientDetailsState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/recipientdetails/RecipientDetailsState;", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "selectionDetailsState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SendToMobileDetailsFragment extends Hilt_SendToMobileDetailsFragment {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 0;
    private static int copy = 107 % 128;
    private static int copydefault = 1;
    private final Lazy component1;
    private final Lazy component2;

    @Inject
    public ConfigurationRepository configurations;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int copydefault = 1;
        private final Function1 component1;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof Observer) || (!(obj instanceof FunctionAdapter))) {
                return false;
            }
            int i5 = i2 + 57;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i6 == 0) {
                return Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 67;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                Function1 function1 = this.component1;
                throw null;
            }
            Function1 function12 = this.component1;
            int i4 = i2 + 85;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return function12;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 51;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = component2 + 43;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            int i4 = copydefault + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final ConsumerAmountViewModel access$getAmountViewModel(SendToMobileDetailsFragment sendToMobileDetailsFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelComponent2 = sendToMobileDetailsFragment.component2();
        int i4 = component3 + 101;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return consumerAmountViewModelComponent2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final SendToMobileViewModel access$getSendToMobileViewModel(SendToMobileDetailsFragment sendToMobileDetailsFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            sendToMobileDetailsFragment.copydefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SendToMobileViewModel sendToMobileViewModelCopydefault = sendToMobileDetailsFragment.copydefault();
        int i3 = copydefault + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return sendToMobileViewModelCopydefault;
    }

    public SendToMobileDetailsFragment() {
        final SendToMobileDetailsFragment sendToMobileDetailsFragment = this;
        final Function0 function0 = null;
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(sendToMobileDetailsFragment, Reflection.getOrCreateKotlinClass(SendToMobileViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                ViewModelStore viewModelStoreInvoke;
                int i = 2 % 2;
                int i2 = component3 + 71;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    viewModelStoreInvoke = invoke();
                    int i3 = 93 / 0;
                } else {
                    viewModelStoreInvoke = invoke();
                }
                int i4 = copydefault + 41;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 89;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                FragmentActivity fragmentActivityRequireActivity = sendToMobileDetailsFragment.requireActivity();
                if (i3 != 0) {
                    return fragmentActivityRequireActivity.getViewModelStore();
                }
                fragmentActivityRequireActivity.getViewModelStore();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 79;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = copydefault + 39;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 97;
                int i3 = i2 % 128;
                copydefault = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    int i4 = i3 + 1;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (i5 == 0) {
                        throw null;
                    }
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sendToMobileDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 35;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 7;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToMobileDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component1 + 67;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
        final Function0 function02 = new Function0() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component2 + 23;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtras$r8$lambda$H8Qz9zO38iOSNvgUDiXsKWloQ0g = SendToMobileDetailsFragment.$r8$lambda$H8Qz9zO38iOSNvgUDiXsKWloQ0g(this.f$0);
                int i4 = component2 + 111;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtras$r8$lambda$H8Qz9zO38iOSNvgUDiXsKWloQ0g;
                }
                throw null;
            }
        };
        this.component1 = FragmentViewModelLazyKt.createViewModelLazy(sendToMobileDetailsFragment, Reflection.getOrCreateKotlinClass(ConsumerAmountViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 3;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 31;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 75;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    sendToMobileDetailsFragment.requireActivity().getViewModelStore();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = sendToMobileDetailsFragment.requireActivity().getViewModelStore();
                int i3 = component1 + 9;
                copydefault = i3 % 128;
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
                int i2 = ShareDataUIState + 99;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 1;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState
                    int r1 = r1 + 117
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.copydefault = r2
                    int r1 = r1 % r0
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L28
                    int r2 = r2 + 61
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState = r3
                    int r2 = r2 % r0
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r2 == 0) goto L26
                    r2 = 90
                    int r2 = r2 / 0
                    if (r1 != 0) goto L40
                    goto L28
                L26:
                    if (r1 != 0) goto L40
                L28:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState
                    int r2 = r2 + 39
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.copydefault = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L40
                    r2 = 4
                    int r2 = r2 / 3
                L40:
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState
                    int r2 = r2 + 125
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.copydefault = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$special$$inlined$activityViewModels$default$5.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 73;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 != 0) {
                    int i4 = 62 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToMobileDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = copydefault + 65;
                ShareDataUIState = i4 % 128;
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
        });
    }

    private final SendToMobileViewModel copydefault() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SendToMobileViewModel sendToMobileViewModel = (SendToMobileViewModel) this.component2.getValue();
        int i3 = copydefault + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return sendToMobileViewModel;
    }

    private final ConsumerAmountViewModel component2() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.component1.getValue();
        if (i3 == 0) {
            return (ConsumerAmountViewModel) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final CreationExtras ShareDataUIState(final SendToMobileDetailsFragment sendToMobileDetailsFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
        CreationExtras defaultViewModelCreationExtras = sendToMobileDetailsFragment.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        CreationExtras creationExtrasWithCreationCallback = HiltViewModelExtensions.withCreationCallback(defaultViewModelCreationExtras, new Function1() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 117;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ViewModel viewModel$r8$lambda$BrY1Hl_CggPOATKMly61n4ifo2E = SendToMobileDetailsFragment.$r8$lambda$BrY1Hl_CggPOATKMly61n4ifo2E(this.f$0, (ConsumerAmountViewModel.Factory) obj);
                if (i4 == 0) {
                    int i5 = 6 / 0;
                }
                return viewModel$r8$lambda$BrY1Hl_CggPOATKMly61n4ifo2E;
            }
        });
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return creationExtrasWithCreationCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ViewModel ShareDataUIState(SendToMobileDetailsFragment sendToMobileDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        ConsumerAmountViewModel consumerAmountViewModelCreate;
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
            Intrinsics.checkNotNullParameter(factory, "");
            consumerAmountViewModelCreate = factory.create(sendToMobileDetailsFragment.ShareDataUIState());
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
            Intrinsics.checkNotNullParameter(factory, "");
            consumerAmountViewModelCreate = factory.create(sendToMobileDetailsFragment.ShareDataUIState());
        }
        int i4 = component3 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return consumerAmountViewModelCreate;
    }

    public final ConfigurationRepository getConfigurations() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
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
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return configurationRepository;
        }
        throw null;
    }

    public final void setConfigurations(ConfigurationRepository configurationRepository) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        this.configurations = configurationRepository;
        int i4 = copydefault + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        copydefault().previousScreen();
        int i4 = copydefault + 3;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        public static final AmountDetailsState ShareDataUIState(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 99;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return component3(state);
            }
            component3(state);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final SelectionDetailsState component1(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState selectionDetailsStateCopy = copy(state);
            int i4 = copydefault + 37;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return selectionDetailsStateCopy;
            }
            throw null;
        }

        public static final RecipientDetailsState component2(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            RecipientDetailsState recipientDetailsStateCopydefault = copydefault(state);
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            int i5 = ShareDataUIState + 37;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return recipientDetailsStateCopydefault;
            }
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 37;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int getRequestBeneficiariesState = 1;
            final State<AmountDetailsState> component1;
            final State<SelectionDetailsState> component2;
            final SendToMobileDetailsFragment component3;
            final State<RecipientDetailsState> copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 19;
                getRequestBeneficiariesState = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 != 0) {
                    copydefault(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
                copydefault(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 119;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 82) == 2) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                RecipientDetailsState recipientDetailsStateComponent2 = ShareDataUIState.component2(this.copydefault);
                AmountDetailsState amountDetailsStateShareDataUIState = ShareDataUIState.ShareDataUIState(this.component1);
                SelectionDetailsState selectionDetailsStateComponent1 = ShareDataUIState.component1(this.component2);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3);
                C02454 c02454 = new C02454(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass10 anonymousClass10 = new AnonymousClass10(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass8 anonymousClass8 = new AnonymousClass8(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(SendToMobileDetailsFragment.access$getSendToMobileViewModel(this.component3));
                final SendToMobileDetailsFragment sendToMobileDetailsFragment = this.component3;
                SendToMobileDetailsScreenKt.SendToMobileDetailsScreen(recipientDetailsStateComponent2, amountDetailsStateShareDataUIState, selectionDetailsStateComponent1, anonymousClass3, anonymousClass2, c02454, anonymousClass1, new Function1() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        Unit unitShareDataUIState;
                        int i4 = 2 % 2;
                        int i5 = component2 + 23;
                        component3 = i5 % 128;
                        if (i5 % 2 == 0) {
                            unitShareDataUIState = SendToMobileDetailsFragment.ShareDataUIState.AnonymousClass4.ShareDataUIState(sendToMobileDetailsFragment, (String) obj);
                            int i6 = 22 / 0;
                        } else {
                            unitShareDataUIState = SendToMobileDetailsFragment.ShareDataUIState.AnonymousClass4.ShareDataUIState(sendToMobileDetailsFragment, (String) obj);
                        }
                        int i7 = component3 + 61;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                        return unitShareDataUIState;
                    }
                }, anonymousClass7, anonymousClass6, anonymousClass10, anonymousClass5, anonymousClass9, anonymousClass8, composer, 576, 0, 0);
                int i4 = ShareDataUIState + 91;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 1;
                private static int component1;

                public final void component2() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 105;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ((SendToMobileViewModel) this.receiver).onSelectContact();
                    int i4 = component1 + 55;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 107;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    component2();
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 55 / 0;
                    }
                    return unit;
                }

                AnonymousClass3(Object obj) {
                    super(0, obj, SendToMobileViewModel.class, "onSelectContact", "onSelectContact()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component2 = 0;
                private static int copydefault = 1;

                public final void component3() {
                    int i = 2 % 2;
                    int i2 = component2 + 105;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ((SendToMobileDetailsFragment) this.receiver).handleBackAction();
                    int i4 = copydefault + 109;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component2 + 51;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    component3();
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return unit;
                    }
                    throw null;
                }

                AnonymousClass2(Object obj) {
                    super(0, obj, SendToMobileDetailsFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class C02454 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component3 = 1;
                private static int copydefault;

                public final void component3() {
                    int i = 2 % 2;
                    int i2 = component3 + 37;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ((SendToMobileViewModel) this.receiver).onDetailsContinue();
                    int i4 = copydefault + 107;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 27;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    component3();
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 79;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                C02454(Object obj) {
                    super(0, obj, SendToMobileViewModel.class, "onDetailsContinue", "onDetailsContinue()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int component2 = 1;
                private static int component3;

                public final void ShareDataUIState(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 73;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    ((SendToMobileViewModel) this.receiver).updatePhoneNumber(str);
                    int i4 = component3 + 37;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 31 / 0;
                    }
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = component2 + 101;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState(str);
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 33;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass1(Object obj) {
                    super(1, obj, SendToMobileViewModel.class, "updatePhoneNumber", "updatePhoneNumber(Ljava/lang/String;)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass7 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component2 = 0;
                private static int copydefault = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component2 + 15;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ((SendToMobileViewModel) this.receiver).onChangeCountry();
                    int i4 = copydefault + 115;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 13;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 58 / 0;
                    }
                    return unit;
                }

                AnonymousClass7(Object obj) {
                    super(0, obj, SendToMobileViewModel.class, "onChangeCountry", "onChangeCountry()V", 0);
                }
            }

            private static final Unit copydefault(SendToMobileDetailsFragment sendToMobileDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    SendToMobileDetailsFragment.access$getSendToMobileViewModel(sendToMobileDetailsFragment).updateAmount(str);
                    SendToMobileDetailsFragment.access$getAmountViewModel(sendToMobileDetailsFragment).validateInput(str);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                SendToMobileDetailsFragment.access$getSendToMobileViewModel(sendToMobileDetailsFragment).updateAmount(str);
                SendToMobileDetailsFragment.access$getAmountViewModel(sendToMobileDetailsFragment).validateInput(str);
                Unit unit2 = Unit.INSTANCE;
                int i3 = getRequestBeneficiariesState + 23;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass6 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int component1 = 1;
                private static int component2;

                public final void ShareDataUIState(int i) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 49;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    ((SendToMobileViewModel) this.receiver).updateSelectedSourceOfFunds(i);
                    int i5 = component1 + 35;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = component2 + 63;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass6(Object obj) {
                    super(1, obj, SendToMobileViewModel.class, "updateSelectedSourceOfFunds", "updateSelectedSourceOfFunds(I)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass10 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int component2 = 0;
                private static int copydefault = 1;

                public final void component2(int i) {
                    int i2 = 2 % 2;
                    int i3 = copydefault + 125;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    ((SendToMobileViewModel) this.receiver).updateSelectedPurposeOfFunds(i);
                    int i5 = component2 + 109;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 35 / 0;
                    }
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = copydefault + 105;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    component2(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 51;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass10(Object obj) {
                    super(1, obj, SendToMobileViewModel.class, "updateSelectedPurposeOfFunds", "updateSelectedPurposeOfFunds(I)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass9 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                public final void ShareDataUIState(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 21;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    ((SendToMobileViewModel) this.receiver).updateOtherSourceOfFunds(str);
                    int i4 = ShareDataUIState + 17;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 33;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState(str);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 68 / 0;
                    }
                    int i5 = ShareDataUIState + 33;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }

                AnonymousClass9(Object obj) {
                    super(1, obj, SendToMobileViewModel.class, "updateOtherSourceOfFunds", "updateOtherSourceOfFunds(Ljava/lang/String;)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass8 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int component1 = 0;
                private static int component3 = 1;

                public final void copydefault(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 95;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    ((SendToMobileViewModel) this.receiver).updateOtherPurposeOfFunds(str);
                    int i4 = component3 + 53;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 47;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault(str);
                    Unit unit = Unit.INSTANCE;
                    int i4 = component1 + 79;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass8(Object obj) {
                    super(1, obj, SendToMobileViewModel.class, "updateOtherPurposeOfFunds", "updateOtherPurposeOfFunds(Ljava/lang/String;)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass5 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;

                public final void copydefault(int i) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 75;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    ((SendToMobileViewModel) this.receiver).updateSelectedCarrier(i);
                    int i5 = ShareDataUIState + 63;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 76 / 0;
                    }
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 59;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    int iIntValue = num.intValue();
                    if (i3 != 0) {
                        copydefault(iIntValue);
                        return Unit.INSTANCE;
                    }
                    copydefault(iIntValue);
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass5(Object obj) {
                    super(1, obj, SendToMobileViewModel.class, "updateSelectedCarrier", "updateSelectedCarrier(I)V", 0);
                }
            }

            public static Unit ShareDataUIState(SendToMobileDetailsFragment sendToMobileDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 55;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(sendToMobileDetailsFragment, str);
                int i4 = ShareDataUIState + 25;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass4(SendToMobileDetailsFragment sendToMobileDetailsFragment, State<RecipientDetailsState> state, State<AmountDetailsState> state2, State<SelectionDetailsState> state3) {
                this.component3 = sendToMobileDetailsFragment;
                this.copydefault = state;
                this.component1 = state2;
                this.component2 = state3;
            }
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = ShareDataUIState + 101;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (!composer.getSkipping()) {
                    int i5 = ShareDataUIState + 107;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1476670666, true, new AnonymousClass4(SendToMobileDetailsFragment.this, FlowExtKt.collectAsStateWithLifecycle(SendToMobileDetailsFragment.access$getSendToMobileViewModel(SendToMobileDetailsFragment.this).getRecipientDetailState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7), FlowExtKt.collectAsStateWithLifecycle(SendToMobileDetailsFragment.access$getSendToMobileViewModel(SendToMobileDetailsFragment.this).getAmountDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7), FlowExtKt.collectAsStateWithLifecycle(SendToMobileDetailsFragment.access$getSendToMobileViewModel(SendToMobileDetailsFragment.this).getSelectionDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
        }

        private static final RecipientDetailsState copydefault(State<RecipientDetailsState> state) {
            int i = 2 % 2;
            int i2 = copydefault + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RecipientDetailsState value = state.getValue();
            int i4 = ShareDataUIState + 31;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final AmountDetailsState component3(State<AmountDetailsState> state) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            AmountDetailsState value = state.getValue();
            if (i3 != 0) {
                int i4 = 28 / 0;
            }
            int i5 = ShareDataUIState + 13;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 67 / 0;
            }
            return value;
        }

        private static final SelectionDetailsState copy(State<SelectionDetailsState> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState value = state.getValue();
            int i4 = ShareDataUIState + 89;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        ShareDataUIState() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        component3();
        component1();
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(-254162329, true, new ShareDataUIState()));
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AmountViewModel.AmountViewModelParams ShareDataUIState() {
        int i = 2 % 2;
        AmountViewModel.AmountViewModelParams amountViewModelParams = new AmountViewModel.AmountViewModelParams(false, false, ConfigurationRepository.getMaxAmountForTransaction$default(getConfigurations(), TransactionType.GLOBAL_SEND_TO_MOBILE, null, 2, null), ConfigurationRepository.getMinAmountForTransaction$default(getConfigurations(), TransactionType.GLOBAL_SEND_TO_MOBILE, null, 2, null), new component2(copydefault()), null, FeeTable.INSTANCE.emptyFeeTable(), null, false, false, false, false, 3584, null);
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return amountViewModelParams;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class component2 extends FunctionReferenceImpl implements Function0<Double> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        public final Double component3() {
            int i = 2 % 2;
            int i2 = component1 + 23;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                Double.valueOf(((SendToMobileViewModel) this.receiver).calculateAmount());
                throw null;
            }
            Double dValueOf = Double.valueOf(((SendToMobileViewModel) this.receiver).calculateAmount());
            int i3 = component1 + 121;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return dValueOf;
        }

        @Override
        public Double invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                component3();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Double dComponent3 = component3();
            int i3 = component1 + 9;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 85 / 0;
            }
            return dComponent3;
        }

        component2(Object obj) {
            super(0, obj, SendToMobileViewModel.class, "calculateAmount", "calculateAmount()D", 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$observeMpesaBalance$1", f = "SendToMobileDetailsFragment.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileDetailsFragment$observeMpesaBalance$1$1", f = "SendToMobileDetailsFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component2;
            int component1;
            final SendToMobileDetailsFragment component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 69;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component1;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<LocalBalance> balance2 = BalanceHelper.INSTANCE.getBalance2();
                    final SendToMobileDetailsFragment sendToMobileDetailsFragment = this.component3;
                    this.component1 = 1;
                    if (balance2.collect(new FlowCollector() {
                        private static int component2 = 1;
                        private static int component3;

                        @Override
                        public Object emit(Object obj3, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = component2 + 55;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
                            Object objComponent3 = component3((LocalBalance) obj3, continuation);
                            int i7 = component2 + 91;
                            component3 = i7 % 128;
                            int i8 = i7 % 2;
                            return objComponent3;
                        }

                        public final Object component3(LocalBalance localBalance, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = component2 + 65;
                            component3 = i5 % 128;
                            Object obj3 = null;
                            if (i5 % 2 == 0) {
                                double doubleOrZero = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                                SendToMobileDetailsFragment.access$getAmountViewModel(sendToMobileDetailsFragment).setCurrentBalance(doubleOrZero);
                                SendToMobileDetailsFragment.access$getSendToMobileViewModel(sendToMobileDetailsFragment).updateMpesaBalance(doubleOrZero);
                                Unit unit = Unit.INSTANCE;
                                int i6 = component3 + 25;
                                component2 = i6 % 128;
                                if (i6 % 2 != 0) {
                                    return unit;
                                }
                                throw null;
                            }
                            double doubleOrZero2 = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                            SendToMobileDetailsFragment.access$getAmountViewModel(sendToMobileDetailsFragment).setCurrentBalance(doubleOrZero2);
                            SendToMobileDetailsFragment.access$getSendToMobileViewModel(sendToMobileDetailsFragment).updateMpesaBalance(doubleOrZero2);
                            Unit unit2 = Unit.INSTANCE;
                            obj3.hashCode();
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        int i4 = component2 + 39;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SendToMobileDetailsFragment sendToMobileDetailsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component3 = sendToMobileDetailsFragment;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component3, continuation);
                int i2 = component2 + 47;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 41;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    copydefault(coroutineScope2, continuation2);
                    throw null;
                }
                Object objCopydefault = copydefault(coroutineScope2, continuation2);
                int i3 = ShareDataUIState + 73;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 85;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToMobileDetailsFragment.this, Lifecycle.State.STARTED, new AnonymousClass1(SendToMobileDetailsFragment.this, null), this) == coroutine_suspended) {
                    int i3 = copydefault + 105;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = copydefault + 43;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i6 = 50 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                int i7 = ShareDataUIState + 3;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 3;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i9 = ShareDataUIState + 47;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 40 / 0;
            }
            return unit;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = SendToMobileDetailsFragment.this.new copydefault(continuation);
            int i2 = ShareDataUIState + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 99;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private final void component1() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new copydefault(null), 3, null);
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit component1(SendToMobileDetailsFragment sendToMobileDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
        SendToMobileViewModel sendToMobileViewModelCopydefault = sendToMobileDetailsFragment.copydefault();
        Intrinsics.checkNotNull(bool);
        sendToMobileViewModelCopydefault.updateAmountValidityStatus(bool.booleanValue());
        Unit unit = Unit.INSTANCE;
        int i4 = copydefault + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void component3() {
        int i = 2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelComponent2 = component2();
        consumerAmountViewModelComponent2.getValidInput().observe(getViewLifecycleOwner(), new component3(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM11054$r8$lambda$MBhkSk62SUHrJX4EWkC8MQTQYQ = SendToMobileDetailsFragment.m11054$r8$lambda$MBhkSk62SUHrJX4EWkC8MQTQYQ(this.f$0, (Boolean) obj);
                if (i4 != 0) {
                    int i5 = 42 / 0;
                }
                return unitM11054$r8$lambda$MBhkSk62SUHrJX4EWkC8MQTQYQ;
            }
        }));
        consumerAmountViewModelComponent2.getErrorState().observe(getViewLifecycleOwner(), new component3(new Function1() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 47;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    SendToMobileDetailsFragment.m11053$r8$lambda$H6_EoWmTm5TddfM1h2dHWqioc(this.f$0, (AmountViewModel.AmountError) obj);
                    throw null;
                }
                Unit unitM11053$r8$lambda$H6_EoWmTm5TddfM1h2dHWqioc = SendToMobileDetailsFragment.m11053$r8$lambda$H6_EoWmTm5TddfM1h2dHWqioc(this.f$0, (AmountViewModel.AmountError) obj);
                int i4 = component1 + 47;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitM11053$r8$lambda$H6_EoWmTm5TddfM1h2dHWqioc;
            }
        }));
        int i2 = component3 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit ShareDataUIState(SendToMobileDetailsFragment sendToMobileDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sendToMobileDetailsFragment, "");
        if (amountError != null) {
            int i4 = component3 + 111;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            sendToMobileDetailsFragment.copydefault().handleAmountError(amountError, TransactionType.SEND_MONEY_TO_WESTERN_UNION);
        }
        return Unit.INSTANCE;
    }

    public static ViewModel $r8$lambda$BrY1Hl_CggPOATKMly61n4ifo2E(SendToMobileDetailsFragment sendToMobileDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewModel viewModelShareDataUIState = ShareDataUIState(sendToMobileDetailsFragment, factory);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = copydefault + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return viewModelShareDataUIState;
    }

    public static Unit m11053$r8$lambda$H6_EoWmTm5TddfM1h2dHWqioc(SendToMobileDetailsFragment sendToMobileDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(sendToMobileDetailsFragment, amountError);
        int i4 = copydefault + 37;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitShareDataUIState;
        }
        throw null;
    }

    public static CreationExtras $r8$lambda$H8Qz9zO38iOSNvgUDiXsKWloQ0g(SendToMobileDetailsFragment sendToMobileDetailsFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CreationExtras creationExtrasShareDataUIState = ShareDataUIState(sendToMobileDetailsFragment);
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return creationExtrasShareDataUIState;
    }

    public static Unit m11054$r8$lambda$MBhkSk62SUHrJX4EWkC8MQTQYQ(SendToMobileDetailsFragment sendToMobileDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent1 = component1(sendToMobileDetailsFragment, bool);
        int i4 = component3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent1;
    }

    static {
        int i = 107 % 2;
    }
}
