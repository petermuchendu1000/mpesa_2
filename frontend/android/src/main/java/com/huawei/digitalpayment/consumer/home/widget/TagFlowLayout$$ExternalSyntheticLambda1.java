package com.huawei.digitalpayment.consumer.home.widget;

import android.view.View;
import kotlin.onDraw;
import kotlin.setCurrentRunnable;

public final class TagFlowLayout$$ExternalSyntheticLambda1 implements View.OnLongClickListener {
    private static int component2 = 1;
    private static int component3;
    public final TagFlowLayout f$0;
    public final TagView f$1;
    public final int f$2;

    public TagFlowLayout$$ExternalSyntheticLambda1(TagFlowLayout tagFlowLayout, TagView tagView, int i) {
        this.f$0 = tagFlowLayout;
        this.f$1 = tagView;
        this.f$2 = i;
    }

    public static void component3() {
        setCurrentRunnable.component1[0] = onDraw.component1[0];
    }

    @Override
    public final boolean onLongClick(View view) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM10625$r8$lambda$X45vJCz4sR80a6Uhw5yIUfCz80 = TagFlowLayout.m10625$r8$lambda$X45vJCz4sR80a6Uhw5yIUfCz80(this.f$0, this.f$1, this.f$2, view);
        int i4 = component3 + 85;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM10625$r8$lambda$X45vJCz4sR80a6Uhw5yIUfCz80;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
