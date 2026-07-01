package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.baseui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcSpinnerInputView;", "Lcom/huawei/common/widget/input/CommonInputView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spinner", "Landroid/widget/Spinner;", "setupView", "", "getSpinner", "setAdapter", "adapter", "Landroid/widget/SpinnerAdapter;", "setOnItemSelectedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/widget/AdapterView$OnItemSelectedListener;", "getSelectedItem", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcSpinnerInputView extends CommonInputView {
    private static int component2 = 1;
    private static int copydefault;
    private Spinner spinner;

    /* JADX WARN: Illegal instructions before constructor call */
    public SfcSpinnerInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = copydefault + 73;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = copydefault + 3;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcSpinnerInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        RoundConstraintLayout.inflate(context, R.layout.sfc_spinner_input, this);
        this.spinner = (Spinner) findViewById(R.id.spinner_inner);
        setupView();
    }

    public final Spinner getSpinner() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Spinner spinner = this.spinner;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return spinner;
    }

    public final void setAdapter(SpinnerAdapter adapter) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adapter, "");
            this.spinner.setAdapter(adapter);
            int i3 = 51 / 0;
        } else {
            Intrinsics.checkNotNullParameter(adapter, "");
            this.spinner.setAdapter(adapter);
        }
        int i4 = copydefault + 47;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener listener) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listener, "");
        this.spinner.setOnItemSelectedListener(listener);
        int i4 = copydefault + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Object getSelectedItem() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object selectedItem = this.spinner.getSelectedItem();
        int i4 = component2 + 83;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return selectedItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcSpinnerInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcSpinnerInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void setupView() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }
}
