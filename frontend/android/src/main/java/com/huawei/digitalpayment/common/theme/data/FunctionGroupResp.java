package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/FunctionGroupResp;", "Lcom/huawei/http/BaseResp;", "groupId", "", "menuType", "groupName", "menuName", "marker", "list", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "getMenuType", "setMenuType", "getGroupName", "setGroupName", "getMenuName", "setMenuName", "getMarker", "setMarker", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FunctionGroupResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private String groupId;
    private String groupName;
    private List<? extends FunctionResp> list;
    private String marker;
    private String menuName;
    private String menuType;

    /* JADX WARN: Illegal instructions before constructor call */
    public FunctionGroupResp(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = ShareDataUIState + 41;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 15 / 0;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i9 = copydefault + 23;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            str8 = null;
        } else {
            str8 = str4;
        }
        this(str, str6, str7, str8, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? list : null);
    }

    public final String getGroupId() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupId;
        }
        throw null;
    }

    public final void setGroupId(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.groupId = str;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getMenuType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.menuType;
        }
        throw null;
    }

    public final void setMenuType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.menuType = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.groupName;
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setGroupName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.groupName = str;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
    }

    public final String getMenuName() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.menuName;
            int i4 = 92 / 0;
        } else {
            str = this.menuName;
        }
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMenuName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.menuName = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getMarker() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.marker;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMarker(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.marker = str;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final List<FunctionResp> getList() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List list = this.list;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setList(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.list = list;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public FunctionGroupResp(String str, String str2, String str3, String str4, String str5, List<? extends FunctionResp> list) {
        this.groupId = str;
        this.menuType = str2;
        this.groupName = str3;
        this.menuName = str4;
        this.marker = str5;
        this.list = list;
    }

    public FunctionGroupResp() {
        this(null, null, null, null, null, null, 63, null);
    }
}
