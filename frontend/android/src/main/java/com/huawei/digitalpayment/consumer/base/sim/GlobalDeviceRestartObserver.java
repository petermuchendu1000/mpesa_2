package com.huawei.digitalpayment.consumer.base.sim;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.blankj.utilcode.util.ActivityUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.constants.BaseRoutePathConstants;
import com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository;
import com.huawei.digitalpayment.consumer.base.sim.DeviceRestartState;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;

@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/GlobalDeviceRestartObserver;", "", "deviceRestartManager", "Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartManager;", "deviceRestartRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/sim/DeviceRestartManager;Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository;)V", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "Lkotlinx/coroutines/CoroutineScope;", "restoreCachedStateIfNeeded", "", "observeRestartState", "logout", "getExtraKey", "", "navigateToDeviceRestartActivity", "restartSplashActivity", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalDeviceRestartObserver {

    public static final Companion INSTANCE;
    private static final String component1 = "GlobalDeviceRestartObserver";
    private static char[] component2;
    private static long equals;
    private static int getRequestBeneficiariesState;
    private final DeviceRestartRepository ShareDataUIState;
    private final CoroutineScope component3;
    private final DeviceRestartManager copydefault;
    private static final byte[] $$c = {63, 67, 46, -88};
    private static final int $$d = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Ascii.EM, 43, 92, -56, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 183;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int copy = 1;

    private static String $$e(int i, byte b2, int i2) {
        byte[] bArr = $$c;
        int i3 = (i2 * 2) + 4;
        int i4 = i * 4;
        int i5 = 122 - b2;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i4 + (-i3);
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            i5 += -bArr[i3];
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.$$a
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r7 = r7 * 3
            int r7 = 36 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.a(byte, byte, byte, java.lang.Object[]):void");
    }

    public static final DeviceRestartManager access$getDeviceRestartManager$p(GlobalDeviceRestartObserver globalDeviceRestartObserver) {
        int i = 2 % 2;
        int i2 = component4 + 37;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        DeviceRestartManager deviceRestartManager = globalDeviceRestartObserver.copydefault;
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return deviceRestartManager;
    }

    public static final DeviceRestartRepository access$getDeviceRestartRepository$p(GlobalDeviceRestartObserver globalDeviceRestartObserver) {
        int i = 2 % 2;
        int i2 = component4 + 25;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        DeviceRestartRepository deviceRestartRepository = globalDeviceRestartObserver.ShareDataUIState;
        int i5 = i3 + 57;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return deviceRestartRepository;
    }

    public static final void access$logout(GlobalDeviceRestartObserver globalDeviceRestartObserver) throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        globalDeviceRestartObserver.ShareDataUIState();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$navigateToDeviceRestartActivity(GlobalDeviceRestartObserver globalDeviceRestartObserver) {
        int i = 2 % 2;
        int i2 = component4 + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        globalDeviceRestartObserver.component2();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 3;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$restartSplashActivity(GlobalDeviceRestartObserver globalDeviceRestartObserver) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        globalDeviceRestartObserver.copy();
        int i4 = component4 + 93;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    @Inject
    public GlobalDeviceRestartObserver(DeviceRestartManager deviceRestartManager, DeviceRestartRepository deviceRestartRepository) {
        Intrinsics.checkNotNullParameter(deviceRestartManager, "");
        Intrinsics.checkNotNullParameter(deviceRestartRepository, "");
        this.copydefault = deviceRestartManager;
        this.ShareDataUIState = deviceRestartRepository;
        this.component3 = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        getRequestBeneficiariesState();
        component1();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/GlobalDeviceRestartObserver$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void getRequestBeneficiariesState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(this.component3, Dispatchers.getIO(), null, new component2(null), 2, null);
        int i2 = component4 + 15;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver$restoreCachedStateIfNeeded$1", f = "GlobalDeviceRestartObserver.kt", i = {0}, l = {60}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        private Object component2;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver$restoreCachedStateIfNeeded$1$1", f = "GlobalDeviceRestartObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            int component1;
            final GlobalDeviceRestartObserver component2;
            final DeviceRestartState component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 91;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component1 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = copydefault + 107;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.throwOnFailure(obj);
                if (i4 != 0) {
                    GlobalDeviceRestartObserver.access$getDeviceRestartManager$p(this.component2).updateRestartState(this.component3);
                    return Unit.INSTANCE;
                }
                GlobalDeviceRestartObserver.access$getDeviceRestartManager$p(this.component2).updateRestartState(this.component3);
                int i5 = 67 / 0;
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(GlobalDeviceRestartObserver globalDeviceRestartObserver, DeviceRestartState deviceRestartState, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component2 = globalDeviceRestartObserver;
                this.component3 = deviceRestartState;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component2, this.component3, continuation);
                int i2 = ShareDataUIState + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 123;
                copydefault = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    return component3(coroutineScope2, continuation2);
                }
                component3(coroutineScope2, continuation2);
                throw null;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 111;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 51 / 0;
                }
                int i5 = ShareDataUIState + 25;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 7 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            int i = 2 % 2;
            int i2 = component1 + 47;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component3;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.component2;
                this.component2 = coroutineScope;
                this.component3 = 1;
                obj = GlobalDeviceRestartObserver.access$getDeviceRestartRepository$p(GlobalDeviceRestartObserver.this).getCachedState(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = copydefault + 33;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    obj2.hashCode();
                    throw null;
                }
                coroutineScope = (CoroutineScope) this.component2;
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            DeviceRestartState deviceRestartState = (DeviceRestartState) obj;
            if (deviceRestartState != null) {
                onSubMenuSelected.ShareDataUIState(coroutineScope2, Dispatchers.getMain(), null, new AnonymousClass4(GlobalDeviceRestartObserver.this, deviceRestartState, null), 2, null);
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = GlobalDeviceRestartObserver.this.new component2(continuation);
            component2Var.component2 = obj;
            component2 component2Var2 = component2Var;
            int i2 = copydefault + 115;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var2;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 71;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver$observeRestartState$1", f = "GlobalDeviceRestartObserver.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        int component3;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass4<T> implements FlowCollector {
            public static int ShareDataUIState = 0;
            private static int component1 = 0;
            public static int component2 = 0;
            private static int copydefault = 1;
            final GlobalDeviceRestartObserver component3;

            @Override
            public Object emit(Object obj, Continuation continuation) throws Throwable {
                int i = 2 % 2;
                int i2 = copydefault + 19;
                component1 = i2 % 128;
                DeviceRestartState deviceRestartState = (DeviceRestartState) obj;
                if (i2 % 2 == 0) {
                    return component2(deviceRestartState, continuation);
                }
                component2(deviceRestartState, continuation);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final Object component2(DeviceRestartState deviceRestartState, Continuation<? super Unit> continuation) throws Throwable {
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 37;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    boolean z = deviceRestartState instanceof DeviceRestartState.NotRestarted;
                    obj.hashCode();
                    throw null;
                }
                if (!(deviceRestartState instanceof DeviceRestartState.NotRestarted)) {
                    if (deviceRestartState instanceof DeviceRestartState.MsisdnMatch) {
                        GlobalDeviceRestartObserver.access$getDeviceRestartRepository$p(this.component3).clearCache();
                        GlobalDeviceRestartObserver.access$restartSplashActivity(this.component3);
                    } else if (deviceRestartState instanceof DeviceRestartState.MsisdnMismatch) {
                        GlobalDeviceRestartObserver.access$navigateToDeviceRestartActivity(this.component3);
                    } else if (deviceRestartState instanceof DeviceRestartState.NoLastLoginMsisdn) {
                        int i4 = i2 + 107;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        GlobalDeviceRestartObserver.access$getDeviceRestartRepository$p(this.component3).clearCache();
                    } else if (deviceRestartState instanceof DeviceRestartState.Error) {
                        GlobalDeviceRestartObserver.access$navigateToDeviceRestartActivity(this.component3);
                    } else if (Intrinsics.areEqual(deviceRestartState, DeviceRestartState.ProceedWithLogin.INSTANCE)) {
                        int i6 = copydefault + 51;
                        component1 = i6 % 128;
                        if (i6 % 2 != 0) {
                            GlobalDeviceRestartObserver.access$logout(this.component3);
                            GlobalDeviceRestartObserver.access$getDeviceRestartRepository$p(this.component3).clearCache();
                            GlobalDeviceRestartObserver.access$getDeviceRestartManager$p(this.component3).updateRestartState(DeviceRestartState.Unknown.INSTANCE);
                            GlobalDeviceRestartObserver.access$restartSplashActivity(this.component3);
                            throw null;
                        }
                        GlobalDeviceRestartObserver.access$logout(this.component3);
                        GlobalDeviceRestartObserver.access$getDeviceRestartRepository$p(this.component3).clearCache();
                        GlobalDeviceRestartObserver.access$getDeviceRestartManager$p(this.component3).updateRestartState(DeviceRestartState.Unknown.INSTANCE);
                        GlobalDeviceRestartObserver.access$restartSplashActivity(this.component3);
                        int i7 = component1 + 51;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                    } else if (!(deviceRestartState instanceof DeviceRestartState.Loading)) {
                        if (!(deviceRestartState instanceof DeviceRestartState.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i9 = component1 + 103;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
                return Unit.INSTANCE;
            }

            AnonymousClass4(GlobalDeviceRestartObserver globalDeviceRestartObserver) {
                this.component3 = globalDeviceRestartObserver;
            }

            public static int copydefault() {
                int i = component2;
                int i2 = i % 9396648;
                component2 = i + 1;
                if (i2 != 0) {
                    return ShareDataUIState;
                }
                int iMyUid = Process.myUid();
                ShareDataUIState = iMyUid;
                return iMyUid;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component3;
            if (i3 != 0) {
                int i4 = ShareDataUIState + 93;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (GlobalDeviceRestartObserver.access$getDeviceRestartManager$p(GlobalDeviceRestartObserver.this).getRestartState().collect(new AnonymousClass4(GlobalDeviceRestartObserver.this), this) == coroutine_suspended) {
                    int i6 = component2 + 21;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 88 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = GlobalDeviceRestartObserver.this.new copydefault(continuation);
            int i2 = component2 + 117;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component1(coroutineScope2, continuation2);
            }
            component1(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 38 / 0;
            }
            int i5 = component2 + 11;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    private final void component1() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(this.component3, null, null, new copydefault(null), 3, null);
        int i2 = getAsAtTimestamp + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = $10 + 17;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component2[i2 << i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 1758, Drawable.resolveOpacity(0, 0) + 34, (char) ((-1) - Process.getGidForName("")), 1159210934, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(equals), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 29 - TextUtils.getOffsetAfter("", 0), (char) (7170 - TextUtils.indexOf((CharSequence) "", '0')), 1951385784, false, $$e(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 4014, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, (char) (27761 - TextUtils.getTrimmedLength("")), -1529629956, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component2[i2 + i6])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1757 - MotionEvent.axisFromString(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1159210934, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(equals), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16780824, 29 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7170), 1951385784, false, $$e(b10, b11, (byte) (b11 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(4014 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 24, (char) (27761 - (Process.myPid() >> 22)), -1529629956, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getOffsetBefore("", 0), Color.blue(0) + 24, (char) (TextUtils.getCapsMode("", 0, 0) + 27761), -1529629956, false, $$e(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i7 = $11 + 19;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ShareDataUIState() throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.component4
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L22
            com.huawei.biometric.util.BiometricHelper2 r1 = com.huawei.biometric.util.BiometricHelper2.getInstance()
            r1.closeFingerprintLogin()
            com.huawei.digitalpayment.consumer.base.util.GsmHelper r1 = com.huawei.digitalpayment.consumer.base.util.GsmHelper.INSTANCE
            boolean r1 = r1.isGsmLogin()
            r3 = 38
            int r3 = r3 / r2
            if (r1 == 0) goto L48
            goto L31
        L22:
            com.huawei.biometric.util.BiometricHelper2 r1 = com.huawei.biometric.util.BiometricHelper2.getInstance()
            r1.closeFingerprintLogin()
            com.huawei.digitalpayment.consumer.base.util.GsmHelper r1 = com.huawei.digitalpayment.consumer.base.util.GsmHelper.INSTANCE
            boolean r1 = r1.isGsmLogin()
            if (r1 == 0) goto L48
        L31:
            int r1 = com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.component4
            int r1 = r1 + 67
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.getAsAtTimestamp = r3
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.base.util.GsmHelper r1 = com.huawei.digitalpayment.consumer.base.util.GsmHelper.INSTANCE
            r1.setGsmLogin(r2)
            int r1 = com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.component4
            int r1 = r1 + 7
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.getAsAtTimestamp = r3
            int r1 = r1 % r0
        L48:
            com.huawei.common.util.SPUtils r0 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = "recent_login_phone_number"
            java.lang.String r3 = ""
            r0.put(r1, r3)
            com.huawei.common.util.SPUtils r0 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = "PREF_SUBSCRIPTION_ID"
            r3 = -1
            r0.put(r1, r3)
            java.lang.String r0 = "BIOMETRIC_SP_NAME"
            com.huawei.common.util.SPUtils r0 = com.huawei.common.util.SPUtils.getInstance(r0)
            java.lang.String r1 = r4.component3()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "_showBiometricDialog"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.put(r1, r2)
            com.huawei.common.module.UserLifecycleManager r0 = com.huawei.common.module.UserLifecycleManager.get()
            android.app.Application r1 = com.blankj.utilcode.util.Utils.getApp()
            android.content.Context r1 = (android.content.Context) r1
            r0.logout(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.GlobalDeviceRestartObserver.ShareDataUIState():void");
    }

    private final String component3() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 999;
            int offsetBefore = 31 - TextUtils.getOffsetBefore("", 0);
            char cBlue = (char) (Color.blue(0) + 61685);
            byte b2 = (byte) ($$b & 1);
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 10), (byte) 0, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, offsetBefore, cBlue, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(22 - TextUtils.getOffsetAfter("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(15 - (ViewConfiguration.getWindowTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9665), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 999;
            int minimumFlingVelocity = 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 61685);
            byte b3 = (byte) 0;
            byte b4 = (byte) (b3 | 6);
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 - 5), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, minimumFlingVelocity, fadingEdgeLength, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = getAsAtTimestamp + 99;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int packedPositionType = 999 - ExpandableListView.getPackedPositionType(0L);
                int scrollDefaultDelay = 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 61684);
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 3);
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 - 2), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, scrollDefaultDelay, c2, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            int i9 = ((((~((-319008010) | r1)) | 1065088) * 449) - 1707650904) + (((~((~((int) SystemClock.elapsedRealtime())) | (-319008010))) | 1065088) * 449) + 1934793255;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2216 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44, (char) (AndroidCharacter.getMirror('0') - '0'), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 1934793255, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1000;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31;
                    char c3 = (char) (61686 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    a(b7, b8, (byte) (b8 + 1), objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, keyRepeatTimeout, c3, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 1030, 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.keyCodeFromString("")), (Class) ITrustedWebActivityCallbackDefault.copydefault(1072 - View.MeasureSpec.getMode(0), 43 - Drawable.resolveOpacity(0, 0), (char) (33530 - Process.getGidForName(""))), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int i12 = 999 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 31;
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 61685);
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 3);
                    Object[] objArr10 = new Object[1];
                    a(b9, b10, (byte) (b10 - 2), objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i12, offsetAfter, keyRepeatDelay, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.getDefaultSize(0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, TextUtils.indexOf((CharSequence) "", '0') + 23, (char) (Drawable.resolveOpacity(0, 0) + 9666), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 998;
                        int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30;
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 61685);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 | 6);
                        Object[] objArr13 = new Object[1];
                        a(b11, b12, (byte) (b12 - 5), objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i13, i14, cResolveSize, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int scrollBarFadeDuration = 999 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 31;
                        char cAxisFromString = (char) (61684 - MotionEvent.axisFromString(""));
                        byte b13 = (byte) ($$b & 1);
                        Object[] objArr14 = new Object[1];
                        a(b13, (byte) (b13 | 10), (byte) 0, objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, iMyPid, cAxisFromString, -1638177773, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                for (String str : strArr) {
                    int i17 = getAsAtTimestamp + 43;
                    component4 = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.blue(0), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr15 = {-19244851, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6514, 55 - TextUtils.lastIndexOf("", '0', 0), (char) View.MeasureSpec.getSize(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr15);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            int i22 = ~System.identityHashCode(this);
            int i23 = i19 + 1262157465 + (((-4317250) | i22) * 184) + (((~(i22 | 733616920)) | (-726394946)) * 184);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
            throw null;
        }
        Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i26 = ((int[]) objArr[3])[0];
        int i27 = ((int[]) objArr[2])[0];
        int i28 = ((int[]) objArr[1])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i29 = ~iIdentityHashCode;
        int i30 = i26 + (-1124715947) + (((~(262600976 | i29)) | 486872417) * (-328)) + ((iIdentityHashCode | 486872417) * 164) + (((~(iIdentityHashCode | (-262600977))) | 218370304 | (~(i29 | 531103089))) * 164);
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr17[3])[0] = i32 ^ (i32 << 5);
        Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i33 = ((int[]) objArr17[3])[0];
        int i34 = ((int[]) objArr17[2])[0];
        int i35 = ((int[]) objArr17[1])[0];
        int i36 = i33 + ((((~(r1 | 18341645)) | 731131748) * 56) - 263666231) + (((~((~System.identityHashCode(this)) | 731131748)) | 18341645) * 56);
        int i37 = (i36 << 13) ^ i36;
        int i38 = i37 ^ (i37 >>> 17);
        ((int[]) objArr18[3])[0] = i38 ^ (i38 << 5);
        int i39 = component4 + 67;
        getAsAtTimestamp = i39 % 128;
        int i40 = i39 % 2;
        String string = SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        String strConcat = "17/22/12/21/".concat("_");
        int i41 = ((int[]) objArr18[3])[0];
        int i42 = i41 * i41;
        int i43 = -(1416159585 * i41);
        int i44 = (i42 & i43) + (i42 | i43);
        int i45 = -(i41 * 267568193);
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        int i47 = ((i46 | 1863683745) << 1) - (1863683745 ^ i46);
        int i48 = i47 >> 29;
        int i49 = ((i48 ^ (-15)) + ((i48 & (-15)) << 1)) / 8;
        int i50 = (i49 & 1) + (i49 | 1);
        int i51 = (i47 ^ i50) + ((i50 & i47) << 1);
        int i52 = i47 >> 28;
        int i53 = -(i51 ^ (((((i52 | (-31)) << 1) - (i52 ^ (-31))) / 16) - (-1)));
        int i54 = ((i53 | 6) << 1) - (i53 ^ 6);
        int i55 = i54 >> 15;
        int i56 = ((i55 & (-262143)) + (i55 | (-262143))) / 131072;
        int i57 = (i56 ^ 1) + ((i56 & 1) << 1);
        String str2 = strConcat.substring(99720 / (((-(((i57 | 1) << 1) - (i57 ^ 1))) & i54) * 1385)) + string;
        int i58 = component4 + 31;
        getAsAtTimestamp = i58 % 128;
        int i59 = i58 % 2;
        return str2;
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null) {
                return;
            }
            if (this.copydefault.isDeviceRestartScreenVisible().getValue().booleanValue()) {
                int i3 = component4 + 117;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                return;
            } else {
                RouteUtils.routeWithExecute(topActivity, BaseRoutePathConstants.DEVICE_RESTARTED, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                ActivityUtils.finishAllActivities();
                return;
            }
        }
        ActivityUtils.getTopActivity();
        throw null;
    }

    private final void copy() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (this.copydefault.isSplashScreenVisible().getValue().booleanValue()) {
            return;
        }
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity != null) {
            RouteUtils.routeWithExecute(topActivity, BaseRoutePathConstants.SFC_SPLASH, 268468224);
            ActivityUtils.finishAllActivities();
        } else {
            int i4 = component4 + 31;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        getRequestBeneficiariesState = 0;
        copydefault();
        INSTANCE = new Companion(null);
        int i = copy + 39;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void copydefault() {
        component2 = new char[]{3095, 14246, 31598, 48958, 58081, 9897, 27238, 44650, 53737, 5547, 22836, 40207, 49383, 1187, 18534, 35889, 47099, 64427, 16198, 25347, 42701, 60043, 10705, 4710, 24233, 39678, 51007, 871, 20388, 35796, 62497, 12411, 31924, 47338, 58677, 8575, 28085};
        equals = -2023513880648206392L;
    }
}
