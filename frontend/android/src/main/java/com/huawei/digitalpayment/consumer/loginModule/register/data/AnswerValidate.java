package com.huawei.digitalpayment.consumer.loginModule.register.data;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.common.base.Ascii;
import com.huawei.http.BaseResp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getSmallIconId;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/data/AnswerValidate;", "Lcom/huawei/http/BaseResp;", "fieldName", "", "pattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getPattern", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnswerValidate extends BaseResp {
    private static short[] component1;
    private final String fieldName;
    private final String pattern;
    private static final byte[] $$c = {84, -122, 19, 43};
    private static final int $$d = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {120, 65, 99, 57, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 129;
    private static int equals = 0;
    private static int copy = 1;
    private static int ShareDataUIState = 2123809296;
    private static int component3 = -238323924;
    private static int copydefault = -1846762190;
    private static byte[] component2 = {33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 41, 41, 41, 41};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, short r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate.$$c
            int r6 = 116 - r6
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate.$$e(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate.$$a
            int r7 = r7 * 3
            int r1 = r7 + 10
            int r8 = r8 * 3
            int r8 = 99 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-26)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.data.AnswerValidate.b(byte, int, short, java.lang.Object[]):void");
    }

    public final String getFieldName() {
        int i = 2 % 2;
        int i2 = copy + 39;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.fieldName;
        int i5 = i3 + 53;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final String getPattern() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 75;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pattern;
        int i5 = i2 + 49;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public AnswerValidate(String str, String str2) {
        this.fieldName = str;
        this.pattern = str2;
    }

    private static void a(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - Color.argb(0, 0, 0, 0), 31 - KeyEvent.keyCodeFromString(""), (char) (61685 - KeyEvent.getDeadChar(0, 0)), 1874745193, false, $$e(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 117;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = component2;
                if (bArr2 != null) {
                    int i9 = $10 + 41;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 2984, 48 - Color.blue(0), (char) (54463 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), -1178636483, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr[i5] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i5++;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i10 = $11 + 37;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = component2;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - TextUtils.indexOf("", "", 0), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0) + 61685), 1874745193, false, $$e(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component1[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ j));
                if (z) {
                    int i13 = $10 + 99;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 % 5;
                    }
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i12 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int iMyPid = 1697 - (Process.myPid() >> 22);
                    int offsetAfter = 37 - TextUtils.getOffsetAfter("", 0);
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    byte length2 = (byte) $$c.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, offsetAfter, modifierMetaStateMask, -1454191902, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i15 = 0; i15 < length3; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 63;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i18 = $11 + 69;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!z2)) {
                        byte[] bArr6 = component2;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component1;
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

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.fieldName;
        String str2 = this.pattern;
        StringBuilder sb = new StringBuilder("AnswerValidate(fieldName=");
        sb.append(str);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 67, View.resolveSizeAndState(0, 0, 0) + 33, (char) (TextUtils.indexOf("", "", 0, 0) + 19696), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((short) (Process.myTid() >> 22), (byte) TextUtils.getOffsetAfter("", 0), 1889684167 - Color.blue(0), 17 - Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") - 1613222330, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) (Process.getGidForName("") + 1), 1889684188 - ((Process.getThreadPriority(0) + 20) >> 6), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1613222326, objArr2);
        long j = -209;
        long j2 = (j * 2827286726899483641L) + (j * 1628436369707026684L);
        long j3 = 210;
        long j4 = -1;
        long j5 = j4 ^ 2827286726899483641L;
        long j6 = j4 ^ 1628436369707026684L;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long jMyPid = Process.myPid();
        long j7 = jMyPid ^ j4;
        long j8 = j2 + (((j5 | j6) ^ j4) * j3) + ((((j6 | j7) ^ j4) | ((j5 | jMyPid) ^ j4)) * j3) + (j3 * ((((j5 | j7) | 1628436369707026684L) ^ j4) | (j4 ^ (jMyPid | (j6 | 2827286726899483641L)))));
        int i3 = 0;
        while (true) {
            if (i3 == 10) {
                Object[] objArr3 = new Object[1];
                a((short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) (ViewConfiguration.getTouchSlop() >> 8), 1889684202 - Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, (-1613222321) - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((short) TextUtils.getOffsetBefore("", 0), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 1889684217 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, KeyEvent.getDeadChar(0, 0) - 1613222322, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1364809693};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1663 - View.resolveSize(0, 0), TextUtils.getCapsMode("", 0, 0) + 10, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -689122684, ((Constructor) objCopydefault2).newInstance(objArr5), false};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault3 == null) {
                        int maximumFlingVelocity = 1454 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 22;
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, iIndexOf, capsMode, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) + 39, (char) View.resolveSize(0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault3).invoke(null, objArr6);
                    int i4 = ((int[]) objArr8[2])[0];
                    int i5 = ((int[]) objArr8[1])[0];
                    if (i5 != i4) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i6 = equals + 43;
                            copy = i6 % 128;
                            int i7 = i6 % 2;
                            for (String str3 : strArr) {
                                arrayList.add(str3);
                            }
                        }
                        long j9 = -1;
                        long j10 = 0;
                        long j11 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ExpandableListView.getPackedPositionChild(0L), 41 - Process.getGidForName(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault4).invoke(null, null);
                        Object[] objArr9 = {1364809693, Long.valueOf(j11), arrayList, null, false, false};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 6562, TextUtils.lastIndexOf("", '0') + 57, (char) Drawable.resolveOpacity(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault5).invoke(objInvoke, objArr9);
                        throw null;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int i8 = equals + 83;
                copy = i8 % 128;
                int i9 = i8 % 2;
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 37, 30 - (Process.myTid() >> 22), (char) Color.green(0), 846241313, false, "copydefault", null);
                }
                int i10 = ((Field) objCopydefault6).getInt(null);
                long j12 = jLongValue;
                int i11 = 0;
                while (true) {
                    int i12 = 0;
                    while (i12 != 8) {
                        int i13 = equals + 85;
                        copy = i13 % 128;
                        if (i13 % 2 == 0) {
                            i10 = (((((int) (j12 << i12)) & 23524) << (i10 - 26)) + (i10 * 9)) >>> i10;
                            i12 += 111;
                        } else {
                            i10 = (((((int) (j12 >> i12)) & 255) + (i10 << 6)) + (i10 << 16)) - i10;
                            i12++;
                        }
                    }
                    if (i11 != 0) {
                        break;
                    }
                    i11++;
                    j12 = j8;
                }
                if (i10 == i2) {
                    break;
                }
                jLongValue -= 1024;
                i3++;
                int i14 = equals + 7;
                copy = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        sb.append(", pattern=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public static AnswerValidate copy$default(AnswerValidate answerValidate, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = answerValidate.fieldName;
        }
        if ((i & 2) != 0) {
            str2 = answerValidate.pattern;
            int i3 = copy + 35;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        AnswerValidate answerValidateCopy = answerValidate.copy(str, str2);
        int i5 = copy + 15;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return answerValidateCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 71;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.fieldName;
        int i5 = i3 + 23;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 65;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pattern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AnswerValidate copy(String fieldName, String pattern) {
        int i = 2 % 2;
        AnswerValidate answerValidate = new AnswerValidate(fieldName, pattern);
        int i2 = equals + 17;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return answerValidate;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 13;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AnswerValidate)) {
            return false;
        }
        AnswerValidate answerValidate = (AnswerValidate) other;
        if (!Intrinsics.areEqual(this.fieldName, answerValidate.fieldName)) {
            int i4 = equals + 25;
            copy = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.pattern, answerValidate.pattern)) {
            return true;
        }
        int i5 = equals + 23;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.fieldName;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = equals + 11;
            copy = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.pattern;
        if (str2 == null) {
            int i4 = equals + 93;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }
}
