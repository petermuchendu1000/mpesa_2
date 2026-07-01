package com.safaricom.android.design.templates.commons.alphanumericinput;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/safaricom/android/design/templates/commons/alphanumericinput/AlphanumericInputUiState;", "", "text", "", "isValid", "", "isNonEmpty", "hasError", "errorMessage", "<init>", "(Ljava/lang/String;ZZZLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "()Z", "getHasError", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlphanumericInputUiState {
    public static final int $stable = 0;
    private final boolean ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;
    private final boolean copydefault;

    public AlphanumericInputUiState(String str, boolean z, boolean z2, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        this.component1 = z;
        this.copydefault = z2;
        this.ShareDataUIState = z3;
        this.component3 = str2;
    }

    public AlphanumericInputUiState(String str, boolean z, boolean z2, boolean z3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? null : str2);
    }

    public final String getText() {
        return this.component2;
    }

    public final boolean isValid() {
        return this.component1;
    }

    public final boolean isNonEmpty() {
        return this.copydefault;
    }

    public final boolean getHasError() {
        return this.ShareDataUIState;
    }

    public final String getErrorMessage() {
        return this.component3;
    }

    public AlphanumericInputUiState() {
        this(null, false, false, false, null, 31, null);
    }

    public static AlphanumericInputUiState copy$default(AlphanumericInputUiState alphanumericInputUiState, String str, boolean z, boolean z2, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alphanumericInputUiState.component2;
        }
        if ((i & 2) != 0) {
            z = alphanumericInputUiState.component1;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = alphanumericInputUiState.copydefault;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = alphanumericInputUiState.ShareDataUIState;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            str2 = alphanumericInputUiState.component3;
        }
        return alphanumericInputUiState.copy(str, z4, z5, z6, str2);
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final boolean getComponent1() {
        return this.component1;
    }

    public final boolean getCopydefault() {
        return this.copydefault;
    }

    public final boolean getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final AlphanumericInputUiState copy(String text, boolean isValid, boolean isNonEmpty, boolean hasError, String errorMessage) {
        Intrinsics.checkNotNullParameter(text, "");
        return new AlphanumericInputUiState(text, isValid, isNonEmpty, hasError, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphanumericInputUiState)) {
            return false;
        }
        AlphanumericInputUiState alphanumericInputUiState = (AlphanumericInputUiState) other;
        return Intrinsics.areEqual(this.component2, alphanumericInputUiState.component2) && this.component1 == alphanumericInputUiState.component1 && this.copydefault == alphanumericInputUiState.copydefault && this.ShareDataUIState == alphanumericInputUiState.ShareDataUIState && Intrinsics.areEqual(this.component3, alphanumericInputUiState.component3);
    }

    public int hashCode() {
        int iHashCode = this.component2.hashCode();
        int iHashCode2 = Boolean.hashCode(this.component1);
        int iHashCode3 = Boolean.hashCode(this.copydefault);
        int iHashCode4 = Boolean.hashCode(this.ShareDataUIState);
        String str = this.component3;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AlphanumericInputUiState(text=" + this.component2 + ", isValid=" + this.component1 + ", isNonEmpty=" + this.copydefault + ", hasError=" + this.ShareDataUIState + ", errorMessage=" + this.component3 + ')';
    }
}
