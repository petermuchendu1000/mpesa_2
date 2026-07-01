package com.huawei.payment.lib.image.crop.init;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.startup.Initializer;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.photo.CropManager;
import com.huawei.common.photo.DefaultCrop;
import com.huawei.common.photo.PhotoOptions;
import com.huawei.common.util.L;
import com.huawei.payment.lib.image.crop.CropTranslateActivity;
import java.util.Collections;
import java.util.List;

public class ImageCropInitializer implements Initializer<String> {
    private static final String component3 = "ImageCropInitializer";

    @Override
    public String create(Context context) {
        L.d(component3, "create: ");
        CropManager.getInstance().setCrop(new DefaultCrop(this) {
            @Override
            public void crop(Context context2, PhotoOptions photoOptions, Uri uri, ApiCallback<Uri> apiCallback) {
                context2.startActivity(new Intent(context2, (Class<?>) CropTranslateActivity.class));
            }
        });
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
