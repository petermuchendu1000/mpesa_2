package com.huawei.payment.mvvm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.payment.mvvm.databinding.CommonToolbarBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray component1;
    private static final int component3 = 1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        component1 = sparseIntArray;
        sparseIntArray.put(R.layout.common_toolbar, 1);
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = component1.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/common_toolbar_0".equals(tag)) {
            return new CommonToolbarBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for common_toolbar is invalid. Received: " + tag);
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || component1.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = component3.component3.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override
    public String convertBrIdToString(int i) {
        return component2.ShareDataUIState.get(i);
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.huawei.common.DataBinderMapperImpl());
        return arrayList;
    }

    static class component2 {
        static final SparseArray<String> ShareDataUIState;

        private component2() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            ShareDataUIState = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    static class component3 {
        static final HashMap<String, Integer> component3;

        private component3() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            component3 = map;
            map.put("layout/common_toolbar_0", Integer.valueOf(R.layout.common_toolbar));
        }
    }
}
