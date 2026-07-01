package com.safaricom.sharedui.compose.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.PersistentSet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/safaricom/sharedui/compose/contact/ContactPickerState;", "", "contacts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/safaricom/sharedui/compose/contact/ContactUiData;", "searchTerm", "", "selectedItems", "Lkotlinx/collections/immutable/ImmutableSet;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableSet;)V", "getContacts", "()Lkotlinx/collections/immutable/ImmutableList;", "getSearchTerm", "()Ljava/lang/String;", "getSelectedItems", "()Lkotlinx/collections/immutable/ImmutableSet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactPickerState {
    public static final int $stable = 0;
    private final ImmutableList<ContactUiData> ShareDataUIState;
    private final String component1;
    private final ImmutableSet<ContactUiData> component3;

    public ContactPickerState(ImmutableList<ContactUiData> immutableList, String str, ImmutableSet<ContactUiData> immutableSet) {
        Intrinsics.checkNotNullParameter(immutableList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(immutableSet, "");
        this.ShareDataUIState = immutableList;
        this.component1 = str;
        this.component3 = immutableSet;
    }

    public ContactPickerState(PersistentList persistentList, String str, PersistentSet persistentSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ExtensionsKt.persistentSetOf() : persistentSet);
    }

    public final ImmutableList<ContactUiData> getContacts() {
        return this.ShareDataUIState;
    }

    public final String getSearchTerm() {
        return this.component1;
    }

    public final ImmutableSet<ContactUiData> getSelectedItems() {
        return this.component3;
    }

    public ContactPickerState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContactPickerState copy$default(ContactPickerState contactPickerState, ImmutableList immutableList, String str, ImmutableSet immutableSet, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = contactPickerState.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str = contactPickerState.component1;
        }
        if ((i & 4) != 0) {
            immutableSet = contactPickerState.component3;
        }
        return contactPickerState.copy(immutableList, str, immutableSet);
    }

    public final ImmutableList<ContactUiData> component1() {
        return this.ShareDataUIState;
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final ImmutableSet<ContactUiData> component3() {
        return this.component3;
    }

    public final ContactPickerState copy(ImmutableList<ContactUiData> contacts, String searchTerm, ImmutableSet<ContactUiData> selectedItems) {
        Intrinsics.checkNotNullParameter(contacts, "");
        Intrinsics.checkNotNullParameter(searchTerm, "");
        Intrinsics.checkNotNullParameter(selectedItems, "");
        return new ContactPickerState(contacts, searchTerm, selectedItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactPickerState)) {
            return false;
        }
        ContactPickerState contactPickerState = (ContactPickerState) other;
        return Intrinsics.areEqual(this.ShareDataUIState, contactPickerState.ShareDataUIState) && Intrinsics.areEqual(this.component1, contactPickerState.component1) && Intrinsics.areEqual(this.component3, contactPickerState.component3);
    }

    public int hashCode() {
        return (((this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode();
    }

    public String toString() {
        return "ContactPickerState(contacts=" + this.ShareDataUIState + ", searchTerm=" + this.component1 + ", selectedItems=" + this.component3 + ')';
    }
}
