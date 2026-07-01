package com.huawei.digitalpayment.consumer.home.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.plus.security.lite.SecLiteException;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.arouter.RouteUtils;
import com.huawei.arouter.Router;
import com.huawei.arouter.executehandler.ExecuteHandler;
import com.huawei.common.exception.BaseException;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter;
import com.huawei.digitalpayment.consumer.home.widget.NavigationButton;
import com.huawei.digitalpayment.consumer.homeui.databinding.ActivityHomeBinding;
import com.huawei.digitalpayment.home.request.HomeThemePreviewParams;
import com.huawei.digitalpayment.home.theme.data.local.LocalComponent;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme;
import com.huawei.digitalpayment.home.theme.viewmodel.HomeThemeViewModel;
import com.huawei.digitalpayment.home.theme.viewmodel.UiState;
import com.huawei.image.util.GlideUtils;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0014J\u0018\u0010\u001c\u001a\u00020\u00112\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomePreviewActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/ActivityHomeBinding;", "Lcom/huawei/digitalpayment/home/theme/viewmodel/HomeThemeViewModel;", "<init>", "()V", "adapter", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;", "getAdapter", "()Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;", "setAdapter", "(Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;)V", "selectedPosition", "", "homeExecuteHandler", "Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomePreviewActivity$HomePreviewExecuteHandler;", "initToolbar", "", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "observer", "updateView", "pageConfig", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "onDestroy", "updateNavigation", "functions", "", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "doSelect", FirebaseAnalytics.Param.INDEX, "getLayoutId", "HomePreviewExecuteHandler", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public class HomePreviewActivity extends Hilt_HomePreviewActivity<ActivityHomeBinding, HomeThemeViewModel> {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static char[] component2;
    private static int component3;
    private static long copydefault;
    private static int equals;

    @Inject
    public MainFragmentStateAdapter adapter;
    private HomePreviewExecuteHandler homeExecuteHandler;
    private int selectedPosition;
    private static final byte[] $$l = {Ascii.GS, -26, 91, 68};
    private static final int $$o = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {94, -53, Ascii.FS, -60, -20, -6, TarHeader.LF_CONTIG, -59, -19, -5, -1, -7, -9, -7, 43, -59, -25, 1, -21, 9, -21, 60, -59, -23, -8, 58, -27, -55, -8, Ascii.SUB, -41, 3, -9, 57, -22, 6, -21, -20, -6, -11, -7, -7, 1, -17, -14, 57};
    private static final int $$k = 24;
    private static final byte[] $$d = {125, 44, 8, -98, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 157;
    private static int copy = 0;
    private static int component1 = 0;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r5, short r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.$$l
            int r5 = r5 * 4
            int r5 = r5 + 1
            int r6 = 115 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r7]
        L27:
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.$$r(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r0 = r8 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.$$d
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.h(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 99 - r8
            int r6 = r6 * 24
            int r0 = 34 - r6
            int r7 = r7 * 33
            int r7 = 36 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.$$j
            byte[] r0 = new byte[r0]
            int r6 = 33 - r6
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
            int r7 = r7 + (-8)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.i(short, int, byte, java.lang.Object[]):void");
    }

    public static final void access$doSelect(HomePreviewActivity homePreviewActivity, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 81;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        homePreviewActivity.doSelect(i);
        int i5 = getRequestBeneficiariesState + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final ViewModel access$getViewModel$p(HomePreviewActivity homePreviewActivity) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        VM vm = homePreviewActivity.viewModel;
        if (i3 != 0) {
            return vm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$updateView(HomePreviewActivity homePreviewActivity, LocalHomeTheme localHomeTheme) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        homePreviewActivity.updateView(localHomeTheme);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MainFragmentStateAdapter getAdapter() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        MainFragmentStateAdapter mainFragmentStateAdapter = this.adapter;
        if (mainFragmentStateAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return mainFragmentStateAdapter;
    }

    public final void setAdapter(MainFragmentStateAdapter mainFragmentStateAdapter) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(mainFragmentStateAdapter, "");
            this.adapter = mainFragmentStateAdapter;
            int i3 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(mainFragmentStateAdapter, "");
            this.adapter = mainFragmentStateAdapter;
        }
        int i4 = component1 + 49;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1", f = "HomePreviewActivity.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1", f = "HomePreviewActivity.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int copydefault = 1;
            int component1;
            final HomePreviewActivity component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component1;
                if (i2 != 0) {
                    int i3 = copydefault + 59;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<UiState> stateFlowUiState = ((HomeThemeViewModel) HomePreviewActivity.access$getViewModel$p(this.component3)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component2 = 0;
                            private static int copydefault = 1;
                            final FlowCollector ShareDataUIState;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1$2", f = "HomePreviewActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int ShareDataUIState = 1;
                                private static int copydefault;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = copydefault + 19;
                                    ShareDataUIState = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = copydefault + 73;
                                    ShareDataUIState = i4 % 128;
                                    int i5 = i4 % 2;
                                    return objEmit;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L17
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L17
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L1c
                                L17:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L1c:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L3e
                                    if (r3 != r4) goto L36
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 3
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                    int r6 = r6 % r0
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L68
                                L36:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L3e:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.ShareDataUIState
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.home.theme.viewmodel.UiState r6 = (com.huawei.digitalpayment.home.theme.viewmodel.UiState) r6
                                    boolean r6 = r6.getLoading()
                                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L68
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 85
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r7
                                    int r6 = r6 % r0
                                    if (r6 == 0) goto L67
                                    r6 = 79
                                    int r6 = r6 / 0
                                L67:
                                    return r2
                                L68:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r7 = r7 + 95
                                    int r1 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                    int r7 = r7 % r0
                                    if (r7 == 0) goto L76
                                    return r6
                                L76:
                                    r6 = 0
                                    r6.hashCode()
                                    throw r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.ShareDataUIState = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i4 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Unit unit = Unit.INSTANCE;
                                int i5 = component3 + 109;
                                copydefault = i5 % 128;
                                int i6 = i5 % 2;
                                return unit;
                            }
                            int i7 = copydefault + 67;
                            component3 = i7 % 128;
                            if (i7 % 2 == 0) {
                                return objCollect;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    });
                    final HomePreviewActivity homePreviewActivity = this.component3;
                    this.component1 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState + 1;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
                            Object objComponent2 = component2(((Boolean) obj2).booleanValue(), continuation);
                            int i7 = component3 + 101;
                            ShareDataUIState = i7 % 128;
                            if (i7 % 2 == 0) {
                                return objComponent2;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object component2(boolean z, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState;
                            int i6 = i5 + 55;
                            component3 = i6 % 128;
                            int i7 = i6 % 2;
                            if (!(!z)) {
                                int i8 = i5 + 15;
                                component3 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    DialogManager.showLoading(homePreviewActivity);
                                    int i9 = 15 / 0;
                                } else {
                                    DialogManager.showLoading(homePreviewActivity);
                                }
                            } else {
                                DialogManager.hideLoading(homePreviewActivity);
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i4 = copydefault + 19;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i6 = copydefault + 15;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomePreviewActivity homePreviewActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component3 = homePreviewActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3, continuation);
                int i2 = copydefault + 43;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 15;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = copydefault + 101;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objComponent1;
                }
                throw null;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 77;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 63;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 56 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component3 + 43;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(HomePreviewActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(HomePreviewActivity.this, null), this) == coroutine_suspended) {
                    int i4 = component3;
                    int i5 = i4 + 77;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 45;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
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
            component3 component3Var = HomePreviewActivity.this.new component3(continuation);
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = ShareDataUIState + 3;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 92 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2", f = "HomePreviewActivity.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1", f = "HomePreviewActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            public static int copydefault = -573286263;
            final HomePreviewActivity component2;
            int component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component3;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 113;
                    int i4 = i3 % 128;
                    component1 = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 3;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.throwOnFailure(obj);
                    int i8 = component1 + 45;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<UiState> stateFlowUiState = ((HomeThemeViewModel) HomePreviewActivity.access$getViewModel$p(this.component2)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<BaseException>() {
                        private static int ShareDataUIState = 1;
                        public static int component1 = 586111662;
                        private static int component3;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component2 = 0;
                            private static int copydefault = 1;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1$2", f = "HomePreviewActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int ShareDataUIState = 0;
                                private static int copydefault = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = ShareDataUIState + 79;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = copydefault + 115;
                                    ShareDataUIState = i4 % 128;
                                    int i5 = i4 % 2;
                                    return objEmit;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L31
                                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r1 = r1 + 111
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r1 = r1 % r0
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L31
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r7 = r7 + 91
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L2b
                                    int r7 = r1.label
                                    int r7 = r7 - r3
                                    r1.label = r7
                                    goto L36
                                L2b:
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L36
                                L31:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L36:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L69
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 39
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                    int r6 = r6 % r0
                                    if (r3 != r4) goto L61
                                    int r1 = r1 + 85
                                    int r6 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r6
                                    int r1 = r1 % r0
                                    if (r1 == 0) goto L59
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L80
                                L59:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    r6 = 0
                                    r6.hashCode()
                                    throw r6
                                L61:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L69:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.home.theme.viewmodel.UiState r6 = (com.huawei.digitalpayment.home.theme.viewmodel.UiState) r6
                                    com.huawei.common.exception.BaseException r6 = r6.getException()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L80
                                    return r2
                                L80:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r7 = r7 + 27
                                    int r1 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                    int r7 = r7 % r0
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super BaseException> flowCollector, Continuation continuation) {
                            int i10 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i11 = component3 + 89;
                                ShareDataUIState = i11 % 128;
                                int i12 = i11 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i13 = component3 + 123;
                            ShareDataUIState = i13 % 128;
                            if (i13 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                    });
                    final HomePreviewActivity homePreviewActivity = this.component2;
                    this.component3 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int component1 = 1;
                        private static int component3;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i10 = 2 % 2;
                            int i11 = component3 + 13;
                            component1 = i11 % 128;
                            int i12 = i11 % 2;
                            Object objComponent1 = component1((BaseException) obj2, continuation);
                            int i13 = component3 + 97;
                            component1 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i14 = 78 / 0;
                            }
                            return objComponent1;
                        }

                        public final Object component1(BaseException baseException, Continuation<? super Unit> continuation) {
                            int i10 = 2 % 2;
                            int i11 = component1 + 99;
                            int i12 = i11 % 128;
                            component3 = i12;
                            int i13 = i11 % 2;
                            if (baseException != null) {
                                int i14 = i12 + 87;
                                component1 = i14 % 128;
                                if (i14 % 2 != 0) {
                                    CommonToast.showText(baseException.getMessage());
                                    homePreviewActivity.finish();
                                } else {
                                    CommonToast.showText(baseException.getMessage());
                                    homePreviewActivity.finish();
                                    throw null;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            int i15 = component3 + 73;
                            component1 = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = 96 / 0;
                            }
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomePreviewActivity homePreviewActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component2 = homePreviewActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component2, continuation);
                int i2 = ShareDataUIState + 57;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = component1 + 17;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 61;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 58 / 0;
                }
                int i5 = component1 + 43;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(HomePreviewActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(HomePreviewActivity.this, null), this) == coroutine_suspended) {
                    int i3 = copydefault + 87;
                    component1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 32 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i5 = copydefault + 37;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = HomePreviewActivity.this.new copydefault(continuation);
            int i2 = copydefault + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 75;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 81;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3", f = "HomePreviewActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1", f = "HomePreviewActivity.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            int component2;
            final HomePreviewActivity component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 79;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = copydefault + 55;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<UiState> stateFlowUiState = ((HomeThemeViewModel) HomePreviewActivity.access$getViewModel$p(this.component3)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<LocalHomeTheme>() {
                        private static final byte[] $$c = {1, -9, -86, 35};
                        private static final int $$d = 182;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$a = {106, -23, Ascii.FF, -128, -6, 5, -3};
                        private static final int $$b = 81;
                        private static int ShareDataUIState = 0;
                        private static int component1 = 1;
                        private static int[] component2 = {-866964023, 1978791983, 2027382095, 113550474, -89415197, 1029178039, 1388033149, 1663264500, -1531203314, 1547587509, -1141548648, -1444306144, 100460277, 508016731, -1517710833, -1129829358, 1922756094, 630026461};

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        private static java.lang.String $$e(byte r7, int r8, byte r9) {
                            /*
                                byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.$$c
                                int r8 = r8 * 3
                                int r8 = 1 - r8
                                int r9 = 107 - r9
                                int r7 = r7 * 3
                                int r7 = 3 - r7
                                byte[] r1 = new byte[r8]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r9 = r7
                                r3 = r8
                                r5 = r2
                                goto L2a
                            L15:
                                r3 = r2
                            L16:
                                int r7 = r7 + 1
                                byte r4 = (byte) r9
                                int r5 = r3 + 1
                                r1[r3] = r4
                                if (r5 != r8) goto L25
                                java.lang.String r7 = new java.lang.String
                                r7.<init>(r1, r2)
                                return r7
                            L25:
                                r3 = r0[r7]
                                r6 = r9
                                r9 = r7
                                r7 = r6
                            L2a:
                                int r3 = -r3
                                int r7 = r7 + r3
                                r3 = r5
                                r6 = r9
                                r9 = r7
                                r7 = r6
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.$$e(byte, int, byte):java.lang.String");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        private static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
                            /*
                                int r7 = r7 * 3
                                int r7 = r7 + 99
                                int r8 = r8 * 2
                                int r0 = 4 - r8
                                int r6 = r6 * 3
                                int r6 = 3 - r6
                                byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.$$a
                                byte[] r0 = new byte[r0]
                                int r8 = 3 - r8
                                r2 = 0
                                if (r1 != 0) goto L19
                                r4 = r7
                                r3 = r2
                                r7 = r6
                                goto L30
                            L19:
                                r3 = r2
                            L1a:
                                int r6 = r6 + 1
                                byte r4 = (byte) r7
                                r0[r3] = r4
                                if (r3 != r8) goto L29
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r0, r2)
                                r9[r2] = r6
                                return
                            L29:
                                int r3 = r3 + 1
                                r4 = r1[r6]
                                r5 = r7
                                r7 = r6
                                r6 = r5
                            L30:
                                int r4 = -r4
                                int r6 = r6 + r4
                                int r6 = r6 + 6
                                r5 = r7
                                r7 = r6
                                r6 = r5
                                goto L1a
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.b(int, short, int, java.lang.Object[]):void");
                        }

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component2 = 0;
                            private static int component3 = 1;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1$2", f = "HomePreviewActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component2 = 1;
                                private static int copydefault;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component2 + 101;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    Object obj2 = null;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    AnonymousClass1 anonymousClass1 = this;
                                    if (i3 == 0) {
                                        return anonymousClass2.emit(null, anonymousClass1);
                                    }
                                    anonymousClass2.emit(null, anonymousClass1);
                                    obj2.hashCode();
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                                /*
                                    r4 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L29
                                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r1 = r1 + 123
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                    int r1 = r1 % r0
                                    r1 = r6
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L29
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r6 = r6 + 45
                                    int r2 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r2
                                    int r6 = r6 % r0
                                    int r6 = r1.label
                                    int r6 = r6 + r3
                                    r1.label = r6
                                    goto L2e
                                L29:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r6)
                                L2e:
                                    java.lang.Object r6 = r1.result
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r2 = r1.label
                                    r3 = 1
                                    if (r2 == 0) goto L47
                                    if (r2 != r3) goto L3f
                                    kotlin.ResultKt.throwOnFailure(r6)
                                    goto L5e
                                L3f:
                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                    r5.<init>(r6)
                                    throw r5
                                L47:
                                    kotlin.ResultKt.throwOnFailure(r6)
                                    kotlinx.coroutines.flow.FlowCollector r6 = r4.component1
                                    r2 = r1
                                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                                    com.huawei.digitalpayment.home.theme.viewmodel.UiState r5 = (com.huawei.digitalpayment.home.theme.viewmodel.UiState) r5
                                    com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme r5 = r5.getData()
                                    r1.label = r3
                                    java.lang.Object r5 = r6.emit(r5, r1)
                                    if (r5 != r0) goto L5e
                                    return r0
                                L5e:
                                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                    return r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super LocalHomeTheme> flowCollector, Continuation continuation) {
                            int i7 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i8 = ShareDataUIState + 105;
                                component1 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return objCollect;
                                }
                                throw null;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i9 = component1 + 45;
                            ShareDataUIState = i9 % 128;
                            int i10 = i9 % 2;
                            return unit;
                        }

                        private static void a(int i7, int[] iArr, Object[] objArr) throws Throwable {
                            int[] iArr2;
                            int i8 = 2;
                            int i9 = 2 % 2;
                            getActiveNotifications getactivenotifications = new getActiveNotifications();
                            char[] cArr = new char[4];
                            char[] cArr2 = new char[iArr.length * 2];
                            int[] iArr3 = component2;
                            char c2 = '0';
                            int i10 = 684241640;
                            int i11 = 1;
                            int i12 = 0;
                            if (iArr3 != null) {
                                int length = iArr3.length;
                                int[] iArr4 = new int[length];
                                int i13 = 0;
                                while (i13 < length) {
                                    int i14 = $10 + 13;
                                    $11 = i14 % 128;
                                    int i15 = i14 % i8;
                                    try {
                                        Object[] objArr2 = new Object[1];
                                        objArr2[i12] = Integer.valueOf(iArr3[i13]);
                                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i10);
                                        if (objCopydefault == null) {
                                            int iResolveSizeAndState = 4391 - View.resolveSizeAndState(i12, i12, i12);
                                            int iLastIndexOf = TextUtils.lastIndexOf("", c2, i12) + 38;
                                            char threadPriority = (char) ((Process.getThreadPriority(i12) + 20) >> 6);
                                            byte b2 = $$c[i12];
                                            byte b3 = (byte) (b2 - 1);
                                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, iLastIndexOf, threadPriority, -309236339, false, $$e(b3, b3, b2), new Class[]{Integer.TYPE});
                                        }
                                        iArr4[i13] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                                        i13++;
                                        i8 = 2;
                                        c2 = '0';
                                        i10 = 684241640;
                                        i12 = 0;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                int i16 = $11 + 37;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                iArr3 = iArr4;
                            }
                            int length2 = iArr3.length;
                            int[] iArr5 = new int[length2];
                            int[] iArr6 = component2;
                            long j = 0;
                            if (iArr6 != null) {
                                int length3 = iArr6.length;
                                int[] iArr7 = new int[length3];
                                int i18 = 0;
                                while (i18 < length3) {
                                    int i19 = $10 + 95;
                                    $11 = i19 % 128;
                                    int i20 = i19 % 2;
                                    Object[] objArr3 = new Object[i11];
                                    objArr3[0] = Integer.valueOf(iArr6[i18]);
                                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                                    if (objCopydefault2 == null) {
                                        byte b4 = $$c[0];
                                        byte b5 = (byte) (b4 - 1);
                                        iArr2 = iArr6;
                                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4392 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 36, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), -309236339, false, $$e(b5, b5, b4), new Class[]{Integer.TYPE});
                                    } else {
                                        iArr2 = iArr6;
                                    }
                                    iArr7[i18] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                                    i18++;
                                    int i21 = $11 + 83;
                                    $10 = i21 % 128;
                                    int i22 = i21 % 2;
                                    iArr6 = iArr2;
                                    j = 0;
                                    i11 = 1;
                                }
                                iArr6 = iArr7;
                            }
                            System.arraycopy(iArr6, 0, iArr5, 0, length2);
                            getactivenotifications.component1 = 0;
                            int i23 = $10 + 111;
                            $11 = i23 % 128;
                            int i24 = i23 % 2;
                            while (getactivenotifications.component1 < iArr.length) {
                                int i25 = $11 + 41;
                                $10 = i25 % 128;
                                int i26 = i25 % 2;
                                cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
                                cArr[1] = (char) iArr[getactivenotifications.component1];
                                cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
                                cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
                                getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
                                getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
                                getActiveNotifications.component2(iArr5);
                                for (int i27 = 0; i27 < 16; i27++) {
                                    getactivenotifications.ShareDataUIState ^= iArr5[i27];
                                    try {
                                        Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                                        if (objCopydefault3 == null) {
                                            byte b6 = (byte) ($$c[0] - 1);
                                            byte b7 = b6;
                                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2969, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 49872), 462826032, false, $$e(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                        }
                                        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                                        getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                                        getactivenotifications.component2 = iIntValue;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                }
                                int i28 = getactivenotifications.ShareDataUIState;
                                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                                getactivenotifications.component2 = i28;
                                getactivenotifications.component2 ^= iArr5[16];
                                getactivenotifications.ShareDataUIState ^= iArr5[17];
                                int i29 = getactivenotifications.ShareDataUIState;
                                int i30 = getactivenotifications.component2;
                                cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
                                cArr[1] = (char) getactivenotifications.ShareDataUIState;
                                cArr[2] = (char) (getactivenotifications.component2 >>> 16);
                                cArr[3] = (char) getactivenotifications.component2;
                                getActiveNotifications.component2(iArr5);
                                cArr2[getactivenotifications.component1 * 2] = cArr[0];
                                cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
                                cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
                                cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
                                Object[] objArr5 = {getactivenotifications, getactivenotifications};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
                                if (objCopydefault4 == null) {
                                    int defaultSize = 2944 - View.getDefaultSize(0, 0);
                                    int iCombineMeasuredStates = 24 - View.combineMeasuredStates(0, 0);
                                    char gidForName = (char) (27636 - Process.getGidForName(""));
                                    byte b8 = (byte) ($$c[0] - 1);
                                    byte b9 = b8;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iCombineMeasuredStates, gidForName, -1616366948, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objCopydefault4).invoke(null, objArr5);
                            }
                            objArr[0] = new String(cArr2, 0, i7);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(31:0|2|104|3|4|5|6|(1:8)(1:9)|10|11|12|(2:14|15)(1:16)|17|18|(1:(4:20|21|22|(1:24)(3:115|25|(1:IC)(1:28)))(1:114))|29|31|106|32|(1:34)|35|36|(5:111|37|38|39|40)|(1:42)(4:43|112|44|(7:46|47|110|53|(2:55|(5:71|(2:73|(1:75))(5:76|108|77|78|(0)(1:81))|88|(1:90)(1:91)|92)(3:88|(0)(0)|92))(10:58|59|102|60|61|(3:63|64|65)(1:66)|67|68|69|(0)(0))|93|94)(1:48))|52|110|53|(0)(0)|93|94|(1:(0))) */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x03eb  */
                        /* JADX WARN: Removed duplicated region for block: B:58:0x03f9 A[Catch: Exception -> 0x05a8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x05a8, blocks: (B:53:0x03c6, B:71:0x04ac, B:76:0x053e, B:78:0x0570, B:83:0x0599, B:84:0x059f, B:58:0x03f9, B:69:0x04a4, B:86:0x05a1, B:87:0x05a7, B:60:0x0410, B:64:0x0441, B:68:0x0492, B:77:0x0548), top: B:110:0x03c6, inners: #0, #3 }] */
                        /* JADX WARN: Removed duplicated region for block: B:71:0x04ac A[Catch: Exception -> 0x05a8, TRY_LEAVE, TryCatch #4 {Exception -> 0x05a8, blocks: (B:53:0x03c6, B:71:0x04ac, B:76:0x053e, B:78:0x0570, B:83:0x0599, B:84:0x059f, B:58:0x03f9, B:69:0x04a4, B:86:0x05a1, B:87:0x05a7, B:60:0x0410, B:64:0x0441, B:68:0x0492, B:77:0x0548), top: B:110:0x03c6, inners: #0, #3 }] */
                        /* JADX WARN: Removed duplicated region for block: B:88:0x05a8  */
                        /* JADX WARN: Removed duplicated region for block: B:90:0x05c3  */
                        /* JADX WARN: Removed duplicated region for block: B:91:0x05c9  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public static java.lang.Object[] component3(int r28, int r29) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 1948
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity$observer$3$1$invokeSuspend$$inlined$map$1.component3(int, int):java.lang.Object[]");
                        }
                    });
                    final HomePreviewActivity homePreviewActivity = this.component3;
                    this.component2 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int component2 = 0;
                        private static int component3 = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i7 = 2 % 2;
                            int i8 = component2 + 5;
                            component3 = i8 % 128;
                            int i9 = i8 % 2;
                            Object objComponent2 = component2((LocalHomeTheme) obj2, continuation);
                            int i10 = component2 + 63;
                            component3 = i10 % 128;
                            int i11 = i10 % 2;
                            return objComponent2;
                        }

                        public final Object component2(LocalHomeTheme localHomeTheme, Continuation<? super Unit> continuation) {
                            int i7 = 2 % 2;
                            int i8 = component3 + 117;
                            int i9 = i8 % 128;
                            component2 = i9;
                            int i10 = i8 % 2;
                            if (localHomeTheme != null) {
                                int i11 = i9 + 125;
                                component3 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    HomePreviewActivity.access$updateView(homePreviewActivity, localHomeTheme);
                                } else {
                                    HomePreviewActivity.access$updateView(homePreviewActivity, localHomeTheme);
                                    throw null;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomePreviewActivity homePreviewActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component3 = homePreviewActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3, continuation);
                int i2 = copydefault + 99;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    copydefault(coroutineScope2, continuation2);
                    throw null;
                }
                Object objCopydefault = copydefault(coroutineScope2, continuation2);
                int i3 = copydefault + 47;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 49;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 41;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = null;
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(HomePreviewActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(HomePreviewActivity.this, null), this) == coroutine_suspended) {
                    int i5 = component3 + 121;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = copydefault + 99;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = HomePreviewActivity.this.new ShareDataUIState(continuation);
            int i2 = component3 + 77;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 70 / 0;
            }
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = component3 + 99;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 123;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $10 + 89;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $11 + 27;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4036 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.getOffsetBefore("", 0) + 31, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 19181), 1912513118, false, $$r(b2, (byte) (b2 | Ascii.DLE), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.indexOf("", "", 0), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 2459, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, (char) TextUtils.getOffsetAfter("", 0), 931716605, false, $$r(b3, (byte) (b3 | 17), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - KeyEvent.keyCodeFromString(""), 11 - Color.alpha(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomePreviewActivity$HomePreviewExecuteHandler;", "Lcom/huawei/arouter/executehandler/ExecuteHandler;", "<init>", "()V", "handleRequest", "", "router", "Lcom/huawei/arouter/Router;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomePreviewExecuteHandler extends ExecuteHandler {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;

        static {
            int i = 1 + 79;
            component1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override
        public void handleRequest(Router router) {
            int i = 2 % 2;
            int i2 = component2 + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(router, "");
            int i4 = component2 + 45;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void g(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component2;
        long j = 0;
        if (cArr2 != null) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 14 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.indexOf("", "", 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i10 = $11 + 17;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3579, TextUtils.getOffsetAfter("", 0) + 28, (char) TextUtils.indexOf("", ""), 1180380354, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4502, 35 - ImageFormat.getBitsPerPixel(0), (char) (ExpandableListView.getPackedPositionChild(0L) + 27898), -1464227204, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 1860, ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 80302927, false, $$r(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 71;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i16 = $11 + 27;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i18 = $10 + 43;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        char c2;
        int i;
        int i2 = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(new char[]{16557, 39083, 46768, 57996, 44186, 34544, 42251, 17170, 37998, 44689, 25221, 54979, 13610, 60701, 62798, 43796, 27152, 58880}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 32, new char[]{3183, 2583, 48353, 47819}, (char) (TextUtils.getOffsetBefore("", 0) + 52671), new char[]{19782, 32892, 49015, 55757}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(new byte[]{0, 1, 0, 0, 0}, new int[]{0, 5, 16, 0}, true, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{5, 26, 28, 0}, true, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{31, 18, 0, 0}, false, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i3 = getRequestBeneficiariesState + 95;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6618, (KeyEvent.getMaxKeyCode() >> 16) + 42, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(new byte[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0}, new int[]{49, 48, 0, 0}, false, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(new char[]{34358, 18176, 30167, 6895, 5739, 18681, 20021, 10135, 51630, 45832, 16284, 22071, 43704, 27807, 61291, 57021, 31380, 55008, 65210, 30153, 37192, 52803, 60904, 38250, 42754, 9555, 52475, 50115, 49359, 2731, 25369, 56612, 435, 61306, 7659, 35432, 63238, 7374, 63638, 29153, 35057, 9261, 8869, 20337, 26422, 41477, 39627, 55026, 58882, 37950, 687, 34381, 31154, 11492, 40080, 13856, 32315, 51568, 19987, 9840, 61787, 58595, 46980, 47196}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 105, new char[]{3183, 2583, 48353, 47819}, (char) ((Process.getThreadPriority(0) + 20) >> 6), new char[]{21444, 46398, 14813, 44440}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(new byte[]{0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0}, new int[]{97, 64, 161, 0}, true, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0}, new int[]{161, 72, 0, 0}, true, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(new byte[]{1, 1, 1, 1, 0, 1}, new int[]{233, 6, 24, 0}, false, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(new byte[]{0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{239, 36, 71, 24}, true, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 6562, Color.argb(0, 0, 0, 0) + 56, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h(bArr[31], (byte) 96, bArr[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2405 - Color.blue(0), MotionEvent.axisFromString("") + 27, (char) (AndroidCharacter.getMirror('0') - '0'), -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2405;
                int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                h(bArr2[31], (byte) 93, bArr2[8], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, absoluteGravity, packedPositionChild, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
            i = 0;
            c2 = 2;
        } else {
            Object[] objArr15 = new Object[1];
            f(new char[]{18442, 53906, 18237, 31145, 10012, 38518, 9036, 20222, 53494, 65048, 54524, 20550, 51473, 35089, 37758, 56846}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) + SecLiteException.ERROR_API_KEY_OR_SIGN, new char[]{3183, 2583, 48353, 47819}, (char) (View.resolveSizeAndState(0, 0, 0) + 17261), new char[]{46831, 15693, 28048, 29251}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(new char[]{34586, 2374, 59913, 27410, 32994, 18356, 39039, 48258, 40027, 39136, 3350, 22008, 32810, 6323, 28529, 57674}, ViewConfiguration.getEdgeSlop() >> 16, new char[]{3183, 2583, 48353, 47819}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) + 32954), new char[]{19567, 39531, 9932, 49793}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = getRequestBeneficiariesState + 59;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 702563631};
                byte[] bArr3 = $$j;
                byte b2 = bArr3[17];
                byte b3 = (byte) (b2 - 1);
                byte b4 = b2;
                Object[] objArr18 = new Object[1];
                i(b3, b4, (byte) (b4 - 1), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b5 = bArr3[17];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr19 = new Object[1];
                i(b5, b6, b6, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2405;
                    int iAlpha = 26 - Color.alpha(0);
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    h(bArr4[31], (byte) 93, bArr4[8], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iAlpha, tapTimeout, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{275, 22, 64, 11}, true, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(new char[]{49183, 64491, 24615, 1604, 23624, 63466, 63266, 41359, 23840, 7026, 60337, 51118, 49214, 22383, 9240}, Color.blue(0) - 234805509, new char[]{3183, 2583, 48353, 47819}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) + 43103), new char[]{64325, 294, 32754, 25000}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2405;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC;
                        char cMyTid = (char) (Process.myTid() >> 22);
                        byte[] bArr5 = $$d;
                        byte b7 = bArr5[33];
                        Object[] objArr23 = new Object[1];
                        h(b7, (byte) (b7 | 84), (byte) (-bArr5[38]), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, modifierMetaStateMask, cMyTid, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2405;
                        int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char c3 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        byte[] bArr6 = $$d;
                        Object[] objArr24 = new Object[1];
                        h(bArr6[31], (byte) 96, bArr6[33], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, iMakeMeasureSpec, c3, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i7 = component1 + 55;
                    getRequestBeneficiariesState = i7 % 128;
                    c2 = 2;
                    int i8 = i7 % 2;
                    i = 0;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i9 = ((int[]) objArr[i])[i];
        int i10 = ((int[]) objArr[c2])[i];
        if (i10 != i9) {
            long j = -1;
            long j2 = 0;
            long j3 = (((((long) i) << 32) | (j - ((j >> 63) << 32))) & ((long) (i10 ^ i9))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myPid() >> 22), 41 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {277806110, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 6562, MotionEvent.axisFromString("") + 57, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                byte b8 = $$j[17];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr26 = new Object[1];
                i(b8, b9, b9, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        HomePreviewExecuteHandler homePreviewExecuteHandler = new HomePreviewExecuteHandler();
        this.homeExecuteHandler = homePreviewExecuteHandler;
        RouteUtils.addFirstExecuteHandler(homePreviewExecuteHandler);
        ((ActivityHomeBinding) this.binding).viewPager2.setOffscreenPageLimit(3);
        ((ActivityHomeBinding) this.binding).viewPager2.setUserInputEnabled(false);
        ((ActivityHomeBinding) this.binding).viewPager2.setAdapter(getAdapter());
        ((ActivityHomeBinding) this.binding).viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            private static final byte[] $$a = {TarHeader.LF_NORMAL, 86, 58, 71};
            private static final int $$b = 102;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int component1 = 0;
            private static int equals = 1;
            private static char[] ShareDataUIState = {33535, 33416, 33462, 33460, 33455, 33459, 33465, 33437, 33517, 33419, 33468, 33460, 33457, 33430, 33506, 33433, 33504, 33416, 33462, 33460, 33455, 33459, 33465, 33431, 33512, 33439, 33430, 33419, 33428, 33431, 33434, 33514, 33466, 33460, 33460, 33459, 33420, 33423, 33459, 33467, 33459, 33452, 33458, 33457, 33449, 33420, 33432, 33460, 33451, 33457, 33428, 33420, 33417, 33517, 33519, 33520, 33436, 33433, 33517, 33519, 33439, 33470, 33458, 33460, 33463, 33465, 33459, 33463, 33465, 33507, 33457, 33459, 33454, 33457, 33414, 33511, 33422, 33454, 33462, 33459, 33454, 33457, 33462, 33431, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33461, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33431, 33462, 33457, 33454, 33459, 33462, 33454, 33422, 33424, 33457, 33426, 33504, 33415, 33469, 33464, 33465, 33467, 33465, 33414, 33416, 33464, 33464, 33467, 33465, 33460, 33510, 33457, 33463, 33461, 33464, 33461, 33451, 33452, 33460, 33459, 33419, 33355, 33373, 33372, 33370, 33516, 33465, 33462, 33462, 33460, 33462, 33461, 33459, 33419, 33419, 33460, 33452, 33457, 33464, 33464, 33465, 33469, 33461, 33459};
            private static char[] copydefault = {3125, 56502, 44505, 32466, 20398, 6344, 59813, 47836, 35824, 21751, 9702, 63174, 51139, 37067, 24972, 13030, 1000, 60550, 48637, 36575, 24534, 10437, 63911, 51876, 39850, 25827, 13696, 1724, 55224, 41130, 29111, 3089, 56558, 44536, 32465, 20451, 6372, 59891, 47868, 35833, 21750, 9689, 63176, 51140, 37070, 25031, 12992, 980, 3089, 56558, 44536, 32465, 20451, 6372, 59891, 47868, 35833, 21750, 9690, 63176, 51143, 37066, 3089, 56558, 44536, 32465, 20451, 6372, 59891, 47868, 35833, 21750, 9693, 63175, 51148, 37056, 2171, 55433, 43396, 31391, 19329, 7298, 60816, 48863, 36753, 20624, 8598, 62129, 50083, 38061, 26040, 14055, 1978, 59578, 47614, 35469, 23487, 11448, 64975, 52928, 40901, 24778, 12769, 731, 54224, 42204, 3100, 56554, 44538, 32480, 20396, 6388, 59901, 47870, 35819, 21729, 9725, 63197, 51155, 36993, 25027, 12992, 980, 60623, 48530, 36594, 24535, 10437, 63932, 51876, 39848, 25770, 13735, 1720, 55214, 41146, 29078, 17076, 5045, 64671, 52611, 40595, 28571, 3089, 56558, 44536, 32456, 20460, 6388, 59884, 47868, 35824, 21744, 9713, 50794, 5784, 26517, 46222, 34192, 53907, 9089, 28878, 16768, 40577, 61319, 15520, 3506, 23228, 43945, 63734, 51627, 9899, 30703, 17567, 38310, 58029, 13275, 209, 20935, 44747, 65483, 52417, 3074, 56548, 44494, 32504, 20470, 6370, 59865, 47855, 35820, 21746, 9709, 23837, 36331, 64763, 12257, 7853, 18933, 47356, 60415, 56042, 1504, 29948, 42972, 38610, 49536, 12482, 25537, 21205, 48590, 60563, 57320, 3718, 31110, 43248, 39823, 51882, 13744, 25777, 22449, 34493, 61879, 8370, 5045, 17059, 44431, 3089, 56558, 44536, 32466, 20471, 6373, 59890, 47864, 35837, 21735, 9676, 63132, 51098, 37023, 25072, 13015, 975, 60629, 48607, 36568, 24514, 10454, 63908};
            private static long component3 = -1565482094655710069L;

            private static String $$c(byte b10, short s, int i11) {
                byte[] bArr7 = $$a;
                int i12 = b10 * 4;
                int i13 = 4 - (i11 * 2);
                int i14 = 122 - s;
                byte[] bArr8 = new byte[1 - i12];
                int i15 = 0 - i12;
                int i16 = -1;
                if (bArr7 == null) {
                    i13++;
                    i14 += -i15;
                }
                while (true) {
                    i16++;
                    bArr8[i16] = (byte) i14;
                    if (i16 == i15) {
                        return new String(bArr8, 0);
                    }
                    int i17 = bArr7[i13];
                    i13++;
                    i14 += -i17;
                }
            }

            @Override
            public void onPageSelected(int position) {
                int i11 = 2 % 2;
                int i12 = equals + 9;
                component1 = i12 % 128;
                int i13 = i12 % 2;
                super.onPageSelected(position);
                HomePreviewActivity.access$doSelect(HomePreviewActivity.this, position);
                int i14 = equals + 67;
                component1 = i14 % 128;
                if (i14 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void b(int i11, int i12, char c4, Object[] objArr27) throws Throwable {
                int i13 = 2;
                int i14 = 2 % 2;
                cancelNotification cancelnotification = new cancelNotification();
                long[] jArr = new long[i12];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i12) {
                    int i15 = $11 + 83;
                    $10 = i15 % 128;
                    if (i15 % i13 != 0) {
                        int i16 = cancelnotification.copydefault;
                        try {
                            Object[] objArr28 = {Integer.valueOf(copydefault[i11 / i16])};
                            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                            if (objCopydefault9 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = (byte) (b10 + 1);
                                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 1159210934, false, $$c(b10, b11, (byte) (b11 - 1)), new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr29 = {Long.valueOf(((Long) ((Method) objCopydefault9).invoke(null, objArr28)).longValue()), Long.valueOf(i16), Long.valueOf(component3), Integer.valueOf(c4)};
                                Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                                if (objCopydefault10 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = (byte) (b12 + 5);
                                    objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(3609 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 29 - Color.alpha(0), (char) ((Process.myTid() >> 22) + 7171), 1951385784, false, $$c(b12, b13, (byte) (b13 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i16] = ((Long) ((Method) objCopydefault10).invoke(null, objArr29)).longValue();
                                Object[] objArr30 = {cancelnotification, cancelnotification};
                                Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                                if (objCopydefault11 == null) {
                                    byte b14 = (byte) 0;
                                    byte b15 = b14;
                                    objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (char) (27760 - TextUtils.indexOf((CharSequence) "", '0')), -1529629956, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objCopydefault11).invoke(null, objArr30);
                            } catch (Throwable th5) {
                                Throwable cause4 = th5.getCause();
                                if (cause4 == null) {
                                    throw th5;
                                }
                                throw cause4;
                            }
                        } catch (Throwable th6) {
                            Throwable cause5 = th6.getCause();
                            if (cause5 == null) {
                                throw th6;
                            }
                            throw cause5;
                        }
                    } else {
                        int i17 = cancelnotification.copydefault;
                        Object[] objArr31 = {Integer.valueOf(copydefault[i11 + i17])};
                        Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                        if (objCopydefault12 == null) {
                            byte b16 = (byte) 0;
                            byte b17 = (byte) (b16 + 1);
                            objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(1758 - ExpandableListView.getPackedPositionType(0L), 34 - View.resolveSize(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 1159210934, false, $$c(b16, b17, (byte) (b17 - 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr32 = {Long.valueOf(((Long) ((Method) objCopydefault12).invoke(null, objArr31)).longValue()), Long.valueOf(i17), Long.valueOf(component3), Integer.valueOf(c4)};
                        Object objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault13 == null) {
                            byte b18 = (byte) 0;
                            byte b19 = (byte) (b18 + 5);
                            objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(3608 - Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, (char) (7171 - TextUtils.indexOf("", "", 0)), 1951385784, false, $$c(b18, b19, (byte) (b19 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i17] = ((Long) ((Method) objCopydefault13).invoke(null, objArr32)).longValue();
                        Object[] objArr33 = {cancelnotification, cancelnotification};
                        Object objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault14 == null) {
                            byte b20 = (byte) 0;
                            byte b21 = b20;
                            objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 4013, 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27761), -1529629956, false, $$c(b20, b21, b21), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault14).invoke(null, objArr33);
                    }
                    i13 = 2;
                }
                char[] cArr = new char[i12];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i12) {
                    int i18 = $10 + 27;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                        try {
                            Object[] objArr34 = {cancelnotification, cancelnotification};
                            Object objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                            if (objCopydefault15 == null) {
                                byte b22 = (byte) 0;
                                byte b23 = b22;
                                objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(4013 - View.resolveSizeAndState(0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, (char) (27761 - ExpandableListView.getPackedPositionType(0L)), -1529629956, false, $$c(b22, b23, b23), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault15).invoke(null, objArr34);
                            throw null;
                        } catch (Throwable th7) {
                            Throwable cause6 = th7.getCause();
                            if (cause6 == null) {
                                throw th7;
                            }
                            throw cause6;
                        }
                    }
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr35 = {cancelnotification, cancelnotification};
                    Object objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault16 == null) {
                        byte b24 = (byte) 0;
                        byte b25 = b24;
                        objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 4013, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$c(b24, b25, b25), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault16).invoke(null, objArr35);
                }
                String str6 = new String(cArr);
                int i19 = $11 + 77;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                objArr27[0] = str6;
            }

            private static void a(boolean z, int[] iArr, byte[] bArr7, Object[] objArr27) throws Throwable {
                int i11 = 2;
                int i12 = 2 % 2;
                ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
                int i13 = iArr[0];
                int i14 = iArr[1];
                int i15 = iArr[2];
                int i16 = iArr[3];
                char[] cArr = ShareDataUIState;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i17 = 0;
                    while (i17 < length) {
                        int i18 = $10 + 13;
                        $11 = i18 % 128;
                        int i19 = i18 % i11;
                        try {
                            Object[] objArr28 = {Integer.valueOf(cArr[i17])};
                            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                            if (objCopydefault9 == null) {
                                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 657, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, (char) (View.getDefaultSize(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                            }
                            cArr2[i17] = ((Character) ((Method) objCopydefault9).invoke(null, objArr28)).charValue();
                            i17++;
                            i11 = 2;
                        } catch (Throwable th5) {
                            Throwable cause4 = th5.getCause();
                            if (cause4 == null) {
                                throw th5;
                            }
                            throw cause4;
                        }
                    }
                    int i20 = $11 + 37;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i14];
                System.arraycopy(cArr, i13, cArr3, 0, i14);
                if (bArr7 != null) {
                    char[] cArr4 = new char[i14];
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    char c4 = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i14) {
                        if (bArr7[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                            int i22 = $11 + 13;
                            $10 = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = iTrustedWebActivityService_Parcel.copydefault;
                                Object[] objArr29 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c4)};
                                Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                if (objCopydefault10 == null) {
                                    byte b10 = (byte) 0;
                                    objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getTapTimeout() >> 16), MotionEvent.axisFromString("") + 37, (char) (27898 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1464227204, false, $$c(b10, (byte) (b10 | Ascii.FF), b10), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i23] = ((Character) ((Method) objCopydefault10).invoke(null, objArr29)).charValue();
                                int i24 = 38 / 0;
                            } else {
                                int i25 = iTrustedWebActivityService_Parcel.copydefault;
                                Object[] objArr30 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c4)};
                                Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                if (objCopydefault11 == null) {
                                    byte b11 = (byte) 0;
                                    objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 4502, View.getDefaultSize(0, 0) + 36, (char) (27897 - TextUtils.indexOf("", "", 0, 0)), -1464227204, false, $$c(b11, (byte) (b11 | Ascii.FF), b11), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i25] = ((Character) ((Method) objCopydefault11).invoke(null, objArr30)).charValue();
                            }
                        } else {
                            int i26 = iTrustedWebActivityService_Parcel.copydefault;
                            Object[] objArr31 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c4)};
                            Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                            if (objCopydefault12 == null) {
                                byte b12 = (byte) 0;
                                objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(3580 - Color.red(0), (ViewConfiguration.getScrollBarSize() >> 8) + 28, (char) Color.argb(0, 0, 0, 0), 1180380354, false, $$c(b12, (byte) (b12 | 7), b12), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i26] = ((Character) ((Method) objCopydefault12).invoke(null, objArr31)).charValue();
                        }
                        c4 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                        Object[] objArr32 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                        Object objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                        if (objCopydefault13 == null) {
                            byte b13 = (byte) 0;
                            objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 1859, (ViewConfiguration.getJumpTapTimeout() >> 16) + 34, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 80302927, false, $$c(b13, (byte) (b13 | 8), b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault13).invoke(null, objArr32);
                    }
                    cArr3 = cArr4;
                }
                if (i16 > 0) {
                    char[] cArr5 = new char[i14];
                    System.arraycopy(cArr3, 0, cArr5, 0, i14);
                    int i27 = i14 - i16;
                    System.arraycopy(cArr5, 0, cArr3, i27, i16);
                    System.arraycopy(cArr5, i16, cArr3, 0, i27);
                }
                if (!(!z)) {
                    int i28 = $10 + 25;
                    $11 = i28 % 128;
                    int i29 = i28 % 2;
                    char[] cArr6 = new char[i14];
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i14) {
                        int i30 = $10 + 117;
                        $11 = i30 % 128;
                        int i31 = i30 % 2;
                        cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i14 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                        iTrustedWebActivityService_Parcel.copydefault++;
                        int i32 = $11 + 5;
                        $10 = i32 % 128;
                        if (i32 % 2 != 0) {
                            int i33 = 5 % 5;
                        }
                    }
                    cArr3 = cArr6;
                }
                if (i15 > 0) {
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i14) {
                        cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                        iTrustedWebActivityService_Parcel.copydefault++;
                    }
                }
                objArr27[0] = new String(cArr3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0c28  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x0c48  */
            /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r0v185 */
            /* JADX WARN: Type inference failed for: r0v186 */
            /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v1, types: [int] */
            /* JADX WARN: Type inference failed for: r6v109, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v111 */
            /* JADX WARN: Type inference failed for: r6v122 */
            /* JADX WARN: Type inference failed for: r6v123 */
            /* JADX WARN: Type inference failed for: r6v124 */
            /* JADX WARN: Type inference failed for: r6v125 */
            /* JADX WARN: Type inference failed for: r6v15 */
            /* JADX WARN: Type inference failed for: r6v2 */
            /* JADX WARN: Type inference failed for: r6v3, types: [int] */
            /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Class<java.lang.String>] */
            /* JADX WARN: Type inference failed for: r6v32 */
            /* JADX WARN: Type inference failed for: r6v36, types: [int] */
            /* JADX WARN: Type inference failed for: r6v5 */
            /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v77 */
            /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v96 */
            /* JADX WARN: Type inference failed for: r7v82, types: [java.lang.Class[]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.Object[] ShareDataUIState(android.content.Context r32, int r33, int r34) {
                /*
                    Method dump skipped, instruction units count: 3424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.AnonymousClass1.ShareDataUIState(android.content.Context, int, int):java.lang.Object[]");
            }
        });
        ((HomeThemeViewModel) this.viewModel).previewTheme(new HomeThemePreviewParams(getIntent().getStringExtra("qrCode")));
        observer();
    }

    private final void observer() {
        int i = 2 % 2;
        HomePreviewActivity homePreviewActivity = this;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(homePreviewActivity), null, null, new component3(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(homePreviewActivity), null, null, new copydefault(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(homePreviewActivity), null, null, new ShareDataUIState(null), 3, null);
        int i2 = getRequestBeneficiariesState + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void updateView(LocalHomeTheme pageConfig) {
        int i = 2 % 2;
        Integer navigatorBackgroundColor = pageConfig.getNavigatorBackgroundColor();
        if (navigatorBackgroundColor != null) {
            int i2 = getRequestBeneficiariesState + 25;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                ((ActivityHomeBinding) this.binding).llNavigationParent.setBackgroundColor(navigatorBackgroundColor.intValue());
                throw null;
            }
            ((ActivityHomeBinding) this.binding).llNavigationParent.setBackgroundColor(navigatorBackgroundColor.intValue());
        }
        if (pageConfig.getNavigatorBackgroundUrl() != null) {
            int i3 = getRequestBeneficiariesState + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            GlideUtils.loadUrl(pageConfig.getNavigatorBackgroundUrl(), ((ActivityHomeBinding) this.binding).llNavigationBg);
        }
        getAdapter().setData(pageConfig.getPages());
        updateNavigation(pageConfig.getPages());
        doSelect(this.selectedPosition);
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        RouteUtils.removeExecuteHandler(this.homeExecuteHandler);
        int i4 = getRequestBeneficiariesState + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    private final void updateNavigation(List<LocalComponent> functions) {
        int i = 2 % 2;
        L l = L.INSTANCE;
        String str = this.TAG;
        Intrinsics.checkNotNullExpressionValue(str, "");
        l.d(str, "updateNavigation: " + functions, new Object[0]);
        List<LocalComponent> list = functions;
        if (list == null || list.isEmpty()) {
            ((ActivityHomeBinding) this.binding).llNavigation.setVisibility(8);
            int i2 = getRequestBeneficiariesState + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        ((ActivityHomeBinding) this.binding).llNavigation.setVisibility(0);
        ((ActivityHomeBinding) this.binding).llNavigation.removeAllViews();
        int size = list.size();
        for (final int i4 = 0; i4 < size; i4++) {
            LocalComponent localComponent = functions.get(i4);
            NavigationButton navigationButton = new NavigationButton(this.activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.gravity = 16;
            navigationButton.setLayoutParams(layoutParams);
            ((ActivityHomeBinding) this.binding).llNavigation.addView(navigationButton);
            navigationButton.init(localComponent.getPageIcon(), localComponent.getPageName(), localComponent);
            navigationButton.setOnClickListener(new View.OnClickListener() {
                private static int component1 = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view) {
                    int i5 = 2 % 2;
                    int i6 = component3 + 9;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    HomePreviewActivity.m10467$r8$lambda$4paxdxwjbAVXvBZtnGNDjHcPdE(this.f$0, i4, view);
                    int i8 = component3 + 93;
                    component1 = i8 % 128;
                    if (i8 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
        int i5 = getRequestBeneficiariesState + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void updateNavigation$lambda$1(HomePreviewActivity homePreviewActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 9;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(homePreviewActivity, "");
        } else {
            Intrinsics.checkNotNullParameter(homePreviewActivity, "");
        }
        ((ActivityHomeBinding) homePreviewActivity.binding).viewPager2.setCurrentItem(i, false);
        int i4 = component1 + 1;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    private final void doSelect(int index) {
        int i = 2 % 2;
        int childCount = ((ActivityHomeBinding) this.binding).llNavigation.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = component1 + 73;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            NavigationButton navigationButton = (NavigationButton) ((ActivityHomeBinding) this.binding).llNavigation.getChildAt(i2);
            if (navigationButton != null) {
                int i5 = component1 + 53;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                navigationButton.setSelected(index == i2);
            }
            i2++;
        }
        this.selectedPosition = index;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.homeui.R.layout.activity_home;
        int i5 = component1 + 65;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{5, 26, 28, 0}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{31, 18, 0, 0}, false, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = getRequestBeneficiariesState + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 75;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6618, TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) (ImageFormat.getBitsPerPixel(0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 56 - (Process.myTid() >> 22), (char) (MotionEvent.axisFromString("") + 1), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(8:882|18|(1:20)|21|22|23|(1:25)|26)(1:7))(0)|30|(7:880|31|(2:832|33)|37|(1:39)|40|41)|(35:(4:43|44|(1:46)|47)(63:48|(2:50|(1:57)(1:55))(1:58)|(21:60|61|847|62|860|63|(1:65)|66|67|848|68|(1:70)|71|72|73|(1:75)|76|(1:78)(1:79)|80|(1:82)|83)(50:133|148|875|149|(3:151|803|152)|156|157|868|(4:159|160|(1:162)|163)(19:165|166|852|167|(2:854|169)|173|174|837|175|(2:883|177)|181|182|183|(1:185)|186|(2:188|189)|190|(1:192)|193)|194|(4:197|(2:199|910)(11:200|(3:202|(3:205|206|203)|911)|207|826|208|(1:210)|211|212|822|213|909)|214|195)|908|226|227|(3:844|258|(1:264)(1:263))(1:268)|269|818|270|(1:272)|273|814|274|(1:276)|277|301|878|302|(2:816|304)|308|309|(5:311|312|(1:314)|315|316)(22:317|318|877|319|320|864|321|(1:323)|324|325|850|326|(1:328)|329|330|331|(1:333)|334|(1:336)(1:337)|338|(1:340)|341)|342|(4:345|(2:347|895)(11:348|(3:350|(3:353|354|351)|896)|355|839|356|(1:358)|359|360|830|361|894)|362|343)|893|400|813|401|(1:403)|404|(3:406|(1:408)|409)(14:411|412|805|413|(1:415)|416|417|418|(1:420)|421|(1:423)|424|(1:426)|427)|410|428|(9:431|799|432|(1:434)|435|436|437|792|438)|439|468|(1:470)|471|(3:473|(1:475)|476)(14:477|478|(1:480)|481|482|(1:484)|485|790|486|487|(1:489)|490|(1:492)|493)|494|(27:496|(1:498)|499|(1:501)|502|(3:504|(1:506)|507)(16:509|510|(1:512)|513|(1:515)|516|517|(1:519)|520|811|521|522|(1:524)|525|(1:527)|528)|508|529|(1:531)(9:532|(3:534|(4:537|(3:903|539|906)(3:902|540|905)|904|535)|901)|541|542|(1:544)|545|(1:547)|548|549)|550|797|551|(15:807|553|557|558|795|559|(2:801|561)|565|566|794|(4:568|569|(1:571)|572)(4:573|(2:575|(1:581)(1:580))|(19:583|584|885|585|(2:887|587)|591|592|873|593|(2:809|595)|599|600|601|(2:603|604)|605|(2:607|608)|609|(2:611|612)|613)|663)|614|(6:619|620|(2:622|899)(11:623|(3:625|(3:628|629|626)|900)|630|858|631|(1:633)|634|635|842|636|898)|637|615|616)|897|663)(13:557|558|795|559|(0)|565|566|794|(0)(0)|614|(2:615|616)|897|663)|680|(1:682)|683|(3:685|(1:687)|688)(13:690|820|691|692|(1:694)|695|869|696|697|(1:699)|700|(1:702)|703)|689|704|(6:707|708|(1:710)|711|712|713)|714|(1:716)|717|(3:719|(1:721)|722)(14:724|725|(1:727)|728|729|(1:731)|732|856|733|734|(1:736)|737|(1:739)|740)|723|741|(1:912)(7:744|745|(1:747)|748|749|750|751))(10:763|(3:765|(2:768|766)|907)|769|770|(1:772)|773|(1:775)|776|777|778))|136|137|862|138|141|142|(1:144)|145|146|841|147|148|875|149|(0)|156|157|868|(0)(0)|194|(1:195)|908|226|227|(0)(0)|269|818|270|(0)|273|814|274|(0)|277|301|878|302|(0)|308|309|(0)(0)|342|(1:343)|893|400|813|401|(0)|404|(0)(0)|410|428|(0)|439|468|(0)|471|(0)(0)|494|(0)(0))|818|270|(0)|273|814|274|(0)|277|301|878|302|(0)|308|309|(0)(0)|342|(1:343)|893|400|813|401|(0)|404|(0)(0)|410|428|(0)|439|468|(0)|471|(0)(0)|494|(0)(0))|84|(4:87|(13:89|(3:91|94|891)|95|(3:97|(3:100|101|98)|892)|102|835|103|(1:105)|106|107|828|108|890)(2:92|(2:94|891)(11:95|(0)|102|835|103|(0)|106|107|828|108|890))|109|85)|889|148|875|149|(0)|156|157|868|(0)(0)|194|(1:195)|908|226|227|(0)(0)|269|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:(4:43|44|(1:46)|47)(63:48|(2:50|(1:57)(1:55))(1:58)|(21:60|61|847|62|860|63|(1:65)|66|67|848|68|(1:70)|71|72|73|(1:75)|76|(1:78)(1:79)|80|(1:82)|83)(50:133|148|875|149|(3:151|803|152)|156|157|868|(4:159|160|(1:162)|163)(19:165|166|852|167|(2:854|169)|173|174|837|175|(2:883|177)|181|182|183|(1:185)|186|(2:188|189)|190|(1:192)|193)|194|(4:197|(2:199|910)(11:200|(3:202|(3:205|206|203)|911)|207|826|208|(1:210)|211|212|822|213|909)|214|195)|908|226|227|(3:844|258|(1:264)(1:263))(1:268)|269|818|270|(1:272)|273|814|274|(1:276)|277|301|878|302|(2:816|304)|308|309|(5:311|312|(1:314)|315|316)(22:317|318|877|319|320|864|321|(1:323)|324|325|850|326|(1:328)|329|330|331|(1:333)|334|(1:336)(1:337)|338|(1:340)|341)|342|(4:345|(2:347|895)(11:348|(3:350|(3:353|354|351)|896)|355|839|356|(1:358)|359|360|830|361|894)|362|343)|893|400|813|401|(1:403)|404|(3:406|(1:408)|409)(14:411|412|805|413|(1:415)|416|417|418|(1:420)|421|(1:423)|424|(1:426)|427)|410|428|(9:431|799|432|(1:434)|435|436|437|792|438)|439|468|(1:470)|471|(3:473|(1:475)|476)(14:477|478|(1:480)|481|482|(1:484)|485|790|486|487|(1:489)|490|(1:492)|493)|494|(27:496|(1:498)|499|(1:501)|502|(3:504|(1:506)|507)(16:509|510|(1:512)|513|(1:515)|516|517|(1:519)|520|811|521|522|(1:524)|525|(1:527)|528)|508|529|(1:531)(9:532|(3:534|(4:537|(3:903|539|906)(3:902|540|905)|904|535)|901)|541|542|(1:544)|545|(1:547)|548|549)|550|797|551|(15:807|553|557|558|795|559|(2:801|561)|565|566|794|(4:568|569|(1:571)|572)(4:573|(2:575|(1:581)(1:580))|(19:583|584|885|585|(2:887|587)|591|592|873|593|(2:809|595)|599|600|601|(2:603|604)|605|(2:607|608)|609|(2:611|612)|613)|663)|614|(6:619|620|(2:622|899)(11:623|(3:625|(3:628|629|626)|900)|630|858|631|(1:633)|634|635|842|636|898)|637|615|616)|897|663)(13:557|558|795|559|(0)|565|566|794|(0)(0)|614|(2:615|616)|897|663)|680|(1:682)|683|(3:685|(1:687)|688)(13:690|820|691|692|(1:694)|695|869|696|697|(1:699)|700|(1:702)|703)|689|704|(6:707|708|(1:710)|711|712|713)|714|(1:716)|717|(3:719|(1:721)|722)(14:724|725|(1:727)|728|729|(1:731)|732|856|733|734|(1:736)|737|(1:739)|740)|723|741|(1:912)(7:744|745|(1:747)|748|749|750|751))(10:763|(3:765|(2:768|766)|907)|769|770|(1:772)|773|(1:775)|776|777|778))|136|137|862|138|141|142|(1:144)|145|146|841|147|148|875|149|(0)|156|157|868|(0)(0)|194|(1:195)|908|226|227|(0)(0)|269|818|270|(0)|273|814|274|(0)|277|301|878|302|(0)|308|309|(0)(0)|342|(1:343)|893|400|813|401|(0)|404|(0)(0)|410|428|(0)|439|468|(0)|471|(0)(0)|494|(0)(0))|814|274|(0)|277|301|878|302|(0)|308|309|(0)(0)|342|(1:343)|893|400|813|401|(0)|404|(0)(0)|410|428|(0)|439|468|(0)|471|(0)(0)|494|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0e0f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0e11, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0e12, code lost:
    
        r11 = r8;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0e14, code lost:
    
        r1 = r0;
        r11 = r11;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x1598, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x1599, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x1a42, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x1a43, code lost:
    
        r7 = new java.lang.Object[1];
        g(new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}, new int[]{372, 11, 0, 0}, true, r7);
        r2 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x1a5e, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x1a75, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x1a79, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r8 = r11;
        r10 = -1;
        r12 = 0;
        r1 = ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32))) | (((long) 1) & ((r10 - ((r10 >> 63) << 32)) | (((long) 0) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x1aaa, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x1aae, code lost:
    
        if (r6 == null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x1ab0, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 6617, 43 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x1adc, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x1ae4, code lost:
    
        r10 = new java.lang.Object[]{1600993393, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.Process.myPid() >> 22) + 6562, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0)));
        r2 = com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.$$j[17];
        r3 = (byte) (r2 - 1);
        r11 = new java.lang.Object[1];
        i(r2, r3, r3, r11);
        r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r10);
        r15 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07b1 A[Catch: all -> 0x0875, TryCatch #24 {all -> 0x0875, blocks: (B:103:0x07ab, B:105:0x07b1, B:106:0x07db), top: B:835:0x07ab, outer: #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0945 A[Catch: all -> 0x031a, TryCatch #50 {all -> 0x031a, blocks: (B:250:0x0eaf, B:252:0x0eb5, B:253:0x0ee4, B:674:0x2b1a, B:676:0x2b20, B:677:0x2b4e, B:708:0x2e63, B:710:0x2e69, B:711:0x2e93, B:745:0x31a5, B:747:0x31ab, B:748:0x31ce, B:725:0x2fdd, B:727:0x3000, B:728:0x3057, B:542:0x2424, B:544:0x242a, B:545:0x245a, B:547:0x2494, B:548:0x24db, B:510:0x20ba, B:512:0x20cf, B:513:0x20ff, B:515:0x2133, B:516:0x21b0, B:770:0x32a1, B:772:0x32a7, B:773:0x32cd, B:775:0x3307, B:776:0x3351, B:478:0x1c97, B:480:0x1cac, B:481:0x1ce1, B:462:0x1aaa, B:464:0x1ab0, B:465:0x1adc, B:394:0x1640, B:396:0x1646, B:397:0x1670, B:295:0x10c3, B:297:0x10c9, B:298:0x10f1, B:142:0x093f, B:144:0x0945, B:145:0x0969, B:18:0x01a1, B:20:0x01a7, B:21:0x01cd, B:23:0x0287, B:25:0x02b9, B:26:0x0314), top: B:882:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a9d A[Catch: all -> 0x0e11, TRY_ENTER, TRY_LEAVE, TryCatch #46 {all -> 0x0e11, blocks: (B:149:0x09ed, B:156:0x0a39, B:194:0x0cc6, B:195:0x0cca, B:197:0x0cd0, B:200:0x0cea, B:165:0x0a9d, B:183:0x0bad, B:186:0x0bf5, B:190:0x0c64, B:193:0x0cc0), top: B:875:0x09ed }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0cd0 A[Catch: all -> 0x0e11, TryCatch #46 {all -> 0x0e11, blocks: (B:149:0x09ed, B:156:0x0a39, B:194:0x0cc6, B:195:0x0cca, B:197:0x0cd0, B:200:0x0cea, B:165:0x0a9d, B:183:0x0bad, B:186:0x0bf5, B:190:0x0c64, B:193:0x0cc0), top: B:875:0x09ed }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0eb5 A[Catch: all -> 0x031a, TryCatch #50 {all -> 0x031a, blocks: (B:250:0x0eaf, B:252:0x0eb5, B:253:0x0ee4, B:674:0x2b1a, B:676:0x2b20, B:677:0x2b4e, B:708:0x2e63, B:710:0x2e69, B:711:0x2e93, B:745:0x31a5, B:747:0x31ab, B:748:0x31ce, B:725:0x2fdd, B:727:0x3000, B:728:0x3057, B:542:0x2424, B:544:0x242a, B:545:0x245a, B:547:0x2494, B:548:0x24db, B:510:0x20ba, B:512:0x20cf, B:513:0x20ff, B:515:0x2133, B:516:0x21b0, B:770:0x32a1, B:772:0x32a7, B:773:0x32cd, B:775:0x3307, B:776:0x3351, B:478:0x1c97, B:480:0x1cac, B:481:0x1ce1, B:462:0x1aaa, B:464:0x1ab0, B:465:0x1adc, B:394:0x1640, B:396:0x1646, B:397:0x1670, B:295:0x10c3, B:297:0x10c9, B:298:0x10f1, B:142:0x093f, B:144:0x0945, B:145:0x0969, B:18:0x01a1, B:20:0x01a7, B:21:0x01cd, B:23:0x0287, B:25:0x02b9, B:26:0x0314), top: B:882:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0f97 A[Catch: all -> 0x1055, TryCatch #15 {all -> 0x1055, blocks: (B:270:0x0f82, B:272:0x0f97, B:273:0x0fc7), top: B:818:0x0f82, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0fda A[Catch: all -> 0x104b, TryCatch #13 {all -> 0x104b, blocks: (B:274:0x0fcd, B:276:0x0fda, B:277:0x1043), top: B:814:0x0fcd, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x11e0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x123a A[Catch: all -> 0x1598, TRY_ENTER, TRY_LEAVE, TryCatch #48 {all -> 0x1598, blocks: (B:302:0x117c, B:308:0x11d3, B:317:0x123a), top: B:878:0x117c }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1469 A[Catch: all -> 0x1596, TryCatch #47 {all -> 0x1596, blocks: (B:342:0x145f, B:343:0x1463, B:345:0x1469, B:348:0x1483, B:351:0x1490, B:353:0x1493, B:365:0x1570, B:367:0x1576, B:368:0x1577, B:370:0x1579, B:372:0x1580, B:373:0x1581, B:319:0x1247, B:331:0x1335, B:333:0x133b, B:334:0x1380, B:336:0x13aa, B:338:0x13f6, B:340:0x140d, B:341:0x1457, B:375:0x1583, B:377:0x158a, B:378:0x158b, B:380:0x158d, B:382:0x1594, B:383:0x1595, B:361:0x14f7, B:356:0x14c2, B:358:0x14c8, B:359:0x14ef, B:326:0x12ab, B:328:0x12c0, B:329:0x1329, B:321:0x125b, B:323:0x1270, B:324:0x12a4), top: B:877:0x1247, inners: #21, #26, #33, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x1646 A[Catch: all -> 0x031a, TryCatch #50 {all -> 0x031a, blocks: (B:250:0x0eaf, B:252:0x0eb5, B:253:0x0ee4, B:674:0x2b1a, B:676:0x2b20, B:677:0x2b4e, B:708:0x2e63, B:710:0x2e69, B:711:0x2e93, B:745:0x31a5, B:747:0x31ab, B:748:0x31ce, B:725:0x2fdd, B:727:0x3000, B:728:0x3057, B:542:0x2424, B:544:0x242a, B:545:0x245a, B:547:0x2494, B:548:0x24db, B:510:0x20ba, B:512:0x20cf, B:513:0x20ff, B:515:0x2133, B:516:0x21b0, B:770:0x32a1, B:772:0x32a7, B:773:0x32cd, B:775:0x3307, B:776:0x3351, B:478:0x1c97, B:480:0x1cac, B:481:0x1ce1, B:462:0x1aaa, B:464:0x1ab0, B:465:0x1adc, B:394:0x1640, B:396:0x1646, B:397:0x1670, B:295:0x10c3, B:297:0x10c9, B:298:0x10f1, B:142:0x093f, B:144:0x0945, B:145:0x0969, B:18:0x01a1, B:20:0x01a7, B:21:0x01cd, B:23:0x0287, B:25:0x02b9, B:26:0x0314), top: B:882:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x16f7 A[Catch: all -> 0x1a42, TryCatch #12 {all -> 0x1a42, blocks: (B:401:0x16f1, B:403:0x16f7, B:404:0x1739, B:406:0x1746, B:408:0x174f, B:409:0x178e, B:428:0x1936, B:436:0x19a5, B:442:0x1a26, B:444:0x1a2c, B:445:0x1a2d, B:447:0x1a2f, B:449:0x1a36, B:450:0x1a37, B:411:0x179a, B:418:0x181e, B:420:0x1824, B:421:0x1865, B:423:0x188f, B:424:0x18d6, B:426:0x18ec, B:427:0x192e, B:452:0x1a39, B:454:0x1a40, B:455:0x1a41, B:438:0x19ab, B:432:0x196b, B:434:0x1971, B:435:0x199e, B:413:0x17ba, B:415:0x17cc, B:416:0x1812), top: B:813:0x16f1, outer: #27, inners: #1, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x1746 A[Catch: all -> 0x1a42, TryCatch #12 {all -> 0x1a42, blocks: (B:401:0x16f1, B:403:0x16f7, B:404:0x1739, B:406:0x1746, B:408:0x174f, B:409:0x178e, B:428:0x1936, B:436:0x19a5, B:442:0x1a26, B:444:0x1a2c, B:445:0x1a2d, B:447:0x1a2f, B:449:0x1a36, B:450:0x1a37, B:411:0x179a, B:418:0x181e, B:420:0x1824, B:421:0x1865, B:423:0x188f, B:424:0x18d6, B:426:0x18ec, B:427:0x192e, B:452:0x1a39, B:454:0x1a40, B:455:0x1a41, B:438:0x19ab, B:432:0x196b, B:434:0x1971, B:435:0x199e, B:413:0x17ba, B:415:0x17cc, B:416:0x1812), top: B:813:0x16f1, outer: #27, inners: #1, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x179a A[Catch: all -> 0x1a42, TRY_LEAVE, TryCatch #12 {all -> 0x1a42, blocks: (B:401:0x16f1, B:403:0x16f7, B:404:0x1739, B:406:0x1746, B:408:0x174f, B:409:0x178e, B:428:0x1936, B:436:0x19a5, B:442:0x1a26, B:444:0x1a2c, B:445:0x1a2d, B:447:0x1a2f, B:449:0x1a36, B:450:0x1a37, B:411:0x179a, B:418:0x181e, B:420:0x1824, B:421:0x1865, B:423:0x188f, B:424:0x18d6, B:426:0x18ec, B:427:0x192e, B:452:0x1a39, B:454:0x1a40, B:455:0x1a41, B:438:0x19ab, B:432:0x196b, B:434:0x1971, B:435:0x199e, B:413:0x17ba, B:415:0x17cc, B:416:0x1812), top: B:813:0x16f1, outer: #27, inners: #1, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1948  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1b69  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1bba  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1c77  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x1e26  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x26ca  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x271e  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x2972  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2b20 A[Catch: all -> 0x031a, TryCatch #50 {all -> 0x031a, blocks: (B:250:0x0eaf, B:252:0x0eb5, B:253:0x0ee4, B:674:0x2b1a, B:676:0x2b20, B:677:0x2b4e, B:708:0x2e63, B:710:0x2e69, B:711:0x2e93, B:745:0x31a5, B:747:0x31ab, B:748:0x31ce, B:725:0x2fdd, B:727:0x3000, B:728:0x3057, B:542:0x2424, B:544:0x242a, B:545:0x245a, B:547:0x2494, B:548:0x24db, B:510:0x20ba, B:512:0x20cf, B:513:0x20ff, B:515:0x2133, B:516:0x21b0, B:770:0x32a1, B:772:0x32a7, B:773:0x32cd, B:775:0x3307, B:776:0x3351, B:478:0x1c97, B:480:0x1cac, B:481:0x1ce1, B:462:0x1aaa, B:464:0x1ab0, B:465:0x1adc, B:394:0x1640, B:396:0x1646, B:397:0x1670, B:295:0x10c3, B:297:0x10c9, B:298:0x10f1, B:142:0x093f, B:144:0x0945, B:145:0x0969, B:18:0x01a1, B:20:0x01a7, B:21:0x01cd, B:23:0x0287, B:25:0x02b9, B:26:0x0314), top: B:882:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x2bdf  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x2c2e  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x2c87  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x2e41  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x2f21  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x2f73  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x2fbf  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x3185  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x3267  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x2668 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:816:0x1182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:844:0x0f67 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:912:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0779  */
    /* JADX WARN: Type inference failed for: r10v256 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v132 */
    /* JADX WARN: Type inference failed for: r11v150 */
    /* JADX WARN: Type inference failed for: r11v151 */
    /* JADX WARN: Type inference failed for: r11v152 */
    /* JADX WARN: Type inference failed for: r11v153 */
    /* JADX WARN: Type inference failed for: r11v154 */
    /* JADX WARN: Type inference failed for: r11v159, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v166 */
    /* JADX WARN: Type inference failed for: r11v167 */
    /* JADX WARN: Type inference failed for: r11v181 */
    /* JADX WARN: Type inference failed for: r11v182 */
    /* JADX WARN: Type inference failed for: r11v183 */
    /* JADX WARN: Type inference failed for: r11v185 */
    /* JADX WARN: Type inference failed for: r11v194 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v203, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v207 */
    /* JADX WARN: Type inference failed for: r11v208 */
    /* JADX WARN: Type inference failed for: r11v209 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v210 */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v214 */
    /* JADX WARN: Type inference failed for: r11v215 */
    /* JADX WARN: Type inference failed for: r11v216 */
    /* JADX WARN: Type inference failed for: r11v217 */
    /* JADX WARN: Type inference failed for: r11v218 */
    /* JADX WARN: Type inference failed for: r11v219 */
    /* JADX WARN: Type inference failed for: r11v220 */
    /* JADX WARN: Type inference failed for: r11v221 */
    /* JADX WARN: Type inference failed for: r11v222 */
    /* JADX WARN: Type inference failed for: r11v223 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v128 */
    /* JADX WARN: Type inference failed for: r15v129 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v143 */
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v146 */
    /* JADX WARN: Type inference failed for: r15v147 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v89, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v556, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v648, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v664 */
    /* JADX WARN: Type inference failed for: r2v673 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v20 */
    /* JADX WARN: Type inference failed for: r33v44 */
    /* JADX WARN: Type inference failed for: r3v637 */
    /* JADX WARN: Type inference failed for: r3v707 */
    /* JADX WARN: Type inference failed for: r7v351, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v106 */
    /* JADX WARN: Type inference failed for: r8v165 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v172 */
    /* JADX WARN: Type inference failed for: r8v173 */
    /* JADX WARN: Type inference failed for: r8v174 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v90, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v132, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v147 */
    /* JADX WARN: Type inference failed for: r9v151 */
    /* JADX WARN: Type inference failed for: r9v152 */
    /* JADX WARN: Type inference failed for: r9v153 */
    /* JADX WARN: Type inference failed for: r9v154 */
    /* JADX WARN: Type inference failed for: r9v155 */
    /* JADX WARN: Type inference failed for: r9v156 */
    /* JADX WARN: Type inference failed for: r9v158, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v159 */
    /* JADX WARN: Type inference failed for: r9v160 */
    /* JADX WARN: Type inference failed for: r9v161 */
    /* JADX WARN: Type inference failed for: r9v166 */
    /* JADX WARN: Type inference failed for: r9v167 */
    /* JADX WARN: Type inference failed for: r9v168 */
    /* JADX WARN: Type inference failed for: r9v169 */
    /* JADX WARN: Type inference failed for: r9v170 */
    /* JADX WARN: Type inference failed for: r9v171 */
    /* JADX WARN: Type inference failed for: r9v172 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v80 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomePreviewActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10467$r8$lambda$4paxdxwjbAVXvBZtnGNDjHcPdE(HomePreviewActivity homePreviewActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component1 + 19;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        m10468instrumented$0$updateNavigation$LjavautilListV(homePreviewActivity, i, view);
        if (i4 == 0) {
            throw null;
        }
    }

    static {
        equals = 1;
        component3();
        int i = copy + 33;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void m10468instrumented$0$updateNavigation$LjavautilListV(HomePreviewActivity homePreviewActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Callback.onClick_enter(view);
        try {
            updateNavigation$lambda$1(homePreviewActivity, i, view);
            Callback.onClick_exit();
            int i5 = component1 + 105;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        int i4 = getRequestBeneficiariesState + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static void component3() {
        copydefault = 8161287339700570270L;
        component3 = 1386857713;
        ShareDataUIState = (char) 50417;
        component2 = new char[]{33509, 33449, 33456, 33448, 33372, 33439, 33441, 33440, 33368, 33366, 33445, 33373, 33357, 33365, 33364, 33364, 33365, 33368, 33457, 33420, 33460, 33363, 33371, 33468, 33466, 33373, 33367, 33363, 33368, 33370, 33372, 33518, 33459, 33452, 33453, 33460, 33462, 33454, 33413, 33415, 33455, 33457, 33461, 33465, 33469, 33461, 33457, 33459, 33457, 33519, 33426, 33514, 33428, 33425, 33513, 33426, 33467, 33429, 33430, 33427, 33512, 33510, 33513, 33427, 33426, 33427, 33430, 33516, 33514, 33428, 33429, 33515, 33426, 33427, 33513, 33424, 33426, 33428, 33470, 33468, 33465, 33466, 33468, 33431, 33519, 33518, 33514, 33425, 33469, 33428, 33514, 33517, 33517, 33515, 33514, 33514, 33428, 33373, 33330, 33290, 33289, 33290, 33289, 33328, 33755, 33757, 33333, 33294, 33294, 33289, 33328, 33329, 33290, 33332, 33332, 33289, 33290, 33291, 33286, 33287, 33288, 33328, 33328, 33328, 33332, 33294, 33333, 33330, 33291, 33331, 33330, 33291, 33331, 33331, 33290, 33329, 33330, 33289, 33287, 33287, 33290, 33291, 33289, 33330, 33754, 33755, 33331, 33292, 33291, 33328, 33754, 33755, 33330, 33289, 33291, 33290, 33291, 33332, 33328, 33327, 33331, 33510, 33452, 33454, 33462, 33458, 33458, 33429, 33519, 33419, 33421, 33422, 33452, 33459, 33465, 33461, 33460, 33427, 33427, 33459, 33463, 33431, 33425, 33457, 33462, 33431, 33430, 33460, 33462, 33460, 33452, 33453, 33460, 33460, 33462, 33460, 33457, 33429, 33422, 33452, 33461, 33469, 33460, 33461, 33468, 33460, 33458, 33457, 33422, 33431, 33469, 33426, 33514, 33516, 33517, 33515, 33516, 33516, 33515, 33426, 33427, 33514, 33512, 33513, 33514, 33517, 33520, 33515, 33417, 33454, 33453, 33451, 33457, 33527, 33428, 33432, 33429, 33430, 33431, 33509, 33361, 33359, 33446, 33358, 33361, 33447, 33443, 33443, 33444, 33448, 33450, 33444, 33444, 33448, 33450, 33447, 33356, 33358, 33445, 33443, 33357, 33359, 33358, 33358, 33445, 33443, 33358, 33357, 33441, 33442, 33442, 33354, 33356, 33356, 33355, 33512, 33359, 33390, 33361, 33366, 33401, 33395, 33391, 33396, 33398, 33400, 33401, 33400, 33398, 33394, 33352, 33351, 33398, 33395, 33388, 33385, 33401, 33518, 33468, 33429, 33519, 33516, 33511, 33425, 33468, 33425, 33425, 33467, 33427, 33429, 33467, 33424, 33424, 33426, 33429, 33430, 33429, 33467, 33428, 33517, 33427, 33425, 33513, 33514, 33512, 33513, 33513, 33425, 33425, 33514, 33427, 33427, 33429, 33468, 33426, 33513, 33515, 33516, 33427, 33468, 33469, 33428, 33425, 33426, 33514, 33426, 33429, 33517, 33515, 33428, 33468, 33427, 33428, 33426, 33427, 33470, 33469, 33430, 33429, 33425, 33424, 33475, 33515, 33516, 33516, 33517, 33516, 33514, 33512, 33512, 33515, 33516, 33477, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33515, 33515, 33513, 33460, 33458, 33457, 33457, 33456, 33457, 33459, 33458, 33456};
    }
}
