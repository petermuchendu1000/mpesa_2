package com.safaricom.android.design.templates.amountinput.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorLabel;", "", "label", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountErrorLabel {
    public static final int $stable = 0;
    private final String ShareDataUIState;
    private final String component3;

    public AmountErrorLabel(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
        this.ShareDataUIState = str2;
    }

    public AmountErrorLabel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getLabel() {
        return this.component3;
    }

    public final String getValue() {
        return this.ShareDataUIState;
    }

    public static AmountErrorLabel copy$default(AmountErrorLabel amountErrorLabel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amountErrorLabel.component3;
        }
        if ((i & 2) != 0) {
            str2 = amountErrorLabel.ShareDataUIState;
        }
        return amountErrorLabel.copy(str, str2);
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final AmountErrorLabel copy(String label, String value) {
        Intrinsics.checkNotNullParameter(label, "");
        return new AmountErrorLabel(label, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountErrorLabel)) {
            return false;
        }
        AmountErrorLabel amountErrorLabel = (AmountErrorLabel) other;
        return Intrinsics.areEqual(this.component3, amountErrorLabel.component3) && Intrinsics.areEqual(this.ShareDataUIState, amountErrorLabel.ShareDataUIState);
    }

    public int hashCode() {
        int iHashCode = this.component3.hashCode();
        String str = this.ShareDataUIState;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AmountErrorLabel(label=" + this.component3 + ", value=" + this.ShareDataUIState + ')';
    }
}
