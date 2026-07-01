package com.huawei.digitalpayment.checkout.model.entity;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.getActiveNotifications;

public class CouponBean extends BaseResp {
    private static char[] ShareDataUIState;
    private static boolean component1;
    private static boolean component2;
    private static int[] component3;
    private static int copydefault;
    private static int equals;
    private boolean available;
    private String category;
    private String couponDesc;
    private String couponDescOther;
    private String couponHint;
    private String couponIcon;
    private String couponIconUrl;
    private String couponId;
    private String couponName;
    private String couponNameDisplay;
    private String couponNameOther;
    private String couponTemplateId;
    private String couponType;
    private String denomination;
    private String discountAmount;
    private String discountRatio;
    private String maxDiscountAmount;
    private String status;
    private String threshold;
    private String unit;
    private String unitType;
    private String usageEntryUrl;
    private String validEndTime;
    private String validStartTime;
    private String valueType;
    private static final byte[] $$c = {68, -59, -116, 119};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {120, -62, 63, 57, -39, -25, -30, -26, -26, -18, -36, -33, 39};
    private static final int $$e = 241;
    private static final byte[] $$a = {104, -2, Ascii.CAN, -74, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1};
    private static final int $$b = 86;
    private static int getAsAtTimestamp = 1;
    private static int component4 = 0;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r7, short r8, short r9) {
        /*
            int r8 = 107 - r8
            int r9 = r9 * 3
            int r9 = r9 + 4
            byte[] r0 = com.huawei.digitalpayment.checkout.model.entity.CouponBean.$$c
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L28:
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.model.entity.CouponBean.$$i(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.checkout.model.entity.CouponBean.$$a
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-16)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.model.entity.CouponBean.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = 10 - r7
            int r8 = r8 * 4
            int r8 = 99 - r8
            byte[] r0 = com.huawei.digitalpayment.checkout.model.entity.CouponBean.$$d
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-27)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.model.entity.CouponBean.d(short, byte, int, java.lang.Object[]):void");
    }

    public String getDiscountAmount() {
        int i = 2 % 2;
        int i2 = component4 + 41;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.discountAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDiscountAmount(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 39;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.discountAmount = str;
        int i5 = i2 + 61;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getValueType() {
        int i = 2 % 2;
        int i2 = component4 + 45;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.valueType;
        int i5 = i3 + 1;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public void setValueType(String str) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 51;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.valueType = str;
        int i5 = i2 + 55;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isAvailable() {
        int i = 2 % 2;
        int i2 = copy + 35;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.available;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAvailable(boolean z) {
        int i = 2 % 2;
        int i2 = copy + 81;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.available = z;
        int i5 = i3 + 107;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCouponId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 27;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.couponId;
        int i5 = i2 + 101;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCouponId(String str) {
        int i = 2 % 2;
        int i2 = copy + 43;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.couponId = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCouponIconUrl() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.couponIconUrl;
        int i5 = i2 + 115;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCouponIconUrl(String str) {
        int i = 2 % 2;
        int i2 = component4 + 125;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.couponIconUrl = str;
        int i5 = i3 + 111;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getValidStartTime() {
        String str;
        int i = 2 % 2;
        int i2 = copy + 85;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            str = this.validStartTime;
            int i4 = 26 / 0;
        } else {
            str = this.validStartTime;
        }
        int i5 = i3 + 1;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setValidStartTime(String str) {
        int i = 2 % 2;
        int i2 = component4 + 57;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.validStartTime = str;
        int i5 = i3 + 15;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getValidEndTime() {
        int i = 2 % 2;
        int i2 = component4 + 23;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.validEndTime;
        int i5 = i3 + 1;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setValidEndTime(String str) {
        int i = 2 % 2;
        int i2 = copy + 3;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.validEndTime = str;
        int i5 = i3 + 1;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    public String getCouponTemplateId() {
        int i = 2 % 2;
        int i2 = copy + 53;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.couponTemplateId;
        int i4 = i3 + 113;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setCouponTemplateId(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.couponTemplateId = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 75;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
    }

    public String getCouponName() {
        int i = 2 % 2;
        int i2 = component4 + 55;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.couponName;
        int i4 = i3 + 119;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return str;
    }

    public void setCouponName(String str) {
        int i = 2 % 2;
        int i2 = copy + 103;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.couponName = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCouponNameDisplay() {
        int i = 2 % 2;
        int i2 = component4 + 77;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.couponNameDisplay;
        int i4 = i3 + 27;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setCouponNameDisplay(String str) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.couponNameDisplay = str;
        int i5 = i3 + 3;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCouponHint() {
        String str;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 23;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.couponHint;
            int i4 = 99 / 0;
        } else {
            str = this.couponHint;
        }
        int i5 = i2 + 109;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        int i3 = 684241640;
        float f = 0.0f;
        int i4 = 16;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 73;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        int i10 = (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 4391;
                        int modifierMetaStateMask = 36 - ((byte) KeyEvent.getModifierMetaStateMask());
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> i4);
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i10, modifierMetaStateMask, jumpTapTimeout, -309236339, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 684241640;
                    f = 0.0f;
                    i4 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i11 = $10 + 89;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 4 / 3;
            }
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 123;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr6[i13]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) i6;
                    byte b5 = (byte) (b4 + 1);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.lastIndexOf("", '0', i6, i6), 37 - ExpandableListView.getPackedPositionType(0L), (char) ((-1) - Process.getGidForName("")), -309236339, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i13++;
                iArr6 = iArr2;
                i5 = 1;
                i6 = 0;
            }
            iArr6 = iArr7;
        }
        int i16 = i6;
        System.arraycopy(iArr6, i16, iArr5, i16, length2);
        getactivenotifications.component1 = i16;
        while (getactivenotifications.component1 < iArr.length) {
            int i17 = $11 + 85;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                int i21 = $11 + 57;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i19];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 2968, 16 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (49871 - TextUtils.indexOf("", "")), 462826032, false, $$i(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i19 += 119;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i19];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 3);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 16, (char) (49871 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 462826032, false, $$i(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue2;
                    i19++;
                }
            }
            int i22 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i22;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i23 = getactivenotifications.ShareDataUIState;
            int i24 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27637), -1616366948, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public void setCouponHint(String str) {
        int i = 2 % 2;
        int i2 = component4 + 33;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.couponHint = str;
        int i5 = i3 + 29;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
    }

    public String getCouponNameOther() {
        int i = 2 % 2;
        int i2 = copy + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.couponNameOther;
        }
        throw null;
    }

    public void setCouponNameOther(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 103;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.couponNameOther = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCouponIcon() {
        int i = 2 % 2;
        int i2 = copy + 105;
        int i3 = i2 % 128;
        component4 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.couponIcon;
        int i4 = i3 + 17;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setCouponIcon(String str) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 43;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.couponIcon = str;
        int i5 = i2 + 43;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getCategory() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 71;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 117;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1);
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 3760, 24 - View.combineMeasuredStates(0, 0), c2, -1670574543, false, $$i(b2, (byte) (b2 | 39), b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
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
        try {
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            float f = 0.0f;
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7141 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, (char) (TextUtils.lastIndexOf("", '0') + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            if (component2) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2748, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, (char) (7644 - (ViewConfiguration.getPressedStateDuration() >> 16)), -327556343, false, $$i(b3, (byte) (b3 | 34), b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!component1) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i6 = $11 + 85;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i8 = $11 + 87;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 2748, 19 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 7644), -327556343, false, $$i(b4, (byte) (b4 | 34), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                f = 0.0f;
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

    public void setCategory(String str) {
        int i = 2 % 2;
        int i2 = component4 + 27;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.category = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getCouponType() {
        int i = 2 % 2;
        int i2 = copy + 75;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.couponType;
        int i4 = i3 + 99;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return str;
    }

    public void setCouponType(String str) {
        int i = 2 % 2;
        int i2 = component4 + 37;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.couponType = str;
        int i5 = i3 + 111;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCouponDesc() {
        int i = 2 % 2;
        int i2 = copy + 67;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.couponDesc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCouponDesc(String str) {
        int i = 2 % 2;
        int i2 = component4 + 9;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.couponDesc = str;
        int i5 = i3 + 27;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCouponDescOther() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.couponDescOther;
        int i4 = i3 + 71;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setCouponDescOther(String str) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 87;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.couponDescOther = str;
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        int i6 = i2 + 87;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String getUsageEntryUrl() {
        String str;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 81;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.usageEntryUrl;
            int i4 = 40 / 0;
        } else {
            str = this.usageEntryUrl;
        }
        int i5 = i2 + 41;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setUsageEntryUrl(String str) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 21;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.usageEntryUrl = str;
        int i5 = i2 + 9;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.status = str;
        int i5 = i2 + 61;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getThreshold() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 69;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.threshold;
        int i4 = i2 + 51;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    public void setThreshold(String str) {
        int i = 2 % 2;
        int i2 = copy + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.threshold = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDenomination() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 13;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.denomination;
        int i4 = i2 + 87;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    public void setDenomination(String str) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 17;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.denomination = str;
        int i5 = i2 + 65;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getDiscountRatio() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.discountRatio;
        int i5 = i2 + 113;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setDiscountRatio(String str) {
        int i = 2 % 2;
        int i2 = copy + 33;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.discountRatio = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMaxDiscountAmount() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 81;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.maxDiscountAmount;
        int i4 = i2 + 119;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setMaxDiscountAmount(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 69;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.maxDiscountAmount = str;
        int i5 = i2 + 107;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 35;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = component4 + 53;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.unit = str;
        int i5 = i3 + 99;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getUnitType() {
        int i = 2 % 2;
        int i2 = copy + 119;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 65;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUnitType(java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.model.entity.CouponBean.setUnitType(java.lang.String):void");
    }

    static {
        equals = 0;
        component3();
        component3 = new int[]{-1797474408, -1527183852, 893703877, 420972483, 1831477881, -1304336637, 891387359, -1159926386, -1435389216, -322013407, 1367926322, 1334839373, -1065799560, -511158758, 1111066501, -273744902, 2076688332, 815730307};
        int i = getAsAtTimestamp + 45;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        ShareDataUIState = new char[]{30299, 30286, 30292, 30282, 30281, 30291, 30222, 30277, 30309, 30275, 30276, 30295, 30287, 30325, 30284, 30293, 30285, 30280, 30314, 30331, 30278, 30308, 30288, 30279};
        copydefault = 321287736;
        component1 = true;
        component2 = true;
    }
}
