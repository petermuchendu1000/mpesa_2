package com.huawei.digitalpayment.consumer.base.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/PhotoHelper;", "", "<init>", "()V", "TAKE_PHOTO_FLAG", "", "CHOOSE_PHOTO_FLAG", "currentPhotoFlag", "getCurrentPhotoFlag", "()I", "setCurrentPhotoFlag", "(I)V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhotoHelper {
    public static final int CHOOSE_PHOTO_FLAG = 2;
    private static int ShareDataUIState = 1;
    public static final int TAKE_PHOTO_FLAG = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    public static final PhotoHelper INSTANCE = new PhotoHelper();
    private static int component1 = 1;

    private PhotoHelper() {
    }

    static {
        int i = component3 + 109;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getCurrentPhotoFlag() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = component1;
        int i6 = i2 + 107;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return i5;
    }

    public final void setCurrentPhotoFlag(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 111;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        component1 = i;
        int i6 = i4 + 33;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }
}
