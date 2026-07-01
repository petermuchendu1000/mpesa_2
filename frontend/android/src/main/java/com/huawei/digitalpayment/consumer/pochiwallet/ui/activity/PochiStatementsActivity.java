package com.huawei.digitalpayment.consumer.pochiwallet.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.plus.security.lite.SecLiteException;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcBaseActivity;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import com.huawei.digitalpayment.consumer.base.ui.widget.CustomerLoadMoreView;
import com.huawei.digitalpayment.consumer.base.util.PochiWalletBalanceHelper;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.utils.PochiStatementHelper;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.viewmodel.PochiStatementsViewModel;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ActivityPochiStatmentBinding;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.WithExpiryCategoryAdapter;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.consumer.sfcui.statement.adapter.MpesaStatementGroupAdapter;
import com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp;
import com.huawei.digitalpayment.consumer.sfcui.statement.resp.StatementGroup;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.consumer.commons.statements.StatementWrapper;
import com.safaricom.mpesa.logging.L;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00103\u001a\u00020\u000fH\u0014J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0012\u00108\u001a\u0002052\b\u00109\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u000205H\u0002J\b\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u000205H\u0002J\b\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u000205H\u0002J\b\u0010@\u001a\u000205H\u0002J\u001a\u0010A\u001a\u0002052\u0006\u0010B\u001a\u0002022\b\b\u0002\u0010C\u001a\u00020\u0015H\u0002J\b\u0010D\u001a\u000205H\u0002J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001a0FH\u0002J\u0010\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020\u001aH\u0002J\u0010\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020\u000fH\u0002J\b\u0010K\u001a\u000205H\u0002J\b\u0010L\u001a\u000205H\u0002J\b\u0010M\u001a\u000205H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u000e\u0010/\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/activity/PochiStatementsActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfcpochiwallet/databinding/ActivityPochiStatmentBinding;", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/viewmodel/PochiStatementsViewModel;", "<init>", "()V", "allType", "", "getAllType", "()Ljava/lang/String;", "moneyInType", "getMoneyInType", "moneyOutType", "getMoneyOutType", "limitCount", "", "getLimitCount", "()I", "typeValue", "getTypeValue", "isSearchStatus", "", "selectedType", "monthList", "", "statementGroupList", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/StatementGroup;", "monthAdapter", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/WithExpiryCategoryAdapter;", "statementGroupAdapter", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/adapter/MpesaStatementGroupAdapter;", "clickMonthFlag", "currentMonthPosition", "scrollTop", "hasCache", "toolbarContainer", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity$ToolbarContainer;", "isLoadingMore", "()Z", "setLoadingMore", "(Z)V", "canLoadMore", "getCanLoadMore", "setCanLoadMore", "canloadMoreByText", "getCanloadMoreByText", "setCanloadMoreByText", "refreshFlag", "isFirstRequest", "lastLocalMpesaStatementResp", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/LocalMpesaStatementResp;", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "title", "initView", "initRecycler", "initData", "queryStatements", "getLastStatementDataStr", "initEvent", "initObserver", "updateStatementView", "localTransactionResp", "isCache", "updateStatementsList", "filterData", "", "updateMonthView", "statementGroup", "updateFloatView", "dy", "updateSearchStatus", "setTypeSelected", "onBackPressed", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiStatementsActivity extends SfcBaseActivity<ActivityPochiStatmentBinding, PochiStatementsViewModel> {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static long component1;
    private static long component3;
    private static char[] copydefault;
    private static int getRequestBeneficiariesState;
    private boolean clickMonthFlag;
    private int currentMonthPosition;
    private boolean hasCache;
    private boolean isLoadingMore;
    private boolean isSearchStatus;
    private LocalMpesaStatementResp lastLocalMpesaStatementResp;
    private WithExpiryCategoryAdapter monthAdapter;
    private boolean refreshFlag;
    private boolean scrollTop;
    private MpesaStatementGroupAdapter statementGroupAdapter;
    private SfcPaymentBaseActivity.ToolbarContainer toolbarContainer;
    private static final byte[] $$c = {115, -125, 45, -41};
    private static final int $$f = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {0, -128, 34, -14, 68, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK};
    private static final int $$e = 130;
    private static final byte[] $$a = {19, TarHeader.LF_SYMLINK, -9, 119, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 132;
    private static int getAsAtTimestamp = 0;
    private static int component2 = 0;
    private static int equals = 1;
    private final String allType = "All";
    private final String moneyInType = "Money In";
    private final String moneyOutType = "Money Out";
    private final int limitCount = 100;
    private final String typeValue = "0.0";
    private String selectedType = "All";
    private final List<String> monthList = new ArrayList();
    private final List<StatementGroup> statementGroupList = new ArrayList();
    private boolean canLoadMore = true;
    private boolean canloadMoreByText = true;
    private boolean isFirstRequest = true;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int component1 = 1;
        private static int copydefault;
        private final Function1 component3;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault + 107;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                z = true;
                if (!(obj instanceof Observer)) {
                    return true;
                }
            } else {
                z = false;
                if (!(obj instanceof Observer)) {
                    return false;
                }
            }
            int i4 = i3 + 71;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return obj instanceof FunctionAdapter ? Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate()) : z;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component3;
            int i5 = i3 + 53;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 67;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 57;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = component1 + 71;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.$$c
            int r8 = r8 + 102
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.$$g(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.$$a
            int r1 = 28 - r5
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = 27 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.d(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.$$d
            int r8 = r8 * 6
            int r8 = 16 - r8
            int r6 = r6 * 16
            int r6 = 99 - r6
            int r7 = r7 * 15
            int r7 = 19 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-16)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.f(byte, byte, short, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = equals + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = pochiStatementsActivity.binding;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return binding;
    }

    public static final boolean access$getClickMonthFlag$p(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = pochiStatementsActivity.clickMonthFlag;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final boolean access$getRefreshFlag$p(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean z = pochiStatementsActivity.refreshFlag;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final List access$getStatementGroupList$p(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<StatementGroup> list = pochiStatementsActivity.statementGroupList;
        int i5 = i2 + 73;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final String access$getTAG$p(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = pochiStatementsActivity.TAG;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = equals + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final void access$setClickMonthFlag$p(PochiStatementsActivity pochiStatementsActivity, boolean z) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        pochiStatementsActivity.clickMonthFlag = z;
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        int i6 = i2 + 3;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$updateFloatView(PochiStatementsActivity pochiStatementsActivity, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        pochiStatementsActivity.updateFloatView(i);
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
    }

    public static final void access$updateMonthView(PochiStatementsActivity pochiStatementsActivity, StatementGroup statementGroup) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        pochiStatementsActivity.updateMonthView(statementGroup);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component2 + 111;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$updateStatementsList(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = equals + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        pochiStatementsActivity.updateStatementsList();
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = equals + 15;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAllType() {
        int i = 2 % 2;
        int i2 = equals + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.allType;
        int i5 = i3 + 47;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMoneyInType() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.moneyInType;
        int i5 = i3 + 75;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final String getMoneyOutType() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.moneyOutType;
        int i4 = i2 + 53;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getLimitCount() {
        int i = 2 % 2;
        int i2 = equals + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.limitCount;
        if (i3 != 0) {
            int i5 = 53 / 0;
        }
        return i4;
    }

    public final String getTypeValue() {
        int i = 2 % 2;
        int i2 = equals + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.typeValue;
        int i5 = i3 + 101;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 59;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 34 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 63441), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - Color.argb(0, 0, 0, 0), 18 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (51269 - ExpandableListView.getPackedPositionGroup(0L)), -1883291598, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 75;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public final boolean isLoadingMore() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isLoadingMore;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLoadingMore(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        equals = i3 % 128;
        int i4 = i3 % 2;
        this.isLoadingMore = z;
        int i5 = i2 + 1;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 5;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength("") + 33, (char) (60268 - Color.argb(0, 0, 0, 0)), -834797019, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() * (component1 - 5431355972723572778L);
                    try {
                        Object[] objArr3 = {notifyVar, notifyVar};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 687, 34 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (60373 - (ViewConfiguration.getWindowTouchSlop() >> 8)), -1969106284, false, $$g(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault2).invoke(null, objArr3);
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
            } else {
                int i5 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, (char) (60268 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -834797019, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.MeasureSpec.getSize(0), 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (60373 - TextUtils.indexOf("", "", 0)), -1969106284, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(686 - ImageFormat.getBitsPerPixel(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (char) (Color.blue(0) + 60373), -1969106284, false, $$g(b10, b11, (byte) (b11 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i6 = $11 + 39;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final boolean getCanLoadMore() {
        int i = 2 % 2;
        int i2 = equals + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.canLoadMore;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return z;
    }

    public final void setCanLoadMore(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.canLoadMore = z;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final boolean getCanloadMoreByText() {
        int i = 2 % 2;
        int i2 = equals + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.canloadMoreByText;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return z;
    }

    public final void setCanloadMoreByText(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        equals = i3 % 128;
        int i4 = i3 % 2;
        this.canloadMoreByText = z;
        int i5 = i2 + 9;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.layout.activity_pochi_statment;
            throw null;
        }
        int i4 = R.layout.activity_pochi_statment;
        int i5 = equals + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static void e(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 125;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 5;
        }
        while (cancelnotification.copydefault < i2) {
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i + i8])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - (KeyEvent.getMaxKeyCode() >> 16), View.resolveSizeAndState(0, 0, 0) + 34, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1159210934, false, $$g(b2, b3, (byte) (b3 | 19)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(component3), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 3608, TextUtils.lastIndexOf("", '0', 0) + 30, (char) (7171 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1951385784, false, $$g(b4, b5, (byte) (b5 | Ascii.SI)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 4013, 23 - TextUtils.lastIndexOf("", '0'), (char) (27760 - Process.getGidForName("")), -1529629956, false, $$g(b6, b7, (byte) (b7 | 20)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
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
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarSize() >> 8) + 24, (char) (27761 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -1529629956, false, $$g(b8, b9, (byte) (b9 | 20)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i9 = $11 + 105;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/huawei/digitalpayment/consumer/pochiwallet/ui/activity/PochiStatementsActivity$initEvent$5", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "onScrollStateChanged", "newState", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5 extends RecyclerView.OnScrollListener {
        private static int ShareDataUIState = 1;
        private static int component2;
        public static int component3;
        public static int copydefault;

        AnonymousClass5() {
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                super.onScrolled(recyclerView, dx, dy);
                PochiStatementsActivity.access$updateFloatView(PochiStatementsActivity.this, dy);
                PochiStatementsActivity.access$getClickMonthFlag$p(PochiStatementsActivity.this);
                throw null;
            }
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, dx, dy);
            PochiStatementsActivity.access$updateFloatView(PochiStatementsActivity.this, dy);
            if (PochiStatementsActivity.access$getClickMonthFlag$p(PochiStatementsActivity.this)) {
                return;
            }
            if (!TextUtils.isEmpty(((ActivityPochiStatmentBinding) PochiStatementsActivity.access$getBinding$p(PochiStatementsActivity.this)).inputSearch.getText())) {
                int i3 = component2 + 125;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            } else {
                if (PochiStatementsActivity.access$getRefreshFlag$p(PochiStatementsActivity.this)) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                L l = L.INSTANCE;
                String strAccess$getTAG$p = PochiStatementsActivity.access$getTAG$p(PochiStatementsActivity.this);
                Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$p, "");
                l.d(strAccess$getTAG$p, String.valueOf(linearLayoutManager.findFirstVisibleItemPosition()), new Object[0]);
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                PochiStatementsActivity pochiStatementsActivity = PochiStatementsActivity.this;
                PochiStatementsActivity.access$updateMonthView(pochiStatementsActivity, (StatementGroup) PochiStatementsActivity.access$getStatementGroupList$p(pochiStatementsActivity).get(iFindFirstVisibleItemPosition));
            }
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (newState == 0) {
                int i2 = component2 + 69;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                PochiStatementsActivity.access$setClickMonthFlag$p(PochiStatementsActivity.this, false);
                int i4 = component2 + 61;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 4;
                }
            }
        }

        public static int component3() {
            int i = component3;
            int i2 = i % 7592432;
            component3 = i + 1;
            if (i2 != 0) {
                return copydefault;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            copydefault = iMaxMemory;
            return iMaxMemory;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) + 40211, new char[]{53825, 28539, 43054, 58829, 9883, 24640, 48506, 65149, 15335, 29838, 46620, 62263, 3118, 18942, 35493, 50270, 259, 17110}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 111, new char[]{19657, 8963, 42139, 8621, 19620, 26586, 11662, 60452, 24109}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = equals + 65;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) + 13277, new char[]{53825, 57779, 46526, 18853, 7611, 53688, 58794, 47589, 19881, 437, 54706, 59857, 48573, 29082, 1410, 55706, 60806, 41348, 30110, 2462, 56752, 37257, 42476, 31230, 3577, 49649}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() - 1, new char[]{49075, 51517, 3010, 47594, 49104, 36328, 33520, 29816, 44374, 40563, 36982, 22987, 39619, 41197, 42478, 19299, 34896, 46460, 52086, 48355, 62940, 18419}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i4 = equals + 55;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, (ViewConfiguration.getTapTimeout() >> 16) + 42, (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) + 13889, new char[]{53825, 58488, 48851, 29029, 2962, 56818, 37893, 44770, 24856, 15146, 52700, 33842, 24213, 4350, 11019, 64953, 46162, 20064, 199, 56102, 60885, 42982, 32320, 12530, 51980, 40289, 22428, 28207, 8414, 64188, 36120, 18425, 7781, 53440, 60146, 48466, 30646, 3612, 49189, 39558, 44350, 26525, 14842, 61534, 35512, 23834, 6010, 10637}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{28466, 21482, 22900, 63018, 28416, 5934, 53255, 15355, 32130, 1278, 49879, 5673, 18944, 14892, 63237, 1278, 22667, 12284, 39383, 62249, 9473, 56698, 35340, 57768, 13186, 62124, 48260, 56441, '\n', 57385, 41296, 51961, 61060, 38386, 21378, 47400, 64258, 35698, 17495, 38824, 51671, 47278, 30341, 33321, 54865, 44658, 6925, 28923, 42196, 17407, 3457, 28539, 45398, 29048, 15957, 23976, 40837, 26354, 8402, 18546, 27652, 5241, 54541, 9970, 31361, 2547, 51074, 5491}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, new char[]{52161, 26914, 34123, 56137, 52209, 11748, 3123, 5837, 55664, 15924, 7865, 15132, 61175, 225, 11112, 10703, 64630, 5426, 17854, 56907, 33188, 59361, 22078, 52380, 38771, 51253, 24755, 61727, 42229, 56038, 32061, 59290, 18981, 44849, 36792, 37967, 24561, 45492, 39016, 47769, 28016, 33382, 43699, 44876, 29430, 38068, 50994, 23966, 'q', 31035, 53689, 16970, 5616, 19381, 57960, 28816, 15216, 23602, 64699, 25931, 51360, 12007, 2355, 2971, 56951, 13110, 7102, 14410}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) + SecLiteException.ERROR_API_KEY_OR_SIGN, new char[]{17981, 23325, 55008, 16715, 18005, 8137, 24532, 36059, 21710, 3079, 19727, 41220, 25355, 12936, 30872, 45980, 29070, 10075, 5652, 17438, 3084, 54667, 1426, 22169, 6793, 64010, 13123, 27465, 10515, 59593, 11976, 32217, 51160, 40284, 56404, 3656, 53852, 33742, 52180, 8325, 57562, 45128, 63809, 13657, 65369, 42702, 38097, 51166, 36316, 19279, 33349, 55301, 39006, 31186, 45517, 60036, 46812, 28237, 44873, 65284, 17748, 7379, 23239, 37326, 21454, 329, 18447, 41565, 28175, 14226, 26565, 46301, 31960, 9299, 5460, 18776}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 44130, new char[]{53785, 32369, 35567, 55145, 25586, 35944}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() - 3, new char[]{41713, 63559, 27138, 46600, 41621, 48342, 58147, 31710, 45125, 44884, 61856, 22110, 34780, 37335, 50290, 17616, 38209, 33866, 43766, 45917, 59588, 30417, 47471, 41353, 65093, 22871, 36768, 40005, 52679, 19330, 37494, 35469, 9033, 15955, 24827, 63838, 13968, 8403, 30581, 55256}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, TextUtils.indexOf("", "", 0) + 56, (char) ((-1) - MotionEvent.axisFromString("")), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2405;
            int iRgb = (-16777190) - Color.rgb(0, 0, 0);
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            d((byte) (-bArr[38]), bArr[12], (byte) (-bArr[22]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, iRgb, deadChar, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i6 = component2 + 47;
            equals = i6 % 128;
            int i7 = i6 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int longPressTimeout = 2405 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                Object[] objArr14 = new Object[1];
                d(r3[95], r3[31], (byte) (-$$a[22]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, pressedStateDuration, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{26170, 45740, 32149, 32535, 26192, 63085, 62627, 45718, 29844, 58848, 58932, 40729, 17245, 56098, 54150, 36238, 20937, 52984, 48432, 31258}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).length() + 12966, new char[]{53833, 57571, 46859, 17851, 6344, 12042, 64958, 45256, 18256, 5534, 10453, 65381, 36279, 16436, 5990, 9612}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 633227765};
                int iBlue = Color.blue(0);
                Object[] objArr18 = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) + 13277, new char[]{53825, 57779, 46526, 18853, 7611, 53688, 58794, 47589, 19881, 437, 54706, 59857, 48573, 29082, 1410, 55706, 60806, 41348, 30110, 2462, 56752, 37257, 42476, 31230, 3577, 49649}, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                c((-1) - MotionEvent.axisFromString(""), new char[]{49075, 51517, 3010, 47594, 49104, 36328, 33520, 29816, 44374, 40563, 36982, 22987, 39619, 41197, 42478, 19299, 34896, 46460, 52086, 48355, 62940, 18419}, objArr19);
                int length = ((Context) cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 139;
                Object[] objArr20 = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) + 13272, new char[]{53825, 57779, 46526, 18853, 7611, 53688, 58794, 47589, 19881, 437, 54706, 59857, 48573, 29082, 1410, 55706, 60806, 41348, 30110, 2462, 56752, 37257, 42476, 31230, 3577, 49649}, objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{49075, 51517, 3010, 47594, 49104, 36328, 33520, 29816, 44374, 40563, 36982, 22987, 39619, 41197, 42478, 19299, 34896, 46460, 52086, 48355, 62940, 18419}, objArr21);
                Method method = cls5.getMethod((String) objArr21[0], new Class[0]);
                Object[] objArr22 = new Object[1];
                e(iBlue, length, (char) (((Context) method.invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() - 4), objArr22);
                Class<?> cls6 = Class.forName(((String) objArr22[0]).intern());
                byte b2 = (byte) (-$$d[19]);
                Object[] objArr23 = new Object[1];
                f(b2, b2, r5[0], objArr23);
                objArr = (Object[]) cls6.getMethod((String) objArr23[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iResolveOpacity = 2405 - Drawable.resolveOpacity(0, 0);
                    int iRed = 26 - Color.red(0);
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Object[] objArr24 = new Object[1];
                    d(r9[95], r9[31], (byte) (-$$a[22]), objArr24);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, iRed, keyRepeatDelay, 24929979, false, (String) objArr24[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr25 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 58860, new char[]{53825, 13383, 7766, 24649, 19051, 44132, 46706, 38961, 57863, 50178, 11860, 12304, 6709, 31782, 17962, 43202, 45789, 38138, 65262, 49380, 10999, 3318}, objArr25);
                    Class<?> cls7 = Class.forName((String) objArr25[0]);
                    Object[] objArr26 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 32, new char[]{49116, 11724, 22928, 60332, 49081, 26880, 53425, 9788, 44335, 31369, 49716, 2974, 39609, 17421, 63420, 6456, 34869, 20865, 39221}, objArr26);
                    long jLongValue = ((Long) cls7.getDeclaredMethod((String) objArr26[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int i8 = 2406 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iResolveSize = 26 - View.resolveSize(0, 0);
                        char cAlpha = (char) Color.alpha(0);
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[33];
                        byte b4 = bArr2[9];
                        Object[] objArr27 = new Object[1];
                        d(b3, b4, (byte) (b4 - 1), objArr27);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i8, iResolveSize, cAlpha, -1843538389, false, (String) objArr27[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iResolveSize2 = 2405 - View.resolveSize(0, 0);
                        int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr3 = $$a;
                        Object[] objArr28 = new Object[1];
                        d((byte) (-bArr3[38]), bArr3[12], (byte) (-bArr3[22]), objArr28);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize2, tapTimeout, keyRepeatDelay2, -2047739879, false, (String) objArr28[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i9 = ((int[]) objArr[0])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 42 - Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.indexOf("", "", 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr29 = {-903304859, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls8 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getTouchSlop() >> 8), 56 - KeyEvent.getDeadChar(0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                byte[] bArr4 = $$d;
                byte b5 = bArr4[0];
                Object[] objArr30 = new Object[1];
                f(b5, b5, (byte) (-bArr4[19]), objArr30);
                cls8.getMethod((String) objArr30[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr29);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        initToolbar(getString(R.string.pochi_statements));
        initView();
        initData();
        initEvent();
        initObserver();
    }

    private static final void initToolbar$lambda$0(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (!pochiStatementsActivity.isSearchStatus) {
            pochiStatementsActivity.finish();
        } else {
            int i2 = equals + 1;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            pochiStatementsActivity.isSearchStatus = false;
            pochiStatementsActivity.updateSearchStatus();
        }
        int i4 = component2 + 1;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainerInitToolbar = super.initToolbar(R.layout.sfc_toolbar_layout);
        this.toolbarContainer = toolbarContainerInitToolbar;
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainer = null;
        if (toolbarContainerInitToolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            toolbarContainerInitToolbar = null;
        }
        if (toolbarContainerInitToolbar.tvTitle != null) {
            SfcPaymentBaseActivity.ToolbarContainer toolbarContainer2 = this.toolbarContainer;
            if (toolbarContainer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                toolbarContainer2 = null;
            }
            TextView textView = toolbarContainer2.tvTitle;
            Intrinsics.checkNotNull(textView);
            textView.setText(title);
        }
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainer3 = this.toolbarContainer;
        if (toolbarContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            toolbarContainer3 = null;
        }
        if (toolbarContainer3.ivStart != null) {
            SfcPaymentBaseActivity.ToolbarContainer toolbarContainer4 = this.toolbarContainer;
            if (toolbarContainer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                toolbarContainer4 = null;
            }
            ImageView imageView = toolbarContainer4.ivStart;
            Intrinsics.checkNotNull(imageView);
            imageView.setImageResource(R.drawable.ic_sfc_back);
            SfcPaymentBaseActivity.ToolbarContainer toolbarContainer5 = this.toolbarContainer;
            if (toolbarContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i2 = component2 + 41;
                equals = i2 % 128;
                int i3 = i2 % 2;
                toolbarContainer5 = null;
            }
            ImageView imageView2 = toolbarContainer5.ivStart;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                @Override
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 41;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 == 0) {
                        PochiStatementsActivity.$r8$lambda$GgKB5jOLxzS6oxANMSzcf7zoN7A(this.f$0, view);
                        throw null;
                    }
                    PochiStatementsActivity.$r8$lambda$GgKB5jOLxzS6oxANMSzcf7zoN7A(this.f$0, view);
                    int i6 = copydefault + 49;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                }
            });
        }
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainer6 = this.toolbarContainer;
        if (toolbarContainer6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            toolbarContainer6 = null;
        }
        ImageView imageView3 = toolbarContainer6.ivEnd;
        if (imageView3 != null) {
            imageView3.setImageResource(R.mipmap.icon_pesa_search);
        }
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainer7 = this.toolbarContainer;
        if (toolbarContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            toolbarContainer = toolbarContainer7;
        }
        ImageView imageView4 = toolbarContainer.ivEnd;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() {
                private static int component2 = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = component2 + 69;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        PochiStatementsActivity.$r8$lambda$Jg2EOiZU4S2uVHk3QyxovaJ4d14(this.f$0, view);
                        int i6 = 0 / 0;
                    } else {
                        PochiStatementsActivity.$r8$lambda$Jg2EOiZU4S2uVHk3QyxovaJ4d14(this.f$0, view);
                    }
                    int i7 = component2 + 89;
                    component3 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 70 / 0;
                    }
                }
            });
            int i4 = component2 + 83;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void initToolbar$lambda$1(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (!pochiStatementsActivity.isSearchStatus) {
            pochiStatementsActivity.isSearchStatus = true;
            pochiStatementsActivity.updateSearchStatus();
            int i2 = component2 + 65;
            equals = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component2 + 13;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void initView() {
        CardView cardView;
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 111;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            cardView = ((ActivityPochiStatmentBinding) this.binding).cardStatementOption;
            i = 67;
        } else {
            cardView = ((ActivityPochiStatmentBinding) this.binding).cardStatementOption;
            i = 8;
        }
        cardView.setVisibility(i);
        initRecycler();
        updateSearchStatus();
        setTypeSelected();
        int i4 = equals + 73;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit initRecycler$lambda$3(PochiStatementsActivity pochiStatementsActivity, int i) {
        Object next;
        int i2 = 2 % 2;
        int i3 = equals + 33;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        } else {
            Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        }
        pochiStatementsActivity.clickMonthFlag = true;
        pochiStatementsActivity.currentMonthPosition = i;
        String str = pochiStatementsActivity.monthList.get(i);
        Iterator<T> it = pochiStatementsActivity.statementGroupList.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i4 = equals + 85;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                next = null;
                break;
            }
            int i6 = component2 + 31;
            equals = i6 % 128;
            int i7 = i6 % 2;
            next = it.next();
            if (Intrinsics.areEqual(((StatementGroup) next).getCategoryMonth(), str)) {
                break;
            }
        }
        RecyclerView.LayoutManager layoutManager = ((ActivityPochiStatmentBinding) pochiStatementsActivity.binding).rvStatements.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "");
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(CollectionsKt.indexOf((List<? extends StatementGroup>) pochiStatementsActivity.statementGroupList, (StatementGroup) next), 0);
        return Unit.INSTANCE;
    }

    private static final Unit initRecycler$lambda$4(PochiStatementsActivity pochiStatementsActivity, int i, StatementWrapper statementWrapper) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        Intrinsics.checkNotNullParameter(statementWrapper, "");
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("pochiStatementResp", statementWrapper);
        RouteUtils.routeWithExecute(pochiStatementsActivity, "/pochiWalletModule/pochiStatementsDetail", bundle);
        Unit unit = Unit.INSTANCE;
        int i3 = component2 + 19;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void initRecycler$lambda$5(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = equals + 51;
        component2 = i2 % 128;
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
            boolean z = pochiStatementsActivity.canLoadMore;
            throw null;
        }
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (pochiStatementsActivity.canLoadMore && pochiStatementsActivity.canloadMoreByText && Intrinsics.areEqual(pochiStatementsActivity.selectedType, pochiStatementsActivity.allType)) {
            int i3 = equals + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            pochiStatementsActivity.isLoadingMore = true;
            pochiStatementsActivity.queryStatements();
            return;
        }
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter2 = pochiStatementsActivity.statementGroupAdapter;
        if (mpesaStatementGroupAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = component2 + 95;
            equals = i5 % 128;
            int i6 = i5 % 2;
        } else {
            mpesaStatementGroupAdapter = mpesaStatementGroupAdapter2;
        }
        mpesaStatementGroupAdapter.getLoadMoreModule().loadMoreComplete();
    }

    private final void initRecycler() {
        int i = 2 % 2;
        this.monthAdapter = new WithExpiryCategoryAdapter(this.monthList);
        RecyclerView recyclerView = ((ActivityPochiStatmentBinding) this.binding).rvMonth;
        WithExpiryCategoryAdapter withExpiryCategoryAdapter = this.monthAdapter;
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter = null;
        if (withExpiryCategoryAdapter == null) {
            int i2 = equals + 51;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryCategoryAdapter = null;
        }
        recyclerView.setAdapter(withExpiryCategoryAdapter);
        WithExpiryCategoryAdapter withExpiryCategoryAdapter2 = this.monthAdapter;
        if (withExpiryCategoryAdapter2 == null) {
            int i4 = component2 + 105;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            withExpiryCategoryAdapter2 = null;
        }
        withExpiryCategoryAdapter2.setItemClickListener(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = component3 + 113;
                ShareDataUIState = i6 % 128;
                Object obj2 = null;
                if (i6 % 2 == 0) {
                    PochiStatementsActivity.$r8$lambda$SPOlwgiZRiBX5wawvJ_pE0LqCO8(this.f$0, ((Integer) obj).intValue());
                    obj2.hashCode();
                    throw null;
                }
                Unit unit$r8$lambda$SPOlwgiZRiBX5wawvJ_pE0LqCO8 = PochiStatementsActivity.$r8$lambda$SPOlwgiZRiBX5wawvJ_pE0LqCO8(this.f$0, ((Integer) obj).intValue());
                int i7 = component3 + 61;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    return unit$r8$lambda$SPOlwgiZRiBX5wawvJ_pE0LqCO8;
                }
                throw null;
            }
        });
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter2 = new MpesaStatementGroupAdapter(this.statementGroupList);
        this.statementGroupAdapter = mpesaStatementGroupAdapter2;
        mpesaStatementGroupAdapter2.setItemClickListener(new Function2() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = copydefault + 125;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                Unit unit$r8$lambda$SlLa_SwYd7FCA0nIs3U6j20tweI = PochiStatementsActivity.$r8$lambda$SlLa_SwYd7FCA0nIs3U6j20tweI(this.f$0, ((Integer) obj).intValue(), (StatementWrapper) obj2);
                int i8 = component2 + 41;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                return unit$r8$lambda$SlLa_SwYd7FCA0nIs3U6j20tweI;
            }
        });
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter3 = this.statementGroupAdapter;
        if (mpesaStatementGroupAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            mpesaStatementGroupAdapter3 = null;
        }
        mpesaStatementGroupAdapter3.getLoadMoreModule().setLoadMoreView(new CustomerLoadMoreView());
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter4 = this.statementGroupAdapter;
        if (mpesaStatementGroupAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            mpesaStatementGroupAdapter4 = null;
        }
        mpesaStatementGroupAdapter4.getLoadMoreModule().setEnableLoadMoreIfNotFullPage(false);
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter5 = this.statementGroupAdapter;
        if (mpesaStatementGroupAdapter5 == null) {
            int i5 = component2 + 41;
            equals = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            mpesaStatementGroupAdapter5 = null;
        }
        mpesaStatementGroupAdapter5.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onLoadMore() {
                int i7 = 2 % 2;
                int i8 = copydefault + 97;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                PochiStatementsActivity.$r8$lambda$FldtWpNh8cllF0SSHIY6wTOBnrA(this.f$0);
                if (i9 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        RecyclerView recyclerView2 = ((ActivityPochiStatmentBinding) this.binding).rvStatements;
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter6 = this.statementGroupAdapter;
        if (mpesaStatementGroupAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            mpesaStatementGroupAdapter = mpesaStatementGroupAdapter6;
        }
        recyclerView2.setAdapter(mpesaStatementGroupAdapter);
    }

    private final void initData() {
        int i = 2 % 2;
        LocalMpesaStatementResp value = PochiStatementHelper.INSTANCE.getPochiStatementMutableLiveData().getValue();
        if (value != null) {
            int i2 = component2 + 73;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionUtils.isEmpty(value.getGroups());
                throw null;
            }
            if (!CollectionUtils.isEmpty(value.getGroups())) {
                this.hasCache = true;
                updateStatementView(value, true);
                int i3 = component2 + 13;
                equals = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        queryStatements();
    }

    private final void queryStatements() {
        String lastStatementDataStr;
        int i = 2 % 2;
        int i2 = component2 + 125;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.isFirstRequest) {
            lastStatementDataStr = new SimpleDateFormat(Constants.ISO_DATE_FORMAT).format(new Date());
        } else {
            lastStatementDataStr = getLastStatementDataStr();
            if (TextUtils.isEmpty(lastStatementDataStr)) {
                return;
            }
        }
        ((PochiStatementsViewModel) this.viewModel).queryStatements(MapsKt.mapOf(TuplesKt.to("endDate", lastStatementDataStr), TuplesKt.to("limit", Integer.valueOf(this.limitCount)), TuplesKt.to("accountType", PochiWalletBalanceHelper.INSTANCE.getBalance().getValue().getAccountTypeAlias())), this.isFirstRequest);
        int i3 = equals + 83;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final String getLastStatementDataStr() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (!this.statementGroupList.isEmpty()) {
            int i4 = component2 + 53;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                return ((StatementWrapper) CollectionsKt.last((List) ((StatementGroup) CollectionsKt.last((List) this.statementGroupList)).getDataList())).getStatement().getEndTime();
            }
            ((StatementWrapper) CollectionsKt.last((List) ((StatementGroup) CollectionsKt.last((List) this.statementGroupList)).getDataList())).getStatement().getEndTime();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return "";
    }

    private static final void initEvent$lambda$6(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (!Intrinsics.areEqual(pochiStatementsActivity.selectedType, pochiStatementsActivity.allType)) {
            int i2 = equals + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            pochiStatementsActivity.selectedType = pochiStatementsActivity.allType;
            pochiStatementsActivity.setTypeSelected();
            pochiStatementsActivity.updateStatementsList();
        }
        int i4 = component2 + 15;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void initEvent$lambda$7(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 29;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
            Intrinsics.areEqual(pochiStatementsActivity.selectedType, pochiStatementsActivity.moneyInType);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (!Intrinsics.areEqual(pochiStatementsActivity.selectedType, pochiStatementsActivity.moneyInType)) {
            pochiStatementsActivity.selectedType = pochiStatementsActivity.moneyInType;
            pochiStatementsActivity.setTypeSelected();
            pochiStatementsActivity.updateStatementsList();
            int i3 = component2 + 19;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = equals + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void initEvent$lambda$8(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (Intrinsics.areEqual(pochiStatementsActivity.selectedType, pochiStatementsActivity.moneyOutType)) {
            return;
        }
        int i4 = component2 + 47;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            pochiStatementsActivity.selectedType = pochiStatementsActivity.moneyOutType;
            pochiStatementsActivity.setTypeSelected();
            pochiStatementsActivity.updateStatementsList();
        } else {
            pochiStatementsActivity.selectedType = pochiStatementsActivity.moneyOutType;
            pochiStatementsActivity.setTypeSelected();
            pochiStatementsActivity.updateStatementsList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void initEvent() {
        int i = 2 % 2;
        ((ActivityPochiStatmentBinding) this.binding).inputSearch.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                int i3 = copydefault + 33;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(s, "");
                    PochiStatementsActivity.access$updateStatementsList(PochiStatementsActivity.this);
                    PochiStatementsActivity.this.setCanloadMoreByText(TextUtils.isEmpty(s));
                } else {
                    Intrinsics.checkNotNullParameter(s, "");
                    PochiStatementsActivity.access$updateStatementsList(PochiStatementsActivity.this);
                    PochiStatementsActivity.this.setCanloadMoreByText(TextUtils.isEmpty(s));
                    int i4 = 5 / 0;
                }
            }
        });
        ((ActivityPochiStatmentBinding) this.binding).tvAll.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 85;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                PochiStatementsActivity.$r8$lambda$J5a5irBQLkXNFLUOVnq8_sigXSA(this.f$0, view);
                if (i4 != 0) {
                    int i5 = 1 / 0;
                }
            }
        });
        ((ActivityPochiStatmentBinding) this.binding).tvMoneyIn.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 81;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                PochiStatementsActivity.$r8$lambda$UEw2zxtr4Omp0GsUmcAaDdGdNI4(this.f$0, view);
                int i5 = component2 + 9;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 22 / 0;
                }
            }
        });
        ((ActivityPochiStatmentBinding) this.binding).tvMoneyOut.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    PochiStatementsActivity.$r8$lambda$dPxRSgWgm_KBjkzqtXuwqjnRxl0(this.f$0, view);
                    int i4 = 40 / 0;
                } else {
                    PochiStatementsActivity.$r8$lambda$dPxRSgWgm_KBjkzqtXuwqjnRxl0(this.f$0, view);
                }
                int i5 = copydefault + 17;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityPochiStatmentBinding) this.binding).rvStatements.addOnScrollListener(new AnonymousClass5());
        ((ActivityPochiStatmentBinding) this.binding).refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onRefresh(RefreshLayout refreshLayout) {
                int i2 = 2 % 2;
                int i3 = component3 + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                PochiStatementsActivity.$r8$lambda$hk1r9YwywGd1LtQl54FDZrG8AUk(this.f$0, refreshLayout);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component2 + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void initEvent$lambda$9(PochiStatementsActivity pochiStatementsActivity, RefreshLayout refreshLayout) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        Intrinsics.checkNotNullParameter(refreshLayout, "");
        pochiStatementsActivity.isFirstRequest = true;
        pochiStatementsActivity.canLoadMore = true;
        pochiStatementsActivity.canloadMoreByText = true;
        pochiStatementsActivity.refreshFlag = true;
        ((ActivityPochiStatmentBinding) pochiStatementsActivity.binding).inputSearch.getEditText().setText("");
        pochiStatementsActivity.selectedType = pochiStatementsActivity.allType;
        pochiStatementsActivity.setTypeSelected();
        Object obj = null;
        pochiStatementsActivity.lastLocalMpesaStatementResp = null;
        pochiStatementsActivity.queryStatements();
        int i4 = equals + 55;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((PochiStatementsViewModel) this.viewModel).getStatementsData().observe(this, new ShareDataUIState(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 113;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                PochiStatementsActivity pochiStatementsActivity = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 != 0) {
                    return PochiStatementsActivity.m10804$r8$lambda$QdqcnHvpTpxv8aNvuLCvczP8Xg(pochiStatementsActivity, resource);
                }
                Unit unitM10804$r8$lambda$QdqcnHvpTpxv8aNvuLCvczP8Xg = PochiStatementsActivity.m10804$r8$lambda$QdqcnHvpTpxv8aNvuLCvczP8Xg(pochiStatementsActivity, resource);
                int i5 = 86 / 0;
                return unitM10804$r8$lambda$QdqcnHvpTpxv8aNvuLCvczP8Xg;
            }
        }));
        int i2 = equals + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObserver$lambda$10(PochiStatementsActivity pochiStatementsActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsActivity, "");
        if (!pochiStatementsActivity.hasCache) {
            int i2 = equals + 103;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            if (!pochiStatementsActivity.refreshFlag) {
                int i5 = i3 + 49;
                equals = i5 % 128;
                int i6 = i5 % 2;
                Utils.showOrHideLoading(pochiStatementsActivity, resource);
                int i7 = equals + 61;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 4;
                }
            }
        }
        if (resource.error()) {
            pochiStatementsActivity.refreshFlag = false;
            ((ActivityPochiStatmentBinding) pochiStatementsActivity.binding).refreshLayout.finishRefresh();
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
        }
        if (!(!resource.success())) {
            Object data = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data, "");
            pochiStatementsActivity.updateStatementView((LocalMpesaStatementResp) data, false);
            ((ActivityPochiStatmentBinding) pochiStatementsActivity.binding).refreshLayout.finishRefresh();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = equals + 61;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    static void updateStatementView$default(PochiStatementsActivity pochiStatementsActivity, LocalMpesaStatementResp localMpesaStatementResp, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = equals + 59;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        pochiStatementsActivity.updateStatementView(localMpesaStatementResp, z);
        int i5 = equals + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[PHI: r5
  0x00b4: PHI (r5v18 com.huawei.digitalpayment.consumer.sfcui.statement.resp.StatementGroup) = 
  (r5v17 com.huawei.digitalpayment.consumer.sfcui.statement.resp.StatementGroup)
  (r5v23 com.huawei.digitalpayment.consumer.sfcui.statement.resp.StatementGroup)
 binds: [B:38:0x00b2, B:35:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateStatementView(com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.updateStatementView(com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp, boolean):void");
    }

    private final void updateStatementsList() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(filterData());
        if (arrayList.isEmpty()) {
            int i2 = equals + 71;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                ((ActivityPochiStatmentBinding) this.binding).clEmptyViewContainer.setVisibility(1);
                ((ActivityPochiStatmentBinding) this.binding).rvStatements.setVisibility(120);
                return;
            } else {
                ((ActivityPochiStatmentBinding) this.binding).clEmptyViewContainer.setVisibility(0);
                ((ActivityPochiStatmentBinding) this.binding).rvStatements.setVisibility(8);
                return;
            }
        }
        ((ActivityPochiStatmentBinding) this.binding).clEmptyViewContainer.setVisibility(8);
        ((ActivityPochiStatmentBinding) this.binding).rvStatements.setVisibility(0);
        MpesaStatementGroupAdapter mpesaStatementGroupAdapter = this.statementGroupAdapter;
        if (mpesaStatementGroupAdapter == null) {
            int i3 = equals + 107;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            mpesaStatementGroupAdapter = null;
        }
        mpesaStatementGroupAdapter.setNewInstance(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.huawei.digitalpayment.consumer.sfcui.statement.resp.StatementGroup> filterData() {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.filterData():java.util.List");
    }

    private final void updateMonthView(StatementGroup statementGroup) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryCategoryAdapter withExpiryCategoryAdapter = this.monthAdapter;
        if (withExpiryCategoryAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = equals + 77;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            withExpiryCategoryAdapter = null;
        }
        withExpiryCategoryAdapter.setSelectedCategory(statementGroup.getCategoryMonth());
    }

    private final void updateFloatView(int dy) {
        int i = 2 % 2;
        if (dy <= 0) {
            if (dy >= 0 || this.scrollTop) {
                return;
            }
            this.scrollTop = true;
            return;
        }
        int i2 = equals + 101;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.scrollTop) {
            this.scrollTop = false;
            int i4 = i3 + 9;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[PHI: r1
  0x0067: PHI (r1v68 com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity$ToolbarContainer) = 
  (r1v64 com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity$ToolbarContainer)
  (r1v78 com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity$ToolbarContainer)
 binds: [B:10:0x0058, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSearchStatus() {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.updateSearchStatus():void");
    }

    private final void setTypeSelected() {
        int i = 2 % 2;
        String str = this.selectedType;
        if (!Intrinsics.areEqual(str, this.moneyInType)) {
            if (Intrinsics.areEqual(str, this.moneyOutType)) {
                ((ActivityPochiStatmentBinding) this.binding).tvAll.setSelected(false);
                ((ActivityPochiStatmentBinding) this.binding).tvMoneyIn.setSelected(false);
                ((ActivityPochiStatmentBinding) this.binding).tvMoneyOut.setSelected(true);
                return;
            } else {
                ((ActivityPochiStatmentBinding) this.binding).tvAll.setSelected(true);
                ((ActivityPochiStatmentBinding) this.binding).tvMoneyIn.setSelected(false);
                ((ActivityPochiStatmentBinding) this.binding).tvMoneyOut.setSelected(false);
                return;
            }
        }
        int i2 = equals + 55;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            ((ActivityPochiStatmentBinding) this.binding).tvAll.setSelected(false);
            ((ActivityPochiStatmentBinding) this.binding).tvMoneyIn.setSelected(false);
        } else {
            ((ActivityPochiStatmentBinding) this.binding).tvAll.setSelected(false);
            ((ActivityPochiStatmentBinding) this.binding).tvMoneyIn.setSelected(true);
        }
        ((ActivityPochiStatmentBinding) this.binding).tvMoneyOut.setSelected(false);
        int i3 = component2 + 83;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = equals + 45;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!this.isSearchStatus)) {
            int i4 = i3 + 117;
            equals = i4 % 128;
            int i5 = i4 % 2;
            this.isSearchStatus = false;
            updateSearchStatus();
            return;
        }
        finish();
        int i6 = equals + 3;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:0|2|(2:(2:9|(2:11|(1:15)(1:14))(0))(1:16)|(9:18|797|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(10:783|32|(2:744|34)|38|39|763|(5:41|42|(1:44)|45|46)(16:48|49|766|50|(2:791|52)|56|57|58|(1:60)|61|62|63|(1:65)|66|(1:68)|69)|47|70|(9:73|749|74|(1:76)|77|78|79|734|80))|115|(6:782|116|(1:118)|119|(1:121)|122)|(15:(3:124|(1:126)|127)(6:128|(2:130|(1:136)(1:135))(1:137)|(18:139|770|140|(1:142)|143|144|753|145|(1:147)|148|149|150|(1:152)|153|(1:155)(1:156)|157|(1:159)|160)(35:215|777|216|(1:218)|219|(3:221|(1:223)|224)(19:225|226|761|227|(1:229)|230|231|747|232|(1:234)|235|236|237|(1:239)|240|(1:242)|243|(1:245)|246)|247|(4:250|(3:819|252|(3:817|254|823)(12:815|258|(3:260|(3:263|264|261)|824)|265|732|266|(1:268)|269|270|802|271|822))(3:814|255|(3:816|257|821)(12:818|258|(0)|265|732|266|(0)|269|270|802|271|822))|820|248)|813|306|751|307|(1:309)|310|(3:312|(1:314)|315)(19:316|317|736|318|(1:320)|321|322|805|323|(1:325)|326|327|328|(1:330)|331|(1:333)|334|(1:336)|337)|338|(5:341|342|(3:827|344|830)(12:826|345|(3:347|(3:350|351|348)|831)|352|789|353|(1:355)|356|357|778|358|829)|828|339)|825|371|(3:772|396|(1:402)(1:401))(1:406)|407|800|408|(1:410)|411|787|412|(1:414)|415|439|(1:441)|442|(3:444|(1:446)|447)(14:448|449|(1:451)|452|453|(1:455)|456|740|457|458|(1:460)(1:461)|462|(1:464)|465)|466|(9:468|(1:470)|471|(1:473)|474|(3:476|(1:478)|479)(16:481|482|(1:484)|485|(1:487)|488|489|(1:491)|492|742|493|494|(1:496)|497|(1:499)|500)|480|501|(25:503|804|504|(1:506)|507|(1:509)|510|(3:512|(1:514)|515)(17:516|(2:518|(1:524)(1:523))|(19:526|527|793|528|(1:530)|531|532|785|533|(1:535)|536|537|538|(1:540)|541|(1:543)|544|(1:546)|547)|603|(1:605)|606|(3:608|(1:610)|611)(13:613|780|614|615|(1:617)|618|795|619|620|(1:622)|623|(1:625)|626)|612|627|(6:630|631|(1:633)|634|635|636)|637|(1:639)|640|(3:642|(1:644)|645)(14:647|648|(1:650)|651|652|(1:654)|655|798|656|657|(1:659)|660|(1:662)|663)|646|664|(1:842)(7:667|668|(1:670)|671|672|673|674))|548|(5:551|552|(3:834|554|837)(12:833|555|(3:557|(3:560|561|558)|838)|562|773|563|(1:565)|566|567|757|568|836)|835|549)|832|603|(0)|606|(0)(0)|612|627|(0)|637|(0)|640|(0)(0)|646|664|(0)(0))(10:684|(5:686|(1:688)(1:689)|840|(2:692|690)|839)|693|694|(1:696)|697|(1:699)|700|701|702))(10:705|(3:707|(2:710|708)|841)|711|712|(1:714)|715|(1:717)|718|719|720))|723|724|(1:726)(1:727))|800|408|(0)|411|787|412|(0)|415|439|(0)|442|(0)(0)|466|(0)(0))|161|(4:164|(2:166|811)(11:167|(3:169|(3:172|173|170)|812)|174|738|175|(1:177)|178|179|807|180|810)|181|162)|809|215|777|216|(0)|219|(0)(0)|247|(1:248)|813|306|751|307|(0)|310|(0)(0)|338|(1:339)|825|371|(0)(0)|407|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x1241, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x1242, code lost:
    
        r5 = new java.lang.Object[1];
        c(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{26295, 56752, 2127, 52794, 26243, 39202, 33078, 1006, 29710, 35494, 37816, 11880, 17294, 46118, 42559}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x125c, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x1273, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x1277, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r12 = -1;
        r12 = 0;
        r3 = (((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32)))) | ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x12a7, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x12ab, code lost:
    
        if (r5 == null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x12ad, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.View.resolveSizeAndState(0, 0, 0), 42 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x12d1, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x12d8, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.component2 + 3;
        com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.equals = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x12e3, code lost:
    
        r7 = new java.lang.Object[]{-1339178156, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.Process.myPid() >> 22) + 6562, android.graphics.ImageFormat.getBitsPerPixel(0) + 57, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
        r3 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.$$d;
        r1 = r3[0];
        r8 = new java.lang.Object[1];
        f(r1, r1, (byte) (-r3[19]), r8);
        r2.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x176f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x1770, code lost:
    
        r5 = new java.lang.Object[1];
        b(((android.content.Context) java.lang.Class.forName(r25).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) + 31779, new char[]{53784, 44678, 11070, 42912, 8277, 48332, 14694, 47632, 13953, 45881}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x17a7, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x17be, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x17c2, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r12 = -1;
        r12 = 0;
        r3 = (((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32)))) | ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x17f2, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x17f6, code lost:
    
        if (r1 == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x17f8, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), 42 - android.view.View.resolveSize(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1821, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1829, code lost:
    
        r7 = new java.lang.Object[]{-1339178156, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.View.combineMeasuredStates(0, 0) + 6562, 56 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
        r3 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.$$d;
        r4 = r3[0];
        r8 = new java.lang.Object[1];
        f(r4, r4, (byte) (-r3[19]), r8);
        r2.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0735 A[Catch: all -> 0x0352, TryCatch #36 {all -> 0x0352, blocks: (B:631:0x2ca3, B:633:0x2ca9, B:634:0x2cd4, B:668:0x3007, B:670:0x300d, B:671:0x3034, B:648:0x2e2f, B:650:0x2e52, B:651:0x2ead, B:597:0x28e6, B:599:0x28ec, B:600:0x2914, B:694:0x3115, B:696:0x311b, B:697:0x3146, B:699:0x3180, B:700:0x31c3, B:482:0x2056, B:484:0x206b, B:485:0x209e, B:487:0x20d2, B:488:0x214e, B:712:0x3273, B:714:0x3279, B:715:0x3299, B:717:0x32d3, B:718:0x3313, B:449:0x1c34, B:451:0x1c49, B:452:0x1c7c, B:433:0x1a20, B:435:0x1a26, B:436:0x1a4e, B:388:0x17f2, B:390:0x17f8, B:391:0x1821, B:300:0x12a7, B:302:0x12ad, B:303:0x12d1, B:209:0x0d6c, B:211:0x0d72, B:212:0x0d9f, B:109:0x072f, B:111:0x0735, B:112:0x075e, B:19:0x0184, B:21:0x018a, B:22:0x01b8, B:24:0x02c3, B:26:0x02f4, B:27:0x034c), top: B:797:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0e27 A[Catch: all -> 0x1241, TryCatch #25 {all -> 0x1241, blocks: (B:216:0x0e21, B:218:0x0e27, B:219:0x0e70, B:221:0x0e7d, B:223:0x0e86, B:224:0x0ecb, B:247:0x10e1, B:248:0x10e5, B:252:0x10f7, B:258:0x1127, B:261:0x1134, B:263:0x1137, B:275:0x121b, B:277:0x1221, B:278:0x1222, B:280:0x1224, B:282:0x122b, B:283:0x122c, B:255:0x110f, B:225:0x0ed6, B:237:0x0fca, B:239:0x0fd0, B:240:0x1019, B:242:0x1043, B:243:0x1085, B:245:0x109b, B:246:0x10db, B:285:0x122e, B:287:0x1235, B:288:0x1236, B:290:0x1238, B:292:0x123f, B:293:0x1240, B:266:0x1163, B:268:0x1169, B:269:0x1193, B:232:0x0f3d, B:234:0x0f52, B:235:0x0fbe, B:227:0x0ef6, B:229:0x0f0b, B:230:0x0f36, B:271:0x119b), top: B:777:0x0e21, outer: #11, inners: #0, #8, #16, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e7d A[Catch: all -> 0x1241, TryCatch #25 {all -> 0x1241, blocks: (B:216:0x0e21, B:218:0x0e27, B:219:0x0e70, B:221:0x0e7d, B:223:0x0e86, B:224:0x0ecb, B:247:0x10e1, B:248:0x10e5, B:252:0x10f7, B:258:0x1127, B:261:0x1134, B:263:0x1137, B:275:0x121b, B:277:0x1221, B:278:0x1222, B:280:0x1224, B:282:0x122b, B:283:0x122c, B:255:0x110f, B:225:0x0ed6, B:237:0x0fca, B:239:0x0fd0, B:240:0x1019, B:242:0x1043, B:243:0x1085, B:245:0x109b, B:246:0x10db, B:285:0x122e, B:287:0x1235, B:288:0x1236, B:290:0x1238, B:292:0x123f, B:293:0x1240, B:266:0x1163, B:268:0x1169, B:269:0x1193, B:232:0x0f3d, B:234:0x0f52, B:235:0x0fbe, B:227:0x0ef6, B:229:0x0f0b, B:230:0x0f36, B:271:0x119b), top: B:777:0x0e21, outer: #11, inners: #0, #8, #16, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0ed6 A[Catch: all -> 0x1241, TRY_LEAVE, TryCatch #25 {all -> 0x1241, blocks: (B:216:0x0e21, B:218:0x0e27, B:219:0x0e70, B:221:0x0e7d, B:223:0x0e86, B:224:0x0ecb, B:247:0x10e1, B:248:0x10e5, B:252:0x10f7, B:258:0x1127, B:261:0x1134, B:263:0x1137, B:275:0x121b, B:277:0x1221, B:278:0x1222, B:280:0x1224, B:282:0x122b, B:283:0x122c, B:255:0x110f, B:225:0x0ed6, B:237:0x0fca, B:239:0x0fd0, B:240:0x1019, B:242:0x1043, B:243:0x1085, B:245:0x109b, B:246:0x10db, B:285:0x122e, B:287:0x1235, B:288:0x1236, B:290:0x1238, B:292:0x123f, B:293:0x1240, B:266:0x1163, B:268:0x1169, B:269:0x1193, B:232:0x0f3d, B:234:0x0f52, B:235:0x0fbe, B:227:0x0ef6, B:229:0x0f0b, B:230:0x0f36, B:271:0x119b), top: B:777:0x0e21, outer: #11, inners: #0, #8, #16, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x10eb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x1133  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1169 A[Catch: all -> 0x1223, TryCatch #0 {all -> 0x1223, blocks: (B:266:0x1163, B:268:0x1169, B:269:0x1193), top: B:732:0x1163, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x1363 A[Catch: all -> 0x176f, TryCatch #10 {all -> 0x176f, blocks: (B:307:0x135d, B:309:0x1363, B:310:0x13a8, B:312:0x13b5, B:314:0x13be, B:315:0x13fd, B:338:0x162e, B:339:0x1632, B:342:0x1642, B:345:0x1659, B:348:0x1666, B:350:0x1669, B:362:0x1745, B:364:0x174b, B:365:0x174c, B:367:0x174e, B:369:0x1755, B:370:0x1756, B:316:0x1408, B:328:0x150e, B:330:0x1514, B:331:0x155c, B:333:0x1586, B:334:0x15cd, B:336:0x15e3, B:337:0x1628, B:373:0x175c, B:375:0x1763, B:376:0x1764, B:378:0x1766, B:380:0x176d, B:381:0x176e, B:318:0x1428, B:320:0x143d, B:321:0x1470, B:358:0x16cd, B:353:0x1695, B:355:0x169b, B:356:0x16c5, B:323:0x1477, B:325:0x1493, B:326:0x1502), top: B:751:0x135d, outer: #11, inners: #2, #26, #32, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x13b5 A[Catch: all -> 0x176f, TryCatch #10 {all -> 0x176f, blocks: (B:307:0x135d, B:309:0x1363, B:310:0x13a8, B:312:0x13b5, B:314:0x13be, B:315:0x13fd, B:338:0x162e, B:339:0x1632, B:342:0x1642, B:345:0x1659, B:348:0x1666, B:350:0x1669, B:362:0x1745, B:364:0x174b, B:365:0x174c, B:367:0x174e, B:369:0x1755, B:370:0x1756, B:316:0x1408, B:328:0x150e, B:330:0x1514, B:331:0x155c, B:333:0x1586, B:334:0x15cd, B:336:0x15e3, B:337:0x1628, B:373:0x175c, B:375:0x1763, B:376:0x1764, B:378:0x1766, B:380:0x176d, B:381:0x176e, B:318:0x1428, B:320:0x143d, B:321:0x1470, B:358:0x16cd, B:353:0x1695, B:355:0x169b, B:356:0x16c5, B:323:0x1477, B:325:0x1493, B:326:0x1502), top: B:751:0x135d, outer: #11, inners: #2, #26, #32, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1408 A[Catch: all -> 0x176f, TRY_LEAVE, TryCatch #10 {all -> 0x176f, blocks: (B:307:0x135d, B:309:0x1363, B:310:0x13a8, B:312:0x13b5, B:314:0x13be, B:315:0x13fd, B:338:0x162e, B:339:0x1632, B:342:0x1642, B:345:0x1659, B:348:0x1666, B:350:0x1669, B:362:0x1745, B:364:0x174b, B:365:0x174c, B:367:0x174e, B:369:0x1755, B:370:0x1756, B:316:0x1408, B:328:0x150e, B:330:0x1514, B:331:0x155c, B:333:0x1586, B:334:0x15cd, B:336:0x15e3, B:337:0x1628, B:373:0x175c, B:375:0x1763, B:376:0x1764, B:378:0x1766, B:380:0x176d, B:381:0x176e, B:318:0x1428, B:320:0x143d, B:321:0x1470, B:358:0x16cd, B:353:0x1695, B:355:0x169b, B:356:0x16c5, B:323:0x1477, B:325:0x1493, B:326:0x1502), top: B:751:0x135d, outer: #11, inners: #2, #26, #32, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x1638  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x18bf  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x18d6 A[Catch: all -> 0x1997, TryCatch #38 {all -> 0x1997, blocks: (B:408:0x18c1, B:410:0x18d6, B:411:0x1908), top: B:800:0x18c1, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x191b A[Catch: all -> 0x198d, TryCatch #31 {all -> 0x198d, blocks: (B:412:0x190e, B:414:0x191b, B:415:0x1985), top: B:787:0x190e, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1adb  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1b2e  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1c15  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x1db9  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x299e  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x29f5  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x2a4b  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x2c81  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2d6d  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2dc0  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x2e11  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x2fe7  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x323b  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x33b8  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x33b9  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x18a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:842:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v93 */
    /* JADX WARN: Type inference failed for: r9v94 */
    /* JADX WARN: Type inference failed for: r9v95 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /* JADX WARN: Type inference failed for: r9v97 */
    /* JADX WARN: Type inference failed for: r9v98 */
    /* JADX WARN: Type inference failed for: r9v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$FldtWpNh8cllF0SSHIY6wTOBnrA(PochiStatementsActivity pochiStatementsActivity) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        initRecycler$lambda$5(pochiStatementsActivity);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = equals + 13;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$GgKB5jOLxzS6oxANMSzcf7zoN7A(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10806instrumented$0$initToolbar$LjavalangStringV(pochiStatementsActivity, view);
        int i4 = equals + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$J5a5irBQLkXNFLUOVnq8_sigXSA(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10805instrumented$0$initEvent$V(pochiStatementsActivity, view);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        int i5 = component2 + 17;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    public static void $r8$lambda$Jg2EOiZU4S2uVHk3QyxovaJ4d14(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m10808instrumented$1$initToolbar$LjavalangStringV(pochiStatementsActivity, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = equals + 17;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static Unit m10804$r8$lambda$QdqcnHvpTpxv8aNvuLCvczP8Xg(PochiStatementsActivity pochiStatementsActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return initObserver$lambda$10(pochiStatementsActivity, resource);
        }
        initObserver$lambda$10(pochiStatementsActivity, resource);
        throw null;
    }

    public static Unit $r8$lambda$SPOlwgiZRiBX5wawvJ_pE0LqCO8(PochiStatementsActivity pochiStatementsActivity, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitInitRecycler$lambda$3 = initRecycler$lambda$3(pochiStatementsActivity, i);
        int i5 = component2 + 9;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return unitInitRecycler$lambda$3;
    }

    public static Unit $r8$lambda$SlLa_SwYd7FCA0nIs3U6j20tweI(PochiStatementsActivity pochiStatementsActivity, int i, StatementWrapper statementWrapper) {
        int i2 = 2 % 2;
        int i3 = component2 + 35;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Unit unitInitRecycler$lambda$4 = initRecycler$lambda$4(pochiStatementsActivity, i, statementWrapper);
        int i5 = equals + 67;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return unitInitRecycler$lambda$4;
    }

    public static void $r8$lambda$UEw2zxtr4Omp0GsUmcAaDdGdNI4(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10807instrumented$1$initEvent$V(pochiStatementsActivity, view);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    public static void $r8$lambda$dPxRSgWgm_KBjkzqtXuwqjnRxl0(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10809instrumented$2$initEvent$V(pochiStatementsActivity, view);
        int i4 = equals + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$hk1r9YwywGd1LtQl54FDZrG8AUk(PochiStatementsActivity pochiStatementsActivity, RefreshLayout refreshLayout) {
        int i = 2 % 2;
        int i2 = equals + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        initEvent$lambda$9(pochiStatementsActivity, refreshLayout);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getRequestBeneficiariesState = 1;
        component1();
        component3();
        int i = getAsAtTimestamp + 115;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    private static void m10805instrumented$0$initEvent$V(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initEvent$lambda$6(pochiStatementsActivity, view);
            Callback.onClick_exit();
            int i4 = equals + 61;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10806instrumented$0$initToolbar$LjavalangStringV(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initToolbar$lambda$0(pochiStatementsActivity, view);
                Callback.onClick_exit();
            } else {
                initToolbar$lambda$0(pochiStatementsActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10807instrumented$1$initEvent$V(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initEvent$lambda$7(pochiStatementsActivity, view);
                return;
            }
            initEvent$lambda$7(pochiStatementsActivity, view);
            Callback.onClick_exit();
            Object obj = null;
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void m10808instrumented$1$initToolbar$LjavalangStringV(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initToolbar$lambda$1(pochiStatementsActivity, view);
            Callback.onClick_exit();
            int i4 = component2 + 77;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10809instrumented$2$initEvent$V(PochiStatementsActivity pochiStatementsActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initEvent$lambda$8(pochiStatementsActivity, view);
            Callback.onClick_exit();
            int i4 = component2 + 105;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component2 + 1;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        copydefault = new char[]{3093, 59649, 50731, 41744, 39038, 30075, 21127, 20393, 9427, 455, 65192, 54298, 45375, 44585, 35663, 24682, 23959, 14978, 6070, 3295, 59887, 50915, 48131, 39216, 30274, 21248, 18533, 9617, 696, 65469, 54483, 45555, 44819, 33820, 24936, 24152, 15231, 4214, 3459, 60090, 51154, 48335, 39410, 30495, 27768, 18747, 9807, 816, 63621, 54669, 45748, 45019, 34035, 25056, 24392, 13336, 4439, 3651, 60271, 49298, 48559, 39581, 30670, 27903, 18948, 9995, 7170, 63839, 54885, 45926, 43140, 34225, 25303, 24540, 13538, 4653, 3893, 58428, 49475, 48763, 39832, 28837, 28082, 19098, 10192, 7407, 64011, 55095, 52314, 43351, 34389, 25494, 22711, 13756, 4803, 4058, 58647, 49693, 48942, 37980, 29049, 28271, 19348, 8378, 7653, 64205, 55284, 52507, 43571, 34592, 31746, 22825, 14034, 5084, 2274, 58778, 49875, 49142, 38162, 29243, 28484, 17472, 8551, 7826, 64389, 53431, 52680, 43754, 32798, 32011, 23090, 14167, 11381, 2370, 59015, 50099, 47316, 38346, 29415, 26702};
        component3 = -3486360954333501074L;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component1() {
        component1 = -7468457837298298358L;
        ShareDataUIState = 5005925825510795313L;
    }
}
