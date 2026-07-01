package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.lifecycle.MutableLiveData;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated(message = "使用 INotificationService")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/INotificationUnReadService;", "", "getNotificationUnRead", "", "notificationIsUnRead", "Landroidx/lifecycle/MutableLiveData;", "", "refreshNotificationUnread", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface INotificationUnReadService {
    void getNotificationUnRead();

    MutableLiveData<Boolean> notificationIsUnRead();

    void refreshNotificationUnread();
}
