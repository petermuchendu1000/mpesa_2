package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.baselib.R;

public class CustomerLoadMoreView extends BaseLoadMoreView {
    private static int component2 = 0;
    private static final int copydefault = 2000;
    private static int getAsAtTimestamp = 1;
    private ImageView ShareDataUIState;
    private Drawable component1;
    private ObjectAnimator component3;

    public void setLoadingDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.component1 = drawable;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public View getLoadComplete(BaseViewHolder baseViewHolder) {
        View view;
        int i = 2 % 2;
        int i2 = component2 + 115;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            view = baseViewHolder.getView(R.id.load_more_load_complete_view);
            int i3 = 1 / 0;
        } else {
            view = baseViewHolder.getView(R.id.load_more_load_complete_view);
        }
        int i4 = getAsAtTimestamp + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    @Override
    public View getLoadEndView(BaseViewHolder baseViewHolder) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            baseViewHolder.getView(R.id.load_more_load_end_view);
            throw null;
        }
        View view = baseViewHolder.getView(R.id.load_more_load_end_view);
        int i3 = component2 + 77;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return view;
    }

    @Override
    public View getLoadFailView(BaseViewHolder baseViewHolder) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            baseViewHolder.getView(R.id.load_more_load_fail_view);
            obj.hashCode();
            throw null;
        }
        View view = baseViewHolder.getView(R.id.load_more_load_fail_view);
        int i3 = component2 + 57;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return view;
        }
        throw null;
    }

    @Override
    public View getLoadingView(BaseViewHolder baseViewHolder) {
        int i = 2 % 2;
        View view = baseViewHolder.getView(R.id.load_more_loading_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_loading);
        Drawable drawable = this.component1;
        if (drawable != null) {
            int i2 = getAsAtTimestamp + 3;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                imageView.setImageDrawable(drawable);
                this.component1 = null;
                int i3 = 26 / 0;
            } else {
                imageView.setImageDrawable(drawable);
                this.component1 = null;
            }
        }
        if (this.component3 == null) {
            int i4 = component2 + 89;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if (imageView != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, 0.0f, 360.0f);
                this.component3 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(2000L);
                this.component3.setInterpolator(new LinearInterpolator());
                this.component3.setRepeatCount(-1);
                this.component3.setRepeatMode(1);
                this.ShareDataUIState = imageView;
            }
        }
        return view;
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, int i, LoadMoreStatus loadMoreStatus) {
        int i2 = 2 % 2;
        super.convert(baseViewHolder, i, loadMoreStatus);
        if (loadMoreStatus == LoadMoreStatus.Loading) {
            int i3 = component2 + 35;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            ShareDataUIState();
        } else {
            component2();
        }
        int i5 = component2 + 33;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
    }

    private void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ObjectAnimator objectAnimator = this.component3;
        if (objectAnimator != null) {
            objectAnimator.start();
            int i4 = getAsAtTimestamp + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ObjectAnimator objectAnimator = this.component3;
        if (objectAnimator != null) {
            int i5 = i3 + 57;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                objectAnimator.isRunning();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (objectAnimator.isRunning()) {
                this.component3.cancel();
                this.ShareDataUIState.setRotation(0.0f);
            }
        }
    }

    @Override
    public View getRootView(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        getAsAtTimestamp = i2 % 128;
        return (i2 % 2 == 0 ? LayoutInflater.from(viewGroup.getContext()) : LayoutInflater.from(viewGroup.getContext())).inflate(R.layout.view_load_more, viewGroup, false);
    }
}
