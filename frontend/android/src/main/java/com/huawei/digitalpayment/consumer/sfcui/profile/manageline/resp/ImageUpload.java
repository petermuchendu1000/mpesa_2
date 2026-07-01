package com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp;

import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÇ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/ImageUpload;", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "<init>", "(Ljava/lang/Object;)V", "getResponse", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageUpload {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private final Object component3;

    public ImageUpload(Object obj) {
        this.component3 = obj;
    }

    public final Object getResponse() {
        Object obj;
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            obj = this.component3;
            int i4 = 95 / 0;
        } else {
            obj = this.component3;
        }
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    static {
        int i = 1 + 103;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static ImageUpload copy$default(ImageUpload imageUpload, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = copydefault + 85;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            obj = imageUpload.component3;
            int i6 = i4 + 113;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return imageUpload.copy(obj);
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.component3;
        int i4 = i3 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return obj2;
    }

    public final ImageUpload copy(Object response) {
        int i = 2 % 2;
        ImageUpload imageUpload = new ImageUpload(response);
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return imageUpload;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i5 = i4 + 73;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (other instanceof ImageUpload) {
            return Intrinsics.areEqual(this.component3, ((ImageUpload) other).component3);
        }
        int i7 = i2 + 73;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i2 + 121;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Object obj = this.component3;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
        }
        int i4 = copydefault + 35;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImageUpload(response=" + this.component3 + ")";
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
