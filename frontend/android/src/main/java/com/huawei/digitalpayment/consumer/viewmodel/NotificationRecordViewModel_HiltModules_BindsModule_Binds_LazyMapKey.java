package com.huawei.digitalpayment.consumer.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class NotificationRecordViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static boolean component1;
    static NotificationRecordViewModel component2;
    private static boolean component3;
    private static char[] copydefault;
    private static int getAsAtTimestamp;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {102, Ascii.FF, 98, 84};
    private static final int $$b = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 5
            int r7 = 73 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, byte, short):java.lang.String");
    }

    private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = copydefault;
        int i5 = 1;
        int i6 = 0;
        if (cArr3 != null) {
            int i7 = $10 + 25;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 13;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i6] = Integer.valueOf(cArr3[i9]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            int capsMode = TextUtils.getCapsMode("", i6, i6) + 3760;
                            int iResolveOpacity = Drawable.resolveOpacity(i6, i6) + 24;
                            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            String str$$c = $$c(b2, b3, (byte) (-b3));
                            Class[] clsArr = new Class[i5];
                            clsArr[0] = Integer.TYPE;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iResolveOpacity, c2, -1670574543, false, str$$c, clsArr);
                        }
                        cArr4[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(cArr3[i9]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3760 - Color.argb(0, 0, 0, 0), 24 - TextUtils.getOffsetAfter("", 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), -1670574543, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9++;
                    i3 = 2;
                    i5 = 1;
                }
                i6 = 0;
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            char c3 = '0';
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7188 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
            int i11 = 689978476;
            if (component1) {
                int i12 = $11 + 13;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cancelVar.component1 = bArr.length;
                    cArr2 = new char[cancelVar.component1];
                    i2 = 1;
                } else {
                    cancelVar.component1 = bArr.length;
                    cArr2 = new char[cancelVar.component1];
                    i2 = 0;
                }
                cancelVar.component3 = i2;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i13 = $10 + 47;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (View.MeasureSpec.getMode(0) + 7644), -327556343, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!component3) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                    int i15 = $10 + 53;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i11);
                if (objCopydefault5 == null) {
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2749;
                    int i17 = 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    char cIndexOf = (char) (TextUtils.indexOf("", c3, 0) + 7645);
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, i17, cIndexOf, -327556343, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                c3 = '0';
                i11 = 689978476;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        Object obj = null;
        a((Process.myPid() >> 22) + 127, null, new byte[]{-114, -119, -117, -126, -103, -120, -119, -118, -104, -117, -109, -126, -127, -119, -105, -111, -126, -118, -115, -121, -127, -118, -106, -118, -115, -126, -107, -124, -114, -119, -117, -126, -125, -120, -119, -118, -108, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = copy + 73;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        copydefault = new char[]{30222, 30210, 30208, 30403, 30213, 30328, 30220, 30330, 30216, 30212, 30217, 30218, 30329, 30209, 30333, 30324, 30211, 30334, 30335, 30331, 30243, 30219, 30239, 30235, 30240};
        ShareDataUIState = 321287917;
        component3 = true;
        component1 = true;
    }
}
