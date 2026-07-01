package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;", "Lcom/huawei/http/BaseResp;", "url", "", "width", "", "height", KeysConstants.KEY_EXECUTE, "roundCorner", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getExecute", "getRoundCorner", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteIconConfig extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String backgroundColor;
    private final String execute;
    private final Integer height;
    private final Integer roundCorner;
    private final String url;
    private final Integer width;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteIconConfig(String str, Integer num, Integer num2, String str2, Integer num3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4;
        Integer num5;
        Integer num6;
        Object obj = null;
        String str4 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 5;
            } else {
                int i4 = 2 % 2;
            }
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 19;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            num5 = null;
        } else {
            num5 = num2;
        }
        String str5 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            int i7 = 2 % 2;
            num6 = null;
        } else {
            num6 = num3;
        }
        this(str4, num4, num5, str5, num6, (i & 32) != 0 ? null : str3);
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer getWidth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.width;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getHeight() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.height;
        int i4 = i2 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.execute;
        int i4 = i3 + 17;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.roundCorner;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundColor;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public RemoteIconConfig(String str, Integer num, Integer num2, String str2, Integer num3, String str3) {
        this.url = str;
        this.width = num;
        this.height = num2;
        this.execute = str2;
        this.roundCorner = num3;
        this.backgroundColor = str3;
    }

    public RemoteIconConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static RemoteIconConfig copy$default(RemoteIconConfig remoteIconConfig, String str, Integer num, Integer num2, String str2, Integer num3, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component2 + 103;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                String str4 = remoteIconConfig.url;
                throw null;
            }
            str = remoteIconConfig.url;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 23;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                Integer num4 = remoteIconConfig.width;
                throw null;
            }
            num = remoteIconConfig.width;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            int i5 = component2 + 69;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                Integer num6 = remoteIconConfig.height;
                obj2.hashCode();
                throw null;
            }
            num2 = remoteIconConfig.height;
        }
        Integer num7 = num2;
        if ((i & 8) != 0) {
            str2 = remoteIconConfig.execute;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            int i6 = ShareDataUIState + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            num3 = remoteIconConfig.roundCorner;
        }
        Integer num8 = num3;
        if ((i & 32) != 0) {
            str3 = remoteIconConfig.backgroundColor;
        }
        return remoteIconConfig.copy(str5, num5, num7, str6, num8, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 79;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.width;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return num;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.height;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.roundCorner;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return num;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundColor;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RemoteIconConfig copy(String url, Integer width, Integer height, String execute, Integer roundCorner, String backgroundColor) {
        int i = 2 % 2;
        RemoteIconConfig remoteIconConfig = new RemoteIconConfig(url, width, height, execute, roundCorner, backgroundColor);
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return remoteIconConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteIconConfig)) {
            return false;
        }
        RemoteIconConfig remoteIconConfig = (RemoteIconConfig) other;
        if (!Intrinsics.areEqual(this.url, remoteIconConfig.url) || !Intrinsics.areEqual(this.width, remoteIconConfig.width)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.height, remoteIconConfig.height)) {
            int i4 = component2;
            int i5 = i4 + 85;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 85;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 70 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.execute, remoteIconConfig.execute)) {
            int i9 = component2 + 73;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.roundCorner, remoteIconConfig.roundCorner)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.backgroundColor, remoteIconConfig.backgroundColor))) {
            return true;
        }
        int i11 = component2 + 37;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 67;
        component2 = i3 % 128;
        int iHashCode5 = 1;
        int iHashCode6 = 0;
        if (i3 % 2 != 0) {
            str = this.url;
            if (str == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.url;
            if (str == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
            }
        }
        Integer num = this.width;
        if (num == null) {
            int i4 = component2 + 61;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num.hashCode();
        }
        Integer num2 = this.height;
        if (num2 == null) {
            int i6 = component2 + 73;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = num2.hashCode();
        }
        String str2 = this.execute;
        if (str2 == null) {
            int i7 = component2 + 47;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str2.hashCode();
            int i9 = component2 + 67;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 4;
            }
        }
        Integer num3 = this.roundCorner;
        if (num3 == null) {
            int i11 = ShareDataUIState + 125;
            component2 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iHashCode6 = num3.hashCode();
        }
        String str3 = this.backgroundColor;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteIconConfig(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", execute=" + this.execute + ", roundCorner=" + this.roundCorner + ", backgroundColor=" + this.backgroundColor + ")";
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
