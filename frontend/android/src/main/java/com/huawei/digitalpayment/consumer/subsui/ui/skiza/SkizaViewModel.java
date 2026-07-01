package com.huawei.digitalpayment.consumer.subsui.ui.skiza;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription;
import com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTone;
import com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTonesResponse;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\u000bJ\u0014\u0010/\u001a\u00020+2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0'R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR,\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0012j\b\u0012\u0004\u0012\u00020\u000b`\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\b0\u00070\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u001f\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010'0\u001f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/skiza/SkizaViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "_skizaTuneData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTonesResponse;", "msisdn", "", "getMsisdn", "()Ljava/lang/String;", "msisdn$delegate", "Lkotlin/Lazy;", "selectedTones", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getSelectedTones", "()Ljava/util/ArrayList;", "setSelectedTones", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "selectedSubscription", "Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/Subscription;", "getSelectedSubscription", "()Landroidx/lifecycle/MutableLiveData;", "selectedPlatform", "getSelectedPlatform", "skizaTuneData", "Landroidx/lifecycle/LiveData;", "getSkizaTuneData", "()Landroidx/lifecycle/LiveData;", "_responseData", "", "responseData", "getResponseData", "listSkizaTunes", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTone;", "getListSkizaTunes", "flush", "", "getSkizaTuneList", "unsubscribeSkizaTuneSingle", "tone", "unSubscribeSkizaTuneAll", "tones", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkizaViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int getSponsorBeneficiariesState = 1;
    private final LiveData<List<SkizaTone>> ShareDataUIState;
    private final MutableLiveData<Resource<HaProxyResponse<SkizaTonesResponse>>> component1;
    private final MutableLiveData<String> component2;
    private final Lazy component3;
    private final MutableLiveData<Subscription> component4;
    private final MutableLiveData<Resource<HaProxyResponse<Object>>> copydefault;
    private ArrayList<String> getAsAtTimestamp;

    public SkizaViewModel() {
        MutableLiveData<Resource<HaProxyResponse<SkizaTonesResponse>>> mutableLiveData = new MutableLiveData<>();
        this.component1 = mutableLiveData;
        this.component3 = LazyKt.lazy(new Function0() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component3 + 25;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                String str$r8$lambda$hRL1hLRKnn1DarXtu1JXRPl5cYA = SkizaViewModel.$r8$lambda$hRL1hLRKnn1DarXtu1JXRPl5cYA();
                int i4 = component2 + 43;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 31 / 0;
                }
                return str$r8$lambda$hRL1hLRKnn1DarXtu1JXRPl5cYA;
            }
        });
        this.getAsAtTimestamp = new ArrayList<>();
        this.component4 = new MutableLiveData<>();
        this.component2 = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.ShareDataUIState = Transformations.map(mutableLiveData, new Function1() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                List listM12137$r8$lambda$V3q8CWkqBbPPoZE7KqxIFUmfBc = SkizaViewModel.m12137$r8$lambda$V3q8CWkqBbPPoZE7KqxIFUmfBc((Resource) obj);
                int i4 = copydefault + 115;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return listM12137$r8$lambda$V3q8CWkqBbPPoZE7KqxIFUmfBc;
                }
                throw null;
            }
        });
    }

    public static final MutableLiveData access$get_responseData$p(SkizaViewModel skizaViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 97;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<HaProxyResponse<Object>>> mutableLiveData = skizaViewModel.copydefault;
        int i5 = i2 + 25;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$get_skizaTuneData$p(SkizaViewModel skizaViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 63;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<HaProxyResponse<SkizaTonesResponse>>> mutableLiveData = skizaViewModel.component1;
        int i5 = i2 + 85;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = equals + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.component3.getValue();
        int i4 = equals + 73;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final String component2() {
        String string;
        String countryCode;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
        } else {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
        }
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, countryCode, "", false, 4, (Object) null);
        int i3 = getRequestBeneficiariesState + 43;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return strReplaceFirst$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ArrayList<String> getSelectedTones() {
        int i = 2 % 2;
        int i2 = equals + 63;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        ArrayList<String> arrayList = this.getAsAtTimestamp;
        int i5 = i3 + 125;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return arrayList;
    }

    public final void setSelectedTones(ArrayList<String> arrayList) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.getAsAtTimestamp = arrayList;
        } else {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.getAsAtTimestamp = arrayList;
            throw null;
        }
    }

    public final MutableLiveData<Subscription> getSelectedSubscription() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        throw null;
    }

    public final MutableLiveData<String> getSelectedPlatform() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableLiveData<String> mutableLiveData = this.component2;
        int i5 = i3 + 79;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final LiveData<Resource<HaProxyResponse<SkizaTonesResponse>>> getSkizaTuneData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<HaProxyResponse<SkizaTonesResponse>>> mutableLiveData = this.component1;
        int i5 = i3 + 11;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final LiveData<Resource<HaProxyResponse<Object>>> getResponseData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<HaProxyResponse<Object>>> mutableLiveData = this.copydefault;
        if (i3 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final LiveData<List<SkizaTone>> getListSkizaTunes() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 87;
        equals = i3 % 128;
        int i4 = i3 % 2;
        LiveData<List<SkizaTone>> liveData = this.ShareDataUIState;
        int i5 = i2 + 27;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List copydefault(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (resource.success()) {
            SkizaTonesResponse skizaTonesResponse = (SkizaTonesResponse) ((HaProxyResponse) resource.getData()).getBody();
            if (skizaTonesResponse != null) {
                return skizaTonesResponse.getSubscriptions();
            }
            return null;
        }
        List listEmptyList = CollectionsKt.emptyList();
        int i4 = equals + 13;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return listEmptyList;
        }
        int i5 = 3 / 3;
        return listEmptyList;
    }

    public final void flush() {
        int i = 2 % 2;
        this.getAsAtTimestamp = new ArrayList<>();
        int i2 = getRequestBeneficiariesState + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void getSkizaTuneList() {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<SkizaTonesResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<SkizaTonesResponse>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 79;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 117;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return GsmEndpoints.GSM_GET_SKIZA;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.method(BaseRequest.Method.GET);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<SkizaTonesResponse>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<SkizaTonesResponse> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 45;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = component1 + 35;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 70 / 0;
                }
            }

            public void onSuccess2(HaProxyResponse<SkizaTonesResponse> value) {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                SkizaViewModel.access$get_skizaTuneData$p(SkizaViewModel.this).setValue(Resource.success(value));
                int i5 = copydefault + 63;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 1;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SkizaViewModel.access$get_skizaTuneData$p(SkizaViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SkizaViewModel.access$get_skizaTuneData$p(SkizaViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void unsubscribeSkizaTuneSingle(String tone) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tone, "");
        this.copydefault.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 53;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 121;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return GsmEndpoints.GSM_SKIZA_UNSUBSCRIBE_ONE;
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("msisdn", getMsisdn());
        haProxyRequest.addParams("tone", tone);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<Object>>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                if (i4 != 0) {
                    int i5 = 34 / 0;
                }
                int i6 = component2 + 77;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 71 / 0;
                }
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 9;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                SkizaViewModel.access$get_responseData$p(SkizaViewModel.this).setValue(Resource.success(value));
                int i5 = copydefault + 125;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SkizaViewModel.access$get_responseData$p(SkizaViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SkizaViewModel.access$get_responseData$p(SkizaViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = equals + 7;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void unSubscribeSkizaTuneAll(List<String> tones) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tones, "");
        this.copydefault.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 67;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 53;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return GsmEndpoints.GSM_SKIZA_UBSUBSCRIBE_ALL;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("msisdn", getMsisdn());
        haProxyRequest.addParams("tones", tones);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 7;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component2 + 107;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                int i3 = component2 + 11;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                SkizaViewModel.access$get_responseData$p(SkizaViewModel.this).setValue(Resource.success(value));
                int i5 = ShareDataUIState + 23;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 47;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SkizaViewModel.access$get_responseData$p(SkizaViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 99 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    SkizaViewModel.access$get_responseData$p(SkizaViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = ShareDataUIState + 95;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = equals + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public static List m12137$r8$lambda$V3q8CWkqBbPPoZE7KqxIFUmfBc(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 105;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault(resource);
        }
        copydefault(resource);
        throw null;
    }

    public static String $r8$lambda$hRL1hLRKnn1DarXtu1JXRPl5cYA() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return component2();
        }
        component2();
        throw null;
    }

    static {
        int i = 1 + 57;
        copy = i % 128;
        int i2 = i % 2;
    }
}
