package com.huawei.digitalpayment.consumer.basicUi.util;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.PinFreeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\nR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/util/PinFreeManager;", "", "<init>", "()V", "pinFreeInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/digitalpayment/consumer/basicUi/pinfree/model/PinFreeInfo;", "kotlin.jvm.PlatformType", "Landroidx/lifecycle/LiveData;", "update", "", "json", "Lorg/json/JSONObject;", "enableFreePin", "", "freePinAmount", "", "clean", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PinFreeManager {
    public static final PinFreeManager INSTANCE = new PinFreeManager();
    private static final MutableLiveData<PinFreeInfo> ShareDataUIState = new MutableLiveData<>(new PinFreeInfo(false, null, null, null, null, 31, null));
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private PinFreeManager() {
    }

    static {
        int i = component2 + 107;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public final LiveData<PinFreeInfo> pinFreeInfoLiveData() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            MutableLiveData<PinFreeInfo> mutableLiveData = ShareDataUIState;
            Intrinsics.checkNotNull(mutableLiveData, "");
            return mutableLiveData;
        }
        MutableLiveData<PinFreeInfo> mutableLiveData2 = ShareDataUIState;
        Intrinsics.checkNotNull(mutableLiveData2, "");
        int i3 = 52 / 0;
        return mutableLiveData2;
    }

    public final void update(JSONObject json) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (json != null) {
            ShareDataUIState.postValue((PinFreeInfo) SecureGsonUtils.fromJson(json.toString(), PinFreeInfo.class));
        }
        int i3 = copydefault + 73;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void update(boolean enableFreePin, String freePinAmount) {
        PinFreeInfo pinFreeInfoCopy$default;
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(freePinAmount, "");
        MutableLiveData<PinFreeInfo> mutableLiveData = ShareDataUIState;
        PinFreeInfo value = mutableLiveData.getValue();
        if (value != null) {
            pinFreeInfoCopy$default = PinFreeInfo.copy$default(value, enableFreePin, freePinAmount, null, null, null, 28, null);
        } else {
            int i4 = copydefault + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            pinFreeInfoCopy$default = null;
        }
        mutableLiveData.setValue(pinFreeInfoCopy$default);
    }

    public final void clean() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState.setValue(null);
        int i4 = component1 + 53;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
