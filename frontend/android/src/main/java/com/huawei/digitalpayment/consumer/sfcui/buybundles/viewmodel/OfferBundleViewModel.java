package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension;
import com.blankj.utilcode.util.GsonUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.MsisdnPayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.CustomerInfoBody;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.FreshFridayResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchasePayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle;
import com.huawei.digitalpayment.consumer.sfcui.components.bundles.BundleMenu;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.BalancesViewModel;
import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile;
import com.huawei.digitalpayment.consumer.sfcui.profile.resp.TariffResp;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001WB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0002J\u0006\u0010-\u001a\u00020(J\b\u0010.\u001a\u00020(H\u0002J\n\u0010/\u001a\u0004\u0018\u00010,H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020,H\u0002J\u0006\u00102\u001a\u00020(J8\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u0002072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u00109\u001a\u00020\u00172\b\b\u0002\u0010:\u001a\u00020*H\u0002J\u0018\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u000204H\u0002J*\u0010>\u001a\u00020(2\u0006\u00105\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00172\b\b\u0002\u00109\u001a\u00020\u00172\b\b\u0002\u0010:\u001a\u00020*J\u000e\u0010?\u001a\u00020(2\u0006\u00105\u001a\u00020\u000fJ\u000e\u0010@\u001a\u00020(2\u0006\u00105\u001a\u00020\u000fJ\n\u0010A\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0017H\u0002J\u0006\u0010\u000b\u001a\u00020(J\u0016\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010,H\u0002J$\u0010G\u001a\u00020(2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u000e2\u0006\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020*J\u0014\u0010L\u001a\u00020(2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0017J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u000e2\u0006\u0010K\u001a\u00020*2\u0006\u0010Q\u001a\u00020\u0017H\u0002J2\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u000e2\u0006\u0010T\u001a\u00020\u00172\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020I0\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 ¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/OfferBundleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "_customerInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/CustomerInfoBody;", "customerInfo", "Landroidx/lifecycle/LiveData;", "getCustomerInfo", "()Landroidx/lifecycle/LiveData;", "_ofaMotoBundles", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", "ofaMotoBundles", "getOfaMotoBundles", "_ofaMotoPurchaseStatus", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchaseResponse;", "ofaMotoPurchaseStatus", "getOfaMotoPurchaseStatus", "formattedMsisdn", "", "getFormattedMsisdn", "()Ljava/lang/String;", "formattedMsisdn$delegate", "Lkotlin/Lazy;", "_bundlesHomeUIState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BundlesHomeUIState;", "bundlesHomeUIState", "Lkotlinx/coroutines/flow/StateFlow;", "getBundlesHomeUIState", "()Lkotlinx/coroutines/flow/StateFlow;", "_buyBundlesUiState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundlesUiState;", "buyBundlesUiState", "getBuyBundlesUiState", "updateBundleMenus", "", "blazer", "", "latestTariffResp", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/TariffResp;", "updateCustomerProfile", "queryTariff", "loadCachedTariff", "cacheTariff", "tariff", "getOfferBundles", "createBaseOfaMotoPurchasePayload", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchasePayload;", "offerBundle", "purchaseCurrency", "", "encryptedPin", "fulizaAmount", "fulizaEnabled", "executePurchase", "endpoint", "payload", "buyOfferBundleViaMpesa", "buyOfferBundleViaAirtime", "buyOfferBundleViaBonga", "getTariff", "generateSessionId", "msisdn", "buildCustomerProfile", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CustomerProfile;", "tariffResp", "updateFreshFridayState", "offers", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridayResp;", "isAvailable", "isFreshFridayActive", "updateOfaMotoOffers", "selectCategory", "categoryId", "buildCategories", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/OfferCategory;", "selectedCategoryId", "buildDisplayList", "", "currentCategory", "ofaMotoOffers", "freshFridayOffers", "TunukiwaPurchaseCurrency", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferBundleViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 5 % 128;
    private static int equals = 0;
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 1;
    private final MutableStateFlow<BundlesHomeUIState> component3;
    private final StateFlow<BundlesHomeUIState> component4;
    private final StateFlow<BuyBundlesUiState> copy;
    private final MutableStateFlow<BuyBundlesUiState> copydefault;
    private TariffResp getRequestBeneficiariesState;
    private final MutableLiveData<Resource<CustomerInfoBody>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<List<OfferBundle>>> component2 = new MutableLiveData<>();
    private final MutableLiveData<Resource<OfaMotoPurchaseResponse>> component1 = new MutableLiveData<>();
    private final Lazy getAsAtTimestamp = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int component3;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                OfferBundleViewModel.$r8$lambda$gWsrIgiyN6x8JIiudooSon_7pK8();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str$r8$lambda$gWsrIgiyN6x8JIiudooSon_7pK8 = OfferBundleViewModel.$r8$lambda$gWsrIgiyN6x8JIiudooSon_7pK8();
            int i3 = ShareDataUIState + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return str$r8$lambda$gWsrIgiyN6x8JIiudooSon_7pK8;
        }
    });

    public static Object component1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i5 | i9;
        int i11 = ~i5;
        int i12 = i9 | (~(i11 | i));
        int i13 = (~(i6 | i7 | i5)) | (~(i8 | i11 | i7));
        int i14 = i + i5 + i2 + ((-619979367) * i3) + (68302741 * i4);
        int i15 = i14 * i14;
        int i16 = (i * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i2) + (1615200256 * i3) + ((-1821507584) * i4) + (428933120 * i15);
        int i17 = ((i * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i2 * (-96141863)) + (i3 * (-1380774991)) + (i4 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        return i18 != 1 ? i18 != 2 ? ShareDataUIState(objArr) : copydefault(objArr) : component1(objArr);
    }

    public static final void access$cacheTariff(OfferBundleViewModel offerBundleViewModel, TariffResp tariffResp) {
        int i = 2 % 2;
        int i2 = equals + 39;
        toString = i2 % 128;
        int i3 = i2 % 2;
        offerBundleViewModel.copydefault(tariffResp);
        int i4 = toString + 83;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final MutableLiveData access$get_customerInfo$p(OfferBundleViewModel offerBundleViewModel) {
        int i = 2 % 2;
        int i2 = toString + 125;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<CustomerInfoBody>> mutableLiveData = offerBundleViewModel.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return mutableLiveData;
    }

    public static final MutableLiveData access$get_ofaMotoBundles$p(OfferBundleViewModel offerBundleViewModel) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 9;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<OfferBundle>>> mutableLiveData = offerBundleViewModel.component2;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 19;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return mutableLiveData;
    }

    public static final MutableLiveData access$get_ofaMotoPurchaseStatus$p(OfferBundleViewModel offerBundleViewModel) {
        int i = 2 % 2;
        int i2 = equals + 63;
        toString = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<OfaMotoPurchaseResponse>> mutableLiveData = offerBundleViewModel.component1;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return mutableLiveData;
    }

    public static final void access$setLatestTariffResp$p(OfferBundleViewModel offerBundleViewModel, TariffResp tariffResp) {
        int i = 2 % 2;
        int i2 = equals + 23;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        offerBundleViewModel.getRequestBeneficiariesState = tariffResp;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 31;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$updateBundleMenus(OfferBundleViewModel offerBundleViewModel, boolean z) {
        int i = 2 % 2;
        int i2 = toString + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        offerBundleViewModel.copydefault(z);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public OfferBundleViewModel() {
        MutableStateFlow<BundlesHomeUIState> MutableStateFlow = StateFlowKt.MutableStateFlow(new BundlesHomeUIState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this.component3 = MutableStateFlow;
        this.component4 = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<BuyBundlesUiState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new BuyBundlesUiState(null, null, null, null, null, false, false, 127, null));
        this.copydefault = MutableStateFlow2;
        this.copy = FlowKt.asStateFlow(MutableStateFlow2);
        copydefault(this, false, 1, null);
        this.getRequestBeneficiariesState = ShareDataUIState();
        updateCustomerProfile();
        component1();
    }

    public final LiveData<Resource<CustomerInfoBody>> getCustomerInfo() {
        int i = 2 % 2;
        int i2 = equals + 11;
        toString = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<CustomerInfoBody>> mutableLiveData = this.ShareDataUIState;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<Resource<List<OfferBundle>>> getOfaMotoBundles() {
        int i = 2 % 2;
        int i2 = equals + 89;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            MutableLiveData<Resource<List<OfferBundle>>> mutableLiveData = this.component2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<List<OfferBundle>>> mutableLiveData2 = this.component2;
        int i4 = i3 + 93;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData2;
    }

    public final LiveData<Resource<OfaMotoPurchaseResponse>> getOfaMotoPurchaseStatus() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 3;
        toString = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<OfaMotoPurchaseResponse>> mutableLiveData = this.component1;
        int i5 = i2 + 99;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final String getFormattedMsisdn() {
        int i = 2 % 2;
        int i2 = equals + 87;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.getAsAtTimestamp.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        int i4 = 75 / 0;
        return (String) value;
    }

    private static final String component3() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        int i2 = equals + 35;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/OfferBundleViewModel$TunukiwaPurchaseCurrency;", "", "<init>", "()V", "AIRTIME", "", "MPESA", "BONGA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class component3 {
        public static final component3 ShareDataUIState = new component3();
        public static final int component1 = 3;
        public static final int component2 = 2;
        public static final int component3 = 1;
        private static int copydefault = 0;
        private static int getRequestBeneficiariesState = 1;

        private component3() {
        }

        static {
            int i = copydefault + 67;
            getRequestBeneficiariesState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public final StateFlow<BundlesHomeUIState> getBundlesHomeUIState() {
        int i = 2 % 2;
        int i2 = equals + 73;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<BuyBundlesUiState> getBuyBundlesUiState() {
        int i = 2 % 2;
        int i2 = equals + 73;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        StateFlow<BuyBundlesUiState> stateFlow = this.copy;
        int i5 = i3 + 43;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    static void copydefault(OfferBundleViewModel offerBundleViewModel, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 61;
        toString = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 13;
            toString = i6 % 128;
            z = i6 % 2 == 0;
        }
        offerBundleViewModel.copydefault(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z) {
        int i = 2 % 2;
        List<BundleMenu> bundles = new BundlesHomeUIState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0).getBundles();
        ArrayList arrayList = new ArrayList();
        for (Object obj : bundles) {
            int i2 = equals + 107;
            toString = i2 % 128;
            int i3 = i2 % 2;
            BundleMenu bundleMenu = (BundleMenu) obj;
            if (z) {
                if (!Intrinsics.areEqual(bundleMenu.getDestination(), RoutePathConstant.SFC_GO_MONTHLY_BUNDLE)) {
                    int i4 = toString + 61;
                    equals = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(obj);
                }
            } else if (!Intrinsics.areEqual(bundleMenu.getDestination(), RoutePathConstant.SFC_S_HOOK_BUNDLE)) {
                arrayList.add(obj);
            }
        }
        MutableStateFlow<BundlesHomeUIState> mutableStateFlow = this.component3;
        mutableStateFlow.setValue(BundlesHomeUIState.copy$default(mutableStateFlow.getValue(), arrayList, null, 2, null));
        int i6 = equals + 123;
        toString = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void updateCustomerProfile() {
        int i = 2 % 2;
        int i2 = equals + 105;
        toString = i2 % 128;
        int i3 = i2 % 2;
        component1(this.getRequestBeneficiariesState);
        int i4 = toString + 57;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void component1() {
        int i = 2 % 2;
        HaProxyRequest<HaProxyResponse<TariffResp>> haProxyRequest = new HaProxyRequest<HaProxyResponse<TariffResp>>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 105;
                ShareDataUIState = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 55;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return GsmEndpoints.GSM_QUERY_TARIFF;
                }
                obj.hashCode();
                throw null;
            }
        };
        MsisdnPayload msisdnPayload = new MsisdnPayload(getFormattedMsisdn());
        haProxyRequest.method(BaseRequest.Method.POST);
        haProxyRequest.addParams(msisdnPayload);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<TariffResp>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<TariffResp> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 53;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component1 + 35;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HaProxyResponse<TariffResp> value) {
                TariffResp body;
                int i2 = 2 % 2;
                int i3 = copydefault + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                if (value == null || (body = value.getBody()) == null) {
                    return;
                }
                OfferBundleViewModel offerBundleViewModel = this.component3;
                OfferBundleViewModel.access$setLatestTariffResp$p(offerBundleViewModel, body);
                OfferBundleViewModel.access$cacheTariff(offerBundleViewModel, body);
                offerBundleViewModel.updateCustomerProfile();
                int i5 = copydefault + 53;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 125;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                int i5 = component1 + 115;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = equals + 27;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TariffResp ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals + 33;
        toString = i2 % 128;
        int i3 = i2 % 2;
        TariffResp tariffResp = (TariffResp) SecureGsonUtils.fromJson(SPUtils.getInstance().getString(BalancesViewModel.TARIFF_CACHE_KEY), TariffResp.class);
        int i4 = equals + 7;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return tariffResp;
    }

    private final void copydefault(TariffResp tariffResp) {
        int i = 2 % 2;
        int i2 = equals + 71;
        toString = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance().put(BalancesViewModel.TARIFF_CACHE_KEY, GsonUtils.toJson(tariffResp));
        int i4 = toString + 81;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getOfferBundles() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            androidx.lifecycle.MutableLiveData<com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle>>> r1 = r11.component2
            java.lang.Object r1 = r1.getValue()
            com.huawei.payment.mvvm.Resource r1 = (com.huawei.payment.mvvm.Resource) r1
            r2 = 0
            if (r1 == 0) goto L2b
            int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.toString
            int r3 = r3 + 1
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.equals = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L24
            java.lang.Object r1 = r1.getData()
            java.util.List r1 = (java.util.List) r1
            r3 = 44
            int r3 = r3 / 0
            goto L35
        L24:
            java.lang.Object r1 = r1.getData()
            java.util.List r1 = (java.util.List) r1
            goto L35
        L2b:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.equals
            int r1 = r1 + 39
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.toString = r3
            int r1 = r1 % r0
            r1 = r2
        L35:
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L49
            int r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.equals
            int r4 = r4 + 21
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.toString = r5
            int r4 = r4 % r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L52
        L49:
            androidx.lifecycle.MutableLiveData<com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle>>> r0 = r11.component2
            com.huawei.payment.mvvm.Resource r2 = com.huawei.payment.mvvm.Resource.loading(r2)
            r0.setValue(r2)
        L52:
            java.lang.String r0 = r11.getFormattedMsisdn()
            java.lang.Object[] r6 = new java.lang.Object[]{r11, r0}
            int r8 = com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension.component1()
            int r3 = com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension.component1()
            int r4 = com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension.component1()
            int r5 = com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension.component1()
            r2 = -644495371(0xffffffffd995c7f5, float:-5.2699533E15)
            r7 = 644495371(0x266a380b, float:8.126101E-16)
            java.lang.Object r0 = component1(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = r11.getFormattedMsisdn()
            java.lang.String r3 = r11.getFormattedMsisdn()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoFetchOffersPayload r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoFetchOffersPayload
            java.lang.String r5 = "2"
            r4.<init>(r5, r2, r3, r0)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$getOfferBundles$request$1 r0 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$getOfferBundles$request$1
            r0.<init>()
            r5 = r0
            com.huawei.digitalpayment.consumer.base.util.HaProxyRequest r5 = (com.huawei.digitalpayment.consumer.base.util.HaProxyRequest) r5
            java.lang.String r6 = r11.getFormattedMsisdn()
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default(r5, r6, r7, r8, r9, r10)
            com.huawei.http.BaseRequest$Method r2 = com.huawei.http.BaseRequest.Method.POST
            r0.method(r2)
            r0.addParams(r4)
            com.huawei.http.BaseRequest r0 = (com.huawei.http.BaseRequest) r0
            com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$getOfferBundles$1 r2 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$getOfferBundles$1
            r2.<init>()
            com.huawei.common.listener.ApiCallback r2 = (com.huawei.common.listener.ApiCallback) r2
            r11.sendRequest(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.getOfferBundles():void");
    }

    private static Object component1(Object[] objArr) {
        OfferBundleViewModel offerBundleViewModel = (OfferBundleViewModel) objArr[0];
        OfferBundle offerBundle = (OfferBundle) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        if ((iIntValue2 & 4) != 0) {
            int i2 = toString + 91;
            equals = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((iIntValue2 & 8) != 0) {
            int i4 = equals + 19;
            toString = i4 % 128;
            int i5 = i4 % 2;
            str2 = "0";
        }
        if ((iIntValue2 & 16) != 0) {
            int i6 = equals + 17;
            toString = i6 % 128;
            int i7 = i6 % 2;
            zBooleanValue = false;
        }
        return offerBundleViewModel.component2(offerBundle, iIntValue, str, str2, zBooleanValue);
    }

    private final OfaMotoPurchasePayload component2(OfferBundle offerBundle, int i, String str, String str2, boolean z) {
        int i2 = 2 % 2;
        int i3 = toString + 77;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            String flashMessage = offerBundle.getFlashMessage();
            String formattedMsisdn = getFormattedMsisdn();
            String formattedMsisdn2 = getFormattedMsisdn();
            String sessionId = offerBundle.getSessionId();
            String str3 = (String) component1(-1981567462, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{this}, 1981567464, RequestBridgeExtension.component1());
            if (str3 == null) {
                str3 = "Prepaid";
            }
            OfaMotoPurchasePayload ofaMotoPurchasePayload = new OfaMotoPurchasePayload(str == null ? "" : str, flashMessage, str2, Integer.valueOf(z ? 1 : 0), "0", formattedMsisdn, formattedMsisdn2, sessionId, 1, str3, String.valueOf(offerBundle.getOfferId()), String.valueOf(offerBundle.getOfferPrice()), String.valueOf(offerBundle.getOfferType()), Integer.valueOf(i));
            int i4 = equals + 17;
            toString = i4 % 128;
            if (i4 % 2 != 0) {
                return ofaMotoPurchasePayload;
            }
            throw null;
        }
        offerBundle.getFlashMessage();
        getFormattedMsisdn();
        getFormattedMsisdn();
        offerBundle.getSessionId();
        throw null;
    }

    private final void ShareDataUIState(final String str, OfaMotoPurchasePayload ofaMotoPurchasePayload) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<OfaMotoPurchaseResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<OfaMotoPurchaseResponse>>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                String str2;
                int i2 = 2 % 2;
                int i3 = component3 + 123;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    str2 = str;
                    int i5 = 21 / 0;
                } else {
                    str2 = str;
                }
                int i6 = i4 + 73;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return str2;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, getFormattedMsisdn(), (String) null, false, 6, (Object) null);
        haProxyRequest.addParams(ofaMotoPurchasePayload);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<OfaMotoPurchaseResponse>>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<OfaMotoPurchaseResponse> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 81;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = copydefault + 61;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse> r6) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    java.lang.String r1 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                    com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r1 = r6.getHeader()
                    r2 = 0
                    if (r1 == 0) goto L83
                    java.lang.Integer r1 = r1.getResponseCode()
                    if (r1 != 0) goto L17
                    goto L83
                L17:
                    int r1 = r1.intValue()
                    r3 = 200(0xc8, float:2.8E-43)
                    if (r1 != r3) goto L83
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.component2
                    int r1 = r1 + 101
                    int r3 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.copydefault = r3
                    int r1 = r1 % r0
                    if (r1 != 0) goto L7c
                    java.lang.Object r1 = r6.getBody()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse r1 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse) r1
                    if (r1 == 0) goto L6e
                    com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r3 = r6.getHeader()
                    if (r3 == 0) goto L3e
                    java.lang.String r3 = r3.getCustomerMessage()
                    if (r3 != 0) goto L4a
                L3e:
                    com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r3 = r6.getHeader()
                    if (r3 == 0) goto L49
                    java.lang.String r3 = r3.getResponseMessage()
                    goto L4a
                L49:
                    r3 = r2
                L4a:
                    r1.setCustomerMessage(r3)
                    com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r6 = r6.getHeader()
                    if (r6 == 0) goto L6a
                    int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.copydefault
                    int r3 = r3 + 57
                    int r4 = r3 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.component2 = r4
                    int r3 = r3 % r0
                    if (r3 == 0) goto L63
                    java.lang.Integer r2 = r6.getResponseCode()
                    goto L6a
                L63:
                    r6.getResponseCode()
                    r2.hashCode()
                    throw r2
                L6a:
                    r1.setResponseCode(r2)
                    r2 = r1
                L6e:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel r6 = r5.component3
                    androidx.lifecycle.MutableLiveData r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.access$get_ofaMotoPurchaseStatus$p(r6)
                    com.huawei.payment.mvvm.Resource r0 = com.huawei.payment.mvvm.Resource.success(r2)
                    r6.setValue(r0)
                    goto Lc5
                L7c:
                    java.lang.Object r6 = r6.getBody()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoPurchaseResponse) r6
                    throw r2
                L83:
                    com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r1 = r6.getHeader()
                    if (r1 == 0) goto La2
                    int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.component2
                    int r3 = r3 + 115
                    int r4 = r3 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.copydefault = r4
                    int r3 = r3 % r0
                    if (r3 != 0) goto L9b
                    java.lang.String r0 = r1.getCustomerMessage()
                    if (r0 != 0) goto Lb3
                    goto La2
                L9b:
                    r1.getCustomerMessage()
                    r2.hashCode()
                    throw r2
                La2:
                    com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r6 = r6.getHeader()
                    if (r6 == 0) goto Lae
                    java.lang.String r6 = r6.getResponseMessage()
                    r0 = r6
                    goto Laf
                Lae:
                    r0 = r2
                Laf:
                    if (r0 != 0) goto Lb3
                    java.lang.String r0 = "Request failed, please try again later"
                Lb3:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel r6 = r5.component3
                    androidx.lifecycle.MutableLiveData r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.access$get_ofaMotoPurchaseStatus$p(r6)
                    com.huawei.common.exception.BaseException r1 = new com.huawei.common.exception.BaseException
                    r1.<init>(r0)
                    com.huawei.payment.mvvm.Resource r0 = com.huawei.payment.mvvm.Resource.error(r1, r2)
                    r6.setValue(r0)
                Lc5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel$executePurchase$1.onSuccess2(com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 55;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                OfferBundleViewModel.access$get_ofaMotoPurchaseStatus$p(this.component3).setValue(Resource.error(e, null));
                int i5 = copydefault + 39;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = equals + 57;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    public static void buyOfferBundleViaMpesa$default(OfferBundleViewModel offerBundleViewModel, OfferBundle offerBundle, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 95;
        int i4 = i3 % 128;
        toString = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            str2 = "0";
        }
        if ((i & 8) != 0) {
            int i6 = i4 + 15;
            equals = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        offerBundleViewModel.buyOfferBundleViaMpesa(offerBundle, str, str2, z);
        int i8 = equals + 77;
        toString = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void buyOfferBundleViaMpesa(OfferBundle offerBundle, String encryptedPin, String fulizaAmount, boolean fulizaEnabled) {
        int i = 2 % 2;
        int i2 = equals + 11;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(offerBundle, "");
        Intrinsics.checkNotNullParameter(encryptedPin, "");
        Intrinsics.checkNotNullParameter(fulizaAmount, "");
        ShareDataUIState(GsmEndpoints.GSM_OFFERS_BUY_WITH_MPESA, component2(offerBundle, 2, encryptedPin, fulizaAmount, fulizaEnabled));
        int i4 = equals + 5;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void buyOfferBundleViaAirtime(OfferBundle offerBundle) {
        int i = 2 % 2;
        int i2 = toString + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(offerBundle, "");
        ShareDataUIState(GsmEndpoints.GSM_OFFERS_BUY_WITH_AIRTIME, (OfaMotoPurchasePayload) component1(1562824414, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{this, offerBundle, 1, null, null, false, 28, null}, -1562824413, RequestBridgeExtension.component1()));
        int i4 = equals + 35;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void buyOfferBundleViaBonga(OfferBundle offerBundle) {
        Object objComponent1;
        int i = 2 % 2;
        int i2 = toString + 67;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(offerBundle, "");
            int iComponent1 = RequestBridgeExtension.component1();
            objComponent1 = component1(1562824414, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{this, offerBundle, 2, null, null, false, 1, null}, -1562824413, iComponent1);
        } else {
            Intrinsics.checkNotNullParameter(offerBundle, "");
            int iComponent12 = RequestBridgeExtension.component1();
            objComponent1 = component1(1562824414, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{this, offerBundle, 3, null, null, false, 28, null}, -1562824413, iComponent12);
        }
        ShareDataUIState(GsmEndpoints.GSM_OFFERS_BUY_WITH_BONGA, (OfaMotoPurchasePayload) objComponent1);
        int i3 = toString + 61;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
    }

    private static Object copydefault(Object[] objArr) {
        OfferBundleViewModel offerBundleViewModel = (OfferBundleViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 69;
        int i4 = i3 % 128;
        toString = i4;
        int i5 = i3 % 2;
        TariffResp tariffResp = offerBundleViewModel.getRequestBeneficiariesState;
        if (i5 == 0) {
            throw null;
        }
        if (tariffResp == null) {
            int i6 = i4 + 3;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        int i8 = i2 + 11;
        toString = i8 % 128;
        int i9 = i8 % 2;
        String customerType = tariffResp.getCustomerType();
        if (i9 == 0) {
            int i10 = 34 / 0;
        }
        return customerType;
    }

    private static Object ShareDataUIState(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        String str2 = new SimpleDateFormat("yyyyMMddHHmmssSSSSSS", Locale.getDefault()).format(new Date()) + str;
        int i2 = toString + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    public final void m11394getCustomerInfo() {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<CustomerInfoBody>> haProxyRequest = new HaProxyRequest<HaProxyResponse<CustomerInfoBody>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                String str = "/customer-info/api/subscriber/account/v1/customer/information/" + this.ShareDataUIState.getFormattedMsisdn();
                int i3 = component1 + 23;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return str;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, getFormattedMsisdn(), (String) null, false, 6, (Object) null);
        haProxyRequest.method(BaseRequest.Method.GET);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<CustomerInfoBody>>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<CustomerInfoBody> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component2 + 121;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
            
                if (r4.getBlazerId() == 150200) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
            
                if (r4.getBlazerId() == 150200) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
            
                r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.component2 + 43;
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.copydefault = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.CustomerInfoBody> r8) {
                /*
                    r7 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.copydefault
                    int r1 = r1 + 63
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.component2 = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    if (r1 != 0) goto L19
                    super.onSuccess(r8)
                    if (r8 == 0) goto L17
                    r1 = r3
                    goto L1f
                L17:
                    r2 = r3
                    goto L50
                L19:
                    super.onSuccess(r8)
                    if (r8 == 0) goto L50
                    r1 = r2
                L1f:
                    java.lang.Object r4 = r8.getBody()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.CustomerInfoBody r4 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.CustomerInfoBody) r4
                    if (r4 == 0) goto L4f
                    int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.copydefault
                    int r5 = r5 + 121
                    int r6 = r5 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.component2 = r6
                    int r5 = r5 % r0
                    r6 = 150200(0x24ab8, float:2.10475E-40)
                    if (r5 != 0) goto L3f
                    int r4 = r4.getBlazerId()
                    r5 = 52
                    int r5 = r5 / r2
                    if (r4 != r6) goto L4f
                    goto L45
                L3f:
                    int r2 = r4.getBlazerId()
                    if (r2 != r6) goto L4f
                L45:
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.component2
                    int r1 = r1 + 43
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.copydefault = r2
                    int r1 = r1 % r0
                    goto L17
                L4f:
                    r2 = r1
                L50:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.this
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.access$updateBundleMenus(r0, r2)
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.this
                    androidx.lifecycle.MutableLiveData r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.access$get_customerInfo$p(r0)
                    if (r8 == 0) goto L64
                    java.lang.Object r8 = r8.getBody()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.CustomerInfoBody r8 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.CustomerInfoBody) r8
                    goto L65
                L64:
                    r8 = 0
                L65:
                    com.huawei.payment.mvvm.Resource r8 = com.huawei.payment.mvvm.Resource.success(r8)
                    r0.setValue(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.AnonymousClass1.onSuccess2(com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 99;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    OfferBundleViewModel.access$get_customerInfo$p(OfferBundleViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    OfferBundleViewModel.access$get_customerInfo$p(OfferBundleViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 69 / 0;
                }
            }
        });
        int i2 = equals + 13;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }

    static CustomerProfile component3(OfferBundleViewModel offerBundleViewModel, TariffResp tariffResp, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 37;
        toString = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            tariffResp = null;
        }
        CustomerProfile customerProfileComponent1 = offerBundleViewModel.component1(tariffResp);
        int i4 = equals + 109;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return customerProfileComponent1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:4:0x000f, B:11:0x004b, B:12:0x0057, B:17:0x006c, B:19:0x007d, B:20:0x008f, B:22:0x0095, B:24:0x00a8, B:26:0x00cb, B:28:0x00d4, B:33:0x00df, B:35:0x00e6, B:37:0x00f8, B:38:0x00fd, B:39:0x00fe, B:40:0x010b, B:44:0x010f, B:45:0x0114, B:10:0x0040, B:8:0x002a), top: B:49:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile component1(com.huawei.digitalpayment.consumer.sfcui.profile.resp.TariffResp r20) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel.component1(com.huawei.digitalpayment.consumer.sfcui.profile.resp.TariffResp):com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CustomerProfile");
    }

    public final void updateFreshFridayState(List<FreshFridayResp> offers, boolean isAvailable, boolean isFreshFridayActive) {
        int i = 2 % 2;
        int i2 = equals + 117;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(offers, "");
        BuyBundlesUiState value = this.copydefault.getValue();
        this.copydefault.setValue(BuyBundlesUiState.copy$default(value, ShareDataUIState(isFreshFridayActive, value.getCurrentCategory()), null, null, offers, component1(value.getCurrentCategory(), value.getOfaMotoOffers(), offers), isAvailable, isFreshFridayActive, 6, null));
        int i4 = toString + 111;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public final void updateOfaMotoOffers(List<OfferBundle> offers) {
        int i = 2 % 2;
        int i2 = toString + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(offers, "");
        BuyBundlesUiState value = this.copydefault.getValue();
        this.copydefault.setValue(BuyBundlesUiState.copy$default(value, null, null, offers, null, component1(value.getCurrentCategory(), offers, value.getFreshFridayOffers()), false, false, 107, null));
        int i4 = equals + 17;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void selectCategory(String categoryId) {
        int i = 2 % 2;
        int i2 = equals + 5;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(categoryId, "");
        BuyBundlesUiState value = this.copydefault.getValue();
        this.copydefault.setValue(BuyBundlesUiState.copy$default(value, ShareDataUIState(value.isFreshFridayActive(), categoryId), categoryId, null, null, component1(categoryId, value.getOfaMotoOffers(), value.getFreshFridayOffers()), false, false, 108, null));
        int i4 = toString + 65;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private final List<OfferCategory> ShareDataUIState(boolean z, String str) {
        int i = 2 % 2;
        List<OfferCategory> listMutableListOf = CollectionsKt.mutableListOf(new OfferCategory("ofa_moto", "OFA Moto", Intrinsics.areEqual(str, "ofa_moto")));
        if (z) {
            listMutableListOf.add(new OfferCategory("fresh_friday", Keys.BUNDLE_TYPE_FRESH_FRIDAY, Intrinsics.areEqual(str, "fresh_friday")));
            int i2 = toString + 67;
            equals = i2 % 128;
            int i3 = i2 % 2;
        }
        return listMutableListOf;
    }

    private final List<Object> component1(String str, List<OfferBundle> list, List<FreshFridayResp> list2) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(str, "ofa_moto")) {
            if (!Intrinsics.areEqual(str, "fresh_friday")) {
                return CollectionsKt.emptyList();
            }
            int i2 = equals + 83;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return list2;
        }
        int i4 = toString + 113;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static String $r8$lambda$gWsrIgiyN6x8JIiudooSon_7pK8() {
        int i = 2 % 2;
        int i2 = equals + 111;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String strComponent3 = component3();
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return strComponent3;
    }

    static {
        if (5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static OfaMotoPurchasePayload component1(OfferBundleViewModel offerBundleViewModel, OfferBundle offerBundle, int i, String str, String str2, boolean z, int i2, Object obj) {
        return (OfaMotoPurchasePayload) component1(1562824414, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{offerBundleViewModel, offerBundle, Integer.valueOf(i), str, str2, Boolean.valueOf(z), Integer.valueOf(i2), obj}, -1562824413, RequestBridgeExtension.component1());
    }

    private final String component1(String str) {
        int iComponent1 = RequestBridgeExtension.component1();
        return (String) component1(-644495371, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{this, str}, 644495371, iComponent1);
    }

    private final String component2() {
        int iComponent1 = RequestBridgeExtension.component1();
        return (String) component1(-1981567462, RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), RequestBridgeExtension.component1(), new Object[]{this}, 1981567464, iComponent1);
    }
}
