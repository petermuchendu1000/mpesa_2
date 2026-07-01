package com.huawei.digitalpayment.consumer.baselib.util.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public final class SortUtils {
    private static int component2 = 0;
    private static int copydefault = 1;

    public static <T extends Order> List<T> sortByOrder(List<T> list) {
        int i = 2 % 2;
        if (list == null) {
            int i2 = component2 + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        list.sort(new Comparator() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final int compare(Object obj, Object obj2) {
                int i4 = 2 % 2;
                int i5 = copydefault + 57;
                ShareDataUIState = i5 % 128;
                Order order = (Order) obj;
                Order order2 = (Order) obj2;
                if (i5 % 2 == 0) {
                    return SortUtils.component2(order, order2);
                }
                SortUtils.component2(order, order2);
                throw null;
            }
        });
        int i4 = copydefault + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e A[PHI: r1 r4
  0x001e: PHI (r1v7 java.lang.Integer) = (r1v4 java.lang.Integer), (r1v10 java.lang.Integer) binds: [B:8:0x002c, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r4v10 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v11 java.lang.Integer) binds: [B:8:0x002c, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int component2(com.huawei.digitalpayment.consumer.baselib.util.sort.Order r3, com.huawei.digitalpayment.consumer.baselib.util.sort.Order r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.component2
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.Integer r3 = r3.getSortOrder()
            java.lang.Integer r4 = r4.getSortOrder()
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r3 != 0) goto L30
        L1e:
            r3 = r1
            goto L2f
        L20:
            java.lang.Integer r3 = r3.getSortOrder()
            java.lang.Integer r4 = r4.getSortOrder()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r3 != 0) goto L30
            goto L1e
        L2f:
            r1 = r3
        L30:
            if (r4 != 0) goto L33
            r4 = r1
        L33:
            int r3 = r3.compareTo(r4)
            int r4 = com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.copydefault
            int r4 = r4 + 101
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.component2 = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L45
            r4 = 86
            int r4 = r4 / r2
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.component2(com.huawei.digitalpayment.consumer.baselib.util.sort.Order, com.huawei.digitalpayment.consumer.baselib.util.sort.Order):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static int component2(Map.Entry entry, Map.Entry entry2) {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 1;
        component2 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                int i4 = Integer.parseInt((String) entry.getKey());
                int i5 = Integer.parseInt((String) entry2.getKey());
                i = i4 / i5;
                entry = i5;
            } else {
                int i6 = Integer.parseInt((String) entry.getKey());
                int i7 = Integer.parseInt((String) entry2.getKey());
                i = i6 - i7;
                entry = i7;
            }
            return i;
        } catch (Exception unused) {
            return ((String) entry.getKey()).compareTo((String) entry2.getKey());
        }
    }

    static void component3(Map map, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        map.put((String) entry.getKey(), entry.getValue());
        int i4 = component2 + 53;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <Value> Map<String, Value> sortMapByKey(Map<String, Value> map) {
        int i = 2 % 2;
        if (map == null) {
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Map<String, Value> mapEmptyMap = Collections.emptyMap();
            int i4 = copydefault + 125;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return mapEmptyMap;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        map.entrySet().stream().sorted(new Comparator() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final int compare(Object obj, Object obj2) {
                int i6 = 2 % 2;
                int i7 = component2 + 13;
                component1 = i7 % 128;
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                if (i7 % 2 == 0) {
                    return SortUtils.component2(entry, entry2);
                }
                SortUtils.component2(entry, entry2);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }).forEachOrdered(new Consumer() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void accept(Object obj) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 109;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                SortUtils.component3(linkedHashMap, (Map.Entry) obj);
                if (i8 == 0) {
                    throw null;
                }
            }
        });
        return linkedHashMap;
    }
}
