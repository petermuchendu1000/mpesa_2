package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.sfcui.ui.model.ISendMoneyModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.PreSendMoneyParams;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0004\u001a\u00028\u0000X\u0094\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/BaseSendMoneyConfirmViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/ISendMoneyModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/ISendMoneyModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/ISendMoneyModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/ISendMoneyModel;", "checkData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "getData", "preSendMoney", "", "params", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PreSendMoneyParams;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseSendMoneyConfirmViewModel<Model extends ISendMoneyModel> extends ViewModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int equals = 1;
    private final MutableLiveData<Resource<CheckoutResp>> component2;
    private final Model copydefault;

    public BaseSendMoneyConfirmViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.copydefault = model;
        this.component2 = new MutableLiveData<>();
    }

    public static final MutableLiveData access$getCheckData$p(BaseSendMoneyConfirmViewModel baseSendMoneyConfirmViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<CheckoutResp>> mutableLiveData = baseSendMoneyConfirmViewModel.component2;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 121;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    protected Model getModel() {
        int i = 2 % 2;
        int i2 = equals + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Model model = this.copydefault;
        int i5 = i3 + 7;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return model;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<CheckoutResp>> getData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final void preSendMoney(PreSendMoneyParams params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.component2.setValue(Resource.loading(null));
        getModel().preSendMoney(params, new ApiCallback<CheckoutResp>(this) {
            private static int component3 = 0;
            private static int copydefault = 1;
            final BaseSendMoneyConfirmViewModel<Model> component2;

            {
                this.component2 = this;
            }

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(checkoutResp);
                int i5 = copydefault + 33;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(CheckoutResp value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 27;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseSendMoneyConfirmViewModel.access$getCheckData$p(this.component2).setValue(Resource.success(value));
                int i5 = copydefault + 125;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    BaseSendMoneyConfirmViewModel.access$getCheckData$p(this.component2).setValue(Resource.error(e, null));
                    int i4 = 61 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    BaseSendMoneyConfirmViewModel.access$getCheckData$p(this.component2).setValue(Resource.error(e, null));
                }
                int i5 = copydefault + 103;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 13 / 0;
                }
            }
        });
        int i2 = ShareDataUIState + 9;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    static {
        int i = 1 + 85;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
