package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public class ActivitySfcRoamingInternationalBindingImpl extends ActivitySfcRoamingInternationalBinding {
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4;
    private static char copy;
    private static long copydefault;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout ShareDataUIState;
    private long component1;
    private static final byte[] $$c = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$f = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -128, 109, -128, -13, 1, 62, -52, -12, 2, 6, 0, -2, 0, TarHeader.LF_SYMLINK, -58, -12, 8, -14, Ascii.DLE, -14, 67, -53, -4, -1, -4, -2, -14, Ascii.DLE, TarHeader.LF_FIFO, -63, -4, -6, -1, 10, 3, TarHeader.LF_FIFO, -67, 3, 10, -25, 19, -14, 67, -39, -22, -5, 7, Ascii.SI, -32, 10, -4, -8, -13, 1, -4, 0, 0, 8, -10, -7, SignedBytes.MAX_POWER_OF_TWO};
    private static final int $$e = 228;
    private static final byte[] $$a = {125, 44, 8, -98, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 237;
    private static int equals = 0;
    private static int getShareableDataState = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcRoamingInternationalBindingImpl.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r7 = r7 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcRoamingInternationalBindingImpl.$$g(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 28 - r9
            int r8 = r8 * 6
            int r8 = 16 - r8
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcRoamingInternationalBindingImpl.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r3
            r3 = r7
            r7 = r6
        L2e:
            int r7 = -r7
            int r9 = r9 + r7
            int r9 = r9 + (-17)
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcRoamingInternationalBindingImpl.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 40
            int r0 = r8 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcRoamingInternationalBindingImpl.$$d
            int r7 = r7 * 49
            int r7 = 52 - r7
            int r6 = r6 * 2
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L31
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L31:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcRoamingInternationalBindingImpl.c(short, short, byte, java.lang.Object[]):void");
    }

    static {
        component4 = 0;
        ShareDataUIState();
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.rv_roaming_intl, 4);
        int i = getAsAtTimestamp + 125;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 52 / 0;
        }
    }

    public ActivitySfcRoamingInternationalBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, component2));
    }

    private ActivitySfcRoamingInternationalBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) throws Throwable {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[2], (RecyclerView) objArr[4], (TextView) objArr[3], (View) objArr[1]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int i = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2026;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 6165);
            byte b2 = (byte) ($$b & 3);
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 - 1), $$a[2], objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i, tapTimeout, cLastIndexOf, 163751008, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-1) - MotionEvent.axisFromString(""), new char[]{59071, 2240, 50421, 45230, 59274, 26909, 2704, 36736, 27377, 12196, 12457, 14743, 39636, 55180, 34027, 20329, 17763, 48362, 56408, 62874, 47209, 45075}, new char[]{7679, 5186, 32424, 36989}, new char[]{0, 0, 0, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b((char) (TextUtils.indexOf("", "", 0, 0) + 53999), Color.alpha(0) + 96585449, new char[]{37637, 42824, 13208, 12098, 22074, 61998, 28214, 12208, 39037, 44178, 28077, 39373, 17287, 56621, 44777}, new char[]{59796, 49606, 61189, 54738}, new char[]{0, 0, 0, 0}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2026;
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
            char cResolveSize = (char) (View.resolveSize(0, 0) + 6164);
            byte b3 = (byte) 0;
            byte b4 = (byte) (b3 + 1);
            Object[] objArr6 = new Object[1];
            a(b3, b4, (byte) (b4 + 2), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i2, i3, cResolveSize, 381780032, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2026;
                int iRgb = Color.rgb(0, 0, 0) + 16777239;
                char cGreen = (char) (6164 - Color.green(0));
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 1);
                Object[] objArr7 = new Object[1];
                a(b5, b6, (byte) (b6 - 1), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iRgb, cGreen, 385853891, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i4 = ((int[]) objArr8[1])[0];
            int i5 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[2];
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = ~i6;
            int i8 = ((((-1652381458) + (((~((-306766721) | i7)) | 1785866755) * 519)) + (((~(i7 | (-269009281))) | (~(2054876035 | i6))) * (-519))) + (((~(i6 | 1785866755)) | 306766720) * 519)) - 620314959;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b((char) (35566 - Process.getGidForName("")), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{61695, 59378, 12562, 8114, 44338, 13802, 22333, 50540, 43814, 11597, 65006, 38104, 41664, 41117, 36800, 54866}, new char[]{6882, 35042, 61415, 21642}, new char[]{0, 0, 0, 0}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b((char) (View.getDefaultSize(0, 0) + 37235), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{38572, 3629, 46131, 13844, 10581, 5598, 14355, 6172, 37209, 23318, 29995, 29162, 3365, 50504, 12197, 14914}, new char[]{61084, 17172, 29614, 43153}, new char[]{0, 0, 0, 0}, objArr10);
            try {
                Object[] objArr11 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -620314959};
                byte[] bArr = $$d;
                byte b7 = bArr[11];
                byte b8 = bArr[0];
                Object[] objArr12 = new Object[1];
                c(b7, b8, b8, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b9 = bArr[11];
                byte b10 = b9;
                Object[] objArr13 = new Object[1];
                c(b9, b10, b10, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int iAlpha = 2026 - Color.alpha(0);
                    int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    char cResolveSize2 = (char) (View.resolveSize(0, 0) + 6164);
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 + 1);
                    Object[] objArr14 = new Object[1];
                    a(b11, b12, (byte) (b12 - 1), objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, i11, cResolveSize2, 385853891, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{59071, 2240, 50421, 45230, 59274, 26909, 2704, 36736, 27377, 12196, 12457, 14743, 39636, 55180, 34027, 20329, 17763, 48362, 56408, 62874, 47209, 45075}, new char[]{7679, 5186, 32424, 36989}, new char[]{0, 0, 0, 0}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53999), KeyEvent.getDeadChar(0, 0) + 96585449, new char[]{37637, 42824, 13208, 12098, 22074, 61998, 28214, 12208, 39037, 44178, 28077, 39373, 17287, 56621, 44777}, new char[]{59796, 49606, 61189, 54738}, new char[]{0, 0, 0, 0}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2026;
                        int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                        char cIndexOf = (char) (6164 - TextUtils.indexOf("", "", 0, 0));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr17 = new Object[1];
                        a(b13, b14, (byte) (b14 + 2), objArr17);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, iResolveSizeAndState, cIndexOf, 381780032, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2025;
                        int mode = 23 - View.MeasureSpec.getMode(0);
                        char c2 = (char) (6165 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        byte b15 = (byte) ($$b & 3);
                        Object[] objArr18 = new Object[1];
                        a(b15, (byte) (b15 - 1), $$a[2], objArr18);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i12, mode, c2, 163751008, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[1])[0];
        if (i14 == i13) {
            Object[] objArr19 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = i15 + (-1207329774) + ((~((~iIdentityHashCode) | (-553829379))) * 433) + (((~((-1459108066) | iIdentityHashCode)) | (-633525411)) * (-433)) + (((~(iIdentityHashCode | (-633525411))) | (-2012937444)) * 433);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[0])[0] = i20 ^ (i20 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i21 = ((int[]) objArr19[0])[0];
            int i22 = ((int[]) objArr19[1])[0];
            int i23 = ((int[]) objArr19[3])[0];
            int iMyTid = Process.myTid();
            int i24 = ~(806009602 | iMyTid);
            int i25 = i21 + (-1494247362) + ((1286619265 | i24) * (-814)) + ((i24 | (~((~iMyTid) | (-1286623874))) | 806004994) * 407) + (((~(iMyTid | 1286623873)) | (~((-806009603) | iMyTid)) | 806004994) * 407);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[2];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i13 ^ i14))) | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 6618, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr20 = {-1159610748, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6561, 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i28 = ((int[]) objArr[0])[0];
                int i29 = ((int[]) objArr[1])[0];
                int i30 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[2];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i31 = ~iIdentityHashCode2;
                int i32 = i28 + (-895740749) + ((~(113295625 | i31)) * (-560)) + ((~(iIdentityHashCode2 | (-1899629683))) * (-560)) + (((~(1979337850 | i31)) | 33587457) * 560);
                int i33 = (i32 << 13) ^ i32;
                int i34 = i33 ^ (i33 >>> 17);
                ((int[]) objArr21[0])[0] = i34 ^ (i34 << 5);
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                objArr2 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                int i35 = ((int[]) objArr21[0])[0];
                int i36 = ((int[]) objArr21[1])[0];
                int i37 = ((int[]) objArr21[3])[0];
                String[] strArr5 = (String[]) objArr21[2];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i38 = 722773507 + (((~(802147134 | startUptimeMillis)) | 1290486341) * 672);
                int i39 = ~startUptimeMillis;
                int i40 = i35 + i38 + (((~(startUptimeMillis | 1290486341)) | (~((-802147135) | i39))) * (-672)) + (((~((-1290486342) | i39)) | 1075839041) * 672);
                int i41 = (i40 << 13) ^ i40;
                int i42 = i41 ^ (i41 >>> 17);
                ((int[]) objArr2[0])[0] = i42 ^ (i42 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        synchronized (this) {
            int i43 = ((int[]) objArr2[0])[0];
            int i44 = i43 * i43;
            int i45 = -(1422382435 * i43);
            int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
            int i47 = -(i43 * (-494837837));
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            int i49 = (i48 & (-1318877319)) + ((-1318877319) | i48);
            int i50 = i49 >> 19;
            int i51 = (((i50 & (-16383)) + (i50 | (-16383))) / 8192) - (-1);
            int i52 = (i49 ^ i51) + ((i51 & i49) << 1);
            int i53 = i49 >> 29;
            int i54 = -(i52 ^ (((((i53 | (-15)) << 1) - (i53 ^ (-15))) / 8) - (-1)));
            int i55 = ((i54 ^ 5) + ((i54 & 5) << 1)) >> 19;
            int i56 = (((i55 | (-16383)) << 1) - (i55 ^ (-16383))) / 8192;
            int i57 = ((i56 | 1) << 1) - (i56 ^ 1);
            this.component1 = ((long) (3324650 / (((-(((i57 | 1) << 1) - (i57 ^ 1))) & r2) * 805))) - 825;
        }
        requestRebind();
    }

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 4037, ImageFormat.getBitsPerPixel(0) + 32, (char) (19181 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1912513118, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 7567, 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 2459, ExpandableListView.getPackedPositionType(0L) + 28, (char) ('0' - AndroidCharacter.getMirror('0')), 931716605, false, $$g(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.getCapsMode("", 0, 0), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) getRequestBeneficiariesState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copy) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i6 = $11 + 1;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
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

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getShareableDataState;
        int i5 = i4 + 111;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 47;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 33;
        equals = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 1;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static void ShareDataUIState() {
        copydefault = -3780477796495014671L;
        getRequestBeneficiariesState = 1386857713;
        copy = (char) 37124;
    }
}
