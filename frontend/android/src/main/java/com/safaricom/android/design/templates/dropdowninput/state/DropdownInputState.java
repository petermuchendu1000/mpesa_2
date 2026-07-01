package com.safaricom.android.design.templates.dropdowninput.state;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.safaricom.android.design.templates.commons.model.InputErrorData;
import com.safaricom.android.design.templates.dropdowninput.model.DropdownItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BW\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eHÆ\u0003Jd\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006+"}, d2 = {"Lcom/safaricom/android/design/templates/dropdowninput/state/DropdownInputState;", "T", "Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "", "selectedItem", "hintText", "", "isValid", "", GriverMonitorConstants.KEY_IS_LOADING, "isEditable", "errorData", "Lcom/safaricom/android/design/templates/commons/model/InputErrorData;", "options", "Lkotlinx/collections/immutable/ImmutableList;", "<init>", "(Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;Ljava/lang/String;ZZZLcom/safaricom/android/design/templates/commons/model/InputErrorData;Lkotlinx/collections/immutable/ImmutableList;)V", "getSelectedItem", "()Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "getHintText", "()Ljava/lang/String;", "()Z", "getErrorData", "()Lcom/safaricom/android/design/templates/commons/model/InputErrorData;", "getOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "canSubmit", "getCanSubmit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;Ljava/lang/String;ZZZLcom/safaricom/android/design/templates/commons/model/InputErrorData;Lkotlinx/collections/immutable/ImmutableList;)Lcom/safaricom/android/design/templates/dropdowninput/state/DropdownInputState;", "equals", "other", "hashCode", "", "toString", "ConsumerSfcDropdownInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DropdownInputState<T extends DropdownItem> {
    public static final int $stable = 0;
    private final boolean ShareDataUIState;
    private final InputErrorData component1;
    private final String component2;
    private final boolean component3;
    private final boolean copydefault;
    private final T getAsAtTimestamp;
    private final ImmutableList<T> getRequestBeneficiariesState;

    /* JADX WARN: Multi-variable type inference failed */
    public DropdownInputState(T t, String str, boolean z, boolean z2, boolean z3, InputErrorData inputErrorData, ImmutableList<? extends T> immutableList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(immutableList, "");
        this.getAsAtTimestamp = t;
        this.component2 = str;
        this.component3 = z;
        this.ShareDataUIState = z2;
        this.copydefault = z3;
        this.component1 = inputErrorData;
        this.getRequestBeneficiariesState = immutableList;
    }

    public final T getSelectedItem() {
        return this.getAsAtTimestamp;
    }

    public DropdownInputState(DropdownItem dropdownItem, String str, boolean z, boolean z2, boolean z3, InputErrorData inputErrorData, PersistentList persistentList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dropdownItem, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3, (i & 32) == 0 ? inputErrorData : null, (i & 64) != 0 ? ExtensionsKt.persistentListOf() : persistentList);
    }

    public final String getHintText() {
        return this.component2;
    }

    public final boolean isValid() {
        return this.component3;
    }

    public final boolean isLoading() {
        return this.ShareDataUIState;
    }

    public final boolean isEditable() {
        return this.copydefault;
    }

    public final InputErrorData getErrorData() {
        return this.component1;
    }

    public final ImmutableList<T> getOptions() {
        return this.getRequestBeneficiariesState;
    }

    public final boolean getCanSubmit() {
        return this.component3 && !this.ShareDataUIState;
    }

    public DropdownInputState() {
        this(null, null, false, false, false, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DropdownInputState copy$default(DropdownInputState dropdownInputState, DropdownItem dropdownItem, String str, boolean z, boolean z2, boolean z3, InputErrorData inputErrorData, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            dropdownItem = dropdownInputState.getAsAtTimestamp;
        }
        if ((i & 2) != 0) {
            str = dropdownInputState.component2;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = dropdownInputState.component3;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = dropdownInputState.ShareDataUIState;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = dropdownInputState.copydefault;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            inputErrorData = dropdownInputState.component1;
        }
        InputErrorData inputErrorData2 = inputErrorData;
        if ((i & 64) != 0) {
            immutableList = dropdownInputState.getRequestBeneficiariesState;
        }
        return dropdownInputState.copy(dropdownItem, str2, z4, z5, z6, inputErrorData2, immutableList);
    }

    public final T component1() {
        return this.getAsAtTimestamp;
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final boolean getComponent3() {
        return this.component3;
    }

    public final boolean getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final boolean getCopydefault() {
        return this.copydefault;
    }

    public final InputErrorData getComponent1() {
        return this.component1;
    }

    public final ImmutableList<T> component7() {
        return this.getRequestBeneficiariesState;
    }

    public final DropdownInputState<T> copy(T selectedItem, String hintText, boolean isValid, boolean isLoading, boolean isEditable, InputErrorData errorData, ImmutableList<? extends T> options) {
        Intrinsics.checkNotNullParameter(hintText, "");
        Intrinsics.checkNotNullParameter(options, "");
        return new DropdownInputState<>(selectedItem, hintText, isValid, isLoading, isEditable, errorData, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownInputState)) {
            return false;
        }
        DropdownInputState dropdownInputState = (DropdownInputState) other;
        return Intrinsics.areEqual(this.getAsAtTimestamp, dropdownInputState.getAsAtTimestamp) && Intrinsics.areEqual(this.component2, dropdownInputState.component2) && this.component3 == dropdownInputState.component3 && this.ShareDataUIState == dropdownInputState.ShareDataUIState && this.copydefault == dropdownInputState.copydefault && Intrinsics.areEqual(this.component1, dropdownInputState.component1) && Intrinsics.areEqual(this.getRequestBeneficiariesState, dropdownInputState.getRequestBeneficiariesState);
    }

    public int hashCode() {
        T t = this.getAsAtTimestamp;
        int iHashCode = t == null ? 0 : t.hashCode();
        int iHashCode2 = this.component2.hashCode();
        int iHashCode3 = Boolean.hashCode(this.component3);
        int iHashCode4 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode5 = Boolean.hashCode(this.copydefault);
        InputErrorData inputErrorData = this.component1;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (inputErrorData != null ? inputErrorData.hashCode() : 0)) * 31) + this.getRequestBeneficiariesState.hashCode();
    }

    public String toString() {
        return "DropdownInputState(selectedItem=" + this.getAsAtTimestamp + ", hintText=" + this.component2 + ", isValid=" + this.component3 + ", isLoading=" + this.ShareDataUIState + ", isEditable=" + this.copydefault + ", errorData=" + this.component1 + ", options=" + this.getRequestBeneficiariesState + ')';
    }
}
