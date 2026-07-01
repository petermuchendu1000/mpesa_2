package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.consumer.home.ui.utils.ComponentTypeConstants;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentsRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentCategory;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentCategoryKt;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentMiniApp;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransactionAction;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.model.HomeSettings;
import com.safaricom.consumer.commons.transaction.TransactionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u0011J\u0016\u00101\u001a\u00020,2\u0006\u00102\u001a\u000203H\u0082@¢\u0006\u0002\u00104J\u0016\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020\"H\u0082@¢\u0006\u0002\u00107J\u000e\u0010&\u001a\u00020,2\u0006\u00100\u001a\u00020\u0011J\u000e\u0010)\u001a\u00020,2\u0006\u00108\u001a\u00020\u000fJ\u000e\u00109\u001a\u00020,2\u0006\u00100\u001a\u00020\u0011J\u000e\u0010:\u001a\u00020,2\u0006\u00100\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR)\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 ¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/FrequentsViewModel;", "Landroidx/lifecycle/ViewModel;", "homeSettingsRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsRepository;", "frequentsRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsRepository;Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsRepository;)V", "homeSettings", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;", "getHomeSettings", "()Lkotlinx/coroutines/flow/StateFlow;", "frequentTransactions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "getFrequentTransactions", "frequentMiniApps", "getFrequentMiniApps", "_firstNonEmptyCategory", "Lkotlinx/coroutines/flow/Flow;", "firstNonEmptyCategory", "getFirstNonEmptyCategory", "frequentItems", "getFrequentItems", "_onFrequentTransactionAction", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction;", "onFrequentTransactionAction", "getOnFrequentTransactionAction", "()Lkotlinx/coroutines/flow/Flow;", "_onFrequentMiniAppAction", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentMiniApp;", "onFrequentMiniAppAction", "getOnFrequentMiniAppAction", "_onFrequentItemLongClick", "onFrequentItemLongClick", "getOnFrequentItemLongClick", "_onFrequentCategoryClick", "onFrequentCategoryClick", "getOnFrequentCategoryClick", "onExpandedChange", "", "isExpanded", "", "onFrequentItemClick", "frequentItem", "onFrequentTransactionClick", "frequentTransaction", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFrequentMiniAppClick", "frequentMiniApp", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentMiniApp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "frequentCategory", "saveFrequentItem", "onRemoveFrequentItem", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentsViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int CoroutineDebuggingKt = 105 % 128;
    private static int coroutineBoundary = 0;
    private static int coroutineCreation = 0;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 1;
    private final Flow<FrequentCategory> ArtificialStackFrames;
    private final Flow<FrequentCategory> ShareDataUIState;
    private final Flow<FrequentTransactionAction> accessartificialFrame;
    private final Channel<FrequentTransactionAction> component1;
    private final Channel<FrequentCategory> component2;
    private final Channel<FrequentItem> component3;
    private final StateFlow<List<FrequentItem>> component4;
    private final StateFlow<Map<FrequentCategory, List<FrequentItem>>> copy;
    private final Channel<FrequentMiniApp> copydefault;
    private final FrequentsRepository equals;
    private final StateFlow<Map<FrequentCategory, List<FrequentItem>>> getAsAtTimestamp;
    private final StateFlow<FrequentCategory> getRequestBeneficiariesState;
    private final Flow<FrequentItem> getShareableDataState;
    private final HomeSettingsRepository getSponsorBeneficiariesState;
    private final StateFlow<HomeSettings> hashCode;
    private final Flow<FrequentMiniApp> toString;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component2 = 0;
        private static int component3 = 1;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.BUY_GOODS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.PAY_BILL.ordinal()] = 2;
                int i = component2 + 31;
                component3 = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.SEND_MONEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionType.WITHDRAW_AT_AGENT.ordinal()] = 4;
                int i4 = component3 + 91;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FrequentsRepository access$getFrequentsRepository$p(FrequentsViewModel frequentsViewModel) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 39;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        FrequentsRepository frequentsRepository = frequentsViewModel.equals;
        int i5 = i3 + 31;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            return frequentsRepository;
        }
        throw null;
    }

    public static final HomeSettingsRepository access$getHomeSettingsRepository$p(FrequentsViewModel frequentsViewModel) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 9;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        HomeSettingsRepository homeSettingsRepository = frequentsViewModel.getSponsorBeneficiariesState;
        int i5 = i2 + 91;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return homeSettingsRepository;
    }

    public static final Channel access$get_onFrequentCategoryClick$p(FrequentsViewModel frequentsViewModel) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Channel<FrequentCategory> channel = frequentsViewModel.component2;
        if (i3 == 0) {
            return channel;
        }
        throw null;
    }

    public static final Channel access$get_onFrequentItemLongClick$p(FrequentsViewModel frequentsViewModel) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 113;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        Channel<FrequentItem> channel = frequentsViewModel.component3;
        int i5 = i3 + 55;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            return channel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Object access$onFrequentMiniAppClick(FrequentsViewModel frequentsViewModel, FrequentMiniApp frequentMiniApp, Continuation continuation) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 111;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Object objShareDataUIState = frequentsViewModel.ShareDataUIState(frequentMiniApp, continuation);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return objShareDataUIState;
    }

    public static final Object access$onFrequentTransactionClick(FrequentsViewModel frequentsViewModel, FrequentTransaction frequentTransaction, Continuation continuation) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 13;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = frequentsViewModel.copydefault(frequentTransaction, continuation);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = coroutineBoundary + 113;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            return objCopydefault;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public FrequentsViewModel(HomeSettingsRepository homeSettingsRepository, FrequentsRepository frequentsRepository) {
        Intrinsics.checkNotNullParameter(homeSettingsRepository, "");
        Intrinsics.checkNotNullParameter(frequentsRepository, "");
        this.getSponsorBeneficiariesState = homeSettingsRepository;
        this.equals = frequentsRepository;
        FrequentsViewModel frequentsViewModel = this;
        this.hashCode = FlowKt.stateIn(homeSettingsRepository.getHomeSettings(), ViewModelKt.getViewModelScope(frequentsViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new HomeSettings(null, false, 3, 0 == true ? 1 : 0));
        StateFlow<Map<FrequentCategory, List<FrequentItem>>> stateFlowStateIn = FlowKt.stateIn(frequentsRepository.getFrequentTransactions(), ViewModelKt.getViewModelScope(frequentsViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), MapsKt.emptyMap());
        this.copy = stateFlowStateIn;
        StateFlow<List<FrequentItem>> stateFlowStateIn2 = FlowKt.stateIn(frequentsRepository.getFrequentMiniApps(), ViewModelKt.getViewModelScope(frequentsViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.component4 = stateFlowStateIn2;
        StateFlow<Map<FrequentCategory, List<FrequentItem>>> stateFlow = stateFlowStateIn;
        StateFlow<List<FrequentItem>> stateFlow2 = stateFlowStateIn2;
        Flow<FrequentCategory> flowCombine = FlowKt.combine(stateFlow, stateFlow2, new component1(null));
        this.ShareDataUIState = flowCombine;
        this.getRequestBeneficiariesState = FlowKt.stateIn(flowCombine, ViewModelKt.getViewModelScope(frequentsViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), FrequentCategory.Apps.INSTANCE);
        this.getAsAtTimestamp = FlowKt.stateIn(FlowKt.combine(stateFlow, stateFlow2, new ShareDataUIState(null)), ViewModelKt.getViewModelScope(frequentsViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), MapsKt.emptyMap());
        Channel<FrequentTransactionAction> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.component1 = channelChannel$default;
        this.accessartificialFrame = FlowKt.receiveAsFlow(channelChannel$default);
        Channel<FrequentMiniApp> channelChannel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.copydefault = channelChannel$default2;
        this.toString = FlowKt.receiveAsFlow(channelChannel$default2);
        Channel<FrequentItem> channelChannel$default3 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.component3 = channelChannel$default3;
        this.getShareableDataState = FlowKt.receiveAsFlow(channelChannel$default3);
        Channel<FrequentCategory> channelChannel$default4 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.component2 = channelChannel$default4;
        this.ArtificialStackFrames = FlowKt.receiveAsFlow(channelChannel$default4);
    }

    public final StateFlow<HomeSettings> getHomeSettings() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 9;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<HomeSettings> stateFlow = this.hashCode;
        int i5 = i2 + 63;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return stateFlow;
    }

    public final StateFlow<Map<FrequentCategory, List<FrequentItem>>> getFrequentTransactions() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 83;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Map<FrequentCategory, List<FrequentItem>>> stateFlow = this.copy;
        int i5 = i2 + 85;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<List<FrequentItem>> getFrequentMiniApps() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 89;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        StateFlow<List<FrequentItem>> stateFlow = this.component4;
        int i5 = i3 + 39;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012'\u0010\u0002\u001a#\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", ComponentTypeConstants.TYPE_TRANSACTIONS, "", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "Lkotlin/ParameterName;", "name", "a", "miniApps", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$_firstNonEmptyCategory$1", f = "FrequentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function3<Map<FrequentCategory, ? extends List<? extends FrequentItem>>, List<? extends FrequentItem>, Continuation<? super FrequentCategory>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        Object ShareDataUIState;
        int component2;
        Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            Object next;
            int i = 2 % 2;
            int i2 = component1 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = copydefault + 69;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            Map map = (Map) this.component3;
            if (i5 != 0) {
                list = (List) this.ShareDataUIState;
                it = FrequentCategoryKt.getAllFrequentCategories().iterator();
                int i6 = 64 / 0;
            } else {
                list = (List) this.ShareDataUIState;
                it = FrequentCategoryKt.getAllFrequentCategories().iterator();
            }
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                FrequentCategory frequentCategory = (FrequentCategory) next;
                if (!Intrinsics.areEqual(frequentCategory, FrequentCategory.Apps.INSTANCE)) {
                    if (((List) map.get(frequentCategory)) != null) {
                        int i7 = copydefault + 113;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                        if (!r4.isEmpty()) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else if (!list.isEmpty()) {
                    break;
                }
            }
            FrequentCategory frequentCategory2 = (FrequentCategory) next;
            return frequentCategory2 == null ? FrequentCategory.Apps.INSTANCE : frequentCategory2;
        }

        component1(Continuation<? super component1> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(Map<FrequentCategory, ? extends List<? extends FrequentItem>> map, List<? extends FrequentItem> list, Continuation<? super FrequentCategory> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 1;
            component1 = i2 % 128;
            Map<FrequentCategory, ? extends List<? extends FrequentItem>> map2 = map;
            List<? extends FrequentItem> list2 = list;
            if (i2 % 2 != 0) {
                copydefault(map2, list2, continuation);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objCopydefault = copydefault(map2, list2, continuation);
            int i3 = component1 + 91;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return objCopydefault;
        }

        public final Object copydefault(Map<FrequentCategory, ? extends List<? extends FrequentItem>> map, List<? extends FrequentItem> list, Continuation<? super FrequentCategory> continuation) {
            int i = 2 % 2;
            component1 component1Var = new component1(continuation);
            component1Var.component3 = map;
            component1Var.ShareDataUIState = list;
            Object objInvokeSuspend = component1Var.invokeSuspend(Unit.INSTANCE);
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }
    }

    public final StateFlow<FrequentCategory> getFirstNonEmptyCategory() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<FrequentCategory> stateFlow = this.getRequestBeneficiariesState;
        int i5 = i2 + 87;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Map<FrequentCategory, List<FrequentItem>>> getFrequentItems() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Map<FrequentCategory, List<FrequentItem>>> stateFlow = this.getAsAtTimestamp;
        int i5 = i2 + 85;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return stateFlow;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012'\u0010\u0005\u001a#\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", ComponentTypeConstants.TYPE_TRANSACTIONS, "Lkotlin/ParameterName;", "name", "a", "miniApps", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$frequentItems$1", f = "FrequentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function3<Map<FrequentCategory, ? extends List<? extends FrequentItem>>, List<? extends FrequentItem>, Continuation<? super Map<FrequentCategory, ? extends List<? extends FrequentItem>>>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        int component1;
        Object component2;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Map map = (Map) this.component2;
            List list = (List) this.copydefault;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int i4 = component3 + 39;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add((FrequentItem) it.next());
                }
                linkedHashMap.put(key, arrayList);
            }
            FrequentCategory.Apps apps = FrequentCategory.Apps.INSTANCE;
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add((FrequentItem) it2.next());
            }
            return MapsKt.plus(linkedHashMap, MapsKt.mapOf(TuplesKt.to(apps, arrayList2)));
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(Map<FrequentCategory, ? extends List<? extends FrequentItem>> map, List<? extends FrequentItem> list, Continuation<? super Map<FrequentCategory, ? extends List<? extends FrequentItem>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 97;
            component3 = i2 % 128;
            Map<FrequentCategory, ? extends List<? extends FrequentItem>> map2 = map;
            List<? extends FrequentItem> list2 = list;
            Continuation<? super Map<FrequentCategory, ? extends List<? extends FrequentItem>>> continuation2 = continuation;
            if (i2 % 2 != 0) {
                copydefault(map2, list2, continuation2);
                throw null;
            }
            Object objCopydefault = copydefault(map2, list2, continuation2);
            int i3 = component3 + 103;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return objCopydefault;
            }
            throw null;
        }

        public final Object copydefault(Map<FrequentCategory, ? extends List<? extends FrequentItem>> map, List<? extends FrequentItem> list, Continuation<? super Map<FrequentCategory, ? extends List<? extends FrequentItem>>> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = new ShareDataUIState(continuation);
            shareDataUIState.component2 = map;
            shareDataUIState.copydefault = list;
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(Unit.INSTANCE);
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Flow<FrequentTransactionAction> getOnFrequentTransactionAction() {
        Flow<FrequentTransactionAction> flow;
        int i = 2 % 2;
        int i2 = coroutineBoundary + 107;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 == 0) {
            flow = this.accessartificialFrame;
            int i4 = 98 / 0;
        } else {
            flow = this.accessartificialFrame;
        }
        int i5 = i3 + 31;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            return flow;
        }
        throw null;
    }

    public final Flow<FrequentMiniApp> getOnFrequentMiniAppAction() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 29;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        Flow<FrequentMiniApp> flow = this.toString;
        int i5 = i3 + 107;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return flow;
    }

    public final Flow<FrequentItem> getOnFrequentItemLongClick() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 3;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Flow<FrequentItem> flow = this.getShareableDataState;
        int i4 = i2 + 107;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return flow;
    }

    public final Flow<FrequentCategory> getOnFrequentCategoryClick() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 119;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Flow<FrequentCategory> flow = this.ArtificialStackFrames;
        int i4 = i3 + 53;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            return flow;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExpandedChange(boolean isExpanded) {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(isExpanded, null), 3, null);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 43;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$onExpandedChange$1", f = "FrequentsViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        final boolean component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component3;
            if (i4 != 0) {
                int i5 = copydefault + 83;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (FrequentsViewModel.access$getHomeSettingsRepository$p(FrequentsViewModel.this).setHomeSettings(HomeSettings.copy$default(FrequentsViewModel.this.getHomeSettings().getValue(), null, this.component1, 1, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(boolean z, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component1 = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FrequentsViewModel.this.new copydefault(this.component1, continuation);
            int i2 = ShareDataUIState + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = ShareDataUIState + 75;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent1;
            }
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 101;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$onFrequentItemClick$1", f = "FrequentsViewModel.kt", i = {}, l = {116, 117}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        final FrequentsViewModel component1;
        final FrequentItem component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            if (i2 != 0) {
                int i3 = component2;
                int i4 = i3 + 43;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 11;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                FrequentItem frequentItem = this.component3;
                if (frequentItem instanceof FrequentItem.TransactionItem) {
                    int i8 = ShareDataUIState + 83;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    this.copydefault = 1;
                    if (FrequentsViewModel.access$onFrequentTransactionClick(this.component1, ((FrequentItem.TransactionItem) frequentItem).getData(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(frequentItem instanceof FrequentItem.MiniAppItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.copydefault = 2;
                    if (FrequentsViewModel.access$onFrequentMiniAppClick(this.component1, ((FrequentItem.MiniAppItem) frequentItem).getData(), this) == coroutine_suspended) {
                        int i10 = ShareDataUIState + 61;
                        component2 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 72 / 0;
                        }
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(FrequentItem frequentItem, FrequentsViewModel frequentsViewModel, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.component3 = frequentItem;
            this.component1 = frequentsViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = new component3(this.component3, this.component1, continuation);
            int i2 = ShareDataUIState + 107;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component3(coroutineScope2, continuation2);
            }
            component3(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 == 0) {
                component3Var.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 61;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void onFrequentItemClick(FrequentItem frequentItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentItem, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(frequentItem, this, null), 3, null);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 95;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
    }

    private final Object copydefault(FrequentTransaction frequentTransaction, Continuation<? super Unit> continuation) {
        FrequentTransactionAction.BuyGoods buyGoods;
        int i = 2 % 2;
        int i2 = coroutineBoundary + 55;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Channel<FrequentTransactionAction> channel = this.component1;
        int i4 = WhenMappings.$EnumSwitchMapping$0[frequentTransaction.getTransactionType().ordinal()];
        if (i4 == 1) {
            buyGoods = new FrequentTransactionAction.BuyGoods(frequentTransaction.getDisplayName(), frequentTransaction.getNumber());
        } else if (i4 == 2) {
            buyGoods = new FrequentTransactionAction.PayBill(frequentTransaction.getDisplayName(), frequentTransaction.getNumber(), frequentTransaction.getSecondaryNumber());
        } else if (i4 == 3) {
            buyGoods = new FrequentTransactionAction.SendMoney(frequentTransaction.getDisplayName(), frequentTransaction.getNumber());
        } else {
            if (i4 != 4) {
                Unit unit = Unit.INSTANCE;
                int i5 = coroutineBoundary + 31;
                getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 77 / 0;
                }
                return unit;
            }
            buyGoods = new FrequentTransactionAction.WithdrawAtAgent(frequentTransaction.getDisplayName(), frequentTransaction.getNumber(), frequentTransaction.getSecondaryNumber());
            int i7 = coroutineBoundary + 39;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i7 % 128;
            int i8 = i7 % 2;
        }
        Object objSend = channel.send(buyGoods, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    private final Object ShareDataUIState(FrequentMiniApp frequentMiniApp, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 15;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Object objSend = this.copydefault.send(frequentMiniApp, continuation);
        if (objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 91;
            coroutineBoundary = i4 % 128;
            if (i4 % 2 == 0) {
                return objSend;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = getARTIFICIAL_FRAME_PACKAGE_NAME + 113;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public final void onFrequentItemLongClick(FrequentItem frequentItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentItem, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copy(frequentItem, null), 3, null);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 89;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$onFrequentItemLongClick$1", f = "FrequentsViewModel.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    static final class copy extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int copydefault;
        int ShareDataUIState;
        final FrequentItem component1;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[PHI: r1
  0x0040: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.copy.component2
                int r1 = r1 + 75
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.copy.copydefault = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.ShareDataUIState
                r4 = 43
                int r4 = r4 / 0
                if (r3 == 0) goto L40
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.ShareDataUIState
                if (r3 == 0) goto L40
            L24:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.copy.component2
                int r1 = r1 + 95
                int r4 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.copy.copydefault = r4
                int r1 = r1 % r0
                if (r1 == 0) goto L32
                if (r3 != 0) goto L38
                goto L34
            L32:
                if (r3 != r2) goto L38
            L34:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L57
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L40:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel r6 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.this
                kotlinx.coroutines.channels.Channel r6 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.access$get_onFrequentItemLongClick$p(r6)
                com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem r0 = r5.component1
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r5.ShareDataUIState = r2
                java.lang.Object r6 = r6.send(r0, r3)
                if (r6 != r1) goto L57
                return r1
            L57:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel.copy.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copy(FrequentItem frequentItem, Continuation<? super copy> continuation) {
            super(2, continuation);
            this.component1 = frequentItem;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = FrequentsViewModel.this.new copy(this.component1, continuation);
            int i2 = copydefault + 25;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return copyVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = component2 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 103;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    public final void onFrequentCategoryClick(FrequentCategory frequentCategory) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentCategory, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(frequentCategory, null), 3, null);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 87;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$onFrequentCategoryClick$1", f = "FrequentsViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        final FrequentCategory component1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (FrequentsViewModel.access$get_onFrequentCategoryClick$p(FrequentsViewModel.this).send(this.component1, this) == coroutine_suspended) {
                    int i5 = component2 + 93;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 89 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(FrequentCategory frequentCategory, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component1 = frequentCategory;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = FrequentsViewModel.this.new component2(this.component1, continuation);
            int i2 = component2 + 75;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 81;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = component3 + 91;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void saveFrequentItem(FrequentItem frequentItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentItem, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component4(frequentItem, null), 3, null);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 123;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$saveFrequentItem$1", f = "FrequentsViewModel.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    static final class component4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        final FrequentItem ShareDataUIState;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = copydefault + 105;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (FrequentsViewModel.access$getFrequentsRepository$p(FrequentsViewModel.this).saveFrequentItem(this.ShareDataUIState, this) == coroutine_suspended) {
                    int i7 = copydefault + 89;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component4(FrequentItem frequentItem, Continuation<? super component4> continuation) {
            super(2, continuation);
            this.ShareDataUIState = frequentItem;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component4 component4Var = FrequentsViewModel.this.new component4(this.ShareDataUIState, continuation);
            int i2 = component3 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component4Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = component3 + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final void onRemoveFrequentItem(FrequentItem frequentItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(frequentItem, "");
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new getRequestBeneficiariesState(frequentItem, null), 3, null);
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 85;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel$onRemoveFrequentItem$1", f = "FrequentsViewModel.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        final FrequentItem ShareDataUIState;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3;
                int i4 = i3 + 67;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 125;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
                int i8 = component3 + 97;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (FrequentsViewModel.access$getFrequentsRepository$p(FrequentsViewModel.this).removeFrequentItem(this.ShareDataUIState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getRequestBeneficiariesState(FrequentItem frequentItem, Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
            this.ShareDataUIState = frequentItem;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = FrequentsViewModel.this.new getRequestBeneficiariesState(this.ShareDataUIState, continuation);
            int i2 = component3 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return getrequestbeneficiariesstate;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 27;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            int i5 = component1 + 51;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return objInvokeSuspend;
        }
    }

    static {
        int i = 105 % 2;
    }
}
