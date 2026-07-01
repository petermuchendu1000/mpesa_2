package com.huawei.image.glide;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.alibaba.ariver.permission.PermissionConstant;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.bumptech.glide.request.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\r\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/image/glide/CustomDrawableImageViewTarget;", "Lcom/bumptech/glide/request/target/ImageViewTarget;", "Landroid/graphics/drawable/Drawable;", "view", "Landroid/widget/ImageView;", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/image/glide/ImageRequest;", "<init>", "(Landroid/widget/ImageView;Lcom/huawei/image/glide/ImageRequest;)V", "setResource", "", "resource", "onResourceReady", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "ImageLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CustomDrawableImageViewTarget extends ImageViewTarget<Drawable> {
    private final ImageRequest request;

    @Override
    public void onResourceReady(Object obj, Transition transition) {
        onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomDrawableImageViewTarget(ImageView view, ImageRequest request) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    @Override
    public void setResource(Drawable resource) {
        ((ImageView) this.view).setImageDrawable(resource);
    }

    public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.request.initDrawable(resource);
        super.onResourceReady(resource, transition);
    }
}
