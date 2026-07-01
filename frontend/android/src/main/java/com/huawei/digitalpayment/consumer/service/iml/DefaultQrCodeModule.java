package com.huawei.digitalpayment.consumer.service.iml;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.huawei.digitalpayment.consumer.service.IQrCodeModule;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultQrCodeModule;", "Lcom/huawei/digitalpayment/consumer/service/IQrCodeModule;", "<init>", "()V", "generateBitmap", "Landroid/graphics/Bitmap;", "content", "", "desWidth", "", "desHeight", CdpConstants.CONTENT_CORNER_RADIUS, "", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultQrCodeModule implements IQrCodeModule {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public void saveReceiveQrCode(FragmentActivity fragmentActivity, String str, String str2, String str3, Drawable drawable) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IQrCodeModule.DefaultImpls.saveReceiveQrCode(this, fragmentActivity, str, str2, str3, drawable);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = ShareDataUIState + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public Bitmap generateBitmap(String content, int desWidth, int desHeight, float cornerRadius) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(content, "");
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
