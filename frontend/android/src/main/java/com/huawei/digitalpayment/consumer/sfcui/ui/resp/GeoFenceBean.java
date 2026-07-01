package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.common.interceptor.AppLogInterceptor;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/GeoFenceBean;", "Ljava/io/Serializable;", "resultCode", "", "resultDesc", "additionalInfo", "errorMessage", "errorCode", AppLogInterceptor.MESSAGE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResultCode", "()Ljava/lang/String;", "setResultCode", "(Ljava/lang/String;)V", "getResultDesc", "setResultDesc", "getAdditionalInfo", "setAdditionalInfo", "getErrorMessage", "setErrorMessage", "getErrorCode", "setErrorCode", "getMessageId", "setMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeoFenceBean implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 21 % 128;
    private String additionalInfo;
    private String errorCode;
    private String errorMessage;
    private String messageId;
    private String resultCode;
    private String resultDesc;

    public GeoFenceBean(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.resultCode = str;
        this.resultDesc = str2;
        this.additionalInfo = str3;
        this.errorMessage = str4;
        this.errorCode = str5;
        this.messageId = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoFenceBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10 = "";
        if ((i & 1) != 0) {
            int i2 = component2 + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 113;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 83;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str8 = "";
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 41;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str9 = "";
        } else {
            str9 = str4;
        }
        String str11 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i9 = 2 % 2;
        } else {
            str10 = str6;
        }
        this(str, str7, str8, str9, str11, str10);
    }

    public final String getResultCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resultCode;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setResultCode(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.resultCode = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.resultCode = str;
            int i3 = 39 / 0;
        }
    }

    public final String getResultDesc() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resultDesc;
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setResultDesc(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.resultDesc = str;
        int i4 = ShareDataUIState + 83;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    public final String getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.additionalInfo;
        }
        throw null;
    }

    public final void setAdditionalInfo(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalInfo = str;
        int i4 = ShareDataUIState + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.errorMessage;
        int i5 = i3 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setErrorMessage(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
        int i4 = component2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getErrorCode() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.errorCode;
            int i4 = 97 / 0;
        } else {
            str = this.errorCode;
        }
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setErrorCode(String str) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
        int i4 = component2 + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.messageId;
        int i4 = i2 + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setMessageId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.messageId = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.messageId = str;
        int i3 = component2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    static {
        int i = 21 % 2;
    }

    public GeoFenceBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static GeoFenceBean copy$default(GeoFenceBean geoFenceBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 17;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = geoFenceBean.resultCode;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = geoFenceBean.resultDesc;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i5 = component2 + 59;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str3 = geoFenceBean.additionalInfo;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 41;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str4 = geoFenceBean.errorMessage;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = geoFenceBean.errorCode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            int i9 = ShareDataUIState + 63;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                String str12 = geoFenceBean.messageId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str6 = geoFenceBean.messageId;
        }
        return geoFenceBean.copy(str7, str8, str9, str10, str11, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.resultCode;
        int i4 = i3 + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resultDesc;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.additionalInfo;
        int i4 = i3 + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.errorMessage;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.errorCode;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.messageId;
        int i4 = i2 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final GeoFenceBean copy(String resultCode, String resultDesc, String additionalInfo, String errorMessage, String errorCode, String messageId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resultCode, "");
        Intrinsics.checkNotNullParameter(resultDesc, "");
        Intrinsics.checkNotNullParameter(additionalInfo, "");
        Intrinsics.checkNotNullParameter(errorMessage, "");
        Intrinsics.checkNotNullParameter(errorCode, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        GeoFenceBean geoFenceBean = new GeoFenceBean(resultCode, resultDesc, additionalInfo, errorMessage, errorCode, messageId);
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return geoFenceBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 11;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return true;
        }
        if (!(other instanceof GeoFenceBean)) {
            int i4 = ShareDataUIState + 101;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GeoFenceBean geoFenceBean = (GeoFenceBean) other;
        if (!Intrinsics.areEqual(this.resultCode, geoFenceBean.resultCode)) {
            int i5 = component2 + 99;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.resultDesc, geoFenceBean.resultDesc)) {
            int i7 = ShareDataUIState + 49;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.additionalInfo, geoFenceBean.additionalInfo)) {
            int i9 = component2 + 117;
            ShareDataUIState = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.errorMessage, geoFenceBean.errorMessage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.errorCode, geoFenceBean.errorCode)) {
            int i10 = ShareDataUIState + 103;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.messageId, geoFenceBean.messageId)) {
            return true;
        }
        int i12 = component2 + 63;
        ShareDataUIState = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.resultCode.hashCode() * 31) + this.resultDesc.hashCode()) * 31) + this.additionalInfo.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.messageId.hashCode();
        int i4 = component2 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GeoFenceBean(resultCode=" + this.resultCode + ", resultDesc=" + this.resultDesc + ", additionalInfo=" + this.additionalInfo + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ", messageId=" + this.messageId + ")";
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
