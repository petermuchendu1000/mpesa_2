package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.BR;
import com.huawei.digitalpayment.consumer.baselib.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import org.bouncycastle.crypto.signers.PSSSigner;

public class WebLoadFailedBindingImpl extends WebLoadFailedBinding {
    private static char[] ShareDataUIState;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component3;
    private static int getAsAtTimestamp;
    private static long getRequestBeneficiariesState;
    private final LinearLayout component2;
    private long copydefault;
    private static final byte[] $$c = {86, 117, -27, 75};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Ascii.GS, -26, 91, 68, Ascii.VT, -3, -64, 56, 7, -1, -9, 4, -8, -56, TarHeader.LF_BLK, Ascii.SO, 6, -10, 3, -6, -66, 69, -12, 4, -4, -62, 68, -12, -8, 2, 0, -2, -55, 65, 1, -4, 4, -6, -14, Ascii.DC2, -16, -57, Ascii.DC2, 44, 10, -42, 33, -4, 4, -6, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, PSSSigner.TRAILER_IMPLICIT};
    private static final int $$e = 88;
    private static final byte[] $$a = {80, -19, -87, -22, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_SYMLINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24};
    private static final int $$b = 119;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = 122 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBindingImpl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBindingImpl.$$g(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 16 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBindingImpl.$$a
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = 15 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-16)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBindingImpl.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBindingImpl.$$d
            int r7 = r7 * 4
            int r7 = r7 + 99
            int r6 = r6 * 37
            int r6 = 47 - r6
            int r8 = r8 * 46
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + 1
            int r8 = r8 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBindingImpl.c(int, byte, short, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        component3 = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"base_toolbar_layout"}, new int[]{1}, new int[]{R.layout.base_toolbar_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.tvTips, 2);
        int i = equals + 27;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public WebLoadFailedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component3, component1));
    }

    private WebLoadFailedBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) throws Throwable {
        super(dataBindingComponent, view, 1, (BaseToolbarLayoutBinding) objArr[1], (TextView) objArr[2]);
        this.copydefault = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.toobar);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
        if (objCopydefault == null) {
            int iMyTid = 2984 - (Process.myTid() >> 22);
            int scrollBarFadeDuration = 48 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54461);
            byte b2 = (byte) ($$a[18] + 1);
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, scrollBarFadeDuration, c3, 1571866973, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(22 - View.MeasureSpec.getSize(0), Color.alpha(0), (char) (View.resolveSizeAndState(0, 0, 0) + 64173), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(View.getDefaultSize(0, 0) + 15, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35070), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
        if (objCopydefault2 == null) {
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2985;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 48;
            char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 54461);
            byte[] bArr = $$a;
            byte b4 = bArr[31];
            Object[] objArr6 = new Object[1];
            a(b4, (byte) (b4 + 1), (byte) (-bArr[18]), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, packedPositionGroup, c4, -1592726660, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
            if (objCopydefault3 == null) {
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2985;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 48;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 54463);
                Object[] objArr7 = new Object[1];
                a((byte) 8, r14[31], (byte) (-$$a[18]), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, deadChar, cLastIndexOf, -635740813, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, new int[1], (String[]) objArr8[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i = (-317057355) + ((startUptimeMillis | 687483778) * (-50));
            int i2 = ~((-13631489) | startUptimeMillis);
            int i3 = ~startUptimeMillis;
            int i4 = i + (((~(i3 | (-1409602562))) | i2) * 50) + (((~(i3 | 687483778)) | (~((-1423234050) | i3)) | 1409602561) * 50) + 2062938973;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38, (char) (30864 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            b(16 - View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 81, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3028), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 97, (char) (ImageFormat.getBitsPerPixel(0) + 28719), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 2062938973};
                byte[] bArr2 = $$d;
                byte b5 = bArr2[30];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                c(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr2[34];
                Object[] objArr15 = new Object[1];
                c(b7, bArr2[30], b7, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                    if (objCopydefault4 == null) {
                        int modifierMetaStateMask = 2983 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iResolveSizeAndState = 48 - View.resolveSizeAndState(0, 0, 0);
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 54462);
                        Object[] objArr17 = new Object[1];
                        a((byte) 8, r13[31], (byte) (-$$a[18]), objArr17);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iResolveSizeAndState, windowTouchSlop, -635740813, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        b(22 - KeyEvent.normalizeMetaState(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 64174), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        b(Color.green(0) + 15, 21 - TextUtils.lastIndexOf("", '0', 0), (char) (35071 - View.getDefaultSize(0, 0)), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                        if (objCopydefault5 == null) {
                            int i7 = 2985 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int tapTimeout = 48 - (ViewConfiguration.getTapTimeout() >> 16);
                            char fadingEdgeLength = (char) (54462 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte[] bArr3 = $$a;
                            byte b8 = bArr3[31];
                            Object[] objArr20 = new Object[1];
                            a(b8, (byte) (b8 + 1), (byte) (-bArr3[18]), objArr20);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i7, tapTimeout, fadingEdgeLength, -1592726660, false, (String) objArr20[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                        if (objCopydefault6 == null) {
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2985;
                            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 48;
                            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 54463);
                            byte b9 = (byte) ($$a[18] + 1);
                            byte b10 = b9;
                            Object[] objArr21 = new Object[1];
                            a(b9, b10, b10, objArr21);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, iIndexOf2, bitsPerPixel2, 1571866973, false, (String) objArr21[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i8 = ((int[]) objArr[0])[0];
        int i9 = ((int[]) objArr[1])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArr[2])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = ~((-357011205) | (~iIdentityHashCode));
            int i12 = i10 + ((1753247867 | i11 | (~(357011204 | iIdentityHashCode))) * (-338)) + 2003010025 + (((~(iIdentityHashCode | 2110259071)) | i11) * 338);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr22[2])[0] = i14 ^ (i14 << 5);
            int i15 = ((int[]) objArr22[2])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, new int[1], (String[]) objArr22[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i15 + 158328660 + ((~((~iIdentityHashCode2) | (-8429602))) * 433) + (((~((-2000377811) | iIdentityHashCode2)) | (-110340018)) * (-433)) + (((~(iIdentityHashCode2 | (-110340018))) | (-2008807412)) * 433);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[2])[0] = i18 ^ (i18 << 5);
            c2 = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((long) (i8 ^ i9)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) 3) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6617, 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr23 = {-1503427661, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 56 - Color.argb(0, 0, 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                int i19 = ((int[]) objArr[2])[0];
                Object[] objArr24 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
                int i20 = i19 + (((2033123195 | r0) * (-658)) - 1400351817) + (((~(((int) Runtime.getRuntime().totalMemory()) | 190116686)) | 1881803825) * 658);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr24[2])[0] = i22 ^ (i22 << 5);
                int[] iArr = new int[i9];
                int i23 = i9 - 1;
                iArr[i23] = 1;
                Toast.makeText((Context) null, iArr[((i9 * i23) % 2) - 1], 1).show();
                int i24 = ((int[]) objArr24[2])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr24[0])[0]}, new int[]{((int[]) objArr24[1])[0]}, new int[1], (String[]) objArr24[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i25 = i24 + 2080585767 + ((~((~iMaxMemory) | 2096889587)) * (-116)) + ((1020468433 | iMaxMemory) * 116) + (((~(iMaxMemory | (-1090249395))) | 13828240) * 116);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                c2 = 2;
                ((int[]) objArr2[2])[0] = i27 ^ (i27 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        synchronized (this) {
            int i28 = ((int[]) objArr2[c2])[0];
            int i29 = i28 * i28;
            int i30 = -(1474104357 * i28);
            int i31 = (i29 & i30) + (i29 | i30);
            int i32 = -(i28 * 1268219153);
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            int i34 = (i33 & (-643910183)) + ((-643910183) | i33);
            int i35 = i34 >> 29;
            int i36 = (((i35 & (-15)) + (i35 | (-15))) / 8) - (-1);
            int i37 = (i34 ^ i36) + ((i36 & i34) << 1);
            int i38 = i34 >> 18;
            int i39 = (((i38 | (-32767)) << 1) - (i38 ^ (-32767))) / 16384;
            int i40 = -(i37 ^ ((i39 & 1) + (i39 | 1)));
            int i41 = (((i40 | 8) << 1) - (i40 ^ 8)) >> 24;
            int i42 = ((i41 & (-511)) + (i41 | (-511))) / 256;
            int i43 = (i42 & 1) + (i42 | 1);
            this.copydefault = ((long) (3926440 / (((-((i43 & 1) + (i43 | 1))) & r2) * 1295))) - 377;
        }
        this.toobar.invalidateAll();
        requestRebind();
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i2 + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1757 - ImageFormat.getBitsPerPixel(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (char) View.MeasureSpec.getMode(0), 1159210934, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(getRequestBeneficiariesState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 3608, 29 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7171), 1951385784, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4012 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (char) (27761 - (ViewConfiguration.getFadingEdgeLength() >> 16)), -1529629956, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i5 = $10 + 65;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getTapTimeout() >> 16), 23 - TextUtils.lastIndexOf("", '0', 0), (char) (ImageFormat.getBitsPerPixel(0) + 27762), -1529629956, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $11 + 91;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.copydefault != 0) {
                return true;
            }
            return this.toobar.hasPendingBindings();
        }
    }

    @Override
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = copy + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.setLifecycleOwner(lifecycleOwner);
        this.toobar.setLifecycleOwner(lifecycleOwner);
        int i4 = component4 + 49;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        if (i != 0) {
            int i4 = component4 + 45;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        boolean zComponent2 = component2((BaseToolbarLayoutBinding) obj, i2);
        int i6 = component4 + 19;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return zComponent2;
    }

    private boolean component2(BaseToolbarLayoutBinding baseToolbarLayoutBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.copydefault |= 1;
        }
        return true;
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
        executeBindingsOn(this.toobar);
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 59;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 115;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static void component2() {
        ShareDataUIState = new char[]{63162, 9471, 21035, 32887, 49052, 60864, 6915, 14067, 25828, 37426, 49169, 65446, 11738, 23402, 30371, 42216, 53782, 'r', 16259, 28106, 39792, 46754, 34028, 22191, 8316, 61991, 52690, 40862, 26961, 17629, 5820, 57458, 45569, 36307, 24472, 10534, 1248, 29831, 42690, 53270, 586, 15777, 28669, 39230, 46286, 59095, 4108, 17010, 32230, 45023, 55623, 62622, 9945, 20528, 33381, 48550, 61409, 6522, 13468, 26312, 36901, 49783, 64952, 3093, 56905, 43152, 31450, 17723, 5994, 57790, 52273, 40534, 26780, 15102, 1329, 55149, 41429, 35854, 24137, 10425, 64242, 1992, 54665, 41792, 28957, 20132, 7356, 60031, 51146, 38293, 25366, 12565, 3829, 56489, 43540, 34763, 21913, 31793, 44662, 55465, 2792, 13572, 26435, 37264, 48167, 60992, 6307, 19151, 29982, 42851, 53749, 64560, 11883};
        getRequestBeneficiariesState = 3772975346547809852L;
    }
}
