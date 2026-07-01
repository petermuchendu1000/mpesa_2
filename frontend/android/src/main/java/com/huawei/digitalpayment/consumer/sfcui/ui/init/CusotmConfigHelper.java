package com.huawei.digitalpayment.consumer.sfcui.ui.init;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.base.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigListener;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J'\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\nj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R<\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u0001`\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/init/CusotmConfigHelper;", "", "<init>", "()V", "DEFAULT_ATM_CODE_TIME", "", "DEFAULT_MAX_SEND_COUNT", "chargeConfigMap", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "getChargeConfigMap", "()Ljava/util/HashMap;", "setChargeConfigMap", "(Ljava/util/HashMap;)V", "Ljava/util/HashMap;", "initConfig", "", "parseWithdrawChargeConfig", "obj", "parseCustomParameterLimits", "getAtmCodeTime", "getMultiMaxSendCount", "getChargeConfigMaps", "cacluteWithdrawCharge", "amout", "", "getWithdrawCharge", "value", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CusotmConfigHelper {
    public static final int DEFAULT_ATM_CODE_TIME = 240;
    public static final int DEFAULT_MAX_SEND_COUNT = 5;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static HashMap<String, String> component3 = null;
    private static int copydefault = 1;
    public static final CusotmConfigHelper INSTANCE = new CusotmConfigHelper();
    public static final int $stable = 8;

    private CusotmConfigHelper() {
    }

    public final HashMap<String, String> getChargeConfigMap() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setChargeConfigMap(HashMap<String, String> map) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component3 = map;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void initConfig() {
        int i = 2 % 2;
        AppConfigManager.INSTANCE.addConfigListener(new AppConfigListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onAppConfig(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 71;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                CusotmConfigHelper.$r8$lambda$NCYuHbyGC8MRyoDr7WDevxw8aEA(obj);
                if (i4 == 0) {
                    int i5 = 89 / 0;
                }
            }
        });
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void copydefault(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CusotmConfigHelper cusotmConfigHelper = INSTANCE;
        Intrinsics.checkNotNull(obj);
        cusotmConfigHelper.parseWithdrawChargeConfig(obj);
        cusotmConfigHelper.parseCustomParameterLimits(obj);
        int i4 = component2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    public final void parseWithdrawChargeConfig(Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JSONObject jSONObjectOptJSONObject = new JSONObject(obj.toString()).optJSONObject(SPConstant.WITHDRAW_CHARGE_CONFIG);
        if (jSONObjectOptJSONObject != null) {
            component3 = (HashMap) SecureGsonUtils.fromJson(jSONObjectOptJSONObject.toString(), new TypeToken<HashMap<String, String>>() {
            }.getType());
            SPUtils.getInstance().put(SPConstant.WITHDRAW_CHARGE_CONFIG, jSONObjectOptJSONObject.toString());
            int i2 = copydefault + 77;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 5;
            }
        }
    }

    public final void parseCustomParameterLimits(Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JSONObject jSONObjectOptJSONObject = new JSONObject(obj.toString()).optJSONObject(SPConstant.CUSTOM_PARAMETER_LIMITS);
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        if (jSONObjectOptJSONObject.has(SPConstant.ATM_CODE_TIME)) {
            SPUtils.getInstance().put(SPConstant.ATM_CODE_TIME, jSONObjectOptJSONObject.optInt(SPConstant.ATM_CODE_TIME));
        }
        if (jSONObjectOptJSONObject.has(SPConstant.MULTI_SEND_COUNT)) {
            int i2 = component2 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SPUtils.getInstance().put(SPConstant.MULTI_SEND_COUNT, jSONObjectOptJSONObject.optInt(SPConstant.MULTI_SEND_COUNT));
            int i4 = copydefault + 95;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final int getAtmCodeTime() {
        SPUtils sPUtils;
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 113;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            sPUtils = SPUtils.getInstance();
            i = 9301;
        } else {
            sPUtils = SPUtils.getInstance();
            i = 240;
        }
        return sPUtils.getInt(SPConstant.ATM_CODE_TIME, i);
    }

    public final int getMultiMaxSendCount() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = SPUtils.getInstance().getInt(SPConstant.MULTI_SEND_COUNT, 5);
        int i5 = copydefault + 49;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final HashMap<String, String> getChargeConfigMaps() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        HashMap<String, String> map = component3;
        if (map != null) {
            int i4 = i2 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNull(map);
            return map;
        }
        String string = SPUtils.getInstance().getString(SPConstant.WITHDRAW_CHARGE_CONFIG);
        if (TextUtils.isEmpty(string)) {
            HashMap<String, String> map2 = new HashMap<>();
            int i6 = component2 + 3;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return map2;
        }
        HashMap<String, String> map3 = (HashMap) SecureGsonUtils.fromJson(string, new TypeToken<HashMap<String, String>>() {
        }.getType());
        component3 = map3;
        if (map3 == null) {
            return new HashMap<>();
        }
        Intrinsics.checkNotNull(map3);
        return map3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String cacluteWithdrawCharge(float r15) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.init.CusotmConfigHelper.cacluteWithdrawCharge(float):java.lang.String");
    }

    public final String getWithdrawCharge(float amout, String value) {
        int i = 2 % 2;
        String str = value;
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.checkNotNull(value);
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "%", false, 2, (Object) null)) {
                return value;
            }
            String string = new BigDecimal(String.valueOf(amout)).multiply(new BigDecimal((String) StringsKt.split$default((CharSequence) str, new String[]{"%"}, false, 0, 6, (Object) null).get(0))).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i2 = component2 + 69;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        }
        int i3 = copydefault + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return "0";
    }

    public static void $r8$lambda$NCYuHbyGC8MRyoDr7WDevxw8aEA(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        copydefault(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = copydefault + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = ShareDataUIState + 59;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }
}
