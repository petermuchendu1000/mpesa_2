package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public class ItemUserScopeBindingImpl extends ItemUserScopeBinding {
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static boolean component4;
    private static char[] copydefault;
    private static boolean equals;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private final CardView ShareDataUIState;
    private long component2;
    private static final byte[] $$c = {120, 65, 99, 57};
    private static final int $$d = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {106, 40, -98, -117, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 155;
    private static int getShareableDataState = 0;
    private static int ArtificialStackFrames = 1;
    private static int copy = 1;

    private static String $$e(int i, int i2, int i3) {
        int i4 = 73 - (i2 * 5);
        int i5 = i3 * 2;
        int i6 = 3 - (i * 2);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i4 = i6 + i4;
            i6 = i6;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            int i9 = i6 + 1;
            i4 += bArr[i9];
            i6 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemUserScopeBindingImpl.$$a
            int r8 = r8 * 3
            int r8 = 99 - r8
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = 10 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-26)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemUserScopeBindingImpl.b(byte, int, byte, java.lang.Object[]):void");
    }

    static {
        getAsAtTimestamp = 0;
        component3();
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.imgIcon, 1);
        sparseIntArray.put(R.id.tvUserscope, 2);
        int i = copy + 33;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public ItemUserScopeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component3, component1));
    }

    private ItemUserScopeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.component2 = -1L;
        CardView cardView = (CardView) objArr[0];
        this.ShareDataUIState = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    private static void a(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = copydefault;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - View.resolveSizeAndState(i3, i3, i3), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1670574543, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - TextUtils.indexOf("", "", 0), 13 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) TextUtils.indexOf("", "", 0, 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i5 = 689978476;
            if (equals) {
                int i6 = $10 + 99;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.red(0), Color.blue(0) + 19, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 7645), -327556343, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        i5 = 689978476;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (component4) {
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getTouchSlop() >> 8), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (7644 - View.MeasureSpec.getSize(0)), -327556343, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i8 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i8;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i9 = $11 + 37;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i8 = cancelVar.component3 + 1;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = ArtificialStackFrames + 105;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Drawable.resolveOpacity(0, 0), 33 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((Process.myPid() >> 22) + 19696), 520092524, false, "component2", null);
        }
        int i6 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, null, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 988;
        long j2 = -1;
        long j3 = j2 ^ 2890320269974399024L;
        long j4 = i;
        long j5 = j4 ^ j2;
        int i7 = i6;
        long j6 = (((long) 989) * 1565402826632111301L) + (((long) (-987)) * 2890320269974399024L) + (((((j3 | j5) | 1565402826632111301L) ^ j2) | ((4448852727018024181L | j4) ^ j2)) * j) + (((long) (-988)) * (j3 | 1565402826632111301L)) + (j * ((j2 ^ (j5 | 4448852727018024181L)) | ((j3 | j4) ^ j2) | (((j2 ^ 1565402826632111301L) | j3) ^ j2)));
        int i8 = 0;
        while (true) {
            if (i8 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - Color.green(0), 30 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 846241313, false, "copydefault", null);
                }
                int i9 = ((Field) objCopydefault2).getInt(null);
                int i10 = 0;
                long j7 = jLongValue;
                while (true) {
                    int i11 = ArtificialStackFrames + 115;
                    getShareableDataState = i11 % 128;
                    int i12 = 2;
                    int i13 = i11 % 2;
                    int i14 = 0;
                    while (i14 != 8) {
                        int i15 = ArtificialStackFrames + 67;
                        getShareableDataState = i15 % 128;
                        int i16 = i15 % i12;
                        i9 = (((((int) (j7 >> i14)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
                        i14++;
                        i12 = 2;
                    }
                    if (i10 != 0) {
                        break;
                    }
                    int i17 = ArtificialStackFrames + 35;
                    getShareableDataState = i17 % 128;
                    int i18 = i17 % 2;
                    i10++;
                    j7 = j6;
                }
                int i19 = i7;
                if (i9 == i19) {
                    break;
                }
                int i20 = getShareableDataState + 63;
                ArtificialStackFrames = i20 % 128;
                if (i20 % 2 == 0) {
                    jLongValue += 1024;
                    i8 += 120;
                } else {
                    jLongValue -= 1024;
                    i8++;
                }
                i7 = i19;
            } else {
                try {
                    Object[] objArr3 = {-1375505683};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1663 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 11, (char) TextUtils.indexOf("", "", 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(i), 0, -331897547, ((Constructor) objCopydefault3).newInstance(objArr3), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int offsetBefore = 1454 - TextUtils.getOffsetBefore("", 0);
                        int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b2, b3, b3, objArr5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, scrollBarFadeDuration, scrollBarFadeDuration2, 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 1543, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 38, (char) Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr4);
                    int i21 = ((int[]) objArr6[2])[0];
                    int i22 = ((int[]) objArr6[1])[0];
                    if (i22 != i21) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[3];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j8 = -1;
                        long j9 = ((long) (i22 ^ i21)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
                        long j10 = 0;
                        long j11 = j9 | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr7 = {-1375505683, Long.valueOf(j11), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0, 0), 56 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((Process.getThreadPriority(0) + 20) >> 6), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr7);
                        Toast.makeText((Context) null, i22 / (((i22 - 1) * i22) % 2), 0).show();
                        int i23 = ArtificialStackFrames + 105;
                        getShareableDataState = i23 % 128;
                        int i24 = i23 % 2;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ArtificialStackFrames + 39;
        int i4 = i3 % 128;
        getShareableDataState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 57;
        ArtificialStackFrames = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static void component3() {
        copydefault = new char[]{30210, 30321, 30335, 30317, 30320, 30330, 30257, 30316, 30220, 30314, 30319, 30334, 30326, 30236, 30327, 30332, 30324, 30323, 30221};
        getRequestBeneficiariesState = 321287907;
        component4 = true;
        equals = true;
    }
}
