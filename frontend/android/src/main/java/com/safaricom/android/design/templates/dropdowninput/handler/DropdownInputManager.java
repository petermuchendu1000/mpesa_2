package com.safaricom.android.design.templates.dropdowninput.handler;

import com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel;
import com.safaricom.android.design.templates.dropdowninput.model.DropdownItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ!\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/safaricom/android/design/templates/dropdowninput/handler/DropdownInputManager;", "T", "Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "", "viewModel", "Lcom/safaricom/android/design/templates/dropdowninput/DropdownInputViewModel;", "startingSelection", "onSelectionChange", "Lkotlin/Function1;", "", "<init>", "(Lcom/safaricom/android/design/templates/dropdowninput/DropdownInputViewModel;Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;Lkotlin/jvm/functions/Function1;)V", "Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "onItemSelected", "newSelection", "(Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;)V", "clearSelection", "hasSelectionChanged", "", "previous", "current", "(Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;)Z", "ConsumerSfcDropdownInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DropdownInputManager<T extends DropdownItem> {
    public static final int $stable = 0;
    private final T ShareDataUIState;
    private final Function1<T, Unit> component1;
    private final DropdownInputViewModel<T> component3;

    /* JADX WARN: Multi-variable type inference failed */
    public DropdownInputManager(DropdownInputViewModel<T> dropdownInputViewModel, T t, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(dropdownInputViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.component3 = dropdownInputViewModel;
        this.ShareDataUIState = t;
        this.component1 = function1;
    }

    public final void onItemSelected(T newSelection) {
        Intrinsics.checkNotNullParameter(newSelection, "");
        if (component3(this.ShareDataUIState, newSelection)) {
            this.component3.selectItem(newSelection);
            this.component1.invoke(newSelection);
        }
    }

    public final void clearSelection() {
        this.component3.clearSelection();
    }

    private final boolean component3(T t, T t2) {
        return !Intrinsics.areEqual(t, t2);
    }
}
