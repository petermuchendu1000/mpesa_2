package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
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
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.io.Serializable;
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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/BuyBundleWithAirtime;", "Ljava/io/Serializable;", "productId", "", "sponsorMsisdn", "buyFor", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getSponsorMsisdn", "getBuyFor", "getBeneficiaryMsisdn", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyBundleWithAirtime implements Serializable {
    public static final int $stable = 0;
    private static char ShareDataUIState;
    private static int component1;
    private static char[] copydefault;
    private final String beneficiaryMsisdn;
    private final String buyFor;
    private final String productId;
    private final String sponsorMsisdn;
    private static final byte[] $$c = {104, -2, Ascii.CAN, -74};
    private static final int $$d = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, -35, 45, 111, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 197;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int component3 = 1;

    private static String $$e(byte b2, short s, byte b3) {
        byte[] bArr = $$c;
        int i = b3 * 3;
        int i2 = 119 - (s * 3);
        int i3 = (b2 * 3) + 4;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i2;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 36 - r6
            int r5 = r5 * 6
            int r0 = 16 - r5
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithAirtime.$$a
            byte[] r0 = new byte[r0]
            int r5 = 15 - r5
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r5
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
        L2d:
            int r7 = r7 + r3
            int r7 = r7 + (-17)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyBundleWithAirtime.a(short, int, int, java.lang.Object[]):void");
    }

    public BuyBundleWithAirtime(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.productId = str;
        this.sponsorMsisdn = str2;
        this.buyFor = str3;
        this.beneficiaryMsisdn = str4;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBuyFor() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.buyFor;
            int i4 = 9 / 0;
        } else {
            str = this.buyFor;
        }
        int i5 = i2 + 25;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void b(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 7422, 15 - KeyEvent.keyCodeFromString(""), (char) (64292 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - Color.alpha(0), 15 - KeyEvent.getDeadChar(0, 0), (char) (64292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            int i5 = $11 + 81;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                int i6 = $11 + 63;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 14 - View.resolveSize(0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 2944, 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 27637), 794909189, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i8 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i8];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i9 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i9];
                            cArr4[cancelall.component2 + 1] = cArr2[i10];
                        } else {
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        int i13 = 0;
        while (i13 < i) {
            int i14 = $10;
            int i15 = i14 + 29;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i13] = (char) (cArr4[i13] ^ 13722);
            i13++;
            int i17 = i14 + 83;
            $11 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public final String getBeneficiaryMsisdn() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component4 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int iIndexOf = 999 - TextUtils.indexOf("", "");
            int absoluteGravity = 31 - Gravity.getAbsoluteGravity(0, 0);
            char defaultSize = (char) (View.getDefaultSize(0, 0) + 61685);
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 | Ascii.VT);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 5), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, absoluteGravity, defaultSize, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0') + 50), new char[]{22, 6, 14, 23, 0, 11, 14, '\n', 2, 3, '\f', 24, 7, 1, '\t', 5, '\n', 22, 16, 0, 6, 15}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((byte) (112 - TextUtils.indexOf("", "", 0, 0)), new char[]{5, 19, 1, 16, 4, 7, '\f', 18, 6, 24, 18, 5, 11, CharUtils.CR, 13935}, Color.rgb(0, 0, 0) + 16777231, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int iRed = Color.red(0) + 999;
            int iLastIndexOf = 30 - TextUtils.lastIndexOf("", '0', 0);
            char packedPositionType = (char) (61685 - ExpandableListView.getPackedPositionType(0L));
            byte b4 = (byte) ($$b & 3);
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 + 5), (byte) 0, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iRed, iLastIndexOf, packedPositionType, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 999;
                int gidForName = Process.getGidForName("") + 32;
                char cMyTid = (char) (61685 - (Process.myTid() >> 22));
                byte b5 = (byte) ($$b & 3);
                byte b6 = (byte) (b5 + 2);
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 - 3), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, gidForName, cMyTid, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = ((((~(i6 | (-224555384))) | ((~((-974028778) | i6)) | 134377825)) * (-397)) - 1962373519) + ((iIdentityHashCode | (-929828511)) * 397) + 1273772061;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2216 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44, (char) (Process.myTid() >> 22), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 1273772061, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1000;
                    int iLastIndexOf2 = 30 - TextUtils.lastIndexOf("", '0');
                    char maxKeyCode = (char) (61685 - (KeyEvent.getMaxKeyCode() >> 16));
                    byte b7 = (byte) ($$b & 3);
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr9 = new Object[1];
                    a(b7, b8, b8, objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iLastIndexOf2, maxKeyCode, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 1030, 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) Color.red(0)), (Class) ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1073, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int packedPositionType2 = 999 - ExpandableListView.getPackedPositionType(0L);
                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 31;
                    char bitsPerPixel = (char) (61684 - ImageFormat.getBitsPerPixel(0));
                    byte b9 = (byte) ($$b & 3);
                    byte b10 = (byte) (b9 + 2);
                    Object[] objArr10 = new Object[1];
                    a(b9, b10, (byte) (b10 - 3), objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType2, packedPositionType3, bitsPerPixel, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((byte) (Gravity.getAbsoluteGravity(0, 0) + 49), new char[]{22, 6, 14, 23, 0, 11, 14, '\n', 2, 3, '\f', 24, 7, 1, '\t', 5, '\n', 22, 16, 0, 6, 15}, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 112), new char[]{5, 19, 1, 16, 4, 7, '\f', 18, 6, 24, 18, 5, 11, CharUtils.CR, 13935}, Gravity.getAbsoluteGravity(0, 0) + 15, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int pressedStateDuration = 999 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int pressedStateDuration2 = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        char c2 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 61684);
                        byte b11 = (byte) ($$b & 3);
                        Object[] objArr13 = new Object[1];
                        a(b11, (byte) (b11 + 5), (byte) 0, objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, pressedStateDuration2, c2, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 998;
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32;
                        char trimmedLength = (char) (61685 - TextUtils.getTrimmedLength(""));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 | Ascii.VT);
                        Object[] objArr14 = new Object[1];
                        a(b12, b13, (byte) (b13 & 5), objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i10, iIndexOf3, trimmedLength, -1638177773, false, (String) objArr14[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            Object[] objArr15 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[1])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i13 + 1510261616 + (((~((~iIdentityHashCode2) | (-728098214))) | 21375180) * (-235)) + (((~((-728098214) | iIdentityHashCode2)) | 21375180) * (-470)) + (((~(iIdentityHashCode2 | (-706856226))) | 133192) * 235);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr15[3])[0] = i18 ^ (i18 << 5);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i19 = ((int[]) objArr15[3])[0];
            int i20 = ((int[]) objArr15[2])[0];
            int i21 = ((int[]) objArr15[1])[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i22 = ~iFreeMemory;
            int i23 = i19 + ((((~(i22 | 134272198)) | ((~((-615201196) | i22)) | 615196969)) * (-397)) - 1015303939) + ((iFreeMemory | 749464941) * 397);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i26 = component2 + 37;
                component4 = i26 % 128;
                int i27 = i26 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i11 ^ i12)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myTid() >> 22), 42 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr17 = {-969019336, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6514, 56 - ExpandableListView.getPackedPositionType(0L), (char) Color.blue(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr17);
            Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[1])[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i31 = i28 + (((~((-8552714) | elapsedCpuTime)) | 136904704) * 501) + 889751508 + ((~((~elapsedCpuTime) | (-8552714))) * 501);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr18[3])[0] = i33 ^ (i33 << 5);
            int[] iArr = new int[i12];
            int i34 = i12 - 1;
            iArr[i34] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i34) % 2) - 1], 1).show();
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i35 = ((int[]) objArr18[3])[0];
            int i36 = ((int[]) objArr18[2])[0];
            int i37 = ((int[]) objArr18[1])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i38 = i35 + (((~(225626774 | iIdentityHashCode3)) | (-929829791)) * 262) + 1703594421 + (((~((~iIdentityHashCode3) | 225626774)) | (-929829791)) * 262);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr19[3])[0] = i40 ^ (i40 << 5);
        }
        return this.beneficiaryMsisdn;
    }

    static {
        component1 = 0;
        copydefault();
        int i = component3 + 3;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static BuyBundleWithAirtime copy$default(BuyBundleWithAirtime buyBundleWithAirtime, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 73;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 57;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = buyBundleWithAirtime.productId;
            int i8 = i4 + 73;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 2) != 0) {
            int i10 = i4 + 81;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str2 = buyBundleWithAirtime.sponsorMsisdn;
        }
        if ((i & 4) != 0) {
            str3 = buyBundleWithAirtime.buyFor;
            int i12 = component2 + 31;
            component4 = i12 % 128;
            int i13 = i12 % 2;
        }
        if ((i & 8) != 0) {
            str4 = buyBundleWithAirtime.beneficiaryMsisdn;
        }
        return buyBundleWithAirtime.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 67;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sponsorMsisdn;
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.buyFor;
        int i5 = i3 + 15;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.beneficiaryMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BuyBundleWithAirtime copy(String productId, String sponsorMsisdn, String buyFor, String beneficiaryMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(buyFor, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        BuyBundleWithAirtime buyBundleWithAirtime = new BuyBundleWithAirtime(productId, sponsorMsisdn, buyFor, beneficiaryMsisdn);
        int i2 = component4 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return buyBundleWithAirtime;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyBundleWithAirtime)) {
            int i2 = component4 + 31;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        BuyBundleWithAirtime buyBundleWithAirtime = (BuyBundleWithAirtime) other;
        if (!Intrinsics.areEqual(this.productId, buyBundleWithAirtime.productId)) {
            int i3 = component4 + 9;
            component2 = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.sponsorMsisdn, buyBundleWithAirtime.sponsorMsisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.buyFor, buyBundleWithAirtime.buyFor)) {
            return Intrinsics.areEqual(this.beneficiaryMsisdn, buyBundleWithAirtime.beneficiaryMsisdn);
        }
        int i4 = component2 + 85;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.productId.hashCode() * 31) + this.sponsorMsisdn.hashCode()) * 31) + this.buyFor.hashCode()) * 31) + this.beneficiaryMsisdn.hashCode();
        int i4 = component4 + 13;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuyBundleWithAirtime(productId=" + this.productId + ", sponsorMsisdn=" + this.sponsorMsisdn + ", buyFor=" + this.buyFor + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = component4 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void copydefault() {
        copydefault = new char[]{12824, 2031, 2035, 12825, 12828, 2019, 2041, 2030, 2036, 2021, 2025, 2032, 2029, 2020, 1966, 2028, 2027, 2002, 12831, 12827, 1987, 2017, 2003, 12830, 2034};
        ShareDataUIState = (char) 12831;
    }
}
