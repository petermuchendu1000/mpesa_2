package com.safaricom.android.design.templates.commons.validation;

import com.safaricom.android.design.templates.commons.model.InputRuleError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\u001d\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/android/design/templates/commons/validation/InputValidationUseCase;", "I", "", "P", "findErrorOrNull", "Lcom/safaricom/android/design/templates/commons/model/InputRuleError;", "input", "(Ljava/lang/Object;)Lcom/safaricom/android/design/templates/commons/model/InputRuleError;", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InputValidationUseCase<I, P> {
    InputRuleError<P> findErrorOrNull(I input);
}
