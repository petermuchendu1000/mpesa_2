package com.huawei.digitalpayment.consumer.identity.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectDialog;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.databinding.LoginActivityCheckIdentityBinding;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.CheckIdentityViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.service.CheckIdentityService;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

public class CheckIdentityActivity extends Hilt_CheckIdentityActivity<LoginActivityCheckIdentityBinding, CheckIdentityViewModel> {
    public static final String BUTTON = "button";
    public static final String ID_NUMBER = "idNumber";
    public static final String ID_NUMBER_TIPS = "idNumberTips";
    public static final String ID_TYPE = "idType";
    public static final String ID_TYPE_DIALOG_BUTTON = "idTypeDialogButton";
    public static final String ID_TYPE_DIALOG_TITLE = "idTypeDialogTitle";
    public static final String ID_TYPE_TIPS = "idTypeTips";
    public static final String TIPS = "tips";
    public static final String TITLE = "title";
    private LocalIdType currentIdType;
    private SingleSelectDialog<LocalIdType> dialog;
    private String idTypeDialogButton;
    private String idTypeDialogTitle;
    private List<LocalIdType> idTypes;
    private boolean showSelectIdTypeDialog;
    private static final byte[] $$c = {110, -114, 93, -109};
    private static final int $$f = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {57, 126, 65, 8, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, Ascii.SO, 4, 2, -17, Ascii.SI, 56, PSSSigner.TRAILER_IMPLICIT, Ascii.SI, -13, 1, Ascii.VT, -5, 2, -4, 70, -53, 4, -5, 1, 3, -12, 69, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -33, -33, Ascii.SO, 3, -11, 2, Ascii.VT, -4, -10, Ascii.FF, -5, 2, -4, -20, 8, -16, Ascii.SO, 34, -28, -18, 20, 13, 13, -9, -32, 20, -18, Ascii.DLE, -11, 3, -2, 2, 2, 10, -8, -5, 66, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -69, 19, -18, 7, 2, 0, 3, -1, 66, -71, Ascii.SO, 5, -17, 8, Ascii.DLE, -5, 3, -12, Ascii.SI, -10, -4, 2, Ascii.VT, -4, Ascii.VT, -4, 7, 3, -18, 6, -2, 69, -35, 47, -71, Ascii.FF, -23, Ascii.VT, -5, 2, -11, 0, -8, Ascii.SYN, 0, 0, 6, -19, 10, -7};
    private static final int $$h = 216;
    private static final byte[] $$a = {41, -64, -63, -4, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 250;
    private static int equals = 0;
    private static int component4 = 1;
    private static long ShareDataUIState = 48190090413278905L;
    private static char copydefault = 27630;
    private static char component3 = 10097;
    private static char component1 = 17962;
    private static char component2 = 37967;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, short r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.$$c
            int r8 = r8 * 3
            int r8 = r8 + 102
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.$$i(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r7 = 100 - r7
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r8
            r5 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 128 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.$$g
            int r8 = r8 + 10
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2b:
            int r3 = -r3
            int r9 = r9 + 1
            int r7 = r7 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.e(byte, byte, int, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 91;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 3266, 33 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 60268), -834797019, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() * (ShareDataUIState ^ 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.MeasureSpec.makeMeasureSpec(0, 0), 34 - Gravity.getAbsoluteGravity(0, 0), (char) (60372 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -1969106284, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 3266, ExpandableListView.getPackedPositionType(0L) + 33, (char) (60268 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), -834797019, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 35 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$i(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 687, 34 - (ViewConfiguration.getTapTimeout() >> 16), (char) (View.getDefaultSize(0, 0) + 60373), -1969106284, false, $$i(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str = new String(cArr2);
        int i10 = $11 + 69;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 95;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iResolveOpacity = Drawable.resolveOpacity(i4, i4) + 844;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4) + 33;
                        char touchSlop = (char) (23251 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$i = $$i(b2, b3, (byte) (b3 + 3));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, iLastIndexOf, touchSlop, 592652048, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32, (char) (23251 - ((Process.getThreadPriority(0) + 20) >> 6)), 592652048, false, $$i(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 466, 49 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 59;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a1  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.onCreate(android.os.Bundle):void");
    }

    private void initViews() {
        int i = 2 % 2;
        int i2 = component4 + 71;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ((LoginActivityCheckIdentityBinding) this.binding).llTips.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.2f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorWarningDisable)));
        String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra("tips");
        String stringExtra3 = getIntent().getStringExtra(ID_TYPE);
        String stringExtra4 = getIntent().getStringExtra(ID_TYPE_TIPS);
        String stringExtra5 = getIntent().getStringExtra(ID_NUMBER);
        String stringExtra6 = getIntent().getStringExtra(ID_NUMBER_TIPS);
        String stringExtra7 = getIntent().getStringExtra("button");
        this.idTypeDialogTitle = getIntent().getStringExtra(ID_TYPE_DIALOG_TITLE);
        this.idTypeDialogButton = getIntent().getStringExtra(ID_TYPE_DIALOG_BUTTON);
        ((LoginActivityCheckIdentityBinding) this.binding).title.setText(stringExtra);
        ((LoginActivityCheckIdentityBinding) this.binding).tips.setText(stringExtra2);
        ((LoginActivityCheckIdentityBinding) this.binding).idType.setTitle(stringExtra3);
        ((LoginActivityCheckIdentityBinding) this.binding).idType.getEditText().setHint(stringExtra4);
        ((LoginActivityCheckIdentityBinding) this.binding).idNumber.setTitle(stringExtra5);
        ((LoginActivityCheckIdentityBinding) this.binding).idNumber.getEditText().setHint(stringExtra6);
        ((LoginActivityCheckIdentityBinding) this.binding).btnConfirm.setText(stringExtra7);
        int i4 = equals + 27;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void queryDataDict(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 85;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            this.showSelectIdTypeDialog = z;
            ((CheckIdentityViewModel) this.viewModel).queryDataDict();
            int i3 = equals + 107;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 57 / 0;
                return;
            }
            return;
        }
        this.showSelectIdTypeDialog = z;
        ((CheckIdentityViewModel) this.viewModel).queryDataDict();
        throw null;
    }

    private void lambda$addObserver$0(Resource resource) {
        int i = 2 % 2;
        if (!resource.loading()) {
            Utils.showOrHideLoading(this, resource);
            int i2 = equals + 37;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        } else if (this.showSelectIdTypeDialog) {
            Utils.showOrHideLoading((FragmentActivity) this, resource, true);
        }
        if (resource.error()) {
            int i4 = component4 + 103;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (this.showSelectIdTypeDialog) {
                Utils.toastError(resource);
                this.showSelectIdTypeDialog = false;
                return;
            }
            return;
        }
        if (!resource.success()) {
            return;
        }
        int i6 = component4 + 99;
        equals = i6 % 128;
        int i7 = i6 % 2;
        DialogManager.hideLoading(this);
        List<LocalIdType> list = (List) resource.getData();
        this.idTypes = list;
        if (list.isEmpty()) {
            return;
        }
        this.currentIdType = this.idTypes.get(0);
        ((LoginActivityCheckIdentityBinding) this.binding).idType.getEditText().setText(this.currentIdType.getShowContext());
        if (this.showSelectIdTypeDialog) {
            showSelectIdType();
            this.showSelectIdTypeDialog = false;
        }
    }

    private void addObserver() {
        int i = 2 % 2;
        ((CheckIdentityViewModel) this.viewModel).getDataDict().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    CheckIdentityActivity.$r8$lambda$nCylntdLnDtYdIaPO0rTIv2HgcM(this.f$0, (Resource) obj);
                    int i4 = 34 / 0;
                } else {
                    CheckIdentityActivity.$r8$lambda$nCylntdLnDtYdIaPO0rTIv2HgcM(this.f$0, (Resource) obj);
                }
                int i5 = ShareDataUIState + 27;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((CheckIdentityViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 105;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    CheckIdentityActivity.$r8$lambda$QnHSqAhHmVIr0RvNVbKau5rMauc(this.f$0, (Resource) obj);
                    throw null;
                }
                CheckIdentityActivity.$r8$lambda$QnHSqAhHmVIr0RvNVbKau5rMauc(this.f$0, (Resource) obj);
                int i4 = copydefault + 107;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = equals + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$1(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 51;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (!resource.loading()) {
            DialogManager.hideLoading(this);
            if (resource.error()) {
                ToastUtils.showLong(resource.getMessage());
                return;
            }
            if (CheckIdentityService.getCallback() != null) {
                HashMap map = new HashMap();
                String strTrim = ((String) Objects.requireNonNull(((LoginActivityCheckIdentityBinding) this.binding).idNumber.getText().trim())).trim();
                map.put(KeysConstants.KEY_EXECUTE, ((LocalLoginInfo) resource.getData()).getExecute());
                map.put(KeysConstants.ID_TYPE, this.currentIdType.getId());
                map.put(KeysConstants.ID_NUMBER, strTrim);
                CheckIdentityService.getCallback().onSuccess(map);
                int i4 = component4 + 13;
                equals = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 2;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = equals + 13;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            DialogManager.showLoading(this);
            return;
        }
        DialogManager.showLoading(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component4 + 109;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.layout.login_activity_check_identity;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.login_activity_check_identity;
        int i5 = component4 + 63;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private void lambda$initEvent$2(View view) {
        int i = 2 % 2;
        int i2 = component4 + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        preShowSelectIdType();
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        int i5 = component4 + 57;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    private void initEvent() {
        int i = 2 % 2;
        ((LoginActivityCheckIdentityBinding) this.binding).idNumber.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 63;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                super.onTextChanged(charSequence, i2, i3, i4);
                CheckIdentityActivity.m10627$$Nest$mcheckConfirmClickable(CheckIdentityActivity.this);
                int i8 = component3 + 91;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }
        });
        ((LoginActivityCheckIdentityBinding) this.binding).idType.setOnInputViewParentClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 1;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                CheckIdentityActivity.$r8$lambda$xLX4hN_bHGcTGh8ZuDTcLeCyOhk(this.f$0, view);
                int i5 = copydefault + 31;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 95 / 0;
                }
            }
        });
        ((LoginActivityCheckIdentityBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                CheckIdentityActivity.$r8$lambda$3Bdc2b4RUqYzlWCE9SsgHBlQ190(this.f$0, view);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = equals + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$initEvent$3(View view) {
        int i = 2 % 2;
        int i2 = component4 + 51;
        equals = i2 % 128;
        int i3 = i2 % 2;
        checkIdentity();
        if (i3 != 0) {
            throw null;
        }
    }

    private void preShowSelectIdType() {
        int i = 2 % 2;
        if (this.idTypes == null) {
            queryDataDict(true);
            return;
        }
        int i2 = equals + 59;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        showSelectIdType();
        int i4 = equals + 99;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void checkConfirmClickable() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBinding = (LoginActivityCheckIdentityBinding) this.binding;
        (i3 != 0 ? loginActivityCheckIdentityBinding.btnConfirm : loginActivityCheckIdentityBinding.btnConfirm).setEnabled(!checkIDNumber());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return android.text.TextUtils.isEmpty(((com.huawei.digitalpayment.consumer.login.databinding.LoginActivityCheckIdentityBinding) r4.binding).idNumber.getText().trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.currentIdType == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.currentIdType == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 111;
        com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.equals = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkIDNumber() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.component4
            int r2 = r1 + 49
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.equals = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType r2 = r4.currentIdType
            r3 = 73
            int r3 = r3 / 0
            if (r2 != 0) goto L24
            goto L1b
        L17:
            com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType r2 = r4.currentIdType
            if (r2 != 0) goto L24
        L1b:
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.equals = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L24:
            Binding extends androidx.databinding.ViewDataBinding r0 = r4.binding
            com.huawei.digitalpayment.consumer.login.databinding.LoginActivityCheckIdentityBinding r0 = (com.huawei.digitalpayment.consumer.login.databinding.LoginActivityCheckIdentityBinding) r0
            com.huawei.common.widget.input.CommonInputView r0 = r0.idNumber
            java.lang.String r0 = r0.getText()
            java.lang.String r0 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.checkIDNumber():boolean");
    }

    private void checkIdentity() {
        int i = 2 % 2;
        KeyboardUtils.hideSoftInput(this);
        ((CheckIdentityViewModel) this.viewModel).checkIdentity(new IdentityVerifyParams(this.currentIdType.getId(), ((String) Objects.requireNonNull(((LoginActivityCheckIdentityBinding) this.binding).idNumber.getText().trim())).trim()));
        int i2 = equals + 45;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void lambda$showSelectIdType$4(LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = equals + 31;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.dialog.dismiss();
        this.currentIdType = localIdType;
        ((LoginActivityCheckIdentityBinding) this.binding).idType.getEditText().setText(localIdType.getName());
        int i4 = component4 + 5;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void showSelectIdType() {
        int i = 2 % 2;
        SingleSelectDialog<LocalIdType> singleSelectDialog = new SingleSelectDialog<>(this.idTypeDialogTitle, this.idTypeDialogButton, this.idTypes, new SingleSelectDialog.OnItemSelectedListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onItemSelected(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 121;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    CheckIdentityActivity.$r8$lambda$UkJn2DStCHBqRVeUtgc_4oP5k0c(this.f$0, (LocalIdType) obj);
                    int i4 = 15 / 0;
                } else {
                    CheckIdentityActivity.$r8$lambda$UkJn2DStCHBqRVeUtgc_4oP5k0c(this.f$0, (LocalIdType) obj);
                }
                int i5 = component3 + 3;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        }, this.currentIdType);
        this.dialog = singleSelectDialog;
        singleSelectDialog.show(getSupportFragmentManager(), ID_TYPE);
        int i2 = component4 + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = equals + 49;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        Object obj = null;
        CheckIdentityService.setCallback(null);
        int i4 = equals + 43;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = component4 + 105;
            equals = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).codePointAt(0) - 89, new char[]{50818, 44714, 2846, 56323, 33202, 46086, 23281, 18728, 52791, 64366, 47329, 51413, 31921, 31007, 18139, 50291, 8615, 2244, 46542, 60870, 'y', 32385, 3226, 53763, 16938, 42325}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 28, new char[]{16168, 38521, 63425, 39024, 12418, 16291, 35427, 13678, 25284, 50341, 16929, 43001, 9803, 51795, 18139, 50291, 7078, 64200}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = component4 + 117;
                equals = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i8 = component4 + 97;
                equals = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        if (baseContext != null) {
            int i10 = component4 + 53;
            equals = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0') + 43, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 56 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.alpha(0), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(54:114|115|130|131|851|132|135|136|(0)|139|140|878|141|142|821|143|(0)|146|(0)(0)|152|170|(0)|210|839|211|(0)|219|(0)|222|223|(6:815|(0)(0)|280|(1:281)|919|328)|(0)(0)|356|796|357|(0)|360|882|361|(0)|364|388|798|389|(0)|396|397|(5:871|(0)(0)|437|(1:438)|915)|497|(0)|500|(0)(0)|523|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x1aa6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x1aa7, code lost:
    
        r10 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x082c A[Catch: all -> 0x037b, TryCatch #35 {all -> 0x037b, blocks: (B:338:0x1377, B:340:0x137d, B:341:0x13ab, B:491:0x1b36, B:493:0x1b3c, B:494:0x1b69, B:698:0x2d50, B:700:0x2d56, B:701:0x2d81, B:735:0x309d, B:737:0x30a3, B:738:0x30c2, B:715:0x2eda, B:717:0x2efd, B:718:0x2f56, B:664:0x2a0a, B:666:0x2a10, B:667:0x2a3d, B:758:0x3199, B:760:0x319f, B:761:0x31c4, B:763:0x31fe, B:764:0x3240, B:539:0x218d, B:541:0x21a2, B:542:0x21cf, B:544:0x2203, B:545:0x2279, B:776:0x32e8, B:778:0x32ee, B:779:0x3314, B:781:0x334e, B:782:0x338a, B:507:0x1d29, B:509:0x1d3e, B:510:0x1d6f, B:382:0x15b8, B:384:0x15be, B:385:0x15ea, B:204:0x0ccc, B:206:0x0cd2, B:207:0x0cfe, B:136:0x0826, B:138:0x082c, B:139:0x085b, B:23:0x0167, B:25:0x016d, B:26:0x0199, B:28:0x02f1, B:30:0x0322, B:31:0x0375, B:345:0x1432, B:347:0x1436, B:368:0x151a, B:370:0x1520, B:371:0x1521, B:373:0x1523, B:375:0x152a, B:376:0x152b, B:351:0x1442, B:357:0x144d, B:359:0x1462, B:360:0x1494, B:361:0x149a, B:363:0x14a7, B:364:0x1510, B:143:0x08e8, B:145:0x08ee, B:146:0x0930, B:148:0x093d, B:150:0x0946, B:151:0x0988, B:170:0x0b35, B:178:0x0ba2, B:184:0x0c2c, B:186:0x0c32, B:187:0x0c33, B:189:0x0c35, B:191:0x0c3c, B:192:0x0c3d, B:153:0x0994, B:160:0x0a1d, B:162:0x0a23, B:163:0x0a69, B:165:0x0a93, B:166:0x0ad5, B:168:0x0aeb, B:169:0x0b2d, B:194:0x0c3f, B:196:0x0c46, B:197:0x0c47, B:180:0x0ba8, B:174:0x0b69, B:176:0x0b6f, B:177:0x0b9b, B:155:0x09b4, B:157:0x09c6, B:158:0x0a11, B:561:0x24ae, B:563:0x24b4, B:564:0x24f4, B:566:0x251b, B:567:0x255b, B:569:0x256f, B:571:0x2578, B:572:0x25ba, B:611:0x2815, B:612:0x2819, B:616:0x282b, B:622:0x285b, B:625:0x2872, B:627:0x2875, B:639:0x2955, B:641:0x295b, B:642:0x295c, B:644:0x295e, B:646:0x2965, B:647:0x2966, B:619:0x2843, B:578:0x25d5, B:583:0x25e2, B:587:0x25ee, B:581:0x25de, B:589:0x25f4, B:601:0x2705, B:603:0x270b, B:604:0x274f, B:606:0x2779, B:607:0x27b8, B:609:0x27ce, B:610:0x280f, B:649:0x2968, B:651:0x296f, B:652:0x2970, B:654:0x2972, B:656:0x2979, B:657:0x297a, B:635:0x28d8, B:630:0x28a1, B:632:0x28a7, B:633:0x28d0, B:596:0x2661, B:598:0x2680, B:599:0x26f9, B:591:0x2614, B:593:0x2629, B:594:0x265a), top: B:859:0x0167, inners: #13, #14, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x08ee A[Catch: all -> 0x0c48, TryCatch #14 {all -> 0x0c48, blocks: (B:143:0x08e8, B:145:0x08ee, B:146:0x0930, B:148:0x093d, B:150:0x0946, B:151:0x0988, B:170:0x0b35, B:178:0x0ba2, B:184:0x0c2c, B:186:0x0c32, B:187:0x0c33, B:189:0x0c35, B:191:0x0c3c, B:192:0x0c3d, B:153:0x0994, B:160:0x0a1d, B:162:0x0a23, B:163:0x0a69, B:165:0x0a93, B:166:0x0ad5, B:168:0x0aeb, B:169:0x0b2d, B:194:0x0c3f, B:196:0x0c46, B:197:0x0c47, B:180:0x0ba8, B:174:0x0b69, B:176:0x0b6f, B:177:0x0b9b, B:155:0x09b4, B:157:0x09c6, B:158:0x0a11), top: B:821:0x08e8, outer: #35, inners: #2, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x093d A[Catch: all -> 0x0c48, TryCatch #14 {all -> 0x0c48, blocks: (B:143:0x08e8, B:145:0x08ee, B:146:0x0930, B:148:0x093d, B:150:0x0946, B:151:0x0988, B:170:0x0b35, B:178:0x0ba2, B:184:0x0c2c, B:186:0x0c32, B:187:0x0c33, B:189:0x0c35, B:191:0x0c3c, B:192:0x0c3d, B:153:0x0994, B:160:0x0a1d, B:162:0x0a23, B:163:0x0a69, B:165:0x0a93, B:166:0x0ad5, B:168:0x0aeb, B:169:0x0b2d, B:194:0x0c3f, B:196:0x0c46, B:197:0x0c47, B:180:0x0ba8, B:174:0x0b69, B:176:0x0b6f, B:177:0x0b9b, B:155:0x09b4, B:157:0x09c6, B:158:0x0a11), top: B:821:0x08e8, outer: #35, inners: #2, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0994 A[Catch: all -> 0x0c48, TRY_LEAVE, TryCatch #14 {all -> 0x0c48, blocks: (B:143:0x08e8, B:145:0x08ee, B:146:0x0930, B:148:0x093d, B:150:0x0946, B:151:0x0988, B:170:0x0b35, B:178:0x0ba2, B:184:0x0c2c, B:186:0x0c32, B:187:0x0c33, B:189:0x0c35, B:191:0x0c3c, B:192:0x0c3d, B:153:0x0994, B:160:0x0a1d, B:162:0x0a23, B:163:0x0a69, B:165:0x0a93, B:166:0x0ad5, B:168:0x0aeb, B:169:0x0b2d, B:194:0x0c3f, B:196:0x0c46, B:197:0x0c47, B:180:0x0ba8, B:174:0x0b69, B:176:0x0b6f, B:177:0x0b9b, B:155:0x09b4, B:157:0x09c6, B:158:0x0a11), top: B:821:0x08e8, outer: #35, inners: #2, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b47  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d94  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e10 A[Catch: all -> 0x0de1, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x0de1, blocks: (B:214:0x0d95, B:221:0x0e10, B:226:0x0e6f, B:228:0x0e75, B:229:0x0ebb), top: B:837:0x0d95 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0ef0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0ef1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x11a5 A[Catch: all -> 0x12df, TryCatch #22 {all -> 0x12df, blocks: (B:280:0x119b, B:281:0x119f, B:283:0x11a5, B:286:0x11c0, B:250:0x0efe, B:267:0x1078, B:271:0x10c1, B:276:0x1137, B:279:0x1195), top: B:835:0x0efe }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x137d A[Catch: all -> 0x037b, TryCatch #35 {all -> 0x037b, blocks: (B:338:0x1377, B:340:0x137d, B:341:0x13ab, B:491:0x1b36, B:493:0x1b3c, B:494:0x1b69, B:698:0x2d50, B:700:0x2d56, B:701:0x2d81, B:735:0x309d, B:737:0x30a3, B:738:0x30c2, B:715:0x2eda, B:717:0x2efd, B:718:0x2f56, B:664:0x2a0a, B:666:0x2a10, B:667:0x2a3d, B:758:0x3199, B:760:0x319f, B:761:0x31c4, B:763:0x31fe, B:764:0x3240, B:539:0x218d, B:541:0x21a2, B:542:0x21cf, B:544:0x2203, B:545:0x2279, B:776:0x32e8, B:778:0x32ee, B:779:0x3314, B:781:0x334e, B:782:0x338a, B:507:0x1d29, B:509:0x1d3e, B:510:0x1d6f, B:382:0x15b8, B:384:0x15be, B:385:0x15ea, B:204:0x0ccc, B:206:0x0cd2, B:207:0x0cfe, B:136:0x0826, B:138:0x082c, B:139:0x085b, B:23:0x0167, B:25:0x016d, B:26:0x0199, B:28:0x02f1, B:30:0x0322, B:31:0x0375, B:345:0x1432, B:347:0x1436, B:368:0x151a, B:370:0x1520, B:371:0x1521, B:373:0x1523, B:375:0x152a, B:376:0x152b, B:351:0x1442, B:357:0x144d, B:359:0x1462, B:360:0x1494, B:361:0x149a, B:363:0x14a7, B:364:0x1510, B:143:0x08e8, B:145:0x08ee, B:146:0x0930, B:148:0x093d, B:150:0x0946, B:151:0x0988, B:170:0x0b35, B:178:0x0ba2, B:184:0x0c2c, B:186:0x0c32, B:187:0x0c33, B:189:0x0c35, B:191:0x0c3c, B:192:0x0c3d, B:153:0x0994, B:160:0x0a1d, B:162:0x0a23, B:163:0x0a69, B:165:0x0a93, B:166:0x0ad5, B:168:0x0aeb, B:169:0x0b2d, B:194:0x0c3f, B:196:0x0c46, B:197:0x0c47, B:180:0x0ba8, B:174:0x0b69, B:176:0x0b6f, B:177:0x0b9b, B:155:0x09b4, B:157:0x09c6, B:158:0x0a11, B:561:0x24ae, B:563:0x24b4, B:564:0x24f4, B:566:0x251b, B:567:0x255b, B:569:0x256f, B:571:0x2578, B:572:0x25ba, B:611:0x2815, B:612:0x2819, B:616:0x282b, B:622:0x285b, B:625:0x2872, B:627:0x2875, B:639:0x2955, B:641:0x295b, B:642:0x295c, B:644:0x295e, B:646:0x2965, B:647:0x2966, B:619:0x2843, B:578:0x25d5, B:583:0x25e2, B:587:0x25ee, B:581:0x25de, B:589:0x25f4, B:601:0x2705, B:603:0x270b, B:604:0x274f, B:606:0x2779, B:607:0x27b8, B:609:0x27ce, B:610:0x280f, B:649:0x2968, B:651:0x296f, B:652:0x2970, B:654:0x2972, B:656:0x2979, B:657:0x297a, B:635:0x28d8, B:630:0x28a1, B:632:0x28a7, B:633:0x28d0, B:596:0x2661, B:598:0x2680, B:599:0x26f9, B:591:0x2614, B:593:0x2629, B:594:0x265a), top: B:859:0x0167, inners: #13, #14, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x144b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x1462 A[Catch: all -> 0x1522, TryCatch #0 {all -> 0x1522, blocks: (B:357:0x144d, B:359:0x1462, B:360:0x1494), top: B:796:0x144d, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x14a7 A[Catch: all -> 0x1518, TryCatch #48 {all -> 0x1518, blocks: (B:361:0x149a, B:363:0x14a7, B:364:0x1510), top: B:882:0x149a, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x1679  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x16d4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1729 A[Catch: all -> 0x1aa6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x1aa6, blocks: (B:389:0x1673, B:396:0x16c7, B:405:0x1729, B:423:0x1831, B:427:0x1880), top: B:798:0x1673 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1966 A[Catch: all -> 0x1a8c, TryCatch #42 {all -> 0x1a8c, blocks: (B:437:0x195c, B:438:0x1960, B:440:0x1966, B:443:0x1980, B:446:0x198d, B:448:0x1990, B:460:0x1a7a, B:462:0x1a80, B:463:0x1a81, B:465:0x1a83, B:467:0x1a8a, B:468:0x1a8b, B:429:0x188f, B:431:0x18ac, B:433:0x18f9, B:435:0x190f, B:436:0x1954, B:473:0x1a92, B:475:0x1a98, B:476:0x1a99, B:479:0x1a9e, B:481:0x1aa4, B:482:0x1aa5, B:456:0x19f8, B:451:0x19bf, B:453:0x19c5, B:454:0x19f0), top: B:871:0x16d2, inners: #32, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1b3c A[Catch: all -> 0x037b, TryCatch #35 {all -> 0x037b, blocks: (B:338:0x1377, B:340:0x137d, B:341:0x13ab, B:491:0x1b36, B:493:0x1b3c, B:494:0x1b69, B:698:0x2d50, B:700:0x2d56, B:701:0x2d81, B:735:0x309d, B:737:0x30a3, B:738:0x30c2, B:715:0x2eda, B:717:0x2efd, B:718:0x2f56, B:664:0x2a0a, B:666:0x2a10, B:667:0x2a3d, B:758:0x3199, B:760:0x319f, B:761:0x31c4, B:763:0x31fe, B:764:0x3240, B:539:0x218d, B:541:0x21a2, B:542:0x21cf, B:544:0x2203, B:545:0x2279, B:776:0x32e8, B:778:0x32ee, B:779:0x3314, B:781:0x334e, B:782:0x338a, B:507:0x1d29, B:509:0x1d3e, B:510:0x1d6f, B:382:0x15b8, B:384:0x15be, B:385:0x15ea, B:204:0x0ccc, B:206:0x0cd2, B:207:0x0cfe, B:136:0x0826, B:138:0x082c, B:139:0x085b, B:23:0x0167, B:25:0x016d, B:26:0x0199, B:28:0x02f1, B:30:0x0322, B:31:0x0375, B:345:0x1432, B:347:0x1436, B:368:0x151a, B:370:0x1520, B:371:0x1521, B:373:0x1523, B:375:0x152a, B:376:0x152b, B:351:0x1442, B:357:0x144d, B:359:0x1462, B:360:0x1494, B:361:0x149a, B:363:0x14a7, B:364:0x1510, B:143:0x08e8, B:145:0x08ee, B:146:0x0930, B:148:0x093d, B:150:0x0946, B:151:0x0988, B:170:0x0b35, B:178:0x0ba2, B:184:0x0c2c, B:186:0x0c32, B:187:0x0c33, B:189:0x0c35, B:191:0x0c3c, B:192:0x0c3d, B:153:0x0994, B:160:0x0a1d, B:162:0x0a23, B:163:0x0a69, B:165:0x0a93, B:166:0x0ad5, B:168:0x0aeb, B:169:0x0b2d, B:194:0x0c3f, B:196:0x0c46, B:197:0x0c47, B:180:0x0ba8, B:174:0x0b69, B:176:0x0b6f, B:177:0x0b9b, B:155:0x09b4, B:157:0x09c6, B:158:0x0a11, B:561:0x24ae, B:563:0x24b4, B:564:0x24f4, B:566:0x251b, B:567:0x255b, B:569:0x256f, B:571:0x2578, B:572:0x25ba, B:611:0x2815, B:612:0x2819, B:616:0x282b, B:622:0x285b, B:625:0x2872, B:627:0x2875, B:639:0x2955, B:641:0x295b, B:642:0x295c, B:644:0x295e, B:646:0x2965, B:647:0x2966, B:619:0x2843, B:578:0x25d5, B:583:0x25e2, B:587:0x25ee, B:581:0x25de, B:589:0x25f4, B:601:0x2705, B:603:0x270b, B:604:0x274f, B:606:0x2779, B:607:0x27b8, B:609:0x27ce, B:610:0x280f, B:649:0x2968, B:651:0x296f, B:652:0x2970, B:654:0x2972, B:656:0x2979, B:657:0x297a, B:635:0x28d8, B:630:0x28a1, B:632:0x28a7, B:633:0x28d0, B:596:0x2661, B:598:0x2680, B:599:0x26f9, B:591:0x2614, B:593:0x2629, B:594:0x265a), top: B:859:0x0167, inners: #13, #14, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x1bee  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x1c3e  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x1d0a  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x1ea6  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x25eb  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x25ec  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2867  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x28a7 A[Catch: all -> 0x295d, TryCatch #21 {all -> 0x295d, blocks: (B:630:0x28a1, B:632:0x28a7, B:633:0x28d0), top: B:833:0x28a1, outer: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:672:0x2ac8  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x2b1a  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x2b70  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x2d2e  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x2e18  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x2e6c  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x2ebc  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x307f  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x32b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x1432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:923:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v106 */
    /* JADX WARN: Type inference failed for: r10v107 */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v128 */
    /* JADX WARN: Type inference failed for: r10v129 */
    /* JADX WARN: Type inference failed for: r10v144 */
    /* JADX WARN: Type inference failed for: r10v145 */
    /* JADX WARN: Type inference failed for: r10v149 */
    /* JADX WARN: Type inference failed for: r10v150 */
    /* JADX WARN: Type inference failed for: r10v151 */
    /* JADX WARN: Type inference failed for: r10v152 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v154 */
    /* JADX WARN: Type inference failed for: r10v155 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v157 */
    /* JADX WARN: Type inference failed for: r10v158 */
    /* JADX WARN: Type inference failed for: r10v159 */
    /* JADX WARN: Type inference failed for: r10v160 */
    /* JADX WARN: Type inference failed for: r10v161 */
    /* JADX WARN: Type inference failed for: r10v162 */
    /* JADX WARN: Type inference failed for: r10v163 */
    /* JADX WARN: Type inference failed for: r10v164 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v94 */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v519 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v530, types: [int] */
    /* JADX WARN: Type inference failed for: r1v531 */
    /* JADX WARN: Type inference failed for: r1v532 */
    /* JADX WARN: Type inference failed for: r1v533 */
    /* JADX WARN: Type inference failed for: r1v534 */
    /* JADX WARN: Type inference failed for: r1v535 */
    /* JADX WARN: Type inference failed for: r1v536 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v543 */
    /* JADX WARN: Type inference failed for: r1v547 */
    /* JADX WARN: Type inference failed for: r1v548 */
    /* JADX WARN: Type inference failed for: r1v650 */
    /* JADX WARN: Type inference failed for: r1v651 */
    /* JADX WARN: Type inference failed for: r1v652 */
    /* JADX WARN: Type inference failed for: r1v653 */
    /* JADX WARN: Type inference failed for: r1v654 */
    /* JADX WARN: Type inference failed for: r1v655 */
    /* JADX WARN: Type inference failed for: r1v656 */
    /* JADX WARN: Type inference failed for: r27v169 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v170 */
    /* JADX WARN: Type inference failed for: r27v173 */
    /* JADX WARN: Type inference failed for: r27v174 */
    /* JADX WARN: Type inference failed for: r27v175 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v72 */
    /* JADX WARN: Type inference failed for: r27v74 */
    /* JADX WARN: Type inference failed for: r27v75 */
    /* JADX WARN: Type inference failed for: r27v76 */
    /* JADX WARN: Type inference failed for: r27v77 */
    /* JADX WARN: Type inference failed for: r27v79 */
    /* JADX WARN: Type inference failed for: r27v80 */
    /* JADX WARN: Type inference failed for: r27v85 */
    /* JADX WARN: Type inference failed for: r27v86 */
    /* JADX WARN: Type inference failed for: r27v87 */
    /* JADX WARN: Type inference failed for: r27v88 */
    /* JADX WARN: Type inference failed for: r27v91 */
    /* JADX WARN: Type inference failed for: r2v559, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v563 */
    /* JADX WARN: Type inference failed for: r2v584 */
    /* JADX WARN: Type inference failed for: r2v585 */
    /* JADX WARN: Type inference failed for: r2v598, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v614 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v731 */
    /* JADX WARN: Type inference failed for: r2v732 */
    /* JADX WARN: Type inference failed for: r8v275, types: [java.lang.Object[]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$3Bdc2b4RUqYzlWCE9SsgHBlQ190(CheckIdentityActivity checkIdentityActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 79;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10629instrumented$1$initEvent$V(checkIdentityActivity, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component4 + 111;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$QnHSqAhHmVIr0RvNVbKau5rMauc(CheckIdentityActivity checkIdentityActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        checkIdentityActivity.lambda$addObserver$1(resource);
        int i4 = component4 + 41;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$UkJn2DStCHBqRVeUtgc_4oP5k0c(CheckIdentityActivity checkIdentityActivity, LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = equals + 5;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        checkIdentityActivity.lambda$showSelectIdType$4(localIdType);
        int i4 = component4 + 111;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$nCylntdLnDtYdIaPO0rTIv2HgcM(CheckIdentityActivity checkIdentityActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 37;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        checkIdentityActivity.lambda$addObserver$0(resource);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$xLX4hN_bHGcTGh8ZuDTcLeCyOhk(CheckIdentityActivity checkIdentityActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10628instrumented$0$initEvent$V(checkIdentityActivity, view);
        int i4 = component4 + 99;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void m10627$$Nest$mcheckConfirmClickable(CheckIdentityActivity checkIdentityActivity) {
        int i = 2 % 2;
        int i2 = equals + 31;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        checkIdentityActivity.checkConfirmClickable();
        int i4 = component4 + 33;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void m10628instrumented$0$initEvent$V(CheckIdentityActivity checkIdentityActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                checkIdentityActivity.lambda$initEvent$2(view);
                Callback.onClick_exit();
                throw null;
            }
            checkIdentityActivity.lambda$initEvent$2(view);
            Callback.onClick_exit();
            int i4 = equals + 103;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10629instrumented$1$initEvent$V(CheckIdentityActivity checkIdentityActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                checkIdentityActivity.lambda$initEvent$3(view);
                Callback.onClick_exit();
                throw null;
            }
            checkIdentityActivity.lambda$initEvent$3(view);
            Callback.onClick_exit();
            int i4 = component4 + 11;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 81;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 81;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }
}
