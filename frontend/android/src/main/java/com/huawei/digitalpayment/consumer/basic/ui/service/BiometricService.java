package com.huawei.digitalpayment.consumer.basic.ui.service;

import androidx.fragment.app.FragmentActivity;
import com.huawei.biometric.model.BiometricType;
import com.huawei.biometric.service.IBiometricService;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basic.util.BiometricHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/service/BiometricService;", "Lcom/huawei/biometric/service/IBiometricService;", "<init>", "()V", "guideOpenBiometricLogin", "", "content", "", "biometricType", "Lcom/huawei/biometric/model/BiometricType;", "showGuide", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "checkBiometricChange", "activity", "Landroidx/fragment/app/FragmentActivity;", "cleanAllBiometric", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BiometricService implements IBiometricService {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @Override
    public void checkBiometricChange(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IBiometricService.DefaultImpls.checkBiometricChange(this, fragmentActivity);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = component2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void guideOpenBiometricLogin(String content, BiometricType biometricType, boolean showGuide, ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(content, "");
        Intrinsics.checkNotNullParameter(biometricType, "");
        Intrinsics.checkNotNullParameter(callback, "");
        BiometricHelper.guideOpenBiometricLogin(content, biometricType, showGuide, callback);
        int i4 = component3 + 9;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    @Override
    public void guideOpenBiometricLogin(String content, ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(content, "");
        Intrinsics.checkNotNullParameter(callback, "");
        BiometricHelper.guideOpenBiometricLogin(content, callback);
        int i4 = component2 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void checkBiometricChange(FragmentActivity activity, ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        BiometricHelper.checkBiometricChange(activity, callback);
        int i4 = component2 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void cleanAllBiometric() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BiometricHelper.cleanAllBiometric();
        if (i3 == 0) {
            throw null;
        }
    }

    static {
        int i = 1 + 95;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
