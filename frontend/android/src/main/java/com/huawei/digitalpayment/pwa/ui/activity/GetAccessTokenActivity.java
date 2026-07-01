package com.huawei.digitalpayment.pwa.ui.activity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.safe.SafeUri;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.pwa.model.response.GetH5AccessTokenResp;
import com.huawei.digitalpayment.pwa.model.resquest.H5AccessTokenRequest;
import com.huawei.digitalpayment.pwa.viewmodel.PwaViewModel;
import com.huawei.digitalpayment.pwaui.R;
import com.huawei.digitalpayment.pwaui.databinding.LayoutTransparentBinding;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.cancel;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public class GetAccessTokenActivity extends Hilt_GetAccessTokenActivity<LayoutTransparentBinding, PwaViewModel> {
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static boolean component2;
    private static int component3;
    private static int component4;
    private static byte[] copy;
    private static char[] copydefault;
    private static int equals;
    private static short[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private static int getShareableDataState;
    private String mAppId;
    private String mUrl;
    private HashMap<String, String> queryParams;
    private Uri uri;
    private String urlString;
    private static final byte[] $$c = {7, 80, 121, 38};
    private static final int $$f = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {80, -19, -87, -22, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -62, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, 17, 3, -58, 74, -13, 10, 0, Ascii.SYN, -4, -1, 17, 3, -58, 59, 6, 19, -5, 3, Ascii.FF, 10, Ascii.VT, -1, 6, -10, 13, -58, 58, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, 4, -64, 58, 10, 6, Ascii.FF, -61, Ascii.EM, 36, Ascii.ETB, -9, -26, 40, 8, 13, -10, Ascii.DC2, -42, 42, 6, Ascii.FF, -32, 46, -75, 5, 38, 56, 1, -10, Ascii.DC2, 1, -8, Ascii.DLE, -20, 43, -6, Ascii.VT, -7, 2, 20, -6, -1, -18, Ascii.SUB, 17, -6, 7, 2, -44, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -61};
    private static final int $$h = 102;
    private static final byte[] $$a = {69, 81, 99, -123, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 114;
    private static int toString = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int ArtificialStackFrames = 1;

    private static String $$i(int i, short s, int i2) {
        byte[] bArr = $$c;
        int i3 = 3 - (i2 * 4);
        int i4 = s + 68;
        int i5 = i * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += i3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 = bArr[i8] + i4;
            i3 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.d(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 99
            byte[] r0 = com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.$$g
            int r7 = r7 * 3
            int r7 = 106 - r7
            int r6 = r6 * 75
            int r1 = r6 + 10
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.f(int, short, byte, java.lang.Object[]):void");
    }

    private static void e(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        long j = 0;
        if (cArr2 != null) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 3761, View.resolveSizeAndState(0, 0, 0) + 24, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 31;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        float f = 0.0f;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i8 = 689978476;
        if (!component2) {
            if (!ShareDataUIState) {
                cancelVar.component1 = iArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i9 = $10 + 13;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.red(0), AndroidCharacter.getMirror('0') - 29, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7643), -327556343, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = $10 + 29;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        cancelVar.component1 = bArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i13 = $11 + 49;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 % 0) / cancelVar.component3] << i] >>> iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i8);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 19 - TextUtils.getTrimmedLength(""), (char) (KeyEvent.normalizeMetaState(0) + 7644), -327556343, false, $$i(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 2748, 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (7643 - ImageFormat.getBitsPerPixel(0)), -327556343, false, $$i(b8, b9, (byte) (b9 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            f = 0.0f;
            i8 = 689978476;
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = component1;
        char c2 = '0';
        float f = 0.0f;
        if (cArr2 != null) {
            int i8 = $11 + 61;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 656, 13 - TextUtils.indexOf("", c2, 0, 0), (char) (65118 - (ViewConfiguration.getTouchSlop() >> 8)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                    c2 = '0';
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i9 = $10 + 115;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i11 = $11 + 1;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 4503, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35, (char) (27897 - Color.green(0)), -1464227204, false, $$i(b2, (byte) (b2 | 42), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3579 - Process.getGidForName(""), 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ExpandableListView.getPackedPositionType(0L), 1180380354, false, $$i(b3, (byte) (b3 | 47), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1858 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 80302927, false, $$i(b4, (byte) (b4 | 46), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $10 + 97;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i18 = $10 + 65;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i20 = $10 + 61;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i22 = $11 + 3;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] * iArr[3]);
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void c(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(equals)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 31, (char) (61686 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1874745193, false, $$i(b3, (byte) (b3 | 45), b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = copy;
                char c2 = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 2984, TextUtils.getCapsMode("", 0, 0) + 48, (char) (54461 - TextUtils.indexOf("", c2)), -1178636483, false, $$i(b4, (byte) (b4 | TarHeader.LF_NORMAL), b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i7++;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $11 + 41;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        byte[] bArr3 = copy;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(getRequestBeneficiariesState)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b5 = (byte) 0;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - KeyEvent.keyCodeFromString(""), 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 61685), 1874745193, false, $$i(b5, (byte) (b5 | 45), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) / 7083766810336261929L)) >> ((int) (((long) equals) + 7083766810336261929L));
                    } else {
                        byte[] bArr4 = copy;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(getRequestBeneficiariesState)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 1000, 30 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (61685 - (Process.myTid() >> 22)), 1874745193, false, $$i(b6, (byte) (b6 | 45), b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) equals) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i5;
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) equals) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i9 = ((i + iIntValue) - 2) + ((int) (((long) getRequestBeneficiariesState) ^ j));
                if (z2) {
                    int i10 = $11 + 33;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i9 + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component4), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1697 - View.resolveSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37, (char) Gravity.getAbsoluteGravity(0, 0), -1454191902, false, $$i(b7, (byte) $$f, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = copy;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr6[i12] = (byte) (((long) bArr5[i12]) ^ 7083766810336261929L);
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i13 = $10 + 117;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        int i15 = $10 + 113;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        byte[] bArr7 = copy;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getAsAtTimestamp;
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x00f6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.onCreate(android.os.Bundle):void");
    }

    private void initObserver() {
        int i = 2 % 2;
        ((PwaViewModel) this.viewModel).getGetTokenLiveData().observe(this, new Observer<Resource<GetH5AccessTokenResp>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onChanged(Resource<GetH5AccessTokenResp> resource) throws Throwable {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(resource);
                int i5 = component1 + 9;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void ShareDataUIState(Resource<GetH5AccessTokenResp> resource) throws Throwable {
                int i2 = 2 % 2;
                int i3 = component1 + 33;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (resource.loading()) {
                    DialogManager.showLoading(GetAccessTokenActivity.this);
                    return;
                }
                DialogManager.hideLoading(GetAccessTokenActivity.this);
                if (resource.success()) {
                    GetAccessTokenActivity.m12246$$Nest$mgetAccessTokenResult(GetAccessTokenActivity.this, resource.getData());
                    int i5 = component1 + 47;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
                if (resource.error()) {
                    GetAccessTokenActivity.m12247$$Nest$mgetAccessTokenResultFail(GetAccessTokenActivity.this);
                }
                int i7 = copydefault + 63;
                component1 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 79 / 0;
                }
            }
        });
        int i2 = getSponsorBeneficiariesState + 7;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initData() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 79;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.mUrl = getIntent().getStringExtra("url");
        this.mAppId = getIntent().getStringExtra("appId");
        this.urlString = getIntent().getStringExtra(RouteUtils.SCHEME_EXECUTE_KEY);
        if (!TextUtils.isEmpty(r1)) {
            parseUri(this.urlString);
            return;
        }
        finish();
        int i4 = getSponsorBeneficiariesState + 57;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    private void parseUri(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 33;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.uri = Uri.parse(str);
            int i4 = getSponsorBeneficiariesState + 37;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
            this.uri = null;
        }
        Uri uri = this.uri;
        if (uri == null) {
            return;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return;
        }
        String lowerCase = scheme.toLowerCase(Locale.ENGLISH);
        getQuerys(this.uri);
        redirect(lowerCase);
    }

    private void getQuerys(Uri uri) {
        int i = 2 % 2;
        this.queryParams = new HashMap<>();
        Iterator<String> it = SafeUri.getQueryParameterNames(uri).iterator();
        while (it.hasNext()) {
            int i2 = getSponsorBeneficiariesState + 67;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 == 0) {
                String next = it.next();
                this.queryParams.put(next, SafeUri.getQueryParameter(uri, next));
                int i3 = 48 / 0;
            } else {
                String next2 = it.next();
                this.queryParams.put(next2, SafeUri.getQueryParameter(uri, next2));
            }
        }
        int i4 = getSponsorBeneficiariesState + 123;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    private void redirect(String str) {
        int i = 2 % 2;
        if (!str.equals(RouteUtils.SCHEME_NATIVE)) {
            finish();
        } else if (!TextUtils.isEmpty(this.mAppId)) {
            ((PwaViewModel) this.viewModel).getH5AccessToken(new H5AccessTokenRequest(this.mAppId));
            int i2 = ArtificialStackFrames + 85;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = ArtificialStackFrames + 37;
            getSponsorBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
                return;
            }
            return;
        }
        int i6 = getSponsorBeneficiariesState + 73;
        ArtificialStackFrames = i6 % 128;
        int i7 = i6 % 2;
    }

    private void getAccessTokenResult(GetH5AccessTokenResp getH5AccessTokenResp) throws Throwable {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 107;
        ArtificialStackFrames = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String accessToken = getH5AccessTokenResp.getAccessToken();
            String tradeType = getH5AccessTokenResp.getTradeType();
            String appId = getH5AccessTokenResp.getAppId();
            String url = getH5AccessTokenResp.getUrl();
            if (TextUtils.isEmpty(accessToken)) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.mUrl)) {
                url = this.mUrl;
            }
            if (!TextUtils.isEmpty(url)) {
                if (this.queryParams == null) {
                    this.queryParams = new HashMap<>();
                }
                this.queryParams.put("tradeType", tradeType);
                this.queryParams.put("token", accessToken);
                this.queryParams.put("appId", appId);
                RouteUtils.routeWithExecute((Activity) null, url, this.queryParams);
                finish();
                return;
            }
            int i3 = ArtificialStackFrames + 5;
            getSponsorBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                finish();
                return;
            } else {
                finish();
                int i4 = 47 / 0;
                return;
            }
        }
        String accessToken2 = getH5AccessTokenResp.getAccessToken();
        getH5AccessTokenResp.getTradeType();
        getH5AccessTokenResp.getAppId();
        getH5AccessTokenResp.getUrl();
        TextUtils.isEmpty(accessToken2);
        obj.hashCode();
        throw null;
    }

    private void getAccessTokenResultFail() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 7;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = ArtificialStackFrames + 19;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 21;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.layout_transparent;
        int i5 = getSponsorBeneficiariesState + 3;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(76:0|2|(2:(2:9|(2:11|(2:16|(1:20)(1:19))(0))(2:14|(0)(0)))(1:21)|(8:860|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|857|36|(2:822|38)|43|44|851|(5:46|47|(1:49)|50|51)(25:52|53|853|54|55|839|56|(2:904|58)|62|63|820|64|(2:810|66)|70|71|72|(3:74|886|75)|79|80|814|81|(2:826|83)(1:85)|86|(1:88)|89)|90|(4:93|(2:95|910)(11:96|(3:98|(4:101|102|103|99)|911)|106|800|107|(1:109)|110|111|902|112|909)|113|91)|908|125|159|859|160|(1:162)|163|(3:165|(1:167)|168)(14:170|171|855|172|(1:174)|175|176|177|(1:179)|180|(1:182)|183|(1:185)|186)|169|187|(9:190|845|191|(1:193)|194|195|196|837|197)|227|824|228|(2:847|230)|235|(2:237|238)|239|240|(1:897)|(5:242|243|(1:245)|246|247)(41:248|(3:849|250|(1:256)(1:255))(1:260)|(19:812|262|802|263|(2:870|265)|269|270|900|271|(2:816|273)|277|278|279|(1:281)|282|(1:284)(1:286)|287|(1:289)|290)|339|(4:865|356|(36:361|841|368|(1:370)|371|828|372|(1:374)|375|399|808|400|(3:402|836|403)|407|408|894|(5:410|411|(1:413)|414|415)(21:416|417|906|418|(2:888|420)|424|425|895|426|(2:806|428)|432|433|434|(2:436|437)|438|439|440|(1:442)(1:443)|444|(1:446)|447)|448|(4:452|(2:454|932)(11:455|(3:457|(3:460|461|458)|933)|462|882|463|(1:465)|466|467|872|468|931)|469|449)|930|451|509|(1:511)|512|(1:514)|515|(3:517|(1:519)|520)(16:522|523|(1:525)|526|(1:528)|529|530|(1:532)|533|830|534|535|(1:537)|538|(1:540)|541)|521|542|(1:544)(9:545|(3:547|(2:550|548)|929)|551|552|(1:554)|555|(1:557)|558|559)|560|(1:562)|563|(3:565|(1:567)|568)(14:569|570|(1:572)|573|574|(1:576)|577|878|578|579|(1:581)|582|(1:584)|585)|586|(25:588|852|589|(1:591)|592|(1:594)|595|(3:597|(1:599)|600)(17:601|(2:603|(1:609)(1:608))|(19:611|612|843|613|(1:615)|616|617|832|618|(1:620)|621|622|623|(1:625)|626|(1:628)|629|(1:631)|632)|690|(1:692)|693|(3:695|(1:697)|698)(13:700|861|701|702|(1:704)|705|834|706|707|(1:709)|710|(1:712)|713)|699|714|(6:717|718|(1:720)|721|722|723)|724|(1:726)|727|(3:729|(1:731)|732)(14:734|735|(1:737)|738|739|(1:741)|742|880|743|744|(1:746)|747|(1:749)|750)|733|751|(1:934)(7:754|755|(1:757)|758|759|760|761))|633|(4:636|(3:918|638|921)(12:917|639|(3:641|(4:644|(3:924|646|927)(4:923|647|648|926)|925|642)|922)|649|818|650|(1:652)|653|654|804|655|920)|919|634)|916|690|(0)|693|(0)(0)|699|714|(0)|724|(0)|727|(0)(0)|733|751|(0)(0))(10:771|(3:773|(2:776|774)|928)|777|778|(1:780)|781|(1:783)|784|785|786))|362)(1:366)|367|841|368|(0)|371|828|372|(0)|375|399|808|400|(0)|407|408|894|(0)(0)|448|(1:449)|930|451|509|(0)|512|(0)|515|(0)(0)|521|542|(0)(0)|560|(0)|563|(0)(0)|586|(0)(0))|291|(4:294|(2:296|914)(11:297|(3:299|(3:302|303|300)|915)|304|884|305|(1:307)|308|309|874|310|913)|311|292)|912|339|(0)(0)|367|841|368|(0)|371|828|372|(0)|375|399|808|400|(0)|407|408|894|(0)(0)|448|(1:449)|930|451|509|(0)|512|(0)|515|(0)(0)|521|542|(0)(0)|560|(0)|563|(0)(0)|586|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x1e11, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x1e12, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x1e2e, code lost:
    
        r1 = r0;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0bc9 A[Catch: all -> 0x06e2, TryCatch #32 {all -> 0x06e2, blocks: (B:153:0x0bc3, B:155:0x0bc9, B:156:0x0bf1, B:349:0x16a0, B:351:0x16a6, B:352:0x16d1, B:503:0x1f47, B:505:0x1f4d, B:506:0x1f7d, B:718:0x33ec, B:720:0x33f2, B:721:0x341b, B:755:0x3727, B:757:0x372d, B:758:0x3751, B:735:0x3567, B:737:0x358a, B:738:0x35dd, B:684:0x30ac, B:686:0x30b2, B:687:0x30e3, B:778:0x3824, B:780:0x382a, B:781:0x3852, B:783:0x388c, B:784:0x38d3, B:570:0x2883, B:572:0x2898, B:573:0x28ce, B:552:0x2540, B:554:0x2546, B:555:0x2571, B:557:0x25ab, B:558:0x25f4, B:523:0x21be, B:525:0x21d3, B:526:0x2209, B:528:0x223d, B:529:0x22b8, B:393:0x1935, B:395:0x193b, B:396:0x1967, B:221:0x1044, B:223:0x104a, B:224:0x1073, B:23:0x022f, B:25:0x0235, B:26:0x025d, B:28:0x064e, B:30:0x0680, B:31:0x06dc, B:589:0x2b0d, B:591:0x2b13, B:592:0x2b5a, B:594:0x2b81, B:595:0x2bca, B:597:0x2bdd, B:599:0x2be6, B:600:0x2c2d, B:633:0x2e83, B:634:0x2e87, B:636:0x2e8d, B:639:0x2ea5, B:642:0x2eb2, B:646:0x2ec1, B:647:0x2ec9, B:659:0x2faa, B:661:0x2fb0, B:662:0x2fb1, B:664:0x2fb3, B:666:0x2fba, B:667:0x2fbb, B:603:0x2c3c, B:605:0x2c40, B:609:0x2c4c, B:611:0x2c52, B:623:0x2d66, B:625:0x2d6c, B:626:0x2db5, B:628:0x2ddf, B:629:0x2e25, B:631:0x2e3b, B:632:0x2e7d, B:669:0x2fbd, B:671:0x2fc4, B:672:0x2fc5, B:674:0x2fc7, B:676:0x2fce, B:677:0x2fcf, B:655:0x2f30, B:650:0x2ef7, B:652:0x2efd, B:653:0x2f28, B:618:0x2cc1, B:620:0x2ce0, B:621:0x2d5a, B:613:0x2c72, B:615:0x2c87, B:616:0x2cba, B:160:0x0c74, B:162:0x0c7a, B:163:0x0cc2, B:165:0x0ccf, B:167:0x0cd8, B:168:0x0d1e, B:187:0x0ed4, B:195:0x0f40, B:201:0x0fc2, B:203:0x0fc8, B:204:0x0fc9, B:206:0x0fcb, B:208:0x0fd2, B:209:0x0fd3, B:170:0x0d2a, B:177:0x0db6, B:179:0x0dbc, B:180:0x0dff, B:182:0x0e29, B:183:0x0e6e, B:185:0x0e84, B:186:0x0ecc, B:211:0x0fd5, B:213:0x0fdc, B:214:0x0fdd, B:197:0x0f46, B:191:0x0f08, B:193:0x0f0e, B:194:0x0f39, B:172:0x0d4a, B:174:0x0d5c, B:175:0x0daa, B:356:0x174f, B:358:0x1753, B:379:0x183d, B:381:0x1843, B:382:0x1844, B:384:0x1846, B:386:0x184d, B:387:0x184e, B:362:0x1760), top: B:860:0x022f, inners: #27, #31, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c7a A[Catch: all -> 0x0fde, TryCatch #31 {all -> 0x0fde, blocks: (B:160:0x0c74, B:162:0x0c7a, B:163:0x0cc2, B:165:0x0ccf, B:167:0x0cd8, B:168:0x0d1e, B:187:0x0ed4, B:195:0x0f40, B:201:0x0fc2, B:203:0x0fc8, B:204:0x0fc9, B:206:0x0fcb, B:208:0x0fd2, B:209:0x0fd3, B:170:0x0d2a, B:177:0x0db6, B:179:0x0dbc, B:180:0x0dff, B:182:0x0e29, B:183:0x0e6e, B:185:0x0e84, B:186:0x0ecc, B:211:0x0fd5, B:213:0x0fdc, B:214:0x0fdd, B:197:0x0f46, B:191:0x0f08, B:193:0x0f0e, B:194:0x0f39, B:172:0x0d4a, B:174:0x0d5c, B:175:0x0daa), top: B:859:0x0c74, outer: #32, inners: #19, #23, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0ccf A[Catch: all -> 0x0fde, TryCatch #31 {all -> 0x0fde, blocks: (B:160:0x0c74, B:162:0x0c7a, B:163:0x0cc2, B:165:0x0ccf, B:167:0x0cd8, B:168:0x0d1e, B:187:0x0ed4, B:195:0x0f40, B:201:0x0fc2, B:203:0x0fc8, B:204:0x0fc9, B:206:0x0fcb, B:208:0x0fd2, B:209:0x0fd3, B:170:0x0d2a, B:177:0x0db6, B:179:0x0dbc, B:180:0x0dff, B:182:0x0e29, B:183:0x0e6e, B:185:0x0e84, B:186:0x0ecc, B:211:0x0fd5, B:213:0x0fdc, B:214:0x0fdd, B:197:0x0f46, B:191:0x0f08, B:193:0x0f0e, B:194:0x0f39, B:172:0x0d4a, B:174:0x0d5c, B:175:0x0daa), top: B:859:0x0c74, outer: #32, inners: #19, #23, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0d2a A[Catch: all -> 0x0fde, TRY_LEAVE, TryCatch #31 {all -> 0x0fde, blocks: (B:160:0x0c74, B:162:0x0c7a, B:163:0x0cc2, B:165:0x0ccf, B:167:0x0cd8, B:168:0x0d1e, B:187:0x0ed4, B:195:0x0f40, B:201:0x0fc2, B:203:0x0fc8, B:204:0x0fc9, B:206:0x0fcb, B:208:0x0fd2, B:209:0x0fd3, B:170:0x0d2a, B:177:0x0db6, B:179:0x0dbc, B:180:0x0dff, B:182:0x0e29, B:183:0x0e6e, B:185:0x0e84, B:186:0x0ecc, B:211:0x0fd5, B:213:0x0fdc, B:214:0x0fdd, B:197:0x0f46, B:191:0x0f08, B:193:0x0f0e, B:194:0x0f39, B:172:0x0d4a, B:174:0x0d5c, B:175:0x0daa), top: B:859:0x0c74, outer: #32, inners: #19, #23, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0ee6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x117d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x11d4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1236  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x14f6 A[Catch: all -> 0x162f, TryCatch #6 {all -> 0x162f, blocks: (B:291:0x14ec, B:292:0x14f0, B:294:0x14f6, B:297:0x1512, B:262:0x1255, B:279:0x13c4, B:282:0x1411, B:287:0x1487, B:290:0x14e6), top: B:812:0x1255 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x16a6 A[Catch: all -> 0x06e2, TryCatch #32 {all -> 0x06e2, blocks: (B:153:0x0bc3, B:155:0x0bc9, B:156:0x0bf1, B:349:0x16a0, B:351:0x16a6, B:352:0x16d1, B:503:0x1f47, B:505:0x1f4d, B:506:0x1f7d, B:718:0x33ec, B:720:0x33f2, B:721:0x341b, B:755:0x3727, B:757:0x372d, B:758:0x3751, B:735:0x3567, B:737:0x358a, B:738:0x35dd, B:684:0x30ac, B:686:0x30b2, B:687:0x30e3, B:778:0x3824, B:780:0x382a, B:781:0x3852, B:783:0x388c, B:784:0x38d3, B:570:0x2883, B:572:0x2898, B:573:0x28ce, B:552:0x2540, B:554:0x2546, B:555:0x2571, B:557:0x25ab, B:558:0x25f4, B:523:0x21be, B:525:0x21d3, B:526:0x2209, B:528:0x223d, B:529:0x22b8, B:393:0x1935, B:395:0x193b, B:396:0x1967, B:221:0x1044, B:223:0x104a, B:224:0x1073, B:23:0x022f, B:25:0x0235, B:26:0x025d, B:28:0x064e, B:30:0x0680, B:31:0x06dc, B:589:0x2b0d, B:591:0x2b13, B:592:0x2b5a, B:594:0x2b81, B:595:0x2bca, B:597:0x2bdd, B:599:0x2be6, B:600:0x2c2d, B:633:0x2e83, B:634:0x2e87, B:636:0x2e8d, B:639:0x2ea5, B:642:0x2eb2, B:646:0x2ec1, B:647:0x2ec9, B:659:0x2faa, B:661:0x2fb0, B:662:0x2fb1, B:664:0x2fb3, B:666:0x2fba, B:667:0x2fbb, B:603:0x2c3c, B:605:0x2c40, B:609:0x2c4c, B:611:0x2c52, B:623:0x2d66, B:625:0x2d6c, B:626:0x2db5, B:628:0x2ddf, B:629:0x2e25, B:631:0x2e3b, B:632:0x2e7d, B:669:0x2fbd, B:671:0x2fc4, B:672:0x2fc5, B:674:0x2fc7, B:676:0x2fce, B:677:0x2fcf, B:655:0x2f30, B:650:0x2ef7, B:652:0x2efd, B:653:0x2f28, B:618:0x2cc1, B:620:0x2ce0, B:621:0x2d5a, B:613:0x2c72, B:615:0x2c87, B:616:0x2cba, B:160:0x0c74, B:162:0x0c7a, B:163:0x0cc2, B:165:0x0ccf, B:167:0x0cd8, B:168:0x0d1e, B:187:0x0ed4, B:195:0x0f40, B:201:0x0fc2, B:203:0x0fc8, B:204:0x0fc9, B:206:0x0fcb, B:208:0x0fd2, B:209:0x0fd3, B:170:0x0d2a, B:177:0x0db6, B:179:0x0dbc, B:180:0x0dff, B:182:0x0e29, B:183:0x0e6e, B:185:0x0e84, B:186:0x0ecc, B:211:0x0fd5, B:213:0x0fdc, B:214:0x0fdd, B:197:0x0f46, B:191:0x0f08, B:193:0x0f0e, B:194:0x0f39, B:172:0x0d4a, B:174:0x0d5c, B:175:0x0daa, B:356:0x174f, B:358:0x1753, B:379:0x183d, B:381:0x1843, B:382:0x1844, B:384:0x1846, B:386:0x184d, B:387:0x184e, B:362:0x1760), top: B:860:0x022f, inners: #27, #31, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1769  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x1780 A[Catch: all -> 0x1845, TryCatch #21 {all -> 0x1845, blocks: (B:368:0x176b, B:370:0x1780, B:371:0x17b1), top: B:841:0x176b, outer: #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x17c4 A[Catch: all -> 0x183b, TryCatch #14 {all -> 0x183b, blocks: (B:372:0x17b7, B:374:0x17c4, B:375:0x1833), top: B:828:0x17b7, outer: #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x19f8  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1a53  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x1aa7 A[Catch: all -> 0x1e2b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x1e2b, blocks: (B:400:0x19f2, B:407:0x1a46, B:416:0x1aa7, B:434:0x1bbd, B:438:0x1c08), top: B:808:0x19f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x1cf2 A[Catch: all -> 0x1e11, TryCatch #50 {all -> 0x1e11, blocks: (B:448:0x1ce5, B:449:0x1ce9, B:452:0x1cf2, B:455:0x1d0b, B:458:0x1d18, B:460:0x1d1b, B:472:0x1dff, B:474:0x1e05, B:475:0x1e06, B:477:0x1e08, B:479:0x1e0f, B:480:0x1e10, B:440:0x1c17, B:442:0x1c34, B:444:0x1c80, B:446:0x1c97, B:447:0x1cdd, B:485:0x1e17, B:487:0x1e1d, B:488:0x1e1e, B:491:0x1e23, B:493:0x1e29, B:494:0x1e2a, B:468:0x1d84, B:463:0x1d4a, B:465:0x1d50, B:466:0x1d7c), top: B:894:0x1a51, inners: #39, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x1f4d A[Catch: all -> 0x06e2, TryCatch #32 {all -> 0x06e2, blocks: (B:153:0x0bc3, B:155:0x0bc9, B:156:0x0bf1, B:349:0x16a0, B:351:0x16a6, B:352:0x16d1, B:503:0x1f47, B:505:0x1f4d, B:506:0x1f7d, B:718:0x33ec, B:720:0x33f2, B:721:0x341b, B:755:0x3727, B:757:0x372d, B:758:0x3751, B:735:0x3567, B:737:0x358a, B:738:0x35dd, B:684:0x30ac, B:686:0x30b2, B:687:0x30e3, B:778:0x3824, B:780:0x382a, B:781:0x3852, B:783:0x388c, B:784:0x38d3, B:570:0x2883, B:572:0x2898, B:573:0x28ce, B:552:0x2540, B:554:0x2546, B:555:0x2571, B:557:0x25ab, B:558:0x25f4, B:523:0x21be, B:525:0x21d3, B:526:0x2209, B:528:0x223d, B:529:0x22b8, B:393:0x1935, B:395:0x193b, B:396:0x1967, B:221:0x1044, B:223:0x104a, B:224:0x1073, B:23:0x022f, B:25:0x0235, B:26:0x025d, B:28:0x064e, B:30:0x0680, B:31:0x06dc, B:589:0x2b0d, B:591:0x2b13, B:592:0x2b5a, B:594:0x2b81, B:595:0x2bca, B:597:0x2bdd, B:599:0x2be6, B:600:0x2c2d, B:633:0x2e83, B:634:0x2e87, B:636:0x2e8d, B:639:0x2ea5, B:642:0x2eb2, B:646:0x2ec1, B:647:0x2ec9, B:659:0x2faa, B:661:0x2fb0, B:662:0x2fb1, B:664:0x2fb3, B:666:0x2fba, B:667:0x2fbb, B:603:0x2c3c, B:605:0x2c40, B:609:0x2c4c, B:611:0x2c52, B:623:0x2d66, B:625:0x2d6c, B:626:0x2db5, B:628:0x2ddf, B:629:0x2e25, B:631:0x2e3b, B:632:0x2e7d, B:669:0x2fbd, B:671:0x2fc4, B:672:0x2fc5, B:674:0x2fc7, B:676:0x2fce, B:677:0x2fcf, B:655:0x2f30, B:650:0x2ef7, B:652:0x2efd, B:653:0x2f28, B:618:0x2cc1, B:620:0x2ce0, B:621:0x2d5a, B:613:0x2c72, B:615:0x2c87, B:616:0x2cba, B:160:0x0c74, B:162:0x0c7a, B:163:0x0cc2, B:165:0x0ccf, B:167:0x0cd8, B:168:0x0d1e, B:187:0x0ed4, B:195:0x0f40, B:201:0x0fc2, B:203:0x0fc8, B:204:0x0fc9, B:206:0x0fcb, B:208:0x0fd2, B:209:0x0fd3, B:170:0x0d2a, B:177:0x0db6, B:179:0x0dbc, B:180:0x0dff, B:182:0x0e29, B:183:0x0e6e, B:185:0x0e84, B:186:0x0ecc, B:211:0x0fd5, B:213:0x0fdc, B:214:0x0fdd, B:197:0x0f46, B:191:0x0f08, B:193:0x0f0e, B:194:0x0f39, B:172:0x0d4a, B:174:0x0d5c, B:175:0x0daa, B:356:0x174f, B:358:0x1753, B:379:0x183d, B:381:0x1843, B:382:0x1844, B:384:0x1846, B:386:0x184d, B:387:0x184e, B:362:0x1760), top: B:860:0x022f, inners: #27, #31, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x2011  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x207c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x20d9  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x21a0  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x23f2  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x24f6  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x2722  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x2773  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x2863  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2a03  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x3166  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x31b3  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x320f  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x33cd  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x34a8  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x34f7  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x3549  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x3707  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x37ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x1104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:865:0x174f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:934:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v180 */
    /* JADX WARN: Type inference failed for: r10v181 */
    /* JADX WARN: Type inference failed for: r10v182 */
    /* JADX WARN: Type inference failed for: r10v183 */
    /* JADX WARN: Type inference failed for: r10v184 */
    /* JADX WARN: Type inference failed for: r10v187 */
    /* JADX WARN: Type inference failed for: r10v188 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v154 */
    /* JADX WARN: Type inference failed for: r11v155 */
    /* JADX WARN: Type inference failed for: r11v156 */
    /* JADX WARN: Type inference failed for: r11v157 */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v167 */
    /* JADX WARN: Type inference failed for: r11v168 */
    /* JADX WARN: Type inference failed for: r11v170 */
    /* JADX WARN: Type inference failed for: r11v171 */
    /* JADX WARN: Type inference failed for: r11v172 */
    /* JADX WARN: Type inference failed for: r11v173 */
    /* JADX WARN: Type inference failed for: r11v174 */
    /* JADX WARN: Type inference failed for: r11v175 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v181 */
    /* JADX WARN: Type inference failed for: r11v182 */
    /* JADX WARN: Type inference failed for: r11v188 */
    /* JADX WARN: Type inference failed for: r11v189 */
    /* JADX WARN: Type inference failed for: r11v191 */
    /* JADX WARN: Type inference failed for: r11v193 */
    /* JADX WARN: Type inference failed for: r11v194 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v196 */
    /* JADX WARN: Type inference failed for: r11v197 */
    /* JADX WARN: Type inference failed for: r11v198 */
    /* JADX WARN: Type inference failed for: r11v199, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v200 */
    /* JADX WARN: Type inference failed for: r11v202 */
    /* JADX WARN: Type inference failed for: r11v203 */
    /* JADX WARN: Type inference failed for: r11v204 */
    /* JADX WARN: Type inference failed for: r11v206 */
    /* JADX WARN: Type inference failed for: r11v207 */
    /* JADX WARN: Type inference failed for: r11v208 */
    /* JADX WARN: Type inference failed for: r11v209 */
    /* JADX WARN: Type inference failed for: r11v210 */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v214 */
    /* JADX WARN: Type inference failed for: r11v215 */
    /* JADX WARN: Type inference failed for: r11v216 */
    /* JADX WARN: Type inference failed for: r11v217 */
    /* JADX WARN: Type inference failed for: r11v218 */
    /* JADX WARN: Type inference failed for: r11v219 */
    /* JADX WARN: Type inference failed for: r11v220 */
    /* JADX WARN: Type inference failed for: r11v221 */
    /* JADX WARN: Type inference failed for: r11v222 */
    /* JADX WARN: Type inference failed for: r11v223 */
    /* JADX WARN: Type inference failed for: r11v224 */
    /* JADX WARN: Type inference failed for: r11v225 */
    /* JADX WARN: Type inference failed for: r11v226 */
    /* JADX WARN: Type inference failed for: r11v227 */
    /* JADX WARN: Type inference failed for: r11v228 */
    /* JADX WARN: Type inference failed for: r11v229 */
    /* JADX WARN: Type inference failed for: r11v230 */
    /* JADX WARN: Type inference failed for: r11v231 */
    /* JADX WARN: Type inference failed for: r11v232 */
    /* JADX WARN: Type inference failed for: r11v233 */
    /* JADX WARN: Type inference failed for: r11v234 */
    /* JADX WARN: Type inference failed for: r11v235 */
    /* JADX WARN: Type inference failed for: r11v236 */
    /* JADX WARN: Type inference failed for: r11v237 */
    /* JADX WARN: Type inference failed for: r11v238 */
    /* JADX WARN: Type inference failed for: r11v239 */
    /* JADX WARN: Type inference failed for: r11v240 */
    /* JADX WARN: Type inference failed for: r11v241 */
    /* JADX WARN: Type inference failed for: r11v242 */
    /* JADX WARN: Type inference failed for: r11v243 */
    /* JADX WARN: Type inference failed for: r11v244 */
    /* JADX WARN: Type inference failed for: r11v245 */
    /* JADX WARN: Type inference failed for: r11v246 */
    /* JADX WARN: Type inference failed for: r11v247 */
    /* JADX WARN: Type inference failed for: r11v248 */
    /* JADX WARN: Type inference failed for: r11v249 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v143 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v94, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v571 */
    /* JADX WARN: Type inference failed for: r1v577 */
    /* JADX WARN: Type inference failed for: r1v578 */
    /* JADX WARN: Type inference failed for: r1v582, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v594, types: [int] */
    /* JADX WARN: Type inference failed for: r1v595 */
    /* JADX WARN: Type inference failed for: r1v596 */
    /* JADX WARN: Type inference failed for: r1v597 */
    /* JADX WARN: Type inference failed for: r1v598 */
    /* JADX WARN: Type inference failed for: r1v599 */
    /* JADX WARN: Type inference failed for: r1v600 */
    /* JADX WARN: Type inference failed for: r1v607 */
    /* JADX WARN: Type inference failed for: r1v742 */
    /* JADX WARN: Type inference failed for: r1v743 */
    /* JADX WARN: Type inference failed for: r1v744 */
    /* JADX WARN: Type inference failed for: r1v745 */
    /* JADX WARN: Type inference failed for: r1v746 */
    /* JADX WARN: Type inference failed for: r1v747 */
    /* JADX WARN: Type inference failed for: r1v748 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v2, types: [int] */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v25 */
    /* JADX WARN: Type inference failed for: r31v26 */
    /* JADX WARN: Type inference failed for: r31v27 */
    /* JADX WARN: Type inference failed for: r31v28 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v100 */
    /* JADX WARN: Type inference failed for: r35v102 */
    /* JADX WARN: Type inference failed for: r35v104 */
    /* JADX WARN: Type inference failed for: r35v105 */
    /* JADX WARN: Type inference failed for: r35v107 */
    /* JADX WARN: Type inference failed for: r35v108 */
    /* JADX WARN: Type inference failed for: r35v109 */
    /* JADX WARN: Type inference failed for: r35v110 */
    /* JADX WARN: Type inference failed for: r35v111 */
    /* JADX WARN: Type inference failed for: r35v113 */
    /* JADX WARN: Type inference failed for: r35v114 */
    /* JADX WARN: Type inference failed for: r35v119 */
    /* JADX WARN: Type inference failed for: r35v120 */
    /* JADX WARN: Type inference failed for: r35v121 */
    /* JADX WARN: Type inference failed for: r35v122 */
    /* JADX WARN: Type inference failed for: r35v123 */
    /* JADX WARN: Type inference failed for: r35v124 */
    /* JADX WARN: Type inference failed for: r35v125 */
    /* JADX WARN: Type inference failed for: r35v126 */
    /* JADX WARN: Type inference failed for: r35v127 */
    /* JADX WARN: Type inference failed for: r35v128 */
    /* JADX WARN: Type inference failed for: r35v129 */
    /* JADX WARN: Type inference failed for: r35v130 */
    /* JADX WARN: Type inference failed for: r35v131 */
    /* JADX WARN: Type inference failed for: r35v132 */
    /* JADX WARN: Type inference failed for: r35v133 */
    /* JADX WARN: Type inference failed for: r35v134 */
    /* JADX WARN: Type inference failed for: r35v135 */
    /* JADX WARN: Type inference failed for: r35v136 */
    /* JADX WARN: Type inference failed for: r35v137 */
    /* JADX WARN: Type inference failed for: r35v138 */
    /* JADX WARN: Type inference failed for: r35v139 */
    /* JADX WARN: Type inference failed for: r35v140 */
    /* JADX WARN: Type inference failed for: r35v141 */
    /* JADX WARN: Type inference failed for: r35v142 */
    /* JADX WARN: Type inference failed for: r35v143 */
    /* JADX WARN: Type inference failed for: r35v144 */
    /* JADX WARN: Type inference failed for: r35v145 */
    /* JADX WARN: Type inference failed for: r35v146 */
    /* JADX WARN: Type inference failed for: r35v147 */
    /* JADX WARN: Type inference failed for: r35v148 */
    /* JADX WARN: Type inference failed for: r35v149 */
    /* JADX WARN: Type inference failed for: r35v150 */
    /* JADX WARN: Type inference failed for: r35v151 */
    /* JADX WARN: Type inference failed for: r35v152 */
    /* JADX WARN: Type inference failed for: r35v153 */
    /* JADX WARN: Type inference failed for: r35v154 */
    /* JADX WARN: Type inference failed for: r35v155 */
    /* JADX WARN: Type inference failed for: r35v156 */
    /* JADX WARN: Type inference failed for: r35v157 */
    /* JADX WARN: Type inference failed for: r35v158 */
    /* JADX WARN: Type inference failed for: r35v159 */
    /* JADX WARN: Type inference failed for: r35v160 */
    /* JADX WARN: Type inference failed for: r35v161 */
    /* JADX WARN: Type inference failed for: r35v162 */
    /* JADX WARN: Type inference failed for: r35v163 */
    /* JADX WARN: Type inference failed for: r35v18 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v62 */
    /* JADX WARN: Type inference failed for: r35v64 */
    /* JADX WARN: Type inference failed for: r35v65 */
    /* JADX WARN: Type inference failed for: r35v66 */
    /* JADX WARN: Type inference failed for: r35v67 */
    /* JADX WARN: Type inference failed for: r35v68 */
    /* JADX WARN: Type inference failed for: r35v69 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v71 */
    /* JADX WARN: Type inference failed for: r35v72 */
    /* JADX WARN: Type inference failed for: r35v77 */
    /* JADX WARN: Type inference failed for: r35v78 */
    /* JADX WARN: Type inference failed for: r35v79 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v80 */
    /* JADX WARN: Type inference failed for: r35v83 */
    /* JADX WARN: Type inference failed for: r35v84 */
    /* JADX WARN: Type inference failed for: r35v85 */
    /* JADX WARN: Type inference failed for: r35v86 */
    /* JADX WARN: Type inference failed for: r35v87 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r35v92 */
    /* JADX WARN: Type inference failed for: r35v93, types: [long] */
    /* JADX WARN: Type inference failed for: r35v94 */
    /* JADX WARN: Type inference failed for: r35v96 */
    /* JADX WARN: Type inference failed for: r35v99 */
    /* JADX WARN: Type inference failed for: r3v606, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v618 */
    /* JADX WARN: Type inference failed for: r5v141, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v150, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v291 */
    /* JADX WARN: Type inference failed for: r5v613 */
    /* JADX WARN: Type inference failed for: r6v468, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v488 */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v139, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v159 */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v174 */
    /* JADX WARN: Type inference failed for: r7v175 */
    /* JADX WARN: Type inference failed for: r7v177, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v187 */
    /* JADX WARN: Type inference failed for: r7v188 */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v262 */
    /* JADX WARN: Type inference failed for: r7v263 */
    /* JADX WARN: Type inference failed for: r7v264 */
    /* JADX WARN: Type inference failed for: r7v265 */
    /* JADX WARN: Type inference failed for: r7v266 */
    /* JADX WARN: Type inference failed for: r7v267 */
    /* JADX WARN: Type inference failed for: r7v268 */
    /* JADX WARN: Type inference failed for: r7v269 */
    /* JADX WARN: Type inference failed for: r7v270 */
    /* JADX WARN: Type inference failed for: r7v271 */
    /* JADX WARN: Type inference failed for: r7v272 */
    /* JADX WARN: Type inference failed for: r7v273 */
    /* JADX WARN: Type inference failed for: r7v274 */
    /* JADX WARN: Type inference failed for: r7v275 */
    /* JADX WARN: Type inference failed for: r7v276 */
    /* JADX WARN: Type inference failed for: r7v277 */
    /* JADX WARN: Type inference failed for: r7v278 */
    /* JADX WARN: Type inference failed for: r7v279 */
    /* JADX WARN: Type inference failed for: r7v280 */
    /* JADX WARN: Type inference failed for: r7v285 */
    /* JADX WARN: Type inference failed for: r7v286 */
    /* JADX WARN: Type inference failed for: r7v287 */
    /* JADX WARN: Type inference failed for: r7v288 */
    /* JADX WARN: Type inference failed for: r7v289 */
    /* JADX WARN: Type inference failed for: r7v290 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v94, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX WARN: Type inference failed for: r8v350 */
    /* JADX WARN: Type inference failed for: r8v351 */
    /* JADX WARN: Type inference failed for: r8v352 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v357 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v147 */
    /* JADX WARN: Type inference failed for: r9v148 */
    /* JADX WARN: Type inference failed for: r9v149 */
    /* JADX WARN: Type inference failed for: r9v150 */
    /* JADX WARN: Type inference failed for: r9v151 */
    /* JADX WARN: Type inference failed for: r9v160 */
    /* JADX WARN: Type inference failed for: r9v161 */
    /* JADX WARN: Type inference failed for: r9v163 */
    /* JADX WARN: Type inference failed for: r9v164 */
    /* JADX WARN: Type inference failed for: r9v165 */
    /* JADX WARN: Type inference failed for: r9v166 */
    /* JADX WARN: Type inference failed for: r9v167 */
    /* JADX WARN: Type inference failed for: r9v168 */
    /* JADX WARN: Type inference failed for: r9v170 */
    /* JADX WARN: Type inference failed for: r9v171 */
    /* JADX WARN: Type inference failed for: r9v177, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v182 */
    /* JADX WARN: Type inference failed for: r9v183 */
    /* JADX WARN: Type inference failed for: r9v184 */
    /* JADX WARN: Type inference failed for: r9v185 */
    /* JADX WARN: Type inference failed for: r9v186 */
    /* JADX WARN: Type inference failed for: r9v187 */
    /* JADX WARN: Type inference failed for: r9v188 */
    /* JADX WARN: Type inference failed for: r9v189 */
    /* JADX WARN: Type inference failed for: r9v190 */
    /* JADX WARN: Type inference failed for: r9v191 */
    /* JADX WARN: Type inference failed for: r9v192 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v70 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.ui.activity.GetAccessTokenActivity.attachBaseContext(android.content.Context):void");
    }

    static void m12246$$Nest$mgetAccessTokenResult(GetAccessTokenActivity getAccessTokenActivity, GetH5AccessTokenResp getH5AccessTokenResp) throws Throwable {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 9;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        getAccessTokenActivity.getAccessTokenResult(getH5AccessTokenResp);
        int i4 = getSponsorBeneficiariesState + 69;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void m12247$$Nest$mgetAccessTokenResultFail(GetAccessTokenActivity getAccessTokenActivity) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 71;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        getAccessTokenActivity.getAccessTokenResultFail();
        int i4 = getSponsorBeneficiariesState + 1;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 59;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 115;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ArtificialStackFrames + 35;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        getShareableDataState = 0;
        component1();
        copydefault = new char[]{30416, 30404, 30410, 30341, 30415, 30402, 30422, 30268, 30418, 30414, 30419, 30412, 30403, 30411, 30407, 30270, 30405, 30400, 30401, 30417, 30408, 30265, 30432, 30435, 30355, 30448};
        component3 = 321287863;
        ShareDataUIState = true;
        component2 = true;
        int i = toString + 11;
        getShareableDataState = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = new char[]{33517, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33504, 33470, 33455, 33462, 33467, 33459, 33452, 33461, 33464, 33445, 33322, 33324, 33322, 33326, 33334, 33330, 33326, 33322, 33320, 33280, 33342, 33319, 33327, 33325, 33318, 33317, 33324, 33366, 33349, 33368, 33364, 33351, 33361, 33349, 33419, 33367, 33366, 33410, 33413, 33415, 33415, 33411, 33416, 33412, 33413, 33363, 33414, 33410, 33409, 33412, 33411, 33418, 33418, 33471, 33350, 33353, 33349, 33349, 33361, 33350, 33349, 33355, 33364, 33347, 33364, 33418, 33415, 33347, 33418, 33349, 33350, 33364, 33362, 33355, 33360, 33418, 33360, 33353, 33368, 33418, 33356, 33354, 33366, 33419, 33364, 33351, 33368, 33348, 33352, 33350, 33365, 33351, 33368, 33348, 33362, 33419, 33349, 33350, 33368, 33504, 33443, 33445, 33440, 33368, 33371, 33371, 33363, 33449, 33461, 33375, 33372, 33460, 33456, 33440, 33445, 33441, 33316, 33338, 33337, 33320, 33317, 33758, 33755, 33323, 33297, 33281, 33312, 33283, 33288, 33323, 33317, 33313, 33318, 33320, 33322, 33323, 33322, 33434, 33366, 33363, 33361, 33371, 33374, 33446, 33446, 33373, 33365, 33360, 33369, 33371, 33369, 33372, 33476, 33512, 33514, 33515, 33513, 33512, 33513, 33513, 33514, 33516, 33517, 33477, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33515, 33515, 33419, 33398, 33359, 33449, 33446, 33441, 33355, 33398, 33355, 33355, 33397, 33357, 33359, 33397, 33354, 33354, 33356, 33359, 33360, 33359, 33397, 33358, 33447, 33357, 33355, 33443, 33444, 33442, 33443, 33443, 33355, 33355, 33444, 33357, 33357, 33359, 33398, 33356, 33443, 33445, 33446, 33357, 33398, 33399, 33358, 33355, 33356, 33444, 33356, 33359, 33447, 33445, 33358, 33398, 33357, 33358, 33356, 33357, 33400, 33399, 33360, 33359, 33355, 33354, 33370, 33323, 33323, 33322, 33320, 33745, 33323, 33281, 33342, 33343, 33320, 33745, 33745, 33321, 33281, 33280, 33343, 33280, 33282, 33283, 33323, 33320, 33280, 33324, 33324, 33285, 33322, 33322, 33283, 33280, 33343, 33280, 33341, 33341, 33280, 33343, 33281, 33284, 33283, 33322, 33320, 33281, 33281, 33281, 33322, 33320, 33321, 33746, 33319, 33342, 33321, 33747, 33323, 33322, 33743, 33321, 33282, 33280, 33321, 33746, 33320, 33342, 33341, 33319, 33475, 33512, 33515, 33514, 33514, 33514, 33511, 33512, 33515, 33516, 33516};
        getRequestBeneficiariesState = -1968240900;
        equals = -238323890;
        component4 = -222296181;
        copy = new byte[]{-1, -58, -98, -50, -79, -72, -95, -74, -128, 89, -77, -119, -95, -117, -93, -113, -98, -127, 122, PSSSigner.TRAILER_IMPLICIT, -115, -31, 118, -71, -90, -69, -118, -94, -117, 83, 96, 102, 98, 120, 97, 99, 8, 99, 95, 122, 100, 100, TarHeader.LF_SYMLINK, 97, 98, 101, 120, 98, 83, TarHeader.LF_CHR, 83, 121, TarHeader.LF_SYMLINK, 82, 102, TarHeader.LF_CONTIG, 81, 101, 121, TarHeader.LF_SYMLINK, 81, TarHeader.LF_BLK, 87, 111, 101, 102, TarHeader.LF_FIFO, 86, 62, 103, 81, 100, TarHeader.LF_DIR, -88, 109, 13, 63, 57, TarHeader.LF_NORMAL, 39, 59, TarHeader.LF_NORMAL, 57, 56, -52, 104, Base64.padSymbol, -63, Base64.padSymbol, 107, -56, 111, 38, 58, -53, 97, 34, Base64.padSymbol, -63, 58, 108, -55, 59, 63, 59, Ascii.ETB, TarHeader.LF_SYMLINK, -56, Ascii.SYN, 56, 60, 63, -53, Base64.padSymbol, Ascii.ETB, TarHeader.LF_LINK, 63, -12, 96, -56, 20, TarHeader.LF_SYMLINK, 57, -54, 58, 105, 57, TarHeader.LF_LINK, 63, -9, 110, -53, 58, 107, 62, 59, 56, -53, 108, 20, 57, 36, 58, 32, -53, 58, 39, 104, 38, 39, 46, -52, Ascii.DC2, 60, -12, 105, 33, TarHeader.LF_LINK, 33, 36, 59, 39, -56, Ascii.NAK, -54, 107, 57, -11, Ascii.NAK, 60, -16, 107, 38, -9, 105, 37, -56, Ascii.SYN, 36, 36, 57, Base64.padSymbol, 37, 38, -56, 36, 59, Ascii.NAK, Base64.padSymbol, 33, -55, 59, 38, Ascii.NAK, 57, 59, 34, Base64.padSymbol, -11, Ascii.DC2, -56, 108, 13, TarHeader.LF_NORMAL, Ascii.VT, Ascii.VT, Base64.padSymbol, -70, -76, 68, -20, -66, -74, -65, 68, -30, SignedBytes.MAX_POWER_OF_TWO, -32, -118, 76, -27, -65, 68, -25, -72, -78, -77, -78, -120, -66, -69, -117, -77, -76, -72, 71, -32, -80, -79, 70, -29, 78, -118, -91, -75, PSSSigner.TRAILER_IMPLICIT, -24, -23, 75, -67, -127, -71, -16, 65, -81, -103, -69, -54, -12, -10, -53, -52, -55, -52, -14, -49, -13, 81, -86, -87, -87, 80, 86, -87, -85, 85, -57, -47, -59, -37, -57, -33, -59, -47, -58, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    }
}
