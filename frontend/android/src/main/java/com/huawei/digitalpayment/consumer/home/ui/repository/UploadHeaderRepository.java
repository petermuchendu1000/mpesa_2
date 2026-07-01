package com.huawei.digitalpayment.consumer.home.ui.repository;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteUploadAvatar;
import com.huawei.digitalpayment.consumer.profile.model.request.UploadAvatarParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/repository/UploadHeaderRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteUploadAvatar;", "params", "Lcom/huawei/digitalpayment/consumer/profile/model/request/UploadAvatarParams;", "<init>", "(Lcom/huawei/digitalpayment/consumer/profile/model/request/UploadAvatarParams;)V", "getApiPath", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadHeaderRepository extends PaymentRequest<RemoteUploadAvatar> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 11 % 128;

    public UploadHeaderRepository(UploadAvatarParams uploadAvatarParams) {
        Intrinsics.checkNotNullParameter(uploadAvatarParams, "");
        addParams(uploadAvatarParams);
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return "avatar/upload";
    }

    static {
        if (11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
