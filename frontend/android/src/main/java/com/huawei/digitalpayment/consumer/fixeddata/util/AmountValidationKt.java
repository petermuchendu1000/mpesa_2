package com.huawei.digitalpayment.consumer.fixeddata.util;

import com.huawei.digitalpayment.consumer.fixeddata.util.AmountValidation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"validateTopUpAmount", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation;", "input", "", "ConsumerSfcFixedData_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AmountValidationKt {
    private static int ShareDataUIState = 1;
    private static int component1;

    public static final AmountValidation validateTopUpAmount(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            StringsKt.isBlank(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        if (StringsKt.isBlank(str2)) {
            return AmountValidation.Empty.INSTANCE;
        }
        Long longOrNull = StringsKt.toLongOrNull(StringsKt.trim(str2).toString());
        if (longOrNull != null) {
            int i3 = component1 + 87;
            ShareDataUIState = i3 % 128;
            return (i3 % 2 != 0 ? longOrNull.longValue() > 0 : longOrNull.longValue() > 1) ? AmountValidation.Valid.INSTANCE : AmountValidation.NotPositive.INSTANCE;
        }
        AmountValidation.NotWholeNumber notWholeNumber = AmountValidation.NotWholeNumber.INSTANCE;
        int i4 = ShareDataUIState + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return notWholeNumber;
    }
}
