package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÇ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010(\u001a\u00020)H×\u0001J\t\u0010*\u001a\u00020\rH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorUiState;", "", "selectedTab", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "sendWithdraw", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawUiState;", "lipaNaMpesa", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaNaMpesaUiState;", "lipaResult", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;", "showLoadingOverlay", "", "loadingMessage", "", "errorMessage", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawUiState;Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaNaMpesaUiState;Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;ZLjava/lang/String;Ljava/lang/String;)V", "getSelectedTab", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "getSendWithdraw", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawUiState;", "getLipaNaMpesa", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaNaMpesaUiState;", "getLipaResult", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;", "getShowLoadingOverlay", "()Z", "getLoadingMessage", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorUiState {
    public static final int $stable = 0;
    private static char[] equals;
    private static long getAsAtTimestamp;
    private static int hashCode;
    private final String ShareDataUIState;
    private final CostCalculatorTab component1;
    private final LipaNaMpesaUiState component2;
    private final LipaCostResult component3;
    private final boolean component4;
    private final String copydefault;
    private final SendWithdrawUiState getRequestBeneficiariesState;
    private static final byte[] $$c = {Ascii.SI, -12, 105, 108};
    private static final int $$f = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {102, Ascii.GS, -34, 39, -35, -24, -32, -2, -24, -24, -18, -43, -14, -31, -35, -24, -32, -35, -21, -26, -22, -22, -14, -32, -29, 43};
    private static final int $$e = 241;
    private static final byte[] $$a = {35, -11, -97, -73, -6, Ascii.CAN, -18, -48, 72, -11, 1, Ascii.NAK, 0, -6, Ascii.SO, 8, -72, 56, 5, Ascii.DLE, 5, -67, 45, -32, -2, Ascii.FF, 13, 37, Ascii.DLE, 5, -8, 0, 6, -3, 1, Ascii.SYN, -12, 1, Ascii.DC2, -44, TarHeader.LF_FIFO, -1, -12, Ascii.FF, 8, -7, 9, 2, -21, Ascii.SO, Ascii.SO, Ascii.FF, -13};
    private static final int $$b = 128;
    private static int toString = 0;
    private static int getSponsorBeneficiariesState = 1;
    private static int copy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.$$c
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 + 102
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.$$g(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 11 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.$$d
            int r8 = r8 + 98
            int r6 = 25 - r6
            byte[] r0 = new byte[r0]
            int r7 = 10 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-23)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 106 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.$$a
            int r7 = r7 * 17
            int r1 = r7 + 17
            int r8 = r8 * 33
            int r8 = 37 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 16
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-3)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.d(byte, int, short, java.lang.Object[]):void");
    }

    public CostCalculatorUiState(CostCalculatorTab costCalculatorTab, SendWithdrawUiState sendWithdrawUiState, LipaNaMpesaUiState lipaNaMpesaUiState, LipaCostResult lipaCostResult, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(costCalculatorTab, "");
        Intrinsics.checkNotNullParameter(sendWithdrawUiState, "");
        Intrinsics.checkNotNullParameter(lipaNaMpesaUiState, "");
        this.component1 = costCalculatorTab;
        this.getRequestBeneficiariesState = sendWithdrawUiState;
        this.component2 = lipaNaMpesaUiState;
        this.component3 = lipaCostResult;
        this.component4 = z;
        this.copydefault = str;
        this.ShareDataUIState = str2;
    }

    public CostCalculatorUiState(CostCalculatorTab costCalculatorTab, SendWithdrawUiState sendWithdrawUiState, LipaNaMpesaUiState lipaNaMpesaUiState, LipaCostResult lipaCostResult, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CostCalculatorTab costCalculatorTab2;
        LipaNaMpesaUiState lipaNaMpesaUiState2;
        LipaCostResult lipaCostResult2;
        String str3;
        if ((i & 1) != 0) {
            costCalculatorTab2 = CostCalculatorTab.SEND_WITHDRAW;
            int i2 = 2 % 2;
        } else {
            costCalculatorTab2 = costCalculatorTab;
        }
        SendWithdrawUiState sendWithdrawUiState2 = (i & 2) != 0 ? new SendWithdrawUiState(null, null, null, 7, null) : sendWithdrawUiState;
        if ((i & 4) != 0) {
            lipaNaMpesaUiState2 = new LipaNaMpesaUiState(null, null, null, false, 15, null);
            int i3 = toString + 19;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            lipaNaMpesaUiState2 = lipaNaMpesaUiState;
        }
        String str4 = null;
        if ((i & 8) != 0) {
            int i6 = getSponsorBeneficiariesState + 5;
            toString = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 13 / 0;
            }
            int i8 = 2 % 2;
            lipaCostResult2 = null;
        } else {
            lipaCostResult2 = lipaCostResult;
        }
        boolean z2 = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            int i9 = getSponsorBeneficiariesState + 103;
            toString = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 88 / 0;
            }
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 64) != 0) {
            int i11 = getSponsorBeneficiariesState + 51;
            toString = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str4 = str2;
        }
        this(costCalculatorTab2, sendWithdrawUiState2, lipaNaMpesaUiState2, lipaCostResult2, z2, str3, str4);
    }

    public final CostCalculatorTab getSelectedTab() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 125;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        CostCalculatorTab costCalculatorTab = this.component1;
        int i5 = i2 + 51;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return costCalculatorTab;
        }
        throw null;
    }

    public final SendWithdrawUiState getSendWithdraw() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 65;
        toString = i3 % 128;
        int i4 = i3 % 2;
        SendWithdrawUiState sendWithdrawUiState = this.getRequestBeneficiariesState;
        int i5 = i2 + 47;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return sendWithdrawUiState;
        }
        throw null;
    }

    public final LipaNaMpesaUiState getLipaNaMpesa() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 3;
        toString = i3 % 128;
        int i4 = i3 % 2;
        LipaNaMpesaUiState lipaNaMpesaUiState = this.component2;
        int i5 = i2 + 73;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return lipaNaMpesaUiState;
    }

    public final LipaCostResult getLipaResult() {
        int i = 2 % 2;
        int i2 = toString + 101;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        LipaCostResult lipaCostResult = this.component3;
        int i4 = i3 + 37;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return lipaCostResult;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean getShowLoadingOverlay() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 93;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.component4;
        int i4 = i2 + 45;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String getLoadingMessage() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 69;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        String str;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 62 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 81;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $10 + 111;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 3266, 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (60268 - View.MeasureSpec.getSize(0)), -834797019, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() - (getAsAtTimestamp ^ 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 687;
                        int iIndexOf = 34 - TextUtils.indexOf("", "", 0);
                        char edgeSlop = (char) (60373 - (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b4 = (byte) ($$f & 11);
                        byte b5 = (byte) (b4 - 3);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, iIndexOf, edgeSlop, -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 60268), -834797019, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (getAsAtTimestamp ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 687;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 34;
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60374);
                    byte b8 = (byte) ($$f & 11);
                    byte b9 = (byte) (b8 - 3);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, keyRepeatDelay, c2, -1969106284, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $10 + 69;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    int i9 = 687 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int doubleTapTimeout = 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60374);
                    byte b10 = (byte) ($$f & 11);
                    byte b11 = (byte) (b10 - 3);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9, doubleTapTimeout, cIndexOf, -1969106284, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr7 = {notifyVar, notifyVar};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault6 == null) {
                int offsetBefore = 687 - TextUtils.getOffsetBefore("", 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 35;
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 60373);
                byte b12 = (byte) ($$f & 11);
                byte b13 = (byte) (b12 - 3);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iLastIndexOf, scrollDefaultDelay, -1969106284, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            int i10 = $10 + 89;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = equals;
        long j = 0;
        if (cArr != null) {
            int i7 = $11 + 55;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 657, 15 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), (char) ((Process.myTid() >> 22) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i9++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 9;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4502, 37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (27897 - KeyEvent.normalizeMetaState(0)), -1464227204, false, $$g((byte) 8, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Process.getGidForName("") + 29, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1180380354, false, $$g((byte) 13, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 34, (char) (MotionEvent.axisFromString("") + 1), 80302927, false, $$g((byte) (-$$c[1]), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $11 + 11;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                int i15 = i4 >>> i6;
                System.arraycopy(cArr5, 0, cArr3, i15, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i15);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i16, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i16);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $10 + 19;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[i4 % iTrustedWebActivityService_Parcel.copydefault];
                    i = iTrustedWebActivityService_Parcel.copydefault << 1;
                } else {
                    cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i18 = $11 + 37;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        hashCode = 1;
        copydefault();
        int i = copy + 33;
        hashCode = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public CostCalculatorUiState() {
        this(null, null, null, null, false, null, null, 127, null);
    }

    public static CostCalculatorUiState copy$default(CostCalculatorUiState costCalculatorUiState, CostCalculatorTab costCalculatorTab, SendWithdrawUiState sendWithdrawUiState, LipaNaMpesaUiState lipaNaMpesaUiState, LipaCostResult lipaCostResult, boolean z, String str, String str2, int i, Object obj) {
        SendWithdrawUiState sendWithdrawUiState2;
        LipaCostResult lipaCostResult2;
        boolean z2;
        String str3;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState;
        int i4 = i3 + 85;
        toString = i4 % 128;
        CostCalculatorTab costCalculatorTab2 = (i4 % 2 == 0 && (i & 1) != 0) ? costCalculatorUiState.component1 : costCalculatorTab;
        if ((i & 2) != 0) {
            sendWithdrawUiState2 = costCalculatorUiState.getRequestBeneficiariesState;
            int i5 = i3 + 113;
            toString = i5 % 128;
            int i6 = i5 % 2;
        } else {
            sendWithdrawUiState2 = sendWithdrawUiState;
        }
        LipaNaMpesaUiState lipaNaMpesaUiState2 = (i & 4) != 0 ? costCalculatorUiState.component2 : lipaNaMpesaUiState;
        if ((i & 8) != 0) {
            lipaCostResult2 = costCalculatorUiState.component3;
            int i7 = i3 + 123;
            toString = i7 % 128;
            int i8 = i7 % 2;
        } else {
            lipaCostResult2 = lipaCostResult;
        }
        if ((i & 16) != 0) {
            int i9 = i3 + 89;
            toString = i9 % 128;
            if (i9 % 2 != 0) {
                boolean z3 = costCalculatorUiState.component4;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z2 = costCalculatorUiState.component4;
        } else {
            z2 = z;
        }
        String str4 = (i & 32) != 0 ? costCalculatorUiState.copydefault : str;
        if ((i & 64) != 0) {
            str3 = costCalculatorUiState.ShareDataUIState;
            int i10 = i3 + 101;
            toString = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 5;
            }
        } else {
            str3 = str2;
        }
        return costCalculatorUiState.copy(costCalculatorTab2, sendWithdrawUiState2, lipaNaMpesaUiState2, lipaCostResult2, z2, str4, str3);
    }

    public final CostCalculatorTab component1() {
        int i = 2 % 2;
        int i2 = toString + 113;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        CostCalculatorTab costCalculatorTab = this.component1;
        int i4 = i3 + 121;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return costCalculatorTab;
        }
        obj.hashCode();
        throw null;
    }

    public final SendWithdrawUiState component2() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 65;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        SendWithdrawUiState sendWithdrawUiState = this.getRequestBeneficiariesState;
        int i5 = i2 + 79;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return sendWithdrawUiState;
    }

    public final LipaNaMpesaUiState component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 49;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final LipaCostResult component4() {
        LipaCostResult lipaCostResult;
        int i = 2 % 2;
        int i2 = toString + 103;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            lipaCostResult = this.component3;
            int i4 = 77 / 0;
        } else {
            lipaCostResult = this.component3;
        }
        int i5 = i3 + 19;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return lipaCostResult;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 7;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component4;
        int i5 = i2 + 109;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return z;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 51;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.copydefault;
            int i4 = 42 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 115;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = toString + 59;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CostCalculatorUiState copy(CostCalculatorTab selectedTab, SendWithdrawUiState sendWithdraw, LipaNaMpesaUiState lipaNaMpesa, LipaCostResult lipaResult, boolean showLoadingOverlay, String loadingMessage, String errorMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedTab, "");
        Intrinsics.checkNotNullParameter(sendWithdraw, "");
        Intrinsics.checkNotNullParameter(lipaNaMpesa, "");
        CostCalculatorUiState costCalculatorUiState = new CostCalculatorUiState(selectedTab, sendWithdraw, lipaNaMpesa, lipaResult, showLoadingOverlay, loadingMessage, errorMessage);
        int i2 = toString + 69;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostCalculatorUiState)) {
            return false;
        }
        CostCalculatorUiState costCalculatorUiState = (CostCalculatorUiState) other;
        if (this.component1 != costCalculatorUiState.component1) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, costCalculatorUiState.getRequestBeneficiariesState)) {
            int i2 = getSponsorBeneficiariesState + 37;
            toString = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component2, costCalculatorUiState.component2) || !Intrinsics.areEqual(this.component3, costCalculatorUiState.component3)) {
            return false;
        }
        if (this.component4 == costCalculatorUiState.component4) {
            return Intrinsics.areEqual(this.copydefault, costCalculatorUiState.copydefault) && Intrinsics.areEqual(this.ShareDataUIState, costCalculatorUiState.ShareDataUIState);
        }
        int i3 = getSponsorBeneficiariesState + 23;
        toString = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = toString + 33;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.component1.hashCode();
        int iHashCode3 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode4 = this.component2.hashCode();
        LipaCostResult lipaCostResult = this.component3;
        int iHashCode5 = 0;
        if (lipaCostResult == null) {
            int i4 = toString + 35;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = lipaCostResult.hashCode();
        }
        int iHashCode6 = Boolean.hashCode(this.component4);
        String str = this.copydefault;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.ShareDataUIState;
        if (str2 == null) {
            int i6 = toString + 19;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode5 = str2.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorUiState(selectedTab=" + this.component1 + ", sendWithdraw=" + this.getRequestBeneficiariesState + ", lipaNaMpesa=" + this.component2 + ", lipaResult=" + this.component3 + ", showLoadingOverlay=" + this.component4 + ", loadingMessage=" + this.copydefault + ", errorMessage=" + this.ShareDataUIState + ")";
        int i2 = toString + 91;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7548 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v105, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v264, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r10v459 */
    /* JADX WARN: Type inference failed for: r10v460 */
    /* JADX WARN: Type inference failed for: r10v461 */
    /* JADX WARN: Type inference failed for: r10v462 */
    /* JADX WARN: Type inference failed for: r10v463 */
    /* JADX WARN: Type inference failed for: r10v464 */
    /* JADX WARN: Type inference failed for: r10v465 */
    /* JADX WARN: Type inference failed for: r10v467 */
    /* JADX WARN: Type inference failed for: r10v470 */
    /* JADX WARN: Type inference failed for: r10v471 */
    /* JADX WARN: Type inference failed for: r10v472 */
    /* JADX WARN: Type inference failed for: r10v473 */
    /* JADX WARN: Type inference failed for: r10v477 */
    /* JADX WARN: Type inference failed for: r10v478 */
    /* JADX WARN: Type inference failed for: r10v479, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v480 */
    /* JADX WARN: Type inference failed for: r10v481, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r10v504 */
    /* JADX WARN: Type inference failed for: r10v520 */
    /* JADX WARN: Type inference failed for: r10v521 */
    /* JADX WARN: Type inference failed for: r10v527 */
    /* JADX WARN: Type inference failed for: r10v533 */
    /* JADX WARN: Type inference failed for: r10v534 */
    /* JADX WARN: Type inference failed for: r10v535 */
    /* JADX WARN: Type inference failed for: r10v536 */
    /* JADX WARN: Type inference failed for: r10v539 */
    /* JADX WARN: Type inference failed for: r10v542 */
    /* JADX WARN: Type inference failed for: r10v543 */
    /* JADX WARN: Type inference failed for: r10v557 */
    /* JADX WARN: Type inference failed for: r10v558 */
    /* JADX WARN: Type inference failed for: r10v559 */
    /* JADX WARN: Type inference failed for: r10v560 */
    /* JADX WARN: Type inference failed for: r10v561 */
    /* JADX WARN: Type inference failed for: r10v562 */
    /* JADX WARN: Type inference failed for: r10v563 */
    /* JADX WARN: Type inference failed for: r10v564 */
    /* JADX WARN: Type inference failed for: r10v565 */
    /* JADX WARN: Type inference failed for: r10v566 */
    /* JADX WARN: Type inference failed for: r10v567 */
    /* JADX WARN: Type inference failed for: r10v568 */
    /* JADX WARN: Type inference failed for: r10v90, types: [java.lang.Object, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v118 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v120 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v123 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v73, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r12v177, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r12v213, types: [java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r12v59, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v194, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r14v285, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r14v73, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v126, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r15v221 */
    /* JADX WARN: Type inference failed for: r15v251, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r15v347 */
    /* JADX WARN: Type inference failed for: r15v348 */
    /* JADX WARN: Type inference failed for: r15v438 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v80, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v48 */
    /* JADX WARN: Type inference failed for: r19v49 */
    /* JADX WARN: Type inference failed for: r1v1013, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1158 */
    /* JADX WARN: Type inference failed for: r1v1159 */
    /* JADX WARN: Type inference failed for: r1v1160 */
    /* JADX WARN: Type inference failed for: r1v430 */
    /* JADX WARN: Type inference failed for: r1v460 */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v623 */
    /* JADX WARN: Type inference failed for: r1v653 */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v850 */
    /* JADX WARN: Type inference failed for: r1v869 */
    /* JADX WARN: Type inference failed for: r1v965, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v980, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v42 */
    /* JADX WARN: Type inference failed for: r29v43 */
    /* JADX WARN: Type inference failed for: r29v44 */
    /* JADX WARN: Type inference failed for: r29v45 */
    /* JADX WARN: Type inference failed for: r29v46 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v123, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v351 */
    /* JADX WARN: Type inference failed for: r2v352 */
    /* JADX WARN: Type inference failed for: r2v353 */
    /* JADX WARN: Type inference failed for: r2v354 */
    /* JADX WARN: Type inference failed for: r2v355 */
    /* JADX WARN: Type inference failed for: r2v356 */
    /* JADX WARN: Type inference failed for: r2v357 */
    /* JADX WARN: Type inference failed for: r2v358 */
    /* JADX WARN: Type inference failed for: r2v359 */
    /* JADX WARN: Type inference failed for: r2v360 */
    /* JADX WARN: Type inference failed for: r2v361 */
    /* JADX WARN: Type inference failed for: r2v362 */
    /* JADX WARN: Type inference failed for: r2v363 */
    /* JADX WARN: Type inference failed for: r2v364 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v43, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.nio.LongBuffer[]] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v29 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v31 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v36 */
    /* JADX WARN: Type inference failed for: r30v37 */
    /* JADX WARN: Type inference failed for: r30v38 */
    /* JADX WARN: Type inference failed for: r30v39, types: [int] */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v40 */
    /* JADX WARN: Type inference failed for: r30v41 */
    /* JADX WARN: Type inference failed for: r30v42 */
    /* JADX WARN: Type inference failed for: r30v43 */
    /* JADX WARN: Type inference failed for: r30v44 */
    /* JADX WARN: Type inference failed for: r30v45 */
    /* JADX WARN: Type inference failed for: r30v46 */
    /* JADX WARN: Type inference failed for: r30v47 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r32v33 */
    /* JADX WARN: Type inference failed for: r32v34 */
    /* JADX WARN: Type inference failed for: r32v35 */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v87, types: [int[]] */
    /* JADX WARN: Type inference failed for: r40v39 */
    /* JADX WARN: Type inference failed for: r40v40 */
    /* JADX WARN: Type inference failed for: r40v41 */
    /* JADX WARN: Type inference failed for: r40v42 */
    /* JADX WARN: Type inference failed for: r40v44 */
    /* JADX WARN: Type inference failed for: r41v29 */
    /* JADX WARN: Type inference failed for: r43v35 */
    /* JADX WARN: Type inference failed for: r43v36 */
    /* JADX WARN: Type inference failed for: r43v37 */
    /* JADX WARN: Type inference failed for: r43v38 */
    /* JADX WARN: Type inference failed for: r43v39 */
    /* JADX WARN: Type inference failed for: r43v40 */
    /* JADX WARN: Type inference failed for: r43v43 */
    /* JADX WARN: Type inference failed for: r43v44 */
    /* JADX WARN: Type inference failed for: r44v43 */
    /* JADX WARN: Type inference failed for: r44v45 */
    /* JADX WARN: Type inference failed for: r44v46 */
    /* JADX WARN: Type inference failed for: r44v47 */
    /* JADX WARN: Type inference failed for: r44v48 */
    /* JADX WARN: Type inference failed for: r44v49 */
    /* JADX WARN: Type inference failed for: r44v51 */
    /* JADX WARN: Type inference failed for: r46v57 */
    /* JADX WARN: Type inference failed for: r46v58 */
    /* JADX WARN: Type inference failed for: r46v59 */
    /* JADX WARN: Type inference failed for: r46v61 */
    /* JADX WARN: Type inference failed for: r47v37 */
    /* JADX WARN: Type inference failed for: r47v38 */
    /* JADX WARN: Type inference failed for: r47v39 */
    /* JADX WARN: Type inference failed for: r47v40 */
    /* JADX WARN: Type inference failed for: r47v41 */
    /* JADX WARN: Type inference failed for: r49v37 */
    /* JADX WARN: Type inference failed for: r49v38 */
    /* JADX WARN: Type inference failed for: r49v39 */
    /* JADX WARN: Type inference failed for: r49v40 */
    /* JADX WARN: Type inference failed for: r49v41 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v143, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v159 */
    /* JADX WARN: Type inference failed for: r4v189 */
    /* JADX WARN: Type inference failed for: r4v210, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v511 */
    /* JADX WARN: Type inference failed for: r4v512 */
    /* JADX WARN: Type inference failed for: r4v513 */
    /* JADX WARN: Type inference failed for: r4v521 */
    /* JADX WARN: Type inference failed for: r4v805 */
    /* JADX WARN: Type inference failed for: r4v806 */
    /* JADX WARN: Type inference failed for: r4v807 */
    /* JADX WARN: Type inference failed for: r4v808 */
    /* JADX WARN: Type inference failed for: r4v809 */
    /* JADX WARN: Type inference failed for: r4v810 */
    /* JADX WARN: Type inference failed for: r4v811 */
    /* JADX WARN: Type inference failed for: r4v812 */
    /* JADX WARN: Type inference failed for: r4v89, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r51v15 */
    /* JADX WARN: Type inference failed for: r51v16 */
    /* JADX WARN: Type inference failed for: r51v17 */
    /* JADX WARN: Type inference failed for: r51v18 */
    /* JADX WARN: Type inference failed for: r51v19 */
    /* JADX WARN: Type inference failed for: r52v0 */
    /* JADX WARN: Type inference failed for: r52v1 */
    /* JADX WARN: Type inference failed for: r52v2 */
    /* JADX WARN: Type inference failed for: r52v3 */
    /* JADX WARN: Type inference failed for: r52v37 */
    /* JADX WARN: Type inference failed for: r52v38 */
    /* JADX WARN: Type inference failed for: r52v39 */
    /* JADX WARN: Type inference failed for: r52v4 */
    /* JADX WARN: Type inference failed for: r52v40 */
    /* JADX WARN: Type inference failed for: r52v41 */
    /* JADX WARN: Type inference failed for: r52v42 */
    /* JADX WARN: Type inference failed for: r52v43 */
    /* JADX WARN: Type inference failed for: r52v44 */
    /* JADX WARN: Type inference failed for: r52v45 */
    /* JADX WARN: Type inference failed for: r52v46 */
    /* JADX WARN: Type inference failed for: r52v47 */
    /* JADX WARN: Type inference failed for: r52v5 */
    /* JADX WARN: Type inference failed for: r52v6 */
    /* JADX WARN: Type inference failed for: r5v142, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r5v97, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r64v1 */
    /* JADX WARN: Type inference failed for: r67v2 */
    /* JADX WARN: Type inference failed for: r6v109, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v135 */
    /* JADX WARN: Type inference failed for: r6v153, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r6v176 */
    /* JADX WARN: Type inference failed for: r6v191, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v206 */
    /* JADX WARN: Type inference failed for: r6v218 */
    /* JADX WARN: Type inference failed for: r6v224, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v426, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v222, types: [java.lang.Object, java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r7v224, types: [java.lang.Object, java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r7v68, types: [java.lang.Object, java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v102 */
    /* JADX WARN: Type inference failed for: r8v111, types: [long] */
    /* JADX WARN: Type inference failed for: r8v124, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v142, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v143, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v178 */
    /* JADX WARN: Type inference failed for: r8v179 */
    /* JADX WARN: Type inference failed for: r8v183, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v190, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v191 */
    /* JADX WARN: Type inference failed for: r8v192 */
    /* JADX WARN: Type inference failed for: r8v193 */
    /* JADX WARN: Type inference failed for: r8v194, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v196, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v197 */
    /* JADX WARN: Type inference failed for: r8v198 */
    /* JADX WARN: Type inference failed for: r8v199, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v201, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v206 */
    /* JADX WARN: Type inference failed for: r8v207 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v210 */
    /* JADX WARN: Type inference failed for: r8v211 */
    /* JADX WARN: Type inference failed for: r8v212 */
    /* JADX WARN: Type inference failed for: r8v220 */
    /* JADX WARN: Type inference failed for: r8v225 */
    /* JADX WARN: Type inference failed for: r8v227 */
    /* JADX WARN: Type inference failed for: r8v228 */
    /* JADX WARN: Type inference failed for: r8v229 */
    /* JADX WARN: Type inference failed for: r8v234 */
    /* JADX WARN: Type inference failed for: r8v239 */
    /* JADX WARN: Type inference failed for: r8v241 */
    /* JADX WARN: Type inference failed for: r8v279 */
    /* JADX WARN: Type inference failed for: r8v281, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v309, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v310 */
    /* JADX WARN: Type inference failed for: r8v311 */
    /* JADX WARN: Type inference failed for: r8v312 */
    /* JADX WARN: Type inference failed for: r8v315, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v317, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v318 */
    /* JADX WARN: Type inference failed for: r8v323 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v341 */
    /* JADX WARN: Type inference failed for: r8v347 */
    /* JADX WARN: Type inference failed for: r8v348 */
    /* JADX WARN: Type inference failed for: r8v349 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v353 */
    /* JADX WARN: Type inference failed for: r8v355, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v358, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v359, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v360, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v361 */
    /* JADX WARN: Type inference failed for: r8v367 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v374, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v375 */
    /* JADX WARN: Type inference failed for: r8v376 */
    /* JADX WARN: Type inference failed for: r8v377 */
    /* JADX WARN: Type inference failed for: r8v378 */
    /* JADX WARN: Type inference failed for: r8v379 */
    /* JADX WARN: Type inference failed for: r8v384 */
    /* JADX WARN: Type inference failed for: r8v385 */
    /* JADX WARN: Type inference failed for: r8v409 */
    /* JADX WARN: Type inference failed for: r8v410, types: [int] */
    /* JADX WARN: Type inference failed for: r8v413, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v414 */
    /* JADX WARN: Type inference failed for: r8v415 */
    /* JADX WARN: Type inference failed for: r8v417 */
    /* JADX WARN: Type inference failed for: r8v418 */
    /* JADX WARN: Type inference failed for: r8v419 */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v441 */
    /* JADX WARN: Type inference failed for: r8v446, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v448, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v449, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v450 */
    /* JADX WARN: Type inference failed for: r8v455 */
    /* JADX WARN: Type inference failed for: r8v477 */
    /* JADX WARN: Type inference failed for: r8v478 */
    /* JADX WARN: Type inference failed for: r8v479 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v497, types: [int] */
    /* JADX WARN: Type inference failed for: r8v502 */
    /* JADX WARN: Type inference failed for: r8v503 */
    /* JADX WARN: Type inference failed for: r8v505, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v508, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v509 */
    /* JADX WARN: Type inference failed for: r8v515, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v516, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v517 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v523 */
    /* JADX WARN: Type inference failed for: r8v525 */
    /* JADX WARN: Type inference failed for: r8v526 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v534 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v553 */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v564, types: [java.lang.Object, java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r8v565 */
    /* JADX WARN: Type inference failed for: r8v567, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v569 */
    /* JADX WARN: Type inference failed for: r8v570, types: [int] */
    /* JADX WARN: Type inference failed for: r8v571 */
    /* JADX WARN: Type inference failed for: r8v572 */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v70, types: [int] */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v879 */
    /* JADX WARN: Type inference failed for: r8v880 */
    /* JADX WARN: Type inference failed for: r8v881 */
    /* JADX WARN: Type inference failed for: r8v882 */
    /* JADX WARN: Type inference failed for: r8v883 */
    /* JADX WARN: Type inference failed for: r8v884 */
    /* JADX WARN: Type inference failed for: r8v885 */
    /* JADX WARN: Type inference failed for: r8v886 */
    /* JADX WARN: Type inference failed for: r8v887 */
    /* JADX WARN: Type inference failed for: r8v888 */
    /* JADX WARN: Type inference failed for: r8v889 */
    /* JADX WARN: Type inference failed for: r8v890 */
    /* JADX WARN: Type inference failed for: r8v891 */
    /* JADX WARN: Type inference failed for: r8v892 */
    /* JADX WARN: Type inference failed for: r8v893 */
    /* JADX WARN: Type inference failed for: r8v894 */
    /* JADX WARN: Type inference failed for: r8v895 */
    /* JADX WARN: Type inference failed for: r8v896 */
    /* JADX WARN: Type inference failed for: r8v897 */
    /* JADX WARN: Type inference failed for: r8v898 */
    /* JADX WARN: Type inference failed for: r8v899 */
    /* JADX WARN: Type inference failed for: r8v900 */
    /* JADX WARN: Type inference failed for: r8v901 */
    /* JADX WARN: Type inference failed for: r8v902 */
    /* JADX WARN: Type inference failed for: r8v903 */
    /* JADX WARN: Type inference failed for: r8v904 */
    /* JADX WARN: Type inference failed for: r8v905 */
    /* JADX WARN: Type inference failed for: r8v906 */
    /* JADX WARN: Type inference failed for: r8v907 */
    /* JADX WARN: Type inference failed for: r8v908 */
    /* JADX WARN: Type inference failed for: r8v909 */
    /* JADX WARN: Type inference failed for: r8v910 */
    /* JADX WARN: Type inference failed for: r8v911 */
    /* JADX WARN: Type inference failed for: r8v912 */
    /* JADX WARN: Type inference failed for: r8v913 */
    /* JADX WARN: Type inference failed for: r8v914 */
    /* JADX WARN: Type inference failed for: r8v915 */
    /* JADX WARN: Type inference failed for: r8v916 */
    /* JADX WARN: Type inference failed for: r8v917 */
    /* JADX WARN: Type inference failed for: r8v918 */
    /* JADX WARN: Type inference failed for: r8v919 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v920 */
    /* JADX WARN: Type inference failed for: r8v921 */
    /* JADX WARN: Type inference failed for: r8v922 */
    /* JADX WARN: Type inference failed for: r8v923 */
    /* JADX WARN: Type inference failed for: r8v924 */
    /* JADX WARN: Type inference failed for: r8v925 */
    /* JADX WARN: Type inference failed for: r8v926 */
    /* JADX WARN: Type inference failed for: r8v927 */
    /* JADX WARN: Type inference failed for: r8v928 */
    /* JADX WARN: Type inference failed for: r8v929 */
    /* JADX WARN: Type inference failed for: r8v930 */
    /* JADX WARN: Type inference failed for: r8v931 */
    /* JADX WARN: Type inference failed for: r8v932 */
    /* JADX WARN: Type inference failed for: r8v933 */
    /* JADX WARN: Type inference failed for: r8v934 */
    /* JADX WARN: Type inference failed for: r8v935 */
    /* JADX WARN: Type inference failed for: r8v936 */
    /* JADX WARN: Type inference failed for: r8v937 */
    /* JADX WARN: Type inference failed for: r8v938 */
    /* JADX WARN: Type inference failed for: r8v939 */
    /* JADX WARN: Type inference failed for: r8v940 */
    /* JADX WARN: Type inference failed for: r8v941 */
    /* JADX WARN: Type inference failed for: r8v942 */
    /* JADX WARN: Type inference failed for: r8v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Type inference failed for: r9v108, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r9v116 */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v297 */
    /* JADX WARN: Type inference failed for: r9v298 */
    /* JADX WARN: Type inference failed for: r9v299, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r9v300, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r9v304, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v305 */
    /* JADX WARN: Type inference failed for: r9v331 */
    /* JADX WARN: Type inference failed for: r9v332 */
    /* JADX WARN: Type inference failed for: r9v341 */
    /* JADX WARN: Type inference failed for: r9v342 */
    /* JADX WARN: Type inference failed for: r9v343 */
    /* JADX WARN: Type inference failed for: r9v344 */
    /* JADX WARN: Type inference failed for: r9v345 */
    /* JADX WARN: Type inference failed for: r9v349, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r9v520 */
    /* JADX WARN: Type inference failed for: r9v521 */
    /* JADX WARN: Type inference failed for: r9v522 */
    /* JADX WARN: Type inference failed for: r9v523 */
    /* JADX WARN: Type inference failed for: r9v524 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] copydefault(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 26328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState.copydefault(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }

    static void copydefault() {
        getAsAtTimestamp = 6474853653347888726L;
        equals = new char[]{33426, 33471, 33301, 33299, 33304, 33306, 33300, 33300, 33400, 33390, 33291, 33297, 33301, 33394, 33350, 33525, 33419, 33426, 33510, 33517, 33517, 33460, 33455, 33459, 33465, 33416, 33415, 33456, 33465, 33468, 33454, 33455, 33460, 33420, 33416, 33512, 33464, 33461, 33452, 33455, 33412, 33409, 33459, 33465, 33465, 33467, 33517, 33462, 33460, 33409, 33467, 33459, 33459, 33517, 33467, 33469, 33355, 33779, 33777, 33790, 33784, 33776, 33782, 33510, 33469, 33470, 33461, 33467, 33465, 33466, 33460, 33460, 33432, 33423, 33459, 33467, 33459, 33452, 33458, 33457, 33449, 33420, 33423, 33454, 33461, 33467, 33431, 33510, 33435, 33434, 33417, 33462, 33408, 33415, 33462, 33462, 33464, 33462, 33459, 33459, 33534, 33435, 33437, 33374, 33444, 33445, 33460, 33461, 33373, 33375, 33447, 33443, 33442, 33442, 33371, 33366, 33374, 33461, 33454, 33373, 33443, 33517, 33467, 33467, 33462, 33462, 33463, 33414, 33411, 33459, 33465, 33517, 33459, 33461, 33469, 33465, 33464, 33464, 33457, 33452, 33460, 33419, 33419, 33459, 33461, 33462, 33460, 33462, 33462, 33465, 33508, 33451, 33462, 33463, 33749, 33741, 33754, 33753, 33753, 33738, 33341, 33297, 33744, 33750, 33745, 33297, 33758, 33737, 33758, 33454, 33280, 33286, 33285, 33285, 33356, 33781, 33780, 33778, 33772, 33788, 33786, 33777, 33737, 33732, 33774, 33453, 33409, 33387, 33348, 33406, 33381, 33390, 33386, 33377, 33382, 33407, 33402, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33431, 33462, 33457, 33454, 33459, 33462, 33454, 33422, 33511, 33414, 33457, 33454, 33459, 33457, 33449, 33510, 33453, 33447, 33457, 33467, 33457, 33452, 33453, 33455, 33453, 33466, 33468, 33452, 33450, 33430, 33354, 33361, 33368, 33360, 33361, 33361, 33485, 33449, 33293, 33514, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33423, 33460, 33466, 33462, 33463, 33467, 33460, 33422, 33506, 33409, 33462, 33465, 33464, 33464, 33464, 33460, 33515, 33457, 33471, 33416, 33461, 33457, 33456, 33458, 33529, 33431, 33507, 33512, 33462, 33431, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33463, 33461, 33461, 33412, 33416, 33465, 33467, 33465, 33464, 33469, 33415, 33504, 33426, 33457, 33424, 33422, 33454, 33462, 33459, 33454, 33320, 33334, 33332, 33330, 33335, 33319, 33519, 33460, 33460, 33418, 33517, 33463, 33464, 33470, 33459, 33452, 33455, 33458, 33409, 33438, 33429, 33461, 33464, 33465, 33426, 33432, 33460, 33460, 33466, 33467, 33302, 33306, 33308, 33302, 33380, 33380, 33309, 33381, 33376, 33384, 33380, 33310, 33381, 33379, 33284, 33282, 33284, 33334, 33332, 33288, 33382, 33333, 33483, 33531, 33522, 33419, 33457, 33459, 33457, 33461, 33464, 33456, 33455, 33461, 33461, 33460, 33435, 33437, 33467, 33469, 33462, 33452, 33429, 33434, 33464, 33469, 33461, 33452, 33430, 33436, 33461, 33460, 33463, 33466, 33460, 33459, 33466, 33436, 33430, 33455, 33455, 33453, 33460, 33437, 33437, 33467, 33459, 33460, 33467, 33461, 33451, 33457, 33462, 33470, 33476, 33509, 33432};
    }
}
