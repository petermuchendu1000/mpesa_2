package com.huawei.digitalpayment.consumer.sfcui.profile;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil;
import com.huawei.digitalpayment.consumer.base.util.PinLockedUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.baseui.databinding.ActivitySfcBasePinBinding;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.IdentifyPinViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.image.glide.Base64Mode;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.getSmallIconId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J)\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001f\"\u00020\u0007¢\u0006\u0002\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/SfcIdentityPinActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBasePinActivity;", "Lcom/huawei/digitalpayment/consumer/baseui/databinding/ActivitySfcBasePinBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/IdentifyPinViewModel;", "<init>", "()V", KeysConstants.KEY_ENCRYPT_PIN, "", KeysConstants.KEY_ENCRYPT_PIN2, "showBiometric", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "addObserver", "onConfirmClick", "pin", "biometricResult", "isFaceLogin", "updateUI", "formatAmountText", "amount", "displayOwerAvatar", "displayDefaultAvatarByName", "name", "boldWords", "Landroid/text/SpannableString;", "text", "wordsToBold", "", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/text/SpannableString;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcIdentityPinActivity extends Hilt_SfcIdentityPinActivity<ActivitySfcBasePinBinding, IdentifyPinViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    private static short[] component3;
    private static char component4;
    private static int copy;
    private static byte[] copydefault;
    private static long equals;
    private static int toString;
    private String encryptPin;
    private String encryptPin2;
    private boolean showBiometric = true;
    private static final byte[] $$u = {Ascii.GS, -59, -25, -119};
    private static final int $$x = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {Ascii.SI, -57, -42, 5, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarHeader.LF_CONTIG, -56, -3, -9, 13, 3, 1, -18, Ascii.SO, TarHeader.LF_CONTIG, -69, Ascii.SO, -14, 0, 10, -6, 1, -5, 69, -54, 3, -6, 0, 2, -13, 68, -59, -5, -6, Ascii.SI, -13, 4, 13, -11, 62, -34, -34, 13, 2, -12, 1, 10, -5, -11, Ascii.VT, -6, 1, -5, -21, 7, -17, 13, 33, -29, -19, 19, Ascii.FF, Ascii.FF, -10, -33, 19, -19, Ascii.SI, -12, 2, -3, 1, 1, 9, -9, -6, 65};
    private static final int $$C = 250;
    private static final byte[] $$g = {119, -58, 7, 71, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$h = 141;
    private static int getSponsorBeneficiariesState = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$A(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.$$u
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L28:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.$$A(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.$$g
            int r8 = 100 - r8
            int r9 = r9 * 2
            int r9 = 103 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r8
            goto L28
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            int r9 = r9 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.l(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 6
            int r0 = 58 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.$$B
            int r5 = r5 * 16
            int r5 = 99 - r5
            int r6 = r6 * 3
            int r6 = 76 - r6
            byte[] r0 = new byte[r0]
            int r7 = 57 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r4 = -r4
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.m(int, byte, short, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(SfcIdentityPinActivity sfcIdentityPinActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = sfcIdentityPinActivity.binding;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return binding;
    }

    private static void k(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i6 = $11 + 109;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i8 = $11 + 49;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 4037;
                    int i10 = 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1));
                    char c3 = (char) (19181 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b2 = (byte) ($$x & 5);
                    byte b3 = (byte) (b2 - 1);
                    String str$$A = $$A(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, i10, c3, 1912513118, false, str$$A, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int offsetAfter = TextUtils.getOffsetAfter("", i5) + 7567;
                        int iGreen = 11 - Color.green(i5);
                        char cArgb = (char) Color.argb(i5, i5, i5, i5);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iGreen, cArgb, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i11 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i11);
                        objArr4[i5] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i5;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 2460, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 931716605, false, $$A(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                i2 = 2;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7567, 10 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (equals ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copy) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component4) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i3 = i2;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void j(byte b2, int i, int i2, int i3, short s, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 31, (char) (61684 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1874745193, false, $$A((byte) 15, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 15;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = copydefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - ExpandableListView.getPackedPositionType(0L), 47 - TextUtils.lastIndexOf("", '0', 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54461), -1178636483, false, $$A((byte) ($$x & 86), b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = copydefault;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 999, 31 - KeyEvent.getDeadChar(0, 0), (char) (61685 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1874745193, false, $$A((byte) 15, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) component3[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $11 + 13;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)) + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component1), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - TextUtils.getOffsetAfter("", 0), Color.red(0) + 37, (char) View.getDefaultSize(0, 0), -1454191902, false, $$A((byte) 14, b6, b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = copydefault;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = $11 + 13;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $11 + 89;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i16 = $10 + 45;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    if (z) {
                        byte[] bArr6 = copydefault;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class component1 implements Observer, FunctionAdapter {
        private final Function1 component1;
        private static final byte[] $$c = {119, -58, 7, 71};
        private static final int $$f = 194;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {119, -40, Ascii.DLE, 123, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 203;
        private static final byte[] $$a = {112, 44, -46, -27, 2, -10, 10};
        private static final int $$b = 175;
        private static int component2 = 0;
        private static int ShareDataUIState = 1;
        private static char[] component3 = {12830, 1998, 2017, 2021, 12829, 2025, 2022, 2026, 12816, 2023, 2024, 12828, 2031, 1966, 2032, 2028, 12819, 2035, 1997, 12824, 2029, 12831, 2002, 2004, 2020, 2036, 2000, 2019, 12825, 2041, 2030, 12818, 12827, 2038, 2037, 2034};
        private static char copydefault = 12828;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r6, int r7, short r8) {
            /*
                int r8 = r8 * 4
                int r8 = 119 - r8
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$c
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r6 = 1 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$g(int, int, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$a
                int r5 = r5 * 3
                int r5 = 3 - r5
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r7 = r7 * 3
                int r7 = 111 - r7
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                int r5 = r5 + 1
                if (r3 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r4 = r0[r5]
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-1)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.a(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$d
                int r8 = r8 + 4
                int r7 = r7 * 3
                int r1 = r7 + 1
                int r6 = r6 + 98
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L2b
            L12:
                r3 = r2
            L13:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2b:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r8 + (-27)
                r8 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.b(short, int, short, java.lang.Object[]):void");
        }

        private static void c(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            char c2;
            Object obj;
            int i3 = 2 % 2;
            cancelAll cancelall = new cancelAll();
            char[] cArr2 = component3;
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
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 7421, TextUtils.getOffsetBefore("", 0) + 15, (char) (64291 - Drawable.resolveOpacity(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i4++;
                        int i5 = $11 + 125;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
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
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            char c3 = '\b';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7422, 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ExpandableListView.getPackedPositionType(0L) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    int i7 = $10 + 11;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i9 = $11 + 23;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 / b2);
                            cArr4[cancelall.component2] = (char) (cancelall.component3 + b2);
                        } else {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                            cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        }
                        c2 = c3;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[c3] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int edgeSlop = 7117 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iIndexOf = 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            char cAlpha = (char) (44463 - Color.alpha(0));
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[c3] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, iIndexOf, cAlpha, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = cancelall;
                            objArr5[9] = Integer.valueOf(cCharValue);
                            objArr5[c3] = cancelall;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = cancelall;
                            objArr5[4] = cancelall;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[2] = Integer.valueOf(cCharValue);
                            objArr5[1] = cancelall;
                            objArr5[0] = cancelall;
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2944;
                                int iLastIndexOf = 23 - TextUtils.lastIndexOf("", '0', 0, 0);
                                char threadPriority = (char) (27637 - ((Process.getThreadPriority(0) + 20) >> 6));
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                String str$$g = $$g(b3, b4, b4);
                                c2 = '\b';
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, iLastIndexOf, threadPriority, 794909189, false, str$$g, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = c3;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i10];
                        } else {
                            c2 = c3;
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                int i11 = $11 + 75;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i13];
                                cArr4[cancelall.component2 + 1] = cArr2[i14];
                            } else {
                                int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i15];
                                cArr4[cancelall.component2 + 1] = cArr2[i16];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    c3 = c2;
                }
            }
            int i17 = 0;
            while (i17 < i) {
                int i18 = $10 + 1;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 29992);
                    i17 += 12;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            if (!(obj instanceof Observer) || (!(obj instanceof FunctionAdapter))) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = component2 + 17;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return zAreEqual;
            }
            int i5 = 5 % 4;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component1;
            if (i3 == 0) {
                int i4 = 42 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 95;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = ShareDataUIState + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            int i4 = component2 + 75;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x0a24, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0a25, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0a29, code lost:
        
            if (r1 != null) goto L131;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x0a2b, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x0a2c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x05f6, code lost:
        
            r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.ShareDataUIState + 93;
            com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.component2 = r0 % 128;
            r0 = r0 % 2;
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0606, code lost:
        
            if (r0 != null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0608, code lost:
        
            r0 = 1342 - android.view.View.combineMeasuredStates(0, 0);
            r24 = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33;
            r2 = (char) (6425 - (android.view.ViewConfiguration.getEdgeSlop() >> 16));
            r5 = (byte) (com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$e & 5);
            r6 = (byte) (r5 + 2);
            r9 = new java.lang.Object[1];
            b(r5, r6, (byte) (r6 - 4), r9);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r24, r2, 1443979249, false, (java.lang.String) r9[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0647, code lost:
        
            ((java.lang.reflect.Field) r0).set(null, r12);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0654, code lost:
        
            if (r0 != null) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0656, code lost:
        
            r2 = android.text.TextUtils.getOffsetAfter("", 0) + 1342;
            r24 = android.graphics.Color.green(0) + 33;
            r0 = (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6425);
            r5 = (byte) (com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$e & 5);
            r6 = (byte) (r5 + 2);
            r9 = new java.lang.Object[1];
            b(r5, r6, (byte) (r6 - 4), r9);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r2, r24, r0, 1443979249, false, (java.lang.String) r9[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x069c, code lost:
        
            r5 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x06b1, code lost:
        
            if (r0 != null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x06b3, code lost:
        
            r0 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1342;
            r24 = 33 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            r2 = (char) (android.view.View.combineMeasuredStates(0, 0) + 6425);
            r6 = (byte) (com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.$$e & 6);
            r7 = (byte) (r6 - 2);
            r11 = new java.lang.Object[1];
            b(r6, r7, (byte) (r7 | 8), r11);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r24, r2, -181198845, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0700, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r5)).longValue();
         */
        /* JADX WARN: Removed duplicated region for block: B:120:0x09ac  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x05f6 A[EDGE_INSN: B:139:0x05f6->B:62:0x05f6 BREAK  A[LOOP:0: B:8:0x00a0->B:79:0x071b], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x071b A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component2(java.util.List r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2816
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.component1.component2(java.util.List):int");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02a5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.onCreate(android.os.Bundle):void");
    }

    private final void initData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        this.showBiometric = getIntent().getBooleanExtra("showBiometric", true);
        int i4 = getAsAtTimestamp + 29;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    private final void addObserver() {
        int i = 2 % 2;
        ((IdentifyPinViewModel) this.viewModel).getData().observe(this, new component1(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 57;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SfcIdentityPinActivity sfcIdentityPinActivity = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 == 0) {
                    return SfcIdentityPinActivity.$r8$lambda$MXD5eH6pE88RpUpVX6Mef4QFsRY(sfcIdentityPinActivity, resource);
                }
                Unit unit$r8$lambda$MXD5eH6pE88RpUpVX6Mef4QFsRY = SfcIdentityPinActivity.$r8$lambda$MXD5eH6pE88RpUpVX6Mef4QFsRY(sfcIdentityPinActivity, resource);
                int i5 = 25 / 0;
                return unit$r8$lambda$MXD5eH6pE88RpUpVX6Mef4QFsRY;
            }
        }));
        int i2 = getAsAtTimestamp + 115;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    private static final Unit addObserver$lambda$0(SfcIdentityPinActivity sfcIdentityPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        getAsAtTimestamp = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sfcIdentityPinActivity, "");
            resource.error();
            str.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sfcIdentityPinActivity, "");
        if (resource.error()) {
            String message = resource.getMessage();
            Intrinsics.checkNotNullExpressionValue(message, "");
            sfcIdentityPinActivity.showPinError(message);
            if (Intrinsics.areEqual(HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM, resource.getException().getResponseCode())) {
                PinLockedUtil.INSTANCE.showPinLockedDialog(sfcIdentityPinActivity);
                int i3 = getAsAtTimestamp + 103;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }
        if (resource.success()) {
            Intent intent = new Intent();
            String str2 = sfcIdentityPinActivity.encryptPin;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            intent.putExtra(KeysConstants.KEY_ENCRYPT_PIN, str2);
            String str3 = sfcIdentityPinActivity.encryptPin2;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str3;
            }
            intent.putExtra(KeysConstants.KEY_ENCRYPT_PIN2, str);
            sfcIdentityPinActivity.setResult(-1, intent);
            sfcIdentityPinActivity.finish();
            int i5 = getRequestBeneficiariesState + 39;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    @Override
    public void onConfirmClick(String pin) {
        int i = 2 % 2;
        this.encryptPin = EncryptUtils.encryptWithPinKey(pin);
        EncryptManager encryptManager = EncryptManager.INSTANCE;
        Intrinsics.checkNotNull(pin);
        this.encryptPin2 = encryptManager.encrypt(pin);
        IdentifyPinViewModel identifyPinViewModel = (IdentifyPinViewModel) this.viewModel;
        String strEncryptWithPinKey = EncryptUtils.encryptWithPinKey(pin);
        Intrinsics.checkNotNullExpressionValue(strEncryptWithPinKey, "");
        identifyPinViewModel.authSensitiveOperation(new AuthSensitiveOperationParams(strEncryptWithPinKey));
        int i2 = getAsAtTimestamp + 117;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void biometricResult(boolean isFaceLogin, String pin) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 87;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        onConfirmClick(pin);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 71;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    @Override
    public boolean showBiometric() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.showBiometric;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateUI() {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.updateUI():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[PHI: r1
  0x002a: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String formatAmountText(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.getRequestBeneficiariesState
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = "Ksh"
            r3 = 1
            if (r1 != 0) goto L1d
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.contains(r1, r2, r3)
            if (r2 != 0) goto L4d
            goto L2a
        L1d:
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.contains(r1, r2, r3)
            r2 = r2 ^ r3
            if (r2 == r3) goto L2a
            goto L4d
        L2a:
            java.lang.String r2 = "KES"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.contains(r1, r2, r3)
            if (r2 != 0) goto L4d
            java.lang.String r2 = "ksh"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = kotlin.text.StringsKt.contains(r1, r2, r3)
            if (r1 == 0) goto L3f
            goto L4d
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ksh. "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
        L4d:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.getAsAtTimestamp
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L59
            return r5
        L59:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.formatAmountText(java.lang.String):java.lang.String");
    }

    private final void displayDefaultAvatarByName(String name) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ((ActivitySfcBasePinBinding) this.binding).cardAbbr.setVisibility(0);
        DefaultAvatarDisplayUtil defaultAvatarDisplayUtil = DefaultAvatarDisplayUtil.INSTANCE;
        TextView textView = ((ActivitySfcBasePinBinding) this.binding).tvAbbr;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        defaultAvatarDisplayUtil.displayDefaultAvatar(textView, name);
        int i4 = getRequestBeneficiariesState + 7;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public final SpannableString boldWords(String text, String... wordsToBold) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(wordsToBold, "");
        String str = text;
        if (str != null) {
            int i2 = getAsAtTimestamp + 65;
            getRequestBeneficiariesState = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                StringsKt.isBlank(str);
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(str) && wordsToBold.length != 0) {
                SpannableString spannableString = new SpannableString(str);
                int length = wordsToBold.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = getRequestBeneficiariesState + 45;
                    getAsAtTimestamp = i4 % 128;
                    if (i4 % 2 == 0) {
                        StringsKt.isBlank(wordsToBold[i3]);
                        obj.hashCode();
                        throw null;
                    }
                    String str2 = wordsToBold[i3];
                    if (!StringsKt.isBlank(str2)) {
                        for (int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 2, (Object) null); iIndexOf$default >= 0; iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, iIndexOf$default + str2.length(), false, 4, (Object) null)) {
                            spannableString.setSpan(new StyleSpan(1), iIndexOf$default, str2.length() + iIndexOf$default, 33);
                        }
                    }
                    i3++;
                    int i5 = getRequestBeneficiariesState + 109;
                    getAsAtTimestamp = i5 % 128;
                    int i6 = i5 % 2;
                }
                return spannableString;
            }
        }
        if (text == null) {
            int i7 = getRequestBeneficiariesState + 87;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            text = "";
        }
        return new SpannableString(text);
    }

    private final void displayOwerAvatar() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            ProfileHelper.INSTANCE.getCustomer();
            ProfileHelper.INSTANCE.getProfiles().iterator();
            throw null;
        }
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        for (LocalProfileItem localProfileItem : ProfileHelper.INSTANCE.getProfiles()) {
            if (Intrinsics.areEqual(localProfileItem.getName(), "FirstName")) {
                String value = localProfileItem.getValue();
                for (LocalProfileItem localProfileItem2 : ProfileHelper.INSTANCE.getProfiles()) {
                    if (Intrinsics.areEqual(localProfileItem2.getName(), "LastName")) {
                        String value2 = localProfileItem2.getValue();
                        String name = value + " " + value2;
                        String str = "";
                        if (TextUtils.isEmpty(value)) {
                            int i3 = getAsAtTimestamp + 85;
                            getRequestBeneficiariesState = i3 % 128;
                            int i4 = i3 % 2;
                            if (TextUtils.isEmpty(value2) && (customer == null || (name = customer.getName()) == null)) {
                                name = "";
                            }
                        }
                        displayDefaultAvatarByName(name);
                        RequestManager requestManagerWith = Glide.with(((ActivitySfcBasePinBinding) this.binding).ivAvatar);
                        if (customer != null) {
                            String avatar = customer.getAvatar();
                            if (avatar == null) {
                                int i5 = getRequestBeneficiariesState + 95;
                                getAsAtTimestamp = i5 % 128;
                                int i6 = i5 % 2;
                            } else {
                                str = avatar;
                            }
                        }
                        requestManagerWith.load((Object) Base64Mode.getConsumerMode(str)).listener(new RequestListener<Drawable>() {
                            private static int component2 = 0;
                            private static int component3 = 1;

                            @Override
                            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                                int i7 = 2 % 2;
                                int i8 = component3 + 27;
                                component2 = i8 % 128;
                                int i9 = i8 % 2;
                                boolean zOnResourceReady2 = onResourceReady2(drawable, obj, target, dataSource, z);
                                int i10 = component3 + 37;
                                component2 = i10 % 128;
                                int i11 = i10 % 2;
                                return zOnResourceReady2;
                            }

                            public boolean onResourceReady2(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                int i7 = 2 % 2;
                                int i8 = component2 + 69;
                                component3 = i8 % 128;
                                int i9 = i8 % 2;
                                Intrinsics.checkNotNullParameter(resource, "");
                                Intrinsics.checkNotNullParameter(model, "");
                                Intrinsics.checkNotNullParameter(dataSource, "");
                                ((ActivitySfcBasePinBinding) SfcIdentityPinActivity.access$getBinding$p(SfcIdentityPinActivity.this)).cardAbbr.setVisibility(8);
                                int i10 = component2 + 77;
                                component3 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    int i11 = 2 / 0;
                                }
                                return false;
                            }

                            @Override
                            public boolean onLoadFailed(GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                int i7 = 2 % 2;
                                int i8 = component2 + 101;
                                component3 = i8 % 128;
                                int i9 = i8 % 2;
                                Intrinsics.checkNotNullParameter(target, "");
                                int i10 = component2 + 77;
                                component3 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return false;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        }).into(((ActivitySfcBasePinBinding) this.binding).ivAvatar);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0150  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(74:0|2|(2:4|(2:(2:9|(2:11|(2:16|(1:20)(1:19))(0))(2:14|(0)(0)))(1:21)|(9:23|953|24|(1:26)|27|28|29|(1:31)|32)(1:7))(0))(0)|36|(3:922|37|(11:39|902|40|44|45|887|(2:47|(5:49|50|(1:52)|53|54)(4:55|(1:57)|58|59))(19:61|62|914|63|64|894|65|(2:969|67)|71|72|73|(3:75|947|76)|80|81|82|(1:84)|85|(1:87)|88)|60|89|(9:92|879|93|(1:95)|96|97|98|868|99)|100)(8:44|45|887|(0)(0)|60|89|(0)|100))|(3:913|138|(1:144)(1:143))(1:148)|149|872|150|(1:152)|153|860|154|(1:156)|157|158|181|917|182|(14:933|184|188|(6:190|924|191|192|916|193)(1:199)|905|200|201|968|(4:203|204|(1:206)|207)(13:(2:211|(1:217)(1:216))(1:219)|(24:221|222|883|223|870|224|(2:943|226)|230|231|852|232|(2:971|234)|238|239|240|(3:242|955|243)|247|248|975|249|(2:973|251)(1:253)|254|(2:256|257)|258)(2:313|314)|316|319|320|928|321|324|325|(1:327)|328|329|330)|259|(4:262|(2:264|981)(11:265|(3:267|(4:270|271|272|268)|982)|275|963|276|(1:278)|279|280|959|281|980)|282|260)|979|296|314)(12:188|(0)(0)|905|200|201|968|(0)(0)|259|(1:260)|979|296|314)|331|(9:967|332|(1:334)|335|(3:337|(1:339)|340)(22:341|342|965|343|344|961|345|(2:935|347)|351|352|951|353|(2:949|355)|359|360|361|(3:363|911|364)|368|(1:370)(1:372)|373|(1:375)|376)|377|(4:380|(2:382|985)(11:383|(3:385|(3:388|389|386)|986)|390|937|391|(1:393)|394|395|926|396|984)|397|378)|983|409)|437|919|438|(1:440)|441|(3:443|(1:445)|446)(22:447|448|907|449|450|888|451|(2:862|453)|457|458|876|459|(2:885|461)|465|466|467|(3:469|881|470)|471|(1:473)(1:475)|476|(1:478)|479)|480|(5:483|484|(2:486|989)(11:487|(3:489|(3:492|493|490)|990)|496|864|497|(1:499)|500|501|977|502|988)|503|481)|987|515|543|(1:545)|546|(3:548|(1:550)|551)(14:552|553|(1:555)|556|557|(1:559)|560|930|561|562|(1:564)(1:565)|566|(1:568)|569)|570|(1:572)(9:573|(3:575|(2:578|576)|996)|579|580|(1:582)|583|(1:585)|586|587)|588|(1:590)|591|(1:593)(1:594)|595|(3:597|(1:599)|600)(16:602|603|(1:605)|606|(1:608)|609|610|(1:612)|613|945|614|615|(1:617)|618|(1:620)|621)|601|622|(1:624)(9:625|(3:627|(2:630|628)|995)|631|632|(1:634)|635|(1:637)|638|639)|640|932|641|(1:643)|644|(1:646)|647|(3:649|(1:651)|652)(17:653|(2:655|(1:661)(1:660))|(22:663|664|892|665|666|920|667|(2:898|669)|673|674|900|675|(3:677|941|678)|682|683|684|(2:909|686)|687|(1:689)(1:691)|692|(1:694)|695)|758|(1:760)|761|(3:763|(1:765)|766)(13:768|856|769|770|(1:772)|773|957|774|775|(1:777)|778|(1:780)|781)|767|782|(6:785|786|(1:788)|789|790|791)|792|(1:794)|795|(3:797|(1:799)|800)(14:802|803|(1:805)|806|807|(1:809)|810|890|811|812|(1:814)|815|(1:817)|818)|801|819|(1:997)(7:822|823|(1:825)|826|827|828|829))|696|(4:699|(2:701|993)(11:702|(3:704|(3:707|708|705)|994)|711|874|712|(1:714)|715|716|866|717|992)|718|697)|991|730|758|(0)|761|(0)(0)|767|782|(0)|792|(0)|795|(0)(0)|801|819|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(76:0|2|(2:4|(2:(2:9|(2:11|(2:16|(1:20)(1:19))(0))(2:14|(0)(0)))(1:21)|(9:23|953|24|(1:26)|27|28|29|(1:31)|32)(1:7))(0))(0)|36|922|37|(11:39|902|40|44|45|887|(2:47|(5:49|50|(1:52)|53|54)(4:55|(1:57)|58|59))(19:61|62|914|63|64|894|65|(2:969|67)|71|72|73|(3:75|947|76)|80|81|82|(1:84)|85|(1:87)|88)|60|89|(9:92|879|93|(1:95)|96|97|98|868|99)|100)(8:44|45|887|(0)(0)|60|89|(0)|100)|(3:913|138|(1:144)(1:143))(1:148)|149|872|150|(1:152)|153|860|154|(1:156)|157|158|181|917|182|(14:933|184|188|(6:190|924|191|192|916|193)(1:199)|905|200|201|968|(4:203|204|(1:206)|207)(13:(2:211|(1:217)(1:216))(1:219)|(24:221|222|883|223|870|224|(2:943|226)|230|231|852|232|(2:971|234)|238|239|240|(3:242|955|243)|247|248|975|249|(2:973|251)(1:253)|254|(2:256|257)|258)(2:313|314)|316|319|320|928|321|324|325|(1:327)|328|329|330)|259|(4:262|(2:264|981)(11:265|(3:267|(4:270|271|272|268)|982)|275|963|276|(1:278)|279|280|959|281|980)|282|260)|979|296|314)(12:188|(0)(0)|905|200|201|968|(0)(0)|259|(1:260)|979|296|314)|331|(9:967|332|(1:334)|335|(3:337|(1:339)|340)(22:341|342|965|343|344|961|345|(2:935|347)|351|352|951|353|(2:949|355)|359|360|361|(3:363|911|364)|368|(1:370)(1:372)|373|(1:375)|376)|377|(4:380|(2:382|985)(11:383|(3:385|(3:388|389|386)|986)|390|937|391|(1:393)|394|395|926|396|984)|397|378)|983|409)|437|919|438|(1:440)|441|(3:443|(1:445)|446)(22:447|448|907|449|450|888|451|(2:862|453)|457|458|876|459|(2:885|461)|465|466|467|(3:469|881|470)|471|(1:473)(1:475)|476|(1:478)|479)|480|(5:483|484|(2:486|989)(11:487|(3:489|(3:492|493|490)|990)|496|864|497|(1:499)|500|501|977|502|988)|503|481)|987|515|543|(1:545)|546|(3:548|(1:550)|551)(14:552|553|(1:555)|556|557|(1:559)|560|930|561|562|(1:564)(1:565)|566|(1:568)|569)|570|(1:572)(9:573|(3:575|(2:578|576)|996)|579|580|(1:582)|583|(1:585)|586|587)|588|(1:590)|591|(1:593)(1:594)|595|(3:597|(1:599)|600)(16:602|603|(1:605)|606|(1:608)|609|610|(1:612)|613|945|614|615|(1:617)|618|(1:620)|621)|601|622|(1:624)(9:625|(3:627|(2:630|628)|995)|631|632|(1:634)|635|(1:637)|638|639)|640|932|641|(1:643)|644|(1:646)|647|(3:649|(1:651)|652)(17:653|(2:655|(1:661)(1:660))|(22:663|664|892|665|666|920|667|(2:898|669)|673|674|900|675|(3:677|941|678)|682|683|684|(2:909|686)|687|(1:689)(1:691)|692|(1:694)|695)|758|(1:760)|761|(3:763|(1:765)|766)(13:768|856|769|770|(1:772)|773|957|774|775|(1:777)|778|(1:780)|781)|767|782|(6:785|786|(1:788)|789|790|791)|792|(1:794)|795|(3:797|(1:799)|800)(14:802|803|(1:805)|806|807|(1:809)|810|890|811|812|(1:814)|815|(1:817)|818)|801|819|(1:997)(7:822|823|(1:825)|826|827|828|829))|696|(4:699|(2:701|993)(11:702|(3:704|(3:707|708|705)|994)|711|874|712|(1:714)|715|716|866|717|992)|718|697)|991|730|758|(0)|761|(0)(0)|767|782|(0)|792|(0)|795|(0)(0)|801|819|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x21d3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x3460, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0c7f A[Catch: all -> 0x07f4, TryCatch #54 {all -> 0x07f4, blocks: (B:130:0x0c79, B:132:0x0c7f, B:133:0x0cab, B:325:0x1712, B:327:0x1718, B:328:0x1740, B:786:0x38a4, B:788:0x38aa, B:789:0x38d0, B:823:0x3be0, B:825:0x3be6, B:826:0x3c0b, B:803:0x3a19, B:805:0x3a3c, B:806:0x3a92, B:752:0x3579, B:754:0x357f, B:755:0x35ab, B:632:0x2df5, B:634:0x2dfb, B:635:0x2e22, B:637:0x2e5c, B:638:0x2ea2, B:603:0x2aa2, B:605:0x2ab7, B:606:0x2ae4, B:608:0x2b18, B:609:0x2b8d, B:580:0x2718, B:582:0x271e, B:583:0x2748, B:585:0x2782, B:586:0x27ca, B:553:0x247f, B:555:0x2494, B:556:0x24c4, B:537:0x229a, B:539:0x22a0, B:540:0x22c8, B:431:0x1cd3, B:433:0x1cd9, B:434:0x1d05, B:175:0x0ede, B:177:0x0ee4, B:178:0x0f10, B:24:0x0499, B:26:0x049f, B:27:0x04c9, B:29:0x0765, B:31:0x0797, B:32:0x07ee), top: B:953:0x0499 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0d6b A[Catch: all -> 0x0e32, TryCatch #10 {all -> 0x0e32, blocks: (B:150:0x0d56, B:152:0x0d6b, B:153:0x0d9d), top: B:872:0x0d56, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0db0 A[Catch: all -> 0x0e28, TryCatch #4 {all -> 0x0e28, blocks: (B:154:0x0da3, B:156:0x0db0, B:157:0x0e1d), top: B:860:0x0da3, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0478 A[PHI: r13
  0x0478: PHI (r13v32 int) = (r13v31 int), (r13v228 int) binds: [B:15:0x0476, B:12:0x0471] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0fe9 A[Catch: all -> 0x1652, PHI: r2
  0x0fe9: PHI (r2v563 java.lang.Object) = (r2v559 java.lang.Object), (r2v562 java.lang.Object) binds: [B:183:0x0f9b, B:184:0x0f9d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x1652, blocks: (B:182:0x0f97, B:188:0x0fe9), top: B:917:0x0f97 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1060  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0484 A[PHI: r13
  0x0484: PHI (r13v33 int) = (r13v212 int), (r13v223 int), (r13v224 int) binds: [B:15:0x0476, B:17:0x047f, B:12:0x0471] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x10d3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x14db A[Catch: all -> 0x161a, TryCatch #66 {all -> 0x161a, blocks: (B:259:0x14d1, B:260:0x14d5, B:262:0x14db, B:265:0x14f8, B:249:0x140b, B:254:0x146e, B:258:0x14c9), top: B:975:0x140b }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x1718 A[Catch: all -> 0x07f4, TryCatch #54 {all -> 0x07f4, blocks: (B:130:0x0c79, B:132:0x0c7f, B:133:0x0cab, B:325:0x1712, B:327:0x1718, B:328:0x1740, B:786:0x38a4, B:788:0x38aa, B:789:0x38d0, B:823:0x3be0, B:825:0x3be6, B:826:0x3c0b, B:803:0x3a19, B:805:0x3a3c, B:806:0x3a92, B:752:0x3579, B:754:0x357f, B:755:0x35ab, B:632:0x2df5, B:634:0x2dfb, B:635:0x2e22, B:637:0x2e5c, B:638:0x2ea2, B:603:0x2aa2, B:605:0x2ab7, B:606:0x2ae4, B:608:0x2b18, B:609:0x2b8d, B:580:0x2718, B:582:0x271e, B:583:0x2748, B:585:0x2782, B:586:0x27ca, B:553:0x247f, B:555:0x2494, B:556:0x24c4, B:537:0x229a, B:539:0x22a0, B:540:0x22c8, B:431:0x1cd3, B:433:0x1cd9, B:434:0x1d05, B:175:0x0ede, B:177:0x0ee4, B:178:0x0f10, B:24:0x0499, B:26:0x049f, B:27:0x04c9, B:29:0x0765, B:31:0x0797, B:32:0x07ee), top: B:953:0x0499 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x17d0 A[Catch: all -> 0x1c10, TryCatch #61 {all -> 0x1c10, blocks: (B:332:0x17ca, B:334:0x17d0, B:335:0x1812, B:337:0x181f, B:339:0x1828, B:340:0x186e, B:400:0x1bde, B:402:0x1be4, B:403:0x1be5, B:405:0x1be7, B:407:0x1bee, B:408:0x1bef, B:341:0x187b, B:412:0x1bf8, B:414:0x1bfe, B:415:0x1bff, B:418:0x1c04, B:420:0x1c0a, B:421:0x1c0b, B:396:0x1b60, B:391:0x1b1d, B:393:0x1b23, B:394:0x1b4e), top: B:967:0x17ca, inners: #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x181f A[Catch: all -> 0x1c10, TryCatch #61 {all -> 0x1c10, blocks: (B:332:0x17ca, B:334:0x17d0, B:335:0x1812, B:337:0x181f, B:339:0x1828, B:340:0x186e, B:400:0x1bde, B:402:0x1be4, B:403:0x1be5, B:405:0x1be7, B:407:0x1bee, B:408:0x1bef, B:341:0x187b, B:412:0x1bf8, B:414:0x1bfe, B:415:0x1bff, B:418:0x1c04, B:420:0x1c0a, B:421:0x1c0b, B:396:0x1b60, B:391:0x1b1d, B:393:0x1b23, B:394:0x1b4e), top: B:967:0x17ca, inners: #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x187b A[Catch: all -> 0x1c10, TRY_LEAVE, TryCatch #61 {all -> 0x1c10, blocks: (B:332:0x17ca, B:334:0x17d0, B:335:0x1812, B:337:0x181f, B:339:0x1828, B:340:0x186e, B:400:0x1bde, B:402:0x1be4, B:403:0x1be5, B:405:0x1be7, B:407:0x1bee, B:408:0x1bef, B:341:0x187b, B:412:0x1bf8, B:414:0x1bfe, B:415:0x1bff, B:418:0x1c04, B:420:0x1c0a, B:421:0x1c0b, B:396:0x1b60, B:391:0x1b1d, B:393:0x1b23, B:394:0x1b4e), top: B:967:0x17ca, inners: #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x1ab7 A[Catch: all -> 0x1c0c, TryCatch #60 {all -> 0x1c0c, blocks: (B:377:0x1aad, B:378:0x1ab1, B:380:0x1ab7, B:383:0x1ad3, B:343:0x1889, B:361:0x1985, B:368:0x19d6, B:373:0x1a49, B:376:0x1aa5), top: B:965:0x1889 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x1cd9 A[Catch: all -> 0x07f4, TryCatch #54 {all -> 0x07f4, blocks: (B:130:0x0c79, B:132:0x0c7f, B:133:0x0cab, B:325:0x1712, B:327:0x1718, B:328:0x1740, B:786:0x38a4, B:788:0x38aa, B:789:0x38d0, B:823:0x3be0, B:825:0x3be6, B:826:0x3c0b, B:803:0x3a19, B:805:0x3a3c, B:806:0x3a92, B:752:0x3579, B:754:0x357f, B:755:0x35ab, B:632:0x2df5, B:634:0x2dfb, B:635:0x2e22, B:637:0x2e5c, B:638:0x2ea2, B:603:0x2aa2, B:605:0x2ab7, B:606:0x2ae4, B:608:0x2b18, B:609:0x2b8d, B:580:0x2718, B:582:0x271e, B:583:0x2748, B:585:0x2782, B:586:0x27ca, B:553:0x247f, B:555:0x2494, B:556:0x24c4, B:537:0x229a, B:539:0x22a0, B:540:0x22c8, B:431:0x1cd3, B:433:0x1cd9, B:434:0x1d05, B:175:0x0ede, B:177:0x0ee4, B:178:0x0f10, B:24:0x0499, B:26:0x049f, B:27:0x04c9, B:29:0x0765, B:31:0x0797, B:32:0x07ee), top: B:953:0x0499 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1d97 A[Catch: all -> 0x21d3, TryCatch #36 {all -> 0x21d3, blocks: (B:438:0x1d91, B:440:0x1d97, B:441:0x1ddb, B:443:0x1de8, B:445:0x1df1, B:446:0x1e30, B:506:0x21a1, B:508:0x21a7, B:509:0x21a8, B:511:0x21aa, B:513:0x21b1, B:514:0x21b2, B:447:0x1e3d, B:518:0x21bb, B:520:0x21c1, B:521:0x21c2, B:524:0x21c7, B:526:0x21cd, B:527:0x21ce, B:497:0x20e8, B:499:0x20ee, B:500:0x2116, B:502:0x211e), top: B:919:0x1d91, inners: #6, #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1de8 A[Catch: all -> 0x21d3, TryCatch #36 {all -> 0x21d3, blocks: (B:438:0x1d91, B:440:0x1d97, B:441:0x1ddb, B:443:0x1de8, B:445:0x1df1, B:446:0x1e30, B:506:0x21a1, B:508:0x21a7, B:509:0x21a8, B:511:0x21aa, B:513:0x21b1, B:514:0x21b2, B:447:0x1e3d, B:518:0x21bb, B:520:0x21c1, B:521:0x21c2, B:524:0x21c7, B:526:0x21cd, B:527:0x21ce, B:497:0x20e8, B:499:0x20ee, B:500:0x2116, B:502:0x211e), top: B:919:0x1d91, inners: #6, #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1e3d A[Catch: all -> 0x21d3, TRY_LEAVE, TryCatch #36 {all -> 0x21d3, blocks: (B:438:0x1d91, B:440:0x1d97, B:441:0x1ddb, B:443:0x1de8, B:445:0x1df1, B:446:0x1e30, B:506:0x21a1, B:508:0x21a7, B:509:0x21a8, B:511:0x21aa, B:513:0x21b1, B:514:0x21b2, B:447:0x1e3d, B:518:0x21bb, B:520:0x21c1, B:521:0x21c2, B:524:0x21c7, B:526:0x21cd, B:527:0x21ce, B:497:0x20e8, B:499:0x20ee, B:500:0x2116, B:502:0x211e), top: B:919:0x1d91, inners: #6, #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x207c  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x22a0 A[Catch: all -> 0x07f4, TryCatch #54 {all -> 0x07f4, blocks: (B:130:0x0c79, B:132:0x0c7f, B:133:0x0cab, B:325:0x1712, B:327:0x1718, B:328:0x1740, B:786:0x38a4, B:788:0x38aa, B:789:0x38d0, B:823:0x3be0, B:825:0x3be6, B:826:0x3c0b, B:803:0x3a19, B:805:0x3a3c, B:806:0x3a92, B:752:0x3579, B:754:0x357f, B:755:0x35ab, B:632:0x2df5, B:634:0x2dfb, B:635:0x2e22, B:637:0x2e5c, B:638:0x2ea2, B:603:0x2aa2, B:605:0x2ab7, B:606:0x2ae4, B:608:0x2b18, B:609:0x2b8d, B:580:0x2718, B:582:0x271e, B:583:0x2748, B:585:0x2782, B:586:0x27ca, B:553:0x247f, B:555:0x2494, B:556:0x24c4, B:537:0x229a, B:539:0x22a0, B:540:0x22c8, B:431:0x1cd3, B:433:0x1cd9, B:434:0x1d05, B:175:0x0ede, B:177:0x0ee4, B:178:0x0f10, B:24:0x0499, B:26:0x049f, B:27:0x04c9, B:29:0x0765, B:31:0x0797, B:32:0x07ee), top: B:953:0x0499 }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x2352  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x23a5  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x245d  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x25fe  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x26da  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x2905  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x296f  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x29bb  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x29d0  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x2a84  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0918 A[Catch: all -> 0x0bd5, TRY_ENTER, TRY_LEAVE, TryCatch #38 {all -> 0x0bd5, blocks: (B:37:0x07fd, B:44:0x0851, B:61:0x0918), top: B:922:0x07fd }] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2cc1  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x2db2  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x2fb1 A[Catch: all -> 0x3460, TryCatch #43 {all -> 0x3460, blocks: (B:641:0x2fab, B:643:0x2fb1, B:644:0x2ff1, B:646:0x3018, B:647:0x3054, B:649:0x306a, B:651:0x3073, B:652:0x30b4, B:721:0x342e, B:723:0x3434, B:724:0x3435, B:726:0x3437, B:728:0x343e, B:729:0x343f, B:655:0x30c5, B:657:0x30c9, B:661:0x30d5, B:663:0x30db, B:735:0x344c, B:737:0x3452, B:738:0x3453, B:741:0x3458, B:743:0x345e, B:744:0x345f, B:717:0x33b6, B:712:0x337d, B:714:0x3383, B:715:0x33ae), top: B:932:0x2fab, inners: #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x3018 A[Catch: all -> 0x3460, TryCatch #43 {all -> 0x3460, blocks: (B:641:0x2fab, B:643:0x2fb1, B:644:0x2ff1, B:646:0x3018, B:647:0x3054, B:649:0x306a, B:651:0x3073, B:652:0x30b4, B:721:0x342e, B:723:0x3434, B:724:0x3435, B:726:0x3437, B:728:0x343e, B:729:0x343f, B:655:0x30c5, B:657:0x30c9, B:661:0x30d5, B:663:0x30db, B:735:0x344c, B:737:0x3452, B:738:0x3453, B:741:0x3458, B:743:0x345e, B:744:0x345f, B:717:0x33b6, B:712:0x337d, B:714:0x3383, B:715:0x33ae), top: B:932:0x2fab, inners: #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x306a A[Catch: all -> 0x3460, TryCatch #43 {all -> 0x3460, blocks: (B:641:0x2fab, B:643:0x2fb1, B:644:0x2ff1, B:646:0x3018, B:647:0x3054, B:649:0x306a, B:651:0x3073, B:652:0x30b4, B:721:0x342e, B:723:0x3434, B:724:0x3435, B:726:0x3437, B:728:0x343e, B:729:0x343f, B:655:0x30c5, B:657:0x30c9, B:661:0x30d5, B:663:0x30db, B:735:0x344c, B:737:0x3452, B:738:0x3453, B:741:0x3458, B:743:0x345e, B:744:0x345f, B:717:0x33b6, B:712:0x337d, B:714:0x3383, B:715:0x33ae), top: B:932:0x2fab, inners: #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:653:0x30c1  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x331d A[Catch: all -> 0x3444, TryCatch #21 {all -> 0x3444, blocks: (B:696:0x3313, B:697:0x3317, B:699:0x331d, B:702:0x3338, B:665:0x30e9, B:684:0x31fa, B:687:0x3241, B:692:0x32b0, B:695:0x330b), top: B:892:0x30e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x357f A[Catch: all -> 0x07f4, TryCatch #54 {all -> 0x07f4, blocks: (B:130:0x0c79, B:132:0x0c7f, B:133:0x0cab, B:325:0x1712, B:327:0x1718, B:328:0x1740, B:786:0x38a4, B:788:0x38aa, B:789:0x38d0, B:823:0x3be0, B:825:0x3be6, B:826:0x3c0b, B:803:0x3a19, B:805:0x3a3c, B:806:0x3a92, B:752:0x3579, B:754:0x357f, B:755:0x35ab, B:632:0x2df5, B:634:0x2dfb, B:635:0x2e22, B:637:0x2e5c, B:638:0x2ea2, B:603:0x2aa2, B:605:0x2ab7, B:606:0x2ae4, B:608:0x2b18, B:609:0x2b8d, B:580:0x2718, B:582:0x271e, B:583:0x2748, B:585:0x2782, B:586:0x27ca, B:553:0x247f, B:555:0x2494, B:556:0x24c4, B:537:0x229a, B:539:0x22a0, B:540:0x22c8, B:431:0x1cd3, B:433:0x1cd9, B:434:0x1d05, B:175:0x0ede, B:177:0x0ee4, B:178:0x0f10, B:24:0x0499, B:26:0x049f, B:27:0x04c9, B:29:0x0765, B:31:0x0797, B:32:0x07ee), top: B:953:0x0499 }] */
    /* JADX WARN: Removed duplicated region for block: B:760:0x362e  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x367c  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x36d4  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x3886  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x395d  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x39ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0451 A[PHI: r13
  0x0451: PHI (r13v210 int) = (r13v17 int), (r13v211 int) binds: [B:22:0x048a, B:5:0x044e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:802:0x39fb  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x3bc0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x045d A[PHI: r13
  0x045d: PHI (r13v16 int) = (r13v15 int), (r13v213 int) binds: [B:3:0x0449, B:5:0x044e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:913:0x0d3b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:933:0x0f9d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:997:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v188 */
    /* JADX WARN: Type inference failed for: r13v189 */
    /* JADX WARN: Type inference failed for: r13v190 */
    /* JADX WARN: Type inference failed for: r13v191 */
    /* JADX WARN: Type inference failed for: r13v201 */
    /* JADX WARN: Type inference failed for: r13v204 */
    /* JADX WARN: Type inference failed for: r13v205 */
    /* JADX WARN: Type inference failed for: r13v208 */
    /* JADX WARN: Type inference failed for: r13v214 */
    /* JADX WARN: Type inference failed for: r13v215 */
    /* JADX WARN: Type inference failed for: r13v216 */
    /* JADX WARN: Type inference failed for: r13v217 */
    /* JADX WARN: Type inference failed for: r13v218 */
    /* JADX WARN: Type inference failed for: r13v219 */
    /* JADX WARN: Type inference failed for: r13v220 */
    /* JADX WARN: Type inference failed for: r13v221 */
    /* JADX WARN: Type inference failed for: r13v222 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v118 */
    /* JADX WARN: Type inference failed for: r9v124 */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v132 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v196 */
    /* JADX WARN: Type inference failed for: r9v197 */
    /* JADX WARN: Type inference failed for: r9v198 */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v200 */
    /* JADX WARN: Type inference failed for: r9v201 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v203 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v78, types: [long] */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v80 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 16136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcIdentityPinActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$MXD5eH6pE88RpUpVX6Mef4QFsRY(SfcIdentityPinActivity sfcIdentityPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            addObserver$lambda$0(sfcIdentityPinActivity, resource);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAddObserver$lambda$0 = addObserver$lambda$0(sfcIdentityPinActivity, resource);
        int i3 = getRequestBeneficiariesState + 93;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return unitAddObserver$lambda$0;
    }

    static {
        toString = 0;
        component2();
        int i = getSponsorBeneficiariesState + 17;
        toString = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = getAsAtTimestamp + 9;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    static void component2() {
        ShareDataUIState = -1201021960;
        component2 = -238323860;
        component1 = 953110943;
        copydefault = new byte[]{-28, 123, 73, 125, 111, 102, 93, 93, 36, 127, -70, TarHeader.LF_DIR, 100, 101, 102, 73, 97, 118, -23, Ascii.SYN, 113, 9, 121, -28, -110, -21, -104, -26, -109, -97, -112, -111, -107, -62, -96, -21, -20, -122, -107, -112, -25, -30, Ascii.SO, TarHeader.LF_SYMLINK, 123, 40, TarHeader.LF_SYMLINK, 17, Ascii.SYN, -36, 2, Ascii.CAN, TarHeader.LF_SYMLINK, 5, 6, Ascii.SO, 8, -8, -108, -128, -111, -9, -94, -108, -113, -97, -122, -14, -13, 89, -112, -33, 86, -103, -122, -101, -22, -126, -21, -29, 122, 118, 121, 74, 79, 126, 71, 96, 115, 100, 119, 67, 121, 75, -46, -30, -44, -27, -19, -32, -119, -27, -36, -119, -29, -44, -75, -18, -47, -73, -44, -73, -46, -80, -31, 41, -32, -80, -47, -25, -29, -32, -26, -17, -119, -33, -5, -66, -41, -75, -32, -47, -27, -26, -32, -78, -27, -28, -33, -78, -43, -29, -76, -41, -32, -32, -73, -31, -43, -75, -34, -120, -29, -29, -41, -66, -33, -73, -46, -117, -5, -43, -8, -6, -75, -7, 44, -73, -5, -45, -26, -118, -3, -45, -115, -42, -26, -8, -7, -73, 44, -25, -6, -31, -3, -28, -25, -8, -4, -29, -2, -7, -76, 45, -8, -73, 40, -31, -127, -44, -3, -29, -8, -28, -4, -25, -120, -7, -26, -42, -26, -26, -2, -73, -25, -42, -116, -41, -117, -27, -41, -25, -20, 123, 116, 115, 115, 122, 112, 115, 117, 127, -20, 66, 92, SignedBytes.MAX_POWER_OF_TWO, 70, 66, 90, SignedBytes.MAX_POWER_OF_TWO, 92, 69};
        equals = -3780477796495014671L;
        copy = 1386857713;
        component4 = Typography.lowSingleQuote;
    }
}
