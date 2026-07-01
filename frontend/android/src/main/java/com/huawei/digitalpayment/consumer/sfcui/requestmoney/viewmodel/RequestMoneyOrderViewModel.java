package com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.kernel.RVStartParams;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomBean;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.model.DataDictInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfoRequest;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfosResp;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000f0\u000eJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eJ\"\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\u001cJ\u001e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyOrderViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "mpesaFavoritesRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;)V", "getMpesaFavoritesRepository", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "DATA_DICT_TYPE", "", "getDATA_DICT_TYPE", "()Ljava/lang/String;", "updateOrder", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/http/BaseResp;", "senderOrderInfos", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/OrderInfosResp;", "receiverOrderInfos", "cancelOrRejectOrder", "queryDataDict", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/LocalIdType;", "senderAllCount", "", "receiverAllCount", "updateOrderStatus", "", "requestMoneyOrderId", "requestType", "status", "queryOrder", "orderInfoRequest", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/OrderInfoRequest;", "cancelOrReject", "queryStatusDataDict", "queryFavourites", "serviceType", "pageNo", "pageSize", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestMoneyOrderViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int equals = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int hashCode = 123 % 128;
    private final String ShareDataUIState;
    private final MutableLiveData<Integer> component1;
    private final MpesaFavoritesRepository component2;
    private final MutableLiveData<Resource<BaseResp>> component3;
    private final MutableLiveData<Resource<OrderInfosResp>> component4;
    private final MutableLiveData<Integer> copy;
    private final MutableLiveData<Resource<List<LocalIdType>>> copydefault;
    private final MutableLiveData<Resource<BaseResp>> getAsAtTimestamp;
    private final MutableLiveData<Resource<OrderInfosResp>> getRequestBeneficiariesState;

    public static final MutableLiveData access$getCancelOrRejectOrder$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 39;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = requestMoneyOrderViewModel.component3;
        if (i3 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public static final MutableLiveData access$getQueryDataDict$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 81;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = requestMoneyOrderViewModel.copydefault;
        int i5 = i2 + 113;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getReceiverAllCount$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 83;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Integer> mutableLiveData = requestMoneyOrderViewModel.component1;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$getReceiverOrderInfos$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 105;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<OrderInfosResp>> mutableLiveData = requestMoneyOrderViewModel.getRequestBeneficiariesState;
        int i5 = i2 + 17;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getSenderAllCount$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 79;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Integer> mutableLiveData = requestMoneyOrderViewModel.copy;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getSenderOrderInfos$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<OrderInfosResp>> mutableLiveData = requestMoneyOrderViewModel.component4;
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = i3 + 85;
        getSponsorBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getUpdateOrder$p(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 37;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = requestMoneyOrderViewModel.getAsAtTimestamp;
        if (i3 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final MpesaFavoritesRepository getMpesaFavoritesRepository() {
        MpesaFavoritesRepository mpesaFavoritesRepository;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            mpesaFavoritesRepository = this.component2;
            int i4 = 58 / 0;
        } else {
            mpesaFavoritesRepository = this.component2;
        }
        int i5 = i3 + 123;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return mpesaFavoritesRepository;
        }
        throw null;
    }

    @Inject
    public RequestMoneyOrderViewModel(MpesaFavoritesRepository mpesaFavoritesRepository) {
        Intrinsics.checkNotNullParameter(mpesaFavoritesRepository, "");
        this.component2 = mpesaFavoritesRepository;
        this.ShareDataUIState = "SFC_REQUEST_MONEY_STATUS_MAPPING";
        this.getAsAtTimestamp = new MutableLiveData<>();
        this.component4 = new MutableLiveData<>();
        this.getRequestBeneficiariesState = new MutableLiveData<>();
        this.component3 = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.copy = new MutableLiveData<>();
        this.component1 = new MutableLiveData<>();
    }

    public final String getDATA_DICT_TYPE() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<BaseResp>> updateOrder() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 19;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<OrderInfosResp>> senderOrderInfos() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 65;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<OrderInfosResp>> mutableLiveData = this.component4;
        int i4 = i2 + 71;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<OrderInfosResp>> receiverOrderInfos() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 97;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<OrderInfosResp>> mutableLiveData = this.getRequestBeneficiariesState;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BaseResp>> cancelOrRejectOrder() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<List<LocalIdType>>> queryDataDict() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<List<LocalIdType>>> mutableLiveData = this.copydefault;
        int i5 = i3 + 105;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final MutableLiveData<Integer> senderAllCount() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 57;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Integer> mutableLiveData = this.copy;
        int i5 = i3 + 97;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Integer> receiverAllCount() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 7;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Integer> mutableLiveData = this.component1;
        int i5 = i3 + 3;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return mutableLiveData;
    }

    public final void updateOrderStatus(String requestMoneyOrderId, String requestType, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(status, "");
        this.getAsAtTimestamp.setValue(Resource.loading(null));
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 61;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 21;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "updateRequestMoneyOrder";
            }
        };
        paymentRequest.addParams("requestMoneyOrderId", requestMoneyOrderId);
        paymentRequest.addParams("orderStatus", status);
        if (!TextUtils.isEmpty(requestType)) {
            int i2 = getSponsorBeneficiariesState + 81;
            getShareableDataState = i2 % 128;
            if (i2 % 2 == 0) {
                paymentRequest.addParams("requestType", requestType);
                int i3 = 5 / 0;
            } else {
                paymentRequest.addParams("requestType", requestType);
            }
            int i4 = getShareableDataState + 17;
            getSponsorBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
        }
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 103;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                Object obj = null;
                onSuccess2(baseResp);
                if (i8 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i9 = copydefault + 11;
                ShareDataUIState = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(BaseResp value) {
                int i6 = 2 % 2;
                int i7 = copydefault + 105;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                RequestMoneyOrderViewModel.access$getUpdateOrder$p(RequestMoneyOrderViewModel.this).setValue(Resource.success(value));
                int i9 = ShareDataUIState + 17;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i6 = 2 % 2;
                int i7 = copydefault + 79;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyOrderViewModel.access$getUpdateOrder$p(RequestMoneyOrderViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyOrderViewModel.access$getUpdateOrder$p(RequestMoneyOrderViewModel.this).setValue(Resource.error(e, null));
                    int i8 = 56 / 0;
                }
            }
        });
    }

    public final void queryOrder(final OrderInfoRequest orderInfoRequest) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 7;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(orderInfoRequest, "");
        if (TextUtils.equals(orderInfoRequest.getRequestType(), RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER)) {
            int i4 = getSponsorBeneficiariesState + 75;
            getShareableDataState = i4 % 128;
            if (i4 % 2 == 0) {
                this.getRequestBeneficiariesState.setValue(Resource.loading(null));
                throw null;
            }
            this.getRequestBeneficiariesState.setValue(Resource.loading(null));
            int i5 = getSponsorBeneficiariesState + 29;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            this.component4.setValue(Resource.loading(null));
        }
        PaymentRequest<OrderInfosResp> paymentRequest = new PaymentRequest<OrderInfosResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 115;
                int i9 = i8 % 128;
                component3 = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 33;
                ShareDataUIState = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 71 / 0;
                }
                return "queryRequestMoneyOrder";
            }
        };
        if (!TextUtils.isEmpty(orderInfoRequest.getRequestMoneyOrderId())) {
            paymentRequest.addParams("requestMoneyOrderId", orderInfoRequest.getRequestMoneyOrderId());
        }
        if (!TextUtils.isEmpty(orderInfoRequest.getRequestType())) {
            int i7 = getSponsorBeneficiariesState + 71;
            getShareableDataState = i7 % 128;
            if (i7 % 2 == 0) {
                paymentRequest.addParams("requestType", orderInfoRequest.getRequestType());
                throw null;
            }
            paymentRequest.addParams("requestType", orderInfoRequest.getRequestType());
        }
        if (!TextUtils.isEmpty(orderInfoRequest.getOrderStatus())) {
            paymentRequest.addParams("orderStatus", orderInfoRequest.getOrderStatus());
        }
        if (!TextUtils.isEmpty(orderInfoRequest.getStartPage())) {
            paymentRequest.addParams(RVStartParams.START_SCENE_START_PAGE, orderInfoRequest.getStartPage());
        }
        if (!TextUtils.isEmpty(orderInfoRequest.getPageLimit())) {
            int i8 = getShareableDataState + 59;
            getSponsorBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                paymentRequest.addParams("pageLimit", orderInfoRequest.getPageLimit());
                throw null;
            }
            paymentRequest.addParams("pageLimit", orderInfoRequest.getPageLimit());
        }
        sendRequest(paymentRequest, new ApiCallback<OrderInfosResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(OrderInfosResp orderInfosResp) {
                int i9 = 2 % 2;
                int i10 = component3 + 15;
                copydefault = i10 % 128;
                int i11 = i10 % 2;
                onSuccess2(orderInfosResp);
                if (i11 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(OrderInfosResp value) {
                String totalCount;
                int i9 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                if (TextUtils.equals(orderInfoRequest.getRequestType(), RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER)) {
                    RequestMoneyOrderViewModel.access$getReceiverOrderInfos$p(this).setValue(Resource.success(value));
                } else {
                    RequestMoneyOrderViewModel.access$getSenderOrderInfos$p(this).setValue(Resource.success(value));
                    int i10 = component3 + 113;
                    copydefault = i10 % 128;
                    int i11 = i10 % 2;
                }
                if (TextUtils.equals(orderInfoRequest.getRequestType(), RequestMoneyRecordFragment.REQUEST_TYPE_SENDER)) {
                    int i12 = copydefault + 87;
                    component3 = i12 % 128;
                    int i13 = i12 % 2;
                    if (TextUtils.isEmpty(orderInfoRequest.getOrderStatus()) && TextUtils.isEmpty(orderInfoRequest.getRequestMoneyOrderId()) && (totalCount = value.getTotalCount()) != null) {
                        RequestMoneyOrderViewModel.access$getSenderAllCount$p(this).setValue(Integer.valueOf(Integer.parseInt(totalCount)));
                    }
                }
                if (TextUtils.equals(orderInfoRequest.getRequestType(), RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER)) {
                    int i14 = component3 + 107;
                    copydefault = i14 % 128;
                    if (i14 % 2 == 0) {
                        TextUtils.isEmpty(orderInfoRequest.getOrderStatus());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (TextUtils.isEmpty(orderInfoRequest.getOrderStatus())) {
                        int i15 = component3 + 99;
                        copydefault = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i16 = 26 / 0;
                            if (!TextUtils.isEmpty(orderInfoRequest.getRequestMoneyOrderId())) {
                                return;
                            }
                        } else if (!TextUtils.isEmpty(orderInfoRequest.getRequestMoneyOrderId())) {
                            return;
                        }
                        String totalCount2 = value.getTotalCount();
                        if (totalCount2 != null) {
                            RequestMoneyOrderViewModel.access$getReceiverAllCount$p(this).setValue(Integer.valueOf(Integer.parseInt(totalCount2)));
                        }
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
            
                if ((r1 % 2) != 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
            
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.access$getReceiverOrderInfos$p(r2).setValue(com.huawei.payment.mvvm.Resource.error(r6, null));
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
            
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.access$getReceiverOrderInfos$p(r2).setValue(com.huawei.payment.mvvm.Resource.error(r6, null));
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
            
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.access$getSenderOrderInfos$p(r2).setValue(com.huawei.payment.mvvm.Resource.error(r6, null));
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
            
                if ((!android.text.TextUtils.equals(r1.getRequestType(), com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER)) != false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
            
                if (android.text.TextUtils.equals(r1.getRequestType(), com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER) != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
            
                r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.copydefault + 49;
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.component3 = r1 % 128;
             */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onError(com.huawei.common.exception.BaseException r6) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.copydefault
                    int r1 = r1 + 7
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.component3 = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = "receiver"
                    java.lang.String r3 = ""
                    r4 = 0
                    if (r1 == 0) goto L2d
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfoRequest r1 = r1
                    java.lang.String r1 = r1.getRequestType()
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    boolean r1 = android.text.TextUtils.equals(r1, r2)
                    r2 = 16
                    int r2 = r2 / 0
                    r1 = r1 ^ 1
                    if (r1 == 0) goto L40
                    goto L67
                L2d:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfoRequest r1 = r1
                    java.lang.String r1 = r1.getRequestType()
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    boolean r1 = android.text.TextUtils.equals(r1, r2)
                    if (r1 == 0) goto L67
                L40:
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.copydefault
                    int r1 = r1 + 49
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.component3 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L59
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel r0 = r2
                    androidx.lifecycle.MutableLiveData r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.access$getReceiverOrderInfos$p(r0)
                    com.huawei.payment.mvvm.Resource r6 = com.huawei.payment.mvvm.Resource.error(r6, r4)
                    r0.setValue(r6)
                    goto L74
                L59:
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel r0 = r2
                    androidx.lifecycle.MutableLiveData r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.access$getReceiverOrderInfos$p(r0)
                    com.huawei.payment.mvvm.Resource r6 = com.huawei.payment.mvvm.Resource.error(r6, r4)
                    r0.setValue(r6)
                    throw r4
                L67:
                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel r0 = r2
                    androidx.lifecycle.MutableLiveData r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.access$getSenderOrderInfos$p(r0)
                    com.huawei.payment.mvvm.Resource r6 = com.huawei.payment.mvvm.Resource.error(r6, r4)
                    r0.setValue(r6)
                L74:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel.C09131.onError(com.huawei.common.exception.BaseException):void");
            }
        });
    }

    public final void cancelOrReject(String requestMoneyOrderId, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(status, "");
        Object obj = null;
        this.component3.setValue(Resource.loading(null));
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 39;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 11;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return "cancelOrRejectedRequestMoneyOrder";
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams("requestMoneyOrderId", requestMoneyOrderId);
        paymentRequest.addParams("orderStatus", status);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 95;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                int i5 = component2 + 57;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 101;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                RequestMoneyOrderViewModel.access$getCancelOrRejectOrder$p(RequestMoneyOrderViewModel.this).setValue(Resource.success(value));
                int i5 = component2 + 115;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                copydefault = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyOrderViewModel.access$getCancelOrRejectOrder$p(RequestMoneyOrderViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyOrderViewModel.access$getCancelOrRejectOrder$p(RequestMoneyOrderViewModel.this).setValue(Resource.error(e, null));
                    obj2.hashCode();
                    throw null;
                }
            }
        });
        int i2 = getSponsorBeneficiariesState + 29;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void queryStatusDataDict() {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ShareDataUIState);
        PaymentRequest<List<? extends LocalIdType>> paymentRequest = new PaymentRequest<List<? extends LocalIdType>>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 11;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                List<LocalIdType> listConvert = convert(jsonObject);
                int i5 = ShareDataUIState + 53;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return listConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 93;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 123;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return "queryDataDict";
                }
                throw null;
            }

            @Override
            public List<LocalIdType> convert(JsonObject origin) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                DataDictInfoRemote dataDictInfoRemote = (DataDictInfoRemote) GsonUtils.fromJson(origin.toString(), DataDictInfoRemote.class);
                ArrayList arrayList2 = new ArrayList();
                Object obj = null;
                if (dataDictInfoRemote == null) {
                    int i3 = ShareDataUIState + 83;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return arrayList2;
                    }
                    obj.hashCode();
                    throw null;
                }
                Map<String, Map<String, String>> dictMap = dataDictInfoRemote.getDictMap();
                if ((dictMap != null ? dictMap.get(this.component3.getDATA_DICT_TYPE()) : null) == null) {
                    int i4 = ShareDataUIState + 35;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return arrayList2;
                    }
                    int i5 = 93 / 0;
                    return arrayList2;
                }
                Map mapAsMutableMap = TypeIntrinsics.asMutableMap(dictMap.get(this.component3.getDATA_DICT_TYPE()));
                if (mapAsMutableMap != null) {
                    int i6 = ShareDataUIState + 29;
                    component2 = i6 % 128;
                    if (i6 % 2 != 0) {
                        mapAsMutableMap.isEmpty();
                        obj.hashCode();
                        throw null;
                    }
                    if (!mapAsMutableMap.isEmpty()) {
                        Map mapSortMapByKey = SortUtils.sortMapByKey(mapAsMutableMap);
                        Intrinsics.checkNotNullExpressionValue(mapSortMapByKey, "");
                        for (String str : mapSortMapByKey.keySet()) {
                            Intrinsics.checkNotNull(str);
                            arrayList2.add(new LocalIdType(str, (String) mapSortMapByKey.get(str)));
                        }
                        return arrayList2;
                    }
                }
                return arrayList2;
            }
        };
        paymentRequest.addParams("dictName", arrayList);
        sendRequest(paymentRequest, new ApiCallback<List<? extends LocalIdType>>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(List<? extends LocalIdType> list) {
                int i2 = 2 % 2;
                int i3 = component2 + 59;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2((List<LocalIdType>) list);
                int i5 = component2 + 41;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(List<LocalIdType> value) {
                int i2 = 2 % 2;
                int i3 = component2 + 23;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    RequestMoneyOrderViewModel.access$getQueryDataDict$p(RequestMoneyOrderViewModel.this).setValue(Resource.success(value));
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    RequestMoneyOrderViewModel.access$getQueryDataDict$p(RequestMoneyOrderViewModel.this).setValue(Resource.success(value));
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 75;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyOrderViewModel.access$getQueryDataDict$p(RequestMoneyOrderViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    RequestMoneyOrderViewModel.access$getQueryDataDict$p(RequestMoneyOrderViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 2 / 0;
                }
            }
        });
        int i2 = getSponsorBeneficiariesState + 107;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void queryFavourites(String serviceType, int pageNo, int pageSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        PaymentRequest<FavoriteCustomResp> paymentRequest = new PaymentRequest<FavoriteCustomResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 119;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                int i6 = i3 + 35;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return "queryFavoriteList";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams("serviceType", serviceType);
        paymentRequest.addParams("pageNo", Integer.valueOf(pageNo));
        paymentRequest.addParams("pageSize", Integer.valueOf(pageSize));
        sendRequest(paymentRequest, new ApiCallback<FavoriteCustomResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(FavoriteCustomResp favoriteCustomResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 33;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favoriteCustomResp);
                int i5 = component3 + 25;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(FavoriteCustomResp value) {
                List<FavoriteCustomBean> favoriteList;
                int i2 = 2 % 2;
                int i3 = component2 + 69;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    favoriteList = value.getFavoriteList();
                    int i4 = 65 / 0;
                    if (favoriteList == null) {
                        return;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    favoriteList = value.getFavoriteList();
                    if (favoriteList == null) {
                        return;
                    }
                }
                RequestMoneyOrderViewModel requestMoneyOrderViewModel = RequestMoneyOrderViewModel.this;
                onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(requestMoneyOrderViewModel), Dispatchers.getIO(), null, new ShareDataUIState(requestMoneyOrderViewModel, favoriteList, null), 2, null);
                int i5 = component2 + 119;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel$queryFavourites$1$onSuccess$1$1", f = "RequestMoneyOrderViewModel.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
            static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int component3 = 1;
                int ShareDataUIState;
                final List<FavoriteCustomBean> component2;
                final RequestMoneyOrderViewModel copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.ShareDataUIState;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.ShareDataUIState = 1;
                        if (this.copydefault.getMpesaFavoritesRepository().insertFavorites(this.component2, this) == coroutine_suspended) {
                            int i3 = component1 + 119;
                            component3 = i3 % 128;
                            if (i3 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        int i4 = component3 + 65;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                ShareDataUIState(RequestMoneyOrderViewModel requestMoneyOrderViewModel, List<FavoriteCustomBean> list, Continuation<? super ShareDataUIState> continuation) {
                    super(2, continuation);
                    this.copydefault = requestMoneyOrderViewModel;
                    this.component2 = list;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    ShareDataUIState shareDataUIState = new ShareDataUIState(this.copydefault, this.component2, continuation);
                    int i2 = component3 + 19;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return shareDataUIState;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 85;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                    int i4 = component3 + 9;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return objShareDataUIState;
                }

                public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 79;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 41;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }
        });
        int i2 = getShareableDataState + 59;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 123 % 2;
    }
}
