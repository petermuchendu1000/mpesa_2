package com.huawei.digitalpayment.consumer.home.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.blankj.utilcode.util.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction;
import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunctionGroup;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory;
import com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState;
import com.huawei.digitalpayment.consumer.home.ui.utils.LocalHomeFunctionItems;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction;
import com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection;
import com.huawei.digitalpayment.home.data.HomeConfigManager;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeConfig;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nJ\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020!J\u000e\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020!J\u0006\u0010,\u001a\u00020'J\b\u0010-\u001a\u00020\nH\u0002J\u000e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015J\u0006\u00100\u001a\u00020'J\u000e\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\u0015J\u0006\u00103\u001a\u00020'J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0010H\u0002J\u001c\u00106\u001a\b\u0012\u0004\u0012\u000208072\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00150:H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u0010/\u001a\u00020\u0015H\u0002J\u001e\u0010<\u001a\u00020 2\u0006\u0010*\u001a\u00020!2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020!0:H\u0002J*\u0010>\u001a\b\u0012\u0004\u0012\u00020?072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020!0:H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/QuickActionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "_editEnable", "", "createAllFunctionGroup", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunctionGroup;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/QuickActionsUiState;", "maxCount", "", "minCount", "_category", "", "_searchText", "_composeUiState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsState;", "composeUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getComposeUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_functionMapping", "", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickAction;", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "functionMapping", "", "getFunctionMapping", "()Ljava/util/Map;", "setEditEnable", "", "editEnable", "removeTempFunction", "function", "addTempFunction", "updateMyService", "hasChange", "updateGroupByCategory", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "cleanException", "updateViewBySearch", "text", "reset", "convertUiState", "item", "convertCategories", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", FirebaseAnalytics.Param.ITEMS, "", "mapCategory", "mapHomeFunction", "currentItems", "mapQuickActionGroups", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionSection;", "homeServiceGroups", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int coroutineBoundary = 1;
    private static int getShareableDataState = 1;
    private static int toString;
    private boolean ShareDataUIState;
    private String component1;
    private final Map<QuickAction, SFCLocalHomeFunction> component2;
    private final Flow<QuickActionsState> component3;
    private final Context component4;
    private final int copy;
    private String copydefault;
    private final Map<QuickAction, SFCLocalHomeFunction> equals;
    private List<SFCLocalHomeFunctionGroup> getAsAtTimestamp;
    private final StateFlow<QuickActionsState> getRequestBeneficiariesState;
    private final MutableStateFlow<QuickActionsUiState> getSponsorBeneficiariesState;
    private final int hashCode;

    public static final QuickActionsState access$convertUiState(QuickActionsViewModel quickActionsViewModel, QuickActionsUiState quickActionsUiState) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 117;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        QuickActionsState quickActionsStateComponent3 = quickActionsViewModel.component3(quickActionsUiState);
        int i4 = coroutineBoundary + 25;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return quickActionsStateComponent3;
    }

    public static final MutableStateFlow access$getUiState$p(QuickActionsViewModel quickActionsViewModel) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 41;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        Object obj = null;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow = quickActionsViewModel.getSponsorBeneficiariesState;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 105;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public final Context getContext() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 31;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.component4;
        int i5 = i2 + 23;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return context;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QuickActionsViewModel(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context r18) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.<init>(android.content.Context):void");
    }

    public final StateFlow<QuickActionsState> getComposeUiState() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 79;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<QuickActionsState> stateFlow = this.getRequestBeneficiariesState;
        int i5 = i2 + 121;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<QuickAction, SFCLocalHomeFunction> getFunctionMapping() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 97;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        Map<QuickAction, SFCLocalHomeFunction> map = this.equals;
        int i5 = i3 + 39;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<QuickActionsUiState> uiState() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 71;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = mutableStateFlow;
        int i4 = ArtificialStackFrames + 41;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableStateFlow2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void updateMyService() throws Throwable {
        QuickActionsUiState value;
        QuickActionsUiState value2;
        int i = 2 % 2;
        Object obj = null;
        if (!copydefault()) {
            MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, true, null, null, null, false, null, null, null, 477, null)));
            int i2 = ArtificialStackFrames + 87;
            coroutineBoundary = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, QuickActionsUiState.copy$default(value, true, false, null, null, null, false, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        final List<SFCLocalHomeFunction> currentHomeServiceFunctions = this.getSponsorBeneficiariesState.getValue().getCurrentHomeServiceFunctions();
        if (currentHomeServiceFunctions.isEmpty()) {
            int i3 = ArtificialStackFrames + 63;
            coroutineBoundary = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 27;
                int i6 = i5 % 128;
                component2 = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 13;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 95 / 0;
                }
                return "updateMyService";
            }
        };
        JsonArray jsonArray = new JsonArray();
        int size = currentHomeServiceFunctions.size();
        for (int i4 = 0; i4 < size; i4++) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("funcId", currentHomeServiceFunctions.get(i4).getFunctionId());
            jsonObject.addProperty("order", String.valueOf(i4));
            jsonArray.add(jsonObject);
        }
        paymentRequest.addParams("configs", jsonArray);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i5 = 2 % 2;
                int i6 = component2 + 29;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                onSuccess2(baseResp);
                if (i7 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.http.BaseResp r14) {
                /*
                    r13 = this;
                    r14 = 2
                    int r0 = r14 % r14
                    int r0 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.component1
                    int r0 = r0 + 21
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.component2 = r1
                    int r0 = r0 % r14
                    if (r0 != 0) goto L60
                    com.huawei.digitalpayment.home.data.HomeConfigManager r0 = com.huawei.digitalpayment.home.data.HomeConfigManager.INSTANCE
                    com.huawei.digitalpayment.consumer.home.ui.utils.LocalHomeFunctionItems r1 = com.huawei.digitalpayment.consumer.home.ui.utils.LocalHomeFunctionItems.INSTANCE
                    java.util.List<com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction> r2 = r1
                    java.util.List r1 = r1.convertLocalHomeFunction(r2)
                    if (r1 == 0) goto L2c
                    int r2 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.component2
                    int r2 = r2 + 119
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.component1 = r3
                    int r2 = r2 % r14
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
                    if (r1 == 0) goto L2c
                    goto L39
                L2c:
                    java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                    int r2 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.component1
                    int r2 = r2 + 67
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.component2 = r3
                    int r2 = r2 % r14
                L39:
                    r0.updateHomeServices(r1)
                    com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel r14 = r2
                    kotlinx.coroutines.flow.MutableStateFlow r14 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.access$getUiState$p(r14)
                L42:
                    java.lang.Object r0 = r14.getValue()
                    r1 = r0
                    com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState r1 = (com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState) r1
                    r2 = 0
                    r3 = 1
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 476(0x1dc, float:6.67E-43)
                    r12 = 0
                    com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState r1 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    boolean r0 = r14.compareAndSet(r0, r1)
                    if (r0 == 0) goto L42
                    return
                L60:
                    com.huawei.digitalpayment.home.data.HomeConfigManager r14 = com.huawei.digitalpayment.home.data.HomeConfigManager.INSTANCE
                    com.huawei.digitalpayment.consumer.home.ui.utils.LocalHomeFunctionItems r14 = com.huawei.digitalpayment.consumer.home.ui.utils.LocalHomeFunctionItems.INSTANCE
                    java.util.List<com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction> r0 = r1
                    r14.convertLocalHomeFunction(r0)
                    r14 = 0
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.AnonymousClass3.onSuccess2(com.huawei.http.BaseResp):void");
            }

            @Override
            public void onError(BaseException e) {
                Object value3;
                int i5 = 2 % 2;
                int i6 = component2 + 93;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    QuickActionsViewModel.access$getUiState$p(this);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow mutableStateFlowAccess$getUiState$p = QuickActionsViewModel.access$getUiState$p(this);
                int i7 = component2 + 115;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, QuickActionsUiState.copy$default((QuickActionsUiState) value3, false, false, e, null, null, false, null, null, null, TypedValues.PositionType.TYPE_PERCENT_X, null)));
            }
        });
        int i5 = coroutineBoundary + 7;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean copydefault() {
        List<LocalHomeFunction> listEmptyList;
        int i = 2 % 2;
        List<SFCLocalHomeFunction> currentHomeServiceFunctions = this.getSponsorBeneficiariesState.getValue().getCurrentHomeServiceFunctions();
        LocalFunctionGroup homeServicesMenu = HomeConfigManager.INSTANCE.getHomeServicesMenu();
        if (homeServicesMenu == null || (listEmptyList = homeServicesMenu.getList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (currentHomeServiceFunctions.size() != listEmptyList.size()) {
            return true;
        }
        int size = currentHomeServiceFunctions.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = coroutineBoundary + 55;
            ArtificialStackFrames = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.areEqual(currentHomeServiceFunctions.get(i2).getFunctionId(), listEmptyList.get(i2).getFuncId());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(currentHomeServiceFunctions.get(i2).getFunctionId(), listEmptyList.get(i2).getFuncId())) {
                int i4 = ArtificialStackFrames + 51;
                coroutineBoundary = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            i2++;
            int i6 = ArtificialStackFrames + 13;
            coroutineBoundary = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    private final QuickActionsState component3(QuickActionsUiState quickActionsUiState) {
        int i = 2 % 2;
        List<SFCLocalHomeFunction> currentHomeServiceFunctions = quickActionsUiState.getCurrentHomeServiceFunctions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentHomeServiceFunctions, 10));
        Iterator<T> it = currentHomeServiceFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(ShareDataUIState((SFCLocalHomeFunction) it.next(), CollectionsKt.emptyList()));
        }
        PersistentList persistentList = ExtensionsKt.toPersistentList(arrayList);
        ImmutableList<QuickActionSection> immutableListCopydefault = copydefault(quickActionsUiState.getHomeServiceGroups(), quickActionsUiState.getCurrentHomeServiceFunctions());
        ImmutableList<QuickActionsCategory> immutableListComponent2 = component2(quickActionsUiState.getCategoryMutableList());
        String searchQuery = quickActionsUiState.getSearchQuery();
        String groupName = quickActionsUiState.getGroupName();
        if (groupName.length() == 0) {
            groupName = "All";
            int i2 = ArtificialStackFrames + 113;
            coroutineBoundary = i2 % 128;
            int i3 = i2 % 2;
        }
        PersistentList persistentList2 = persistentList;
        QuickActionsState quickActionsState = new QuickActionsState(immutableListCopydefault, persistentList2, searchQuery, quickActionsUiState.isInEditMode(), immutableListComponent2, component3(groupName), quickActionsUiState.getLoading());
        int i4 = coroutineBoundary + 55;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return quickActionsState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ImmutableList<QuickActionsCategory> component2(List<String> list) {
        int i = 2 % 2;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (!(!it.hasNext())) {
            int i2 = coroutineBoundary + 29;
            ArtificialStackFrames = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(component3((String) it.next()));
            int i4 = coroutineBoundary + 85;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
        }
        return ExtensionsKt.toPersistentList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory component3(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.coroutineBoundary
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.ArtificialStackFrames = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "all"
            java.lang.String r4 = ""
            r5 = 0
            if (r1 == 0) goto L2a
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r7.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 4
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r3, r2, r4, r5)
            r2 = 1
            if (r1 == r2) goto L3d
            goto L42
        L2a:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r7.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r3, r2, r0, r5)
            if (r1 == 0) goto L42
        L3d:
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory$All r7 = com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.All.INSTANCE
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory r7 = (com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory) r7
            goto L4a
        L42:
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory$FromTitle r1 = new com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory$FromTitle
            r1.<init>(r7)
            r7 = r1
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory r7 = (com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory) r7
        L4a:
            int r1 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.coroutineBoundary
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.ArtificialStackFrames = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L56
            return r7
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.component3(java.lang.String):com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction ShareDataUIState(com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction r20, java.util.List<com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            int r2 = r1 % r1
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState> r2 = r0.getSponsorBeneficiariesState
            java.lang.Object r2 = r2.getValue()
            com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState r2 = (com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsUiState) r2
            boolean r2 = r2.isInEditMode()
            r3 = r21
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r3.next()
            com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction r5 = (com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction) r5
            java.lang.String r5 = r5.getFunctionId()
            r4.add(r5)
            int r5 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.coroutineBoundary
            int r5 = r5 + 41
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.ArtificialStackFrames = r6
            int r5 = r5 % r1
            goto L26
        L43:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r3 = kotlin.collections.CollectionsKt.toSet(r4)
            java.lang.String r14 = r20.getFunctionId()
            java.lang.String r4 = r20.getFunIcon()
            android.content.Context r5 = r0.component4
            int r7 = com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsExtKt.toDrawableResId(r4, r5)
            java.lang.String r15 = r20.getFunctionName()
            java.lang.String r16 = r20.getExecute()
            if (r2 == 0) goto L83
            int r2 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.ArtificialStackFrames
            int r2 = r2 + 97
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.coroutineBoundary = r4
            int r2 = r2 % r1
            java.lang.String r2 = r20.getFunctionId()
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L83
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionState r2 = com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionState.DISABLED
            int r3 = com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.ArtificialStackFrames
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.coroutineBoundary = r4
            int r3 = r3 % r1
            r12 = r2
            goto L86
        L83:
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionState r1 = com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionState.DEFAULT
            r12 = r1
        L86:
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction r1 = new com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction
            r5 = -1
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r17 = 378(0x17a, float:5.3E-43)
            r18 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.Map<com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction, com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction> r2 = r0.component2
            r3 = r20
            r2.put(r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel.ShareDataUIState(com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction, java.util.List):com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction");
    }

    private final ImmutableList<QuickActionSection> copydefault(List<SFCLocalHomeFunctionGroup> list, List<SFCLocalHomeFunction> list2) {
        int i = 2 % 2;
        List<SFCLocalHomeFunctionGroup> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        int i2 = ArtificialStackFrames + 5;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup : list3) {
            QuickAction quickAction = new QuickAction(0, 0, 0, 0, 0, null, false, null, false, null, sFCLocalHomeFunctionGroup.getCategory(), null, 3071, null);
            List<SFCLocalHomeFunction> dataList = sFCLocalHomeFunctionGroup.getDataList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataList, 10));
            Iterator<T> it = dataList.iterator();
            while (it.hasNext()) {
                int i4 = coroutineBoundary + 53;
                ArtificialStackFrames = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList2.add(ShareDataUIState((SFCLocalHomeFunction) it.next(), list2));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                arrayList2.add(ShareDataUIState((SFCLocalHomeFunction) it.next(), list2));
            }
            arrayList.add(new QuickActionSection(quickAction, ExtensionsKt.toPersistentList(arrayList2)));
        }
        return ExtensionsKt.toPersistentList(arrayList);
    }

    public final void setEditEnable(boolean editEnable) {
        QuickActionsUiState value;
        QuickActionsUiState value2;
        ArrayList arrayList;
        SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup;
        ArrayList arrayList2;
        SFCLocalHomeFunction sFCLocalHomeFunction;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        String str5;
        int i3;
        Object obj;
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = ArtificialStackFrames + 7;
        coroutineBoundary = i6 % 128;
        int i7 = i6 % 2;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, null, null, editEnable, null, null, null, 479, null)));
        this.ShareDataUIState = editEnable;
        List<SFCLocalHomeFunction> currentHomeServiceFunctions = this.getSponsorBeneficiariesState.getValue().getCurrentHomeServiceFunctions();
        int i8 = 10;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentHomeServiceFunctions, 10));
        Iterator<T> it = currentHomeServiceFunctions.iterator();
        while (!(!it.hasNext())) {
            int i9 = ArtificialStackFrames + 17;
            coroutineBoundary = i9 % 128;
            int i10 = i9 % 2;
            ArrayList arrayList4 = arrayList3;
            arrayList4.add(SFCLocalHomeFunction.copy$default((SFCLocalHomeFunction) it.next(), null, null, null, null, editEnable, 0, 0, null, 239, null));
            i4 = 2;
            arrayList3 = arrayList4;
            i8 = 10;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
        List<SFCLocalHomeFunctionGroup> homeServiceGroups = this.getSponsorBeneficiariesState.getValue().getHomeServiceGroups();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(homeServiceGroups, i8));
        for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup2 : homeServiceGroups) {
            List<SFCLocalHomeFunction> dataList = sFCLocalHomeFunctionGroup2.getDataList();
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataList, i8));
            Iterator<T> it2 = dataList.iterator();
            while (it2.hasNext()) {
                int i11 = coroutineBoundary + 29;
                ArtificialStackFrames = i11 % 128;
                if (i11 % i4 != 0) {
                    sFCLocalHomeFunction = (SFCLocalHomeFunction) it2.next();
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    i = 1;
                    z = editEnable;
                    arrayList = arrayList6;
                    i2 = 0;
                    sFCLocalHomeFunctionGroup = sFCLocalHomeFunctionGroup2;
                    str5 = null;
                    i3 = 16697;
                    arrayList2 = arrayList5;
                    obj = null;
                } else {
                    arrayList = arrayList6;
                    sFCLocalHomeFunctionGroup = sFCLocalHomeFunctionGroup2;
                    arrayList2 = arrayList5;
                    sFCLocalHomeFunction = (SFCLocalHomeFunction) it2.next();
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    i = 0;
                    i2 = 0;
                    str5 = null;
                    i3 = 239;
                    obj = null;
                    z = editEnable;
                }
                arrayList.add(SFCLocalHomeFunction.copy$default(sFCLocalHomeFunction, str, str2, str3, str4, z, i, i2, str5, i3, obj));
                sFCLocalHomeFunctionGroup2 = sFCLocalHomeFunctionGroup;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
                i4 = 2;
            }
            ArrayList arrayList7 = arrayList5;
            arrayList7.add(SFCLocalHomeFunctionGroup.copy$default(sFCLocalHomeFunctionGroup2, null, arrayList6, 1, null));
            arrayList5 = arrayList7;
            i4 = 2;
            i8 = 10;
        }
        ArrayList arrayList8 = arrayList5;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, false, null, null, null, false, null, mutableList, arrayList8, 127, null)));
    }

    public final void removeTempFunction(SFCLocalHomeFunction function) {
        QuickActionsUiState value;
        QuickActionsUiState value2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function, "");
        ArrayList arrayList = new ArrayList(this.getSponsorBeneficiariesState.getValue().getCurrentHomeServiceFunctions());
        Object obj = null;
        if (arrayList.size() <= this.hashCode) {
            int i2 = coroutineBoundary + 125;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, false, new BaseException(StringUtils.getString(R.string.quick_action_min_tips)), null, null, false, null, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            return;
        }
        arrayList.remove(function);
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, null, null, false, null, arrayList, null, 383, null)));
        int i3 = ArtificialStackFrames + 113;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void addTempFunction(SFCLocalHomeFunction function) {
        QuickActionsUiState value;
        QuickActionsUiState value2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function, "");
        List<SFCLocalHomeFunction> currentHomeServiceFunctions = this.getSponsorBeneficiariesState.getValue().getCurrentHomeServiceFunctions();
        if (currentHomeServiceFunctions.size() >= this.copy) {
            int i2 = coroutineBoundary + 67;
            ArtificialStackFrames = i2 % 128;
            int i3 = i2 % 2;
            MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, false, new BaseException(StringUtils.getString(R.string.quick_action_max_tips)), null, null, false, null, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            return;
        }
        ArrayList arrayList = new ArrayList(currentHomeServiceFunctions);
        List<SFCLocalHomeFunction> list = currentHomeServiceFunctions;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i4 = coroutineBoundary + 67;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = ArtificialStackFrames + 85;
                coroutineBoundary = i6 % 128;
                int i7 = i6 % 2;
                if (Intrinsics.areEqual(((SFCLocalHomeFunction) it.next()).getFunctionId(), function.getFunctionId())) {
                    return;
                }
            }
        }
        arrayList.add(function);
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, null, null, false, null, arrayList, null, 383, null)));
    }

    public final void updateGroupByCategory(String category) {
        QuickActionsUiState value;
        Object next;
        QuickActionsUiState value2;
        QuickActionsUiState value3;
        SFCLocalHomeFunction sFCLocalHomeFunction;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i;
        int i2;
        String str5;
        int i3;
        QuickActionsUiState value4;
        Iterator<SFCLocalHomeFunctionGroup> it;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, category, null, false, null, null, null, 503, null)));
        this.copydefault = category;
        ArrayList arrayList = new ArrayList();
        List<SFCLocalHomeFunctionGroup> list = this.getAsAtTimestamp;
        Object obj = null;
        if (TextUtils.isEmpty(this.component1)) {
            arrayList = list;
        } else {
            int i5 = coroutineBoundary + 125;
            ArtificialStackFrames = i5 % 128;
            if (i5 % 2 != 0) {
                it = list.iterator();
                int i6 = 71 / 0;
            } else {
                it = list.iterator();
            }
            while (it.hasNext()) {
                SFCLocalHomeFunctionGroup next2 = it.next();
                List<SFCLocalHomeFunction> dataList = next2.getDataList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : dataList) {
                    if (StringsKt.contains((CharSequence) ((SFCLocalHomeFunction) obj2).getFunctionName(), (CharSequence) this.component1, true)) {
                        int i7 = ArtificialStackFrames + 83;
                        coroutineBoundary = i7 % 128;
                        if (i7 % 2 == 0) {
                            arrayList2.add(obj2);
                            obj.hashCode();
                            throw null;
                        }
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new SFCLocalHomeFunctionGroup(next2.getCategory(), arrayList3));
                }
            }
        }
        if (Intrinsics.areEqual(category, "All")) {
            List<SFCLocalHomeFunctionGroup> list2 = arrayList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup : list2) {
                List<SFCLocalHomeFunction> dataList2 = sFCLocalHomeFunctionGroup.getDataList();
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataList2, 10));
                Iterator<T> it2 = dataList2.iterator();
                while (it2.hasNext()) {
                    int i8 = ArtificialStackFrames + 107;
                    coroutineBoundary = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList5.add(SFCLocalHomeFunction.copy$default((SFCLocalHomeFunction) it2.next(), null, null, null, null, this.ShareDataUIState, 0, 0, null, 239, null));
                }
                arrayList4.add(SFCLocalHomeFunctionGroup.copy$default(sFCLocalHomeFunctionGroup, null, arrayList5, 1, null));
            }
            ArrayList arrayList6 = arrayList4;
            MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
            int i10 = coroutineBoundary + 51;
            ArtificialStackFrames = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 4;
            }
            do {
                value4 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value4, QuickActionsUiState.copy$default(value4, false, false, null, null, null, false, null, null, arrayList6, 255, null)));
            return;
        }
        Iterator<T> it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.areEqual(((SFCLocalHomeFunctionGroup) next).getCategory(), category)) {
                int i12 = ArtificialStackFrames + 69;
                coroutineBoundary = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }
        }
        SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup2 = (SFCLocalHomeFunctionGroup) next;
        if (sFCLocalHomeFunctionGroup2 == null) {
            MutableStateFlow<QuickActionsUiState> mutableStateFlow3 = this.getSponsorBeneficiariesState;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, false, null, null, null, false, null, null, CollectionsKt.emptyList(), 255, null)));
            return;
        }
        List<SFCLocalHomeFunctionGroup> listListOf = CollectionsKt.listOf(sFCLocalHomeFunctionGroup2);
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup3 : listListOf) {
            List<SFCLocalHomeFunction> dataList3 = sFCLocalHomeFunctionGroup3.getDataList();
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataList3, 10));
            Iterator<T> it4 = dataList3.iterator();
            while (it4.hasNext()) {
                int i13 = coroutineBoundary + 99;
                ArtificialStackFrames = i13 % 128;
                if (i13 % 2 != 0) {
                    sFCLocalHomeFunction = (SFCLocalHomeFunction) it4.next();
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    z = this.ShareDataUIState;
                    i = 0;
                    i2 = 1;
                    str5 = null;
                    i3 = 8350;
                } else {
                    sFCLocalHomeFunction = (SFCLocalHomeFunction) it4.next();
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    z = this.ShareDataUIState;
                    i = 0;
                    i2 = 0;
                    str5 = null;
                    i3 = 239;
                }
                arrayList8.add(SFCLocalHomeFunction.copy$default(sFCLocalHomeFunction, str, str2, str3, str4, z, i, i2, str5, i3, null));
            }
            arrayList7.add(SFCLocalHomeFunctionGroup.copy$default(sFCLocalHomeFunctionGroup3, null, arrayList8, 1, null));
        }
        ArrayList arrayList9 = arrayList7;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow4 = this.getSponsorBeneficiariesState;
        do {
            value3 = mutableStateFlow4.getValue();
        } while (!mutableStateFlow4.compareAndSet(value3, QuickActionsUiState.copy$default(value3, false, false, null, null, null, false, null, null, arrayList9, 255, null)));
    }

    public final void cleanException() {
        QuickActionsUiState value;
        int i = 2 % 2;
        int i2 = coroutineBoundary + 91;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
            int i4 = i3 + 97;
            coroutineBoundary = i4 % 128;
            int i5 = i4 % 2;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, null, null, false, null, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            int i6 = ArtificialStackFrames + 117;
            coroutineBoundary = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void updateViewBySearch(String text) {
        QuickActionsUiState value;
        QuickActionsUiState value2;
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(text, "");
        MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, null, text, false, null, null, null, 495, null)));
        this.component1 = text;
        ArrayList arrayList = new ArrayList();
        List<SFCLocalHomeFunctionGroup> mutableList = this.getAsAtTimestamp;
        if (!Intrinsics.areEqual(this.copydefault, "All")) {
            int i2 = ArtificialStackFrames + 67;
            coroutineBoundary = i2 % 128;
            if (i2 % 2 == 0) {
                mutableList.iterator();
                throw null;
            }
            Iterator<T> it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((SFCLocalHomeFunctionGroup) next).getCategory(), this.copydefault)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup = (SFCLocalHomeFunctionGroup) next;
            if (sFCLocalHomeFunctionGroup != null) {
                mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf(sFCLocalHomeFunctionGroup));
            }
        }
        for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup2 : mutableList) {
            List<SFCLocalHomeFunction> dataList = sFCLocalHomeFunctionGroup2.getDataList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : dataList) {
                if (StringsKt.contains((CharSequence) ((SFCLocalHomeFunction) obj).getFunctionName(), (CharSequence) text, true)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                arrayList.add(new SFCLocalHomeFunctionGroup(sFCLocalHomeFunctionGroup2.getCategory(), arrayList3));
            }
        }
        ArrayList<SFCLocalHomeFunctionGroup> arrayList4 = arrayList;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup3 : arrayList4) {
            List<SFCLocalHomeFunction> dataList2 = sFCLocalHomeFunctionGroup3.getDataList();
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataList2, 10));
            Iterator<T> it2 = dataList2.iterator();
            while (it2.hasNext()) {
                int i3 = coroutineBoundary + 33;
                ArtificialStackFrames = i3 % 128;
                int i4 = i3 % 2;
                arrayList6.add(SFCLocalHomeFunction.copy$default((SFCLocalHomeFunction) it2.next(), null, null, null, null, this.ShareDataUIState, 0, 0, null, 239, null));
            }
            arrayList5.add(SFCLocalHomeFunctionGroup.copy$default(sFCLocalHomeFunctionGroup3, null, arrayList6, 1, null));
        }
        ArrayList arrayList7 = arrayList5;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, false, null, null, null, false, null, null, arrayList7, 255, null)));
    }

    public final void reset() {
        QuickActionsUiState value;
        ArrayList arrayListCreateDefaultFunctions;
        List mutableList;
        QuickActionsUiState value2;
        Object next;
        List<LocalHomeFunction> list;
        int i = 2 % 2;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow = this.getSponsorBeneficiariesState;
        int i2 = ArtificialStackFrames + 93;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QuickActionsUiState.copy$default(value, false, false, null, null, null, false, null, null, null, 479, null)));
        this.ShareDataUIState = false;
        LocalHomeConfig value3 = HomeConfigManager.INSTANCE.getlocalHomeConfig().getValue();
        if (value3 != null) {
            Iterator<T> it = value3.getHomeFunction().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i4 = coroutineBoundary + 61;
                ArtificialStackFrames = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.areEqual(((LocalFunctionGroup) it.next()).getMenuType(), "services");
                    throw null;
                }
                next = it.next();
                if (Intrinsics.areEqual(((LocalFunctionGroup) next).getMenuType(), "services")) {
                    break;
                }
            }
            LocalFunctionGroup localFunctionGroup = (LocalFunctionGroup) next;
            List<SFCLocalHomeFunction> listConvert = LocalHomeFunctionItems.INSTANCE.convert((localFunctionGroup == null || (list = localFunctionGroup.getList()) == null) ? null : CollectionsKt.toMutableList((Collection) list));
            if (listConvert == null || (arrayListCreateDefaultFunctions = CollectionsKt.toMutableList((Collection) listConvert)) == null) {
                arrayListCreateDefaultFunctions = new ArrayList();
            }
        } else {
            arrayListCreateDefaultFunctions = null;
        }
        if (arrayListCreateDefaultFunctions != null && arrayListCreateDefaultFunctions.isEmpty()) {
            int i5 = ArtificialStackFrames + 11;
            coroutineBoundary = i5 % 128;
            int i6 = i5 % 2;
            arrayListCreateDefaultFunctions = LocalHomeFunctionItems.INSTANCE.createDefaultFunctions();
        }
        if (arrayListCreateDefaultFunctions != null) {
            List<SFCLocalHomeFunction> list2 = arrayListCreateDefaultFunctions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(SFCLocalHomeFunction.copy$default((SFCLocalHomeFunction) it2.next(), null, null, null, null, false, 0, 0, null, 239, null));
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        } else {
            mutableList = null;
        }
        List<SFCLocalHomeFunctionGroup> homeServiceGroups = this.getSponsorBeneficiariesState.getValue().getHomeServiceGroups();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(homeServiceGroups, 10));
        for (SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup : homeServiceGroups) {
            List<SFCLocalHomeFunction> dataList = sFCLocalHomeFunctionGroup.getDataList();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataList, 10));
            Iterator<T> it3 = dataList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(SFCLocalHomeFunction.copy$default((SFCLocalHomeFunction) it3.next(), null, null, null, null, false, 0, 0, null, 239, null));
            }
            arrayList2.add(SFCLocalHomeFunctionGroup.copy$default(sFCLocalHomeFunctionGroup, null, arrayList3, 1, null));
        }
        ArrayList arrayList4 = arrayList2;
        MutableStateFlow<QuickActionsUiState> mutableStateFlow2 = this.getSponsorBeneficiariesState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, QuickActionsUiState.copy$default(value2, false, false, null, null, null, false, null, mutableList == null ? new ArrayList() : mutableList, arrayList4, 127, null)));
    }

    static {
        int i = 1 + 59;
        toString = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
