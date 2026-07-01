package com.huawei.digitalpayment.consumer.pochiwallet.ui.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.checkout.resp.CommonSuccessFunctionBean;
import com.huawei.digitalpayment.checkout.resp.ReceiptTypes;
import com.huawei.digitalpayment.checkout.ui.activity.SfcCommonSuccessActivity;
import com.huawei.digitalpayment.checkout.ui.adapter.SfcCommonSuccessFunctionAdapter;
import com.huawei.digitalpayment.checkout.ui.dialog.AddFavoritesDialog;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.base.resp.ReceiptItem;
import com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.base.util.TimestampFormatterUtil;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.utils.PochiStatementHelper;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ActivityPochiStatementsDetailsBinding;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import com.safaricom.consumer.commons.statements.StatementWrapper;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0016\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\u0010\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\b\u0010/\u001a\u00020\u001bH\u0002J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020\u001bH\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\u0012\u00104\u001a\u00020\u001b2\b\u00105\u001a\u0004\u0018\u00010*H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000bj\b\u0012\u0004\u0012\u00020\n`\tX\u0082.¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/activity/PochiStatementsDetailsActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfcpochiwallet/databinding/ActivityPochiStatementsDetailsBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/viewmodel/MpesaStatementsDetailsViewModel;", "<init>", "()V", "statementWrapperResp", "Lcom/safaricom/consumer/commons/statements/StatementWrapper;", "functionList", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/checkout/resp/CommonSuccessFunctionBean;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "functionAdapter", "Lcom/huawei/digitalpayment/checkout/ui/adapter/SfcCommonSuccessFunctionAdapter;", "manageFavoriteViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "getManageFavoriteViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "manageFavoriteViewModel$delegate", "Lkotlin/Lazy;", "isAddFavorite", "", "isDownLoaded", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "updateFavoriteView", "updateFunctions", "favoriteFriendsBeans", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "showShareSheet", "startReceiptDownload", "buildReceiptItems", "", "Lcom/huawei/digitalpayment/consumer/base/resp/ReceiptItem;", "getNumberDisplay", "", "showAddFavoritesDialog", "getBusinessType", "transactionType", "initListener", "initView", "copyToClipboard", "text", "initFunctions", "hasFavorites", "initToolbar", "title", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class PochiStatementsDetailsActivity extends Hilt_PochiStatementsDetailsActivity<ActivityPochiStatementsDetailsBinding, MpesaStatementsDetailsViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static int component1;
    private static char[] component2;
    private static char component3;
    private static byte[] component4;
    private static int copydefault;
    private static short[] getAsAtTimestamp;
    private static int hashCode;
    private SfcCommonSuccessFunctionAdapter functionAdapter;
    private ArrayList<CommonSuccessFunctionBean> functionList;
    private boolean isAddFavorite;
    private boolean isDownLoaded;

    private final Lazy manageFavoriteViewModel;
    private StatementWrapper statementWrapperResp;
    private static final byte[] $$l = {5, -4, -80, 1};
    private static final int $$o = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {69, -50, 81, 75, -18, -4, 57, -64, -19, Ascii.SO, -28, Ascii.FF, -10, TarHeader.LF_DIR, -60, -11, -4, -8, -17, 13, -17, -10, 9, -30, 6, 2, -15, -12, SignedBytes.MAX_POWER_OF_TWO, -59, -18, -5, -11, -8, 2, 2, -19, 62, -79, Ascii.FF, -3, -26, 7, -2, -24, 67, -65, -11, -12, 9, -19, Ascii.VT, -8, -23, 5, -12, -5, 58, -62, -21, 1, 5, -23, 5, -12, -5, 58, -43, -39, 13, -23, -8, Ascii.RS, -23, -30, 79, -23, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -4, 57, -65, 2, -21, 60, -57, -8, 47, -57, -19, 4, -20, -3, 0, -1, TarHeader.LF_NORMAL, -57, -8, -22, 63, -71, -7, 5, -19, Ascii.VT, -25, 5, -12, -5, 58, -58, -13, -23, 70, -74, 7, -8, -8, -12, -5, 58, -71, -7, 5, -19, Ascii.VT, -25, 5, -12, -5, 58, -74, 7, -17, -5, -10, 4, -17, -1, -9, -13, 69, -30, -37, -21, Ascii.VT, -11, 33, -49, -6, 37, -53, -6, -9, Ascii.ESC, -25, -18, -10, 10, -20, -7};
    private static final int $$t = 63;
    private static final byte[] $$d = {32, 13, -54, -47, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 147;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int component3 = 1;
        private final Function1 copydefault;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            Object obj2 = null;
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                int i2 = component3 + 115;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    obj2.hashCode();
                    throw null;
                }
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            } else {
                zAreEqual = false;
            }
            int i3 = component2 + 65;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return zAreEqual;
            }
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3 + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.copydefault;
            if (i3 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            component2 = i2 % 128;
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

    private static String $$r(byte b2, int i, short s) {
        int i2 = s * 3;
        int i3 = 3 - (i * 4);
        byte[] bArr = $$l;
        int i4 = b2 + 112;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i3 + 1;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i8];
            i3 = i8;
            i6 = i7;
        }
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
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r0 = 28 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.$$d
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
        L2c:
            int r8 = r8 + r4
            int r8 = r8 + (-8)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.i(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 99
            int r0 = 84 - r6
            int r8 = r8 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.$$s
            byte[] r0 = new byte[r0]
            int r6 = 83 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-6)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.j(short, byte, byte, java.lang.Object[]):void");
    }

    public static final ManageFavouriteViewModel access$getManageFavoriteViewModel(PochiStatementsDetailsActivity pochiStatementsDetailsActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel manageFavoriteViewModel = pochiStatementsDetailsActivity.getManageFavoriteViewModel();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = getRequestBeneficiariesState + 41;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return manageFavoriteViewModel;
    }

    public static final void access$updateFunctions(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        pochiStatementsDetailsActivity.updateFunctions(list);
        int i4 = getRequestBeneficiariesState + 79;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public PochiStatementsDetailsActivity() {
        final PochiStatementsDetailsActivity pochiStatementsDetailsActivity = this;
        final Function0 function0 = null;
        this.manageFavoriteViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ManageFavouriteViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 65;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = pochiStatementsDetailsActivity;
                if (i3 == 0) {
                    return componentActivity.getViewModelStore();
                }
                componentActivity.getViewModelStore();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 39;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component3 + 21;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 30 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory factoryInvoke;
                int i = 2 % 2;
                int i2 = component2 + 11;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    factoryInvoke = invoke();
                    int i3 = 27 / 0;
                } else {
                    factoryInvoke = invoke();
                }
                int i4 = component1 + 47;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = pochiStatementsDetailsActivity.getDefaultViewModelProviderFactory();
                if (i3 == 0) {
                    int i4 = 61 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 83;
                int i3 = i2 % 128;
                component1 = i3;
                int i4 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i3 + 43;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        CreationExtras creationExtras = (CreationExtras) function02.invoke();
                        int i6 = 2 / 0;
                        if (creationExtras != null) {
                            return creationExtras;
                        }
                    } else {
                        CreationExtras creationExtras2 = (CreationExtras) function02.invoke();
                        if (creationExtras2 != null) {
                            return creationExtras2;
                        }
                    }
                }
                return pochiStatementsDetailsActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 5;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component2 + 37;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ManageFavouriteViewModel getManageFavoriteViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel manageFavouriteViewModel = (ManageFavouriteViewModel) this.manageFavoriteViewModel.getValue();
        if (i3 != 0) {
            return manageFavouriteViewModel;
        }
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 87;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_pochi_statements_details;
        int i5 = equals + 49;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity$initObserver$1", f = "PochiStatementsDetailsActivity.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity$initObserver$1$1", f = "PochiStatementsDetailsActivity.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            int component1;
            final PochiStatementsDetailsActivity component2;

            /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r1
  0x003b: PHI (r1v11 java.lang.Object) = (r1v4 java.lang.Object), (r1v12 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.ShareDataUIState
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.copydefault = r2
                    int r1 = r1 % r0
                    r2 = 1
                    if (r1 != 0) goto L1c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r5.component1
                    r4 = 87
                    int r4 = r4 / 0
                    if (r3 == 0) goto L3b
                    goto L24
                L1c:
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r5.component1
                    if (r3 == 0) goto L3b
                L24:
                    if (r3 != r2) goto L33
                    int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.ShareDataUIState
                    int r1 = r1 + 21
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.copydefault = r2
                    int r1 = r1 % r0
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L6a
                L33:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L3b:
                    kotlin.ResultKt.throwOnFailure(r6)
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity r6 = r5.component2
                    com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel r6 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.access$getManageFavoriteViewModel(r6)
                    kotlinx.coroutines.flow.StateFlow r6 = r6.getFavoriteItems()
                    kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity$initObserver$1$1$invokeSuspend$$inlined$map$1 r3 = new com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity$initObserver$1$1$invokeSuspend$$inlined$map$1
                    r3.<init>()
                    kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
                    kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r3)
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity$component1$3$3 r3 = new com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity$component1$3$3
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity r4 = r5.component2
                    r3.<init>()
                    kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                    r4 = r5
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    r5.component1 = r2
                    java.lang.Object r6 = r6.collect(r3, r4)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.ShareDataUIState
                    int r1 = r1 + 19
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.copydefault = r2
                    int r1 = r1 % r0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.component1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component2 = pochiStatementsDetailsActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component2, continuation);
                int i2 = copydefault + 77;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                copydefault = i2 % 128;
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
                int i2 = copydefault + 13;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 73;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component3 + 27;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 121;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(PochiStatementsDetailsActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(PochiStatementsDetailsActivity.this, null), this) == coroutine_suspended) {
                    int i8 = ShareDataUIState + 57;
                    component3 = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = PochiStatementsDetailsActivity.this.new component1(continuation);
            int i2 = ShareDataUIState + 91;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
            }
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                copydefault(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objCopydefault = copydefault(coroutineScope2, continuation2);
            int i3 = component3 + 29;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 15;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r26, int r27, int r28, int r29, short r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.h(byte, int, int, int, short, java.lang.Object[]):void");
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 7422, (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 16, (char) (View.combineMeasuredStates(0, 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 85;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 7422, 15 - TextUtils.indexOf("", "", 0), (char) (Color.green(0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            int i7 = $10 + 67;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i9 = $10 + 23;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i11 = $11 + 93;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 7117, 14 - Color.blue(0), (char) (44464 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i13 = $11 + 5;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) ($$l[3] - 1);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - Color.red(0), 24 - TextUtils.indexOf("", "", 0), (char) (27685 - AndroidCharacter.getMirror('0')), 794909189, false, $$r((byte) 7, b3, b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                        } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i16 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i16];
                            cArr4[cancelall.component2 + 1] = cArr2[i17];
                        } else {
                            int i18 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i18];
                            cArr4[cancelall.component2 + 1] = cArr2[i19];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += 2;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            i20++;
            int i21 = $10 + 5;
            $11 = i21 % 128;
            int i22 = i21 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        PochiStatementsDetailsActivity pochiStatementsDetailsActivity = this;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(pochiStatementsDetailsActivity), null, null, new component1(null), 3, null);
        ((MpesaStatementsDetailsViewModel) this.viewModel).getCreateData().observe(pochiStatementsDetailsActivity, new component2(new Function1() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 43;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    PochiStatementsDetailsActivity.m10810$r8$lambda$BiqBVSMhSWYc_DJz1lHXZJzIs0(this.f$0, (Resource) obj);
                    throw null;
                }
                Unit unitM10810$r8$lambda$BiqBVSMhSWYc_DJz1lHXZJzIs0 = PochiStatementsDetailsActivity.m10810$r8$lambda$BiqBVSMhSWYc_DJz1lHXZJzIs0(this.f$0, (Resource) obj);
                int i4 = copydefault + 69;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitM10810$r8$lambda$BiqBVSMhSWYc_DJz1lHXZJzIs0;
                }
                throw null;
            }
        }));
        int i2 = equals + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObserver$lambda$0(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 67;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
            Utils.showOrHideLoading(pochiStatementsDetailsActivity, resource);
            resource.error();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
        Utils.showOrHideLoading(pochiStatementsDetailsActivity, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
            int i3 = equals + 39;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 4;
            }
        }
        if (resource.success()) {
            pochiStatementsDetailsActivity.updateFavoriteView();
        }
        return Unit.INSTANCE;
    }

    private final void updateFavoriteView() {
        Object next;
        int i = 2 % 2;
        ArrayList<CommonSuccessFunctionBean> arrayList = this.functionList;
        SfcCommonSuccessFunctionAdapter sfcCommonSuccessFunctionAdapter = null;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((CommonSuccessFunctionBean) next).getId(), "add_favorite")) {
                    break;
                }
            }
        }
        CommonSuccessFunctionBean commonSuccessFunctionBean = (CommonSuccessFunctionBean) next;
        if (commonSuccessFunctionBean != null) {
            int i2 = equals + 109;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            commonSuccessFunctionBean.setIcon(com.huawei.digitalpayment.checkoutUi.R.drawable.icon_sfc_add_favourites_success);
            commonSuccessFunctionBean.setSelected(true);
        } else {
            commonSuccessFunctionBean = null;
        }
        SfcCommonSuccessFunctionAdapter sfcCommonSuccessFunctionAdapter2 = this.functionAdapter;
        if (sfcCommonSuccessFunctionAdapter2 == null) {
            int i4 = equals + 107;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            sfcCommonSuccessFunctionAdapter2 = null;
        }
        int itemPosition = sfcCommonSuccessFunctionAdapter2.getItemPosition(commonSuccessFunctionBean);
        SfcCommonSuccessFunctionAdapter sfcCommonSuccessFunctionAdapter3 = this.functionAdapter;
        if (sfcCommonSuccessFunctionAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = getRequestBeneficiariesState + 55;
            equals = i5 % 128;
            int i6 = i5 % 2;
        } else {
            sfcCommonSuccessFunctionAdapter = sfcCommonSuccessFunctionAdapter3;
        }
        sfcCommonSuccessFunctionAdapter.notifyItemChanged(itemPosition);
    }

    private final void updateFunctions(List<FavoriteFriendsBean> favoriteFriendsBeans) {
        int i = 2 % 2;
        SfcCommonSuccessFunctionAdapter sfcCommonSuccessFunctionAdapter = null;
        if (!CollectionUtils.isEmpty(favoriteFriendsBeans)) {
            int i2 = getRequestBeneficiariesState + 13;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Iterator<FavoriteFriendsBean> it = favoriteFriendsBeans.iterator();
            while (it.hasNext()) {
                String str = SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(it.next().getPhoneNumber());
                SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
                StatementWrapper statementWrapper = this.statementWrapperResp;
                if (statementWrapper == null) {
                    int i4 = getRequestBeneficiariesState + 115;
                    equals = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    statementWrapper = null;
                }
                if (Intrinsics.areEqual(str, companion.formatterInputPhoneNumber(statementWrapper.getNumber()))) {
                    this.isAddFavorite = true;
                }
            }
        }
        this.functionList = new ArrayList<>();
        if (hasFavorites()) {
            if (!this.isAddFavorite) {
                ArrayList<CommonSuccessFunctionBean> arrayList = this.functionList;
                if (arrayList == null) {
                    int i6 = getRequestBeneficiariesState + 19;
                    equals = i6 % 128;
                    if (i6 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i7 = 21 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    arrayList = null;
                }
                String string = getString(com.huawei.digitalpayment.checkoutUi.R.string.sfc_add_favourites);
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(new CommonSuccessFunctionBean(string, com.huawei.digitalpayment.checkoutUi.R.drawable.icon_sfc_add_favourites, "add_favorite", false, 0.0f, 24, null));
            } else {
                int i8 = equals + 65;
                getRequestBeneficiariesState = i8 % 128;
                if (i8 % 2 != 0) {
                    sfcCommonSuccessFunctionAdapter.hashCode();
                    throw null;
                }
                ArrayList<CommonSuccessFunctionBean> arrayList2 = this.functionList;
                if (arrayList2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    arrayList2 = null;
                }
                String string2 = getString(com.huawei.digitalpayment.checkoutUi.R.string.sfc_add_favourites);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList2.add(new CommonSuccessFunctionBean(string2, com.huawei.digitalpayment.checkoutUi.R.drawable.icon_sfc_add_favourites_success, "add_favorite", true, 0.0f, 16, null));
            }
        }
        ArrayList<CommonSuccessFunctionBean> arrayList3 = this.functionList;
        if (arrayList3 == null) {
            int i9 = equals + 11;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            arrayList3 = null;
        }
        String string3 = getString(com.huawei.digitalpayment.checkoutUi.R.string.sfc_download_receipt);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        arrayList3.add(new CommonSuccessFunctionBean(string3, com.huawei.digitalpayment.checkoutUi.R.drawable.icon_sfc_download_receipt, SfcCommonSuccessActivity.TYPE_DOWN_RECEIPT, false, 0.0f, 24, null));
        ArrayList<CommonSuccessFunctionBean> arrayList4 = this.functionList;
        if (arrayList4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i11 = getRequestBeneficiariesState + 81;
            equals = i11 % 128;
            int i12 = i11 % 2;
            arrayList4 = null;
        }
        String string4 = getString(com.huawei.digitalpayment.checkoutUi.R.string.sfc_share_details);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList4.add(new CommonSuccessFunctionBean(string4, com.huawei.digitalpayment.checkoutUi.R.drawable.icon_sfc_share_details, SfcCommonSuccessActivity.TYPE_SHARE_DETAILS, false, 0.0f, 24, null));
        ArrayList<CommonSuccessFunctionBean> arrayList5 = this.functionList;
        if (arrayList5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i13 = equals + 63;
            getRequestBeneficiariesState = i13 % 128;
            int i14 = i13 % 2;
            arrayList5 = null;
        }
        ((ActivityPochiStatementsDetailsBinding) this.binding).rvFunction.setLayoutManager(new GridLayoutManager(this, arrayList5.size()));
        ArrayList<CommonSuccessFunctionBean> arrayList6 = this.functionList;
        if (arrayList6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arrayList6 = null;
        }
        this.functionAdapter = new SfcCommonSuccessFunctionAdapter(arrayList6);
        RecyclerView recyclerView = ((ActivityPochiStatementsDetailsBinding) this.binding).rvFunction;
        SfcCommonSuccessFunctionAdapter sfcCommonSuccessFunctionAdapter2 = this.functionAdapter;
        if (sfcCommonSuccessFunctionAdapter2 == null) {
            int i15 = getRequestBeneficiariesState + 115;
            equals = i15 % 128;
            if (i15 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            sfcCommonSuccessFunctionAdapter2 = null;
        }
        recyclerView.setAdapter(sfcCommonSuccessFunctionAdapter2);
        SfcCommonSuccessFunctionAdapter sfcCommonSuccessFunctionAdapter3 = this.functionAdapter;
        if (sfcCommonSuccessFunctionAdapter3 == null) {
            int i16 = equals + 57;
            getRequestBeneficiariesState = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            sfcCommonSuccessFunctionAdapter = sfcCommonSuccessFunctionAdapter3;
        }
        sfcCommonSuccessFunctionAdapter.setOnItemClickListener(new OnItemClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i18) throws Throwable {
                int i19 = 2 % 2;
                int i20 = ShareDataUIState + 59;
                component3 = i20 % 128;
                int i21 = i20 % 2;
                PochiStatementsDetailsActivity.m10812$r8$lambda$oDAmAy3diQ288o9yF8Za9LIVtQ(this.f$0, baseQuickAdapter, view, i18);
                int i22 = ShareDataUIState + 25;
                component3 = i22 % 128;
                int i23 = i22 % 2;
            }
        });
    }

    private static final void updateFunctions$lambda$3(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 95;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "");
        Intrinsics.checkNotNullParameter(view, "");
        Object item = baseQuickAdapter.getItem(i);
        Intrinsics.checkNotNull(item, "");
        String id = ((CommonSuccessFunctionBean) item).getId();
        int iHashCode = id.hashCode();
        if (iHashCode == -1590985829) {
            if (id.equals(SfcCommonSuccessActivity.TYPE_DOWN_RECEIPT)) {
                pochiStatementsDetailsActivity.startReceiptDownload();
                return;
            }
            return;
        }
        if (iHashCode == -1000560774) {
            if (id.equals("add_favorite")) {
                if (!(!r4.getSelected())) {
                    CommonToast.showText(pochiStatementsDetailsActivity.getString(com.huawei.digitalpayment.checkoutUi.R.string.it_has_already_been_added));
                    return;
                }
                int i5 = equals + 89;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                pochiStatementsDetailsActivity.showAddFavoritesDialog();
                return;
            }
            return;
        }
        int i7 = getRequestBeneficiariesState + 61;
        equals = i7 % 128;
        int i8 = i7 % 2;
        if (iHashCode != -523527710) {
            return;
        }
        if (id.equals(SfcCommonSuccessActivity.TYPE_SHARE_DETAILS)) {
            pochiStatementsDetailsActivity.showShareSheet();
            return;
        }
        int i9 = getRequestBeneficiariesState + 35;
        equals = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showShareSheet() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.showShareSheet():void");
    }

    private final List<ReceiptItem> buildReceiptItems() {
        int i = 2 % 2;
        StatementWrapper statementWrapper = this.statementWrapperResp;
        StatementWrapper statementWrapper2 = null;
        if (statementWrapper == null) {
            int i2 = equals + 83;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper = null;
        }
        String id = statementWrapper.getStatement().getId();
        ArrayList arrayList = new ArrayList();
        StatementWrapper statementWrapper3 = this.statementWrapperResp;
        if (statementWrapper3 == null) {
            int i4 = getRequestBeneficiariesState + 3;
            equals = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper3 = null;
        }
        arrayList.add(new ReceiptItem("Paid to", statementWrapper3.getStatement().getReceiverParty().getName()));
        StatementWrapper statementWrapper4 = this.statementWrapperResp;
        if (statementWrapper4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper4 = null;
        }
        arrayList.add(new ReceiptItem("Transaction Type", statementWrapper4.getStatement().getTransactionType()));
        String numberDisplay = getNumberDisplay();
        StatementWrapper statementWrapper5 = this.statementWrapperResp;
        if (statementWrapper5 == null) {
            int i6 = equals + 123;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            statementWrapper2 = statementWrapper5;
        }
        arrayList.add(new ReceiptItem(numberDisplay, statementWrapper2.getStatement().getReceiverParty().getId()));
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        String recentLoginPhone = PhoneUtils.getRecentLoginPhone();
        Intrinsics.checkNotNullExpressionValue(recentLoginPhone, "");
        arrayList.add(new ReceiptItem("Paid from", companion.formatterPhoneNumberNoCountryCode(recentLoginPhone)));
        arrayList.add(new ReceiptItem("M- Pesa Reference", id));
        arrayList.add(new ReceiptItem("Date and Time", ((ActivityPochiStatementsDetailsBinding) this.binding).tvDate.getText().toString()));
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getNumberDisplay() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            com.safaricom.consumer.commons.statements.StatementWrapper r1 = r3.statementWrapperResp
            if (r1 != 0) goto L16
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r1 = 0
        L16:
            com.safaricom.consumer.commons.statements.Statement r1 = r1.getStatement()
            java.lang.String r1 = r1.getTransactionType()
            int r2 = r1.hashCode()
            switch(r2) {
                case -941772656: goto L65;
                case -779848400: goto L5f;
                case -479870791: goto L5c;
                case 876694703: goto L50;
                case 1227819445: goto L38;
                case 2055060202: goto L26;
                default: goto L25;
            }
        L25:
            goto L71
        L26:
            java.lang.String r2 = "PochiPayBill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L59
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals = r2
            int r1 = r1 % r0
            goto L71
        L38:
            java.lang.String r2 = "PochiBuyGoods"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L71
            r0 = 94
            int r0 = r0 / 0
            goto L71
        L50:
            java.lang.String r0 = "PayBill"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L59
            goto L71
        L59:
            java.lang.String r0 = "Paybill"
            goto L73
        L5c:
            java.lang.String r0 = "P2PTransfer"
            goto L61
        L5f:
            java.lang.String r0 = "PochiTransfer"
        L61:
            r1.equals(r0)
            goto L71
        L65:
            java.lang.String r0 = "BuyGoods"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6e
            goto L71
        L6e:
            java.lang.String r0 = "TillNumber"
            goto L73
        L71:
            java.lang.String r0 = "PhoneNumber"
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getNumberDisplay():java.lang.String");
    }

    private final void showAddFavoritesDialog() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        StatementWrapper statementWrapper = this.statementWrapperResp;
        if (statementWrapper == null) {
            int i5 = i3 + 29;
            getRequestBeneficiariesState = i5 % 128;
            statementWrapper = null;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                statementWrapper.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        new AddFavoritesDialog(statementWrapper.getStatement().getReceiverParty().getName(), -1, "", new Function1() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = component2 + 111;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                Unit unit$r8$lambda$CXINird1jjlLMzWanbhIHfeq24I = PochiStatementsDetailsActivity.$r8$lambda$CXINird1jjlLMzWanbhIHfeq24I(this.f$0, (String) obj);
                int i9 = component2 + 71;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
                return unit$r8$lambda$CXINird1jjlLMzWanbhIHfeq24I;
            }
        }).show(getSupportFragmentManager(), "addFavorites");
    }

    private static final Unit showAddFavoritesDialog$lambda$6(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        StatementWrapper statementWrapper = pochiStatementsDetailsActivity.statementWrapperResp;
        Object obj = null;
        if (statementWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper = null;
        }
        map2.put(CheckIdentityActivity.ID_NUMBER, statementWrapper.getStatement().getReceiverParty().getId());
        map2.put("favouriteName", str);
        StatementWrapper statementWrapper2 = pochiStatementsDetailsActivity.statementWrapperResp;
        if (statementWrapper2 == null) {
            int i2 = equals + 39;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 26 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            statementWrapper2 = null;
        }
        if (Intrinsics.areEqual(statementWrapper2.getStatement().getTransactionTypeID(), DisPlayItems.PAY_BILL_TYPE_ID)) {
            int i4 = getRequestBeneficiariesState + 41;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                StatementWrapper statementWrapper3 = pochiStatementsDetailsActivity.statementWrapperResp;
                obj.hashCode();
                throw null;
            }
            StatementWrapper statementWrapper4 = pochiStatementsDetailsActivity.statementWrapperResp;
            if (statementWrapper4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                statementWrapper4 = null;
            }
            map2.put("accountNum", statementWrapper4.getStatement().getAccountRef());
        }
        MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel = (MpesaStatementsDetailsViewModel) pochiStatementsDetailsActivity.viewModel;
        StatementWrapper statementWrapper5 = pochiStatementsDetailsActivity.statementWrapperResp;
        if (statementWrapper5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper5 = null;
        }
        String businessType = pochiStatementsDetailsActivity.getBusinessType(statementWrapper5.getStatement().getTransactionType());
        String json = GsonUtils.toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        mpesaStatementsDetailsViewModel.addFavourite(TradeTypeConstant.MPESA_TRANSACTION, businessType, json);
        Unit unit = Unit.INSTANCE;
        int i5 = getRequestBeneficiariesState + 41;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final String getBusinessType(String transactionType) {
        int i = 2 % 2;
        if (Intrinsics.areEqual(transactionType, ReceiptTypes.SENDMONEY_NAME)) {
            int i2 = getRequestBeneficiariesState + 17;
            equals = i2 % 128;
            int i3 = i2 % 2;
            transactionType = "P2PTransfer";
        } else if (Intrinsics.areEqual(transactionType, ReceiptTypes.BUYGOODS_ALT_NAME)) {
            int i4 = equals + 97;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            transactionType = "BuyGoods";
        }
        int i6 = equals + 109;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
        return transactionType;
    }

    private static final void initListener$lambda$7(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
            RouteUtils.routeWithExecute("/pochiWalletModule/pochiStatements");
            pochiStatementsDetailsActivity.finish();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
        RouteUtils.routeWithExecute("/pochiWalletModule/pochiStatements");
        pochiStatementsDetailsActivity.finish();
        int i3 = equals + 59;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
    }

    private final void initListener() {
        int i = 2 % 2;
        ((ActivityPochiStatementsDetailsBinding) this.binding).ivDelete.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 1;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                PochiStatementsDetailsActivity.m10811$r8$lambda$dqgBs6ZRXVislm31cLmO2ngwQ(this.f$0, view);
                int i5 = component3 + 119;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityPochiStatementsDetailsBinding) this.binding).tvCopy.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 27;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                PochiStatementsDetailsActivity.$r8$lambda$DNZs6rjkrdtgoqiOmkrwrBiQCgQ(this.f$0, view);
                int i5 = component1 + 41;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void initListener$lambda$8(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
            pochiStatementsDetailsActivity.copyToClipboard(((ActivityPochiStatementsDetailsBinding) pochiStatementsDetailsActivity.binding).tvId.getText().toString());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pochiStatementsDetailsActivity, "");
        pochiStatementsDetailsActivity.copyToClipboard(((ActivityPochiStatementsDetailsBinding) pochiStatementsDetailsActivity.binding).tvId.getText().toString());
        int i3 = getRequestBeneficiariesState + 35;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
    }

    private final void initView() throws Throwable {
        String name;
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        equals = i2 % 128;
        StatementWrapper statementWrapper = null;
        if (i2 % 2 == 0) {
            Serializable serializableExtra = getIntent().getSerializableExtra("pochiStatementResp");
            Intrinsics.checkNotNull(serializableExtra, "");
            this.statementWrapperResp = (StatementWrapper) serializableExtra;
            throw null;
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra("pochiStatementResp");
        Intrinsics.checkNotNull(serializableExtra2, "");
        StatementWrapper statementWrapper2 = (StatementWrapper) serializableExtra2;
        this.statementWrapperResp = statementWrapper2;
        if (statementWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper2 = null;
        }
        if (Float.parseFloat(statementWrapper2.getStatement().getMoney_out()) > 0.0f) {
            StatementWrapper statementWrapper3 = this.statementWrapperResp;
            if (statementWrapper3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                statementWrapper3 = null;
            }
            name = statementWrapper3.getStatement().getReceiverParty().getName();
            StatementWrapper statementWrapper4 = this.statementWrapperResp;
            if (statementWrapper4 == null) {
                int i3 = equals + 7;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = 50 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                statementWrapper4 = null;
            }
            str = "-Ksh " + statementWrapper4.getStatement().getMoney_out();
        } else {
            StatementWrapper statementWrapper5 = this.statementWrapperResp;
            if (statementWrapper5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                statementWrapper5 = null;
            }
            name = statementWrapper5.getStatement().getPrimaryParty().getName();
            StatementWrapper statementWrapper6 = this.statementWrapperResp;
            if (statementWrapper6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                statementWrapper6 = null;
            }
            str = "+Ksh " + statementWrapper6.getStatement().getMoney_in();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.ISO_DATE_FORMAT, Locale.ROOT);
        StatementWrapper statementWrapper7 = this.statementWrapperResp;
        if (statementWrapper7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper7 = null;
        }
        Date date = simpleDateFormat.parse(statementWrapper7.getStatement().getEndTime());
        if (date != null) {
            ((ActivityPochiStatementsDetailsBinding) this.binding).tvDate.setText(TimestampFormatterUtil.INSTANCE.formatTimestamp(String.valueOf(date.getTime())));
        }
        ((ActivityPochiStatementsDetailsBinding) this.binding).tvSendName.setText(name);
        TextView textView = ((ActivityPochiStatementsDetailsBinding) this.binding).tvPhoneNumber;
        StatementWrapper statementWrapper8 = this.statementWrapperResp;
        if (statementWrapper8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper8 = null;
        }
        textView.setText(statementWrapper8.getMaskNumber());
        RoundTextView roundTextView = ((ActivityPochiStatementsDetailsBinding) this.binding).tvTitle;
        StatementWrapper statementWrapper9 = this.statementWrapperResp;
        if (statementWrapper9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper9 = null;
        }
        roundTextView.setText(statementWrapper9.getStatement().getTransactionType());
        DefaultAvatarDisplayUtil defaultAvatarDisplayUtil = DefaultAvatarDisplayUtil.INSTANCE;
        TextView textView2 = ((ActivityPochiStatementsDetailsBinding) this.binding).tvAbbr;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        defaultAvatarDisplayUtil.displayDefaultAvatar(textView2, name);
        DefaultAvatarDisplayUtil defaultAvatarDisplayUtil2 = DefaultAvatarDisplayUtil.INSTANCE;
        TextView textView3 = ((ActivityPochiStatementsDetailsBinding) this.binding).tvPaidAbbr;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        defaultAvatarDisplayUtil2.displayDefaultAvatar(textView3, name);
        ((ActivityPochiStatementsDetailsBinding) this.binding).tvAmount.setText(str);
        PochiStatementHelper pochiStatementHelper = PochiStatementHelper.INSTANCE;
        StatementWrapper statementWrapper10 = this.statementWrapperResp;
        if (statementWrapper10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            statementWrapper10 = null;
        }
        String transactionFee = pochiStatementHelper.getTransactionFee(statementWrapper10.getStatement().getId());
        if (!TextUtils.isEmpty(transactionFee)) {
            int i5 = getRequestBeneficiariesState + 27;
            equals = i5 % 128;
            int i6 = i5 % 2;
            TextView textView4 = ((ActivityPochiStatementsDetailsBinding) this.binding).tvTransactionCost;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R.string.transaction_cost_s);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str2 = String.format(string, Arrays.copyOf(new Object[]{transactionFee}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            textView4.setText(str2);
        }
        TextView textView5 = ((ActivityPochiStatementsDetailsBinding) this.binding).tvIdValue;
        StatementWrapper statementWrapper11 = this.statementWrapperResp;
        if (statementWrapper11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            statementWrapper = statementWrapper11;
        }
        textView5.setText(statementWrapper.getStatement().getId());
        initFunctions();
    }

    private final void copyToClipboard(String text) {
        int i = 2 % 2;
        int i2 = equals + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object systemService = getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("label", text));
        ToastUtils.showLong(getString(R.string.copy_clipboard), new Object[0]);
        int i4 = getRequestBeneficiariesState + 87;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initFunctions() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            com.safaricom.consumer.commons.statements.StatementWrapper r1 = r4.statementWrapperResp
            r3 = 35
            int r3 = r3 / r2
            if (r1 != 0) goto L21
            goto L1b
        L17:
            com.safaricom.consumer.commons.statements.StatementWrapper r1 = r4.statementWrapperResp
            if (r1 != 0) goto L21
        L1b:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = 0
        L21:
            com.safaricom.consumer.commons.statements.Statement r1 = r1.getStatement()
            java.lang.String r1 = r1.getMoney_in()
            float r1 = java.lang.Float.parseFloat(r1)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L33
            return
        L33:
            boolean r1 = r4.hasFavorites()
            if (r1 == 0) goto L4d
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState
            int r1 = r1 + 49
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals = r3
            int r1 = r1 % r0
            VM extends androidx.lifecycle.ViewModel r0 = r4.viewModel
            com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel r0 = (com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel) r0
            java.lang.String r1 = "MPESATransaction"
            r3 = 20
            r0.queryFavourites(r1, r2, r3)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.initFunctions():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean hasFavorites() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            com.safaricom.consumer.commons.statements.StatementWrapper r1 = r7.statementWrapperResp
            r2 = 0
            if (r1 != 0) goto L17
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState
            int r1 = r1 + 125
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals = r3
            int r1 = r1 % r0
            r1 = r2
        L17:
            com.safaricom.consumer.commons.statements.Statement r1 = r1.getStatement()
            java.lang.String r1 = r1.getTransactionTypeID()
            int r3 = r1.hashCode()
            r4 = 47653691(0x2d7233b, float:3.1611632E-37)
            r5 = 0
            if (r3 == r4) goto L57
            r4 = 47653713(0x2d72351, float:3.1611681E-37)
            if (r3 == r4) goto L4e
            int r4 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState
            int r4 = r4 + 93
            int r6 = r4 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals = r6
            int r4 = r4 % r0
            r6 = 47653744(0x2d72370, float:3.161175E-37)
            if (r4 != 0) goto L42
            r4 = 37
            int r4 = r4 / r5
            if (r3 == r6) goto L45
            goto L60
        L42:
            if (r3 == r6) goto L45
            goto L60
        L45:
            java.lang.String r3 = "20020"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5f
            goto L60
        L4e:
            java.lang.String r3 = "20010"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5f
            goto L60
        L57:
            java.lang.String r3 = "20009"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
        L5f:
            r5 = 1
        L60:
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.equals
            int r1 = r1 + 53
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L6c
            return r5
        L6c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.hasFavorites():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startReceiptDownload() {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.startReceiptDownload():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = equals + 103;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h((byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 1412666617, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 122, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() + 302955712, (short) (64 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(0) - 31, new char[]{'\'', 11, 13810, 13810, '(', 2, 23, 16, 13812, 13812, CharUtils.CR, ' ', 28, 4, 20, 30, '/', 2}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 105), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = equals + 65;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = equals + 89;
            getRequestBeneficiariesState = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSize(0, 0), 43 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6561, TextUtils.indexOf("", "", 0, 0) + 56, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6617 - MotionEvent.axisFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6562, 56 - Color.green(0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -960739708, false, "component3", new Class[]{Context.class});
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

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r50) {
        /*
            Method dump skipped, instruction units count: 15240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiStatementsDetailsActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m10810$r8$lambda$BiqBVSMhSWYc_DJz1lHXZJzIs0(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$0 = initObserver$lambda$0(pochiStatementsDetailsActivity, resource);
        int i4 = getRequestBeneficiariesState + 103;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return unitInitObserver$lambda$0;
        }
        throw null;
    }

    public static Unit $r8$lambda$CXINird1jjlLMzWanbhIHfeq24I(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, String str) {
        int i = 2 % 2;
        int i2 = equals + 87;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            showAddFavoritesDialog$lambda$6(pochiStatementsDetailsActivity, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitShowAddFavoritesDialog$lambda$6 = showAddFavoritesDialog$lambda$6(pochiStatementsDetailsActivity, str);
        int i3 = equals + 87;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return unitShowAddFavoritesDialog$lambda$6;
    }

    public static void $r8$lambda$DNZs6rjkrdtgoqiOmkrwrBiQCgQ(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10814instrumented$1$initListener$V(pochiStatementsDetailsActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10811$r8$lambda$dqgBs6ZRXVislm31cLmO2ngwQ(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10813instrumented$0$initListener$V(pochiStatementsDetailsActivity, view);
        int i4 = equals + 115;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10812$r8$lambda$oDAmAy3diQ288o9yF8Za9LIVtQ(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = equals + 73;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        updateFunctions$lambda$3(pochiStatementsDetailsActivity, baseQuickAdapter, view, i);
        if (i4 != 0) {
            throw null;
        }
    }

    static {
        hashCode = 1;
        ShareDataUIState();
        int i = copy + 109;
        hashCode = i % 128;
        int i2 = i % 2;
    }

    private static void m10813instrumented$0$initListener$V(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initListener$lambda$7(pochiStatementsDetailsActivity, view);
            } else {
                initListener$lambda$7(pochiStatementsDetailsActivity, view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void m10814instrumented$1$initListener$V(PochiStatementsDetailsActivity pochiStatementsDetailsActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initListener$lambda$8(pochiStatementsDetailsActivity, view);
                Callback.onClick_exit();
                int i4 = 83 / 0;
            } else {
                initListener$lambda$8(pochiStatementsDetailsActivity, view);
                Callback.onClick_exit();
            }
            int i5 = equals + 97;
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
        int i2 = getRequestBeneficiariesState + 105;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 37;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    static void ShareDataUIState() {
        component2 = new char[]{2017, 2020, 1992, 2038, 2037, 2030, 1978, 1969, 1051, 1985, 1973, 2028, 1055, 1970, 1966, 1972, 2036, 1050, 1975, 1977, 1971, 2023, 2032, 2035, 1965, 1968, 1967, 1974, 1976, 1048, 1053, 1054, 2019, 1042, 2025, 1052, 2005, 2021, 2029, 2033, 2024, 2034, 2000, 2022, 2031, 2018, 1049, 1987, 2041};
        component3 = (char) 12829;
        copydefault = 1510415406;
        component1 = -238323851;
        ShareDataUIState = 473576630;
        component4 = new byte[]{-105, -22, -107, -102, -29, -3, -78, -20, -30, -102, -28, -100, -8, -53, -6, 87, -23, -26, -38, -93, -110, -109, -108, -25, -97, -28, -3, -103, 86, -84, -88, -82, 87, -87, 126, -87, -123, -96, -86, -86, 120, 87, -88, -85, -82, -88, -103, 121, -103, -81, 120, -104, -84, 125, -121, -85, -81, 120, -121, 122, -99, 85, -85, -84, 124, -100, 100, -83, -121, -86, 123, -98, 83, 115, -51, 63, 57, TarHeader.LF_NORMAL, 39, 59, TarHeader.LF_NORMAL, 57, 56, -52, 104, Base64.padSymbol, -63, Base64.padSymbol, 107, -56, 111, 38, 58, -53, 97, 34, Base64.padSymbol, -63, 58, 108, -55, 59, 63, 59, Ascii.ETB, TarHeader.LF_SYMLINK, -56, Ascii.SYN, 56, 60, 63, -53, Base64.padSymbol, Ascii.ETB, TarHeader.LF_LINK, 63, -12, 96, -56, 20, TarHeader.LF_SYMLINK, 57, -54, 58, 105, 57, TarHeader.LF_LINK, 63, -9, 110, -53, 58, 107, 62, 59, 56, -53, 108, -99, -92, 95, -81, 86, -126, -125, 101, 87, -69, 83, -22, 123, 89, -77, 85, -109, -21, -121, -108, -54, -71, -21, -126, -110, -99, -55, -10, 92, -105, -46, -83, -100, -99, -98, -31, -103, -18, -102, -34, 42, -35, 46, 35, -46, 59, -60, -41, -40, 43, 39, -35, 47, -51, -92, -106, -89, -81, -94, 75, -89, -98, 75, -91, -106, 119, -96, -109, 73, -106, 73, -108, 114, -93, -21, -94, 114, -109, -71, -91, -94, -72, -95, 75, -111, -67, 112, -23, 119, -94, -109, -89, -72, -94, 116, -89, -90, -111, 116, -105, -91, 118, -23, -94, -94, 73, -93, -105, 119, -112, 74, -91, -91, -23, 112, -111, 73, -51, Ascii.SUB, 74, -92, 75, 77, 4, 72, -65, 6, 74, -94, 73, Ascii.GS, 76, -94, Ascii.FS, -71, 73, 75, 72, 6, -65, 118, 77, 112, 76, 119, 118, 75, 79, 114, 65, 72, 7, PSSSigner.TRAILER_IMPLICIT, 75, 6, -69, 112, Ascii.DLE, -89, 76, 114, 75, 119, 79, 118, Ascii.ESC, 72, 73, -71, 73, 73, 65, 6, 118, -71, Ascii.US, -90, Ascii.SUB, 116, -90, 118, -122, 73, 72, 112, 74, 115, 117, 75, 73, 116, 118, -122, 97, 122, 109, 102, 99, 98, 103, 123, 111, 123, -122, 93, 94, -88, 92, 82, 94, 86, 92, -88, 81};
    }
}
