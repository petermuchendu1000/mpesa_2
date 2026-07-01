package com.huawei.digitalpayment.consumer.zuriui.data;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.daos.MessageDao;
import com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity;
import com.huawei.digitalpayment.consumer.zuriui.ChatExtensions;
import com.huawei.digitalpayment.consumer.zuriui.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/data/MessagesRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/zuriui/data/MessagesRepository;", "messageDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/MessageDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/MessageDao;)V", "getAllMessages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "saveMessage", "", "message", "(Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", GriverCacheDao.COLUMN_CACHE_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "messages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessagesRepositoryImpl implements MessagesRepository {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final MessageDao component1;

    @Inject
    public MessagesRepositoryImpl(MessageDao messageDao) {
        Intrinsics.checkNotNullParameter(messageDao, "");
        this.component1 = messageDao;
    }

    public static final MessageDao access$getMessageDao$p(MessagesRepositoryImpl messagesRepositoryImpl) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MessageDao messageDao = messagesRepositoryImpl.component1;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return messageDao;
    }

    @Override
    public Flow<List<Message>> getAllMessages() {
        int i = 2 % 2;
        Flow<List<Message>> flow = FlowKt.flow(new component3(null));
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl$getAllMessages$1", f = "MessagesRepositoryImpl.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends Message>>, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        private Object ShareDataUIState;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 67;
            component1 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.ShareDataUIState;
                this.component2 = 1;
                if (MessagesRepositoryImpl.access$getMessageDao$p(MessagesRepositoryImpl.this).getAllMessages().collect(new FlowCollector() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i4 = 2 % 2;
                        int i5 = component3 + 73;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        Object objComponent3 = component3((List) obj3, continuation);
                        int i7 = component1 + 53;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        return objComponent3;
                    }

                    public final Object component3(List<MessageEntity> list, Continuation<? super Unit> continuation) {
                        int i4 = 2 % 2;
                        FlowCollector<List<Message>> flowCollector2 = flowCollector;
                        List<MessageEntity> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            Object obj3 = null;
                            if (!it.hasNext()) {
                                Object objEmit = flowCollector2.emit(arrayList, continuation);
                                if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    int i5 = component3 + 57;
                                    component1 = i5 % 128;
                                    int i6 = i5 % 2;
                                    return objEmit;
                                }
                                Unit unit = Unit.INSTANCE;
                                int i7 = component1 + 95;
                                component3 = i7 % 128;
                                if (i7 % 2 == 0) {
                                    return unit;
                                }
                                throw null;
                            }
                            int i8 = component3 + 61;
                            component1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                arrayList.add(ChatExtensions.INSTANCE.toDomain((MessageEntity) it.next()));
                                obj3.hashCode();
                                throw null;
                            }
                            arrayList.add(ChatExtensions.INSTANCE.toDomain((MessageEntity) it.next()));
                        }
                    }
                }, this) == coroutine_suspended) {
                    int i4 = copydefault + 123;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = copydefault + 35;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = MessagesRepositoryImpl.this.new component3(continuation);
            component3Var.ShareDataUIState = obj;
            component3 component3Var2 = component3Var;
            int i2 = copydefault + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var2;
        }

        @Override
        public Object invoke(FlowCollector<? super List<? extends Message>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component1 = i2 % 128;
            FlowCollector<? super List<? extends Message>> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                ShareDataUIState(flowCollector2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(flowCollector2, continuation2);
            int i3 = copydefault + 97;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 50 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(FlowCollector<? super List<Message>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 83;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Override
    public Object saveMessage(Message message, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new copydefault(message, null), continuation);
        if (objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component2 + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return objWithContext;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = component2 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl$saveMessage$2", f = "MessagesRepositoryImpl.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;
        final Message copydefault;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r1
  0x003b: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
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
                int r1 = com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.component1
                int r1 = r1 + 103
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.component3 = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component2
                r4 = 65
                int r4 = r4 / 0
                if (r3 == 0) goto L3b
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component2
                if (r3 == 0) goto L3b
            L24:
                if (r3 != r2) goto L33
                kotlin.ResultKt.throwOnFailure(r6)
                int r6 = com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.component3
                int r6 = r6 + 37
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.component1 = r1
                int r6 = r6 % r0
                goto L58
            L33:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L3b:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl r6 = com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.this
                com.huawei.digitalpayment.consumer.base.database.daos.MessageDao r6 = com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.access$getMessageDao$p(r6)
                com.huawei.digitalpayment.consumer.zuriui.ChatExtensions r3 = com.huawei.digitalpayment.consumer.zuriui.ChatExtensions.INSTANCE
                com.huawei.digitalpayment.consumer.zuriui.models.Message r4 = r5.copydefault
                com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity r3 = r3.toEntity(r4)
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.component2 = r2
                java.lang.Object r6 = r6.insert(r3, r4)
                if (r6 != r1) goto L58
                return r1
            L58:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.component1
                int r1 = r1 + 41
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.component3 = r2
                int r1 = r1 % r0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(Message message, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.copydefault = message;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = MessagesRepositoryImpl.this.new copydefault(this.copydefault, continuation);
            int i2 = component1 + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 109;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component3 + 113;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = component3 + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            if (i3 != 0) {
                objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
                int i4 = 50 / 0;
            } else {
                objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = component3 + 115;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public Object deleteMessage(String str, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new component2(str, null), continuation);
        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return objWithContext;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl$deleteMessage$2", f = "MessagesRepositoryImpl.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;
        final String copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 115;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 89;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (MessagesRepositoryImpl.access$getMessageDao$p(MessagesRepositoryImpl.this).deleteById(this.copydefault, this) == coroutine_suspended) {
                    int i8 = component1 + 101;
                    component3 = i8 % 128;
                    if (i8 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.copydefault = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = MessagesRepositoryImpl.this.new component2(this.copydefault, continuation);
            int i2 = component1 + 77;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 32 / 0;
            }
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 25;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public Object deleteMessages(List<Message> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ShareDataUIState(list, null), continuation);
        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return objWithContext;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl$deleteMessages$2", f = "MessagesRepositoryImpl.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        final List<Message> component1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 91;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                MessageDao messageDaoAccess$getMessageDao$p = MessagesRepositoryImpl.access$getMessageDao$p(MessagesRepositoryImpl.this);
                List<Message> list = this.component1;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i5 = component3 + 47;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(ChatExtensions.INSTANCE.toEntity((Message) it.next()));
                }
                this.component2 = 1;
                if (messageDaoAccess$getMessageDao$p.deleteMessages(arrayList, this) == coroutine_suspended) {
                    int i7 = ShareDataUIState + 121;
                    component3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 26 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(List<Message> list, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component1 = list;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = MessagesRepositoryImpl.this.new ShareDataUIState(this.component1, continuation);
            int i2 = ShareDataUIState + 75;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 1;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            ShareDataUIState(coroutineScope2, continuation2);
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            if (i3 != 0) {
                shareDataUIState.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 53;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 1;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
