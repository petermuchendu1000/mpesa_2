package com.safaricom.consumer.commons.amountvalidation;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.safaricom.consumer.commons.R;
import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.amountvalidation.PaymentMethod;
import com.safaricom.consumer.commons.balances.BalanceRepository;
import com.safaricom.consumer.commons.bonga.BongaPointsInfoState;
import com.safaricom.consumer.commons.bonga.BongaPointsRepository;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.offline.OfflineModeDelegate;
import com.safaricom.consumer.commons.overdraw.OverdrawRepository;
import com.safaricom.consumer.commons.preference.UserPreferencesRepository;
import com.safaricom.consumer.commons.util.SensitiveDataVisibility;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.consumer.commons.util.VisibilityState;
import com.safaricom.consumer.commons.validator.GenericValidator;
import com.safaricom.consumer.commons.validator.Rule;
import com.safaricom.consumer.commons.withdraw.FastWithdrawDetails;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0004\\]^_BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020)H\u0002J\b\u0010K\u001a\u00020)H\u0002J\u0006\u0010L\u001a\u00020IJ\u0006\u0010M\u001a\u00020IJ\u001e\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u0002072\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u000207J\u0010\u0010S\u001a\u00020I2\b\u0010T\u001a\u0004\u0018\u00010UJ\b\u0010V\u001a\u00020IH\u0002J\u001e\u0010W\u001a\u00020I2\u0006\u0010O\u001a\u0002072\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u000207J\u000e\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020)J\u000e\u0010Z\u001a\u00020I2\u0006\u00108\u001a\u00020)J\u0006\u0010[\u001a\u00020IR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0016¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0016¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0018R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0018R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0018R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020)0:X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010;R<\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=8T@TX\u0094\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel;", "overdrawRepository", "Lcom/safaricom/consumer/commons/overdraw/OverdrawRepository;", "balanceRepository", "Lcom/safaricom/consumer/commons/balances/BalanceRepository;", "amountViewModelParams", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "configurationRepository", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "bongaPointsRepository", "Lcom/safaricom/consumer/commons/bonga/BongaPointsRepository;", "offlineModeDelegate", "Lcom/safaricom/consumer/commons/offline/OfflineModeDelegate;", "userPreferencesRepository", "Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;", "<init>", "(Lcom/safaricom/consumer/commons/overdraw/OverdrawRepository;Lcom/safaricom/consumer/commons/balances/BalanceRepository;Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;Lcom/safaricom/consumer/commons/bonga/BongaPointsRepository;Lcom/safaricom/consumer/commons/offline/OfflineModeDelegate;Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;)V", "_sensitiveDataVisibility", "Landroidx/lifecycle/MutableLiveData;", "Lcom/safaricom/consumer/commons/util/SensitiveDataVisibility;", "sensitiveDataVisibility", "Landroidx/lifecycle/LiveData;", "getSensitiveDataVisibility", "()Landroidx/lifecycle/LiveData;", "_paymentMethod", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/safaricom/consumer/commons/amountvalidation/PaymentMethod;", "paymentMethod", "Lkotlinx/coroutines/flow/StateFlow;", "getPaymentMethod", "()Lkotlinx/coroutines/flow/StateFlow;", "_firstTimeBongaPointsBalloonState", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$FirstTimeBongaPointsBalloonState;", "firstTimeBongaPointsBalloonState", "getFirstTimeBongaPointsBalloonState", "_bongaPointsAndBalance", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$BongaPointsAndBalance;", "bongaPointsAndBalance", "getBongaPointsAndBalance", "_updateOverdrawContainerVisibility", "", "updateOverdrawContainerVisibility", "getUpdateOverdrawContainerVisibility", "paymentSelectionVisibility", "getPaymentSelectionVisibility", "_selectPaymentAccountClickedState", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState;", "selectPaymentAccountClickedState", "getSelectPaymentAccountClickedState", "_labelBongaPointsBalanceVisibility", "Lcom/safaricom/consumer/commons/util/VisibilityState;", "labelBongaPointsBalanceVisibility", "getLabelBongaPointsBalanceVisibility", "currentBongaBalance", "", "isOffline", "isBalanceOutdated", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "value", "Lcom/safaricom/consumer/commons/validator/GenericValidator;", "", "Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;", ValidatorRequestKt.VALIDATOR_SP_NAME, "getValidator", "()Lcom/safaricom/consumer/commons/validator/GenericValidator;", "setValidator", "(Lcom/safaricom/consumer/commons/validator/GenericValidator;)V", "fastLoginValidator", "bongaPointsValidator", "bongaPointsFastLoginValidator", "onUnHideButtonAuthenticationSuccessful", "", "onFastLoginFlow", "onRapidActionFlow", "onRestoreErrorState", "onMPesaAccountClick", "onBongaPointsClick", "bongaBalance", PESActivity.EXTRA_BONGA_POINTS, "", "conversionRate", "onBongaPointsInfoArrived", "bongaPointsInfoState", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState;", "switchToMpesaAccount", "updateBongaPointsUi", "onUpdateOverdrawContainerVisibility", "isVisible", "onOfflineModeChange", "onCustomAccountSelectorClicked", "Factory", "FirstTimeBongaPointsBalloonState", "SelectAccountClickedState", "BongaPointsAndBalance", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConsumerAmountViewModel extends AmountViewModel {
    private final Flow<Boolean> ArtificialStackFrames;
    private final StateFlow<PaymentMethod> CoroutineDebuggingKt;
    private final MutableLiveData<BongaPointsAndBalance> ShareDataUIState;

    private final LiveData<SensitiveDataVisibility> f4201a;
    private final LiveData<VisibilityState> accessartificialFrame;

    private final LiveData<Boolean> f4202b;

    private final LiveData<SelectAccountClickedState> f4203c;
    private final MutableLiveData<SelectAccountClickedState> component1;
    private final MutableLiveData<VisibilityState> component2;
    private final MutableStateFlow<PaymentMethod> component3;
    private final GenericValidator<String, AmountValidator> component4;
    private final MutableLiveData<Boolean> copy;
    private final MutableLiveData<FirstTimeBongaPointsBalloonState> copydefault;
    private final LiveData<Boolean> coroutineBoundary;
    private final OfflineModeDelegate coroutineCreation;
    private final LiveData<BongaPointsAndBalance> equals;
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final GenericValidator<String, AmountValidator> getAsAtTimestamp;
    private final MutableLiveData<SensitiveDataVisibility> getRequestBeneficiariesState;
    private final LiveData<FirstTimeBongaPointsBalloonState> getShareableDataState;
    private final GenericValidator<String, AmountValidator> getSponsorBeneficiariesState;
    private final ConfigurationRepository hashCode;
    private double toString;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$Factory;", "", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel;", "params", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        ConsumerAmountViewModel create(AmountViewModel.AmountViewModelParams params);
    }

    private final boolean component2() {
        return false;
    }

    private final boolean copydefault() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public ConsumerAmountViewModel(OverdrawRepository overdrawRepository, BalanceRepository balanceRepository, @Assisted final AmountViewModel.AmountViewModelParams amountViewModelParams, ConfigurationRepository configurationRepository, BongaPointsRepository bongaPointsRepository, OfflineModeDelegate offlineModeDelegate, UserPreferencesRepository userPreferencesRepository) {
        super(overdrawRepository, balanceRepository, amountViewModelParams, configurationRepository, userPreferencesRepository);
        Intrinsics.checkNotNullParameter(overdrawRepository, "");
        Intrinsics.checkNotNullParameter(balanceRepository, "");
        Intrinsics.checkNotNullParameter(amountViewModelParams, "");
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        Intrinsics.checkNotNullParameter(bongaPointsRepository, "");
        Intrinsics.checkNotNullParameter(offlineModeDelegate, "");
        Intrinsics.checkNotNullParameter(userPreferencesRepository, "");
        this.hashCode = configurationRepository;
        this.coroutineCreation = offlineModeDelegate;
        MutableLiveData<SensitiveDataVisibility> mutableLiveData = new MutableLiveData<>();
        this.getRequestBeneficiariesState = mutableLiveData;
        MutableLiveData<SensitiveDataVisibility> mutableLiveData2 = mutableLiveData;
        this.f4201a = mutableLiveData2;
        MutableStateFlow<PaymentMethod> MutableStateFlow = StateFlowKt.MutableStateFlow(PaymentMethod.MPesaBalance.INSTANCE);
        this.component3 = MutableStateFlow;
        this.CoroutineDebuggingKt = MutableStateFlow;
        MutableLiveData<FirstTimeBongaPointsBalloonState> mutableLiveData3 = new MutableLiveData<>();
        this.copydefault = mutableLiveData3;
        this.getShareableDataState = mutableLiveData3;
        MutableLiveData<BongaPointsAndBalance> mutableLiveData4 = new MutableLiveData<>();
        this.ShareDataUIState = mutableLiveData4;
        this.equals = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.copy = mutableLiveData5;
        this.f4202b = mutableLiveData5;
        this.coroutineBoundary = new MutableLiveData(Boolean.valueOf(amountViewModelParams.getSupportsBongaPoints()));
        MutableLiveData<SelectAccountClickedState> mutableLiveData6 = new MutableLiveData<>();
        this.component1 = mutableLiveData6;
        this.f4203c = mutableLiveData6;
        MutableLiveData<VisibilityState> mutableLiveData7 = new MutableLiveData<>();
        this.component2 = mutableLiveData7;
        MutableStateFlow<PaymentMethod> mutableStateFlow = MutableStateFlow;
        this.accessartificialFrame = FlowLiveDataConversions.asLiveData$default(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(mutableLiveData7), mutableStateFlow, new component3(null)), (CoroutineContext) null, 0L, 3, (Object) null);
        this.ArtificialStackFrames = FlowKt.combine(super.isBalanceOutdated(), FlowLiveDataConversions.asFlow(mutableLiveData2), mutableStateFlow, new component2(null));
        GenericValidator<String, AmountValidator> genericValidator = new GenericValidator<>();
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.component2((String) obj));
            }
        }, AmountValidator.NO_INPUT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.component3(amountViewModelParams, this, (String) obj));
            }
        }, AmountValidator.ABOVE_MAX_AMOUNT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.component1(amountViewModelParams, this, (String) obj));
            }
        }, AmountValidator.BELOW_MIN_AMOUNT, null, null, 12, null);
        List<Rule<String, AmountValidator>> validatorCustomRules = amountViewModelParams.getValidatorCustomRules();
        if (validatorCustomRules != null) {
            genericValidator.joinRules(validatorCustomRules);
        }
        this.getSponsorBeneficiariesState = genericValidator;
        GenericValidator<String, AmountValidator> genericValidator2 = new GenericValidator<>();
        GenericValidator.addSimpleRule$default(genericValidator2, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.ShareDataUIState((String) obj));
            }
        }, AmountValidator.NO_INPUT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator2, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.ShareDataUIState(this.f$0, (String) obj));
            }
        }, AmountValidator.ABOVE_BONGA_POINTS, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator2, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.component1(this.f$0, (String) obj));
            }
        }, AmountValidator.ABOVE_MAX_AMOUNT, null, null, 12, null);
        List<Rule<String, AmountValidator>> validatorCustomRules2 = amountViewModelParams.getValidatorCustomRules();
        if (validatorCustomRules2 != null) {
            genericValidator2.joinRules(validatorCustomRules2);
        }
        this.component4 = genericValidator2;
        GenericValidator<String, AmountValidator> genericValidator3 = new GenericValidator<>();
        GenericValidator.addSimpleRule$default(genericValidator3, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.component3((String) obj));
            }
        }, AmountValidator.NO_INPUT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator3, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ConsumerAmountViewModel.component3(this.f$0, (String) obj));
            }
        }, AmountValidator.ABOVE_MAX_AMOUNT, null, null, 12, null);
        List<Rule<String, AmountValidator>> validatorCustomRules3 = amountViewModelParams.getValidatorCustomRules();
        if (validatorCustomRules3 != null) {
            genericValidator3.joinRules(validatorCustomRules3);
        }
        this.getAsAtTimestamp = genericValidator3;
        ConsumerAmountViewModel consumerAmountViewModel = this;
        offlineModeDelegate.setScope(ViewModelKt.getViewModelScope(consumerAmountViewModel));
        mutableLiveData.setValue((component2() || copydefault()) ? SensitiveDataVisibility.HIDDEN : SensitiveDataVisibility.VISIBLE);
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(consumerAmountViewModel), Dispatchers.getIO(), null, new AnonymousClass3(amountViewModelParams, bongaPointsRepository, this, null), 2, null);
    }

    public final LiveData<SensitiveDataVisibility> getSensitiveDataVisibility() {
        return this.f4201a;
    }

    public final StateFlow<PaymentMethod> getPaymentMethod() {
        return this.CoroutineDebuggingKt;
    }

    public final LiveData<FirstTimeBongaPointsBalloonState> getFirstTimeBongaPointsBalloonState() {
        return this.getShareableDataState;
    }

    public final LiveData<BongaPointsAndBalance> getBongaPointsAndBalance() {
        return this.equals;
    }

    public final LiveData<Boolean> getUpdateOverdrawContainerVisibility() {
        return this.f4202b;
    }

    public final LiveData<Boolean> getPaymentSelectionVisibility() {
        return this.coroutineBoundary;
    }

    public final LiveData<SelectAccountClickedState> getSelectPaymentAccountClickedState() {
        return this.f4203c;
    }

    public final LiveData<VisibilityState> getLabelBongaPointsBalanceVisibility() {
        return this.accessartificialFrame;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012,\u0010\u0003\u001a( \u0002*\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00060\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", "Lcom/safaricom/consumer/commons/util/VisibilityState;", "kotlin.jvm.PlatformType", "visibilityState", "Lkotlin/ParameterName;", "name", "a", "paymentMethod", "Lcom/safaricom/consumer/commons/amountvalidation/PaymentMethod;", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel$labelBongaPointsBalanceVisibility$1", f = "ConsumerAmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function3<VisibilityState, PaymentMethod, Continuation<? super VisibilityState>, Object> {
        int ShareDataUIState;
        Object component2;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Intrinsics.areEqual((PaymentMethod) this.copydefault, PaymentMethod.MPesaBalance.INSTANCE) ? VisibilityState.HIDDEN : (VisibilityState) this.component2;
        }

        component3(Continuation<? super component3> continuation) {
            super(3, continuation);
        }

        @Override
        public final Object invoke(VisibilityState visibilityState, PaymentMethod paymentMethod, Continuation<? super VisibilityState> continuation) {
            component3 component3Var = new component3(continuation);
            component3Var.component2 = visibilityState;
            component3Var.copydefault = paymentMethod;
            return component3Var.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override
    public Flow<Boolean> isBalanceOutdated() {
        return this.ArtificialStackFrames;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "balanceOutdated", "sensitiveDataVisibility", "Lcom/safaricom/consumer/commons/util/SensitiveDataVisibility;", "kotlin.jvm.PlatformType", "paymentMethod", "Lcom/safaricom/consumer/commons/amountvalidation/PaymentMethod;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel$isBalanceOutdated$1", f = "ConsumerAmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function4<Boolean, SensitiveDataVisibility, PaymentMethod, Continuation<? super Boolean>, Object> {
        boolean ShareDataUIState;
        int component1;
        Object component2;
        Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.ShareDataUIState;
            SensitiveDataVisibility sensitiveDataVisibility = (SensitiveDataVisibility) this.component2;
            PaymentMethod paymentMethod = (PaymentMethod) this.component3;
            if (sensitiveDataVisibility == SensitiveDataVisibility.HIDDEN || (paymentMethod instanceof PaymentMethod.BongaPoints)) {
                z = false;
            }
            return Boxing.boxBoolean(z);
        }

        component2(Continuation<? super component2> continuation) {
            super(4, continuation);
        }

        @Override
        public Object invoke(Boolean bool, SensitiveDataVisibility sensitiveDataVisibility, PaymentMethod paymentMethod, Continuation<? super Boolean> continuation) {
            return component2(bool.booleanValue(), sensitiveDataVisibility, paymentMethod, continuation);
        }

        public final Object component2(boolean z, SensitiveDataVisibility sensitiveDataVisibility, PaymentMethod paymentMethod, Continuation<? super Boolean> continuation) {
            component2 component2Var = new component2(continuation);
            component2Var.ShareDataUIState = z;
            component2Var.component2 = sensitiveDataVisibility;
            component2Var.component3 = paymentMethod;
            return component2Var.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override
    protected GenericValidator<String, AmountValidator> getValidator() {
        return (getEquals().getSupportsBongaPoints() && (this.component3.getValue() instanceof PaymentMethod.BongaPoints)) ? component2() ? this.getAsAtTimestamp : this.component4 : ((this.component3.getValue() instanceof PaymentMethod.MPesaBalance) && (component2() || copydefault())) ? this.getSponsorBeneficiariesState : super.getValidator();
    }

    public static final boolean component2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0;
    }

    public static final boolean component3(AmountViewModel.AmountViewModelParams amountViewModelParams, ConsumerAmountViewModel consumerAmountViewModel, String str) {
        FastWithdrawDetails fastWithdrawDetails;
        Intrinsics.checkNotNullParameter(amountViewModelParams, "");
        Intrinsics.checkNotNullParameter(consumerAmountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return true;
        }
        double dDoubleValue = amountViewModelParams.getCalculateAmount().invoke().doubleValue();
        if (consumerAmountViewModel.isFastWithdrawEnabled() && (fastWithdrawDetails = consumerAmountViewModel.getGetARTIFICIAL_FRAME_PACKAGE_NAME()) != null && fastWithdrawDetails.getSelected()) {
            FastWithdrawDetails fastWithdrawDetails2 = consumerAmountViewModel.getGetARTIFICIAL_FRAME_PACKAGE_NAME();
            double maxAmount = fastWithdrawDetails2 != null ? fastWithdrawDetails2.getMaxAmount() : 0.0d;
            if (maxAmount > 0.0d && dDoubleValue > maxAmount) {
                return true;
            }
        } else if (consumerAmountViewModel.getInvoke() > 0.0d && dDoubleValue > consumerAmountViewModel.getInvoke()) {
            return true;
        }
        return false;
    }

    public static final boolean component1(AmountViewModel.AmountViewModelParams amountViewModelParams, ConsumerAmountViewModel consumerAmountViewModel, String str) {
        FastWithdrawDetails fastWithdrawDetails;
        Intrinsics.checkNotNullParameter(amountViewModelParams, "");
        Intrinsics.checkNotNullParameter(consumerAmountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return true;
        }
        double dDoubleValue = amountViewModelParams.getCalculateAmount().invoke().doubleValue();
        if (consumerAmountViewModel.isFastWithdrawEnabled() && (fastWithdrawDetails = consumerAmountViewModel.getGetARTIFICIAL_FRAME_PACKAGE_NAME()) != null && fastWithdrawDetails.getSelected()) {
            FastWithdrawDetails fastWithdrawDetails2 = consumerAmountViewModel.getGetARTIFICIAL_FRAME_PACKAGE_NAME();
            if (dDoubleValue < (fastWithdrawDetails2 != null ? fastWithdrawDetails2.getMinAmount() : 0.0d)) {
                return true;
            }
        } else if (dDoubleValue < consumerAmountViewModel.getF4199c()) {
            return true;
        }
        return false;
    }

    public static final boolean ShareDataUIState(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0;
    }

    public static final boolean ShareDataUIState(ConsumerAmountViewModel consumerAmountViewModel, String str) {
        Intrinsics.checkNotNullParameter(consumerAmountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return true;
        }
        return consumerAmountViewModel.toString >= 0.0d && Double.parseDouble(str) > consumerAmountViewModel.toString && Double.parseDouble(str) <= consumerAmountViewModel.getInvoke();
    }

    public static final boolean component1(ConsumerAmountViewModel consumerAmountViewModel, String str) {
        Intrinsics.checkNotNullParameter(consumerAmountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0 || Double.parseDouble(str) > consumerAmountViewModel.getInvoke();
    }

    public static final boolean component3(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0;
    }

    public static final boolean component3(ConsumerAmountViewModel consumerAmountViewModel, String str) {
        Intrinsics.checkNotNullParameter(consumerAmountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0 || Double.parseDouble(str) > consumerAmountViewModel.getInvoke();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel$1", f = "ConsumerAmountViewModel.kt", i = {}, l = {191, BERTags.PRIVATE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BongaPointsRepository ShareDataUIState;
        final ConsumerAmountViewModel component1;
        final AmountViewModel.AmountViewModelParams component2;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.component3;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.component2.getSupportsBongaPoints()) {
                    this.component3 = 1;
                    obj = this.ShareDataUIState.isFirstTimeOnBongaPointsSupportedScreen(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState.setBongaPointsSupportedScreenShown();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                this.component3 = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass5(this.component1, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.ShareDataUIState.setBongaPointsSupportedScreenShown();
            }
            return Unit.INSTANCE;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel$1$1", f = "ConsumerAmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int component1;
            final ConsumerAmountViewModel component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component1 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.component3.copydefault.setValue(FirstTimeBongaPointsBalloonState.VISIBLE);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(ConsumerAmountViewModel consumerAmountViewModel, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component3 = consumerAmountViewModel;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.component3, continuation);
            }

            @Override
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AmountViewModel.AmountViewModelParams amountViewModelParams, BongaPointsRepository bongaPointsRepository, ConsumerAmountViewModel consumerAmountViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.component2 = amountViewModelParams;
            this.ShareDataUIState = bongaPointsRepository;
            this.component1 = consumerAmountViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.component2, this.ShareDataUIState, this.component1, continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onUnHideButtonAuthenticationSuccessful() {
        this.getRequestBeneficiariesState.setValue(SensitiveDataVisibility.VISIBLE);
        AmountViewModel.validateInput$default(this, null, 1, null);
    }

    public final void onRestoreErrorState() {
        MutableLiveData<SensitiveDataVisibility> mutableLiveData = this.getRequestBeneficiariesState;
        mutableLiveData.setValue(mutableLiveData.getValue());
        if (getEquals().getSupportsBongaPoints()) {
            this.component2.setValue(VisibilityState.VISIBLE);
        }
    }

    public final void onMPesaAccountClick() {
        ShareDataUIState();
    }

    public final void onBongaPointsClick(double bongaBalance, long bongaPoints, double conversionRate) {
        updateBongaPointsUi(bongaBalance, bongaPoints, conversionRate);
    }

    public final void onBongaPointsInfoArrived(BongaPointsInfoState bongaPointsInfoState) {
        if (this.CoroutineDebuggingKt.getValue() instanceof PaymentMethod.BongaPoints) {
            if (bongaPointsInfoState == null || Intrinsics.areEqual(bongaPointsInfoState, BongaPointsInfoState.Error.INSTANCE) || Intrinsics.areEqual(bongaPointsInfoState, BongaPointsInfoState.NotOptedIn.INSTANCE)) {
                ShareDataUIState();
            } else if (bongaPointsInfoState instanceof BongaPointsInfoState.OptedIn) {
                BongaPointsInfoState.OptedIn optedIn = (BongaPointsInfoState.OptedIn) bongaPointsInfoState;
                updateBongaPointsUi(optedIn.getBongaBalance(), optedIn.getBongaPoints(), optedIn.getConversionRate());
            }
        }
    }

    private final void ShareDataUIState() {
        this.component3.setValue(PaymentMethod.MPesaBalance.INSTANCE);
        AmountViewModel.validateInput$default(this, null, 1, null);
    }

    public final void updateBongaPointsUi(double bongaBalance, long bongaPoints, double conversionRate) {
        this.toString = bongaBalance;
        this.ShareDataUIState.setValue(new BongaPointsAndBalance(bongaPoints, bongaBalance, this.hashCode.getDisplayCurrency()));
        this.component3.setValue(new PaymentMethod.BongaPoints(bongaBalance, bongaPoints, conversionRate));
        AmountViewModel.validateInput$default(this, null, 1, null);
    }

    public final void onUpdateOverdrawContainerVisibility(boolean isVisible) {
        this.copy.setValue(Boolean.valueOf(isVisible && !(getEquals().getSupportsBongaPoints() && (this.component3.getValue() instanceof PaymentMethod.BongaPoints))));
    }

    public final void onOfflineModeChange(boolean isOffline) {
        if ((this.component3.getValue() instanceof PaymentMethod.BongaPoints) && isOffline) {
            ShareDataUIState();
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = isOffline;
        if ((this.component3.getValue() instanceof PaymentMethod.BongaPoints) && isOffline) {
            ShareDataUIState();
        }
    }

    public final void onCustomAccountSelectorClicked() {
        SelectAccountClickedState.ShowBottomSheet showBottomSheet;
        MutableLiveData<SelectAccountClickedState> mutableLiveData = this.component1;
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            showBottomSheet = new SelectAccountClickedState.ShowOfflineModeToast(TextResource.Companion.invoke$default(TextResource.INSTANCE, R.string.offlineMode_toast_unavailableFeature, false, 2, (Object) null), TextResource.Companion.invoke$default(TextResource.INSTANCE, R.string.offlineMode_toast_actionText, false, 2, (Object) null));
        } else {
            showBottomSheet = new SelectAccountClickedState.ShowBottomSheet(this.component3.getValue());
        }
        mutableLiveData.setValue(showBottomSheet);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$FirstTimeBongaPointsBalloonState;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FirstTimeBongaPointsBalloonState {
        private static final EnumEntries $ENTRIES;
        private static final FirstTimeBongaPointsBalloonState[] $VALUES;
        public static final FirstTimeBongaPointsBalloonState VISIBLE = new FirstTimeBongaPointsBalloonState("VISIBLE", 0);

        private FirstTimeBongaPointsBalloonState(String str, int i) {
        }

        static {
            FirstTimeBongaPointsBalloonState[] firstTimeBongaPointsBalloonStateArr$values = $values();
            $VALUES = firstTimeBongaPointsBalloonStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(firstTimeBongaPointsBalloonStateArr$values);
        }

        public static FirstTimeBongaPointsBalloonState valueOf(String str) {
            return (FirstTimeBongaPointsBalloonState) Enum.valueOf(FirstTimeBongaPointsBalloonState.class, str);
        }

        public static FirstTimeBongaPointsBalloonState[] values() {
            return (FirstTimeBongaPointsBalloonState[]) $VALUES.clone();
        }

        private static final FirstTimeBongaPointsBalloonState[] $values() {
            return new FirstTimeBongaPointsBalloonState[]{VISIBLE};
        }

        public static EnumEntries<FirstTimeBongaPointsBalloonState> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState;", "", "<init>", "()V", "ShowOfflineModeToast", "ShowBottomSheet", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState$ShowBottomSheet;", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState$ShowOfflineModeToast;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SelectAccountClickedState {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState$ShowOfflineModeToast;", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState;", "message", "Lcom/safaricom/consumer/commons/util/TextResource;", "text", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getMessage", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowOfflineModeToast extends SelectAccountClickedState {
            private final TextResource ShareDataUIState;
            private final TextResource component1;

            public final TextResource getMessage() {
                return this.ShareDataUIState;
            }

            public final TextResource getText() {
                return this.component1;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowOfflineModeToast(TextResource textResource, TextResource textResource2) {
                super(null);
                Intrinsics.checkNotNullParameter(textResource, "");
                Intrinsics.checkNotNullParameter(textResource2, "");
                this.ShareDataUIState = textResource;
                this.component1 = textResource2;
            }

            public static ShowOfflineModeToast copy$default(ShowOfflineModeToast showOfflineModeToast, TextResource textResource, TextResource textResource2, int i, Object obj) {
                if ((i & 1) != 0) {
                    textResource = showOfflineModeToast.ShareDataUIState;
                }
                if ((i & 2) != 0) {
                    textResource2 = showOfflineModeToast.component1;
                }
                return showOfflineModeToast.copy(textResource, textResource2);
            }

            public final TextResource getShareDataUIState() {
                return this.ShareDataUIState;
            }

            public final TextResource getComponent1() {
                return this.component1;
            }

            public final ShowOfflineModeToast copy(TextResource message, TextResource text) {
                Intrinsics.checkNotNullParameter(message, "");
                Intrinsics.checkNotNullParameter(text, "");
                return new ShowOfflineModeToast(message, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowOfflineModeToast)) {
                    return false;
                }
                ShowOfflineModeToast showOfflineModeToast = (ShowOfflineModeToast) other;
                return Intrinsics.areEqual(this.ShareDataUIState, showOfflineModeToast.ShareDataUIState) && Intrinsics.areEqual(this.component1, showOfflineModeToast.component1);
            }

            public int hashCode() {
                return (this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode();
            }

            public String toString() {
                return "ShowOfflineModeToast(message=" + this.ShareDataUIState + ", text=" + this.component1 + ')';
            }
        }

        private SelectAccountClickedState() {
        }

        public SelectAccountClickedState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState$ShowBottomSheet;", "Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$SelectAccountClickedState;", "currentPaymentMethod", "Lcom/safaricom/consumer/commons/amountvalidation/PaymentMethod;", "<init>", "(Lcom/safaricom/consumer/commons/amountvalidation/PaymentMethod;)V", "getCurrentPaymentMethod", "()Lcom/safaricom/consumer/commons/amountvalidation/PaymentMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowBottomSheet extends SelectAccountClickedState {
            private final PaymentMethod component3;

            public final PaymentMethod getCurrentPaymentMethod() {
                return this.component3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowBottomSheet(PaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethod, "");
                this.component3 = paymentMethod;
            }

            public static ShowBottomSheet copy$default(ShowBottomSheet showBottomSheet, PaymentMethod paymentMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod = showBottomSheet.component3;
                }
                return showBottomSheet.copy(paymentMethod);
            }

            public final PaymentMethod getComponent3() {
                return this.component3;
            }

            public final ShowBottomSheet copy(PaymentMethod currentPaymentMethod) {
                Intrinsics.checkNotNullParameter(currentPaymentMethod, "");
                return new ShowBottomSheet(currentPaymentMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowBottomSheet) && Intrinsics.areEqual(this.component3, ((ShowBottomSheet) other).component3);
            }

            public int hashCode() {
                return this.component3.hashCode();
            }

            public String toString() {
                return "ShowBottomSheet(currentPaymentMethod=" + this.component3 + ')';
            }
        }
    }

    @Override
    protected void setValidator(GenericValidator<String, AmountValidator> genericValidator) {
        Intrinsics.checkNotNullParameter(genericValidator, "");
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/ConsumerAmountViewModel$BongaPointsAndBalance;", "", PESActivity.EXTRA_BONGA_POINTS, "", "bongaBalance", "", "displayCurrency", "", "<init>", "(JDLjava/lang/String;)V", "getBongaPoints", "()J", "getBongaBalance", "()D", "getDisplayCurrency", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaPointsAndBalance {
        private final long ShareDataUIState;
        private final double component1;
        private final String component3;

        public BongaPointsAndBalance(long j, double d2, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = j;
            this.component1 = d2;
            this.component3 = str;
        }

        public final long getBongaPoints() {
            return this.ShareDataUIState;
        }

        public final double getBongaBalance() {
            return this.component1;
        }

        public final String getDisplayCurrency() {
            return this.component3;
        }

        public static BongaPointsAndBalance copy$default(BongaPointsAndBalance bongaPointsAndBalance, long j, double d2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bongaPointsAndBalance.ShareDataUIState;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                d2 = bongaPointsAndBalance.component1;
            }
            double d3 = d2;
            if ((i & 4) != 0) {
                str = bongaPointsAndBalance.component3;
            }
            return bongaPointsAndBalance.copy(j2, d3, str);
        }

        public final long getShareDataUIState() {
            return this.ShareDataUIState;
        }

        public final double getComponent1() {
            return this.component1;
        }

        public final String getComponent3() {
            return this.component3;
        }

        public final BongaPointsAndBalance copy(long bongaPoints, double bongaBalance, String displayCurrency) {
            Intrinsics.checkNotNullParameter(displayCurrency, "");
            return new BongaPointsAndBalance(bongaPoints, bongaBalance, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BongaPointsAndBalance)) {
                return false;
            }
            BongaPointsAndBalance bongaPointsAndBalance = (BongaPointsAndBalance) other;
            return this.ShareDataUIState == bongaPointsAndBalance.ShareDataUIState && Double.compare(this.component1, bongaPointsAndBalance.component1) == 0 && Intrinsics.areEqual(this.component3, bongaPointsAndBalance.component3);
        }

        public int hashCode() {
            return (((Long.hashCode(this.ShareDataUIState) * 31) + Double.hashCode(this.component1)) * 31) + this.component3.hashCode();
        }

        public String toString() {
            return "BongaPointsAndBalance(bongaPoints=" + this.ShareDataUIState + ", bongaBalance=" + this.component1 + ", displayCurrency=" + this.component3 + ')';
        }
    }
}
