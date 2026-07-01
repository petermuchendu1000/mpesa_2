package com.huawei.digitalpayment.consumer.home.widget;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

public class TagView extends FrameLayout implements Checkable {
    private static final int[] CHECK_STATE = {R.attr.state_checked};
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private boolean checked;

    static {
        int i = 1 + 57;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public TagView(Context context) {
        super(context);
    }

    public View getTagView() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return getChildAt(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r4
  0x0027: PHI (r4v3 int[]) = (r4v2 int[]), (r4v7 int[]) binds: [B:8:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] onCreateDrawableState(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.widget.TagView.component3
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.widget.TagView.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            int r4 = r4 % 1
            int[] r4 = super.onCreateDrawableState(r4)
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L2c
            goto L27
        L1b:
            int r4 = r4 + 1
            int[] r4 = super.onCreateDrawableState(r4)
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L2c
        L27:
            int[] r1 = com.huawei.digitalpayment.consumer.home.widget.TagView.CHECK_STATE
            mergeDrawableStates(r4, r1)
        L2c:
            int r1 = com.huawei.digitalpayment.consumer.home.widget.TagView.copydefault
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.widget.TagView.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L38
            return r4
        L38:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.widget.TagView.onCreateDrawableState(int):int[]");
    }

    @Override
    public void setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.checked != z) {
            int i5 = i2 + 59;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                this.checked = z;
                refreshDrawableState();
            } else {
                this.checked = z;
                refreshDrawableState();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.checked;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override
    public void toggle() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        setChecked(!this.checked);
        int i4 = component3 + 53;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }
}
