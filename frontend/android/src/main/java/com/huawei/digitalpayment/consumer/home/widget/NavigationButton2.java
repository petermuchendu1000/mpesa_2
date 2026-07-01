package com.huawei.digitalpayment.consumer.home.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.image.util.GlideUtils;

public class NavigationButton2 extends FrameLayout {
    private static int component1 = 0;
    private static int component3 = 1;
    private ImageView mIconView;

    public NavigationButton2(Context context) {
        super(context);
        init();
    }

    public NavigationButton2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public NavigationButton2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public NavigationButton2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public final void init() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater.from(getContext()).inflate(R.layout.home_nav_item2, (ViewGroup) this, true);
        this.mIconView = (ImageView) findViewById(R.id.nav_iv_icon);
        int i4 = component1 + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void init(String str) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        GlideUtils.setFunctionIcon(this.mIconView, str);
        int i4 = component3 + 107;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setIcon(String str) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideUtils.setFunctionIcon(this.mIconView, str);
        int i4 = component3 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
