package com.huawei.common.image;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/common/image/ImageInterfaceManager;", "", "<init>", "()V", "imageInterface", "Lcom/huawei/common/image/IImageInterface;", "getImageInterface", "()Lcom/huawei/common/image/IImageInterface;", "setImageInterface", "(Lcom/huawei/common/image/IImageInterface;)V", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageInterfaceManager {
    public static final ImageInterfaceManager INSTANCE = new ImageInterfaceManager();
    private static IImageInterface ShareDataUIState = new DefaultImageInterface();

    private ImageInterfaceManager() {
    }

    public final IImageInterface getImageInterface() {
        return ShareDataUIState;
    }

    public final void setImageInterface(IImageInterface iImageInterface) {
        Intrinsics.checkNotNullParameter(iImageInterface, "");
        ShareDataUIState = iImageInterface;
    }
}
