package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeProfileParams;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditBinding;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.io.encoding.Base64;

public class ProfileEditActivity extends Hilt_ProfileEditActivity<ProfileActivityProfileEditBinding, ProfileViewModel> {
    public static final String NICK_NAME_PATTERN = "^[^/\\\\:*\"'<>|?&]{2,16}$";
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static int component3;
    private static long component4;
    private static char copy;
    private static short[] copydefault;
    private static char equals;
    private static char getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;
    private ImageView endIcon;
    private static final byte[] $$l = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM};
    private static final int $$o = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {125, 44, 8, -98, Ascii.VT, Ascii.FF, -1, 4, Ascii.FF, 17, -67, 60, 19, 10, 4, 13, 6, -4, Ascii.FF, -2, Ascii.NAK, -62, Base64.padSymbol, 8, 4, Ascii.SUB, -7, -50, 66, Ascii.FF, 13, -8, 20, 3, -6, Ascii.DC2, -55, Ascii.GS, 40, 4, Ascii.SUB, -7, -29, TarHeader.LF_CHR, 10, 4, 13, 6, -4, Ascii.FF, -2, -21, 44, -1, Ascii.DLE, -31, 43, 10, 3, -65, TarHeader.LF_FIFO, Ascii.FS, 0, Ascii.CAN, -6, -26, 36, Ascii.SUB, -12, -5, -5, 17, 40, -12, Ascii.SUB, -8, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -59, 19, 5, 10, 6, 6, -2, Ascii.DLE, 13, -58, 19, 8, Ascii.DLE, -14, 8, 8, 2, Ascii.ESC, -2, Ascii.SI};
    private static final int $$k = 109;
    private static final byte[] $$d = {9, 8, 112, 107, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 173;
    private static int getShareableDataState = 1;
    private static int toString = 0;
    private static int ArtificialStackFrames = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, int r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.$$l
            int r8 = 116 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r8 = r8 + 1
            r3 = r1[r8]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.$$r(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.$$d
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r1 = 28 - r6
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.h(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.$$j
            int r8 = r8 * 9
            int r8 = 94 - r8
            int r6 = r6 * 8
            int r6 = 107 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r6 = r6 + (-7)
            int r8 = r8 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.i(byte, short, int, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(ProfileEditActivity profileEditActivity) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 83;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = profileEditActivity.binding;
        int i4 = toString + 123;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    static ViewDataBinding access$100(ProfileEditActivity profileEditActivity) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 121;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = profileEditActivity.binding;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = ArtificialStackFrames + 117;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return binding;
    }

    static ViewDataBinding access$200(ProfileEditActivity profileEditActivity) {
        int i = 2 % 2;
        int i2 = toString + 105;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = profileEditActivity.binding;
        int i4 = toString + 117;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return binding;
    }

    static ViewDataBinding access$300(ProfileEditActivity profileEditActivity) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 85;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = profileEditActivity.binding;
        int i4 = ArtificialStackFrames + 9;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 75;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.layout.profile_activity_profile_edit;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.profile_activity_profile_edit;
        int i5 = toString + 119;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.profile_nickname_title1));
        int i4 = ArtificialStackFrames + 49;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component4 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 79;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
                return;
            }
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component4)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7031 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, (char) (Color.rgb(0, 0, 0) + 16828485), -1883291598, false, $$r(b2, b3, (byte) (b3 & 13)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                i3 = $11 + 43;
                $10 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $11 + 45;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (((long) copy) ^ 4374495167426960553L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getRequestBeneficiariesState);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        charSequence = "";
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf(charSequence, charSequence) + 844, 32 - TextUtils.getCapsMode(charSequence, 0, 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 23251), 592652048, false, $$r(b2, b3, (byte) (b3 & 5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) getAsAtTimestamp) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(equals)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf(charSequence, charSequence, 0, 0) + 844, View.MeasureSpec.makeMeasureSpec(0, 0) + 32, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 23251), 592652048, false, $$r(b4, b5, (byte) (b5 & 5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    i2 = 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 465, 48 - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.indexOf("", "", 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i2 = 2;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $10 + 1;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r23, int r24, short r25, byte r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.j(int, int, short, byte, int, java.lang.Object[]):void");
    }

    private void lambda$onCreate$0(View view) {
        int i = 2 % 2;
        int i2 = toString + 123;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        onSaveClick();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = toString + 99;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$onCreate$1() {
        int i = 2 % 2;
        int i2 = toString + 97;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            KeyboardUtils.showSoftInput(((ProfileActivityProfileEditBinding) this.binding).inputName.getEditText());
            int i3 = 39 / 0;
        } else {
            KeyboardUtils.showSoftInput(((ProfileActivityProfileEditBinding) this.binding).inputName.getEditText());
        }
        int i4 = toString + 101;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0106  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.onCreate(android.os.Bundle):void");
    }

    private void onSaveClick() {
        int i = 2 % 2;
        KeyboardUtils.hideSoftInput(this);
        ((ProfileViewModel) this.viewModel).changeProfile(new ChangeProfileParams(((ProfileActivityProfileEditBinding) this.binding).inputName.getText()));
        int i2 = toString + 33;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void addObserve() {
        int i = 2 % 2;
        ((ProfileViewModel) this.viewModel).getChangeProfile().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ProfileEditActivity.m10886$r8$lambda$Eg3RpvwRt7B42pA92TrqFsoino(this.f$0, (Resource) obj);
                int i5 = component1 + 109;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = toString + 79;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.hideLoading(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r6.error() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        ((com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditBinding) r5.binding).inputName.showError(r6.getMessage());
        r6 = r5.endIcon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.toString + 29;
        com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.ArtificialStackFrames = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r6.setVisibility(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r6.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        com.huawei.digitalpayment.consumer.profile.util.ProfileHelper.updateCustomer((com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer) r6.getData());
        r6 = new android.os.Bundle(1);
        r6.putString(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_EXECUTE, com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants.EXECUTE_MY);
        com.huawei.arouter.RouteUtils.routeWithExecute(com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants.MAIN, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((!r6.loading()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r6.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.showLoading(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$addObserve$2(com.huawei.payment.mvvm.Resource r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.ArtificialStackFrames
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.toString = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r6.loading()
            r4 = 39
            int r4 = r4 / r2
            r1 = r1 ^ r3
            if (r1 == r3) goto L25
            goto L21
        L1b:
            boolean r1 = r6.loading()
            if (r1 == 0) goto L25
        L21:
            com.huawei.common.widget.dialog.DialogManager.showLoading(r5)
            return
        L25:
            com.huawei.common.widget.dialog.DialogManager.hideLoading(r5)
            boolean r1 = r6.error()
            if (r1 == 0) goto L52
            Binding extends androidx.databinding.ViewDataBinding r1 = r5.binding
            com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditBinding r1 = (com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditBinding) r1
            com.huawei.common.widget.input.CommonInputView r1 = r1.inputName
            java.lang.String r6 = r6.getMessage()
            r1.showError(r6)
            android.widget.ImageView r6 = r5.endIcon
            if (r6 == 0) goto L51
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.toString
            int r1 = r1 + 29
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.ArtificialStackFrames = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L4e
            r6.setVisibility(r3)
            goto L51
        L4e:
            r6.setVisibility(r2)
        L51:
            return
        L52:
            java.lang.Object r6 = r6.getData()
            com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer r6 = (com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer) r6
            com.huawei.digitalpayment.consumer.profile.util.ProfileHelper.updateCustomer(r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r3)
            java.lang.String r0 = "execute"
            java.lang.String r1 = "native://app/customer/homepage/my"
            r6.putString(r0, r1)
            java.lang.String r0 = "/mainModule/main"
            com.huawei.arouter.RouteUtils.routeWithExecute(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.lambda$addObserve$2(com.huawei.payment.mvvm.Resource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r40) {
        /*
            Method dump skipped, instruction units count: 15124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileEditActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10886$r8$lambda$Eg3RpvwRt7B42pA92TrqFsoino(ProfileEditActivity profileEditActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = toString + 55;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        profileEditActivity.lambda$addObserve$2(resource);
        int i4 = ArtificialStackFrames + 93;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10887$r8$lambda$SAqf47YfAsqoPuw40L6I5xW0Q(ProfileEditActivity profileEditActivity, View view) {
        int i = 2 % 2;
        int i2 = toString + 47;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        m10889instrumented$0$onCreate$LandroidosBundleV(profileEditActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$j1W4BEJ6DorMPkosyAx11be9P5E(ProfileEditActivity profileEditActivity) {
        int i = 2 % 2;
        int i2 = toString + 5;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        profileEditActivity.lambda$onCreate$1();
        int i4 = toString + 29;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
    }

    static ImageView m10888$$Nest$fgetendIcon(ProfileEditActivity profileEditActivity) {
        int i = 2 % 2;
        int i2 = toString + 115;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        ImageView imageView = profileEditActivity.endIcon;
        int i5 = i3 + 53;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return imageView;
    }

    private static void m10889instrumented$0$onCreate$LandroidosBundleV(ProfileEditActivity profileEditActivity, View view) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 73;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                profileEditActivity.lambda$onCreate$0(view);
                throw null;
            }
            profileEditActivity.lambda$onCreate$0(view);
            Callback.onClick_exit();
            int i4 = ArtificialStackFrames + 9;
            toString = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 63;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = toString + 83;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    static {
        getSponsorBeneficiariesState = 0;
        component1();
        ShareDataUIState = -1086450386;
        component2 = -238323951;
        component3 = -176346105;
        component1 = new byte[]{57, Base64.padSymbol, -18, -41, 42, -47, -42, 37, -41, -40, 44, 43, 33, -38, 109, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
        int i = getShareableDataState + 75;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        getAsAtTimestamp = (char) 42412;
        equals = (char) 42228;
        copy = (char) 11950;
        getRequestBeneficiariesState = (char) 53740;
        component4 = 3946481893534205648L;
    }
}
