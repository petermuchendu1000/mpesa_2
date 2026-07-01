package com.huawei.digitalpayment.consumer.base.util.interceptors;

import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.cube.repository.AppTokenRepository;
import com.huawei.digitalpayment.consumer.base.cube.repository.H5GetAccessTokenRepository;
import com.huawei.digitalpayment.consumer.base.cube.resp.AppTokenResp;
import com.huawei.digitalpayment.consumer.base.securepref.EncryptedSPUtils;
import com.huawei.digitalpayment.consumer.base.util.ExtensionMethodsKt;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/interceptors/H5TokenInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "TAG", "", "h5Retries", "", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getHttpLoggingInterceptor", "()Lokhttp3/logging/HttpLoggingInterceptor;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "fetchAppToken", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/AppTokenResp;", "h5Token", "fetchH5Token", "setCurrentAppToken", "", "appToken", "getCurrentAppToken", "getCurrentAccessTokenExpiry", "checkIfTokenExpired", "", "calculateAppTokenExpiryTimeAndSave", "seconds", "setCurrentAppTokenAndExpiry", "tokenResp", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class H5TokenInterceptor implements Interceptor {

    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_RETRIES = 3;
    public static final String PREF_CURRENT_APP_TOKEN = "PREF_CURRENT_APP_TOKEN";
    public static final String PREF_CURRENT_APP_TOKEN_EXPIRY = "PREF_CURRENT_APP_TOKEN_EXPIRY";
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private int ShareDataUIState;
    private final String component2 = Reflection.getOrCreateKotlinClass(H5TokenInterceptor.class).getSimpleName();
    private final HttpLoggingInterceptor component3;

    /* JADX WARN: Multi-variable type inference failed */
    public H5TokenInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        this.component3 = httpLoggingInterceptor;
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
    }

    public final HttpLoggingInterceptor getHttpLoggingInterceptor() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 21;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        HttpLoggingInterceptor httpLoggingInterceptor = this.component3;
        int i5 = i2 + 49;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return httpLoggingInterceptor;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/interceptors/H5TokenInterceptor$Companion;", "", "<init>", "()V", H5TokenInterceptor.PREF_CURRENT_APP_TOKEN, "", H5TokenInterceptor.PREF_CURRENT_APP_TOKEN_EXPIRY, "MAX_RETRIES", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.interceptors.H5TokenInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public final AppTokenResp fetchAppToken(String h5Token) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(h5Token, "");
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        AppTokenRepository appTokenRepository = new AppTokenRepository();
        appTokenRepository.addHeader("authorization", "Bearer " + h5Token);
        appTokenRepository.addHeader("x-correlation-conversationid", UUID.randomUUID().toString());
        appTokenRepository.addHeader("x-msisdn", str);
        appTokenRepository.addHeader("authx-source-systemorization", "MyOneAppAndroid");
        AppTokenResp appTokenRespSendSyncRequest = appTokenRepository.sendSyncRequest();
        int i2 = getRequestBeneficiariesState + 67;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return appTokenRespSendSyncRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String fetchH5Token() {
        int i = 2 % 2;
        H5GetAccessTokenRepository h5GetAccessTokenRepository = new H5GetAccessTokenRepository();
        h5GetAccessTokenRepository.addParams("appId", "1000000001");
        String accessToken = h5GetAccessTokenRepository.sendSyncRequest().getAccessToken();
        if (accessToken == null) {
            int i2 = getRequestBeneficiariesState + 59;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            accessToken = "";
        }
        int i3 = getRequestBeneficiariesState + 17;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return accessToken;
    }

    private final void component3(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        EncryptedSPUtils.getInstance().put(PREF_CURRENT_APP_TOKEN, str);
        int i4 = getRequestBeneficiariesState + 19;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return EncryptedSPUtils.getInstance().getString(PREF_CURRENT_APP_TOKEN, null);
        }
        EncryptedSPUtils.getInstance().getString(PREF_CURRENT_APP_TOKEN, null);
        obj.hashCode();
        throw null;
    }

    private final String ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String string = EncryptedSPUtils.getInstance().getString(PREF_CURRENT_APP_TOKEN_EXPIRY, "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final boolean component2() {
        int i = 2 % 2;
        try {
            String string = EncryptedSPUtils.getInstance().getString(PREF_CURRENT_APP_TOKEN_EXPIRY, "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            Date dateStringToDate = ExtensionMethodsKt.stringToDate(string, Constants.ISO_DATE_FORMAT);
            Long lValueOf = null;
            if (dateStringToDate != null) {
                int i2 = getAsAtTimestamp + 1;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 != 0) {
                    lValueOf = Long.valueOf(dateStringToDate.getTime());
                } else {
                    Long.valueOf(dateStringToDate.getTime());
                    lValueOf.hashCode();
                    throw null;
                }
            }
            long time = new Date().getTime();
            if (lValueOf == null) {
                return true;
            }
            int i3 = getAsAtTimestamp + 63;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                long jLongValue = lValueOf.longValue();
                int i4 = 52 / 0;
                if (jLongValue <= time) {
                    return true;
                }
            } else if (lValueOf.longValue() <= time) {
                return true;
            }
            return false;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.d(this.component2, message);
            }
            return true;
        }
    }

    private final void copydefault(int i) {
        int i2 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, i);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        String date = ExtensionMethodsKt.formatDate(time, Constants.ISO_DATE_FORMAT);
        L.d(this.component2, "Expiry Period " + date);
        EncryptedSPUtils.getInstance().put(PREF_CURRENT_APP_TOKEN_EXPIRY, date);
        int i3 = getAsAtTimestamp + 37;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void ShareDataUIState(AppTokenResp appTokenResp) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 83;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        EncryptedSPUtils.getInstance().put(PREF_CURRENT_APP_TOKEN, appTokenResp.getAccessToken());
        Integer expiresIn = appTokenResp.getExpiresIn();
        if (expiresIn != null) {
            iIntValue = expiresIn.intValue();
        } else {
            int i4 = getAsAtTimestamp + 89;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = 300;
        }
        copydefault(iIntValue);
    }

    static {
        int i = component1 + 65;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
