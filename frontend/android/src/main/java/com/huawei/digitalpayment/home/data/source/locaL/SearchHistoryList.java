package com.huawei.digitalpayment.home.data.source.locaL;

import com.huawei.common.util.L;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchHistoryList {
    private static int component1 = 0;
    private static int component3 = 1;
    private List<LocalHomeFunction> homeFunctions;

    public List<LocalHomeFunction> getHomeFunctions() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ensureListEnable();
        List<LocalHomeFunction> list = this.homeFunctions;
        int i4 = component3 + 17;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setHomeFunctions(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.homeFunctions = list;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void ensureListEnable() {
        int i = 2 % 2;
        if (this.homeFunctions == null) {
            this.homeFunctions = new ArrayList();
            int i2 = component3 + 97;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component3 + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static boolean lambda$addFunction$0(LocalHomeFunction localHomeFunction, LocalHomeFunction localHomeFunction2) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = localHomeFunction2.getFuncName().equals(localHomeFunction.getFuncName());
        int i4 = component3 + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return zEquals;
    }

    public void addFunction(final LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        ensureListEnable();
        if (this.homeFunctions.removeIf(new Predicate() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 65;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                LocalHomeFunction localHomeFunction2 = localHomeFunction;
                LocalHomeFunction localHomeFunction3 = (LocalHomeFunction) obj;
                if (i4 == 0) {
                    return SearchHistoryList.lambda$addFunction$0(localHomeFunction2, localHomeFunction3);
                }
                boolean zLambda$addFunction$0 = SearchHistoryList.lambda$addFunction$0(localHomeFunction2, localHomeFunction3);
                int i5 = 71 / 0;
                return zLambda$addFunction$0;
            }
        })) {
            L.d("SearchHistoryListTag", "确认有移除 " + localHomeFunction.getFuncName());
            int i2 = component1 + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        this.homeFunctions.add(0, localHomeFunction);
        if (this.homeFunctions.size() > 10) {
            int i4 = component1 + 23;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            this.homeFunctions = this.homeFunctions.subList(0, 10);
        }
    }
}
