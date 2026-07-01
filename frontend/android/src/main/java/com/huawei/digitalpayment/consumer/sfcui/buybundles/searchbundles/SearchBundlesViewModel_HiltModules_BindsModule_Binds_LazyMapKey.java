package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import org.bouncycastle.crypto.signers.PSSSigner;

public final class SearchBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey {
    private static int ShareDataUIState;
    private static int component1;
    private static int component2;
    private static byte[] component3;
    private static short[] component4;
    static SearchBundlesViewModel copydefault;
    private static int equals;
    public static String lazyClassKeyName;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 72;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getAsAtTimestamp = 1;

    private static String $$c(short s, byte b2, byte b3) {
        int i = s + 112;
        int i2 = 3 - (b2 * 2);
        byte[] bArr = $$a;
        int i3 = b3 * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i3 + i2;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            int i6 = i2 + 1;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i += bArr[i6];
            i2 = i6;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r24, int r25, short r26, byte r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    static {
        equals = 0;
        component3();
        Object[] objArr = new Object[1];
        a((-980276828) - TextUtils.lastIndexOf("", '0'), (-16777174) - Color.rgb(0, 0, 0), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 98), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 782162220 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        lazyClassKeyName = ((String) objArr[0]).intern();
        int i = getAsAtTimestamp + 115;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component2 = -878272142;
        ShareDataUIState = -238323961;
        component1 = 548032543;
        component3 = new byte[]{-115, -73, -69, -106, 90, -122, -80, -103, -87, -126, -65, -116, -70, -65, -7, 94, -117, -89, -121, -80, -122, -21, 113, -126, -65, -116, -70, -65, -103, -66, -117, -89, -121, -80, -90, -53, 113, -126, -65, -116, -70, -65, -103, -81, -120, -103, -8, 75, -72, -122, -77, -71, -53, 112, -125, PSSSigner.TRAILER_IMPLICIT, PSSSigner.TRAILER_IMPLICIT, -74, -117, -75, -128, -5, 126, -118, -113, PSSSigner.TRAILER_IMPLICIT, -72, -100, -89, -120, -127, -93, -127, -74, -78, -117, -6, 75, -120, -94, -102, -96, -125, -2, 119, -78, -128, 41};
    }
}
