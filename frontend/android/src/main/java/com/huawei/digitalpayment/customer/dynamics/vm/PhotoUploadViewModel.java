package com.huawei.digitalpayment.customer.dynamics.vm;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.customer.dynamics.model.DefaultPhotoModel;
import com.huawei.digitalpayment.customer.dynamics.model.IPhotoModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/vm/PhotoUploadViewModel;", "Lcom/huawei/digitalpayment/customer/dynamics/vm/BasePhotoUploadViewModel;", "Lcom/huawei/digitalpayment/customer/dynamics/model/DefaultPhotoModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/customer/dynamics/model/DefaultPhotoModel;)V", "getModel", "()Lcom/huawei/digitalpayment/customer/dynamics/model/DefaultPhotoModel;", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhotoUploadViewModel extends BasePhotoUploadViewModel<DefaultPhotoModel> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final DefaultPhotoModel component1;

    @Override
    public IPhotoModel getModel() {
        DefaultPhotoModel model;
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            model = getModel();
            int i3 = 40 / 0;
        } else {
            model = getModel();
        }
        int i4 = copydefault + 105;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return model;
        }
        throw null;
    }

    @Override
    protected DefaultPhotoModel getModel() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        DefaultPhotoModel defaultPhotoModel = this.component1;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return defaultPhotoModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PhotoUploadViewModel(DefaultPhotoModel defaultPhotoModel) {
        super(defaultPhotoModel);
        Intrinsics.checkNotNullParameter(defaultPhotoModel, "");
        this.component1 = defaultPhotoModel;
    }
}
