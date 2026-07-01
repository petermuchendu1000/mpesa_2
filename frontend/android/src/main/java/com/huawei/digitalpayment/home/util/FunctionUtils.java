package com.huawei.digitalpayment.home.util;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.home.data.source.locaL.TimeRange;
import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class FunctionUtils {
    private static int component1 = 0;
    private static int component2 = 1;

    private FunctionUtils() {
    }

    @Nullable
    public static RemoteHomeFunction fillWithDefine(RemoteHomeFunction remoteHomeFunction, Map<String, RemoteHomeFunction> map) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (remoteHomeFunction == null) {
            return null;
        }
        RemoteHomeFunction remoteHomeFunction2 = map.get(remoteHomeFunction.getFuncId());
        if (remoteHomeFunction2 != null) {
            remoteHomeFunction.fillEmptyWithOther(remoteHomeFunction2);
            return remoteHomeFunction;
        }
        int i4 = component2 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static <T extends TimeRange> List<T> filterByTimeRange(List<T> list) {
        int i = 2 % 2;
        long j = Long.parseLong(TimeUtils.getServerTime());
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (T t : list) {
            try {
                String strTimeStart = t.timeStart();
                String strTimeEnd = t.timeEnd();
                if (TextUtils.isEmpty(strTimeStart) || TextUtils.isEmpty(strTimeEnd)) {
                    arrayList.add(t);
                } else {
                    long j2 = Long.parseLong(strTimeStart);
                    long j3 = Long.parseLong(strTimeEnd);
                    if (j2 <= j) {
                        int i2 = component1 + 95;
                        int i3 = i2 % 128;
                        component2 = i3;
                        int i4 = i2 % 2;
                        if (j <= j3) {
                            int i5 = i3 + 83;
                            component1 = i5 % 128;
                            int i6 = i5 % 2;
                            arrayList.add(t);
                            int i7 = component2 + 71;
                            component1 = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                }
            } catch (Exception e) {
                L.e(e.toString());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void execute(com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.util.FunctionUtils.component1
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.util.FunctionUtils.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            java.lang.String r1 = r4.getExecute()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 41
            int r2 = r2 / 0
            if (r1 != 0) goto L45
            goto L27
        L1d:
            java.lang.String r1 = r4.getExecute()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L45
        L27:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r0)
            java.lang.String r2 = "FUNCTION_ICON"
            java.lang.String r3 = r4.getFunIcon()
            r1.putString(r2, r3)
            java.lang.String r2 = "FUNCTION_NAME"
            java.lang.String r3 = r4.getFuncName()
            r1.putString(r2, r3)
            java.lang.String r4 = r4.getExecute()
            com.huawei.arouter.RouteUtils.routeWithExecute(r4, r1)
        L45:
            int r4 = com.huawei.digitalpayment.home.util.FunctionUtils.component1
            int r4 = r4 + 57
            int r1 = r4 % 128
            com.huawei.digitalpayment.home.util.FunctionUtils.component2 = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L51
            return
        L51:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.util.FunctionUtils.execute(com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction):void");
    }
}
