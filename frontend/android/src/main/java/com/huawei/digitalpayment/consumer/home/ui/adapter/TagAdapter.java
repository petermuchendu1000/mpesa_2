package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.view.View;
import com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public abstract class TagAdapter<T> {
    private static int component1 = 1;
    private static int copydefault;
    private List<T> ShareDataUIState;

    @Deprecated
    private HashSet<Integer> component2 = new HashSet<>();
    private OnDataChangedListener component3;

    public interface OnDataChangedListener {
        void onChanged();
    }

    public abstract View getView(TagFlowLayout tagFlowLayout, int i, T t);

    public TagAdapter(List<T> list) {
        this.ShareDataUIState = list;
    }

    public void setData(List<T> list) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = list;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public TagAdapter(T[] tArr) {
        this.ShareDataUIState = new ArrayList(Arrays.asList(tArr));
    }

    public void setOnDataChangedListener(OnDataChangedListener onDataChangedListener) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.component3 = onDataChangedListener;
        int i5 = i3 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Deprecated
    public void setSelectedList(int... iArr) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        int length = iArr.length;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            hashSet.add(Integer.valueOf(iArr[i4]));
            i4++;
            int i5 = copydefault + 99;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        setSelectedList(hashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelectedList(java.util.Set<java.lang.Integer> r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.adapter.TagAdapter.copydefault
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.adapter.TagAdapter.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            java.util.HashSet<java.lang.Integer> r1 = r3.component2
            r1.clear()
            r1 = 44
            int r1 = r1 / 0
            if (r4 == 0) goto L26
            goto L21
        L1a:
            java.util.HashSet<java.lang.Integer> r1 = r3.component2
            r1.clear()
            if (r4 == 0) goto L26
        L21:
            java.util.HashSet<java.lang.Integer> r1 = r3.component2
            r1.addAll(r4)
        L26:
            r3.notifyDataChanged()
            int r4 = com.huawei.digitalpayment.consumer.home.ui.adapter.TagAdapter.component1
            int r4 = r4 + 71
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.adapter.TagAdapter.copydefault = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L38
            r4 = 16
            int r4 = r4 / 0
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.adapter.TagAdapter.setSelectedList(java.util.Set):void");
    }

    @Deprecated
    public HashSet<Integer> getPreCheckedList() {
        HashSet<Integer> hashSet;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            hashSet = this.component2;
            int i4 = 69 / 0;
        } else {
            hashSet = this.component2;
        }
        int i5 = i2 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return hashSet;
    }

    public int getCount() {
        int size;
        int i = 2 % 2;
        List<T> list = this.ShareDataUIState;
        if (list == null) {
            int i2 = component1 + 91;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            size = 0;
        } else {
            size = list.size();
        }
        int i4 = component1 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        throw null;
    }

    public void notifyDataChanged() {
        int i = 2 % 2;
        OnDataChangedListener onDataChangedListener = this.component3;
        if (onDataChangedListener != null) {
            int i2 = copydefault + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            onDataChangedListener.onChanged();
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = copydefault + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public T getItem(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<T> list = this.ShareDataUIState;
        if (i4 == 0) {
            return list.get(i);
        }
        list.get(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onSelected(int i, View view) {
        int i2 = 2 % 2;
        int i3 = component1 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean setSelected(int i, T t) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 97;
        copydefault = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void unSelected(int i, View view) {
        int i2 = 2 % 2;
        int i3 = component1 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }
}
