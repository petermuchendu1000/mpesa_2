package com.huawei.digitalpayment.consumer.baselib.util;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/util/AmountUtils;", "", "<init>", "()V", "formatAmount", "", "amount", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AmountUtils {
    public static final AmountUtils INSTANCE = new AmountUtils();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    private AmountUtils() {
    }

    public final String formatAmount(String amount) {
        int i = 2 % 2;
        if (amount != null) {
            int i2 = component1 + 107;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.startsWith$default(amount, "0", false, 2, (Object) null)) {
                int i4 = component2 + 61;
                component1 = i4 % 128;
                if (i4 % 2 == 0 ? amount.length() > 1 : amount.length() > 1) {
                    return StringsKt.removeRange(amount, 0, 1).toString();
                }
            }
            if (!StringsKt.endsWith$default(amount, ".", false, 2, (Object) null)) {
                return amount;
            }
            return amount + "0";
        }
        return "";
    }

    static {
        int i = ShareDataUIState + 9;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
