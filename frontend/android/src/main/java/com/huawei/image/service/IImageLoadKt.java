package com.huawei.image.service;

import android.graphics.drawable.Drawable;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"loadModel", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", DeviceInfoFieldGroup.FIELD_MODEL, "", "ImageLib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IImageLoadKt {
    public static final RequestBuilder<Drawable> loadModel(RequestBuilder<Drawable> requestBuilder, Object obj) {
        Intrinsics.checkNotNullParameter(requestBuilder, "");
        if ((obj instanceof Integer) && ((Number) obj).intValue() > 0) {
            Cloneable cloneableDiskCacheStrategy = requestBuilder.load((Integer) obj).diskCacheStrategy(DiskCacheStrategy.NONE);
            Intrinsics.checkNotNullExpressionValue(cloneableDiskCacheStrategy, "");
            return (RequestBuilder) cloneableDiskCacheStrategy;
        }
        RequestBuilder<Drawable> requestBuilderLoad = requestBuilder.load(obj);
        Intrinsics.checkNotNullExpressionValue(requestBuilderLoad, "");
        return requestBuilderLoad;
    }
}
