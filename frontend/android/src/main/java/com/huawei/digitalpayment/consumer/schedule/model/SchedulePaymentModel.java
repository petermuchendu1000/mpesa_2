package com.huawei.digitalpayment.consumer.schedule.model;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.GsonUtils;
import com.google.common.base.Ascii;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.AssetsReadUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.schedule.model.local.BillerTypeInfo;
import com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel;
import com.huawei.digitalpayment.consumer.schedule.model.local.SchedulePaymentType;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getSmallIconId;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0096@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0096@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u000e\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/SchedulePaymentModel;", "Lcom/huawei/digitalpayment/consumer/schedule/model/ISchedulePaymentModel;", "<init>", "()V", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDynamicsElements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "schedulePaymentType", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "(Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSchedule", "Lcom/huawei/http/BaseResp;", "params", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchedulePaymentTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySchedule", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;", "cancelSchedule", "initiatorPin", "scheduleModel", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBillerConfig", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/BillerTypeInfo;", "Lcom/huawei/http/BaseRequestParams;", "(Lcom/huawei/http/BaseRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SchedulePaymentModel implements ISchedulePaymentModel {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final CoroutineDispatcher copydefault = Dispatchers.getIO();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel", f = "SchedulePaymentModel.kt", i = {}, l = {115}, m = "cancelSchedule$suspendImpl", n = {}, s = {})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int component1 = 0;
        private static int component3 = 1;
        Object component2;
        int copydefault;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.component2 = obj;
            this.copydefault |= Integer.MIN_VALUE;
            Object objComponent1 = SchedulePaymentModel.component1(SchedulePaymentModel.this, null, null, this);
            int i4 = component3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel", f = "SchedulePaymentModel.kt", i = {}, l = {86}, m = "querySchedule$suspendImpl", n = {}, s = {})
    static final class component4 extends ContinuationImpl {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        Object component1;
        int component2;

        component4(Continuation<? super component4> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.component1 = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object objComponent2 = SchedulePaymentModel.component2(SchedulePaymentModel.this, this);
            int i4 = component3 + 95;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objComponent2;
            }
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel", f = "SchedulePaymentModel.kt", i = {}, l = {57}, m = "createSchedule$suspendImpl", n = {}, s = {})
    static final class copydefault extends ContinuationImpl {
        private static int component1 = 0;
        private static int copydefault = 1;
        Object component2;
        int component3;

        copydefault(Continuation<? super copydefault> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 67;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.component2 = obj;
            this.component3 |= Integer.MIN_VALUE;
            SchedulePaymentModel schedulePaymentModel = SchedulePaymentModel.this;
            if (i3 == 0) {
                SchedulePaymentModel.component3(schedulePaymentModel, null, this);
                obj2.hashCode();
                throw null;
            }
            Object objComponent3 = SchedulePaymentModel.component3(schedulePaymentModel, null, this);
            int i4 = component1 + 93;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel", f = "SchedulePaymentModel.kt", i = {}, l = {128}, m = "queryBillerConfig$suspendImpl", n = {}, s = {})
    static final class getAsAtTimestamp extends ContinuationImpl {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;
        Object component3;

        getAsAtTimestamp(Continuation<? super getAsAtTimestamp> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 85;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = obj;
            this.ShareDataUIState |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objCopydefault = SchedulePaymentModel.copydefault(SchedulePaymentModel.this, null, this);
            int i4 = component2 + 113;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objCopydefault;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public SchedulePaymentModel() {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getDynamicsElements$2", f = "SchedulePaymentModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DynamicsElement>>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;
        final SchedulePaymentType copydefault;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            if (r4 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        
            r4 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component1 + 119;
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component2 = r4 % 128;
            r4 = r4 % 2;
            r4 = kotlin.collections.CollectionsKt.emptyList();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component1 + 41;
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component2 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
        
            if ((r1 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        
            r4 = null;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r3.ShareDataUIState == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r3.ShareDataUIState == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r4);
            r4 = (java.util.List) com.huawei.common.util.SecureGsonUtils.fromJson(com.huawei.common.util.AssetsReadUtils.parseFile(r3.copydefault.getTransactionType() + ".json"), new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getDynamicsElements$2$1().getType());
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component2
                int r1 = r1 + 117
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component1 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.ShareDataUIState
                r2 = 30
                int r2 = r2 / 0
                if (r1 != 0) goto L6e
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.ShareDataUIState
                if (r1 != 0) goto L6e
            L21:
                kotlin.ResultKt.throwOnFailure(r4)
                com.huawei.digitalpayment.consumer.schedule.model.local.SchedulePaymentType r4 = r3.copydefault
                java.lang.String r4 = r4.getTransactionType()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                java.lang.String r4 = ".json"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                java.lang.String r4 = com.huawei.common.util.AssetsReadUtils.parseFile(r4)
                com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getDynamicsElements$2$1 r1 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getDynamicsElements$2$1
                r1.<init>()
                java.lang.reflect.Type r1 = r1.getType()
                java.lang.Object r4 = com.huawei.common.util.SecureGsonUtils.fromJson(r4, r1)
                java.util.List r4 = (java.util.List) r4
                if (r4 != 0) goto L5d
                int r4 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component1
                int r4 = r4 + 119
                int r1 = r4 % 128
                com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component2 = r1
                int r4 = r4 % r0
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L5d:
                int r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component1
                int r1 = r1 + 41
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.component2 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L69
                return r4
            L69:
                r4 = 0
                r4.hashCode()
                throw r4
            L6e:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(SchedulePaymentType schedulePaymentType, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.copydefault = schedulePaymentType;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = new component2(this.copydefault, continuation);
            int i2 = component1 + 21;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DynamicsElement>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component1 + 21;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super List<DynamicsElement>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    static Object ShareDataUIState(SchedulePaymentModel schedulePaymentModel, SchedulePaymentType schedulePaymentType, Continuation<? super List<DynamicsElement>> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(schedulePaymentModel.copydefault, new component2(schedulePaymentType, null), continuation);
        int i2 = component1 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return objWithContext;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/huawei/http/BaseResp;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$createSchedule$2", f = "SchedulePaymentModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BaseResp>, Object> {
        private static short[] component4;
        final Map<String, Object> ShareDataUIState;
        int component3;
        final SchedulePaymentModel copydefault;
        private static final byte[] $$c = {102, Ascii.FF, 98, 84};
        private static final int $$f = 47;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 142;
        private static final byte[] $$a = {121, -58, 81, 67, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, Ascii.NAK, -31, 45, Ascii.SI, -3, Ascii.NAK};
        private static final int $$b = 64;
        private static int getRequestBeneficiariesState = 0;
        private static int copy = 1;
        private static int component1 = -896551562;
        private static int component2 = -238323862;
        private static int equals = 732706735;
        private static byte[] getAsAtTimestamp = {-4, -36, 46, -35, 38, TarHeader.LF_LINK, TarHeader.LF_FIFO, -109, 56, -41, -48, 47, 40, -38, 109, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -32, 40, 36, -43, 42, -44, 44, -36, Ascii.VT, -16, 38, -41, -2, 36, -43, 42, -44, 44, -36, Ascii.VT, TarHeader.LF_FIFO, -109, 56, -41, -48, 47, 40, -38, 109, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -20, -58, 36, -36, 58, 58, -14, 35, -29, -36, -34, Ascii.FF, -49, -43, -44, 40, 38, 58, -9, 38, -41, -25, 39, -36, -34, Ascii.FF, -53, 36, -40, 38, -47, 37, -58, 56, 56, -11, 38, -41};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r7, int r8, int r9) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.$$c
                int r9 = r9 * 2
                int r9 = r9 + 4
                int r8 = r8 + 112
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L28
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L28:
                int r8 = r8 + r9
                int r9 = r3 + 1
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.$$g(byte, int, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.$$a
                int r5 = r5 * 6
                int r5 = 106 - r5
                int r6 = r6 * 18
                int r6 = 22 - r6
                int r7 = r7 * 12
                int r7 = r7 + 7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r5 = r6
                r4 = r7
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r6]
            L29:
                int r6 = r6 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-10)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 98
                int r7 = r7 * 3
                int r0 = 10 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.$$d
                int r6 = r6 * 9
                int r6 = 12 - r6
                byte[] r0 = new byte[r0]
                int r7 = 9 - r7
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r8
                int r6 = r6 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r1[r6]
                r5 = r3
                r3 = r8
                r8 = r5
            L2d:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-27)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.b(short, byte, byte, java.lang.Object[]):void");
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 5;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public String getApiPath() {
                    int i3 = 2 % 2;
                    int i4 = component1 + 23;
                    int i5 = i4 % 128;
                    component3 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 73;
                    component1 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 34 / 0;
                    }
                    return "createSchedule";
                }
            };
            paymentRequest.addParams(this.ShareDataUIState);
            Object objSendSyncRequest = this.copydefault.sendSyncRequest(paymentRequest);
            int i3 = copy + 7;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return objSendSyncRequest;
        }

        private static void c(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            char c2;
            int i6;
            int length;
            byte[] bArr;
            int i7;
            int i8 = 2;
            int i9 = 2 % 2;
            getSmallIconId getsmalliconid = new getSmallIconId();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                if (objCopydefault == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1000 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (61684 - TextUtils.lastIndexOf("", '0')), 1874745193, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i10 = $11 + 125;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr2 = getAsAtTimestamp;
                    if (bArr2 != null) {
                        int i12 = $11 + 37;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i7 = 1;
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i7 = 0;
                        }
                        while (i7 < length) {
                            int i13 = $10 + 17;
                            $11 = i13 % 128;
                            int i14 = i13 % i8;
                            Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int iCombineMeasuredStates = 2984 - View.combineMeasuredStates(0, 0);
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 48;
                                char c3 = (char) (54462 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                byte length2 = (byte) $$c.length;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, capsMode, c3, -1178636483, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i7++;
                            i8 = 2;
                        }
                        int i15 = $11 + 55;
                        $10 = i15 % 128;
                        i6 = 2;
                        int i16 = i15 % 2;
                        bArr2 = bArr;
                    } else {
                        i6 = 2;
                    }
                    if (bArr2 != null) {
                        byte[] bArr3 = getAsAtTimestamp;
                        Object[] objArr4 = new Object[i6];
                        objArr4[1] = Integer.valueOf(component1);
                        objArr4[0] = Integer.valueOf(i);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(998 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.getOffsetAfter("", 0) + 31, (char) (View.resolveSizeAndState(0, 0, 0) + 61685), 1874745193, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                        i5 = 2;
                    } else {
                        iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                        int i17 = $10 + 85;
                        $11 = i17 % 128;
                        i5 = 2;
                        int i18 = i17 % 2;
                    }
                } else {
                    i5 = 2;
                }
                if (iIntValue > 0) {
                    int i19 = $11 + 45;
                    $10 = i19 % 128;
                    int i20 = i19 % i5;
                    getsmalliconid.copydefault = ((i + iIntValue) - i5) + ((int) (((long) component1) ^ 7083766810336261929L)) + i4;
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(equals), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1696 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 37 - Drawable.resolveOpacity(0, 0), (char) ((-1) - MotionEvent.axisFromString("")), -1454191902, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = getAsAtTimestamp;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        for (int i21 = 0; i21 < length3; i21++) {
                            bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 7083766810336261929L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    getsmalliconid.component2 = 1;
                    int i22 = $10 + 93;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (z) {
                            int i24 = $10 + 55;
                            $11 = i24 % 128;
                            if (i24 % 2 == 0) {
                                byte[] bArr6 = getAsAtTimestamp;
                                getsmalliconid.copydefault = getsmalliconid.copydefault % 1;
                                c2 = (char) (getsmalliconid.component3 >>> (((byte) (((byte) (((long) bArr6[r8]) | 7083766810336261929L)) - s)) ^ b2));
                            } else {
                                byte[] bArr7 = getAsAtTimestamp;
                                getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                c2 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                            }
                            getsmalliconid.component1 = c2;
                        } else {
                            short[] sArr = component4;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(Map<String, ? extends Object> map, SchedulePaymentModel schedulePaymentModel, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.ShareDataUIState = map;
            this.copydefault = schedulePaymentModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = new component1(this.ShareDataUIState, this.copydefault, continuation);
            int i2 = getRequestBeneficiariesState + 95;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                return component1Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super BaseResp> continuation) {
            int i = 2 % 2;
            int i2 = copy + 121;
            getRequestBeneficiariesState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super BaseResp> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super BaseResp> continuation) {
            int i = 2 % 2;
            int i2 = copy + 35;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0d4e  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0cff A[PHI: r0 r2
  0x0cff: PHI (r0v34 int) = (r0v33 int), (r0v51 int) binds: [B:91:0x0cfd, B:88:0x0cf2] A[DONT_GENERATE, DONT_INLINE]
  0x0cff: PHI (r2v22 int) = (r2v21 int), (r2v30 int) binds: [B:91:0x0cfd, B:88:0x0cf2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0d02 A[PHI: r0 r2
  0x0d02: PHI (r0v49 int) = (r0v33 int), (r0v51 int) binds: [B:91:0x0cfd, B:88:0x0cf2] A[DONT_GENERATE, DONT_INLINE]
  0x0d02: PHI (r2v28 int) = (r2v21 int), (r2v30 int) binds: [B:91:0x0cfd, B:88:0x0cf2] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component3(java.util.List r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 3456
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1.component3(java.util.List):int");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object component3(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super com.huawei.http.BaseResp> r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.copydefault
            if (r1 == 0) goto L20
            r1 = r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$copydefault r1 = (com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.copydefault) r1
            int r2 = r1.component3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L20
            int r8 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r8 = r8 + 69
            int r2 = r8 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r2
            int r8 = r8 % r0
            int r8 = r1.component3
            int r8 = r8 + r3
            r1.component3 = r8
            goto L25
        L20:
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$copydefault r1 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$copydefault
            r1.<init>(r8)
        L25:
            java.lang.Object r8 = r1.component2
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.component3
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L36
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = r6.copydefault
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component1 r3 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component1
            r5 = 0
            r3.<init>(r7, r6, r5)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r1.component3 = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r3, r1)
            if (r8 != r2) goto L6f
            int r6 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r7 = r6 + 97
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L6e
            int r6 = r6 + 93
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L6a
            return r2
        L6a:
            r5.hashCode()
            throw r5
        L6e:
            throw r5
        L6f:
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component3(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getSchedulePaymentTypes$2", f = "SchedulePaymentModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class equals extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SchedulePaymentType>>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List listEmptyList = (List) SecureGsonUtils.fromJson(AssetsReadUtils.parseFile("schedulePaymentTypes.json"), new TypeToken<List<? extends SchedulePaymentType>>() {
            }.getType());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            int i4 = component3 + 19;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return listEmptyList;
        }

        equals(Continuation<? super equals> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            equals equalsVar = new equals(continuation);
            int i2 = component3 + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return equalsVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SchedulePaymentType>> continuation) {
            Object objComponent2;
            int i = 2 % 2;
            int i2 = component3 + 5;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super List<? extends SchedulePaymentType>> continuation2 = continuation;
            if (i2 % 2 != 0) {
                objComponent2 = component2(coroutineScope2, continuation2);
                int i3 = 36 / 0;
            } else {
                objComponent2 = component2(coroutineScope2, continuation2);
            }
            int i4 = component2 + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super List<SchedulePaymentType>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            equals equalsVar = (equals) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                equalsVar.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = equalsVar.invokeSuspend(unit);
            int i4 = component2 + 65;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    static Object copydefault(SchedulePaymentModel schedulePaymentModel, Continuation<? super List<SchedulePaymentType>> continuation) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(schedulePaymentModel.copydefault, new equals(null), continuation);
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return objWithContext;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$querySchedule$2", f = "SchedulePaymentModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LocalScheduleModel>>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentRequest<List<? extends LocalScheduleModel>> paymentRequest = new PaymentRequest<List<? extends LocalScheduleModel>>() {
                private static int component2 = 1;
                private static int component3;

                @Override
                public Object convert(JsonObject jsonObject) {
                    int i3 = 2 % 2;
                    int i4 = component3 + 25;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return convert(jsonObject);
                    }
                    convert(jsonObject);
                    throw null;
                }

                @Override
                public String getApiPath() {
                    int i3 = 2 % 2;
                    int i4 = component3;
                    int i5 = i4 + 75;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i6 = i4 + 117;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    return "querySchedule";
                }

                @Override
                public List<LocalScheduleModel> convert(JsonObject origin) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(origin, "");
                    try {
                        List<LocalScheduleModel> list = (List) SecureGsonUtils.fromJson(origin.getAsJsonArray("reminderScheduleInfoDetails").toString(), new TypeToken<List<? extends LocalScheduleModel>>() {
                        }.getType());
                        if (list != null) {
                            return list;
                        }
                        int i4 = component3 + 49;
                        component2 = i4 % 128;
                        if (i4 % 2 == 0) {
                            CollectionsKt.emptyList();
                            throw null;
                        }
                        List<LocalScheduleModel> listEmptyList = CollectionsKt.emptyList();
                        int i5 = component2 + 29;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        return listEmptyList;
                    } catch (Exception unused) {
                        return CollectionsKt.emptyList();
                    }
                }
            };
            paymentRequest.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
            Object objSendSyncRequest = SchedulePaymentModel.this.sendSyncRequest(paymentRequest);
            int i3 = component3 + 93;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return objSendSyncRequest;
        }

        getRequestBeneficiariesState(Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = SchedulePaymentModel.this.new getRequestBeneficiariesState(continuation);
            int i2 = component3 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return getrequestbeneficiariesstate;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LocalScheduleModel>> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super List<? extends LocalScheduleModel>> continuation2 = continuation;
            if (i2 % 2 != 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = component3 + 91;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super List<LocalScheduleModel>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 111;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object component2(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel r6, kotlin.coroutines.Continuation<? super java.util.List<com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel>> r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r2
            int r1 = r1 % r0
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component4
            r3 = 1
            r1 = r1 ^ r3
            r4 = 0
            if (r1 == 0) goto L14
            goto L2d
        L14:
            int r2 = r2 + 21
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L7e
            r1 = r7
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component4 r1 = (com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component4) r1
            int r2 = r1.component2
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r5
            if (r2 == 0) goto L2d
            int r7 = r1.component2
            int r7 = r7 + r5
            r1.component2 = r7
            goto L32
        L2d:
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component4 r1 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component4
            r1.<init>(r7)
        L32:
            java.lang.Object r7 = r1.component1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.component2
            if (r5 == 0) goto L61
            int r6 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1
            int r6 = r6 + 121
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4a
            if (r5 != 0) goto L59
            goto L4c
        L4a:
            if (r5 != r3) goto L59
        L4c:
            kotlin.ResultKt.throwOnFailure(r7)
            int r6 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r6 = r6 + 5
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r1
            int r6 = r6 % r0
            goto L78
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L61:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.copydefault
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getRequestBeneficiariesState r0 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getRequestBeneficiariesState
            r0.<init>(r4)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.component2 = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r0, r1)
            if (r7 != r2) goto L78
            return r2
        L78:
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        L7e:
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component4 r7 = (com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component4) r7
            int r6 = r7.component2
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component2(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/huawei/http/BaseResp;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$cancelSchedule$2", f = "SchedulePaymentModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BaseResp>, Object> {
        private static int copydefault = 0;
        private static int equals = 1;
        int ShareDataUIState;
        final SchedulePaymentModel component1;
        final LocalScheduleModel component2;
        final String component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = equals + 57;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
                private static int component1 = 1;
                private static int component2;

                @Override
                public String getApiPath() {
                    int i3 = 2 % 2;
                    int i4 = component2;
                    int i5 = i4 + 7;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    int i6 = i4 + 65;
                    component1 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 74 / 0;
                    }
                    return "cancelSchedule";
                }
            };
            paymentRequest.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
            paymentRequest.addParams("reminderScheduleId", this.component2.getReminderScheduleId());
            paymentRequest.addParams("initiatorPin", this.component3);
            paymentRequest.addParams("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
            Object objSendSyncRequest = this.component1.sendSyncRequest(paymentRequest);
            int i3 = copydefault + 71;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                return objSendSyncRequest;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(LocalScheduleModel localScheduleModel, String str, SchedulePaymentModel schedulePaymentModel, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.component2 = localScheduleModel;
            this.component3 = str;
            this.component1 = schedulePaymentModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = new component3(this.component2, this.component3, this.component1, continuation);
            int i2 = copydefault + 49;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super BaseResp> continuation) {
            int i = 2 % 2;
            int i2 = equals + 43;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super BaseResp> continuation2 = continuation;
            if (i2 % 2 != 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = copydefault + 9;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 86 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super BaseResp> continuation) {
            int i = 2 % 2;
            int i2 = equals + 91;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = equals + 93;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object component1(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel r5, java.lang.String r6, com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel r7, kotlin.coroutines.Continuation<? super com.huawei.http.BaseResp> r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState = r2
            int r1 = r1 % r0
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            if (r1 == 0) goto L29
            r1 = r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$ShareDataUIState r1 = (com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState) r1
            int r2 = r1.copydefault
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L29
            int r8 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1
            int r8 = r8 + 65
            int r2 = r8 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState = r2
            int r8 = r8 % r0
            int r8 = r1.copydefault
            int r8 = r8 + r3
            r1.copydefault = r8
            goto L2e
        L29:
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$ShareDataUIState r1 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$ShareDataUIState
            r1.<init>(r8)
        L2e:
            java.lang.Object r8 = r1.component2
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.copydefault
            r4 = 1
            if (r3 == 0) goto L55
            int r5 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1
            int r5 = r5 + 45
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L47
            if (r3 != r4) goto L4d
            goto L49
        L47:
            if (r3 != r4) goto L4d
        L49:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6d
        L4d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L55:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = r5.copydefault
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component3 r0 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$component3
            r3 = 0
            r0.<init>(r7, r6, r5, r3)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.copydefault = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r0, r1)
            if (r8 != r2) goto L6d
            return r2
        L6d:
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel, java.lang.String, com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/BillerTypeInfo;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$queryBillerConfig$2", f = "SchedulePaymentModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copy extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends BillerTypeInfo>>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        final BaseRequestParams component2;
        int component3;
        final SchedulePaymentModel copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentRequest<List<? extends BillerTypeInfo>> paymentRequest = new PaymentRequest<List<? extends BillerTypeInfo>>() {
                private static int component1 = 1;
                private static int component2;

                @Override
                public Object convert(JsonObject jsonObject) {
                    int i4 = 2 % 2;
                    int i5 = component2 + 113;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return convert(jsonObject);
                    }
                    convert(jsonObject);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override
                public String getApiPath() {
                    int i4 = 2 % 2;
                    int i5 = component1 + 81;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return "queryBillerConfig";
                    }
                    throw null;
                }

                @Override
                public List<BillerTypeInfo> convert(JsonObject origin) {
                    int i4 = 2 % 2;
                    Intrinsics.checkNotNullParameter(origin, "");
                    try {
                        Object objFromJson = GsonUtils.fromJson(origin.get("billerItems").toString(), new TypeToken<List<? extends BillerTypeInfo>>() {
                        }.getType());
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                        List<BillerTypeInfo> list = (List) objFromJson;
                        int i5 = component2 + 35;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return list;
                    } catch (Exception unused) {
                        return CollectionsKt.emptyList();
                    }
                }
            };
            paymentRequest.addParams(this.component2);
            Object objSendSyncRequest = this.copydefault.sendSyncRequest(paymentRequest);
            int i4 = component1 + 15;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objSendSyncRequest;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copy(BaseRequestParams baseRequestParams, SchedulePaymentModel schedulePaymentModel, Continuation<? super copy> continuation) {
            super(2, continuation);
            this.component2 = baseRequestParams;
            this.copydefault = schedulePaymentModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = new copy(this.component2, this.copydefault, continuation);
            int i2 = component1 + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copyVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends BillerTypeInfo>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 49 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super List<BillerTypeInfo>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 3;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r1
  0x0029: PHI (r1v9 com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp) = 
  (r1v8 com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp)
  (r1v11 com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp)
 binds: [B:10:0x0027, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object copydefault(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel r6, com.huawei.http.BaseRequestParams r7, kotlin.coroutines.Continuation<? super java.util.List<com.huawei.digitalpayment.consumer.schedule.model.local.BillerTypeInfo>> r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.getAsAtTimestamp
            if (r1 == 0) goto L2f
            int r1 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L21
            r1 = r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp r1 = (com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.getAsAtTimestamp) r1
            int r3 = r1.ShareDataUIState
            r3 = r3 & r2
            r4 = 9
            int r4 = r4 / 0
            if (r3 == 0) goto L2f
            goto L29
        L21:
            r1 = r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp r1 = (com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.getAsAtTimestamp) r1
            int r3 = r1.ShareDataUIState
            r3 = r3 & r2
            if (r3 == 0) goto L2f
        L29:
            int r8 = r1.ShareDataUIState
            int r8 = r8 + r2
            r1.ShareDataUIState = r8
            goto L34
        L2f:
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp r1 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$getAsAtTimestamp
            r1.<init>(r8)
        L34:
            java.lang.Object r8 = r1.component3
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.ShareDataUIState
            r4 = 1
            if (r3 == 0) goto L5f
            if (r3 != r4) goto L57
            int r6 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1
            int r6 = r6 + 77
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState = r7
            int r6 = r6 % r0
            kotlin.ResultKt.throwOnFailure(r8)
            int r6 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r6 = r6 + 97
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r7
            int r6 = r6 % r0
            goto L80
        L57:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L5f:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = r6.copydefault
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$copy r3 = new com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel$copy
            r5 = 0
            r3.<init>(r7, r6, r5)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r1.ShareDataUIState = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r3, r1)
            if (r8 != r2) goto L80
            int r6 = com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.ShareDataUIState
            int r6 = r6 + 99
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.component1 = r7
            int r6 = r6 % r0
            return r2
        L80:
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel.copydefault(com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel, com.huawei.http.BaseRequestParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public Object cancelSchedule(String str, LocalScheduleModel localScheduleModel, Continuation<? super BaseResp> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent1 = component1(this, str, localScheduleModel, continuation);
        int i4 = component1 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return objComponent1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Object createSchedule(Map<String, ? extends Object> map, Continuation<? super BaseResp> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent3 = component3(this, map, continuation);
        int i4 = component1 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return objComponent3;
    }

    @Override
    public Object getDynamicsElements(SchedulePaymentType schedulePaymentType, Continuation<? super List<DynamicsElement>> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objShareDataUIState = ShareDataUIState(this, schedulePaymentType, continuation);
        int i4 = component1 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return objShareDataUIState;
        }
        throw null;
    }

    @Override
    public Object getSchedulePaymentTypes(Continuation<? super List<SchedulePaymentType>> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = copydefault(this, continuation);
        int i4 = ShareDataUIState + 79;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return objCopydefault;
    }

    @Override
    public Object queryBillerConfig(BaseRequestParams baseRequestParams, Continuation<? super List<BillerTypeInfo>> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = copydefault(this, baseRequestParams, continuation);
        int i4 = ShareDataUIState + 23;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return objCopydefault;
        }
        throw null;
    }

    @Override
    public Object querySchedule(Continuation<? super List<LocalScheduleModel>> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent2 = component2(this, continuation);
        int i4 = component1 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return objComponent2;
    }
}
