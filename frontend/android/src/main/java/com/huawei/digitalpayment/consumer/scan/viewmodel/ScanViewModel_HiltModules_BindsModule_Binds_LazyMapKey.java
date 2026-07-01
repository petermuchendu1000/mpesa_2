package com.huawei.digitalpayment.consumer.scan.viewmodel;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getActiveNotifications;

public final class ScanViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int[] ShareDataUIState;
    static ScanViewModel component1;
    private static int component3;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, short r8, byte r9) {
        /*
            int r9 = r9 + 104
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ShareDataUIState;
        char c2 = '0';
        int i5 = 684241640;
        int i6 = 16;
        int i7 = 1;
        int i8 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 105;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            int edgeSlop = 4391 - (ViewConfiguration.getEdgeSlop() >> i6);
                            int mirror = AndroidCharacter.getMirror(c2) - 11;
                            char mode = (char) View.MeasureSpec.getMode(0);
                            byte b2 = (byte) ($$a[3] + 1);
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, mirror, mode, -309236339, false, $$c(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int iNormalizeMetaState = 4391 - KeyEvent.normalizeMetaState(0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 37;
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b4 = (byte) ($$a[3] + 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, packedPositionType, cMakeMeasureSpec, -309236339, false, $$c(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i3 = 2;
                c2 = '0';
                i5 = 684241640;
                i6 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ShareDataUIState;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 117;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr4 = new Object[i7];
                objArr4[i8] = Integer.valueOf(iArr5[i11]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    int iGreen = Color.green(i8) + 4391;
                    int iArgb = 37 - Color.argb(i8, i8, i8, i8);
                    char cRed = (char) Color.red(i8);
                    byte b6 = (byte) ($$a[3] + 1);
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, iArgb, cRed, -309236339, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i11++;
                i7 = 1;
                i8 = 0;
            }
            int i14 = $11 + 83;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            int i16 = $10 + 3;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i18];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    int i20 = 2968 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int mirror2 = AndroidCharacter.getMirror('0') - ' ';
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 49871);
                    byte b8 = (byte) ($$a[3] + 1);
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i20, mirror2, trimmedLength, 462826032, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i18++;
            }
            int i21 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i21;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i22 = getactivenotifications.ShareDataUIState;
            int i23 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                int i24 = 2945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 25;
                char c3 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27636);
                byte b10 = (byte) ($$a[3] + 1);
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i24, packedPositionChild, c3, -1616366948, false, $$c(b10, b11, (byte) (b11 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component3 = 1;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a(Color.red(0) + 63, new int[]{429204345, -1736516326, 2086442688, 1353701214, 1363789345, -2063881475, -338778921, -789926903, 386530162, -1549410826, -1836749332, 1991050957, -90796618, -307384561, 1294923266, 1926152643, -1344991868, 353000343, 1706812161, -135009770, 654245783, -1550018672, 735386826, 2084557090, -255275636, -1900412945, 766195985, 1674365710, 1983907986, -627827503, -1191161099, -2069069106}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 121;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = new int[]{-1669700830, -2115411145, 1305211641, 306796952, -63942554, 271357321, 967397871, -1262313956, -151240116, 658939567, 1506748779, -1876090656, -650781387, -1686701996, 1113569111, -855538096, 347862605, 642703112};
    }
}
