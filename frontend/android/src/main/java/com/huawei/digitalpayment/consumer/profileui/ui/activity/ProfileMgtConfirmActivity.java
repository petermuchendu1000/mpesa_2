package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ColorUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.NoUnderLineClickSpan;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.digitalpayment.consumer.baselib.util.SpannableStringUtils;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ActivityProfileMgtConfirmBinding;
import com.huawei.digitalpayment.consumer.profileui.ui.adapter.MgtConfirmAdapter;
import com.huawei.digitalpayment.consumer.webview.init.WebViewExecuteHandler;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.util.GlideUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.cancel;

public class ProfileMgtConfirmActivity extends Hilt_ProfileMgtConfirmActivity<ActivityProfileMgtConfirmBinding, ProfileViewModel> {
    private static short[] ShareDataUIState;
    private static int component1;
    private static int component2;
    private static int component3;
    private static boolean component4;
    private static int copy;
    private static byte[] copydefault;
    private static boolean equals;
    private static char[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private static int toString;
    private MgtConfirmAdapter adapter;
    private static final byte[] $$l = {69, 81, 99, -123};
    private static final int $$o = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {77, -64, 102, -128, -14, -15, -2, -7, -15, -20, SignedBytes.MAX_POWER_OF_TWO, -63, -22, -13, -7, -16, -9, 1, -15, -1, -24, 59, -63, -15, -3, -23, -10, -1, -17, -17, 59, -44, -44, -7, 1, -27, 8, -12, -23, Ascii.NAK, -26, -22, -11, 1, TarHeader.LF_CONTIG, -42, -43, -11, -5, -30, -1, -18, 33, -46, -13, -6, -17, -22, -8, -13, -9, -9, -1, -19, -16, 56, -22, -8, -13, -9, -9, -1, -19, -16, TarHeader.LF_CONTIG, -22, -8, -13, -9, -9, -1, -19, -16, 57};
    private static final int $$k = 181;
    private static final byte[] $$d = {74, 75, -50, -9, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 36;
    private static int getSponsorBeneficiariesState = 0;
    private static int hashCode = 0;
    private static int getShareableDataState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 + 65
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.$$r(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r8 = r9
            r4 = r2
            goto L29
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
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + 1
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.h(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 8
            int r7 = r7 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.$$j
            int r6 = 74 - r6
            int r8 = r8 * 44
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.i(byte, int, short, java.lang.Object[]):void");
    }

    private static void g(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $10 + 69;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i2 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(copy)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getFadingEdgeLength() >> 16), 38 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (26860 - ExpandableListView.getPackedPositionType(0L)), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Gravity.getAbsoluteGravity(0, 0), 16 - KeyEvent.keyCodeFromString(""), (char) (MotionEvent.axisFromString("") + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            int i8 = $11 + 109;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 7407, TextUtils.indexOf("", "", 0) + 16, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            int i10 = $10 + 85;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = getAsAtTimestamp;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 69;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 3;
                        byte b3 = (byte) (b2 - 3);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - View.combineMeasuredStates(i4, i4), Color.blue(i4) + 24, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), -1670574543, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7139, 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i10 = 689978476;
        int i11 = 8;
        if (component4) {
            int i12 = $11 + 59;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 1;
            } else {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
            }
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                try {
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2749 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 18 - MotionEvent.axisFromString(""), (char) (7644 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -327556343, false, $$r((byte) i11, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    j = 0;
                    i11 = 8;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (equals) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i13 = $10 + 49;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 << 1) + cancelVar.component3] - i] % iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 2748, (ViewConfiguration.getTapTimeout() >> 16) + 19, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7644), -327556343, false, $$r((byte) 8, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b6 = (byte) 0;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "") + 19, (char) (TextUtils.getOffsetBefore("", 0) + 7644), -327556343, false, $$r((byte) 8, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                i10 = 689978476;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i14;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i15 = $11 + 111;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[cancelVar.component1 / cancelVar.component3] + i] / iIntValue);
                i14 = cancelVar.component3 % 0;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i14 = cancelVar.component3 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[PHI: r4
  0x0097: PHI (r4v22 byte[]) = (r4v9 byte[]), (r4v23 byte[]) binds: [B:20:0x009c, B:16:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[PHI: r4
  0x009e: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v23 byte[]) binds: [B:20:0x009c, B:16:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r24, int r25, short r26, byte r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.j(int, int, short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private void initdata() {
        int i = 2 % 2;
        this.adapter.setNewInstance(new ArrayList());
        int i2 = getShareableDataState + 85;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 9;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar("");
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initView() {
        int i = 2 % 2;
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        this.adapter = new MgtConfirmAdapter();
        ((ActivityProfileMgtConfirmBinding) this.binding).recycleview.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(getColor(R.color.common_colorWhite), DensityUtils.dp2px(this, 4.0f));
        recycleViewDivider.setPadding(DensityUtils.dp2px(this, 12.0f), 0, DensityUtils.dp2px(this, 12.0f), 0);
        ((ActivityProfileMgtConfirmBinding) this.binding).recycleview.addItemDecoration(recycleViewDivider);
        ((ActivityProfileMgtConfirmBinding) this.binding).recycleview.setAdapter(this.adapter);
        setCustomer();
        setAgreement();
        int i2 = getShareableDataState + 41;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
    }

    private void setCustomer() {
        int i = 2 % 2;
        int i2 = hashCode + 19;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        if (customer == null) {
            return;
        }
        ((ActivityProfileMgtConfirmBinding) this.binding).tvNo.setText(customer.getIdentityId());
        ((ActivityProfileMgtConfirmBinding) this.binding).tvNickname.setText(getString(R.string.mgt_account_nickname, new Object[]{customer.getName()}));
        GlideUtils.load(Base64Mode.getConsumerMode(customer.getAvatar()), ((ActivityProfileMgtConfirmBinding) this.binding).imHead, R.mipmap.icon_default_avatar, R.mipmap.icon_default_avatar);
        int i4 = getShareableDataState + 119;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = hashCode + 75;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_profile_mgt_confirm;
        int i5 = getShareableDataState + 63;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setAgreement() {
        int i = 2 % 2;
        String string = getString(R.string.mgt_account_notice);
        SpannableString spannableString = new SpannableString(getString(R.string.mgt_account_notice_see, new Object[]{string}));
        SpannableStringUtils.INSTANCE.color(spannableString, ColorUtils.getColor(R.color.colorPrimary), string);
        SpannableStringUtils.INSTANCE.span(spannableString, new NoUnderLineClickSpan(this) {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onClick(View view) {
                int i2 = 2 % 2;
                RouteUtils.routeWithExecute(WebViewExecuteHandler.TERMS_PRE + SPUtils.getInstance().getString(SPConstant.TERMS_URL));
                int i3 = copydefault + 77;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }
        }, string);
        ((ActivityProfileMgtConfirmBinding) this.binding).tvAgreement.setHighlightColor(0);
        ((ActivityProfileMgtConfirmBinding) this.binding).tvAgreement.setMovementMethod(LinkMovementMethod.getInstance());
        ((ActivityProfileMgtConfirmBinding) this.binding).tvAgreement.setText(spannableString);
        int i2 = getShareableDataState + 67;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = hashCode + 5;
        getShareableDataState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 30, new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = hashCode + 37;
            getShareableDataState = i3 % 128;
            if (i3 % 2 == 0) {
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6618, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") + 57, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), -960739708, false, "component3", new Class[]{Context.class});
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
    public void attachBaseContext(android.content.Context r48) {
        /*
            Method dump skipped, instruction units count: 15431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileMgtConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = hashCode + 73;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getShareableDataState + 3;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        toString = 1;
        component3();
        component1 = 1557535549;
        component3 = -238323889;
        component2 = 1709770779;
        copydefault = new byte[]{-44, -36, 36, -33, -60, 0, TarHeader.LF_NORMAL, -112, -40, -48, 60, -60, -56, 34, -47, 59, TarHeader.LF_FIFO, -18, -56, 34, -47, -37, Ascii.SYN, -111, -34, 33, -60, Ascii.ETB, -106, -57, -43, 34, -50, -43, Ascii.SYN, -97, 46, -37, -37, -43, -42, -48, 47, 6, -99, 41, 42, -37, -57, 59, -62, -41, 44, -50, 44, -43, -47, -42, Ascii.EM, -106, -41, -63, 57, -49, 46, Ascii.GS, -110, -47, 47, 41};
        int i = getSponsorBeneficiariesState + 33;
        toString = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        getAsAtTimestamp = new char[]{30613, 30600, 30614, 30596, 30603, 30605, 30280, 30599, 30634, 30615, 30609, 30601, 30717, 30625, 30602, 30645, 30598, 30592, 30630, 30610, 30593, 30606, 30282, 30608, 30274, 30277, 30272, 30276, 30273, 30275, 30612, 30278, 30279, 30653, 30604, 30611, 30631, 30642, 30647};
        getRequestBeneficiariesState = 321287802;
        equals = true;
        component4 = true;
        copy = -890926550;
    }
}
