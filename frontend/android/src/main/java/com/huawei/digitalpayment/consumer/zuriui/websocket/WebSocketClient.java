package com.huawei.digitalpayment.consumer.zuriui.websocket;

import androidx.work.WorkRequest;
import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientKt;
import io.ktor.client.engine.cio.CIO;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.websocket.DefaultClientWebSocketSession;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.serialization.kotlinx.KotlinxWebsocketSerializationConverter;
import io.ktor.websocket.Frame;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketClient;", "", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/Json;)V", "client", "Lio/ktor/client/HttpClient;", "session", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "eventChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "messageChannel", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "messages", "getMessages", DataflowMonitorModel.METHOD_NAME_CONNECTION, "", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "payload", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;", "(Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TraceDebugManager.IdeCommand.DISCONNECT, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "", DataflowMonitorModel.METHOD_NAME_CLOSE, "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketClient {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int toString = 1;
    private final Channel<Message> ShareDataUIState;
    private final Json component1;
    private final Flow<WebSocketEvent> component2;
    private final Channel<WebSocketEvent> component3;
    private DefaultClientWebSocketSession copy;
    private final HttpClient copydefault;
    private final Flow<Message> getAsAtTimestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient", f = "WebSocketClient.kt", i = {0, 1}, l = {51, 77}, m = DataflowMonitorModel.METHOD_NAME_CONNECTION, n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class component1 extends ContinuationImpl {
        private static int component1 = 0;
        private static int equals = 1;
        int ShareDataUIState;
        Object component2;
        Object copydefault;

        component1(Continuation<? super component1> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            equals = i2 % 128;
            int i3 = i2 % 2;
            this.component2 = obj;
            this.ShareDataUIState |= Integer.MIN_VALUE;
            Object objConnect = WebSocketClient.this.connect(null, this);
            int i4 = component1 + 5;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objConnect;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient", f = "WebSocketClient.kt", i = {0}, l = {88, 90}, m = TraceDebugManager.IdeCommand.DISCONNECT, n = {"this"}, s = {"L$0"})
    static final class component3 extends ContinuationImpl {
        private static int copy = 1;
        private static int copydefault;
        Object component1;
        Object component2;
        int component3;

        component3(Continuation<? super component3> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            copy = i2 % 128;
            int i3 = i2 % 2;
            this.component1 = obj;
            this.component3 |= Integer.MIN_VALUE;
            WebSocketClient webSocketClient = WebSocketClient.this;
            component3 component3Var = this;
            if (i3 != 0) {
                return webSocketClient.disconnect(component3Var);
            }
            webSocketClient.disconnect(component3Var);
            throw null;
        }
    }

    @Inject
    public WebSocketClient(Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        this.component1 = json;
        this.copydefault = HttpClientKt.HttpClient(CIO.INSTANCE, new Function1() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    WebSocketClient.$r8$lambda$Eub3TS3SyhRHURoHgkNMG9ltGhI(this.f$0, (HttpClientConfig) obj);
                    throw null;
                }
                Unit unit$r8$lambda$Eub3TS3SyhRHURoHgkNMG9ltGhI = WebSocketClient.$r8$lambda$Eub3TS3SyhRHURoHgkNMG9ltGhI(this.f$0, (HttpClientConfig) obj);
                int i3 = component3 + 47;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return unit$r8$lambda$Eub3TS3SyhRHURoHgkNMG9ltGhI;
            }
        });
        Channel<WebSocketEvent> channelChannel$default = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.component3 = channelChannel$default;
        Channel<Message> channelChannel$default2 = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.ShareDataUIState = channelChannel$default2;
        this.component2 = FlowKt.receiveAsFlow(channelChannel$default);
        this.getAsAtTimestamp = FlowKt.receiveAsFlow(channelChannel$default2);
    }

    public static final Channel access$getEventChannel$p(WebSocketClient webSocketClient) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 37;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Channel<WebSocketEvent> channel = webSocketClient.component3;
        int i5 = i2 + 53;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return channel;
    }

    public static final Json access$getJson$p(WebSocketClient webSocketClient) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Json json = webSocketClient.component1;
        int i5 = i3 + 117;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return json;
    }

    public static final Channel access$getMessageChannel$p(WebSocketClient webSocketClient) {
        int i = 2 % 2;
        int i2 = component4 + 23;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Channel<Message> channel = webSocketClient.ShareDataUIState;
        int i5 = i3 + 63;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return channel;
        }
        throw null;
    }

    public static final void access$setSession$p(WebSocketClient webSocketClient, DefaultClientWebSocketSession defaultClientWebSocketSession) {
        int i = 2 % 2;
        int i2 = component4 + 15;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        webSocketClient.copy = defaultClientWebSocketSession;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit component2(WebSocketClient webSocketClient, WebSockets.Config config) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webSocketClient, "");
        Intrinsics.checkNotNullParameter(config, "");
        config.setPingIntervalMillis(0L);
        config.setMaxFrameSize(Long.MAX_VALUE);
        config.setContentConverter(new KotlinxWebsocketSerializationConverter(webSocketClient.component1));
        Unit unit = Unit.INSTANCE;
        int i2 = getRequestBeneficiariesState + 107;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit component3(HttpTimeoutConfig httpTimeoutConfig) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(httpTimeoutConfig, "");
            Long lValueOf = Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            httpTimeoutConfig.setRequestTimeoutMillis(lValueOf);
            httpTimeoutConfig.setConnectTimeoutMillis(15000L);
            httpTimeoutConfig.setSocketTimeoutMillis(lValueOf);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(httpTimeoutConfig, "");
        Long lValueOf2 = Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        httpTimeoutConfig.setRequestTimeoutMillis(lValueOf2);
        httpTimeoutConfig.setConnectTimeoutMillis(15000L);
        httpTimeoutConfig.setSocketTimeoutMillis(lValueOf2);
        int i3 = 94 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit component2(final WebSocketClient webSocketClient, HttpClientConfig httpClientConfig) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webSocketClient, "");
        Intrinsics.checkNotNullParameter(httpClientConfig, "");
        httpClientConfig.install(WebSockets.INSTANCE, new Function1() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM12192$r8$lambda$MaXAYr80jKbmERklTAKChOuZ9g = WebSocketClient.m12192$r8$lambda$MaXAYr80jKbmERklTAKChOuZ9g(this.f$0, (WebSockets.Config) obj);
                int i5 = component2 + 45;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return unitM12192$r8$lambda$MaXAYr80jKbmERklTAKChOuZ9g;
            }
        });
        httpClientConfig.install(HttpTimeoutKt.getHttpTimeout(), new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 119;
                component1 = i3 % 128;
                Object obj2 = null;
                HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) obj;
                if (i3 % 2 != 0) {
                    WebSocketClient.$r8$lambda$zBNefQCHLo5za0dl3WNjmmVJrUk(httpTimeoutConfig);
                    throw null;
                }
                Unit unit$r8$lambda$zBNefQCHLo5za0dl3WNjmmVJrUk = WebSocketClient.$r8$lambda$zBNefQCHLo5za0dl3WNjmmVJrUk(httpTimeoutConfig);
                int i4 = component1 + 55;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit$r8$lambda$zBNefQCHLo5za0dl3WNjmmVJrUk;
                }
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = component4 + 113;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return unit;
    }

    public final Flow<WebSocketEvent> getEvents() {
        int i = 2 % 2;
        int i2 = component4 + 77;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Flow<WebSocketEvent> flow = this.component2;
        int i4 = i3 + 123;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return flow;
        }
        obj.hashCode();
        throw null;
    }

    public final Flow<Message> getMessages() {
        Flow<Message> flow;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 9;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            flow = this.getAsAtTimestamp;
            int i4 = 74 / 0;
        } else {
            flow = this.getAsAtTimestamp;
        }
        int i5 = i2 + 113;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return flow;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$connect$2", f = "WebSocketClient.kt", i = {0, 2, 2, 3}, l = {53, 55, 62, 63, 69}, m = "invokeSuspend", n = {"$this$webSocket", "text", "message", "text"}, s = {"L$0", "L$1", "L$2", "L$1"})
    static final class component2 extends SuspendLambda implements Function2<DefaultClientWebSocketSession, Continuation<? super Unit>, Object> {
        private static int getAsAtTimestamp = 1;
        private static int getRequestBeneficiariesState;
        int ShareDataUIState;
        private Object component1;
        Object component2;
        Object copydefault;

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0130 -> B:29:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0142 -> B:56:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0160 -> B:56:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:56:0x015b). Please report as a decompilation issue!!! */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = WebSocketClient.this.new component2(continuation);
            component2Var.component1 = obj;
            component2 component2Var2 = component2Var;
            int i2 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return component2Var2;
        }

        public final Object component1(DefaultClientWebSocketSession defaultClientWebSocketSession, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 25;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(defaultClientWebSocketSession, continuation);
            if (i3 != 0) {
                return component2Var.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 36 / 0;
            return component2Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override
        public Object invoke(DefaultClientWebSocketSession defaultClientWebSocketSession, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 109;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(defaultClientWebSocketSession, continuation);
            int i4 = getRequestBeneficiariesState + 39;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return objComponent1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connect(java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r13 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component1
            if (r1 == 0) goto L20
            int r1 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4 = r2
            int r1 = r1 % r0
            r1 = r13
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component1 r1 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component1) r1
            int r2 = r1.ShareDataUIState
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L20
            int r13 = r1.ShareDataUIState
            int r13 = r13 + r3
            r1.ShareDataUIState = r13
            goto L25
        L20:
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component1 r1 = new com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component1
            r1.<init>(r13)
        L25:
            java.lang.Object r13 = r1.component2
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.ShareDataUIState
            r10 = 0
            r3 = 1
            if (r2 == 0) goto L4f
            if (r2 == r3) goto L45
            if (r2 != r0) goto L3d
            java.lang.Object r12 = r1.copydefault
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient r12 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto La2
        L3d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L45:
            java.lang.Object r12 = r1.copydefault
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient r12 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient) r12
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L4d
            goto Lad
        L4d:
            r13 = move-exception
            goto L7e
        L4f:
            kotlin.ResultKt.throwOnFailure(r13)
            io.ktor.client.HttpClient r2 = r11.copydefault     // Catch: java.lang.Exception -> L7b
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component2 r13 = new com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component2     // Catch: java.lang.Exception -> L7b
            r13.<init>(r10)     // Catch: java.lang.Exception -> L7b
            r5 = r13
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Exception -> L7b
            r1.copydefault = r11     // Catch: java.lang.Exception -> L7b
            r1.ShareDataUIState = r3     // Catch: java.lang.Exception -> L7b
            r4 = 0
            r7 = 2
            r8 = 0
            r3 = r12
            r6 = r1
            java.lang.Object r12 = io.ktor.client.plugins.websocket.BuildersKt.webSocket$default(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7b
            if (r12 != r9) goto Lad
            int r12 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState
            int r12 = r12 + 61
            int r13 = r12 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4 = r13
            int r12 = r12 % r0
            if (r12 == 0) goto L7a
            r12 = 14
            int r12 = r12 / 0
        L7a:
            return r9
        L7b:
            r12 = move-exception
            r13 = r12
            r12 = r11
        L7e:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.String r2 = "WebSocketClient"
            java.lang.String r3 = "Error connecting to WebSocket"
            android.util.Log.e(r2, r3, r13)
            kotlinx.coroutines.channels.Channel<com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent> r2 = r12.component3
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent$OnConnectionFailed r3 = new com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent$OnConnectionFailed
            r3.<init>(r13)
            r1.copydefault = r12
            r1.ShareDataUIState = r0
            java.lang.Object r13 = r2.send(r3, r1)
            if (r13 != r9) goto La2
            int r12 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState
            int r12 = r12 + 107
            int r13 = r12 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4 = r13
            int r12 = r12 % r0
            return r9
        La2:
            r12.copy = r10
            int r12 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4
            int r12 = r12 + 79
            int r13 = r12 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState = r13
            int r12 = r12 % r0
        Lad:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.connect(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object sendMessage(MessagePayload messagePayload, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component4 + 103;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Json json = this.component1;
            json.getComponent3();
            String strEncodeToString = json.encodeToString(MessagePayload.INSTANCE.serializer(), messagePayload);
            DefaultClientWebSocketSession defaultClientWebSocketSession = this.copy;
            if (defaultClientWebSocketSession == null) {
                return Unit.INSTANCE;
            }
            Object objSend = defaultClientWebSocketSession.send(new Frame.Text(strEncodeToString), continuation);
            if (objSend != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return Unit.INSTANCE;
            }
            int i3 = component4 + 23;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return objSend;
        }
        Json json2 = this.component1;
        json2.getComponent3();
        json2.encodeToString(MessagePayload.INSTANCE.serializer(), messagePayload);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disconnect(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component3
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto La
            goto L1a
        La:
            r1 = r8
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component3 r1 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component3) r1
            int r3 = r1.component3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            int r8 = r1.component3
            int r8 = r8 + r4
            r1.component3 = r8
            goto L1f
        L1a:
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component3 r1 = new com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient$component3
            r1.<init>(r8)
        L1f:
            java.lang.Object r8 = r1.component1
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.component3
            if (r4 == 0) goto L41
            if (r4 == r2) goto L39
            if (r4 != r0) goto L31
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r1.component2
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient r2 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6e
        L41:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.plugins.websocket.DefaultClientWebSocketSession r8 = r7.copy
            if (r8 == 0) goto L6d
            io.ktor.websocket.WebSocketSession r8 = (io.ktor.websocket.WebSocketSession) r8
            io.ktor.websocket.CloseReason r4 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r5 = io.ktor.websocket.CloseReason.Codes.NORMAL
            java.lang.String r6 = "Client disconnecting"
            r4.<init>(r5, r6)
            r1.component2 = r7
            r1.component3 = r2
            java.lang.Object r8 = io.ktor.websocket.WebSocketSessionKt.close(r8, r4, r1)
            if (r8 != r3) goto L6d
            int r8 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4
            int r8 = r8 + 31
            int r1 = r8 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L6c
            r8 = 82
            int r8 = r8 / 0
        L6c:
            return r3
        L6d:
            r2 = r7
        L6e:
            r8 = 0
            r2.copy = r8
            kotlinx.coroutines.channels.Channel<com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent> r2 = r2.component3
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent$OnConnectionClosed r4 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionClosed.INSTANCE
            r1.component2 = r8
            r1.component3 = r0
            java.lang.Object r1 = r2.send(r4, r1)
            if (r1 != r3) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L8b
            return r3
        L8b:
            r8.hashCode()
            throw r8
        L8f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            int r1 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.component4
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient.disconnect(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean isConnected() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 125;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        if (this.copy != null) {
            int i6 = i4 + 29;
            getRequestBeneficiariesState = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = i2 + 37;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final void close() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.close();
        int i4 = component4 + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Unit m12192$r8$lambda$MaXAYr80jKbmERklTAKChOuZ9g(WebSocketClient webSocketClient, WebSockets.Config config) {
        int i = 2 % 2;
        int i2 = component4 + 29;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = component2(webSocketClient, config);
        int i4 = getRequestBeneficiariesState + 63;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitComponent2;
        }
        throw null;
    }

    public static Unit $r8$lambda$Eub3TS3SyhRHURoHgkNMG9ltGhI(WebSocketClient webSocketClient, HttpClientConfig httpClientConfig) {
        int i = 2 % 2;
        int i2 = component4 + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = component2(webSocketClient, httpClientConfig);
        int i4 = component4 + 9;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return unitComponent2;
    }

    public static Unit $r8$lambda$zBNefQCHLo5za0dl3WNjmmVJrUk(HttpTimeoutConfig httpTimeoutConfig) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(httpTimeoutConfig);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return unitComponent3;
    }

    static {
        int i = 1 + 81;
        equals = i % 128;
        int i2 = i % 2;
    }
}
