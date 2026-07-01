package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.http.HaProxyConstants;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;

public class LayoutBalancesInfoCardBindingImpl extends LayoutBalancesInfoCardBinding {
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static long copydefault;
    private static int getAsAtTimestamp;
    private long component3;
    private static final byte[] $$c = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$d = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {102, Ascii.GS, -34, 39, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 238;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.databinding.LayoutBalancesInfoCardBindingImpl.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = r6 + 102
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.LayoutBalancesInfoCardBindingImpl.$$e(int, short, short):java.lang.String");
    }

    private static void a(short s, short s2, int i, Object[] objArr) {
        int i2 = s2 * 6;
        int i3 = (i * 16) + 83;
        int i4 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[16 - i2];
        int i5 = 15 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i4 + i5) - 17;
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i7 = i4 + 1;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i7]) - 17;
                i4 = i7;
            }
        }
    }

    static {
        getAsAtTimestamp = 1;
        component1();
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.csProfPic, 1);
        sparseIntArray.put(R.id.imgProfPic, 2);
        sparseIntArray.put(R.id.cardAbbr, 3);
        sparseIntArray.put(R.id.tvAbbr, 4);
        sparseIntArray.put(R.id.consPhone, 5);
        sparseIntArray.put(R.id.txTariffVal, 6);
        sparseIntArray.put(R.id.txPhoneNo, 7);
        int i = ShareDataUIState + 121;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    public LayoutBalancesInfoCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component2, component1));
    }

    private LayoutBalancesInfoCardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[3], (CardView) objArr[0], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[1], (RoundImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[6]);
        this.component3 = -1L;
        this.cardAccountInfo.setTag(null);
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r23, char[] r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.LayoutBalancesInfoCardBindingImpl.b(int, char[], java.lang.Object[]):void");
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) throws Throwable {
        Object[] objArr;
        int i3 = 2 % 2;
        int i4 = component4 + 47;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 999;
            int size = View.MeasureSpec.getSize(0) + 31;
            char cAlpha = (char) (Color.alpha(0) + 61685);
            byte b2 = (byte) ($$a[11] + 1);
            byte b3 = (byte) (b2 + 1);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, size, cAlpha, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(8862 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{32771, 41617, 50492, 59335, 2681, 11546, 20392, 29191, 38117, 46996, 55918, 64654, 8007, 16872, 25728, 34612, 43487, 52300, 61188, 4522, 13381, 22248}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12197, new char[]{32775, 44971, 57161, 3837, 16005, 28222, 40408, 52659, 64815, 11470, 23676, 35841, 48055, 60270, 6913}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int jumpTapTimeout = 999 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 31;
            char size2 = (char) (View.MeasureSpec.getSize(0) + 61685);
            byte b4 = (byte) ($$a[18] - 1);
            Object[] objArr5 = new Object[1];
            a((byte) ($$b & 31), b4, b4, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, pressedStateDuration, size2, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int mode = 999 - View.MeasureSpec.getMode(0);
                int modifierMetaStateMask = 30 - ((byte) KeyEvent.getModifierMetaStateMask());
                char c2 = (char) (61686 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                byte b5 = $$a[26];
                byte b6 = (byte) (b5 & 1);
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(mode, modifierMetaStateMask, c2, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~((-42532945) | iIdentityHashCode);
            int i9 = 1505869581 + ((134352417 | i8) * (-476)) + (i8 * 952) + ((~((~iIdentityHashCode) | (-42532945))) * 476) + 609131440;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2217, Drawable.resolveOpacity(0, 0) + 45, (char) TextUtils.getOffsetAfter("", 0), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 609131440, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int pressedStateDuration2 = 999 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31;
                    char cIndexOf = (char) (61685 - TextUtils.indexOf("", "", 0));
                    byte b7 = (byte) ($$b & 48);
                    byte b8 = (byte) ($$a[18] - 1);
                    Object[] objArr9 = new Object[1];
                    a(b7, b8, b8, objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration2, maximumDrawingCacheSize, cIndexOf, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 1030, 42 - Color.alpha(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)), (Class) ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + TarHeader.LF_LINK, TextUtils.getTrimmedLength("") + 43, (char) (Color.green(0) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1000;
                    int keyRepeatDelay = 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61685);
                    byte b9 = $$a[26];
                    byte b10 = (byte) (b9 & 1);
                    Object[] objArr10 = new Object[1];
                    a(b9, b10, b10, objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, keyRepeatDelay, maxKeyCode, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((ViewConfiguration.getScrollBarSize() >> 8) + 8861, new char[]{32771, 41617, 50492, 59335, 2681, 11546, 20392, 29191, 38117, 46996, 55918, 64654, 8007, 16872, 25728, 34612, 43487, 52300, 61188, 4522, 13381, 22248}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(12197 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{32775, 44971, 57161, 3837, 16005, 28222, 40408, 52659, 64815, 11470, 23676, 35841, 48055, 60270, 6913}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 999;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 31;
                        char cMyTid = (char) ((Process.myTid() >> 22) + 61685);
                        byte b11 = (byte) ($$b & 31);
                        byte b12 = (byte) ($$a[18] - 1);
                        Object[] objArr13 = new Object[1];
                        a(b11, b12, b12, objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, scrollBarSize, cMyTid, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int mode2 = View.MeasureSpec.getMode(0) + 999;
                        int scrollDefaultDelay = 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        char cLastIndexOf = (char) (61684 - TextUtils.lastIndexOf("", '0', 0, 0));
                        byte b13 = (byte) ($$a[11] + 1);
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr14 = new Object[1];
                        a(b13, b14, b14, objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(mode2, scrollDefaultDelay, cLastIndexOf, -1638177773, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i14 = component4 + 5;
                getRequestBeneficiariesState = i14 % 128;
                int i15 = i14 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i12 ^ i13))) | (((long) 11) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6618, 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr15 = {1308540389, Long.valueOf(j4), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6562, Color.red(0) + 56, (char) TextUtils.getTrimmedLength(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr15);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[1])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = ~((-158585377) | iIdentityHashCode2);
            int i20 = ~iIdentityHashCode2;
            int i21 = i16 + 1328260283 + ((i19 | (~(729546353 | i20))) * (-406)) + ((~((-138658337) | i20)) * (-406)) + (((~(iIdentityHashCode2 | (-590888018))) | (~(158585376 | i20))) * HaProxyConstants.VOUCHER_TOP_UP_SUCESS);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i24 = ((int[]) objArr16[3])[0];
            int i25 = ((int[]) objArr16[2])[0];
            int i26 = ((int[]) objArr16[1])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i27 = i24 + 1847914751 + (((-21762323) | (~iIdentityHashCode3)) * (-490)) + (((~(iIdentityHashCode3 | (-189545812))) | 167783489) * 490) + 513391274;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr17[3])[0] = i29 ^ (i29 << 5);
        } else {
            int i30 = component4 + 19;
            getRequestBeneficiariesState = i30 % 128;
            int i31 = i30 % 2;
            Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[1])[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i35 = i32 + 45249428 + ((~((-399) | iIdentityHashCode4)) * (-301)) + (((~(268537855 | iIdentityHashCode4)) | (~((~iIdentityHashCode4) | 1018011249))) * (-301)) + (((~(iIdentityHashCode4 | (-1018011250))) | 268537855) * 301);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr18[3])[0] = i37 ^ (i37 << 5);
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i38 = ((int[]) objArr18[3])[0];
            int i39 = ((int[]) objArr18[2])[0];
            int i40 = ((int[]) objArr18[1])[0];
            int iNextInt = new Random().nextInt(937621174);
            int i41 = i38 + (-1450471375) + (((~(7328984 | iNextInt)) | 756032258) * 576) + (((~((~iNextInt) | 763361242)) | 770120) * 576) + 1682883712;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr19[3])[0] = i43 ^ (i43 << 5);
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 47;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 85;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static void component1() {
        copydefault = -4042786914929213368L;
    }
}
