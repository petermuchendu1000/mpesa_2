package com.huawei.common.widget.horizontalcard;

import android.view.View;

public class CardViewInfo {
    private boolean ShareDataUIState;
    private String component1;
    private String component2;
    private View copydefault;

    public boolean isSelected() {
        return this.ShareDataUIState;
    }

    public void setSelected(boolean z) {
        this.ShareDataUIState = z;
    }

    public String getText() {
        return this.component1;
    }

    public void setText(String str) {
        this.component1 = str;
    }

    public View getView() {
        return this.copydefault;
    }

    public void setView(View view) {
        this.copydefault = view;
    }

    public String getId() {
        return this.component2;
    }

    public void setId(String str) {
        this.component2 = str;
    }
}
