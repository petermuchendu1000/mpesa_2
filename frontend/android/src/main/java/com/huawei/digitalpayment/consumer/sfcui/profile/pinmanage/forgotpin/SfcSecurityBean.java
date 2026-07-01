package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.forgotpin;

import com.alibaba.griver.api.constants.GriverEvents;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/forgotpin/SfcSecurityBean;", "Lcom/huawei/http/BaseResp;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", GriverEvents.EVENT_SET_TITLE, "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcSecurityBean extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private String title;

    /* JADX WARN: Illegal instructions before constructor call */
    public SfcSecurityBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 9;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "";
            int i3 = 2 % 2;
        }
        this(str);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTitle(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.title = str;
        int i5 = i2 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcSecurityBean(String str) {
        this.title = str;
    }

    static {
        int i = 1 + 55;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SfcSecurityBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static SfcSecurityBean copy$default(SfcSecurityBean sfcSecurityBean, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = sfcSecurityBean.title;
            int i3 = copydefault + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        SfcSecurityBean sfcSecurityBeanCopy = sfcSecurityBean.copy(str);
        int i5 = ShareDataUIState + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sfcSecurityBeanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SfcSecurityBean copy(String title) {
        int i = 2 % 2;
        SfcSecurityBean sfcSecurityBean = new SfcSecurityBean(title);
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return sfcSecurityBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 95;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 89;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(other instanceof SfcSecurityBean)) {
            int i10 = i2 + 89;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.title, ((SfcSecurityBean) other).title)) {
            return true;
        }
        int i12 = copydefault + 123;
        ShareDataUIState = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        if (str == null) {
            int i2 = copydefault + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = copydefault + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SfcSecurityBean(title=" + this.title + ")";
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return str;
    }
}
