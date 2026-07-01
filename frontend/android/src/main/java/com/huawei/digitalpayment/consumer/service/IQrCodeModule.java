package com.huawei.digitalpayment.consumer.service;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J<\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/IQrCodeModule;", "", "generateBitmap", "Landroid/graphics/Bitmap;", "content", "", "desWidth", "", "desHeight", CdpConstants.CONTENT_CORNER_RADIUS, "", "saveReceiveQrCode", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "amount", "note", "avatarDrawable", "Landroid/graphics/drawable/Drawable;", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IQrCodeModule {
    Bitmap generateBitmap(String content, int desWidth, int desHeight, float cornerRadius);

    void saveReceiveQrCode(FragmentActivity activity, String content, String amount, String note, Drawable avatarDrawable);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component2 = 0;
        private static int copydefault = 1;

        public static void saveReceiveQrCode$default(IQrCodeModule iQrCodeModule, FragmentActivity fragmentActivity, String str, String str2, String str3, Drawable drawable, int i, Object obj) {
            String str4;
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveReceiveQrCode");
            }
            String str5 = (i & 2) != 0 ? null : str;
            if ((i & 4) != 0) {
                int i3 = component2;
                int i4 = i3 + 73;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 32 / 0;
                }
                int i6 = i3 + 123;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 3;
                }
                str4 = null;
            } else {
                str4 = str2;
            }
            iQrCodeModule.saveReceiveQrCode(fragmentActivity, str5, str4, (i & 8) != 0 ? null : str3, drawable);
        }

        public static void saveReceiveQrCode(IQrCodeModule iQrCodeModule, FragmentActivity fragmentActivity, String str, String str2, String str3, Drawable drawable) {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(drawable, "");
            int i4 = component2 + 107;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
        }
    }
}
