package com.huawei.http;

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
        if (str == null || (num = component2.ShareDataUIState.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override
    public String convertBrIdToString(int i) {
        return copydefault.ShareDataUIState.get(i);
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.huawei.arouter.DataBinderMapperImpl());
        arrayList.add(new com.huawei.common.DataBinderMapperImpl());
        return arrayList;
    }

    static class copydefault {
        static final SparseArray<String> ShareDataUIState;

        private copydefault() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            ShareDataUIState = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    static class component2 {
        static final HashMap<String, Integer> ShareDataUIState = new HashMap<>(0);

        private component2() {
        }
    }
}
