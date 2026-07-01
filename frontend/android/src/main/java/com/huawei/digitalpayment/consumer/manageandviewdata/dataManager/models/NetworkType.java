package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models;

import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElementTypeConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/NetworkType;", "", "<init>", "(Ljava/lang/String;I)V", DynamicsElementTypeConstants.MOBILE, NetworkUtil.NETWORK_TYPE_WIFI, "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkType {
    private static final EnumEntries $ENTRIES;
    private static final NetworkType[] $VALUES;
    public static final NetworkType MOBILE = new NetworkType(DynamicsElementTypeConstants.MOBILE, 0);
    public static final NetworkType WIFI = new NetworkType(NetworkUtil.NETWORK_TYPE_WIFI, 1);
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    private NetworkType(String str, int i) {
    }

    static {
        NetworkType[] networkTypeArr$values = $values();
        $VALUES = networkTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(networkTypeArr$values);
        int i = copydefault + 69;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static NetworkType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NetworkType networkType = (NetworkType) Enum.valueOf(NetworkType.class, str);
        int i4 = component2 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return networkType;
    }

    public static NetworkType[] values() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NetworkType[] networkTypeArr = (NetworkType[]) $VALUES.clone();
        int i4 = component2 + 19;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return networkTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final NetworkType[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        NetworkType[] networkTypeArr = {MOBILE, WIFI};
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return networkTypeArr;
    }

    public static EnumEntries<NetworkType> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<NetworkType> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return enumEntries;
    }
}
