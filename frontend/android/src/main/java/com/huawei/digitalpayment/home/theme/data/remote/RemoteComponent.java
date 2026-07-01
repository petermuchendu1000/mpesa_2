package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteComponent;", "Lcom/huawei/http/BaseResp;", "configValue", "Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "components", "", "<init>", "(Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;Ljava/util/List;)V", "getConfigValue", "()Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "getComponents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteComponent extends BaseResp {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final List<RemoteComponent> components;
    private final ConfigValue configValue;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteComponent(ConfigValue configValue, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            configValue = null;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 107;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i6 = 74 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
            int i7 = 2 % 2;
        }
        this(configValue, list);
    }

    public final ConfigValue getConfigValue() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConfigValue configValue = this.configValue;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return configValue;
    }

    public final List<RemoteComponent> getComponents() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<RemoteComponent> list = this.components;
        int i4 = i3 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public RemoteComponent(ConfigValue configValue, List<RemoteComponent> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.configValue = configValue;
        this.components = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteComponent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteComponent copy$default(RemoteComponent remoteComponent, ConfigValue configValue, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 39;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            configValue = remoteComponent.configValue;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 83;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                List<RemoteComponent> list2 = remoteComponent.components;
                throw null;
            }
            list = remoteComponent.components;
        }
        RemoteComponent remoteComponentCopy = remoteComponent.copy(configValue, list);
        int i6 = copydefault + 87;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return remoteComponentCopy;
    }

    public final ConfigValue component1() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConfigValue configValue = this.configValue;
        int i5 = i3 + 107;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return configValue;
    }

    public final List<RemoteComponent> component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<RemoteComponent> list = this.components;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final RemoteComponent copy(ConfigValue configValue, List<RemoteComponent> components) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(components, "");
        RemoteComponent remoteComponent = new RemoteComponent(configValue, components);
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return remoteComponent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r6 = (com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.configValue, r6.configValue) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r6 = com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault + 39;
        r1 = r6 % 128;
        com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1 = r1;
        r6 = r6 % 2;
        r1 = r1 + 43;
        com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.components, r6.components) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r6 = com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault + 107;
        com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if ((r6 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 51;
        com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) != 0) goto L11;
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
            int r1 = com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 90
            int r1 = r1 / r4
            if (r5 != r6) goto L24
            goto L18
        L16:
            if (r5 != r6) goto L24
        L18:
            int r2 = r2 + 51
            int r6 = r2 % 128
            com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1 = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L22
            return r3
        L22:
            r6 = 0
            throw r6
        L24:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent
            if (r1 != 0) goto L29
            return r4
        L29:
            com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent r6 = (com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent) r6
            com.huawei.digitalpayment.home.theme.data.remote.ConfigValue r1 = r5.configValue
            com.huawei.digitalpayment.home.theme.data.remote.ConfigValue r2 = r6.configValue
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L46
            int r6 = com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault
            int r6 = r6 + 39
            int r1 = r6 % 128
            com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1 = r1
            int r6 = r6 % r0
            int r1 = r1 + 43
            int r6 = r1 % 128
            com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault = r6
            int r1 = r1 % r0
            return r4
        L46:
            java.util.List<com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent> r1 = r5.components
            java.util.List<com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent> r6 = r6.components
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L5d
            int r6 = com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.copydefault
            int r6 = r6 + 107
            int r1 = r6 % 128
            com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.component1 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L5c
            return r3
        L5c:
            return r4
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.theme.data.remote.RemoteComponent.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ConfigValue configValue = this.configValue;
        if (configValue == null) {
            int i5 = i2 + 39;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = configValue.hashCode();
        }
        return (iHashCode * 31) + this.components.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteComponent(configValue=" + this.configValue + ", components=" + this.components + ")";
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
