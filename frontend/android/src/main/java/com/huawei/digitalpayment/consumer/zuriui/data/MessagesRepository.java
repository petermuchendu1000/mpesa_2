package com.huawei.digitalpayment.consumer.zuriui.data;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/data/MessagesRepository;", "", "getAllMessages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "saveMessage", "", "message", "(Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", GriverCacheDao.COLUMN_CACHE_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "messages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MessagesRepository {
    Object deleteMessage(String str, Continuation<? super Unit> continuation);

    Object deleteMessages(List<Message> list, Continuation<? super Unit> continuation);

    Flow<List<Message>> getAllMessages();

    Object saveMessage(Message message, Continuation<? super Unit> continuation);
}
