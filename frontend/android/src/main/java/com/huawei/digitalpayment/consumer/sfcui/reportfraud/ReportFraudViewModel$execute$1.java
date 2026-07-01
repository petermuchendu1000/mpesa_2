package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import androidx.lifecycle.MutableLiveData;
import com.alibaba.ariver.kernel.RVEvents;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/reportfraud/ReportFraudViewModel$execute$1", "Lcom/huawei/common/listener/ApiCallback;", "onSuccess", "", "value", "(Ljava/lang/Object;)V", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportFraudViewModel$execute$1<T> implements ApiCallback<T> {
    private static int component3 = 1;
    private static int copydefault;
    final MutableLiveData<Resource<T>> component2;

    public ReportFraudViewModel$execute$1(MutableLiveData<Resource<T>> mutableLiveData) {
        this.component2 = mutableLiveData;
    }

    @Override
    public void onSuccess(T value) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.component2.setValue(Resource.success(value));
        int i4 = copydefault + 111;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    @Override
    public void onError(BaseException e) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(e, "");
        this.component2.setValue(Resource.error(e, null));
        int i4 = component3 + 17;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }
}
