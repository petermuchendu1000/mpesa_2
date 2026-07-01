package com.huawei.image.glide;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class EmptyRequestListener<R> implements RequestListener<R> {
    @Override
    public boolean onLoadFailed(GlideException glideException, Object obj, Target<R> target, boolean z) {
        return false;
    }

    @Override
    public boolean onResourceReady(R r, Object obj, Target<R> target, DataSource dataSource, boolean z) {
        return false;
    }
}
