package com.huawei.digitalpayment.consumer.notification.ui.adapter;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;

public class NotTabViewPagerAdapter extends FragmentStateAdapter {
    private static short[] ShareDataUIState;
    private static final byte[] $$c = {93, -40, 95, -94};
    private static final int $$f = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, -53, -88, 102, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 121;
    private static final byte[] $$a = {34, -56, Ascii.SUB, -92, -16, Ascii.SI, 0, Ascii.VT};
    private static final int $$b = 252;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int component1 = -359842636;
    private static int component2 = -238323959;
    private static int copydefault = -273627811;
    private static byte[] component3 = {69, -73, 68, -65, -88, -81, 10, -95, 78, 73, -74, -79, 67, -12, 119, 73, -67, 69, -114, 125, 91, -91, 71, -35, -47, 32, -33, 33, -39, 41, -2, 5, -45, 34, -5, 10, -11, Ascii.VT, -13, 3, -44, -23, 76, -25, 8, Ascii.SI, -16, -9, 5, -78, TarHeader.LF_LINK, Ascii.SI, -5, 3, -56, 59, Ascii.GS, -29, 1, TarHeader.LF_CHR, -47, 41, -49, -49, 7, -42, -61, -63, 19, -48, -54, -53, TarHeader.LF_CONTIG, 57, 37, -24, 57, -56, -82, 85, 87, -123, 66, -83, 81, -81, 88, -84, 79, -79, -79, 124, -81, 94, 41, 41, 41, 41, 41, 41};

    private static String $$g(byte b2, byte b3, short s) {
        int i = b3 + 112;
        int i2 = s * 4;
        byte[] bArr = $$c;
        int i3 = b2 + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (-i3) + i2;
            i3 = i3;
        }
        while (true) {
            int i5 = i3 + 1;
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            i4 = i6;
            i = (-bArr[i5]) + i;
            i3 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.notification.ui.adapter.NotTabViewPagerAdapter.$$a
            int r8 = r8 * 4
            int r1 = r8 + 5
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 * 4
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            int r8 = r8 + 4
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
        L30:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.adapter.NotTabViewPagerAdapter.a(short, int, short, java.lang.Object[]):void");
    }

    private static void b(short s, int i, byte b2, Object[] objArr) {
        int i2 = i * 3;
        int i3 = 13 - (b2 * 9);
        byte[] bArr = $$d;
        int i4 = s + 98;
        byte[] bArr2 = new byte[10 - i2];
        int i5 = 9 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + i5) - 27;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i3]) - 27;
                i3++;
            }
        }
    }

    public NotTabViewPagerAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            return NotificationRecordsFragment.newInstance("0");
        }
        if (1 != i) {
            return NotificationRecordsFragment.newInstance("2");
        }
        int i3 = getAsAtTimestamp + 37;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        NotificationRecordsFragment notificationRecordsFragmentNewInstance = NotificationRecordsFragment.newInstance("1");
        int i5 = getAsAtTimestamp + 91;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return notificationRecordsFragmentNewInstance;
    }

    private static void c(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component2)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i6 = -1;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (-b3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 999, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, (char) (Color.alpha(0) + 61685), 1874745193, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            float f = 0.0f;
            if (i7 != 0) {
                int i8 = $10 + 79;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                byte[] bArr2 = component3;
                if (bArr2 != null) {
                    int i11 = i9 + 15;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 2984;
                                int i12 = 49 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 54462);
                                byte b5 = (byte) i6;
                                byte length2 = (byte) $$c.length;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, i12, cArgb, -1178636483, false, $$g(b5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr[i4] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i4++;
                            i6 = -1;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i13 = $10 + 123;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    byte[] bArr3 = component3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (-b6);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getLongPressTimeout() >> 16), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (61685 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1874745193, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) ShareDataUIState[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component2) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j)) + i7;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 36 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -1454191902, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component3;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i15 = $10 + 45;
                    $11 = i15 % 128;
                    int i16 = 2;
                    int i17 = i15 % 2;
                    int i18 = 0;
                    while (i18 < length3) {
                        int i19 = $11 + 25;
                        $10 = i19 % 128;
                        if (i19 % i16 != 0) {
                            bArr5[i18] = (byte) (((long) bArr4[i18]) * 7083766810336261929L);
                        } else {
                            bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 7083766810336261929L);
                            i18++;
                        }
                        i16 = 2;
                    }
                    int i20 = $11 + 87;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (!z) {
                        short[] sArr = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0979 A[PHI: r3
  0x0979: PHI (r3v177 int) = (r3v176 int), (r3v226 int) binds: [B:69:0x0977, B:66:0x096b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int ShareDataUIState(java.util.List r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.adapter.NotTabViewPagerAdapter.ShareDataUIState(java.util.List):int");
    }
}
