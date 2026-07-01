package com.huawei.common.image;

import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/huawei/common/image/IImageInterface;", "", "load", "", "imageView", "Landroid/widget/ImageView;", "url", "", "options", "Lcom/bumptech/glide/request/RequestOptions;", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IImageInterface {
    void load(ImageView imageView, String url, RequestOptions options);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void load$default(IImageInterface iImageInterface, ImageView imageView, String str, RequestOptions requestOptions, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 4) != 0) {
                requestOptions = new RequestOptions();
            }
            iImageInterface.load(imageView, str, requestOptions);
        }
    }
}
