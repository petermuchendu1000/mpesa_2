package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/ThemeDetailResp;", "Lcom/huawei/http/BaseResp;", "functionDefine", "", "themeId", "", "themeVersion", "", "zipUrl", "i18ResourceInfo", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)V", "getFunctionDefine", "()Ljava/lang/Object;", "setFunctionDefine", "(Ljava/lang/Object;)V", "getThemeId", "()Ljava/lang/String;", "setThemeId", "(Ljava/lang/String;)V", "getThemeVersion", "()Ljava/lang/Integer;", "setThemeVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getZipUrl", "setZipUrl", "getI18ResourceInfo", "setI18ResourceInfo", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)Lcom/huawei/digitalpayment/common/theme/data/ThemeDetailResp;", "equals", "", "other", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemeDetailResp extends BaseResp {
    private static int component2 = 0;
    private static int component3 = 1;
    private Object functionDefine;
    private Object i18ResourceInfo;
    private String themeId;
    private Integer themeVersion;
    private String zipUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemeDetailResp(Object obj, String str, Integer num, String str2, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        String str3;
        Object obj3;
        Object obj4 = (i & 1) != 0 ? null : obj;
        String str4 = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i2 = component3 + 27;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 53 / 0;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i & 16) != 0) {
            int i5 = component3 + 121;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            obj3 = null;
        } else {
            obj3 = obj2;
        }
        this(obj4, str4, num2, str3, obj3);
    }

    public final Object getFunctionDefine() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.functionDefine;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void setFunctionDefine(Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.functionDefine = obj;
        int i5 = i3 + 33;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getThemeId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.themeId;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setThemeId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.themeId = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Integer getThemeVersion() {
        Integer num;
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.themeVersion;
            int i4 = 93 / 0;
        } else {
            num = this.themeVersion;
        }
        int i5 = i3 + 67;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final void setThemeVersion(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.themeVersion = num;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getZipUrl() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.zipUrl;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setZipUrl(String str) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.zipUrl = str;
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = i3 + 115;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final Object getI18ResourceInfo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.i18ResourceInfo;
        int i4 = i2 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return obj2;
    }

    public final void setI18ResourceInfo(Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.i18ResourceInfo = obj;
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public ThemeDetailResp(Object obj, String str, Integer num, String str2, Object obj2) {
        this.functionDefine = obj;
        this.themeId = str;
        this.themeVersion = num;
        this.zipUrl = str2;
        this.i18ResourceInfo = obj2;
    }

    public ThemeDetailResp() {
        this(null, null, null, null, null, 31, null);
    }

    public static ThemeDetailResp copy$default(ThemeDetailResp themeDetailResp, Object obj, String str, Integer num, String str2, Object obj2, int i, Object obj3) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 107;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            obj = themeDetailResp.functionDefine;
        }
        Object obj4 = obj;
        if ((i & 2) != 0) {
            str = themeDetailResp.themeId;
            int i5 = component3 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            int i7 = component3 + 63;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            num = themeDetailResp.themeVersion;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            int i9 = component3 + 105;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                String str4 = themeDetailResp.zipUrl;
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            str2 = themeDetailResp.zipUrl;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            obj2 = themeDetailResp.i18ResourceInfo;
        }
        return themeDetailResp.copy(obj4, str3, num2, str5, obj2);
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.functionDefine;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return obj;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.themeId;
        int i5 = i3 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.themeVersion;
        int i4 = i2 + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.zipUrl;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.i18ResourceInfo;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final ThemeDetailResp copy(Object functionDefine, String themeId, Integer themeVersion, String zipUrl, Object i18ResourceInfo) {
        int i = 2 % 2;
        ThemeDetailResp themeDetailResp = new ThemeDetailResp(functionDefine, themeId, themeVersion, zipUrl, i18ResourceInfo);
        int i2 = component3 + 3;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return themeDetailResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 119;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(other instanceof ThemeDetailResp))) {
            ThemeDetailResp themeDetailResp = (ThemeDetailResp) other;
            return Intrinsics.areEqual(this.functionDefine, themeDetailResp.functionDefine) && Intrinsics.areEqual(this.themeId, themeDetailResp.themeId) && Intrinsics.areEqual(this.themeVersion, themeDetailResp.themeVersion) && Intrinsics.areEqual(this.zipUrl, themeDetailResp.zipUrl) && Intrinsics.areEqual(this.i18ResourceInfo, themeDetailResp.i18ResourceInfo);
        }
        int i4 = component3 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        Object obj;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        int i3 = component2 + 53;
        component3 = i3 % 128;
        int iHashCode4 = 1;
        if (i3 % 2 == 0) {
            obj = this.functionDefine;
            if (obj == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = obj.hashCode();
            }
        } else {
            obj = this.functionDefine;
            if (obj == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = obj.hashCode();
            }
        }
        String str = this.themeId;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Integer num = this.themeVersion;
        if (num == null) {
            int i4 = component2 + 21;
            component3 = i4 % 128;
            iHashCode3 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = num.hashCode();
        }
        String str2 = this.zipUrl;
        if (str2 == null) {
            int i5 = component3 + 63;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = str2.hashCode();
        }
        Object obj2 = this.i18ResourceInfo;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThemeDetailResp(functionDefine=" + this.functionDefine + ", themeId=" + this.themeId + ", themeVersion=" + this.themeVersion + ", zipUrl=" + this.zipUrl + ", i18ResourceInfo=" + this.i18ResourceInfo + ")";
        int i2 = component3 + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
