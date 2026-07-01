package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class WesternUnionViewModel_HiltModules_KeyModule_Provide_LazyMapKey {
    private static long ShareDataUIState;
    private static int component1;
    static WesternUnionViewModel copydefault;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$b = WSContextConstant.HANDSHAKE_RECEIVE_SIZE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 105 - r8
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.$$c(short, short, short):java.lang.String");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 125;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 3266, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, (char) (60268 - Drawable.resolveOpacity(0, 0)), -834797019, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() | ShareDataUIState | 5431355972723572778L;
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 687, 34 - TextUtils.getCapsMode("", 0, 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 60373), -1969106284, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3266, 32 - TextUtils.lastIndexOf("", '0'), (char) (60268 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -834797019, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 687, View.MeasureSpec.getMode(0) + 34, (char) (60373 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), -1969106284, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $10 + 1;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(735 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, (char) (60373 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), -1969106284, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        component1 = 1;
        component2();
        Object[] objArr = new Object[1];
        a(39631 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{63048, 27787, 50136, 9832, 40319, 61525, 22160, 52725, 8246, 34565, 64019, 20650, 47094, 10959, 33040, 58494, 23226, 45560, 5333, 35607, 61054, 17597, 48004, 7900, 30007, 59442, 20302, 42385, 6369, 32555, 53788, 18775, 44974, 758, 31099, 56341, 13137, 43427, 3263, 25551, 50691, 15721, 37806, 63119, 28120, 49188, 10102, 39496, 61594, 22488, 51819, 8545, 33858, 64131, 20981, 46135, 11025, 36434, 58552, 23536, 48838, 5399, 34919, 61172, 17852, 47297, 7942, 29298, 59570, 20370, 41695, 6423, 31869, 54085, 18834, 44256, 777, 26113, 56668, 13245, 38614, 3387, 24577, 51027, 15787}, objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = component2 + 51;
        component1 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        ShareDataUIState = 5593046625687926273L;
    }
}
