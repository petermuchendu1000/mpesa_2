package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.getSmallIconId;
import org.bouncycastle.crypto.signers.PSSSigner;

public final class SetPinViewModel_HiltModules {
    private SetPinViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        private static short[] component3;
        private static final byte[] $$c = {60, -123, -116, -1};
        private static final int $$f = 139;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {7, 75, -84, -52, Ascii.FF, 1, 9, Ascii.FF, 1, 9, -21, 1, 1, -5, 20, -9, 8};
        private static final int $$e = 71;
        private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, Ascii.SI, -8, Ascii.DLE, -1, -4, -3, -52, TarHeader.LF_CONTIG, Ascii.SO, 1, 8, -13, Ascii.VT, 8, PSSSigner.TRAILER_IMPLICIT, 68, -1, -61, Ascii.NAK, TarHeader.LF_LINK, 2, -2, -1, -4, 0, Ascii.NAK, -9, 8, 1, -35, 39, -6, Ascii.VT, -1, Ascii.NAK, -17, -27, 39, Ascii.VT, -7, Ascii.ETB, -19, -49, SignedBytes.MAX_POWER_OF_TWO, -9, Ascii.SI, -5, -55, 40, Ascii.SYN, Ascii.FF, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
        private static final int $$b = 228;
        private static int copydefault = 1022913754;
        private static int ShareDataUIState = -238323847;
        private static int component2 = 1313971164;
        private static byte[] component1 = {-18, 8, 103, 5, 114, Ascii.VT, 88, 97, -50, 114, 125, 5, 114, Ascii.VT, 120, 65, 62, Ascii.SI, Ascii.SO, 9, 122, 2, 121, -101, -9, -104, -100, -103, -83, -66, -75, -100, 113, -28, 90, -4, -104, -23, 33, -103, -112, 43, -46, TarHeader.LF_LINK, -115, -41, -98, 46, -103, -51, -28, -44, -123, -106, -121, -121, 124, -117, -91, 92, 97, -113, 119, -109, -94, 79, -127, 126, -28, -90, 82, 95, -124, -88, -87, -69, -93, -93, -81, -96, 114, 93, -28, -88, -87, -79, -88, -93, 82, 125, -108, -89, -92, -91, 80, -72, 85, -24, -83, -120, 104, 86, 80, 80, -75, 119, 66, -84, -84, 80, 70, -113, 102, 87, -19, -52, -52, -69, -89, -34, -92, -79, -71, -63, -94, -92, 1, -116, -14, -69, -53, -92, -64, Ascii.SO, -3, -78, -72, -126, -86, -75, 82, -103, 108, -112, -128, -125, -126, 87, -97, 82, 88, -33, 94, 82, -128, 78, -106, -121, 85, 93, -105, -78, -72, -126, 90, -105, -78, -72, -126, 90};
        private static char[] getRequestBeneficiariesState = {42198, 59913, 14719, 18550, 40868, 11907, 32244, 36059, 53822, 24849, 45149, 51119, 5760, 42477, 3089, 17102, 37304, 57504, 14194, 34391, 54580, 9236, 31485, 51666, 6304, 28512, 48709, 3361, 23593, 37611, 57792, 12468, 3161, 8136, 20832, 33396, 3078, 17094, 37356, 57485, 14187, 34388, 54572, 9309, 31470, 51666, 6327, 28514, 48715, 3368, 23557, 37622, 59238, 43420, 31475, 3035, 56369, 27925, 15918, 53087, 37287, 8901, 62433, 33837, 21785, 59000, 46914, 31158, 2768, 56300, 27786, 15671, 52758, 40814, 8637, 62110, 33771, 21702, 58748, 3078, 17098, 37295, 57482, 14179, 34368, 54589, 9287, 31485, 51676, 6329, 28455, 48717, 3360, 23567, 37602, 57802, 12478, 34770, 10822, 25738, 47087, 50890, 4387, 40960, 62333, 519, 23741, 61340, 16121, 18791, 38923, 11105, 31300, 46263, 51081, 5874, 41432, 61567, 3078, 17098, 37295, 57482, 14179, 34368, 54589, 9287, 61929, 48949, 27713, 7539, 51866, 31673, 10492, 55798, 34570, 13348, 58694, 37521, 17320, 37052, 56942, 3331, 31800, 43974, 6885, 18839, 47352, 58964, 21864, 33807, 62348, 8928, 37248, 49318, 3655, 32099, 44126, 6931, 19167, 47599, 59541, 22080, 34147, 62517, 8999, 37571, 49659, 12434, 32685, 44406, 7295, 19219, 47809, 59872, 22671, 34747, 18995, 1190, 55251, 42734, 28955, 49209, 37757, 25156, 15549, 36791, 24280, 10508, 3161, 17103, 37293, 57493, 14179, 34312, 54588, 9244, 31466, 51666, 6395, 28522, 48709, 3362, 23630, 37606, 57802, 12468, 34706, 54900, 9500, 29750, 51942, 6601, 26812, 49036, 3693, 23901, 44148, 58139, 12773, 32980, 55226, 9765, 30047, 50225, 6915, 27108, 47325, 4082, 24200, 44414, 17864, 2911, 55337, 43283, 32444, 53215, 40103, 28037, 13179, 32780, 20785, 9969, 63439, 17599, 5535, 56122, 43076, 31010};
        private static long equals = -9060393680730438997L;

        private static String $$g(byte b2, byte b3, int i) {
            int i2 = b3 + 4;
            byte[] bArr = $$c;
            int i3 = i * 4;
            int i4 = b2 + 112;
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4 = i3 + i2;
                i2 = i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i4;
                int i7 = i2 + 1;
                if (i6 == i3) {
                    return new String(bArr2, 0);
                }
                i4 += bArr[i7];
                i2 = i7;
                i5 = i6;
            }
        }

        private static void c(byte b2, byte b3, int i, Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = 115 - (b3 * 3);
            int i3 = i + 4;
            byte[] bArr2 = new byte[34 - b2];
            int i4 = 33 - b2;
            int i5 = -1;
            if (bArr == null) {
                i2 = (i3 + i2) - 2;
                i3++;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i3;
                i2 = (i2 + bArr[i3]) - 2;
                i3 = i7 + 1;
                i5 = i6;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = 17 - r6
                int r0 = r8 + 1
                byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel_HiltModules.BindsModule.$$d
                int r7 = 100 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L11
                r4 = r7
                r3 = r2
                r7 = r6
                goto L29
            L11:
                r3 = r2
            L12:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L29:
                int r6 = r6 + 1
                int r7 = r7 + r4
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel_HiltModules.BindsModule.d(int, byte, int, java.lang.Object[]):void");
        }

        @LazyClassKey(SetPinViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SetPinViewModel setPinViewModel);

        private BindsModule() {
        }

        private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
            int i3;
            int i4 = 2 % 2;
            cancelNotification cancelnotification = new cancelNotification();
            long[] jArr = new long[i2];
            cancelnotification.copydefault = 0;
            while (cancelnotification.copydefault < i2) {
                int i5 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(getRequestBeneficiariesState[i + i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        int i6 = 1759 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34;
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        byte b2 = (byte) ($$f & 61);
                        byte b3 = $$c[3];
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6, scrollBarFadeDuration, cResolveSize, 1159210934, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(equals), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        int iGreen = Color.green(0) + 3608;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29;
                        char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7171);
                        byte b4 = $$c[3];
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, minimumFlingVelocity, c3, 1951385784, false, $$g((byte) 5, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 4013;
                        int iAxisFromString = MotionEvent.axisFromString("") + 25;
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 27761);
                        byte b5 = (byte) ($$f & 62);
                        byte b6 = $$c[3];
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iAxisFromString, longPressTimeout, -1529629956, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
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
            char[] cArr = new char[i2];
            cancelnotification.copydefault = 0;
            int i7 = $11 + 119;
            $10 = i7 % 128;
            int i8 = 2;
            int i9 = i7 % 2;
            while (cancelnotification.copydefault < i2) {
                int i10 = $10 + 109;
                $11 = i10 % 128;
                if (i10 % i8 == 0) {
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 4013;
                        int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23;
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27762);
                        byte b7 = (byte) ($$f & 62);
                        byte b8 = $$c[3];
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, i11, modifierMetaStateMask, -1529629956, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    int i12 = 69 / 0;
                    i8 = 2;
                } else {
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr6 = {cancelnotification, cancelnotification};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault5 == null) {
                        int iResolveSize = View.resolveSize(0, 0) + 4013;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 25;
                        char cResolveSize2 = (char) (View.resolveSize(0, 0) + 27761);
                        byte b9 = (byte) ($$f & 62);
                        byte b10 = $$c[3];
                        String str$$g = $$g(b9, b10, (byte) (b10 + 1));
                        i3 = 2;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iLastIndexOf, cResolveSize2, -1529629956, false, str$$g, new Class[]{Object.class, Object.class});
                    } else {
                        i3 = 2;
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                    i8 = i3;
                }
            }
            objArr[0] = new String(cArr);
        }

        private static void a(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            int i5 = 2 % 2;
            getSmallIconId getsmalliconid = new getSmallIconId();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                char c2 = 3;
                if (objCopydefault == null) {
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 999;
                    int gidForName = Process.getGidForName("") + 32;
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 61685);
                    byte b3 = $$c[3];
                    byte b4 = (byte) (-b3);
                    byte b5 = b3;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, gidForName, cResolveOpacity, 1874745193, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 == 0) {
                    j = 7083766810336261929L;
                } else {
                    byte[] bArr = component1;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault2 == null) {
                                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2983;
                                    int windowTouchSlop = 48 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    char deadChar = (char) (54462 - KeyEvent.getDeadChar(0, 0));
                                    byte[] bArr3 = $$c;
                                    byte length2 = (byte) bArr3.length;
                                    byte b6 = bArr3[c2];
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i8, windowTouchSlop, deadChar, -1178636483, false, $$g(length2, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                                i7++;
                                c2 = 3;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr4 = component1;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            int iIndexOf = 998 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iIndexOf2 = 31 - TextUtils.indexOf("", "", 0, 0);
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 61685);
                            byte b7 = $$c[3];
                            byte b8 = (byte) (-b7);
                            byte b9 = b7;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iIndexOf2, trimmedLength, 1874745193, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } else {
                        j = 7083766810336261929L;
                        iIntValue = (short) (((short) (((long) component3[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    }
                }
                if (iIntValue > 0) {
                    getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ j)) + i6;
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component2), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        int iRgb = (-16775519) - Color.rgb(0, 0, 0);
                        int iGreen = Color.green(0) + 37;
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        byte b10 = $$c[3];
                        byte b11 = (byte) (b10 + 1);
                        byte b12 = b10;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, iGreen, packedPositionGroup, -1454191902, false, $$g(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr5 = component1;
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        byte[] bArr6 = new byte[length3];
                        for (int i9 = 0; i9 < length3; i9++) {
                            bArr6[i9] = (byte) (((long) bArr5[i9]) ^ 7083766810336261929L);
                        }
                        bArr5 = bArr6;
                    }
                    boolean z = bArr5 != null;
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (z) {
                            int i10 = $11 + 109;
                            $10 = i10 % 128;
                            if (i10 % 2 != 0) {
                                byte[] bArr7 = component1;
                                getsmalliconid.copydefault = getsmalliconid.copydefault;
                                i4 = getsmalliconid.component3 - (((byte) (((byte) (((long) bArr7[r8]) - 7083766810336261929L)) % s)) ^ b2);
                            } else {
                                byte[] bArr8 = component1;
                                getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                i4 = getsmalliconid.component3 + (((byte) (((byte) (((long) bArr8[r8]) ^ 7083766810336261929L)) + s)) ^ b2);
                            }
                            getsmalliconid.component1 = (char) i4;
                        } else {
                            short[] sArr = component3;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                        int i11 = $11 + 91;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 5 / 5;
                        }
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        /*  JADX ERROR: Type inference failed with stack overflow
            jadx.core.utils.exceptions.JadxOverflowException
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public static java.lang.Object[] component2(android.content.Context r45, int r46, int r47, int r48) {
            /*
                Method dump skipped, instruction units count: 7770
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel_HiltModules.BindsModule.component2(android.content.Context, int, int, int):java.lang.Object[]");
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SetPinViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
