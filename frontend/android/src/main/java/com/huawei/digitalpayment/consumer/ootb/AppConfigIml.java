package com.huawei.digitalpayment.consumer.ootb;

import com.huawei.digitalpayment.consumer.baselib.config.DefaultAppConfigIml;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/ootb/AppConfigIml;", "Lcom/huawei/digitalpayment/consumer/baselib/config/DefaultAppConfigIml;", "<init>", "()V", "isDebug", "", "getBaseUrl", "", "getPinKeyVersion", "getPinTransformation", "getSignKeyVersion", "getSignTransformation", "isSecurityDetectEnabled", "miniAppSupportRTL", "closeSoftInputOnClick", "useTheme", "getPinLimit", "", "getOtpLimit", "getPhoneNumberCode", "getPhoneNumberRegular", "getSessionOutTimeSecond", "", "SFC-consumer-prod-release_v5.1.9_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AppConfigIml extends DefaultAppConfigIml {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return BuildConfig.BASE_URL;
    }

    @Override
    public String getPinKeyVersion() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getPinKeyVersion().length();
            throw null;
        }
        String pinKeyVersion = super.getPinKeyVersion();
        if (pinKeyVersion.length() == 0) {
            pinKeyVersion = "00";
        }
        String str = pinKeyVersion;
        int i3 = component1 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @Override
    public String getPinTransformation() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getPinTransformation().length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String pinTransformation = super.getPinTransformation();
        if (pinTransformation.length() == 0) {
            int i3 = component1 + 49;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            pinTransformation = "RSA/ECB/PKCS1Padding";
        }
        return pinTransformation;
    }

    @Override
    public String getSignKeyVersion() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getSignKeyVersion().length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String signKeyVersion = super.getSignKeyVersion();
        if (signKeyVersion.length() == 0) {
            int i3 = ShareDataUIState + 29;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            signKeyVersion = "00";
        }
        return signKeyVersion;
    }

    @Override
    public String getSignTransformation() {
        int i = 2 % 2;
        String signTransformation = super.getSignTransformation();
        if (signTransformation.length() == 0) {
            int i2 = component1 + 107;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 121;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            signTransformation = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
        }
        return signTransformation;
    }

    @Override
    public boolean isSecurityDetectEnabled() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean bool = BuildConfig.SECURITY_DETECT;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            return bool.booleanValue();
        }
        Boolean bool2 = BuildConfig.SECURITY_DETECT;
        Intrinsics.checkNotNullExpressionValue(bool2, "");
        bool2.booleanValue();
        throw null;
    }

    @Override
    public String getPhoneNumberCode() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return "254";
    }

    @Override
    public String getPhoneNumberRegular() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return "(?:(?:07|01)\\d{8}|[71]\\d{8})";
    }

    @Override
    public boolean closeSoftInputOnClick() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override
    public int getOtpLimit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2 == 0 ? 116 : 6;
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public int getPinLimit() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2 != 0 ? 2 : 4;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public long getSessionOutTimeSecond() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return 120L;
        }
        throw null;
    }

    @Override
    public boolean isDebug() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override
    public boolean miniAppSupportRTL() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override
    public boolean useTheme() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        boolean z = !(i2 % 2 != 0);
        int i4 = i3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
