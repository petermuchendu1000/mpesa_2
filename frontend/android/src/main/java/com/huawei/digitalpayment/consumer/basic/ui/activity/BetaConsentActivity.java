package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.constant.CacheConstants;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.entities.BetaConsentEntity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/activity/BetaConsentActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "appDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_USERID, "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class BetaConsentActivity extends Hilt_BetaConsentActivity {
    public static final int $stable = 8;
    private static int[] ShareDataUIState;
    private static int component1;
    private static int copydefault;
    private AppDatabase appDatabase;
    private String userId = "";
    private static final byte[] $$a = {TarHeader.LF_CHR, -39, 98, -44};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.$$a
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r7 = r7 + 65
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.$$c(int, int, short):java.lang.String");
    }

    public static final AppDatabase access$getAppDatabase$p(BetaConsentActivity betaConsentActivity) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        AppDatabase appDatabase = betaConsentActivity.appDatabase;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return appDatabase;
    }

    public static final String access$getUserId$p(BetaConsentActivity betaConsentActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = betaConsentActivity.userId;
        int i5 = i3 + 49;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;
        final Bundle component2;
        final String copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final String ShareDataUIState;
            final BetaConsentActivity component1;
            final Bundle component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 7;
                component2 = i2 % 128;
                Object obj = null;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 != 0) {
                    component1(composer2, num2.intValue());
                    Unit unit = Unit.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                component1(composer2, num2.intValue());
                Unit unit2 = Unit.INSTANCE;
                int i3 = component2 + 113;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
            
                if (r5.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            
                r5.skipToGroupEnd();
                r5 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component2 + 89;
                com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.copydefault = r5 % 128;
                r5 = r5 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
            
                if (r5.getSkipping() == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component1(androidx.compose.runtime.Composer r5, int r6) {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r6 = r6 & 11
                    r1 = 0
                    if (r6 != r0) goto L30
                    int r6 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.copydefault
                    int r6 = r6 + 59
                    int r2 = r6 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component2 = r2
                    int r6 = r6 % r0
                    if (r6 == 0) goto L1c
                    boolean r6 = r5.getSkipping()
                    r2 = 2
                    int r2 = r2 / r1
                    if (r6 != 0) goto L23
                    goto L30
                L1c:
                    boolean r6 = r5.getSkipping()
                    if (r6 != 0) goto L23
                    goto L30
                L23:
                    r5.skipToGroupEnd()
                    int r5 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component2
                    int r5 = r5 + 89
                    int r6 = r5 % 128
                    com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.copydefault = r6
                    int r5 = r5 % r0
                    goto L40
                L30:
                    com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity$onCreate$1$1$$ExternalSyntheticLambda0 r6 = new com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity r0 = r4.component1
                    java.lang.String r2 = r4.ShareDataUIState
                    android.os.Bundle r3 = r4.component3
                    r6.<init>()
                    r0 = 1
                    r2 = 0
                    com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivityKt.ConsentScreen(r2, r6, r5, r1, r0)
                L40:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component1(androidx.compose.runtime.Composer, int):void");
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity$onCreate$1$1$1$1", f = "BetaConsentActivity.kt", i = {0}, l = {85}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
            static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component4 = 0;
                private static int getRequestBeneficiariesState = 1;
                private Object ShareDataUIState;
                int component1;
                final BetaConsentActivity component2;
                final Bundle component3;
                final String copydefault;

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity$onCreate$1$1$1$1$1", f = "BetaConsentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    private static int copy = 1;
                    private static int copydefault;
                    final String ShareDataUIState;
                    int component1;
                    final Bundle component2;
                    final BetaConsentActivity component3;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
                    
                        com.huawei.arouter.RouteUtils.routeWithExecute(r3.ShareDataUIState, r3.component2);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
                    
                        r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copy + 53;
                        com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copydefault = r4 % 128;
                        r4 = r4 % 2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
                    
                        com.huawei.arouter.RouteUtils.routeWithExecute(com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants.MAIN);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
                    
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    
                        if (r3.component1 == 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
                    
                        if (r3.component1 == 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
                    
                        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copy + 89;
                        com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copydefault = r1 % 128;
                        r1 = r1 % 2;
                        kotlin.ResultKt.throwOnFailure(r4);
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
                            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copy
                            int r1 = r1 + 55
                            int r2 = r1 % 128
                            com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copydefault = r2
                            int r1 = r1 % r0
                            if (r1 == 0) goto L18
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r3.component1
                            r2 = 0
                            int r2 = r2 / r2
                            if (r1 != 0) goto L49
                            goto L1f
                        L18:
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r3.component1
                            if (r1 != 0) goto L49
                        L1f:
                            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copy
                            int r1 = r1 + 89
                            int r2 = r1 % 128
                            com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copydefault = r2
                            int r1 = r1 % r0
                            kotlin.ResultKt.throwOnFailure(r4)
                            java.lang.String r4 = r3.ShareDataUIState     // Catch: java.lang.Exception -> L3c
                            android.os.Bundle r1 = r3.component2     // Catch: java.lang.Exception -> L3c
                            com.huawei.arouter.RouteUtils.routeWithExecute(r4, r1)     // Catch: java.lang.Exception -> L3c
                            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copy
                            int r4 = r4 + 53
                            int r1 = r4 % 128
                            com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.copydefault = r1
                            int r4 = r4 % r0
                            goto L41
                        L3c:
                            java.lang.String r4 = "/mainModule/main"
                            com.huawei.arouter.RouteUtils.routeWithExecute(r4)
                        L41:
                            com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity r4 = r3.component3
                            r4.finish()
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        L49:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r0)
                            throw r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.component2.AnonymousClass4.component3.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(String str, Bundle bundle, BetaConsentActivity betaConsentActivity, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.ShareDataUIState = str;
                        this.component2 = bundle;
                        this.component3 = betaConsentActivity;
                    }

                    @Override
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        int i = 2 % 2;
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.ShareDataUIState, this.component2, this.component3, continuation);
                        int i2 = copy + 79;
                        copydefault = i2 % 128;
                        int i3 = i2 % 2;
                        return anonymousClass3;
                    }

                    @Override
                    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        int i = 2 % 2;
                        int i2 = copydefault + 67;
                        copy = i2 % 128;
                        int i3 = i2 % 2;
                        Object objCopydefault = copydefault(coroutineScope, continuation);
                        int i4 = copydefault + 95;
                        copy = i4 % 128;
                        int i5 = i4 % 2;
                        return objCopydefault;
                    }

                    public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        int i = 2 % 2;
                        int i2 = copydefault + 103;
                        copy = i2 % 128;
                        int i3 = i2 % 2;
                        Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        int i4 = copy + 55;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return objInvokeSuspend;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) {
                    CoroutineScope coroutineScope;
                    int i = 2 % 2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.component1;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope2 = (CoroutineScope) this.ShareDataUIState;
                        AppDatabase appDatabaseAccess$getAppDatabase$p = BetaConsentActivity.access$getAppDatabase$p(this.component2);
                        if (appDatabaseAccess$getAppDatabase$p == null) {
                            int i3 = getRequestBeneficiariesState + 49;
                            component4 = i3 % 128;
                            int i4 = i3 % 2;
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            appDatabaseAccess$getAppDatabase$p = null;
                        }
                        this.ShareDataUIState = coroutineScope2;
                        this.component1 = 1;
                        if (appDatabaseAccess$getAppDatabase$p.consentDao().insertConsent(new BetaConsentEntity(BetaConsentActivity.access$getUserId$p(this.component2), true), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope2;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = component4 + 47;
                        getRequestBeneficiariesState = i5 % 128;
                        int i6 = i5 % 2;
                        CoroutineScope coroutineScope3 = (CoroutineScope) this.ShareDataUIState;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = coroutineScope3;
                    }
                    onSubMenuSelected.ShareDataUIState(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass3(this.copydefault, this.component3, this.component2, null), 2, null);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                component3(BetaConsentActivity betaConsentActivity, String str, Bundle bundle, Continuation<? super component3> continuation) {
                    super(2, continuation);
                    this.component2 = betaConsentActivity;
                    this.copydefault = str;
                    this.component3 = bundle;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    component3 component3Var = new component3(this.component2, this.copydefault, this.component3, continuation);
                    component3Var.ShareDataUIState = obj;
                    component3 component3Var2 = component3Var;
                    int i2 = getRequestBeneficiariesState + 71;
                    component4 = i2 % 128;
                    int i3 = i2 % 2;
                    return component3Var2;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component4 + 47;
                    getRequestBeneficiariesState = i2 % 128;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return component3(coroutineScope2, continuation2);
                    }
                    component3(coroutineScope2, continuation2);
                    throw null;
                }

                public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = getRequestBeneficiariesState + 123;
                    component4 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component4 + 7;
                    getRequestBeneficiariesState = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }
            }

            private static final Unit ShareDataUIState(BetaConsentActivity betaConsentActivity, String str, Bundle bundle) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(betaConsentActivity, "");
                onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(betaConsentActivity), Dispatchers.getIO(), null, new component3(betaConsentActivity, str, bundle, null), 2, null);
                Unit unit = Unit.INSTANCE;
                int i2 = copydefault + 89;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            public static Unit component2(BetaConsentActivity betaConsentActivity, String str, Bundle bundle) {
                int i = 2 % 2;
                int i2 = copydefault + 75;
                component2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    ShareDataUIState(betaConsentActivity, str, bundle);
                    obj.hashCode();
                    throw null;
                }
                Unit unitShareDataUIState = ShareDataUIState(betaConsentActivity, str, bundle);
                int i3 = component2 + 35;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitShareDataUIState;
                }
                throw null;
            }

            AnonymousClass4(BetaConsentActivity betaConsentActivity, String str, Bundle bundle) {
                this.component1 = betaConsentActivity;
                this.ShareDataUIState = str;
                this.component3 = bundle;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 89;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void ShareDataUIState(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 17;
            int i4 = i3 % 128;
            component1 = i4;
            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 1) == 4) {
                int i5 = i4 + 99;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1336079176, true, new AnonymousClass4(BetaConsentActivity.this, this.copydefault, this.component2), composer, 54), composer, 1572864, 63);
            int i7 = component1 + 49;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }

        component2(String str, Bundle bundle) {
            this.copydefault = str;
            this.component2 = bundle;
        }
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - TextUtils.getCapsMode("", 0, 0), 37 - TextUtils.lastIndexOf("", '0'), (char) (26860 - View.getDefaultSize(0, 0)), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - KeyEvent.normalizeMetaState(0), 16 - Color.red(0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i10 = $10 + 109;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[i3 / iTrustedWebActivityServiceStub.ShareDataUIState];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 7406, (Process.myPid() >> 22) + 16, (char) Color.blue(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 7406, 16 - View.MeasureSpec.getMode(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3;
        int length2;
        int[] iArr3;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = ShareDataUIState;
        char c2 = '0';
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $11 + 39;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $11 + 77;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(iArr4[i9]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.lastIndexOf("", c2, i7, i7), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, (char) View.MeasureSpec.getSize(i7), -309236339, false, $$c(b2, b3, (byte) (b3 | 41)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    c2 = '0';
                    i5 = 684241640;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = ShareDataUIState;
        long j = 0;
        if (iArr6 != null) {
            int i12 = $10 + 63;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i13 = $10 + i6;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr3 = new Object[i6];
                    objArr3[0] = Integer.valueOf(iArr6[i2]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int gidForName = 4390 - Process.getGidForName("");
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 37;
                        char c3 = (char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        i3 = length;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iIndexOf, c3, -309236339, false, $$c(b4, b5, (byte) (b5 | 41)), new Class[]{Integer.TYPE});
                    } else {
                        i3 = length;
                    }
                    iArr2[i2] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                } else {
                    i3 = length;
                    Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (Process.myPid() >> 22), View.resolveSize(0, 0) + 37, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), -309236339, false, $$c(b6, b7, (byte) (b7 | 41)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i2++;
                }
                length = i3;
                j = 0;
                i6 = 1;
            }
            iArr6 = iArr2;
        }
        char c4 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c4] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            for (int i14 = 0; i14 < 16; i14++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i14];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2967, 15 - TextUtils.lastIndexOf("", '0'), (char) (49872 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 462826032, false, $$c(b8, b8, (byte) (-$$a[1])), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (27637 - TextUtils.indexOf("", "", 0, 0)), -1616366948, false, $$c(b9, b10, (byte) (b10 | 42)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            c4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) - 28, new int[]{175134029, -821319943, -181501726, -237429527, -370087376, 15290394, 2112270589, -29042410, -868484249, -833610296}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        b(Process.getGidForName("") + 278, 3 - TextUtils.lastIndexOf("", '0', 0), new char[]{17, 65517, 1, 65532, 5}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 100, false, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = getRequestBeneficiariesState + 45;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953368_res_0x7f1306d8).substring(0, 6).codePointAt(4) - 71, new int[]{175134029, -821319943, -181501726, -237429527, -370352724, 1636116280, 1271497349, 621042372, -1731875157, 1700509547, 622220082, 1658946553, 915691668, -1102940522}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) + 171, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, new char[]{4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() + 16, false, objArr4);
                baseContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i6 = component2 + 21;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - ExpandableListView.getPackedPositionGroup(0L), 42 - View.resolveSize(0, 0), (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    b(244 - (KeyEvent.getMaxKeyCode() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 23, new char[]{65513, 65518, 65517, 65520, 65517, 27, JSONLexer.EOI, 65522, 65514, 31, 65519, 65520, 28, 30, 65513, 28, 65519, 65522, 65522, 65516, 30, 65519, 27, 65514, 65518, 65518, JSONLexer.EOI, 65516, 65519, 30, 65517, 65521, 31, 65517, 27, JSONLexer.EOI, 31, 31, 30, JSONLexer.EOI, 65513, 65514, 65515, 65522, 28, JSONLexer.EOI, 65519, 65517}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) + 11, false, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 240, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, new char[]{31, 65520, 65516, 65517, 65519, ' ', 65518, 65525, 65522, 65525, 65519, 65524, 65525, 65519, 65522, 65524, '\"', 65524, 65523, 30, 29, 65518, ' ', 65517, 65521, 65521, '\"', 65517, 65525, 65524, 31, 31, 65517, ' ', '!', 30, 31, 65524, 65516, 30, 65522, 65524, 65522, 65519, ' ', 31, 65524, 65519, 65516, '\"', 65516, 30, 65524, 65516, 65519, 31, 31, 65522, 65525, 65520, 65517, '\"', 65518, 31}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 62, true, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() + 63, new int[]{600640962, -1085613352, 101331166, 528007139, 1523992267, 1130710480, -353939762, -922147299, 3473252, 1766030948, -238516468, 1413463739, -2019034493, -926436567, -878920267, -1876075643, 841961075, 1980347630, -612367424, 1644016159, 2036910709, -725183982, 293144002, -638037011, 1830158137, 589015511, -1835397166, 985004385, 1776762822, 1323955942, 764045402, -1150110876}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 71, new int[]{1321724708, -544681478, 1301462420, 1297928874, 341456975, -436325227, 1846863012, -1414839270, -599397855, 1187306139, 94059655, -1261410963, -1392635135, -1926151383, -1987851792, 1167915683, -928286402, 1105910297, -983926491, -585354756, 1971302230, -760172470, 1692577471, 2055349905, -2029120024, -598097933, -1335435900, -1674056107, -229584192, -1916034599, 1575222178, -2095508515, 886229616, -1262873150, -794698058, 940774894}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 102, new int[]{-79047821, -1638565851, -1259105999, -868928408}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() + 33, new int[]{2070252015, -1887997848, -1600167805, -1010101878, -828972467, -63814814, -1479831930, -1294631991, 1416730589, -1250763855, -621683279, 249627682, 407960825, -1897892173, 62859110, 602080562, -1493108986, -197304179}, objArr10);
                    Object[] objArr11 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr10[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 56, (char) Color.argb(0, 0, 0, 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        BetaConsentActivity betaConsentActivity = this;
        EdgeToEdge.enable$default(betaConsentActivity, null, null, 3, null);
        super.onCreate(savedInstanceState);
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.appDatabase = companion.buildDatabase(applicationContext);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        if (string == null) {
            int i8 = getRequestBeneficiariesState + 29;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            string = "default_user";
        }
        this.userId = string;
        ComponentActivityKt.setContent$default(betaConsentActivity, null, ComposableLambdaKt.composableLambdaInstance(1632459659, true, new component2(getIntent().getStringExtra("next_execute"), getIntent().getBundleExtra("next_bundle"))), 1, null);
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = component2 + 113;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, new int[]{175134029, -821319943, -181501726, -237429527, -370352724, 1636116280, 1271497349, 621042372, -1731875157, 1700509547, 622220082, 1658946553, 915691668, -1102940522}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(279 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, new char[]{4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952804_res_0x7f1304a4).substring(10, 11).length() + 17, false, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = component2 + 113;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = component2 + 29;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6618, TextUtils.indexOf("", "", 0) + 42, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6562, (ViewConfiguration.getLongPressTimeout() >> 16) + 56, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.BetaConsentActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copydefault = 1;
        component1();
        int i = component3 + 11;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component2 + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        ShareDataUIState = new int[]{1369987, -2055723110, 1768735585, -6471821, -2069031671, 1261371325, -519051393, -1384299294, -45190036, -1356725486, -426966260, -1777118955, -1529157673, 707477551, -1839927486, 2035219362, -289050216, 1456248802};
        component1 = -890926540;
    }
}
