package com.huawei.digitalpayment.home.theme;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.CurrencyConfigManager;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.data.source.remote.FilterConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002¨\u0006\t"}, d2 = {"refreshLocalHomeFunction", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "functionDefine", "", "", "isFilterByCurrencyConfig", "", "function", "ConsumerHomeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HomeThemeKt {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    public static final List<LocalHomeFunction> refreshLocalHomeFunction(List<LocalHomeFunction> list, Map<String, LocalHomeFunction> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        ArrayList arrayList = new ArrayList();
        for (LocalHomeFunction localHomeFunction : list) {
            int i2 = ShareDataUIState + 63;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            LocalHomeFunction localHomeFunction2 = map.get(localHomeFunction.getFuncId());
            if (localHomeFunction2 != null) {
                localHomeFunction.fillEmptyWithOther(localHomeFunction2);
                List<LocalHomeFunction> childMenus = localHomeFunction.getChildMenus();
                if ((childMenus == null || childMenus.isEmpty()) && localHomeFunction2.getChildMenus() != null) {
                    List<LocalHomeFunction> childMenus2 = localHomeFunction2.getChildMenus();
                    Intrinsics.checkNotNull(childMenus2);
                    for (LocalHomeFunction localHomeFunction3 : childMenus2) {
                        int i4 = component3 + 13;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        LocalHomeFunction localHomeFunction4 = map.get(localHomeFunction3.getFuncId());
                        if (localHomeFunction4 != null) {
                            localHomeFunction3.fillEmptyWithOther(localHomeFunction4);
                        }
                    }
                    localHomeFunction.setChildMenus(localHomeFunction2.getChildMenus());
                }
                if (!isFilterByCurrencyConfig(localHomeFunction)) {
                    arrayList.add(localHomeFunction);
                }
            }
        }
        return arrayList;
    }

    public static final boolean isFilterByCurrencyConfig(LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localHomeFunction, "");
        String currentCurrencyCode = CurrencyConfigManager.INSTANCE.getCurrentCurrencyCode();
        if (!TextUtils.isEmpty(localHomeFunction.getExtraCondition())) {
            List list = (List) SecureGsonUtils.fromJson(localHomeFunction.getExtraCondition(), new TypeToken<List<? extends FilterConfig>>() {
            }.getType());
            if (CollectionUtils.isEmpty(list)) {
                return false;
            }
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            while (!(!it.hasNext())) {
                FilterConfig filterConfig = (FilterConfig) it.next();
                if (Intrinsics.areEqual(filterConfig.getFilterKey(), "CURRENCY")) {
                    int i2 = ShareDataUIState + 123;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    String str = currentCurrencyCode;
                    if (!TextUtils.isEmpty(str) && !StringsKt.contains$default((CharSequence) filterConfig.getFilterValue(), (CharSequence) str, false, 2, (Object) null)) {
                        int i4 = ShareDataUIState + 15;
                        component3 = i4 % 128;
                        return i4 % 2 != 0;
                    }
                }
            }
        }
        int i5 = component3 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }
}
