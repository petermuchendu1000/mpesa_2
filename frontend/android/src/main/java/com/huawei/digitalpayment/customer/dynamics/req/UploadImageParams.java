package com.huawei.digitalpayment.customer.dynamics.req;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/req/UploadImageParams;", "Lcom/huawei/http/BaseRequestParams;", "name", "", "fileContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getFileContent", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadImageParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String fileContent;
    private final String name;

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFileContent() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.fileContent;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public UploadImageParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.fileContent = str2;
    }

    public static UploadImageParams copy$default(UploadImageParams uploadImageParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3;
            int i4 = i3 + 49;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            String str3 = uploadImageParams.name;
            int i6 = i3 + 77;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = str3;
        }
        if ((i & 2) != 0) {
            int i8 = component3 + 11;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                str2 = uploadImageParams.fileContent;
                int i9 = 72 / 0;
            } else {
                str2 = uploadImageParams.fileContent;
            }
        }
        return uploadImageParams.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fileContent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UploadImageParams copy(String name, String fileContent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(fileContent, "");
        UploadImageParams uploadImageParams = new UploadImageParams(name, fileContent);
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return uploadImageParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof UploadImageParams) {
            UploadImageParams uploadImageParams = (UploadImageParams) other;
            if (!(!Intrinsics.areEqual(this.name, uploadImageParams.name))) {
                return Intrinsics.areEqual(this.fileContent, uploadImageParams.fileContent);
            }
            int i2 = ShareDataUIState + 29;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 10 / 0;
            }
            return false;
        }
        int i4 = component3 + 15;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 77;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.name.hashCode() * 31) + this.fileContent.hashCode();
        int i4 = ShareDataUIState + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UploadImageParams(name=" + this.name + ", fileContent=" + this.fileContent + ")";
        int i2 = ShareDataUIState + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
