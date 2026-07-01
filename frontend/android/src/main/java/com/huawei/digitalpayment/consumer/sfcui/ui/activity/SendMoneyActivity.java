package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyBinding;
import com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u0012\u001a\u00020\u0007H\u0014J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/SendMoneyActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivitySendMoneyBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "currentPosition", "", "titles", "", "", "tradeType", "businessType", "selectedTabIndex", "Landroidx/compose/runtime/MutableIntState;", "initToolbar", "", "title", "getLayoutId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initView", "needSoftFix", "", "initTab", "setupComposeTabs", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SendMoneyActivity extends Hilt_SendMoneyActivity<ActivitySendMoneyBinding, ViewModel> {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static long component1;
    private static int component2;
    private static char[] component3;
    private int currentPosition;
    private static final byte[] $$l = {102, Ascii.GS, -34, 39};
    private static final int $$o = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {Ascii.ETB, 124, -70, -17, -16, -2, 59, -63, 4, -19, 62, -55, -6, TarHeader.LF_LINK, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -55, -6, -20, 65, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -56, -11, -21, 72, -72, 9, -6, -6, -10, -3, 60, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -72, 9, -15, -3, -8, 6, -15, 1, -7, -11, 71, -28, -35, -19, 13, -9, 35, -47, -4, 39, -51, -4, -7, Ascii.GS, -23, -16, -8, Ascii.FF, -18, -5, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -55, -15, -1, 3, -3, -5, -3, 47, -55, -21, 5, -17, 13, -17, SignedBytes.MAX_POWER_OF_TWO, -55, -19, -4, 62, -23, -51, -4, Ascii.RS, -37, 7, -5, Base64.padSymbol, -18, 10, -17};
    private static final int $$t = 231;
    private static final byte[] $$d = {101, 74, 115, 66, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 105;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int copydefault = 1;
    private List<String> titles = CollectionsKt.emptyList();
    private String tradeType = "";
    private String businessType = "";
    private final MutableIntState selectedTabIndex = SnapshotIntStateKt.mutableIntStateOf(0);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r7, short r8, int r9) {
        /*
            int r8 = r8 + 4
            int r9 = 122 - r9
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.$$r(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 28 - r7
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r6 = 100 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.$$d
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.i(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 84 - r7
            int r8 = 105 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.$$s
            int r6 = r6 * 3
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = 83 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.j(byte, short, byte, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(SendMoneyActivity sendMoneyActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = sendMoneyActivity.binding;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = getAsAtTimestamp + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return binding;
        }
        throw null;
    }

    public static final MutableIntState access$getSelectedTabIndex$p(SendMoneyActivity sendMoneyActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 61;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableIntState mutableIntState = sendMoneyActivity.selectedTabIndex;
        int i5 = i2 + 23;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableIntState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final List access$getTitles$p(SendMoneyActivity sendMoneyActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = sendMoneyActivity.titles;
        int i5 = i2 + 13;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final void access$setCurrentPosition$p(SendMoneyActivity sendMoneyActivity, int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 89;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        sendMoneyActivity.currentPosition = i;
        int i6 = i4 + 21;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 71 / 0;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.send_money));
        int i4 = getRequestBeneficiariesState + 73;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 99;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_send_money;
            int i4 = 49 / 0;
        } else {
            i = R.layout.activity_send_money;
        }
        int i5 = getAsAtTimestamp + 123;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return i;
        }
        throw null;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 53;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 83;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7033, 34 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (63440 - (KeyEvent.getMaxKeyCode() >> 16)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.indexOf("", "", 0) + 51269), -1883291598, false, $$r(b2, b3, (byte) (b3 & 19)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void h(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component3[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 1759, KeyEvent.normalizeMetaState(0) + 34, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1159210934, false, $$r(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3609 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 29 - (Process.myPid() >> 22), (char) (7171 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1951385784, false, $$r(b4, b5, (byte) (b5 & 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 24, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27761), -1529629956, false, $$r(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 4013, 23 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 27761), -1529629956, false, $$r(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final SendMoneyActivity component2;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 67;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 103;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component3(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    List listAccess$getTitles$p = SendMoneyActivity.access$getTitles$p(this.component2);
                    int intValue = SendMoneyActivity.access$getSelectedTabIndex$p(this.component2).getIntValue();
                    final SendMoneyActivity sendMoneyActivity = this.component2;
                    SendMoneyActivityKt.access$SendMoneyTabs(companion, listAccess$getTitles$p, intValue, new Function1() {
                        private static int component1 = 1;
                        private static int component2;

                        @Override
                        public final Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = component1 + 41;
                            component2 = i4 % 128;
                            int i5 = i4 % 2;
                            Unit unitShareDataUIState = SendMoneyActivity.component1.AnonymousClass3.ShareDataUIState(sendMoneyActivity, ((Integer) obj).intValue());
                            int i6 = component1 + 119;
                            component2 = i6 % 128;
                            int i7 = i6 % 2;
                            return unitShareDataUIState;
                        }
                    }, composer, 70, 0);
                } else {
                    composer.skipToGroupEnd();
                    int i3 = copydefault + 39;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = copydefault + 73;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            private static final Unit copydefault(SendMoneyActivity sendMoneyActivity, int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 53;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sendMoneyActivity, "");
                    ((ActivitySendMoneyBinding) SendMoneyActivity.access$getBinding$p(sendMoneyActivity)).viewPager.getCurrentItem();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sendMoneyActivity, "");
                if (((ActivitySendMoneyBinding) SendMoneyActivity.access$getBinding$p(sendMoneyActivity)).viewPager.getCurrentItem() != i) {
                    int i4 = ShareDataUIState + 41;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    ((ActivitySendMoneyBinding) SendMoneyActivity.access$getBinding$p(sendMoneyActivity)).viewPager.setCurrentItem(i, true);
                }
                return Unit.INSTANCE;
            }

            public static Unit ShareDataUIState(SendMoneyActivity sendMoneyActivity, int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 3;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unitCopydefault = copydefault(sendMoneyActivity, i);
                int i5 = ShareDataUIState + 125;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass3(SendMoneyActivity sendMoneyActivity) {
                this.component2 = sendMoneyActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.component1
                int r1 = r1 + 33
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L14
                r13 = r13 & 74
                r1 = 5
                if (r13 != r1) goto L2c
                goto L18
            L14:
                r13 = r13 & 11
                if (r13 != r0) goto L2c
            L18:
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L1f
                goto L2c
            L1f:
                r12.skipToGroupEnd()
                int r12 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.ShareDataUIState
                int r12 = r12 + 97
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.component1 = r13
                int r12 = r12 % r0
                goto L4e
            L2c:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity$component1$3 r13 = new com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity$component1$3
                com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity r7 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.this
                r13.<init>(r7)
                r7 = 54
                r8 = -568814297(0xffffffffde189527, float:-2.7486842E18)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L4e:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.component1
                int r12 = r12 + 105
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.ShareDataUIState = r13
                int r12 = r12 % r0
                if (r12 == 0) goto L5d
                r12 = 58
                int r12 = r12 / 0
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.component1.component3(androidx.compose.runtime.Composer, int):void");
        }

        component1() {
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        g(KeyEvent.getDeadChar(0, 0) + 1, new char[]{31490, 20442, 31587, 64420, 18512, 39375, 22326, 52051, 8833, 32724, 64802, 38179, 51381, 50682, 39748, 32585, 30388, 43914, 16765, 55552, 7361, 29058}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{44483, 53669, 44462, 40281, 11615, 1959, 12794, 44615, 62539}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h((char) (61657 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 26 - View.MeasureSpec.getMode(0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(1) - 46, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() + 55039), 18 - View.getDefaultSize(0, 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953368_res_0x7f1306d8).substring(0, 6).codePointAt(5) - 90, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = getAsAtTimestamp + 125;
                getRequestBeneficiariesState = i4 % 128;
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
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myTid() >> 22), TextUtils.indexOf("", "", 0, 0) + 42, (char) (ViewConfiguration.getScrollBarSize() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 62126), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 63, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() + 43, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() - 1, new char[]{40525, 61524, 40575, 6286, 60315, 9803, 46155, 26843, 51089, 49159, 7695, 13989, 11687, 31329, 30833, 56550, 37808, 5213, 41559, 31437, 63950, 52815, 3088, 216, 24545, 26661, 30252, 44709, 34301, 564, 53396, 30033, 60175, 48003, 15058, 4892, 20765, 21943, 25787, 47400, 46948, 4087, 52989, 18245, 7446, 43487, 10393, 60675, 17167, 17406, 37537, 35647, 43321, 65005, 64745, 20856, 3718, 38683, 9498, 65486, 29843, 12548, 36713, 34298, 55978, 60194, 59762, 9191}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953980_res_0x7f13093c).substring(0, 4).codePointAt(2) - 35, new char[]{30078, 46423, 30030, 19670, 46610, 25418, 57368, 13575, 11427, 34054, 18950, 27514, 50832, 16231, 11387, 33085, 30861, 20824, 63065, 10053, 4779, 35615, 22597, 23814, 46288, 11639, 8828, 62249, 28354, 18224, 33950, 10456, 'n', 65163, 28303, 20113, 47662, 4282, 12515, 58611, 23555, 19188, 39596, 6858, 63089, 60626, 31937, 45196, 43114, 1777, 50942, 55012, 16991, 47339, 43187, 3242, 58803, 53776, 28948, 41501, 40951, 29777, 56112, 55417, 12700, 44588, 48425, 32308}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).length() + 71, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 91, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h((char) View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).length() + 5, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 135, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h((char) ((ViewConfiguration.getTapTimeout() >> 16) + 13770), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 34, TextUtils.getCapsMode("", 0, 0) + 170, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 6562, ((Process.getThreadPriority(0) + 20) >> 6) + 56, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int minimumFlingVelocity = 2405 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iAxisFromString = MotionEvent.axisFromString("") + 27;
            char cAlpha = (char) Color.alpha(0);
            Object[] objArr13 = new Object[1];
            i((byte) ($$e & 496), (byte) (-$$d[38]), r7[31], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iAxisFromString, cAlpha, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int iMyTid = (Process.myTid() >> 22) + 2405;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr = $$d;
                byte b2 = bArr[95];
                byte b3 = bArr[31];
                Object[] objArr14 = new Object[1];
                i((byte) 93, b2, b3, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, deadChar, doubleTapTimeout, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
            int i5 = getRequestBeneficiariesState + 7;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Object[] objArr15 = new Object[1];
            g(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{21946, 44432, 21968, 30088, 46868, 31626, 55560, 13316, 3192, 40347, 29451, 27175, 58885, 10221, 5397, 32804, 22541, 18907, 53079, 9804}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            h((char) TextUtils.indexOf("", ""), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 177, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 222664407};
                byte[] bArr2 = $$s;
                byte b4 = (byte) (bArr2[20] - 1);
                byte b5 = b4;
                Object[] objArr18 = new Object[1];
                j(b4, b5, (byte) (b5 | 102), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b6 = (byte) (bArr2[20] - 1);
                Object[] objArr19 = new Object[1];
                j(b6, (byte) (b6 | 73), (byte) (-bArr2[9]), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 2405;
                    int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    i((byte) 93, bArr3[95], bArr3[31], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, tapTimeout, cNormalizeMetaState, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(Color.alpha(0) + 1, new char[]{39970, 6985, 40003, 25345, 28903, 52572, 53139, 62436, 50593, 11079, 25991, 44436, 12181, 37225, 993, 18429, 37279, 65285, 55759, 57783, 64511, 9505, 30667, 39849, 24029, 33589}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).codePointAt(0) + 15877), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 14, View.resolveSize(0, 0) + 222, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int packedPositionType = 2405 - ExpandableListView.getPackedPositionType(0L);
                        int iAlpha = 26 - Color.alpha(0);
                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        byte b7 = $$d[33];
                        Object[] objArr23 = new Object[1];
                        i((byte) 84, b7, b7, objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, iAlpha, tapTimeout2, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2405;
                        int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                        char mode = (char) View.MeasureSpec.getMode(0);
                        byte b8 = (byte) ($$e & 496);
                        byte[] bArr4 = $$d;
                        byte b9 = (byte) (-bArr4[38]);
                        byte b10 = bArr4[31];
                        Object[] objArr24 = new Object[1];
                        i(b8, b9, b10, objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, edgeSlop, mode, -2047739879, false, (String) objArr24[0], null);
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
        int i7 = ((int[]) objArr[0])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) (Process.myPid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i9 = getRequestBeneficiariesState + 29;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr25 = {2126419812, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 56 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8));
                byte b11 = (byte) ($$s[20] - 1);
                Object[] objArr26 = new Object[1];
                j(b11, (byte) (b11 | 74), r4[41], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        initTab();
        initView();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initView() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.getAsAtTimestamp
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            java.lang.String r2 = "sfc_send_money"
            java.lang.String r3 = "isFromNfc"
            java.lang.String r4 = "functionId"
            if (r1 != 0) goto L66
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r1 = r1.getStringExtra(r4)
            android.content.Intent r4 = r5.getIntent()
            java.lang.String r3 = r4.getStringExtra(r3)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r1 == 0) goto L2b
            goto L50
        L2b:
            java.lang.String r1 = "QrCode"
            java.lang.String r2 = r5.tradeType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L48
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.getRequestBeneficiariesState
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r0 = "TransferPochi"
            java.lang.String r1 = r5.businessType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L50
        L48:
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L5b
        L50:
            Binding extends androidx.databinding.ViewDataBinding r0 = r5.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyBinding r0 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyBinding) r0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.viewPager
            r1 = 0
            r0.setCurrentItem(r1)
            goto L65
        L5b:
            Binding extends androidx.databinding.ViewDataBinding r0 = r5.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyBinding r0 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyBinding) r0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.viewPager
            r1 = 1
            r0.setCurrentItem(r1)
        L65:
            return
        L66:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r4)
            android.content.Intent r1 = r5.getIntent()
            r1.getStringExtra(r3)
            kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.initView():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initTab() {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.initTab():void");
    }

    private final void setupComposeTabs() {
        int i = 2 % 2;
        ((ActivitySendMoneyBinding) this.binding).composeTabs.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        ((ActivitySendMoneyBinding) this.binding).composeTabs.setContent(ComposableLambdaKt.composableLambdaInstance(548811306, true, new component1()));
        int i2 = getRequestBeneficiariesState + 35;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 61543), Color.rgb(0, 0, 0) + 16777242, TextUtils.indexOf("", "", 0, 0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55040), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() + 15, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = getAsAtTimestamp + 5;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = getAsAtTimestamp + 47;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6570, 43 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.blue(0) + 56, (char) (MotionEvent.axisFromString("") + 1), -699576857, false, "component2", new Class[]{Context.class});
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
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 3;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61658), 25 - TextUtils.lastIndexOf("", '0'), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) - 32, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952721_res_0x7f130451).substring(6, 7).length() + 55040), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 20, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getTouchSlop() >> 8), 42 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) TextUtils.indexOf("", "", 0, 0), -960739708, false, "component3", new Class[]{Context.class});
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
        int i4 = getRequestBeneficiariesState + 27;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01b0 A[PHI: r14
  0x01b0: PHI (r14v111 int) = (r14v21 int), (r14v114 int), (r14v116 int) binds: [B:25:0x01e5, B:9:0x01ad, B:7:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01bc A[PHI: r14
  0x01bc: PHI (r14v21 int) = (r14v20 int), (r14v157 int), (r14v158 int) binds: [B:3:0x0197, B:9:0x01ad, B:7:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08db A[Catch: all -> 0x0416, TryCatch #59 {all -> 0x0416, blocks: (B:712:0x2d99, B:714:0x2d9f, B:715:0x2dc6, B:746:0x30eb, B:748:0x30f1, B:749:0x3119, B:783:0x3426, B:785:0x342c, B:786:0x3450, B:763:0x3268, B:765:0x328b, B:766:0x32de, B:806:0x352a, B:808:0x3530, B:809:0x3554, B:811:0x358e, B:812:0x35d7, B:564:0x25bb, B:566:0x25d0, B:567:0x2606, B:546:0x22c6, B:548:0x22cc, B:549:0x22f7, B:551:0x2331, B:552:0x2376, B:516:0x1f64, B:518:0x1f79, B:519:0x1fa8, B:521:0x1fdc, B:522:0x2057, B:496:0x1cd4, B:498:0x1cda, B:499:0x1d00, B:351:0x1557, B:353:0x155d, B:354:0x1585, B:282:0x10a1, B:284:0x10a7, B:285:0x10d4, B:193:0x0aff, B:195:0x0b05, B:196:0x0b2e, B:147:0x08d5, B:149:0x08db, B:150:0x0906, B:27:0x01ea, B:29:0x01f0, B:30:0x021a, B:32:0x0382, B:34:0x03b3, B:35:0x0410), top: B:938:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09c8 A[Catch: all -> 0x0a91, TryCatch #58 {all -> 0x0a91, blocks: (B:168:0x09b3, B:170:0x09c8, B:171:0x09f9), top: B:936:0x09b3, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0a0c A[Catch: all -> 0x0a87, TryCatch #54 {all -> 0x0a87, blocks: (B:172:0x09ff, B:174:0x0a0c, B:175:0x0a7f), top: B:928:0x09ff, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0bb6 A[Catch: all -> 0x0fc6, TryCatch #23 {all -> 0x0fc6, blocks: (B:200:0x0bb0, B:202:0x0bb6, B:203:0x0bfa, B:205:0x0c07, B:207:0x0c10, B:208:0x0c50, B:232:0x0e69, B:233:0x0e6d, B:235:0x0e73, B:238:0x0e8d, B:241:0x0e9a, B:244:0x0ea7, B:256:0x0f9c, B:258:0x0fa2, B:259:0x0fa3, B:261:0x0fa5, B:263:0x0fac, B:264:0x0fad, B:209:0x0c5b, B:221:0x0d4c, B:223:0x0d52, B:224:0x0d92, B:226:0x0dbc, B:228:0x0e01, B:230:0x0e17, B:231:0x0e61, B:267:0x0fb3, B:269:0x0fba, B:270:0x0fbb, B:272:0x0fbd, B:274:0x0fc4, B:275:0x0fc5, B:247:0x0ed6, B:249:0x0edc, B:250:0x0f0a, B:216:0x0cc3, B:218:0x0cd8, B:219:0x0d40, B:211:0x0c7b, B:213:0x0c90, B:214:0x0cbc, B:252:0x0f1c), top: B:872:0x0bb0, outer: #44, inners: #5, #11, #17, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0c07 A[Catch: all -> 0x0fc6, TryCatch #23 {all -> 0x0fc6, blocks: (B:200:0x0bb0, B:202:0x0bb6, B:203:0x0bfa, B:205:0x0c07, B:207:0x0c10, B:208:0x0c50, B:232:0x0e69, B:233:0x0e6d, B:235:0x0e73, B:238:0x0e8d, B:241:0x0e9a, B:244:0x0ea7, B:256:0x0f9c, B:258:0x0fa2, B:259:0x0fa3, B:261:0x0fa5, B:263:0x0fac, B:264:0x0fad, B:209:0x0c5b, B:221:0x0d4c, B:223:0x0d52, B:224:0x0d92, B:226:0x0dbc, B:228:0x0e01, B:230:0x0e17, B:231:0x0e61, B:267:0x0fb3, B:269:0x0fba, B:270:0x0fbb, B:272:0x0fbd, B:274:0x0fc4, B:275:0x0fc5, B:247:0x0ed6, B:249:0x0edc, B:250:0x0f0a, B:216:0x0cc3, B:218:0x0cd8, B:219:0x0d40, B:211:0x0c7b, B:213:0x0c90, B:214:0x0cbc, B:252:0x0f1c), top: B:872:0x0bb0, outer: #44, inners: #5, #11, #17, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0c5b A[Catch: all -> 0x0fc6, TRY_LEAVE, TryCatch #23 {all -> 0x0fc6, blocks: (B:200:0x0bb0, B:202:0x0bb6, B:203:0x0bfa, B:205:0x0c07, B:207:0x0c10, B:208:0x0c50, B:232:0x0e69, B:233:0x0e6d, B:235:0x0e73, B:238:0x0e8d, B:241:0x0e9a, B:244:0x0ea7, B:256:0x0f9c, B:258:0x0fa2, B:259:0x0fa3, B:261:0x0fa5, B:263:0x0fac, B:264:0x0fad, B:209:0x0c5b, B:221:0x0d4c, B:223:0x0d52, B:224:0x0d92, B:226:0x0dbc, B:228:0x0e01, B:230:0x0e17, B:231:0x0e61, B:267:0x0fb3, B:269:0x0fba, B:270:0x0fbb, B:272:0x0fbd, B:274:0x0fc4, B:275:0x0fc5, B:247:0x0ed6, B:249:0x0edc, B:250:0x0f0a, B:216:0x0cc3, B:218:0x0cd8, B:219:0x0d40, B:211:0x0c7b, B:213:0x0c90, B:214:0x0cbc, B:252:0x0f1c), top: B:872:0x0bb0, outer: #44, inners: #5, #11, #17, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0e73 A[Catch: all -> 0x0fc6, TryCatch #23 {all -> 0x0fc6, blocks: (B:200:0x0bb0, B:202:0x0bb6, B:203:0x0bfa, B:205:0x0c07, B:207:0x0c10, B:208:0x0c50, B:232:0x0e69, B:233:0x0e6d, B:235:0x0e73, B:238:0x0e8d, B:241:0x0e9a, B:244:0x0ea7, B:256:0x0f9c, B:258:0x0fa2, B:259:0x0fa3, B:261:0x0fa5, B:263:0x0fac, B:264:0x0fad, B:209:0x0c5b, B:221:0x0d4c, B:223:0x0d52, B:224:0x0d92, B:226:0x0dbc, B:228:0x0e01, B:230:0x0e17, B:231:0x0e61, B:267:0x0fb3, B:269:0x0fba, B:270:0x0fbb, B:272:0x0fbd, B:274:0x0fc4, B:275:0x0fc5, B:247:0x0ed6, B:249:0x0edc, B:250:0x0f0a, B:216:0x0cc3, B:218:0x0cd8, B:219:0x0d40, B:211:0x0c7b, B:213:0x0c90, B:214:0x0cbc, B:252:0x0f1c), top: B:872:0x0bb0, outer: #44, inners: #5, #11, #17, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x115e A[Catch: all -> 0x14cc, TryCatch #27 {all -> 0x14cc, blocks: (B:289:0x1158, B:291:0x115e, B:292:0x11a3, B:294:0x11b0, B:296:0x11b9, B:297:0x11f9, B:317:0x13b3, B:325:0x141f, B:331:0x14b0, B:333:0x14b6, B:334:0x14b7, B:336:0x14b9, B:338:0x14c0, B:339:0x14c1, B:299:0x1205, B:306:0x128f, B:308:0x1295, B:309:0x12d9, B:311:0x1303, B:313:0x134d, B:315:0x1364, B:316:0x13a9, B:341:0x14c3, B:343:0x14ca, B:344:0x14cb, B:327:0x142f, B:321:0x13e7, B:323:0x13ed, B:324:0x1418, B:301:0x1225, B:303:0x1237, B:304:0x1283), top: B:878:0x1158, outer: #44, inners: #10, #15, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x11b0 A[Catch: all -> 0x14cc, TryCatch #27 {all -> 0x14cc, blocks: (B:289:0x1158, B:291:0x115e, B:292:0x11a3, B:294:0x11b0, B:296:0x11b9, B:297:0x11f9, B:317:0x13b3, B:325:0x141f, B:331:0x14b0, B:333:0x14b6, B:334:0x14b7, B:336:0x14b9, B:338:0x14c0, B:339:0x14c1, B:299:0x1205, B:306:0x128f, B:308:0x1295, B:309:0x12d9, B:311:0x1303, B:313:0x134d, B:315:0x1364, B:316:0x13a9, B:341:0x14c3, B:343:0x14ca, B:344:0x14cb, B:327:0x142f, B:321:0x13e7, B:323:0x13ed, B:324:0x1418, B:301:0x1225, B:303:0x1237, B:304:0x1283), top: B:878:0x1158, outer: #44, inners: #10, #15, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1205 A[Catch: all -> 0x14cc, TRY_LEAVE, TryCatch #27 {all -> 0x14cc, blocks: (B:289:0x1158, B:291:0x115e, B:292:0x11a3, B:294:0x11b0, B:296:0x11b9, B:297:0x11f9, B:317:0x13b3, B:325:0x141f, B:331:0x14b0, B:333:0x14b6, B:334:0x14b7, B:336:0x14b9, B:338:0x14c0, B:339:0x14c1, B:299:0x1205, B:306:0x128f, B:308:0x1295, B:309:0x12d9, B:311:0x1303, B:313:0x134d, B:315:0x1364, B:316:0x13a9, B:341:0x14c3, B:343:0x14ca, B:344:0x14cb, B:327:0x142f, B:321:0x13e7, B:323:0x13ed, B:324:0x1418, B:301:0x1225, B:303:0x1237, B:304:0x1283), top: B:878:0x1158, outer: #44, inners: #10, #15, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x13c5  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x166d A[Catch: all -> 0x1c50, PHI: r1
  0x166d: PHI (r1v567 java.lang.Object) = (r1v560 java.lang.Object), (r1v565 java.lang.Object) binds: [B:359:0x1618, B:360:0x161a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x1c50, blocks: (B:358:0x1614, B:365:0x166d), top: B:881:0x1614 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x16e6  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x16fe  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1754  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1af7 A[Catch: all -> 0x1c23, TryCatch #3 {all -> 0x1c23, blocks: (B:432:0x1ae8, B:433:0x1aec, B:436:0x1af7, B:439:0x1b13, B:421:0x1a17, B:427:0x1a81, B:431:0x1ae0), top: B:833:0x1a17 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1cda A[Catch: all -> 0x0416, TryCatch #59 {all -> 0x0416, blocks: (B:712:0x2d99, B:714:0x2d9f, B:715:0x2dc6, B:746:0x30eb, B:748:0x30f1, B:749:0x3119, B:783:0x3426, B:785:0x342c, B:786:0x3450, B:763:0x3268, B:765:0x328b, B:766:0x32de, B:806:0x352a, B:808:0x3530, B:809:0x3554, B:811:0x358e, B:812:0x35d7, B:564:0x25bb, B:566:0x25d0, B:567:0x2606, B:546:0x22c6, B:548:0x22cc, B:549:0x22f7, B:551:0x2331, B:552:0x2376, B:516:0x1f64, B:518:0x1f79, B:519:0x1fa8, B:521:0x1fdc, B:522:0x2057, B:496:0x1cd4, B:498:0x1cda, B:499:0x1d00, B:351:0x1557, B:353:0x155d, B:354:0x1585, B:282:0x10a1, B:284:0x10a7, B:285:0x10d4, B:193:0x0aff, B:195:0x0b05, B:196:0x0b2e, B:147:0x08d5, B:149:0x08db, B:150:0x0906, B:27:0x01ea, B:29:0x01f0, B:30:0x021a, B:32:0x0382, B:34:0x03b3, B:35:0x0410), top: B:938:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1d8e  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x1dfc  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1e56  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x1f44  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x2199  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x2286  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x2462  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x24b4  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x2599  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x274b  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x28b7  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x2902  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x291a  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x2967  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x2bc2 A[Catch: all -> 0x2d03, TryCatch #51 {all -> 0x2d03, blocks: (B:602:0x2904, B:654:0x2bb8, B:655:0x2bbc, B:657:0x2bc2, B:660:0x2bdd, B:622:0x2981, B:642:0x2aa2, B:646:0x2ae7, B:649:0x2b56, B:653:0x2bb2), top: B:922:0x2904 }] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x2d9f A[Catch: all -> 0x0416, TryCatch #59 {all -> 0x0416, blocks: (B:712:0x2d99, B:714:0x2d9f, B:715:0x2dc6, B:746:0x30eb, B:748:0x30f1, B:749:0x3119, B:783:0x3426, B:785:0x342c, B:786:0x3450, B:763:0x3268, B:765:0x328b, B:766:0x32de, B:806:0x352a, B:808:0x3530, B:809:0x3554, B:811:0x358e, B:812:0x35d7, B:564:0x25bb, B:566:0x25d0, B:567:0x2606, B:546:0x22c6, B:548:0x22cc, B:549:0x22f7, B:551:0x2331, B:552:0x2376, B:516:0x1f64, B:518:0x1f79, B:519:0x1fa8, B:521:0x1fdc, B:522:0x2057, B:496:0x1cd4, B:498:0x1cda, B:499:0x1d00, B:351:0x1557, B:353:0x155d, B:354:0x1585, B:282:0x10a1, B:284:0x10a7, B:285:0x10d4, B:193:0x0aff, B:195:0x0b05, B:196:0x0b2e, B:147:0x08d5, B:149:0x08db, B:150:0x0906, B:27:0x01ea, B:29:0x01f0, B:30:0x021a, B:32:0x0382, B:34:0x03b3, B:35:0x0410), top: B:938:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:720:0x2e57  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x2eac  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2f13  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x30cc  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x31b2  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x31fc  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x324a  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x3406  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x34ee  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x098e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:890:0x1694 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x161a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:964:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v199 */
    /* JADX WARN: Type inference failed for: r10v200, types: [long] */
    /* JADX WARN: Type inference failed for: r10v201 */
    /* JADX WARN: Type inference failed for: r10v203 */
    /* JADX WARN: Type inference failed for: r10v220 */
    /* JADX WARN: Type inference failed for: r10v223 */
    /* JADX WARN: Type inference failed for: r10v224 */
    /* JADX WARN: Type inference failed for: r10v232 */
    /* JADX WARN: Type inference failed for: r10v233 */
    /* JADX WARN: Type inference failed for: r10v234 */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v104 */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v110 */
    /* JADX WARN: Type inference failed for: r12v111 */
    /* JADX WARN: Type inference failed for: r12v112 */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r14v100, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v117 */
    /* JADX WARN: Type inference failed for: r14v118 */
    /* JADX WARN: Type inference failed for: r14v119 */
    /* JADX WARN: Type inference failed for: r14v120 */
    /* JADX WARN: Type inference failed for: r14v121 */
    /* JADX WARN: Type inference failed for: r14v122 */
    /* JADX WARN: Type inference failed for: r14v123 */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v125 */
    /* JADX WARN: Type inference failed for: r14v126 */
    /* JADX WARN: Type inference failed for: r14v127 */
    /* JADX WARN: Type inference failed for: r14v128 */
    /* JADX WARN: Type inference failed for: r14v129 */
    /* JADX WARN: Type inference failed for: r14v130 */
    /* JADX WARN: Type inference failed for: r14v131 */
    /* JADX WARN: Type inference failed for: r14v132 */
    /* JADX WARN: Type inference failed for: r14v133 */
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
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r1v687, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v27 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v31 */
    /* JADX WARN: Type inference failed for: r26v32 */
    /* JADX WARN: Type inference failed for: r26v33 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v39 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v40 */
    /* JADX WARN: Type inference failed for: r26v41 */
    /* JADX WARN: Type inference failed for: r26v42 */
    /* JADX WARN: Type inference failed for: r26v43 */
    /* JADX WARN: Type inference failed for: r26v44 */
    /* JADX WARN: Type inference failed for: r26v49 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v50 */
    /* JADX WARN: Type inference failed for: r26v51 */
    /* JADX WARN: Type inference failed for: r26v52 */
    /* JADX WARN: Type inference failed for: r26v53 */
    /* JADX WARN: Type inference failed for: r27v129 */
    /* JADX WARN: Type inference failed for: r27v130 */
    /* JADX WARN: Type inference failed for: r27v131 */
    /* JADX WARN: Type inference failed for: r27v132 */
    /* JADX WARN: Type inference failed for: r27v133 */
    /* JADX WARN: Type inference failed for: r27v134 */
    /* JADX WARN: Type inference failed for: r27v135 */
    /* JADX WARN: Type inference failed for: r27v136 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v37 */
    /* JADX WARN: Type inference failed for: r27v40 */
    /* JADX WARN: Type inference failed for: r27v41 */
    /* JADX WARN: Type inference failed for: r27v42 */
    /* JADX WARN: Type inference failed for: r27v43 */
    /* JADX WARN: Type inference failed for: r27v51 */
    /* JADX WARN: Type inference failed for: r27v52 */
    /* JADX WARN: Type inference failed for: r27v53 */
    /* JADX WARN: Type inference failed for: r27v54 */
    /* JADX WARN: Type inference failed for: r27v55 */
    /* JADX WARN: Type inference failed for: r27v56 */
    /* JADX WARN: Type inference failed for: r27v60 */
    /* JADX WARN: Type inference failed for: r27v62 */
    /* JADX WARN: Type inference failed for: r27v64 */
    /* JADX WARN: Type inference failed for: r27v67 */
    /* JADX WARN: Type inference failed for: r27v68 */
    /* JADX WARN: Type inference failed for: r27v69 */
    /* JADX WARN: Type inference failed for: r27v71 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v367 */
    /* JADX WARN: Type inference failed for: r3v368 */
    /* JADX WARN: Type inference failed for: r3v369 */
    /* JADX WARN: Type inference failed for: r3v382 */
    /* JADX WARN: Type inference failed for: r3v383 */
    /* JADX WARN: Type inference failed for: r7v479, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v116 */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v125, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v130 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v132 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v192 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v203 */
    /* JADX WARN: Type inference failed for: r9v204 */
    /* JADX WARN: Type inference failed for: r9v205 */
    /* JADX WARN: Type inference failed for: r9v206 */
    /* JADX WARN: Type inference failed for: r9v207 */
    /* JADX WARN: Type inference failed for: r9v208 */
    /* JADX WARN: Type inference failed for: r9v209 */
    /* JADX WARN: Type inference failed for: r9v210 */
    /* JADX WARN: Type inference failed for: r9v211 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        component2 = 0;
        component2();
        int i = copydefault + 95;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean needSoftFix() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 103;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        ShareDataUIState = -1272389028258120982L;
        component3 = new char[]{64717, 5725, 10742, 17155, 22207, 27102, 33650, 38619, 43061, 49995, 55018, 59479, 921, 5852, 10346, 17300, 21802, 26698, 33782, 38168, 43156, 50127, 54644, 59520, 549, 5455, 56084, 12701, 3643, 25816, 29038, 19970, 42169, 45423, 36863, 58512, 61741, 53195, 9312, 12549, 4017, 25679, 29416, 20374, 65209, 5246, 11223, 16739, 21650, 27636, 33025, 38116, 43536, 49452, 54488, 59956, 405, 5368, 10767, 16831, 22346, 27238, 33219, 38688, 43733, 49632, 55108, 60148, 4, 5991, 10904, 16425, 22494, 27322, 32796, 38911, 44381, 49350, 55286, 60756, Typography.paragraph, 5658, 11553, 16512, 22070, 28059, 33022, 38488, 44472, 49948, 54910, 60811, 3102, 59037, 55612, 46043, 42617, 39255, 29667, 26112, 22712, 13268, 9848, 6292, 62257, 58883, 55536, 45842, 42423, 39119, 29546, 25993, 22574, 13130, 9663, 6237, 62128, 58757, 55352, 45761, 42359, 38932, 29344, 25940, 24567, 12922, 9500, 8165, 62029, 58616, 57229, 45629, 42186, 40818, 29201, 25782, 24387, 12791, 9345, 8041, 61893, 58486, 57109, 45556, 42075, 40685, 29077, 25712, 24279, 12671, 9239, 7862, 61761, 60385, 57051, 45345, 43908, 40454, 28909, 27549, 24111, 12483, 11128, 7708, 3151, 59079, 55673, 45983, 42532, 39262, 14808, 54034, 60643, 34391, 37876, 44180, 18020, 21459, 28009, 1563, 5050, 11601, 50936, 54146, 60730, 34520, 36985, 44293, 18111, 20496, 28132, 1671, 4212, 11736, 51042, 53342, 60846, 34588, 37088, 44427, 18215, 20683, 27197, 2039, 4245, 10801, 3103, 59021, 55597, 46021, 42622, 39172, 29624, 26198, 22726, 13184, 9779, 6347, 62273, 58890, 55456, 45890, 12854, 55456, 59148, 36350, 39004, 42797, 19853, 22616, 26318, 3493, 6153, 9970, 52558, 55341, 59012, 32795, 27266, 21800, 16326, 10858, 5378, 65442, 59972, 54510, 49038, 43561, 3088, 59088, 55596, 45979, 42601, 39183, 29613, 26136, 22765, 13269, 9765, 6337, 62263, 58966, 55541, 45891, 42416, 39116, 29502, 25997, 22651, 13086, 9656, 6155, 62124, 58823, 55399, 45783, 42352, 38982, 29362, 25861, 24495, 12909, 9553, 8191, 61970, 58555, 57305, 45687, 42187, 40754, 29265, 25765, 24385, 12724, 9349, 8051, 61888, 58400, 57118, 45497, 41993, 40696, 29080, 25702, 24285, 12661, 9289, 7908, 61698, 60324, 56983, 45364, 47429, 21460, 27687, 1728, 4915, 11270, 50928, 54080, 60903, 34522, 37746, 44446, 17982, 21258, 28074, 1609, 4281, 11712, 50794, 53380, 60710, 34375, 37090, 44372, 18349, 20682, 27960, 1929, 4137, 11546, 51180, 53263, 60069, 34608, 36954, 43768, 18199, 20915, 27358, 1909, 4503, 10810, 50956, 53757, 59932, 33978, 37338, 43566, 17563, 20850, 27159, 1257, 4359, 11254, 50325, 53604, 60370, 33917, 37192, 44012, 17422, 24317, 27546, 1131, 3138, 59099, 55665, 45983, 42547, 39259, 29691, 26141, 22711, 13271};
        component1 = 8937747041042753257L;
    }
}
