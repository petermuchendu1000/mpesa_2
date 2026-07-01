package com.huawei.digitalpayment.consumer.base.repository;

import androidx.autofill.HintConstants;
import com.blankj.utilcode.util.GsonUtils;
import com.dynatrace.android.callback.OkCallback;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.database.daos.DeviceRestartCacheDao;
import com.huawei.digitalpayment.consumer.base.database.entities.DeviceRestartCacheEntity;
import com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse;
import com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState;
import com.huawei.digitalpayment.consumer.base.util.ImageLoader;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.payment.mvvm.Resource;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.bouncycastle.util.encoders.Base64;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u0014J\u0006\u0010\u0015\u001a\u00020\rJ \u0010\u0016\u001a\u00020\r2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\u0004\u0012\u00020\r0\u0014J(\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\u0004\u0012\u00020\r0\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository;", "", "deviceRestartCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/DeviceRestartCacheDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/DeviceRestartCacheDao;)V", HintConstants.AUTOFILL_HINT_USERNAME, "", HintConstants.AUTOFILL_HINT_PASSWORD, "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "getLastLoginMsidn", "cacheState", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartState;", "getCachedState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedStateAsync", "callback", "Lkotlin/Function1;", "clearCache", "queryPhoneNumber", "Lcom/huawei/payment/mvvm/Resource;", "decPhoneNumber", "encMsisdn", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceRestartRepository {

    public static final Companion INSTANCE = new Companion(null);
    private static final String ShareDataUIState = "Failed to decrypt phone number";
    private static final String component1 = "x-amzn-RequestId";
    private static final String component2 = "DeviceRestartRepository";
    private static final String copydefault = "200";
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getSponsorBeneficiariesState = 1;
    private static int toString;
    private final DeviceRestartCacheDao component3;
    private final String component4;
    private final CoroutineScope copy;
    private final String getAsAtTimestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository", f = "DeviceRestartRepository.kt", i = {}, l = {76}, m = "getCachedState", n = {}, s = {})
    static final class component3 extends ContinuationImpl {
        private static int component3 = 1;
        private static int copydefault;
        Object component1;
        int component2;

        component3(Continuation<? super component3> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.component1 = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object cachedState = DeviceRestartRepository.this.getCachedState(this);
            int i4 = component3 + 63;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return cachedState;
            }
            throw null;
        }
    }

    public DeviceRestartRepository(DeviceRestartCacheDao deviceRestartCacheDao) {
        Intrinsics.checkNotNullParameter(deviceRestartCacheDao, "");
        this.component3 = deviceRestartCacheDao;
        this.getAsAtTimestamp = "web-header-enrichment";
        this.component4 = "6gdhY%2mj$b?";
        this.copy = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    }

    public static final DeviceRestartCacheDao access$getDeviceRestartCacheDao$p(DeviceRestartRepository deviceRestartRepository) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 107;
        toString = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartCacheDao deviceRestartCacheDao = deviceRestartRepository.component3;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return deviceRestartCacheDao;
    }

    public final String getLastLoginMsidn() {
        String string;
        String countryCode;
        String str;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 69;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "";
            z = false;
            i = 2;
        } else {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "";
            z = false;
            i = 4;
        }
        return StringsKt.replaceFirst$default(string, countryCode, str, z, i, (Object) null);
    }

    public final void cacheState(DeviceRestartState state) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(state, "");
        onSubMenuSelected.ShareDataUIState(this.copy, null, null, new ShareDataUIState(state, this, null), 3, null);
        int i2 = getSponsorBeneficiariesState + 111;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository$cacheState$1", f = "DeviceRestartRepository.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        final DeviceRestartState ShareDataUIState;
        final DeviceRestartRepository component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            DeviceRestartCacheEntity deviceRestartCacheEntity;
            int i = 2 % 2;
            int i2 = component2 + 91;
            component1 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.copydefault;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceRestartState deviceRestartState = this.ShareDataUIState;
                if (deviceRestartState instanceof DeviceRestartState.Error) {
                    deviceRestartCacheEntity = new DeviceRestartCacheEntity(null, "Error", ((DeviceRestartState.Error) deviceRestartState).getMessage(), ((DeviceRestartState.Error) this.ShareDataUIState).getRequestId(), 0L, 17, null);
                } else if (deviceRestartState instanceof DeviceRestartState.MsisdnMatch) {
                    deviceRestartCacheEntity = new DeviceRestartCacheEntity(null, "MsisdnMatch", null, null, 0L, 29, null);
                } else if (deviceRestartState instanceof DeviceRestartState.MsisdnMismatch) {
                    deviceRestartCacheEntity = new DeviceRestartCacheEntity(null, "MsisdnMismatch", null, null, 0L, 29, null);
                } else {
                    if (!(deviceRestartState instanceof DeviceRestartState.NoLastLoginMsisdn)) {
                        return Unit.INSTANCE;
                    }
                    deviceRestartCacheEntity = new DeviceRestartCacheEntity(null, "NoLastLoginMsisdn", null, null, 0L, 29, null);
                }
                this.copydefault = 1;
                if (DeviceRestartRepository.access$getDeviceRestartCacheDao$p(this.component3).upsert(deviceRestartCacheEntity, this) == coroutine_suspended) {
                    int i4 = component1 + 15;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component2 + 9;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(DeviceRestartState deviceRestartState, DeviceRestartRepository deviceRestartRepository, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.ShareDataUIState = deviceRestartState;
            this.component3 = deviceRestartRepository;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = new ShareDataUIState(this.ShareDataUIState, this.component3, continuation);
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 123;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            int i5 = component1 + 55;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 36 / 0;
            }
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 7;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return shareDataUIState.invokeSuspend(unit);
            }
            shareDataUIState.invokeSuspend(unit);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCachedState(kotlin.coroutines.Continuation<? super com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState> r9) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository.getCachedState(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void getCachedStateAsync(Function1<? super DeviceRestartState, Unit> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(callback, "");
        onSubMenuSelected.ShareDataUIState(this.copy, null, null, new component1(callback, this, null), 3, null);
        int i2 = getSponsorBeneficiariesState + 71;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository$getCachedStateAsync$1", f = "DeviceRestartRepository.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int equals = 1;
        final DeviceRestartRepository ShareDataUIState;
        int component2;
        Object component3;
        final Function1<DeviceRestartState, Unit> copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<DeviceRestartState, Unit> function12 = this.copydefault;
                this.component3 = function12;
                this.component2 = 1;
                Object cachedState = this.ShareDataUIState.getCachedState(this);
                if (cachedState == coroutine_suspended) {
                    int i3 = component1 + 89;
                    equals = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
                function1 = function12;
                obj = cachedState;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component1 + 89;
                equals = i5 % 128;
                if (i5 % 2 == 0) {
                    function1 = (Function1) this.component3;
                    ResultKt.throwOnFailure(obj);
                    int i6 = 44 / 0;
                } else {
                    function1 = (Function1) this.component3;
                    ResultKt.throwOnFailure(obj);
                }
            }
            function1.invoke(obj);
            Unit unit = Unit.INSTANCE;
            int i7 = component1 + 23;
            equals = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        component1(Function1<? super DeviceRestartState, Unit> function1, DeviceRestartRepository deviceRestartRepository, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.copydefault = function1;
            this.ShareDataUIState = deviceRestartRepository;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = new component1(this.copydefault, this.ShareDataUIState, continuation);
            int i2 = component1 + 17;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return component1Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 47;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 69 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 85;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 5;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final void clearCache() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(this.copy, null, null, new copydefault(null), 3, null);
        int i2 = toString + 37;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository$clearCache$1", f = "DeviceRestartRepository.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = copydefault + 61;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 73;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
                int i8 = ShareDataUIState + 49;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (DeviceRestartRepository.access$getDeviceRestartCacheDao$p(DeviceRestartRepository.this).clear(this) == coroutine_suspended) {
                    return coroutine_suspended;
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
            copydefault copydefaultVar = DeviceRestartRepository.this.new copydefault(continuation);
            int i2 = copydefault + 43;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefaultVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = ShareDataUIState + 49;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            if (i3 != 0) {
                copydefaultVar.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final void queryPhoneNumber(final Function1<? super Resource<String>, Unit> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(callback, "");
        Object obj = null;
        Resource resourceLoading = Resource.loading(null);
        Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        callback.invoke(resourceLoading);
        byte[] bytes = (this.getAsAtTimestamp + ":" + this.component4).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String base64String = Base64.toBase64String(bytes);
        OkCallback.enqueue(new OkHttpClient().newCall(new Request.Builder().url("https://identity.safaricom.com/api/v2/app/getPlainToken").get().addHeader("x-source-system", "mpesa-app").addHeader("Authorization", "Basic " + base64String).build()), new Callback() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onFailure(Call call, IOException e) {
                int i2 = 2 % 2;
                OkCallback.onFailure_enter(call, e);
                try {
                    Intrinsics.checkNotNullParameter(call, "");
                    Intrinsics.checkNotNullParameter(e, "");
                    Function1<Resource<String>, Unit> function1 = callback;
                    String message = e.getMessage();
                    if (message == null) {
                        int i3 = ShareDataUIState + 29;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        message = "Unknown error";
                    }
                    Resource<String> resourceError = Resource.error(new QueryPhoneNumberException(message, null, false, 6, null), null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                    function1.invoke(resourceError);
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override
            public void onResponse(Call call, Response response) {
                String strString;
                ThirdGetPhoneResponse.ResponseHeader responseHeader;
                ThirdGetPhoneResponse.Response response2;
                String responseMsg;
                ThirdGetPhoneResponse.ResponseBody responseBody;
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 85;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                OkCallback.onResponse_enter(call, response);
                try {
                    Intrinsics.checkNotNullParameter(call, "");
                    Intrinsics.checkNotNullParameter(response, "");
                    String str = response.headers().get(DeviceRestartRepository.component1);
                    if (str == null) {
                        str = "";
                    }
                    Object obj2 = null;
                    try {
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody != null) {
                            int i5 = ShareDataUIState + 65;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            strString = responseBodyBody.string();
                        } else {
                            strString = null;
                        }
                        if (strString == null) {
                            strString = "";
                        }
                        ThirdGetPhoneResponse thirdGetPhoneResponse = (ThirdGetPhoneResponse) GsonUtils.fromJson(strString, ThirdGetPhoneResponse.class);
                        ThirdGetPhoneResponse.ServiceResponse serviceResponse = thirdGetPhoneResponse.getServiceResponse();
                        if (serviceResponse != null) {
                            int i7 = component2 + 31;
                            ShareDataUIState = i7 % 128;
                            if (i7 % 2 == 0) {
                                serviceResponse.getResponseHeader();
                                obj2.hashCode();
                                throw null;
                            }
                            responseHeader = serviceResponse.getResponseHeader();
                        } else {
                            responseHeader = null;
                        }
                        ThirdGetPhoneResponse.ServiceResponse serviceResponse2 = thirdGetPhoneResponse.getServiceResponse();
                        if (serviceResponse2 == null || (responseBody = serviceResponse2.getResponseBody()) == null) {
                            response2 = null;
                        } else {
                            int i8 = ShareDataUIState + 101;
                            component2 = i8 % 128;
                            int i9 = i8 % 2;
                            response2 = responseBody.getResponse();
                        }
                        String responseCode = responseHeader != null ? responseHeader.getResponseCode() : null;
                        if (responseCode == null) {
                            responseCode = "";
                        }
                        if (responseHeader != null) {
                            responseMsg = responseHeader.getResponseMsg();
                            int i10 = component2 + 9;
                            ShareDataUIState = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            responseMsg = null;
                        }
                        if (responseMsg == null) {
                            responseMsg = "";
                        }
                        String encMsisdn = response2 != null ? response2.getEncMsisdn() : null;
                        if (encMsisdn == null) {
                            encMsisdn = "";
                        }
                        if (!Intrinsics.areEqual(DeviceRestartRepository.copydefault, responseCode) || StringsKt.isBlank(encMsisdn)) {
                            Function1<Resource<String>, Unit> function1 = callback;
                            String str2 = responseMsg;
                            if (StringsKt.isBlank(str2)) {
                                str2 = DeviceRestartRepository.ShareDataUIState;
                            }
                            Resource<String> resourceError = Resource.error(new QueryPhoneNumberException(str2, str, false, 4, null), null);
                            Intrinsics.checkNotNullExpressionValue(resourceError, "");
                            function1.invoke(resourceError);
                        } else {
                            int i12 = component2 + 39;
                            ShareDataUIState = i12 % 128;
                            if (i12 % 2 == 0) {
                                this.decPhoneNumber(encMsisdn, callback);
                                obj2.hashCode();
                                throw null;
                            }
                            this.decPhoneNumber(encMsisdn, callback);
                        }
                    } catch (Exception e) {
                        String message = e.getMessage();
                        String str3 = message == null ? DeviceRestartRepository.ShareDataUIState : message;
                        Function1<Resource<String>, Unit> function12 = callback;
                        Resource<String> resourceError2 = Resource.error(new QueryPhoneNumberException(str3, str, false, 4, null), null);
                        Intrinsics.checkNotNullExpressionValue(resourceError2, "");
                        function12.invoke(resourceError2);
                    }
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
        int i2 = toString + 109;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void decPhoneNumber(String encMsisdn, final Function1<? super Resource<String>, Unit> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(encMsisdn, "");
        Intrinsics.checkNotNullParameter(callback, "");
        DecMsisdnRepository decMsisdnRepository = new DecMsisdnRepository();
        decMsisdnRepository.addParams("encMsisdn", encMsisdn);
        ImageLoader.INSTANCE.sendRequest(decMsisdnRepository, new ApiCallback<DesMsisdnResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(DesMsisdnResp desMsisdnResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 25;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(desMsisdnResp);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(DesMsisdnResp value) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(value, "");
                    value.getDecMsisdn();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(value, "");
                String decMsisdn = value.getDecMsisdn();
                if (decMsisdn == null) {
                    int i4 = copydefault + 111;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    decMsisdn = "";
                }
                if (!StringsKt.isBlank(decMsisdn)) {
                    Function1<Resource<String>, Unit> function1 = callback;
                    Resource<String> resourceSuccess = Resource.success(decMsisdn);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                    function1.invoke(resourceSuccess);
                    return;
                }
                boolean zAreEqual = Intrinsics.areEqual(value.getUpdateMode(), "force");
                Function1<Resource<String>, Unit> function12 = callback;
                Resource<String> resourceError = Resource.error(new QueryPhoneNumberException(DeviceRestartRepository.ShareDataUIState, null, zAreEqual, 2, null), null);
                Intrinsics.checkNotNullExpressionValue(resourceError, "");
                function12.invoke(resourceError);
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 97;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    e.getMessage();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                String message = e.getMessage();
                if (message == null) {
                    int i4 = copydefault + 67;
                    int i5 = i4 % 128;
                    component1 = i5;
                    if (i4 % 2 == 0) {
                        int i6 = 13 / 0;
                    }
                    int i7 = i5 + 17;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    message = DeviceRestartRepository.ShareDataUIState;
                }
                String str = message;
                boolean zContains = StringsKt.contains((CharSequence) str, (CharSequence) "The version is no longer supported", true);
                Function1<Resource<String>, Unit> function1 = callback;
                Resource<String> resourceError = Resource.error(new QueryPhoneNumberException(str, null, zContains, 2, null), null);
                Intrinsics.checkNotNullExpressionValue(resourceError, "");
                function1.invoke(resourceError);
            }
        });
        int i2 = getSponsorBeneficiariesState + 23;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i = getRequestBeneficiariesState + 117;
        equals = i % 128;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository$Companion;", "", "<init>", "()V", "TAG", "", "RESPONSE_CODE", "REQUEST_ID_HEADER", "DEFAULT_QUERY_PHONE_ERROR_MESSAGE", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
