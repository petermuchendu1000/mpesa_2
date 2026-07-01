package com.huawei.digitalpayment.common.theme.viewmodel.base;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/LogoutUiState;", "Lcom/huawei/http/BaseResp;", GriverMonitorConstants.KEY_IS_LOADING, "", "isLogout", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogoutUiState extends BaseResp {
    private static int ShareDataUIState;
    private static boolean component1;
    private static int component2;
    private static char[] component3;
    private static int component4;
    private static boolean copydefault;
    private final boolean isLoading;
    private final boolean isLogout;
    private static final byte[] $$c = {104, -2, Ascii.CAN, -74};
    private static final int $$f = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {79, Ascii.ETB, 89, Ascii.VT, -39, -25, -30, -26, -26, -18, -36, -33, 40};
    private static final int $$e = 87;
    private static final byte[] $$a = {4, -66, -36, 8, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_SYMLINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24};
    private static final int $$b = 32;
    private static int getAsAtTimestamp = 0;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r7, byte r8, byte r9) {
        /*
            int r7 = r7 + 65
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.$$i(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r9 = r9 + 10
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.$$a
            int r8 = r8 * 3
            int r8 = 27 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-16)
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.$$d
            int r8 = r8 * 2
            int r8 = r8 + 99
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r1 = 10 - r6
            byte[] r1 = new byte[r1]
            int r6 = 9 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-27)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LogoutUiState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 7;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            copy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i8 = copy + 113;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z2 = false;
        }
        this(z, z2);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 13;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isLoading;
        int i5 = i2 + 23;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isLogout() {
        int i = 2 % 2;
        int i2 = copy + 17;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isLogout;
        }
        throw null;
    }

    public LogoutUiState(boolean z, boolean z2) {
        this.isLoading = z;
        this.isLogout = z2;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr3 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $11 + 81;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3784, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 37, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 26860), 2015799920, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Gravity.getAbsoluteGravity(0, 0), 16 - View.MeasureSpec.getSize(0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            System.arraycopy(cArr4, 0, cArr3, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            int i10 = $11 + 57;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i3];
                iTrustedWebActivityServiceStub.ShareDataUIState = 1;
            } else {
                cArr2 = new char[i3];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i11 = $11 + 55;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 7406, 16 - View.MeasureSpec.getMode(0), (char) View.combineMeasuredStates(0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static void c(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        char c2 = '0';
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $10 + 49;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        int mode = 3760 - View.MeasureSpec.getMode(i4);
                        int iLastIndexOf = TextUtils.lastIndexOf("", c2) + 25;
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b2 = (byte) ($$f & 15);
                        byte b3 = (byte) (b2 - 4);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(mode, iLastIndexOf, maximumFlingVelocity, -1670574543, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    c2 = '0';
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - TextUtils.getOffsetBefore("", 0), 12 - TextUtils.indexOf((CharSequence) "", '0'), (char) Color.red(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i8 = 8;
        long j = 0;
        int i9 = 689978476;
        if (copydefault) {
            cancelVar.component1 = bArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i10 = $11 + 47;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) % cancelVar.component3] / i] >> iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i9);
                    if (objCopydefault3 == null) {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 2748;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19;
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 7644);
                        byte b4 = (byte) ($$c[1] + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, scrollDefaultDelay, cNormalizeMetaState, -327556343, false, $$i((byte) i8, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i9);
                    if (objCopydefault4 == null) {
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2748;
                        int iKeyCodeFromString = 19 - KeyEvent.keyCodeFromString("");
                        char c3 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7643);
                        byte b5 = (byte) i8;
                        byte b6 = (byte) ($$c[1] + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, iKeyCodeFromString, c3, -327556343, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                i8 = 8;
                i9 = 689978476;
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (component1) {
            int i11 = $10 + 55;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
                i2 = 0;
            } else {
                i2 = 0;
                cancelVar.component1 = cArr.length;
                cArr2 = new char[cancelVar.component1];
            }
            cancelVar.component3 = i2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $10 + 113;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    int iRgb = Color.rgb(0, 0, 0) + 16779964;
                    int i14 = 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    char c4 = (char) (7645 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b7 = (byte) ($$c[1] + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, i14, c4, -327556343, false, $$i((byte) 8, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            String str = new String(cArr2);
            int i15 = $10 + 41;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            objArr[0] = str;
            return;
        }
        int i17 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i17;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i18 = $11 + 125;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i17 = cancelVar.component3 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean component1() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.component1():boolean");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LogoutUiState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static LogoutUiState copy$default(LogoutUiState logoutUiState, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 65;
        copy = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = logoutUiState.isLoading;
            int i5 = i3 + 55;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 5;
            }
        }
        if ((i & 2) != 0) {
            int i7 = i3 + 17;
            copy = i7 % 128;
            int i8 = i7 % 2;
            z2 = logoutUiState.isLogout;
            if (i8 != 0) {
                int i9 = 43 / 0;
            }
        }
        return logoutUiState.copy(z, z2);
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.isLogout;
        int i5 = i3 + 121;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LogoutUiState copy(boolean isLoading, boolean isLogout) {
        int i = 2 % 2;
        LogoutUiState logoutUiState = new LogoutUiState(isLoading, isLogout);
        int i2 = getRequestBeneficiariesState + 111;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return logoutUiState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r7 = (com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r6.isLoading == r7.isLoading) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r7 = r2 + 67;
        com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.copy = r7 % 128;
        r7 = r7 % 2;
        r2 = r2 + 9;
        com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.copy = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r6.isLogout == r7.isLogout) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.copy
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 69
            int r1 = r1 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState
            if (r1 != 0) goto L1e
            return r4
        L1e:
            com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState r7 = (com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState) r7
            boolean r1 = r6.isLoading
            boolean r5 = r7.isLoading
            if (r1 == r5) goto L39
            int r7 = r2 + 67
            int r1 = r7 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.copy = r1
            int r7 = r7 % r0
            int r2 = r2 + 9
            int r7 = r2 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.copy = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L37
            return r4
        L37:
            r7 = 0
            throw r7
        L39:
            boolean r0 = r6.isLogout
            boolean r7 = r7.isLogout
            if (r0 == r7) goto L40
            return r4
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.LogoutUiState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isLogout);
        int i4 = copy + 63;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LogoutUiState(isLoading=" + this.isLoading + ", isLogout=" + this.isLogout + ")";
        int i2 = getRequestBeneficiariesState + 45;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        component4 = 1;
        component3();
        component3 = new char[]{30225, 30213, 30219, 30410, 30220, 30211, 30231, 30333, 30227, 30223, 30224, 30221, 30208, 30216, 30212, 30335, 30218, 30209, 30214, 30226, 30222, 30257, 30230, 30241, 30416, 30254, 30244, 30250, 30210, 30249, 30411, 30407, 30259, 30332, 30248, 30403};
        component2 = 321287924;
        component1 = true;
        copydefault = true;
        int i = getAsAtTimestamp + 27;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = -890926339;
    }
}
