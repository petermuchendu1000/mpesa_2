package com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings;

import com.huawei.digitalpayment.consumer.base.database.entities.HomeSettingsEntity;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.model.HomeSettings;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsRepository;", "localDataSource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsLocalDataSource;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsLocalDataSource;)V", "getHomeSettings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;", "setHomeSettings", "", "homeSettings", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeSettingsRepositoryImpl implements HomeSettingsRepository {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final HomeSettingsLocalDataSource ShareDataUIState;

    @Inject
    public HomeSettingsRepositoryImpl(HomeSettingsLocalDataSource homeSettingsLocalDataSource) {
        Intrinsics.checkNotNullParameter(homeSettingsLocalDataSource, "");
        this.ShareDataUIState = homeSettingsLocalDataSource;
    }

    public static final HomeSettingsLocalDataSource access$getLocalDataSource$p(HomeSettingsRepositoryImpl homeSettingsRepositoryImpl) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        HomeSettingsLocalDataSource homeSettingsLocalDataSource = homeSettingsRepositoryImpl.ShareDataUIState;
        if (i4 == 0) {
            int i5 = 53 / 0;
        }
        int i6 = i2 + 123;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
        return homeSettingsLocalDataSource;
    }

    @Override
    public Flow<HomeSettings> getHomeSettings() {
        int i = 2 % 2;
        Flow<HomeSettings> flow = FlowKt.flow(new copydefault(null));
        int i2 = component2 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.HomeSettingsRepositoryImpl$getHomeSettings$1", f = "HomeSettingsRepositoryImpl.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<FlowCollector<? super HomeSettings>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component1;
        private Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            if (i4 != 0) {
                int i5 = component2 + 97;
                int i6 = i5 % 128;
                ShareDataUIState = i6;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i6 + 101;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.component3;
                this.component1 = 1;
                if (HomeSettingsRepositoryImpl.access$getLocalDataSource$p(HomeSettingsRepositoryImpl.this).getHomeSettings().collect(new FlowCollector() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i9 = 2 % 2;
                        int i10 = ShareDataUIState + 5;
                        component1 = i10 % 128;
                        HomeSettingsEntity homeSettingsEntity = (HomeSettingsEntity) obj2;
                        if (i10 % 2 != 0) {
                            return ShareDataUIState(homeSettingsEntity, continuation);
                        }
                        ShareDataUIState(homeSettingsEntity, continuation);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object ShareDataUIState(HomeSettingsEntity homeSettingsEntity, Continuation<? super Unit> continuation) {
                        int i9 = 2 % 2;
                        Object objEmit = flowCollector.emit(HomeSettingsRepositoryImplKt.access$toHomeSettings(homeSettingsEntity), continuation);
                        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            Unit unit = Unit.INSTANCE;
                            int i10 = component1 + 93;
                            ShareDataUIState = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 94 / 0;
                            }
                            return unit;
                        }
                        int i12 = ShareDataUIState + 91;
                        component1 = i12 % 128;
                        if (i12 % 2 != 0) {
                            return objEmit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    int i9 = component2 + 61;
                    ShareDataUIState = i9 % 128;
                    if (i9 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = HomeSettingsRepositoryImpl.this.new copydefault(continuation);
            copydefaultVar.component3 = obj;
            copydefault copydefaultVar2 = copydefaultVar;
            int i2 = component2 + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar2;
        }

        @Override
        public Object invoke(FlowCollector<? super HomeSettings> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            component2 = i2 % 128;
            FlowCollector<? super HomeSettings> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(flowCollector2, continuation2);
            }
            component1(flowCollector2, continuation2);
            throw null;
        }

        public final Object component1(FlowCollector<? super HomeSettings> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            copydefault copydefaultVar = (copydefault) create(flowCollector, continuation);
            if (i3 != 0) {
                copydefaultVar.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 25;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public Object setHomeSettings(HomeSettings homeSettings, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object homeSettings2 = this.ShareDataUIState.setHomeSettings(HomeSettingsRepositoryImplKt.access$toHomeSettingsEntity(homeSettings), continuation);
        if (homeSettings2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 67;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        int i6 = component3 + 27;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return homeSettings2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 105;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
