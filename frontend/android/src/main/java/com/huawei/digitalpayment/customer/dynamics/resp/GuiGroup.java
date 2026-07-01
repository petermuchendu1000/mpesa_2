package com.huawei.digitalpayment.customer.dynamics.resp;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getSmallIconId;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiGroup;", "Ljava/io/Serializable;", "groupCode", "", "groupLabel", "value", "guiElements", "", "Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElements;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupCode", "()Ljava/lang/String;", "getGroupLabel", "getValue", "getGuiElements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiGroup implements Serializable {
    private static short[] copydefault;
    private final String groupCode;
    private final String groupLabel;
    private final List<GuiElements> guiElements;
    private final String value;
    private static final byte[] $$a = {69, -50, 81, 75};
    private static final int $$b = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component1 = -1557233515;
    private static int component2 = -238323873;
    private static int ShareDataUIState = 2110224660;
    private static byte[] component3 = {-128, -94, -116, -82, -99, 124, -95, -82, -93, -78, -70, -109, -120, 82, -23, 75, -90, -103, -93, -105, -24, 96, -95, -82, -93, -78, -70, -109, -120, 85, -79, -103, 126, 56, 114, 115, 36, 116, 34, Ascii.ETB, 105, 73, 46, Ascii.FF, Ascii.US, 43, 73, 46, -20, -65, TarHeader.LF_CHR, 37, 42, 69, 102, -28, 116, 126, 34, 44, 71, 43, 39, -76, -29, 66, -34, 68, 34, -120, -78, 105, -73, 124, -75, 66, 107, -16, 124, 111, -73, 124, -75, 98, 75, -96, -79, -80, -77, 100, -116, 99, -78, -45, -124, 44, -111, -45, 58, -74, -124, 44, -100, -42, 32, 63, -30, -43, -124, -127, 72, -37, 100, 39, -35, 69, -43, 75, 65, 112, 97, 0, -36, -127, -103, 69, 72, -48, 69, -38, 79, 20, 9, -58, -39, -36, 77, -43, 76, -67, -40, 37, 43, -41, -59, 37, -47, 40, 32, -122, 78, 74, TarHeader.LF_SYMLINK, 88, 75, 82, 40, 56, 90, TarHeader.LF_CONTIG, TarHeader.LF_CHR, 74, TarHeader.LF_BLK, 60, 75, 68, 107, 92, -13, 75, 68, 75, 124, -4, 76, 66, 62, TarHeader.LF_BLK, 91, TarHeader.LF_CONTIG, 59, -116, 4, 34, 92, 62, -113, -90, -96, 84, 70, -90, -86, -91, 93, 72, -108, -96, 105, -31, -83, 92, -92, -83, -94, 83, 120, -111, -82, -95, -96, 85, -67, 80, PSSSigner.TRAILER_IMPLICIT, -88, 113, SignedBytes.MAX_POWER_OF_TWO, -77, 108, 115, 77, -119, Ascii.NAK, 77, -76, -124, 38, -109, -97, -42, -112, -104, -41, 32, -9, -13, -124, 38, -126, 32, -102, 44, -109, -120, 115, -55, 127, 126, -51, 125, -49, Ascii.SUB, Ascii.CAN, 120, -61, 37, -36, 105, -58, -61, 112, -43, Ascii.SUB, 39, 119, -58};
    private static long copy = -3780477796495014671L;
    private static int equals = 1386857713;
    private static char getAsAtTimestamp = 57971;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = r8 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup.$$c(int, int, byte):java.lang.String");
    }

    public GuiGroup(String str, String str2, String str3, List<GuiElements> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupCode = str;
        this.groupLabel = str2;
        this.value = str3;
        this.guiElements = list;
    }

    public final String getGroupCode() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 61;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.groupCode;
            int i4 = 77 / 0;
        } else {
            str = this.groupCode;
        }
        int i5 = i2 + 25;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getGroupLabel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 83;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.groupLabel;
        int i4 = i2 + 19;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 47;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 61;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final List<GuiElements> getGuiElements() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 37;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<GuiElements> list = this.guiElements;
        int i5 = i2 + 3;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void b(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $10 + 33;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 4037;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31;
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 19133);
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, keyRepeatTimeout, mirror, 1912513118, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iAlpha = Color.alpha(i3) + 7567;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 11;
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", i3);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, tapTimeout, offsetAfter, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i6 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i6);
                objArr4[i3] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2458 - TextUtils.lastIndexOf("", '0', i3), View.resolveSize(i3, i3) + 28, (char) (ViewConfiguration.getScrollBarSize() >> 8), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.getOffsetBefore("", 0), Color.red(0) + 11, (char) (Process.myTid() >> 22), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[iNotificationSideChannel.copydefault])) ^ (copy ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) equals) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) getAsAtTimestamp) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 49;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void a(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        char c2;
        int i5;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i7 = -1;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - View.MeasureSpec.getSize(0), 32 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (View.resolveSize(0, 0) + 61685), 1874745193, false, $$c(b3, b4, (byte) (b4 | Ascii.SI)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = !(iIntValue != -1);
            if (z) {
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) i7;
                            byte b6 = (byte) (b5 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 2984, TextUtils.indexOf((CharSequence) "", '0') + 49, (char) (54461 - ((byte) KeyEvent.getModifierMetaStateMask())), -1178636483, false, $$c(b5, b6, (byte) (b6 | Ascii.DC2)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i7 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) copydefault[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                } else {
                    int i9 = $10 + 9;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        byte[] bArr3 = component3;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b7 = (byte) (-1);
                            byte b8 = (byte) (b7 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.getDefaultSize(0, 0) + 31, (char) (61685 - Drawable.resolveOpacity(0, 0)), 1874745193, false, $$c(b7, b8, (byte) (b8 | Ascii.SI)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) & 7083766810336261929L)) >>> ((int) (((long) component2) * 7083766810336261929L));
                    } else {
                        byte[] bArr4 = component3;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component1)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (b9 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 999, (ViewConfiguration.getPressedStateDuration() >> 16) + 31, (char) (61685 - Color.green(0)), 1874745193, false, $$c(b9, b10, (byte) (b10 | Ascii.SI)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i5;
                    j = 7083766810336261929L;
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j));
                if (z) {
                    int i11 = $11 + 53;
                    int i12 = i11 % 128;
                    $10 = i12;
                    int i13 = i11 % 2;
                    int i14 = i12 + 65;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    int i16 = $10 + 59;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 0;
                }
                getsmalliconid.copydefault = i10 + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(ShareDataUIState), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b11 = (byte) (-1);
                    byte b12 = (byte) (b11 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((-16775519) - Color.rgb(0, 0, 0), Color.argb(0, 0, 0, 0) + 37, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -1454191902, false, $$c(b11, b12, (byte) (b12 | Ascii.SO)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = component3;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr6[i18] = (byte) (((long) bArr5[i18]) ^ 7083766810336261929L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i19 = $11 + 9;
                    int i20 = i19 % 128;
                    $10 = i20;
                    if (i19 % 2 != 0) {
                        throw null;
                    }
                    if (!(!z2)) {
                        int i21 = i20 + 67;
                        $11 = i21 % 128;
                        if (i21 % 2 == 0) {
                            byte[] bArr7 = component3;
                            getsmalliconid.copydefault = getsmalliconid.copydefault;
                            c2 = (char) (getsmalliconid.component3 >>> (((byte) (((byte) (((long) bArr7[r7]) / 7083766810336261929L)) >>> s)) ^ b2));
                        } else {
                            byte[] bArr8 = component3;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            c2 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr8[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        getsmalliconid.component1 = c2;
                    } else {
                        short[] sArr = copydefault;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    /* JADX WARN: Multi-variable type inference failed */
    public static GuiGroup copy$default(GuiGroup guiGroup, String str, String str2, String str3, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 39;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = guiGroup.groupCode;
        }
        if ((i & 2) != 0) {
            str2 = guiGroup.groupLabel;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 35;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            str3 = guiGroup.value;
            int i7 = i4 + 3;
            component4 = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 8) != 0) {
            list = guiGroup.guiElements;
        }
        return guiGroup.copy(str, str2, str3, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.groupCode;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.groupLabel;
        int i5 = i3 + 45;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 1;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 25;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<GuiElements> component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<GuiElements> list = this.guiElements;
        int i4 = i3 + 43;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return list;
    }

    public final GuiGroup copy(String groupCode, String groupLabel, String value, List<GuiElements> guiElements) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupCode, "");
        Intrinsics.checkNotNullParameter(groupLabel, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(guiElements, "");
        GuiGroup guiGroup = new GuiGroup(groupCode, groupLabel, value, guiElements);
        int i2 = component4 + 23;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return guiGroup;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiGroup)) {
            return false;
        }
        GuiGroup guiGroup = (GuiGroup) other;
        if (!Intrinsics.areEqual(this.groupCode, guiGroup.groupCode)) {
            int i2 = component4 + 3;
            getRequestBeneficiariesState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.groupLabel, guiGroup.groupLabel)) {
            int i3 = getRequestBeneficiariesState + 95;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!(!Intrinsics.areEqual(this.value, guiGroup.value))) {
            return Intrinsics.areEqual(this.guiElements, guiGroup.guiElements);
        }
        int i4 = component4 + 83;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        component4 = i2 % 128;
        int iHashCode = (i2 % 2 != 0 ? ((((this.groupCode.hashCode() >>> 56) + this.groupLabel.hashCode()) << 87) / this.value.hashCode()) >>> 126 : ((((this.groupCode.hashCode() * 31) + this.groupLabel.hashCode()) * 31) + this.value.hashCode()) * 31) + this.guiElements.hashCode();
        int i3 = getRequestBeneficiariesState + 115;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiGroup(groupCode=" + this.groupCode + ", groupLabel=" + this.groupLabel + ", value=" + this.value + ", guiElements=" + this.guiElements + ")";
        int i2 = component4 + 97;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0f9a  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v106, types: [int] */
    /* JADX WARN: Type inference failed for: r2v152 */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.io.ByteArrayInputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r4v210, types: [java.lang.reflect.Method] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] copydefault(android.content.Context r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 4434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup.copydefault(android.content.Context, int, int):java.lang.Object[]");
    }
}
