package com.huawei.digitalpayment.consumer.base.viewmode;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.resp.PochiOptResp;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.HeaderConstants;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.payment.mvvm.Resource;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J3\u0010\f\u001a\u00020\r2&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0012j\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u000f¢\u0006\u0002\u0010\u0013J3\u0010\u0014\u001a\u00020\r2&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0012j\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u000f¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/viewmode/ThirdPartyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "optInData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/PochiOptResp;", "optOutData", "getOptInData", "getOptOutData", "optIn", "", "params", "Lkotlin/collections/HashMap;", "", "", "Ljava/util/HashMap;", "(Ljava/util/HashMap;)V", "optOut", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ThirdPartyViewModel extends ViewModel implements BaseModel {

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static final String component3 = "ThirdPartyViewModel";
    private static int component4 = 1;
    private static int copy;
    private MutableLiveData<Resource<PochiOptResp>> copydefault = new MutableLiveData<>();
    private MutableLiveData<Resource<PochiOptResp>> component1 = new MutableLiveData<>();

    public static final MutableLiveData access$getOptInData$p(ThirdPartyViewModel thirdPartyViewModel) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 7;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        MutableLiveData<Resource<PochiOptResp>> mutableLiveData = thirdPartyViewModel.copydefault;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 33;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public static final MutableLiveData access$getOptOutData$p(ThirdPartyViewModel thirdPartyViewModel) {
        int i = 2 % 2;
        int i2 = copy + 9;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<PochiOptResp>> mutableLiveData = thirdPartyViewModel.component1;
        if (i3 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final MutableLiveData<Resource<PochiOptResp>> getOptInData() {
        MutableLiveData<Resource<PochiOptResp>> mutableLiveData;
        int i = 2 % 2;
        int i2 = copy + 119;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            mutableLiveData = this.copydefault;
            int i4 = 55 / 0;
        } else {
            mutableLiveData = this.copydefault;
        }
        int i5 = i3 + 97;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<PochiOptResp>> getOptOutData() {
        int i = 2 % 2;
        int i2 = copy + 55;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void optIn(HashMap<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.copydefault.setValue(Resource.loading(null));
        HaProxyRequest<PochiOptResp> haProxyRequest = new HaProxyRequest<PochiOptResp>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 51;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 77;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 57 / 0;
                }
                return "msme-opt-in-out/micro-sme/opt-in";
            }
        };
        haProxyRequest.addParams((Map<String, Object>) params);
        haProxyRequest.addHeader("Accept-Language", "EN");
        haProxyRequest.addHeader(HeaderConstants.CONVERSATION_ID, "aba0eb07-167c-4660-90f9-46ea3f463c34");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_COUNTY_CODE, "KE");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_DIVISION, "DIT");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_OPERATOR, "Safaricom");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_SYSTEM, "USSD");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_TIMESTAMP, String.valueOf(System.currentTimeMillis()));
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        sendRequest(haProxyRequest, new ApiCallback<PochiOptResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(PochiOptResp pochiOptResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 31;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(pochiOptResp);
                int i5 = copydefault + 87;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(PochiOptResp value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 77;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(value);
                    ThirdPartyViewModel.access$getOptInData$p(ThirdPartyViewModel.this).setValue(Resource.success(value));
                    int i4 = copydefault + 19;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                super.onSuccess(value);
                ThirdPartyViewModel.access$getOptInData$p(ThirdPartyViewModel.this).setValue(Resource.success(value));
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 103;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    ThirdPartyViewModel.access$getOptInData$p(ThirdPartyViewModel.this).setValue(Resource.error(e, null));
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ThirdPartyViewModel.access$getOptInData$p(ThirdPartyViewModel.this).setValue(Resource.error(e, null));
                int i4 = component1 + 5;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component4 + 71;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void optOut(HashMap<String, Object> params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        this.component1.setValue(Resource.loading(null));
        HaProxyRequest<PochiOptResp> haProxyRequest = new HaProxyRequest<PochiOptResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 49;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return "msme-opt-in-out/micro-sme/opt-out";
                }
                throw null;
            }
        };
        haProxyRequest.addHeader("Accept-Language", "EN");
        haProxyRequest.addHeader(HeaderConstants.CONVERSATION_ID, "aba0eb07-167c-4660-90f9-46ea3f463c34");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_COUNTY_CODE, "KE");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_DIVISION, "DIT");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_OPERATOR, "Safaricom");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_SYSTEM, "USSD");
        haProxyRequest.addHeader(HeaderConstants.SOURCE_TIMESTAMP, String.valueOf(System.currentTimeMillis()));
        haProxyRequest.addParams((Map<String, Object>) params);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        sendRequest(haProxyRequest, new ApiCallback<PochiOptResp>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(PochiOptResp pochiOptResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 97;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(pochiOptResp);
                int i5 = copydefault + 45;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 57 / 0;
                }
            }

            public void onSuccess2(PochiOptResp value) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataAccess$getOptOutData$p = ThirdPartyViewModel.access$getOptOutData$p(ThirdPartyViewModel.this);
                if (i4 == 0) {
                    mutableLiveDataAccess$getOptOutData$p.setValue(Resource.success(value));
                    return;
                }
                mutableLiveDataAccess$getOptOutData$p.setValue(Resource.success(value));
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 107;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    ThirdPartyViewModel.access$getOptOutData$p(ThirdPartyViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 40 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    ThirdPartyViewModel.access$getOptOutData$p(ThirdPartyViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = copydefault + 49;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component4 + 79;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = ShareDataUIState + 31;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/viewmode/ThirdPartyViewModel$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
