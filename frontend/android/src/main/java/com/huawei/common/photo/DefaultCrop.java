package com.huawei.common.photo;

import android.content.Context;
import android.net.Uri;
import com.huawei.common.listener.ApiCallback;

public class DefaultCrop implements ICrop {
    @Override
    public void crop(Context context, PhotoOptions photoOptions, Uri uri, ApiCallback<Uri> apiCallback) {
        apiCallback.onSuccess(uri);
    }
}
