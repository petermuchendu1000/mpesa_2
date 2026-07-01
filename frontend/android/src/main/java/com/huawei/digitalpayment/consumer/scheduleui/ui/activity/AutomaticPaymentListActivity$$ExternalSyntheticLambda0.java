package com.huawei.digitalpayment.consumer.scheduleui.ui.activity;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel;
import com.huawei.payment.mvvm.DataBindingAdapter;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.accesssetInProgressCallbackp;
import kotlin.cancelAll;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.CharUtils;

public final class AutomaticPaymentListActivity$$ExternalSyntheticLambda0 implements DataBindingAdapter.OnItemChildClickListener {
    public final AutomaticPaymentListActivity f$0;
    private static final byte[] $$a = {119, -40, Ascii.DLE, 123};
    private static final int $$b = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;
    private static int component1 = 1;
    private static char[] component3 = {2000, 2030, 1992, 2041, 2022, 2001, 1989, 1993, 1985, 1998, 2034, 1984, 2031, 2040, 2036, 2021, 2024, 2025, 1970, 1987, 2038, 2007, 1986, 2003, 1999, 2035, 1988, 2004, 2020, 2002, 2039, 2032, 1997, 2019, 2005, 1968, 2006, 1994, 1966, 2018, 2037, 1969, 2017, 2028, 1956, 1995, 2029, 1996, 2023};
    private static char component2 = 12829;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$$ExternalSyntheticLambda0.$$a
            int r8 = r8 * 3
            int r8 = 119 - r8
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$$ExternalSyntheticLambda0.$$c(int, short, int):java.lang.String");
    }

    public AutomaticPaymentListActivity$$ExternalSyntheticLambda0(AutomaticPaymentListActivity automaticPaymentListActivity) {
        this.f$0 = automaticPaymentListActivity;
    }

    @Override
    public final void onItemClick(DataBindingAdapter dataBindingAdapter, View view, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        AutomaticPaymentListActivity automaticPaymentListActivity = this.f$0;
        LocalScheduleModel localScheduleModel = (LocalScheduleModel) obj;
        if (i4 != 0) {
            AutomaticPaymentListActivity.m10975$r8$lambda$h8b28iFYUB_ou5xsD2ON6fUePI(automaticPaymentListActivity, dataBindingAdapter, view, i, localScheduleModel);
            return;
        }
        AutomaticPaymentListActivity.m10975$r8$lambda$h8b28iFYUB_ou5xsD2ON6fUePI(automaticPaymentListActivity, dataBindingAdapter, view, i, localScheduleModel);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 89;
            int i5 = i4 % 128;
            $11 = i5;
            int i6 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i5 + 71;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7422, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, (char) (TextUtils.getCapsMode("", 0, 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        char c3 = '\b';
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getScrollBarSize() >> 8), Color.alpha(0) + 15, (char) (Color.red(0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        char c4 = 5;
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    c2 = c3;
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[6] = cancelall;
                    objArr4[c4] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int iIndexOf = 7116 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 14;
                        char c5 = (char) (44463 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[c4] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[c3] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, c5, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[c3] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[c4] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            int pressedStateDuration = 2944 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 24;
                            char c6 = (char) (27637 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$c = $$c(b3, b4, b4);
                            c2 = '\b';
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, iNormalizeMetaState, c6, 794909189, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i10];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                c3 = c2;
                c4 = 5;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            i15++;
            int i16 = $10 + 29;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 5 % 3;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static void component3() throws Throwable {
        int i = 2 % 2;
        int i2 = component1 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Member[] memberArr = accesssetInProgressCallbackp.component3;
            Object[] objArr = new Object[1];
            a(new char[]{'(', 19, '-', '\'', 19, '%', AbstractJsonLexerKt.COMMA, 28, 16, 18, '#', 31, 20, '-', 18, 15, '+', AbstractJsonLexerKt.COMMA, 28, '-', 4, '-', 22, '\b', 17, '#', '(', 19, 4, 22, '\'', '/', 17, '\b', '\'', '-', Typography.amp, 24, 3, '$', Typography.amp, 19, '#', '-', 28, 19, 18, 14, 18, 15, '\n', '-', '$', 22, 22, 18, 21, 7, 15, 3, '+', 22, 17, 24, 5, 4, 21, '+', 22, 18, '\f', '/', 18, 22, 15, 18, '\b', 5, '\f', 29, 15, 18, 14, 18, 17, 0, '/', '\t', '.', ' ', 17, '\b', 14, 16, 21, '/', 21, 0, '0', '%', '.', 16, 13801, 13801, CharUtils.CR, 20, 15, 16, '\b', 3, '+', AbstractJsonLexerKt.COMMA, 24, 2, 0, 15, 17, 16, 15, 18, '(', 5, '+', '/', '#', ' ', 0, '*'}, (byte) (123 - (ViewConfiguration.getEdgeSlop() * 73)), ViewConfiguration.getTouchSlop() + 16312, objArr);
            memberArr[1] = Class.forName(((String) objArr[0]).intern()).getDeclaredField("component3");
        } else {
            Member[] memberArr2 = accesssetInProgressCallbackp.component3;
            Object[] objArr2 = new Object[1];
            a(new char[]{'(', 19, '-', '\'', 19, '%', AbstractJsonLexerKt.COMMA, 28, 16, 18, '#', 31, 20, '-', 18, 15, '+', AbstractJsonLexerKt.COMMA, 28, '-', 4, '-', 22, '\b', 17, '#', '(', 19, 4, 22, '\'', '/', 17, '\b', '\'', '-', Typography.amp, 24, 3, '$', Typography.amp, 19, '#', '-', 28, 19, 18, 14, 18, 15, '\n', '-', '$', 22, 22, 18, 21, 7, 15, 3, '+', 22, 17, 24, 5, 4, 21, '+', 22, 18, '\f', '/', 18, 22, 15, 18, '\b', 5, '\f', 29, 15, 18, 14, 18, 17, 0, '/', '\t', '.', ' ', 17, '\b', 14, 16, 21, '/', 21, 0, '0', '%', '.', 16, 13801, 13801, CharUtils.CR, 20, 15, 16, '\b', 3, '+', AbstractJsonLexerKt.COMMA, 24, 2, 0, 15, 17, 16, 15, 18, '(', 5, '+', '/', '#', ' ', 0, '*'}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 43), 128 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
            memberArr2[0] = Class.forName(((String) objArr2[0]).intern()).getDeclaredField("component3");
        }
        int i3 = component1 + 111;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
    }
}
