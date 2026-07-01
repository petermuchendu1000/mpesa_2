package com.safaricom.consumer.commons.offline;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.safaricom.consumer.commons.util.SingleLiveEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\"\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lcom/safaricom/consumer/commons/offline/OfflineModeDelegate;", "", "repository", "Lcom/safaricom/consumer/commons/offline/OfflineModeRepository;", "<init>", "(Lcom/safaricom/consumer/commons/offline/OfflineModeRepository;)V", "_showOfflineModeWarning", "Lcom/safaricom/consumer/commons/util/SingleLiveEvent;", "", "showOfflineModeWarning", "Landroidx/lifecycle/LiveData;", "getShowOfflineModeWarning", "()Landroidx/lifecycle/LiveData;", "_isOfflineModeOn", "Landroidx/lifecycle/MutableLiveData;", "isOfflineModeOn", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "handleOfflineModeWarning", "", "context", "Landroid/content/Context;", "restoreOfflineModeInstanceState", "outState", "Landroid/os/Bundle;", "saveOfflineModeInstanceState", "setOfflineModeStatus", "offlineModeStatus", "hasOfflineModeEnabled", "smsChannelPermissionGranted", "getOfflineModeOptionStatus", "isOfflineModeEnabled", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineModeDelegate {
    private static final String component1 = "ON_OFFLINE_MODE";
    private static final String component3 = "SHOW_OFFLINE_MODE_WARNING";
    private final SingleLiveEvent<Boolean> ShareDataUIState;
    private final LiveData<Boolean> component2;
    private final MutableLiveData<Boolean> copydefault;
    private final LiveData<Boolean> equals;
    private final OfflineModeRepository getRequestBeneficiariesState;
    public CoroutineScope scope;

    public final boolean component2(Context context) {
        return false;
    }

    @Inject
    public OfflineModeDelegate(OfflineModeRepository offlineModeRepository) {
        Intrinsics.checkNotNullParameter(offlineModeRepository, "");
        this.getRequestBeneficiariesState = offlineModeRepository;
        SingleLiveEvent<Boolean> singleLiveEvent = new SingleLiveEvent<>();
        this.ShareDataUIState = singleLiveEvent;
        this.equals = singleLiveEvent;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.component2 = mutableLiveData;
    }

    public final LiveData<Boolean> getShowOfflineModeWarning() {
        return this.equals;
    }

    public final LiveData<Boolean> isOfflineModeOn() {
        return this.component2;
    }

    public final CoroutineScope getScope() {
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setScope(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.scope = coroutineScope;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.offline.OfflineModeDelegate$handleOfflineModeWarning$1", f = "OfflineModeDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault == 0) {
                ResultKt.throwOnFailure(obj);
                if (OfflineModeDelegate.this.getRequestBeneficiariesState.onOfflineMode() && !OfflineModeDelegate.this.component2(this.component3)) {
                    OfflineModeDelegate.this.ShareDataUIState.postValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(Context context, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component3 = context;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OfflineModeDelegate.this.new copydefault(this.component3, continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void handleOfflineModeWarning(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        onSubMenuSelected.ShareDataUIState(getScope(), Dispatchers.getIO(), null, new copydefault(context, null), 2, null);
    }

    public final void restoreOfflineModeInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "");
        this.ShareDataUIState.setValue(Boolean.valueOf(outState.getBoolean(component3)));
        this.copydefault.setValue(Boolean.valueOf(outState.getBoolean(component1)));
    }

    public final void saveOfflineModeInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "");
        Boolean value = this.ShareDataUIState.getValue();
        if (value != null) {
            outState.putBoolean(component3, value.booleanValue());
        }
        Boolean value2 = this.copydefault.getValue();
        if (value2 != null) {
            outState.putBoolean(component1, value2.booleanValue());
        }
    }

    public final void setOfflineModeStatus(boolean offlineModeStatus) {
        this.copydefault.postValue(Boolean.valueOf(offlineModeStatus));
    }

    public final boolean hasOfflineModeEnabled() {
        return Intrinsics.areEqual((Object) this.component2.getValue(), (Object) true);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.offline.OfflineModeDelegate$getOfflineModeOptionStatus$1", f = "OfflineModeDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OfflineModeDelegate.this.getRequestBeneficiariesState.getOfflineModeSettingValue();
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OfflineModeDelegate.this.new component3(continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void getOfflineModeOptionStatus() throws InterruptedException {
        BuildersKt.runBlocking(Dispatchers.getIO(), new component3(null));
    }

    public final boolean isOfflineModeEnabled() {
        return this.getRequestBeneficiariesState.isOfflineModeFeatureEnabled();
    }
}
