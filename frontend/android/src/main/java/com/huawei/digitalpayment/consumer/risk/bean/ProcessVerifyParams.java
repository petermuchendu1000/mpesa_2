package com.huawei.digitalpayment.consumer.risk.bean;

import androidx.core.view.PointerIconCompat;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.http.BaseRequestParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0011B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0012B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0011¨\u00064"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "Lcom/huawei/http/BaseRequestParams;", KeysConstants.KEY_LOGIN_TYPE, "", "otp", KeysConstants.KEY_OTP_TYPE, CheckIdentityActivity.ID_TYPE, "idNo", "initiatorPin", "pinVersion", "initiatorMsisdn", "referenceData", "", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoginType", "()Ljava/lang/String;", "getOtp", "getOtpType", "getIdType", "setIdType", "getIdNo", "setIdNo", "getInitiatorPin", "getPinVersion", "getInitiatorMsisdn", "getReferenceData", "()Ljava/util/Map;", "getToken", "setToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessVerifyParams extends BaseRequestParams {
    private static int component1 = 0;
    private static int copydefault = 1;
    private String idNo;
    private String idType;
    private final String initiatorMsisdn;
    private final String initiatorPin;
    private final String loginType;
    private final String otp;
    private final String otpType;
    private final String pinVersion;
    private final Map<String, Object> referenceData;
    private String token;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProcessVerifyParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        String str13;
        Map map2 = null;
        if ((i & 2) != 0) {
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                map2.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str10 = null;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = copydefault + 103;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str11 = null;
        } else {
            str11 = str3;
        }
        String str14 = (i & 8) != 0 ? null : str4;
        String str15 = (i & 16) != 0 ? null : str5;
        if ((i & 32) != 0) {
            int i6 = copydefault + 105;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str12 = null;
        } else {
            str12 = str6;
        }
        String str16 = (i & 64) != 0 ? null : str7;
        String string = (i & 128) != 0 ? SPUtils.getInstance().getString("recent_login_phone_number") : str8;
        if ((i & 256) != 0) {
            int i8 = 2 % 2;
        } else {
            map2 = map;
        }
        if ((i & 512) != 0) {
            int i9 = 2 % 2;
            str13 = "";
        } else {
            str13 = str9;
        }
        this(str, str10, str11, str14, str15, str12, str16, string, map2, str13);
    }

    public final String getLoginType() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.loginType;
        int i4 = i3 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getOtp() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.otp;
        int i4 = i3 + 87;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getOtpType() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otpType;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final String getIdType() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.idType;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIdType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.idType = str;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIdNo() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.idNo;
            int i4 = 4 / 0;
        } else {
            str = this.idNo;
        }
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final void setIdNo(String str) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.idNo = str;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.initiatorPin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPinVersion() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.pinVersion;
            int i4 = 84 / 0;
        } else {
            str = this.pinVersion;
        }
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return str;
    }

    public final Map<String, Object> getReferenceData() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.referenceData;
        int i5 = i3 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final void setToken(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
        int i4 = component1 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    public ProcessVerifyParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, ? extends Object> map, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.loginType = str;
        this.otp = str2;
        this.otpType = str3;
        this.idType = str4;
        this.idNo = str5;
        this.initiatorPin = str6;
        this.pinVersion = str7;
        this.initiatorMsisdn = str8;
        this.referenceData = map;
        this.token = str9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessVerifyParams(String str) {
        this(str, null, null, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessVerifyParams(String str, String str2, String str3, String str4) {
        this(str, str2, str3, null, null, null, null, str4, null, null, 768, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessVerifyParams(String str, String str2, String str3) {
        this(str, null, null, null, null, str2, str3, null, null, null, 896, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ProcessVerifyParams copy$default(ProcessVerifyParams processVerifyParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, String str9, int i, Object obj) {
        String str10;
        String str11;
        Map map2;
        int i2 = 2 % 2;
        String str12 = (i & 1) != 0 ? processVerifyParams.loginType : str;
        String str13 = (i & 2) != 0 ? processVerifyParams.otp : str2;
        String str14 = (i & 4) != 0 ? processVerifyParams.otpType : str3;
        if ((i & 8) != 0) {
            int i3 = component1 + 115;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                String str15 = processVerifyParams.idType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str10 = processVerifyParams.idType;
        } else {
            str10 = str4;
        }
        if ((i & 16) != 0) {
            int i4 = component1 + 49;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                str11 = processVerifyParams.idNo;
                int i5 = 69 / 0;
            } else {
                str11 = processVerifyParams.idNo;
            }
        } else {
            str11 = str5;
        }
        String str16 = (i & 32) != 0 ? processVerifyParams.initiatorPin : str6;
        String str17 = (i & 64) != 0 ? processVerifyParams.pinVersion : str7;
        String str18 = (i & 128) != 0 ? processVerifyParams.initiatorMsisdn : str8;
        if ((i & 256) != 0) {
            int i6 = copydefault + 95;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            map2 = processVerifyParams.referenceData;
            if (i7 != 0) {
                int i8 = 73 / 0;
            }
        } else {
            map2 = map;
        }
        return processVerifyParams.copy(str12, str13, str14, str10, str11, str16, str17, str18, map2, (i & 512) != 0 ? processVerifyParams.token : str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.loginType;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.otp;
        int i4 = i3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.otpType;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idType;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.idNo;
        int i4 = i2 + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.initiatorPin;
        int i4 = i2 + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinVersion;
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Map<String, Object> component9() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.referenceData;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProcessVerifyParams copy(String loginType, String otp, String otpType, String idType, String idNo, String initiatorPin, String pinVersion, String initiatorMsisdn, Map<String, ? extends Object> referenceData, String token) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(loginType, "");
        Intrinsics.checkNotNullParameter(token, "");
        ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(loginType, otp, otpType, idType, idNo, initiatorPin, pinVersion, initiatorMsisdn, referenceData, token);
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return processVerifyParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessVerifyParams)) {
            return false;
        }
        ProcessVerifyParams processVerifyParams = (ProcessVerifyParams) other;
        if (!Intrinsics.areEqual(this.loginType, processVerifyParams.loginType)) {
            int i4 = component1 + 7;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.otp, processVerifyParams.otp)) {
            int i6 = component1 + 59;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.otpType, processVerifyParams.otpType) || !Intrinsics.areEqual(this.idType, processVerifyParams.idType) || !Intrinsics.areEqual(this.idNo, processVerifyParams.idNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.initiatorPin, processVerifyParams.initiatorPin)) {
            int i8 = copydefault + 19;
            component1 = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.pinVersion, processVerifyParams.pinVersion) || !Intrinsics.areEqual(this.initiatorMsisdn, processVerifyParams.initiatorMsisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.referenceData, processVerifyParams.referenceData)) {
            return Intrinsics.areEqual(this.token, processVerifyParams.token);
        }
        int i9 = copydefault + 35;
        component1 = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.loginType.hashCode();
        String str = this.otp;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.otpType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.idType;
        if (str3 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            int i4 = component1 + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        String str4 = this.idNo;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.initiatorPin;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pinVersion;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.initiatorMsisdn;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        Map<String, Object> map = this.referenceData;
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.token.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProcessVerifyParams(loginType=" + this.loginType + ", otp=" + this.otp + ", otpType=" + this.otpType + ", idType=" + this.idType + ", idNo=" + this.idNo + ", initiatorPin=" + this.initiatorPin + ", pinVersion=" + this.pinVersion + ", initiatorMsisdn=" + this.initiatorMsisdn + ", referenceData=" + this.referenceData + ", token=" + this.token + ")";
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
