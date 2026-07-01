package com.huawei.digitalpayment.consumer.home.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.home.ui.adapter.ViewPagerAdapter;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding;
import com.huawei.digitalpayment.home.data.source.remote.ChangeSkinResp;
import com.huawei.digitalpayment.home.data.source.remote.QuerySkinResp;
import com.huawei.digitalpayment.home.data.source.remote.SkinInfo;
import com.huawei.digitalpayment.home.request.HomeThemeDetailParams;
import com.huawei.digitalpayment.home.request.QuerySkinParams;
import com.huawei.digitalpayment.home.viewmodel.HomeViewModel;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;

public class ChangeSkinActivity extends Hilt_ChangeSkinActivity<ActivityChangeSkinBinding, HomeViewModel> {
    private static final int DEFAULT_PAGE_SIZE = 20;
    private SkinInfo selectSkin;
    private static final byte[] $$c = {120, -46, -95, -23};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {115, Ascii.RS, 119, 102, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -61, -8, -4, -26, 7, TarHeader.LF_SYMLINK, -66, -12, -13, 8, -20, -3, 6, -18, TarHeader.LF_CONTIG, -29, -40, -4, -26, 7, Ascii.GS, -51, -10, -4, -13, -6, 4, -12, 2, Ascii.NAK, -44, 1, -16, Ascii.US, -43, -10, -3, 65, -54, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, -10, -6, -6, 2, -16, -13, 59, -19, -5, -10, -6, -6, 2, -16, -13, 58};
    private static final int $$h = 238;
    private static final byte[] $$a = {10, 80, 9, 70, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 157;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;
    private static char component3 = 43379;
    private static char ShareDataUIState = 47134;
    private static char copydefault = 24047;
    private static char component2 = 60869;
    private static int[] component1 = {-1860397866, 778206803, 572494639, -1384662698, -1492508003, 2104313431, 50950549, 956627516, -1035506999, 1496679095, -2103910715, 1070302621, 1486952823, -1940102969, -586612654, 885043336, -294556616, -1446964167};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.$$c
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r8 = r8 + 1
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.$$i(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.$$a
            int r1 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.d(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 8
            int r8 = r8 + 99
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.$$g
            int r9 = r9 * 63
            int r9 = 73 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-7)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.e(short, byte, byte, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(ChangeSkinActivity changeSkinActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = changeSkinActivity.binding;
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 101;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return binding;
    }

    static ViewDataBinding access$100(ChangeSkinActivity changeSkinActivity) {
        int i = 2 % 2;
        int i2 = equals + 73;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = changeSkinActivity.binding;
        if (i3 == 0) {
            return binding;
        }
        throw null;
    }

    static ViewDataBinding access$200(ChangeSkinActivity changeSkinActivity) {
        int i = 2 % 2;
        int i2 = equals + 111;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = changeSkinActivity.binding;
        int i4 = getRequestBeneficiariesState + 59;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ViewDataBinding access$300(ChangeSkinActivity changeSkinActivity) {
        int i = 2 % 2;
        int i2 = equals + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = changeSkinActivity.binding;
        int i4 = getRequestBeneficiariesState + 9;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i3 = $11 + 37;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                int i7 = iNotificationSideChannelDefault.component3;
                cArr3[1] = cArr[0];
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 844, Color.green(0) + 32, (char) (23251 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 592652048, false, $$i((byte) 7, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 844, Color.red(0) + 32, (char) (23251 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 592652048, false, $$i((byte) 7, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 464, 48 - ExpandableListView.getPackedPositionChild(0L), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int length2;
        int[] iArr3;
        int i3;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = component1;
        int i5 = 684241640;
        long j = 0;
        int i6 = 1;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $10 + 21;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i3 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i3 = 0;
            }
            while (i3 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 4392;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 37;
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        byte b2 = (byte) ($$f & 15);
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i9, jumpTapTimeout, cResolveOpacity, -309236339, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i3] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i3++;
                    i5 = 684241640;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component1;
        if (iArr6 != null) {
            int i10 = $10 + 93;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr6[i2]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    int i11 = 4392 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36;
                    char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)));
                    byte b4 = (byte) ($$f & 15);
                    byte b5 = (byte) (b4 - 2);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i11, i12, c2, -309236339, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i2++;
                i6 = 1;
                i7 = 0;
            }
            iArr6 = iArr2;
        }
        int i13 = i7;
        System.arraycopy(iArr6, i13, iArr5, i13, length3);
        getactivenotifications.component1 = i13;
        while (getactivenotifications.component1 < iArr.length) {
            int i14 = $10 + 73;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i16];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2968, (ViewConfiguration.getScrollBarSize() >> 8) + 16, (char) (Color.rgb(0, 0, 0) + 16827087), 462826032, false, $$i(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i16++;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 3;
                byte b9 = (byte) (b8 - 3);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 2944, 24 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (27638 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), -1616366948, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i21 = $10 + 25;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.onCreate(android.os.Bundle):void");
    }

    private void initData() {
        int i = 2 % 2;
        QuerySkinParams querySkinParams = new QuerySkinParams();
        querySkinParams.setCount(20);
        ((HomeViewModel) this.viewModel).userSwitchablelist(querySkinParams);
        int i2 = getRequestBeneficiariesState + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initClickListener() {
        int i = 2 % 2;
        ((ActivityChangeSkinBinding) this.binding).btnConfirm.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 93;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    ChangeSkinActivity.m10463$$Nest$mswitchTheme(ChangeSkinActivity.this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ChangeSkinActivity.m10463$$Nest$mswitchTheme(ChangeSkinActivity.this);
                int i4 = component1 + 69;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void switchTheme() {
        int i = 2 % 2;
        Object obj = null;
        if (this.selectSkin != null) {
            ((HomeViewModel) this.viewModel).switchTheme(new HomeThemeDetailParams(this.selectSkin.getThemeId(), Integer.valueOf(this.selectSkin.getVersion()), null));
            int i2 = equals + 99;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = equals + 105;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void changeData(ChangeSkinResp changeSkinResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
        int i4 = getRequestBeneficiariesState + 123;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void setData(QuerySkinResp querySkinResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (!CollectionUtils.isEmpty(querySkinResp.getThemeList())) {
                setBanner(querySkinResp.getThemeList());
                return;
            }
            int i3 = equals + 93;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        CollectionUtils.isEmpty(querySkinResp.getThemeList());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initObserver() {
        int i = 2 % 2;
        ((HomeViewModel) this.viewModel).getSkinData().observe(this, new Observer<Resource<QuerySkinResp>>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onChanged(Resource<QuerySkinResp> resource) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 73;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(resource);
                int i5 = component2 + 95;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
            
                com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r3.component1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
            
                if (r4.error() == false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
            
                r1 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.component2 + 111;
                com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.ShareDataUIState = r1 % 128;
                r1 = r1 % 2;
                com.huawei.common.util.ToastUtils.showShort(r4.getException().getResponseDesc());
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
            
                if (r4.success() == false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            
                com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.m10461$$Nest$msetData(r3.component1, r4.getData());
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            
                if (r4.loading() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            
                if (r4.loading() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                r4 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.component2 + 43;
                com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.ShareDataUIState = r4 % 128;
                r4 = r4 % 2;
                com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r3.component1);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void component3(com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.home.data.source.remote.QuerySkinResp> r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.component2
                    int r1 = r1 + 37
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.ShareDataUIState = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L19
                    boolean r1 = r4.loading()
                    r2 = 56
                    int r2 = r2 / 0
                    if (r1 == 0) goto L2e
                    goto L1f
                L19:
                    boolean r1 = r4.loading()
                    if (r1 == 0) goto L2e
                L1f:
                    int r4 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.component2
                    int r4 = r4 + 43
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.ShareDataUIState = r1
                    int r4 = r4 % r0
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity r4 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.this
                    com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r4)
                    return
                L2e:
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity r1 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.this
                    com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r1)
                    boolean r1 = r4.error()
                    if (r1 == 0) goto L4d
                    int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.component2
                    int r1 = r1 + 111
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.ShareDataUIState = r2
                    int r1 = r1 % r0
                    com.huawei.common.exception.BaseException r0 = r4.getException()
                    java.lang.String r0 = r0.getResponseDesc()
                    com.huawei.common.util.ToastUtils.showShort(r0)
                L4d:
                    boolean r0 = r4.success()
                    if (r0 == 0) goto L5e
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity r0 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.this
                    java.lang.Object r4 = r4.getData()
                    com.huawei.digitalpayment.home.data.source.remote.QuerySkinResp r4 = (com.huawei.digitalpayment.home.data.source.remote.QuerySkinResp) r4
                    com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.m10461$$Nest$msetData(r0, r4)
                L5e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass4.component3(com.huawei.payment.mvvm.Resource):void");
            }
        });
        ((HomeViewModel) this.viewModel).getChangeSkinData().observe(this, new Observer<Resource<ChangeSkinResp>>() {
            private static final byte[] $$c = {74, 75, -50, -9};
            private static final int $$f = 253;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {Base64.padSymbol, -49, -70, 93, -10, 4, TarHeader.LF_SYMLINK, -59, -20, -13, 0, 4, -29, Ascii.SI, -5, -25, -8, 1, 0, TarHeader.LF_NORMAL, -60, -22, -14, 2, -11, -2, 58, -64, -5, -16, 2, -20, 10, -26, -2, -10, -8, 62, -26, -56, 4, -15, -6, TarHeader.LF_DIR, -23, -62, -2, 8, -21, 37, -37, -16, 2, -20, 10, -26, -2, -10, 71, -70, -19, -5, -10, -6, -6, 2, -16, -13, 58, -19, -8, -16, Ascii.SO, -8, -8, -2, -27, 2, -15};
            private static final int $$e = 93;
            private static final byte[] $$a = {102, Ascii.GS, -34, 39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -40, 39, Ascii.US, 7, 38, 34};
            private static final int $$b = 71;
            private static int copy = 0;
            private static int getRequestBeneficiariesState = 1;
            private static char[] component1 = {30255, 30242, 30248, 30238, 30237, 30247, 30434, 30233, 30265, 30231, 30232, 30251, 30243, 30409, 30240, 30249, 30241, 30236, 30270, 30415, 30234, 30264, 30244, 30235, 30246, 30245, 30404};
            private static int component3 = 321287820;
            private static boolean component2 = true;
            private static boolean ShareDataUIState = true;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(int r5, byte r6, int r7) {
                /*
                    int r7 = r7 + 4
                    byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass3.$$c
                    int r5 = r5 * 5
                    int r5 = 73 - r5
                    int r6 = r6 * 2
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    int r7 = r7 + 1
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L24:
                    r3 = r0[r7]
                L26:
                    int r3 = -r3
                    int r5 = r5 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass3.$$g(int, byte, int):java.lang.String");
            }

            private static void a(int i2, byte b2, short s, Object[] objArr) {
                int i3 = s * 4;
                int i4 = 101 - (b2 * 2);
                int i5 = 22 - (i2 * 9);
                byte[] bArr = $$a;
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

            private static void c(byte b2, short s, short s2, Object[] objArr) {
                int i2 = (b2 * 65) + 4;
                int i3 = (s2 * 12) + 99;
                byte[] bArr = $$d;
                int i4 = s * 55;
                byte[] bArr2 = new byte[66 - i4];
                int i5 = 65 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i2++;
                    i3 = (i3 + (-i2)) - 7;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i3;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        byte b3 = bArr[i2];
                        i2++;
                        i3 = (i3 + (-b3)) - 7;
                    }
                }
            }

            @Override
            public void onChanged(Resource<ChangeSkinResp> resource) throws Throwable {
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 29;
                copy = i3 % 128;
                int i4 = i3 % 2;
                copydefault(resource);
                int i5 = getRequestBeneficiariesState + 39;
                copy = i5 % 128;
                int i6 = i5 % 2;
            }

            private static void b(char[] cArr, int i2, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                cancel cancelVar = new cancel();
                char[] cArr2 = component1;
                int i4 = 0;
                if (cArr2 != null) {
                    int i5 = $11 + 105;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i4] = Integer.valueOf(cArr2[i7]);
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                            if (objCopydefault == null) {
                                int iBlue = 3760 - Color.blue(i4);
                                int trimmedLength = TextUtils.getTrimmedLength("") + 24;
                                char cIndexOf = (char) TextUtils.indexOf("", "", i4, i4);
                                byte b2 = (byte) ($$f & 3);
                                byte b3 = (byte) (b2 - 1);
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, trimmedLength, cIndexOf, -1670574543, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                            i7++;
                            i4 = 0;
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
                Object[] objArr3 = {Integer.valueOf(component3)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 7140, View.MeasureSpec.getMode(0) + 13, (char) Gravity.getAbsoluteGravity(0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                long j = 0;
                if (ShareDataUIState) {
                    int i8 = $10 + 73;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cancelVar.component1 = bArr.length;
                    char[] cArr4 = new char[cancelVar.component1];
                    cancelVar.component3 = 0;
                    while (cancelVar.component3 < cancelVar.component1) {
                        int i10 = $10 + 85;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 % 0) / cancelVar.component3] >> i2] << iIntValue);
                            Object[] objArr4 = {cancelVar, cancelVar};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                            if (objCopydefault3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 2747, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, (char) (7644 - TextUtils.getCapsMode("", 0, 0)), -327556343, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault3).invoke(null, objArr4);
                        } else {
                            cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i2] - iIntValue);
                            Object[] objArr5 = {cancelVar, cancelVar};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                            if (objCopydefault4 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 2748, 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 7644), -327556343, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault4).invoke(null, objArr5);
                        }
                        j = 0;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (component2) {
                    cancelVar.component1 = cArr.length;
                    char[] cArr5 = new char[cancelVar.component1];
                    cancelVar.component3 = 0;
                    while (cancelVar.component3 < cancelVar.component1) {
                        int i11 = $11 + 3;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            cArr5[cancelVar.component3] = (char) (cArr2[cArr[cancelVar.component1 / cancelVar.component3] % i2] + iIntValue);
                            Object[] objArr6 = {cancelVar, cancelVar};
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                            if (objCopydefault5 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.alpha(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, (char) (View.resolveSize(0, 0) + 7644), -327556343, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault5).invoke(null, objArr6);
                        } else {
                            cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i2] - iIntValue);
                            Object[] objArr7 = {cancelVar, cancelVar};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                            if (objCopydefault6 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, (char) (7643 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -327556343, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault6).invoke(null, objArr7);
                        }
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i12 = 0;
                cancelVar.component1 = iArr.length;
                char[] cArr6 = new char[cancelVar.component1];
                while (true) {
                    cancelVar.component3 = i12;
                    if (cancelVar.component3 >= cancelVar.component1) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i2] - iIntValue);
                        i12 = cancelVar.component3 + 1;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x01ee  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void copydefault(com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.home.data.source.remote.ChangeSkinResp> r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1826
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.AnonymousClass3.copydefault(com.huawei.payment.mvvm.Resource):void");
            }
        });
        int i2 = equals + 9;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initView() {
        int i = 2 % 2;
        ((ActivityChangeSkinBinding) this.binding).btnConfirm.setEnabled(false);
        ((ActivityChangeSkinBinding) this.binding).ivBack.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 15;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    ChangeSkinActivity.this.finish();
                    obj.hashCode();
                    throw null;
                }
                ChangeSkinActivity.this.finish();
                int i4 = component1 + 73;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = equals + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void setBanner(List<SkinInfo> list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (!CollectionUtils.isEmpty(list)) {
            ((ActivityChangeSkinBinding) this.binding).title.setText(list.get(0).getThemeName());
            this.selectSkin = list.get(0);
            int i4 = equals + 125;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        setEnable(this.selectSkin);
        initBannerIndicators(list);
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(list);
        ((ActivityChangeSkinBinding) this.binding).cycleViewPager.setPageMargin(SizeUtils.dp2px(24.0f));
        ((ActivityChangeSkinBinding) this.binding).cycleViewPager.setAdapter(viewPagerAdapter);
        ((ActivityChangeSkinBinding) this.binding).cycleViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onPageSelected(int i6) {
                int i7 = 2 % 2;
                Callback.onPageSelected_enter(i6);
                try {
                    L.INSTANCE.d("onPageSelected=" + i6, new Object[0]);
                    ChangeSkinActivity.m10459$$Nest$fputselectSkin(ChangeSkinActivity.this, viewPagerAdapter.getSkinInfos().get(i6));
                    ((ActivityChangeSkinBinding) ChangeSkinActivity.access$000(ChangeSkinActivity.this)).title.setText(viewPagerAdapter.getSkinInfos().get(i6).getThemeName());
                    ChangeSkinActivity changeSkinActivity = ChangeSkinActivity.this;
                    ChangeSkinActivity.m10462$$Nest$msetEnable(changeSkinActivity, ChangeSkinActivity.m10458$$Nest$fgetselectSkin(changeSkinActivity));
                    ChangeSkinActivity.m10464$$Nest$mupdateBannerIndicators(ChangeSkinActivity.this, viewPagerAdapter.getRealCurrent(i6));
                    Callback.onPageSelected_exit();
                    int i8 = ShareDataUIState + 97;
                    copydefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                } catch (Throwable th) {
                    Callback.onPageSelected_exit();
                    throw th;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i6) {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 53;
                copydefault = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (i6 != 0 || viewPagerAdapter.getSkinInfos().size() <= 1) {
                    return;
                }
                int currentItem = ((ActivityChangeSkinBinding) ChangeSkinActivity.access$100(ChangeSkinActivity.this)).cycleViewPager.getCurrentItem();
                if (currentItem == 0) {
                    ((ActivityChangeSkinBinding) ChangeSkinActivity.access$200(ChangeSkinActivity.this)).cycleViewPager.setCurrentItem(viewPagerAdapter.getSkinInfos().size() - 2, false);
                } else if (currentItem == viewPagerAdapter.getSkinInfos().size() - 1) {
                    int i9 = copydefault + 115;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                    ((ActivityChangeSkinBinding) ChangeSkinActivity.access$300(ChangeSkinActivity.this)).cycleViewPager.setCurrentItem(1, false);
                }
            }

            @Override
            public void onPageScrolled(int i6, float f, int i7) {
                int i8 = 2 % 2;
                int i9 = ShareDataUIState + 69;
                copydefault = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 34 / 0;
                }
            }
        });
        ((ActivityChangeSkinBinding) this.binding).cycleViewPager.setCurrentItem(1);
        updateBannerIndicators(0);
    }

    private void setEnable(SkinInfo skinInfo) {
        ActivityChangeSkinBinding activityChangeSkinBinding;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance("homeModuleNoCache").getString("themeId", "");
        SPUtils.getInstance("homeModuleNoCache").getInt("themeVersion");
        if (skinInfo != null) {
            int i4 = equals + 105;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if (!TextUtils.isEmpty(skinInfo.getThemeId()) && !(!skinInfo.getThemeId().equals(string))) {
                int i6 = equals + 121;
                getRequestBeneficiariesState = i6 % 128;
                if (i6 % 2 != 0) {
                    ((ActivityChangeSkinBinding) this.binding).btnConfirm.setEnabled(false);
                    activityChangeSkinBinding = (ActivityChangeSkinBinding) this.binding;
                } else {
                    ((ActivityChangeSkinBinding) this.binding).btnConfirm.setEnabled(false);
                    activityChangeSkinBinding = (ActivityChangeSkinBinding) this.binding;
                }
                activityChangeSkinBinding.btnConfirm.setText(getString(R.string.home_changeskin_in_use));
                return;
            }
        }
        ((ActivityChangeSkinBinding) this.binding).btnConfirm.setText(getString(R.string.home_changeskin_use_now));
        ((ActivityChangeSkinBinding) this.binding).btnConfirm.setEnabled(true);
    }

    private void initBannerIndicators(List<SkinInfo> list) {
        int i = 2 % 2;
        ((ActivityChangeSkinBinding) this.binding).cycleIndicator.removeAllViews();
        Iterator<SkinInfo> it = list.iterator();
        int i2 = getRequestBeneficiariesState + 49;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 % 4;
        }
        while (it.hasNext()) {
            int i4 = getRequestBeneficiariesState + 43;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                it.next();
                ((ActivityChangeSkinBinding) this.binding).cycleIndicator.addView(createBannerIndicators());
                throw null;
            }
            it.next();
            ((ActivityChangeSkinBinding) this.binding).cycleIndicator.addView(createBannerIndicators());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[PHI: r6
  0x006b: PHI (r6v8 android.widget.ImageView) = (r6v7 android.widget.ImageView), (r6v14 android.widget.ImageView) binds: [B:10:0x0069, B:7:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f A[PHI: r6
  0x006f: PHI (r6v9 android.widget.ImageView) = (r6v7 android.widget.ImageView), (r6v14 android.widget.ImageView) binds: [B:10:0x0069, B:7:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateBannerIndicators(int r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.mipmap.icon_banner_indicator_normal
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r8, r1)
            com.huawei.common.util.color.ColorUtils r2 = com.huawei.common.util.color.ColorUtils.INSTANCE
            int r3 = com.huawei.digitalpayment.consumer.homeui.R.color.colorPrimary
            int r3 = com.blankj.utilcode.util.ColorUtils.getColor(r3)
            r4 = 1058642330(0x3f19999a, float:0.6)
            int r2 = r2.withAlpha(r4, r3)
            androidx.core.graphics.drawable.DrawableCompat.setTint(r1, r2)
            int r2 = com.huawei.digitalpayment.consumer.homeui.R.mipmap.icon_banner_indicator_select
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r8, r2)
            int r3 = com.huawei.digitalpayment.consumer.homeui.R.color.colorPrimary
            int r3 = com.blankj.utilcode.util.ColorUtils.getColor(r3)
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r3)
            Binding extends androidx.databinding.ViewDataBinding r3 = r8.binding
            com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding r3 = (com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding) r3
            android.widget.LinearLayout r3 = r3.cycleIndicator
            int r3 = r3.getChildCount()
            int r4 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.getRequestBeneficiariesState
            int r4 = r4 + 39
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.equals = r5
            int r4 = r4 % r0
            r4 = 0
            r5 = r4
        L3f:
            if (r5 >= r3) goto L75
            int r6 = com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.equals
            int r6 = r6 + 7
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.getRequestBeneficiariesState = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L5d
            Binding extends androidx.databinding.ViewDataBinding r6 = r8.binding
            com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding r6 = (com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding) r6
            android.widget.LinearLayout r6 = r6.cycleIndicator
            android.view.View r6 = r6.getChildAt(r5)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 6
            int r7 = r7 / r4
            if (r5 == r9) goto L6f
            goto L6b
        L5d:
            Binding extends androidx.databinding.ViewDataBinding r6 = r8.binding
            com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding r6 = (com.huawei.digitalpayment.consumer.homeui.databinding.ActivityChangeSkinBinding) r6
            android.widget.LinearLayout r6 = r6.cycleIndicator
            android.view.View r6 = r6.getChildAt(r5)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r5 == r9) goto L6f
        L6b:
            r6.setImageDrawable(r1)
            goto L72
        L6f:
            r6.setImageDrawable(r2)
        L72:
            int r5 = r5 + 1
            goto L3f
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.updateBannerIndicators(int):void");
    }

    private ImageView createBannerIndicators() {
        int i = 2 % 2;
        ImageView imageView = new ImageView(this);
        int i2 = equals + 9;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return imageView;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 19;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_change_skin;
        int i5 = getRequestBeneficiariesState + 125;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = equals + 119;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getWindowTouchSlop() >> 8) + 26, new char[]{27591, 18809, 42863, 8731, 56825, 38135, 35284, 9831, 18412, 21695, 14244, 4896, 23817, 20610, 44420, 54673, 55217, 26099, 1806, 20854, 47701, 51061, 7860, 56780, 65273, 40232}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new int[]{1741306789, 2086188739, 887775928, 1143057303, -1693366074, -315401186, -1719371844, -173925499, -945285331, 2096642223}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 65;
            equals = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6570, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, (char) TextUtils.indexOf("", ""), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x090e A[Catch: all -> 0x0366, TryCatch #5 {all -> 0x0366, blocks: (B:155:0x0908, B:157:0x090e, B:158:0x0939, B:654:0x2b16, B:656:0x2b1c, B:657:0x2b42, B:689:0x2e60, B:691:0x2e66, B:692:0x2e92, B:726:0x31a2, B:728:0x31a8, B:729:0x31c8, B:706:0x2fe2, B:708:0x3005, B:709:0x305c, B:528:0x23d4, B:530:0x23da, B:531:0x2404, B:533:0x243e, B:534:0x2484, B:501:0x213d, B:503:0x2152, B:504:0x2186, B:751:0x32a3, B:753:0x32a9, B:754:0x32ca, B:756:0x3304, B:757:0x334c, B:469:0x1cde, B:471:0x1cf3, B:472:0x1d1e, B:474:0x1d52, B:475:0x1dcb, B:448:0x1a64, B:450:0x1a6a, B:451:0x1a93, B:354:0x14fc, B:356:0x1502, B:357:0x152d, B:309:0x12d1, B:311:0x12d7, B:312:0x12ff, B:241:0x0e0a, B:243:0x0e10, B:244:0x0e3c, B:17:0x016e, B:19:0x0174, B:20:0x019b, B:22:0x02d6, B:24:0x0308, B:25:0x0360, B:162:0x09b9, B:164:0x09bf, B:165:0x0a04, B:167:0x0a11, B:169:0x0a1a, B:170:0x0a5e, B:193:0x0c73, B:194:0x0c77, B:196:0x0c7d, B:199:0x0c95, B:202:0x0ca2, B:204:0x0ca5, B:216:0x0d81, B:218:0x0d87, B:219:0x0d88, B:221:0x0d8a, B:223:0x0d91, B:224:0x0d92, B:171:0x0a69, B:183:0x0b5f, B:185:0x0b65, B:186:0x0ba9, B:188:0x0bd3, B:189:0x0c17, B:191:0x0c2d, B:192:0x0c6d, B:226:0x0d94, B:228:0x0d9b, B:229:0x0d9c, B:231:0x0d9e, B:233:0x0da5, B:234:0x0da6, B:248:0x0eca, B:250:0x0ed0, B:251:0x0f19, B:253:0x0f26, B:255:0x0f2f, B:256:0x0f76, B:275:0x1121, B:283:0x1192, B:289:0x1227, B:291:0x122d, B:292:0x122e, B:294:0x1230, B:296:0x1237, B:297:0x1238, B:258:0x0f82, B:265:0x100b, B:267:0x1011, B:268:0x1055, B:270:0x107f, B:271:0x10c2, B:273:0x10d8, B:274:0x1119, B:299:0x123a, B:301:0x1241, B:302:0x1242, B:361:0x15af, B:363:0x15b5, B:364:0x15f2, B:366:0x15ff, B:368:0x1608, B:369:0x1643, B:393:0x186f, B:394:0x1873, B:397:0x187f, B:400:0x1898, B:406:0x18b3, B:410:0x18c2, B:411:0x18ca, B:423:0x19af, B:425:0x19b5, B:426:0x19b6, B:428:0x19b8, B:430:0x19bf, B:431:0x19c0, B:370:0x164e, B:382:0x1759, B:384:0x175f, B:385:0x179e, B:387:0x17c8, B:389:0x1810, B:391:0x1826, B:392:0x1867, B:433:0x19c2, B:435:0x19c9, B:436:0x19ca, B:438:0x19cc, B:440:0x19d3, B:441:0x19d4, B:317:0x1384, B:319:0x1388, B:340:0x146a, B:342:0x1470, B:343:0x1471, B:345:0x1473, B:347:0x147a, B:348:0x147b, B:323:0x1394), top: B:781:0x016e, inners: #7, #25, #40, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2b1c A[Catch: all -> 0x0366, TryCatch #5 {all -> 0x0366, blocks: (B:155:0x0908, B:157:0x090e, B:158:0x0939, B:654:0x2b16, B:656:0x2b1c, B:657:0x2b42, B:689:0x2e60, B:691:0x2e66, B:692:0x2e92, B:726:0x31a2, B:728:0x31a8, B:729:0x31c8, B:706:0x2fe2, B:708:0x3005, B:709:0x305c, B:528:0x23d4, B:530:0x23da, B:531:0x2404, B:533:0x243e, B:534:0x2484, B:501:0x213d, B:503:0x2152, B:504:0x2186, B:751:0x32a3, B:753:0x32a9, B:754:0x32ca, B:756:0x3304, B:757:0x334c, B:469:0x1cde, B:471:0x1cf3, B:472:0x1d1e, B:474:0x1d52, B:475:0x1dcb, B:448:0x1a64, B:450:0x1a6a, B:451:0x1a93, B:354:0x14fc, B:356:0x1502, B:357:0x152d, B:309:0x12d1, B:311:0x12d7, B:312:0x12ff, B:241:0x0e0a, B:243:0x0e10, B:244:0x0e3c, B:17:0x016e, B:19:0x0174, B:20:0x019b, B:22:0x02d6, B:24:0x0308, B:25:0x0360, B:162:0x09b9, B:164:0x09bf, B:165:0x0a04, B:167:0x0a11, B:169:0x0a1a, B:170:0x0a5e, B:193:0x0c73, B:194:0x0c77, B:196:0x0c7d, B:199:0x0c95, B:202:0x0ca2, B:204:0x0ca5, B:216:0x0d81, B:218:0x0d87, B:219:0x0d88, B:221:0x0d8a, B:223:0x0d91, B:224:0x0d92, B:171:0x0a69, B:183:0x0b5f, B:185:0x0b65, B:186:0x0ba9, B:188:0x0bd3, B:189:0x0c17, B:191:0x0c2d, B:192:0x0c6d, B:226:0x0d94, B:228:0x0d9b, B:229:0x0d9c, B:231:0x0d9e, B:233:0x0da5, B:234:0x0da6, B:248:0x0eca, B:250:0x0ed0, B:251:0x0f19, B:253:0x0f26, B:255:0x0f2f, B:256:0x0f76, B:275:0x1121, B:283:0x1192, B:289:0x1227, B:291:0x122d, B:292:0x122e, B:294:0x1230, B:296:0x1237, B:297:0x1238, B:258:0x0f82, B:265:0x100b, B:267:0x1011, B:268:0x1055, B:270:0x107f, B:271:0x10c2, B:273:0x10d8, B:274:0x1119, B:299:0x123a, B:301:0x1241, B:302:0x1242, B:361:0x15af, B:363:0x15b5, B:364:0x15f2, B:366:0x15ff, B:368:0x1608, B:369:0x1643, B:393:0x186f, B:394:0x1873, B:397:0x187f, B:400:0x1898, B:406:0x18b3, B:410:0x18c2, B:411:0x18ca, B:423:0x19af, B:425:0x19b5, B:426:0x19b6, B:428:0x19b8, B:430:0x19bf, B:431:0x19c0, B:370:0x164e, B:382:0x1759, B:384:0x175f, B:385:0x179e, B:387:0x17c8, B:389:0x1810, B:391:0x1826, B:392:0x1867, B:433:0x19c2, B:435:0x19c9, B:436:0x19ca, B:438:0x19cc, B:440:0x19d3, B:441:0x19d4, B:317:0x1384, B:319:0x1388, B:340:0x146a, B:342:0x1470, B:343:0x1471, B:345:0x1473, B:347:0x147a, B:348:0x147b, B:323:0x1394), top: B:781:0x016e, inners: #7, #25, #40, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x2bcc  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x2c19  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x2c73  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x2e3e  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x2f22  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x2f75  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x2fc4  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x3182  */
    /* JADX WARN: Removed duplicated region for block: B:894:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x075a A[Catch: all -> 0x0884, TryCatch #26 {all -> 0x0884, blocks: (B:95:0x0750, B:96:0x0754, B:98:0x075a, B:101:0x0775, B:63:0x04d6, B:81:0x0621, B:85:0x0672, B:90:0x06e5, B:93:0x0740), top: B:817:0x04d6 }] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v44 */
    /* JADX WARN: Type inference failed for: r4v554 */
    /* JADX WARN: Type inference failed for: r4v555 */
    /* JADX WARN: Type inference failed for: r4v556 */
    /* JADX WARN: Type inference failed for: r4v572 */
    /* JADX WARN: Type inference failed for: r4v573 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.ChangeSkinActivity.attachBaseContext(android.content.Context):void");
    }

    static SkinInfo m10458$$Nest$fgetselectSkin(ChangeSkinActivity changeSkinActivity) {
        int i = 2 % 2;
        int i2 = equals + 107;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        SkinInfo skinInfo = changeSkinActivity.selectSkin;
        int i5 = i3 + 117;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return skinInfo;
    }

    static void m10459$$Nest$fputselectSkin(ChangeSkinActivity changeSkinActivity, SkinInfo skinInfo) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        changeSkinActivity.selectSkin = skinInfo;
        int i5 = i3 + 5;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
    }

    static void m10460$$Nest$mchangeData(ChangeSkinActivity changeSkinActivity, ChangeSkinResp changeSkinResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        changeSkinActivity.changeData(changeSkinResp);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 87;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10461$$Nest$msetData(ChangeSkinActivity changeSkinActivity, QuerySkinResp querySkinResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        changeSkinActivity.setData(querySkinResp);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 113;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void m10462$$Nest$msetEnable(ChangeSkinActivity changeSkinActivity, SkinInfo skinInfo) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        equals = i2 % 128;
        int i3 = i2 % 2;
        changeSkinActivity.setEnable(skinInfo);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10463$$Nest$mswitchTheme(ChangeSkinActivity changeSkinActivity) {
        int i = 2 % 2;
        int i2 = equals + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        changeSkinActivity.switchTheme();
        int i4 = equals + 3;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    static void m10464$$Nest$mupdateBannerIndicators(ChangeSkinActivity changeSkinActivity, int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 119;
        equals = i3 % 128;
        int i4 = i3 % 2;
        changeSkinActivity.updateBannerIndicators(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 121;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }
}
