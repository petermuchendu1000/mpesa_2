package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcManyAmountInputView;", "Lcom/huawei/common/widget/input/CommonInputView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcManyAmountInputView extends CommonInputView {
    private static int component1 = 1;
    private static int component3;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcManyAmountInputView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcManyAmountInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcManyAmountInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcManyAmountInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        init();
    }

    private final void init() {
        int i = 2 % 2;
        getEditText().setInputType(8194);
        getEditText().setFilters(new InputFilter[]{new MoovAmountInputFilter(), new InputFilter.LengthFilter(AppConfigManager.getAppConfig().getAmountLen())});
        getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                String strValueOf = String.valueOf(s);
                if (strValueOf.length() == 1 && StringsKt.startsWith$default(strValueOf, "0", false, 2, (Object) null)) {
                    Intrinsics.checkNotNull(s);
                    s.delete(0, 1);
                }
                if (strValueOf.length() == 2) {
                    int i3 = ShareDataUIState + 101;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (Intrinsics.areEqual(strValueOf, "0.")) {
                        int i5 = ShareDataUIState + 83;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.checkNotNull(s);
                        if (i6 != 0) {
                            s.delete(1, 2);
                        } else {
                            s.delete(0, 2);
                        }
                    }
                }
            }
        });
        int i2 = component3 + 87;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
