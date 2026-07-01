package com.safaricom.consumer.commons.validator;

import android.os.Process;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/safaricom/consumer/commons/validator/Rule;", "I", "P", "", "<init>", "()V", "SimpleRule", "ComplexRule", "Lcom/safaricom/consumer/commons/validator/Rule$ComplexRule;", "Lcom/safaricom/consumer/commons/validator/Rule$SimpleRule;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Rule<I, P> {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000e\u0010\u0014\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\tHÆ\u0003JD\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00028\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/safaricom/consumer/commons/validator/Rule$SimpleRule;", "I", "P", "Lcom/safaricom/consumer/commons/validator/Rule;", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lkotlin/Function1;", "", "penalty", "penaltyData", "Lcom/safaricom/consumer/commons/validator/PenaltyData;", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/safaricom/consumer/commons/validator/PenaltyData;)V", "getValidator", "()Lkotlin/jvm/functions/Function1;", "getPenalty", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPenaltyData", "()Lcom/safaricom/consumer/commons/validator/PenaltyData;", "component1", "component2", "component3", "copy", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/safaricom/consumer/commons/validator/PenaltyData;)Lcom/safaricom/consumer/commons/validator/Rule$SimpleRule;", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SimpleRule<I, P> extends Rule<I, P> {
        public static int ShareDataUIState;
        public static int component1;
        private final PenaltyData component2;
        private final Function1<I, Boolean> component3;
        private final P copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SimpleRule(Function1<? super I, Boolean> function1, P p, PenaltyData penaltyData) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(penaltyData, "");
            this.component3 = function1;
            this.copydefault = p;
            this.component2 = penaltyData;
        }

        public final P getPenalty() {
            return this.copydefault;
        }

        public final PenaltyData getPenaltyData() {
            return this.component2;
        }

        public final Function1<I, Boolean> getValidator() {
            return this.component3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SimpleRule copy$default(SimpleRule simpleRule, Function1 function1, Object obj, PenaltyData penaltyData, int i, Object obj2) {
            if ((i & 1) != 0) {
                function1 = simpleRule.component3;
            }
            if ((i & 2) != 0) {
                obj = simpleRule.copydefault;
            }
            if ((i & 4) != 0) {
                penaltyData = simpleRule.component2;
            }
            return simpleRule.copy(function1, obj, penaltyData);
        }

        public final Function1<I, Boolean> component1() {
            return this.component3;
        }

        public final P component2() {
            return this.copydefault;
        }

        public final PenaltyData getComponent2() {
            return this.component2;
        }

        public final SimpleRule<I, P> copy(Function1<? super I, Boolean> validator, P penalty, PenaltyData penaltyData) {
            Intrinsics.checkNotNullParameter(validator, "");
            Intrinsics.checkNotNullParameter(penaltyData, "");
            return new SimpleRule<>(validator, penalty, penaltyData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimpleRule)) {
                return false;
            }
            SimpleRule simpleRule = (SimpleRule) other;
            return Intrinsics.areEqual(this.component3, simpleRule.component3) && Intrinsics.areEqual(this.copydefault, simpleRule.copydefault) && Intrinsics.areEqual(this.component2, simpleRule.component2);
        }

        public int hashCode() {
            int iHashCode = this.component3.hashCode();
            P p = this.copydefault;
            return (((iHashCode * 31) + (p == null ? 0 : p.hashCode())) * 31) + this.component2.hashCode();
        }

        public String toString() {
            return "SimpleRule(validator=" + this.component3 + ", penalty=" + this.copydefault + ", penaltyData=" + this.component2 + ')';
        }

        public static int copydefault() {
            int i = ShareDataUIState;
            int i2 = i % 6161109;
            ShareDataUIState = i + 1;
            if (i2 != 0) {
                return component1;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            component1 = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    private Rule() {
    }

    public Rule(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/safaricom/consumer/commons/validator/Rule$ComplexRule;", "I", "P", "Lcom/safaricom/consumer/commons/validator/Rule;", "<init>", "()V", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lkotlin/Function1;", "getValidator", "()Lkotlin/jvm/functions/Function1;", "penaltyMap", "", "Lcom/safaricom/consumer/commons/validator/PenaltyData;", "getPenaltyMap", "()Ljava/util/Map;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ComplexRule<I, P> extends Rule<I, P> {
        public abstract Map<P, PenaltyData> getPenaltyMap();

        public abstract Function1<I, P> getValidator();

        public ComplexRule() {
            super(null);
        }
    }
}
