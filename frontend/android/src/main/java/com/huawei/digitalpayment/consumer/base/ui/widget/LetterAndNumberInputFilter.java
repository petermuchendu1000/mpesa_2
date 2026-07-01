package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/LetterAndNumberInputFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", "p1", "", "p2", "p3", "Landroid/text/Spanned;", "p4", "p5", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LetterAndNumberInputFilter implements InputFilter {
    private static int component1 = 1;
    private static int component3;

    @Override
    public CharSequence filter(CharSequence source, int p1, int p2, Spanned p3, int p4, int p5) {
        int i = 2 % 2;
        Object obj = null;
        if (!new Regex("[^a-zA-Z0-9]+").matches(String.valueOf(source))) {
            return null;
        }
        int i2 = component3;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return str;
    }
}
