package com.huawei.digitalpayment.consumer.home.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.image.util.GlideUtils;

public class NavigationButton1 extends FrameLayout {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private LocalHomeFunction config;
    private ImageView mIconRedDot;
    private ImageView mIconView;
    private TextView mTitleMarker;
    private TextView mTitleView;
    private int position;

    public NavigationButton1(Context context) {
        super(context);
        init();
    }

    public NavigationButton1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public NavigationButton1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public NavigationButton1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public final void init() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater.from(getContext()).inflate(R.layout.home_nav_item, (ViewGroup) this, true);
        this.mIconView = (ImageView) findViewById(R.id.nav_iv_icon);
        this.mTitleView = (TextView) findViewById(R.id.nav_tv_title);
        TextView textView = (TextView) findViewById(R.id.nav_marker_text);
        this.mTitleMarker = textView;
        textView.setVisibility(8);
        this.mIconRedDot = (ImageView) findViewById(R.id.nav_new_icon);
        int i4 = ShareDataUIState + 67;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setMarker(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.mTitleMarker.setText(str);
            if (!(!TextUtils.isEmpty(str))) {
                this.mTitleMarker.setVisibility(8);
                return;
            }
            this.mTitleMarker.setVisibility(0);
            int i3 = component2 + 29;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.mTitleMarker.setText(str);
        TextUtils.isEmpty(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void showRedDot() {
        ImageView imageView;
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 17;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            imageView = this.mIconRedDot;
            i = 1;
        } else {
            imageView = this.mIconRedDot;
            i = 0;
        }
        imageView.setVisibility(i);
        int i4 = ShareDataUIState + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void hideRedDot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component2 = i2 % 128;
        this.mIconRedDot.setVisibility(i2 % 2 == 0 ? 5 : 4);
    }

    @Override
    public void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            super.setSelected(z);
            this.mIconView.setSelected(z);
            this.mTitleView.setSelected(z);
            if (!(!z)) {
                GlideUtils.setFunctionIcon(this.mIconView, this.config.getFunIconSelected());
            } else {
                GlideUtils.setFunctionIcon(this.mIconView, this.config.getFunIcon());
                int i3 = ShareDataUIState + 1;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = ShareDataUIState + 7;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 80 / 0;
                return;
            }
            return;
        }
        super.setSelected(z);
        this.mIconView.setSelected(z);
        this.mTitleView.setSelected(z);
        throw null;
    }

    public void init(String str, String str2, LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            GlideUtils.setFunctionIcon(this.mIconView, str);
            this.mTitleView.setText(str2);
            this.config = localHomeFunction;
        } else {
            GlideUtils.setFunctionIcon(this.mIconView, str);
            this.mTitleView.setText(str2);
            this.config = localHomeFunction;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setIcon(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        GlideUtils.setFunctionIcon(this.mIconView, str);
        int i4 = component2 + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalHomeFunction getConfig() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        LocalHomeFunction localHomeFunction = this.config;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return localHomeFunction;
        }
        throw null;
    }

    public void setConfig(LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.config = localHomeFunction;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
    }

    public int getPosition() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.position;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPosition(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        this.position = i;
        int i6 = i3 + 61;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
