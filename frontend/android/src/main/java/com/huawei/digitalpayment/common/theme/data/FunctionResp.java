package com.huawei.digitalpayment.common.theme.data;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.http.BaseResp;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u00109\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010:\u001a\u00020\rJ\u0010\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0000J\u0011\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0000H\u0096\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R \u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019¨\u0006@"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "Lcom/huawei/http/BaseResp;", "", "funcId", "", "order", "", "groupName", "groupTag", "funcName", "icon", "blackIcon", "editEnable", "", "added", KeysConstants.KEY_EXECUTE, "marker", "childMenus", "", "extraCondition", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFuncId", "()Ljava/lang/String;", "setFuncId", "(Ljava/lang/String;)V", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGroupName", "setGroupName", "getGroupTag", "setGroupTag", "getFuncName", "setFuncName", "getIcon", "setIcon", "getBlackIcon", "setBlackIcon", "getEditEnable", "()Z", "setEditEnable", "(Z)V", "getAdded", "setAdded", "getExecute", "setExecute", "getMarker", "setMarker", "getChildMenus", "()Ljava/util/List;", "setChildMenus", "(Ljava/util/List;)V", "getExtraCondition", "setExtraCondition", "getIconByStyle", "isLightIcon", "fillEmptyWithOther", "", "function", "compareTo", "other", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FunctionResp extends BaseResp implements Comparable<FunctionResp> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private boolean added;
    private String blackIcon;
    private List<? extends FunctionResp> childMenus;
    private boolean editEnable;
    private String execute;
    private String extraCondition;
    private String funcId;
    private String funcName;
    private String groupName;
    private String groupTag;

    @SerializedName(alternate = {"icon"}, value = "funIcon")
    private String icon;
    private String marker;
    private Integer order;

    @Override
    public int compareTo(FunctionResp functionResp) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iCompareTo2 = compareTo2(functionResp);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return iCompareTo2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FunctionResp(String str, Integer num, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, String str8, List list, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14 = null;
        if ((i & 1) != 0) {
            int i2 = component1 + 23;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 64 / 0;
            }
            str10 = null;
        } else {
            str10 = str;
        }
        Integer num2 = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 49;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            str11 = null;
        } else {
            str11 = str2;
        }
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 79;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str12 = null;
        } else {
            str12 = str3;
        }
        String str15 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            int i9 = 2 % 2;
            str13 = null;
        } else {
            str13 = str5;
        }
        String str16 = (i & 64) != 0 ? null : str6;
        boolean z3 = (i & 128) != 0 ? true : z;
        boolean z4 = (i & 256) == 0 ? z2 : true;
        String str17 = (i & 512) != 0 ? null : str7;
        String str18 = (i & 1024) != 0 ? null : str8;
        List list2 = (i & 2048) != 0 ? null : list;
        if ((i & 4096) != 0) {
            int i10 = 2 % 2;
        } else {
            str14 = str9;
        }
        this(str10, num2, str11, str12, str15, str13, str16, z3, z4, str17, str18, list2, str14);
    }

    public final String getFuncId() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.funcId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFuncId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.funcId = str;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.order;
        int i4 = i3 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final void setOrder(Integer num) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.order = num;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupName;
        }
        throw null;
    }

    public final void setGroupName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.groupName = str;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    public final String getGroupTag() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupTag;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setGroupTag(String str) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.groupTag = str;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
    }

    public final String getFuncName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.funcName;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    public final void setFuncName(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.funcName = str;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.icon;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIcon(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.icon = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    public final String getBlackIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.blackIcon;
        int i4 = i3 + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setBlackIcon(String str) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.blackIcon = str;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final boolean getEditEnable() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.editEnable;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return z;
    }

    public final void setEditEnable(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.editEnable = z;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean getAdded() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.added;
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return z;
    }

    public final void setAdded(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.added = z;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.execute;
        int i4 = i2 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.execute = str;
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
        int i6 = i2 + 57;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final String getMarker() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.marker;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final void setMarker(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.marker = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final List<FunctionResp> getChildMenus() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List list = this.childMenus;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setChildMenus(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.childMenus = list;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getExtraCondition() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.extraCondition;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setExtraCondition(String str) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.extraCondition = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 55;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public FunctionResp(String str, Integer num, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, String str8, List<? extends FunctionResp> list, String str9) {
        this.funcId = str;
        this.order = num;
        this.groupName = str2;
        this.groupTag = str3;
        this.funcName = str4;
        this.icon = str5;
        this.blackIcon = str6;
        this.editEnable = z;
        this.added = z2;
        this.execute = str7;
        this.marker = str8;
        this.childMenus = list;
        this.extraCondition = str9;
    }

    public static String getIconByStyle$default(FunctionResp functionResp, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIconByStyle");
        }
        int i3 = ShareDataUIState + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            z = true;
        }
        String iconByStyle = functionResp.getIconByStyle(z);
        int i5 = component1 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return iconByStyle;
    }

    public final String getIconByStyle(boolean isLightIcon) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (!isLightIcon) {
            String str = this.blackIcon;
            if (str != null) {
                return str;
            }
            int i5 = i2 + 117;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return this.icon;
        }
        int i7 = i2 + 7;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        String str2 = this.icon;
        int i9 = i2 + 117;
        component1 = i9 % 128;
        if (i9 % 2 == 0) {
            return str2;
        }
        int i10 = 2 / 4;
        return str2;
    }

    public final void fillEmptyWithOther(FunctionResp function) {
        int i = 2 % 2;
        Iterator it = ArrayIteratorKt.iterator(getClass().getDeclaredFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (Intrinsics.areEqual(field.getType(), String.class)) {
                try {
                    String str = (String) field.get(this);
                    if (str != null) {
                        int i2 = component1 + 31;
                        ShareDataUIState = i2 % 128;
                        if (i2 % 2 == 0) {
                            str.length();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (str.length() == 0) {
                        }
                    }
                    field.set(this, (String) field.get(function));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        int i3 = component1 + 81;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
    }

    public int compareTo2(FunctionResp other) {
        int iIntValue;
        int iIntValue2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(other, "");
        Integer num = this.order;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int i2 = component1 + 57;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 4;
            }
            iIntValue = 0;
        }
        Integer num2 = other.order;
        if (num2 != null) {
            int i4 = ShareDataUIState + 103;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                iIntValue2 = num2.intValue();
                int i5 = 8 / 0;
            } else {
                iIntValue2 = num2.intValue();
            }
        } else {
            iIntValue2 = 0;
        }
        int iCompare = Intrinsics.compare(iIntValue, iIntValue2);
        int i6 = component1 + 91;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
        return iCompare;
    }

    public FunctionResp() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, HmsScanBase.ALL_SCAN_TYPE, null);
    }
}
