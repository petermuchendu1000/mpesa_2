package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/ScopesConstants;", "", "<init>", "()V", "userName", "", "getUserName", "()Ljava/lang/String;", "userLastName", "getUserLastName", "userMiddleName", "getUserMiddleName", "userDob", "getUserDob", TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_USERID, "getUserId", "userIdNo", "getUserIdNo", "userMobile", "getUserMobile", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopesConstants {
    public static final int $stable = 0;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int toString = 1;
    public static final ScopesConstants INSTANCE = new ScopesConstants();
    private static final String copy = OAuthService.SCOPE_USER_NAME;
    private static final String copydefault = "USER_LNAME";
    private static final String component1 = "USER_MNAME";
    private static final String component2 = "USER_DOB";
    private static final String component3 = OAuthService.SCOPE_USER_ID;
    private static final String ShareDataUIState = "USER_IDNO";
    private static final String getAsAtTimestamp = "USER_MOBILE";

    private ScopesConstants() {
    }

    static {
        int i = equals + 9;
        component4 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUserName() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = copy;
        int i4 = i2 + 45;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUserLastName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = copydefault;
        int i4 = i3 + 65;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUserMiddleName() {
        int i = 2 % 2;
        int i2 = toString + 113;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = component1;
        int i5 = i3 + 49;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUserDob() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return component2;
        }
        throw null;
    }

    public final String getUserId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        int i3 = i2 % 128;
        toString = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = component3;
        int i4 = i3 + 35;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getUserIdNo() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState;
        }
        throw null;
    }

    public final String getUserMobile() {
        int i = 2 % 2;
        int i2 = toString + 1;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = getAsAtTimestamp;
        int i5 = i3 + 61;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return str;
    }
}
