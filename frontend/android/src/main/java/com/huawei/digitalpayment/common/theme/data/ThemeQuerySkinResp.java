package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/ThemeQuerySkinResp;", "Lcom/huawei/http/BaseResp;", "themeList", "", "Lcom/huawei/digitalpayment/common/theme/data/SkinInfoResp;", "<init>", "(Ljava/util/List;)V", "getThemeList", "()Ljava/util/List;", "setThemeList", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemeQuerySkinResp extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private List<? extends SkinInfoResp> themeList;

    public ThemeQuerySkinResp(List<? extends SkinInfoResp> list) {
        this.themeList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemeQuerySkinResp(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2;
            int i3 = i2 + 61;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            list = null;
        }
        this(list);
    }

    public final List<SkinInfoResp> getThemeList() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.themeList;
        int i4 = i3 + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final void setThemeList(List<? extends SkinInfoResp> list) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.themeList = list;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeQuerySkinResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
