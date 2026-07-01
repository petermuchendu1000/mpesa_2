package com.huawei.digitalpayment.consumer.zuriui.state;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/state/ConnectionState;", "", "<init>", "(Ljava/lang/String;I)V", "WAITING", "CONNECTED", "DISCONNECTED", "ERROR", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectionState {
    private static final EnumEntries $ENTRIES;
    private static final ConnectionState[] $VALUES;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final ConnectionState WAITING = new ConnectionState("WAITING", 0);
    public static final ConnectionState CONNECTED = new ConnectionState("CONNECTED", 1);
    public static final ConnectionState DISCONNECTED = new ConnectionState("DISCONNECTED", 2);
    public static final ConnectionState ERROR = new ConnectionState("ERROR", 3);

    private ConnectionState(String str, int i) {
    }

    static {
        ConnectionState[] connectionStateArr$values = $values();
        $VALUES = connectionStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(connectionStateArr$values);
        int i = component2 + 57;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static ConnectionState valueOf(String str) {
        ConnectionState connectionState;
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            connectionState = (ConnectionState) Enum.valueOf(ConnectionState.class, str);
            int i3 = 21 / 0;
        } else {
            connectionState = (ConnectionState) Enum.valueOf(ConnectionState.class, str);
        }
        int i4 = copydefault + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return connectionState;
    }

    public static ConnectionState[] values() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (ConnectionState[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ConnectionState[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConnectionState[] connectionStateArr = {WAITING, CONNECTED, DISCONNECTED, ERROR};
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return connectionStateArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ConnectionState> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ConnectionState> enumEntries = $ENTRIES;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
