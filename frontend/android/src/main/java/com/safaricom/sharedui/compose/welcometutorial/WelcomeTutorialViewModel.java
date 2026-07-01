package com.safaricom.sharedui.compose.welcometutorial;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safaricom.designsystem.components.bubble.ArrowAlignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u001eJ(\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0015J\u0016\u0010-\u001a\u00020!2\u0006\u0010&\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020\u001eJ\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0002J\f\u00104\u001a\u000205*\u00020\rH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_currentHighlight", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewWrapper;", "currentHighlight", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentHighlight", "()Lkotlinx/coroutines/flow/StateFlow;", "_viewMap", "", "", "", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider;", "viewMap", "", "getViewMap", "()Ljava/util/Map;", "_listeners", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialListener;", "_highlightData", "Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;", "value", "stepsMax", "getStepsMax", "()I", "_currentStep", "setMaxSteps", "", "steps", "startWelcomeTutorial", "Lkotlinx/coroutines/Job;", "nextStep", "previousStep", "replayTutorial", "registerHighlightData", "position", "titleResource", "contentResource", "arrowAlignment", "Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerHighlight", "wrapper", "showCurrentHighlight", "onDone", "notifyListeners", "direction", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialDirection;", "isValidHighlightPosition", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WelcomeTutorialViewModel extends ViewModel {
    public static final int $stable = 8;
    private final List<WelcomeTutorialListener> ShareDataUIState;
    private final MutableStateFlow<HighlightViewWrapper> component1;
    private final Map<Integer, HighlightViewData> component2;
    private final Map<Integer, List<WelcomeTutorialRectProvider>> component3;
    private int copy;
    private int copydefault;
    private final Map<Integer, List<WelcomeTutorialRectProvider>> getAsAtTimestamp;
    private final StateFlow<HighlightViewWrapper> getRequestBeneficiariesState;

    @Inject
    public WelcomeTutorialViewModel() {
        MutableStateFlow<HighlightViewWrapper> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.component1 = MutableStateFlow;
        this.getRequestBeneficiariesState = FlowKt.asStateFlow(MutableStateFlow);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.component3 = linkedHashMap;
        this.getAsAtTimestamp = linkedHashMap;
        this.ShareDataUIState = new ArrayList();
        this.component2 = new LinkedHashMap();
        this.copydefault = -1;
    }

    public final StateFlow<HighlightViewWrapper> getCurrentHighlight() {
        return this.getRequestBeneficiariesState;
    }

    public final Map<Integer, List<WelcomeTutorialRectProvider>> getViewMap() {
        return this.getAsAtTimestamp;
    }

    public final int getCopy() {
        return this.copy;
    }

    public final void setMaxSteps(int steps) {
        this.copy = steps;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel$startWelcomeTutorial$1", f = "WelcomeTutorialViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.ShareDataUIState;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WelcomeTutorialViewModel.this.copydefault = 0;
                this.ShareDataUIState = 1;
                if (WelcomeTutorialViewModel.this.component1.emit(HighlightViewWrapper.INSTANCE.getGREETING(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeTutorialViewModel.this.new component3(continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Job startWelcomeTutorial() {
        return onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(null), 3, null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel$nextStep$1", f = "WelcomeTutorialViewModel.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.copydefault;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WelcomeTutorialViewModel.this.copydefault + 1;
                if (WelcomeTutorialViewModel.this.ShareDataUIState(i2)) {
                    WelcomeTutorialViewModel.this.copydefault = i2;
                    WelcomeTutorialViewModel.this.ShareDataUIState(WelcomeTutorialDirection.FORWARD);
                }
                if (i2 == 7) {
                    this.copydefault = 1;
                    if (WelcomeTutorialViewModel.this.component1.emit(HighlightViewWrapper.INSTANCE.getCLOSING(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeTutorialViewModel.this.new copydefault(continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Job nextStep() {
        return onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(null), 3, null);
    }

    public final void previousStep() {
        int i = this.copydefault - 1;
        if (ShareDataUIState(i)) {
            this.copydefault = i;
            ShareDataUIState(WelcomeTutorialDirection.REVERSE);
        }
    }

    public final void replayTutorial() {
        this.copydefault = 0;
        nextStep();
    }

    public static void registerHighlightData$default(WelcomeTutorialViewModel welcomeTutorialViewModel, int i, int i2, int i3, ArrowAlignment arrowAlignment, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            arrowAlignment = ArrowAlignment.TopCenter;
        }
        welcomeTutorialViewModel.registerHighlightData(i, i2, i3, arrowAlignment);
    }

    public final void registerHighlightData(int position, int titleResource, int contentResource, ArrowAlignment arrowAlignment) {
        Intrinsics.checkNotNullParameter(arrowAlignment, "");
        this.component2.put(Integer.valueOf(position), new HighlightViewData(arrowAlignment, titleResource, contentResource));
    }

    public final void registerListener(WelcomeTutorialListener listener) {
        Intrinsics.checkNotNullParameter(listener, "");
        this.ShareDataUIState.add(listener);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel$registerHighlight$1", f = "WelcomeTutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int ShareDataUIState;
        final int component1;
        final WelcomeTutorialRectProvider copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState == 0) {
                ResultKt.throwOnFailure(obj);
                if (!WelcomeTutorialViewModel.this.component3.containsKey(Boxing.boxInt(this.component1))) {
                    WelcomeTutorialViewModel.this.component3.put(Boxing.boxInt(this.component1), new ArrayList());
                }
                List list = (List) WelcomeTutorialViewModel.this.component3.get(Boxing.boxInt(this.component1));
                if (list != null) {
                    Boxing.boxBoolean(list.add(this.copydefault));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(int i, WelcomeTutorialRectProvider welcomeTutorialRectProvider, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component1 = i;
            this.copydefault = welcomeTutorialRectProvider;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeTutorialViewModel.this.new ShareDataUIState(this.component1, this.copydefault, continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Job registerHighlight(int position, WelcomeTutorialRectProvider wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "");
        return onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(position, wrapper, null), 3, null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel$showCurrentHighlight$1", f = "WelcomeTutorialViewModel.kt", i = {}, l = {85, 90}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final HighlightViewData component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.copydefault;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            HighlightViewWrapper highlightViewWrapper = new HighlightViewWrapper(WelcomeTutorialViewModel.this.copydefault, this.component3, null, 4, null);
            this.copydefault = 2;
            if (WelcomeTutorialViewModel.this.component1.emit(highlightViewWrapper, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(HighlightViewData highlightViewData, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.component3 = highlightViewData;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeTutorialViewModel.this.new component1(this.component3, continuation);
        }

        @Override
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void showCurrentHighlight() {
        HighlightViewData highlightViewData = this.component2.get(Integer.valueOf(this.copydefault));
        if (highlightViewData == null) {
            return;
        }
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component1(highlightViewData, null), 3, null);
    }

    public final void onDone() {
        Iterator<T> it = this.ShareDataUIState.iterator();
        while (it.hasNext()) {
            ((WelcomeTutorialListener) it.next()).onComplete();
        }
    }

    public final void ShareDataUIState(WelcomeTutorialDirection welcomeTutorialDirection) {
        Iterator<T> it = this.ShareDataUIState.iterator();
        while (it.hasNext()) {
            ((WelcomeTutorialListener) it.next()).onNextStep(new WelcomeTutorialStep(this.copydefault, welcomeTutorialDirection));
        }
    }

    public final boolean ShareDataUIState(int i) {
        return i >= 0 && i <= this.copy;
    }
}
