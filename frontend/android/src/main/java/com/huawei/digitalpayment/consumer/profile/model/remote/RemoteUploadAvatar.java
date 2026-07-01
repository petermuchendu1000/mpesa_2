package com.huawei.digitalpayment.consumer.profile.model.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteUploadAvatar;", "", "docId", "", "<init>", "(Ljava/lang/String;)V", "getDocId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteUploadAvatar {
    private static int component3 = 1;
    private static int copydefault;
    private final String docId;

    public RemoteUploadAvatar(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.docId = str;
    }

    public final String getDocId() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.docId;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static RemoteUploadAvatar copy$default(RemoteUploadAvatar remoteUploadAvatar, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = remoteUploadAvatar.docId;
        }
        RemoteUploadAvatar remoteUploadAvatarCopy = remoteUploadAvatar.copy(str);
        int i5 = copydefault + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return remoteUploadAvatarCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docId;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RemoteUploadAvatar copy(String docId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(docId, "");
        RemoteUploadAvatar remoteUploadAvatar = new RemoteUploadAvatar(docId);
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteUploadAvatar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteUploadAvatar)) {
            int i4 = i2 + 65;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.docId, ((RemoteUploadAvatar) other).docId)) {
            return true;
        }
        int i6 = copydefault + 93;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.docId.hashCode();
        int i4 = copydefault + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteUploadAvatar(docId=" + this.docId + ")";
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
