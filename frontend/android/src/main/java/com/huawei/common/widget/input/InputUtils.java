package com.huawei.common.widget.input;

import android.text.InputFilter;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tJ-\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u000b\"\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u000b\"\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\nJ \u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¨\u0006\u0012"}, d2 = {"Lcom/huawei/common/widget/input/InputUtils;", "", "<init>", "()V", "setInputFilters", "", "editText", "Landroid/widget/EditText;", "inputFilters", "", "Landroid/text/InputFilter;", "", "(Landroid/widget/EditText;[Landroid/text/InputFilter;)V", "appendInputFilters", "removeInputFilters", "inputFilter", "contains", "", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputUtils {
    public static final InputUtils INSTANCE = new InputUtils();

    private InputUtils() {
    }

    public final void setInputFilters(EditText editText, List<? extends InputFilter> inputFilters) {
        Intrinsics.checkNotNullParameter(inputFilters, "");
        if (editText == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (InputFilter inputFilter : inputFilters) {
            if (inputFilter != null) {
                arrayList.add(inputFilter);
            }
        }
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }

    public final void setInputFilters(EditText editText, InputFilter... inputFilters) {
        Intrinsics.checkNotNullParameter(inputFilters, "");
        setInputFilters(editText, ArraysKt.toList(inputFilters));
    }

    public final void appendInputFilters(EditText editText, InputFilter... inputFilters) {
        Intrinsics.checkNotNullParameter(inputFilters, "");
        appendInputFilters(editText, ArraysKt.toList(inputFilters));
    }

    public final void removeInputFilters(EditText editText, InputFilter inputFilter) {
        Intrinsics.checkNotNullParameter(inputFilter, "");
        if (editText == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ArrayIteratorKt.iterator(editText.getFilters());
        while (it.hasNext()) {
            InputFilter inputFilter2 = (InputFilter) it.next();
            if (!Intrinsics.areEqual(inputFilter.getClass(), inputFilter2.getClass())) {
                arrayList.add(inputFilter2);
            }
        }
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }

    public final void appendInputFilters(EditText editText, List<? extends InputFilter> inputFilters) {
        Intrinsics.checkNotNullParameter(inputFilters, "");
        if (editText == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ArrayIteratorKt.iterator(editText.getFilters());
        while (it.hasNext()) {
            InputFilter inputFilter = (InputFilter) it.next();
            Intrinsics.checkNotNull(inputFilter);
            if (!copydefault(inputFilter, inputFilters)) {
                arrayList.add(inputFilter);
            }
        }
        for (InputFilter inputFilter2 : inputFilters) {
            if (inputFilter2 != null) {
                arrayList.add(inputFilter2);
            }
        }
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }

    private final boolean copydefault(InputFilter inputFilter, List<? extends InputFilter> list) {
        Iterator<? extends InputFilter> it = list.iterator();
        while (it.hasNext()) {
            InputFilter next = it.next();
            if (Intrinsics.areEqual(inputFilter.getClass(), next != null ? next.getClass() : null)) {
                return true;
            }
        }
        return false;
    }
}
