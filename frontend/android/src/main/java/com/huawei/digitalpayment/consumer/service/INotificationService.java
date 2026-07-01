package com.huawei.digitalpayment.consumer.service;

import androidx.lifecycle.LiveData;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u001e\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/INotificationService;", "", "unreadState", "Landroidx/lifecycle/LiveData;", "Lcom/huawei/digitalpayment/consumer/service/UnreadState;", "queryUnreadNum", "", "markMessageRead", GriverCacheDao.COLUMN_CACHE_ID, "", "setMessageRead", "type", "setMessagesRead", "idList", "", "isMessageRead", "", "reportMsgReadStatus", "isReadStatusCacheEmpty", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface INotificationService {
    boolean isMessageRead(String id);

    boolean isReadStatusCacheEmpty();

    void markMessageRead(String id);

    void queryUnreadNum();

    void reportMsgReadStatus();

    void setMessageRead(String id, String type);

    void setMessagesRead(List<String> idList, String type);

    LiveData<UnreadState> unreadState();
}
