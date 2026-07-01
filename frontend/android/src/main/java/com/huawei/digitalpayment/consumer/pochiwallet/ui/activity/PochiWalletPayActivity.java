package com.huawei.digitalpayment.consumer.pochiwallet.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import androidx.lifecycle.ViewModel;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.plus.security.lite.SecLiteException;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.adapter.PochiAdapter;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ActivityPochiWalletPayBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0003J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/activity/PochiWalletPayActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfcpochiwallet/databinding/ActivityPochiWalletPayBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "getLayoutId", "", "currentPosition", "titles", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initTab", "updateTabView", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "selected", "", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class PochiWalletPayActivity extends Hilt_PochiWalletPayActivity<ActivityPochiWalletPayBinding, ViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component1;
    private static int component2;
    private static long component3;
    private static short[] component4;
    private static int copydefault;
    private static byte[] equals;
    private static int getRequestBeneficiariesState;
    private int currentPosition;
    private List<String> titles = new ArrayList();
    private static final byte[] $$l = {106, -23, Ascii.FF, -128};
    private static final int $$o = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {119, -40, Ascii.DLE, 123, 8, -6, -67, TarHeader.LF_DIR, 4, -4, -12, 1, -11, -59, 72, -6, -19, 1, -11, -61, 62, -16, -2, -54, -7, 2, -13, TarHeader.LF_SYMLINK, -3, -6, 8, -15, -3, 9, -72, Ascii.DLE, Ascii.ESC, 13, -19, 8, -15, -3, -28, 20, Ascii.VT, -23, -1, -7, Ascii.SI, -23, 17, -11, 13, -17, -37, Ascii.EM, Ascii.SI, -23, -16, -16, 6, Ascii.GS, -23, Ascii.SI, -19, 8, -6, -1, -5, -5, -13, 5, 2, -69, 8, -6, -67, 66, -22, Ascii.SI, -10, -5, -3, -6, -2, -69, 68, -17, -8, Ascii.SO, -11, -19, 2, -6, 9, -18, 7, 1, -5, -14, 1, -14, 1, -10, -6, Ascii.SI, -9, -1, -72, 32, -50, 68, -15, 20, -14, 2, -5, 8, -3, 5, -25, -3, -3, -9, Ascii.DLE, -13, 4};
    private static final int $$t = 117;
    private static final byte[] $$d = {Ascii.VT, -55, -20, -91, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 146;
    private static int getShareableDataState = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, short r7, byte r8) {
        /*
            int r7 = r7 + 112
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.$$l
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.$$r(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.$$d
            int r8 = r8 + 4
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = 103 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.i(short, byte, short, java.lang.Object[]):void");
    }

    private static void j(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = 116 - i;
        byte[] bArr = $$s;
        int i3 = 99 - (b3 * Ascii.DLE);
        byte[] bArr2 = new byte[47 - b2];
        int i4 = 46 - b2;
        int i5 = -1;
        if (bArr == null) {
            i3 = i3 + i4 + 4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i2++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + bArr[i2] + 4;
        }
    }

    public static final void access$setCurrentPosition$p(PochiWalletPayActivity pochiWalletPayActivity, int i) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 5;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        pochiWalletPayActivity.currentPosition = i;
        int i6 = i3 + 25;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
    }

    public static final void access$updateTabView(PochiWalletPayActivity pochiWalletPayActivity, TabLayout.Tab tab, boolean z) {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        pochiWalletPayActivity.updateTabView(tab, z);
        int i4 = getAsAtTimestamp + 17;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 77;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.activity_pochi_wallet_pay;
            throw null;
        }
        int i4 = R.layout.activity_pochi_wallet_pay;
        int i5 = copy + 81;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    private static void g(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 41;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1758, 33 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1159210934, false, $$r(b2, (byte) (b2 | 9), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component3), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 3608, 29 - ExpandableListView.getPackedPositionType(0L), (char) (7171 - Gravity.getAbsoluteGravity(0, 0)), 1951385784, false, $$r(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 4013, Color.green(0) + 24, (char) ((-16749455) - Color.rgb(0, 0, 0)), -1529629956, false, $$r(b5, (byte) (b5 | 10), b5), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        int i7 = $11 + 85;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (cancelnotification.copydefault < i2) {
            int i9 = $10 + 85;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 4013, 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$r(b6, (byte) (b6 | 10), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void h(byte b2, int i, int i2, int i3, short s, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') - 17, (char) (61685 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1874745193, false, $$r(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 41;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = equals;
                long j = 0;
                if (bArr2 != null) {
                    int i8 = $11 + 69;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int keyRepeatDelay = 2984 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i10 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 47;
                            char cIndexOf = (char) (54462 - TextUtils.indexOf("", ""));
                            byte length2 = (byte) $$l.length;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, i10, cIndexOf, -1178636483, false, $$r((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = equals;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 999, 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (61686 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1874745193, false, $$r(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component4[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ 7083766810336261929L));
                if (z) {
                    int i12 = $11 + 15;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i11 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), -1454191902, false, $$r(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = equals;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 97;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i17 = $10 + 113;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component4;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        g((char) (TextUtils.indexOf("", "") + 6562), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).length() - 1, 18 - KeyEvent.normalizeMetaState(0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) - 49), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(0) - 31, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 651452530, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 100, (-1294593744) - TextUtils.getCapsMode("", 0, 0), (short) (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 114), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).codePointAt(0) - 9, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (!(!(baseContext instanceof ContextWrapper))) {
                    int i4 = copy + 119;
                    getAsAtTimestamp = i4 % 128;
                    if (i4 % 2 == 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() == null) {
                        int i5 = getAsAtTimestamp + 119;
                        copy = i5 % 128;
                        int i6 = i5 % 2;
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 6618, 41 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) TextUtils.getOffsetAfter("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
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
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) + 46977), (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.safaricom.mpesa.lifestyle.R.integer._2131427364_res_0x7f0b0024) & (-3)) + 40, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() - 2), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 89, 64 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    h((byte) (Process.myPid() >> 22), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 651452626, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) - 215, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 1294593892, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 111), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) + 651452687, (-100) - TextUtils.getOffsetAfter("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1294593738, (short) (ViewConfiguration.getScrollBarSize() >> 8), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) + 651452759, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + SecLiteException.ERROR_API_KEY_OR_SIGN, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(1) - 1294593899, (short) ExpandableListView.getPackedPositionType(0L), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 15780), TextUtils.indexOf("", "") + 153, 36 - (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6562, 55 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2404;
            int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25;
            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            i(bArr[33], bArr[12], bArr[31], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7, i8, mirror, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int packedPositionType = 2405 - ExpandableListView.getPackedPositionType(0L);
                int iResolveSize = View.resolveSize(0, 0) + 26;
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                byte[] bArr2 = $$d;
                byte b2 = bArr2[8];
                byte b3 = bArr2[31];
                Object[] objArr14 = new Object[1];
                i(b2, b3, b3, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, iResolveSize, cAxisFromString, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h((byte) (ViewConfiguration.getLongPressTimeout() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 651452768, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 209, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() - 1294593737, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g((char) (TextUtils.indexOf("", "", 0) + 54412), 189 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16 - (Process.myPid() >> 22), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -228687563};
                byte[] bArr3 = $$s;
                byte b4 = (byte) (bArr3[11] - 1);
                byte b5 = b4;
                Object[] objArr18 = new Object[1];
                j(b4, b5, (byte) (b5 | 113), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                j((byte) (bArr3[109] - 1), bArr3[11], (byte) (-bArr3[6]), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 2405;
                    int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr4 = $$d;
                    byte b6 = bArr4[8];
                    byte b7 = bArr4[31];
                    Object[] objArr20 = new Object[1];
                    i(b6, b7, b7, objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iLastIndexOf, fadingEdgeLength, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 108), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 651452784, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 129, KeyEvent.normalizeMetaState(0) - 1294593744, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), 651452835 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 129, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).length() - 1294593741, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() - 4), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        Object[] objArr23 = new Object[1];
                        i((byte) (-$$d[38]), r7[0], r7[33], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 2406, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int i9 = 2406 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr5 = $$d;
                        Object[] objArr24 = new Object[1];
                        i(bArr5[33], bArr5[12], bArr5[31], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i9, absoluteGravity, minimumFlingVelocity, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 6619, 42 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-230861294, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6562, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 56, (char) Color.blue(0));
                byte[] bArr6 = $$s;
                byte b8 = (byte) (-bArr6[54]);
                byte b9 = (byte) (bArr6[11] - 1);
                Object[] objArr26 = new Object[1];
                j(b8, b9, (byte) (b9 | TarHeader.LF_BLK), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i12 = getAsAtTimestamp + 105;
                copy = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        initToolbar(getString(R.string.pochi_pay));
        initTab();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[PHI: r1 r2
  0x004a: PHI (r1v8 android.view.View) = (r1v7 android.view.View), (r1v13 android.view.View) binds: [B:8:0x0048, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r2v5 com.huawei.common.widget.round.RoundTextView) = (r2v4 com.huawei.common.widget.round.RoundTextView), (r2v8 com.huawei.common.widget.round.RoundTextView) binds: [B:8:0x0048, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void initTab$lambda$0(com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity r4, com.google.android.material.tabs.TabLayout.Tab r5, int r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.copy
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1 = r4
            android.content.Context r1 = (android.content.Context) r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r3 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.tab_pesa
            android.view.View r1 = r1.inflate(r3, r2)
            int r2 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_title
            android.view.View r2 = r1.findViewById(r2)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            r3 = 30
            int r3 = r3 / 0
            if (r2 == 0) goto L55
            goto L4a
        L30:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1 = r4
            android.content.Context r1 = (android.content.Context) r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r3 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.tab_pesa
            android.view.View r1 = r1.inflate(r3, r2)
            int r2 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_title
            android.view.View r2 = r1.findViewById(r2)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            if (r2 == 0) goto L55
        L4a:
            java.util.List<java.lang.String> r4 = r4.titles
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
        L55:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r5.setCustomView(r1)
            int r4 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.getAsAtTimestamp
            int r4 = r4 + 123
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.copy = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L6a
            r4 = 21
            int r4 = r4 / 0
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.initTab$lambda$0(com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity, com.google.android.material.tabs.TabLayout$Tab, int):void");
    }

    private final void initTab() {
        int i = 2 % 2;
        ((ActivityPochiWalletPayBinding) this.binding).viewPager.setAdapter(new PochiAdapter(this));
        ((ActivityPochiWalletPayBinding) this.binding).viewPager.setOffscreenPageLimit(3);
        ((ActivityPochiWalletPayBinding) this.binding).viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onPageSelected(int position) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                PochiWalletPayActivity.access$setCurrentPosition$p(PochiWalletPayActivity.this, position);
                int i5 = component2 + 43;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 25 / 0;
                }
            }
        });
        this.titles.add(getString(R.string.pesa_buy_goods));
        this.titles.add(getString(R.string.pesa_pay_bill));
        this.titles.add(getString(R.string.mobile_number));
        new TabLayoutMediator(((ActivityPochiWalletPayBinding) this.binding).tabLayout, ((ActivityPochiWalletPayBinding) this.binding).viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                int i3 = 2 % 2;
                int i4 = component2 + 57;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    PochiWalletPayActivity.$r8$lambda$Pw4SchzSb2PITLU22fAz1Hsf3xw(this.f$0, tab, i2);
                    int i5 = 84 / 0;
                } else {
                    PochiWalletPayActivity.$r8$lambda$Pw4SchzSb2PITLU22fAz1Hsf3xw(this.f$0, tab, i2);
                }
                int i6 = component2 + 71;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }).attach();
        ((ActivityPochiWalletPayBinding) this.binding).tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = component2 + 25;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(tab, "");
                PochiWalletPayActivity.access$updateTabView(PochiWalletPayActivity.this, tab, true);
                int i5 = copydefault + 87;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 40 / 0;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                PochiWalletPayActivity pochiWalletPayActivity;
                boolean z;
                int i2 = 2 % 2;
                int i3 = component2 + 17;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(tab, "");
                    pochiWalletPayActivity = PochiWalletPayActivity.this;
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(tab, "");
                    pochiWalletPayActivity = PochiWalletPayActivity.this;
                    z = false;
                }
                PochiWalletPayActivity.access$updateTabView(pochiWalletPayActivity, tab, z);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        TabLayout.Tab tabAt = ((ActivityPochiWalletPayBinding) this.binding).tabLayout.getTabAt(0);
        Intrinsics.checkNotNull(tabAt);
        updateTabView(tabAt, true);
        int i2 = getAsAtTimestamp + 29;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void updateTabView(TabLayout.Tab tab, boolean selected) {
        int i = 2 % 2;
        View customView = tab.getCustomView();
        Intrinsics.checkNotNull(customView);
        RoundTextView roundTextView = (RoundTextView) customView.findViewById(R.id.tv_title);
        if (roundTextView == null) {
            return;
        }
        if (!selected) {
            roundTextView.setBackgroundColor(getColor(R.color.color_on_secondary_container));
            roundTextView.setTextColor(getColor(R.color.text_color_dark));
        } else {
            int i2 = getAsAtTimestamp + 121;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                roundTextView.setBackgroundColor(getColor(R.color.color_primary));
                roundTextView.setTextColor(getColor(R.color.white));
                int i3 = 46 / 0;
            } else {
                roundTextView.setBackgroundColor(getColor(R.color.color_primary));
                roundTextView.setTextColor(getColor(R.color.white));
            }
        }
        int i4 = getAsAtTimestamp + 29;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = copy + 119;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) + 651452520, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + SecLiteException.ERROR_API_KEY_OR_SIGN, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1294593773, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).length() - 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 105), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).codePointAt(0) - 9, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).length() + 17, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = getAsAtTimestamp + 117;
                copy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6618, 41 - TextUtils.lastIndexOf("", '0'), (char) TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myTid() >> 22), View.MeasureSpec.getSize(0) + 56, (char) (ViewConfiguration.getEdgeSlop() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
        int i2 = getAsAtTimestamp + 109;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) - 108), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 651452514, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952810_res_0x7f1304aa).substring(9, 10).codePointAt(0) - 132, (ViewConfiguration.getScrollBarSize() >> 8) - 1294593744, (short) TextUtils.getTrimmedLength(""), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionGroup(0L) + 23, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getAsAtTimestamp + 31;
            copy = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ((Process.getThreadPriority(0) + 20) >> 6), Color.blue(0) + 56, (char) KeyEvent.keyCodeFromString(""), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i5 = 0 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.blue(0), View.getDefaultSize(0, 0) + 42, (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6562, ((byte) KeyEvent.getModifierMetaStateMask()) + 57, (char) Color.blue(0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i6 = copy + 49;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:0|2|(2:4|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|880|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0))(0)|30|(10:935|31|(2:849|33)|37|38|910|(5:40|41|(1:43)|44|45)(21:46|47|924|48|(2:929|50)|54|55|911|56|(2:829|58)|62|63|64|(1:66)|67|68|69|(1:71)|72|(1:74)|75)|76|(4:79|(3:939|81|942)(12:937|82|(5:84|(1:86)(1:87)|944|(3:90|91|88)|943)|92|894|93|(1:95)|96|97|887|98|941)|940|77)|938)|139|(2:931|140)|(13:142|831|143|148|(2:150|151)|152|153|893|(4:155|156|(1:158)|159)(14:160|(2:162|(1:169)(1:167))(1:170)|(21:172|173|896|174|917|175|(3:177|845|178)|182|183|900|184|(2:872|186)|190|191|192|(2:856|194)|195|(2:197|198)(1:200)|201|(1:203)|204)(2:261|262)|265|266|267|908|268|271|272|(1:274)|275|276|277)|205|(4:208|(3:210|211|(2:218|960)(11:219|(3:221|(3:224|225|222)|961)|226|885|227|(1:229)|230|231|874|232|959))(2:216|(0)(0))|233|206)|958|262)(10:148|(0)|152|153|893|(0)(0)|205|(1:206)|958|262)|278|870|279|(3:281|842|282)|286|287|859|(5:289|290|(1:292)|293|294)(16:296|297|860|298|(2:933|300)|304|305|306|(1:308)|309|310|311|(1:313)(1:314)|315|(1:317)|318)|295|319|(9:322|852|323|(1:325)|326|327|328|847|329)|330|(58:858|366|(3:368|369|(2:371|373)(1:372))(1:373)|410|927|411|(3:413|913|414)|418|419|926|(4:421|422|(1:424)|425)(19:427|428|915|429|(2:864|431)|435|436|898|437|(2:902|439)|443|444|445|(2:447|448)|449|(1:451)(1:453)|454|(2:456|457)|458)|459|(4:462|(2:464|956)(11:465|(3:467|(4:470|471|472|468)|957)|473|881|474|(1:476)|477|478|866|479|955)|480|460)|954|492|521|(1:523)|524|(1:526)(1:527)|528|(3:530|(1:532)|533)(16:535|536|(1:538)|539|(1:541)|542|543|(1:545)|546|832|547|548|(1:550)|551|(1:553)|554)|534|555|(1:557)(9:558|(3:560|(2:563|561)|953)|564|565|(1:567)|568|(1:570)|571|572)|573|(1:575)|576|(3:578|(1:580)|581)(14:582|583|(1:585)|586|587|(1:589)|590|827|591|592|(1:594)(1:595)|596|(1:598)|599)|600|(1:602)(9:603|(3:605|(2:608|606)|952)|609|610|(1:612)|613|(1:615)|616|617)|618|922|619|(2:834|621)|625|626|920|627|(4:629|630|919|631)(1:632)|633|(3:635|(1:637)|638)(17:639|(16:641|(3:643|644|(2:646|648)(1:647))(1:648)|732|(1:734)|735|(3:737|(1:739)|740)(13:742|878|743|744|(1:746)|747|838|748|749|(1:751)(1:752)|753|(1:755)|756)|741|757|(6:760|761|(1:763)|764|765|766)|767|(1:769)|770|(3:772|(1:774)|775)(14:777|778|(1:780)|781|782|(1:784)|785|843|786|787|(1:789)|790|(1:792)|793)|776|794|(1:962)(7:797|798|(1:800)|801|802|803|804))|(19:650|651|906|652|(1:654)|655|656|891|657|(1:659)|660|661|662|(1:664)|665|(1:667)|668|(1:670)|671)|732|(0)|735|(0)(0)|741|757|(0)|767|(0)|770|(0)(0)|776|794|(0)(0))|672|(4:675|(3:947|677|950)(12:946|678|(3:680|(3:683|684|681)|951)|685|883|686|(1:688)|689|690|868|691|949)|948|673)|945|732|(0)|735|(0)(0)|741|757|(0)|767|(0)|770|(0)(0)|776|794|(0)(0))(1:377)|378|840|379|(1:381)|382|836|383|(1:385)|386|387|410|927|411|(0)|418|419|926|(0)(0)|459|(1:460)|954|492|521|(0)|524|(0)(0)|528|(0)(0)|534|555|(0)(0)|573|(0)|576|(0)(0)|600|(0)(0)|618|922|619|(0)|625|626|920|627|(0)(0)|633|(0)(0)|672|(1:673)|945|732|(0)|735|(0)(0)|741|757|(0)|767|(0)|770|(0)(0)|776|794|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x2095, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x2097, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x2098, code lost:
    
        r31 = r9;
        r15 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x209b, code lost:
    
        r1 = r0;
        r15 = r15;
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x330c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x330d, code lost:
    
        r31 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x3310, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x3311, code lost:
    
        r31 = r13;
        r9 = r32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0c1a A[Catch: all -> 0x076a, TryCatch #29 {all -> 0x076a, blocks: (B:272:0x1433, B:274:0x1439, B:275:0x1463, B:358:0x18fe, B:360:0x1904, B:361:0x192d, B:515:0x212a, B:517:0x2130, B:518:0x2154, B:761:0x3754, B:763:0x375a, B:764:0x3781, B:798:0x3ab1, B:800:0x3ab7, B:801:0x3ad7, B:778:0x38e5, B:780:0x3908, B:781:0x395e, B:726:0x3419, B:728:0x341f, B:729:0x3447, B:610:0x2ca6, B:612:0x2cac, B:613:0x2cd5, B:615:0x2d0f, B:616:0x2d57, B:583:0x29d7, B:585:0x29ec, B:586:0x2a1d, B:565:0x26be, B:567:0x26c4, B:568:0x26f1, B:570:0x272b, B:571:0x277c, B:536:0x2371, B:538:0x2386, B:539:0x23b6, B:541:0x23ea, B:542:0x2464, B:404:0x1b83, B:406:0x1b89, B:407:0x1bb8, B:133:0x0c14, B:135:0x0c1a, B:136:0x0c45, B:17:0x03bb, B:19:0x03c1, B:20:0x03e9, B:22:0x06d8, B:24:0x070a, B:25:0x0764, B:366:0x19b5, B:369:0x19c3, B:390:0x1aab, B:392:0x1ab1, B:393:0x1ab2, B:395:0x1ab4, B:397:0x1abb, B:398:0x1abc, B:373:0x19cf, B:383:0x1a25, B:385:0x1a32, B:386:0x1aa0, B:379:0x19da, B:381:0x19ef, B:382:0x1a1f), top: B:880:0x03bb, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0d2c A[Catch: all -> 0x131b, PHI: r1
  0x0d2c: PHI (r1v688 java.lang.Object) = (r1v687 java.lang.Object), (r1v747 java.lang.Object) binds: [B:141:0x0cda, B:143:0x0cdd] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #57 {all -> 0x131b, blocks: (B:140:0x0cd6, B:148:0x0d2c, B:152:0x0d9e, B:172:0x0e2d), top: B:931:0x0cd6 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0e10  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x11a9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x11e9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x11ed A[Catch: all -> 0x12fb, PHI: r3 r4 r5 r6
  0x11ed: PHI (r3v594 java.lang.Object[]) = (r3v593 java.lang.Object[]), (r3v612 java.lang.Object[]) binds: [B:217:0x11e7, B:212:0x11cb] A[DONT_GENERATE, DONT_INLINE]
  0x11ed: PHI (r4v507 char) = (r4v506 char), (r4v527 char) binds: [B:217:0x11e7, B:212:0x11cb] A[DONT_GENERATE, DONT_INLINE]
  0x11ed: PHI (r5v671 int) = (r5v670 int), (r5v686 int) binds: [B:217:0x11e7, B:212:0x11cb] A[DONT_GENERATE, DONT_INLINE]
  0x11ed: PHI (r6v535 int) = (r6v534 int), (r6v550 int) binds: [B:217:0x11e7, B:212:0x11cb] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #38 {all -> 0x12fb, blocks: (B:205:0x119f, B:206:0x11a3, B:219:0x11ed, B:216:0x11d2, B:174:0x0e62, B:192:0x1077, B:195:0x10c1, B:201:0x1139, B:204:0x1197), top: B:896:0x0e62 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1439 A[Catch: all -> 0x076a, TryCatch #29 {all -> 0x076a, blocks: (B:272:0x1433, B:274:0x1439, B:275:0x1463, B:358:0x18fe, B:360:0x1904, B:361:0x192d, B:515:0x212a, B:517:0x2130, B:518:0x2154, B:761:0x3754, B:763:0x375a, B:764:0x3781, B:798:0x3ab1, B:800:0x3ab7, B:801:0x3ad7, B:778:0x38e5, B:780:0x3908, B:781:0x395e, B:726:0x3419, B:728:0x341f, B:729:0x3447, B:610:0x2ca6, B:612:0x2cac, B:613:0x2cd5, B:615:0x2d0f, B:616:0x2d57, B:583:0x29d7, B:585:0x29ec, B:586:0x2a1d, B:565:0x26be, B:567:0x26c4, B:568:0x26f1, B:570:0x272b, B:571:0x277c, B:536:0x2371, B:538:0x2386, B:539:0x23b6, B:541:0x23ea, B:542:0x2464, B:404:0x1b83, B:406:0x1b89, B:407:0x1bb8, B:133:0x0c14, B:135:0x0c1a, B:136:0x0c45, B:17:0x03bb, B:19:0x03c1, B:20:0x03e9, B:22:0x06d8, B:24:0x070a, B:25:0x0764, B:366:0x19b5, B:369:0x19c3, B:390:0x1aab, B:392:0x1ab1, B:393:0x1ab2, B:395:0x1ab4, B:397:0x1abb, B:398:0x1abc, B:373:0x19cf, B:383:0x1a25, B:385:0x1a32, B:386:0x1aa0, B:379:0x19da, B:381:0x19ef, B:382:0x1a1f), top: B:880:0x03bb, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x14f3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1549  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x15a6 A[Catch: all -> 0x1864, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x1864, blocks: (B:279:0x14ed, B:286:0x153c, B:296:0x15a6, B:306:0x162f, B:309:0x1679), top: B:870:0x14ed }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x076e A[PHI: r13
  0x076e: PHI (r13v103 char) = (r13v25 char), (r13v105 char) binds: [B:15:0x03b6, B:5:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x1762  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1904 A[Catch: all -> 0x076a, TryCatch #29 {all -> 0x076a, blocks: (B:272:0x1433, B:274:0x1439, B:275:0x1463, B:358:0x18fe, B:360:0x1904, B:361:0x192d, B:515:0x212a, B:517:0x2130, B:518:0x2154, B:761:0x3754, B:763:0x375a, B:764:0x3781, B:798:0x3ab1, B:800:0x3ab7, B:801:0x3ad7, B:778:0x38e5, B:780:0x3908, B:781:0x395e, B:726:0x3419, B:728:0x341f, B:729:0x3447, B:610:0x2ca6, B:612:0x2cac, B:613:0x2cd5, B:615:0x2d0f, B:616:0x2d57, B:583:0x29d7, B:585:0x29ec, B:586:0x2a1d, B:565:0x26be, B:567:0x26c4, B:568:0x26f1, B:570:0x272b, B:571:0x277c, B:536:0x2371, B:538:0x2386, B:539:0x23b6, B:541:0x23ea, B:542:0x2464, B:404:0x1b83, B:406:0x1b89, B:407:0x1bb8, B:133:0x0c14, B:135:0x0c1a, B:136:0x0c45, B:17:0x03bb, B:19:0x03c1, B:20:0x03e9, B:22:0x06d8, B:24:0x070a, B:25:0x0764, B:366:0x19b5, B:369:0x19c3, B:390:0x1aab, B:392:0x1ab1, B:393:0x1ab2, B:395:0x1ab4, B:397:0x1abb, B:398:0x1abc, B:373:0x19cf, B:383:0x1a25, B:385:0x1a32, B:386:0x1aa0, B:379:0x19da, B:381:0x19ef, B:382:0x1a1f), top: B:880:0x03bb, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x19d8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x19ef A[Catch: all -> 0x1ab3, TryCatch #7 {all -> 0x1ab3, blocks: (B:379:0x19da, B:381:0x19ef, B:382:0x1a1f), top: B:840:0x19da, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1a32 A[Catch: all -> 0x1aa9, TryCatch #5 {all -> 0x1aa9, blocks: (B:383:0x1a25, B:385:0x1a32, B:386:0x1aa0), top: B:836:0x1a25, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1c44  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1c9a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1cf7 A[Catch: all -> 0x2097, TRY_ENTER, TRY_LEAVE, TryCatch #55 {all -> 0x2097, blocks: (B:411:0x1c3e, B:418:0x1c8d, B:459:0x1f34, B:460:0x1f38, B:462:0x1f3e, B:465:0x1f59, B:427:0x1cf7, B:445:0x1e11, B:449:0x1e5c, B:454:0x1ed2, B:458:0x1f2c), top: B:927:0x1c3e }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x1f3e A[Catch: all -> 0x2097, TryCatch #55 {all -> 0x2097, blocks: (B:411:0x1c3e, B:418:0x1c8d, B:459:0x1f34, B:460:0x1f38, B:462:0x1f3e, B:465:0x1f59, B:427:0x1cf7, B:445:0x1e11, B:449:0x1e5c, B:454:0x1ed2, B:458:0x1f2c), top: B:927:0x1c3e }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x2130 A[Catch: all -> 0x076a, TryCatch #29 {all -> 0x076a, blocks: (B:272:0x1433, B:274:0x1439, B:275:0x1463, B:358:0x18fe, B:360:0x1904, B:361:0x192d, B:515:0x212a, B:517:0x2130, B:518:0x2154, B:761:0x3754, B:763:0x375a, B:764:0x3781, B:798:0x3ab1, B:800:0x3ab7, B:801:0x3ad7, B:778:0x38e5, B:780:0x3908, B:781:0x395e, B:726:0x3419, B:728:0x341f, B:729:0x3447, B:610:0x2ca6, B:612:0x2cac, B:613:0x2cd5, B:615:0x2d0f, B:616:0x2d57, B:583:0x29d7, B:585:0x29ec, B:586:0x2a1d, B:565:0x26be, B:567:0x26c4, B:568:0x26f1, B:570:0x272b, B:571:0x277c, B:536:0x2371, B:538:0x2386, B:539:0x23b6, B:541:0x23ea, B:542:0x2464, B:404:0x1b83, B:406:0x1b89, B:407:0x1bb8, B:133:0x0c14, B:135:0x0c1a, B:136:0x0c45, B:17:0x03bb, B:19:0x03c1, B:20:0x03e9, B:22:0x06d8, B:24:0x070a, B:25:0x0764, B:366:0x19b5, B:369:0x19c3, B:390:0x1aab, B:392:0x1ab1, B:393:0x1ab2, B:395:0x1ab4, B:397:0x1abb, B:398:0x1abc, B:373:0x19cf, B:383:0x1a25, B:385:0x1a32, B:386:0x1aa0, B:379:0x19da, B:381:0x19ef, B:382:0x1a1f), top: B:880:0x03bb, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x21de  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x2242  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x2284  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x229c  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x2353  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x259b  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x2679  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x289f  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x28f1  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x29b8  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x2b5d  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x2c5a  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x2ed8 A[Catch: all -> 0x330c, TRY_LEAVE, TryCatch #51 {all -> 0x330c, blocks: (B:627:0x2ebf, B:629:0x2ed8), top: B:920:0x2ebf }] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x2f1c  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x2f32 A[Catch: all -> 0x330a, TryCatch #50 {all -> 0x330a, blocks: (B:631:0x2f05, B:633:0x2f1e, B:635:0x2f32, B:637:0x2f3b, B:638:0x2f7c, B:672:0x31d2, B:673:0x31d6, B:675:0x31dc, B:678:0x31f4, B:681:0x3201, B:683:0x3204, B:695:0x32e4, B:697:0x32ea, B:698:0x32eb, B:700:0x32ed, B:702:0x32f4, B:703:0x32f5, B:641:0x2f8b, B:644:0x2f99, B:648:0x2fa5, B:650:0x2fab, B:662:0x30bc, B:664:0x30c2, B:665:0x3105, B:667:0x312f, B:668:0x316f, B:670:0x3185, B:671:0x31cc, B:705:0x32f7, B:707:0x32fe, B:708:0x32ff, B:710:0x3301, B:712:0x3308, B:713:0x3309, B:691:0x3267, B:686:0x3230, B:688:0x3236, B:689:0x325f, B:657:0x3019, B:659:0x3038, B:660:0x30b0, B:652:0x2fcb, B:654:0x2fe0, B:655:0x3012), top: B:919:0x2f05, inners: #23, #31, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2f87  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x31dc A[Catch: all -> 0x330a, TryCatch #50 {all -> 0x330a, blocks: (B:631:0x2f05, B:633:0x2f1e, B:635:0x2f32, B:637:0x2f3b, B:638:0x2f7c, B:672:0x31d2, B:673:0x31d6, B:675:0x31dc, B:678:0x31f4, B:681:0x3201, B:683:0x3204, B:695:0x32e4, B:697:0x32ea, B:698:0x32eb, B:700:0x32ed, B:702:0x32f4, B:703:0x32f5, B:641:0x2f8b, B:644:0x2f99, B:648:0x2fa5, B:650:0x2fab, B:662:0x30bc, B:664:0x30c2, B:665:0x3105, B:667:0x312f, B:668:0x316f, B:670:0x3185, B:671:0x31cc, B:705:0x32f7, B:707:0x32fe, B:708:0x32ff, B:710:0x3301, B:712:0x3308, B:713:0x3309, B:691:0x3267, B:686:0x3230, B:688:0x3236, B:689:0x325f, B:657:0x3019, B:659:0x3038, B:660:0x30b0, B:652:0x2fcb, B:654:0x2fe0, B:655:0x3012), top: B:919:0x2f05, inners: #23, #31, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x039e A[PHI: r13
  0x039e: PHI (r13v25 char) = (r13v24 char), (r13v104 char) binds: [B:3:0x0397, B:5:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x341f A[Catch: all -> 0x076a, TryCatch #29 {all -> 0x076a, blocks: (B:272:0x1433, B:274:0x1439, B:275:0x1463, B:358:0x18fe, B:360:0x1904, B:361:0x192d, B:515:0x212a, B:517:0x2130, B:518:0x2154, B:761:0x3754, B:763:0x375a, B:764:0x3781, B:798:0x3ab1, B:800:0x3ab7, B:801:0x3ad7, B:778:0x38e5, B:780:0x3908, B:781:0x395e, B:726:0x3419, B:728:0x341f, B:729:0x3447, B:610:0x2ca6, B:612:0x2cac, B:613:0x2cd5, B:615:0x2d0f, B:616:0x2d57, B:583:0x29d7, B:585:0x29ec, B:586:0x2a1d, B:565:0x26be, B:567:0x26c4, B:568:0x26f1, B:570:0x272b, B:571:0x277c, B:536:0x2371, B:538:0x2386, B:539:0x23b6, B:541:0x23ea, B:542:0x2464, B:404:0x1b83, B:406:0x1b89, B:407:0x1bb8, B:133:0x0c14, B:135:0x0c1a, B:136:0x0c45, B:17:0x03bb, B:19:0x03c1, B:20:0x03e9, B:22:0x06d8, B:24:0x070a, B:25:0x0764, B:366:0x19b5, B:369:0x19c3, B:390:0x1aab, B:392:0x1ab1, B:393:0x1ab2, B:395:0x1ab4, B:397:0x1abb, B:398:0x1abc, B:373:0x19cf, B:383:0x1a25, B:385:0x1a32, B:386:0x1aa0, B:379:0x19da, B:381:0x19ef, B:382:0x1a1f), top: B:880:0x03bb, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x34d3  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x3523  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x357b  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x3732  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x3819  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x386c  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x38c7  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x3a91  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x2e66 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:858:0x19b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:962:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v107 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r13v106 */
    /* JADX WARN: Type inference failed for: r13v107 */
    /* JADX WARN: Type inference failed for: r13v108 */
    /* JADX WARN: Type inference failed for: r13v109 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v75 */
    /* JADX WARN: Type inference failed for: r13v76 */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
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
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v143 */
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v146 */
    /* JADX WARN: Type inference failed for: r15v147 */
    /* JADX WARN: Type inference failed for: r15v148 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v150 */
    /* JADX WARN: Type inference failed for: r15v151 */
    /* JADX WARN: Type inference failed for: r15v152 */
    /* JADX WARN: Type inference failed for: r15v153 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v691, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v14 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v25 */
    /* JADX WARN: Type inference failed for: r31v26 */
    /* JADX WARN: Type inference failed for: r31v27 */
    /* JADX WARN: Type inference failed for: r31v28 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v31 */
    /* JADX WARN: Type inference failed for: r31v32 */
    /* JADX WARN: Type inference failed for: r31v33 */
    /* JADX WARN: Type inference failed for: r31v34 */
    /* JADX WARN: Type inference failed for: r31v35 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v41 */
    /* JADX WARN: Type inference failed for: r31v42 */
    /* JADX WARN: Type inference failed for: r31v43 */
    /* JADX WARN: Type inference failed for: r31v44 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v49 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v50 */
    /* JADX WARN: Type inference failed for: r31v51 */
    /* JADX WARN: Type inference failed for: r31v52 */
    /* JADX WARN: Type inference failed for: r31v53 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v59 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r31v62 */
    /* JADX WARN: Type inference failed for: r31v63 */
    /* JADX WARN: Type inference failed for: r31v64 */
    /* JADX WARN: Type inference failed for: r31v65 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v67 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v69 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v70 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v74 */
    /* JADX WARN: Type inference failed for: r31v75 */
    /* JADX WARN: Type inference failed for: r31v76 */
    /* JADX WARN: Type inference failed for: r31v77 */
    /* JADX WARN: Type inference failed for: r31v78 */
    /* JADX WARN: Type inference failed for: r31v79 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v80 */
    /* JADX WARN: Type inference failed for: r31v81 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v50 */
    /* JADX WARN: Type inference failed for: r3v609, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v559, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r6v347, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r7v110, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v289, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v291, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v292 */
    /* JADX WARN: Type inference failed for: r7v293 */
    /* JADX WARN: Type inference failed for: r7v296, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v297 */
    /* JADX WARN: Type inference failed for: r7v298 */
    /* JADX WARN: Type inference failed for: r7v299 */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v300 */
    /* JADX WARN: Type inference failed for: r7v301 */
    /* JADX WARN: Type inference failed for: r7v303 */
    /* JADX WARN: Type inference failed for: r7v304 */
    /* JADX WARN: Type inference failed for: r7v389 */
    /* JADX WARN: Type inference failed for: r7v390 */
    /* JADX WARN: Type inference failed for: r7v391 */
    /* JADX WARN: Type inference failed for: r7v392 */
    /* JADX WARN: Type inference failed for: r7v393 */
    /* JADX WARN: Type inference failed for: r7v394 */
    /* JADX WARN: Type inference failed for: r7v395 */
    /* JADX WARN: Type inference failed for: r7v396 */
    /* JADX WARN: Type inference failed for: r7v397 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v112 */
    /* JADX WARN: Type inference failed for: r9v113 */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v116 */
    /* JADX WARN: Type inference failed for: r9v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v124 */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v175 */
    /* JADX WARN: Type inference failed for: r9v176 */
    /* JADX WARN: Type inference failed for: r9v177 */
    /* JADX WARN: Type inference failed for: r9v179 */
    /* JADX WARN: Type inference failed for: r9v195 */
    /* JADX WARN: Type inference failed for: r9v196 */
    /* JADX WARN: Type inference failed for: r9v197 */
    /* JADX WARN: Type inference failed for: r9v198 */
    /* JADX WARN: Type inference failed for: r9v207, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v212 */
    /* JADX WARN: Type inference failed for: r9v216 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v234 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v244, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v260 */
    /* JADX WARN: Type inference failed for: r9v261 */
    /* JADX WARN: Type inference failed for: r9v262 */
    /* JADX WARN: Type inference failed for: r9v263 */
    /* JADX WARN: Type inference failed for: r9v264 */
    /* JADX WARN: Type inference failed for: r9v265 */
    /* JADX WARN: Type inference failed for: r9v266 */
    /* JADX WARN: Type inference failed for: r9v267 */
    /* JADX WARN: Type inference failed for: r9v268 */
    /* JADX WARN: Type inference failed for: r9v269 */
    /* JADX WARN: Type inference failed for: r9v270 */
    /* JADX WARN: Type inference failed for: r9v271 */
    /* JADX WARN: Type inference failed for: r9v272 */
    /* JADX WARN: Type inference failed for: r9v273 */
    /* JADX WARN: Type inference failed for: r9v274 */
    /* JADX WARN: Type inference failed for: r9v275 */
    /* JADX WARN: Type inference failed for: r9v276 */
    /* JADX WARN: Type inference failed for: r9v277 */
    /* JADX WARN: Type inference failed for: r9v278 */
    /* JADX WARN: Type inference failed for: r9v279 */
    /* JADX WARN: Type inference failed for: r9v280 */
    /* JADX WARN: Type inference failed for: r9v281 */
    /* JADX WARN: Type inference failed for: r9v282 */
    /* JADX WARN: Type inference failed for: r9v283 */
    /* JADX WARN: Type inference failed for: r9v284 */
    /* JADX WARN: Type inference failed for: r9v285 */
    /* JADX WARN: Type inference failed for: r9v286 */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v95 */
    /* JADX WARN: Type inference failed for: r9v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v97 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletPayActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$Pw4SchzSb2PITLU22fAz1Hsf3xw(PochiWalletPayActivity pochiWalletPayActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 57;
        copy = i3 % 128;
        int i4 = i3 % 2;
        initTab$lambda$0(pochiWalletPayActivity, tab, i);
        int i5 = copy + 117;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        getRequestBeneficiariesState = 0;
        component3();
        int i = getShareableDataState + 67;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        int i5 = getAsAtTimestamp + 123;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component3() {
        component1 = new char[]{5557, 56809, 34070, 19807, 13559, 64546, 42050, 28607, 22307, 8012, 50884, 36373, 30274, 14732, 57661, 43372, 37015, 22564, 3099, 50268, 40069, 21734, 11614, 3093, 50256, 40098, 21757, 11615, 58759, 48624, 30322, 20126, 1773, 57124, 38798, 28657, Typography.dagger, 63624, 45250, 35113, 16795, 48103, 29676, 11025, 58137, 39676, 21038, 2583, 49574, 63790, 45326, 26766, 8238, 55387, 38786, 20329, 1901, 16084, 63028, 44645, 26010, 7579, 54650, 35986, 17558, 31866, 11173, 58254, 39795, 21232, 2688, 49754, 63981, 45443, 26964, 8368, 55534, 36888, 18496, 1975, 16194, 63304, 44793, 26152, 7746, 54774, 36134, 17752, 31961, 3140, 50241, 40163, 21694, 11530, 58845, 48615, 30288, 20188, 1787, 57209, 38867, 28587, 8311, 63647, 45256, 35189, 16837, 6552, 53821, 43578, 25311, 15204, 62256, 52102, 39950, 21628, 11396, 58708, 48425, 30202, 19993, 1574, 57085, 38675, 28493, 10175, 65517, 45077, 34992, 16621, 6405, 53713, 43446, 25172, 15060, 62121, 52090, 33666, 23463, 11297, 58525, 48285, 30049, 19858, 1435, 56936, 38462, 28289, 10095, 65329, 46984, 34906, 16418, 12727, 63921, 41236, 26908, 4267, 55423, 32835, 19360, 29542, 15112, 58077, 43642, 20999, 7625, 50541, 36155, 46294, 31846, 9256, 61339, 38811, 24364, 1683, 52875, 63021, 41389, 27017, 4471, 55551, 32896, 18512, 29672, 15314, 58196, 43746, 21178, 55443, 4301, 18489, 32877, 63938, 12556, 27004, 41670, 39466, 53872, 2999, 17155, 47965, 62626, 11284, 25666, 3138, 50199, 40169, 21691, 11523, 58847, 48563, 30209, 20183, 1707, 57208, 3088, 50204, 40116, 21695, 11609, 58763, 48613, 30212, 20109, 1705, 57133, 38789, 28583, 8306, 63693, 45263, 35184, 16832, 6598, 53865, 43627, 25306, 15152, 62263, 52108, 40027, 21551, 11475, 58624, 48418, 30122, 20041, 1583, 56993, 38729, 28443, 10210, 65471, 45073, 35051, 16619, 6414, 53721, 43489, 25169, 15056, 62205, 52095, 33664, 23468, 11302, 58525, 48281, 30012, 19856, 1434, 56893, 38505, 28289, 10080, 65330, 46976, 34831, 16504, 59051, 12030, 30221, 48724, 51183, 3901, 22366, 40166, 42035, 60489, 13712, 3150, 50196, 40166, 21695, 11534, 58842, 48563, 30219, 20184, 1711, 57212, 3150, 50192, 40168, 21686, 11523, 58842, 48560, 30214, 20183, 1711};
        component3 = -7695978104576293851L;
        component2 = 685828098;
        copydefault = -238323894;
        ShareDataUIState = -1126000616;
        equals = new byte[]{-98, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, -12, 7, 40, -41, 45, -45, -6, 45, -42, Ascii.ESC, 41, -42, -47, -1, 5, 47, -25, Ascii.CAN, -48, 32, -48, -41, 42, -42, -5, 4, -3, Ascii.SUB, 40, -28, 4, 47, -29, Ascii.SUB, 41, -26, Ascii.CAN, -44, -5, Ascii.EM, -41, -41, 40, 44, -44, 41, -5, -41, 42, 4, 44, -48, -8, 42, 41, 4, 40, 42, -43, 44, -28, 5, -5, Ascii.US, -52, -42, 47, 32, -58, 56, Ascii.US, -44, -107, 110, -110, 40, 39, -41, -48, 44, 19, -17, -48, 38, Ascii.ESC, -21, -41, 37, Ascii.FS, -32, -38, 56, -59, 45, -41, 38, -37, 56, -59, 39, Ascii.DLE, -109, 40, 59, -41, -58, 58, -43, -38, 35, -35, 111, -27, -42, 5, 42, 43, 41, -43, 44, -43, 40, -25, Ascii.SUB, -43, -42, 42, -42, 46, 41, -36, -18, 42, -43, 41, 37, -118, 44, -45, 42, 42, -36, -124, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -102, 33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -123, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, -12, -5, 43, 5, 40, 42, -27, 41, Ascii.FS, -25, 43, 3, -42, -6, 45, 3, -3, 6, -42, 40, 41, -25, Ascii.FS, -41, 42, -47, 45, -44, -41, 40, 44, -45, 46, 41, -28, Ascii.GS, 40, -25, Ascii.CAN, -47, -15, 4, 45, -45, 40, -44, 44, -41, -8, 41, -42, 6, -42, -42, 46, -25, -41, 6, -4, 7, -5, -43, 7, -41, -127, 43, 42, -46, 44, -43, -41, 45, 43, -42, 40, -114, -44, 46, -46, 40, -44, 44, -46, 46, -41};
    }
}
