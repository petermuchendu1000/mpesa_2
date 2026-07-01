package com.huawei.digitalpayment.consumer.register.ui.activity;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.BasePinActivity;
import com.huawei.digitalpayment.consumer.login.R;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.io.encoding.Base64;

public class SetPinCreationPinActivity extends BasePinActivity<ActivityBasePinBinding, ViewModel> {
    private static final byte[] $$c = {102, -86, -98, TarHeader.LF_DIR};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {120, -46, -95, -23, -16, -2, 59, -63, 4, -19, 62, -55, -6, TarHeader.LF_LINK, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -55, -6, -20, 65, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -56, -11, -21, 72, -72, 9, -6, -6, -10, -3, 60, -69, -5, 7, -17, 13, -23, 7, -10, -3, 60, -72, 9, -15, -3, -8, 6, -15, 1, -7, -11, 71, -28, -35, -19, 13, -9, 35, -47, -4, 39, -51, -4, -7, Ascii.GS, -23, -16, -8, Ascii.FF, -18, -5, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -55, -15, -1, 3, -3, -5, -3, 47, -55, -21, 5, -17, 13, -17, SignedBytes.MAX_POWER_OF_TWO, -55, -19, -4, 62, -23, -51, -4, Ascii.RS, -37, 7, -5, Base64.padSymbol, -18, 10, -17};
    private static final int $$e = 243;
    private static final byte[] $$a = {106, -23, Ascii.FF, -128, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 79;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static char[] copydefault = {30271, 30258, 30264, 30254, 30253, 30263, 30450, 30249, 30412, 30265, 30267, 30259, 30247, 30411, 30252, 30431, 30248, 30250, 30408, 30260, 30446, 30441, 30447, 30444, 30440, 30266, 30439, 30442, 30436, 30270, 30443, 30437, 30451};
    private static int component1 = 321287836;
    private static boolean component2 = true;
    private static boolean ShareDataUIState = true;
    private static long component3 = -3780477796495014671L;
    private static int getRequestBeneficiariesState = 1386857713;
    private static char copy = 13906;

    private static String $$i(byte b2, byte b3, int i) {
        byte[] bArr = $$c;
        int i2 = b3 + 4;
        int i3 = b2 * 2;
        int i4 = 99 - i;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = (-i2) + i4;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            i4 = (-bArr[i7]) + i4;
            i2 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.$$a
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r6 = 99 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.d(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 84 - r8
            int r7 = r7 * 3
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.$$d
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r8
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-4)
            int r9 = r3 + 1
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.e(int, byte, int, java.lang.Object[]):void");
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        int i2 = component4 + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Bundle extras = getIntent().getExtras();
        extras.putString("creationPin", EncryptManager.INSTANCE.encrypt(str));
        RouteUtils.routeWithExecute(RoutePathConstants.SET_PIN_CONFIRM_PIN, extras);
        int i4 = getAsAtTimestamp + 55;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(R.string.onboarding_register_pin_title3), getString(R.string.onboarding_register_pin_title4), "", getString(R.string.onboarding_register_pin_button3));
        int i2 = getAsAtTimestamp + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    private static void c(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 4037;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 32;
                    char touchSlop = (char) (19181 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (b2 - 1);
                    String str$$i = $$i(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iLastIndexOf, touchSlop, 1912513118, false, str$$i, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iArgb = 7567 - Color.argb(i4, i4, i4, i4);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 11;
                    char c3 = (char) (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, fadingEdgeLength, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 2459, 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) Color.argb(i4, i4, i4, i4), 931716605, false, $$i(b4, b5, (byte) (-b5)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7567, 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) KeyEvent.keyCodeFromString(""), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) getRequestBeneficiariesState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copy) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
                i4 = 0;
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

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
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
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - Color.alpha(0), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -1670574543, false, $$i(b2, b3, (byte) (b3 & Ascii.US)), new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.MeasureSpec.getMode(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i4 = 689978476;
        float f = 0.0f;
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 2748, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 7644), -327556343, false, $$i(b4, b5, (byte) (b5 & Ascii.SUB)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i4 = 689978476;
                f = 0.0f;
            }
            String str = new String(cArr4);
            int i7 = $10 + 105;
            $11 = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (!component2) {
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
        int i8 = $10 + 71;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, (char) (7643 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -327556343, false, $$i(b6, b7, (byte) (b7 & Ascii.SUB)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r41) {
        /*
            Method dump skipped, instruction units count: 14920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinCreationPinActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }
}
