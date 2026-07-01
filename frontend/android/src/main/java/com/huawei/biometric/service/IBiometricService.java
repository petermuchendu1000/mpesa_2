package com.huawei.biometric.service;

import androidx.fragment.app.FragmentActivity;
import com.huawei.biometric.model.BiometricType;
import com.huawei.common.listener.ApiCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/huawei/biometric/service/IBiometricService;", "", "guideOpenBiometricLogin", "", "content", "", "biometricType", "Lcom/huawei/biometric/model/BiometricType;", "showGuide", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "checkBiometricChange", "activity", "Landroidx/fragment/app/FragmentActivity;", "cleanAllBiometric", "BiometricLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBiometricService {
    void checkBiometricChange(FragmentActivity activity);

    void checkBiometricChange(FragmentActivity activity, ApiCallback<Boolean> callback);

    void cleanAllBiometric();

    void guideOpenBiometricLogin(String content, BiometricType biometricType, boolean showGuide, ApiCallback<Boolean> callback);

    void guideOpenBiometricLogin(String content, ApiCallback<Boolean> callback);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void checkBiometricChange(IBiometricService iBiometricService, FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            iBiometricService.checkBiometricChange(fragmentActivity, null);
        }
    }
}
