package com.huawei.digitalpayment.home.data.source.locaL;

import com.huawei.digitalpayment.home.theme.HomeThemeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¨\u0006\t"}, d2 = {"refreshByDefine", "", "groups", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "functionDefine", "", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "ConsumerHomeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LocalHomeConfigKt {
    private static int component2 = 1;
    private static int component3;

    public static final void access$refreshByDefine(List list, Map map) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        refreshByDefine(list, map);
        int i4 = component3 + 119;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    private static final void refreshByDefine(List<LocalFunctionGroup> list, Map<String, LocalHomeFunction> map) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            list.iterator();
            throw null;
        }
        for (LocalFunctionGroup localFunctionGroup : list) {
            int i3 = component3 + 123;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            List<LocalHomeFunction> list2 = localFunctionGroup.getList();
            if (list2 != null) {
                int i5 = component3 + 43;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                localFunctionGroup.setList(HomeThemeKt.refreshLocalHomeFunction(list2, map));
            }
        }
    }
}
