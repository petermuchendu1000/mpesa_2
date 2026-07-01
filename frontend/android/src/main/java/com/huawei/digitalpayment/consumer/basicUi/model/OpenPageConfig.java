package com.huawei.digitalpayment.consumer.basicUi.model;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/model/OpenPageConfig;", "", CdpConstants.CONTENT_IMAGE_URL, "", KeysConstants.KEY_EXECUTE, GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT, "", "showSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getImgUrl", "()Ljava/lang/String;", "getExecute", "getExpireTime", "()J", "getShowSeconds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenPageConfig {
    private static int ShareDataUIState = 0;
    private static int equals = 1;
    private final String component1;
    private final String component2;
    private final long component3;
    private final String copydefault;

    public OpenPageConfig(String str, String str2, long j, String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.component1 = str2;
        this.component3 = j;
        this.component2 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OpenPageConfig(String str, String str2, long j, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = ShareDataUIState + 115;
            equals = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j = 0;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 121;
            int i6 = i5 % 128;
            equals = i6;
            if (i5 % 2 == 0) {
                int i7 = 23 / 0;
            }
            int i8 = i6 + 81;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str3 = "3";
        }
        this(str, str2, j2, str3);
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 41;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final long getExpireTime() {
        int i = 2 % 2;
        int i2 = equals + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        long j = this.component3;
        int i5 = i3 + 111;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String getImgUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getShowSeconds() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static OpenPageConfig copy$default(OpenPageConfig openPageConfig, String str, String str2, long j, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 51;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 3;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = openPageConfig.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = openPageConfig.component1;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = openPageConfig.component3;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = openPageConfig.component2;
        }
        return openPageConfig.copy(str, str4, j2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component3() {
        int i = 2 % 2;
        int i2 = equals + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        long j = this.component3;
        int i5 = i3 + 105;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final OpenPageConfig copy(String imgUrl, String execute, long expireTime, String showSeconds) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(showSeconds, "");
        OpenPageConfig openPageConfig = new OpenPageConfig(imgUrl, execute, expireTime, showSeconds);
        int i2 = ShareDataUIState + 55;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return openPageConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof OpenPageConfig)) {
            return false;
        }
        OpenPageConfig openPageConfig = (OpenPageConfig) other;
        if (!Intrinsics.areEqual(this.copydefault, openPageConfig.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, openPageConfig.component1)) {
            int i4 = ShareDataUIState + 23;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.component3 != openPageConfig.component3) {
            int i6 = ShareDataUIState + 111;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, openPageConfig.component2)) {
            return true;
        }
        int i8 = ShareDataUIState + 81;
        equals = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.copydefault;
        if (str == null) {
            int i2 = ShareDataUIState + 117;
            equals = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.component1;
        int iHashCode2 = (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.component3)) * 31) + this.component2.hashCode();
        int i4 = ShareDataUIState + 21;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OpenPageConfig(imgUrl=" + this.copydefault + ", execute=" + this.component1 + ", expireTime=" + this.component3 + ", showSeconds=" + this.component2 + ")";
        int i2 = equals + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
