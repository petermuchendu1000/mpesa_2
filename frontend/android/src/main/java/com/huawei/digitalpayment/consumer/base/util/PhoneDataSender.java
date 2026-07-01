package com.huawei.digitalpayment.consumer.base.util;

import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.permission.PermissionConstant;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.ComplaintsDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.PhoneDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Singleton
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0016H\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "phoneDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/PhoneDataRepository;", "userDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/UserDataRepository;", "complaintsDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/ComplaintsDataRepository;", "logsDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/LogsDataRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/PhoneDataRepository;Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/UserDataRepository;Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/ComplaintsDataRepository;Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/LogsDataRepository;)V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "sendMetrics", "", "sendRequestSuspend", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "(Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneDataSender implements BaseModel {
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final PhoneDataRepository ShareDataUIState;
    private final String component1;
    private final ComplaintsDataRepository component2;
    private final LogsDataRepository component3;
    private final UserDataRepository copydefault;

    public static final ComplaintsDataRepository access$getComplaintsDataRepository$p(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ComplaintsDataRepository complaintsDataRepository = phoneDataSender.component2;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return complaintsDataRepository;
    }

    public static final LogsDataRepository access$getLogsDataRepository$p(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        Object obj = null;
        LogsDataRepository logsDataRepository = phoneDataSender.component3;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 61;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return logsDataRepository;
        }
        obj.hashCode();
        throw null;
    }

    public static final PhoneDataRepository access$getPhoneDataRepository$p(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        PhoneDataRepository phoneDataRepository = phoneDataSender.ShareDataUIState;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 27;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return phoneDataRepository;
    }

    public static final String access$getTAG$p(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = equals + 1;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = phoneDataSender.component1;
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        int i6 = i3 + 123;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final UserDataRepository access$getUserDataRepository$p(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = equals + 117;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        UserDataRepository userDataRepository = phoneDataSender.copydefault;
        int i5 = i3 + 101;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return userDataRepository;
    }

    @Inject
    public PhoneDataSender(PhoneDataRepository phoneDataRepository, UserDataRepository userDataRepository, ComplaintsDataRepository complaintsDataRepository, LogsDataRepository logsDataRepository) {
        Intrinsics.checkNotNullParameter(phoneDataRepository, "");
        Intrinsics.checkNotNullParameter(userDataRepository, "");
        Intrinsics.checkNotNullParameter(complaintsDataRepository, "");
        Intrinsics.checkNotNullParameter(logsDataRepository, "");
        this.ShareDataUIState = phoneDataRepository;
        this.copydefault = userDataRepository;
        this.component2 = complaintsDataRepository;
        this.component3 = logsDataRepository;
        this.component1 = "PhoneDataSender";
    }

    public final void sendMetrics() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new copydefault(null), 3, null);
        int i2 = getAsAtTimestamp + 95;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.util.PhoneDataSender$sendMetrics$1", f = "PhoneDataSender.kt", i = {0, 0, 1, 1, 2}, l = {61, 81, 115}, m = "invokeSuspend", n = {"log", RVParams.SESSION_ID, "log", RVParams.SESSION_ID, RVParams.SESSION_ID}, s = {"L$1", "L$2", "L$1", "L$2", "L$1"})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int getAsAtTimestamp = 0;
        private static int getRequestBeneficiariesState = 1;
        Object component1;
        int component2;
        Object component3;
        Object copydefault;

        /* JADX WARN: Path cross not found for [B:51:0x017b, B:86:0x02f5], limit reached: 101 */
        /* JADX WARN: Path cross not found for [B:76:0x023f, B:84:0x02a2], limit reached: 101 */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: Exception -> 0x0344, TryCatch #0 {Exception -> 0x0344, blocks: (B:17:0x004e, B:49:0x0177, B:51:0x017b, B:53:0x0181, B:56:0x0189, B:58:0x018f, B:60:0x01bc, B:62:0x01c8, B:65:0x01de, B:68:0x01ec, B:74:0x023b, B:76:0x023f, B:78:0x0245, B:81:0x024c, B:83:0x0252, B:24:0x007a, B:27:0x0083, B:29:0x009d, B:30:0x00a7, B:35:0x00ea, B:37:0x00ee, B:41:0x00ff, B:44:0x0110, B:46:0x0116, B:87:0x0318, B:91:0x0320, B:84:0x02a2, B:85:0x02c5, B:86:0x02f5, B:12:0x0031, B:20:0x0061, B:23:0x006b), top: B:97:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ff A[Catch: Exception -> 0x0344, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0344, blocks: (B:17:0x004e, B:49:0x0177, B:51:0x017b, B:53:0x0181, B:56:0x0189, B:58:0x018f, B:60:0x01bc, B:62:0x01c8, B:65:0x01de, B:68:0x01ec, B:74:0x023b, B:76:0x023f, B:78:0x0245, B:81:0x024c, B:83:0x0252, B:24:0x007a, B:27:0x0083, B:29:0x009d, B:30:0x00a7, B:35:0x00ea, B:37:0x00ee, B:41:0x00ff, B:44:0x0110, B:46:0x0116, B:87:0x0318, B:91:0x0320, B:84:0x02a2, B:85:0x02c5, B:86:0x02f5, B:12:0x0031, B:20:0x0061, B:23:0x006b), top: B:97:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0318 A[Catch: Exception -> 0x0344, TRY_LEAVE, TryCatch #0 {Exception -> 0x0344, blocks: (B:17:0x004e, B:49:0x0177, B:51:0x017b, B:53:0x0181, B:56:0x0189, B:58:0x018f, B:60:0x01bc, B:62:0x01c8, B:65:0x01de, B:68:0x01ec, B:74:0x023b, B:76:0x023f, B:78:0x0245, B:81:0x024c, B:83:0x0252, B:24:0x007a, B:27:0x0083, B:29:0x009d, B:30:0x00a7, B:35:0x00ea, B:37:0x00ee, B:41:0x00ff, B:44:0x0110, B:46:0x0116, B:87:0x0318, B:91:0x0320, B:84:0x02a2, B:85:0x02c5, B:86:0x02f5, B:12:0x0031, B:20:0x0061, B:23:0x006b), top: B:97:0x0013 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0174 -> B:49:0x0177). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0320 -> B:92:0x0341). Please report as a decompilation issue!!! */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 874
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.PhoneDataSender.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = PhoneDataSender.this.new copydefault(continuation);
            int i2 = getAsAtTimestamp + 75;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 7;
            getAsAtTimestamp = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                copydefault(coroutineScope2, continuation2);
                throw null;
            }
            Object objCopydefault = copydefault(coroutineScope2, continuation2);
            int i3 = getRequestBeneficiariesState + 105;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 13;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getRequestBeneficiariesState + 79;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 27 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final Object sendRequestSuspend(HaProxyRequest<HaProxyResponse<Object>> haProxyRequest, Continuation<? super HaProxyResponse<Object>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 63;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 3;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (cancellableContinuationImpl2.isActive()) {
                    int i5 = component1 + 27;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    cancellableContinuationImpl2.resume(value, (Function1<? super Throwable, Unit>) null);
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    cancellableContinuationImpl2.isActive();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<HaProxyResponse<Object>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(ResultKt.createFailure(e)));
                    int i4 = ShareDataUIState + 95;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = getAsAtTimestamp + 49;
            equals = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            int i4 = getAsAtTimestamp + 63;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        return result;
    }
}
