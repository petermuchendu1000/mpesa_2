package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheType;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.caching.BundleCacheUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallAirtimePayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallMpesaPayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProductResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.NoExpiryBundleResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.RechargeInfo;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.sharedui.compose.utils.ExtensionKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001fJ\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010 \u001a\u00020!H\u0002J\u001a\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010 \u001a\u00020!H\u0002J\u0018\u0010*\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010 \u001a\u00020!J\u0016\u0010+\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b0\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "neoBundlesRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/NeoBundlesRepository;", "bundleCacheUtil", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/caching/BundleCacheUtil;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/NeoBundlesRepository;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/caching/BundleCacheUtil;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "_noExpiryBundlesData", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "noExpiryBundlesData", "Landroidx/lifecycle/LiveData;", "getNoExpiryBundlesData", "()Landroidx/lifecycle/LiveData;", "allBundles", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/noexpiry/NoExpiryBundlesUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getData", "onAmountChanged", "", "amount", "", "getNeoBundles", "updateBundleView", "createNoExpiryAirtimePayload", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallAirtimePayload;", "rechargeInfo", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/RechargeInfo;", "createNoExpiryMpesaPayload", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallMpesaPayload;", "buyNoExpiryViaAirtime", "buyNoExpiryViaMpesa", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoExpiryViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int equals = 0;
    private static int getAsAtTimestamp = 15 % 128;
    private static int getRequestBeneficiariesState = 0;
    private static int hashCode = 1;
    private List<DataCallProductResponse> ShareDataUIState;
    private final MutableStateFlow<NoExpiryBundlesUiState> component1;
    private final MutableLiveData<Resource<List<DataCallProductResponse>>> component2;
    private final MutableLiveData<Resource<HaProxyResponse<Object>>> component3;
    private final NeoBundlesRepository component4;
    private final StateFlow<NoExpiryBundlesUiState> copy;
    private final BundleCacheUtil copydefault;

    public static final BundleCacheUtil access$getBundleCacheUtil$p(NoExpiryViewModel noExpiryViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 35;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        BundleCacheUtil bundleCacheUtil = noExpiryViewModel.copydefault;
        int i5 = i3 + 85;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return bundleCacheUtil;
        }
        throw null;
    }

    public static final MutableLiveData access$getData$p(NoExpiryViewModel noExpiryViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<HaProxyResponse<Object>>> mutableLiveData = noExpiryViewModel.component3;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return mutableLiveData;
    }

    public static final NeoBundlesRepository access$getNeoBundlesRepository$p(NoExpiryViewModel noExpiryViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 107;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        NeoBundlesRepository neoBundlesRepository = noExpiryViewModel.component4;
        int i5 = i3 + 89;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return neoBundlesRepository;
    }

    public static final MutableLiveData access$get_noExpiryBundlesData$p(NoExpiryViewModel noExpiryViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<List<DataCallProductResponse>>> mutableLiveData = noExpiryViewModel.component2;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_uiState$p(NoExpiryViewModel noExpiryViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<NoExpiryBundlesUiState> mutableStateFlow = noExpiryViewModel.component1;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return mutableStateFlow;
    }

    public static final void access$setAllBundles$p(NoExpiryViewModel noExpiryViewModel, List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 17;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        noExpiryViewModel.ShareDataUIState = list;
        int i5 = i2 + 37;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$updateBundleView(NoExpiryViewModel noExpiryViewModel, String str) {
        int i = 2 % 2;
        int i2 = hashCode + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        noExpiryViewModel.component2(str);
        int i4 = hashCode + 45;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public NoExpiryViewModel(NeoBundlesRepository neoBundlesRepository, BundleCacheUtil bundleCacheUtil) {
        Intrinsics.checkNotNullParameter(neoBundlesRepository, "");
        Intrinsics.checkNotNullParameter(bundleCacheUtil, "");
        this.component4 = neoBundlesRepository;
        this.copydefault = bundleCacheUtil;
        this.component3 = new MutableLiveData<>();
        this.component2 = new MutableLiveData<>();
        this.ShareDataUIState = CollectionsKt.emptyList();
        MutableStateFlow<NoExpiryBundlesUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new NoExpiryBundlesUiState(null, null, false, false, 15, null));
        this.component1 = MutableStateFlow;
        this.copy = MutableStateFlow;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass4(null), 3, null);
    }

    public final LiveData<Resource<List<DataCallProductResponse>>> getNoExpiryBundlesData() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 93;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<DataCallProductResponse>>> mutableLiveData = this.component2;
        int i5 = i2 + 117;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final StateFlow<NoExpiryBundlesUiState> getUiState() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        StateFlow<NoExpiryBundlesUiState> stateFlow = this.copy;
        int i5 = i3 + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return stateFlow;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel$1", f = "NoExpiryViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;

        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "catalog", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel$1$1", f = "NoExpiryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends DataCallProductResponse>, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int component3;
            Object ShareDataUIState;
            int component1;
            final NoExpiryViewModel copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 29;
                component2 = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component1 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.ShareDataUIState;
                NoExpiryViewModel.access$setAllBundles$p(this.copydefault, list);
                NoExpiryViewModel.access$get_noExpiryBundlesData$p(this.copydefault).setValue(Resource.success(list));
                NoExpiryViewModel noExpiryViewModel = this.copydefault;
                NoExpiryViewModel.access$updateBundleView(noExpiryViewModel, ((NoExpiryBundlesUiState) NoExpiryViewModel.access$get_uiState$p(noExpiryViewModel).getValue()).getAmountInput());
                Unit unit = Unit.INSTANCE;
                int i3 = component3 + 59;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(NoExpiryViewModel noExpiryViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.copydefault = noExpiryViewModel;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.copydefault, continuation);
                anonymousClass3.ShareDataUIState = obj;
                AnonymousClass3 anonymousClass32 = anonymousClass3;
                int i2 = component3 + 17;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 84 / 0;
                }
                return anonymousClass32;
            }

            @Override
            public Object invoke(List<? extends DataCallProductResponse> list, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 7;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(list, continuation);
                int i4 = component2 + 19;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return objComponent1;
            }

            public final Object component1(List<DataCallProductResponse> list, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 41;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 35;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (FlowKt.collectLatest(NoExpiryViewModel.access$getNeoBundlesRepository$p(NoExpiryViewModel.this).getAllBundles(), new AnonymousClass3(NoExpiryViewModel.this, null), this) == coroutine_suspended) {
                    int i3 = component1 + 31;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component1 + 81;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i6 = 87 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            }
            return Unit.INSTANCE;
        }

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = NoExpiryViewModel.this.new AnonymousClass4(continuation);
            int i2 = ShareDataUIState + 117;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return anonymousClass4;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 55;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(coroutineScope2, continuation2);
            }
            component1(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                anonymousClass4.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass4.invokeSuspend(unit);
            int i4 = ShareDataUIState + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final MutableLiveData<Resource<HaProxyResponse<Object>>> getData() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 47;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<HaProxyResponse<Object>>> mutableLiveData = this.component3;
        int i5 = i2 + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return mutableLiveData;
    }

    public final void getNeoBundles() {
        int i = 2 % 2;
        if (this.copydefault.shouldFetchRemote(BundleCacheType.NO_EXPIRY)) {
            final boolean z = false;
            if (ExtensionKt.isNotNull(this.component2.getValue())) {
                Resource<List<DataCallProductResponse>> value = this.component2.getValue();
                Intrinsics.checkNotNull(value);
                if (value.success()) {
                    int i2 = getRequestBeneficiariesState + 81;
                    hashCode = i2 % 128;
                    int i3 = i2 % 2;
                    Resource<List<DataCallProductResponse>> value2 = this.component2.getValue();
                    Intrinsics.checkNotNull(value2);
                    Intrinsics.checkNotNullExpressionValue(value2.getData(), "");
                    if (!r1.isEmpty()) {
                        int i4 = getRequestBeneficiariesState + 21;
                        hashCode = i4 % 128;
                        if (i4 % 2 != 0) {
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                int i5 = getRequestBeneficiariesState + 15;
                hashCode = i5 % 128;
                int i6 = i5 % 2;
                this.component2.setValue(Resource.loading(null));
            }
            HaProxyRequest<HaProxyResponse<NoExpiryBundleResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<NoExpiryBundleResponse>>() {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                @Override
                public String getApiPath() {
                    int i7 = 2 % 2;
                    int i8 = ShareDataUIState + 117;
                    copydefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        return GsmEndpoints.GSM_NEO_BUNDLES_CATALOG;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
            haProxyRequest.method(BaseRequest.Method.GET);
            sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<NoExpiryBundleResponse>>() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public void onSuccess(HaProxyResponse<NoExpiryBundleResponse> haProxyResponse) {
                    int i7 = 2 % 2;
                    int i8 = component3 + 17;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                    onSuccess2(haProxyResponse);
                    int i10 = component3 + 17;
                    component1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                }

                public void onSuccess2(HaProxyResponse<NoExpiryBundleResponse> value3) {
                    NoExpiryBundleResponse body;
                    int i7 = 2 % 2;
                    int i8 = component1 + 23;
                    component3 = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 != 0) {
                        super.onSuccess(value3);
                        obj.hashCode();
                        throw null;
                    }
                    super.onSuccess(value3);
                    if (value3 == null || (body = value3.getBody()) == null) {
                        return;
                    }
                    NoExpiryViewModel noExpiryViewModel = NoExpiryViewModel.this;
                    onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(noExpiryViewModel), Dispatchers.getIO(), null, new component2(noExpiryViewModel, body, null), 2, null);
                    int i9 = component3 + 81;
                    component1 = i9 % 128;
                    int i10 = i9 % 2;
                }

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel$getNeoBundles$1$onSuccess$1$1", f = "NoExpiryViewModel.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
                static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    private static int component1 = 0;
                    private static int component2 = 1;
                    final NoExpiryViewModel ShareDataUIState;
                    final NoExpiryBundleResponse component3;
                    int copydefault;

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = component1 + 41;
                        component2 = i2 % 128;
                        int i3 = i2 % 2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i4 = this.copydefault;
                        if (i4 == 0) {
                            ResultKt.throwOnFailure(obj);
                            NeoBundlesRepository neoBundlesRepositoryAccess$getNeoBundlesRepository$p = NoExpiryViewModel.access$getNeoBundlesRepository$p(this.ShareDataUIState);
                            List<DataCallProductResponse> productCatalog = this.component3.getProductCatalog();
                            if (productCatalog == null) {
                                int i5 = component2 + 123;
                                component1 = i5 % 128;
                                int i6 = i5 % 2;
                                return Unit.INSTANCE;
                            }
                            this.copydefault = 1;
                            if (neoBundlesRepositoryAccess$getNeoBundlesRepository$p.saveBundles(productCatalog, this) == coroutine_suspended) {
                                int i7 = component1 + 17;
                                component2 = i7 % 128;
                                int i8 = i7 % 2;
                                return coroutine_suspended;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i9 = component2 + 43;
                            component1 = i9 % 128;
                            if (i9 % 2 != 0) {
                                ResultKt.throwOnFailure(obj);
                                throw null;
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        NoExpiryViewModel.access$getBundleCacheUtil$p(this.ShareDataUIState).setLastCached(BundleCacheType.NO_EXPIRY);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    component2(NoExpiryViewModel noExpiryViewModel, NoExpiryBundleResponse noExpiryBundleResponse, Continuation<? super component2> continuation) {
                        super(2, continuation);
                        this.ShareDataUIState = noExpiryViewModel;
                        this.component3 = noExpiryBundleResponse;
                    }

                    @Override
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        int i = 2 % 2;
                        component2 component2Var = new component2(this.ShareDataUIState, this.component3, continuation);
                        int i2 = component2 + 3;
                        component1 = i2 % 128;
                        if (i2 % 2 == 0) {
                            return component2Var;
                        }
                        throw null;
                    }

                    @Override
                    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        int i = 2 % 2;
                        int i2 = component2 + 5;
                        component1 = i2 % 128;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        Continuation<? super Unit> continuation2 = continuation;
                        if (i2 % 2 == 0) {
                            return component3(coroutineScope2, continuation2);
                        }
                        component3(coroutineScope2, continuation2);
                        throw null;
                    }

                    public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        int i = 2 % 2;
                        int i2 = component1 + 13;
                        component2 = i2 % 128;
                        int i3 = i2 % 2;
                        component2 component2Var = (component2) create(coroutineScope, continuation);
                        if (i3 != 0) {
                            return component2Var.invokeSuspend(Unit.INSTANCE);
                        }
                        component2Var.invokeSuspend(Unit.INSTANCE);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                @Override
                public void onError(BaseException e) {
                    MutableStateFlow mutableStateFlowAccess$get_uiState$p;
                    Object value3;
                    int i7 = 2 % 2;
                    int i8 = component1 + 115;
                    component3 = i8 % 128;
                    int i9 = i8 % 2;
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    if (z) {
                        return;
                    }
                    int i10 = component1 + 91;
                    component3 = i10 % 128;
                    if (i10 % 2 != 0) {
                        NoExpiryViewModel.access$get_noExpiryBundlesData$p(NoExpiryViewModel.this).setValue(Resource.error(e, null));
                        mutableStateFlowAccess$get_uiState$p = NoExpiryViewModel.access$get_uiState$p(NoExpiryViewModel.this);
                        int i11 = 26 / 0;
                    } else {
                        NoExpiryViewModel.access$get_noExpiryBundlesData$p(NoExpiryViewModel.this).setValue(Resource.error(e, null));
                        mutableStateFlowAccess$get_uiState$p = NoExpiryViewModel.access$get_uiState$p(NoExpiryViewModel.this);
                    }
                    do {
                        value3 = mutableStateFlowAccess$get_uiState$p.getValue();
                    } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value3, NoExpiryBundlesUiState.copy$default((NoExpiryBundlesUiState) value3, null, CollectionsKt.emptyList(), false, false, 13, null)));
                }
            });
        }
    }

    static DataCallAirtimePayload component2(NoExpiryViewModel noExpiryViewModel, RechargeInfo rechargeInfo, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = getRequestBeneficiariesState + 7;
            int i4 = i3 % 128;
            hashCode = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 23;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 4;
            }
            str = "0";
        }
        return noExpiryViewModel.ShareDataUIState(rechargeInfo, str);
    }

    private final DataCallAirtimePayload ShareDataUIState(RechargeInfo rechargeInfo, String str) {
        String beneficiaryMsisdn;
        int i = 2 % 2;
        if (!(!StringsKt.equals(rechargeInfo.getTransactionType(), "other", true))) {
            int i2 = getRequestBeneficiariesState + 35;
            hashCode = i2 % 128;
            if (i2 % 2 == 0) {
                rechargeInfo.getBeneficiaryMsisdn();
                throw null;
            }
            beneficiaryMsisdn = rechargeInfo.getBeneficiaryMsisdn();
        } else {
            beneficiaryMsisdn = "";
        }
        DataCallAirtimePayload dataCallAirtimePayload = new DataCallAirtimePayload(rechargeInfo.getProductId(), rechargeInfo.getTransactionType(), rechargeInfo.getSponsorMsisdn(), str, beneficiaryMsisdn);
        int i3 = hashCode + 109;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return dataCallAirtimePayload;
    }

    static DataCallMpesaPayload copydefault(NoExpiryViewModel noExpiryViewModel, RechargeInfo rechargeInfo, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = hashCode + 43;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 1;
            hashCode = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str = "0";
        }
        return noExpiryViewModel.copydefault(rechargeInfo, str);
    }

    public static void buyNoExpiryViaAirtime$default(NoExpiryViewModel noExpiryViewModel, RechargeInfo rechargeInfo, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = hashCode + 11;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 59;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            str = "0";
        }
        noExpiryViewModel.buyNoExpiryViaAirtime(rechargeInfo, str);
    }

    public final void buyNoExpiryViaAirtime(RechargeInfo rechargeInfo, String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rechargeInfo, "");
        Intrinsics.checkNotNullParameter(amount, "");
        this.component3.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() throws Throwable {
                int i2;
                long j;
                CharSequence charSequence;
                int i3;
                long j2;
                int i4;
                int i5;
                int i6 = 2 % 2;
                int i7 = copydefault + 23;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getEdgeSlop() >> 16), 32 - ImageFormat.getBitsPerPixel(0), (char) (View.MeasureSpec.getMode(0) + 19696), 518907119, false, "component3", null);
                    }
                    int i8 = ((Field) objCopydefault).getInt(null);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, Color.alpha(0) + 30, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 55511118, false, "component2", null);
                    }
                    i2 = ((Field) objCopydefault2).getInt(null);
                    j = i2;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - KeyEvent.normalizeMetaState(0), TextUtils.getTrimmedLength("") + 30, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 58536393, false, "component3", null);
                    }
                    i3 = ((Field) objCopydefault3).getInt(null);
                    long j3 = -1;
                    long j4 = j3 ^ 293057805216177640L;
                    long jIdentityHashCode = System.identityHashCode(this);
                    long j5 = (j4 | jIdentityHashCode) ^ j3;
                    long j6 = 140;
                    long j7 = j3 ^ 499645648428026784L;
                    long j8 = jIdentityHashCode ^ j3;
                    j2 = (((long) 141) * 293057805216177640L) + (((long) (-139)) * 499645648428026784L) + (((long) (-280)) * (((j4 | 499645648428026784L) ^ j3) | j5)) + ((j5 | ((j7 | jIdentityHashCode) ^ j3)) * j6) + (j6 * ((((j4 | j7) | jIdentityHashCode) ^ j3) | (((j4 | j8) | 499645648428026784L) ^ j3) | (j3 ^ ((j7 | j8) | 293057805216177640L))));
                    i4 = i8;
                    charSequence = "";
                    i5 = 1;
                } else {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 19, View.MeasureSpec.getMode(0) + 33, (char) (Color.red(0) + 19696), 518907119, false, "component3", null);
                    }
                    int i9 = ((Field) objCopydefault4).getInt(null);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                    if (objCopydefault5 == null) {
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, 30 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 55511118, false, "component2", null);
                    }
                    i2 = ((Field) objCopydefault5).getInt(null);
                    j = i2;
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                    if (objCopydefault6 == null) {
                        charSequence = "";
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf(charSequence, '0') + 38, 30 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 58536393, false, "component3", null);
                    } else {
                        charSequence = "";
                    }
                    i3 = ((Field) objCopydefault6).getInt(null);
                    long j9 = 628;
                    long j10 = (j9 * 322031306894540534L) + (j9 * 470672146749663890L);
                    long j11 = -627;
                    long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    long j12 = -1;
                    j2 = j10 + ((jMaxMemory | 470672146749663890L | (j12 ^ 322031306894540534L)) * j11) + (j11 * ((((j12 ^ 470672146749663890L) | jMaxMemory) ^ j12) | 322031306894540534L)) + (((long) 627) * ((((jMaxMemory ^ j12) | 470672146749663890L) ^ j12) | ((jMaxMemory | 322031306894540534L) ^ j12)));
                    i4 = i9;
                    i5 = 0;
                }
                while (true) {
                    for (int i10 = 0; i10 != 8; i10++) {
                        i3 = (((((int) (j >> i10)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    }
                    if (i5 != 0) {
                        break;
                    }
                    i5++;
                    j = j2;
                }
                if (i3 != i4) {
                    int i11 = ShareDataUIState + 43;
                    copydefault = i11 % 128;
                    int i12 = i11 % 2;
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19695), 1457147715, false, "copydefault", null);
                    }
                    Object obj = ((Field) objCopydefault7).get(null);
                    long j13 = -1;
                    long j14 = 0;
                    long j15 = (((long) (i4 ^ i2)) & ((((long) 0) << 32) | (j13 - ((j13 >> 63) << 32)))) | (((long) 1) << 32) | (j14 - ((j14 >> 63) << 32));
                    try {
                        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault8 == null) {
                            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getFadingEdgeLength() >> 16), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.getDefaultSize(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                        Object[] objArr = {1939721576, Long.valueOf(j15), obj, null, false, false};
                        Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault9 == null) {
                            objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode(charSequence, 0, 0) + 6562, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 55, (char) TextUtils.getOffsetBefore(charSequence, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault9).invoke(objInvoke, objArr);
                        Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                        return GsmEndpoints.GSM_NEO_BUNDLES_PURCHASE_AIRTIME;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                return GsmEndpoints.GSM_NEO_BUNDLES_PURCHASE_AIRTIME;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(ShareDataUIState(rechargeInfo, amount));
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 57;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = ShareDataUIState + 75;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 93;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(value);
                    NoExpiryViewModel.access$getData$p(NoExpiryViewModel.this).setValue(Resource.success(value));
                    int i4 = component1 + 21;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 54 / 0;
                        return;
                    }
                    return;
                }
                super.onSuccess(value);
                NoExpiryViewModel.access$getData$p(NoExpiryViewModel.this).setValue(Resource.success(value));
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 105;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                NoExpiryViewModel.access$getData$p(NoExpiryViewModel.this).setValue(Resource.error(e, null));
                int i5 = component1 + 31;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 63;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void buyNoExpiryViaMpesa(RechargeInfo rechargeInfo, String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rechargeInfo, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Object obj = null;
        this.component3.setValue(Resource.loading(null));
        HaProxyRequest<HaProxyResponse<Object>> haProxyRequest = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                int i4 = i3 % 128;
                component1 = i4;
                if (i3 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                int i6 = i4 + 93;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return GsmEndpoints.GSM_NEO_BUNDLES_PURCHASE_MPESA;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(copydefault(rechargeInfo, amount));
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<Object>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component3 + 107;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component3 + 35;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 69;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    NoExpiryViewModel.access$getData$p(NoExpiryViewModel.this).setValue(Resource.success(value));
                    throw null;
                }
                NoExpiryViewModel.access$getData$p(NoExpiryViewModel.this).setValue(Resource.success(value));
                int i4 = copydefault + 89;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 71 / 0;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 119;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                NoExpiryViewModel.access$getData$p(NoExpiryViewModel.this).setValue(Resource.error(e, null));
                int i5 = copydefault + 113;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = hashCode + 113;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAmountChanged(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.Double r1 = kotlin.text.StringsKt.toDoubleOrNull(r14)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L40
            double r4 = r1.doubleValue()
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L40
            int r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.hashCode
            int r4 = r4 + 79
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.getRequestBeneficiariesState = r5
            int r4 = r4 % r0
            r5 = 4647486117027774464(0x407f300000000000, double:499.0)
            if (r4 == 0) goto L36
            double r7 = r1.doubleValue()
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r4 = 87
            int r4 = r4 / r3
            if (r1 > 0) goto L40
            goto L3e
        L36:
            double r7 = r1.doubleValue()
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 > 0) goto L40
        L3e:
            r1 = r2
            goto L41
        L40:
            r1 = r3
        L41:
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState> r4 = r13.component1
        L43:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState) r6
            r7 = r14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = kotlin.text.StringsKt.isBlank(r7)
            r7 = r7 ^ r2
            if (r7 == 0) goto L65
            int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.hashCode
            int r7 = r7 + 51
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.getRequestBeneficiariesState = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L63
            if (r1 != 0) goto L65
            r9 = r2
            goto L66
        L63:
            r14 = 0
            throw r14
        L65:
            r9 = r3
        L66:
            if (r1 == 0) goto L7a
            java.util.List r7 = r6.getBundles()
            int r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.hashCode
            int r8 = r8 + 35
            int r10 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.getRequestBeneficiariesState = r10
            int r8 = r8 % r0
            if (r8 == 0) goto L7e
            r8 = 4
            int r8 = r8 / r8
            goto L7e
        L7a:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L7e:
            r8 = r7
            r10 = 0
            r11 = 8
            r12 = 0
            r7 = r14
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState.copy$default(r6, r7, r8, r9, r10, r11, r12)
            boolean r5 = r4.compareAndSet(r5, r6)
            if (r5 == 0) goto L43
            if (r1 == 0) goto L94
            r13.component2(r14)
            goto Lb1
        L94:
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState> r5 = r13.component1
        L96:
            java.lang.Object r14 = r5.getValue()
            r6 = r14
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState) r6
            r7 = 0
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryBundlesUiState.copy$default(r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r5.compareAndSet(r14, r0)
            if (r14 == 0) goto L96
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.onAmountChanged(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component2(java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel.component2(java.lang.String):void");
    }

    private final DataCallMpesaPayload copydefault(RechargeInfo rechargeInfo, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = ProfileHelper.INSTANCE.getProfiles().iterator();
        while (!(!it.hasNext())) {
            int i4 = hashCode + 11;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(((LocalProfileItem) it.next()).getName(), "Tariff");
                throw null;
            }
            LocalProfileItem localProfileItem = (LocalProfileItem) it.next();
            if (Intrinsics.areEqual(localProfileItem.getName(), "Tariff")) {
                int i5 = getRequestBeneficiariesState + 35;
                hashCode = i5 % 128;
                int i6 = i5 % 2;
                return new DataCallMpesaPayload(rechargeInfo.getProductId(), rechargeInfo.getTransactionType(), rechargeInfo.getSponsorMsisdn(), str, localProfileItem.getValue(), StringsKt.equals(rechargeInfo.getTransactionType(), "other", true) ? rechargeInfo.getBeneficiaryMsisdn() : "");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    static {
        int i = 15 % 2;
    }
}
