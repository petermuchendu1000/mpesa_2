package com.huawei.image.service.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.common.image.IImageInterface;
import com.huawei.image.glide.EmptyRequestListener;
import com.huawei.image.glide.ImageRequest;
import com.huawei.image.service.IImageLoad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/huawei/image/service/impl/DefaultImageLoad;", "Lcom/huawei/image/service/IImageLoad;", "Lcom/huawei/common/image/IImageInterface;", "<init>", "()V", "load", "", "imageView", "Landroid/widget/ImageView;", "url", "", "options", "Lcom/bumptech/glide/request/RequestOptions;", "ImageLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultImageLoad implements IImageLoad, IImageInterface {
    @Override
    public EmptyRequestListener<Drawable> getListener(ImageRequest imageRequest) {
        return IImageLoad.DefaultImpls.getListener(this, imageRequest);
    }

    @Override
    public void load(ImageRequest imageRequest) {
        IImageLoad.DefaultImpls.load(this, imageRequest);
    }

    @Override
    public Object parse(Object obj, String str) {
        return IImageLoad.DefaultImpls.parse(this, obj, str);
    }

    @Override
    public void load(ImageView imageView, String url, RequestOptions options) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(options, "");
        ImageRequest imageRequest = ImageRequest.INSTANCE.get();
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        imageRequest.with(context).load(url).options(options).into(imageView).request();
    }
}
