package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;", "Landroid/os/Parcelable;", "amount", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutCurrency;", "convertedAmount", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutCurrency;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutCurrency;)V", "getAmount", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutCurrency;", "getConvertedAmount", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutRequest> CREATOR;
    private static long ShareDataUIState;
    private static char[] component2;
    private static int component3;
    private final RoamingCashoutCurrency amount;
    private final RoamingCashoutCurrency convertedAmount;
    private static final byte[] $$c = {TarHeader.LF_CHR, -113, 92, 4};
    private static final int $$d = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Ascii.GS, -26, 91, 68, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 120;
    private static int component1 = 0;
    private static int copy = 1;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutRequest> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutRequest roamingCashoutRequest = new RoamingCashoutRequest(RoamingCashoutCurrency.CREATOR.createFromParcel(parcel), RoamingCashoutCurrency.CREATOR.createFromParcel(parcel));
            int i2 = ShareDataUIState + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashoutRequest;
        }

        @Override
        public RoamingCashoutRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 103;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutRequest roamingCashoutRequestCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 90 / 0;
            }
            int i5 = ShareDataUIState + 69;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
            return roamingCashoutRequestCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 99;
            component3 = i4 % 128;
            RoamingCashoutRequest[] roamingCashoutRequestArr = new RoamingCashoutRequest[i];
            if (i4 % 2 != 0) {
                int i5 = 64 / 0;
            }
            int i6 = i3 + 61;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return roamingCashoutRequestArr;
        }

        @Override
        public RoamingCashoutRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 13;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r7, byte r8, short r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutRequest.$$c
            int r9 = r9 + 117
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutRequest.$$e(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutRequest.$$a
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r6 = r6 * 16
            int r6 = r6 + 83
            int r7 = r7 * 6
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r5]
        L2a:
            int r6 = r6 + r3
            int r5 = r5 + 1
            int r6 = r6 + (-17)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutRequest.a(short, short, int, java.lang.Object[]):void");
    }

    public RoamingCashoutRequest(RoamingCashoutCurrency roamingCashoutCurrency, RoamingCashoutCurrency roamingCashoutCurrency2) {
        Intrinsics.checkNotNullParameter(roamingCashoutCurrency, "");
        Intrinsics.checkNotNullParameter(roamingCashoutCurrency2, "");
        this.amount = roamingCashoutCurrency;
        this.convertedAmount = roamingCashoutCurrency2;
    }

    public final RoamingCashoutCurrency getAmount() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        RoamingCashoutCurrency roamingCashoutCurrency = this.amount;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return roamingCashoutCurrency;
    }

    public final RoamingCashoutCurrency getConvertedAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        copy = i3 % 128;
        int i4 = i3 % 2;
        RoamingCashoutCurrency roamingCashoutCurrency = this.convertedAmount;
        int i5 = i2 + 15;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return roamingCashoutCurrency;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i2 + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 1758, 34 - View.resolveSizeAndState(0, 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), 1159210934, false, $$e(b2, (byte) (b2 - 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Process.getGidForName("") + 30, (char) (7171 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1951385784, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4012, 24 - View.combineMeasuredStates(0, 0), (char) (27762 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1529629956, false, $$e(b5, b6, (byte) (b6 & 5)), new Class[]{Object.class, Object.class});
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
        int i5 = $11 + 107;
        $10 = i5 % 128;
        int i6 = 2;
        int i7 = i5 % 2;
        while (cancelnotification.copydefault < i) {
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % i6;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 - 1);
                i6 = 2;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4013, ImageFormat.getBitsPerPixel(0) + 25, (char) (27761 - View.resolveSizeAndState(0, 0, 0)), -1529629956, false, $$e(b7, b8, (byte) (b8 & 5)), new Class[]{Object.class, Object.class});
            } else {
                i6 = 2;
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v121, types: [char, int] */
    public String toString() throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("RoamingCashoutRequest(amount=");
        sb.append(this.amount);
        sb.append(", convertedAmount=");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int iLastIndexOf = 998 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iAxisFromString = 30 - MotionEvent.axisFromString("");
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 61685);
            byte b2 = (byte) 0;
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iAxisFromString, threadPriority, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(21 - TextUtils.lastIndexOf("", '0', 0, 0), Process.myPid() >> 22, (char) View.getDefaultSize(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(15 - TextUtils.indexOf("", "", 0, 0), 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16807322), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int mode = 999 - View.MeasureSpec.getMode(0);
            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 31;
            char maximumDrawingCacheSize = (char) (61685 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            byte b4 = $$a[12];
            byte b5 = (byte) (b4 - 4);
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 - 1), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(mode, threadPriority2, maximumDrawingCacheSize, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = copy + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int jumpTapTimeout = 999 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 61686);
                byte[] bArr = $$a;
                byte b6 = bArr[24];
                byte b7 = (byte) (bArr[18] - 1);
                Object[] objArr6 = new Object[1];
                a(b6, b7, (byte) (b7 - 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, i4, cLastIndexOf, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            int iMyUid = Process.myUid();
            int i7 = ~iMyUid;
            int i8 = (((1313479165 + (((~((-626664359) | i7)) | 122809035) * (-602))) + ((((~(iMyUid | (-626664359))) | 89137794) | (~(660335599 | i7))) * (-301))) + ((~(i7 | 122809035)) * 301)) - 1448093211;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
            c2 = 2;
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 2217, View.resolveSizeAndState(0, 0, 0) + 45, (char) Drawable.resolveOpacity(0, 0), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), -1448093211, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int size = View.MeasureSpec.getSize(0) + 999;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31;
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 61685);
                    byte b8 = (byte) ($$a[5] + 1);
                    byte b9 = (byte) (b8 & 5);
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, (byte) (b9 - 1), objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(size, minimumFlingVelocity, absoluteGravity, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1030, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)), (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 1072, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int mode2 = 999 - View.MeasureSpec.getMode(0);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 31;
                    char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 61685);
                    byte[] bArr2 = $$a;
                    byte b10 = bArr2[24];
                    byte b11 = (byte) (bArr2[18] - 1);
                    Object[] objArr10 = new Object[1];
                    a(b10, b11, (byte) (b11 - 1), objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(mode2, iMakeMeasureSpec, jumpTapTimeout2, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(22 - Color.red(0), TextUtils.indexOf("", "", 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((Process.myTid() >> 22) + 15, TextUtils.indexOf((CharSequence) "", '0') + 23, (char) (Color.blue(0) + 30106), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 998;
                        int i12 = 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 61686);
                        byte b12 = $$a[12];
                        byte b13 = (byte) (b12 - 4);
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, (byte) (b13 - 1), objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i11, i12, modifierMetaStateMask, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 999;
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31;
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 61686);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr14 = new Object[1];
                        a(b14, b15, (byte) (b15 + 1), objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, doubleTapTimeout, cLastIndexOf2, -1638177773, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    int i13 = component1 + 31;
                    copy = i13 % 128;
                    c2 = 2;
                    int i14 = i13 % 2;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[c2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i17 = 0;
                while (i17 < strArr.length) {
                    int i18 = component1 + 87;
                    copy = i18 % 128;
                    if (i18 % 2 == 0) {
                        arrayList.add(strArr[i17]);
                        i17 += 108;
                    } else {
                        arrayList.add(strArr[i17]);
                        i17++;
                    }
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) 11) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 6618, 42 - Drawable.resolveOpacity(0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr15 = {-969757460, Long.valueOf(j4), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 6562, 56 - (Process.myPid() >> 22), (char) Color.green(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr15);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i22 = 950960785 + (((~(301617941 | iElapsedRealtime)) | 447855452) * 672);
            int i23 = ~iElapsedRealtime;
            int i24 = i19 + i22 + (((~(iElapsedRealtime | 447855452)) | (~((-301617942) | i23))) * (-672)) + (((~((-447855453) | i23)) | 167880776) * 672);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr16[3])[0] = i26 ^ (i26 << 5);
            throw null;
        }
        Object[] objArr17 = new Object[4];
        objArr17[1] = new int[]{i};
        objArr17[c2] = new int[]{i};
        objArr17[3] = new int[1];
        int i27 = ((int[]) objArr[3])[0];
        int i28 = ((int[]) objArr[c2])[0];
        int i29 = ((int[]) objArr[1])[0];
        objArr17[0] = new String[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i30 = ~iIdentityHashCode;
        int i31 = i27 + 154213085 + ((1070972890 | iIdentityHashCode) * (-676)) + (((~(927051082 | i30)) | (-1070972891)) * 676) + (((~(iIdentityHashCode | (-143921809))) | (~(i30 | 177577688)) | 893395202) * 676);
        int i32 = (i31 << 13) ^ i31;
        int i33 = i32 ^ (i32 >>> 17);
        ((int[]) objArr17[3])[0] = i33 ^ (i33 << 5);
        Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i34 = ((int[]) objArr17[3])[0];
        int i35 = ((int[]) objArr17[2])[0];
        int i36 = ((int[]) objArr17[1])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i37 = ~iIdentityHashCode2;
        int i38 = ~(358994187 | i37);
        int i39 = i34 + 1691970441 + ((33696868 | i38) * (-712)) + (((~(iIdentityHashCode2 | 392691055)) | (~(i37 | (-33696869)))) * (-712)) + (((-390479207) | i38) * 712);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr18[3])[0] = i41 ^ (i41 << 5);
        sb.append(this.convertedAmount);
        int i42 = ((int[]) objArr18[3])[0];
        int i43 = i42 * i42;
        int i44 = -(1953543488 * i42);
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        int i46 = -(i42 * (-1605705960));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        int i48 = (i47 ^ (-207521904)) + (((-207521904) & i47) << 1);
        int i49 = i48 >> 23;
        int i50 = ((i49 ^ (-1023)) + ((i49 & (-1023)) << 1)) / 512;
        int i51 = (i50 ^ 1) + ((i50 & 1) << 1);
        int i52 = (i48 & i51) + (i51 | i48);
        int i53 = i48 >> 28;
        int i54 = -(i52 ^ ((((i53 ^ (-31)) + ((i53 & (-31)) << 1)) / 16) - (-1)));
        int i55 = (i54 & 8) + (i54 | 8);
        int i56 = i55 >> 15;
        int i57 = ((i56 ^ (-262143)) + ((i56 & (-262143)) << 1)) / 131072;
        int i58 = ((i57 | 1) << 1) - (i57 ^ 1);
        sb.append((char) (440504 / (((-(((i58 | 1) << 1) - (i58 ^ 1))) & i55) * 1343)));
        return sb.toString();
    }

    static {
        component3 = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = copydefault + 3;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static RoamingCashoutRequest copy$default(RoamingCashoutRequest roamingCashoutRequest, RoamingCashoutCurrency roamingCashoutCurrency, RoamingCashoutCurrency roamingCashoutCurrency2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 61;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            roamingCashoutCurrency = roamingCashoutRequest.amount;
            int i6 = i3 + 43;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 2;
            }
        }
        if ((i & 2) != 0) {
            roamingCashoutCurrency2 = roamingCashoutRequest.convertedAmount;
            int i8 = component1 + 29;
            copy = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 5;
            }
        }
        return roamingCashoutRequest.copy(roamingCashoutCurrency, roamingCashoutCurrency2);
    }

    public final RoamingCashoutCurrency component1() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        RoamingCashoutCurrency roamingCashoutCurrency = this.amount;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return roamingCashoutCurrency;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutCurrency component2() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.convertedAmount;
        }
        throw null;
    }

    public final RoamingCashoutRequest copy(RoamingCashoutCurrency amount, RoamingCashoutCurrency convertedAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(convertedAmount, "");
        RoamingCashoutRequest roamingCashoutRequest = new RoamingCashoutRequest(amount, convertedAmount);
        int i2 = copy + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return roamingCashoutRequest;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy + 97;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutRequest)) {
            int i4 = i3 + 41;
            copy = i4 % 128;
            return i4 % 2 == 0;
        }
        RoamingCashoutRequest roamingCashoutRequest = (RoamingCashoutRequest) other;
        if (!Intrinsics.areEqual(this.amount, roamingCashoutRequest.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.convertedAmount, roamingCashoutRequest.convertedAmount)) {
            return true;
        }
        int i5 = copy + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.amount.hashCode() * 31) + this.convertedAmount.hashCode();
        int i4 = copy + 51;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copy + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.amount.writeToParcel(dest, flags);
        this.convertedAmount.writeToParcel(dest, flags);
        int i4 = copy + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        component2 = new char[]{3095, 63466, 64502, 65490, 58321, 59301, 60350, 61382, 54153, 55175, 56108, 57155, 50007, 51023, 52030, 53053, 45883, 46887, 47902, 48879, 41725, 42695, 31113, 33394, 36457, 35402, 38487, 37427, 40484, 39456, 42521, 41487, 44788, 43774, 46813, 45771, 48821};
        ShareDataUIState = 786465866424776580L;
    }
}
