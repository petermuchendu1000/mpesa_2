package com.huawei.digitalpayment.consumer.baselib.pic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.net.URL;

public class GlideRequests extends RequestManager {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public RequestManager addDefaultRequestListener(RequestListener requestListener) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequests glideRequestsAddDefaultRequestListener = addDefaultRequestListener((RequestListener<Object>) requestListener);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = component3 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return glideRequestsAddDefaultRequestListener;
    }

    @Override
    public RequestManager applyDefaultRequestOptions(RequestOptions requestOptions) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequests glideRequestsApplyDefaultRequestOptions = applyDefaultRequestOptions(requestOptions);
        int i4 = component3 + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return glideRequestsApplyDefaultRequestOptions;
    }

    @Override
    public RequestBuilder as(Class cls) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequestAs = as(cls);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return glideRequestAs;
    }

    @Override
    public RequestBuilder asBitmap() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<Bitmap> glideRequestAsBitmap = asBitmap();
        int i4 = ShareDataUIState + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return glideRequestAsBitmap;
    }

    @Override
    public RequestBuilder asDrawable() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            asDrawable();
            throw null;
        }
        GlideRequest<Drawable> glideRequestAsDrawable = asDrawable();
        int i3 = ShareDataUIState + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return glideRequestAsDrawable;
    }

    @Override
    public RequestBuilder asFile() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<File> glideRequestAsFile = asFile();
        int i4 = ShareDataUIState + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return glideRequestAsFile;
        }
        throw null;
    }

    @Override
    public RequestBuilder asGif() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return asGif();
        }
        asGif();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RequestManager clearOnStop() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequests glideRequestsClearOnStop = clearOnStop();
        int i4 = component3 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return glideRequestsClearOnStop;
    }

    @Override
    public RequestBuilder download(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return download(obj);
        }
        download(obj);
        throw null;
    }

    @Override
    public RequestBuilder downloadOnly() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            downloadOnly();
            throw null;
        }
        GlideRequest<File> glideRequestDownloadOnly = downloadOnly();
        int i3 = ShareDataUIState + 75;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return glideRequestDownloadOnly;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return load2(bitmap);
        }
        load2(bitmap);
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(Drawable drawable) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(drawable);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return requestBuilderLoad2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(Uri uri) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(uri);
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return requestBuilderLoad2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(File file) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(file);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return requestBuilderLoad2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return load2(num);
        }
        load2(num);
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(obj);
        int i4 = ShareDataUIState + 93;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return requestBuilderLoad2;
        }
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(str);
        int i4 = component3 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderLoad2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @Deprecated
    public RequestBuilder<Drawable> load(URL url) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(url);
        int i4 = ShareDataUIState + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderLoad2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public RequestBuilder<Drawable> load(byte[] bArr) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(bArr);
        int i4 = component3 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return requestBuilderLoad2;
    }

    @Override
    public RequestBuilder<Drawable> load(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(bitmap);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return requestBuilderLoad2;
    }

    @Override
    public RequestBuilder<Drawable> load(Drawable drawable) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(drawable);
        int i4 = component3 + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderLoad2;
    }

    @Override
    public RequestBuilder<Drawable> load(Uri uri) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(uri);
        int i4 = component3 + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return requestBuilderLoad2;
        }
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load(File file) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(file);
        int i4 = component3 + 105;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return requestBuilderLoad2;
    }

    @Override
    public RequestBuilder<Drawable> load(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            load2(num);
            throw null;
        }
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(num);
        int i3 = component3 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return requestBuilderLoad2;
    }

    @Override
    public RequestBuilder<Drawable> load(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return load2(obj);
        }
        load2(obj);
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load(String str) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(str);
        int i4 = ShareDataUIState + 31;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return requestBuilderLoad2;
    }

    @Override
    @Deprecated
    public RequestBuilder<Drawable> load(URL url) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            load2(url);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RequestBuilder<Drawable> requestBuilderLoad2 = load2(url);
        int i3 = ShareDataUIState + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return requestBuilderLoad2;
    }

    @Override
    public RequestBuilder<Drawable> load(byte[] bArr) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return load2(bArr);
        }
        load2(bArr);
        throw null;
    }

    @Override
    public RequestManager setDefaultRequestOptions(RequestOptions requestOptions) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequests defaultRequestOptions = setDefaultRequestOptions(requestOptions);
        int i4 = component3 + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultRequestOptions;
        }
        throw null;
    }

    public GlideRequests(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        super(glide, lifecycle, requestManagerTreeNode, context);
    }

    @Override
    public <ResourceType> GlideRequest<ResourceType> as(Class<ResourceType> cls) {
        int i = 2 % 2;
        GlideRequest<ResourceType> glideRequest = new GlideRequest<>(this.glide, this, cls, this.context);
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return glideRequest;
    }

    @Override
    public GlideRequests applyDefaultRequestOptions(RequestOptions requestOptions) {
        GlideRequests glideRequests;
        synchronized (this) {
            glideRequests = (GlideRequests) super.applyDefaultRequestOptions(requestOptions);
        }
        return glideRequests;
    }

    @Override
    public GlideRequests setDefaultRequestOptions(RequestOptions requestOptions) {
        GlideRequests glideRequests;
        synchronized (this) {
            glideRequests = (GlideRequests) super.setDefaultRequestOptions(requestOptions);
        }
        return glideRequests;
    }

    @Override
    public GlideRequests clearOnStop() {
        GlideRequests glideRequests;
        synchronized (this) {
            glideRequests = (GlideRequests) super.clearOnStop();
        }
        return glideRequests;
    }

    @Override
    public GlideRequests addDefaultRequestListener(RequestListener<Object> requestListener) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequests glideRequests = (GlideRequests) super.addDefaultRequestListener(requestListener);
        if (i3 == 0) {
            return glideRequests;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideRequest<Bitmap> asBitmap() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<Bitmap> glideRequest = (GlideRequest) super.asBitmap();
        int i4 = ShareDataUIState + 5;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return glideRequest;
    }

    @Override
    public GlideRequest<GifDrawable> asGif() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<GifDrawable> glideRequest = (GlideRequest) super.asGif();
        int i4 = component3 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return glideRequest;
        }
        throw null;
    }

    @Override
    public GlideRequest<Drawable> asDrawable() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        GlideRequest<Drawable> glideRequest = (GlideRequest) super.asDrawable();
        int i3 = component3 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return glideRequest;
    }

    @Override
    public RequestBuilder<Drawable> load2(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(bitmap);
        if (i3 != 0) {
            return glideRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load2(Drawable drawable) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(drawable);
        if (i3 == 0) {
            return glideRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load2(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(str);
        int i4 = component3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return glideRequest;
        }
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load2(Uri uri) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(uri);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = ShareDataUIState + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return glideRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load2(File file) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(file);
        if (i3 == 0) {
            return glideRequest;
        }
        throw null;
    }

    @Override
    public RequestBuilder<Drawable> load2(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        GlideRequest glideRequest = (GlideRequest) super.load(num);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return glideRequest;
        }
        throw null;
    }

    @Override
    @Deprecated
    public RequestBuilder<Drawable> load2(URL url) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(url);
        int i4 = component3 + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return glideRequest;
    }

    @Override
    public RequestBuilder<Drawable> load2(byte[] bArr) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(bArr);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return glideRequest;
    }

    @Override
    public RequestBuilder<Drawable> load2(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest glideRequest = (GlideRequest) super.load(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component3 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return glideRequest;
    }

    @Override
    public GlideRequest<File> downloadOnly() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<File> glideRequest = (GlideRequest) super.downloadOnly();
        int i4 = component3 + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return glideRequest;
    }

    @Override
    public GlideRequest<File> download(Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<File> glideRequest = (GlideRequest) super.download(obj);
        int i4 = component3 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return glideRequest;
    }

    @Override
    public GlideRequest<File> asFile() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GlideRequest<File> glideRequest = (GlideRequest) super.asFile();
        int i4 = ShareDataUIState + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return glideRequest;
    }

    @Override
    public void setRequestOptions(RequestOptions requestOptions) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (requestOptions instanceof GlideOptions) {
            int i5 = i3 + 11;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                super.setRequestOptions(requestOptions);
                return;
            } else {
                super.setRequestOptions(requestOptions);
                throw null;
            }
        }
        super.setRequestOptions(new GlideOptions().apply((BaseRequestOptions<?>) requestOptions));
        int i6 = component3 + 105;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }
}
