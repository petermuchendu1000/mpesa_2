package com.huawei.digitalpayment.consumer.sfcui.pesa.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityPesaBinding;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0019\u001a\u00020\u0007H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u0010J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/PESActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityPesaBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "currentPosition", "", "titles", "", "", "tradeType", "businessType", "selectedTabIndex", "Landroidx/compose/runtime/MutableIntState;", "forcePaybillTab", "", "billManagerPaybillNumber", "billManagerAmount", "billManagerAccountNumber", "isFromBonga", PESActivity.EXTRA_SHOW_BONGA_PAYMENT, PESActivity.EXTRA_BONGA_BALANCE_KSH, PESActivity.EXTRA_BONGA_POINTS, PESActivity.EXTRA_BONGA_SOURCE, "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "isFromBongaCalculator", "needSoftFix", "initTab", "setupComposeTabs", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class PESActivity extends Hilt_PESActivity<ActivityPesaBinding, ViewModel> {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_ACCOUNT_NUMBER = "extra_account_number";
    public static final String EXTRA_AMOUNT = "extra_amount";
    public static final String EXTRA_BONGA_BALANCE_KSH = "bongaBalanceKsh";
    public static final String EXTRA_BONGA_POINTS = "bongaPoints";
    public static final String EXTRA_BONGA_SOURCE = "bongaSource";
    public static final String EXTRA_FORCE_PAYBILL_TAB = "extra_force_paybill_tab";
    public static final String EXTRA_FROM_BONGA = "fromBonga";
    public static final String EXTRA_PAYBILL_NUMBER = "extra_paybill_number";
    public static final String EXTRA_SHOW_BONGA_PAYMENT = "showBongaPayment";
    public static final String SOURCE_CALCULATOR = "calculator";
    private static int[] ShareDataUIState;
    private static int component1;
    private static int component3;
    private String billManagerAccountNumber;
    private String billManagerAmount;
    private String billManagerPaybillNumber;
    private String bongaSource;
    private int currentPosition;
    private boolean forcePaybillTab;
    private boolean isFromBonga;
    private boolean showBongaPayment;
    private static final byte[] $$l = {117, -24, -14, 98};
    private static final int $$o = Primes.SMALL_FACTOR_LIMIT;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {93, -40, 95, -94, -18, -4, 57, -64, -19, Ascii.SO, -28, Ascii.FF, -10, TarHeader.LF_DIR, -60, -11, -4, -8, -17, 13, -17, -10, 9, -30, 6, 2, -15, -12, SignedBytes.MAX_POWER_OF_TWO, -59, -18, -5, -11, -8, 2, 2, -19, 62, -79, Ascii.FF, -3, -26, 7, -2, -24, 67, -65, -11, -12, 9, -19, Ascii.VT, -8, -23, 5, -12, -5, 58, -62, -21, 1, 5, -23, 5, -12, -5, 58, -43, -39, 13, -23, -8, Ascii.RS, -23, -30, 79, -23, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -4, 57, -76, Ascii.FF, -25, 0, -5, -7, -4, -8, 59, -78, 7, -2, -24, 1, 9, -12, -4, -19, 8, -17, -11, -5, 4, -11, 4, -11, 0, -4, -25, -1, -9, 62, -42, 40, -78, 5, -30, 4, -12, -5};
    private static final int $$t = 115;
    private static final byte[] $$d = {79, -25, -14, 102, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 213;
    private static int component2 = 0;
    private static int copy = 1;
    private static int copydefault = 1;
    private List<String> titles = CollectionsKt.emptyList();
    private String tradeType = "";
    private String businessType = "";
    private final MutableIntState selectedTabIndex = SnapshotIntStateKt.mutableIntStateOf(0);
    private String bongaBalanceKsh = "0";
    private String bongaPoints = "0";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, int r7, int r8) {
        /*
            int r6 = 107 - r6
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.$$r(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.$$d
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.i(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.$$s
            int r6 = r6 * 4
            int r6 = 99 - r6
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.j(byte, short, int, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(PESActivity pESActivity) {
        int i = 2 % 2;
        int i2 = copy + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = pESActivity.binding;
        int i4 = copy + 75;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return binding;
    }

    public static final MutableIntState access$getSelectedTabIndex$p(PESActivity pESActivity) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        MutableIntState mutableIntState = pESActivity.selectedTabIndex;
        if (i3 != 0) {
            return mutableIntState;
        }
        throw null;
    }

    public static final List access$getTitles$p(PESActivity pESActivity) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<String> list = pESActivity.titles;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final void access$setCurrentPosition$p(PESActivity pESActivity, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        pESActivity.currentPosition = i;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/PESActivity$Companion;", "", "<init>", "()V", "EXTRA_FROM_BONGA", "", "EXTRA_SHOW_BONGA_PAYMENT", "EXTRA_BONGA_BALANCE_KSH", "EXTRA_BONGA_POINTS", "EXTRA_BONGA_SOURCE", "SOURCE_CALCULATOR", "EXTRA_FORCE_PAYBILL_TAB", "EXTRA_PAYBILL_NUMBER", "EXTRA_AMOUNT", "EXTRA_ACCOUNT_NUMBER", "createBillManagerPaybillIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "paybillNumber", "amount", "accountNumber", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component3;

        private Companion() {
        }

        public static Intent createBillManagerPaybillIntent$default(Companion companion, Context context, String str, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                int i3 = component3 + 53;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 59;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createBillManagerPaybillIntent(context, str, str2, str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.content.Intent createBillManagerPaybillIntent(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity> r2 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.class
                r1.<init>(r4, r2)
                java.lang.String r4 = "extra_force_paybill_tab"
                r2 = 1
                r1.putExtra(r4, r2)
                r4 = r5
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L26
                boolean r4 = kotlin.text.StringsKt.isBlank(r4)
                if (r4 == 0) goto L21
                goto L26
            L21:
                java.lang.String r4 = "extra_paybill_number"
                r1.putExtra(r4, r5)
            L26:
                r4 = r6
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L56
                int r5 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.Companion.component3
                int r5 = r5 + 33
                int r2 = r5 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.Companion.ShareDataUIState = r2
                int r5 = r5 % r0
                if (r5 != 0) goto L41
                boolean r4 = kotlin.text.StringsKt.isBlank(r4)
                r5 = 48
                int r5 = r5 / 0
                if (r4 == 0) goto L48
                goto L56
            L41:
                boolean r4 = kotlin.text.StringsKt.isBlank(r4)
                if (r4 == 0) goto L48
                goto L56
            L48:
                java.lang.String r4 = "extra_amount"
                r1.putExtra(r4, r6)
                int r4 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.Companion.ShareDataUIState
                int r4 = r4 + 85
                int r5 = r4 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.Companion.component3 = r5
                int r4 = r4 % r0
            L56:
                r4 = r7
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L67
                boolean r4 = kotlin.text.StringsKt.isBlank(r4)
                if (r4 == 0) goto L62
                goto L67
            L62:
                java.lang.String r4 = "extra_account_number"
                r1.putExtra(r4, r7)
            L67:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.Companion.createBillManagerPaybillIntent(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_pesa;
        int i5 = copy + 73;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    private static void h(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i2 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 39, (char) (ExpandableListView.getPackedPositionGroup(0L) + 26860), 2015799920, false, $$r((byte) 42, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 16, (char) KeyEvent.normalizeMetaState(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 73;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i8 = $10 + 123;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i10 = $11 + 71;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7405 - Process.getGidForName(""), (ViewConfiguration.getScrollBarSize() >> 8) + 16, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int[] iArr3;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = ShareDataUIState;
        int i5 = 684241640;
        int i6 = 16;
        int i7 = 1;
        char c2 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = $10 + 91;
                $11 = i9 % 128;
                if (i9 % i3 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[c2] = Integer.valueOf(iArr4[i8]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> i6) + 4391;
                            int iIndexOf = 37 - TextUtils.indexOf("", "");
                            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b2 = (byte) ($$o & 5);
                            byte b3 = (byte) (-b2);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, iIndexOf, fadingEdgeLength2, -309236339, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr5[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i8--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr4[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            int defaultSize = View.getDefaultSize(0, 0) + 4391;
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 37;
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte b4 = (byte) ($$o & 5);
                            byte b5 = (byte) (-b4);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, offsetBefore, scrollDefaultDelay, -309236339, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr5[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                i5 = 684241640;
                i6 = 16;
                c2 = 0;
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = ShareDataUIState;
        if (iArr7 != null) {
            int i10 = $10 + 19;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i11 = $11 + 71;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr4 = new Object[i7];
                objArr4[0] = Integer.valueOf(iArr7[i2]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    int iMakeMeasureSpec = 4391 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 37;
                    char cAlpha = (char) Color.alpha(0);
                    byte b6 = (byte) ($$o & 5);
                    byte b7 = (byte) (-b6);
                    iArr3 = iArr7;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, jumpTapTimeout, cAlpha, -309236339, false, $$r(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i2] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i2++;
                iArr7 = iArr3;
                i7 = 1;
            }
            iArr7 = iArr2;
        }
        char c3 = 0;
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c3] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $11 + 65;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                getactivenotifications.ShareDataUIState ^= iArr6[i13];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    int iKeyCodeFromString = 2968 - KeyEvent.keyCodeFromString("");
                    int edgeSlop = 16 - (ViewConfiguration.getEdgeSlop() >> 16);
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49871);
                    byte b8 = (byte) ($$o & 15);
                    byte b9 = (byte) (b8 - 4);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, edgeSlop, maximumDrawingCacheSize, 462826032, false, $$r(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr6);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 - 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, (char) (27637 - TextUtils.indexOf("", "")), -1616366948, false, $$r(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            c3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i20 = $11 + 89;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        objArr[0] = str;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int copydefault = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 1;
            private static int component3;
            final PESActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component1 + 123;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 119;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component1(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 115;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                if ((i & 11) == 2) {
                    int i6 = i3 + 119;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                List listAccess$getTitles$p = PESActivity.access$getTitles$p(this.copydefault);
                int intValue = PESActivity.access$getSelectedTabIndex$p(this.copydefault).getIntValue();
                final PESActivity pESActivity = this.copydefault;
                PESActivityKt.access$PesaTabs(listAccess$getTitles$p, intValue, new Function1() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = component1 + 85;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                        PESActivity pESActivity2 = pESActivity;
                        Integer num = (Integer) obj;
                        if (i10 == 0) {
                            return PESActivity.copydefault.AnonymousClass5.component1(pESActivity2, num.intValue());
                        }
                        PESActivity.copydefault.AnonymousClass5.component1(pESActivity2, num.intValue());
                        throw null;
                    }
                }, composer, 8);
                int i8 = component3 + 117;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 % 4;
                }
            }

            private static final Unit component3(PESActivity pESActivity, int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 71;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(pESActivity, "");
                if (((ActivityPesaBinding) PESActivity.access$getBinding$p(pESActivity)).viewPager.getCurrentItem() != i) {
                    int i5 = component1 + 73;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    ((ActivityPesaBinding) PESActivity.access$getBinding$p(pESActivity)).viewPager.setCurrentItem(i, true);
                }
                return Unit.INSTANCE;
            }

            public static Unit component1(PESActivity pESActivity, int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 119;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    component3(pESActivity, i);
                    throw null;
                }
                Unit unitComponent3 = component3(pESActivity, i);
                int i4 = component1 + 81;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            AnonymousClass5(PESActivity pESActivity) {
                this.copydefault = pESActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component2 + 115;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                int i3 = copydefault + 31;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(269597649, true, new AnonymousClass5(PESActivity.this), composer, 54), composer, 1572864, 63);
                int i5 = copydefault + 51;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 4;
                }
            }
            int i7 = component2 + 81;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        copydefault() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0887  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean isFromBongaCalculator() {
        int i = 2 % 2;
        boolean z = false;
        if (getIntent().getBooleanExtra(EXTRA_FROM_BONGA, false) && Intrinsics.areEqual(this.bongaSource, SOURCE_CALCULATOR)) {
            int i2 = copy + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        int i4 = copy + 41;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initTab() {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.initTab():void");
    }

    private final void setupComposeTabs() {
        int i = 2 % 2;
        ((ActivityPesaBinding) this.binding).composeTabs.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        ((ActivityPesaBinding) this.binding).composeTabs.setContent(ComposableLambdaKt.composableLambdaInstance(790085332, true, new copydefault()));
        int i2 = copy + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = component2 + 119;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 7, new char[]{11, 1, 15, '\f', 6, 1, 65483, 65534, CharUtils.CR, CharUtils.CR, 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) + 237, false, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new int[]{-1106269999, 1686842918, 812153227, -1147856355, -919337372, 2145689902, 1988177498, -880897872, -501828981, 1168125401}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 43;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 6618, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 6563, 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i5 = component2 + 39;
                copy = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 3;
                }
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r48) {
        /*
            Method dump skipped, instruction units count: 14430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        component3 = 0;
        component1();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = copydefault + 79;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    @Override
    public boolean needSoftFix() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copy = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        int i5 = copy + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        ShareDataUIState = new int[]{-2040693181, -1865504619, 212312547, -1252345820, -1323172880, -239341883, -1211892304, -1248727064, 687321810, -98618667, 871728987, -945107667, -161509185, 1610386987, 1372393959, -927853560, 1418411177, 771330961};
        component1 = -890926541;
    }
}
