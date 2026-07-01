package com.huawei.digitalpayment.customer.dynamics.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/resp/UploadImageResp;", "Lcom/huawei/http/BaseResp;", "docId", "", "<init>", "(Ljava/lang/String;)V", "getDocId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadImageResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String docId;

    public final String getDocId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docId;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public UploadImageResp(String str) {
        this.docId = str;
    }

    public static UploadImageResp copy$default(UploadImageResp uploadImageResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = uploadImageResp.docId;
        }
        UploadImageResp uploadImageRespCopy = uploadImageResp.copy(str);
        int i5 = ShareDataUIState + 55;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return uploadImageRespCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docId;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final UploadImageResp copy(String docId) {
        int i = 2 % 2;
        UploadImageResp uploadImageResp = new UploadImageResp(docId);
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return uploadImageResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof UploadImageResp) {
            if (!Intrinsics.areEqual(this.docId, ((UploadImageResp) other).docId)) {
                return false;
            }
            int i2 = ShareDataUIState + 31;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i3 = ShareDataUIState + 67;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 99;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.docId;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = component1;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UploadImageResp(docId=" + this.docId + ")";
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
