package com.safaricom.consumer.commons.validator;

import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/safaricom/consumer/commons/validator/PenaltyData;", "", "ruleDescriptor", "", "errorResource", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getRuleDescriptor", "()Ljava/lang/String;", "getErrorResource", "()Lcom/safaricom/consumer/commons/util/TextResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PenaltyData {
    private final String component1;
    private final TextResource component3;

    public PenaltyData(String str, TextResource textResource) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        this.component3 = textResource;
    }

    public PenaltyData(String str, TextResource textResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : textResource);
    }

    public final TextResource getErrorResource() {
        return this.component3;
    }

    public final String getRuleDescriptor() {
        return this.component1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PenaltyData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static PenaltyData copy$default(PenaltyData penaltyData, String str, TextResource textResource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = penaltyData.component1;
        }
        if ((i & 2) != 0) {
            textResource = penaltyData.component3;
        }
        return penaltyData.copy(str, textResource);
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final TextResource getComponent3() {
        return this.component3;
    }

    public final PenaltyData copy(String ruleDescriptor, TextResource errorResource) {
        Intrinsics.checkNotNullParameter(ruleDescriptor, "");
        return new PenaltyData(ruleDescriptor, errorResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenaltyData)) {
            return false;
        }
        PenaltyData penaltyData = (PenaltyData) other;
        return Intrinsics.areEqual(this.component1, penaltyData.component1) && Intrinsics.areEqual(this.component3, penaltyData.component3);
    }

    public int hashCode() {
        int iHashCode = this.component1.hashCode();
        TextResource textResource = this.component3;
        return (iHashCode * 31) + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        return "PenaltyData(ruleDescriptor=" + this.component1 + ", errorResource=" + this.component3 + ')';
    }
}
