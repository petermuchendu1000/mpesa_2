package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawUiState;", "", "amount", "", "amountErrorMessage", "breakdown", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawBreakdown;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawBreakdown;)V", "getAmount", "()Ljava/lang/String;", "getAmountErrorMessage", "getBreakdown", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/SendWithdrawBreakdown;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendWithdrawUiState {
    public static final int $stable = 0;
    private static char component1;
    private static char[] copydefault;
    private static int equals;
    private final String ShareDataUIState;
    private final String component2;
    private final SendWithdrawBreakdown component3;
    private static final byte[] $$c = {Ascii.SI, -74, 84, -51};
    private static final int $$d = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 127;
    private static int copy = 0;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, int r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.$$c
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 * 3
            int r6 = 119 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.$$e(byte, int, int):java.lang.String");
    }

    private static void a(short s, short s2, short s3, Object[] objArr) {
        int i = s2 + 4;
        int i2 = (s * 16) + 83;
        int i3 = s3 * 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 10];
        int i4 = i3 + 9;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i4 + i2) - 17;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i++;
                i2 = (i2 + bArr[i]) - 17;
            }
        }
    }

    public SendWithdrawUiState(String str, String str2, SendWithdrawBreakdown sendWithdrawBreakdown) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sendWithdrawBreakdown, "");
        this.ShareDataUIState = str;
        this.component2 = str2;
        this.component3 = sendWithdrawBreakdown;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public SendWithdrawUiState(java.lang.String r17, java.lang.String r18, com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawBreakdown r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r16 = this;
            r0 = r20 & 1
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L1a
            int r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.component4
            int r0 = r0 + 121
            int r3 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.copy = r3
            int r0 = r0 % r2
            if (r0 != 0) goto L16
            java.lang.String r0 = ""
            int r3 = r2 % r2
            goto L1c
        L16:
            r1.hashCode()
            throw r1
        L1a:
            r0 = r17
        L1c:
            r3 = r20 & 2
            if (r3 == 0) goto L2c
            int r3 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.copy
            int r3 = r3 + 97
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.component4 = r4
            int r3 = r3 % r2
            int r3 = r2 % r2
            goto L2e
        L2c:
            r1 = r18
        L2e:
            r3 = r20 & 4
            if (r3 == 0) goto L48
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawBreakdown r3 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawBreakdown
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 511(0x1ff, float:7.16E-43)
            r15 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r2 = r2 % r2
            r2 = r16
            goto L4c
        L48:
            r2 = r16
            r3 = r19
        L4c:
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.<init>(java.lang.String, java.lang.String, com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawBreakdown, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 67;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 85;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountErrorMessage() {
        int i = 2 % 2;
        int i2 = copy + 123;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 23;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    public final SendWithdrawBreakdown getBreakdown() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 109;
        copy = i3 % 128;
        int i4 = i3 % 2;
        SendWithdrawBreakdown sendWithdrawBreakdown = this.component3;
        int i5 = i2 + 9;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return sendWithdrawBreakdown;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        Object obj2 = null;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> i4) + 7422, 15 - Color.alpha(0), (char) (64291 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 11;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            long j = 0;
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, (char) (64290 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i8 = $11 + 121;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 + b2);
                            cArr4[cancelall.component2] = (char) (cancelall.component3 >>> b2);
                        } else {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                            cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 7118, 15 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), (char) (44462 - ExpandableListView.getPackedPositionChild(j)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i9 = $11 + 77;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 2944, ExpandableListView.getPackedPositionType(j) + 24, (char) (27637 - (KeyEvent.getMaxKeyCode() >> 16)), 794909189, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i12];
                                cArr4[cancelall.component2 + 1] = cArr2[i13];
                            } else {
                                int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i14];
                                cArr4[cancelall.component2 + 1] = cArr2[i15];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    j = 0;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                int i17 = $11 + 79;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.component2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 999;
            int i2 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            char cResolveSizeAndState = (char) (61685 - View.resolveSizeAndState(0, 0, 0));
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 - 1);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, i2, cResolveSizeAndState, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((byte) (103 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), new char[]{16, 3, 22, 20, '\n', 1, 22, 23, 16, 21, 24, '\f', 6, 19, '\b', 2, 20, '\b', 1, 14, 23, '\n'}, 22 - View.resolveSizeAndState(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 56), new char[]{4, 0, 15, CharUtils.CR, 18, 1, 22, 11, '\b', 23, 2, '\t', 3, 20, 13880}, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int i3 = 1000 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iMyTid = 31 - (Process.myTid() >> 22);
            char cGreen = (char) (Color.green(0) + 61685);
            int i4 = $$b;
            Object[] objArr5 = new Object[1];
            a((byte) (i4 & 1), (byte) (i4 & 14), (byte) 0, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i3, iMyTid, cGreen, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = component4 + 11;
            copy = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int iIndexOf = TextUtils.indexOf("", "", 0) + 999;
                int defaultSize = View.getDefaultSize(0, 0) + 31;
                char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61684);
                Object[] objArr6 = new Object[1];
                a((byte) ($$b & 1), $$a[26], (byte) 0, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, defaultSize, c2, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = 116037710 + (((~((-547136682) | i9)) | 202336712) * (-90)) + (((~((-547136682) | iIdentityHashCode)) | (-748678634)) * (-45)) + (((~(iIdentityHashCode | (-202336713))) | (-547136682) | (~(i9 | 202336712))) * 45) + 1898769572;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2217, 45 - View.getDefaultSize(0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 1898769572, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int iKeyCodeFromString = 999 - KeyEvent.keyCodeFromString("");
                    int iRgb = (-16777185) - Color.rgb(0, 0, 0);
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 61685);
                    int i13 = $$b;
                    Object[] objArr9 = new Object[1];
                    a((byte) (i13 & 1), (byte) (i13 & 160), (byte) 0, objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iRgb, cIndexOf, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 1031, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, (char) TextUtils.getOffsetBefore("", 0)), (Class) ITrustedWebActivityCallbackDefault.copydefault(1072 - View.MeasureSpec.getMode(0), 43 - Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33532)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 999;
                    int i14 = 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    char cGreen2 = (char) (61685 - Color.green(0));
                    Object[] objArr11 = new Object[1];
                    a((byte) ($$b & 1), $$a[26], (byte) 0, objArr11);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, i14, cGreen2, 1267122354, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    b((byte) (Gravity.getAbsoluteGravity(0, 0) + 103), new char[]{16, 3, 22, 20, '\n', 1, 22, 23, 16, 21, 24, '\f', 6, 19, '\b', 2, 20, '\b', 1, 14, 23, '\n'}, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 58), new char[]{4, 0, 15, CharUtils.CR, 18, 1, 22, 11, '\b', 23, 2, '\t', 3, 20, 13880}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1000;
                        int longPressTimeout = 31 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 61684);
                        int i15 = $$b;
                        Object[] objArr14 = new Object[1];
                        a((byte) (i15 & 1), (byte) (i15 & 14), (byte) 0, objArr14);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, longPressTimeout, c3, 1267259187, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int windowTouchSlop = 999 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int deadChar = 31 - KeyEvent.getDeadChar(0, 0);
                        char cIndexOf2 = (char) (61685 - TextUtils.indexOf("", "", 0));
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        Object[] objArr15 = new Object[1];
                        a(b4, b5, (byte) (-b5), objArr15);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, deadChar, cIndexOf2, -1638177773, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[2])[0];
        if (i17 == i16) {
            int i18 = component4 + 99;
            copy = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            int i23 = i20 + (((~((~r0) | (-625154))) * 130) - 1114785521) + (((~(((int) Runtime.getRuntime().maxMemory()) | (-625154))) | 211944560) * 130);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
            Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i26 = ((int[]) objArr16[3])[0];
            int i27 = ((int[]) objArr16[2])[0];
            int i28 = ((int[]) objArr16[1])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i29 = 1161784939 + ((168554097 | iIdentityHashCode2) * 614);
            int i30 = ~iIdentityHashCode2;
            int i31 = i26 + i29 + (((~((-459013185) | i30)) | 168553536 | (~(290460209 | i30))) * (-1228)) + (((~(i30 | 459013745)) | (~((-290459649) | i30))) * 614);
            int i32 = i31 ^ (i31 << 13);
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr17[3])[0] = i33 ^ (i33 << 5);
            int i34 = component4 + 49;
            copy = i34 % 128;
            int i35 = i34 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i36 = 0;
                while (i36 < strArr.length) {
                    arrayList.add(strArr[i36]);
                    i36++;
                    int i37 = copy + 17;
                    component4 = i37 % 128;
                    int i38 = i37 % 2;
                }
            }
            long j2 = -1;
            long j3 = ((long) (i16 ^ i17)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6617 - MotionEvent.axisFromString(""), Color.alpha(0) + 42, (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr18 = {2020307817, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 6563, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) Color.argb(0, 0, 0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr18);
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[2])[0];
            int i41 = ((int[]) objArr[1])[0];
            int iMyUid = Process.myUid();
            int i42 = ~iMyUid;
            int i43 = i39 + (-1618399514) + (((~((-125227231) | i42)) | (~(662175199 | iMyUid))) * (-831)) + ((~((-37929037) | iMyUid)) * (-1662)) + (((~(iMyUid | 125227230)) | (~(i42 | (-624246164))) | (~(624246163 | iMyUid))) * 831);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr19[3])[0] = i45 ^ (i45 << 5);
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            Object[] objArr20 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i46 = ((int[]) objArr19[3])[0];
            int i47 = ((int[]) objArr19[2])[0];
            int i48 = ((int[]) objArr19[1])[0];
            int iMyPid = Process.myPid();
            int i49 = ~iMyPid;
            int i50 = i46 + (((~((-35751937) | i49)) | (~(392949105 | iMyPid))) * 988) + 1414280809 + (((~(iMyPid | (-392276225))) | 356524288 | (~(i49 | 392949105))) * 988);
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr20[3])[0] = i52 ^ (i52 << 5);
        }
        return str;
    }

    static {
        equals = 1;
        ShareDataUIState();
        int i = getAsAtTimestamp + 109;
        equals = i % 128;
        int i2 = i % 2;
    }

    public SendWithdrawUiState() {
        this(null, null, null, 7, null);
    }

    public static SendWithdrawUiState copy$default(SendWithdrawUiState sendWithdrawUiState, String str, String str2, SendWithdrawBreakdown sendWithdrawBreakdown, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 91;
        copy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = sendWithdrawUiState.ShareDataUIState;
            int i6 = i3 + 89;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            str2 = sendWithdrawUiState.component2;
        }
        if ((i & 4) != 0) {
            int i8 = i3 + 39;
            copy = i8 % 128;
            int i9 = i8 % 2;
            sendWithdrawBreakdown = sendWithdrawUiState.component3;
        }
        return sendWithdrawUiState.copy(str, str2, sendWithdrawBreakdown);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 115;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SendWithdrawBreakdown component3() {
        int i = 2 % 2;
        int i2 = copy + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        SendWithdrawBreakdown sendWithdrawBreakdown = this.component3;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return sendWithdrawBreakdown;
    }

    public final SendWithdrawUiState copy(String amount, String amountErrorMessage, SendWithdrawBreakdown breakdown) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(breakdown, "");
        SendWithdrawUiState sendWithdrawUiState = new SendWithdrawUiState(amount, amountErrorMessage, breakdown);
        int i2 = copy + 5;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return sendWithdrawUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy + 91;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 41;
            copy = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(other instanceof SendWithdrawUiState)) {
            return false;
        }
        SendWithdrawUiState sendWithdrawUiState = (SendWithdrawUiState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, sendWithdrawUiState.ShareDataUIState)) {
            int i5 = copy + 99;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, sendWithdrawUiState.component2)) {
            return Intrinsics.areEqual(this.component3, sendWithdrawUiState.component3);
        }
        int i7 = component4 + 53;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3
  0x0032: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r3v11 java.lang.String) = (r3v0 java.lang.String), (r3v13 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.component4
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.copy = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.String r1 = r6.ShareDataUIState
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.component2
            r4 = 20
            int r4 = r4 / r2
            if (r3 != 0) goto L32
            goto L27
        L1d:
            java.lang.String r1 = r6.ShareDataUIState
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.component2
            if (r3 != 0) goto L32
        L27:
            int r3 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.component4
            int r3 = r3 + 31
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.copy = r4
            int r3 = r3 % r0
            r3 = r2
            goto L36
        L32:
            int r3 = r3.hashCode()
        L36:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawBreakdown r3 = r6.component3
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r3 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.copy
            r4 = 27
            int r3 = r3 + r4
            int r5 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.component4 = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L4f
            int r4 = r4 / r2
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.SendWithdrawUiState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendWithdrawUiState(amount=" + this.ShareDataUIState + ", amountErrorMessage=" + this.component2 + ", breakdown=" + this.component3 + ")";
        int i2 = component4 + 77;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void ShareDataUIState() {
        copydefault = new char[]{2025, 2030, 2023, 2021, 2028, 1987, 1051, 2036, 2016, 2041, 2032, 2031, 2002, 2027, 2003, 1050, 2035, 2022, 2017, 2018, 2019, 2020, 1966, 2029, 2034};
        component1 = (char) 12831;
    }
}
