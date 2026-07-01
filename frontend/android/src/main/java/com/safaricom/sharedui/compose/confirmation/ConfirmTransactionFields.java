package com.safaricom.sharedui.compose.confirmation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionFields;", "", "title", "", "description", "additionalInfo", "isAdditionalInfoError", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAdditionalInfo", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmTransactionFields {
    public static final int $stable = 0;
    private final boolean ShareDataUIState;
    private final String component1;
    private final String component3;
    private final String copydefault;

    public ConfirmTransactionFields(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.component1 = str;
        this.copydefault = str2;
        this.component3 = str3;
        this.ShareDataUIState = z;
    }

    public ConfirmTransactionFields(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }

    public final String getTitle() {
        return this.component1;
    }

    public final String getDescription() {
        return this.copydefault;
    }

    public final String getAdditionalInfo() {
        return this.component3;
    }

    public final boolean isAdditionalInfoError() {
        return this.ShareDataUIState;
    }

    public ConfirmTransactionFields() {
        this(null, null, null, false, 15, null);
    }

    public static ConfirmTransactionFields copy$default(ConfirmTransactionFields confirmTransactionFields, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmTransactionFields.component1;
        }
        if ((i & 2) != 0) {
            str2 = confirmTransactionFields.copydefault;
        }
        if ((i & 4) != 0) {
            str3 = confirmTransactionFields.component3;
        }
        if ((i & 8) != 0) {
            z = confirmTransactionFields.ShareDataUIState;
        }
        return confirmTransactionFields.copy(str, str2, str3, z);
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final boolean getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final ConfirmTransactionFields copy(String title, String description, String additionalInfo, boolean isAdditionalInfoError) {
        Intrinsics.checkNotNullParameter(additionalInfo, "");
        return new ConfirmTransactionFields(title, description, additionalInfo, isAdditionalInfoError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTransactionFields)) {
            return false;
        }
        ConfirmTransactionFields confirmTransactionFields = (ConfirmTransactionFields) other;
        return Intrinsics.areEqual(this.component1, confirmTransactionFields.component1) && Intrinsics.areEqual(this.copydefault, confirmTransactionFields.copydefault) && Intrinsics.areEqual(this.component3, confirmTransactionFields.component3) && this.ShareDataUIState == confirmTransactionFields.ShareDataUIState;
    }

    public int hashCode() {
        String str = this.component1;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.component3.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState);
    }

    public String toString() {
        return "ConfirmTransactionFields(title=" + this.component1 + ", description=" + this.copydefault + ", additionalInfo=" + this.component3 + ", isAdditionalInfoError=" + this.ShareDataUIState + ')';
    }
}
