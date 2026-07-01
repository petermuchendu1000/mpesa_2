package com.safaricom.android.design.templates.amountinput;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.iap.ac.config.lite.ConfigMerger;
import com.safaricom.android.design.templates.amountinput.model.AmountInputConfig;
import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.model.Wallet;
import com.safaricom.android.design.templates.amountinput.provider.AmountInputDataProvider;
import com.safaricom.android.design.templates.amountinput.provider.FeeCalculator;
import com.safaricom.android.design.templates.amountinput.validation.AmountInputValidator;
import com.safaricom.android.design.templates.amountinput.validation.AmountValidationRule;
import com.safaricom.android.design.templates.amountinput.validation.ValidationResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0013H\u0016J\u0012\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020\u0013H\u0016J\b\u0010D\u001a\u00020@H\u0014J\u000e\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020 J\u0006\u0010G\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0015R\u0019\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0015R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020 0\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u000201X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0019R\u0019\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0019R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020 0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0019R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0019R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020 0\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0019¨\u0006H"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/AmountInputViewModel;", "Landroidx/lifecycle/ViewModel;", ConfigMerger.COMMON_CONFIG_SECTION, "Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "feeCalculator", "Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "dataProvider", "Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;", "customValidationRules", "", "Lcom/safaricom/android/design/templates/amountinput/validation/AmountValidationRule;", "<init>", "(Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;Ljava/util/List;)V", "getConfig", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "getFeeCalculator", "()Lcom/safaricom/android/design/templates/amountinput/provider/FeeCalculator;", "_currentAmount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_currentAmount", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "currentAmount", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentAmount", "()Lkotlinx/coroutines/flow/StateFlow;", "_validationResult", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "get_validationResult", "validationResult", "getValidationResult", "_isValid", "", "get_isValid", "isValid", "_withdrawalFee", "", "get_withdrawalFee", "withdrawalFee", "getWithdrawalFee", "_fastWithdrawFee", "get_fastWithdrawFee", "fastWithdrawFee", "getFastWithdrawFee", "_withdrawalFeeChecked", "get_withdrawalFeeChecked", "withdrawalFeeChecked", "getWithdrawalFeeChecked", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lcom/safaricom/android/design/templates/amountinput/validation/AmountInputValidator;", "getValidator", "()Lcom/safaricom/android/design/templates/amountinput/validation/AmountInputValidator;", "currentBalance", "getCurrentBalance", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "getOverdraftInfo", "isBalanceOutdated", "accountWallets", "Lcom/safaricom/android/design/templates/amountinput/model/Wallet;", "getAccountWallets", "showMultipleWalletTooltip", "getShowMultipleWalletTooltip", "updateAmount", "", "amount", "validateInput", "input", "calculateFees", "setWithdrawalFeeChecked", "checked", "getFinalAmount", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AmountInputViewModel extends ViewModel {
    public static final int $stable = 8;
    private final StateFlow<Double> ArtificialStackFrames;
    private final StateFlow<Boolean> CoroutineDebuggingKt;
    private final MutableStateFlow<Double> ShareDataUIState;
    private final StateFlow<ValidationResult> accessartificialFrame;
    private final MutableStateFlow<Boolean> component1;
    private final MutableStateFlow<Double> component2;
    private final MutableStateFlow<String> component3;
    private final MutableStateFlow<Boolean> component4;
    private final StateFlow<Double> copy;
    private final MutableStateFlow<ValidationResult> copydefault;
    private final StateFlow<Double> coroutineBoundary;
    private final StateFlow<Boolean> coroutineCreation;
    private final StateFlow<List<Wallet>> equals;
    private final AmountInputValidator getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final AmountInputConfig getAsAtTimestamp;
    private final StateFlow<String> getRequestBeneficiariesState;
    private final StateFlow<Boolean> getShareableDataState;
    private final StateFlow<OverdraftInfo> getSponsorBeneficiariesState;
    private final FeeCalculator hashCode;
    private final StateFlow<Boolean> toString;

    public final AmountInputConfig getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    protected final FeeCalculator getHashCode() {
        return this.hashCode;
    }

    public AmountInputViewModel(AmountInputConfig amountInputConfig, FeeCalculator feeCalculator, AmountInputDataProvider amountInputDataProvider, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(amountInputConfig, (i & 2) != 0 ? null : feeCalculator, amountInputDataProvider, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public AmountInputViewModel(AmountInputConfig amountInputConfig, FeeCalculator feeCalculator, AmountInputDataProvider amountInputDataProvider, List<? extends AmountValidationRule> list) {
        Intrinsics.checkNotNullParameter(amountInputConfig, "");
        Intrinsics.checkNotNullParameter(amountInputDataProvider, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.getAsAtTimestamp = amountInputConfig;
        this.hashCode = feeCalculator;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.component3 = MutableStateFlow;
        this.getRequestBeneficiariesState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<ValidationResult> MutableStateFlow2 = StateFlowKt.MutableStateFlow(ValidationResult.Valid.INSTANCE);
        this.copydefault = MutableStateFlow2;
        this.accessartificialFrame = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this.component1 = MutableStateFlow3;
        this.getShareableDataState = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Double> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.component2 = MutableStateFlow4;
        this.coroutineBoundary = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Double> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.ShareDataUIState = MutableStateFlow5;
        this.ArtificialStackFrames = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(false);
        this.component4 = MutableStateFlow6;
        this.coroutineCreation = FlowKt.asStateFlow(MutableStateFlow6);
        AmountInputValidator amountInputValidator = new AmountInputValidator(amountInputConfig, new Function0() {
            @Override
            public final Object invoke() {
                return Double.valueOf(AmountInputViewModel.component3(this.f$0));
            }
        });
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            amountInputValidator.addRule((AmountValidationRule) it.next());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = amountInputValidator;
        AmountInputViewModel amountInputViewModel = this;
        StateFlow<Double> stateFlowStateIn = FlowKt.stateIn(amountInputDataProvider.getBalance(), ViewModelKt.getViewModelScope(amountInputViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), null);
        this.copy = stateFlowStateIn;
        StateFlow<OverdraftInfo> stateFlowStateIn2 = FlowKt.stateIn(amountInputDataProvider.getOverdraftInfo(), ViewModelKt.getViewModelScope(amountInputViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), null);
        this.getSponsorBeneficiariesState = stateFlowStateIn2;
        this.toString = FlowKt.stateIn(amountInputDataProvider.isBalanceOutdated(), ViewModelKt.getViewModelScope(amountInputViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), false);
        this.equals = FlowKt.stateIn(amountInputDataProvider.getAccountWallets(), ViewModelKt.getViewModelScope(amountInputViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.CoroutineDebuggingKt = FlowKt.stateIn(amountInputDataProvider.getShowMultipleWalletTooltip(), ViewModelKt.getViewModelScope(amountInputViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), false);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(stateFlowStateIn, stateFlowStateIn2, new AnonymousClass5(null)), new AnonymousClass3(null)), ViewModelKt.getViewModelScope(amountInputViewModel));
    }

    protected final MutableStateFlow<String> get_currentAmount() {
        return this.component3;
    }

    public final StateFlow<String> getCurrentAmount() {
        return this.getRequestBeneficiariesState;
    }

    protected final MutableStateFlow<ValidationResult> get_validationResult() {
        return this.copydefault;
    }

    public final StateFlow<ValidationResult> getValidationResult() {
        return this.accessartificialFrame;
    }

    protected final MutableStateFlow<Boolean> get_isValid() {
        return this.component1;
    }

    public final StateFlow<Boolean> isValid() {
        return this.getShareableDataState;
    }

    protected final MutableStateFlow<Double> get_withdrawalFee() {
        return this.component2;
    }

    public final StateFlow<Double> getWithdrawalFee() {
        return this.coroutineBoundary;
    }

    protected final MutableStateFlow<Double> get_fastWithdrawFee() {
        return this.ShareDataUIState;
    }

    public final StateFlow<Double> getFastWithdrawFee() {
        return this.ArtificialStackFrames;
    }

    protected final MutableStateFlow<Boolean> get_withdrawalFeeChecked() {
        return this.component4;
    }

    public final StateFlow<Boolean> getWithdrawalFeeChecked() {
        return this.coroutineCreation;
    }

    protected AmountInputValidator getGetARTIFICIAL_FRAME_PACKAGE_NAME() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public static final double component3(AmountInputViewModel amountInputViewModel) {
        Intrinsics.checkNotNullParameter(amountInputViewModel, "");
        Double doubleOrNull = StringsKt.toDoubleOrNull(amountInputViewModel.getRequestBeneficiariesState.getValue());
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return 0.0d;
    }

    public final StateFlow<Double> getCurrentBalance() {
        return this.copy;
    }

    public final StateFlow<OverdraftInfo> getOverdraftInfo() {
        return this.getSponsorBeneficiariesState;
    }

    public StateFlow<Boolean> isBalanceOutdated() {
        return this.toString;
    }

    public final StateFlow<List<Wallet>> getAccountWallets() {
        return this.equals;
    }

    public final StateFlow<Boolean> getShowMultipleWalletTooltip() {
        return this.CoroutineDebuggingKt;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "<unused var>", "", "Lkotlin/ParameterName;", "name", "a", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.android.design.templates.amountinput.AmountInputViewModel$1", f = "AmountInputViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends SuspendLambda implements Function3<Double, OverdraftInfo, Continuation<? super Unit>, Object> {
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(3, continuation);
        }

        @Override
        public final Object invoke(Double d2, OverdraftInfo overdraftInfo, Continuation<? super Unit> continuation) {
            return new AnonymousClass5(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.android.design.templates.amountinput.AmountInputViewModel$2", f = "AmountInputViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AmountInputViewModel.validateInput$default(AmountInputViewModel.this, null, 1, null);
            return Unit.INSTANCE;
        }

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmountInputViewModel.this.new AnonymousClass3(continuation);
        }

        @Override
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public void updateAmount(String amount) {
        Intrinsics.checkNotNullParameter(amount, "");
        this.component3.setValue(amount);
        validateInput$default(this, null, 1, null);
        calculateFees();
    }

    public static void validateInput$default(AmountInputViewModel amountInputViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateInput");
        }
        if ((i & 1) != 0) {
            str = amountInputViewModel.component3.getValue();
        }
        amountInputViewModel.validateInput(str);
    }

    public void validateInput(String input) {
        Intrinsics.checkNotNullParameter(input, "");
        ValidationResult validationResultValidate = getGetARTIFICIAL_FRAME_PACKAGE_NAME().validate(input, this.copy.getValue(), this.getSponsorBeneficiariesState.getValue());
        this.copydefault.setValue(validationResultValidate);
        this.component1.setValue(Boolean.valueOf((validationResultValidate instanceof ValidationResult.Valid) || (validationResultValidate instanceof ValidationResult.Empty) || (validationResultValidate instanceof ValidationResult.Warning)));
    }

    protected void calculateFees() {
        FeeCalculator feeCalculator;
        FeeCalculator feeCalculator2;
        Double doubleOrNull = StringsKt.toDoubleOrNull(this.component3.getValue());
        double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        if (this.getAsAtTimestamp.getShowWithdrawalFees() && (feeCalculator2 = this.hashCode) != null) {
            this.component2.setValue(Double.valueOf(feeCalculator2.calculateStandardFee(dDoubleValue)));
        }
        if (!this.getAsAtTimestamp.getSupportsFastWithdraw() || (feeCalculator = this.hashCode) == null) {
            return;
        }
        this.ShareDataUIState.setValue(Double.valueOf(feeCalculator.calculateFastWithdrawFee(dDoubleValue)));
    }

    public final void setWithdrawalFeeChecked(boolean checked) {
        this.component4.setValue(Boolean.valueOf(checked));
    }

    public final double getFinalAmount() {
        Double value;
        Double doubleOrNull = StringsKt.toDoubleOrNull(this.component3.getValue());
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        if (this.component4.getValue().booleanValue() && (value = this.component2.getValue()) != null) {
            dDoubleValue = value.doubleValue();
        }
        return dDoubleValue2 + dDoubleValue;
    }
}
