package com.huawei.digitalpayment.consumer.sfcui.networkcheck;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckManager;
import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckState;
import com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/networkcheck/SfcNetworkCheckActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "TAG", "", "networkCheckManager", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;", "getNetworkCheckManager", "()Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;", "setNetworkCheckManager", "(Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release", "networkState", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcNetworkCheckActivity extends Hilt_SfcNetworkCheckActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static long component1;
    private static long component2;
    private static int component3;
    private static char[] component4;
    private static char copydefault;
    private static char equals;
    private static char getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private final String TAG = Reflection.getOrCreateKotlinClass(SfcNetworkCheckActivity.class).getSimpleName();

    @Inject
    public NetworkCheckManager networkCheckManager;
    private static final byte[] $$l = {TarHeader.LF_CHR, -39, 98, -44};
    private static final int $$m = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {60, -123, -116, -1, -17, -3, 58, -56, -16, -2, 2, -4, -6, -4, 46, -62, -16, 4, -18, Ascii.FF, -18, 63, -64, -9, 7, -11, -3, TarHeader.LF_SYMLINK, -71, 3, -12, -10, 0, 60, -78, 9, 0, -8, -3, -20, 65, -39, -29, -12, -10, 0, 40, -53, -2, -13, -1, 9, 10, -24, -1, -23, 78, -20, -17, -3, -8, -4, -4, 4, -14, -11, 62, -9, -10, 3, -2, -10, -15, 69, -58, -17, -8, -2, -11, -4, 6, -10, 4, -19, SignedBytes.MAX_POWER_OF_TWO, -59, -6, -2, -24, 9, TarHeader.LF_BLK, -64, -10, -11, 10, -18, -1, 8, -16, 57, -27, -38, -2, -24, 9, Ascii.US, -49, -8, -2, -11, -4, 6, -10, 4, Ascii.ETB, -42, 3, -14, 33, -41, -8, -1, 67, -52, -26, 2, -22, 8, Ascii.FS, -34, -24, Ascii.SO, 7, 7, -15, -38, Ascii.SO, -24, 10, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol, -17, -3, -8, -4, -4, 4, -14, -11, 60, -26, 2, -22, 8, Ascii.FS, -34, -24, Ascii.SO, 7, 7, -15, -38, Ascii.SO, -24, 10};
    private static final int $$k = 200;
    private static final byte[] $$d = {2, 77, TarHeader.LF_CONTIG, -86, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 237;
    private static int getSponsorBeneficiariesState = 0;
    private static int ArtificialStackFrames = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r7, short r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = 119 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r6 = r9
            r9 = r8
            r8 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r8 = r8 + 1
            int r9 = r9 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.$$n(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.$$d
            int r1 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r8 = 99 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.h(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.$$j
            int r5 = r5 * 9
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r1 = r6 + 10
            int r7 = r7 * 8
            int r7 = r7 + 83
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r5
            r7 = r6
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-5)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.i(short, int, byte, java.lang.Object[]):void");
    }

    public final NetworkCheckManager getNetworkCheckManager() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 11;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        NetworkCheckManager networkCheckManager = this.networkCheckManager;
        if (networkCheckManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 9;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return networkCheckManager;
    }

    public final void setNetworkCheckManager(NetworkCheckManager networkCheckManager) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 11;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(networkCheckManager, "");
            this.networkCheckManager = networkCheckManager;
            int i3 = 18 / 0;
        } else {
            Intrinsics.checkNotNullParameter(networkCheckManager, "");
            this.networkCheckManager = networkCheckManager;
        }
        int i4 = getSponsorBeneficiariesState + 61;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity$onCreate$1", f = "SfcNetworkCheckActivity.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int copydefault;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity$onCreate$1$1", f = "SfcNetworkCheckActivity.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 0;
            private static int component3 = 1;
            final SfcNetworkCheckActivity component2;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.copydefault;
                if (i2 != 0) {
                    int i3 = component1 + 61;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = component3 + 7;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<NetworkCheckState> networkCheckState = this.component2.getNetworkCheckManager().getNetworkCheckState();
                    final SfcNetworkCheckActivity sfcNetworkCheckActivity = this.component2;
                    this.copydefault = 1;
                    if (networkCheckState.collect(new FlowCollector() {
                        private static int component1 = 1;
                        private static int component3;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i7 = 2 % 2;
                            int i8 = component3 + 37;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            Object objComponent1 = component1((NetworkCheckState) obj2, continuation);
                            int i10 = component1 + 59;
                            component3 = i10 % 128;
                            int i11 = i10 % 2;
                            return objComponent1;
                        }

                        public final Object component1(NetworkCheckState networkCheckState2, Continuation<? super Unit> continuation) {
                            int i7 = 2 % 2;
                            int i8 = component3 + 31;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            if (networkCheckState2.isEnabled()) {
                                int i10 = component1 + 39;
                                component3 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    sfcNetworkCheckActivity.finish();
                                } else {
                                    sfcNetworkCheckActivity.finish();
                                    throw null;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            int i11 = component1 + 63;
                            component3 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 1 / 0;
                            }
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        int i7 = component1 + 69;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SfcNetworkCheckActivity sfcNetworkCheckActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component2 = sfcNetworkCheckActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component2, continuation);
                int i2 = component1 + 25;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 71;
                component1 = i2 % 128;
                Object obj = null;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    component2(coroutineScope2, continuation2);
                    obj.hashCode();
                    throw null;
                }
                Object objComponent2 = component2(coroutineScope2, continuation2);
                int i3 = component3 + 39;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return objComponent2;
                }
                obj.hashCode();
                throw null;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 85;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 17;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = copydefault;
                int i4 = i3 + 55;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 123;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SfcNetworkCheckActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SfcNetworkCheckActivity.this, null), this) == coroutine_suspended) {
                    int i8 = copydefault + 43;
                    component2 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 54 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SfcNetworkCheckActivity.this.new component3(continuation);
            int i2 = copydefault + 71;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component2 + 35;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objComponent3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 == 0) {
                return component3Var.invokeSuspend(Unit.INSTANCE);
            }
            component3Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final SfcNetworkCheckActivity component1;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                Unit unit;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 67;
                component3 = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    ShareDataUIState(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                    int i3 = 31 / 0;
                } else {
                    ShareDataUIState(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 71;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void ShareDataUIState(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = ShareDataUIState + 73;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        int i5 = component3 + 79;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                }
                final State stateCollectAsState = SnapshotStateKt.collectAsState(this.component1.getNetworkCheckManager().getNetworkCheckState(), null, composer, 8, 1);
                final SfcNetworkCheckActivity sfcNetworkCheckActivity = this.component1;
                NetworkCheckScreenKt.NetworkCheckScreen(new Function0() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = copydefault + 1;
                        component3 = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitComponent2 = SfcNetworkCheckActivity.copydefault.AnonymousClass2.component2(sfcNetworkCheckActivity, stateCollectAsState);
                        int i10 = component3 + 89;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        return unitComponent2;
                    }
                }, null, composer, 0, 2);
            }

            private static final Unit component1(SfcNetworkCheckActivity sfcNetworkCheckActivity, State state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 83;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcNetworkCheckActivity, "");
                    Intrinsics.checkNotNullParameter(state, "");
                    component3(state).isEnabled();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcNetworkCheckActivity, "");
                Intrinsics.checkNotNullParameter(state, "");
                if (component3(state).isEnabled()) {
                    int i3 = ShareDataUIState + 91;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    sfcNetworkCheckActivity.finish();
                }
                return Unit.INSTANCE;
            }

            private static final NetworkCheckState component3(State<NetworkCheckState> state) {
                int i = 2 % 2;
                int i2 = component3 + 115;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                NetworkCheckState value = state.getValue();
                if (i3 == 0) {
                    return value;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component2(SfcNetworkCheckActivity sfcNetworkCheckActivity, State state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(sfcNetworkCheckActivity, state);
                int i4 = component3 + 93;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent1;
            }

            AnonymousClass2(SfcNetworkCheckActivity sfcNetworkCheckActivity) {
                this.component1 = sfcNetworkCheckActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 91;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return unit;
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 87;
            component3 = i4 % 128;
            if (i4 % 2 != 0 ? (i & 11) == 2 : (i & 28) == 4) {
                int i5 = i3 + 17;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i7 = component1 + 55;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1183687995, true, new AnonymousClass2(SfcNetworkCheckActivity.this), composer, 54), composer, 1572864, 63);
        }

        copydefault() {
        }
    }

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 41;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int offsetBefore = 4037 - TextUtils.getOffsetBefore("", i4);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31;
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19181);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$n = $$n(b2, b3, (byte) (b3 | 20));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, maximumDrawingCacheSize, keyRepeatTimeout, 1912513118, false, str$$n, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int deadChar = 7567 - KeyEvent.getDeadChar(i4, i4);
                    int iCombineMeasuredStates = View.combineMeasuredStates(i4, i4) + 11;
                    char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, iCombineMeasuredStates, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - Color.argb(i4, i4, i4, i4), 27 - Process.getGidForName(""), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 931716605, false, $$n(b4, b5, (byte) (b5 | Ascii.NAK)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.getTrimmedLength(""), 11 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) equals) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $11 + 65;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i10 = $10 + 51;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static void j(char c2, char[] cArr, int i, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $10 + 99;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 4037, 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (19181 - Color.green(0)), 1912513118, false, $$n(b2, b3, (byte) (b3 | 20)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, (char) (ViewConfiguration.getEdgeSlop() >> 16), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 2459, 28 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 931716605, false, $$n(b4, b5, (byte) (b5 | Ascii.NAK)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 7567, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (char) Color.green(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i6 = $10 + 41;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.g(int, char[], byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x25f0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x25f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0234  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 97;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = ArtificialStackFrames + 13;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g(26 - ExpandableListView.getPackedPositionType(0L), new char[]{30, 23, 6, 11, 18, '#', 5, ' ', 21, AbstractJsonLexerKt.COMMA, '/', 28, '$', JSONLexer.EOI, 4, ')', '.', ')', 3, 20, 7, Typography.amp, 11, '\"', 25, 2}, (byte) (75 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{23, '$', 13836, 13836, 30, 18, 5, ')', 13838, 13838, ' ', ')', 23, 24, 4, ')', 15, 17}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = getSponsorBeneficiariesState + 125;
            ArtificialStackFrames = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = ArtificialStackFrames + 107;
            getSponsorBeneficiariesState = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 6618, 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 55, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r44) {
        /*
            Method dump skipped, instruction units count: 16460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.networkcheck.SfcNetworkCheckActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getRequestBeneficiariesState = 0;
        ShareDataUIState();
        copydefault();
        int i = copy + 49;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 67;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getSponsorBeneficiariesState + 67;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 121;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        component1 = -3780477796495014671L;
        ShareDataUIState = 1386857713;
        copydefault = (char) 11312;
        int i5 = i3 + 13;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component2 = -3780477796495014671L;
        component3 = 1386857713;
        equals = (char) 22062;
        component4 = new char[]{1975, 1963, 1977, 1955, 2020, 1954, 2036, 1961, 1962, 2026, 2004, 1965, 1964, 2034, 2031, 1978, 2030, 2041, 2029, 1953, 2023, 1976, 2019, 2017, 2035, 2003, 2018, 1967, 2033, 1971, 2002, 1969, 2021, 1966, 2028, 2024, 1970, 2037, 1972, 2025, 1985, 2022, 2032, 1952, 1960, 1973, 1968, 1974, 2038};
        getAsAtTimestamp = (char) 12829;
    }
}
