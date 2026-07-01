package com.huawei.digitalpayment.consumer.baselib.config;

import android.text.TextUtils;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u000fH\u0016J\b\u00101\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020\u000fH\u0016J\b\u00103\u001a\u00020\bH\u0016J\b\u00104\u001a\u00020\u000fH\u0016J\b\u00105\u001a\u00020\u001eH\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\b\u00107\u001a\u00020\u001eH\u0016J\b\u00108\u001a\u00020\u001eH\u0016J\b\u00109\u001a\u00020\u000fH\u0016R\u0018\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/AppConfigWrapper;", "Lcom/huawei/digitalpayment/consumer/baselib/config/IAppConfig;", "<init>", "()V", "localAppConfig", "kotlin.jvm.PlatformType", "Lcom/huawei/digitalpayment/consumer/baselib/config/IAppConfig;", "baseUrl", "", "h5BaseUrl", "pinpublickey", "signpublickey", "pintransformation", "signtransformation", "userCustomConfig", "", "init", "", "isDebug", "getH5BaseUrl", "getBaseUrl", "getPinKey", "getNewestPinKeyVersion", "getPinTransformation", "getSignKey", "getSignKeyVersion", "getH5SignKeyVersion", "getSignTransformation", "onlySupport3D", "getPinLimit", "", "getOtpLimit", "getPhoneNumberRegular", "getPhoneNumberCode", "getPhoneNumberMaxLength", "getBiometricPayGuideCountRemind", "getCurrency", "getSymbol", "getOperatorNameRegular", "getResendOtpTime", "", "getBaseWidth", "", "getSessionOutTimeSecond", "getTimeoutInSecond", "getDelayRemindTime", "getString", GriverCacheDao.COLUMN_CACHE_ID, "isSecurityDetectEnabled", "miniAppSupportRTL", "isFilterLoginSettingMenu", "getIVRNumber", "closeSoftInputOnClick", "getAmountLen", "getAmountPoint", "getMinPINLength", "getMaxPINLength", "isShowDefaultFeatures", "Companion", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AppConfigWrapper implements IAppConfig {

    public static final Companion INSTANCE = new Companion(null);
    private static final String ShareDataUIState = "AppConfigIml";
    private static int coroutineCreation = 1;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState;
    private static int hashCode;
    private final IAppConfig component4 = (IAppConfig) RouteUtils.getService(IAppConfig.class);
    private String component1 = "";
    private String equals = "";
    private String getAsAtTimestamp = "";
    private String copy = "";
    private String getRequestBeneficiariesState = "";
    private String toString = "";
    private boolean ArtificialStackFrames = true;

    public AppConfigWrapper() {
        component1();
    }

    private final void component1() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 85;
        hashCode = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            L.setIsDebug(isDebug());
            String string = SPUtils.getInstance("sp_debug").getString("baseUrl");
            this.component1 = string;
            TextUtils.isEmpty(string);
            throw null;
        }
        L.setIsDebug(isDebug());
        String string2 = SPUtils.getInstance("sp_debug").getString("baseUrl");
        this.component1 = string2;
        if (TextUtils.isEmpty(string2)) {
            this.ArtificialStackFrames = false;
            SPUtils.getInstance("sp_debug").put("baseUrl", this.component4.getBaseUrl());
            SPUtils.getInstance("sp_debug").put("pinTransformation", this.component4.getPinTransformation());
            SPUtils.getInstance("sp_debug").put("signTransformation", this.component4.getSignTransformation());
            return;
        }
        String string3 = SPUtils.getInstance("sp_debug").getString("h5BaseUrl");
        this.equals = string3;
        if (this.ArtificialStackFrames) {
            int i3 = hashCode + 47;
            coroutineCreation = i3 % 128;
            if (i3 % 2 == 0) {
                string3.length();
                obj.hashCode();
                throw null;
            }
            if (string3.length() == 0) {
                this.equals = getH5BaseUrlByBaseUrl();
            }
        }
        this.getAsAtTimestamp = SPUtils.getInstance("sp_debug").getString("pinPublicKey");
        this.copy = SPUtils.getInstance("sp_debug").getString("signPublicKey");
        this.getRequestBeneficiariesState = SPUtils.getInstance("sp_debug").getString("pinTransformation");
        this.toString = SPUtils.getInstance("sp_debug").getString("signTransformation");
        L.d(ShareDataUIState, "AppConfigWrapper:userCustomConfig " + this.ArtificialStackFrames);
        if (this.ArtificialStackFrames) {
            L.d(ShareDataUIState, "AppConfigWrapper:baseUrl " + this.component1);
            L.d(ShareDataUIState, "AppConfigWrapper:h5BaseUrl " + this.equals);
            L.d(ShareDataUIState, "AppConfigWrapper:pinpublickey " + this.getAsAtTimestamp);
            L.d(ShareDataUIState, "AppConfigWrapper:signpublickey " + this.copy);
            L.d(ShareDataUIState, "AppConfigWrapper:pintransformation " + this.getRequestBeneficiariesState);
            L.d(ShareDataUIState, "AppConfigWrapper:signtransformation " + this.toString);
        }
    }

    @Override
    public boolean isDebug() {
        int i = 2 % 2;
        int i2 = hashCode + 67;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsDebug = this.component4.isDebug();
        int i4 = coroutineCreation + 13;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return zIsDebug;
    }

    @Override
    public String getH5BaseUrl() {
        int i = 2 % 2;
        int i2 = hashCode + 67;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.ArtificialStackFrames) {
            return this.equals;
        }
        String h5BaseUrl = this.component4.getH5BaseUrl();
        Intrinsics.checkNotNullExpressionValue(h5BaseUrl, "");
        int i3 = coroutineCreation + 99;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        return h5BaseUrl;
    }

    @Override
    public String getBaseUrl() {
        String baseUrl;
        int i = 2 % 2;
        int i2 = coroutineCreation + 9;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        if (this.ArtificialStackFrames) {
            baseUrl = this.component1;
        } else {
            baseUrl = this.component4.getBaseUrl();
            Intrinsics.checkNotNullExpressionValue(baseUrl, "");
        }
        int i4 = hashCode + 83;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return baseUrl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r4.ArtificialStackFrames == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation + 45;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r0 = r4.component4.getPinKey();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r4.getAsAtTimestamp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r1)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getPinKey() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r2
            int r1 = r1 % r0
            java.lang.String r2 = "PIN_KEY"
            if (r1 == 0) goto L28
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = r1.getString(r2)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 65
            int r3 = r3 / 0
            r2 = r2 ^ 1
            if (r2 == 0) goto L3d
            goto L39
        L28:
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = r1.getString(r2)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3d
        L39:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            return r1
        L3d:
            boolean r1 = r4.ArtificialStackFrames
            if (r1 == 0) goto L4d
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r2
            int r1 = r1 % r0
            java.lang.String r0 = r4.getAsAtTimestamp
            goto L58
        L4d:
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = r4.component4
            java.lang.String r0 = r0.getPinKey()
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.getPinKey():java.lang.String");
    }

    @Override
    public String getNewestPinKeyVersion() {
        int i = 2 % 2;
        int i2 = hashCode + 113;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            String string = SPUtils.getInstance().getString(SPConstant.PIN_KEY_VERSION);
            if (!TextUtils.isEmpty(string)) {
                Intrinsics.checkNotNull(string);
                int i3 = coroutineCreation + 1;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                return string;
            }
            String newestPinKeyVersion = this.component4.getNewestPinKeyVersion();
            Intrinsics.checkNotNullExpressionValue(newestPinKeyVersion, "");
            return newestPinKeyVersion;
        }
        TextUtils.isEmpty(SPUtils.getInstance().getString(SPConstant.PIN_KEY_VERSION));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r2 = r4.component4.getPinTransformation();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.ArtificialStackFrames != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.ArtificialStackFrames != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r4.getRequestBeneficiariesState;
        r1 = r1 + 55;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r1 % 128;
        r1 = r1 % 2;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getPinTransformation() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode
            int r2 = r1 + 87
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            boolean r2 = r4.ArtificialStackFrames
            r3 = 70
            int r3 = r3 / 0
            if (r2 == 0) goto L25
            goto L1b
        L17:
            boolean r2 = r4.ArtificialStackFrames
            if (r2 == 0) goto L25
        L1b:
            java.lang.String r2 = r4.getRequestBeneficiariesState
            int r1 = r1 + 55
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r3
            int r1 = r1 % r0
            goto L30
        L25:
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = r4.component4
            java.lang.String r2 = r0.getPinTransformation()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.getPinTransformation():java.lang.String");
    }

    @Override
    public String getSignKey() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 17;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            String string = SPUtils.getInstance().getString(SPConstant.SIGN_KEY);
            if (!TextUtils.isEmpty(string)) {
                Intrinsics.checkNotNull(string);
                return string;
            }
            if (this.ArtificialStackFrames) {
                int i3 = coroutineCreation + 109;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                return this.copy;
            }
            String signKey = this.component4.getSignKey();
            Intrinsics.checkNotNullExpressionValue(signKey, "");
            return signKey;
        }
        TextUtils.isEmpty(SPUtils.getInstance().getString(SPConstant.SIGN_KEY));
        throw null;
    }

    @Override
    public String getSignKeyVersion() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString(SPConstant.SIGN_KEY_VERSION);
        if (!TextUtils.isEmpty(string)) {
            int i2 = hashCode + 85;
            coroutineCreation = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNull(string);
                return string;
            }
            Intrinsics.checkNotNull(string);
            throw null;
        }
        String signKeyVersion = this.component4.getSignKeyVersion();
        Intrinsics.checkNotNullExpressionValue(signKeyVersion, "");
        int i3 = hashCode + 29;
        coroutineCreation = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
        return signKeyVersion;
    }

    @Override
    public String getH5SignKeyVersion() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString(SPConstant.H5_SIGN_KEY_VERSION);
        if (!TextUtils.isEmpty(string)) {
            int i2 = hashCode + 101;
            coroutineCreation = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNull(string);
            return string;
        }
        String signKeyVersion = this.component4.getSignKeyVersion();
        Intrinsics.checkNotNullExpressionValue(signKeyVersion, "");
        int i4 = coroutineCreation + 121;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return signKeyVersion;
        }
        throw null;
    }

    @Override
    public String getSignTransformation() {
        int i = 2 % 2;
        if (this.ArtificialStackFrames) {
            int i2 = hashCode + 1;
            int i3 = i2 % 128;
            coroutineCreation = i3;
            int i4 = i2 % 2;
            String str = this.toString;
            int i5 = i3 + 15;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
        String signTransformation = this.component4.getSignTransformation();
        Intrinsics.checkNotNullExpressionValue(signTransformation, "");
        return signTransformation;
    }

    @Override
    public boolean onlySupport3D() {
        int i = 2 % 2;
        int i2 = hashCode + 117;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnlySupport3D = this.component4.onlySupport3D();
        int i4 = coroutineCreation + 97;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return zOnlySupport3D;
    }

    @Override
    public int getPinLimit() {
        int pinLimit;
        int i = 2 % 2;
        int i2 = coroutineCreation + 65;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            int i4 = coroutineCreation + 99;
            hashCode = i4 % 128;
            if (i4 % 2 != 0) {
                currentServiceConfig.getPinLimit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            pinLimit = currentServiceConfig.getPinLimit();
        } else {
            pinLimit = this.component4.getPinLimit();
        }
        int i5 = coroutineCreation + 87;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return pinLimit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
  0x0023: PHI (r1v6 com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig) = 
  (r1v5 com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig)
  (r1v12 com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig)
 binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getOtpLimit() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.INSTANCE
            com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig r1 = r1.getCurrentServiceConfig()
            r2 = 33
            int r2 = r2 / 0
            if (r1 == 0) goto L30
            goto L23
        L1b:
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.INSTANCE
            com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig r1 = r1.getCurrentServiceConfig()
            if (r1 == 0) goto L30
        L23:
            int r1 = r1.getOtpLimit()
            int r2 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r2 = r2 + 115
            int r3 = r2 % 128
            goto L3c
        L2e:
            int r2 = r2 % r0
            goto L3f
        L30:
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r1 = r4.component4
            int r1 = r1.getOtpLimit()
            int r2 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r2 = r2 + 77
            int r3 = r2 % 128
        L3c:
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r3
            goto L2e
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.getOtpLimit():int");
    }

    @Override
    public String getPhoneNumberRegular() {
        int i = 2 % 2;
        int i2 = hashCode + 39;
        coroutineCreation = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AppConfigManager.INSTANCE.getCurrentServiceConfig();
            obj.hashCode();
            throw null;
        }
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        String phoneNumberRegular = currentServiceConfig != null ? currentServiceConfig.getPhoneNumberRegular() : null;
        String str = phoneNumberRegular;
        if (str != null && str.length() != 0) {
            return phoneNumberRegular;
        }
        String phoneNumberRegular2 = this.component4.getPhoneNumberRegular();
        Intrinsics.checkNotNullExpressionValue(phoneNumberRegular2, "");
        int i3 = hashCode + 69;
        coroutineCreation = i3 % 128;
        if (i3 % 2 != 0) {
            return phoneNumberRegular2;
        }
        throw null;
    }

    @Override
    public String getPhoneNumberCode() {
        String phoneNumberCode;
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        Object obj = null;
        if (currentServiceConfig != null) {
            int i2 = coroutineCreation + 115;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            phoneNumberCode = currentServiceConfig.getPhoneNumberCode();
        } else {
            phoneNumberCode = null;
        }
        String str = phoneNumberCode;
        if (str != null) {
            int i4 = hashCode + 107;
            coroutineCreation = i4 % 128;
            if (i4 % 2 == 0) {
                str.length();
                obj.hashCode();
                throw null;
            }
            if (str.length() != 0) {
                return phoneNumberCode;
            }
        }
        String phoneNumberCode2 = this.component4.getPhoneNumberCode();
        Intrinsics.checkNotNullExpressionValue(phoneNumberCode2, "");
        return phoneNumberCode2;
    }

    @Override
    public int getPhoneNumberMaxLength() {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            int i4 = coroutineCreation + 41;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return currentServiceConfig.getPhoneNumberMaxLength();
        }
        return this.component4.getPhoneNumberMaxLength();
    }

    @Override
    public int getBiometricPayGuideCountRemind() {
        int biometricPayGuideCountRemind;
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            biometricPayGuideCountRemind = currentServiceConfig.getEnableBiometricPayTimes();
        } else {
            biometricPayGuideCountRemind = this.component4.getBiometricPayGuideCountRemind();
            int i2 = coroutineCreation + 113;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = coroutineCreation + 85;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return biometricPayGuideCountRemind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getCurrency() {
        String currency;
        int i = 2 % 2;
        String currentCurrencyCode = CurrencyConfigManager.INSTANCE.getCurrentCurrencyCode();
        String str = currentCurrencyCode;
        if (str != null && str.length() != 0) {
            return currentCurrencyCode;
        }
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        Object obj = null;
        if (currentServiceConfig != null) {
            int i2 = coroutineCreation + 107;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                currentServiceConfig.getCurrency();
                throw null;
            }
            currency = currentServiceConfig.getCurrency();
        } else {
            currency = null;
        }
        String str2 = currency;
        if (str2 != null) {
            int i3 = coroutineCreation + 95;
            hashCode = i3 % 128;
            if (i3 % 2 != 0) {
                str2.length();
                obj.hashCode();
                throw null;
            }
            if (str2.length() != 0) {
                return currency;
            }
        }
        String currency2 = this.component4.getCurrency();
        Intrinsics.checkNotNullExpressionValue(currency2, "");
        return currency2;
    }

    @Override
    public String getSymbol() {
        String unit;
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            int i2 = coroutineCreation + 57;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            unit = currentServiceConfig.getUnit();
        } else {
            int i4 = hashCode + 115;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            unit = null;
        }
        String str = unit;
        if (str != null && str.length() != 0) {
            return unit;
        }
        String symbol = this.component4.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "");
        return symbol;
    }

    @Override
    public String getOperatorNameRegular() throws Throwable {
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        String operatorName = currentServiceConfig != null ? currentServiceConfig.getOperatorName() : null;
        String str = operatorName;
        if (str != null && str.length() != 0) {
            int i2 = coroutineCreation + 91;
            hashCode = i2 % 128;
            if (i2 % 2 == 0) {
                return operatorName;
            }
            throw null;
        }
        String operatorNameRegular = this.component4.getOperatorNameRegular();
        Intrinsics.checkNotNullExpressionValue(operatorNameRegular, "");
        int i3 = coroutineCreation + 65;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return operatorNameRegular;
        }
        throw null;
    }

    @Override
    public long getResendOtpTime() {
        int i = 2 % 2;
        int i2 = hashCode + 43;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        long resendOtpTime = this.component4.getResendOtpTime();
        int i4 = hashCode + 75;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return resendOtpTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public float getBaseWidth() {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        float baseWidth = this.component4.getBaseWidth();
        int i4 = coroutineCreation + 25;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return baseWidth;
    }

    @Override
    public long getSessionOutTimeSecond() {
        long sessionOutTimeSecond;
        int i = 2 % 2;
        int i2 = coroutineCreation + 63;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            sessionOutTimeSecond = this.component4.getSessionOutTimeSecond();
            int i3 = 21 / 0;
        } else {
            sessionOutTimeSecond = this.component4.getSessionOutTimeSecond();
        }
        int i4 = coroutineCreation + 85;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return sessionOutTimeSecond;
    }

    @Override
    public long getTimeoutInSecond() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 49;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        long timeoutInSecond = this.component4.getTimeoutInSecond();
        int i4 = hashCode + 19;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return timeoutInSecond;
    }

    @Override
    public long getDelayRemindTime() {
        int i = 2 % 2;
        int i2 = hashCode + 35;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            this.component4.getDelayRemindTime();
            throw null;
        }
        long delayRemindTime = this.component4.getDelayRemindTime();
        int i3 = coroutineCreation + 57;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        return delayRemindTime;
    }

    @Override
    public String getString(int id) {
        int i = 2 % 2;
        int i2 = hashCode + 39;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        String string = this.component4.getString(id);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = coroutineCreation + 37;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override
    public boolean isSecurityDetectEnabled() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 21;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSecurityDetectEnabled = this.component4.isSecurityDetectEnabled();
        int i4 = hashCode + 121;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsSecurityDetectEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean miniAppSupportRTL() {
        boolean zMiniAppSupportRTL;
        int i = 2 % 2;
        int i2 = coroutineCreation + 89;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            zMiniAppSupportRTL = this.component4.miniAppSupportRTL();
            int i3 = 83 / 0;
        } else {
            zMiniAppSupportRTL = this.component4.miniAppSupportRTL();
        }
        int i4 = hashCode + 97;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return zMiniAppSupportRTL;
        }
        throw null;
    }

    @Override
    public boolean isFilterLoginSettingMenu() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 83;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsFilterLoginSettingMenu = this.component4.isFilterLoginSettingMenu();
        int i4 = coroutineCreation + 87;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return zIsFilterLoginSettingMenu;
    }

    @Override
    public String getIVRNumber() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 67;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        String ivrNumber = null;
        if (currentServiceConfig != null) {
            int i4 = hashCode + 71;
            coroutineCreation = i4 % 128;
            if (i4 % 2 == 0) {
                currentServiceConfig.getIvrNumber();
                ivrNumber.hashCode();
                throw null;
            }
            ivrNumber = currentServiceConfig.getIvrNumber();
        } else {
            int i5 = coroutineCreation + 35;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
        }
        String str = ivrNumber;
        if (str != null && str.length() != 0) {
            return ivrNumber;
        }
        String iVRNumber = this.component4.getIVRNumber();
        Intrinsics.checkNotNullExpressionValue(iVRNumber, "");
        return iVRNumber;
    }

    @Override
    public boolean closeSoftInputOnClick() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 103;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        boolean zCloseSoftInputOnClick = this.component4.closeSoftInputOnClick();
        int i4 = hashCode + 89;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return zCloseSoftInputOnClick;
    }

    @Override
    public int getAmountLen() {
        Integer amountLen;
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            int i2 = coroutineCreation + 95;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                amountLen = currentServiceConfig.getAmountLen();
                int i3 = 89 / 0;
            } else {
                amountLen = currentServiceConfig.getAmountLen();
            }
        } else {
            amountLen = null;
        }
        if (amountLen != null && amountLen.intValue() > 0) {
            int i4 = hashCode + 81;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            return amountLen.intValue();
        }
        int amountLen2 = this.component4.getAmountLen();
        int i6 = coroutineCreation + 23;
        hashCode = i6 % 128;
        int i7 = i6 % 2;
        return amountLen2;
    }

    @Override
    public int getAmountPoint() {
        Integer amountPoint;
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            amountPoint = currentServiceConfig.getAmountPoint();
            int i2 = coroutineCreation + 17;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = hashCode + 99;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            amountPoint = null;
        }
        if (amountPoint != null) {
            int i6 = coroutineCreation + 95;
            hashCode = i6 % 128;
            if (i6 % 2 == 0) {
                if (amountPoint.intValue() >= 0) {
                    return amountPoint.intValue();
                }
            } else {
                amountPoint.intValue();
                throw null;
            }
        }
        return this.component4.getAmountPoint();
    }

    @Override
    public int getMinPINLength() {
        int iIntValue;
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig == null) {
            int i2 = coroutineCreation + 43;
            hashCode = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component4.getMinPINLength();
            }
            int i3 = 86 / 0;
            return this.component4.getMinPINLength();
        }
        Integer minPINLen = currentServiceConfig.getMinPINLen();
        if (minPINLen != null) {
            int i4 = coroutineCreation + 81;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = minPINLen.intValue();
        } else {
            iIntValue = 0;
        }
        Integer maxPINLen = currentServiceConfig.getMaxPINLen();
        int iIntValue2 = maxPINLen != null ? maxPINLen.intValue() : 0;
        return (iIntValue > 0 || iIntValue2 > 0) ? iIntValue <= 0 ? iIntValue2 : iIntValue2 <= 0 ? iIntValue : Math.min(iIntValue, iIntValue2) : this.component4.getMinPINLength();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return r6.component4.getMaxPINLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r6.component4.getMaxPINLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r3 = r1.getMinPINLen();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation + 37;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r4 % 128;
        r4 = r4 % 2;
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r1 = r1.getMaxPINLen();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation + 113;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r4 % 128;
        r4 = r4 % 2;
        r1 = r1.intValue();
        r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode + 1;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r1 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        return r6.component4.getMaxPINLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r1 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation + 77;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if ((r1 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r0 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        return java.lang.Math.max(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode + 49;
        com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r1 % 128;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getMaxPINLength() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.INSTANCE
            com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig r1 = r1.getCurrentServiceConfig()
            r3 = 67
            int r3 = r3 / r2
            if (r1 != 0) goto L3c
            goto L23
        L1b:
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.INSTANCE
            com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig r1 = r1.getCurrentServiceConfig()
            if (r1 != 0) goto L3c
        L23:
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L35
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = r6.component4
            int r0 = r0.getMaxPINLength()
            return r0
        L35:
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = r6.component4
            r0.getMaxPINLength()
            r0 = 0
            throw r0
        L3c:
            java.lang.Integer r3 = r1.getMinPINLen()
            if (r3 == 0) goto L50
            int r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r4 = r4 + 37
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r5
            int r4 = r4 % r0
            int r3 = r3.intValue()
            goto L51
        L50:
            r3 = r2
        L51:
            java.lang.Integer r1 = r1.getMaxPINLen()
            if (r1 == 0) goto L6e
            int r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r4 = r4 + 113
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r5
            int r4 = r4 % r0
            int r1 = r1.intValue()
            int r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode
            int r4 = r4 + 1
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation = r5
            int r4 = r4 % r0
            goto L6f
        L6e:
            r1 = r2
        L6f:
            if (r3 > 0) goto L7a
            if (r1 > 0) goto L7a
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r0 = r6.component4
            int r0 = r0.getMaxPINLength()
            return r0
        L7a:
            if (r1 > 0) goto L8b
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.coroutineCreation
            int r1 = r1 + 77
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.hashCode = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L8a
            r0 = 90
            int r0 = r0 / r2
        L8a:
            return r3
        L8b:
            int r0 = java.lang.Math.max(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigWrapper.getMaxPINLength():int");
    }

    @Override
    public boolean isShowDefaultFeatures() {
        int i = 2 % 2;
        ServiceConfig currentServiceConfig = AppConfigManager.INSTANCE.getCurrentServiceConfig();
        if (currentServiceConfig != null) {
            String mmVersion = currentServiceConfig.getMmVersion();
            if (TextUtils.isEmpty(mmVersion) || !Intrinsics.areEqual("2.0", mmVersion)) {
                return this.component4.isShowDefaultFeatures();
            }
            return false;
        }
        int i2 = coroutineCreation + 33;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            this.component4.isShowDefaultFeatures();
            throw null;
        }
        boolean zIsShowDefaultFeatures = this.component4.isShowDefaultFeatures();
        int i3 = coroutineCreation + 113;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        return zIsShowDefaultFeatures;
    }

    static {
        int i = getShareableDataState + 83;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/AppConfigWrapper$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
