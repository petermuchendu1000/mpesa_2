package com.huawei.digitalpayment.consumer.basicUi.pinfree;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.PinFreeInfo;
import com.huawei.digitalpayment.consumer.basicUi.util.PinFreeManager;

public class BasePinFreeViewModel extends ViewModel {
    private static int component1 = 1;
    private static int copydefault;

    public BasePinFreeViewModel() {
        component2();
    }

    public LiveData<PinFreeInfo> getCustomerInfoMutableLiveData() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LiveData<PinFreeInfo> liveDataPinFreeInfoLiveData = PinFreeManager.INSTANCE.pinFreeInfoLiveData();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return liveDataPinFreeInfoLiveData;
    }

    public void update(boolean z, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PinFreeManager.INSTANCE.update(z, str);
        if (i3 == 0) {
            throw null;
        }
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
