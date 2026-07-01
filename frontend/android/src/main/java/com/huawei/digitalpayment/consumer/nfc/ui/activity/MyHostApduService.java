package com.huawei.digitalpayment.consumer.nfc.ui.activity;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.nfc.NdefMessage;
import android.nfc.cardemulation.HostApduService;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.safaricom.mpesa.logging.L;
import java.io.Serializable;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/ui/activity/MyHostApduService;", "Landroid/nfc/cardemulation/HostApduService;", "<init>", "()V", "mNdefRecord", "", "mAppSelected", "", "mCcSelected", "mNdefSelected", "onCreate", "", "initNdfMessageData", "getNdefUrlMessage", "Landroid/nfc/NdefMessage;", "processCommandApdu", "commandApdu", "extras", "Landroid/os/Bundle;", "onDeactivated", ImtConstants.KEY_REASON, "", "Companion", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyHostApduService extends HostApduService {
    private static final byte[] CONTAINER_FILE;

    public static final Companion INSTANCE;
    private static final byte[] FAILURE_RESULT;
    private static final byte[] SELECT_AID;
    private static final byte[] SELECT_CONTAINER;
    private static final byte[] SELECT_NDEF;
    private static final byte[] SUCCESS_RESULT;
    private static int ShareDataUIState = 0;
    private static final String TAG = "MyHostApduService";
    private static char[] component1;
    private static char component2;
    private static int component3;
    private static boolean copy;
    private static char[] copydefault;
    private static int equals;
    private static boolean getRequestBeneficiariesState;
    private boolean mAppSelected;
    private boolean mCcSelected;
    private byte[] mNdefRecord;
    private boolean mNdefSelected;
    private static final byte[] $$c = {105, -91, -115, Ascii.US};
    private static final int $$f = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, -24, -14, 98, Ascii.SO, 0, -61, TarHeader.LF_DIR, 13, -1, -5, 1, 3, 1, -49, 59, 13, -7, Ascii.SI, -15, Ascii.SI, -66, 73, -10, -57, 62, Ascii.VT, -16, 17, -5, -57, 68, -5, -4, 10, -4, Ascii.SI, -66, Ascii.ESC, 45, -7, Ascii.SI, -15, Ascii.SI, -44, 35, 3, -3, Ascii.SYN, -7, 10, -35, 35, 6, -9, 8, 1, 7, -33, Ascii.ESC, -4, 10, -4, Ascii.SI, -43, TarHeader.LF_DIR, -2, -13, Ascii.VT, 7, -8, 8, 1, -35, 38, 5, -2, -70, Ascii.SI, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -64, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -65, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -63, Ascii.SO, 0, -61, 71, -16, 7, -3, 19, -7, -4, Ascii.SO, 0, -61, 71, -9, -5, 19, -11, 1, 19, -10, -57, TarHeader.LF_CONTIG, Ascii.SO, 0, 5, 1, 6, -12, -53, TarHeader.LF_CONTIG, Ascii.SO, 1, -6, 5, Ascii.VT, -3, -10, Ascii.NAK, -9, 8, 1, -62, Ascii.ETB, 46, 1, -6, 5, Ascii.VT, -3, -34, 39, -6, Ascii.VT, -36, 45, -13, 10, -71, Ascii.US, 36, 19, -9, 8, 1, -41, 39, 3, 9, -74, 33, TarHeader.LF_LINK, -11, -2, Ascii.NAK, -3, 5, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13};
    private static final int $$e = 65;
    private static final byte[] $$a = {68, -59, -116, 119, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 74;
    private static int component4 = 0;
    private static int getSponsorBeneficiariesState = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.$$c
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = 119 - r6
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.$$g(byte, byte, short):java.lang.String");
    }

    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3 = 100 - i2;
        byte[] bArr = $$a;
        int i4 = 103 - (s * 2);
        byte[] bArr2 = new byte[28 - i];
        int i5 = 27 - i;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i3)) - 8;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3;
            i4 = (i4 + (-bArr[i3])) - 8;
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.$$d
            int r6 = r6 * 2
            int r1 = 78 - r6
            byte[] r1 = new byte[r1]
            int r6 = 77 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L31
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r7
            r7 = r5
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
            r7 = r3
            r3 = r5
        L31:
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.d(int, byte, int, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/ui/activity/MyHostApduService$Companion;", "", "<init>", "()V", "TAG", "", "SELECT_AID", "", "SELECT_CONTAINER", "SELECT_NDEF", "CONTAINER_FILE", "SUCCESS_RESULT", "FAILURE_RESULT", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        equals = 0;
        copydefault();
        ShareDataUIState();
        INSTANCE = new Companion(null);
        SELECT_AID = new byte[]{0, -92, 4, 0, 7, -46, 118, 0, 0, -123, 1, 1, 0};
        SELECT_CONTAINER = new byte[]{0, -92, 0, Ascii.FF, 2, -31, 3};
        SELECT_NDEF = new byte[]{0, -92, 0, Ascii.FF, 2, -31, 4};
        CONTAINER_FILE = new byte[]{0, Ascii.SI, 32, 0, 59, 0, TarHeader.LF_BLK, 4, 6, -31, 4, 0, -1, 0, -1};
        SUCCESS_RESULT = new byte[]{-112, 0};
        FAILURE_RESULT = new byte[]{106, -126};
        int i = getAsAtTimestamp + 105;
        equals = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3785 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 38 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (26859 - TextUtils.indexOf((CharSequence) "", '0', 0)), 2015799920, false, $$g((byte) 54, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Color.blue(0), 16 - (Process.myTid() >> 22), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i8 = $10 + 105;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 7407, ExpandableListView.getPackedPositionChild(0L) + 17, (char) Color.argb(0, 0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i12 = $11 + 97;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = $10 + 115;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 105;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", i4) + 3760, Color.alpha(i4) + 24, (char) Gravity.getAbsoluteGravity(i4, i4), -1670574543, false, $$g((byte) 51, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i5 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3761, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), -1670574543, false, $$g((byte) 51, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7140, View.resolveSizeAndState(0, 0, 0) + 13, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        int i7 = 46;
        if (getRequestBeneficiariesState) {
            int i8 = $11 + 25;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.alpha(0), View.MeasureSpec.getMode(0) + 19, (char) (7645 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -327556343, false, $$g((byte) 46, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (copy) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2749 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, (char) (7644 - (Process.myPid() >> 22)), -327556343, false, $$g((byte) i7, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                i7 = 46;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i12;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i13 = $11 + 75;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[cancelVar.component1 >>> cancelVar.component3] % i] * iIntValue);
                i12 = cancelVar.component3 >>> 1;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i12 = cancelVar.component3 + 1;
            }
        }
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        long j;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 7422, 15 - TextUtils.getOffsetAfter("", 0), (char) (64291 - (Process.myPid() >> 22)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        long j2 = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionGroup(0L) + 15, (char) (64291 - View.MeasureSpec.getSize(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        char c3 = '\t';
        if (i % 2 != 0) {
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 121;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    c2 = c3;
                    j = j2;
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[c3] = cancelall;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 7117;
                            int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 44463);
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[8] = Integer.TYPE;
                            clsArr[c3] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, i9, pressedStateDuration, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = cancelall;
                            objArr5[c3] = Integer.valueOf(cCharValue);
                            objArr5[8] = cancelall;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = cancelall;
                            objArr5[4] = cancelall;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[2] = Integer.valueOf(cCharValue);
                            objArr5[1] = cancelall;
                            objArr5[0] = cancelall;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                j = 0;
                                int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2943;
                                int i11 = 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                char cLastIndexOf = (char) (27636 - TextUtils.lastIndexOf("", '0', 0, 0));
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                String str$$g = $$g(b3, b4, b4);
                                c2 = '\t';
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10, i11, cLastIndexOf, 794909189, false, str$$g, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = c3;
                                j = 0;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            c2 = c3;
                            obj = null;
                            j = 0;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i13];
                                cArr4[cancelall.component2 + 1] = cArr2[i14];
                            } else {
                                int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i15];
                                cArr4[cancelall.component2 + 1] = cArr2[i16];
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
                c3 = c2;
                j2 = j;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 115;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 7821);
                i17 += 121;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1f37  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1f38  */
    /* JADX WARN: Type inference failed for: r1v132, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v169, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.onCreate():void");
    }

    private final void initNdfMessageData() {
        NdefMessage ndefUrlMessage;
        int i = 2 % 2;
        int i2 = component4 + 21;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (this.mNdefRecord != null || (ndefUrlMessage = getNdefUrlMessage()) == null) {
            return;
        }
        int byteArrayLength = ndefUrlMessage.getByteArrayLength();
        byte[] bArr = new byte[byteArrayLength + 2];
        this.mNdefRecord = bArr;
        bArr[0] = (byte) ((65280 & byteArrayLength) / 256);
        bArr[1] = (byte) (byteArrayLength & 255);
        byte[] byteArray = ndefUrlMessage.toByteArray();
        Object obj = this.mNdefRecord;
        if (obj != null) {
            int i4 = component4 + 81;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } else {
            obj = "";
        }
        System.arraycopy(byteArray, 0, (Serializable) obj, 2, ndefUrlMessage.getByteArrayLength());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r1.length() == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return new android.nfc.NdefMessage(new android.nfc.NdefRecord[]{android.nfc.NdefRecord.createUri(r1), android.nfc.NdefRecord.createApplicationRecord(getPackageName())});
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r1.length() == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.nfc.NdefMessage getNdefUrlMessage() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.component4
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L60
            com.huawei.digitalpayment.consumer.base.util.AdpuNfcUtils r1 = com.huawei.digitalpayment.consumer.base.util.AdpuNfcUtils.INSTANCE
            java.lang.String r1 = r1.getNfcData()
            if (r1 == 0) goto L50
            int r3 = com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.component4
            int r3 = r3 + 45
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.getSponsorBeneficiariesState = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L30
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 60
            int r4 = r4 / 0
            if (r3 != 0) goto L3a
            goto L50
        L30:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L3a
            goto L50
        L3a:
            android.nfc.NdefRecord r0 = android.nfc.NdefRecord.createUri(r1)
            java.lang.String r1 = r5.getPackageName()
            android.nfc.NdefRecord r1 = android.nfc.NdefRecord.createApplicationRecord(r1)
            android.nfc.NdefRecord[] r0 = new android.nfc.NdefRecord[]{r0, r1}
            android.nfc.NdefMessage r1 = new android.nfc.NdefMessage
            r1.<init>(r0)
            return r1
        L50:
            int r1 = com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.getSponsorBeneficiariesState
            int r1 = r1 + 37
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.component4 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L5f
            r0 = 71
            int r0 = r0 / 0
        L5f:
            return r2
        L60:
            com.huawei.digitalpayment.consumer.base.util.AdpuNfcUtils r0 = com.huawei.digitalpayment.consumer.base.util.AdpuNfcUtils.INSTANCE
            r0.getNfcData()
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.getNdefUrlMessage():android.nfc.NdefMessage");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] processCommandApdu(byte[] r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.processCommandApdu(byte[], android.os.Bundle):byte[]");
    }

    @Override
    public void onDeactivated(int reason) {
        int i = 2 % 2;
        L.INSTANCE.e(TAG, "onDeactivated:" + reason, new Object[0]);
        this.mAppSelected = false;
        this.mCcSelected = false;
        this.mNdefSelected = false;
        this.mNdefRecord = null;
        int i2 = component4 + 109;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x074f A[Catch: all -> 0x0aa5, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0aa5, blocks: (B:86:0x067e, B:92:0x06e0, B:101:0x074f), top: B:796:0x067e }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0971 A[Catch: all -> 0x0aa3, TryCatch #2 {all -> 0x0aa3, blocks: (B:125:0x0967, B:126:0x096b, B:128:0x0971, B:131:0x098b, B:134:0x0998, B:136:0x099b, B:148:0x0a7d, B:150:0x0a83, B:151:0x0a84, B:153:0x0a86, B:155:0x0a8d, B:156:0x0a8e, B:103:0x075d, B:115:0x0856, B:117:0x085c, B:118:0x089c, B:120:0x08c6, B:121:0x0907, B:123:0x091c, B:124:0x0961, B:158:0x0a90, B:160:0x0a97, B:161:0x0a98, B:163:0x0a9a, B:165:0x0aa1, B:166:0x0aa2, B:144:0x09fc, B:139:0x09c9, B:141:0x09cf, B:142:0x09f4, B:110:0x07bf, B:112:0x07db, B:113:0x084a, B:105:0x0771, B:107:0x0786, B:108:0x07b8), top: B:789:0x075d, inners: #37, #39, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0b3d A[Catch: all -> 0x03cd, TryCatch #23 {all -> 0x03cd, blocks: (B:179:0x0b37, B:181:0x0b3d, B:182:0x0b67, B:367:0x1674, B:369:0x167a, B:370:0x169e, B:490:0x1d53, B:492:0x1d59, B:493:0x1d83, B:688:0x2f86, B:690:0x2f8c, B:691:0x2fb3, B:725:0x32d2, B:727:0x32d8, B:728:0x3306, B:705:0x3106, B:707:0x3129, B:708:0x317d, B:654:0x2c4e, B:656:0x2c54, B:657:0x2c82, B:748:0x33e3, B:750:0x33e9, B:751:0x3414, B:753:0x344e, B:754:0x3496, B:541:0x23f7, B:543:0x240c, B:544:0x2441, B:546:0x2475, B:547:0x24f2, B:766:0x3572, B:768:0x3578, B:769:0x359e, B:771:0x35d8, B:772:0x361f, B:509:0x1fca, B:511:0x1fdf, B:512:0x2012, B:250:0x1045, B:252:0x104b, B:253:0x1079, B:70:0x055e, B:72:0x0564, B:73:0x0589, B:19:0x0152, B:21:0x0158, B:22:0x0180, B:24:0x033b, B:26:0x036c, B:27:0x03c7), top: B:828:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0bfc A[Catch: all -> 0x0fdd, TryCatch #30 {all -> 0x0fdd, blocks: (B:186:0x0bf6, B:188:0x0bfc, B:189:0x0c3e, B:191:0x0c65, B:192:0x0cab, B:194:0x0cc1, B:196:0x0cca, B:197:0x0d10, B:216:0x0ec7, B:224:0x0f39, B:230:0x0fc1, B:232:0x0fc7, B:233:0x0fc8, B:235:0x0fca, B:237:0x0fd1, B:238:0x0fd2, B:199:0x0d1c, B:206:0x0da4, B:208:0x0daa, B:209:0x0df2, B:211:0x0e1c, B:212:0x0e67, B:214:0x0e7d, B:215:0x0ebf, B:240:0x0fd4, B:242:0x0fdb, B:243:0x0fdc, B:226:0x0f3f, B:220:0x0eff, B:222:0x0f05, B:223:0x0f32, B:201:0x0d3c, B:203:0x0d4e, B:204:0x0d98), top: B:840:0x0bf6, outer: #1, inners: #16, #21, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c65 A[Catch: all -> 0x0fdd, TryCatch #30 {all -> 0x0fdd, blocks: (B:186:0x0bf6, B:188:0x0bfc, B:189:0x0c3e, B:191:0x0c65, B:192:0x0cab, B:194:0x0cc1, B:196:0x0cca, B:197:0x0d10, B:216:0x0ec7, B:224:0x0f39, B:230:0x0fc1, B:232:0x0fc7, B:233:0x0fc8, B:235:0x0fca, B:237:0x0fd1, B:238:0x0fd2, B:199:0x0d1c, B:206:0x0da4, B:208:0x0daa, B:209:0x0df2, B:211:0x0e1c, B:212:0x0e67, B:214:0x0e7d, B:215:0x0ebf, B:240:0x0fd4, B:242:0x0fdb, B:243:0x0fdc, B:226:0x0f3f, B:220:0x0eff, B:222:0x0f05, B:223:0x0f32, B:201:0x0d3c, B:203:0x0d4e, B:204:0x0d98), top: B:840:0x0bf6, outer: #1, inners: #16, #21, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0cc1 A[Catch: all -> 0x0fdd, TryCatch #30 {all -> 0x0fdd, blocks: (B:186:0x0bf6, B:188:0x0bfc, B:189:0x0c3e, B:191:0x0c65, B:192:0x0cab, B:194:0x0cc1, B:196:0x0cca, B:197:0x0d10, B:216:0x0ec7, B:224:0x0f39, B:230:0x0fc1, B:232:0x0fc7, B:233:0x0fc8, B:235:0x0fca, B:237:0x0fd1, B:238:0x0fd2, B:199:0x0d1c, B:206:0x0da4, B:208:0x0daa, B:209:0x0df2, B:211:0x0e1c, B:212:0x0e67, B:214:0x0e7d, B:215:0x0ebf, B:240:0x0fd4, B:242:0x0fdb, B:243:0x0fdc, B:226:0x0f3f, B:220:0x0eff, B:222:0x0f05, B:223:0x0f32, B:201:0x0d3c, B:203:0x0d4e, B:204:0x0d98), top: B:840:0x0bf6, outer: #1, inners: #16, #21, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0d1c A[Catch: all -> 0x0fdd, TRY_LEAVE, TryCatch #30 {all -> 0x0fdd, blocks: (B:186:0x0bf6, B:188:0x0bfc, B:189:0x0c3e, B:191:0x0c65, B:192:0x0cab, B:194:0x0cc1, B:196:0x0cca, B:197:0x0d10, B:216:0x0ec7, B:224:0x0f39, B:230:0x0fc1, B:232:0x0fc7, B:233:0x0fc8, B:235:0x0fca, B:237:0x0fd1, B:238:0x0fd2, B:199:0x0d1c, B:206:0x0da4, B:208:0x0daa, B:209:0x0df2, B:211:0x0e1c, B:212:0x0e67, B:214:0x0e7d, B:215:0x0ebf, B:240:0x0fd4, B:242:0x0fdb, B:243:0x0fdc, B:226:0x0f3f, B:220:0x0eff, B:222:0x0f05, B:223:0x0f32, B:201:0x0d3c, B:203:0x0d4e, B:204:0x0d98), top: B:840:0x0bf6, outer: #1, inners: #16, #21, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x110a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x117d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x11d6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x122e A[Catch: all -> 0x15bd, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x15bd, blocks: (B:257:0x1104, B:264:0x1156, B:268:0x11c0, B:307:0x144b, B:308:0x144f, B:318:0x1494, B:315:0x1479, B:277:0x122e, B:296:0x1335, B:299:0x137a, B:303:0x13e8, B:306:0x1445), top: B:810:0x1104 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1455  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1490  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x1494 A[Catch: all -> 0x15bd, PHI: r3 r5 r6
  0x1494: PHI (r3v525 java.lang.Object[]) = (r3v524 java.lang.Object[]), (r3v547 java.lang.Object[]) binds: [B:316:0x148e, B:313:0x1476] A[DONT_GENERATE, DONT_INLINE]
  0x1494: PHI (r5v468 int) = (r5v467 int), (r5v485 int) binds: [B:316:0x148e, B:313:0x1476] A[DONT_GENERATE, DONT_INLINE]
  0x1494: PHI (r6v461 int) = (r6v460 int), (r6v478 int) binds: [B:316:0x148e, B:313:0x1476] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #14 {all -> 0x15bd, blocks: (B:257:0x1104, B:264:0x1156, B:268:0x11c0, B:307:0x144b, B:308:0x144f, B:318:0x1494, B:315:0x1479, B:277:0x122e, B:296:0x1335, B:299:0x137a, B:303:0x13e8, B:306:0x1445), top: B:810:0x1104 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x167a A[Catch: all -> 0x03cd, TryCatch #23 {all -> 0x03cd, blocks: (B:179:0x0b37, B:181:0x0b3d, B:182:0x0b67, B:367:0x1674, B:369:0x167a, B:370:0x169e, B:490:0x1d53, B:492:0x1d59, B:493:0x1d83, B:688:0x2f86, B:690:0x2f8c, B:691:0x2fb3, B:725:0x32d2, B:727:0x32d8, B:728:0x3306, B:705:0x3106, B:707:0x3129, B:708:0x317d, B:654:0x2c4e, B:656:0x2c54, B:657:0x2c82, B:748:0x33e3, B:750:0x33e9, B:751:0x3414, B:753:0x344e, B:754:0x3496, B:541:0x23f7, B:543:0x240c, B:544:0x2441, B:546:0x2475, B:547:0x24f2, B:766:0x3572, B:768:0x3578, B:769:0x359e, B:771:0x35d8, B:772:0x361f, B:509:0x1fca, B:511:0x1fdf, B:512:0x2012, B:250:0x1045, B:252:0x104b, B:253:0x1079, B:70:0x055e, B:72:0x0564, B:73:0x0589, B:19:0x0152, B:21:0x0158, B:22:0x0180, B:24:0x033b, B:26:0x036c, B:27:0x03c7), top: B:828:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1728  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x179c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x17fe  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1862  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1b81  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1bc8  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1c0b A[Catch: all -> 0x1cc5, TryCatch #19 {all -> 0x1cc5, blocks: (B:451:0x1c05, B:453:0x1c0b, B:454:0x1c3a), top: B:820:0x1c05, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x1d59 A[Catch: all -> 0x03cd, TryCatch #23 {all -> 0x03cd, blocks: (B:179:0x0b37, B:181:0x0b3d, B:182:0x0b67, B:367:0x1674, B:369:0x167a, B:370:0x169e, B:490:0x1d53, B:492:0x1d59, B:493:0x1d83, B:688:0x2f86, B:690:0x2f8c, B:691:0x2fb3, B:725:0x32d2, B:727:0x32d8, B:728:0x3306, B:705:0x3106, B:707:0x3129, B:708:0x317d, B:654:0x2c4e, B:656:0x2c54, B:657:0x2c82, B:748:0x33e3, B:750:0x33e9, B:751:0x3414, B:753:0x344e, B:754:0x3496, B:541:0x23f7, B:543:0x240c, B:544:0x2441, B:546:0x2475, B:547:0x24f2, B:766:0x3572, B:768:0x3578, B:769:0x359e, B:771:0x35d8, B:772:0x361f, B:509:0x1fca, B:511:0x1fdf, B:512:0x2012, B:250:0x1045, B:252:0x104b, B:253:0x1079, B:70:0x055e, B:72:0x0564, B:73:0x0589, B:19:0x0152, B:21:0x0158, B:22:0x0180, B:24:0x033b, B:26:0x036c, B:27:0x03c7), top: B:828:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1e0f  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1e77  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1ed3  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x1faa  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x215c  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x2d10  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x2d5d  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x2db4  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x2f64  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x303f  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x3094  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x30e8  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x32b2  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x3530  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0697 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:906:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06f6  */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v110, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v117 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r28v100 */
    /* JADX WARN: Type inference failed for: r28v103 */
    /* JADX WARN: Type inference failed for: r28v105 */
    /* JADX WARN: Type inference failed for: r28v106 */
    /* JADX WARN: Type inference failed for: r28v107 */
    /* JADX WARN: Type inference failed for: r28v108 */
    /* JADX WARN: Type inference failed for: r28v109 */
    /* JADX WARN: Type inference failed for: r28v110 */
    /* JADX WARN: Type inference failed for: r28v116 */
    /* JADX WARN: Type inference failed for: r28v121 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v130 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v141 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v155 */
    /* JADX WARN: Type inference failed for: r28v156 */
    /* JADX WARN: Type inference failed for: r28v157 */
    /* JADX WARN: Type inference failed for: r28v158 */
    /* JADX WARN: Type inference failed for: r28v159 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v160 */
    /* JADX WARN: Type inference failed for: r28v161 */
    /* JADX WARN: Type inference failed for: r28v162 */
    /* JADX WARN: Type inference failed for: r28v163 */
    /* JADX WARN: Type inference failed for: r28v164 */
    /* JADX WARN: Type inference failed for: r28v167 */
    /* JADX WARN: Type inference failed for: r28v168 */
    /* JADX WARN: Type inference failed for: r28v169 */
    /* JADX WARN: Type inference failed for: r28v170 */
    /* JADX WARN: Type inference failed for: r28v171 */
    /* JADX WARN: Type inference failed for: r28v172 */
    /* JADX WARN: Type inference failed for: r28v173 */
    /* JADX WARN: Type inference failed for: r28v174 */
    /* JADX WARN: Type inference failed for: r28v175 */
    /* JADX WARN: Type inference failed for: r28v176 */
    /* JADX WARN: Type inference failed for: r28v177 */
    /* JADX WARN: Type inference failed for: r28v178 */
    /* JADX WARN: Type inference failed for: r28v179 */
    /* JADX WARN: Type inference failed for: r28v180 */
    /* JADX WARN: Type inference failed for: r28v181 */
    /* JADX WARN: Type inference failed for: r28v182 */
    /* JADX WARN: Type inference failed for: r28v183 */
    /* JADX WARN: Type inference failed for: r28v190 */
    /* JADX WARN: Type inference failed for: r28v191 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v84 */
    /* JADX WARN: Type inference failed for: r28v85 */
    /* JADX WARN: Type inference failed for: r28v86 */
    /* JADX WARN: Type inference failed for: r28v87 */
    /* JADX WARN: Type inference failed for: r28v88 */
    /* JADX WARN: Type inference failed for: r28v89 */
    /* JADX WARN: Type inference failed for: r28v91 */
    /* JADX WARN: Type inference failed for: r28v95 */
    /* JADX WARN: Type inference failed for: r28v97 */
    /* JADX WARN: Type inference failed for: r28v98 */
    /* JADX WARN: Type inference failed for: r28v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.nfc.ui.activity.MyHostApduService.attachBaseContext(android.content.Context):void");
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 101;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        component3 = -890926456;
        int i5 = i3 + 109;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault() {
        component1 = new char[]{12831, 2002, 1972, 1987, 1969, 12828, 1966, 1968, 2026, 2025, 1974, 2003, 2031, 2034, 2028, 2022, 1973, 2030, 2027, 12827, 2017, 2035, 1977, 2038, 1985, 2019, 2029, 2021, 2041, 12825, 1978, 1967, 2004, 2023, 1976, 1970, 12824, 12829, 2020, 2024, 2036, 1975, 12830, 2033, 1965, 2037, 2018, 1971, 2032};
        component2 = (char) 12829;
        copydefault = new char[]{30611, 30612, 30615, 30606, 30596, 30595, 30640, 30619, 30597, 30608, 30645, 30601, 30602, 30286, 30632, 30613, 30607, 30631, 30275, 30283, 30614, 30278, 30273, 30280, 30277, 30618, 30279, 30276, 30272, 30282};
        ShareDataUIState = 321287800;
        copy = true;
        getRequestBeneficiariesState = true;
    }
}
