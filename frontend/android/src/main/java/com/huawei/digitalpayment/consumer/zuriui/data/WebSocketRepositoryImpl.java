package com.huawei.digitalpayment.consumer.zuriui.data;

import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent;
import com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload;
import java.io.Closeable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00060\u0003j\u0002`\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/data/WebSocketRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/zuriui/data/WebSocketRepository;", "Lio/ktor/utils/io/core/Closeable;", "Ljava/io/Closeable;", "webSocketClient", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketClient;", "webSocketUrl", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketClient;Ljava/lang/String;)V", "observeWebSocketEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "observeIncomingMessages", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", DataflowMonitorModel.METHOD_NAME_CONNECTION, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TraceDebugManager.IdeCommand.DISCONNECT, "sendMessage", "payload", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;", "(Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "", DataflowMonitorModel.METHOD_NAME_CLOSE, "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketRepositoryImpl implements WebSocketRepository, Closeable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private final WebSocketClient component2;
    private final String component3;

    @Inject
    public WebSocketRepositoryImpl(WebSocketClient webSocketClient, String str) {
        Intrinsics.checkNotNullParameter(webSocketClient, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = webSocketClient;
        this.component3 = str;
    }

    public static final WebSocketClient access$getWebSocketClient$p(WebSocketRepositoryImpl webSocketRepositoryImpl) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        WebSocketClient webSocketClient = webSocketRepositoryImpl.component2;
        int i5 = i2 + 21;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return webSocketClient;
    }

    public static final String access$getWebSocketUrl$p(WebSocketRepositoryImpl webSocketRepositoryImpl) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = webSocketRepositoryImpl.component3;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public Flow<WebSocketEvent> observeWebSocketEvent() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Flow<WebSocketEvent> events = this.component2.getEvents();
        int i4 = ShareDataUIState + 35;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return events;
    }

    @Override
    public Flow<Message> observeIncomingMessages() {
        int i = 2 % 2;
        Flow<Message> flow = FlowKt.flow(new component3(null));
        int i2 = getAsAtTimestamp + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return flow;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepositoryImpl$observeIncomingMessages$1", f = "WebSocketRepositoryImpl.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<FlowCollector<? super Message>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        private Object component2;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component3;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.component2;
                this.component3 = 1;
                if (WebSocketRepositoryImpl.access$getWebSocketClient$p(WebSocketRepositoryImpl.this).getMessages().collect(new FlowCollector() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = copydefault + 67;
                        component2 = i6 % 128;
                        int i7 = i6 % 2;
                        Object objComponent1 = component1((Message) obj2, continuation);
                        if (i7 == 0) {
                            int i8 = 34 / 0;
                        }
                        int i9 = copydefault + 103;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        return objComponent1;
                    }

                    public final Object component1(Message message, Continuation<? super Unit> continuation) {
                        int i5 = 2 % 2;
                        int i6 = component2 + 105;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        Object objEmit = flowCollector.emit(message, continuation);
                        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i8 = component2 + 53;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        return objEmit;
                    }
                }, this) == coroutine_suspended) {
                    int i5 = ShareDataUIState + 1;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 63 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = copydefault + 123;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = WebSocketRepositoryImpl.this.new component3(continuation);
            component3Var.component2 = obj;
            component3 component3Var2 = component3Var;
            int i2 = copydefault + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
            return component3Var2;
        }

        @Override
        public Object invoke(FlowCollector<? super Message> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(flowCollector, continuation);
            int i4 = copydefault + 3;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(FlowCollector<? super Message> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(flowCollector, continuation);
            if (i3 == 0) {
                return component3Var.invokeSuspend(Unit.INSTANCE);
            }
            component3Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    @Override
    public Object connect(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object obj = null;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new copydefault(null), continuation);
        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i2 = ShareDataUIState + 83;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return objWithContext;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepositoryImpl$connect$2", f = "WebSocketRepositoryImpl.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 109;
                copydefault = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (WebSocketRepositoryImpl.access$getWebSocketClient$p(WebSocketRepositoryImpl.this).connect(WebSocketRepositoryImpl.access$getWebSocketUrl$p(WebSocketRepositoryImpl.this), this) == coroutine_suspended) {
                    int i4 = component3 + 85;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = WebSocketRepositoryImpl.this.new copydefault(continuation);
            int i2 = component3 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component3 + 75;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Override
    public Object disconnect(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new component2(null), continuation);
        if (objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = getAsAtTimestamp + 111;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return objWithContext;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ShareDataUIState + 115;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepositoryImpl$disconnect$2", f = "WebSocketRepositoryImpl.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int copydefault;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 41;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 != 0) {
                int i4 = component2 + 1;
                copydefault = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (WebSocketRepositoryImpl.access$getWebSocketClient$p(WebSocketRepositoryImpl.this).disconnect(this) == coroutine_suspended) {
                    int i5 = copydefault;
                    int i6 = i5 + 35;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 37;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = WebSocketRepositoryImpl.this.new component2(continuation);
            int i2 = component2 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 43;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component3(coroutineScope2, continuation2);
            }
            component3(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 3;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public Object sendMessage(MessagePayload messagePayload, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.sendMessage(messagePayload, continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            throw null;
        }
        Object objSendMessage = this.component2.sendMessage(messagePayload, continuation);
        if (objSendMessage != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i3 = getAsAtTimestamp + 83;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return objSendMessage;
    }

    @Override
    public boolean isConnected() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.isConnected();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsConnected = this.component2.isConnected();
        int i3 = getAsAtTimestamp + 95;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return zIsConnected;
    }

    @Override
    public void close() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.component2.close();
        int i4 = ShareDataUIState + 101;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = 1 + 91;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
