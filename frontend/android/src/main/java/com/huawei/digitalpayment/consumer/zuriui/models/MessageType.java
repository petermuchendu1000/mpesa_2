package com.huawei.digitalpayment.consumer.zuriui.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/MessageType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TEXT", "BUTTONS", "ADVANCED", "URL", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessageType {
    private static final EnumEntries $ENTRIES;
    private static final MessageType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String type;
    public static final MessageType TEXT = new MessageType("TEXT", 0, "text");
    public static final MessageType BUTTONS = new MessageType("BUTTONS", 1, "buttons");
    public static final MessageType ADVANCED = new MessageType("ADVANCED", 2, "advanced_buttons");
    public static final MessageType URL = new MessageType("URL", 3, "url");

    private MessageType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        MessageType[] messageTypeArr$values = $values();
        $VALUES = messageTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(messageTypeArr$values);
        int i = copydefault + 41;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    public static MessageType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MessageType messageType = (MessageType) Enum.valueOf(MessageType.class, str);
        int i4 = component3 + 59;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return messageType;
        }
        throw null;
    }

    public static MessageType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return (MessageType[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final MessageType[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MessageType[] messageTypeArr = {TEXT, BUTTONS, ADVANCED, URL};
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return messageTypeArr;
    }

    public static EnumEntries<MessageType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        EnumEntries<MessageType> enumEntries = $ENTRIES;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
