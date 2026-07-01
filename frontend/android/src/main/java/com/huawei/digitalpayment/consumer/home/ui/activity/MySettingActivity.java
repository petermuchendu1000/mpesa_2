package com.huawei.digitalpayment.consumer.home.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ActivityMySettingBinding;
import com.huawei.digitalpayment.home.viewmodel.MyViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/activity/MySettingActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/ActivityMySettingBinding;", "Lcom/huawei/digitalpayment/home/viewmodel/MyViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "initToolbar", "title", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class MySettingActivity extends Hilt_MySettingActivity<ActivityMySettingBinding, MyViewModel> {
    public static final int $stable = 0;
    private static char ShareDataUIState;
    private static char component1;
    private static int component2;
    private static long component3;
    private static char[] copydefault;
    private static int getRequestBeneficiariesState;
    private static final byte[] $$l = {81, 99, 107, 124};
    private static final int $$o = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {19, TarHeader.LF_SYMLINK, -9, 119, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -67, 8, -23, Ascii.VT, -17, 5, 4, -15, 58, -63, -9, -10, Ascii.VT, -17, 0, 9, -15, 58, -38, -21, -21, Ascii.VT, -6, -11, 7, -5, -14, 3, Ascii.SO, -33, Ascii.VT, -21, -5, 10, Ascii.CAN, -41, -10, 47, -53, -4, 13, -28, 81, -17, -16, -2, -7, -3, -3, 5, -13, -10, 63, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -61, -10, -10, 65, -57, -16, -2, -4, -6, -3, 60, -63, -9, -10, Ascii.VT, -17, 0, 9, -15, 58, -80, -4, Ascii.VT, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT};
    private static final int $$k = 176;
    private static final byte[] $$d = {Ascii.EM, 43, 92, -56, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 206;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r8 = r8 + 98
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.$$l
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.$$r(int, short, short):java.lang.String");
    }

    private static void i(short s, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 103 - (s * 2);
        int i3 = b2 + 4;
        byte[] bArr2 = new byte[i + 4];
        int i4 = i + 3;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i4 + i2) - 8;
        }
        while (true) {
            i5++;
            i3++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + bArr[i3]) - 8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 124 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.$$j
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-4)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.j(short, int, int, java.lang.Object[]):void");
    }

    private static void g(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i3 = $11 + 55;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) ($$o - 5);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19181), 1912513118, false, $$r(b2, b3, (byte) (-b3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7568, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, (char) Color.red(0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) ($$o - 5);
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2458 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, (char) Drawable.resolveOpacity(0, 0), 931716605, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - ExpandableListView.getPackedPositionGroup(0L), 11 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i5 = $10 + 97;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_my_setting;
        int i5 = equals + 43;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void h(int i, byte b2, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - ExpandableListView.getPackedPositionType(j), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, (char) (MotionEvent.axisFromString("") + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c3 = 6;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getPressedStateDuration() >> 16), 15 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        char c4 = 3;
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i5 = $11 + 93;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    c2 = c3;
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[c3] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[c4] = cancelall;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int iCombineMeasuredStates = 7117 - View.combineMeasuredStates(0, 0);
                        int i7 = 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[c4] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[c3] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, i7, cKeyCodeFromString, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[5] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[c4] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2944;
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 24;
                            char mirror = (char) (AndroidCharacter.getMirror('0') + 27589);
                            byte b3 = (byte) ($$o - 5);
                            byte b4 = (byte) (b3 - 1);
                            String str$$r = $$r(b3, b4, (byte) (b4 & Ascii.NAK));
                            c2 = 6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, packedPositionGroup, mirror, 794909189, false, str$$r, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i8 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i8];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i9 = $10 + 37;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                c3 = c2;
                c4 = 3;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10;
            int i17 = i16 + 29;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            i15++;
            int i19 = i16 + 41;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 3 / 3;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(new char[]{50937, 14622, 42597, 54436, 45464, 21329, 240, 61374, 18206, 46569, 15445, 35056, 64981, 44660, 53547, 33550, 35293, 58144, 56005, 35289, 12674, 49071, 8901, 55185, 54794, 50697}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() - 1, new char[]{38180, 48662, 1399, 54719}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() + 6634), new char[]{41665, 58898, 61120, 21017}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(18 - Gravity.getAbsoluteGravity(0, 0), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 58), new char[]{23, '-', 13887, 13887, 24, 4, '-', '!', 13889, 13889, 23, 21, 27, '-', '0', JSONLexer.EOI, 17, 1}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getAsAtTimestamp + 27;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = equals + 103;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 6618, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.alpha(0) + 56, (char) (Process.myTid() >> 22), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r45) {
        /*
            Method dump skipped, instruction units count: 14874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.MySettingActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getRequestBeneficiariesState = 0;
        component1();
        int i = component4 + 15;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = equals + 115;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 55;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 85;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        component3 = 2176942927144505813L;
        component2 = 1386857713;
        component1 = (char) 50417;
        copydefault = new char[]{2027, 1972, 1967, 2030, 2016, 1973, 2038, 1050, 1054, 1051, 1052, 1055, 1987, 2033, 1971, 2031, 2024, 1049, 1969, 1968, 2029, 2003, 2028, 1974, 2019, 2021, 2032, 2025, 2034, 1977, 2022, 1985, 1975, 1048, 1966, 2041, 2005, 2023, 2018, 1053, 1970, 1978, 1976, 2035, 2037, 2020, 1965, 2036, 2017};
        ShareDataUIState = (char) 12829;
    }
}
