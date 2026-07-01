package com.huawei.digitalpayment.consumer.base.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class DataDictMapUtils {
    private static int ShareDataUIState = 1;
    private static int component3;

    public static String getKeyWithValue(Map<String, String> map, String str) {
        int i = 2 % 2;
        if (map == null) {
            return "";
        }
        for (String str2 : map.keySet()) {
            int i2 = ShareDataUIState + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            if (!(!str.equals(map.get(str2)))) {
                int i4 = ShareDataUIState + 125;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return str2;
            }
        }
        return "";
    }

    public static String[] getValuesArrays(Map<String, String> map) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            int i2 = component3 + 91;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return new String[1];
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            int i4 = component3 + 41;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList.add(map.get(it.next()));
                throw null;
            }
            arrayList.add(map.get(it.next()));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        int i5 = component3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return strArr;
    }
}
