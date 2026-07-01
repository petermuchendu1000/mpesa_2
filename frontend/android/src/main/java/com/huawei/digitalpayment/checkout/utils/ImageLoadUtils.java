package com.huawei.digitalpayment.checkout.utils;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.image.glide.ImageRequest;

@Deprecated
public class ImageLoadUtils {
    public static final int OPTIONS = 3;
    private static int component3 = 1;
    private static int copydefault;

    private ImageLoadUtils() {
    }

    public static void setFunctionIcon(Context context, ImageView imageView, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ImageRequest imageRequestWith = ImageRequest.get().with(context);
        if (i3 != 0) {
            imageRequestWith.load(str).into(imageView).request();
            return;
        }
        imageRequestWith.load(str).into(imageView).request();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void setFunctionIconWithTag(Context context, ImageView imageView, String str, String str2) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ImageRequest.get().with(context).load(str).into(imageView).request();
        if (i3 != 0) {
            throw null;
        }
    }

    private static void copydefault(Context context, ImageView imageView, String str, String str2) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            ImageRequest.get().with(context).load(str).into(imageView).request();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImageRequest.get().with(context).load(str).into(imageView).request();
        int i3 = component3 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void setFunctionIcon(ImageView imageView, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        setFunctionIcon(imageView, str, -1);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void setFunctionIcon(ImageView imageView, String str, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ImageRequest.get().load(str).into(imageView).placeholder(Integer.valueOf(i)).request();
        int i5 = copydefault + 95;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
    }

    public static void setFunctionIcon(ImageView imageView, String str, RequestOptions requestOptions) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        setFunctionIcon(imageView, str, -1, requestOptions);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
    }

    public static void setFunctionIcon(ImageView imageView, String str, int i, RequestOptions requestOptions) {
        int i2 = 2 % 2;
        int i3 = component3 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ImageRequest.get().load(str).into(imageView).placeholder(Integer.valueOf(i)).options(requestOptions).request();
        int i5 = copydefault + 5;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
