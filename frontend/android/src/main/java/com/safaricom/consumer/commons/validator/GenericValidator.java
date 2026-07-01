package com.safaricom.consumer.commons.validator;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.consumer.commons.validator.Rule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00028\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tJ \u0010\u0017\u001a\u00020\u000b2\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0019J\u001b\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/safaricom/consumer/commons/validator/GenericValidator;", "I", "", "P", "Landroid/os/Parcelable;", "<init>", "()V", "ruleList", "Ljava/util/ArrayList;", "Lcom/safaricom/consumer/commons/validator/Rule;", "addSimpleRule", "", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lkotlin/Function1;", "", "penalty", "ruleDescriptor", "", "errorResource", "Lcom/safaricom/consumer/commons/util/TextResource;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;)V", "addRule", "rule", "joinRules", "addingRules", "", "findErrorOrNull", "Lcom/safaricom/consumer/commons/validator/RuleError;", "input", "(Ljava/lang/Object;)Lcom/safaricom/consumer/commons/validator/RuleError;", "clearRules", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenericValidator<I, P> implements Parcelable {
    public static final Parcelable.Creator<GenericValidator<?, ?>> CREATOR = new Creator();
    private ArrayList<Rule<I, P>> ruleList = new ArrayList<>();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GenericValidator<?, ?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GenericValidator<?, ?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new GenericValidator<>();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GenericValidator<?, ?>[] newArray(int i) {
            return new GenericValidator[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public static void addSimpleRule$default(GenericValidator genericValidator, Function1 function1, Object obj, String str, TextResource textResource, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            textResource = null;
        }
        genericValidator.addSimpleRule(function1, obj, str, textResource);
    }

    public final void addSimpleRule(Function1<? super I, Boolean> validator, P penalty, String ruleDescriptor, TextResource errorResource) {
        Intrinsics.checkNotNullParameter(validator, "");
        Intrinsics.checkNotNullParameter(penalty, "");
        Intrinsics.checkNotNullParameter(ruleDescriptor, "");
        this.ruleList.add(new Rule.SimpleRule(validator, penalty, new PenaltyData(ruleDescriptor, errorResource)));
    }

    public final void addRule(Rule<I, P> rule) {
        Intrinsics.checkNotNullParameter(rule, "");
        this.ruleList.add(rule);
    }

    public final void joinRules(List<? extends Rule<I, P>> addingRules) {
        Intrinsics.checkNotNullParameter(addingRules, "");
        ArrayList<Rule<I, P>> arrayList = new ArrayList<>();
        arrayList.addAll(addingRules);
        arrayList.addAll(this.ruleList);
        this.ruleList = arrayList;
    }

    public final RuleError<P> findErrorOrNull(I input) {
        PenaltyData penaltyData;
        Intrinsics.checkNotNullParameter(input, "");
        Iterator<T> it = this.ruleList.iterator();
        while (it.hasNext()) {
            Rule rule = (Rule) it.next();
            if (rule instanceof Rule.SimpleRule) {
                Rule.SimpleRule simpleRule = (Rule.SimpleRule) rule;
                if (simpleRule.getValidator().invoke(input).booleanValue()) {
                    return new RuleError<>(simpleRule.getPenalty(), simpleRule.getPenaltyData());
                }
            } else {
                if (!(rule instanceof Rule.ComplexRule)) {
                    throw new NoWhenBranchMatchedException();
                }
                Rule.ComplexRule complexRule = (Rule.ComplexRule) rule;
                P pInvoke = complexRule.getValidator().invoke(input);
                if (pInvoke != null && (penaltyData = complexRule.getPenaltyMap().get(pInvoke)) != null) {
                    return new RuleError<>(pInvoke, penaltyData);
                }
            }
        }
        return null;
    }

    public final void clearRules() {
        this.ruleList.clear();
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(1);
    }
}
