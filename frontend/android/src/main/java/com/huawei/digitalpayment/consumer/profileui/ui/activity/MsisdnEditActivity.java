package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.ViewUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditMsisdnBinding;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.getActiveNotifications;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

public class MsisdnEditActivity extends Hilt_MsisdnEditActivity<ProfileActivityProfileEditMsisdnBinding, ProfileViewModel> {
    private static final byte[] $$l = {80, 83, -21, -55};
    private static final int $$o = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {119, -58, 7, 71, -10, 4, 65, PSSSigner.TRAILER_IMPLICIT, 20, -17, 8, 3, 1, 4, 0, 67, -70, Ascii.SI, 6, -16, 9, 17, -4, 4, -11, Ascii.DLE, -9, -3, 3, Ascii.FF, -3, Ascii.FF, -3, 8, 4, -17, 7, -1, 70, -34, TarHeader.LF_NORMAL, -70, 13, -22, Ascii.FF, -4, 3, -10, 1, -7, Ascii.ETB, 1, 1, 7, -18, Ascii.VT, -6, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 67};
    private static final int $$k = 83;
    private static final byte[] $$d = {120, -62, 63, 57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 177;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int[] ShareDataUIState = {-380178740, -1960711706, -1382672603, -626631506, -607620910, -573659825, 963403915, 509458422, -1898988797, -894628353, 1762278360, -1007403805, -1345256258, -64190361, 2004526904, 417377166, -989534067, 194627907};
    private static int component3 = -890926342;

    private static String $$r(int i, int i2, int i3) {
        int i4 = i + 65;
        int i5 = i3 * 4;
        int i6 = 4 - (i2 * 4);
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i4 += -i7;
            i6++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i6];
            i6++;
        }
    }

    private static void i(short s, byte b2, int i, Object[] objArr) {
        int i2 = 100 - s;
        byte[] bArr = $$d;
        int i3 = (b2 * 2) + 83;
        byte[] bArr2 = new byte[i + 4];
        int i4 = i + 3;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i4 + i3) - 8;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i2];
                i2++;
                i3 = (i3 + b3) - 8;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.$$j
            int r8 = r8 * 3
            int r8 = 99 - r8
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + 2
            int r9 = r3 + 1
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.j(short, short, byte, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(MsisdnEditActivity msisdnEditActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = msisdnEditActivity.binding;
        int i4 = copydefault + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    static ViewDataBinding access$100(MsisdnEditActivity msisdnEditActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = msisdnEditActivity.binding;
        int i4 = copydefault + 53;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.profile_activity_profile_edit_msisdn;
        if (i3 != 0) {
            return i4;
        }
        throw null;
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 3784, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, (char) (26860 - Drawable.resolveOpacity(0, 0)), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - ExpandableListView.getPackedPositionType(0L), KeyEvent.normalizeMetaState(0) + 16, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 65;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i10 = $11 + 37;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[i3 / iTrustedWebActivityServiceStub.ShareDataUIState];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - View.MeasureSpec.makeMeasureSpec(0, 0), 16 - Color.alpha(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.MeasureSpec.getSize(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + 91;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int[] iArr3;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = ShareDataUIState;
        int i3 = 684241640;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr4[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(j) + 4391, 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.indexOf("", ""), -309236339, false, $$r((byte) 41, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr5[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 684241640;
                    j = 0;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = ShareDataUIState;
        if (iArr7 != null) {
            int i9 = $10 + 61;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr7[i10]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    iArr3 = iArr7;
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4391, ExpandableListView.getPackedPositionChild(0L) + 38, (char) Drawable.resolveOpacity(0, 0), -309236339, false, $$r((byte) 41, b3, b3), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i10++;
                int i11 = $11 + 89;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                iArr7 = iArr3;
                i4 = 1;
            }
            iArr7 = iArr2;
        }
        char c2 = 0;
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 83;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                getactivenotifications.ShareDataUIState ^= iArr6[i13];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2967, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Color.blue(0) + 49871), 462826032, false, $$r((byte) ($$o & 191), b4, b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr6);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 2944, (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, (char) (TextUtils.indexOf("", "", 0, 0) + 27637), -1616366948, false, $$r((byte) 42, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private void lambda$onCreate$0(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        showInput(0);
        int i4 = component1 + 61;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 14, new int[]{1072935991, -472491674, -1166531544, -2140302973, 2127177982, -1927180347, 412954599, -1257001197, 1042800148, 1345170447}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 27, new int[]{36705225, 741694195, 1201223762, -1909785858}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 11, new int[]{1072935991, -472491674, -1166531544, -2140302973, -721140354, -1260807184, 1420257545, -433560493, 1090546832, 1631860563, 1316054547, 1121387443, 158848905, -264369975}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g((-16777198) - Color.rgb(0, 0, 0), new int[]{646215154, 46842118, 1820734908, -130616331, -1844103004, 1176318056, 772546487, 1939100040, -39199422, 1247093083}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i2 = component1 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6618, 41 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(21 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{JSONLexer.EOI, 65518, 65518, 65514, 27, 65519, 30, 65516, 65522, 65522, 65519, 28, 65513, 30, 28, 65520, 65519, 31, 65514, 65522, JSONLexer.EOI, 27, 65517, 65520, 65517, 65518, 65513, 65517, 65519, JSONLexer.EOI, 28, 65522, 65515, 65514, 65513, JSONLexer.EOI, 30, 31, 31, JSONLexer.EOI, 27, 65517, 31, 65521, 65517, 30, 65519, 65516}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 55, true, 48 - View.MeasureSpec.getSize(0), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 38, new int[]{-159598715, 51649226, 718902667, 1641659153, -1150801575, -137551525, -800987454, 1145796011, 827182679, 1440677627, -346983575, -1285688613, 1410884300, 1389759701, -213051461, 208632507, 959901923, -1040616816, -1135509663, -124784876, -686616658, 1464900687, -120706079, 204411926, -460609146, -606222242, -1169815105, -866423410, 1714478937, 580222504, -191765000, -2056114146}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 45, new int[]{-412899117, -108572828, -1033425331, -847369906, 69513411, 1159015675, 1680090892, 640246977, 1754075048, -1051566417, 1690101089, -1251874345, 1074490875, -1010400687, 1306557384, -1921371165, 602092909, 2031490093, 992112420, 183542476, -2032088768, -1738692038, -878136541, -416750161, 1508894362, -414119998, -2034998968, 1529473846, 899210087, -703883767, -455151236, -1726399903}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).codePointAt(0) + 40, new int[]{-285369578, -342917926, -1145136495, 683494945, -1434682098, -1099143178, -681635066, -162823221, -2024971145, -332830248, 1757163893, 1380878251, 1444916488, -1924132248, -150479985, -1606636586, -1413308937, -1500791277, -1204420379, -2022568168, 599140964, 1260840622, 1597524477, -682083339, -10588662, 1225861934, 1107477805, 1942519324, 1050512480, -672958823, 1810760750, 255003905, -915354860, 1337825483, 108529459, 1612644778}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).length() + 5, new int[]{1902895939, -1595288699, 993285253, -2050405964}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37, new int[]{459071830, 2051028877, 62134745, -501976263, 1665370536, 261213634, 62819083, -2136575910, -438762500, 1004399569, 993983380, 1924699413, 135360570, 1805770338, -603486261, 1061685853, -2012667047, 2094866698}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 55 - Process.getGidForName(""), (char) TextUtils.getOffsetBefore("", 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2405;
            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
            char cMyTid = (char) (Process.myTid() >> 22);
            Object[] objArr13 = new Object[1];
            i((byte) 96, (byte) (-$$d[22]), r7[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, i4, cMyTid, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i5 = copydefault + 69;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int i7 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2404;
                int iMyPid = (Process.myPid() >> 22) + 26;
                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                Object[] objArr14 = new Object[1];
                i((byte) 93, (byte) (-$$d[22]), r6[8], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7, iMyPid, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new int[]{416572331, 1517305787, 4175980, -1169300526, 1335854281, 86024379, 281924750, 436217946}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 21, new char[]{19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, CharUtils.CR, 65531, 65506}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).codePointAt(0) + 169, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).codePointAt(0) - 16, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i8 = copydefault + 39;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 367918466};
                byte[] bArr = $$j;
                byte b2 = (byte) (-bArr[39]);
                byte b3 = bArr[14];
                Object[] objArr18 = new Object[1];
                j(b2, b3, b3, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr[12];
                byte b5 = bArr[14];
                Object[] objArr19 = new Object[1];
                j(b4, b5, (byte) (b5 | 43), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                    char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                    Object[] objArr20 = new Object[1];
                    i((byte) 93, (byte) (-$$d[22]), r8[8], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, bitsPerPixel, cRgb, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) - 28, new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) + 166, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 10, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    g((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, new int[]{-924780797, 80014565, -1118045220, 440367998, -204281014, -2080975004, 1966429212, 559743517}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iRgb = (-16774811) - Color.rgb(0, 0, 0);
                        int scrollBarFadeDuration = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char size = (char) View.MeasureSpec.getSize(0);
                        byte[] bArr2 = $$d;
                        Object[] objArr23 = new Object[1];
                        i((byte) 84, (byte) (bArr2[9] - 1), (byte) (-bArr2[38]), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, scrollBarFadeDuration, size, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2405;
                        int mirror = AndroidCharacter.getMirror('0') - 22;
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        Object[] objArr24 = new Object[1];
                        i((byte) 96, (byte) (-$$d[22]), r7[33], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, mirror, defaultSize, -2047739879, false, (String) objArr24[0], null);
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 6618, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-1882189117, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 56, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b6 = $$j[14];
                byte b7 = b6;
                Object[] objArr26 = new Object[1];
                j(b6, b7, (byte) (b7 | TarHeader.LF_DIR), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.setErrorText(getString(R.string.profile_mobile_tips3));
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.setErrorIconResId(R.mipmap.base_icon_close1);
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.setErrorIconColor(ColorUtils.getColor(R.color.colorPlaceholderText));
        ImageView endIcon = ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEndIcon();
        if (endIcon != null) {
            endIcon.setOnClickListener(new FilterFastClickListener() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public void onFilterClick(View view) {
                    int i12 = 2 % 2;
                    int i13 = ShareDataUIState + 39;
                    component3 = i13 % 128;
                    if (i13 % 2 != 0) {
                        ((ProfileActivityProfileEditMsisdnBinding) MsisdnEditActivity.access$000(MsisdnEditActivity.this)).phoneNumberInput.getEditText().setText("");
                        ((ProfileActivityProfileEditMsisdnBinding) MsisdnEditActivity.access$100(MsisdnEditActivity.this)).phoneNumberInput.showError(null);
                        int i14 = 65 / 0;
                    } else {
                        ((ProfileActivityProfileEditMsisdnBinding) MsisdnEditActivity.access$000(MsisdnEditActivity.this)).phoneNumberInput.getEditText().setText("");
                        ((ProfileActivityProfileEditMsisdnBinding) MsisdnEditActivity.access$100(MsisdnEditActivity.this)).phoneNumberInput.showError(null);
                    }
                }
            });
        }
        TextView startUnit = ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getStartUnit();
        if (startUnit != null) {
            startUnit.setText("+" + AppConfigManager.getAppConfig().getPhoneNumberCode());
        }
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).btnNext.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onFilterClick(View view) {
                int i12 = 2 % 2;
                int i13 = component1 + 3;
                copydefault = i13 % 128;
                int i14 = i13 % 2;
                MsisdnEditActivity.m10869$$Nest$monSaveClick(MsisdnEditActivity.this);
                int i15 = component1 + 1;
                copydefault = i15 % 128;
                int i16 = i15 % 2;
            }
        });
        ViewUtils.softInputAdjustResize(getWindow(), ((ProfileActivityProfileEditMsisdnBinding) this.binding).getRoot());
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.attach(((ProfileActivityProfileEditMsisdnBinding) this.binding).btnNext);
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.setRecentPhone();
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEditText().setText("");
        showInput(200);
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.findViewById(R.id.cl_input).setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i12 = 2 % 2;
                int i13 = component2 + 65;
                ShareDataUIState = i13 % 128;
                int i14 = i13 % 2;
                MsisdnEditActivity.$r8$lambda$UEQ912zK9Xy37X_1GKQiHkesoyg(this.f$0, view);
                int i15 = component2 + 59;
                ShareDataUIState = i15 % 128;
                int i16 = i15 % 2;
            }
        });
        observe();
    }

    private void lambda$showInput$1() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        KeyboardUtils.showSoftInput(this);
        int i4 = component1 + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void showInput(int i) {
        int i2 = 2 % 2;
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEditText().requestFocus();
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEditText().postDelayed(new Runnable() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void run() {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 121;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    MsisdnEditActivity.m10868$r8$lambda$jsdNM_yXqx872mvZQQyyc3pVdE(this.f$0);
                    int i5 = 21 / 0;
                } else {
                    MsisdnEditActivity.m10868$r8$lambda$jsdNM_yXqx872mvZQQyyc3pVdE(this.f$0);
                }
                int i6 = copydefault + 11;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
        }, i);
        int i3 = copydefault + 35;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
    }

    private void observe() {
        int i = 2 % 2;
        ((ProfileViewModel) this.viewModel).getVerifyMsisdn().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 109;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                MsisdnEditActivity.$r8$lambda$9VKFW5k3o4SFjCDCYN7Np4cQcWI(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 37;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.hideLoading(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4.error() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        showError(r4.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if ("Register".equals(r4.getData()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.component1 + 47;
        com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.copydefault = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if ((r4 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        showError(getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips11));
        r4 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        showError(getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils.filterUnNumber(((com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditMsisdnBinding) r3.binding).phoneNumberInput.getCompleteText());
        r0 = new android.content.Intent(r3, (java.lang.Class<?>) com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.class);
        r0.putExtra("msisdn", r4);
        startActivity(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.copydefault + 43;
        com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.component1 = r4 % 128;
        r4 = r4 % 2;
        com.huawei.common.widget.dialog.DialogManager.showLoading(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$observe$2(com.huawei.payment.mvvm.Resource r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.component1
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            boolean r1 = r4.loading()
            r2 = 16
            int r2 = r2 / 0
            if (r1 == 0) goto L2c
            goto L1f
        L19:
            boolean r1 = r4.loading()
            if (r1 == 0) goto L2c
        L1f:
            int r4 = com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.copydefault
            int r4 = r4 + 43
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.component1 = r1
            int r4 = r4 % r0
            com.huawei.common.widget.dialog.DialogManager.showLoading(r3)
            return
        L2c:
            com.huawei.common.widget.dialog.DialogManager.hideLoading(r3)
            boolean r1 = r4.error()
            if (r1 == 0) goto L3d
            java.lang.String r4 = r4.getMessage()
            r3.showError(r4)
            return
        L3d:
            java.lang.String r1 = "Register"
            java.lang.Object r4 = r4.getData()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L6c
            int r4 = com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.component1
            int r4 = r4 + 47
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.copydefault = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L62
            int r4 = com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips11
            java.lang.String r4 = r3.getString(r4)
            r3.showError(r4)
            r4 = 33
            int r4 = r4 / 0
            goto L89
        L62:
            int r4 = com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips11
            java.lang.String r4 = r3.getString(r4)
            r3.showError(r4)
            goto L89
        L6c:
            Binding extends androidx.databinding.ViewDataBinding r4 = r3.binding
            com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditMsisdnBinding r4 = (com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileEditMsisdnBinding) r4
            com.huawei.digitalpayment.consumer.baselib.widget.input.MobileInputView r4 = r4.phoneNumberInput
            java.lang.String r4 = r4.getCompleteText()
            java.lang.String r4 = com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils.filterUnNumber(r4)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity> r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "msisdn"
            r0.putExtra(r1, r4)
            r3.startActivity(r0)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.lambda$observe$2(com.huawei.payment.mvvm.Resource):void");
    }

    private void showError(String str) {
        int i = 2 % 2;
        ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.showError(str);
        if (((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEndIcon() != null) {
            int i2 = copydefault + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEndIcon().setVisibility(0);
            ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEndIcon().setColorFilter(ColorUtils.getColor(R.color.colorPlaceholderText));
            ((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getEndIcon().setImageResource(R.mipmap.base_icon_close1);
        }
        int i4 = copydefault + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void onSaveClick() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ((ProfileViewModel) this.viewModel).verifyMsisdn(PhoneUtils.filterUnNumber(((ProfileActivityProfileEditMsisdnBinding) this.binding).phoneNumberInput.getCompleteText()));
        int i4 = copydefault + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component1 + 23;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = component1 + 75;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 83, new int[]{1072935991, -472491674, -1166531544, -2140302973, -721140354, -1260807184, 1420257545, -433560493, 1090546832, 1631860563, 1316054547, 1121387443, 158848905, -264369975}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 17, new int[]{646215154, 46842118, 1820734908, -130616331, -1844103004, 1176318056, 772546487, 1939100040, -39199422, 1247093083}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i5 = copydefault + 65;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = component1 + 1;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) + 42, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.resolveSizeAndState(0, 0, 0), View.resolveSize(0, 0) + 56, (char) TextUtils.getOffsetAfter("", 0), -960739708, false, "component3", new Class[]{Context.class});
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

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r47) {
        /*
            Method dump skipped, instruction units count: 14954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.MsisdnEditActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$9VKFW5k3o4SFjCDCYN7Np4cQcWI(MsisdnEditActivity msisdnEditActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        msisdnEditActivity.lambda$observe$2(resource);
        int i4 = component1 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$UEQ912zK9Xy37X_1GKQiHkesoyg(MsisdnEditActivity msisdnEditActivity, View view) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10870instrumented$0$onCreate$LandroidosBundleV(msisdnEditActivity, view);
        int i4 = component1 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    public static void m10868$r8$lambda$jsdNM_yXqx872mvZQQyyc3pVdE(MsisdnEditActivity msisdnEditActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        msisdnEditActivity.lambda$showInput$1();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component1 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void m10869$$Nest$monSaveClick(MsisdnEditActivity msisdnEditActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        msisdnEditActivity.onSaveClick();
        if (i3 != 0) {
            throw null;
        }
        int i4 = component1 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m10870instrumented$0$onCreate$LandroidosBundleV(MsisdnEditActivity msisdnEditActivity, View view) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            msisdnEditActivity.lambda$onCreate$0(view);
            Callback.onClick_exit();
            int i4 = copydefault + 85;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = copydefault + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
