package com.safaricom.consumer.commons.validator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/safaricom/consumer/commons/validator/RuleError;", "P", "", "penalty", "penaltyData", "Lcom/safaricom/consumer/commons/validator/PenaltyData;", "<init>", "(Ljava/lang/Object;Lcom/safaricom/consumer/commons/validator/PenaltyData;)V", "getPenalty", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPenaltyData", "()Lcom/safaricom/consumer/commons/validator/PenaltyData;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/safaricom/consumer/commons/validator/PenaltyData;)Lcom/safaricom/consumer/commons/validator/RuleError;", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RuleError<P> {
    private final PenaltyData component1;
    private final P component3;

    public RuleError(P p, PenaltyData penaltyData) {
        Intrinsics.checkNotNullParameter(penaltyData, "");
        this.component3 = p;
        this.component1 = penaltyData;
    }

    public final P getPenalty() {
        return this.component3;
    }

    public final PenaltyData getPenaltyData() {
        return this.component1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RuleError copy$default(RuleError ruleError, Object obj, PenaltyData penaltyData, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = ruleError.component3;
        }
        if ((i & 2) != 0) {
            penaltyData = ruleError.component1;
        }
        return ruleError.copy(obj, penaltyData);
    }

    public final P component1() {
        return this.component3;
    }

    public final PenaltyData getComponent1() {
        return this.component1;
    }

    public final RuleError<P> copy(P penalty, PenaltyData penaltyData) {
        Intrinsics.checkNotNullParameter(penaltyData, "");
        return new RuleError<>(penalty, penaltyData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuleError)) {
            return false;
        }
        RuleError ruleError = (RuleError) other;
        return Intrinsics.areEqual(this.component3, ruleError.component3) && Intrinsics.areEqual(this.component1, ruleError.component1);
    }

    public int hashCode() {
        P p = this.component3;
        return ((p == null ? 0 : p.hashCode()) * 31) + this.component1.hashCode();
    }

    public String toString() {
        return "RuleError(penalty=" + this.component3 + ", penaltyData=" + this.component1 + ')';
    }
}
