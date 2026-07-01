package com.huawei.digitalpayment.consumer.basic.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.model.LoginInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.util.LoginUtils;
import com.huawei.digitalpayment.consumer.loginModule.util.ModelMappingUtils;
import com.huawei.http.convert.BaseDataConvertAdapter;
import com.huawei.http.convert.DataConvertManager;
import com.safaricom.mpesa.logging.L;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/util/ConvertorManager;", "", "<init>", "()V", "addConvertor", "", "addAutoLoginConvertor", "addBiometricLoginConvertor", "addLoginConvertor", "addPinLoginConvertor", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertorManager {
    public static final int $stable = 0;
    public static final ConvertorManager INSTANCE = new ConvertorManager();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private ConvertorManager() {
    }

    public void addConvertor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        addAutoLoginConvertor();
        addBiometricLoginConvertor();
        addLoginConvertor();
        addPinLoginConvertor();
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void addAutoLoginConvertor() {
        int i = 2 % 2;
        DataConvertManager.addConvertAdapter(new BaseDataConvertAdapter() {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[PHI: r4
  0x0062: PHI (r4v6 com.google.gson.JsonElement) = (r4v5 com.google.gson.JsonElement), (r4v19 com.google.gson.JsonElement) binds: [B:13:0x0060, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object transfer(com.google.gson.JsonObject r11) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.util.ConvertorManager.AnonymousClass1.transfer(com.google.gson.JsonObject):java.lang.Object");
            }

            @Override
            public String path() {
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 5;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "autoLogin";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public String redirectPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 111;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 5;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return "autoLogin";
            }
        });
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void addBiometricLoginConvertor() {
        int i = 2 % 2;
        DataConvertManager.addConvertAdapter(new BaseDataConvertAdapter() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public Object transfer(JsonObject original) {
                int i2 = 2 % 2;
                int i3 = copydefault + 31;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(original, "");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(original, "");
                LoginInfoRemote loginInfoRemote = (LoginInfoRemote) SecureGsonUtils.fromJson(original.toString(), LoginInfoRemote.class);
                if (loginInfoRemote == null) {
                    loginInfoRemote = new LoginInfoRemote();
                }
                LoginUtils.saveIdentityId(original);
                JsonElement jsonElement = original.get("personalisedConfig");
                L.INSTANCE.e("personalisedConfig " + jsonElement, new Object[0]);
                if (jsonElement == null) {
                    LocalLoginInfo localLoginInfo = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, original.toString());
                    Intrinsics.checkNotNullExpressionValue(localLoginInfo, "");
                    return localLoginInfo;
                }
                int i4 = component1 + 89;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    jsonElement.getAsJsonObject().get("isFirstLogin");
                    obj.hashCode();
                    throw null;
                }
                JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("isFirstLogin");
                Boolean boolValueOf = jsonElement2 != null ? Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                JsonElement jsonElement3 = jsonElement.getAsJsonObject().get("isChild");
                Boolean boolValueOf2 = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                HashMap map = new HashMap();
                map.put("isFirstLogin", Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false));
                map.put("isChild", Boolean.valueOf(boolValueOf2 != null ? boolValueOf2.booleanValue() : false));
                loginInfoRemote.setExtension(map);
                LocalLoginInfo localLoginInfo2 = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, original.toString());
                Intrinsics.checkNotNullExpressionValue(localLoginInfo2, "");
                int i5 = copydefault + 81;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return localLoginInfo2;
                }
                throw null;
            }

            @Override
            public String path() {
                int i2 = 2 % 2;
                int i3 = copydefault + 49;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "biometricLogin";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public String redirectPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 113;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return "biometricLogin";
            }
        });
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    public void addLoginConvertor() {
        int i = 2 % 2;
        DataConvertManager.addConvertAdapter(new BaseDataConvertAdapter() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public Object transfer(JsonObject original) {
                Boolean boolValueOf;
                boolean zBooleanValue;
                int i2 = 2 % 2;
                int i3 = component2 + 45;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(original, "");
                LoginInfoRemote loginInfoRemote = (LoginInfoRemote) SecureGsonUtils.fromJson(original.toString(), LoginInfoRemote.class);
                if (loginInfoRemote == null) {
                    loginInfoRemote = new LoginInfoRemote();
                }
                LoginUtils.saveIdentityId(original);
                JsonElement jsonElement = original.get("personalisedConfig");
                boolean zBooleanValue2 = false;
                L.INSTANCE.e("personalisedConfig " + jsonElement, new Object[0]);
                if (jsonElement == null) {
                    LocalLoginInfo localLoginInfo = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, original.toString());
                    Intrinsics.checkNotNullExpressionValue(localLoginInfo, "");
                    return localLoginInfo;
                }
                JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("isFirstLogin");
                Boolean boolValueOf2 = null;
                if (jsonElement2 != null) {
                    int i5 = copydefault + 19;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    boolValueOf = Boolean.valueOf(jsonElement2.getAsBoolean());
                } else {
                    int i7 = component2 + 115;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    boolValueOf = null;
                }
                JsonElement jsonElement3 = jsonElement.getAsJsonObject().get("isChild");
                if (jsonElement3 != null) {
                    int i9 = component2 + 125;
                    copydefault = i9 % 128;
                    int i10 = i9 % 2;
                    boolValueOf2 = Boolean.valueOf(jsonElement3.getAsBoolean());
                    int i11 = component2 + 125;
                    copydefault = i11 % 128;
                    int i12 = i11 % 2;
                }
                HashMap map = new HashMap();
                if (boolValueOf != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                    int i13 = component2 + 117;
                    copydefault = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    zBooleanValue = false;
                }
                map.put("isFirstLogin", Boolean.valueOf(zBooleanValue));
                if (boolValueOf2 != null) {
                    int i15 = component2 + 11;
                    copydefault = i15 % 128;
                    int i16 = i15 % 2;
                    zBooleanValue2 = boolValueOf2.booleanValue();
                }
                map.put("isChild", Boolean.valueOf(zBooleanValue2));
                loginInfoRemote.setExtension(map);
                LocalLoginInfo localLoginInfo2 = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, original.toString());
                Intrinsics.checkNotNullExpressionValue(localLoginInfo2, "");
                return localLoginInfo2;
            }

            @Override
            public String path() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 113;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 105;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "login";
            }

            @Override
            public String redirectPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 9;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 57;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return "login";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void addPinLoginConvertor() {
        int i = 2 % 2;
        DataConvertManager.addConvertAdapter(new BaseDataConvertAdapter() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public Object transfer(JsonObject original) {
                Boolean boolValueOf;
                int i2 = 2 % 2;
                int i3 = component2 + 101;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(original, "");
                LoginInfoRemote loginInfoRemote = (LoginInfoRemote) SecureGsonUtils.fromJson(original.toString(), LoginInfoRemote.class);
                if (loginInfoRemote == null) {
                    loginInfoRemote = new LoginInfoRemote();
                }
                LoginUtils.saveIdentityId(original);
                JsonElement jsonElement = original.get("personalisedConfig");
                L.INSTANCE.e("personalisedConfig " + jsonElement, new Object[0]);
                if (jsonElement == null) {
                    LocalLoginInfo localLoginInfo = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, original.toString());
                    Intrinsics.checkNotNullExpressionValue(localLoginInfo, "");
                    int i5 = component2 + 7;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    return localLoginInfo;
                }
                JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("isFirstLogin");
                if (jsonElement2 != null) {
                    int i7 = ShareDataUIState + 117;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    boolValueOf = Boolean.valueOf(jsonElement2.getAsBoolean());
                } else {
                    boolValueOf = null;
                }
                JsonElement jsonElement3 = jsonElement.getAsJsonObject().get("isChild");
                Boolean boolValueOf2 = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                HashMap map = new HashMap();
                map.put("isFirstLogin", Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false));
                map.put("isChild", Boolean.valueOf(boolValueOf2 != null ? boolValueOf2.booleanValue() : false));
                loginInfoRemote.setExtension(map);
                LocalLoginInfo localLoginInfo2 = ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, original.toString());
                Intrinsics.checkNotNullExpressionValue(localLoginInfo2, "");
                return localLoginInfo2;
            }

            @Override
            public String path() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                int i4 = i3 % 128;
                component2 = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 83;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return "pin/login";
            }

            @Override
            public String redirectPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 117;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 15 / 0;
                }
                int i6 = i3 + 119;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "pin/login";
            }
        });
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = component2 + 55;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
