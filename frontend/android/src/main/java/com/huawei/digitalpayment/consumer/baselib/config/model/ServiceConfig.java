package com.huawei.digitalpayment.consumer.baselib.config.model;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¸\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\t\u0010B\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b)\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006C"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/ServiceConfig;", "", "pinLimit", "", "otpLimit", "phoneNumberRegular", "", "phoneNumberMaxLength", "phoneNumberCode", "enableBiometricPayTimes", "unit", "currency", "ivrNumber", KeysConstants.SHORT_CODE, "operatorName", "amountLen", "amountPoint", "minPINLen", "maxPINLen", "mmVersion", "<init>", "(IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getPinLimit", "()I", "getOtpLimit", "getPhoneNumberRegular", "()Ljava/lang/String;", "getPhoneNumberMaxLength", "getPhoneNumberCode", "getEnableBiometricPayTimes", "getUnit", "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "getIvrNumber", "getShortCode", "getOperatorName", "getAmountLen", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmountPoint", "getMinPINLen", "getMaxPINLen", "getMmVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/baselib/config/model/ServiceConfig;", "equals", "", "other", "hashCode", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ServiceConfig {
    private static int CoroutineDebuggingKt = 0;
    private static int coroutineBoundary = 1;
    private final int ArtificialStackFrames;
    private final String ShareDataUIState;
    private final String accessartificialFrame;
    private final Integer component1;
    private final Integer component2;
    private String component3;
    private final int component4;
    private final String copy;
    private final int copydefault;
    private final String equals;
    private final Integer getAsAtTimestamp;
    private final Integer getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final String getSponsorBeneficiariesState;
    private final int hashCode;
    private final String toString;

    public ServiceConfig(int i, int i2, String str, int i3, String str2, int i4, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.ArtificialStackFrames = i;
        this.component4 = i2;
        this.toString = str;
        this.hashCode = i3;
        this.getSponsorBeneficiariesState = str2;
        this.copydefault = i4;
        this.accessartificialFrame = str3;
        this.component3 = str4;
        this.ShareDataUIState = str5;
        this.getShareableDataState = str6;
        this.equals = str7;
        this.component1 = num;
        this.component2 = num2;
        this.getAsAtTimestamp = num3;
        this.getRequestBeneficiariesState = num4;
        this.copy = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ServiceConfig(int i, int i2, String str, int i3, String str2, int i4, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, String str8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        int i6;
        String str10;
        String str11;
        String str12;
        Integer num5;
        int i7 = (i5 & 1) != 0 ? 6 : i;
        int i8 = (i5 & 2) == 0 ? i2 : 6;
        if ((i5 & 4) != 0) {
            int i9 = coroutineBoundary + 79;
            CoroutineDebuggingKt = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str9 = "^([0-9]{11})$";
        } else {
            str9 = str;
        }
        if ((i5 & 8) != 0) {
            int i12 = coroutineBoundary + 89;
            CoroutineDebuggingKt = i12 % 128;
            i6 = i12 % 2 != 0 ? 120 : 11;
            int i13 = 2 % 2;
        } else {
            i6 = i3;
        }
        String str13 = (i5 & 16) != 0 ? "86" : str2;
        int i14 = (i5 & 32) != 0 ? 10 : i4;
        if ((i5 & 64) != 0) {
            int i15 = CoroutineDebuggingKt + 3;
            coroutineBoundary = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            str10 = "$";
        } else {
            str10 = str3;
        }
        String str14 = (i5 & 128) != 0 ? "USD" : str4;
        if ((i5 & 256) != 0) {
            int i18 = coroutineBoundary + 77;
            CoroutineDebuggingKt = i18 % 128;
            int i19 = i18 % 2;
            str11 = "";
        } else {
            str11 = str5;
        }
        String str15 = (i5 & 512) != 0 ? ServiceConfigKt.SHORT_CODE_REGULAR : str6;
        Object obj = null;
        if ((i5 & 1024) != 0) {
            int i20 = CoroutineDebuggingKt + 91;
            coroutineBoundary = i20 % 128;
            if (i20 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i21 = 2 % 2;
            str12 = ServiceConfigKt.OPERATOR_NAME_REGULAR;
        } else {
            str12 = str7;
        }
        if ((i5 & 2048) != 0) {
            int i22 = coroutineBoundary;
            int i23 = i22 + 57;
            CoroutineDebuggingKt = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 96 / 0;
            }
            int i25 = i22 + 3;
            CoroutineDebuggingKt = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 2 % 2;
            }
            num5 = null;
        } else {
            num5 = num;
        }
        this(i7, i8, str9, i6, str13, i14, str10, str14, str11, str15, str12, num5, (i5 & 4096) != 0 ? null : num2, (i5 & 8192) != 0 ? null : num3, (i5 & 16384) != 0 ? null : num4, (i5 & 32768) != 0 ? null : str8);
    }

    public final int getPinLimit() {
        int i;
        int i2 = 2 % 2;
        int i3 = coroutineBoundary;
        int i4 = i3 + 95;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.ArtificialStackFrames;
            int i5 = 65 / 0;
        } else {
            i = this.ArtificialStackFrames;
        }
        int i6 = i3 + 11;
        CoroutineDebuggingKt = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getOtpLimit() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 45;
        CoroutineDebuggingKt = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.component4;
        int i5 = i2 + 37;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String getPhoneNumberRegular() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 81;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        String str = this.toString;
        int i5 = i3 + 37;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getPhoneNumberMaxLength() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 105;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.hashCode;
        int i6 = i2 + 85;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getPhoneNumberCode() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 69;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getSponsorBeneficiariesState;
        }
        throw null;
    }

    public final int getEnableBiometricPayTimes() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 111;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 3;
        coroutineBoundary = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
        return i5;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 59;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.accessartificialFrame;
        int i5 = i3 + 31;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 125;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 95;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 121;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
            throw null;
        }
    }

    public final String getIvrNumber() {
        String str;
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 27;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 48 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 25;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 109;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.getShareableDataState;
        int i4 = i3 + 13;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOperatorName() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 41;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 109;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getAmountLen() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 33;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.component1;
        int i4 = i3 + 59;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer getAmountPoint() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 53;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        Integer num = this.component2;
        int i5 = i3 + 1;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMinPINLen() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 61;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        Integer num = this.getAsAtTimestamp;
        int i5 = i3 + 107;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return num;
    }

    public final Integer getMaxPINLen() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt;
        int i3 = i2 + 45;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.getRequestBeneficiariesState;
        int i5 = i2 + 103;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getMmVersion() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 7;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 11;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ServiceConfig() {
        this(0, 0, null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static ServiceConfig copy$default(ServiceConfig serviceConfig, int i, int i2, String str, int i3, String str2, int i4, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, String str8, int i5, Object obj) {
        int i6;
        String str9;
        int i7;
        String str10;
        String str11;
        Integer num5;
        String str12;
        int i8 = 2 % 2;
        int i9 = (i5 & 1) != 0 ? serviceConfig.ArtificialStackFrames : i;
        if ((i5 & 2) != 0) {
            int i10 = CoroutineDebuggingKt + 27;
            coroutineBoundary = i10 % 128;
            int i11 = i10 % 2;
            i6 = serviceConfig.component4;
        } else {
            i6 = i2;
        }
        String str13 = (i5 & 4) != 0 ? serviceConfig.toString : str;
        int i12 = (i5 & 8) != 0 ? serviceConfig.hashCode : i3;
        if ((i5 & 16) != 0) {
            int i13 = CoroutineDebuggingKt + 15;
            coroutineBoundary = i13 % 128;
            int i14 = i13 % 2;
            str9 = serviceConfig.getSponsorBeneficiariesState;
        } else {
            str9 = str2;
        }
        if ((i5 & 32) != 0) {
            int i15 = CoroutineDebuggingKt + 77;
            coroutineBoundary = i15 % 128;
            int i16 = i15 % 2;
            i7 = serviceConfig.copydefault;
        } else {
            i7 = i4;
        }
        if ((i5 & 64) != 0) {
            str10 = serviceConfig.accessartificialFrame;
            int i17 = CoroutineDebuggingKt + 27;
            coroutineBoundary = i17 % 128;
            int i18 = i17 % 2;
        } else {
            str10 = str3;
        }
        if ((i5 & 128) != 0) {
            int i19 = CoroutineDebuggingKt + 125;
            coroutineBoundary = i19 % 128;
            int i20 = i19 % 2;
            str11 = serviceConfig.component3;
        } else {
            str11 = str4;
        }
        String str14 = (i5 & 256) != 0 ? serviceConfig.ShareDataUIState : str5;
        String str15 = (i5 & 512) != 0 ? serviceConfig.getShareableDataState : str6;
        String str16 = (i5 & 1024) != 0 ? serviceConfig.equals : str7;
        Integer num6 = (i5 & 2048) != 0 ? serviceConfig.component1 : num;
        Integer num7 = (i5 & 4096) != 0 ? serviceConfig.component2 : num2;
        Integer num8 = (i5 & 8192) != 0 ? serviceConfig.getAsAtTimestamp : num3;
        Integer num9 = (i5 & 16384) != 0 ? serviceConfig.getRequestBeneficiariesState : num4;
        if ((i5 & 32768) != 0) {
            int i21 = CoroutineDebuggingKt + 47;
            num5 = num9;
            coroutineBoundary = i21 % 128;
            int i22 = i21 % 2;
            str12 = serviceConfig.copy;
        } else {
            num5 = num9;
            str12 = str8;
        }
        return serviceConfig.copy(i9, i6, str13, i12, str9, i7, str10, str11, str14, str15, str16, num6, num7, num8, num5, str12);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 55;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ArtificialStackFrames;
        int i6 = i2 + 65;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 53;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.getShareableDataState;
        int i5 = i3 + 119;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 119;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 87;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final Integer component13() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 19;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final Integer component14() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 99;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        throw null;
    }

    public final Integer component15() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 89;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        Integer num = this.getRequestBeneficiariesState;
        int i5 = i3 + 123;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 109;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 113;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt;
        int i3 = i2 + 35;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component4;
        int i6 = i2 + 123;
        coroutineBoundary = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 113;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.toString;
        int i5 = i3 + 103;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 39;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        int i5 = this.hashCode;
        int i6 = i3 + 83;
        CoroutineDebuggingKt = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return i5;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 9;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.getSponsorBeneficiariesState;
        int i4 = i3 + 53;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int component6() {
        int i;
        int i2 = 2 % 2;
        int i3 = coroutineBoundary + 29;
        int i4 = i3 % 128;
        CoroutineDebuggingKt = i4;
        if (i3 % 2 != 0) {
            i = this.copydefault;
            int i5 = 93 / 0;
        } else {
            i = this.copydefault;
        }
        int i6 = i4 + 125;
        coroutineBoundary = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 119;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accessartificialFrame;
        int i5 = i2 + 67;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 125;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt;
        int i3 = i2 + 49;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 47;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ServiceConfig copy(int pinLimit, int otpLimit, String phoneNumberRegular, int phoneNumberMaxLength, String phoneNumberCode, int enableBiometricPayTimes, String unit, String currency, String ivrNumber, String shortCode, String operatorName, Integer amountLen, Integer amountPoint, Integer minPINLen, Integer maxPINLen, String mmVersion) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumberRegular, "");
        Intrinsics.checkNotNullParameter(phoneNumberCode, "");
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(ivrNumber, "");
        Intrinsics.checkNotNullParameter(shortCode, "");
        Intrinsics.checkNotNullParameter(operatorName, "");
        ServiceConfig serviceConfig = new ServiceConfig(pinLimit, otpLimit, phoneNumberRegular, phoneNumberMaxLength, phoneNumberCode, enableBiometricPayTimes, unit, currency, ivrNumber, shortCode, operatorName, amountLen, amountPoint, minPINLen, maxPINLen, mmVersion);
        int i2 = CoroutineDebuggingKt + 109;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return serviceConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = coroutineBoundary + 119;
            CoroutineDebuggingKt = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof ServiceConfig)) {
            return false;
        }
        ServiceConfig serviceConfig = (ServiceConfig) other;
        if (this.ArtificialStackFrames != serviceConfig.ArtificialStackFrames) {
            return false;
        }
        if (this.component4 != serviceConfig.component4) {
            int i3 = coroutineBoundary + 83;
            CoroutineDebuggingKt = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.toString, serviceConfig.toString)) {
            int i4 = coroutineBoundary + 1;
            CoroutineDebuggingKt = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.hashCode != serviceConfig.hashCode) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getSponsorBeneficiariesState, serviceConfig.getSponsorBeneficiariesState)) {
            int i5 = CoroutineDebuggingKt + 37;
            coroutineBoundary = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.copydefault != serviceConfig.copydefault || !Intrinsics.areEqual(this.accessartificialFrame, serviceConfig.accessartificialFrame)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, serviceConfig.component3)) {
            int i7 = coroutineBoundary + 83;
            CoroutineDebuggingKt = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, serviceConfig.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getShareableDataState, serviceConfig.getShareableDataState)) {
            int i9 = coroutineBoundary + 65;
            CoroutineDebuggingKt = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, serviceConfig.equals)) {
            int i11 = CoroutineDebuggingKt + 105;
            coroutineBoundary = i11 % 128;
            return i11 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component1, serviceConfig.component1) || !Intrinsics.areEqual(this.component2, serviceConfig.component2)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.getAsAtTimestamp, serviceConfig.getAsAtTimestamp))) {
            return Intrinsics.areEqual(this.getRequestBeneficiariesState, serviceConfig.getRequestBeneficiariesState) && Intrinsics.areEqual(this.copy, serviceConfig.copy);
        }
        int i12 = CoroutineDebuggingKt + 95;
        coroutineBoundary = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 15 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int iHashCode3 = Integer.hashCode(this.ArtificialStackFrames);
        int iHashCode4 = Integer.hashCode(this.component4);
        int iHashCode5 = this.toString.hashCode();
        int iHashCode6 = Integer.hashCode(this.hashCode);
        int iHashCode7 = this.getSponsorBeneficiariesState.hashCode();
        int iHashCode8 = Integer.hashCode(this.copydefault);
        int iHashCode9 = this.accessartificialFrame.hashCode();
        int iHashCode10 = this.component3.hashCode();
        int iHashCode11 = this.ShareDataUIState.hashCode();
        int iHashCode12 = this.getShareableDataState.hashCode();
        int iHashCode13 = this.equals.hashCode();
        Integer num = this.component1;
        if (num == null) {
            int i4 = coroutineBoundary + 119;
            CoroutineDebuggingKt = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.component2;
        if (num2 == null) {
            int i6 = CoroutineDebuggingKt + 85;
            coroutineBoundary = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        Integer num3 = this.getAsAtTimestamp;
        if (num3 == null) {
            i = 0;
        } else {
            int iHashCode14 = num3.hashCode();
            int i8 = coroutineBoundary + 119;
            CoroutineDebuggingKt = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode14;
        }
        Integer num4 = this.getRequestBeneficiariesState;
        int iHashCode15 = num4 == null ? 0 : num4.hashCode();
        String str = this.copy;
        if (str == null) {
            i2 = 0;
        } else {
            int iHashCode16 = str.hashCode();
            int i10 = CoroutineDebuggingKt + 43;
            i2 = iHashCode16;
            coroutineBoundary = i10 % 128;
            int i11 = i10 % 2;
        }
        return (((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode) * 31) + iHashCode2) * 31) + i) * 31) + iHashCode15) * 31) + i2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServiceConfig(pinLimit=" + this.ArtificialStackFrames + ", otpLimit=" + this.component4 + ", phoneNumberRegular=" + this.toString + ", phoneNumberMaxLength=" + this.hashCode + ", phoneNumberCode=" + this.getSponsorBeneficiariesState + ", enableBiometricPayTimes=" + this.copydefault + ", unit=" + this.accessartificialFrame + ", currency=" + this.component3 + ", ivrNumber=" + this.ShareDataUIState + ", shortCode=" + this.getShareableDataState + ", operatorName=" + this.equals + ", amountLen=" + this.component1 + ", amountPoint=" + this.component2 + ", minPINLen=" + this.getAsAtTimestamp + ", maxPINLen=" + this.getRequestBeneficiariesState + ", mmVersion=" + this.copy + ")";
        int i2 = CoroutineDebuggingKt + 51;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
