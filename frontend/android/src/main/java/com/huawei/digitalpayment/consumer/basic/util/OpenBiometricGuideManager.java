package com.huawei.digitalpayment.consumer.basic.util;

import com.huawei.biometric.model.BiometricType;
import com.huawei.common.listener.ApiCallback;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/util/OpenBiometricGuideManager;", "", "<init>", "()V", "biometricType", "Lcom/huawei/biometric/model/BiometricType;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "setBiometricTypeAndCallback", "", "type", "getBiometricType", "getCallback", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenBiometricGuideManager {
    private static BiometricType ShareDataUIState = null;
    private static ApiCallback<Boolean> component1 = null;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    public static final OpenBiometricGuideManager INSTANCE = new OpenBiometricGuideManager();
    public static final int $stable = 8;

    private OpenBiometricGuideManager() {
    }

    public final void setBiometricTypeAndCallback(BiometricType type, ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = equals + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            ShareDataUIState = type;
            component1 = callback;
            int i3 = 70 / 0;
        } else {
            ShareDataUIState = type;
            component1 = callback;
        }
    }

    public final BiometricType getBiometricType() {
        int i = 2 % 2;
        int i2 = equals + 71;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BiometricType biometricType = ShareDataUIState;
        int i4 = i3 + 109;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return biometricType;
    }

    public final ApiCallback<Boolean> getCallback() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ApiCallback<Boolean> apiCallback = component1;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return apiCallback;
        }
        throw null;
    }

    static {
        int i = copydefault + 111;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
