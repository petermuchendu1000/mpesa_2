package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod;

import android.os.Process;
import androidx.core.view.PointerIconCompat;
import com.alibaba.ariver.kernel.RVEvents;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001J\u001e\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodViewModel$fetchPaymentOptions$1$2", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "onSuccess", "", "value", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectPaymentMethodViewModel$fetchPaymentOptions$1$2 implements ApiCallback<HaProxyResponse<List<? extends DaimaProductPaymentOption>>> {
    public static int component1 = 0;
    private static int component2 = 0;
    public static int component3 = 0;
    private static int copydefault = 1;
    final SelectPaymentMethodViewModel ShareDataUIState;

    SelectPaymentMethodViewModel$fetchPaymentOptions$1$2(SelectPaymentMethodViewModel selectPaymentMethodViewModel) {
        this.ShareDataUIState = selectPaymentMethodViewModel;
    }

    @Override
    public void onSuccess(HaProxyResponse<List<? extends DaimaProductPaymentOption>> haProxyResponse) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onSuccess2((HaProxyResponse<List<DaimaProductPaymentOption>>) haProxyResponse);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component2 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onSuccess2(HaProxyResponse<List<DaimaProductPaymentOption>> value) {
        ArrayList arrayListEmptyList;
        List<DaimaProductPaymentOption> body;
        int i = 2 % 2;
        super.onSuccess(value);
        if (value == null || (body = value.getBody()) == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = body.iterator();
            while (!(!it.hasNext())) {
                int i2 = component2 + 47;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    ((DaimaProductPaymentOption) it.next()).getActive();
                    throw null;
                }
                Object next = it.next();
                if (((DaimaProductPaymentOption) next).getActive()) {
                    arrayList.add(next);
                }
            }
            arrayListEmptyList = arrayList;
        }
        MutableStateFlow mutableStateFlowAccess$get_state$p = SelectPaymentMethodViewModel.access$get_state$p(this.ShareDataUIState);
        int i3 = component2 + 91;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 4;
        }
        while (true) {
            Object value2 = mutableStateFlowAccess$get_state$p.getValue();
            MutableStateFlow mutableStateFlow = mutableStateFlowAccess$get_state$p;
            if (mutableStateFlow.compareAndSet(value2, SelectPaymentMethodState.copy$default((SelectPaymentMethodState) value2, false, false, null, false, null, null, false, null, arrayListEmptyList, 0, 764, null))) {
                return;
            } else {
                mutableStateFlowAccess$get_state$p = mutableStateFlow;
            }
        }
    }

    @Override
    public void onError(BaseException e) {
        Object value;
        SelectPaymentMethodState selectPaymentMethodState;
        String message;
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(e, "");
            super.onError(e);
            SelectPaymentMethodViewModel.access$get_state$p(this.ShareDataUIState);
            throw null;
        }
        Intrinsics.checkNotNullParameter(e, "");
        super.onError(e);
        MutableStateFlow mutableStateFlowAccess$get_state$p = SelectPaymentMethodViewModel.access$get_state$p(this.ShareDataUIState);
        do {
            value = mutableStateFlowAccess$get_state$p.getValue();
            selectPaymentMethodState = (SelectPaymentMethodState) value;
            message = e.getMessage();
            if (message == null) {
                int i3 = copydefault;
                int i4 = i3 + 67;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 119;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                message = "Failed to load payment options";
            }
        } while (!mutableStateFlowAccess$get_state$p.compareAndSet(value, SelectPaymentMethodState.copy$default(selectPaymentMethodState, false, true, message, false, null, null, false, null, null, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, null)));
    }

    public static int component3() {
        int i = component1;
        int i2 = i % 7671176;
        component1 = i + 1;
        if (i2 != 0) {
            return component3;
        }
        int iMyPid = Process.myPid();
        component3 = iMyPid;
        return iMyPid;
    }
}
