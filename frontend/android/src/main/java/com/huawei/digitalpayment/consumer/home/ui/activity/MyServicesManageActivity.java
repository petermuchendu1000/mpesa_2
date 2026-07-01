package com.huawei.digitalpayment.consumer.home.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.home.ui.adapter.CurrentLifeFunctionAdapter;
import com.huawei.digitalpayment.consumer.home.ui.adapter.LifeGroupFunctionEditAdapter;
import com.huawei.digitalpayment.consumer.home.ui.adapter.RecyclerViewItemTouchHelper;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.HomeV5MyServicesManageBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.theme.HomeThemeManager;
import com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState;
import com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0014J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/MyServicesManageActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/HomeV5MyServicesManageBinding;", "Lcom/huawei/digitalpayment/home/viewmodel/HomeServiceManagerViewModel2;", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/RecyclerViewItemTouchHelper$EditEnableListener;", "<init>", "()V", "myServicesAdapter", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/CurrentLifeFunctionAdapter;", "touchHelper", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/RecyclerViewItemTouchHelper;", "groupAdapter", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/LifeGroupFunctionEditAdapter;", "touchPosition", "", "initToolbar", "", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "editEnable", "", "position", "isLongPressDragEnabled", "observe", "updateMyService", "getLayoutId", "onBackPressed", "showQuitConfirm", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class MyServicesManageActivity extends Hilt_MyServicesManageActivity<HomeV5MyServicesManageBinding, HomeServiceManagerViewModel2> implements RecyclerViewItemTouchHelper.EditEnableListener {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static char[] component1;
    private static char component2;
    private static int component4;
    private LifeGroupFunctionEditAdapter groupAdapter;
    private CurrentLifeFunctionAdapter myServicesAdapter;
    private RecyclerViewItemTouchHelper touchHelper;
    private int touchPosition = -1;
    private static final byte[] $$l = {110, -114, 93, -109};
    private static final int $$o = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {60, -123, -116, -1, -9, 62, -71, 10, 1, -5, -20, 8, -16, Ascii.SO, -22, 71, -62, -8, -9, Ascii.FF, -16, 1, 10, -14, 59, PSSSigner.TRAILER_IMPLICIT, -4, 8, -16, Ascii.SO, -22, 2, -6, -4, 66, -59, -9, -6, -11, 19, -4, -13, 4, TarHeader.LF_BLK, -27, -41, -6, -11, 19, -4, -13, 4, Ascii.SO, -16, -13, 3, Ascii.VT, -20, -4, -6, 4, 62, -66, -15, -4, -12, Ascii.DC2, -4, -4, 2, -23, 6, -11, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4};
    private static final int $$k = 105;
    private static final byte[] $$d = {1, -128, 109, -128, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 18;
    private static int getRequestBeneficiariesState = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final Function1 component3;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if ((!(obj instanceof Observer)) || (!(obj instanceof FunctionAdapter))) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = ShareDataUIState + 41;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return zAreEqual;
            }
            int i5 = 4 / 4;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2 + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component3;
            if (i3 == 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = ShareDataUIState + 23;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = component2 + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, int r7, int r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = 119 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.$$l
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.$$r(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 28 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.$$d
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r7 = 100 - r7
            byte[] r0 = new byte[r0]
            int r5 = 27 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.i(byte, byte, int, java.lang.Object[]):void");
    }

    private static void j(byte b2, short s, short s2, Object[] objArr) {
        int i = 105 - (b2 * 6);
        byte[] bArr = $$j;
        int i2 = s * 3;
        int i3 = 90 - (s2 * 3);
        byte[] bArr2 = new byte[i2 + 10];
        int i4 = i2 + 9;
        int i5 = -1;
        if (bArr == null) {
            i = (i + (-i4)) - 3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            i3++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = (i + (-bArr[i3])) - 3;
        }
    }

    public static final LifeGroupFunctionEditAdapter access$getGroupAdapter$p(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapter = myServicesManageActivity.groupAdapter;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return lifeGroupFunctionEditAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final CurrentLifeFunctionAdapter access$getMyServicesAdapter$p(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        CurrentLifeFunctionAdapter currentLifeFunctionAdapter = myServicesManageActivity.myServicesAdapter;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return currentLifeFunctionAdapter;
        }
        throw null;
    }

    public static final RecyclerViewItemTouchHelper access$getTouchHelper$p(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RecyclerViewItemTouchHelper recyclerViewItemTouchHelper = myServicesManageActivity.touchHelper;
        if (i3 == 0) {
            return recyclerViewItemTouchHelper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final ViewModel access$getViewModel$p(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        VM vm = myServicesManageActivity.viewModel;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return vm;
    }

    public static final void access$showQuitConfirm(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        myServicesManageActivity.showQuitConfirm();
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = component3 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void access$updateMyService(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        myServicesManageActivity.updateMyService();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        super.initToolbar(getString(R.string.home_life_title1));
        View viewFindViewById = findViewById(R.id.toolbarRoot);
        viewFindViewById.setBackgroundColor(ColorUtils.getColor(R.color.colorGround));
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.tvEndButton);
        Intrinsics.checkNotNull(viewFindViewById2, "");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(R.string.home_life_button2);
        textView.setOnClickListener(new FilterFastClickListener() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onFilterClick(View v) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(v, "");
                MyServicesManageActivity.access$updateMyService(MyServicesManageActivity.this);
                int i5 = ShareDataUIState + 113;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        viewFindViewById.findViewById(R.id.ivBack).setOnClickListener(new FilterFastClickListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onFilterClick(View v) {
                int i2 = 2 % 2;
                int i3 = copydefault + 73;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(v, "");
                    MyServicesManageActivity.access$showQuitConfirm(MyServicesManageActivity.this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(v, "");
                MyServicesManageActivity.access$showQuitConfirm(MyServicesManageActivity.this);
                int i4 = copydefault + 53;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r23, char[] r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.h(int, char[], java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2", f = "MyServicesManageActivity.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1", f = "MyServicesManageActivity.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component1;
            int component3;
            final MyServicesManageActivity copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 91;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component3;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<HomeServiceManagerUiState> stateFlowUiState = ((HomeServiceManagerViewModel2) MyServicesManageActivity.access$getViewModel$p(this.copydefault)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<LocalHomeFunction>>() {
                        private static int component1 = 1;
                        private static int component3;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int ShareDataUIState = 1;
                            private static int component2;
                            final FlowCollector component3;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1$2", f = "MyServicesManageActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component1 = 0;
                                private static int component2 = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component2 + 107;
                                    component1 = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    AnonymousClass1 anonymousClass1 = this;
                                    if (i3 == 0) {
                                        return anonymousClass2.emit(null, anonymousClass1);
                                    }
                                    anonymousClass2.emit(null, anonymousClass1);
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
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
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L20
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L20
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r7 = r7 + 41
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                    int r7 = r7 % r0
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L25
                                L20:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L25:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L47
                                    if (r3 != r4) goto L3f
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r6 = r6 + 91
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r7
                                    int r6 = r6 % r0
                                    goto L67
                                L3f:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L47:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component3
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState r6 = (com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState) r6
                                    java.util.List r6 = r6.getCurrentHomeServiceFunctions()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L67
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r6 = r6 + 85
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r7
                                    int r6 = r6 % r0
                                    return r2
                                L67:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component3 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super List<LocalHomeFunction>> flowCollector, Continuation continuation) {
                            int i5 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i6 = component3 + 33;
                                component1 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    int i7 = 23 / 0;
                                }
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i8 = component1 + 93;
                            component3 = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    });
                    final MyServicesManageActivity myServicesManageActivity = this.copydefault;
                    this.component3 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int copydefault;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = copydefault + 5;
                            ShareDataUIState = i6 % 128;
                            List<LocalHomeFunction> list = (List) obj2;
                            if (i6 % 2 == 0) {
                                ShareDataUIState(list, continuation);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            Object objShareDataUIState = ShareDataUIState(list, continuation);
                            int i7 = copydefault + 81;
                            ShareDataUIState = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 98 / 0;
                            }
                            return objShareDataUIState;
                        }

                        public final Object ShareDataUIState(List<LocalHomeFunction> list, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            CurrentLifeFunctionAdapter currentLifeFunctionAdapterAccess$getMyServicesAdapter$p = MyServicesManageActivity.access$getMyServicesAdapter$p(myServicesManageActivity);
                            LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapter = null;
                            if (currentLifeFunctionAdapterAccess$getMyServicesAdapter$p == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i6 = ShareDataUIState + 77;
                                copydefault = i6 % 128;
                                int i7 = i6 % 2;
                                currentLifeFunctionAdapterAccess$getMyServicesAdapter$p = null;
                            }
                            currentLifeFunctionAdapterAccess$getMyServicesAdapter$p.setNewInstance(list);
                            RecyclerViewItemTouchHelper recyclerViewItemTouchHelperAccess$getTouchHelper$p = MyServicesManageActivity.access$getTouchHelper$p(myServicesManageActivity);
                            if (recyclerViewItemTouchHelperAccess$getTouchHelper$p == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i8 = ShareDataUIState + 107;
                                copydefault = i8 % 128;
                                int i9 = i8 % 2;
                                recyclerViewItemTouchHelperAccess$getTouchHelper$p = null;
                            }
                            recyclerViewItemTouchHelperAccess$getTouchHelper$p.setData(list);
                            LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p = MyServicesManageActivity.access$getGroupAdapter$p(myServicesManageActivity);
                            if (lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p == null) {
                                int i10 = copydefault + 57;
                                ShareDataUIState = i10 % 128;
                                if (i10 % 2 == 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    int i11 = 81 / 0;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p = null;
                            }
                            lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p.setCurrentSelected(list);
                            LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p2 = MyServicesManageActivity.access$getGroupAdapter$p(myServicesManageActivity);
                            if (lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            } else {
                                lifeGroupFunctionEditAdapter = lifeGroupFunctionEditAdapterAccess$getGroupAdapter$p2;
                            }
                            lifeGroupFunctionEditAdapter.notifyDataSetChanged();
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = component1 + 65;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MyServicesManageActivity myServicesManageActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.copydefault = myServicesManageActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.copydefault, continuation);
                int i2 = component1 + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 67 / 0;
                }
                return anonymousClass2;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 5;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = ShareDataUIState + 81;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 51;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 103;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component2;
            if (i3 != 0) {
                int i4 = ShareDataUIState + 1;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(MyServicesManageActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(MyServicesManageActivity.this, null), this) == coroutine_suspended) {
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
            component3 component3Var = MyServicesManageActivity.this.new component3(continuation);
            int i2 = component3 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objShareDataUIState;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
                int i3 = 86 / 0;
            } else {
                objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            }
            int i4 = ShareDataUIState + 85;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 21;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3", f = "MyServicesManageActivity.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1", f = "MyServicesManageActivity.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 1;
            private static int component2;
            final MyServicesManageActivity ShareDataUIState;
            int copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.copydefault;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<HomeServiceManagerUiState> stateFlowUiState = ((HomeServiceManagerViewModel2) MyServicesManageActivity.access$getViewModel$p(this.ShareDataUIState)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int component1 = 0;
                        private static int component3 = 1;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component2 = 1;
                            private static int component3;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1$2", f = "MyServicesManageActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
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
                                    int i2 = ShareDataUIState + 83;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 != 0) {
                                        return anonymousClass2.emit(null, this);
                                    }
                                    int i4 = 11 / 0;
                                    return anonymousClass2.emit(null, this);
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
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
                                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r1 = r1 + 83
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r2
                                    int r1 = r1 % r0
                                    if (r1 == 0) goto L6d
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L22
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L22
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L27
                                L22:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L27:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L40
                                    if (r3 != r4) goto L38
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L6a
                                L38:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L40:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState r6 = (com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState) r6
                                    boolean r6 = r6.getLoading()
                                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L6a
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r6 = r6 + 107
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r7
                                    int r6 = r6 % r0
                                    if (r6 != 0) goto L69
                                    r6 = 68
                                    int r6 = r6 / 0
                                L69:
                                    return r2
                                L6a:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                L6d:
                                    boolean r6 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    r6 = 0
                                    throw r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i3 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            Object obj2 = null;
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i4 = component3 + 59;
                                component1 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    return objCollect;
                                }
                                throw null;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i5 = component3 + 73;
                            component1 = i5 % 128;
                            if (i5 % 2 == 0) {
                                return unit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    });
                    final MyServicesManageActivity myServicesManageActivity = this.ShareDataUIState;
                    this.copydefault = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int component3;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i3 = 2 % 2;
                            int i4 = ShareDataUIState + 53;
                            component3 = i4 % 128;
                            int i5 = i4 % 2;
                            Object objComponent2 = component2(((Boolean) obj2).booleanValue(), continuation);
                            int i6 = component3 + 83;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            return objComponent2;
                        }

                        public final Object component2(boolean z, Continuation<? super Unit> continuation) {
                            int i3 = 2 % 2;
                            int i4 = ShareDataUIState + 85;
                            component3 = i4 % 128;
                            if (i4 % 2 != 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (z) {
                                DialogManager.showLoading(myServicesManageActivity);
                                int i5 = component3 + 125;
                                ShareDataUIState = i5 % 128;
                                if (i5 % 2 == 0) {
                                    int i6 = 4 % 3;
                                }
                            } else {
                                DialogManager.hideLoading(myServicesManageActivity);
                            }
                            Unit unit = Unit.INSTANCE;
                            int i7 = ShareDataUIState + 71;
                            component3 = i7 % 128;
                            int i8 = i7 % 2;
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        int i3 = component1 + 103;
                        component2 = i3 % 128;
                        if (i3 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = component2 + 67;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        int i5 = 37 / 0;
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(MyServicesManageActivity myServicesManageActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.ShareDataUIState = myServicesManageActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.ShareDataUIState, continuation);
                int i2 = component1 + 43;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass5;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 111;
                component1 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return component1(coroutineScope2, continuation2);
                }
                Object objComponent1 = component1(coroutineScope2, continuation2);
                int i3 = 86 / 0;
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = component1 + 101;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(coroutineScope, continuation);
                if (i3 != 0) {
                    objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                    int i4 = 19 / 0;
                } else {
                    objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = component1 + 45;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 23;
            component3 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(MyServicesManageActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(MyServicesManageActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = component3 + 105;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i5 = 47 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = component2 + 69;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = MyServicesManageActivity.this.new copydefault(continuation);
            int i2 = component3 + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component2(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = component2 + 15;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 67 / 0;
            }
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 77;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4", f = "MyServicesManageActivity.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1", f = "MyServicesManageActivity.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int component3;
            final MyServicesManageActivity ShareDataUIState;
            int component1;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 85;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component1;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<HomeServiceManagerUiState> stateFlowUiState = ((HomeServiceManagerViewModel2) MyServicesManageActivity.access$getViewModel$p(this.ShareDataUIState)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int component1 = 1;
                        private static int component3;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int ShareDataUIState = 0;
                            private static int copydefault = 1;
                            final FlowCollector component2;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1$2", f = "MyServicesManageActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component1 = 1;
                                private static int component3;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component1 + 51;
                                    component3 = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = component3 + 93;
                                    component1 = i4 % 128;
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
                                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r1 = r1 + 75
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                    int r1 = r1 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L31
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L31
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r7 = r7 + 83
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L2b
                                    int r7 = r1.label
                                    int r7 = r7 >>> r3
                                    r1.label = r7
                                    goto L36
                                L2b:
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L36
                                L31:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L36:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L58
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 21
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r1
                                    int r6 = r6 % r0
                                    if (r3 != r4) goto L50
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L7c
                                L50:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L58:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component2
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState r6 = (com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState) r6
                                    boolean r6 = r6.getSaveSuccess()
                                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L7c
                                    int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 83
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r7
                                    int r6 = r6 % r0
                                    return r2
                                L7c:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component2 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i4 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            Object obj2 = null;
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i5 = component3 + 107;
                                component1 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    return objCollect;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i6 = component3 + 99;
                            component1 = i6 % 128;
                            if (i6 % 2 != 0) {
                                return unit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    });
                    final MyServicesManageActivity myServicesManageActivity = this.ShareDataUIState;
                    this.component1 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int component1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = component1 + 49;
                            ShareDataUIState = i5 % 128;
                            int i6 = i5 % 2;
                            Object objShareDataUIState = ShareDataUIState(((Boolean) obj2).booleanValue(), continuation);
                            int i7 = ShareDataUIState + 121;
                            component1 = i7 % 128;
                            if (i7 % 2 == 0) {
                                return objShareDataUIState;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object ShareDataUIState(boolean z, Continuation<? super Unit> continuation) {
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState + 99;
                            component1 = i5 % 128;
                            int i6 = i5 % 2;
                            if (z) {
                                myServicesManageActivity.finish();
                                int i7 = component1 + 17;
                                ShareDataUIState = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i8 = 2 % 4;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = component2 + 79;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MyServicesManageActivity myServicesManageActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.ShareDataUIState = myServicesManageActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.ShareDataUIState, continuation);
                int i2 = component3 + 5;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 5;
                component2 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    return component2(coroutineScope2, continuation2);
                }
                component2(coroutineScope2, continuation2);
                throw null;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 27;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass2.invokeSuspend(unit);
                }
                anonymousClass2.invokeSuspend(unit);
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 101;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(MyServicesManageActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(MyServicesManageActivity.this, null), this) == coroutine_suspended) {
                    int i4 = copydefault + 89;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 57 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = MyServicesManageActivity.this.new component1(continuation);
            int i2 = component1 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 99;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component1(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = copydefault + 93;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                component1Var.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component1Var.invokeSuspend(unit);
            int i4 = copydefault + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5", f = "MyServicesManageActivity.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1", f = "MyServicesManageActivity.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 1;
            private static int component2;
            int ShareDataUIState;
            final MyServicesManageActivity component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 3;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.ShareDataUIState;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<HomeServiceManagerUiState> stateFlowUiState = ((HomeServiceManagerViewModel2) MyServicesManageActivity.access$getViewModel$p(this.component3)).uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<BaseException>() {
                        private static int component3 = 1;
                        private static int copydefault;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component1 = 0;
                            private static int component2 = 1;
                            final FlowCollector copydefault;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1$2", f = "MyServicesManageActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component1 = 0;
                                private static int component2 = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component2 + 73;
                                    component1 = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object obj2 = null;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = component2 + 33;
                                    component1 = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        return objEmit;
                                    }
                                    obj2.hashCode();
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                                /*
                                    r6 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r2 = r1 + 39
                                    int r3 = r2 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r3
                                    int r2 = r2 % r0
                                    r3 = 0
                                    if (r2 != 0) goto L8a
                                    boolean r2 = r8 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r2 == 0) goto L2a
                                    int r1 = r1 + 87
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r2
                                    int r1 = r1 % r0
                                    r1 = r8
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r4
                                    if (r2 == 0) goto L2a
                                    int r8 = r1.label
                                    int r8 = r8 + r4
                                    r1.label = r8
                                    goto L2f
                                L2a:
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r8)
                                L2f:
                                    java.lang.Object r8 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r4 = r1.label
                                    r5 = 1
                                    if (r4 == 0) goto L61
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r7 + 117
                                    int r1 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                    int r7 = r7 % r0
                                    if (r4 != r5) goto L59
                                    int r1 = r1 + 125
                                    int r7 = r1 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r7
                                    int r1 = r1 % r0
                                    if (r1 != 0) goto L52
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    goto L87
                                L52:
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    r3.hashCode()
                                    throw r3
                                L59:
                                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                    r7.<init>(r8)
                                    throw r7
                                L61:
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    kotlinx.coroutines.flow.FlowCollector r8 = r6.copydefault
                                    r4 = r1
                                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                                    com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState r7 = (com.huawei.digitalpayment.home.ui.uistate.HomeServiceManagerUiState) r7
                                    com.huawei.common.exception.BaseException r7 = r7.getException()
                                    r1.label = r5
                                    java.lang.Object r7 = r8.emit(r7, r1)
                                    if (r7 != r2) goto L87
                                    int r7 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r7 + 37
                                    int r8 = r7 % 128
                                    com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r8
                                    int r7 = r7 % r0
                                    if (r7 == 0) goto L83
                                    return r2
                                L83:
                                    r3.hashCode()
                                    throw r3
                                L87:
                                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                                    return r7
                                L8a:
                                    boolean r7 = r8 instanceof com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    r3.hashCode()
                                    throw r3
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity$observe$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.copydefault = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super BaseException> flowCollector, Continuation continuation) {
                            int i4 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i5 = copydefault + 115;
                                component3 = i5 % 128;
                                int i6 = i5 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i7 = component3 + 31;
                            copydefault = i7 % 128;
                            int i8 = i7 % 2;
                            return unit;
                        }
                    });
                    final MyServicesManageActivity myServicesManageActivity = this.component3;
                    this.ShareDataUIState = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int ShareDataUIState = 1;
                        private static int component1;

                        @Override
                        public Object emit(Object obj3, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState + 83;
                            component1 = i5 % 128;
                            BaseException baseException = (BaseException) obj3;
                            if (i5 % 2 != 0) {
                                ShareDataUIState(baseException, continuation);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            Object objShareDataUIState = ShareDataUIState(baseException, continuation);
                            int i6 = ShareDataUIState + 35;
                            component1 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 46 / 0;
                            }
                            return objShareDataUIState;
                        }

                        public final Object ShareDataUIState(BaseException baseException, Continuation<? super Unit> continuation) {
                            ViewModel viewModelAccess$getViewModel$p;
                            int i4 = 2 % 2;
                            int i5 = component1;
                            int i6 = i5 + 25;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            if (baseException != null) {
                                int i8 = i5 + 111;
                                ShareDataUIState = i8 % 128;
                                if (i8 % 2 == 0) {
                                    ToastUtils.showLong(baseException.getMessage(), new Object[1]);
                                    viewModelAccess$getViewModel$p = MyServicesManageActivity.access$getViewModel$p(myServicesManageActivity);
                                } else {
                                    ToastUtils.showLong(baseException.getMessage(), new Object[0]);
                                    viewModelAccess$getViewModel$p = MyServicesManageActivity.access$getViewModel$p(myServicesManageActivity);
                                }
                                ((HomeServiceManagerViewModel2) viewModelAccess$getViewModel$p).cleanException();
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = component1 + 61;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(MyServicesManageActivity myServicesManageActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component3 = myServicesManageActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component3, continuation);
                int i2 = component1 + 123;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                if (i3 != 0) {
                    int i4 = 19 / 0;
                }
                int i5 = component1 + 91;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 3;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 45;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(MyServicesManageActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(MyServicesManageActivity.this, null), this) == coroutine_suspended) {
                    int i3 = component1 + 75;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component1 + 59;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
                int i7 = component1 + 95;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = MyServicesManageActivity.this.new component2(continuation);
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component2Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 81;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component1 + 5;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = component1 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 != 0) {
                objInvokeSuspend = component2Var.invokeSuspend(Unit.INSTANCE);
                int i4 = 33 / 0;
            } else {
                objInvokeSuspend = component2Var.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = ShareDataUIState + 1;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7422, 14 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (64290 - TextUtils.indexOf((CharSequence) "", '0')), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7421 - ExpandableListView.getPackedPositionChild(0L), 15 - View.combineMeasuredStates(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i5 = $11 + 41;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i7 = $10 + 27;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 14, (char) (44463 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 2944, (Process.myTid() >> 22) + 24, (char) (ImageFormat.getBitsPerPixel(0) + 27638), 794909189, false, $$r(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i9 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i10 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i10];
                            cArr4[cancelall.component2 + 1] = cArr2[i11];
                        } else {
                            int i12 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i12];
                            cArr4[cancelall.component2 + 1] = cArr2[i13];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = $11 + 37;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final void onCreate$lambda$0(MyServicesManageActivity myServicesManageActivity, LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
        ((HomeServiceManagerViewModel2) myServicesManageActivity.viewModel).addTempFunction(LocalHomeFunction.copy$default(localHomeFunction, null, null, null, null, null, null, null, null, true, false, null, null, false, null, null, 32511, null));
        int i4 = component3 + 91;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[PHI: r5
  0x0038: PHI (r5v3 com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2) = 
  (r5v2 com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2)
  (r5v7 com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2)
 binds: [B:8:0x0036, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onCreate$lambda$1(com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity r4, com.chad.library.adapter.base.BaseQuickAdapter r5, android.view.View r6, int r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.component3
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            VM extends androidx.lifecycle.ViewModel r5 = r4.viewModel
            com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2 r5 = (com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2) r5
            com.huawei.digitalpayment.consumer.home.ui.adapter.CurrentLifeFunctionAdapter r4 = r4.myServicesAdapter
            r6 = 87
            int r6 = r6 / 0
            if (r4 != 0) goto L45
            goto L38
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            VM extends androidx.lifecycle.ViewModel r5 = r4.viewModel
            com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2 r5 = (com.huawei.digitalpayment.home.viewmodel.HomeServiceManagerViewModel2) r5
            com.huawei.digitalpayment.consumer.home.ui.adapter.CurrentLifeFunctionAdapter r4 = r4.myServicesAdapter
            if (r4 != 0) goto L45
        L38:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            int r4 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.copydefault
            int r4 = r4 + 93
            int r6 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.component3 = r6
            int r4 = r4 % r0
            r4 = r2
        L45:
            java.lang.Object r4 = r4.getItem(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction r4 = (com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction) r4
            r5.removeTempFunction(r4)
            int r4 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.component3
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.copydefault = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L5d
            return
        L5d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.onCreate$lambda$1(com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity, com.chad.library.adapter.base.BaseQuickAdapter, android.view.View, int):void");
    }

    private static final void onCreate$lambda$2(MyServicesManageActivity myServicesManageActivity, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
        myServicesManageActivity.touchPosition = i;
        int i5 = copydefault + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0175  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public boolean editEnable(int position) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        CurrentLifeFunctionAdapter currentLifeFunctionAdapter = this.myServicesAdapter;
        if (currentLifeFunctionAdapter == null) {
            int i5 = i2 + 17;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            currentLifeFunctionAdapter = null;
        }
        return currentLifeFunctionAdapter.getItem(position).getEditEnable();
    }

    @Override
    public boolean isLongPressDragEnabled() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        try {
            CurrentLifeFunctionAdapter currentLifeFunctionAdapter = this.myServicesAdapter;
            if (currentLifeFunctionAdapter == null) {
                int i5 = i2 + 9;
                copydefault = i5 % 128;
                currentLifeFunctionAdapter = null;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = copydefault + 27;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 4;
                }
            }
            return currentLifeFunctionAdapter.getItem(this.touchPosition).getEditEnable();
        } catch (Exception unused) {
            return false;
        }
    }

    private static final Unit observe$lambda$3(MyServicesManageActivity myServicesManageActivity, List list) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapter = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
            LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapter2 = myServicesManageActivity.groupAdapter;
            throw null;
        }
        Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
        LifeGroupFunctionEditAdapter lifeGroupFunctionEditAdapter3 = myServicesManageActivity.groupAdapter;
        if (lifeGroupFunctionEditAdapter3 == null) {
            int i3 = copydefault + 35;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            lifeGroupFunctionEditAdapter = lifeGroupFunctionEditAdapter3;
        }
        lifeGroupFunctionEditAdapter.update(list);
        return Unit.INSTANCE;
    }

    private final void observe() {
        int i = 2 % 2;
        MyServicesManageActivity myServicesManageActivity = this;
        HomeThemeManager.INSTANCE.getFunctionDefineGroups().observe(myServicesManageActivity, new ShareDataUIState(new Function1() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 5;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    MyServicesManageActivity.m10470$r8$lambda$LKmtIpqKifG9OpDtHI9L2EZ5w(this.f$0, (List) obj);
                    throw null;
                }
                Unit unitM10470$r8$lambda$LKmtIpqKifG9OpDtHI9L2EZ5w = MyServicesManageActivity.m10470$r8$lambda$LKmtIpqKifG9OpDtHI9L2EZ5w(this.f$0, (List) obj);
                int i4 = component3 + 75;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 56 / 0;
                }
                return unitM10470$r8$lambda$LKmtIpqKifG9OpDtHI9L2EZ5w;
            }
        }));
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(myServicesManageActivity), null, null, new component3(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(myServicesManageActivity), null, null, new copydefault(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(myServicesManageActivity), null, null, new component1(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(myServicesManageActivity), null, null, new component2(null), 3, null);
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void updateMyService() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ((HomeServiceManagerViewModel2) this.viewModel).updateMyService();
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 61;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.home_v5_my_services_manage;
            int i4 = 74 / 0;
        } else {
            i = R.layout.home_v5_my_services_manage;
        }
        int i5 = component3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return i;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        showQuitConfirm();
        int i4 = component3 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void showQuitConfirm$lambda$4(MyServicesManageActivity myServicesManageActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
        myServicesManageActivity.updateMyService();
        int i4 = component3 + 103;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    private static final void showQuitConfirm$lambda$6(MyServicesManageActivity myServicesManageActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
        ThreadUtils.runOnUiThreadDelayed(new MyServicesManageActivity$$ExternalSyntheticLambda4(myServicesManageActivity), 100L);
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void showQuitConfirm$lambda$6$lambda$5(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
            myServicesManageActivity.finish();
            int i3 = 74 / 0;
        } else {
            Intrinsics.checkNotNullParameter(myServicesManageActivity, "");
            myServicesManageActivity.finish();
        }
        int i4 = component3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void showQuitConfirm() {
        int i = 2 % 2;
        DialogBox.builder().setContent(getString(R.string.home_life_tips4)).setLeftButtonText(getString(R.string.home_life_button3)).setRightButtonText(getString(R.string.home_life_button4)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onButtonClick(View view, String str) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                MyServicesManageActivity.$r8$lambda$K7cGxvbVLaOI_w9YGIeFPhEUHjE(this.f$0, view, str);
                int i5 = component2 + 67;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        }).setLeftButtonListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 91;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MyServicesManageActivity.m10471$r8$lambda$bIcBoOeYL8faZFK5jrOalWNa6w(this.f$0, view);
                int i5 = component1 + 91;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        }).build().show(getSupportFragmentManager(), "tipsDialog");
        int i2 = copydefault + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) + 43000, new char[]{62686, 23756, 42209, 3226, 21668, 48199, 1141, 27738, 46134, 7626, 26093, 52654, 5538, 32165, 50525, 11621, 29977, 56635, 9921, 36577, 54959, 16054, 34483, 60993, 13926, 40462}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 24658, new char[]{62684, 38001, 13755, 55036, 30262, 6006, 45225, 20963, 61719, 37468, 13213, 56543, 31768, 7585, 48881, 24099, 65376, 39098}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = component3 + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = copydefault + 53;
            component3 = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 6562, 55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, 42 - Color.argb(0, 0, 0, 0), (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 56, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h(43038 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{62686, 23756, 42209, 3226, 21668, 48199, 1141, 27738, 46134, 7626, 26093, 52654, 5538, 32165, 50525, 11621, 29977, 56635, 9921, 36577, 54959, 16054, 34483, 60993, 13926, 40462}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 24762, new char[]{62684, 38001, 13755, 55036, 30262, 6006, 45225, 20963, 61719, 37468, 13213, 56543, 31768, 7585, 48881, 24099, 65376, 39098}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = component3 + 3;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                }
            }
        }
        if (baseContext != null) {
            int i6 = component3 + 35;
            copydefault = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - ExpandableListView.getPackedPositionChild(0L), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.indexOf("", "", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 56 - (ViewConfiguration.getTouchSlop() >> 8), (char) KeyEvent.getDeadChar(0, 0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6618, 42 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6562, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(76:(74:930|33|(3:35|36|(2:38|40)(1:39))(1:40)|77|834|78|(2:896|80)|84|85|935|(5:87|88|(1:90)|91|92)(19:94|95|945|96|97|936|98|(3:100|872|101)|105|106|107|(2:844|109)|113|114|115|(1:117)(1:118)|119|(1:121)|122)|93|123|(9:126|925|127|(1:129)|130|131|132|913|133)|170|949|171|(2:864|173)|177|178|944|(4:180|181|(1:183)|184)(19:186|187|931|188|(2:933|190)|194|195|921|196|(2:947|198)|202|203|204|(1:206)|207|(2:209|210)(1:212)|213|(2:215|216)|217)|218|(4:221|(2:223|953)(11:224|(3:226|(4:229|230|231|227)|954)|232|908|233|(1:235)|236|237|898|238|952)|239|219)|951|251|280|840|281|(13:929|283|288|(1:290)|291|292|912|(4:294|295|(1:297)|298)(14:299|(2:301|(1:307)(1:306))(1:309)|(21:311|312|938|313|927|314|(2:876|316)|320|321|915|322|(2:917|324)|328|329|330|(2:906|332)|333|(2:335|336)(1:338)|339|(1:341)|342)(2:403|404)|407|408|409|842|410|413|414|(1:416)|417|418|419)|343|(4:346|(2:348|957)(14:349|(3:351|(3:354|355|352)|958)|358|900|359|(2:879|361)|365|366|889|367|368|885|369|956)|370|344)|955|388|404)(11:288|(0)|291|292|912|(0)(0)|343|(1:344)|955|388|404)|420|881|421|(10:895|423|428|429|878|(5:431|432|(1:434)|435|436)(22:437|438|869|439|(2:860|441)|445|446|854|447|(2:874|449)|453|454|455|(1:457)|458|459|852|460|(3:462|858|463)(1:465)|466|(1:468)|469)|470|(4:473|(2:475|961)(11:476|(3:478|(3:481|482|479)|962)|485|838|486|(1:488)|489|490|942|491|960)|492|471)|959|504)(8:428|429|878|(0)(0)|470|(1:471)|959|504)|536|(1:538)|539|(3:541|(1:543)|544)(14:545|546|(1:548)|549|550|(1:552)|553|940|554|555|(1:557)(1:558)|559|(1:561)|562)|563|(1:565)(9:566|(3:568|(4:571|(3:973|573|976)(3:972|574|975)|974|569)|971)|575|576|(1:578)|579|(1:581)|582|583)|584|(1:586)|587|(1:589)|590|(3:592|(1:594)|595)(16:597|598|(1:600)|601|(1:603)|604|605|(1:607)|608|893|609|610|(1:612)|613|(1:615)|616)|596|617|(1:619)(9:620|(3:622|(2:625|623)|970)|626|627|(1:629)|630|(1:632)|633|634)|635|871|636|(1:638)|639|(1:641)|642|(3:644|(1:646)|647)(17:648|(2:650|(1:656)(1:655))|(19:658|659|866|660|(1:662)|663|664|856|665|(1:667)|668|669|670|(1:672)|673|(1:675)|676|(1:678)|679)|734|(1:736)|737|(2:739|(3:741|(1:743)|744)(3:745|(1:747)|748))(13:750|846|751|752|(1:754)|755|910|756|757|(1:759)|760|(1:762)|763)|749|764|(6:767|768|(1:770)|771|772|773)|774|(1:776)|777|(3:779|(1:781)|782)(14:784|785|(1:787)|788|789|(1:791)|792|904|793|794|(1:796)|797|(1:799)|800)|783|801|(1:977)(7:804|805|(1:807)|808|809|810|811))|680|(4:683|(3:965|685|968)(12:964|686|(3:688|(3:691|692|689)|969)|693|848|694|(1:696)|697|698|836|699|967)|966|681)|963|734|(0)|737|(0)(0)|749|764|(0)|774|(0)|777|(0)(0)|783|801|(0)(0))(1:44)|891|50|(1:52)|53|77|834|78|(0)|84|85|935|(0)(0)|93|123|(0)|170|949|171|(0)|177|178|944|(0)(0)|218|(1:219)|951|251|280|840|281|(0)(0)|420|881|421|(0)(0)|536|(0)|539|(0)(0)|563|(0)(0)|584|(0)|587|(0)|590|(0)(0)|596|617|(0)(0)|635|871|636|(0)|639|(0)|642|(0)(0)|680|(1:681)|963|734|(0)|737|(0)(0)|749|764|(0)|774|(0)|777|(0)(0)|783|801|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(87:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|887|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|868|(74:930|33|(3:35|36|(2:38|40)(1:39))(1:40)|77|834|78|(2:896|80)|84|85|935|(5:87|88|(1:90)|91|92)(19:94|95|945|96|97|936|98|(3:100|872|101)|105|106|107|(2:844|109)|113|114|115|(1:117)(1:118)|119|(1:121)|122)|93|123|(9:126|925|127|(1:129)|130|131|132|913|133)|170|949|171|(2:864|173)|177|178|944|(4:180|181|(1:183)|184)(19:186|187|931|188|(2:933|190)|194|195|921|196|(2:947|198)|202|203|204|(1:206)|207|(2:209|210)(1:212)|213|(2:215|216)|217)|218|(4:221|(2:223|953)(11:224|(3:226|(4:229|230|231|227)|954)|232|908|233|(1:235)|236|237|898|238|952)|239|219)|951|251|280|840|281|(13:929|283|288|(1:290)|291|292|912|(4:294|295|(1:297)|298)(14:299|(2:301|(1:307)(1:306))(1:309)|(21:311|312|938|313|927|314|(2:876|316)|320|321|915|322|(2:917|324)|328|329|330|(2:906|332)|333|(2:335|336)(1:338)|339|(1:341)|342)(2:403|404)|407|408|409|842|410|413|414|(1:416)|417|418|419)|343|(4:346|(2:348|957)(14:349|(3:351|(3:354|355|352)|958)|358|900|359|(2:879|361)|365|366|889|367|368|885|369|956)|370|344)|955|388|404)(11:288|(0)|291|292|912|(0)(0)|343|(1:344)|955|388|404)|420|881|421|(10:895|423|428|429|878|(5:431|432|(1:434)|435|436)(22:437|438|869|439|(2:860|441)|445|446|854|447|(2:874|449)|453|454|455|(1:457)|458|459|852|460|(3:462|858|463)(1:465)|466|(1:468)|469)|470|(4:473|(2:475|961)(11:476|(3:478|(3:481|482|479)|962)|485|838|486|(1:488)|489|490|942|491|960)|492|471)|959|504)(8:428|429|878|(0)(0)|470|(1:471)|959|504)|536|(1:538)|539|(3:541|(1:543)|544)(14:545|546|(1:548)|549|550|(1:552)|553|940|554|555|(1:557)(1:558)|559|(1:561)|562)|563|(1:565)(9:566|(3:568|(4:571|(3:973|573|976)(3:972|574|975)|974|569)|971)|575|576|(1:578)|579|(1:581)|582|583)|584|(1:586)|587|(1:589)|590|(3:592|(1:594)|595)(16:597|598|(1:600)|601|(1:603)|604|605|(1:607)|608|893|609|610|(1:612)|613|(1:615)|616)|596|617|(1:619)(9:620|(3:622|(2:625|623)|970)|626|627|(1:629)|630|(1:632)|633|634)|635|871|636|(1:638)|639|(1:641)|642|(3:644|(1:646)|647)(17:648|(2:650|(1:656)(1:655))|(19:658|659|866|660|(1:662)|663|664|856|665|(1:667)|668|669|670|(1:672)|673|(1:675)|676|(1:678)|679)|734|(1:736)|737|(2:739|(3:741|(1:743)|744)(3:745|(1:747)|748))(13:750|846|751|752|(1:754)|755|910|756|757|(1:759)|760|(1:762)|763)|749|764|(6:767|768|(1:770)|771|772|773)|774|(1:776)|777|(3:779|(1:781)|782)(14:784|785|(1:787)|788|789|(1:791)|792|904|793|794|(1:796)|797|(1:799)|800)|783|801|(1:977)(7:804|805|(1:807)|808|809|810|811))|680|(4:683|(3:965|685|968)(12:964|686|(3:688|(3:691|692|689)|969)|693|848|694|(1:696)|697|698|836|699|967)|966|681)|963|734|(0)|737|(0)(0)|749|764|(0)|774|(0)|777|(0)(0)|783|801|(0)(0))(1:44)|45|902|46|(1:48)|49|891|50|(1:52)|53|77|834|78|(0)|84|85|935|(0)(0)|93|123|(0)|170|949|171|(0)|177|178|944|(0)(0)|218|(1:219)|951|251|280|840|281|(0)(0)|420|881|421|(0)(0)|536|(0)|539|(0)(0)|563|(0)(0)|584|(0)|587|(0)|590|(0)(0)|596|617|(0)(0)|635|871|636|(0)|639|(0)|642|(0)(0)|680|(1:681)|963|734|(0)|737|(0)(0)|749|764|(0)|774|(0)|777|(0)(0)|783|801|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0990, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0991, code lost:
    
        r7 = r7;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x09a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x09a3, code lost:
    
        r12 = r23;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0f1c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0f1e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0f1f, code lost:
    
        r28 = r7;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0f22, code lost:
    
        r1 = r0;
        r14 = r14;
        r28 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x1626, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x1627, code lost:
    
        r7 = "";
        r14 = "currentApplication";
        r5 = r28;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x1bd4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x1bd5, code lost:
    
        r10 = r28;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x2e4c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x2e4d, code lost:
    
        r9 = new java.lang.Object[1];
        g(android.text.TextUtils.indexOf(r7, r7, 0, 0) + 10, new char[]{'\b', 1, 19, 6, 24, '\f', '\b', 3, 24, '\f'}, (byte) (3 - android.text.TextUtils.getTrimmedLength(r7)), r9);
        r4 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x2e6e, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x2e85, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x2e89, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
        r11 = -1;
        r12 = 0;
        r4 = (((long) 1) & ((((long) 0) << 32) | (r11 - ((r11 >> 63) << 32)))) | ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x2eb5, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x2eb9, code lost:
    
        if (r1 == null) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x2ebb, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 42, (char) (android.text.TextUtils.lastIndexOf(r7, '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x2ee6, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x2eee, code lost:
    
        r9 = new java.lang.Object[]{-1160685475, java.lang.Long.valueOf(r4), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 56 - (android.os.Process.myTid() >> 22), (char) android.widget.ExpandableListView.getPackedPositionGroup(0));
        r4 = com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.$$j;
        r11 = new java.lang.Object[1];
        j(r4[8], r4[96], r4[55], r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a3c A[Catch: all -> 0x03e0, TryCatch #28 {all -> 0x03e0, blocks: (B:274:0x0f89, B:276:0x0f8f, B:277:0x0fb7, B:414:0x16de, B:416:0x16e4, B:417:0x1709, B:530:0x1c69, B:532:0x1c6f, B:533:0x1c9f, B:768:0x3243, B:770:0x3249, B:771:0x3272, B:805:0x3571, B:807:0x3577, B:808:0x359b, B:785:0x33bb, B:787:0x33de, B:788:0x3433, B:728:0x2eb5, B:730:0x2ebb, B:731:0x2ee6, B:627:0x27e2, B:629:0x27e8, B:630:0x280d, B:632:0x2847, B:633:0x288f, B:598:0x2472, B:600:0x2487, B:601:0x24b8, B:603:0x24ec, B:604:0x2565, B:576:0x2122, B:578:0x2128, B:579:0x214f, B:581:0x2189, B:582:0x21d4, B:546:0x1e46, B:548:0x1e5b, B:549:0x1e8c, B:164:0x0a36, B:166:0x0a3c, B:167:0x0a64, B:71:0x056d, B:73:0x0573, B:74:0x059e, B:19:0x01dd, B:21:0x01e3, B:22:0x020d, B:24:0x0351, B:26:0x0382, B:27:0x03da), top: B:887:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ba5 A[Catch: all -> 0x0f1e, TRY_ENTER, TRY_LEAVE, TryCatch #62 {all -> 0x0f1e, blocks: (B:171:0x0af6, B:177:0x0b46, B:218:0x0dc3, B:219:0x0dc7, B:221:0x0dcd, B:224:0x0de9, B:186:0x0ba5, B:204:0x0cb1, B:207:0x0cf8, B:213:0x0d65, B:217:0x0dbb), top: B:949:0x0af6 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0dcd A[Catch: all -> 0x0f1e, TryCatch #62 {all -> 0x0f1e, blocks: (B:171:0x0af6, B:177:0x0b46, B:218:0x0dc3, B:219:0x0dc7, B:221:0x0dcd, B:224:0x0de9, B:186:0x0ba5, B:204:0x0cb1, B:207:0x0cf8, B:213:0x0d65, B:217:0x0dbb), top: B:949:0x0af6 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0f8f A[Catch: all -> 0x03e0, TryCatch #28 {all -> 0x03e0, blocks: (B:274:0x0f89, B:276:0x0f8f, B:277:0x0fb7, B:414:0x16de, B:416:0x16e4, B:417:0x1709, B:530:0x1c69, B:532:0x1c6f, B:533:0x1c9f, B:768:0x3243, B:770:0x3249, B:771:0x3272, B:805:0x3571, B:807:0x3577, B:808:0x359b, B:785:0x33bb, B:787:0x33de, B:788:0x3433, B:728:0x2eb5, B:730:0x2ebb, B:731:0x2ee6, B:627:0x27e2, B:629:0x27e8, B:630:0x280d, B:632:0x2847, B:633:0x288f, B:598:0x2472, B:600:0x2487, B:601:0x24b8, B:603:0x24ec, B:604:0x2565, B:576:0x2122, B:578:0x2128, B:579:0x214f, B:581:0x2189, B:582:0x21d4, B:546:0x1e46, B:548:0x1e5b, B:549:0x1e8c, B:164:0x0a36, B:166:0x0a3c, B:167:0x0a64, B:71:0x056d, B:73:0x0573, B:74:0x059e, B:19:0x01dd, B:21:0x01e3, B:22:0x020d, B:24:0x0351, B:26:0x0382, B:27:0x03da), top: B:887:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x1097 A[Catch: all -> 0x1626, PHI: r1 r5
  0x1097: PHI (r1v576 java.lang.Object) = (r1v569 java.lang.Object), (r1v574 java.lang.Object) binds: [B:282:0x1045, B:283:0x1047] A[DONT_GENERATE, DONT_INLINE]
  0x1097: PHI (r5v339 ??) = (r5v443 ??), (r5v444 ??) binds: [B:282:0x1045, B:283:0x1047] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x1626, blocks: (B:281:0x1041, B:288:0x1097, B:291:0x1104, B:311:0x1197), top: B:840:0x1041 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x10be A[Catch: all -> 0x108d, TRY_ENTER, TRY_LEAVE, TryCatch #50 {all -> 0x108d, blocks: (B:283:0x1047, B:290:0x10be, B:295:0x1127, B:297:0x112d, B:298:0x116e, B:301:0x117f, B:303:0x1183, B:307:0x118f), top: B:929:0x1047 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x14bd A[Catch: all -> 0x1619, TryCatch #56 {all -> 0x1619, blocks: (B:343:0x14b3, B:344:0x14b7, B:346:0x14bd, B:349:0x14da, B:313:0x11a5, B:330:0x1393, B:333:0x13da, B:339:0x1450, B:342:0x14ab), top: B:938:0x11a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x16e4 A[Catch: all -> 0x03e0, TryCatch #28 {all -> 0x03e0, blocks: (B:274:0x0f89, B:276:0x0f8f, B:277:0x0fb7, B:414:0x16de, B:416:0x16e4, B:417:0x1709, B:530:0x1c69, B:532:0x1c6f, B:533:0x1c9f, B:768:0x3243, B:770:0x3249, B:771:0x3272, B:805:0x3571, B:807:0x3577, B:808:0x359b, B:785:0x33bb, B:787:0x33de, B:788:0x3433, B:728:0x2eb5, B:730:0x2ebb, B:731:0x2ee6, B:627:0x27e2, B:629:0x27e8, B:630:0x280d, B:632:0x2847, B:633:0x288f, B:598:0x2472, B:600:0x2487, B:601:0x24b8, B:603:0x24ec, B:604:0x2565, B:576:0x2122, B:578:0x2128, B:579:0x214f, B:581:0x2189, B:582:0x21d4, B:546:0x1e46, B:548:0x1e5b, B:549:0x1e8c, B:164:0x0a36, B:166:0x0a3c, B:167:0x0a64, B:71:0x056d, B:73:0x0573, B:74:0x059e, B:19:0x01dd, B:21:0x01e3, B:22:0x020d, B:24:0x0351, B:26:0x0382, B:27:0x03da), top: B:887:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x17ee A[Catch: all -> 0x1bd4, PHI: r1
  0x17ee: PHI (r1v505 java.lang.Object) = (r1v498 java.lang.Object), (r1v503 java.lang.Object) binds: [B:422:0x179d, B:423:0x179f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x1bd4, blocks: (B:421:0x1799, B:428:0x17ee, B:437:0x185a, B:455:0x1964, B:458:0x19a9), top: B:881:0x1799 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x17fb  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x185a A[Catch: all -> 0x1bd4, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x1bd4, blocks: (B:421:0x1799, B:428:0x17ee, B:437:0x185a, B:455:0x1964, B:458:0x19a9), top: B:881:0x1799 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1a89 A[Catch: all -> 0x1bb4, TryCatch #9 {all -> 0x1bb4, blocks: (B:470:0x1a7f, B:471:0x1a83, B:473:0x1a89, B:476:0x1aa3, B:460:0x19b8, B:466:0x1a1b, B:469:0x1a77), top: B:852:0x19b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x1c6f A[Catch: all -> 0x03e0, TryCatch #28 {all -> 0x03e0, blocks: (B:274:0x0f89, B:276:0x0f8f, B:277:0x0fb7, B:414:0x16de, B:416:0x16e4, B:417:0x1709, B:530:0x1c69, B:532:0x1c6f, B:533:0x1c9f, B:768:0x3243, B:770:0x3249, B:771:0x3272, B:805:0x3571, B:807:0x3577, B:808:0x359b, B:785:0x33bb, B:787:0x33de, B:788:0x3433, B:728:0x2eb5, B:730:0x2ebb, B:731:0x2ee6, B:627:0x27e2, B:629:0x27e8, B:630:0x280d, B:632:0x2847, B:633:0x288f, B:598:0x2472, B:600:0x2487, B:601:0x24b8, B:603:0x24ec, B:604:0x2565, B:576:0x2122, B:578:0x2128, B:579:0x214f, B:581:0x2189, B:582:0x21d4, B:546:0x1e46, B:548:0x1e5b, B:549:0x1e8c, B:164:0x0a36, B:166:0x0a3c, B:167:0x0a64, B:71:0x056d, B:73:0x0573, B:74:0x059e, B:19:0x01dd, B:21:0x01e3, B:22:0x020d, B:24:0x0351, B:26:0x0382, B:27:0x03da), top: B:887:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1d2c  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1d75  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1e26  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x1fc7  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x20cd  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x22c9  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2333  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x2389  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x2453  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x269b  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x279d  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x29bf A[Catch: all -> 0x2e4c, TryCatch #19 {all -> 0x2e4c, blocks: (B:636:0x29b9, B:638:0x29bf, B:639:0x2a01, B:641:0x2a28, B:642:0x2a6a, B:644:0x2a7e, B:646:0x2a87, B:647:0x2ac7, B:680:0x2d10, B:681:0x2d14, B:683:0x2d1a, B:686:0x2d32, B:689:0x2d3f, B:691:0x2d42, B:703:0x2e26, B:705:0x2e2c, B:706:0x2e2d, B:708:0x2e2f, B:710:0x2e36, B:711:0x2e37, B:650:0x2ad6, B:652:0x2ada, B:656:0x2ae6, B:658:0x2aec, B:670:0x2bfa, B:672:0x2c00, B:673:0x2c43, B:675:0x2c6d, B:676:0x2caf, B:678:0x2cc5, B:679:0x2d0a, B:713:0x2e39, B:715:0x2e40, B:716:0x2e41, B:718:0x2e43, B:720:0x2e4a, B:721:0x2e4b, B:699:0x2da2, B:694:0x2d6d, B:696:0x2d73, B:697:0x2d9a, B:665:0x2b5b, B:667:0x2b7a, B:668:0x2bee, B:660:0x2b0c, B:662:0x2b21, B:663:0x2b54), top: B:871:0x29b9, outer: #17, inners: #1, #7, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x2a28 A[Catch: all -> 0x2e4c, TryCatch #19 {all -> 0x2e4c, blocks: (B:636:0x29b9, B:638:0x29bf, B:639:0x2a01, B:641:0x2a28, B:642:0x2a6a, B:644:0x2a7e, B:646:0x2a87, B:647:0x2ac7, B:680:0x2d10, B:681:0x2d14, B:683:0x2d1a, B:686:0x2d32, B:689:0x2d3f, B:691:0x2d42, B:703:0x2e26, B:705:0x2e2c, B:706:0x2e2d, B:708:0x2e2f, B:710:0x2e36, B:711:0x2e37, B:650:0x2ad6, B:652:0x2ada, B:656:0x2ae6, B:658:0x2aec, B:670:0x2bfa, B:672:0x2c00, B:673:0x2c43, B:675:0x2c6d, B:676:0x2caf, B:678:0x2cc5, B:679:0x2d0a, B:713:0x2e39, B:715:0x2e40, B:716:0x2e41, B:718:0x2e43, B:720:0x2e4a, B:721:0x2e4b, B:699:0x2da2, B:694:0x2d6d, B:696:0x2d73, B:697:0x2d9a, B:665:0x2b5b, B:667:0x2b7a, B:668:0x2bee, B:660:0x2b0c, B:662:0x2b21, B:663:0x2b54), top: B:871:0x29b9, outer: #17, inners: #1, #7, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:644:0x2a7e A[Catch: all -> 0x2e4c, TryCatch #19 {all -> 0x2e4c, blocks: (B:636:0x29b9, B:638:0x29bf, B:639:0x2a01, B:641:0x2a28, B:642:0x2a6a, B:644:0x2a7e, B:646:0x2a87, B:647:0x2ac7, B:680:0x2d10, B:681:0x2d14, B:683:0x2d1a, B:686:0x2d32, B:689:0x2d3f, B:691:0x2d42, B:703:0x2e26, B:705:0x2e2c, B:706:0x2e2d, B:708:0x2e2f, B:710:0x2e36, B:711:0x2e37, B:650:0x2ad6, B:652:0x2ada, B:656:0x2ae6, B:658:0x2aec, B:670:0x2bfa, B:672:0x2c00, B:673:0x2c43, B:675:0x2c6d, B:676:0x2caf, B:678:0x2cc5, B:679:0x2d0a, B:713:0x2e39, B:715:0x2e40, B:716:0x2e41, B:718:0x2e43, B:720:0x2e4a, B:721:0x2e4b, B:699:0x2da2, B:694:0x2d6d, B:696:0x2d73, B:697:0x2d9a, B:665:0x2b5b, B:667:0x2b7a, B:668:0x2bee, B:660:0x2b0c, B:662:0x2b21, B:663:0x2b54), top: B:871:0x29b9, outer: #17, inners: #1, #7, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2ad2  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x2d1a A[Catch: all -> 0x2e4c, TryCatch #19 {all -> 0x2e4c, blocks: (B:636:0x29b9, B:638:0x29bf, B:639:0x2a01, B:641:0x2a28, B:642:0x2a6a, B:644:0x2a7e, B:646:0x2a87, B:647:0x2ac7, B:680:0x2d10, B:681:0x2d14, B:683:0x2d1a, B:686:0x2d32, B:689:0x2d3f, B:691:0x2d42, B:703:0x2e26, B:705:0x2e2c, B:706:0x2e2d, B:708:0x2e2f, B:710:0x2e36, B:711:0x2e37, B:650:0x2ad6, B:652:0x2ada, B:656:0x2ae6, B:658:0x2aec, B:670:0x2bfa, B:672:0x2c00, B:673:0x2c43, B:675:0x2c6d, B:676:0x2caf, B:678:0x2cc5, B:679:0x2d0a, B:713:0x2e39, B:715:0x2e40, B:716:0x2e41, B:718:0x2e43, B:720:0x2e4a, B:721:0x2e4b, B:699:0x2da2, B:694:0x2d6d, B:696:0x2d73, B:697:0x2d9a, B:665:0x2b5b, B:667:0x2b7a, B:668:0x2bee, B:660:0x2b0c, B:662:0x2b21, B:663:0x2b54), top: B:871:0x29b9, outer: #17, inners: #1, #7, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x2f73  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x2fc3  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x3078  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x3224  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x3303  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x3350  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x339d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x3553  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x0afc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x179f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:896:0x0628 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x1047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06d6 A[Catch: all -> 0x09a2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x09a2, blocks: (B:78:0x0622, B:84:0x0670, B:94:0x06d6), top: B:834:0x0622 }] */
    /* JADX WARN: Removed duplicated region for block: B:977:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v204 */
    /* JADX WARN: Type inference failed for: r10v205 */
    /* JADX WARN: Type inference failed for: r10v206 */
    /* JADX WARN: Type inference failed for: r10v207 */
    /* JADX WARN: Type inference failed for: r10v208 */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60, types: [long] */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v73, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r12v191 */
    /* JADX WARN: Type inference failed for: r12v192 */
    /* JADX WARN: Type inference failed for: r12v193 */
    /* JADX WARN: Type inference failed for: r12v194 */
    /* JADX WARN: Type inference failed for: r12v195 */
    /* JADX WARN: Type inference failed for: r12v197 */
    /* JADX WARN: Type inference failed for: r12v201 */
    /* JADX WARN: Type inference failed for: r12v202 */
    /* JADX WARN: Type inference failed for: r12v203 */
    /* JADX WARN: Type inference failed for: r12v204 */
    /* JADX WARN: Type inference failed for: r12v206 */
    /* JADX WARN: Type inference failed for: r12v217 */
    /* JADX WARN: Type inference failed for: r12v218 */
    /* JADX WARN: Type inference failed for: r12v233 */
    /* JADX WARN: Type inference failed for: r12v234 */
    /* JADX WARN: Type inference failed for: r12v235 */
    /* JADX WARN: Type inference failed for: r12v236 */
    /* JADX WARN: Type inference failed for: r12v237 */
    /* JADX WARN: Type inference failed for: r12v238 */
    /* JADX WARN: Type inference failed for: r12v239 */
    /* JADX WARN: Type inference failed for: r12v240 */
    /* JADX WARN: Type inference failed for: r12v241 */
    /* JADX WARN: Type inference failed for: r12v242 */
    /* JADX WARN: Type inference failed for: r12v243 */
    /* JADX WARN: Type inference failed for: r12v244 */
    /* JADX WARN: Type inference failed for: r12v245 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r14v130 */
    /* JADX WARN: Type inference failed for: r14v131 */
    /* JADX WARN: Type inference failed for: r14v132 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v143 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v146 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v149 */
    /* JADX WARN: Type inference failed for: r14v150 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v158 */
    /* JADX WARN: Type inference failed for: r14v159 */
    /* JADX WARN: Type inference failed for: r14v160 */
    /* JADX WARN: Type inference failed for: r14v162 */
    /* JADX WARN: Type inference failed for: r14v163 */
    /* JADX WARN: Type inference failed for: r14v173 */
    /* JADX WARN: Type inference failed for: r14v174 */
    /* JADX WARN: Type inference failed for: r14v175 */
    /* JADX WARN: Type inference failed for: r14v176 */
    /* JADX WARN: Type inference failed for: r14v177 */
    /* JADX WARN: Type inference failed for: r14v178 */
    /* JADX WARN: Type inference failed for: r14v179 */
    /* JADX WARN: Type inference failed for: r14v180 */
    /* JADX WARN: Type inference failed for: r14v181 */
    /* JADX WARN: Type inference failed for: r14v182 */
    /* JADX WARN: Type inference failed for: r14v183 */
    /* JADX WARN: Type inference failed for: r14v184 */
    /* JADX WARN: Type inference failed for: r14v185 */
    /* JADX WARN: Type inference failed for: r14v186 */
    /* JADX WARN: Type inference failed for: r14v187 */
    /* JADX WARN: Type inference failed for: r14v188 */
    /* JADX WARN: Type inference failed for: r14v189 */
    /* JADX WARN: Type inference failed for: r14v190 */
    /* JADX WARN: Type inference failed for: r14v191 */
    /* JADX WARN: Type inference failed for: r14v192 */
    /* JADX WARN: Type inference failed for: r14v193 */
    /* JADX WARN: Type inference failed for: r14v194 */
    /* JADX WARN: Type inference failed for: r14v195 */
    /* JADX WARN: Type inference failed for: r14v196 */
    /* JADX WARN: Type inference failed for: r14v197 */
    /* JADX WARN: Type inference failed for: r14v198 */
    /* JADX WARN: Type inference failed for: r14v199 */
    /* JADX WARN: Type inference failed for: r14v200 */
    /* JADX WARN: Type inference failed for: r14v201 */
    /* JADX WARN: Type inference failed for: r14v202 */
    /* JADX WARN: Type inference failed for: r14v203 */
    /* JADX WARN: Type inference failed for: r14v204 */
    /* JADX WARN: Type inference failed for: r14v205 */
    /* JADX WARN: Type inference failed for: r14v206 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r28v100 */
    /* JADX WARN: Type inference failed for: r28v105 */
    /* JADX WARN: Type inference failed for: r28v108 */
    /* JADX WARN: Type inference failed for: r28v109 */
    /* JADX WARN: Type inference failed for: r28v110 */
    /* JADX WARN: Type inference failed for: r28v162 */
    /* JADX WARN: Type inference failed for: r28v163 */
    /* JADX WARN: Type inference failed for: r28v164 */
    /* JADX WARN: Type inference failed for: r28v165 */
    /* JADX WARN: Type inference failed for: r28v166 */
    /* JADX WARN: Type inference failed for: r28v167 */
    /* JADX WARN: Type inference failed for: r28v168 */
    /* JADX WARN: Type inference failed for: r28v169 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v18 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v23 */
    /* JADX WARN: Type inference failed for: r28v24 */
    /* JADX WARN: Type inference failed for: r28v55 */
    /* JADX WARN: Type inference failed for: r28v61 */
    /* JADX WARN: Type inference failed for: r28v62 */
    /* JADX WARN: Type inference failed for: r28v63 */
    /* JADX WARN: Type inference failed for: r28v64 */
    /* JADX WARN: Type inference failed for: r28v65 */
    /* JADX WARN: Type inference failed for: r28v66 */
    /* JADX WARN: Type inference failed for: r28v71 */
    /* JADX WARN: Type inference failed for: r28v72 */
    /* JADX WARN: Type inference failed for: r28v73 */
    /* JADX WARN: Type inference failed for: r28v74 */
    /* JADX WARN: Type inference failed for: r28v75 */
    /* JADX WARN: Type inference failed for: r28v76 */
    /* JADX WARN: Type inference failed for: r28v77 */
    /* JADX WARN: Type inference failed for: r28v79 */
    /* JADX WARN: Type inference failed for: r28v80 */
    /* JADX WARN: Type inference failed for: r28v85 */
    /* JADX WARN: Type inference failed for: r28v88 */
    /* JADX WARN: Type inference failed for: r28v89 */
    /* JADX WARN: Type inference failed for: r28v90 */
    /* JADX WARN: Type inference failed for: r28v91 */
    /* JADX WARN: Type inference failed for: r28v93 */
    /* JADX WARN: Type inference failed for: r28v94 */
    /* JADX WARN: Type inference failed for: r28v95 */
    /* JADX WARN: Type inference failed for: r28v96 */
    /* JADX WARN: Type inference failed for: r28v97 */
    /* JADX WARN: Type inference failed for: r28v99 */
    /* JADX WARN: Type inference failed for: r29v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v31 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v146 */
    /* JADX WARN: Type inference failed for: r3v147 */
    /* JADX WARN: Type inference failed for: r3v161 */
    /* JADX WARN: Type inference failed for: r3v163, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v165 */
    /* JADX WARN: Type inference failed for: r3v181 */
    /* JADX WARN: Type inference failed for: r3v182 */
    /* JADX WARN: Type inference failed for: r3v183 */
    /* JADX WARN: Type inference failed for: r3v184 */
    /* JADX WARN: Type inference failed for: r3v185 */
    /* JADX WARN: Type inference failed for: r3v186 */
    /* JADX WARN: Type inference failed for: r3v187 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v325 */
    /* JADX WARN: Type inference failed for: r4v363 */
    /* JADX WARN: Type inference failed for: r4v536, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v332 */
    /* JADX WARN: Type inference failed for: r5v333 */
    /* JADX WARN: Type inference failed for: r5v338 */
    /* JADX WARN: Type inference failed for: r5v339 */
    /* JADX WARN: Type inference failed for: r5v340 */
    /* JADX WARN: Type inference failed for: r5v343, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v344 */
    /* JADX WARN: Type inference failed for: r5v345 */
    /* JADX WARN: Type inference failed for: r5v346 */
    /* JADX WARN: Type inference failed for: r5v347 */
    /* JADX WARN: Type inference failed for: r5v348 */
    /* JADX WARN: Type inference failed for: r5v368 */
    /* JADX WARN: Type inference failed for: r5v390 */
    /* JADX WARN: Type inference failed for: r5v391 */
    /* JADX WARN: Type inference failed for: r5v393, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v394 */
    /* JADX WARN: Type inference failed for: r5v409, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v410 */
    /* JADX WARN: Type inference failed for: r5v411 */
    /* JADX WARN: Type inference failed for: r5v421 */
    /* JADX WARN: Type inference failed for: r5v431 */
    /* JADX WARN: Type inference failed for: r5v432 */
    /* JADX WARN: Type inference failed for: r5v433 */
    /* JADX WARN: Type inference failed for: r5v434 */
    /* JADX WARN: Type inference failed for: r5v435 */
    /* JADX WARN: Type inference failed for: r5v436 */
    /* JADX WARN: Type inference failed for: r5v437 */
    /* JADX WARN: Type inference failed for: r5v438 */
    /* JADX WARN: Type inference failed for: r5v439 */
    /* JADX WARN: Type inference failed for: r5v440 */
    /* JADX WARN: Type inference failed for: r5v441 */
    /* JADX WARN: Type inference failed for: r5v442 */
    /* JADX WARN: Type inference failed for: r5v443 */
    /* JADX WARN: Type inference failed for: r5v444 */
    /* JADX WARN: Type inference failed for: r5v445 */
    /* JADX WARN: Type inference failed for: r5v446 */
    /* JADX WARN: Type inference failed for: r5v447 */
    /* JADX WARN: Type inference failed for: r5v448 */
    /* JADX WARN: Type inference failed for: r5v449 */
    /* JADX WARN: Type inference failed for: r5v450 */
    /* JADX WARN: Type inference failed for: r5v451 */
    /* JADX WARN: Type inference failed for: r5v452 */
    /* JADX WARN: Type inference failed for: r5v453 */
    /* JADX WARN: Type inference failed for: r5v454 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v220, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v250 */
    /* JADX WARN: Type inference failed for: r6v491 */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v128 */
    /* JADX WARN: Type inference failed for: r7v149 */
    /* JADX WARN: Type inference failed for: r7v172 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v174 */
    /* JADX WARN: Type inference failed for: r7v175 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v413 */
    /* JADX WARN: Type inference failed for: r8v414 */
    /* JADX WARN: Type inference failed for: r8v421, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v424 */
    /* JADX WARN: Type inference failed for: r8v425 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v257 */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MyServicesManageActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10469$r8$lambda$9TG0fImfN8xYzjbYqdNjJQlT50(MyServicesManageActivity myServicesManageActivity, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$2(myServicesManageActivity, i);
        if (i4 != 0) {
            int i5 = 14 / 0;
        }
        int i6 = component3 + 11;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void $r8$lambda$HEoLWna0JsB2oSuxBOaE_wtcUNg(MyServicesManageActivity myServicesManageActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        showQuitConfirm$lambda$6$lambda$5(myServicesManageActivity);
        int i4 = copydefault + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$IXPpJCpsulGTiio94ayW9DAcks0(MyServicesManageActivity myServicesManageActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$1(myServicesManageActivity, baseQuickAdapter, view, i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$K7cGxvbVLaOI_w9YGIeFPhEUHjE(MyServicesManageActivity myServicesManageActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        showQuitConfirm$lambda$4(myServicesManageActivity, view, str);
        int i4 = component3 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Unit m10470$r8$lambda$LKmtIpqKifG9OpDtHI9L2EZ5w(MyServicesManageActivity myServicesManageActivity, List list) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitObserve$lambda$3 = observe$lambda$3(myServicesManageActivity, list);
        int i4 = component3 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unitObserve$lambda$3;
    }

    public static void m10471$r8$lambda$bIcBoOeYL8faZFK5jrOalWNa6w(MyServicesManageActivity myServicesManageActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        m10472instrumented$1$showQuitConfirm$V(myServicesManageActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$qmi15K5f_Bww00WL0oXQPw3OPDg(MyServicesManageActivity myServicesManageActivity, LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        onCreate$lambda$0(myServicesManageActivity, localHomeFunction);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    static {
        component4 = 0;
        component1();
        int i = getRequestBeneficiariesState + 99;
        component4 = i % 128;
        int i2 = i % 2;
    }

    private static void m10472instrumented$1$showQuitConfirm$V(MyServicesManageActivity myServicesManageActivity, View view) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                showQuitConfirm$lambda$6(myServicesManageActivity, view);
                throw null;
            }
            showQuitConfirm$lambda$6(myServicesManageActivity, view);
            Callback.onClick_exit();
            int i4 = component3 + 17;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component1 = new char[]{2023, 2022, 1970, 2000, 2030, 2020, 1974, 1972, 2034, 1975, 2025, 2003, 1051, 2041, 1968, 1050, 1976, 1969, 1977, 2031, 1966, 1992, 2035, 2029, 2019, 1971, 2024, 2021, 2028, 2038, 2017, 1973, 2026, 2018, 2036, 1987};
        component2 = (char) 12828;
        ShareDataUIState = -7189888645416782699L;
    }
}
