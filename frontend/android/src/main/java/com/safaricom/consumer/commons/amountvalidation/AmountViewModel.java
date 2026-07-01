package com.safaricom.consumer.commons.amountvalidation;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.safaricom.consumer.commons.balances.AmountBalancesOrientation;
import com.safaricom.consumer.commons.balances.BalanceRepository;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.fee.FeeTable;
import com.safaricom.consumer.commons.overdraw.OverdrawInformation;
import com.safaricom.consumer.commons.overdraw.OverdrawInformationKt;
import com.safaricom.consumer.commons.overdraw.OverdrawRepository;
import com.safaricom.consumer.commons.preference.UserPreferencesRepository;
import com.safaricom.consumer.commons.resource.Resource;
import com.safaricom.consumer.commons.util.CurrencyLabelPosition;
import com.safaricom.consumer.commons.util.InputState;
import com.safaricom.consumer.commons.util.TooltipType;
import com.safaricom.consumer.commons.validator.GenericValidator;
import com.safaricom.consumer.commons.validator.PenaltyData;
import com.safaricom.consumer.commons.validator.Rule;
import com.safaricom.consumer.commons.validator.RuleError;
import com.safaricom.consumer.commons.withdraw.FastWithdrawDetails;
import com.safaricom.consumer.commons.withdraw.WithdrawFeesMethod;
import com.safaricom.consumer.commons.withdraw.WithdrawType;
import com.safaricom.mpesa.logging.L;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003ijkB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010Y\u001a\u00020Z2\b\b\u0002\u0010[\u001a\u00020\u0014J\u000e\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020\u0011J\u0015\u0010\u001f\u001a\u00020Z2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007¢\u0006\u0002\b^J\u0015\u0010#\u001a\u00020Z2\u0006\u0010!\u001a\u00020\u0011H\u0007¢\u0006\u0002\b_J\u000e\u0010`\u001a\u00020Z2\u0006\u0010a\u001a\u00020\u001bJ\u000e\u0010b\u001a\u00020Z2\u0006\u0010c\u001a\u00020\u001bJ\u0006\u0010d\u001a\u00020\u001bJ\u0006\u0010e\u001a\u00020fJ\u0006\u0010g\u001a\u00020ZJ\u0006\u0010h\u001a\u00020ZR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0012\u0010$\u001a\u0006\u0012\u0002\b\u00030%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020\u001b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u000e\u00100\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020605X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0>¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020C0>¢\u0006\b\n\u0000\u001a\u0004\bE\u0010@R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00110<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110>¢\u0006\b\n\u0000\u001a\u0004\bH\u0010@R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001b0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0>¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110>¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0>¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010@R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020S0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020S0>¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0WX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010X¨\u0006l"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel;", "Landroidx/lifecycle/ViewModel;", "overdrawRepository", "Lcom/safaricom/consumer/commons/overdraw/OverdrawRepository;", "balanceRepository", "Lcom/safaricom/consumer/commons/balances/BalanceRepository;", "amountViewModelParams", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "configurationRepository", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "userPreferencesRepository", "Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;", "<init>", "(Lcom/safaricom/consumer/commons/overdraw/OverdrawRepository;Lcom/safaricom/consumer/commons/balances/BalanceRepository;Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;)V", "getAmountViewModelParams", "()Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "currentBalance", "", "Ljava/lang/Double;", "currentAmount", "", "getCurrentAmount", "()Ljava/lang/String;", "setCurrentAmount", "(Ljava/lang/String;)V", "withdrawalFee", "avoidAmountValidation", "", "maxAmount", "getMaxAmount", "()D", "setMaxAmount", "(D)V", "minAmount", "getMinAmount", "setMinAmount", "withdrawFeesMethod", "Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod;", "fastWithdrawDetails", "Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;", "getFastWithdrawDetails", "()Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;", "setFastWithdrawDetails", "(Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;)V", "isFastWithdrawEnabled", "()Z", "isFastWithdrawEnabled$delegate", "Lkotlin/Lazy;", "supportsOutdatedBalance", "isBalanceCheckEnabled", "currentOverdrawInformation", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lcom/safaricom/consumer/commons/validator/GenericValidator;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;", "getValidator", "()Lcom/safaricom/consumer/commons/validator/GenericValidator;", "setValidator", "(Lcom/safaricom/consumer/commons/validator/GenericValidator;)V", "_validInput", "Landroidx/lifecycle/MutableLiveData;", "validInput", "Landroidx/lifecycle/LiveData;", "getValidInput", "()Landroidx/lifecycle/LiveData;", "_errorState", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "errorState", "getErrorState", "_withdrawalFeeValue", "withdrawalFeeValue", "getWithdrawalFeeValue", "_withdrawalFeeChecked", "withdrawalFeeChecked", "getWithdrawalFeeChecked", "_fastWithdrawalFeeValue", "fastWithdrawalFeeValue", "getFastWithdrawalFeeValue", "_showMultipleWalletTooltip", "showMultipleWalletTooltip", "getShowMultipleWalletTooltip", "_balanceOrientation", "Lcom/safaricom/consumer/commons/balances/AmountBalancesOrientation;", "balanceOrientation", "getBalanceOrientation", "isBalanceOutdated", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "validateInput", "", "currentInput", "setCurrentBalance", "balance", "maxAmountSetter", "minAmountSetter", "setAvoidAmountValidation", "enabled", "addWithdrawalFees", "add", "isOverdrawDisabled", "getCurrencyLabelPosition", "Lcom/safaricom/consumer/commons/util/CurrencyLabelPosition;", "setMultipleWalletTooltipShown", "onShowMultipleWalletTooltip", "AmountError", "AmountErrorType", "AmountViewModelParams", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AmountViewModel extends ViewModel {
    private String ArtificialStackFrames;
    private final boolean CoroutineDebuggingKt;
    private final MutableLiveData<Double> ShareDataUIState;

    private final OverdrawRepository f4197a;
    private final Flow<Boolean> accessartificialFrame;

    private final LiveData<Boolean> f4198b;

    private double f4199c;
    private final MutableLiveData<AmountBalancesOrientation> component1;
    private final MediatorLiveData<AmountError> component2;
    private final MutableLiveData<Boolean> component3;
    private final MutableLiveData<Double> component4;
    private final MutableLiveData<Boolean> copy;
    private final MutableLiveData<Boolean> copydefault;
    private final LiveData<Double> coroutineBoundary;
    private final Lazy coroutineCreation;

    private final boolean f4200d;
    private final UserPreferencesRepository e;
    private final AmountViewModelParams equals;
    private final LiveData<Boolean> f;
    private final WithdrawFeesMethod<?> g;
    private FastWithdrawDetails getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final LiveData<AmountBalancesOrientation> getAsAtTimestamp;
    private boolean getRequestBeneficiariesState;
    private final LiveData<AmountError> getShareableDataState;
    private final ConfigurationRepository getSponsorBeneficiariesState;
    private double h;
    private final LiveData<Boolean> hExternalSyntheticLambda0;
    private Double hashCode;
    private double invoke;
    private GenericValidator<String, AmountValidator> invokeSuspend;
    private final LiveData<Double> k;
    private OverdrawInformation toString;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputState.values().length];
            try {
                iArr[InputState.DISABLE_SUBMISSION_NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputState.DISABLE_SUBMISSION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputState.WARNING_NO_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected final AmountViewModelParams getEquals() {
        return this.equals;
    }

    public AmountViewModel(OverdrawRepository overdrawRepository, BalanceRepository balanceRepository, AmountViewModelParams amountViewModelParams, ConfigurationRepository configurationRepository, UserPreferencesRepository userPreferencesRepository) {
        Intrinsics.checkNotNullParameter(overdrawRepository, "");
        Intrinsics.checkNotNullParameter(balanceRepository, "");
        Intrinsics.checkNotNullParameter(amountViewModelParams, "");
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        Intrinsics.checkNotNullParameter(userPreferencesRepository, "");
        this.f4197a = overdrawRepository;
        this.equals = amountViewModelParams;
        this.getSponsorBeneficiariesState = configurationRepository;
        this.e = userPreferencesRepository;
        this.ArtificialStackFrames = "";
        this.invoke = amountViewModelParams.getMaxAmount();
        this.f4199c = amountViewModelParams.getMinAmount();
        this.g = amountViewModelParams.getWithdrawFeesMethod();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = amountViewModelParams.getFastWithdrawDetails();
        this.coroutineCreation = LazyKt.lazy(new Function0() {
            @Override
            public final Object invoke() {
                return Boolean.valueOf(AmountViewModel.component3(this.f$0));
            }
        });
        this.f4200d = amountViewModelParams.getSupportsOutdatedBalance();
        this.CoroutineDebuggingKt = amountViewModelParams.isBalanceCheckEnabled();
        GenericValidator<String, AmountValidator> genericValidator = new GenericValidator<>();
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.copydefault((String) obj));
            }
        }, AmountValidator.NO_INPUT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.component2(this.f$0, (String) obj));
            }
        }, AmountValidator.ABOVE_MAX_AMOUNT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.ShareDataUIState(this.f$0, (String) obj));
            }
        }, AmountValidator.BELOW_MIN_AMOUNT, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.component3(this.f$0, (String) obj));
            }
        }, AmountValidator.WARNING, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.copydefault(this.f$0, (String) obj));
            }
        }, AmountValidator.ABOVE_CURRENT_OVERDRAW_BALANCE, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.component1(this.f$0, (String) obj));
            }
        }, AmountValidator.USE_OVERDRAW_BALANCE, null, null, 12, null);
        GenericValidator.addSimpleRule$default(genericValidator, new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AmountViewModel.equals(this.f$0, (String) obj));
            }
        }, AmountValidator.ABOVE_CURRENT_BALANCE, null, null, 12, null);
        List<Rule<String, AmountValidator>> validatorCustomRules = amountViewModelParams.getValidatorCustomRules();
        if (validatorCustomRules != null) {
            genericValidator.joinRules(validatorCustomRules);
        }
        this.invokeSuspend = genericValidator;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.component3 = mutableLiveData;
        this.f = mutableLiveData;
        MediatorLiveData<AmountError> mediatorLiveData = new MediatorLiveData<>();
        this.component2 = mediatorLiveData;
        MediatorLiveData<AmountError> mediatorLiveData2 = mediatorLiveData;
        this.getShareableDataState = mediatorLiveData2;
        MutableLiveData<Double> mutableLiveData2 = new MutableLiveData<>();
        this.component4 = mutableLiveData2;
        this.k = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.copy = mutableLiveData3;
        this.hExternalSyntheticLambda0 = mutableLiveData3;
        MutableLiveData<Double> mutableLiveData4 = new MutableLiveData<>();
        this.ShareDataUIState = mutableLiveData4;
        this.coroutineBoundary = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.copydefault = mutableLiveData5;
        this.f4198b = mutableLiveData5;
        MutableLiveData<AmountBalancesOrientation> mutableLiveData6 = new MutableLiveData<>();
        this.component1 = mutableLiveData6;
        this.getAsAtTimestamp = mutableLiveData6;
        this.accessartificialFrame = FlowKt.combine(FlowLiveDataConversions.asFlow(balanceRepository.isBalanceUpdated()), overdrawRepository.isOverdrawUpdated(), new component1(null));
        AmountViewModel amountViewModel = this;
        FlowKt.launchIn(FlowKt.onEach(overdrawRepository.getOverdrawData(), new AnonymousClass4(null)), ViewModelKt.getViewModelScope(amountViewModel));
        if (amountViewModelParams.getOverdrawFeatureEnabled()) {
            FlowKt.combine(FlowLiveDataConversions.asFlow(mediatorLiveData2), overdrawRepository.getOverdrawData(), new AnonymousClass2(null));
        }
        if (amountViewModelParams.getSupportsMultipleWallet()) {
            onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(amountViewModel), null, null, new AnonymousClass3(null), 3, null);
        }
        mutableLiveData6.setValue(configurationRepository.getBalanceLabelsOrientation());
    }

    protected final String getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }

    protected final void setCurrentAmount(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ArtificialStackFrames = str;
    }

    protected final double getInvoke() {
        return this.invoke;
    }

    protected final void setMaxAmount(double d2) {
        this.invoke = d2;
    }

    protected final double getF4199c() {
        return this.f4199c;
    }

    protected final void setMinAmount(double d2) {
        this.f4199c = d2;
    }

    protected final FastWithdrawDetails getGetARTIFICIAL_FRAME_PACKAGE_NAME() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    protected final void setFastWithdrawDetails(FastWithdrawDetails fastWithdrawDetails) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = fastWithdrawDetails;
    }

    public static final boolean component3(AmountViewModel amountViewModel) {
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        return amountViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME != null;
    }

    protected final boolean isFastWithdrawEnabled() {
        return ((Boolean) this.coroutineCreation.getValue()).booleanValue();
    }

    protected GenericValidator<String, AmountValidator> getValidator() {
        return this.invokeSuspend;
    }

    protected void setValidator(GenericValidator<String, AmountValidator> genericValidator) {
        Intrinsics.checkNotNullParameter(genericValidator, "");
        this.invokeSuspend = genericValidator;
    }

    public static final boolean copydefault(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0;
    }

    public static final boolean component2(AmountViewModel amountViewModel, String str) {
        FastWithdrawDetails fastWithdrawDetails;
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return true;
        }
        double dDoubleValue = amountViewModel.equals.getCalculateAmount().invoke().doubleValue();
        if (amountViewModel.isFastWithdrawEnabled() && (fastWithdrawDetails = amountViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME) != null && fastWithdrawDetails.getSelected()) {
            FastWithdrawDetails fastWithdrawDetails2 = amountViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME;
            double maxAmount = fastWithdrawDetails2 != null ? fastWithdrawDetails2.getMaxAmount() : 0.0d;
            if (maxAmount > 0.0d && dDoubleValue > maxAmount) {
                return true;
            }
        } else {
            double d2 = amountViewModel.invoke;
            if (d2 > 0.0d && dDoubleValue > d2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean ShareDataUIState(AmountViewModel amountViewModel, String str) {
        FastWithdrawDetails fastWithdrawDetails;
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return true;
        }
        double dDoubleValue = amountViewModel.equals.getCalculateAmount().invoke().doubleValue();
        if (amountViewModel.isFastWithdrawEnabled() && (fastWithdrawDetails = amountViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME) != null && fastWithdrawDetails.getSelected()) {
            FastWithdrawDetails fastWithdrawDetails2 = amountViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (dDoubleValue < (fastWithdrawDetails2 != null ? fastWithdrawDetails2.getMinAmount() : 0.0d)) {
                return true;
            }
        } else if (dDoubleValue < amountViewModel.f4199c) {
            return true;
        }
        return false;
    }

    public static final boolean component3(AmountViewModel amountViewModel, String str) {
        OverdrawInformation overdrawInformation;
        Double balance;
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!amountViewModel.CoroutineDebuggingKt) {
            return false;
        }
        double dDoubleValue = (!amountViewModel.equals.getOverdrawFeatureEnabled() || (overdrawInformation = amountViewModel.toString) == null || (balance = overdrawInformation.getBalance()) == null) ? 0.0d : balance.doubleValue();
        if (!amountViewModel.f4200d || StringsKt.isBlank(str) || amountViewModel.hashCode == null) {
            return false;
        }
        double dDoubleValue2 = amountViewModel.equals.getCalculateAmount().invoke().doubleValue();
        Double d2 = amountViewModel.hashCode;
        Intrinsics.checkNotNull(d2);
        return dDoubleValue2 > d2.doubleValue() + dDoubleValue;
    }

    public static final boolean copydefault(AmountViewModel amountViewModel, String str) {
        OverdrawInformation overdrawInformation;
        Double balance;
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (amountViewModel.CoroutineDebuggingKt && amountViewModel.equals.getOverdrawFeatureEnabled() && (overdrawInformation = amountViewModel.toString) != null && (balance = overdrawInformation.getBalance()) != null) {
            double dDoubleValue = balance.doubleValue();
            if (!StringsKt.isBlank(str) && amountViewModel.hashCode != null) {
                double dDoubleValue2 = amountViewModel.equals.getCalculateAmount().invoke().doubleValue();
                Double d2 = amountViewModel.hashCode;
                Intrinsics.checkNotNull(d2);
                if (dDoubleValue2 > d2.doubleValue() + dDoubleValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean component1(AmountViewModel amountViewModel, String str) {
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (amountViewModel.CoroutineDebuggingKt && amountViewModel.equals.getOverdrawFeatureEnabled()) {
            OverdrawInformation overdrawInformation = amountViewModel.toString;
            Double balance = overdrawInformation != null ? overdrawInformation.getBalance() : null;
            Double d2 = amountViewModel.hashCode;
            if (balance != null && d2 != null && !StringsKt.isBlank(str) && ((amountViewModel.equals.getCalculateAmount().invoke().doubleValue() > d2.doubleValue() && amountViewModel.equals.getCalculateAmount().invoke().doubleValue() <= d2.doubleValue() + balance.doubleValue()) || (amountViewModel.toString == null && amountViewModel.equals.getCalculateAmount().invoke().doubleValue() > d2.doubleValue()))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equals(AmountViewModel amountViewModel, String str) {
        Intrinsics.checkNotNullParameter(amountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!amountViewModel.CoroutineDebuggingKt) {
            return false;
        }
        if (str.length() != 0) {
            if (amountViewModel.hashCode == null) {
                return false;
            }
            double dDoubleValue = amountViewModel.equals.getCalculateAmount().invoke().doubleValue();
            Double d2 = amountViewModel.hashCode;
            Intrinsics.checkNotNull(d2);
            if (dDoubleValue <= d2.doubleValue()) {
                return false;
            }
        }
        return true;
    }

    public final LiveData<Boolean> getValidInput() {
        return this.f;
    }

    public final LiveData<AmountError> getErrorState() {
        return this.getShareableDataState;
    }

    public final LiveData<Double> getWithdrawalFeeValue() {
        return this.k;
    }

    public final LiveData<Boolean> getWithdrawalFeeChecked() {
        return this.hExternalSyntheticLambda0;
    }

    public final LiveData<Double> getFastWithdrawalFeeValue() {
        return this.coroutineBoundary;
    }

    public final LiveData<Boolean> getShowMultipleWalletTooltip() {
        return this.f4198b;
    }

    public final LiveData<AmountBalancesOrientation> getBalanceOrientation() {
        return this.getAsAtTimestamp;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00052\u0015\u0010\u0006\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "updatedBalance", "Lkotlin/ParameterName;", "name", "a", "updatedOverdrawBalance", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.AmountViewModel$isBalanceOutdated$1", f = "AmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        boolean ShareDataUIState;
        int component1;
        boolean component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.component2 || (AmountViewModel.this.getEquals().getOverdrawFeatureEnabled() && AmountViewModel.this.f4197a.isOverdrawEnabled() && AmountViewModel.this.f4197a.hasUserOptedIn() && !this.ShareDataUIState));
        }

        component1(Continuation<? super component1> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return component2(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        public final Object component2(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            component1 component1Var = AmountViewModel.this.new component1(continuation);
            component1Var.component2 = z;
            component1Var.ShareDataUIState = z2;
            return component1Var.invokeSuspend(Unit.INSTANCE);
        }
    }

    public Flow<Boolean> isBalanceOutdated() {
        return this.accessartificialFrame;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.AmountViewModel$1", f = "AmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function2<Resource<? extends OverdrawInformation>, Continuation<? super Unit>, Object> {
        int component1;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Resource resource = (Resource) this.copydefault;
            AmountViewModel.this.toString = (OverdrawInformation) resource.getData();
            return Unit.INSTANCE;
        }

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = AmountViewModel.this.new AnonymousClass4(continuation);
            anonymousClass4.copydefault = obj;
            return anonymousClass4;
        }

        @Override
        public final Object invoke(Resource<OverdrawInformation> resource, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(resource, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a( \u0007*\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00060\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "Lkotlin/ParameterName;", "name", "a", "kotlin.jvm.PlatformType", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.AmountViewModel$2", f = "AmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function3<AmountError, Resource<? extends OverdrawInformation>, Continuation<? super Unit>, Object> {
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AmountViewModel.validateInput$default(AmountViewModel.this, null, 1, null);
            return Unit.INSTANCE;
        }

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override
        public final Object invoke(AmountError amountError, Resource<OverdrawInformation> resource, Continuation<? super Unit> continuation) {
            return AmountViewModel.this.new AnonymousClass2(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.amountvalidation.AmountViewModel$3", f = "AmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AmountViewModel.this.copydefault.setValue(AmountViewModel.this.e.shouldShowTooltip(TooltipType.MULTIPLE_WALLET));
            return Unit.INSTANCE;
        }

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmountViewModel.this.new AnonymousClass3(continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static void validateInput$default(AmountViewModel amountViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateInput");
        }
        if ((i & 1) != 0) {
            str = amountViewModel.ArtificialStackFrames;
        }
        amountViewModel.validateInput(str);
    }

    public final void validateInput(String currentInput) {
        Unit unit;
        Intrinsics.checkNotNullParameter(currentInput, "");
        this.ArtificialStackFrames = currentInput;
        WithdrawFeesMethod<?> withdrawFeesMethod = this.g;
        Intrinsics.checkNotNull(withdrawFeesMethod, "");
        Double doubleOrNull = StringsKt.toDoubleOrNull(this.ArtificialStackFrames);
        this.h = withdrawFeesMethod.retrieveFeeCharge(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, WithdrawFeesMethod.Companion.SUBTYPE.DEFAULT);
        if (this.equals.getCalculateWithdrawalFee()) {
            this.component4.setValue(Double.valueOf(this.h));
        }
        if (isFastWithdrawEnabled()) {
            MutableLiveData<Double> mutableLiveData = this.ShareDataUIState;
            WithdrawFeesMethod<?> withdrawFeesMethod2 = this.g;
            Intrinsics.checkNotNull(withdrawFeesMethod2, "");
            FeeTable feeTable = (FeeTable) withdrawFeesMethod2;
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(this.ArtificialStackFrames);
            mutableLiveData.setValue(Double.valueOf(feeTable.retrieveFeeCharge(doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d, WithdrawType.RTS)));
        }
        RuleError<AmountValidator> ruleErrorFindErrorOrNull = getValidator().findErrorOrNull(this.ArtificialStackFrames);
        if (ruleErrorFindErrorOrNull != null) {
            L.INSTANCE.d("_______penalty description : " + ruleErrorFindErrorOrNull.getPenalty() + "_______", new Object[0]);
            if (this.getRequestBeneficiariesState) {
                unit = null;
            } else if (AmountValidator.WARNING == ruleErrorFindErrorOrNull.getPenalty()) {
                this.component3.setValue(true);
                this.component2.setValue(new AmountError(AmountErrorType.WARNING, ruleErrorFindErrorOrNull.getPenalty(), null, 4, null));
                unit = Unit.INSTANCE;
            } else if (this.equals.getOverdrawFeatureEnabled() && AmountValidator.ABOVE_CURRENT_BALANCE == ruleErrorFindErrorOrNull.getPenalty()) {
                this.component3.setValue(true);
                this.component2.setValue(new AmountError(AmountErrorType.SUBMISSION_ERROR, ruleErrorFindErrorOrNull.getPenalty(), null, 4, null));
                unit = Unit.INSTANCE;
            } else if (this.equals.getOverdrawFeatureEnabled() && AmountValidator.USE_OVERDRAW_BALANCE == ruleErrorFindErrorOrNull.getPenalty()) {
                this.component3.setValue(true);
                this.component2.setValue(new AmountError(AmountErrorType.OVERDRAW, ruleErrorFindErrorOrNull.getPenalty(), null, 4, null));
                unit = Unit.INSTANCE;
            } else {
                this.component3.setValue(false);
                int i = WhenMappings.$EnumSwitchMapping$0[ruleErrorFindErrorOrNull.getPenalty().getInputState().ordinal()];
                if (i == 1) {
                    this.component2.setValue(new AmountError(AmountErrorType.NO_ERROR, null, null, 6, null));
                    unit = Unit.INSTANCE;
                } else if (i == 2) {
                    this.component2.setValue(new AmountError(AmountErrorType.SUBMISSION_ERROR, ruleErrorFindErrorOrNull.getPenalty(), ruleErrorFindErrorOrNull.getPenaltyData()));
                    unit = Unit.INSTANCE;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.component2.setValue(new AmountError(AmountErrorType.NO_ERROR, null, null, 6, null));
                    unit = Unit.INSTANCE;
                }
            }
            if (unit != null) {
                return;
            }
        }
        this.component3.setValue(true);
        this.component2.setValue(new AmountError(AmountErrorType.NO_ERROR, null, null, 6, null));
    }

    public final void setCurrentBalance(double balance) {
        this.hashCode = Double.valueOf(balance);
        validateInput$default(this, null, 1, null);
    }

    public final void maxAmountSetter(double maxAmount) {
        this.invoke = maxAmount;
    }

    public final void minAmountSetter(double minAmount) {
        this.f4199c = minAmount;
    }

    public final void setAvoidAmountValidation(boolean enabled) {
        this.getRequestBeneficiariesState = enabled;
    }

    public final void addWithdrawalFees(boolean add) {
        this.copy.setValue(Boolean.valueOf(add));
        validateInput$default(this, null, 1, null);
    }

    public final boolean isOverdrawDisabled() {
        OverdrawInformation overdrawInformation = this.toString;
        return overdrawInformation == null || !OverdrawInformationKt.isActive(overdrawInformation);
    }

    public final CurrencyLabelPosition getCurrencyLabelPosition() {
        return this.getSponsorBeneficiariesState.getCurrencyLabelPosition();
    }

    public final void setMultipleWalletTooltipShown() {
        this.e.setTooltipShown(TooltipType.MULTIPLE_WALLET);
    }

    public final void onShowMultipleWalletTooltip() {
        this.e.incrementMultipleWalletTooltipTracker();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "", "errorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "amountValidator", "Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;", "penaltyData", "Lcom/safaricom/consumer/commons/validator/PenaltyData;", "<init>", "(Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;Lcom/safaricom/consumer/commons/validator/PenaltyData;)V", "getErrorType", "()Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "getAmountValidator", "()Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;", "getPenaltyData", "()Lcom/safaricom/consumer/commons/validator/PenaltyData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AmountError {
        private final AmountErrorType component1;
        private final PenaltyData component2;
        private final AmountValidator copydefault;

        public AmountError(AmountErrorType amountErrorType, AmountValidator amountValidator, PenaltyData penaltyData) {
            Intrinsics.checkNotNullParameter(amountErrorType, "");
            this.component1 = amountErrorType;
            this.copydefault = amountValidator;
            this.component2 = penaltyData;
        }

        public AmountError(AmountErrorType amountErrorType, AmountValidator amountValidator, PenaltyData penaltyData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AmountErrorType.NO_ERROR : amountErrorType, (i & 2) != 0 ? null : amountValidator, (i & 4) != 0 ? null : penaltyData);
        }

        public final AmountValidator getAmountValidator() {
            return this.copydefault;
        }

        public final AmountErrorType getErrorType() {
            return this.component1;
        }

        public final PenaltyData getPenaltyData() {
            return this.component2;
        }

        public AmountError() {
            this(null, null, null, 7, null);
        }

        public static AmountError copy$default(AmountError amountError, AmountErrorType amountErrorType, AmountValidator amountValidator, PenaltyData penaltyData, int i, Object obj) {
            if ((i & 1) != 0) {
                amountErrorType = amountError.component1;
            }
            if ((i & 2) != 0) {
                amountValidator = amountError.copydefault;
            }
            if ((i & 4) != 0) {
                penaltyData = amountError.component2;
            }
            return amountError.copy(amountErrorType, amountValidator, penaltyData);
        }

        public final AmountErrorType getComponent1() {
            return this.component1;
        }

        public final AmountValidator getCopydefault() {
            return this.copydefault;
        }

        public final PenaltyData getComponent2() {
            return this.component2;
        }

        public final AmountError copy(AmountErrorType errorType, AmountValidator amountValidator, PenaltyData penaltyData) {
            Intrinsics.checkNotNullParameter(errorType, "");
            return new AmountError(errorType, amountValidator, penaltyData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AmountError)) {
                return false;
            }
            AmountError amountError = (AmountError) other;
            return this.component1 == amountError.component1 && this.copydefault == amountError.copydefault && Intrinsics.areEqual(this.component2, amountError.component2);
        }

        public int hashCode() {
            int iHashCode = this.component1.hashCode();
            AmountValidator amountValidator = this.copydefault;
            int iHashCode2 = amountValidator == null ? 0 : amountValidator.hashCode();
            PenaltyData penaltyData = this.component2;
            return (((iHashCode * 31) + iHashCode2) * 31) + (penaltyData != null ? penaltyData.hashCode() : 0);
        }

        public String toString() {
            return "AmountError(errorType=" + this.component1 + ", amountValidator=" + this.copydefault + ", penaltyData=" + this.component2 + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "SUBMISSION_ERROR", "OVERDRAW", "NO_ERROR", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AmountErrorType {
        private static final EnumEntries $ENTRIES;
        private static final AmountErrorType[] $VALUES;
        public static final AmountErrorType WARNING = new AmountErrorType("WARNING", 0);
        public static final AmountErrorType SUBMISSION_ERROR = new AmountErrorType("SUBMISSION_ERROR", 1);
        public static final AmountErrorType OVERDRAW = new AmountErrorType("OVERDRAW", 2);
        public static final AmountErrorType NO_ERROR = new AmountErrorType("NO_ERROR", 3);

        private AmountErrorType(String str, int i) {
        }

        static {
            AmountErrorType[] amountErrorTypeArr$values = $values();
            $VALUES = amountErrorTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(amountErrorTypeArr$values);
        }

        public static AmountErrorType valueOf(String str) {
            return (AmountErrorType) Enum.valueOf(AmountErrorType.class, str);
        }

        public static AmountErrorType[] values() {
            return (AmountErrorType[]) $VALUES.clone();
        }

        private static final AmountErrorType[] $values() {
            return new AmountErrorType[]{WARNING, SUBMISSION_ERROR, OVERDRAW, NO_ERROR};
        }

        public static EnumEntries<AmountErrorType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u000b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u001d\u0010/\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u000bHÆ\u0003J\r\u00100\u001a\u0006\u0012\u0002\b\u00030\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J¡\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u000b2\f\b\u0002\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R%\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006<"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountViewModelParams;", "", "overdrawFeatureEnabled", "", "calculateWithdrawalFee", "maxAmount", "", "minAmount", "calculateAmount", "Lkotlin/Function0;", "validatorCustomRules", "", "Lcom/safaricom/consumer/commons/validator/Rule;", "", "Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;", "withdrawFeesMethod", "Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod;", "fastWithdrawDetails", "Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;", "supportsOutdatedBalance", "supportsBongaPoints", "isBalanceCheckEnabled", "supportsMultipleWallet", "<init>", "(ZZDDLkotlin/jvm/functions/Function0;Ljava/util/List;Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod;Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;ZZZZ)V", "getOverdrawFeatureEnabled", "()Z", "getCalculateWithdrawalFee", "getMaxAmount", "()D", "getMinAmount", "getCalculateAmount", "()Lkotlin/jvm/functions/Function0;", "getValidatorCustomRules", "()Ljava/util/List;", "getWithdrawFeesMethod", "()Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod;", "getFastWithdrawDetails", "()Lcom/safaricom/consumer/commons/withdraw/FastWithdrawDetails;", "getSupportsOutdatedBalance", "getSupportsBongaPoints", "getSupportsMultipleWallet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AmountViewModelParams {
        private final List<Rule<String, AmountValidator>> ArtificialStackFrames;
        private final FastWithdrawDetails ShareDataUIState;
        private final boolean component1;
        private final Function0<Double> component2;
        private final double component3;
        private final boolean component4;
        private final boolean copy;
        private final boolean copydefault;
        private final boolean equals;
        private final boolean getAsAtTimestamp;
        private final double getRequestBeneficiariesState;
        private final WithdrawFeesMethod<?> getSponsorBeneficiariesState;

        /* JADX WARN: Multi-variable type inference failed */
        public AmountViewModelParams(boolean z, boolean z2, double d2, double d3, Function0<Double> function0, List<? extends Rule<String, AmountValidator>> list, WithdrawFeesMethod<?> withdrawFeesMethod, FastWithdrawDetails fastWithdrawDetails, boolean z3, boolean z4, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(withdrawFeesMethod, "");
            this.getAsAtTimestamp = z;
            this.component1 = z2;
            this.component3 = d2;
            this.getRequestBeneficiariesState = d3;
            this.component2 = function0;
            this.ArtificialStackFrames = list;
            this.getSponsorBeneficiariesState = withdrawFeesMethod;
            this.ShareDataUIState = fastWithdrawDetails;
            this.copy = z3;
            this.equals = z4;
            this.copydefault = z5;
            this.component4 = z6;
        }

        public AmountViewModelParams(boolean z, boolean z2, double d2, double d3, Function0 function0, List list, WithdrawFeesMethod withdrawFeesMethod, FastWithdrawDetails fastWithdrawDetails, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, d2, d3, function0, list, withdrawFeesMethod, fastWithdrawDetails, z3, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? true : z5, (i & 2048) != 0 ? false : z6);
        }

        public final boolean getOverdrawFeatureEnabled() {
            return this.getAsAtTimestamp;
        }

        public final boolean getCalculateWithdrawalFee() {
            return this.component1;
        }

        public final double getMaxAmount() {
            return this.component3;
        }

        public final double getMinAmount() {
            return this.getRequestBeneficiariesState;
        }

        public final Function0<Double> getCalculateAmount() {
            return this.component2;
        }

        public final List<Rule<String, AmountValidator>> getValidatorCustomRules() {
            return this.ArtificialStackFrames;
        }

        public final WithdrawFeesMethod<?> getWithdrawFeesMethod() {
            return this.getSponsorBeneficiariesState;
        }

        public final FastWithdrawDetails getFastWithdrawDetails() {
            return this.ShareDataUIState;
        }

        public final boolean getSupportsOutdatedBalance() {
            return this.copy;
        }

        public final boolean getSupportsBongaPoints() {
            return this.equals;
        }

        public final boolean isBalanceCheckEnabled() {
            return this.copydefault;
        }

        public final boolean getSupportsMultipleWallet() {
            return this.component4;
        }

        public final boolean getGetAsAtTimestamp() {
            return this.getAsAtTimestamp;
        }

        public final boolean getEquals() {
            return this.equals;
        }

        public final boolean getCopydefault() {
            return this.copydefault;
        }

        public final boolean getComponent4() {
            return this.component4;
        }

        public final boolean getComponent1() {
            return this.component1;
        }

        public final double getComponent3() {
            return this.component3;
        }

        public final double getGetRequestBeneficiariesState() {
            return this.getRequestBeneficiariesState;
        }

        public final Function0<Double> component5() {
            return this.component2;
        }

        public final List<Rule<String, AmountValidator>> component6() {
            return this.ArtificialStackFrames;
        }

        public final WithdrawFeesMethod<?> component7() {
            return this.getSponsorBeneficiariesState;
        }

        public final FastWithdrawDetails getShareDataUIState() {
            return this.ShareDataUIState;
        }

        public final boolean getCopy() {
            return this.copy;
        }

        public final AmountViewModelParams copy(boolean overdrawFeatureEnabled, boolean calculateWithdrawalFee, double maxAmount, double minAmount, Function0<Double> calculateAmount, List<? extends Rule<String, AmountValidator>> validatorCustomRules, WithdrawFeesMethod<?> withdrawFeesMethod, FastWithdrawDetails fastWithdrawDetails, boolean supportsOutdatedBalance, boolean supportsBongaPoints, boolean isBalanceCheckEnabled, boolean supportsMultipleWallet) {
            Intrinsics.checkNotNullParameter(calculateAmount, "");
            Intrinsics.checkNotNullParameter(withdrawFeesMethod, "");
            return new AmountViewModelParams(overdrawFeatureEnabled, calculateWithdrawalFee, maxAmount, minAmount, calculateAmount, validatorCustomRules, withdrawFeesMethod, fastWithdrawDetails, supportsOutdatedBalance, supportsBongaPoints, isBalanceCheckEnabled, supportsMultipleWallet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AmountViewModelParams)) {
                return false;
            }
            AmountViewModelParams amountViewModelParams = (AmountViewModelParams) other;
            return this.getAsAtTimestamp == amountViewModelParams.getAsAtTimestamp && this.component1 == amountViewModelParams.component1 && Double.compare(this.component3, amountViewModelParams.component3) == 0 && Double.compare(this.getRequestBeneficiariesState, amountViewModelParams.getRequestBeneficiariesState) == 0 && Intrinsics.areEqual(this.component2, amountViewModelParams.component2) && Intrinsics.areEqual(this.ArtificialStackFrames, amountViewModelParams.ArtificialStackFrames) && Intrinsics.areEqual(this.getSponsorBeneficiariesState, amountViewModelParams.getSponsorBeneficiariesState) && Intrinsics.areEqual(this.ShareDataUIState, amountViewModelParams.ShareDataUIState) && this.copy == amountViewModelParams.copy && this.equals == amountViewModelParams.equals && this.copydefault == amountViewModelParams.copydefault && this.component4 == amountViewModelParams.component4;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.getAsAtTimestamp);
            int iHashCode2 = Boolean.hashCode(this.component1);
            int iHashCode3 = Double.hashCode(this.component3);
            int iHashCode4 = Double.hashCode(this.getRequestBeneficiariesState);
            int iHashCode5 = this.component2.hashCode();
            List<Rule<String, AmountValidator>> list = this.ArtificialStackFrames;
            int iHashCode6 = list == null ? 0 : list.hashCode();
            int iHashCode7 = this.getSponsorBeneficiariesState.hashCode();
            FastWithdrawDetails fastWithdrawDetails = this.ShareDataUIState;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (fastWithdrawDetails != null ? fastWithdrawDetails.hashCode() : 0)) * 31) + Boolean.hashCode(this.copy)) * 31) + Boolean.hashCode(this.equals)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.component4);
        }

        public String toString() {
            return "AmountViewModelParams(overdrawFeatureEnabled=" + this.getAsAtTimestamp + ", calculateWithdrawalFee=" + this.component1 + ", maxAmount=" + this.component3 + ", minAmount=" + this.getRequestBeneficiariesState + ", calculateAmount=" + this.component2 + ", validatorCustomRules=" + this.ArtificialStackFrames + ", withdrawFeesMethod=" + this.getSponsorBeneficiariesState + ", fastWithdrawDetails=" + this.ShareDataUIState + ", supportsOutdatedBalance=" + this.copy + ", supportsBongaPoints=" + this.equals + ", isBalanceCheckEnabled=" + this.copydefault + ", supportsMultipleWallet=" + this.component4 + ')';
        }
    }
}
