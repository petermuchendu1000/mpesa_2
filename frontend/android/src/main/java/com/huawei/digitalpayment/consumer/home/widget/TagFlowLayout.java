package com.huawei.digitalpayment.consumer.home.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.ConvertUtils;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.internal.FlowLayout;
import com.huawei.digitalpayment.consumer.home.ui.adapter.TagAdapter;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.hms.common.util.Logger;
import com.safaricom.mpesa.logging.L;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TagFlowLayout extends FlowLayout implements TagAdapter.OnDataChangedListener {
    private static final String KEY_CHOOSE_POS = "key_choose_pos";
    private static final String KEY_DEFAULT = "key_default";
    private static final String TAG = "TagFlowLayout";
    private static int component2 = 0;
    private static int copydefault = 1;
    private OnLongClickListener onLongClickListener;
    private OnSelectListedener onSelectListener;
    private OnTagClickListener onTagClickListener;
    private int selectedMax;
    private final Set<Integer> selectedView;
    private TagAdapter tagAdapter;

    public interface OnLongClickListener {
        void onLongClick(View view, int i);
    }

    public interface OnSelectListedener {
        void onSelected(Set<Integer> set);
    }

    public interface OnTagClickListener {
        void onTagClick(View view, int i, FlowLayout flowLayout);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectedMax = -1;
        this.selectedView = new HashSet();
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TagFlowLayout);
        this.selectedMax = typedArrayObtainStyledAttributes.getInt(R.styleable.TagFlowLayout_max_select, -1);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = component2 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.selectedMax = -1;
        this.selectedView = new HashSet();
        init(context, attributeSet);
    }

    public TagFlowLayout(Context context) {
        super(context, null, 0);
        this.selectedMax = -1;
        this.selectedView = new HashSet();
        init(context, null);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component2 + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        int childCount = getChildCount();
        int i6 = component2 + 13;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < childCount; i8++) {
            TagView tagView = (TagView) getChildAt(i8);
            if (tagView.getVisibility() != 8 && tagView.getTagView().getVisibility() == 8) {
                tagView.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
        int i9 = component2 + 91;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setOnSelectListener(OnSelectListedener onSelectListedener) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.onSelectListener = onSelectListedener;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setOnTagClickListener(OnTagClickListener onTagClickListener) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.onTagClickListener = onTagClickListener;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.onLongClickListener = onLongClickListener;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 31;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
    }

    public void setAdapter(TagAdapter tagAdapter) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.tagAdapter = tagAdapter;
        tagAdapter.setOnDataChangedListener(this);
        this.selectedView.clear();
        changeAdapter();
        int i4 = copydefault + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    private void lambda$changeAdapter$0(TagView tagView, int i, View view) {
        int i2 = 2 % 2;
        doSelect(tagView, i);
        OnTagClickListener onTagClickListener = this.onTagClickListener;
        if (onTagClickListener != null) {
            int i3 = copydefault + 119;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            onTagClickListener.onTagClick(tagView, i, this);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = copydefault + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private boolean lambda$changeAdapter$1(TagView tagView, int i, View view) {
        int i2 = 2 % 2;
        int i3 = copydefault + 113;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        OnLongClickListener onLongClickListener = this.onLongClickListener;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(tagView, i);
            return true;
        }
        int i6 = i4 + 55;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private void changeAdapter() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        removeAllViews();
        TagAdapter tagAdapter = this.tagAdapter;
        HashSet<Integer> preCheckedList = tagAdapter.getPreCheckedList();
        int i4 = copydefault + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        final int i6 = 0;
        while (i6 < tagAdapter.getCount()) {
            View view = tagAdapter.getView(this, i6, tagAdapter.getItem(i6));
            final TagView tagView = new TagView(getContext());
            view.setDuplicateParentStateEnabled(true);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(ConvertUtils.dp2px(10.0f), ConvertUtils.dp2px(5.0f), ConvertUtils.dp2px(5.0f), ConvertUtils.dp2px(5.0f));
            tagView.setLayoutParams(marginLayoutParams);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            tagView.addView(view);
            addView(tagView);
            if (preCheckedList.contains(Integer.valueOf(i6))) {
                int i7 = copydefault + 55;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                setChildChecked(i6, tagView);
            }
            if (this.tagAdapter.setSelected(i6, tagAdapter.getItem(i6))) {
                setChildChecked(i6, tagView);
            }
            view.setClickable(false);
            tagView.setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view2) {
                    int i9 = 2 % 2;
                    int i10 = ShareDataUIState + 61;
                    component3 = i10 % 128;
                    int i11 = i10 % 2;
                    TagFlowLayout.$r8$lambda$zIUepaa0XG5fP2R7sLWif_YaHXk(this.f$0, tagView, i6, view2);
                    int i12 = component3 + 89;
                    ShareDataUIState = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                }
            });
            tagView.setOnLongClickListener(new TagFlowLayout$$ExternalSyntheticLambda1(this, tagView, i6));
            i6++;
            int i9 = component2 + 25;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
        this.selectedView.addAll(preCheckedList);
    }

    public void setMaxSelectCount(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this.selectedView.size() > i) {
            L.INSTANCE.w(TAG, "you has already select more than " + i + " views , so it will be clear .", new Object[0]);
            this.selectedView.clear();
        }
        this.selectedMax = i;
        int i5 = component2 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
    }

    public Set<Integer> getSelectedList() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(this.selectedView);
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    private void setChildChecked(int i, TagView tagView) {
        int i2 = 2 % 2;
        int i3 = component2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        tagView.setChecked(true);
        this.tagAdapter.onSelected(i, tagView.getTagView());
    }

    private void setChildUnChecked(int i, TagView tagView) {
        int i2 = 2 % 2;
        int i3 = copydefault + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        tagView.setChecked(false);
        this.tagAdapter.unSelected(i, tagView.getTagView());
        int i5 = component2 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doSelect(com.huawei.digitalpayment.consumer.home.widget.TagView r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r5.isChecked()
            if (r1 != 0) goto L79
            int r1 = r4.selectedMax
            r2 = 1
            if (r1 != r2) goto L4e
            java.util.Set<java.lang.Integer> r1 = r4.selectedView
            int r1 = r1.size()
            if (r1 != r2) goto L4e
            java.util.Set<java.lang.Integer> r1 = r4.selectedView
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            android.view.View r2 = r4.getChildAt(r2)
            com.huawei.digitalpayment.consumer.home.widget.TagView r2 = (com.huawei.digitalpayment.consumer.home.widget.TagView) r2
            int r3 = r1.intValue()
            r4.setChildUnChecked(r3, r2)
            r4.setChildChecked(r6, r5)
            java.util.Set<java.lang.Integer> r5 = r4.selectedView
            r5.remove(r1)
            java.util.Set<java.lang.Integer> r5 = r4.selectedView
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            int r5 = com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout.copydefault
            int r5 = r5 + 23
        L48:
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout.component2 = r6
            int r5 = r5 % r0
            goto L8a
        L4e:
            int r1 = r4.selectedMax
            if (r1 <= 0) goto L6c
            java.util.Set<java.lang.Integer> r1 = r4.selectedView
            int r1 = r1.size()
            int r2 = r4.selectedMax
            if (r1 < r2) goto L6c
            int r5 = com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout.component2
            int r5 = r5 + 91
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L6b
            r5 = 39
            int r5 = r5 / 0
        L6b:
            return
        L6c:
            r4.setChildChecked(r6, r5)
            java.util.Set<java.lang.Integer> r5 = r4.selectedView
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L8a
        L79:
            r4.setChildUnChecked(r6, r5)
            java.util.Set<java.lang.Integer> r5 = r4.selectedView
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.remove(r6)
            int r5 = com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout.copydefault
            int r5 = r5 + 21
            goto L48
        L8a:
            com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout$OnSelectListedener r5 = r4.onSelectListener
            if (r5 == 0) goto L98
            java.util.HashSet r6 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r0 = r4.selectedView
            r6.<init>(r0)
            r5.onSelected(r6)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.widget.TagFlowLayout.doSelect(com.huawei.digitalpayment.consumer.home.widget.TagView, int):void");
    }

    public TagAdapter getAdapter() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        TagAdapter tagAdapter = this.tagAdapter;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return tagAdapter;
        }
        throw null;
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        String strSubstring;
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_DEFAULT, super.onSaveInstanceState());
        if (this.selectedView.isEmpty()) {
            strSubstring = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<Integer> it = this.selectedView.iterator();
            int i2 = component2 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            while (!(!it.hasNext())) {
                int i4 = copydefault + 117;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    sb.append(it.next().intValue());
                    sb.append(Logger.f2811c);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                sb.append(it.next().intValue());
                sb.append(Logger.f2811c);
            }
            strSubstring = sb.substring(0, sb.length() - 1);
        }
        bundle.putString(KEY_CHOOSE_POS, strSubstring);
        return bundle;
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        String[] strArrSplit;
        int length;
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = parcelable instanceof Bundle;
            throw null;
        }
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        String string = bundle.getString(KEY_CHOOSE_POS);
        if (!TextUtils.isEmpty(string)) {
            int i3 = component2 + 9;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                strArrSplit = string.split("\\|");
                length = strArrSplit.length;
            } else {
                strArrSplit = string.split("\\|");
                length = strArrSplit.length;
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = copydefault + 67;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = Integer.parseInt(strArrSplit[i4]);
                    this.selectedView.add(Integer.valueOf(i6));
                    throw null;
                }
                int i7 = Integer.parseInt(strArrSplit[i4]);
                this.selectedView.add(Integer.valueOf(i7));
                TagView tagView = (TagView) getChildAt(i7);
                if (tagView != null) {
                    setChildChecked(i7, tagView);
                }
            }
        }
        super.onRestoreInstanceState(bundle.getParcelable(KEY_DEFAULT));
    }

    @Override
    public void onChanged() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.selectedView.clear();
            changeAdapter();
        } else {
            this.selectedView.clear();
            changeAdapter();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static int dip2px(Context context, float f) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (i3 == 0 ? (f + displayMetrics.density) % 0.5f : (f * displayMetrics.density) + 0.5f);
    }

    public static boolean m10625$r8$lambda$X45vJCz4sR80a6Uhw5yIUfCz80(TagFlowLayout tagFlowLayout, TagView tagView, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean zLambda$changeAdapter$1 = tagFlowLayout.lambda$changeAdapter$1(tagView, i, view);
        int i5 = component2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return zLambda$changeAdapter$1;
    }

    public static void $r8$lambda$zIUepaa0XG5fP2R7sLWif_YaHXk(TagFlowLayout tagFlowLayout, TagView tagView, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        m10626instrumented$0$changeAdapter$V(tagFlowLayout, tagView, i, view);
        int i5 = component2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m10626instrumented$0$changeAdapter$V(TagFlowLayout tagFlowLayout, TagView tagView, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i4 == 0) {
                tagFlowLayout.lambda$changeAdapter$0(tagView, i, view);
                throw null;
            }
            tagFlowLayout.lambda$changeAdapter$0(tagView, i, view);
            Callback.onClick_exit();
            int i5 = copydefault + 93;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }
}
