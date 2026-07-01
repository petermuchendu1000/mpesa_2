package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.signers.PSSSigner;

public class ChangeMsisdnActivity extends Hilt_ChangeMsisdnActivity<ChangeMsisdnViewModel> {
    private static short[] component1;
    private static final byte[] $$c = {96, -37, -4, -26};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {102, Ascii.FF, 98, 84, Ascii.DLE, 2, -59, 73, -14, 9, -1, Ascii.NAK, -5, -2, Ascii.DLE, 2, -59, 58, 5, Ascii.DC2, -6, 2, Ascii.VT, 9, 10, -2, 5, -11, Ascii.FF, -59, 57, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, 3, -65, 57, 9, 5, Ascii.VT, -62, Ascii.CAN, 35, Ascii.SYN, -10, -27, 39, 7, Ascii.FF, -11, 17, -43, 41, 5, Ascii.VT, -33, 45, -76, 4, 37, TarHeader.LF_CONTIG, 0, -11, 17, 0, -9, Ascii.SI, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, Ascii.EM, Ascii.DLE, -7, 6, 1, -45, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -62, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, Ascii.DLE, 2, -59, Base64.padSymbol, 6, Ascii.SI, -8, 17, -15, -48, 56, 3, Ascii.NAK, 6, -11, 10, Ascii.FF, -12, -49, 70, -8, 6, 20, -9, 0, Ascii.SYN, -14, 17, -64, 75, 3, -7, 7, -58, 38, Ascii.NAK, 10, 2, -14, Ascii.SUB, Ascii.NAK, -17, -30, 34, Ascii.SI, -5, Ascii.SYN, -5, -7, Ascii.ETB, -1, 7};
    private static final int $$n = 0;
    private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 174;
    private static int component4 = 0;
    private static int equals = 1;
    private static int component3 = -655492945;
    private static int ShareDataUIState = -238323916;
    private static int copydefault = -1495612868;
    private static byte[] component2 = {-29, -19, -31, Ascii.ETB, Ascii.RS, -63, -63, 88, -25, -94, 41, Ascii.CAN, Ascii.EM, Ascii.RS, -19, Ascii.NAK, -18, 125, -110, 90, -118, TarHeader.LF_BLK, -53, -60, Base64.padSymbol, 35, -20, TarHeader.LF_SYMLINK, 60, -60, 58, -62, 38, Ascii.NAK, 36, -119, TarHeader.LF_CONTIG, 56, 4, -3, -52, -51, -54, 57, -63, 58, -122, 127, -116, 106, -121, -125, -124, -123, 121, 86, -76, 127, 112, -118, 121, -124, 107, -96, -113, 112, -118, 116, 93, -118, 113, PSSSigner.TRAILER_IMPLICIT, -114, 113, 118, 88, -94, -120, SignedBytes.MAX_POWER_OF_TWO, -65, 119, -121, 119, 112, -115, 113, 92, -93, 90, -67, -113, 67, -93, -120, 68, -67, -114, 65, -65, 115, 92, -66, 112, 112, -113, -117, 115, -114, 92, 112, -115, -93, -117, 119, 95, -115, -114, -93, -113, -115, 114, -117, 67, -94, 92, -72, 7, -8, 1, 1, -9, Ascii.EM, -19, TarHeader.LF_BLK, -61, -19, 10, 1, -41, Ascii.GS, 19, -19, Ascii.RS, 17, Ascii.EM, -29, -63, Base64.padSymbol, -54, -32, Ascii.US, -63, 56, -56, TarHeader.LF_CHR, -17, -20, 114, -51, -120, 3, TarHeader.LF_SYMLINK, TarHeader.LF_CHR, TarHeader.LF_BLK, -57, 63, -60, 94, -94, 83, -82, -83, 90, -75, 72, 89, 84, -91, -87, 83, -95, -17, -35, -18, Ascii.SYN, 17, 58, -18, -59, 58, Ascii.DLE, -35, 62, 19, -62, 60, -35, 60, -33, 33, Ascii.DC2, -38, 17, 33, -62, -20, Ascii.DLE, 17, -21, 20, 58, -60, -24, 35, -36, 62, 17, -62, -18, -21, 17, 63, -18, -19, -60, 63, -34, Ascii.DLE, Base64.padSymbol, -36, 17, 17, 60, Ascii.DC2, -34, 62, -61, 57, Ascii.DLE, Ascii.DLE, -36, 35, -60, 60, 35, 36, -34, 34, -40, 36, -36, 34, -34, 39, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    private static long getRequestBeneficiariesState = -7404938269750504430L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = 116 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.$$c
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r8 = r8 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.$$a
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2b:
            int r8 = r8 + r6
            int r8 = r8 + (-8)
            int r6 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.d(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.$$m
            int r6 = r6 * 2
            int r6 = 99 - r6
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r6 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r0[r5]
        L29:
            int r5 = r5 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.e(short, int, byte, java.lang.Object[]):void");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(getRequestBeneficiariesState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 87;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(getRequestBeneficiariesState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 35, (char) (63440 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 1390, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 51270), -1883291598, false, $$i((byte) 13, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 31;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r27, byte r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.b(short, byte, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0131  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.onCreate(android.os.Bundle):void");
    }

    private void lambda$onCreate$0(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 113;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (!resource.loading()) {
            DialogManager.hideLoading(this);
            if (!resource.error()) {
                startActivity(new Intent(this, (Class<?>) ChangeMsisdnResultActivity.class));
                return;
            }
            ToastUtils.showLong(resource.getMessage());
            finish();
            int i4 = equals + 57;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i5 = component4 + 41;
        equals = i5 % 128;
        int i6 = i5 % 2;
        DialogManager.showLoading(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x017b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ae  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 15172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$FNoYOLLcvv96MeRkmF90qdK6GSs(ChangeMsisdnActivity changeMsisdnActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 37;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        changeMsisdnActivity.lambda$onCreate$0(resource);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 33;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 19;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }
}
