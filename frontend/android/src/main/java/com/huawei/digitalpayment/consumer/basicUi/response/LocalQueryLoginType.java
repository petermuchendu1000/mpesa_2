package com.huawei.digitalpayment.consumer.basicUi.response;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u009e\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0002\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/response/LocalQueryLoginType;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_IS_SUPPORT_PIN_LOGIN, "", "supportOtpLogin", KeysConstants.KEY_EXECUTE, "", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, "isActive", "asyncRegisterDesc", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, KeysConstants.KEY_LOGIN_TYPE, KeysConstants.KEY_NEW_PROCESS, "otpTpe", KeysConstants.KEY_SUPPORT_FORGET_PIN, "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setSupportPin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSupportOtpLogin", "setSupportOtpLogin", "getExecute", "()Ljava/lang/String;", "setExecute", "(Ljava/lang/String;)V", "getSupportFingerprintLogin", "setSupportFingerprintLogin", "getSupportFaceLogin", "setSupportFaceLogin", "setActive", "getAsyncRegisterDesc", "setAsyncRegisterDesc", "getOneStepRegisterTag", "setOneStepRegisterTag", "getLoginType", "setLoginType", "getNewProcess", "setNewProcess", "getOtpTpe", "setOtpTpe", "getSupportForgetPin", "setSupportForgetPin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/basicUi/response/LocalQueryLoginType;", "equals", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalQueryLoginType extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private String asyncRegisterDesc;
    private String execute;
    private Boolean isActive;
    private Boolean isSupportPin;
    private String loginType;
    private Boolean newProcess;
    private Boolean oneStepRegisterTag;
    private String otpTpe;
    private Boolean supportFaceLogin;
    private Boolean supportFingerprintLogin;
    private Boolean supportForgetPin;
    private Boolean supportOtpLogin;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalQueryLoginType(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Boolean bool6, String str3, Boolean bool7, String str4, Boolean bool8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool9;
        String str5;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        String str6;
        Boolean bool14;
        if ((i & 1) != 0) {
            int i2 = copydefault + 91;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 4;
            } else {
                int i4 = 2 % 2;
            }
            bool9 = bool;
        } else {
            bool9 = bool;
        }
        Boolean bool15 = (i & 2) != 0 ? false : bool2;
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 111;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 117;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            bool10 = false;
        } else {
            bool10 = bool3;
        }
        if ((i & 16) != 0) {
            bool11 = false;
            int i9 = ShareDataUIState + 5;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            bool11 = bool4;
        }
        if ((i & 32) != 0) {
            int i12 = copydefault + 41;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 98 / 0;
            }
            bool12 = bool;
        } else {
            bool12 = bool5;
        }
        String str7 = (i & 64) != 0 ? null : str2;
        if ((i & 128) != 0) {
            int i14 = copydefault + 59;
            ShareDataUIState = i14 % 128;
            bool13 = i14 % 2 == 0;
        } else {
            bool13 = bool6;
        }
        if ((i & 256) != 0) {
            int i15 = copydefault + 67;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 512) != 0) {
            bool14 = false;
            int i17 = 2 % 2;
        } else {
            bool14 = bool7;
        }
        this(bool9, bool15, str5, bool10, bool11, bool12, str7, bool13, str6, bool14, (i & 1024) == 0 ? str4 : null, (i & 2048) == 0 ? bool8 : true);
    }

    public final Boolean isSupportPin() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.isSupportPin;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return bool;
    }

    public final void setSupportPin(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.isSupportPin = bool;
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Boolean getSupportOtpLogin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportOtpLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportOtpLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.supportOtpLogin = bool;
        int i5 = i3 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.execute = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Boolean getSupportFingerprintLogin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.supportFingerprintLogin;
        int i4 = i2 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public final void setSupportFingerprintLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.supportFingerprintLogin = bool;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }

    public final Boolean getSupportFaceLogin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportFaceLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportFaceLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.supportFaceLogin = bool;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
    }

    public final Boolean isActive() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.isActive;
            int i4 = 12 / 0;
        } else {
            bool = this.isActive;
        }
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setActive(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.isActive = bool;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.asyncRegisterDesc;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public final void setAsyncRegisterDesc(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.asyncRegisterDesc = str;
        int i5 = i3 + 73;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
    }

    public final Boolean getOneStepRegisterTag() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.oneStepRegisterTag;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return bool;
    }

    public final void setOneStepRegisterTag(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.oneStepRegisterTag = bool;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getLoginType() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loginType;
        }
        throw null;
    }

    public final void setLoginType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.loginType = str;
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }

    public final Boolean getNewProcess() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.newProcess;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNewProcess(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.newProcess = bool;
        int i5 = i3 + 107;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getOtpTpe() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otpTpe;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final void setOtpTpe(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.otpTpe = str;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Boolean getSupportForgetPin() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.supportForgetPin;
        int i4 = i2 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final void setSupportForgetPin(Boolean bool) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.supportForgetPin = bool;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalQueryLoginType(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Boolean bool6, String str3, Boolean bool7, String str4, Boolean bool8) {
        this.isSupportPin = bool;
        this.supportOtpLogin = bool2;
        this.execute = str;
        this.supportFingerprintLogin = bool3;
        this.supportFaceLogin = bool4;
        this.isActive = bool5;
        this.asyncRegisterDesc = str2;
        this.oneStepRegisterTag = bool6;
        this.loginType = str3;
        this.newProcess = bool7;
        this.otpTpe = str4;
        this.supportForgetPin = bool8;
    }

    public LocalQueryLoginType() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static LocalQueryLoginType copy$default(LocalQueryLoginType localQueryLoginType, Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Boolean bool6, String str3, Boolean bool7, String str4, Boolean bool8, int i, Object obj) {
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 29;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Boolean bool14 = localQueryLoginType.isSupportPin;
                throw null;
            }
            bool9 = localQueryLoginType.isSupportPin;
        } else {
            bool9 = bool;
        }
        Boolean bool15 = (i & 2) != 0 ? localQueryLoginType.supportOtpLogin : bool2;
        String str5 = (i & 4) != 0 ? localQueryLoginType.execute : str;
        if ((i & 8) != 0) {
            int i4 = ShareDataUIState + 105;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            bool10 = localQueryLoginType.supportFingerprintLogin;
        } else {
            bool10 = bool3;
        }
        if ((i & 16) != 0) {
            int i6 = ShareDataUIState + 71;
            int i7 = i6 % 128;
            copydefault = i7;
            if (i6 % 2 != 0) {
                Boolean bool16 = localQueryLoginType.supportFaceLogin;
                throw null;
            }
            bool11 = localQueryLoginType.supportFaceLogin;
            int i8 = i7 + 125;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            bool11 = bool4;
        }
        if ((i & 32) != 0) {
            bool12 = localQueryLoginType.isActive;
            int i10 = ShareDataUIState + 91;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            bool12 = bool5;
        }
        String str6 = (i & 64) != 0 ? localQueryLoginType.asyncRegisterDesc : str2;
        Boolean bool17 = (i & 128) != 0 ? localQueryLoginType.oneStepRegisterTag : bool6;
        String str7 = (i & 256) != 0 ? localQueryLoginType.loginType : str3;
        Boolean bool18 = (i & 512) != 0 ? localQueryLoginType.newProcess : bool7;
        String str8 = (i & 1024) != 0 ? localQueryLoginType.otpTpe : str4;
        if ((i & 2048) != 0) {
            int i12 = ShareDataUIState + 45;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            bool13 = localQueryLoginType.supportForgetPin;
        } else {
            bool13 = bool8;
        }
        return localQueryLoginType.copy(bool9, bool15, str5, bool10, bool11, bool12, str6, bool17, str7, bool18, str8, bool13);
    }

    public final Boolean component1() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSupportPin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.newProcess;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otpTpe;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportForgetPin;
        }
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.supportOtpLogin;
        int i5 = i3 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportFingerprintLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.supportFaceLogin;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component6() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isActive;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return bool;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asyncRegisterDesc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.oneStepRegisterTag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.loginType;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final LocalQueryLoginType copy(Boolean isSupportPin, Boolean supportOtpLogin, String execute, Boolean supportFingerprintLogin, Boolean supportFaceLogin, Boolean isActive, String asyncRegisterDesc, Boolean oneStepRegisterTag, String loginType, Boolean newProcess, String otpTpe, Boolean supportForgetPin) {
        int i = 2 % 2;
        LocalQueryLoginType localQueryLoginType = new LocalQueryLoginType(isSupportPin, supportOtpLogin, execute, supportFingerprintLogin, supportFaceLogin, isActive, asyncRegisterDesc, oneStepRegisterTag, loginType, newProcess, otpTpe, supportForgetPin);
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return localQueryLoginType;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalQueryLoginType)) {
            int i2 = copydefault + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LocalQueryLoginType localQueryLoginType = (LocalQueryLoginType) other;
        if (!Intrinsics.areEqual(this.isSupportPin, localQueryLoginType.isSupportPin)) {
            int i4 = ShareDataUIState + 97;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.supportOtpLogin, localQueryLoginType.supportOtpLogin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.execute, localQueryLoginType.execute)) {
            int i6 = ShareDataUIState + 121;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.supportFingerprintLogin, localQueryLoginType.supportFingerprintLogin) || !Intrinsics.areEqual(this.supportFaceLogin, localQueryLoginType.supportFaceLogin) || !Intrinsics.areEqual(this.isActive, localQueryLoginType.isActive)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asyncRegisterDesc, localQueryLoginType.asyncRegisterDesc)) {
            int i8 = ShareDataUIState + 113;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.oneStepRegisterTag, localQueryLoginType.oneStepRegisterTag)) {
            int i10 = ShareDataUIState + 65;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.loginType, localQueryLoginType.loginType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.newProcess, localQueryLoginType.newProcess)) {
            int i12 = ShareDataUIState + 55;
            copydefault = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.otpTpe, localQueryLoginType.otpTpe)) {
            return false;
        }
        if (Intrinsics.areEqual(this.supportForgetPin, localQueryLoginType.supportForgetPin)) {
            return true;
        }
        int i13 = ShareDataUIState + 11;
        copydefault = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Boolean bool = this.isSupportPin;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.supportOtpLogin;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.execute;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Boolean bool3 = this.supportFingerprintLogin;
        int iHashCode6 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.supportFaceLogin;
        int iHashCode7 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.isActive;
        int iHashCode8 = bool5 == null ? 0 : bool5.hashCode();
        String str2 = this.asyncRegisterDesc;
        if (str2 == null) {
            int i2 = copydefault + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Boolean bool6 = this.oneStepRegisterTag;
        int iHashCode9 = bool6 == null ? 0 : bool6.hashCode();
        String str3 = this.loginType;
        if (str3 == null) {
            int i4 = copydefault + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        Boolean bool7 = this.newProcess;
        int iHashCode10 = bool7 == null ? 0 : bool7.hashCode();
        String str4 = this.otpTpe;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        Boolean bool8 = this.supportForgetPin;
        return (((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (bool8 != null ? bool8.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalQueryLoginType(isSupportPin=" + this.isSupportPin + ", supportOtpLogin=" + this.supportOtpLogin + ", execute=" + this.execute + ", supportFingerprintLogin=" + this.supportFingerprintLogin + ", supportFaceLogin=" + this.supportFaceLogin + ", isActive=" + this.isActive + ", asyncRegisterDesc=" + this.asyncRegisterDesc + ", oneStepRegisterTag=" + this.oneStepRegisterTag + ", loginType=" + this.loginType + ", newProcess=" + this.newProcess + ", otpTpe=" + this.otpTpe + ", supportForgetPin=" + this.supportForgetPin + ")";
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return str;
    }
}
