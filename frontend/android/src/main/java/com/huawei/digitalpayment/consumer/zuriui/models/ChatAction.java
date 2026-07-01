package com.huawei.digitalpayment.consumer.zuriui.models;

import com.huawei.common.interceptor.AppLogInterceptor;
import com.huawei.digitalpayment.consumer.zuriui.state.ButtonUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", "", "ClearSelection", "DeleteSelectedMessages", "CopySelectedMessages", "SendMessage", "MessageClick", "MessageLongClick", "ButtonClick", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$ButtonClick;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$ClearSelection;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$CopySelectedMessages;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$DeleteSelectedMessages;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$MessageClick;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$MessageLongClick;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$SendMessage;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChatAction {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$ClearSelection;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearSelection implements ChatAction {
        public static final int $stable = 0;
        public static final ClearSelection INSTANCE = new ClearSelection();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 1;

        private ClearSelection() {
        }

        static {
            int i = ShareDataUIState + 43;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 7;
                copydefault = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(other instanceof ClearSelection)) {
                int i3 = copydefault + 57;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = component2 + 59;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 57;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return 1361145265;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 103;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 13;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return "ClearSelection";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$DeleteSelectedMessages;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteSelectedMessages implements ChatAction {
        public static final int $stable = 0;
        public static final DeleteSelectedMessages INSTANCE = new DeleteSelectedMessages();
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private DeleteSelectedMessages() {
        }

        static {
            int i = component3 + 1;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (other instanceof DeleteSelectedMessages) {
                    return true;
                }
                int i2 = ShareDataUIState + 101;
                copydefault = i2 % 128;
                return i2 % 2 != 0;
            }
            int i3 = ShareDataUIState;
            int i4 = i3 + 31;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 125;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 73;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 1691966148;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return "DeleteSelectedMessages";
            }
            int i3 = 5 / 0;
            return "DeleteSelectedMessages";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$CopySelectedMessages;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CopySelectedMessages implements ChatAction {
        public static final int $stable = 0;
        public static final CopySelectedMessages INSTANCE = new CopySelectedMessages();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;

        private CopySelectedMessages() {
        }

        static {
            int i = component3 + 43;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 29;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopySelectedMessages)) {
                int i4 = i3 + 67;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i3 + 21;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 1;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return -1558018802;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 119;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 77;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return "CopySelectedMessages";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$SendMessage;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendMessage implements ChatAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 65 % 128;
        private static int copydefault = 1;
        private final String component1;

        public SendMessage(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getText() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 91;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.component1;
            int i4 = i2 + 67;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static {
            int i = 65 % 2;
        }

        public static SendMessage copy$default(SendMessage sendMessage, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 77;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                int i5 = i4 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                str = sendMessage.component1;
            }
            return sendMessage.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 115;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component1;
            int i5 = i2 + 111;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 17 / 0;
            }
            return str;
        }

        public final SendMessage copy(String text) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(text, "");
            SendMessage sendMessage = new SendMessage(text);
            int i2 = copydefault + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return sendMessage;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendMessage)) {
                int i2 = component2 + 101;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component1, ((SendMessage) other).component1))) {
                return true;
            }
            int i4 = copydefault + 7;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = copydefault + 25;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SendMessage(text=" + this.component1 + ')';
            int i2 = component2 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$MessageClick;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MessageClick implements ChatAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        private final String copydefault;

        public MessageClick(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public final String getMessageId() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 121;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 3;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 21;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public static MessageClick copy$default(MessageClick messageClick, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 9;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 9;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    String str2 = messageClick.copydefault;
                    throw null;
                }
                str = messageClick.copydefault;
            }
            return messageClick.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 27;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.copydefault;
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return str;
        }

        public final MessageClick copy(String messageId) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(messageId, "");
            MessageClick messageClick = new MessageClick(messageId);
            int i2 = component2 + 51;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return messageClick;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 93;
            int i3 = i2 % 128;
            component1 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageClick)) {
                int i4 = i3 + 85;
                component2 = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.copydefault, ((MessageClick) other).copydefault)) {
                return false;
            }
            int i5 = component1 + 87;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = component2 + 27;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.copydefault.hashCode();
                int i3 = 19 / 0;
            } else {
                iHashCode = this.copydefault.hashCode();
            }
            int i4 = component2 + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MessageClick(messageId=" + this.copydefault + ')';
            int i2 = component2 + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$MessageLongClick;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MessageLongClick implements ChatAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 41 % 128;
        private static int component2 = 1;
        private static int copydefault;
        private final String component3;

        public MessageLongClick(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getMessageId() {
            int i = 2 % 2;
            int i2 = copydefault + 17;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.component3;
            int i4 = i3 + 19;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static {
            if (41 % 2 == 0) {
                int i = 59 / 0;
            }
        }

        public static MessageLongClick copy$default(MessageLongClick messageLongClick, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 31;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i & 1;
            if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
                str = messageLongClick.component3;
                int i6 = i4 + 3;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
            return messageLongClick.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 45;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component3;
            int i5 = i2 + 11;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final MessageLongClick copy(String messageId) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(messageId, "");
            MessageLongClick messageLongClick = new MessageLongClick(messageId);
            int i2 = component2 + 65;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 74 / 0;
            }
            return messageLongClick;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 97;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof MessageLongClick)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component3, ((MessageLongClick) other).component3)) {
                return true;
            }
            int i4 = copydefault + 43;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component3.hashCode();
            int i4 = copydefault + 43;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MessageLongClick(messageId=" + this.component3 + ')';
            int i2 = component2 + 117;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction$ButtonClick;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", AppLogInterceptor.MESSAGE_ID, "", "button", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ButtonUiState;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/zuriui/state/ButtonUiState;)V", "getMessageId", "()Ljava/lang/String;", "getButton", "()Lcom/huawei/digitalpayment/consumer/zuriui/state/ButtonUiState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonClick implements ChatAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int getRequestBeneficiariesState = 1;
        private final String component1;
        private final ButtonUiState copydefault;

        public ButtonClick(String str, ButtonUiState buttonUiState) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(buttonUiState, "");
            this.component1 = str;
            this.copydefault = buttonUiState;
        }

        public final ButtonUiState getButton() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getMessageId() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 21;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static {
            int i = 1 + 89;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public static ButtonClick copy$default(ButtonClick buttonClick, String str, ButtonUiState buttonUiState, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState;
            int i4 = i3 + 19;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                int i5 = i3 + 9;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                str = buttonClick.component1;
            }
            if ((i & 2) != 0) {
                buttonUiState = buttonClick.copydefault;
            }
            return buttonClick.copy(str, buttonUiState);
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 75;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                str = this.component1;
                int i4 = 16 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i3 + 85;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final ButtonUiState component2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ButtonUiState buttonUiState = this.copydefault;
            int i4 = i3 + 3;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return buttonUiState;
        }

        public final ButtonClick copy(String messageId, ButtonUiState button) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(messageId, "");
            Intrinsics.checkNotNullParameter(button, "");
            ButtonClick buttonClick = new ButtonClick(messageId, button);
            int i2 = ShareDataUIState + 85;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return buttonClick;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = getRequestBeneficiariesState + 105;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof ButtonClick) {
                ButtonClick buttonClick = (ButtonClick) other;
                if (Intrinsics.areEqual(this.component1, buttonClick.component1)) {
                    return Intrinsics.areEqual(this.copydefault, buttonClick.copydefault);
                }
                int i4 = ShareDataUIState + 37;
                getRequestBeneficiariesState = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = ShareDataUIState;
            int i6 = i5 + 99;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 103;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            getRequestBeneficiariesState = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.component1.hashCode() / 108) * this.copydefault.hashCode() : (this.component1.hashCode() * 31) + this.copydefault.hashCode();
            int i3 = ShareDataUIState + 65;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ButtonClick(messageId=" + this.component1 + ", button=" + this.copydefault + ')';
            int i2 = getRequestBeneficiariesState + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
