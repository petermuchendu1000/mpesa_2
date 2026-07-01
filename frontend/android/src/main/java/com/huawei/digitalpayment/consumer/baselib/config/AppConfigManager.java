package com.huawei.digitalpayment.consumer.baselib.config;

import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.track.Event;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.AssetsReadUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.model.SecurityConfig;
import com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.http.approute.AppRouteConfigUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020$J\u000e\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0017J\u000e\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0017J\u000e\u0010)\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0017J\u0006\u0010+\u001a\u00020$J\b\u0010,\u001a\u00020\u0010H\u0007J\b\u0010-\u001a\u00020\u000eH\u0007J\b\u0010.\u001a\u0004\u0018\u00010\u000eJ\b\u0010/\u001a\u00020$H\u0002J\u0016\u0010/\u001a\u00020$2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101J\u0014\u0010/\u001a\u00020$2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000503J$\u0010/\u001a\u00020$2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005032\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101J\u0010\u00104\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u000206H\u0002J\u0012\u0010!\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\b\u00109\u001a\u00020$H\u0002J\u0010\u0010:\u001a\u0004\u0018\u00010\u00132\u0006\u00108\u001a\u00020\u0005J\u0010\u0010;\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010=\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010>\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010?\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010@\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u000e\u0010A\u001a\u00020$2\u0006\u00105\u001a\u000206J\u0010\u0010B\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010C\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u000e\u0010D\u001a\u00020$2\u0006\u00105\u001a\u000206J\b\u0010E\u001a\u00020$H\u0002J\u0016\u0010E\u001a\u00020$2\u000e\u00100\u001a\n\u0012\u0004\u0012\u000206\u0018\u000101J\u0010\u0010F\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010G\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010H\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010I\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006J"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/AppConfigManager;", "", "<init>", "()V", "TAG", "", "KEY", "SERVICE_CONFIG", "SP_APP", "SESSION_TIME_OUT_SECOND", "MERCHANT_APP_ID_CONFIG", "FAQ_URL", "HELP_URL", AppConfigManager.SERVICE_CONFIG, "Lcom/huawei/digitalpayment/consumer/baselib/config/model/ServiceConfig;", "appConfig", "Lcom/huawei/digitalpayment/consumer/baselib/config/IAppConfig;", "executeConfigMap", "Ljava/util/HashMap;", "Lcom/google/gson/JsonObject;", "Lkotlin/collections/HashMap;", "appConfigListeners", "Ljava/util/ArrayList;", "Lcom/huawei/digitalpayment/consumer/baselib/config/AppConfigListener;", "Lkotlin/collections/ArrayList;", "getAppConfigListeners", "()Ljava/util/ArrayList;", "cubeConfigListeners", "getCubeConfigListeners", KeysConstants.KEY_SECURITY_CONFIG, "Lcom/huawei/digitalpayment/consumer/baselib/config/model/SecurityConfig;", "getSecurityConfig", "()Lcom/huawei/digitalpayment/consumer/baselib/config/model/SecurityConfig;", "setSecurityConfig", "(Lcom/huawei/digitalpayment/consumer/baselib/config/model/SecurityConfig;)V", "initServiceConfig", "", "fetchServiceConfig", "addConfigListener", "appConfigListener", "addCubeConfigListener", "removeConfigListener", "removeCubeConfigListener", "goHelp", "getAppConfig", "getServiceConfig", "getCurrentServiceConfig", "getBasicConfig", "callback", "Lcom/huawei/common/listener/ApiCallback;", "configTypeLists", "", "updateSupportCurrencyList", "json", "Lorg/json/JSONObject;", "saveConfig", "key", "updateExecuteConfig", "getExecuteConfigByKey", "setLoginPriority", "setPayPriority", "setliveAuthConfig", "setAndoridEventConfig", "updateMerchantAppIdConfig", "updateSessionTime", "setLanguage", "updateColorConfig", "updateFaqAndHelp", "updateServiceConfig", "getConfigVerify", "updateStartPageConfig", "updateMiniAppCashOutConfig", "updateAppMerchantConfig", "updateMiniAppCashInConfig", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppConfigManager {
    public static final String FAQ_URL = "faqUrl";
    public static final String HELP_URL = "helpUrl";
    public static final AppConfigManager INSTANCE;
    public static final String KEY = "configTypes";
    public static final String MERCHANT_APP_ID_CONFIG = "merchantAppIdConfig";
    public static final String SERVICE_CONFIG = "serviceConfig";
    public static final String SESSION_TIME_OUT_SECOND = "sessionTimeoutSecond";
    public static final String SP_APP = "sp_app";
    private static IAppConfig ShareDataUIState = null;
    private static final String component1 = "AppConfigManager";
    private static final HashMap<String, JsonObject> component2;
    private static final ArrayList<AppConfigListener> component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static final ArrayList<AppConfigListener> copydefault;
    private static int equals = 0;
    private static ServiceConfig getAsAtTimestamp = null;
    private static SecurityConfig getRequestBeneficiariesState = null;
    private static int hashCode = 1;

    public static Object component1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i5)) | i8 | (~(i6 | i5));
        int i10 = (~(i7 | (~i5))) | i8;
        int i11 = (~(i5 | i)) | (~((~i6) | i));
        int i12 = i + i6 + i2 + (929125522 * i3) + (1849324972 * i4);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i) + 1146290176 + ((-1462591364) * i6) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i2) + ((-291241984) * i3) + (1012400128 * i4) + ((-1810169856) * i13);
        int i15 = ((i * (-2058557531)) - 518432259) + (i6 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i2 * (-2058558961)) + (i3 * 548722830) + (i4 * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        return i16 != 1 ? i16 != 2 ? copydefault(objArr) : component2(objArr) : component1(objArr);
    }

    private AppConfigManager() {
    }

    public static final IAppConfig access$getAppConfig$p() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 111;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        IAppConfig iAppConfig = ShareDataUIState;
        int i4 = i2 + 13;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return iAppConfig;
    }

    public static final void access$saveConfig(AppConfigManager appConfigManager, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 95;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.ShareDataUIState(str, jSONObject);
        int i4 = hashCode + 43;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$setAndoridEventConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 71;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.copydefault(jSONObject);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = equals + 87;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setLoginPriority(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.component2(jSONObject);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setPayPriority(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 17;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.component3(jSONObject);
        if (i3 == 0) {
            throw null;
        }
        int i4 = hashCode + 115;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$setSecurityConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 57;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int iComponent1 = Event.AnonymousClass1.component1();
        component1(-553607866, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{appConfigManager, jSONObject}, iComponent1, 553607866);
        int i4 = hashCode + 13;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public static final void access$setServiceConfig$p(ServiceConfig serviceConfig) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 89;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        getAsAtTimestamp = serviceConfig;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 119;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setliveAuthConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        appConfigManager.ShareDataUIState(jSONObject);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = hashCode + 31;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$updateAppMerchantConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.equals(jSONObject);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$updateColorConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 61;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        appConfigManager.getAsAtTimestamp(jSONObject);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = hashCode + 91;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$updateExecuteConfig(AppConfigManager appConfigManager) {
        int i = 2 % 2;
        int i2 = hashCode + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.copydefault();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = hashCode + 29;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updateFaqAndHelp(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.copy(jSONObject);
        int i4 = hashCode + 5;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updateMerchantAppIdConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 61;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.getRequestBeneficiariesState(jSONObject);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
    }

    public static final void access$updateMiniAppCashInConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.component4(jSONObject);
        int i4 = hashCode + 79;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updateMiniAppCashOutConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 59;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int iComponent1 = Event.AnonymousClass1.component1();
            component1(-1679020712, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{appConfigManager, jSONObject}, iComponent1, 1679020713);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iComponent12 = Event.AnonymousClass1.component1();
        component1(-1679020712, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{appConfigManager, jSONObject}, iComponent12, 1679020713);
        int i3 = hashCode + 39;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final void access$updateSessionTime(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.getSponsorBeneficiariesState(jSONObject);
        int i4 = equals + 125;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updateStartPageConfig(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 55;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.ArtificialStackFrames(jSONObject);
        int i4 = equals + 101;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updateSupportCurrencyList(AppConfigManager appConfigManager, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        appConfigManager.hashCode(jSONObject);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = hashCode + 19;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }

    static {
        AppConfigManager appConfigManager = new AppConfigManager();
        INSTANCE = appConfigManager;
        ShareDataUIState = new AppConfigWrapper();
        component2 = new HashMap<>();
        component3 = new ArrayList<>();
        copydefault = new ArrayList<>();
        int iComponent1 = Event.AnonymousClass1.component1();
        component1(-1449892683, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{appConfigManager}, iComponent1, 1449892685);
        int i = component4 + 53;
        copy = i % 128;
        int i2 = i % 2;
    }

    public final ArrayList<AppConfigListener> getAppConfigListeners() {
        ArrayList<AppConfigListener> arrayList;
        int i = 2 % 2;
        int i2 = hashCode + 97;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            arrayList = component3;
            int i4 = 38 / 0;
        } else {
            arrayList = component3;
        }
        int i5 = i3 + 41;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return arrayList;
    }

    public final ArrayList<AppConfigListener> getCubeConfigListeners() {
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        hashCode = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ArrayList<AppConfigListener> arrayList = copydefault;
        int i4 = i3 + 95;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public final SecurityConfig getSecurityConfig() {
        int i = 2 % 2;
        int i2 = equals + 13;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        SecurityConfig securityConfig = getRequestBeneficiariesState;
        int i5 = i3 + 119;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return securityConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSecurityConfig(SecurityConfig securityConfig) {
        int i = 2 % 2;
        int i2 = equals + 29;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        getRequestBeneficiariesState = securityConfig;
        if (i3 == 0) {
            throw null;
        }
    }

    private static Object component2(Object[] objArr) {
        int i = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public Object doInBackground() {
                int i2 = 2 % 2;
                int i3 = component2 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Void voidDoInBackground = doInBackground();
                int i5 = copydefault + 41;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return voidDoInBackground;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 31;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess((Void) obj);
                int i5 = copydefault + 121;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Void doInBackground() {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    java.lang.String r1 = "sp_app"
                    com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance(r1)
                    java.lang.String r2 = "serviceConfig"
                    java.lang.String r1 = r1.getString(r2)
                    r2 = r1
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    if (r2 == 0) goto L49
                    int r3 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager$initServiceConfig$1.component2
                    int r3 = r3 + 75
                    int r4 = r3 % 128
                    com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager$initServiceConfig$1.copydefault = r4
                    int r3 = r3 % r0
                    if (r3 != 0) goto L2c
                    boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                    r3 = 31
                    int r3 = r3 / 0
                    if (r2 == 0) goto L3c
                    goto L32
                L2c:
                    boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                    if (r2 == 0) goto L3c
                L32:
                    int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager$initServiceConfig$1.copydefault
                    int r1 = r1 + 123
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager$initServiceConfig$1.component2 = r2
                    int r1 = r1 % r0
                    goto L49
                L3c:
                    com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r0 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.INSTANCE
                    java.lang.Class<com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig> r0 = com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig.class
                    java.lang.Object r0 = com.huawei.common.util.SecureGsonUtils.fromJson(r1, r0)
                    com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig r0 = (com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfig) r0
                    com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.access$setServiceConfig$p(r0)
                L49:
                    com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r0 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.INSTANCE
                    com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.access$updateExecuteConfig(r0)
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager$initServiceConfig$1.doInBackground():java.lang.Void");
            }

            public void onSuccess(Void result) {
                int i2 = 2 % 2;
                int i3 = component2 + 15;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 43 / 0;
                }
            }
        });
        L.d(component1, "initServiceConfig: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        int i2 = equals + 19;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void fetchServiceConfig() {
        int i = 2 % 2;
        int i2 = hashCode + 77;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            component3();
            ShareDataUIState();
            int i3 = 51 / 0;
        } else {
            component3();
            ShareDataUIState();
        }
        int i4 = equals + 73;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
  0x002b: PHI (r1v5 java.util.ArrayList<com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener>) = 
  (r1v4 java.util.ArrayList<com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener>)
  (r1v7 java.util.ArrayList<com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener>)
 binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addConfigListener(com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.util.ArrayList<com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener> r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.component3
            boolean r2 = r1.contains(r5)
            r3 = 21
            int r3 = r3 / 0
            if (r2 != 0) goto L37
            goto L2b
        L20:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.util.ArrayList<com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener> r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.component3
            boolean r2 = r1.contains(r5)
            if (r2 != 0) goto L37
        L2b:
            int r2 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode = r3
            int r2 = r2 % r0
            r1.add(r5)
        L37:
            int r5 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals
            int r5 = r5 + 93
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.addConfigListener(com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener):void");
    }

    public final void addCubeConfigListener(AppConfigListener appConfigListener) {
        int i = 2 % 2;
        int i2 = hashCode + 55;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appConfigListener, "");
        ArrayList<AppConfigListener> arrayList = copydefault;
        Object obj = null;
        if (!arrayList.contains(appConfigListener)) {
            int i4 = equals + 71;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(appConfigListener);
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i6 = hashCode + 85;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void removeConfigListener(AppConfigListener appConfigListener) {
        int i = 2 % 2;
        int i2 = hashCode + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appConfigListener, "");
        component3.remove(appConfigListener);
        int i4 = equals + 35;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void removeCubeConfigListener(AppConfigListener appConfigListener) {
        int i = 2 % 2;
        int i2 = hashCode + 89;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appConfigListener, "");
        copydefault.remove(appConfigListener);
        int i4 = equals + 97;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void goHelp() {
        int i = 2 % 2;
        int i2 = equals + 85;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            RouteUtils.routeWithExecute(SPUtils.getInstance(SP_APP).getString(HELP_URL));
            int i3 = 70 / 0;
        } else {
            RouteUtils.routeWithExecute(SPUtils.getInstance(SP_APP).getString(HELP_URL));
        }
        int i4 = equals + 95;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final IAppConfig getAppConfig() {
        int i = 2 % 2;
        int i2 = equals + 53;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState;
        }
        throw null;
    }

    @Deprecated(message = "use getAppConfig")
    @JvmStatic
    public static final ServiceConfig getServiceConfig() throws Throwable {
        int i = 2 % 2;
        int i2 = hashCode + 95;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ServiceConfig serviceConfig = getAsAtTimestamp;
        if (serviceConfig == null) {
            int pinLimit = ShareDataUIState.getPinLimit();
            int otpLimit = ShareDataUIState.getOtpLimit();
            String phoneNumberRegular = ShareDataUIState.getPhoneNumberRegular();
            Intrinsics.checkNotNullExpressionValue(phoneNumberRegular, "");
            int phoneNumberMaxLength = ShareDataUIState.getPhoneNumberMaxLength();
            String phoneNumberCode = ShareDataUIState.getPhoneNumberCode();
            Intrinsics.checkNotNullExpressionValue(phoneNumberCode, "");
            int biometricPayGuideCountRemind = ShareDataUIState.getBiometricPayGuideCountRemind();
            String symbol = ShareDataUIState.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "");
            String currency = ShareDataUIState.getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "");
            String operatorNameRegular = ShareDataUIState.getOperatorNameRegular();
            Intrinsics.checkNotNullExpressionValue(operatorNameRegular, "");
            serviceConfig = new ServiceConfig(pinLimit, otpLimit, phoneNumberRegular, phoneNumberMaxLength, phoneNumberCode, biometricPayGuideCountRemind, symbol, currency, null, null, operatorNameRegular, null, null, null, null, null, 64256, null);
            int i3 = equals + 97;
            hashCode = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 4;
            }
        }
        int i5 = hashCode + 13;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return serviceConfig;
    }

    public final ServiceConfig getCurrentServiceConfig() {
        ServiceConfig serviceConfig;
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 == 0) {
            serviceConfig = getAsAtTimestamp;
            int i4 = 77 / 0;
        } else {
            serviceConfig = getAsAtTimestamp;
        }
        int i5 = i3 + 45;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return serviceConfig;
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = hashCode + 117;
        equals = i2 % 128;
        int i3 = i2 % 2;
        getBasicConfig((ApiCallback<Object>) null);
        int i4 = equals + 61;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void getBasicConfig(ApiCallback<Object> callback) {
        int i = 2 % 2;
        try {
            List<String> listEmptyList = (List) SecureGsonUtils.fromJson(new JSONObject(AssetsReadUtils.parseFile("basic_config.json")).optString("configTypes"), new TypeToken<List<? extends String>>() {
            }.getType());
            if (listEmptyList == null) {
                int i2 = equals + 31;
                hashCode = i2 % 128;
                int i3 = i2 % 2;
                listEmptyList = CollectionsKt.emptyList();
                int i4 = equals + 77;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
            }
            getBasicConfig(listEmptyList, callback);
        } catch (JSONException unused) {
        }
    }

    public final void getBasicConfig(List<String> configTypeLists) {
        int i = 2 % 2;
        int i2 = equals + 27;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configTypeLists, "");
        getBasicConfig(configTypeLists, null);
        int i4 = equals + 83;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/huawei/digitalpayment/consumer/baselib/config/AppConfigManager$getBasicConfig$1", "Lcom/huawei/common/listener/ApiCallback;", "", "onSuccess", "", "value", "saveConfig", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements ApiCallback<Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        final ApiCallback<Object> component1;

        AnonymousClass1(ApiCallback<Object> apiCallback) {
            this.component1 = apiCallback;
        }

        public static final void access$saveConfig(AnonymousClass1 anonymousClass1, Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass1.copydefault(obj);
            int i4 = copydefault + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override
        public void onSuccess(final Object value) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(value, "");
            L.d(AppConfigManager.component1, "basicConfig onSuccess: " + GsonUtils.toJson(AppConfigManager.INSTANCE.getAppConfigListeners()));
            try {
                ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object doInBackground() {
                        int i2 = 2 % 2;
                        int i3 = copydefault + 97;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                        Void voidDoInBackground = doInBackground();
                        int i5 = component3 + 53;
                        copydefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            return voidDoInBackground;
                        }
                        throw null;
                    }

                    @Override
                    public void onSuccess(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = copydefault + 9;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                        onSuccess((Void) obj);
                        if (i4 != 0) {
                            int i5 = 38 / 0;
                        }
                        int i6 = copydefault + 69;
                        component3 = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override
                    public Void doInBackground() {
                        int i2 = 2 % 2;
                        int i3 = copydefault + 67;
                        component3 = i3 % 128;
                        if (i3 % 2 == 0) {
                            AppConfigManager.AnonymousClass1.access$saveConfig(this.ShareDataUIState, value);
                            return null;
                        }
                        AppConfigManager.AnonymousClass1.access$saveConfig(this.ShareDataUIState, value);
                        throw null;
                    }

                    public void onSuccess(Void result) {
                        int i2 = 2 % 2;
                        int i3 = component3 + 79;
                        copydefault = i3 % 128;
                        if (i3 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
            } catch (Exception unused) {
            }
            Iterator<AppConfigListener> it = AppConfigManager.INSTANCE.getAppConfigListeners().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                AppConfigListener next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                AppConfigListener appConfigListener = next;
                L.d(AppConfigManager.component1, "appConfigListener: " + appConfigListener);
                try {
                    appConfigListener.onAppConfig(value);
                    int i2 = copydefault + 109;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    L.e(AppConfigManager.component1, appConfigListener + ": onAppConfig error " + e.getMessage());
                }
            }
            SPUtils.getInstance().put(SPConstant.KEY_BASIC_CONFIG_SUCCESS, true, true);
            ApiCallback<Object> apiCallback = this.component1;
            if (apiCallback != null) {
                int i4 = copydefault + 83;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                apiCallback.onSuccess(value);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private final void copydefault(Object obj) {
            int i = 2 % 2;
            JSONObject jSONObject = new JSONObject(obj.toString());
            AppConfigManager.access$updateColorConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.INSTANCE.updateServiceConfig(jSONObject);
            AppConfigManager.access$updateFaqAndHelp(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateSessionTime(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateStartPageConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateMiniAppCashOutConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateAppMerchantConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateMiniAppCashInConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateSupportCurrencyList(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.INSTANCE.setLanguage(jSONObject);
            AppConfigManager.access$setLoginPriority(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$setPayPriority(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$setliveAuthConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$setAndoridEventConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$updateMerchantAppIdConfig(AppConfigManager.INSTANCE, jSONObject);
            AppConfigManager.access$saveConfig(AppConfigManager.INSTANCE, "ExecuteConfig", jSONObject);
            AppConfigManager.access$saveConfig(AppConfigManager.INSTANCE, SPConstant.KEY_WALLET_BANK_CONFIG, jSONObject);
            AppConfigManager.access$updateExecuteConfig(AppConfigManager.INSTANCE);
            AppConfigManager.access$saveConfig(AppConfigManager.INSTANCE, SPConstant.KEY_SWITCH_PARAMETER_CONFIG, jSONObject);
            AppConfigManager.access$saveConfig(AppConfigManager.INSTANCE, "errorMessageEnhance", jSONObject);
            AppRouteConfigUtils.INSTANCE.upDataRouteConfig(jSONObject);
            MultiLanguageManager.INSTANCE.onConfigFetched(jSONObject);
            AppConfigManager.access$setSecurityConfig(AppConfigManager.INSTANCE, jSONObject);
            int i2 = copydefault + 119;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 87 / 0;
            }
        }

        @Override
        public void onError(BaseException e) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(e, "");
            super.onError(e);
            ApiCallback<Object> apiCallback = this.component1;
            if (apiCallback != null) {
                int i2 = copydefault + 87;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                apiCallback.onError(e);
                if (i3 != 0) {
                    int i4 = 38 / 0;
                }
                int i5 = ShareDataUIState + 11;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public final void getBasicConfig(List<String> configTypeLists, ApiCallback<Object> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(configTypeLists, "");
        try {
            new BasicConfigRepository(AppRouteConfigUtils.INSTANCE.addAppRouteConfig(CollectionsKt.toMutableList((Collection) configTypeLists))).sendRequest(new AnonymousClass1(callback));
            int i2 = hashCode + 105;
            equals = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
        int i4 = equals + 83;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    private final void hashCode(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = jSONObject.optString(SPConstant.SUPPORT_CURRENCY_LIST);
        SPUtils.getInstance().put(SPConstant.SUPPORT_CURRENCY_LIST, strOptString);
        CurrencyConfigManager currencyConfigManager = CurrencyConfigManager.INSTANCE;
        Intrinsics.checkNotNull(strOptString);
        currencyConfigManager.updateCurrencyConfig(strOptString);
        int i4 = hashCode + 79;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    private final void ShareDataUIState(String str, JSONObject jSONObject) {
        Object objOpt;
        int i = 2 % 2;
        int i2 = hashCode + 89;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            objOpt = jSONObject.opt(str);
            int i3 = 28 / 0;
            if (objOpt == null) {
                return;
            }
        } else {
            objOpt = jSONObject.opt(str);
            if (objOpt == null) {
                return;
            }
        }
        if (objOpt.toString().length() > 0) {
            int i4 = hashCode + 67;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                SPUtils.getInstance(SP_APP).put(str, objOpt.toString());
                return;
            }
            SPUtils.getInstance(SP_APP).put(str, objOpt.toString());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static Object copydefault(Object[] objArr) {
        JSONObject jSONObject = (JSONObject) objArr[1];
        int i = 2 % 2;
        int i2 = equals + 1;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (jSONObject == null) {
            int i4 = i3 + 21;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        String strOptString = jSONObject.optString(KeysConstants.KEY_SECURITY_CONFIG, "");
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() == 0) {
            return null;
        }
        getRequestBeneficiariesState = (SecurityConfig) GsonUtils.fromJson(strOptString, SecurityConfig.class);
        return null;
    }

    private final void copydefault() {
        Map<? extends String, ? extends JsonObject> map;
        int i = 2 % 2;
        String string = SPUtils.getInstance(SP_APP).getString("ExecuteConfig");
        L.d(component1, "updateExecuteConfig: " + string);
        Intrinsics.checkNotNull(string);
        if (string.length() <= 0 || (map = (Map) SecureGsonUtils.fromJson(string, new TypeToken<Map<String, ? extends JsonObject>>() {
        }.getType())) == null) {
            return;
        }
        int i2 = equals + 93;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            component2.putAll(map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        component2.putAll(map);
        int i3 = equals + 113;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
    }

    public final JsonObject getExecuteConfigByKey(String key) {
        int i = 2 % 2;
        int i2 = equals + 123;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        JsonObject jsonObject = component2.get(key);
        int i4 = hashCode + 29;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return jsonObject;
    }

    private final void component2(JSONObject jSONObject) {
        String strOptString;
        int i = 2 % 2;
        int i2 = hashCode + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("priorityConfig");
        if (jSONObjectOptJSONObject != null) {
            strOptString = jSONObjectOptJSONObject.optString(SPConstant.PRIORITY_LOGIN);
        } else {
            int i4 = equals + 97;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            strOptString = null;
        }
        L.d(component1, "loginPriority: " + strOptString);
        SPUtils.getInstance(SP_APP).put(SPConstant.PRIORITY_LOGIN, strOptString);
    }

    private final void component3(JSONObject jSONObject) {
        int i = 2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("priorityConfig");
        String strOptString = null;
        if (jSONObjectOptJSONObject != null) {
            int i2 = equals + 13;
            hashCode = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObjectOptJSONObject.optString(SPConstant.PRIORITY_PAY);
                strOptString.hashCode();
                throw null;
            }
            strOptString = jSONObjectOptJSONObject.optString(SPConstant.PRIORITY_PAY);
        } else {
            int i3 = hashCode + 105;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        L.d(component1, "payPriority: " + strOptString);
        SPUtils.getInstance(SP_APP).put(SPConstant.PRIORITY_PAY, strOptString);
    }

    private final void ShareDataUIState(JSONObject jSONObject) {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = equals + 55;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObject.optJSONObject("liveAuthConfig");
            throw null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("liveAuthConfig");
        if (jSONObjectOptJSONObject != null) {
            boolValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(SPConstant.IS_OPEN_LIVE_AUTH, false));
            int i3 = equals + 79;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        } else {
            boolValueOf = null;
        }
        Boolean boolValueOf2 = jSONObjectOptJSONObject != null ? Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(SPConstant.IS_OPEN_OCR, false)) : null;
        L.d(component1, "liveAuthConfig: " + jSONObjectOptJSONObject);
        if (boolValueOf != null) {
            int i5 = equals + 101;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            SPUtils.getInstance(SP_APP).put(SPConstant.IS_OPEN_LIVE_AUTH, boolValueOf.booleanValue());
        }
        if (boolValueOf2 != null) {
            SPUtils.getInstance(SP_APP).put(SPConstant.IS_OPEN_OCR, boolValueOf2.booleanValue());
        }
    }

    private final void copydefault(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = equals + 85;
        hashCode = i2 % 128;
        String strOptString = null;
        if (i2 % 2 != 0) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SPConstant.ANDROID_EVENT_CONFIG);
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("event_ids");
                int i3 = hashCode + 79;
                equals = i3 % 128;
                int i4 = i3 % 2;
            }
            L.d(component1, "AndoridEventConfig: " + strOptString);
            SPUtils.getInstance(SP_APP).put(SPConstant.ANDROID_EVENT_CONFIG, strOptString);
            return;
        }
        jSONObject.optJSONObject(SPConstant.ANDROID_EVENT_CONFIG);
        throw null;
    }

    private final void getRequestBeneficiariesState(JSONObject jSONObject) {
        int i = 2 % 2;
        String strOptString = jSONObject.optString(MERCHANT_APP_ID_CONFIG);
        L.d(component1, "merchantAppIdConfig: " + strOptString);
        SPUtils.getInstance(SP_APP).put(MERCHANT_APP_ID_CONFIG, strOptString);
        int i2 = equals + 89;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void getSponsorBeneficiariesState(JSONObject jSONObject) {
        int i = 2 % 2;
        String strOptString = jSONObject.optString(SESSION_TIME_OUT_SECOND);
        L.d(component1, "sessionTimeoutSecond: " + strOptString);
        SPUtils.getInstance(SP_APP).put(SESSION_TIME_OUT_SECOND, strOptString);
        int i2 = equals + 81;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLanguage(JSONObject json) {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(json, "");
            LanguageUtils.getInstance().setLanguageConfig(json.optString("languageBeanList"));
        } else {
            Intrinsics.checkNotNullParameter(json, "");
            LanguageUtils.getInstance().setLanguageConfig(json.optString("languageBeanList"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void getAsAtTimestamp(JSONObject jSONObject) {
        String string;
        int i = 2 % 2;
        String file = AssetsReadUtils.parseFile("colorConfig.json");
        String str = file;
        if (str != null && str.length() != 0) {
            ColorConfigManager.updateColor$default(ColorConfigManager.INSTANCE, file, false, false, 6, null);
            int i2 = equals + 1;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("colorConfig");
        ColorConfigManager colorConfigManager = ColorConfigManager.INSTANCE;
        if (jSONObjectOptJSONObject != null) {
            string = jSONObjectOptJSONObject.toString();
            int i4 = equals + 15;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = null;
        }
        ColorConfigManager.updateColor$default(colorConfigManager, string, false, false, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void copy(org.json.JSONObject r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode = r2
            int r1 = r1 % r0
            java.lang.String r2 = "staticPageUrl"
            java.lang.String r3 = "sp_app"
            if (r1 == 0) goto L68
            org.json.JSONObject r7 = r7.optJSONObject(r2)
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance(r3)
            java.lang.String r2 = ""
            if (r7 == 0) goto L3e
            int r4 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals
            int r4 = r4 + 99
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode = r5
            int r4 = r4 % r0
            java.lang.String r5 = "FAQUrl"
            if (r4 != 0) goto L38
            java.lang.String r4 = r7.optString(r5)
            r5 = 65
            int r5 = r5 / 0
            if (r4 != 0) goto L3f
            goto L3e
        L38:
            java.lang.String r4 = r7.optString(r5)
            if (r4 != 0) goto L3f
        L3e:
            r4 = r2
        L3f:
            java.lang.String r5 = "faqUrl"
            r1.put(r5, r4)
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance(r3)
            java.lang.String r3 = "helpUrl"
            if (r7 == 0) goto L64
            java.lang.String r7 = r7.optString(r3)
            if (r7 != 0) goto L63
            int r7 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode
            int r7 = r7 + 39
            int r4 = r7 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals = r4
            int r7 = r7 % r0
            int r4 = r4 + 19
            int r7 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode = r7
            int r4 = r4 % r0
            goto L64
        L63:
            r2 = r7
        L64:
            r1.put(r3, r2)
            return
        L68:
            r7.optJSONObject(r2)
            com.huawei.common.util.SPUtils.getInstance(r3)
            r7 = 0
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.copy(org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateServiceConfig(org.json.JSONObject r24) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.updateServiceConfig(org.json.JSONObject):void");
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = hashCode + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        getConfigVerify(null);
        int i4 = equals + 97;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void getConfigVerify(final ApiCallback<JSONObject> callback) {
        int i = 2 % 2;
        new ConfigVerifyRepository().sendRequest(new ApiCallback<Object>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(Object value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                JSONObject jSONObject = new JSONObject(GsonUtils.toJson(value));
                try {
                    SPUtils.getInstance().put(SPConstant.TERMS_VERSION, jSONObject.optString("newestTermsVersion"));
                    SPUtils.getInstance().put(SPConstant.REGISTER_TERMS_VERSION, jSONObject.optString("registerTermsVersion"));
                    SPUtils.getInstance().put(SPConstant.TERMS_URL, jSONObject.optString("newestTermsUrl"));
                    SPUtils.getInstance().put(SPConstant.PRIVACY_URL, jSONObject.optString("privacyPolicy"));
                    SPUtils.getInstance().put(SPConstant.BINDCARD_TERMS_URL, jSONObject.optString("bindCardTermsUrl"));
                    SPUtils.getInstance().put(SPConstant.OD_TERMS_URL, jSONObject.optString("odTermsUrl"));
                    SPUtils.getInstance().put(SPConstant.BNPL_TERMS_URL, jSONObject.optString("bnplTermsUrl"));
                    SPUtils.getInstance().put(SPConstant.REGISTER_TERMS_URL, jSONObject.optString("registerTermsUrl"));
                    int i3 = component2 + 73;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    L.e(AppConfigManager.component1, "getConfigVerify Exception: " + e.getMessage());
                }
                component3(jSONObject);
                ApiCallback<JSONObject> apiCallback = callback;
                if (apiCallback != null) {
                    apiCallback.onSuccess(jSONObject);
                }
                int i5 = component2 + 61;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final void component3(org.json.JSONObject r12) {
                /*
                    Method dump skipped, instruction units count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.C08201.component3(org.json.JSONObject):void");
            }

            @Override
            public void onError(BaseException e) {
                ApiCallback<JSONObject> apiCallback;
                int i2 = 2 % 2;
                int i3 = component1 + 111;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    apiCallback = callback;
                    int i4 = 42 / 0;
                    if (apiCallback == null) {
                        return;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    apiCallback = callback;
                    if (apiCallback == null) {
                        return;
                    }
                }
                int i5 = component2 + 37;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                apiCallback.onError(e);
                if (i6 == 0) {
                    int i7 = 19 / 0;
                }
            }
        });
        int i2 = equals + 41;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void ArtificialStackFrames(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = hashCode + 5;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            SPUtils.getInstance().put(SPConstant.START_PAGE_CONFIG, jSONObject.optString(SPConstant.START_PAGE_CONFIG, ""));
            int i3 = hashCode + 65;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        SPUtils.getInstance().put(SPConstant.START_PAGE_CONFIG, jSONObject.optString(SPConstant.START_PAGE_CONFIG, ""));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object component1(java.lang.Object[] r5) {
        /*
            java.lang.String r0 = "miniAppCashOutConfig"
            r1 = 0
            r1 = r5[r1]
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager r1 = (com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager) r1
            r1 = 1
            r5 = r5[r1]
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            r1 = 2
            int r2 = r1 % r1
            org.json.JSONObject r5 = r5.optJSONObject(r0)
            com.huawei.common.util.SPUtils r2 = com.huawei.common.util.SPUtils.getInstance()
            if (r5 == 0) goto L2a
            int r3 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode
            int r3 = r3 + 101
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals = r4
            int r3 = r3 % r1
            java.lang.String r3 = "miniAppCashOutUrl"
            java.lang.String r5 = r5.optString(r3)
            if (r5 != 0) goto L2c
        L2a:
            java.lang.String r5 = ""
        L2c:
            r2.put(r0, r5)
            int r5 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.hashCode
            int r5 = r5 + 65
            int r0 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.equals = r0
            int r5 = r5 % r1
            r0 = 0
            if (r5 != 0) goto L3c
            return r0
        L3c:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.component1(java.lang.Object[]):java.lang.Object");
    }

    private final void equals(JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        int i = 2 % 2;
        int i2 = equals + 1;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SPConstant.CONFIG_TYPE_DEDUCTION_CONFIG);
            SPUtils sPUtils = SPUtils.getInstance();
            String str = "";
            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString(KeysConstants.KEY_DEDUCTION_MERCHANT_URL)) == null) {
                strOptString = "";
            }
            sPUtils.put(SPConstant.CONFIG_TYPE_DEDUCTION_CONFIG, strOptString);
            SPUtils sPUtils2 = SPUtils.getInstance();
            if (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString(KeysConstants.KEY_DEREGISTER_MERCHANT_URL)) == null) {
                strOptString2 = "";
            }
            sPUtils2.put(KeysConstants.KEY_DEREGISTER_MERCHANT_URL, strOptString2);
            SPUtils sPUtils3 = SPUtils.getInstance();
            if (jSONObjectOptJSONObject != null) {
                String strOptString3 = jSONObjectOptJSONObject.optString(KeysConstants.KEY_FEED_BACK_URL);
                if (strOptString3 == null) {
                    int i3 = equals + 107;
                    hashCode = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    str = strOptString3;
                }
            }
            sPUtils3.put(KeysConstants.KEY_FEED_BACK_URL_KEY, str);
            return;
        }
        jSONObject.optJSONObject(SPConstant.CONFIG_TYPE_DEDUCTION_CONFIG);
        SPUtils.getInstance();
        throw null;
    }

    private final void component4(JSONObject jSONObject) {
        String strOptString;
        int i = 2 % 2;
        int i2 = hashCode + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SPConstant.MINIAPP_CASH_IN_URL);
        SPUtils sPUtils = SPUtils.getInstance();
        if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString(KeysConstants.KEY_CASHIN_MINIAPP_URL)) == null) {
            strOptString = "";
            int i4 = hashCode + 107;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        sPUtils.put(SPConstant.MINIAPP_CASH_IN_URL, strOptString);
    }

    private final void component2() {
        int iComponent1 = Event.AnonymousClass1.component1();
        component1(-1449892683, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{this}, iComponent1, 1449892685);
    }

    private final void component1(JSONObject jSONObject) {
        int iComponent1 = Event.AnonymousClass1.component1();
        component1(-553607866, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{this, jSONObject}, iComponent1, 553607866);
    }

    private final void getShareableDataState(JSONObject jSONObject) {
        int iComponent1 = Event.AnonymousClass1.component1();
        component1(-1679020712, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), new Object[]{this, jSONObject}, iComponent1, 1679020713);
    }
}
