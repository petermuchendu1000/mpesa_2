package com.huawei.digitalpayment.consumer.zuriui;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public final class ZuriChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static byte[] ShareDataUIState;
    static ZuriChatViewModel component1;
    private static int component2;
    private static int component3;
    private static int component4;
    private static int copydefault;
    private static short[] equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r6 = r6 + 112
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey.$$c(short, int, short):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 999;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31;
                char edgeSlop = (char) (61685 - (ViewConfiguration.getEdgeSlop() >> 16));
                byte b3 = (byte) ($$b & 7);
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, scrollDefaultDelay, edgeSlop, 1874745193, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 91;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 37;
                        $10 = i10 % 128;
                        int i11 = i10 % i5;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2984;
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 49;
                                char cIndexOf = (char) (54462 - TextUtils.indexOf("", "", 0));
                                byte length2 = (byte) $$a.length;
                                byte b5 = (byte) (length2 - 4);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop2, iLastIndexOf, cIndexOf, -1178636483, false, $$c(length2, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i9++;
                            i5 = 2;
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
                    byte[] bArr3 = ShareDataUIState;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component3)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 999;
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 31;
                            char cResolveSize = (char) (61685 - View.resolveSize(0, 0));
                            byte b6 = (byte) ($$b & 7);
                            byte b7 = (byte) (b6 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop3, touchSlop, cResolveSize, 1874745193, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component3) ^ j)) + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component2), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 1697, 37 - View.resolveSize(0, 0), (char) TextUtils.getOffsetBefore("", 0), -1454191902, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = ShareDataUIState;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i12 = 0; i12 < length3; i12++) {
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i13 = $10 + 89;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    if (z) {
                        byte[] bArr6 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        component4 = 0;
        component3();
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1476034632, (-20) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) Gravity.getAbsoluteGravity(0, 0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1183412730) - KeyEvent.normalizeMetaState(0), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getRequestBeneficiariesState + 65;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    static void component3() {
        component3 = 1506674832;
        copydefault = -238323865;
        component2 = -1220409996;
        ShareDataUIState = new byte[]{46, 40, -36, Ascii.VT, -1, 59, -43, 58, -53, 58, -48, Ascii.FF, -13, -34, -44, TarHeader.LF_SYMLINK, 5, -20, -35, 37, -34, -44, -46, 101, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
    }
}
