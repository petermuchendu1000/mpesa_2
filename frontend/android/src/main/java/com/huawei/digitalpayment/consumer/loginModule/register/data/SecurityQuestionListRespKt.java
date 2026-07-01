package com.huawei.digitalpayment.consumer.loginModule.register.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"toLocal", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/SecurityQuestionItem;", "pattern", "", "ConsumerLoginModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SecurityQuestionListRespKt {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    public static final LocalQuestionItem toLocal(SecurityQuestionItem securityQuestionItem, String str) {
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(securityQuestionItem, "");
        String questionCode = securityQuestionItem.getQuestionCode();
        if (questionCode == null) {
            int i2 = ShareDataUIState + 111;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 22 / 0;
            }
            str2 = "";
        } else {
            str2 = questionCode;
        }
        String questionName = securityQuestionItem.getQuestionName();
        if (questionName == null) {
            int i4 = ShareDataUIState + 113;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str3 = "";
        } else {
            str3 = questionName;
        }
        String inputType = securityQuestionItem.getInputType();
        if (inputType == null) {
            int i6 = ShareDataUIState + 51;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str4 = "";
        } else {
            str4 = inputType;
        }
        return new LocalQuestionItem(str2, str3, str4, str, null, null, 48, null);
    }
}
