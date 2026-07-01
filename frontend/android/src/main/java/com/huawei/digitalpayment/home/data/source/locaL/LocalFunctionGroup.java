package com.huawei.digitalpayment.home.data.source.locaL;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "Lcom/huawei/http/BaseResp;", "groupId", "", "menuType", "groupName", "menuName", "marker", "list", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupId", "()Ljava/lang/String;", "getMenuType", "getGroupName", "getMenuName", "getMarker", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalFunctionGroup extends BaseResp {
    private static int component1 = 1;
    private static int copydefault;
    private final String groupId;
    private final String groupName;
    private List<LocalHomeFunction> list;
    private final String marker;
    private final String menuName;
    private final String menuType;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalFunctionGroup(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 57;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        String str8 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i6 = copydefault + 101;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        String str9 = (i & 16) == 0 ? str5 : null;
        if ((i & 32) != 0) {
            int i7 = component1 + 79;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            list = CollectionsKt.emptyList();
        }
        this(str, str6, str8, str7, str9, list);
    }

    public final String getGroupId() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.groupId;
        int i5 = i3 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMenuType() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.menuType;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public final String getGroupName() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.groupName;
            int i4 = 48 / 0;
        } else {
            str = this.groupName;
        }
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMenuName() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.menuName;
            int i4 = 84 / 0;
        } else {
            str = this.menuName;
        }
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return str;
    }

    public final String getMarker() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.marker;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<LocalHomeFunction> getList() {
        List<LocalHomeFunction> list;
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            list = this.list;
            int i4 = 67 / 0;
        } else {
            list = this.list;
        }
        int i5 = i3 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setList(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.list = list;
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = i2 + 67;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public LocalFunctionGroup(String str, String str2, String str3, String str4, String str5, List<LocalHomeFunction> list) {
        this.groupId = str;
        this.menuType = str2;
        this.groupName = str3;
        this.menuName = str4;
        this.marker = str5;
        this.list = list;
    }

    public LocalFunctionGroup() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalFunctionGroup copy$default(LocalFunctionGroup localFunctionGroup, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = localFunctionGroup.groupId;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i3 = component1 + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str2 = localFunctionGroup.menuType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i5 = copydefault + 73;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str3 = localFunctionGroup.groupName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i7 = component1 + 21;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str4 = localFunctionGroup.menuName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            int i9 = component1 + 43;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                String str10 = localFunctionGroup.marker;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str5 = localFunctionGroup.marker;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            int i10 = copydefault + 3;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            list = localFunctionGroup.list;
        }
        return localFunctionGroup.copy(str6, str7, str8, str9, str11, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.menuType;
        int i5 = i3 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupName;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.menuName;
        int i4 = i2 + 9;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.marker;
        int i4 = i2 + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<LocalHomeFunction> component6() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.list;
        }
        throw null;
    }

    public final LocalFunctionGroup copy(String groupId, String menuType, String groupName, String menuName, String marker, List<LocalHomeFunction> list) {
        int i = 2 % 2;
        LocalFunctionGroup localFunctionGroup = new LocalFunctionGroup(groupId, menuType, groupName, menuName, marker, list);
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localFunctionGroup;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalFunctionGroup)) {
            return false;
        }
        LocalFunctionGroup localFunctionGroup = (LocalFunctionGroup) other;
        if (!Intrinsics.areEqual(this.groupId, localFunctionGroup.groupId)) {
            int i2 = component1 + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.menuType, localFunctionGroup.menuType) || !Intrinsics.areEqual(this.groupName, localFunctionGroup.groupName) || !Intrinsics.areEqual(this.menuName, localFunctionGroup.menuName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.marker, localFunctionGroup.marker)) {
            int i4 = component1 + 17;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.list, localFunctionGroup.list)) {
            return true;
        }
        int i6 = copydefault;
        int i7 = i6 + 63;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 39;
        component1 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 87 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v17 java.lang.String) = (r1v4 java.lang.String), (r1v19 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.component1
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.String r1 = r9.groupId
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r9.groupId
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r9.menuType
            if (r4 != 0) goto L26
            r4 = r2
            goto L2a
        L26:
            int r4 = r4.hashCode()
        L2a:
            java.lang.String r5 = r9.groupName
            if (r5 != 0) goto L30
            r5 = r2
            goto L34
        L30:
            int r5 = r5.hashCode()
        L34:
            java.lang.String r6 = r9.menuName
            if (r6 != 0) goto L43
            int r6 = com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.copydefault
            int r6 = r6 + 93
            int r7 = r6 % 128
            com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.component1 = r7
            int r6 = r6 % r0
            r6 = r2
            goto L47
        L43:
            int r6 = r6.hashCode()
        L47:
            java.lang.String r7 = r9.marker
            if (r7 != 0) goto L4c
            goto L50
        L4c:
            int r2 = r7.hashCode()
        L50:
            java.util.List<com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction> r7 = r9.list
            if (r7 != 0) goto L55
            goto L62
        L55:
            int r3 = r7.hashCode()
            int r7 = com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.component1
            int r7 = r7 + 47
            int r8 = r7 % 128
            com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.copydefault = r8
            int r7 = r7 % r0
        L62:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalFunctionGroup(groupId=" + this.groupId + ", menuType=" + this.menuType + ", groupName=" + this.groupName + ", menuName=" + this.menuName + ", marker=" + this.marker + ", list=" + this.list + ")";
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
