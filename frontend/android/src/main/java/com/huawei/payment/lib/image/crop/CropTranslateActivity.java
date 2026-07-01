package com.huawei.payment.lib.image.crop;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.safaricom.mpesa.lifestyle.R;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import org.bouncycastle.crypto.signers.PSSSigner;

public class CropTranslateActivity extends AppCompatActivity {
    private static char ArtificialStackFrames = 0;
    private static final String CROP_PHOTO;
    private static final String FILE_PROVIDER = ".common.fileProvider";
    public static final int REQUEST_CODE_CROP_PHOTO = 104;
    private static int ShareDataUIState;
    private static char component1;
    private static int component2;
    private static long component3;
    private static char component4;
    private static char copy;
    private static int copydefault;
    private static byte[] equals;
    private static short[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;
    private static char toString;
    private final File cropFile = new File(Utils.getApp().getFilesDir().getAbsolutePath() + File.separator + CROP_PHOTO);
    private Uri imageCropUri;
    private static final byte[] $$c = {101, 74, 115, 66};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {79, Ascii.ETB, 89, Ascii.VT, -23, -9, TarHeader.LF_BLK, PSSSigner.TRAILER_IMPLICIT, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -74, 1, -30, 4, -24, -2, -3, -22, TarHeader.LF_CHR, -70, -16, -17, 4, -24, -7, 2, -22, TarHeader.LF_CHR, -45, -28, -28, 4, -13, -18, 0, -12, -21, -4, 7, -40, 4, -28, -12, 3, 17, -48, -17, 40, -60, -11, 6, -35, 74, -24, -23, -9, -14, -10, -10, -2, -20, -17, 56, -23, -9, -14, -10, -10, -2, -20, -17, TarHeader.LF_FIFO, -23, -9, TarHeader.LF_BLK, -62, -19, -20, 5, -23, 1, 41, -73, -14, -16, -11, 0, -7, 44, -62, -24, -6, -15, 1, -30, 0, -17, -10, TarHeader.LF_DIR, -64, -23, -10, -17, 4, -20, -17, 59, -32, -55, -9, -14, -10, -17, -4, -1, 5, -41, -2, -15, Ascii.DC2, -28, -30, 1, Ascii.SUB, -55, -10, -17, 4, -20, -17, -23, -9, -14, -10, -10, -2, -20, -17, TarHeader.LF_CONTIG};
    private static final int $$e = 131;
    private static final byte[] $$a = {120, -62, 63, 57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 82;
    private static int hashCode = 0;
    private static int accessartificialFrame = 1;
    private static int getShareableDataState = 1;

    private static String $$g(byte b2, byte b3, int i) {
        int i2 = 4 - (b3 * 4);
        byte[] bArr = $$c;
        int i3 = b2 + 98;
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i2;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i3 += bArr[i2];
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 100 - r7
            int r0 = 28 - r8
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = com.huawei.payment.lib.image.crop.CropTranslateActivity.$$a
            byte[] r0 = new byte[r0]
            int r8 = 27 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.CropTranslateActivity.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = 63 - r8
            int r7 = r7 * 3
            int r7 = r7 + 99
            byte[] r1 = com.huawei.payment.lib.image.crop.CropTranslateActivity.$$d
            byte[] r0 = new byte[r0]
            int r8 = 62 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.CropTranslateActivity.d(int, int, short, java.lang.Object[]):void");
    }

    static {
        getSponsorBeneficiariesState = 0;
        ShareDataUIState();
        component2();
        CROP_PHOTO = System.currentTimeMillis() + "_crop_photo.jpg";
        int i = getShareableDataState + 121;
        getSponsorBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) ArtificialStackFrames) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(toString)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 845, Color.red(0) + 32, (char) (23252 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 592652048, false, $$g((byte) 13, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) copy) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component4)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 843, 33 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (23250 - Process.getGidForName("")), 592652048, false, $$g((byte) 13, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(464 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 48, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4036, TextUtils.indexOf((CharSequence) "", '0', 0) + 32, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19180), 1912513118, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 11, (char) Color.alpha(0), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 2459, TextUtils.indexOf((CharSequence) "", '0') + 29, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 931716605, false, $$g(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = iNotificationSideChannel.component3;
                        cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                        iNotificationSideChannel.copydefault++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 121;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 999, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, (char) ((-16715531) - Color.rgb(0, 0, 0)), 1874745193, false, $$g((byte) 15, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            long j = 0;
            char c2 = '0';
            if (i7 != 0) {
                int i8 = $10 + 39;
                int i9 = i8 % 128;
                $11 = i9;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = equals;
                if (bArr2 != null) {
                    int i10 = i9 + 21;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int packedPositionChild = 2983 - ExpandableListView.getPackedPositionChild(j);
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 48;
                                char cIndexOf = (char) (TextUtils.indexOf("", c2, 0, 0) + 54463);
                                byte b4 = (byte) 0;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, pressedStateDuration, cIndexOf, -1178636483, false, $$g((byte) ($$f & 55), b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr[i5] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i5++;
                            j = 0;
                            c2 = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i11 = $10 + 83;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        byte[] bArr3 = equals;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b5 = (byte) 0;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 999, 31 - TextUtils.getTrimmedLength(""), (char) (61685 - Gravity.getAbsoluteGravity(0, 0)), 1874745193, false, $$g((byte) 15, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) & 7083766810336261929L)) - ((int) (((long) copydefault) ^ 7083766810336261929L));
                    } else {
                        byte[] bArr4 = equals;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(998 - ((byte) KeyEvent.getModifierMetaStateMask()), 30 - Process.getGidForName(""), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61685), 1874745193, false, $$g((byte) 15, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i4;
                } else {
                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i2 + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i2 + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)) + i7;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(getRequestBeneficiariesState), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1697 - ((Process.getThreadPriority(0) + 20) >> 6), 36 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1454191902, false, $$g((byte) 14, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = equals;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = $11 + 71;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        bArr6[i12] = (byte) (((long) bArr5[i12]) ^ 7083766810336261929L);
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i15 = $10 + 119;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i17 = $10 + 51;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    if (z) {
                        byte[] bArr7 = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getAsAtTimestamp;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            String string = sb.toString();
            int i19 = $11 + 33;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x11dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x11e8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x2421  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x2422  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x078a  */
    /* JADX WARN: Type inference failed for: r4v288, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.CropTranslateActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.payment.lib.image.crop.CropTranslateActivity.hashCode
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.huawei.payment.lib.image.crop.CropTranslateActivity.accessartificialFrame = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L16
            super.onActivityResult(r4, r5, r6)
            r6 = 127(0x7f, float:1.78E-43)
            if (r4 != r6) goto L4a
            goto L1d
        L16:
            super.onActivityResult(r4, r5, r6)
            r6 = 104(0x68, float:1.46E-43)
            if (r4 != r6) goto L4a
        L1d:
            r4 = -1
            if (r5 != r4) goto L4a
            int r4 = com.huawei.payment.lib.image.crop.CropTranslateActivity.accessartificialFrame
            int r4 = r4 + 123
            int r5 = r4 % 128
            com.huawei.payment.lib.image.crop.CropTranslateActivity.hashCode = r5
            int r4 = r4 % r0
            com.huawei.common.photo.CropManager r4 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r4 = r4.getCallback()
            if (r4 == 0) goto L66
            com.huawei.common.photo.CropManager r4 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r4 = r4.getCallback()
            android.net.Uri r5 = r3.imageCropUri
            r4.onSuccess(r5)
            int r4 = com.huawei.payment.lib.image.crop.CropTranslateActivity.accessartificialFrame
            int r4 = r4 + 67
            int r5 = r4 % 128
            com.huawei.payment.lib.image.crop.CropTranslateActivity.hashCode = r5
            int r4 = r4 % r0
            goto L66
        L4a:
            com.huawei.common.photo.CropManager r4 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r4 = r4.getCallback()
            if (r4 == 0) goto L66
            com.huawei.common.photo.CropManager r4 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r4 = r4.getCallback()
            com.huawei.common.exception.BaseException r5 = new com.huawei.common.exception.BaseException
            java.lang.String r6 = ""
            r5.<init>(r6)
            r4.onError(r5)
        L66:
            com.huawei.common.photo.CropManager r4 = com.huawei.common.photo.CropManager.getInstance()
            r4.reset()
            r3.finish()
            int r4 = com.huawei.payment.lib.image.crop.CropTranslateActivity.accessartificialFrame
            int r4 = r4 + 29
            int r5 = r4 % 128
            com.huawei.payment.lib.image.crop.CropTranslateActivity.hashCode = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.CropTranslateActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0141  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.CropTranslateActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = hashCode + 111;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952781_res_0x7f13048d).substring(14, 15).codePointAt(0) - 129, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 104), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 1899302617, (short) (KeyEvent.keyCodeFromString("") - 86), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) + 1312129660, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 129, (byte) (View.resolveSizeAndState(0, 0, 0) - 66), TextUtils.getTrimmedLength("") - 1899302490, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) + 1312129662, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i3 = accessartificialFrame + 87;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6617, View.getDefaultSize(0, 0) + 42, (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0'), View.MeasureSpec.getMode(0) + 56, (char) View.MeasureSpec.getSize(0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-610792312);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 67, 33 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf("", "", 0) + 19696), 516019181, false, "component1", null);
            }
            Object obj = ((Field) objCopydefault3).get(null);
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1078988351);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 68, ((Process.getThreadPriority(0) + 20) >> 6) + 33, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19695), 2062954148, false, "copydefault", new Class[0]);
            }
            ((Method) objCopydefault4).invoke(obj, null);
            super.onPause();
            return;
        }
        getBaseContext();
        throw null;
    }

    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 5019 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1010:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0c1e A[Catch: all -> 0x0ce2, TryCatch #43 {all -> 0x0ce2, blocks: (B:151:0x0c18, B:153:0x0c1e, B:154:0x0c48), top: B:942:0x0c18, outer: #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0dca A[Catch: all -> 0x05e3, TryCatch #45 {all -> 0x05e3, blocks: (B:195:0x0dc4, B:197:0x0dca, B:198:0x0dee, B:330:0x1557, B:332:0x155d, B:333:0x1589, B:445:0x1aef, B:447:0x1af5, B:448:0x1b21, B:537:0x2068, B:539:0x206e, B:540:0x2096, B:762:0x3372, B:764:0x3378, B:765:0x33a5, B:796:0x39e4, B:798:0x39ea, B:799:0x3a13, B:833:0x3d2c, B:835:0x3d32, B:836:0x3d57, B:813:0x3b68, B:815:0x3b8b, B:816:0x3bdf, B:632:0x2be3, B:634:0x2be9, B:635:0x2c11, B:637:0x2c4b, B:638:0x2c96, B:605:0x2931, B:607:0x2946, B:608:0x2976, B:587:0x2648, B:589:0x264e, B:590:0x2678, B:592:0x26b2, B:593:0x26f8, B:557:0x22e4, B:559:0x22f9, B:560:0x2329, B:562:0x235d, B:563:0x23d3, B:70:0x07f8, B:72:0x07fe, B:73:0x0822, B:19:0x02c4, B:21:0x02ca, B:22:0x02f2, B:24:0x054d, B:26:0x057f, B:27:0x05dd, B:33:0x05f2, B:35:0x05f8, B:56:0x06e4, B:58:0x06ea, B:59:0x06eb, B:61:0x06ed, B:63:0x06f4, B:64:0x06f5, B:39:0x0604), top: B:946:0x02c4, inners: #62 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0ec3 A[Catch: all -> 0x1469, PHI: r1 r4
  0x0ec3: PHI (r1v711 java.lang.Object) = (r1v707 java.lang.Object), (r1v710 java.lang.Object) binds: [B:203:0x0e78, B:204:0x0e7a] A[DONT_GENERATE, DONT_INLINE]
  0x0ec3: PHI (r4v439 ??) = (r4v516 ??), (r4v517 ??) binds: [B:203:0x0e78, B:204:0x0e7a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #46 {all -> 0x1469, blocks: (B:202:0x0e74, B:208:0x0ec3, B:212:0x0f30, B:236:0x0fdb), top: B:947:0x0e74 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0f46  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0fac  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x130a A[Catch: all -> 0x1442, TryCatch #27 {all -> 0x1442, blocks: (B:269:0x1300, B:270:0x1304, B:272:0x130a, B:275:0x1326, B:238:0x0fe9, B:255:0x11d8, B:258:0x1229, B:264:0x12a2, B:268:0x12f8), top: B:912:0x0fe9 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x155d A[Catch: all -> 0x05e3, TryCatch #45 {all -> 0x05e3, blocks: (B:195:0x0dc4, B:197:0x0dca, B:198:0x0dee, B:330:0x1557, B:332:0x155d, B:333:0x1589, B:445:0x1aef, B:447:0x1af5, B:448:0x1b21, B:537:0x2068, B:539:0x206e, B:540:0x2096, B:762:0x3372, B:764:0x3378, B:765:0x33a5, B:796:0x39e4, B:798:0x39ea, B:799:0x3a13, B:833:0x3d2c, B:835:0x3d32, B:836:0x3d57, B:813:0x3b68, B:815:0x3b8b, B:816:0x3bdf, B:632:0x2be3, B:634:0x2be9, B:635:0x2c11, B:637:0x2c4b, B:638:0x2c96, B:605:0x2931, B:607:0x2946, B:608:0x2976, B:587:0x2648, B:589:0x264e, B:590:0x2678, B:592:0x26b2, B:593:0x26f8, B:557:0x22e4, B:559:0x22f9, B:560:0x2329, B:562:0x235d, B:563:0x23d3, B:70:0x07f8, B:72:0x07fe, B:73:0x0822, B:19:0x02c4, B:21:0x02ca, B:22:0x02f2, B:24:0x054d, B:26:0x057f, B:27:0x05dd, B:33:0x05f2, B:35:0x05f8, B:56:0x06e4, B:58:0x06ea, B:59:0x06eb, B:61:0x06ed, B:63:0x06f4, B:64:0x06f5, B:39:0x0604), top: B:946:0x02c4, inners: #62 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x1662 A[Catch: all -> 0x1a5f, PHI: r1 r9 r12 r13
  0x1662: PHI (r1v588 java.lang.Object) = (r1v577 java.lang.Object), (r1v587 java.lang.Object) binds: [B:338:0x1616, B:339:0x1618] A[DONT_GENERATE, DONT_INLINE]
  0x1662: PHI (r9v78 ??) = (r9v229 ??), (r9v230 ??) binds: [B:338:0x1616, B:339:0x1618] A[DONT_GENERATE, DONT_INLINE]
  0x1662: PHI (r12v213 ??) = (r12v292 ??), (r12v212 ??) binds: [B:338:0x1616, B:339:0x1618] A[DONT_GENERATE, DONT_INLINE]
  0x1662: PHI (r13v128 ??) = (r13v236 ??), (r13v237 ??) binds: [B:338:0x1616, B:339:0x1618] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #42 {all -> 0x1a5f, blocks: (B:337:0x1612, B:343:0x1662, B:352:0x16c7, B:370:0x17d4, B:374:0x1817), top: B:940:0x1612 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x166f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x16c7 A[Catch: all -> 0x1a5f, TRY_ENTER, TRY_LEAVE, TryCatch #42 {all -> 0x1a5f, blocks: (B:337:0x1612, B:343:0x1662, B:352:0x16c7, B:370:0x17d4, B:374:0x1817), top: B:940:0x1612 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x18f9 A[Catch: all -> 0x1a3a, TryCatch #17 {all -> 0x1a3a, blocks: (B:386:0x18ef, B:387:0x18f3, B:389:0x18f9, B:392:0x1914, B:376:0x1826, B:382:0x188a, B:385:0x18e7), top: B:894:0x1826 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1af5 A[Catch: all -> 0x05e3, TryCatch #45 {all -> 0x05e3, blocks: (B:195:0x0dc4, B:197:0x0dca, B:198:0x0dee, B:330:0x1557, B:332:0x155d, B:333:0x1589, B:445:0x1aef, B:447:0x1af5, B:448:0x1b21, B:537:0x2068, B:539:0x206e, B:540:0x2096, B:762:0x3372, B:764:0x3378, B:765:0x33a5, B:796:0x39e4, B:798:0x39ea, B:799:0x3a13, B:833:0x3d2c, B:835:0x3d32, B:836:0x3d57, B:813:0x3b68, B:815:0x3b8b, B:816:0x3bdf, B:632:0x2be3, B:634:0x2be9, B:635:0x2c11, B:637:0x2c4b, B:638:0x2c96, B:605:0x2931, B:607:0x2946, B:608:0x2976, B:587:0x2648, B:589:0x264e, B:590:0x2678, B:592:0x26b2, B:593:0x26f8, B:557:0x22e4, B:559:0x22f9, B:560:0x2329, B:562:0x235d, B:563:0x23d3, B:70:0x07f8, B:72:0x07fe, B:73:0x0822, B:19:0x02c4, B:21:0x02ca, B:22:0x02f2, B:24:0x054d, B:26:0x057f, B:27:0x05dd, B:33:0x05f2, B:35:0x05f8, B:56:0x06e4, B:58:0x06ea, B:59:0x06eb, B:61:0x06ed, B:63:0x06f4, B:64:0x06f5, B:39:0x0604), top: B:946:0x02c4, inners: #62 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1bac  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x1c03  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1c60 A[Catch: all -> 0x1f3d, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x1f3d, blocks: (B:452:0x1ba6, B:459:0x1bf6, B:469:0x1c60), top: B:902:0x1ba6 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1e23  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x1e26  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x206e A[Catch: all -> 0x05e3, TryCatch #45 {all -> 0x05e3, blocks: (B:195:0x0dc4, B:197:0x0dca, B:198:0x0dee, B:330:0x1557, B:332:0x155d, B:333:0x1589, B:445:0x1aef, B:447:0x1af5, B:448:0x1b21, B:537:0x2068, B:539:0x206e, B:540:0x2096, B:762:0x3372, B:764:0x3378, B:765:0x33a5, B:796:0x39e4, B:798:0x39ea, B:799:0x3a13, B:833:0x3d2c, B:835:0x3d32, B:836:0x3d57, B:813:0x3b68, B:815:0x3b8b, B:816:0x3bdf, B:632:0x2be3, B:634:0x2be9, B:635:0x2c11, B:637:0x2c4b, B:638:0x2c96, B:605:0x2931, B:607:0x2946, B:608:0x2976, B:587:0x2648, B:589:0x264e, B:590:0x2678, B:592:0x26b2, B:593:0x26f8, B:557:0x22e4, B:559:0x22f9, B:560:0x2329, B:562:0x235d, B:563:0x23d3, B:70:0x07f8, B:72:0x07fe, B:73:0x0822, B:19:0x02c4, B:21:0x02ca, B:22:0x02f2, B:24:0x054d, B:26:0x057f, B:27:0x05dd, B:33:0x05f2, B:35:0x05f8, B:56:0x06e4, B:58:0x06ea, B:59:0x06eb, B:61:0x06ed, B:63:0x06f4, B:64:0x06f5, B:39:0x0604), top: B:946:0x02c4, inners: #62 }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x2122  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x2190  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x21e7  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x22c4  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x2510  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x2609  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x27f5  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x283f  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x290f  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2aab  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x2ba5  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2df3 A[Catch: all -> 0x32b1, PHI: r1
  0x2df3: PHI (r1v308 java.lang.Object) = (r1v302 java.lang.Object), (r1v306 java.lang.Object) binds: [B:642:0x2da5, B:643:0x2da7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x32b1, blocks: (B:641:0x2da1, B:648:0x2df3, B:651:0x2e5d, B:669:0x2ee3), top: B:883:0x2da1 }] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x2e1a A[Catch: all -> 0x2dec, TRY_ENTER, TRY_LEAVE, TryCatch #48 {all -> 0x2dec, blocks: (B:643:0x2da7, B:650:0x2e1a, B:655:0x2e76, B:657:0x2e7c, B:658:0x2ebc, B:661:0x2ecd, B:663:0x2ed1, B:667:0x2edd), top: B:950:0x2da7 }] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2e73  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2ec9  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x3141 A[Catch: all -> 0x3288, TryCatch #60 {all -> 0x3288, blocks: (B:702:0x3137, B:703:0x313b, B:705:0x3141, B:708:0x315f, B:671:0x2ef1, B:689:0x3010, B:692:0x305b, B:698:0x30d2, B:701:0x312f), top: B:973:0x2ef1 }] */
    /* JADX WARN: Removed duplicated region for block: B:764:0x3378 A[Catch: all -> 0x05e3, TryCatch #45 {all -> 0x05e3, blocks: (B:195:0x0dc4, B:197:0x0dca, B:198:0x0dee, B:330:0x1557, B:332:0x155d, B:333:0x1589, B:445:0x1aef, B:447:0x1af5, B:448:0x1b21, B:537:0x2068, B:539:0x206e, B:540:0x2096, B:762:0x3372, B:764:0x3378, B:765:0x33a5, B:796:0x39e4, B:798:0x39ea, B:799:0x3a13, B:833:0x3d2c, B:835:0x3d32, B:836:0x3d57, B:813:0x3b68, B:815:0x3b8b, B:816:0x3bdf, B:632:0x2be3, B:634:0x2be9, B:635:0x2c11, B:637:0x2c4b, B:638:0x2c96, B:605:0x2931, B:607:0x2946, B:608:0x2976, B:587:0x2648, B:589:0x264e, B:590:0x2678, B:592:0x26b2, B:593:0x26f8, B:557:0x22e4, B:559:0x22f9, B:560:0x2329, B:562:0x235d, B:563:0x23d3, B:70:0x07f8, B:72:0x07fe, B:73:0x0822, B:19:0x02c4, B:21:0x02ca, B:22:0x02f2, B:24:0x054d, B:26:0x057f, B:27:0x05dd, B:33:0x05f2, B:35:0x05f8, B:56:0x06e4, B:58:0x06ea, B:59:0x06eb, B:61:0x06ed, B:63:0x06f4, B:64:0x06f5, B:39:0x0604), top: B:946:0x02c4, inners: #62 }] */
    /* JADX WARN: Removed duplicated region for block: B:770:0x3437  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x347f  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x34d4  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x39c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x3aa7  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x3af9  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x3b4a  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x3d0c  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x0e7a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:934:0x1618 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:950:0x2da7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v443 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v117 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v170 */
    /* JADX WARN: Type inference failed for: r11v171 */
    /* JADX WARN: Type inference failed for: r11v172 */
    /* JADX WARN: Type inference failed for: r11v179 */
    /* JADX WARN: Type inference failed for: r11v181 */
    /* JADX WARN: Type inference failed for: r11v194 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v198 */
    /* JADX WARN: Type inference failed for: r11v199 */
    /* JADX WARN: Type inference failed for: r11v200 */
    /* JADX WARN: Type inference failed for: r11v201 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v78, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v118 */
    /* JADX WARN: Type inference failed for: r12v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v120 */
    /* JADX WARN: Type inference failed for: r12v121 */
    /* JADX WARN: Type inference failed for: r12v122 */
    /* JADX WARN: Type inference failed for: r12v123 */
    /* JADX WARN: Type inference failed for: r12v124 */
    /* JADX WARN: Type inference failed for: r12v125 */
    /* JADX WARN: Type inference failed for: r12v126, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v199 */
    /* JADX WARN: Type inference failed for: r12v200 */
    /* JADX WARN: Type inference failed for: r12v201 */
    /* JADX WARN: Type inference failed for: r12v202 */
    /* JADX WARN: Type inference failed for: r12v203 */
    /* JADX WARN: Type inference failed for: r12v206 */
    /* JADX WARN: Type inference failed for: r12v207 */
    /* JADX WARN: Type inference failed for: r12v208 */
    /* JADX WARN: Type inference failed for: r12v209 */
    /* JADX WARN: Type inference failed for: r12v210 */
    /* JADX WARN: Type inference failed for: r12v211 */
    /* JADX WARN: Type inference failed for: r12v212 */
    /* JADX WARN: Type inference failed for: r12v213 */
    /* JADX WARN: Type inference failed for: r12v214 */
    /* JADX WARN: Type inference failed for: r12v215 */
    /* JADX WARN: Type inference failed for: r12v216 */
    /* JADX WARN: Type inference failed for: r12v219 */
    /* JADX WARN: Type inference failed for: r12v220 */
    /* JADX WARN: Type inference failed for: r12v221 */
    /* JADX WARN: Type inference failed for: r12v222 */
    /* JADX WARN: Type inference failed for: r12v223 */
    /* JADX WARN: Type inference failed for: r12v227 */
    /* JADX WARN: Type inference failed for: r12v228 */
    /* JADX WARN: Type inference failed for: r12v229 */
    /* JADX WARN: Type inference failed for: r12v230 */
    /* JADX WARN: Type inference failed for: r12v231 */
    /* JADX WARN: Type inference failed for: r12v234 */
    /* JADX WARN: Type inference failed for: r12v235 */
    /* JADX WARN: Type inference failed for: r12v236 */
    /* JADX WARN: Type inference failed for: r12v237 */
    /* JADX WARN: Type inference failed for: r12v243 */
    /* JADX WARN: Type inference failed for: r12v244 */
    /* JADX WARN: Type inference failed for: r12v245 */
    /* JADX WARN: Type inference failed for: r12v246 */
    /* JADX WARN: Type inference failed for: r12v247 */
    /* JADX WARN: Type inference failed for: r12v248 */
    /* JADX WARN: Type inference failed for: r12v249 */
    /* JADX WARN: Type inference failed for: r12v250 */
    /* JADX WARN: Type inference failed for: r12v251 */
    /* JADX WARN: Type inference failed for: r12v266 */
    /* JADX WARN: Type inference failed for: r12v269 */
    /* JADX WARN: Type inference failed for: r12v270 */
    /* JADX WARN: Type inference failed for: r12v272 */
    /* JADX WARN: Type inference failed for: r12v284 */
    /* JADX WARN: Type inference failed for: r12v285 */
    /* JADX WARN: Type inference failed for: r12v286 */
    /* JADX WARN: Type inference failed for: r12v287 */
    /* JADX WARN: Type inference failed for: r12v288 */
    /* JADX WARN: Type inference failed for: r12v289 */
    /* JADX WARN: Type inference failed for: r12v290 */
    /* JADX WARN: Type inference failed for: r12v291 */
    /* JADX WARN: Type inference failed for: r12v292 */
    /* JADX WARN: Type inference failed for: r12v293 */
    /* JADX WARN: Type inference failed for: r12v294 */
    /* JADX WARN: Type inference failed for: r12v295 */
    /* JADX WARN: Type inference failed for: r12v296 */
    /* JADX WARN: Type inference failed for: r12v297 */
    /* JADX WARN: Type inference failed for: r12v298 */
    /* JADX WARN: Type inference failed for: r12v299 */
    /* JADX WARN: Type inference failed for: r12v300 */
    /* JADX WARN: Type inference failed for: r12v301 */
    /* JADX WARN: Type inference failed for: r12v302 */
    /* JADX WARN: Type inference failed for: r12v303 */
    /* JADX WARN: Type inference failed for: r12v304 */
    /* JADX WARN: Type inference failed for: r12v305 */
    /* JADX WARN: Type inference failed for: r12v306 */
    /* JADX WARN: Type inference failed for: r12v307 */
    /* JADX WARN: Type inference failed for: r12v308 */
    /* JADX WARN: Type inference failed for: r12v309 */
    /* JADX WARN: Type inference failed for: r12v310 */
    /* JADX WARN: Type inference failed for: r12v311 */
    /* JADX WARN: Type inference failed for: r12v312 */
    /* JADX WARN: Type inference failed for: r12v313 */
    /* JADX WARN: Type inference failed for: r12v314 */
    /* JADX WARN: Type inference failed for: r12v315 */
    /* JADX WARN: Type inference failed for: r12v316 */
    /* JADX WARN: Type inference failed for: r12v317 */
    /* JADX WARN: Type inference failed for: r12v318 */
    /* JADX WARN: Type inference failed for: r13v109 */
    /* JADX WARN: Type inference failed for: r13v123, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v159 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v173 */
    /* JADX WARN: Type inference failed for: r13v174 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v177 */
    /* JADX WARN: Type inference failed for: r13v178 */
    /* JADX WARN: Type inference failed for: r13v180 */
    /* JADX WARN: Type inference failed for: r13v184, types: [long] */
    /* JADX WARN: Type inference failed for: r13v185 */
    /* JADX WARN: Type inference failed for: r13v187 */
    /* JADX WARN: Type inference failed for: r13v193 */
    /* JADX WARN: Type inference failed for: r13v194 */
    /* JADX WARN: Type inference failed for: r13v195 */
    /* JADX WARN: Type inference failed for: r13v201 */
    /* JADX WARN: Type inference failed for: r13v202 */
    /* JADX WARN: Type inference failed for: r13v203 */
    /* JADX WARN: Type inference failed for: r13v207, types: [long] */
    /* JADX WARN: Type inference failed for: r13v208 */
    /* JADX WARN: Type inference failed for: r13v209 */
    /* JADX WARN: Type inference failed for: r13v212 */
    /* JADX WARN: Type inference failed for: r13v213 */
    /* JADX WARN: Type inference failed for: r13v223 */
    /* JADX WARN: Type inference failed for: r13v224 */
    /* JADX WARN: Type inference failed for: r13v225 */
    /* JADX WARN: Type inference failed for: r13v226 */
    /* JADX WARN: Type inference failed for: r13v227 */
    /* JADX WARN: Type inference failed for: r13v228 */
    /* JADX WARN: Type inference failed for: r13v229 */
    /* JADX WARN: Type inference failed for: r13v230 */
    /* JADX WARN: Type inference failed for: r13v231 */
    /* JADX WARN: Type inference failed for: r13v232 */
    /* JADX WARN: Type inference failed for: r13v233 */
    /* JADX WARN: Type inference failed for: r13v234 */
    /* JADX WARN: Type inference failed for: r13v235 */
    /* JADX WARN: Type inference failed for: r13v236 */
    /* JADX WARN: Type inference failed for: r13v237 */
    /* JADX WARN: Type inference failed for: r13v238 */
    /* JADX WARN: Type inference failed for: r13v239 */
    /* JADX WARN: Type inference failed for: r13v240 */
    /* JADX WARN: Type inference failed for: r13v241 */
    /* JADX WARN: Type inference failed for: r13v242 */
    /* JADX WARN: Type inference failed for: r13v243 */
    /* JADX WARN: Type inference failed for: r13v244 */
    /* JADX WARN: Type inference failed for: r13v245 */
    /* JADX WARN: Type inference failed for: r13v246 */
    /* JADX WARN: Type inference failed for: r13v247 */
    /* JADX WARN: Type inference failed for: r13v248 */
    /* JADX WARN: Type inference failed for: r13v249 */
    /* JADX WARN: Type inference failed for: r13v250 */
    /* JADX WARN: Type inference failed for: r13v251 */
    /* JADX WARN: Type inference failed for: r13v252 */
    /* JADX WARN: Type inference failed for: r13v253 */
    /* JADX WARN: Type inference failed for: r13v254 */
    /* JADX WARN: Type inference failed for: r13v255 */
    /* JADX WARN: Type inference failed for: r13v256 */
    /* JADX WARN: Type inference failed for: r13v257 */
    /* JADX WARN: Type inference failed for: r13v258 */
    /* JADX WARN: Type inference failed for: r13v259 */
    /* JADX WARN: Type inference failed for: r13v260 */
    /* JADX WARN: Type inference failed for: r13v261 */
    /* JADX WARN: Type inference failed for: r13v262 */
    /* JADX WARN: Type inference failed for: r13v263 */
    /* JADX WARN: Type inference failed for: r13v264 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v75 */
    /* JADX WARN: Type inference failed for: r13v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v110 */
    /* JADX WARN: Type inference failed for: r14v112 */
    /* JADX WARN: Type inference failed for: r14v120 */
    /* JADX WARN: Type inference failed for: r14v121, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v122 */
    /* JADX WARN: Type inference failed for: r14v123 */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v125 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v138 */
    /* JADX WARN: Type inference failed for: r14v139 */
    /* JADX WARN: Type inference failed for: r14v140 */
    /* JADX WARN: Type inference failed for: r14v141 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v143 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v146 */
    /* JADX WARN: Type inference failed for: r14v147 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v149 */
    /* JADX WARN: Type inference failed for: r14v150 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v153 */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v155 */
    /* JADX WARN: Type inference failed for: r14v156 */
    /* JADX WARN: Type inference failed for: r14v157 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r1v790, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v155 */
    /* JADX WARN: Type inference failed for: r2v501 */
    /* JADX WARN: Type inference failed for: r2v515 */
    /* JADX WARN: Type inference failed for: r2v516 */
    /* JADX WARN: Type inference failed for: r2v519, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v520 */
    /* JADX WARN: Type inference failed for: r2v521 */
    /* JADX WARN: Type inference failed for: r2v523 */
    /* JADX WARN: Type inference failed for: r2v530 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v730, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v829 */
    /* JADX WARN: Type inference failed for: r2v830 */
    /* JADX WARN: Type inference failed for: r2v831 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v100 */
    /* JADX WARN: Type inference failed for: r31v101 */
    /* JADX WARN: Type inference failed for: r31v102 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v25 */
    /* JADX WARN: Type inference failed for: r31v26 */
    /* JADX WARN: Type inference failed for: r31v27 */
    /* JADX WARN: Type inference failed for: r31v28 */
    /* JADX WARN: Type inference failed for: r31v29 */
    /* JADX WARN: Type inference failed for: r31v30 */
    /* JADX WARN: Type inference failed for: r31v31 */
    /* JADX WARN: Type inference failed for: r31v32 */
    /* JADX WARN: Type inference failed for: r31v33 */
    /* JADX WARN: Type inference failed for: r31v34 */
    /* JADX WARN: Type inference failed for: r31v35 */
    /* JADX WARN: Type inference failed for: r31v47 */
    /* JADX WARN: Type inference failed for: r31v48 */
    /* JADX WARN: Type inference failed for: r31v49 */
    /* JADX WARN: Type inference failed for: r31v50 */
    /* JADX WARN: Type inference failed for: r31v51 */
    /* JADX WARN: Type inference failed for: r31v52 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r31v62 */
    /* JADX WARN: Type inference failed for: r31v63 */
    /* JADX WARN: Type inference failed for: r31v64 */
    /* JADX WARN: Type inference failed for: r31v65 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v67 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v85 */
    /* JADX WARN: Type inference failed for: r31v86 */
    /* JADX WARN: Type inference failed for: r31v87 */
    /* JADX WARN: Type inference failed for: r31v88 */
    /* JADX WARN: Type inference failed for: r31v89 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r31v90 */
    /* JADX WARN: Type inference failed for: r31v91 */
    /* JADX WARN: Type inference failed for: r31v92 */
    /* JADX WARN: Type inference failed for: r31v93 */
    /* JADX WARN: Type inference failed for: r31v94 */
    /* JADX WARN: Type inference failed for: r31v95 */
    /* JADX WARN: Type inference failed for: r31v96 */
    /* JADX WARN: Type inference failed for: r31v97 */
    /* JADX WARN: Type inference failed for: r31v98 */
    /* JADX WARN: Type inference failed for: r31v99 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v100 */
    /* JADX WARN: Type inference failed for: r32v101 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v22 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v30 */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r32v33 */
    /* JADX WARN: Type inference failed for: r32v34 */
    /* JADX WARN: Type inference failed for: r32v35 */
    /* JADX WARN: Type inference failed for: r32v36 */
    /* JADX WARN: Type inference failed for: r32v37 */
    /* JADX WARN: Type inference failed for: r32v38 */
    /* JADX WARN: Type inference failed for: r32v39 */
    /* JADX WARN: Type inference failed for: r32v40 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v42 */
    /* JADX WARN: Type inference failed for: r32v43 */
    /* JADX WARN: Type inference failed for: r32v44 */
    /* JADX WARN: Type inference failed for: r32v45 */
    /* JADX WARN: Type inference failed for: r32v46 */
    /* JADX WARN: Type inference failed for: r32v47 */
    /* JADX WARN: Type inference failed for: r32v48 */
    /* JADX WARN: Type inference failed for: r32v49 */
    /* JADX WARN: Type inference failed for: r32v50 */
    /* JADX WARN: Type inference failed for: r32v51 */
    /* JADX WARN: Type inference failed for: r32v52 */
    /* JADX WARN: Type inference failed for: r32v53 */
    /* JADX WARN: Type inference failed for: r32v56 */
    /* JADX WARN: Type inference failed for: r32v57 */
    /* JADX WARN: Type inference failed for: r32v59, types: [long] */
    /* JADX WARN: Type inference failed for: r32v60 */
    /* JADX WARN: Type inference failed for: r32v61 */
    /* JADX WARN: Type inference failed for: r32v62 */
    /* JADX WARN: Type inference failed for: r32v63 */
    /* JADX WARN: Type inference failed for: r32v68 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v72 */
    /* JADX WARN: Type inference failed for: r32v73 */
    /* JADX WARN: Type inference failed for: r32v74 */
    /* JADX WARN: Type inference failed for: r32v75 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v84 */
    /* JADX WARN: Type inference failed for: r32v85 */
    /* JADX WARN: Type inference failed for: r32v86 */
    /* JADX WARN: Type inference failed for: r32v87 */
    /* JADX WARN: Type inference failed for: r32v88 */
    /* JADX WARN: Type inference failed for: r32v89 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r32v90 */
    /* JADX WARN: Type inference failed for: r32v91 */
    /* JADX WARN: Type inference failed for: r32v92 */
    /* JADX WARN: Type inference failed for: r32v93 */
    /* JADX WARN: Type inference failed for: r32v94 */
    /* JADX WARN: Type inference failed for: r32v95 */
    /* JADX WARN: Type inference failed for: r32v96 */
    /* JADX WARN: Type inference failed for: r32v97 */
    /* JADX WARN: Type inference failed for: r32v98 */
    /* JADX WARN: Type inference failed for: r32v99 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v202, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v203 */
    /* JADX WARN: Type inference failed for: r3v204 */
    /* JADX WARN: Type inference failed for: r3v205 */
    /* JADX WARN: Type inference failed for: r3v206 */
    /* JADX WARN: Type inference failed for: r3v219 */
    /* JADX WARN: Type inference failed for: r3v220 */
    /* JADX WARN: Type inference failed for: r3v229 */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v508 */
    /* JADX WARN: Type inference failed for: r3v565 */
    /* JADX WARN: Type inference failed for: r3v566 */
    /* JADX WARN: Type inference failed for: r3v567 */
    /* JADX WARN: Type inference failed for: r3v568 */
    /* JADX WARN: Type inference failed for: r4v131, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v132, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v178 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v417 */
    /* JADX WARN: Type inference failed for: r4v418 */
    /* JADX WARN: Type inference failed for: r4v419 */
    /* JADX WARN: Type inference failed for: r4v432 */
    /* JADX WARN: Type inference failed for: r4v433 */
    /* JADX WARN: Type inference failed for: r4v434 */
    /* JADX WARN: Type inference failed for: r4v439 */
    /* JADX WARN: Type inference failed for: r4v440 */
    /* JADX WARN: Type inference failed for: r4v441 */
    /* JADX WARN: Type inference failed for: r4v444, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v445 */
    /* JADX WARN: Type inference failed for: r4v446 */
    /* JADX WARN: Type inference failed for: r4v447 */
    /* JADX WARN: Type inference failed for: r4v448 */
    /* JADX WARN: Type inference failed for: r4v449 */
    /* JADX WARN: Type inference failed for: r4v477 */
    /* JADX WARN: Type inference failed for: r4v491 */
    /* JADX WARN: Type inference failed for: r4v516 */
    /* JADX WARN: Type inference failed for: r4v517 */
    /* JADX WARN: Type inference failed for: r4v518 */
    /* JADX WARN: Type inference failed for: r4v519 */
    /* JADX WARN: Type inference failed for: r4v520 */
    /* JADX WARN: Type inference failed for: r4v521 */
    /* JADX WARN: Type inference failed for: r4v522 */
    /* JADX WARN: Type inference failed for: r4v523 */
    /* JADX WARN: Type inference failed for: r4v524 */
    /* JADX WARN: Type inference failed for: r4v525 */
    /* JADX WARN: Type inference failed for: r4v526 */
    /* JADX WARN: Type inference failed for: r4v527 */
    /* JADX WARN: Type inference failed for: r4v528 */
    /* JADX WARN: Type inference failed for: r4v529 */
    /* JADX WARN: Type inference failed for: r5v125 */
    /* JADX WARN: Type inference failed for: r5v454 */
    /* JADX WARN: Type inference failed for: r5v455 */
    /* JADX WARN: Type inference failed for: r5v456 */
    /* JADX WARN: Type inference failed for: r5v479 */
    /* JADX WARN: Type inference failed for: r5v480 */
    /* JADX WARN: Type inference failed for: r5v481 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v126 */
    /* JADX WARN: Type inference failed for: r7v169 */
    /* JADX WARN: Type inference failed for: r7v170 */
    /* JADX WARN: Type inference failed for: r7v171 */
    /* JADX WARN: Type inference failed for: r7v172 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v183 */
    /* JADX WARN: Type inference failed for: r7v184, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v215 */
    /* JADX WARN: Type inference failed for: r7v263, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v284 */
    /* JADX WARN: Type inference failed for: r7v285 */
    /* JADX WARN: Type inference failed for: r7v286 */
    /* JADX WARN: Type inference failed for: r7v287 */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r8v143 */
    /* JADX WARN: Type inference failed for: r8v144 */
    /* JADX WARN: Type inference failed for: r8v145 */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v147 */
    /* JADX WARN: Type inference failed for: r8v149 */
    /* JADX WARN: Type inference failed for: r8v155 */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v398 */
    /* JADX WARN: Type inference failed for: r8v399 */
    /* JADX WARN: Type inference failed for: r8v400 */
    /* JADX WARN: Type inference failed for: r8v401 */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r9v124 */
    /* JADX WARN: Type inference failed for: r9v125 */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v132 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v145, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v151 */
    /* JADX WARN: Type inference failed for: r9v160, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v185 */
    /* JADX WARN: Type inference failed for: r9v186 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v222 */
    /* JADX WARN: Type inference failed for: r9v223 */
    /* JADX WARN: Type inference failed for: r9v224 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v226 */
    /* JADX WARN: Type inference failed for: r9v227 */
    /* JADX WARN: Type inference failed for: r9v228 */
    /* JADX WARN: Type inference failed for: r9v229 */
    /* JADX WARN: Type inference failed for: r9v230 */
    /* JADX WARN: Type inference failed for: r9v231 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v233 */
    /* JADX WARN: Type inference failed for: r9v234 */
    /* JADX WARN: Type inference failed for: r9v235 */
    /* JADX WARN: Type inference failed for: r9v236 */
    /* JADX WARN: Type inference failed for: r9v237 */
    /* JADX WARN: Type inference failed for: r9v238 */
    /* JADX WARN: Type inference failed for: r9v239 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v243 */
    /* JADX WARN: Type inference failed for: r9v244 */
    /* JADX WARN: Type inference failed for: r9v249 */
    /* JADX WARN: Type inference failed for: r9v250 */
    /* JADX WARN: Type inference failed for: r9v251 */
    /* JADX WARN: Type inference failed for: r9v252 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v87, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v92 */
    /* JADX WARN: Type inference failed for: r9v98 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 16260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.CropTranslateActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = hashCode + 53;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 7;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = accessartificialFrame + 85;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = hashCode + 125;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        component3 = 5054459294779475037L;
        component2 = 1386857713;
        component1 = (char) 50417;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = -2130806353;
        copydefault = -238323895;
        getRequestBeneficiariesState = 1073810156;
        equals = new byte[]{-101, -118, -124, -120, 94, 87, -24, -24, 17, -114, -53, SignedBytes.MAX_POWER_OF_TWO, 81, 80, 87, -124, 92, -121, -109, -23, -62, -39, -112, -6, 33, -21, -111, -39, -109, -37, -25, -120, -7, 4, -106, -107, -103, -48, -63, -64, -61, -108, -36, -109, -101, -16, 121, -54, 108, -15, -11, -14, -13, 127, 0, 34, 121, 102, -52, 127, -14, 109, -55, -6, -35, -118, -48, -74, -17, -48, -117, -50, -36, -117, -76, -30, -8, -46, -102, -51, -75, -59, -75, -118, -33, -117, -18, -7, -32, -49, -35, -103, -7, -46, -122, -49, -36, -101, -51, -119, -18, -52, -118, -118, -35, -47, -119, -36, -18, -118, -33, -7, -47, -75, -19, -33, -36, -7, -35, -33, -120, -47, -103, -8, -18, -62, -63, Ascii.SYN, 97, 124, 6, 116, 81, 104, 43, -82, 42, 100, 121, 105, 108, 96, -83, 33, 108, 102, 85, 37, 105, 123, 80, 60, Ascii.DC2, 116, Ascii.ESC, 99, 105, 102, Ascii.NAK, 116, Ascii.ESC, 121, -84, 45, 100, 117, 105, 6, 114, 107, Ascii.DC2, 125, 19, -95, 59, Ascii.SYN, 91, 98, 101, 103, 107, 96, 107, 100, 57, 82, 107, Ascii.SYN, 98, Ascii.SYN, 110, 103, Ascii.DLE, 46, 98, 107, 103, 123, -113, -27, -66, -25, -25, -75, -103, Ascii.RS, -71, 105, -96, 116, 117, 87, -95, Ascii.GS, -91, 108, 93, -77, 5, -89, -103, 13, -71, Ascii.DLE, 67, -71, Ascii.SUB, 5, 127, 9, TarHeader.LF_CHR, -71, TarHeader.LF_FIFO, TarHeader.LF_DIR, 13, -93, -126, 57, TarHeader.LF_CONTIG, TarHeader.LF_DIR, 56, 63, TarHeader.LF_SYMLINK, 63, TarHeader.LF_LINK, 60, TarHeader.LF_NORMAL, -126, 105, Ascii.DC2, 92, 104, 94, Ascii.DC2, 90, 104, 92, Ascii.NAK, -55, 92, -20, -114, -19, -17, -82, -22, -71, -96, -20, -124, 115, 95, -106, -124, 70, -125, 115, -19, -22, -96, -71, 112, -17, 114, -106, 113, 112, -19, -23, 116, -21, -22, -95, -90, -19, -96, -67, 114, 82, -127, -106, 116, -19, 113, -23, 112, 93, -22, 115, -125, 115, 115, -21, -96, 112, -125, 89, -128, 92, 126, -128, 112, -126, 92, 93, TarHeader.LF_DIR, 91, TarHeader.LF_SYMLINK, TarHeader.LF_NORMAL, 90, 92, TarHeader.LF_LINK, 95, -126, 71, 108, 67, 104, 69, 68, 105, 109, 65, 109, -125, 0, -106, 10, -108, 0, -24, 10, -106, 1};
        copy = (char) 42830;
        component4 = (char) 24966;
        ArtificialStackFrames = (char) 34047;
        toString = (char) 47646;
    }
}
