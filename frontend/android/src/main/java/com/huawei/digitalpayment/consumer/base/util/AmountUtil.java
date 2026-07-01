package com.huawei.digitalpayment.consumer.base.util;

import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/AmountUtil;", "", "<init>", "()V", "formatAmount", "", "amount", "formatAmountNoMil", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountUtil {
    public static final AmountUtil INSTANCE = new AmountUtil();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private AmountUtil() {
    }

    public final String formatAmount(String amount) {
        NumberFormat numberFormat;
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(amount, "");
            numberFormat = NumberFormat.getInstance(Locale.ROOT);
            numberFormat.setMaximumFractionDigits(5);
            numberFormat.setMinimumFractionDigits(2);
            numValueOf = Integer.valueOf(Integer.parseInt(amount));
        } else {
            Intrinsics.checkNotNullParameter(amount, "");
            numberFormat = NumberFormat.getInstance(Locale.ROOT);
            numberFormat.setMaximumFractionDigits(2);
            numberFormat.setMinimumFractionDigits(2);
            numValueOf = Integer.valueOf(Integer.parseInt(amount));
        }
        String str = numberFormat.format(numValueOf);
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final String formatAmountNoMil(String amount) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String strReplace$default = amount != null ? StringsKt.replace$default(amount, ConstantsKt.COMMA_SEPARATOR, "", false, 4, (Object) null) : null;
        if (strReplace$default != null) {
            return strReplace$default;
        }
        int i3 = ShareDataUIState + 55;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return "";
        }
        throw null;
    }

    static {
        int i = component3 + 51;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
