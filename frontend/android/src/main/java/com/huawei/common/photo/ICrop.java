package com.huawei.common.photo;

import android.content.Context;
import android.net.Uri;
import com.huawei.common.listener.ApiCallback;

public interface ICrop {
    void crop(Context context, PhotoOptions photoOptions, Uri uri, ApiCallback<Uri> apiCallback);
}
