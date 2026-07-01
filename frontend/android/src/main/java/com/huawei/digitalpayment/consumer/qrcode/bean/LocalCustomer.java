package com.huawei.digitalpayment.consumer.qrcode.bean;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/bean/LocalCustomer;", "", "name", "", "avatar", "showMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAvatar", "getShowMsisdn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalCustomer {
    private static short[] getShareableDataState;
    private final String ShareDataUIState;
    private final String component1;
    private final String component3;
    private static final byte[] $$c = {120, 65, 99, 57};
    private static final int $$f = BERTags.PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -58, 7, 71, -35, -24, -32, -2, -24, -24, -18, -43, -14, -31, -35, -24, -32, -35, -21, -26, -22, -22, -14, -32, -29, 43};
    private static final int $$e = 199;
    private static final byte[] $$a = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81, 6, -24, Ascii.DC2, TarHeader.LF_NORMAL, -72, Ascii.VT, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, Ascii.FF, -1, -18, 44, -54, 1, Ascii.FF, -12, -8, 7, -9, -2, Ascii.NAK, -14, -14, -12, 13};
    private static final int $$b = 26;
    private static int ArtificialStackFrames = 0;
    private static int hashCode = 1;
    private static char component2 = 27829;
    private static char copydefault = 993;
    private static char equals = 25518;
    private static char component4 = 8078;
    private static int copy = -592346707;
    private static int getRequestBeneficiariesState = -238323955;
    private static int getAsAtTimestamp = 1106233237;
    private static byte[] getSponsorBeneficiariesState = {-61, -3, Ascii.US, 17, Ascii.SUB, -50, Ascii.SI, -7, -13, 75, -63, -25, Ascii.EM, -5, -62, 106, -102, 98, -72, 67, -115, -125, 126, 98, 99, 100, -105, 111, -76, -50, 127, -120, 112, -112, 124, 120, 88, -88, 114, -125, -55, 44, -35, 44, -57, -1, 19, Ascii.CAN, -25, Ascii.ETB, -27, -16, -5, 44, -19, Ascii.ESC, 17, -87, 35, 5, -5, Ascii.EM, -54, 101, -103, -120, 125, -110, 111, -10, -18, -19, -54, 103, 101, 99, -118, -97, -109, -9, 119, -45, 82, -86, 66, -66, 92, -90, 88, 79, -124, 88, 89, SignedBytes.MAX_POWER_OF_TWO, -122, 69, 75, 76, -28, 84, 90, -90, -84, 67, -81, -93, 20, -100, -70, 68, -90, -49, -56, TarHeader.LF_FIFO, -62, 59, -62, Ascii.RS, -26, 56, -55, -58, 32, -62, 47, 43, -46, 44, 36, -45, -36, -13, Ascii.SI, 32, -62, 62, -36, 38, -40, 47, -58, 99, -111, 110, -97, 93, -77, -97, -107, 89, 122, -47, 104, -107, 46, -93, -123, 123, -103, -56, -115, 122, -126, 123, -12, -51, 106, 100, 105, 109, -98, 96, -111, -61, -115, 124, -95, 96, 122, -126, 114, -116, -122, -107, 88, -117, 122, -60, -94, 81, -87, 92, -94, -69, 71, 81, -87, 89, -89, -83, -66, 115, -96, 81, -35, -19, Ascii.US, -20, Ascii.ETB, 0, 7, -94, 9, -26, -31, Ascii.RS, Ascii.EM, -21, 92, -33, -31, Ascii.NAK, -19, 38, -43, -13, 13, -17, -63, 77, 65, -80, 79, -79, 73, -71, 110, -107, 67, -78, -54, -3, 5, -19, 2, 13, -15, -12, -9, -9, -33, -93, 82, -83, 83, -85, 91, -116, -79, 20, -65, 80, 87, -88, -81, 93, -22, 105, 87, -93, 91, -112, 99, 69, -69, 89, -51, 125, -97, 103, -127, -127, 73, -104, -64, -10, -12, 38, -27, -1, -2, 2, Ascii.FF, Ascii.DLE, -35, Ascii.FF, -3, -60, -79, 74, 72, -102, 93, -78, 78, -80, 71, -77, 80, -82, -82, 99, -80, 65, -49, -64, Base64.padSymbol, TarHeader.LF_CHR, -49, -35, Base64.padSymbol, -55, TarHeader.LF_NORMAL, 56, -53, -66, -79, 65, 65, -70, -62, -45, -45, 62, -49, 56, -39, -45, 60, -16, Ascii.SO, -41, -44, 38, -45, 57, 97, -113, -91, -106, 111, -100, 122, -99, -110, 106, 96, -111, 108, 32, -46, 107, 107, -122, -105, Base64.padSymbol, -36, 97, 107, -124, 104, 58, -48, -112, 108, 104, 108, -122, 102, -106, 47, -57, 106, -108, 105, 100, 44, -43, -106, -104, 120, -105, -100, -111, 122, -98, 112, -10, 75, PSSSigner.TRAILER_IMPLICIT};

    private static String $$g(int i, byte b2, int i2) {
        int i3 = 116 - i2;
        int i4 = i * 2;
        int i5 = 3 - (b2 * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i5++;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i5];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 26 - r8
            int r7 = 100 - r7
            int r0 = 11 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.$$d
            byte[] r0 = new byte[r0]
            int r6 = 10 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-23)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 33
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r6 = r6 + 103
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.$$a
            int r7 = r7 * 17
            int r7 = r7 + 17
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            int r6 = r6 + (-3)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.d(byte, int, int, java.lang.Object[]):void");
    }

    public LocalCustomer(String str, String str2, String str3) {
        this.component1 = str;
        this.ShareDataUIState = str2;
        this.component3 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalCustomer(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = hashCode + 81;
            int i4 = i3 % 128;
            ArtificialStackFrames = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 109;
            hashCode = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i8 = hashCode + 113;
            ArtificialStackFrames = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 3;
            } else {
                int i10 = 2 % 2;
            }
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getName() {
        String str;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 121;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component1;
            int i4 = 56 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 69;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = hashCode + 43;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public final String getShowMsisdn() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 19;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 53;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) equals) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component4);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 33 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23251), 592652048, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 844, View.getDefaultSize(0, 0) + 32, (char) (23251 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 592652048, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(466 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 49 - TextUtils.getOffsetAfter("", 0), (char) KeyEvent.keyCodeFromString(""), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(getRequestBeneficiariesState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 999, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, (char) (61685 - (Process.myPid() >> 22)), 1874745193, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = getSponsorBeneficiariesState;
                long j = 0;
                if (bArr2 != null) {
                    int i6 = $11 + 71;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2985 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 49 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (char) (54462 - ExpandableListView.getPackedPositionType(j)), -1178636483, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = getSponsorBeneficiariesState;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(copy)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 998, Color.rgb(0, 0, 0) + 16777247, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 61685), 1874745193, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) getShareableDataState[i2 + ((int) (((long) copy) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i8 = $11;
                int i9 = i8 + 63;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int i11 = ((i2 + iIntValue) - 2) + ((int) (((long) copy) ^ 7083766810336261929L));
                if (z2) {
                    int i12 = i8 + 93;
                    int i13 = i12 % 128;
                    $10 = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 73;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i11 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(getAsAtTimestamp), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - TextUtils.getCapsMode("", 0, 0), Process.getGidForName("") + 38, (char) View.resolveSize(0, 0), -1454191902, false, $$g(b9, b9, (byte) $$c.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = getSponsorBeneficiariesState;
                if (bArr4 != null) {
                    int i17 = $10 + 57;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i20 = $10 + 77;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = getSponsorBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r4]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getShareableDataState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r4]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    public LocalCustomer() {
        this(null, null, null, 7, null);
    }

    public static LocalCustomer copy$default(LocalCustomer localCustomer, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ArtificialStackFrames + 91;
        int i4 = i3 % 128;
        hashCode = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 35;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            str = localCustomer.component1;
        }
        if ((i & 2) != 0) {
            int i8 = i4 + 25;
            ArtificialStackFrames = i8 % 128;
            if (i8 % 2 != 0) {
                String str4 = localCustomer.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = localCustomer.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            str3 = localCustomer.component3;
        }
        return localCustomer.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 21;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = hashCode + 61;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 75;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 119;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalCustomer copy(String name, String avatar, String showMsisdn) {
        int i = 2 % 2;
        LocalCustomer localCustomer = new LocalCustomer(name, avatar, showMsisdn);
        int i2 = ArtificialStackFrames + 9;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return localCustomer;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 37;
        int i4 = i3 % 128;
        hashCode = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 15;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof LocalCustomer)) {
            int i8 = i2 + 121;
            hashCode = i8 % 128;
            return i8 % 2 == 0;
        }
        LocalCustomer localCustomer = (LocalCustomer) other;
        if (!Intrinsics.areEqual(this.component1, localCustomer.component1)) {
            int i9 = ArtificialStackFrames + 57;
            hashCode = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, localCustomer.ShareDataUIState)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.component3, localCustomer.component3))) {
            return true;
        }
        int i11 = ArtificialStackFrames + 77;
        hashCode = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v11 java.lang.String) = (r1v4 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.hashCode
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.ArtificialStackFrames = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.String r1 = r6.component1
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r6.component1
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r6.ShareDataUIState
            if (r4 != 0) goto L25
            goto L29
        L25:
            int r2 = r4.hashCode()
        L29:
            java.lang.String r4 = r6.component3
            if (r4 != 0) goto L2e
            goto L3b
        L2e:
            int r3 = r4.hashCode()
            int r4 = com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.hashCode
            int r4 = r4 + 51
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.ArtificialStackFrames = r5
            int r4 = r4 % r0
        L3b:
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalCustomer(name=" + this.component1 + ", avatar=" + this.ShareDataUIState + ", showMsisdn=" + this.component3 + ")";
        int i2 = hashCode + 115;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 8383 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v177 */
    /* JADX WARN: Type inference failed for: r10v178 */
    /* JADX WARN: Type inference failed for: r10v179 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v180 */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v230 */
    /* JADX WARN: Type inference failed for: r10v231 */
    /* JADX WARN: Type inference failed for: r10v232 */
    /* JADX WARN: Type inference failed for: r10v237 */
    /* JADX WARN: Type inference failed for: r10v238 */
    /* JADX WARN: Type inference failed for: r10v239 */
    /* JADX WARN: Type inference failed for: r10v240 */
    /* JADX WARN: Type inference failed for: r10v241 */
    /* JADX WARN: Type inference failed for: r10v244, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v246 */
    /* JADX WARN: Type inference failed for: r10v247 */
    /* JADX WARN: Type inference failed for: r10v248 */
    /* JADX WARN: Type inference failed for: r10v249 */
    /* JADX WARN: Type inference failed for: r10v259 */
    /* JADX WARN: Type inference failed for: r10v261, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r10v262 */
    /* JADX WARN: Type inference failed for: r10v264, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v273 */
    /* JADX WARN: Type inference failed for: r10v275, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v286, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v292 */
    /* JADX WARN: Type inference failed for: r10v293 */
    /* JADX WARN: Type inference failed for: r10v295 */
    /* JADX WARN: Type inference failed for: r10v297 */
    /* JADX WARN: Type inference failed for: r10v298 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v303 */
    /* JADX WARN: Type inference failed for: r10v350 */
    /* JADX WARN: Type inference failed for: r10v351 */
    /* JADX WARN: Type inference failed for: r10v352 */
    /* JADX WARN: Type inference failed for: r10v353 */
    /* JADX WARN: Type inference failed for: r10v354 */
    /* JADX WARN: Type inference failed for: r10v355 */
    /* JADX WARN: Type inference failed for: r10v356 */
    /* JADX WARN: Type inference failed for: r10v357 */
    /* JADX WARN: Type inference failed for: r10v358 */
    /* JADX WARN: Type inference failed for: r10v359 */
    /* JADX WARN: Type inference failed for: r10v360 */
    /* JADX WARN: Type inference failed for: r10v361 */
    /* JADX WARN: Type inference failed for: r10v362 */
    /* JADX WARN: Type inference failed for: r10v363 */
    /* JADX WARN: Type inference failed for: r10v364 */
    /* JADX WARN: Type inference failed for: r10v365 */
    /* JADX WARN: Type inference failed for: r11v408, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v426, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v493, types: [java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r11v559, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v675 */
    /* JADX WARN: Type inference failed for: r11v676 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v78, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v260, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r12v266, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r12v329, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r12v362, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1021 */
    /* JADX WARN: Type inference failed for: r1v1022 */
    /* JADX WARN: Type inference failed for: r1v1024, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
    /* JADX WARN: Type inference failed for: r1v1026 */
    /* JADX WARN: Type inference failed for: r1v1031, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v1032 */
    /* JADX WARN: Type inference failed for: r1v1033 */
    /* JADX WARN: Type inference failed for: r1v1035 */
    /* JADX WARN: Type inference failed for: r1v1040, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1042 */
    /* JADX WARN: Type inference failed for: r1v1048, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1054 */
    /* JADX WARN: Type inference failed for: r1v1058 */
    /* JADX WARN: Type inference failed for: r1v1192 */
    /* JADX WARN: Type inference failed for: r1v1193 */
    /* JADX WARN: Type inference failed for: r1v1194 */
    /* JADX WARN: Type inference failed for: r1v215, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v959, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v961 */
    /* JADX WARN: Type inference failed for: r1v962 */
    /* JADX WARN: Type inference failed for: r1v963 */
    /* JADX WARN: Type inference failed for: r1v964 */
    /* JADX WARN: Type inference failed for: r1v965, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v981, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v984 */
    /* JADX WARN: Type inference failed for: r1v985 */
    /* JADX WARN: Type inference failed for: r1v986 */
    /* JADX WARN: Type inference failed for: r1v988 */
    /* JADX WARN: Type inference failed for: r2v117, types: [java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v146 */
    /* JADX WARN: Type inference failed for: r2v148 */
    /* JADX WARN: Type inference failed for: r2v149, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v163, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v166 */
    /* JADX WARN: Type inference failed for: r2v167, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v175, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v180 */
    /* JADX WARN: Type inference failed for: r2v181, types: [int] */
    /* JADX WARN: Type inference failed for: r2v188, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v189 */
    /* JADX WARN: Type inference failed for: r2v194 */
    /* JADX WARN: Type inference failed for: r2v195 */
    /* JADX WARN: Type inference failed for: r2v197 */
    /* JADX WARN: Type inference failed for: r2v198, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v205, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v207 */
    /* JADX WARN: Type inference failed for: r2v211 */
    /* JADX WARN: Type inference failed for: r2v212 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v229 */
    /* JADX WARN: Type inference failed for: r2v230, types: [int] */
    /* JADX WARN: Type inference failed for: r2v238, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v240 */
    /* JADX WARN: Type inference failed for: r2v241, types: [int] */
    /* JADX WARN: Type inference failed for: r2v248, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v252 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v290 */
    /* JADX WARN: Type inference failed for: r2v292 */
    /* JADX WARN: Type inference failed for: r2v293, types: [int] */
    /* JADX WARN: Type inference failed for: r2v300, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v301 */
    /* JADX WARN: Type inference failed for: r2v309 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v314 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v323, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v326 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r2v359 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v371 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v398 */
    /* JADX WARN: Type inference failed for: r2v403, types: [java.nio.LongBuffer[]] */
    /* JADX WARN: Type inference failed for: r2v404 */
    /* JADX WARN: Type inference failed for: r2v410 */
    /* JADX WARN: Type inference failed for: r2v411 */
    /* JADX WARN: Type inference failed for: r2v427, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v436, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v448 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v484, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v499, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v672 */
    /* JADX WARN: Type inference failed for: r2v673 */
    /* JADX WARN: Type inference failed for: r2v674 */
    /* JADX WARN: Type inference failed for: r2v675 */
    /* JADX WARN: Type inference failed for: r2v676 */
    /* JADX WARN: Type inference failed for: r2v678 */
    /* JADX WARN: Type inference failed for: r2v679 */
    /* JADX WARN: Type inference failed for: r2v680 */
    /* JADX WARN: Type inference failed for: r2v681 */
    /* JADX WARN: Type inference failed for: r2v682 */
    /* JADX WARN: Type inference failed for: r2v683 */
    /* JADX WARN: Type inference failed for: r2v684 */
    /* JADX WARN: Type inference failed for: r2v685 */
    /* JADX WARN: Type inference failed for: r2v686 */
    /* JADX WARN: Type inference failed for: r2v687 */
    /* JADX WARN: Type inference failed for: r2v688 */
    /* JADX WARN: Type inference failed for: r2v689 */
    /* JADX WARN: Type inference failed for: r2v690 */
    /* JADX WARN: Type inference failed for: r2v691 */
    /* JADX WARN: Type inference failed for: r2v692 */
    /* JADX WARN: Type inference failed for: r2v693 */
    /* JADX WARN: Type inference failed for: r2v694 */
    /* JADX WARN: Type inference failed for: r2v695 */
    /* JADX WARN: Type inference failed for: r2v696 */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v100 */
    /* JADX WARN: Type inference failed for: r33v101 */
    /* JADX WARN: Type inference failed for: r33v102 */
    /* JADX WARN: Type inference failed for: r33v103 */
    /* JADX WARN: Type inference failed for: r33v104 */
    /* JADX WARN: Type inference failed for: r33v105 */
    /* JADX WARN: Type inference failed for: r33v106 */
    /* JADX WARN: Type inference failed for: r33v107 */
    /* JADX WARN: Type inference failed for: r33v108 */
    /* JADX WARN: Type inference failed for: r33v109 */
    /* JADX WARN: Type inference failed for: r33v110 */
    /* JADX WARN: Type inference failed for: r33v111 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v36 */
    /* JADX WARN: Type inference failed for: r33v41, types: [int] */
    /* JADX WARN: Type inference failed for: r33v42 */
    /* JADX WARN: Type inference failed for: r33v43 */
    /* JADX WARN: Type inference failed for: r33v44 */
    /* JADX WARN: Type inference failed for: r33v45 */
    /* JADX WARN: Type inference failed for: r33v46 */
    /* JADX WARN: Type inference failed for: r33v47 */
    /* JADX WARN: Type inference failed for: r33v49 */
    /* JADX WARN: Type inference failed for: r33v50 */
    /* JADX WARN: Type inference failed for: r33v51, types: [int] */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v53 */
    /* JADX WARN: Type inference failed for: r33v54 */
    /* JADX WARN: Type inference failed for: r33v55 */
    /* JADX WARN: Type inference failed for: r33v56, types: [int] */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58, types: [int] */
    /* JADX WARN: Type inference failed for: r33v59, types: [int] */
    /* JADX WARN: Type inference failed for: r33v62, types: [int] */
    /* JADX WARN: Type inference failed for: r33v64, types: [int] */
    /* JADX WARN: Type inference failed for: r33v67 */
    /* JADX WARN: Type inference failed for: r33v68 */
    /* JADX WARN: Type inference failed for: r33v69 */
    /* JADX WARN: Type inference failed for: r33v70 */
    /* JADX WARN: Type inference failed for: r33v71 */
    /* JADX WARN: Type inference failed for: r33v72 */
    /* JADX WARN: Type inference failed for: r33v73 */
    /* JADX WARN: Type inference failed for: r33v74 */
    /* JADX WARN: Type inference failed for: r33v75 */
    /* JADX WARN: Type inference failed for: r33v79 */
    /* JADX WARN: Type inference failed for: r33v80 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v82 */
    /* JADX WARN: Type inference failed for: r33v84 */
    /* JADX WARN: Type inference failed for: r33v87 */
    /* JADX WARN: Type inference failed for: r33v88 */
    /* JADX WARN: Type inference failed for: r33v89 */
    /* JADX WARN: Type inference failed for: r33v90 */
    /* JADX WARN: Type inference failed for: r33v91 */
    /* JADX WARN: Type inference failed for: r33v92 */
    /* JADX WARN: Type inference failed for: r33v93 */
    /* JADX WARN: Type inference failed for: r33v94 */
    /* JADX WARN: Type inference failed for: r33v95 */
    /* JADX WARN: Type inference failed for: r33v96 */
    /* JADX WARN: Type inference failed for: r33v97 */
    /* JADX WARN: Type inference failed for: r33v98 */
    /* JADX WARN: Type inference failed for: r33v99 */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v25 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v27 */
    /* JADX WARN: Type inference failed for: r34v28 */
    /* JADX WARN: Type inference failed for: r35v23 */
    /* JADX WARN: Type inference failed for: r35v24 */
    /* JADX WARN: Type inference failed for: r35v25 */
    /* JADX WARN: Type inference failed for: r35v27 */
    /* JADX WARN: Type inference failed for: r35v28 */
    /* JADX WARN: Type inference failed for: r35v29 */
    /* JADX WARN: Type inference failed for: r35v30 */
    /* JADX WARN: Type inference failed for: r35v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v33, types: [int] */
    /* JADX WARN: Type inference failed for: r35v34 */
    /* JADX WARN: Type inference failed for: r35v35 */
    /* JADX WARN: Type inference failed for: r35v36 */
    /* JADX WARN: Type inference failed for: r35v38 */
    /* JADX WARN: Type inference failed for: r35v39, types: [int] */
    /* JADX WARN: Type inference failed for: r35v41, types: [int] */
    /* JADX WARN: Type inference failed for: r35v46, types: [int] */
    /* JADX WARN: Type inference failed for: r35v49, types: [int] */
    /* JADX WARN: Type inference failed for: r35v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v52 */
    /* JADX WARN: Type inference failed for: r35v53 */
    /* JADX WARN: Type inference failed for: r35v54 */
    /* JADX WARN: Type inference failed for: r35v55 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v10 */
    /* JADX WARN: Type inference failed for: r36v11 */
    /* JADX WARN: Type inference failed for: r36v13, types: [short] */
    /* JADX WARN: Type inference failed for: r36v15 */
    /* JADX WARN: Type inference failed for: r36v16 */
    /* JADX WARN: Type inference failed for: r36v17 */
    /* JADX WARN: Type inference failed for: r36v18 */
    /* JADX WARN: Type inference failed for: r36v19, types: [short] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v20 */
    /* JADX WARN: Type inference failed for: r36v21 */
    /* JADX WARN: Type inference failed for: r36v23, types: [short] */
    /* JADX WARN: Type inference failed for: r36v25, types: [short] */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v33, types: [short] */
    /* JADX WARN: Type inference failed for: r36v36, types: [short] */
    /* JADX WARN: Type inference failed for: r36v41, types: [int] */
    /* JADX WARN: Type inference failed for: r36v44 */
    /* JADX WARN: Type inference failed for: r36v46 */
    /* JADX WARN: Type inference failed for: r36v47 */
    /* JADX WARN: Type inference failed for: r36v48 */
    /* JADX WARN: Type inference failed for: r36v49 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v50 */
    /* JADX WARN: Type inference failed for: r36v51 */
    /* JADX WARN: Type inference failed for: r36v52 */
    /* JADX WARN: Type inference failed for: r36v53 */
    /* JADX WARN: Type inference failed for: r36v54 */
    /* JADX WARN: Type inference failed for: r36v56 */
    /* JADX WARN: Type inference failed for: r36v57 */
    /* JADX WARN: Type inference failed for: r36v59 */
    /* JADX WARN: Type inference failed for: r36v60 */
    /* JADX WARN: Type inference failed for: r36v62 */
    /* JADX WARN: Type inference failed for: r36v63 */
    /* JADX WARN: Type inference failed for: r36v64 */
    /* JADX WARN: Type inference failed for: r36v65 */
    /* JADX WARN: Type inference failed for: r36v66 */
    /* JADX WARN: Type inference failed for: r36v67 */
    /* JADX WARN: Type inference failed for: r36v68 */
    /* JADX WARN: Type inference failed for: r36v69 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r36v70 */
    /* JADX WARN: Type inference failed for: r36v8 */
    /* JADX WARN: Type inference failed for: r36v9 */
    /* JADX WARN: Type inference failed for: r37v13 */
    /* JADX WARN: Type inference failed for: r37v14 */
    /* JADX WARN: Type inference failed for: r37v15 */
    /* JADX WARN: Type inference failed for: r37v18 */
    /* JADX WARN: Type inference failed for: r37v19 */
    /* JADX WARN: Type inference failed for: r37v20 */
    /* JADX WARN: Type inference failed for: r37v21 */
    /* JADX WARN: Type inference failed for: r37v24 */
    /* JADX WARN: Type inference failed for: r37v25 */
    /* JADX WARN: Type inference failed for: r37v26 */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v18 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v21 */
    /* JADX WARN: Type inference failed for: r38v22 */
    /* JADX WARN: Type inference failed for: r38v23 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v25 */
    /* JADX WARN: Type inference failed for: r38v26 */
    /* JADX WARN: Type inference failed for: r3v143, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v287, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v402 */
    /* JADX WARN: Type inference failed for: r3v434 */
    /* JADX WARN: Type inference failed for: r3v436 */
    /* JADX WARN: Type inference failed for: r3v444, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v450 */
    /* JADX WARN: Type inference failed for: r3v452 */
    /* JADX WARN: Type inference failed for: r3v614, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v623, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v640, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
    /* JADX WARN: Type inference failed for: r3v641 */
    /* JADX WARN: Type inference failed for: r3v642 */
    /* JADX WARN: Type inference failed for: r3v643 */
    /* JADX WARN: Type inference failed for: r3v644, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v646 */
    /* JADX WARN: Type inference failed for: r3v648 */
    /* JADX WARN: Type inference failed for: r3v661 */
    /* JADX WARN: Type inference failed for: r3v685, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v858 */
    /* JADX WARN: Type inference failed for: r3v859 */
    /* JADX WARN: Type inference failed for: r3v860 */
    /* JADX WARN: Type inference failed for: r40v28 */
    /* JADX WARN: Type inference failed for: r40v29 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v31 */
    /* JADX WARN: Type inference failed for: r40v33 */
    /* JADX WARN: Type inference failed for: r40v39 */
    /* JADX WARN: Type inference failed for: r40v58 */
    /* JADX WARN: Type inference failed for: r40v59 */
    /* JADX WARN: Type inference failed for: r40v60 */
    /* JADX WARN: Type inference failed for: r40v61 */
    /* JADX WARN: Type inference failed for: r40v62 */
    /* JADX WARN: Type inference failed for: r40v63 */
    /* JADX WARN: Type inference failed for: r40v64 */
    /* JADX WARN: Type inference failed for: r40v65 */
    /* JADX WARN: Type inference failed for: r40v66 */
    /* JADX WARN: Type inference failed for: r40v67 */
    /* JADX WARN: Type inference failed for: r43v54 */
    /* JADX WARN: Type inference failed for: r43v55 */
    /* JADX WARN: Type inference failed for: r43v56 */
    /* JADX WARN: Type inference failed for: r43v57 */
    /* JADX WARN: Type inference failed for: r43v59 */
    /* JADX WARN: Type inference failed for: r45v16 */
    /* JADX WARN: Type inference failed for: r45v17 */
    /* JADX WARN: Type inference failed for: r45v18 */
    /* JADX WARN: Type inference failed for: r45v20 */
    /* JADX WARN: Type inference failed for: r45v21 */
    /* JADX WARN: Type inference failed for: r45v22 */
    /* JADX WARN: Type inference failed for: r45v23 */
    /* JADX WARN: Type inference failed for: r45v25 */
    /* JADX WARN: Type inference failed for: r45v26 */
    /* JADX WARN: Type inference failed for: r45v27 */
    /* JADX WARN: Type inference failed for: r45v28 */
    /* JADX WARN: Type inference failed for: r45v29 */
    /* JADX WARN: Type inference failed for: r45v30 */
    /* JADX WARN: Type inference failed for: r45v33 */
    /* JADX WARN: Type inference failed for: r45v35 */
    /* JADX WARN: Type inference failed for: r45v36 */
    /* JADX WARN: Type inference failed for: r45v37 */
    /* JADX WARN: Type inference failed for: r45v38 */
    /* JADX WARN: Type inference failed for: r45v39 */
    /* JADX WARN: Type inference failed for: r45v66 */
    /* JADX WARN: Type inference failed for: r45v67 */
    /* JADX WARN: Type inference failed for: r45v7 */
    /* JADX WARN: Type inference failed for: r45v8 */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /* JADX WARN: Type inference failed for: r4v131 */
    /* JADX WARN: Type inference failed for: r4v132 */
    /* JADX WARN: Type inference failed for: r4v133 */
    /* JADX WARN: Type inference failed for: r4v134 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v153, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v159 */
    /* JADX WARN: Type inference failed for: r4v166 */
    /* JADX WARN: Type inference failed for: r4v186 */
    /* JADX WARN: Type inference failed for: r4v326 */
    /* JADX WARN: Type inference failed for: r4v327 */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v332 */
    /* JADX WARN: Type inference failed for: r4v333 */
    /* JADX WARN: Type inference failed for: r4v373 */
    /* JADX WARN: Type inference failed for: r4v375 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v776 */
    /* JADX WARN: Type inference failed for: r4v777 */
    /* JADX WARN: Type inference failed for: r4v778 */
    /* JADX WARN: Type inference failed for: r4v779 */
    /* JADX WARN: Type inference failed for: r4v780 */
    /* JADX WARN: Type inference failed for: r4v781 */
    /* JADX WARN: Type inference failed for: r4v782 */
    /* JADX WARN: Type inference failed for: r4v783 */
    /* JADX WARN: Type inference failed for: r5v139, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v152, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v510 */
    /* JADX WARN: Type inference failed for: r5v511 */
    /* JADX WARN: Type inference failed for: r5v512 */
    /* JADX WARN: Type inference failed for: r5v513 */
    /* JADX WARN: Type inference failed for: r5v514 */
    /* JADX WARN: Type inference failed for: r5v515 */
    /* JADX WARN: Type inference failed for: r5v516 */
    /* JADX WARN: Type inference failed for: r5v517 */
    /* JADX WARN: Type inference failed for: r5v518 */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r64v0 */
    /* JADX WARN: Type inference failed for: r6v1023 */
    /* JADX WARN: Type inference failed for: r6v1024 */
    /* JADX WARN: Type inference failed for: r6v1025 */
    /* JADX WARN: Type inference failed for: r6v1026 */
    /* JADX WARN: Type inference failed for: r6v112, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v249, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v499 */
    /* JADX WARN: Type inference failed for: r6v503 */
    /* JADX WARN: Type inference failed for: r6v504 */
    /* JADX WARN: Type inference failed for: r6v559 */
    /* JADX WARN: Type inference failed for: r6v566, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v572 */
    /* JADX WARN: Type inference failed for: r6v574 */
    /* JADX WARN: Type inference failed for: r6v575 */
    /* JADX WARN: Type inference failed for: r6v576 */
    /* JADX WARN: Type inference failed for: r6v577 */
    /* JADX WARN: Type inference failed for: r6v579 */
    /* JADX WARN: Type inference failed for: r6v580 */
    /* JADX WARN: Type inference failed for: r6v581 */
    /* JADX WARN: Type inference failed for: r6v598 */
    /* JADX WARN: Type inference failed for: r6v625, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r6v658, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v677, types: [java.lang.Object, java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r7v168, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v289 */
    /* JADX WARN: Type inference failed for: r8v264 */
    /* JADX WARN: Type inference failed for: r8v265 */
    /* JADX WARN: Type inference failed for: r8v266, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r8v267, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r8v275, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r8v276 */
    /* JADX WARN: Type inference failed for: r8v277 */
    /* JADX WARN: Type inference failed for: r8v278 */
    /* JADX WARN: Type inference failed for: r8v304 */
    /* JADX WARN: Type inference failed for: r8v306, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v314 */
    /* JADX WARN: Type inference failed for: r8v315 */
    /* JADX WARN: Type inference failed for: r8v337 */
    /* JADX WARN: Type inference failed for: r8v343, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r8v542 */
    /* JADX WARN: Type inference failed for: r8v543 */
    /* JADX WARN: Type inference failed for: r8v544 */
    /* JADX WARN: Type inference failed for: r9v274, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r9v380, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r9v413 */
    /* JADX WARN: Type inference failed for: r9v417 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] component3(android.content.Context r65, java.lang.String[] r66, int r67, int r68, int r69) {
        /*
            Method dump skipped, instruction units count: 27608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.bean.LocalCustomer.component3(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }
}
