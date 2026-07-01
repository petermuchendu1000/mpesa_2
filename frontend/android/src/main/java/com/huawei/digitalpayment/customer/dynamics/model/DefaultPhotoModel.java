package com.huawei.digitalpayment.customer.dynamics.model;

import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.customer.dynamics.req.UploadImageParams;
import com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/model/DefaultPhotoModel;", "Lcom/huawei/digitalpayment/customer/dynamics/model/IPhotoModel;", "<init>", "()V", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, "", "params", "Lcom/huawei/digitalpayment/customer/dynamics/req/UploadImageParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/customer/dynamics/resp/UploadImageResp;", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultPhotoModel implements IPhotoModel {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Inject
    public DefaultPhotoModel() {
    }

    @Override
    public void upload(UploadImageParams params, ApiCallback<UploadImageResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        DefaultPhotoModel$upload$request$1 defaultPhotoModel$upload$request$1 = new DefaultPhotoModel$upload$request$1();
        defaultPhotoModel$upload$request$1.addParams(params);
        sendRequest(defaultPhotoModel$upload$request$1, callback);
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
