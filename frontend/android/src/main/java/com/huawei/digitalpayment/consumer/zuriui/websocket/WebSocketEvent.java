package com.huawei.digitalpayment.consumer.zuriui.websocket;

import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "", "<init>", "()V", "OnConnectionOpened", "OnMessageReceived", "OnConnectionFailed", "OnConnectionClosed", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnConnectionClosed;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnConnectionFailed;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnConnectionOpened;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnMessageReceived;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebSocketEvent {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnConnectionOpened;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "<init>", "()V", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnConnectionOpened extends WebSocketEvent {
        public static final int $stable = 0;
        public static final OnConnectionOpened INSTANCE = new OnConnectionOpened();
        private static int ShareDataUIState = 1;
        private static int component2;

        private OnConnectionOpened() {
            super(null);
        }

        static {
            int i = component2 + 107;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }

    private WebSocketEvent() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnMessageReceived;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "message", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "<init>", "(Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;)V", "getMessage", "()Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMessageReceived extends WebSocketEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final Message component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMessageReceived(Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "");
            this.component1 = message;
        }

        public final Message getMessage() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 23;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Message message = this.component1;
            int i4 = i2 + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return message;
        }

        static {
            int i = 1 + 41;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static OnMessageReceived copy$default(OnMessageReceived onMessageReceived, Message message, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 71;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                message = onMessageReceived.component1;
                if (i7 != 0) {
                    int i8 = 75 / 0;
                }
            }
            return onMessageReceived.copy(message);
        }

        public final Message component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 35;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Message message = this.component1;
            int i5 = i2 + 27;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return message;
        }

        public final OnMessageReceived copy(Message message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            OnMessageReceived onMessageReceived = new OnMessageReceived(message);
            int i2 = component2 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return onMessageReceived;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMessageReceived)) {
                int i2 = component2 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.component1, ((OnMessageReceived) other).component1)) {
                return false;
            }
            int i4 = copydefault + 29;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Message message = this.component1;
            if (i3 == 0) {
                return message.hashCode();
            }
            message.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnMessageReceived(message=" + this.component1 + ')';
            int i2 = copydefault + 15;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            return str;
        }
    }

    static {
        int i = 1 + 73;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnConnectionFailed;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnConnectionFailed extends WebSocketEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        private final Throwable component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnConnectionFailed(Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.component2 = th;
        }

        public final Throwable getError() {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component2;
            }
            throw null;
        }

        static {
            int i = 1 + 15;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static OnConnectionFailed copy$default(OnConnectionFailed onConnectionFailed, Throwable th, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 9;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                th = onConnectionFailed.component2;
            }
            OnConnectionFailed onConnectionFailedCopy = onConnectionFailed.copy(th);
            int i5 = copydefault + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return onConnectionFailedCopy;
        }

        public final Throwable component1() {
            int i = 2 % 2;
            int i2 = copydefault + 125;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OnConnectionFailed copy(Throwable error) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(error, "");
            OnConnectionFailed onConnectionFailed = new OnConnectionFailed(error);
            int i2 = copydefault + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return onConnectionFailed;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r1 = r1 + 37;
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.copydefault = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, ((com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed) r6).component2) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            r6 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.copydefault + 59;
            com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.ShareDataUIState = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.ShareDataUIState
                int r2 = r1 + 23
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.copydefault = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L16
                r2 = 85
                int r2 = r2 / r4
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r3
            L19:
                boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed
                if (r2 != 0) goto L25
                int r1 = r1 + 37
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.copydefault = r6
                int r1 = r1 % r0
                return r4
            L25:
                com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent$OnConnectionFailed r6 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed) r6
                java.lang.Throwable r1 = r5.component2
                java.lang.Throwable r6 = r6.component2
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                if (r6 != 0) goto L3b
                int r6 = com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.copydefault
                int r6 = r6 + 59
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.ShareDataUIState = r1
                int r6 = r6 % r0
                return r4
            L3b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = copydefault + 79;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnConnectionFailed(error=" + this.component2 + ')';
            int i2 = ShareDataUIState + 7;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public WebSocketEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent$OnConnectionClosed;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketEvent;", "<init>", "()V", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnConnectionClosed extends WebSocketEvent {
        public static final int $stable = 0;
        public static final OnConnectionClosed INSTANCE = new OnConnectionClosed();
        private static int component2 = 0;
        private static int copydefault = 1;

        private OnConnectionClosed() {
            super(null);
        }

        static {
            int i = copydefault + 9;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
