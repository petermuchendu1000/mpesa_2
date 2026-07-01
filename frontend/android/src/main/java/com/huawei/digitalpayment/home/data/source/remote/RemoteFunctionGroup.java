package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.digitalpayment.consumer.baselib.util.sort.Order;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010!\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0080\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/remote/RemoteFunctionGroup;", "Lcom/huawei/digitalpayment/consumer/baselib/util/sort/Order;", "Lcom/huawei/http/BaseResp;", "groupId", "", "menuType", "menuName", "groupName", "order", "", "startTime", "stopTime", "marker", "list", "", "Lcom/huawei/digitalpayment/home/data/source/remote/RemoteHomeFunction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupId", "()Ljava/lang/String;", "getMenuType", "getMenuName", "getGroupName", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTime", "getStopTime", "getMarker", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getSortOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/huawei/digitalpayment/home/data/source/remote/RemoteFunctionGroup;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteFunctionGroup extends BaseResp implements Order {
    private static int component3 = 1;
    private static int copydefault;
    private final String groupId;
    private final String groupName;
    private List<RemoteHomeFunction> list;
    private final String marker;
    private final String menuName;
    private final String menuType;
    private final Integer order;
    private final String startTime;
    private final String stopTime;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteFunctionGroup(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        if ((i & 256) != 0) {
            int i2 = component3 + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            List listEmptyList = CollectionsKt.emptyList();
            int i4 = component3 + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            list2 = listEmptyList;
        } else {
            list2 = list;
        }
        this(str, str2, str3, str4, num, str5, str6, str7, list2);
    }

    public final String getGroupId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupId;
        int i5 = i2 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMenuType() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.menuType;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMenuName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.menuName;
        int i4 = i2 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.groupName;
        int i4 = i3 + 61;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStartTime() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.startTime;
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStopTime() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.stopTime;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    public final String getMarker() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.marker;
        }
        throw null;
    }

    public final List<RemoteHomeFunction> getList() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<RemoteHomeFunction> list = this.list;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setList(List<RemoteHomeFunction> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.list = list;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public RemoteFunctionGroup(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, List<RemoteHomeFunction> list) {
        this.groupId = str;
        this.menuType = str2;
        this.menuName = str3;
        this.groupName = str4;
        this.order = num;
        this.startTime = str5;
        this.stopTime = str6;
        this.marker = str7;
        this.list = list;
    }

    @Override
    public Integer getSortOrder() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteFunctionGroup copy$default(RemoteFunctionGroup remoteFunctionGroup, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, List list, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        int i2 = 2 % 2;
        int i3 = component3 + 25;
        int i4 = i3 % 128;
        copydefault = i4;
        String str11 = (i3 % 2 == 0 && (i & 1) != 0) ? remoteFunctionGroup.groupId : str;
        if ((i & 2) != 0) {
            int i5 = i4 + 119;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str8 = remoteFunctionGroup.menuType;
        } else {
            str8 = str2;
        }
        String str12 = (i & 4) != 0 ? remoteFunctionGroup.menuName : str3;
        if ((i & 8) != 0) {
            int i7 = component3 + 123;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str9 = remoteFunctionGroup.groupName;
        } else {
            str9 = str4;
        }
        Integer num2 = (i & 16) != 0 ? remoteFunctionGroup.order : num;
        String str13 = (i & 32) != 0 ? remoteFunctionGroup.startTime : str5;
        if ((i & 64) != 0) {
            int i9 = component3 + 7;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                String str14 = remoteFunctionGroup.stopTime;
                throw null;
            }
            str10 = remoteFunctionGroup.stopTime;
        } else {
            str10 = str6;
        }
        return remoteFunctionGroup.copy(str11, str8, str12, str9, num2, str13, str10, (i & 128) != 0 ? remoteFunctionGroup.marker : str7, (i & 256) != 0 ? remoteFunctionGroup.list : list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.groupId;
            int i4 = 30 / 0;
        } else {
            str = this.groupId;
        }
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.menuType;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.menuName;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.groupName;
        int i5 = i3 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.startTime;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.stopTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.marker;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<RemoteHomeFunction> component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<RemoteHomeFunction> list = this.list;
        int i5 = i2 + 107;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return list;
    }

    public final RemoteFunctionGroup copy(String groupId, String menuType, String menuName, String groupName, Integer order, String startTime, String stopTime, String marker, List<RemoteHomeFunction> list) {
        int i = 2 % 2;
        RemoteFunctionGroup remoteFunctionGroup = new RemoteFunctionGroup(groupId, menuType, menuName, groupName, order, startTime, stopTime, marker, list);
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteFunctionGroup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteFunctionGroup)) {
            return false;
        }
        RemoteFunctionGroup remoteFunctionGroup = (RemoteFunctionGroup) other;
        if (!Intrinsics.areEqual(this.groupId, remoteFunctionGroup.groupId) || !Intrinsics.areEqual(this.menuType, remoteFunctionGroup.menuType) || !Intrinsics.areEqual(this.menuName, remoteFunctionGroup.menuName) || !Intrinsics.areEqual(this.groupName, remoteFunctionGroup.groupName) || !Intrinsics.areEqual(this.order, remoteFunctionGroup.order) || !Intrinsics.areEqual(this.startTime, remoteFunctionGroup.startTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.stopTime, remoteFunctionGroup.stopTime)) {
            int i2 = component3 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.marker, remoteFunctionGroup.marker)) {
            return false;
        }
        if (Intrinsics.areEqual(this.list, remoteFunctionGroup.list)) {
            return true;
        }
        int i4 = copydefault + 91;
        component3 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.groupId;
        if (str == null) {
            int i2 = copydefault + 61;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.menuType;
        int iHashCode5 = 1;
        if (str2 == null) {
            int i4 = component3 + 85;
            copydefault = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.menuName;
        if (str3 == null) {
            int i5 = copydefault + 99;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.groupName;
        if (str4 == null) {
            int i7 = copydefault + 79;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str4.hashCode();
        }
        Integer num = this.order;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str5 = this.startTime;
        if (str5 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
            int i8 = component3 + 93;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        String str6 = this.stopTime;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.marker;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        List<RemoteHomeFunction> list = this.list;
        int iHashCode9 = (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode4) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list == null ? 0 : list.hashCode());
        int i10 = component3 + 111;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteFunctionGroup(groupId=" + this.groupId + ", menuType=" + this.menuType + ", menuName=" + this.menuName + ", groupName=" + this.groupName + ", order=" + this.order + ", startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", marker=" + this.marker + ", list=" + this.list + ")";
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return str;
    }
}
