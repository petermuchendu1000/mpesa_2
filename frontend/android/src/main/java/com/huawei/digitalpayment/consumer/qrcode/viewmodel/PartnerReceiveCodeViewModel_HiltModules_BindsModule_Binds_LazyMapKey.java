package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class PartnerReceiveCodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static int copy;
    static PartnerReceiveCodeViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {2, 77, TarHeader.LF_CONTIG, -86};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;

    private static String $$c(byte b2, byte b3, short s) {
        int i = (b2 * 2) + 111;
        int i2 = b3 * 2;
        byte[] bArr = $$a;
        int i3 = s + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = i4 + i;
        }
        while (true) {
            i5++;
            i3++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i += bArr[i3];
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 121;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = 58224;
            int i10 = 0;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component3);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 32 - TextUtils.indexOf("", "", 0), (char) (23252 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 592652048, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.getOffsetBefore("", 0), 32 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23251), 592652048, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 464, 48 - TextUtils.lastIndexOf("", '0'), (char) TextUtils.indexOf("", ""), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        copy = 0;
        component2();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 79, new char[]{33459, 15077, 27297, 61619, 7645, 48790, 21518, 40962, 49367, 46521, 21325, 46295, 51750, 46986, 41952, 34805, 41082, 47014, 4505, 40735, 38596, 17222, 57466, 38807, 57835, 9769, 33459, 15077, 34212, 34367, 41471, 62608, 22714, 47124, 14448, 24327, 49174, 46001, 8238, 57994, 30025, 21545, 59039, 64448, 61333, 14369, 59229, 36679, 51594, 35562, 61617, 15217, 21805, 43073, 32675, 60107, 62164, 15056, 37155, 15917, 2057, 47444, 49367, 46521, 61515, 18603, 14622, 25452, 51594, 35562, 54312, 16565, 61333, 14369, 5731, 17616, 51594, 35562, 41371, 18832}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component4 + 61;
        copy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component1 = (char) 4827;
        ShareDataUIState = (char) 60141;
        component2 = (char) 25225;
        component3 = (char) 25152;
    }
}
