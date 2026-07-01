package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\t\u0010\u001a\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/RealContactResp;", "Ljava/io/Serializable;", SfcServicePinActivity.EXTRA_IMAGE_RES, "", "name", "", "phoneNumber", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getImageRes", "()I", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Constants.JS_API_GET_PHONE_NUMBER, "setPhoneNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RealContactResp implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final int imageRes;
    private String name;
    private String phoneNumber;

    public RealContactResp(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.imageRes = i;
        this.name = str;
        this.phoneNumber = str2;
    }

    public final int getImageRes() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.imageRes;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return i4;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        int i4 = copydefault + 23;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 119;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.phoneNumber = str;
        int i3 = copydefault + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    static {
        int i = 1 + 93;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static RealContactResp copy$default(RealContactResp realContactResp, int i, String str, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = copydefault + 81;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = realContactResp.imageRes;
                throw null;
            }
            i = realContactResp.imageRes;
        }
        if ((i2 & 2) != 0) {
            int i6 = copydefault + 99;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = realContactResp.name;
                throw null;
            }
            str = realContactResp.name;
        }
        if ((i2 & 4) != 0) {
            str2 = realContactResp.phoneNumber;
        }
        return realContactResp.copy(i, str, str2);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 43;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.imageRes;
            int i5 = 39 / 0;
        } else {
            i = this.imageRes;
        }
        int i6 = i3 + 121;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final RealContactResp copy(int imageRes, String name, String phoneNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        RealContactResp realContactResp = new RealContactResp(imageRes, name, phoneNumber);
        int i2 = copydefault + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return realContactResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (other instanceof RealContactResp) {
            RealContactResp realContactResp = (RealContactResp) other;
            return this.imageRes == realContactResp.imageRes && Intrinsics.areEqual(this.name, realContactResp.name) && Intrinsics.areEqual(this.phoneNumber, realContactResp.phoneNumber);
        }
        int i4 = i2 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 1;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.imageRes) * 31) + this.name.hashCode()) * 31) + this.phoneNumber.hashCode();
        int i4 = copydefault + 99;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RealContactResp(imageRes=" + this.imageRes + ", name=" + this.name + ", phoneNumber=" + this.phoneNumber + ")";
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
