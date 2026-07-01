package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u009e\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0002\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalQueryLoginType;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_IS_SUPPORT_PIN_LOGIN, "", "supportOtpLogin", KeysConstants.KEY_EXECUTE, "", KeysConstants.KEY_IS_SUPPORT_FINGERPRINT_LOGIN, KeysConstants.KEY_IS_SUPPORT_FACE_LOGIN, "isActive", "asyncRegisterDesc", KeysConstants.KEY_ONE_STEP_REGISTER_TAG, KeysConstants.KEY_LOGIN_TYPE, KeysConstants.KEY_NEW_PROCESS, "otpTpe", KeysConstants.KEY_SUPPORT_FORGET_PIN, "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setSupportPin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSupportOtpLogin", "setSupportOtpLogin", "getExecute", "()Ljava/lang/String;", "setExecute", "(Ljava/lang/String;)V", "getSupportFingerprintLogin", "setSupportFingerprintLogin", "getSupportFaceLogin", "setSupportFaceLogin", "setActive", "getAsyncRegisterDesc", "setAsyncRegisterDesc", "getOneStepRegisterTag", "setOneStepRegisterTag", "getLoginType", "setLoginType", "getNewProcess", "setNewProcess", "getOtpTpe", "setOtpTpe", "getSupportForgetPin", "setSupportForgetPin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalQueryLoginType;", "equals", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalQueryLoginType extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
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
        String str6;
        if ((i & 1) != 0) {
            int i2 = component1 + 55;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            bool9 = bool;
        } else {
            bool9 = bool;
        }
        Boolean bool11 = (i & 2) != 0 ? false : bool2;
        String str7 = null;
        if ((i & 4) != 0) {
            int i5 = component1 + 31;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str5 = null;
        } else {
            str5 = str;
        }
        Boolean bool12 = (i & 8) != 0 ? false : bool3;
        Boolean bool13 = (i & 16) != 0 ? false : bool4;
        if ((i & 32) != 0) {
            int i8 = component1 + 103;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            bool10 = bool;
        } else {
            bool10 = bool5;
        }
        if ((i & 64) != 0) {
            int i11 = component1 + 71;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        Boolean bool14 = (i & 128) != 0 ? false : bool6;
        String str8 = (i & 256) != 0 ? null : str3;
        Boolean bool15 = (i & 512) != 0 ? false : bool7;
        if ((i & 1024) != 0) {
            int i14 = component1 + 109;
            component3 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
        } else {
            str7 = str4;
        }
        this(bool9, bool11, str5, bool12, bool13, bool10, str6, bool14, str8, bool15, str7, (i & 2048) == 0 ? bool8 : true);
    }

    public final Boolean isSupportPin() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.isSupportPin;
        int i4 = i2 + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public final void setSupportPin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.isSupportPin = bool;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Boolean getSupportOtpLogin() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.supportOtpLogin;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return bool;
    }

    public final void setSupportOtpLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.supportOtpLogin = bool;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.execute = str;
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
        int i6 = i2 + 75;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final Boolean getSupportFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.supportFingerprintLogin;
        int i5 = i3 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setSupportFingerprintLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.supportFingerprintLogin = bool;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
    }

    public final Boolean getSupportFaceLogin() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportFaceLogin;
        }
        throw null;
    }

    public final void setSupportFaceLogin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.supportFaceLogin = bool;
        int i5 = i2 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
    }

    public final Boolean isActive() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isActive;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final void setActive(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.isActive = bool;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.asyncRegisterDesc;
        int i4 = i2 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setAsyncRegisterDesc(String str) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.asyncRegisterDesc = str;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Boolean getOneStepRegisterTag() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.oneStepRegisterTag;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setOneStepRegisterTag(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.oneStepRegisterTag = bool;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getLoginType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.loginType;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLoginType(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.loginType = str;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        int i6 = i2 + 113;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Boolean getNewProcess() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.newProcess;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final void setNewProcess(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.newProcess = bool;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
    }

    public final String getOtpTpe() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otpTpe;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setOtpTpe(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.otpTpe = str;
        int i5 = i2 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Boolean getSupportForgetPin() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.supportForgetPin;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setSupportForgetPin(Boolean bool) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.supportForgetPin = bool;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
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
        String str5;
        int i2 = 2 % 2;
        Boolean bool13 = (i & 1) != 0 ? localQueryLoginType.isSupportPin : bool;
        if ((i & 2) != 0) {
            int i3 = component3 + 113;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                bool9 = localQueryLoginType.supportOtpLogin;
                int i4 = 11 / 0;
            } else {
                bool9 = localQueryLoginType.supportOtpLogin;
            }
        } else {
            bool9 = bool2;
        }
        String str6 = (i & 4) != 0 ? localQueryLoginType.execute : str;
        Boolean bool14 = (i & 8) != 0 ? localQueryLoginType.supportFingerprintLogin : bool3;
        Boolean bool15 = (i & 16) != 0 ? localQueryLoginType.supportFaceLogin : bool4;
        if ((i & 32) != 0) {
            int i5 = component1 + 49;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            bool10 = localQueryLoginType.isActive;
        } else {
            bool10 = bool5;
        }
        String str7 = (i & 64) != 0 ? localQueryLoginType.asyncRegisterDesc : str2;
        if ((i & 128) != 0) {
            int i7 = component3 + 49;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            bool11 = localQueryLoginType.oneStepRegisterTag;
        } else {
            bool11 = bool6;
        }
        String str8 = (i & 256) != 0 ? localQueryLoginType.loginType : str3;
        if ((i & 512) != 0) {
            int i9 = component3 + 65;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                bool12 = localQueryLoginType.newProcess;
                int i10 = 37 / 0;
            } else {
                bool12 = localQueryLoginType.newProcess;
            }
        } else {
            bool12 = bool7;
        }
        if ((i & 1024) != 0) {
            int i11 = component1 + 35;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str5 = localQueryLoginType.otpTpe;
        } else {
            str5 = str4;
        }
        return localQueryLoginType.copy(bool13, bool9, str6, bool14, bool15, bool10, str7, bool11, str8, bool12, str5, (i & 2048) != 0 ? localQueryLoginType.supportForgetPin : bool8);
    }

    public final Boolean component1() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isSupportPin;
        int i5 = i3 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final Boolean component10() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.newProcess;
        int i5 = i3 + 99;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.otpTpe;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component12() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.supportForgetPin;
        int i4 = i3 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.supportOtpLogin;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final Boolean component4() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.supportFingerprintLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component5() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportFaceLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.isActive;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.asyncRegisterDesc;
        int i4 = i2 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Boolean component8() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            bool = this.oneStepRegisterTag;
            int i4 = 36 / 0;
        } else {
            bool = this.oneStepRegisterTag;
        }
        int i5 = i3 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loginType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalQueryLoginType copy(Boolean isSupportPin, Boolean supportOtpLogin, String execute, Boolean supportFingerprintLogin, Boolean supportFaceLogin, Boolean isActive, String asyncRegisterDesc, Boolean oneStepRegisterTag, String loginType, Boolean newProcess, String otpTpe, Boolean supportForgetPin) {
        int i = 2 % 2;
        LocalQueryLoginType localQueryLoginType = new LocalQueryLoginType(isSupportPin, supportOtpLogin, execute, supportFingerprintLogin, supportFaceLogin, isActive, asyncRegisterDesc, oneStepRegisterTag, loginType, newProcess, otpTpe, supportForgetPin);
        int i2 = component3 + 49;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return localQueryLoginType;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalQueryLoginType)) {
            return false;
        }
        LocalQueryLoginType localQueryLoginType = (LocalQueryLoginType) other;
        if (!Intrinsics.areEqual(this.isSupportPin, localQueryLoginType.isSupportPin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.supportOtpLogin, localQueryLoginType.supportOtpLogin)) {
            int i2 = component3 + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.execute, localQueryLoginType.execute) || !Intrinsics.areEqual(this.supportFingerprintLogin, localQueryLoginType.supportFingerprintLogin) || !Intrinsics.areEqual(this.supportFaceLogin, localQueryLoginType.supportFaceLogin) || !Intrinsics.areEqual(this.isActive, localQueryLoginType.isActive) || !Intrinsics.areEqual(this.asyncRegisterDesc, localQueryLoginType.asyncRegisterDesc) || !Intrinsics.areEqual(this.oneStepRegisterTag, localQueryLoginType.oneStepRegisterTag)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.loginType, localQueryLoginType.loginType)) {
            int i4 = component3 + 7;
            component1 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.newProcess, localQueryLoginType.newProcess)) {
            int i5 = component1 + 93;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.otpTpe, localQueryLoginType.otpTpe)) {
            return false;
        }
        if (Intrinsics.areEqual(this.supportForgetPin, localQueryLoginType.supportForgetPin)) {
            int i6 = component1 + 47;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = component3 + 45;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        Boolean bool = this.isSupportPin;
        if (bool == null) {
            int i2 = component1 + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Boolean bool2 = this.supportOtpLogin;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.execute;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        Boolean bool3 = this.supportFingerprintLogin;
        if (bool3 == null) {
            int i4 = component1 + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool3.hashCode();
        }
        Boolean bool4 = this.supportFaceLogin;
        if (bool4 == null) {
            int i6 = component1 + 41;
            component3 = i6 % 128;
            iHashCode3 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = bool4.hashCode();
        }
        Boolean bool5 = this.isActive;
        if (bool5 == null) {
            int i7 = component3 + 41;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = bool5.hashCode();
        }
        String str2 = this.asyncRegisterDesc;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool6 = this.oneStepRegisterTag;
        if (bool6 == null) {
            int i9 = component1 + 37;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = bool6.hashCode();
        }
        String str3 = this.loginType;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        Boolean bool7 = this.newProcess;
        if (bool7 == null) {
            int i11 = component1 + 123;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = bool7.hashCode();
        }
        String str4 = this.otpTpe;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        Boolean bool8 = this.supportForgetPin;
        int iHashCode12 = (((((((((((((((((((((iHashCode * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode5) * 31) + iHashCode10) * 31) + iHashCode6) * 31) + iHashCode11) * 31) + (bool8 != null ? bool8.hashCode() : 0);
        int i13 = component1 + 31;
        component3 = i13 % 128;
        if (i13 % 2 != 0) {
            return iHashCode12;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalQueryLoginType(isSupportPin=" + this.isSupportPin + ", supportOtpLogin=" + this.supportOtpLogin + ", execute=" + this.execute + ", supportFingerprintLogin=" + this.supportFingerprintLogin + ", supportFaceLogin=" + this.supportFaceLogin + ", isActive=" + this.isActive + ", asyncRegisterDesc=" + this.asyncRegisterDesc + ", oneStepRegisterTag=" + this.oneStepRegisterTag + ", loginType=" + this.loginType + ", newProcess=" + this.newProcess + ", otpTpe=" + this.otpTpe + ", supportForgetPin=" + this.supportForgetPin + ")";
        int i2 = component3 + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
