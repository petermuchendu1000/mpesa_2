package com.safaricom.android.design.templates.commons.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/safaricom/android/design/templates/commons/model/InputPenaltyData;", "", "ruleDescriptor", "", "errorResource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRuleDescriptor", "()Ljava/lang/String;", "getErrorResource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputPenaltyData {
    public static final int $stable = 0;
    private final String component1;
    private final String copydefault;

    public InputPenaltyData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        this.copydefault = str2;
    }

    public InputPenaltyData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }

    public final String getErrorResource() {
        return this.copydefault;
    }

    public final String getRuleDescriptor() {
        return this.component1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputPenaltyData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static InputPenaltyData copy$default(InputPenaltyData inputPenaltyData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputPenaltyData.component1;
        }
        if ((i & 2) != 0) {
            str2 = inputPenaltyData.copydefault;
        }
        return inputPenaltyData.copy(str, str2);
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final InputPenaltyData copy(String ruleDescriptor, String errorResource) {
        Intrinsics.checkNotNullParameter(ruleDescriptor, "");
        return new InputPenaltyData(ruleDescriptor, errorResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputPenaltyData)) {
            return false;
        }
        InputPenaltyData inputPenaltyData = (InputPenaltyData) other;
        return Intrinsics.areEqual(this.component1, inputPenaltyData.component1) && Intrinsics.areEqual(this.copydefault, inputPenaltyData.copydefault);
    }

    public int hashCode() {
        int iHashCode = this.component1.hashCode();
        String str = this.copydefault;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InputPenaltyData(ruleDescriptor=" + this.component1 + ", errorResource=" + this.copydefault + ')';
    }
}
