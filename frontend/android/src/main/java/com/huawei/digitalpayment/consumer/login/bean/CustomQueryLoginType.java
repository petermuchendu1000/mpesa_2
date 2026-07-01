package com.huawei.digitalpayment.consumer.login.bean;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0086\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÇ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000106H×\u0003J\t\u00107\u001a\u000208H×\u0001J\t\u00109\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/bean/CustomQueryLoginType;", "Lcom/huawei/http/BaseResp;", "isPinExpired", "", KeysConstants.KEY_FORWARD, "supportPinLogin", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, "", KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, "isActive", KeysConstants.KEY_LOGIN_TYPE, "asyncRegisterDesc", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, "extResponse", "Lcom/huawei/digitalpayment/consumer/login/bean/CustomExtResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/login/bean/CustomExtResponse;)V", "()Ljava/lang/String;", "setPinExpired", "(Ljava/lang/String;)V", "getForward", "setForward", "getSupportPinLogin", "setSupportPinLogin", "getSupportFingerprintLogin", "()Ljava/lang/Boolean;", "setSupportFingerprintLogin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSupportFaceLogin", "setSupportFaceLogin", "setActive", "getLoginType", "setLoginType", "getAsyncRegisterDesc", "getOneStepRegisterTag", "getExtResponse", "()Lcom/huawei/digitalpayment/consumer/login/bean/CustomExtResponse;", "setExtResponse", "(Lcom/huawei/digitalpayment/consumer/login/bean/CustomExtResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/huawei/digitalpayment/consumer/login/bean/CustomExtResponse;)Lcom/huawei/digitalpayment/consumer/login/bean/CustomQueryLoginType;", "equals", "other", "", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomQueryLoginType extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 53 % 128;
    private static int component2;
    private static int copydefault;
    private final String asyncRegisterDesc;
    private CustomExtResponse extResponse;
    private String forward;
    private Boolean isActive;
    private String isPinExpired;
    private String loginType;
    private final Boolean oneStepRegisterTag;
    private Boolean supportFaceLogin;
    private Boolean supportFingerprintLogin;
    private String supportPinLogin;

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomQueryLoginType(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Boolean bool4, CustomExtResponse customExtResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        Boolean bool5;
        Boolean bool6;
        String str7;
        String str8;
        Boolean bool7;
        if ((i & 1) != 0) {
            int i2 = component2 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        String str9 = (i & 2) != 0 ? null : str2;
        String str10 = (i & 4) != 0 ? null : str3;
        Boolean bool8 = (i & 8) != 0 ? null : bool;
        if ((i & 16) != 0) {
            int i5 = 2 % 2;
            bool5 = null;
        } else {
            bool5 = bool2;
        }
        if ((i & 32) != 0) {
            int i6 = ShareDataUIState + 73;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        if ((i & 64) != 0) {
            int i8 = component2 + 29;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 28 / 0;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 128) != 0) {
            int i10 = ShareDataUIState + 101;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str8 = null;
        } else {
            str8 = str5;
        }
        if ((i & 256) != 0) {
            int i12 = component2;
            int i13 = i12 + 61;
            ShareDataUIState = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 21;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            bool7 = null;
        } else {
            bool7 = bool4;
        }
        this(str6, str9, str10, bool8, bool5, bool6, str7, str8, bool7, (i & 512) == 0 ? customExtResponse : null);
    }

    public final String isPinExpired() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.isPinExpired;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPinExpired(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.isPinExpired = str;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
    }

    public final String getForward() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.forward;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setForward(String str) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.forward = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 59;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
    }

    public final String getSupportPinLogin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.supportPinLogin;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final void setSupportPinLogin(String str) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.supportPinLogin = str;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Boolean getSupportFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.supportFingerprintLogin;
        int i5 = i3 + 39;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return bool;
    }

    public final void setSupportFingerprintLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.supportFingerprintLogin = bool;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean getSupportFaceLogin() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.supportFaceLogin;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setSupportFaceLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.supportFaceLogin = bool;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Boolean isActive() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isActive;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return bool;
    }

    public final void setActive(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.isActive = bool;
        int i5 = i3 + 5;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getLoginType() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.loginType;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final void setLoginType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.loginType = str;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getOneStepRegisterTag() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.oneStepRegisterTag;
        int i4 = i2 + 41;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public final CustomExtResponse getExtResponse() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CustomExtResponse customExtResponse = this.extResponse;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return customExtResponse;
    }

    public final void setExtResponse(CustomExtResponse customExtResponse) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.extResponse = customExtResponse;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }

    public CustomQueryLoginType(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Boolean bool4, CustomExtResponse customExtResponse) {
        this.isPinExpired = str;
        this.forward = str2;
        this.supportPinLogin = str3;
        this.supportFingerprintLogin = bool;
        this.supportFaceLogin = bool2;
        this.isActive = bool3;
        this.loginType = str4;
        this.asyncRegisterDesc = str5;
        this.oneStepRegisterTag = bool4;
        this.extResponse = customExtResponse;
    }

    static {
        int i = 53 % 2;
    }

    public CustomQueryLoginType() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static CustomQueryLoginType copy$default(CustomQueryLoginType customQueryLoginType, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Boolean bool4, CustomExtResponse customExtResponse, int i, Object obj) {
        String str6;
        Boolean bool5;
        String str7;
        int i2 = 2 % 2;
        String str8 = (i & 1) != 0 ? customQueryLoginType.isPinExpired : str;
        String str9 = (i & 2) != 0 ? customQueryLoginType.forward : str2;
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 3;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                String str10 = customQueryLoginType.supportPinLogin;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str6 = customQueryLoginType.supportPinLogin;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i4 = component2;
            int i5 = i4 + 41;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            bool5 = customQueryLoginType.supportFingerprintLogin;
            int i7 = i4 + 9;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 3;
            }
        } else {
            bool5 = bool;
        }
        Boolean bool6 = (i & 16) != 0 ? customQueryLoginType.supportFaceLogin : bool2;
        Boolean bool7 = (i & 32) != 0 ? customQueryLoginType.isActive : bool3;
        String str11 = (i & 64) != 0 ? customQueryLoginType.loginType : str4;
        if ((i & 128) != 0) {
            int i9 = ShareDataUIState;
            int i10 = i9 + 123;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str7 = customQueryLoginType.asyncRegisterDesc;
            int i12 = i9 + 55;
            component2 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 2;
            }
        } else {
            str7 = str5;
        }
        return customQueryLoginType.copy(str8, str9, str6, bool5, bool6, bool7, str11, str7, (i & 256) != 0 ? customQueryLoginType.oneStepRegisterTag : bool4, (i & 512) != 0 ? customQueryLoginType.extResponse : customExtResponse);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isPinExpired;
        }
        throw null;
    }

    public final CustomExtResponse component10() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CustomExtResponse customExtResponse = this.extResponse;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return customExtResponse;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.forward;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.supportPinLogin;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.supportFingerprintLogin;
        int i4 = i2 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final Boolean component5() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.supportFaceLogin;
            int i4 = 43 / 0;
        } else {
            bool = this.supportFaceLogin;
        }
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final Boolean component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isActive;
        int i5 = i3 + 17;
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
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loginType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component9() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.oneStepRegisterTag;
        int i5 = i3 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final CustomQueryLoginType copy(String isPinExpired, String forward, String supportPinLogin, Boolean supportFingerprintLogin, Boolean supportFaceLogin, Boolean isActive, String loginType, String asyncRegisterDesc, Boolean oneStepRegisterTag, CustomExtResponse extResponse) {
        int i = 2 % 2;
        CustomQueryLoginType customQueryLoginType = new CustomQueryLoginType(isPinExpired, forward, supportPinLogin, supportFingerprintLogin, supportFaceLogin, isActive, loginType, asyncRegisterDesc, oneStepRegisterTag, extResponse);
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
        return customQueryLoginType;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomQueryLoginType)) {
            int i2 = component2 + 3;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        CustomQueryLoginType customQueryLoginType = (CustomQueryLoginType) other;
        if (!Intrinsics.areEqual(this.isPinExpired, customQueryLoginType.isPinExpired)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.forward, customQueryLoginType.forward)) {
            int i3 = component2 + 123;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.supportPinLogin, customQueryLoginType.supportPinLogin)) {
            int i5 = ShareDataUIState + 97;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.supportFingerprintLogin, customQueryLoginType.supportFingerprintLogin) || !Intrinsics.areEqual(this.supportFaceLogin, customQueryLoginType.supportFaceLogin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.isActive, customQueryLoginType.isActive)) {
            int i7 = component2 + 83;
            ShareDataUIState = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.loginType, customQueryLoginType.loginType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asyncRegisterDesc, customQueryLoginType.asyncRegisterDesc)) {
            int i8 = ShareDataUIState + 45;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.oneStepRegisterTag, customQueryLoginType.oneStepRegisterTag)) {
            int i10 = ShareDataUIState + 31;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.extResponse, customQueryLoginType.extResponse)) {
            return true;
        }
        int i12 = ShareDataUIState + 15;
        component2 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.isPinExpired;
        if (str == null) {
            int i5 = i3 + 125;
            component2 = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.forward;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i6 = ShareDataUIState + 77;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str3 = this.supportPinLogin;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.supportFingerprintLogin;
        if (bool == null) {
            int i8 = ShareDataUIState + 57;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = bool.hashCode();
        }
        Boolean bool2 = this.supportFaceLogin;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isActive;
        int iHashCode7 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.loginType;
        if (str4 == null) {
            int i10 = ShareDataUIState + 93;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.asyncRegisterDesc;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        Boolean bool4 = this.oneStepRegisterTag;
        int iHashCode9 = bool4 == null ? 0 : bool4.hashCode();
        CustomExtResponse customExtResponse = this.extResponse;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (customExtResponse != null ? customExtResponse.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomQueryLoginType(isPinExpired=" + this.isPinExpired + ", forward=" + this.forward + ", supportPinLogin=" + this.supportPinLogin + ", supportFingerprintLogin=" + this.supportFingerprintLogin + ", supportFaceLogin=" + this.supportFaceLogin + ", isActive=" + this.isActive + ", loginType=" + this.loginType + ", asyncRegisterDesc=" + this.asyncRegisterDesc + ", oneStepRegisterTag=" + this.oneStepRegisterTag + ", extResponse=" + this.extResponse + ")";
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
