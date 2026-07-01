package com.huawei.digitalpayment.consumer.profileui.init;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.startup.Initializer;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.photo.CropManager;
import com.huawei.common.photo.DefaultCrop;
import com.huawei.common.photo.PhotoOptions;
import com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity;
import com.huawei.payment.lib.image.crop.init.ImageCropInitializer;
import java.util.ArrayList;
import java.util.List;

public class ProfileModuleUiInit implements Initializer<String> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return create(context);
        }
        create(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String create(Context context) {
        int i = 2 % 2;
        CropManager.getInstance().setCrop(new DefaultCrop(this) {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void crop(Context context2, PhotoOptions photoOptions, Uri uri, ApiCallback<Uri> apiCallback) {
                int i2 = 2 % 2;
                context2.startActivity(new Intent(context2, (Class<?>) PhotoCropActivity.class));
                int i3 = copydefault + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return "";
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ImageCropInitializer.class);
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }
}
