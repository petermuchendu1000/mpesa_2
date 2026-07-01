package com.huawei.image.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.image.PicBase64Utils;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.glide.ImageRequest;

public final class GlideUtils {
    private GlideUtils() {
    }

    public static void loadUrl(String str, ImageView imageView) {
        ImageRequest.get().load(str).into(imageView).request();
    }

    public static String getFullUrl(String str) {
        return ImageRequest.getFullUrl(str);
    }

    public static void loadUrl(String str, ImageView imageView, int i, int i2) {
        ImageRequest.get().load(str).placeholder(Integer.valueOf(i)).error(Integer.valueOf(i2)).into(imageView).request();
    }

    public static void load(Base64Mode base64Mode, ImageView imageView, int i, int i2) {
        ImageRequest.get().load(base64Mode).placeholder(Integer.valueOf(i)).error(Integer.valueOf(i2)).into(imageView).request();
    }

    public static void load(Base64Mode base64Mode, ImageView imageView) {
        ImageRequest.get().load(base64Mode).into(imageView).request();
    }

    public static void preLoad(Context context, Base64Mode base64Mode) {
        ImageRequest.get().with(context).load(base64Mode).request();
    }

    public static void preLoad(Context context, String str) {
        ImageRequest.get().with(context).load(str).request();
    }

    public static void loadUrlWithColor(String str, final ImageView imageView, int i) {
        ImageRequest.get().load(str).color(Integer.valueOf(i)).listener(new ApiCallback<Drawable>() {
            @Override
            public void onSuccess(Drawable drawable) {
                imageView.setImageDrawable(drawable);
            }
        }).request();
    }

    public static void setFunctionIcon(ImageView imageView, String str) {
        ImageRequest.get().load(str).into(imageView).request();
    }

    public static void setFunctionIconWithColor(ImageView imageView, String str, int i) {
        loadUrlWithColor(str, imageView, i);
    }

    public static boolean setFunctionIcon(ImageView imageView, String str, int i) {
        ImageRequest.get().load(str).into(imageView).placeholder(Integer.valueOf(i)).request();
        return true;
    }

    public static void setFunctionIcon(ImageView imageView, String str, String str2, int i) {
        ImageRequest.get().load(str).bizType(str2).into(imageView).placeholder(Integer.valueOf(i)).request();
    }

    public static void loadGif(ImageView imageView, Integer num, int i) {
        ImageRequest.get().load(num).into(imageView).loopCount(i).request();
    }

    public static void getFileBase64(Context context, String str, final ApiCallback<String> apiCallback) {
        ImageRequest.get().with(context).load(str).listener(new ApiCallback<Drawable>() {
            @Override
            public void onSuccess(Drawable drawable) throws Throwable {
                try {
                    apiCallback.onSuccess(PicBase64Utils.encodeImage(PicBase64Utils.drawableToBitmap(drawable), Bitmap.CompressFormat.PNG));
                } catch (Exception e) {
                    apiCallback.onError(new BaseException(e.getMessage()));
                }
            }

            @Override
            public void onError(BaseException baseException) {
                super.onError(baseException);
                apiCallback.onError(new BaseException(baseException.getMessage()));
            }
        }).request();
    }
}
