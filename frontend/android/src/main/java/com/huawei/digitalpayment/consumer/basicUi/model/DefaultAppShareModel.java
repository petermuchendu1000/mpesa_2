package com.huawei.digitalpayment.consumer.basicUi.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.basicUi.request.SendMessageParams;
import com.huawei.http.BaseResp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public class DefaultAppShareModel implements IAppShareModel {
    private static int component3 = 1;
    private static int copydefault;

    @Inject
    public DefaultAppShareModel() {
    }

    @Override
    public void sendMessage(SendMessageParams sendMessageParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            public static int component1;
            private static char[] copydefault;
            private static int getRequestBeneficiariesState;
            private static final byte[] $$c = {34, -66, 77, Ascii.DC2};
            private static final int $$d = 68;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {68, -59, -116, 119, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
            private static final int $$b = 143;
            private static int component2 = 0;
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(byte r5, int r6, byte r7) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.model.DefaultAppShareModel.AnonymousClass1.$$c
                    int r5 = r5 + 110
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L17
                    r5 = r6
                    r3 = r7
                    r4 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L25:
                    r3 = r0[r6]
                L27:
                    int r3 = -r3
                    int r6 = r6 + 1
                    int r5 = r5 + r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.model.DefaultAppShareModel.AnonymousClass1.$$e(byte, int, byte):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 6
                    int r0 = 16 - r7
                    int r6 = r6 + 4
                    int r8 = r8 * 16
                    int r8 = r8 + 83
                    byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.model.DefaultAppShareModel.AnonymousClass1.$$a
                    byte[] r0 = new byte[r0]
                    int r7 = 15 - r7
                    r2 = 0
                    if (r1 != 0) goto L17
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1b:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    if (r3 != r7) goto L2c
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2c:
                    r3 = r1[r8]
                L2e:
                    int r6 = r6 + r3
                    int r6 = r6 + (-17)
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.model.DefaultAppShareModel.AnonymousClass1.a(int, short, byte, java.lang.Object[]):void");
            }

            private static void b(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
                int i2;
                int i3;
                int i4 = 2 % 2;
                ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
                int i5 = iArr[0];
                byte b2 = 1;
                int i6 = iArr[1];
                int i7 = iArr[2];
                int i8 = iArr[3];
                char[] cArr = copydefault;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        int i10 = $11 + 83;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                            if (objCopydefault == null) {
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 14 - TextUtils.indexOf("", ""), (char) (65118 - TextUtils.getOffsetBefore("", 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                            }
                            cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i6];
                System.arraycopy(cArr, i5, cArr3, 0, i6);
                if (bArr != null) {
                    int i12 = $11 + 23;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    char[] cArr4 = new char[i6];
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    char c2 = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                        if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                            int i14 = $10 + 91;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            int i16 = iTrustedWebActivityService_Parcel.copydefault;
                            char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                            Object[] objArr3 = new Object[2];
                            objArr3[b2] = Integer.valueOf(c2);
                            objArr3[0] = Integer.valueOf(c3);
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                            if (objCopydefault2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4501, 36 - View.MeasureSpec.getMode(0), (char) (Color.blue(0) + 27897), -1464227204, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i16] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        } else {
                            int i17 = iTrustedWebActivityService_Parcel.copydefault;
                            Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                            if (objCopydefault3 == null) {
                                byte b5 = (byte) 5;
                                byte b6 = (byte) (b5 - 5);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - TextUtils.indexOf("", "", 0), 28 - (ViewConfiguration.getEdgeSlop() >> 16), (char) Color.argb(0, 0, 0, 0), 1180380354, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i17] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                        }
                        c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                        Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                        if (objCopydefault4 == null) {
                            int iCombineMeasuredStates = 1859 - View.combineMeasuredStates(0, 0);
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 35;
                            char cMyTid = (char) (Process.myTid() >> 22);
                            byte length2 = (byte) $$c.length;
                            byte b7 = (byte) (length2 - 4);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, modifierMetaStateMask, cMyTid, 80302927, false, $$e(length2, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                        b2 = 1;
                    }
                    cArr3 = cArr4;
                }
                if (i8 > 0) {
                    char[] cArr5 = new char[i6];
                    System.arraycopy(cArr3, 0, cArr5, 0, i6);
                    int i18 = i6 - i8;
                    System.arraycopy(cArr5, 0, cArr3, i18, i8);
                    System.arraycopy(cArr5, i8, cArr3, 0, i18);
                }
                if (z) {
                    char[] cArr6 = new char[i6];
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                        int i19 = $10 + 23;
                        $11 = i19 % 128;
                        if (i19 % 2 == 0) {
                            cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 / iTrustedWebActivityService_Parcel.copydefault) / 0];
                            i3 = iTrustedWebActivityService_Parcel.copydefault >>> 1;
                        } else {
                            cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                            i3 = iTrustedWebActivityService_Parcel.copydefault + 1;
                        }
                        iTrustedWebActivityService_Parcel.copydefault = i3;
                    }
                    cArr3 = cArr6;
                }
                if (i7 > 0) {
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                        int i20 = $11 + 103;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] >> iArr[4]);
                            i2 = iTrustedWebActivityService_Parcel.copydefault;
                        } else {
                            cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                            i2 = iTrustedWebActivityService_Parcel.copydefault + 1;
                        }
                        iTrustedWebActivityService_Parcel.copydefault = i2;
                    }
                }
                String str = new String(cArr3);
                int i21 = $10 + 93;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str;
            }

            @Override
            public String getApiPath() throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = component3 + 91;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                if (objCopydefault == null) {
                    int iRgb = (-16776217) - Color.rgb(0, 0, 0);
                    int i5 = 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    char trimmedLength = (char) (61685 - TextUtils.getTrimmedLength(""));
                    byte b2 = (byte) ($$a[11] + 1);
                    byte b3 = (byte) (b2 + 1);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRgb, i5, trimmedLength, -1638177773, false, (String) objArr2[0], null);
                }
                long j = ((Field) objCopydefault).getLong(null);
                Object[] objArr3 = new Object[1];
                b(false, new int[]{0, 22, 0, 0}, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(false, new int[]{22, 15, 0, 0}, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                if (objCopydefault2 == null) {
                    int iMyTid = (Process.myTid() >> 22) + 999;
                    int iIndexOf = 30 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    char cAlpha = (char) (61685 - Color.alpha(0));
                    int i6 = $$b;
                    byte b4 = (byte) (i6 & 1);
                    Object[] objArr5 = new Object[1];
                    a((byte) (i6 & 62), b4, b4, objArr5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, iIndexOf, cAlpha, 1267259187, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i7 = component3 + 45;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                    if (objCopydefault3 == null) {
                        int iAxisFromString = 998 - MotionEvent.axisFromString("");
                        int iLastIndexOf = 30 - TextUtils.lastIndexOf("", '0');
                        char cGreen = (char) (Color.green(0) + 61685);
                        byte b5 = $$a[26];
                        byte b6 = (byte) (b5 & 1);
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, b6, objArr6);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, iLastIndexOf, cGreen, 1267122354, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                    objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i9 = ((int[]) objArr7[2])[0];
                    int i10 = ((int[]) objArr7[1])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i11 = ~iIdentityHashCode;
                    int i12 = (((116037710 + (((~(154221366 | i11)) | 903694760) * (-90))) + (((~(154221366 | iIdentityHashCode)) | 136327702) * (-45))) + ((((~(iIdentityHashCode | (-903694761))) | 154221366) | (~(i11 | 903694760))) * 45)) - 211478436;
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr[3])[0] = i14 ^ (i14 << 5);
                } else {
                    try {
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 2217, (ViewConfiguration.getPressedStateDuration() >> 16) + 45, (char) (Process.myTid() >> 22), -2019038240, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), -211478436, 1};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                        if (objCopydefault5 == null) {
                            int absoluteGravity = 999 - Gravity.getAbsoluteGravity(0, 0);
                            int i15 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            char cIndexOf = (char) (61684 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            byte b7 = (byte) ($$b & 1);
                            Object[] objArr9 = new Object[1];
                            a((byte) 32, b7, b7, objArr9);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, i15, cIndexOf, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1029 - TextUtils.lastIndexOf("", '0', 0), MotionEvent.axisFromString("") + 43, (char) View.getDefaultSize(0, 0)), (Class) ITrustedWebActivityCallbackDefault.copydefault(1072 - TextUtils.getOffsetBefore("", 0), 43 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33531)), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                        if (objCopydefault6 == null) {
                            int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 999;
                            int doubleTapTimeout = 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 61685);
                            byte b8 = $$a[26];
                            byte b9 = (byte) (b8 & 1);
                            Object[] objArr10 = new Object[1];
                            a(b8, b9, b9, objArr10);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i16, doubleTapTimeout, windowTouchSlop, 1267122354, false, (String) objArr10[0], null);
                        }
                        ((Field) objCopydefault6).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            b(false, new int[]{0, 22, 0, 0}, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            b(false, new int[]{22, 15, 0, 0}, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                            if (objCopydefault7 == null) {
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 999;
                                int i17 = 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 61685);
                                int i18 = $$b;
                                byte b10 = (byte) (i18 & 62);
                                byte b11 = (byte) (i18 & 1);
                                Object[] objArr13 = new Object[1];
                                a(b10, b11, b11, objArr13);
                                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, i17, capsMode, 1267259187, false, (String) objArr13[0], null);
                            }
                            ((Field) objCopydefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                            if (objCopydefault8 == null) {
                                int i19 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 999;
                                int bitsPerPixel = 30 - ImageFormat.getBitsPerPixel(0);
                                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 61685);
                                byte b12 = (byte) ($$a[11] + 1);
                                byte b13 = (byte) (b12 + 1);
                                Object[] objArr14 = new Object[1];
                                a(b12, b13, b13, objArr14);
                                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i19, bitsPerPixel, cResolveOpacity, -1638177773, false, (String) objArr14[0], null);
                            }
                            ((Field) objCopydefault8).set(null, lValueOf2);
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
                int i20 = ((int[]) objArr[1])[0];
                int i21 = ((int[]) objArr[2])[0];
                if (i21 != i20) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[0];
                    if (strArr != null) {
                        int i22 = component3 + 11;
                        int i23 = i22 % 128;
                        ShareDataUIState = i23;
                        int i24 = i22 % 2;
                        int i25 = i23 + 55;
                        component3 = i25 % 128;
                        if (i25 % 2 == 0) {
                            int i26 = 2 % 4;
                        }
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Object[] objArr15 = objArr;
                    long j2 = -1;
                    long j3 = 0;
                    long j4 = (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) (i20 ^ i21))) | (((long) 11) << 32) | (j3 - ((j3 >> 63) << 32));
                    Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault9 == null) {
                        objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
                    Object[] objArr16 = {1157840301, Long.valueOf(j4), arrayList, null, false, false};
                    Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault10 == null) {
                        objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 55, (char) ((Process.getThreadPriority(0) + 20) >> 6), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault10).invoke(objInvoke, objArr16);
                    Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i27 = ((int[]) objArr15[3])[0];
                    int i28 = ((int[]) objArr15[2])[0];
                    int i29 = ((int[]) objArr15[1])[0];
                    int iMyTid2 = Process.myTid();
                    int i30 = i27 + (((885661404 + (((-537593858) | iMyTid2) * (-381))) + (((~((~iMyTid2) | 126912060)) | (-579538442)) * 381)) - 1335170691);
                    int i31 = (i30 << 13) ^ i30;
                    int i32 = i31 ^ (i31 >>> 17);
                    ((int[]) objArr17[3])[0] = i32 ^ (i32 << 5);
                    throw null;
                }
                int i33 = ShareDataUIState + 101;
                component3 = i33 % 128;
                int i34 = i33 % 2;
                Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i35 = ((int[]) objArr[3])[0];
                int i36 = ((int[]) objArr[2])[0];
                int i37 = ((int[]) objArr[1])[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i38 = ~iUptimeMillis;
                int i39 = i35 + 489280494 + (((~(i38 | 181259470)) | 568213923) * (-1042)) + ((181259470 | iUptimeMillis) * 521) + (((~(iUptimeMillis | (-568213924))) | 13385858 | (~(i38 | 736087535))) * 521);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr18[3])[0] = i41 ^ (i41 << 5);
                Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i42 = ((int[]) objArr18[3])[0];
                int i43 = ((int[]) objArr18[2])[0];
                int i44 = ((int[]) objArr18[1])[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i45 = i42 + (-337730610) + (((~((-268441219) | (~iIdentityHashCode2))) | (-481032176)) * (-591)) + ((iIdentityHashCode2 | (-268441219)) * 591);
                int i46 = (i45 << 13) ^ i45;
                int i47 = i46 ^ (i46 >>> 17);
                ((int[]) objArr19[3])[0] = i47 ^ (i47 << 5);
                int i48 = component3 + 69;
                ShareDataUIState = i48 % 128;
                int i49 = i48 % 2;
                String strConcat = "6;22;0;20;".concat("shareAppLink");
                int i50 = ((int[]) objArr19[3])[0];
                int i51 = i50 * i50;
                int i52 = -(688929099 * i50);
                int i53 = (i51 & i52) + (i51 | i52);
                int i54 = -(i50 * 1691110311);
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                int i56 = (i55 ^ (-700539599)) + (((-700539599) & i55) << 1);
                int i57 = i56 >> 28;
                int i58 = (((i57 ^ (-31)) + ((i57 & (-31)) << 1)) / 16) + 1;
                int i59 = (i56 & i58) + (i58 | i56);
                int i60 = i56 >> 23;
                int i61 = ((i60 & (-1023)) + (i60 | (-1023))) / 512;
                int i62 = -(i59 ^ ((i61 & 1) + (i61 | 1)));
                int i63 = (i62 & 5) + (i62 | 5);
                int i64 = i63 >> 25;
                return strConcat.substring(16700 / (((-((((i64 & (-255)) + (i64 | (-255))) / 128) + 2)) & i63) * 334));
            }

            static {
                getRequestBeneficiariesState = 1;
                copydefault();
                component1 = 402942309;
                int i2 = component2 + 27;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
            }

            static void copydefault() {
                copydefault = new char[]{33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33439, 33465, 33449, 33452, 33459, 33462, 33415, 33416, 33458, 33462, 33464, 33517, 33463, 33465, 33463, 33454, 33459, 33467, 33412, 33412, 33468, 33465, 33455, 33457, 33460, 33462};
            }
        };
        paymentRequest.addParams(sendMessageParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
