package com.huawei.digitalpayment.consumer.loginModule.util;

import com.blankj.utilcode.util.ThreadUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import com.iap.ac.config.lite.ConfigMerger;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/util/VerifyTypeHelper;", "", "<init>", "()V", "KEY_CHANGE_PIN", "", "KEY_RESET_PIN", Keys.VERIFY_TYPE, "", "", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyType;", "fetchConfig", "", "getVerifyTypeList", "key", "updateConfig", ConfigMerger.COMMON_CONFIG_SECTION, "getConfig", "saveConfig", "getKey", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyTypeHelper {
    public static final VerifyTypeHelper INSTANCE = new VerifyTypeHelper();
    public static final String KEY_CHANGE_PIN = "ChangePin";
    public static final String KEY_RESET_PIN = "ResetPin";
    private static int ShareDataUIState = 1;
    private static Map<String, ? extends List<VerifyType>> component1 = null;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    private VerifyTypeHelper() {
    }

    public static final String access$getConfig(VerifyTypeHelper verifyTypeHelper) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return verifyTypeHelper.component2();
        }
        verifyTypeHelper.component2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public Object doInBackground() throws Throwable {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 45;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Void voidDoInBackground = doInBackground();
                if (i3 == 0) {
                    int i4 = 94 / 0;
                }
                return voidDoInBackground;
            }

            @Override
            public void onSuccess(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 59;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                onSuccess((Void) obj);
                if (i3 != 0) {
                    int i4 = 75 / 0;
                }
                int i5 = ShareDataUIState + 77;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public Void doInBackground() throws Throwable {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 21;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                VerifyTypeHelper.INSTANCE.updateConfig(VerifyTypeHelper.access$getConfig(VerifyTypeHelper.INSTANCE));
                int i4 = component1 + 9;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }

            public void onSuccess(Void result) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 9;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i = ShareDataUIState + 25;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public final void fetchConfig() {
        int i = 2 % 2;
        BasicConfigRepository basicConfigRepository = new BasicConfigRepository(CollectionsKt.listOf(SPConstant.KEY_VERIFY_TYPE_CONFIG));
        basicConfigRepository.addParams("initiatorMsisdn", SPUtils.getInstance().getString("recent_login_phone_number"));
        basicConfigRepository.sendRequest(new ApiCallback<Object>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Object value) {
                int i2 = 2 % 2;
                try {
                    VerifyTypeHelper.INSTANCE.updateConfig(new JSONObject(String.valueOf(value)).optString(SPConstant.KEY_VERIFY_TYPE_CONFIG));
                    int i3 = component3 + 125;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 2 / 2;
                    }
                } catch (Exception e) {
                    L.d(e.getMessage());
                }
                int i5 = ShareDataUIState + 89;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 23 / 0;
                }
            }
        });
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = r1.get(r4);
        r1 = com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.component2 + 51;
        com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType> getVerifyTypeList(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.component2
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.copydefault = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.util.Map<java.lang.String, ? extends java.util.List<com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType>> r1 = com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.component1
            r2 = 87
            int r2 = r2 / 0
            if (r1 == 0) goto L33
            goto L23
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.util.Map<java.lang.String, ? extends java.util.List<com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType>> r1 = com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.component1
            if (r1 == 0) goto L33
        L23:
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r1 = com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.component2
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.copydefault = r2
            int r1 = r1 % r0
            goto L34
        L33:
            r4 = 0
        L34:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.util.VerifyTypeHelper.getVerifyTypeList(java.lang.String):java.util.List");
    }

    public final void updateConfig(String config) {
        int i = 2 % 2;
        component2(config);
        String str = config;
        if (str != null) {
            int i2 = copydefault + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                component1 = (Map) SecureGsonUtils.fromJson(config, new TypeToken<Map<String, ? extends List<? extends VerifyType>>>() {
                }.getType());
                return;
            }
        }
        component1 = null;
        int i4 = copydefault + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            SPUtils.getInstance().getString(ShareDataUIState());
            obj.hashCode();
            throw null;
        }
        String string = SPUtils.getInstance().getString(ShareDataUIState());
        int i3 = copydefault + 93;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private final void component2(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance().put(ShareDataUIState(), str);
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String ShareDataUIState() {
        int i = 2 % 2;
        String str = SPConstant.KEY_VERIFY_TYPE_CONFIG + SPUtils.getInstance().getString("recent_login_phone_number");
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return str;
    }
}
