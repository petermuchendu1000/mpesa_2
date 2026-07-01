package com.huawei.digitalpayment.consumer.profile.model.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/request/UploadAvatarParams;", "Lcom/huawei/http/BaseRequestParams;", "fileContent", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getFileContent", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadAvatarParams extends BaseRequestParams {
    private static int component3 = 1;
    private static int copydefault;
    private final String fileContent;
    private final String name;

    /* JADX WARN: Illegal instructions before constructor call */
    public UploadAvatarParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = component3;
            int i3 = i2 + 39;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str2 = "crop_photo.jpg";
        }
        this(str, str2);
    }

    public final String getFileContent() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fileContent;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public UploadAvatarParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fileContent = str;
        this.name = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadAvatarParams(String str) {
        this(str, "crop_photo.jpg");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public static UploadAvatarParams copy$default(UploadAvatarParams uploadAvatarParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = uploadAvatarParams.fileContent;
            int i3 = copydefault + 77;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str2 = uploadAvatarParams.name;
        }
        UploadAvatarParams uploadAvatarParamsCopy = uploadAvatarParams.copy(str, str2);
        int i5 = component3 + 31;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return uploadAvatarParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fileContent;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    public final UploadAvatarParams copy(String fileContent, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fileContent, "");
        Intrinsics.checkNotNullParameter(name, "");
        UploadAvatarParams uploadAvatarParams = new UploadAvatarParams(fileContent, name);
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return uploadAvatarParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 31;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
            }
            return true;
        }
        if (!(other instanceof UploadAvatarParams)) {
            int i7 = copydefault + 31;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        UploadAvatarParams uploadAvatarParams = (UploadAvatarParams) other;
        if (!Intrinsics.areEqual(this.fileContent, uploadAvatarParams.fileContent)) {
            int i9 = copydefault + 81;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.name, uploadAvatarParams.name)) {
            return true;
        }
        int i11 = copydefault + 71;
        component3 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 28 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.fileContent.hashCode();
        return i3 == 0 ? (iHashCode + 14) * this.name.hashCode() : (iHashCode * 31) + this.name.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UploadAvatarParams(fileContent=" + this.fileContent + ", name=" + this.name + ")";
        int i2 = component3 + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return str;
    }
}
