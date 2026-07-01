package com.huawei.digitalpayment.consumer.home.extend;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtendMgr;", "", "<init>", "()V", "extendMap", "", "", "Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend;", "getExtendByFunId", "funcId", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyFunctionExtendMgr {
    public static final int $stable;
    public static final MyFunctionExtendMgr INSTANCE = new MyFunctionExtendMgr();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static final Map<String, MyFunctionExtend> component3;
    private static int copydefault = 1;

    private MyFunctionExtendMgr() {
    }

    static {
        HashMap map = new HashMap();
        component3 = map;
        map.put(ChangeLanguageExtend.FUNC_ID, new ChangeLanguageExtend());
        $stable = 8;
        int i = ShareDataUIState + 7;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public final MyFunctionExtend getExtendByFunId(String funcId) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultExtend defaultExtend = component3.get(funcId);
        if (defaultExtend == null) {
            defaultExtend = new DefaultExtend();
        }
        int i4 = copydefault + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return defaultExtend;
    }
}
