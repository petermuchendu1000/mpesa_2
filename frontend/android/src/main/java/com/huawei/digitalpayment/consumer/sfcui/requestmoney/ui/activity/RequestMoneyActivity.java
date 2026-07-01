package com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.base.ui.dialog.SfcCommonBottomDialog;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.scan.model.CustomerType;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityRequestMoneyBinding;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.RequestMoneyConfigHelper;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.adapter.RequestMoneyMoreAdapter;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyViewModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.DoMoreBean;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel;
import com.huawei.digitalpayment.consumer.sfcui.widget.PesaGridItemDecoration;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0016H\u0014J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\nH\u0002J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020\u001dH\u0002J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u0013H\u0002J\b\u00105\u001a\u00020\u001dH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066²\u0006\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/activity/RequestMoneyActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityRequestMoneyBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyViewModel;", "<init>", "()V", "manageFavoriteViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "filteredFavorites", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "moreFunctions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/DoMoreBean;", FixedDataNavKeys.EXTRA_CONTACT_RESP, "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SfcContact;", "verifyNumberResp", "Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;", "isVerifyNumber", "", "isUnRegister", "lastKeyBoradHeight", "", "removePosition", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "favoritesLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "initView", "showFavoriteSection", "onAddFavoriteClick", "onFavoriteClick", "item", "onFavoriteLongClick", "position", "onFavoritesViewAll", "showTipsDialog", GriverCacheDao.COLUMN_CACHE_ID, "", "initInput", "initDoMore", "initListener", "initData", "initObserver", "checkUser", "checkConfirmAble", "doConfirm", "isAddFavorite", "onDestroy", "ConsumerSfcUI_release", "allFavorites"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RequestMoneyActivity extends Hilt_RequestMoneyActivity<ActivityRequestMoneyBinding, RequestMoneyViewModel> {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static boolean component1;
    private static boolean component2;
    private static int component3;
    private static char component4;
    private static char[] copydefault;
    private static int getAsAtTimestamp;
    private SfcContact contactResp;
    private boolean isUnRegister;
    private boolean isVerifyNumber;
    private int lastKeyBoradHeight;
    private ManageFavouriteViewModel manageFavoriteViewModel;
    private int removePosition;
    private VerifyNumberResp verifyNumberResp;
    private static final byte[] $$l = {102, Ascii.GS, -34, 39};
    private static final int $$o = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {93, TarHeader.LF_LINK, 76, -114, -19, -5, 56, -58, -18, -4, 0, -6, -8, -6, 44, -58, -24, 2, -20, 10, -20, Base64.padSymbol, -58, -22, -7, 59, -26, -54, -7, Ascii.ESC, -40, 4, -8, 58, -21, 7, -20, -19, -5, -10, -6, -6, 2, -16, -13, 58, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -61, -8, -4, -26, 7, TarHeader.LF_SYMLINK, -66, -12, -13, 8, -20, -3, 6, -18, TarHeader.LF_CONTIG, -29, -40, -4, -26, 7, Ascii.GS, -51, -10, -4, -13, -6, 4, -12, 2, Ascii.NAK, -44, 1, -16, Ascii.US, -43, -10, -3, 65, -54, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, -10, -6, -6, 2, -16, -13, 59};
    private static final int $$t = 171;
    private static final byte[] $$d = {69, -50, 81, 75, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 208;
    private static int getRequestBeneficiariesState = 1;
    private static int equals = 0;
    private static int copy = 1;
    private List<FavoriteFriendsBean> filteredFavorites = CollectionsKt.emptyList();
    private List<DoMoreBean> moreFunctions = new ArrayList();
    private ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            RequestMoneyActivity.$r8$lambda$H3YhN7XeZlZsI4pKzmmKTKCa3bo(this.f$0, (ActivityResult) obj);
            int i4 = component2 + 11;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    });
    private final ActivityResultLauncher<Intent> favoritesLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            RequestMoneyActivity.$r8$lambda$ToNsIrdBV0Hm6Q5BCGFN86W61pI(this.f$0, (ActivityResult) obj);
            int i4 = ShareDataUIState + 29;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component1 = 1;
        private static int copydefault;
        private final Function1 ShareDataUIState;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == r2) goto L28
                int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.component2.component1
                int r1 = r1 + 41
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.component2.copydefault = r2
                int r1 = r1 % r0
                boolean r1 = r4 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L28
                r1 = r3
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r4 = (kotlin.jvm.internal.FunctionAdapter) r4
                kotlin.Function r4 = r4.getFunctionDelegate()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                goto L29
            L28:
                r4 = 0
            L29:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.component2.copydefault
                int r1 = r1 + 41
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.component2.component1 = r2
                int r1 = r1 % r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i3 + 45;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
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
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = component1 + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 + 68
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.$$r(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 100 - r8
            int r9 = 28 - r9
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.h(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 10
            int r8 = r8 * 3
            int r8 = 118 - r8
            int r6 = r6 * 8
            int r6 = r6 + 99
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.$$s
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            int r6 = r6 + (-7)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.i(int, int, int, java.lang.Object[]):void");
    }

    public static final void access$checkConfirmAble(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals + 25;
        copy = i2 % 128;
        int i3 = i2 % 2;
        requestMoneyActivity.checkConfirmAble();
        int i4 = equals + 13;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    public static final void access$checkUser(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = copy + 89;
        equals = i2 % 128;
        int i3 = i2 % 2;
        requestMoneyActivity.checkUser();
        int i4 = copy + 31;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final ViewDataBinding access$getBinding$p(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = requestMoneyActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final List access$getFilteredFavorites$p(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<FavoriteFriendsBean> list = requestMoneyActivity.filteredFavorites;
        int i5 = i3 + 121;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static final int access$getLastKeyBoradHeight$p(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals + 37;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = requestMoneyActivity.lastKeyBoradHeight;
        if (i4 == 0) {
            throw null;
        }
        int i6 = i3 + 105;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final ManageFavouriteViewModel access$getManageFavoriteViewModel$p(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        ManageFavouriteViewModel manageFavouriteViewModel = requestMoneyActivity.manageFavoriteViewModel;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 123;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return manageFavouriteViewModel;
        }
        throw null;
    }

    public static final void access$onAddFavoriteClick(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        requestMoneyActivity.onAddFavoriteClick();
        if (i3 == 0) {
            throw null;
        }
        int i4 = copy + 105;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$onFavoriteClick(RequestMoneyActivity requestMoneyActivity, FavoriteFriendsBean favoriteFriendsBean) {
        int i = 2 % 2;
        int i2 = copy + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        requestMoneyActivity.onFavoriteClick(favoriteFriendsBean);
        int i4 = copy + 77;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$onFavoriteLongClick(RequestMoneyActivity requestMoneyActivity, int i, FavoriteFriendsBean favoriteFriendsBean) {
        int i2 = 2 % 2;
        int i3 = equals + 61;
        copy = i3 % 128;
        int i4 = i3 % 2;
        requestMoneyActivity.onFavoriteLongClick(i, favoriteFriendsBean);
        int i5 = equals + 47;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$onFavoritesViewAll(RequestMoneyActivity requestMoneyActivity) {
        int i = 2 % 2;
        int i2 = equals + 25;
        copy = i2 % 128;
        int i3 = i2 % 2;
        requestMoneyActivity.onFavoritesViewAll();
        int i4 = copy + 87;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$setFilteredFavorites$p(RequestMoneyActivity requestMoneyActivity, List list) {
        int i = 2 % 2;
        int i2 = equals + 15;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        requestMoneyActivity.filteredFavorites = list;
        int i5 = i3 + 99;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$setLastKeyBoradHeight$p(RequestMoneyActivity requestMoneyActivity, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 81;
        equals = i3 % 128;
        int i4 = i3 % 2;
        requestMoneyActivity.lastKeyBoradHeight = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setUnRegister$p(RequestMoneyActivity requestMoneyActivity, boolean z) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 37;
        equals = i3 % 128;
        int i4 = i3 % 2;
        requestMoneyActivity.isUnRegister = z;
        int i5 = i2 + 11;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setVerifyNumberResp$p(RequestMoneyActivity requestMoneyActivity, VerifyNumberResp verifyNumberResp) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 61;
        equals = i3 % 128;
        int i4 = i3 % 2;
        requestMoneyActivity.verifyNumberResp = verifyNumberResp;
        int i5 = i2 + 119;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void launcher$lambda$1(RequestMoneyActivity requestMoneyActivity, ActivityResult activityResult) {
        Intent data;
        int i = 2 % 2;
        int i2 = copy + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        int i4 = copy + 1;
        equals = i4 % 128;
        int i5 = i4 % 2;
        SfcContact sfcContact = (SfcContact) data.getSerializableExtra(FixedDataNavKeys.EXTRA_CONTACT_RESP);
        requestMoneyActivity.contactResp = sfcContact;
        Object obj = null;
        if (sfcContact != null) {
            int i6 = copy + 77;
            int i7 = i6 % 128;
            equals = i7;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (sfcContact != null) {
                int i8 = i7 + 121;
                copy = i8 % 128;
                int i9 = i8 % 2;
                String realPhoneNumber = sfcContact.getRealPhoneNumber();
                if (realPhoneNumber != null) {
                    ((ActivityRequestMoneyBinding) requestMoneyActivity.binding).inputNumber.getEditText().setText(SfcPhoneNumberUtil.INSTANCE.formatterPhoneNumber(realPhoneNumber));
                    ((ActivityRequestMoneyBinding) requestMoneyActivity.binding).inputNumber.getEditText().setSelection(((ActivityRequestMoneyBinding) requestMoneyActivity.binding).inputNumber.getEditText().getText().length());
                }
            }
        }
        requestMoneyActivity.verifyNumberResp = null;
        requestMoneyActivity.checkUser();
        if (((FavoriteFriendsBean) data.getSerializableExtra("favoriteFriendsBean")) != null) {
            int i10 = equals + 63;
            copy = i10 % 128;
            int i11 = i10 % 2;
            ManageFavouriteViewModel manageFavouriteViewModel = requestMoneyActivity.manageFavoriteViewModel;
            if (manageFavouriteViewModel != null) {
                manageFavouriteViewModel.queryFavourites(TradeTypeConstant.MPESA_TRANSACTION, 0, 100);
            }
            CommonToast.builder().setText(requestMoneyActivity.getString(R.string.favorite_added_successfully)).setIcon(R.drawable.ic_base_toast_success).setIconSize(SizeUtils.dp2px(12.0f), SizeUtils.dp2px(12.0f)).setSingleDisplay(true).setGravity(17, 0, 0).show();
        }
    }

    private static final void favoritesLauncher$lambda$2(RequestMoneyActivity requestMoneyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copy + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            Intent data = activityResult.getData();
            Intrinsics.checkNotNull(data);
            Serializable serializableExtra = data.getSerializableExtra(ViewAllFavoritesActivity.SELECTED_FAVORITE);
            FavoriteFriendsBean favoriteFriendsBean = serializableExtra instanceof FavoriteFriendsBean ? (FavoriteFriendsBean) serializableExtra : null;
            if (favoriteFriendsBean == null) {
                return;
            } else {
                requestMoneyActivity.onFavoriteClick(favoriteFriendsBean);
            }
        }
        int i4 = equals + 123;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component1;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 47;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.runtime.Composer r17, int r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = 2
                int r2 = r1 % r1
                r2 = r18 & 11
                r3 = 1
                if (r2 != r1) goto L1d
                int r2 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.component1
                int r2 = r2 + r3
                int r4 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.ShareDataUIState = r4
                int r2 = r2 % r1
                boolean r2 = r17.getSkipping()
                if (r2 != 0) goto L19
                goto L1d
            L19:
                r17.skipToGroupEnd()
                goto L80
            L1d:
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity r2 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.this
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel r2 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.access$getManageFavoriteViewModel$p(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                kotlinx.coroutines.flow.StateFlow r4 = r2.getFavoriteItems()
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = 8
                r10 = 7
                r8 = r17
                androidx.compose.runtime.State r2 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r4, r5, r6, r7, r8, r9, r10)
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity r4 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.this
                java.util.List r2 = component3(r2)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r2 = r2.iterator()
            L49:
                boolean r6 = r2.hasNext()
                r6 = r6 ^ r3
                if (r6 == 0) goto L8a
                java.util.List r5 = (java.util.List) r5
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.access$setFilteredFavorites$p(r4, r5)
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity$copydefault$5 r2 = new com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity$copydefault$5
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity r4 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.this
                r2.<init>()
                r4 = 54
                r5 = 1848199198(0x6e29481e, float:1.3097538E28)
                r13 = r17
                androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r5, r3, r2, r13, r4)
                r12 = r2
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                r14 = 1572864(0x180000, float:2.204052E-39)
                r15 = 63
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                int r2 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.ShareDataUIState
                int r2 = r2 + 45
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.component1 = r3
                int r2 = r2 % r1
            L80:
                int r2 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.ShareDataUIState
                int r2 = r2 + 111
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.component1 = r3
                int r2 = r2 % r1
                return
            L8a:
                r13 = r17
                java.lang.Object r6 = r2.next()
                r7 = r6
                com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean r7 = (com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean) r7
                java.lang.String r7 = r7.getCategory()
                java.lang.String r8 = "P2PTransfer"
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
                if (r7 == 0) goto L49
                r5.add(r6)
                goto L49
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.copydefault.component3(androidx.compose.runtime.Composer, int):void");
        }

        private static final List<FavoriteFriendsBean> component3(State<? extends List<FavoriteFriendsBean>> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            List<FavoriteFriendsBean> value = state.getValue();
            int i4 = component1 + 11;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        copydefault() {
        }
    }

    private static void f(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        char c2 = '0';
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 67;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, i4) + 3761, AndroidCharacter.getMirror(c2) - 24, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1670574543, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i5 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3760 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 24, (char) View.MeasureSpec.makeMeasureSpec(0, 0), -1670574543, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                c2 = '0';
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component3)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7141, 13 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        if (component1) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i7 = $11 + 33;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2748, TextUtils.indexOf("", "", 0) + 19, (char) (7644 - (KeyEvent.getMaxKeyCode() >> 16)), -327556343, false, $$r(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component2) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i9 = $11 + 103;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr6 = {cancelVar, cancelVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault5 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 5);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 2748, TextUtils.indexOf((CharSequence) "", '0', 0) + 20, (char) (7644 - TextUtils.getOffsetAfter("", 0)), -327556343, false, $$r(b8, b9, (byte) (b9 - 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        String str = new String(cArr6);
        int i11 = $10 + 85;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i12 = 95 / 0;
            objArr[0] = str;
        }
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = ShareDataUIState;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7423 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (View.getDefaultSize(0, 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(component4)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7421 - ImageFormat.getBitsPerPixel(0), 15 - KeyEvent.keyCodeFromString(""), (char) ((Process.myTid() >> 22) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 85;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 3;
                cArr4[i2] = (char) (cArr[i2] << b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i9 = $11 + 83;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i11 = $10 + 3;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 << b2);
                        cArr4[cancelall.component2] = (char) (cancelall.component3 - b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7116 - ((byte) KeyEvent.getModifierMetaStateMask()), 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27637), 794909189, false, $$r(b3, (byte) (b3 | TarHeader.LF_CHR), b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr3[i12];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr3[i13];
                                cArr4[cancelall.component2 + 1] = cArr3[i14];
                            } else {
                                int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr3[i15];
                                cArr4[cancelall.component2 + 1] = cArr3[i16];
                            }
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
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            int i18 = $11 + 19;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = copy + 55;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_request_money;
            int i4 = 66 / 0;
        } else {
            i = R.layout.activity_request_money;
        }
        int i5 = equals + 35;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return i;
    }

    private final void initView() {
        int i = 2 % 2;
        this.manageFavoriteViewModel = (ManageFavouriteViewModel) new ViewModelProvider(this).get(ManageFavouriteViewModel.class);
        initInput();
        initDoMore();
        showFavoriteSection();
        int i2 = equals + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void showFavoriteSection() {
        ComposeView composeView;
        int i = 2 % 2;
        int i2 = equals + 59;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityRequestMoneyBinding activityRequestMoneyBinding = (ActivityRequestMoneyBinding) this.binding;
        if (activityRequestMoneyBinding == null || (composeView = activityRequestMoneyBinding.composeViewFavorites) == null) {
            return;
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-996533983, true, new copydefault()));
        int i3 = copy + 19;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onAddFavoriteClick() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(1);
        bundle.putString("businessType", "P2PTransfer");
        bundle.putSerializable("favorites", new ArrayList(this.filteredFavorites));
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_ADD_FAVOURITE_FRIEND, bundle, this.launcher);
        int i2 = copy + 37;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
    }

    private final void onFavoriteClick(FavoriteFriendsBean item) {
        int i = 2 % 2;
        int i2 = equals + 91;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            ((ActivityRequestMoneyBinding) this.binding).inputNumber.getEditText().setText(SfcPhoneNumberUtil.INSTANCE.formatterPhoneNumber(item.getPhoneNumber()));
            this.verifyNumberResp = null;
            checkUser();
            int i3 = 45 / 0;
        } else {
            ((ActivityRequestMoneyBinding) this.binding).inputNumber.getEditText().setText(SfcPhoneNumberUtil.INSTANCE.formatterPhoneNumber(item.getPhoneNumber()));
            this.verifyNumberResp = null;
            checkUser();
        }
        int i4 = equals + 25;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    private final void onFavoriteLongClick(int position, FavoriteFriendsBean item) {
        int i = 2 % 2;
        int i2 = equals + 15;
        copy = i2 % 128;
        int i3 = i2 % 2;
        showTipsDialog(position, item.getId());
        int i4 = equals + 75;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onFavoritesViewAll() {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("favoriteCategoryKey", "P2PTransfer");
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_VIEW_ALL_FAVORITES, bundle, this.favoritesLauncher);
        int i2 = equals + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void showTipsDialog$lambda$4(RequestMoneyActivity requestMoneyActivity, String str, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        ManageFavouriteViewModel manageFavouriteViewModel = requestMoneyActivity.manageFavoriteViewModel;
        Object obj = null;
        if (manageFavouriteViewModel != null) {
            int i2 = copy + 99;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                manageFavouriteViewModel.removeFavorite(TradeTypeConstant.MPESA_TRANSACTION, "P2PTransfer", CollectionsKt.listOf(str));
                throw null;
            }
            manageFavouriteViewModel.removeFavorite(TradeTypeConstant.MPESA_TRANSACTION, "P2PTransfer", CollectionsKt.listOf(str));
        }
        int i3 = equals + 9;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void showTipsDialog(int position, final String id) {
        int i = 2 % 2;
        this.removePosition = position;
        SfcCommonBottomDialog.Builder builder = new SfcCommonBottomDialog.Builder();
        String string = getString(R.string.remove_favourite);
        Intrinsics.checkNotNullExpressionValue(string, "");
        SfcCommonBottomDialog.Builder builderTitle = builder.setBuilderTitle(string);
        String string2 = getString(R.string.remove_favourite_tips);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        SfcCommonBottomDialog.Builder builderContent = builderTitle.setBuilderContent(string2);
        String string3 = getString(R.string.sfc_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        SfcCommonBottomDialog.Builder builderLeftButtonText = builderContent.setBuilderLeftButtonText(string3);
        String string4 = getString(R.string.remove);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        builderLeftButtonText.setBuilderRightButtonText(string4).setBuilderRightClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    RequestMoneyActivity.m11844$r8$lambda$vHB6dSpLxrG4ujF28HMm8NnTdE(this.f$0, id, view);
                    obj.hashCode();
                    throw null;
                }
                RequestMoneyActivity.m11844$r8$lambda$vHB6dSpLxrG4ujF28HMm8NnTdE(this.f$0, id, view);
                int i4 = component3 + 59;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }).build().show(getSupportFragmentManager(), "removeFavourite");
        int i2 = copy + 51;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void initInput() {
        int i = 2 % 2;
        ((ActivityRequestMoneyBinding) this.binding).inputNumber.getEditText().setInputType(2);
        ((ActivityRequestMoneyBinding) this.binding).inputNumber.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                RequestMoneyActivity.access$setUnRegister$p(RequestMoneyActivity.this, false);
                ((ActivityRequestMoneyBinding) RequestMoneyActivity.access$getBinding$p(RequestMoneyActivity.this)).inputNumber.showError(null);
                ((ActivityRequestMoneyBinding) RequestMoneyActivity.access$getBinding$p(RequestMoneyActivity.this)).tvUserName.setVisibility(8);
                RequestMoneyActivity.access$setVerifyNumberResp$p(RequestMoneyActivity.this, null);
                RequestMoneyActivity.access$checkConfirmAble(RequestMoneyActivity.this);
                int i5 = component1 + 125;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityRequestMoneyBinding) this.binding).inputNumber.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onFocusChange(View view, boolean hasFoucs) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    ((ActivityRequestMoneyBinding) RequestMoneyActivity.access$getBinding$p(RequestMoneyActivity.this)).inputNumber.getInputParentWrapper().onFocusChange(view, hasFoucs);
                    if (hasFoucs) {
                        return;
                    }
                    RequestMoneyActivity.access$checkUser(RequestMoneyActivity.this);
                    int i4 = component2 + 55;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 5 / 4;
                        return;
                    }
                    return;
                }
                ((ActivityRequestMoneyBinding) RequestMoneyActivity.access$getBinding$p(RequestMoneyActivity.this)).inputNumber.getInputParentWrapper().onFocusChange(view, hasFoucs);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivityRequestMoneyBinding) this.binding).inputAmount.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                RequestMoneyActivity.access$checkConfirmAble(RequestMoneyActivity.this);
                if (i4 != 0) {
                    int i5 = 7 / 0;
                }
            }
        });
        ((ActivityRequestMoneyBinding) this.binding).inputAmount.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onFocusChange(View view, boolean hasFoucs) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ViewDataBinding viewDataBindingAccess$getBinding$p = RequestMoneyActivity.access$getBinding$p(RequestMoneyActivity.this);
                if (i4 == 0) {
                    ((ActivityRequestMoneyBinding) viewDataBindingAccess$getBinding$p).inputAmount.getInputParentWrapper().onFocusChange(view, hasFoucs);
                } else {
                    ((ActivityRequestMoneyBinding) viewDataBindingAccess$getBinding$p).inputAmount.getInputParentWrapper().onFocusChange(view, hasFoucs);
                    throw null;
                }
            }
        });
        KeyboardUtils.registerSoftInputChangedListener(this, new KeyboardUtils.OnSoftInputChangedListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSoftInputChanged(int height) {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (RequestMoneyActivity.access$getLastKeyBoradHeight$p(RequestMoneyActivity.this) > 0 && height == 0) {
                    int i5 = copydefault + 121;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    if (((ActivityRequestMoneyBinding) RequestMoneyActivity.access$getBinding$p(RequestMoneyActivity.this)).inputNumber.getEditText().hasFocus()) {
                        int i7 = copydefault + 11;
                        component3 = i7 % 128;
                        if (i7 % 2 != 0) {
                            RequestMoneyActivity.access$checkUser(RequestMoneyActivity.this);
                            int i8 = 11 / 0;
                        } else {
                            RequestMoneyActivity.access$checkUser(RequestMoneyActivity.this);
                        }
                    }
                }
                RequestMoneyActivity.access$setLastKeyBoradHeight$p(RequestMoneyActivity.this, height);
                int i9 = copydefault + 1;
                component3 = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        int i2 = copy + 93;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void initDoMore() {
        int i = 2 % 2;
        List<DoMoreBean> list = this.moreFunctions;
        int i2 = R.drawable.ic_request_money;
        String string = getString(R.string.request_money_my_request);
        Intrinsics.checkNotNullExpressionValue(string, "");
        list.add(new DoMoreBean(i2, string));
        ((ActivityRequestMoneyBinding) this.binding).rvDoMore.setLayoutManager(new GridLayoutManager(this, 2));
        RequestMoneyMoreAdapter requestMoneyMoreAdapter = new RequestMoneyMoreAdapter(R.layout.item_request_money_do_more);
        ((ActivityRequestMoneyBinding) this.binding).rvDoMore.addItemDecoration(new PesaGridItemDecoration(SizeUtils.dp2px(10.0f), SizeUtils.dp2px(10.0f), SizeUtils.dp2px(10.0f)));
        ((ActivityRequestMoneyBinding) this.binding).rvDoMore.setAdapter(requestMoneyMoreAdapter);
        requestMoneyMoreAdapter.setNewInstance(this.moreFunctions);
        requestMoneyMoreAdapter.setOnItemClickListener(new OnItemClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i3) {
                int i4 = 2 % 2;
                int i5 = copydefault + 93;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                RequestMoneyActivity.$r8$lambda$EsGyLW2YzYiWBjS3ogGlGGknlSM(baseQuickAdapter, view, i3);
                int i7 = ShareDataUIState + 97;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = copy + 77;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void initDoMore$lambda$5(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 27;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(baseQuickAdapter, "");
            Intrinsics.checkNotNullParameter(view, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (i == 0) {
            int i4 = copy + 107;
            equals = i4 % 128;
            int i5 = i4 % 2;
            RouteUtils.routeWithExecute(RoutePathConstant.MY_REQUESTS);
        }
    }

    private static final void initListener$lambda$6(RequestMoneyActivity requestMoneyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 73;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        RouteUtils.routeWithExecute(requestMoneyActivity, RoutePathConstant.SELECT_CONTACT, null, requestMoneyActivity.launcher);
        int i4 = equals + 121;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void initListener() {
        int i = 2 % 2;
        ImageView endIcon = ((ActivityRequestMoneyBinding) this.binding).inputNumber.getEndIcon();
        Intrinsics.checkNotNull(endIcon);
        endIcon.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 47;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    RequestMoneyActivity.$r8$lambda$0xNFQoTM76z8Jzqsr4sqKVkpTW8(this.f$0, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                RequestMoneyActivity.$r8$lambda$0xNFQoTM76z8Jzqsr4sqKVkpTW8(this.f$0, view);
                int i4 = component3 + 109;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 17;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                RequestMoneyActivity.m11843$r8$lambda$rPk932N6gpNorJmyEGCXqK_6II(this.f$0, view);
                int i5 = copydefault + 75;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = equals + 39;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void initListener$lambda$7(RequestMoneyActivity requestMoneyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        requestMoneyActivity.doConfirm();
        int i4 = equals + 95;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initData() {
        int i = 2 % 2;
        int i2 = equals + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel manageFavouriteViewModel = this.manageFavoriteViewModel;
        if (manageFavouriteViewModel != null) {
            manageFavouriteViewModel.queryFavourites(TradeTypeConstant.MPESA_TRANSACTION, 0, 100);
            int i4 = copy + 87;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = copy + 33;
        equals = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final Unit initObserver$lambda$8(RequestMoneyActivity requestMoneyActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        Utils.showOrHideLoading(requestMoneyActivity, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
            requestMoneyActivity.isVerifyNumber = false;
            int i2 = copy + 73;
            equals = i2 % 128;
            int i3 = i2 % 2;
        }
        if (resource.success()) {
            int i4 = copy + 13;
            equals = i4 % 128;
            int i5 = i4 % 2;
            VerifyNumberResp verifyNumberResp = (VerifyNumberResp) resource.getData();
            requestMoneyActivity.isVerifyNumber = false;
            requestMoneyActivity.verifyNumberResp = verifyNumberResp;
            ((ActivityRequestMoneyBinding) requestMoneyActivity.binding).tvUserName.setVisibility(0);
            ((ActivityRequestMoneyBinding) requestMoneyActivity.binding).tvUserName.setText(verifyNumberResp != null ? verifyNumberResp.getPublicName() : null);
            int i6 = equals + 87;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void initObserver() {
        int i = 2 % 2;
        RequestMoneyActivity requestMoneyActivity = this;
        ((RequestMoneyViewModel) this.viewModel).verifyData().observe(requestMoneyActivity, new component2(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 83;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    RequestMoneyActivity.$r8$lambda$RbXiaPrVLFUnLQG_bRL4kL3jJnQ(this.f$0, (Resource) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit$r8$lambda$RbXiaPrVLFUnLQG_bRL4kL3jJnQ = RequestMoneyActivity.$r8$lambda$RbXiaPrVLFUnLQG_bRL4kL3jJnQ(this.f$0, (Resource) obj);
                int i4 = component2 + 25;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit$r8$lambda$RbXiaPrVLFUnLQG_bRL4kL3jJnQ;
            }
        }));
        ManageFavouriteViewModel manageFavouriteViewModel = this.manageFavoriteViewModel;
        if (manageFavouriteViewModel != null) {
            int i2 = equals + 61;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                manageFavouriteViewModel.getRemoveData();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MutableLiveData<Resource<BaseResp>> removeData = manageFavouriteViewModel.getRemoveData();
            if (removeData != null) {
                removeData.observe(requestMoneyActivity, new Observer() {
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void onChanged(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = copydefault + 27;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        RequestMoneyActivity.m11842$r8$lambda$GeUAitHlKq5A3shKOZSJ_vSg54(this.f$0, (Resource) obj2);
                        int i6 = ShareDataUIState + 1;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                    }
                });
                int i3 = equals + 43;
                copy = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    private static final void initObserver$lambda$9(RequestMoneyActivity requestMoneyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 49;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
            Intrinsics.checkNotNullParameter(resource, "");
            Utils.showOrHideLoading(requestMoneyActivity, resource);
            resource.error();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(requestMoneyActivity, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Utils.showOrHideLoading(requestMoneyActivity, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
            int i3 = copy + 105;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!resource.success()) {
            return;
        }
        int i5 = copy + 43;
        equals = i5 % 128;
        int i6 = i5 % 2;
        CommonToast.builder().setText(requestMoneyActivity.getString(R.string.favorite_removed_successfully)).setIcon(R.drawable.ic_base_toast_success).setIconSize(SizeUtils.dp2px(12.0f), SizeUtils.dp2px(12.0f)).setSingleDisplay(true).setGravity(17, 0, 0).show();
    }

    private final void checkUser() {
        int i = 2 % 2;
        if ((!this.isVerifyNumber) && this.verifyNumberResp == null && (!TextUtils.isEmpty(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()))) {
            int i2 = copy + 105;
            equals = i2 % 128;
            int i3 = i2 % 2;
            if (SfcPhoneNumberUtil.INSTANCE.isValidPhoneNumber(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText())) {
                if (!Intrinsics.areEqual(SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()), SPUtils.getInstance().getString("recent_login_phone_number"))) {
                    this.isVerifyNumber = true;
                    ((RequestMoneyViewModel) this.viewModel).verifyP2PTransfer(SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()));
                    return;
                }
                int i4 = equals + 75;
                copy = i4 % 128;
                int i5 = i4 % 2;
                ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
                ((ActivityRequestMoneyBinding) this.binding).inputNumber.showError(getString(R.string.can_not_transfer_your_self));
                int i6 = equals + 91;
                copy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private final void checkConfirmAble() {
        int i = 2 % 2;
        if (this.isUnRegister) {
            int i2 = copy + 43;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
            return;
        }
        if (TextUtils.isEmpty(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()) || TextUtils.isEmpty(((ActivityRequestMoneyBinding) this.binding).inputAmount.getText())) {
            ((ActivityRequestMoneyBinding) this.binding).inputAmount.showError(null);
            ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
            return;
        }
        if (!SfcPhoneNumberUtil.INSTANCE.isValidPhoneNumber(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText())) {
            ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
            int i4 = equals + 55;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (!(!Intrinsics.areEqual(SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()), SPUtils.getInstance().getString("recent_login_phone_number")))) {
            int i5 = copy + 31;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
                ((ActivityRequestMoneyBinding) this.binding).inputNumber.showError(getString(R.string.can_not_transfer_your_self));
                return;
            } else {
                ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
                ((ActivityRequestMoneyBinding) this.binding).inputNumber.showError(getString(R.string.can_not_transfer_your_self));
                return;
            }
        }
        ((ActivityRequestMoneyBinding) this.binding).inputNumber.showError(null);
        if (RequestMoneyConfigHelper.INSTANCE.getValidateEnable()) {
            int i6 = equals + 65;
            copy = i6 % 128;
            int i7 = i6 % 2;
            if (RequestMoneyConfigHelper.INSTANCE.isAmountLess(((ActivityRequestMoneyBinding) this.binding).inputAmount.getText())) {
                int i8 = equals + 101;
                copy = i8 % 128;
                int i9 = i8 % 2;
                String string = getString(R.string.request_money_minimum_amount_other);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ((ActivityRequestMoneyBinding) this.binding).inputAmount.showError(Util.format(string, Integer.valueOf(RequestMoneyConfigHelper.INSTANCE.getMinAmount())));
                ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
                return;
            }
        }
        ((ActivityRequestMoneyBinding) this.binding).inputAmount.showError(null);
        ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(true);
    }

    private final void doConfirm() {
        int i = 2 % 2;
        int i2 = copy + 117;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        if (this.verifyNumberResp != null) {
            String name = CustomerType.REGISTERED.getName();
            VerifyNumberResp verifyNumberResp = this.verifyNumberResp;
            Intrinsics.checkNotNull(verifyNumberResp);
            if (!Intrinsics.areEqual(name, verifyNumberResp.getCustomerType())) {
                this.isUnRegister = true;
                ((ActivityRequestMoneyBinding) this.binding).inputNumber.showError(getString(R.string.sfc_un_register_phone));
                ((ActivityRequestMoneyBinding) this.binding).btnConfirm.setEnabled(false);
                return;
            } else {
                Bundle bundle = new Bundle(4);
                bundle.putString("phoneNumber", SfcPhoneNumberUtil.INSTANCE.formatterPhoneNumberNoCountryCode(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()));
                bundle.putSerializable("verifyNumberResp", this.verifyNumberResp);
                bundle.putString("amount", ((ActivityRequestMoneyBinding) this.binding).inputAmount.getText());
                bundle.putBoolean("isAddFavorite", isAddFavorite());
                RouteUtils.routeWithExecute(RoutePathConstant.REQUEST_MONEY_CONFIRM, bundle);
                return;
            }
        }
        int i5 = i3 + 115;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final boolean isAddFavorite() {
        int i = 2 % 2;
        int i2 = copy + 41;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            this.filteredFavorites.isEmpty();
            throw null;
        }
        if (!(!this.filteredFavorites.isEmpty())) {
            int i3 = copy + 125;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        Iterator<FavoriteFriendsBean> it = this.filteredFavorites.iterator();
        while (it.hasNext()) {
            int i4 = equals + 35;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(it.next().getPhoneNumber()), SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(((ActivityRequestMoneyBinding) this.binding).inputNumber.getText()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = equals + 71;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
            int i3 = 87 / 0;
        } else {
            super.onDestroy();
            KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 41;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(26 - View.MeasureSpec.getSize(0), new char[]{'\b', AbstractJsonLexerKt.COMMA, ' ', '\b', 28, 25, 31, 15, '\n', '%', '-', 24, '\"', 0, '*', 28, 28, JSONLexer.EOI, '\'', 0, 24, 25, 7, 4, '\b', 30}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 105), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((KeyEvent.getMaxKeyCode() >> 16) + 127, new byte[]{-126, -123, -122, -115, -127, -118, -122, -112, -113, -113, -114, -115, -126, -117, -124, -124, -116, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = equals + 27;
            copy = i3 % 128;
            int i4 = i3 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = copy + 55;
                equals = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0, 0), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0, 0), KeyEvent.normalizeMetaState(0) + 56, (char) TextUtils.indexOf("", "", 0), -960739708, false, "component3", new Class[]{Context.class});
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
    public void attachBaseContext(android.content.Context r45) {
        /*
            Method dump skipped, instruction units count: 14463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$0xNFQoTM76z8Jzqsr4sqKVkpTW8(RequestMoneyActivity requestMoneyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m11845instrumented$0$initListener$V(requestMoneyActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$EsGyLW2YzYiWBjS3ogGlGGknlSM(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 7;
        copy = i3 % 128;
        int i4 = i3 % 2;
        initDoMore$lambda$5(baseQuickAdapter, view, i);
        if (i4 == 0) {
            throw null;
        }
    }

    public static void m11842$r8$lambda$GeUAitHlKq5A3shKOZSJ_vSg54(RequestMoneyActivity requestMoneyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        initObserver$lambda$9(requestMoneyActivity, resource);
        int i4 = equals + 7;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$H3YhN7XeZlZsI4pKzmmKTKCa3bo(RequestMoneyActivity requestMoneyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copy + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        launcher$lambda$1(requestMoneyActivity, activityResult);
        if (i3 != 0) {
            throw null;
        }
        int i4 = copy + 75;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Unit $r8$lambda$RbXiaPrVLFUnLQG_bRL4kL3jJnQ(RequestMoneyActivity requestMoneyActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$8 = initObserver$lambda$8(requestMoneyActivity, resource);
        int i4 = equals + 55;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unitInitObserver$lambda$8;
    }

    public static void $r8$lambda$ToNsIrdBV0Hm6Q5BCGFN86W61pI(RequestMoneyActivity requestMoneyActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        favoritesLauncher$lambda$2(requestMoneyActivity, activityResult);
        int i4 = copy + 21;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m11843$r8$lambda$rPk932N6gpNorJmyEGCXqK_6II(RequestMoneyActivity requestMoneyActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m11847instrumented$1$initListener$V(requestMoneyActivity, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 41;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void m11844$r8$lambda$vHB6dSpLxrG4ujF28HMm8NnTdE(RequestMoneyActivity requestMoneyActivity, String str, View view) {
        int i = 2 % 2;
        int i2 = copy + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m11846instrumented$0$showTipsDialog$ILjavalangStringV(requestMoneyActivity, str, view);
        int i4 = equals + 21;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        int i = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    private static void m11845instrumented$0$initListener$V(RequestMoneyActivity requestMoneyActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initListener$lambda$6(requestMoneyActivity, view);
                Callback.onClick_exit();
                throw null;
            }
            initListener$lambda$6(requestMoneyActivity, view);
            Callback.onClick_exit();
            int i4 = equals + 87;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 92 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m11846instrumented$0$showTipsDialog$ILjavalangStringV(RequestMoneyActivity requestMoneyActivity, String str, View view) {
        int i = 2 % 2;
        int i2 = copy + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                showTipsDialog$lambda$4(requestMoneyActivity, str, view);
                return;
            }
            showTipsDialog$lambda$4(requestMoneyActivity, str, view);
            Callback.onClick_exit();
            Object obj = null;
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void m11847instrumented$1$initListener$V(RequestMoneyActivity requestMoneyActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$7(requestMoneyActivity, view);
            Callback.onClick_exit();
            int i4 = equals + 25;
            copy = i4 % 128;
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
        int i2 = equals + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = copy + 59;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = new char[]{30400, 30263, 30269, 30259, 30262, 30264, 30455, 30258, 30417, 30402, 30268, 30252, 30253, 30432, 30257, 30261, 30440, 30448, 30271, 30447, 30446, 30449, 30450, 30403, 30444, 30445, 30441, 30451, 30248, 30425, 30265, 30434, 30419, 30260};
        component3 = 321287841;
        component2 = true;
        component1 = true;
        ShareDataUIState = new char[]{2021, 1971, 2005, 1987, 2041, 2023, 2019, 2027, 1049, 2017, 1969, 2034, 2029, 1974, 1055, 1968, 2003, 1966, 1978, 2026, 2018, 2025, 1048, 2004, 2024, 2033, 1050, 1977, 1985, 2020, 2028, 1976, 2031, 2038, 1975, 2036, 1967, 2022, 2032, 1051, 1970, 1965, 1052, 2030, 1973, 1054, 2035, 2037, 1972};
        component4 = (char) 12829;
    }
}
