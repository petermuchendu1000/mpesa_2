package com.safaricom.android.design.templates.commons.alphanumericinput;

import androidx.lifecycle.ViewModel;
import com.safaricom.android.design.templates.commons.model.InputErrorState;
import com.safaricom.android.design.templates.commons.model.InputRuleError;
import com.safaricom.android.design.templates.commons.validation.InputTransformationUseCase;
import com.safaricom.android.design.templates.commons.validation.InputValidationUseCase;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputViewModel;", "Landroidx/lifecycle/ViewModel;", "inputValidationUseCase", "Lcom/safaricom/android/design/templates/commons/validation/InputValidationUseCase;", "", "Lcom/safaricom/android/design/templates/commons/model/InputErrorState;", "inputTransformationUseCase", "Lcom/safaricom/android/design/templates/commons/validation/InputTransformationUseCase;", "<init>", "(Lcom/safaricom/android/design/templates/commons/validation/InputValidationUseCase;Lcom/safaricom/android/design/templates/commons/validation/InputTransformationUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onInputChanged", "", "newInput", "validateInput", "currentInput", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlphanumericInputViewModel extends ViewModel {
    public static final int $stable = 8;
    private final InputValidationUseCase<String, InputErrorState> ShareDataUIState;
    private final StateFlow<AlphanumericInputUiState> component2;
    private final MutableStateFlow<AlphanumericInputUiState> component3;
    private final InputTransformationUseCase copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputErrorState.values().length];
            try {
                iArr[InputErrorState.DISABLE_SUBMISSION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String ShareDataUIState(String str) {
        return str;
    }

    public AlphanumericInputViewModel(InputValidationUseCase inputValidationUseCase, InputTransformationUseCase inputTransformationUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InputValidationUseCase() {
            @Override
            public final InputRuleError findErrorOrNull(Object obj) {
                return AlphanumericInputViewModel.component2((String) obj);
            }
        } : inputValidationUseCase, (i & 2) != 0 ? new InputTransformationUseCase() {
            @Override
            public final String invoke(String str) {
                return AlphanumericInputViewModel.ShareDataUIState(str);
            }
        } : inputTransformationUseCase);
    }

    public AlphanumericInputViewModel(InputValidationUseCase<String, InputErrorState> inputValidationUseCase, InputTransformationUseCase inputTransformationUseCase) {
        Intrinsics.checkNotNullParameter(inputValidationUseCase, "");
        Intrinsics.checkNotNullParameter(inputTransformationUseCase, "");
        this.ShareDataUIState = inputValidationUseCase;
        this.copydefault = inputTransformationUseCase;
        MutableStateFlow<AlphanumericInputUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new AlphanumericInputUiState(null, false, false, false, null, 31, null));
        this.component3 = MutableStateFlow;
        this.component2 = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<AlphanumericInputUiState> getUiState() {
        return this.component2;
    }

    public final void onInputChanged(String newInput) {
        AlphanumericInputUiState value;
        String strInvoke = this.copydefault.invoke(newInput);
        if (strInvoke == null) {
            strInvoke = "";
        }
        MutableStateFlow<AlphanumericInputUiState> mutableStateFlow = this.component3;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AlphanumericInputUiState.copy$default(value, strInvoke, false, strInvoke.length() > 0, false, null, 26, null)));
        component3(strInvoke);
    }

    private final void component3(String str) {
        Triple triple;
        AlphanumericInputUiState value;
        if (str == null) {
            str = "";
        }
        InputRuleError<InputErrorState> inputRuleErrorFindErrorOrNull = this.ShareDataUIState.findErrorOrNull(str);
        if (inputRuleErrorFindErrorOrNull != null) {
            String errorResource = inputRuleErrorFindErrorOrNull.getInputPenaltyData().getErrorResource();
            triple = new Triple(Boolean.valueOf(WhenMappings.$EnumSwitchMapping$0[inputRuleErrorFindErrorOrNull.getPenalty().ordinal()] == 1), errorResource != null ? errorResource : "", false);
        } else {
            triple = new Triple(false, null, true);
        }
        boolean zBooleanValue = ((Boolean) triple.component1()).booleanValue();
        String str2 = (String) triple.component2();
        boolean zBooleanValue2 = ((Boolean) triple.component3()).booleanValue();
        MutableStateFlow<AlphanumericInputUiState> mutableStateFlow = this.component3;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AlphanumericInputUiState.copy$default(value, null, zBooleanValue2, false, zBooleanValue, str2, 5, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlphanumericInputViewModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final InputRuleError component2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }
}
