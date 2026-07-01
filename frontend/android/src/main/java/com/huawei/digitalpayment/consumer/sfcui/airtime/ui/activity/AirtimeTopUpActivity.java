package com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.base.util.GsmHelper;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAirtimeTopUpBinding;
import com.huawei.digitalpayment.consumer.sfcui.airtime.ui.adapter.AirtimeTabViewAdapter;
import com.huawei.digitalpayment.consumer.sfcui.airtime.ui.fragment.AirtimeTopUpFragment;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0007H\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/airtime/ui/activity/AirtimeTopUpActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityAirtimeTopUpBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "currentPosition", "", "titles", "Lkotlin/collections/ArrayList;", "", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "shouldApplyTopInset", "", "initView", "needSoftFix", "initTab", "updateTabView", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "selected", "initToolbar", "title", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class AirtimeTopUpActivity extends Hilt_AirtimeTopUpActivity<ActivityAirtimeTopUpBinding, ViewModel> {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static char component3;
    private static char[] copydefault;
    private static int equals;
    private int currentPosition;
    private ArrayList<String> titles;
    private static final byte[] $$c = {98, -3, -80, -4};
    private static final int $$f = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {113, 46, 90, -12, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarHeader.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarHeader.LF_NORMAL, -69, 6, -25, 9, -19, 3, 2, -17, 56, -65, -11, -12, 9, -19, -2, 7, -17, 56, -40, -23, -23, 9, -8, -13, 5, -7, -16, 1, Ascii.FF, -35, 9, -23, -7, 8, Ascii.SYN, -43, -12, 45, -55, -6, Ascii.VT, -30, 79, -19, -18, -4, -9, -5, -5, 3, -15, -12, Base64.padSymbol, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -4, 57, -76, Ascii.FF, -25, 0, -5, -7, -4, -8, 59, -78, 7, -2, -24, 1, 9, -12, -4, -19, 8, -17, -11, -5, 4, -11, 4, -11, 0, -4, -25, -1, -9, 62, -42, 40, -78, 5, -30, 4, -12, -5, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14};
    private static final int $$h = 113;
    private static final byte[] $$a = {101, 74, 115, 66, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 45;
    private static int component4 = 0;
    private static int component1 = 0;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r7, short r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$c
            int r7 = 119 - r7
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$i(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$a
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r8 = r8 + 4
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.d(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 99 - r6
            int r7 = 126 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$g
            int r8 = 63 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-6)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.e(short, int, int, java.lang.Object[]):void");
    }

    public static final void access$setCurrentPosition$p(AirtimeTopUpActivity airtimeTopUpActivity, int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        airtimeTopUpActivity.currentPosition = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 45;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final void access$updateTabView(AirtimeTopUpActivity airtimeTopUpActivity, TabLayout.Tab tab, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        airtimeTopUpActivity.updateTabView(tab, z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component1 + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_airtime_top_up;
        if (i3 == 0) {
            int i5 = 81 / 0;
        }
        return i4;
    }

    private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = ShareDataUIState;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - MotionEvent.axisFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (char) (65118 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                if (i8 % 2 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != b2 : bArr[iTrustedWebActivityService_Parcel.copydefault] != b2) {
                    int i9 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3580;
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        byte length2 = (byte) $$c.length;
                        byte b3 = (byte) (length2 - 4);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i10, packedPositionChild, 1180380354, false, $$i(length2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    int i11 = $10 + 1;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    int i13 = $10 + 113;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c3);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 4503, 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (27897 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), -1464227204, false, $$i((byte) 9, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 5;
                    byte b6 = (byte) (b5 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - TextUtils.getCapsMode("", 0, 0), 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 80302927, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i16 = $11 + 77;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i18 = $11 + 115;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i20 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i20, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i20);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i21 = $11 + 113;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 % iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bf  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.onCreate(android.os.Bundle):void");
    }

    private final void initView() {
        int i = 2 % 2;
        initTab();
        ((ActivityAirtimeTopUpBinding) this.binding).tvTitle.setText(getString(R.string.airtime_top_up));
        ((ActivityAirtimeTopUpBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 67;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                AirtimeTopUpActivity.$r8$lambda$Ga1eI3GTZ4QmitgAa3NpOfGFxAI(this.f$0, view);
                int i5 = copydefault + 91;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component1 + 119;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void initView$lambda$0(AirtimeTopUpActivity airtimeTopUpActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(airtimeTopUpActivity, "");
        airtimeTopUpActivity.finish();
        int i4 = component1 + 15;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char[] r30, byte r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.b(char[], byte, int, java.lang.Object[]):void");
    }

    private static final void initTab$lambda$1(AirtimeTopUpActivity airtimeTopUpActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(airtimeTopUpActivity, "");
        Intrinsics.checkNotNullParameter(tab, "");
        String str = null;
        View viewInflate = LayoutInflater.from(airtimeTopUpActivity).inflate(R.layout.custom_tab, (ViewGroup) null);
        RoundTextView roundTextView = (RoundTextView) viewInflate.findViewById(R.id.tv_title);
        ArrayList<String> arrayList = airtimeTopUpActivity.titles;
        if (arrayList != null) {
            str = arrayList.get(i);
            int i3 = component2 + 125;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        roundTextView.setText(str);
        tab.setCustomView(viewInflate);
        int i5 = component1 + 99;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
    }

    private final void initTab() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        this.titles = new ArrayList<>();
        if (!GsmHelper.INSTANCE.isGsmLogin()) {
            ArrayList<String> arrayList2 = this.titles;
            if (arrayList2 != null) {
                int i2 = component2 + 121;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                arrayList2.add(getString(R.string.mpesa));
            }
            arrayList.add(AirtimeTopUpFragment.INSTANCE.newInstance(TradeTypeConstant.AIRTIME_MPESA));
        }
        arrayList.add(AirtimeTopUpFragment.INSTANCE.newInstance(TradeTypeConstant.AIRTIME_SCRATCH_CARD));
        ArrayList<String> arrayList3 = this.titles;
        if (arrayList3 != null) {
            int i4 = component1 + 109;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            arrayList3.add(getString(R.string.scratch_card));
        }
        AirtimeTabViewAdapter airtimeTabViewAdapter = new AirtimeTabViewAdapter(this, arrayList);
        if (arrayList.size() <= 1) {
            int i6 = component1 + 37;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            ((ActivityAirtimeTopUpBinding) this.binding).rlTabContainer.setVisibility(8);
        }
        ((ActivityAirtimeTopUpBinding) this.binding).viewPager.setAdapter(airtimeTabViewAdapter);
        ((ActivityAirtimeTopUpBinding) this.binding).viewPager.setOffscreenPageLimit(-1);
        ((ActivityAirtimeTopUpBinding) this.binding).viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onPageSelected(int position) {
                int i8 = 2 % 2;
                int i9 = ShareDataUIState + 119;
                component3 = i9 % 128;
                Object obj = null;
                if (i9 % 2 == 0) {
                    AirtimeTopUpActivity.access$setCurrentPosition$p(AirtimeTopUpActivity.this, position);
                    throw null;
                }
                AirtimeTopUpActivity.access$setCurrentPosition$p(AirtimeTopUpActivity.this, position);
                int i10 = ShareDataUIState + 23;
                component3 = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        new TabLayoutMediator(((ActivityAirtimeTopUpBinding) this.binding).tabLayout, ((ActivityAirtimeTopUpBinding) this.binding).viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onConfigureTab(TabLayout.Tab tab, int i8) {
                int i9 = 2 % 2;
                int i10 = component2 + 59;
                component1 = i10 % 128;
                int i11 = i10 % 2;
                AirtimeTopUpActivity.m11094$r8$lambda$J2Dz1NlZS27no7SZD8jzhSHHFI(this.f$0, tab, i8);
                int i12 = component1 + 125;
                component2 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }
        }).attach();
        ((ActivityAirtimeTopUpBinding) this.binding).tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                AirtimeTopUpActivity airtimeTopUpActivity;
                boolean z;
                int i8 = 2 % 2;
                int i9 = component3 + 25;
                component2 = i9 % 128;
                if (i9 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(tab, "");
                    airtimeTopUpActivity = AirtimeTopUpActivity.this;
                    z = false;
                } else {
                    Intrinsics.checkNotNullParameter(tab, "");
                    airtimeTopUpActivity = AirtimeTopUpActivity.this;
                    z = true;
                }
                AirtimeTopUpActivity.access$updateTabView(airtimeTopUpActivity, tab, z);
                int i10 = component2 + 115;
                component3 = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int i8 = 2 % 2;
                int i9 = component3 + 85;
                component2 = i9 % 128;
                if (i9 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(tab, "");
                } else {
                    Intrinsics.checkNotNullParameter(tab, "");
                }
                AirtimeTopUpActivity.access$updateTabView(AirtimeTopUpActivity.this, tab, false);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int i8 = 2 % 2;
                int i9 = component2 + 93;
                component3 = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.checkNotNullParameter(tab, "");
                if (i10 == 0) {
                    int i11 = 17 / 0;
                }
            }
        });
        TabLayout.Tab tabAt = ((ActivityAirtimeTopUpBinding) this.binding).tabLayout.getTabAt(0);
        if (tabAt != null) {
            updateTabView(tabAt, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if ((!com.huawei.digitalpayment.consumer.base.util.ThemeUtils.INSTANCE.isDarkModeEnabled()) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component1 + 15;
        com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component2 = r5 % 128;
        r5 = r5 % 2;
        r4.setBackgroundColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_on_secondary_container));
        r4.setTextColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.text_color_dark));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        r4.setBackgroundColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_f7f7f7_light));
        r4.setTextColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_303030_light));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r4.setBackgroundColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_35a839));
        r4.setTextColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.white));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateTabView(com.google.android.material.tabs.TabLayout.Tab r4, boolean r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component2
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L24
            android.view.View r4 = r4.getCustomView()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_title
            android.view.View r4 = r4.findViewById(r1)
            com.huawei.common.widget.round.RoundTextView r4 = (com.huawei.common.widget.round.RoundTextView) r4
            r1 = 24
            int r1 = r1 / 0
            if (r5 == 0) goto L48
            goto L35
        L24:
            android.view.View r4 = r4.getCustomView()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_title
            android.view.View r4 = r4.findViewById(r1)
            com.huawei.common.widget.round.RoundTextView r4 = (com.huawei.common.widget.round.RoundTextView) r4
            if (r5 == 0) goto L48
        L35:
            int r5 = com.huawei.digitalpayment.consumer.sfc.R.color.color_35a839
            int r5 = r3.getColor(r5)
            r4.setBackgroundColor(r5)
            int r5 = com.huawei.digitalpayment.consumer.sfc.R.color.white
            int r5 = r3.getColor(r5)
            r4.setTextColor(r5)
            goto L80
        L48:
            com.huawei.digitalpayment.consumer.base.util.ThemeUtils r5 = com.huawei.digitalpayment.consumer.base.util.ThemeUtils.INSTANCE
            boolean r5 = r5.isDarkModeEnabled()
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == r1) goto L6e
            int r5 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component1
            int r5 = r5 + 15
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component2 = r1
            int r5 = r5 % r0
            int r5 = com.huawei.digitalpayment.consumer.sfc.R.color.color_on_secondary_container
            int r5 = r3.getColor(r5)
            r4.setBackgroundColor(r5)
            int r5 = com.huawei.digitalpayment.consumer.sfc.R.color.text_color_dark
            int r5 = r3.getColor(r5)
            r4.setTextColor(r5)
            goto L80
        L6e:
            int r5 = com.huawei.digitalpayment.consumer.sfc.R.color.color_f7f7f7_light
            int r5 = r3.getColor(r5)
            r4.setBackgroundColor(r5)
            int r5 = com.huawei.digitalpayment.consumer.sfc.R.color.color_303030_light
            int r5 = r3.getColor(r5)
            r4.setTextColor(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.updateTabView(com.google.android.material.tabs.TabLayout$Tab, boolean):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = component1 + 91;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            c(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 26, 26, 0}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{'*', 27, 13882, 13882, 15, AbstractJsonLexerKt.COMMA, 27, '$', 13884, 13884, '\'', 16, '*', 20, 25, 15, 1, '.'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952856_res_0x7f1304d8).substring(9, 10).codePointAt(0) + 50), ((Process.getThreadPriority(0) + 20) >> 6) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.normalizeMetaState(0), 42 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 55 - TextUtils.lastIndexOf("", '0', 0), (char) Color.alpha(0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = component2 + 115;
                component1 = i6 % 128;
                int i7 = i6 % 2;
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

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            c(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 26, 26, 0}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{'*', 27, 13882, 13882, 15, AbstractJsonLexerKt.COMMA, 27, '$', 13884, 13884, '\'', 16, '*', 20, 25, 15, 1, '.'}, (byte) (82 - View.MeasureSpec.makeMeasureSpec(0, 0)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component1 + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = component2 + 101;
            component1 = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getTapTimeout() >> 16), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 6562, 56 - View.resolveSizeAndState(0, 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6618, 42 - (ViewConfiguration.getTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 6562, Color.alpha(0) + 56, (char) (KeyEvent.getMaxKeyCode() >> 16), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
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

    /* JADX WARN: Can't wrap try/catch for region: R(44:(42:779|37|(2:39|(3:41|(2:43|48)|47)(3:44|(2:46|48)|47))(1:48)|85|776|86|(13:780|88|92|93|768|94|(2:778|96)|100|101|(4:103|104|(1:106)|107)(12:(2:109|(1:115)(1:114))(1:117)|(21:119|120|824|121|756|122|(1:124)|125|126|745|127|(1:129)|130|131|132|(1:134)|135|(1:137)|138|(1:140)|141)(1:186)|191|192|805|193|196|197|(1:199)|200|201|202)|142|(4:145|(3:827|147|830)(12:826|148|(3:150|(3:153|154|151)|831)|155|813|156|(1:158)|159|160|796|161|829)|828|143)|825)(11:92|93|768|94|(0)|100|101|(0)(0)|142|(1:143)|825)|203|782|204|(1:206)|207|(3:209|(1:211)|212)(19:213|214|766|215|(1:217)|218|219|758|220|(1:222)|223|224|225|(1:227)|228|(1:230)|231|(1:233)|234)|235|(4:238|(3:834|240|837)(12:833|241|(3:243|(3:246|247|244)|838)|248|748|249|(1:251)|252|253|818|254|836)|835|236)|832|289|817|290|(1:292)|293|294|(2:296|(4:298|299|(1:301)|302)(3:303|(1:305)|306))(19:307|308|807|309|(1:311)|312|313|787|314|(1:316)|317|318|319|(1:321)|322|(1:324)|325|(1:327)|328)|329|(4:332|(3:841|334|844)(12:840|335|(3:337|(3:340|341|338)|845)|342|774|343|(1:345)|346|347|762|348|843)|842|330)|839|383|747|384|(1:386)|387|388|(4:390|391|(1:393)|394)(14:396|397|815|398|(1:400)|401|402|403|(1:405)|406|(1:408)|409|(1:411)|412)|395|413|(9:416|803|417|(1:419)|420|421|422|785|423)|453|(1:455)|456|(3:458|(1:460)|461)(14:462|463|(1:465)|466|467|(1:469)|470|798|471|472|(1:474)|475|(1:477)|478)|479|(9:481|(1:483)|484|(1:486)|487|(3:489|(1:491)|492)(16:494|495|(1:497)|498|(1:500)|501|502|(1:504)|505|770|506|507|(1:509)|510|(1:512)|513)|493|514|(25:516|802|517|(1:519)|520|(1:522)|523|(3:525|(1:527)|528)(16:(2:530|(1:536)(1:535))|(19:538|539|783|540|(1:542)|543|544|772|545|(1:547)|548|549|550|(1:552)|553|(1:555)|556|(1:558)|559)|619|(1:621)|622|(3:624|(1:626)|627)(13:629|809|630|631|(1:633)|634|791|635|636|(1:638)|639|(1:641)|642)|628|643|(6:646|647|(1:649)|650|651|652)|653|(1:655)|656|(3:658|(1:660)|661)(14:663|664|(1:666)|667|668|(1:670)|671|820|672|673|(1:675)|676|(1:678)|679)|662|680|(1:860)(7:683|684|(1:686)|687|688|689|690))|560|(4:563|(3:851|565|(3:849|567|856)(12:848|571|(3:573|(3:576|577|574)|857)|578|760|579|(1:581)|582|583|750|584|855))(3:847|568|(3:850|570|854)(12:852|571|(0)|578|760|579|(0)|582|583|750|584|855))|853|561)|846|619|(0)|622|(0)(0)|628|643|(0)|653|(0)|656|(0)(0)|662|680|(0)(0))(10:700|(3:702|(2:705|703)|858)|706|707|(1:709)|710|(1:712)|713|714|715))(10:718|(3:720|(2:723|721)|859)|724|725|(1:727)|728|(1:730)|731|732|733))(1:52)|822|58|(1:60)|61|85|776|86|(0)(0)|203|782|204|(0)|207|(0)(0)|235|(1:236)|832|289|817|290|(0)|293|294|(0)(0)|329|(1:330)|839|383|747|384|(0)|387|388|(0)(0)|395|413|(0)|453|(0)|456|(0)(0)|479|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0b7d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0b7e, code lost:
    
        r9 = r22;
        r10 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x1102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x1103, code lost:
    
        r7 = new java.lang.Object[1];
        b(new char[]{7, ' ', '\'', 18, 30, '.', 21, 30, 30, '.', 13788}, (byte) (50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952810_res_0x7f1304aa).substring(9, 10).length() + 10, r7);
        r4 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x1153, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r3);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x116a, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x116e, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r2);
        r3.add(r4);
        r13 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r4 = r4 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x119d, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x11a1, code lost:
    
        if (r2 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x11a3, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 6619, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x11d3, code lost:
    
        r2 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x11da, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component2 + 105;
        com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component1 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x11e5, code lost:
    
        r8 = new java.lang.Object[]{1316862214, java.lang.Long.valueOf(r4), r3, null, false};
        r3 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.graphics.Color.red(0), 56 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", '0')));
        r4 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$g[19];
        r5 = (byte) (r4 | com.alibaba.ariver.resource.parser.tar.TarHeader.LF_BLK);
        r12 = new java.lang.Object[1];
        e(r4, r5, (byte) (r5 + 1), r12);
        r3.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x16d9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x16da, code lost:
    
        r8 = new java.lang.Object[1];
        b(new char[]{6, 14, 4, 28, 31, 18, org.apache.commons.lang3.CharUtils.CR, 18, '!', 29}, (byte) (((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 45), ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1736, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x174d, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x1751, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
        r13 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r2 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x1781, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1785, code lost:
    
        if (r5 == null) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1787, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 42 - android.text.TextUtils.getTrimmedLength(""), (char) android.text.TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x17af, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x17b6, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component1 + 69;
        com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x17c1, code lost:
    
        r8 = new java.lang.Object[]{1316862214, java.lang.Long.valueOf(r2), r4, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, (char) android.graphics.Color.argb(0, 0, 0, 0));
        r3 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$g[19];
        r4 = (byte) (r3 | com.alibaba.ariver.resource.parser.tar.TarHeader.LF_BLK);
        r12 = new java.lang.Object[1];
        e(r3, r4, (byte) (r4 + 1), r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x1ba2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1ba3, code lost:
    
        r8 = new java.lang.Object[1];
        b(new char[]{'%', 30, '%', 30, 28, 4, '.', 30, 28, 2, 13851}, (byte) (((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 2), 11 - android.text.TextUtils.getOffsetBefore("", 0), r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1be0, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r2 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x1bf7, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x1bfb, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
        r13 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r2 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x1c2b, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x1c2f, code lost:
    
        if (r5 == null) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x1c31, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 6619, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, (char) android.widget.ExpandableListView.getPackedPositionType(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x1c5d, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x1c65, code lost:
    
        r8 = new java.lang.Object[]{1316862214, java.lang.Long.valueOf(r2), r4, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.graphics.Color.green(0), 55 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        r3 = com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.$$g[19];
        r4 = (byte) (r3 | com.alibaba.ariver.resource.parser.tar.TarHeader.LF_BLK);
        r12 = new java.lang.Object[1];
        e(r3, r4, (byte) (r4 + 1), r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0a44 A[Catch: all -> 0x0b5f, TryCatch #43 {all -> 0x0b5f, blocks: (B:142:0x0a3a, B:143:0x0a3e, B:145:0x0a44, B:148:0x0a5c, B:151:0x0a68, B:153:0x0a6b, B:165:0x0b4d, B:167:0x0b53, B:168:0x0b54, B:170:0x0b56, B:172:0x0b5d, B:173:0x0b5e, B:121:0x07a5, B:132:0x0916, B:134:0x091c, B:135:0x0964, B:137:0x098e, B:138:0x09d3, B:140:0x09e9, B:141:0x0a34, B:177:0x0b62, B:179:0x0b69, B:180:0x0b6a, B:182:0x0b6c, B:184:0x0b73, B:185:0x0b74, B:127:0x0869, B:129:0x088d, B:130:0x090a, B:122:0x081e, B:124:0x0832, B:125:0x0862, B:161:0x0acf, B:156:0x0a98, B:158:0x0a9e, B:159:0x0ac7), top: B:824:0x07a5, inners: #0, #6, #28, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0c48 A[Catch: all -> 0x03c8, TryCatch #26 {all -> 0x03c8, blocks: (B:647:0x2e06, B:649:0x2e0c, B:650:0x2e33, B:684:0x3150, B:686:0x3156, B:687:0x317f, B:664:0x2f81, B:666:0x2fa4, B:667:0x2ffe, B:613:0x2ab5, B:615:0x2abb, B:616:0x2ae8, B:707:0x3252, B:709:0x3258, B:710:0x3284, B:712:0x32be, B:713:0x3306, B:495:0x225f, B:497:0x2274, B:498:0x22ac, B:500:0x22e0, B:501:0x235d, B:725:0x33da, B:727:0x33e0, B:728:0x3403, B:730:0x343d, B:731:0x3482, B:463:0x1e32, B:465:0x1e47, B:466:0x1e78, B:447:0x1c2b, B:449:0x1c31, B:450:0x1c5d, B:377:0x1781, B:379:0x1787, B:380:0x17af, B:283:0x119d, B:285:0x11a3, B:286:0x11d3, B:197:0x0c42, B:199:0x0c48, B:200:0x0c76, B:79:0x0579, B:81:0x057f, B:82:0x05ae, B:23:0x018b, B:25:0x0191, B:26:0x01b9, B:28:0x0331, B:30:0x0363, B:31:0x03c2, B:384:0x1839, B:386:0x183f, B:387:0x1884, B:391:0x189e, B:393:0x18a4, B:394:0x18ea, B:413:0x1a99, B:421:0x1b02, B:427:0x1b86, B:429:0x1b8c, B:430:0x1b8d, B:432:0x1b8f, B:434:0x1b96, B:435:0x1b97, B:396:0x18f6, B:403:0x197f, B:405:0x1985, B:406:0x19cf, B:408:0x19f9, B:409:0x1a39, B:411:0x1a4f, B:412:0x1a91, B:437:0x1b99, B:439:0x1ba0, B:440:0x1ba1, B:423:0x1b08, B:417:0x1aca, B:419:0x1ad0, B:420:0x1afb, B:398:0x1916, B:400:0x1928, B:401:0x1973, B:37:0x03d0, B:41:0x03e0, B:65:0x04df, B:67:0x04e5, B:68:0x04e6, B:70:0x04e8, B:72:0x04ef, B:73:0x04f0, B:44:0x03ee, B:48:0x03fa, B:54:0x0405, B:56:0x041a, B:57:0x044f, B:58:0x0455, B:60:0x0462, B:61:0x04d5, B:204:0x0cfa, B:206:0x0d00, B:207:0x0d4b, B:209:0x0d58, B:211:0x0d61, B:212:0x0da2, B:235:0x0fc9, B:236:0x0fcd, B:238:0x0fd3, B:241:0x0feb, B:244:0x0ff8, B:246:0x0ffb, B:258:0x10dc, B:260:0x10e2, B:261:0x10e3, B:263:0x10e5, B:265:0x10ec, B:266:0x10ed, B:213:0x0dad, B:225:0x0eaf, B:227:0x0eb5, B:228:0x0ef8, B:230:0x0f22, B:231:0x0f69, B:233:0x0f7f, B:234:0x0fc3, B:268:0x10ef, B:270:0x10f6, B:271:0x10f7, B:273:0x10f9, B:275:0x1100, B:276:0x1101, B:249:0x1028, B:251:0x102e, B:252:0x1058, B:220:0x0e18, B:222:0x0e2d, B:223:0x0ea3, B:215:0x0dcd, B:217:0x0de2, B:218:0x0e11, B:254:0x1060, B:517:0x2582, B:519:0x2588, B:520:0x25cd, B:522:0x25f4, B:523:0x263c, B:525:0x2652, B:527:0x265b, B:528:0x269c, B:560:0x28ef, B:561:0x28f3, B:565:0x2905, B:571:0x2935, B:574:0x2942, B:576:0x2945, B:588:0x2a28, B:590:0x2a2e, B:591:0x2a2f, B:593:0x2a31, B:595:0x2a38, B:596:0x2a39, B:568:0x291d, B:530:0x26a9, B:532:0x26ad, B:536:0x26b9, B:538:0x26bf, B:550:0x27ce, B:552:0x27d4, B:553:0x2818, B:555:0x2842, B:556:0x2887, B:558:0x289d, B:559:0x28e9, B:598:0x2a3b, B:600:0x2a42, B:601:0x2a43, B:603:0x2a45, B:605:0x2a4c, B:606:0x2a4d, B:290:0x125f, B:292:0x1265, B:293:0x12a9, B:299:0x12c5, B:301:0x12cb, B:302:0x1311, B:329:0x1593, B:330:0x1597, B:332:0x159d, B:335:0x15b4, B:338:0x15c1, B:340:0x15c4, B:352:0x16b3, B:354:0x16b9, B:355:0x16ba, B:357:0x16bc, B:359:0x16c3, B:360:0x16c4, B:303:0x1320, B:305:0x1329, B:306:0x136d, B:307:0x1378, B:319:0x147a, B:321:0x1480, B:322:0x14c5, B:324:0x14ef, B:325:0x1532, B:327:0x1548, B:328:0x158d, B:362:0x16c6, B:364:0x16cd, B:365:0x16ce, B:367:0x16d0, B:369:0x16d7, B:370:0x16d8), top: B:793:0x018b, inners: #1, #18, #20, #31, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0d00 A[Catch: all -> 0x1102, TryCatch #20 {all -> 0x1102, blocks: (B:204:0x0cfa, B:206:0x0d00, B:207:0x0d4b, B:209:0x0d58, B:211:0x0d61, B:212:0x0da2, B:235:0x0fc9, B:236:0x0fcd, B:238:0x0fd3, B:241:0x0feb, B:244:0x0ff8, B:246:0x0ffb, B:258:0x10dc, B:260:0x10e2, B:261:0x10e3, B:263:0x10e5, B:265:0x10ec, B:266:0x10ed, B:213:0x0dad, B:225:0x0eaf, B:227:0x0eb5, B:228:0x0ef8, B:230:0x0f22, B:231:0x0f69, B:233:0x0f7f, B:234:0x0fc3, B:268:0x10ef, B:270:0x10f6, B:271:0x10f7, B:273:0x10f9, B:275:0x1100, B:276:0x1101, B:249:0x1028, B:251:0x102e, B:252:0x1058, B:220:0x0e18, B:222:0x0e2d, B:223:0x0ea3, B:215:0x0dcd, B:217:0x0de2, B:218:0x0e11, B:254:0x1060), top: B:782:0x0cfa, outer: #26, inners: #2, #7, #11, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0d58 A[Catch: all -> 0x1102, TryCatch #20 {all -> 0x1102, blocks: (B:204:0x0cfa, B:206:0x0d00, B:207:0x0d4b, B:209:0x0d58, B:211:0x0d61, B:212:0x0da2, B:235:0x0fc9, B:236:0x0fcd, B:238:0x0fd3, B:241:0x0feb, B:244:0x0ff8, B:246:0x0ffb, B:258:0x10dc, B:260:0x10e2, B:261:0x10e3, B:263:0x10e5, B:265:0x10ec, B:266:0x10ed, B:213:0x0dad, B:225:0x0eaf, B:227:0x0eb5, B:228:0x0ef8, B:230:0x0f22, B:231:0x0f69, B:233:0x0f7f, B:234:0x0fc3, B:268:0x10ef, B:270:0x10f6, B:271:0x10f7, B:273:0x10f9, B:275:0x1100, B:276:0x1101, B:249:0x1028, B:251:0x102e, B:252:0x1058, B:220:0x0e18, B:222:0x0e2d, B:223:0x0ea3, B:215:0x0dcd, B:217:0x0de2, B:218:0x0e11, B:254:0x1060), top: B:782:0x0cfa, outer: #26, inners: #2, #7, #11, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0dad A[Catch: all -> 0x1102, TRY_LEAVE, TryCatch #20 {all -> 0x1102, blocks: (B:204:0x0cfa, B:206:0x0d00, B:207:0x0d4b, B:209:0x0d58, B:211:0x0d61, B:212:0x0da2, B:235:0x0fc9, B:236:0x0fcd, B:238:0x0fd3, B:241:0x0feb, B:244:0x0ff8, B:246:0x0ffb, B:258:0x10dc, B:260:0x10e2, B:261:0x10e3, B:263:0x10e5, B:265:0x10ec, B:266:0x10ed, B:213:0x0dad, B:225:0x0eaf, B:227:0x0eb5, B:228:0x0ef8, B:230:0x0f22, B:231:0x0f69, B:233:0x0f7f, B:234:0x0fc3, B:268:0x10ef, B:270:0x10f6, B:271:0x10f7, B:273:0x10f9, B:275:0x1100, B:276:0x1101, B:249:0x1028, B:251:0x102e, B:252:0x1058, B:220:0x0e18, B:222:0x0e2d, B:223:0x0ea3, B:215:0x0dcd, B:217:0x0de2, B:218:0x0e11, B:254:0x1060), top: B:782:0x0cfa, outer: #26, inners: #2, #7, #11, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0fd3 A[Catch: all -> 0x1102, TryCatch #20 {all -> 0x1102, blocks: (B:204:0x0cfa, B:206:0x0d00, B:207:0x0d4b, B:209:0x0d58, B:211:0x0d61, B:212:0x0da2, B:235:0x0fc9, B:236:0x0fcd, B:238:0x0fd3, B:241:0x0feb, B:244:0x0ff8, B:246:0x0ffb, B:258:0x10dc, B:260:0x10e2, B:261:0x10e3, B:263:0x10e5, B:265:0x10ec, B:266:0x10ed, B:213:0x0dad, B:225:0x0eaf, B:227:0x0eb5, B:228:0x0ef8, B:230:0x0f22, B:231:0x0f69, B:233:0x0f7f, B:234:0x0fc3, B:268:0x10ef, B:270:0x10f6, B:271:0x10f7, B:273:0x10f9, B:275:0x1100, B:276:0x1101, B:249:0x1028, B:251:0x102e, B:252:0x1058, B:220:0x0e18, B:222:0x0e2d, B:223:0x0ea3, B:215:0x0dcd, B:217:0x0de2, B:218:0x0e11, B:254:0x1060), top: B:782:0x0cfa, outer: #26, inners: #2, #7, #11, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1265 A[Catch: all -> 0x16d9, TryCatch #39 {all -> 0x16d9, blocks: (B:290:0x125f, B:292:0x1265, B:293:0x12a9, B:299:0x12c5, B:301:0x12cb, B:302:0x1311, B:329:0x1593, B:330:0x1597, B:332:0x159d, B:335:0x15b4, B:338:0x15c1, B:340:0x15c4, B:352:0x16b3, B:354:0x16b9, B:355:0x16ba, B:357:0x16bc, B:359:0x16c3, B:360:0x16c4, B:303:0x1320, B:305:0x1329, B:306:0x136d, B:307:0x1378, B:319:0x147a, B:321:0x1480, B:322:0x14c5, B:324:0x14ef, B:325:0x1532, B:327:0x1548, B:328:0x158d, B:362:0x16c6, B:364:0x16cd, B:365:0x16ce, B:367:0x16d0, B:369:0x16d7, B:370:0x16d8, B:348:0x1632, B:343:0x15f0, B:345:0x15f6, B:346:0x1620, B:314:0x13e9, B:316:0x1405, B:317:0x146e, B:309:0x1398, B:311:0x13ad, B:312:0x13e2), top: B:817:0x125f, outer: #26, inners: #9, #15, #23, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x12b6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x1378 A[Catch: all -> 0x16d9, TRY_LEAVE, TryCatch #39 {all -> 0x16d9, blocks: (B:290:0x125f, B:292:0x1265, B:293:0x12a9, B:299:0x12c5, B:301:0x12cb, B:302:0x1311, B:329:0x1593, B:330:0x1597, B:332:0x159d, B:335:0x15b4, B:338:0x15c1, B:340:0x15c4, B:352:0x16b3, B:354:0x16b9, B:355:0x16ba, B:357:0x16bc, B:359:0x16c3, B:360:0x16c4, B:303:0x1320, B:305:0x1329, B:306:0x136d, B:307:0x1378, B:319:0x147a, B:321:0x1480, B:322:0x14c5, B:324:0x14ef, B:325:0x1532, B:327:0x1548, B:328:0x158d, B:362:0x16c6, B:364:0x16cd, B:365:0x16ce, B:367:0x16d0, B:369:0x16d7, B:370:0x16d8, B:348:0x1632, B:343:0x15f0, B:345:0x15f6, B:346:0x1620, B:314:0x13e9, B:316:0x1405, B:317:0x146e, B:309:0x1398, B:311:0x13ad, B:312:0x13e2), top: B:817:0x125f, outer: #26, inners: #9, #15, #23, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x159d A[Catch: all -> 0x16d9, TryCatch #39 {all -> 0x16d9, blocks: (B:290:0x125f, B:292:0x1265, B:293:0x12a9, B:299:0x12c5, B:301:0x12cb, B:302:0x1311, B:329:0x1593, B:330:0x1597, B:332:0x159d, B:335:0x15b4, B:338:0x15c1, B:340:0x15c4, B:352:0x16b3, B:354:0x16b9, B:355:0x16ba, B:357:0x16bc, B:359:0x16c3, B:360:0x16c4, B:303:0x1320, B:305:0x1329, B:306:0x136d, B:307:0x1378, B:319:0x147a, B:321:0x1480, B:322:0x14c5, B:324:0x14ef, B:325:0x1532, B:327:0x1548, B:328:0x158d, B:362:0x16c6, B:364:0x16cd, B:365:0x16ce, B:367:0x16d0, B:369:0x16d7, B:370:0x16d8, B:348:0x1632, B:343:0x15f0, B:345:0x15f6, B:346:0x1620, B:314:0x13e9, B:316:0x1405, B:317:0x146e, B:309:0x1398, B:311:0x13ad, B:312:0x13e2), top: B:817:0x125f, outer: #26, inners: #9, #15, #23, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x183f A[Catch: all -> 0x1ba2, TryCatch #1 {all -> 0x1ba2, blocks: (B:384:0x1839, B:386:0x183f, B:387:0x1884, B:391:0x189e, B:393:0x18a4, B:394:0x18ea, B:413:0x1a99, B:421:0x1b02, B:427:0x1b86, B:429:0x1b8c, B:430:0x1b8d, B:432:0x1b8f, B:434:0x1b96, B:435:0x1b97, B:396:0x18f6, B:403:0x197f, B:405:0x1985, B:406:0x19cf, B:408:0x19f9, B:409:0x1a39, B:411:0x1a4f, B:412:0x1a91, B:437:0x1b99, B:439:0x1ba0, B:440:0x1ba1, B:423:0x1b08, B:417:0x1aca, B:419:0x1ad0, B:420:0x1afb, B:398:0x1916, B:400:0x1928, B:401:0x1973), top: B:747:0x1839, outer: #26, inners: #22, #32, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x1891  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x18f6 A[Catch: all -> 0x1ba2, TRY_LEAVE, TryCatch #1 {all -> 0x1ba2, blocks: (B:384:0x1839, B:386:0x183f, B:387:0x1884, B:391:0x189e, B:393:0x18a4, B:394:0x18ea, B:413:0x1a99, B:421:0x1b02, B:427:0x1b86, B:429:0x1b8c, B:430:0x1b8d, B:432:0x1b8f, B:434:0x1b96, B:435:0x1b97, B:396:0x18f6, B:403:0x197f, B:405:0x1985, B:406:0x19cf, B:408:0x19f9, B:409:0x1a39, B:411:0x1a4f, B:412:0x1a91, B:437:0x1b99, B:439:0x1ba0, B:440:0x1ba1, B:423:0x1b08, B:417:0x1aca, B:419:0x1ad0, B:420:0x1afb, B:398:0x1916, B:400:0x1928, B:401:0x1973), top: B:747:0x1839, outer: #26, inners: #22, #32, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x1aab  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1ce5  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1d32  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x1e13  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1fb1  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x2941  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x2977 A[Catch: all -> 0x2a30, TryCatch #8 {all -> 0x2a30, blocks: (B:579:0x2971, B:581:0x2977, B:582:0x29a6), top: B:760:0x2971, outer: #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x2b74  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2bc4  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x2c26  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x2de7  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x2ec2  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x2f10  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x2f63  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x3130  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x33a1  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x06b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x063d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:860:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0688 A[Catch: all -> 0x0b7d, PHI: r3
  0x0688: PHI (r3v692 java.lang.Object) = (r3v688 java.lang.Object), (r3v691 java.lang.Object) binds: [B:87:0x063b, B:88:0x063d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x0b7d, blocks: (B:86:0x0637, B:92:0x0688), top: B:776:0x0637 }] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.airtime.ui.activity.AirtimeTopUpActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$Ga1eI3GTZ4QmitgAa3NpOfGFxAI(AirtimeTopUpActivity airtimeTopUpActivity, View view) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m11095instrumented$0$initView$V(airtimeTopUpActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component2 + 15;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m11094$r8$lambda$J2Dz1NlZS27no7SZD8jzhSHHFI(AirtimeTopUpActivity airtimeTopUpActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        initTab$lambda$1(airtimeTopUpActivity, tab, i);
        int i5 = component1 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        equals = 1;
        component1();
        int i = component4 + 89;
        equals = i % 128;
        int i2 = i % 2;
    }

    private static void m11095instrumented$0$initView$V(AirtimeTopUpActivity airtimeTopUpActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$0(airtimeTopUpActivity, view);
                Callback.onClick_exit();
                int i4 = 29 / 0;
            } else {
                initView$lambda$0(airtimeTopUpActivity, view);
                Callback.onClick_exit();
            }
            int i5 = component1 + 93;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean needSoftFix() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override
    public boolean shouldApplyTopInset() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        copydefault = new char[]{1976, 2022, 1967, 2023, 2031, 2041, 1983, 2018, 2032, 2020, 2038, 1972, 1982, 2034, 2017, 1978, 2021, 1971, 2025, 1966, 1973, 2037, 2036, 1975, 1968, 2000, 2002, 2029, 1970, 1965, 1969, 1980, 1977, 2003, 2035, 1963, 2026, 2028, 1981, 1962, 1960, 1985, 2024, 2030, 1974, 1961, 2005, 2033, 2019};
        component3 = (char) 12829;
        ShareDataUIState = new char[]{33504, 33443, 33442, 33370, 33368, 33447, 33375, 33359, 33367, 33366, 33366, 33367, 33370, 33459, 33422, 33462, 33365, 33373, 33470, 33468, 33375, 33369, 33365, 33370, 33372, 33374, 33510, 33454, 33368, 33346, 33366, 33454, 33368, 33365, 33453, 33366, 33407, 33369, 33370, 33367, 33452, 33450, 33453, 33367, 33366, 33367, 33370, 33456, 33454, 33368, 33369, 33455, 33366, 33367, 33453, 33364, 33366, 33368, 33346, 33344, 33405, 33406, 33344, 33371, 33459, 33458, 33454, 33365, 33345, 33368, 33454, 33457, 33457, 33455, 33475, 33425, 33425, 33513, 33512, 33511, 33516, 33515, 33514, 33429, 33429, 33515, 33426, 33425, 33514, 33519, 33519, 33430, 33470, 33468, 33425, 33514, 33515, 33514, 33515, 33427, 33430, 33428, 33424, 33425, 33429, 33516, 33515, 33516, 33514, 33427, 33468, 33467, 33425, 33516, 33517, 33428, 33468, 33467, 33427, 33514, 33516, 33515, 33512, 33512, 33514, 33427, 33426, 33515, 33428, 33428, 33516, 33427, 33428, 33516, 33427, 33430, 33519, 33429, 33468, 33310, 33378, 33311, 33376, 33377, 33515, 33464, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33449, 33457, 33457, 33454, 33462, 33467, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33439, 33465, 33449, 33452, 33459, 33462, 33415, 33416, 33458, 33462, 33464, 33424, 33385, 33299, 33386, 33345, 33347, 33386, 33296, 33387, 33388, 33300, 33386, 33407, 33384, 33299, 33386, 33385, 33387, 33346, 33346, 33346, 33385, 33387, 33348, 33349, 33346, 33344, 33345, 33406, 33406, 33345, 33344, 33345, 33348, 33387, 33387, 33350, 33389, 33389, 33345, 33385, 33388, 33348, 33347, 33345, 33344, 33345, 33346, 33386, 33298, 33298, 33385, 33344, 33407, 33346, 33388, 33298, 33385, 33387, 33388, 33388, 33299, 33384, 33406};
    }
}
