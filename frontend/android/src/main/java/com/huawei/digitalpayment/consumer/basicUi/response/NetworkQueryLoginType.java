package com.huawei.digitalpayment.consumer.basicUi.response;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0086\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/response/NetworkQueryLoginType;", "Lcom/huawei/http/BaseResp;", "isPinExpired", "", KeysConstants.KEY_FORWARD, "supportPinLogin", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, "", KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, "isActive", KeysConstants.KEY_LOGIN_TYPE, "asyncRegisterDesc", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, "extResponse", "Lcom/huawei/digitalpayment/consumer/basicUi/response/ExtResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/basicUi/response/ExtResponse;)V", "()Ljava/lang/String;", "setPinExpired", "(Ljava/lang/String;)V", "getForward", "setForward", "getSupportPinLogin", "setSupportPinLogin", "getSupportFingerprintLogin", "()Ljava/lang/Boolean;", "setSupportFingerprintLogin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSupportFaceLogin", "setSupportFaceLogin", "setActive", "getLoginType", "setLoginType", "getAsyncRegisterDesc", "getOneStepRegisterTag", "getExtResponse", "()Lcom/huawei/digitalpayment/consumer/basicUi/response/ExtResponse;", "setExtResponse", "(Lcom/huawei/digitalpayment/consumer/basicUi/response/ExtResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/basicUi/response/ExtResponse;)Lcom/huawei/digitalpayment/consumer/basicUi/response/NetworkQueryLoginType;", "equals", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkQueryLoginType extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private final String asyncRegisterDesc;
    private ExtResponse extResponse;
    private String forward;
    private Boolean isActive;
    private String isPinExpired;
    private String loginType;
    private final Boolean oneStepRegisterTag;
    private Boolean supportFaceLogin;
    private Boolean supportFingerprintLogin;
    private String supportPinLogin;

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkQueryLoginType(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Boolean bool4, ExtResponse extResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        Boolean bool5;
        Boolean bool6;
        String str8;
        Boolean bool7;
        ExtResponse extResponse2 = null;
        if ((i & 1) != 0) {
            int i2 = component2 + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 79;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
            }
            str7 = null;
        } else {
            str7 = str2;
        }
        String str9 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i6 = component2 + 57;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            bool5 = null;
        } else {
            bool5 = bool;
        }
        Boolean bool8 = (i & 16) != 0 ? null : bool2;
        if ((i & 32) != 0) {
            int i9 = component2;
            int i10 = i9 + 7;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 75;
            component3 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 2;
            }
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        if ((i & 64) != 0) {
            int i14 = component2 + 123;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        String str10 = (i & 128) != 0 ? null : str5;
        if ((i & 256) != 0) {
            int i17 = 2 % 2;
            bool7 = null;
        } else {
            bool7 = bool4;
        }
        if ((i & 512) != 0) {
            int i18 = component3 + 105;
            component2 = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 51 / 0;
            }
        } else {
            extResponse2 = extResponse;
        }
        this(str6, str7, str9, bool5, bool8, bool6, str8, str10, bool7, extResponse2);
    }

    public final String isPinExpired() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.isPinExpired;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public final void setPinExpired(String str) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.isPinExpired = str;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getForward() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.forward;
        int i4 = i3 + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return str;
    }

    public final void setForward(String str) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.forward = str;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSupportPinLogin() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.supportPinLogin;
        int i4 = i3 + 57;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setSupportPinLogin(String str) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.supportPinLogin = str;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    public final Boolean getSupportFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.supportFingerprintLogin;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setSupportFingerprintLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.supportFingerprintLogin = bool;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
    }

    public final Boolean getSupportFaceLogin() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.supportFaceLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportFaceLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.supportFaceLogin = bool;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
    }

    public final Boolean isActive() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isActive;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setActive(Boolean bool) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.isActive = bool;
        int i5 = i2 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getLoginType() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.loginType;
            int i4 = 93 / 0;
        } else {
            str = this.loginType;
        }
        int i5 = i3 + 113;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLoginType(String str) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.loginType = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getOneStepRegisterTag() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.oneStepRegisterTag;
        int i4 = i2 + 59;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return bool;
    }

    public final ExtResponse getExtResponse() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ExtResponse extResponse = this.extResponse;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return extResponse;
    }

    public final void setExtResponse(ExtResponse extResponse) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.extResponse = extResponse;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NetworkQueryLoginType(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Boolean bool4, ExtResponse extResponse) {
        this.isPinExpired = str;
        this.forward = str2;
        this.supportPinLogin = str3;
        this.supportFingerprintLogin = bool;
        this.supportFaceLogin = bool2;
        this.isActive = bool3;
        this.loginType = str4;
        this.asyncRegisterDesc = str5;
        this.oneStepRegisterTag = bool4;
        this.extResponse = extResponse;
    }

    public NetworkQueryLoginType() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static NetworkQueryLoginType copy$default(NetworkQueryLoginType networkQueryLoginType, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Boolean bool4, ExtResponse extResponse, int i, Object obj) {
        String str6;
        String str7;
        String str8;
        Boolean bool5;
        String str9;
        Boolean bool6;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 33;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str6 = networkQueryLoginType.isPinExpired;
                int i4 = 76 / 0;
            } else {
                str6 = networkQueryLoginType.isPinExpired;
            }
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            str7 = networkQueryLoginType.forward;
            int i5 = component2 + 97;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = component2 + 33;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str8 = networkQueryLoginType.supportPinLogin;
        } else {
            str8 = str3;
        }
        Boolean bool7 = (i & 8) != 0 ? networkQueryLoginType.supportFingerprintLogin : bool;
        if ((i & 16) != 0) {
            int i9 = component2 + 79;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            bool5 = networkQueryLoginType.supportFaceLogin;
        } else {
            bool5 = bool2;
        }
        Boolean bool8 = (i & 32) != 0 ? networkQueryLoginType.isActive : bool3;
        if ((i & 64) != 0) {
            int i11 = component2 + 109;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str9 = networkQueryLoginType.loginType;
        } else {
            str9 = str4;
        }
        String str10 = (i & 128) != 0 ? networkQueryLoginType.asyncRegisterDesc : str5;
        if ((i & 256) != 0) {
            int i13 = component2 + 37;
            component3 = i13 % 128;
            if (i13 % 2 != 0) {
                Boolean bool9 = networkQueryLoginType.oneStepRegisterTag;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bool6 = networkQueryLoginType.oneStepRegisterTag;
        } else {
            bool6 = bool4;
        }
        return networkQueryLoginType.copy(str6, str7, str8, bool7, bool5, bool8, str9, str10, bool6, (i & 512) != 0 ? networkQueryLoginType.extResponse : extResponse);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isPinExpired;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ExtResponse component10() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extResponse;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.forward;
        int i4 = i3 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportPinLogin;
        }
        throw null;
    }

    public final Boolean component4() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.supportFingerprintLogin;
        int i4 = i3 + 119;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return bool;
    }

    public final Boolean component5() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.supportFaceLogin;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final Boolean component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.isActive;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loginType;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i2 + 79;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.oneStepRegisterTag;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NetworkQueryLoginType copy(String isPinExpired, String forward, String supportPinLogin, Boolean supportFingerprintLogin, Boolean supportFaceLogin, Boolean isActive, String loginType, String asyncRegisterDesc, Boolean oneStepRegisterTag, ExtResponse extResponse) {
        int i = 2 % 2;
        NetworkQueryLoginType networkQueryLoginType = new NetworkQueryLoginType(isPinExpired, forward, supportPinLogin, supportFingerprintLogin, supportFaceLogin, isActive, loginType, asyncRegisterDesc, oneStepRegisterTag, extResponse);
        int i2 = component3 + 111;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return networkQueryLoginType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 41;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof NetworkQueryLoginType)) {
            return false;
        }
        NetworkQueryLoginType networkQueryLoginType = (NetworkQueryLoginType) other;
        if (!Intrinsics.areEqual(this.isPinExpired, networkQueryLoginType.isPinExpired)) {
            int i4 = component2 + 57;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.forward, networkQueryLoginType.forward)) {
            int i5 = component2 + 89;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.supportPinLogin, networkQueryLoginType.supportPinLogin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.supportFingerprintLogin, networkQueryLoginType.supportFingerprintLogin)) {
            int i6 = component2 + 7;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.supportFaceLogin, networkQueryLoginType.supportFaceLogin) || !Intrinsics.areEqual(this.isActive, networkQueryLoginType.isActive)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.loginType, networkQueryLoginType.loginType)) {
            int i8 = component3 + 93;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asyncRegisterDesc, networkQueryLoginType.asyncRegisterDesc) || !Intrinsics.areEqual(this.oneStepRegisterTag, networkQueryLoginType.oneStepRegisterTag) || !Intrinsics.areEqual(this.extResponse, networkQueryLoginType.extResponse)) {
            return false;
        }
        int i10 = component3 + 89;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.isPinExpired;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.forward;
        if (str2 == null) {
            int i2 = component3;
            int i3 = i2 + 125;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.supportPinLogin;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.supportFingerprintLogin;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.supportFaceLogin;
        if (bool2 == null) {
            int i7 = component2 + 59;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool2.hashCode();
            int i9 = component2 + 97;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 / 3;
            }
        }
        Boolean bool3 = this.isActive;
        int iHashCode8 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.loginType;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.asyncRegisterDesc;
        if (str5 == null) {
            int i11 = component3 + 113;
            component2 = i11 % 128;
            iHashCode3 = i11 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        Boolean bool4 = this.oneStepRegisterTag;
        if (bool4 == null) {
            int i12 = component3 + 5;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = bool4.hashCode();
        }
        ExtResponse extResponse = this.extResponse;
        return (((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (extResponse != null ? extResponse.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NetworkQueryLoginType(isPinExpired=" + this.isPinExpired + ", forward=" + this.forward + ", supportPinLogin=" + this.supportPinLogin + ", supportFingerprintLogin=" + this.supportFingerprintLogin + ", supportFaceLogin=" + this.supportFaceLogin + ", isActive=" + this.isActive + ", loginType=" + this.loginType + ", asyncRegisterDesc=" + this.asyncRegisterDesc + ", oneStepRegisterTag=" + this.oneStepRegisterTag + ", extResponse=" + this.extResponse + ")";
        int i2 = component3 + 99;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return str;
    }
}
