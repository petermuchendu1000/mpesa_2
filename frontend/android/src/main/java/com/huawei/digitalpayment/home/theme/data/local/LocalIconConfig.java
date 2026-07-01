package com.huawei.digitalpayment.home.theme.data.local;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013JN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;", "Lcom/huawei/http/BaseResp;", "url", "", KeysConstants.KEY_EXECUTE, "width", "", "height", "roundCorner", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getExecute", "getWidth", "()I", "getHeight", "getRoundCorner", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalIconConfig extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Integer backgroundColor;
    private final String execute;
    private final int height;
    private final Integer roundCorner;
    private final String url;
    private final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalIconConfig(String str, String str2, int i, int i2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        Integer num3;
        if ((i3 & 1) != 0) {
            int i5 = 2 % 2;
            str = "";
        }
        String str3 = (i3 & 2) == 0 ? str2 : "";
        int i6 = -2;
        if ((i3 & 4) != 0) {
            int i7 = 2 % 2;
            i4 = -2;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            int i8 = component2 + 49;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            i6 = i2;
        }
        Object obj = null;
        if ((i3 & 16) != 0) {
            int i11 = ShareDataUIState + 43;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        this(str, str3, i4, i6, num3, (i3 & 32) != 0 ? null : num2);
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getWidth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.width;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getHeight() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.height;
        int i6 = i2 + 25;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.roundCorner;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.backgroundColor;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return num;
    }

    public LocalIconConfig(String str, String str2, int i, int i2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.url = str;
        this.execute = str2;
        this.width = i;
        this.height = i2;
        this.roundCorner = num;
        this.backgroundColor = num2;
    }

    public LocalIconConfig() {
        this(null, null, 0, 0, null, null, 63, null);
    }

    public static LocalIconConfig copy$default(LocalIconConfig localIconConfig, String str, String str2, int i, int i2, Integer num, Integer num2, int i3, Object obj) {
        int i4 = 2 % 2;
        Object obj2 = null;
        if ((i3 & 1) != 0) {
            int i5 = component2 + 99;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = localIconConfig.url;
                throw null;
            }
            str = localIconConfig.url;
        }
        String str4 = str;
        if ((i3 & 2) != 0) {
            int i6 = ShareDataUIState + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str2 = localIconConfig.execute;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            i = localIconConfig.width;
        }
        int i8 = i;
        if ((i3 & 8) != 0) {
            int i9 = component2 + 79;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = localIconConfig.height;
                obj2.hashCode();
                throw null;
            }
            i2 = localIconConfig.height;
        }
        int i11 = i2;
        if ((i3 & 16) != 0) {
            num = localIconConfig.roundCorner;
        }
        Integer num3 = num;
        if ((i3 & 32) != 0) {
            int i12 = component2 + 33;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 != 0) {
                Integer num4 = localIconConfig.backgroundColor;
                obj2.hashCode();
                throw null;
            }
            num2 = localIconConfig.backgroundColor;
        }
        return localIconConfig.copy(str4, str5, i8, i11, num3, num2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.url;
        int i4 = i2 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.width;
        if (i3 == 0) {
            int i5 = 28 / 0;
        }
        return i4;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.height;
        int i6 = i3 + 85;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.roundCorner;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.backgroundColor;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalIconConfig copy(String url, String execute, int width, int height, Integer roundCorner, Integer backgroundColor) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(url, "");
        Intrinsics.checkNotNullParameter(execute, "");
        LocalIconConfig localIconConfig = new LocalIconConfig(url, execute, width, height, roundCorner, backgroundColor);
        int i2 = ShareDataUIState + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return localIconConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 1;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof LocalIconConfig)) {
            return false;
        }
        LocalIconConfig localIconConfig = (LocalIconConfig) other;
        if (Intrinsics.areEqual(this.url, localIconConfig.url)) {
            return Intrinsics.areEqual(this.execute, localIconConfig.execute) && this.width == localIconConfig.width && this.height == localIconConfig.height && Intrinsics.areEqual(this.roundCorner, localIconConfig.roundCorner) && Intrinsics.areEqual(this.backgroundColor, localIconConfig.backgroundColor);
        }
        int i5 = component2 + 7;
        ShareDataUIState = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.url.hashCode();
        int iHashCode3 = this.execute.hashCode();
        int iHashCode4 = Integer.hashCode(this.width);
        int iHashCode5 = Integer.hashCode(this.height);
        Integer num = this.roundCorner;
        int iHashCode6 = 0;
        if (num == null) {
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
            int i3 = component2 + 97;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
        }
        Integer num2 = this.backgroundColor;
        if (num2 != null) {
            iHashCode6 = num2.hashCode();
            int i5 = ShareDataUIState + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalIconConfig(url=" + this.url + ", execute=" + this.execute + ", width=" + this.width + ", height=" + this.height + ", roundCorner=" + this.roundCorner + ", backgroundColor=" + this.backgroundColor + ")";
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
