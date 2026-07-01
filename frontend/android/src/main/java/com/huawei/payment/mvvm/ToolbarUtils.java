package com.huawei.payment.mvvm;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.blankj.utilcode.util.BarUtils;
import com.dynatrace.android.callback.Callback;
import com.google.mlkit.common.MlKitException;
import com.huawei.digitalpayment.consumer.base.http.HaProxyConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.ITrustedWebActivityService_Parcel;
import okhttp3.internal.connection.RouteDatabase;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.math.Primes;

public class ToolbarUtils {
    private static final String ShareDataUIState = "tag_toolbar";
    private static final String component2 = "TAG_STATUS_BAR";

    public static void initToolbar(FragmentActivity fragmentActivity, String str) {
        initToolbar(fragmentActivity, str, R.layout.common_toolbar);
    }

    public static void initToolbar(final FragmentActivity fragmentActivity, String str, int i) {
        ViewGroup viewGroup = (ViewGroup) fragmentActivity.findViewById(android.R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag(component2);
        int statusBarHeight = viewFindViewWithTag != null ? BarUtils.getStatusBarHeight() : 0;
        View viewFindViewWithTag2 = viewGroup.findViewWithTag(ShareDataUIState);
        if (viewFindViewWithTag2 == null) {
            viewFindViewWithTag2 = LayoutInflater.from(fragmentActivity).inflate(i, viewGroup, false);
            viewFindViewWithTag2.setTag(ShareDataUIState);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewWithTag2.getLayoutParams();
            marginLayoutParams.topMargin += statusBarHeight;
            viewFindViewWithTag2.setLayoutParams(marginLayoutParams);
            viewFindViewWithTag2.findViewById(R.id.ivBack).setOnClickListener(new View.OnClickListener() {
                private static final byte[] $$a = {10, 80, 9, 70};
                private static final int $$b = 65;
                private static int $10 = 0;
                private static int $11 = 1;
                private static int component3 = 0;
                private static int component2 = 1;
                private static int copydefault = -890926345;
                private static char[] component1 = {33513, 33465, 33463, 33459, 33465, 33463, 33460, 33458, 33470, 33439, 33519, 33517, 33433, 33436, 33520, 33519, 33517, 33417, 33420, 33428, 33457, 33451, 33460, 33432, 33420, 33449, 33457, 33458, 33452, 33459, 33467, 33459, 33423, 33420, 33459, 33460, 33460, 33466, 33516, 33457, 33460, 33468, 33419, 33517, 33437, 33465, 33459, 33455, 33460, 33462, 33416, 33504, 33434, 33431, 33512, 33431, 33465, 33459, 33455, 33460, 33462, 33416, 33504, 33433, 33506, 33504, 33419, 33430, 33439, 33516, 33467, 33464, 33464, 33416, 33414, 33465, 33467, 33465, 33464, 33469, 33415, 33469, 33459, 33465, 33459, 33460, 33516, 33465, 33459, 33469, 33415, 33469, 33464, 33465, 33467, 33465, 33414, 33416, 33464, 33462, 33438, 33367, 33365, 33363, 33358, 33362, 33368, 33461, 33462, 33365, 33360, 33357, 33362, 33365, 33357, 33453, 33455, 33360, 33457, 33471, 33446, 33372, 33367, 33368, 33370, 33368, 33445, 33447, 33367, 33367, 33370, 33368, 33363, 33351, 33782, 33785, 33777, 33745, 33747, 33780, 33749, 33315, 33738, 33728, 33787, 33788, 33790, 33788, 33739, 33735, 33784, 33784, 33786, 33787, 33785, 33783, 33778, 33782, 33788, 33753, 33754, 33785, 33780, 33353, 33780, 33776, 33777, 33774, 33765, 33768, 33789, 33786, 33772, 33778, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33431, 33462, 33457, 33454, 33459, 33462, 33454, 33422, 33424, 33457, 33426, 33439, 33409, 33463, 33461, 33464, 33461, 33451, 33452, 33460, 33455, 33335, 33337, 33281, 33341, 33340, 33340, 33333, 33328, 33336, 33295, 33295, 33335, 33337, 33338, 33336, 33338, 33338, 33341};

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static java.lang.String $$c(short r5, byte r6, byte r7) {
                    /*
                        int r6 = r6 * 4
                        int r6 = r6 + 4
                        byte[] r0 = com.huawei.payment.mvvm.ToolbarUtils$$ExternalSyntheticLambda0.$$a
                        int r7 = r7 * 2
                        int r7 = r7 + 1
                        int r5 = r5 + 65
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r4 = r7
                        r3 = r2
                        goto L24
                    L14:
                        r3 = r2
                    L15:
                        byte r4 = (byte) r5
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r7) goto L22
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        return r5
                    L22:
                        r4 = r0[r6]
                    L24:
                        int r6 = r6 + 1
                        int r5 = r5 + r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.mvvm.ToolbarUtils$$ExternalSyntheticLambda0.$$c(short, byte, byte):java.lang.String");
                }

                @Override
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 117;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0) {
                        ToolbarUtils.copydefault(fragmentActivity, view);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ToolbarUtils.copydefault(fragmentActivity, view);
                    int i4 = component3 + 61;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }

                private static void a(int i2, int i3, char[] cArr, int i4, boolean z, Object[] objArr) throws Throwable {
                    int i5 = 2 % 2;
                    ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
                    char[] cArr2 = new char[i2];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                    while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                        int i6 = $10 + 25;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                        cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i4 + iTrustedWebActivityServiceStub.component3);
                        int i8 = iTrustedWebActivityServiceStub.ShareDataUIState;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(copydefault)};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                            if (objCopydefault == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 3784, 39 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (26860 - View.combineMeasuredStates(0, 0)), 2015799920, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                            if (objCopydefault2 == null) {
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
                    if (i3 > 0) {
                        int i9 = $10 + 65;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        iTrustedWebActivityServiceStub.component1 = i3;
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr2, 0, cArr3, 0, i2);
                        System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
                        System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
                    }
                    if (z) {
                        int i11 = $10 + 73;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        char[] cArr4 = new char[i2];
                        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                            int i13 = $11 + 19;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(iTrustedWebActivityServiceStub.ShareDataUIState * i2) - 1];
                                try {
                                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                                    if (objCopydefault3 == null) {
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 16 - KeyEvent.normalizeMetaState(0), (char) View.combineMeasuredStates(0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault3).invoke(null, objArr4);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                                try {
                                    Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                                    if (objCopydefault4 == null) {
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 16, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault4).invoke(null, objArr5);
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                        }
                        cArr2 = cArr4;
                    }
                    objArr[0] = new String(cArr2);
                }

                private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                    int i2;
                    int i3 = 2;
                    int i4 = 2 % 2;
                    ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int i7 = iArr[2];
                    int i8 = iArr[3];
                    char[] cArr = component1;
                    float f = 0.0f;
                    Object obj = null;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $10 + 29;
                            $11 = i10 % 128;
                            if (i10 % i3 == 0) {
                                try {
                                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                                    if (objCopydefault == null) {
                                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 14 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 65117), 1951305196, false, "l", new Class[]{Integer.TYPE});
                                    }
                                    cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                                    i9--;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                                if (objCopydefault2 == null) {
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(658 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, (char) (65118 - View.MeasureSpec.getMode(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                                }
                                cArr2[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                                i9++;
                            }
                            i3 = 2;
                            f = 0.0f;
                        }
                        cArr = cArr2;
                    }
                    char[] cArr3 = new char[i6];
                    System.arraycopy(cArr, i5, cArr3, 0, i6);
                    if (bArr != null) {
                        char[] cArr4 = new char[i6];
                        iTrustedWebActivityService_Parcel.copydefault = 0;
                        char c2 = 0;
                        while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                            if (bArr[iTrustedWebActivityService_Parcel.copydefault] != 1) {
                                int i11 = iTrustedWebActivityService_Parcel.copydefault;
                                Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                                if (objCopydefault3 == null) {
                                    byte b2 = (byte) 0;
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3581 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 28, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1180380354, false, $$c((byte) 50, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                            } else {
                                int i12 = $10 + 39;
                                $11 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                    if (objCopydefault4 == null) {
                                        byte b3 = (byte) 0;
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.getSize(0) + 36, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27896), -1464227204, false, $$c((byte) 45, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[i13] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                                    obj.hashCode();
                                    throw null;
                                }
                                int i14 = iTrustedWebActivityService_Parcel.copydefault;
                                try {
                                    Object[] objArr6 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                    if (objCopydefault5 == null) {
                                        byte b4 = (byte) 0;
                                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 4502, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, (char) (View.combineMeasuredStates(0, 0) + 27897), -1464227204, false, $$c((byte) 45, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[i14] = ((Character) ((Method) objCopydefault5).invoke(null, objArr6)).charValue();
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                            Object[] objArr7 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                            if (objCopydefault6 == null) {
                                byte b5 = (byte) 0;
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1859 - Color.alpha(0), 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 80302927, false, $$c((byte) 49, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault6).invoke(null, objArr7);
                        }
                        int i15 = $10 + 111;
                        $11 = i15 % 128;
                        i2 = 2;
                        int i16 = i15 % 2;
                        cArr3 = cArr4;
                    } else {
                        i2 = 2;
                    }
                    if (i8 > 0) {
                        int i17 = $11 + 125;
                        $10 = i17 % 128;
                        int i18 = i17 % i2;
                        char[] cArr5 = new char[i6];
                        System.arraycopy(cArr3, 0, cArr5, 0, i6);
                        int i19 = i6 - i8;
                        System.arraycopy(cArr5, 0, cArr3, i19, i8);
                        System.arraycopy(cArr5, i8, cArr3, 0, i19);
                    }
                    if (!(!z)) {
                        char[] cArr6 = new char[i6];
                        iTrustedWebActivityService_Parcel.copydefault = 0;
                        while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                            cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                            iTrustedWebActivityService_Parcel.copydefault++;
                        }
                        cArr3 = cArr6;
                    }
                    if (i7 > 0) {
                        iTrustedWebActivityService_Parcel.copydefault = 0;
                        while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                            cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                            iTrustedWebActivityService_Parcel.copydefault++;
                        }
                    }
                    objArr[0] = new String(cArr3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Class[]] */
                /* JADX WARN: Type inference failed for: r6v69, types: [java.lang.Class] */
                /* JADX WARN: Type inference failed for: r8v0 */
                /* JADX WARN: Type inference failed for: r8v1 */
                /* JADX WARN: Type inference failed for: r8v116, types: [java.lang.Class<java.io.InputStream>] */
                /* JADX WARN: Type inference failed for: r8v132 */
                /* JADX WARN: Type inference failed for: r8v20 */
                /* JADX WARN: Type inference failed for: r8v37 */
                /* JADX WARN: Type inference failed for: r8v48 */
                /* JADX WARN: Type inference failed for: r8v5, types: [int] */
                /* JADX WARN: Type inference failed for: r8v56 */
                /* JADX WARN: Type inference failed for: r8v58, types: [int] */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX WARN: Type inference failed for: r8v87 */
                /* JADX WARN: Type inference failed for: r8v89, types: [char[]] */
                public static Object[] component2(Context context, int i2, int i3) {
                    ?? threadPriority;
                    int iMakeMeasureSpec;
                    int i4;
                    int i5;
                    int iResolveSize;
                    int i6;
                    Constructor<?> declaredConstructor;
                    int i7;
                    int i8;
                    int i9;
                    int iComponent2;
                    int i10;
                    int i11;
                    int keyRepeatTimeout;
                    int i12;
                    Object[] objArr;
                    int length;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    char[] cArr;
                    int iResolveOpacity;
                    int i18;
                    char[] cArr2;
                    int iIndexOf;
                    int iGreen;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    Object obj;
                    int i23 = 2 % 2;
                    if (context != null) {
                        int i24 = component3;
                        int i25 = (i24 ^ 115) + ((i24 & 115) << 1);
                        threadPriority = i25 % 128;
                        component2 = threadPriority;
                        try {
                            if (i25 % 2 == 0) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1, 0);
                                i4 = 15;
                            } else {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                i4 = 31;
                            }
                            int i26 = (-55) * iMakeMeasureSpec;
                            int i27 = -(-(i4 * (-55)));
                            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                            int i29 = ~(iMakeMeasureSpec | i2);
                            int i30 = ((i29 & i4) | (i4 ^ i29)) * 56;
                            int i31 = (i28 ^ i30) + ((i30 & i28) << 1) + ((~((iMakeMeasureSpec ^ i4) | (iMakeMeasureSpec & i4))) * (-56));
                            int i32 = component3;
                            int i33 = (i32 & 89) + (i32 | 89);
                            component2 = i33 % 128;
                            int i34 = i33 % 2;
                            int i35 = ~i2;
                            if (i34 == 0) {
                                int i36 = ~((i4 & i35) | (i35 ^ i4));
                                int i37 = -((iMakeMeasureSpec & i36) | (iMakeMeasureSpec ^ i36));
                                int i38 = -(-((i37 ^ 56) + ((i37 & 56) << 1)));
                                i5 = (i31 & i38) + (i38 | i31);
                                iResolveSize = View.resolveSize(0, 0);
                                i6 = 118;
                            } else {
                                int i39 = ~(i4 | i35);
                                int i40 = -(-(((iMakeMeasureSpec & i39) | (iMakeMeasureSpec ^ i39)) * 56));
                                i5 = (i31 ^ i40) + ((i40 & i31) << 1);
                                iResolveSize = View.resolveSize(0, 0);
                                i6 = 22;
                            }
                            int i41 = ((iResolveSize * (-464)) - (~(i6 * (-929)))) - 1;
                            int i42 = ~iResolveSize;
                            int i43 = (i6 ^ i2) | (i6 & i2);
                            int i44 = ~i43;
                            int i45 = ((i44 & i42) | (i42 ^ i44)) * (-465);
                            int i46 = (i41 ^ i45) + ((i41 & i45) << 1);
                            int i47 = component3;
                            int i48 = ((i47 | 91) << 1) - (i47 ^ 91);
                            int i49 = i48 % 128;
                            component2 = i49;
                            int i50 = i48 % 2;
                            int i51 = ~((i42 ^ i2) | (i42 & i2));
                            int i52 = -(-(930 * ((i6 ^ i51) | (i6 & i51))));
                            int i53 = (i46 & i52) + (i52 | i46);
                            int i54 = ((i49 | 29) << 1) - (i49 ^ 29);
                            component3 = i54 % 128;
                            int i55 = i54 % 2;
                            int i56 = -(-(465 * ((i42 & i43) | (i43 ^ i42))));
                            int i57 = ((i53 | i56) << 1) - (i56 ^ i53);
                            char[] cArr3 = {15, 65483, 65519, 16, CharUtils.CR, ' ', 18, 65495, 65530, 65512, 65516, 25, 15, 29, JSONLexer.EOI, 20, 15, 65495, 65518, 65512, 0, 65534, 65518, 65529, 65512, 65516, 25, 15, 29, JSONLexer.EOI, 20};
                            int i58 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                            int i59 = ((i58 | 195) << 1) - (i58 ^ 195);
                            Object[] objArr2 = new Object[1];
                            a(i5, i57, cArr3, i59, false, objArr2);
                            try {
                                try {
                                    Object[] objArr3 = {(String) objArr2[0]};
                                    Object[] objArr4 = new Object[1];
                                    b(new int[]{0, 38, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, objArr4);
                                    Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                                    int i60 = ~i2;
                                    int i61 = ~i2;
                                    Object[] objArr5 = new Object[1];
                                    b(new int[]{38, 31, 0, 0}, true, new byte[]{1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0}, objArr5);
                                    try {
                                        Object[] objArr6 = {(String) objArr5[0]};
                                        Object[] objArr7 = new Object[1];
                                        b(new int[]{0, 38, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, objArr7);
                                        Class<?> cls = Class.forName((String) objArr7[0]);
                                        Class<?>[] clsArr = new Class[1];
                                        int i62 = component3 + 73;
                                        component2 = i62 % 128;
                                        if (i62 % 2 == 0) {
                                            clsArr[1] = String.class;
                                            declaredConstructor = cls.getDeclaredConstructor(clsArr);
                                        } else {
                                            clsArr[0] = String.class;
                                            declaredConstructor = cls.getDeclaredConstructor(clsArr);
                                        }
                                        Object objNewInstance2 = declaredConstructor.newInstance(objArr6);
                                        try {
                                            int i63 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int iComponent22 = RouteDatabase.component2();
                                            int i64 = i63 * 477;
                                            int i65 = ((i64 | (-10925)) << 1) - (i64 ^ (-10925));
                                            int i66 = component3 + 47;
                                            int i67 = i66 % 128;
                                            component2 = i67;
                                            if (i66 % 2 == 0) {
                                                int i68 = ~i63;
                                                i7 = ~((i68 ^ 23) | (i68 & 23));
                                                i8 = ((-24) ^ i63) | ((-24) & i63) | iComponent22;
                                                int i69 = 54 / 0;
                                            } else {
                                                int i70 = ~i63;
                                                i7 = ~((i70 ^ 23) | (i70 & 23));
                                                int i71 = ((-24) ^ i63) | ((-24) & i63);
                                                i8 = (i71 ^ iComponent22) | (i71 & iComponent22);
                                            }
                                            int i72 = ~i8;
                                            int i73 = -(-((-476) * ((i7 ^ i72) | (i72 & i7))));
                                            int i74 = (i65 ^ i73) + ((i73 & i65) << 1);
                                            int i75 = ((-24) ^ i63) | ((-24) & i63);
                                            int i76 = ((i67 | 41) << 1) - (i67 ^ 41);
                                            component3 = i76 % 128;
                                            int i77 = i76 % 2;
                                            int i78 = i74 + (952 * (~((i75 ^ iComponent22) | (i75 & iComponent22))));
                                            int i79 = ~iComponent22;
                                            int i80 = (i79 & (-24)) | ((-24) ^ i79);
                                            threadPriority = 5;
                                            int i81 = (i67 & 5) + (i67 | 5);
                                            component3 = i81 % 128;
                                            int i82 = i81 % 2;
                                            int i83 = 476 * (~((i80 & i63) | (i80 ^ i63)));
                                            int i84 = ((i78 | i83) << 1) - (i83 ^ i78);
                                            int i85 = 2 - (~View.getDefaultSize(0, 0));
                                            char[] cArr4 = {65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', CharUtils.CR};
                                            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                            Object[] objArr8 = new Object[1];
                                            a(i84, i85, cArr4, (doubleTapTimeout & Primes.SMALL_FACTOR_LIMIT) + (doubleTapTimeout | Primes.SMALL_FACTOR_LIMIT), true, objArr8);
                                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                                            Object[] objArr9 = new Object[1];
                                            b(new int[]{69, 17, 0, 15}, true, new byte[]{1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1}, objArr9);
                                            String str2 = (String) objArr9[0];
                                            int i86 = component2;
                                            int i87 = (i86 & 115) + (i86 | 115);
                                            component3 = i87 % 128;
                                            if (i87 % 2 == 0) {
                                                Object objInvoke = cls2.getMethod(str2, null).invoke(context, null);
                                                int i88 = component3 + 57;
                                                component2 = i88 % 128;
                                                try {
                                                    if (i88 % 2 == 0) {
                                                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                                                        i9 = -(((jumpTapTimeout | 19) << 1) - (jumpTapTimeout ^ 19));
                                                        iComponent2 = RouteDatabase.component2();
                                                        i10 = 82;
                                                    } else {
                                                        i9 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        iComponent2 = RouteDatabase.component2();
                                                        i10 = 23;
                                                    }
                                                    int i89 = 306 * i9;
                                                    int i90 = (610 ^ i89) + ((i89 & TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) + (i10 * 306);
                                                    int i91 = ~(i9 | i10);
                                                    int i92 = ~((i9 ^ iComponent2) | (i9 & iComponent2));
                                                    int i93 = component3 + 37;
                                                    component2 = i93 % 128;
                                                    if (i93 % 2 == 0) {
                                                        int i94 = ~i10;
                                                        int i95 = ~iComponent2;
                                                        int i96 = ~((i9 & i95) | (i95 ^ i9));
                                                        int i97 = (i96 & i94) | (i94 ^ i96);
                                                        i11 = (i90 >> (((i91 ^ i92) | (i91 & i92)) + 305)) << ((i97 & 305) + (i97 | 305));
                                                        keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
                                                        i12 = 2;
                                                    } else {
                                                        int i98 = (i90 - (~(-(-((i91 | i92) * 305))))) - 1;
                                                        int i99 = ~i10;
                                                        int i100 = ~(i9 | (~iComponent2));
                                                        int i101 = -(-(((i100 & i99) | (i99 ^ i100)) * 305));
                                                        i11 = ((i98 | i101) << 1) - (i98 ^ i101);
                                                        keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
                                                        i12 = 3;
                                                    }
                                                    int i102 = i11;
                                                    int i103 = (i12 - (~(-(-(keyRepeatTimeout >> 16))))) - 1;
                                                    char[] cArr5 = {65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', CharUtils.CR};
                                                    int iRgb = Color.rgb(0, 0, 0);
                                                    int i104 = (iRgb * (-501)) - 150888811;
                                                    int i105 = ~((-16777428) | i2);
                                                    int i106 = ~(16777427 | iRgb);
                                                    int i107 = ((i105 & i106) | (i105 ^ i106)) * (-502);
                                                    int i108 = (i104 ^ i107) + ((i104 & i107) << 1);
                                                    int i109 = ((-16777428) ^ i61) | ((-16777428) & i61);
                                                    int i110 = (~((i109 & iRgb) | (i109 ^ iRgb))) * (-502);
                                                    int i111 = component3 + 107;
                                                    component2 = i111 % 128;
                                                    int i112 = i111 % 2;
                                                    int i113 = ~iRgb;
                                                    int i114 = ~((i113 & i2) | (i113 ^ i2));
                                                    int i115 = ((((i108 | i110) << 1) - (i110 ^ i108)) - (~((((-16777428) & i114) | ((-16777428) ^ i114)) * 502))) - 1;
                                                    Object[] objArr10 = new Object[1];
                                                    a(i102, i103, cArr5, i115, true, objArr10);
                                                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                                                    threadPriority = 14;
                                                    Object[] objArr11 = new Object[1];
                                                    b(new int[]{86, 14, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0}, objArr11);
                                                    try {
                                                        Object[] objArr12 = {cls3.getMethod((String) objArr11[0], null).invoke(context, null), 64};
                                                        Object[] objArr13 = new Object[1];
                                                        b(new int[]{100, 33, 33, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1}, objArr13);
                                                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                                                        int i116 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        int iComponent23 = RouteDatabase.component2();
                                                        int i117 = i116 * (-167);
                                                        int i118 = (i117 ^ (-2338)) + ((i117 & (-2338)) << 1);
                                                        int i119 = ~i116;
                                                        int i120 = ~((i119 ^ (-15)) | (i119 & (-15)));
                                                        int i121 = ~iComponent23;
                                                        int i122 = ~(((-15) ^ i121) | ((-15) & i121));
                                                        int i123 = (i118 - (~(((i120 ^ i122) | (i122 & i120)) * 168))) - 1;
                                                        int i124 = ~i116;
                                                        int i125 = (i123 - (~(-(-((~(((i124 ^ (-15)) | (i124 & (-15))) | iComponent23)) * 168))))) - 1;
                                                        int i126 = ~(i119 | (~iComponent23));
                                                        int i127 = ~((i124 & 14) | (i124 ^ 14));
                                                        int i128 = (i127 & i126) | (i126 ^ i127);
                                                        int i129 = ~((i116 & (-15)) | ((-15) ^ i116) | iComponent23);
                                                        int i130 = i125 + (((i128 & i129) | (i128 ^ i129)) * 168);
                                                        int i131 = -TextUtils.indexOf((CharSequence) "", '0');
                                                        int i132 = (i131 * (-755)) - 9815;
                                                        int i133 = ~i131;
                                                        int i134 = (~((i133 & (-14)) | (i133 ^ (-14)))) * 1512;
                                                        int i135 = (i132 ^ i134) + ((i132 & i134) << 1);
                                                        int i136 = ~i131;
                                                        int i137 = ~((i136 & (-14)) | (i136 ^ (-14)));
                                                        int i138 = (i131 & 13) | (i131 ^ 13);
                                                        int i139 = ~((i138 ^ i2) | (i138 & i2));
                                                        int i140 = -(-(((i137 & i139) | (i137 ^ i139)) * (-756)));
                                                        int i141 = (i135 ^ i140) + ((i140 & i135) << 1) + (((i138 & i60) | (i138 ^ i60)) * 756);
                                                        char[] cArr6 = {3, 1, 16, 65516, 65533, 65535, 7, 65533, 3, 1, 65509, '\n', 2, 11};
                                                        int i142 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        int iComponent24 = RouteDatabase.component2();
                                                        int i143 = i142 * 85;
                                                        int i144 = ((i143 | 17765) << 1) - (i143 ^ 17765);
                                                        int i145 = ~i142;
                                                        int i146 = ~((i145 ^ (-210)) | (i145 & (-210)));
                                                        int i147 = ~iComponent24;
                                                        int i148 = ~(i145 | i147);
                                                        int i149 = (i146 ^ i148) | (i148 & i146);
                                                        int i150 = ~iComponent24;
                                                        int i151 = ~((-210) | i150);
                                                        int i152 = (i149 ^ i151) | (i151 & i149);
                                                        Object obj2 = objNewInstance2;
                                                        int i153 = (i142 & 209) | (i142 ^ 209);
                                                        int i154 = ~(i153 | iComponent24);
                                                        int i155 = (i144 - (~(((i152 ^ i154) | (i152 & i154)) * (-84)))) - 1;
                                                        int i156 = ~(((-210) & iComponent24) | ((-210) ^ iComponent24));
                                                        int i157 = (i156 & i142) | (i142 ^ i156);
                                                        int i158 = ~((i150 ^ 209) | (i150 & 209));
                                                        int i159 = -(-(((i157 & i158) | (i157 ^ i158)) * (-84)));
                                                        int i160 = (i155 ^ i159) + ((i159 & i155) << 1);
                                                        int i161 = ~((i147 ^ 209) | (i147 & 209));
                                                        int i162 = ~i153;
                                                        int i163 = ((i161 & i162) | (i161 ^ i162)) * 84;
                                                        int i164 = ((i160 | i163) << 1) - (i163 ^ i160);
                                                        try {
                                                            Object[] objArr14 = new Object[1];
                                                            a(i130, i141, cArr6, i164, false, objArr14);
                                                            Object objInvoke2 = cls4.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                                            try {
                                                                Object[] objArr15 = new Object[1];
                                                                b(new int[]{133, 30, WSContextConstant.HANDSHAKE_SEND_SIZE, 19}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1}, objArr15);
                                                                Class<?> cls5 = Class.forName((String) objArr15[0]);
                                                                int i165 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                int i166 = ((i165 | 10) << 1) - (i165 ^ 10);
                                                                int i167 = -View.getDefaultSize(0, 0);
                                                                int i168 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                Object[] objArr16 = new Object[1];
                                                                a(i166, (i167 ^ 9) + ((i167 & 9) << 1), new char[]{65532, 65530, 1, 65524, 7, '\b', 5, 65528, 6, 6}, (i168 & 219) + (i168 | 219), false, objArr16);
                                                                objArr = (Object[]) cls5.getField((String) objArr16[0]).get(objInvoke2);
                                                                length = objArr.length;
                                                                i13 = 0;
                                                            } catch (Throwable unused) {
                                                            }
                                                            while (i13 < length) {
                                                                Object obj3 = objArr[i13];
                                                                int i169 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                int i170 = (i169 & 4) + (i169 | 4);
                                                                int i171 = -TextUtils.indexOf("", "", 0, 0);
                                                                int iComponent25 = RouteDatabase.component2();
                                                                int i172 = i171 * 284;
                                                                int i173 = ((i172 | (-1410)) << 1) - (i172 ^ (-1410));
                                                                int i174 = component3;
                                                                int i175 = (i174 ^ 113) + ((i174 & 113) << 1);
                                                                component2 = i175 % 128;
                                                                int i176 = i175 % 2;
                                                                int i177 = ~i171;
                                                                int i178 = ~(i177 | 5);
                                                                int i179 = ~((i177 & iComponent25) | (i177 ^ iComponent25));
                                                                int i180 = ((i179 & i178) | (i178 ^ i179)) * (-283);
                                                                int i181 = (i173 ^ i180) + ((i180 & i173) << 1);
                                                                int i182 = (~(((-6) & i171) | ((-6) ^ i171))) * 283;
                                                                int i183 = (i181 & i182) + (i182 | i181);
                                                                int i184 = (~i171) | (-6);
                                                                int i185 = -(-((~((i184 & iComponent25) | (i184 ^ iComponent25))) * 283));
                                                                int i186 = (i183 & i185) + (i185 | i183);
                                                                threadPriority = 1;
                                                                Object[] objArr17 = new Object[1];
                                                                a(i170, i186, new char[]{30, 65524, 65531, 65526, 65535}, 168 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, objArr17);
                                                                try {
                                                                    Object[] objArr18 = {(String) objArr17[0]};
                                                                    threadPriority = Process.getThreadPriority(0);
                                                                    int iComponent26 = RouteDatabase.component2();
                                                                    int i187 = -(-(threadPriority * 382));
                                                                    int i188 = (((-7600) | i187) << 1) - (i187 ^ (-7600));
                                                                    int i189 = threadPriority | iComponent26;
                                                                    int i190 = i188 + (((i189 & (-21)) | (i189 ^ (-21))) * (-381));
                                                                    int i191 = ~((-21) | (~threadPriority));
                                                                    int i192 = component3;
                                                                    int i193 = (i192 & 61) + (i192 | 61);
                                                                    component2 = i193 % 128;
                                                                    if (i193 % 2 == 0) {
                                                                        int i194 = ~iComponent26;
                                                                        int i195 = ~((i194 & threadPriority) | (i194 ^ threadPriority));
                                                                        int i196 = -(-(381 >> (((i195 & i191) | (i191 ^ i195)) | (~((threadPriority ^ 20) | (threadPriority & 20))))));
                                                                        i14 = ((i190 | i196) << 1) - (i196 ^ i190);
                                                                        i15 = 381 / (~(((-21) & threadPriority) | ((-21) ^ threadPriority)));
                                                                    } else {
                                                                        int i197 = ~iComponent26;
                                                                        int i198 = ~((i197 & threadPriority) | (i197 ^ threadPriority));
                                                                        int i199 = -(-(((i198 & i191) | (i191 ^ i198) | (~((threadPriority ^ 20) | (threadPriority & 20)))) * 381));
                                                                        i14 = ((i190 | i199) << 1) - (i199 ^ i190);
                                                                        i15 = (~(((-21) & threadPriority) | ((-21) ^ threadPriority))) * 381;
                                                                    }
                                                                    int i200 = i192 + 5;
                                                                    component2 = i200 % 128;
                                                                    if (i200 % 2 == 0) {
                                                                        int i201 = i14 + i15;
                                                                        i16 = ((i201 & (-59)) + (i201 | (-59))) * 37;
                                                                        i17 = (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)) + 116;
                                                                        cArr = new char[]{5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14, 16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14};
                                                                        iResolveOpacity = Drawable.resolveOpacity(1, 1);
                                                                        i18 = 27780;
                                                                    } else {
                                                                        int i202 = -(-i15);
                                                                        i16 = ((((i14 | i202) << 1) - (i202 ^ i14)) >> 6) + 37;
                                                                        i17 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27;
                                                                        cArr = new char[]{5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14, 16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14};
                                                                        iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                                                        i18 = 210;
                                                                    }
                                                                    int i203 = i16;
                                                                    int i204 = i17;
                                                                    char[] cArr7 = cArr;
                                                                    int i205 = ~((~iResolveOpacity) | i18);
                                                                    int i206 = ~i18;
                                                                    int i207 = (i206 & iResolveOpacity) | (i206 ^ iResolveOpacity);
                                                                    int i208 = (iResolveOpacity * 450) + (i18 * (-448)) + ((i205 | (~((i207 & i2) | (i207 ^ i2)))) * 449);
                                                                    int i209 = ~iResolveOpacity;
                                                                    int i210 = (i208 - (~((~((i209 ^ i18) | (i209 & i18))) * (-1347)))) - 1;
                                                                    int i211 = ~(i209 | i18);
                                                                    int i212 = (~i18) | i60;
                                                                    int i213 = ~((i212 & iResolveOpacity) | (i212 ^ iResolveOpacity));
                                                                    int i214 = ((i211 & i213) | (i211 ^ i213)) * 449;
                                                                    int i215 = ((i210 | i214) << 1) - (i210 ^ i214);
                                                                    Object[] objArr19 = new Object[1];
                                                                    a(i203, i204, cArr7, i215, false, objArr19);
                                                                    Class<?> cls6 = Class.forName((String) objArr19[0]);
                                                                    threadPriority = 11;
                                                                    Object[] objArr20 = new Object[1];
                                                                    b(new int[]{163, 11, 199, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, objArr20);
                                                                    Object objInvoke3 = cls6.getMethod((String) objArr20[0], String.class).invoke(null, objArr18);
                                                                    int i216 = component2;
                                                                    int i217 = (i216 ^ 1) + ((i216 & 1) << 1);
                                                                    component3 = i217 % 128;
                                                                    int i218 = i217 % 2;
                                                                    try {
                                                                        Object[] objArr21 = new Object[1];
                                                                        b(new int[]{174, 28, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1}, objArr21);
                                                                        Class<?> cls7 = Class.forName((String) objArr21[0]);
                                                                        int i219 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                        int i220 = (i219 & 11) + (i219 | 11);
                                                                        int i221 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                        int i222 = (i221 ^ 1) + ((i221 & 1) << 1);
                                                                        threadPriority = new char[]{18, CharUtils.CR, '\b', 65499, 18, CharUtils.CR, 65534, 65498, 11, 11, 65530};
                                                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                                                        int iComponent27 = RouteDatabase.component2();
                                                                        int i223 = iLastIndexOf * (-405);
                                                                        int i224 = ((i223 | 87098) << 1) - (i223 ^ 87098);
                                                                        int i225 = ~(((-215) & iComponent27) | ((-215) ^ iComponent27));
                                                                        int i226 = (~iComponent27) | iLastIndexOf;
                                                                        Object[] objArr22 = objArr;
                                                                        int i227 = ~((i226 ^ 214) | (i226 & 214));
                                                                        int i228 = (i224 - (~(((i227 & i225) | (i225 ^ i227)) * (-406)))) - 1;
                                                                        int i229 = component3 + 51;
                                                                        component2 = i229 % 128;
                                                                        int i230 = i229 % 2;
                                                                        int i231 = ~iComponent27;
                                                                        int i232 = (-215) | i231;
                                                                        int i233 = (-406) * (~((i232 & iLastIndexOf) | (i232 ^ iLastIndexOf)));
                                                                        int i234 = ((i228 | i233) << 1) - (i228 ^ i233);
                                                                        int i235 = ~iLastIndexOf;
                                                                        int i236 = ~((i235 & iComponent27) | (i235 ^ iComponent27));
                                                                        int i237 = ~((i231 & 214) | (i231 ^ 214));
                                                                        int i238 = ((i237 & i236) | (i236 ^ i237)) * HaProxyConstants.VOUCHER_TOP_UP_SUCESS;
                                                                        int i239 = (i234 ^ i238) + ((i238 & i234) << 1);
                                                                        Object[] objArr23 = new Object[1];
                                                                        a(i220, i222, threadPriority, i239, false, objArr23);
                                                                        try {
                                                                            Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr23[0], null).invoke(obj3, null))};
                                                                            int i240 = component3;
                                                                            int i241 = (i240 & 99) + (i240 | 99);
                                                                            component2 = i241 % 128;
                                                                            int i242 = i241 % 2;
                                                                            int iNormalizeMetaState = 37 - KeyEvent.normalizeMetaState(0);
                                                                            int i243 = ~((-296646782) | i60);
                                                                            int i244 = ((i243 & (-1593692630)) | ((-1593692630) ^ i243)) * (-933);
                                                                            int i245 = (((-1367626598) | i244) << 1) - (i244 ^ (-1367626598));
                                                                            int i246 = ~((-1593692630) | i60);
                                                                            int i247 = i245 + (((i246 & 1313964416) | (i246 ^ 1313964416)) * 933) + 538305866;
                                                                            int iComponent28 = RouteDatabase.component2();
                                                                            int i248 = ~iComponent28;
                                                                            int i249 = (-94642694) | i248;
                                                                            int i250 = ~((i249 ^ (-1789272309)) | (i249 & (-1789272309)));
                                                                            int i251 = ~(((-1778516209) ^ iComponent28) | ((-1778516209) & iComponent28));
                                                                            int i252 = (((i250 ^ i251) | (i250 & i251)) * 988) - 1244719228;
                                                                            int i253 = ~((iComponent28 & (-94642694)) | ((-94642694) ^ iComponent28));
                                                                            int i254 = (i253 & 83886593) | (83886593 ^ i253);
                                                                            int i255 = (i248 & (-1789272309)) | (i248 ^ (-1789272309));
                                                                            int i256 = ~((i255 & 94642693) | (i255 ^ 94642693));
                                                                            int i257 = -(-(((i254 & i256) | (i254 ^ i256)) * 988));
                                                                            if (i247 <= ((i252 | i257) << 1) - (i257 ^ i252)) {
                                                                                int iIndexOf2 = 27 % TextUtils.indexOf("", "", 0, 0);
                                                                                iGreen = Color.green(1);
                                                                                i19 = 11460;
                                                                                cArr2 = new char[]{5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14, 16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14};
                                                                                iIndexOf = iIndexOf2;
                                                                            } else {
                                                                                cArr2 = new char[]{5, 16, 21, 65482, 65535, 1, 14, 16, 65482, 65503, 1, 14, 16, 5, 2, 5, 65535, 65533, 16, 1, 65506, 65533, 65535, 16, 11, 14, 21, 6, 65533, 18, 65533, 65482, 15, 1, 65535, 17, 14};
                                                                                iIndexOf = 27 - TextUtils.indexOf("", "", 0, 0);
                                                                                iGreen = Color.green(0);
                                                                                i19 = 210;
                                                                            }
                                                                            int i258 = (i19 - (~iGreen)) - 1;
                                                                            Object[] objArr25 = new Object[1];
                                                                            a(iNormalizeMetaState, iIndexOf, cArr2, i258, false, objArr25);
                                                                            ?? cls8 = Class.forName((String) objArr25[0]);
                                                                            Object[] objArr26 = new Object[1];
                                                                            b(new int[]{202, 19, 124, 0}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0}, objArr26);
                                                                            String str3 = (String) objArr26[0];
                                                                            ?? r4 = new Class[1];
                                                                            int i259 = component2;
                                                                            int i260 = (i259 & 15) + (i259 | 15);
                                                                            component3 = i260 % 128;
                                                                            if (i260 % 2 != 0) {
                                                                                try {
                                                                                    r4[0] = InputStream.class;
                                                                                    cls8.getMethod(str3, r4).invoke(objInvoke3, objArr24);
                                                                                    Object obj4 = null;
                                                                                    obj4.hashCode();
                                                                                    throw null;
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    Throwable cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                            threadPriority = InputStream.class;
                                                                            r4[0] = threadPriority;
                                                                            Object objInvoke4 = cls8.getMethod(str3, r4).invoke(objInvoke3, objArr24);
                                                                            try {
                                                                                int iAxisFromString = MotionEvent.axisFromString("");
                                                                                int i261 = iAxisFromString * 50;
                                                                                int i262 = (i261 ^ (-3395)) + ((i261 & (-3395)) << 1);
                                                                                int i263 = ~(((-36) ^ i61) | ((-36) & i61));
                                                                                int i264 = ~(((-36) & iAxisFromString) | ((-36) ^ iAxisFromString));
                                                                                int i265 = ((i263 & i264) | (i263 ^ i264)) * 98;
                                                                                int i266 = (i262 ^ i265) + ((i262 & i265) << 1);
                                                                                int i267 = ~iAxisFromString;
                                                                                int i268 = ~((i267 & i60) | (i267 ^ i60));
                                                                                int i269 = (i268 & (-36)) | ((-36) ^ i268);
                                                                                int i270 = ~((iAxisFromString ^ i2) | (iAxisFromString & i2));
                                                                                int i271 = (i266 - (~(((i269 & i270) | (i269 ^ i270)) * (-49)))) - 1;
                                                                                int i272 = ~(((-36) & i2) | ((-36) ^ i2));
                                                                                int i273 = ~((iAxisFromString & 35) | (iAxisFromString ^ 35));
                                                                                int i274 = i271 + (((i273 & i272) | (i272 ^ i273)) * 49);
                                                                                int i275 = 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                char[] cArr8 = {2, 65487, 20, 6, 4, 22, 19, '\n', 21, JSONLexer.EOI, 65487, 4, 6, 19, 21, 65487, 65529, 65494, 65489, 65498, 65508, 6, 19, 21, '\n', 7, '\n', 4, 2, 21, 6, 11, 2, 23};
                                                                                int i276 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                                int i277 = (i276 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + ((i276 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) << 1);
                                                                                Object[] objArr27 = new Object[1];
                                                                                a(i274, i275, cArr8, i277, false, objArr27);
                                                                                Class<?> cls9 = Class.forName((String) objArr27[0]);
                                                                                int i278 = 22 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                                                                int i279 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                                char[] cArr9 = {CharUtils.CR, '\b', 6, 21, 65524, 22, 3, 11, 6, 4, 21, 65529, 65494, 65489, 65489, 65521, 19, '\n', 15, 4, '\n', 17, 2};
                                                                                int i280 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                                int i281 = i280 * 69;
                                                                                int i282 = (i281 & (-13735)) + (i281 | (-13735));
                                                                                int i283 = (~i280) | (-206);
                                                                                int i284 = ~((i283 & i60) | (i283 ^ i60));
                                                                                int i285 = ~((i280 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i280 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                                                int i286 = (i284 & i285) | (i284 ^ i285);
                                                                                int i287 = ~((i2 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i2 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                                                int i288 = ((i286 & i287) | (i286 ^ i287)) * (-68);
                                                                                int i289 = (i282 ^ i288) + ((i288 & i282) << 1);
                                                                                int i290 = ~i280;
                                                                                int i291 = (i290 ^ i61) | (i290 & i61);
                                                                                int i292 = i289 + ((~((i291 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i291 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR))) * (-68));
                                                                                threadPriority = (-206) ^ i60;
                                                                                Object[] objArr28 = new Object[1];
                                                                                a(i278, i279, cArr9, i292 + ((i290 | (~(((-206) & i60) | threadPriority))) * 68), false, objArr28);
                                                                                if (!objNewInstance.equals(cls9.getMethod((String) objArr28[0], null).invoke(objInvoke4, null))) {
                                                                                    int i293 = component3 + 49;
                                                                                    component2 = i293 % 128;
                                                                                    int i294 = i293 % 2;
                                                                                    try {
                                                                                        int i295 = -View.MeasureSpec.getSize(0);
                                                                                        int i296 = i295 * (-129);
                                                                                        int i297 = (i296 ^ 4454) + ((i296 & 4454) << 1);
                                                                                        int i298 = ((-35) ^ i61) | ((-35) & i61);
                                                                                        int i299 = component3;
                                                                                        int i300 = (i299 ^ 113) + ((i299 & 113) << 1);
                                                                                        component2 = i300 % 128;
                                                                                        if (i300 % 2 == 0) {
                                                                                            i20 = (i297 - (130 / (~((i298 & i295) | (i298 ^ i295))))) % ((~(((-35) ^ i295) | ((-35) & i295))) * (-260));
                                                                                            int i301 = ~i295;
                                                                                            i21 = ~((i301 & 34) | (i301 ^ 34));
                                                                                            int i302 = i295 | (-35);
                                                                                            i22 = (i302 & i2) | (i302 ^ i2);
                                                                                        } else {
                                                                                            int i303 = -(-((~(i298 | i295)) * 130));
                                                                                            int i304 = (i297 ^ i303) + ((i303 & i297) << 1);
                                                                                            int i305 = ((-35) & i295) | ((-35) ^ i295);
                                                                                            int i306 = -(-((~i305) * (-260)));
                                                                                            i20 = ((i304 | i306) << 1) - (i306 ^ i304);
                                                                                            int i307 = ~i295;
                                                                                            i21 = ~((i307 & 34) | (i307 ^ 34));
                                                                                            i22 = (i305 ^ i2) | (i305 & i2);
                                                                                        }
                                                                                        int i308 = ~i22;
                                                                                        int i309 = (i20 - (~(130 * ((i308 & i21) | (i21 ^ i308))))) - 1;
                                                                                        int i310 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                        int i311 = (i310 & 30) + (i310 | 30);
                                                                                        char[] cArr10 = {2, 65487, 20, 6, 4, 22, 19, '\n', 21, JSONLexer.EOI, 65487, 4, 6, 19, 21, 65487, 65529, 65494, 65489, 65498, 65508, 6, 19, 21, '\n', 7, '\n', 4, 2, 21, 6, 11, 2, 23};
                                                                                        int i312 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                                        int iComponent29 = RouteDatabase.component2();
                                                                                        int i313 = i312 * FileUtils.JPEG_MARKER_EOI;
                                                                                        int i314 = (i313 & (-43860)) + (i313 | (-43860));
                                                                                        int i315 = -(-((~((i312 ^ iComponent29) | (i312 & iComponent29))) * 216));
                                                                                        int i316 = (i314 & i315) + (i315 | i314);
                                                                                        int i317 = (i312 ^ (-205)) | (i312 & (-205));
                                                                                        int i318 = ~iComponent29;
                                                                                        int i319 = ((i317 & i318) | (i317 ^ i318)) * (-216);
                                                                                        int i320 = ~iComponent29;
                                                                                        int i321 = (((i316 | i319) << 1) - (i319 ^ i316)) + (((~((i312 & i320) | (i320 ^ i312))) | 204) * 216);
                                                                                        Object[] objArr29 = new Object[1];
                                                                                        a(i309, i311, cArr10, i321, false, objArr29);
                                                                                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                                                                                        int i322 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                        int i323 = ((i322 | 23) << 1) - (i322 ^ 23);
                                                                                        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                                                                        int i324 = maxKeyCode * (-519);
                                                                                        int i325 = (i324 ^ 521) + ((i324 & 521) << 1);
                                                                                        int i326 = ~maxKeyCode;
                                                                                        int i327 = (i326 & (-2)) | (i326 ^ (-2));
                                                                                        int i328 = ~((i327 & i60) | (i327 ^ i60));
                                                                                        int i329 = ~(i2 | 1);
                                                                                        int i330 = -(-(((i328 & i329) | (i328 ^ i329)) * 520));
                                                                                        int i331 = (i325 ^ i330) + ((i330 & i325) << 1);
                                                                                        int i332 = ~(((-2) & i61) | ((-2) ^ i61));
                                                                                        int i333 = (maxKeyCode ^ i2) | (maxKeyCode & i2);
                                                                                        int i334 = ~i333;
                                                                                        int i335 = -(-(((i332 ^ i334) | (i332 & i334)) * (-1040)));
                                                                                        int i336 = (i331 ^ i335) + ((i335 & i331) << 1);
                                                                                        int i337 = ~maxKeyCode;
                                                                                        int i338 = ~((i337 & i60) | (i337 ^ i60));
                                                                                        int i339 = ~(((-2) ^ maxKeyCode) | ((-2) & maxKeyCode));
                                                                                        int i340 = (i338 & i339) | (i338 ^ i339);
                                                                                        int i341 = component3;
                                                                                        int i342 = (i341 ^ 7) + ((i341 & 7) << 1);
                                                                                        component2 = i342 % 128;
                                                                                        if (i342 % 2 == 0) {
                                                                                            int i343 = ~i333;
                                                                                            Object[] objArr30 = new Object[1];
                                                                                            a(i323, i336 << (520 / ((i343 & i340) | (i340 ^ i343))), new char[]{CharUtils.CR, '\b', 6, 21, 65524, 22, 3, 11, 6, 4, 21, 65529, 65494, 65489, 65489, 65521, 19, '\n', 15, 4, '\n', 17, 2}, 5259 / (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1)), true, objArr30);
                                                                                            Object objInvoke5 = cls10.getMethod((String) objArr30[0], null).invoke(objInvoke4, null);
                                                                                            obj = obj2;
                                                                                            if (!obj.equals(objInvoke5)) {
                                                                                                i13++;
                                                                                                objArr = objArr22;
                                                                                                obj2 = obj;
                                                                                            }
                                                                                        } else {
                                                                                            obj = obj2;
                                                                                            int i344 = ~(maxKeyCode | i2);
                                                                                            int i345 = i336 + (((i344 & i340) | (i340 ^ i344)) * 520);
                                                                                            char[] cArr11 = {CharUtils.CR, '\b', 6, 21, 65524, 22, 3, 11, 6, 4, 21, 65529, 65494, 65489, 65489, 65521, 19, '\n', 15, 4, '\n', 17, 2};
                                                                                            int i346 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                                            int i347 = (i346 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + ((i346 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) << 1);
                                                                                            Object[] objArr31 = new Object[1];
                                                                                            a(i323, i345, cArr11, i347, false, objArr31);
                                                                                            if (!obj.equals(cls10.getMethod((String) objArr31[0], null).invoke(objInvoke4, null))) {
                                                                                                i13++;
                                                                                                objArr = objArr22;
                                                                                                obj2 = obj;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        Throwable cause2 = th2.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                                Object[] objArr32 = {new int[1], new int[]{(~(i2 & 1)) & (i2 | 1)}, new int[]{i2}, null};
                                                                                int i348 = 821547893 + (((~(465789692 | i61)) | (-1070037757)) * 98) + (((~((-658987181) | i61)) | 465789692 | (~(658987180 | i2))) * (-49)) + (((~(465789692 | i2)) | 411050576) * 49);
                                                                                int iComponent210 = RouteDatabase.component2();
                                                                                int i349 = i348 * (-301);
                                                                                int i350 = (4848 & i349) + (i349 | 4848);
                                                                                int i351 = ~iComponent210;
                                                                                int i352 = (i351 & (-17)) | ((-17) ^ i351);
                                                                                int i353 = ~((i352 & i348) | (i352 ^ i348));
                                                                                int i354 = i348 | 16;
                                                                                int i355 = ~((i354 & iComponent210) | (i354 ^ iComponent210));
                                                                                int i356 = ((i353 & i355) | (i353 ^ i355)) * (-302);
                                                                                int i357 = ((i350 | i356) << 1) - (i356 ^ i350);
                                                                                int i358 = ((-17) & i348) | ((-17) ^ i348);
                                                                                int i359 = i357 + ((~((i358 & iComponent210) | (i358 ^ iComponent210))) * (-604));
                                                                                int i360 = ~i348;
                                                                                int i361 = ~((i360 & 16) | (i360 ^ 16));
                                                                                int i362 = ~((iComponent210 & i348) | (i348 ^ iComponent210));
                                                                                int i363 = (i359 - (~(-(-(((i362 & i361) | (i361 ^ i362)) * 302))))) - 1;
                                                                                int i364 = i363 * (-518);
                                                                                int i365 = -(-(i3 * (-518)));
                                                                                int i366 = (i364 ^ i365) + ((i364 & i365) << 1);
                                                                                int i367 = ~((~i363) | i61);
                                                                                int i368 = ((i367 & i3) | (i3 ^ i367)) * 519;
                                                                                int i369 = (i366 ^ i368) + ((i368 & i366) << 1);
                                                                                int i370 = ~i363;
                                                                                int i371 = (i370 & i61) | (i370 ^ i61);
                                                                                int i372 = ~((i371 & i3) | (i371 ^ i3));
                                                                                int i373 = (i363 ^ i3) | (i363 & i3);
                                                                                int i374 = ~((i373 & i2) | (i373 ^ i2));
                                                                                int i375 = (i369 - (~(((i372 & i374) | (i372 ^ i374)) * (-519)))) - 1;
                                                                                int i376 = ~((i3 ^ i2) | (i3 & i2));
                                                                                int i377 = -(-(((i376 & i363) | (i363 ^ i376)) * 519));
                                                                                int i378 = (i375 ^ i377) + ((i377 & i375) << 1);
                                                                                int i379 = i378 << 13;
                                                                                int i380 = (i379 | i378) & (~(i378 & i379));
                                                                                int i381 = i380 >>> 17;
                                                                                int i382 = ((~i380) & i381) | ((~i381) & i380);
                                                                                int i383 = i382 << 5;
                                                                                ((int[]) objArr32[0])[0] = ((~i382) & i383) | ((~i383) & i382);
                                                                                RouteDatabase.component2();
                                                                                return objArr32;
                                                                            } catch (Throwable th3) {
                                                                                Throwable cause3 = th3.getCause();
                                                                                if (cause3 != null) {
                                                                                    throw cause3;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        Throwable cause4 = th5.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                        throw th5;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    Throwable cause5 = th6.getCause();
                                                                    if (cause5 != null) {
                                                                        throw cause5;
                                                                    }
                                                                    throw th6;
                                                                }
                                                                threadPriority = i3;
                                                            }
                                                            threadPriority = i3;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            Throwable cause6 = th.getCause();
                                                            if (cause6 != null) {
                                                                throw cause6;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                    }
                                                } catch (Throwable th9) {
                                                    Throwable cause7 = th9.getCause();
                                                    if (cause7 != null) {
                                                        throw cause7;
                                                    }
                                                    throw th9;
                                                }
                                            } else {
                                                Object obj5 = null;
                                                try {
                                                    cls2.getMethod(str2, null).invoke(context, null);
                                                    obj5.hashCode();
                                                    throw null;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                        Throwable cause8 = th.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th;
                                    } catch (Throwable th12) {
                                        Throwable cause9 = th12.getCause();
                                        if (cause9 != null) {
                                            throw cause9;
                                        }
                                        throw th12;
                                    }
                                } catch (Throwable th13) {
                                    Throwable cause10 = th13.getCause();
                                    if (cause10 != null) {
                                        throw cause10;
                                    }
                                    throw th13;
                                }
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            threadPriority = i3;
                        }
                    } else {
                        threadPriority = i3;
                    }
                    Object[] objArr33 = {new int[1], new int[]{i2}, new int[]{i2}, null};
                    int i384 = ~(Process.myTid() | 142151449);
                    int i385 = -(-(((141625609 | i384) * (-196)) + 2078948435 + ((i384 | 525840) * 196)));
                    int i386 = (threadPriority & i385) + (i385 | threadPriority);
                    int i387 = (i386 << 13) ^ i386;
                    int i388 = i387 ^ (i387 >>> 17);
                    int i389 = i388 << 5;
                    ((int[]) objArr33[0])[0] = (i388 | i389) & (~(i388 & i389));
                    return objArr33;
                }
            });
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag2.setBackground(viewFindViewWithTag.getBackground());
            }
            viewGroup.addView(viewFindViewWithTag2);
            component1(viewGroup, statusBarHeight, viewFindViewWithTag2, viewFindViewWithTag2);
        }
        ((TextView) viewFindViewWithTag2.findViewById(R.id.tvTitle)).setText(str);
    }

    private static void component1(final ViewGroup viewGroup, final int i, View view, final View view2) {
        view.post(new Runnable() {
            @Override
            public final void run() {
                ToolbarUtils.copydefault(viewGroup, view2, i);
            }
        });
    }

    static void copydefault(ViewGroup viewGroup, View view, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (ShareDataUIState.equals(childAt.getTag()) || component2.equals(childAt.getTag())) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin += view.getHeight() + i;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public static void hideStatusBarView(FragmentActivity fragmentActivity) {
        View viewFindViewWithTag = ((ViewGroup) fragmentActivity.getWindow().getDecorView()).findViewWithTag(component2);
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.setVisibility(8);
        }
    }

    public static void copydefault(FragmentActivity fragmentActivity, View view) {
        Callback.onClick_enter(view);
        try {
            fragmentActivity.finish();
        } finally {
            Callback.onClick_exit();
        }
    }
}
