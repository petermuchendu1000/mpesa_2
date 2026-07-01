package com.huawei.digitalpayment.consumer.sfcui.profile;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityMyProfileBinding;
import com.huawei.digitalpayment.home.viewmodel.MyViewModel;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/MyProfileActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityMyProfileBinding;", "Lcom/huawei/digitalpayment/home/viewmodel/MyViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "title", "", "getLayoutId", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class MyProfileActivity extends Hilt_MyProfileActivity<ActivityMyProfileBinding, MyViewModel> {
    public static final int $stable = 0;
    private static int[] ShareDataUIState;
    private static char component1;
    private static char[] component2;
    private static char component3;
    private static char copydefault;
    private static int equals;
    private static char getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private static final byte[] $$l = {TarHeader.LF_BLK, -107, 59, -11};
    private static final int $$o = 46;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {Ascii.ETB, 124, -70, -17, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 67, -10, 4, 65, PSSSigner.TRAILER_IMPLICIT, 20, -17, 8, 3, 1, 4, 0, 67, -70, Ascii.SI, 6, -16, 9, 17, -4, 4, -11, Ascii.DLE, -9, -3, 3, Ascii.FF, -3, Ascii.FF, -3, 8, 4, -17, 7, -1, 70, -34, TarHeader.LF_NORMAL, -70, 13, -22, Ascii.FF, -4, 3, -10, 1, -7, Ascii.ETB, 1, 1, 7, -18, Ascii.VT, -6};
    private static final int $$t = 36;
    private static final byte[] $$d = {75, -35, 114, TarHeader.LF_CHR, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 102;
    private static int getShareableDataState = 1;
    private static int component4 = 0;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r7, byte r8, byte r9) {
        /*
            int r9 = 119 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.$$l
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.$$r(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.$$d
            int r6 = 99 - r6
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.i(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.$$s
            int r7 = r7 * 3
            int r7 = 99 - r7
            int r8 = r8 + 10
            int r9 = 56 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r7
            r7 = r6
        L27:
            int r7 = -r7
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + 2
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.k(int, int, int, java.lang.Object[]):void");
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 89;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) getAsAtTimestamp) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(getRequestBeneficiariesState)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - View.getDefaultSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 32, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23251), 592652048, false, $$r(b2, b3, (byte) (b3 | 8)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 845, 32 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23251), 592652048, false, $$r(b4, b5, (byte) (b5 | 8)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getTouchSlop() >> 8), 49 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void j(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int[] iArr2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ShareDataUIState;
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 4391, 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -309236339, false, $$r(b2, b3, (byte) (b3 | 13)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $10 + 11;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i5 = 684241640;
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
        int[] iArr6 = ShareDataUIState;
        if (iArr6 != null) {
            int i11 = $10 + 9;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 85;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[i6];
                        objArr3[i7] = Integer.valueOf(iArr6[i13]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 4391;
                            int modifierMetaStateMask = 36 - ((byte) KeyEvent.getModifierMetaStateMask());
                            char cRgb = (char) ((-16777216) - Color.rgb(i7, i7, i7));
                            byte b4 = (byte) i7;
                            byte b5 = b4;
                            i3 = length3;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, modifierMetaStateMask, cRgb, -309236339, false, $$r(b4, b5, (byte) (b5 | 13)), new Class[]{Integer.TYPE});
                        } else {
                            i3 = length3;
                        }
                        iArr7[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i13--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    i3 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr6[i13])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        iArr2 = iArr6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.indexOf((CharSequence) "", '0'), 37 - (ViewConfiguration.getTouchSlop() >> 8), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -309236339, false, $$r(b6, b7, (byte) (b7 | 13)), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i13] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i13++;
                    iArr6 = iArr2;
                }
                length3 = i3;
                i6 = 1;
                i7 = 0;
            }
            int i15 = $10 + 13;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            iArr6 = iArr7;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = $11 + 57;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                getactivenotifications.ShareDataUIState ^= iArr5[i17];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 2968, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, (char) (49870 - TextUtils.lastIndexOf("", '0', 0)), 462826032, false, $$r(b8, b9, (byte) (b9 | Ascii.SI)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i17++;
            }
            int i21 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i21;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i22 = getactivenotifications.ShareDataUIState;
            int i23 = getactivenotifications.component2;
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
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 24 - View.combineMeasuredStates(0, 0), (char) (TextUtils.getOffsetBefore("", 0) + 27637), -1616366948, false, $$r(b10, b11, (byte) (b11 | Ascii.FF)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r35, byte r36, char[] r37, java.lang.Object[] r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.g(int, byte, char[], java.lang.Object[]):void");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 14, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 63), new char[]{0, 21, AbstractJsonLexerKt.COMMA, '\f', 30, ')', '0', 5, ')', 27, 4, 20, CharUtils.CR, 30, '!', '\'', 13840, 13840}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        h(6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{48059, 37456, 29996, 40137, 50339, 60923}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 25, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 5), new char[]{0, 21, AbstractJsonLexerKt.COMMA, '\f', 30, ')', '0', 5, '-', 7, CharUtils.CR, 3, 11, '!', '#', Typography.amp, 23, ')', '$', 20, '#', 11, '\f', '%', '+', '0'}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 90, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32), new char[]{29, 25, 13861, 13861, '#', 19, '(', CharUtils.CR, 13863, 13863, '%', Typography.amp, 28, '.', '#', Typography.amp, 28, 20}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i2 = copy + 67;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6617, TextUtils.indexOf((CharSequence) "", '0') + 43, (char) (Process.myPid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) + 16, new char[]{60078, 29768, 29641, 46825, 39430, 12174, 33130, 43281, 53323, 59652, 13501, 45516, 25149, 21922, 17799, 47605, 45191, 29599, 37868, 54270, 7312, 32835, 7960, 36648, 54104, 9430, 27337, 8965, 2687, 3470, 31502, 16982, 9620, 45236, 5878, 25152, 44666, 12514, 35525, 306, 62835, 22297, 35359, 49187, 34075, 52589, 34167, 6556}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(ExpandableListView.getPackedPositionGroup(0L) + 64, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).codePointAt(0) + 23), new char[]{5, '-', 20, '\n', '.', 24, 13872, 13872, '\n', '-', 11, 27, 0, '\'', 13872, 13872, 24, 3, Typography.amp, 31, 3, '-', 3, 24, ' ', '!', '-', 19, Typography.amp, 28, Typography.amp, 21, 3, Typography.amp, 31, 25, '/', 5, 11, '\"', '!', ' ', 6, 11, '%', 17, 20, '\t', '-', 5, '-', 21, 30, ' ', '-', Typography.amp, Typography.amp, 14, 3, ' ', 18, 3, '\'', 0}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(64 - View.MeasureSpec.getMode(0), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8111), new char[]{3, '-', '!', '-', 7, ')', 2, 17, '\'', 28, 31, '\'', 31, '+', 17, 23, '\'', '!', 13858, 13858, 1, 31, 28, Typography.amp, JSONLexer.EOI, '.', Typography.amp, 14, '-', 19, 24, '-', '*', Typography.amp, 31, '.', '\f', '0', '!', Typography.amp, 28, '$', 1, ' ', '.', 3, 4, 31, '\b', '\"', '\'', 11, '\n', '0', 3, 31, '/', '#', Typography.amp, '\n', '\'', 21, 18, 30}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(Gravity.getAbsoluteGravity(0, 0) + 72, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 42), new char[]{CharUtils.CR, '#', Typography.amp, CharUtils.CR, 14, 20, 13820, 13820, '%', 14, ' ', 30, 24, '-', 23, 18, 7, ')', 13807, 13807, 22, ' ', 31, 25, CharUtils.CR, '0', '\b', '\n', '#', '/', '\'', '\"', '0', 14, '0', CharUtils.CR, 29, JSONLexer.EOI, AbstractJsonLexerKt.COMMA, 7, '0', 19, 15, 29, AbstractJsonLexerKt.COMMA, 7, ')', 5, '!', 28, 1, '\b', '-', 7, '$', 2, '#', 16, '(', '/', 27, '0', 6, 22, 4, 2, ')', JSONLexer.EOI, '#', 19, '0', 27}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, new char[]{26156, 10571, 14232, 63383, 38052, 25055}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(36 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{14868, 21056, 6044, 28872, 24345, 22444, 7667, 11765, 36611, 51427, 52200, 26167, 13335, 9115, 17190, 62226, 29794, 45346, 29803, 4596, 42565, 38513, 41543, 30295, 7960, 36648, 29607, 27187, 18692, 26725, 57439, 52570, 12047, 45402, 60392, 14669}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 57, (char) (Process.myTid() >> 22), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2404;
            int iIndexOf = 26 - TextUtils.indexOf("", "", 0);
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            Object[] objArr13 = new Object[1];
            i((byte) ($$e & TypedValues.PositionType.TYPE_PERCENT_HEIGHT), (byte) (-$$d[31]), r10[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4, iIndexOf, cRgb, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2405;
                int defaultSize = View.getDefaultSize(0, 0) + 26;
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$d;
                byte b2 = (byte) (-bArr[31]);
                byte b3 = (byte) (-bArr[8]);
                Object[] objArr14 = new Object[1];
                i((byte) 93, b2, b3, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, defaultSize, scrollBarSize, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
            c2 = 2;
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 16, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 41), new char[]{21, AbstractJsonLexerKt.COMMA, 21, '0', 1, ')', 0, 21, '\"', 5, 1, 19, 27, '0', '$', '/'}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            h(16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{43919, 43204, 16429, 19107, 55135, 25580, 39983, 3242, 6654, 2699, 54335, 59582, 39045, 23184, 7504, 21913}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = copy + 33;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -556214979};
                Object[] objArr18 = new Object[1];
                g((Process.myTid() >> 22) + 26, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 6), new char[]{0, 21, AbstractJsonLexerKt.COMMA, '\f', 30, ')', '0', 5, '-', 7, CharUtils.CR, 3, 11, '!', '#', Typography.amp, 23, ')', '$', 20, '#', 11, '\f', '%', '+', '0'}, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                g(KeyEvent.keyCodeFromString("") + 18, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32), new char[]{29, 25, 13861, 13861, '#', 19, '(', CharUtils.CR, 13863, 13863, '%', Typography.amp, 28, '.', '#', Typography.amp, 28, 20}, objArr19);
                Object[] objArr20 = new Object[1];
                j(((Context) cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 130, new int[]{1963916805, 951495659, 883423845, 445132320, -878300397, -756313300, 54756258, -308605381, 2095915965, -1686731058, 253879579, -462758689, -1960448416, 1273137552, 1170249878, -1357456206, -1520515187, -2119460273, -710796119, 853717804, 1039426458, 1806715672, -150231756, -588560605, 1334302884, -963376331, 1112267131, 2056246819, 1314435618, -1797718358, 1832753999, -1880439043, -174283022, 2013664111, -2072389715, 1960069072, 977443293, 1410944275, 1365244978, 39659770, -348959831, -167315402, 1305425605, 600720491, -1592310803, 1736477340, 1352374342, -1156633136, -1695064001, -1453125721, -1074375785, -672678577, 1245359127, 1260762358, -64566740, -1859680601, 1217808408, 631180335, 1323102593, 3227282, -931124197, 533832794, 1182478461, 500377657, -921085453, -1598587519, 1259835985, 827407314, 604195931, -1289729101, -216518147, 1791300177, 1111901312, -1529226990, -714333426, -401405437, -480846441, 2094026949, 379511968, -1072570969}, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                byte b4 = $$s[23];
                byte b5 = b4;
                Object[] objArr21 = new Object[1];
                k(b4, b5, (byte) (b5 | TarHeader.LF_BLK), objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int gidForName = Process.getGidForName("") + 2406;
                    int size = 26 - View.MeasureSpec.getSize(0);
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr2 = $$d;
                    Object[] objArr22 = new Object[1];
                    i((byte) 93, (byte) (-bArr2[31]), (byte) (-bArr2[8]), objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, size, doubleTapTimeout, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) - 93, new char[]{50643, 47773, 8938, 26260, 37441, 16986, 9677, 22656, 35180, 33657, 64909, 41829, 14844, 64877, 932, 23691, 35767, 62316, 49948, 16416, 44771, 61576}, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    g(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 96), new char[]{')', '%', '-', 7, 19, ')', '*', JSONLexer.EOI, '#', '/', '%', '#', '$', AbstractJsonLexerKt.COMMA, 13922}, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iAlpha = 2405 - Color.alpha(0);
                        int iAlpha2 = 26 - Color.alpha(0);
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        byte[] bArr3 = $$d;
                        Object[] objArr25 = new Object[1];
                        i((byte) 84, bArr3[33], bArr3[38], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, iAlpha2, deadChar, -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 2405;
                        int i7 = 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b6 = (byte) ($$e & TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                        byte[] bArr4 = $$d;
                        byte b7 = (byte) (-bArr4[31]);
                        byte b8 = bArr4[33];
                        Object[] objArr26 = new Object[1];
                        i(b6, b7, b8, objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, i7, c3, -2047739879, false, (String) objArr26[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i8 = copy + 123;
                    component4 = i8 % 128;
                    c2 = 2;
                    int i9 = i8 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[c2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i12 = copy + 17;
            component4 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr27 = {-1471549738, Long.valueOf(j4), arrayList, null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "") + 56, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                byte b9 = $$s[23];
                byte b10 = b9;
                Object[] objArr28 = new Object[1];
                k(b9, b10, (byte) (b10 | TarHeader.LF_BLK), objArr28);
                cls7.getMethod((String) objArr28[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr27);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        initToolbar(getString(com.huawei.digitalpayment.consumer.sfc.R.string.my_profile));
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(com.huawei.digitalpayment.consumer.sfc.R.id.fl_fragment_container, new MyProfileFragment()).commit();
            int i14 = copy + 3;
            component4 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainerInitToolbar = super.initToolbar(com.huawei.digitalpayment.consumer.sfc.R.layout.sfc_grey_toolbar_layout);
        Intrinsics.checkNotNullExpressionValue(toolbarContainerInitToolbar, "");
        if (toolbarContainerInitToolbar.tvTitle != null) {
            int i2 = copy + 69;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                TextView textView = toolbarContainerInitToolbar.tvTitle;
                Intrinsics.checkNotNull(textView);
                textView.setText(getString(com.huawei.digitalpayment.consumer.sfc.R.string.my_profile));
            } else {
                TextView textView2 = toolbarContainerInitToolbar.tvTitle;
                Intrinsics.checkNotNull(textView2);
                textView2.setText(getString(com.huawei.digitalpayment.consumer.sfc.R.string.my_profile));
                throw null;
            }
        }
        if (toolbarContainerInitToolbar.ivStart != null) {
            ImageView imageView = toolbarContainerInitToolbar.ivStart;
            Intrinsics.checkNotNull(imageView);
            imageView.setImageResource(com.huawei.digitalpayment.consumer.sfc.R.drawable.ic_sfc_back);
            ImageView imageView2 = toolbarContainerInitToolbar.ivStart;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener() {
                private static int component2 = 0;
                private static int copydefault = 1;

                @Override
                public final void onClick(View view) {
                    int i3 = 2 % 2;
                    int i4 = component2 + 49;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        MyProfileActivity.$r8$lambda$xgKrDAVsgGNSbLXYhVXcrjgcza4(this.f$0, view);
                        int i5 = 43 / 0;
                    } else {
                        MyProfileActivity.$r8$lambda$xgKrDAVsgGNSbLXYhVXcrjgcza4(this.f$0, view);
                    }
                    int i6 = copydefault + 35;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                }
            });
        }
        int i3 = copy + 117;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final void initToolbar$lambda$0(MyProfileActivity myProfileActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 75;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(myProfileActivity, "");
            myProfileActivity.finish();
        } else {
            Intrinsics.checkNotNullParameter(myProfileActivity, "");
            myProfileActivity.finish();
            int i3 = 19 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component4 + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.sfc.R.layout.activity_my_profile;
        int i5 = component4 + 113;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = component4 + 83;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 40), new char[]{0, 21, AbstractJsonLexerKt.COMMA, '\f', 30, ')', '0', 5, '-', 7, CharUtils.CR, 3, 11, '!', '#', Typography.amp, 23, ')', '$', 20, '#', 11, '\f', '%', '+', '0'}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952810_res_0x7f1304aa).substring(9, 10).codePointAt(0) - 14, (byte) (61 - (ViewConfiguration.getJumpTapTimeout() >> 16)), new char[]{29, 25, 13861, 13861, '#', 19, '(', CharUtils.CR, 13863, 13863, '%', Typography.amp, 28, '.', '#', Typography.amp, 28, 20}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = copy + 113;
                component4 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            int i6 = copy + 121;
            component4 = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getPressedStateDuration() >> 16), 42 - (Process.myPid() >> 22), (char) (ViewConfiguration.getTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.green(0), TextUtils.indexOf("", "", 0) + 56, (char) ExpandableListView.getPackedPositionGroup(0L), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - ExpandableListView.getPackedPositionGroup(0L), 42 - TextUtils.getTrimmedLength(""), (char) Gravity.getAbsoluteGravity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 6563, (-16777160) - Color.rgb(0, 0, 0), (char) TextUtils.getOffsetAfter("", 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                int i7 = copy + 109;
                component4 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i9 = copy + 51;
        component4 = i9 % 128;
        int i10 = i9 % 2;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r44) {
        /*
            Method dump skipped, instruction units count: 14794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$xgKrDAVsgGNSbLXYhVXcrjgcza4(MyProfileActivity myProfileActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 39;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m11648instrumented$0$initToolbar$LjavalangStringV(myProfileActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        equals = 0;
        copydefault();
        component1();
        int i = getShareableDataState + 69;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    private static void m11648instrumented$0$initToolbar$LjavalangStringV(MyProfileActivity myProfileActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initToolbar$lambda$0(myProfileActivity, view);
                Callback.onClick_exit();
            } else {
                initToolbar$lambda$0(myProfileActivity, view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 5;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = copy + 119;
        component4 = i2 % 128;
        int[] iArr = {1813256081, 77889373, -1987107102, 1944172237, -465475976, -1312010110, -1892582271, -1910370428, 715907330, 988922525, -1588602813, -1072351890, -1317498560, 1398541361, -737452342, -1486542940, -925395644, -1580586043};
        if (i2 % 2 == 0) {
            ShareDataUIState = iArr;
            return;
        }
        ShareDataUIState = iArr;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = new char[]{12824, 1967, 12829, 1970, 1977, 2003, 1966, 2024, 2033, 2034, 2032, 12831, 1985, 1969, 2030, 2041, 1973, 1971, 2000, 1978, 2035, 2002, 2037, 2026, 2018, 1972, 12818, 2038, 12827, 1975, 12828, 1976, 2019, 2023, 2031, 1974, 2028, 2025, 2022, 2004, 2021, 2036, 2017, 2029, 12819, 1968, 12830, 2020, 12825};
        component3 = (char) 12829;
        component1 = (char) 16059;
        copydefault = (char) 6326;
        getAsAtTimestamp = (char) 63238;
        getRequestBeneficiariesState = (char) 14936;
    }
}
