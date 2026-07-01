package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.ColorUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.widget.input.MenuView;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.digitalpayment.home.data.HomeConfigManager;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.util.FunctionUtils;
import com.huawei.image.util.GlideUtils;

public class LifeFunctionAdapter extends BaseLifeFunctionAdapter {
    private static int component2 = 1;
    private static int copydefault;

    public LifeFunctionAdapter(int i) {
        super(i);
    }

    private static void copydefault(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FunctionUtils.execute(localHomeFunction);
        int i4 = copydefault + 17;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, MenuView menuView, final LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            super.convert(baseViewHolder, menuView, localHomeFunction);
            String host = SafeUri.getHost(localHomeFunction.getExecute());
            if (HomeConstants.LIFE_EXECUTE.equals(localHomeFunction.getExecute()) || RoutePathConstants.MACLE_MINI_APP_LIST.equals(localHomeFunction.getExecute())) {
                menuView.getFunctionIcon().setColorFilter(ColorUtils.getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
            } else {
                menuView.getFunctionIcon().clearColorFilter();
                int i3 = component2 + 117;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
            menuView.getFunctionName().setText(HomeConfigManager.INSTANCE.getMiniAppNameById(host, localHomeFunction.getFuncName()));
            if (TextUtils.isEmpty(localHomeFunction.getMarker())) {
                int i5 = component2 + 19;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                menuView.getFunctionMarker().setVisibility(8);
                menuView.getFunctionRedDot().setVisibility(8);
            } else if (localHomeFunction.getMarker().startsWith("http")) {
                menuView.getFunctionMarker().setVisibility(0);
                GlideUtils.setFunctionIcon(menuView.getFunctionMarker(), localHomeFunction.getMarker());
            } else {
                menuView.getFunctionRedDot().setVisibility(0);
                menuView.getFunctionRedDot().setText(localHomeFunction.getMarker());
                int i7 = copydefault + 101;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
            menuView.setOnClickListener(new View.OnClickListener() {
                private static int component3 = 1;
                private static int copydefault;

                @Override
                public final void onClick(View view) {
                    int i9 = 2 % 2;
                    int i10 = component3 + 75;
                    copydefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        LifeFunctionAdapter.$r8$lambda$SWgJHSENn9oblGVk5mGs9ewKpCQ(localHomeFunction, view);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    LifeFunctionAdapter.$r8$lambda$SWgJHSENn9oblGVk5mGs9ewKpCQ(localHomeFunction, view);
                    int i11 = copydefault + 123;
                    component3 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 65 / 0;
                    }
                }
            });
            return;
        }
        super.convert(baseViewHolder, menuView, localHomeFunction);
        SafeUri.getHost(localHomeFunction.getExecute());
        HomeConstants.LIFE_EXECUTE.equals(localHomeFunction.getExecute());
        throw null;
    }

    public static void $r8$lambda$SWgJHSENn9oblGVk5mGs9ewKpCQ(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        component3(localHomeFunction, view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component2 + 103;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void component3(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            copydefault(localHomeFunction, view);
            Callback.onClick_exit();
            int i4 = component2 + 101;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
