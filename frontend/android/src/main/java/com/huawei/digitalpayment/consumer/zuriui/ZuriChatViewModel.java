package com.huawei.digitalpayment.consumer.zuriui;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.common.interceptor.AppLogInterceptor;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.HttpConstants;
import com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepository;
import com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepository;
import com.huawei.digitalpayment.consumer.zuriui.models.ChatAction;
import com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent;
import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import com.huawei.digitalpayment.consumer.zuriui.models.MessageType;
import com.huawei.digitalpayment.consumer.zuriui.state.ButtonUiState;
import com.huawei.digitalpayment.consumer.zuriui.state.ChatUiState;
import com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState;
import com.huawei.digitalpayment.consumer.zuriui.state.MessageUiState;
import com.huawei.digitalpayment.consumer.zuriui.state.UserUiState;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent;
import com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.jcajce.BCLoadStoreParameter;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001bH\u0002J\u0018\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001bH\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001bH\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001bH\u0002J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020\u001bH\u0002J\b\u00103\u001a\u00020!H\u0002J\u0010\u00104\u001a\u0002052\u0006\u0010(\u001a\u00020\u001bH\u0002J\u0016\u00106\u001a\u00020!2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020!H\u0014J\u0006\u0010;\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006="}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/ZuriChatViewModel;", "Landroidx/lifecycle/ViewModel;", "messageRepository", "Lcom/huawei/digitalpayment/consumer/zuriui/data/MessagesRepository;", "webSocketRepository", "Lcom/huawei/digitalpayment/consumer/zuriui/data/WebSocketRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/zuriui/data/MessagesRepository;Lcom/huawei/digitalpayment/consumer/zuriui/data/WebSocketRepository;)V", "isFirstTime", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isFirstTimeChattingZuri", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isFirstLoad", "_uiState", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ChatUiState;", "uiState", "getUiState", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "currentUserId", "", "getCurrentUserId", "()Ljava/lang/String;", "currentUserName", "getCurrentUserName", "onChatAction", "", LogConstants.Mpm.Interceptor.ACTION, "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;", "observeConnectionState", "observeIncomingMessages", "observeMessages", "onMessageSend", "text", "onButtonClicked", AppLogInterceptor.MESSAGE_ID, "button", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ButtonUiState;", "onMessageLongClick", "onMessageClick", "toggleMessageSelection", "clearSelection", "deleteSelectedMessages", "copySelectedMessages", "checkHeartbeat", "createUserMessage", "Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;", "sendMessageToZuri", "message", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "(Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "onStartChat", "Companion", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ZuriChatViewModel extends ViewModel {
    public static final String IS_FIRST_TIME_CHATTING_ZURI = "IS_FIRST_TIME_CHATTING_ZURI";
    private static int equals = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 1;
    private static int hashCode;
    private final SharedFlow<ChatEvent> ShareDataUIState;
    private final MutableSharedFlow<ChatEvent> component1;
    private boolean component2;
    private final MutableStateFlow<ChatUiState> component3;
    private final StateFlow<ChatUiState> component4;
    private final StateFlow<Boolean> copy;
    private MutableStateFlow<Boolean> copydefault;
    private final WebSocketRepository getAsAtTimestamp;
    private final MessagesRepository getRequestBeneficiariesState;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static Object component2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i | i2);
        int i12 = (~(i2 | i)) | (~(i7 | i9)) | i8;
        int i13 = i + i3 + i6 + ((-1422066268) * i4) + ((-2108786386) * i5);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i) + 967573504 + (322476998 * i3) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i6) + ((-1298137088) * i4) + (1722810368 * i5) + (518782976 * i14);
        int i16 = (i * 793895740) + 1353643607 + (i3 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * DeepRecoverARiverProxy.TYPE_ENTITY_ONLINE_PAGE) + (i6 * 793896001) + (i4 * 692483748) + (i5 * (-1016611666)) + (i14 * 166461440);
        int i17 = i15 + (i16 * i16 * 1997799424);
        if (i17 == 1) {
            return copydefault(objArr);
        }
        if (i17 == 2) {
            return component3(objArr);
        }
        ZuriChatViewModel zuriChatViewModel = (ZuriChatViewModel) objArr[0];
        String str = (String) objArr[1];
        int i18 = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(zuriChatViewModel), null, null, zuriChatViewModel.new toString((MessageUiState) component2(349962837, BCLoadStoreParameter.component1(), new Object[]{zuriChatViewModel, str}, -349962836, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1()), null), 3, null);
        zuriChatViewModel.component2 = false;
        int i19 = equals + 81;
        getShareableDataState = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static final void access$checkHeartbeat(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        zuriChatViewModel.component2();
        if (i3 != 0) {
            throw null;
        }
        int i4 = equals + 71;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    public static final void access$clearSelection(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
        zuriChatViewModel.component1();
        if (i3 != 0) {
            throw null;
        }
        int i4 = equals + 61;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static final String access$copySelectedMessages(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 33;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return zuriChatViewModel.copydefault();
        }
        zuriChatViewModel.copydefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$deleteSelectedMessages(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        zuriChatViewModel.component3();
        int i4 = getShareableDataState + 25;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getCurrentUserId(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = equals + 91;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) component2(-38968169, BCLoadStoreParameter.component1(), new Object[]{zuriChatViewModel}, 38968171, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1());
        int i4 = getShareableDataState + 57;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return str;
    }

    public static final MessagesRepository access$getMessageRepository$p(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = equals + 69;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        MessagesRepository messagesRepository = zuriChatViewModel.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return messagesRepository;
    }

    public static final WebSocketRepository access$getWebSocketRepository$p(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        WebSocketRepository webSocketRepository = zuriChatViewModel.getAsAtTimestamp;
        if (i3 == 0) {
            return webSocketRepository;
        }
        throw null;
    }

    public static final MutableSharedFlow access$get_events$p(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 107;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        MutableSharedFlow<ChatEvent> mutableSharedFlow = zuriChatViewModel.component1;
        int i5 = i3 + 47;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return mutableSharedFlow;
    }

    public static final MutableStateFlow access$get_uiState$p(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = equals + 125;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        MutableStateFlow<ChatUiState> mutableStateFlow = zuriChatViewModel.component3;
        int i5 = i3 + 37;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean access$isFirstLoad$p(ZuriChatViewModel zuriChatViewModel) {
        int i = 2 % 2;
        int i2 = equals + 81;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        boolean z = zuriChatViewModel.component2;
        int i5 = i3 + 89;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return z;
    }

    public static final void access$onButtonClicked(ZuriChatViewModel zuriChatViewModel, String str, ButtonUiState buttonUiState) {
        int i = 2 % 2;
        int i2 = equals + 121;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        zuriChatViewModel.copydefault(str, buttonUiState);
        int i4 = getShareableDataState + 93;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$onMessageClick(ZuriChatViewModel zuriChatViewModel, String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        zuriChatViewModel.component2(str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getShareableDataState + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$onMessageLongClick(ZuriChatViewModel zuriChatViewModel, String str) {
        int i = 2 % 2;
        int i2 = equals + 47;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        zuriChatViewModel.component1(str);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = getShareableDataState + 123;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$onMessageSend(ZuriChatViewModel zuriChatViewModel, String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 111;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            component2(1330911816, BCLoadStoreParameter.component1(), new Object[]{zuriChatViewModel, str}, -1330911816, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1());
        } else {
            component2(1330911816, BCLoadStoreParameter.component1(), new Object[]{zuriChatViewModel, str}, -1330911816, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1());
            int i3 = 56 / 0;
        }
    }

    public static final Object access$sendMessageToZuri(ZuriChatViewModel zuriChatViewModel, Message message, Continuation continuation) {
        int i = 2 % 2;
        int i2 = equals + 117;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent1 = zuriChatViewModel.component1(message, continuation);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return objComponent1;
    }

    public static final void access$setFirstLoad$p(ZuriChatViewModel zuriChatViewModel, boolean z) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 7;
        equals = i3 % 128;
        int i4 = i3 % 2;
        zuriChatViewModel.component2 = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 119;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    @Inject
    public ZuriChatViewModel(MessagesRepository messagesRepository, WebSocketRepository webSocketRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "");
        Intrinsics.checkNotNullParameter(webSocketRepository, "");
        this.getRequestBeneficiariesState = messagesRepository;
        this.getAsAtTimestamp = webSocketRepository;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(SPUtils.getInstance().getBoolean(IS_FIRST_TIME_CHATTING_ZURI, true)));
        this.copydefault = MutableStateFlow;
        this.copy = FlowKt.asStateFlow(MutableStateFlow);
        this.component2 = true;
        MutableStateFlow<ChatUiState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new ChatUiState(null, false, null, 0, false, 31, null));
        this.component3 = MutableStateFlow2;
        this.component4 = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<ChatEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.component1 = mutableSharedFlowMutableSharedFlow$default;
        this.ShareDataUIState = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        component4();
        equals();
        copy();
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass5(null), 3, null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/ZuriChatViewModel$Companion;", "", "<init>", "()V", ZuriChatViewModel.IS_FIRST_TIME_CHATTING_ZURI, "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final StateFlow<Boolean> isFirstTimeChattingZuri() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 39;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Boolean> stateFlow = this.copy;
        int i5 = i2 + 13;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<ChatUiState> getUiState() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 41;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<ChatUiState> stateFlow = this.component4;
        int i5 = i2 + 69;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return stateFlow;
    }

    public final SharedFlow<ChatEvent> getEvents() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 63;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedFlow<ChatEvent> sharedFlow = this.ShareDataUIState;
        int i4 = i2 + 65;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return sharedFlow;
    }

    private static Object component3(Object[] objArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("254");
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb.append(StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9));
        String string2 = sb.toString();
        int i2 = equals + 27;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return string2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$1", f = "ZuriChatViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = component1 + 53;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (ZuriChatViewModel.access$getWebSocketRepository$p(ZuriChatViewModel.this).connect(this) == coroutine_suspended) {
                    int i7 = component1 + 73;
                    component3 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 87 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = ZuriChatViewModel.this.new AnonymousClass5(continuation);
            int i2 = component1 + 45;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
            }
            return anonymousClass5;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 111;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = 29 / 0;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 39;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$onChatAction$1", f = "ZuriChatViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    static final class getSponsorBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component2;
        final ChatAction component3;
        final ZuriChatViewModel copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ChatAction chatAction = this.component3;
                if (Intrinsics.areEqual(chatAction, ChatAction.CopySelectedMessages.INSTANCE)) {
                    String strAccess$copySelectedMessages = ZuriChatViewModel.access$copySelectedMessages(this.copydefault);
                    this.component2 = 1;
                    if (ZuriChatViewModel.access$get_events$p(this.copydefault).emit(new ChatEvent.CopyResult(strAccess$copySelectedMessages, strAccess$copySelectedMessages), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(chatAction, ChatAction.ClearSelection.INSTANCE)) {
                    int i3 = ShareDataUIState + 61;
                    component1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        ZuriChatViewModel.access$clearSelection(this.copydefault);
                        int i4 = 12 / 0;
                    } else {
                        ZuriChatViewModel.access$clearSelection(this.copydefault);
                    }
                    int i5 = component1 + 31;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 5 / 5;
                    }
                } else if (!(!Intrinsics.areEqual(chatAction, ChatAction.DeleteSelectedMessages.INSTANCE))) {
                    int i7 = ShareDataUIState + 117;
                    component1 = i7 % 128;
                    if (i7 % 2 == 0) {
                        ZuriChatViewModel.access$deleteSelectedMessages(this.copydefault);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    ZuriChatViewModel.access$deleteSelectedMessages(this.copydefault);
                } else if (chatAction instanceof ChatAction.SendMessage) {
                    ZuriChatViewModel.access$onMessageSend(this.copydefault, ((ChatAction.SendMessage) this.component3).getText());
                } else if (chatAction instanceof ChatAction.MessageClick) {
                    int i8 = ShareDataUIState + 53;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                    ZuriChatViewModel.access$onMessageClick(this.copydefault, ((ChatAction.MessageClick) this.component3).getMessageId());
                } else if (chatAction instanceof ChatAction.MessageLongClick) {
                    ZuriChatViewModel.access$onMessageLongClick(this.copydefault, ((ChatAction.MessageLongClick) this.component3).getMessageId());
                    int i10 = ShareDataUIState + 111;
                    component1 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    if (!(chatAction instanceof ChatAction.ButtonClick)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ZuriChatViewModel.access$onButtonClicked(this.copydefault, ((ChatAction.ButtonClick) this.component3).getMessageId(), ((ChatAction.ButtonClick) this.component3).getButton());
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = ShareDataUIState + 57;
                component1 = i12 % 128;
                int i13 = i12 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getSponsorBeneficiariesState(ChatAction chatAction, ZuriChatViewModel zuriChatViewModel, Continuation<? super getSponsorBeneficiariesState> continuation) {
            super(2, continuation);
            this.component3 = chatAction;
            this.copydefault = zuriChatViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getSponsorBeneficiariesState getsponsorbeneficiariesstate = new getSponsorBeneficiariesState(this.component3, this.copydefault, continuation);
            int i2 = ShareDataUIState + 49;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
            return getsponsorbeneficiariesstate;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component1 + 79;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getSponsorBeneficiariesState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void onChatAction(ChatAction action) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(action, "");
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new getSponsorBeneficiariesState(action, this, null), 3, null);
        int i2 = equals + 97;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/zuriui/state/ConnectionState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$2", f = "ZuriChatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<ConnectionState, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        Object ShareDataUIState;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            int i2 = component2 + 107;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConnectionState connectionState = (ConnectionState) this.ShareDataUIState;
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = ZuriChatViewModel.access$get_uiState$p(ZuriChatViewModel.this);
            int i3 = component3 + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, ChatUiState.copy$default((ChatUiState) value, null, false, connectionState, 0, false, 27, null)));
            int i5 = component3 + 9;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            if (connectionState == ConnectionState.CONNECTED) {
                int i7 = component2 + 111;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                if (ZuriChatViewModel.access$isFirstLoad$p(ZuriChatViewModel.this)) {
                    ZuriChatViewModel.access$setFirstLoad$p(ZuriChatViewModel.this, false);
                    ZuriChatViewModel.access$checkHeartbeat(ZuriChatViewModel.this);
                    int i9 = component2 + 35;
                    component3 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = ZuriChatViewModel.this.new component1(continuation);
            component1Var.ShareDataUIState = obj;
            component1 component1Var2 = component1Var;
            int i2 = component2 + 85;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return component1Var2;
            }
            throw null;
        }

        public final Object ShareDataUIState(ConnectionState connectionState, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(connectionState, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(ConnectionState connectionState, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(connectionState, continuation);
            int i4 = component3 + 23;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$onMessageSend$1", f = "ZuriChatViewModel.kt", i = {}, l = {208, 209}, m = "invokeSuspend", n = {}, s = {})
    public static final class toString extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MessageUiState component2;
        int copydefault;
        private static final byte[] $$a = {84, 79, Ascii.SYN, 41};
        private static final int $$b = 103;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int hashCode = 0;
        private static int getSponsorBeneficiariesState = 1;
        private static long component3 = -7498756395254551746L;
        private static int component1 = 1386857713;
        private static char component4 = 50417;
        private static char[] equals = {30284, 30294, 30654, 30652, 30311, 30272, 30290, 30625, 30639, 30621, 30624, 30634, 30273, 30323, 30287, 30638, 30637, 30622, 30632, 30642, 30305, 30636, 30623, 30619, 30627, 30630, 30275, 30628, 30278, 30282, 30633, 30620, 30629, 30617, 30618, 30651, 30302, 30307, 30298};
        private static int copy = 321287699;
        private static boolean getRequestBeneficiariesState = true;
        private static boolean getAsAtTimestamp = true;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, int r6, int r7) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.toString.$$a
                int r5 = r5 * 4
                int r1 = r5 + 1
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 + 68
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r5) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L20:
                r4 = r0[r7]
                int r3 = r3 + 1
            L24:
                int r7 = r7 + 1
                int r6 = r6 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.toString.$$c(int, int, int):java.lang.String");
        }

        private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c3 = 2;
            int i2 = 2 % 2;
            INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            iNotificationSideChannel.copydefault = 0;
            while (iNotificationSideChannel.copydefault < length3) {
                int i3 = $11 + 125;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4036 - TextUtils.lastIndexOf("", '0', 0), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (19182 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1912513118, false, $$c(b2, (byte) (b2 | Ascii.US), b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 7567, TextUtils.getOffsetBefore("", 0) + 11, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i5 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[c3] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i5);
                    objArr4[0] = iNotificationSideChannel;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 2459, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 931716605, false, $$c(b3, (byte) (b3 | Ascii.RS), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.indexOf((CharSequence) "", '0'), 10 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getTapTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component4) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    c3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $11 + 77;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            cancel cancelVar = new cancel();
            char[] cArr2 = equals;
            long j = 0;
            int i3 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i4]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 3760, 23 - (ExpandableListView.getPackedPositionForChild(i3, i3) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == j ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', i3)), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i4++;
                        j = 0;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(copy)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 7140, 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            if (getAsAtTimestamp) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i5 = $11 + 97;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (KeyEvent.getMaxKeyCode() >> 16), 19 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (7644 - TextUtils.indexOf("", "")), -327556343, false, $$c(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                String str = new String(cArr4);
                int i7 = $10 + 51;
                $11 = i7 % 128;
                if (i7 % 2 != 0) {
                    objArr[0] = str;
                    return;
                } else {
                    int i8 = 85 / 0;
                    objArr[0] = str;
                    return;
                }
            }
            if (!getRequestBeneficiariesState) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                    int i9 = $10 + 107;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i11 = $11 + 89;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.green(0), Process.getGidForName("") + 20, (char) (Color.rgb(0, 0, 0) + 16784860), -327556343, false, $$c(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = hashCode + 41;
            getSponsorBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.copydefault;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (ZuriChatViewModel.access$getMessageRepository$p(ZuriChatViewModel.this).saveMessage(ChatExtensions.INSTANCE.toDomain(this.component2), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = getSponsorBeneficiariesState + 77;
                    hashCode = i4 % 128;
                    if (i4 % 2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        int i5 = 62 / 0;
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            this.copydefault = 2;
            if (ZuriChatViewModel.access$sendMessageToZuri(ZuriChatViewModel.this, ChatExtensions.INSTANCE.toDomain(this.component2), this) == coroutine_suspended) {
                int i6 = hashCode;
                int i7 = i6 + 115;
                getSponsorBeneficiariesState = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 49 / 0;
                }
                int i9 = i6 + 75;
                getSponsorBeneficiariesState = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 48 / 0;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toString(MessageUiState messageUiState, Continuation<? super toString> continuation) {
            super(2, continuation);
            this.component2 = messageUiState;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            toString tostring = ZuriChatViewModel.this.new toString(this.component2, continuation);
            int i2 = hashCode + 67;
            getSponsorBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return tostring;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = hashCode + 73;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = getSponsorBeneficiariesState + 95;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getSponsorBeneficiariesState + 21;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((toString) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getSponsorBeneficiariesState + 3;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v29 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v42 */
        /* JADX WARN: Type inference failed for: r5v43 */
        /* JADX WARN: Type inference failed for: r5v44 */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] component3(android.content.Context r29, int r30, int r31) {
            /*
                Method dump skipped, instruction units count: 4196
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.toString.component3(android.content.Context, int, int):java.lang.Object[]");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ConnectionState;", "error", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$3", f = "ZuriChatViewModel.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"error"}, s = {"L$0"})
    static final class copydefault extends SuspendLambda implements Function3<FlowCollector<? super ConnectionState>, Throwable, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component1;
        Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i = 2 % 2;
            int i2 = component2 + 63;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.component3;
                MutableSharedFlow mutableSharedFlowAccess$get_events$p = ZuriChatViewModel.access$get_events$p(ZuriChatViewModel.this);
                this.component3 = th2;
                this.component1 = 1;
                if (mutableSharedFlowAccess$get_events$p.emit(new ChatEvent.Error("Connection error: " + th2.getMessage()), this) == coroutine_suspended) {
                    int i4 = component2 + 107;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
                th = th2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.component3;
                ResultKt.throwOnFailure(obj);
            }
            Log.e("ZuriViewModel", "Error observing connection state: " + th.getMessage());
            Unit unit = Unit.INSTANCE;
            int i6 = component2 + 51;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(FlowCollector<? super ConnectionState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(flowCollector, th, continuation);
            int i4 = component2 + 9;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
            return objComponent1;
        }

        public final Object component1(FlowCollector<? super ConnectionState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = ZuriChatViewModel.this.new copydefault(continuation);
            copydefaultVar.component3 = th;
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            int i2 = component2 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }
    }

    private final void component4() {
        int i = 2 % 2;
        final Flow<WebSocketEvent> flowObserveWebSocketEvent = this.getAsAtTimestamp.observeWebSocketEvent();
        Object obj = null;
        FlowKt.launchIn(FlowKt.m13404catch(FlowKt.onEach(FlowKt.debounce(new Flow<ConnectionState>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component2 = 0;
                private static int component3 = 1;
                final FlowCollector component1;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1$2", f = "ZuriChatViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int ShareDataUIState = 1;
                    private static int copydefault;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = ShareDataUIState + 25;
                        copydefault = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass2.this.emit(null, this);
                        int i4 = copydefault + 3;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 68 / 0;
                        }
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        r2 = 1
                        if (r1 == r2) goto L9
                        goto L19
                    L9:
                        r1 = r7
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r3 = r1.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r3 & r4
                        if (r3 == 0) goto L19
                        int r7 = r1.label
                        int r7 = r7 + r4
                        r1.label = r7
                        goto L1e
                    L19:
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1$2$1
                        r1.<init>(r7)
                    L1e:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r4 = r1.label
                        if (r4 == 0) goto L44
                        int r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component3
                        int r6 = r6 + 53
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component2 = r1
                        int r6 = r6 % r0
                        if (r6 == 0) goto L36
                        if (r4 != r2) goto L3c
                        goto L38
                    L36:
                        if (r4 != r2) goto L3c
                    L38:
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L9d
                    L3c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L44:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                        r4 = r1
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent r6 = (com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent) r6
                        boolean r4 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionOpened
                        if (r4 == 0) goto L55
                        com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState r6 = com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState.CONNECTED
                        goto L84
                    L55:
                        boolean r4 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionFailed
                        if (r4 == 0) goto L5c
                        com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState r6 = com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState.ERROR
                        goto L84
                    L5c:
                        boolean r4 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnConnectionClosed
                        if (r4 == 0) goto L75
                        int r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component2
                        int r6 = r6 + 9
                        int r4 = r6 % 128
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component3 = r4
                        int r6 = r6 % r0
                        if (r6 == 0) goto L6e
                        com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState r6 = com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState.DISCONNECTED
                        goto L84
                    L6e:
                        com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState r6 = com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState.DISCONNECTED
                        r6 = 0
                        r6.hashCode()
                        throw r6
                    L75:
                        boolean r6 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketEvent.OnMessageReceived
                        if (r6 == 0) goto La0
                        int r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component3
                        int r6 = r6 + 29
                        int r4 = r6 % 128
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component2 = r4
                        int r6 = r6 % r0
                        com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState r6 = com.huawei.digitalpayment.consumer.zuriui.state.ConnectionState.CONNECTED
                    L84:
                        r1.label = r2
                        java.lang.Object r6 = r7.emit(r6, r1)
                        if (r6 != r3) goto L9d
                        int r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component2
                        int r6 = r6 + 9
                        int r7 = r6 % 128
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component3 = r7
                        int r6 = r6 % r0
                        int r7 = r7 + 29
                        int r6 = r7 % 128
                        com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.component2 = r6
                        int r7 = r7 % r0
                        return r3
                    L9d:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    La0:
                        kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                        r6.<init>()
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeConnectionState$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.component1 = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super ConnectionState> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = flowObserveWebSocketEvent.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i3 = copydefault + 65;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 10 / 0;
                    }
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i5 = component3 + 75;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 1000L), new component1(null)), new copydefault(null)), ViewModelKt.getViewModelScope(this));
        int i2 = getShareableDataState + 23;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "incomingMessage", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeIncomingMessages$1", f = "ZuriChatViewModel.kt", i = {0, 1}, l = {137, 143, 150, 160, 171}, m = "invokeSuspend", n = {"incomingMessage", "incomingMessage"}, s = {"L$0", "L$0"})
    static final class component3 extends SuspendLambda implements Function2<Message, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        Object component2;
        int copydefault;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r2
  0x0060: PHI (r2v15 java.lang.Object) = (r2v4 java.lang.Object), (r2v17 java.lang.Object) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x015f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r2 r8
  0x0029: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v17 java.lang.Object) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r8v1 int) = (r8v0 int), (r8v22 int) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 537
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = ZuriChatViewModel.this.new component3(continuation);
            component3Var.component2 = obj;
            component3 component3Var2 = component3Var;
            int i2 = component3 + 47;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return component3Var2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(Message message, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(message, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            int i5 = component1 + 67;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(Message message, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            component3 = i2 % 128;
            Message message2 = message;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(message2, continuation2);
            }
            ShareDataUIState(message2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "error", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeIncomingMessages$2", f = "ZuriChatViewModel.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    static final class component4 extends SuspendLambda implements Function3<FlowCollector<? super Message>, Throwable, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.copydefault;
                MutableStateFlow mutableStateFlowAccess$get_uiState$p = ZuriChatViewModel.access$get_uiState$p(ZuriChatViewModel.this);
                do {
                    value = mutableStateFlowAccess$get_uiState$p.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, ChatUiState.copy$default((ChatUiState) value, null, false, null, 0, false, 29, null)));
                int i3 = component3 + 1;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MutableSharedFlow mutableSharedFlowAccess$get_events$p = ZuriChatViewModel.access$get_events$p(ZuriChatViewModel.this);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                this.component2 = 1;
                if (mutableSharedFlowAccess$get_events$p.emit(new ChatEvent.Error(message), this) == coroutine_suspended) {
                    int i5 = component3 + 45;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component4(Continuation<? super component4> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(FlowCollector<? super Message> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(flowCollector, th, continuation);
            int i4 = component1 + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(FlowCollector<? super Message> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            component4 component4Var = ZuriChatViewModel.this.new component4(continuation);
            component4Var.copydefault = th;
            Object objInvokeSuspend = component4Var.invokeSuspend(Unit.INSTANCE);
            int i2 = component3 + 105;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void equals() {
        int i = 2 % 2;
        FlowKt.launchIn(FlowKt.m13404catch(FlowKt.onEach(this.getAsAtTimestamp.observeIncomingMessages(), new component3(null)), new component4(null)), ViewModelKt.getViewModelScope(this));
        int i2 = getShareableDataState + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "messages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeMessages$2", f = "ZuriChatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copy extends SuspendLambda implements Function2<ImmutableList<? extends MessageUiState>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        Object ShareDataUIState;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            int i2 = copydefault + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = component1 + 21;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.ShareDataUIState;
            if (i5 == 0) {
                ZuriChatViewModel.access$get_uiState$p(ZuriChatViewModel.this);
                throw null;
            }
            ImmutableList immutableList = (ImmutableList) obj2;
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = ZuriChatViewModel.access$get_uiState$p(ZuriChatViewModel.this);
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, ChatUiState.copy$default((ChatUiState) value, immutableList, false, null, 0, false, 30, null)));
            return Unit.INSTANCE;
        }

        copy(Continuation<? super copy> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = ZuriChatViewModel.this.new copy(continuation);
            copyVar.ShareDataUIState = obj;
            copy copyVar2 = copyVar;
            int i2 = component1 + 97;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return copyVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(ImmutableList<? extends MessageUiState> immutableList, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(immutableList, continuation);
            if (i3 != 0) {
                int i4 = 25 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(ImmutableList<MessageUiState> immutableList, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copy copyVar = (copy) create(immutableList, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return copyVar.invokeSuspend(unit);
            }
            copyVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;", "error", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeMessages$3", f = "ZuriChatViewModel.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    static final class equals extends SuspendLambda implements Function3<FlowCollector<? super ImmutableList<? extends MessageUiState>>, Throwable, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;
        Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.component3;
                MutableSharedFlow mutableSharedFlowAccess$get_events$p = ZuriChatViewModel.access$get_events$p(ZuriChatViewModel.this);
                this.ShareDataUIState = 1;
                if (mutableSharedFlowAccess$get_events$p.emit(new ChatEvent.Error("Failed to load messages: " + th.getMessage()), this) == coroutine_suspended) {
                    int i5 = component2 + 77;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = component2 + 27;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        equals(Continuation<? super equals> continuation) {
            super(3, continuation);
        }

        @Override
        public Object invoke(FlowCollector<? super ImmutableList<? extends MessageUiState>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            component2 = i2 % 128;
            FlowCollector<? super ImmutableList<? extends MessageUiState>> flowCollector2 = flowCollector;
            Throwable th2 = th;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                ShareDataUIState(flowCollector2, th2, continuation2);
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(flowCollector2, th2, continuation2);
            int i3 = component1 + 63;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(FlowCollector<? super ImmutableList<MessageUiState>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            equals equalsVar = ZuriChatViewModel.this.new equals(continuation);
            equalsVar.component3 = th;
            Object objInvokeSuspend = equalsVar.invokeSuspend(Unit.INSTANCE);
            int i2 = component2 + 39;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void copy() {
        int i = 2 % 2;
        final Flow<List<Message>> allMessages = this.getRequestBeneficiariesState.getAllMessages();
        FlowKt.launchIn(FlowKt.m13404catch(FlowKt.onEach(new Flow<ImmutableList<? extends MessageUiState>>() {
            private static int component2 = 1;
            private static int component3;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component2 = 0;
                private static int component3 = 1;
                final FlowCollector component1;
                final ZuriChatViewModel copydefault;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeMessages$$inlined$map$1$2", f = "ZuriChatViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = component3 + 113;
                        ShareDataUIState = i2 % 128;
                        int i3 = i2 % 2;
                        Object obj2 = null;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i3 != 0) {
                            anonymousClass2.emit(null, this);
                            throw null;
                        }
                        Object objEmit = anonymousClass2.emit(null, this);
                        int i4 = component3 + 39;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objEmit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                    /*
                        Method dump skipped, instruction units count: 208
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$observeMessages$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector, ZuriChatViewModel zuriChatViewModel) {
                    this.component1 = flowCollector;
                    this.copydefault = zuriChatViewModel;
                }
            }

            @Override
            public Object collect(FlowCollector<? super ImmutableList<? extends MessageUiState>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = allMessages.collect(new AnonymousClass2(flowCollector, this), continuation);
                Object obj = null;
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i3 = component3 + 103;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objCollect;
                    }
                    throw null;
                }
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 3;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }
        }, new copy(null)), new equals(null)), ViewModelKt.getViewModelScope(this));
        int i2 = equals + 85;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$onButtonClicked$1", f = "ZuriChatViewModel.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int component3;
        final ButtonUiState copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component3;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlowAccess$get_events$p = ZuriChatViewModel.access$get_events$p(ZuriChatViewModel.this);
                String url = this.copydefault.getUrl();
                if (url == null) {
                    return Unit.INSTANCE;
                }
                this.component3 = 1;
                if (mutableSharedFlowAccess$get_events$p.emit(new ChatEvent.OpenUrl(url), this) == coroutine_suspended) {
                    int i5 = component2 + 75;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = component2 + 105;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getRequestBeneficiariesState(ButtonUiState buttonUiState, Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
            this.copydefault = buttonUiState;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = ZuriChatViewModel.this.new getRequestBeneficiariesState(this.copydefault, continuation);
            int i2 = component2 + 1;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return getrequestbeneficiariesstate;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component2 + 55;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private final void copydefault(String str, ButtonUiState buttonUiState) {
        String id;
        int i = 2 % 2;
        MessageUiState messageUiState = (MessageUiState) CollectionsKt.lastOrNull((List) this.component3.getValue().getMessages());
        if (messageUiState != null) {
            int i2 = equals + 3;
            getShareableDataState = i2 % 128;
            if (i2 % 2 == 0) {
                messageUiState.getId();
                throw null;
            }
            id = messageUiState.getId();
        } else {
            id = null;
        }
        if ((!Intrinsics.areEqual(id, str)) && !this.component2) {
            return;
        }
        if (Intrinsics.areEqual(buttonUiState.getType(), MessageType.URL.getType())) {
            onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new getRequestBeneficiariesState(buttonUiState, null), 3, null);
            return;
        }
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new getAsAtTimestamp((MessageUiState) component2(349962837, BCLoadStoreParameter.component1(), new Object[]{this, buttonUiState.getText()}, -349962836, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1()), str, null), 3, null);
        int i3 = getShareableDataState + 115;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$onButtonClicked$2", f = "ZuriChatViewModel.kt", i = {}, l = {230, 231, 232}, m = "invokeSuspend", n = {}, s = {})
    static final class getAsAtTimestamp extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int copydefault = 0;
        private static int equals = 1;
        final String ShareDataUIState;
        final MessageUiState component1;
        int component2;

        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.getAsAtTimestamp.equals
                int r1 = r1 + 23
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.getAsAtTimestamp.copydefault = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L8b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r6.component2
                r3 = 3
                r4 = 1
                if (r2 == 0) goto L32
                if (r2 == r4) goto L2e
                if (r2 == r0) goto L2a
                if (r2 != r3) goto L22
                kotlin.ResultKt.throwOnFailure(r7)
                goto L88
            L22:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L2a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L65
            L2e:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4f
            L32:
                kotlin.ResultKt.throwOnFailure(r7)
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.this
                com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepository r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.access$getMessageRepository$p(r7)
                com.huawei.digitalpayment.consumer.zuriui.ChatExtensions r2 = com.huawei.digitalpayment.consumer.zuriui.ChatExtensions.INSTANCE
                com.huawei.digitalpayment.consumer.zuriui.state.MessageUiState r5 = r6.component1
                com.huawei.digitalpayment.consumer.zuriui.models.Message r2 = r2.toDomain(r5)
                r5 = r6
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r6.component2 = r4
                java.lang.Object r7 = r7.saveMessage(r2, r5)
                if (r7 != r1) goto L4f
                return r1
            L4f:
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.this
                com.huawei.digitalpayment.consumer.zuriui.ChatExtensions r2 = com.huawei.digitalpayment.consumer.zuriui.ChatExtensions.INSTANCE
                com.huawei.digitalpayment.consumer.zuriui.state.MessageUiState r4 = r6.component1
                com.huawei.digitalpayment.consumer.zuriui.models.Message r2 = r2.toDomain(r4)
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r6.component2 = r0
                java.lang.Object r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.access$sendMessageToZuri(r7, r2, r4)
                if (r7 != r1) goto L65
                return r1
            L65:
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.this
                com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepository r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.access$getMessageRepository$p(r7)
                java.lang.String r2 = r6.ShareDataUIState
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r6.component2 = r3
                java.lang.Object r7 = r7.deleteMessage(r2, r4)
                if (r7 != r1) goto L88
                int r7 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.getAsAtTimestamp.equals
                int r7 = r7 + 97
                int r2 = r7 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.getAsAtTimestamp.copydefault = r2
                int r7 = r7 % r0
                if (r7 == 0) goto L87
                r7 = 96
                int r7 = r7 / 0
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L8b:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r7 = 0
                r7.hashCode()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.getAsAtTimestamp.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getAsAtTimestamp(MessageUiState messageUiState, String str, Continuation<? super getAsAtTimestamp> continuation) {
            super(2, continuation);
            this.component1 = messageUiState;
            this.ShareDataUIState = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getAsAtTimestamp getasattimestamp = ZuriChatViewModel.this.new getAsAtTimestamp(this.component1, this.ShareDataUIState, continuation);
            int i2 = equals + 105;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return getasattimestamp;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            equals = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = copydefault + 1;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                return objComponent1;
            }
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getAsAtTimestamp) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void component1(String str) {
        ChatUiState value;
        int i = 2 % 2;
        int i2 = equals + 93;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            this.component3.getValue().isSelectionMode();
            throw null;
        }
        if (!this.component3.getValue().isSelectionMode()) {
            int i3 = equals + 69;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            MutableStateFlow<ChatUiState> mutableStateFlow = this.component3;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ChatUiState.copy$default(value, null, false, null, 0, true, 15, null)));
        }
        copydefault(str);
        int i5 = equals + 55;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
    }

    private final void component2(String str) {
        int i = 2 % 2;
        int i2 = equals + 103;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
            if (!this.component3.getValue().isSelectionMode()) {
                return;
            }
        } else if (!this.component3.getValue().isSelectionMode()) {
            return;
        }
        copydefault(str);
        int i4 = getShareableDataState + 19;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void component3() {
        int i = 2 % 2;
        ImmutableList<MessageUiState> messages = this.component3.getValue().getMessages();
        ArrayList arrayList = new ArrayList();
        for (MessageUiState messageUiState : messages) {
            int i2 = equals + 33;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            if (messageUiState.isSelected()) {
                arrayList.add(messageUiState);
                int i4 = getShareableDataState + 63;
                equals = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(arrayList, null), 3, null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$deleteSelectedMessages$1", f = "ZuriChatViewModel.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component1;
        final List<MessageUiState> component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MessagesRepository messagesRepositoryAccess$getMessageRepository$p = ZuriChatViewModel.access$getMessageRepository$p(ZuriChatViewModel.this);
                List<MessageUiState> list = this.component3;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ChatExtensions.INSTANCE.toDomain((MessageUiState) it.next()));
                    int i3 = copydefault + 5;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }
                this.component1 = 1;
                if (messagesRepositoryAccess$getMessageRepository$p.deleteMessages(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = ShareDataUIState + 69;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            ZuriChatViewModel.access$clearSelection(ZuriChatViewModel.this);
            Unit unit = Unit.INSTANCE;
            int i6 = ShareDataUIState + 45;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(List<MessageUiState> list, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component3 = list;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = ZuriChatViewModel.this.new ShareDataUIState(this.component3, continuation);
            int i2 = copydefault + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = 9 / 0;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 7;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static final CharSequence ShareDataUIState(MessageUiState messageUiState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(messageUiState, "");
        String str = messageUiState.getUser().getName() + HttpConstants.HEADER_VALUE_DELIMITER + messageUiState.getText() + " (" + ChatExtensions.INSTANCE.formatTimestamp(messageUiState.getCreatedAt()) + ')';
        int i2 = getShareableDataState + 57;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private final String copydefault() {
        int i = 2 % 2;
        ImmutableList<MessageUiState> messages = this.component3.getValue().getMessages();
        ArrayList arrayList = new ArrayList();
        for (MessageUiState messageUiState : messages) {
            if (messageUiState.isSelected()) {
                int i2 = getShareableDataState + 19;
                equals = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(messageUiState);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(messageUiState);
                int i3 = equals + 33;
                getShareableDataState = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj2) {
                int i5 = 2 % 2;
                int i6 = component2 + 21;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                CharSequence charSequenceM12151$r8$lambda$zo3reL0ec8yU_qJyizj7hpWw3M = ZuriChatViewModel.m12151$r8$lambda$zo3reL0ec8yU_qJyizj7hpWw3M((MessageUiState) obj2);
                int i8 = component2 + 81;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    return charSequenceM12151$r8$lambda$zo3reL0ec8yU_qJyizj7hpWw3M;
                }
                throw null;
            }
        }, 30, null);
        component1();
        return strJoinToString$default;
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = equals + 55;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        MessageUiState messageUiState = (MessageUiState) CollectionsKt.firstOrNull((List) this.component3.getValue().getMessages());
        if (messageUiState == null || !messageUiState.isCurrentUser()) {
            onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2((MessageUiState) component2(349962837, BCLoadStoreParameter.component1(), new Object[]{this, "Hey Zuri"}, -349962836, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1()), null), 3, null);
            int i4 = equals + 7;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$checkHeartbeat$1", f = "ZuriChatViewModel.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        final MessageUiState ShareDataUIState;
        int component2;

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
  0x0032: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
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
                int r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.copydefault
                int r1 = r1 + 77
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.component3 = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component2
                r4 = 67
                int r4 = r4 / 0
                if (r3 == 0) goto L32
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component2
                if (r3 == 0) goto L32
            L24:
                if (r3 != r2) goto L2a
                kotlin.ResultKt.throwOnFailure(r6)
                goto L5a
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L32:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.this
                com.huawei.digitalpayment.consumer.zuriui.ChatExtensions r3 = com.huawei.digitalpayment.consumer.zuriui.ChatExtensions.INSTANCE
                com.huawei.digitalpayment.consumer.zuriui.state.MessageUiState r4 = r5.ShareDataUIState
                com.huawei.digitalpayment.consumer.zuriui.models.Message r3 = r3.toDomain(r4)
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.component2 = r2
                java.lang.Object r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.access$sendMessageToZuri(r6, r3, r4)
                if (r6 != r1) goto L5a
                int r6 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.copydefault
                int r6 = r6 + 15
                int r2 = r6 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.component3 = r2
                int r6 = r6 % r0
                if (r6 == 0) goto L59
                r6 = 72
                int r6 = r6 / 0
            L59:
                return r1
            L5a:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.copydefault
                int r1 = r1 + r2
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.component3 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L67
                return r6
            L67:
                r6 = 0
                r6.hashCode()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(MessageUiState messageUiState, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.ShareDataUIState = messageUiState;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = ZuriChatViewModel.this.new component2(this.ShareDataUIState, continuation);
            int i2 = component3 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component2Var.invokeSuspend(unit);
            }
            component2Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static Object copydefault(Object[] objArr) {
        ZuriChatViewModel zuriChatViewModel = (ZuriChatViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        MessageUiState messageUiState = new MessageUiState(String.valueOf(leastSignificantBits), str, new UserUiState((String) component2(-38968169, BCLoadStoreParameter.component1(), new Object[]{zuriChatViewModel}, 38968171, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1()), zuriChatViewModel.getAsAtTimestamp(), null), System.currentTimeMillis(), MessageType.TEXT, null, false, true, 96, null);
        int i2 = equals + 17;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return messageUiState;
        }
        throw null;
    }

    private final Object component1(Message message, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String name = message.getUser().getName();
        String id = message.getUser().getId();
        String text = message.getText();
        if (text == null) {
            int i4 = equals + 123;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            text = "";
        }
        Object objSendMessage = this.getAsAtTimestamp.sendMessage(new MessagePayload(new MessagePayload.MessageBody((String) null, name, id, "PROD", text, 1, (DefaultConstructorMarker) null)), continuation);
        if (objSendMessage != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i6 = equals + 61;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
        return objSendMessage;
    }

    @Override
    public void onCleared() {
        int i = 2 % 2;
        super.onCleared();
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ArtificialStackFrames(null), 3, null);
        int i2 = getShareableDataState + 65;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel$onCleared$1", f = "ZuriChatViewModel.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    static final class ArtificialStackFrames extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 != 0) {
                int i4 = ShareDataUIState + 49;
                component2 = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i5 = component2 + 27;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (ZuriChatViewModel.access$getWebSocketRepository$p(ZuriChatViewModel.this).disconnect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        ArtificialStackFrames(Continuation<? super ArtificialStackFrames> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ArtificialStackFrames artificialStackFrames = ZuriChatViewModel.this.new ArtificialStackFrames(continuation);
            int i2 = ShareDataUIState + 79;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return artificialStackFrames;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 43;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            int i5 = ShareDataUIState + 103;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ArtificialStackFrames artificialStackFrames = (ArtificialStackFrames) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                artificialStackFrames.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = artificialStackFrames.invokeSuspend(unit);
            int i4 = ShareDataUIState + 65;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final void onStartChat() {
        MutableStateFlow<Boolean> mutableStateFlow;
        boolean z;
        int i = 2 % 2;
        int i2 = getShareableDataState + 117;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            SPUtils.getInstance().put(IS_FIRST_TIME_CHATTING_ZURI, false);
            mutableStateFlow = this.copydefault;
            z = true;
        } else {
            SPUtils.getInstance().put(IS_FIRST_TIME_CHATTING_ZURI, false);
            mutableStateFlow = this.copydefault;
            z = false;
        }
        mutableStateFlow.setValue(z);
    }

    private final String getAsAtTimestamp() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = ProfileHelper.INSTANCE.getProfiles().iterator();
        while (it.hasNext()) {
            int i4 = getShareableDataState + 7;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(((LocalProfileItem) it.next()).getName(), "FirstName");
                throw null;
            }
            LocalProfileItem localProfileItem = (LocalProfileItem) it.next();
            if (Intrinsics.areEqual(localProfileItem.getName(), "FirstName")) {
                String value = localProfileItem.getValue();
                if (value != null) {
                    return value;
                }
                int i5 = equals + 65;
                getShareableDataState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 13 / 0;
                }
                return "Me";
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void copydefault(String str) {
        ChatUiState value;
        ChatUiState chatUiState;
        ImmutableList immutableList;
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 51;
        getShareableDataState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        MutableStateFlow<ChatUiState> mutableStateFlow = this.component3;
        do {
            value = mutableStateFlow.getValue();
            chatUiState = value;
            ImmutableList<MessageUiState> messages = chatUiState.getMessages();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
            int i4 = equals + 87;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            for (MessageUiState messageUiStateCopy$default : messages) {
                int i6 = getShareableDataState + 61;
                equals = i6 % 128;
                int i7 = i6 % 2;
                if (Intrinsics.areEqual(messageUiStateCopy$default.getId(), str)) {
                    messageUiStateCopy$default = MessageUiState.copy$default(messageUiStateCopy$default, null, null, null, 0L, null, null, !messageUiStateCopy$default.isSelected(), false, 191, null);
                }
                arrayList.add(messageUiStateCopy$default);
            }
            immutableList = ExtensionsKt.toImmutableList(arrayList);
            ImmutableList immutableList2 = immutableList;
            if (!(!(immutableList2 instanceof Collection)) && immutableList2.isEmpty()) {
                i = 0;
            } else {
                Iterator<E> it = immutableList2.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    int i9 = getShareableDataState + 87;
                    equals = i9 % 128;
                    if (i9 % 2 != 0) {
                        ((MessageUiState) it.next()).isSelected();
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!((MessageUiState) it.next()).isSelected()) && (i8 = i8 + 1) < 0) {
                        int i10 = equals + 119;
                        getShareableDataState = i10 % 128;
                        int i11 = i10 % 2;
                        CollectionsKt.throwCountOverflow();
                    }
                }
                i = i8;
            }
        } while (!mutableStateFlow.compareAndSet(value, ChatUiState.copy$default(chatUiState, immutableList, false, null, i, i > 0, 6, null)));
    }

    private final void component1() {
        ChatUiState value;
        ChatUiState chatUiState;
        ArrayList arrayList;
        int i = 2 % 2;
        MutableStateFlow<ChatUiState> mutableStateFlow = this.component3;
        int i2 = getShareableDataState + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        do {
            value = mutableStateFlow.getValue();
            chatUiState = value;
            ImmutableList<MessageUiState> messages = chatUiState.getMessages();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
            Iterator<MessageUiState> it = messages.iterator();
            int i4 = getShareableDataState + 25;
            equals = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                arrayList.add(MessageUiState.copy$default(it.next(), null, null, null, 0L, null, null, false, false, 191, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, ChatUiState.copy$default(chatUiState, ExtensionsKt.toImmutableList(arrayList), false, null, 0, false, 6, null)));
    }

    public static CharSequence m12151$r8$lambda$zo3reL0ec8yU_qJyizj7hpWw3M(MessageUiState messageUiState) {
        int i = 2 % 2;
        int i2 = equals + 85;
        getShareableDataState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ShareDataUIState(messageUiState);
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceShareDataUIState = ShareDataUIState(messageUiState);
        int i3 = getShareableDataState + 59;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return charSequenceShareDataUIState;
        }
        throw null;
    }

    static {
        int i = getSponsorBeneficiariesState + 125;
        hashCode = i % 128;
        int i2 = i % 2;
    }

    private final MessageUiState ShareDataUIState(String str) {
        return (MessageUiState) component2(349962837, BCLoadStoreParameter.component1(), new Object[]{this, str}, -349962836, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1());
    }

    private final String ShareDataUIState() {
        return (String) component2(-38968169, BCLoadStoreParameter.component1(), new Object[]{this}, 38968171, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1());
    }

    private final void component3(String str) {
        component2(1330911816, BCLoadStoreParameter.component1(), new Object[]{this, str}, -1330911816, BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1(), BCLoadStoreParameter.component1());
    }
}
