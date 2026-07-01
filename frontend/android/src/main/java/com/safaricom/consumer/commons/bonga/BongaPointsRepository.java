package com.safaricom.consumer.commons.bonga;

import com.safaricom.consumer.commons.api.ConsumerApiLayer;
import com.safaricom.consumer.commons.bonga.BongaPointsInfo;
import com.safaricom.consumer.commons.bonga.BongaPointsInfoPayloadDto;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.preference.UserPreferencesRepository;
import com.safaricom.consumer.commons.resource.Resource;
import com.safaricom.consumer.commons.session.SessionRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsRepository;", "", "userPreferencesRepository", "Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;", "sessionRepository", "Lcom/safaricom/consumer/commons/session/SessionRepository;", "apiLayer", "Lcom/safaricom/consumer/commons/api/ConsumerApiLayer;", "consumerConfigurationRepository", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "<init>", "(Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;Lcom/safaricom/consumer/commons/session/SessionRepository;Lcom/safaricom/consumer/commons/api/ConsumerApiLayer;Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "isFirstTimeOnBongaPointsSupportedScreen", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBongaPointsSupportedScreenShown", "", "getBongaPointsInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo;", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaPointsRepository {
    private static final String ShareDataUIState = "ACTIVE";
    private final ConsumerApiLayer component1;
    private final ConfigurationRepository component2;
    private final UserPreferencesRepository component3;
    private final SessionRepository copydefault;

    @Inject
    public BongaPointsRepository(UserPreferencesRepository userPreferencesRepository, SessionRepository sessionRepository, ConsumerApiLayer consumerApiLayer, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(userPreferencesRepository, "");
        Intrinsics.checkNotNullParameter(sessionRepository, "");
        Intrinsics.checkNotNullParameter(consumerApiLayer, "");
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        this.component3 = userPreferencesRepository;
        this.copydefault = sessionRepository;
        this.component1 = consumerApiLayer;
        this.component2 = configurationRepository;
    }

    public final Object isFirstTimeOnBongaPointsSupportedScreen(Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.component3.isFirstTimeOnBongaPointsSupportedScreen());
    }

    public final void setBongaPointsSupportedScreenShown() {
        this.component3.setFirstTimeOnBongaPointsSupportedScreen();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.safaricom.consumer.commons.bonga.BongaPointsRepository$getBongaPointsInfo$1", f = "BongaPointsRepository.kt", i = {0}, l = {33, 38, 45, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class component2 extends SuspendLambda implements Function2<FlowCollector<? super Resource<? extends BongaPointsInfo>>, Continuation<? super Unit>, Object> {
        int ShareDataUIState;
        private Object component3;

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[RETURN] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.ShareDataUIState
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lbb
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.component3
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lad
            L2b:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L77
            L2f:
                java.lang.Object r1 = r9.component3
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L53
            L37:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.component3
                kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                com.safaricom.consumer.commons.resource.Resource$Companion r1 = com.safaricom.consumer.commons.resource.Resource.INSTANCE
                com.safaricom.consumer.commons.resource.Resource r1 = r1.loading(r6)
                r7 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r9.component3 = r10
                r9.ShareDataUIState = r5
                java.lang.Object r1 = r10.emit(r1, r7)
                if (r1 != r0) goto L52
                return r0
            L52:
                r1 = r10
            L53:
                com.safaricom.consumer.commons.bonga.BongaPointsRepository r10 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.this
                com.safaricom.consumer.commons.session.SessionRepository r10 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.access$getSessionRepository$p(r10)
                java.lang.String r10 = r10.getCurrentUserMsisdn()
                if (r10 != 0) goto L7a
                com.safaricom.consumer.commons.resource.Resource$Companion r10 = com.safaricom.consumer.commons.resource.Resource.INSTANCE
                com.safaricom.consumer.commons.resource.ErrorType$Storage r2 = com.safaricom.consumer.commons.resource.ErrorType.Storage.INSTANCE
                com.safaricom.consumer.commons.resource.ErrorType r2 = (com.safaricom.consumer.commons.resource.ErrorType) r2
                com.safaricom.consumer.commons.resource.Resource r10 = r10.error(r2)
                r2 = r9
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r9.component3 = r6
                r9.ShareDataUIState = r4
                java.lang.Object r10 = r1.emit(r10, r2)
                if (r10 != r0) goto L77
                return r0
            L77:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L7a:
                com.safaricom.consumer.commons.util.MsisdnHelper r4 = com.safaricom.consumer.commons.util.MsisdnHelper.INSTANCE
                com.safaricom.consumer.commons.bonga.BongaPointsRepository r7 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.this
                com.safaricom.consumer.commons.configuration.ConfigurationRepository r7 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.access$getConsumerConfigurationRepository$p(r7)
                java.lang.String r7 = r7.getCountryCode()
                com.safaricom.consumer.commons.bonga.BongaPointsRepository r8 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.this
                com.safaricom.consumer.commons.configuration.ConfigurationRepository r8 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.access$getConsumerConfigurationRepository$p(r8)
                java.lang.String r8 = r8.getCountryCode()
                java.lang.String r10 = r4.formatMsisdnToE164(r10, r7, r8, r5)
                com.safaricom.consumer.commons.bonga.BongaPointsRepository r4 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.this
                com.safaricom.consumer.commons.api.ConsumerApiLayer r4 = com.safaricom.consumer.commons.bonga.BongaPointsRepository.access$getApiLayer$p(r4)
                com.safaricom.consumer.commons.bonga.BongaPointsRepository$getBongaPointsInfo$1$$ExternalSyntheticLambda0 r5 = new com.safaricom.consumer.commons.bonga.BongaPointsRepository$getBongaPointsInfo$1$$ExternalSyntheticLambda0
                r5.<init>()
                r7 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r9.component3 = r1
                r9.ShareDataUIState = r3
                java.lang.Object r10 = r4.getBongaPointsInfo(r10, r5, r7)
                if (r10 != r0) goto Lad
                return r0
            Lad:
                r3 = r9
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r9.component3 = r6
                r9.ShareDataUIState = r2
                java.lang.Object r10 = r1.emit(r10, r3)
                if (r10 != r0) goto Lbb
                return r0
            Lbb:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.safaricom.consumer.commons.bonga.BongaPointsRepository.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final BongaPointsInfo component2(BongaPointsInfoPayloadDto.BongaPointsInfoDto bongaPointsInfoDto) {
            return Intrinsics.areEqual(bongaPointsInfoDto.getComponent3(), BongaPointsRepository.ShareDataUIState) ? new BongaPointsInfo.BongaPointsActive(bongaPointsInfoDto.getCopydefault(), bongaPointsInfoDto.getComponent2(), bongaPointsInfoDto.getComponent1()) : BongaPointsInfo.BongaPointsInactive.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            component2 component2Var = BongaPointsRepository.this.new component2(continuation);
            component2Var.component3 = obj;
            return component2Var;
        }

        @Override
        public final Object invoke(FlowCollector<? super Resource<? extends BongaPointsInfo>> flowCollector, Continuation<? super Unit> continuation) {
            return ((component2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Flow<Resource<BongaPointsInfo>> getBongaPointsInfo() {
        return FlowKt.flowOn(FlowKt.flow(new component2(null)), Dispatchers.getIO());
    }
}
