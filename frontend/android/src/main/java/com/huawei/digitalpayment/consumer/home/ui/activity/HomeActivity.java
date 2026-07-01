package com.huawei.digitalpayment.consumer.home.ui.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.arouter.RouteUtils;
import com.huawei.arouter.Router;
import com.huawei.arouter.executehandler.ExecuteHandler;
import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.baselib.service.AppUpdateService;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateUtil;
import com.huawei.digitalpayment.consumer.baselib.util.update.provider.AppUpdate;
import com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter;
import com.huawei.digitalpayment.consumer.home.widget.NavigationButton;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ActivityHomeBinding;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCore;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import com.huawei.digitalpayment.home.theme.data.local.LocalComponent;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme;
import com.huawei.digitalpayment.home.viewmodel.HomeViewModel;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002<=B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020#H\u0014J\u0012\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0015J\b\u0010.\u001a\u00020)H\u0014J\u0018\u0010/\u001a\u00020)2\u000e\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020)H\u0016J\b\u00107\u001a\u000205H\u0014J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020)H\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomeActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/ActivityHomeBinding;", "Lcom/huawei/digitalpayment/home/viewmodel/HomeViewModel;", "<init>", "()V", "adapter", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;", "getAdapter", "()Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;", "setAdapter", "(Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;)V", "phoneDataSender", "Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "getPhoneDataSender", "()Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "setPhoneDataSender", "(Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;)V", "connectionLiveData", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "getConnectionLiveData", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "setConnectionLiveData", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;)V", "isExecute", "", "homeExecuteHandler", "Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomeActivity$HomeExecuteHandler;", "mtandaoCore", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "getMtandaoCore", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "setMtandaoCore", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;)V", "logType", "", "workerThread", "Landroid/os/HandlerThread;", "workerHandler", "Landroid/os/Handler;", "initToolbar", "", "title", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "updateNavigation", "functions", "", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "doSelect", FirebaseAnalytics.Param.INDEX, "", "onBackPressed", "getLayoutId", "handleRequest", "router", "Lcom/huawei/arouter/Router;", "onDestroy", "Companion", "HomeExecuteHandler", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public class HomeActivity extends Hilt_HomeActivity<ActivityHomeBinding, HomeViewModel> {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static char ShareDataUIState;
    private static long component1;
    private static char component2;
    private static char component3;
    private static int component4;
    private static short[] copy;
    private static char copydefault;
    private static byte[] equals;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;
    private static int selectedPosition;

    @Inject
    public MainFragmentStateAdapter adapter;

    @Inject
    public ConnectionLiveData connectionLiveData;
    private HomeExecuteHandler homeExecuteHandler;
    private boolean isExecute;
    private final String logType = "App Homeview";

    @Inject
    public MtandaoCore mtandaoCore;

    @Inject
    public PhoneDataSender phoneDataSender;
    private final Handler workerHandler;
    private final HandlerThread workerThread;
    private static final byte[] $$l = {80, 83, -21, -55};
    private static final int $$o = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {119, -58, 7, 71, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, -15, -4, -12, Ascii.DC2, -4, -4, 2, -23, 6, -11};
    private static final int $$k = 210;
    private static final byte[] $$d = {TarHeader.LF_BLK, -58, -85, 74, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 156;
    private static int getShareableDataState = 0;
    private static int hashCode = 0;
    private static int toString = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final Function1 copydefault;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            if (obj instanceof Observer) {
                int i5 = i3 + 47;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i7 = component2 + 87;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    return zAreEqual;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                Function1 function1 = this.copydefault;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function12 = this.copydefault;
            int i4 = i3 + 95;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return function12;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component2 + 45;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = 116 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.$$r(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.$$d
            int r6 = r6 + 4
            int r1 = r5 + 4
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r5
            r7 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r0[r7]
        L29:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.h(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.$$j
            int r1 = r6 + 10
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-3)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.i(short, short, short, java.lang.Object[]):void");
    }

    public static final void access$doSelect(HomeActivity homeActivity, int i) {
        int i2 = 2 % 2;
        int i3 = toString + 83;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        homeActivity.doSelect(i);
        int i5 = toString + 89;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final String access$getLogType$p(HomeActivity homeActivity) {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 85;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = homeActivity.logType;
        int i5 = i2 + 57;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final int access$getSelectedPosition$cp() {
        int i = 2 % 2;
        int i2 = toString + 35;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        int i5 = selectedPosition;
        int i6 = i3 + 119;
        toString = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return i5;
    }

    public static final Handler access$getWorkerHandler$p(HomeActivity homeActivity) {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 85;
        toString = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = homeActivity.workerHandler;
        int i5 = i2 + 117;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return handler;
    }

    public static final boolean access$handleRequest(HomeActivity homeActivity, Router router) {
        int i = 2 % 2;
        int i2 = hashCode + 113;
        toString = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleRequest = homeActivity.handleRequest(router);
        int i4 = hashCode + 95;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return zHandleRequest;
    }

    public static final void access$setSelectedPosition$cp(int i) {
        int i2 = 2 % 2;
        int i3 = toString + 95;
        int i4 = i3 % 128;
        hashCode = i4;
        int i5 = i3 % 2;
        selectedPosition = i;
        int i6 = i4 + 119;
        toString = i6 % 128;
        int i7 = i6 % 2;
    }

    public HomeActivity() {
        HandlerThread handlerThread = new HandlerThread("HomeViewWorker");
        handlerThread.start();
        this.workerThread = handlerThread;
        this.workerHandler = new Handler(handlerThread.getLooper());
    }

    public final MainFragmentStateAdapter getAdapter() {
        int i = 2 % 2;
        MainFragmentStateAdapter mainFragmentStateAdapter = this.adapter;
        Object obj = null;
        if (mainFragmentStateAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = hashCode + 61;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 9;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return mainFragmentStateAdapter;
        }
        throw null;
    }

    public final void setAdapter(MainFragmentStateAdapter mainFragmentStateAdapter) {
        int i = 2 % 2;
        int i2 = hashCode + 95;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mainFragmentStateAdapter, "");
        this.adapter = mainFragmentStateAdapter;
        int i4 = hashCode + 69;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public final PhoneDataSender getPhoneDataSender() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 99;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        PhoneDataSender phoneDataSender = this.phoneDataSender;
        Object obj = null;
        if (phoneDataSender == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = hashCode + 39;
            toString = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i2 + 95;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            return phoneDataSender;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPhoneDataSender(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = hashCode + 75;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(phoneDataSender, "");
        this.phoneDataSender = phoneDataSender;
        int i4 = toString + 101;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public final ConnectionLiveData getConnectionLiveData() {
        int i = 2 % 2;
        int i2 = toString + 27;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        ConnectionLiveData connectionLiveData = this.connectionLiveData;
        if (connectionLiveData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 53;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return connectionLiveData;
    }

    public final void setConnectionLiveData(ConnectionLiveData connectionLiveData) {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(connectionLiveData, "");
            this.connectionLiveData = connectionLiveData;
        } else {
            Intrinsics.checkNotNullParameter(connectionLiveData, "");
            this.connectionLiveData = connectionLiveData;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final MtandaoCore getMtandaoCore() {
        int i = 2 % 2;
        int i2 = toString + 87;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        MtandaoCore mtandaoCore = this.mtandaoCore;
        if (mtandaoCore != null) {
            int i5 = i3 + 71;
            toString = i5 % 128;
            int i6 = i5 % 2;
            return mtandaoCore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = hashCode + 1;
        toString = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final void setMtandaoCore(MtandaoCore mtandaoCore) {
        int i = 2 % 2;
        int i2 = hashCode + 105;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mtandaoCore, "");
            this.mtandaoCore = mtandaoCore;
        } else {
            Intrinsics.checkNotNullParameter(mtandaoCore, "");
            this.mtandaoCore = mtandaoCore;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 60268), -834797019, false, $$r(b2, (byte) (b2 | Ascii.SO), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() * component1 * 5431355972723572778L;
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 687, TextUtils.getOffsetBefore("", 0) + 34, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 60373), -1969106284, false, $$r(b3, (byte) (b3 | Ascii.VT), b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - ExpandableListView.getPackedPositionType(0L), 32 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (60316 - AndroidCharacter.getMirror('0')), -834797019, false, $$r(b4, (byte) (b4 | Ascii.SO), b4), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (Process.myTid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + 35, (char) (60373 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -1969106284, false, $$r(b5, (byte) (b5 | Ascii.VT), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $10 + 113;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 686, 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (60373 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -1969106284, false, $$r(b6, (byte) (b6 | Ascii.VT), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i8 = $11 + 121;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = 58224;
            char c2 = 1;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i7 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i8 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component3);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[c2] = Integer.valueOf(i7);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int maxKeyCode = 844 - (KeyEvent.getMaxKeyCode() >> 16);
                        int offsetAfter = 32 - TextUtils.getOffsetAfter("", 0);
                        char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 23251);
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 5);
                        String str$$r = $$r(b2, b3, (byte) (b3 - 5));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, offsetAfter, maxKeyCode2, 592652048, false, str$$r, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((-16776372) - Color.rgb(0, 0, 0), 32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.getOffsetBefore("", 0) + 23251), 592652048, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - TextUtils.indexOf("", ""), 49 - Color.red(0), (char) View.resolveSize(0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i9 = $11 + 123;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomeActivity$Companion;", "", "<init>", "()V", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public final int getSelectedPosition() {
            int i = 2 % 2;
            int i2 = component3 + 79;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iAccess$getSelectedPosition$cp = HomeActivity.access$getSelectedPosition$cp();
            int i4 = component3 + 123;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iAccess$getSelectedPosition$cp;
        }

        public final void setSelectedPosition(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            HomeActivity.access$setSelectedPosition$cp(i);
            int i5 = component3 + 119;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomeActivity$HomeExecuteHandler;", "Lcom/huawei/arouter/executehandler/ExecuteHandler;", "homeActivity", "Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomeActivity;", "<init>", "(Lcom/huawei/digitalpayment/consumer/home/ui/activity/HomeActivity;)V", "handleRequest", "", "router", "Lcom/huawei/arouter/Router;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeExecuteHandler extends ExecuteHandler {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        private final HomeActivity component2;

        public HomeExecuteHandler(HomeActivity homeActivity) {
            Intrinsics.checkNotNullParameter(homeActivity, "");
            this.component2 = homeActivity;
        }

        @Override
        public void handleRequest(Router router) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(router, "");
            Object obj = null;
            if (HomeActivity.access$handleRequest(this.component2, router)) {
                int i2 = component3 + 35;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (getNext() != null) {
                int i3 = component1 + 119;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                getNext().handleRequest(router);
                if (i4 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = 1 + 119;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    private static void g(byte b2, int i, int i2, int i3, short s, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(getAsAtTimestamp)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 998, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, (char) (61686 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1874745193, false, $$r(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if ((i5 ^ 1) == 0) {
                int i6 = $11 + 87;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = equals;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 2984, (ViewConfiguration.getTapTimeout() >> 16) + 48, (char) (View.resolveSize(0, 0) + 54462), -1178636483, false, $$r(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = equals;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(getRequestBeneficiariesState)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (61685 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1874745193, false, $$r(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) getAsAtTimestamp) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) copy[i + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) getAsAtTimestamp) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L)) + i5;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component4), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int gidForName = 1696 - Process.getGidForName("");
                    int iGreen = 37 - Color.green(0);
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte length2 = (byte) $$l.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iGreen, fadingEdgeLength, -1454191902, false, $$r((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = equals;
                if (bArr4 != null) {
                    int i10 = $10 + 29;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = $11 + 27;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) | 7083766810336261929L);
                        } else {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 7083766810336261929L);
                            i12++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $11 + 51;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = copy;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final Unit onCreate$lambda$2(HomeActivity homeActivity, LocalHomeTheme localHomeTheme) {
        int i = 2 % 2;
        int i2 = hashCode + 69;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(homeActivity, "");
        if (localHomeTheme == null) {
            int i4 = hashCode + 57;
            toString = i4 % 128;
            if (i4 % 2 == 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = toString + 71;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return unit2;
        }
        Integer navigatorBackgroundColor = localHomeTheme.getNavigatorBackgroundColor();
        if (navigatorBackgroundColor != null) {
            ((ActivityHomeBinding) homeActivity.binding).llNavigationParent.setBackgroundColor(navigatorBackgroundColor.intValue());
        }
        if (localHomeTheme.getNavigatorBackgroundUrl() != null) {
            GlideUtils.loadUrl(localHomeTheme.getNavigatorBackgroundUrl(), ((ActivityHomeBinding) homeActivity.binding).llNavigationBg);
        }
        homeActivity.getAdapter().setData(localHomeTheme.getPages());
        homeActivity.updateNavigation(localHomeTheme.getPages());
        if (selectedPosition != -1) {
            ((ActivityHomeBinding) homeActivity.binding).viewPager2.setCurrentItem(selectedPosition, false);
            homeActivity.doSelect(selectedPosition);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onCreate$lambda$3(HomeActivity homeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 99;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(homeActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        if (resource.success()) {
            int i4 = toString + 77;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            AppUpdate appUpdateCheckUpdate = UpdateUtil.checkUpdate(homeActivity, (UpdateBean) resource.getData());
            Intrinsics.checkNotNullExpressionValue(appUpdateCheckUpdate, "");
            AppUpdateService appUpdateService = (AppUpdateService) RouteUtils.getService(AppUpdateService.class);
            AppCompatActivity appCompatActivity = homeActivity.activity;
            Intrinsics.checkNotNullExpressionValue(appCompatActivity, "");
            String string = homeActivity.getString(R.string.appUpdate);
            Intrinsics.checkNotNullExpressionValue(string, "");
            appUpdateService.showAppUpdateDialog(appUpdateCheckUpdate, appCompatActivity, string);
            int i6 = hashCode + 69;
            toString = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity$onCreate$4$timedTask$1] */
    private static final void onCreate$lambda$5(final HomeActivity homeActivity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeActivity, "");
        MtandaoCore mtandaoCore = homeActivity.getMtandaoCore();
        Context applicationContext = homeActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        mtandaoCore.getStaticReadings(applicationContext, false);
        final ?? r0 = new Runnable() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void run() throws NoSuchMethodException {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                L.INSTANCE.d("CHECK 1", new Object[0]);
                MtandaoCore mtandaoCore2 = this.component2.getMtandaoCore();
                Context applicationContext2 = this.component2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                mtandaoCore2.getTimedReadings(applicationContext2, HomeActivity.access$getLogType$p(this.component2));
                HomeActivity.access$getWorkerHandler$p(this.component2).postDelayed(this, 2000L);
                int i5 = copydefault + 53;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        homeActivity.workerHandler.post((Runnable) r0);
        homeActivity.workerHandler.postDelayed(new Runnable() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 11;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                HomeActivity.m10465$r8$lambda$wEOOXgi3n_H9A3yBEzQkQu0TH0(this.f$0, r0);
                int i5 = ShareDataUIState + 3;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        }, 20000L);
        int i2 = hashCode + 51;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onCreate$lambda$5$lambda$4(HomeActivity homeActivity, HomeActivity$onCreate$4$timedTask$1 homeActivity$onCreate$4$timedTask$1) {
        int i = 2 % 2;
        int i2 = toString + 109;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(homeActivity, "");
        Intrinsics.checkNotNullParameter(homeActivity$onCreate$4$timedTask$1, "");
        L.INSTANCE.d("CHECK 2", new Object[0]);
        MtandaoCore mtandaoCore = homeActivity.getMtandaoCore();
        Context applicationContext = homeActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        mtandaoCore.stopGps(applicationContext);
        homeActivity.getMtandaoCore().insertLogsData(homeActivity.logType, "");
        homeActivity.workerHandler.removeCallbacks(homeActivity$onCreate$4$timedTask$1);
        int i4 = hashCode + 9;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0284  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x017e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.onResume():void");
    }

    private final void updateNavigation(List<LocalComponent> functions) {
        int i = 2 % 2;
        L l = L.INSTANCE;
        String str = this.TAG;
        Intrinsics.checkNotNullExpressionValue(str, "");
        l.d(str, "updateNavigation: " + functions, new Object[0]);
        List<LocalComponent> list = functions;
        if (list != null) {
            int i2 = hashCode + 87;
            toString = i2 % 128;
            int i3 = i2 % 2;
            if (!list.isEmpty()) {
                ((ActivityHomeBinding) this.binding).llNavigation.setVisibility(0);
                ((ActivityHomeBinding) this.binding).llNavigation.removeAllViews();
                int size = list.size();
                final int i4 = 0;
                while (i4 < size) {
                    LocalComponent localComponent = functions.get(i4);
                    NavigationButton navigationButton = new NavigationButton(this.activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    layoutParams.gravity = 16;
                    navigationButton.setLayoutParams(layoutParams);
                    ((ActivityHomeBinding) this.binding).llNavigation.addView(navigationButton);
                    navigationButton.init(localComponent.getPageIcon(), localComponent.getPageName(), localComponent);
                    navigationButton.setOnClickListener(new View.OnClickListener() {
                        private static int component2 = 0;
                        private static int component3 = 1;

                        @Override
                        public final void onClick(View view) {
                            int i5 = 2 % 2;
                            int i6 = component3 + 29;
                            component2 = i6 % 128;
                            if (i6 % 2 != 0) {
                                HomeActivity.$r8$lambda$sSwd4ylmVroiozmQAYR2GkeS2Fw(this.f$0, i4, view);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            HomeActivity.$r8$lambda$sSwd4ylmVroiozmQAYR2GkeS2Fw(this.f$0, i4, view);
                            int i7 = component3 + 85;
                            component2 = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 59 / 0;
                            }
                        }
                    });
                    i4++;
                    int i5 = hashCode + 73;
                    toString = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 5;
                    }
                }
                return;
            }
        }
        ((ActivityHomeBinding) this.binding).llNavigation.setVisibility(8);
    }

    private static final void updateNavigation$lambda$6(HomeActivity homeActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = toString + 123;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(homeActivity, "");
        ((ActivityHomeBinding) homeActivity.binding).viewPager2.setCurrentItem(i, false);
        int i5 = hashCode + 95;
        toString = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void doSelect(int index) {
        int i = 2 % 2;
        int i2 = toString + 7;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int childCount = ((ActivityHomeBinding) this.binding).llNavigation.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            int i5 = toString + 121;
            hashCode = i5 % 128;
            if (i5 % 2 == 0) {
                NavigationButton navigationButton = (NavigationButton) ((ActivityHomeBinding) this.binding).llNavigation.getChildAt(i4);
                if (navigationButton != null) {
                    navigationButton.setSelected(index == i4);
                }
                i4++;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        selectedPosition = index;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = toString + 105;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            selectedPosition = -1;
            super.onBackPressed();
            int i3 = 66 / 0;
        } else {
            selectedPosition = -1;
            super.onBackPressed();
        }
        int i4 = hashCode + 71;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = hashCode + 83;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.activity_home;
            throw null;
        }
        int i4 = R.layout.activity_home;
        int i5 = toString + 45;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return i4;
    }

    static {
        getSponsorBeneficiariesState = 1;
        copydefault();
        component3();
        INSTANCE = new Companion(null);
        $stable = 8;
        selectedPosition = -1;
        int i = getShareableDataState + 31;
        getSponsorBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r6
  0x0028: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v13 java.lang.String) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean handleRequest(com.huawei.arouter.Router r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.toString
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.hashCode = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1e
            android.net.Uri r6 = r6.getUri()
            java.lang.String r6 = r6.getPath()
            r1 = 85
            int r1 = r1 / r3
            if (r6 == 0) goto L46
            goto L28
        L1e:
            android.net.Uri r6 = r6.getUri()
            java.lang.String r6 = r6.getPath()
            if (r6 == 0) goto L46
        L28:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r1 = "/mainModule/main"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r6 = kotlin.text.StringsKt.contains$default(r6, r1, r3, r0, r2)
            if (r6 == 0) goto L46
            int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.hashCode
            int r1 = r6 + 103
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.toString = r4
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.selectedPosition = r3
            int r6 = r6 + 111
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.toString = r1
            int r6 = r6 % r0
        L46:
            int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.toString
            int r6 = r6 + 47
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.hashCode = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L52
            return r3
        L52:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.handleRequest(com.huawei.arouter.Router):boolean");
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = toString + 27;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            RouteUtils.removeExecuteHandler(this.homeExecuteHandler);
            int i3 = 23 / 0;
        } else {
            super.onDestroy();
            RouteUtils.removeExecuteHandler(this.homeExecuteHandler);
        }
        int i4 = hashCode + 3;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ca  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b0a A[Catch: all -> 0x0bce, TryCatch #17 {all -> 0x0bce, blocks: (B:151:0x0b04, B:153:0x0b0a, B:154:0x0b34), top: B:883:0x0b04, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0c88 A[Catch: all -> 0x0538, TryCatch #8 {all -> 0x0538, blocks: (B:195:0x0c82, B:197:0x0c88, B:198:0x0cb0, B:333:0x1399, B:335:0x139f, B:336:0x13ca, B:457:0x1955, B:459:0x195b, B:460:0x198e, B:750:0x3104, B:752:0x310a, B:753:0x3133, B:784:0x3596, B:786:0x359c, B:787:0x35ca, B:821:0x38ef, B:823:0x38f5, B:824:0x3920, B:801:0x371f, B:803:0x3742, B:804:0x3794, B:620:0x29e7, B:622:0x29ed, B:623:0x2a1b, B:625:0x2a55, B:626:0x2aa2, B:591:0x2679, B:593:0x268e, B:594:0x26ba, B:596:0x26ee, B:597:0x2766, B:569:0x2336, B:571:0x233c, B:572:0x2365, B:574:0x239f, B:575:0x23e6, B:542:0x204b, B:544:0x2060, B:545:0x2093, B:526:0x1e72, B:528:0x1e78, B:529:0x1ea3, B:70:0x06c8, B:72:0x06ce, B:73:0x06fd, B:19:0x019d, B:21:0x01a3, B:22:0x01cb, B:24:0x04a5, B:26:0x04d7, B:27:0x0532, B:33:0x0546, B:35:0x054a, B:56:0x062e, B:58:0x0634, B:59:0x0635, B:61:0x0637, B:63:0x063e, B:64:0x063f, B:39:0x0556, B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62), top: B:866:0x019d, inners: #28, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0d89 A[Catch: all -> 0x1313, PHI: r1 r4 r31
  0x0d89: PHI (r1v648 java.lang.Object) = (r1v647 java.lang.Object), (r1v706 java.lang.Object) binds: [B:203:0x0d32, B:205:0x0d35] A[DONT_GENERATE, DONT_INLINE]
  0x0d89: PHI (r4v137 ??) = (r4v221 ??), (r4v222 ??) binds: [B:203:0x0d32, B:205:0x0d35] A[DONT_GENERATE, DONT_INLINE]
  0x0d89: PHI (r31v112 float) = (r31v202 float), (r31v203 float) binds: [B:203:0x0d32, B:205:0x0d35] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #58 {all -> 0x1313, blocks: (B:202:0x0d2e, B:209:0x0d89, B:212:0x0df7, B:240:0x0f00), top: B:957:0x0d2e }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0db0 A[Catch: all -> 0x0d80, TRY_ENTER, TRY_LEAVE, TryCatch #52 {all -> 0x0d80, blocks: (B:205:0x0d35, B:211:0x0db0, B:218:0x0e1c, B:220:0x0e22, B:221:0x0e6d, B:222:0x0e7a, B:224:0x0e83, B:225:0x0ecd, B:230:0x0ee8, B:232:0x0eec, B:236:0x0ef8), top: B:947:0x0d35 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0e0d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0eda  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x11be A[Catch: all -> 0x12ec, TryCatch #38 {all -> 0x12ec, blocks: (B:272:0x11b4, B:273:0x11b8, B:275:0x11be, B:278:0x11da, B:242:0x0f0e, B:259:0x1091, B:263:0x10de, B:268:0x1152, B:271:0x11ac), top: B:920:0x0f0e }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x139f A[Catch: all -> 0x0538, TryCatch #8 {all -> 0x0538, blocks: (B:195:0x0c82, B:197:0x0c88, B:198:0x0cb0, B:333:0x1399, B:335:0x139f, B:336:0x13ca, B:457:0x1955, B:459:0x195b, B:460:0x198e, B:750:0x3104, B:752:0x310a, B:753:0x3133, B:784:0x3596, B:786:0x359c, B:787:0x35ca, B:821:0x38ef, B:823:0x38f5, B:824:0x3920, B:801:0x371f, B:803:0x3742, B:804:0x3794, B:620:0x29e7, B:622:0x29ed, B:623:0x2a1b, B:625:0x2a55, B:626:0x2aa2, B:591:0x2679, B:593:0x268e, B:594:0x26ba, B:596:0x26ee, B:597:0x2766, B:569:0x2336, B:571:0x233c, B:572:0x2365, B:574:0x239f, B:575:0x23e6, B:542:0x204b, B:544:0x2060, B:545:0x2093, B:526:0x1e72, B:528:0x1e78, B:529:0x1ea3, B:70:0x06c8, B:72:0x06ce, B:73:0x06fd, B:19:0x019d, B:21:0x01a3, B:22:0x01cb, B:24:0x04a5, B:26:0x04d7, B:27:0x0532, B:33:0x0546, B:35:0x054a, B:56:0x062e, B:58:0x0634, B:59:0x0635, B:61:0x0637, B:63:0x063e, B:64:0x063f, B:39:0x0556, B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62), top: B:866:0x019d, inners: #28, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1452  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x14a3 A[Catch: all -> 0x18d0, PHI: r1 r9
  0x14a3: PHI (r1v582 java.lang.Object) = (r1v581 java.lang.Object), (r1v631 java.lang.Object) binds: [B:341:0x1450, B:343:0x1453] A[DONT_GENERATE, DONT_INLINE]
  0x14a3: PHI (r9v70 ??) = (r9v239 ??), (r9v94 ??) binds: [B:341:0x1450, B:343:0x1453] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x18d0, blocks: (B:340:0x144c, B:347:0x14a3, B:356:0x1507, B:374:0x1618, B:378:0x1661), top: B:888:0x144c }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x14b0  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1507 A[Catch: all -> 0x18d0, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x18d0, blocks: (B:340:0x144c, B:347:0x14a3, B:356:0x1507, B:374:0x1618, B:378:0x1661), top: B:888:0x144c }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1748  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x178a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x178f A[Catch: all -> 0x18ab, PHI: r2 r6 r7
  0x178f: PHI (r2v580 java.lang.Object[]) = (r2v579 java.lang.Object[]), (r2v601 java.lang.Object[]) binds: [B:401:0x1788, B:396:0x1769] A[DONT_GENERATE, DONT_INLINE]
  0x178f: PHI (r6v475 int) = (r6v474 int), (r6v492 int) binds: [B:401:0x1788, B:396:0x1769] A[DONT_GENERATE, DONT_INLINE]
  0x178f: PHI (r7v444 int) = (r7v443 int), (r7v458 int) binds: [B:401:0x1788, B:396:0x1769] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x18ab, blocks: (B:390:0x173e, B:391:0x1742, B:403:0x178f, B:400:0x1773, B:380:0x1670, B:386:0x16da, B:389:0x1736), top: B:856:0x1670 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x195b A[Catch: all -> 0x0538, TryCatch #8 {all -> 0x0538, blocks: (B:195:0x0c82, B:197:0x0c88, B:198:0x0cb0, B:333:0x1399, B:335:0x139f, B:336:0x13ca, B:457:0x1955, B:459:0x195b, B:460:0x198e, B:750:0x3104, B:752:0x310a, B:753:0x3133, B:784:0x3596, B:786:0x359c, B:787:0x35ca, B:821:0x38ef, B:823:0x38f5, B:824:0x3920, B:801:0x371f, B:803:0x3742, B:804:0x3794, B:620:0x29e7, B:622:0x29ed, B:623:0x2a1b, B:625:0x2a55, B:626:0x2aa2, B:591:0x2679, B:593:0x268e, B:594:0x26ba, B:596:0x26ee, B:597:0x2766, B:569:0x2336, B:571:0x233c, B:572:0x2365, B:574:0x239f, B:575:0x23e6, B:542:0x204b, B:544:0x2060, B:545:0x2093, B:526:0x1e72, B:528:0x1e78, B:529:0x1ea3, B:70:0x06c8, B:72:0x06ce, B:73:0x06fd, B:19:0x019d, B:21:0x01a3, B:22:0x01cb, B:24:0x04a5, B:26:0x04d7, B:27:0x0532, B:33:0x0546, B:35:0x054a, B:56:0x062e, B:58:0x0634, B:59:0x0635, B:61:0x0637, B:63:0x063e, B:64:0x063f, B:39:0x0556, B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62), top: B:866:0x019d, inners: #28, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x1a12 A[Catch: all -> 0x1d63, TryCatch #31 {all -> 0x1d63, blocks: (B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62, B:502:0x1cd3, B:496:0x1c8c, B:498:0x1c92, B:499:0x1cbc, B:476:0x1ad4, B:478:0x1ae6, B:479:0x1b2f), top: B:908:0x1a0c, outer: #8, inners: #14, #19, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1a62 A[Catch: all -> 0x1d63, TryCatch #31 {all -> 0x1d63, blocks: (B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62, B:502:0x1cd3, B:496:0x1c8c, B:498:0x1c92, B:499:0x1cbc, B:476:0x1ad4, B:478:0x1ae6, B:479:0x1b2f), top: B:908:0x1a0c, outer: #8, inners: #14, #19, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1ab4 A[Catch: all -> 0x1d63, TRY_LEAVE, TryCatch #31 {all -> 0x1d63, blocks: (B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62, B:502:0x1cd3, B:496:0x1c8c, B:498:0x1c92, B:499:0x1cbc, B:476:0x1ad4, B:478:0x1ae6, B:479:0x1b2f), top: B:908:0x1a0c, outer: #8, inners: #14, #19, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1c6a  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1f2b  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x1f75  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x202b  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x21d7  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x22f5  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x24e7  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x2550  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x25aa  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x265b  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x28a6  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x2999  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x2bfc A[Catch: all -> 0x3097, PHI: r1 r31
  0x2bfc: PHI (r1v337 java.lang.Object) = (r1v332 java.lang.Object), (r1v336 java.lang.Object) binds: [B:630:0x2bb2, B:631:0x2bb4] A[DONT_GENERATE, DONT_INLINE]
  0x2bfc: PHI (r31v53 ??) = (r31v196 ??), (r31v197 ??) binds: [B:630:0x2bb2, B:631:0x2bb4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #60 {all -> 0x3097, blocks: (B:629:0x2bae, B:635:0x2bfc, B:639:0x2c6d, B:658:0x2cfc), top: B:961:0x2bae }] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2c23  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2c83  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x2ce0  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x2f4c A[Catch: all -> 0x3073, TryCatch #43 {all -> 0x3073, blocks: (B:690:0x2f42, B:691:0x2f46, B:693:0x2f4c, B:696:0x2f67, B:660:0x2d0a, B:678:0x2e20, B:681:0x2e69, B:686:0x2ede, B:689:0x2f3a), top: B:930:0x2d0a }] */
    /* JADX WARN: Removed duplicated region for block: B:752:0x310a A[Catch: all -> 0x0538, TryCatch #8 {all -> 0x0538, blocks: (B:195:0x0c82, B:197:0x0c88, B:198:0x0cb0, B:333:0x1399, B:335:0x139f, B:336:0x13ca, B:457:0x1955, B:459:0x195b, B:460:0x198e, B:750:0x3104, B:752:0x310a, B:753:0x3133, B:784:0x3596, B:786:0x359c, B:787:0x35ca, B:821:0x38ef, B:823:0x38f5, B:824:0x3920, B:801:0x371f, B:803:0x3742, B:804:0x3794, B:620:0x29e7, B:622:0x29ed, B:623:0x2a1b, B:625:0x2a55, B:626:0x2aa2, B:591:0x2679, B:593:0x268e, B:594:0x26ba, B:596:0x26ee, B:597:0x2766, B:569:0x2336, B:571:0x233c, B:572:0x2365, B:574:0x239f, B:575:0x23e6, B:542:0x204b, B:544:0x2060, B:545:0x2093, B:526:0x1e72, B:528:0x1e78, B:529:0x1ea3, B:70:0x06c8, B:72:0x06ce, B:73:0x06fd, B:19:0x019d, B:21:0x01a3, B:22:0x01cb, B:24:0x04a5, B:26:0x04d7, B:27:0x0532, B:33:0x0546, B:35:0x054a, B:56:0x062e, B:58:0x0634, B:59:0x0635, B:61:0x0637, B:63:0x063e, B:64:0x063f, B:39:0x0556, B:464:0x1a0c, B:466:0x1a12, B:467:0x1a55, B:469:0x1a62, B:471:0x1a6b, B:472:0x1aa8, B:492:0x1c58, B:500:0x1cc3, B:506:0x1d47, B:508:0x1d4d, B:509:0x1d4e, B:511:0x1d50, B:513:0x1d57, B:514:0x1d58, B:474:0x1ab4, B:481:0x1b3b, B:483:0x1b41, B:484:0x1b82, B:486:0x1bac, B:488:0x1bf3, B:490:0x1c0a, B:491:0x1c4e, B:516:0x1d5a, B:518:0x1d61, B:519:0x1d62), top: B:866:0x019d, inners: #28, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:758:0x31ba  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x3206  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x3263  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x3576  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x3663  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x36b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x3701  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x38cf  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x2bb4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:993:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v369 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r12v191 */
    /* JADX WARN: Type inference failed for: r12v192 */
    /* JADX WARN: Type inference failed for: r12v193 */
    /* JADX WARN: Type inference failed for: r12v194 */
    /* JADX WARN: Type inference failed for: r12v195 */
    /* JADX WARN: Type inference failed for: r12v196 */
    /* JADX WARN: Type inference failed for: r12v197 */
    /* JADX WARN: Type inference failed for: r12v198 */
    /* JADX WARN: Type inference failed for: r12v216 */
    /* JADX WARN: Type inference failed for: r12v220 */
    /* JADX WARN: Type inference failed for: r12v221 */
    /* JADX WARN: Type inference failed for: r12v223 */
    /* JADX WARN: Type inference failed for: r12v225 */
    /* JADX WARN: Type inference failed for: r12v228 */
    /* JADX WARN: Type inference failed for: r12v241 */
    /* JADX WARN: Type inference failed for: r12v242 */
    /* JADX WARN: Type inference failed for: r12v243 */
    /* JADX WARN: Type inference failed for: r12v244 */
    /* JADX WARN: Type inference failed for: r12v245 */
    /* JADX WARN: Type inference failed for: r12v246 */
    /* JADX WARN: Type inference failed for: r12v247 */
    /* JADX WARN: Type inference failed for: r12v248 */
    /* JADX WARN: Type inference failed for: r12v249 */
    /* JADX WARN: Type inference failed for: r12v250 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v111 */
    /* JADX WARN: Type inference failed for: r14v112 */
    /* JADX WARN: Type inference failed for: r14v114 */
    /* JADX WARN: Type inference failed for: r14v120 */
    /* JADX WARN: Type inference failed for: r14v121, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v122 */
    /* JADX WARN: Type inference failed for: r14v123 */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v125 */
    /* JADX WARN: Type inference failed for: r14v126 */
    /* JADX WARN: Type inference failed for: r14v127 */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v138 */
    /* JADX WARN: Type inference failed for: r14v139 */
    /* JADX WARN: Type inference failed for: r14v140 */
    /* JADX WARN: Type inference failed for: r14v141 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v143 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v146 */
    /* JADX WARN: Type inference failed for: r14v147 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v149 */
    /* JADX WARN: Type inference failed for: r14v150 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v153 */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v155 */
    /* JADX WARN: Type inference failed for: r14v156 */
    /* JADX WARN: Type inference failed for: r14v157 */
    /* JADX WARN: Type inference failed for: r14v158 */
    /* JADX WARN: Type inference failed for: r14v159 */
    /* JADX WARN: Type inference failed for: r14v160 */
    /* JADX WARN: Type inference failed for: r14v161 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r1v743, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v744, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v198, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v684, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r31v100 */
    /* JADX WARN: Type inference failed for: r31v103 */
    /* JADX WARN: Type inference failed for: r31v104 */
    /* JADX WARN: Type inference failed for: r31v105 */
    /* JADX WARN: Type inference failed for: r31v106 */
    /* JADX WARN: Type inference failed for: r31v109 */
    /* JADX WARN: Type inference failed for: r31v110 */
    /* JADX WARN: Type inference failed for: r31v111 */
    /* JADX WARN: Type inference failed for: r31v113 */
    /* JADX WARN: Type inference failed for: r31v114 */
    /* JADX WARN: Type inference failed for: r31v115 */
    /* JADX WARN: Type inference failed for: r31v116 */
    /* JADX WARN: Type inference failed for: r31v117 */
    /* JADX WARN: Type inference failed for: r31v119 */
    /* JADX WARN: Type inference failed for: r31v120 */
    /* JADX WARN: Type inference failed for: r31v125 */
    /* JADX WARN: Type inference failed for: r31v126 */
    /* JADX WARN: Type inference failed for: r31v127 */
    /* JADX WARN: Type inference failed for: r31v128 */
    /* JADX WARN: Type inference failed for: r31v129 */
    /* JADX WARN: Type inference failed for: r31v130 */
    /* JADX WARN: Type inference failed for: r31v131 */
    /* JADX WARN: Type inference failed for: r31v135 */
    /* JADX WARN: Type inference failed for: r31v14 */
    /* JADX WARN: Type inference failed for: r31v15 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v190 */
    /* JADX WARN: Type inference failed for: r31v191 */
    /* JADX WARN: Type inference failed for: r31v192 */
    /* JADX WARN: Type inference failed for: r31v193 */
    /* JADX WARN: Type inference failed for: r31v194 */
    /* JADX WARN: Type inference failed for: r31v195 */
    /* JADX WARN: Type inference failed for: r31v196 */
    /* JADX WARN: Type inference failed for: r31v197 */
    /* JADX WARN: Type inference failed for: r31v198 */
    /* JADX WARN: Type inference failed for: r31v199 */
    /* JADX WARN: Type inference failed for: r31v200 */
    /* JADX WARN: Type inference failed for: r31v201 */
    /* JADX WARN: Type inference failed for: r31v204 */
    /* JADX WARN: Type inference failed for: r31v205 */
    /* JADX WARN: Type inference failed for: r31v206 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v33 */
    /* JADX WARN: Type inference failed for: r31v34 */
    /* JADX WARN: Type inference failed for: r31v35 */
    /* JADX WARN: Type inference failed for: r31v36 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v50 */
    /* JADX WARN: Type inference failed for: r31v51 */
    /* JADX WARN: Type inference failed for: r31v53 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r31v57 */
    /* JADX WARN: Type inference failed for: r31v58 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v67 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v76 */
    /* JADX WARN: Type inference failed for: r31v90 */
    /* JADX WARN: Type inference failed for: r31v96 */
    /* JADX WARN: Type inference failed for: r31v97 */
    /* JADX WARN: Type inference failed for: r31v98 */
    /* JADX WARN: Type inference failed for: r31v99 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v45 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v12 */
    /* JADX WARN: Type inference failed for: r39v16 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v206 */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v208 */
    /* JADX WARN: Type inference failed for: r3v222 */
    /* JADX WARN: Type inference failed for: r3v240 */
    /* JADX WARN: Type inference failed for: r3v256, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v257 */
    /* JADX WARN: Type inference failed for: r3v258 */
    /* JADX WARN: Type inference failed for: r3v259 */
    /* JADX WARN: Type inference failed for: r3v260 */
    /* JADX WARN: Type inference failed for: r3v274, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v308 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v421 */
    /* JADX WARN: Type inference failed for: r3v422 */
    /* JADX WARN: Type inference failed for: r3v423 */
    /* JADX WARN: Type inference failed for: r3v424 */
    /* JADX WARN: Type inference failed for: r3v425 */
    /* JADX WARN: Type inference failed for: r3v426 */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v117, types: [long] */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v119 */
    /* JADX WARN: Type inference failed for: r4v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v125 */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v136 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v139 */
    /* JADX WARN: Type inference failed for: r4v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v144 */
    /* JADX WARN: Type inference failed for: r4v145 */
    /* JADX WARN: Type inference failed for: r4v146 */
    /* JADX WARN: Type inference failed for: r4v151 */
    /* JADX WARN: Type inference failed for: r4v156 */
    /* JADX WARN: Type inference failed for: r4v173 */
    /* JADX WARN: Type inference failed for: r4v183 */
    /* JADX WARN: Type inference failed for: r4v186 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v201, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v207 */
    /* JADX WARN: Type inference failed for: r4v208 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v211 */
    /* JADX WARN: Type inference failed for: r4v212 */
    /* JADX WARN: Type inference failed for: r4v213 */
    /* JADX WARN: Type inference failed for: r4v214 */
    /* JADX WARN: Type inference failed for: r4v215 */
    /* JADX WARN: Type inference failed for: r4v216 */
    /* JADX WARN: Type inference failed for: r4v217 */
    /* JADX WARN: Type inference failed for: r4v218 */
    /* JADX WARN: Type inference failed for: r4v219 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v220 */
    /* JADX WARN: Type inference failed for: r4v221 */
    /* JADX WARN: Type inference failed for: r4v222 */
    /* JADX WARN: Type inference failed for: r4v223 */
    /* JADX WARN: Type inference failed for: r4v224 */
    /* JADX WARN: Type inference failed for: r4v225 */
    /* JADX WARN: Type inference failed for: r4v226 */
    /* JADX WARN: Type inference failed for: r4v227 */
    /* JADX WARN: Type inference failed for: r4v228 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v588, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v147 */
    /* JADX WARN: Type inference failed for: r7v326, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v127 */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v130 */
    /* JADX WARN: Type inference failed for: r9v141 */
    /* JADX WARN: Type inference failed for: r9v142 */
    /* JADX WARN: Type inference failed for: r9v143 */
    /* JADX WARN: Type inference failed for: r9v155, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v162 */
    /* JADX WARN: Type inference failed for: r9v233 */
    /* JADX WARN: Type inference failed for: r9v234 */
    /* JADX WARN: Type inference failed for: r9v235 */
    /* JADX WARN: Type inference failed for: r9v236 */
    /* JADX WARN: Type inference failed for: r9v237 */
    /* JADX WARN: Type inference failed for: r9v238 */
    /* JADX WARN: Type inference failed for: r9v239 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v243 */
    /* JADX WARN: Type inference failed for: r9v244 */
    /* JADX WARN: Type inference failed for: r9v245 */
    /* JADX WARN: Type inference failed for: r9v246 */
    /* JADX WARN: Type inference failed for: r9v247 */
    /* JADX WARN: Type inference failed for: r9v248 */
    /* JADX WARN: Type inference failed for: r9v249 */
    /* JADX WARN: Type inference failed for: r9v250 */
    /* JADX WARN: Type inference failed for: r9v251 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v92 */
    /* JADX WARN: Type inference failed for: r9v94 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.HomeActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$T6HvLssn_Wu2x7D39zRgCysMRtA(HomeActivity homeActivity) {
        int i = 2 % 2;
        int i2 = toString + 77;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        onCreate$lambda$5(homeActivity);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = hashCode + 57;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
    }

    public static Unit $r8$lambda$ceaOE983D1tMP5exQd6n1iVMeL4(HomeActivity homeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = hashCode + 55;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnCreate$lambda$3 = onCreate$lambda$3(homeActivity, resource);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = toString + 15;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return unitOnCreate$lambda$3;
    }

    public static Unit $r8$lambda$ouoq3TF32AxEgQrif4etsxrOlQs(HomeActivity homeActivity, LocalHomeTheme localHomeTheme) {
        int i = 2 % 2;
        int i2 = toString + 47;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            onCreate$lambda$2(homeActivity, localHomeTheme);
            throw null;
        }
        Unit unitOnCreate$lambda$2 = onCreate$lambda$2(homeActivity, localHomeTheme);
        int i3 = hashCode + 45;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return unitOnCreate$lambda$2;
    }

    public static void $r8$lambda$sSwd4ylmVroiozmQAYR2GkeS2Fw(HomeActivity homeActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = toString + 89;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        m10466instrumented$0$updateNavigation$LjavautilListV(homeActivity, i, view);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10465$r8$lambda$wEOOXgi3n_H9A3yBEzQkQu0TH0(HomeActivity homeActivity, HomeActivity$onCreate$4$timedTask$1 homeActivity$onCreate$4$timedTask$1) {
        int i = 2 % 2;
        int i2 = hashCode + 121;
        toString = i2 % 128;
        int i3 = i2 % 2;
        onCreate$lambda$5$lambda$4(homeActivity, homeActivity$onCreate$4$timedTask$1);
        int i4 = hashCode + 89;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void m10466instrumented$0$updateNavigation$LjavautilListV(HomeActivity homeActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = toString + 37;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        Callback.onClick_enter(view);
        try {
            updateNavigation$lambda$6(homeActivity, i, view);
            Callback.onClick_exit();
            int i5 = toString + 65;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = toString + 55;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = toString + 111;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = hashCode + 123;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 11;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        component2 = (char) 32098;
        copydefault = (char) 36151;
        ShareDataUIState = (char) 22135;
        component3 = (char) 27287;
        int i5 = i2 + 121;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
    }

    static void copydefault() {
        component1 = -7267751668527799318L;
        getRequestBeneficiariesState = -825260317;
        getAsAtTimestamp = -238323850;
        component4 = 1411214603;
        equals = new byte[]{-113, -46, Base64.padSymbol, -11, 37, -110, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, -102, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 47, 32, -38, 41, -44, 59, -8, 7, -44, 42, -42, 44, -43, -41, -4, -41, 3, 46, 40, 40, -26, -43, -42, 41, 44, -42, 7, -25, 7, 45, -26, 6, 42, -5, 5, 41, 45, -26, 5, -8, Ascii.ESC, -45, 41, 42, -6, Ascii.SUB, -30, 43, 5, 40, -7, Ascii.FS, -47, -15, -56, 7, 40, -41, 45, -45, -6, 45, -42, Ascii.ESC, 41, -42, -47, -1, 5, 47, -25, Ascii.CAN, -48, 32, -48, -41, 42, -42, -5, 4, -3, Ascii.SUB, 40, -28, 4, 47, -29, Ascii.SUB, 41, -26, Ascii.CAN, -44, -5, Ascii.EM, -41, -41, 40, 44, -44, 41, -5, -41, 42, 4, 44, -48, -8, 42, 41, 4, 40, 42, -43, 44, -28, 5, -5, Ascii.US, -64, -42, 47, 32, -58, 56, Ascii.US, -44, -107, 110, -110, 40, 39, -41, -48, 44, 19, -17, -48, 38, Ascii.ESC, -21, -41, 37, Ascii.FS, -32, -38, 56, -59, 45, -41, 38, -37, 56, -59, 39, Ascii.DLE, -109, 40, 59, -41, -58, 58, -43, -38, 35, -35, 111, -27, -42, 5, 42, 43, 41, -43, 44, -43, 40, -25, Ascii.SUB, -43, -42, 42, -42, 46, 41, -36, -18, 42, -43, 41, 37, -114, 44, -45, 42, 42, -36, -123, -43, 46, -47, 42, -41, -42, 43, 47, -45, 47};
    }
}
