package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.android.material.tabs.TabLayout;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public class ActivityPochiWalletPayBindingImpl extends ActivityPochiWalletPayBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static char[] component2;
    private static final SparseIntArray component3;
    private static int copy;
    private static char getRequestBeneficiariesState;
    private long component1;
    private final LinearLayout copydefault;
    private static final byte[] $$c = {65, -53, 110, -39};
    private static final int $$d = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {19, TarHeader.LF_SYMLINK, -9, 119, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 108;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 1;
    private static int equals = 0;

    private static String $$e(short s, int i, byte b2) {
        int i2 = (i * 4) + 119;
        int i3 = s * 3;
        int i4 = 3 - (b2 * 2);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i2;
        }
        while (true) {
            i6++;
            i4++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i4];
        }
    }

    private static void b(int i, byte b2, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = (i * 2) + 4;
        int i4 = 99 - (i2 * 2);
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[i5 + 10];
        int i6 = i5 + 9;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i6 + i4) - 26;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i8 = bArr[i3];
                i3++;
                i4 = (i4 + i8) - 26;
            }
        }
    }

    static {
        copy = 1;
        ShareDataUIState();
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tabLayout, 1);
        sparseIntArray.put(R.id.viewPager, 2);
        int i = equals + 81;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivityPochiWalletPayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ShareDataUIState, component3));
    }

    private ActivityPochiWalletPayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TabLayout) objArr[1], (ViewPager2) objArr[2]);
        this.component1 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.copydefault = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() throws Throwable {
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 34, (char) (19695 - TextUtils.indexOf((CharSequence) "", '0')), 520092524, false, "component2", null);
        }
        int i = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((byte) (67 - TextUtils.getCapsMode("", 0, 0)), new char[]{4, 16, 15, 2, 21, 16, 19, '\f', 17, 16, '\n', CharUtils.CR, 20, 16, '\b', '\t', 16, '\b', 11, 18, 23, 2}, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a((byte) (ExpandableListView.getPackedPositionType(0L) + 65), new char[]{CharUtils.CR, 18, 3, 21, 18, 5, 15, 7, 6, 3, '\f', '\b', CharUtils.CR, 16, 13888}, TextUtils.getOffsetBefore("", 0) + 15, objArr2);
        long j = 868;
        long j2 = -1;
        long j3 = j2 ^ 2626316211496637586L;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode ^ j2;
        long j5 = j2 ^ 1829406885109872739L;
        long j6 = j3 | j5;
        long j7 = (j * 2626316211496637586L) + (j * 1829406885109872739L) + (((long) (-867)) * (((j3 | j4) ^ j2) | ((j5 | j4) ^ j2))) + (((long) (-1734)) * ((j6 ^ j2) | ((j3 | jIdentityHashCode) ^ j2) | ((j5 | jIdentityHashCode) ^ j2))) + (((long) 867) * (((j6 | j4) ^ j2) | (((j3 | 1829406885109872739L) | jIdentityHashCode) ^ j2) | (((j5 | 2626316211496637586L) | jIdentityHashCode) ^ j2)));
        int i2 = 0;
        while (true) {
            if (i2 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 37, TextUtils.indexOf("", "", 0, 0) + 30, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 846241313, false, "copydefault", null);
                }
                int i3 = ((Field) objCopydefault2).getInt(null);
                int i4 = 0;
                long j8 = jLongValue;
                while (true) {
                    for (int i5 = 0; i5 != 8; i5++) {
                        i3 = (((((int) (j8 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    }
                    if (i4 != 0) {
                        break;
                    }
                    i4++;
                    j8 = j7;
                }
                if (i3 == i) {
                    break;
                }
                jLongValue -= 1024;
                i2++;
            } else {
                Object[] objArr3 = new Object[1];
                a((byte) (ExpandableListView.getPackedPositionChild(0L) + 91), new char[]{21, 4, 3, 2, '\n', 14, 4, 16, 24, '\n', 11, 22, 17, 5, CharUtils.CR, 23}, 16 - Drawable.resolveOpacity(0, 0), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25), new char[]{'\f', 16, '\t', 18, 6, '\f', 6, 22, 0, 2, 20, 15, 11, 21, 18, 7}, Color.red(0) + 16, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {402058912};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1663, TextUtils.getTrimmedLength("") + 10, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -62674235, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 1454;
                        int iArgb2 = 22 - Color.argb(0, 0, 0, 0);
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, iArgb2, cRgb, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 39 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.getTrimmedLength("")), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i6 = ((int[]) objArr8[2])[0];
                    int i7 = ((int[]) objArr8[1])[0];
                    if (i7 != i6) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j9 = -1;
                        long j10 = 0;
                        long j11 = (((long) (i7 ^ i6)) & ((j9 - ((j9 >> 63) << 32)) | (((long) 0) << 32))) | (j10 - ((j10 >> 63) << 32)) | (((long) 1) << 32);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, 42 - Gravity.getAbsoluteGravity(0, 0), (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr9 = {402058912, Long.valueOf(j11), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myPid() >> 22), 56 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) Color.red(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                        int[] iArr = new int[i7];
                        int i8 = i7 - 1;
                        iArr[i8] = 1;
                        Toast.makeText((Context) null, iArr[((i7 * i8) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        synchronized (this) {
            this.component1 = ((long) 822) - 822;
        }
    }

    private static void a(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component2;
        char c2 = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7421 - TextUtils.lastIndexOf("", c2, 0, 0), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (64290 - TextUtils.indexOf("", c2, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    c2 = '0';
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
        Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7422, 15 - Color.argb(0, 0, 0, 0), (char) (64290 - Process.getGidForName("")), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i9 = $10 + 1;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 + b2);
                        cArr4[cancelall.component2] = (char) (cancelall.component3 - b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 7117, (ViewConfiguration.getTapTimeout() >> 16) + 14, (char) (TextUtils.indexOf((CharSequence) "", '0') + 44464), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getScrollBarSize() >> 8) + 24, (char) (27636 - ExpandableListView.getPackedPositionChild(0L)), 794909189, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    }
                }
                cancelall.component2 += 2;
                int i15 = $11 + 73;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 31;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 109;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 65;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 121;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static void ShareDataUIState() {
        component2 = new char[]{2034, 2017, 2038, 2027, 1992, 2002, 1987, 2036, 2021, 2033, 2024, 2025, 2003, 2028, 1966, 2035, 2031, 2020, 2029, 2030, 2023, 2041, 2019, 2032, 2026};
        getRequestBeneficiariesState = (char) 12831;
    }
}
