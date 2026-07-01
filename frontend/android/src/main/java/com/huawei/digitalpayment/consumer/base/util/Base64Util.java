package com.huawei.digitalpayment.consumer.base.util;

import android.graphics.Bitmap;
import android.util.Base64;
import com.blankj.utilcode.util.CloseUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/Base64Util;", "", "<init>", "()V", "compressImageToBase64", "", "image", "Landroid/graphics/Bitmap;", "size", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Base64Util {
    public static final Base64Util INSTANCE = new Base64Util();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    private Base64Util() {
    }

    public final String compressImageToBase64(Bitmap image, int size) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(image, "");
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int i2 = 100;
                image.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                while (byteArrayOutputStream.toByteArray().length / 1024 > size) {
                    int i3 = copydefault + 105;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        byteArrayOutputStream.reset();
                        image.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                        i2 += 114;
                    } else {
                        byteArrayOutputStream.reset();
                        image.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                        i2 -= 10;
                    }
                }
                String str = "data:image/jpg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                CloseUtils.closeIO(byteArrayOutputStream);
                int i4 = copydefault + 21;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 50 / 0;
                }
                return str;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    static {
        int i = ShareDataUIState + 53;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
