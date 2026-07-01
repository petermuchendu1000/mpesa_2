package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\t\u0010\u001c\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/MiniAppMenuItem;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "label", "", "iconRes", "isEnabled", "", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Z)V", "getId", "()I", "getLabel", "()Ljava/lang/String;", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Z)Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/MiniAppMenuItem;", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppMenuItem {
    public static final int $stable = 0;
    private static int[] component3;
    private static long equals;
    private static int getAsAtTimestamp;
    private final boolean ShareDataUIState;
    private final int component1;
    private final Integer component2;
    private final String copydefault;
    private static final byte[] $$c = {112, 44, -46, -27};
    private static final int $$f = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {69, -38, -90, 81, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$e = 202;
    private static final byte[] $$a = {93, -40, 95, -94, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1};
    private static final int $$b = 196;
    private static int getRequestBeneficiariesState = 0;
    private static int copy = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 + 103
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.$$a
            int r7 = r7 + 4
            int r1 = 16 - r8
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            int r8 = 15 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-16)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.$$d
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 11
            int r8 = r8 * 3
            int r8 = r8 + 99
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.d(short, int, int, java.lang.Object[]):void");
    }

    public MiniAppMenuItem(int i, String str, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = i;
        this.copydefault = str;
        this.component2 = num;
        this.ShareDataUIState = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppMenuItem(int i, String str, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = getRequestBeneficiariesState + 29;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            num = null;
        }
        if ((i2 & 8) != 0) {
            int i6 = copy + 81;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        this(i, str, num, z);
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 119;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(equals ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 87;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(equals)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - ExpandableListView.getPackedPositionGroup(0L), Color.blue(0) + 34, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1391, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 51270), -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 99;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int[] iArr3;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = component3;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr4 != null) {
            int i7 = $11 + 1;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $11 + 93;
                $10 = i10 % 128;
                if (i10 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i9])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 3);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSize(0, 0) + 37, (char) (ViewConfiguration.getLongPressTimeout() >> 16), -309236339, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                        }
                        iArr5[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i9 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr4[i9])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 3);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4391, (ViewConfiguration.getPressedStateDuration() >> 16) + 37, (char) Gravity.getAbsoluteGravity(0, 0), -309236339, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
                        }
                        iArr5[i9] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                i4 = 684241640;
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = component3;
        if (iArr7 != null) {
            int i11 = $11 + 79;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                Object[] objArr4 = new Object[i5];
                objArr4[i6] = Integer.valueOf(iArr7[i12]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) i6;
                    byte b7 = (byte) (b6 + 3);
                    iArr3 = iArr7;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(i6) + 4391, 36 - ImageFormat.getBitsPerPixel(i6), (char) TextUtils.getTrimmedLength(""), -309236339, false, $$g(b6, b7, (byte) (b7 - 3)), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i12] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i12++;
                iArr7 = iArr3;
                i5 = 1;
                i6 = 0;
            }
            iArr7 = iArr2;
        }
        int i13 = i6;
        System.arraycopy(iArr7, i13, iArr6, i13, length3);
        getactivenotifications.component1 = i13;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i13] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr6[i14];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 2969, 16 - KeyEvent.normalizeMetaState(0), (char) (49870 - TextUtils.lastIndexOf("", '0', 0)), 462826032, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr6);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                int iIndexOf = TextUtils.indexOf("", "") + 2944;
                int tapTimeout = 24 - (ViewConfiguration.getTapTimeout() >> 16);
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 27637);
                byte length4 = (byte) $$c.length;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, tapTimeout, cResolveSizeAndState, -1616366948, false, $$g((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i19 = $10 + 11;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer getIconRes() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppMenuItem.getIconRes():java.lang.Integer");
    }

    public final boolean isEnabled() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 85;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i2 + 31;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        copydefault();
        int i = component4 + 83;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MiniAppMenuItem copy$default(MiniAppMenuItem miniAppMenuItem, int i, String str, Integer num, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = copy + 1;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            i = miniAppMenuItem.component1;
        }
        if ((i2 & 2) != 0) {
            int i6 = getRequestBeneficiariesState + 79;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = miniAppMenuItem.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = miniAppMenuItem.copydefault;
        }
        if ((i2 & 4) != 0) {
            num = miniAppMenuItem.component2;
        }
        if ((i2 & 8) != 0) {
            z = miniAppMenuItem.ShareDataUIState;
        }
        return miniAppMenuItem.copy(i, str, num, z);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 119;
        int i4 = i3 % 128;
        copy = i4;
        if (i3 % 2 == 0) {
            i = this.component1;
            int i5 = 38 / 0;
        } else {
            i = this.component1;
        }
        int i6 = i4 + 105;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 39;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 83;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = copy + 101;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copy + 87;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 53;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final MiniAppMenuItem copy(int id, String label, Integer iconRes, boolean isEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(label, "");
        MiniAppMenuItem miniAppMenuItem = new MiniAppMenuItem(id, label, iconRes, isEnabled);
        int i2 = copy + 71;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return miniAppMenuItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 7;
        int i4 = i3 % 128;
        copy = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppMenuItem)) {
            int i5 = i4 + 33;
            getRequestBeneficiariesState = i5 % 128;
            return i5 % 2 != 0;
        }
        MiniAppMenuItem miniAppMenuItem = (MiniAppMenuItem) other;
        if (this.component1 != miniAppMenuItem.component1) {
            int i6 = i2 + 101;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, miniAppMenuItem.copydefault)) {
            int i8 = getRequestBeneficiariesState + 31;
            copy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, miniAppMenuItem.component2)) {
            return false;
        }
        if (this.ShareDataUIState == miniAppMenuItem.ShareDataUIState) {
            return true;
        }
        int i10 = getRequestBeneficiariesState + 43;
        copy = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 63;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Integer.hashCode(this.component1);
            this.copydefault.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Integer.hashCode(this.component1);
        int iHashCode2 = this.copydefault.hashCode();
        Integer num = this.component2;
        if (num == null) {
            i = 0;
        } else {
            int iHashCode3 = num.hashCode();
            int i4 = copy + 89;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
            i = iHashCode3;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + Boolean.hashCode(this.ShareDataUIState);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppMenuItem(id=" + this.component1 + ", label=" + this.copydefault + ", iconRes=" + this.component2 + ", isEnabled=" + this.ShareDataUIState + ")";
        int i2 = copy + 115;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 113;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        component3 = new int[]{1184831195, -1778981175, -305981408, -922248062, 747099258, -935010088, 442036149, 2116444335, -1724250947, 2086815815, -1145103994, -102518259, 342378047, 1661460625, 1226884029, -1472915221, -226615350, 553133617};
        int i5 = i2 + 57;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        equals = -6812159631475334556L;
    }
}
