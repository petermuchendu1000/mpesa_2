package com.huawei.digitalpayment.mobileapp.report;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray ShareDataUIState = new SparseIntArray(0);
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    static {
        int i = component2 + 109;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.component3
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.copydefault = r1
            int r0 = r0 % r3
            if (r0 == 0) goto L1b
            android.util.SparseIntArray r0 = com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.ShareDataUIState
            int r5 = r0.get(r5)
            r0 = 41
            int r0 = r0 / 0
            if (r5 <= 0) goto L3c
            goto L23
        L1b:
            android.util.SparseIntArray r0 = com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.ShareDataUIState
            int r5 = r0.get(r5)
            if (r5 <= 0) goto L3c
        L23:
            java.lang.Object r4 = r4.getTag()
            if (r4 == 0) goto L33
            int r4 = com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.copydefault
            int r4 = r4 + 103
            int r5 = r4 % 128
            com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.component3 = r5
            int r4 = r4 % r3
            goto L3c
        L33:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "view must have a tag"
            r3.<init>(r4)
            throw r3
        L3c:
            int r4 = com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.component3
            int r4 = r4 + 33
            int r5 = r4 % 128
            com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.copydefault = r5
            int r4 = r4 % r3
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl.getDataBinder(androidx.databinding.DataBindingComponent, android.view.View, int):androidx.databinding.ViewDataBinding");
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (viewArr != null) {
            int i6 = i3 + 59;
            int i7 = i6 % 128;
            component3 = i7;
            if (i6 % 2 == 0) {
                int length = viewArr.length;
                obj.hashCode();
                throw null;
            }
            if (viewArr.length == 0) {
                int i8 = i7 + 17;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            } else if (ShareDataUIState.get(i) > 0) {
                int i10 = component3 + 119;
                copydefault = i10 % 128;
                int i11 = i10 % 2;
                if (viewArr[0].getTag() == null) {
                    throw new RuntimeException("view must have a tag");
                }
            }
        }
        return null;
    }

    @Override
    public int getLayoutId(String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = component3 + 11;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = component1.copydefault.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i3 = component3 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }

    @Override
    public String convertBrIdToString(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 119;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            copydefault.component1.get(i);
            throw null;
        }
        String str = copydefault.component1.get(i);
        int i4 = copydefault + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.huawei.arouter.DataBinderMapperImpl());
        arrayList.add(new com.huawei.common.DataBinderMapperImpl());
        arrayList.add(new com.huawei.http.DataBinderMapperImpl());
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return arrayList;
    }

    static class copydefault {
        static final SparseArray<String> component1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            component1 = sparseArray;
            sparseArray.put(0, "_all");
            int i = component3 + 103;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }

    static class component1 {
        private static int ShareDataUIState = 1;
        private static int component3;
        static final HashMap<String, Integer> copydefault = new HashMap<>(0);

        private component1() {
        }

        static {
            int i = component3 + 125;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
