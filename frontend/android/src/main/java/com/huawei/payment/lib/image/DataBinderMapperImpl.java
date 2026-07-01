package com.huawei.payment.lib.image;

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
    private static final SparseIntArray component3 = new SparseIntArray(0);

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (component3.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || component3.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = component3.copydefault.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override
    public String convertBrIdToString(int i) {
        return component1.component3.get(i);
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.huawei.common.DataBinderMapperImpl());
        return arrayList;
    }

    static class component1 {
        static final SparseArray<String> component3;

        private component1() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            component3 = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    static class component3 {
        static final HashMap<String, Integer> copydefault = new HashMap<>(0);

        private component3() {
        }
    }
}
