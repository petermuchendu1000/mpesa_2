package com.huawei.digitalpayment.consumer.zuriui.components.preview;

import com.huawei.digitalpayment.consumer.zuriui.models.MessageType;
import com.huawei.digitalpayment.consumer.zuriui.state.ButtonUiState;
import com.huawei.digitalpayment.consumer.zuriui.state.ChatUiState;
import com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState;
import com.huawei.digitalpayment.consumer.zuriui.state.MessageUiState;
import com.huawei.digitalpayment.consumer.zuriui.state.UserUiState;
import kotlin.Metadata;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/components/preview/ZuriPreviewData;", "", "<init>", "()V", "sampleCurrentUser", "Lcom/huawei/digitalpayment/consumer/zuriui/state/UserUiState;", "getSampleCurrentUser", "()Lcom/huawei/digitalpayment/consumer/zuriui/state/UserUiState;", "sampleZuriUser", "getSampleZuriUser", "sampleTextMessage", "Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;", "getSampleTextMessage", "()Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;", "sampleOutgoingMessage", "getSampleOutgoingMessage", "sampleButtonsMessage", "getSampleButtonsMessage", "sampleMessages", "Lkotlinx/collections/immutable/PersistentList;", "getSampleMessages", "()Lkotlinx/collections/immutable/PersistentList;", "sampleChatUiState", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ChatUiState;", "getSampleChatUiState", "()Lcom/huawei/digitalpayment/consumer/zuriui/state/ChatUiState;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ZuriPreviewData {
    public static final int $stable = 0;
    public static final ZuriPreviewData INSTANCE = new ZuriPreviewData();
    private static final UserUiState ShareDataUIState;
    private static final MessageUiState component1;
    private static final MessageUiState component2;
    private static final ChatUiState component3;
    private static int component4 = 0;
    private static final UserUiState copy;
    private static final PersistentList<MessageUiState> copydefault;
    private static int equals = 1;
    private static final MessageUiState getAsAtTimestamp;
    private static int getRequestBeneficiariesState = 0;
    private static int toString = 1;

    private ZuriPreviewData() {
    }

    static {
        UserUiState userUiState = new UserUiState("user123", "You", null);
        ShareDataUIState = userUiState;
        UserUiState userUiState2 = new UserUiState("zuri", "Zuri", "https://example.com/zuri-avatar.png");
        copy = userUiState2;
        MessageUiState messageUiState = new MessageUiState("msg1", "Hello! How can I help you today?", userUiState2, System.currentTimeMillis(), MessageType.TEXT, null, false, false, 96, null);
        getAsAtTimestamp = messageUiState;
        MessageUiState messageUiState2 = new MessageUiState("msg2", "I need help with my account", userUiState, System.currentTimeMillis(), MessageType.TEXT, null, false, true, 96, null);
        component2 = messageUiState2;
        MessageUiState messageUiState3 = new MessageUiState("msg3", null, userUiState2, System.currentTimeMillis(), MessageType.BUTTONS, ExtensionsKt.persistentListOf(new ButtonUiState("Tunukiwa", MessageType.TEXT.getType(), null), new ButtonUiState("Airtime Purchase", MessageType.TEXT.getType(), null), new ButtonUiState("M-PESA Help and Reversal", MessageType.TEXT.getType(), null), new ButtonUiState("Visit Website", MessageType.URL.getType(), "https://safaricom.com")), false, false, 64, null);
        component1 = messageUiState3;
        PersistentList<MessageUiState> persistentListPersistentListOf = ExtensionsKt.persistentListOf(messageUiState, messageUiState2, messageUiState3, new MessageUiState("msg4", "Thank you!", userUiState, System.currentTimeMillis() - ((long) 60000), MessageType.TEXT, null, false, true, 96, null));
        copydefault = persistentListPersistentListOf;
        component3 = new ChatUiState(persistentListPersistentListOf, false, ConnectionState.CONNECTED, 0, false);
        int i = getRequestBeneficiariesState + 111;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final UserUiState getSampleCurrentUser() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 97;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        UserUiState userUiState = ShareDataUIState;
        int i5 = i2 + 87;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return userUiState;
    }

    public final UserUiState getSampleZuriUser() {
        int i = 2 % 2;
        int i2 = toString + 43;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        UserUiState userUiState = copy;
        int i5 = i3 + 21;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return userUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MessageUiState getSampleTextMessage() {
        int i = 2 % 2;
        int i2 = toString + 101;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MessageUiState getSampleOutgoingMessage() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 69;
        toString = i3 % 128;
        int i4 = i3 % 2;
        MessageUiState messageUiState = component2;
        int i5 = i2 + 101;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return messageUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MessageUiState getSampleButtonsMessage() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 117;
        toString = i3 % 128;
        int i4 = i3 % 2;
        MessageUiState messageUiState = component1;
        int i5 = i2 + 83;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return messageUiState;
    }

    public final PersistentList<MessageUiState> getSampleMessages() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        PersistentList<MessageUiState> persistentList = copydefault;
        int i5 = i3 + 123;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return persistentList;
        }
        throw null;
    }

    public final ChatUiState getSampleChatUiState() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 1;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        ChatUiState chatUiState = component3;
        int i5 = i2 + 91;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return chatUiState;
    }
}
