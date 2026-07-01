package com.huawei.digitalpayment.form.validator;

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
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static final SparseIntArray component3 = new SparseIntArray(0);
    private static int copydefault;

    static {
        int i = component2 + 49;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
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
            int r0 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault = r1
            int r0 = r0 % r3
            if (r0 == 0) goto L1b
            android.util.SparseIntArray r0 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.component3
            int r5 = r0.get(r5)
            r0 = 17
            int r0 = r0 / 0
            if (r5 <= 0) goto L45
            goto L23
        L1b:
            android.util.SparseIntArray r0 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.component3
            int r5 = r0.get(r5)
            if (r5 <= 0) goto L45
        L23:
            int r5 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault
            int r5 = r5 + 113
            int r0 = r5 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState = r0
            int r5 = r5 % r3
            java.lang.Object r4 = r4.getTag()
            if (r4 == 0) goto L3c
            int r4 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState
            int r4 = r4 + 75
            int r5 = r4 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault = r5
            int r4 = r4 % r3
            goto L45
        L3c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "view must have a tag"
            r3.<init>(r4)
            throw r3
        L45:
            int r4 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState = r5
            int r4 = r4 % r3
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.getDataBinder(androidx.databinding.DataBindingComponent, android.view.View, int):androidx.databinding.ViewDataBinding");
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (viewArr == null || viewArr.length == 0 || component3.get(i) <= 0) {
            return null;
        }
        int i5 = copydefault + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        if (viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == null) goto L8;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getLayoutId(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L14
            if (r4 != 0) goto L12
            goto L16
        L12:
            r2 = 1
            goto L17
        L14:
            if (r4 != 0) goto L17
        L16:
            return r2
        L17:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.component1.copydefault
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L2b
            int r4 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault
            int r4 = r4 + 105
            int r1 = r4 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState = r1
            int r4 = r4 % r0
            goto L2f
        L2b:
            int r2 = r4.intValue()
        L2f:
            int r4 = com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.ShareDataUIState
            int r4 = r4 + 21
            int r1 = r4 % 128
            com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.copydefault = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L3b
            return r2
        L3b:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.DataBinderMapperImpl.getLayoutId(java.lang.String):int");
    }

    @Override
    public String convertBrIdToString(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = copydefault.component1.get(i);
        int i5 = copydefault + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.huawei.arouter.DataBinderMapperImpl());
        arrayList.add(new com.huawei.common.DataBinderMapperImpl());
        arrayList.add(new com.huawei.http.DataBinderMapperImpl());
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }

    static class copydefault {
        static final SparseArray<String> component1;
        private static int component2 = 1;
        private static int component3;

        private copydefault() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            component1 = sparseArray;
            sparseArray.put(0, "_all");
            int i = component2 + 121;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    static class component1 {
        private static int component2 = 1;
        private static int component3;
        static final HashMap<String, Integer> copydefault = new HashMap<>(0);

        private component1() {
        }

        static {
            int i = component3 + 115;
            component2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
