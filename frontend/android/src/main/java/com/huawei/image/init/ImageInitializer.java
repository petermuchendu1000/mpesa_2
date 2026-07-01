package com.huawei.image.init;

import android.content.Context;
import androidx.startup.Initializer;
import com.huawei.common.image.ImageInterfaceManager;
import com.huawei.common.util.L;
import com.huawei.image.service.impl.DefaultImageLoad;
import java.util.Collections;
import java.util.List;

public class ImageInitializer implements Initializer<String> {
    private static final String TAG = "ImageInitializer";

    @Override
    public String create(Context context) {
        L.d(TAG, "create: ");
        ImageInterfaceManager.INSTANCE.setImageInterface(new DefaultImageLoad());
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
