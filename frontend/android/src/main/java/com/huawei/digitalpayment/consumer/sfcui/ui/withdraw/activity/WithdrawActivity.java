package com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityWithdrawBinding;
import com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0013j\b\u0012\u0004\u0012\u00020\u0007`\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/withdraw/activity/WithdrawActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityWithdrawBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "tradeType", "", "businessType", "getLayoutId", "", "initToolbar", "", "title", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "titles", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "currentPosition", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "selectedTabIndex", "Landroidx/compose/runtime/MutableIntState;", "initTabs", "setupComposeTabs", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class WithdrawActivity extends Hilt_WithdrawActivity<ActivityWithdrawBinding, ViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static int[] component1;
    private static int copydefault;
    private int currentPosition;
    private static final byte[] $$l = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM};
    private static final int $$o = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {87, -2, Ascii.VT, -41, Ascii.SO, 0, -61, 71, -16, 7, -3, 19, -7, -4, Ascii.SO, 0, -61, 56, 3, Ascii.DLE, -8, 0, 9, 7, 8, -4, 3, -13, 10, -61, TarHeader.LF_CONTIG, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, 1, -67, TarHeader.LF_CONTIG, 7, 3, 9, -64, Ascii.SYN, 33, 20, -12, -29, 37, 5, 10, -13, Ascii.SI, -45, 39, 3, 9, -35, 43, -78, 2, 35, TarHeader.LF_DIR, -2, -13, Ascii.SI, -2, -11, 13, -23, 40, -9, 8, -10, -1, 17, -9, -4, -21, Ascii.ETB, Ascii.SO, -9, 4, -1, -47, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -64, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -63, Ascii.SO, 0, -61, 59, 10, 2, -6, 7, -5, -53, 78, 0, -13, 7, -5, -55, 68, -10, 4, -48, -1, 8, -7, 56, 3, 0, Ascii.SO, -9, 3, Ascii.SI, -66, Ascii.SYN, 33, 19, -13, Ascii.SO, -9, 3, -22, Ascii.SUB, 17, -17, 5, -1, Ascii.NAK, -17, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13};
    private static final int $$t = 94;
    private static final byte[] $$d = {69, -50, 81, 75, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 20;
    private static int component3 = 0;
    private static int equals = 1;
    private static int component2 = 1;
    private String tradeType = "";
    private String businessType = "";
    private ArrayList<String> titles = new ArrayList<>();
    private final MutableIntState selectedTabIndex = SnapshotIntStateKt.mutableIntStateOf(0);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 + 65
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.$$r(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r0 = 28 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.$$d
            int r6 = 100 - r6
            byte[] r0 = new byte[r0]
            int r5 = 27 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r6]
        L26:
            int r3 = -r3
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.i(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 16
            int r5 = r5 + 83
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.$$s
            int r1 = 85 - r7
            byte[] r1 = new byte[r1]
            int r7 = 84 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.j(int, short, short, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(WithdrawActivity withdrawActivity) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = withdrawActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        throw null;
    }

    public static final MutableIntState access$getSelectedTabIndex$p(WithdrawActivity withdrawActivity) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableIntState mutableIntState = withdrawActivity.selectedTabIndex;
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
        int i6 = i2 + 105;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return mutableIntState;
    }

    public static final ArrayList access$getTitles$p(WithdrawActivity withdrawActivity) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        ArrayList<String> arrayList = withdrawActivity.titles;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_withdraw;
        int i5 = equals + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.withdraw));
        int i4 = component3 + 21;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void g(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $11 + 119;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3783 - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, (char) (26860 - Color.red(0)), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.indexOf("", ""), TextUtils.getOffsetBefore("", 0) + 16, (char) TextUtils.getOffsetAfter("", 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i10 = $10 + 105;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i12 = $11 + 51;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                int i14 = $11 + 17;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final WithdrawActivity component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 69;
                copydefault = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    component2(composer2, num2.intValue());
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                component2(composer2, num2.intValue());
                Unit unit2 = Unit.INSTANCE;
                int i3 = ShareDataUIState + 29;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            public final void component2(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = copydefault + 111;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                ArrayList arrayListAccess$getTitles$p = WithdrawActivity.access$getTitles$p(this.component3);
                int intValue = WithdrawActivity.access$getSelectedTabIndex$p(this.component3).getIntValue();
                final WithdrawActivity withdrawActivity = this.component3;
                WithdrawActivityKt.access$WithdrawTabs(companion, arrayListAccess$getTitles$p, intValue, new Function1() {
                    private static int component1 = 1;
                    private static int component2;

                    @Override
                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = component2 + 99;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        WithdrawActivity withdrawActivity2 = withdrawActivity;
                        int iIntValue = ((Integer) obj).intValue();
                        if (i7 != 0) {
                            return WithdrawActivity.copydefault.AnonymousClass2.ShareDataUIState(withdrawActivity2, iIntValue);
                        }
                        WithdrawActivity.copydefault.AnonymousClass2.ShareDataUIState(withdrawActivity2, iIntValue);
                        throw null;
                    }
                }, composer, 70, 0);
                int i5 = ShareDataUIState + 21;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            private static final Unit copydefault(WithdrawActivity withdrawActivity, int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 35;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(withdrawActivity, "");
                if (((ActivityWithdrawBinding) WithdrawActivity.access$getBinding$p(withdrawActivity)).viewPager.getCurrentItem() != i) {
                    ((ActivityWithdrawBinding) WithdrawActivity.access$getBinding$p(withdrawActivity)).viewPager.setCurrentItem(i, true);
                    int i5 = copydefault + 95;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
                return Unit.INSTANCE;
            }

            public static Unit ShareDataUIState(WithdrawActivity withdrawActivity, int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 89;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Unit unitCopydefault = copydefault(withdrawActivity, i);
                int i5 = ShareDataUIState + 91;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitCopydefault;
                }
                throw null;
            }

            AnonymousClass2(WithdrawActivity withdrawActivity) {
                this.component3 = withdrawActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 27;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void copydefault(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = component2 + 1;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    composer.getSkipping();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1329661505, true, new AnonymousClass2(WithdrawActivity.this), composer, 54), composer, 1572864, 63);
            int i4 = ShareDataUIState + 21;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }

        copydefault() {
        }
    }

    private static void h(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int length;
        int[] iArr3;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = component1;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr4 != null) {
            int i7 = $10 + 21;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr4[i8]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i6;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.getCapsMode("", i6, i6), 37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.getCapsMode("", i6, i6), -309236339, false, $$r((byte) 41, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i8 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr4[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.indexOf("", ""), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), -309236339, false, $$r((byte) 41, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                int i10 = $11 + 31;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i2 = 2;
                i4 = 684241640;
                i6 = 0;
            }
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component1;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = new Object[i5];
                objArr4[0] = Integer.valueOf(iArr6[i12]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    iArr2 = iArr6;
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 38, (char) Color.red(0), -309236339, false, $$r((byte) 41, b4, b4), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i12] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i12++;
                iArr6 = iArr2;
                i5 = 1;
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        int i13 = $11 + 55;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i15 = $10 + 45;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            for (int i17 = 0; i17 < 16; i17++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i17];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 2920, ExpandableListView.getPackedPositionChild(0L) + 17, (char) (Color.argb(0, 0, 0, 0) + 49871), 462826032, false, $$r((byte) 39, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
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
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2944, (-16777192) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27637), -1616366948, false, $$r((byte) ($$o >>> 1), b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00bc  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.onCreate(android.os.Bundle):void");
    }

    public final int getCurrentPosition() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        equals = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.currentPosition;
        int i5 = i2 + 31;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final void setCurrentPosition(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 115;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        this.currentPosition = i;
        int i6 = i4 + 37;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initTabs() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.initTabs():void");
    }

    private final void setupComposeTabs() {
        int i = 2 % 2;
        ((ActivityWithdrawBinding) this.binding).composeTabs.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        ((ActivityWithdrawBinding) this.binding).composeTabs.setContent(ComposableLambdaKt.composableLambdaInstance(61490012, true, new copydefault()));
        int i2 = equals + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = equals + 63;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, new int[]{-952968437, 1133668540, 791281579, 313681875, 219943882, -1289479504, 842032801, -444866600, -1020060537, -1083441309, -1318376332, -369693598, 1753086473, -1993850762}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, new int[]{-498446159, 1703912523, -206919343, -1796236882, 1609102706, 1393194393, -688513410, 648336654, 256579755, 1641296997}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = component3 + 5;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = equals + 121;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6562, 56 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = equals + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).codePointAt(0) - 89, new int[]{-952968437, 1133668540, 791281579, 313681875, 219943882, -1289479504, 842032801, -444866600, -1020060537, -1083441309, -1318376332, -369693598, 1753086473, -1993850762}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new int[]{-498446159, 1703912523, -206919343, -1796236882, 1609102706, 1393194393, -688513410, 648336654, 256579755, 1641296997}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = equals + 57;
            component3 = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + 42, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) TextUtils.indexOf("", ""), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((-16770598) - Color.rgb(0, 0, 0), ImageFormat.getBitsPerPixel(0) + 43, (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6562, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 55, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1013:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0b78 A[Catch: all -> 0x0cac, TryCatch #11 {all -> 0x0cac, blocks: (B:145:0x0b6e, B:146:0x0b72, B:148:0x0b78, B:151:0x0b95, B:135:0x0a9d, B:140:0x0b0a, B:144:0x0b66), top: B:876:0x0a9d }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0d5b A[Catch: all -> 0x04ff, TryCatch #54 {all -> 0x04ff, blocks: (B:416:0x1877, B:418:0x187d, B:419:0x18a7, B:546:0x1e2c, B:548:0x1e32, B:549:0x1e5a, B:774:0x32df, B:776:0x32e5, B:777:0x330d, B:811:0x362c, B:813:0x3632, B:814:0x3656, B:791:0x3463, B:793:0x3486, B:794:0x34dd, B:740:0x2fa3, B:742:0x2fa9, B:743:0x2fd1, B:834:0x372e, B:836:0x3734, B:837:0x3761, B:839:0x379b, B:840:0x37ea, B:618:0x277c, B:620:0x2791, B:621:0x27c4, B:600:0x2435, B:602:0x243b, B:603:0x2467, B:605:0x24a1, B:606:0x24eb, B:567:0x20b8, B:569:0x20cd, B:570:0x2101, B:572:0x2135, B:573:0x21b8, B:332:0x1387, B:334:0x138d, B:335:0x13b9, B:208:0x0d55, B:210:0x0d5b, B:211:0x0d86, B:70:0x0683, B:72:0x0689, B:73:0x06b4, B:19:0x0268, B:21:0x026e, B:22:0x0296, B:24:0x046e, B:26:0x04a0, B:27:0x04f9, B:33:0x0509, B:35:0x050d, B:56:0x05f5, B:58:0x05fb, B:59:0x05fc, B:61:0x05fe, B:63:0x0605, B:64:0x0606, B:39:0x0519), top: B:957:0x0268, inners: #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0e65 A[Catch: all -> 0x12c1, PHI: r1 r6 r8
  0x0e65: PHI (r1v653 java.lang.Object) = (r1v646 java.lang.Object), (r1v651 java.lang.Object) binds: [B:216:0x0e12, B:217:0x0e14] A[DONT_GENERATE, DONT_INLINE]
  0x0e65: PHI (r6v458 ??) = (r6v590 ??), (r6v456 ??) binds: [B:216:0x0e12, B:217:0x0e14] A[DONT_GENERATE, DONT_INLINE]
  0x0e65: PHI (r8v186 ??) = (r8v249 ??), (r8v250 ??) binds: [B:216:0x0e12, B:217:0x0e14] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x12c1, blocks: (B:215:0x0e0e, B:222:0x0e65, B:238:0x0f35), top: B:899:0x0e0e }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0f35 A[Catch: all -> 0x12c1, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x12c1, blocks: (B:215:0x0e0e, B:222:0x0e65, B:238:0x0f35), top: B:899:0x0e0e }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x117a A[Catch: all -> 0x12a5, TryCatch #4 {all -> 0x12a5, blocks: (B:274:0x1170, B:275:0x1174, B:277:0x117a, B:280:0x1191, B:283:0x119e, B:286:0x11ab, B:298:0x1293, B:300:0x1299, B:301:0x129a, B:303:0x129c, B:305:0x12a3, B:306:0x12a4, B:266:0x10a9, B:268:0x10c6, B:270:0x110d, B:272:0x1123, B:273:0x1168, B:311:0x12ab, B:313:0x12b1, B:314:0x12b2, B:317:0x12b7, B:319:0x12bd, B:320:0x12be, B:294:0x121a, B:289:0x11db, B:291:0x11e1, B:292:0x1212), top: B:863:0x0e70, inners: #58, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x138d A[Catch: all -> 0x04ff, TryCatch #54 {all -> 0x04ff, blocks: (B:416:0x1877, B:418:0x187d, B:419:0x18a7, B:546:0x1e2c, B:548:0x1e32, B:549:0x1e5a, B:774:0x32df, B:776:0x32e5, B:777:0x330d, B:811:0x362c, B:813:0x3632, B:814:0x3656, B:791:0x3463, B:793:0x3486, B:794:0x34dd, B:740:0x2fa3, B:742:0x2fa9, B:743:0x2fd1, B:834:0x372e, B:836:0x3734, B:837:0x3761, B:839:0x379b, B:840:0x37ea, B:618:0x277c, B:620:0x2791, B:621:0x27c4, B:600:0x2435, B:602:0x243b, B:603:0x2467, B:605:0x24a1, B:606:0x24eb, B:567:0x20b8, B:569:0x20cd, B:570:0x2101, B:572:0x2135, B:573:0x21b8, B:332:0x1387, B:334:0x138d, B:335:0x13b9, B:208:0x0d55, B:210:0x0d5b, B:211:0x0d86, B:70:0x0683, B:72:0x0689, B:73:0x06b4, B:19:0x0268, B:21:0x026e, B:22:0x0296, B:24:0x046e, B:26:0x04a0, B:27:0x04f9, B:33:0x0509, B:35:0x050d, B:56:0x05f5, B:58:0x05fb, B:59:0x05fc, B:61:0x05fe, B:63:0x0605, B:64:0x0606, B:39:0x0519), top: B:957:0x0268, inners: #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x143e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1491  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x14e8 A[Catch: all -> 0x17b9, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x17b9, blocks: (B:339:0x1438, B:346:0x1484, B:377:0x16a0, B:355:0x14e8, B:365:0x1577, B:368:0x15c5, B:373:0x1639, B:376:0x1696), top: B:887:0x1438 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x16b0  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x16b4  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x187d A[Catch: all -> 0x04ff, TryCatch #54 {all -> 0x04ff, blocks: (B:416:0x1877, B:418:0x187d, B:419:0x18a7, B:546:0x1e2c, B:548:0x1e32, B:549:0x1e5a, B:774:0x32df, B:776:0x32e5, B:777:0x330d, B:811:0x362c, B:813:0x3632, B:814:0x3656, B:791:0x3463, B:793:0x3486, B:794:0x34dd, B:740:0x2fa3, B:742:0x2fa9, B:743:0x2fd1, B:834:0x372e, B:836:0x3734, B:837:0x3761, B:839:0x379b, B:840:0x37ea, B:618:0x277c, B:620:0x2791, B:621:0x27c4, B:600:0x2435, B:602:0x243b, B:603:0x2467, B:605:0x24a1, B:606:0x24eb, B:567:0x20b8, B:569:0x20cd, B:570:0x2101, B:572:0x2135, B:573:0x21b8, B:332:0x1387, B:334:0x138d, B:335:0x13b9, B:208:0x0d55, B:210:0x0d5b, B:211:0x0d86, B:70:0x0683, B:72:0x0689, B:73:0x06b4, B:19:0x0268, B:21:0x026e, B:22:0x0296, B:24:0x046e, B:26:0x04a0, B:27:0x04f9, B:33:0x0509, B:35:0x050d, B:56:0x05f5, B:58:0x05fb, B:59:0x05fc, B:61:0x05fe, B:63:0x0605, B:64:0x0606, B:39:0x0519), top: B:957:0x0268, inners: #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1993  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x19ed A[Catch: all -> 0x1da8, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x1da8, blocks: (B:423:0x192e, B:429:0x1986, B:438:0x19ed), top: B:868:0x192e }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1c26 A[Catch: all -> 0x1da3, TryCatch #3 {all -> 0x1da3, blocks: (B:473:0x1c1c, B:474:0x1c20, B:476:0x1c26, B:479:0x1c42, B:440:0x19fb, B:458:0x1aff, B:462:0x1b47, B:468:0x1bbd, B:472:0x1c14), top: B:861:0x19fb }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x1d82  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1e32 A[Catch: all -> 0x04ff, TryCatch #54 {all -> 0x04ff, blocks: (B:416:0x1877, B:418:0x187d, B:419:0x18a7, B:546:0x1e2c, B:548:0x1e32, B:549:0x1e5a, B:774:0x32df, B:776:0x32e5, B:777:0x330d, B:811:0x362c, B:813:0x3632, B:814:0x3656, B:791:0x3463, B:793:0x3486, B:794:0x34dd, B:740:0x2fa3, B:742:0x2fa9, B:743:0x2fd1, B:834:0x372e, B:836:0x3734, B:837:0x3761, B:839:0x379b, B:840:0x37ea, B:618:0x277c, B:620:0x2791, B:621:0x27c4, B:600:0x2435, B:602:0x243b, B:603:0x2467, B:605:0x24a1, B:606:0x24eb, B:567:0x20b8, B:569:0x20cd, B:570:0x2101, B:572:0x2135, B:573:0x21b8, B:332:0x1387, B:334:0x138d, B:335:0x13b9, B:208:0x0d55, B:210:0x0d5b, B:211:0x0d86, B:70:0x0683, B:72:0x0689, B:73:0x06b4, B:19:0x0268, B:21:0x026e, B:22:0x0296, B:24:0x046e, B:26:0x04a0, B:27:0x04f9, B:33:0x0509, B:35:0x050d, B:56:0x05f5, B:58:0x05fb, B:59:0x05fc, B:61:0x05fe, B:63:0x0605, B:64:0x0606, B:39:0x0519), top: B:957:0x0268, inners: #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1ee4  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x1f59  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x1fa2  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x1fb8  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x209a  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2300  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x23e4  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x261f  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x2673  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x275a  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2911  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x2fa9 A[Catch: all -> 0x04ff, TryCatch #54 {all -> 0x04ff, blocks: (B:416:0x1877, B:418:0x187d, B:419:0x18a7, B:546:0x1e2c, B:548:0x1e32, B:549:0x1e5a, B:774:0x32df, B:776:0x32e5, B:777:0x330d, B:811:0x362c, B:813:0x3632, B:814:0x3656, B:791:0x3463, B:793:0x3486, B:794:0x34dd, B:740:0x2fa3, B:742:0x2fa9, B:743:0x2fd1, B:834:0x372e, B:836:0x3734, B:837:0x3761, B:839:0x379b, B:840:0x37ea, B:618:0x277c, B:620:0x2791, B:621:0x27c4, B:600:0x2435, B:602:0x243b, B:603:0x2467, B:605:0x24a1, B:606:0x24eb, B:567:0x20b8, B:569:0x20cd, B:570:0x2101, B:572:0x2135, B:573:0x21b8, B:332:0x1387, B:334:0x138d, B:335:0x13b9, B:208:0x0d55, B:210:0x0d5b, B:211:0x0d86, B:70:0x0683, B:72:0x0689, B:73:0x06b4, B:19:0x0268, B:21:0x026e, B:22:0x0296, B:24:0x046e, B:26:0x04a0, B:27:0x04f9, B:33:0x0509, B:35:0x050d, B:56:0x05f5, B:58:0x05fb, B:59:0x05fc, B:61:0x05fe, B:63:0x0605, B:64:0x0606, B:39:0x0519), top: B:957:0x0268, inners: #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x305e  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x30af  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x310f  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x32be  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x339b  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x33f0  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x3445  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x360c  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x36f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07c1 A[Catch: all -> 0x0cd0, TRY_LEAVE, TryCatch #28 {all -> 0x0cd0, blocks: (B:85:0x07a8, B:87:0x07c1), top: B:908:0x07a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0e14 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0821 A[Catch: all -> 0x0cce, TryCatch #27 {all -> 0x0cce, blocks: (B:89:0x07f5, B:91:0x080e, B:93:0x0821, B:95:0x082a, B:96:0x0877, B:170:0x0c94, B:172:0x0c9a, B:173:0x0c9b, B:175:0x0c9d, B:177:0x0ca4, B:178:0x0ca5, B:98:0x0888, B:100:0x088c, B:107:0x08a0, B:184:0x0cb6, B:186:0x0cbc, B:187:0x0cbd, B:190:0x0cc2, B:192:0x0cc8, B:193:0x0cc9, B:104:0x0898, B:166:0x0c11, B:161:0x0bdc, B:163:0x0be2, B:164:0x0c09), top: B:907:0x07f5, inners: #59, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:952:0x1934 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0886  */
    /* JADX WARN: Type inference failed for: r11v201, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v33 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v35 */
    /* JADX WARN: Type inference failed for: r26v36 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v40 */
    /* JADX WARN: Type inference failed for: r26v41 */
    /* JADX WARN: Type inference failed for: r26v42 */
    /* JADX WARN: Type inference failed for: r26v46 */
    /* JADX WARN: Type inference failed for: r26v47 */
    /* JADX WARN: Type inference failed for: r26v48 */
    /* JADX WARN: Type inference failed for: r26v49 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v50 */
    /* JADX WARN: Type inference failed for: r26v51 */
    /* JADX WARN: Type inference failed for: r26v52 */
    /* JADX WARN: Type inference failed for: r26v6, types: [long] */
    /* JADX WARN: Type inference failed for: r26v60 */
    /* JADX WARN: Type inference failed for: r26v61 */
    /* JADX WARN: Type inference failed for: r26v62 */
    /* JADX WARN: Type inference failed for: r26v63 */
    /* JADX WARN: Type inference failed for: r26v64 */
    /* JADX WARN: Type inference failed for: r26v65 */
    /* JADX WARN: Type inference failed for: r26v66 */
    /* JADX WARN: Type inference failed for: r26v67 */
    /* JADX WARN: Type inference failed for: r26v68 */
    /* JADX WARN: Type inference failed for: r26v69 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v70 */
    /* JADX WARN: Type inference failed for: r26v71 */
    /* JADX WARN: Type inference failed for: r26v72 */
    /* JADX WARN: Type inference failed for: r26v73 */
    /* JADX WARN: Type inference failed for: r26v74 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v371, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v406, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v407, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v10 */
    /* JADX WARN: Type inference failed for: r40v11 */
    /* JADX WARN: Type inference failed for: r40v12 */
    /* JADX WARN: Type inference failed for: r40v13 */
    /* JADX WARN: Type inference failed for: r40v14 */
    /* JADX WARN: Type inference failed for: r40v15 */
    /* JADX WARN: Type inference failed for: r40v16 */
    /* JADX WARN: Type inference failed for: r40v17 */
    /* JADX WARN: Type inference failed for: r40v18 */
    /* JADX WARN: Type inference failed for: r40v19 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v20 */
    /* JADX WARN: Type inference failed for: r40v21 */
    /* JADX WARN: Type inference failed for: r40v22 */
    /* JADX WARN: Type inference failed for: r40v23 */
    /* JADX WARN: Type inference failed for: r40v24 */
    /* JADX WARN: Type inference failed for: r40v25 */
    /* JADX WARN: Type inference failed for: r40v26 */
    /* JADX WARN: Type inference failed for: r40v27 */
    /* JADX WARN: Type inference failed for: r40v28 */
    /* JADX WARN: Type inference failed for: r40v29 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v31 */
    /* JADX WARN: Type inference failed for: r40v32 */
    /* JADX WARN: Type inference failed for: r40v33 */
    /* JADX WARN: Type inference failed for: r40v34 */
    /* JADX WARN: Type inference failed for: r40v35 */
    /* JADX WARN: Type inference failed for: r40v36 */
    /* JADX WARN: Type inference failed for: r40v37 */
    /* JADX WARN: Type inference failed for: r40v38 */
    /* JADX WARN: Type inference failed for: r40v39 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v40 */
    /* JADX WARN: Type inference failed for: r40v41 */
    /* JADX WARN: Type inference failed for: r40v42 */
    /* JADX WARN: Type inference failed for: r40v43 */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r40v8 */
    /* JADX WARN: Type inference failed for: r40v9 */
    /* JADX WARN: Type inference failed for: r5v593 */
    /* JADX WARN: Type inference failed for: r6v435 */
    /* JADX WARN: Type inference failed for: r6v436 */
    /* JADX WARN: Type inference failed for: r6v437 */
    /* JADX WARN: Type inference failed for: r6v454 */
    /* JADX WARN: Type inference failed for: r6v456 */
    /* JADX WARN: Type inference failed for: r6v457 */
    /* JADX WARN: Type inference failed for: r6v458 */
    /* JADX WARN: Type inference failed for: r6v459 */
    /* JADX WARN: Type inference failed for: r6v460 */
    /* JADX WARN: Type inference failed for: r6v461 */
    /* JADX WARN: Type inference failed for: r6v463 */
    /* JADX WARN: Type inference failed for: r6v465 */
    /* JADX WARN: Type inference failed for: r6v472, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v473 */
    /* JADX WARN: Type inference failed for: r6v474 */
    /* JADX WARN: Type inference failed for: r6v484, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v490 */
    /* JADX WARN: Type inference failed for: r6v529 */
    /* JADX WARN: Type inference failed for: r6v533 */
    /* JADX WARN: Type inference failed for: r6v538 */
    /* JADX WARN: Type inference failed for: r6v539 */
    /* JADX WARN: Type inference failed for: r6v541, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v551 */
    /* JADX WARN: Type inference failed for: r6v552 */
    /* JADX WARN: Type inference failed for: r6v553 */
    /* JADX WARN: Type inference failed for: r6v582 */
    /* JADX WARN: Type inference failed for: r6v583 */
    /* JADX WARN: Type inference failed for: r6v584 */
    /* JADX WARN: Type inference failed for: r6v585 */
    /* JADX WARN: Type inference failed for: r6v586 */
    /* JADX WARN: Type inference failed for: r6v587 */
    /* JADX WARN: Type inference failed for: r6v588 */
    /* JADX WARN: Type inference failed for: r6v589 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v590 */
    /* JADX WARN: Type inference failed for: r6v591 */
    /* JADX WARN: Type inference failed for: r6v592 */
    /* JADX WARN: Type inference failed for: r6v593 */
    /* JADX WARN: Type inference failed for: r6v594 */
    /* JADX WARN: Type inference failed for: r6v595 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v237 */
    /* JADX WARN: Type inference failed for: r7v262 */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r8v102, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v151 */
    /* JADX WARN: Type inference failed for: r8v153 */
    /* JADX WARN: Type inference failed for: r8v154 */
    /* JADX WARN: Type inference failed for: r8v155, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v156 */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v158 */
    /* JADX WARN: Type inference failed for: r8v159 */
    /* JADX WARN: Type inference failed for: r8v183 */
    /* JADX WARN: Type inference failed for: r8v185 */
    /* JADX WARN: Type inference failed for: r8v186 */
    /* JADX WARN: Type inference failed for: r8v187 */
    /* JADX WARN: Type inference failed for: r8v188, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v189 */
    /* JADX WARN: Type inference failed for: r8v190 */
    /* JADX WARN: Type inference failed for: r8v194, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v211, types: [long] */
    /* JADX WARN: Type inference failed for: r8v212, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v213 */
    /* JADX WARN: Type inference failed for: r8v214 */
    /* JADX WARN: Type inference failed for: r8v215 */
    /* JADX WARN: Type inference failed for: r8v216 */
    /* JADX WARN: Type inference failed for: r8v234 */
    /* JADX WARN: Type inference failed for: r8v235 */
    /* JADX WARN: Type inference failed for: r8v247 */
    /* JADX WARN: Type inference failed for: r8v248 */
    /* JADX WARN: Type inference failed for: r8v249 */
    /* JADX WARN: Type inference failed for: r8v250 */
    /* JADX WARN: Type inference failed for: r8v251 */
    /* JADX WARN: Type inference failed for: r8v252 */
    /* JADX WARN: Type inference failed for: r8v253 */
    /* JADX WARN: Type inference failed for: r8v254 */
    /* JADX WARN: Type inference failed for: r8v255 */
    /* JADX WARN: Type inference failed for: r8v256 */
    /* JADX WARN: Type inference failed for: r8v257 */
    /* JADX WARN: Type inference failed for: r8v258 */
    /* JADX WARN: Type inference failed for: r8v259 */
    /* JADX WARN: Type inference failed for: r8v260 */
    /* JADX WARN: Type inference failed for: r8v261 */
    /* JADX WARN: Type inference failed for: r8v262 */
    /* JADX WARN: Type inference failed for: r8v263 */
    /* JADX WARN: Type inference failed for: r8v264 */
    /* JADX WARN: Type inference failed for: r8v265 */
    /* JADX WARN: Type inference failed for: r8v266 */
    /* JADX WARN: Type inference failed for: r8v267 */
    /* JADX WARN: Type inference failed for: r8v268 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v273, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v278 */
    /* JADX WARN: Type inference failed for: r9v279 */
    /* JADX WARN: Type inference failed for: r9v280 */
    /* JADX WARN: Type inference failed for: r9v281 */
    /* JADX WARN: Type inference failed for: r9v285 */
    /* JADX WARN: Type inference failed for: r9v286 */
    /* JADX WARN: Type inference failed for: r9v309 */
    /* JADX WARN: Type inference failed for: r9v310 */
    /* JADX WARN: Type inference failed for: r9v311 */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v97, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.withdraw.activity.WithdrawActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copydefault = 0;
        copydefault();
        int i = component2 + 45;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 23;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        ShareDataUIState = -890926529;
        component1 = new int[]{1618800961, 134619474, -2101503001, 847180063, -1568565635, 1015100015, -701514306, 2093433360, 1346981308, -2125113844, -91158541, 876260055, -1719384614, 868660148, -1083490776, -1620768128, 1541592409, -952580466};
    }
}
