package com.huawei.digitalpayment.consumer.loginModule.register.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QuerySecurityQuestionParams;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/ISecurityVerificationModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/ActiveConsumerModel;", "queryList", "", "params", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/QuerySecurityQuestionParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ISecurityVerificationModel extends ActiveConsumerModel {
    void queryList(QuerySecurityQuestionParams params, ApiCallback<List<LocalQuestionItem>> callback);
}
