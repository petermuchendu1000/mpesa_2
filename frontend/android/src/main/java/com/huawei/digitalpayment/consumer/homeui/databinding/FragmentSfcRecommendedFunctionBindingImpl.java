package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.ComposerKt;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.homeui.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public class FragmentSfcRecommendedFunctionBindingImpl extends FragmentSfcRecommendedFunctionBinding {
    private static char component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static char copy;
    private static final SparseIntArray copydefault;
    private static char equals;
    private static char getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private final CardView ShareDataUIState;
    private long component3;
    private static final byte[] $$c = {1, -53, Ascii.US, 101};
    private static final int $$d = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 120, -98, -110, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 129;
    private static int toString = 0;
    private static int hashCode = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r8 = r8 + 111
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcRecommendedFunctionBindingImpl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcRecommendedFunctionBindingImpl.$$e(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 6
            int r6 = 16 - r6
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcRecommendedFunctionBindingImpl.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
        L29:
            int r7 = r7 + r3
            int r7 = r7 + (-17)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcRecommendedFunctionBindingImpl.a(int, byte, byte, java.lang.Object[]):void");
    }

    static {
        getRequestBeneficiariesState = 1;
        ShareDataUIState();
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.recyclerView, 2);
        int i = component4 + 75;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentSfcRecommendedFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component2, copydefault));
    }

    private FragmentSfcRecommendedFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.component3 = -1L;
        CardView cardView = (CardView) objArr[0];
        this.ShareDataUIState = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 125;
        $10 = i5 % 128;
        char c3 = 3;
        if (i5 % 2 != 0) {
            int i6 = 5 / 3;
        }
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i7 = $10 + 13;
            $11 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 == 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 << 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c4 = cArr3[1];
                char c5 = cArr3[i4];
                int i9 = (c5 + i8) ^ ((c5 << 4) + ((char) (((long) copy) ^ 4374495167426960553L)));
                int i10 = c5 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[c3] = Integer.valueOf(getAsAtTimestamp);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c4);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int tapTimeout = 844 - (ViewConfiguration.getTapTimeout() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32;
                        char c6 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 23252);
                        byte b2 = (byte) ($$c[i4] - 1);
                        byte b3 = b2;
                        String str$$e = $$e(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, keyRepeatTimeout, c6, 592652048, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(equals)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int i11 = 845 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iGreen = Color.green(0) + 32;
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 23251);
                        byte b4 = (byte) ($$c[0] - 1);
                        byte b5 = b4;
                        c2 = 3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i11, iGreen, cResolveSize, 592652048, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        c2 = 3;
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    c3 = c2;
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
            char c7 = c3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 464, 49 - TextUtils.getCapsMode("", 0, 0), (char) View.MeasureSpec.getMode(0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            c3 = c7;
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 29;
        $10 = i12 % 128;
        if (i12 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i13 = 14 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    @Override
    public boolean onFieldChange(int i, Object obj, int i2) throws Throwable {
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i3 = 2 % 2;
        int i4 = hashCode + 29;
        toString = i4 % 128;
        int i5 = i4 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int iIndexOf = 999 - TextUtils.indexOf("", "", 0, 0);
            int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31;
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16838901);
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 + 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i6, cRgb, -1638177773, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, new char[]{55284, 54894, 20360, 22740, 48013, 20581, 8126, 21516, 35356, 64870, 15624, 9847, 38860, 11080, 57299, 49997, 40654, 21557, 25424, 38806, 19239, 57943}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{51839, 30339, 28578, 21276, 3717, 61730, 22621, 32183, 5869, 17751, 42791, 15815, 59424, 37338, 28933, 35405}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 998;
            int windowTouchSlop = 31 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            char keyRepeatDelay = (char) (61685 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            byte b4 = (byte) ($$b & 7);
            byte b5 = (byte) (b4 - 1);
            Object[] objArr6 = new Object[1];
            a(b4, b5, (byte) (b5 | Ascii.SO), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i7, windowTouchSlop, keyRepeatDelay, 1267259187, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int iIndexOf2 = 999 - TextUtils.indexOf("", "", 0, 0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 31;
                char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61685);
                byte b6 = (byte) ($$b & 7);
                Object[] objArr7 = new Object[1];
                a(b6, (byte) (b6 - 1), $$a[26], objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iNormalizeMetaState, c3, 1267122354, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[]{i ^ (i << 5)}};
            int i8 = ((int[]) objArr8[2])[0];
            int i9 = ((int[]) objArr8[1])[0];
            int i10 = ((((~((-144949633) | i)) * 521) + 1728496288) + (((~((~i) | (-144949633))) | 537398281) * 521)) - 1924500099;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >>> 17);
            c2 = 2;
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2217 - Gravity.getAbsoluteGravity(0, 0), 44 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objCopydefault4).newInstance(null), -1924500099, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 999;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 31;
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 61686);
                    byte b7 = (byte) ($$b & 7);
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr10 = new Object[1];
                    a(b7, b8, (byte) (b8 | 32), objArr10);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, fadingEdgeLength, cAxisFromString, 939672146, false, (String) objArr10[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1030 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))), (Class) ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1071, TextUtils.getOffsetAfter("", 0) + 43, (char) (View.MeasureSpec.getSize(0) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr9);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int iMakeMeasureSpec = 999 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i13 = 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    char cRed = (char) (Color.red(0) + 61685);
                    byte b9 = (byte) ($$b & 7);
                    Object[] objArr11 = new Object[1];
                    a(b9, (byte) (b9 - 1), $$a[26], objArr11);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, i13, cRed, 1267122354, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0', 0) + 23, new char[]{55284, 54894, 20360, 22740, 48013, 20581, 8126, 21516, 35356, 64870, 15624, 9847, 38860, 11080, 57299, 49997, 40654, 21557, 25424, 38806, 19239, 57943}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b(ExpandableListView.getPackedPositionChild(0L) + 16, new char[]{51839, 30339, 28578, 21276, 3717, 61730, 22621, 32183, 5869, 17751, 42791, 15815, 59424, 37338, 28933, 35405}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 998;
                        int iBlue = Color.blue(0) + 31;
                        char cGreen = (char) (61685 - Color.green(0));
                        byte b10 = (byte) ($$b & 7);
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, (byte) (b11 | Ascii.SO), objArr14);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i14, iBlue, cGreen, 1267259187, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int i15 = 1000 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 31;
                        char c4 = (char) (61686 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr15 = new Object[1];
                        a(b12, b13, (byte) (-b13), objArr15);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i15, iResolveOpacity, c4, -1638177773, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    int i16 = hashCode + 83;
                    toString = i16 % 128;
                    c2 = 2;
                    int i17 = i16 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[c2])[0];
        if (i19 == i18) {
            Object[] objArr16 = new Object[4];
            objArr16[1] = new int[]{i};
            objArr16[c2] = new int[]{i};
            objArr16[3] = new int[1];
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[c2])[0];
            int i22 = ((int[]) objArr[1])[0];
            objArr16[0] = new String[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i23 = i20 + ((((~((-134938634) | r2)) | (~(463194079 | startUptimeMillis))) * 988) - 727780163) + (((~(startUptimeMillis | (-421217948))) | 286279314 | (~((~startUptimeMillis) | 463194079))) * 988);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
            objArr2 = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i26 = ((int[]) objArr16[3])[0];
            int i27 = ((int[]) objArr16[2])[0];
            int i28 = ((int[]) objArr16[1])[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i29 = ~iFreeMemory;
            int i30 = i26 + (-1952049014) + (((~(i29 | 253673840)) | 495799553) * (-1042)) + ((253673840 | iFreeMemory) * 521) + (((~(iFreeMemory | (-495799554))) | 218906880 | (~(i29 | 530566513))) * 521);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[3])[0] = i32 ^ (i32 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i33 = 0;
                while (i33 < strArr.length) {
                    int i34 = toString + 75;
                    hashCode = i34 % 128;
                    int i35 = i34 % 2;
                    arrayList.add(strArr[i33]);
                    i33++;
                    int i36 = toString + 99;
                    hashCode = i36 % 128;
                    int i37 = i36 % 2;
                }
            }
            long j2 = -1;
            long j3 = ((long) (i18 ^ i19)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6618, 41 - ExpandableListView.getPackedPositionChild(0L), (char) KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr17 = {2069538675, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6562, (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) (ImageFormat.getBitsPerPixel(0) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr17);
            Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[]{i ^ (i << 5)}};
            int i38 = ((int[]) objArr[3])[0];
            int i39 = ((int[]) objArr[2])[0];
            int i40 = ((int[]) objArr[1])[0];
            int i41 = ~i;
            int i42 = i38 + 2002843428 + (((~((-504745354) | i41)) | (~((-244728041) | i41))) * (-867)) + (((~((-504745354) | i)) | 236208264 | (~((-244728041) | i))) * (-1734)) + (((~((-236208265) | i41)) | (~((-268537090) | i)) | (~((-8519777) | i))) * 867);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            int[] iArr = new int[i19];
            int i45 = i19 - 1;
            iArr[i45] = 1;
            Toast.makeText((Context) null, iArr[((i19 * i45) % 2) - 1], 1).show();
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[]{i ^ (i << 5)}};
            int i46 = ((int[]) objArr18[3])[0];
            int i47 = ((int[]) objArr18[2])[0];
            int i48 = ((int[]) objArr18[1])[0];
            int i49 = i46 + (-1276217603) + (((~(40457859 | i41)) | 709015534) * (-328)) + ((i | 709015534) * 164) + (((~(i | (-40457860))) | 37754498 | (~(711718895 | i41))) * 164);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            objArr2 = objArr19;
        }
        int i52 = ((int[]) objArr2[3])[0];
        int i53 = i52 * i52;
        int i54 = -(309962060 * i52);
        int i55 = (i53 & i54) + (i53 | i54);
        int i56 = -(i52 * 1695780490);
        int i57 = ((i55 ^ i56) + ((i56 & i55) << 1)) - 972112455;
        int i58 = i57 >> 26;
        int i59 = (((i58 & ComposerKt.defaultsKey) + (i58 | ComposerKt.defaultsKey)) / 64) - (-1);
        int i60 = ((i57 | i59) << 1) - (i59 ^ i57);
        int i61 = i57 >> 25;
        int i62 = (-(i60 ^ ((((i61 & (-255)) + (i61 | (-255))) / 128) - (-1)))) + 3;
        int i63 = i62 >> 24;
        int i64 = (((i63 | (-511)) << 1) - (i63 ^ (-511))) / 256;
        int i65 = (i64 & 1) + (i64 | 1);
        return 0 / ((i62 & (-(((i65 | 1) << 1) - (i65 ^ 1)))) * 1377);
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = hashCode + 3;
        toString = i3 % 128;
        return i3 % 2 == 0;
    }

    static void ShareDataUIState() {
        component1 = (char) 41001;
        equals = (char) 52425;
        copy = (char) 45297;
        getAsAtTimestamp = (char) 33583;
    }
}
