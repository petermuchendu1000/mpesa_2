package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
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
import com.huawei.digitalpayment.consumer.sfc.global.databinding.ComposeViewLayoutBinding;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/amountdetails/SendToBankAmountDetailsFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcBaseFragment;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/global/databinding/ComposeViewLayoutBinding;", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "getConfigurations", "()Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "setConfigurations", "(Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "amountViewModel", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "getAmountViewModel", "()Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "amountViewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "handleBackAction", "", "onViewCreated", "view", "observeMpesaBalance", "initAmountValidation", "getAmountParams", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "ConsumerSfcUiMpesaGlobal_release", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "selectionDetailsState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/amountdetails/SelectionDetailsState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SendToBankAmountDetailsFragment extends Hilt_SendToBankAmountDetailsFragment {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component4 = 0;
    private static int copy = 83 % 128;
    private ComposeViewLayoutBinding ShareDataUIState;
    private final Lazy component3;

    @Inject
    public ConfigurationRepository configurations;
    private final Lazy copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int component3 = 1;
        private static int copydefault;
        private final Function1 component1;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L30
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.component3
                int r1 = r1 + 97
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.copydefault = r3
                int r1 = r1 % r0
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L30
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.component3
                int r1 = r1 + 79
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.copydefault = r3
                int r1 = r1 % r0
                goto L31
            L30:
                r5 = r2
            L31:
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.component3
                int r1 = r1 + 99
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.copydefault = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L3f
                r0 = 29
                int r0 = r0 / r2
            L3f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component1;
            if (i3 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 99;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = copydefault + 71;
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
            int i2 = component3 + 69;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            int i4 = copydefault + 27;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final ConsumerAmountViewModel access$getAmountViewModel(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelComponent3 = sendToBankAmountDetailsFragment.component3();
        int i4 = component2 + 15;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return consumerAmountViewModelComponent3;
    }

    public static final SendToBankViewModel access$getViewModel(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SendToBankViewModel sendToBankViewModelComponent1 = sendToBankAmountDetailsFragment.component1();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return sendToBankViewModelComponent1;
    }

    public SendToBankAmountDetailsFragment() {
        final SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment = this;
        final Function0 function0 = null;
        this.component3 = FragmentViewModelLazyKt.createViewModelLazy(sendToBankAmountDetailsFragment, Reflection.getOrCreateKotlinClass(SendToBankViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public ViewModelStore invoke() {
                ViewModelStore viewModelStoreInvoke;
                int i = 2 % 2;
                int i2 = component3 + 55;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    viewModelStoreInvoke = invoke();
                    int i3 = 16 / 0;
                } else {
                    viewModelStoreInvoke = invoke();
                }
                int i4 = component3 + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 23;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sendToBankAmountDetailsFragment.requireActivity().getViewModelStore();
                int i4 = component3 + 55;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 77 / 0;
                }
                return viewModelStore;
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
                int i2 = ShareDataUIState + 123;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = component2 + 93;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 103;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    int i4 = i2 + 5;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (i5 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sendToBankAmountDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 107;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 41;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return factoryInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = component1 + 95;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    defaultViewModelProviderFactory = sendToBankAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                    int i3 = 10 / 0;
                } else {
                    defaultViewModelProviderFactory = sendToBankAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                }
                int i4 = component1 + 55;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
        final Function0 function02 = new Function0() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 7;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment2 = this.f$0;
                if (i3 == 0) {
                    return SendToBankAmountDetailsFragment.$r8$lambda$TWBScjQkr4Xh9QHFhOHcbCNCL40(sendToBankAmountDetailsFragment2);
                }
                SendToBankAmountDetailsFragment.$r8$lambda$TWBScjQkr4Xh9QHFhOHcbCNCL40(sendToBankAmountDetailsFragment2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(sendToBankAmountDetailsFragment, Reflection.getOrCreateKotlinClass(ConsumerAmountViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 11;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 105;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sendToBankAmountDetailsFragment.requireActivity().getViewModelStore();
                int i4 = component1 + 49;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 48 / 0;
                }
                return viewModelStore;
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
                int i2 = copydefault + 3;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 27;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                Function0 function03 = function02;
                if (function03 != null) {
                    int i2 = component3 + 67;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    CreationExtras creationExtras = (CreationExtras) function03.invoke();
                    if (i3 != 0) {
                        int i4 = 32 / 0;
                        if (creationExtras != null) {
                            return creationExtras;
                        }
                    } else if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = sendToBankAmountDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
                int i5 = component3 + 81;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 1;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 77;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sendToBankAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component2 + 121;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    private final SendToBankViewModel component1() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SendToBankViewModel sendToBankViewModel = (SendToBankViewModel) this.component3.getValue();
        int i4 = component1 + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return sendToBankViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 119;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component2 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.safaricom.consumer.commons.configuration.ConfigurationRepository getConfigurations() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component1
            int r2 = r1 + 111
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component2 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            com.safaricom.consumer.commons.configuration.ConfigurationRepository r2 = r5.configurations
            r4 = 1
            int r4 = r4 / 0
            if (r2 == 0) goto L29
            goto L1b
        L17:
            com.safaricom.consumer.commons.configuration.ConfigurationRepository r2 = r5.configurations
            if (r2 == 0) goto L29
        L1b:
            int r1 = r1 + 119
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.component2 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L25
            return r2
        L25:
            r3.hashCode()
            throw r3
        L29:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment.getConfigurations():com.safaricom.consumer.commons.configuration.ConfigurationRepository");
    }

    public final void setConfigurations(ConfigurationRepository configurationRepository) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(configurationRepository, "");
            this.configurations = configurationRepository;
            throw null;
        }
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        this.configurations = configurationRepository;
        int i3 = component2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
    }

    private final ConsumerAmountViewModel component3() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.copydefault.getValue();
        if (i3 != 0) {
            return (ConsumerAmountViewModel) value;
        }
        throw null;
    }

    private static final CreationExtras copydefault(final SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
        CreationExtras defaultViewModelCreationExtras = sendToBankAmountDetailsFragment.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        CreationExtras creationExtrasWithCreationCallback = HiltViewModelExtensions.withCreationCallback(defaultViewModelCreationExtras, new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 121;
                component3 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    SendToBankAmountDetailsFragment.$r8$lambda$2tsIUwkw078XrpW4T7mtC4Xm6Y8(this.f$0, (ConsumerAmountViewModel.Factory) obj);
                    obj2.hashCode();
                    throw null;
                }
                ViewModel viewModel$r8$lambda$2tsIUwkw078XrpW4T7mtC4Xm6Y8 = SendToBankAmountDetailsFragment.$r8$lambda$2tsIUwkw078XrpW4T7mtC4Xm6Y8(this.f$0, (ConsumerAmountViewModel.Factory) obj);
                int i4 = component3 + 33;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModel$r8$lambda$2tsIUwkw078XrpW4T7mtC4Xm6Y8;
                }
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return creationExtrasWithCreationCallback;
    }

    private static final ViewModel copydefault(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
        Intrinsics.checkNotNullParameter(factory, "");
        ConsumerAmountViewModel consumerAmountViewModelCreate = factory.create(sendToBankAmountDetailsFragment.ShareDataUIState());
        int i4 = component1 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return consumerAmountViewModelCreate;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        ComposeViewLayoutBinding composeViewLayoutBindingInflate = ComposeViewLayoutBinding.inflate(LayoutInflater.from(requireActivity()), container, false);
        this.ShareDataUIState = composeViewLayoutBindingInflate;
        if (composeViewLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            composeViewLayoutBindingInflate = null;
        }
        ComposeView root = composeViewLayoutBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ComposeView composeView = root;
        int i4 = component1 + 73;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return composeView;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            component1().previousScreen();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        component1().previousScreen();
        int i3 = component1 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        public static final AmountDetailsState component1(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefault(state);
            }
            copydefault(state);
            throw null;
        }

        public static final SelectionDetailsState component2(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState selectionDetailsStateShareDataUIState = ShareDataUIState(state);
            int i4 = component3 + 53;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return selectionDetailsStateShareDataUIState;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 47;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component1;
            final State<AmountDetailsState> component2;
            final State<SelectionDetailsState> component3;
            final SendToBankAmountDetailsFragment copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    int i4 = 10 / 0;
                }
                return unit;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 97;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 71) == 4) {
                    int i5 = i4 + 57;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        composer.getSkipping();
                        throw null;
                    }
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                AmountDetailsState amountDetailsStateComponent1 = component2.component1(this.component2);
                SelectionDetailsState selectionDetailsStateComponent2 = component2.component2(this.component3);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                C02403 c02403 = new C02403(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                AnonymousClass10 anonymousClass10 = new AnonymousClass10(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(SendToBankAmountDetailsFragment.access$getViewModel(this.copydefault));
                C02403 c024032 = c02403;
                final SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment = this.copydefault;
                SendToBankAmountDetailsScreenKt.SendToBankAmountDetailsScreen(amountDetailsStateComponent1, selectionDetailsStateComponent2, anonymousClass1, anonymousClass4, c024032, new Function1() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        Unit unitComponent1;
                        int i6 = 2 % 2;
                        int i7 = copydefault + 19;
                        component2 = i7 % 128;
                        if (i7 % 2 == 0) {
                            unitComponent1 = SendToBankAmountDetailsFragment.component2.AnonymousClass3.component1(sendToBankAmountDetailsFragment, (String) obj);
                            int i8 = 68 / 0;
                        } else {
                            unitComponent1 = SendToBankAmountDetailsFragment.component2.AnonymousClass3.component1(sendToBankAmountDetailsFragment, (String) obj);
                        }
                        int i9 = component2 + 45;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                        return unitComponent1;
                    }
                }, anonymousClass10, anonymousClass6, anonymousClass2, anonymousClass5, composer, 72, 0);
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component3 + 35;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ((SendToBankViewModel) this.receiver).previousScreen();
                    int i4 = component3 + 107;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 123;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass2(Object obj) {
                    super(0, obj, SendToBankViewModel.class, "previousScreen", "previousScreen()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass5 extends AdaptedFunctionReference implements Function0<Unit> {
                private static int component1 = 0;
                private static int component3 = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component3 + 111;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    SendToBankViewModel sendToBankViewModel = (SendToBankViewModel) this.receiver;
                    if (i3 == 0) {
                        sendToBankViewModel.onAmountDetailsContinue();
                    } else {
                        sendToBankViewModel.onAmountDetailsContinue();
                        throw null;
                    }
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component3 + 115;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    if (i3 != 0) {
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    int i4 = component1 + 3;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit2;
                }

                AnonymousClass5(Object obj) {
                    super(0, obj, SendToBankViewModel.class, "onAmountDetailsContinue", "onAmountDetailsContinue()Lkotlinx/coroutines/Job;", 8);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class C02403 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int ShareDataUIState = 1;
                private static int component1;

                @Override
                public Unit invoke(Integer num) throws Throwable {
                    int i = 2 % 2;
                    int i2 = component1 + 3;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    component3(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        int i4 = 57 / 0;
                    }
                    int i5 = ShareDataUIState + 17;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final void component3(int i) throws Throwable {
                    int i2 = 2 % 2;
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - View.MeasureSpec.makeMeasureSpec(0, 0), 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (19696 - View.MeasureSpec.getSize(0)), 518907119, false, "component3", null);
                    }
                    int i3 = ((Field) objCopydefault).getInt(null);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 38, Color.argb(0, 0, 0, 0) + 30, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 55511118, false, "component2", null);
                    }
                    int i4 = ((Field) objCopydefault2).getInt(null);
                    long j = i4;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - View.getDefaultSize(0, 0), (char) TextUtils.indexOf("", ""), 58536393, false, "component3", null);
                    }
                    int i5 = ((Field) objCopydefault3).getInt(null);
                    long j2 = -755;
                    long j3 = -1;
                    long j4 = ((687260393073647520L ^ j3) | (j3 ^ 105443060570556904L)) ^ j3;
                    long jIdentityHashCode = System.identityHashCode(this);
                    long j5 = (j2 * 687260393073647520L) + (j2 * 105443060570556904L) + (((long) 1512) * j4) + (((long) (-756)) * (j4 | ((720501103482871784L | jIdentityHashCode) ^ j3))) + (((long) 756) * (720501103482871784L | (j3 ^ jIdentityHashCode)));
                    int i6 = 0;
                    int i7 = i5;
                    while (true) {
                        int i8 = 0;
                        while (i8 != 8) {
                            int i9 = component1 + 103;
                            ShareDataUIState = i9 % 128;
                            if (i9 % 2 == 0) {
                                i7 = (((((int) (j << i8)) & 28389) / (i7 >>> 24)) * (i7 >> 27)) << i7;
                                i8 += 9;
                            } else {
                                i7 = (((((int) (j >> i8)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                                i8++;
                            }
                        }
                        if (i6 != 0) {
                            break;
                        }
                        i6++;
                        j = j5;
                    }
                    if (i7 != i3) {
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 67, 33 - (Process.myTid() >> 22), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19696), 1457147715, false, "copydefault", null);
                        }
                        Object obj = ((Field) objCopydefault4).get(null);
                        long j6 = -1;
                        long j7 = 0;
                        long j8 = (((long) (i4 ^ i3)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)))) | (((long) 1) << 32) | (j7 - ((j7 >> 63) << 32));
                        try {
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault5 == null) {
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 6619, View.getDefaultSize(0, 0) + 42, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                            Object[] objArr = {-1853021515, Long.valueOf(j8), obj, null, false, false};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 56 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-16777216) - Color.rgb(0, 0, 0)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault6).invoke(objInvoke, objArr);
                            throw new RuntimeException(String.valueOf(i4));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    ((SendToBankViewModel) this.receiver).updateSelectedPurposeOfFunds(i);
                    int i10 = ShareDataUIState + 123;
                    component1 = i10 % 128;
                    int i11 = i10 % 2;
                }

                C02403(Object obj) {
                    super(1, obj, SendToBankViewModel.class, "updateSelectedPurposeOfFunds", "updateSelectedPurposeOfFunds(I)V", 0);
                }
            }

            private static final Unit copydefault(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    SendToBankAmountDetailsFragment.access$getViewModel(sendToBankAmountDetailsFragment).updateAmount(str);
                    SendToBankAmountDetailsFragment.access$getAmountViewModel(sendToBankAmountDetailsFragment).validateInput(str);
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                SendToBankAmountDetailsFragment.access$getViewModel(sendToBankAmountDetailsFragment).updateAmount(str);
                SendToBankAmountDetailsFragment.access$getAmountViewModel(sendToBankAmountDetailsFragment).validateInput(str);
                Unit unit2 = Unit.INSTANCE;
                int i3 = ShareDataUIState + 119;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int component3 = 0;
                private static int copydefault = 1;

                public final void component3(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 1;
                    copydefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        ((SendToBankViewModel) this.receiver).updateSelectedSourceOfFunds(i);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ((SendToBankViewModel) this.receiver).updateSelectedSourceOfFunds(i);
                    int i4 = component3 + 93;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 93 / 0;
                    }
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = copydefault + 81;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    component3(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i4 = component3 + 63;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 16 / 0;
                    }
                    return unit;
                }

                AnonymousClass4(Object obj) {
                    super(1, obj, SendToBankViewModel.class, "updateSelectedSourceOfFunds", "updateSelectedSourceOfFunds(I)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int ShareDataUIState = 1;
                private static int component1;

                public final void ShareDataUIState(int i) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 51;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    ((SendToBankViewModel) this.receiver).updateSelectedCurrency(i);
                    int i5 = ShareDataUIState + 99;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = component1 + 17;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 125;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass1(Object obj) {
                    super(1, obj, SendToBankViewModel.class, "updateSelectedCurrency", "updateSelectedCurrency(I)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass10 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int ShareDataUIState = 1;
                private static int component1;

                public final void component1(String str) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 67;
                    component1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(str, "");
                        ((SendToBankViewModel) this.receiver).updateOtherSourceOfFunds(str);
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(str, "");
                    ((SendToBankViewModel) this.receiver).updateOtherSourceOfFunds(str);
                    int i3 = component1 + 83;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 55;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    component1(str);
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 63;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass10(Object obj) {
                    super(1, obj, SendToBankViewModel.class, "updateOtherSourceOfFunds", "updateOtherSourceOfFunds(Ljava/lang/String;)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass6 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void component1(String str) {
                    int i = 2 % 2;
                    int i2 = copydefault + 7;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(str, "");
                        ((SendToBankViewModel) this.receiver).updateOtherPurposeOfFunds(str);
                    } else {
                        Intrinsics.checkNotNullParameter(str, "");
                        ((SendToBankViewModel) this.receiver).updateOtherPurposeOfFunds(str);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = copydefault + 29;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    component1(str);
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 117;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass6(Object obj) {
                    super(1, obj, SendToBankViewModel.class, "updateOtherPurposeOfFunds", "updateOtherPurposeOfFunds(Ljava/lang/String;)V", 0);
                }
            }

            public static Unit component1(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = component1 + 47;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return copydefault(sendToBankAmountDetailsFragment, str);
                }
                copydefault(sendToBankAmountDetailsFragment, str);
                throw null;
            }

            AnonymousClass3(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, State<AmountDetailsState> state, State<SelectionDetailsState> state2) {
                this.copydefault = sendToBankAmountDetailsFragment;
                this.component2 = state;
                this.component3 = state2;
            }
        }

        public final void ShareDataUIState(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 77;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 79) == 3) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1246066272, true, new AnonymousClass3(SendToBankAmountDetailsFragment.this, FlowExtKt.collectAsStateWithLifecycle(SendToBankAmountDetailsFragment.access$getViewModel(SendToBankAmountDetailsFragment.this).getAmountDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7), FlowExtKt.collectAsStateWithLifecycle(SendToBankAmountDetailsFragment.access$getViewModel(SendToBankAmountDetailsFragment.this).getSelectionDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
            int i4 = ShareDataUIState + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final AmountDetailsState copydefault(State<AmountDetailsState> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AmountDetailsState value = state.getValue();
            int i4 = ShareDataUIState + 35;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final SelectionDetailsState ShareDataUIState(State<SelectionDetailsState> state) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState value = state.getValue();
            int i4 = component3 + 85;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component2() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        component2();
        copydefault();
        ComposeViewLayoutBinding composeViewLayoutBinding = this.ShareDataUIState;
        if (composeViewLayoutBinding == null) {
            int i2 = component1 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = component2 + 77;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            composeViewLayoutBinding = null;
        }
        composeViewLayoutBinding.getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(1388457661, true, new component2()));
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment$observeMpesaBalance$1", f = "SendToBankAmountDetailsFragment.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails.SendToBankAmountDetailsFragment$observeMpesaBalance$1$1", f = "SendToBankAmountDetailsFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 1;
            private static int copydefault;
            int ShareDataUIState;
            final SendToBankAmountDetailsFragment component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.ShareDataUIState;
                if (i2 != 0) {
                    int i3 = component1 + 113;
                    copydefault = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<LocalBalance> balance2 = BalanceHelper.INSTANCE.getBalance2();
                    final SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment = this.component3;
                    this.ShareDataUIState = 1;
                    if (balance2.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int copydefault;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = copydefault + 39;
                            ShareDataUIState = i5 % 128;
                            int i6 = i5 % 2;
                            Object objComponent1 = component1((LocalBalance) obj2, continuation);
                            int i7 = ShareDataUIState + 45;
                            copydefault = i7 % 128;
                            int i8 = i7 % 2;
                            return objComponent1;
                        }

                        public final Object component1(LocalBalance localBalance, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = copydefault + 33;
                            ShareDataUIState = i5 % 128;
                            int i6 = i5 % 2;
                            double doubleOrZero = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                            SendToBankAmountDetailsFragment.access$getAmountViewModel(sendToBankAmountDetailsFragment).setCurrentBalance(doubleOrZero);
                            SendToBankAmountDetailsFragment.access$getViewModel(sendToBankAmountDetailsFragment).updateMpesaBalance(doubleOrZero);
                            Unit unit = Unit.INSTANCE;
                            int i7 = copydefault + 31;
                            ShareDataUIState = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 1 / 0;
                            }
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        int i4 = component1 + 23;
                        copydefault = i4 % 128;
                        if (i4 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component3 = sendToBankAmountDetailsFragment;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component3, continuation);
                int i2 = component1 + 7;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 32 / 0;
                }
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent3 = component3(coroutineScope, continuation);
                int i4 = component1 + 49;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return objComponent3;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 65;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    anonymousClass1.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass1.invokeSuspend(unit);
                int i4 = copydefault + 61;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 91;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 39;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i7 = 0 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SendToBankAmountDetailsFragment.this, Lifecycle.State.STARTED, new AnonymousClass1(SendToBankAmountDetailsFragment.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = component2 + 45;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = SendToBankAmountDetailsFragment.this.new ShareDataUIState(continuation);
            int i2 = component2 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component2 + 37;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            if (i3 == 0) {
                return shareDataUIState.invokeSuspend(Unit.INSTANCE);
            }
            shareDataUIState.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    private final void copydefault() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = component2 + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit component2(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
            SendToBankViewModel sendToBankViewModelComponent1 = sendToBankAmountDetailsFragment.component1();
            Intrinsics.checkNotNull(bool);
            sendToBankViewModelComponent1.updateAmountValidityStatus(bool.booleanValue());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
        SendToBankViewModel sendToBankViewModelComponent12 = sendToBankAmountDetailsFragment.component1();
        Intrinsics.checkNotNull(bool);
        sendToBankViewModelComponent12.updateAmountValidityStatus(bool.booleanValue());
        int i3 = 27 / 0;
        return Unit.INSTANCE;
    }

    private final void component2() {
        int i = 2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelComponent3 = component3();
        consumerAmountViewModelComponent3.getValidInput().observe(getViewLifecycleOwner(), new component1(new Function1() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM11029$r8$lambda$hEf_j_ZOXCaodp7y5whqDw9ShM = SendToBankAmountDetailsFragment.m11029$r8$lambda$hEf_j_ZOXCaodp7y5whqDw9ShM(this.f$0, (Boolean) obj);
                int i5 = copydefault + 63;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 43 / 0;
                }
                return unitM11029$r8$lambda$hEf_j_ZOXCaodp7y5whqDw9ShM;
            }
        }));
        consumerAmountViewModelComponent3.getErrorState().observe(getViewLifecycleOwner(), new component1(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 97;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$MIcMWNkJLK_6qZLRbpXzrxoFwOA = SendToBankAmountDetailsFragment.$r8$lambda$MIcMWNkJLK_6qZLRbpXzrxoFwOA(this.f$0, (AmountViewModel.AmountError) obj);
                if (i4 != 0) {
                    int i5 = 42 / 0;
                }
                return unit$r8$lambda$MIcMWNkJLK_6qZLRbpXzrxoFwOA;
            }
        }));
        int i2 = component1 + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit copydefault(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sendToBankAmountDetailsFragment, "");
        if (amountError != null) {
            sendToBankAmountDetailsFragment.component1().handleAmountError(amountError, TransactionType.GLOBAL_SEND_TO_BANK);
            int i3 = component2 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private final AmountViewModel.AmountViewModelParams ShareDataUIState() {
        int i = 2 % 2;
        AmountViewModel.AmountViewModelParams amountViewModelParams = new AmountViewModel.AmountViewModelParams(false, false, ConfigurationRepository.getMaxAmountForTransaction$default(getConfigurations(), TransactionType.GLOBAL_SEND_TO_BANK, null, 2, null), ConfigurationRepository.getMinAmountForTransaction$default(getConfigurations(), TransactionType.GLOBAL_SEND_TO_BANK, null, 2, null), new copydefault(component1()), null, FeeTable.INSTANCE.emptyFeeTable(), null, false, false, false, false, 3584, null);
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return amountViewModelParams;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class copydefault extends FunctionReferenceImpl implements Function0<Double> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        public final Double copydefault() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = Double.valueOf(((SendToBankViewModel) this.receiver).calculateAmount());
            int i4 = component3 + 91;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
            }
            return dValueOf;
        }

        @Override
        public Double invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Double dCopydefault = copydefault();
            int i4 = ShareDataUIState + 93;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return dCopydefault;
        }

        copydefault(Object obj) {
            super(0, obj, SendToBankViewModel.class, "calculateAmount", "calculateAmount()D", 0);
        }
    }

    public static ViewModel $r8$lambda$2tsIUwkw078XrpW4T7mtC4Xm6Y8(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewModel viewModelCopydefault = copydefault(sendToBankAmountDetailsFragment, factory);
        int i4 = component2 + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return viewModelCopydefault;
    }

    public static Unit $r8$lambda$MIcMWNkJLK_6qZLRbpXzrxoFwOA(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(sendToBankAmountDetailsFragment, amountError);
        int i4 = component1 + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    public static CreationExtras $r8$lambda$TWBScjQkr4Xh9QHFhOHcbCNCL40(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CreationExtras creationExtrasCopydefault = copydefault(sendToBankAmountDetailsFragment);
        int i4 = component2 + 85;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return creationExtrasCopydefault;
        }
        throw null;
    }

    public static Unit m11029$r8$lambda$hEf_j_ZOXCaodp7y5whqDw9ShM(SendToBankAmountDetailsFragment sendToBankAmountDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = component2(sendToBankAmountDetailsFragment, bool);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = component2 + 55;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return unitComponent2;
    }

    static {
        if (83 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
