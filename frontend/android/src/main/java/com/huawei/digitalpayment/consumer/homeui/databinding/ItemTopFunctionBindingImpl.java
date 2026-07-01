package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.notify;
import org.apache.commons.lang3.CharUtils;

public class ItemTopFunctionBindingImpl extends ItemTopFunctionBinding {
    private static char[] component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static char component4;
    private static long copydefault;
    private static int getAsAtTimestamp;
    private long ShareDataUIState;
    private static final byte[] $$c = {115, Ascii.RS, 119, 102};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {69, -50, 81, 75, -39, -25, -30, -26, -26, -18, -36, -33, 39};
    private static final int $$e = 67;
    private static final byte[] $$a = {115, Ascii.RS, 119, 102, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
    private static final int $$b = 7;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int equals = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 102
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBindingImpl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r4 = -r4
            int r8 = r8 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBindingImpl.$$g(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 23 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBindingImpl.$$a
            int r6 = r6 * 16
            int r6 = r6 + 83
            int r1 = r5 + 10
            byte[] r1 = new byte[r1]
            int r5 = r5 + 9
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-16)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBindingImpl.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBindingImpl.$$d
            int r7 = r7 * 3
            int r7 = 99 - r7
            int r6 = r6 * 2
            int r6 = 10 - r6
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-27)
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemTopFunctionBindingImpl.d(int, int, int, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 1;
        ShareDataUIState();
        component2();
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.ivFunctionIcon, 1);
        sparseIntArray.put(R.id.tvFunctionName, 2);
        sparseIntArray.put(R.id.guideline, 3);
        sparseIntArray.put(R.id.guideline2, 4);
        sparseIntArray.put(R.id.tvRedDot, 5);
        sparseIntArray.put(R.id.ivMarker, 6);
        int i = equals + 77;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ItemTopFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, component3));
    }

    private ItemTopFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[3], (View) objArr[4], (RoundImageView) objArr[1], (RoundImageView) objArr[6], (ConstraintLayout) objArr[0], (TextView) objArr[2], (BubblesView) objArr[5]);
        this.ShareDataUIState = -1L;
        this.rlRoot.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ShareDataUIState != 0;
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 3;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 3266, 33 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 60268), -834797019, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (copydefault / 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 3);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) (60373 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), -1969106284, false, $$g(b4, b5, (byte) (b5 - 4)), new Class[]{Object.class, Object.class});
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
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3265, 32 - Process.getGidForName(""), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60268), -834797019, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                    try {
                        Object[] objArr5 = {notifyVar, notifyVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 3);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 687, 34 - TextUtils.getOffsetBefore("", 0), (char) (Drawable.resolveOpacity(0, 0) + 60373), -1969106284, false, $$g(b8, b9, (byte) (b9 - 4)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
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
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $11 + 45;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 3);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.MeasureSpec.getMode(0), 33 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((Process.myPid() >> 22) + 60373), -1969106284, false, $$g(b10, b11, (byte) (b11 - 4)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr7 = {notifyVar, notifyVar};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault6 == null) {
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 3);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 686, 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (60373 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), -1969106284, false, $$g(b12, b13, (byte) (b13 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.ShareDataUIState = 0L;
        }
    }

    private static void b(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(component4)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, (char) (64292 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7116 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, (char) (Color.red(0) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i8 = $11 + 53;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 27637), 794909189, false, $$g(b3, (byte) (b3 | 17), (byte) (-1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i10];
                        i3 = $10 + 49;
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                            i3 = $10 + 61;
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    }
                    $11 = i3 % 128;
                    int i15 = i3 % 2;
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    @Override
    public boolean onFieldChange(int i, Object obj, int i2) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i3 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
        if (objCopydefault == null) {
            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1115;
            int size = 22 - View.MeasureSpec.getSize(0);
            char cAlpha = (char) Color.alpha(0);
            byte b2 = $$a[37];
            Object[] objArr3 = new Object[1];
            a((byte) (b2 - 1), b2, r2[6], objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, size, cAlpha, 573302743, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(new char[]{'\t', 19, CharUtils.CR, 0, 14, 23, 11, 20, '\f', '\b', 23, 16, 7, '\b', 4, 17, 15, 22, CharUtils.CR, 18, 1, '\n'}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3), 21 - ExpandableListView.getPackedPositionChild(0L), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(new char[]{18, '\t', '\t', 14, '\t', 17, 15, 20, 24, '\t', 7, 3, 22, 19, 13829}, (byte) (5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
        if (objCopydefault2 == null) {
            int scrollBarSize = 1115 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iMyPid = (Process.myPid() >> 22) + 22;
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            byte b3 = $$a[37];
            Object[] objArr6 = new Object[1];
            a(b3, b3, (byte) ($$b + 3), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iMyPid, cResolveOpacity, 987555995, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = copy + 51;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
            if (objCopydefault3 == null) {
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1115;
                int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b4 = (byte) ($$b - 1);
                byte b5 = (byte) ($$a[37] - 1);
                Object[] objArr7 = new Object[1];
                a(b4, b5, b5, objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, scrollBarFadeDuration, c2, 1068109365, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i7 = ~iUptimeMillis;
            int i8 = (-1292050458) + (((~((-615490811) | i7)) | (-422293323)) * 519) + (((~(i7 | (-2860107))) | (~((-419433217) | iUptimeMillis))) * (-519)) + (((~(iUptimeMillis | (-422293323))) | 615490810) * 519) + 1662018699;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(new char[]{'\t', 19, CharUtils.CR, 0, 14, 23, 11, 20, '\t', 14, 6, 24, 15, 1, 4, 22, '\t', 20, 1, 7, 23, 24, 4, 18, 0, 14}, (byte) (117 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 26 - TextUtils.indexOf("", "", 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(new char[]{2, '\n', 13818, 13818, 24, 19, 1, 17, 13820, 13820, '\t', 23, 1, 0, 4, 22, 14, '\n'}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 18), TextUtils.getCapsMode("", 0, 0) + 18, objArr10);
            Method method = cls2.getMethod((String) objArr10[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i11 = copy + 111;
                    getRequestBeneficiariesState = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            int i13 = copy + 53;
            getRequestBeneficiariesState = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 1, 1662018699};
                Object[] objArr12 = new Object[1];
                c(62297 - (Process.myTid() >> 22), new char[]{18057, 46556, 41013, 40143, 35814, 34338, 62109, 57842, 56391, 51362, 51134, 12893, 11951, 7432, 2141, 1193, 29467, 28271, 23256, 18704, 17511, 45258, 44841, 39547, 38598, 34165, 61827, 60646, 56120, 55180, 49905, 12608, 11695, 6369, 5910, 946, 32264, 27988, 22953, 21516, 17196, 49115, 43551, 39274, 38354, 32831, 65397, 60356, 58996, 53907, 49641, 15400, 10396, 10222, 4672, 3737, 32188, 26731, 25761, 21264, 20070, 47792, 43287, 42105, 37114, 36626, 64097, 63203, 58663, 53371, 52432, 15104, 14228, 8942, 4414, 3469, 30882, 30560, 25498, 24284, 19799, 47532, 46109, 41823, 40874, 35364, 63844, 62900, 57372, 57212, 52165, 50733}, objArr12);
                Class<?> cls3 = Class.forName(((String) objArr12[0]).intern());
                byte b6 = (byte) 0;
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) ($$b - 1);
                        byte b9 = (byte) ($$a[37] - 1);
                        Object[] objArr15 = new Object[1];
                        a(b8, b9, b9, objArr15);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1115, 21 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 1068109365, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        b(new char[]{'\t', 19, CharUtils.CR, 0, 14, 23, 11, 20, '\f', '\b', 23, 16, 7, '\b', 4, 17, 15, 22, CharUtils.CR, 18, 1, '\n'}, (byte) (2 - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        b(new char[]{18, '\t', '\t', 14, '\t', 17, 15, 20, 24, '\t', 7, 3, 22, 19, 13829}, (byte) (6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
                        if (objCopydefault5 == null) {
                            byte b10 = $$a[37];
                            Object[] objArr18 = new Object[1];
                            a(b10, b10, (byte) ($$b + 3), objArr18);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1115 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 987555995, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
                        if (objCopydefault6 == null) {
                            int iGreen = Color.green(0) + 1115;
                            int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                            char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                            byte b11 = $$a[37];
                            Object[] objArr19 = new Object[1];
                            a((byte) (b11 - 1), b11, r5[6], objArr19);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, offsetBefore, offsetBefore2, 573302743, false, (String) objArr19[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr14;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = getRequestBeneficiariesState + 121;
            int i18 = i17 % 128;
            copy = i18;
            int i19 = i17 % 2;
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr = (String[]) objArr[3];
            Object[] objArr20 = {new int[]{i ^ (i << 5)}, new int[]{i22}, new int[]{i21}, strArr};
            int i23 = ~i;
            int i24 = i20 + 1389724494 + (((~((-210254001) | i23)) | 17056512) * (-591)) + (((-210254001) | i) * 591);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            int i27 = ((int[]) objArr20[0])[0];
            objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr20[1])[0]}, new int[]{((int[]) objArr20[2])[0]}, strArr};
            int i28 = i27 + (-1011110512) + (((~(i | 364265925)) | 167775248) * 305) + (((~(i23 | 364265925)) | 171068437) * 305);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            int i31 = i18 + 89;
            getRequestBeneficiariesState = i31 % 128;
            int i32 = i31 % 2;
        } else {
            long j2 = -1;
            long j3 = ((long) (i16 ^ i15)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 5) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6618, View.getDefaultSize(0, 0) + 42, (char) ((-1) - MotionEvent.axisFromString("")), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr21 = {-1582467328, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 6563, ExpandableListView.getPackedPositionType(0L) + 56, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr21);
                int i33 = ((int[]) objArr[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i34 = (int) Runtime.getRuntime().totalMemory();
                int i35 = ~i34;
                int i36 = 1201669031 + (((~((-270563793) | i35)) | (~((-249332777) | i34))) * 520);
                int i37 = ~(249332776 | i35);
                int i38 = ~(i34 | 442530264);
                int i39 = i33 + i36 + ((i37 | i38) * (-1040)) + ((i38 | (~(i35 | (-442530265))) | (-519896569)) * 520);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr22[0])[0] = i41 ^ (i41 << 5);
                int[] iArr = new int[i16];
                int i42 = i16 - 1;
                iArr[i42] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i42) % 2) - 1], 1).show();
                int i43 = ((int[]) objArr22[0])[0];
                Object[] objArr23 = {new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i44 = i43 + (((((~(9333494 | r2)) | (~((-202530983) | iIdentityHashCode))) | (~(r2 | 202530982))) * 959) - 611059346) + (((~(iIdentityHashCode | 202530982)) | (~((~iIdentityHashCode) | (-202530983))) | (~(9333494 | iIdentityHashCode))) * 959);
                int i45 = (i44 << 13) ^ i44;
                int i46 = i45 ^ (i45 >>> 17);
                ((int[]) objArr23[0])[0] = i46 ^ (i46 << 5);
                objArr2 = objArr23;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        int i47 = ((int[]) objArr2[0])[0];
        int i48 = i47 * i47;
        int i49 = -(1592187187 * i47);
        int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
        int i51 = -(i47 * (-861861213));
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        int i53 = ((i52 | (-23179847)) << 1) - ((-23179847) ^ i52);
        int i54 = i53 >> 26;
        int i55 = (((i54 | ComposerKt.defaultsKey) << 1) - (i54 ^ ComposerKt.defaultsKey)) / 64;
        int i56 = ((i55 | 1) << 1) - (i55 ^ 1);
        int i57 = (i53 & i56) + (i56 | i53);
        int i58 = i53 >> 29;
        int i59 = ((i58 & (-15)) + (i58 | (-15))) / 8;
        int i60 = -(((i59 & 1) + (i59 | 1)) ^ i57);
        int i61 = (i60 & 3) + (i60 | 3);
        int i62 = i61 >> 16;
        int i63 = (((i62 | (-131071)) << 1) - (i62 ^ (-131071))) / 65536;
        int i64 = (i63 ^ 1) + ((i63 & 1) << 1);
        return 0 / (((-((i64 & 1) + (i64 | 1))) & i61) * 660);
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 89;
        copy = i3 % 128;
        return i3 % 2 == 0;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 39;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        copydefault = -5623027888254040384L;
        int i5 = i2 + 13;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{2019, 2016, 2036, 2034, 2017, 2038, 2041, 2035, 2028, 2032, 2020, 2027, 2037, 2031, 2030, 2002, 1985, 2029, 2003, 2021, 1987, 1966, 2004, 2024, 2025};
        component4 = (char) 12831;
    }
}
