package com.huawei.digitalpayment.home.data.source.remote;

import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.sort.Order;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0000J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jµ\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0006HÖ\u0001J\t\u0010Q\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019¨\u0006R"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/remote/RemoteHomeFunction;", "Lcom/huawei/digitalpayment/consumer/baselib/util/sort/Order;", "Lcom/huawei/http/BaseResp;", "funcId", "", "order", "", "funcName", "icon", "blackIcon", "iconSelected", KeysConstants.KEY_EXECUTE, "reportTag", "marker", "editEnable", "groupTag", "groupName", "childMenus", "", "extraCondition", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFuncId", "()Ljava/lang/String;", "setFuncId", "(Ljava/lang/String;)V", "getOrder", "()I", "setOrder", "(I)V", "getFuncName", "setFuncName", "getIcon", "setIcon", "getBlackIcon", "setBlackIcon", "getIconSelected", "setIconSelected", "getExecute", "setExecute", "getReportTag", "setReportTag", "getMarker", "setMarker", "getEditEnable", "setEditEnable", "getGroupTag", "setGroupTag", "getGroupName", "setGroupName", "getChildMenus", "()Ljava/util/List;", "setChildMenus", "(Ljava/util/List;)V", "getExtraCondition", "setExtraCondition", "getSortOrder", "()Ljava/lang/Integer;", "fillEmptyWithOther", "", "function", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteHomeFunction extends BaseResp implements Order {
    private static int component2 = 0;
    private static int copydefault = 1;
    private String blackIcon;
    private List<RemoteHomeFunction> childMenus;
    private String editEnable;
    private String execute;
    private String extraCondition;
    private String funcId;
    private String funcName;
    private String groupName;
    private String groupTag;

    @SerializedName(alternate = {GriverParams.ShareParams.IMAGE_URL}, value = "icon")
    private String icon;
    private String iconSelected;
    private String marker;
    private int order;
    private String reportTag;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteHomeFunction(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        String str13;
        if ((i2 & 4096) != 0) {
            int i3 = copydefault + 13;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i2 & 8192) != 0) {
            int i5 = copydefault + 61;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str13 = null;
        } else {
            str13 = str12;
        }
        this(str, i, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list2, str13);
    }

    public final String getFuncId() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.funcId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFuncId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.funcId = str;
        int i5 = i3 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
    }

    public final int getOrder() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 101;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.order;
            int i5 = 7 / 0;
        } else {
            i = this.order;
        }
        int i6 = i3 + 77;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final void setOrder(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 17;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.order = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 39;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getFuncName() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.funcName;
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setFuncName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.funcName = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.icon;
        }
        throw null;
    }

    public final void setIcon(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.icon = str;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getBlackIcon() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.blackIcon;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setBlackIcon(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.blackIcon = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIconSelected() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.iconSelected;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final void setIconSelected(String str) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.iconSelected = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.execute = str;
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getReportTag() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reportTag;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setReportTag(String str) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.reportTag = str;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
    }

    public final String getMarker() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.marker;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final void setMarker(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.marker = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEditEnable() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.editEnable;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setEditEnable(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.editEnable = str;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    public final String getGroupTag() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupTag;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setGroupTag(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.groupTag = str;
        int i5 = i2 + 11;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupName;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setGroupName(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.groupName = str;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final List<RemoteHomeFunction> getChildMenus() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<RemoteHomeFunction> list = this.childMenus;
        int i4 = i3 + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final void setChildMenus(List<RemoteHomeFunction> list) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.childMenus = list;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
    }

    public final String getExtraCondition() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 93;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.extraCondition;
        int i4 = i2 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setExtraCondition(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.extraCondition = str;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public RemoteHomeFunction(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<RemoteHomeFunction> list, String str12) {
        this.funcId = str;
        this.order = i;
        this.funcName = str2;
        this.icon = str3;
        this.blackIcon = str4;
        this.iconSelected = str5;
        this.execute = str6;
        this.reportTag = str7;
        this.marker = str8;
        this.editEnable = str9;
        this.groupTag = str10;
        this.groupName = str11;
        this.childMenus = list;
        this.extraCondition = str12;
    }

    @Override
    public Integer getSortOrder() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.order;
        if (i3 != 0) {
            return Integer.valueOf(i4);
        }
        Integer.valueOf(i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[EXC_TOP_SPLITTER, PHI: r2
  0x0053: PHI (r2v7 java.lang.reflect.Field) = (r2v6 java.lang.reflect.Field), (r2v10 java.lang.reflect.Field) binds: [B:10:0x003d, B:13:0x0050] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fillEmptyWithOther(com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction.copydefault
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L74
            java.lang.Class r1 = r5.getClass()
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
            java.util.Iterator r1 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r1)
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L73
            int r2 = com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction.component2
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction.copydefault = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L40
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r4 = 0
            int r4 = r4 / r4
            if (r3 != 0) goto L53
            goto L1a
        L40:
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L53
            goto L1a
        L53:
            java.lang.Object r3 = r2.get(r5)     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L6d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Exception -> L6d
            if (r3 == 0) goto L63
            int r3 = r3.length()     // Catch: java.lang.Exception -> L6d
            if (r3 != 0) goto L1a
        L63:
            java.lang.Object r3 = r2.get(r6)     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L6d
            r2.set(r5, r3)     // Catch: java.lang.Exception -> L6d
            goto L1a
        L6d:
            java.lang.String r2 = "ignore: "
            com.huawei.common.util.L.e(r2)
            goto L1a
        L73:
            return
        L74:
            java.lang.Class r6 = r5.getClass()
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()
            kotlin.jvm.internal.ArrayIteratorKt.iterator(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction.fillEmptyWithOther(com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteHomeFunction copy$default(RemoteHomeFunction remoteHomeFunction, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, int i2, Object obj) {
        String str13;
        int i3;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        List list2;
        int i4 = 2 % 2;
        int i5 = copydefault;
        int i6 = i5 + 105;
        component2 = i6 % 128;
        Object obj2 = null;
        if (i6 % 2 == 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) {
            str13 = str;
        } else {
            int i7 = i5 + 9;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                String str21 = remoteHomeFunction.funcId;
                obj2.hashCode();
                throw null;
            }
            str13 = remoteHomeFunction.funcId;
        }
        if ((i2 & 2) != 0) {
            int i8 = component2 + 53;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            i3 = remoteHomeFunction.order;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            int i10 = copydefault + 7;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str14 = remoteHomeFunction.funcName;
        } else {
            str14 = str2;
        }
        if ((i2 & 8) != 0) {
            int i12 = component2 + 101;
            copydefault = i12 % 128;
            if (i12 % 2 == 0) {
                String str22 = remoteHomeFunction.icon;
                obj2.hashCode();
                throw null;
            }
            str15 = remoteHomeFunction.icon;
        } else {
            str15 = str3;
        }
        String str23 = (i2 & 16) != 0 ? remoteHomeFunction.blackIcon : str4;
        String str24 = (i2 & 32) != 0 ? remoteHomeFunction.iconSelected : str5;
        if ((i2 & 64) != 0) {
            int i13 = copydefault + 121;
            component2 = i13 % 128;
            if (i13 % 2 != 0) {
                String str25 = remoteHomeFunction.execute;
                obj2.hashCode();
                throw null;
            }
            str16 = remoteHomeFunction.execute;
        } else {
            str16 = str6;
        }
        String str26 = (i2 & 128) != 0 ? remoteHomeFunction.reportTag : str7;
        if ((i2 & 256) != 0) {
            int i14 = copydefault + 21;
            component2 = i14 % 128;
            int i15 = i14 % 2;
            str17 = remoteHomeFunction.marker;
        } else {
            str17 = str8;
        }
        String str27 = (i2 & 512) != 0 ? remoteHomeFunction.editEnable : str9;
        if ((i2 & 1024) != 0) {
            int i16 = copydefault + 59;
            component2 = i16 % 128;
            int i17 = i16 % 2;
            str18 = remoteHomeFunction.groupTag;
        } else {
            str18 = str10;
        }
        if ((i2 & 2048) != 0) {
            String str28 = remoteHomeFunction.groupName;
            int i18 = component2 + 109;
            copydefault = i18 % 128;
            int i19 = i18 % 2;
            str19 = str28;
        } else {
            str19 = str11;
        }
        if ((i2 & 4096) != 0) {
            int i20 = copydefault + 29;
            str20 = str19;
            component2 = i20 % 128;
            int i21 = i20 % 2;
            list2 = remoteHomeFunction.childMenus;
            if (i21 != 0) {
                int i22 = 75 / 0;
            }
        } else {
            str20 = str19;
            list2 = list;
        }
        return remoteHomeFunction.copy(str13, i3, str14, str15, str23, str24, str16, str26, str17, str27, str18, str20, list2, (i2 & 8192) != 0 ? remoteHomeFunction.extraCondition : str12);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.funcId;
            int i4 = 79 / 0;
        } else {
            str = this.funcId;
        }
        int i5 = i2 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.editEnable;
        int i4 = i3 + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupTag;
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.groupName;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final List<RemoteHomeFunction> component13() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.childMenus;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extraCondition;
        }
        throw null;
    }

    public final int component2() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 21;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0) {
            i = this.order;
            int i5 = 66 / 0;
        } else {
            i = this.order;
        }
        int i6 = i4 + 109;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return i;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.funcName;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.icon;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.blackIcon;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconSelected;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reportTag;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.marker;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final RemoteHomeFunction copy(String funcId, int order, String funcName, String icon, String blackIcon, String iconSelected, String execute, String reportTag, String marker, String editEnable, String groupTag, String groupName, List<RemoteHomeFunction> childMenus, String extraCondition) {
        int i = 2 % 2;
        RemoteHomeFunction remoteHomeFunction = new RemoteHomeFunction(funcId, order, funcName, icon, blackIcon, iconSelected, execute, reportTag, marker, editEnable, groupTag, groupName, childMenus, extraCondition);
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return remoteHomeFunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteHomeFunction)) {
            return false;
        }
        RemoteHomeFunction remoteHomeFunction = (RemoteHomeFunction) other;
        if (!Intrinsics.areEqual(this.funcId, remoteHomeFunction.funcId) || this.order != remoteHomeFunction.order) {
            return false;
        }
        if (!Intrinsics.areEqual(this.funcName, remoteHomeFunction.funcName)) {
            int i3 = component2 + 95;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.icon, remoteHomeFunction.icon)) {
            int i5 = copydefault + 45;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.blackIcon, remoteHomeFunction.blackIcon)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconSelected, remoteHomeFunction.iconSelected)) {
            int i7 = copydefault + 3;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.execute, remoteHomeFunction.execute)) {
            int i9 = component2 + 119;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.reportTag, remoteHomeFunction.reportTag)) {
            int i11 = copydefault + 29;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.marker, remoteHomeFunction.marker) || (!Intrinsics.areEqual(this.editEnable, remoteHomeFunction.editEnable)) || !Intrinsics.areEqual(this.groupTag, remoteHomeFunction.groupTag)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.groupName, remoteHomeFunction.groupName)) {
            int i13 = component2 + 75;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.childMenus, remoteHomeFunction.childMenus)) {
            return false;
        }
        if (Intrinsics.areEqual(this.extraCondition, remoteHomeFunction.extraCondition)) {
            return true;
        }
        int i15 = copydefault + 59;
        component2 = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.funcId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Integer.hashCode(this.order);
        String str2 = this.funcName;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.icon;
        if (str3 == null) {
            int i2 = component2 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.blackIcon;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.iconSelected;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.execute;
        if (str6 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
            int i4 = component2 + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        String str7 = this.reportTag;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.marker;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.editEnable;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.groupTag;
        if (str10 == null) {
            int i6 = copydefault + 87;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str10.hashCode();
        }
        String str11 = this.groupName;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        List<RemoteHomeFunction> list = this.childMenus;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        String str12 = this.extraCondition;
        return (((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteHomeFunction(funcId=" + this.funcId + ", order=" + this.order + ", funcName=" + this.funcName + ", icon=" + this.icon + ", blackIcon=" + this.blackIcon + ", iconSelected=" + this.iconSelected + ", execute=" + this.execute + ", reportTag=" + this.reportTag + ", marker=" + this.marker + ", editEnable=" + this.editEnable + ", groupTag=" + this.groupTag + ", groupName=" + this.groupName + ", childMenus=" + this.childMenus + ", extraCondition=" + this.extraCondition + ")";
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
