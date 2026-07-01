package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\nH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PackageGroupResp;", "Ljava/io/Serializable;", "tabId", "", "dataPackList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataPackResp;", "groupName", "groupId", "order", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "getTabId", "()Ljava/lang/String;", "getDataPackList", "()Ljava/util/List;", "getGroupName", "getGroupId", "getOrder", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PackageGroupResp implements Serializable {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 75 % 128;
    private final List<DataPackResp> dataPackList;
    private final String groupId;
    private final String groupName;
    private final int order;
    private final String tabId;

    public PackageGroupResp(String str, List<DataPackResp> list, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tabId = str;
        this.dataPackList = list;
        this.groupName = str2;
        this.groupId = str3;
        this.order = i;
    }

    public final String getTabId() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.tabId;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<DataPackResp> getDataPackList() {
        List<DataPackResp> list;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.dataPackList;
            int i4 = 0 / 0;
        } else {
            list = this.dataPackList;
        }
        int i5 = i2 + 51;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getGroupId() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.groupId;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.order;
        int i6 = i3 + 5;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        int i = 75 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PackageGroupResp copy$default(PackageGroupResp packageGroupResp, String str, List list, String str2, String str3, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component3 + 43;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                String str4 = packageGroupResp.tabId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = packageGroupResp.tabId;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            list = packageGroupResp.dataPackList;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            int i5 = component2 + 33;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str2 = packageGroupResp.groupName;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = packageGroupResp.groupId;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            i = packageGroupResp.order;
        }
        return packageGroupResp.copy(str5, list2, str6, str7, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tabId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<DataPackResp> component2() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dataPackList;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.groupName;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupId;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 55;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final PackageGroupResp copy(String tabId, List<DataPackResp> dataPackList, String groupName, String groupId, int order) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tabId, "");
        Intrinsics.checkNotNullParameter(groupName, "");
        Intrinsics.checkNotNullParameter(groupId, "");
        PackageGroupResp packageGroupResp = new PackageGroupResp(tabId, dataPackList, groupName, groupId, order);
        int i2 = component2 + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return packageGroupResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 105;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof PackageGroupResp)) {
            int i3 = component3 + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        PackageGroupResp packageGroupResp = (PackageGroupResp) other;
        if (!Intrinsics.areEqual(this.tabId, packageGroupResp.tabId) || !Intrinsics.areEqual(this.dataPackList, packageGroupResp.dataPackList)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.groupName, packageGroupResp.groupName)) {
            int i5 = component3 + 61;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.groupId, packageGroupResp.groupId)) {
            return false;
        }
        if (this.order == packageGroupResp.order) {
            return true;
        }
        int i7 = component3 + 39;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.tabId.hashCode();
        List<DataPackResp> list = this.dataPackList;
        if (list == null) {
            int i4 = component3 + 53;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + this.groupName.hashCode()) * 31) + this.groupId.hashCode()) * 31) + Integer.hashCode(this.order);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PackageGroupResp(tabId=" + this.tabId + ", dataPackList=" + this.dataPackList + ", groupName=" + this.groupName + ", groupId=" + this.groupId + ", order=" + this.order + ")";
        int i2 = component2 + 3;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
