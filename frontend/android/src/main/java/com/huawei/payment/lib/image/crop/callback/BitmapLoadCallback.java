package com.huawei.payment.lib.image.crop.callback;

import android.graphics.Bitmap;
import android.net.Uri;
import com.huawei.payment.lib.image.crop.model.ExifInfo;

public interface BitmapLoadCallback {
    void onBitmapLoaded(Bitmap bitmap, ExifInfo exifInfo, Uri uri, Uri uri2);

    void onFailure(Exception exc);
}
