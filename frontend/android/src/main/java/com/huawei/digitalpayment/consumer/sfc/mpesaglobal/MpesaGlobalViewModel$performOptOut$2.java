package com.huawei.digitalpayment.consumer.sfc.mpesaglobal;

import android.util.Log;
import com.alibaba.ariver.kernel.RVEvents;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/huawei/digitalpayment/consumer/sfc/mpesaglobal/MpesaGlobalViewModel$performOptOut$2", "Lcom/huawei/common/listener/ApiCallback;", "", "onSuccess", "", "value", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalViewModel$performOptOut$2 implements ApiCallback<Object> {
    private static int component2 = 1;
    private static int component3;
    final MpesaGlobalViewModel component1;

    MpesaGlobalViewModel$performOptOut$2(MpesaGlobalViewModel mpesaGlobalViewModel) {
        this.component1 = mpesaGlobalViewModel;
    }

    private static final ImtOptInState ShareDataUIState(ImtOptInState imtOptInState) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(imtOptInState, "");
            return imtOptInState.copy(false, true);
        }
        Intrinsics.checkNotNullParameter(imtOptInState, "");
        return imtOptInState.copy(false, false);
    }

    @Override
    public void onSuccess(Object value) {
        int i = 2 % 2;
        super.onSuccess(value);
        Log.d("MpesaGlobalViewModel", "Opt-out request success, data: " + value);
        MpesaGlobalViewModel.access$updateImtOptOutState(this.component1, new Function1() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 59;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ImtOptInState imtOptInState$r8$lambda$4uADrhZiHoK5xQA2kwqCwPLKmvg = MpesaGlobalViewModel$performOptOut$2.$r8$lambda$4uADrhZiHoK5xQA2kwqCwPLKmvg((ImtOptInState) obj);
                if (i4 != 0) {
                    int i5 = 35 / 0;
                }
                return imtOptInState$r8$lambda$4uADrhZiHoK5xQA2kwqCwPLKmvg;
            }
        });
        this.component1.nextScreen();
        int i2 = component3 + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ImtOptInState copydefault(ImtOptInState imtOptInState) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(imtOptInState, "");
            return imtOptInState.copy(true, true);
        }
        Intrinsics.checkNotNullParameter(imtOptInState, "");
        return imtOptInState.copy(false, true);
    }

    @Override
    public void onError(BaseException e) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(e, "");
        super.onError(e);
        Log.d("MpesaGlobalViewModel", "Request error: " + e);
        MpesaGlobalViewModel.access$updateImtOptOutState(this.component1, new Function1() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ImtOptInState imtOptInStateM10982$r8$lambda$P3SayuJRA1JEz5IBkJW9_OYZcY = MpesaGlobalViewModel$performOptOut$2.m10982$r8$lambda$P3SayuJRA1JEz5IBkJW9_OYZcY((ImtOptInState) obj);
                int i5 = component2 + 37;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return imtOptInStateM10982$r8$lambda$P3SayuJRA1JEz5IBkJW9_OYZcY;
            }
        });
        MpesaGlobalViewModel.access$setScreen(this.component1, new ScreenInformation(MPesaGlobalScreen.OptOutFailure.INSTANCE, ScreenDirection.FORWARD));
        int i2 = component3 + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ImtOptInState $r8$lambda$4uADrhZiHoK5xQA2kwqCwPLKmvg(ImtOptInState imtOptInState) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ImtOptInState imtOptInStateShareDataUIState = ShareDataUIState(imtOptInState);
        int i4 = component3 + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return imtOptInStateShareDataUIState;
    }

    public static ImtOptInState m10982$r8$lambda$P3SayuJRA1JEz5IBkJW9_OYZcY(ImtOptInState imtOptInState) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ImtOptInState imtOptInStateCopydefault = copydefault(imtOptInState);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = component3 + 45;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return imtOptInStateCopydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
