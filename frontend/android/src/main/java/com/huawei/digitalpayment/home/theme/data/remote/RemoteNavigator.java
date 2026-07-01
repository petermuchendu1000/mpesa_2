package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteNavigator;", "Lcom/huawei/http/BaseResp;", "configValue", "Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "components", "", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteComponent;", "<init>", "(Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;Ljava/util/List;)V", "getConfigValue", "()Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "getComponents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteNavigator extends BaseResp {
    private static int component2 = 1;
    public static int component3 = 1126154169;
    private static int copydefault;
    private final List<RemoteComponent> components;
    private final ConfigValue configValue;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteNavigator(ConfigValue configValue, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        configValue = (i & 1) != 0 ? null : configValue;
        if ((i & 2) != 0) {
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = component2 + 93;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(configValue, list);
    }

    public final ConfigValue getConfigValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ConfigValue configValue = this.configValue;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return configValue;
    }

    public final List<RemoteComponent> getComponents() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<RemoteComponent> list = this.components;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return list;
    }

    public RemoteNavigator(ConfigValue configValue, List<RemoteComponent> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.configValue = configValue;
        this.components = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteNavigator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteNavigator copy$default(RemoteNavigator remoteNavigator, ConfigValue configValue, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 71;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            configValue = remoteNavigator.configValue;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 5;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                list = remoteNavigator.components;
                int i6 = 27 / 0;
            } else {
                list = remoteNavigator.components;
            }
            int i7 = i4 + 5;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        return remoteNavigator.copy(configValue, list);
    }

    public final ConfigValue component1() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConfigValue configValue = this.configValue;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return configValue;
        }
        throw null;
    }

    public final List<RemoteComponent> component2() {
        List<RemoteComponent> list;
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            list = this.components;
            int i4 = 60 / 0;
        } else {
            list = this.components;
        }
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final RemoteNavigator copy(ConfigValue configValue, List<RemoteComponent> components) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(components, "");
        RemoteNavigator remoteNavigator = new RemoteNavigator(configValue, components);
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return remoteNavigator;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 121;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof RemoteNavigator)) {
            int i7 = i2 + 69;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        RemoteNavigator remoteNavigator = (RemoteNavigator) other;
        if (!Intrinsics.areEqual(this.configValue, remoteNavigator.configValue)) {
            return false;
        }
        if (Intrinsics.areEqual(this.components, remoteNavigator.components)) {
            return true;
        }
        int i9 = copydefault + 37;
        component2 = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        ConfigValue configValue = this.configValue;
        if (configValue == null) {
            int i3 = component2 + 51;
            copydefault = i3 % 128;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = configValue.hashCode();
            int i4 = component2 + 93;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode;
        }
        return (i * 31) + this.components.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteNavigator(configValue=" + this.configValue + ", components=" + this.components + ")";
        int i2 = component2 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
