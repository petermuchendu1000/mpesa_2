package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.view.View;
import com.blankj.utilcode.util.ColorUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.input.MenuView;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;

public class LifeFunctionEditAdapter extends BaseLifeFunctionAdapter {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final List<LocalHomeFunction> ShareDataUIState;

    public LifeFunctionEditAdapter(int i, List<LocalHomeFunction> list) {
        super(i);
        this.ShareDataUIState = list;
    }

    private void copydefault(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            getMOnItemClickListener();
            throw null;
        }
        if (getMOnItemClickListener() != null) {
            getMOnItemClickListener().onItemClick(this, view, getItemPosition(localHomeFunction));
        }
        int i3 = component1 + 93;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, MenuView menuView, final LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        super.convert(baseViewHolder, menuView, localHomeFunction);
        Object obj = null;
        if (!component2(localHomeFunction)) {
            menuView.getFunctionMarker().setVisibility(0);
            menuView.getFunctionMarker().setImageResource(R.mipmap.base_icon_add1);
            menuView.getFunctionMarker().setColorFilter(ColorUtils.getColor(R.color.colorPrimary));
            menuView.setOnClickListener(new View.OnClickListener() {
                private static int component2 = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 77;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    LifeFunctionEditAdapter.m10487$r8$lambda$AP9yS0T412vUWOZVyu1S5zU8ZE(this.f$0, localHomeFunction, view);
                    int i5 = component2 + 45;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = component1 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            menuView.getFunctionMarker().setVisibility(8);
            menuView.setOnClickListener(null);
        }
        int i4 = component1 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private boolean component2(LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = this.ShareDataUIState.contains(localHomeFunction);
        int i4 = copydefault + 61;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    public static void m10487$r8$lambda$AP9yS0T412vUWOZVyu1S5zU8ZE(LifeFunctionEditAdapter lifeFunctionEditAdapter, LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component1(lifeFunctionEditAdapter, localHomeFunction, view);
        if (i3 != 0) {
            throw null;
        }
    }

    private static void component1(LifeFunctionEditAdapter lifeFunctionEditAdapter, LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                lifeFunctionEditAdapter.copydefault(localHomeFunction, view);
                throw null;
            }
            lifeFunctionEditAdapter.copydefault(localHomeFunction, view);
            Callback.onClick_exit();
            int i4 = component1 + 47;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }
}
