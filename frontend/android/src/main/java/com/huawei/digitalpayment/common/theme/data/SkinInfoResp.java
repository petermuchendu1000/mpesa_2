package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/SkinInfoResp;", "Lcom/huawei/http/BaseResp;", "themeName", "", "themeDescription", "status", "preview", "themeId", "version", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getThemeName", "()Ljava/lang/String;", "setThemeName", "(Ljava/lang/String;)V", "getThemeDescription", "setThemeDescription", "getStatus", "setStatus", "getPreview", "setPreview", "getThemeId", "setThemeId", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SkinInfoResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private String preview;
    private String status;
    private String themeDescription;
    private String themeId;
    private String themeName;
    private Integer version;

    /* JADX WARN: Illegal instructions before constructor call */
    public SkinInfoResp(String str, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        Integer num2;
        String str8 = (i & 1) != 0 ? null : str;
        String str9 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = copydefault + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        String str10 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i5 = copydefault + 107;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 63 / 0;
            }
            int i7 = 2 % 2;
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((i & 32) != 0) {
            int i8 = copydefault + 123;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 4;
            } else {
                int i10 = 2 % 2;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        this(str8, str9, str6, str10, str7, num2);
    }

    public final String getThemeName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.themeName;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setThemeName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.themeName = str;
        int i5 = i3 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getThemeDescription() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.themeDescription;
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final void setThemeDescription(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.themeDescription = str;
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 5;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setStatus(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.status = str;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getPreview() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.preview;
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPreview(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.preview = str;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getThemeId() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.themeId;
        }
        throw null;
    }

    public final void setThemeId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.themeId = str;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getVersion() {
        Integer num;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.version;
            int i4 = 11 / 0;
        } else {
            num = this.version;
        }
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setVersion(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.version = num;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public SkinInfoResp(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.themeName = str;
        this.themeDescription = str2;
        this.status = str3;
        this.preview = str4;
        this.themeId = str5;
        this.version = num;
    }

    public SkinInfoResp() {
        this(null, null, null, null, null, null, 63, null);
    }
}
