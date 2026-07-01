package com.huawei.common.widget;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/huawei/common/widget/AutoHeightViewPagerContainer$pageCallback$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", "position", "", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoHeightViewPagerContainer$pageCallback$1 extends ViewPager2.OnPageChangeCallback {
    final AutoHeightViewPagerContainer copydefault;

    AutoHeightViewPagerContainer$pageCallback$1(AutoHeightViewPagerContainer autoHeightViewPagerContainer) {
        this.copydefault = autoHeightViewPagerContainer;
    }

    public static final void component1(AutoHeightViewPagerContainer autoHeightViewPagerContainer, int i) {
        autoHeightViewPagerContainer.adjustHeightForPosition(i, true);
    }

    @Override
    public void onPageSelected(final int position) {
        final AutoHeightViewPagerContainer autoHeightViewPagerContainer = this.copydefault;
        autoHeightViewPagerContainer.post(new Runnable() {
            @Override
            public final void run() {
                AutoHeightViewPagerContainer$pageCallback$1.component1(autoHeightViewPagerContainer, position);
            }
        });
    }
}
