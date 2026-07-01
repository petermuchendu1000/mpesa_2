package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"toLocal", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/BaseQuestionItem;", "pattern", "", "ConsumerLoginModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GetBaseQuestionRespKt {
    private static int component1 = 1;
    private static int copydefault;

    public static final LocalQuestionItem toLocal(BaseQuestionItem baseQuestionItem, String str) {
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseQuestionItem, "");
        String questionCode = baseQuestionItem.getQuestionCode();
        if (questionCode == null) {
            int i4 = copydefault + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str2 = "";
        } else {
            str2 = questionCode;
        }
        String questionName = baseQuestionItem.getQuestionName();
        String str4 = questionName == null ? "" : questionName;
        String type = baseQuestionItem.getType();
        if (type == null) {
            int i6 = component1 + 37;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 5;
            }
            str3 = "";
        } else {
            str3 = type;
        }
        return new LocalQuestionItem(str2, str4, str3, str, baseQuestionItem.getOrder(), null, 32, null);
    }
}
