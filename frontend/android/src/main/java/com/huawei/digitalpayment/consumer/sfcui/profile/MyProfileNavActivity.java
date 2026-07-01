package com.huawei.digitalpayment.consumer.sfcui.profile;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.resp.SettingItems;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityMyProfileNavBinding;
import com.huawei.digitalpayment.consumer.sfcui.profile.support.SupportBean;
import com.huawei.digitalpayment.home.viewmodel.MyViewModel;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.cancel;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010J\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0014J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/MyProfileNavActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityMyProfileNavBinding;", "Lcom/huawei/digitalpayment/home/viewmodel/MyViewModel;", "<init>", "()V", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "navController", "Landroidx/navigation/NavController;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "title", "", "initView", "getLayoutId", "", "navigateToFAQs", "navigateToChangePin", "navigateToCreatePin", "oldPin", "navigateToConfirmPin", "newPin", "onBackPressed", "onDestroy", "goWebFragment", "support", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportBean;", "goTermsFragment", "isTransparentView", "", "finish", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public class MyProfileNavActivity extends Hilt_MyProfileNavActivity<ActivityMyProfileNavBinding, MyViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static long component3;
    private static int component4;
    private static boolean copy;
    private static char copydefault;
    private static boolean equals;
    private static int getAsAtTimestamp;
    private NavController navController;
    private NavHostFragment navHostFragment;
    private static final byte[] $$l = {65, -53, 110, -39};
    private static final int $$o = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {8, -40, 43, -43, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -64, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -62, 9, -62, 71, -10, -1, 5, 20, -8, Ascii.DLE, -14, Ascii.SYN, -71, 62, 8, 9, -12, Ascii.DLE, -1, -10, Ascii.SO, -59, 68, 4, -8, Ascii.DLE, -14, Ascii.SYN, -2, 6, 4, -66, 59, 9, 6, Ascii.VT, -19, 4, 13, -4, -52, Ascii.ESC, 41, 6, Ascii.VT, -19, 4, 13, -4, -14, Ascii.DLE, 13, -3, -11, 20, 4, 6, -4, -62, 66, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -63};
    private static final int $$t = 229;
    private static final byte[] $$d = {81, 99, 107, 124, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 223;
    private static int getShareableDataState = 0;
    private static int getSponsorBeneficiariesState = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.$$l
            int r6 = r6 + 68
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.$$r(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.$$d
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.i(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.$$s
            int r8 = r8 + 4
            int r9 = r9 * 6
            int r9 = r9 + 99
            int r7 = r7 * 60
            int r7 = 70 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2c
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r8 = r8 + r3
            int r8 = r8 + (-3)
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.k(int, short, int, java.lang.Object[]):void");
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 47;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7032, 34 - TextUtils.getOffsetBefore("", 0), (char) (63440 - TextUtils.getTrimmedLength("")), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1390, 17 - ExpandableListView.getPackedPositionChild(0L), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51269), -1883291598, false, $$r((byte) ($$o & 103), b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 97;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 4;
                }
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

    private static void j(char c2, char[] cArr, int i, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $10 + 101;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4037, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, (char) (19181 - Gravity.getAbsoluteGravity(0, 0)), 1912513118, false, $$r((byte) 31, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 7567, 11 - (ViewConfiguration.getTouchSlop() >> 8), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 2460, 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 931716605, false, $$r((byte) 30, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7566, (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, (char) View.getDefaultSize(0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i6 = $10 + 29;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
                i2 = 2;
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

    private static void h(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component1;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 77;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i2]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - Color.green(i4), (char) View.MeasureSpec.getMode(i4), -1670574543, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component4)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7140, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i6 = 689978476;
            if (equals) {
                int i7 = $10 + 19;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 5;
                        byte b5 = (byte) (b4 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 2749, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7644), -327556343, false, $$r(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                String str = new String(cArr4);
                int i9 = $10 + 91;
                $11 = i9 % 128;
                if (i9 % 2 != 0) {
                    objArr[0] = str;
                    return;
                } else {
                    int i10 = 25 / 0;
                    objArr[0] = str;
                    return;
                }
            }
            if (!copy) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i11 = $10 + 95;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 % 3;
                }
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i6);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 5;
                    byte b7 = (byte) (b6 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 2748, (ViewConfiguration.getEdgeSlop() >> 16) + 19, (char) (7645 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -327556343, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i6 = 689978476;
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

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(0) - 110, new char[]{28240, 28209, 56684, 49312, 33808, 8180, 29408, 5296, 2679, 24671, 54952, 28836, 42671, 64701, 47674, 52322, 17146, 22761, 7743, 10143, 65283, 14125}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        h(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) + 95, new byte[]{-123, -124, -125, -126, -127}, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                h(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, new byte[]{-121, -119, -124, -114, -122, -115, -124, -108, -117, -117, -116, -114, -121, -110, -120, -120, -109, -115}, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = getSponsorBeneficiariesState + 67;
                getShareableDataState = i2 % 128;
                int i3 = i2 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = getShareableDataState + 121;
                getSponsorBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952793_res_0x7f130499).substring(6, 7).length() + 126, new byte[]{-100, -98, -103, -98, -99, -102, -98, -104, -122, -115, -107, -96, -106, -102, -122, -110, -105, -105, -122, -100, -98, -105, -97, -98, -110, -104, -101, -122, -99, -99, -106, -100, -104, -110, -101, -107, -107, -104, -115, -102, -110, -115, -103, -104, -105, -106, -107, -122}, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(ExpandableListView.getPackedPositionGroup(0L), new char[]{32063, 32013, 41969, 3088, 64135, 46908, 48647, 48187, 6471, 7839, 6687, 55329, 46493, 33333, 30357, 25806, 20958, 9773, 53903, 36689, 60460, 18931, 20332, 11016, 34919, 60909, 43948, 46993, 9399, 4432, 1952, 54249, 49393, 46275, 31802, 32368, 24399, 55451, 55319, 39464, 64466, 31759, 13453, 9953, 38796, 57387, 37085, 16651, 12865, 3054, 3353, 60739, 52795, 44977, 27125, 2504, 27296, 54131, 50618, 38362, 1785, 30400, 8765, 12322, 40244, 39554, 40570, 23659}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 111, new char[]{50893, 50941, 30042, 37538, 11310, 55115, 8382, 56345, 41652, 51254, 34044, 47104, 3691, 21659, 59509, 1259, 59938, 61568, 19563, 61223, 22408, 40715, 53715, 19240, 13207, 15127, 13590, 55267, 40777, 51196, 39232, 45982, 31569, 25187, 57997, 7683, 58557, 3646, 18085, 64013, 16500, 43684, 43574, 18064, 11306, 13966, 3695, 8570, 35301, 56649, 37804, 36198, 30108, 31007, 63301, 27108, 53588, 1488, 23390, 62967, 48476, 41021, 48270, 20575, 9923, 19492, 203, 15430}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 108, new char[]{31605, 31517, 46416, 12235, 60470, 19750, 40347, 18016, 8014, 2096, 14728, 8823, 46035, 38087, 21831, 40663, 22430, 12508, 61699, 29981, 60004, 24404, 27837, 53570, 36393, 64285, 34852, 19930, 8939, 2022, 9335, 10674, 50920, 41531, 24483, 33899, 22868, 52849, 64475, 24702, 64922, 27327, 5894, 56554, 37313, 63169, 45902, 47957, 13324, 7432, 11922, 5958, 51318, 47437, 18978, 62367, 27836, 50586, 58990, 28631, 236, 24636, 440, 51813, 39742, 35950, 48568, 42558, 16327, 10477, 55562, 742, 54232, 46308, 30035, 65195}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-101, -118, -98, -106, -118, -107}, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, new byte[]{-102, -103, -98, -122, -104, -107, -98, -97, -110, -98, -110, -104, -95, -100, -102, -98, -122, -95, -104, -99, -99, -98, -95, -102, -97, -102, -102, -95, -104, -100, -101, -98, -104, -122, -106, -123}, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6562, (ViewConfiguration.getWindowTouchSlop() >> 8) + 56, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i6 = getShareableDataState + 61;
                    getSponsorBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
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
            int i8 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2404;
            int maximumFlingVelocity = 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            Object[] objArr13 = new Object[1];
            i((byte) (-$$d[31]), r0[33], r0[86], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i8, maximumFlingVelocity, maxKeyCode, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i9 = getSponsorBeneficiariesState + 81;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2405;
                int iMyTid = 26 - (Process.myTid() >> 22);
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr = $$d;
                byte b2 = bArr[31];
                Object[] objArr14 = new Object[1];
                i((byte) (-b2), (byte) (-bArr[8]), (byte) (-b2), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iMyTid, minimumFlingVelocity, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() + 123, new byte[]{-127, -110, -114, -91, -126, -92, -118, -93, -121, -122, -108, -118, -122, -113, -122, -94}, null, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{17553, 17656, 64902, 7727, 42224, 26961, 44142, 25097, 8365, 16565, 2103, 1622, 35913, 56389, 25832, 47871, 26634, 30723, 49335, 20794}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 376497938};
                Object[] objArr18 = new Object[1];
                h(null, (Process.myPid() >> 22) + 127, new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, null, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-121, -119, -124, -114, -122, -115, -124, -108, -117, -117, -116, -114, -121, -110, -120, -120, -109, -115}, null, objArr19);
                Method method = cls4.getMethod((String) objArr19[0], new Class[0]);
                Object[] objArr20 = new Object[1];
                j((char) (43152 - (ViewConfiguration.getScrollBarSize() >> 8)), new char[]{35713, 44754, 61508, 34666}, ((Context) method.invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() - 1, new char[]{55967, 38072, 64625, 39271, 45833, 3144, 58901, 47018, 16783, 53912, 7234, 6376, 22784, 3963, 46703, 2081, 44821, 34888, 20332, 62128, 34448, 1565, 1829, 16742, 49582, 50411, 5850, 61040, 39559, 13662, 2693, 31537, 57264, 2766, 51176, 31138, 28975, 25011, 60972, 44920, 41404, 16659, 59409, 34929, 21839, 20267, 47177, 11221, 31382, 60888, 24934, 58272, 1591, 4308, 33146, 40906, 45502, 45110, 58139, 51981, 62415, 21193, 39499, 29128, 10740, 20363, 39085, 49036, 35542, 40590}, new char[]{4701, 43335, 36934, 46504}, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                byte[] bArr2 = $$s;
                byte b3 = bArr2[5];
                byte b4 = bArr2[26];
                Object[] objArr21 = new Object[1];
                k(b3, b4, (byte) (b4 + 1), objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2406;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                    char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[31];
                    Object[] objArr22 = new Object[1];
                    i((byte) (-b5), (byte) (-bArr3[8]), (byte) (-b5), objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, absoluteGravity, absoluteGravity2, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    g((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{55076, 55109, 3385, 58461, 21573, 58145, 22045, 59493, 45827, 45066, 62037, 35953, 8155, 11496, 40647, 12468, 64389, 34976, 15061, 56138, 18025, 59208, 42869, 32536, 8751, 17192}, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) - 32, new char[]{38716, 38745, 56529, 52208, 34223, 23176, 31157, 20942, 62215, 25070, 56824, 13732, 24521, 64786, 45352, 35130, 48013, 22870, 5481}, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2405;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                        char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        byte[] bArr4 = $$d;
                        Object[] objArr25 = new Object[1];
                        i(bArr4[33], bArr4[38], bArr4[40], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, tapTimeout, c2, -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2404;
                        int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        char cMyPid = (char) (Process.myPid() >> 22);
                        Object[] objArr26 = new Object[1];
                        i((byte) (-$$d[31]), r2[33], r2[86], objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i11, longPressTimeout, cMyPid, -2047739879, false, (String) objArr26[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 6618, 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i14 = getSponsorBeneficiariesState + 63;
            getShareableDataState = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr27 = {-2021004979, Long.valueOf(j4), arrayList, null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getLongPressTimeout() >> 16), 57 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0));
                byte b6 = $$s[5];
                Object[] objArr28 = new Object[1];
                k(b6, r1[0], (byte) (b6 - 1), objArr28);
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
        initView();
    }

    private final void initView() {
        int i = 2 % 2;
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(com.huawei.digitalpayment.consumer.sfc.R.id.nav_host_fragment);
        Intrinsics.checkNotNull(fragmentFindFragmentById, "");
        NavHostFragment navHostFragment = (NavHostFragment) fragmentFindFragmentById;
        this.navHostFragment = navHostFragment;
        NavController navController = null;
        if (navHostFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            navHostFragment = null;
        }
        this.navController = navHostFragment.getNavController();
        ((ActivityMyProfileNavBinding) this.binding).navHostFragment.animate().alpha(1.0f).setDuration(200L).start();
        ((ActivityMyProfileNavBinding) this.binding).navHostFragment.setClickable(true);
        String stringExtra = getIntent().getStringExtra("settingType");
        if (Intrinsics.areEqual(stringExtra, SettingItems.INSTANCE.getGET_HELP().getSecond())) {
            NavController navController2 = this.navController;
            if (navController2 == null) {
                int i2 = getSponsorBeneficiariesState + 55;
                getShareableDataState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                navController = navController2;
            }
            navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_emptyFragment_to_supportFragment);
            return;
        }
        if (Intrinsics.areEqual(stringExtra, SettingItems.INSTANCE.getABOUT_APP().getSecond())) {
            NavController navController3 = this.navController;
            if (navController3 == null) {
                int i4 = getShareableDataState + 27;
                getSponsorBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                navController = navController3;
            }
            navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_emptyFragment_to_aboutFragment);
            return;
        }
        if (Intrinsics.areEqual(stringExtra, SettingItems.INSTANCE.getGET_PUK().getSecond())) {
            NavController navController4 = this.navController;
            if (navController4 == null) {
                int i6 = getSponsorBeneficiariesState + 31;
                getShareableDataState = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                navController = navController4;
            }
            navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_emptyFragment_to_pukFragment);
            return;
        }
        if (Intrinsics.areEqual(stringExtra, SettingItems.INSTANCE.getSECURITY_CENTER().getSecond())) {
            NavController navController5 = this.navController;
            if (navController5 == null) {
                int i8 = getSponsorBeneficiariesState + 119;
                getShareableDataState = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                navController = navController5;
            }
            navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_emptyFragment_to_securityCenterFragment);
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 37;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.sfc.R.layout.activity_my_profile_nav;
        int i5 = getShareableDataState + 55;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void navigateToFAQs() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 113;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        NavController navController = this.navController;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            navController = null;
        }
        navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_supportFragment_to_faqsFragmnet);
        int i4 = getShareableDataState + 59;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public final void navigateToChangePin() {
        int i = 2 % 2;
        NavController navController = this.navController;
        if (navController == null) {
            int i2 = getShareableDataState + 85;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            navController = null;
        }
        navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_securityCenterFragment_to_changePinVerifyOldPinFragment);
        int i5 = getSponsorBeneficiariesState + 35;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void navigateToCreatePin(String oldPin) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 25;
        getShareableDataState = i2 % 128;
        NavController navController = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(oldPin, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(oldPin, "");
        NavController navController2 = this.navController;
        if (navController2 == null) {
            int i3 = getSponsorBeneficiariesState + 61;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            navController = navController2;
        }
        navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_changePinVerifyOldPinFragment_to_changePinCreateNewPinFragment, BundleKt.bundleOf(TuplesKt.to("oldPin", oldPin)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void navigateToConfirmPin(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            androidx.navigation.NavController r1 = r5.navController
            r4 = 75
            int r4 = r4 / r2
            if (r1 != 0) goto L3e
            goto L29
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            androidx.navigation.NavController r1 = r5.navController
            if (r1 != 0) goto L3e
        L29:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState
            int r1 = r1 + 75
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState = r4
            int r1 = r1 % r0
            r4 = 0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            if (r1 != 0) goto L3a
            r1 = r4
            goto L3e
        L3a:
            r4.hashCode()
            throw r4
        L3e:
            int r3 = com.huawei.digitalpayment.consumer.sfc.R.id.action_changePinCreateNewPinFragment_to_changePinConfirmNewPinFragment
            java.lang.String r4 = "oldPin"
            kotlin.Pair r6 = kotlin.TuplesKt.to(r4, r6)
            java.lang.String r4 = "creationPin"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r4, r7)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r2] = r6
            r6 = 1
            r0[r6] = r7
            android.os.Bundle r6 = androidx.core.os.BundleKt.bundleOf(r0)
            r1.navigate(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.navigateToConfirmPin(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[PHI: r0
  0x0042: PHI (r0v4 androidx.navigation.NavController) = (r0v1 androidx.navigation.NavController), (r0v5 androidx.navigation.NavController) binds: [B:15:0x003c, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState
            int r2 = r1 + 113
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L62
            androidx.navigation.NavController r2 = r5.navController
            java.lang.String r4 = ""
            if (r2 != 0) goto L20
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r2 = r3
        L20:
            boolean r1 = r2.popBackStack()
            if (r1 == 0) goto L55
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3a
            androidx.navigation.NavController r0 = r5.navController
            r1 = 20
            int r1 = r1 / 0
            if (r0 != 0) goto L42
            goto L3e
        L3a:
            androidx.navigation.NavController r0 = r5.navController
            if (r0 != 0) goto L42
        L3e:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L43
        L42:
            r3 = r0
        L43:
            androidx.navigation.NavDestination r0 = r3.getCurrentDestination()
            if (r0 == 0) goto L51
            int r0 = r0.getId()
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.emptyFragment
            if (r0 != r1) goto L54
        L51:
            r5.finish()
        L54:
            return
        L55:
            super.onBackPressed()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            return
        L62:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.onBackPressed():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            super.onDestroy()
            androidx.navigation.NavController r1 = r3.navController
            r2 = 66
            int r2 = r2 / 0
            if (r1 != 0) goto L3d
            goto L21
        L1a:
            super.onDestroy()
            androidx.navigation.NavController r1 = r3.navController
            if (r1 != 0) goto L3d
        L21:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getSponsorBeneficiariesState
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.getShareableDataState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3c
            r1 = 5
            int r1 = r1 % r0
        L3c:
            r1 = 0
        L3d:
            r1.navigateUp()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.onDestroy():void");
    }

    public void goWebFragment(SupportBean support) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(support, "");
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("support", support);
        NavController navController = this.navController;
        if (navController == null) {
            int i2 = getShareableDataState + 9;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = getSponsorBeneficiariesState + 115;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            navController = null;
        }
        navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_aboutFragment_to_aboutWebFragment, bundle);
    }

    public void goTermsFragment(SupportBean support) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(support, "");
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("support", support);
        NavController navController = this.navController;
        if (navController == null) {
            int i2 = getShareableDataState + 51;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                int i4 = 57 / 0;
            }
            int i5 = getSponsorBeneficiariesState + 107;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            navController = null;
        }
        navController.navigate(com.huawei.digitalpayment.consumer.sfc.R.id.action_aboutFragment_to_aboutTermsFragment, bundle);
    }

    @Override
    public void finish() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 57;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getShareableDataState + 79;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r39) {
        /*
            Method dump skipped, instruction units count: 14420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.MyProfileNavActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        copydefault();
        int i = getRequestBeneficiariesState + 79;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 77;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean isTransparentView() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 59;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return true;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 65;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 125;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        component3 = 5540548210243358576L;
        ShareDataUIState = 1386857713;
        copydefault = (char) 50417;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 69;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        component2 = -235269718971419261L;
        component1 = new char[]{30314, 30302, 30210, 30318, 30323, 30326, 30309, 30305, 30308, 30245, 30311, 30230, 30320, 30307, 30301, 30211, 30319, 30322, 30306, 30315, 30238, 30246, 30317, 30237, 30236, 30247, 30240, 30321, 30242, 30243, 30239, 30241, 30250, 30313, 30316, 30208, 30304};
        component4 = 321287895;
        copy = true;
        equals = true;
    }
}
