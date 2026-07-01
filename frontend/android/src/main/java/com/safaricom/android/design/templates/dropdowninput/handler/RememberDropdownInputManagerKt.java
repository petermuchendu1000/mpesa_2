package com.safaricom.android.design.templates.dropdowninput.handler;

import androidx.compose.runtime.Composer;
import com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel;
import com.safaricom.android.design.templates.dropdowninput.model.DropdownItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"rememberDropdownInputManager", "Lcom/safaricom/android/design/templates/dropdowninput/handler/DropdownInputManager;", "T", "Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "viewModel", "Lcom/safaricom/android/design/templates/dropdowninput/DropdownInputViewModel;", "startingSelection", "onSelectionChange", "Lkotlin/Function1;", "", "(Lcom/safaricom/android/design/templates/dropdowninput/DropdownInputViewModel;Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/safaricom/android/design/templates/dropdowninput/handler/DropdownInputManager;", "ConsumerSfcDropdownInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberDropdownInputManagerKt {
    public static final <T extends DropdownItem> DropdownInputManager<T> rememberDropdownInputManager(DropdownInputViewModel<T> dropdownInputViewModel, T t, Function1<? super T, Unit> function1, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(dropdownInputViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        composer.startReplaceGroup(1792877247);
        composer.startReplaceGroup(480748621);
        boolean zChanged = composer.changed(dropdownInputViewModel);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(t)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if ((z | zChanged) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DropdownInputManager(dropdownInputViewModel, t, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        DropdownInputManager<T> dropdownInputManager = (DropdownInputManager) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return dropdownInputManager;
    }
}
