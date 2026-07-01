package com.huawei.digitalpayment.consumer.baselib.service;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.LiveData;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J0\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/IMacleService;", "", "queryRecentUseMiniApps", "Landroidx/lifecycle/LiveData;", "", "limit", "", "searchMiniApps", "page", "pageSize", "endPoint", "mappName", "isShowMiniApp", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IMacleService {
    boolean isShowMiniApp();

    LiveData<String> queryRecentUseMiniApps(int limit);

    String searchMiniApps(int page, int pageSize, int endPoint, String mappName);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static final byte[] $$c = {69, 81, 99, -123};
        private static final int $$f = 18;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {TarHeader.LF_NORMAL, -42, 66, -37, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
        private static final int $$e = 119;
        private static final byte[] $$a = {4, -80, 45, 109, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -21, Ascii.US, -45, -15, 3, -21};
        private static final int $$b = 78;
        private static int copydefault = 0;
        private static int component1 = 1;
        private static long component3 = -7167640216971707734L;
        private static int ShareDataUIState = 1386857713;
        private static char component2 = 50417;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r6, int r7, int r8) {
            /*
                int r8 = 99 - r8
                byte[] r0 = com.huawei.digitalpayment.consumer.baselib.service.IMacleService.DefaultImpls.$$c
                int r6 = r6 * 2
                int r6 = 3 - r6
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r6]
            L26:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.service.IMacleService.DefaultImpls.$$g(byte, int, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 6
                int r8 = 106 - r8
                byte[] r0 = com.huawei.digitalpayment.consumer.baselib.service.IMacleService.DefaultImpls.$$a
                int r7 = r7 * 18
                int r7 = 22 - r7
                int r6 = r6 * 12
                int r6 = 19 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r7]
            L28:
                int r7 = r7 + 1
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-10)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.service.IMacleService.DefaultImpls.a(short, int, byte, java.lang.Object[]):void");
        }

        private static void b(int i, int i2, byte b2, Object[] objArr) {
            byte[] bArr = $$d;
            int i3 = b2 * 3;
            int i4 = i2 + 98;
            int i5 = 13 - (i * 9);
            byte[] bArr2 = new byte[10 - i3];
            int i6 = 9 - i3;
            int i7 = -1;
            if (bArr == null) {
                i5++;
                i4 = (i4 + i5) - 27;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b3 = bArr[i5];
                    i5++;
                    i4 = (i4 + b3) - 27;
                }
            }
        }

        public static LiveData queryRecentUseMiniApps$default(IMacleService iMacleService, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryRecentUseMiniApps");
            }
            int i4 = component1;
            int i5 = i4 + 19;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 83;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                i = 8;
            }
            return iMacleService.queryRecentUseMiniApps(i);
        }

        public static String searchMiniApps$default(IMacleService iMacleService, int i, int i2, int i3, String str, int i4, Object obj) {
            int i5 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchMiniApps");
            }
            if ((i4 & 1) != 0) {
                i = 1;
            }
            if ((i4 & 2) != 0) {
                int i6 = component1 + 65;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                i2 = 20;
            }
            if ((i4 & 4) != 0) {
                int i8 = copydefault + 101;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                i3 = 1;
            }
            if ((i4 & 8) != 0) {
                str = "";
            }
            return iMacleService.searchMiniApps(i, i2, i3, str);
        }

        private static void c(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            iNotificationSideChannel.copydefault = 0;
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        int capsMode = 4037 - TextUtils.getCapsMode("", i5, i5);
                        int i10 = 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        char mode = (char) (19181 - View.MeasureSpec.getMode(i5));
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, i10, mode, 1912513118, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 7567;
                        int iIndexOf = TextUtils.indexOf("", "") + 11;
                        char cIndexOf = (char) TextUtils.indexOf("", "", i5, i5);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, iIndexOf, cIndexOf, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i11 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i11);
                    objArr4[i5] = iNotificationSideChannel;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", i5) + 2459, 28 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), 931716605, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        i2 = 2;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 7567, 11 - TextUtils.indexOf("", "", 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    i3 = i2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0793  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x07ae A[PHI: r11
  0x07ae: PHI (r11v76 int) = (r11v0 int), (r11v1 int), (r11v0 int) binds: [B:14:0x0107, B:153:0x07ae, B:8:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x094c  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0982  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0525 A[PHI: r0
  0x0525: PHI (r0v47 java.lang.Object[]) = (r0v46 java.lang.Object[]), (r0v111 java.lang.Object[]) binds: [B:66:0x0523, B:61:0x04fa] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component1(java.util.List r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2982
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.service.IMacleService.DefaultImpls.component1(java.util.List):int");
        }
    }
}
