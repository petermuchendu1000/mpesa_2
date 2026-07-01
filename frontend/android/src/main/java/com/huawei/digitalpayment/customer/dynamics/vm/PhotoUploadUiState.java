package com.huawei.digitalpayment.customer.dynamics.vm;

import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/vm/PhotoUploadUiState;", "", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/customer/dynamics/resp/UploadImageResp;", "<init>", "(Lcom/huawei/payment/mvvm/Resource;)V", "getUpload", "()Lcom/huawei/payment/mvvm/Resource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhotoUploadUiState {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Resource<UploadImageResp> component3;

    public PhotoUploadUiState(Resource<UploadImageResp> resource) {
        Intrinsics.checkNotNullParameter(resource, "");
        this.component3 = resource;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhotoUploadUiState(Resource resource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            resource = Resource.none();
            int i4 = copydefault + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(resource);
    }

    public final Resource<UploadImageResp> getUpload() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Resource<UploadImageResp> resource = this.component3;
        int i4 = i2 + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return resource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoUploadUiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PhotoUploadUiState copy$default(PhotoUploadUiState photoUploadUiState, Resource resource, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            resource = photoUploadUiState.component3;
        }
        PhotoUploadUiState photoUploadUiStateCopy = photoUploadUiState.copy(resource);
        int i5 = ShareDataUIState + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return photoUploadUiStateCopy;
    }

    public final Resource<UploadImageResp> component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Resource<UploadImageResp> resource = this.component3;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return resource;
    }

    public final PhotoUploadUiState copy(Resource<UploadImageResp> upload) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(upload, "");
        PhotoUploadUiState photoUploadUiState = new PhotoUploadUiState(upload);
        int i2 = ShareDataUIState + 109;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return photoUploadUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PhotoUploadUiState)) {
            int i4 = copydefault + 95;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component3, ((PhotoUploadUiState) other).component3)) {
            return true;
        }
        int i6 = copydefault + 95;
        ShareDataUIState = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        int i4 = copydefault + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PhotoUploadUiState(upload=" + this.component3 + ")";
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
