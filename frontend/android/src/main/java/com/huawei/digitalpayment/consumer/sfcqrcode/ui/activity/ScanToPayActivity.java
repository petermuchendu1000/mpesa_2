package com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.base.util.ThemeUtils;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;
import com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ActivityScanToPayBinding;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.SfcMyQrFragment;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.SfcScanToPayFragment;
import com.safaricom.designsystem.components.buttons.BasicTextButtonKt;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0007H\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/activity/ScanToPayActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/databinding/ActivityScanToPayBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "currentPosition", "", "sharedImageUri", "Landroid/net/Uri;", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupBackPress", "initView", "initTab", "updateUIForTab", "position", "replaceFragment", "updateToolBar", "initToolbar", "title", "", "ConsumerSfcQrCodeUI_release", "selectedIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ScanToPayActivity extends Hilt_ScanToPayActivity<ActivityScanToPayBinding, ViewModel> {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static char component1;
    private static long component2;
    private static char component3;
    private static int copy;
    private static char copydefault;
    private static char equals;
    private static int toString;
    private int currentPosition;
    private Uri sharedImageUri;
    private static final byte[] $$l = {1, -53, Ascii.US, 101};
    private static final int $$o = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {78, -86, -128, -128, -17, -3, 58, -63, -18, Ascii.SI, -27, 13, -9, TarHeader.LF_FIFO, -59, -10, -3, -7, -16, Ascii.SO, -16, -9, 10, -29, 7, 3, -14, -11, 65, -58, -17, -4, -10, -7, 3, 3, -18, 63, -74, 8, -2, -23, 7, TarHeader.LF_FIFO, -73, 8, -16, -4, -8, -7, 9, -17, Ascii.FF, -25, Ascii.FF, TarHeader.LF_LINK, -58, -17, -3, -8, -4, -4, 4, -14, -11, -4, SignedBytes.MAX_POWER_OF_TWO, -29, -49, Ascii.FF, -25, Ascii.FF, Ascii.DLE, -38, -9, 6, -11, -4, 38, -35, -22, 9, 20, -46, 75, PSSSigner.TRAILER_IMPLICIT, -17, -3, -8, -4, -4, 4, -14, -11, 60, -26, 2, -22, 8, Ascii.FS, -34, -24, Ascii.SO, 7, 7, -15, -38, Ascii.SO, -24, 10, -17, -3, 58, -64, 3, -20, Base64.padSymbol, -56, -7, TarHeader.LF_NORMAL, -56, -18, 5, -19, -2, 1, 0, TarHeader.LF_LINK, -56, -7, -21, SignedBytes.MAX_POWER_OF_TWO, -70, -6, 6, -18, Ascii.FF, -24, 6, -11, -4, 59, -57, -12, -22, 71, -73, 8, -7, -7, -11, -4, 59, -70, -6, 6, -18, Ascii.FF, -24, 6, -11, -4, 59, -73, 8, -16, -4, -9, 5, -16, 0, -8, -12, 70, -29, -36, -20, Ascii.FF, -10, 34, -48, -5, 38, -52, -5, -8, Ascii.FS, -24, -17, -9, Ascii.VT, -19, -6, -17, -6, -14, Ascii.DLE, -6, -6, 0, -25, 4, -13, -17, -3, -8, -4, -4, 4, -14, -11, 60, -17, -3, 58, -74, 13, -10, 0, -22, 4, 1, -17, -3, 58, -59, -6, -19, 5, -3, -12, -10, -11, 1, -6, 10, -13, 58, -58, -17, -3, -8, -4, -4, 4, -14, -11, -4, SignedBytes.MAX_POWER_OF_TWO, -58, -10, -6, -12, Base64.padSymbol, -25, -36, -23, 9, Ascii.SUB, -40, -8, -13, 10, -18, 42, -42, -6, -12, 32, -46, 75, -5, -38, -56, -1, 10, -18, -1, 8, -16, 20, -43, 6, -11, 7, -2, -20, 6, 1, Ascii.DC2, -26, -17, 6, -7, -2, 44, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol};
    private static final int $$t = 12;
    private static final byte[] $$d = {121, -58, 81, 67, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7};
    private static final int $$e = 175;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.$$l
            int r7 = r7 + 98
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r5]
        L25:
            int r7 = r7 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.$$r(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.$$d
            int r9 = 28 - r9
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.f(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.$$s
            int r7 = r7 * 16
            int r7 = 99 - r7
            int r9 = 92 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L28:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.i(byte, short, short, java.lang.Object[]):void");
    }

    public static final void access$updateUIForTab(ScanToPayActivity scanToPayActivity, int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 89;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        scanToPayActivity.updateUIForTab(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_scan_to_pay;
        int i5 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        final List<String> component2;
        final ScanToPayActivity component3;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            final List<String> ShareDataUIState;
            final ScanToPayActivity copydefault;
            private static final byte[] $$a = {119, -58, 7, 71};
            private static final int $$b = 160;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int component2 = 0;
            private static int getRequestBeneficiariesState = 1;
            private static int component1 = -890926545;
            private static int[] component3 = {1648095067, 1344617831, 285490925, -2035556122, -463025735, 1934343082, -1319772060, 1409876583, -1996233495, -816701595, 944915370, 534516121, -1471075863, 266901532, -1666235445, -840640344, -635095748, 556489543};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(byte r6, int r7, int r8) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.component1.AnonymousClass5.$$a
                    int r8 = r8 * 4
                    int r8 = r8 + 1
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r6 = r6 + 65
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L29
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L29:
                    int r7 = -r7
                    int r3 = r3 + 1
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.component1.AnonymousClass5.$$c(byte, int, int):java.lang.String");
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 25;
                getRequestBeneficiariesState = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    component1(composer2, num2.intValue());
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                component1(composer2, num2.intValue());
                Unit unit2 = Unit.INSTANCE;
                int i3 = component2 + 67;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            public final void component1(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i3 = getRequestBeneficiariesState + 9;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                composer.startReplaceGroup(-432756435);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    composer.updateRememberedValue(objRememberedValue);
                    int i5 = getRequestBeneficiariesState + 75;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 5;
                    }
                }
                final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
                composer.endReplaceGroup();
                List<String> list = this.ShareDataUIState;
                int iComponent1 = component1(mutableIntState);
                final ScanToPayActivity scanToPayActivity = this.copydefault;
                ScanToPayActivityKt.access$ScanToPayTabs(list, iComponent1, new Function1() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = ShareDataUIState + 27;
                        component2 = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitCopydefault = ScanToPayActivity.component1.AnonymousClass5.copydefault(scanToPayActivity, mutableIntState, ((Integer) obj).intValue());
                        int i10 = ShareDataUIState + 31;
                        component2 = i10 % 128;
                        int i11 = i10 % 2;
                        return unitCopydefault;
                    }
                }, composer, 0);
            }

            private static final Unit component2(ScanToPayActivity scanToPayActivity, MutableIntState mutableIntState, int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 13;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(scanToPayActivity, "");
                Intrinsics.checkNotNullParameter(mutableIntState, "");
                component1(mutableIntState, i);
                ScanToPayActivity.access$updateUIForTab(scanToPayActivity, i);
                Unit unit = Unit.INSTANCE;
                int i5 = getRequestBeneficiariesState + 65;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
                char[] cArr2 = new char[i];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                    iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                    cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
                    int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component1)};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 38 - Color.alpha(0), (char) (26860 - (ViewConfiguration.getTouchSlop() >> 8)), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) ((Process.getThreadPriority(0) + 20) >> 6), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
                    System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
                }
                if (z) {
                    int i6 = $10 + 27;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char[] cArr4 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                    while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                        int i8 = $10 + 17;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                        Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 7406, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
                int[] iArr2;
                int i2 = 2;
                int i3 = 2 % 2;
                getActiveNotifications getactivenotifications = new getActiveNotifications();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = component3;
                int i4 = 41;
                int i5 = 684241640;
                int i6 = 1;
                int i7 = 0;
                if (iArr3 != null) {
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = iArr3.length;
                    int[] iArr4 = new int[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 53;
                        $10 = i11 % 128;
                        int i12 = i11 % i2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                            if (objCopydefault == null) {
                                byte b2 = (byte) i4;
                                byte b3 = (byte) 0;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 4391, 38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), -309236339, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr4[i10] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                            i10++;
                            i2 = 2;
                            i4 = 41;
                            i5 = 684241640;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length2 = iArr3.length;
                int[] iArr5 = new int[length2];
                int[] iArr6 = component3;
                if (iArr6 != null) {
                    int length3 = iArr6.length;
                    int[] iArr7 = new int[length3];
                    int i13 = 0;
                    while (i13 < length3) {
                        int i14 = $11 + 23;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr3 = new Object[i6];
                        objArr3[i7] = Integer.valueOf(iArr6[i13]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            iArr2 = iArr6;
                            byte b4 = (byte) i7;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 37, (char) Color.alpha(i7), -309236339, false, $$c((byte) 41, b4, b4), new Class[]{Integer.TYPE});
                        } else {
                            iArr2 = iArr6;
                        }
                        iArr7[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i13++;
                        iArr6 = iArr2;
                        i6 = 1;
                        i7 = 0;
                    }
                    iArr6 = iArr7;
                }
                int i16 = i7;
                System.arraycopy(iArr6, i16, iArr5, i16, length2);
                getactivenotifications.component1 = i16;
                while (getactivenotifications.component1 < iArr.length) {
                    cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
                    cArr[1] = (char) iArr[getactivenotifications.component1];
                    cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
                    cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
                    getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
                    getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
                    getActiveNotifications.component2(iArr5);
                    for (int i17 = 0; i17 < 16; i17++) {
                        int i18 = $10 + 69;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        getactivenotifications.ShareDataUIState ^= iArr5[i17];
                        Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                        if (objCopydefault3 == null) {
                            byte b5 = (byte) 0;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3016 - AndroidCharacter.getMirror('0'), 15 - TextUtils.lastIndexOf("", '0', 0), (char) (AndroidCharacter.getMirror('0') + 49823), 462826032, false, $$c((byte) 39, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                        getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                        getactivenotifications.component2 = iIntValue;
                    }
                    int i20 = getactivenotifications.ShareDataUIState;
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = i20;
                    getactivenotifications.component2 ^= iArr5[16];
                    getactivenotifications.ShareDataUIState ^= iArr5[17];
                    int i21 = getactivenotifications.ShareDataUIState;
                    int i22 = getactivenotifications.component2;
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
                        byte b6 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0'), 24 - (Process.myPid() >> 22), (char) ((-16749579) - Color.rgb(0, 0, 0)), -1616366948, false, $$c((byte) 42, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            private static final int component1(MutableIntState mutableIntState) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 17;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                int intValue = mutableIntState.getIntValue();
                int i4 = component2 + 19;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return intValue;
            }

            private static final void component1(MutableIntState mutableIntState, int i) {
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 67;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                mutableIntState.setIntValue(i);
                int i5 = component2 + 7;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(ScanToPayActivity scanToPayActivity, MutableIntState mutableIntState, int i) {
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 105;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitComponent2 = component2(scanToPayActivity, mutableIntState, i);
                if (i4 != 0) {
                    int i5 = 41 / 0;
                }
                return unitComponent2;
            }

            AnonymousClass5(List<String> list, ScanToPayActivity scanToPayActivity) {
                this.ShareDataUIState = list;
                this.copydefault = scanToPayActivity;
            }

            public static Object[] copydefault(Context context, int i, int i2) {
                String str;
                int gidForName;
                char[] cArr;
                int i3;
                Object objNewInstance;
                int i4;
                char[] cArr2;
                int i5;
                int i6 = i2;
                int i7 = 2 % 2;
                int i8 = getRequestBeneficiariesState;
                int i9 = ((i8 | 53) << 1) - (i8 ^ 53);
                component2 = i9 % 128;
                int i10 = i9 % 2;
                if (context != null) {
                    int i11 = i8 + 23;
                    component2 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        int i13 = -(ViewConfiguration.getTapTimeout() >> 16);
                        int i14 = (i13 & 31) + (i13 | 31);
                        int iRgb = Color.rgb(0, 0, 0);
                        int iComponent1 = BasicTextButtonKt.copydefault.component1();
                        int i15 = component2;
                        int i16 = (i15 & 95) + (i15 | 95);
                        int i17 = i16 % 128;
                        getRequestBeneficiariesState = i17;
                        int i18 = i16 % 2;
                        int i19 = (-445) * iRgb;
                        int i20 = (i19 & 1124067687) + (i19 | 1124067687);
                        int i21 = ~iRgb;
                        int i22 = ~((i21 ^ (-16777230)) | (i21 & (-16777230)));
                        int i23 = ~iComponent1;
                        int i24 = ~(((-16777230) ^ i23) | ((-16777230) & i23));
                        int i25 = ((i22 ^ i24) | (i22 & i24)) * 446;
                        int i26 = (i20 ^ i25) + ((i25 & i20) << 1);
                        int i27 = ~((16777229 & i21) | (i21 ^ 16777229));
                        int i28 = i17 + 61;
                        component2 = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = ((-16777230) & iRgb) | ((-16777230) ^ iRgb);
                        int i31 = ~((i30 & iComponent1) | (i30 ^ iComponent1));
                        int i32 = (i26 - (~(446 * ((i31 & i27) | (i27 ^ i31))))) - 1;
                        int i33 = -(-((~((i21 ^ (-16777230)) | (i21 & (-16777230)))) * 446));
                        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                        char[] cArr3 = {16, 65519, 65483, 15, 20, JSONLexer.EOI, 29, 15, 25, 65516, 65512, 65529, 65518, 65534, 0, 65512, 65518, 65495, 15, 20, JSONLexer.EOI, 29, 15, 25, 65516, 65512, 65530, 65495, 18, ' ', CharUtils.CR};
                        BasicTextButtonKt.copydefault.component1();
                        BasicTextButtonKt.copydefault.component1();
                        Object[] objArr = new Object[1];
                        a(i14, i34, cArr3, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 266, true, objArr);
                        try {
                            Object[] objArr2 = {(String) objArr[0]};
                            float maxVolume = AudioTrack.getMaxVolume();
                            int i35 = getRequestBeneficiariesState + 117;
                            component2 = i35 % 128;
                            if (i35 % 2 != 0) {
                                Object[] objArr3 = new Object[1];
                                b(39 << (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), new int[]{232852465, -1646810614, -2104405339, -1513801820, -1298113271, -87908192, -1908411537, -1856712152, 1482284361, -274777081, 1283949967, 2069292665, -1109116693, 1370248454, 1264239337, 1453550022, 2096536123, 266432134, 1934052207, 923812664}, objArr3);
                                str = (String) objArr3[0];
                            } else {
                                int i36 = -(maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1));
                                Object[] objArr4 = new Object[1];
                                b((i36 & 39) + (i36 | 39), new int[]{232852465, -1646810614, -2104405339, -1513801820, -1298113271, -87908192, -1908411537, -1856712152, 1482284361, -274777081, 1283949967, 2069292665, -1109116693, 1370248454, 1264239337, 1453550022, 2096536123, 266432134, 1934052207, 923812664}, objArr4);
                                str = (String) objArr4[0];
                            }
                            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(String.class);
                            int i37 = component2;
                            int i38 = (i37 ^ 97) + ((i37 & 97) << 1);
                            getRequestBeneficiariesState = i38 % 128;
                            if (i38 % 2 == 0) {
                                declaredConstructor.newInstance(objArr2);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            Object objNewInstance2 = declaredConstructor.newInstance(objArr2);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31;
                            int i39 = getRequestBeneficiariesState;
                            int i40 = (i39 & 97) + (i39 | 97);
                            component2 = i40 % 128;
                            if (i40 % 2 != 0) {
                                i3 = 26757;
                                gidForName = Process.getGidForName("") * 7;
                                cArr = new char[]{65483, 65519, 16, CharUtils.CR, ' ', 18, 65518, 65512, 0, 65534, 65495, 65530, 65512, 65516, 25, 15, 29, JSONLexer.EOI, 20, 15, 65495, 65518, 65529, 65512, 65516, 25, 15, 29, JSONLexer.EOI, 20, 15};
                            } else {
                                int gidForName2 = Process.getGidForName("");
                                gidForName = (gidForName2 ^ 7) + ((gidForName2 & 7) << 1);
                                cArr = new char[]{65483, 65519, 16, CharUtils.CR, ' ', 18, 65518, 65512, 0, 65534, 65495, 65530, 65512, 65516, 25, 15, 29, JSONLexer.EOI, 20, 15, 65495, 65518, 65529, 65512, 65516, 25, 15, 29, JSONLexer.EOI, 20, 15};
                                i3 = 267;
                            }
                            int i41 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i42 = (i3 ^ i41) + ((i3 & i41) << 1);
                            Object[] objArr5 = new Object[1];
                            a(maximumFlingVelocity, gidForName, cArr, i42, false, objArr5);
                            try {
                                Object[] objArr6 = {(String) objArr5[0]};
                                int threadPriority = Process.getThreadPriority(0);
                                int i43 = ((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6;
                                int i44 = i43 * 659;
                                int i45 = ((i44 | (-24966)) << 1) - (i44 ^ (-24966));
                                int i46 = ~((~i43) | 38);
                                int i47 = ((-39) ^ i43) | ((-39) & i43);
                                int i48 = ~i47;
                                int i49 = (i46 ^ i48) | (i48 & i46);
                                int i50 = ~(i43 | i);
                                int i51 = ((i49 ^ i50) | (i49 & i50)) * (-658);
                                int i52 = getRequestBeneficiariesState;
                                int i53 = ((i52 | 49) << 1) - (i52 ^ 49);
                                component2 = i53 % 128;
                                int i54 = i53 % 2;
                                int i55 = ~i47;
                                int i56 = ((i45 + i51) - (~(-(-(i55 * 658))))) - 1;
                                int i57 = ~((i43 ^ i) | (i43 & i));
                                int i58 = ((i55 & i57) | (i55 ^ i57)) * 658;
                                Object[] objArr7 = new Object[1];
                                b((i56 ^ i58) + ((i58 & i56) << 1), new int[]{232852465, -1646810614, -2104405339, -1513801820, -1298113271, -87908192, -1908411537, -1856712152, 1482284361, -274777081, 1283949967, 2069292665, -1109116693, 1370248454, 1264239337, 1453550022, 2096536123, 266432134, 1934052207, 923812664}, objArr7);
                                Constructor<?> declaredConstructor2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class);
                                int iComponent12 = BasicTextButtonKt.copydefault.component1();
                                int i59 = ~(1533643320 | iComponent12);
                                int i60 = (i59 & 612386176) | (612386176 ^ i59);
                                int i61 = ~(((-1065930641) ^ iComponent12) | ((-1065930641) & iComponent12));
                                int i62 = ((i60 & i61) | (i60 ^ i61)) * (-754);
                                int i63 = (1227350886 ^ i62) + ((i62 & 1227350886) << 1);
                                int i64 = ~((-612386177) | iComponent12);
                                int i65 = ~iComponent12;
                                int i66 = ((-1533643321) & i65) | (i65 ^ (-1533643321));
                                int i67 = (i64 | (~(((-1065930641) & i66) | (i66 ^ (-1065930641))))) * (-754);
                                int i68 = ((i63 | i67) << 1) - (i67 ^ i63);
                                int i69 = (i65 | 1533643320) * 754;
                                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                                int i71 = ~i;
                                int i72 = (-720472610) - (~(((~(((-11563826) & i71) | ((-11563826) ^ i71))) | (~((1564787787 & i) | (1564787787 ^ i)))) * (-370)));
                                int i73 = ~i;
                                int i74 = (~(1564787787 | i73)) | (~(((-11563826) ^ i) | ((-11563826) & i)));
                                if (i70 <= (i72 - (~(-(-(((i74 ^ 1564771402) | (i74 & 1564771402)) * (-370)))))) - 855166221) {
                                    objNewInstance = declaredConstructor2.newInstance(objArr6);
                                    int i75 = 13 / 0;
                                } else {
                                    objNewInstance = declaredConstructor2.newInstance(objArr6);
                                }
                                try {
                                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                                    int iRgb2 = Color.rgb(0, 0, 0);
                                    int i76 = component2 + 49;
                                    getRequestBeneficiariesState = i76 % 128;
                                    int i77 = i76 % 2;
                                    int iComponent13 = BasicTextButtonKt.copydefault.component1();
                                    int i78 = -(-(iRgb2 * 530));
                                    int i79 = (i78 ^ 1058) + ((i78 & 1058) << 1);
                                    int i80 = (i79 ^ 301998898) + ((301998898 & i79) << 1) + (((~((~iComponent13) | iRgb2)) | (~((iRgb2 ^ 16777233) | (16777233 & iRgb2)))) * 529);
                                    int i81 = component2;
                                    int i82 = (i81 & 113) + (i81 | 113);
                                    getRequestBeneficiariesState = i82 % 128;
                                    int i83 = i82 % 2;
                                    Object[] objArr8 = new Object[1];
                                    a(iLastIndexOf, i80 + (529 * ((~((iRgb2 & iComponent13) | (iRgb2 ^ iComponent13))) | (-16777234))), new char[]{65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', CharUtils.CR, 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n'}, 283 - (ViewConfiguration.getPressedStateDuration() >> 16), true, objArr8);
                                    Class<?> cls = Class.forName((String) objArr8[0]);
                                    int i84 = -(-View.resolveSizeAndState(0, 0, 0));
                                    Object[] objArr9 = new Object[1];
                                    b((i84 & 17) + (i84 | 17), new int[]{-2034795740, 1609018540, -1954845248, -1987245975, 1853625280, -2058944637, -1377592754, -123361539, 274824399, -49179790}, objArr9);
                                    Method method = cls.getMethod((String) objArr9[0], null);
                                    int i85 = getRequestBeneficiariesState;
                                    int i86 = (i85 ^ 49) + ((i85 & 49) << 1);
                                    component2 = i86 % 128;
                                    if (i86 % 2 != 0) {
                                        Object obj2 = null;
                                        method.invoke(context, null);
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    Object objInvoke = method.invoke(context, null);
                                    try {
                                        int i87 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i88 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                        int i89 = (i88 ^ 16) + ((i88 & 16) << 1);
                                        char[] cArr4 = {65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', CharUtils.CR, 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n'};
                                        int i90 = -View.combineMeasuredStates(0, 0);
                                        int i91 = i90 * (-947);
                                        int i92 = (i91 & 268567) + (i91 | 268567);
                                        int i93 = ~i90;
                                        int i94 = ~((-284) | i);
                                        int i95 = ((i93 ^ i94) | (i94 & i93)) * (-948);
                                        int i96 = (i92 & i95) + (i92 | i95);
                                        int i97 = -(-((~(i93 | (-284) | i73)) * (-948)));
                                        int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                                        int i99 = ((i90 ^ (-284)) | (i90 & (-284))) * 948;
                                        int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                                        Object[] objArr10 = new Object[1];
                                        a(i87, i89, cArr4, i100, true, objArr10);
                                        Class<?> cls2 = Class.forName((String) objArr10[0]);
                                        int iMakeMeasureSpec = 14 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i101 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        int i102 = i101 * (-244);
                                        int i103 = ((i102 | 2952) << 1) - (i102 ^ 2952);
                                        int i104 = ~((-13) | i71);
                                        int i105 = ~((-13) | i101);
                                        int i106 = ((i104 ^ i105) | (i104 & i105)) * (-245);
                                        int i107 = (i103 & i106) + (i103 | i106);
                                        int i108 = -(-((~((-13) | i)) * (-245)));
                                        int i109 = (i107 & i108) + (i108 | i107);
                                        int i110 = -(-(((~(((-13) ^ i) | ((-13) & i))) | i101) * 245));
                                        int i111 = -Color.red(0);
                                        int iComponent14 = BasicTextButtonKt.copydefault.component1();
                                        int i112 = i111 * 367;
                                        int i113 = (((i112 & 103127) + (i112 | 103127)) - (~(-(-(((i111 ^ 281) | (i111 & 281)) * (-366)))))) - 1;
                                        int i114 = ~(((-282) ^ iComponent14) | ((-282) & iComponent14));
                                        int i115 = ((i111 ^ i114) | (i114 & i111)) * (-366);
                                        int i116 = (i113 & i115) + (i113 | i115);
                                        int i117 = ~i111;
                                        int i118 = ~((i117 ^ 281) | (i117 & 281));
                                        int i119 = (i111 & (-282)) | ((-282) ^ i111);
                                        int i120 = ~((i119 & iComponent14) | (i119 ^ iComponent14));
                                        int i121 = ((i120 & i118) | (i118 ^ i120)) * 366;
                                        Object[] objArr11 = new Object[1];
                                        a(iMakeMeasureSpec, (i109 ^ i110) + ((i110 & i109) << 1), new char[]{'\n', 65534, 65515, 2, 4, 65534, '\b', 0, 65534, 65517, 17, 2, 4, 2}, (i116 & i121) + (i116 | i121), true, objArr11);
                                        Object objInvoke2 = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                        int i122 = getRequestBeneficiariesState;
                                        int i123 = (i122 & 115) + (i122 | 115);
                                        component2 = i123 % 128;
                                        int i124 = i123 % 2;
                                        try {
                                            Object[] objArr12 = {objInvoke2, 64};
                                            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                            int i125 = ((minimumFlingVelocity | 33) << 1) - (minimumFlingVelocity ^ 33);
                                            int i126 = -Process.getGidForName("");
                                            int iComponent15 = BasicTextButtonKt.copydefault.component1();
                                            int i127 = i126 * (-337);
                                            int i128 = ((i127 | 1695) << 1) - (i127 ^ 1695);
                                            int i129 = ~i126;
                                            int i130 = ~iComponent15;
                                            int i131 = ~((i129 ^ i130) | (i129 & i130));
                                            int i132 = ~(((-6) ^ i126) | ((-6) & i126));
                                            int i133 = (i131 ^ i132) | (i131 & i132);
                                            int i134 = ~((i126 ^ iComponent15) | (i126 & iComponent15));
                                            int i135 = (i128 - (~(((i133 ^ i134) | (i133 & i134)) * (-338)))) - 1;
                                            int i136 = getRequestBeneficiariesState;
                                            int i137 = (i136 & 49) + (i136 | 49);
                                            component2 = i137 % 128;
                                            if (i137 % 2 != 0) {
                                                int i138 = i135 % ((~(i129 | 5)) * 338);
                                                int i139 = ~((i129 & i130) | (i129 ^ i130));
                                                int i140 = i126 | 5;
                                                int i141 = ~((i140 & iComponent15) | (i140 ^ iComponent15));
                                                int i142 = i138 << (338 / ((i141 & i139) | (i139 ^ i141)));
                                                i4 = 3884;
                                                i5 = i142;
                                                cArr2 = new char[]{65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, CharUtils.CR, 7, 2, 65484, 1, CharUtils.CR, '\f', 18, 3, '\f', 18, 65484, 14, 11, 65484, 65518, 65535, 1, '\t', 65535, 5, 3, 65515};
                                            } else {
                                                int i143 = i135 + ((~((~i126) | 5)) * 338);
                                                int i144 = ~((i129 & i130) | (i129 ^ i130));
                                                int i145 = i126 | 5;
                                                int i146 = ~((i145 & iComponent15) | (i145 ^ iComponent15));
                                                int i147 = (i143 - (~(((i146 & i144) | (i144 ^ i146)) * 338))) - 1;
                                                i4 = 280;
                                                cArr2 = new char[]{65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, CharUtils.CR, 7, 2, 65484, 1, CharUtils.CR, '\f', 18, 3, '\f', 18, 65484, 14, 11, 65484, 65518, 65535, 1, '\t', 65535, 5, 3, 65515};
                                                i5 = i147;
                                            }
                                            int iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                            int iComponent16 = BasicTextButtonKt.copydefault.component1();
                                            int i148 = ((iIndexOf * (-337)) - (~(-(-(i4 * 339))))) - 1;
                                            int i149 = ~iIndexOf;
                                            int i150 = ~iComponent16;
                                            int i151 = ~((i149 ^ i150) | (i150 & i149));
                                            int i152 = ~i4;
                                            int i153 = ~((i152 ^ iIndexOf) | (i152 & iIndexOf));
                                            int i154 = (i151 ^ i153) | (i153 & i151);
                                            int i155 = ~(iIndexOf | iComponent16);
                                            int i156 = ((i148 + (((i154 ^ i155) | (i154 & i155)) * (-338))) - (~(-(-((~(i149 | i4)) * 338))))) - 1;
                                            int i157 = ~(i149 | (~iComponent16));
                                            int i158 = ~(iIndexOf | i4 | iComponent16);
                                            int i159 = -(-(((i158 & i157) | (i157 ^ i158)) * 338));
                                            int i160 = ((i156 | i159) << 1) - (i159 ^ i156);
                                            Object[] objArr13 = new Object[1];
                                            a(i125, i5, cArr2, i160, false, objArr13);
                                            Class<?> cls3 = Class.forName((String) objArr13[0]);
                                            Object[] objArr14 = new Object[1];
                                            b(13 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), new int[]{-2034795740, 1609018540, -1954845248, -1987245975, 449404317, -1266135989, -1287380539, -1418318828}, objArr14);
                                            Object objInvoke3 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                            int i161 = 29 - (~(-View.resolveSize(0, 0)));
                                            int i162 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                            Object[] objArr15 = new Object[1];
                                            a(i161, (i162 & 7) + (i162 | 7), new char[]{0, 6, 4, 65512, CharUtils.CR, 5, 14, 0, CharUtils.CR, 3, 17, 14, '\b', 3, 65485, 2, 14, CharUtils.CR, 19, 4, CharUtils.CR, 19, 65485, 15, '\f', 65485, 65519, 0, 2, '\n'}, 279 - View.MeasureSpec.makeMeasureSpec(0, 0), false, objArr15);
                                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                                            Object[] objArr16 = new Object[1];
                                            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, new int[]{1433843188, 1567287364, 855159134, -1053529112, 1491152157, 1517793424}, objArr16);
                                            Object[] objArr17 = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke3);
                                            int length = objArr17.length;
                                            int i163 = 0;
                                            while (i163 < length) {
                                                Object obj3 = objArr17[i163];
                                                int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                                int iComponent17 = BasicTextButtonKt.copydefault.component1();
                                                int i164 = iResolveOpacity * (-575);
                                                int i165 = (i164 & (-2875)) + (i164 | (-2875));
                                                int i166 = ~iResolveOpacity;
                                                int i167 = ~((i166 & (-6)) | (i166 ^ (-6)));
                                                int i168 = ~(((-6) ^ iComponent17) | ((-6) & iComponent17));
                                                int i169 = i165 + (((i167 ^ i168) | (i167 & i168)) * 576);
                                                int i170 = ~iResolveOpacity;
                                                int i171 = ~((i170 ^ 5) | (i170 & 5));
                                                int i172 = ~iComponent17;
                                                int i173 = ((-6) ^ i172) | ((-6) & i172);
                                                int i174 = ~((i173 ^ iResolveOpacity) | (i173 & iResolveOpacity));
                                                int i175 = -(-(((i174 & i171) | (i171 ^ i174)) * 576));
                                                int i176 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int iComponent18 = BasicTextButtonKt.copydefault.component1();
                                                int i177 = i176 * 673;
                                                int i178 = (i177 & (-322320)) + (i177 | (-322320));
                                                int i179 = ~((i176 ^ iComponent18) | (i176 & iComponent18));
                                                int i180 = (i178 - (~(-(-(((i179 ^ 240) | (i179 & 240)) * 672))))) - 1;
                                                int i181 = ~i176;
                                                int i182 = ~iComponent18;
                                                Object[] objArr18 = objArr17;
                                                int i183 = i180 + (((~((iComponent18 ^ 240) | (iComponent18 & 240))) | (~(i181 | i182))) * (-672));
                                                int i184 = ~(((-241) ^ i182) | ((-241) & i182));
                                                int i185 = ~((-241) | i176);
                                                int i186 = i183 + (((i185 & i184) | (i184 ^ i185)) * 672);
                                                Object[] objArr19 = new Object[1];
                                                a((((i169 | i175) << 1) - (i175 ^ i169)) + ((~((i170 ^ (-6)) | (i170 & (-6)))) * 576), 1 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), new char[]{65531, 65526, 65535, 30, 65524}, i186, false, objArr19);
                                                try {
                                                    Object[] objArr20 = {(String) objArr19[0]};
                                                    int i187 = -KeyEvent.normalizeMetaState(0);
                                                    int i188 = (i187 & 37) + (i187 | 37);
                                                    int i189 = -Process.getGidForName("");
                                                    int i190 = i189 * 881;
                                                    int i191 = (i190 & 14977) + (i190 | 14977);
                                                    int i192 = ~i189;
                                                    int i193 = ~((i192 ^ (-18)) | (i192 & (-18)));
                                                    int i194 = ~((i192 & i) | (i192 ^ i));
                                                    int i195 = (i191 - (~(-(-((((i194 & i193) | (i193 ^ i194)) | (~((-18) | i))) * (-880)))))) - 1;
                                                    int i196 = ~((~i189) | i71);
                                                    int i197 = (i196 & 17) | (i196 ^ 17);
                                                    int i198 = ~((i189 & i) | (i189 ^ i));
                                                    int i199 = -(-(((i197 & i198) | (i197 ^ i198)) * (-880)));
                                                    Object[] objArr21 = new Object[1];
                                                    a(i188, (((i195 & i199) + (i199 | i195)) - (~(-(-((~r9) * 880))))) - 1, new char[]{65503, 1, 14, 16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14, 5, 16, 21, 65482, 65535, 1, 14, 16, 65482}, Color.green(0) + 282, false, objArr21);
                                                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                                                    int i200 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    Object[] objArr22 = new Object[1];
                                                    b((i200 & 11) + (i200 | 11), new int[]{-887573167, 944575593, 256703944, -2093504110, -1819847591, 882471082}, objArr22);
                                                    Object objInvoke4 = cls5.getMethod((String) objArr22[0], String.class).invoke(null, objArr20);
                                                    int i201 = component2;
                                                    int i202 = (i201 & 27) + (i201 | 27);
                                                    getRequestBeneficiariesState = i202 % 128;
                                                    int i203 = i202 % 2;
                                                    try {
                                                        int i204 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int iComponent19 = BasicTextButtonKt.copydefault.component1();
                                                        int i205 = ~i204;
                                                        int i206 = length;
                                                        int i207 = component2 + 59;
                                                        int i208 = i163;
                                                        getRequestBeneficiariesState = i207 % 128;
                                                        int i209 = i207 % 2;
                                                        int i210 = ~(i205 | 28);
                                                        int i211 = ~((28 & iComponent19) | (28 ^ iComponent19));
                                                        int i212 = ((i204 * 71) - 1932) + ((-140) * ((i210 & i211) | (i210 ^ i211)));
                                                        int i213 = (i204 ^ 28) | (i204 & 28);
                                                        int i214 = i212 + ((~((i213 & iComponent19) | (i213 ^ iComponent19))) * 70);
                                                        int i215 = ~((i205 ^ 28) | (i205 & 28));
                                                        int i216 = ~(((-29) & i204) | ((-29) ^ i204));
                                                        int i217 = (i215 & i216) | (i215 ^ i216);
                                                        int i218 = ~((i204 ^ iComponent19) | (i204 & iComponent19));
                                                        int i219 = ((i217 & i218) | (i217 ^ i218)) * 70;
                                                        int i220 = ((i214 | i219) << 1) - (i219 ^ i214);
                                                        i6 = 14;
                                                        try {
                                                            Object[] objArr23 = new Object[1];
                                                            b(i220, new int[]{280362309, -1531278324, -1299732322, -982665789, 2145579372, -902320778, -1056295066, 797522760, 1430677484, -762361058, -1388127565, 1064517670, 2053363186, 1403500116}, objArr23);
                                                            Class<?> cls6 = Class.forName((String) objArr23[0]);
                                                            int i221 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                            int i222 = ((i221 | 12) << 1) - (i221 ^ 12);
                                                            int i223 = -(-(Process.myPid() >> 22));
                                                            Object[] objArr24 = new Object[1];
                                                            a(i222, ((i223 | 2) << 1) - (i223 ^ 2), new char[]{'\b', CharUtils.CR, 18, 65530, 11, 11, 65498, 65534, CharUtils.CR, 18, 65499}, View.getDefaultSize(0, 0) + 285, true, objArr24);
                                                            try {
                                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr24[0], null).invoke(obj3, null));
                                                                int i224 = component2;
                                                                int i225 = (i224 ^ 107) + ((i224 & 107) << 1);
                                                                getRequestBeneficiariesState = i225 % 128;
                                                                int i226 = i225 % 2;
                                                                try {
                                                                    Object[] objArr25 = {byteArrayInputStream};
                                                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                                    int i227 = (((packedPositionGroup * 51) - 1813) - (~((packedPositionGroup | i) * (-50)))) - 1;
                                                                    int i228 = ~packedPositionGroup;
                                                                    int i229 = (i228 & (-38)) | (i228 ^ (-38));
                                                                    int i230 = ~((i229 & i) | (i229 ^ i));
                                                                    int i231 = component2;
                                                                    int i232 = ((i231 | 73) << 1) - (i231 ^ 73);
                                                                    getRequestBeneficiariesState = i232 % 128;
                                                                    int i233 = i232 % 2;
                                                                    int i234 = ~(((-38) ^ i73) | ((-38) & i73) | packedPositionGroup);
                                                                    int i235 = (i227 - (~(-(-(50 * ((i230 & i234) | (i230 ^ i234))))))) - 1;
                                                                    int i236 = ~(((-38) ^ i71) | ((-38) & i71));
                                                                    int i237 = ~(((-38) & packedPositionGroup) | ((-38) ^ packedPositionGroup));
                                                                    int i238 = (i237 & i236) | (i236 ^ i237);
                                                                    int i239 = ~((packedPositionGroup & i73) | (i73 ^ packedPositionGroup));
                                                                    int i240 = (i235 - (~(((i239 & i238) | (i238 ^ i239)) * 50))) - 1;
                                                                    int i241 = -TextUtils.indexOf("", "", 0);
                                                                    int iComponent110 = BasicTextButtonKt.copydefault.component1();
                                                                    int i242 = i241 * (-830);
                                                                    int i243 = (i242 ^ 14976) + ((i242 & 14976) << 1);
                                                                    int i244 = ~iComponent110;
                                                                    int i245 = (i241 ^ 18) | (i241 & 18);
                                                                    int i246 = i243 + (((~(((-19) & i244) | ((-19) ^ i244))) | (~((i245 & iComponent110) | (i245 ^ iComponent110)))) * (-831));
                                                                    int i247 = ((-19) & i241) | ((-19) ^ i241);
                                                                    int i248 = (~((i247 & iComponent110) | (i247 ^ iComponent110))) * (-1662);
                                                                    int i249 = (i246 ^ i248) + ((i246 & i248) << 1);
                                                                    int i250 = ~(i244 | (~i241));
                                                                    int i251 = getRequestBeneficiariesState;
                                                                    int i252 = (i251 & 121) + (i251 | 121);
                                                                    component2 = i252 % 128;
                                                                    int i253 = i252 % 2;
                                                                    int i254 = ~((i241 & iComponent110) | (i241 ^ iComponent110));
                                                                    int i255 = (i254 & i250) | (i250 ^ i254);
                                                                    int i256 = ~((iComponent110 & 18) | (18 ^ iComponent110));
                                                                    int i257 = -(-(831 * ((i255 & i256) | (i255 ^ i256))));
                                                                    int i258 = (i249 ^ i257) + ((i257 & i249) << 1);
                                                                    int i259 = -Color.red(0);
                                                                    int i260 = (~((~i259) | (-283))) | (~((-283) | i));
                                                                    int i261 = ~((i71 ^ i259) | (i71 & i259) | 282);
                                                                    int i262 = ((((i259 * 471) + 132822) + (((i259 ^ 282) | (i259 & 282)) * (-470))) - (~(-(-(((i260 & i261) | (i260 ^ i261)) * (-470)))))) - 1;
                                                                    int i263 = ~(((-283) ^ i259) | ((-283) & i259) | i);
                                                                    int i264 = (i259 & i73) | (i73 ^ i259);
                                                                    int i265 = ((~((i264 & 282) | (i264 ^ 282))) | i263) * 470;
                                                                    int i266 = (i262 & i265) + (i265 | i262);
                                                                    Object[] objArr26 = new Object[1];
                                                                    a(i240, i258, new char[]{65503, 1, 14, 16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14, 5, 16, 21, 65482, 65535, 1, 14, 16, 65482}, i266, false, objArr26);
                                                                    Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                    int i267 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                    int iComponent111 = BasicTextButtonKt.copydefault.component1();
                                                                    int i268 = -(-(i267 * 530));
                                                                    int i269 = (i268 ^ 1058) + ((i268 & 1058) << 1) + 10070;
                                                                    int i270 = ~iComponent111;
                                                                    int i271 = ~((i270 & i267) | (i270 ^ i267));
                                                                    int i272 = ~((i267 ^ 19) | (i267 & 19));
                                                                    int i273 = -(-(((i271 & i272) | (i271 ^ i272)) * 529));
                                                                    int i274 = ((i269 | i273) << 1) - (i273 ^ i269);
                                                                    int i275 = -(-(((~(i267 | iComponent111)) | (-20)) * 529));
                                                                    int i276 = (i274 & i275) + (i275 | i274);
                                                                    int i277 = -(Process.myPid() >> 22);
                                                                    int i278 = ((i277 | 2) << 1) - (i277 ^ 2);
                                                                    char[] cArr5 = {65534, 0, 65534, CharUtils.CR, 65530, 65532, 2, 65535, 2, CharUtils.CR, 11, 65534, 65500, 65534, CharUtils.CR, 65530, 11, 65534, 7};
                                                                    int i279 = getRequestBeneficiariesState;
                                                                    int i280 = (i279 ^ 25) + ((i279 & 25) << 1);
                                                                    component2 = i280 % 128;
                                                                    int i281 = i280 % 2;
                                                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                                                                    int i282 = iLastIndexOf2 * 755;
                                                                    int i283 = (i282 & (-215358)) + (i282 | (-215358));
                                                                    int i284 = ~iLastIndexOf2;
                                                                    int i285 = (~((i284 & i) | (i284 ^ i))) | (~((i284 ^ 286) | (i284 & 286)));
                                                                    int i286 = ~((i ^ 286) | (i & 286));
                                                                    int i287 = -(-(((i285 & i286) | (i285 ^ i286)) * (-754)));
                                                                    int i288 = (i283 ^ i287) + ((i287 & i283) << 1);
                                                                    int i289 = ~iLastIndexOf2;
                                                                    int i290 = (i289 ^ 286) | (i289 & 286);
                                                                    int i291 = (iLastIndexOf2 & i71) | (i71 ^ iLastIndexOf2);
                                                                    int i292 = ((~((i291 & 286) | (i291 ^ 286))) | (~((i290 & i) | (i290 ^ i)))) * (-754);
                                                                    int i293 = (i288 & i292) + (i292 | i288) + ((i289 | i73) * 754);
                                                                    Object[] objArr27 = new Object[1];
                                                                    a(i276, i278, cArr5, i293, true, objArr27);
                                                                    Object objInvoke5 = cls7.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke4, objArr25);
                                                                    try {
                                                                        int i294 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                        int i295 = (i294 ^ 34) + ((i294 & 34) << 1);
                                                                        int i296 = 10 - (~TextUtils.getOffsetAfter("", 0));
                                                                        char[] cArr6 = {65508, 6, 19, 21, '\n', 7, '\n', 4, 2, 21, 6, 11, 2, 23, 2, 65487, 20, 6, 4, 22, 19, '\n', 21, JSONLexer.EOI, 65487, 4, 6, 19, 21, 65487, 65529, 65494, 65489, 65498};
                                                                        int iRgb3 = Color.rgb(0, 0, 0);
                                                                        int i297 = (iRgb3 & 16777493) + (16777493 | iRgb3);
                                                                        Object[] objArr28 = new Object[1];
                                                                        a(i295, i296, cArr6, i297, false, objArr28);
                                                                        Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                        int i298 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                                                                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                                        int i299 = ((scrollBarFadeDuration | 11) << 1) - (scrollBarFadeDuration ^ 11);
                                                                        char[] cArr7 = {65529, 21, 4, 6, 11, 3, 22, 65524, 21, 6, '\b', CharUtils.CR, 2, 17, '\n', 4, 15, '\n', 19, 65521, 65489, 65489, 65494};
                                                                        int i300 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                        int i301 = ((i300 | 278) << 1) - (i300 ^ 278);
                                                                        Object[] objArr29 = new Object[1];
                                                                        a(i298, i299, cArr7, i301, true, objArr29);
                                                                        if (!objNewInstance2.equals(cls8.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                            try {
                                                                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34;
                                                                                int i302 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                                int i303 = (i302 ^ 12) + ((i302 & 12) << 1);
                                                                                char[] cArr8 = {65508, 6, 19, 21, '\n', 7, '\n', 4, 2, 21, 6, 11, 2, 23, 2, 65487, 20, 6, 4, 22, 19, '\n', 21, JSONLexer.EOI, 65487, 4, 6, 19, 21, 65487, 65529, 65494, 65489, 65498};
                                                                                int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                                                                int i304 = (edgeSlop ^ 277) + ((edgeSlop & 277) << 1);
                                                                                Object[] objArr30 = new Object[1];
                                                                                a(maximumDrawingCacheSize, i303, cArr8, i304, false, objArr30);
                                                                                Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                                                int i305 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                                                int i306 = (i305 ^ 22) + ((i305 & 22) << 1);
                                                                                int i307 = component2;
                                                                                int i308 = (i307 & 89) + (i307 | 89);
                                                                                getRequestBeneficiariesState = i308 % 128;
                                                                                int i309 = i308 % 2;
                                                                                int i310 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                                                int i311 = (i310 ^ 11) + ((i310 & 11) << 1);
                                                                                char[] cArr9 = {65529, 21, 4, 6, 11, 3, 22, 65524, 21, 6, '\b', CharUtils.CR, 2, 17, '\n', 4, 15, '\n', 19, 65521, 65489, 65489, 65494};
                                                                                int i312 = -TextUtils.getTrimmedLength("");
                                                                                int iComponent112 = BasicTextButtonKt.copydefault.component1();
                                                                                int i313 = i312 * 465;
                                                                                int i314 = (i313 & (-128251)) + (i313 | (-128251));
                                                                                int i315 = ~iComponent112;
                                                                                int i316 = ~(((-278) ^ i315) | (i315 & (-278)));
                                                                                int i317 = ~(((-278) ^ i312) | ((-278) & i312));
                                                                                int i318 = (i316 ^ i317) | (i317 & i316);
                                                                                int i319 = ~iComponent112;
                                                                                int i320 = getRequestBeneficiariesState + 1;
                                                                                int i321 = i320 % 128;
                                                                                component2 = i321;
                                                                                int i322 = i320 % 2;
                                                                                int i323 = ~(i319 | i312);
                                                                                int i324 = i314 + (464 * ((i318 & i323) | (i318 ^ i323)));
                                                                                int i325 = ~i312;
                                                                                int i326 = (i325 & iComponent112) | (iComponent112 ^ i325);
                                                                                int i327 = i321 + 17;
                                                                                getRequestBeneficiariesState = i327 % 128;
                                                                                int i328 = i327 % 2;
                                                                                int i329 = i324 + ((-464) * ((i326 & (-278)) | (i326 ^ (-278))));
                                                                                int i330 = ~(((-278) & i312) | ((-278) ^ i312));
                                                                                int i331 = ~((i312 ^ iComponent112) | (i312 & iComponent112));
                                                                                int i332 = -(-(((i330 & i331) | (i330 ^ i331)) * 464));
                                                                                int i333 = (i329 ^ i332) + ((i332 & i329) << 1);
                                                                                a(i306, i311, cArr9, i333, true, new Object[1]);
                                                                                if (!objNewInstance.equals(cls9.getMethod((String) r2[0], null).invoke(objInvoke5, null))) {
                                                                                    i163 = i208 + 1;
                                                                                    i6 = i2;
                                                                                    length = i206;
                                                                                    objArr17 = objArr18;
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                Throwable cause = th.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        int[] iArr = new int[1];
                                                                        Object[] objArr31 = {iArr, new int[]{(~(i & 1)) & (i | 1)}, new int[]{i}, null};
                                                                        int i334 = (-1292050458) + (((~((-395373682) | i71)) | (-202176194)) * 519) + (((~((-67167298) | i71)) | (~((-135008897) | i))) * (-519)) + (((~(i | (-202176194))) | 395373681) * 519);
                                                                        int i335 = (i2 - (~((i334 ^ 16) + ((i334 & 16) << 1)))) - 1;
                                                                        int i336 = i335 << 13;
                                                                        int i337 = (i335 | i336) & (~(i335 & i336));
                                                                        int i338 = i337 >>> 17;
                                                                        int i339 = (i337 | i338) & (~(i337 & i338));
                                                                        int i340 = i339 << 5;
                                                                        iArr[0] = ((~i339) & i340) | ((~i340) & i339);
                                                                        return objArr31;
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    Throwable cause3 = th3.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th3;
                                                                }
                                                            } catch (Throwable unused) {
                                                                i6 = i2;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            Throwable cause4 = th.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } catch (Throwable th6) {
                                                    Throwable cause5 = th6.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th6;
                                                }
                                            }
                                            int i341 = component2;
                                            int i342 = (i341 & 27) + (i341 | 27);
                                            getRequestBeneficiariesState = i342 % 128;
                                            int i343 = i342 % 2;
                                        } catch (Throwable th7) {
                                            Throwable cause6 = th7.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause7 = th8.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                Object[] objArr32 = {new int[1], new int[]{i}, new int[]{i}, null};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i344 = (-145650331) + (((~((-606582685) | iUptimeMillis)) | 606315788) * (-140)) + ((~((-266897) | iUptimeMillis)) * 70) + (((~(iUptimeMillis | 799780172)) | (-193731281)) * 70);
                int iComponent113 = BasicTextButtonKt.copydefault.component1();
                int i345 = i344 * 829;
                int i346 = i6 * 829;
                int i347 = ((i345 | i346) << 1) - (i345 ^ i346);
                int i348 = ~((~i344) | (~i6));
                int i349 = ~iComponent113;
                int i350 = (i349 & i344) | (i349 ^ i344);
                int i351 = ~((i350 & i6) | (i350 ^ i6));
                int i352 = -(-(((i348 & i351) | (i348 ^ i351)) * (-828)));
                int i353 = (i347 ^ i352) + ((i352 & i347) << 1);
                int i354 = (i344 ^ i6) | (i344 & i6);
                int i355 = ~iComponent113;
                int i356 = ((i355 & i354) | (i354 ^ i355)) * (-828);
                int i357 = ((i353 | i356) << 1) - (i356 ^ i353);
                int i358 = -(-((~(i344 | i6)) * 828));
                int i359 = ((i357 | i358) << 1) - (i358 ^ i357);
                int i360 = (i359 << 13) ^ i359;
                int i361 = i360 ^ (i360 >>> 17);
                int i362 = i361 << 5;
                ((int[]) objArr32[0])[0] = ((~i361) & i362) | ((~i362) & i361);
                return objArr32;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 101;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 53;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 42) == 3) {
                int i5 = i4 + 27;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    composer.getSkipping();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1472235103, true, new AnonymousClass5(this.component2, this.component3), composer, 54), composer, 1572864, 63);
        }

        component1(List<String> list, ScanToPayActivity scanToPayActivity) {
            this.component2 = list;
            this.component3 = scanToPayActivity;
        }
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i3 = $10 + 25;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 107;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 844;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 32;
                        char cIndexOf = (char) (23251 - TextUtils.indexOf("", "", 0));
                        byte b2 = (byte) (-$$l[0]);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, maxKeyCode, cIndexOf, 592652048, false, $$r(b2, b3, (byte) (b3 | 13)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int i9 = 845 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32;
                        char maxKeyCode2 = (char) (23251 - (KeyEvent.getMaxKeyCode() >> 16));
                        byte b4 = (byte) (-$$l[0]);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i9, i10, maxKeyCode2, 592652048, false, $$r(b4, b5, (byte) (b5 | 13)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 465, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49, (char) (Color.rgb(0, 0, 0) + 16777216), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void h(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
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
        int i5 = $11 + 45;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $11 + 17;
            $10 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iRed = 4037 - Color.red(i4);
                    int edgeSlop = 31 - (ViewConfiguration.getEdgeSlop() >> 16);
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i4, i4) + 19182);
                    byte b2 = $$l[i4];
                    byte b3 = (byte) (-b2);
                    String str$$r = $$r(b3, (byte) (b3 + 1), b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRed, edgeSlop, cLastIndexOf, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 7567;
                        int doubleTapTimeout = 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, doubleTapTimeout, c3, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i9 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i9);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int packedPositionGroup = 2459 - ExpandableListView.getPackedPositionGroup(0L);
                            int i10 = 28 - (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            char deadChar = (char) KeyEvent.getDeadChar(i4, i4);
                            byte b4 = (byte) (-$$l[i4]);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, i10, deadChar, 931716605, false, $$r(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - Gravity.getAbsoluteGravity(0, 0), Color.blue(0) + 11, (char) TextUtils.getCapsMode("", 0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copy) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) equals) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i2 = 2;
                            i4 = 0;
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
        String str = new String(cArr6);
        int i11 = $11 + 43;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0172  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.onCreate(android.os.Bundle):void");
    }

    private final void setupBackPress() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() {
            private static int component3 = 0;
            private static int copydefault = 1;

            {
                super(true);
            }

            @Override
            public void handleOnBackPressed() {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                this.ShareDataUIState.finish();
                if (i4 == 0) {
                    int i5 = 59 / 0;
                }
            }
        };
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
        if (objCopydefault == null) {
            int size = View.MeasureSpec.getSize(0) + 1115;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
            char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            f(bArr[101], bArr[13], bArr[69], objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(size, iCombineMeasuredStates, c2, -1308762862, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(26) - 99, new char[]{24823, 59471, 37601, 19084, 36228, 58238, 18285, 25057, 19923, 8821, 47994, 59442, 20058, 60881, 20492, 4841, 64937, 42751, 56896, 57093, 5195, 64428}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        g(15 - View.MeasureSpec.getSize(0), new char[]{6272, 44781, 15540, 48519, 65077, 24492, 48488, 27424, 30822, 47701, 51501, 40255, 2449, 27331, 40805, 22829}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
        if (objCopydefault2 == null) {
            int i2 = 1115 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iGreen = 22 - Color.green(0);
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr2 = $$d;
            byte b2 = (byte) (-bArr2[35]);
            byte b3 = bArr2[13];
            Object[] objArr5 = new Object[1];
            f(b2, b3, b3, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i2, iGreen, jumpTapTimeout, -206681338, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
            if (objCopydefault3 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1115;
                int iAlpha = Color.alpha(0) + 22;
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr3 = $$d;
                Object[] objArr6 = new Object[1];
                f((byte) (-bArr3[42]), (byte) (-bArr3[34]), bArr3[10], objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iAlpha, maximumDrawingCacheSize, 44744436, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{i3}, (String[]) objArr7[3]};
            int i4 = ((((~((-603217442) | r0)) | 595858944) * (-241)) - 335039231) + (((~((~((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getRingerMode()) | (-7358498))) | (-1005878898)) * 241) + 1826722568;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            h(new char[]{35385, 24988, 41808, 33580, 15440, 45356, 23959, 42992, 18019, 17846, 50320, 14586, 3329, 31746, 54742, 1878}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).codePointAt(0) - 32, new char[]{6930, 63490, 58122, 23261}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25276), new char[]{52066, 23871, 55753, 1378}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            g(ExpandableListView.getPackedPositionGroup(0L) + 16, new char[]{48750, 46022, 4142, 46295, 62085, 17549, 31562, 52981, 54950, 25859, 25456, 34053, 16946, 20715, 14585, 18742}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i7 = getRequestBeneficiariesState + 17;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), 1826722568};
                byte[] bArr4 = $$s;
                byte b4 = bArr4[126];
                short s = b4;
                Object[] objArr11 = new Object[1];
                i(b4, s, (byte) s, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr4[125];
                Object[] objArr12 = new Object[1];
                i(b5, (short) (b5 | 90), (byte) ($$t | 64), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                if (objCopydefault4 == null) {
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 1115;
                    int iRgb = (-16777194) - Color.rgb(0, 0, 0);
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr5 = $$d;
                    Object[] objArr13 = new Object[1];
                    f((byte) (-bArr5[42]), (byte) (-bArr5[34]), bArr5[10], objArr13);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates2, iRgb, scrollBarFadeDuration, 44744436, false, (String) objArr13[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    g((((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.safaricom.mpesa.lifestyle.R.integer._2131427364_res_0x7f0b0024) & (-3)) + 21, new char[]{24823, 59471, 37601, 19084, 36228, 58238, 18285, 25057, 19923, 8821, 47994, 59442, 20058, 60881, 20492, 4841, 64937, 42751, 56896, 57093, 5195, 64428}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).codePointAt(0) - 17, new char[]{6272, 44781, 15540, 48519, 65077, 24492, 48488, 27424, 30822, 47701, 51501, 40255, 2449, 27331, 40805, 22829}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                    if (objCopydefault5 == null) {
                        int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1114;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr6 = $$d;
                        byte b6 = (byte) (-bArr6[35]);
                        byte b7 = bArr6[13];
                        Object[] objArr16 = new Object[1];
                        f(b6, b7, b7, objArr16);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9, longPressTimeout, absoluteGravity, -206681338, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                    if (objCopydefault6 == null) {
                        int maximumFlingVelocity = 1115 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i10 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char cAlpha = (char) Color.alpha(0);
                        byte[] bArr7 = $$d;
                        Object[] objArr17 = new Object[1];
                        f(bArr7[101], bArr7[13], bArr7[69], objArr17);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, i10, cAlpha, -1308762862, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[2])[0];
            Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i14}, (String[]) objArr[3]};
            int i15 = ~(System.identityHashCode(this) | 764550843);
            int i16 = i13 + (((-261896113) | i15) * (-658)) + 1354539509 + ((i15 | (-798900156)) * 658);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr18[0])[0] = i18 ^ (i18 << 5);
            int i19 = ((int[]) objArr18[0])[0];
            int i20 = ((int[]) objArr18[2])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr18[1])[0]}, new int[]{i20}, (String[]) objArr18[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i21 = i19 + (((418098549 + (((-67385361) | (~iUptimeMillis)) * (-490))) + (((~(iUptimeMillis | (-105134493))) | 37749132) * 490)) - 201195080);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr19[0])[0] = i23 ^ (i23 << 5);
            getOnBackPressedDispatcher().addCallback(this, onBackPressedCallback);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            int i24 = 0;
            while (i24 < strArr.length) {
                arrayList.add(strArr[i24]);
                i24++;
                int i25 = getRequestBeneficiariesState + 119;
                getAsAtTimestamp = i25 % 128;
                int i26 = i25 % 2;
            }
        }
        long j2 = -1;
        long j3 = ((long) (i11 ^ i12)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 6) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 6619, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr20 = {-131557755, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6562, Color.green(0) + 56, (char) ((-1) - Process.getGidForName("")), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr20);
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[2])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i28}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt(1015548979);
            int i29 = ~iNextInt;
            int i30 = i27 + (-1178398453) + (((~(35308376 | i29)) | 157889111) * (-328)) + ((iNextInt | 157889111) * 164) + (((~(iNextInt | (-35308377))) | 524880 | (~(i29 | 192672607))) * 164);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr21[0])[0] = i32 ^ (i32 << 5);
            throw new RuntimeException(String.valueOf(i12));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final void initView$lambda$0(ScanToPayActivity scanToPayActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(scanToPayActivity, "");
            scanToPayActivity.finish();
        } else {
            Intrinsics.checkNotNullParameter(scanToPayActivity, "");
            scanToPayActivity.finish();
            int i3 = 85 / 0;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        ((ActivityScanToPayBinding) this.binding).tvTitle.setText(getString(R.string.scan_to_pay));
        ((ActivityScanToPayBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ScanToPayActivity.$r8$lambda$4LFPEt2dB7oVVZovEkhTMpcBWF0(this.f$0, view);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        initTab();
        int i2 = getRequestBeneficiariesState + 21;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    private final void initTab() {
        int i = 2 % 2;
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(R.string.scan_qr), getString(R.string.my_qr)});
        ComposeView composeView = ((ActivityScanToPayBinding) this.binding).composeTabs;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(704694628, true, new component1(listListOf, this)));
        updateUIForTab(0);
        int i2 = getAsAtTimestamp + 47;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
    }

    private final void updateUIForTab(int position) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            this.currentPosition = position;
            updateToolBar(position);
            replaceFragment(position);
        } else {
            this.currentPosition = position;
            updateToolBar(position);
            replaceFragment(position);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void replaceFragment(int position) {
        SfcMyQrFragment sfcMyQrFragment;
        int i = 2 % 2;
        if (position == 0) {
            sfcMyQrFragment = SfcScanToPayFragment.INSTANCE.newInstance(this.sharedImageUri);
        } else {
            sfcMyQrFragment = new SfcMyQrFragment();
            int i2 = getAsAtTimestamp + 123;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, sfcMyQrFragment).commitAllowingStateLoss();
        int i4 = getAsAtTimestamp + 117;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void updateToolBar(int position) {
        int i = 2 % 2;
        if (position == 1) {
            int i2 = getRequestBeneficiariesState + 33;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            if (!ThemeUtils.INSTANCE.isDarkModeEnabled()) {
                ((ActivityScanToPayBinding) this.binding).ivBack.setImageResource(R.drawable.ic_black_back);
                ((ActivityScanToPayBinding) this.binding).tvTitle.setTextColor(getColor(R.color.color_303030));
                return;
            }
            int i4 = getAsAtTimestamp + 89;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            ((ActivityScanToPayBinding) this.binding).ivBack.setImageResource(R.drawable.ic_white_back);
            ((ActivityScanToPayBinding) this.binding).tvTitle.setTextColor(getColor(R.color.white));
            return;
        }
        ((ActivityScanToPayBinding) this.binding).ivBack.setImageResource(R.drawable.ic_white_back);
        ((ActivityScanToPayBinding) this.binding).tvTitle.setTextColor(getColor(R.color.white));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.onPause():void");
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
            Method dump skipped, instruction units count: 14934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.activity.ScanToPayActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$4LFPEt2dB7oVVZovEkhTMpcBWF0(ScanToPayActivity scanToPayActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m11087instrumented$0$initView$V(scanToPayActivity, view);
        int i4 = getRequestBeneficiariesState + 5;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        toString = 1;
        component3();
        int i = component4 + 111;
        toString = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m11087instrumented$0$initView$V(ScanToPayActivity scanToPayActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$0(scanToPayActivity, view);
                Callback.onClick_exit();
                throw null;
            }
            initView$lambda$0(scanToPayActivity, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 3;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 87;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        copydefault = (char) 1568;
        component3 = (char) 43023;
        ShareDataUIState = (char) 7956;
        component1 = (char) 1364;
        component2 = -7974493456684032029L;
        copy = 1386857713;
        equals = (char) 50417;
    }
}
