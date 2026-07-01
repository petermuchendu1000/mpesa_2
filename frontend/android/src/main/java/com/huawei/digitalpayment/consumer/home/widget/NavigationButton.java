package com.huawei.digitalpayment.consumer.home.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.theme.HomeThemeManager;
import com.huawei.digitalpayment.home.theme.data.local.NavigationConfig;

public class NavigationButton extends FrameLayout {
    private static int component2 = 0;
    private static int copydefault = 1;
    private NavigationConfig config;
    private ImageView mIconRedDot;
    private ImageView mIconView;
    private TextView mTitleMarker;
    private TextView mTitleView;
    private int position;

    public NavigationButton(Context context) {
        super(context);
        init();
    }

    public NavigationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public NavigationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public NavigationButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public final void init() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater.from(getContext()).inflate(R.layout.home_nav_item, (ViewGroup) this, true);
        this.mIconView = (ImageView) findViewById(R.id.nav_iv_icon);
        this.mTitleView = (TextView) findViewById(R.id.nav_tv_title);
        TextView textView = (TextView) findViewById(R.id.nav_marker_text);
        this.mTitleMarker = textView;
        textView.setVisibility(8);
        this.mIconRedDot = (ImageView) findViewById(R.id.nav_new_icon);
        int i4 = component2 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r0 = 2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r3.mTitleMarker.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r4)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r3.mTitleMarker.setVisibility(8);
        r4 = com.huawei.digitalpayment.consumer.home.widget.NavigationButton.copydefault + 103;
        com.huawei.digitalpayment.consumer.home.widget.NavigationButton.component2 = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setMarker(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.widget.NavigationButton.copydefault
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.widget.NavigationButton.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L20
            android.widget.TextView r1 = r3.mTitleMarker
            r1.setText(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r1 = 45
            int r1 = r1 / r2
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == r1) goto L40
            goto L2b
        L20:
            android.widget.TextView r1 = r3.mTitleMarker
            r1.setText(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L40
        L2b:
            android.widget.TextView r4 = r3.mTitleMarker
            r1 = 8
            r4.setVisibility(r1)
            int r4 = com.huawei.digitalpayment.consumer.home.widget.NavigationButton.copydefault
            int r4 = r4 + 103
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.home.widget.NavigationButton.component2 = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L45
            int r0 = r0 % 5
            goto L45
        L40:
            android.widget.TextView r4 = r3.mTitleMarker
            r4.setVisibility(r2)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.widget.NavigationButton.setMarker(java.lang.String):void");
    }

    public void showRedDot() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.mIconRedDot.setVisibility(0);
        int i4 = component2 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void hideRedDot() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.mIconRedDot.setVisibility(2);
        } else {
            this.mIconRedDot.setVisibility(4);
        }
        int i3 = copydefault + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void setSelected(boolean z) {
        int i = 2 % 2;
        super.setSelected(z);
        this.mIconView.setSelected(z);
        this.mTitleView.setSelected(z);
        if (!z) {
            HomeThemeManager.INSTANCE.loadThemeImage(this.mIconView, this.config.getFunIcon(), 0);
            this.mTitleView.setTextColor(this.config.getNavTextColor());
        } else {
            int i2 = copydefault + 53;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                HomeThemeManager.INSTANCE.loadThemeImage(this.mIconView, this.config.getFunIconSelected(), 1);
            } else {
                HomeThemeManager.INSTANCE.loadThemeImage(this.mIconView, this.config.getFunIconSelected(), 0);
            }
            this.mTitleView.setTextColor(this.config.getNavSelectTextColor());
        }
        int i3 = component2 + 47;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void init(String str, String str2, NavigationConfig navigationConfig) {
        TextView textView;
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            HomeThemeManager.INSTANCE.loadThemeImage(this.mIconView, str, 1);
            textView = this.mTitleView;
        } else {
            HomeThemeManager.INSTANCE.loadThemeImage(this.mIconView, str, 0);
            textView = this.mTitleView;
        }
        textView.setText(str2);
        this.config = navigationConfig;
    }

    public void setIcon(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeThemeManager.INSTANCE.loadThemeImage(this.mIconView, str, 0);
        int i4 = copydefault + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public NavigationConfig getConfig() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        NavigationConfig navigationConfig = this.config;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return navigationConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setConfig(NavigationConfig navigationConfig) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.config = navigationConfig;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getPosition() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.position;
        int i6 = i2 + 99;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setPosition(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 119;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        this.position = i;
        int i6 = i4 + 19;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }
}
