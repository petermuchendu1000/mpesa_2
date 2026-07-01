package com.huawei.digitalpayment.consumer.qrcode.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.keyboard.CustomKeyBroadPop;
import com.huawei.common.widget.keyboard.CustomKeyBroadType;
import com.huawei.common.widget.keyboard.OnKeyListener;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.util.AmountUtils;
import com.huawei.digitalpayment.consumer.baselib.widget.text.TypefaceManager;
import com.huawei.digitalpayment.consumer.qrcode.R;
import com.huawei.digitalpayment.consumer.qrcode.databinding.ActivitySetAmountBinding;
import com.huawei.digitalpayment.consumer.qrcode.viewmodel.SetAmountModel;
import com.huawei.digitalpayment.form.validator.ValidatorManager;
import com.huawei.digitalpayment.form.validator.response.LocalValidatorItem;
import com.huawei.digitalpayment.form.validator.response.ValidatorCheckResult;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.cancelNotification;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

public class SetAmountActivity extends Hilt_SetAmountActivity<ActivitySetAmountBinding, SetAmountModel> {
    private static final String CATEGORY_RECEIVE = "Receive";
    private CustomKeyBroadPop popupWindow;
    private LocalValidatorItem validatorItem;
    private static final byte[] $$l = {119, -58, 7, 71};
    private static final int $$o = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM, -9, 5, 66, -48, -8, 6, 10, 4, 2, 4, TarHeader.LF_FIFO, -54, -8, Ascii.FF, -10, 20, -10, 71, -59, 0, -2, 3, Ascii.SO, 7, 58, -27, -32, -2, 3, Ascii.SO, 7, 36, -43, 20, -19, Ascii.EM, 2, -7, 10, 68, -10, 2, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 69, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 68, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, 3, Ascii.DC2, -18, 10, -14, Ascii.DLE, 36, -26, -16, Ascii.SYN, Ascii.SI, Ascii.SI, -7, -30, Ascii.SYN, -16, Ascii.DC2};
    private static final int $$k = 75;
    private static final byte[] $$d = {101, 74, 115, 66, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 195;
    private static int copydefault = 0;
    private static int ShareDataUIState = 1;
    private static char[] component1 = {28463, 49265, 12680, 25295, 53861, 946, 29900, 42071, 5545, 18148, 46666, 59237, 22768, 34876, 63811, 10900, 39469, 52060, 3093, 41810, 21158, 503, 45399, 24717, 6116, 50944, 30350, 9695, 54576, 33892, 15321, 60170, 39532, 18848, 63753, 43129, 3095, 41758, 21221, 483, 45316, 24788, 6131, 50980, 30414, 9676, 54634, 33844, 15235, 60248, 39549, 18943, 63748, 43046, 24561, 3904, 48707, 28128, 7350, 52308, 25562, 4775, 49706, 29129, 8392, 53306, 34670, 14047, 58931, 38246, 17540, 62548, 43808, 23290, 2579, 47424, 26856, 8123, 53004, 32472, 11694, 56700, 36044, 9163, 23143, 62816, 1229, 22464, 59170, 14068, 16771, 37205, 8425, 29677, 33566, 53834, 28076, 48506, 52236, 8074, 44834, 65109, 2512, 22881, 59441, 15301, 19097, 39462, 13819, 17626, 37979, 10223, 30447, 34377, 53530, 24830, 45127, 49936, 4854, 41588, 64770, 3206, 23657, 61285, 16072, 18840, 39204, 10491, 31627, 35667, 56043, 30187, 34134, 54497, 26598, 46925, 50706, 4514, 41329, 61522, 910, 21307, 57909, 15822, 19613, 39982, 12284, 32475, 51394, 26511, 38524, 50473, 30109, 41989, 54115, 946, 45588, 57670, 4536, 16614, 65365, 12241, 24304, 36128, 15755, 27901, 39722, 52123, 31434, 43320, 55359, 2191, 42780, 54839, 1784, 46419, 58387, 5350, 17312, 61958, 8939, 20904, 32796, 12439, 28585, 40554, 52941, 32143, 44134, 56096, 2961, 47684, 59687, 6629, 18497, 59227, 6137, 17988, 62741, 9638, 21695, 33567, 13269, 25314, 37243, 49613, 28823, 44900, 56869, 3731, 48411, 60467, 7384, 19220, 64045, 10991, 22859, 34833, 14584, 22446, 3151, 41737, 21221, 433, 45340, 24784, 3090, 41750, 21173, 435, 45318, 24784, 6130, 51063, 30419, 9631, 54636, 33845, 15242, 60230, 39468, 18940, 63827, 43041, 24553, 3860, 48662, 28131, 7394, 52252, 25560, 4858, 49784, 29080, 8338, 53359, 34609, 13967, 58935, 38195, 17539, 62549, 3100, 41798, 21154, 484, 45340, 24719, 6129, 50991, 30361, 9601, 54543, 33908, 15305, 60191, 39549, 18852, 43636, 1402, 62676, 42961, 5941, 50917, 45461, 24850, 53497, 33791, 29533, 8715, 40427, 19772, 15437, 61385, 24372, 3654, 63942, 43303, 6183, 52180, 47744, 27233, 50616, 46285, 25631, 55293, 34476, 30220, 8458, 37103, 16395, 13063, 58089, 21045, 3406, 64657, 44065, 8061, 52959, 47576, 26985, 55535, 35741, 31518, 11005, 34297, 30020, 9386, 38822, 18259, 13909, 57778, 20832, Matrix.MATRIX_TYPE_RANDOM_LT, 62409, 41855, 4721, 52622, 48350, 27758, 57327, 36510, 3138, 41749, 21229, 433, 45323, 24789, 6055, 51059, 30407, 9625};
    private static long component2 = 3283121393595622183L;
    private static int component3 = -890926393;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r5, short r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.$$l
            int r7 = 122 - r7
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.$$r(int, short, short):java.lang.String");
    }

    private static void i(int i, int i2, short s, Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = i2 + 4;
        int i4 = 103 - (s * 2);
        byte[] bArr2 = new byte[i + 4];
        int i5 = i + 3;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i5 + (-i3);
            i3++;
            i4 = i7 - 8;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i4;
            int i10 = i3;
            int i11 = i9 + (-bArr[i3]);
            i3 = i10 + 1;
            i4 = i11 - 8;
            i6 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r7 = 105 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.$$j
            int r6 = 43 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.j(int, int, byte, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(SetAmountActivity setAmountActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = setAmountActivity.binding;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return binding;
    }

    private static void g(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $10 + 83;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16775458) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 34, (char) (Process.myPid() >> 22), 1159210934, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component2), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3609 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.RS, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7170), 1951385784, false, $$r(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((-16773203) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (char) (27760 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -1529629956, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        int i7 = $10 + 31;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
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
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 24, (char) (27761 - Color.argb(0, 0, 0, 0)), -1529629956, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void h(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i2 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 3784, 38 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 26860), 2015799920, false, $$r(b2, b3, (byte) (b3 | 57)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16 - (ViewConfiguration.getTapTimeout() >> 16), (char) TextUtils.getTrimmedLength(""), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i8 = $10 + 49;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Color.green(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, (char) (Color.rgb(0, 0, 0) + 16777216), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0113  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.onCreate(android.os.Bundle):void");
    }

    private void lambda$initOnclick$0(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        getAddNoteDialog();
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
    }

    private void lambda$initOnclick$1(View view) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("amount", AmountUtils.INSTANCE.formatAmount(((ActivitySetAmountBinding) this.binding).inputAmount.getEditText().getText().toString()));
        intent.putExtra("note", ((SetAmountModel) this.viewModel).getNote());
        setResult(-1, intent);
        finish();
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initOnclick() {
        int i = 2 % 2;
        ((ActivitySetAmountBinding) this.binding).tvAddNotes.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    SetAmountActivity.$r8$lambda$NkoyqM0WN_snzg8AOHn6ImNJTVk(this.f$0, view);
                    int i4 = 92 / 0;
                } else {
                    SetAmountActivity.$r8$lambda$NkoyqM0WN_snzg8AOHn6ImNJTVk(this.f$0, view);
                }
                int i5 = ShareDataUIState + 119;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivitySetAmountBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 95;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SetAmountActivity.m10908$r8$lambda$O5EO5KRUlWTKDeO2kpakwgJcAE(this.f$0, view);
                int i5 = component1 + 55;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivitySetAmountBinding) this.binding).tvAmend.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 17;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SetAmountActivity.$r8$lambda$4x1y5cAT_gPVQCsjAqqFiXXzTe8(this.f$0, view);
                int i5 = component1 + 21;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$initOnclick$2(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        getAddNoteDialog();
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
    }

    private void hideKeyboardIfNeed() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (!this.popupWindow.isShowing()) {
            return;
        }
        int i4 = ShareDataUIState + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        this.popupWindow.hide();
    }

    private void lambda$getAddNoteDialog$3(View view, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ((SetAmountModel) this.viewModel).setNote(str);
        if (!TextUtils.isEmpty(str)) {
            ((ActivitySetAmountBinding) this.binding).tvAddNotes.setText(str);
            ((ActivitySetAmountBinding) this.binding).setIsAmend(true);
            return;
        }
        int i4 = ShareDataUIState + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        ((ActivitySetAmountBinding) this.binding).tvAddNotes.setText(R.string.receive_code_title5);
        ((ActivitySetAmountBinding) this.binding).setIsAmend(false);
    }

    private void lambda$getAddNoteDialog$4(int i, DialogBox dialogBox, String str) {
        int i2 = 2 % 2;
        int i3 = copydefault + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this.validatorItem == null) {
            return;
        }
        ValidatorCheckResult validatorCheckResultCheckValidator = ValidatorManager.INSTANCE.checkValidator(this.validatorItem, str);
        if (!validatorCheckResultCheckValidator.isValid()) {
            dialogBox.getInputView().showError(validatorCheckResultCheckValidator.getErrorMessage());
            dialogBox.getRightButton().setTextColor(ColorUtils.INSTANCE.withAlpha(0.3f, i));
            dialogBox.getRightButton().setEnabled(false);
            return;
        }
        int i5 = copydefault + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            dialogBox.getInputView().showError(null);
            dialogBox.getRightButton().setTextColor(i);
            dialogBox.getRightButton().setEnabled(false);
        } else {
            dialogBox.getInputView().showError(null);
            dialogBox.getRightButton().setTextColor(i);
            dialogBox.getRightButton().setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getAddNoteDialog() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            r8.hideKeyboardIfNeed()
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.color.colorPrimary
            int r1 = r8.getColor(r1)
            com.huawei.digitalpayment.form.validator.response.LocalValidatorItem r2 = r8.validatorItem
            if (r2 == 0) goto L2a
            int r3 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.ShareDataUIState
            int r3 = r3 + 101
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.copydefault = r4
            int r3 = r3 % r0
            java.lang.String r2 = r2.getInputHint()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2a
            com.huawei.digitalpayment.form.validator.response.LocalValidatorItem r2 = r8.validatorItem
            java.lang.String r2 = r2.getInputHint()
            goto L30
        L2a:
            int r2 = com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_button5
            java.lang.String r2 = r8.getString(r2)
        L30:
            r3 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r3]
            com.huawei.digitalpayment.form.validator.response.LocalValidatorItem r5 = r8.validatorItem
            if (r5 == 0) goto L45
            int r6 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.ShareDataUIState
            int r6 = r6 + 71
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.copydefault = r7
            int r6 = r6 % r0
            int r0 = r5.getMaxLength()
            goto L50
        L45:
            int r5 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.ShareDataUIState
            int r5 = r5 + 47
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.copydefault = r6
            int r5 = r5 % r0
            r0 = 32
        L50:
            com.huawei.digitalpayment.consumer.qrcode.utils.CustomLengthFilter r5 = new com.huawei.digitalpayment.consumer.qrcode.utils.CustomLengthFilter
            r5.<init>(r0)
            r0 = 0
            r4[r0] = r5
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = com.huawei.common.widget.dialog.DialogBox.builder()
            int r5 = com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_title6
            java.lang.String r5 = r8.getString(r5)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setTitle(r5)
            int r5 = com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_button6
            java.lang.String r5 = r8.getString(r5)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setLeftButtonText(r5)
            int r5 = com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_button7
            java.lang.String r5 = r8.getString(r5)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setRightButtonText(r5)
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity$$ExternalSyntheticLambda5 r5 = new com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity$$ExternalSyntheticLambda5
            r5.<init>()
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setRightButtonListener(r5)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setRightButtonTextColor(r1)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setShowInputView(r3)
            VM extends androidx.lifecycle.ViewModel r3 = r8.viewModel
            com.huawei.digitalpayment.consumer.qrcode.viewmodel.SetAmountModel r3 = (com.huawei.digitalpayment.consumer.qrcode.viewmodel.SetAmountModel) r3
            java.lang.String r3 = r3.getNote()
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setInputContent(r3)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setInputHint(r2)
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setInputFilters(r4)
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity$$ExternalSyntheticLambda6 r2 = new com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity$$ExternalSyntheticLambda6
            r2.<init>()
            com.huawei.common.widget.dialog.DialogBox$Builder r0 = r0.setInputTextChangedListener(r2)
            com.huawei.common.widget.dialog.DialogBox r0 = r0.build()
            androidx.fragment.app.FragmentManager r1 = r8.getSupportFragmentManager()
            java.lang.String r2 = "AddNoteDialog"
            r0.show(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.getAddNoteDialog():void");
    }

    private void lambda$initView$5(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ((ActivitySetAmountBinding) this.binding).inputAmount.getEditText().requestFocus();
        ((ActivitySetAmountBinding) this.binding).inputAmount.getEditText().setSelection(((ActivitySetAmountBinding) this.binding).inputAmount.getEditText().getText().length());
        this.popupWindow.show();
        int i4 = ShareDataUIState + 117;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void initView() {
        int i = 2 % 2;
        ((ActivitySetAmountBinding) this.binding).inputAmount.setOnInputViewParentClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 89;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SetAmountActivity.$r8$lambda$mPfNyNmICKa7lvBg9AlzgRBcUv0(this.f$0, view);
                int i5 = ShareDataUIState + 87;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        TypefaceManager.INSTANCE.setTextStyle(((ActivitySetAmountBinding) this.binding).inputAmount.getEditText(), 1);
        TypefaceManager.INSTANCE.setTextStyle(((ActivitySetAmountBinding) this.binding).inputAmount.getStartUnit(), 1);
        ((ActivitySetAmountBinding) this.binding).inputAmount.setSymbol(AppConfigManager.getAppConfig().getSymbol());
        ((ActivitySetAmountBinding) this.binding).setIsAmend(false);
        CustomKeyBroadPop customKeyBroadPop = new CustomKeyBroadPop(this, CustomKeyBroadType.getDIGITAL_OK_KEY_BROAD());
        this.popupWindow = customKeyBroadPop;
        customKeyBroadPop.attachToEditText(this, ((ActivitySetAmountBinding) this.binding).inputAmount.getEditText());
        ((ActivitySetAmountBinding) this.binding).inputAmount.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    if (TextUtils.isEmpty(editable) || "0".contentEquals(editable)) {
                        z = false;
                    } else {
                        int i4 = component2 + 119;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        z = true;
                    }
                    SetAmountActivity.m10909$$Nest$fgetpopupWindow(SetAmountActivity.this).setFinishEnable(z);
                    ((ActivitySetAmountBinding) SetAmountActivity.access$000(SetAmountActivity.this)).btnConfirm.setEnabled(z);
                    return;
                }
                TextUtils.isEmpty(editable);
                throw null;
            }
        });
        this.popupWindow.setKeyListener(new OnKeyListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void dispatchKeyEvent(KeyEvent keyEvent) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    SetAmountActivity.$r8$lambda$e7ewZlT2AHKCTBtNkOtvc5hSBgY(this.f$0, keyEvent);
                    throw null;
                }
                SetAmountActivity.$r8$lambda$e7ewZlT2AHKCTBtNkOtvc5hSBgY(this.f$0, keyEvent);
                int i4 = component1 + 123;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void lambda$initView$6(KeyEvent keyEvent) {
        CustomKeyBroadPop customKeyBroadPop;
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (66 == keyEvent.getKeyCode() && (customKeyBroadPop = this.popupWindow) != null) {
            int i4 = ShareDataUIState + 123;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            customKeyBroadPop.dismiss();
            if (i5 != 0) {
                throw null;
            }
        }
        int i6 = copydefault + 57;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.receive_code_title4));
        int i4 = ShareDataUIState + 13;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_set_amount;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.popupWindow.isShowing())) {
            int i4 = copydefault + 111;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            this.popupWindow.hide();
            int i6 = ShareDataUIState + 41;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        super.onBackPressed();
        int i8 = copydefault + 117;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 79, new char[]{5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 164, true, 26 - View.combineMeasuredStates(0, 0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 32), 18 - KeyEvent.keyCodeFromString(""), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) - 94, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = copydefault + 59;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6618, 42 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 55 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i3 = copydefault + 71;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0122  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r49) {
        /*
            Method dump skipped, instruction units count: 15345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.SetAmountActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$4x1y5cAT_gPVQCsjAqqFiXXzTe8(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10914instrumented$2$initOnclick$V(setAmountActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$7aL4XtyMb6o0PMi596TUM4MYn7M(SetAmountActivity setAmountActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        setAmountActivity.lambda$getAddNoteDialog$3(view, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$FM4kaPctCLGKYC0ElC_NyX5v1Ao(SetAmountActivity setAmountActivity, int i, DialogBox dialogBox, String str) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        setAmountActivity.lambda$getAddNoteDialog$4(i, dialogBox, str);
        if (i4 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$NkoyqM0WN_snzg8AOHn6ImNJTVk(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10911instrumented$0$initOnclick$V(setAmountActivity, view);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = ShareDataUIState + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m10908$r8$lambda$O5EO5KRUlWTKDeO2kpakwgJcAE(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10913instrumented$1$initOnclick$V(setAmountActivity, view);
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$e7ewZlT2AHKCTBtNkOtvc5hSBgY(SetAmountActivity setAmountActivity, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        setAmountActivity.lambda$initView$6(keyEvent);
        int i4 = copydefault + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$mPfNyNmICKa7lvBg9AlzgRBcUv0(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10912instrumented$0$initView$V(setAmountActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static CustomKeyBroadPop m10909$$Nest$fgetpopupWindow(SetAmountActivity setAmountActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CustomKeyBroadPop customKeyBroadPop = setAmountActivity.popupWindow;
        if (i3 != 0) {
            return customKeyBroadPop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10910$$Nest$fputvalidatorItem(SetAmountActivity setAmountActivity, LocalValidatorItem localValidatorItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        setAmountActivity.validatorItem = localValidatorItem;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void m10911instrumented$0$initOnclick$V(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            setAmountActivity.lambda$initOnclick$0(view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 3;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10912instrumented$0$initView$V(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            setAmountActivity.lambda$initView$5(view);
            Callback.onClick_exit();
            int i4 = copydefault + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10913instrumented$1$initOnclick$V(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            setAmountActivity.lambda$initOnclick$1(view);
            Callback.onClick_exit();
            int i4 = copydefault + 79;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10914instrumented$2$initOnclick$V(SetAmountActivity setAmountActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            setAmountActivity.lambda$initOnclick$2(view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 43;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
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
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        int i5 = copydefault + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
