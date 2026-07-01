package com.huawei.image.glide;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.permission.PermissionConstant;
import com.alibaba.griver.beehive.lottie.player.LottieParams;
import com.alibaba.griver.image.impl.GriverPicassoExtensionImpl;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.image.service.IImageLoad;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001J\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fJ\r\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001bJ\r\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001bJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J\u0006\u0010 \u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010$J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010$J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010$J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/huawei/image/glide/ImageRequest;", "", "<init>", "()V", "context", "Landroid/content/Context;", "data", "imageView", "Landroid/widget/ImageView;", LottieParams.KEY_PLACEHOLDER, "", "Ljava/lang/Integer;", "error", "loopCount", RVParams.LONG_BIZ_TYPE, "", "color", "options", "Lcom/bumptech/glide/request/RequestOptions;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huawei/common/listener/ApiCallback;", "Landroid/graphics/drawable/Drawable;", "getContext", "getImageView", "getData", "getBizType", "getPlaceholder", "()Ljava/lang/Integer;", "getError", "getColor", "getOptions", "getListener", "getLoopCount", "with", "into", "load", "(Ljava/lang/Integer;)Lcom/huawei/image/glide/ImageRequest;", PermissionConstant.ACTION_REQUEST, "", "initDrawable", "resource", "Companion", "ImageLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ImageRequest {

    public static final Companion INSTANCE = new Companion(null);
    private static String h5BaseUrl = "";
    private String bizType;
    private Integer color;
    private Context context;
    private Object data;
    private Integer error;
    private ImageView imageView;
    private ApiCallback<Drawable> listener;
    private int loopCount;
    private RequestOptions options;
    private Integer placeholder;

    public ImageRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final ImageRequest get() {
        return INSTANCE.get();
    }

    @JvmStatic
    public static final String getFullUrl(String str) {
        return INSTANCE.getFullUrl(str);
    }

    private ImageRequest() {
        this.loopCount = -1;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ImageView getImageView() {
        return this.imageView;
    }

    public final Object getData() {
        return this.data;
    }

    public final String getBizType() {
        return this.bizType;
    }

    public final Integer getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getError() {
        return this.error;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final RequestOptions getOptions() {
        return this.options;
    }

    public final ApiCallback<Drawable> getListener() {
        return this.listener;
    }

    public final int getLoopCount() {
        return this.loopCount;
    }

    public final ImageRequest with(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        return this;
    }

    public final ImageRequest into(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.imageView = imageView;
        return this;
    }

    public final ImageRequest load(Object data) {
        this.data = data;
        return this;
    }

    public final ImageRequest loopCount(int loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    public final ImageRequest placeholder(Integer placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    public final ImageRequest bizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    public final ImageRequest error(Integer error) {
        this.error = error;
        return this;
    }

    public final ImageRequest color(Integer color) {
        this.color = color;
        return this;
    }

    public final ImageRequest options(RequestOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        return this;
    }

    public final ImageRequest listener(ApiCallback<Drawable> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    public final void request() {
        ((IImageLoad) RouteUtils.getService(IImageLoad.class)).load(this);
    }

    public final void initDrawable(Drawable resource) {
        Integer color;
        Intrinsics.checkNotNullParameter(resource, "resource");
        boolean z = resource instanceof GifDrawable;
        if (!z && (color = getColor()) != null) {
            resource.setColorFilter(new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.SRC_ATOP));
        }
        if (z) {
            ((GifDrawable) resource).setLoopCount(getLoopCount());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/image/glide/ImageRequest$Companion;", "", "<init>", "()V", "h5BaseUrl", "", "setH5BaseUrl", "", "getFullUrl", "url", GriverPicassoExtensionImpl.PICASSO_GET_METHOD, "Lcom/huawei/image/glide/ImageRequest;", "ImageLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setH5BaseUrl(String h5BaseUrl) {
            Intrinsics.checkNotNullParameter(h5BaseUrl, "h5BaseUrl");
            ImageRequest.h5BaseUrl = h5BaseUrl;
        }

        @JvmStatic
        public final String getFullUrl(String url) {
            String url2 = UrlUtils.getURL(ImageRequest.h5BaseUrl, url);
            Intrinsics.checkNotNullExpressionValue(url2, "getURL(...)");
            return url2;
        }

        @JvmStatic
        public final ImageRequest get() {
            return new ImageRequest(null);
        }
    }
}
