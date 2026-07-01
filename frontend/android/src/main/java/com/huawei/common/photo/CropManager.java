package com.huawei.common.photo;

import android.content.Context;
import android.net.Uri;
import com.huawei.common.listener.ApiCallback;
import java.lang.ref.WeakReference;

public class CropManager {
    public static final CropManager INSTANCE = new CropManager();
    private ICrop ShareDataUIState = new DefaultCrop();
    private Uri component1;
    private PhotoOptions component3;
    private WeakReference<ApiCallback<Uri>> copydefault;

    public static CropManager getInstance() {
        return INSTANCE;
    }

    private CropManager() {
    }

    public void setCrop(ICrop iCrop) {
        this.ShareDataUIState = iCrop;
    }

    public PhotoOptions getOptions() {
        return this.component3;
    }

    public Uri getUri() {
        return this.component1;
    }

    public ApiCallback<Uri> getCallback() {
        return this.copydefault.get();
    }

    public void crop(Context context, PhotoOptions photoOptions, Uri uri, ApiCallback<Uri> apiCallback) {
        this.component3 = photoOptions;
        this.component1 = uri;
        this.copydefault = new WeakReference<>(apiCallback);
        this.ShareDataUIState.crop(context, photoOptions, uri, apiCallback);
    }

    public void reset() {
        this.component3 = null;
        this.component1 = null;
        WeakReference<ApiCallback<Uri>> weakReference = this.copydefault;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.copydefault = null;
    }
}
