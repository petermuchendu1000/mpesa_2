package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.Utils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.photo.CropManager;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import com.huawei.digitalpayment.consumer.base.util.PhotoHelper;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ActivityPhotoCropBinding;
import com.huawei.payment.lib.image.crop.CropFragment;
import com.huawei.payment.lib.image.crop.CropFragmentListener;
import com.safaricom.mpesa.logging.L;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.getActiveNotifications;

public class PhotoCropActivity extends SfcPaymentBaseActivity<ActivityPhotoCropBinding, ViewModel> implements CropFragmentListener {
    private static final String CROP_PHOTO = "crop_photo.jpg";
    private static final int ERROR_CODE_CHOOSE_ANOTHER = 9;
    private static final int ERROR_CODE_TAKE_ANOTHER = 8;
    private static final String FILE_PROVIDER = ".common.fileProvider";
    private static char ShareDataUIState;
    private static char[] component1;
    private static char component2;
    private static char component3;
    private static int[] component4;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    private final File cropFile = new File(Utils.getApp().getFilesDir().getAbsolutePath() + File.separator + CROP_PHOTO);
    private CropFragment fragment;
    private Uri imageCropUri;
    private static final byte[] $$c = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$f = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, Ascii.SYN, -21, -92, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66, Ascii.VT, -3, -64, 56, 1, 10, -13, Ascii.FF, -20, -53, TarHeader.LF_CHR, -2, Ascii.DLE, 1, -16, 5, 7, -17, -54, 65, -13, 1, Ascii.SI, -14, -5, 17, -19, Ascii.FF, -69, 70, -2, -12, 2, -63, 33, Ascii.DLE, 5, -3, -19, Ascii.NAK, Ascii.DLE, -22, -35, Ascii.GS, 10, -10, 17, -10, -12, Ascii.DC2, -6, 2, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -67};
    private static final int $$e = 177;
    private static final byte[] $$a = {120, 65, 99, 57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 61;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 + 104
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.$$g(int, int, int):java.lang.String");
    }

    private static void d(int i, short s, short s2, Object[] objArr) {
        int i2 = (s2 * 2) + 83;
        byte[] bArr = $$a;
        int i3 = 100 - i;
        byte[] bArr2 = new byte[s + 4];
        int i4 = s + 3;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (i4 + i3) - 8;
            i3++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            int i8 = i3 + 1;
            i5 = i6;
            i2 = (i7 + bArr[i3]) - 8;
            i3 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 99
            int r8 = 64 - r8
            int r6 = r6 * 43
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r8 = r8 + r7
            int r7 = r8 + 1
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.f(byte, int, short, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 113;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_photo_crop;
        int i5 = getAsAtTimestamp + 65;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i6 = $11 + 111;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i4 != 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3 % 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i8 = $10 + 19;
                $11 = i8 % 128;
                int i9 = i8 % i4;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component3);
                    objArr2[i4] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - ExpandableListView.getPackedPositionGroup(0L), Color.alpha(0) + 32, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 23251), 592652048, false, $$g((byte) ($$f & 23), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 845, 32 - View.MeasureSpec.getMode(0), (char) (23251 - TextUtils.indexOf("", "")), 592652048, false, $$g((byte) ($$f & 23), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i2++;
                    i4 = 2;
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
                i3 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i4 = i3;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component4;
        int i4 = 684241640;
        char c2 = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 61;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        int i10 = 4392 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iIndexOf = 37 - TextUtils.indexOf("", "");
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c2, i6, i6) + 1);
                        byte b2 = (byte) ($$f & 2);
                        byte b3 = (byte) (b2 - 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i10, iIndexOf, cLastIndexOf, -309236339, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = 684241640;
                    c2 = '0';
                    i6 = 0;
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
        int[] iArr6 = component4;
        int i11 = 16;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i12 = $11 + 29;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i14]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 4391;
                        int threadPriority2 = 37 - ((Process.getThreadPriority(0) + 20) >> 6);
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> i11);
                        byte b4 = (byte) ($$f & 2);
                        byte b5 = (byte) (b4 - 2);
                        iArr2 = iArr6;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, threadPriority2, fadingEdgeLength, -309236339, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i14] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i14++;
                    iArr6 = iArr2;
                    i11 = 16;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr7;
        }
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c3] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i15 = $11 + 75;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 5 % 2;
            }
            int i17 = 0;
            while (i17 < 16) {
                int i18 = $11 + 47;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i17];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2967 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 17, (char) (49871 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 462826032, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i17 += 73;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i17];
                    try {
                        Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                        if (objCopydefault4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2967 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, (char) (49871 - View.MeasureSpec.getSize(0)), 462826032, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                        getactivenotifications.component2 = iIntValue2;
                        i17++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
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
                int pressedStateDuration = 2944 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int i22 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24;
                char jumpTapTimeout = (char) (27637 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                byte b10 = (byte) (3 & $$f);
                byte b11 = (byte) (b10 - 3);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, i22, jumpTapTimeout, -1616366948, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component1;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (char) (65117 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i7 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4501, View.combineMeasuredStates(0, 0) + 36, (char) (27897 - Drawable.resolveOpacity(0, 0)), -1464227204, false, $$g((byte) ($$f & 22), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i8 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, (char) ((Process.getThreadPriority(0) + 20) >> 6), 1180380354, false, $$g((byte) ($$f & 59), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1858, 35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), 80302927, false, $$g((byte) ($$f & 58), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i9 = $11 + 11;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            int i12 = $11 + 121;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i14 = $11 + 119;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.onCreate(android.os.Bundle):void");
    }

    private void lambda$initListener$0(View view) {
        int i = 2 % 2;
        int i2 = equals + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = equals + 83;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$initListener$1(View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.fragment.cropAndSaveImage();
        int i4 = getAsAtTimestamp + 85;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initListener() {
        int i = 2 % 2;
        ((ActivityPhotoCropBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 41;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    PhotoCropActivity.m10872$r8$lambda$uOL5BctA_vjMwU5l0pVSdHsuro(this.f$0, view);
                    int i4 = 21 / 0;
                } else {
                    PhotoCropActivity.m10872$r8$lambda$uOL5BctA_vjMwU5l0pVSdHsuro(this.f$0, view);
                }
                int i5 = copydefault + 97;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityPhotoCropBinding) this.binding).tvUseThisPicture.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 49;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                PhotoCropActivity.$r8$lambda$Rx8f9twAc2BIKBZtjQgoulrzHog(this.f$0, view);
                if (i4 == 0) {
                    int i5 = 23 / 0;
                }
            }
        });
        ((ActivityPhotoCropBinding) this.binding).tvTakeAnotherOne.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 71;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                PhotoCropActivity.m10871$r8$lambda$Fqd6vFw_LMEdFW4HYBx0EdPzVA(this.f$0, view);
                int i5 = component1 + 17;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = getAsAtTimestamp + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$initListener$2(View view) {
        int i;
        int i2 = 2 % 2;
        if (CropManager.getInstance().getCallback() != null) {
            int i3 = equals + 29;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            if (PhotoHelper.INSTANCE.getCurrentPhotoFlag() == 1) {
                i = 8;
            } else {
                int i5 = getAsAtTimestamp + 123;
                equals = i5 % 128;
                int i6 = i5 % 2;
                i = 9;
            }
            CropManager.getInstance().getCallback().onError(new BaseException(i + "", ""));
        }
        finish();
    }

    @Override
    public void onCropLoading(boolean z) {
        int i = 2 % 2;
        L.INSTANCE.d("PhotoCropActivity", "onCropLoading: " + z, new Object[0]);
        if (z) {
            int i2 = equals + 119;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                DialogManager.showLoading(this);
                throw null;
            }
            DialogManager.showLoading(this);
        } else {
            DialogManager.hideLoading(this);
        }
        int i3 = equals + 45;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCropFinish(com.huawei.payment.lib.image.crop.CropFragment.UCropResult r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onCropFinish: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "PhotoCropActivity"
            r1.d(r5, r2, r4)
            int r1 = r7.resultCode
            r2 = -1
            if (r1 != r2) goto L7b
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.getAsAtTimestamp
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.equals = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L39
            com.huawei.common.photo.CropManager r1 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r1 = r1.getCallback()
            r2 = 40
            int r2 = r2 / r3
            if (r1 == 0) goto La8
            goto L43
        L39:
            com.huawei.common.photo.CropManager r1 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r1 = r1.getCallback()
            if (r1 == 0) goto La8
        L43:
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.equals
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = "com.huawei.payment.lib.image.OutputUri"
            if (r1 != 0) goto L67
            com.huawei.common.photo.CropManager r1 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r1 = r1.getCallback()
            android.content.Intent r7 = r7.resultData
            android.os.Parcelable r7 = r7.getParcelableExtra(r2)
            android.net.Uri r7 = (android.net.Uri) r7
            r1.onSuccess(r7)
            r7 = 32
            int r7 = r7 / r3
            goto La8
        L67:
            com.huawei.common.photo.CropManager r1 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r1 = r1.getCallback()
            android.content.Intent r7 = r7.resultData
            android.os.Parcelable r7 = r7.getParcelableExtra(r2)
            android.net.Uri r7 = (android.net.Uri) r7
            r1.onSuccess(r7)
            goto La8
        L7b:
            com.huawei.common.photo.CropManager r1 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r1 = r1.getCallback()
            if (r1 == 0) goto La8
            com.huawei.common.photo.CropManager r1 = com.huawei.common.photo.CropManager.getInstance()
            com.huawei.common.listener.ApiCallback r1 = r1.getCallback()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r7 = r7.resultCode
            r2.append(r7)
            java.lang.String r7 = ""
            r2.append(r7)
            com.huawei.common.exception.BaseException r4 = new com.huawei.common.exception.BaseException
            java.lang.String r2 = r2.toString()
            r4.<init>(r2, r7)
            r1.onError(r4)
        La8:
            r6.finish()
            int r7 = com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.getAsAtTimestamp
            int r7 = r7 + 59
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.equals = r1
            int r7 = r7 % r0
            if (r7 == 0) goto Lb9
            r7 = 92
            int r7 = r7 / r3
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.onCropFinish(com.huawei.payment.lib.image.crop.CropFragment$UCropResult):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 51;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new int[]{23, 26, 0, 18}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new int[]{49, 18, 0, 7}, true, new byte[]{0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = equals + 17;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.normalizeMetaState(0), 57 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), -960739708, false, "component3", new Class[]{Context.class});
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
    /* JADX WARN: Removed duplicated region for block: B:110:0x06be A[Catch: all -> 0x02d1, TryCatch #20 {all -> 0x02d1, blocks: (B:671:0x2a9d, B:673:0x2aa3, B:674:0x2acb, B:705:0x2dc0, B:707:0x2dc6, B:708:0x2df0, B:742:0x30ec, B:744:0x30f2, B:745:0x3112, B:722:0x2f34, B:724:0x2f57, B:725:0x2fa4, B:537:0x23a3, B:539:0x23a9, B:540:0x23d5, B:542:0x240f, B:543:0x2458, B:511:0x20d1, B:513:0x20e6, B:514:0x211b, B:767:0x31f0, B:769:0x31f6, B:770:0x3218, B:772:0x3252, B:773:0x328f, B:480:0x1c42, B:482:0x1c57, B:483:0x1c8a, B:485:0x1cbe, B:486:0x1d38, B:460:0x19d6, B:462:0x19dc, B:463:0x1a05, B:374:0x14c7, B:376:0x14cd, B:377:0x14f1, B:240:0x0e08, B:242:0x0e0e, B:243:0x0e38, B:195:0x0bd3, B:197:0x0bd9, B:198:0x0c04, B:108:0x06b8, B:110:0x06be, B:111:0x06e2, B:18:0x0103, B:20:0x0109, B:21:0x012f, B:23:0x0243, B:25:0x0275, B:26:0x02cb), top: B:822:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c9e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0cb5 A[Catch: all -> 0x0d7f, TryCatch #41 {all -> 0x0d7f, blocks: (B:215:0x0ca0, B:217:0x0cb5, B:218:0x0ce7), top: B:860:0x0ca0, outer: #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0cfa A[Catch: all -> 0x0d75, TryCatch #36 {all -> 0x0d75, blocks: (B:219:0x0ced, B:221:0x0cfa, B:222:0x0d6d), top: B:851:0x0ced, outer: #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0f14 A[Catch: all -> 0x1462, PHI: r2
  0x0f14: PHI (r2v566 java.lang.Object) = (r2v561 java.lang.Object), (r2v565 java.lang.Object) binds: [B:248:0x0ec1, B:249:0x0ec3] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x1462, blocks: (B:247:0x0ebd, B:253:0x0f14), top: B:835:0x0ebd }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0fa4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1000  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x12fe A[Catch: all -> 0x1440, TryCatch #12 {all -> 0x1440, blocks: (B:314:0x12f2, B:315:0x12f6, B:317:0x12fe, B:320:0x1318, B:323:0x1324, B:327:0x1333, B:328:0x133b, B:340:0x142e, B:342:0x1434, B:343:0x1435, B:345:0x1437, B:347:0x143e, B:348:0x143f, B:306:0x1227, B:308:0x1244, B:310:0x128d, B:312:0x12a3, B:313:0x12ea, B:353:0x1446, B:355:0x144c, B:356:0x144d, B:359:0x1452, B:361:0x1458, B:362:0x1459, B:336:0x13b2, B:331:0x1369, B:333:0x136f, B:334:0x13a0), top: B:808:0x0fa2, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x14cd A[Catch: all -> 0x02d1, TryCatch #20 {all -> 0x02d1, blocks: (B:671:0x2a9d, B:673:0x2aa3, B:674:0x2acb, B:705:0x2dc0, B:707:0x2dc6, B:708:0x2df0, B:742:0x30ec, B:744:0x30f2, B:745:0x3112, B:722:0x2f34, B:724:0x2f57, B:725:0x2fa4, B:537:0x23a3, B:539:0x23a9, B:540:0x23d5, B:542:0x240f, B:543:0x2458, B:511:0x20d1, B:513:0x20e6, B:514:0x211b, B:767:0x31f0, B:769:0x31f6, B:770:0x3218, B:772:0x3252, B:773:0x328f, B:480:0x1c42, B:482:0x1c57, B:483:0x1c8a, B:485:0x1cbe, B:486:0x1d38, B:460:0x19d6, B:462:0x19dc, B:463:0x1a05, B:374:0x14c7, B:376:0x14cd, B:377:0x14f1, B:240:0x0e08, B:242:0x0e0e, B:243:0x0e38, B:195:0x0bd3, B:197:0x0bd9, B:198:0x0c04, B:108:0x06b8, B:110:0x06be, B:111:0x06e2, B:18:0x0103, B:20:0x0109, B:21:0x012f, B:23:0x0243, B:25:0x0275, B:26:0x02cb), top: B:822:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x1578 A[Catch: all -> 0x1971, TryCatch #34 {all -> 0x1971, blocks: (B:381:0x1572, B:383:0x1578, B:384:0x15c1, B:386:0x15ce, B:388:0x15d7, B:389:0x1617, B:412:0x183b, B:413:0x183f, B:415:0x1845, B:418:0x185c, B:421:0x1869, B:423:0x186c, B:435:0x194b, B:437:0x1951, B:438:0x1952, B:440:0x1954, B:442:0x195b, B:443:0x195c, B:390:0x1622, B:402:0x1727, B:404:0x172d, B:405:0x1770, B:407:0x179a, B:408:0x17df, B:410:0x17f5, B:411:0x1835, B:445:0x195e, B:447:0x1965, B:448:0x1966, B:450:0x1968, B:452:0x196f, B:453:0x1970, B:431:0x18d1, B:426:0x1898, B:428:0x189e, B:429:0x18c9, B:397:0x1693, B:399:0x16af, B:400:0x171b, B:392:0x1642, B:394:0x1657, B:395:0x168c), top: B:848:0x1572, outer: #7, inners: #17, #21, #25, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x15ce A[Catch: all -> 0x1971, TryCatch #34 {all -> 0x1971, blocks: (B:381:0x1572, B:383:0x1578, B:384:0x15c1, B:386:0x15ce, B:388:0x15d7, B:389:0x1617, B:412:0x183b, B:413:0x183f, B:415:0x1845, B:418:0x185c, B:421:0x1869, B:423:0x186c, B:435:0x194b, B:437:0x1951, B:438:0x1952, B:440:0x1954, B:442:0x195b, B:443:0x195c, B:390:0x1622, B:402:0x1727, B:404:0x172d, B:405:0x1770, B:407:0x179a, B:408:0x17df, B:410:0x17f5, B:411:0x1835, B:445:0x195e, B:447:0x1965, B:448:0x1966, B:450:0x1968, B:452:0x196f, B:453:0x1970, B:431:0x18d1, B:426:0x1898, B:428:0x189e, B:429:0x18c9, B:397:0x1693, B:399:0x16af, B:400:0x171b, B:392:0x1642, B:394:0x1657, B:395:0x168c), top: B:848:0x1572, outer: #7, inners: #17, #21, #25, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x1622 A[Catch: all -> 0x1971, TRY_LEAVE, TryCatch #34 {all -> 0x1971, blocks: (B:381:0x1572, B:383:0x1578, B:384:0x15c1, B:386:0x15ce, B:388:0x15d7, B:389:0x1617, B:412:0x183b, B:413:0x183f, B:415:0x1845, B:418:0x185c, B:421:0x1869, B:423:0x186c, B:435:0x194b, B:437:0x1951, B:438:0x1952, B:440:0x1954, B:442:0x195b, B:443:0x195c, B:390:0x1622, B:402:0x1727, B:404:0x172d, B:405:0x1770, B:407:0x179a, B:408:0x17df, B:410:0x17f5, B:411:0x1835, B:445:0x195e, B:447:0x1965, B:448:0x1966, B:450:0x1968, B:452:0x196f, B:453:0x1970, B:431:0x18d1, B:426:0x1898, B:428:0x189e, B:429:0x18c9, B:397:0x1693, B:399:0x16af, B:400:0x171b, B:392:0x1642, B:394:0x1657, B:395:0x168c), top: B:848:0x1572, outer: #7, inners: #17, #21, #25, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x1845 A[Catch: all -> 0x1971, TryCatch #34 {all -> 0x1971, blocks: (B:381:0x1572, B:383:0x1578, B:384:0x15c1, B:386:0x15ce, B:388:0x15d7, B:389:0x1617, B:412:0x183b, B:413:0x183f, B:415:0x1845, B:418:0x185c, B:421:0x1869, B:423:0x186c, B:435:0x194b, B:437:0x1951, B:438:0x1952, B:440:0x1954, B:442:0x195b, B:443:0x195c, B:390:0x1622, B:402:0x1727, B:404:0x172d, B:405:0x1770, B:407:0x179a, B:408:0x17df, B:410:0x17f5, B:411:0x1835, B:445:0x195e, B:447:0x1965, B:448:0x1966, B:450:0x1968, B:452:0x196f, B:453:0x1970, B:431:0x18d1, B:426:0x1898, B:428:0x189e, B:429:0x18c9, B:397:0x1693, B:399:0x16af, B:400:0x171b, B:392:0x1642, B:394:0x1657, B:395:0x168c), top: B:848:0x1572, outer: #7, inners: #17, #21, #25, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x1a8c  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1af7  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1b50  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1c24  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1e6b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x25be  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x261a  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x2672  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x28cc  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x2aa3 A[Catch: all -> 0x02d1, TryCatch #20 {all -> 0x02d1, blocks: (B:671:0x2a9d, B:673:0x2aa3, B:674:0x2acb, B:705:0x2dc0, B:707:0x2dc6, B:708:0x2df0, B:742:0x30ec, B:744:0x30f2, B:745:0x3112, B:722:0x2f34, B:724:0x2f57, B:725:0x2fa4, B:537:0x23a3, B:539:0x23a9, B:540:0x23d5, B:542:0x240f, B:543:0x2458, B:511:0x20d1, B:513:0x20e6, B:514:0x211b, B:767:0x31f0, B:769:0x31f6, B:770:0x3218, B:772:0x3252, B:773:0x328f, B:480:0x1c42, B:482:0x1c57, B:483:0x1c8a, B:485:0x1cbe, B:486:0x1d38, B:460:0x19d6, B:462:0x19dc, B:463:0x1a05, B:374:0x14c7, B:376:0x14cd, B:377:0x14f1, B:240:0x0e08, B:242:0x0e0e, B:243:0x0e38, B:195:0x0bd3, B:197:0x0bd9, B:198:0x0c04, B:108:0x06b8, B:110:0x06be, B:111:0x06e2, B:18:0x0103, B:20:0x0109, B:21:0x012f, B:23:0x0243, B:25:0x0275, B:26:0x02cb), top: B:822:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:760:0x31b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x0f3b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:872:0x0ec3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x0c84 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v104 */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v110 */
    /* JADX WARN: Type inference failed for: r12v111 */
    /* JADX WARN: Type inference failed for: r12v112 */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r8v105 */
    /* JADX WARN: Type inference failed for: r8v107 */
    /* JADX WARN: Type inference failed for: r8v108 */
    /* JADX WARN: Type inference failed for: r8v109 */
    /* JADX WARN: Type inference failed for: r8v114 */
    /* JADX WARN: Type inference failed for: r8v116 */
    /* JADX WARN: Type inference failed for: r8v123 */
    /* JADX WARN: Type inference failed for: r8v124 */
    /* JADX WARN: Type inference failed for: r8v134, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v138 */
    /* JADX WARN: Type inference failed for: r8v139 */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v97 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.PhotoCropActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10871$r8$lambda$Fqd6vFw_LMEdFW4HYBx0EdPzVA(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10875instrumented$2$initListener$V(photoCropActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$Rx8f9twAc2BIKBZtjQgoulrzHog(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m10874instrumented$1$initListener$V(photoCropActivity, view);
        int i4 = equals + 19;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10872$r8$lambda$uOL5BctA_vjMwU5l0pVSdHsuro(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10873instrumented$0$initListener$V(photoCropActivity, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 13;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m10873instrumented$0$initListener$V(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            photoCropActivity.lambda$initListener$0(view);
            Callback.onClick_exit();
            int i4 = equals + 101;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10874instrumented$1$initListener$V(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                photoCropActivity.lambda$initListener$1(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            photoCropActivity.lambda$initListener$1(view);
            Callback.onClick_exit();
            int i4 = equals + 107;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10875instrumented$2$initListener$V(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 7;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                photoCropActivity.lambda$initListener$2(view);
                Callback.onClick_exit();
                int i4 = 58 / 0;
            } else {
                photoCropActivity.lambda$initListener$2(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getRequestBeneficiariesState = 0;
        copydefault();
        copydefault = (char) 33295;
        ShareDataUIState = (char) 38246;
        component2 = (char) 50813;
        component3 = (char) 23504;
        int i = copy + 25;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component1 = new char[]{33432, 33360, 33367, 33375, 33370, 33363, 33442, 33412, 33459, 33362, 33461, 33466, 33373, 33367, 33363, 33368, 33370, 33372, 33507, 33452, 33463, 33465, 33408, 33519, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33469, 33469, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33509, 33454, 33462, 33460, 33453, 33452, 33459, 33463, 33457, 33459, 33457, 33461, 33469, 33465, 33461, 33457, 33455, 33415, 33372, 33327, 33285, 33285, 33286, 33288, 33288, 33285, 33327, 33752, 33324, 33285, 33289, 33290, 33330, 33751, 33749, 33748, 33751, 33753, 33327, 33325, 33323, 33284, 33326, 33325, 33286, 33328, 33327, 33285, 33287, 33329, 33326, 33325, 33326, 33284, 33281, 33283, 33326, 33329, 33328, 33750, 33325, 33284, 33324, 33327, 33285, 33325, 33516, 33424, 33425, 33429, 33516, 33515, 33516, 33514, 33427, 33468, 33467, 33425, 33516, 33517, 33428, 33468, 33467, 33427, 33514, 33516, 33515, 33512, 33512, 33514, 33427, 33426, 33515, 33428, 33428, 33516, 33427, 33428, 33516, 33427, 33430, 33519, 33429, 33425, 33425, 33425, 33513, 33512, 33511, 33516, 33515, 33514, 33429, 33429, 33515, 33426, 33425, 33514, 33519, 33519, 33430, 33470, 33468, 33425, 33514, 33515, 33514, 33515, 33427, 33430, 33519, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33439, 33465, 33449, 33452, 33459, 33462, 33460, 33460, 33308, 33304, 33288, 33293, 33290, 33291, 33293, 33288, 33280, 33283, 33283, 33339, 33297, 33309, 33287, 33517, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33454, 33463, 33465, 33463, 33477, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33515, 33515, 33478, 33516, 33516, 33515, 33512, 33511, 33514, 33514, 33514, 33515, 33512, 33445, 33319, 33317, 33319, 33321, 33319, 33318, 33318, 33317, 33318};
        component4 = new int[]{1275518313, 1740464838, 344916917, 220164611, 190154927, -378396941, -859189126, -428037565, 2000743269, -1657912669, -267233632, 988665813, 173577875, 663432504, -553102373, 100608150, 18127177, -1448961581};
    }
}
