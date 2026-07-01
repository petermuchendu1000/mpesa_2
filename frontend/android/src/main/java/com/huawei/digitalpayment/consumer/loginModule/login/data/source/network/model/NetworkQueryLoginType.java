package com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0086\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/NetworkQueryLoginType;", "Lcom/huawei/http/BaseResp;", "isPinExpired", "", KeysConstants.KEY_FORWARD, "supportPinLogin", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, "", KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, "isActive", KeysConstants.KEY_LOGIN_TYPE, "asyncRegisterDesc", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, "extResponse", "Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/ExtResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/ExtResponse;)V", "()Ljava/lang/String;", "setPinExpired", "(Ljava/lang/String;)V", "getForward", "setForward", "getSupportPinLogin", "setSupportPinLogin", "getSupportFingerprintLogin", "()Ljava/lang/Boolean;", "setSupportFingerprintLogin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSupportFaceLogin", "setSupportFaceLogin", "setActive", "getLoginType", "setLoginType", "getAsyncRegisterDesc", "getOneStepRegisterTag", "getExtResponse", "()Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/ExtResponse;", "setExtResponse", "(Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/ExtResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/ExtResponse;)Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/NetworkQueryLoginType;", "equals", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkQueryLoginType extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
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
        ExtResponse extResponse2 = null;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 93;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        String str8 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i7 = copydefault + 59;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            bool5 = null;
        } else {
            bool5 = bool;
        }
        if ((i & 16) != 0) {
            int i10 = ShareDataUIState + 87;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            bool6 = null;
        } else {
            bool6 = bool2;
        }
        Boolean bool7 = (i & 32) != 0 ? null : bool3;
        String str9 = (i & 64) != 0 ? null : str4;
        String str10 = (i & 128) != 0 ? null : str5;
        Boolean bool8 = (i & 256) != 0 ? null : bool4;
        if ((i & 512) != 0) {
            int i12 = 2 % 2;
        } else {
            extResponse2 = extResponse;
        }
        this(str6, str7, str8, bool5, bool6, bool7, str9, str10, bool8, extResponse2);
    }

    public final String isPinExpired() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.isPinExpired;
        int i4 = i2 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return str;
    }

    public final void setPinExpired(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.isPinExpired = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getForward() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.forward;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setForward(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.forward = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSupportPinLogin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.supportPinLogin;
        int i5 = i2 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportPinLogin(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.supportPinLogin = str;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Boolean getSupportFingerprintLogin() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            bool = this.supportFingerprintLogin;
            int i4 = 42 / 0;
        } else {
            bool = this.supportFingerprintLogin;
        }
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return bool;
    }

    public final void setSupportFingerprintLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.supportFingerprintLogin = bool;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Boolean getSupportFaceLogin() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.supportFaceLogin;
        int i4 = i2 + 77;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final void setSupportFaceLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.supportFaceLogin = bool;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Boolean isActive() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isActive;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setActive(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.isActive = bool;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getLoginType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.loginType;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setLoginType(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.loginType = str;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        int i6 = i2 + 21;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.asyncRegisterDesc;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    public final Boolean getOneStepRegisterTag() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.oneStepRegisterTag;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final ExtResponse getExtResponse() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ExtResponse extResponse = this.extResponse;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return extResponse;
    }

    public final void setExtResponse(ExtResponse extResponse) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.extResponse = extResponse;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
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
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        int i2 = 2 % 2;
        String str7 = (i & 1) != 0 ? networkQueryLoginType.isPinExpired : str;
        String str8 = (i & 2) != 0 ? networkQueryLoginType.forward : str2;
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 53;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                str6 = networkQueryLoginType.supportPinLogin;
                int i4 = 51 / 0;
            } else {
                str6 = networkQueryLoginType.supportPinLogin;
            }
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            bool5 = networkQueryLoginType.supportFingerprintLogin;
            int i5 = copydefault + 61;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            bool5 = bool;
        }
        if ((i & 16) != 0) {
            int i7 = ShareDataUIState + 81;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            bool6 = networkQueryLoginType.supportFaceLogin;
        } else {
            bool6 = bool2;
        }
        if ((i & 32) != 0) {
            bool7 = networkQueryLoginType.isActive;
            int i9 = copydefault + 85;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            bool7 = bool3;
        }
        return networkQueryLoginType.copy(str7, str8, str6, bool5, bool6, bool7, (i & 64) != 0 ? networkQueryLoginType.loginType : str4, (i & 128) != 0 ? networkQueryLoginType.asyncRegisterDesc : str5, (i & 256) != 0 ? networkQueryLoginType.oneStepRegisterTag : bool4, (i & 512) != 0 ? networkQueryLoginType.extResponse : extResponse);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.isPinExpired;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ExtResponse component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ExtResponse extResponse = this.extResponse;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return extResponse;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.forward;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.supportPinLogin;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final Boolean component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportFingerprintLogin;
        }
        throw null;
    }

    public final Boolean component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.supportFaceLogin;
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final Boolean component6() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            bool = this.isActive;
            int i4 = 47 / 0;
        } else {
            bool = this.isActive;
        }
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.loginType;
        int i4 = i3 + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asyncRegisterDesc;
        }
        throw null;
    }

    public final Boolean component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.oneStepRegisterTag;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
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
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return networkQueryLoginType;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkQueryLoginType)) {
            return false;
        }
        NetworkQueryLoginType networkQueryLoginType = (NetworkQueryLoginType) other;
        if (!Intrinsics.areEqual(this.isPinExpired, networkQueryLoginType.isPinExpired) || !Intrinsics.areEqual(this.forward, networkQueryLoginType.forward) || !Intrinsics.areEqual(this.supportPinLogin, networkQueryLoginType.supportPinLogin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.supportFingerprintLogin, networkQueryLoginType.supportFingerprintLogin)) {
            int i2 = ShareDataUIState + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.supportFaceLogin, networkQueryLoginType.supportFaceLogin)) {
            int i4 = ShareDataUIState + 53;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.isActive, networkQueryLoginType.isActive) || !Intrinsics.areEqual(this.loginType, networkQueryLoginType.loginType) || !Intrinsics.areEqual(this.asyncRegisterDesc, networkQueryLoginType.asyncRegisterDesc) || !Intrinsics.areEqual(this.oneStepRegisterTag, networkQueryLoginType.oneStepRegisterTag)) {
            return false;
        }
        if (Intrinsics.areEqual(this.extResponse, networkQueryLoginType.extResponse)) {
            return true;
        }
        int i6 = copydefault + 39;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int iHashCode5 = (i2 % 2 == 0 ? (str = this.isPinExpired) != null : (str = this.isPinExpired) != null) ? str.hashCode() : 0;
        String str2 = this.forward;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.supportPinLogin;
        if (str3 == null) {
            int i3 = copydefault + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        Boolean bool = this.supportFingerprintLogin;
        if (bool == null) {
            int i5 = ShareDataUIState + 89;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
        }
        Boolean bool2 = this.supportFaceLogin;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isActive;
        if (bool3 == null) {
            int i7 = copydefault + 45;
            ShareDataUIState = i7 % 128;
            iHashCode3 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = bool3.hashCode();
            int i8 = copydefault + 99;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        String str4 = this.loginType;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.asyncRegisterDesc;
        if (str5 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
            int i10 = copydefault + 51;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        }
        Boolean bool4 = this.oneStepRegisterTag;
        int iHashCode9 = bool4 == null ? 0 : bool4.hashCode();
        ExtResponse extResponse = this.extResponse;
        return (((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + (extResponse != null ? extResponse.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NetworkQueryLoginType(isPinExpired=" + this.isPinExpired + ", forward=" + this.forward + ", supportPinLogin=" + this.supportPinLogin + ", supportFingerprintLogin=" + this.supportFingerprintLogin + ", supportFaceLogin=" + this.supportFaceLogin + ", isActive=" + this.isActive + ", loginType=" + this.loginType + ", asyncRegisterDesc=" + this.asyncRegisterDesc + ", oneStepRegisterTag=" + this.oneStepRegisterTag + ", extResponse=" + this.extResponse + ")";
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
