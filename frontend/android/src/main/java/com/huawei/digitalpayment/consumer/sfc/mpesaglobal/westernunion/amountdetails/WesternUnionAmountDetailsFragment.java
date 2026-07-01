package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
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
import com.huawei.digitalpayment.consumer.sfc.global.databinding.ComposeViewLayoutBinding;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDetailsState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.INotificationSideChannel;
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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/amountdetails/WesternUnionAmountDetailsFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcBaseFragment;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/global/databinding/ComposeViewLayoutBinding;", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "getConfigurations", "()Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "setConfigurations", "(Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "amountViewModel", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "getAmountViewModel", "()Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "amountViewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "handleBackAction", "", "onViewCreated", "view", "observeMpesaBalance", "initAmountValidation", "getAmountParams", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "ConsumerSfcUiMpesaGlobal_release", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "selectionDetailsState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class WesternUnionAmountDetailsFragment extends Hilt_WesternUnionAmountDetailsFragment {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private final Lazy component2;
    private final Lazy component3;

    @Inject
    public ConfigurationRepository configurations;
    private ComposeViewLayoutBinding copydefault;

    public static final ConsumerAmountViewModel access$getAmountViewModel(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelComponent1 = westernUnionAmountDetailsFragment.component1();
        int i4 = ShareDataUIState + 125;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return consumerAmountViewModelComponent1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final WesternUnionViewModel access$getViewModel(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        WesternUnionViewModel westernUnionViewModelCopydefault = westernUnionAmountDetailsFragment.copydefault();
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return westernUnionViewModelCopydefault;
    }

    public WesternUnionAmountDetailsFragment() {
        final WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment = this;
        final Function0 function0 = null;
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(westernUnionAmountDetailsFragment, Reflection.getOrCreateKotlinClass(WesternUnionViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public ViewModelStore invoke() {
                ViewModelStore viewModelStoreInvoke;
                int i = 2 % 2;
                int i2 = component1 + 117;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    viewModelStoreInvoke = invoke();
                    int i3 = 27 / 0;
                } else {
                    viewModelStoreInvoke = invoke();
                }
                int i4 = component3 + 25;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 30 / 0;
                }
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 89;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = westernUnionAmountDetailsFragment.requireActivity().getViewModelStore();
                int i4 = component3 + 101;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
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
                int i2 = copydefault + 15;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 125;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 9;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = westernUnionAmountDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
                }
                int i3 = ShareDataUIState + 103;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 83 / 0;
                }
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 77;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 23;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = component3 + 49;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    defaultViewModelProviderFactory = westernUnionAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                    int i3 = 29 / 0;
                } else {
                    defaultViewModelProviderFactory = westernUnionAmountDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
                }
                int i4 = component3 + 69;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
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
        final Function0 function02 = new Function0() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component3 + 39;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    WesternUnionAmountDetailsFragment.$r8$lambda$EfjnRsBmLSZnAPNSUlgtZB90Sas(this.f$0);
                    throw null;
                }
                CreationExtras creationExtras$r8$lambda$EfjnRsBmLSZnAPNSUlgtZB90Sas = WesternUnionAmountDetailsFragment.$r8$lambda$EfjnRsBmLSZnAPNSUlgtZB90Sas(this.f$0);
                int i3 = component1 + 113;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 58 / 0;
                }
                return creationExtras$r8$lambda$EfjnRsBmLSZnAPNSUlgtZB90Sas;
            }
        };
        this.component3 = FragmentViewModelLazyKt.createViewModelLazy(westernUnionAmountDetailsFragment, Reflection.getOrCreateKotlinClass(ConsumerAmountViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 91;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component3 + 19;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 17;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    westernUnionAmountDetailsFragment.requireActivity().getViewModelStore();
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = westernUnionAmountDetailsFragment.requireActivity().getViewModelStore();
                int i3 = copydefault + 105;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
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
                int i2 = ShareDataUIState + 113;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component2 + 59;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return creationExtrasInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
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
                    int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$special$$inlined$activityViewModels$default$5.component2
                    int r2 = r1 + 85
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState = r3
                    int r2 = r2 % r0
                    kotlin.jvm.functions.Function0 r2 = r1
                    if (r2 == 0) goto L1f
                    int r1 = r1 + 109
                    int r3 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState = r3
                    int r1 = r1 % r0
                    java.lang.Object r1 = r2.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L29
                L1f:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L29:
                    int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$special$$inlined$activityViewModels$default$5.ShareDataUIState
                    int r2 = r2 + 29
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$special$$inlined$activityViewModels$default$5.component2 = r3
                    int r2 = r2 % r0
                    if (r2 == 0) goto L38
                    r0 = 93
                    int r0 = r0 / 0
                L38:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$special$$inlined$activityViewModels$default$5.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 101;
                copydefault = i2 % 128;
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
                int i2 = component3 + 23;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                FragmentActivity fragmentActivityRequireActivity = westernUnionAmountDetailsFragment.requireActivity();
                if (i3 == 0) {
                    return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
                }
                fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
                throw null;
            }

            {
                super(0);
            }
        });
    }

    private final WesternUnionViewModel copydefault() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        WesternUnionViewModel westernUnionViewModel = (WesternUnionViewModel) this.component2.getValue();
        int i4 = ShareDataUIState + 101;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return westernUnionViewModel;
    }

    public final ConfigurationRepository getConfigurations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ConfigurationRepository configurationRepository = this.configurations;
        if (configurationRepository == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return configurationRepository;
    }

    public final void setConfigurations(ConfigurationRepository configurationRepository) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(configurationRepository, "");
            this.configurations = configurationRepository;
        } else {
            Intrinsics.checkNotNullParameter(configurationRepository, "");
            this.configurations = configurationRepository;
            int i3 = 16 / 0;
        }
    }

    private final ConsumerAmountViewModel component1() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConsumerAmountViewModel consumerAmountViewModel = (ConsumerAmountViewModel) this.component3.getValue();
        int i3 = component1 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return consumerAmountViewModel;
    }

    private static final CreationExtras component3(final WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
        CreationExtras defaultViewModelCreationExtras = westernUnionAmountDetailsFragment.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        CreationExtras creationExtrasWithCreationCallback = HiltViewModelExtensions.withCreationCallback(defaultViewModelCreationExtras, new Function1() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ViewModel viewModel$r8$lambda$l2MqdjqWQ0nD_JoihOxDTJ0iLPA = WesternUnionAmountDetailsFragment.$r8$lambda$l2MqdjqWQ0nD_JoihOxDTJ0iLPA(this.f$0, (ConsumerAmountViewModel.Factory) obj);
                int i5 = ShareDataUIState + 49;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return viewModel$r8$lambda$l2MqdjqWQ0nD_JoihOxDTJ0iLPA;
            }
        });
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return creationExtrasWithCreationCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ViewModel ShareDataUIState(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        ConsumerAmountViewModel consumerAmountViewModelCreate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
            Intrinsics.checkNotNullParameter(factory, "");
            consumerAmountViewModelCreate = factory.create(westernUnionAmountDetailsFragment.component3());
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
            Intrinsics.checkNotNullParameter(factory, "");
            consumerAmountViewModelCreate = factory.create(westernUnionAmountDetailsFragment.component3());
        }
        int i4 = component1 + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return consumerAmountViewModelCreate;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        ComposeViewLayoutBinding composeViewLayoutBindingInflate = ComposeViewLayoutBinding.inflate(LayoutInflater.from(requireActivity()), container, false);
        this.copydefault = composeViewLayoutBindingInflate;
        if (composeViewLayoutBindingInflate == null) {
            int i2 = ShareDataUIState + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            composeViewLayoutBindingInflate = null;
        }
        ComposeView root = composeViewLayoutBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ComposeView composeView = root;
        int i4 = ShareDataUIState + 75;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return composeView;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        copydefault().previousScreen();
        int i4 = component1 + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int component3 = 1;

        public static final AmountDetailsState ShareDataUIState(State state) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                component1(state);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AmountDetailsState amountDetailsStateComponent1 = component1(state);
            int i3 = component3 + 93;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
            return amountDetailsStateComponent1;
        }

        public static final SelectionDetailsState copydefault(State state) {
            int i = 2 % 2;
            int i2 = component2 + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState selectionDetailsStateComponent2 = component2(state);
            int i4 = component3 + 121;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return selectionDetailsStateComponent2;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 87;
            component2 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component3(composer2, num2.intValue());
                return Unit.INSTANCE;
            }
            component3(composer2, num2.intValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 1;
            private static int copydefault;
            final State<SelectionDetailsState> ShareDataUIState;
            final WesternUnionAmountDetailsFragment component2;
            final State<AmountDetailsState> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component1 + 59;
                copydefault = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 != 0) {
                    copydefault(composer2, num2.intValue());
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                copydefault(composer2, num2.intValue());
                Unit unit2 = Unit.INSTANCE;
                int i3 = copydefault + 71;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 52 / 0;
                }
                return unit2;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 41) == 2) {
                    int i5 = i4 + 55;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                AmountDetailsState amountDetailsStateShareDataUIState = ShareDataUIState.ShareDataUIState(this.component3);
                SelectionDetailsState selectionDetailsStateCopydefault = ShareDataUIState.copydefault(this.ShareDataUIState);
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                C02522 c02522 = new C02522(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(WesternUnionAmountDetailsFragment.access$getViewModel(this.component2));
                C02522 c025222 = c02522;
                final WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment = this.component2;
                WesternUnionAmountDetailsScreenKt.WesternUnionAmountDetailsScreen(amountDetailsStateShareDataUIState, selectionDetailsStateCopydefault, anonymousClass1, anonymousClass3, c025222, new Function1() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = component3 + 1;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitCopydefault = WesternUnionAmountDetailsFragment.ShareDataUIState.AnonymousClass2.copydefault(westernUnionAmountDetailsFragment, (String) obj);
                        int i10 = component1 + 99;
                        component3 = i10 % 128;
                        if (i10 % 2 != 0) {
                            return unitCopydefault;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, anonymousClass9, anonymousClass7, anonymousClass5, anonymousClass4, composer, 72, 0);
                int i7 = component1 + 95;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass5 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void ShareDataUIState() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 47;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((WesternUnionViewModel) this.receiver).previousScreen();
                        int i3 = 93 / 0;
                    } else {
                        ((WesternUnionViewModel) this.receiver).previousScreen();
                    }
                    int i4 = ShareDataUIState + 91;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 51;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState();
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        int i4 = 26 / 0;
                    }
                    return unit;
                }

                AnonymousClass5(Object obj) {
                    super(0, obj, WesternUnionViewModel.class, "previousScreen", "previousScreen()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass4 extends AdaptedFunctionReference implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 3;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ((WesternUnionViewModel) this.receiver).onAmountDetailsContinue();
                    if (i3 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 53;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 61;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass4(Object obj) {
                    super(0, obj, WesternUnionViewModel.class, "onAmountDetailsContinue", "onAmountDetailsContinue()Lkotlinx/coroutines/Job;", 8);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class C02522 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int component3 = 0;
                private static int copydefault = 1;

                public final void copydefault(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 105;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    ((WesternUnionViewModel) this.receiver).updateSelectedPurposeOfFunds(i);
                    int i5 = copydefault + 75;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = component3 + 21;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 113;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                C02522(Object obj) {
                    super(1, obj, WesternUnionViewModel.class, "updateSelectedPurposeOfFunds", "updateSelectedPurposeOfFunds(I)V", 0);
                }
            }

            private static final Unit ShareDataUIState(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = copydefault + 91;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    WesternUnionAmountDetailsFragment.access$getViewModel(westernUnionAmountDetailsFragment).updateAmount(str);
                    WesternUnionAmountDetailsFragment.access$getAmountViewModel(westernUnionAmountDetailsFragment).validateInput(str);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                WesternUnionAmountDetailsFragment.access$getViewModel(westernUnionAmountDetailsFragment).updateAmount(str);
                WesternUnionAmountDetailsFragment.access$getAmountViewModel(westernUnionAmountDetailsFragment).validateInput(str);
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int component1 = 1;
                private static int component2;

                public final void ShareDataUIState(int i) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 69;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    ((WesternUnionViewModel) this.receiver).updateSelectedSourceOfFunds(i);
                    int i5 = component2 + 119;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = component2 + 51;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    ShareDataUIState(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = component1 + 27;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                AnonymousClass3(Object obj) {
                    super(1, obj, WesternUnionViewModel.class, "updateSelectedSourceOfFunds", "updateSelectedSourceOfFunds(I)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                private static int component2 = 0;
                private static int component3 = 1;

                public final void copydefault(int i) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 41;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    WesternUnionViewModel westernUnionViewModel = (WesternUnionViewModel) this.receiver;
                    if (i4 != 0) {
                        westernUnionViewModel.updateSelectedCurrency(i);
                        return;
                    }
                    westernUnionViewModel.updateSelectedCurrency(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = component2 + 109;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault(num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i4 = component3 + 67;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass1(Object obj) {
                    super(1, obj, WesternUnionViewModel.class, "updateSelectedCurrency", "updateSelectedCurrency(I)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass9 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int component3 = 0;
                private static int copydefault = 1;

                public final void component2(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 95;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(str, "");
                        ((WesternUnionViewModel) this.receiver).updateOtherSourceOfFunds(str);
                    } else {
                        Intrinsics.checkNotNullParameter(str, "");
                        ((WesternUnionViewModel) this.receiver).updateOtherSourceOfFunds(str);
                        int i3 = 62 / 0;
                    }
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = component3 + 71;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    component2(str);
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 5;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass9(Object obj) {
                    super(1, obj, WesternUnionViewModel.class, "updateOtherSourceOfFunds", "updateOtherSourceOfFunds(Ljava/lang/String;)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass7 extends FunctionReferenceImpl implements Function1<String, Unit> {
                private static int ShareDataUIState = 1;
                private static int component1;

                public final void component2(String str) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 71;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    ((WesternUnionViewModel) this.receiver).updateOtherPurposeOfFunds(str);
                    int i4 = ShareDataUIState + 87;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke(String str) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 89;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    component2(str);
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 25;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                AnonymousClass7(Object obj) {
                    super(1, obj, WesternUnionViewModel.class, "updateOtherPurposeOfFunds", "updateOtherPurposeOfFunds(Ljava/lang/String;)V", 0);
                }
            }

            public static Unit copydefault(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, String str) {
                int i = 2 % 2;
                int i2 = component1 + 45;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(westernUnionAmountDetailsFragment, str);
                int i4 = component1 + 99;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitShareDataUIState;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass2(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, State<AmountDetailsState> state, State<SelectionDetailsState> state2) {
                this.component2 = westernUnionAmountDetailsFragment;
                this.component3 = state;
                this.ShareDataUIState = state2;
            }
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = component3 + 35;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                } else {
                    composer.getSkipping();
                    throw null;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(367743582, true, new AnonymousClass2(WesternUnionAmountDetailsFragment.this, FlowExtKt.collectAsStateWithLifecycle(WesternUnionAmountDetailsFragment.access$getViewModel(WesternUnionAmountDetailsFragment.this).getAmountDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7), FlowExtKt.collectAsStateWithLifecycle(WesternUnionAmountDetailsFragment.access$getViewModel(WesternUnionAmountDetailsFragment.this).getSelectionDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
            int i4 = component2 + 29;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final AmountDetailsState component1(State<AmountDetailsState> state) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AmountDetailsState value = state.getValue();
            int i4 = component3 + 41;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return value;
        }

        private static final SelectionDetailsState component2(State<SelectionDetailsState> state) {
            int i = 2 % 2;
            int i2 = component2 + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SelectionDetailsState value = state.getValue();
            int i4 = component2 + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        ShareDataUIState() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        ComposeViewLayoutBinding composeViewLayoutBinding = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            ShareDataUIState();
            component2();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ShareDataUIState();
        component2();
        ComposeViewLayoutBinding composeViewLayoutBinding2 = this.copydefault;
        if (composeViewLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            composeViewLayoutBinding = composeViewLayoutBinding2;
        }
        composeViewLayoutBinding.getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(-201855557, true, new ShareDataUIState()));
        int i3 = ShareDataUIState + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$observeMpesaBalance$1", f = "WesternUnionAmountDetailsFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment$observeMpesaBalance$1$1", f = "WesternUnionAmountDetailsFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            int component3;
            final WesternUnionAmountDetailsFragment copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component3;
                if (i2 != 0) {
                    int i3 = component2 + 97;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<LocalBalance> balance2 = BalanceHelper.INSTANCE.getBalance2();
                    final WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment = this.copydefault;
                    this.component3 = 1;
                    if (balance2.collect(new FlowCollector() {
                        private static int component1 = 0;
                        private static int component2 = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = component2 + 49;
                            component1 = i5 % 128;
                            LocalBalance localBalance = (LocalBalance) obj2;
                            if (i5 % 2 == 0) {
                                return copydefault(localBalance, continuation);
                            }
                            copydefault(localBalance, continuation);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object copydefault(LocalBalance localBalance, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = component2 + 19;
                            component1 = i5 % 128;
                            if (i5 % 2 == 0) {
                                double doubleOrZero = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                                WesternUnionAmountDetailsFragment.access$getAmountViewModel(westernUnionAmountDetailsFragment).setCurrentBalance(doubleOrZero);
                                WesternUnionAmountDetailsFragment.access$getViewModel(westernUnionAmountDetailsFragment).updateMpesaBalance(doubleOrZero);
                                Unit unit = Unit.INSTANCE;
                                int i6 = component2 + 25;
                                component1 = i6 % 128;
                                int i7 = i6 % 2;
                                return unit;
                            }
                            double doubleOrZero2 = AmountExtensionKt.toDoubleOrZero(localBalance.getBalance());
                            WesternUnionAmountDetailsFragment.access$getAmountViewModel(westernUnionAmountDetailsFragment).setCurrentBalance(doubleOrZero2);
                            WesternUnionAmountDetailsFragment.access$getViewModel(westernUnionAmountDetailsFragment).updateMpesaBalance(doubleOrZero2);
                            Unit unit2 = Unit.INSTANCE;
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        int i4 = component2 + 101;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.copydefault = westernUnionAmountDetailsFragment;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.copydefault, continuation);
                int i2 = ShareDataUIState + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 79;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = component2 + 39;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 33;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(coroutineScope, continuation);
                if (i3 == 0) {
                    anonymousClass2.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2.invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 55;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 67 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 103;
            component1 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.ShareDataUIState;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(WesternUnionAmountDetailsFragment.this, Lifecycle.State.STARTED, new AnonymousClass2(WesternUnionAmountDetailsFragment.this, null), this) == coroutine_suspended) {
                    int i4 = component3;
                    int i5 = i4 + 115;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 77;
                    component1 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 83 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i9 = component3 + 15;
                component1 = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = WesternUnionAmountDetailsFragment.this.new component2(continuation);
            int i2 = component1 + 55;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 7;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 15;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private final void component2() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component2(null), 3, null);
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit ShareDataUIState(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
            WesternUnionViewModel westernUnionViewModelCopydefault = westernUnionAmountDetailsFragment.copydefault();
            Intrinsics.checkNotNull(bool);
            westernUnionViewModelCopydefault.updateAmountValidityStatus(bool.booleanValue());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
        WesternUnionViewModel westernUnionViewModelCopydefault2 = westernUnionAmountDetailsFragment.copydefault();
        Intrinsics.checkNotNull(bool);
        westernUnionViewModelCopydefault2.updateAmountValidityStatus(bool.booleanValue());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        ConsumerAmountViewModel consumerAmountViewModelComponent1 = component1();
        consumerAmountViewModelComponent1.getValidInput().observe(getViewLifecycleOwner(), new component3(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    WesternUnionAmountDetailsFragment.$r8$lambda$Z6O4h3BszpRtO6ekJhkaN7InUj8(this.f$0, (Boolean) obj);
                    throw null;
                }
                Unit unit$r8$lambda$Z6O4h3BszpRtO6ekJhkaN7InUj8 = WesternUnionAmountDetailsFragment.$r8$lambda$Z6O4h3BszpRtO6ekJhkaN7InUj8(this.f$0, (Boolean) obj);
                int i4 = component1 + 123;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 73 / 0;
                }
                return unit$r8$lambda$Z6O4h3BszpRtO6ekJhkaN7InUj8;
            }
        }));
        consumerAmountViewModelComponent1.getErrorState().observe(getViewLifecycleOwner(), new component3(new Function1() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 63;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$7Y6JkOyExIUy7ljeIo1ygMOAH4g = WesternUnionAmountDetailsFragment.$r8$lambda$7Y6JkOyExIUy7ljeIo1ygMOAH4g(this.f$0, (AmountViewModel.AmountError) obj);
                int i5 = component1 + 23;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$7Y6JkOyExIUy7ljeIo1ygMOAH4g;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit ShareDataUIState(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(westernUnionAmountDetailsFragment, "");
        if (amountError != null) {
            int i3 = ShareDataUIState + 11;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                westernUnionAmountDetailsFragment.copydefault().handleAmountError(amountError, TransactionType.SEND_MONEY_TO_WESTERN_UNION);
                obj.hashCode();
                throw null;
            }
            westernUnionAmountDetailsFragment.copydefault().handleAmountError(amountError, TransactionType.SEND_MONEY_TO_WESTERN_UNION);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ShareDataUIState + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final AmountViewModel.AmountViewModelParams component3() {
        int i = 2 % 2;
        AmountViewModel.AmountViewModelParams amountViewModelParams = new AmountViewModel.AmountViewModelParams(false, false, ConfigurationRepository.getMaxAmountForTransaction$default(getConfigurations(), TransactionType.SEND_MONEY_TO_WESTERN_UNION, null, 2, null), ConfigurationRepository.getMinAmountForTransaction$default(getConfigurations(), TransactionType.SEND_MONEY_TO_WESTERN_UNION, null, 2, null), new component1(copydefault()), null, FeeTable.INSTANCE.emptyFeeTable(), null, false, false, false, false, 3584, null);
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return amountViewModelParams;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class component1 extends FunctionReferenceImpl implements Function0<Double> {
        private static int ShareDataUIState = 1;
        private static int component1;

        public final Double copydefault() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Double dValueOf = Double.valueOf(((WesternUnionViewModel) this.receiver).calculateAmount());
            int i4 = ShareDataUIState + 109;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return dValueOf;
        }

        @Override
        public Double invoke() {
            int i = 2 % 2;
            int i2 = component1 + 53;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                copydefault();
                throw null;
            }
            Double dCopydefault = copydefault();
            int i3 = ShareDataUIState + 31;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return dCopydefault;
        }

        component1(Object obj) {
            super(0, obj, WesternUnionViewModel.class, "calculateAmount", "calculateAmount()D", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private final Function1 component1;
        private static final byte[] $$c = {32, 13, -54, -47};
        private static final int $$d = 45;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {80, -19, -87, -22, -38, -24, -29, -25, -25, -17, -35, -32, 39};
        private static final int $$b = 25;
        private static int component3 = 0;
        private static int equals = 1;
        private static long copydefault = -3780477796495014671L;
        private static int ShareDataUIState = -1361696957;
        private static char component2 = 50417;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r5, int r6, int r7) {
            /*
                int r5 = r5 * 3
                int r5 = 3 - r5
                int r6 = 99 - r6
                int r7 = r7 * 2
                int r0 = r7 + 1
                byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L20:
                int r3 = r3 + 1
                int r5 = r5 + 1
                r4 = r1[r5]
            L26:
                int r6 = r6 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.$$e(int, int, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 99
                byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.$$a
                int r8 = r8 * 2
                int r8 = 3 - r8
                int r7 = r7 * 4
                int r1 = r7 + 10
                byte[] r1 = new byte[r1]
                int r7 = r7 + 9
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L31
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r8 = r8 + 1
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L31:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r8 + (-26)
                r8 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.b(short, int, int, java.lang.Object[]):void");
        }

        private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i4 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            iNotificationSideChannel.copydefault = 0;
            while (iNotificationSideChannel.copydefault < length3) {
                int i5 = $10 + 51;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        int iGreen = 4037 - Color.green(i4);
                        int iRed = 31 - Color.red(i4);
                        char mode = (char) (19181 - View.MeasureSpec.getMode(i4));
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$e = $$e(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iGreen, iRed, mode, 1912513118, false, str$$e, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 7567;
                        int iAxisFromString = 10 - MotionEvent.axisFromString("");
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i4, i4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, iAxisFromString, absoluteGravity, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i7);
                    objArr4[i4] = iNotificationSideChannel;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) i4;
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - TextUtils.getOffsetBefore("", i4), TextUtils.lastIndexOf("", '0') + 29, (char) ExpandableListView.getPackedPositionType(0L), 931716605, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 7567, 11 - Color.alpha(0), (char) (Process.myPid() >> 22), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i8 = $10 + 101;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        @Override
        public final void onChanged(Object obj) throws Throwable {
            long j;
            int i = 2 % 2;
            Function1 function1 = this.component1;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
            char c2 = '0';
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 67, 'Q' - AndroidCharacter.getMirror('0'), (char) (View.MeasureSpec.getSize(0) + 19696), 520092524, false, "component2", null);
            }
            int i2 = ((Field) objCopydefault).getInt(null);
            Object[] objArr = new Object[1];
            a((char) (AndroidCharacter.getMirror('0') - '0'), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{37816, 41760, 47619, 2906, 14118, 47748, 50603, 40379, 20461, 39648, 42087, 9260, 45257, 2334, 63977, 62763, 39595, 31396, 57434, 29393, 1722, 27970}, new char[]{34503, 19167, 52179, 30337}, new char[]{0, 0, 0, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((char) (Color.alpha(0) + 16649), (-1631571084) - Color.green(0), new char[]{9434, 9516, 56584, 33032, 28442, 22572, 43750, 33037, 48114, 64687, 24364, 31383, 63800, 16590, 2471}, new char[]{29921, 49203, 2462, 57921}, new char[]{0, 0, 0, 0}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j2 = 530;
            long j3 = ((long) 1058) + (j2 * 2904294507189744106L) + (j2 * 1551428589416766219L);
            long j4 = 529;
            long j5 = (int) Runtime.getRuntime().totalMemory();
            long j6 = -1;
            long j7 = j3 + (((((j5 ^ j6) | 2904294507189744106L) ^ j6) | (4454034156417711083L ^ j6)) * j4) + (j4 * ((j6 ^ 1551428589416766219L) | ((j5 | 2904294507189744106L) ^ j6)));
            int i3 = 0;
            while (true) {
                if (i3 != 10) {
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.indexOf("", c2) + 1), 846241313, false, "copydefault", null);
                    }
                    int i4 = ((Field) objCopydefault2).getInt(null);
                    long j8 = jLongValue;
                    int i5 = 0;
                    while (true) {
                        int i6 = 0;
                        while (i6 != 8) {
                            i4 = (((((int) (j8 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                            i6++;
                            j7 = j7;
                        }
                        j = j7;
                        if (i5 != 0) {
                            break;
                        }
                        i5++;
                        j7 = j;
                        j8 = j7;
                    }
                    if (i4 == i2) {
                        break;
                    }
                    int i7 = component3 + 21;
                    equals = i7 % 128;
                    int i8 = i7 % 2;
                    jLongValue -= 1024;
                    i3++;
                    j7 = j;
                    c2 = '0';
                } else {
                    Object[] objArr3 = new Object[1];
                    a((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43891), Color.alpha(0), new char[]{53822, 23411, 36400, 29918, 25782, 13819, 17624, 63472, 32973, 38182, 26498, 51685, 63173, 64508, 61582, 53777}, new char[]{21157, 31312, 29865, 48811}, new char[]{0, 0, 0, 0}, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1885), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{61385, 43083, 37955, 21685, 62356, 1291, 52488, 61470, 22998, 6292, 65097, 62562, 4235, 17661, 1164, 6560}, new char[]{33126, 6616, 24221, 38407}, new char[]{0, 0, 0, 0}, objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {64050517};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1663 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, (char) Color.green(0), 1006506020, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1470931873, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                        if (objCopydefault4 == null) {
                            int touchSlop = 1454 - (ViewConfiguration.getTouchSlop() >> 8);
                            int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                            char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            Object[] objArr7 = new Object[1];
                            b(b2, b3, b3, objArr7);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, offsetBefore, c3, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - TextUtils.indexOf("", "", 0), 38 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8)), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                        int i9 = ((int[]) objArr8[2])[0];
                        int i10 = ((int[]) objArr8[1])[0];
                        if (i10 == i9) {
                            int i11 = equals + 11;
                            component3 = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[3];
                            if (strArr != null) {
                                int i13 = 0;
                                while (i13 < strArr.length) {
                                    int i14 = equals + 49;
                                    component3 = i14 % 128;
                                    int i15 = i14 % 2;
                                    arrayList.add(strArr[i13]);
                                    i13++;
                                    int i16 = component3 + 79;
                                    equals = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        int i17 = 4 % 5;
                                    }
                                }
                            }
                            long j9 = -1;
                            long j10 = 0;
                            long j11 = (((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32))) & ((long) (i10 ^ i9))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault5 == null) {
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                            Object[] objArr9 = {64050517, Long.valueOf(j11), arrayList, null, false, false};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf("", "", 0) + 56, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                            int[] iArr = new int[i10];
                            int i18 = i10 - 1;
                            iArr[i18] = 1;
                            Toast.makeText((Context) null, iArr[((i18 * i10) % 2) - 1], 1).show();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            function1.invoke(obj);
        }

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.equals
                int r1 = r1 + 71
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.component3 = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L15
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r3 = 1
                if (r1 == 0) goto L2f
                goto L1a
            L15:
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r3 = r2
                if (r1 == 0) goto L2f
            L1a:
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L2f
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            L2f:
                int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.component3
                int r5 = r5 + 71
                int r1 = r5 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.equals = r1
                int r5 = r5 % r0
                if (r5 != 0) goto L3d
                r5 = 22
                int r5 = r5 / r2
            L3d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.amountdetails.WesternUnionAmountDetailsFragment.component3.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3 + 89;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component1;
            int i5 = i3 + 69;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 25;
            equals = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component3 + 55;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }
    }

    public static Unit $r8$lambda$7Y6JkOyExIUy7ljeIo1ygMOAH4g(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, AmountViewModel.AmountError amountError) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(westernUnionAmountDetailsFragment, amountError);
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return unitShareDataUIState;
        }
        throw null;
    }

    public static CreationExtras $r8$lambda$EfjnRsBmLSZnAPNSUlgtZB90Sas(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CreationExtras creationExtrasComponent3 = component3(westernUnionAmountDetailsFragment);
        int i4 = ShareDataUIState + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return creationExtrasComponent3;
        }
        throw null;
    }

    public static Unit $r8$lambda$Z6O4h3BszpRtO6ekJhkaN7InUj8(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(westernUnionAmountDetailsFragment, bool);
        int i4 = ShareDataUIState + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ViewModel $r8$lambda$l2MqdjqWQ0nD_JoihOxDTJ0iLPA(WesternUnionAmountDetailsFragment westernUnionAmountDetailsFragment, ConsumerAmountViewModel.Factory factory) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState(westernUnionAmountDetailsFragment, factory);
        }
        ShareDataUIState(westernUnionAmountDetailsFragment, factory);
        throw null;
    }

    static {
        int i = 1 + 55;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 79 / 0;
        }
    }
}
