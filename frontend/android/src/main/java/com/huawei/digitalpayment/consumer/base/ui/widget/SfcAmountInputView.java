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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/SfcAmountInputView;", "Lcom/huawei/common/widget/input/CommonInputView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcAmountInputView extends CommonInputView {
    private static int component3 = 1;
    private static int copydefault;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcAmountInputView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcAmountInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SfcAmountInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcAmountInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        init();
    }

    private final void init() {
        int i = 2 % 2;
        getEditText().setInputType(8194);
        getEditText().setFilters(new InputFilter[]{new MoovAmountInputFilter(), new InputFilter.LengthFilter(AppConfigManager.getAppConfig().getAmountLen())});
        getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                if (String.valueOf(s).length() == 2) {
                    int i3 = component2 + 121;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (!(!StringsKt.startsWith$default(String.valueOf(s), "0", false, 2, (Object) null))) {
                        int i5 = component3 + 63;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        if (Intrinsics.areEqual(String.valueOf(s), "0.")) {
                            return;
                        }
                        Intrinsics.checkNotNull(s);
                        s.delete(0, 1);
                    }
                }
            }
        });
        int i2 = copydefault + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
