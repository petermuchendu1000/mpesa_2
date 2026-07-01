package com.huawei.digitalpayment.consumer.manageandviewdata.ui.limits.adapter;

import com.huawei.digitalpayment.consumer.manageandviewdata.resp.Limit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/limits/adapter/LimitClickListener;", "", "onSetLimitClicked", "", "limit", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/Limit;", "onDeleteLimitClicked", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LimitClickListener {
    void onDeleteLimitClicked(Limit limit);

    void onSetLimitClicked(Limit limit);
}
