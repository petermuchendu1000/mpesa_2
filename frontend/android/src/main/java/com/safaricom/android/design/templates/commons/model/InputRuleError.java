package com.safaricom.android.design.templates.commons.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/safaricom/android/design/templates/commons/model/InputRuleError;", "P", "", "penalty", "inputPenaltyData", "Lcom/safaricom/android/design/templates/commons/model/InputPenaltyData;", "<init>", "(Ljava/lang/Object;Lcom/safaricom/android/design/templates/commons/model/InputPenaltyData;)V", "getPenalty", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getInputPenaltyData", "()Lcom/safaricom/android/design/templates/commons/model/InputPenaltyData;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/safaricom/android/design/templates/commons/model/InputPenaltyData;)Lcom/safaricom/android/design/templates/commons/model/InputRuleError;", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputRuleError<P> {
    public static final int $stable = 0;
    private final P ShareDataUIState;
    private final InputPenaltyData copydefault;

    public InputRuleError(P p, InputPenaltyData inputPenaltyData) {
        Intrinsics.checkNotNullParameter(inputPenaltyData, "");
        this.ShareDataUIState = p;
        this.copydefault = inputPenaltyData;
    }

    public final InputPenaltyData getInputPenaltyData() {
        return this.copydefault;
    }

    public final P getPenalty() {
        return this.ShareDataUIState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InputRuleError copy$default(InputRuleError inputRuleError, Object obj, InputPenaltyData inputPenaltyData, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = inputRuleError.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            inputPenaltyData = inputRuleError.copydefault;
        }
        return inputRuleError.copy(obj, inputPenaltyData);
    }

    public final P component1() {
        return this.ShareDataUIState;
    }

    public final InputPenaltyData getCopydefault() {
        return this.copydefault;
    }

    public final InputRuleError<P> copy(P penalty, InputPenaltyData inputPenaltyData) {
        Intrinsics.checkNotNullParameter(inputPenaltyData, "");
        return new InputRuleError<>(penalty, inputPenaltyData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputRuleError)) {
            return false;
        }
        InputRuleError inputRuleError = (InputRuleError) other;
        return Intrinsics.areEqual(this.ShareDataUIState, inputRuleError.ShareDataUIState) && Intrinsics.areEqual(this.copydefault, inputRuleError.copydefault);
    }

    public int hashCode() {
        P p = this.ShareDataUIState;
        return ((p == null ? 0 : p.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        return "InputRuleError(penalty=" + this.ShareDataUIState + ", inputPenaltyData=" + this.copydefault + ')';
    }
}
