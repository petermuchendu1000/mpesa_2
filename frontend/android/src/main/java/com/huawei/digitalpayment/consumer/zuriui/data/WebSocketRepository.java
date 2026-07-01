package com.huawei.digitalpayment.consumer.zuriui.data;

import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent;
import com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/data/WebSocketRepository;", "", "observeWebSocketEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "observeIncomingMessages", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", DataflowMonitorModel.METHOD_NAME_CONNECTION, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TraceDebugManager.IdeCommand.DISCONNECT, "sendMessage", "payload", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;", "(Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WebSocketRepository {
    Object connect(Continuation<? super Unit> continuation);

    Object disconnect(Continuation<? super Unit> continuation);

    boolean isConnected();

    Flow<Message> observeIncomingMessages();

    Flow<WebSocketEvent> observeWebSocketEvent();

    Object sendMessage(MessagePayload messagePayload, Continuation<? super Unit> continuation);
}
