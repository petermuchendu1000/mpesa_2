package com.huawei.digitalpayment.customer.dynamics.model;

import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.customer.dynamics.req.UploadImageParams;
import com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/model/IPhotoModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, "", "params", "Lcom/huawei/digitalpayment/customer/dynamics/req/UploadImageParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/customer/dynamics/resp/UploadImageResp;", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPhotoModel extends BaseModel {
    void upload(UploadImageParams params, ApiCallback<UploadImageResp> callback);
}
